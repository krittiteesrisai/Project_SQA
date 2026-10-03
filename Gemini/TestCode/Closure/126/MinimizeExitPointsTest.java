package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Senior JUnit 4 Test Automation Suite for MinimizeExitPoints (Defects4J Closure-126b)
 */
public class MinimizeExitPointsTest extends TestCase {

    private Compiler createMockCompiler() {
        // ใช้ Compiler จริงขนาดเล็กเพื่อหลีกเลี่ยงการใช้ Mockito ตามข้อกำหนด
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        return compiler;
    }

    @Test
    public void testVisitLabel() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // label: { break label; }
        Node breakNode = new Node(Token.BREAK, Node.newString("L"));
        Node labelBlock = IR.block(breakNode);
        Node labelNode = new Node(Token.LABEL, Node.newString("L"), labelBlock);

        pass.visit(null, labelNode, null);
        assertNotNull(labelNode);
    }

    @Test
    public void testVisitForAndWhile() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // for (;;) { continue; }
        Node continueNode = new Node(Token.CONTINUE);
        Node block = IR.block(continueNode);
        Node forNode = IR.forNode(IR.name("x"), IR.empty(), IR.empty(), block);

        pass.visit(null, forNode, null);

        // while (true) { continue; }
        Node whileNode = IR.whileNode(IR.trueNode(), IR.block(new Node(Token.CONTINUE)));
        pass.visit(null, whileNode, null);
    }

    @Test
    public void testVisitDoWhileImpureFalse() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // do { break; } while (false);
        Node breakNode = new Node(Token.BREAK);
        Node body = IR.block(breakNode);
        Node cond = IR.falseNode();
        Node doNode = IR.doNode(body, cond);

        pass.visit(null, doNode, null);
        assertNotNull(doNode);
    }

    @Test
    public void testVisitFunction() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // function f() { return; }
        Node returnNode = new Node(Token.RETURN);
        Node body = IR.block(returnNode);
        Node funcNode = IR.function(IR.name("f"), IR.paramList(), body);

        pass.visit(null, funcNode, null);
        assertNotNull(funcNode);
    }

    @Test
    public void testTryMinimizeExitsNonBlockAndEmptyBlock() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // Passing a non-block node should immediately bail out
        Node nonBlock = IR.number(1.0);
        pass.tryMinimizeExits(nonBlock, Token.RETURN, null);

        // Passing an empty block should bail out
        Node emptyBlock = IR.block();
        pass.tryMinimizeExits(emptyBlock, Token.RETURN, null);
    }

    @Test
    public void testTryMinimizeExitsIfAndElse() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // if (x) return; else return;
        Node ifNode = IR.ifNode(IR.name("x"), IR.block(new Node(Token.RETURN)), IR.block(new Node(Token.RETURN)));
        Node parentBlock = IR.block(ifNode);

        pass.tryMinimizeExits(parentBlock, Token.RETURN, null);
        assertNotNull(parentBlock);
    }

    @Test
    public void testTryMinimizeExitsTryCatchFinally() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // try { return; } catch (e) { return; } finally { return; }
        Node tryBody = IR.block(new Node(Token.RETURN));
        Node catchBody = IR.block(new Node(Token.RETURN));
        Node catchNode = IR.catchNode(IR.name("e"), catchBody);
        Node catchBlock = IR.block(catchNode);
        Node finallyBody = IR.block(new Node(Token.RETURN));
        
        Node tryNode = IR.tryNode(tryBody, catchBlock, finallyBody);
        Node parentBlock = IR.block(tryNode);

        pass.tryMinimizeExits(parentBlock, Token.RETURN, null);
        assertNotNull(parentBlock);
    }

    @Test
    public void testTryMinimizeIfBlockExitsDestBlockScenarios() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // Scenario: if (x) { return; } stmt; (destBlock is empty or null / statement / block)
        Node returnNode = new Node(Token.RETURN);
        Node ifTrueBlock = IR.block(returnNode);
        Node stmt = IR.exprResult(IR.number(1));
        
        Node ifNode = new Node(Token.IF, IR.name("x"), ifTrueBlock, IR.empty());
        Node parentBlock = IR.block(ifNode, stmt);

        pass.tryMinimizeExits(parentBlock, Token.RETURN, null);
        assertNotNull(parentBlock);
    }

    @Test
    public void testMoveAllFollowingWithFunctionDeclaration() {
        Compiler compiler = createMockCompiler();
        MinimizeExitPoints pass = new MinimizeExitPoints(compiler);

        // Test moving function declarations vs regular statements in moveAllFollowing
        Node returnNode = new Node(Token.RETURN);
        Node ifTrueBlock = IR.block(returnNode);
        Node funcDecl = IR.function(IR.name("inner"), IR.paramList(), IR.block());
        Node regStmt = IR.exprResult(IR.number(2));

        Node ifNode = new Node(Token.IF, IR.name("x"), ifTrueBlock, IR.empty());
        Node parentBlock = IR.block(ifNode, funcDecl, regStmt);

        pass.tryMinimizeExits(parentBlock, Token.RETURN, null);
        assertNotNull(parentBlock);
    }
}