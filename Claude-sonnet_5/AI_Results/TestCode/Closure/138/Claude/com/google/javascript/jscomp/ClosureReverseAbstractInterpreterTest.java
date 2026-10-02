package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test สำหรับ {@link ClosureReverseAbstractInterpreter} (Defects4J Closure-138b)
 *
 * หมายเหตุ/ASSUMPTIONS (สำคัญ - อ่านก่อนใช้งาน):
 * 1) คลาสเป้าหมายเป็น package-private จึงวางไฟล์นี้ใน package เดียวกัน
 *    ไม่มี import คลาสเป้าหมายแบบ cross-package
 * 2) เมธอด/คลาสต่อไปนี้ไม่ได้อยู่ใน source ที่ให้มา แต่เป็น API มาตรฐานของโปรเจกต์
 *    ที่คลาสเป้าหมายพึ่งพาโดยอ้อม: Compiler#parseTestCode, TypedScopeCreator,
 *    TypedScope, LinkedFlowScope, ClosureCodingConvention
 *    หากซิกเนเจอร์จริงต่างจากนี้ในบางเวอร์ชัน ให้ปรับที่ helper scopeWithVar(...) เท่านั้น
 * 3) สมมติว่า ChainableReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome
 *    คืนค่า blindScope แบบไม่แก้ไข เมื่อไม่มี interpreter อื่นต่อ chain (ไม่มีการเรียก .chain(...))
 * 4) เมธอด inherited ที่ผลลัพธ์ไม่แน่นอนจาก source ที่ให้มา (getRestrictedWithoutUndefined,
 *    getRestrictedWithoutNull, getRestrictedByTypeOfResult, getTypeIfRefinable) จะถูกทดสอบ
 *    แบบ black-box (ตรวจว่าไม่ throw exception และคืนค่าที่สมเหตุสมผล) เท่านั้น
 */
public class ClosureReverseAbstractInterpreterTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private ClosureReverseAbstractInterpreter interpreter;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    // ASSUMPTION: ClosureCodingConvention มีอยู่ในเวอร์ชันนี้ของโปรเจกต์
    interpreter = new ClosureReverseAbstractInterpreter(
        new ClosureCodingConvention(), registry);
  }

  // ---------- Helpers ----------

  private Node googCall(String methodName, Node param) {
    Node googName = Node.newString(Token.NAME, "goog");
    Node prop = Node.newString(Token.STRING, methodName);
    Node getprop = new Node(Token.GETPROP, googName, prop);
    return new Node(Token.CALL, getprop, param);
  }

  private Node nameNode(String name) {
    return Node.newString(Token.NAME, name);
  }

  private JSType nativeType(JSTypeNative t) {
    return registry.getNativeType(t);
  }

  /**
   * ASSUMPTION: ใช้ TypedScopeCreator + LinkedFlowScope ตาม pattern มาตรฐานของโปรเจกต์
   * เพื่อสร้าง FlowScope ที่มีตัวแปร varName ประกาศพร้อมชนิด type
   */
  private FlowScope scopeWithVar(String varName, JSType type) {
    Node script = compiler.parseTestCode("var " + varName + ";");
    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    TypedScope globalScope = (TypedScope) creator.createScope(script, null);
    LinkedFlowScope flowScope = LinkedFlowScope.createEntryLattice(globalScope);
    flowScope.inferSlotType(varName, type);
    return flowScope;
  }

  // ---------- Sanity ----------

  @Test
  public void testConstructor_doesNotThrow() {
    assertNotNull(interpreter);
  }

  // ---------- Early-exit branches (ไม่แตะ blindScope เลย ตาม logic ของ source) ----------

  @Test
  public void testConditionNotCall_returnsBlindScopeUnchanged() {
    Node condition = nameNode("x"); // getType() != CALL
    FlowScope blindScope = null;    // ปลอดภัย: ไม่ควรถูก dereference ก่อน return ในเคสนี้
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testCallWithWrongChildCount_returnsBlindScopeUnchanged() {
    // goog.isDef() -> CALL มีลูกแค่ 1 (callee) ไม่ครบ 2
    Node googName = Node.newString(Token.NAME, "goog");
    Node prop = Node.newString(Token.STRING, "isDef");
    Node getprop = new Node(Token.GETPROP, googName, prop);
    Node call = new Node(Token.CALL, getprop); // childCount == 1
    FlowScope blindScope = null;
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testCalleeNotGetProp_returnsBlindScopeUnchanged() {
    // foo(x) -> callee เป็น NAME ไม่ใช่ GETPROP
    Node callee = nameNode("foo");
    Node param = nameNode("x");
    Node call = new Node(Token.CALL, callee, param);
    FlowScope blindScope = null;
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testParamNotQualifiedName_returnsBlindScopeUnchanged() {
    // goog.isDef(1) -> param เป็น NUMBER literal ไม่ใช่ qualified name
    Node param = Node.newNumber(1);
    Node call = googCall("isDef", param);
    FlowScope blindScope = null;
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testParamEmptyName_boundaryInput_returnsBlindScopeUnchanged() {
    // ค่าขอบเขต/ผิดรูปแบบ: ชื่อตัวแปรว่าง ไม่มีตัวแปรนี้ใน scope ไม่ว่ากรณีใด
    Node param = nameNode("");
    Node call = googCall("isDef", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(NUMBER_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertSame(blindScope, result);
  }

  // ---------- paramType == null (getTypeIfRefinable คืน null) ----------

  @Test
  public void testParamTypeNull_variableNotDeclaredInScope_returnsBlindScopeUnchanged() {
    Node param = nameNode("undeclaredVar");
    Node call = googCall("isDef", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(NUMBER_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertSame(blindScope, result);
  }

  // ---------- left ไม่ใช่ NAME "goog" ----------

  @Test
  public void testCalleeLeftIsGetProp_notGoogName_returnsBlindScopeUnchanged() {
    // foo.bar.isDef(x) -> left ของ callee เป็น GETPROP ไม่ใช่ NAME
    Node fooName = Node.newString(Token.NAME, "foo");
    Node barProp = Node.newString(Token.STRING, "bar");
    Node fooBar = new Node(Token.GETPROP, fooName, barProp);
    Node isDefProp = Node.newString(Token.STRING, "isDef");
    Node callee = new Node(Token.GETPROP, fooBar, isDefProp);
    Node param = nameNode("x");
    Node call = new Node(Token.CALL, callee, param);

    FlowScope blindScope = scopeWithVar("x", nativeType(NUMBER_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertSame(blindScope, result);
  }

  @Test
  public void testLeftNameNotGoog_returnsBlindScopeUnchanged() {
    // goog2.isDef(x) -> ชื่อไม่ใช่ "goog"
    Node param = nameNode("x");
    Node googName = Node.newString(Token.NAME, "goog2");
    Node prop = Node.newString(Token.STRING, "isDef");
    Node getprop = new Node(Token.GETPROP, googName, prop);
    Node call = new Node(Token.CALL, getprop, param);

    FlowScope blindScope = scopeWithVar("x", nativeType(NUMBER_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertSame(blindScope, result);
  }

  // ---------- restricter == null (ชื่อฟังก์ชันไม่รู้จัก) ----------

  @Test
  public void testUnknownGoogFunction_returnsBlindScopeUnchanged() {
    Node param = nameNode("x");
    Node call = googCall("isFoo", param); // ไม่มีใน restricters map
    FlowScope blindScope = scopeWithVar("x", nativeType(NUMBER_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertSame(blindScope, result);
  }

  // ---------- isDef ----------

  @Test
  public void testIsDef_outcomeTrue_returnsNonNullScope() {
    // getRestrictedWithoutUndefined เป็น inherited method ไม่รู้ผลลัพธ์ที่แน่ชัดจาก source
    Node param = nameNode("x");
    Node call = googCall("isDef", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(NUMBER_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsDef_outcomeFalse_alwaysReturnsBlindScopeUnchanged() {
    // ยืนยันได้จาก source: outcome=false -> "return null;" เสมอ
    Node param = nameNode("x");
    Node call = googCall("isDef", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(NUMBER_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, false);
    assertSame(blindScope, result);
  }

  // ---------- isNull ----------

  @Test
  public void testIsNull_outcomeTrue_alwaysReturnsNewScope() {
    // ยืนยันได้จาก source: outcome=true -> getNativeType(NULL_TYPE) ไม่เป็น null แน่นอน
    Node param = nameNode("x");
    Node call = googCall("isNull", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(OBJECT_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertNotSame(blindScope, result);
  }

  @Test
  public void testIsNull_outcomeFalse_returnsNonNullScope() {
    // getRestrictedWithoutNull เป็น inherited method ไม่รู้ผลลัพธ์ที่แน่ชัดจาก source
    Node param = nameNode("x");
    Node call = googCall("isNull", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(OBJECT_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, false);
    assertNotNull(result);
  }

  // ---------- isDefAndNotNull ----------

  @Test
  public void testIsDefAndNotNull_outcomeTrue_returnsNonNullScope() {
    Node param = nameNode("x");
    Node call = googCall("isDefAndNotNull", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(OBJECT_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsDefAndNotNull_outcomeFalse_alwaysReturnsBlindScopeUnchanged() {
    // ยืนยันได้จาก source: outcome=false -> "return null;" เสมอ
    Node param = nameNode("x");
    Node call = googCall("isDefAndNotNull", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(OBJECT_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, false);
    assertSame(blindScope, result);
  }

  // ---------- isArray ----------

  @Test
  public void testIsArray_outcomeTrue_arraySubtypeOfObject_restricted() {
    // ARRAY_TYPE ควรเป็น subtype ของ OBJECT_TYPE -> caseObjectType คืน arrayType (non-null)
    Node param = nameNode("x");
    Node call = googCall("isArray", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(OBJECT_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertNotSame(blindScope, result);
  }

  @Test
  public void testIsArray_outcomeFalse_arrayIsSelfSubtype_unchanged() {
    // type.isSubtype(ARRAY_TYPE) เมื่อ type คือ ARRAY_TYPE เอง ควรเป็น true -> คืน null
    Node param = nameNode("x");
    Node call = googCall("isArray", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(ARRAY_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, false);
    assertSame(blindScope, result);
  }

  // ---------- isObject (ObjectType) ----------

  @Test
  public void testIsObject_outcomeTrue_objectType_alwaysReturnsNewScope() {
    // ยืนยันได้จาก source: caseObjectType ของ restrictToObjectVisitor คืน type เดิม (non-null)
    Node param = nameNode("x");
    Node call = googCall("isObject", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(OBJECT_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertNotSame(blindScope, result);
  }

  @Test
  public void testIsObject_outcomeFalse_objectType_alwaysReturnsBlindScopeUnchanged() {
    // ยืนยันได้จาก source: caseObjectType ของ restrictToNotObjectVisitor คืน null เสมอ
    Node param = nameNode("x");
    Node call = googCall("isObject", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(OBJECT_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, false);
    assertSame(blindScope, result);
  }

  // ---------- isObject (FunctionType) ----------

  @Test
  public void testIsObject_outcomeTrue_functionType_alwaysReturnsNewScope() {
    // ยืนยันได้จาก source: caseFunctionType ของ restrictToObjectVisitor คืน type เดิม (non-null)
    Node param = nameNode("x");
    Node call = googCall("isObject", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(FUNCTION_INSTANCE_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertNotSame(blindScope, result);
  }

  @Test
  public void testIsObject_outcomeFalse_functionType_alwaysReturnsBlindScopeUnchanged() {
    // ยืนยันได้จาก source: caseFunctionType ของ restrictToNotObjectVisitor คืน null เสมอ
    Node param = nameNode("x");
    Node call = googCall("isObject", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(FUNCTION_INSTANCE_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, false);
    assertSame(blindScope, result);
  }

  // ---------- isString / isBoolean / isNumber / isFunction ----------
  // (พึ่งพา getRestrictedByTypeOfResult ซึ่ง inherited และไม่มีใน source ที่ให้มา
  //  จึงตรวจแบบ black-box ว่าไม่ throw exception และคืนค่า non-null)

  @Test
  public void testIsString_outcomeTrue_doesNotThrow() {
    Node param = nameNode("x");
    Node call = googCall("isString", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(STRING_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsBoolean_outcomeFalse_doesNotThrow() {
    Node param = nameNode("x");
    Node call = googCall("isBoolean", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(BOOLEAN_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsNumber_outcomeTrue_doesNotThrow() {
    Node param = nameNode("x");
    Node call = googCall("isNumber", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(NUMBER_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsFunction_outcomeFalse_doesNotThrow() {
    Node param = nameNode("x");
    Node call = googCall("isFunction", param);
    FlowScope blindScope = scopeWithVar("x", nativeType(OBJECT_TYPE));
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        call, blindScope, false);
    assertNotNull(result);
  }
}
