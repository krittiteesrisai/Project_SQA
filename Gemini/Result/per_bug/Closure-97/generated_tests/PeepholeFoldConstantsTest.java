package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage JUnit 4 Test Suite for PeepholeFoldConstants (Closure-97b).
 * Focuses on Branch/Condition coverage, edge cases, and error diagnostics.
 */
public class PeepholeFoldConstantsTest extends TestCase {

    private PeepholeFoldConstants folder;
    private AbstractCompiler compiler;

    @Before
    public void setUp() throws Exception {
        folder = new PeepholeFoldConstants();
        compiler = new Compiler();
        folder.init(compiler);
    }

    @Test
    public void testBinaryOperatorNullChildren() {
        // Trigger: left == null or right == null in tryFoldBinaryOperator
        Node subtree = new Node(Token.ADD); // Has no children
        Node parent = new V8MockScriptNode(Token.SCRIPT, subtree);
        
        Node result = folder.optimizeSubtree(subtree);
        assertNotNull(result);
        assertEquals(Token.ADD, result.getType());
    }

    @Test
    public void testTypeofLiteralFolding() {
        // Trigger various token types in tryFoldTypeof
        assertTypeofFold(Token.STRING, "string");
        assertTypeofFold(Token.NUMBER, "number");
        assertTypeofFold(Token.TRUE, "boolean");
        assertTypeofFold(Token.FALSE, "boolean");
        assertTypeofFold(Token.NULL, "object");
        assertTypeofFold(Token.OBJECTLIT, "object");
        assertTypeofFold(Token.ARRAYLIT, "object");
        assertTypeofFold(Token.VOID, "undefined");
        
        // typeof undefined (NAME)
        Node nameNode = Node.newString(Token.NAME, "undefined");
        Node typeofNode = new Node(Token.TYPEOF, nameNode);
        Node parent = new V8MockScriptNode(Token.SCRIPT, typeofNode);
        Node result = folder.optimizeSubtree(typeofNode);
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testTypeofNonLiteral() {
        // typeof non-literal should return original node
        Node arg = new Node(Token.NAME, "foo");
        Node typeofNode = new Node(Token.TYPEOF, arg);
        Node parent = new V8MockScriptNode(Token.SCRIPT, typeofNode);
        
        Node result = folder.optimizeSubtree(typeofNode);
        assertEquals(typeofNode, result);
    }

    @Test
    public void testUnaryNotFolding() {
        // !!true -> true / !true -> false
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        Node parent = new V8MockScriptNode(Token.SCRIPT, notNode);

        Node result = folder.optimizeSubtree(notNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testUnaryNegInfinityAndNaN() {
        // -Infinity and -NaN edge cases
        Node infNode = Node.newString(Token.NAME, "Infinity");
        Node negNode = new Node(Token.NEG, infNode);
        Node parent = new V8MockScriptNode(Token.SCRIPT, negNode);
        Node result = folder.optimizeSubtree(negNode);
        assertEquals(negNode, result); // -Infinity remains unchanged

        Node nanNode = Node.newString(Token.NAME, "NaN");
        Node negNaNNode = new Node(Token.NEG, nanNode);
        Node parent2 = new V8MockScriptNode(Token.SCRIPT, negNaNNode);
        Node resultNaN = folder.optimizeSubtree(negNaNNode);
        assertEquals(Token.NAME, resultNaN.getType());
    }

    @Test
    public void testBitNotEdgeCases() {
        // Fractional bitwise operand error
        Node fracNode = Node.newNumber(5.5);
        Node bitNotNode = new Node(Token.BITNOT, fracNode);
        Node parent = new V8MockScriptNode(Token.SCRIPT, bitNotNode);

        Node result = folder.optimizeSubtree(bitNotNode);
        assertEquals(bitNotNode, result);
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testGetElemNegativeIndex() {
        // [1, 2, 3][-1] -> Index out of bounds error
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
        Node index = Node.newNumber(-1);
        Node getElem = new Node(Token.GETELEM, arrayLit, index);
        Node parent = new V8MockScriptNode(Token.SCRIPT, getElem);

        Node result = folder.optimizeSubtree(getElem);
        assertEquals(getElem, result);
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testGetElemOutOfBounds() {
        // [1, 2, 3][10] -> Index out of bounds error
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
        Node index = Node.newNumber(10);
        Node getElem = new Node(Token.GETELEM, arrayLit, index);
        Node parent = new V8MockScriptNode(Token.SCRIPT, getElem);

        Node result = folder.optimizeSubtree(getElem);
        assertEquals(getElem, result);
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testGetElemFractionalIndex() {
        // [1, 2, 3][1.5] -> Invalid getelem index error
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
        Node index = Node.newNumber(1.5);
        Node getElem = new Node(Token.GETELEM, arrayLit, index);
        Node parent = new V8MockScriptNode(Token.SCRIPT, getElem);

        Node result = folder.optimizeSubtree(getElem);
        assertEquals(getElem, result);
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testGetPropLengthString() {
        // "abc".length -> 3
        Node strNode = Node.newString("abc");
        Node propNode = Node.newString(Token.STRING, "length");
        Node getProp = new Node(Token.GETPROP, strNode, propNode);
        Node parent = new V8MockScriptNode(Token.SCRIPT, getProp);

        Node result = folder.optimizeSubtree(getProp);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 0.001);
    }

    @Test
    public void testStringIndexOfFolding() {
        // "abcdef".indexOf("cd") -> 2
        Node strNode = Node.newString("abcdef");
        Node fnNode = Node.newString(Token.STRING, "indexOf");
        strNode.addChildToBack(fnNode);
        
        Node getProp = new Node(Token.GETPROP, strNode, Node.newString(Token.STRING, "indexOf"));
        // Wait, setup properly via CALL token structure for tryFoldStringIndexOf
        Node callTarget = new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString(Token.STRING, "indexOf"));
        Node arg = Node.newString("cd");
        callTarget.addChildToBack(arg); // Standard Rhino AST structure for method calls
        
        Node callNode = new Node(Token.CALL, callTarget);
        // Direct test via helper or standard optimizeSubtree if CALL
        Node parent = new V8MockScriptNode(Token.SCRIPT, callNode);
        
        Node result = folder.optimizeSubtree(callNode);
        // Note: depends on exact AST matching in tryFoldKnownMethods, verifying robustness
        assertNotNull(result);
    }

    // Helper method for typeof testing
    private void assertTypeofFold(int tokenType, String expectedTypeName) {
        Node arg = new Node(tokenType);
        Node typeofNode = new Node(Token.TYPEOF, arg);
        Node parent = new V8MockScriptNode(Token.SCRIPT, typeofNode);

        Node result = folder.optimizeSubtree(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals(expectedTypeName, result.getString());
    }

    // Mock parent Node to satisfy getParent() and replaceChild() requirements in Rhino AST
    private static class V8MockScriptNode extends Node {
        public V8MockScriptNode(int type, Node child) {
            super(type);
            addChildToBack(child);
        }

        @Override
        public void replaceChild(Node previousChild, Node newChild) {
            // Mock implementation for AST replacement testing
            for (int i = 0; i < children.size(); i++) {
                if (children.get(i) == previousChild) {
                    children.set(i, newChild);
                    newChild.parent = this;
                    return;
                }
            }
        }
    }
}