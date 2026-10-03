package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit 4 Test class for InlineCostEstimator (Closure-28b).
 */
public class InlineCostEstimatorTest {

    @Test
    public void testGetCostBasicNode() {
        // ทดสอบการคำนวณต้นทุนโหนดตัวเลขธรรมดา
        Node node = Node.newNumber(10.0);
        int cost = InlineCostEstimator.getCost(node);
        assertTrue("Cost should be greater than 0", cost > 0);
    }

    @Test
    public void testGetCostWithThresholdNotExceeded() {
        // ทดสอบกรณี maxCost สูงกว่า cost จริง (False branch ของ maxCost <= cost)
        Node node = Node.newString("hello");
        int cost = InlineCostEstimator.getCost(node, 100);
        assertEquals(5, cost);
    }

    @Test
    public void testGetCostWithThresholdExceeded() {
        // ทดสอบกรณี maxCost น้อยกว่าหรือเท่ากับ cost จริง (True branch ของ maxCost <= cost)
        // เพื่อกระตุ้นให้ continueProcessing กลายเป็น false
        Node node = Node.newString("hellojavascript"); // ยาว 15 ตัวอักษร
        int cost = InlineCostEstimator.getCost(node, 5);
        // แม้ความยาวจริงจะ 15 แต่การประเมินจะหยุดกลางคันหรือบันทึกตามการ append
        assertTrue("Cost should be recorded and threshold respected", cost >= 5);
    }

    @Test
    public void testGetCostIdentifier() {
        // ทดสอบ Node ชนิด NAME ซึ่งจะถูกแปลงเป็น "ab" (cost = 2) ตามกฎ ESTIMATED_IDENTIFIER
        Node nameNode = Node.newString(Token.NAME, "someLongIdentifierName");
        int cost = InlineCostEstimator.getCost(nameNode);
        assertEquals("Identifiers should be estimated to 2 characters ('ab')", 2, cost);
    }

    @Test
    public void testGetCostMultipleNodes() {
        // ทดสอบโครงสร้าง Node แบบมีลูก (Parent-Child)
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(Node.newNumber(1));
        parent.addChildToBack(Node.newString(Token.NAME, "x"));

        int cost = InlineCostEstimator.getCost(parent);
        assertTrue("Parent cost should accumulate children costs", cost > 2);
    }

    @Test(expected = Exception.class)
    public void testGetCostNullRoot() {
        // Edge Case: ทดสอบการส่งค่า null เข้าไปเพื่อตรวจสอบความทนทาน (Robustness)
        InlineCostEstimator.getCost(null);
    }
}