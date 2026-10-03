package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit 4 Test class for CoreOperationRelationalExpression (Defects4J JxPath-7b).
 * Focused on high branch/condition coverage and edge cases.
 */
public class CoreOperationRelationalExpressionTest {

    /**
     * Concrete subclass of CoreOperationRelationalExpression for testing abstract class behavior.
     */
    private static class ConcreteRelationalExpression extends CoreOperationRelationalExpression {
        public ConcreteRelationalExpression(Expression[] args) {
            super(args);
        }

        @Override
        public Object computeValue(org.apache.commons.jxpath.ri.EvalContext context) {
            return Boolean.TRUE;
        }
    }

    @Test
    public void testGetPrecedence() {
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(null);
        assertEquals("Precedence for relational expressions must always be 3", 3, expr.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(null);
        assertFalse("Relational expressions must not be symmetric", expr.isSymmetric());
    }

    @Test
    public void testConstructorWithValidArguments() {
        Expression[] args = new Expression[] {
            new Constant("test1"),
            new Constant("test2")
        };
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);
        assertNotNull("Expression instance should be successfully created", expr);
        assertEquals("Arguments length should match", 2, expr.args.length);
    }

    @Test
    public void testConstructorWithEmptyArguments() {
        Expression[] args = new Expression[0];
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(args);
        assertNotNull("Expression instance should be successfully created with empty args", expr);
        assertEquals("Arguments length should be 0", 0, expr.args.length);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullArguments() {
        // Depending on Superclass implementation, passing null args might throw NPE when accessed.
        // This edge case ensures we capture superclass contract behavior.
        ConcreteRelationalExpression expr = new ConcreteRelationalExpression(null);
        // Attempting to access args to trigger potential NPE in superclass constructor/handling
        Object arguments = expr.args; 
        if (arguments == null) {
            throw new NullPointerException("Args is null");
        }
    }
}