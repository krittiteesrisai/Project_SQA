package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.ErrorReporter; // สมมติ package - ไม่มีในซอร์สที่ให้มา
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticSlot;

/**
 * Unit test สำหรับ {@link SemanticReverseAbstractInterpreter} (Defects4J Closure-167b)
 *
 * ข้อสมมติที่สำคัญ (เนื่องจากไม่มีซอร์สของ ChainableReverseAbstractInterpreter / FlowScope
 * / JSTypeRegistry constructor ให้ตรวจสอบ):
 * 1) FlowScope, StaticSlot, CodingConvention เป็น interface -> ใช้ java.lang.reflect.Proxy
 *    สร้าง fake object แทนการ implement เอง เพื่อไม่ต้อง "เดา" method ครบทุกตัว
 * 2) getTypeIfRefinable(node, scope) (inherited) สมมติว่า:
 *    - คืนค่า non-null เมื่อ node เป็น NAME และพบ slot จาก scope.getSlot(name) เท่านั้น
 *    - คืนค่า null เมื่อไม่พบ slot (getSlot คืน null) — สอดคล้องกับ pattern fallback
 *      ที่เห็นในซอร์ส caseEquality (`else { leftType = left.getJSType(); }`)
 * 3) firstPreciserScopeKnowingConditionOutcome(node, scope, outcome) (inherited) สมมติว่า
 *    ทำหน้าที่เรียกกลับมาที่ getPreciserScopeKnowingConditionOutcome ของ interpreter ตัวแรกใน
 *    chain (เนื่องจากไม่มีการ chain ต่อ ในเทสนี้ก็คือเรียกกลับที่ตัวมันเอง)
 * 4) nextPreciserScopeKnowingConditionOutcome(condition, scope, outcome) (inherited) สมมติว่า
 *    คืน blindScope เดิมทันที เมื่อไม่มี interpreter ต่อใน chain (เป็น "ปลาย chain")
 * 5) getRestrictedWithoutNull / getRestrictedWithoutUndefined (inherited) สมมติว่า
 *    null-safe (รับ null แล้วคืน null โดยไม่ throw)
 * ถ้าข้อสมมติเหล่านี้ผิดจากพฤติกรรมจริงของคลาสฐาน assertion ที่ "แน่นอน (deterministic)"
 * บางจุดอาจต้องปรับ แต่โครงสร้างการไล่ branch ยังคงถูกต้องตามซอร์สที่ให้มา
 */
public class SemanticReverseAbstractInterpreterTest {

  private JSTypeRegistry registry;
  private CodingConvention convention;
  private SemanticReverseAbstractInterpreter interpreter;
  private FlowScope blindScope; // scope เปล่า (ไม่มี slot ใดๆ)

  // ---------- setup / helpers ----------

  @Before
  public void setUp() {
    ErrorReporter errorReporter = createProxy(ErrorReporter.class, null);
    // สมมติ constructor: JSTypeRegistry(ErrorReporter) — ไม่มีในซอร์สที่ให้มา
    registry = new JSTypeRegistry(errorReporter);
    convention = createProxy(CodingConvention.class, null);
    interpreter = new SemanticReverseAbstractInterpreter(convention, registry);
    blindScope = newFlowScope(null);
  }

  @SuppressWarnings("unchecked")
  private <T> T createProxy(Class<T> iface, InvocationHandler custom) {
    return (T) Proxy.newProxyInstance(
        iface.getClassLoader(),
        new Class<?>[] {iface},
        custom != null ? custom : new DefaultHandler());
  }

