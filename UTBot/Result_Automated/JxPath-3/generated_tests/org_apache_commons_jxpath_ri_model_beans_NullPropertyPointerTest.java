package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.JXPathBeanInfo;
import java.util.Locale;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.dom.NamespacePointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import java.util.LinkedHashMap;
import org.apache.commons.jxpath.MapDynamicPropertyHandler;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.xml.DocumentContainer;
import java.net.URL;
import sun.net.www.protocol.jar.Handler;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.apache.commons.jxpath.servlet.ServletRequestHandler;
import java.util.jar.Attributes;
import org.apache.commons.jxpath.servlet.HttpSessionHandler;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.servlet.ServletContextHandler;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_jxpath_ri_model_beans_NullPropertyPointerTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getName()}
 * @utbot.returnsFrom {@code return new QName(propertyName);}
 *  */
    @Test
    public void testGetName_Return() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "";
        nullPropertyPointer.setPropertyName(propertyName);
        
        QName actual = nullPropertyPointer.getName();
        
        QName expected = new QName(null, propertyName);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getName()}
 * @utbot.returnsFrom {@code return new QName(propertyName);}
 *  */
    @Test
    public void testGetName_Return_1() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = ": ";
        nullPropertyPointer.setPropertyName(propertyName);
        
        QName actual = nullPropertyPointer.getName();
        
        String string = "";
        String string1 = " ";
        QName expected = new QName(string, string1);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLength()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getLength()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetLength_ReturnZero() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        int actual = nullPropertyPointer.getLength();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidAccessException} in: asPath()
 *  */
    @Test(expected = JXPathInvalidAccessException.class)
    public void testSetValue_ThrowJXPathInvalidAccessException_2() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        nullPropertyPointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof PropertyOwnerPointer && ((PropertyOwnerPointer) parent).isDynamicPropertyDeclarationSupported()): False}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidAccessException} in: asPath()
 *  */
    @Test(expected = JXPathInvalidAccessException.class)
    public void testSetValue_ThrowJXPathInvalidAccessException() {
        LangAttributePointer langAttributePointer = new LangAttributePointer(null);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(langAttributePointer);
        
        nullPropertyPointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidAccessException} in: asPath()
 *  */
    @Test(expected = JXPathInvalidAccessException.class)
    public void testSetValue_ThrowJXPathInvalidAccessException_3() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        
        nullPropertyPointer1.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof PropertyOwnerPointer && ((PropertyOwnerPointer) parent).isDynamicPropertyDeclarationSupported()): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer#isDynamicPropertyDeclarationSupported()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathInvalidAccessException} in: asPath()
 *  */
    @Test(expected = JXPathInvalidAccessException.class)
    public void testSetValue_ThrowJXPathInvalidAccessException_1() {
        BeanPointer beanPointer = new BeanPointer(((QName) null), ((Object) null), ((JXPathBeanInfo) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(beanPointer);
        
        nullPropertyPointer.setValue(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: asPath()
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(dynamicPropertyPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.asPath(DynamicPropertyPointer.java:278)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:82) */
        nullPropertyPointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: asPath()
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_1() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(beanPropertyPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor(BeanPropertyPointer.java:274)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyName(BeanPropertyPointer.java:257)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:68)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:82) */
        nullPropertyPointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: asPath()
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_2() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(dynaBeanPropertyPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:71)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:96)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:68)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:82) */
        nullPropertyPointer.setValue(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setValue(java.lang.Object)}
     */
    @Test(expected = JXPathInvalidAccessException.class)
    public void testSetValueThrowsJXPIAE() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespacePointer.setNamespaceResolver(namespaceResolver);
        namespacePointer.setIndex(0);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(namespacePointer);
        Object object = new Object();
        
        nullPropertyPointer.setValue(object);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Object)
    
    @Test
    public void testSetValue1() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = "";
            nullPropertyPointer.setPropertyName(propertyName);
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            LinkedHashMap bean = new LinkedHashMap();
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "handler", handler);
            parent.setValue(uninitialized1);
            parent.setIndex(Integer.MIN_VALUE);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.Object)
    
    @Test(expected = JXPathException.class)
    public void testSetValue2() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            parent.setIndex(Integer.MIN_VALUE);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test(expected = JXPathException.class)
    public void testSetValue3() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            DocumentContainer bean = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            URL xmlURL = ((URL) createInstance("java.net.URL"));
            Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
            setField(xmlURL, "java.net.URL", "handler", handler);
            setField(bean, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test(expected = JXPathException.class)
    public void testSetValue4() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = "";
            nullPropertyPointer.setPropertyName(propertyName);
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            URL xmlURL = ((URL) createInstance("java.net.URL"));
            Handler handler = ((Handler) createInstance("sun.net.www.protocol.jar.Handler"));
            setField(xmlURL, "java.net.URL", "handler", handler);
            setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
            setField(bean, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            PageContextHandler handler1 = ((PageContextHandler) createInstance("org.apache.commons.jxpath.servlet.PageContextHandler"));
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "handler", handler1);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test(expected = JXPathException.class)
    public void testSetValue5() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            setField(bean, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setValue(java.lang.Object)
    
    @Test
    public void testSetValue6() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "handler", handler);
            Object value = createInstance("java.lang.Object");
            parent.setValue(value);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Map (java.lang.Object and java.util.Map are in module java.base of loader 'bootstrap')]
                org.apache.commons.jxpath.MapDynamicPropertyHandler.getPropertyNames(MapDynamicPropertyHandler.java:37)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue7() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            ServletRequestHandler handler = ((ServletRequestHandler) createInstance("org.apache.commons.jxpath.servlet.ServletRequestHandler"));
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "handler", handler);
            short[] value = {};
            parent.setValue(value);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.ClassCastException: class [S cannot be cast to class org.apache.commons.jxpath.servlet.HttpSessionAndServletContext ([S is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.servlet.HttpSessionAndServletContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5a1d61ba)]
                org.apache.commons.jxpath.servlet.HttpSessionHandler.collectPropertyNames(HttpSessionHandler.java:36)
                org.apache.commons.jxpath.servlet.ServletRequestHandler.collectPropertyNames(ServletRequestHandler.java:34)
                org.apache.commons.jxpath.servlet.ServletContextHandler.getPropertyNames(ServletContextHandler.java:39)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(null);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue8() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = "";
            nullPropertyPointer.setPropertyName(propertyName);
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            Object bean = createInstance("java.lang.Object");
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "handler", handler);
            parent.setValue(uninitialized1);
            parent.setIndex(Integer.MIN_VALUE);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Map (java.lang.Object and java.util.Map are in module java.base of loader 'bootstrap')]
                org.apache.commons.jxpath.MapDynamicPropertyHandler.setProperty(MapDynamicPropertyHandler.java:58)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue9() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            PageContextHandler handler = ((PageContextHandler) createInstance("org.apache.commons.jxpath.servlet.PageContextHandler"));
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "handler", handler);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
                org.apache.commons.jxpath.servlet.PageContextHandler.getPropertyNames(PageContextHandler.java:38)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue10() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = "";
            nullPropertyPointer.setPropertyName(propertyName);
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            java.util.jar.Attributes[][][][] document = {};
            setField(bean, "org.apache.commons.jxpath.XMLDocumentContainer", "document", document);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            HttpSessionHandler handler = ((HttpSessionHandler) createInstance("org.apache.commons.jxpath.servlet.HttpSessionHandler"));
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "handler", handler);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
                org.apache.commons.jxpath.servlet.HttpSessionHandler.setProperty(HttpSessionHandler.java:64)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue11() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = "";
            nullPropertyPointer.setPropertyName(propertyName);
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            Object document = createInstance("java.lang.Object");
            setField(bean, "org.apache.commons.jxpath.XMLDocumentContainer", "document", document);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue12() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            setField(bean, "org.apache.commons.jxpath.XMLDocumentContainer", "document", document);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException] */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue13() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            DocumentContainer bean = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            URL xmlURL = ((URL) createInstance("java.net.URL"));
            setField(document, "org.apache.commons.jxpath.xml.DocumentContainer", "xmlURL", xmlURL);
            setField(bean, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            parent.setIndex(Integer.MIN_VALUE);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
                java.base/java.net.URL.toExternalForm(URL.java:1039)
                java.base/java.net.URL.toString(URL.java:1025)
                org.apache.commons.jxpath.xml.DocumentContainer.getValue(DocumentContainer.java:121)
                org.apache.commons.jxpath.util.ValueUtils.getValue(ValueUtils.java:497)
                org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getImmediateNode(PropertyOwnerPointer.java:105)
                org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:306)
                org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:62)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue14() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            Object document = createInstance("java.util.Collections$CopiesList");
            setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
            setField(bean, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            parent.setIndex(-2147418112);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue15() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            ArrayList document = new ArrayList();
            setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
            setField(bean, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue16() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            DocumentContainer bean = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            DocumentContainer document = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            setField(bean, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            parent.setIndex(Integer.MIN_VALUE);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
                org.apache.commons.jxpath.xml.DocumentContainer.getValue(DocumentContainer.java:121)
                org.apache.commons.jxpath.util.ValueUtils.getValue(ValueUtils.java:497)
                org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.getImmediateNode(PropertyOwnerPointer.java:105)
                org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:306)
                org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:62)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test
    public void testSetValue17() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            ArrayList bean = new ArrayList();
            bean.add(null);
            bean.add(null);
            bean.add(null);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue] produces [java.lang.NullPointerException]
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
                org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setValue(DynamicPropertyPointer.java:198)
                org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setValue(NullPropertyPointer.java:93) */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method setValue(java.lang.Object)
    
    @Test(timeout = 1000L)
    public void testSetValue18() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            DocumentContainer bean = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            setField(bean, "org.apache.commons.jxpath.xml.DocumentContainer", "document", bean);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            parent.setIndex(Integer.MIN_VALUE);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This execution may take longer than the 1000 ms timeout
             and therefore fail due to exceeding the timeout. */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    
    @Test(timeout = 1000L)
    public void testSetValue19() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED1 = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            java.lang.Object[] uninitialized1 = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized1);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
            XMLDocumentContainer bean = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
            DocumentContainer delegate = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
            setField(delegate, "org.apache.commons.jxpath.xml.DocumentContainer", "document", delegate);
            setField(bean, "org.apache.commons.jxpath.XMLDocumentContainer", "delegate", delegate);
            setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "bean", bean);
            parent.setValue(uninitialized1);
            setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
            Object object = new Object();
            
            /* This execution may take longer than the 1000 ms timeout
             and therefore fail due to exceeding the timeout. */
            nullPropertyPointer.setValue(object);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED1);
        }
    }
    ///endregion
    
    ///region Errors report for setValue
    
    public void testSetValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#escape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.returnsFrom {@code return string;}
 *  */
    @Test
    public void testEscape_StringIndexOf() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        String string = "";
        
        Class nullPropertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = nullPropertyPointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(nullPropertyPointer, escapeMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method escape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#escape(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int index = string.indexOf('\'');
 *  */
    @Test
    public void testEscape_ThrowNullPointerException() throws Throwable  {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape(NullPropertyPointer.java:206) */
        Class nullPropertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = nullPropertyPointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = ((Object) null);
        try {
            escapeMethod.invoke(nullPropertyPointer, escapeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#escape(java.lang.String)}
     */
    @Test
    public void testEscapeWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        NamespacePointer namespacePointer = new NamespacePointer(null, "#$\\\"'");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespacePointer.setNamespaceResolver(namespaceResolver);
        namespacePointer.setIndex(-1);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(namespacePointer);
        
        Class nullPropertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = nullPropertyPointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = "#$\\\"'";
        String actual = ((String) escapeMethod.invoke(nullPropertyPointer, escapeMethodArguments));
        
        String expected = "#$\\&quot;&apos;";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method escape(java.lang.String)
    
    @Test
    public void testEscape1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        String string = "\u0000\u0000'";
        
        Class nullPropertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = nullPropertyPointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(nullPropertyPointer, escapeMethodArguments));
        
        String expected = "\u0000\u0000&apos;";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEscape2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        String string = "\" ";
        
        Class nullPropertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class stringType = Class.forName("java.lang.String");
        Method escapeMethod = nullPropertyPointerClazz.getDeclaredMethod("escape", stringType);
        escapeMethod.setAccessible(true);
        java.lang.Object[] escapeMethodArguments = new java.lang.Object[1];
        escapeMethodArguments[0] = string;
        String actual = ((String) escapeMethod.invoke(nullPropertyPointer, escapeMethodArguments));
        
        String expected = "&quot; ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.isLeaf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLeaf()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#isLeaf()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsLeaf_ReturnTrue() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        boolean actual = nullPropertyPointer.isLeaf();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getPropertyName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyName()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getPropertyName()}
 * @utbot.returnsFrom {@code return propertyName;}
 *  */
    @Test
    public void testGetPropertyName_ReturnPropertyName() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        
        String actual = nullPropertyPointer.getPropertyName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asPath()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#asPath()}
 * @utbot.executesCondition {@code (!byNameAttribute): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#asPath()}
 * @utbot.returnsFrom {@code return super.asPath();}
 *  */
    @Test
    public void testAsPath_NotByNameAttribute() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = " ";
        nullPropertyPointer.setPropertyName(propertyName);
        nullPropertyPointer.setIndex(Integer.MIN_VALUE);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "/ ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asPath()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#asPath()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(getImmediateParentPointer().asPath());
 *  */
    @Test
    public void testAsPath_ThrowNullPointerException() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:194) */
        nullPropertyPointer.asPath();
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#asPath()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(escape(getPropertyName()));
 *  */
    @Test
    public void testAsPath_ThrowNullPointerException_2() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape(NullPropertyPointer.java:206)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:196) */
        nullPropertyPointer.asPath();
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#asPath()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append(escape(getPropertyName()));
 *  */
    @Test
    public void testAsPath_ThrowNullPointerException_1() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape(NullPropertyPointer.java:206)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:196) */
        nullPropertyPointer.asPath();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asPath()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#asPath()}
     */
    @Test
    public void testAsPath() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "#$\\\"'");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespacePointer.setNamespaceResolver(namespaceResolver);
        namespacePointer.setIndex(0);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(namespacePointer);
        nullPropertyPointer.setPropertyName("#$\\\"'");
        nullPropertyPointer.setPropertyIndex(1);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        NamespaceResolver namespaceResolver3 = new NamespaceResolver(namespaceResolver2);
        nullPropertyPointer.setNamespaceResolver(namespaceResolver3);
        nullPropertyPointer.setIndex(-1);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "namespace::#$\\\"'/#$\\\"'[0]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method asPath()
    
    @Test
    public void testAsPath1() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        nullPropertyPointer.setAttribute(true);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "/@\u0000\u0000:\u0000\u0000\u0000\u0000\u0000\u0000\u0000[1]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsPath2() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000'\u0000\u0000\u0000\u0000\u0000\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "/[@name='\u0000&apos;\u0000\u0000\u0000\u0000\u0000\u0000'][1]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsPath3() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "";
        nullPropertyPointer.setPropertyName(propertyName);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "/[@name=''][1]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsPath4() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\"";
        nullPropertyPointer.setPropertyName(propertyName);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "/[@name='&quot;'][1]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsPath5() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "'\u0000\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "null()[@name='&apos;\u0000\u0000'][1]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsPath6() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "null()[@name='\u0000\u0000\u0000\u0000\u0000\u0000\u0000'][1]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsPath7() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\"\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        String actual = nullPropertyPointer.asPath();
        
        String expected = "null()[@name='&quot;\u0000'][1]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method asPath()
    
    @Test
    public void testAsPath8() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:32)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getName(NullPropertyPointer.java:40)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath9() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:32)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getName(NullPropertyPointer.java:40)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath10() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:32)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getName(NullPropertyPointer.java:40)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:194) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath11() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        DynaBeanPropertyPointer parent = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:71)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:96)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:68)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath12() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynaBeanPointer parent = ((DynaBeanPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape(NullPropertyPointer.java:206)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:196) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath13() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        BeanPropertyPointer parent = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptors(BeanPropertyPointer.java:292)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor(BeanPropertyPointer.java:278)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyName(BeanPropertyPointer.java:257)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:68)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath14() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        BeanPointer parent = ((BeanPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape(NullPropertyPointer.java:206)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:196) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath15() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        JDOMNamespacePointer parent1 = ((JDOMNamespacePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape(NullPropertyPointer.java:206)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:196) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath16() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        NullPropertyPointer parent1 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:32)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getName(NullPropertyPointer.java:40)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.asPath(DynamicPointer.java:110)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:194) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath17() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        DynaBeanPropertyPointer parent1 = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:71)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:96)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:68)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.asPath(DynamicPointer.java:110)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:194) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath18() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        BeanPropertyPointer parent1 = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptors(BeanPropertyPointer.java:292)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor(BeanPropertyPointer.java:278)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyName(BeanPropertyPointer.java:257)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:68)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer.asPath(DynamicPointer.java:110)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:194) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath19() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        String id = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(parent, "org.apache.commons.jxpath.ri.model.beans.NullPointer", "id", id);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape(NullPropertyPointer.java:206)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:196) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath20() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.escape(NullPropertyPointer.java:206)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:196) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath21() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        NullPropertyPointer parent1 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:32)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getName(NullPropertyPointer.java:40)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:190)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.asPath(NullPointer.java:136)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:194) */
        nullPropertyPointer.asPath();
    }
    
    @Test
    public void testAsPath22() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute", true);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynaBeanPropertyPointer parent1 = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:71)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:96)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:68)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:624)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:609)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.asPath(NullPointer.java:136)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.asPath(NullPropertyPointer.java:194) */
        nullPropertyPointer.asPath();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setNameAttributeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNameAttributeValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setNameAttributeValue(java.lang.String)}
 *  */
    @Test
    public void testSetNameAttributeValue() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        
        nullPropertyPointer.setNameAttributeValue(null);
        
        boolean finalNullPropertyPointerByNameAttribute = ((Boolean) getFieldValue(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer", "byNameAttribute"));
        
        assertTrue(finalNullPropertyPointerByNameAttribute);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setPropertyIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPropertyIndex(int)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setPropertyIndex(int)}
 *  */
    @Test
    public void testSetPropertyIndex() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        nullPropertyPointer.setPropertyIndex(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.isActual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isActual()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#isActual()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsActual_ReturnFalse() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        boolean actual = nullPropertyPointer.isActual();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getImmediateNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImmediateNode()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getImmediateNode()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetImmediateNode_ReturnNull() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        Object actual = nullPropertyPointer.getImmediateNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return createPath(context).createChild(context, name, index, value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateChild_ThrowUnsupportedOperationException() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        
        nullPropertyPointer1.createChild(null, null, -255, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    @Test(expected = JXPathException.class)
    public void testCreateChildByFuzzer() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "XZ");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespacePointer.setNamespaceResolver(namespaceResolver);
        namespacePointer.setIndex(0);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(namespacePointer);
        nullPropertyPointer.setPropertyName("10");
        nullPropertyPointer.setPropertyIndex(Integer.MAX_VALUE);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        NamespaceResolver namespaceResolver3 = new NamespaceResolver(namespaceResolver2);
        nullPropertyPointer.setNamespaceResolver(namespaceResolver3);
        nullPropertyPointer.setIndex(-1);
        QName qName = new QName("\n\t\r", "10");
        
        nullPropertyPointer.createChild(null, qName, -1, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateChild1() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer1.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateChild2() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateChild3() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer2.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateChild4() {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        NullPropertyPointer nullPropertyPointer3 = new NullPropertyPointer(nullPropertyPointer2);
        Object object = new Object();
        
        nullPropertyPointer3.createChild(null, null, 0, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild5() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        Object object = new Object();
        
        nullPropertyPointer.createChild(null, null, 0, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild6() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer1.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild7() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", anonymousNullPointer);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer1.createChild(jXPathContextReferenceImpl, null, 0, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild8() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        Object object = new Object();
        
        nullPropertyPointer2.createChild(null, null, 0, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild9() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", anonymousNullPointer);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        Object object = new Object();
        
        nullPropertyPointer1.createChild(null, null, 0, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild10() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        Object object = new Object();
        
        nullPropertyPointer1.createChild(null, null, 0, object);
    }
    
    @Test
    public void testCreateChild11() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent2 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        String name = "";
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "name", name);
        Object bean = createInstance("java.lang.Object");
        parent2.bean = bean;
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Map (java.lang.Object and java.util.Map are in module java.base of loader 'bootstrap')]
            org.apache.commons.jxpath.MapDynamicPropertyHandler.getProperty(MapDynamicPropertyHandler.java:51)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:160) */
        nullPropertyPointer1.createChild(null, null, 0, object);
    }
    
    @Test
    public void testCreateChild12() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent2 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        ServletRequestHandler handler = ((ServletRequestHandler) createInstance("org.apache.commons.jxpath.servlet.ServletRequestHandler"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        parent2.propertyIndex = 1073741824;
        Object bean = createInstance("java.lang.Object");
        parent2.bean = bean;
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.servlet.ServletRequestAndContext (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.servlet.ServletRequestAndContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5a1d61ba)]
            org.apache.commons.jxpath.servlet.ServletRequestHandler.getProperty(ServletRequestHandler.java:48)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:160) */
        nullPropertyPointer1.createChild(null, null, 0, object);
    }
    
    @Test
    public void testCreateChild13() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent2 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        ServletRequestHandler handler = ((ServletRequestHandler) createInstance("org.apache.commons.jxpath.servlet.ServletRequestHandler"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        parent2.propertyIndex = Integer.MIN_VALUE;
        Object bean = createInstance("java.lang.Object");
        parent2.bean = bean;
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.servlet.ServletRequestAndContext (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.servlet.ServletRequestAndContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5a1d61ba)]
            org.apache.commons.jxpath.servlet.ServletRequestHandler.getProperty(ServletRequestHandler.java:48)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:160) */
        nullPropertyPointer1.createChild(null, null, 0, object);
    }
    
    @Test
    public void testCreateChild14() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent2 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        ServletContextHandler handler = ((ServletContextHandler) createInstance("org.apache.commons.jxpath.servlet.ServletContextHandler"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        byte[] bean = {};
        setField(parent2, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.ClassCastException: class [B cannot be cast to class javax.servlet.ServletContext ([B is in module java.base of loader 'bootstrap'; javax.servlet.ServletContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5a1d61ba)]
            org.apache.commons.jxpath.servlet.ServletContextHandler.collectPropertyNames(ServletContextHandler.java:44)
            org.apache.commons.jxpath.servlet.ServletContextHandler.getPropertyNames(ServletContextHandler.java:39)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:160) */
        nullPropertyPointer1.createChild(null, null, -255, null);
    }
    
    @Test
    public void testCreateChild15() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent2 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:160) */
        nullPropertyPointer1.createChild(null, null, 0, object);
    }
    
    @Test
    public void testCreateChild16() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = ":\u0000\u0000";
        parent.setPropertyName(propertyName);
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent2 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:160) */
        nullPropertyPointer1.createChild(null, null, 0, object);
    }
    
    @Test
    public void testCreateChild17() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000";
        parent.setPropertyName(propertyName);
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent2 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:99)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:160) */
        nullPropertyPointer1.createChild(null, null, 0, object);
    }
    
    @Test
    public void testCreateChild18() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent2 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(parent2, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        LinkedHashMap bean = new LinkedHashMap();
        setField(parent2, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        QName qName = new QName(null, null);
        Object object = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getAbstractFactory(DynamicPropertyPointer.java:315)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:212)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:160) */
        nullPropertyPointer1.createChild(null, qName, 0, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
     */
    @Test(expected = JXPathException.class)
    public void testCreateChildThrowsJXPEWithCornerCase() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "XZ");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespacePointer.setNamespaceResolver(namespaceResolver);
        namespacePointer.setIndex(0);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(namespacePointer);
        nullPropertyPointer.setPropertyName("10");
        nullPropertyPointer.setPropertyIndex(Integer.MAX_VALUE);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        NamespaceResolver namespaceResolver3 = new NamespaceResolver(namespaceResolver2);
        nullPropertyPointer.setNamespaceResolver(namespaceResolver3);
        nullPropertyPointer.setIndex(-1);
        QName qName = new QName("\n\t\r", "10");
        
        nullPropertyPointer.createChild(null, qName, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateChild19() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        nullPropertyPointer.createChild(jXPathContextReferenceImpl, null, 0);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateChild20() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        nullPropertyPointer1.createChild(jXPathContextReferenceImpl, null, 0);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreateChild21() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        nullPropertyPointer2.createChild(jXPathContextReferenceImpl, null, 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild22() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        
        nullPropertyPointer2.createChild(null, null, 0);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreateChild23() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", anonymousNullPointer);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        
        nullPropertyPointer1.createChild(null, null, 0);
    }
    
    @Test
    public void testCreateChild24() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPropertyPointer parent1 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent2 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent3 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        Object bean = createInstance("java.lang.Object");
        parent3.bean = bean;
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent3);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Map (java.lang.Object and java.util.Map are in module java.base of loader 'bootstrap')]
            org.apache.commons.jxpath.MapDynamicPropertyHandler.getProperty(MapDynamicPropertyHandler.java:51)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:151) */
        nullPropertyPointer.createChild(null, null, 0);
    }
    
    @Test
    public void testCreateChild25() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPropertyPointer parent1 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent2 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent3 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        parent3.propertyIndex = 1073741824;
        LinkedHashMap bean = new LinkedHashMap();
        setField(parent3, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent3);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getAbstractFactory(DynamicPropertyPointer.java:315)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:212)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:151) */
        nullPropertyPointer.createChild(null, null, 0);
    }
    
    @Test
    public void testCreateChild26() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPropertyPointer parent1 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent2 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent3 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        parent3.propertyIndex = Integer.MIN_VALUE;
        LinkedHashMap bean = new LinkedHashMap();
        setField(parent3, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent3);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        QName qName = new QName(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.asPath(DynamicPropertyPointer.java:278)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getAbstractFactory(DynamicPropertyPointer.java:319)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:212)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createChild(NullPropertyPointer.java:151) */
        nullPropertyPointer.createChild(jXPathContextReferenceImpl, qName, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getPropertyCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyCount()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getPropertyCount()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetPropertyCount_ReturnZero() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        int actual = nullPropertyPointer.getPropertyCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getValuePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValuePointer()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getValuePointer()}
 *  */
    @Test
    public void testGetValuePointer() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        
        NullPointer actual = ((NullPointer) nullPropertyPointer.getValuePointer());
        
        NullPointer expected = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", propertyName);
        setField(expected, "org.apache.commons.jxpath.ri.model.beans.NullPointer", "name", name);
        Object value = createInstance("java.lang.Object");
        expected.setValue(value);
        expected.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", nullPropertyPointer);
        
        // org.apache.commons.jxpath.ri.model.beans.NullPointer has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getValuePointer()}
 * @utbot.returnsFrom {@code return new NullPointer(this, new QName(getPropertyName()));}
 *  */
    @Test
    public void testGetValuePointer_Return() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = ": ";
            nullPropertyPointer.setPropertyName(propertyName);
            
            NullPointer actual = ((NullPointer) nullPropertyPointer.getValuePointer());
            
            NullPointer expected = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
            QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
            String prefix = "";
            setField(name, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
            String name1 = " ";
            setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
            setField(expected, "org.apache.commons.jxpath.ri.model.beans.NullPointer", "name", name);
            expected.setValue(uninitialized);
            expected.setIndex(Integer.MIN_VALUE);
            setField(expected, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", nullPropertyPointer);
            
            // org.apache.commons.jxpath.ri.model.beans.NullPointer has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.isContainer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isContainer()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#isContainer()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsContainer_ReturnTrue() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        boolean actual = nullPropertyPointer.isContainer();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.isActualProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isActualProperty()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#isActualProperty()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsActualProperty_ReturnFalse() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        boolean actual = nullPropertyPointer.isActualProperty();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createPath(org.apache.commons.jxpath.JXPathContext)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#createPath(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer newParent = parent.createPath(context);
 *  */
    @Test
    public void testCreatePath_ThrowNullPointerException() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104) */
        nullPropertyPointer.createPath(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createPath(org.apache.commons.jxpath.JXPathContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext)}
     */
    @Test(expected = JXPathException.class)
    public void testCreatePathThrowsJXPE() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "XZ");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespacePointer.setNamespaceResolver(namespaceResolver);
        namespacePointer.setIndex(0);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(namespacePointer);
        nullPropertyPointer.setPropertyIndex(Integer.MAX_VALUE);
        nullPropertyPointer.setPropertyName("10");
        
        nullPropertyPointer.createPath(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createPath(org.apache.commons.jxpath.JXPathContext)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreatePath1() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        nullPropertyPointer.createPath(jXPathContextReferenceImpl);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreatePath2() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        nullPropertyPointer1.createPath(jXPathContextReferenceImpl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createPath(org.apache.commons.jxpath.JXPathContext)
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath3() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        
        nullPropertyPointer2.createPath(null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath4() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", anonymousNullPointer);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        
        nullPropertyPointer1.createPath(null);
    }
    
    @Test
    public void testCreatePath5() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        NullPointer parent2 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent3 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        MapDynamicPropertyHandler handler = ((MapDynamicPropertyHandler) createInstance("org.apache.commons.jxpath.MapDynamicPropertyHandler"));
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        String name = "";
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "name", name);
        Object bean = createInstance("java.lang.Object");
        parent3.bean = bean;
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent3);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.Map (java.lang.Object and java.util.Map are in module java.base of loader 'bootstrap')]
            org.apache.commons.jxpath.MapDynamicPropertyHandler.getProperty(MapDynamicPropertyHandler.java:51)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104) */
        nullPropertyPointer.createPath(null);
    }
    
    @Test
    public void testCreatePath6() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        NullPointer parent2 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        DynamicPropertyPointer parent3 = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        ServletRequestHandler handler = ((ServletRequestHandler) createInstance("org.apache.commons.jxpath.servlet.ServletRequestHandler"));
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        String name = "";
        setField(parent3, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "name", name);
        Object bean = createInstance("java.lang.Object");
        parent3.bean = bean;
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent3);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.servlet.ServletRequestAndContext (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.servlet.ServletRequestAndContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5a1d61ba)]
            org.apache.commons.jxpath.servlet.ServletRequestHandler.getProperty(ServletRequestHandler.java:48)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:159)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:210)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104)
            org.apache.commons.jxpath.ri.model.beans.NullPointer.createPath(NullPointer.java:87)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:104) */
        nullPropertyPointer.createPath(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: NodePointer newParent = parent.createPath(context);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCreatePath_ThrowUnsupportedOperationException() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        
        nullPropertyPointer.createPath(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: NodePointer newParent = parent.createPath(context);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCreatePath_ThrowUnsupportedOperationException_1() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        
        nullPropertyPointer.createPath(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: NodePointer newParent = parent.createPath(context);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCreatePath_ThrowUnsupportedOperationException_2() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        
        nullPropertyPointer.createPath(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#createPath(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodePointer newParent = parent.createPath(context);
 *  */
    @Test
    public void testCreatePath_ThrowNullPointerException1() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.createPath(NullPropertyPointer.java:131) */
        nullPropertyPointer.createPath(null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
     */
    @Test(expected = JXPathException.class)
    public void testCreatePathThrowsJXPE1() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "XZ");
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        namespacePointer.setNamespaceResolver(namespaceResolver);
        namespacePointer.setIndex(0);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(namespacePointer);
        nullPropertyPointer.setPropertyName("10");
        nullPropertyPointer.setPropertyIndex(Integer.MAX_VALUE);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        NamespaceResolver namespaceResolver3 = new NamespaceResolver(namespaceResolver2);
        nullPropertyPointer.setNamespaceResolver(namespaceResolver3);
        nullPropertyPointer.setIndex(-1);
        
        nullPropertyPointer.createPath(null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreatePath7() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer1.createPath(jXPathContextReferenceImpl, object);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreatePath8() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer2.createPath(jXPathContextReferenceImpl, object);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCreatePath9() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        NullPropertyPointer nullPropertyPointer3 = new NullPropertyPointer(nullPropertyPointer2);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer3.createPath(jXPathContextReferenceImpl, object);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath10() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", anonymousNullPointer);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        Object object = new Object();
        
        nullPropertyPointer.createPath(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath11() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        Object object = new Object();
        
        nullPropertyPointer.createPath(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath12() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        Object object = new Object();
        
        nullPropertyPointer.createPath(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath13() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(nullPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer);
        NullPropertyPointer nullPropertyPointer2 = new NullPropertyPointer(nullPropertyPointer1);
        Object object = new Object();
        
        nullPropertyPointer2.createPath(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath14() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        NullPropertyPointer parent2 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        Object object = new Object();
        
        nullPropertyPointer.createPath(jXPathContextReferenceImpl, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath15() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        NullPropertyPointer parent2 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        Object object = new Object();
        
        nullPropertyPointer.createPath(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath16() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPropertyPointer parent1 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent2 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        Object object = new Object();
        
        nullPropertyPointer.createPath(null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCreatePath17() throws Exception  {
        NullPointer anonymousNullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPropertyPointer parent1 = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        NullPointer parent2 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(parent2, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        setField(parent1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent2);
        setField(parent, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        setField(anonymousNullPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(anonymousNullPointer);
        Object object = new Object();
        
        nullPropertyPointer.createPath(null, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.setPropertyName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPropertyName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#setPropertyName(java.lang.String)}
 *  */
    @Test
    public void testSetPropertyName() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        
        nullPropertyPointer.setPropertyName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getBaseValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseValue()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getBaseValue()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBaseValue_ReturnNull() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        Object actual = nullPropertyPointer.getBaseValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyNames()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#getPropertyNames()}
 * @utbot.returnsFrom {@code return new String[0];}
 *  */
    @Test
    public void testGetPropertyNames_ReturnNewArrayOfString() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        java.lang.String[] actual = nullPropertyPointer.getPropertyNames();
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.isCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCollection()
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#isCollection()}
 * @utbot.returnsFrom {@code return getIndex() != WHOLE_COLLECTION;}
 *  */
    @Test
    public void testIsCollection_GetIndexNotEqualsWHOLE_COLLECTION() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        
        boolean actual = nullPropertyPointer.isCollection();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NullPropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer#isCollection()}
 * @utbot.returnsFrom {@code return getIndex() != WHOLE_COLLECTION;}
 *  */
    @Test
    public void testIsCollection_GetIndexEqualsWHOLE_COLLECTION() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        nullPropertyPointer.setIndex(Integer.MIN_VALUE);
        
        boolean actual = nullPropertyPointer.isCollection();
        
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1043519336247900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043519336247900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043519336253300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043519336247900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043519336253300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043519336908600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043519336908600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043519336910100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043519336908600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043519336910100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1043519337280500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1043519337280500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1043519337281500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043519337280500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043519337281500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1043519337557700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1043519337557700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1043519337558600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1043519337557700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1043519337558600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

