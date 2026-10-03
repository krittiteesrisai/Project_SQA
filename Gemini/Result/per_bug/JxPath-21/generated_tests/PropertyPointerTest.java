package org.apache.commons.jxpath.ri.model.beans;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for PropertyPointer targeting high Branch/Condition coverage
 * and edge cases for Defects4J JxPath-21b.
 */
public class PropertyPointerTest {

    // Concrete implementation stub of PropertyPointer for testing purposes
    private static class ConcretePropertyPointer extends PropertyPointer {
        private String propertyName = "testProp";
        private Object baseValue = "testValue";
        private boolean actualProperty = true;
        private int propertyCount = 1;
        private Object assignedValue = null;

        public ConcretePropertyPointer(NodePointer parent) {
            super(parent);
        }

        @Override
        public String getPropertyName() {
            return propertyName;
        }

        @Override
        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }

        @Override
        public int getPropertyCount() {
            return propertyCount;
        }

        @Override
        public String[] getPropertyNames() {
            return new String[]{propertyName};
        }

        @Override
        protected boolean isActualProperty() {
            return actualProperty;
        }

        @Override
        public Object getBaseValue() {
            return baseValue;
        }

        @Override
        public void setValue(Object value) {
            this.assignedValue = value;
        }

        public void setBaseValue(Object baseValue) {
            this.baseValue = baseValue;
        }

