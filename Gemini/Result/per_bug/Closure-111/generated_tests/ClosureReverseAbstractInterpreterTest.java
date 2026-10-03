package com.google.javascript.jscomp.type;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ClosureReverseAbstractInterpreterTest extends TestCase {

  private JSTypeRegistry typeRegistry;
  private CodingConvention convention;
  private ClosureReverseAbstractInterpreter interpreter;
  private FlowScope blindScope;

  @Before
  public void setUp() throws Exception {
    typeRegistry = new JSTypeRegistry(TestErrorReporter.testErrorReporter);
    convention = new GoogleCodingConvention();
    interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
    
    // สร้าง Dummy FlowScope สำหรับใช้ทดสอบ
    Scope globalScope = new Scope(null, typeRegistry.getNativeType(JSTypeNative.NO_TYPE));
    blindScope = new FlowScope(globalScope);
  }

  @Test
  public void testConditionNotACall() {
    // Condition ไม่ใช่ Call Node (เช่น ชื่อตัวแปรธรรมดา)
    Node condition = Node.newString("goog.isDef");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testConditionInvalidChildCount() {
    // Call Node แต่มีจำนวน Child ไม่ใช่ 2 (เช่น goog.isDef())
    Node callee = Node.newGetProp(Node.newString("goog"), "isDef");
    Node condition = new Node(Token.CALL, callee);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testConditionNotGetPropAndQualifiedName() {
    // Callee ไม่ใช่ GetProp หรือ Param ไม่ใช่ QualifiedName
    Node callee = Node.newString("isDef");
    Node param = Node.newString("x");
    Node condition = new Node(Token.CALL, callee, param);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testConditionNotGoogNamespace() {
    // Namespace ไม่ใช่ "goog"
    Node callee = Node.newGetProp(Node.newString("notGoog"), "isDef");
    Node param = Node.newName("x");
    Node condition = new Node(Token.CALL, callee, param);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testUnknownRestricter() {
    // ฟังก์ชัน Closure ที่ไม่มีในระบบ restricters (เช่น goog.unknownFunc)
    Node callee = Node.newGetProp(Node.newString("goog"), "unknownFunc");
    Node param = Node.newName("x");
    Node condition = new Node(Token.CALL, callee, param);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testIsDefTrueAndFalse() {
    Node callee = Node.newGetProp(Node.newString("goog"), "isDef");
    Node param = Node.newName("x");
    Node condition = new Node(Token.CALL, callee, param);

    // Outcome = true
    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(resultTrue);

    // Outcome = false
    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(resultFalse);
  }

  @Test
  public void testIsNullTrueAndFalse() {
    Node callee = Node.newGetProp(Node.newString("goog"), "isNull");
    Node param = Node.newName("x");
    Node condition = new Node(Token.CALL, callee, param);

    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(resultTrue);

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(resultFalse);
  }

  @Test
  public void testIsDefAndNotNullTrueAndFalse() {
    Node callee = Node.newGetProp(Node.newString("goog"), "isDefAndNotNull");
    Node param = Node.newName("x");
    Node condition = new Node(Token.CALL, callee, param);

    FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(resultTrue);

    FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(resultFalse);
  }

  @Test
  public void testTypePrimitiveRestricters() {
    String[] methods = {"isString", "isBoolean", "isNumber", "isFunction"};
    for (String method : methods) {
      Node callee = Node.newGetProp(Node.newString("goog"), method);
      Node param = Node.newName("x");
      Node condition = new Node(Token.CALL, callee, param);

      assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true));
      assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false));
    }
  }

  @Test
  public void testIsArrayNullTypeAndNotNullType() {
    Node callee = Node.newGetProp(Node.newString("goog"), "isArray");
    Node param = Node.newName("x");
    Node condition = new Node(Token.CALL, callee, param);

    // ทดสอบเมื่อ paramType เป็น null (p.type == null)
    FlowScope res1 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    FlowScope res2 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(res1);
    assertNull(res2); // เพราะ outcome false และ type เป็น null จะคืนค่า null ทำให้ได้ blindScope กลับมา

    // กำหนด Type ให้พารามิเตอร์เพื่อทดสอบผ่าน Visitor
    blindScope.inferSlotType("x", typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
    FlowScope res3 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    FlowScope res4 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(res3);
    assertNotNull(res4);
  }

  @Test
  public void testIsObjectNullTypeAndNotNullType() {
    Node callee = Node.newGetProp(Node.newString("goog"), "isObject");
    Node param = Node.newName("x");
    Node condition = new Node(Token.CALL, callee, param);

    // ทดสอบเมื่อ p.type == null
    FlowScope res1 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    FlowScope res2 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(res1);
    assertNull(res2);

    // ทดสอบผ่าน Object Type และ Function Type Visitor
    blindScope.inferSlotType("x", typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE));
    FlowScope res3 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    FlowScope res4 = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
    assertNotNull(res3);
    assertNotNull(res4);
  }
}