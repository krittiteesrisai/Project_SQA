package com.google.javascript.jscomp;

import com.google.common.base.Function;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeNative;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage JUnit 4 Test Suite for ClosureReverseAbstractInterpreter.
 */
public class ClosureReverseAbstractInterpreterTest extends TestCase {

  private Compiler compiler;
  private JSTypeRegistry typeRegistry;
  private CodingConvention convention;
  private ClosureReverseAbstractInterpreter interpreter;
  private FlowScope blindScope;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    typeRegistry = compiler.getTypeRegistry();
    convention = new DefaultCodingConvention();
    interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
    
    // สร้าง Dummy FlowScope สำหรับใช้ในการทดสอบ
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(new Node(Token.BLOCK), true, true);
    blindScope = new FlowScope(cfg);
  }

  @Test
  public void testConditionNotCall() {
    // Condition ไม่ใช่ CALL (เช่น NAME)
    Node condition = Node.newString(Token.NAME, "x");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testCallWithInvalidChildCount() {
    // CALL แต่มีลูกแค่ 1 ตัว (ต้องการ 2)
    Node condition = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testCallNotGetPropAndQualifiedName() {
    // callee ไม่ใช่ GETPROP
    Node callee = Node.newString(Token.NAME, "goog");
    Node param = Node.newString(Token.NAME, "x");
    Node condition = new Node(Token.CALL, callee, param);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testUnknownRestricterFunction() {
    // ใช้ฟังก์ชันที่ไม่มีใน Map เช่น goog.isUnknown(x)
    Node left = Node.newString(Token.NAME, "goog");
    Node right = Node.newString(Token.STRING, "isUnknown");
    Node callee = new Node(Token.GETPROP, left, right);
    Node param = Node.newString(Token.NAME, "x");
    Node condition = new Node(Token.CALL, callee, param);
    
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsDefRestricterTrueAndFalse() {
    Node left = Node.newString(Token.NAME, "goog");
    Node right = Node.newString(Token.STRING, "isDef");
    Node callee = new Node(Token.GETPROP, left, right);
    Node param = Node.newString(Token.NAME, "x");
    Node condition = new Node(Token.CALL, callee, param);

    // Outcome = true
    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(resultTrue);

    // Outcome = false (ควรคืนค่า null จาก restricter ทำให้ได้ blindScope กลับมา)
    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertSame(blindScope, resultFalse);
  }

  @Test
  public void testIsNullRestricter() {
    Node left = Node.newString(Token.NAME, "goog");
    Node right = Node.newString(Token.STRING, "isNull");
    Node callee = new Node(Token.GETPROP, left, right);
    Node param = Node.newString(Token.NAME, "x");
    Node condition = new Node(Token.CALL, callee, param);

    // Outcome = true
    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(resultTrue);

    // Outcome = false
    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(resultFalse);
  }

  @Test
  public void testIsDefAndNotNullRestricter() {
    Node left = Node.newString(Token.NAME, "goog");
    Node right = Node.newString(Token.STRING, "isDefAndNotNull");
    Node callee = new Node(Token.GETPROP, left, right);
    Node param = Node.newString(Token.NAME, "x");
    Node condition = new Node(Token.CALL, callee, param);

    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(resultTrue);

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertSame(blindScope, resultFalse);
  }

  @Test
  public void testTypeSpecificRestrictersStringNumberBooleanFunction() {
    String[] methods = {"isString", "isBoolean", "isNumber", "isFunction"};
    for (String m : methods) {
      Node left = Node.newString(Token.NAME, "goog");
      Node right = Node.newString(Token.STRING, m);
      Node callee = new Node(Token.GETPROP, left, right);
      Node param = Node.newString(Token.NAME, "x");
      Node condition = new Node(Token.CALL, callee, param);

      assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true));
      assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false));
    }
  }

  @Test
  public void testIsArrayRestricterNullTypeAndVisitors() {
    Node left = Node.newString(Token.NAME, "goog");
    Node right = Node.newString(Token.STRING, "isArray");
    Node callee = new Node(Token.GETPROP, left, right);
    Node param = Node.newString(Token.NAME, "x");
    Node condition = new Node(Token.CALL, callee, param);

    // 1. p.type == null with outcome = true/false
    FlowScope res1 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(res1);
    FlowScope res2 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertSame(blindScope, res2);

    // 2. ทดสอบผ่าน Type จริงๆ เพื่อให้ Visitor (restrictToArrayVisitor, restrictToNotArrayVisitor) ทำงาน
    JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    blindScope.inferSlotType("x", unknownType);

    FlowScope res3 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(res3);
    FlowScope res4 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(res4);
  }

  @Test
  public void testIsObjectRestricterNullTypeAndVisitors() {
    Node left = Node.newString(Token.NAME, "goog");
    Node right = Node.newString(Token.STRING, "isObject");
    Node callee = new Node(Token.GETPROP, left, right);
    Node param = Node.newString(Token.NAME, "x");
    Node condition = new Node(Token.CALL, callee, param);

    // 1. p.type == null with outcome = true/false
    FlowScope res1 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(res1);
    FlowScope res2 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertSame(blindScope, res2);

    // 2. ทดสอบผ่าน Type จริงๆ เพื่อให้ Visitor (restrictToObjectVisitor, restrictToNotObjectVisitor) ทำงาน
    JSType objType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
    blindScope.inferSlotType("x", objType);

    FlowScope res3 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(res3);
    FlowScope res4 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(res4);
  }
}