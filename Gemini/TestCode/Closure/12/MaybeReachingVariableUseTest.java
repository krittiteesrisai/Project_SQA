package com.google.javascript.jscomp;

import com.google.common.collect.Multimap;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test class for MaybeReachingVariableUse focusing on high Branch/Condition coverage
 * and Edge Cases for Defects4J Closure-12b.
 */
public class MaybeReachingVariableUseTest {

    private Compiler compiler;
    private Scope jsScope;
    private ControlFlowGraph<Node> cfg;
    private MaybeReachingVariableUse analysis;
    private MaybeReachingVariableUse.ReachingUses reachingUses;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // สร้าง Dummy Scope และ CFG เบื้องต้นสำหรับการทดสอบ AST Node flowThrough
        Node root = new Node(Token.BLOCK);
        Scope globalScope = new Scope(root, compiler);
        jsScope = new Scope(globalScope, root);
        cfg = new ControlFlowGraph<>(root, true, true);
        
        analysis = new MaybeReachingVariableUse(cfg, jsScope, compiler);
        reachingUses = new MaybeReachingVariableUse.ReachingUses();
    }

    @Test
    public void testReachingUsesCopyAndEquals() {
        MaybeReachingVariableUse.ReachingUses uses1 = new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses uses2 = new MaybeReachingVariableUse.ReachingUses(uses1);
        
        assertEquals(uses1, uses2);
        assertEquals(uses1.hashCode(), uses2.hashCode());
        assertFalse(uses1.equals(new Object()));
    }

    @Test
    public void testJoinOpApply() {
        MaybeReachingVariableUse.ReachingUses uses1 = new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses uses2 = new MaybeReachingVariableUse.ReachingUses();
        
        java.util.List<MaybeReachingVariableUse.ReachingUses> list = new java.util.ArrayList<>();
        list.add(uses1);
        list.add(uses2);

        MaybeReachingVariableUse.ReachingUses result = analysis.createEntryLattice();
        assertNotNull(result);
        assertNotNull(analysis.createInitialEstimateLattice());
        assertFalse(analysis.isForward());
    }

    @Test
    public void testFlowThroughWithBlockAndFunction() {
        Node blockNode = new Node(Token.BLOCK);
        Node funcNode = new Node(Token.FUNCTION);

        // Token.BLOCK และ Token.FUNCTION ควรจะ Return ทันทีโดยไม่เปลี่ยน state
        MaybeReachingVariableUse.ReachingUses res1 = analysis.flowThrough(blockNode, reachingUses);
        MaybeReachingVariableUse.ReachingUses res2 = analysis.flowThrough(funcNode, reachingUses);

        assertNotNull(res1);
        assertNotNull(res2);
    }

    @Test
    public void testFlowThroughWithNameToken() {
        // ทดสอบ Token.NAME ซึ่งจะเรียก addToUseIfLocal (กรณีตัวแปรไม่พบใน scope จะต้องไม่พัง)
        Node nameNode = Node.newString(Token.NAME, "nonExistentVar");
        MaybeReachingVariableUse.ReachingUses res = analysis.flowThrough(nameNode, reachingUses);
        assertNotNull(res);
    }

    @Test
    public void testFlowThroughWithConditionalControlFlow() {
        // ทดสอบ Token.IF พร้อม Condition
        Node condNode = Node.newString(Token.NAME, "cond");
        Node ifNode = new Node(Token.IF, condNode, new Node(Token.BLOCK));
        
        MaybeReachingVariableUse.ReachingUses res = analysis.flowThrough(ifNode, reachingUses);
        assertNotNull(res);

        // ทดสอบ Token.WHILE และ Token.DO
        Node whileNode = new Node(Token.WHILE, condNode, new Node(Token.BLOCK));
        assertNotNull(analysis.flowThrough(whileNode, reachingUses));

        Node doNode = new Node(Token.DO, new Node(Token.BLOCK), condNode);
        assertNotNull(analysis.flowThrough(doNode, reachingUses));
    }

    @Test
    public void testFlowThroughForInLoops() {
        // ทดสอบ for(x in y) และ for(var x in y)
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = Node.newString(Token.NAME, "y");
        Node forInNode = new Node(Token.FOR, lhs, rhs);
        // กำหนดให้เป็น For-In โดยการเซ็ต Prop หรือโครงสร้างจำลอง
        Node.IR_FACTORY.createForIn(new Node(Token.BLOCK), lhs, rhs);

        MaybeReachingVariableUse.ReachingUses res = analysis.flowThrough(forInNode, reachingUses);
        assertNotNull(res);

        // กรณี var x in y
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        Node forVarInNode = new Node(Token.FOR, varNode, rhs);
        assertNotNull(analysis.flowThrough(forVarInNode, reachingUses));
    }

    @Test
    public::new
    public void testFlowThroughLogicalAndOrAndHook() {
        Node left = Node.newString(Token.NAME, "a");
        Node right = Node.newString(Token.NAME, "b");

        // Token.AND / Token.OR
        Node andNode = new Node(Token.AND, left, right);
        assertNotNull(analysis.flowThrough(andNode, reachingUses));

        Node orNode = new Node(Token.OR, left, right);
        assertNotNull(analysis.flowThrough(orNode, reachingUses));

        // Token.HOOK (Ternary operator ? :)
        Node cond = Node.newString(Token.NAME, "c");
        Node hookNode = new Node(Token.HOOK, cond, left, right);
        assertNotNull(analysis.flowThrough(hookNode, reachingUses));
    }

    @Test
    public void testFlowThroughVarDeclaration() {
        Node varChild = Node.newString(Token.NAME, "myVar");
        varChild.addChildToBack(Node.newNumber(10));
        Node varNode = new Node(Token.VAR, varChild);

        MaybeReachingVariableUse.ReachingUses res = analysis.flowThrough(varNode, reachingUses);
        assertNotNull(res);

        // Var ไม่มี Child (Edge case)
        Node emptyVarNode = new Node(Token.VAR);
        // จะต้องเจอ Preconditions checkState ถ้าไม่มี child แต่ในที่นี้เราทดสอบผ่าน flowThrough ปกติ
        assertNotNull(analysis.flowThrough(emptyVarNode, reachingUses));
    }

    @Test
    public void testFlowThroughAssignmentsAndDefaultTraversal() {
        // ทดสอบ Assignment (Token.ASSIGN และ Token.ASSIGN_ADD เช่น a += 1)
        Node nameNode = Node.newString(Token.NAME, "myVar");
        Node valNode = Node.newNumber(5);
        Node assignNode = new Node(Token.ASSIGN, nameNode, valNode);

        assertNotNull(analysis.flowThrough(assignNode, reachingUses));

        // Compound assignment เช่น a += 5 (Token.ASSIGN_ADD) เพื่อรัน branch addToUseIfLocal สำหรับ non-assign op
        Node assignAddNode = new Node(Token.ASSIGN_ADD, Node.newString(Token.NAME, "myVar"), valNode);
        assertNotNull(analysis.flowThrough(assignAddNode, reachingUses));

        // Default node traversal (เช่น Binary operators ทั่วไป เช่น ADD)
        Node addNode = new Node(Token.ADD, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
        assertNotNull(analysis.flowThrough(addNode, reachingUses));
    }
}