package org.apache.commons.jxpath.ri.axes;

import junit.framework.TestCase;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;

/**
 * High-coverage JUnit 4 (compatible with JUnit 3 TestCase runner if needed) test suite for UnionContext.
 */
public class UnionContextTest extends TestCase {

    private JXPathContextReferenceImpl jxpathContext;
    private NodePointer rootPointer;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // Setup basic JXPath context and root pointer for creating realistic EvalContexts
        Object rootBean = new Object();
        jxpathContext = (JXPathContextReferenceImpl) JXPathContext.newContext(rootBean);
        rootPointer = NodePointer.newChildNodePointer(
                BeanPointer.newNodePointer(new QName("root"), rootBean, null),
                new QName("child"),
                rootBean
        );
    }

    /**
     * Test getDocumentOrder when contexts length > 1.
     */
    public void testGetDocumentOrderMultipleContexts() {
        EvalContext ctx1 = new InitialContext(new RootContext(jxpathContext, rootPointer));
        EvalContext ctx2 = new InitialContext(new RootContext(jxpathContext, rootPointer));
        EvalContext[] contexts = new EvalContext[] { ctx1, ctx2 };

        UnionContext unionContext = new UnionContext(null, contexts);
        assertEquals("Document order should be 1 when contexts length > 1", 1, unionContext.getDocumentOrder());
    }

    /**
     * Test getDocumentOrder when contexts length is not > 1 (e.g., length 1 or 0).
     */
    public void testGetDocumentOrderSingleOrEmptyContext() {
        EvalContext ctx1 = new InitialContext(new RootContext(jxpathContext, rootPointer));
        EvalContext[] contextsSingle = new EvalContext[] { ctx1 };
        UnionContext unionContextSingle = new UnionContext(null, contextsSingle);
        // super.getDocumentOrder() for InitialContext / RootContext typically returns 0 or 1 depending on setup,
        // but we verify it delegates properly when length <= 1.
        assertEquals(unionContextSingle.getParentContext().getDocumentOrder(), unionContextSingle.getDocumentOrder());

        EvalContext[] contextsEmpty = new EvalContext[] {};
        UnionContext unionContextEmpty = new UnionContext(null, contextsEmpty);
        assertEquals(unionContextEmpty.getParentContext().getDocumentOrder(), unionContextEmpty.getDocumentOrder());
    }

    /**
     * Test setPosition with multiple contexts, iterating through sets and nodes, 
     * including duplicate node pointers to test deduplication logic (!pointers.contains(ptr)).
     */
    public void testSetPositionWithPreparationAndDeduplication() {
        EvalContext ctx1 = new InitialContext(new RootContext(jxpathContext, rootPointer));
        EvalContext ctx2 = new InitialContext(new RootContext(jxpathContext, rootPointer));
        
        // Using the same ctx1 twice to force duplicate NodePointers and test deduplication branch
        EvalContext[] contexts = new EvalContext[] { ctx1, ctx1, ctx2 };

        UnionContext unionContext = new UnionContext(null, contexts);

        // First call triggers 'prepared = true' and populates the node set
        boolean resultPos1 = unionContext.setPosition(1);
        assertTrue("Setting position 1 should succeed", resultPos1);
        assertEquals("Current pointer should not be null", rootPointer, unionContext.getCurrentNodePointer());

        // Second call to setPosition (prepared is already true, tests the alternate branch)
        boolean resultPosOutOfBounds = unionContext.setPosition(10);
        assertFalse("Setting out-of-bounds position should return false", resultPosOutOfBounds);
    }

    /**
     * Test setPosition with empty contexts array (0 contexts).
     */
    public void testSetPositionEmptyContexts() {
        EvalContext[] contexts = new EvalContext[] {};
        UnionContext unionContext = new UnionContext(null, contexts);

        boolean result = unionContext.setPosition(1);
        assertFalse("Setting position with empty contexts should return false", result);
    }

    /**
     * Test setPosition with null contexts array or edge boundary values for position.
     */
    public void testSetPositionEdgeCases() {
        EvalContext ctx1 = new InitialContext(new RootContext(jxpathContext, rootPointer));
        EvalContext[] contexts = new EvalContext[] { ctx1 };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Position 0 or negative values (Boundary limits)
        assertFalse("Position 0 should return false", unionContext.setPosition(0));
        
        // Reset or test multiple consecutive valid/invalid setPosition calls
        assertTrue("Position 1 should return true", unionContext.setPosition(1));
        assertFalse("Position -1 should return false", unionContext.setPosition(-1));
    }
}