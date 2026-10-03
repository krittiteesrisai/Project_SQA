package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for FunctionInjector (Defects4J Closure-175b)
 * Focused on high Branch/Condition coverage and edge cases.
 */
public class FunctionInjectorTest {

    private AbstractCompiler compiler;
    private Supplier<String> safeNameIdSupplier;
    private FunctionInjector injector;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนดค่าเริ่มต้นพื้นฐานสำหรับ Compiler Options ที่จำเป็น
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);

        safeNameIdSupplier = new Supplier<String>() {
            private int id = 0;
            @Override
            public String get() {
                return "id" + (id++);
            }
        };

        // สร้าง FunctionInjector โดยกำหนดค่า allowDecomposition=true, assumeStrictThis=false, assumeMinimumCapture=false
        injector = new FunctionInjector(
                compiler,
                safeNameIdSupplier,
                true,
                false,
                false
        );
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_Valid() {
        // สร้าง Node ของฟังก์ชันอย่างง่าย: function f() { return 1; }
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramNode = new Node(Token.PARAM_LIST);
        Node blockNode = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)));
        Node fnNode = new Node(Token.FUNCTION, nameNode, paramNode, blockNode);

        boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
        assertTrue("Standard simple function should meet minimum requirements", result);
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesArguments() {
        // ฟังก์ชันที่มีการใช้ "arguments": function f() { return arguments[0]; }
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramNode = new Node(Token.PARAM_LIST);
        Node getElem = new Node(Token.GETELEM, Node.newString(Token.NAME, "arguments"), Node.newNumber(0));
        Node blockNode = new Node(Token.BLOCK, new Node(Token.RETURN, getElem));
        Node fnNode = new Node(Token.FUNCTION, nameNode, paramNode, blockNode);

        boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
        assertFalse("Function referencing 'arguments' should be rejected", result);
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesEval() {
        // ฟังก์ชันที่มีการใช้ "eval": function f() { return eval("1"); }
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramNode = new Node(Token.PARAM_LIST);
        Node callEval = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1"));
        Node blockNode = new Node(Token.BLOCK, new Node(Token.RETURN, callEval));
        Node fnNode = new Node(Token.FUNCTION, nameNode, paramNode, blockNode);

        boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
        assertFalse("Function referencing 'eval' should be rejected", result);
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_EmptyBlock() {
        // ฟังก์ชันตัวบล็อกว่าง: function f() {}
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramNode = new Node(Token.PARAM_LIST);
        Node blockNode = new Node(Token.BLOCK);
        Node fnNode = new Node(Token.FUNCTION, nameNode, paramNode, blockNode);

        assertTrue("Empty function block should allow direct replacement", 
                injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_SingleReturn() {
        // ฟังก์ชัน return ค่าเดียว: function f() { return 5; }
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramNode = new Node(Token.PARAM_LIST);
        Node blockNode = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(5)));
        Node fnNode = new Node(Token.FUNCTION, nameNode, paramNode, blockNode);

        assertTrue("Single return statement function should allow direct replacement", 
                injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_MultipleStatements() {
        // ฟังก์ชันที่มีหลายคำสั่ง: function f() { var x = 1; return x; }
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramNode = new Node(Token.PARAM_LIST);
        Node blockNode = new Node(Token.BLOCK, 
                new Node(Token.VAR, Node.newString(Token.NAME, "x")),
                new Node(Token.RETURN, Node.newString(Token.NAME, "x")));
        Node fnNode = new Node(Token.FUNCTION, nameNode, paramNode, blockNode);

        assertFalse("Multi-statement function should not allow direct replacement", 
                injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testInliningLowersCost_ZeroReferences() {
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramNode = new Node(Token.PARAM_LIST);
        Node blockNode = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)));
        Node fnNode = new Node(Token.FUNCTION, nameNode, paramNode, blockNode);

        boolean lowers = injector.inliningLowersCost(
                null, fnNode, Collections.<FunctionInjector.Reference>emptySet(), 
                new HashSet<String>(), true, false
        );
        assertTrue("Zero references should trivially return true for lowering cost", lowers);
    }

    @Test
    public void testSetKnownConstants_StateCheck() {
        Set<String> constants = Sets.newHashSet("CONST_A");
        // ทดสอบการเซ็ตค่าครั้งแรกต้องไม่พ่น Exception
        injector.setKnownConstants(constants);

        // ทดสอบ Edge Case: การเรียกซ้ำต้องโยก IllegalStateException ตาม Preconditions.checkState
        try {
            injector.setKnownConstants(Sets.newHashSet("CONST_B"));
            fail("Expected IllegalStateException when setting known constants twice");
        } catch (IllegalStateException e) {
            // Expected
        }
    }
}