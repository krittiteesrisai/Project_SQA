package com.google.javascript.jscomp.type;

import static org.junit.Assert.*;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;
import org.junit.Before;
import org.junit.Test;

public class ChainableReverseAbstractInterpreterTest {

  private JSTypeRegistry typeRegistry;
  private CodingConvention convention;
  private TestableInterpreter interpreter;

  // Concrete subclass เพื่อทดสอบคลาส Abstract
  private static class TestableInterpreter extends ChainableReverseAbstractInterpreter {
    public TestableInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry) {
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
    interpreter = new TestableInterpreter(convention, typeRegistry);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructorNullConvention() {
    new TestableInterpreter(null, typeRegistry);
  }

  @Test
  public void testAppendAndGetFirst() {
    TestableInterpreter second = new TestableInterpreter(convention, typeRegistry);
    ChainableReverseAbstractInterpreter result = interpreter.append(second);

    assertSame(second, result);
    assertSame(interpreter, second.getFirst());
    assertSame(interpreter, interpreter.getFirst());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAppendInvalidNextLink() {
    TestableInterpreter second = new TestableInterpreter(convention, typeRegistry);
    TestableInterpreter third = new TestableInterpreter(convention, typeRegistry);
    
    interpreter.append(second);
    // second มี nextLink แล้ว การนำมา append ซ้ำต้องโยน IllegalArgumentException
    interpreter.append(second); 
  }

  @Test
  public void testNextPreciserScopeWithoutNextLink() {
    Node node = new Node(Token.TRUE);
    FlowScope scope = null; // ทดสอบการส่งผ่าน blindScope
    FlowScope result = interpreter.nextPreciserScopeKnowingConditionOutcome(node, scope, true);
    assertNull(result);
  }

  @Test
  public void testNextPreciserScopeWithNextLink() {
    TestableInterpreter second = new TestableInterpreter(convention, typeRegistry);
    interpreter.append(second);

    Node node = new Node(Token.TRUE);
    FlowScope scope = null;
    FlowScope result = interpreter.nextPreciserScopeKnowingConditionOutcome(node, scope, true);
    assertNull(result);
  }

  @Test
  public void testGetTypeIfRefinableUnsupportedNode() {
    Node node = new Node(Token.NUMBER, 1.0);
    assertNull(interpreter.getTypeIfRefinable(node, null));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDeclareNameInScopeInvalidNode() {
    Node node = new Node(Token.NUMBER, 1.0);
    interpreter.declareNameInScope(null, node, null);
  }

  @Test
  public void testGetRestrictedWithoutUndefinedWithNull() {
    assertNull(interpreter.getRestrictedWithoutUndefined(null));
  }

  @Test
  public void testGetRestrictedWithoutNullWithNull() {
    assertNull(interpreter.getRestrictedWithoutNull(null));
  }

  @Test
  public void testGetRestrictedByTypeOfResultNullType() {
    // กรณี type == null และ resultEqualsValue เป็น true
    JSType restrictedTrue = interpreter.getRestrictedByTypeOfResult(null, "number", true);
    assertNotNull(restrictedTrue);

    // กรณี type == null และ resultEqualsValue เป็น false
    JSType restrictedFalse = interpreter.getRestrictedByTypeOfResult(null, "number", false);
    assertNull(restrictedFalse);

    // กรณี type == null และ typeName หาไม่พบ (unknown type value)
    JSType restrictedUnknown = interpreter.getRestrictedByTypeOfResult(null, "customUnknownType", true);
    assertNotNull(restrictedUnknown);
  }

  @Test
  public void testGetRestrictedByTypeOfResultEdgeCases() {
    // ทดสอบการจำกัดชนิดข้อมูลด้วย typeof result ต่างๆ
    JSType numType = typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
    
    JSType res1 = interpreter.getRestrictedByTypeOfResult(numType, "number", true);
    assertNotNull(res1);

    JSType res2 = interpreter.getRestrictedByTypeOfResult(numType, "string", true);
    assertNull(res2);

    JSType res3 = interpreter.getRestrictedByTypeOfResult(numType, "number", false);
    assertNull(res3);
  }
}