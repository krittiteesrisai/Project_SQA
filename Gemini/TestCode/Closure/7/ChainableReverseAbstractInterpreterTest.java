package com.google.javascript.jscomp.type;

import static org.junit.Assert.*;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for ChainableReverseAbstractInterpreter.
 * Designed for Defects4J Closure-7b fault localization and condition/branch coverage.
 */
public class ChainableReverseAbstractInterpreterTest {

  private JSTypeRegistry typeRegistry;
  private CodingConvention convention;
  private ConcreteInterpreter interpreter;

  // Concrete subclass for testing abstract methods and protected functionality
  private static class ConcreteInterpreter extends ChainableReverseAbstractInterpreter {
    public ConcreteInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry) {
      super(convention, typeRegistry);
    }

    @Override
    public FlowScope getPreciserScopeKnowingConditionOutcome(
        Node condition, FlowScope blindScope, boolean outcome) {
      return blindScope;
    }
  }

  @Before
  public void setUp() {
    typeRegistry = new JSTypeRegistry(TestErrorReporter.noWarnings);
    convention = new GoogleCodingConvention();
    interpreter = new ConcreteInterpreter(convention, typeRegistry);
  }

  @Test
  public void testConstructorAndGetFirst() {
    assertNotNull(interpreter.getFirst());
    assertEquals(interpreter, interpreter.getFirst());
  }

  @Test
  public void testAppendValidAndChain() {
    ConcreteInterpreter nextInterpreter = new ConcreteInterpreter(convention, typeRegistry);
    ChainableReverseAbstractInterpreter lastLink = interpreter.append(nextInterpreter);
    
    assertEquals(nextInterpreter, lastLink);
    assertEquals(interpreter, nextInterpreter.getFirst());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAppendInvalidNextLink() {
    ConcreteInterpreter next1 = new ConcreteInterpreter(convention, typeRegistry);
    ConcreteInterpreter next2 = new ConcreteInterpreter(convention, typeRegistry);
    interpreter.append(next1);
    // next1 already has a nextLink (or rather, we simulate invalid state by forcing or chaining)
    // Actually, append expects lastLink.nextLink == null. Let's create a chain where next1 has a nextLink.
    ConcreteInterpreter next3 = new ConcreteInterpreter(convention, typeRegistry);
    next1.append(next3);
    
    // Trying to append next1 (which now has next2/next3 depending on structure) 
    // Wait, let's strictly violate: next1.nextLink != null by appending to it first, then trying to append it.
    ConcreteInterpreter another = new ConcreteInterpreter(convention, typeRegistry);
    next1.append(another); // next1 now has nextLink != null
    interpreter.append(next1); // Should throw IllegalArgumentException
  }

  @Test
  public void testNextPreciserScopeWithoutNextLink() {
    Node node = new Node(Token.TRUE);
    FlowScope scope = null;
    FlowScope result = interpreter.nextPreciserScopeKnowingConditionOutcome(node, scope, true);
    assertNull(result);
  }

  @Test
  public void testNextPreciserScopeWithNextLink() {
    ConcreteInterpreter nextInterpreter = new ConcreteInterpreter(convention, typeRegistry);
    interpreter.append(nextInterpreter);
    
    Node node = new Node(Token.TRUE);
    FlowScope scope = null;
    FlowScope result = interpreter.nextPreciserScopeKnowingConditionOutcome(node, scope, true);
    assertNull(result);
  }

  @Test
  public void testGetTypeIfRefinableNullNode() {
    // Edge case handling if getTypeIfRefinable encounters unsupported node types
    Node node = new Node(Token.NUMBER, 1.0);
    FlowScope scope = null;
    // Since our mock scope is null or we can pass a dummy scope if needed, 
    // but Token.NUMBER hits default return null.
    JSType result = interpreter.getTypeIfRefinable(node, scope);
    assertNull(result);
  }

  @Test
  public void testDeclareNameInScopeInvalidNodeThrowsException() {
    Node node = new Node(Token.NUMBER, 1.0); // Invalid node for refinement
    FlowScope scope = null;
    try {
      interpreter.declareNameInScope(scope, node, typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE));
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertTrue(e.getMessage().contains("Node cannot be refined"));
    }
  }

  @Test
  public void testGetRestrictedByTypeOfResultWithNullTypeAndTrue() {
    // type == null, resultEqualsValue == true, valid native type string
    JSType result = interpreter.getRestrictedByTypeOfResult(null, "number", true);
    assertNotNull(result);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultWithNullTypeAndTrueUnknownString() {
    // type == null, resultEqualsValue == true, unknown native type string -> CHECKED_UNKNOWN_TYPE
    JSType result = interpreter.getRestrictedByTypeOfResult(null, "custom_unknown", true);
    assertNotNull(result);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.CHECKED_UNKNOWN_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultWithNullTypeAndFalse() {
    // type == null, resultEqualsValue == false -> returns null
    JSType result = interpreter.getRestrictedByTypeOfResult(null, "number", false);
    assertNull(result);
  }

  @Test
  public void testGetRestrictedWithoutUndefinedAndNull() {
    JSType strType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
    
    JSType resUndefined = interpreter.getRestrictedWithoutUndefined(strType);
    assertNotNull(resUndefined);

    JSType resNull = interpreter.getRestrictedWithoutNull(strType);
    assertNotNull(resNull);

    // Test with null input
    assertNull(interpreter.getRestrictedWithoutUndefined(null));
    assertNull(interpreter.getRestrictedWithoutNull(null));
  }

  @Test
  public void testVisitorsViaGetRestrictedByTypeOfResult() {
    JSType allType = typeRegistry.getNativeType(JSTypeNative.ALL_TYPE);
    
    // Trigger RestrictByOneTypeOfResultVisitor cases
    assertNotNull(interpreter.getRestrictedByTypeOfResult(allType, "number", true));
    assertNotNull(interpreter.getRestrictedByTypeOfResult(allType, "boolean", true));
    assertNotNull(interpreter.getRestrictedByTypeOfResult(allType, "string", true));
    assertNotNull(interpreter.getRestrictedByTypeOfResult(allType, "undefined", true));
    assertNotNull(interpreter.getRestrictedByTypeOfResult(allType, "function", true));
    assertNotNull(interpreter.getRestrictedByTypeOfResult(allType, "object", true));

    // Test with Boolean type
    JSType boolType = typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    assertNotNull(interpreter.getRestrictedByTypeOfResult(boolType, "boolean", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(boolType, "number", true));

    // Test with Number type
    JSType numType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertNotNull(interpreter.getRestrictedByTypeOfResult(numType, "number", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(numType, "string", true));

    // Test with String type
    JSType strType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
    assertNotNull(interpreter.getRestrictedByTypeOfResult(strType, "string", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(strType, "boolean", true));

    // Test with Null type
    JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
    assertNotNull(interpreter.getRestrictedByTypeOfResult(nullType, "object", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(nullType, "string", true));

    // Test with Void type
    JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
    assertNotNull(interpreter.getRestrictedByTypeOfResult(voidType, "undefined", true));
    assertNull(interpreter.getRestrictedByTypeOfResult(voidType, "number", true));
  }
}