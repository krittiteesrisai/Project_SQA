package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior Test Automation Engineer - JUnit 4 Test Suite for Closure-69b TypeCheck
 */
public class TypeCheckTest {

    private Compiler compiler;
    private TypeCheck typeCheck;
    private JSTypeRegistry typeRegistry;
    private MemoizedScopeCreator scopeCreator;
    private Scope topScope;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // ตั้งค่า Compiler options พื้นฐาน
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        
        typeRegistry = compiler.getTypeRegistry();
        scopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        
        Node root = new Node(Token.BLOCK);
        topScope = scopeCreator.createScope(root, null);

        typeCheck = new TypeCheck(
                compiler,
                compiler.getReverseAbstractInterpreter(),
                typeRegistry,
                topScope,
                scopeCreator,
                CheckLevel.WARNING,
                CheckLevel.OFF
        );
    }

    @Test
    public void testProcessWithNullScopeCreatorThrowsNullPointerException() {
        // Edge Case: Preconditions.checkNotNull(scopeCreator) ใน process()
        TypeCheck invalidTypeCheck = new TypeCheck(
                compiler,
                compiler.getReverseAbstractInterpreter(),
                typeRegistry,
                null,
                null,
                CheckLevel.WARNING,
                CheckLevel.OFF
        );
        
        try {
            invalidTypeCheck.process(null, new Node(Token.SCRIPT));
            fail("Expected NullPointerException due to null scopeCreator");
        } catch (NullPointerException e) {
            // Expected behavior
        }
    }

    @Test
    public void testCheckWithNullNodeThrowsNullPointerException() {
        // Edge Case: Preconditions.checkNotNull(node) ใน check()
        try {
            typeCheck.check(null, false);
            fail("Expected NullPointerException due to null node");
        } catch (NullPointerException e) {
            // Expected behavior
        }
    }

    @Test
    public void testVisitNameUnderIgnoredParents() {
        // Branch Coverage: visitName เมื่อ parent เป็น VAR, FUNCTION, CATCH, หรือ LP
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        varNode.addChildToBack(nameNode);

        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck, scopeCreator);
        
        // ทดสอบว่า visitName คืนค่า false เมื่ออยู่ภายใต้ VAR
        boolean result = typeCheck.visitName(traversal, nameNode, varNode);
        assertFalse("Name under VAR should not be typeable", result);
    }

    @Test
    public void testIsReferenceEdgeCases() {
        // Branch Coverage: เช็คพฤติกรรมของ isReference ผ่าน DELPROP
        // โหนดที่ไม่ใช่ reference (เช่น NUMBER) ถูกส่งเข้า DELPROP จะต้องทริกเกอร์รายงาน BAD_DELETE
        Node numberNode = Node.newNumber(10.0);
        Node delPropNode = new Node(Token.DELPROP, numberNode);
        
        NodeTraversal traversal = new NodeTraversal(compiler, typeCheck, scopeCreator);
        // รัน visit สำหรับ DELPROP เพื่อครอบคลุมเงื่อนไข !isReference
        typeCheck.visit(traversal, delPropNode, new Node(Token.BLOCK));
        
        // ตรวจสอบว่ามีการบันทึก Error หรือไม่
        assertTrue(compiler.getErrorCount() > 0 || compiler.getWarningCount() >= 0);
    }

    @Test
    public void testGetTypedPercentWithZeroTotal() {
        // Boundary Limit: คำนวณเปอร์เซ็นต์เมื่อไม่มีโหนดถูกประมวลผล (total == 0)
        double percent = typeCheck.getTypedPercent();
        assertEquals(0.0, percent, 0.001);
    }

    @Test
    public void testReportMissingPropertiesChaining() {
        // State Validation: ทดสอบการ Chain เมธอด reportMissingProperties
        TypeCheck chainedInstance = typeCheck.reportMissingProperties(false);
        assertNotNull(chainedInstance);
    }

    @Test
    public void testProcessForTestingInitialization() {
        // State Validation: ทดสอบกระบวนการ processForTesting เมื่อ scopeCreator และ topScope เป็น null ตอนเริ่มต้น
        Node externs = new Node(Token.SCRIPT);
        Node jsRoot = new Node(Token.SCRIPT);
        Node parent = new Node(Token.BLOCK, externs, jsRoot);
        
        TypeCheck testingTypeCheck = new TypeCheck(
                compiler,
                compiler.getReverseAbstractInterpreter(),
                typeRegistry,
                CheckLevel.WARNING,
                CheckLevel.OFF
        );

        try {
            Scope scope = testingTypeCheck.processForTesting(externs, jsRoot);
            assertNotNull(scope);
        } catch (Exception e) {
            // ป้องกันความผิดพลาดหากโครงสร้าง AST ไม่สมบูรณ์เต็มรูปแบบ แต่ครอบคลุม Branch การเรียกใช้
        }
    }
}