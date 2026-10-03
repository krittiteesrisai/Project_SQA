package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class FunctionInjectorTest {

    private AbstractCompiler compiler;
    private Supplier<String> safeNameIdSupplier;
    int idCounter = 0;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // ตั้งค่า Compiler เบื้องต้นให้มี LifeCycle Stage เป็น NORMALIZE
        compiler.initOptions(new CompilerOptions());
        compiler.getLifeCycleStage().setNormalized();

        safeNameIdSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "gensym_" + (++idCounter);
            }
        };
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_Inlinable() {
        FunctionInjector injector = new FunctionInjector(
                compiler, safeNameIdSupplier, true, true, true);

        // สร้าง FUNCTION node: function foo(a) { return a; }
        Node fnNode = Node.newFunctionNode(
                "foo",
                Node.newString(Token.NAME, "foo"),
                new Node(Token.PARAM_LIST, Node.newString(Token.NAME, "a")),
                new Node(Token.BLOCK, new Node(Token.RETURN, Node.newString(Token.NAME, "a")))
        );

        boolean result = injector.doesFunctionMeetMinimumRequirements("foo", fnNode);
        assertTrue("Standard function should meet minimum requirements", result);
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesArguments() {
        FunctionInjector injector = new FunctionInjector(
                compiler, safeNameIdSupplier, true, true, true);

        // ฟังก์ชันที่ใช้ arguments: function foo() { return arguments[0]; }
        Node block = new Node(Token.BLOCK, 
            new Node(Token.RETURN, Node.newGetElem(Node.newString(Token.NAME, "arguments"), Node.newNumber(0)))
        );
        Node fnNode = Node.newFunctionNode(
                "foo",
                Node.newString(Token.NAME, "foo"),
                new Node(Token.PARAM_LIST),
                block
        );

        boolean result = injector.doesFunctionMeetMinimumRequirements("foo", fnNode);
        assertFalse("Function referencing 'arguments' should be rejected", result);
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesEval() {
        FunctionInjector injector = new FunctionInjector(
                compiler, safeNameIdSupplier, true, true, true);

        // ฟังก์ชันที่เรียก eval: function foo() { return eval("1"); }
        Node callEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1"));
        Node block = new Node(Token.BLOCK, new Node(Token.RETURN, callEval));
        Node fnNode = Node.newFunctionNode(
                "foo",
                Node.newString(Token.NAME, "foo"),
                new Node(Token.PARAM_LIST),
                block
        );

        boolean result = injector.doesFunctionMeetMinimumRequirements("foo", fnNode);
        assertFalse("Function referencing 'eval' should be rejected", result);
    }

    @Test
    public void testCanInlineReferenceToFunction_UnsupportedCallType() {
        FunctionInjector injector = new FunctionInjector(
                compiler, safeNameIdSupplier, false, false, false);

        // จำลองการเรียกด้วย .apply ซึ่งไม่รองรับ
        Node applyCall = new Node(Token.CALL, 
            new Node(Token.GETPROP, Node.newString(Token.NAME, "foo"), Node.newString("apply"))
        );
        
        Node fnNode = Node.newFunctionNode(
                "foo", Node.newString(Token.NAME, "foo"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK)
        );

        NodeTraversal traversal = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n) {}
        });

        FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
                traversal, applyCall, fnNode, new HashSet<String>(), 
                FunctionInjector.InliningMode.DIRECT, false, false
        );

        assertEquals(FunctionInjector.CanInlineResult.NO, result);
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_EmptyBlock() {
        FunctionInjector injector = new FunctionInjector(
                compiler, safeNameIdSupplier, true, true, true);

        // ฟังก์ชันว่าง: function foo() {}
        Node fnNode = Node.newFunctionNode(
                "foo", Node.newString(Token.NAME, "foo"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK)
        );

        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testInliningLowersCost_ZeroReferences() {
        FunctionInjector injector = new FunctionInjector(
                compiler, safeNameIdSupplier, true, true, true);

        Node fnNode = Node.newFunctionNode(
                "foo", Node.newString(Token.NAME, "foo"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK)
        );

        // ไม่มี Reference เลย ควรคืนค่า true ทันทีตามเงื่อนไข referenceCount == 0
        boolean lowers = injector.inliningLowersCost(
                null, fnNode, Sets.<FunctionInjector.Reference>newHashSet(), 
                new HashSet<String>(), true, false
        );

        assertTrue(lowers);
    }

    @Test
    public void testSetKnownConstants_StateValidation() {
        FunctionInjector injector = new FunctionInjector(
                compiler, safeNameIdSupplier, true, true, true);

        Set<String> constants = Sets.newHashSet("CONST_1");
        injector.setKnownConstants(constants);

        // การเรียกซ้ำควรพ่น IllegalStateException เนื่องจาก Preconditions.checkState(this.knownConstants.isEmpty())
        boolean exceptionThrown = false;
        try {
            injector.setKnownConstants(constants);
        } catch (IllegalStateException e) {
            exceptionThrown = true;
        }
        assertTrue("Setting knownConstants twice should throw IllegalStateException", exceptionThrown);
    }
}