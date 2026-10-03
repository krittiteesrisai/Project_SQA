package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for TypeValidator (Defects4J Closure-154b).
 * Focuses on high branch/condition coverage and edge cases.
 */
public class TypeValidatorTest {

  private Compiler compiler;
  private TypeValidator validator;
  private JSTypeRegistry registry;
  private NodeTraversal traversal;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // Initialize basic compiler options if needed for error reporting
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
    
    // Create a dummy NodeTraversal for testing
    traversal = new NodeTraversal(compiler, new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
        return true;
      }
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
    });
  }

  @Test
  public void testExpectObjectWithValidAndInvalidTypes() {
    Node n = new Node(Token.NAME, "testNode");
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    // Valid object context
    boolean resultValid = validator.expectObject(traversal, n, objectType, "msg");
    assertTrue("Object type should pass expectObject", resultValid);

    // Invalid object context (triggers mismatch branch)
    boolean resultInvalid = validator.expectObject(traversal, n, numberType, "msg");
    assertFalse("Number type should fail expectObject", resultInvalid);
  }

  @Test
  public void testExpectActualObject() {
    Node n = new Node(Token.NAME, "testNode");
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);

    // Should pass
    validator.expectActualObject(traversal, n, objectType, "msg");

    // Should fail and log mismatch
    validator.expectActualObject(traversal, n, unknownType, "msg");
    assertNotNull(validator.getMismatches());
  }

  @Test
  public void testExpectAnyObject() {
    Node n = new Node(Token.NAME, "testNode");
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);

    validator.expectAnyObject(traversal, n, objectType, "msg");
    validator.expectAnyObject(traversal, n, noObjectType, "msg");
  }

  @Test
  public void testExpectStringAndNumber() {
    Node n = new Node(Token.NAME, "testNode");
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    validator.expectString(traversal, n, stringType, "msg");
    validator.expectNumber(traversal, n, numberType, "msg");
    validator.expectStringOrNumber(traversal, n, stringType, "msg");
    validator.expectBitwiseable(traversal, n, numberType, "msg");
  }

  @Test
  public void testExpectNotNullOrUndefinedEdgeCases() {
    Node n = new Node(Token.GETPROP, new Node(Token.NAME, "x"), new Node(Token.STRING, "foo"));
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);

    // Test Issue 109 edge case: GETPROP in non-global scope with null type should return true without error
    boolean result = validator.expectNotNullOrUndefined(traversal, n, nullType, "msg", registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    assertTrue("Should return true for Issue 109 edge case", result);
  }

  @Test
  public void testExpectIndexMatchBranches() {
    Node n = new Node(Token.GETELEM);
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

    // 1. objType is UnknownType
    validator.expectIndexMatch(traversal, n, unknownType, numberType);

    // 2. objType is ArrayType
    validator.expectIndexMatch(traversal, n, arrayType, numberType);

    // 3. Else fallback (invalid access type)
    validator.expectIndexMatch(traversal, n, booleanType, numberType);
  }

  @Test
  public void testExpectCanAssignToPropertyAndDirect() {
    Node n = new Node(Token.ASSIGN);
    Node owner = new Node(Token.NAME, "owner");
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    boolean canAssignProp = validator.expectCanAssignToPropertyOf(traversal, n, stringType, numberType, owner, "prop");
    assertFalse("String cannot be assigned to Number property", canAssignProp);

    boolean canAssignDirect = validator.expectCanAssignTo(traversal, n, stringType, numberType, "assignment error");
    assertFalse("String cannot be assigned to Number directly", canAssignDirect);
  }

  @Test
  public void testTypeMismatchEqualsAndHashCode() {
    JSType typeA = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType typeB = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    TypeValidator.TypeMismatch mismatch1 = new TypeValidator.TypeMismatch(typeA, typeB);
    TypeValidator.TypeMismatch mismatch2 = new TypeValidator.TypeMismatch(typeA, typeB);
    TypeValidator.TypeMismatch mismatchReverse = new TypeValidator.TypeMismatch(typeB, typeA);
    Object otherObj = new Object();

    assertEquals(mismatch1, mismatch2);
    assertEquals(mismatch1.hashCode(), mismatch2.hashCode());
    assertNotEquals(mismatch1, mismatchReverse);
    assertNotEquals(mismatch1, otherObj);
    assertNotNull(mismatch1.toString());
  }

  @Test
  public void testSetShouldReportAndGetMismatches() {
    validator.setShouldReport(false);
    assertFalse(validator.getMismatches().iterator().hasNext());
  }
}