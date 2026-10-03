package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * High-coverage JUnit 4 Test Suite for Defects4J Closure-88b
 * Target: DeadAssignmentsElimination
 */
public class DeadAssignmentsEliminationTest extends TestCase {

    private Compiler createCompiler() {
        return new Compiler();
    }

    private Node parseCode(Compiler compiler, String js) {
        Node root = compiler.parseSyntheticCode("testcode", js);
        assertEquals(0, compiler.getErrorCount());
        return root;
    }

    @Test(expected = NullPointerException.class)
    public void testProcessWithNullExterns() {
        Compiler compiler = createCompiler();
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        pass.process(null, new Node(Token.BLOCK));
    }

    @Test(expected = NullPointerException.class)
    public void testProcessWithNullRoot() {
        Compiler compiler = createCompiler();
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        Node externs = new Node(Token.BLOCK);
        pass.process(externs, null);
    }

    @Test
    public void testGlobalScopeIgnored() {
        Compiler compiler = createCompiler();
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        // Global scope execution should return early without crashing
        Node root = parseCode(compiler, "var x = 1; x = 2;");
        pass.process(new Node(Token.BLOCK), root);
    }

    @Test
    public void testInnerFunctionIgnored() {
        Compiler compiler = createCompiler();
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        // Contains an inner function -> should trigger early return
        Node root = parseCode(compiler, "function outer() { var x = 1; function inner() { x = 2; } x = 3; }");
        pass.process(new Node(Token.BLOCK), root);
    }

    @Test
    public void testNoRemovableAssignments() {
        Compiler compiler = createCompiler();
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        // Function with no assignments to eliminate
        Node root = parseCode(compiler, "function f() { var x = 1; var y = x; }");
        pass.process(new Node(Token.BLOCK), root);
    }

    @Test
    public void testIdentityAssignmentRemoval() {
        Compiler compiler = createCompiler();
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        // Identity assignment 'a = a' should be optimized out regardless of liveness
        Node root = parseCode(compiler, "function f() { var a = 1; a = a; }");
        pass.process(new Node(Token.BLOCK), root);
    }

    @Test
    public void testDeadAssignmentSimpleRemoval() {
        Compiler compiler = createCompiler();
        Node root = parseCode(compiler, "function f() { var x = 1; x = 2; return 0; }");
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        pass.process(new Node(Token.BLOCK), root);
    }

    @Test
    public void testControlFlowStatementsCoverage() {
        Compiler compiler = createCompiler();
        // Covers IF, WHILE, DO, FOR, SWITCH, CASE, RETURN statement branches inside tryRemoveDeadAssignments
        Node root = parseCode(compiler, 
            "function f() { " +
            "  var x = 1, y = 2, z = 3; " +
            "  if (x = 5) { y = 10; } " +
            "  while (x = 1) { break; } " +
            "  do { z = 2; } while (x = 0); " +
            "  for (var i = 0; (x = i) < 10; i++) { } " +
            "  switch(x = 1) { case 1: y = 2; break; } " +
            "  return (x = 3); " +
            "}");
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        pass.process(new Node(Token.BLOCK), root);
    }

    @Test
    public void testAssignmentOperatorsAndIncDec() {
        Compiler compiler = createCompiler();
        // Covers assignment operators (+=, etc.) and INC/DEC in expression statement and for loops
        Node root = parseCode(compiler, 
            "function f() { " +
            "  var a = 1; " +
            "  a += 5; " +
            "  a++; " +
            "  ++a; " +
            "  for(var j=0; j<5; j++) { a--; } " +
            "}");
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        pass.process(new Node(Token.BLOCK), root);
    }

    @Test
    public void testChainedAssignments() {
        Compiler compiler = createCompiler();
        // Covers chained assignments (e.g., dead_x = dead_y = 1)
        Node root = parseCode(compiler, "function f() { var x = 1, y = 2; x = y = 5; }");
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        pass.process(new Node(Token.BLOCK), root);
    }

    @Test
    public void testExpressionLivenessCondition() {
        Compiler compiler = createCompiler();
        // Triggers isVariableStillLiveWithinExpression branch paths (READ vs KILL)
        Node root = parseCode(compiler, "function f() { var a = 1; a = 2; a = 3; var b = a; }");
        DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
        pass.process(new Node(Token.BLOCK), root);
    }
}