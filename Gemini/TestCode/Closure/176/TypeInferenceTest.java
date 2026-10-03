package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableMap;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for TypeInference (Closure-176b)
 */
public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private ReverseAbstractInterpreter reverseInterpreter;
  private Scope functionScope;
  private ControlFlowGraph<Node> cfg;
  private Map<String, CodingConvention.AssertionFunctionSpec> assertionFunctionsMap;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // Initialize basic compiler options / init
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    
    // Create a dummy root node for function scope
    Node rootNode = new Node(Token.FUNCTION, new Node(Token.NAME, "testFunc"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    functionScope = new Scope(rootNode, compiler.getCodingConvention());
    
    // Dummy ControlFlowGraph
    cfg = new ControlFlowGraph<>(rootNode);
    reverseInterpreter = new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    assertionFunctionsMap = Collections.emptyMap();
  }

  private TypeInference createTypeInference() {
    return new TypeInference(compiler, cfg, reverseInterpreter, functionScope, assertionFunctionsMap);
  }

  @Test
  public void testFlowThroughBottomScopeEdgeCase() {
    TypeInference inference = createTypeInference();
    FlowScope bottom = inference.createInitialEstimateLattice();
    FlowScope result = inference.flowThrough(new Node(Token.BLOCK), bottom);
    assertSame("Bottom scope should pass through directly", bottom, result);
  }

  @Test
  public void testTraverseAssignAndName() {
    TypeInference inference = createTypeInference();
    FlowScope entry = inference.createEntryLattice();

    // Construct: x = 5
    Node nameNode = Node.newString(Token.NAME, "x");
    Node numberNode = Node.newNumber(5.0);
    numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    
    Node assignNode = new Node(Token.ASSIGN, nameNode, numberNode);
    assignNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    FlowScope resultScope = inference.flowThrough(assignNode, entry);
    assertNotNull(resultScope);
  }

  @Test
  public void testTraverseAddScenarios() {
    TypeInference inference = createTypeInference();
    FlowScope entry = inference.createEntryLattice();

    // Case 1: String + Number -> String
    Node leftStr = Node.newString("hello");
    leftStr.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    Node rightNum = Node.newNumber(1.0);
    rightNum.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node addNode = new Node(Token.ADD, leftStr, rightNum);
    FlowScope res = inference.flowThrough(addNode, entry);
    assertNotNull(res);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addNode.getJSType());

    // Case 2: Number + Number -> Number
    Node leftNum = Node.newNumber(1.0);
    leftNum.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node addNumNode = new Node(Token.ADD, leftNum, rightNum);
    inference.flowThrough(addNumNode, entry);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNumNode.getJSType());
  }

  @Test
  public void testTraverseHookTernary() {
    TypeInference inference = createTypeInference();
    FlowScope entry = inference.createEntryLattice();

    Node cond = Node.newString(Token.NAME, "cond");
    cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
    Node trueNode = Node.newNumber(1.0);
    trueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node falseNode = Node.newNumber(2.0);
    falseNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node hook = new Node(Token.HOOK, cond, trueNode, falseNode);
    FlowScope res = inference.flowThrough(hook, entry);
    assertNotNull(res);
  }

  @Test
  public void testTraverseCatchBlock() {
    TypeInference inference = createTypeInference();
    FlowScope entry = inference.createEntryLattice();

    Node catchName = Node.newString(Token.NAME, "err");
    Node catchNode = new Node(Token.CATCH, catchName);

    FlowScope res = inference.flowThrough(catchNode, entry);
    assertNotNull(res);
  }

  @Test
  public void testBranchedFlowThroughEmptyEdges() {
    TypeInference inference = createTypeInference();
    FlowScope entry = inference.createEntryLattice();
    Node expr = new Node(Token.EXPR_RESULT, Node.newNumber(1.0));

    List<FlowScope> branched = inference.branchedFlowThrough(expr, entry);
    assertNotNull(branched);
  }
}