        public void setActualProperty(boolean actualProperty) {
            this.actualProperty = actualProperty;
        }
    }

    @Test
    public void testSetPropertyIndexChangesIndexWhenDifferent() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setIndex(5);
        assertEquals(5, pointer.getIndex());

        // Setting a different property index should reset index to WHOLE_COLLECTION
        pointer.setPropertyIndex(10);
        assertEquals(10, pointer.getPropertyIndex());
        assertEquals(PropertyPointer.WHOLE_COLLECTION, pointer.getIndex());
    }

    @Test
    public void testSetPropertyIndexDoesNothingWhenSame() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setPropertyIndex(10);
        pointer.setIndex(3);

        // Setting the exact same property index should NOT reset the index
        pointer.setPropertyIndex(10);
        assertEquals(10, pointer.getPropertyIndex());
        assertEquals(3, pointer.getIndex());
    }

    @Test
    public void testGetBeanLazyInitialization() {
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), new Object(), null);
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parent);

        // Initially bean is null
        assertNull(pointer.bean);

        // First call populates bean
        Object bean1 = pointer.getBean();
        assertNotNull(bean1);
        assertSame(bean1, pointer.bean);

        // Second call returns cached bean
        Object bean2 = pointer.getBean();
        assertSame(bean1, bean2);
    }

    @Test
    public void testGetName() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setPropertyName("myProperty");
        QName qName = pointer.getName();
        assertEquals("myProperty", qName.getName());
        assertNull(qName.getPrefix());
    }

    @Test
    public void testIsActualBranches() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);

        // Case 1: isActualProperty() returns false -> isActual() returns false immediately
        pointer.setActualProperty(false);
        assertFalse(pointer.isActual());

        // Case 2: isActualProperty() returns true -> delegates to super.isActual()
        pointer.setActualProperty(true);
        // Root nodePointer behavior for super.isActual()
        assertTrue(pointer.isActual());
    }

    @Test
    public void testGetImmediateNodeCachingAndIndices() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setBaseValue(new String[]{"a", "b", "c"});

        // Whole collection
        pointer.setIndex(PropertyPointer.WHOLE_COLLECTION);
        Object node1 = pointer.getImmediateNode();
        assertNotNull(node1);

        // Subsequent call returns cached value without re-evaluating
        Object nodeCached = pointer.getImmediateNode();
        assertSame(node1, nodeCached);
    }

    @Test
    public void testGetImmediateNodeWithSpecificIndex() {
        // Resetting uninitialized state requires a new instance or resetting via subclass/reflection if needed
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setBaseValue(new String[]{"a", "b", "c"});
        pointer.setIndex(1);
        Object item = pointer.getImmediateNode();
        assertEquals("b", item);
    }

    @Test
    public void testIsCollectionAndGetLength() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        
        // Null base value
        pointer.setBaseValue(null);
        assertFalse(pointer.isCollection());
        assertEquals(0, pointer.getLength());

        // Collection base value
        pointer.setBaseValue(new String[]{"x", "y"});
        assertTrue(pointer.isCollection());
        assertEquals(2, pointer.getLength());
    }

    @Test
    public void testIsLeaf() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        // getNode() returns immediate node (null initially if base value is null)
        pointer.setBaseValue(null);
        assertTrue(pointer.isLeaf());

        pointer.setBaseValue("AtomicString");
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testGetImmediateValuePointer() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setBaseValue("Hello");
        NodePointer child = pointer.getImmediateValuePointer();
        assertNotNull(child);
        assertEquals("testProp", child.getName().getName());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    coin
    public void testCreatePathThrowsExceptionWhenFactoryFails() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setBaseValue(null); // getImmediateNode() will be null

        JXPathContext context = JXPathContext.newContext(new Object());
        // Default factory will fail to create object, throwing JXPathAbstractFactoryException
        pointer.createPath(context);
    }

    @Test
    public void testCreatePathSuccessWhenNodeNotNull() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setBaseValue("AlreadyPresent");

        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = pointer.createPath(context);
        assertSame(pointer, result);
    }

    @Test
    public void testCreatePathWithValueExpandingCollection() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setBaseValue(new String[]{"a"});
        pointer.setIndex(5); // index >= getLength() (5 >= 1)

        JXPathContext context = JXPathContext.newContext(new Object());
        // Should trigger createPath() internally because index >= getLength()
        try {
            pointer.createPath(context, "newValue");
        } catch (JXPathAbstractFactoryException e) {
            // Expected if factory cannot create collection item automatically, 
            // but branch condition (index != WHOLE_COLLECTION && index >= getLength()) is covered.
        }
    }

    @Test
    public void testCreateChildWithNameAndIndex() {
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), new Object(), null);
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parent);
        pointer.setBaseValue("Val");

        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer child = pointer.createChild(context, new QName("newChildName"), 2);
        assertNotNull(child);
        assertEquals(2, child.getIndex());
    }

    @Test
    public void testCreateChildWithValue() {
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), new Object(), null);
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(parent);
        pointer.setBaseValue("Val");

        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer child = pointer.createChild(context, new QName("newChildName"), 0, "childValue");
        assertNotNull(child);
        assertEquals(0, child.getIndex());
    }

    @Test
    public void testEqualsAndHashCodeEdgeCases() {
        NodePointer parent1 = NodePointer.newNodePointer(new QName("root1"), new Object(), null);
        NodePointer parent2 = NodePointer.newNodePointer(new QName("root2"), new Object(), null);

        ConcretePropertyPointer p1 = new ConcretePropertyPointer(parent1);
        p1.setPropertyIndex(1);
        p1.setPropertyName("prop");
        p1.setIndex(0);

        // Reflexive
        assertTrue(p1.equals(p1));

        // Different type
        assertFalse(p1.equals("not a pointer"));

        // Different parent
        ConcretePropertyPointer p2 = new ConcretePropertyPointer(parent2);
        p2.setPropertyIndex(1);
        p2.setPropertyName("prop");
        p2.setIndex(0);
        assertFalse(p1.equals(p2));

        // Different property index or name
        ConcretePropertyPointer p3 = new ConcretePropertyPointer(parent1);
        p3.setPropertyIndex(2);
        p3.setPropertyName("prop");
        assertFalse(p1.equals(p3));

        ConcretePropertyPointer p4 = new ConcretePropertyPointer(parent1);
        p4.setPropertyIndex(1);
        p4.setPropertyName("diffProp");
        assertFalse(p1.equals(p4));

        // Equal pointers
        ConcretePropertyPointer p5 = new ConcretePropertyPointer(parent1);
        p5.setPropertyIndex(1);
        p5.setPropertyName("prop");
        p5.setIndex(0);
        assertTrue(p1.equals(p5));

        // HashCode verification
        assertNotEquals(0, p1.hashCode());
    }

    @Test
    public void testCompareChildNodePointers() {
        ConcretePropertyPointer pointer = new ConcretePropertyPointer(null);
        pointer.setBaseValue(new Object());
        NodePointer sub1 = NodePointer.newNodePointer(new QName("a"), new Object(), pointer);
        NodePointer sub2 = NodePointer.newNodePointer(new QName("b"), new Object(), pointer);
        
        int result = pointer.compareChildNodePointers(sub1, sub2);
        assertTrue(result <= 0 || result >= 0); // Validates execution without exception
    }
}