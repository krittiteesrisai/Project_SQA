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

/**
 * High-coverage JUnit 4 test suite for FunctionInjector (Closure-115b).
 */
public class FunctionInjectorTest {

    private AbstractCompiler compiler;
    private Supplier<String> safeNameIdSupplier;
    private FunctionInjector injector;

    @Before
    public void setUp() {
        // ใช้ Compiler Mock พื้นฐานผ่าน Compiler หรือ CompilerStub ที่มีในโปรเจกต์ Closure
        compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        
        safeNameIdSupplier = new Supplier<String>() {
            private int id = 0;
            @Override
            public String get() {
                return "id" + (id++);
            }
        };

        // Default: allowDecomposition = true, assumeStrictThis = false, assumeMinimumCapture = false
        injector = new FunctionInjector(
                compiler,
                safeNameIdSupplier,
                true,
                false,
                false
        );
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_Inlinable() {
        // สร้าง Node สำหรับฟังก์ชันธรรมดา: function f() { return 1; }
        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NUMBER, 1.0))));

        boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
        assertTrue("Standard function should meet minimum requirements", result);
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesArguments() {
        // ฟังก์ชันที่เรียกใช้ "arguments": function f() { return arguments[0]; }
        Node getElem = new Node(Token.GETELEM, new Node(Token.NAME, "arguments"), new Node(Token.NUMBER, 0.0));
        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK, new Node(Token.RETURN, getElem)));

        boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
        assertFalse("Function referencing 'arguments' should not meet requirements", result);
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesEval() {
        // ฟังก์ชันที่เรียกใช้ "eval": function f() { return eval("1"); }
        Node callEval = new Node(Token.CALL, new Node(Token.NAME, "eval"), new Node(Token.STRING, "1"));
        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK, new Node(Token.RETURN, callEval)));

        boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
        assertFalse("Function referencing 'eval' should not meet requirements", result);
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_EmptyFunction() {
        // ฟังก์ชันว่าง: function f() {}
        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.NAME, "f"),
                new Node(Token.LP),
                new Node(Token.BLOCK));

        assertTrue("Empty function should be direct call replacement possible",
                injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_MultiStatement() {
        // ฟังก์ชันที่มีมากกว่า 1 Statement
        Node block = new Node(Token.BLOCK,
                new Node(Token.RETURN, new Node(Token.NUMBER, 1.0)),
                new Node(Token.RETURN, new Node(Token.NUMBER, 2.0)));
        Node fnNode = new Node(Token.FUNCTION,
                new Node(Token.NAME, "f"),
                new Node(Token.LP),
                block);

        assertFalse("Multi-statement function should not be direct replacement possible",
                injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testCanInlineReferenceToFunction_UnsupportedCallType() {
        // จำลองการเรียกใช้งาน .apply() ซึ่งไม่รองรับ
        Node callNode = new Node(Token.CALL,
                new Node(Token.GETPROP, new Node(Token.NAME, "f"), new Node(Token.STRING, "apply")));
        Node fnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
        
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {}
        });

        FunctionInjector.CanInlineResult result = injector.canInlineReferenceToFunction(
                traversal, callNode, fnNode, new HashSet<String>(),
                FunctionInjector.InliningMode.DIRECT, false, false
        );

        assertEquals(FunctionInjector.CanInlineResult.NO, result);
    }

    @Test
    public void testSetKnownConstants_StateValidation() {
        Set<String> constants = Sets.newHashSet("CONST_A");
        injector.setKnownConstants(constants);
        
        // การเรียก setKnownConstants ซ้ำควรโยน IllegalStateException ตาม Preconditions.checkState
        boolean exceptionThrown = false;
        try {
            injector.setKnownConstants(setsNewHashSetHelper("CONST_B"));
        } catch (IllegalStateException e) {
            exceptionThrown = true;
        }
        assertTrue("Setting known constants twice should throw IllegalStateException", exceptionThrown);
    }

    private Set<String> setsNewHashSetHelper(String val) {
        Set<String> set = new HashSet<String>();
        set.add(val);
        return set;
    }
}