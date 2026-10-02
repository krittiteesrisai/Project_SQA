package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.ri.QName;
import com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import com.sun.org.apache.xerces.internal.dom.AttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;
import com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault;
import com.sun.org.apache.xml.internal.dtm.DTM;
import java.lang.reflect.Constructor;
import com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy;
import com.sun.org.apache.xml.internal.utils.SuballocatedIntVector;
import com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import java.util.Vector;
import javax.xml.transform.sax.SAXSource;
import org.apache.commons.jxpath.XMLDocumentContainer;
import java.net.URL;
import sun.net.www.protocol.jar.Handler;
import org.apache.commons.jxpath.JXPathException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

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
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method testAttr(org.w3c.dom.Attr, org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 *  */
    @Test
    public void testTestAttr_ReturnFalse() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        String nodeName = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", nodeName);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 *  */
    @Test
    public void testTestAttr_ReturnFalse_1() throws Exception  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
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
        String name2 = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name2);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name2);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = qName;
        boolean actual = ((Boolean) testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testAttr(org.w3c.dom.Attr, org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
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
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String nodePrefix = DOMNodePointer.getPrefix(attr);
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        DocumentImpl ownerNode = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 10);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl can not be casted to com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String nodePrefix = DOMNodePointer.getPrefix(attr);
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        AttrNSImpl ownerNode = ((AttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.AttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.NodeImpl can not be casted to com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_3() throws Throwable  {
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
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testTestAttr_ThrowClassCastException_4() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        AttrNSImpl ownerNode = ((AttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.AttrNSImpl"));
        PSVIAttrNSImpl ownerNode1 = ((PSVIAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl"));
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode1);
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 10);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.ClassCastException: The object with type com.sun.org.apache.xerces.internal.dom.NodeImpl can not be casted to com.sun.org.apache.xerces.internal.dom.CoreDocumentImpl] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException() throws Throwable  {
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
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_1() throws Throwable  {
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
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", 64);
        DeferredDocumentImpl ownerNode = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = new java.lang.Object[1][];
        java.lang.Object[] objectArray = {null};
        fNodeName[0] = objectArray;
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DeferredAttrNSImpl deferredAttrNSImpl = ((DeferredAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl"));
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.DeferredAttrNSImpl", "fNodeIndex", Integer.MIN_VALUE);
        DocumentImpl ownerNode = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        DeferredDocumentImpl ownerDocument = ((DeferredDocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl"));
        java.lang.Object[][] fNodeName = {null};
        setField(ownerDocument, "com.sun.org.apache.xerces.internal.dom.DeferredDocumentImpl", "fNodeName", fNodeName);
        setField(ownerNode, "com.sun.org.apache.xerces.internal.dom.ParentNode", "ownerDocument", ownerDocument);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "ownerNode", ownerNode);
        setField(deferredAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 10);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class deferredAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", deferredAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = deferredAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: String nodePrefix = DOMNodePointer.getPrefix(attr);
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_4() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        SAX2DTM2 sax2dtm2 = ((SAX2DTM2) createInstance("com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2"));
        DTMManagerDefault m_mgrDefault = ((DTMManagerDefault) createInstance("com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault"));
        com.sun.org.apache.xml.internal.dtm.DTM[] m_dtms = {null};
        setField(m_mgrDefault, "com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault", "m_dtms", m_dtms);
        setField(sax2dtm2, "com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBase", "m_mgrDefault", m_mgrDefault);
        Class dTMNodeProxyClazz = Class.forName("com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy");
        Class sax2dtm2Type = Class.forName("com.sun.org.apache.xml.internal.dtm.DTM");
        Class intType = int.class;
        Constructor dTMNodeProxyConstructor = dTMNodeProxyClazz.getDeclaredConstructor(sax2dtm2Type, intType);
        dTMNodeProxyConstructor.setAccessible(true);
        java.lang.Object[] dTMNodeProxyConstructorArguments = new java.lang.Object[2];
        dTMNodeProxyConstructorArguments[0] = sax2dtm2;
        dTMNodeProxyConstructorArguments[1] = Integer.MIN_VALUE;
        DTMNodeProxy dTMNodeProxy = ((DTMNodeProxy) dTMNodeProxyConstructor.newInstance(dTMNodeProxyConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class dTMNodeProxyType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", dTMNodeProxyType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = dTMNodeProxy;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_5() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        SAX2DTM2 sax2dtm2 = ((SAX2DTM2) createInstance("com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2"));
        SuballocatedIntVector m_exptype = ((SuballocatedIntVector) createInstance("com.sun.org.apache.xml.internal.utils.SuballocatedIntVector"));
        setField(m_exptype, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_blocksize", -1);
        int[][] m_map = {null};
        setField(m_exptype, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_map", m_map);
        setField(sax2dtm2, "com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBase", "m_exptype", m_exptype);
        Class dTMNodeProxyClazz = Class.forName("com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy");
        Class sax2dtm2Type = Class.forName("com.sun.org.apache.xml.internal.dtm.DTM");
        Class intType = int.class;
        Constructor dTMNodeProxyConstructor = dTMNodeProxyClazz.getDeclaredConstructor(sax2dtm2Type, intType);
        dTMNodeProxyConstructor.setAccessible(true);
        java.lang.Object[] dTMNodeProxyConstructorArguments = new java.lang.Object[2];
        dTMNodeProxyConstructorArguments[0] = sax2dtm2;
        dTMNodeProxyConstructorArguments[1] = -1;
        DTMNodeProxy dTMNodeProxy = ((DTMNodeProxy) dTMNodeProxyConstructor.newInstance(dTMNodeProxyConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class dTMNodeProxyType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", dTMNodeProxyType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = dTMNodeProxy;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_6() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        SAXImpl sAXImpl = ((SAXImpl) createInstance("com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl"));
        SuballocatedIntVector m_exptype = ((SuballocatedIntVector) createInstance("com.sun.org.apache.xml.internal.utils.SuballocatedIntVector"));
        setField(m_exptype, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_blocksize", -1);
        setField(m_exptype, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_SHIFT", 31);
        setField(m_exptype, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_MASK", Integer.MIN_VALUE);
        int[][] m_map = new int[2][];
        m_map[0] = ((int[]) null);
        int[] intArray = {0};
        m_map[1] = intArray;
        setField(m_exptype, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_map", m_map);
        setField(sAXImpl, "com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBase", "m_exptype", m_exptype);
        Class dTMNodeProxyClazz = Class.forName("com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy");
        Class sAXImplType = Class.forName("com.sun.org.apache.xml.internal.dtm.DTM");
        Class intType = int.class;
        Constructor dTMNodeProxyConstructor = dTMNodeProxyClazz.getDeclaredConstructor(sAXImplType, intType);
        dTMNodeProxyConstructor.setAccessible(true);
        java.lang.Object[] dTMNodeProxyConstructorArguments = new java.lang.Object[2];
        dTMNodeProxyConstructorArguments[0] = sAXImpl;
        dTMNodeProxyConstructorArguments[1] = -1;
        DTMNodeProxy dTMNodeProxy = ((DTMNodeProxy) dTMNodeProxyConstructor.newInstance(dTMNodeProxyConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class dTMNodeProxyType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", dTMNodeProxyType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = dTMNodeProxy;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: String nodePrefix = DOMNodePointer.getPrefix(attr);
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_7() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        SAXImpl sAXImpl = ((SAXImpl) createInstance("com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl"));
        DTMManagerDefault m_mgrDefault = ((DTMManagerDefault) createInstance("com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault"));
        com.sun.org.apache.xml.internal.dtm.DTM[] m_dtms = new com.sun.org.apache.xml.internal.dtm.DTM[9];
        m_dtms[0] = ((DTM) sAXImpl);
        setField(m_mgrDefault, "com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault", "m_dtms", m_dtms);
        int[] m_dtm_offsets = {};
        setField(m_mgrDefault, "com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault", "m_dtm_offsets", m_dtm_offsets);
        setField(sAXImpl, "com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBase", "m_mgrDefault", m_mgrDefault);
        Class dTMNodeProxyClazz = Class.forName("com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy");
        Class sAXImplType = Class.forName("com.sun.org.apache.xml.internal.dtm.DTM");
        Class intType = int.class;
        Constructor dTMNodeProxyConstructor = dTMNodeProxyClazz.getDeclaredConstructor(sAXImplType, intType);
        dTMNodeProxyConstructor.setAccessible(true);
        java.lang.Object[] dTMNodeProxyConstructorArguments = new java.lang.Object[2];
        dTMNodeProxyConstructorArguments[0] = sAXImpl;
        dTMNodeProxyConstructorArguments[1] = 0;
        DTMNodeProxy dTMNodeProxy = ((DTMNodeProxy) dTMNodeProxyConstructor.newInstance(dTMNodeProxyConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class dTMNodeProxyType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", dTMNodeProxyType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = dTMNodeProxy;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_8() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        SAXImpl sAXImpl = ((SAXImpl) createInstance("com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl"));
        SuballocatedIntVector m_dtmIdent = ((SuballocatedIntVector) createInstance("com.sun.org.apache.xml.internal.utils.SuballocatedIntVector"));
        setField(m_dtmIdent, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_SHIFT", 30);
        setField(m_dtmIdent, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_MASK", Integer.MAX_VALUE);
        int[][] m_map = new int[2][];
        m_map[0] = ((int[]) null);
        int[] intArray = {0};
        m_map[1] = intArray;
        setField(m_dtmIdent, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_map", m_map);
        setField(m_dtmIdent, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_firstFree", 2147483646);
        setField(sAXImpl, "com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBase", "m_dtmIdent", m_dtmIdent);
        Class dTMNodeProxyClazz = Class.forName("com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy");
        Class sAXImplType = Class.forName("com.sun.org.apache.xml.internal.dtm.DTM");
        Class intType = int.class;
        Constructor dTMNodeProxyConstructor = dTMNodeProxyClazz.getDeclaredConstructor(sAXImplType, intType);
        dTMNodeProxyConstructor.setAccessible(true);
        java.lang.Object[] dTMNodeProxyConstructorArguments = new java.lang.Object[2];
        dTMNodeProxyConstructorArguments[0] = sAXImpl;
        dTMNodeProxyConstructorArguments[1] = -65536;
        DTMNodeProxy dTMNodeProxy = ((DTMNodeProxy) dTMNodeProxyConstructor.newInstance(dTMNodeProxyConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class dTMNodeProxyType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", dTMNodeProxyType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = dTMNodeProxy;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testTestAttr_ThrowIndexOutOfBoundsException_9() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        SAX2DTM2 sax2dtm2 = ((SAX2DTM2) createInstance("com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2"));
        SuballocatedIntVector m_dtmIdent = ((SuballocatedIntVector) createInstance("com.sun.org.apache.xml.internal.utils.SuballocatedIntVector"));
        int[][] m_map = {null};
        setField(m_dtmIdent, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_map", m_map);
        setField(m_dtmIdent, "com.sun.org.apache.xml.internal.utils.SuballocatedIntVector", "m_firstFree", 1);
        setField(sax2dtm2, "com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBase", "m_dtmIdent", m_dtmIdent);
        Class dTMNodeProxyClazz = Class.forName("com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy");
        Class sax2dtm2Type = Class.forName("com.sun.org.apache.xml.internal.dtm.DTM");
        Class intType = int.class;
        Constructor dTMNodeProxyConstructor = dTMNodeProxyClazz.getDeclaredConstructor(sax2dtm2Type, intType);
        dTMNodeProxyConstructor.setAccessible(true);
        java.lang.Object[] dTMNodeProxyConstructorArguments = new java.lang.Object[2];
        dTMNodeProxyConstructorArguments[0] = sax2dtm2;
        dTMNodeProxyConstructorArguments[1] = 0;
        DTMNodeProxy dTMNodeProxy = ((DTMNodeProxy) dTMNodeProxyConstructor.newInstance(dTMNodeProxyConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class dTMNodeProxyType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", dTMNodeProxyType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = dTMNodeProxy;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (nodePrefix == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testLocalName = name.getName();
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (nodePrefix == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testLocalName = name.getName();
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = ":";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (nodePrefix == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testLocalName = name.getName();
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name = "\u0000\u0000\u0000\u0000\u0000:";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (nodePrefix == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testLocalName = name.getName();
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_3() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        PSVIAttrNSImpl pSVIAttrNSImpl = ((PSVIAttrNSImpl) createInstance("com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl"));
        String localName = "\u0000:";
        setField(pSVIAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.AttrNSImpl", "localName", localName);
        setField(pSVIAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.AttrImpl", "name", localName);
        setField(pSVIAttrNSImpl, "com.sun.org.apache.xerces.internal.dom.NodeImpl", "flags", (short) 0);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class pSVIAttrNSImplType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", pSVIAttrNSImplType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = pSVIAttrNSImpl;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (nodePrefix == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: testLocalName.equals("*") || testLocalName.equals(nodeLocalName)
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_4() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", name);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name1 = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name1);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (nodePrefix == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testPrefix = testName.getPrefix();
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_5() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", name);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name2 = "";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name2);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = ((Object) null);
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#testAttr(org.w3c.dom.Attr,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (nodePrefix == null): False}
 * @utbot.executesCondition {@code (testPrefix != null): False}
 * @utbot.executesCondition {@code (nodePrefix != null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getPrefix()}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#equalStrings(java.lang.String,java.lang.String)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nodeNS = parent.getNamespaceURI(nodePrefix);
 *  */
    @Test
    public void testTestAttr_ThrowNullPointerException_6() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "name", name);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        String name2 = ":\u0000";
        setField(iIOAttr, "javax.imageio.metadata.IIOAttr", "name", name2);
        setField(iIOAttr, "javax.imageio.metadata.IIOMetadataNode", "nodeName", name2);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.testAttr] produces [java.lang.NullPointerException] */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Attr");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method testAttrMethod = dOMAttributeIteratorClazz.getDeclaredMethod("testAttr", iIOAttrType, qNameType);
        testAttrMethod.setAccessible(true);
        java.lang.Object[] testAttrMethodArguments = new java.lang.Object[2];
        testAttrMethodArguments[0] = iIOAttr;
        testAttrMethodArguments[1] = qName;
        try {
            testAttrMethod.invoke(dOMAttributeIterator, testAttrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for testAttr
    
    public void testTestAttr_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
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
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.setPosition(DOMAttributeIterator.java:155) */
        dOMAttributeIterator.setPosition(1);
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
        VariablePointer parent = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
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
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:146) */
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
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        ArrayList attributes = new ArrayList();
        Object object = createInstance("java.lang.Object");
        attributes.add(object);
        attributes.add(null);
        attributes.add(null);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "attributes", attributes);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.w3c.dom.Attr (java.lang.Object is in module java.base of loader 'bootstrap'; org.w3c.dom.Attr is in module java.xml of loader 'bootstrap')]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:146) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:146) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:146) */
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
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getNodePointer(DOMAttributeIterator.java:146) */
        dOMAttributeIterator.getNodePointer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAttribute(org.w3c.dom.Element, org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link DOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator#getAttribute(org.w3c.dom.Element,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String testPrefix = name.getPrefix();
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:107) */
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
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: testNS = parent.getNamespaceURI(testPrefix);
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException_1() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:111) */
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
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getName()}
 * @utbot.invokes {@link org.w3c.dom.Element#getAttributeNode(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return element.getAttributeNode(name.getName());
 *  */
    @Test
    public void testGetAttribute_ThrowNullPointerException_2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", parent);
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
    
    @Test
    public void testGetAttribute2() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute3() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "\u0000";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute4() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        NullElementPointer valuePointer = ((NullElementPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", valuePointer);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute5() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        DOMNodePointer parent = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        String defaultNamespace = "";
        setField(parent, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace", defaultNamespace);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute6() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        NullPropertyPointer valuePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000";
        valuePointer.setPropertyName(propertyName);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", valuePointer);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", propertyName);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute7() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        NullPropertyPointer valuePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000:\u0000";
        valuePointer.setPropertyName(propertyName);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", valuePointer);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", propertyName);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute8() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute9() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        Vector document = ((Vector) createInstance("java.util.Vector"));
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute10() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        javax.xml.transform.sax.SAXSource[][] document = {};
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(1073741824);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute11() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        parent.setIndex(-2147483647);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute12() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        Object document = createInstance("java.lang.Object");
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(Integer.MIN_VALUE);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute13() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        Object document = createInstance("java.lang.Object");
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:132) */
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
    
    @Test
    public void testGetAttribute14() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(Integer.MIN_VALUE);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.xml.DocumentContainer.getValue(DocumentContainer.java:121)
            org.apache.commons.jxpath.util.ValueUtils.getValue(ValueUtils.java:487)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateNode(ContainerPointer.java:84)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateValuePointer(ContainerPointer.java:94)
            org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer(NodePointer.java:241)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getNamespaceURI(ContainerPointer.java:149)
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.getAttribute(DOMAttributeIterator.java:111) */
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getAttribute(org.w3c.dom.Element, org.apache.commons.jxpath.ri.QName)
    
    @Test(expected = JXPathException.class)
    public void testGetAttribute15() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(document, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(Integer.MIN_VALUE);
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
    
    @Test(expected = JXPathException.class)
    public void testGetAttribute16() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        String protocol = "";
        setField(xmlURL, "java.net.URL", "protocol", protocol);
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(Integer.MIN_VALUE);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", protocol);
        
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
    
    @Test(expected = JXPathException.class)
    public void testGetAttribute17() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
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
    
    @Test(expected = JXPathException.class)
    public void testGetAttribute18() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
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
    
    @Test(expected = JXPathException.class)
    public void testGetAttribute19() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(Integer.MIN_VALUE);
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
    
    @Test(expected = JXPathException.class)
    public void testGetAttribute20() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(Integer.MIN_VALUE);
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
    public void testGetAttribute21() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", container);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        Object iIOAttr = createInstance("javax.imageio.metadata.IIOAttr");
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class dOMAttributeIteratorClazz = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class iIOAttrType = Class.forName("org.w3c.dom.Element");
        Class qNameType = Class.forName("org.apache.commons.jxpath.ri.QName");
        Method getAttributeMethod = dOMAttributeIteratorClazz.getDeclaredMethod("getAttribute", iIOAttrType, qNameType);
        getAttributeMethod.setAccessible(true);
        java.lang.Object[] getAttributeMethodArguments = new java.lang.Object[2];
        getAttributeMethodArguments[0] = iIOAttr;
        getAttributeMethodArguments[1] = qName;
        try {
            getAttributeMethod.invoke(dOMAttributeIterator, getAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testGetAttribute22() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", container);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(Integer.MIN_VALUE);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
    
    @Test(timeout = 1000L)
    public void testGetAttribute23() throws Throwable  {
        DOMAttributeIterator dOMAttributeIterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        ContainerPointer parent = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", delegate);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(parent, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        parent.setIndex(Integer.MIN_VALUE);
        setField(dOMAttributeIterator, "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", "parent", parent);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
    
    ///region Errors report for getAttribute
    
    public void testGetAttribute_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1045913729984800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1045913729984800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1045913730001000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1045913729984800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1045913730001000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1045913730684100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1045913730684100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1045913730689300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1045913730684100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1045913730689300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

