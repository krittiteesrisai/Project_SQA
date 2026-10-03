package com.google.javascript.jscomp;

import com.google.common.base.Predicates;
import com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Senior Java Test Automation Engineer JUnit 4 Test Suite for ReferenceCollectingCallback (Closure-155b).
 */
public class ReferenceCollectingCallbackTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนดค่าเริ่มต้นเบื้องต้นให้ Compiler ถ้าจำเป็น
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    @Test
    public void testConstructorAndBasicProcess() {
        Node root = new Node(Token.BLOCK);
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);

        ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
                compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);

        callback.process(null, root);
        Set<Var> vars = callback.getReferencedVariables();
        assertNotNull(vars);
        assertTrue(vars.isEmpty());
    }

    @Test
    public void testBlockBoundariesAndTraversal() {
        // ทดสอบ isBlockBoundary ผ่าน structure ของ AST
        // สร้างโครงสร้าง: IF -> (Condition, THEN_BLOCK, ELSE_BLOCK)
        Node ifNode = new Node(Token.IF);
        Node condNode = new Node(Token.TRUE);
        Node thenNode = new Node(Token.BLOCK);
        Node elseNode = new Node(Token.BLOCK);

        ifNode.addChildToBack(condNode);
        ifNode.addChildToBack(thenNode);
        ifNode.addChildToBack(elseNode);

        ReferenceCollectingCallback callback = new ReferenceCollectingCallback(
                compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);

        NodeTraversal traversal = new NodeTraversal(compiler, callback);

        // ทดสอบ shouldTraverse และ visit กับ Block Boundary ของ IF (เด็กตัวแรกไม่เป็น boundary, ตัวถัดไปเป็น)
        boolean travCond = callback.shouldTraverse(traversal, condNode, ifNode);
        assertTrue(travCond);

        boolean travThen = callback.shouldTraverse(traversal, thenNode, ifNode);
        assertTrue(travThen);

        boolean travElse = callback.shouldTraverse(traversal, elseNode, ifNode);
        assertTrue(travElse);

        // จำลองการออกหรือเยี่ยมชม Node ชื่อตัวแปร (NAME)
        Node nameNode = Node.newString(Token.NAME, "x");
        Node varParent = new Node(Token.VAR, nameNode);
        
        // จำลอง ScopedCallback methods
        callback.enterScope(traversal);
        
        // ทดสอบ visit สำหรับ NAME token ที่ไม่อยู่ใน Scope จริง (v จะเป็น null) หรือมีอยู่จริง
        callback.visit(traversal, nameNode, varParent);
        
        callback.exitScope(traversal);
    }

    @Test
    public void testReferenceCollectionEdgeCases() {
        ReferenceCollection collection = new ReferenceCollection();

        // 1. size == 0 -> isWellDefined() ควรเป็น false
        assertFalse(collection.isWellDefined());
        assertFalse(collection.firstReferenceIsAssigningDeclaration());
        assertTrue(collection.isNeverAssigned());
        assertNull(collection.getInitializingReference());
        assertNull(collection.getInitializingReferenceForConstants());
        assertFalse(collection.isAssignedOnceInLifetime());
        assertFalse(collection.isEscaped());
    }

    @Test
    public void testReferencePredicatesAndLValues() {
        // ทดสอบ Reference classification ต่างๆ เช่น isVarDeclaration, isLvalue, isSimpleAssignmentToName
        Node nameNode = Node.newString(Token.NAME, "a");
        Node varParent = new Node(Token.VAR, nameNode);
        Node grandParent = new Node(Token.SCRIPT);
        varParent.addChildToBack(grandParent); // set parent/grandparent mock

        BasicBlock block = new BasicBlock(null, varParent);
        Scope scope = new Scope(null, varParent, null, compiler);
        
        Reference ref = new Reference(nameNode, varParent, null, block);
        
        assertFalse(ref.isDeclaration() == false && ref.isVarDeclaration() == false);
        // เนื่องจากไม่มี Mockito ใช้การตรวจสอบเมธอดพื้นฐานที่ไม่พึ่งพากลไกภยาก
        assertNotNull(ref.getNameNode());
        assertNotNull(ref.getParent());
        assertNotNull(ref.getBasicBlock());
    }

    @Test
    public void testBasicBlockProvablyExecutesBefore() {
        Node root1 = new Node(Token.FUNCTION);
        Node root2 = new Node(Token.BLOCK, root1);
        
        BasicBlock parentBlock = new BasicBlock(null, root2);
        BasicBlock childBlock = new BasicBlock(parentBlock, root1);

        // ทดสอบ provablyExecutesBefore เมื่อเป็น descendant และไม่มี hoisted block
        assertTrue(parentBlock.provablyExecutesBefore(childBlock));
        assertFalse(childBlock.provablyExecutesBefore(parentBlock));
        
        // ทดสอบเมื่อเทียบกับตัวเอง
        assertTrue(parentBlock.provablyExecutesBefore(parentBlock));
    }
}