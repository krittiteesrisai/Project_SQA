package com.google.javascript.jscomp;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for LiveVariablesAnalysis (Defects4J Closure-58)
 */
public class LiveVariablesAnalysisTest {

  private Compiler compiler;
  private Scope scope;
  private ControlFlowGraph<Node> cfg;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // สร้างโครงสร้างฟังก์ชันจำลอง: function(a, b) { var x = 1; x += 2; }
    Node functionRoot = new Node(Token.FUNCTION, 
        new Node(Token.NAME, "testFunc"),
        new Node(Token.LP, new Node(Token.NAME, "a"), new Node(Token.NAME, "b")),
        new Node(Token.BLOCK,
            new Node(Token.VAR, Node.newString(Token.NAME, "x").copyInformationFromForTree(new Node(Token.NUMBER, "1"))),
            new Node(Token.ASSIGN, 
                Node.newString(Token.NAME, "x"), 
                new Node(Token.NUMBER, "5"))
        )
    );
    
    // สร้าง Scope พื้นฐาน
    scope = new Scope(null, functionRoot);
    scope.declare("a", null, null, null);
    scope.declare("b", null, null, null);
    scope.declare("x", null, null, null);
    scope.declare("arguments", null, null, null); // สำหรับทดสอบ arguments alias

    cfg = new ControlFlowGraph<>(new Node(Token.BLOCK));
  }

  @Test
  public void testLatticeOperationsAndEdgeCases() {
    LiveVariablesAnalysis.LiveVariableLattice lattice1 = 
        new LiveVariablesAnalysis.LiveVariableLattice(scope.getVarCount());
    LiveVariablesAnalysis.LiveVariableLattice lattice2 = 
        new LiveVariablesAnalysis.LiveVariableLattice(lattice1);

    // Test Equals & Preconditions (Edge cases: Null checks)
    assertTrue(lattice1.equals(lattice2));
    assertFalse(lattice1.equals("NotALatticeObject"));

    Var varX = scope.getVar("x");
    assertFalse(lattice1.isLive(varX));
    assertFalse(lattice1.isLive(0));

    // Test JoinOp apply
    List<LiveVariablesAnalysis.LiveVariableLattice> lattices = new ArrayList<>();
    lattices.add(lattice1);
    lattices.add(lattice2);
    
    LiveVariablesAnalysis.LiveVariableJoinOp joinOp = new LiveVariablesAnalysis.LiveVariableJoinOp();
    LiveVariablesAnalysis.LiveVariableLattice resultLattice = joinOp.apply(lattices);
    assertNotNull(resultLattice);
  }

  @Test(expected = NullPointerException.class)
  public void testLatticeNullOtherCheck() {
    LiveVariablesAnalysis.LiveVariableLattice lattice1 = 
        new LiveVariablesAnalysis.LiveVariableLattice(scope.getVarCount());
    lattice1.equals(null);
  }

  @Test
  public void testAnalysisInitializationAndEscaped() {
    LiveVariablesAnalysis analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    assertNotNull(analysis.getEscapedLocals());
    assertFalse(analysis.isForward());
    assertNotNull(analysis.createEntryLattice());
    assertNotNull(analysis.createInitialEstimateLattice());
    
    int varIndex = analysis.getVarIndex("x");
    assertEquals(scope.getVar("x").index, varIndex);
  }

  @Test
  public void testFlowThroughWithExceptionEdge() {
    LiveVariablesAnalysis analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    Node assignNode = new Node(Token.ASSIGN, 
        Node.newString(Token.NAME, "x"), 
        new Node(Token.NUMBER, "10"));

    // จำลอง Edge ที่เกิด Exception (Branch.ON_EX) เพื่อให้ conditional = true
    DiGraphEdge<Node, Branch> edge = cfg.connect(assignNode, Branch.ON_EX, new Node(Token.BLOCK));
    
    LiveVariablesAnalysis.LiveVariableLattice inputLattice = 
        new LiveVariablesAnalysis.LiveVariableLattice(scope.getVarCount());
    
    LiveVariablesAnalysis.LiveVariableLattice outputLattice = analysis.flowThrough(assignNode, inputLattice);
    assertNotNull(outputLattice);
  }

  @Test
  public void testComputeGenKillSpecialNodesAndConditions() {
    LiveVariablesAnalysis analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariablesAnalysis.LiveVariableLattice inputLattice = 
        new LiveVariablesAnalysis.LiveVariableLattice(scope.getVarCount());

    // 1. Test SCRIPT, BLOCK, FUNCTION nodes (should return immediately)
    Node blockNode = new Node(Token.BLOCK);
    assertNotNull(analysis.flowThrough(blockNode, inputLattice));

    // 2. Test WHILE / IF / DO nodes with condition
    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK));
    assertNotNull(analysis.flowThrough(ifNode, inputLattice));

    // 3. Test FOR loop (Standard vs For-In)
    Node forStandard = new Node(Token.FOR, 
        new Node(Token.EMPTY), new Node(Token.TRUE), new Node(Token.EMPTY), new Node(Token.BLOCK));
    assertNotNull(analysis.flowThrough(forStandard, inputLattice));

    // Test For-In: for(var x in y)
    Node varNodeForIn = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    Node forInNode = new Node(Token.FOR, varNodeForIn, new Node(Token.NAME, "a"), new Node(Token.BLOCK));
    assertNotNull(analysis.flowThrough(forInNode, inputLattice));

    // 4. Test AND / OR / HOOK (Ternary) short-circuit branches
    Node andNode = new Node(Token.AND, new Node(Token.NAME, "a"), new Node(Token.NAME, "x"));
    assertNotNull(analysis.flowThrough(andNode, inputLattice));

    Node hookNode = new Node(Token.HOOK, new Node(Token.TRUE), new Node(Token.NAME, "a"), new Node(Token.NAME, "x"));
    assertNotNull(analysis.flowThrough(hookNode, inputLattice));

    // 5. Test Arguments Name triggering markAllParametersEscaped
    Node argumentsNode = new Node(Token.NAME, "arguments");
    assertNotNull(analysis.flowThrough(argumentsNode, inputLattice));

    // 6. Test Assignment Op with read (e.g., ADD Assign: x += 1)
    Node addAssignNode = new Node(Token.ADD, 
        Node.newString(Token.NAME, "x"), 
        new Node(Token.NUMBER, "1"));
    assertNotNull(analysis.flowThrough(addAssignNode, inputLattice));
  }

  @Test
  public void testUndeclaredAndUnescapedVariables() {
    LiveVariablesAnalysis analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariablesAnalysis.LiveVariableLattice inputLattice = 
        new LiveVariablesAnalysis.LiveVariableLattice(scope.getVarCount());

    // ตัวแปรที่ไม่เคยประกาศใน scope (ทดสอบเงื่อนไข !jsScope.isDeclared)
    Node undeclaredNode = new Node(Token.NAME, "undeclaredVar");
    assertNotNull(analysis.flowThrough(undeclaredNode, inputLattice));
  }
}