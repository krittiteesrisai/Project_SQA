package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

public class ArrowTypeTest {

  private JSTypeRegistry registry;
  private JSType unknownType;
  private JSType numberType;
  private JSType stringType;

  @Before
  public void setUp() {
    ErrorReporter errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
  }

  @Test
  public void testConstructorsWithNulls() {
    ArrowType arrow = new ArrowType(registry, null, null, true);
    assertNotNull(arrow.parameters);
    assertEquals(unknownType, arrow.returnType);
    assertTrue(arrow.returnTypeInferred);

    ArrowType arrowDefault = new ArrowType(registry, null, null);
    assertNotNull(arrowDefault.parameters);
    assertEquals(unknownType, arrowDefault.returnType);
    assertFalse(arrowDefault.returnTypeInferred);
  }

  @Test
  public void testIsSubtype_NotAnArrowType() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertFalse(arrow.isSubtype(numberType));
  }

  @Test
  public void testIsSubtype_ReturnTypeCovariance() {
    ArrowType arrow1 = new ArrowType(registry, null, stringType);
    ArrowType arrow2 = new ArrowType(registry, null, numberType);
    
    // stringType is not a subtype of numberType
    assertFalse(arrow1.isSubtype(arrow2));
    
    ArrowType arrow3 = new ArrowType(registry, null, unknownType);
    assertTrue(arrow3.isSubtype(arrow1));
  }

  @Test
  public void testIsSubtype_ParameterContravarianceAndArity() {
    Node param1 = Node.newString(Token.NAME, "a");
    param1.setJSType(numberType);
    Node parameters1 = new Node(Token.LP, param1);

    Node param2 = Node.newString(Token.NAME, "b");
    param2.setJSType(stringType);
    Node parameters2 = new Node(Token.LP, param2);

    ArrowType arrowNum = new ArrowType(registry, parameters1, numberType);
    ArrowType arrowStr = new ArrowType(registry, parameters2, numberType);

    // Contravariant check: string parameter cannot substitute number parameter safely
    assertFalse(arrowNum.isSubtype(arrowStr));
  }

  @Test
  public void testIsSubtype_OptionalAndVarArgsTopFunction() {
    // Test top function handling when that is varargs with unknown/notype
    Node paramReq = Node.newString(Token.NAME, "a");
    paramReq.setJSType(numberType);
    Node paramsReq = new Node(Token.LP, paramReq);

    Node paramVar = Node.newString(Token.NAME, "v");
    paramVar.setIsVarArgs(true);
    paramVar.setJSType(unknownType);
    Node paramsVar = new Node(Token.LP, paramVar);

    ArrowType arrowReq = new ArrowType(registry, paramsReq, numberType);
    ArrowType arrowVar = new ArrowType(registry, paramsVar, numberType);

    // Should be allowed via isTopFunction special case
    assertTrue(arrowReq.isSubtype(arrowVar));
  }

  @Test
  public void testIsSubtype_MissingRequiredArgument() {
    Node param1 = Node.newString(Token.NAME, "a");
    param1.setJSType(numberType);
    Node params1 = new Node(Token.LP, param1);

    ArrowType arrowWithParam = new ArrowType(registry, params1, numberType);
    ArrowType arrowNoParam = new ArrowType(registry, null, numberType);

    // arrowWithParam requires a parameter, but arrowNoParam has none -> not a subtype
    assertFalse(arrowWithParam.isSubtype(arrowNoParam));
  }

  @Test
  public void testHasEqualParametersAndEquivalence() {
    Node param1 = Node.newString(Token.NAME, "a");
    param1.setJSType(numberType);
    Node params1 = new Node(Token.LP, param1);

    Node param2 = Node.newString(Token.NAME, "a");
    param2.setJSType(numberType);
    Node params2 = new Node(Token.LP, param2);

    ArrowType arrow1 = new ArrowType(registry, params1, numberType);
    ArrowType arrow2 = new ArrowType(registry, params2, numberType);

    assertTrue(arrow1.hasEqualParameters(arrow2, true));
    assertTrue(arrow1.checkArrowEquivalenceHelper(arrow2, false));
  }

  @Test
  public void testHashCode() {
    Node param1 = Node.newString(Token.NAME, "a");
    param1.setJSType(numberType);
    Node params1 = new Node(Token.LP, param1);

    ArrowType arrow1 = new ArrowType(registry, params1, numberType, true);
    int hash1 = arrow1.hashCode();
    assertTrue(hash1 != 0);

    ArrowType arrow2 = new ArrowType(registry, null, null, false);
    int hash2 = arrow2.hashCode();
    assertTrue(hash2 >= 0);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testUnsupportedOperations_GetLeastSupertype() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    arrow.getLeastSupertype(arrow);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testUnsupportedOperations_GetGreatestSubtype() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    arrow.getGreatestSubtype(arrow);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testUnsupportedOperations_TestForEquality() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    arrow.testForEquality(arrow);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testUnsupportedOperations_Visit() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    arrow.visit(null);
  }

  @Test
  public void testGetPossibleToBooleanOutcomes() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertEquals(BooleanLiteralSet.TRUE, arrow.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testHasUnknownParamsOrReturn() {
    ArrowType arrowUnknownReturn = new ArrowType(registry, null, null);
    assertTrue(arrowUnknownReturn.hasUnknownParamsOrReturn());

    Node param = Node.newString(Token.NAME, "a");
    param.setJSType(unknownType);
    Node params = new Node(Token.LP, param);
    ArrowType arrowUnknownParam = new ArrowType(registry, params, numberType);
    assertTrue(arrowUnknownParam.hasUnknownParamsOrReturn());
  }

  @Test
  public void testToStringHelper() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertEquals("[ArrowType]", arrow.toStringHelper(false));
  }

  @Test
  public void testResolveInternal() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    ErrorReporter reporter = new SimpleErrorReporter();
    JSType resolved = arrow.resolveInternal(reporter, null);
    assertNotNull(resolved);
  }

  @Test
  public void testHasAnyTemplateInternal() {
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertFalse(arrow.hasAnyTemplateInternal());
  }
}