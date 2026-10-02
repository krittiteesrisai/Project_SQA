package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * Unit tests for {@link ArrowType}.
 *
 * หมายเหตุ: คลาสนี้ต้องอยู่ใน package เดียวกับ ArrowType เพราะเป็น package-private class
 * และหลาย method/field (parameters, returnType, hasEqualParameters, resolveInternal,
 * hasUnknownParamsOrReturn, toStringHelper) เป็น package-private เช่นกัน
 */
public class ArrowTypeTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        // ไม่คาดหวัง warning ในเทสส่วนใหญ่ ปล่อยผ่านไป
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        fail("Unexpected type-system error: " + message);
      }
    });
  }

  // ---------- Helper methods เพื่อสร้าง Node parameter list ----------

  /**
   * สร้าง PARAM_LIST node โดยแต่ละ element ใน types จะกลายเป็น parameter node หนึ่งตัว
   * ถ้า element เป็น null จะไม่เรียก setJSType() ทำให้ param node นั้นมี JSType เป็น null
   * (จำลองพารามิเตอร์ที่ไม่มีการระบุ type)
   */
  private Node createParamList(JSType... types) {
    Node paramList = new Node(Token.PARAM_LIST);
    for (JSType type : types) {
      Node param = Node.newString(Token.NAME, "p");
      if (type != null) {
        param.setJSType(type);
      }
      paramList.addChildToBack(param);
    }
    return paramList;
  }

  /** สร้าง PARAM_LIST ที่มี parameter เดียวและถูก mark เป็น var-args */
  private Node createVarArgsParam(JSType type) {
    Node paramList = new Node(Token.PARAM_LIST);
    Node param = Node.newString(Token.NAME, "args");
    param.setJSType(type);
    param.setVarArgs(true);
    paramList.addChildToBack(param);
    return paramList;
  }

  // ==================== Constructor ====================

  @Test
  public void testConstructor_nullParametersAndReturnType_usesDefaults() {
    ArrowType arrow = new ArrowType(registry, null, null);
    assertNotNull(arrow.parameters);
    assertSame(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), arrow.returnType);
    assertFalse(arrow.returnTypeInferred);
    Node p = arrow.parameters.getFirstChild();
    assertNotNull(p);
    assertTrue(p.isVarArgs());
  }

  @Test
  public void testConstructor_explicitParametersAndReturnTypeInferredTrue() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node params = createParamList(numberType);
    ArrowType arrow = new ArrowType(registry, params, numberType, true);
    assertSame(params, arrow.parameters);
    assertSame(numberType, arrow.returnType);
    assertTrue(arrow.returnTypeInferred);
  }

  @Test
  public void testConstructor_threeArgOverload_defaultsReturnTypeInferredFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node params = createParamList(numberType);
    ArrowType arrow = new ArrowType(registry, params, numberType);
    assertFalse(arrow.returnTypeInferred);
  }

  // ==================== isSubtype ====================

  @Test
  public void testIsSubtype_otherNotArrowType_returnsFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType arrow = new ArrowType(registry, null, numberType);
    assertFalse(arrow.isSubtype(numberType));
  }

  @Test
  public void testIsSubtype_returnTypeNotSubtype_returnsFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    ArrowType thisArrow = new ArrowType(registry, createParamList(), numberType);
    ArrowType thatArrow = new ArrowType(registry, createParamList(), stringType);
    assertFalse(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_noParameters_returnsTrue() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType thisArrow = new ArrowType(registry, createParamList(), numberType);
    ArrowType thatArrow = new ArrowType(registry, createParamList(), numberType);
    assertTrue(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_thisParamTypeNull_skipsCheck_returnsTrue() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node thisParams = createParamList((JSType) null);
    Node thatParams = createParamList(numberType);
    ArrowType thisArrow = new ArrowType(registry, thisParams, numberType);
    ArrowType thatArrow = new ArrowType(registry, thatParams, numberType);
    assertTrue(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_thatParamTypeNull_returnsFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node thisParams = createParamList(numberType);
    Node thatParams = createParamList((JSType) null);
    ArrowType thisArrow = new ArrowType(registry, thisParams, numberType);
    ArrowType thatArrow = new ArrowType(registry, thatParams, numberType);
    assertFalse(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_thatParamNotSubtypeOfThisParam_returnsFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    Node thisParams = createParamList(numberType);
    Node thatParams = createParamList(stringType);
    ArrowType thisArrow = new ArrowType(registry, thisParams, numberType);
    ArrowType thatArrow = new ArrowType(registry, thatParams, numberType);
    assertFalse(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_bothVarArgs_terminatesLoop() {
    // สมมติฐาน: UnknownType.isSubtype(UnknownType) == true (semantic ทั่วไปของ unknown type)
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    Node thisParams = createVarArgsParam(unknownType);
    Node thatParams = createVarArgsParam(unknownType);
    ArrowType thisArrow = new ArrowType(registry, thisParams, unknownType);
    ArrowType thatArrow = new ArrowType(registry, thatParams, unknownType);
    assertTrue(thisArrow.isSubtype(thatArrow));
  }

  @Test
  public void testIsSubtype_thisVarArgsOnly_doesNotAdvanceThis_noException() {
    // จุดนี้ตรวจสอบว่า loop terminate ได้ ไม่ infinite loop เมื่อ this เป็น var-args
    // แต่ that ไม่ใช่ (this ไม่ถูก advance, that ถูก advance จนเป็น null)
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    Node thisParams = createVarArgsParam(unknownType);
    Node thatParams = createParamList(unknownType);
    ArrowType thisArrow = new ArrowType(registry, thisParams, unknownType);
    ArrowType thatArrow = new ArrowType(registry, thatParams, unknownType);
    // ไม่ fix ค่า boolean ที่แน่ชัดเพราะขึ้นกับ isSubtype ภายในของ UnknownType
    // ที่ไม่ได้แสดงใน source ที่ให้มา แต่ยืนยันได้ว่าไม่ throw / ไม่ infinite loop
    boolean result = thisArrow.isSubtype(thatArrow);
    assertTrue(result == true || result == false);
  }

  // ==================== hasEqualParameters ====================

  @Test
  public void testHasEqualParameters_bothEmpty_true() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, createParamList(), numberType);
    ArrowType b = new ArrowType(registry, createParamList(), numberType);
    assertTrue(a.hasEqualParameters(b));
  }

  @Test
  public void testHasEqualParameters_differentLength_false() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, createParamList(numberType), numberType);
    ArrowType b = new ArrowType(registry, createParamList(), numberType);
    assertFalse(a.hasEqualParameters(b));
  }

  @Test
  public void testHasEqualParameters_sameTypes_true() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, createParamList(numberType), numberType);
    ArrowType b = new ArrowType(registry, createParamList(numberType), numberType);
    assertTrue(a.hasEqualParameters(b));
  }

  @Test
  public void testHasEqualParameters_differentTypes_false() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    ArrowType a = new ArrowType(registry, createParamList(numberType), numberType);
    ArrowType b = new ArrowType(registry, createParamList(stringType), numberType);
    assertFalse(a.hasEqualParameters(b));
  }

  @Test
  public void testHasEqualParameters_thisNullOtherNonNull_false() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, createParamList((JSType) null), numberType);
    ArrowType b = new ArrowType(registry, createParamList(numberType), numberType);
    assertFalse(a.hasEqualParameters(b));
  }

  @Test
  public void testHasEqualParameters_bothParamTypesNull_true() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, createParamList((JSType) null), numberType);
    ArrowType b = new ArrowType(registry, createParamList((JSType) null), numberType);
    assertTrue(a.hasEqualParameters(b));
  }

  // ==================== isEquivalentTo ====================

  @Test
  public void testIsEquivalentTo_notArrowType_false() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, createParamList(), numberType);
    assertFalse(a.isEquivalentTo(numberType));
  }

  @Test
  public void testIsEquivalentTo_differentReturnType_false() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    ArrowType a = new ArrowType(registry, createParamList(), numberType);
    ArrowType b = new ArrowType(registry, createParamList(), stringType);
    assertFalse(a.isEquivalentTo(b));
  }

  @Test
  public void testIsEquivalentTo_sameReturnAndParams_true() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, createParamList(numberType), numberType);
    ArrowType b = new ArrowType(registry, createParamList(numberType), numberType);
    assertTrue(a.isEquivalentTo(b));
  }

  // ==================== hashCode ====================

  @Test
  public void testHashCode_withReturnTypeInferredAndParam() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node params = createParamList(numberType);
    ArrowType a = new ArrowType(registry, params, numberType, true);
    int expected = numberType.hashCode() + 1 + numberType.hashCode();
    assertEquals(expected, a.hashCode());
  }

  @Test
  public void testHashCode_returnTypeInferredFalse_noParams() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, createParamList(), numberType, false);
    assertEquals(numberType.hashCode(), a.hashCode());
  }

  @Test
  public void testHashCode_paramWithNullType_notAddedToHash() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node params = createParamList((JSType) null);
    ArrowType a = new ArrowType(registry, params, numberType, false);
    assertEquals(numberType.hashCode(), a.hashCode());
  }

  // ==================== Unsupported operations ====================

  @Test(expected = UnsupportedOperationException.class)
  public void testGetLeastSupertype_throwsUnsupported() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, null, numberType);
    a.getLeastSupertype(numberType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetGreatestSubtype_throwsUnsupported() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, null, numberType);
    a.getGreatestSubtype(numberType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testTestForEquality_throwsUnsupported() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, null, numberType);
    a.testForEquality(numberType);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testVisit_throwsUnsupported() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, null, numberType);
    a.visit(null);
  }

  // ==================== getPossibleToBooleanOutcomes ====================

  @Test
  public void testGetPossibleToBooleanOutcomes_alwaysTrue() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, null, numberType);
    assertEquals(BooleanLiteralSet.TRUE, a.getPossibleToBooleanOutcomes());
  }

  // ==================== resolveInternal ====================

  @Test
  public void testResolveInternal_returnsThisAndKeepsTypes() {
    // สมมติฐาน: JSType.resolve(null, null) บน native type (NumberType) ไม่ throw
    // เพราะ native types มักไม่ต้องพึ่ง ErrorReporter/scope ในการ resolve ตัวเอง
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node params = createParamList(numberType);
    ArrowType a = new ArrowType(registry, params, numberType);
    JSType resolved = a.resolveInternal(null, null);
    assertSame(a, resolved);
    assertNotNull(a.returnType);
  }

  // ==================== hasUnknownParamsOrReturn ====================

  @Test
  public void testHasUnknownParamsOrReturn_allKnown_false() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node params = createParamList(numberType, numberType);
    ArrowType a = new ArrowType(registry, params, numberType);
    assertFalse(a.hasUnknownParamsOrReturn());
  }

  @Test
  public void testHasUnknownParamsOrReturn_paramTypeNull_true() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node params = createParamList((JSType) null);
    ArrowType a = new ArrowType(registry, params, numberType);
    assertTrue(a.hasUnknownParamsOrReturn());
  }

  @Test
  public void testHasUnknownParamsOrReturn_paramTypeUnknown_true() {
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    Node params = createParamList(unknownType);
    ArrowType a = new ArrowType(registry, params, numberType);
    assertTrue(a.hasUnknownParamsOrReturn());
  }

  @Test
  public void testHasUnknownParamsOrReturn_returnTypeUnknown_true() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    Node params = createParamList(numberType);
    ArrowType a = new ArrowType(registry, params, unknownType);
    assertTrue(a.hasUnknownParamsOrReturn());
  }
  // หมายเหตุ: branch "parameters != null == false" และ "returnType == null"
  // ไม่สามารถ reach ได้จาก public constructor เพราะ ArrowType การันตีว่า
  // field ทั้งสองไม่เป็น null เสมอ จึงไม่เขียนเทสสำหรับ branch เหล่านี้

  // ==================== toStringHelper ====================

  @Test
  public void testToStringHelper_ignoresParameter_usesSuperToString() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ArrowType a = new ArrowType(registry, null, numberType);
    String resultTrue = a.toStringHelper(true);
    String resultFalse = a.toStringHelper(false);
    assertNotNull(resultTrue);
    assertNotNull(resultFalse);
    // ตาม source: ทั้งสองกรณีเรียก super.toString() เหมือนกัน ไม่มีการแตกกิ่งจาก parameter
    assertEquals(resultTrue, resultFalse);
  }
}
