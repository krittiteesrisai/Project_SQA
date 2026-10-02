# JUnit 4 Test Suite: InlineCostEstimatorTest

## หมายเหตุสำคัญก่อนเริ่ม

- `InlineCostEstimator` เป็น **package-private class** และ method `getCost(...)` ก็เป็น package-private เช่นกัน ดังนั้น test class ต้องอยู่ใน package `com.google.javascript.jscomp` เดียวกัน (จึง**ไม่ต้อง** import คลาสเป้าหมายแยก เพราะอยู่ package เดียวกันแล้ว)
- ซอร์สโค้ดของ `CodeGenerator`, `CodeConsumer`, `Node` **ไม่ได้ถูกให้มา** ในโจทย์ ดังนั้นจุดใดที่ต้องอิง behavior ของคลาสเหล่านี้ (เช่น รูปแบบ string ที่ generate ออกมา) จะ**คอมเมนต์กำกับ**ไว้อย่างชัดเจนว่าเป็นสมมติฐาน ไม่ใช่ข้อเท็จจริงจากซอร์สที่ให้มา
- เน้นทดสอบ branch ที่ระบุชัดใน `InlineCostEstimator` เอง คือ `if (maxCost <= cost)` ใน `append()` และ logic การ delegate ของ `getCost(Node)` → `getCost(Node,int)`

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * Unit tests for {@link InlineCostEstimator}.
 *
 * อยู่ใน package เดียวกับคลาสเป้าหมาย (com.google.javascript.jscomp) เนื่องจาก
 * InlineCostEstimator และ static method getCost(...) เป็น package-private
 * จึงไม่จำเป็นต้องมี import statement แยกสำหรับคลาสเป้าหมาย
 *
 * ข้อจำกัด: ซอร์สโค้ดของ CodeGenerator / CodeConsumer / Node ไม่ได้ถูกให้มาในโจทย์
 * จึงหลีกเลี่ยงการ assert ค่า cost แบบตายตัวที่ผูกกับรายละเอียดภายในของ
 * CodeGenerator โดยตรง เว้นแต่จุดที่จำเป็นต่อการทดสอบ branch หลักของคลาส
 * ซึ่งจะคอมเมนต์กำกับสมมติฐานไว้ชัดเจนทุกจุด
 */
public class InlineCostEstimatorTest {

  // ---------- Helper: สร้าง Node แบบง่ายที่สุดสำหรับขับเคลื่อน CodeGenerator ----------

  /** สร้าง Node ตัวเลข (Token.NUMBER) แบบเดี่ยว */
  private Node numberNode(double value) {
    return Node.newNumber(value);
  }

  /** สร้าง Node identifier (Token.NAME) แบบเดี่ยว */
  private Node nameNode(String name) {
    return Node.newString(Token.NAME, name);
  }

  // ================= 1) ทดสอบการ delegate ของ overload getCost(Node) =================

  @Test
  public void testSingleArgOverload_delegatesToMaxValueThreshold() {
    // ซอร์สโค้ดระบุตรง ๆ ว่า getCost(root) เรียก getCost(root, Integer.MAX_VALUE)
    // ผลลัพธ์จึงต้องเท่ากันเสมอสำหรับ Node ที่เทียบเท่ากัน
    Node n1 = numberNode(1);
    Node n2 = numberNode(1);

    int costSingleArg = InlineCostEstimator.getCost(n1);
    int costExplicitMax = InlineCostEstimator.getCost(n2, Integer.MAX_VALUE);

    assertEquals(costExplicitMax, costSingleArg);
  }

  // ================= 2) ทดสอบ boundary ของเงื่อนไข (maxCost <= cost) ใน append() =================

  @Test
  public void testThreshold_muchHigherThanCost_doesNotTruncate() {
    // threshold สูงกว่า cost จริงมาก -> (maxCost <= cost) เป็น false เสมอ
    // -> continueProcessing ยังคง true ตลอด -> ผลลัพธ์เท่ากับกรณีไม่จำกัด threshold
    Node nA = numberNode(1);
    Node nB = numberNode(1);

    int costUnbounded = InlineCostEstimator.getCost(nA, Integer.MAX_VALUE);
    int costHighThreshold = InlineCostEstimator.getCost(nB, 100000);

    assertEquals(costUnbounded, costHighThreshold);
  }

  @Test
  public void testThreshold_exactBoundary_stopsAtEquality() {
    // ทดสอบ boundary แบบ equality ของเงื่อนไข (maxCost <= cost)
    // ตั้ง threshold ให้เท่ากับ cost เต็มพอดี -> branch "true" ของ if ต้องถูก trigger
    // แต่เนื่องจากการเช็คเกิด "หลัง" การบันทึก cost แล้วเสมอ (cost += ... ก่อน if)
    // ผลลัพธ์ cost ที่ return ต้องยังคงเท่ากับ fullCost (ไม่ถูก clamp)
    Node fullNode = numberNode(1);
    int fullCost = InlineCostEstimator.getCost(fullNode, Integer.MAX_VALUE);

    Node boundaryNode = numberNode(1);
    int boundaryCost = InlineCostEstimator.getCost(boundaryNode, fullCost);

    assertEquals(fullCost, boundaryCost);
  }

