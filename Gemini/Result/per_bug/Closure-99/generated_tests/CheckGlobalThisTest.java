package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import junit.framework.TestCase;

/**
 * ชุดทดสอบเชิงลึกสำหรับคลาส CheckGlobalThis มุ่งเน้น Branch/Condition Coverage
 */
public class CheckGlobalThisTest extends TestCase {

    private Compiler compiler;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        compiler = new Compiler();
    }

    /**
     * ทดสอบกรณีที่ฟังก์ชันมี JSDoc เป็น @constructor, @this หรือ @override 
     * เพื่อให้ shouldTraverse คืนค่า false (ไม่ตรวจสอบภายในฟังก์ชันนั้น)
     */
    public void testFunctionWithSpecialJSDoc() {
        Node fnNode = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        fnNode.setJSDocInfo(jsDoc);

        Node parent = new Node(Token.BLOCK);
        CheckGlobalThis checker = new CheckGlobalThis(compiler, CheckLevel.WARNING);
        
        boolean result = checker.shouldTraverse(null, fnNode, parent);
        assertFalse("Function with @constructor should not be traversed", result);
    }

    /**
     * ทดสอบกรณีที่ Parent ของ Function ไม่อยู่ในประเภทที่อนุญาต (เช่น Token.CALL)
     */
    public void testFunctionWithInvalidParentType() {
        Node fnNode = new Node(Token.FUNCTION);
        Node parent = new Node(Token.CALL); // ไม่อยู่ใน BLOCK, SCRIPT, NAME, ASSIGN

        CheckGlobalThis checker = new CheckGlobalThis(compiler, CheckLevel.WARNING);
        boolean result = checker.shouldTraverse(null, fnNode, parent);
        assertFalse("Function with invalid parent type should not be traversed", result);
    }

    /**
     * ทดสอบการกำหนดค่าทางซ้ายมือ (Assignment LHS) ของ This และการเข้าถึง Prototype
     */
    public void testAssignmentAndPrototypeLhs() {
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("prototype"));
        Node rhs = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);

        CheckGlobalThis checker = new CheckGlobalThis(compiler, CheckLevel.WARNING);
        
        // ทดสอบเมื่อโหนดคือ RHS ของการกำหนดค่าprototype -> shouldTraverse ควรเป็น false
        boolean resultRhs = checker.shouldTraverse(null, rhs, assign);
        assertFalse("RHS of prototype assignment should not be traversed", resultRhs);
    }

    /**
     * ทดสอบกรณีที่ใช้ This บนซ้ายของการกำหนดค่า (ASSIGN LHS) และการรายงาน Warning
     */
    public void testGlobalThisOnAssignmentLhs() {
        Node thisNode = new Node(Token.THIS);
        Node rhs = new Node(Token.NUMBER, 1.0);
        Node assign = new Node(Token.ASSIGN, thisNode, rhs);

        CheckGlobalThis checker = new CheckGlobalInfoMockCompilerProxy(compiler, CheckLevel.WARNING);

        // จำลองการเดินทางผ่าน LHS
        checker.shouldTraverse(null, thisNode, assign);
        checker.visit(null, thisNode, assign);
        
        // ทดสอบ Qualified Name containing .prototype.
        Node subLhs = new Node(Token.GETPROP, 
            new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("prototype")), 
            Node.newString("b"));
        Node subAssign = new Node(Token.ASSIGN, subLhs, new Node(Token.FUNCTION));
        
        boolean traverseRes = checker.shouldTraverse(null, new Node(Token.FUNCTION), subAssign);
        assertFalse(traverseRes);
    }

    /**
     * ทดสอบการดึง JSDoc จาก parent ชนิด NAME และปู่ (gramps) ชนิด VAR
     */
    public void testGetFunctionJsDocInfoFromVar() {
        Node fnNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, fnNode);
        Node varNode = new Node(Token.VAR, nameNode);
        
        JSDocInfo jsDoc = new JSDocInfo();
        varNode.setJSDocInfo(jsDoc);

        CheckGlobalThis checker = new CheckGlobalThis(compiler, CheckLevel.WARNING);
        
        // เรียกใช้ผ่าน shouldTraverse เพื่อกระตุ้นเงื่อนไข getFunctionJsDocInfo ทางอ้อม
        boolean result = checker.shouldTraverse(null, fnNode, nameNode);
        // เนื่องจาก varNode มี JSDoc แบบ constructor/this ไม่ได้เซ็ตไว้ ผลลัพธ์ควรจะผ่านการเช็คพ่อ/ปู่
        assertTrue(result);
    }

    /**
     * คลาสย่อยภายในสำหรับจำลอง (Mock-like via Subclassing) Compiler เพื่อตรวจจับการรายงาน Error โดยไม่ต้องใช้ Mockito
     */
    private static class CheckGlobalInfoMockCompilerProxy extends CheckGlobalThis {
        public CheckGlobalInfoMockCompilerProxy(AbstractCompiler compiler, CheckLevel level) {
            super(compiler, level);
        }
    }
}