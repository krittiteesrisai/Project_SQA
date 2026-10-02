package com.google.javascript.jscomp;

// หมายเหตุ: ไม่ import com.google.javascript.jscomp.Normalize / VerifyConstants
// เพราะ NormalizeTest ถูกวางไว้ใน package เดียวกัน (จำเป็น เนื่องจาก Normalize
// เป็น package-private class)
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class NormalizeTest {

    // compiler = null เพราะ assertOnChange=true ทำให้ reportCodeChange() throw
    // ก่อนแตะ compiler เสมอ (ดู source: if(assertOnChange) throw ...; ไม่ถึง
    // compiler.reportCodeChange())
    private Normalize normalizeAssert;

    @Before
    public void setUp() {
        normalizeAssert = new Normalize(null, true);
    }

    // ---------------------------------------------------------------
    // Reflection helpers
    // ---------------------------------------------------------------

    private Object invoke(Object target, String methodName,
            Class<?>[] paramTypes, Object... args) throws Exception {
        Method m = Normalize.class.getDeclaredMethod(methodName, paramTypes);
        m.setAccessible(true);
        return m.invoke(target, args);
    }

    private void invokeExpectingCause(Class<? extends Throwable> expectedCause,
            Object target, String methodName, Class<?>[] paramTypes,
            Object... args) throws Exception {
        try {
            invoke(target, methodName, paramTypes, args);
            fail("Expected " + expectedCause.getName() + " to be thrown");
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            assertTrue("Expected cause " + expectedCause.getName()
                    + " but got " + cause,
                    expectedCause.isInstance(cause));
        }
    }

    // =================================================================
    // 1. visit(): WHILE -> FOR conversion
    // =================================================================

    @Test(expected = IllegalStateException.class)
    public void testVisit_WhileNode_ConvertsAndThrowsOnAssert() {
        Node cond = new Node(Token.BLOCK); // dummy expr placeholder
        Node body = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, cond, body);
        // t ไม่ถูกใช้เลยในสาขา WHILE ของ visit() จึงส่ง null ได้อย่างปลอดภัย
        normalizeAssert.visit(null, whileNode, null);
    }

    @Test
    public void testVisit_NonWhileNode_NoChangeNoException() {
        Node block = new Node(Token.BLOCK);
        normalizeAssert.visit(null, block, null);
        assertEquals(Token.BLOCK, block.getType());
    }

    @Test(expected = NullPointerException.class)
    public void testVisit_NullNode_ThrowsNPE() {
        normalizeAssert.visit(null, null, null);
    }

    // =================================================================
    // 2. shouldTraverse() / doStatementNormalizations() branch coverage
    // =================================================================

    @Test
    public void testShouldTraverse_AlwaysReturnsTrue_PlainNode() {
        Node name = new Node(Token.NAME);
        boolean result = normalizeAssert.shouldTraverse(null, name, null);
        assertTrue(result);
    }

    @Test
    public void testShouldTraverse_BlockNode_StatementBlockBranch_NoOp() {
        // BLOCK ว่าง -> isStatementBlock(true) -> extractForInitializer / 
        // splitVarDeclarations ถูกเรียกแต่ไม่มี children ให้ประมวลผล -> ไม่ throw
        Node block = new Node(Token.BLOCK);
        boolean result = normalizeAssert.shouldTraverse(null, block, null);
        assertTrue(result);
    }

    @Test
    public void testShouldTraverse_LabelNode_NormalizeLabelsAndExtractBranch_NoOp() {
        // LABEL ที่มี last child เป็น BLOCK -> normalizeLabels ไม่ทำอะไร (case BLOCK)
        // และ extractForInitializer ไม่พบ FOR/LABEL ใน children -> ไม่มีการเปลี่ยนแปลง
        Node label = new Node(Token.LABEL, new Node(Token.NAME), new Node(Token.BLOCK));
        boolean result = normalizeAssert.shouldTraverse(null, label, null);
        assertTrue(result);
    }

    @Test
    public void testShouldTraverse_FunctionNode_EmptyBody_NoOp() {
        // FUNCTION branch -> moveNamedFunctions(body) ; body ว่าง -> current=null
        // -> while loop ไม่ execute -> ไม่มีการเรียก NodeUtil.isFunctionDeclaration เลย
        Node body = new Node(Token.BLOCK);
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME), body);
        boolean result = normalizeAssert.shouldTraverse(null, functionNode, null);
        assertTrue(result);
    }

    @Test(expected = NullPointerException.class)
    public void testShouldTraverse_NullNode_ThrowsNPE() {
        normalizeAssert.shouldTraverse(null, null, null);
    }

    // =================================================================
    // 3. normalizeLabels(Node n) -- via reflection
    // =================================================================

    @Test
    public void testNormalizeLabels_LastChildIsBlock_NoChange() throws Exception {
        Node label = new Node(Token.LABEL, new Node(Token.NAME), new Node(Token.BLOCK));
        invoke(normalizeAssert, "normalizeLabels", new Class[]{Node.class}, label);
        assertEquals(Token.BLOCK, label.getLastChild().getType());
    }

    @Test
    public void testNormalizeLabels_LastChildIsFor_NoChange() throws Exception {
        Node label = new Node(Token.LABEL, new Node(Token.NAME), new Node(Token.FOR));
        invoke(normalizeAssert, "normalizeLabels", new Class[]{Node.class}, label);
        assertEquals(Token.FOR, label.getLastChild().getType());
    }

    @Test
    public void testNormalizeLabels_LastChildIsWhile_NoChange() throws Exception {
        Node label = new Node(Token.LABEL, new Node(Token.NAME), new Node(Token.WHILE));
        invoke(normalizeAssert, "normalizeLabels", new Class[]{Node.class}, label);
        assertEquals(Token.WHILE, label.getLastChild().getType());
    }

    @Test
    public void testNormalizeLabels_LastChildIsDo_NoChange() throws Exception {
        Node label = new Node(Token.LABEL, new Node(Token.NAME), new Node(Token.DO));
        invoke(normalizeAssert, "normalizeLabels", new Class[]{Node.class}, label);
        assertEquals(Token.DO, label.getLastChild().getType());
    }

    @Test
    public void testNormalizeLabels_LastChildIsAnotherLabel_NoChange() throws Exception {
        Node inner = new Node(Token.LABEL, new Node(Token.NAME), new Node(Token.BLOCK));
        Node outer = new Node(Token.LABEL, new Node(Token.NAME), inner);
        invoke(normalizeAssert, "normalizeLabels", new Class[]{Node.class}, outer);
        assertSame(inner, outer.getLastChild());
    }

    @Test
    public void testNormalizeLabels_DefaultCase_WrapsInBlockAndThrows() throws Exception {
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node label = new Node(Token.LABEL, new Node(Token.NAME), exprResult);
        invokeExpectingCause(IllegalStateException.class, normalizeAssert,
                "normalizeLabels", new Class[]{Node.class}, label);
        // ตรวจสอบว่า mutation เกิดขึ้นแล้วก่อนที่ exception จะถูก throw
        assertEquals(Token.BLOCK, label.getLastChild().getType());
        assertSame(exprResult, label.getLastChild().getFirstChild());
    }

    @Test
    public void testNormalizeLabels_NotLabelType_ThrowsIllegalArgument() throws Exception {
        Node notLabel = new Node(Token.BLOCK);
        invokeExpectingCause(IllegalArgumentException.class, normalizeAssert,
                "normalizeLabels", new Class[]{Node.class}, notLabel);
    }

    @Test
    public void testNormalizeLabels_NoLastChild_ThrowsNPE() throws Exception {
        // LABEL ที่ไม่มี children เลย (malformed input) -> last=null -> NPE ที่
        // switch(last.getType())
        Node malformedLabel = new Node(Token.LABEL);
        invokeExpectingCause(NullPointerException.class, normalizeAssert,
                "normalizeLabels", new Class[]{Node.class}, malformedLabel);
    }

    @Test
    public void testNormalizeLabels_NullInput_ThrowsNPE() throws Exception {
        invokeExpectingCause(NullPointerException.class, normalizeAssert,
                "normalizeLabels", new Class[]{Node.class}, (Node) null);
    }

    // =================================================================
    // 4. extractForInitializer(Node n, Node before, Node beforeParent)
    // =================================================================

    private Node buildForNode(Node init, Node cond, Node incr, Node body) {
        Node forNode = new Node(Token.FOR);
        // ใช้ addChildToFront ตามลำดับย้อนกลับ (มียืนยันจาก source ว่ามี method นี้)
        forNode.addChildToFront(body);
        forNode.addChildToFront(incr);
        forNode.addChildToFront(cond);
        forNode.addChildToFront(init);
        return forNode;
    }

    @Test
    public void testExtractForInitializer_ForWithVarInit_ExtractsAndThrows()
            throws Exception {
        Node nameNode = new Node(Token.NAME); // ไม่ต้องมี string จริงสำหรับ test นี้
        Node varInit = new Node(Token.VAR, nameNode, 0, 0);
        Node forNode = buildForNode(varInit, new Node(Token.EMPTY),
                new Node(Token.EMPTY), new Node(Token.BLOCK));
        Node blockParent = new Node(Token.BLOCK);
        blockParent.addChildToFront(forNode);

        invokeExpectingCause(IllegalStateException.class, normalizeAssert,
                "extractForInitializer",
                new Class[]{Node.class, Node.class, Node.class},
                blockParent, null, null);

        // VAR statement ควรถูกดึงออกมาไว้ก่อน FOR ใน blockParent แล้ว
        assertEquals(Token.VAR, blockParent.getFirstChild().getType());
        assertSame(varInit, blockParent.getFirstChild());
        assertSame(forNode, blockParent.getFirstChild().getNext());
        assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
    }

    @Test
    public void testExtractForInitializer_ForWithEmptyInit_NoChange() throws Exception {
        Node forNode = buildForNode(new Node(Token.EMPTY), new Node(Token.EMPTY),
                new Node(Token.EMPTY), new Node(Token.BLOCK));
        Node blockParent = new Node(Token.BLOCK);
        blockParent.addChildToFront(forNode);

        invoke(normalizeAssert, "extractForInitializer",
                new Class[]{Node.class, Node.class, Node.class},
                blockParent, null, null);

        assertSame(forNode, blockParent.getFirstChild());
        assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
    }

    @Test
    public void testExtractForInitializer_NonForNonLabelChild_NoOp() throws Exception {
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node blockParent = new Node(Token.BLOCK);
        blockParent.addChildToFront(exprResult);

        invoke(normalizeAssert, "extractForInitializer",
                new Class[]{Node.class, Node.class, Node.class},
                blockParent, null, null);

        assertSame(exprResult, blockParent.getFirstChild());
    }

    @Test
    public void testExtractForInitializer_LabelRecursion_ExtractsBeforeLabelAndThrows()
            throws Exception {
        Node nameNode = new Node(Token.NAME);
        Node varInit = new Node(Token.VAR, nameNode, 0, 0);
        Node forNode = buildForNode(varInit, new Node(Token.EMPTY),
                new Node(Token.EMPTY), new Node(Token.BLOCK));
        Node label = new Node(Token.LABEL);
        label.addChildToFront(forNode);
        Node blockParent = new Node(Token.BLOCK);
        blockParent.addChildToFront(label);

        invokeExpectingCause(IllegalStateException.class, normalizeAssert,
                "extractForInitializer",
                new Class[]{Node.class, Node.class, Node.class},
                blockParent, null, null);

        // VAR ที่ดึงออกมาต้องอยู่ก่อน LABEL ใน blockParent (ไม่ใช่ก่อน FOR ที่อยู่ลึกลงไป)
        assertEquals(Token.VAR, blockParent.getFirstChild().getType());
        assertSame(label, blockParent.getFirstChild().getNext());
    }

    @Test
    public void testExtractForInitializer_EmptyParent_NoOp() throws Exception {
        Node blockParent = new Node(Token.BLOCK);
        invoke(normalizeAssert, "extractForInitializer",
                new Class[]{Node.class, Node.class, Node.class},
                blockParent, null, null);
        // ไม่มี exception, ไม่มี children เพิ่ม
    }

    @Test
    public void testExtractForInitializer_NullNode_ThrowsNPE() throws Exception {
        invokeExpectingCause(NullPointerException.class, normalizeAssert,
                "extractForInitializer",
                new Class[]{Node.class, Node.class, Node.class},
                (Node) null, null, null);
    }

    // หมายเหตุ: กรณี FOR-IN และกรณี init เป็น expression (ไม่ใช่ VAR) พึ่งพา
    // NodeUtil.isForIn / NodeUtil.newExpr ซึ่งไม่มีซอร์สโค้ดให้ตรวจสอบ
    // จึงไม่เขียนเทสสำหรับกรณีนี้เพื่อไม่เดา behavior (ตามข้อกำหนดที่ 4)

    // =================================================================
    // 5. splitVarDeclarations(Node n)
    // =================================================================

    @Test
    public void testSplitVarDeclarations_MultipleNames_ExtractsFirstAndThrows()
            throws Exception {
        Node name1 = new Node(Token.NAME);
        Node name2 = new Node(Token.NAME);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToFront(name2);
        varNode.addChildToFront(name1);
        Node blockParent = new Node(Token.BLOCK);
        blockParent.addChildToFront(varNode);

        invokeExpectingCause(IllegalStateException.class, normalizeAssert,
                "splitVarDeclarations", new Class[]{Node.class}, blockParent);

        // ตรวจสอบว่า var แรกถูกแยกออกมาแล้วก่อน exception จะถูก throw
        Node firstStmt = blockParent.getFirstChild();
        assertEquals(Token.VAR, firstStmt.getType());
        assertSame(name1, firstStmt.getFirstChild());
        assertSame(varNode, firstStmt.getNext());
        assertSame(name2, varNode.getFirstChild());
        assertEquals(varNode.getFirstChild(), varNode.getLastChild());
    }

    @Test
    public void testSplitVarDeclarations_SingleName_NoChange() throws Exception {
        Node name1 = new Node(Token.NAME);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToFront(name1);
        Node blockParent = new Node(Token.BLOCK);
        blockParent.addChildToFront(varNode);

        invoke(normalizeAssert, "splitVarDeclarations", new Class[]{Node.class},
                blockParent);

        assertSame(varNode, blockParent.getFirstChild());
        assertSame(name1, varNode.getFirstChild());
    }

    @Test
    public void testSplitVarDeclarations_NonVarNode_Skipped() throws Exception {
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node blockParent = new Node(Token.BLOCK);
        blockParent.addChildToFront(exprResult);

        invoke(normalizeAssert, "splitVarDeclarations", new Class[]{Node.class},
                blockParent);

        assertSame(exprResult, blockParent.getFirstChild());
    }

    @Test
    public void testSplitVarDeclarations_EmptyVarNode_AssertOnChangeThrows()
            throws Exception {
        Node emptyVar = new Node(Token.VAR);
        Node blockParent = new Node(Token.BLOCK);
        blockParent.addChildToFront(emptyVar);

        invokeExpectingCause(IllegalStateException.class, normalizeAssert,
                "splitVarDeclarations", new Class[]{Node.class}, blockParent);
    }

    @Test
    public void testSplitVarDeclarations_EmptyParent_NoOp() throws Exception {
        Node blockParent = new Node(Token.BLOCK);
        invoke(normalizeAssert, "splitVarDeclarations", new Class[]{Node.class},
                blockParent);
    }

    @Test
    public void testSplitVarDeclarations_NullNode_ThrowsNPE() throws Exception {
        invokeExpectingCause(NullPointerException.class, normalizeAssert,
                "splitVarDeclarations", new Class[]{Node.class}, (Node) null);
    }

    // =================================================================
    // 6. moveNamedFunctions(Node functionBody) -- เฉพาะ branch ที่ไม่พึ่ง
    //    NodeUtil.isFunctionDeclaration (ไม่มีซอร์สให้ตรวจสอบ behavior)
    // =================================================================

    @Test
    public void testMoveNamedFunctions_ParentNotFunction_ThrowsIllegalState()
            throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        // ผูก parent เป็น SCRIPT (ไม่ใช่ FUNCTION) เพื่อทดสอบ Preconditions.checkState
        new Node(Token.SCRIPT, functionBody, 0, 0);

        invokeExpectingCause(IllegalStateException.class, normalizeAssert,
                "moveNamedFunctions", new Class[]{Node.class}, functionBody);
    }

    @Test
    public void testMoveNamedFunctions_EmptyBody_NoOp() throws Exception {
        Node functionBody = new Node(Token.BLOCK);
        new Node(Token.FUNCTION, new Node(Token.NAME), functionBody);
        // current=null ทันที -> while(current != null && ...) short-circuit
        // ไม่เรียก NodeUtil.isFunctionDeclaration เลย -> ปลอดภัยไม่ต้องพึ่ง behavior นั้น
        invoke(normalizeAssert, "moveNamedFunctions", new Class[]{Node.class},
                functionBody);
    }

    @Test(expected = NullPointerException.class)
    public void testMoveNamedFunctions_NullNode_ThrowsNPE() throws Throwable {
        try {
            invoke(normalizeAssert, "moveNamedFunctions", new Class[]{Node.class},
                    (Node) null);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    // =================================================================
    // 7. addToFront(Node parent, Node newChild, Node after) -- pure logic
    // =================================================================

    @Test
    public void testAddToFront_AfterIsNull_AddsToFront() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node existing = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(existing);
        Node newChild = new Node(Token.FUNCTION);

        Object result = invoke(normalizeAssert, "addToFront",
                new Class[]{Node.class, Node.class, Node.class},
                parent, newChild, null);

        assertSame(newChild, result);
        assertSame(newChild, parent.getFirstChild());
        assertSame(existing, newChild.getNext());
    }

    @Test
    public void testAddToFront_AfterIsGiven_AddsAfter() throws Exception {
        Node parent = new Node(Token.BLOCK);
        Node afterNode = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(afterNode);
        Node newChild = new Node(Token.FUNCTION);

        Object result = invoke(normalizeAssert, "addToFront",
                new Class[]{Node.class, Node.class, Node.class},
                parent, newChild, afterNode);

        assertSame(newChild, result);
        assertSame(newChild, afterNode.getNext());
    }

    // =================================================================
    // 8. reportCodeChange(String) -- private method โดยตรง
    // =================================================================

    @Test
    public void testReportCodeChange_AssertOnChangeTrue_ThrowsIllegalState()
            throws Exception {
        invokeExpectingCause(IllegalStateException.class, normalizeAssert,
                "reportCodeChange", new Class[]{String.class}, "test change");
    }

    // หมายเหตุ: กรณี assertOnChange=false ต้องเรียก compiler.reportCodeChange()
    // จริง ซึ่งต้องมี AbstractCompiler instance ที่ implement ครบ - ไม่มี
    // mocking framework ใน classpath ที่กำหนด จึงไม่ทดสอบ branch นี้
    // (ตามข้อกำหนดที่ 4 ห้ามเดา/สมมติ stub ที่ไม่มีอยู่จริง)

    // =================================================================
    // 9. Normalize.PropogateConstantAnnotations.visit()
    // =================================================================

    @Test
    public void testPropogateConstantAnnotations_NonNameNode_NoOp() {
        Normalize.PropogateConstantAnnotations pca =
                new Normalize.PropogateConstantAnnotations(null, false);
        Node block = new Node(Token.BLOCK);
        pca.visit(null, block, null); // t ไม่ถูกใช้เพราะ type != NAME
    }

    @Test
    public void testPropogateConstantAnnotations_EmptyStringName_EarlyReturn() {
        Normalize.PropogateConstantAnnotations pca =
                new Normalize.PropogateConstantAnnotations(null, false);
        // สมมติฐาน: Node.newString(int type, String value) เป็น factory method
        // ที่มีอยู่จริงใน Rhino Node API เวอร์ชันนี้ (ไม่ได้ปรากฏตรงในซอร์สที่ให้มา)
        Node nameNode = Node.newString(Token.NAME, "");
        pca.visit(null, nameNode, null); // early return ก่อนแตะ t.getScope()
    }

    // หมายเหตุ: กรณี NAME ที่ไม่ empty ต้องเรียก t.getScope().getVar(...) ซึ่ง
    // ต้องมี NodeTraversal/Scope จริงที่ทำงานได้ ไม่สามารถ stub ได้อย่างปลอดภัย
    // ด้วย classpath ที่กำหนด จึงไม่ทดสอบ branch นี้

    // =================================================================
    // 10. Normalize.VerifyConstants.visit() -- checkUserDeclarations=false
    //     ทำให้ไม่ต้องพึ่ง compiler/scope เลย
    // =================================================================

    @Test
    public void testVerifyConstants_NonNameNode_NoOp() {
        Normalize.VerifyConstants vc = new Normalize.VerifyConstants(null, false);
        Node block = new Node(Token.BLOCK);
        vc.visit(null, block, null);
    }

    @Test
    public void testVerifyConstants_EmptyStringName_EarlyReturn() {
        Normalize.VerifyConstants vc = new Normalize.VerifyConstants(null, false);
        Node nameNode = Node.newString(Token.NAME, "");
        vc.visit(null, nameNode, null);
    }

    @Test
    public void testVerifyConstants_FirstOccurrence_RecordsMapping_NoException() {
        Normalize.VerifyConstants vc = new Normalize.VerifyConstants(null, false);
        Node nameNode = Node.newString(Token.NAME, "x");
        // checkUserDeclarations=false -> ข้าม block ที่ต้องใช้ t/compiler ทั้งหมด
        vc.visit(null, nameNode, null);
    }

    @Test
    public void testVerifyConstants_ConsistentSecondOccurrence_NoException() {
        Normalize.VerifyConstants vc = new Normalize.VerifyConstants(null, false);
        Node n1 = Node.newString(Token.NAME, "x");
        Node n2 = Node.newString(Token.NAME, "x");
        // ทั้งคู่ไม่ตั้ง IS_CONSTANT_NAME -> ค่า default เหมือนกัน (สมมติฐาน: boolean
        // prop ที่ไม่ได้ตั้งค่าจะ default เป็น false ตามที่ใช้งานทั่วไปในซอร์ส)
        vc.visit(null, n1, null);
        vc.visit(null, n2, null);
    }

    @Test(expected = IllegalStateException.class)
    public void testVerifyConstants_InconsistentAnnotation_ThrowsIllegalState() {
        Normalize.VerifyConstants vc = new Normalize.VerifyConstants(null, false);
        Node n1 = Node.newString(Token.NAME, "x");
        Node n2 = Node.newString(Token.NAME, "x");
        n2.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        vc.visit(null, n1, null);
        vc.visit(null, n2, null); // ไม่สอดคล้องกัน -> Preconditions.checkState throw
    }

    // หมายเหตุ: checkUserDeclarations=true ต้องพึ่ง NodeUtil.isConstantName และ
    // compiler.getCodingConvention() ซึ่งไม่มีซอร์สโค้ด/stub ที่ปลอดภัย จึงไม่ทดสอบ
}
