package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import com.sun.org.apache.xerces.internal.dom.ElementImpl;
import org.apache.commons.jxpath.ri.QName;
import java.lang.reflect.Method;
import org.w3c.dom.Attr;
import java.util.ArrayList;
import org.w3c.dom.Node;
import com.sun.org.apache.xerces.internal.dom.AttributeMap;
import com.sun.org.apache.xerces.internal.dom.DeferredElementImpl;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import java.util.HashMap;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_jxpath_ri_model_dom_DOMAttributeIteratorTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getPosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPosition()
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getPosition()}
 * @utbot.returnsFrom {@code return position;}
 *  */
    @Test
    public void testGetPosition_ReturnPosition() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", -255);
        
        int actual = dOMAttributeIterator.getPosition();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAttribute(org.w3c.dom.Element, org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.returnsFrom {@code return element.getAttributeNode(name.getName());}
 *  */
    @Test
    public void testGetAttribute_ReturnElementGetAttributeNode() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ElementImpl elementImpl = ((ElementImpl) createInstance("com.sun.org.apache.xerces.internal.dom.ElementImpl"));
        setField(elementImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = elementImpl;
        getAttributeMethodArguments[1] = qName;
        Attr actual = ((Attr) getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.returnsFrom {@code return element.getAttributeNode(name.getName());}
 *  */
    @Test
    public void testGetAttribute_ReturnElementGetAttributeNode_1() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        ArrayList attributes = new ArrayList();
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "attributes", attributes);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", iIOAttrType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = iIOAttr;
        getAttributeMethodArguments[1] = qName;
        Node actual = ((Node) getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.returnsFrom {@code return element.getAttributeNode(name.getName());}
 *  */
    @Test
    public void testGetAttribute_ReturnElementGetAttributeNode_2() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ElementImpl elementImpl = ((ElementImpl) createInstance("com.sun.org.apache.xerces.internal.dom.ElementImpl"));
        AttributeMap attributes = ((AttributeMap) createInstance("com.sun.org.apache.xerces.internal.dom.AttributeMap"));
        setField(elementImpl, "com.sun.org.apache.xerces.internal.dom.ElementImpl", "attributes", attributes);
        setField(elementImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = elementImpl;
        getAttributeMethodArguments[1] = qName;
        Node actual = ((Node) getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.returnsFrom {@code return element.getAttributeNode(name.getName());}
 *  */
    @Test
    public void testGetAttribute_ReturnElementGetAttributeNode_3() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredElementImpl deferredElementImpl = ((DeferredElementImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementImpl"));
        AttributeMap attributes = ((AttributeMap) createInstance("com.sun.org.apache.xerces.internal.dom.AttributeMap"));
        ArrayList nodes = new ArrayList();
        setField(attributes, "com.sun.org.apache.xerces.internal.dom.NamedNodeMapImpl", "nodes", nodes);
        setField(deferredElementImpl, "com.sun.org.apache.xerces.internal.dom.ElementImpl", "attributes", attributes);
        setField(deferredElementImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredElementImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", deferredElementImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = deferredElementImpl;
        getAttributeMethodArguments[1] = qName;
        Node actual = ((Node) getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.returnsFrom {@code return element.getAttributeNode(name.getName());}
 *  */
    @Test
    public void testGetAttribute_ReturnElementGetAttributeNode_4() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ElementImpl elementImpl = ((ElementImpl) createInstance("com.sun.org.apache.xerces.internal.dom.ElementImpl"));
        DocumentImpl ownerDocument = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        setField(elementImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(elementImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = elementImpl;
        getAttributeMethodArguments[1] = qName;
        Attr actual = ((Attr) getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments));
        
        assertNull(actual);
        
        short finalElementImplFlags = ((Short) getFieldValue(elementImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags"));
        
        assertEquals((short) 0, finalElementImplFlags);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAttribute(org.w3c.dom.Element, org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (testNS != null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return element.getAttributeNode(name.getName());
 *  */
    @Test
    public void testGetAttribute_ThrowClassCastException() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        DocumentImpl ownerDocument = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredElementNSImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", deferredElementNSImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = deferredElementNSImpl;
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (testNS != null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetAttribute_ThrowClassCastException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objectArray[0] = object;
        Object object1 = createInstance("java.lang.Object");
        objectArray[1] = object1;
        fNodeName[0] = objectArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredElementNSImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", deferredElementNSImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = deferredElementNSImpl;
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (testNS != null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetAttribute_ThrowIndexOutOfBoundsException() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", 1073741824);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredElementNSImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", deferredElementNSImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = deferredElementNSImpl;
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (testNS != null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetAttribute_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", Integer.MIN_VALUE);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredElementNSImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", deferredElementNSImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = deferredElementNSImpl;
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (testNS != null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetAttribute_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredElementNSImpl deferredElementNSImpl = ((DeferredElementNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl"));
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredElementNSImpl", "fNodeIndex", 128);
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = {null};
        fNodeName[0] = objectArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredElementNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredElementNSImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", deferredElementNSImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = deferredElementNSImpl;
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (testNS != null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetAttribute_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
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
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredElementNSImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", deferredElementNSImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = deferredElementNSImpl;
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testPrefix = name.getPrefix();
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:105) */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = ((Object) null);
        getAttributeMethodArguments[1] = ((Object) null);
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: testNS = parent.getNamespaceResolver().getNamespaceURI(testPrefix);
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:109) */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = ((Object) null);
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (testNS != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return element.getAttributeNode(name.getName());
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:130) */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = ((Object) null);
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return element.getAttributeNode(name.getName());
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException_3() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        NamespaceResolver localNamespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        setField(localNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        setField(parent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver", localNamespaceResolver);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:130) */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = ((Object) null);
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (testPrefix != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return element.getAttributeNode(name.getName());
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException_4() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        NamespaceResolver localNamespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        setField(localNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        setField(parent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver", localNamespaceResolver);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:130) */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = ((Object) null);
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getAttribute(org.w3c.dom.Element, org.apache.commons.jxpath.ri.QName)
    
    @Test(expected = StackOverflowError.class)
    public void testGetAttribute1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        NamespaceResolver localNamespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        Object object = createInstance("java.lang.Object");
        namespaceMap.put(null, object);
        setField(localNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", pointer);
        setField(localNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer", pointer);
        setField(parent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "localNamespaceResolver", localNamespaceResolver);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class elementType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", elementType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = ((Object) null);
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getAttribute(org.w3c.dom.Element, org.apache.commons.jxpath.ri.QName)
    
    @Test(timeout = 1000L)
    public void testGetAttribute2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        NamespaceResolver localNamespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        setField(localNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", container);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        setField(localNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer", pointer);
        setField(parent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver", localNamespaceResolver);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        DeferredElementImpl deferredElementImpl = ((DeferredElementImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredElementImpl"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredElementImplType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", deferredElementImplType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = deferredElementImpl;
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getAttribute
    
    public void testGetAttribute_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method testAttr(org.w3c.dom.Attr)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 *  */
    @Test
    public void testTestAttr_ReturnFalse() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        String nodeName = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        boolean actual = ((Boolean) testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 *  */
    @Test
    public void testTestAttr_ReturnFalse_1() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        boolean actual = ((Boolean) testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getPrefix()}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#equalStrings(java.lang.String,java.lang.String)
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testTestAttr_DOMAttributeIteratorEqualStrings() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", name);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name2 = "\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name2);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name2);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        boolean actual = ((Boolean) testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testAttr(org.w3c.dom.Attr)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String nodePrefix = DOMNodePointer.getPrefix(attr);
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DocumentImpl ownerNode = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String nodePrefix = DOMNodePointer.getPrefix(attr);
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DeferredAttrNSImpl ownerNode = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.NodeImpl can not be casted to com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String nodePrefix = DOMNodePointer.getPrefix(attr);
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DocumentImpl ownerNode = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 10);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_3() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DeferredAttrNSImpl ownerNode = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 10);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.NodeImpl can not be casted to com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_4() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        objectArray[0] = object;
        DOMNodePointer dOMNodePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        objectArray[1] = ((Object) dOMNodePointer);
        fNodeName[0] = objectArray;
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String nodePrefix = DOMNodePointer.getPrefix(attr);
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_5() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DeferredAttrNSImpl ownerNode = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DocumentImpl ownerNode1 = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode1);
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 10);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", 1073741824);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", Integer.MIN_VALUE);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = new java.lang.Object[9];
        String string = "";
        objectArray[0] = ((Object) string);
        fNodeName[0] = objectArray;
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", 128);
        DocumentImpl ownerNode = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = {null};
        fNodeName[0] = objectArray;
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 10);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.executesCondition {@code (nodePrefix == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testLocalName = name.getName();
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.executesCondition {@code (nodePrefix == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testLocalName = name.getName();
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "\u0000:\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.executesCondition {@code (nodePrefix == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testLocalName = name.getName();
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "\u0000\u0000\u0000\u0000\u0000:\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.executesCondition {@code (nodePrefix == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: testLocalName.equals("*") || testLocalName.equals(nodeLocalName)
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_3() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", name);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name1 = "\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name1);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.executesCondition {@code (nodePrefix == null): False}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (nodePrefix != null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nodeNS = parent.getNamespaceURI(nodePrefix);
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_4() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", name);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name2 = "\u0000:\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name2);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr)}
 * @utbot.executesCondition {@code (nodePrefix == null): True}
 * @utbot.executesCondition {@code (testPrefix != null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: testNS = parent.getNamespaceURI(testPrefix);
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_5() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "\u0000";
        setField(name, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", name);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", prefix);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[1];
        testAttrMethodArguments[0] = iIOAttr;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.equalStrings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalStrings(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s1 == s2 || s1 != null && s1.equals(s2);}
 *  */
    @Test
    public void testEqualStrings_S1EqualsS2OrS1EqualsNullAndS1Equals() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMAttributeIteratorClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s1 == s2 || s1 != null && s1.equals(s2);}
 *  */
    @Test
    public void testEqualStrings_S1EqualsS2OrS1EqualsNullAndS1Equals_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMAttributeIteratorClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = ((Object) null);
        equalStringsMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s1 == s2 || s1 != null && s1.equals(s2);}
 *  */
    @Test
    public void testEqualStrings_S1EqualsS2OrS1EqualsNullAndS1Equals_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMAttributeIteratorClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = ((Object) null);
        equalStringsMethodArguments[1] = string;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return s1 == s2 || s1 != null && s1.equals(s2);}
 *  */
    @Test
    public void testEqualStrings_S1NotEqualsS2OrS1NotEqualsNullAndS1Equals() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        String string1 = "";
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = dOMAttributeIteratorClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = string1;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.setPosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPosition(int)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#setPosition(int)}
 * @utbot.returnsFrom {@code return position >= 1 && position <= attributes.size();}
 *  */
    @Test
    public void testSetPosition_PositionLessThan1AndPositionGreaterThanAttributesSize() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", -255);
        
        boolean actual = dOMAttributeIterator.setPosition(0);
        
        assertFalse(actual);
        
        int finalDOMAttributeIteratorPosition = ((Integer) getFieldValue(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position"));
        
        assertEquals(0, finalDOMAttributeIteratorPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#setPosition(int)}
 * @utbot.returnsFrom {@code return position >= 1 && position <= attributes.size();}
 *  */
    @Test
    public void testSetPosition_PositionLessThan1AndPositionGreaterThanAttributesSize_1() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", -255);
        
        boolean actual = dOMAttributeIterator.setPosition(1);
        
        assertFalse(actual);
        
        int finalDOMAttributeIteratorPosition = ((Integer) getFieldValue(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position"));
        
        assertEquals(1, finalDOMAttributeIteratorPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#setPosition(int)}
 * @utbot.returnsFrom {@code return position >= 1 && position <= attributes.size();}
 *  */
    @Test
    public void testSetPosition_PositionGreaterOrEqual1AndPositionLessOrEqualAttributesSize() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        attributes.add(null);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", -255);
        
        boolean actual = dOMAttributeIterator.setPosition(1);
        
        assertTrue(actual);
        
        int finalDOMAttributeIteratorPosition = ((Integer) getFieldValue(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position"));
        
        assertEquals(1, finalDOMAttributeIteratorPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPosition(int)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#setPosition(int)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return position >= 1 && position <= attributes.size();
 *  */
    @Test
    public void testSetPosition_ThrowNullPointerException() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", -255);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.setPosition(DOMAttributeIterator.java:153) */
        dOMAttributeIterator.setPosition(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNodePointer()
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): True}
 * @utbot.executesCondition {@code (!setPosition(1)): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#setPosition(int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNodePointer_NotSetPosition() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        
        NodePointer actual = dOMAttributeIterator.getNodePointer();
        
        assertNull(actual);
        
        int finalDOMAttributeIteratorPosition = ((Integer) getFieldValue(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position"));
        
        assertEquals(1, finalDOMAttributeIteratorPosition);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return new DOMAttributePointer(parent, (Attr) attributes.get(index));}
 *  */
    @Test
    public void testGetNodePointer_IndexGreaterOrEqualZero() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        ArrayList attributes = new ArrayList();
        attributes.add(null);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", 1);
        
        DOMAttributePointer actual = ((DOMAttributePointer) dOMAttributeIterator.getNodePointer());
        
        DOMAttributePointer expected = ((DOMAttributePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer"));
        expected.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        // org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNodePointer()
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return new DOMAttributePointer(parent, (Attr) attributes.get(index));
 *  */
    @Test
    public void testGetNodePointer_ThrowIndexOutOfBoundsException() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        ArrayList attributes = new ArrayList();
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:144) */
        dOMAttributeIterator.getNodePointer();
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new DOMAttributePointer(parent, (Attr) attributes.get(index));
 *  */
    @Test
    public void testGetNodePointer_ThrowClassCastException() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        Object object = createInstance("java.lang.Object");
        attributes.add(object);
        attributes.add(null);
        attributes.add(null);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.w3c.dom.Attr (java.lang.Object is in module java.base of loader 'bootstrap'; org.w3c.dom.Attr is in module java.xml of loader 'bootstrap')]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:144) */
        dOMAttributeIterator.getNodePointer();
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): True}
 * @utbot.executesCondition {@code (!setPosition(1)): False}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#setPosition(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new DOMAttributePointer(parent, (Attr) attributes.get(index));
 *  */
    @Test
    public void testGetNodePointer_ThrowClassCastException_1() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        Object object = createInstance("java.lang.Object");
        attributes.add(object);
        attributes.add(null);
        attributes.add(null);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.w3c.dom.Attr (java.lang.Object is in module java.base of loader 'bootstrap'; org.w3c.dom.Attr is in module java.xml of loader 'bootstrap')]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:144) */
        dOMAttributeIterator.getNodePointer();
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new DOMAttributePointer(parent, (Attr) attributes.get(index));
 *  */
    @Test
    public void testGetNodePointer_ThrowNullPointerException() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", -256);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:144) */
        dOMAttributeIterator.getNodePointer();
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new DOMAttributePointer(parent, (Attr) attributes.get(index));
 *  */
    @Test
    public void testGetNodePointer_ThrowNullPointerException_1() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:144) */
        dOMAttributeIterator.getNodePointer();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1047378708001900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1047378708001900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1047378708018400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047378708001900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047378708018400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1047378708611700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1047378708611700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1047378708616900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047378708611700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047378708616900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

