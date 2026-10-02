package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import com.sun.imageio.plugins.tiff.TIFFFieldNode;
import java.lang.reflect.Method;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument;
import com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl;
import com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl;
import java.lang.reflect.InvocationTargetException;
import com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl;
import com.sun.org.apache.xml.internal.utils.SuballocatedIntVector;
import java.lang.reflect.Constructor;
import com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy;
import org.w3c.dom.Node;
import com.sun.org.apache.xerces.internal.dom.ElementDefinitionImpl;
import com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM;
import com.sun.org.apache.xerces.internal.impl.xs.opti.ElementImpl;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.ri.QName;
import javax.imageio.plugins.tiff.TIFFField;
import org.apache.commons.jxpath.JXPathException;
import java.util.Locale;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.BasicTypeConverter;
import java.util.ArrayList;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultElement;
import com.sun.org.apache.xerces.internal.impl.xs.opti.AttrImpl;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.PSVIDocumentImpl;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultNode;
import java.util.List;
import java.util.Map;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.NodePointer.createAttribute(NodePointer.java:454)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(DOMNodePointer.java:411) */
        dOMNodePointer.createAttribute(null, null);
    }
    ///endregion
    
    ///region Errors report for createAttribute
    
    public void testCreateAttribute_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
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
 * @utbot.returnsFrom {@code return localName;}
 *  */
    @Test
    public void testGetLocalName_ReturnLocalName() throws Exception  {
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
 * @utbot.returnsFrom {@code return localName;}
 *  */
    @Test
    public void testGetLocalName_ReturnLocalName_1() throws Exception  {
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
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetLocalName_ReturnName() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        String rawname = "";
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "rawname", rawname);
        
        String actual = DOMNodePointer.getLocalName(defaultDocument);
        
        assertEquals(rawname, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.returnsFrom {@code return name.substring(index + 1);}
 *  */
    @Test
    public void testGetLocalName_StringSubstring() throws Exception  {
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
 * @utbot.returnsFrom {@code return localName;}
 *  */
    @Test
    public void testGetLocalName_ReturnLocalName_2() throws Exception  {
        ElementNSImpl elementNSImpl = ((ElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.ElementNSImpl"));
        String localName = "";
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.ElementNSImpl", "localName", localName);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementNSImplType = Class.forName("org.w3c.dom.Node");
        Method getLocalNameMethod = dOMNodePointerClazz.getDeclaredMethod("getLocalName", elementNSImplType);
        getLocalNameMethod.setAccessible(true);
        java.lang.Object[] getLocalNameMethodArguments = new java.lang.Object[1];
        getLocalNameMethodArguments[0] = elementNSImpl;
        String actual = ((String) getLocalNameMethod.invoke(null, getLocalNameMethodArguments));
        
        assertEquals(localName, actual);
        
        short finalElementNSImplFlags = ((Short) getFieldValue(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags"));
        
        assertEquals((short) 0, finalElementNSImplFlags);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.returnsFrom {@code return localName;}
 *  */
    @Test
    public void testGetLocalName_ReturnLocalName_3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetLocalName_ThrowClassCastException_1() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objectArray[0] = object;
        objectArray[1] = ((Object) ownerDocument);
        fNodeName[0] = objectArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        DOMNodePointer.getLocalName(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetLocalName_ThrowIndexOutOfBoundsException() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", Integer.MIN_VALUE);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        DOMNodePointer.getLocalName(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetLocalName_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", 1073741824);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        DOMNodePointer.getLocalName(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetLocalName_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", 128);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = {null};
        fNodeName[0] = objectArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        DOMNodePointer.getLocalName(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetLocalName_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        ElementNSImpl elementNSImpl = ((ElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.ElementNSImpl"));
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeType = new int[1][];
        int[] intArray = {};
        fNodeType[0] = intArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeType", fNodeType);
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(elementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementNSImplType = Class.forName("org.w3c.dom.Node");
        Method getLocalNameMethod = dOMNodePointerClazz.getDeclaredMethod("getLocalName", elementNSImplType);
        getLocalNameMethod.setAccessible(true);
        java.lang.Object[] getLocalNameMethodArguments = new java.lang.Object[1];
        getLocalNameMethodArguments[0] = elementNSImpl;
        try {
            getLocalNameMethod.invoke(null, getLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String localName = node.getLocalName();
 *  */
    @Test
    public void testGetLocalName_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(DOMNodePointer.java:612) */
        DOMNodePointer.getLocalName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNamespaceURI(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
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
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetNamespaceURI_ThrowIndexOutOfBoundsException_1() throws Exception  {
        AdaptiveResultTreeImpl adaptiveResultTreeImpl = ((AdaptiveResultTreeImpl) createInstance("com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl"));
        SAXImpl _dom = ((SAXImpl) createInstance("com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl"));
        SuballocatedIntVector m_dtmIdent = ((SuballocatedIntVector) createInstance("com.sun.org.apache.xml.internal.utils.SuballocatedIntVector"));
        setField(m_dtmIdent, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_blocksize", 1);
        int[] m_map0 = {};
        setField(m_dtmIdent, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_map0", m_map0);
        setField(_dom, "com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBase", "m_dtmIdent", m_dtmIdent);
        setField(adaptiveResultTreeImpl, "com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl", "_dom", _dom);
        Class dTMNodeProxyClazz = Class.forName("com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy");
        Class adaptiveResultTreeImplType = Class.forName("com.sun.org.apache.xml.internal.dtm.DTM");
        Class intType = int.class;
        Constructor dTMNodeProxyConstructor = dTMNodeProxyClazz.getDeclaredConstructor(adaptiveResultTreeImplType, intType);
        dTMNodeProxyConstructor.setAccessible(true);
        java.lang.Object[] dTMNodeProxyConstructorArguments = new java.lang.Object[2];
        dTMNodeProxyConstructorArguments[0] = adaptiveResultTreeImpl;
        dTMNodeProxyConstructorArguments[1] = 0;
        DTMNodeProxy dTMNodeProxy = ((DTMNodeProxy) dTMNodeProxyConstructor.newInstance(dTMNodeProxyConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        DOMNodePointer.getNamespaceURI(dTMNodeProxy);
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(DOMNodePointer.java:633) */
        DOMNodePointer.getNamespaceURI(((Node) null));
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNamespaceURI()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetNamespaceURI_ThrowIndexOutOfBoundsException1() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdCount", 1);
        java.lang.String[] fIdName = {};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdName", fIdName);
        int[] fIdElement = {0};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdElement", fIdElement);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 6);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredDocumentImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        dOMNodePointer.getNamespaceURI();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return getNamespaceURI(node);
 *  */
    @Test
    public void testGetNamespaceURI_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        ElementDefinitionImpl elementDefinitionImpl = new ElementDefinitionImpl(null, null);
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class elementDefinitionImplType = Class.forName("org.w3c.dom.Node");
        Class localeType = Class.forName("java.util.Locale");
        Class stringType = Class.forName("java.lang.String");
        Constructor dOMNodePointerConstructor = dOMNodePointerClazz.getDeclaredConstructor(elementDefinitionImplType, localeType, stringType);
        dOMNodePointerConstructor.setAccessible(true);
        java.lang.Object[] dOMNodePointerConstructorArguments = new java.lang.Object[3];
        dOMNodePointerConstructorArguments[0] = elementDefinitionImpl;
        dOMNodePointerConstructorArguments[1] = ((Object) null);
        dOMNodePointerConstructorArguments[2] = ((Object) null);
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) dOMNodePointerConstructor.newInstance(dOMNodePointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        dOMNodePointer.getNamespaceURI();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method asPath()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (id != null): False},
    ///     {@code (parent != null): False}
    /// invoke:
    ///     {@link org.w3c.dom.Node#getNodeType()} once,
    ///     {@link java.lang.StringBuffer#toString()} once
    /// return from: {@code return buffer.toString();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.activatesSwitch {@code switch(node.getNodeType())}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_SwitchNodeGetNodeType() throws Exception  {
        SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
        setField(schemaDOM, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 8);
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
    public void testAsPath_SwitchNodeGetNodeType_1() throws Exception  {
        SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
        setField(schemaDOM, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 2);
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
    public void testAsPath_SwitchNodeGetNodeType_2() throws Exception  {
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
    public void testAsPath_SwitchNodeGetNodeType_3() throws Exception  {
        SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
        setField(schemaDOM, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 6);
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
    public void testAsPath_SwitchNodeGetNodeType_4() throws Exception  {
        SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
        setField(schemaDOM, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 12);
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
        
        String actual = dOMNodePointer.asPath();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method asPath()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.executesCondition {@code (id != null): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#asPath()}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.activatesSwitch {@code switch(node.getNodeType())}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_ParentNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
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
        
        String expected = "null()";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asPath()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.activatesSwitch {@code switch(node.getNodeType()) case: Node.PROCESSING_INSTRUCTION_NODE}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String target = ((ProcessingInstruction) node).getTarget();
 *  */
    @Test
    public void testAsPath_ThrowClassCastException() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 7);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        dOMNodePointer.asPath();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(node.getNodeType())
 *  */
    @Test
    public void testAsPath_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450) */
        dOMNodePointer.asPath();
    }
    ///endregion
    
    ///region Errors report for asPath
    
    public void testAsPath_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_Return() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "\u0000";
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        QName actual = dOMNodePointer.getName();
        
        QName expected = new QName(null, nodeName);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_Return_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "\u0000:";
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        QName actual = dOMNodePointer.getName();
        
        String string = "\u0000";
        QName expected = new QName(string, nodeName);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_Return_3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        NodeImpl nodeImpl = new NodeImpl(string, string, null, null, (short) 1);
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
        
        QName actual = dOMNodePointer.getName();
        
        QName expected = new QName(string, string);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_Return_4() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        NodeImpl nodeImpl = new NodeImpl(string, null, string, null, (short) 1);
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
        
        QName actual = dOMNodePointer.getName();
        
        QName expected = new QName(string, string);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_Return_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        String string = ":";
        NodeImpl nodeImpl = new NodeImpl(null, string, string, null, (short) 1);
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
        
        QName actual = dOMNodePointer.getName();
        
        String string1 = "";
        QName expected = new QName(string1, string);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_Return_5() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        String string = ":";
        NodeImpl nodeImpl = new NodeImpl(string, null, string, null, (short) 1);
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
        
        QName actual = dOMNodePointer.getName();
        
        String string1 = "";
        QName expected = new QName(string, string1);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.executesCondition {@code (type == Node.PROCESSING_INSTRUCTION_NODE): False}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_TypeNotEqualsNodePROCESSING_INSTRUCTION_NODE() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
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
        
        QName actual = dOMNodePointer.getName();
        
        QName expected = new QName(null, null);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = node.getNodeType();
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName(DOMNodePointer.java:156) */
        dOMNodePointer.getName();
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
        TIFFFieldNode firstChild = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "lastChild", iIOMetadataNode);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "parent", parent);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nextSibling", parent);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        dOMNodePointer.remove();
        
        Node dOMNodePointerNode = ((Node) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        IIOMetadataNode finalDOMNodePointerNodeParent = ((IIOMetadataNode) getFieldValue(dOMNodePointerNode, "javax.imageio.metadata.IIOMetadataNode", "parent"));
        
        assertNull(finalDOMNodePointerNodeParent);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 *  */
    @Test
    public void testRemove_1() throws Exception  {
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        TIFFFieldNode parent = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(parent, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "firstChild", iIOAttr);
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "lastChild", iIOAttr);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "parent", parent);
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
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
 * @utbot.invokes {@link org.w3c.dom.Node#removeChild(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: parent.removeChild(node);
 *  */
    @Test
    public void testRemove_ThrowClassCastException() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode parent = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(parent, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isIFD", true);
        Boolean isInitialized = false;
        setField(parent, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        byte[] data = {};
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "data", data);
        setField(parent, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "parent", parent);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.imageio.plugins.tiff.TIFFDirectory] */
        dOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = node.getParentNode();
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove(DOMNodePointer.java:434) */
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
        DefaultDocument defaultDocument = new DefaultDocument();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
        dOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: parent == null
 *  */
    @Test(expected = JXPathException.class)
    public void testRemove_ThrowJXPathException_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        dOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#remove()}
 * @utbot.invokes {@link org.w3c.dom.Node#removeChild(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parent.removeChild(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ThrowIllegalArgumentException() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode parent = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = false;
        setField(parent, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "type", 14);
        setField(parent, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "parent", parent);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        dOMNodePointer.remove();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof DOMNodePointer)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotObjectInstanceOfDOMNodePointer() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        boolean actual = dOMNodePointer.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Object() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        boolean actual = dOMNodePointer.equals(dOMNodePointer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof DOMNodePointer)): False}
 * @utbot.returnsFrom {@code return node == other.node;}
 *  */
    @Test
    public void testEquals_NodeEqualsOtherNode() {
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
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#hashCode()}
 * @utbot.invokes {@link java.lang.System#identityHashCode(java.lang.Object)}
 * @utbot.returnsFrom {@code return System.identityHashCode(node);}
 *  */
    @Test
    public void testHashCode_SystemIdentityHashCode() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        int actual = dOMNodePointer.hashCode();
        
        assertEquals(0, actual);
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.returnsFrom {@code return stringValue(node);}
 *  */
    @Test
    public void testGetValue_ReturnStringValue() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        String actual = ((String) dOMNodePointer.getValue());
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.returnsFrom {@code return stringValue(node);}
 *  */
    @Test
    public void testGetValue_ReturnStringValue_1() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
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
        
        String actual = ((String) dOMNodePointer.getValue());
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return stringValue(node);
 *  */
    @Test
    public void testGetValue_ThrowClassCastException() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isIFD", true);
        Boolean isInitialized = false;
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        byte[] data = {};
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "data", data);
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.imageio.plugins.tiff.TIFFDirectory] */
        dOMNodePointer.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return stringValue(node);
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(DOMNodePointer.java:665)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue(DOMNodePointer.java:661) */
        dOMNodePointer.getValue();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return stringValue(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetValue_ThrowIllegalArgumentException() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = false;
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
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
        
        dOMNodePointer.getValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value instanceof Node): True}
 * @utbot.executesCondition {@code (valueNode instanceof Element || valueNode instanceof Document): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getChildNodes()}
 *  */
    @Test
    public void testSetValue_ValueNodeNotInstanceOfElementOrValueNodeNotInstanceOfDocument() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        
        dOMNodePointer.setValue(iIOAttr);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value instanceof Node): False}
 * @utbot.executesCondition {@code (string != null): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.util.TypeUtils#convert(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testSetValue_NotValueNotInstanceOfNode() throws Exception  {
        Class typeUtilsClazz = Class.forName("org.apache.commons.jxpath.util.TypeUtils");
        TypeConverter prevTypeConverter = ((TypeConverter) getStaticFieldValue(typeUtilsClazz, "typeConverter"));
        try {
            BasicTypeConverter typeConverter = new BasicTypeConverter();
            setStaticField(typeUtilsClazz, "typeConverter", typeConverter);
            IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
            DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
            
            dOMNodePointer.setValue(null);
        } finally {
            setStaticField(org.apache.commons.jxpath.util.TypeUtils.class, "typeConverter", prevTypeConverter);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(java.lang.Object)
    
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(DOMNodePointer.java:325) */
        dOMNodePointer.setValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getLanguage()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return null;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_ReturnNull() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        String actual = dOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_AttrEquals() throws Exception  {
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
        
        String actual = dOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} twice
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_AttrEquals_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        Object parent = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "parent", parent);
        ArrayList attributes = new ArrayList();
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "attributes", attributes);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        String actual = dOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_NGetNodeTypeNotEqualsNodeELEMENT_NODE() {
        DefaultElement defaultElement = new DefaultElement(null, null, null, null, java.lang.Short.MIN_VALUE);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultElement, null, null);
        
        String actual = dOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_AttrEqualsNull() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        ArrayList attributes = new ArrayList();
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        attributes.add(iIOAttr);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "attributes", attributes);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        String actual = dOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 *  */
    @Test
    public void testGetLanguage_NotAttrEquals() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        ArrayList attributes = new ArrayList();
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "value", name);
        attributes.add(iIOAttr);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        attributes.add(null);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "attributes", attributes);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        String actual = dOMNodePointer.getLanguage();
        
        assertEquals(name, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element e = (Element) n;
 *  */
    @Test
    public void testGetLanguage_ThrowClassCastException() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        dOMNodePointer.getLanguage();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#escape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.returnsFrom {@code return string;}
 *  */
    @Test
    public void testEscape_StringIndexOf() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        String string = "";
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = dOMNodePointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(dOMNodePointer, escapeMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#escape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int index = string.indexOf('\'');
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(DOMNodePointer.java:507) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = dOMNodePointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = ((Object) null);
        try {
            escapeMethod.invoke(dOMNodePointer, escapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringValue(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < list.getLength(); i++)} once
 * @utbot.returnsFrom {@code return buf.toString().trim();}
 *  */
    @Test
    public void testStringValue_IterateForLoop() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class iIOMetadataNodeType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", iIOMetadataNodeType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = iIOMetadataNode;
        String actual = ((String) stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < list.getLength(); i++)} once
 * @utbot.returnsFrom {@code return buf.toString().trim();}
 *  */
    @Test
    public void testStringValue_IterateForLoop_1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", tIFFFieldNodeType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = tIFFFieldNode;
        String actual = ((String) stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stringValue(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (nodeType == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.PROCESSING_INSTRUCTION_NODE): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getChildNodes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(int i = 0; i < list.getLength(); i++)
 *  */
    @Test
    public void testStringValue_ThrowClassCastException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isIFD", true);
        Boolean isInitialized = false;
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        int[] data = {};
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "data", data);
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.imageio.plugins.tiff.TIFFDirectory] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", tIFFFieldNodeType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = tIFFFieldNode;
        try {
            stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nodeType = node.getNodeType();
 *  */
    @Test
    public void testStringValue_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(DOMNodePointer.java:665) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method stringValue(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (nodeType == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.PROCESSING_INSTRUCTION_NODE): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getChildNodes()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: for(int i = 0; i < list.getLength(); i++)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testStringValue_ThrowIllegalArgumentException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = false;
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "type", 14);
        setField(tIFFFieldNode, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Method stringValueMethod = dOMNodePointerClazz.getDeclaredMethod("stringValue", tIFFFieldNodeType);
        stringValueMethod.setAccessible(true);
        java.lang.Object[] stringValueMethodArguments = new java.lang.Object[1];
        stringValueMethodArguments[0] = tIFFFieldNode;
        try {
            stringValueMethod.invoke(dOMNodePointer, stringValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        DefaultElement defaultElement = new DefaultElement();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultElement, null, null);
        
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
        PSVIAttrNSImpl pSVIAttrNSImpl = ((PSVIAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl"));
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
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.returnsFrom {@code return !node.hasChildNodes();}
 *  */
    @Test
    public void testIsLeaf_ReturnNotNodeHasChildNodes_5() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", -1);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredAttrNSImpl, null, null);
        
        boolean actual = dOMNodePointer.isLeaf();
        
        assertTrue(actual);
        
        Node dOMNodePointerNode = ((Node) getFieldValue(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node"));
        short finalDOMNodePointerNodeFlags = ((Short) getFieldValue(dOMNodePointerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags"));
        
        assertEquals((short) 128, finalDOMNodePointerNodeFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLeaf()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return !node.hasChildNodes();
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
        PSVIAttrNSImpl ownerNode = ((PSVIAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl"));
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 12);
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
    public void testIsLeaf_ThrowClassCastException_2() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsLeaf_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", 128);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeLastChild = new int[1][];
        int[] intArray = {0};
        fNodeLastChild[0] = intArray;
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsLeaf_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeLastChild = new int[1][];
        int[] intArray = {0};
        fNodeLastChild[0] = intArray;
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsLeaf_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", Integer.MIN_VALUE);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeLastChild = {null};
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeLastChild", fNodeLastChild);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredAttrNSImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        dOMNodePointer.isLeaf();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIsLeaf_ThrowClassCastException_3() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeValue = new java.lang.Object[1][];
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objectArray[0] = object;
        objectArray[1] = ((Object) ownerNode);
        fNodeValue[0] = objectArray;
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeValue", fNodeValue);
        int[][] fNodeLastChild = {null};
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeLastChild", fNodeLastChild);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredAttrNSImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        dOMNodePointer.isLeaf();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsLeaf_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeValue = new java.lang.Object[1][];
        java.lang.Object[] objectArray = new java.lang.Object[9];
        String string = "";
        objectArray[0] = ((Object) string);
        fNodeValue[0] = objectArray;
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeValue", fNodeValue);
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsLeaf_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", 128);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeValue = new java.lang.Object[1][];
        java.lang.Object[] objectArray = {null};
        fNodeValue[0] = objectArray;
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeValue", fNodeValue);
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsLeaf_ThrowIndexOutOfBoundsException_6() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", 256);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeValue = {null};
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeValue", fNodeValue);
        int[][] fNodeLastChild = {
            null,
            null
        };
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf(DOMNodePointer.java:287) */
        dOMNodePointer.isLeaf();
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrefix(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.returnsFrom {@code return name.substring(0, index);}
 *  */
    @Test
    public void testGetPrefix_StringSubstring() throws Exception  {
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        String nodeName = "\u0000:";
        setField(tIFFFieldNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class tIFFFieldNodeType = Class.forName("org.w3c.dom.Node");
        Method getPrefixMethod = dOMNodePointerClazz.getDeclaredMethod("getPrefix", tIFFFieldNodeType);
        getPrefixMethod.setAccessible(true);
        java.lang.Object[] getPrefixMethodArguments = new java.lang.Object[1];
        getPrefixMethodArguments[0] = tIFFFieldNode;
        String actual = ((String) getPrefixMethod.invoke(null, getPrefixMethodArguments));
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrefix_ReturnNull() throws Exception  {
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
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrefix_ReturnNull_1() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        String rawname = "";
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "rawname", rawname);
        
        String actual = DOMNodePointer.getPrefix(defaultDocument);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.returnsFrom {@code return prefix;}
 *  */
    @Test
    public void testGetPrefix_ReturnPrefix() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetPrefix_ThrowClassCastException_1() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objectArray[0] = object;
        objectArray[1] = ((Object) ownerDocument);
        fNodeName[0] = objectArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        DOMNodePointer.getPrefix(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetPrefix_ThrowIndexOutOfBoundsException() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", Integer.MIN_VALUE);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        DOMNodePointer.getPrefix(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetPrefix_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", 128);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = {null};
        fNodeName[0] = objectArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        DOMNodePointer.getPrefix(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetPrefix_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = new java.lang.Object[9];
        String string = "";
        objectArray[0] = ((Object) string);
        fNodeName[0] = objectArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        DOMNodePointer.getPrefix(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetPrefix_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", 1073741824);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        DOMNodePointer.getPrefix(deferredElementNSImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prefix = node.getPrefix();
 *  */
    @Test
    public void testGetPrefix_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(DOMNodePointer.java:597) */
        DOMNodePointer.getPrefix(null);
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
        int[] data = {};
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode(DOMNodePointer.java:555) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRelativePositionOfTextNode()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: n = n.getPreviousSibling();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRelativePositionOfTextNode_ThrowIllegalArgumentException() throws Throwable  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = false;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultNamespaceURI()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (defaultNamespace == null): False}
 * @utbot.executesCondition {@code (defaultNamespace == null): False}
 * @utbot.returnsFrom {@code return defaultNamespace.equals("") ? null : defaultNamespace;}
 *  */
    @Test
    public void testGetDefaultNamespaceURI_DefaultNamespaceNotEqualsNull() throws Exception  {
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        String defaultNamespace = "";
        setField(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace", defaultNamespace);
        
        String actual = dOMNodePointer.getDefaultNamespaceURI();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (defaultNamespace == null): False}
 * @utbot.executesCondition {@code (defaultNamespace == null): False}
 * @utbot.returnsFrom {@code return defaultNamespace.equals("") ? null : defaultNamespace;}
 *  */
    @Test
    public void testGetDefaultNamespaceURI_DefaultNamespaceNotEqualsNull_1() throws Exception  {
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        String defaultNamespace = "\u0000";
        setField(dOMNodePointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace", defaultNamespace);
        
        String actual = dOMNodePointer.getDefaultNamespaceURI();
        
        assertEquals(defaultNamespace, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (defaultNamespace == null): True}
 * @utbot.executesCondition {@code (aNode instanceof Document): False}
 * @utbot.executesCondition {@code (defaultNamespace == null): True}
 * @utbot.returnsFrom {@code return defaultNamespace.equals("") ? null : defaultNamespace;}
 *  */
    @Test
    public void testGetDefaultNamespaceURI_DefaultNamespaceEqualsNull() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        String actual = dOMNodePointer.getDefaultNamespaceURI();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefaultNamespaceURI()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (aNode instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDefaultNamespaceURI_ThrowIndexOutOfBoundsException() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeType = {};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeType", fNodeType);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredDocumentImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        dOMNodePointer.getDefaultNamespaceURI();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (aNode instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDefaultNamespaceURI_ThrowIndexOutOfBoundsException_1() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeType = new int[1][];
        int[] intArray = {};
        fNodeType[0] = intArray;
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeType", fNodeType);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredDocumentImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        dOMNodePointer.getDefaultNamespaceURI();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (aNode instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: aNode = ((Document) aNode).getDocumentElement();
 *  */
    @Test
    public void testGetDefaultNamespaceURI_ThrowIndexOutOfBoundsException_2() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdCount", 1);
        int[] fIdElement = {};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdElement", fIdElement);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 6);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredDocumentImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        dOMNodePointer.getDefaultNamespaceURI();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (aNode instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDefaultNamespaceURI_ThrowIndexOutOfBoundsException_3() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeType = new int[1][];
        int[] intArray = {0};
        fNodeType[0] = intArray;
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeType", fNodeType);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 4);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredDocumentImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        dOMNodePointer.getDefaultNamespaceURI();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (aNode instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: aNode = ((Document) aNode).getDocumentElement();
 *  */
    @Test
    public void testGetDefaultNamespaceURI_ThrowIndexOutOfBoundsException_4() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdCount", 1);
        java.lang.String[] fIdName = {};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdName", fIdName);
        int[] fIdElement = {0};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdElement", fIdElement);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 6);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredDocumentImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        dOMNodePointer.getDefaultNamespaceURI();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
 * @utbot.executesCondition {@code (aNode instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: aNode = ((Document) aNode).getDocumentElement();
 *  */
    @Test
    public void testGetDefaultNamespaceURI_ThrowIndexOutOfBoundsException_5() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        int[][] fNodeParent = {null};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeParent", fNodeParent);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdCount", 1);
        java.lang.String[] fIdName = new java.lang.String[1];
        String string = "";
        fIdName[0] = string;
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdName", fIdName);
        int[] fIdElement = {1073741824};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdElement", fIdElement);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 6);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredDocumentImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getDefaultNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        dOMNodePointer.getDefaultNamespaceURI();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getDefaultNamespaceURI()}
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
    
    ///region Errors report for getDefaultNamespaceURI
    
    public void testGetDefaultNamespaceURI_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfPI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ReturnCount() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(dOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ReturnCount_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(dOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ReturnCount_2() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        Object previousSibling = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(dOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionOfPI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = n.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowClassCastException() throws Throwable  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling1 = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(previousSibling1, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isIFD", true);
        Boolean isInitialized = false;
        setField(previousSibling1, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        byte[] data = {};
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "data", data);
        setField(previousSibling1, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling1);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.imageio.plugins.tiff.TIFFDirectory] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        try {
            getRelativePositionOfPIMethod.invoke(dOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = node.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(DOMNodePointer.java:568) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        try {
            getRelativePositionOfPIMethod.invoke(dOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRelativePositionOfPI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: n = n.getPreviousSibling();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRelativePositionOfPI_ThrowIllegalArgumentException() throws Throwable  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling1 = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = false;
        setField(previousSibling1, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "type", 14);
        setField(previousSibling1, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling1);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
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
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getRelativePositionByName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByName()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByName_ReturnCount() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(dOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByName()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByName_NGetNodeTypeNotEqualsNodeELEMENT_NODE() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        Object previousSibling = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(dOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getRelativePositionByName()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.w3c.dom.Node#getNodeType()} once
    /// execute conditions:
    ///     {@code (n.getNodeType() == Node.ELEMENT_NODE): True}
    /// invoke:
    ///     {@link org.w3c.dom.Node#getNodeName()} twice,
    ///     {@link java.lang.String#equals(java.lang.Object)} once,
    ///     {@link org.w3c.dom.Node#getPreviousSibling()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByName()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByName_NmEquals() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "";
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(dOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByName()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByName_NotNmEquals() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode previousSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "";
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(dOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByName()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByName_NotNmEquals_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        String nodeName = "";
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(dOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionByName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByName()}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = n.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionByName_ThrowClassCastException() throws Throwable  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isIFD", true);
        Boolean isInitialized = false;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        byte[] data = {};
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "data", data);
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        String nodeName = "";
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.imageio.plugins.tiff.TIFFDirectory] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByNameMethod.invoke(dOMNodePointer, getRelativePositionByNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByName()}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = node.getPreviousSibling();
 *  */
    @Test
    public void testGetRelativePositionByName_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName(DOMNodePointer.java:528) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByNameMethod.invoke(dOMNodePointer, getRelativePositionByNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRelativePositionByName()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionByName()}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: n = n.getPreviousSibling();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRelativePositionByName_ThrowIllegalArgumentException() throws Throwable  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = false;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "type", 14);
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        String nodeName = "";
        setField(previousSibling, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Method getRelativePositionByNameMethod = dOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByNameMethod.invoke(dOMNodePointer, getRelativePositionByNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement(DOMNodePointer.java:543) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRelativePositionOfElement()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.invokes {@link org.w3c.dom.Node#getPreviousSibling()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: n = n.getPreviousSibling();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetRelativePositionOfElement_ThrowIllegalArgumentException() throws Throwable  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode previousSibling = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = false;
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "type", 14);
        setField(previousSibling, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "previousSibling", previousSibling);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): True}
 *  */
    @Test
    public void testCompareChildNodePointers_Node1EqualsNode2() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(nullPointer, nullPointer);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (t1 != Node.ATTRIBUTE_NODE): True}
 * @utbot.executesCondition {@code (t2 == Node.ATTRIBUTE_NODE): False}
 * @utbot.executesCondition {@code (t1 == Node.ATTRIBUTE_NODE): False}
 *  */
    @Test
    public void testCompareChildNodePointers_T1NotEqualsNodeATTRIBUTE_NODE() throws Exception  {
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        Object firstChild = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
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
        IIOMetadataNode iIOMetadataNode = new IIOMetadataNode();
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode, ((DynamicPropertyHandler) null));
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), tIFFFieldNode, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (t1 != Node.ATTRIBUTE_NODE): True}
 * @utbot.executesCondition {@code (t2 == Node.ATTRIBUTE_NODE): False}
 * @utbot.executesCondition {@code (t1 == Node.ATTRIBUTE_NODE): False}
 *  */
    @Test
    public void testCompareChildNodePointers_T1NotEqualsNodeATTRIBUTE_NODE_1() throws Exception  {
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        TIFFFieldNode firstChild = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(firstChild, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
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
        IIOMetadataNode iIOMetadataNode = new IIOMetadataNode();
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode, ((DynamicPropertyHandler) null));
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode1, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (node1 == node2): False}
    /// invoke:
    ///     {@link org.w3c.dom.Node#getNodeType()} 4 times
    /// execute conditions:
    ///     {@code (t1 != Node.ATTRIBUTE_NODE): True},
    ///     {@code (t2 == Node.ATTRIBUTE_NODE): False},
    ///     {@code (t1 == Node.ATTRIBUTE_NODE): False}
    /// invoke:
    ///     {@link org.w3c.dom.Node#getFirstChild()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 *  */
    @Test
    public void testCompareChildNodePointers() throws Exception  {
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        TIFFFieldNode firstChild = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
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
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), firstChild, ((DynamicPropertyHandler) null));
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), tIFFFieldNode, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 *  */
    @Test
    public void testCompareChildNodePointers_ReturnZero() throws Exception  {
        DefaultDocument defaultDocument = new DefaultDocument();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), tIFFFieldNode, ((DynamicPropertyHandler) null));
        TIFFFieldNode tIFFFieldNode1 = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), tIFFFieldNode1, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 *  */
    @Test
    public void testCompareChildNodePointers_1() throws Exception  {
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        IIOMetadataNode firstChild = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
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
        IIOMetadataNode iIOMetadataNode = new IIOMetadataNode();
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode, ((DynamicPropertyHandler) null));
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode1, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 *  */
    @Test
    public void testCompareChildNodePointers_ReturnZero_1() throws Exception  {
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
        IIOMetadataNode iIOMetadataNode = new IIOMetadataNode();
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode, ((DynamicPropertyHandler) null));
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode1, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node node1 = (Node) pointer1.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowClassCastException_2() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        byte[] byteArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), byteArray, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.ClassCastException: class [B cannot be cast to class org.w3c.dom.Node ([B is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:730) */
        dOMNodePointer.compareChildNodePointers(dynamicPointer, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Node node2 = (Node) pointer2.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowClassCastException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        int[] intArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), intArray, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.ClassCastException: class [I cannot be cast to class org.w3c.dom.Node ([I is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:731) */
        dOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (t1 != Node.ATTRIBUTE_NODE): True}
 * @utbot.executesCondition {@code (t2 == Node.ATTRIBUTE_NODE): False}
 * @utbot.executesCondition {@code (t1 == Node.ATTRIBUTE_NODE): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: current = current.getNextSibling();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowClassCastException_1() throws Exception  {
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        TIFFFieldNode firstChild = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(firstChild, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isIFD", true);
        Boolean isInitialized = false;
        setField(firstChild, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        short[] data = {};
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "data", data);
        setField(firstChild, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
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
        IIOMetadataNode iIOMetadataNode = new IIOMetadataNode();
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode, ((DynamicPropertyHandler) null));
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode1, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to javax.imageio.plugins.tiff.TIFFDirectory] */
        dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node node1 = (Node) pointer1.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:730) */
        dOMNodePointer.compareChildNodePointers(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node node2 = (Node) pointer2.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:731) */
        dOMNodePointer.compareChildNodePointers(nullPointer, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node node2 = (Node) pointer2.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_3() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), ((Object) null), ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:731) */
        dOMNodePointer.compareChildNodePointers(dynamicPointer, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int t1 = node1.getNodeType();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_2() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        DefaultNode defaultNode = new DefaultNode();
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), defaultNode, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException] */
        dOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (t1 != Node.ATTRIBUTE_NODE): True}
 * @utbot.executesCondition {@code (t2 == Node.ATTRIBUTE_NODE): False}
 * @utbot.executesCondition {@code (t1 == Node.ATTRIBUTE_NODE): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: current = current.getNextSibling();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCompareChildNodePointers_ThrowIllegalArgumentException() throws Exception  {
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        TIFFFieldNode firstChild = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = false;
        setField(firstChild, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        TIFFField field = ((TIFFField) createInstance("javax.imageio.plugins.tiff.TIFFField"));
        setField(field, "javax.imageio.plugins.tiff.TIFFField", "type", 14);
        setField(firstChild, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "field", field);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
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
        IIOMetadataNode iIOMetadataNode = new IIOMetadataNode();
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode, ((DynamicPropertyHandler) null));
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode1, ((DynamicPropertyHandler) null));
        
        dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
    }
    ///endregion
    
    ///region Errors report for compareChildNodePointers
    
    public void testCompareChildNodePointers_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.equalStrings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equalStrings(java.lang.String, java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (s1 == null): True}
    /// return from: {@code return s2 == null || s2.trim().length() == 0;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s2 == null || s2.trim().length() == 0;}
 *  */
    @Test
    public void testEqualStrings_S2EqualsNullOrS2TrimLengthEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s2 == null || s2.trim().length() == 0;}
 *  */
    @Test
    public void testEqualStrings_S2NotEqualsNullOrS2TrimLengthNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "!";
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = ((Object) null);
        equalStringsMethodArguments[1] = string;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s2 == null || s2.trim().length() == 0;}
 *  */
    @Test
    public void testEqualStrings_S2EqualsNullOrS2TrimLengthEqualsZero_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equalStrings(java.lang.String, java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (s1 == null): False},
    ///     {@code (s2 == null): True}
    /// invoke:
    ///     {@link java.lang.String#trim()} once,
    ///     {@link java.lang.String#length()} once
    /// return from: {@code return s1 == null || s1.trim().length() == 0;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s1 == null || s1.trim().length() == 0;}
 *  */
    @Test
    public void testEqualStrings_S1NotEqualsNullOrS1TrimLengthNotEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "!";
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s1 == null || s1.trim().length() == 0;}
 *  */
    @Test
    public void testEqualStrings_S1EqualsNullOrS1TrimLengthEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equalStrings(java.lang.String, java.lang.String)
    
    @Test
    public void testEqualStrings1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
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
        String string = "\u0001\u0001";
        String string1 = "";
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = string1;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertTrue(actual);
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
        String string = "";
        QName qName = new QName(null, string);
        
        DOMAttributeIterator actual = ((DOMAttributeIterator) dOMNodePointer.attributeIterator(qName));
        
        DOMAttributeIterator expected = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "node", tIFFFieldNode);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", string);
        setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", name);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attributeIterator(org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#attributeIterator(org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new DOMAttributeIterator(this, name);
 *  */
    @Test
    public void testAttributeIterator_ThrowClassCastException() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 1);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        String string = "";
        QName qName = new QName(null, string);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        dOMNodePointer.attributeIterator(qName);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#attributeIterator(org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new DOMAttributeIterator(this, name);
 *  */
    @Test
    public void testAttributeIterator_ThrowClassCastException_1() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 1);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        String string = "\u0000";
        QName qName = new QName(null, string);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        dOMNodePointer.attributeIterator(qName);
    }
    ///endregion
    
    ///region Errors report for attributeIterator
    
    public void testAttributeIterator_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Concrete execution failed
        
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
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        assertNull(actualParentNamespaceResolver);
        
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
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer)}
 *  */
    @Test
    public void testChildIterator() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        
        DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(null, false, nullPropertyPointer));
        
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
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        assertNull(actualParentNamespaceResolver);
        
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
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.returnsFrom {@code return new DOMNodeIterator(this, test, reverse, startWith);}
 *  */
    @Test
    public void testChildIterator_Return_1() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
            NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
            
            DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(null, false, nullElementPointer));
            
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
            
            int expectedParentIndex = expectedParent.getIndex();
            int actualParentIndex = actualParent.getIndex();
            assertEquals(expectedParentIndex, actualParentIndex);
            
            boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
            assertFalse(actualParentAttribute);
            
            Object actualParentRootNode = actualParent.getRootNode();
            assertNull(actualParentRootNode);
            
            NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
            assertNull(actualParentNamespaceResolver);
            
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
            
        } finally {
            setStaticField(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test
    public void testChildIterator1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000:\u0000";
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
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        assertNull(actualParentNamespaceResolver);
        
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
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        collectionPointer.setIndex(Integer.MIN_VALUE);
        
        DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(null, false, collectionPointer));
        
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
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        assertNull(actualParentNamespaceResolver);
        
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
    
    @Test
    public void testChildIterator3() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        
        NodePointer initialCollectionPointerValuePointer = ((NodePointer) getFieldValue(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "valuePointer"));
        
        DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(null, false, collectionPointer));
        
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
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        assertNull(actualParentNamespaceResolver);
        
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
        
        NodePointer finalCollectionPointerValuePointer = ((NodePointer) getFieldValue(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "valuePointer"));
        
        assertFalse(initialCollectionPointerValuePointer == finalCollectionPointerValuePointer);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test
    public void testChildIterator4() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.VariablePointer.access$000(VariablePointer.java:37)
            org.apache.commons.jxpath.ri.model.VariablePointer$1.getImmediateNode(VariablePointer.java:127)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:306)
            org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.<init>(DOMNodeIterator.java:47)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(DOMNodePointer.java:176) */
        dOMNodePointer.childIterator(null, false, anonymousNullPointer);
    }
    
    @Test
    public void testChildIterator5() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        NullPointer valuePointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "valuePointer", valuePointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.VariablePointer.access$000(VariablePointer.java:37)
            org.apache.commons.jxpath.ri.model.VariablePointer$1.getImmediateNode(VariablePointer.java:127)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:306)
            org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.<init>(DOMNodeIterator.java:47)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(DOMNodePointer.java:176) */
        dOMNodePointer.childIterator(null, false, collectionPointer);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test(expected = JXPathException.class)
    public void testChildIterator6() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        XMLDocumentContainer collection = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "collection", collection);
        
        dOMNodePointer.childIterator(null, false, collectionPointer);
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
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
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
    public void testTestNode_ReturnTestNode_3() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = dOMNodePointer.testNode(nodeTypeTest);
        
        assertFalse(actual);
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
    public void testTestNode_ReturnTestNode_5() {
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
    public void testTestNode_ReturnTestNode_6() {
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
    public void testTestNode_ReturnTestNode_7() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        boolean actual = dOMNodePointer.testNode(processingInstructionTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_8() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        NodeNameTest nodeNameTest = new NodeNameTest(null);
        
        boolean actual = dOMNodePointer.testNode(nodeNameTest);
        
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
    public void testTestNode_ThrowClassCastException() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        dOMNodePointer.testNode(processingInstructionTest);
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method testNode(org.w3c.dom.Node, org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType()) case: Compiler.NODE_TYPE_PI}
 * @utbot.returnsFrom {@code return nodeType == Node.PROCESSING_INSTRUCTION_NODE;}
 *  */
    @Test
    public void testTestNode_NodeTypeEqualsNodePROCESSING_INSTRUCTION_NODE() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 7);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(4);
        
        boolean actual = DOMNodePointer.testNode(defaultDocument, nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType()) case: Compiler.NODE_TYPE_COMMENT}
 * @utbot.returnsFrom {@code return nodeType == Node.COMMENT_NODE;}
 *  */
    @Test
    public void testTestNode_NodeTypeEqualsNodeCOMMENT_NODE() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 8);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(3);
        
        boolean actual = DOMNodePointer.testNode(defaultDocument, nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.returnsFrom {@code return nodeType == Node.CDATA_SECTION_NODE || nodeType == Node.TEXT_NODE;}
 *  */
    @Test
    public void testTestNode_NodeTypeEqualsNodeCDATA_SECTION_NODEOrNodeTypeEqualsNodeTEXT_NODE() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 4);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        
        boolean actual = DOMNodePointer.testNode(defaultDocument, nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.returnsFrom {@code return nodeType == Node.CDATA_SECTION_NODE || nodeType == Node.TEXT_NODE;}
 *  */
    @Test
    public void testTestNode_NodeTypeEqualsNodeCDATA_SECTION_NODEOrNodeTypeEqualsNodeTEXT_NODE_1() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 3);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        
        boolean actual = DOMNodePointer.testNode(defaultDocument, nodeTypeTest);
        
        assertTrue(actual);
    }
    
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
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType())}
 *  */
    @Test
    public void testTestNode_ReturnFalse() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(6);
        
        boolean actual = DOMNodePointer.testNode(attrImpl, nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType()) case: Compiler.NODE_TYPE_NODE}
 * @utbot.returnsFrom {@code return nodeType == Node.ELEMENT_NODE;}
 *  */
    @Test
    public void testTestNode_NodeTypeNotEqualsNodeELEMENT_NODE() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = DOMNodePointer.testNode(attrImpl, nodeTypeTest);
        
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
    public void testTestNode_ThrowClassCastException1() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        DOMNodePointer.testNode(attrImpl, processingInstructionTest);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): True}
 * @utbot.executesCondition {@code (node.getNodeType() != Node.ELEMENT_NODE): False}
 * @utbot.executesCondition {@code (wildcard): True}
 * @utbot.executesCondition {@code (testPrefix == null): False}
 * @utbot.executesCondition {@code (wildcard || testName.getName().equals(DOMNodePointer.getLocalName(node))): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.NodeNameTest#getNodeName()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.NodeNameTest#getNamespaceURI()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.NodeNameTest#isWildcard()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getPrefix()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI(org.w3c.dom.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String nodeNS = DOMNodePointer.getNamespaceURI(node);
 *  */
    @Test
    public void testTestNode_ThrowClassCastException_1() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        String string = "";
        String string1 = "";
        QName qName = new QName(string, string1);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.Element] */
        DOMNodePointer.testNode(attrImpl, nodeNameTest);
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
    public void testTestNode_ThrowNullPointerException_1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(DOMNodePointer.java:113) */
        DOMNodePointer.testNode(null, nodeTypeTest);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getNodeType() != Node.ELEMENT_NODE
 *  */
    @Test
    public void testTestNode_ThrowNullPointerException() {
        NodeNameTest nodeNameTest = new NodeNameTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(DOMNodePointer.java:92) */
        DOMNodePointer.testNode(null, nodeNameTest);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#testNode(org.w3c.dom.Node,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): False}
 * @utbot.executesCondition {@code (test instanceof ProcessingInstructionTest): True}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE
 *  */
    @Test
    public void testTestNode_ThrowNullPointerException_2() {
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(DOMNodePointer.java:128) */
        DOMNodePointer.testNode(null, processingInstructionTest);
    }
    ///endregion
    
    ///region Errors report for testNode
    
    public void testTestNode_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
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
            org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.collectNamespaces(DOMNamespaceIterator.java:47)
            org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator.<init>(DOMNamespaceIterator.java:43)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator(DOMNodePointer.java:188) */
        dOMNodePointer.namespaceIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPointerByID(org.apache.commons.jxpath.JXPathContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPointerByID(org.apache.commons.jxpath.JXPathContext,java.lang.String)}
 * @utbot.returnsFrom {@code return new NullPointer(getLocale(), id);}
 *  */
    @Test
    public void testGetPointerByID_Return() throws Exception  {
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
 * @utbot.returnsFrom {@code return new NullPointer(getLocale(), id);}
 *  */
    @Test
    public void testGetPointerByID_Return_2() throws Exception  {
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
 * @utbot.returnsFrom {@code return new NullPointer(getLocale(), id);}
 *  */
    @Test
    public void testGetPointerByID_Return_1() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: document = node.getOwnerDocument();
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: document = (Document) node;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.getNodeType() == Node.DOCUMENT_NODE
 *  */
    @Test
    public void testGetPointerByID_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(DOMNodePointer.java:701) */
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
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAbstractFactory(org.apache.commons.jxpath.JXPathContext)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getAbstractFactory(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.invokes {@link org.apache.commons.jxpath.JXPathContext#getFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AbstractFactory factory = context.getFactory();
 *  */
    @Test
    public void testGetAbstractFactory_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:717) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class jXPathContextType = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Method getAbstractFactoryMethod = dOMNodePointerClazz.getDeclaredMethod("getAbstractFactory", jXPathContextType);
        getAbstractFactoryMethod.setAccessible(true);
        java.lang.Object[] getAbstractFactoryMethodArguments = new java.lang.Object[1];
        getAbstractFactoryMethodArguments[0] = ((Object) null);
        try {
            getAbstractFactoryMethod.invoke(dOMNodePointer, getAbstractFactoryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getAbstractFactory(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.executesCondition {@code (factory == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: asPath()
 *  */
    @Test
    public void testGetAbstractFactory_ThrowNullPointerException_1() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class jXPathContextReferenceImplType = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Method getAbstractFactoryMethod = dOMNodePointerClazz.getDeclaredMethod("getAbstractFactory", jXPathContextReferenceImplType);
        getAbstractFactoryMethod.setAccessible(true);
        java.lang.Object[] getAbstractFactoryMethodArguments = new java.lang.Object[1];
        getAbstractFactoryMethodArguments[0] = jXPathContextReferenceImpl;
        try {
            getAbstractFactoryMethod.invoke(dOMNodePointer, getAbstractFactoryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getAbstractFactory(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.executesCondition {@code (factory == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: asPath()
 *  */
    @Test
    public void testGetAbstractFactory_ThrowNullPointerException_2() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class jXPathContextReferenceImplType = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Method getAbstractFactoryMethod = dOMNodePointerClazz.getDeclaredMethod("getAbstractFactory", jXPathContextReferenceImplType);
        getAbstractFactoryMethod.setAccessible(true);
        java.lang.Object[] getAbstractFactoryMethodArguments = new java.lang.Object[1];
        getAbstractFactoryMethodArguments[0] = jXPathContextReferenceImpl;
        try {
            getAbstractFactoryMethod.invoke(dOMNodePointer, getAbstractFactoryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getAbstractFactory(org.apache.commons.jxpath.JXPathContext)
    
    @Test
    public void testGetAbstractFactory1() throws Throwable  {
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
        JXPathContextReferenceImpl parentContext15 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext16 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext17 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext18 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext19 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext20 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext21 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext22 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext23 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext24 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext25 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext26 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext27 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext28 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext29 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext30 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext31 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext32 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext33 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext34 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext35 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext36 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext37 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext36, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext37);
        setField(parentContext35, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext36);
        setField(parentContext34, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext35);
        setField(parentContext33, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext34);
        setField(parentContext32, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext33);
        setField(parentContext31, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext32);
        setField(parentContext30, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext31);
        setField(parentContext29, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext30);
        setField(parentContext28, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext29);
        setField(parentContext27, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext28);
        setField(parentContext26, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext27);
        setField(parentContext25, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext26);
        setField(parentContext24, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext25);
        setField(parentContext23, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext24);
        setField(parentContext22, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext23);
        setField(parentContext21, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext22);
        setField(parentContext20, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext21);
        setField(parentContext19, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext20);
        setField(parentContext18, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext19);
        setField(parentContext17, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext18);
        setField(parentContext16, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext17);
        setField(parentContext15, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext16);
        setField(parentContext14, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext15);
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722) */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class jXPathContextReferenceImplType = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Method getAbstractFactoryMethod = dOMNodePointerClazz.getDeclaredMethod("getAbstractFactory", jXPathContextReferenceImplType);
        getAbstractFactoryMethod.setAccessible(true);
        java.lang.Object[] getAbstractFactoryMethodArguments = new java.lang.Object[1];
        getAbstractFactoryMethodArguments[0] = jXPathContextReferenceImpl;
        try {
            getAbstractFactoryMethod.invoke(dOMNodePointer, getAbstractFactoryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:717)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377) */
        dOMNodePointer.createChild(null, null, Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:717)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377) */
        dOMNodePointer.createChild(null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_2() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_3() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    @Test
    public void testCreateChild1() throws Exception  {
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
        JXPathContextReferenceImpl parentContext15 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext16 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext17 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext18 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext19 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext20 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext21 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext22 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext23 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext24 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext25 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext26 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext25, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext26);
        setField(parentContext24, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext25);
        setField(parentContext23, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext24);
        setField(parentContext22, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext23);
        setField(parentContext21, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext22);
        setField(parentContext20, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext21);
        setField(parentContext19, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext20);
        setField(parentContext18, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext19);
        setField(parentContext17, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext18);
        setField(parentContext16, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext17);
        setField(parentContext15, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext16);
        setField(parentContext14, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext15);
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
        QName qName = new QName(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, qName, 0);
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
    public void testCreateChild_ThrowNullPointerException1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:717)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:404) */
        dOMNodePointer.createChild(null, null, Integer.MIN_VALUE, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_11() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:717)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:404) */
        dOMNodePointer.createChild(null, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_21() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:404) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_31() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:404) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    @Test
    public void testCreateChild2() throws Exception  {
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
        JXPathContextReferenceImpl parentContext15 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext16 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext17 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext18 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext19 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext20 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext21 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext22 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext23 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext24 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext23, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext24);
        setField(parentContext22, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext23);
        setField(parentContext21, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext22);
        setField(parentContext20, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext21);
        setField(parentContext19, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext20);
        setField(parentContext18, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext19);
        setField(parentContext17, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext18);
        setField(parentContext16, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext17);
        setField(parentContext15, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext16);
        setField(parentContext14, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext15);
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
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:404) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE, object);
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
        JXPathContextReferenceImpl parentContext12 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext13 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext14 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext15 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext16 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext17 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext18 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext19 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext20 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext21 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext22 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext23 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext24 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext23, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext24);
        setField(parentContext22, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext23);
        setField(parentContext21, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext22);
        setField(parentContext20, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext21);
        setField(parentContext19, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext20);
        setField(parentContext18, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext19);
        setField(parentContext17, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext18);
        setField(parentContext16, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext17);
        setField(parentContext15, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext16);
        setField(parentContext14, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext15);
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
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:450)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:722)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:377)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:404) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, 0, object);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1043008851644500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1043008851644500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1043008851649500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043008851644500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043008851649500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043008851822500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043008851822500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043008851823100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043008851822500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043008851823100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1043008851942400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043008851942400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043008851942700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043008851942400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043008851942700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043008852292800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043008852292800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043008852294400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043008852292800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043008852294400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