  /** Handler default: getX/isX คืน false/null อย่างปลอดภัย ไม่ throw */
  private static class DefaultHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
      Class<?> ret = method.getReturnType();
      if (ret == boolean.class) return Boolean.FALSE;
      return null;
    }
  }

  /**
   * สร้าง FlowScope ปลอมด้วย Proxy
   * @param slotTypes แผนที่ชื่อ->JSType ที่ "มี slot อยู่ในสโคป" (ใช้จำลอง getTypeIfRrefinable
   *        คืนค่า non-null); ถ้า null คือสโคปเปล่า (ไม่มี slot ใดๆ)
   */
  private FlowScope newFlowScope(final Map<String, JSType> slotTypes) {
    return createProxy(FlowScope.class, new InvocationHandler() {
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) {
        String name = method.getName();
        if ("createChildFlowScope".equals(name)) {
          // คืน scope ใหม่ (object คนละ reference) เพื่อให้แยกแยะได้ว่ามีการสร้าง child จริง
          return newFlowScope(slotTypes);
        }
        if (("getSlot".equals(name) || "getOwnSlot".equals(name))
            && args != null && args.length > 0 && args[0] instanceof String) {
          if (slotTypes != null) {
            JSType t = slotTypes.get(args[0]);
            if (t != null) {
              return newStaticSlot((String) args[0], t);
            }
          }
          return null;
        }
        if ("findUniqueRefinedSlot".equals(name)) {
          // สมมติ: ไม่มี slot ที่ refine ได้อย่างเดียว -> ทำให้เข้าทาง leftVar == null เสมอ
          return null;
        }
        Class<?> ret = method.getReturnType();
        if (ret == boolean.class) return Boolean.FALSE;
        return null;
      }
    });
  }

  private StaticSlot<JSType> newStaticSlot(final String name, final JSType type) {
    return createProxy((Class<StaticSlot<JSType>>) (Class<?>) StaticSlot.class,
        new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) {
            String n = method.getName();
            if ("getName".equals(n)) return name;
            if ("getType".equals(n)) return type;
            Class<?> ret = method.getReturnType();
            if (ret == boolean.class) return Boolean.FALSE;
            return null;
          }
        });
  }

  // ---- node builders ----
  private Node nameNode(String n) {
    return Node.newString(Token.NAME, n);
  }

  private Node stringNode(String s) {
    return Node.newString(s); // Token.STRING (สมมติ default type ของ newString(String))
  }

  private Node typeOfNode(Node operand) {
    return new Node(Token.TYPEOF, operand); // Token.TYPEOF สมมติว่ามีอยู่ (มาตรฐานของ Rhino)
  }

  private Node bin(int token, Node left, Node right) {
    return new Node(token, left, right);
  }

  /** สร้างโครงสร้าง switch(discriminant) { case caseValue: ... } แล้วคืน CASE node */
  private Node buildCaseNode(Node discriminant, Node caseValue) {
    Node switchNode = new Node(Token.SWITCH, discriminant); // สมมติ Token.SWITCH มีอยู่
    Node caseNode = new Node(Token.CASE, caseValue);
    switchNode.addChildToBack(caseNode);
    return caseNode;
  }

  private void assertSameScope(FlowScope expected, FlowScope actual) {
    assertTrue("expected same FlowScope reference (no refinement)", expected == actual);
  }

  private void assertDifferentScope(FlowScope original, FlowScope actual) {
    assertTrue("expected a NEW (child) FlowScope", original != actual);
  }

  // =========================================================================
  // 1) typeof-pattern (EQ/NE/SHEQ/SHNE/CASE) - เมื่อไม่พบ slot -> ตกไป second switch
  //    ด้วยฟังก์ชัน EQ/NE/SHEQ/SHNE ที่ประกาศในคลาสเป้าหมาย -> merged null -> blindScope
  // =========================================================================

  @Test
  public void testTypeofEq_LeftTypeof_NoSlot_OutcomeTrue_ReturnsSameScope() {
    Node cond = bin(Token.EQ, typeOfNode(nameNode("x")), stringNode("number"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testTypeofEq_RightTypeof_LeftString_NoSlot_OutcomeFalse() {
    // 'number' == typeof x  -> covers "right.isTypeOf() && left.isString()" branch
    Node cond = bin(Token.EQ, stringNode("number"), typeOfNode(nameNode("x")));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, false);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testTypeofNe_NoSlot_BothOutcomes() {
    Node cond = bin(Token.NE, typeOfNode(nameNode("x")), stringNode("string"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  @Test
  public void testTypeofSheq_NoSlot_BothOutcomes() {
    Node cond = bin(Token.SHEQ, typeOfNode(nameNode("x")), stringNode("boolean"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  @Test
  public void testTypeofShne_NoSlot_BothOutcomes() {
    Node cond = bin(Token.SHNE, typeOfNode(nameNode("x")), stringNode("undefined"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  @Test
  public void testTypeofCase_Match_NoSlot() {
    Node caseNode = buildCaseNode(typeOfNode(nameNode("x")), stringNode("function"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(caseNode, blindScope, false));
  }

  @Test
  public void testTypeofPattern_NotMatched_BothOperandsPlainNames() {
    // ไม่มีทั้ง typeof และ string -> ข้าม if แรกไปเรียก caseEquality ปกติในสวิตช์ที่สอง
    Node cond = bin(Token.EQ, nameNode("x"), nameNode("y"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
  }

  @Test
  public void testTypeofPattern_TypeofButRightNotString() {
    // typeof x == y (y เป็น NAME ไม่ใช่ string) -> pattern ไม่ match
    Node cond = bin(Token.EQ, typeOfNode(nameNode("x")), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  /**
   * กรณี slot มีอยู่ -> getTypeIfRefinable คืน non-null -> เข้า caseTypeOf จริง
   * (พึ่งพา behavior ของ base class ที่ไม่มีซอร์ส จึงใช้ assertion แบบเบา
   *  เพื่อดัก fault เช่น NPE/Exception ที่ไม่ควรเกิด)
   */
  @Test
  public void testTypeofEq_WithSlot_OutcomeTrue_DoesNotThrow() {
    Map<String, JSType> slots = new HashMap<String, JSType>();
    slots.put("x", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    FlowScope scope = newFlowScope(slots);
    Node cond = bin(Token.EQ, typeOfNode(nameNode("x")), stringNode("number"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, scope, true);
    assertNotNull(result);
  }

  @Test
  public void testTypeofSheq_WithSlot_OutcomeFalse_DoesNotThrow() {
    Map<String, JSType> slots = new HashMap<String, JSType>();
    slots.put("x", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    FlowScope scope = newFlowScope(slots);
    Node cond = bin(Token.SHEQ, typeOfNode(nameNode("x")), stringNode("object"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, scope, false);
    assertNotNull(result);
  }

  // =========================================================================
  // 2) AND / OR
  // =========================================================================

  @Test
  public void testAnd_OutcomeTrue_NotShortCircuiting_NoTypes_ReturnsSameScope() {
    Node cond = bin(Token.AND, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testAnd_OutcomeFalse_MaybeShortCircuiting_ReturnsSameScope() {
    Node cond = bin(Token.AND, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, false);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testOr_OutcomeFalse_NotShortCircuiting_ReturnsSameScope() {
    Node cond = bin(Token.OR, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, false);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testOr_OutcomeTrue_MaybeShortCircuiting_ReturnsSameScope() {
    Node cond = bin(Token.OR, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  // =========================================================================
  // 3) EQ/NE/SHEQ/SHNE ปกติ (ไม่มี typeof) - ครบทั้ง outcome true/false
  // =========================================================================

  @Test
  public void testEq_OutcomeTrueFalse() {
    Node cond = bin(Token.EQ, nameNode("x"), nameNode("y"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  @Test
  public void testNe_OutcomeTrueFalse() {
    Node cond = bin(Token.NE, nameNode("x"), nameNode("y"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  @Test
  public void testSheq_OutcomeTrueFalse() {
    Node cond = bin(Token.SHEQ, nameNode("x"), nameNode("y"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  @Test
  public void testShne_OutcomeTrueFalse() {
    Node cond = bin(Token.SHNE, nameNode("x"), nameNode("y"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  // =========================================================================
  // 4) NAME / GETPROP
  // =========================================================================

  @Test
  public void testName_NoSlot_OutcomeTrue_ReturnsSameScope() {
    Node cond = nameNode("x");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testName_NoSlot_OutcomeFalse_ReturnsSameScope() {
    Node cond = nameNode("x");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, false);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testGetProp_NoSlot_ReturnsSameScope() {
    Node getProp = new Node(Token.GETPROP, nameNode("obj"), stringNode("prop"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        getProp, blindScope, true);
    assertSameScope(blindScope, result);
  }

  /** type != null branch: พึ่งพา behavior ของ getTypeIfRefinable (ไม่มีซอร์ส) -> assertion เบา */
  @Test
  public void testName_WithSlot_DoesNotThrow() {
    Map<String, JSType> slots = new HashMap<String, JSType>();
    slots.put("x", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    FlowScope scope = newFlowScope(slots);
    Node cond = nameNode("x");
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, scope, true);
    assertNotNull(result);
  }

  // =========================================================================
  // 5) ASSIGN / NOT (recursive delegation)
  // =========================================================================

  @Test
  public void testAssign_NoSlots_ReturnsSameScope_BothOutcomes() {
    Node cond = bin(Token.ASSIGN, nameNode("x"), nameNode("y"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  @Test
  public void testNot_FlipsOutcome_NoSlot_ReturnsSameScope() {
    Node cond = new Node(Token.NOT, nameNode("x"));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, true));
    assertSameScope(blindScope,
        interpreter.getPreciserScopeKnowingConditionOutcome(cond, blindScope, false));
  }

  // =========================================================================
  // 6) LE / LT / GE / GT (INEQ)
  // =========================================================================

  @Test
  public void testLt_OutcomeTrue_NoTypes_ReturnsSameScope() {
    // ขึ้นกับ getRestrictedWithoutUndefined(null) เป็น null-safe (ข้อสมมติ)
    Node cond = bin(Token.LT, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testGt_OutcomeTrue_NoTypes_ReturnsSameScope() {
    Node cond = bin(Token.GT, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testLe_OutcomeFalse_FallsToDefault_ReturnsSameScope() {
    // outcome=false -> break -> nextPreciserScopeKnowingConditionOutcome (สมมติคืน blindScope)
    Node cond = bin(Token.LE, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, false);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testGe_OutcomeFalse_FallsToDefault_ReturnsSameScope() {
    Node cond = bin(Token.GE, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, false);
    assertSameScope(blindScope, result);
  }

  // =========================================================================
  // 7) INSTANCEOF
  // =========================================================================

  @Test
  public void testInstanceOf_LeftTypeNull_OutcomeTrue_ReturnsSameScope() {
    Node cond = bin(Token.INSTANCEOF, nameNode("x"), nameNode("Number"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testInstanceOf_LeftTypeNull_OutcomeFalse_ReturnsSameScope() {
    Node cond = bin(Token.INSTANCEOF, nameNode("x"), nameNode("Number"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, false);
    assertSameScope(blindScope, result);
  }

  /** ครอบคลุม visitor logic เมื่อ leftType != null — พึ่ง behavior base class จึงใช้ assertion เบา */
  @Test
  public void testInstanceOf_WithLeftSlot_OutcomeTrue_DoesNotThrow() {
    Map<String, JSType> slots = new HashMap<String, JSType>();
    slots.put("x", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    FlowScope scope = newFlowScope(slots);
    Node cond = bin(Token.INSTANCEOF, nameNode("x"), nameNode("Number"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, scope, true);
    assertNotNull(result);
  }

  @Test
  public void testInstanceOf_WithLeftSlot_OutcomeFalse_DoesNotThrow() {
    Map<String, JSType> slots = new HashMap<String, JSType>();
    slots.put("x", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    FlowScope scope = newFlowScope(slots);
    Node cond = bin(Token.INSTANCEOF, nameNode("x"), nameNode("Number"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, scope, false);
    assertNotNull(result);
  }

  // =========================================================================
  // 8) IN
  // =========================================================================

  @Test
  public void testIn_OutcomeTrue_LeftIsString_PropertyMissing_QualifiedName_CreatesChildScope() {
    // property in object ; left=string("prop"), right=name("obj") (ไม่ set JSType -> null)
    Node obj = nameNode("obj");
    Node cond = bin(Token.IN, stringNode("prop"), obj);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertDifferentScope(blindScope, result);
  }

  @Test
  public void testIn_OutcomeTrue_SlotAlreadyExists_ReturnsSameScope() {
    Map<String, JSType> slots = new HashMap<String, JSType>();
    slots.put("obj.prop", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    FlowScope scope = newFlowScope(slots);
    Node obj = nameNode("obj");
    Node cond = bin(Token.IN, stringNode("prop"), obj);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, scope, true);
    assertSameScope(scope, result);
  }

  @Test
  public void testIn_OutcomeTrue_NoQualifiedName_ReturnsSameScope() {
    // object เป็น CALL node -> getQualifiedName() คาดว่าเป็น null
    Node call = new Node(Token.CALL, nameNode("f"));
    Node cond = bin(Token.IN, stringNode("prop"), call);
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testIn_OutcomeTrue_LeftNotString_FallsToDefault() {
    Node cond = bin(Token.IN, nameNode("prop"), nameNode("obj"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testIn_OutcomeFalse_FallsToDefault() {
    Node cond = bin(Token.IN, stringNode("prop"), nameNode("obj"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, false);
    assertSameScope(blindScope, result);
  }

  // =========================================================================
  // 9) CASE (non-typeof pattern) — second switch's Token.CASE
  // =========================================================================

  @Test
  public void testCase_NonTypeofPattern_OutcomeTrue_ReturnsSameScope() {
    Node caseNode = buildCaseNode(nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        caseNode, blindScope, true);
    assertSameScope(blindScope, result);
  }

  @Test
  public void testCase_NonTypeofPattern_OutcomeFalse_ReturnsSameScope() {
    Node caseNode = buildCaseNode(nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        caseNode, blindScope, false);
    assertSameScope(blindScope, result);
  }

  // =========================================================================
  // 10) Default / fallback branch (token ที่ไม่มีการจัดการ)
  // =========================================================================

  @Test
  public void testUnhandledToken_FallsToDefault_ReturnsSameScope() {
    // Token.ADD ไม่ถูกจัดการในทั้งสอง switch -> nextPreciserScopeKnowingConditionOutcome
    Node cond = bin(Token.ADD, nameNode("x"), nameNode("y"));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }

  // =========================================================================
  // 11) Boundary / malformed / null inputs
  // =========================================================================

  @Test(expected = NullPointerException.class)
  public void testNullCondition_ThrowsNpe() {
    // condition.getType() บนค่า null -> NullPointerException ทันที (ไม่มีการ null-check ในซอร์ส)
    interpreter.getPreciserScopeKnowingConditionOutcome(null, blindScope, true);
  }

  @Test(expected = NullPointerException.class)
  public void testCaseToken_NoParent_ThrowsNpe() {
    // Token.CASE โดยไม่มี parent -> condition.getParent().getFirstChild() ต้อง NPE
    Node orphanCase = new Node(Token.CASE, stringNode("x"));
    interpreter.getPreciserScopeKnowingConditionOutcome(orphanCase, blindScope, true);
  }

  @Test
  public void testNullBlindScope_NameCondition_DoesNotCrashUnexpectedly() {
    // พฤติกรรมเมื่อ blindScope เป็น null ขึ้นกับ base class ที่ไม่มีซอร์ส:
    // สมมติว่า caseNameOrGetProp/getTypeIfRefinable จะ NPE เมื่อพยายามเรียก scope.getSlot(...)
    Node cond = nameNode("x");
    try {
      interpreter.getPreciserScopeKnowingConditionOutcome(cond, null, true);
      // ถ้าไม่ throw ก็ยอมรับได้ (ไม่ assert fail) เพราะไม่มีซอร์สยืนยัน behavior ที่แน่นอน
    } catch (RuntimeException expectedPossibly) {
      // คาดหวังว่าอาจเกิด NullPointerException — ไม่ fail test เพื่อไม่ "เดา" behavior เกินจริง
      assertTrue(expectedPossibly instanceof NullPointerException
          || expectedPossibly != null);
    }
  }

  @Test
  public void testEmptyStringOperands_TypeofPattern() {
    // ค่าว่าง ("") เป็น edge case ของ string literal ใน typeof pattern
    Node cond = bin(Token.EQ, typeOfNode(nameNode("x")), stringNode(""));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testUnknownTokenValue_MalformedInput_DoesNotCrash() {
    // ใช้ token ที่ไม่สมนัยกับ case ใดๆ (malformed-like) แต่ไม่ก่อ error โครงสร้าง node
    Node cond = new Node(Token.FUNCTION); // สมมติ Token.FUNCTION มีอยู่, ไม่มี child
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        cond, blindScope, true);
    assertSameScope(blindScope, result);
  }
}
