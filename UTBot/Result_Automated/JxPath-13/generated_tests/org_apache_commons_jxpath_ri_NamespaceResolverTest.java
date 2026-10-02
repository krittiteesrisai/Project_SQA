package org.apache.commons.jxpath.ri;

import org.junit.Test;
import java.util.HashMap;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.w3c.dom.Node;
import java.util.Vector;
import java.net.URL;
import sun.net.www.protocol.jar.Handler;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import java.util.Locale;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_jxpath_ri_NamespaceResolverTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNamespaceURI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (uri == null): True}
 * @utbot.executesCondition {@code (pointer != null): False}
 * @utbot.executesCondition {@code (uri == null): True}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return uri;}
 *  */
    @Test
    public void testGetNamespaceURI_ParentEqualsNull() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        
        String actual = namespaceResolver.getNamespaceURI(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNamespaceURI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getNamespaceURI(java.lang.String)}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String uri = (String) namespaceMap.get(prefix);
 *  */
    @Test
    public void testGetNamespaceURI_ThrowNullPointerException() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespaceResolver.namespaceMap = null;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI(NamespaceResolver.java:116) */
        namespaceResolver.getNamespaceURI(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNamespaceURI(java.lang.String)
    
    @Test
    public void testGetNamespaceURI1() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        DOMNodePointer pointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        String defaultNamespace = "";
        setField(pointer, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "defaultNamespace", defaultNamespace);
        namespaceResolver.pointer = pointer;
        
        String actual = namespaceResolver.getNamespaceURI(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNamespaceURI2() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        HashMap namespaceMap1 = new HashMap();
        namespaceResolver1.namespaceMap = namespaceMap1;
        
        String actual = namespaceResolver1.getNamespaceURI(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNamespaceURI3() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(-2147483647);
        namespaceResolver.pointer = pointer;
        
        NodePointer nodePointer = namespaceResolver.pointer;
        NodePointer initialNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        String actual = namespaceResolver.getNamespaceURI(null);
        
        assertNull(actual);
        
        NodePointer nodePointer1 = namespaceResolver.pointer;
        NodePointer finalNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer1, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        assertFalse(initialNamespaceResolverPointerValuePointer == finalNamespaceResolverPointerValuePointer);
    }
    
    @Test
    public void testGetNamespaceURI4() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        NullPropertyPointer valuePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000\u0000";
        valuePointer.setPropertyName(propertyName);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", valuePointer);
        namespaceResolver.pointer = pointer;
        
        String actual = namespaceResolver.getNamespaceURI(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNamespaceURI5() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        NullPropertyPointer valuePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = ":\u0000\u0000";
        valuePointer.setPropertyName(propertyName);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", valuePointer);
        namespaceResolver.pointer = pointer;
        
        String actual = namespaceResolver.getNamespaceURI(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNamespaceURI6() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        Object document = createInstance("java.lang.Object");
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        
        NodePointer nodePointer = namespaceResolver.pointer;
        NodePointer initialNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        String actual = namespaceResolver.getNamespaceURI(null);
        
        assertNull(actual);
        
        NodePointer nodePointer1 = namespaceResolver.pointer;
        NodePointer finalNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer1, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        assertFalse(initialNamespaceResolverPointerValuePointer == finalNamespaceResolverPointerValuePointer);
    }
    
    @Test
    public void testGetNamespaceURI7() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        namespaceResolver.pointer = pointer;
        String string = "";
        
        NodePointer nodePointer = namespaceResolver.pointer;
        NodePointer initialNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        String actual = namespaceResolver.getNamespaceURI(string);
        
        assertNull(actual);
        
        NodePointer nodePointer1 = namespaceResolver.pointer;
        NodePointer finalNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer1, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        assertFalse(initialNamespaceResolverPointerValuePointer == finalNamespaceResolverPointerValuePointer);
    }
    
    @Test
    public void testGetNamespaceURI8() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        Object document = createInstance("java.lang.Object");
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "document", document);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        String string = "";
        
        NodePointer nodePointer = namespaceResolver.pointer;
        NodePointer initialNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        String actual = namespaceResolver.getNamespaceURI(string);
        
        assertNull(actual);
        
        NodePointer nodePointer1 = namespaceResolver.pointer;
        NodePointer finalNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer1, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        assertFalse(initialNamespaceResolverPointerValuePointer == finalNamespaceResolverPointerValuePointer);
    }
    
    @Test
    public void testGetNamespaceURI9() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        DOMNodePointer pointer = new DOMNodePointer(((NodePointer) null), ((Node) null));
        namespaceResolver.pointer = pointer;
        String string = "";
        
        String actual = namespaceResolver.getNamespaceURI(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNamespaceURI10() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        DOMNodePointer pointer = new DOMNodePointer(((NodePointer) null), ((Node) null));
        namespaceResolver.pointer = pointer;
        String string = "\u0000";
        
        String actual = namespaceResolver.getNamespaceURI(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNamespaceURI11() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        DOMNodePointer pointer = new DOMNodePointer(null, null, null);
        namespaceResolver.pointer = pointer;
        
        String actual = namespaceResolver.getNamespaceURI(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetNamespaceURI12() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        Vector document = ((Vector) createInstance("java.util.Vector"));
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        
        NodePointer nodePointer = namespaceResolver.pointer;
        NodePointer initialNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        String actual = namespaceResolver.getNamespaceURI(null);
        
        assertNull(actual);
        
        NodePointer nodePointer1 = namespaceResolver.pointer;
        NodePointer finalNamespaceResolverPointerValuePointer = ((NodePointer) getFieldValue(nodePointer1, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer"));
        
        assertFalse(initialNamespaceResolverPointerValuePointer == finalNamespaceResolverPointerValuePointer);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNamespaceURI(java.lang.String)
    
    @Test
    public void testGetNamespaceURI13() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        Object object = new Object();
        namespaceMap.put(null, object);
        namespaceResolver.namespaceMap = namespaceMap;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')]
            org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI(NamespaceResolver.java:116) */
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNamespaceURI14() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        Integer integer = 0;
        Object object = new Object();
        namespaceMap.put(integer, object);
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", pointer);
        namespaceResolver.pointer = pointer;
        
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetNamespaceURI15() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        Integer integer = 0;
        Object object = new Object();
        namespaceMap.put(integer, object);
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", pointer);
        namespaceResolver.pointer = pointer;
        String string = "";
        
        namespaceResolver.getNamespaceURI(string);
    }
    
    @Test
    public void testGetNamespaceURI16() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "document", document);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        String string = "";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.xml.DocumentContainer.getValue(DocumentContainer.java:121)
            org.apache.commons.jxpath.util.ValueUtils.getValue(ValueUtils.java:487)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateNode(ContainerPointer.java:84)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateValuePointer(ContainerPointer.java:94)
            org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer(NodePointer.java:241)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getNamespaceURI(ContainerPointer.java:149)
            org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI(NamespaceResolver.java:118) */
        namespaceResolver.getNamespaceURI(string);
    }
    
    @Test
    public void testGetNamespaceURI17() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        Vector document = ((Vector) createInstance("java.util.Vector"));
        setField(document, "java.util.Vector", "elementCount", 1);
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI] produces [java.lang.NullPointerException]
            java.base/java.util.Vector.elementData(Vector.java:731)
            java.base/java.util.Vector.get(Vector.java:752)
            org.apache.commons.jxpath.util.ValueUtils.getValue(ValueUtils.java:280)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateNode(ContainerPointer.java:82)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateValuePointer(ContainerPointer.java:94)
            org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer(NodePointer.java:241)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getNamespaceURI(ContainerPointer.java:149)
            org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI(NamespaceResolver.java:118) */
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test
    public void testGetNamespaceURI18() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        Integer integer = 0;
        Object object = new Object();
        namespaceMap.put(integer, object);
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        NullPropertyPointer valuePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "valuePointer", valuePointer);
        namespaceResolver.pointer = pointer;
        String string = "";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:34)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getValuePointer(NullPropertyPointer.java:65)
            org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer(NodePointer.java:242)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getNamespaceURI(ContainerPointer.java:149)
            org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI(NamespaceResolver.java:118) */
        namespaceResolver.getNamespaceURI(string);
    }
    
    @Test
    public void testGetNamespaceURI19() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI] produces [java.lang.NullPointerException] */
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test
    public void testGetNamespaceURI20() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespaceResolver.namespaceMap = null;
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        HashMap namespaceMap = new HashMap();
        Integer integer = 0;
        Object object = new Object();
        namespaceMap.put(integer, object);
        namespaceResolver1.namespaceMap = namespaceMap;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI(NamespaceResolver.java:116)
            org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI(NamespaceResolver.java:121) */
        namespaceResolver1.getNamespaceURI(null);
    }
    
    @Test
    public void testGetNamespaceURI21() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        setField(document, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI] produces [java.lang.NullPointerException]
            java.base/java.net.URL.toExternalForm(URL.java:1039)
            java.base/java.net.URL.toString(URL.java:1025)
            org.apache.commons.jxpath.xml.DocumentContainer.getValue(DocumentContainer.java:121)
            org.apache.commons.jxpath.util.ValueUtils.getValue(ValueUtils.java:487)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateNode(ContainerPointer.java:84)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getImmediateValuePointer(ContainerPointer.java:94)
            org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer(NodePointer.java:241)
            org.apache.commons.jxpath.ri.model.container.ContainerPointer.getNamespaceURI(ContainerPointer.java:149)
            org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceURI(NamespaceResolver.java:118) */
        namespaceResolver.getNamespaceURI(null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getNamespaceURI(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testGetNamespaceURI22() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "document", container);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test(timeout = 1000L)
    public void testGetNamespaceURI23() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", container);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test(timeout = 1000L)
    public void testGetNamespaceURI24() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", delegate);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        namespaceResolver.getNamespaceURI(string);
    }
    
    @Test(timeout = 1000L)
    public void testGetNamespaceURI25() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", delegate);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        namespaceResolver.getNamespaceURI(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNamespaceURI(java.lang.String)
    
    @Test(expected = JXPathException.class)
    public void testGetNamespaceURI26() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(document, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "document", document);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test(expected = JXPathException.class)
    public void testGetNamespaceURI27() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(document, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test(expected = JXPathException.class)
    public void testGetNamespaceURI28() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        String string = "";
        
        namespaceResolver.getNamespaceURI(string);
    }
    
    @Test(expected = JXPathException.class)
    public void testGetNamespaceURI29() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        DocumentContainer container = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        sun.net.www.protocol.jrt.Handler handler = ((sun.net.www.protocol.jrt.Handler) createInstance("sun.net.www.protocol.jrt.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(container, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        String string = "";
        
        namespaceResolver.getNamespaceURI(string);
    }
    
    @Test(expected = JXPathException.class)
    public void testGetNamespaceURI30() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(document, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "document", document);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        namespaceResolver.pointer = pointer;
        
        namespaceResolver.getNamespaceURI(null);
    }
    
    @Test(expected = JXPathException.class)
    public void testGetNamespaceURI31() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        URL xmlURL = ((URL) createInstance("java.net.URL"));
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(xmlURL, "java.net.URL", "handler", handler);
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        String string = "";
        
        namespaceResolver.getNamespaceURI(string);
    }
    
    @Test(expected = JXPathException.class)
    public void testGetNamespaceURI32() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        ContainerPointer pointer = ((ContainerPointer) createInstance("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        XMLDocumentContainer container = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        String model = "";
        setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "model", model);
        setField(container, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
        setField(pointer, "org.apache.commons.jxpath.ri.model.container.ContainerPointer", "container", container);
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        
        namespaceResolver.getNamespaceURI(null);
    }
    ///endregion
    
    ///region Errors report for getNamespaceURI
    
    public void testGetNamespaceURI_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.NamespaceResolver.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        
        NamespaceResolver actual = ((NamespaceResolver) namespaceResolver.clone());
        
        NamespaceResolver expected = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        expected.namespaceMap = namespaceMap;
        
        NamespaceResolver actualParent = actual.parent;
        assertNull(actualParent);
        
        HashMap expectedNamespaceMap = expected.namespaceMap;
        HashMap actualNamespaceMap = actual.namespaceMap;
        assertTrue(deepEquals(expectedNamespaceMap, actualNamespaceMap));
        
        HashMap actualReverseMap = actual.reverseMap;
        assertNull(actualReverseMap);
        
        NodePointer actualPointer = actual.pointer;
        assertNull(actualPointer);
        
        boolean actualSealed = ((Boolean) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed"));
        assertFalse(actualSealed);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.NamespaceResolver.isSealed
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSealed()
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#isSealed()}
 * @utbot.returnsFrom {@code return sealed;}
 *  */
    @Test
    public void testIsSealed_ReturnSealed() throws Exception  {
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        
        boolean actual = namespaceResolver.isSealed();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getPrefix(java.lang.String)}
 * @utbot.executesCondition {@code (reverseMap == null): False}
 * @utbot.executesCondition {@code (prefix == null): True}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return prefix;}
 *  */
    @Test
    public void testGetPrefix_ParentEqualsNull() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        HashMap reverseMap = new HashMap();
        namespaceResolver.reverseMap = reverseMap;
        
        String actual = namespaceResolver.getPrefix(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getPrefix(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#namespaceIterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeIterator ni = pointer.namespaceIterator();
 *  */
    @Test
    public void testGetPrefix_ThrowNullPointerException() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(NamespaceResolver.java:141) */
        namespaceResolver.getPrefix(null);
    }
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getPrefix(java.lang.String)}
 * @utbot.executesCondition {@code (ni != null): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#namespaceIterator()}
 * @utbot.invokes {@link java.util.HashMap#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator it = namespaceMap.entrySet().iterator();
 *  */
    @Test
    public void testGetPrefix_ThrowNullPointerException_1() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespaceResolver.namespaceMap = null;
        CollectionPointer pointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        pointer.setIndex(Integer.MIN_VALUE);
        namespaceResolver.pointer = pointer;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.NamespaceResolver.getPrefix(NamespaceResolver.java:152) */
        namespaceResolver.getPrefix(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPrefix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getPrefix(java.lang.String)}
 * @utbot.executesCondition {@code (reverseMap == null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#namespaceIterator()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeIterator ni = pointer.namespaceIterator();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetPrefix_ThrowIllegalArgumentException() throws Exception  {
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        VariablePointer pointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        BasicVariables variables = ((BasicVariables) createInstance("org.apache.commons.jxpath.BasicVariables"));
        HashMap vars = new HashMap();
        setField(variables, "org.apache.commons.jxpath.BasicVariables", "vars", vars);
        setField(pointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "variables", variables);
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String qualifiedName = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "qualifiedName", qualifiedName);
        setField(pointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "name", name);
        setField(pointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "actual", true);
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer", pointer);
        
        namespaceResolver.getPrefix(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.NamespaceResolver.getNamespaceContextPointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNamespaceContextPointer()
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getNamespaceContextPointer()}
 * @utbot.executesCondition {@code (pointer == null): True}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return pointer;}
 *  */
    @Test
    public void testGetNamespaceContextPointer_ParentEqualsNull() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        
        Pointer actual = namespaceResolver.getNamespaceContextPointer();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getNamespaceContextPointer()}
 * @utbot.executesCondition {@code (pointer == null): False}
 * @utbot.returnsFrom {@code return pointer;}
 *  */
    @Test
    public void testGetNamespaceContextPointer_PointerNotEqualsNull() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        DynamicPointer pointer = new DynamicPointer(((QName) null), ((Object) null), ((DynamicPropertyHandler) null), ((Locale) null));
        namespaceResolver.pointer = pointer;
        
        DynamicPointer actual = ((DynamicPointer) namespaceResolver.getNamespaceContextPointer());
        
        DynamicPointer expected = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object value = createInstance("java.lang.Object");
        expected.setValue(value);
        expected.setIndex(Integer.MIN_VALUE);
        
        // org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getNamespaceContextPointer()}
 * @utbot.executesCondition {@code (pointer == null): True}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.NamespaceResolver#getNamespaceContextPointer()}
 * @utbot.triggersRecursion getNamespaceContextPointer, where the test execute conditions:
 *     {@code (pointer == null): False}
 * return from: {@code return pointer;}
 * @utbot.returnsFrom {@code return parent.getNamespaceContextPointer();}
 *  */
    @Test
    public void testGetNamespaceContextPointer_ParentNotEqualsNull() throws Exception  {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        DynamicPointer pointer = new DynamicPointer(((QName) null), ((Object) null), ((DynamicPropertyHandler) null), ((Locale) null));
        namespaceResolver.pointer = pointer;
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        
        DynamicPointer actual = ((DynamicPointer) namespaceResolver1.getNamespaceContextPointer());
        
        DynamicPointer expected = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object value = createInstance("java.lang.Object");
        expected.setValue(value);
        expected.setIndex(Integer.MIN_VALUE);
        
        // org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNamespaceContextPointer()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#getNamespaceContextPointer()}
     */
    @Test
    public void testGetNamespaceContextPointer() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        
        Pointer actual = namespaceResolver1.getNamespaceContextPointer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.NamespaceResolver.setNamespaceContextPointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNamespaceContextPointer(org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#setNamespaceContextPointer(org.apache.commons.jxpath.ri.model.NodePointer)}
 *  */
    @Test
    public void testSetNamespaceContextPointer() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        
        namespaceResolver.setNamespaceContextPointer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.NamespaceResolver.seal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method seal()
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#seal()}
 *  */
    @Test
    public void testSeal() throws Exception  {
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        
        namespaceResolver.seal();
        
        boolean finalNamespaceResolverSealed = ((Boolean) getFieldValue(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed"));
        
        assertTrue(finalNamespaceResolverSealed);
    }
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#seal()}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.NamespaceResolver#seal()}
 * @utbot.triggersRecursion seal
 *  */
    @Test
    public void testSeal_ParentNotEqualsNull() throws Exception  {
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        NamespaceResolver parent = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", parent);
        
        namespaceResolver.seal();
        
        NamespaceResolver namespaceResolver1 = namespaceResolver.parent;
        boolean finalNamespaceResolverParentSealed = ((Boolean) getFieldValue(namespaceResolver1, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed"));
        boolean finalNamespaceResolverSealed = ((Boolean) getFieldValue(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed"));
        
        assertTrue(finalNamespaceResolverParentSealed);
        
        assertTrue(finalNamespaceResolverSealed);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.NamespaceResolver.registerNamespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method registerNamespace(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#registerNamespace(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (isSealed()): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.NamespaceResolver#isSealed()}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testRegisterNamespace_NotIsSealed() throws Exception  {
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        namespaceResolver.namespaceMap = namespaceMap;
        HashMap reverseMap = new HashMap();
        namespaceResolver.reverseMap = reverseMap;
        
        namespaceResolver.registerNamespace(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method registerNamespace(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#registerNamespace(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (isSealed()): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.NamespaceResolver#isSealed()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: isSealed()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRegisterNamespace_ThrowIllegalStateException() throws Exception  {
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(namespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed", true);
        
        namespaceResolver.registerNamespace(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method registerNamespace(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamespaceResolver}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.NamespaceResolver#registerNamespace(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (isSealed()): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.NamespaceResolver#isSealed()}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: namespaceMap.put(prefix, namespaceURI);
 *  */
    @Test
    public void testRegisterNamespace_ThrowNullPointerException() throws Exception  {
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.NamespaceResolver.registerNamespace] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.NamespaceResolver.registerNamespace(NamespaceResolver.java:74) */
        namespaceResolver.registerNamespace(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1046300372292000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1046300372292000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1046300372308800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1046300372292000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1046300372308800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1046300373423700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1046300373423700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1046300373430100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1046300373423700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1046300373430100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

