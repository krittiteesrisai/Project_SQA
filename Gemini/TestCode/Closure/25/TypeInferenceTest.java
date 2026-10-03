package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Advanced JUnit 4 Test Suite for TypeInference (Closure-25b)
 * Achieving high branch/condition coverage and edge case fault triggering.
 */
public class TypeInferenceTest extends TestCase {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private ReverseAbstractInterpreter reverseInterpreter;
  private Scope syntacticScope;
  private ControlFlowGraph<Node> cfg;
  private Map<String, AssertionFunctionSpec> assertionFunctionsMap;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    reverseInterpreter = new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry);
    syntacticScope = new Scope(new Node(Token.BLOCK), registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    cfg = new ControlFlowGraph<>(new Node(Token.BLOCK), true, true);
    assertionFunctionsMap = new HashMap<>();
  }

  @Test
  public void testConstructorWithUnflowableAndFlowableVars() {
    // Edge case: Test unbound vars with unflowable vs flowable states
    Node root = new Node(Token.BLOCK);
    Scope scope = new Scope(root, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
    Var var = scope.declare("unboundVar", new Node(Token.NAME, "unboundVar"), null, syntacticScope);
    
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, scope, assertionFunctionsMap);
    assertNotNull(inference.createInitialEstimateLattice());
    assertNotNull(inference.createEntryLattice());
  }

  @Test
  public void testFlowThroughBottomScope() {
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope bottom = inference.createInitialEstimateLattice();
    Node node = new Node(Token.NUMBER, "1");
    FlowScope result = inference.flowThrough(node, bottom);
    assertSame(bottom, result);
  }

  @Test
  public void testBranchedFlowThroughForInAndConditions() {
    // Test branch execution for FOR-IN node and short-circuit operators
    Node nameNode = new Node(Token.NAME, "item");
    Node objNode = new Node(Token.NAME, "obj");
    Node forInNode = new Node(Token.FOR, nameNode, objNode);
    
    cfg.createNode(forInNode);
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope entry = inference.createEntryLattice();
    
    List<FlowScope> results = inference.branchedFlowThrough(forInNode, entry);
    assertNotNull(results);
  }

  @Test
  public void testTraverseAssignAndName() {
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope entry = inference.createEntryLattice();

    Node name = new Node(Token.NAME, "x");
    Node num = new Node(Token.NUMBER, "5");
    Node assign = new Node(Token.ASSIGN, name, num);
    
    FlowScope result = inference.flowThrough(assign, entry);
    assertNotNull(result);
  }

  @Test
  public void testTraverseAddAndNumericOperations() {
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope entry = inference.createEntryLattice();

    Node left = new Node(Token.NUMBER, "1");
    Node right = new Node(Token.NUMBER, "2");
    Node add = new Node(Token.ADD, left, right);

    FlowScope result = inference.flowThrough(add, entry);
    assertNotNull(result);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), add.getJSType());
  }

  @Test
  public void testTraverseStringAdd() {
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope entry = inference.createEntryLattice();

    Node left = new Node(Token.STRING, "hello");
    Node right = new Node(Token.NUMBER, "2");
    Node add = new Node(Token.ADD, left, right);
    left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    FlowScope result = inference.flowThrough(add, entry);
    assertNotNull(result);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), add.getJSType());
  }

  @Test
  public void testTraverseHookTernary() {
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope entry = inference.createEntryLattice();

    Node cond = new Node(Token.TRUE);
    Node trueNode = new Node(Token.NUMBER, "1");
    Node falseNode = new Node(Token.NUMBER, "2");
    Node hook = new Node(Token.HOOK, cond, trueNode, falseNode);

    FlowScope result = inference.flowThrough(hook, entry);
    assertNotNull(result);
  }

  @Test
  public void testTraverseCatch() {
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope entry = inference.createEntryLattice();

    Node catchName = new Node(Token.NAME, "e");
    Node catchNode = new Node(Token.CATCH, catchName);

    FlowScope result = inference.flowThrough(catchNode, entry);
    assertNotNull(result);
  }

  @Test
  public void testTraverseObjectLiteral() {
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope entry = inference.createEntryLattice();

    Node stringKey = new Node(Token.STRING_KEY, new Node(Token.NUMBER, "10"));
    stringKey.setString("a");
    Node objLit = new Node(Token.OBJECTLIT, stringKey);
    objLit.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));

    FlowScope result = inference.flowThrough(objLit, entry);
    assertNotNull(result);
  }

  @Test
  public void testTraverseReturn() {
    TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope, assertionFunctionsMap);
    FlowScope entry = inference.createEntryLattice();

    Node retVal = new Node(Token.NUMBER, "42");
    Node retNode = new Node(Token.RETURN, retVal);

    FlowScope result = inference.flowThrough(retNode, entry);
    assertNotNull(result);
  }

  @Test
  public void testGetBooleanOutcomes() {
    com.google.javascript.rhino.jstype.BooleanLiteralSet set1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    com.google.javascript.rhino.jstype.BooleanLiteralSet set2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;

    com.google.javascript.rhino.jstype.BooleanLiteralSet result = 
        TypeInference.getBooleanOutcomes(set1, set2, true);
    assertNotNull(result);
  }
}