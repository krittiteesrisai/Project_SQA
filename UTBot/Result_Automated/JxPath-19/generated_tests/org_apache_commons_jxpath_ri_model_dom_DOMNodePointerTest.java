package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.ri.QName;
import com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.w3c.dom.Node;
import com.sun.imageio.plugins.tiff.TIFFFieldNode;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultElement;
import org.apache.commons.jxpath.JXPathException;
import java.util.Locale;
import com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy;
import com.sun.org.apache.xerces.internal.dom.DeferredAttrImpl;
import com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM;
import com.sun.org.apache.xerces.internal.impl.xs.opti.AttrImpl;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument;
import java.lang.reflect.Method;
import com.sun.org.apache.xerces.internal.dom.AttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import com.sun.org.apache.xerces.internal.dom.PSVIDocumentImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl;
import com.sun.org.apache.xerces.internal.impl.xs.opti.ElementImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import java.util.HashMap;
import org.apache.commons.jxpath.ri.model.NodePointer;
import java.util.Map;
import javax.imageio.plugins.tiff.TIFFField;
import com.sun.org.apache.xerces.internal.dom.DeferredProcessingInstructionImpl;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_jxpath_ri_model_dom_DOMNodePointerTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.executesCondition {@code (type == Node.ELEMENT_NODE): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_TypeEqualsNodeELEMENT_NODE() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "";
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        QName actual = dOMNodePointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(expected, "org.apache.commons.jxpath.ri.QName", "name", nodeName);
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", nodeName);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.executesCondition {@code (type == Node.ELEMENT_NODE): False}
 * @utbot.executesCondition {@code (type == Node.PROCESSING_INSTRUCTION_NODE): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ln = ((ProcessingInstruction) node).getTarget();
 *  */
    @Test
    public void testGetName_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 7);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(nodeImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = nodeImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        dOMNodePointer.getName();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = node.getNodeType();
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName(DOMNodePointer.java:183) */
        dOMNodePointer.getName();
    }
    ///endregion
    
    ///region Errors report for getName
    
    public void testGetName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 *  */
    @Test
    public void testRemove() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode parent = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode firstChild = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "lastChild", iIOMetadataNode);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "parent", parent);
        Object nextSibling = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nextSibling", nextSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        dOMNodePointer.remove();
        
        Node dOMNodePointerNode = ((Node) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        IIOMetadataNode finalDOMNodePointerNodeParent = ((IIOMetadataNode) getFieldValue(dOMNodePointerNode, "javax.imageio.metadata.IIOMetadataNode", "parent"));
        Node dOMNodePointerNode1 = ((Node) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        IIOMetadataNode finalDOMNodePointerNodeNextSibling = ((IIOMetadataNode) getFieldValue(dOMNodePointerNode1, "javax.imageio.metadata.IIOMetadataNode", "nextSibling"));
        
        assertNull(finalDOMNodePointerNodeParent);
        
        assertNull(finalDOMNodePointerNodeNextSibling);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 *  */
    @Test
    public void testRemove_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode parent = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(parent, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "firstChild", iIOMetadataNode);
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "lastChild", iIOMetadataNode);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "parent", parent);
        Object previousSibling = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        dOMNodePointer.remove();
        
        Node dOMNodePointerNode = ((Node) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        IIOMetadataNode finalDOMNodePointerNodeParent = ((IIOMetadataNode) getFieldValue(dOMNodePointerNode, "javax.imageio.metadata.IIOMetadataNode", "parent"));
        Node dOMNodePointerNode1 = ((Node) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        IIOMetadataNode finalDOMNodePointerNodePreviousSibling = ((IIOMetadataNode) getFieldValue(dOMNodePointerNode1, "javax.imageio.metadata.IIOMetadataNode", "previousSibling"));
        
        assertNull(finalDOMNodePointerNodeParent);
        
        assertNull(finalDOMNodePointerNodePreviousSibling);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 * @utbot.invokes {@link org.w3c.dom.Node#getParentNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = node.getParentNode();
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove(DOMNodePointer.java:479) */
        dOMNodePointer.remove();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: parent == null
 *  */
    @Test(expected = JXPathException.class)
    public void testRemove_ThrowJXPathException() {
        DefaultElement defaultElement = new DefaultElement();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultElement, null, null);
        
        dOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: parent == null
 *  */
    @Test(expected = JXPathException.class)
    public void testRemove_ThrowJXPathException_1() throws Exception  {
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class iIOAttrType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(iIOAttrType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = iIOAttr;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        dOMNodePointer.remove();
    }
    ///endregion
    
    ///region Errors report for remove
    
    public void testRemove_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return object == this || object instanceof DOMNodePointer && node == ((DOMNodePointer) object).node;}
 *  */
    @Test
    public void testEquals_ObjectEqualsOrObjectNotInstanceOfDOMNodePointerAndNodeEqualsDOMNodePointerobjectNode_1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        boolean actual = dOMNodePointer.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return object == this || object instanceof DOMNodePointer && node == ((DOMNodePointer) object).node;}
 *  */
    @Test
    public void testEquals_ObjectEqualsOrObjectNotInstanceOfDOMNodePointerAndNodeEqualsDOMNodePointerobjectNode() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        boolean actual = dOMNodePointer.equals(dOMNodePointer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return object == this || object instanceof DOMNodePointer && node == ((DOMNodePointer) object).node;}
 *  */
    @Test
    public void testEquals_ObjectEqualsOrObjectInstanceOfDOMNodePointerAndNodeEqualsDOMNodePointerobjectNode() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(null, null, null);
        
        boolean actual = dOMNodePointer.equals(dOMNodePointer1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.returnsFrom {@code return node.hashCode();}
 *  */
    @Test
    public void testHashCode_ObjectHashCode() {
        DTMNodeProxy dTMNodeProxy = new DTMNodeProxy(null, 0);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(dTMNodeProxy, null, null);
        
        int actual = dOMNodePointer.hashCode();
        
        assertEquals(5887, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return node.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode(DOMNodePointer.java:624) */
        dOMNodePointer.hashCode();
    }
    ///endregion
    
    ///region Errors report for hashCode
    
    public void testHashCode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLength()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLength()}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGetLength_Return1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        int actual = dOMNodePointer.getLength();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region Errors report for getLength
    
    public void testGetLength_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.COMMENT_NODE): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)
 * @utbot.returnsFrom {@code return stringValue(node);}
 *  */
    @Test
    public void testGetValue_NodeGetNodeTypeNotEqualsNodeCOMMENT_NODE() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 4);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(nodeImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = nodeImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        String actual = ((String) dOMNodePointer.getValue());
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.COMMENT_NODE): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String text = ((Comment) node).getData();
 *  */
    @Test
    public void testGetValue_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 8);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(nodeImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = nodeImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Comment] */
        dOMNodePointer.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.COMMENT_NODE): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return stringValue(node);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 1);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(nodeImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = nodeImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        dOMNodePointer.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.COMMENT_NODE): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return stringValue(node);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 7);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(nodeImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = nodeImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        dOMNodePointer.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getNodeType() == Node.COMMENT_NODE
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue(DOMNodePointer.java:697) */
        dOMNodePointer.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.COMMENT_NODE): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return stringValue(node);
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, java.lang.Short.MIN_VALUE);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(nodeImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = nodeImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue] produces [java.lang.NullPointerException] */
        dOMNodePointer.getValue();
    }
    ///endregion
    
    ///region Errors report for getValue
    
    public void testGetValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (value instanceof Node): True}
 * @utbot.executesCondition {@code (valueNode instanceof Element || valueNode instanceof Document): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getChildNodes()}
 * @utbot.invokes {@link org.w3c.dom.NodeList#getLength()}
 * @utbot.invokes {@link org.w3c.dom.Node#getChildNodes()}
 *  */
    @Test
    public void testSetValue_ValueNodeNotInstanceOfElementOrValueNodeNotInstanceOfDocument() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        
        dOMNodePointer.setValue(iIOAttr);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (value instanceof Node): True}
 * @utbot.executesCondition {@code (valueNode instanceof Element || valueNode instanceof Document): True}
 * @utbot.executesCondition {@code (if (valueNode instanceof Element || valueNode instanceof Document) {
 *     children = valueNode.getChildNodes();
 *     for (int i = 0; i < children.getLength(); i++) {
 *         Node child = children.item(i);
 *         node.appendChild(child.cloneNode(true));
 *     }
 * } else {
 *     node.appendChild(valueNode.cloneNode(true));
 * }): False}
 * @utbot.invokes {@link org.w3c.dom.Node#cloneNode(boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: node.appendChild(valueNode.cloneNode(true));
 *  */
    @Test
    public void testSetValue_ThrowClassCastException() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        DeferredAttrImpl deferredAttrImpl = ((DeferredAttrImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrImpl"));
        setField(deferredAttrImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to com.sun.org.apache.xerces.internal.dom.NodeImpl] */
        dOMNodePointer.setValue(deferredAttrImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (value instanceof Node): True}
 * @utbot.executesCondition {@code (valueNode instanceof Element || valueNode instanceof Document): True}
 * @utbot.executesCondition {@code (if (valueNode instanceof Element || valueNode instanceof Document) {
 *     children = valueNode.getChildNodes();
 *     for (int i = 0; i < children.getLength(); i++) {
 *         Node child = children.item(i);
 *         node.appendChild(child.cloneNode(true));
 *     }
 * } else {
 *     node.appendChild(valueNode.cloneNode(true));
 * }): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getChildNodes()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < children.getLength(); i++)
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue] produces [java.lang.NullPointerException] */
        dOMNodePointer.setValue(schemaDOM);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#setValue(java.lang.Object)}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getNodeType() == Node.TEXT_NODE || node.getNodeType() == Node.CDATA_SECTION_NODE
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(DOMNodePointer.java:372) */
        dOMNodePointer.setValue(null);
    }
    ///endregion
    
    ///region Errors report for setValue
    
    public void testSetValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.returnsFrom {@code return findEnclosingAttribute(node, "xml:lang");}
 *  */
    @Test
    public void testGetLanguage_ReturnFindEnclosingAttribute() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        String actual = dOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.returnsFrom {@code return findEnclosingAttribute(node, "xml:lang");}
 *  */
    @Test
    public void testGetLanguage_ReturnFindEnclosingAttribute_1() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        
        String actual = dOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#findEnclosingAttribute(org.w3c.dom.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return findEnclosingAttribute(node, "xml:lang");
 *  */
    @Test
    public void testGetLanguage_ThrowClassCastException() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 1);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        dOMNodePointer.getLanguage();
    }
    ///endregion
    
    ///region Errors report for getLanguage
    
    public void testGetLanguage_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringValue(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (nodeType == Node.COMMENT_NODE): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testStringValue_NodeTypeEqualsNodeCOMMENT_NODE() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 8);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class defaultDocumentType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", defaultDocumentType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = defaultDocument;
        String actual = ((String) stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (nodeType == Node.COMMENT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.TEXT_NODE): True}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.returnsFrom {@code return text == null ? "" : trim ? text.trim() : text;}
 *  */
    @Test
    public void testStringValue_NodeTypeEqualsNodeTEXT_NODE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 3);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", nodeImplType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = nodeImpl;
        String actual = ((String) stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (nodeType == Node.COMMENT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.CDATA_SECTION_NODE): True}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.returnsFrom {@code return text == null ? "" : trim ? text.trim() : text;}
 *  */
    @Test
    public void testStringValue_NodeTypeEqualsNodeCDATA_SECTION_NODE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 4);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", nodeImplType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = nodeImpl;
        String actual = ((String) stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stringValue(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (nodeType == Node.COMMENT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.PROCESSING_INSTRUCTION_NODE): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String text = ((ProcessingInstruction) node).getData();
 *  */
    @Test
    public void testStringValue_ThrowClassCastException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 7);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", nodeImplType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = nodeImpl;
        try {
            stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (nodeType == Node.COMMENT_NODE): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: boolean trim = !"preserve".equals(findEnclosingAttribute(node, "xml:space"));
 *  */
    @Test
    public void testStringValue_ThrowClassCastException_1() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class attrImplType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", attrImplType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = attrImpl;
        try {
            stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nodeType = node.getNodeType();
 *  */
    @Test
    public void testStringValue_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(DOMNodePointer.java:710) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", nodeType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = ((Object) null);
        try {
            stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for stringValue
    
    public void testStringValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLeaf()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.returnsFrom {@code return !node.hasChildNodes();}
 *  */
    @Test
    public void testIsLeaf_ReturnNotNodeHasChildNodes() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "numChildren", 1);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        boolean actual = dOMNodePointer.isLeaf();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.returnsFrom {@code return !node.hasChildNodes();}
 *  */
    @Test
    public void testIsLeaf_ReturnNotNodeHasChildNodes_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        boolean actual = dOMNodePointer.isLeaf();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.returnsFrom {@code return !node.hasChildNodes();}
 *  */
    @Test
    public void testIsLeaf_ReturnNotNodeHasChildNodes_2() {
        DefaultDocument defaultDocument = new DefaultDocument();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
        boolean actual = dOMNodePointer.isLeaf();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.returnsFrom {@code return !node.hasChildNodes();}
 *  */
    @Test
    public void testIsLeaf_ReturnNotNodeHasChildNodes_3() throws Exception  {
        AttrNSImpl attrNSImpl = ((AttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.AttrNSImpl"));
        setField(attrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class attrNSImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(attrNSImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = attrNSImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        boolean actual = dOMNodePointer.isLeaf();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.returnsFrom {@code return !node.hasChildNodes();}
 *  */
    @Test
    public void testIsLeaf_ReturnNotNodeHasChildNodes_4() throws Exception  {
        PSVIAttrNSImpl pSVIAttrNSImpl = ((PSVIAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl"));
        setField(pSVIAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class pSVIAttrNSImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(pSVIAttrNSImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = pSVIAttrNSImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        boolean actual = dOMNodePointer.isLeaf();
        
        assertTrue(actual);
        
        Node dOMNodePointerNode = ((Node) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        short finalDOMNodePointerNodeFlags = ((Short) getFieldValue(dOMNodePointerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags"));
        
        assertEquals((short) 0, finalDOMNodePointerNodeFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLeaf()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIsLeaf_ThrowClassCastException() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        PSVIAttrNSImpl ownerNode = ((PSVIAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredAttrNSImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.NodeImpl can not be casted to com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl] */
        dOMNodePointer.isLeaf();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return !node.hasChildNodes();
 *  */
    @Test
    public void testIsLeaf_ThrowClassCastException_1() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DocumentImpl ownerNode = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        PSVIDocumentImpl ownerDocument = ((PSVIDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.PSVIDocumentImpl"));
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 12);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredAttrNSImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        dOMNodePointer.isLeaf();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsLeaf_ThrowIndexOutOfBoundsException() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", 1073741824);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeLastChild = {null};
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeLastChild", fNodeLastChild);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredAttrNSImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        dOMNodePointer.isLeaf();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !node.hasChildNodes();
 *  */
    @Test
    public void testIsLeaf_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf(DOMNodePointer.java:319) */
        dOMNodePointer.isLeaf();
    }
    ///endregion
    
    ///region Errors report for isLeaf
    
    public void testIsLeaf_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLanguage(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLanguage(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String current = getLanguage();
 *  */
    @Test
    public void testIsLanguage_ThrowClassCastException() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 1);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        dOMNodePointer.isLanguage(null);
    }
    ///endregion
    
    ///region Errors report for isLanguage
    
    public void testIsLanguage_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asPath()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.activatesSwitch {@code switch(node.getNodeType())}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_SwitchNodeGetNodeType() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        ElementImpl elementImpl = new ElementImpl(null, null, null, null, 0, 0, 0);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(elementImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = elementImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        String actual = dOMNodePointer.asPath();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.activatesSwitch {@code switch(node.getNodeType()) case: Node.DOCUMENT_NODE}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_SwitchNodeGetNodeTypeCaseNodeDOCUMENT_NODE() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        ElementImpl elementImpl = new ElementImpl(null, null, null, null, 0, 0, 0);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(elementImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = elementImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        String actual = dOMNodePointer.asPath();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.activatesSwitch {@code switch(node.getNodeType())}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_SwitchNodeGetNodeType_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        ElementImpl elementImpl = new ElementImpl(null, null, null, null, 0, 0, 0);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(elementImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = elementImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        String actual = dOMNodePointer.asPath();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.activatesSwitch {@code switch(node.getNodeType())}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_SwitchNodeGetNodeType_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        ElementImpl elementImpl = new ElementImpl(null, null, null, null, 0, 0, 0);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(elementImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = elementImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        String actual = dOMNodePointer.asPath();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asPath()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.executesCondition {@code (id != null): False}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(node.getNodeType())
 *  */
    @Test
    public void testAsPath_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495) */
        dOMNodePointer.asPath();
    }
    ///endregion
    
    ///region Errors report for asPath
    
    public void testAsPath_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getPrefix(org.w3c.dom.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.w3c.dom.Node#getPrefix()} once
    /// execute conditions:
    ///     {@code (prefix != null): False}
    /// invoke:
    ///     {@link org.w3c.dom.Node#getNodeName()} once,
    ///     {@link java.lang.String#lastIndexOf(int)} once
    /// return from: {@code return index < 0 ? null : name.substring(0, index);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return index < 0 ? null : name.substring(0, index);}
 *  */
    @Test
    public void testGetPrefix_IndexGreaterOrEqualZero() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        String nodeName = ":";
        setField(tIFFFieldNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Method getPrefixMethod = dOMNodePointerClazz.getDeclaredMethod("getPrefix", tIFFFieldNodeType);
        getPrefixMethod.setAccessible(true);
        java.lang.Object[] getPrefixMethodArguments = new java.lang.Object[1];
        getPrefixMethodArguments[0] = tIFFFieldNode;
        String actual = ((String) getPrefixMethod.invoke(null, getPrefixMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return index < 0 ? null : name.substring(0, index);}
 *  */
    @Test
    public void testGetPrefix_IndexLessThanZero() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        String nodeName = "";
        setField(tIFFFieldNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Method getPrefixMethod = dOMNodePointerClazz.getDeclaredMethod("getPrefix", tIFFFieldNodeType);
        getPrefixMethod.setAccessible(true);
        java.lang.Object[] getPrefixMethodArguments = new java.lang.Object[1];
        getPrefixMethodArguments[0] = tIFFFieldNode;
        String actual = ((String) getPrefixMethod.invoke(null, getPrefixMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return index < 0 ? null : name.substring(0, index);}
 *  */
    @Test
    public void testGetPrefix_IndexLessThanZero_1() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        String rawname = "";
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "rawname", rawname);
        
        String actual = DOMNodePointer.getPrefix(defaultDocument);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getPrefix(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (prefix != null): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getPrefix()}
 * @utbot.returnsFrom {@code return prefix;}
 *  */
    @Test
    public void testGetPrefix_PrefixNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        NodeImpl nodeImpl = new NodeImpl(string, null, null, null, (short) 0);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Method getPrefixMethod = dOMNodePointerClazz.getDeclaredMethod("getPrefix", nodeImplType);
        getPrefixMethod.setAccessible(true);
        java.lang.Object[] getPrefixMethodArguments = new java.lang.Object[1];
        getPrefixMethodArguments[0] = nodeImpl;
        String actual = ((String) getPrefixMethod.invoke(null, getPrefixMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPrefix(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.invokes {@link org.w3c.dom.Node#getPrefix()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String prefix = node.getPrefix();
 *  */
    @Test
    public void testGetPrefix_ThrowClassCastException() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        DocumentImpl ownerDocument = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        DOMNodePointer.getPrefix(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.invokes {@link org.w3c.dom.Node#getPrefix()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prefix = node.getPrefix();
 *  */
    @Test
    public void testGetPrefix_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(DOMNodePointer.java:637) */
        DOMNodePointer.getPrefix(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 *  */
    @Test
    public void testCompareChildNodePointers_Node1EqualsNode2() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(nullPointer, nullPointer);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node node1 = (Node) pointer1.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:748) */
        dOMNodePointer.compareChildNodePointers(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node node2 = (Node) pointer2.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:749) */
        dOMNodePointer.compareChildNodePointers(nullPointer, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: Node node2 = (Node) pointer2.getBaseValue();
 *  */
    @Test(expected = JXPathException.class)
    public void testCompareChildNodePointers_ThrowJXPathException() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        VariablePointer variablePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        
        dOMNodePointer.compareChildNodePointers(nullPointer, variablePointer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByQName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionByQName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByQName()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByQName_ReturnCount() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByQNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByQNameMethod.invoke(dOMNodePointer, getRelativePositionByQNameMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByQName()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByQName_NGetNodeTypeNotEqualsNodeELEMENT_NODE() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        Object previousSibling = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByQNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByQNameMethod.invoke(dOMNodePointer, getRelativePositionByQNameMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByQName()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByQName_NmEquals() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "";
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByQNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByQNameMethod.invoke(dOMNodePointer, getRelativePositionByQNameMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByQName()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByQName_NotNmEquals() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "";
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByQNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByQNameMethod.invoke(dOMNodePointer, getRelativePositionByQNameMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionByQName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByQName()}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = node.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionByQName_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByQName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByQName(DOMNodePointer.java:558) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByQNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByQNameMethod.invoke(dOMNodePointer, getRelativePositionByQNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getRelativePositionByQName
    
    public void testGetRelativePositionByQName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#findEnclosingAttribute(org.w3c.dom.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindEnclosingAttribute_ReturnNull() {
        String actual = DOMNodePointer.findEnclosingAttribute(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#findEnclosingAttribute(org.w3c.dom.Node,java.lang.String)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindEnclosingAttribute_NGetNodeTypeNotEqualsNodeELEMENT_NODE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, java.lang.Short.MIN_VALUE);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class stringType = Class.forName("java.lang.String");
        Method findEnclosingAttributeMethod = dOMNodePointerClazz.getDeclaredMethod("findEnclosingAttribute", nodeImplType, stringType);
        findEnclosingAttributeMethod.setAccessible(true);
        java.lang.Object[] findEnclosingAttributeMethodArguments = new java.lang.Object[2];
        findEnclosingAttributeMethodArguments[0] = nodeImpl;
        findEnclosingAttributeMethodArguments[1] = ((Object) null);
        String actual = ((String) findEnclosingAttributeMethod.invoke(null, findEnclosingAttributeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnclosingAttribute(org.w3c.dom.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#findEnclosingAttribute(org.w3c.dom.Node,java.lang.String)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element e = (Element) n;
 *  */
    @Test
    public void testFindEnclosingAttribute_ThrowClassCastException() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        DOMNodePointer.findEnclosingAttribute(defaultDocument, null);
    }
    ///endregion
    
    ///region Errors report for findEnclosingAttribute
    
    public void testFindEnclosingAttribute_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNamespaceResolver()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceResolver()}
 * @utbot.executesCondition {@code (localNamespaceResolver == null): False}
 * @utbot.returnsFrom {@code return localNamespaceResolver;}
 *  */
    @Test
    public void testGetNamespaceResolver_LocalNamespaceResolverNotEqualsNull() throws Exception  {
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        NamespaceResolver localNamespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver", localNamespaceResolver);
        
        NamespaceResolver actual = dOMNodePointer.getNamespaceResolver();
        
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
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceResolver()}
 * @utbot.executesCondition {@code (localNamespaceResolver == null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getNamespaceResolver()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.NamespaceResolver#setNamespaceContextPointer(org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.returnsFrom {@code return localNamespaceResolver;}
 *  */
    @Test
    public void testGetNamespaceResolver_LocalNamespaceResolverEqualsNull() throws Exception  {
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        dOMNodePointer.setNamespaceResolver(namespaceResolver);
        
        NamespaceResolver initialDOMNodePointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
        
        NamespaceResolver actual = dOMNodePointer.getNamespaceResolver();
        
        NamespaceResolver expected = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", namespaceResolver);
        HashMap namespaceMap = new HashMap();
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        HashMap reverseMap = new HashMap();
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap", reverseMap);
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer", dOMNodePointer);
        
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
        Node actualPointerNode = ((Node) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        assertNull(actualPointerNode);
        
        Map actualPointerNamespaces = ((Map) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaces"));
        assertNull(actualPointerNamespaces);
        
        String actualPointerDefaultNamespace = ((String) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace"));
        assertNull(actualPointerDefaultNamespace);
        
        String actualPointerId = ((String) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "id"));
        assertNull(actualPointerId);
        
        NamespaceResolver expectedPointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(expectedPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
        NamespaceResolver actualPointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
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
        
        NamespaceResolver finalDOMNodePointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
        
        assertFalse(initialDOMNodePointerLocalNamespaceResolver == finalDOMNodePointerLocalNamespaceResolver);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNamespaceResolver()
    
    @Test
    public void testGetNamespaceResolver1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        NamespaceResolver initialDOMNodePointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
        
        NamespaceResolver actual = dOMNodePointer.getNamespaceResolver();
        
        NamespaceResolver expected = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        HashMap reverseMap = new HashMap();
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap", reverseMap);
        DOMNodePointer pointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(pointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver", expected);
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
        Node actualPointerNode = ((Node) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        assertNull(actualPointerNode);
        
        Map actualPointerNamespaces = ((Map) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaces"));
        assertNull(actualPointerNamespaces);
        
        String actualPointerDefaultNamespace = ((String) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace"));
        assertNull(actualPointerDefaultNamespace);
        
        String actualPointerId = ((String) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "id"));
        assertNull(actualPointerId);
        
        NamespaceResolver expectedPointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(expectedPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
        NamespaceResolver actualPointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
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
        
        NamespaceResolver finalDOMNodePointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
        
        assertFalse(initialDOMNodePointerLocalNamespaceResolver == finalDOMNodePointerLocalNamespaceResolver);
    }
    ///endregion
    
    ///region Errors report for getNamespaceResolver
    
    public void testGetNamespaceResolver_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfElement()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ReturnCount() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultElement defaultElement = new DefaultElement();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultElement, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfElementMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(dOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ReturnCount_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfElementMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(dOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ReturnCount_2() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfElementMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(dOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ReturnCount_3() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        Object previousSibling = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfElementMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(dOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ReturnCount_4() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfElementMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(dOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionOfElement()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = n.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionOfElement_ThrowClassCastException() throws Throwable  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isIFD", true);
        Boolean isInitialized = false;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        int[] data = {};
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "data", data);
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.imageio.plugins.tiff.TIFFDirectory] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfElementMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfElementMethod.invoke(dOMNodePointer, getRelativePositionOfElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = node.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionOfElement_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement(DOMNodePointer.java:578) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfElementMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfElementMethod.invoke(dOMNodePointer, getRelativePositionOfElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getRelativePositionOfElement
    
    public void testGetRelativePositionOfElement_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfTextNode()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ReturnCount() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultElement defaultElement = new DefaultElement();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultElement, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(dOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ReturnCount_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(dOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ReturnCount_2() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(dOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ReturnCount_3() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        Object previousSibling = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(dOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ReturnCount_4() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(dOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionOfTextNode()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = n.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ThrowClassCastException() throws Throwable  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isIFD", true);
        Boolean isInitialized = false;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        byte[] data = {};
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "data", data);
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.imageio.plugins.tiff.TIFFDirectory] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfTextNodeMethod.invoke(dOMNodePointer, getRelativePositionOfTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = node.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode(DOMNodePointer.java:594) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfTextNodeMethod.invoke(dOMNodePointer, getRelativePositionOfTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getRelativePositionOfTextNode
    
    public void testGetRelativePositionOfTextNode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultNamespaceURI()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (defaultNamespace.equals("")): True}
 * @utbot.returnsFrom {@code return defaultNamespace.equals("") ? null : defaultNamespace;}
 *  */
    @Test
    public void testGetDefaultNamespaceURI_DefaultNamespaceEquals() throws Exception  {
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        String defaultNamespace = "";
        setField(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace", defaultNamespace);
        
        String actual = dOMNodePointer.getDefaultNamespaceURI();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (defaultNamespace.equals("")): False}
 * @utbot.returnsFrom {@code return defaultNamespace.equals("") ? null : defaultNamespace;}
 *  */
    @Test
    public void testGetDefaultNamespaceURI_NotDefaultNamespaceEquals() throws Exception  {
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        String defaultNamespace = "\u0000";
        setField(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace", defaultNamespace);
        
        String actual = dOMNodePointer.getDefaultNamespaceURI();
        
        assertEquals(defaultNamespace, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefaultNamespaceURI()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (defaultNamespace == null): True}
 * @utbot.executesCondition {@code (aNode instanceof Document): False}
 * @utbot.iterates iterate the loop {@code while(aNode != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Attr attr = ((Element) aNode).getAttributeNode("xmlns");
 *  */
    @Test
    public void testGetDefaultNamespaceURI_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 1);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(nodeImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = nodeImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        dOMNodePointer.getDefaultNamespaceURI();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDefaultNamespaceURI()
    
    @Test
    public void testGetDefaultNamespaceURI1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        String actual = dOMNodePointer.getDefaultNamespaceURI();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getDefaultNamespaceURI
    
    public void testGetDefaultNamespaceURI_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionOfPI()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI()}
 * @utbot.invokes {@link org.w3c.dom.ProcessingInstruction#getTarget()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String target = ((ProcessingInstruction) node).getTarget();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowClassCastException() throws Throwable  {
        DeferredProcessingInstructionImpl deferredProcessingInstructionImpl = ((DeferredProcessingInstructionImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredProcessingInstructionImpl"));
        DocumentImpl ownerNode = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(deferredProcessingInstructionImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredProcessingInstructionImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredProcessingInstructionImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfPIMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfPIMethod.invoke(dOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI()}
 * @utbot.invokes {@link org.w3c.dom.ProcessingInstruction#getTarget()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String target = ((ProcessingInstruction) node).getTarget();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(DOMNodePointer.java:611) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionOfPIMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfPIMethod.invoke(dOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getRelativePositionOfPI
    
    public void testGetRelativePositionOfPI_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCollection()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isCollection()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsCollection_ReturnFalse() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        boolean actual = dOMNodePointer.isCollection();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region Errors report for isCollection
    
    public void testIsCollection_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method testNode(org.w3c.dom.Node, org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): True}
 *  */
    @Test
    public void testTestNode_TestEqualsNull() {
        boolean actual = DOMNodePointer.testNode(null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): False}
 * @utbot.executesCondition {@code (test instanceof ProcessingInstructionTest): True}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 *  */
    @Test
    public void testTestNode_NodeGetNodeTypeNotEqualsNodePROCESSING_INSTRUCTION_NODE() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        boolean actual = DOMNodePointer.testNode(attrImpl, processingInstructionTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): True}
 * @utbot.executesCondition {@code (node.getNodeType() != Node.ELEMENT_NODE): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 *  */
    @Test
    public void testTestNode_NodeGetNodeTypeNotEqualsNodeELEMENT_NODE() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        NodeNameTest nodeNameTest = new NodeNameTest(null);
        
        boolean actual = DOMNodePointer.testNode(attrImpl, nodeNameTest);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testNode(org.w3c.dom.Node, org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): False}
 * @utbot.executesCondition {@code (test instanceof ProcessingInstructionTest): True}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest#getTarget()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String nodePI = ((ProcessingInstruction) node).getTarget();
 *  */
    @Test
    public void testTestNode_ThrowClassCastException() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        DOMNodePointer.testNode(attrImpl, processingInstructionTest);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nodeType = node.getNodeType();
 *  */
    @Test
    public void testTestNode_ThrowNullPointerException_2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(DOMNodePointer.java:141) */
        DOMNodePointer.testNode(null, nodeTypeTest);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): False}
 * @utbot.executesCondition {@code (test instanceof ProcessingInstructionTest): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE
 *  */
    @Test
    public void testTestNode_ThrowNullPointerException() {
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(DOMNodePointer.java:157) */
        DOMNodePointer.testNode(null, processingInstructionTest);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getNodeType() != Node.ELEMENT_NODE
 *  */
    @Test
    public void testTestNode_ThrowNullPointerException_1() {
        NodeNameTest nodeNameTest = new NodeNameTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(DOMNodePointer.java:119) */
        DOMNodePointer.testNode(null, nodeNameTest);
    }
    ///endregion
    
    ///region Errors report for testNode
    
    public void testTestNode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        boolean actual = dOMNodePointer.testNode(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_1() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        
        boolean actual = dOMNodePointer.testNode(nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_2() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(3);
        
        boolean actual = dOMNodePointer.testNode(nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_3() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(4);
        
        boolean actual = dOMNodePointer.testNode(nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_4() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        
        boolean actual = dOMNodePointer.testNode(nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_5() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        NodeNameTest nodeNameTest = new NodeNameTest(null);
        
        boolean actual = dOMNodePointer.testNode(nodeNameTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_6() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        boolean actual = dOMNodePointer.testNode(processingInstructionTest);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return testNode(node, test);
 *  */
    @Test
    public void testTestNode_ThrowClassCastException1() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        dOMNodePointer.testNode(processingInstructionTest);
    }
    ///endregion
    
    ///region Errors report for testNode
    
    public void testTestNode_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getImmediateNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImmediateNode()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getImmediateNode()}
 * @utbot.returnsFrom {@code return node;}
 *  */
    @Test
    public void testGetImmediateNode_ReturnNode() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        Object actual = dOMNodePointer.getImmediateNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getImmediateNode
    
    public void testGetImmediateNode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:445) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:445) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_2() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:445) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        Object object = new Object();
        
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild2() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        Object object = new Object();
        
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    
    @Test
    public void testCreateChild3() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext1 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext2 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext3 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext4 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext5 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext6 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext7 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext8 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext9 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext10 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext11 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext10, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext11);
        setField(parentContext9, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext10);
        setField(parentContext8, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext9);
        setField(parentContext7, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext8);
        setField(parentContext6, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext7);
        setField(parentContext5, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext6);
        setField(parentContext4, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext5);
        setField(parentContext3, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext4);
        setField(parentContext2, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext3);
        setField(parentContext1, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext2);
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext1);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:445) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE, object);
    }
    
    @Test
    public void testCreateChild4() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext1 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext2 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext3 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext4 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext5 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext6 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext7 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext8 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext9 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext10 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext11 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext12 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext11, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext12);
        setField(parentContext10, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext11);
        setField(parentContext9, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext10);
        setField(parentContext8, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext9);
        setField(parentContext7, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext8);
        setField(parentContext6, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext7);
        setField(parentContext5, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext6);
        setField(parentContext4, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext5);
        setField(parentContext3, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext4);
        setField(parentContext2, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext3);
        setField(parentContext1, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext2);
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext1);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:445) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    ///endregion
    
    ///region Errors report for createChild
    
    public void testCreateChild_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_11() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_21() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild5() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE);
    }
    
    @Test
    public void testCreateChild6() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext1 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext2 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext3 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext4 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext5 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext6 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext7 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext8 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext9 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext10 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext11 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext12 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext11, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext12);
        setField(parentContext10, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext11);
        setField(parentContext9, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext10);
        setField(parentContext8, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext9);
        setField(parentContext7, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext8);
        setField(parentContext6, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext7);
        setField(parentContext5, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext6);
        setField(parentContext4, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext5);
        setField(parentContext3, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext4);
        setField(parentContext2, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext3);
        setField(parentContext1, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext2);
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext1);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, 0);
    }
    
    @Test
    public void testCreateChild7() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext1 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext2 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext3 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext4 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext5 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext6 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext7 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext8 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext9 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext10 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext11 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext12 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext13 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext14 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext13, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext14);
        setField(parentContext12, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext13);
        setField(parentContext11, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext12);
        setField(parentContext10, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext11);
        setField(parentContext9, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext10);
        setField(parentContext8, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext9);
        setField(parentContext7, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext8);
        setField(parentContext6, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext7);
        setField(parentContext5, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext6);
        setField(parentContext4, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext5);
        setField(parentContext3, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext4);
        setField(parentContext2, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext3);
        setField(parentContext1, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext2);
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext1);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:853)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:420) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region Errors report for createChild
    
    public void testCreateChild_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isActual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isActual()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isActual()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsActual_ReturnTrue() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        boolean actual = dOMNodePointer.isActual();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region Errors report for isActual
    
    public void testIsActual_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespacePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method namespacePointer(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#namespacePointer(java.lang.String)}
 * @utbot.returnsFrom {@code return new NamespacePointer(this, prefix);}
 *  */
    @Test
    public void testNamespacePointer_Return() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        NamespacePointer actual = ((NamespacePointer) dOMNodePointer.namespacePointer(null));
        
        NamespacePointer expected = ((NamespacePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        expected.setIndex(Integer.MIN_VALUE);
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        // org.apache.commons.jxpath.ri.model.dom.NamespacePointer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for namespacePointer
    
    public void testNamespacePointer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method namespaceIterator()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#namespaceIterator()}
 * @utbot.returnsFrom {@code return new DOMNamespaceIterator(this);}
 *  */
    @Test
    public void testNamespaceIterator_Return() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        ArrayList attributes = new ArrayList();
        setField(tIFFFieldNode, "javax.imageio.metadata.IIOMetadataNode", "attributes", attributes);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(tIFFFieldNodeType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = tIFFFieldNode;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        DOMNamespaceIterator actual = ((DOMNamespaceIterator) dOMNodePointer.namespaceIterator());
        
        DOMNamespaceIterator expected = ((DOMNamespaceIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node", tIFFFieldNode);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", "parent", parent);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", "attributes", attributes);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", "parent"));
        Node expectedParentNode = ((Node) getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        Node actualParentNode = ((Node) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        IIOMetadataNode actualParentNodeParent = ((IIOMetadataNode) getFieldValue(actualParentNode, "javax.imageio.metadata.IIOMetadataNode", "parent"));
        assertNull(actualParentNodeParent);
        
        List expectedParentNodeAttributes = ((List) getFieldValue(expectedParentNode, "javax.imageio.metadata.IIOMetadataNode", "attributes"));
        List actualParentNodeAttributes = ((List) getFieldValue(actualParentNode, "javax.imageio.metadata.IIOMetadataNode", "attributes"));
        assertTrue(deepEquals(expectedParentNodeAttributes, actualParentNodeAttributes));
        
        List expectedAttributes = ((List) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", "attributes"));
        List actualAttributes = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method namespaceIterator()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#namespaceIterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new DOMNamespaceIterator(this);
 *  */
    @Test
    public void testNamespaceIterator_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.collectNamespaces(DOMNamespaceIterator.java:56)
            org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.<init>(DOMNamespaceIterator.java:47)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator(DOMNodePointer.java:212) */
        dOMNodePointer.namespaceIterator();
    }
    ///endregion
    
    ///region Errors report for namespaceIterator
    
    public void testNamespaceIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.returnsFrom {@code return new DOMNodeIterator(this, test, reverse, startWith);}
 *  */
    @Test
    public void testChildIterator_Return() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(null, false, null));
        
        DOMNodeIterator expected = ((DOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent", parent);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent"));
        Node actualParentNode = ((Node) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        assertNull(actualParentNode);
        
        Map actualParentNamespaces = ((Map) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaces"));
        assertNull(actualParentNamespaces);
        
        String actualParentDefaultNamespace = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace"));
        assertNull(actualParentDefaultNamespace);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "id"));
        assertNull(actualParentId);
        
        NamespaceResolver actualParentLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
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
        
        NodeTest actualNodeTest = ((NodeTest) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest"));
        assertNull(actualNodeTest);
        
        Node actualNode = ((Node) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "node"));
        assertNull(actualNode);
        
        Node actualChild = ((Node) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "child"));
        assertNull(actualChild);
        
        boolean actualReverse = ((Boolean) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "reverse"));
        assertFalse(actualReverse);
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test
    public void testChildIterator1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        
        DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(nodeTypeTest, false, nullPropertyPointer));
        
        DOMNodeIterator expected = ((DOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent", parent);
        NodeTypeTest nodeTest = ((NodeTypeTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest", nodeTest);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent"));
        Node actualParentNode = ((Node) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        assertNull(actualParentNode);
        
        Map actualParentNamespaces = ((Map) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaces"));
        assertNull(actualParentNamespaces);
        
        String actualParentDefaultNamespace = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace"));
        assertNull(actualParentDefaultNamespace);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "id"));
        assertNull(actualParentId);
        
        NamespaceResolver actualParentLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
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
        
        NodeTest expectedNodeTest = ((NodeTest) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest"));
        NodeTest actualNodeTest = ((NodeTest) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest"));
        int expectedNodeTestNodeType = (((NodeTypeTest) expectedNodeTest)).getNodeType();
        int actualNodeTestNodeType = (((NodeTypeTest) actualNodeTest)).getNodeType();
        assertEquals(expectedNodeTestNodeType, actualNodeTestNodeType);
        
        Node actualNode = ((Node) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "node"));
        assertNull(actualNode);
        
        Node actualChild = ((Node) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "child"));
        assertNull(actualChild);
        
        boolean actualReverse = ((Boolean) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "reverse"));
        assertFalse(actualReverse);
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    
    @Test
    public void testChildIterator2() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000\u0000:\u0000\u0000\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        
        DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(nodeTypeTest, false, nullPropertyPointer));
        
        DOMNodeIterator expected = ((DOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent", parent);
        NodeTypeTest nodeTest = ((NodeTypeTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest", nodeTest);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent"));
        Node actualParentNode = ((Node) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        assertNull(actualParentNode);
        
        Map actualParentNamespaces = ((Map) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaces"));
        assertNull(actualParentNamespaces);
        
        String actualParentDefaultNamespace = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace"));
        assertNull(actualParentDefaultNamespace);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "id"));
        assertNull(actualParentId);
        
        NamespaceResolver actualParentLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
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
        
        NodeTest expectedNodeTest = ((NodeTest) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest"));
        NodeTest actualNodeTest = ((NodeTest) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest"));
        int expectedNodeTestNodeType = (((NodeTypeTest) expectedNodeTest)).getNodeType();
        int actualNodeTestNodeType = (((NodeTypeTest) actualNodeTest)).getNodeType();
        assertEquals(expectedNodeTestNodeType, actualNodeTestNodeType);
        
        Node actualNode = ((Node) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "node"));
        assertNull(actualNode);
        
        Node actualChild = ((Node) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "child"));
        assertNull(actualChild);
        
        boolean actualReverse = ((Boolean) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "reverse"));
        assertFalse(actualReverse);
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    
    @Test
    public void testChildIterator3() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
            NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
            NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
            
            DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(nodeTypeTest, false, nullElementPointer));
            
            DOMNodeIterator expected = ((DOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
            DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
            parent.setIndex(Integer.MIN_VALUE);
            setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent", parent);
            NodeTypeTest nodeTest = ((NodeTypeTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
            setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest", nodeTest);
            
            NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent"));
            NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent"));
            Node actualParentNode = ((Node) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
            assertNull(actualParentNode);
            
            Map actualParentNamespaces = ((Map) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "namespaces"));
            assertNull(actualParentNamespaces);
            
            String actualParentDefaultNamespace = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace"));
            assertNull(actualParentDefaultNamespace);
            
            String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "id"));
            assertNull(actualParentId);
            
            NamespaceResolver actualParentLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver"));
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
            
            NodeTest expectedNodeTest = ((NodeTest) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest"));
            NodeTest actualNodeTest = ((NodeTest) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "nodeTest"));
            int expectedNodeTestNodeType = (((NodeTypeTest) expectedNodeTest)).getNodeType();
            int actualNodeTestNodeType = (((NodeTypeTest) actualNodeTest)).getNodeType();
            assertEquals(expectedNodeTestNodeType, actualNodeTestNodeType);
            
            Node actualNode = ((Node) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "node"));
            assertNull(actualNode);
            
            Node actualChild = ((Node) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "child"));
            assertNull(actualChild);
            
            boolean actualReverse = ((Boolean) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "reverse"));
            assertFalse(actualReverse);
            
            int expectedPosition = expected.getPosition();
            int actualPosition = actual.getPosition();
            assertEquals(expectedPosition, actualPosition);
            
        } finally {
            setStaticField(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test
    public void testChildIterator4() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getNamespaceURI(JDOMNamespacePointer.java:81)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer.getImmediateNode(JDOMNamespacePointer.java:76)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:360)
            org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.<init>(DOMNodeIterator.java:53)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(DOMNodePointer.java:200) */
        dOMNodePointer.childIterator(null, false, jDOMNamespacePointer);
    }
    ///endregion
    
    ///region Errors report for childIterator
    
    public void testChildIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attributeIterator(org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#attributeIterator(org.apache.commons.jxpath.ri.QName)}
 * @utbot.returnsFrom {@code return new DOMAttributeIterator(this, name);}
 *  */
    @Test
    public void testAttributeIterator_Return() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", java.lang.Short.MIN_VALUE);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
        DOMAttributeIterator actual = ((DOMAttributeIterator) dOMNodePointer.attributeIterator(null));
        
        DOMAttributeIterator expected = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node", defaultDocument);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        ArrayList attributes = new ArrayList();
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent"));
        Node expectedParentNode = ((Node) getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        Node actualParentNode = ((Node) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        short expectedParentNodeNodeType = (((NodeImpl) expectedParentNode)).getNodeType();
        short actualParentNodeNodeType = (((NodeImpl) actualParentNode)).getNodeType();
        assertEquals(expectedParentNodeNodeType, actualParentNodeNodeType);
        
        QName actualName = ((QName) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name"));
        assertNull(actualName);
        
        List expectedAttributes = ((List) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes"));
        List actualAttributes = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#attributeIterator(org.apache.commons.jxpath.ri.QName)}
 * @utbot.returnsFrom {@code return new DOMAttributeIterator(this, name);}
 *  */
    @Test
    public void testAttributeIterator_Return_1() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        ArrayList attributes = new ArrayList();
        setField(tIFFFieldNode, "javax.imageio.metadata.IIOMetadataNode", "attributes", attributes);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(tIFFFieldNodeType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = tIFFFieldNode;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        DOMAttributeIterator actual = ((DOMAttributeIterator) dOMNodePointer.attributeIterator(qName));
        
        DOMAttributeIterator expected = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node", tIFFFieldNode);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", qName);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent"));
        Node expectedParentNode = ((Node) getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        Node actualParentNode = ((Node) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        List expectedParentNodeAttributes = ((List) getFieldValue(expectedParentNode, "javax.imageio.metadata.IIOMetadataNode", "attributes"));
        List actualParentNodeAttributes = ((List) getFieldValue(actualParentNode, "javax.imageio.metadata.IIOMetadataNode", "attributes"));
        assertTrue(deepEquals(expectedParentNodeAttributes, actualParentNodeAttributes));
        
        QName expectedName = ((QName) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name"));
        QName actualName = ((QName) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name"));
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expectedName, actualName);
        
        List expectedAttributes = ((List) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes"));
        List actualAttributes = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    ///endregion
    
    ///region Errors report for attributeIterator
    
    public void testAttributeIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalStrings(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (s1 == s2): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqualStrings_S1EqualsS2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
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
        String string = "\u0001\u0080\u0001";
        String string1 = "";
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = string1;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testEqualStrings2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = ((Object) null);
        equalStringsMethodArguments[1] = string;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testEqualStrings3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0001\u0001";
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getBaseValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseValue()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getBaseValue()}
 * @utbot.returnsFrom {@code return node;}
 *  */
    @Test
    public void testGetBaseValue_ReturnNode() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        Object actual = dOMNodePointer.getBaseValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getBaseValue
    
    public void testGetBaseValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPointerByID(org.apache.commons.jxpath.JXPathContext,java.lang.String)}
 * @utbot.returnsFrom {@code return element == null ? (Pointer) new NullPointer(getLocale(), id) : new DOMNodePointer(element, getLocale(), id);}
 *  */
    @Test
    public void testGetPointerByID_ReturnElementNotEqualsNull() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
            setField(schemaDOM, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 9);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
            Class schemaDOMType = Class.forName("org.w3c.dom.Node");
            Class localeType = Class.forName("java.util.Locale");
            Class stringType = Class.forName("java.lang.String");
            Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(schemaDOMType, localeType, stringType);
            dOMNodePointerConstructor.setAccessible(true);
            java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
            dOMNodePointerConstructorArguments[0] = schemaDOM;
            dOMNodePointerConstructorArguments[1] = locale;
            dOMNodePointerConstructorArguments[2] = ((Object) null);
            DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
            
            NullPointer actual = ((NullPointer) dOMNodePointer.getPointerByID(null, null));
            
            NullPointer expected = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
            expected.setValue(uninitialized);
            expected.setIndex(Integer.MIN_VALUE);
            setField(expected, "org.apache.commons.jxpath.ri.model.NodePointer", "locale", locale);
            
            // org.apache.commons.jxpath.ri.model.beans.NullPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPointerByID(org.apache.commons.jxpath.JXPathContext,java.lang.String)}
 * @utbot.returnsFrom {@code return element == null ? (Pointer) new NullPointer(getLocale(), id) : new DOMNodePointer(element, getLocale(), id);}
 *  */
    @Test
    public void testGetPointerByID_ReturnElementNotEqualsNull_2() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
            setField(schemaDOM, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 9);
            Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
            Class schemaDOMType = Class.forName("org.w3c.dom.Node");
            Class localeType = Class.forName("java.util.Locale");
            Class stringType = Class.forName("java.lang.String");
            Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(schemaDOMType, localeType, stringType);
            dOMNodePointerConstructor.setAccessible(true);
            java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
            dOMNodePointerConstructorArguments[0] = schemaDOM;
            dOMNodePointerConstructorArguments[1] = ((Object) null);
            dOMNodePointerConstructorArguments[2] = ((Object) null);
            DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
            
            NullPointer actual = ((NullPointer) dOMNodePointer.getPointerByID(null, null));
            
            NullPointer expected = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
            expected.setValue(uninitialized);
            expected.setIndex(Integer.MIN_VALUE);
            Locale locale = ((Locale) createInstance("java.util.Locale"));
            setField(expected, "org.apache.commons.jxpath.ri.model.NodePointer", "locale", locale);
            
            // org.apache.commons.jxpath.ri.model.beans.NullPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPointerByID(org.apache.commons.jxpath.JXPathContext,java.lang.String)}
 * @utbot.returnsFrom {@code return element == null ? (Pointer) new NullPointer(getLocale(), id) : new DOMNodePointer(element, getLocale(), id);}
 *  */
    @Test
    public void testGetPointerByID_ReturnElementNotEqualsNull_1() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
            setField(schemaDOM, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 9);
            Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
            Class schemaDOMType = Class.forName("org.w3c.dom.Node");
            Class localeType = Class.forName("java.util.Locale");
            Class stringType = Class.forName("java.lang.String");
            Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(schemaDOMType, localeType, stringType);
            dOMNodePointerConstructor.setAccessible(true);
            java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
            dOMNodePointerConstructorArguments[0] = schemaDOM;
            dOMNodePointerConstructorArguments[1] = ((Object) null);
            dOMNodePointerConstructorArguments[2] = ((Object) null);
            DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
            
            NullPointer actual = ((NullPointer) dOMNodePointer.getPointerByID(null, null));
            
            NullPointer expected = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
            expected.setValue(uninitialized);
            expected.setIndex(Integer.MIN_VALUE);
            
            // org.apache.commons.jxpath.ri.model.beans.NullPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPointerByID(org.apache.commons.jxpath.JXPathContext,java.lang.String)}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.DOCUMENT_NODE): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: node.getOwnerDocument()
 *  */
    @Test
    public void testGetPointerByID_ThrowClassCastException() throws Exception  {
        PSVIAttrNSImpl pSVIAttrNSImpl = ((PSVIAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl"));
        setField(pSVIAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", pSVIAttrNSImpl);
        setField(pSVIAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class pSVIAttrNSImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(pSVIAttrNSImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = pSVIAttrNSImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.NodeImpl can not be casted to org.w3c.dom.Document] */
        dOMNodePointer.getPointerByID(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPointerByID(org.apache.commons.jxpath.JXPathContext,java.lang.String)}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.DOCUMENT_NODE): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (Document) node
 *  */
    @Test
    public void testGetPointerByID_ThrowClassCastException_1() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Document] */
        dOMNodePointer.getPointerByID(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPointerByID(org.apache.commons.jxpath.JXPathContext,java.lang.String)}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.getNodeType() == Node.DOCUMENT_NODE
 *  */
    @Test
    public void testGetPointerByID_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(DOMNodePointer.java:739) */
        dOMNodePointer.getPointerByID(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPointerByID(org.apache.commons.jxpath.JXPathContext,java.lang.String)}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.DOCUMENT_NODE): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element element = document.getElementById(id);
 *  */
    @Test
    public void testGetPointerByID_ThrowNullPointerException_1() {
        DefaultElement defaultElement = new DefaultElement(null, null, null, null, java.lang.Short.MIN_VALUE);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultElement, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID] produces [java.lang.NullPointerException] */
        dOMNodePointer.getPointerByID(null, null);
    }
    ///endregion
    
    ///region Errors report for getPointerByID
    
    public void testGetPointerByID_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (!(node instanceof Element)): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.createAttribute(context, name);
 *  */
    @Test
    public void testCreateAttribute_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:495)
            org.apache.commons.jxpath.ri.model.NodePointer.createAttribute(NodePointer.java:524)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(DOMNodePointer.java:452) */
        dOMNodePointer.createAttribute(null, null);
    }
    ///endregion
    
    ///region Errors report for createAttribute
    
    public void testCreateAttribute_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocalName(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (localName != null): True}
 * @utbot.returnsFrom {@code return localName;}
 *  */
    @Test
    public void testGetLocalName_LocalNameNotEqualsNull() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        String nodeName = "";
        setField(tIFFFieldNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Method getLocalNameMethod = dOMNodePointerClazz.getDeclaredMethod("getLocalName", tIFFFieldNodeType);
        getLocalNameMethod.setAccessible(true);
        java.lang.Object[] getLocalNameMethodArguments = new java.lang.Object[1];
        getLocalNameMethodArguments[0] = tIFFFieldNode;
        String actual = ((String) getLocalNameMethod.invoke(null, getLocalNameMethodArguments));
        
        assertEquals(nodeName, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (localName != null): True}
 * @utbot.returnsFrom {@code return localName;}
 *  */
    @Test
    public void testGetLocalName_LocalNameNotEqualsNull_1() throws Exception  {
        ElementNSImpl elementNSImpl = ((ElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.ElementNSImpl"));
        String localName = "";
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.ElementNSImpl", "localName", localName);
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementNSImplType = Class.forName("org.w3c.dom.Node");
        Method getLocalNameMethod = dOMNodePointerClazz.getDeclaredMethod("getLocalName", elementNSImplType);
        getLocalNameMethod.setAccessible(true);
        java.lang.Object[] getLocalNameMethodArguments = new java.lang.Object[1];
        getLocalNameMethodArguments[0] = elementNSImpl;
        String actual = ((String) getLocalNameMethod.invoke(null, getLocalNameMethodArguments));
        
        assertEquals(localName, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (localName != null): False}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return index < 0 ? name : name.substring(index + 1);}
 *  */
    @Test
    public void testGetLocalName_IndexLessThanZero() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        String rawname = "";
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "rawname", rawname);
        
        String actual = DOMNodePointer.getLocalName(defaultDocument);
        
        assertEquals(rawname, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (localName != null): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.returnsFrom {@code return index < 0 ? name : name.substring(index + 1);}
 *  */
    @Test
    public void testGetLocalName_IndexGreaterOrEqualZero() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        String rawname = ":";
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "rawname", rawname);
        
        String actual = DOMNodePointer.getLocalName(defaultDocument);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (localName != null): True}
 * @utbot.returnsFrom {@code return localName;}
 *  */
    @Test
    public void testGetLocalName_LocalNameNotEqualsNull_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        NodeImpl nodeImpl = new NodeImpl(null, string, null, null, (short) 0);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Method getLocalNameMethod = dOMNodePointerClazz.getDeclaredMethod("getLocalName", nodeImplType);
        getLocalNameMethod.setAccessible(true);
        java.lang.Object[] getLocalNameMethodArguments = new java.lang.Object[1];
        getLocalNameMethodArguments[0] = nodeImpl;
        String actual = ((String) getLocalNameMethod.invoke(null, getLocalNameMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLocalName(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.invokes {@link org.w3c.dom.Node#getLocalName()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String localName = node.getLocalName();
 *  */
    @Test
    public void testGetLocalName_ThrowClassCastException() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        DocumentImpl ownerDocument = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        DOMNodePointer.getLocalName(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.invokes {@link org.w3c.dom.Node#getLocalName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String localName = node.getLocalName();
 *  */
    @Test
    public void testGetLocalName_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(DOMNodePointer.java:653) */
        DOMNodePointer.getLocalName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNamespaceURI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.returnsFrom {@code return getDefaultNamespaceURI();}
 *  */
    @Test
    public void testGetNamespaceURI_ReturnGetDefaultNamespaceURI() throws Exception  {
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        String defaultNamespace = "";
        setField(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace", defaultNamespace);
        
        String actual = dOMNodePointer.getNamespaceURI(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.returnsFrom {@code return getDefaultNamespaceURI();}
 *  */
    @Test
    public void testGetNamespaceURI_ReturnGetDefaultNamespaceURI_1() throws Exception  {
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        String defaultNamespace = "\u0000";
        setField(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace", defaultNamespace);
        
        String actual = dOMNodePointer.getNamespaceURI(((String) null));
        
        assertEquals(defaultNamespace, actual);
    }
    ///endregion
    
    ///region Errors report for getNamespaceURI
    
    public void testGetNamespaceURI_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNamespaceURI()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI(org.w3c.dom.Node)}
 * @utbot.returnsFrom {@code return getNamespaceURI(node);}
 *  */
    @Test
    public void testGetNamespaceURI_DOMNodePointerGetNamespaceURI() throws Exception  {
        ElementNSImpl elementNSImpl = ((ElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.ElementNSImpl"));
        String namespaceURI = "";
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.ElementNSImpl", "namespaceURI", namespaceURI);
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementNSImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(elementNSImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = elementNSImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        String actual = dOMNodePointer.getNamespaceURI();
        
        assertEquals(namespaceURI, actual);
    }
    ///endregion
    
    ///region Errors report for getNamespaceURI
    
    public void testGetNamespaceURI_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNamespaceURI(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link org.w3c.dom.Document#getDocumentElement()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: node = ((Document) node).getDocumentElement();
 *  */
    @Test
    public void testGetNamespaceURI_ThrowIndexOutOfBoundsException() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdCount", 1);
        java.lang.String[] fIdName = {};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdName", fIdName);
        int[] fIdElement = {0};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdElement", fIdElement);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 6);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        DOMNodePointer.getNamespaceURI(deferredDocumentImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (node instanceof Document): False}
 * @utbot.invokes {@link org.w3c.dom.Element#getNamespaceURI()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String uri = element.getNamespaceURI();
 *  */
    @Test
    public void testGetNamespaceURI_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(DOMNodePointer.java:675) */
        DOMNodePointer.getNamespaceURI(((Node) null));
    }
    ///endregion
    
    ///region Errors report for getNamespaceURI
    
    public void testGetNamespaceURI_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1047703469858700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1047703469858700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1047703469873400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047703469858700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047703469873400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1047703470893300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1047703470893300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1047703470897300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047703470893300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047703470897300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1047703476466700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1047703476466700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1047703476470800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047703476466700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047703476470800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1047703477357600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1047703477357600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1047703477361600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047703477357600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047703477361600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

