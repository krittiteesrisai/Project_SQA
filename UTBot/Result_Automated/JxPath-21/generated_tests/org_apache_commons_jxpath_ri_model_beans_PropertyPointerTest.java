package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.PageScopeContextHandler;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.commons.beanutils.LazyDynaClass;
import org.apache.commons.beanutils.DynaProperty;
import org.apache.commons.jxpath.servlet.ServletContextHandler;
import java.lang.reflect.Constructor;
import java.util.Locale;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import java.util.LinkedHashMap;
import java.beans.PropertyDescriptor;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import java.lang.ref.SoftReference;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.model.dom.NamespacePointer;
import java.util.HashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_jxpath_ri_model_beans_PropertyPointerTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getName()}
 * @utbot.returnsFrom {@code return new QName(null, getPropertyName());}
 *  */
    @Test
    public void testGetName_Return() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        String name = "";
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
        
        QName actual = dynaBeanPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(expected, "org.apache.commons.jxpath.ri.QName", "name", name);
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", name);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getName()}
 * @utbot.returnsFrom {@code return new QName(null, getPropertyName());}
 *  */
    @Test
    public void testGetName_Return_2() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        java.lang.String[] names = {};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        
        QName actual = dynaBeanPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "*";
        setField(expected, "org.apache.commons.jxpath.ri.QName", "name", name);
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", name);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getName()}
 * @utbot.returnsFrom {@code return new QName(null, getPropertyName());}
 *  */
    @Test
    public void testGetName_Return_3() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        java.lang.String[] names = {null};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = -1;
        
        QName actual = dynaBeanPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "*";
        setField(expected, "org.apache.commons.jxpath.ri.QName", "name", name);
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", name);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] dynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames0 = ((String) get(dynaBeanPropertyPointerNames, 0));
        
        assertNull(finalDynaBeanPropertyPointerNames0);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getName()}
 * @utbot.returnsFrom {@code return new QName(null, getPropertyName());}
 *  */
    @Test
    public void testGetName_Return_1() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        java.lang.String[] names = {null};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        
        QName actual = dynaBeanPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] dynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames0 = ((String) get(dynaBeanPropertyPointerNames, 0));
        
        assertNull(finalDynaBeanPropertyPointerNames0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getName()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getName()}
     */
    @Test
    public void testGetNameThrowsNPE() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MIN_VALUE);
        dynamicPropertyPointer.setPropertyIndex(1);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:106)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83) */
        dynamicPropertyPointer.getName();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getName()
    
    @Test
    public void testGetName1() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        String name = "";
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "name", name);
        
        QName actual = dynamicPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(expected, "org.apache.commons.jxpath.ri.QName", "name", name);
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", name);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetName2() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        dynamicPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        
        QName actual = dynamicPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "*";
        setField(expected, "org.apache.commons.jxpath.ri.QName", "name", name);
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", name);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] dynamicPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames0 = ((String) get(dynamicPropertyPointerNames, 0));
        java.lang.String[] dynamicPropertyPointerNames1 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames1 = ((String) get(dynamicPropertyPointerNames1, 1));
        java.lang.String[] dynamicPropertyPointerNames2 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames2 = ((String) get(dynamicPropertyPointerNames2, 2));
        java.lang.String[] dynamicPropertyPointerNames3 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames3 = ((String) get(dynamicPropertyPointerNames3, 3));
        java.lang.String[] dynamicPropertyPointerNames4 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames4 = ((String) get(dynamicPropertyPointerNames4, 4));
        java.lang.String[] dynamicPropertyPointerNames5 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames5 = ((String) get(dynamicPropertyPointerNames5, 5));
        java.lang.String[] dynamicPropertyPointerNames6 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames6 = ((String) get(dynamicPropertyPointerNames6, 6));
        java.lang.String[] dynamicPropertyPointerNames7 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames7 = ((String) get(dynamicPropertyPointerNames7, 7));
        java.lang.String[] dynamicPropertyPointerNames8 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames8 = ((String) get(dynamicPropertyPointerNames8, 8));
        
        assertNull(finalDynamicPropertyPointerNames0);
        
        assertNull(finalDynamicPropertyPointerNames1);
        
        assertNull(finalDynamicPropertyPointerNames2);
        
        assertNull(finalDynamicPropertyPointerNames3);
        
        assertNull(finalDynamicPropertyPointerNames4);
        
        assertNull(finalDynamicPropertyPointerNames5);
        
        assertNull(finalDynamicPropertyPointerNames6);
        
        assertNull(finalDynamicPropertyPointerNames7);
        
        assertNull(finalDynamicPropertyPointerNames8);
    }
    
    @Test
    public void testGetName3() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        
        QName actual = dynamicPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] dynamicPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames0 = ((String) get(dynamicPropertyPointerNames, 0));
        java.lang.String[] dynamicPropertyPointerNames1 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames1 = ((String) get(dynamicPropertyPointerNames1, 1));
        java.lang.String[] dynamicPropertyPointerNames2 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames2 = ((String) get(dynamicPropertyPointerNames2, 2));
        java.lang.String[] dynamicPropertyPointerNames3 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames3 = ((String) get(dynamicPropertyPointerNames3, 3));
        java.lang.String[] dynamicPropertyPointerNames4 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames4 = ((String) get(dynamicPropertyPointerNames4, 4));
        java.lang.String[] dynamicPropertyPointerNames5 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames5 = ((String) get(dynamicPropertyPointerNames5, 5));
        java.lang.String[] dynamicPropertyPointerNames6 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames6 = ((String) get(dynamicPropertyPointerNames6, 6));
        java.lang.String[] dynamicPropertyPointerNames7 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames7 = ((String) get(dynamicPropertyPointerNames7, 7));
        java.lang.String[] dynamicPropertyPointerNames8 = ((java.lang.String[]) getFieldValue(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalDynamicPropertyPointerNames8 = ((String) get(dynamicPropertyPointerNames8, 8));
        
        assertNull(finalDynamicPropertyPointerNames0);
        
        assertNull(finalDynamicPropertyPointerNames1);
        
        assertNull(finalDynamicPropertyPointerNames2);
        
        assertNull(finalDynamicPropertyPointerNames3);
        
        assertNull(finalDynamicPropertyPointerNames4);
        
        assertNull(finalDynamicPropertyPointerNames5);
        
        assertNull(finalDynamicPropertyPointerNames6);
        
        assertNull(finalDynamicPropertyPointerNames7);
        
        assertNull(finalDynamicPropertyPointerNames8);
    }
    
    @Test
    public void testGetName4() throws Exception  {
        LazyDynaBean lazyDynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = new org.apache.commons.beanutils.DynaProperty[9];
        DynaProperty dynaProperty = ((DynaProperty) createInstance("org.apache.commons.beanutils.DynaProperty"));
        String name = "";
        setField(dynaProperty, "org.apache.commons.beanutils.DynaProperty", "name", name);
        properties[0] = dynaProperty;
        properties[1] = dynaProperty;
        properties[2] = dynaProperty;
        properties[3] = dynaProperty;
        properties[4] = dynaProperty;
        properties[5] = dynaProperty;
        properties[6] = dynaProperty;
        properties[7] = dynaProperty;
        properties[8] = dynaProperty;
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(lazyDynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, lazyDynaBean);
        
        java.lang.String[] initialDynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        
        QName actual = dynaBeanPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "*";
        setField(expected, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", name1);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] finalDynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        
        assertFalse(initialDynaBeanPropertyPointerNames == finalDynaBeanPropertyPointerNames);
    }
    
    @Test
    public void testGetName5() throws Exception  {
        LazyDynaBean lazyDynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = {};
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(lazyDynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, lazyDynaBean);
        
        java.lang.String[] initialDynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        
        QName actual = dynaBeanPropertyPointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "*";
        setField(expected, "org.apache.commons.jxpath.ri.QName", "name", name);
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", name);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] finalDynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        
        assertFalse(initialDynaBeanPropertyPointerNames == finalDynaBeanPropertyPointerNames);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getName()
    
    @Test
    public void testGetName6() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        ServletContextHandler handler = ((ServletContextHandler) createInstance("org.apache.commons.jxpath.servlet.ServletContextHandler"));
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        int[] bean = {};
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName] produces [java.lang.ClassCastException: class [I cannot be cast to class javax.servlet.ServletContext ([I is in module java.base of loader 'bootstrap'; javax.servlet.ServletContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @100522e2)]
            org.apache.commons.jxpath.servlet.ServletContextHandler.collectPropertyNames(ServletContextHandler.java:49)
            org.apache.commons.jxpath.servlet.ServletContextHandler.getPropertyNames(ServletContextHandler.java:39)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:106)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83) */
        dynamicPropertyPointer.getName();
    }
    
    @Test
    public void testGetName7() throws Exception  {
        Object strictLazyDynaBeanPointer = createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer");
        Class dynamicPropertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer");
        Class strictLazyDynaBeanPointerType = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class dynamicPropertyHandlerType = Class.forName("org.apache.commons.jxpath.DynamicPropertyHandler");
        Constructor dynamicPropertyPointerConstructor = dynamicPropertyPointerClazz.getDeclaredConstructor(strictLazyDynaBeanPointerType, dynamicPropertyHandlerType);
        dynamicPropertyPointerConstructor.setAccessible(true);
        java.lang.Object[] dynamicPropertyPointerConstructorArguments = new java.lang.Object[2];
        dynamicPropertyPointerConstructorArguments[0] = strictLazyDynaBeanPointer;
        dynamicPropertyPointerConstructorArguments[1] = ((Object) null);
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) dynamicPropertyPointerConstructor.newInstance(dynamicPropertyPointerConstructorArguments));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:106)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83) */
        dynamicPropertyPointer.getName();
    }
    
    @Test
    public void testGetName8() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(nullPropertyPointer, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:42)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getValuePointer(NullPropertyPointer.java:69)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:365)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:106)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83) */
        dynamicPropertyPointer.getName();
    }
    
    @Test
    public void testGetName9() throws Exception  {
        LazyDynaBean lazyDynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = new org.apache.commons.beanutils.DynaProperty[9];
        DynaProperty dynaProperty = ((DynaProperty) createInstance("org.apache.commons.beanutils.DynaProperty"));
        properties[0] = dynaProperty;
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(lazyDynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, lazyDynaBean);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:80)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:98)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83) */
        dynaBeanPropertyPointer.getName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof PropertyPointer)): True}
 *  */
    @Test
    public void testEquals_NotObjectInstanceOfPropertyPointer() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        
        boolean actual = beanPropertyPointer.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof PropertyPointer)): False}
 * @utbot.executesCondition {@code (parent != other.parent): True}
 * @utbot.executesCondition {@code (parent == null): True}
 *  */
    @Test
    public void testEquals_ParentEqualsNull() throws Exception  {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        Object strictLazyDynaBeanPointer = createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer");
        Class dynaBeanPropertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer");
        Class strictLazyDynaBeanPointerType = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class dynaBeanType = Class.forName("org.apache.commons.beanutils.DynaBean");
        Constructor dynaBeanPropertyPointerConstructor = dynaBeanPropertyPointerClazz.getDeclaredConstructor(strictLazyDynaBeanPointerType, dynaBeanType);
        dynaBeanPropertyPointerConstructor.setAccessible(true);
        java.lang.Object[] dynaBeanPropertyPointerConstructorArguments = new java.lang.Object[2];
        dynaBeanPropertyPointerConstructorArguments[0] = strictLazyDynaBeanPointer;
        dynaBeanPropertyPointerConstructorArguments[1] = ((Object) null);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) dynaBeanPropertyPointerConstructor.newInstance(dynaBeanPropertyPointerConstructorArguments));
        
        boolean actual = nullPropertyPointer.equals(dynaBeanPropertyPointer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Object() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        
        boolean actual = dynaBeanPropertyPointer.equals(dynaBeanPropertyPointer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof PropertyPointer)): False}
 * @utbot.executesCondition {@code (parent != other.parent): True}
 * @utbot.executesCondition {@code (parent == null): False}
 *  */
    @Test
    public void testEquals_ParentNotEqualsNull_2() throws Exception  {
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        NullPointer nullPointer = new NullPointer(qName, ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        NullPointer nullPointer1 = new NullPointer(((QName) null), ((Locale) null));
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(nullPointer1, null);
        
        boolean actual = nullPropertyPointer.equals(dynamicPropertyPointer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof PropertyPointer)): False}
 * @utbot.executesCondition {@code (parent != other.parent): True}
 * @utbot.executesCondition {@code (parent == null): False}
 *  */
    @Test
    public void testEquals_ParentNotEqualsNull_1() throws Exception  {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(nullPointer, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        NullPointer nullPointer1 = new NullPointer(qName, ((Locale) null));
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(nullPointer1, null);
        
        boolean actual = dynamicPropertyPointer.equals(beanPropertyPointer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof PropertyPointer)): False}
 * @utbot.executesCondition {@code (parent != other.parent): True}
 * @utbot.executesCondition {@code (parent == null): False}
 *  */
    @Test
    public void testEquals_ParentNotEqualsNull() {
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(nullPointer, null);
        DynamicPointer dynamicPointer = new DynamicPointer(((QName) null), ((Object) null), ((DynamicPropertyHandler) null), ((Locale) null));
        BeanPropertyPointer beanPropertyPointer1 = new BeanPropertyPointer(dynamicPointer, null);
        
        boolean actual = beanPropertyPointer.equals(beanPropertyPointer1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        boolean actual = dynamicPropertyPointer.equals(nullPropertyPointer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        java.lang.String[] names = {};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        
        boolean actual = dynaBeanPropertyPointer.equals(anonymousDynaBeanPropertyPointer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        java.lang.String[] names = {};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        boolean actual = dynaBeanPropertyPointer.equals(nullPropertyPointer);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals4() throws Exception  {
        Object strictLazyDynaBeanPointer = createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer");
        Class dynaBeanPropertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer");
        Class strictLazyDynaBeanPointerType = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class dynaBeanType = Class.forName("org.apache.commons.beanutils.DynaBean");
        Constructor dynaBeanPropertyPointerConstructor = dynaBeanPropertyPointerClazz.getDeclaredConstructor(strictLazyDynaBeanPointerType, dynaBeanType);
        dynaBeanPropertyPointerConstructor.setAccessible(true);
        java.lang.Object[] dynaBeanPropertyPointerConstructorArguments = new java.lang.Object[2];
        dynaBeanPropertyPointerConstructorArguments[0] = strictLazyDynaBeanPointer;
        dynaBeanPropertyPointerConstructorArguments[1] = ((Object) null);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) dynaBeanPropertyPointerConstructor.newInstance(dynaBeanPropertyPointerConstructorArguments));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        boolean actual = dynaBeanPropertyPointer.equals(nullPropertyPointer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals5() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        String name = "";
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
        java.lang.String[] names = new java.lang.String[9];
        names[0] = name;
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        boolean actual = dynaBeanPropertyPointer.equals(nullPropertyPointer);
        
        assertFalse(actual);
        
        java.lang.String[] dynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames1 = ((String) get(dynaBeanPropertyPointerNames, 1));
        java.lang.String[] dynaBeanPropertyPointerNames1 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames2 = ((String) get(dynaBeanPropertyPointerNames1, 2));
        java.lang.String[] dynaBeanPropertyPointerNames2 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames3 = ((String) get(dynaBeanPropertyPointerNames2, 3));
        java.lang.String[] dynaBeanPropertyPointerNames3 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames4 = ((String) get(dynaBeanPropertyPointerNames3, 4));
        java.lang.String[] dynaBeanPropertyPointerNames4 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames5 = ((String) get(dynaBeanPropertyPointerNames4, 5));
        java.lang.String[] dynaBeanPropertyPointerNames5 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames6 = ((String) get(dynaBeanPropertyPointerNames5, 6));
        java.lang.String[] dynaBeanPropertyPointerNames6 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames7 = ((String) get(dynaBeanPropertyPointerNames6, 7));
        java.lang.String[] dynaBeanPropertyPointerNames7 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames8 = ((String) get(dynaBeanPropertyPointerNames7, 8));
        int finalDynaBeanPropertyPointerPropertyIndex = dynaBeanPropertyPointer.propertyIndex;
        
        assertNull(finalDynaBeanPropertyPointerNames1);
        
        assertNull(finalDynaBeanPropertyPointerNames2);
        
        assertNull(finalDynaBeanPropertyPointerNames3);
        
        assertNull(finalDynaBeanPropertyPointerNames4);
        
        assertNull(finalDynaBeanPropertyPointerNames5);
        
        assertNull(finalDynaBeanPropertyPointerNames6);
        
        assertNull(finalDynaBeanPropertyPointerNames7);
        
        assertNull(finalDynaBeanPropertyPointerNames8);
        
        assertEquals(0, finalDynaBeanPropertyPointerPropertyIndex);
    }
    
    @Test
    public void testEquals6() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        
        boolean actual = dynamicPropertyPointer.equals(nullPropertyPointer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals7() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        
        boolean actual = anonymousDynaBeanPropertyPointer.equals(nullPropertyPointer);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals8() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        java.lang.String[] names = {};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        
        boolean actual = dynaBeanPropertyPointer.equals(nullPropertyPointer);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals9() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {};
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        dynamicPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        
        boolean actual = dynamicPropertyPointer.equals(nullPropertyPointer);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals10() throws Exception  {
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String qualifiedName = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "qualifiedName", qualifiedName);
        NullPointer nullPointer = new NullPointer(qName, ((Locale) null));
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(nullPointer, null);
        QName qName1 = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        NullPointer nullPointer1 = new NullPointer(qName1, ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer1);
        
        boolean actual = dynamicPropertyPointer.equals(nullPropertyPointer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals11() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        ServletContextHandler handler = ((ServletContextHandler) createInstance("org.apache.commons.jxpath.servlet.ServletContextHandler"));
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        dynamicPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        short[] bean = {};
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(nullPointer, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.ClassCastException: class [S cannot be cast to class javax.servlet.ServletContext ([S is in module java.base of loader 'bootstrap'; javax.servlet.ServletContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @100522e2)]
            org.apache.commons.jxpath.servlet.ServletContextHandler.collectPropertyNames(ServletContextHandler.java:49)
            org.apache.commons.jxpath.servlet.ServletContextHandler.getPropertyNames(ServletContextHandler.java:39)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex(DynamicPropertyPointer.java:136)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynamicPropertyPointer.equals(dynaBeanPropertyPointer);
    }
    
    @Test
    public void testEquals12() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:76)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:98)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:239) */
        dynaBeanPropertyPointer.equals(anonymousDynaBeanPropertyPointer);
    }
    
    @Test
    public void testEquals13() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:76)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:98)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:239) */
        dynaBeanPropertyPointer.equals(anonymousDynaBeanPropertyPointer);
    }
    
    @Test
    public void testEquals14() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        dynamicPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex(DynamicPropertyPointer.java:138)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynamicPropertyPointer.equals(nullPropertyPointer);
    }
    
    @Test
    public void testEquals15() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        java.lang.String[] names = new java.lang.String[9];
        String string = "";
        names[0] = string;
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        anonymousDynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyIndex(DynaBeanPropertyPointer.java:122)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynaBeanPropertyPointer.equals(anonymousDynaBeanPropertyPointer);
    }
    
    @Test
    public void testEquals16() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        java.lang.String[] names = new java.lang.String[9];
        String string = "";
        names[0] = string;
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyIndex(DynaBeanPropertyPointer.java:122)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynaBeanPropertyPointer.equals(nullPropertyPointer);
    }
    
    @Test
    public void testEquals17() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex(DynamicPropertyPointer.java:136)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        nullPropertyPointer.equals(dynamicPropertyPointer);
    }
    
    @Test
    public void testEquals18() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        dynamicPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex(DynamicPropertyPointer.java:136)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynamicPropertyPointer.equals(nullPropertyPointer);
    }
    
    @Test
    public void testEquals19() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        DynaBeanPropertyPointer dynaBeanPropertyPointer1 = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = {null, null, null, null, null, null, null, null, null};
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        setField(dynaBeanPropertyPointer1, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        dynaBeanPropertyPointer1.propertyIndex = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:80)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyIndex(DynaBeanPropertyPointer.java:120)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynaBeanPropertyPointer.equals(dynaBeanPropertyPointer1);
    }
    
    @Test
    public void testEquals20() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = {null, null, null, null, null, null, null, null, null};
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        anonymousDynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer1 = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        NullPointer parent1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(anonymousDynaBeanPropertyPointer1, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:80)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyIndex(DynaBeanPropertyPointer.java:120)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        anonymousDynaBeanPropertyPointer.equals(anonymousDynaBeanPropertyPointer1);
    }
    
    @Test
    public void testEquals21() throws Exception  {
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String qualifiedName = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "qualifiedName", qualifiedName);
        NullPointer nullPointer = new NullPointer(qName, ((Locale) null));
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(nullPointer, null);
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String qualifiedName1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "qualifiedName", qualifiedName1);
        setField(parent, "org.apache.commons.jxpath.ri.model.beans.NullPointer", "name", name);
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:76)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyIndex(DynaBeanPropertyPointer.java:120)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynaBeanPropertyPointer.equals(anonymousDynaBeanPropertyPointer);
    }
    
    @Test
    public void testEquals22() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        dynamicPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(dynamicPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex(DynamicPropertyPointer.java:136)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynamicPropertyPointer.equals(nullPropertyPointer);
    }
    
    @Test
    public void testEquals23() throws Exception  {
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String qualifiedName = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "qualifiedName", qualifiedName);
        NullPointer nullPointer = new NullPointer(qName, ((Locale) null));
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(nullPointer, null);
        QName qName1 = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(qName1, "org.apache.commons.jxpath.ri.QName", "qualifiedName", qualifiedName);
        NullPointer nullPointer1 = new NullPointer(qName1, ((Locale) null));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(nullPointer1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyIndex(DynamicPropertyPointer.java:136)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.equals(PropertyPointer.java:238) */
        dynamicPropertyPointer.equals(nullPropertyPointer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        beanPropertyPointer.propertyIndex = -255;
        beanPropertyPointer.setIndex(-255);
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(-510, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_2() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        DynaBeanPointer parent = ((DynaBeanPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_8() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        BeanPointer parent = ((BeanPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_1() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(parent, "org.apache.commons.jxpath.ri.model.beans.NullPointer", "name", name);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_3() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        DynaBeanPointer parent = ((DynaBeanPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(parent, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer", "name", name);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_4() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        VariablePointer parent = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(parent, "org.apache.commons.jxpath.ri.model.VariablePointer", "name", name);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_9() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        BeanPointer parent = ((BeanPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(parent, "org.apache.commons.jxpath.ri.model.beans.BeanPointer", "name", name);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_6() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_5() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        VariablePointer parent = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(parent, "org.apache.commons.jxpath.ri.model.VariablePointer", "name", name);
        setField(parent, "org.apache.commons.jxpath.ri.model.VariablePointer", "actual", true);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.returnsFrom {@code return getImmediateParentPointer().hashCode() + propertyIndex + index;}
 *  */
    @Test
    public void testHashCode_ReturnGetImmediateParentPointerHashCodePlusPropertyIndexPlusIndex_7() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name1 = "";
        setField(name, "org.apache.commons.jxpath.ri.QName", "name", name1);
        setField(parent, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", "name", name);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        int actual = beanPropertyPointer.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#hashCode()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getImmediateParentPointer()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getImmediateParentPointer().hashCode() + propertyIndex + index;
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.hashCode(PropertyPointer.java:221) */
        beanPropertyPointer.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLength()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getLength()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getBaseValue()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return ValueUtils.getLength(getBaseValue());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLength_ThrowIllegalArgumentException() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = {null};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        
        dynaBeanPropertyPointer.getLength();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getLength()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getLength()}
     */
    @Test
    public void testGetLengthThrowsNPE() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MIN_VALUE);
        dynamicPropertyPointer.setPropertyIndex(1);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:165)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152) */
        dynamicPropertyPointer.getLength();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLength()
    
    @Test
    public void testGetLength1() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = new java.lang.String[17];
        String string = "";
        names[0] = string;
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:801)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152) */
        anonymousDynaBeanPropertyPointer.getLength();
    }
    
    @Test
    public void testGetLength2() throws Exception  {
        LazyDynaBean lazyDynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = {};
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(lazyDynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, lazyDynaBean);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:266)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152) */
        dynaBeanPropertyPointer.getLength();
    }
    
    @Test
    public void testGetLength3() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        anonymousDynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:801)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152) */
        anonymousDynaBeanPropertyPointer.getLength();
    }
    
    @Test
    public void testGetLength4() throws Exception  {
        LazyDynaBean lazyDynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = new org.apache.commons.beanutils.DynaProperty[9];
        DynaProperty dynaProperty = ((DynaProperty) createInstance("org.apache.commons.beanutils.DynaProperty"));
        properties[0] = dynaProperty;
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(lazyDynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, lazyDynaBean);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:80)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:98)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152) */
        dynaBeanPropertyPointer.getLength();
    }
    
    @Test
    public void testGetLength5() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        values.put(integer, object);
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        String name = "";
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:801)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152) */
        anonymousDynaBeanPropertyPointer.getLength();
    }
    
    @Test
    public void testGetLength6() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        values.put(integer, object);
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = 1073741824;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:801)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152) */
        dynaBeanPropertyPointer.getLength();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isLeaf
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLeaf()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isLeaf()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object value = getNode();
 *  */
    @Test
    public void testIsLeaf_ThrowNullPointerException() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isLeaf] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:76)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:98)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer(PropertyPointer.java:163)
            org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer(NodePointer.java:302)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:365)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isLeaf(PropertyPointer.java:142) */
        dynaBeanPropertyPointer.isLeaf();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isLeaf()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isLeaf()}
     */
    @Test
    public void testIsLeafThrowsNPE() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MAX_VALUE);
        dynamicPropertyPointer.setPropertyIndex(Integer.MIN_VALUE);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isLeaf] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:106)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer(PropertyPointer.java:163)
            org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer(NodePointer.java:302)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:365)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isLeaf(PropertyPointer.java:142) */
        dynamicPropertyPointer.isLeaf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.returnsFrom {@code return getValuePointer().compareChildNodePointers(pointer1, pointer2);}
 *  */
    @Test
    public void testCompareChildNodePointers_ReturnGetValuePointerCompareChildNodePointers() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = "\u0000";
            nullPropertyPointer.setPropertyName(propertyName);
            NullPointer nullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
            QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
            setField(name, "org.apache.commons.jxpath.ri.QName", "qualifiedName", propertyName);
            setField(nullPointer, "org.apache.commons.jxpath.ri.model.beans.NullPointer", "name", name);
            nullPointer.setIndex(-255);
            NullPointer nullPointer1 = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
            setField(nullPointer1, "org.apache.commons.jxpath.ri.model.beans.NullPointer", "name", name);
            nullPointer1.setIndex(-255);
            
            int actual = nullPropertyPointer.compareChildNodePointers(nullPointer, nullPointer1);
            
            assertEquals(0, actual);
        } finally {
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.returnsFrom {@code return getValuePointer().compareChildNodePointers(pointer1, pointer2);}
 *  */
    @Test
    public void testCompareChildNodePointers_ReturnGetValuePointerCompareChildNodePointers_1() throws Exception  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
            String propertyName = "\u0000";
            nullPropertyPointer.setPropertyName(propertyName);
            NullPointer nullPointer = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
            QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
            setField(name, "org.apache.commons.jxpath.ri.QName", "qualifiedName", propertyName);
            setField(nullPointer, "org.apache.commons.jxpath.ri.model.beans.NullPointer", "name", name);
            DynaBeanPointer dynaBeanPointer = ((DynaBeanPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
            setField(dynaBeanPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer", "name", name);
            
            int actual = nullPropertyPointer.compareChildNodePointers(nullPointer, dynaBeanPointer);
            
            assertEquals(0, actual);
        } finally {
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getValuePointer().compareChildNodePointers(pointer1, pointer2);
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_1() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.compareChildNodePointers(PropertyOwnerPointer.java:182)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers(PropertyPointer.java:251) */
        nullPropertyPointer.compareChildNodePointers(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:106)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer(PropertyPointer.java:163)
            org.apache.commons.jxpath.ri.model.NodePointer.getValuePointer(NodePointer.java:302)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.compareChildNodePointers(PropertyPointer.java:251) */
        dynamicPropertyPointer.compareChildNodePointers(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getImmediateValuePointer()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getImmediateValuePointer()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (NodePointer) this.clone()
 *  */
    @Test
    public void testGetImmediateValuePointer_ThrowNullPointerException() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor(BeanPropertyPointer.java:286)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyName(BeanPropertyPointer.java:268)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer(PropertyPointer.java:163) */
        beanPropertyPointer.getImmediateValuePointer();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getImmediateValuePointer()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getImmediateValuePointer()}
     */
    @Test
    public void testGetImmediateValuePointerThrowsNPE() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MIN_VALUE);
        dynamicPropertyPointer.setPropertyIndex(1);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:79)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyName(DynamicPropertyPointer.java:106)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getName(PropertyPointer.java:83)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateValuePointer(PropertyPointer.java:163) */
        dynamicPropertyPointer.getImmediateValuePointer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isActual()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActual()}
 * @utbot.returnsFrom {@code return super.isActual();}
 *  */
    @Test
    public void testIsActual_ReturnSuperIsActual() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        dynamicPropertyPointer.setIndex(Integer.MIN_VALUE);
        
        boolean actual = dynamicPropertyPointer.isActual();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActual()}
 * @utbot.returnsFrom {@code return super.isActual();}
 *  */
    @Test
    public void testIsActual_ReturnSuperIsActual_1() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        dynamicPropertyPointer.setIndex(-1);
        
        boolean actual = dynamicPropertyPointer.isActual();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActual()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsActual_ReturnFalse_1() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {null};
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors", propertyDescriptors);
        
        boolean actual = beanPropertyPointer.isActual();
        
        assertFalse(actual);
        
        java.beans.PropertyDescriptor[] beanPropertyPointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalBeanPropertyPointerPropertyDescriptors0 = ((PropertyDescriptor) get(beanPropertyPointerPropertyDescriptors, 0));
        
        assertNull(finalBeanPropertyPointerPropertyDescriptors0);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActual()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsActual_ReturnFalse() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {null};
        setField(beanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors", propertyDescriptors);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        
        java.beans.PropertyDescriptor[] initialBeanPropertyPointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        
        boolean actual = beanPropertyPointer.isActual();
        
        assertFalse(actual);
        
        JXPathBeanInfo beanPropertyPointerBeanInfo = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        java.beans.PropertyDescriptor[] beanPropertyPointerBeanInfoBeanInfoPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointerBeanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors"));
        PropertyDescriptor finalBeanPropertyPointerBeanInfoPropertyDescriptors0 = ((PropertyDescriptor) get(beanPropertyPointerBeanInfoBeanInfoPropertyDescriptors, 0));
        java.beans.PropertyDescriptor[] finalBeanPropertyPointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        
        assertFalse(initialBeanPropertyPointerPropertyDescriptors == finalBeanPropertyPointerPropertyDescriptors);
        
        assertNull(finalBeanPropertyPointerBeanInfoPropertyDescriptors0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isActual()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer#getPropertyDescriptor() twice
    /// execute conditions:
    ///     {@code (!isActualProperty()): True}
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActual()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsActual_ReturnFalse_4() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {};
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors", propertyDescriptors);
        
        boolean actual = beanPropertyPointer.isActual();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActual()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsActual_ReturnFalse_3() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {};
        setField(beanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors", propertyDescriptors);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        beanPropertyPointer.propertyIndex = -1;
        
        boolean actual = beanPropertyPointer.isActual();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActual()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsActual_ReturnFalse_2() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        Class clazz = Object.class;
        setField(beanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz", clazz);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        beanPropertyPointer.propertyIndex = -1;
        
        JXPathBeanInfo beanPropertyPointerBeanInfo = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        Class initialBeanPropertyPointerBeanInfoClazz = ((Class) getFieldValue(beanPropertyPointerBeanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz"));
        JXPathBeanInfo beanPropertyPointerBeanInfo1 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        java.beans.PropertyDescriptor[] initialBeanPropertyPointerBeanInfoPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointerBeanInfo1, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors"));
        
        boolean actual = beanPropertyPointer.isActual();
        
        assertFalse(actual);
        
        JXPathBeanInfo beanPropertyPointerBeanInfo2 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        Class finalBeanPropertyPointerBeanInfoClazz = ((Class) getFieldValue(beanPropertyPointerBeanInfo2, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz"));
        JXPathBeanInfo beanPropertyPointerBeanInfo3 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        java.beans.PropertyDescriptor[] finalBeanPropertyPointerBeanInfoPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointerBeanInfo3, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors"));
        
        assertFalse(initialBeanPropertyPointerBeanInfoClazz == finalBeanPropertyPointerBeanInfoClazz);
        
        assertFalse(initialBeanPropertyPointerBeanInfoPropertyDescriptors == finalBeanPropertyPointerBeanInfoPropertyDescriptors);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isActual()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActual()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isActualProperty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !isActualProperty()
 *  */
    @Test
    public void testIsActual_ThrowNullPointerException() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        beanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor(BeanPropertyPointer.java:286)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isActualProperty(BeanPropertyPointer.java:165)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual(PropertyPointer.java:117) */
        beanPropertyPointer.isActual();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isActual()
    
    @Test
    public void testIsActual1() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        Class clazz = Object.class;
        setField(beanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz", clazz);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        
        JXPathBeanInfo beanPropertyPointerBeanInfo = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        Class initialBeanPropertyPointerBeanInfoClazz = ((Class) getFieldValue(beanPropertyPointerBeanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz"));
        JXPathBeanInfo beanPropertyPointerBeanInfo1 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        java.beans.PropertyDescriptor[] initialBeanPropertyPointerBeanInfoPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointerBeanInfo1, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors"));
        
        boolean actual = beanPropertyPointer.isActual();
        
        assertFalse(actual);
        
        JXPathBeanInfo beanPropertyPointerBeanInfo2 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        Class finalBeanPropertyPointerBeanInfoClazz = ((Class) getFieldValue(beanPropertyPointerBeanInfo2, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz"));
        JXPathBeanInfo beanPropertyPointerBeanInfo3 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        java.beans.PropertyDescriptor[] finalBeanPropertyPointerBeanInfoPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointerBeanInfo3, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors"));
        
        assertFalse(initialBeanPropertyPointerBeanInfoClazz == finalBeanPropertyPointerBeanInfoClazz);
        
        assertFalse(initialBeanPropertyPointerBeanInfoPropertyDescriptors == finalBeanPropertyPointerBeanInfoPropertyDescriptors);
    }
    
    @Test
    public void testIsActual2() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {};
        setField(beanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors", propertyDescriptors);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        beanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        
        boolean actual = beanPropertyPointer.isActual();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsActual3() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        Class clazz = Object.class;
        setField(beanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz", clazz);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        beanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        
        JXPathBeanInfo beanPropertyPointerBeanInfo = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        Class initialBeanPropertyPointerBeanInfoClazz = ((Class) getFieldValue(beanPropertyPointerBeanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz"));
        JXPathBeanInfo beanPropertyPointerBeanInfo1 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        java.beans.PropertyDescriptor[] initialBeanPropertyPointerBeanInfoPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointerBeanInfo1, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors"));
        
        boolean actual = beanPropertyPointer.isActual();
        
        assertFalse(actual);
        
        JXPathBeanInfo beanPropertyPointerBeanInfo2 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        Class finalBeanPropertyPointerBeanInfoClazz = ((Class) getFieldValue(beanPropertyPointerBeanInfo2, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "clazz"));
        JXPathBeanInfo beanPropertyPointerBeanInfo3 = ((JXPathBeanInfo) getFieldValue(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo"));
        java.beans.PropertyDescriptor[] finalBeanPropertyPointerBeanInfoPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(beanPropertyPointerBeanInfo3, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors"));
        
        assertFalse(initialBeanPropertyPointerBeanInfoClazz == finalBeanPropertyPointerBeanInfoClazz);
        
        assertFalse(initialBeanPropertyPointerBeanInfoPropertyDescriptors == finalBeanPropertyPointerBeanInfoPropertyDescriptors);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isActual()
    
    @Test
    public void testIsActual4() throws Exception  {
        DynamicPropertyPointer dynamicPropertyPointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:165)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152)
            org.apache.commons.jxpath.ri.model.NodePointer.isActual(NodePointer.java:331)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual(PropertyPointer.java:121) */
        dynamicPropertyPointer.isActual();
    }
    
    @Test
    public void testIsActual5() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {null};
        setField(beanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors", propertyDescriptors);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        beanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.JXPathBasicBeanInfo.getPropertyDescriptor(JXPathBasicBeanInfo.java:139)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor(BeanPropertyPointer.java:286)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.isActualProperty(BeanPropertyPointer.java:165)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isActual(PropertyPointer.java:117) */
        beanPropertyPointer.isActual();
    }
    ///endregion
    
    ///region Errors report for isActual
    
    public void testIsActual_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field private static final java.beans.WeakIdentityMap java.beans.ThreadGroupContext.contexts accessible:
        module java.desktop does not "opens java.beans" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
 * @utbot.executesCondition {@code (index != WHOLE_COLLECTION): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testCreatePath_ThrowClassCastException() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        PropertyDescriptor propertyDescriptor = ((PropertyDescriptor) createInstance("java.beans.PropertyDescriptor"));
        SoftReference propertyTypeRef = ((SoftReference) createInstance("java.lang.ref.SoftReference"));
        setField(propertyTypeRef, "java.lang.ref.SoftReference", "timestamp", 1048180869L);
        byte[] referent = {};
        setField(propertyTypeRef, "java.lang.ref.Reference", "referent", referent);
        setField(propertyDescriptor, "java.beans.PropertyDescriptor", "propertyTypeRef", propertyTypeRef);
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptor", propertyDescriptor);
        beanPropertyPointer.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class] */
        beanPropertyPointer.createPath(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
 * @utbot.executesCondition {@code (index != WHOLE_COLLECTION): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#setValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreatePath_ThrowNullPointerException_1() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        String name = "";
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
        anonymousDynaBeanPropertyPointer.setIndex(Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.convert(DynaBeanPropertyPointer.java:260)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setValue(DynaBeanPropertyPointer.java:241)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.setValue(DynaBeanPropertyPointer.java:215)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(PropertyPointer.java:191) */
        anonymousDynaBeanPropertyPointer.createPath(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
 * @utbot.executesCondition {@code (index != WHOLE_COLLECTION): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index != WHOLE_COLLECTION && index >= getLength()
 *  */
    @Test
    public void testCreatePath_ThrowNullPointerException() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        beanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        beanPropertyPointer.setIndex(-255);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getPropertyDescriptor(BeanPropertyPointer.java:286)
            org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer.getLength(BeanPropertyPointer.java:196)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(PropertyPointer.java:188) */
        beanPropertyPointer.createPath(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createPath(org.apache.commons.jxpath.JXPathContext, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext,java.lang.Object)}
     */
    @Test
    public void testCreatePathThrowsNPE() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MAX_VALUE);
        dynamicPropertyPointer.setPropertyIndex(-2113929216);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath] produces [java.lang.NullPointerException] */
        dynamicPropertyPointer.createPath(null, null);
    }
    ///endregion
    
    ///region Errors report for createPath
    
    public void testCreatePath_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.beans.WeakIdentityMap java.beans.ThreadGroupContext.contexts accessible:
        module java.desktop does not "opens java.beans" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createPath(org.apache.commons.jxpath.JXPathContext)
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AbstractFactory factory = getAbstractFactory(context);
 *  */
    @Test
    public void testCreatePath_ThrowNullPointerException_11() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        String name = "";
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isIndexedProperty(DynaBeanPropertyPointer.java:203)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getImmediateNode(DynaBeanPropertyPointer.java:161)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(PropertyPointer.java:168) */
        dynaBeanPropertyPointer.createPath(jXPathContextReferenceImpl);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AbstractFactory factory = getAbstractFactory(context);
 *  */
    @Test
    public void testCreatePath_ThrowNullPointerException_2() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        String name = "*";
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137)
            org.apache.commons.jxpath.ri.model.NodePointer.asPath(NodePointer.java:698)
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:881)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(PropertyPointer.java:169) */
        anonymousDynaBeanPropertyPointer.createPath(jXPathContextReferenceImpl);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AbstractFactory factory = getAbstractFactory(context);
 *  */
    @Test
    public void testCreatePath_ThrowNullPointerException1() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        java.lang.String[] names = new java.lang.String[1];
        String string = "";
        names[0] = string;
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.isIndexedProperty(DynaBeanPropertyPointer.java:203)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getImmediateNode(DynaBeanPropertyPointer.java:161)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(PropertyPointer.java:168) */
        dynaBeanPropertyPointer.createPath(jXPathContextReferenceImpl);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createPath(org.apache.commons.jxpath.JXPathContext)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createPath(org.apache.commons.jxpath.JXPathContext)}
     */
    @Test
    public void testCreatePathThrowsNPE1() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(0);
        dynamicPropertyPointer.setPropertyIndex(Integer.MIN_VALUE);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath] produces [java.lang.NullPointerException] */
        dynamicPropertyPointer.createPath(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getImmediateNode()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getImmediateNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return value;
 *  */
    @Test
    public void testGetImmediateNode_ThrowNullPointerException() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode] produces [java.lang.NullPointerException] */
            anonymousDynaBeanPropertyPointer.getImmediateNode();
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getImmediateNode()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getBaseValue()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer#getPropertyName()}
 * @utbot.invokes {@link org.apache.commons.beanutils.DynaBean#get(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.beanutils.DynaBean#get(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getBaseValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ValueUtils.getValue(getBaseValue())
 *  */
    @Test
    public void testGetImmediateNode_ThrowNullPointerException_1() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
            LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
            java.lang.String[] names = {null};
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "value", uninitialized);
            anonymousDynaBeanPropertyPointer.setIndex(Integer.MIN_VALUE);
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode] produces [java.lang.NullPointerException] */
            anonymousDynaBeanPropertyPointer.getImmediateNode();
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getImmediateNode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getImmediateNode()}
     */
    @Test
    public void testGetImmediateNodeThrowsNPE() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MAX_VALUE);
        dynamicPropertyPointer.setPropertyIndex(Integer.MIN_VALUE);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode] produces [java.lang.NullPointerException] */
        dynamicPropertyPointer.getImmediateNode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getImmediateNode()
    
    @Test
    public void testGetImmediateNode1() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
            LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
            LinkedHashMap values = new LinkedHashMap();
            setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
            java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
            anonymousDynaBeanPropertyPointer.propertyIndex = 1073741824;
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "value", uninitialized);
            
            Object actual = anonymousDynaBeanPropertyPointer.getImmediateNode();
            
            assertNull(actual);
            
            java.lang.String[] anonymousDynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames0 = ((String) get(anonymousDynaBeanPropertyPointerNames, 0));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames1 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames1 = ((String) get(anonymousDynaBeanPropertyPointerNames1, 1));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames2 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames2 = ((String) get(anonymousDynaBeanPropertyPointerNames2, 2));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames3 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames3 = ((String) get(anonymousDynaBeanPropertyPointerNames3, 3));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames4 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames4 = ((String) get(anonymousDynaBeanPropertyPointerNames4, 4));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames5 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames5 = ((String) get(anonymousDynaBeanPropertyPointerNames5, 5));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames6 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames6 = ((String) get(anonymousDynaBeanPropertyPointerNames6, 6));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames7 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames7 = ((String) get(anonymousDynaBeanPropertyPointerNames7, 7));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames8 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames8 = ((String) get(anonymousDynaBeanPropertyPointerNames8, 8));
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames0);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames1);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames2);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames3);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames4);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames5);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames6);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames7);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames8);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    
    @Test
    public void testGetImmediateNode2() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        try {
            Object uninitialized = new Object();
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
            LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
            LinkedHashMap values = new LinkedHashMap();
            setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
            java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
            anonymousDynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
            Object value = createInstance("java.lang.Object");
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "value", value);
            anonymousDynaBeanPropertyPointer.setIndex(Integer.MIN_VALUE);
            
            Object actual = anonymousDynaBeanPropertyPointer.getImmediateNode();
            
            assertNull(actual);
            
            java.lang.String[] anonymousDynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames0 = ((String) get(anonymousDynaBeanPropertyPointerNames, 0));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames1 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames1 = ((String) get(anonymousDynaBeanPropertyPointerNames1, 1));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames2 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames2 = ((String) get(anonymousDynaBeanPropertyPointerNames2, 2));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames3 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames3 = ((String) get(anonymousDynaBeanPropertyPointerNames3, 3));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames4 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames4 = ((String) get(anonymousDynaBeanPropertyPointerNames4, 4));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames5 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames5 = ((String) get(anonymousDynaBeanPropertyPointerNames5, 5));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames6 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames6 = ((String) get(anonymousDynaBeanPropertyPointerNames6, 6));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames7 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames7 = ((String) get(anonymousDynaBeanPropertyPointerNames7, 7));
            java.lang.String[] anonymousDynaBeanPropertyPointerNames8 = ((java.lang.String[]) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
            String finalAnonymousDynaBeanPropertyPointerNames8 = ((String) get(anonymousDynaBeanPropertyPointerNames8, 8));
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames0);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames1);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames2);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames3);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames4);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames5);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames6);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames7);
            
            assertNull(finalAnonymousDynaBeanPropertyPointerNames8);
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getImmediateNode()
    
    @Test
    public void testGetImmediateNode3() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
            LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
            LinkedHashMap values = new LinkedHashMap();
            setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
            String name = "";
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "value", uninitialized);
            anonymousDynaBeanPropertyPointer.setIndex(Integer.MIN_VALUE);
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode] produces [java.lang.NullPointerException] */
            anonymousDynaBeanPropertyPointer.getImmediateNode();
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    
    @Test
    public void testGetImmediateNode4() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[][] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
            LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
            LinkedHashMap values = new LinkedHashMap();
            setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
            java.lang.String[] names = new java.lang.String[9];
            String string = "";
            names[0] = string;
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "value", uninitialized);
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode] produces [java.lang.NullPointerException] */
            anonymousDynaBeanPropertyPointer.getImmediateNode();
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    
    @Test
    public void testGetImmediateNode5() throws Exception  {
        Class propertyPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[][] uninitialized = {};
            setStaticField(propertyPointerClazz, "UNINITIALIZED", uninitialized);
            DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
            LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
            LinkedHashMap values = new LinkedHashMap();
            setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
            java.lang.String[] names = new java.lang.String[9];
            String string = "";
            names[0] = string;
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
            setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "value", uninitialized);
            anonymousDynaBeanPropertyPointer.setIndex(Integer.MIN_VALUE);
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getImmediateNode] produces [java.lang.NullPointerException] */
            anonymousDynaBeanPropertyPointer.getImmediateNode();
        } finally {
            setStaticField(PropertyPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.setPropertyIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPropertyIndex(int)
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#setPropertyIndex(int)}
 * @utbot.executesCondition {@code (propertyIndex != index): False}
 *  */
    @Test
    public void testSetPropertyIndex_PropertyIndexEqualsIndex() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        anonymousDynaBeanPropertyPointer.propertyIndex = -255;
        
        anonymousDynaBeanPropertyPointer.setPropertyIndex(-255);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#setPropertyIndex(int)}
 * @utbot.executesCondition {@code (propertyIndex != index): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#setIndex(int)}
 *  */
    @Test
    public void testSetPropertyIndex_PropertyIndexNotEqualsIndex() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        anonymousDynaBeanPropertyPointer.propertyIndex = -2;
        
        anonymousDynaBeanPropertyPointer.setPropertyIndex(-255);
        
        int finalAnonymousDynaBeanPropertyPointerPropertyIndex = anonymousDynaBeanPropertyPointer.propertyIndex;
        int finalAnonymousDynaBeanPropertyPointerIndex = ((Integer) getFieldValue(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "index"));
        
        assertEquals(-255, finalAnonymousDynaBeanPropertyPointerPropertyIndex);
        
        assertEquals(Integer.MIN_VALUE, finalAnonymousDynaBeanPropertyPointerIndex);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setPropertyIndex(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#setPropertyIndex(int)}
     */
    @Test
    public void testSetPropertyIndex() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MIN_VALUE);
        dynamicPropertyPointer.setPropertyIndex(-1);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        dynamicPropertyPointer.setPropertyIndex(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBean()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getBean()}
 * @utbot.executesCondition {@code (bean == null): False}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testGetBean_BeanNotEqualsNull() throws Exception  {
        BeanPropertyPointer beanPropertyPointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        byte[] bean = {};
        setField(beanPropertyPointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        
        byte[] actual = ((byte[]) beanPropertyPointer.getBean());
        
        assertArrayEquals(bean, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getBean()}
 * @utbot.executesCondition {@code (bean == null): True}
 *  */
    @Test
    public void testGetBean_BeanEqualsNull() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(nullPropertyPointer, null);
        
        Object actual = beanPropertyPointer.getBean();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getBean()}
 * @utbot.executesCondition {@code (bean == null): True}
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testGetBean_BeanEqualsNull_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class propertyOwnerPointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
        Object prevUNINITIALIZED = getStaticFieldValue(propertyOwnerPointerClazz, "UNINITIALIZED");
        try {
            java.lang.Object[] uninitialized = {};
            setStaticField(propertyOwnerPointerClazz, "UNINITIALIZED", uninitialized);
            NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
            BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(nullElementPointer, null);
            
            Object actual = beanPropertyPointer.getBean();
            
            assertNull(actual);
        } finally {
            setStaticField(PropertyOwnerPointer.class, "UNINITIALIZED", prevUNINITIALIZED);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBean()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getBean()}
 * @utbot.executesCondition {@code (bean == null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getImmediateParentPointer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bean = getImmediateParentPointer().getNode();
 *  */
    @Test
    public void testGetBean_ThrowNullPointerException() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77) */
        beanPropertyPointer.getBean();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBean()
    
    @Test
    public void testGetBean1() throws Exception  {
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000\u0000\u0000\u0000\u0000\u0000:";
        nullPropertyPointer.setPropertyName(propertyName);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(nullPropertyPointer, null);
        
        Object actual = dynaBeanPropertyPointer.getBean();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBean()
    
    @Test
    public void testGetBean2() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(namespacePointer, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getNamespaceURI(NamespacePointer.java:84)
            org.apache.commons.jxpath.ri.model.dom.NamespacePointer.getImmediateNode(NamespacePointer.java:79)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:365)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77) */
        dynaBeanPropertyPointer.getBean();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyPointer prop = (PropertyPointer) clone();
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:76)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:98)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getImmediateNode(DynaBeanPropertyPointer.java:152)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(PropertyPointer.java:168)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(PropertyPointer.java:217) */
        dynaBeanPropertyPointer.createChild(null, null, -255);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
     */
    @Test
    public void testCreateChildThrowsNPE() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MIN_VALUE);
        dynamicPropertyPointer.setPropertyIndex(1);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        QName qName = new QName("\n\t\r", "10");
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:165)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:219)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(PropertyPointer.java:217) */
        dynamicPropertyPointer.createChild(null, qName, 2143289343);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyPointer prop = (PropertyPointer) clone();
 *  */
    @Test
    public void testCreateChild_ThrowNullPointerException1() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:76)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:98)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getLength(PropertyPointer.java:152)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createPath(PropertyPointer.java:188)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(PropertyPointer.java:205) */
        dynaBeanPropertyPointer.createChild(null, null, -255, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    @Test
    public void testCreateChildByFuzzer() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MIN_VALUE);
        dynamicPropertyPointer.setPropertyIndex(1);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        QName qName = new QName("\n\t\r", "10");
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:165)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:219)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.createPath(DynamicPropertyPointer.java:256)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.createChild(PropertyPointer.java:205) */
        dynamicPropertyPointer.createChild(null, qName, -1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getPropertyIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyIndex()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getPropertyIndex()}
 * @utbot.returnsFrom {@code return propertyIndex;}
 *  */
    @Test
    public void testGetPropertyIndex_ReturnPropertyIndex() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        anonymousDynaBeanPropertyPointer.propertyIndex = -255;
        
        int actual = anonymousDynaBeanPropertyPointer.getPropertyIndex();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPropertyIndex()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getPropertyIndex()}
     */
    @Test
    public void testGetPropertyIndexReturnsOne() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MIN_VALUE);
        dynamicPropertyPointer.setPropertyIndex(1);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        int actual = dynamicPropertyPointer.getPropertyIndex();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isCollection()
    
    /**
    @utbot.classUnderTest {@link PropertyPointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isCollection()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#getBaseValue()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Object value = getBaseValue();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsCollection_ThrowIllegalArgumentException() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = {null};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        
        dynaBeanPropertyPointer.isCollection();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isCollection()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.beans.PropertyPointer#isCollection()}
     */
    @Test
    public void testIsCollectionThrowsNPE() {
        PageScopeContextHandler pageScopeContextHandler = new PageScopeContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, pageScopeContextHandler);
        dynamicPropertyPointer.setIndex(Integer.MAX_VALUE);
        dynamicPropertyPointer.setPropertyIndex(Integer.MIN_VALUE);
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        dynamicPropertyPointer.setNamespaceResolver(namespaceResolver1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:77)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getBaseValue(DynamicPropertyPointer.java:165)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137) */
        dynamicPropertyPointer.isCollection();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isCollection()
    
    @Test
    public void testIsCollection1() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        HashMap propertiesMap = new HashMap();
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "propertiesMap", propertiesMap);
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = new java.lang.String[17];
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = 1073741824;
        
        boolean actual = dynaBeanPropertyPointer.isCollection();
        
        assertFalse(actual);
        
        java.lang.String[] dynaBeanPropertyPointerNames = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames0 = ((String) get(dynaBeanPropertyPointerNames, 0));
        java.lang.String[] dynaBeanPropertyPointerNames1 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames1 = ((String) get(dynaBeanPropertyPointerNames1, 1));
        java.lang.String[] dynaBeanPropertyPointerNames2 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames2 = ((String) get(dynaBeanPropertyPointerNames2, 2));
        java.lang.String[] dynaBeanPropertyPointerNames3 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames3 = ((String) get(dynaBeanPropertyPointerNames3, 3));
        java.lang.String[] dynaBeanPropertyPointerNames4 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames4 = ((String) get(dynaBeanPropertyPointerNames4, 4));
        java.lang.String[] dynaBeanPropertyPointerNames5 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames5 = ((String) get(dynaBeanPropertyPointerNames5, 5));
        java.lang.String[] dynaBeanPropertyPointerNames6 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames6 = ((String) get(dynaBeanPropertyPointerNames6, 6));
        java.lang.String[] dynaBeanPropertyPointerNames7 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames7 = ((String) get(dynaBeanPropertyPointerNames7, 7));
        java.lang.String[] dynaBeanPropertyPointerNames8 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames8 = ((String) get(dynaBeanPropertyPointerNames8, 8));
        java.lang.String[] dynaBeanPropertyPointerNames9 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames9 = ((String) get(dynaBeanPropertyPointerNames9, 9));
        java.lang.String[] dynaBeanPropertyPointerNames10 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames10 = ((String) get(dynaBeanPropertyPointerNames10, 10));
        java.lang.String[] dynaBeanPropertyPointerNames11 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames11 = ((String) get(dynaBeanPropertyPointerNames11, 11));
        java.lang.String[] dynaBeanPropertyPointerNames12 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames12 = ((String) get(dynaBeanPropertyPointerNames12, 12));
        java.lang.String[] dynaBeanPropertyPointerNames13 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames13 = ((String) get(dynaBeanPropertyPointerNames13, 13));
        java.lang.String[] dynaBeanPropertyPointerNames14 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames14 = ((String) get(dynaBeanPropertyPointerNames14, 14));
        java.lang.String[] dynaBeanPropertyPointerNames15 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames15 = ((String) get(dynaBeanPropertyPointerNames15, 15));
        java.lang.String[] dynaBeanPropertyPointerNames16 = ((java.lang.String[]) getFieldValue(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names"));
        String finalDynaBeanPropertyPointerNames16 = ((String) get(dynaBeanPropertyPointerNames16, 16));
        
        assertNull(finalDynaBeanPropertyPointerNames0);
        
        assertNull(finalDynaBeanPropertyPointerNames1);
        
        assertNull(finalDynaBeanPropertyPointerNames2);
        
        assertNull(finalDynaBeanPropertyPointerNames3);
        
        assertNull(finalDynaBeanPropertyPointerNames4);
        
        assertNull(finalDynaBeanPropertyPointerNames5);
        
        assertNull(finalDynaBeanPropertyPointerNames6);
        
        assertNull(finalDynaBeanPropertyPointerNames7);
        
        assertNull(finalDynaBeanPropertyPointerNames8);
        
        assertNull(finalDynaBeanPropertyPointerNames9);
        
        assertNull(finalDynaBeanPropertyPointerNames10);
        
        assertNull(finalDynaBeanPropertyPointerNames11);
        
        assertNull(finalDynaBeanPropertyPointerNames12);
        
        assertNull(finalDynaBeanPropertyPointerNames13);
        
        assertNull(finalDynaBeanPropertyPointerNames14);
        
        assertNull(finalDynaBeanPropertyPointerNames15);
        
        assertNull(finalDynaBeanPropertyPointerNames16);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isCollection()
    
    @Test
    public void testIsCollection2() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        String name = "";
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaClass.isDynaProperty(LazyDynaClass.java:333)
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:797)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137) */
        dynaBeanPropertyPointer.isCollection();
    }
    
    @Test
    public void testIsCollection3() throws Exception  {
        LazyDynaBean lazyDynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = {};
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(lazyDynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, lazyDynaBean);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:266)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137) */
        dynaBeanPropertyPointer.isCollection();
    }
    
    @Test
    public void testIsCollection4() throws Exception  {
        LazyDynaBean lazyDynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LazyDynaClass dynaClass = ((LazyDynaClass) createInstance("org.apache.commons.beanutils.LazyDynaClass"));
        org.apache.commons.beanutils.DynaProperty[] properties = {null, null, null, null, null, null, null, null, null};
        setField(dynaClass, "org.apache.commons.beanutils.BasicDynaClass", "properties", properties);
        setField(lazyDynaBean, "org.apache.commons.beanutils.LazyDynaBean", "dynaClass", dynaClass);
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, lazyDynaBean);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyNames(DynaBeanPropertyPointer.java:80)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getPropertyName(DynaBeanPropertyPointer.java:98)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137) */
        dynaBeanPropertyPointer.isCollection();
    }
    
    @Test
    public void testIsCollection5() throws Exception  {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(dynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        dynaBeanPropertyPointer.propertyIndex = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:801)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137) */
        dynaBeanPropertyPointer.isCollection();
    }
    
    @Test
    public void testIsCollection6() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = new java.lang.String[9];
        String string = "";
        names[0] = string;
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:801)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137) */
        anonymousDynaBeanPropertyPointer.isCollection();
    }
    
    @Test
    public void testIsCollection7() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        String name = "";
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "name", name);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:801)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137) */
        anonymousDynaBeanPropertyPointer.isCollection();
    }
    
    @Test
    public void testIsCollection8() throws Exception  {
        DynaBeanPropertyPointer anonymousDynaBeanPropertyPointer = ((DynaBeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynabeans.StrictLazyDynaBeanPointerFactory$StrictLazyDynaBeanPointer$1"));
        LazyDynaBean dynaBean = ((LazyDynaBean) createInstance("org.apache.commons.beanutils.LazyDynaBean"));
        LinkedHashMap values = new LinkedHashMap();
        Integer integer = 0;
        java.lang.Object[] objectArray = new java.lang.Object[1];
        objectArray[0] = ((Object) integer);
        values.put(integer, objectArray);
        setField(dynaBean, "org.apache.commons.beanutils.LazyDynaBean", "values", values);
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "dynaBean", dynaBean);
        java.lang.String[] names = new java.lang.String[12];
        setField(anonymousDynaBeanPropertyPointer, "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer", "names", names);
        anonymousDynaBeanPropertyPointer.propertyIndex = 1073741824;
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection] produces [java.lang.NullPointerException]
            org.apache.commons.beanutils.LazyDynaBean.isDynaProperty(LazyDynaBean.java:801)
            org.apache.commons.beanutils.LazyDynaBean.get(LazyDynaBean.java:272)
            org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer.getBaseValue(DynaBeanPropertyPointer.java:58)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.isCollection(PropertyPointer.java:137) */
        anonymousDynaBeanPropertyPointer.isCollection();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1048292246821000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1048292246821000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1048292246833400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1048292246821000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1048292246833400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1048292247354000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1048292247354000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1048292247360800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1048292247354000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1048292247360800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1048292247862500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1048292247862500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1048292247868500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1048292247862500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1048292247868500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1048292248438100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1048292248438100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1048292248444000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1048292248438100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1048292248444000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

