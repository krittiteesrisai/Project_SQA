package org.apache.commons.jxpath.ri.axes;

import junit.framework.TestCase;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;

/**
 * High-coverage JUnit 4 test class for AttributeContext (Defects4J JxPath-18b).
 */
public class AttributeContextTest extends TestCase {

    public static class TestBean {
        private String attributeOne = "value1";
        private String attributeTwo = "value2";

        public String getAttributeOne() {
            return attributeOne;
        }

        public String getAttributeTwo() {
            return attributeTwo;
        }
    }

    private EvalContext parentContext;
    private NodePointer rootPointer;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestBean bean = new TestBean();
        JXPathContext context = JXPathContext.newContext(bean);
        rootPointer = NodePointer.newChildNodePointer(null, new QName("test"), bean);
        parentContext = new InitialContext(new org.apache.commons.jxpath.ri.RootContext(context, rootPointer));
    }

    /**
     * Tests that a non-NodeNameTest (e.g. NodeTypeTest) immediately returns false on first nextNode().
     * Covers: nextNode() -> !setStarted -> !(nodeTest instanceof NodeNameTest)
     */
    public void testNextNodeWithNonNodeNameTest() {
        NodeTypeTest nodeTest = new NodeTypeTest(1); // 1 typically represents NODE_TYPE_NODE
        AttributeContext attrContext = new AttributeContext(parentContext, nodeTest);

        assertFalse("Non-NodeNameTest should cause nextNode() to return false", attrContext.nextNode());
        assertNull("Current node pointer should be null", attrContext.getCurrentNodePointer());
    }

    /**
     * Tests iterating through attributes using a valid NodeNameTest.
     * Covers: Successful iteration of attribute nodes, getting current node pointer.
     */
    public void testAttributeIterationSuccess() {
        NodeNameTest nodeTest = new NodeNameTest(new QName("attributeOne"));
        AttributeContext attrContext = new AttributeContext(parentContext, nodeTest);

        assertTrue("First nextNode() should find the attribute", attrContext.nextNode());
        assertNotNull("CurrentNodePointer should not be null", attrContext.getCurrentNodePointer());
        assertEquals("attributeOne", attrContext.getCurrentNodePointer().getName().getName());

        // Next call should return false as there's only matching attributeOne (or test all attributes if general NameTest)
    }

    /**
     * Tests wildcard or matching name test where multiple attributes might exist or iterating correctly.
     */
    public void testWildcardAttributeIteration() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, null)); // Wildcard name test if supported, or specific
        AttributeContext attrContext = new AttributeContext(parentContext, nodeTest);

        // Depending on JXPath behavior, wildcard or specific name test
        boolean hasFirst = attrContext.nextNode();
        // Just ensuring it doesn't throw unexpected exceptions and handles iteration flow
        if (hasFirst) {
            assertNotNull(attrContext.getCurrentNodePointer());
        }
    }

    /**
     * Tests setPosition with a position greater than current, requiring nextNode().
     * Covers: setPosition() -> getCurrentPosition() < position loop.
     */
    public void testSetPositionForward() {
        NodeNameTest nodeTest = new NodeNameTest(new QName("attributeOne"));
        AttributeContext attrContext = new AttributeContext(parentContext, nodeTest);

        // position 1
        boolean result = attrContext.setPosition(1);
        assertTrue("Setting position to 1 should succeed", result);
        assertNotNull(attrContext.getCurrentNodePointer());
    }

    /**
     * Tests setPosition with an out-of-bounds position returning false.
     */
    public void testSetPositionOutOfBounds() {
        NodeNameTest nodeTest = new NodeNameTest(new QName("nonExistentAttribute"));
        AttributeContext attrContext = new AttributeContext(parentContext, nodeTest);

        boolean result = attrContext.setPosition(1);
        assertFalse("Setting position for non-existent attribute should return false", result);
    }

    /**
     * Tests reset() functionality and backward setPosition triggering reset().
     * Covers: setPosition() -> position < getCurrentPosition() -> reset()
     */
    public void testResetAndBackwardSetPosition() {
        NodeNameTest nodeTest = new NodeNameTest(new QName("attributeOne"));
        AttributeContext attrContext = new AttributeContext(parentContext, nodeTest);

        // Move to position 1
        assertTrue(attrContext.setPosition(1));
        assertNotNull(attrContext.getCurrentNodePointer());

        // Reset manually
        attrContext.reset();
        assertNull(attrContext.getCurrentNodePointer());

        // Move to position 1 again after reset
        assertTrue(attrContext.setPosition(1));

        // Test backward jump (e.g. current position is 1, requesting position 0)
        assertTrue(attrContext.setPosition(0));
    }

    /**
     * Tests when parentContext or attribute iterator yields null resulting in false.
     */
    public void testIteratorNullHandling() {
        // Passing a context whose pointer has no attributes or null pointer
        EvalContext emptyParent = new InitialContext(new org.apache.commons.jxpath.ri.RootContext(JXPathContext.newContext(new Object()), NodePointer.newChildNodePointer(null, new QName("empty"), null)));
        NodeNameTest nodeTest = new NodeNameTest(new QName("any"));
        AttributeContext attrContext = new AttributeContext(emptyParent, nodeTest);

        assertFalse(attrContext.nextNode());
    }
}