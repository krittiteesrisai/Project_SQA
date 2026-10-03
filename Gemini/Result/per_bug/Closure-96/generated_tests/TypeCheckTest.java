package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for Defects4J Closure-96.
 * Target: TypeCheck class branch & condition coverage.
 */
public class TypeCheckTest {

    private Compiler compiler;
    private TypeCheck typeCheck;
    private JSTypeRegistry typeRegistry;
    private Scope topScope;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Setup basic compiler options / error man to avoid NPEs
        compiler.initOptions(new CompilerOptions());
        typeRegistry = compiler.getTypeRegistry();
        topScope = Scope.createGlobalScope(new Node(Token.BLOCK));
        
        typeCheck = new TypeCheck(
            compiler,
            compiler.getReverseAbstractInterpreter(),
            typeRegistry,
            topScope,
            new MemoizedScopeCreator(new TypedScopeCreator(compiler)),
            CheckLevel.WARNING,
            CheckLevel.WARNING
        );
    }

    @Test
    public void testProcessWithNullScopeCreatorOrTopScope() {
        TypeCheck invalidCheck = new TypeCheck(
            compiler,
            compiler.getReverseAbstractInterpreter(),
            typeRegistry,
            CheckLevel.WARNING,
            CheckLevel.WARNING
        );
        Node jsRoot = new Node(Token.SCRIPT);
        jsRoot.addChildToBack(new Node(Token.EXPR_RESULT, new Node(Token.NUMBER, 10.0)));
        
        try {
            invalidCheck.process(null, jsRoot);
            fail("Expected NullPointerException due to null scopeCreator or topScope");
        } catch (NullPointerException e) {
            // Expected Preconditions.checkNotNull(scopeCreator)
        }
    }

    @Test
    public void testVisitTrueAndFalseNodes() {
        Node trueNode = new Node(Token.TRUE);
        Node falseNode = new Node(Token.FALSE);
        Node parent = new Node(Token.EXPR_RESULT, trueNode);

        typeCheck.visit(null, trueNode, parent);
        typeCheck.visit(null, falseNode, parent);

        assertNotNull(trueNode.getJSType());
        assertNotNull(falseNode.getJSType());
    }

    @Test
    public void testVisitNumberAndStringNodes() {
        Node numNode = new Node(Token.NUMBER, 42.0);
        Node strNode = new Node(Token.STRING, "hello");
        Node parent = new Node(Token.EXPR_RESULT, numNode);

        typeCheck.visit(null, numNode, parent);
        typeCheck.visit(null, strNode, parent);

        assertNotNull(numNode.getJSType());
        assertNotNull(strNode.getJSType());
    }

    @Test
    public void testVisitObjectLitWithNumberAndString() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node numNode = new Node(Token.NUMBER, 1.0);
        objLit.addChildToBack(numNode);
        Node parent = new Node(Token.EXPR_RESULT, objLit);

        // When parent is OBJECTLIT, visit number/string should handle typeable = false branch
        typeCheck.visit(null, numNode, parent);
        assertNull(numNode.getJSType());
    }

    @Test
    public void testVisitBitNotWithNonInt32() {
        Node numNode = new Node(Token.NUMBER, 5.0);
        numNode.setJSType(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE)); // Force non-int32 context
        Node bitNot = new Node(Token.BITNOT, numNode);
        Node parent = new Node(Token.EXPR_RESULT, bitNot);

        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(traversal, bitNot, parent);

        assertNotNull(bitNot.getJSType());
    }

    @Test
    public void testVisitEqualityDeterministicTest() {
        Node left = new Node(Token.NUMBER, 1.0);
        left.setJSType(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = new Node(Token.STRING, "abc");
        right.setJSType(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));

        Node eqNode = new Node(Token.EQ, left, right);
        Node parent = new Node(Token.EXPR_RESULT, eqNode);

        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(traversal, eqNode, parent);

        assertNotNull(eqNode.getJSType());
    }

    @Test
    public void testVisitNewNonConstructor() {
        Node nonCtor = new Node(Token.STRING, "notAFunction");
        nonCtor.setJSType(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        Node newNode = new Node(Token.NEW, nonCtor);
        Node parent = new Node(Token.EXPR_RESULT, newNode);

        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(traversal, newNode, parent);

        assertNotNull(newNode.getJSType());
    }

    @Test
    public void testGetTypedPercentEdgeCases() {
        // Zero total nodes condition
        assertEquals(0.0, typeCheck.getTypedPercent(), 0.001);
    }
}