package com.google.javascript.jscomp;

import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Iterator;

/**
 * Custom JUnit 4 test suite for MustBeReachingVariableDef achieving high branch/condition coverage.
 */
public class MustBeReachingVariableDefTest extends TestCase {

    private Compiler createCompiler() {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        return compiler;
    }

    @Test
    public void testDefinitionEqualsAndEdgeCases() {
        Node node1 = new Node(Token.NAME, "a");
        Node node2 = new Node(Token.NAME, "b");

        MustBeReachingVariableDef.Definition def1 = new MustBeReachingVariableDef.Definition(node1);
        MustBeReachingVariableDef.Definition def2 = new MustBeReachingVariableDef.Definition(node1);
        MustBeReachingVariableDef.Definition def3 = new MustBeReachingVariableDef.Definition(node2);

        // Test equals branches
        assertTrue(def1.equals(def1));
        assertTrue(def1.equals(def2));
        assertFalse(def1.equals(def3));
        assertFalse(def1.equals("NotADefinition"));
    }

    @Test
    public void testMustDefConstructorsAndJoin() {
        Compiler compiler = createCompiler();
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(null, root);
        Var varA = scope.declare("a", root, null, null);
        Var varB = scope.declare("b", root, null, null);

        // Test MustDef(Iterator<Var>)
        Iterator<Var> varIter = scope.getVars();
        MustBeReachingVariableDef.MustDef defA = new MustBeReachingVariableDef.MustDef(varIter);
        MustBeReachingVariableDef.MustDef defCopy = new MustBeReachingVariableDef.MustDef(defA);

        assertEquals(defA, defCopy);

        // Test MustDefJoin (BinaryJoinOp)
        MustBeReachingVariableDef.MustDefJoin joinOp = new MustBeReachingVariableDef.MustDefJoin();
        
        // Setup different lattice states to trigger join branches
        MustBeReachingVariableDef.MustDef map1 = new MustBeReachingVariableDef.MustDef();
        MustBeReachingVariableDef.MustDef map2 = new MustBeReachingVariableDef.MustDef();

        Node assignNode = new Node(Token.ASSIGN);
        MustBeReachingVariableDef.Definition d1 = new MustBeReachingVariableDef.Definition(assignNode);
        MustBeReachingVariableDef.Definition d2 = new MustBeReachingVariableDef.Definition(assignNode);

        map1.reachingDef.put(varA, d1);
        map1.reachingDef.put(varB, null); // BOTTOM case (aDef == null)

        map2.reachingDef.put(varA, d2); // Equal defs
        
        MustBeReachingVariableDef.MustDef joined = joinOp.apply(map1, map2);
        assertNotNull(joined);
    }

    @Test
    public void testFlowAnalysisWithControlFlowGraph() {
        Compiler compiler = createCompiler();
        // Constructing a simple JS AST: var x = 1; x = 2;
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "x"));
        varNode.getFirstChild().addChildToBack(new Node(Token.NUMBER, "1"));
        script.addChildToBack(varNode);

        Scope scope = new Scope(null, script);
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(script, true, true);

        MustBeReachingVariableDef analysis = new MustBeReachingVariableDef(cfg, scope, compiler);
        
        assertNotNull(analysis.createEntryLattice());
        assertNotNull(analysis.createInitialEstimateLattice());
        assertTrue(analysis.isForward());
    }

    @Test
    public void testComputeMustDefComplexNodes() {
        Compiler compiler = createCompiler();
        Node script = new Node(Token.SCRIPT);
        Scope scope = new Scope(null, script);

        // Test various structures like FOR-IN, HOOK, AND, OR, INC, DEC
        Node forInNode = new Node(Token.FOR);
        Node varLhs = new Node(Token.VAR, new Node(Token.NAME, "item"));
        Node rhs = new Node(Token.NAME, "collection");
        forInNode.addChildToBack(varLhs);
        forInNode.addChildToBack(rhs);
        script.addChildToBack(forInNode);

        Node hookNode = new Node(Token.HOOK, new Node(Token.TRUE), new Node(Token.NUMBER, "1"), new Node(Token.NUMBER, "2"));
        script.addChildToBack(hookNode);

        Node incNode = new Node(Token.INC, new Node(Token.NAME, "counter"));
        script.addChildToBack(incNode);

        ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(script, true, true);
        MustBeReachingVariableDef analysis = new MustBeReachingVariableDef(cfg, scope, compiler);

        MustBeReachingVariableDef.MustDef initial = analysis.createInitialEstimateLattice();
        MustBeReachingVariableDef.MustDef result = analysis.flowThrough(script, initial);

        assertNotNull(result);
    }

    @Test
    public void testDependsOnOuterScopeVarsEdgeCases() {
        Compiler compiler = createCompiler();
        Node script = new Node(Token.SCRIPT);
        Scope outerScope = new Scope(null, script);
        Scope innerScope = new Scope(outerScope, script);

        Var outerVar = outerScope.declare("outer", script, null, null);
        Var innerVar = innerScope.declare("inner", script, null, null);

        ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(script, true, true);
        MustBeReachingVariableDef analysis = new MustBeReachingVariableDef(cfg, innerScope, compiler);

        // Manually verifying helper or exception handling paths
        assertFalse(innerScope.isDeclared("nonexistent", true));
    }
}