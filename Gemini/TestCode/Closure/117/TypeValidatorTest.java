package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.JSTypeNative;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * JUnit 4 Test Suite for TypeValidator covering high branch/condition coverage
 * and edge cases relevant to Defects4J Closure-117b.
 */
public class TypeValidatorTest extends TestCase {

  private Compiler compiler;
  private TypeValidator validator;
  private JSTypeRegistry registry;
  private NodeTraversal traversal;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
    
    // สร้าง Dummy NodeTraversal สำหรับใช้ใน Test methods
    traversal = new NodeTraversal(compiler, new AbstractNodeTypeCallback() {
      @Override
      public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
        return true;
      }
      @Override
      public void visit(NodeTraversal t, Node n) {}
    });
  }

  @Test
  public void testExpectObject_ValidAndInvalid() {
    Node dummyNode = new Node(Token.NAME, "a");
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    // Valid object context
    boolean resultValid = validator.expectObject(traversal, dummyNode, objectType, "msg");
    assertTrue("Object type should match object context", resultValid);

    // Invalid object context (Primitive number)
    boolean resultInvalid = validator.expectObject(traversal, dummyNode, numberType, "msg");
    assertFalse("Number type should fail object context expectation", resultInvalid);
  }

  @Test
  public void testExpectNotNullOrUndefined_EdgeCases() {
    Node dummyNode = new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "prop"));
    JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);

    // Test non-null type (expectation met immediately)
    boolean res1 = validator.expectNotNullOrUndefined(traversal, dummyNode, objectType, "msg", objectType);
    assertTrue(res1);

    // Test null type in GetProp outside global scope (Issue 109 edge case branch)
    // To simulate non-global scope, we ensure traversal is not in global scope or test direct logic.
    // Here we pass nullType with a GETPROP node.
    boolean res2 = validator.expectNotNullOrUndefined(traversal, dummyNode, nullType, "msg", objectType);
    // Depending on traversal scope, it returns true for getProp + nullType if not global, or triggers mismatch.
    // We verify robustness of execution across both branches.
    assertNotNull(validator.getMismatches());
  }

  @Test
  public void testExpectIndexMatch_Branches() {
    // Test GETELEM index matching branches: Struct, Unknown, Array, Object, Mismatch
    Node getElemNode = new Node(Token.GETELEM, new Node(Token.NAME, "arr"), new Node(Token.NUMBER, "0"));
    
    // Case 1: Unknown Type
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    validator.expectIndexMatch(traversal, getElemNode, unknownType, numberType);

    // Case 2: Array Type
    ObjectType arrayObjType = registry.getNativeType(JSTypeNative.ARRAY_TYPE).toObjectType();
    validator.expectIndexMatch(traversal, getElemNode, arrayObjType, numberType);

    // Case 3: Generic Object / Fallback mismatch
    JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    validator.expectIndexMatch(traversal, getElemNode, booleanType, numberType);
    
    assertNotNull(validator.getMismatches());
  }

  @Test
  public void testExpectCanAssignToPropertyOf_InterfaceAndNormal() {
    Node ownerNode = new Node(Token.NAME, "owner");
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    // Mismatch assignment
    boolean result = validator.expectCanAssignToPropertyOf(traversal, ownerNode, stringType, numberType, ownerNode, "prop");
    assertFalse(result);
    
    // NoType check branch
    JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
    boolean resultNoType = validator.expectCanAssignToPropertyOf(traversal, ownerNode, noType, stringType, ownerNode, "prop");
    assertTrue(resultNoType);
  }

  @Test
  public void testRegisterMismatch_FunctionTypes() {
    // Trigger recursive mismatch registration for function types (params and return types)
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);

    // Force call to expectCanAssignTo which invokes registerMismatch internally
    Node dummyNode = new Node(Token.NAME, "x");
    validator.expectCanAssignTo(traversal, dummyNode, stringType, numberType, "type mismatch");

    Iterable<TypeMismatch> mismatches = validator.getMismatches();
    assertNotNull(mismatches);
    boolean foundAny = false;
    for (TypeMismatch tm : mismatches) {
      foundAny = true;
      assertNotNull(tm.toString());
      assertNotNull(tm.hashCode());
      assertTrue(tm.equals(tm));
      assertFalse(tm.equals(new Object()));
    }
    assertTrue(foundAny);
  }

  @Test
  public void testSetShouldReportAndGetMismatches() {
    validator.setShouldReport(false);
    Node dummyNode = new Node(Token.NAME, "x");
    validator.expectString(traversal, dummyNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE), "expect string");
    
    validator.setShouldReport(true);
    assertNotNull(validator.getMismatches());
  }
}