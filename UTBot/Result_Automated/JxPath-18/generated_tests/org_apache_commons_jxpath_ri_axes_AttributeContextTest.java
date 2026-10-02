package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import java.beans.PropertyDescriptor;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator;
import org.apache.commons.jxpath.BasicNodeSet;
import java.util.ArrayList;
import org.apache.commons.jxpath.servlet.ServletContextHandler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.servlet.HttpSessionHandler;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.BasicVariables;
import java.util.HashMap;
import org.apache.commons.jxpath.ri.model.NodePointer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_jxpath_ri_axes_AttributeContextTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.axes.AttributeContext.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#reset()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.EvalContext#reset()}
 *  */
    @Test
    public void testReset_EvalContextReset() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        attributeContext.reset();
        
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(0, finalAttributeContextPosition);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextNode()
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#nextNode()}
 * @utbot.executesCondition {@code (!setStarted): True}
 * @utbot.executesCondition {@code (!(nodeTest instanceof NodeNameTest)): True}
 *  */
    @Test
    public void testNextNode_NotNodeTestInstanceOfNodeNameTest() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        boolean finalAttributeContextSetStarted = ((Boolean) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertTrue(finalAttributeContextSetStarted);
        
        assertEquals(-254, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#nextNode()}
 * @utbot.executesCondition {@code (!setStarted): False}
 * @utbot.executesCondition {@code (iterator == null): True}
 *  */
    @Test
    public void testNextNode_IteratorEqualsNull() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(-254, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#nextNode()}
 * @utbot.executesCondition {@code (!setStarted): False}
 * @utbot.executesCondition {@code (iterator == null): False}
 *  */
    @Test
    public void testNextNode_IteratorNotEqualsNull() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(-2147483647, finalAttributeContextIteratorPosition);
        
        assertEquals(Integer.MIN_VALUE, finalAttributeContextIteratorPosition1);
        
        assertEquals(-254, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#nextNode()}
 * @utbot.executesCondition {@code (!setStarted): False}
 * @utbot.executesCondition {@code (iterator == null): False}
 *  */
    @Test
    public void testNextNode_IteratorNotEqualsNull_1() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(-2147483647, finalAttributeContextIteratorPosition);
        
        assertEquals(Integer.MIN_VALUE, finalAttributeContextIteratorPosition1);
        
        assertEquals(-254, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#nextNode()}
 * @utbot.executesCondition {@code (!setStarted): False}
 * @utbot.executesCondition {@code (iterator == null): False}
 *  */
    @Test
    public void testNextNode_IteratorNotEqualsNull_2() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "empty", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(2, finalAttributeContextIteratorPosition);
        
        assertEquals(1, finalAttributeContextIteratorPosition1);
        
        assertEquals(-254, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#nextNode()}
 * @utbot.executesCondition {@code (!setStarted): False}
 * @utbot.executesCondition {@code (iterator == null): False}
 *  */
    @Test
    public void testNextNode_IteratorNotEqualsNull_3() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalAttributeContextIteratorPosition);
        
        assertEquals(1, finalAttributeContextIteratorPosition1);
        
        assertEquals(-254, finalAttributeContextPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextNode()
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#nextNode()}
 * @utbot.executesCondition {@code (!setStarted): True}
 * @utbot.executesCondition {@code (!(nodeTest instanceof NodeNameTest)): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.NodeNameTest#getNodeName()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.EvalContext#getCurrentNodePointer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parentContext.getCurrentNodePointer().attributeIterator(name)
 *  */
    @Test
    public void testNextNode_ThrowNullPointerException() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80) */
        attributeContext.nextNode();
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#nextNode()}
 * @utbot.executesCondition {@code (!setStarted): False}
 * @utbot.executesCondition {@code (iterator == null): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodeIterator#getPosition()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodeIterator#setPosition(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !iterator.setPosition(iterator.getPosition() + 1)
 *  */
    @Test
    public void testNextNode_ThrowNullPointerException_1() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(PropertyIterator.java:210)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextNode()
    
    @Test
    public void testNextNode1() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "empty", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode2() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", Integer.MAX_VALUE);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(Integer.MIN_VALUE, finalAttributeContextIteratorPosition);
        
        assertEquals(Integer.MIN_VALUE, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode3() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertTrue(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1, finalAttributeContextIteratorPosition);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode4() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode5() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode6() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode7() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode8() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode9() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode10() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode11() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", -1);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode12() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode13() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode14() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", -1);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode15() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        NodeIterator attributeContextIterator2 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator2IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator2, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator2IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator2IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames0 = ((String) get(attributeContextIterator2IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 0));
        NodeIterator attributeContextIterator3 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator3IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator3, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator3IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator3IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames1 = ((String) get(attributeContextIterator3IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 1));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames0);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode16() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", -1);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode17() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2080374751);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        BeanPropertyPointer propertyNodePointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {null, null, null, null, null, null, null, null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors", propertyDescriptors);
        propertyNodePointer.setPropertyIndex(-2147483647);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        NodeIterator attributeContextIterator2 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator2IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator2, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator2IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator2IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors0 = ((PropertyDescriptor) get(attributeContextIterator2IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 0));
        NodeIterator attributeContextIterator3 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator3IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator3, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator3IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator3IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors1 = ((PropertyDescriptor) get(attributeContextIterator3IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 1));
        NodeIterator attributeContextIterator4 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator4IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator4, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator4IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator4IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors2 = ((PropertyDescriptor) get(attributeContextIterator4IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 2));
        NodeIterator attributeContextIterator5 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator5IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator5, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator5IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator5IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors3 = ((PropertyDescriptor) get(attributeContextIterator5IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 3));
        NodeIterator attributeContextIterator6 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator6IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator6, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator6IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator6IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors4 = ((PropertyDescriptor) get(attributeContextIterator6IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 4));
        NodeIterator attributeContextIterator7 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator7IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator7, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator7IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator7IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors5 = ((PropertyDescriptor) get(attributeContextIterator7IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 5));
        NodeIterator attributeContextIterator8 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator8IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator8, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator8IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator8IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors6 = ((PropertyDescriptor) get(attributeContextIterator8IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 6));
        NodeIterator attributeContextIterator9 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator9IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator9, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator9IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator9IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors7 = ((PropertyDescriptor) get(attributeContextIterator9IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 7));
        NodeIterator attributeContextIterator10 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator10IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator10, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator10IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator10IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors8 = ((PropertyDescriptor) get(attributeContextIterator10IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 8));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(2080374752, finalAttributeContextIteratorPosition);
        
        assertEquals(2080374752, finalAttributeContextIteratorPosition1);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors0);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors1);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors2);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors3);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors4);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors5);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors6);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors7);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors8);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode18() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2080374751);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        BeanPropertyPointer propertyNodePointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {null, null, null, null, null, null, null, null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors", propertyDescriptors);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        NodeIterator attributeContextIterator2 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator2IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator2, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator2IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator2IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors0 = ((PropertyDescriptor) get(attributeContextIterator2IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 0));
        NodeIterator attributeContextIterator3 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator3IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator3, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator3IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator3IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors1 = ((PropertyDescriptor) get(attributeContextIterator3IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 1));
        NodeIterator attributeContextIterator4 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator4IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator4, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator4IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator4IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors2 = ((PropertyDescriptor) get(attributeContextIterator4IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 2));
        NodeIterator attributeContextIterator5 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator5IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator5, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator5IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator5IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors3 = ((PropertyDescriptor) get(attributeContextIterator5IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 3));
        NodeIterator attributeContextIterator6 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator6IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator6, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator6IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator6IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors4 = ((PropertyDescriptor) get(attributeContextIterator6IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 4));
        NodeIterator attributeContextIterator7 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator7IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator7, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator7IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator7IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors5 = ((PropertyDescriptor) get(attributeContextIterator7IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 5));
        NodeIterator attributeContextIterator8 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator8IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator8, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator8IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator8IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors6 = ((PropertyDescriptor) get(attributeContextIterator8IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 6));
        NodeIterator attributeContextIterator9 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator9IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator9, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator9IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator9IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors7 = ((PropertyDescriptor) get(attributeContextIterator9IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 7));
        NodeIterator attributeContextIterator10 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator10IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator10, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.beans.PropertyDescriptor[] attributeContextIterator10IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors = ((java.beans.PropertyDescriptor[]) getFieldValue(attributeContextIterator10IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "propertyDescriptors"));
        PropertyDescriptor finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors8 = ((PropertyDescriptor) get(attributeContextIterator10IteratorPropertyNodePointerIteratorPropertyNodePointerPropertyDescriptors, 8));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(2080374752, finalAttributeContextIteratorPosition);
        
        assertEquals(2080374752, finalAttributeContextIteratorPosition1);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors0);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors1);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors2);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors3);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors4);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors5);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors6);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors7);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerPropertyDescriptors8);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode19() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        BeanPropertyPointer propertyNodePointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode20() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        BeanPropertyPointer propertyNodePointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        java.beans.PropertyDescriptor[] propertyDescriptors = {};
        setField(beanInfo, "org.apache.commons.jxpath.JXPathBasicBeanInfo", "propertyDescriptors", propertyDescriptors);
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    
    @Test
    public void testNextNode21() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        BeanPropertyPointer propertyNodePointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        JXPathBasicBeanInfo beanInfo = ((JXPathBasicBeanInfo) createInstance("org.apache.commons.jxpath.JXPathBasicBeanInfo"));
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", "beanInfo", beanInfo);
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        boolean actual = attributeContext.nextNode();
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextNode()
    
    @Test
    public void testNextNode22() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer cannot be cast to class org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer (org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer and org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:38)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode23() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        BeanPropertyPointer propertyNodePointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer cannot be cast to class org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer (org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer and org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:38)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode24() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:61)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode25() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            java.base/java.util.Collections$UnmodifiableList.get(Collections.java:1347)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:59)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode26() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        ServletContextHandler handler = ((ServletContextHandler) createInstance("org.apache.commons.jxpath.servlet.ServletContextHandler"));
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        short[] bean = {};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -255);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.ClassCastException: class [S cannot be cast to class javax.servlet.ServletContext ([S is in module java.base of loader 'bootstrap'; javax.servlet.ServletContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.servlet.ServletContextHandler.collectPropertyNames(ServletContextHandler.java:44)
            org.apache.commons.jxpath.servlet.ServletContextHandler.getPropertyNames(ServletContextHandler.java:39)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:39)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode27() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode28() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode29() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:80)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode30() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode31() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:78)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:39)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode32() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 8);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", 1073741831);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:34)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getValuePointer(NullPropertyPointer.java:65)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getNodePointer(PropertyIterator.java:133)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.getNodePointer(BeanAttributeIterator.java:59)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:88) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode33() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:78)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:39)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode34() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:63)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode35() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2013265921);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", 201326592);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode36() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2147483644);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode37() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 8);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", 134217729);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode38() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2147483643);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode39() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2145910782);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", -2014838788);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode40() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2145386492);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", 136314880);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode41() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode42() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(PropertyIterator.java:210)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode43() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        RootContext parentContext = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode44() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        Object bean = createInstance("java.lang.Object");
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyCount(DynamicPropertyPointer.java:65)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(PropertyIterator.java:210)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode45() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.binarySearch0(Arrays.java:2234)
            java.base/java.util.Arrays.binarySearch(Arrays.java:2174)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyName(DynamicPropertyPointer.java:116)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:38)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode46() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:78)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:39)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode47() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.binarySearch0(Arrays.java:2234)
            java.base/java.util.Arrays.binarySearch(Arrays.java:2174)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyName(DynamicPropertyPointer.java:116)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:38)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode48() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:78)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyCount(DynamicPropertyPointer.java:65)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(PropertyIterator.java:210)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    
    @Test
    public void testNextNode49() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        BeanPointer parent = ((BeanPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:39)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85) */
        attributeContext.nextNode();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method nextNode()
    
    @Test(timeout = 1000L)
    public void testNextNode50() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        attributeContext.nextNode();
    }
    
    @Test(timeout = 1000L)
    public void testNextNode51() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        attributeContext.nextNode();
    }
    ///endregion
    
    ///region Errors report for nextNode
    
    public void testNextNode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPosition(int)
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPosition_ReturnTrue_1() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -256);
        
        boolean actual = attributeContext.setPosition(-256);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testSetPosition_ReturnFalse() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -1073742080);
        
        boolean actual = attributeContext.setPosition(-255);
        
        assertFalse(actual);
        
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(-1073742079, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPosition_ReturnTrue() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        
        boolean actual = attributeContext.setPosition(0);
        
        assertTrue(actual);
        
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(0, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testSetPosition_ReturnFalse_1() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", -1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -67109120);
        
        boolean actual = attributeContext.setPosition(-255);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(0, finalAttributeContextIteratorPosition);
        
        assertEquals(-67109119, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testSetPosition_ReturnFalse_2() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -67109120);
        
        boolean actual = attributeContext.setPosition(-255);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(-2147483647, finalAttributeContextIteratorPosition);
        
        assertEquals(Integer.MIN_VALUE, finalAttributeContextIteratorPosition1);
        
        assertEquals(-67109119, finalAttributeContextPosition);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testSetPosition_ReturnFalse_3() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        boolean finalAttributeContextSetStarted = ((Boolean) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertTrue(finalAttributeContextSetStarted);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPosition(int)
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testSetPosition_ThrowClassCastException_1() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        BeanPropertyPointer propertyNodePointer = ((BeanPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -1073742080);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer cannot be cast to class org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer (org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer and org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:38)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: !nextNode()
 *  */
    @Test
    public void testSetPosition_ThrowClassCastException() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:61)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(-255);
    }
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.axes.AttributeContext#reset()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: !nextNode()
 *  */
    @Test
    public void testSetPosition_ThrowIndexOutOfBoundsException() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -1073741824);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.IndexOutOfBoundsException: Index -1073741825 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:59)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setPosition(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#setPosition(int)}
     */
    @Test
    public void testSetPositionReturnsFalse() {
        SelfContext selfContext = new SelfContext(null, null);
        selfContext.setPosition(Integer.MAX_VALUE);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Integer.MAX_VALUE);
        AttributeContext attributeContext = new AttributeContext(selfContext, nodeTypeTest);
        attributeContext.setPosition(Integer.MIN_VALUE);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPosition(int)
    
    @Test
    public void testSetPosition1() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(-2147483647, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition2() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(-2147483647, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition3() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(-2147483647, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition4() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", -1);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(-2147483647, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition5() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", Integer.MIN_VALUE);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2147450880);
        
        boolean actual = attributeContext.setPosition(32769);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        boolean finalAttributeContextIteratorEmpty = ((Boolean) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "empty"));
        NodeIterator attributeContextIterator2 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorStartIndex = ((Integer) getFieldValue(attributeContextIterator2, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex"));
        NodeIterator attributeContextIterator3 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        boolean finalAttributeContextIteratorTargetReady = ((Boolean) getFieldValue(attributeContextIterator3, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady"));
        NodeIterator attributeContextIterator4 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator4, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        NodeIterator attributeContextIterator5 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorStartPropertyIndex = ((Integer) getFieldValue(attributeContextIterator5, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertTrue(finalAttributeContextIteratorEmpty);
        
        assertEquals(0, finalAttributeContextIteratorStartIndex);
        
        assertTrue(finalAttributeContextIteratorTargetReady);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(0, finalAttributeContextIteratorStartPropertyIndex);
        
        assertEquals(-2147450879, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition6() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(-2147483647, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition7() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(-2147483647, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition8() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", -2147483647);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        boolean finalAttributeContextIteratorEmpty = ((Boolean) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "empty"));
        NodeIterator attributeContextIterator2 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        boolean finalAttributeContextIteratorTargetReady = ((Boolean) getFieldValue(attributeContextIterator2, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady"));
        NodeIterator attributeContextIterator3 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator3, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        NodeIterator attributeContextIterator4 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator4IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator4, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator4IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator4IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames0 = ((String) get(attributeContextIterator4IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 0));
        NodeIterator attributeContextIterator5 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator5IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator5, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator5IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator5IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames1 = ((String) get(attributeContextIterator5IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 1));
        NodeIterator attributeContextIterator6 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator6IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator6, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator6IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator6IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames2 = ((String) get(attributeContextIterator6IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 2));
        NodeIterator attributeContextIterator7 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator7IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator7, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator7IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator7IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames3 = ((String) get(attributeContextIterator7IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 3));
        NodeIterator attributeContextIterator8 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator8IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator8, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator8IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator8IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames4 = ((String) get(attributeContextIterator8IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 4));
        NodeIterator attributeContextIterator9 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator9IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator9, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator9IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator9IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames5 = ((String) get(attributeContextIterator9IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 5));
        NodeIterator attributeContextIterator10 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator10IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator10, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator10IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator10IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames6 = ((String) get(attributeContextIterator10IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 6));
        NodeIterator attributeContextIterator11 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator11IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator11, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator11IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator11IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames7 = ((String) get(attributeContextIterator11IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 7));
        NodeIterator attributeContextIterator12 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator12IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator12, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        java.lang.String[] attributeContextIterator12IteratorPropertyNodePointerIteratorPropertyNodePointerNames = ((java.lang.String[]) getFieldValue(attributeContextIterator12IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names"));
        String finalAttributeContextIteratorPropertyNodePointerNames8 = ((String) get(attributeContextIterator12IteratorPropertyNodePointerIteratorPropertyNodePointerNames, 8));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertTrue(finalAttributeContextIteratorEmpty);
        
        assertTrue(finalAttributeContextIteratorTargetReady);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames0);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames1);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames2);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames3);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames4);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames5);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames6);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames7);
        
        assertNull(finalAttributeContextIteratorPropertyNodePointerNames8);
        
        assertEquals(-2147483647, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition9() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", Integer.MIN_VALUE);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = new java.lang.String[1];
        names[0] = name;
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2145386462);
        
        boolean actual = attributeContext.setPosition(69);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorStartIndex = ((Integer) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex"));
        NodeIterator attributeContextIterator2 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        boolean finalAttributeContextIteratorTargetReady = ((Boolean) getFieldValue(attributeContextIterator2, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady"));
        NodeIterator attributeContextIterator3 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator3, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        NodeIterator attributeContextIterator4 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorStartPropertyIndex = ((Integer) getFieldValue(attributeContextIterator4, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertEquals(-1, finalAttributeContextIteratorStartIndex);
        
        assertTrue(finalAttributeContextIteratorTargetReady);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(0, finalAttributeContextIteratorStartPropertyIndex);
        
        assertEquals(-2145386461, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition10() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = new java.lang.String[1];
        names[0] = name;
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2147483647);
        
        boolean actual = attributeContext.setPosition(4);
        
        assertFalse(actual);
        
        NodeIterator attributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition = ((Integer) getFieldValue(attributeContextIterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position"));
        NodeIterator attributeContextIterator1 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        boolean finalAttributeContextIteratorTargetReady = ((Boolean) getFieldValue(attributeContextIterator1, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady"));
        NodeIterator attributeContextIterator2 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextIteratorPosition1 = ((Integer) getFieldValue(attributeContextIterator2, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "position"));
        NodeIterator attributeContextIterator3 = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        PropertyPointer attributeContextIterator3IteratorPropertyNodePointer = ((PropertyPointer) getFieldValue(attributeContextIterator3, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer"));
        int finalAttributeContextIteratorPropertyNodePointerPropertyIndex = ((Integer) getFieldValue(attributeContextIterator3IteratorPropertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "propertyIndex"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertEquals(1073741825, finalAttributeContextIteratorPosition);
        
        assertTrue(finalAttributeContextIteratorTargetReady);
        
        assertEquals(1073741824, finalAttributeContextIteratorPosition1);
        
        assertEquals(0, finalAttributeContextIteratorPropertyNodePointerPropertyIndex);
        
        assertEquals(-2147483646, finalAttributeContextPosition);
    }
    
    @Test
    public void testSetPosition11() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        CollectionPointer valuePointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        valuePointer.setIndex(Integer.MIN_VALUE);
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "valuePointer", valuePointer);
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        NodeIterator initialAttributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        
        boolean actual = attributeContext.setPosition(1);
        
        assertFalse(actual);
        
        boolean finalAttributeContextSetStarted = ((Boolean) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted"));
        NodeIterator finalAttributeContextIterator = ((NodeIterator) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator"));
        int finalAttributeContextPosition = ((Integer) getFieldValue(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position"));
        
        assertFalse(initialAttributeContextIterator == finalAttributeContextIterator);
        
        assertTrue(finalAttributeContextSetStarted);
        
        assertEquals(1, finalAttributeContextPosition);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setPosition(int)
    
    @Test
    public void testSetPosition12() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", Integer.MIN_VALUE);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = new java.lang.String[11];
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", -2147483646);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483646 out of bounds for length 11]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:288)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition13() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", Integer.MIN_VALUE);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", 1073741824);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:307)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition14() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = new java.lang.String[11];
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", -2147483646);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483646 out of bounds for length 11]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:288)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition15() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", 1073741824);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 9]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:307)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition16() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ClassCastException: class org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet cannot be cast to class org.apache.commons.jxpath.BasicNodeSet (org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet and org.apache.commons.jxpath.BasicNodeSet are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:61)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition17() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -19618662);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            java.base/java.util.Collections$UnmodifiableList.get(Collections.java:1347)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:59)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1860522325);
    }
    
    @Test
    public void testSetPosition18() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        HttpSessionHandler handler = ((HttpSessionHandler) createInstance("org.apache.commons.jxpath.servlet.HttpSessionHandler"));
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "handler", handler);
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        int[] bean = {};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.beans.PropertyPointer", "bean", bean);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -1073741824);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ClassCastException: class [I cannot be cast to class org.apache.commons.jxpath.servlet.HttpSessionAndServletContext ([I is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.servlet.HttpSessionAndServletContext is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.servlet.HttpSessionHandler.collectPropertyNames(HttpSessionHandler.java:36)
            org.apache.commons.jxpath.servlet.ServletContextHandler.getPropertyNames(ServletContextHandler.java:39)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:39)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testSetPosition19() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        VariablePointer variablePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "valuePointer", variablePointer);
        readOnlyPointers.add(variablePointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 8);
        
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition20() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        Object object = createInstance("java.lang.Object");
        readOnlyPointers.add(object);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 9);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Object is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:59)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(8);
    }
    
    @Test
    public void testSetPosition21() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        PropertyIterator iterator = ((PropertyIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.PropertyIterator"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionAllProperties(PropertyIterator.java:210)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition22() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:77)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition23() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", -2147483644);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:34)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getValuePointer(NullPropertyPointer.java:65)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getNodePointer(PropertyIterator.java:133)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.getNodePointer(BeanAttributeIterator.java:59)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:88)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition24() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", Integer.MAX_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -970626847);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:34)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getValuePointer(NullPropertyPointer.java:65)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.getNodePointer(PropertyIterator.java:133)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.getNodePointer(BeanAttributeIterator.java:59)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:88)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1150609608);
    }
    
    @Test
    public void testSetPosition25() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "reverse", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", 131);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition26() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2147483137);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", 512);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition27() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 2147483644);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startIndex", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "targetReady", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -1873867655);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:194)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(-1605431942);
    }
    
    @Test
    public void testSetPosition28() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException] */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition29() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[9];
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        contexts[0] = ((EvalContext) nodeSetContext);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2071986210);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode(NodeSetContext.java:85)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:66)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(75497431);
    }
    
    @Test
    public void testSetPosition30() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[9];
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "startedSet", true);
        contexts[0] = ((EvalContext) nodeSetContext);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2071986210);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:65)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(75497431);
    }
    
    @Test
    public void testSetPosition31() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = {};
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        DescendantContext parentContext1 = ((DescendantContext) createInstance("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:80)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2142240767);
    }
    
    @Test
    public void testSetPosition32() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet.getPointers(BasicTypeConverter.java:450)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(-1);
    }
    
    @Test
    public void testSetPosition33() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(-1);
    }
    
    @Test
    public void testSetPosition34() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet", "pointers", pointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(-1);
    }
    
    @Test
    public void testSetPosition35() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = {};
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        AncestorContext parentContext1 = ((AncestorContext) createInstance("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:80)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2142240767);
    }
    
    @Test
    public void testSetPosition36() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        DOMNodeIterator iterator = ((DOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[9];
        UnionContext unionContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        contexts[0] = ((EvalContext) unionContext);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 5);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:63)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode(NodeSetContext.java:85)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:66)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition37() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        DOMNodeIterator iterator = ((DOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[9];
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        contexts[0] = ((EvalContext) nodeSetContext);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 65);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.nextNode(NodeSetContext.java:85)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:66)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(64);
    }
    
    @Test
    public void testSetPosition38() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = {};
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:80)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2013134845);
    }
    
    @Test
    public void testSetPosition39() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        propertyNodePointer.setPropertyIndex(Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:78)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:39)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition40() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        DynamicAttributeIterator iterator = ((DynamicAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        java.lang.String[] names = {null, null, null, null, null, null, null, null, null};
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", "names", names);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.binarySearch0(Arrays.java:2234)
            java.base/java.util.Arrays.binarySearch(Arrays.java:2174)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.setPropertyName(DynamicPropertyPointer.java:116)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicAttributeIterator.prepareForIndividualProperty(DynamicAttributeIterator.java:38)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition41() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet", "pointers", pointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition42() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = new org.apache.commons.jxpath.ri.EvalContext[1];
        NodeSetContext nodeSetContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setField(nodeSetContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "startedSet", true);
        contexts[0] = ((EvalContext) nodeSetContext);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        DescendantContext parentContext1 = ((DescendantContext) createInstance("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 4);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:80)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition43() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        Object nodeSet = createInstance("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet");
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet.getPointers(BasicTypeConverter.java:450)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:80)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition44() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        QName qname = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(nodeTest, "org.apache.commons.jxpath.ri.compiler.NodeNameTest", "qname", qname);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = {};
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        RootContext parentContext1 = ((RootContext) createInstance("org.apache.commons.jxpath.ri.axes.RootContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:80)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition45() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        org.apache.commons.jxpath.ri.EvalContext[] contexts = {};
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "contexts", contexts);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.apache.commons.jxpath.BasicNodeSet.getPointers(BasicNodeSet.java:54)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.setPosition(NodeSetContext.java:67)
            org.apache.commons.jxpath.ri.axes.UnionContext.setPosition(UnionContext.java:80)
            org.apache.commons.jxpath.ri.axes.NodeSetContext.getCurrentNodePointer(NodeSetContext.java:55)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition46() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 536870912);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        NullPropertyPointer parent = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2147348351);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.QName.<init>(QName.java:34)
            org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer.getValuePointer(NullPropertyPointer.java:65)
            org.apache.commons.jxpath.ri.model.NodePointer.getNode(NodePointer.java:308)
            org.apache.commons.jxpath.ri.model.beans.PropertyPointer.getBean(PropertyPointer.java:78)
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(4356);
    }
    
    @Test
    public void testSetPosition47() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 536870912);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        String name = "";
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "name", name);
        DynamicPropertyPointer propertyNodePointer = ((DynamicPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(propertyNodePointer, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", -2147348351);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer.getPropertyNames(DynamicPropertyPointer.java:73)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.prepareForIndividualProperty(PropertyIterator.java:279)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPositionIndividualProperty(PropertyIterator.java:163)
            org.apache.commons.jxpath.ri.model.beans.PropertyIterator.setPosition(PropertyIterator.java:148)
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.setPosition(BeanAttributeIterator.java:75)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:85)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(4356);
    }
    
    @Test
    public void testSetPosition48() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList pointers = new ArrayList();
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "pointers", pointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition49() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        DOMAttributeIterator iterator = ((DOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        VariablePointer valuePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "valuePointer", valuePointer);
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.<init>(BeanAttributeIterator.java:42)
            org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(PropertyOwnerPointer.java:70)
            org.apache.commons.jxpath.ri.model.VariablePointer.attributeIterator(VariablePointer.java:389)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(CollectionPointer.java:238)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition50() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        UnionContext parentContext = ((UnionContext) createInstance("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.UnionContext", "prepared", true);
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition51() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        CollectionPointer valuePointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "valuePointer", valuePointer);
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.<init>(BeanAttributeIterator.java:42)
            org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(PropertyOwnerPointer.java:70)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(CollectionPointer.java:238)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(CollectionPointer.java:238)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition52() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        VariablePointer variablePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        DOMNodePointer valuePointer = ((DOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "valuePointer", valuePointer);
        readOnlyPointers.add(variablePointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator.<init>(DOMAttributeIterator.java:47)
            org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.attributeIterator(DOMNodePointer.java:222)
            org.apache.commons.jxpath.ri.model.VariablePointer.attributeIterator(VariablePointer.java:389)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition53() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        Object collection = createInstance("javax.swing.JEditorPane$JEditorPaneAccessibleHypertextSupport$LinkVector");
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "collection", collection);
        collectionPointer.setIndex(-2143289344);
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.<init>(BeanAttributeIterator.java:42)
            org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(PropertyOwnerPointer.java:70)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(CollectionPointer.java:238)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition54() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        VariablePointer variablePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        NullPropertyPointer valuePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "";
        valuePointer.setPropertyName(propertyName);
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "valuePointer", valuePointer);
        readOnlyPointers.add(variablePointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.<init>(BeanAttributeIterator.java:42)
            org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(PropertyOwnerPointer.java:70)
            org.apache.commons.jxpath.ri.model.VariablePointer.attributeIterator(VariablePointer.java:389)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition55() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        XMLDocumentContainer collection = ((XMLDocumentContainer) createInstance("org.apache.commons.jxpath.XMLDocumentContainer"));
        Object document = createInstance("java.lang.Object");
        setField(collection, "org.apache.commons.jxpath.XMLDocumentContainer", "document", document);
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "collection", collection);
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 2);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.<init>(BeanAttributeIterator.java:42)
            org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(PropertyOwnerPointer.java:70)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(CollectionPointer.java:238)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(1);
    }
    
    @Test
    public void testSetPosition56() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        DocumentContainer collection = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        Object document = createInstance("java.lang.Object");
        setField(collection, "org.apache.commons.jxpath.xml.DocumentContainer", "document", document);
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "collection", collection);
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 9);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.<init>(BeanAttributeIterator.java:42)
            org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(PropertyOwnerPointer.java:70)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(CollectionPointer.java:238)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(8);
    }
    
    @Test
    public void testSetPosition57() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        ArrayList collection = new ArrayList();
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "collection", collection);
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator.<init>(BeanAttributeIterator.java:42)
            org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer.attributeIterator(PropertyOwnerPointer.java:70)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(CollectionPointer.java:238)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    
    @Test
    public void testSetPosition58() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        CollectionPointer collectionPointer = ((CollectionPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        DocumentContainer collection = ((DocumentContainer) createInstance("org.apache.commons.jxpath.xml.DocumentContainer"));
        setField(collectionPointer, "org.apache.commons.jxpath.ri.model.beans.CollectionPointer", "collection", collection);
        readOnlyPointers.add(collectionPointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.xml.DocumentContainer.getValue(DocumentContainer.java:130)
            org.apache.commons.jxpath.util.ValueUtils.getValue(ValueUtils.java:487)
            org.apache.commons.jxpath.util.ValueUtils.getValue(ValueUtils.java:267)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getImmediateNode(CollectionPointer.java:110)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.getValuePointer(CollectionPointer.java:142)
            org.apache.commons.jxpath.ri.model.beans.CollectionPointer.attributeIterator(CollectionPointer.java:238)
            org.apache.commons.jxpath.ri.axes.AttributeContext.nextNode(AttributeContext.java:80)
            org.apache.commons.jxpath.ri.axes.AttributeContext.setPosition(AttributeContext.java:64) */
        attributeContext.setPosition(2);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method setPosition(int)
    
    @Test(timeout = 1000L)
    public void testSetPosition59() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        attributeContext.setPosition(1);
    }
    
    @Test(timeout = 1000L)
    public void testSetPosition60() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        attributeContext.setPosition(1);
    }
    
    @Test(timeout = 1000L)
    public void testSetPosition61() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741823);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        attributeContext.setPosition(1);
    }
    
    @Test(timeout = 1000L)
    public void testSetPosition62() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "setStarted", true);
        BeanAttributeIterator iterator = ((BeanAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "position", 1073741824);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", "includeXmlLang", true);
        NullPropertyPointer propertyNodePointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "propertyNodePointer", propertyNodePointer);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "startPropertyIndex", Integer.MIN_VALUE);
        setField(iterator, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "includeStart", true);
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "iterator", iterator);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", Integer.MIN_VALUE);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        attributeContext.setPosition(1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPosition(int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetPosition63() throws Exception  {
        AttributeContext attributeContext = ((AttributeContext) createInstance("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        NodeNameTest nodeTest = ((NodeNameTest) createInstance("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(attributeContext, "org.apache.commons.jxpath.ri.axes.AttributeContext", "nodeTest", nodeTest);
        NodeSetContext parentContext = ((NodeSetContext) createInstance("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        BasicNodeSet nodeSet = ((BasicNodeSet) createInstance("org.apache.commons.jxpath.BasicNodeSet"));
        ArrayList readOnlyPointers = new ArrayList();
        VariablePointer variablePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        BasicVariables variables = ((BasicVariables) createInstance("org.apache.commons.jxpath.BasicVariables"));
        HashMap vars = new HashMap();
        setField(variables, "org.apache.commons.jxpath.BasicVariables", "vars", vars);
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "variables", variables);
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "name", name);
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "actual", true);
        readOnlyPointers.add(variablePointer);
        readOnlyPointers.add(null);
        readOnlyPointers.add(null);
        setField(nodeSet, "org.apache.commons.jxpath.BasicNodeSet", "readOnlyPointers", readOnlyPointers);
        setField(parentContext, "org.apache.commons.jxpath.ri.axes.NodeSetContext", "nodeSet", nodeSet);
        setField(parentContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 1);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "parentContext", parentContext);
        setField(attributeContext, "org.apache.commons.jxpath.ri.EvalContext", "position", 3);
        
        attributeContext.setPosition(2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.axes.AttributeContext.getCurrentNodePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentNodePointer()
    
    /**
    @utbot.classUnderTest {@link AttributeContext}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.axes.AttributeContext#getCurrentNodePointer()}
 * @utbot.returnsFrom {@code return currentNodePointer;}
 *  */
    @Test
    public void testGetCurrentNodePointer_ReturnCurrentNodePointer() {
        AttributeContext attributeContext = new AttributeContext(null, null);
        
        NodePointer actual = attributeContext.getCurrentNodePointer();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1047525044969400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1047525044969400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1047525044980300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047525044969400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047525044980300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1047525045546500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1047525045546500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1047525045548900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047525045546500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047525045548900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

