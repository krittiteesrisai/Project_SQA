package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for TypeCheck (Defects4J Closure-154b)
 * Focuses on Branch/Condition Coverage and Edge Cases (Null, Boundary, Invalid States).
 */
public class TypeCheckTest {

    private Compiler compiler;
    private TypeCheck typeCheck;
    private JSTypeRegistry typeRegistry;
    private ReverseAbstractInterpreter reverseInterpreter;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Setup basic compiler options/environment if needed
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        
        typeRegistry = compiler.getTypeRegistry();
        reverseInterpreter = new ClosureReverseAbstractInterpreter(compiler.getCodingConvention(), typeRegistry);
        
        typeCheck = new TypeCheck(
            compiler,
            reverseInterpreter,
            typeRegistry,
            CheckLevel.WARNING,
            CheckLevel.WARNING
        );
    }

    @Test(expected = NullPointerException.class)
    public void testCheckWithNullNodeShouldThrowException() {
        // Edge Case: Null pointer validation in check(Node, boolean)
        typeCheck.check(null, false);
    }

    @Test
    public void testProcessWithNullScopeCreatorOrTopScope() {
        // Edge Case: Invalid states where scopeCreator or topScope is null when process is called
        Node jsRoot = new Node(Token.SCRIPT);
        Node externsRoot = new Node(Token.SCRIPT);
        jsRoot.addChildToBack(externsRoot); // Establish parent-child relationship

        try {
            typeCheck.process(externsRoot, jsRoot);
            fail("Expected NullPointerException due to uninitialized topScope/scopeCreator");
        } catch (NullPointerException e) {
            // Expected Preconditions.checkNotNull(scopeCreator) or topScope
        }
    }

    @Test
    public void testReportMissingPropertiesChaining() {
        // Boundary/State Test: Fluent API configuration
        TypeCheck configuredCheck = typeCheck.reportMissingProperties(false);
        assertNotNull(configuredCheck);
    }

    @Test
    public void testGetTypedPercentWithZeroTotal() {
        // Edge Case: Division by zero prevention in typed statistics calculation
        double percent = typeCheck.getTypedPercent();
        assertEquals(0.0, percent, 0.001);
    }

    @Test
    public void testIsReferenceEdgeCases() {
        // Branch Coverage: Testing isReference via DELPROP behavior
        // DELPROP expects a reference operand (NAME, GETPROP, GETELEM)
        Node nonReferenceNode = new Node(Token.NUMBER, 123);
        Node delPropNode = new Node(Token.DELPROP, nonReferenceNode);
        Node parentBlock = new Node(Token.BLOCK, delPropNode);

        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        
        // Visiting DELPROP with non-reference should trigger BAD_DELETE warning
        typeCheck.visit(traversal, delPropNode, parentBlock);
        
        // Verify diagnostic was reported
        assertTrue(compiler.getErrorCount() > 0 || compiler.getWarningCount() > 0);
    }

    @Test
    public void testGetJSTypeWithNullNodeJsType() {
        // Edge Case: Node without JSType should default to UNKNOWN_TYPE gracefully
        Node nameNode = new Node(Token.NAME, "undefinedVar");
        assertNull(nameNode.getJSType());
        
        // Invoking visitName or internal handlers where getJSType is called
        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        boolean typeable = typeCheck.visitName(traversal, nameNode, new Node(Token.EXPR_RESULT, nameNode));
        assertTrue(typeable);
        assertNotNull(nameNode.getJSType());
    }
}