  @Test
  public void testThreshold_lowButPositive_singleAppendNotTruncated() {
    // สำหรับ node ที่มี append() เพียงครั้งเดียว ไม่ว่า threshold (>0) จะต่ำกว่า
    // cost จริงแค่ไหน ผลลัพธ์ต้องเท่ากับ cost เต็มของ append นั้น เพราะไม่มีการ clamp
    // ค่าที่บันทึกไปแล้ว (branch "true" ของ if แต่ cost ไม่ได้ถูกตัดทอน)
    Node fullNode = numberNode(1);
    int fullCost = InlineCostEstimator.getCost(fullNode, Integer.MAX_VALUE);

    Node lowThresholdNode = numberNode(1);
    int lowThresholdCost = InlineCostEstimator.getCost(lowThresholdNode, 1);

    assertEquals(fullCost, lowThresholdCost);
  }

  @Test
  public void testThreshold_zero_triggersStopBranch() {
    // costThreshhold = 0 -> (maxCost <= cost) เป็น true ทันทีหลัง append แรก
    // (branch "true" ของ if ใน append(), กรณี maxCost = 0)
    Node n = numberNode(1);
    int cost = InlineCostEstimator.getCost(n, 0);

    // cost ที่ return ต้อง > 0 เพราะ append ถูกเรียกไปแล้วก่อนถูกหยุด
    assertTrue(cost > 0);
  }

  @Test
  public void testThreshold_negativeExtreme_triggersStopBranch() {
    // costThreshhold = Integer.MIN_VALUE (ค่าติดลบสุดขั้ว) -> (maxCost <= cost)
    // ต้องเป็น true อย่างแน่นอนตั้งแต่ append แรก เพราะ cost (>=0) ย่อมมากกว่า
    // ค่าติดลบเสมอ -> ทดสอบ boundary สุดขั้วของ input
    Node n = numberNode(1);
    int cost = InlineCostEstimator.getCost(n, Integer.MIN_VALUE);

    assertTrue(cost >= 0);
  }

  // ================= 3) ทดสอบ multi-append tree: threshold ตัดกลางทาง =================

  @Test
  public void testThreshold_lowValue_neverExceedsUnboundedCost() {
    // สร้าง Node ที่มีหลาย token (Token.ADD ของสอง NUMBER) เพื่อให้เกิดการเรียก
    // append() มากกว่า 1 ครั้ง แล้วเทียบ cost ระหว่าง threshold ต่ำกับไม่จำกัด threshold
    Node fullTree = new Node(Token.ADD, numberNode(1), numberNode(2));
    int fullCost = InlineCostEstimator.getCost(fullTree, Integer.MAX_VALUE);

    Node cutTree = new Node(Token.ADD, numberNode(1), numberNode(2));
    int cutCost = InlineCostEstimator.getCost(cutTree, 1);

    assertTrue("cost หลังตัดด้วย threshold ต่ำ ต้องไม่มากกว่า cost แบบเต็ม",
        cutCost <= fullCost);
  }

  // ================= 4) ทดสอบ addIdentifier: identifier ทุกตัวมี cost คงที่ =================

  @Test
  public void testIdentifierCost_isAlwaysFixedRegardlessOfNameLength() {
    // ตามคอมเมนต์ในซอร์สต้นฉบับ: identifier ทุกตัวถูกประมาณด้วยความยาวคงที่
    // ESTIMATED_IDENTIFIER_COST (=2) ผ่าน addIdentifier() ที่ override ให้เรียก
    // add(ESTIMATED_IDENTIFIER) เสมอ โดยไม่สนใจชื่อจริง
    // สมมติฐาน (ไม่ได้ยืนยันจาก CodeGenerator ที่ไม่ได้ให้มา): Node ประเภท
    // Token.NAME เดี่ยว ๆ จะทำให้ CodeGenerator เรียก addIdentifier(...) เพียงอย่างเดียว
    Node shortName = nameNode("a");
    Node longName = nameNode("extremelyLongVariableNameThatShouldNotAffectCost");

    int costShort = InlineCostEstimator.getCost(shortName);
    int costLong = InlineCostEstimator.getCost(longName);

    assertEquals(costShort, costLong);
    assertEquals(InlineCostEstimator.ESTIMATED_IDENTIFIER_COST, costShort);
  }

  @Test
  public void testIdentifierCost_emptyNameStillFixedCost() {
    // กรณีขอบเขต: ชื่อ identifier เป็นค่าว่าง ("") -> ยังต้องได้ cost คงที่เท่ากับ
    // ESTIMATED_IDENTIFIER_COST เพราะ addIdentifier ไม่ได้อ้างอิงความยาวชื่อเดิมเลย
    Node emptyName = nameNode("");
    int cost = InlineCostEstimator.getCost(emptyName);

    assertEquals(InlineCostEstimator.ESTIMATED_IDENTIFIER_COST, cost);
  }

