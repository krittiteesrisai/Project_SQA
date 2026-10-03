package org.apache.commons.jxpath.ri.model.beans;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;

import junit.framework.TestCase;

/**
 * High-coverage JUnit 4 test class for NullPropertyPointer targeting Defects4J JxPath-3b.
 */
public class NullPropertyPointerTest extends TestCase {

    private NullPropertyPointer nullPropertyPointer;
    private NullPointer parentNullPointer;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        parentNullPointer = new NullPointer(new QName("test"));
        nullPropertyPointer = new NullPropertyPointer(parentNullPointer);
    }

    public void testBasicGettersAndSetters() {
        assertNotNull(nullPropertyPointer.getName());
        assertEquals("*", nullPropertyPointer.getPropertyName());
        assertEquals(0, nullPropertyPointer.getLength());
        assertNull(nullPropertyPointer.getBaseValue());
        assertNull(nullPropertyPointer.getImmediateNode());
        assertTrue(nullPropertyPointer.isLeaf());
        assertFalse(nullPropertyPointer.isActualProperty());
        assertFalse(nullPropertyPointer.isActual());
        assertTrue(nullPropertyPointer.isContainer());
        assertEquals(0, nullPropertyPointer.getPropertyCount());
        assertEquals(0, nullPropertyPointer.getPropertyNames().length);

        nullPropertyPointer.setPropertyIndex(5); // No-op, should not throw exception
        nullPropertyPointer.setPropertyName("newProp");
        assertEquals("newProp", nullPropertyPointer.getPropertyName());
    }

    public void testGetValuePointer() {
        NodePointer vp = nullPropertyPointer.getValuePointer();
        assertNotNull(vp);
        assertTrue(vp instanceof NullPointer);
    }

    public void testSetValue_ParentNullOrContainer_ThrowsException() {
        // parentNullPointer is a container (isContainer() == true), triggers first branch
        try {
            nullPropertyPointer.setValue("someValue");
            fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("the target object is null"));
        }
    }

    public void testSetValue_NonContainerUnsupportedDynamic_ThrowsException() {
        // Create a PropertyOwnerPointer that is NOT a container and does NOT support dynamic properties
        TestBean bean = new TestBean();
        BeanPointer beanPointer = new BeanPointer(NodePointer.newNodePointer(new QName("bean"), bean, null), new QName("bean"), bean, null);
        NullPropertyPointer npp = new NullPropertyPointer(beanPointer);

        try {
            npp.setValue("someValue");
            fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("path does not match a changeable location"));
        }
    }

    public void testIsCollectionAndIndex() {
        nullPropertyPointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertFalse(nullPropertyPointer.isCollection());

        nullPropertyPointer.setIndex(0);
        assertTrue(nullPropertyPointer.isCollection());
    }

    public void testAsPath_WithoutNameAttribute() {
        String path = nullPropertyPointer.asPath();
        assertNotNull(path);
    }

    public void testAsPath_WithNameAttributeAndEscaping() {
        nullPropertyPointer.setNameAttributeValue("test's \"quoted\" name");
        nullPropertyPointer.setIndex(1);
        String path = nullPropertyPointer.asPath();
        assertNotNull(path);
        assertTrue(path.contains("&apos;"));
        assertTrue(path.contains("&quot;"));
    }

    public void testCreateChildWithoutValue() {
        JXPathContext context = JXPathContext.newContext(new TestBean());
        try {
            nullPropertyPointer.createChild(context, new QName("child"), 0);
            fail("Expected exception due to null/unsupported parent creation chain");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    public void testCreateChildWithValue() {
        JXPathContext context = JXPathContext.newContext(new TestBean());
        try {
            nullPropertyPointer.createChild(context, new QName("child"), 0, "val");
            fail("Expected exception due to null/unsupported parent creation chain");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    // Helper Bean for testing
    public static class TestBean {
        private String property;
        public String getProperty() { return property; }
        public void setProperty(String property) { this.property = property; }
    }
}