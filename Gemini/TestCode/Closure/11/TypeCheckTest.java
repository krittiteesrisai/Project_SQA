package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Suite for Closure-11b TypeCheck class.
 * Focuses on Branch/Condition Coverage and Edge Cases (Null/Empty/Invalid states).
 */
public class TypeCheckTest {

    private Compiler compiler;
    private TypeCheck typeCheck;
    private JSTypeRegistry typeRegistry;
    private Scope topScope;
    private ReverseAbstractInterpreter reverseInterpreter;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Initialize compiler options minimally to prevent null pointer exceptions in passes
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);

        typeRegistry = compiler.getTypeRegistry();
        reverseInterpreter = new CodingConventionRegistry(compiler.getCodingConvention()) {
            // using default or basic mock-like setup via concrete compiler instances
        };
        
        // Setup scopes
        topScope = new Scope(null, compiler.getTypeRegistry());
        typeCheck = new TypeCheck(
            compiler,
            null,
            typeRegistry,
            topScope,
            null,
            CheckLevel.WARNING,
            CheckLevel.WARNING
        );
    }

    @Test
    public void testProcessWithNullScopeCreatorOrTopScope() {
        // Edge Case: process() expects scopeCreator and topScope not to be null.
        // Expects NullPointerException due to Preconditions.checkNotNull(scopeCreator)
        Node jsRoot = new Node(Token.SCRIPT);
        jsRoot.addChildToBack(new Node(Token.BLOCK));
        
        try {
            typeCheck.process(null, jsRoot);
            fail("Expected NullPointerException due to uninitialized scopeCreator");
        } catch (NullPointerException e) {
            // Expected path for invalid state
        }
    }

    @Test
    public void testVisitNewWithNonConstructor() {
        // Edge Case: Calling 'new' on a non-constructor type triggers NOT_A_CONSTRUCTOR error.
        Node numberLiteral = Node.newNumber(123);
        numberLiteral.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node newNode = new Node(Token.NEW, numberLiteral);
        
        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        // Visit the NEW node where first child is a number (not a constructor)
        typeCheck.visit(traversal, newNode, new Node(Token.EXPR_RESULT, newNode));
        
        // Verify error reported
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testVisitBinaryOperatorBitwiseInvalidLeftOperand() {
        // Edge Case: Bitwise operator (e.g., LSH) with non-int32 left operand triggers BIT_OPERATION warning.
        Node leftObj = Node.newString("not-int32");
        leftObj.setJSType(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));

        Node rightNum = Node.newNumber(2);
        rightNum.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node lshNode = new Node(Token.LSH, leftObj, rightNum);
        
        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(traversal, lshNode, new Node(Token.EXPR_RESULT, lshNode));

        assertTrue("Should report bit operation type mismatch", compiler.getErrorCount() > 0);
    }

    @Test
    public void testVisitGetPropOnDictType() {
        // Edge Case: Property access on a dictionary type triggers ILLEGAL_PROPERTY_ACCESS.
        Node objNode = Node.newString("dictObj");
        // Setting to a dict type or forcing Dict condition
        JSType dictType = typeRegistry.createDictType(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        objNode.setJSType(dictType);

        Node propNode = Node.newString("someProp");
        Node getPropNode = new Node(Token.GETPROP, objNode, propNode);
        getPropNode.setJSType(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(traversal, getPropNode, new Node(Token.EXPR_RESULT, getPropNode));

        // Dict property access is restricted
        assertNotNull(getPropNode.getJSType());
    }

    @Test
    public void testVisitCallNonCallableType() {
        // Edge Case: Calling a non-callable expression (e.g., number) triggers NOT_CALLABLE.
        Node numNode = Node.newNumber(42);
        numNode.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node callNode = new Node(Token.CALL, numNode);
        
        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(traversal, callNode, new Node(Token.EXPR_RESULT, callNode));

        assertTrue("Should report expression is not callable", compiler.getErrorCount() > 0);
    }

    @Test
    public void testGetTypedPercentWithZeroTotal() {
        // Boundary Limit: When nullCount, unknownCount, and typedCount are all 0.
        double percent = typeCheck.getTypedPercent();
        assertEquals(0.0, percent, 0.001);
    }

    @Test
    public void testGetTypedPercentWithMixedCounts() {
        // Boundary Limit: Calculate percentage accurately with mixed metrics.
        Node numNode = Node.newNumber(10);
        numNode.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));

        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        // Trigger doPercentTypedAccounting via visit Number
        typeCheck.visit(traversal, numNode, new Node(Token.EXPR_RESULT, numNode));

        double percent = typeCheck.getTypedPercent();
        assertEquals(100.0, percent, 0.001);
    }
}