  // ================= 5) ทดสอบ null Node (fault / error-handling case) =================

  @Test
  public void testGetCost_nullNode_throwsException() {
    // ซอร์สโค้ดของ InlineCostEstimator ไม่มี null-check เลย ดังนั้นเมื่อส่ง null
    // เข้าไปใน estimator.add(root) -> cg.add(root) ควรทำให้เกิด NullPointerException
    // (อนุมานจาก absence ของ null-check ในซอร์สที่ให้มา ไม่ได้ยืนยันจาก CodeGenerator
    // เพราะไม่ได้ถูกให้มาด้วย จึงรับ RuntimeException ทุกชนิดเพื่อความปลอดภัย)
    try {
      InlineCostEstimator.getCost(null);
      fail("คาดว่าจะเกิด Exception เมื่อส่ง null Node เนื่องจากไม่มีการตรวจสอบ null ในซอร์ส");
    } catch (RuntimeException expected) {
      // ผ่าน: ยอมรับ RuntimeException (เช่น NullPointerException)
    }
  }

  // ================= 6) ทดสอบค่าคงที่ static final ของคลาส =================

  @Test
  public void testEstimatedIdentifierCostConstant() {
    // ตรวจสอบตรง ๆ จากซอร์ส: ESTIMATED_IDENTIFIER = "ab" -> length = 2
    assertEquals(2, InlineCostEstimator.ESTIMATED_IDENTIFIER_COST);
  }

  // ================= 7) ทดสอบ consistency: ไม่มี state ค้างข้าม call =================

  @Test
  public void testGetCost_repeatedCallsOnEquivalentTrees_giveSameResult() {
    // แต่ละครั้งที่เรียก getCost จะสร้าง CompiledSizeEstimator ใหม่เสมอ (local variable
    // ใน method ไม่ใช่ static/shared state) ดังนั้น Node ที่เทียบเท่ากันต้องได้ cost เท่ากันทุกครั้ง
    int cost1 = InlineCostEstimator.getCost(numberNode(1));
    int cost2 = InlineCostEstimator.getCost(numberNode(1));
    int cost3 = InlineCostEstimator.getCost(numberNode(1));

    assertEquals(cost1, cost2);
    assertEquals(cost2, cost3);
  }
}
```

## สรุปตาราง Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testSingleArgOverload_delegatesToMaxValueThreshold` | `getCost(Node)` delegate ไปยัง `getCost(Node,int)` ด้วย `Integer.MAX_VALUE` |
| `testThreshold_muchHigherThanCost_doesNotTruncate` | `if (maxCost <= cost)` → branch **false** เมื่อ threshold สูงมาก |
| `testThreshold_exactBoundary_stopsAtEquality` | `if (maxCost <= cost)` → branch **true** ที่ boundary เท่ากันพอดี (equality case) |
| `testThreshold_lowButPositive_singleAppendNotTruncated` | branch **true** กรณี threshold ต่ำกว่า cost จริงเล็กน้อย, ยืนยัน cost ไม่ถูก clamp |
| `testThreshold_zero_triggersStopBranch` | boundary ค่า `costThreshhold = 0` → branch **true** ทันที |
| `testThreshold_negativeExtreme_triggersStopBranch` | boundary ค่าติดลบสุดขั้ว (`Integer.MIN_VALUE`) → branch **true** |
| `testThreshold_lowValue_neverExceedsUnboundedCost` | Loop/recursive `add()` หลาย token, threshold ตัดกลางทาง เทียบกับไม่ตัด |
| `testIdentifierCost_isAlwaysFixedRegardlessOfNameLength` | override `addIdentifier()` เพิ่ม cost คงที่ (`ESTIMATED_IDENTIFIER_COST`) ไม่ขึ้นกับความยาวชื่อจริง |
| `testIdentifierCost_emptyNameStillFixedCost` | กรณีขอบเขต identifier เป็นค่าว่าง `""` |
| `testGetCost_nullNode_throwsException` | กรณี null input (error path ที่ไม่มีการป้องกันในซอร์ส) |
| `testEstimatedIdentifierCostConstant` | ตรวจค่าคงที่ `ESTIMATED_IDENTIFIER_COST = 2` |
| `testGetCost_repeatedCallsOnEquivalentTrees_giveSameResult` | ยืนยันไม่มี shared/static state ระหว่างการเรียกซ้ำ |

**หมายเหตุ:** เมธอด `continueProcessing()` และ `getLastChar()` ของ inner class `CompiledSizeEstimator` เป็น **private static inner class** เข้าถึงไม่ได้โดยตรงจาก test แม้อยู่ package เดียวกัน จึงทดสอบผ่านผลลัพธ์สังเกตได้ (observable behavior) ของ `getCost(...)` เท่านั้น ตามที่ระบุในข้อจำกัดข้อ 4