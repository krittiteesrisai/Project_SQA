package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for ControlFlowAnalysis (Closure-103b)
 * Maximizes Branch and Condition Coverage, targeting complex control flows,
 * try-catch-finally interactions, and edge cases.
 */
public class ControlFlowAnalysisTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนดค่าเริ่มต้นพื้นฐานสำหรับ Compiler หากจำเป็น
    }

    @Test
    public void testSimpleIfElseControlFlow() {
        // Trigger: handleIf (both ON_TRUE and ON_FALSE with else block)
        Node script = new Node(Token.SCRIPT);
        Node ifNode = new Node(Token.IF, 
            Node.newNumber(1), 
            new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2))),
            new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(3)))
        );
        script.addChildToBack(ifNode);

        ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
        cfa.process(null, script);
        assertNotNull(cfa.getCfg());
    }

    @Test
    public void testIfWithoutElseControlFlow() {
        // Trigger: handleIf (ON_FALSE fallback to computeFollowNode when elseBlock is null)
        Node script = new Node(Token.SCRIPT);
        Node ifNode = new Node(Token.IF, 
            Node.newNumber(1), 
            new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2)))
        );
        script.addChildToBack(ifNode);

        ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false);
        cfa.process(null, script);
        assertNotNull(cfa.getCfg());
    }

    @Test
    public void testWhileAndDoWhileControlFlow() {
        // Trigger: handleWhile and handleDo
        Node script = new Node(Token.SCRIPT);
        
        Node whileNode = new Node(Token.WHILE,
            Node.newNumber(1),
            new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2)))
        );
        script.addChildToBack(whileNode);

        Node doNode = new Node(Token.DO,
            new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(3))),
            Node.newNumber(1)
        );
        script.addChildToBack(doNode);

        ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
        cfa.process(null, script);
        assertNotNull(cfa.getCfg());
    }

    @Test
    public void testStandardForAndForInControlFlow() {
        // Trigger: handleFor (4 children vs For-In structure)
        Node script = new Node(Token.SCRIPT);

        // Standard for: for(var i=0; i<10; i++) { expr; }
        Node forNode = new Node(Token.FOR,
            new Node(Token.VAR, Node.newString("i")),
            Node.newNumber(10),
            new Node(Token.INC, Node.newString("i")),
            new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)))
        );
        script.addChildToBack(forNode);

        ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
        cfa.process(null, script);
        assertNotNull(cfa.getCfg());
    }

    @Test
    public void testSwitchCaseDefaultControlFlow() {
        // Trigger: handleSwitch, handleCase, handleDefault
        Node script = new Node(Token.SCRIPT);
        
        Node switchNode = new Node(Token.SWITCH,
            Node.newString("val"),
            new Node(Token.BLOCK,
                new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK, new Node(Token.BREAK))),
                new Node(Token.DEFAULT, new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2))))
            )
        );
        script.addChildToBack(switchNode);

        ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
        cfa.process(null, script);
        assertNotNull(cfa.getCfg());
    }

    @Test
    public void testTryCatchFinallyAndNestedTry() {
        // Trigger: handleTry, handleCatch, connectToPossibleExceptionHandler, finallyMap
        Node script = new Node(Token.SCRIPT);

        Node tryNode = new Node(Token.TRY,
            new Node(Token.BLOCK, new Node(Token.THROW, Node.newString("error"))),
            new Node(Token.BLOCK, new Node(Token.CATCH, Node.newString("e"), new Node(Token.BLOCK))),
            new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)))
        );
        script.addChildToBack(tryNode);

        ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
        cfa.process(null, script);
        assertNotNull(cfa.getCfg());
    }

    @Test
    public void testBreakAndContinueWithLabels() {
        // Trigger: handleBreak, handleContinue, isBreakTarget, isContinueTarget, matchLabel
        Node script = new Node(Token.SCRIPT);

        Node labelNode = new Node(Token.LABEL,
            Node.newString("myLabel"),
            new Node(Token.WHILE,
                Node.newNumber(1),
                new Node(Token.BLOCK, new Node(Token.BREAK, Node.newString("myLabel")))
            )
        );
        script.addChildToBack(labelNode);

        ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
        cfa.process(null, script);
        assertNotNull(cfa.getCfg());
    }

    @Test
    public void testFunctionTraversalEdgeCases() {
        // Trigger: shouldTraverse with FUNCTION, handleFunction, and prioritizeFromEntryNode branches
        Node script = new Node(Token.SCRIPT);
        
        Node funcNode = new Node(Token.FUNCTION,
            Node.newString(""),
            new Node(Token.BLOCK),
            new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)))
        );
        script.addChildToBack(funcNode);

        ControlFlowAnalysis cfaWithFunc = new ControlFlowAnalysis(compiler, true);
        cfaWithFunc.process(null, script);

        ControlFlowAnalysis cfaWithoutFunc = new ControlFlowAnalysis(compiler, false);
        cfaWithoutFunc.process(null, script);

        assertNotNull(cfaWithFunc.getCfg());
    }
}