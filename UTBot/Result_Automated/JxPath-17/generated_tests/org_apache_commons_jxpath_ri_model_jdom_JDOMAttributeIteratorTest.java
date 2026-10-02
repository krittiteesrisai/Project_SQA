package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import org.apache.commons.jxpath.ri.model.NodePointer;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_jxpath_ri_model_jdom_JDOMAttributeIteratorTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getPosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPosition()
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getPosition()}
 * @utbot.returnsFrom {@code return position;}
 *  */
    @Test
    public void testGetPosition_ReturnPosition() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", -255);
        
        int actual = jDOMAttributeIterator.getPosition();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNodePointer()
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): True}
 * @utbot.executesCondition {@code (!setPosition(1)): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNodePointer_NotSetPosition() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        
        NodePointer actual = jDOMAttributeIterator.getNodePointer();
        
        assertNull(actual);
        
        List finalJDOMAttributeIteratorAttributes = ((List) getFieldValue(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes"));
        
        assertNull(finalJDOMAttributeIteratorAttributes);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): True}
 * @utbot.executesCondition {@code (!setPosition(1)): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNodePointer_NotSetPosition_1() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        
        NodePointer actual = jDOMAttributeIterator.getNodePointer();
        
        assertNull(actual);
        
        int finalJDOMAttributeIteratorPosition = ((Integer) getFieldValue(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position"));
        
        assertEquals(1, finalJDOMAttributeIteratorPosition);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return new JDOMAttributePointer(parent, (Attribute) attributes.get(index));}
 *  */
    @Test
    public void testGetNodePointer_IndexGreaterOrEqualZero() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        DynamicPointer parent = ((DynamicPointer) createInstance("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent", parent);
        ArrayList attributes = new ArrayList();
        attributes.add(null);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", 1);
        
        JDOMAttributePointer actual = ((JDOMAttributePointer) jDOMAttributeIterator.getNodePointer());
        
        JDOMAttributePointer expected = ((JDOMAttributePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        expected.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        // org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNodePointer()
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: (Attribute) attributes.get(index)
 *  */
    @Test
    public void testGetNodePointer_ThrowIndexOutOfBoundsException() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        NullPointer parent = ((NullPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent", parent);
        ArrayList attributes = new ArrayList();
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer(JDOMAttributeIterator.java:103) */
        jDOMAttributeIterator.getNodePointer();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (Attribute) attributes.get(index)
 *  */
    @Test
    public void testGetNodePointer_ThrowClassCastException() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        JDOMNamespacePointer parent = ((JDOMNamespacePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent", parent);
        ArrayList attributes = new ArrayList();
        Object object = createInstance("java.lang.Object");
        attributes.add(object);
        attributes.add(null);
        attributes.add(null);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jdom.Attribute (java.lang.Object is in module java.base of loader 'bootstrap'; org.jdom.Attribute is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @396ef659)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer(JDOMAttributeIterator.java:103) */
        jDOMAttributeIterator.getNodePointer();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): True}
 * @utbot.executesCondition {@code (!setPosition(1)): False}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#setPosition(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (Attribute) attributes.get(index)
 *  */
    @Test
    public void testGetNodePointer_ThrowClassCastException_1() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        Object object = createInstance("java.lang.Object");
        attributes.add(object);
        attributes.add(null);
        attributes.add(null);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jdom.Attribute (java.lang.Object is in module java.base of loader 'bootstrap'; org.jdom.Attribute is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @396ef659)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer(JDOMAttributeIterator.java:103) */
        jDOMAttributeIterator.getNodePointer();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (Attribute) attributes.get(index)
 *  */
    @Test
    public void testGetNodePointer_ThrowNullPointerException() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", 1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer(JDOMAttributeIterator.java:103) */
        jDOMAttributeIterator.getNodePointer();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#getNodePointer()}
 * @utbot.executesCondition {@code (position == 0): False}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (Attribute) attributes.get(index)
 *  */
    @Test
    public void testGetNodePointer_ThrowNullPointerException_1() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", -256);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.getNodePointer(JDOMAttributeIterator.java:103) */
        jDOMAttributeIterator.getNodePointer();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator.setPosition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method setPosition(int)
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#setPosition(int)}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testSetPosition_AttributesEqualsNull() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        
        boolean actual = jDOMAttributeIterator.setPosition(-255);
        
        assertFalse(actual);
        
        List finalJDOMAttributeIteratorAttributes = ((List) getFieldValue(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes"));
        
        assertNull(finalJDOMAttributeIteratorAttributes);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method setPosition(int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (attributes == null): False}
    /// return from: {@code return position >= 1 && position <= attributes.size();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#setPosition(int)}
 * @utbot.returnsFrom {@code return position >= 1 && position <= attributes.size();}
 *  */
    @Test
    public void testSetPosition_PositionLessThan1AndPositionGreaterThanAttributesSize() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", -255);
        
        boolean actual = jDOMAttributeIterator.setPosition(0);
        
        assertFalse(actual);
        
        int finalJDOMAttributeIteratorPosition = ((Integer) getFieldValue(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position"));
        
        assertEquals(0, finalJDOMAttributeIteratorPosition);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#setPosition(int)}
 * @utbot.returnsFrom {@code return position >= 1 && position <= attributes.size();}
 *  */
    @Test
    public void testSetPosition_PositionLessThan1AndPositionGreaterThanAttributesSize_1() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", -255);
        
        boolean actual = jDOMAttributeIterator.setPosition(1);
        
        assertFalse(actual);
        
        int finalJDOMAttributeIteratorPosition = ((Integer) getFieldValue(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position"));
        
        assertEquals(1, finalJDOMAttributeIteratorPosition);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMAttributeIterator}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator#setPosition(int)}
 * @utbot.returnsFrom {@code return position >= 1 && position <= attributes.size();}
 *  */
    @Test
    public void testSetPosition_PositionGreaterOrEqual1AndPositionLessOrEqualAttributesSize() throws Exception  {
        JDOMAttributeIterator jDOMAttributeIterator = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        ArrayList attributes = new ArrayList();
        attributes.add(null);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes", attributes);
        setField(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position", -255);
        
        boolean actual = jDOMAttributeIterator.setPosition(1);
        
        assertTrue(actual);
        
        int finalJDOMAttributeIteratorPosition = ((Integer) getFieldValue(jDOMAttributeIterator, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "position"));
        
        assertEquals(1, finalJDOMAttributeIteratorPosition);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1047407174252200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1047407174252200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1047407174268300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047407174252200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047407174268300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1047407176545500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1047407176545500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1047407176552600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047407176545500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047407176552600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

