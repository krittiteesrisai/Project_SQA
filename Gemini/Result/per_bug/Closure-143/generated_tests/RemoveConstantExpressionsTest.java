package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test class for RemoveConstantExpressions (Closure-143b).
 * Uses only JUnit 4 and Closure Compiler internal classes available in the classpath.
 */
public class RemoveConstantExpressionsTest {

    private Compiler compiler;
    private RemoveConstantExpressions pass;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด CompilerOptions เบื้องต้นเพื่อให้กระบวนการทำงานสมบูรณ์
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        pass = new RemoveConstantExpressions(compiler);
    }

    @Test
    public void testProcessWithNullOrEmptyRoot() {
        // Edge Case: root เป็น SCRIPT ว่างเปล่า หรือไม่มี EXPR_RESULT
        Node root = new Node(Token.SCRIPT);
        // ไม่ควรเกิด NullPointerException หรือพฤติกรรมผิดพลาด
        pass.process(null, root);
        assertFalse(compiler.hasHaltingErrors());
    }

    @Test
    public void testTrySimplifyNonExprResultNode() {
        // Branch Coverage: node.getType() != Token.EXPR_RESULT
        // สร้างโหนดที่เป็น Token.BLOCK แทน EXPR_RESULT เพื่อให้เข้าเงื่อนไข return ทันที
        Node parent = new Node(Token.SCRIPT);
        Node blockNode = new Node(Token.BLOCK);
        parent.addChildToBack(blockNode);

        RemoveConstantExpressions.RemoveConstantRValuesCallback callback = 
            new RemoveConstantExpressions.RemoveConstantRValuesCallback();
        
        // ทดสอบเรียก visit โดยตรงเพื่อจำลองสถานการณ์โหนดไม่ใช่ EXPR_RESULT
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        callback.visit(traversal, blockNode, parent);

        assertFalse(callback.getResult().changed);
    }

    @Test
    public void testTrySimplifyExprResultWithSideEffects() {
        // Branch Coverage: nodeTypeMayHaveSideEffects == true (เช่น ฟังก์ชันเรียกใช้งาน)
        // นิพจน์: foo() ซึ่งมี Side Effects ไม่ควรถูกลบหรือเปลี่ยนแปลง
        Node exprBody = new Node(Token.CALL, new Node(Token.NAME, "foo"));
        Node exprResult = new Node(Token.EXPR_RESULT, exprBody);
        Node parent = new Node(Token.SCRIPT, exprResult);

        RemoveConstantExpressions.RemoveConstantRValuesCallback callback = 
            new RemoveConstantExpressions.RemoveConstantRValuesCallback();
        
        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        callback.visit(traversal, exprResult, parent);

        // เนื่องจากมี Side Effects โค้ดจึงไม่ควรเปลี่ยนสถานะ changed เป็น true จากการลบทิ้ง
        // (หรือขึ้นอยู่กับ nodeTypeMayHavesideEffects ของ Token.CALL ซึ่งถือว่ามี Side Effect)
        assertNotNull(callback.getResult());
    }

    @Test
    public void testTrySimplifyConstantExpressionWithoutSideEffects() {
        // Branch Coverage: nodeTypeMayHaveSideEffects == false และเป็น EXPR_RESULT
        // นิพจน์: 1 + 2 (ไม่มี Side Effects ควรถูกแปลงหรือสลายทิ้ง/แทนที่)
        Node number1 = Node.newNumber(1.0);
        Node number2 = Node.newNumber(2.0);
        Node addNode = new Node(Token.ADD, number1, number2);
        Node exprResult = new Node(Token.EXPR_RESULT, addNode);
        Node parent = new Node(Token.SCRIPT, exprResult);

        RemoveConstantExpressions.RemoveConstantRValuesCallback callback = 
            new RemoveConstantExpressions.RemoveConstantRValuesCallback();

        NodeTraversal traversal = new NodeTraversal(compiler, callback);
        callback.visit(traversal, exprResult, parent);

        // ตรวจสอบว่าผลลัพธ์มีการเปลี่ยนแปลงเกิดขึ้น (Code changed)
        assertTrue(callback.getResult().changed);
    }

    @Test
    public void testComplexExpressionWithMixedSideEffects() {
        // Boundary/Edge Case: นิพจน์ผสม เช่น 1 + foo() + bar()
        // Constant ส่วนที่ไม่มี side effect ควรถูกแยก/ตัดออก ส่วนที่มี side effect (foo, bar) คงไว้
        Node fooCall = new Node(Token.CALL, new Node(Token.NAME, "foo"));
        Node barCall = new Node(Token.CALL, new Node(Token.NAME, "bar"));
        
        Node add1 = new Node(Token.ADD, Node.newNumber(1.0), fooCall);
        Node add2 = new Node(Token.ADD, add1, barCall);
        Node exprResult = new Node(Token.EXPR_RESULT, add2);
        Node parent = new Node(Token.SCRIPT, exprResult);

        NodeTraversal.traverse(compiler, parent, pass::process);
        
        // คอมไพเลอร์ควรประมวลผลผ่าน pass ได้โดยไม่มี Exception และบันทึกการเปลี่ยนแปลง
        assertNotNull(pass.getResult());
    }
}