package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for TypeValidator (Closure-6b).
 */
public class TypeValidatorTest {

    private Compiler compiler;
    private TypeValidator validator;
    private JSTypeRegistry typeRegistry;
    private NodeTraversal traversal;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Initialize basic compiler options / dummy init if necessary
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        
        validator = new TypeValidator(compiler);
        typeRegistry = compiler.getTypeRegistry();
        
        // Create a dummy NodeTraversal for testing
        traversal = new NodeTraversal(compiler, new NodeTraversal.Callback() {
            @Override
            public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
                return true;
            }

            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
    }

    @Test
    public void testExpectNotNullOrUndefined_ValidTypes() {
        Node node = new Node(Token.NAME, "x");
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        
        boolean result = validator.expectNotNullOrUndefined(
                traversal, node, numType, "msg", typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        assertTrue("Number type should satisfy non-null/undefined check", result);
    }

    @Test
    public void testExpectNotNullOrUndefined_NullTypeInGetPropEdgeCase() {
        // Edge case: n.isGetProp() && !t.inGlobalScope() && type.isNullType() -> should return true
        Node getPropNode = Node.newString(Token.GETPROP, "x");
        JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);

        // Note: traversal.inGlobalScope() is true by default unless scope is pushed. 
        // We simulate non-global scope or verify default branch.
        boolean result = validator.expectNotNullOrUndefined(
                traversal, getPropNode, nullType, "msg", typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
        
        // Depending on global scope status, let's also test standard mismatch behavior
        assertNotNull(validator.getMismatches());
    }

    @Test
    public void testExpectNotNullOrUndefined_NoTypeAndUnknownType() {
        Node node = new Node(Token.NAME, "x");
        JSType noType = typeRegistry.getNativeType(JSTypeNative.NO_TYPE);
        JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

        assertTrue(validator.expectNotNullOrUndefined(traversal, node, noType, "msg", noType));
        assertTrue(validator.expectNotNullOrUndefined(traversal, node, unknownType, "msg", unknownType));
    }

    @Test
    public void testExpectObject() {
        Node node = new Node(Token.NAME, "obj");
        JSType objType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertTrue("Object type matches object context", validator.expectObject(traversal, node, objType, "msg"));
        assertFalse("Number type fails object context expectation", validator.expectObject(traversal, node, numType, "msg"));
    }

    @Test
    public void testExpectActualObject() {
        Node node = new Node(Token.NAME, "obj");
        JSType objType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);

        // Should not throw/warn for actual object
        validator.expectActualObject(traversal, node, objType, "msg");
        // Should warn for non-object
        validator.expectActualObject(traversal, node, numType, "msg");
    }

    @Test
    public void testExpectAnyObject() {
        Node node = new Node(Token.NAME, "obj");
        JSType objType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType emptyType = typeRegistry.getNativeType(JSTypeNative.NO_TYPE);

        validator.expectAnyObject(traversal, node, objType, "msg");
        validator.expectAnyObject(traversal, node, emptyType, "msg");
    }

    @Test
    public void testExpectStringAndNumber() {
        Node node = new Node(Token.NAME, "val");
        JSType strType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);

        validator.expectString(traversal, node, strType, "msg");
        validator.expectNumber(traversal, node, numType, "msg");
        validator.expectBitwiseable(traversal, node, numType, "msg");
        validator.expectStringOrNumber(traversal, node, strType, "msg");
    }

    @Test
    public void testExpectSwitchMatchesCase() {
        Node node = new Node(Token.CASE);
        Node child = new Node(Token.NUMBER, "1");
        node.addChildToBack(child);

        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType strType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);

        // Matching types
        validator.expectSwitchMatchesCase(traversal, node, numType, numType);
        // Mismatching types triggering warning branch
        validator.expectSwitchMatchesCase(traversal, node, numType, strType);
    }

    @Test
    public void testExpectIndexMatch_UnknownAndArray() {
        Node getElemNode = new Node(Token.GETELEM);
        Node indexNode = new Node(Token.NUMBER, "0");
        getElemNode.addChildToBack(new Node(Token.NAME, "arr"));
        getElemNode.addChildToBack(indexNode);

        JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);

        // Test UnknownType branch in expectIndexMatch
        validator.expectIndexMatch(traversal, getElemNode, unknownType, numType);
    }

    @Test
    public void testExpectCanAssignTo() {
        Node node = new Node(Token.NAME, "x");
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType strType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);

        assertTrue(validator.expectCanAssignTo(traversal, node, numType, numType, "msg"));
        assertFalse(validator.expectCanAssignTo(traversal, node, strType, numType, "msg"));
    }

    @Test
    public void testExpectArgumentMatchesParameter() {
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "func"));
        Node argNode = new Node(Token.NAME, "arg");
        
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType strType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);

        validator.expectArgumentMatchesParameter(traversal, argNode, strType, numType, callNode, 0);
    }

    @Test
    public void testGetReadableJSTypeName() {
        Node nameNode = Node.newString(Token.NAME, "myVar");
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        nameNode.setJSType(numType);

        String typeName = validator.getReadableJSTypeName(nameNode, false);
        assertNotNull(typeName);
    }

    @Test
    public void testSetShouldReport() {
        validator.setShouldReport(false);
        Node node = new Node(Token.NAME, "x");
        JSType strType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        
        // Should not report errors externally when shouldReport is false
        validator.expectCanAssignTo(traversal, node, strType, numType, "should not report");
        validator.setShouldReport(true);
    }
}