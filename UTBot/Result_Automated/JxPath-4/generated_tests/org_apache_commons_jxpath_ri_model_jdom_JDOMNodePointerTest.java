package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import org.apache.commons.jxpath.JXPathException;
import org.jdom.Element;
import org.jdom.Namespace;
import java.util.ArrayList;
import org.jdom.Document;
import org.apache.commons.jxpath.ri.QName;
import java.util.Locale;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.jdom.Attribute;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.jdom.IllegalNameException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.jdom.Content;
import java.util.List;
import org.jdom.CDATA;
import org.jdom.ProcessingInstruction;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import java.util.HashMap;
import sun.util.locale.BaseLocale;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.jdom.Parent;
import java.util.Set;
import java.util.HashSet;
import org.jdom.Comment;
import org.jdom.Text;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.jdom.EntityRef;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.w3c.dom.Node;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_jxpath_ri_model_jdom_JDOMNodePointerTest {
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
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getPrefix()}
 * @utbot.invokes {@link org.jdom.Element#getNamespace(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: ns == null
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateAttribute_ThrowJXPathException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        ArrayList additionalNamespaces = new ArrayList();
        setField(element, "org.jdom.Element", "additionalNamespaces", additionalNamespaces);
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = " ";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        jDOMNodePointer.createAttribute(null, qName);
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(JDOMNodePointer.java:519) */
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
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale, "G\n\t\r");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        jDOMNodePointer.setNamespaceResolver(namespaceResolver2);
        jDOMNodePointer.setIndex(1);
        
        jDOMNodePointer.createAttribute(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)
    
    @Test(expected = JXPathException.class)
    public void testCreateAttribute1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "x\u0000\u0000";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        jDOMNodePointer.createAttribute(null, qName);
    }
    
    @Test(expected = IllegalNameException.class)
    public void testCreateAttribute2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        Object attributes = createInstance("org.jdom.AttributeList");
        org.jdom.Attribute[] elementData = {null, null, null, null, null, null, null, null, null};
        setField(attributes, "org.jdom.AttributeList", "elementData", elementData);
        setField(element, "org.jdom.Element", "attributes", attributes);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        jDOMNodePointer.createAttribute(jXPathContextReferenceImpl, qName);
    }
    
    @Test(expected = IllegalNameException.class)
    public void testCreateAttribute3() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        Object attributes = createInstance("org.jdom.AttributeList");
        setField(element, "org.jdom.Element", "attributes", attributes);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        jDOMNodePointer.createAttribute(null, qName);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateAttribute4() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        jDOMNodePointer.createAttribute(null, qName);
    }
    
    @Test
    public void testCreateAttribute5() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        Object attributes = createInstance("org.jdom.AttributeList");
        org.jdom.Attribute[] elementData = {};
        setField(attributes, "org.jdom.AttributeList", "elementData", elementData);
        setField(attributes, "org.jdom.AttributeList", "size", 1);
        setField(element, "org.jdom.Element", "attributes", attributes);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.AttributeList.indexOf(AttributeList.java:381)
            org.jdom.AttributeList.get(AttributeList.java:366)
            org.jdom.Element.getAttribute(Element.java:981)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(JDOMNodePointer.java:526) */
        jDOMNodePointer.createAttribute(jXPathContextReferenceImpl, qName);
    }
    
    @Test
    public void testCreateAttribute6() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "xm\u0000";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute] produces [java.lang.NullPointerException]
            org.jdom.Element.getNamespacePrefix(Element.java:244)
            org.jdom.Element.getNamespace(Element.java:280)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(JDOMNodePointer.java:521) */
        jDOMNodePointer.createAttribute(jXPathContextReferenceImpl, qName);
    }
    
    @Test
    public void testCreateAttribute7() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute] produces [java.lang.NullPointerException]
            org.jdom.Element.getAttribute(Element.java:981)
            org.jdom.Element.getAttribute(Element.java:967)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(JDOMNodePointer.java:532) */
        jDOMNodePointer.createAttribute(null, qName);
    }
    
    @Test
    public void testCreateAttribute8() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix1 = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute] produces [java.lang.NullPointerException]
            org.jdom.Element.getAttribute(Element.java:981)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(JDOMNodePointer.java:526) */
        jDOMNodePointer.createAttribute(null, qName);
    }
    
    @Test
    public void testCreateAttribute9() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        ArrayList additionalNamespaces = new ArrayList();
        setField(element, "org.jdom.Element", "additionalNamespaces", additionalNamespaces);
        Element parent = ((Element) createInstance("org.jdom.Element"));
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute] produces [java.lang.NullPointerException]
            org.jdom.Element.getNamespacePrefix(Element.java:244)
            org.jdom.Element.getNamespace(Element.java:280)
            org.jdom.Element.getNamespace(Element.java:296)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(JDOMNodePointer.java:521) */
        jDOMNodePointer.createAttribute(null, qName);
    }
    
    @Test
    public void testCreateAttribute10() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        Object attributes = createInstance("org.jdom.AttributeList");
        org.jdom.Attribute[] elementData = new org.jdom.Attribute[9];
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        Namespace namespace1 = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(attribute, "org.jdom.Attribute", "namespace", namespace1);
        elementData[0] = attribute;
        setField(attributes, "org.jdom.AttributeList", "elementData", elementData);
        setField(attributes, "org.jdom.AttributeList", "size", 1);
        setField(element, "org.jdom.Element", "attributes", attributes);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute] produces [java.lang.NullPointerException]
            org.jdom.AttributeList.indexOf(AttributeList.java:384)
            org.jdom.AttributeList.get(AttributeList.java:366)
            org.jdom.Element.getAttribute(Element.java:981)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(JDOMNodePointer.java:526) */
        jDOMNodePointer.createAttribute(jXPathContextReferenceImpl, qName);
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
 * @utbot.executesCondition {@code (node instanceof Document): False}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.invokes {@link org.jdom.Element#getNamespace(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNamespaceURI_NodeInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (node instanceof Document): False}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNamespaceURI_NotNodeNotInstanceOfElement1() {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNamespaceURI_NodeInstanceOfDocument() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Element element = ((Element) createInstance("org.jdom.Element"));
        elementData[0] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI(((String) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNamespaceURI_NodeInstanceOfDocument_1() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        elementData[0] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        String string = "";
        
        String actual = jDOMNodePointer.getNamespaceURI(string);
        
        assertNull(actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        Content jDOMNodePointerNodeNodeContentNodeContentElementDataNodeContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeContentNodeContentElementData, 0));
        List finalJDOMNodePointerNodeContentElementData0AdditionalNamespaces = ((List) getFieldValue(jDOMNodePointerNodeNodeContentNodeContentElementDataNodeContentElementData0, "org.jdom.Element", "additionalNamespaces"));
        
        assertNull(finalJDOMNodePointerNodeContentElementData0AdditionalNamespaces);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link org.jdom.Namespace#getURI()}
 * @utbot.returnsFrom {@code return ns.getURI();}
 *  */
    @Test
    public void testGetNamespaceURI_NamespaceGetURI() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        elementData[0] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI(prefix);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNamespaceURI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link org.jdom.Document#getRootElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Element element = ((Document) node).getRootElement();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetNamespaceURI_ThrowIllegalStateException() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        jDOMNodePointer.getNamespaceURI(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNamespaceURI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link org.jdom.Document#getRootElement()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Element element = ((Document) node).getRootElement();
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.indexOfFirstElement(ContentList.java:412)
            org.jdom.Document.getRootElement(Document.java:216)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(JDOMNodePointer.java:115) */
        jDOMNodePointer.getNamespaceURI(((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNamespaceURI(java.lang.String)
    
    @Test
    public void testGetNamespaceURI1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        String string = "x\u0000\u0000";
        
        String actual = jDOMNodePointer.getNamespaceURI(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNamespaceURI2() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[11];
        Element element = ((Element) createInstance("org.jdom.Element"));
        elementData[2] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 3);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI(((String) null));
        
        assertNull(actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeContentNodeContentElementData, 0));
        Object jDOMNodePointerNode1 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode1NodeContent = getFieldValue(jDOMNodePointerNode1, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode1NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode1NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData1 = ((Content) get(jDOMNodePointerNode1NodeContentNodeContentElementData, 1));
        Object jDOMNodePointerNode2 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode2NodeContent = getFieldValue(jDOMNodePointerNode2, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode2NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode2NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData3 = ((Content) get(jDOMNodePointerNode2NodeContentNodeContentElementData, 3));
        Object jDOMNodePointerNode3 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode3NodeContent = getFieldValue(jDOMNodePointerNode3, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode3NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode3NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData4 = ((Content) get(jDOMNodePointerNode3NodeContentNodeContentElementData, 4));
        Object jDOMNodePointerNode4 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode4NodeContent = getFieldValue(jDOMNodePointerNode4, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode4NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode4NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData5 = ((Content) get(jDOMNodePointerNode4NodeContentNodeContentElementData, 5));
        Object jDOMNodePointerNode5 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode5NodeContent = getFieldValue(jDOMNodePointerNode5, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode5NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode5NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData6 = ((Content) get(jDOMNodePointerNode5NodeContentNodeContentElementData, 6));
        Object jDOMNodePointerNode6 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode6NodeContent = getFieldValue(jDOMNodePointerNode6, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode6NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode6NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData7 = ((Content) get(jDOMNodePointerNode6NodeContentNodeContentElementData, 7));
        Object jDOMNodePointerNode7 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode7NodeContent = getFieldValue(jDOMNodePointerNode7, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode7NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode7NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData8 = ((Content) get(jDOMNodePointerNode7NodeContentNodeContentElementData, 8));
        Object jDOMNodePointerNode8 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode8NodeContent = getFieldValue(jDOMNodePointerNode8, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode8NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode8NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData9 = ((Content) get(jDOMNodePointerNode8NodeContentNodeContentElementData, 9));
        Object jDOMNodePointerNode9 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode9NodeContent = getFieldValue(jDOMNodePointerNode9, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode9NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode9NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData10 = ((Content) get(jDOMNodePointerNode9NodeContentNodeContentElementData, 10));
        
        assertNull(finalJDOMNodePointerNodeContentElementData0);
        
        assertNull(finalJDOMNodePointerNodeContentElementData1);
        
        assertNull(finalJDOMNodePointerNodeContentElementData3);
        
        assertNull(finalJDOMNodePointerNodeContentElementData4);
        
        assertNull(finalJDOMNodePointerNodeContentElementData5);
        
        assertNull(finalJDOMNodePointerNodeContentElementData6);
        
        assertNull(finalJDOMNodePointerNodeContentElementData7);
        
        assertNull(finalJDOMNodePointerNodeContentElementData8);
        
        assertNull(finalJDOMNodePointerNodeContentElementData9);
        
        assertNull(finalJDOMNodePointerNodeContentElementData10);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNamespaceURI(java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testGetNamespaceURI3() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null, null, null, null, null, null, null, null, null, null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 3);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        jDOMNodePointer.getNamespaceURI(((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNamespaceURI(java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testGetNamespaceURI4() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[9];
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        setField(element, "org.jdom.Content", "parent", element);
        elementData[0] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        String string = "";
        
        jDOMNodePointer.getNamespaceURI(string);
    }
    
    @Test
    public void testGetNamespaceURI5() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        String string = "xm\u0000";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI] produces [java.lang.NullPointerException]
            org.jdom.Element.getNamespacePrefix(Element.java:244)
            org.jdom.Element.getNamespace(Element.java:280)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(JDOMNodePointer.java:123) */
        jDOMNodePointer.getNamespaceURI(string);
    }
    
    @Test
    public void testGetNamespaceURI6() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[9];
        Element element = ((Element) createInstance("org.jdom.Element"));
        elementData[0] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        String string = "xm\u0000";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI] produces [java.lang.NullPointerException]
            org.jdom.Element.getNamespacePrefix(Element.java:244)
            org.jdom.Element.getNamespace(Element.java:280)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(JDOMNodePointer.java:116) */
        jDOMNodePointer.getNamespaceURI(string);
    }
    
    @Test
    public void testGetNamespaceURI7() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[10];
        Element element = ((Element) createInstance("org.jdom.Element"));
        elementData[1] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 2);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI] produces [java.lang.NullPointerException] */
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
 * @utbot.executesCondition {@code (id != null): False}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Text || node instanceof CDATA): False}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(char)}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method asPath()
    
    @Test
    public void testAsPath1() {
        String string = "";
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, string);
        
        String actual = jDOMNodePointer.asPath();
        
        String expected = "id('')";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsPath2() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        String actual = jDOMNodePointer.asPath();
        
        String expected = "/processing-instruction('null')[1]";
        
        assertEquals(expected, actual);
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
        byte[][] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent] produces [java.lang.ClassCastException: class [[B cannot be cast to class org.jdom.Element ([[B is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(JDOMNodePointer.java:311) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(JDOMNodePointer.java:312) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(JDOMNodePointer.java:318) */
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer)}
     */
    @Test
    public void testChildIterator1() throws Exception  {
        Object object = new Object();
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale, "-3");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        jDOMNodePointer.setNamespaceResolver(namespaceResolver2);
        jDOMNodePointer.setIndex(1);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        JDOMAttributePointer jDOMAttributePointer = new JDOMAttributePointer(null, null);
        jDOMAttributePointer.setNamespaceResolver(null);
        jDOMAttributePointer.setIndex(Integer.MIN_VALUE);
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(jDOMAttributePointer, "10");
        NamespaceResolver namespaceResolver3 = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver4 = new NamespaceResolver(namespaceResolver3);
        jDOMNamespacePointer.setNamespaceResolver(namespaceResolver4);
        jDOMNamespacePointer.setIndex(-1);
        
        JDOMNodeIterator actual = ((JDOMNodeIterator) jDOMNodePointer.childIterator(nodeTypeTest, false, jDOMNamespacePointer));
        
        JDOMNodeIterator expected = ((JDOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object node = createInstance("java.lang.Object");
        setField(parent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node", node);
        String id = "-3";
        setField(parent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id", id);
        parent.setIndex(1);
        NamespaceResolver namespaceResolver5 = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent1 = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent2 = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        setField(parent2, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        setField(parent1, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent2);
        HashMap namespaceMap1 = new HashMap();
        setField(parent1, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap1);
        setField(namespaceResolver5, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent1);
        HashMap namespaceMap2 = new HashMap();
        setField(namespaceResolver5, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap2);
        parent.setNamespaceResolver(namespaceResolver5);
        Locale locale1 = ((Locale) createInstance("java.util.Locale"));
        BaseLocale baseLocale = ((BaseLocale) createInstance("sun.util.locale.BaseLocale"));
        setField(locale1, "java.util.Locale", "baseLocale", baseLocale);
        Locale defaultLocale = ((Locale) createInstance("java.util.Locale"));
        setField(locale1, "java.util.Locale", "defaultLocale", defaultLocale);
        Locale defaultFormatLocale = ((Locale) createInstance("java.util.Locale"));
        setField(locale1, "java.util.Locale", "defaultFormatLocale", defaultFormatLocale);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "locale", locale1);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent", parent);
        NodeTypeTest nodeTest = ((NodeTypeTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeTypeTest", "nodeType", 1);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "nodeTest", nodeTest);
        List children = new ArrayList();
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "children", children);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent"));
        Object expectedParentNode = getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        
        String expectedParentId = ((String) getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
        assertEquals(expectedParentId, actualParentId);
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NamespaceResolver expectedParentNamespaceResolver = expectedParent.getNamespaceResolver();
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        NamespaceResolver expectedParentNamespaceResolverParent = ((NamespaceResolver) getFieldValue(expectedParentNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        NamespaceResolver actualParentNamespaceResolverParent = ((NamespaceResolver) getFieldValue(actualParentNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        NamespaceResolver expectedParentNamespaceResolverParentParent = ((NamespaceResolver) getFieldValue(expectedParentNamespaceResolverParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        NamespaceResolver actualParentNamespaceResolverParentParent = ((NamespaceResolver) getFieldValue(actualParentNamespaceResolverParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        NamespaceResolver actualParentNamespaceResolverParentParentParent = ((NamespaceResolver) getFieldValue(actualParentNamespaceResolverParentParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualParentNamespaceResolverParentParentParent, actualParentNamespaceResolverParentParentParent));
        
        HashMap expectedParentNamespaceResolverParentParentNamespaceMap = ((HashMap) getFieldValue(expectedParentNamespaceResolverParentParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        HashMap actualParentNamespaceResolverParentParentNamespaceMap = ((HashMap) getFieldValue(actualParentNamespaceResolverParentParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedParentNamespaceResolverParentParentNamespaceMap, actualParentNamespaceResolverParentParentNamespaceMap));
        
        HashMap actualParentNamespaceResolverParentParentReverseMap = ((HashMap) getFieldValue(actualParentNamespaceResolverParentParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualParentNamespaceResolverParentParentReverseMap, actualParentNamespaceResolverParentParentReverseMap));
        
        NodePointer actualParentNamespaceResolverParentParentPointer = ((NodePointer) getFieldValue(actualParentNamespaceResolverParentParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualParentNamespaceResolverParentParentPointer, actualParentNamespaceResolverParentParentPointer));
        
        String actualParentNamespaceResolverParentParentDefaultNamespaceURI = actualParentNamespaceResolverParentParent.getDefaultNamespaceURI();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualParentNamespaceResolverParentParentDefaultNamespaceURI, actualParentNamespaceResolverParentParentDefaultNamespaceURI));
        
        boolean actualParentNamespaceResolverParentParentSealed = ((Boolean) getFieldValue(actualParentNamespaceResolverParentParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualParentNamespaceResolverParentParentSealed, actualParentNamespaceResolverParentParentSealed));
        
        HashMap expectedParentNamespaceResolverParentNamespaceMap = ((HashMap) getFieldValue(expectedParentNamespaceResolverParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        HashMap actualParentNamespaceResolverParentNamespaceMap = ((HashMap) getFieldValue(actualParentNamespaceResolverParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        assertTrue(deepEquals(expectedParentNamespaceResolverParentNamespaceMap, actualParentNamespaceResolverParentNamespaceMap));
        
        assertTrue(deepEquals(expectedParentNamespaceResolverParent, actualParentNamespaceResolverParent));
        assertTrue(deepEquals(expectedParentNamespaceResolverParent, actualParentNamespaceResolverParent));
        assertTrue(deepEquals(expectedParentNamespaceResolverParent, actualParentNamespaceResolverParent));
        assertTrue(deepEquals(expectedParentNamespaceResolverParent, actualParentNamespaceResolverParent));
        
        HashMap expectedParentNamespaceResolverNamespaceMap = ((HashMap) getFieldValue(expectedParentNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        HashMap actualParentNamespaceResolverNamespaceMap = ((HashMap) getFieldValue(actualParentNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        assertTrue(deepEquals(expectedParentNamespaceResolverNamespaceMap, actualParentNamespaceResolverNamespaceMap));
        
        assertTrue(deepEquals(expectedParentNamespaceResolver, actualParentNamespaceResolver));
        assertTrue(deepEquals(expectedParentNamespaceResolver, actualParentNamespaceResolver));
        assertTrue(deepEquals(expectedParentNamespaceResolver, actualParentNamespaceResolver));
        assertTrue(deepEquals(expectedParentNamespaceResolver, actualParentNamespaceResolver));
        
        NodePointer actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
        Locale expectedParentLocale = expectedParent.getLocale();
        Locale actualParentLocale = actualParent.getLocale();
        // java.util.Locale has overridden equals method
        assertEquals(expectedParentLocale, actualParentLocale);
        
        NodeTest expectedNodeTest = ((NodeTest) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "nodeTest"));
        NodeTest actualNodeTest = ((NodeTest) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "nodeTest"));
        int expectedNodeTestNodeType = (((NodeTypeTest) expectedNodeTest)).getNodeType();
        int actualNodeTestNodeType = (((NodeTypeTest) actualNodeTest)).getNodeType();
        assertEquals(expectedNodeTestNodeType, actualNodeTestNodeType);
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test
    public void testChildIterator2() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        JDOMNodeIterator actual = ((JDOMNodeIterator) jDOMNodePointer.childIterator(null, false, null));
        
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
    
    @Test
    public void testChildIterator3() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = ":";
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
    
    @Test
    public void testChildIterator4() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
            NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
            NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
            
            JDOMNodeIterator actual = ((JDOMNodeIterator) jDOMNodePointer.childIterator(nodeTypeTest, false, nullElementPointer));
            
            JDOMNodeIterator expected = ((JDOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator"));
            JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
            parent.setIndex(Integer.MIN_VALUE);
            setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent", parent);
            NodeTypeTest nodeTest = ((NodeTypeTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
            setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "nodeTest", nodeTest);
            List children = new ArrayList();
            setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "children", children);
            
            NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent"));
            NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent"));
            Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
            assertNull(actualParentNode);
            
            String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
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
            
            NodeTest expectedNodeTest = ((NodeTest) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "nodeTest"));
            NodeTest actualNodeTest = ((NodeTest) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "nodeTest"));
            int expectedNodeTestNodeType = (((NodeTypeTest) expectedNodeTest)).getNodeType();
            int actualNodeTestNodeType = (((NodeTypeTest) actualNodeTest)).getNodeType();
            assertEquals(expectedNodeTestNodeType, actualNodeTestNodeType);
            
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
            
        } finally {
            setStaticField(org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test
    public void testChildIterator5() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.childIterator] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.VariablePointer.access$000(VariablePointer.java:37)
            org.apache.commons.jxpath.ri.model.VariablePointer$1.getImmediateNode(VariablePointer.java:122)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:298)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator.<init>(JDOMNodeIterator.java:50)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.childIterator(JDOMNodePointer.java:82) */
        jDOMNodePointer.childIterator(nodeTypeTest, false, anonymousNullPointer);
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
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (s1 == s2): False}
 * @utbot.executesCondition {@code (s1 == null): False}
 * @utbot.executesCondition {@code (s2 == null): True}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return s1.equals(s2);}
 *  */
    @Test
    public void testEqualStrings_S2EqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equalStrings(java.lang.String, java.lang.String)
    
    @Test
    public void testEqualStrings1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        String string1 = "";
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = jDOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = string1;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testEqualStrings2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "!";
        
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)
    
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
        String string = "";
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(string);
        
        boolean actual = JDOMNodePointer.testNode(null, processingInstruction, processingInstructionTest);
        
        assertFalse(actual);
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
        String name = "*";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        boolean actual = JDOMNodePointer.testNode(null, element, nodeNameTest);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)
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
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType())}
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (test == null): False},
    ///     {@code (test instanceof NodeNameTest): False},
    ///     {@code (test instanceof NodeTypeTest): True}
    /// invoke:
    ///     {@link org.apache.commons.jxpath.ri.compiler.NodeTypeTest#getNodeType()} once
    /// activate {@code switch(((NodeTypeTest) test).getNodeType()) case: Compiler.NODE_TYPE_NODE}, return from: {@code return (node instanceof Element) || (node instanceof Document);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return (node instanceof Element) || (node instanceof Document);}
 *  */
    @Test
    public void testTestNode_NodeNotInstanceOfElementOrNodeNotInstanceOfDocument() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = JDOMNodePointer.testNode(null, element, nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return (node instanceof Element) || (node instanceof Document);}
 *  */
    @Test
    public void testTestNode_NodeNotInstanceOfElementOrNodeNotInstanceOfDocument_1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = JDOMNodePointer.testNode(null, null, nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return (node instanceof Element) || (node instanceof Document);}
 *  */
    @Test
    public void testTestNode_NodeInstanceOfElementOrNodeInstanceOfDocument() {
        Document document = new Document();
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = JDOMNodePointer.testNode(null, document, nodeTypeTest);
        
        assertTrue(actual);
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(JDOMNodePointer.java:389) */
        JDOMNodePointer.testNode(null, processingInstruction, processingInstructionTest);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    @Test
    public void testTestNode1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "\u0000";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        boolean actual = JDOMNodePointer.testNode(null, element, nodeNameTest);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    @Test
    public void testTestNode2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "*";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", prefix);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.jdom.Element.getNamespaceURI(Element.java:255)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(JDOMNodePointer.java:104)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(JDOMNodePointer.java:368) */
        JDOMNodePointer.testNode(null, element, nodeNameTest);
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
    public void testTestNode_ReturnTestNode_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
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
    public void testTestNode_ReturnTestNode() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
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
        Document document = new Document();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_6() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
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
    public void testTestNode_ReturnTestNode_3() {
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
    public void testTestNode_ReturnTestNode_5() {
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
    public void testTestNode_ReturnTestNode_4() {
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
    public void testTestNode_ReturnTestNode_7() {
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
    public void testTestNode_ReturnTestNode_8() throws Exception  {
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
    public void testTestNode_ReturnTestNode_9() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        boolean actual = jDOMNodePointer.testNode(nodeNameTest);
        
        assertFalse(actual);
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
        String name = "*";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        boolean actual = jDOMNodePointer.testNode(nodeNameTest);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)
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
    public void testTestNode_ReturnTestNode_11() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(4);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_12() {
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
    public void testTestNode_ReturnTestNode_13() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(3);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    @Test
    public void testTestNode3() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "*";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", prefix);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        boolean actual = jDOMNodePointer.testNode(nodeNameTest);
        
        assertTrue(actual);
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
        
        List actualAttributes = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes"));
        assertNull(actualAttributes);
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method attributeIterator(org.apache.commons.jxpath.ri.QName)
    
    @Test
    public void testAttributeIterator1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        JDOMAttributeIterator actual = ((JDOMAttributeIterator) jDOMNodePointer.attributeIterator(qName));
        
        JDOMAttributeIterator expected = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node", element);
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent", parent);
        List attributes = new ArrayList();
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent"));
        Object expectedParentNode = getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        String actualParentNodeName = (((Element) actualParentNode)).getName();
        assertNull(actualParentNodeName);
        
        Namespace expectedParentNodeNamespace = (((Element) expectedParentNode)).getNamespace();
        Namespace actualParentNodeNamespace = (((Element) actualParentNode)).getNamespace();
        // org.jdom.Namespace has overridden equals method
        assertEquals(expectedParentNodeNamespace, actualParentNodeNamespace);
        
        List actualParentNodeAdditionalNamespaces = (((Element) actualParentNode)).getAdditionalNamespaces();
        assertNull(actualParentNodeAdditionalNamespaces);
        
        Object actualParentNodeAttributes = getFieldValue(actualParentNode, "org.jdom.Element", "attributes");
        assertNull(actualParentNodeAttributes);
        
        Object actualParentNodeContent = getFieldValue(actualParentNode, "org.jdom.Element", "content");
        assertNull(actualParentNodeContent);
        
        Parent actualParentNodeParent = (((Content) actualParentNode)).getParent();
        assertNull(actualParentNodeParent);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
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
        
        List expectedAttributes = ((List) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes"));
        List actualAttributes = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method attributeIterator(org.apache.commons.jxpath.ri.QName)
    
    @Test
    public void testAttributeIterator2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String prefix = "\u0000\u0000\u0000";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.attributeIterator] produces [java.lang.NullPointerException] */
        jDOMNodePointer.attributeIterator(qName);
    }
    
    @Test
    public void testAttributeIterator3() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.attributeIterator] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.<init>(JDOMAttributeIterator.java:65)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.attributeIterator(JDOMNodePointer.java:86) */
        jDOMNodePointer.attributeIterator(qName);
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new JDOMNamespaceIterator(this);
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator.<init>(JDOMNamespaceIterator.java:46)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator(JDOMNodePointer.java:90) */
        jDOMNodePointer.namespaceIterator();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method namespaceIterator()
    
    @Test
    public void testNamespaceIterator1() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[10];
        Element element = ((Element) createInstance("org.jdom.Element"));
        elementData[1] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 2);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        JDOMNamespaceIterator actual = ((JDOMNamespaceIterator) jDOMNodePointer.namespaceIterator());
        
        JDOMNamespaceIterator expected = ((JDOMNamespaceIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node", document);
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent", parent);
        ArrayList namespaces = new ArrayList();
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces", namespaces);
        HashSet prefixes = new HashSet();
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes", prefixes);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent"));
        Object expectedParentNode = getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object expectedParentNodeContent = getFieldValue(expectedParentNode, "org.jdom.Document", "content");
        Object actualParentNodeContent = getFieldValue(actualParentNode, "org.jdom.Document", "content");
        org.jdom.Content[] expectedParentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(expectedParentNodeContent, "org.jdom.ContentList", "elementData"));
        org.jdom.Content[] actualParentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(actualParentNodeContent, "org.jdom.ContentList", "elementData"));
        int expectedParentNodeContentElementDataSize = expectedParentNodeContentElementData.length;
        assertEquals(expectedParentNodeContentElementDataSize, actualParentNodeContentElementData.length);
        assertTrue(deepEquals(expectedParentNodeContentElementData, actualParentNodeContentElementData));
        
        int expectedParentNodeContentSize = ((Integer) getFieldValue(expectedParentNodeContent, "org.jdom.ContentList", "size"));
        int actualParentNodeContentSize = ((Integer) getFieldValue(actualParentNodeContent, "org.jdom.ContentList", "size"));
        assertEquals(expectedParentNodeContentSize, actualParentNodeContentSize);
        
        Parent actualParentNodeContentParent = ((Parent) getFieldValue(actualParentNodeContent, "org.jdom.ContentList", "parent"));
        assertNull(actualParentNodeContentParent);
        
        int expectedParentNodeContentModCount = ((Integer) getFieldValue(expectedParentNodeContent, "java.util.AbstractList", "modCount"));
        int actualParentNodeContentModCount = ((Integer) getFieldValue(actualParentNodeContent, "java.util.AbstractList", "modCount"));
        assertEquals(expectedParentNodeContentModCount, actualParentNodeContentModCount);
        
        String actualParentNodeBaseURI = (((Document) actualParentNode)).getBaseURI();
        assertNull(actualParentNodeBaseURI);
        
        HashMap actualParentNodePropertyMap = ((HashMap) getFieldValue(actualParentNode, "org.jdom.Document", "propertyMap"));
        assertNull(actualParentNodePropertyMap);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
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
        
        List expectedNamespaces = ((List) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces"));
        List actualNamespaces = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces"));
        assertTrue(deepEquals(expectedNamespaces, actualNamespaces));
        
        Set expectedPrefixes = ((Set) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes"));
        Set actualPrefixes = ((Set) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes"));
        assertTrue(deepEquals(expectedPrefixes, actualPrefixes));
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeContentNodeContentElementData, 0));
        Object jDOMNodePointerNode1 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode1NodeContent = getFieldValue(jDOMNodePointerNode1, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode1NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode1NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData2 = ((Content) get(jDOMNodePointerNode1NodeContentNodeContentElementData, 2));
        Object jDOMNodePointerNode2 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode2NodeContent = getFieldValue(jDOMNodePointerNode2, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode2NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode2NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData3 = ((Content) get(jDOMNodePointerNode2NodeContentNodeContentElementData, 3));
        Object jDOMNodePointerNode3 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode3NodeContent = getFieldValue(jDOMNodePointerNode3, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode3NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode3NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData4 = ((Content) get(jDOMNodePointerNode3NodeContentNodeContentElementData, 4));
        Object jDOMNodePointerNode4 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode4NodeContent = getFieldValue(jDOMNodePointerNode4, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode4NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode4NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData5 = ((Content) get(jDOMNodePointerNode4NodeContentNodeContentElementData, 5));
        Object jDOMNodePointerNode5 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode5NodeContent = getFieldValue(jDOMNodePointerNode5, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode5NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode5NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData6 = ((Content) get(jDOMNodePointerNode5NodeContentNodeContentElementData, 6));
        Object jDOMNodePointerNode6 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode6NodeContent = getFieldValue(jDOMNodePointerNode6, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode6NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode6NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData7 = ((Content) get(jDOMNodePointerNode6NodeContentNodeContentElementData, 7));
        Object jDOMNodePointerNode7 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode7NodeContent = getFieldValue(jDOMNodePointerNode7, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode7NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode7NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData8 = ((Content) get(jDOMNodePointerNode7NodeContentNodeContentElementData, 8));
        Object jDOMNodePointerNode8 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode8NodeContent = getFieldValue(jDOMNodePointerNode8, "org.jdom.Document", "content");
        org.jdom.Content[] jDOMNodePointerNode8NodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode8NodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData9 = ((Content) get(jDOMNodePointerNode8NodeContentNodeContentElementData, 9));
        
        assertNull(finalJDOMNodePointerNodeContentElementData0);
        
        assertNull(finalJDOMNodePointerNodeContentElementData2);
        
        assertNull(finalJDOMNodePointerNodeContentElementData3);
        
        assertNull(finalJDOMNodePointerNodeContentElementData4);
        
        assertNull(finalJDOMNodePointerNodeContentElementData5);
        
        assertNull(finalJDOMNodePointerNodeContentElementData6);
        
        assertNull(finalJDOMNodePointerNodeContentElementData7);
        
        assertNull(finalJDOMNodePointerNodeContentElementData8);
        
        assertNull(finalJDOMNodePointerNodeContentElementData9);
    }
    
    @Test
    public void testNamespaceIterator2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        JDOMNamespaceIterator actual = ((JDOMNamespaceIterator) jDOMNodePointer.namespaceIterator());
        
        JDOMNamespaceIterator expected = ((JDOMNamespaceIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node", element);
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent", parent);
        ArrayList namespaces = new ArrayList();
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces", namespaces);
        HashSet prefixes = new HashSet();
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes", prefixes);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent"));
        Object expectedParentNode = getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        String actualParentNodeName = (((Element) actualParentNode)).getName();
        assertNull(actualParentNodeName);
        
        Namespace actualParentNodeNamespace = (((Element) actualParentNode)).getNamespace();
        assertNull(actualParentNodeNamespace);
        
        List actualParentNodeAdditionalNamespaces = (((Element) actualParentNode)).getAdditionalNamespaces();
        assertNull(actualParentNodeAdditionalNamespaces);
        
        Object actualParentNodeAttributes = getFieldValue(actualParentNode, "org.jdom.Element", "attributes");
        assertNull(actualParentNodeAttributes);
        
        Object actualParentNodeContent = getFieldValue(actualParentNode, "org.jdom.Element", "content");
        assertNull(actualParentNodeContent);
        
        Parent actualParentNodeParent = (((Content) actualParentNode)).getParent();
        assertNull(actualParentNodeParent);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
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
        
        List expectedNamespaces = ((List) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces"));
        List actualNamespaces = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces"));
        assertTrue(deepEquals(expectedNamespaces, actualNamespaces));
        
        Set expectedPrefixes = ((Set) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes"));
        Set actualPrefixes = ((Set) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes"));
        assertTrue(deepEquals(expectedPrefixes, actualPrefixes));
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        List finalJDOMNodePointerNodeAdditionalNamespaces = ((List) getFieldValue(jDOMNodePointerNode, "org.jdom.Element", "additionalNamespaces"));
        
        assertNull(finalJDOMNodePointerNodeAdditionalNamespaces);
    }
    
    @Test
    public void testNamespaceIterator3() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        JDOMNamespaceIterator actual = ((JDOMNamespaceIterator) jDOMNodePointer.namespaceIterator());
        
        JDOMNamespaceIterator expected = ((JDOMNamespaceIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node", element);
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent", parent);
        ArrayList namespaces = new ArrayList();
        namespaces.add(namespace);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces", namespaces);
        HashSet prefixes = new HashSet();
        prefixes.add(prefix);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes", prefixes);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent"));
        Object expectedParentNode = getFieldValue(expectedParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        String actualParentNodeName = (((Element) actualParentNode)).getName();
        assertNull(actualParentNodeName);
        
        Namespace expectedParentNodeNamespace = (((Element) expectedParentNode)).getNamespace();
        Namespace actualParentNodeNamespace = (((Element) actualParentNode)).getNamespace();
        // org.jdom.Namespace has overridden equals method
        assertEquals(expectedParentNodeNamespace, actualParentNodeNamespace);
        
        List actualParentNodeAdditionalNamespaces = (((Element) actualParentNode)).getAdditionalNamespaces();
        assertNull(actualParentNodeAdditionalNamespaces);
        
        Object actualParentNodeAttributes = getFieldValue(actualParentNode, "org.jdom.Element", "attributes");
        assertNull(actualParentNodeAttributes);
        
        Object actualParentNodeContent = getFieldValue(actualParentNode, "org.jdom.Element", "content");
        assertNull(actualParentNodeContent);
        
        Parent actualParentNodeParent = (((Content) actualParentNode)).getParent();
        assertNull(actualParentNodeParent);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
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
        
        List expectedNamespaces = ((List) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces"));
        List actualNamespaces = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces"));
        assertTrue(deepEquals(expectedNamespaces, actualNamespaces));
        
        Set expectedPrefixes = ((Set) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes"));
        Set actualPrefixes = ((Set) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes"));
        assertTrue(deepEquals(expectedPrefixes, actualPrefixes));
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method namespaceIterator()
    
    @Test(expected = IllegalStateException.class)
    public void testNamespaceIterator4() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null, null, null, null, null, null, null, null, null, null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 3);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        jDOMNodePointer.namespaceIterator();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method namespaceIterator()
    
    @Test
    public void testNamespaceIterator5() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 2);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jdom.ContentList.indexOfFirstElement(ContentList.java:412)
            org.jdom.Document.getRootElement(Document.java:216)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator.<init>(JDOMNamespaceIterator.java:46)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator(JDOMNodePointer.java:90) */
        jDOMNodePointer.namespaceIterator();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testNamespaceIterator6() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        jDOMNodePointer.namespaceIterator();
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
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAbstractFactory(org.apache.commons.jxpath.JXPathContext)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getAbstractFactory(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.invokes {@link org.apache.commons.jxpath.JXPathContext#getFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AbstractFactory factory = context.getFactory();
 *  */
    @Test
    public void testGetAbstractFactory_ThrowNullPointerException() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(JDOMNodePointer.java:747) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class jXPathContextType = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Method getAbstractFactoryMethod = jDOMNodePointerClazz.getDeclaredMethod("getAbstractFactory", jXPathContextType);
        getAbstractFactoryMethod.setAccessible(true);
        java.lang.Object[] getAbstractFactoryMethodArguments = new java.lang.Object[1];
        getAbstractFactoryMethodArguments[0] = ((Object) null);
        try {
            getAbstractFactoryMethod.invoke(jDOMNodePointer, getAbstractFactoryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getAbstractFactory(org.apache.commons.jxpath.JXPathContext)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getAbstractFactory(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: asPath()
 *  */
    @Test(expected = JXPathException.class)
    public void testGetAbstractFactory_ThrowJXPathException() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class jXPathContextReferenceImplType = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Method getAbstractFactoryMethod = jDOMNodePointerClazz.getDeclaredMethod("getAbstractFactory", jXPathContextReferenceImplType);
        getAbstractFactoryMethod.setAccessible(true);
        java.lang.Object[] getAbstractFactoryMethodArguments = new java.lang.Object[1];
        getAbstractFactoryMethodArguments[0] = jXPathContextReferenceImpl;
        try {
            getAbstractFactoryMethod.invoke(jDOMNodePointer, getAbstractFactoryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getAbstractFactory(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: asPath()
 *  */
    @Test(expected = JXPathException.class)
    public void testGetAbstractFactory_ThrowJXPathException_1() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class jXPathContextReferenceImplType = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Method getAbstractFactoryMethod = jDOMNodePointerClazz.getDeclaredMethod("getAbstractFactory", jXPathContextReferenceImplType);
        getAbstractFactoryMethod.setAccessible(true);
        java.lang.Object[] getAbstractFactoryMethodArguments = new java.lang.Object[1];
        getAbstractFactoryMethodArguments[0] = jXPathContextReferenceImpl;
        try {
            getAbstractFactoryMethod.invoke(jDOMNodePointer, getAbstractFactoryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(JDOMNodePointer.java:747)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:480) */
        jDOMNodePointer.createChild(null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(JDOMNodePointer.java:747)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:480) */
        jDOMNodePointer.createChild(null, null, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException_1() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(JDOMNodePointer.java:747)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:480)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:508) */
        jDOMNodePointer.createChild(null, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException_11() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getAbstractFactory(JDOMNodePointer.java:747)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:480)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:508) */
        jDOMNodePointer.createChild(null, null, Integer.MIN_VALUE, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException1() throws Exception  {
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
    public void testCreateChild_ThrowJXPathException_11() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255, null);
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:463) */
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:466) */
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
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        elementData[0] = ((Content) cdata);
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.CDATA ([B is in module java.base of loader 'bootstrap'; org.jdom.CDATA is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode(JDOMNodePointer.java:688) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode(JDOMNodePointer.java:688) */
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
 *  */
    @Test
    public void testCompareChildNodePointers_Node1EqualsNode2() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(nullPointer, nullPointer);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): True}
 * @utbot.executesCondition {@code (node2 instanceof Attribute): True}
 *  */
    @Test
    public void testCompareChildNodePointers_Node2InstanceOfAttribute() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): True}
 * @utbot.executesCondition {@code (!(node2 instanceof Attribute)): True}
 *  */
    @Test
    public void testCompareChildNodePointers_NotNode2InstanceOfAttribute() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(dynamicPointer, nullPointer);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): True}
 *  */
    @Test
    public void testCompareChildNodePointers_Node1EqualsNode2_1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), ((Object) null), ((DynamicPropertyHandler) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): True}
 * @utbot.executesCondition {@code (node2 instanceof Attribute): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 *  */
    @Test
    public void testCompareChildNodePointers_NEqualsNode1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        byte[] byteArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), byteArray, ((DynamicPropertyHandler) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
        
        assertEquals(-1, actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Element", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeContentNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeContentNodeContentElementData, 0));
        
        assertNull(finalJDOMNodePointerNodeContentElementData0);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): True}
 * @utbot.executesCondition {@code (node2 instanceof Attribute): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 *  */
    @Test
    public void testCompareChildNodePointers_NEqualsNode2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        EntityRef entityRef = ((EntityRef) createInstance("org.jdom.EntityRef"));
        elementData[0] = ((Content) entityRef);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), entityRef, ((DynamicPropertyHandler) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): True}
 * @utbot.executesCondition {@code (node2 instanceof Attribute): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 *  */
    @Test
    public void testCompareChildNodePointers_NNotEqualsNode2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        elementData[0] = ((Content) processingInstruction);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        byte[] byteArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), byteArray, ((DynamicPropertyHandler) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): True}
 * @utbot.executesCondition {@code (!(node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 *  */
    @Test
    public void testCompareChildNodePointers_NEqualsNode1_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object attributes = createInstance("org.jdom.AttributeList");
        org.jdom.Attribute[] elementData = new org.jdom.Attribute[1];
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        elementData[0] = attribute;
        setField(attributes, "org.jdom.AttributeList", "elementData", elementData);
        setField(attributes, "org.jdom.AttributeList", "size", 1);
        setField(element, "org.jdom.Element", "attributes", attributes);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        Attribute attribute1 = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), attribute1, ((DynamicPropertyHandler) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): True}
 * @utbot.executesCondition {@code (!(node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 *  */
    @Test
    public void testCompareChildNodePointers_NEqualsNode2_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object attributes = createInstance("org.jdom.AttributeList");
        org.jdom.Attribute[] elementData = new org.jdom.Attribute[1];
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        elementData[0] = attribute;
        setField(attributes, "org.jdom.AttributeList", "elementData", elementData);
        setField(attributes, "org.jdom.AttributeList", "size", 1);
        setField(element, "org.jdom.Element", "attributes", attributes);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Attribute attribute1 = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute1, ((DynamicPropertyHandler) null));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): True}
 * @utbot.executesCondition {@code (!(node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 *  */
    @Test
    public void testCompareChildNodePointers_NNotEqualsNode2_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object attributes = createInstance("org.jdom.AttributeList");
        org.jdom.Attribute[] elementData = {null};
        setField(attributes, "org.jdom.AttributeList", "elementData", elementData);
        setField(attributes, "org.jdom.AttributeList", "size", 1);
        setField(element, "org.jdom.Element", "attributes", attributes);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        Attribute attribute1 = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), attribute1, ((DynamicPropertyHandler) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
        
        assertEquals(0, actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeAttributes = getFieldValue(jDOMNodePointerNode, "org.jdom.Element", "attributes");
        org.jdom.Attribute[] jDOMNodePointerNodeNodeAttributesNodeAttributesElementData = ((org.jdom.Attribute[]) getFieldValue(jDOMNodePointerNodeNodeAttributes, "org.jdom.AttributeList", "elementData"));
        Attribute finalJDOMNodePointerNodeAttributesElementData0 = ((Attribute) get(jDOMNodePointerNodeNodeAttributesNodeAttributesElementData, 0));
        
        assertNull(finalJDOMNodePointerNodeAttributesElementData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): True}
 * @utbot.executesCondition {@code (node2 instanceof Attribute): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object n = children.get(i);
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        byte[] byteArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), byteArray, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.get(ContentList.java:389)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:174) */
        jDOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): True}
 * @utbot.executesCondition {@code (!(node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List list = ((Element) getNode()).getAttributes();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowClassCastException() throws Exception  {
        byte[] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        Attribute attribute1 = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), attribute1, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.Element ([B is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:150) */
        jDOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): True}
 * @utbot.executesCondition {@code (!(node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object n = list.get(i);
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object attributes = createInstance("org.jdom.AttributeList");
        org.jdom.Attribute[] elementData = {};
        setField(attributes, "org.jdom.AttributeList", "elementData", elementData);
        setField(attributes, "org.jdom.AttributeList", "size", 1);
        setField(element, "org.jdom.Element", "attributes", attributes);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        Attribute attribute1 = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), attribute1, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.AttributeList.get(AttributeList.java:354)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:153) */
        jDOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
    }
    
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:135) */
        jDOMNodePointer.compareChildNodePointers(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object node2 = pointer2.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:136) */
        jDOMNodePointer.compareChildNodePointers(nullPointer, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object node2 = pointer2.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_3() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        byte[] byteArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), byteArray, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:136) */
        jDOMNodePointer.compareChildNodePointers(dynamicPointer, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object node2 = pointer2.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_6() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        byte[] byteArray = {};
        BeanPointer beanPointer = new BeanPointer(((QName) null), byteArray, ((JXPathBeanInfo) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:136) */
        jDOMNodePointer.compareChildNodePointers(beanPointer, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): True}
 * @utbot.executesCondition {@code (node2 instanceof Attribute): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int length = children.size();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        byte[] byteArray = {};
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), byteArray, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:172) */
        jDOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): True}
 * @utbot.executesCondition {@code (!(node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): True}
 * @utbot.invokes {@link org.jdom.Element#getAttributes()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List list = ((Element) getNode()).getAttributes();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_4() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        Attribute attribute1 = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), attribute1, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:150) */
        jDOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): True}
 * @utbot.executesCondition {@code (!(node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int length = list.size();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_5() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), attribute, ((DynamicPropertyHandler) null));
        Attribute attribute1 = ((Attribute) createInstance("org.jdom.Attribute"));
        DynamicPointer dynamicPointer1 = new DynamicPointer(((NodePointer) null), ((QName) null), attribute1, ((DynamicPropertyHandler) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:151) */
        jDOMNodePointer.compareChildNodePointers(dynamicPointer, dynamicPointer1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): False}
 * @utbot.executesCondition {@code (node1 instanceof Attribute): False}
 * @utbot.executesCondition {@code (!(node1 instanceof Attribute)): True}
 * @utbot.executesCondition {@code (node2 instanceof Attribute): False}
 * @utbot.executesCondition {@code ((node1 instanceof Attribute) && (node2 instanceof Attribute)): False}
 * @utbot.executesCondition {@code (!(node instanceof Element)): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.RuntimeException} when: !(node instanceof Element)
 *  */
    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_ThrowRuntimeException() {
        int[] intArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(intArray, null, null);
        NullPointer nullPointer = new NullPointer(((Locale) null), ((String) null));
        DynamicPointer dynamicPointer = new DynamicPointer(((NodePointer) null), ((QName) null), intArray, ((DynamicPropertyHandler) null));
        
        jDOMNodePointer.compareChildNodePointers(nullPointer, dynamicPointer);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
     */
    @Test
    public void testCompareChildNodePointersThrowsNPE() {
        Object object = new Object();
        Locale locale = new Locale("\n\t\r", "");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale, "JXPath internal error: compareChildNodes called for ");
        DOMNodePointer dOMNodePointer = new DOMNodePointer(((Node) null), ((Locale) null));
        dOMNodePointer.setIndex(1);
        dOMNodePointer.setNamespaceResolver(null);
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(dOMNodePointer, "\n\t\r");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        jDOMNamespacePointer.setNamespaceResolver(namespaceResolver1);
        jDOMNamespacePointer.setIndex(Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:136) */
        jDOMNodePointer.compareChildNodePointers(jDOMNamespacePointer, null);
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.Element ([B is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:658) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:671) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:667) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:658) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:670) */
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
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfPI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ParentEqualsNull() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
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
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ChildEqualsNode() throws Exception  {
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
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ChildNotEqualsNode() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
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
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
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
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(0, actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Parent jDOMNodePointerNodeNodeParent = ((Parent) getFieldValue(jDOMNodePointerNode, "org.jdom.Content", "parent"));
        Object jDOMNodePointerNodeNodeParentNodeParentContent = getFieldValue(jDOMNodePointerNodeNodeParent, "org.jdom.Element", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeParentNodeParentContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeParentContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData, 0));
        
        assertNull(finalJDOMNodePointerNodeParentContentElementData0);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_TargetEquals() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        String target = " ";
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
        Class targetType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", targetType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = target;
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_NotTargetEquals() throws Exception  {
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
        String string = " ";
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = string;
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionOfPI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element parent = (Element) ((ProcessingInstruction) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowClassCastException() throws Throwable  {
        byte[] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.ProcessingInstruction ([B is in module java.base of loader 'bootstrap'; org.jdom.ProcessingInstruction is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:708) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element parent = (Element) ((ProcessingInstruction) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowClassCastException_1() throws Throwable  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:708) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:715) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
 * @utbot.invokes {@link org.jdom.ProcessingInstruction#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element parent = (Element) ((ProcessingInstruction) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowNullPointerException() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:708) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI(java.lang.String)}
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:714) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI", stringType);
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[1];
        getRelativePositionOfPIMethodArguments[0] = ((Object) null);
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionByName()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByName()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 *  */
    @Test
    public void testGetRelativePositionByName_NotNodeNotInstanceOfElement() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(jDOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByName()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (!(parent instanceof Element)): True}
 *  */
    @Test
    public void testGetRelativePositionByName_NotParentInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(jDOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByName()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (!(parent instanceof Element)): False}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByName_ParentNotInstanceOfElement() throws Exception  {
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
        Method getRelativePositionByNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(jDOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByName()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (!(parent instanceof Element)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByName_ChildNotEqualsNode() throws Exception  {
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
        Method getRelativePositionByNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByNameMethod.invoke(jDOMNodePointer, getRelativePositionByNameMethodArguments));
        
        assertEquals(0, actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Parent jDOMNodePointerNodeNodeParent = ((Parent) getFieldValue(jDOMNodePointerNode, "org.jdom.Content", "parent"));
        Object jDOMNodePointerNodeNodeParentNodeParentContent = getFieldValue(jDOMNodePointerNodeNodeParent, "org.jdom.Element", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeParentNodeParentContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeParentContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData, 0));
        
        assertNull(finalJDOMNodePointerNodeParentContentElementData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionByName()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByName()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object child = children.get(i);
 *  */
    @Test
    public void testGetRelativePositionByName_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.get(ContentList.java:389)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName(JDOMNodePointer.java:643) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByNameMethod.invoke(jDOMNodePointer, getRelativePositionByNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < children.size(); i++)
 *  */
    @Test
    public void testGetRelativePositionByName_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName(JDOMNodePointer.java:642) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByNameMethod.invoke(jDOMNodePointer, getRelativePositionByNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByName()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ((Element) child).getQualifiedName().equals(name)
 *  */
    @Test
    public void testGetRelativePositionByName_ThrowNullPointerException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace1 = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix1 = "";
        setField(namespace1, "org.jdom.Namespace", "prefix", prefix1);
        setField(parent, "org.jdom.Element", "namespace", namespace1);
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        elementData[0] = ((Content) parent);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByName(JDOMNodePointer.java:645) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByName");
        getRelativePositionByNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByNameMethod.invoke(jDOMNodePointer, getRelativePositionByNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:463)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove(JDOMNodePointer.java:543) */
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:466)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove(JDOMNodePointer.java:543) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove(JDOMNodePointer.java:547) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove(JDOMNodePointer.java:547) */
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
 * @utbot.invokes {@link java.lang.System#identityHashCode(java.lang.Object)}
 * @utbot.returnsFrom {@code return System.identityHashCode(node);}
 *  */
    @Test
    public void testHashCode_SystemIdentityHashCode() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        int actual = jDOMNodePointer.hashCode();
        
        assertEquals(0, actual);
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
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Comment): False}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (node instanceof CDATA): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetValue_NotNodeNotInstanceOfProcessingInstruction() {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        
        Object actual = jDOMNodePointer.getValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.returnsFrom {@code return ((Element) node).getTextTrim();}
 *  */
    @Test
    public void testGetValue_NodeInstanceOfElement_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        String actual = ((String) jDOMNodePointer.getValue());
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.returnsFrom {@code return ((Element) node).getTextTrim();}
 *  */
    @Test
    public void testGetValue_NodeInstanceOfElement_2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(content, "org.jdom.ContentList", "size", -2147483647);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        String actual = ((String) jDOMNodePointer.getValue());
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Comment): False}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (node instanceof CDATA): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): True}
 * @utbot.executesCondition {@code (if (text != null) {
 *     text = text.trim();
 * }): False}
 * @utbot.returnsFrom {@code return text;}
 *  */
    @Test
    public void testGetValue_TextEqualsNull() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        Object actual = jDOMNodePointer.getValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Comment): True}
 * @utbot.executesCondition {@code (text != null): False}
 * @utbot.returnsFrom {@code return text;}
 *  */
    @Test
    public void testGetValue_TextEqualsNull_1() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        Object actual = jDOMNodePointer.getValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Comment): False}
 * @utbot.executesCondition {@code (node instanceof Text): True}
 * @utbot.returnsFrom {@code return ((Text) node).getTextTrim();}
 *  */
    @Test
    public void testGetValue_NodeInstanceOfText() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        String value = "!";
        setField(cdata, "org.jdom.Text", "value", value);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        String actual = ((String) jDOMNodePointer.getValue());
        
        assertEquals(value, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.returnsFrom {@code return ((Element) node).getTextTrim();}
 *  */
    @Test
    public void testGetValue_NodeInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Text text = ((Text) createInstance("org.jdom.Text"));
        String value = "!";
        setField(text, "org.jdom.Text", "value", value);
        elementData[0] = ((Content) text);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        String actual = ((String) jDOMNodePointer.getValue());
        
        assertEquals(value, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Comment): False}
 * @utbot.executesCondition {@code (node instanceof Text): True}
 * @utbot.returnsFrom {@code return ((Text) node).getTextTrim();}
 *  */
    @Test
    public void testGetValue_NodeInstanceOfText_1() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        String value = " ";
        setField(cdata, "org.jdom.Text", "value", value);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        String actual = ((String) jDOMNodePointer.getValue());
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Comment): True}
 * @utbot.executesCondition {@code (text != null): True}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return text;}
 *  */
    @Test
    public void testGetValue_TextNotEqualsNull() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        String text = "!";
        setField(comment, "org.jdom.Comment", "text", text);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        String actual = ((String) jDOMNodePointer.getValue());
        
        assertEquals(text, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Comment): False}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (node instanceof CDATA): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): True}
 * @utbot.executesCondition {@code (if (text != null) {
 *     text = text.trim();
 * }): True}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return text;}
 *  */
    @Test
    public void testGetValue_TextNotEqualsNull_1() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        String rawData = "";
        setField(processingInstruction, "org.jdom.ProcessingInstruction", "rawData", rawData);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        String actual = ((String) jDOMNodePointer.getValue());
        
        assertEquals(rawData, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return ((Element) node).getTextTrim();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.get(ContentList.java:389)
            org.jdom.Element.getText(Element.java:457)
            org.jdom.Element.getTextTrim(Element.java:494)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue(JDOMNodePointer.java:240) */
        jDOMNodePointer.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return ((Element) node).getTextTrim();
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 2);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.get(ContentList.java:389)
            org.jdom.Element.getText(Element.java:470)
            org.jdom.Element.getTextTrim(Element.java:494)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue(JDOMNodePointer.java:240) */
        jDOMNodePointer.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return ((Element) node).getTextTrim();
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Text text = ((Text) createInstance("org.jdom.Text"));
        String value = "";
        setField(text, "org.jdom.Text", "value", value);
        elementData[0] = ((Content) text);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 2);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        jDOMNodePointer.getValue();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return ((Element) node).getTextTrim();
 *  */
    @Test
    public void testGetValue_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Text text = ((Text) createInstance("org.jdom.Text"));
        elementData[0] = ((Content) text);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 2);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        jDOMNodePointer.getValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value instanceof ProcessingInstruction): False}
 * @utbot.executesCondition {@code (value instanceof Comment): True}
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
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value instanceof ProcessingInstruction): True}
 * @utbot.invokes {@link org.jdom.ProcessingInstruction#clone()}
 *  */
    @Test
    public void testSetValue_ValueInstanceOfProcessingInstruction() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Element", "content");
        org.jdom.Content[] initialJDOMNodePointerNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        
        jDOMNodePointer.setValue(processingInstruction);
        
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
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.Element ([B is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:276) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:277) */
        jDOMNodePointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.getContent().clear();
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:277) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:277) */
        jDOMNodePointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value instanceof Element): True}
 * @utbot.invokes {@link org.jdom.Element#getContent()}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#addContent(java.util.List)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addContent(valueElement.getContent());
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Element element1 = ((Element) createInstance("org.jdom.Element"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(JDOMNodePointer.java:312)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:281) */
        jDOMNodePointer.setValue(element1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (value instanceof Element): False}
 * @utbot.executesCondition {@code (value instanceof Document): True}
 * @utbot.invokes {@link org.jdom.Element#getContent()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link org.jdom.Document#getContent()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: addContent(valueDocument.getContent());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetValue_ThrowIllegalStateException() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content1 = createInstance("org.jdom.ContentList");
        setField(document, "org.jdom.Document", "content", content1);
        
        jDOMNodePointer.setValue(document);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Object)
    
    @Test
    public void testSetValue1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null, null, null, null, null, null, null, null, null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", -2147483647);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Element element1 = ((Element) createInstance("org.jdom.Element"));
        Object content1 = createInstance("org.jdom.ContentList");
        setField(element1, "org.jdom.Element", "content", content1);
        
        jDOMNodePointer.setValue(element1);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Element", "content");
        org.jdom.Content[] finalJDOMNodePointerNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        Object jDOMNodePointerNode1 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode1NodeContent = getFieldValue(jDOMNodePointerNode1, "org.jdom.Element", "content");
        int finalJDOMNodePointerNodeContentSize = ((Integer) getFieldValue(jDOMNodePointerNode1NodeContent, "org.jdom.ContentList", "size"));
        Object jDOMNodePointerNode2 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode2NodeContent = getFieldValue(jDOMNodePointerNode2, "org.jdom.Element", "content");
        int finalJDOMNodePointerNodeContentModCount = ((Integer) getFieldValue(jDOMNodePointerNode2NodeContent, "java.util.AbstractList", "modCount"));
        
        assertNull(finalJDOMNodePointerNodeContentElementData);
        
        assertEquals(0, finalJDOMNodePointerNodeContentSize);
        
        assertEquals(1, finalJDOMNodePointerNodeContentModCount);
    }
    
    @Test
    public void testSetValue2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
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
        int finalJDOMNodePointerNodeContentModCount = ((Integer) getFieldValue(jDOMNodePointerNode2NodeContent, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialJDOMNodePointerNodeContentElementData == finalJDOMNodePointerNodeContentElementData);
        
        assertEquals(2, finalJDOMNodePointerNodeContentModCount);
    }
    
    @Test
    public void testSetValue3() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null, null, null, null, null, null, null, null, null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", -2147483647);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content1 = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData1 = new org.jdom.Content[9];
        Element element1 = ((Element) createInstance("org.jdom.Element"));
        elementData1[0] = ((Content) element1);
        setField(content1, "org.jdom.ContentList", "elementData", elementData1);
        setField(content1, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content1);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Element", "content");
        org.jdom.Content[] initialJDOMNodePointerNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        
        jDOMNodePointer.setValue(document);
        
        Object jDOMNodePointerNode1 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode1NodeContent = getFieldValue(jDOMNodePointerNode1, "org.jdom.Element", "content");
        org.jdom.Content[] finalJDOMNodePointerNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode1NodeContent, "org.jdom.ContentList", "elementData"));
        Object jDOMNodePointerNode2 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode2NodeContent = getFieldValue(jDOMNodePointerNode2, "org.jdom.Element", "content");
        int finalJDOMNodePointerNodeContentSize = ((Integer) getFieldValue(jDOMNodePointerNode2NodeContent, "org.jdom.ContentList", "size"));
        Object jDOMNodePointerNode3 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode3NodeContent = getFieldValue(jDOMNodePointerNode3, "org.jdom.Element", "content");
        int finalJDOMNodePointerNodeContentModCount = ((Integer) getFieldValue(jDOMNodePointerNode3NodeContent, "java.util.AbstractList", "modCount"));
        
        Object documentContent = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContentContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData1 = ((Content) get(documentContentContentElementData, 1));
        Object documentContent1 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent1ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent1, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData2 = ((Content) get(documentContent1ContentElementData, 2));
        Object documentContent2 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent2ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent2, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData3 = ((Content) get(documentContent2ContentElementData, 3));
        Object documentContent3 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent3ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent3, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData4 = ((Content) get(documentContent3ContentElementData, 4));
        Object documentContent4 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent4ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent4, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData5 = ((Content) get(documentContent4ContentElementData, 5));
        Object documentContent5 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent5ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent5, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData6 = ((Content) get(documentContent5ContentElementData, 6));
        Object documentContent6 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent6ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent6, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData7 = ((Content) get(documentContent6ContentElementData, 7));
        Object documentContent7 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent7ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent7, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData8 = ((Content) get(documentContent7ContentElementData, 8));
        
        assertFalse(initialJDOMNodePointerNodeContentElementData == finalJDOMNodePointerNodeContentElementData);
        
        assertEquals(1, finalJDOMNodePointerNodeContentSize);
        
        assertEquals(2, finalJDOMNodePointerNodeContentModCount);
        
        assertNull(finalDocumentContentElementData1);
        
        assertNull(finalDocumentContentElementData2);
        
        assertNull(finalDocumentContentElementData3);
        
        assertNull(finalDocumentContentElementData4);
        
        assertNull(finalDocumentContentElementData5);
        
        assertNull(finalDocumentContentElementData6);
        
        assertNull(finalDocumentContentElementData7);
        
        assertNull(finalDocumentContentElementData8);
    }
    
    @Test
    public void testSetValue4() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content1 = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[9];
        Element element1 = ((Element) createInstance("org.jdom.Element"));
        elementData[0] = ((Content) element1);
        setField(content1, "org.jdom.ContentList", "elementData", elementData);
        setField(content1, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content1);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Element", "content");
        org.jdom.Content[] initialJDOMNodePointerNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        
        jDOMNodePointer.setValue(document);
        
        Object jDOMNodePointerNode1 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode1NodeContent = getFieldValue(jDOMNodePointerNode1, "org.jdom.Element", "content");
        org.jdom.Content[] finalJDOMNodePointerNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode1NodeContent, "org.jdom.ContentList", "elementData"));
        Object jDOMNodePointerNode2 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode2NodeContent = getFieldValue(jDOMNodePointerNode2, "org.jdom.Element", "content");
        int finalJDOMNodePointerNodeContentModCount = ((Integer) getFieldValue(jDOMNodePointerNode2NodeContent, "java.util.AbstractList", "modCount"));
        
        Object documentContent = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContentContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData1 = ((Content) get(documentContentContentElementData, 1));
        Object documentContent1 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent1ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent1, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData2 = ((Content) get(documentContent1ContentElementData, 2));
        Object documentContent2 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent2ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent2, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData3 = ((Content) get(documentContent2ContentElementData, 3));
        Object documentContent3 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent3ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent3, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData4 = ((Content) get(documentContent3ContentElementData, 4));
        Object documentContent4 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent4ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent4, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData5 = ((Content) get(documentContent4ContentElementData, 5));
        Object documentContent5 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent5ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent5, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData6 = ((Content) get(documentContent5ContentElementData, 6));
        Object documentContent6 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent6ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent6, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData7 = ((Content) get(documentContent6ContentElementData, 7));
        Object documentContent7 = getFieldValue(document, "org.jdom.Document", "content");
        org.jdom.Content[] documentContent7ContentElementData = ((org.jdom.Content[]) getFieldValue(documentContent7, "org.jdom.ContentList", "elementData"));
        Content finalDocumentContentElementData8 = ((Content) get(documentContent7ContentElementData, 8));
        
        assertFalse(initialJDOMNodePointerNodeContentElementData == finalJDOMNodePointerNodeContentElementData);
        
        assertEquals(2, finalJDOMNodePointerNodeContentModCount);
        
        assertNull(finalDocumentContentElementData1);
        
        assertNull(finalDocumentContentElementData2);
        
        assertNull(finalDocumentContentElementData3);
        
        assertNull(finalDocumentContentElementData4);
        
        assertNull(finalDocumentContentElementData5);
        
        assertNull(finalDocumentContentElementData6);
        
        assertNull(finalDocumentContentElementData7);
        
        assertNull(finalDocumentContentElementData8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setValue(java.lang.Object)
    
    @Test(expected = VerifyError.class)
    public void testSetValue5() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[9];
        EntityRef entityRef = ((EntityRef) createInstance("org.jdom.EntityRef"));
        elementData[0] = ((Content) entityRef);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Object object = new Object();
        
        jDOMNodePointer.setValue(object);
    }
    
    @Test(expected = VerifyError.class)
    public void testSetValue6() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Object object = new Object();
        
        jDOMNodePointer.setValue(object);
    }
    
    @Test
    public void testSetValue7() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content1 = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content1, "org.jdom.ContentList", "elementData", elementData);
        setField(content1, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.indexOfFirstElement(ContentList.java:412)
            org.jdom.Document.hasRootElement(Document.java:205)
            org.jdom.Document.getContent(Document.java:407)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:285) */
        jDOMNodePointer.setValue(document);
    }
    
    @Test
    public void testSetValue8() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[32];
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.NullPointerException]
            org.jdom.ContentList.removeParent(ContentList.java:462)
            org.jdom.ContentList.clear(ContentList.java:313)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:277) */
        jDOMNodePointer.setValue(object);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.Object)
    
    @Test(expected = IllegalStateException.class)
    public void testSetValue9() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null, null, null, null, null, null, null, null, null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", -2147483647);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content1 = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData1 = new org.jdom.Content[16];
        setField(content1, "org.jdom.ContentList", "elementData", elementData1);
        setField(content1, "org.jdom.ContentList", "size", 2);
        setField(document, "org.jdom.Document", "content", content1);
        
        jDOMNodePointer.setValue(document);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetValue10() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content1 = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null, null, null, null, null, null, null, null, null};
        setField(content1, "org.jdom.ContentList", "elementData", elementData);
        setField(document, "org.jdom.Document", "content", content1);
        
        jDOMNodePointer.setValue(document);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testSetValue11() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content1 = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null, null, null, null, null, null, null, null, null};
        setField(content1, "org.jdom.ContentList", "elementData", elementData);
        setField(content1, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content1);
        
        jDOMNodePointer.setValue(document);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_NotNNotInstanceOfElement() {
        byte[] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        
        String actual = jDOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_ReturnNull() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        String actual = jDOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_NotNNotInstanceOfElement_1() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        String actual = jDOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_NotNNotInstanceOfElement_2() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        String actual = jDOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLanguage_NotNNotInstanceOfElement_3() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        String actual = jDOMNodePointer.getLanguage();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = nodeParent(n);
 *  */
    @Test
    public void testGetLanguage_ThrowClassCastException() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:463)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:446) */
        jDOMNodePointer.getLanguage();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = nodeParent(n);
 *  */
    @Test
    public void testGetLanguage_ThrowClassCastException_1() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(comment, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:466)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:446) */
        jDOMNodePointer.getLanguage();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = nodeParent(n);
 *  */
    @Test
    public void testGetLanguage_ThrowClassCastException_2() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage] produces [java.lang.ClassCastException: The object with type org.jdom.Parent can not be casted to org.jdom.Element] */
        jDOMNodePointer.getLanguage();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLanguage()
    
    @Test
    public void testGetLanguage1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage] produces [java.lang.NullPointerException]
            org.jdom.Element.getAttributeValue(Element.java:1041)
            org.jdom.Element.getAttributeValue(Element.java:1025)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:441) */
        jDOMNodePointer.getLanguage();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#escape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.returnsFrom {@code return string;}
 *  */
    @Test
    public void testEscape_StringIndexOf() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        String string = "";
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = jDOMNodePointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(jDOMNodePointer, escapeMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#escape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int index = string.indexOf('\'');
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.escape] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.escape(JDOMNodePointer.java:613) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = jDOMNodePointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = ((Object) null);
        try {
            escapeMethod.invoke(jDOMNodePointer, escapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    @Test
    public void testEscape1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        String string = "\"\u0000\u0000";
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = jDOMNodePointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(jDOMNodePointer, escapeMethodArguments));
        
        String expected = "&quot;\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscape2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        String string = "\u0000\u0000'\u0000\u0000\u0000\u0000\u0000";
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = jDOMNodePointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(jDOMNodePointer, escapeMethodArguments));
        
        String expected = "\u0000\u0000&apos;\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf(JDOMNodePointer.java:207) */
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
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf(JDOMNodePointer.java:204) */
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isLeaf()
    
    @Test(expected = IllegalStateException.class)
    public void testIsLeaf1() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[31];
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 31);
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
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String current = getLanguage();
 *  */
    @Test
    public void testIsLanguage_ThrowClassCastException() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(comment, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:466)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:446)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:431) */
        jDOMNodePointer.isLanguage(null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLanguage(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String current = getLanguage();
 *  */
    @Test
    public void testIsLanguage_ThrowClassCastException_1() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @1ad9a78d)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:463)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:446)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:431) */
        jDOMNodePointer.isLanguage(null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLanguage(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String current = getLanguage();
 *  */
    @Test
    public void testIsLanguage_ThrowClassCastException_2() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.ClassCastException: The object with type org.jdom.Parent can not be casted to org.jdom.Element] */
        jDOMNodePointer.isLanguage(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isLanguage(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLanguage(java.lang.String)}
     */
    @Test
    public void testIsLanguageReturnsFalseWithNonEmptyString() {
        Object object = new Object();
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale, "-3");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        jDOMNodePointer.setNamespaceResolver(namespaceResolver2);
        jDOMNodePointer.setIndex(1);
        
        boolean actual = jDOMNodePointer.isLanguage("acb");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isLanguage(java.lang.String)
    
    @Test
    public void testIsLanguage1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.NullPointerException]
            org.jdom.Element.getAttributeValue(Element.java:1041)
            org.jdom.Element.getAttributeValue(Element.java:1025)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:441)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:431) */
        jDOMNodePointer.isLanguage(null);
    }
    
    @Test
    public void testIsLanguage2() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        setField(comment, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.NullPointerException]
            org.jdom.Element.getAttributeValue(Element.java:1041)
            org.jdom.Element.getAttributeValue(Element.java:1025)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:441)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:431) */
        jDOMNodePointer.isLanguage(null);
    }
    
    @Test
    public void testIsLanguage3() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.NullPointerException]
            org.jdom.Element.getAttributeValue(Element.java:1041)
            org.jdom.Element.getAttributeValue(Element.java:1025)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:441)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:431) */
        jDOMNodePointer.isLanguage(null);
    }
    
    @Test
    public void testIsLanguage4() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(NodePointer.java:453)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:432) */
        jDOMNodePointer.isLanguage(null);
    }
    
    @Test
    public void testIsLanguage5() {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(NodePointer.java:453)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:432) */
        jDOMNodePointer.isLanguage(string);
    }
    
    @Test
    public void testIsLanguage6() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(NodePointer.java:453)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:432) */
        jDOMNodePointer.isLanguage(string);
    }
    
    @Test
    public void testIsLanguage7() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        String string = "";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.NodePointer.isLanguage(NodePointer.java:453)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:432) */
        jDOMNodePointer.isLanguage(string);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1043848627222900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1043848627222900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1043848627233300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043848627222900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043848627233300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043848627708900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043848627708900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043848627711100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043848627708900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043848627711100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1043848632317300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043848632317300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043848632320500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043848632317300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043848632320500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043848634709900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043848634709900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043848634713100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043848634709900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043848634713100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

