package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import com.google.javascript.rhino.jstype.BooleanLiteralSet;

import org.junit.Test;

/**
 * Unit tests for {@link TypeInference}.
 *
 * หมายเหตุสำคัญ:
 * TypeInference มี dependency สูงมาก (AbstractCompiler, ControlFlowGraph,
 * ReverseAbstractInterpreter, Scope, FlowScope ฯลฯ) และ method ส่วนใหญ่เป็น
 * private instance method ที่ทำงานบน Node/JSType ที่ผ่าน parser + type checker
 * เต็มรูปแบบมาก่อน เนื่องจาก classpath ที่กำหนดไม่มี mocking framework
 * (Mockito/EasyMock) และไม่มี CompilerTestCase ให้ใช้ จึงไม่สามารถ instantiate
 * TypeInference หรือเรียก private method ส่วนใหญ่แบบ isolate ได้อย่างสมเหตุสมผล
 * (จะกลายเป็น integration test ที่เกินขอบเขตของงานนี้)
 *
 * เมธอดเดียวที่เป็น pure logic, static, ไม่ต้องพึ่ง instance state และเข้าถึงได้
 * จาก test class ในแพ็กเกจเดียวกัน (package-private) คือ getBooleanOutcomes(...)
 * ซึ่งใช้ใน traverseShortCircuitingBinOp สำหรับคำนวณ ToBoolean outcome ของ && และ ||
 * จึงเป็นเป้าหมายหลักของชุดทดสอบนี้
 *
 * เนื่องจากไม่มี source code ของ BooleanLiteralSet ให้ตรวจสอบโดยตรง การ assert
 * บางกรณีจึงอิงคุณสมบัติทาง set-theory ที่ควร hold จริงตามชื่อ enum
 * (EMPTY = identity ของ union, BOTH = identity ของ intersection) ซึ่งปลอดภัยที่สุด
 * ส่วนกรณีที่อิงสมมติฐานเพิ่มเติม (TRUE/FALSE เป็นเซตแยกจากกัน) จะกำกับคอมเมนต์ไว้ชัดเจน
 */
public class TypeInferenceTest {

  // -------------------------------------------------------------------
  // กลุ่ม 1: left = EMPTY -> left.intersection(x) = EMPTY (identity)
  //          -> right.union(EMPTY) = right (EMPTY เป็น identity ของ union)
  // -------------------------------------------------------------------

