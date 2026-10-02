package org.jsoup.nodes;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class org_jsoup_nodes_LeafNodeTest {
    ///region Test suites for executable org.jsoup.nodes.LeafNode.attr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAttr_Return() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string1 = "\u0000\u0000";
        
        CDataNode actual = ((CDataNode) cDataNode.attr(string, string1));
        
        Object cDataNodeValue = cDataNode.value;
        Object actualValue = actual.value;
        int cDataNodeValueSize = ((Integer) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "size"));
        int actualValueSize = ((Integer) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "size"));
        assertEquals(cDataNodeValueSize, actualValueSize);
        
        java.lang.String[] cDataNodeValueKeys = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "keys"));
        java.lang.String[] actualValueKeys = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "keys"));
        int cDataNodeValueKeysSize = cDataNodeValueKeys.length;
        assertEquals(cDataNodeValueKeysSize, actualValueKeys.length);
        assertTrue(deepEquals(cDataNodeValueKeys, actualValueKeys));
        
        java.lang.String[] cDataNodeValueVals = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "vals"));
        java.lang.String[] actualValueVals = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "vals"));
        int cDataNodeValueValsSize = cDataNodeValueVals.length;
        assertEquals(cDataNodeValueValsSize, actualValueVals.length);
        assertTrue(deepEquals(cDataNodeValueVals, actualValueVals));
        
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAttr_Return_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class objectType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(objectType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = object;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "#cdata";
        
        CDataNode actual = ((CDataNode) cDataNode.attr(string, null));
        
        Object actualValue = actual.value;
        assertNull(actualValue);
        
        Object finalCDataNodeValue = cDataNode.value;
        
        assertNull(finalCDataNodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAttr_Return_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        CDataNode actual = ((CDataNode) cDataNode.attr(string, null));
        
        Object cDataNodeValue = cDataNode.value;
        Object actualValue = actual.value;
        int cDataNodeValueSize = ((Integer) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "size"));
        int actualValueSize = ((Integer) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "size"));
        assertEquals(cDataNodeValueSize, actualValueSize);
        
        java.lang.String[] cDataNodeValueKeys = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "keys"));
        java.lang.String[] actualValueKeys = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "keys"));
        int cDataNodeValueKeysSize = cDataNodeValueKeys.length;
        assertEquals(cDataNodeValueKeysSize, actualValueKeys.length);
        assertTrue(deepEquals(cDataNodeValueKeys, actualValueKeys));
        
        java.lang.String[] cDataNodeValueVals = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "vals"));
        java.lang.String[] actualValueVals = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "vals"));
        int cDataNodeValueValsSize = cDataNodeValueVals.length;
        assertEquals(cDataNodeValueValsSize, actualValueVals.length);
        assertTrue(deepEquals(cDataNodeValueVals, actualValueVals));
        
        Object object = cDataNode.value;
        int finalCDataNodeValueSize = ((Integer) getFieldValue(object, "org.jsoup.nodes.Attributes", "size"));
        
        assertEquals(1, finalCDataNodeValueSize);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAttr_Return_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        CDataNode actual = ((CDataNode) cDataNode.attr(string, null));
        
        Object cDataNodeValue = cDataNode.value;
        Object actualValue = actual.value;
        int cDataNodeValueSize = ((Integer) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "size"));
        int actualValueSize = ((Integer) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "size"));
        assertEquals(cDataNodeValueSize, actualValueSize);
        
        java.lang.String[] cDataNodeValueKeys = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "keys"));
        java.lang.String[] actualValueKeys = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "keys"));
        int cDataNodeValueKeysSize = cDataNodeValueKeys.length;
        assertEquals(cDataNodeValueKeysSize, actualValueKeys.length);
        assertTrue(deepEquals(cDataNodeValueKeys, actualValueKeys));
        
        java.lang.String[] cDataNodeValueVals = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "vals"));
        java.lang.String[] actualValueVals = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "vals"));
        int cDataNodeValueValsSize = cDataNodeValueVals.length;
        assertEquals(cDataNodeValueValsSize, actualValueVals.length);
        assertTrue(deepEquals(cDataNodeValueVals, actualValueVals));
        
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAttr_Return_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            String string = " ";
            
            Object initialCDataNodeValue = cDataNode.value;
            
            CDataNode actual = ((CDataNode) cDataNode.attr(string, null));
            
            Object cDataNodeValue = cDataNode.value;
            Object actualValue = actual.value;
            int cDataNodeValueSize = ((Integer) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "size"));
            int actualValueSize = ((Integer) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "size"));
            assertEquals(cDataNodeValueSize, actualValueSize);
            
            java.lang.String[] cDataNodeValueKeys = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "keys"));
            java.lang.String[] actualValueKeys = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "keys"));
            int cDataNodeValueKeysSize = cDataNodeValueKeys.length;
            assertEquals(cDataNodeValueKeysSize, actualValueKeys.length);
            assertTrue(deepEquals(cDataNodeValueKeys, actualValueKeys));
            
            java.lang.String[] cDataNodeValueVals = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "vals"));
            java.lang.String[] actualValueVals = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "vals"));
            int cDataNodeValueValsSize = cDataNodeValueVals.length;
            assertEquals(cDataNodeValueValsSize, actualValueVals.length);
            assertTrue(deepEquals(cDataNodeValueVals, actualValueVals));
            
            Node actualParentNode = actual.parentNode;
            assertNull(actualParentNode);
            
            int cDataNodeSiblingIndex = cDataNode.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(cDataNodeSiblingIndex, actualSiblingIndex);
            
            Object finalCDataNodeValue = cDataNode.value;
            
            assertFalse(initialCDataNodeValue == finalCDataNodeValue);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAttr_Return_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            String string = "";
            CDataNode cDataNode = new CDataNode(string);
            String string1 = " ";
            
            CDataNode actual = ((CDataNode) cDataNode.attr(string1, null));
            
            Object cDataNodeValue = cDataNode.value;
            Object actualValue = actual.value;
            int cDataNodeValueSize = ((Integer) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "size"));
            int actualValueSize = ((Integer) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "size"));
            assertEquals(cDataNodeValueSize, actualValueSize);
            
            java.lang.String[] cDataNodeValueKeys = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "keys"));
            java.lang.String[] actualValueKeys = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "keys"));
            int cDataNodeValueKeysSize = cDataNodeValueKeys.length;
            assertEquals(cDataNodeValueKeysSize, actualValueKeys.length);
            assertTrue(deepEquals(cDataNodeValueKeys, actualValueKeys));
            
            java.lang.String[] cDataNodeValueVals = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "vals"));
            java.lang.String[] actualValueVals = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "vals"));
            int cDataNodeValueValsSize = cDataNodeValueVals.length;
            assertEquals(cDataNodeValueValsSize, actualValueVals.length);
            assertTrue(deepEquals(cDataNodeValueVals, actualValueVals));
            
            Node actualParentNode = actual.parentNode;
            assertNull(actualParentNode);
            
            int cDataNodeSiblingIndex = cDataNode.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(cDataNodeSiblingIndex, actualSiblingIndex);
            
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testAttr_ThrowClassCastException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            byte[] byteArray = {};
            Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
            Class byteArrayType = Class.forName("java.lang.String");
            Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(byteArrayType);
            cDataNodeConstructor.setAccessible(true);
            java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
            cDataNodeConstructorArguments[0] = ((Object) byteArray);
            CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
            String string = " ";
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            cDataNode.attr(string, null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testAttr_ThrowClassCastException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            byte[] byteArray = {};
            Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
            Class byteArrayType = Class.forName("java.lang.String");
            Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(byteArrayType);
            cDataNodeConstructor.setAccessible(true);
            java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
            cDataNodeConstructorArguments[0] = ((Object) byteArray);
            CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
            String string = "      ";
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            cDataNode.attr(string, null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException_5() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "@";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !hasAttributes() && key.equals(nodeName())
 *  */
    @Test
    public void testAttr_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class objectType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(objectType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = object;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.NullPointerException] */
        cDataNode.attr(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.NullPointerException] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.NullPointerException] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: super.attr(key, value);
 *  */
    @Test
    public void testAttr_ThrowNullPointerException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.NullPointerException] */
        cDataNode.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAttr_ThrowNullPointerException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.NullPointerException] */
        cDataNode.attr(string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#hasAttributes()}
 * @utbot.invokes org.jsoup.nodes.LeafNode#ensureAttributes()
 * @utbot.invokes {@link org.jsoup.nodes.Node#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.attr(key, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Attributes attributes = new Attributes();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.attr(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.attr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.attr(key);}
 *  */
    @Test
    public void testAttr_ReturnSuperAttr() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        String actual = cDataNode.attr(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.attr(key);}
 *  */
    @Test
    public void testAttr_ReturnSuperAttr_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "\u0000\u0000\u0000\u0000";
        
        String actual = cDataNode.attr(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return key.equals(nodeName()) ? (String) value : EmptyString;}
 *  */
    @Test
    public void testAttr_ReturnKeyEquals() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class objectType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(objectType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = object;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = " ";
        
        String actual = cDataNode.attr(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return key.equals(nodeName()) ? (String) value : EmptyString;}
 *  */
    @Test
    public void testAttr_ReturnKeyEquals_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class objectType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(objectType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = object;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "      ";
        
        String actual = cDataNode.attr(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.attr(key);}
 *  */
    @Test
    public void testAttr_ReturnSuperAttr_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "[";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        String actual = cDataNode.attr(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return key.equals(nodeName()) ? (String) value : EmptyString;}
 *  */
    @Test
    public void testAttr_ReturnKeyEquals_2() {
        CDataNode cDataNode = new CDataNode(null);
        String string = "#cdata";
        
        String actual = cDataNode.attr(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.attr(key);}
 *  */
    @Test
    public void testAttr_ReturnSuperAttr_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        String actual = cDataNode.attr(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException1() {
        CDataNode cDataNode = new CDataNode(null);
        
        cDataNode.attr(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (String) value
 *  */
    @Test
    public void testAttr_ThrowClassCastException1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class byteArrayType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(byteArrayType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = ((Object) byteArray);
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "#cdata";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        cDataNode.attr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return super.attr(key);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return super.attr(key);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException_11() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return super.attr(key);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException_21() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return super.attr(key);
 *  */
    @Test
    public void testAttr_ThrowIndexOutOfBoundsException_31() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "[";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.attr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.attr(key);
 *  */
    @Test
    public void testAttr_ThrowNullPointerException1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.attr] produces [java.lang.NullPointerException] */
        cDataNode.attr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.baseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method baseUri()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#baseUri()}
 * @utbot.executesCondition {@code (hasParent()): False}
 * @utbot.returnsFrom {@code return hasParent() ? parent().baseUri() : "";}
 *  */
    @Test
    public void testBaseUri_NotHasParent() {
        CDataNode cDataNode = new CDataNode(null);
        
        String actual = cDataNode.baseUri();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#baseUri()}
 * @utbot.executesCondition {@code (hasParent()): True}
 * @utbot.returnsFrom {@code return hasParent() ? parent().baseUri() : "";}
 *  */
    @Test
    public void testBaseUri_HasParent() throws Exception  {
        CDataNode cDataNode = new CDataNode(null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        cDataNode.parentNode = parentNode;
        
        String actual = cDataNode.baseUri();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#baseUri()}
 * @utbot.executesCondition {@code (hasParent()): True}
 * @utbot.returnsFrom {@code return hasParent() ? parent().baseUri() : "";}
 *  */
    @Test
    public void testBaseUri_HasParent_1() {
        CDataNode cDataNode = new CDataNode(null);
        TextNode parentNode = new TextNode(null, null);
        cDataNode.parentNode = parentNode;
        
        String actual = cDataNode.baseUri();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method baseUri()
    
    @Test
    public void testBaseUri1() throws Exception  {
        CDataNode cDataNode = new CDataNode(null);
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        cDataNode.parentNode = parentNode;
        
        String actual = cDataNode.baseUri();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testBaseUri2() throws Exception  {
        CDataNode cDataNode = new CDataNode(null);
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        cDataNode.parentNode = parentNode;
        
        String actual = cDataNode.baseUri();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testBaseUri3() {
        CDataNode cDataNode = new CDataNode(null);
        Comment parentNode = new Comment(null);
        cDataNode.parentNode = parentNode;
        
        String actual = cDataNode.baseUri();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testBaseUri4() throws Exception  {
        CDataNode cDataNode = new CDataNode(null);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        XmlDeclaration parentNode2 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        CDataNode parentNode3 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        XmlDeclaration parentNode4 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        CDataNode parentNode5 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Comment parentNode6 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        parentNode5.setParentNode(parentNode6);
        parentNode4.setParentNode(parentNode5);
        parentNode3.setParentNode(parentNode4);
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        cDataNode.parentNode = parentNode;
        
        String actual = cDataNode.baseUri();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testBaseUri5() throws Exception  {
        CDataNode cDataNode = new CDataNode(null);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        XmlDeclaration parentNode2 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        CDataNode parentNode3 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        XmlDeclaration parentNode4 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        CDataNode parentNode5 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        DocumentType parentNode6 = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        parentNode5.setParentNode(parentNode6);
        parentNode4.setParentNode(parentNode5);
        parentNode3.setParentNode(parentNode4);
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        cDataNode.parentNode = parentNode;
        
        String actual = cDataNode.baseUri();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method baseUri()
    
    @Test(expected = StackOverflowError.class)
    public void testBaseUri6() throws Exception  {
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode1.setParentNode(parentNode1);
        parentNode.setParentNode(parentNode1);
        cDataNode.setParentNode(parentNode);
        
        cDataNode.baseUri();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBaseUri7() throws Exception  {
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        CDataNode parentNode2 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        parentNode2.setParentNode(parentNode1);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        cDataNode.setParentNode(parentNode);
        
        cDataNode.baseUri();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBaseUri8() throws Exception  {
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode2 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        XmlDeclaration parentNode3 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        TextNode parentNode4 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode4.setParentNode(parentNode4);
        parentNode3.setParentNode(parentNode4);
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        cDataNode.setParentNode(parentNode);
        
        cDataNode.baseUri();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBaseUri9() throws Exception  {
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        CDataNode parentNode2 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        TextNode parentNode3 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode4 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        XmlDeclaration parentNode5 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        TextNode parentNode6 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode6.setParentNode(parentNode4);
        parentNode5.setParentNode(parentNode6);
        parentNode4.setParentNode(parentNode5);
        parentNode3.setParentNode(parentNode4);
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        cDataNode.setParentNode(parentNode);
        
        cDataNode.baseUri();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBaseUri10() throws Exception  {
        CDataNode cDataNode = new CDataNode(null);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        XmlDeclaration parentNode2 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode2.setParentNode(parentNode2);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        cDataNode.parentNode = parentNode;
        
        cDataNode.baseUri();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBaseUri11() throws Exception  {
        CDataNode cDataNode = new CDataNode(null);
        CDataNode parentNode = new CDataNode(null);
        CDataNode parentNode1 = new CDataNode(null);
        CDataNode parentNode2 = new CDataNode(null);
        XmlDeclaration parentNode3 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        TextNode parentNode4 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        XmlDeclaration parentNode5 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        TextNode parentNode6 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode6.setParentNode(parentNode4);
        parentNode5.setParentNode(parentNode6);
        parentNode4.setParentNode(parentNode5);
        parentNode3.setParentNode(parentNode4);
        parentNode2.parentNode = parentNode3;
        parentNode1.parentNode = parentNode2;
        parentNode.parentNode = parentNode1;
        cDataNode.parentNode = parentNode;
        
        cDataNode.baseUri();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.attributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attributes()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attributes()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return (Attributes) value;}
 *  */
    @Test
    public void testAttributes_ReturnValue_1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            
            Object initialXmlDeclarationValue = xmlDeclaration.value;
            
            Attributes actual = xmlDeclaration.attributes();
            
            Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            expected.keys = empty;
            expected.vals = empty;
            
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expected, actual));
            
            Object finalXmlDeclarationValue = xmlDeclaration.value;
            
            assertFalse(initialXmlDeclarationValue == finalXmlDeclarationValue);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attributes()}
 * @utbot.returnsFrom {@code return (Attributes) value;}
 *  */
    @Test
    public void testAttributes_ReturnValue() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes value = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(xmlDeclaration, "org.jsoup.nodes.LeafNode", "value", value);
        
        Attributes actual = xmlDeclaration.attributes();
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(value, actual));
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attributes()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return (Attributes) value;}
 *  */
    @Test
    public void testAttributes_ReturnValue_2() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            String string = "";
            CDataNode cDataNode = new CDataNode(string);
            
            Attributes actual = cDataNode.attributes();
            
            Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            setField(expected, "org.jsoup.nodes.Attributes", "size", 1);
            java.lang.String[] keys = new java.lang.String[4];
            String string1 = "#cdata";
            keys[0] = string1;
            expected.keys = keys;
            java.lang.String[] vals = new java.lang.String[4];
            vals[0] = string;
            expected.vals = vals;
            
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attributes()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testAttributes_ThrowClassCastException_3() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            byte[] value = {};
            setField(xmlDeclaration, "org.jsoup.nodes.LeafNode", "value", value);
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.attributes] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
                org.jsoup.nodes.LeafNode.ensureAttributes(LeafNode.java:27)
                org.jsoup.nodes.LeafNode.attributes(LeafNode.java:17) */
            xmlDeclaration.attributes();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testAttributes_ThrowClassCastException_4() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            short[] value = {};
            setField(documentType, "org.jsoup.nodes.LeafNode", "value", value);
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.attributes] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
                org.jsoup.nodes.LeafNode.ensureAttributes(LeafNode.java:27)
                org.jsoup.nodes.LeafNode.attributes(LeafNode.java:17) */
            documentType.attributes();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testAttributes_ThrowClassCastException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            int[] intArray = {};
            Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
            Class intArrayType = Class.forName("java.lang.String");
            Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(intArrayType);
            cDataNodeConstructor.setAccessible(true);
            java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
            cDataNodeConstructorArguments[0] = ((Object) intArray);
            CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.attributes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            cDataNode.attributes();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testAttributes_ThrowClassCastException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            byte[] byteArray = {};
            Class textNodeClazz = Class.forName("org.jsoup.nodes.TextNode");
            Class byteArrayType = Class.forName("java.lang.String");
            Constructor textNodeConstructor = textNodeClazz.getDeclaredConstructor(byteArrayType, byteArrayType);
            textNodeConstructor.setAccessible(true);
            java.lang.Object[] textNodeConstructorArguments = new java.lang.Object[2];
            textNodeConstructorArguments[0] = ((Object) byteArray);
            textNodeConstructorArguments[1] = ((Object) null);
            TextNode textNode = ((TextNode) textNodeConstructor.newInstance(textNodeConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.attributes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            textNode.attributes();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#attributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testAttributes_ThrowClassCastException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            short[] shortArray = {};
            Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
            Class shortArrayType = Class.forName("java.lang.String");
            Constructor commentConstructor = commentClazz.getDeclaredConstructor(shortArrayType, shortArrayType);
            commentConstructor.setAccessible(true);
            java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
            commentConstructorArguments[0] = ((Object) shortArray);
            commentConstructorArguments[1] = ((Object) null);
            Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.attributes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            comment.attributes();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.hasAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAttributes()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttributes()}
 * @utbot.returnsFrom {@code return value instanceof Attributes;}
 *  */
    @Test
    public void testHasAttributes_ReturnValueInstanceOfAttributes() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        boolean actual = xmlDeclaration.hasAttributes();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.doSetBaseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doSetBaseUri(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#doSetBaseUri(java.lang.String)}
 *  */
    @Test
    public void testDoSetBaseUri() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        xmlDeclaration.doSetBaseUri(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.childNodeSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childNodeSize()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#childNodeSize()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testChildNodeSize_ReturnZero() {
        CDataNode cDataNode = new CDataNode(null);
        
        int actual = cDataNode.childNodeSize();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.removeAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.removeAttr(key);}
 *  */
    @Test
    public void testRemoveAttr_ReturnSuperRemoveAttr_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = " ";
        
        CDataNode actual = ((CDataNode) cDataNode.removeAttr(string));
        
        Object cDataNodeValue = cDataNode.value;
        Object actualValue = actual.value;
        int cDataNodeValueSize = ((Integer) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "size"));
        int actualValueSize = ((Integer) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "size"));
        assertEquals(cDataNodeValueSize, actualValueSize);
        
        java.lang.String[] cDataNodeValueKeys = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "keys"));
        java.lang.String[] actualValueKeys = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "keys"));
        int cDataNodeValueKeysSize = cDataNodeValueKeys.length;
        assertEquals(cDataNodeValueKeysSize, actualValueKeys.length);
        assertTrue(deepEquals(cDataNodeValueKeys, actualValueKeys));
        
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.removeAttr(key);}
 *  */
    @Test
    public void testRemoveAttr_ReturnSuperRemoveAttr_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        CDataNode actual = ((CDataNode) cDataNode.removeAttr(string));
        
        Object cDataNodeValue = cDataNode.value;
        Object actualValue = actual.value;
        int cDataNodeValueSize = ((Integer) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "size"));
        int actualValueSize = ((Integer) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "size"));
        assertEquals(cDataNodeValueSize, actualValueSize);
        
        java.lang.String[] cDataNodeValueKeys = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "keys"));
        java.lang.String[] actualValueKeys = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "keys"));
        int cDataNodeValueKeysSize = cDataNodeValueKeys.length;
        assertEquals(cDataNodeValueKeysSize, actualValueKeys.length);
        assertTrue(deepEquals(cDataNodeValueKeys, actualValueKeys));
        
        java.lang.String[] cDataNodeValueVals = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "vals"));
        java.lang.String[] actualValueVals = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "vals"));
        int cDataNodeValueValsSize = cDataNodeValueVals.length;
        assertEquals(cDataNodeValueValsSize, actualValueVals.length);
        assertTrue(deepEquals(cDataNodeValueVals, actualValueVals));
        
        Object object = cDataNode.value;
        int finalCDataNodeValueSize = ((Integer) getFieldValue(object, "org.jsoup.nodes.Attributes", "size"));
        
        assertEquals(0, finalCDataNodeValueSize);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return super.removeAttr(key);}
 *  */
    @Test
    public void testRemoveAttr_ReturnSuperRemoveAttr() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            String string = "";
            
            Object initialCDataNodeValue = cDataNode.value;
            
            CDataNode actual = ((CDataNode) cDataNode.removeAttr(string));
            
            Object cDataNodeValue = cDataNode.value;
            Object actualValue = actual.value;
            int cDataNodeValueSize = ((Integer) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "size"));
            int actualValueSize = ((Integer) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "size"));
            assertEquals(cDataNodeValueSize, actualValueSize);
            
            java.lang.String[] cDataNodeValueKeys = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "keys"));
            java.lang.String[] actualValueKeys = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "keys"));
            int cDataNodeValueKeysSize = cDataNodeValueKeys.length;
            assertEquals(cDataNodeValueKeysSize, actualValueKeys.length);
            assertTrue(deepEquals(cDataNodeValueKeys, actualValueKeys));
            
            java.lang.String[] cDataNodeValueVals = ((java.lang.String[]) getFieldValue(cDataNodeValue, "org.jsoup.nodes.Attributes", "vals"));
            java.lang.String[] actualValueVals = ((java.lang.String[]) getFieldValue(actualValue, "org.jsoup.nodes.Attributes", "vals"));
            int cDataNodeValueValsSize = cDataNodeValueVals.length;
            assertEquals(cDataNodeValueValsSize, actualValueVals.length);
            assertTrue(deepEquals(cDataNodeValueVals, actualValueVals));
            
            Node actualParentNode = actual.parentNode;
            assertNull(actualParentNode);
            
            int cDataNodeSiblingIndex = cDataNode.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(cDataNodeSiblingIndex, actualSiblingIndex);
            
            Object finalCDataNodeValue = cDataNode.value;
            
            assertFalse(initialCDataNodeValue == finalCDataNodeValue);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testRemoveAttr_ThrowClassCastException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            byte[] byteArray = {};
            Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
            Class byteArrayType = Class.forName("java.lang.String");
            Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(byteArrayType);
            cDataNodeConstructor.setAccessible(true);
            java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
            cDataNodeConstructorArguments[0] = ((Object) byteArray);
            CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.removeAttr] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            cDataNode.removeAttr(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return super.removeAttr(key);
 *  */
    @Test
    public void testRemoveAttr_ThrowIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.removeAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.removeAttr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return super.removeAttr(key);
 *  */
    @Test
    public void testRemoveAttr_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "[";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.removeAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.removeAttr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.removeAttr(key);
 *  */
    @Test
    public void testRemoveAttr_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.removeAttr] produces [java.lang.NullPointerException] */
        cDataNode.removeAttr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.removeAttr(key);
 *  */
    @Test
    public void testRemoveAttr_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.removeAttr] produces [java.lang.NullPointerException] */
        cDataNode.removeAttr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.removeAttr(key);
 *  */
    @Test
    public void testRemoveAttr_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "[";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.removeAttr] produces [java.lang.NullPointerException] */
        cDataNode.removeAttr(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.removeAttr(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_ThrowIllegalArgumentException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Attributes attributes = new Attributes();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.removeAttr(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return super.removeAttr(key);
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAttr_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "[";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.removeAttr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.removeAttr(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            
            cDataNode.removeAttr(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.removeAttr(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_ThrowIllegalArgumentException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            String string = "";
            CDataNode cDataNode = new CDataNode(string);
            
            cDataNode.removeAttr(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.removeAttr(key);
 *  */
    @Test(expected = NullPointerException.class)
    public void testRemoveAttr_ThrowNullPointerException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.removeAttr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.ensureChildNodes
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensureChildNodes()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureChildNodes()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Leaf Nodes do not have child nodes.");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testEnsureChildNodes_ThrowUnsupportedOperationException() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        xmlDeclaration.ensureChildNodes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.ensureAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureAttributes()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureAttributes()}
 *  */
    @Test
    public void testEnsureAttributes() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Attributes attributes = new Attributes();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        Method ensureAttributesMethod = leafNodeClazz.getDeclaredMethod("ensureAttributes");
        ensureAttributesMethod.setAccessible(true);
        java.lang.Object[] ensureAttributesMethodArguments = new java.lang.Object[0];
        ensureAttributesMethod.invoke(cDataNode, ensureAttributesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureAttributes()}
 * @utbot.executesCondition {@code (coreValue != null): False}
 *  */
    @Test
    public void testEnsureAttributes_CoreValueEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            
            Object initialCDataNodeValue = cDataNode.value;
            
            Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
            Method ensureAttributesMethod = leafNodeClazz.getDeclaredMethod("ensureAttributes");
            ensureAttributesMethod.setAccessible(true);
            java.lang.Object[] ensureAttributesMethodArguments = new java.lang.Object[0];
            ensureAttributesMethod.invoke(cDataNode, ensureAttributesMethodArguments);
            
            Object finalCDataNodeValue = cDataNode.value;
            
            assertFalse(initialCDataNodeValue == finalCDataNodeValue);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureAttributes()}
 * @utbot.executesCondition {@code (coreValue != null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testEnsureAttributes_CoreValueNotEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            String string = "";
            CDataNode cDataNode = new CDataNode(string);
            
            Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
            Method ensureAttributesMethod = leafNodeClazz.getDeclaredMethod("ensureAttributes");
            ensureAttributesMethod.setAccessible(true);
            java.lang.Object[] ensureAttributesMethodArguments = new java.lang.Object[0];
            ensureAttributesMethod.invoke(cDataNode, ensureAttributesMethodArguments);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureAttributes()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureAttributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: attributes.put(nodeName(), (String) coreValue);
 *  */
    @Test
    public void testEnsureAttributes_ThrowClassCastException_3() throws Throwable  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            byte[] value = {};
            setField(xmlDeclaration, "org.jsoup.nodes.LeafNode", "value", value);
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.ensureAttributes] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
                org.jsoup.nodes.LeafNode.ensureAttributes(LeafNode.java:27) */
            Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
            Method ensureAttributesMethod = leafNodeClazz.getDeclaredMethod("ensureAttributes");
            ensureAttributesMethod.setAccessible(true);
            java.lang.Object[] ensureAttributesMethodArguments = new java.lang.Object[0];
            try {
                ensureAttributesMethod.invoke(xmlDeclaration, ensureAttributesMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureAttributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: attributes.put(nodeName(), (String) coreValue);
 *  */
    @Test
    public void testEnsureAttributes_ThrowClassCastException_4() throws Throwable  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            short[] value = {};
            setField(documentType, "org.jsoup.nodes.LeafNode", "value", value);
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.ensureAttributes] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.String ([S and java.lang.String are in module java.base of loader 'bootstrap')]
                org.jsoup.nodes.LeafNode.ensureAttributes(LeafNode.java:27) */
            Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
            Method ensureAttributesMethod = leafNodeClazz.getDeclaredMethod("ensureAttributes");
            ensureAttributesMethod.setAccessible(true);
            java.lang.Object[] ensureAttributesMethodArguments = new java.lang.Object[0];
            try {
                ensureAttributesMethod.invoke(documentType, ensureAttributesMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureAttributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: attributes.put(nodeName(), (String) coreValue);
 *  */
    @Test
    public void testEnsureAttributes_ThrowClassCastException() throws Throwable  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            byte[] byteArray = {};
            Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
            Class byteArrayType = Class.forName("java.lang.String");
            Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(byteArrayType);
            cDataNodeConstructor.setAccessible(true);
            java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
            cDataNodeConstructorArguments[0] = ((Object) byteArray);
            CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.ensureAttributes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
            Method ensureAttributesMethod = leafNodeClazz.getDeclaredMethod("ensureAttributes");
            ensureAttributesMethod.setAccessible(true);
            java.lang.Object[] ensureAttributesMethodArguments = new java.lang.Object[0];
            try {
                ensureAttributesMethod.invoke(cDataNode, ensureAttributesMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureAttributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: attributes.put(nodeName(), (String) coreValue);
 *  */
    @Test
    public void testEnsureAttributes_ThrowClassCastException_1() throws Throwable  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            byte[] byteArray = {};
            Class textNodeClazz = Class.forName("org.jsoup.nodes.TextNode");
            Class byteArrayType = Class.forName("java.lang.String");
            Constructor textNodeConstructor = textNodeClazz.getDeclaredConstructor(byteArrayType, byteArrayType);
            textNodeConstructor.setAccessible(true);
            java.lang.Object[] textNodeConstructorArguments = new java.lang.Object[2];
            textNodeConstructorArguments[0] = ((Object) byteArray);
            textNodeConstructorArguments[1] = ((Object) null);
            TextNode textNode = ((TextNode) textNodeConstructor.newInstance(textNodeConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.ensureAttributes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
            Method ensureAttributesMethod = leafNodeClazz.getDeclaredMethod("ensureAttributes");
            ensureAttributesMethod.setAccessible(true);
            java.lang.Object[] ensureAttributesMethodArguments = new java.lang.Object[0];
            try {
                ensureAttributesMethod.invoke(textNode, ensureAttributesMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#ensureAttributes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: attributes.put(nodeName(), (String) coreValue);
 *  */
    @Test
    public void testEnsureAttributes_ThrowClassCastException_2() throws Throwable  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            short[] shortArray = {};
            Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
            Class shortArrayType = Class.forName("java.lang.String");
            Constructor commentConstructor = commentClazz.getDeclaredConstructor(shortArrayType, shortArrayType);
            commentConstructor.setAccessible(true);
            java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
            commentConstructorArguments[0] = ((Object) shortArray);
            commentConstructorArguments[1] = ((Object) null);
            Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.ensureAttributes] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
            Method ensureAttributesMethod = leafNodeClazz.getDeclaredMethod("ensureAttributes");
            ensureAttributesMethod.setAccessible(true);
            java.lang.Object[] ensureAttributesMethodArguments = new java.lang.Object[0];
            try {
                ensureAttributesMethod.invoke(comment, ensureAttributesMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.hasAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.hasAttr(key);}
 *  */
    @Test
    public void testHasAttr_ReturnSuperHasAttr() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        boolean actual = cDataNode.hasAttr(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.hasAttr(key);}
 *  */
    @Test
    public void testHasAttr_ReturnSuperHasAttr_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        boolean actual = cDataNode.hasAttr(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.hasAttr(key);}
 *  */
    @Test
    public void testHasAttr_ReturnSuperHasAttr_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string1 = "   ";
        
        boolean actual = cDataNode.hasAttr(string1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.hasAttr(key);}
 *  */
    @Test
    public void testHasAttr_ReturnSuperHasAttr_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        boolean actual = cDataNode.hasAttr(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return super.hasAttr(key);}
 *  */
    @Test
    public void testHasAttr_ReturnSuperHasAttr_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "@";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        boolean actual = cDataNode.hasAttr(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return super.hasAttr(key);}
 *  */
    @Test
    public void testHasAttr_ReturnSuperHasAttr_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            String string = "\u0000\u0000\u0000\u0000";
            
            Object initialCDataNodeValue = cDataNode.value;
            
            boolean actual = cDataNode.hasAttr(string);
            
            assertFalse(actual);
            
            Object finalCDataNodeValue = cDataNode.value;
            
            assertFalse(initialCDataNodeValue == finalCDataNodeValue);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#attributes()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return super.hasAttr(key);}
 *  */
    @Test
    public void testHasAttr_ReturnSuperHasAttr_6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            String string = "abs:";
            
            Object initialCDataNodeValue = cDataNode.value;
            
            boolean actual = cDataNode.hasAttr(string);
            
            assertFalse(actual);
            
            Object finalCDataNodeValue = cDataNode.value;
            
            assertFalse(initialCDataNodeValue == finalCDataNodeValue);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testHasAttr_ThrowClassCastException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            byte[] byteArray = {};
            Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
            Class byteArrayType = Class.forName("java.lang.String");
            Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(byteArrayType);
            cDataNodeConstructor.setAccessible(true);
            java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
            cDataNodeConstructorArguments[0] = ((Object) byteArray);
            CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.hasAttr] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            cDataNode.hasAttr(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHasAttr_ThrowIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.hasAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.hasAttr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testHasAttr_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "abs:";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.hasAttr] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.hasAttr(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHasAttr_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.hasAttr] produces [java.lang.NullPointerException] */
        cDataNode.hasAttr(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.hasAttr(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_ThrowIllegalArgumentException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Attributes attributes = new Attributes();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.hasAttr(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.hasAttr(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_ThrowIllegalArgumentException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            
            cDataNode.hasAttr(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#hasAttr(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.hasAttr(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_ThrowIllegalArgumentException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            String string = "";
            CDataNode cDataNode = new CDataNode(string);
            
            cDataNode.hasAttr(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.coreValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method coreValue()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.returnsFrom {@code return attr(nodeName());}
 *  */
    @Test
    public void testCoreValue_ReturnAttr_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        String actual = cDataNode.coreValue();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.returnsFrom {@code return attr(nodeName());}
 *  */
    @Test
    public void testCoreValue_ReturnAttr() {
        TextNode textNode = new TextNode(null, null);
        
        String actual = textNode.coreValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method coreValue()
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return attr(nodeName());
 *  */
    @Test
    public void testCoreValue_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class byteArrayType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(byteArrayType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = ((Object) byteArray);
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        cDataNode.coreValue();
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.coreValue();
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.coreValue();
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "K\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.coreValue();
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return attr(nodeName());
 *  */
    @Test
    public void testCoreValue_ThrowClassCastException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        Class textNodeClazz = Class.forName("org.jsoup.nodes.TextNode");
        Class byteArrayType = Class.forName("java.lang.String");
        Constructor textNodeConstructor = textNodeClazz.getDeclaredConstructor(byteArrayType, byteArrayType);
        textNodeConstructor.setAccessible(true);
        java.lang.Object[] textNodeConstructorArguments = new java.lang.Object[2];
        textNodeConstructorArguments[0] = ((Object) byteArray);
        textNodeConstructorArguments[1] = ((Object) null);
        TextNode textNode = ((TextNode) textNodeConstructor.newInstance(textNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        textNode.coreValue();
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class textNodeClazz = Class.forName("org.jsoup.nodes.TextNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor textNodeConstructor = textNodeClazz.getDeclaredConstructor(attributesType, attributesType);
        textNodeConstructor.setAccessible(true);
        java.lang.Object[] textNodeConstructorArguments = new java.lang.Object[2];
        textNodeConstructorArguments[0] = attributes;
        textNodeConstructorArguments[1] = ((Object) null);
        TextNode textNode = ((TextNode) textNodeConstructor.newInstance(textNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        textNode.coreValue();
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCoreValue_ThrowNullPointerException_1() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes value = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(value, "org.jsoup.nodes.Attributes", "size", 1);
        setField(xmlDeclaration, "org.jsoup.nodes.LeafNode", "value", value);
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:81)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:109)
            org.jsoup.nodes.Node.attr(Node.java:64)
            org.jsoup.nodes.LeafNode.attr(LeafNode.java:45)
            org.jsoup.nodes.XmlDeclaration.attr(XmlDeclaration.java:11)
            org.jsoup.nodes.LeafNode.coreValue(LeafNode.java:32) */
        xmlDeclaration.coreValue();
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCoreValue_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.NullPointerException] */
        cDataNode.coreValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method coreValue()
    
    @Test
    public void testCoreValue1() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        String actual = documentType.coreValue();
        
        assertNull(actual);
    }
    
    @Test
    public void testCoreValue2() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        String actual = xmlDeclaration.coreValue();
        
        assertNull(actual);
    }
    
    @Test
    public void testCoreValue3() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes value = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(value, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "";
        keys[1] = string;
        value.keys = keys;
        setField(xmlDeclaration, "org.jsoup.nodes.LeafNode", "value", value);
        
        String actual = xmlDeclaration.coreValue();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        Object object = xmlDeclaration.value;
        java.lang.String[] objectValueKeys = ((java.lang.String[]) getFieldValue(object, "org.jsoup.nodes.Attributes", "keys"));
        String finalXmlDeclarationValueKeys0 = ((String) get(objectValueKeys, 0));
        
        assertNull(finalXmlDeclarationValueKeys0);
    }
    
    @Test
    public void testCoreValue4() {
        Comment comment = new Comment(null);
        
        String actual = comment.coreValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method coreValue()
    
    @Test
    public void testCoreValue5() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes value = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(value, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        value.keys = keys;
        setField(xmlDeclaration, "org.jsoup.nodes.LeafNode", "value", value);
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:81)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:109)
            org.jsoup.nodes.Node.attr(Node.java:64)
            org.jsoup.nodes.LeafNode.attr(LeafNode.java:45)
            org.jsoup.nodes.XmlDeclaration.attr(XmlDeclaration.java:11)
            org.jsoup.nodes.LeafNode.coreValue(LeafNode.java:32) */
        xmlDeclaration.coreValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.coreValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method coreValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 *  */
    @Test
    public void testCoreValue() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class objectType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(objectType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = object;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.coreValue(null);
        
        Object finalCDataNodeValue = cDataNode.value;
        
        assertNull(finalCDataNodeValue);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 *  */
    @Test
    public void testCoreValue_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.coreValue(null);
        
        Object object = cDataNode.value;
        int finalCDataNodeValueSize = ((Integer) getFieldValue(object, "org.jsoup.nodes.Attributes", "size"));
        
        assertEquals(1, finalCDataNodeValueSize);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 *  */
    @Test
    public void testCoreValue_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "[\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null, null};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.coreValue(null);
        
        Object object = cDataNode.value;
        int finalCDataNodeValueSize = ((Integer) getFieldValue(object, "org.jsoup.nodes.Attributes", "size"));
        
        assertEquals(2, finalCDataNodeValueSize);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 *  */
    @Test
    public void testCoreValue_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        Object object = cDataNode.value;
        java.lang.String[] initialCDataNodeValueKeys = ((java.lang.String[]) getFieldValue(object, "org.jsoup.nodes.Attributes", "keys"));
        Object object1 = cDataNode.value;
        java.lang.String[] initialCDataNodeValueVals = ((java.lang.String[]) getFieldValue(object1, "org.jsoup.nodes.Attributes", "vals"));
        
        cDataNode.coreValue(null);
        
        Object object2 = cDataNode.value;
        int finalCDataNodeValueSize = ((Integer) getFieldValue(object2, "org.jsoup.nodes.Attributes", "size"));
        Object object3 = cDataNode.value;
        java.lang.String[] finalCDataNodeValueKeys = ((java.lang.String[]) getFieldValue(object3, "org.jsoup.nodes.Attributes", "keys"));
        Object object4 = cDataNode.value;
        java.lang.String[] finalCDataNodeValueVals = ((java.lang.String[]) getFieldValue(object4, "org.jsoup.nodes.Attributes", "vals"));
        
        assertFalse(initialCDataNodeValueKeys == finalCDataNodeValueKeys);
        
        assertFalse(initialCDataNodeValueVals == finalCDataNodeValueVals);
        
        assertEquals(1, finalCDataNodeValueSize);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 *  */
    @Test
    public void testCoreValue_4() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        Class textNodeClazz = Class.forName("org.jsoup.nodes.TextNode");
        Class objectType = Class.forName("java.lang.String");
        Constructor textNodeConstructor = textNodeClazz.getDeclaredConstructor(objectType, objectType);
        textNodeConstructor.setAccessible(true);
        java.lang.Object[] textNodeConstructorArguments = new java.lang.Object[2];
        textNodeConstructorArguments[0] = object;
        textNodeConstructorArguments[1] = ((Object) null);
        TextNode textNode = ((TextNode) textNodeConstructor.newInstance(textNodeConstructorArguments));
        
        textNode.coreValue(null);
        
        Object finalTextNodeValue = textNode.value;
        
        assertNull(finalTextNodeValue);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method coreValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException_11() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException_21() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException_31() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        cDataNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testCoreValue_ThrowIndexOutOfBoundsException_5() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class textNodeClazz = Class.forName("org.jsoup.nodes.TextNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor textNodeConstructor = textNodeClazz.getDeclaredConstructor(attributesType, attributesType);
        textNodeConstructor.setAccessible(true);
        java.lang.Object[] textNodeConstructorArguments = new java.lang.Object[2];
        textNodeConstructorArguments[0] = attributes;
        textNodeConstructorArguments[1] = ((Object) null);
        TextNode textNode = ((TextNode) textNodeConstructor.newInstance(textNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        textNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCoreValue_ThrowNullPointerException1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.NullPointerException] */
        cDataNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCoreValue_ThrowNullPointerException_11() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.NullPointerException] */
        cDataNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCoreValue_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.NullPointerException] */
        cDataNode.coreValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#coreValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCoreValue_ThrowNullPointerException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.coreValue] produces [java.lang.NullPointerException] */
        cDataNode.coreValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.LeafNode.absUrl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method absUrl(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.returnsFrom {@code return super.absUrl(key);}
 *  */
    @Test
    public void testAbsUrl_ReturnSuperAbsUrl_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "    ";
        
        String actual = cDataNode.absUrl(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.returnsFrom {@code return super.absUrl(key);}
 *  */
    @Test
    public void testAbsUrl_ReturnSuperAbsUrl_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string1 = "  ";
        
        String actual = cDataNode.absUrl(string1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.returnsFrom {@code return super.absUrl(key);}
 *  */
    @Test
    public void testAbsUrl_ReturnSuperAbsUrl_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "K";
        keys[0] = string;
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string1 = "[";
        
        String actual = cDataNode.absUrl(string1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return super.absUrl(key);}
 *  */
    @Test
    public void testAbsUrl_ReturnSuperAbsUrl() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            String string = "\u0000";
            
            Object initialCDataNodeValue = cDataNode.value;
            
            String actual = cDataNode.absUrl(string);
            
            String expected = "";
            
            assertEquals(expected, actual);
            
            Object finalCDataNodeValue = cDataNode.value;
            
            assertFalse(initialCDataNodeValue == finalCDataNodeValue);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method absUrl(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.absUrl(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_ThrowIllegalArgumentException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Attributes attributes = new Attributes();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        cDataNode.absUrl(null);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.absUrl(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_ThrowIllegalArgumentException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Attributes attributes = new Attributes();
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = "";
        
        cDataNode.absUrl(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.absUrl(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_ThrowIllegalArgumentException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            
            cDataNode.absUrl(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.absUrl(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_ThrowIllegalArgumentException_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            String string = "";
            CDataNode cDataNode = new CDataNode(string);
            
            cDataNode.absUrl(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method absUrl(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link org.jsoup.nodes.LeafNode#nodeName()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ensureAttributes();
 *  */
    @Test
    public void testAbsUrl_ThrowClassCastException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            byte[] byteArray = {};
            Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
            Class byteArrayType = Class.forName("java.lang.String");
            Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(byteArrayType);
            cDataNodeConstructor.setAccessible(true);
            java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
            cDataNodeConstructorArguments[0] = ((Object) byteArray);
            CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
            
            /* This test fails because method [org.jsoup.nodes.LeafNode.absUrl] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
            cDataNode.absUrl(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAbsUrl_ThrowIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.absUrl] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.absUrl(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAbsUrl_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.absUrl] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        cDataNode.absUrl(string);
    }
    
    /**
    @utbot.classUnderTest {@link LeafNode}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.LeafNode#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAbsUrl_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.absUrl] produces [java.lang.NullPointerException] */
        cDataNode.absUrl(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method absUrl(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            CDataNode cDataNode = new CDataNode(null);
            String string = "";
            
            cDataNode.absUrl(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            CDataNode cDataNode = new CDataNode(string);
            String string1 = "";
            
            cDataNode.absUrl(string1);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method absUrl(java.lang.String)
    
    @Test
    public void testAbsUrl3() throws Exception  {
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Attributes value = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(value, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "A";
        keys[0] = string;
        value.keys = keys;
        setField(cDataNode, "org.jsoup.nodes.LeafNode", "value", value);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Comment parentNode1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        parentNode.setParentNode(parentNode1);
        cDataNode.setParentNode(parentNode);
        String string1 = "A";
        
        /* This test fails because method [org.jsoup.nodes.LeafNode.absUrl] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Node.attr(Node.java:64)
            org.jsoup.nodes.LeafNode.attr(LeafNode.java:45)
            org.jsoup.nodes.TextNode.attr(TextNode.java:12)
            org.jsoup.nodes.Node.absUrl(Node.java:188)
            org.jsoup.nodes.LeafNode.absUrl(LeafNode.java:74) */
        cDataNode.absUrl(string1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1006989062930200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1006989062930200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1006989062934800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006989062930200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006989062934800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1006989063356600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1006989063356600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1006989063358200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006989063356600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006989063358200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1006989066802500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1006989066802500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1006989066804300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006989066802500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006989066804300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1006989067187100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1006989067187100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1006989067188500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006989067187100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006989067188500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

