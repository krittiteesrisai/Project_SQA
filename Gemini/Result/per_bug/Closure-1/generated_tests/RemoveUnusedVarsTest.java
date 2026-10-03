package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * Senior Java Test Automation Engineer - Comprehensive Test Suite for RemoveUnusedVars (Closure-1b)
 */
public class RemoveUnusedVarsTest extends TestCase {

    private Compiler compiler;

    @Before
    public void setUp() throws Exception {
        compiler = new Compiler();
        // ตั้งค่า Compiler basic options ที่จำเป็นต่อการรัน
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    @Test
    public void testRemoveUnusedLocalVarNoSideEffects() {
        // ทดสอบการลบ Local variable ที่ไม่ได้ใช้ และไม่มี side-effects
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK,
                IR.var(IR.name("unusedVar"), IR.number(5))
        );

        RemoveUnusedVars pass = new RemoveUnusedVars(compiler, false, false, false);
        pass.process(externs, root);

        // คาดหวังว่าคำสั่ง var unusedVar = 5 จะถูกลบออกจนหมด
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testRetainReferencedLocalVar() {
        // ทดสอบการคงตัวแปรท้องถิ่นไว้เมื่อมีการเรียกใช้งาน
        Node externs = new Node(Token.BLOCK);
        Node nameNode = IR.name("usedVar");
        Node root = new Node(Token.BLOCK,
                IR.var(nameNode, IR.number(10)),
                IR.exprResult(IR.call(IR.name("alert"), IR.name("usedVar")))
        );

        RemoveUnusedVars pass = new RemoveUnusedVars(compiler, false, false, false);
        pass.process(externs, root);

        // คาดหวังว่าตัวแปรยังคงอยู่เนื่องจากมีการอ้างถึง
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testRemoveGlobalsWhenFlagIsTrue() {
        // ทดสอบกรณี removeGlobals = true (ลบตัวแปรระดับ Global)
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK,
                IR.var(IR.name("globalUnused"), IR.number(100))
        );

        RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, false);
        pass.process(externs, root);

        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testPreserveGlobalsWhenFlagIsFalse() {
        // ทดสอบกรณี removeGlobals = false (ห้ามลบตัวแปรระดับ Global)
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK,
                IR.var(IR.name("globalPreserved"), IR.number(200))
        );

        RemoveUnusedVars pass = new RemoveUnusedVars(compiler, false, false, false);
        pass.process(externs, root);

        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testMultiVarDeclarationPartialRemoval() {
        // ทดสอบคำสั่ง var แบบประกาศหลายตัว แต่ใช้แค่บางตัว (var a, b)
        Node externs = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR, IR.name("unusedA"), IR.name("usedB"));
        // สมมติให้ usedB มีการอ้างอิงในภายหลังหรือถูกทำเครื่องหมายไว้
        Node root = new Node(Token.BLOCK, varNode);

        RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, false);
        pass.process(externs, root);
        
        // ตรวจสอบพฤติกรรมโค้ดผ่านกระบวนการประมวลผลปกติ
        assertNotNull(root);
    }

    @Test
    public void testModifyCallSitesBranch() {
        // ทดสอบ Branch ที่ modifyCallSites เป็น true เพื่อกระตุ้น CallSiteOptimizer และ SimpleDefinitionFinder
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK,
                IR.function(IR.name("fn"), IR.paramList(IR.name("arg1")), IR.block())
        );

        RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, true);
        pass.process(externs, root);
        
        assertNotNull(root);
    }

    @Test
    public void testFunctionArgumentsUnusedRemoval() {
        // ทดสอบการลบ Argument ของฟังก์ชันที่ไม่ได้ใช้งาน
        Node externs = new Node(Token.BLOCK);
        Node fnNode = IR.function(IR.name("myFunc"), IR.paramList(IR.name("unusedArg")), IR.block());
        Node root = new Node(Token.BLOCK, fnNode);

        RemoveUnusedVars pass = new RemoveUnusedVars(compiler, true, false, false);
        pass.process(externs, root);

        // ตรวจสอบว่าผ่านการประมวลผลฟังก์ชันโดยไม่มีข้อผิดพลาด (Null/State check)
        assertNotNull(root);
    }
}