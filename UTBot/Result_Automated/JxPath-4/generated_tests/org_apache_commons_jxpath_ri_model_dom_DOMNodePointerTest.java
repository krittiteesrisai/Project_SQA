package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultElement;
import javax.imageio.metadata.IIOMetadataNode;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import java.lang.reflect.Method;
import com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl;
import java.lang.reflect.InvocationTargetException;
import com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl;
import com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl;
import org.w3c.dom.Node;
import java.lang.reflect.Constructor;
import com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument;
import org.apache.commons.jxpath.ri.QName;
import com.sun.org.apache.xerces.internal.impl.xs.opti.ElementImpl;
import com.sun.imageio.plugins.tiff.TIFFFieldNode;
import javax.imageio.plugins.tiff.TIFFField;
import org.apache.commons.jxpath.JXPathException;
import java.util.Locale;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.JXPath11CompatibleTypeConverter;
import java.util.ArrayList;
import com.sun.org.apache.xerces.internal.dom.AttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import org.apache.commons.jxpath.ri.model.NodePointer;
import java.util.List;
import java.util.Map;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import com.sun.org.apache.xerces.internal.impl.xs.opti.AttrImpl;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultNode;
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
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getPrefix()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prefix = name.getPrefix();
 *  */
    @Test
    public void testCreateAttribute_ThrowNullPointerException() {
        DefaultElement defaultElement = new DefaultElement();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultElement, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute] produces [java.lang.NullPointerException] */
        dOMNodePointer.createAttribute(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (!(node instanceof Element)): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.createAttribute(context, name);
 *  */
    @Test
    public void testCreateAttribute_ThrowNullPointerException_1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.NodePointer.createAttribute(NodePointer.java:430)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createAttribute(DOMNodePointer.java:405) */
        dOMNodePointer.createAttribute(null, null);
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
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "";
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        String actual = DOMNodePointer.getLocalName(iIOMetadataNode);
        
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
 * @utbot.returnsFrom {@code return localName;}
 *  */
    @Test
    public void testGetLocalName_ReturnLocalName_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.returnsFrom {@code return index < 0 ? name : name.substring(index + 1);}
 *  */
    @Test
    public void testGetLocalName_ReturnIndexGreaterOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        NodeImpl nodeImpl = new NodeImpl(null, null, string, null, (short) 0);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Method getLocalNameMethod = dOMNodePointerClazz.getDeclaredMethod("getLocalName", nodeImplType);
        getLocalNameMethod.setAccessible(true);
        java.lang.Object[] getLocalNameMethodArguments = new java.lang.Object[1];
        getLocalNameMethodArguments[0] = nodeImpl;
        String actual = ((String) getLocalNameMethod.invoke(null, getLocalNameMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLocalName(org.w3c.dom.Node)}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.returnsFrom {@code return index < 0 ? name : name.substring(index + 1);}
 *  */
    @Test
    public void testGetLocalName_StringSubstring() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = ":";
        NodeImpl nodeImpl = new NodeImpl(null, null, string, null, (short) 0);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Method getLocalNameMethod = dOMNodePointerClazz.getDeclaredMethod("getLocalName", nodeImplType);
        getLocalNameMethod.setAccessible(true);
        java.lang.Object[] getLocalNameMethodArguments = new java.lang.Object[1];
        getLocalNameMethodArguments[0] = nodeImpl;
        String actual = ((String) getLocalNameMethod.invoke(null, getLocalNameMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
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
        CoreDocumentImpl ownerDocument = ((CoreDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String localName = node.getLocalName();
 *  */
    @Test
    public void testGetLocalName_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(DOMNodePointer.java:593) */
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: node = ((Document) node).getDocumentElement();
 *  */
    @Test
    public void testGetNamespaceURI_ThrowIndexOutOfBoundsException() throws Exception  {
        DeferredDocumentImpl deferredDocumentImpl = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdCount", 1);
        int[] fIdElement = {};
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fIdElement", fIdElement);
        setField(deferredDocumentImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 6);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        DOMNodePointer.getNamespaceURI(deferredDocumentImpl);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getNamespaceURI(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: node = ((Document) node).getDocumentElement();
 *  */
    @Test
    public void testGetNamespaceURI_ThrowIndexOutOfBoundsException_1() throws Exception  {
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(DOMNodePointer.java:610) */
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
    
    ///region Errors report for getNamespaceURI
    
    public void testGetNamespaceURI_errors1()
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
    public void testAsPath_SwitchNodeGetNodeType() throws Exception  {
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
    public void testAsPath_SwitchNodeGetNodeType_1() throws Exception  {
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
    public void testAsPath_SwitchNodeGetNodeType_2() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#asPath()}
 * @utbot.activatesSwitch {@code switch(node.getNodeType())}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_SwitchNodeGetNodeType_3() throws Exception  {
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
    public void testAsPath_SwitchNodeGetNodeType_4() throws Exception  {
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
    public void testAsPath_SwitchNodeGetNodeType_5() throws Exception  {
        SchemaDOM schemaDOM = ((SchemaDOM) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM"));
        setField(schemaDOM, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 5);
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444) */
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
 * @utbot.executesCondition {@code (type == Node.ELEMENT_NODE): True}
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
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getName()}
 * @utbot.executesCondition {@code (type == Node.ELEMENT_NODE): False}
 * @utbot.executesCondition {@code (type == Node.PROCESSING_INSTRUCTION_NODE): False}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_TypeNotEqualsNodePROCESSING_INSTRUCTION_NODE() throws Exception  {
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
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getName(DOMNodePointer.java:151) */
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
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        IIOMetadataNode parent = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode firstChild = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
        setField(parent, "javax.imageio.metadata.IIOMetadataNode", "lastChild", tIFFFieldNode);
        setField(tIFFFieldNode, "javax.imageio.metadata.IIOMetadataNode", "parent", parent);
        IIOMetadataNode nextSibling = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(tIFFFieldNode, "javax.imageio.metadata.IIOMetadataNode", "nextSibling", nextSibling);
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.remove(DOMNodePointer.java:428) */
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
 * @utbot.invokes org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)
 * @utbot.returnsFrom {@code return stringValue(node);}
 *  */
    @Test
    public void testGetValue_DOMNodePointerStringValue() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        
        String actual = ((String) dOMNodePointer.getValue());
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(DOMNodePointer.java:636)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getValue(DOMNodePointer.java:632) */
        dOMNodePointer.getValue();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getValue()}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
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
 * @utbot.executesCondition {@code (node.getNodeType() == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (value instanceof Node): False}
 * @utbot.executesCondition {@code (string != null): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getChildNodes()}
 * @utbot.invokes {@link org.w3c.dom.NodeList#getLength()}
 * @utbot.invokes {@link org.apache.commons.jxpath.util.TypeUtils#convert(java.lang.Object,java.lang.Class)}
 *  */
    @Test
    public void testSetValue_NotValueNotInstanceOfNode() throws Exception  {
        Class typeUtilsClazz = Class.forName("org.apache.commons.jxpath.util.TypeUtils");
        TypeConverter prevTypeConverter = ((TypeConverter) getStaticFieldValue(typeUtilsClazz, "typeConverter"));
        try {
            JXPath11CompatibleTypeConverter typeConverter = new JXPath11CompatibleTypeConverter();
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
 * @utbot.executesCondition {@code (node.getNodeType() == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (value instanceof Node): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.util.TypeUtils#convert(java.lang.Object,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String string = (String) TypeUtils.convert(value, String.class);
 *  */
    @Test
    public void testSetValue_ThrowClassCastException() throws Exception  {
        Class typeUtilsClazz = Class.forName("org.apache.commons.jxpath.util.TypeUtils");
        TypeConverter prevTypeConverter = ((TypeConverter) getStaticFieldValue(typeUtilsClazz, "typeConverter"));
        try {
            JXPath11CompatibleTypeConverter typeConverter = new JXPath11CompatibleTypeConverter();
            setStaticField(typeUtilsClazz, "typeConverter", typeConverter);
            IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
            DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
            Object valueNodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            dOMNodePointer.setValue(valueNodeSet);
        } finally {
            setStaticField(org.apache.commons.jxpath.util.TypeUtils.class, "typeConverter", prevTypeConverter);
        }
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
 * @utbot.executesCondition {@code (node.getNodeType() == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (value instanceof Node): True}
 * @utbot.executesCondition {@code (valueNode instanceof Element || valueNode instanceof Document): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < children.getLength(); i++)
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_2() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        DefaultElement defaultElement = new DefaultElement();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue] produces [java.lang.NullPointerException] */
        dOMNodePointer.setValue(defaultElement);
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.setValue(DOMNodePointer.java:319) */
        dOMNodePointer.setValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLanguage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLanguage()
    
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
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element e = (Element) n;
 *  */
    @Test
    public void testGetLanguage_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.escape(DOMNodePointer.java:501) */
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
 * @utbot.executesCondition {@code (nodeType == Node.COMMENT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.TEXT_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.CDATA_SECTION_NODE): False}
 * @utbot.executesCondition {@code (nodeType == Node.PROCESSING_INSTRUCTION_NODE): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.invokes {@link org.w3c.dom.Node#getChildNodes()}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return buf.toString().trim();}
 *  */
    @Test
    public void testStringValue_NodeTypeNotEqualsNodePROCESSING_INSTRUCTION_NODE() throws Exception  {
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stringValue(org.w3c.dom.Node)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#stringValue(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (nodeType == Node.COMMENT_NODE): False}
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
        short[] data = {};
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
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nodeType = node.getNodeType();
 *  */
    @Test
    public void testStringValue_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.stringValue(DOMNodePointer.java:636) */
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
 * @utbot.executesCondition {@code (nodeType == Node.COMMENT_NODE): False}
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return !node.hasChildNodes();
 *  */
    @Test
    public void testIsLeaf_ThrowClassCastException() throws Exception  {
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DocumentImpl ownerNode = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 12);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(deferredAttrNSImpl, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        dOMNodePointer.isLeaf();
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#isLeaf()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIsLeaf_ThrowClassCastException_1() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !node.hasChildNodes();
 *  */
    @Test
    public void testIsLeaf_ThrowNullPointerException() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLeaf(DOMNodePointer.java:282) */
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
    
    ///region OTHER: ERROR SUITE for method isLanguage(java.lang.String)
    
    @Test
    public void testIsLanguage1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(NodePointer.java:453)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.isLanguage(DOMNodePointer.java:292) */
        dOMNodePointer.isLanguage(string);
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
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = ":";
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        String actual = DOMNodePointer.getPrefix(iIOMetadataNode);
        
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
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        String nodeName = "";
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        String actual = DOMNodePointer.getPrefix(iIOMetadataNode);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getPrefix(org.w3c.dom.Node)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return index < 0 ? null : name.substring(0, index);}
 *  */
    @Test
    public void testGetPrefix_IndexLessThanZero_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        NodeImpl nodeImpl = new NodeImpl(null, null, string, null, (short) 0);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Method getPrefixMethod = dOMNodePointerClazz.getDeclaredMethod("getPrefix", nodeImplType);
        getPrefixMethod.setAccessible(true);
        java.lang.Object[] getPrefixMethodArguments = new java.lang.Object[1];
        getPrefixMethodArguments[0] = nodeImpl;
        String actual = ((String) getPrefixMethod.invoke(null, getPrefixMethodArguments));
        
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prefix = node.getPrefix();
 *  */
    @Test
    public void testGetPrefix_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(DOMNodePointer.java:582) */
        DOMNodePointer.getPrefix(null);
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.namespaceIterator(DOMNodePointer.java:183) */
        dOMNodePointer.namespaceIterator();
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
        // 5 occurrences of:
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
        String string = "\u0001\u0200\u0001";
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
        String string = "!\u0001\u0001";
        
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
    
    @Test
    public void testEqualStrings3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test
    public void testChildIterator1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000:";
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
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = "\u0000";
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
            
        } finally {
            setStaticField(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    
    @Test
    public void testChildIterator3() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
            NodeNameTest nodeNameTest = new NodeNameTest(null);
            NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
            
            DOMNodeIterator actual = ((DOMNodeIterator) dOMNodePointer.childIterator(nodeNameTest, false, nullElementPointer));
            
            DOMNodeIterator expected = ((DOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
            DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
            parent.setIndex(Integer.MIN_VALUE);
            setField(expected, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "parent", parent);
            NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
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
            QName actualNodeTestQname = ((QName) getFieldValue(actualNodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname"));
            assertNull(actualNodeTestQname);
            
            String actualNodeTestNamespaceURI = (((NodeNameTest) actualNodeTest)).getNamespaceURI();
            assertNull(actualNodeTestNamespaceURI);
            
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
    public void testChildIterator4() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(null, null, null);
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.VariablePointer.access$000(VariablePointer.java:37)
            org.apache.commons.jxpath.ri.model.VariablePointer$1.getImmediateNode(VariablePointer.java:122)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:298)
            org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator.<init>(DOMNodeIterator.java:47)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.childIterator(DOMNodePointer.java:171) */
        dOMNodePointer.childIterator(null, false, anonymousNullPointer);
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
    public void testTestNode_ReturnTestNode_2() {
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
        // 7 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
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
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 3);
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
 * @utbot.returnsFrom {@code return nodeType == Node.ELEMENT_NODE || nodeType == Node.DOCUMENT_NODE;}
 *  */
    @Test
    public void testTestNode_NodeTypeEqualsNodeELEMENT_NODEOrNodeTypeEqualsNodeDOCUMENT_NODE() throws Exception  {
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 9);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
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
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.NodeImpl", "nodeType", (short) 4);
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
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): False}
 * @utbot.executesCondition {@code (test instanceof ProcessingInstructionTest): True}
 * @utbot.executesCondition {@code (node.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
 *  */
    @Test
    public void testTestNode_NodeGetNodeTypeNotEqualsNodePROCESSING_INSTRUCTION_NODE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, java.lang.Short.MIN_VALUE);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class processingInstructionTestType = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Method testNodeMethod = dOMNodePointerClazz.getDeclaredMethod("testNode", nodeImplType, processingInstructionTestType);
        testNodeMethod.setAccessible(true);
        java.lang.Object[] testNodeMethodArguments = new java.lang.Object[2];
        testNodeMethodArguments[0] = nodeImpl;
        testNodeMethodArguments[1] = processingInstructionTest;
        boolean actual = ((Boolean) testNodeMethod.invoke(null, testNodeMethodArguments));
        
        assertFalse(actual);
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
 * @utbot.returnsFrom {@code return nodeType == Node.ELEMENT_NODE || nodeType == Node.DOCUMENT_NODE;}
 *  */
    @Test
    public void testTestNode_NodeTypeNotEqualsNodeELEMENT_NODEOrNodeTypeNotEqualsNodeDOCUMENT_NODE() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = DOMNodePointer.testNode(attrImpl, nodeTypeTest);
        
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
    public void testTestNode_ThrowClassCastException1() throws Throwable  {
        NodeImpl nodeImpl = new NodeImpl(null, null, null, null, (short) 7);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.ClassCastException: The object with type org.w3c.dom.Node can not be casted to org.w3c.dom.ProcessingInstruction] */
        Class dOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class nodeImplType = Class.forName("org.w3c.dom.Node");
        Class processingInstructionTestType = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Method testNodeMethod = dOMNodePointerClazz.getDeclaredMethod("testNode", nodeImplType, processingInstructionTestType);
        testNodeMethod.setAccessible(true);
        java.lang.Object[] testNodeMethodArguments = new java.lang.Object[2];
        testNodeMethodArguments[0] = nodeImpl;
        testNodeMethodArguments[1] = processingInstructionTest;
        try {
            testNodeMethod.invoke(null, testNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testTestNode_ThrowNullPointerException() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(DOMNodePointer.java:114) */
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
    public void testTestNode_ThrowNullPointerException_1() {
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(DOMNodePointer.java:130) */
        DOMNodePointer.testNode(null, processingInstructionTest);
    }
    ///endregion
    
    ///region Errors report for testNode
    
    public void testTestNode_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        // Concrete execution failed
        
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:675)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:675)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild1() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, 0);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild2() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE);
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, 0);
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
        JXPathContextReferenceImpl parentContext13 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext14 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext15 = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE);
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:675)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:398) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:675)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:398) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:398) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild5() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        Object object = new Object();
        
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild6() throws Exception  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        Object object = new Object();
        
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE, object);
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
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:398) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    
    @Test
    public void testCreateChild8() throws Exception  {
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
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:371)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.createChild(DOMNodePointer.java:398) */
        dOMNodePointer.createChild(jXPathContextReferenceImpl, qName, Integer.MIN_VALUE, object);
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPointerByID(DOMNodePointer.java:667) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AbstractFactory factory = context.getFactory();
 *  */
    @Test
    public void testGetAbstractFactory_ThrowNullPointerException() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:675) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: asPath()
 *  */
    @Test
    public void testGetAbstractFactory_ThrowNullPointerException_1() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: asPath()
 *  */
    @Test
    public void testGetAbstractFactory_ThrowNullPointerException_2() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680) */
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
    
    @Test(expected = StackOverflowError.class)
    public void testGetAbstractFactory1() throws Throwable  {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(parentContext, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
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
    
    @Test
    public void testGetAbstractFactory2() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.asPath(DOMNodePointer.java:444)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getAbstractFactory(DOMNodePointer.java:680) */
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
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfTextNode()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ReturnCount() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultDocument defaultDocument = new DefaultDocument();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfTextNode(DOMNodePointer.java:549) */
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
 * @utbot.executesCondition {@code (aNode instanceof Document): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: aNode = ((Document) aNode).getDocumentElement();
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
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: aNode = ((Document) aNode).getDocumentElement();
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
 * @utbot.executesCondition {@code (aNode instanceof Document): False}
 * @utbot.iterates iterate the loop {@code while(aNode != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Attr attr = ((Element) aNode).getAttributeNode("xmlns");
 *  */
    @Test
    public void testGetDefaultNamespaceURI_ThrowClassCastException() {
        AttrImpl attrImpl = new AttrImpl(null, null, null, null, null, null);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(attrImpl, null, null);
        
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionByName()
    
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
        int[] data = {};
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionByName(DOMNodePointer.java:522) */
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
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()} twice
    /// execute conditions:
    ///     {@code (node1 == node2): False}
    /// invoke:
    ///     {@link org.w3c.dom.Node#getNodeType()} twice
    /// execute conditions:
    ///     {@code (t1 == Node.ATTRIBUTE_NODE): False},
    ///     {@code (t1 != Node.ATTRIBUTE_NODE): True},
    ///     {@code (t2 == Node.ATTRIBUTE_NODE): False},
    ///     {@code (t1 == Node.ATTRIBUTE_NODE): False}
    /// invoke:
    ///     {@link org.w3c.dom.Node#getFirstChild()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.iterates iterate the loop {@code while(current != null)} once
 *  */
    @Test
    public void testCompareChildNodePointers_CurrentEqualsNode2() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "firstChild", iIOMetadataNode);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), tIFFFieldNode, ((DynamicPropertyHandler) null));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.iterates iterate the loop {@code while(current != null)} once
 *  */
    @Test
    public void testCompareChildNodePointers_CurrentEqualsNode1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "firstChild", iIOMetadataNode);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode, ((DynamicPropertyHandler) null));
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode1, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 *  */
    @Test
    public void testCompareChildNodePointers_ReturnZero() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), tIFFFieldNode, ((DynamicPropertyHandler) null));
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode1, ((DynamicPropertyHandler) null));
        
        int actual = dOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.iterates iterate the loop {@code while(current != null)} once
 *  */
    @Test
    public void testCompareChildNodePointers_CurrentNotEqualsNode2() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        IIOMetadataNode firstChild = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
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
 * @utbot.iterates iterate the loop {@code while(current != null)} once
 *  */
    @Test
    public void testCompareChildNodePointers_CurrentNotEqualsNode2_1() throws Exception  {
        IIOMetadataNode iIOMetadataNode = ((IIOMetadataNode) createInstance("javax.imageio.metadata.IIOMetadataNode"));
        TIFFFieldNode firstChild = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        Boolean isInitialized = true;
        setField(firstChild, "com.sun.imageio.plugins.tiff.TIFFFieldNode", "isInitialized", isInitialized);
        setField(iIOMetadataNode, "javax.imageio.metadata.IIOMetadataNode", "firstChild", firstChild);
        DOMNodePointer dOMNodePointer = new DOMNodePointer(iIOMetadataNode, null, null);
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), iIOMetadataNode1, ((DynamicPropertyHandler) null));
        TIFFFieldNode tIFFFieldNode = ((TIFFFieldNode) createInstance("com.sun.imageio.plugins.tiff.TIFFFieldNode"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), tIFFFieldNode, ((DynamicPropertyHandler) null));
        
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
    public void testCompareChildNodePointers_ThrowClassCastException_1() {
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        short[] shortArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), shortArray, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.ClassCastException: class [S cannot be cast to class org.w3c.dom.Node ([S is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:688) */
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
        short[] shortArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), shortArray, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers] produces [java.lang.ClassCastException: class [S cannot be cast to class org.w3c.dom.Node ([S is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')]
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:689) */
        dOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
    }
    
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:688) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:689) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.compareChildNodePointers(DOMNodePointer.java:689) */
        dOMNodePointer.compareChildNodePointers(dynamicPointer, null);
    }
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.invokes {@link org.w3c.dom.Node#getNodeType()}
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
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfElement()
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfElement()}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ReturnCount() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultDocument defaultDocument = new DefaultDocument();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfElement(DOMNodePointer.java:537) */
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
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfPI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ReturnCount() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        DefaultDocument defaultDocument = new DefaultDocument();
        DOMNodePointer dOMNodePointer = new DOMNodePointer(defaultDocument, null, null);
        
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
    public void testGetRelativePositionOfPI_ReturnCount_3() throws Exception  {
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
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getRelativePositionOfPI(DOMNodePointer.java:562) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1043701611484100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1043701611484100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1043701611499100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043701611484100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043701611499100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043701612125800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043701612125800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043701612128900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043701612125800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043701612128900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1043701612705700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043701612705700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043701612708200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043701612705700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043701612708200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043701613494600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043701613494600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043701613498500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043701613494600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043701613498500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