  @Test
  public void testLeftEmpty_RightEmpty_ConditionTrue() {
    assertEquals(BooleanLiteralSet.EMPTY,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.EMPTY, BooleanLiteralSet.EMPTY, true));
  }

  @Test
  public void testLeftEmpty_RightTrue_ConditionTrue() {
    assertEquals(BooleanLiteralSet.TRUE,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.EMPTY, BooleanLiteralSet.TRUE, true));
  }

  @Test
  public void testLeftEmpty_RightFalse_ConditionFalse() {
    assertEquals(BooleanLiteralSet.FALSE,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.EMPTY, BooleanLiteralSet.FALSE, false));
  }

  @Test
  public void testLeftEmpty_RightBoth_ConditionTrue() {
    assertEquals(BooleanLiteralSet.BOTH,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.EMPTY, BooleanLiteralSet.BOTH, true));
  }

  // -------------------------------------------------------------------
  // กลุ่ม 2: right = BOTH (universal set) -> union กับ BOTH ต้องได้ BOTH เสมอ
  //          ไม่ว่า left/condition จะเป็นค่าใด
  // -------------------------------------------------------------------

  @Test
  public void testRightBoth_ConditionTrue_AlwaysReturnsBoth() {
    assertEquals(BooleanLiteralSet.BOTH,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.TRUE, BooleanLiteralSet.BOTH, true));
  }

  @Test
  public void testRightBoth_ConditionFalse_AlwaysReturnsBoth() {
    assertEquals(BooleanLiteralSet.BOTH,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.FALSE, BooleanLiteralSet.BOTH, false));
  }

  @Test
  public void testLeftBothRightBoth_ReturnsBoth() {
    assertEquals(BooleanLiteralSet.BOTH,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, true));
    assertEquals(BooleanLiteralSet.BOTH,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, false));
  }

  // -------------------------------------------------------------------
  // กลุ่ม 3: left = BOTH (identity ของ intersection) + right = EMPTY
  //          (identity ของ union) -> ผลลัพธ์ = get(!condition) ตรง ๆ
  //          ใช้ตรวจสอบว่า boolean condition ถูก negate อย่างถูกต้อง
  // -------------------------------------------------------------------

  @Test
  public void testLeftBoth_RightEmpty_ConditionTrue_ReturnsFalse() {
    // get(!true) = get(false) = FALSE
    assertEquals(BooleanLiteralSet.FALSE,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.BOTH, BooleanLiteralSet.EMPTY, true));
  }

  @Test
  public void testLeftBoth_RightEmpty_ConditionFalse_ReturnsTrue() {
    // get(!false) = get(true) = TRUE
    assertEquals(BooleanLiteralSet.TRUE,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.BOTH, BooleanLiteralSet.EMPTY, false));
  }

  // -------------------------------------------------------------------
  // กลุ่ม 4: จำลองสถานการณ์จริงของ && (traverseAnd, condition=true)
  //          และ || (traverseOr, condition=false)
  // หมายเหตุ: อิงสมมติฐานเพิ่มเติมว่า TRUE และ FALSE เป็นเซตที่แยกจากกัน
  // (disjoint) ตามความหมายของชื่อ enum - ไม่มี source ของ BooleanLiteralSet
  // ให้ยืนยันโดยตรง จึงกำกับไว้ชัดเจนตามข้อกำหนด
  // -------------------------------------------------------------------

  @Test
  public void testAndScenario_LeftTrueRightFalse_ConditionTrue() {
    // = FALSE.union(TRUE.intersection(get(false)=FALSE))
    // สมมติฐาน: TRUE ∩ FALSE = EMPTY  =>  FALSE.union(EMPTY) = FALSE
    assertEquals(BooleanLiteralSet.FALSE,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.TRUE, BooleanLiteralSet.FALSE, true));
  }

  @Test
  public void testOrScenario_LeftFalseRightTrue_ConditionFalse() {
    // = TRUE.union(FALSE.intersection(get(true)=TRUE))
    // สมมติฐาน: FALSE ∩ TRUE = EMPTY  =>  TRUE.union(EMPTY) = TRUE
    assertEquals(BooleanLiteralSet.TRUE,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.FALSE, BooleanLiteralSet.TRUE, false));
  }

  @Test
  public void testLeftTrueRightTrue_ConditionTrue() {
    // = TRUE.union(TRUE.intersection(get(false)=FALSE))
    // สมมติฐาน: TRUE ∩ FALSE = EMPTY  =>  TRUE.union(EMPTY) = TRUE
    assertEquals(BooleanLiteralSet.TRUE,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.TRUE, BooleanLiteralSet.TRUE, true));
  }

  @Test
  public void testLeftFalseRightFalse_ConditionFalse() {
    // = FALSE.union(FALSE.intersection(get(true)=TRUE))
    // สมมติฐาน: FALSE ∩ TRUE = EMPTY  =>  FALSE.union(EMPTY) = FALSE
    assertEquals(BooleanLiteralSet.FALSE,
        TypeInference.getBooleanOutcomes(
            BooleanLiteralSet.FALSE, BooleanLiteralSet.FALSE, false));
  }

  // -------------------------------------------------------------------
  // กลุ่ม 5: null / boundary input
  // ในซอร์สโค้ดจริงของ getBooleanOutcomes ไม่มี Preconditions.checkNotNull
  // ดังนั้นการส่ง null ควรทำให้เกิด NullPointerException จากการเรียก
  // instance method (intersection/union) บน reference ที่เป็น null
  // -------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testNullLeft_ThrowsNPE() {
    TypeInference.getBooleanOutcomes(null, BooleanLiteralSet.BOTH, true);
  }

  @Test(expected = NullPointerException.class)
  public void testNullRight_ThrowsNPE() {
    TypeInference.getBooleanOutcomes(BooleanLiteralSet.BOTH, null, true);
  }

  @Test(expected = NullPointerException.class)
  public void testBothNull_ThrowsNPE() {
    TypeInference.getBooleanOutcomes(null, null, false);
  }
}
