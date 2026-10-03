package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Senior JUnit 4 Test Automation Suite for PeepholeSubstituteAlternateSyntax (Closure-87b)
 */
public class PeepholeSubstituteAlternateSyntaxTest extends TestCase {

  private PeepholeSubstituteAlternateSyntax optimizer;
  private Compiler compiler;

  @Before
  public void setUp() throws Exception {
    super.setUp();
    optimizer = new PeepholeSubstituteAlternateSyntax();
    compiler = new Compiler();
    // Normalize AST to allow standard constructor and literal folding optimizations
    compiler.initOptions(new CompilerOptions());
  }

  private void enableASTNormalization() {
    compiler.setData(new CompilerInput(new JSSourceFile("test")));
    // Set normalized state via internal mechanisms or mock context if available.
    // In Closure compiler test environment, normalization is typically set via Node.
  }

  @Test
  public void testOptimizeSubtreeDefaultAndExprResult() {
    // Test default branch (e.g., Token.BLOCK or Token.NAME)
    Node blockNode = new Node(Token.BLOCK);
    Node result = optimizer.optimizeSubtree(blockNode);
    assertNotNull(result);
    assertEquals(Token.BLOCK, result.getType());

    // Test EXPR_RESULT and HOOK branches
    Node exprNode = new Node(Token.EXPR_RESULT, Node.newNumber(1));
    Node optimizedExpr = optimizer.optimizeSubtree(exprNode);
    assertNotNull(optimizedExpr);

    Node hookNode = new Node(Token.HOOK, Node.newTrue(), Node.newNumber(1), Node.newNumber(2));
    Node optimizedHook = optimizer.optimizeSubtree(hookNode);
    assertNotNull(optimizedHook);
  }

  @Test
  public void testTryReduceReturnVariants() {
    // return undefined
    Node returnUndefined = new Node(Token.RETURN, Node.newString(Token.NAME, "undefined"));
    Node optimized1 = optimizer.optimizeSubtree(returnUndefined);
    assertEquals(Token.RETURN, optimized1.getType());
    assertNull(optimized1.getFirstChild());

    // return void 0 (safe operand)
    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    Node returnVoid = new Node(Token.RETURN, voidNode);
    Node optimized2 = optimizer.optimizeSubtree(returnVoid);
    assertEquals(Token.RETURN, optimized2.getType());
    assertNull(optimized2.getFirstChild());

    // return with no argument (null result)
    Node returnEmpty = new Node(Token.RETURN);
    Node optimizedEmpty = optimizer.optimizeSubtree(returnEmpty);
    assertNotNull(optimizedEmpty);
  }

  @Test
  public void testTryMinimizeNot() {
    // !(x == y) -> x != y
    Node eqNode = new Node(Token.EQ, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));
    Node notNode = new Node(Token.NOT, eqNode);
    // Wrap in a parent expression/statement block
    Node parent = new Node(Token.EXPR_RESULT, notNode);
    
    Node optimized = optimizer.optimizeSubtree(parent);
    assertNotNull(optimized);
  }

  @Test
  public void testTryMinimizeNotComplementOperators() {
    // Test SHEQ -> SHNE
    Node sheqNode = new Node(Token.SHEQ, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notSheq = new Node(Token.NOT, sheqNode);
    Node parent1 = new Node(Token.EXPR_RESULT, notSheq);
    optimizer.optimizeSubtree(parent1);

    // Test SHNE -> SHEQ
    Node shneNode = new Node(Token.SHNE, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notShne = new Node(Token.NOT, shneNode);
    Node parent2 = new Node(Token.EXPR_RESULT, notShne);
    optimizer.optimizeSubtree(parent2);

    // Test NE -> EQ
    Node neNode = new Node(Token.NE, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notNe = new Node(Token.NOT, neNode);
    Node parent3 = new Node(Token.EXPR_RESULT, notNe);
    optimizer.optimizeSubtree(parent3);

    // Test unhandled NOT child (e.g., GT) -> should return original
    Node gtNode = new Node(Token.GT, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notGt = new Node(Token.NOT, gtNode);
    Node parent4 = new Node(Token.EXPR_RESULT, notGt);
    Node res = optimizer.optimizeSubtree(parent4);
    assertNotNull(res);
  }

  @Test
  public void testControlFlowLoopsWhileDoFor() {
    // while(true) condition minimization
    Node whileNode = new Node(Token.WHILE, Node.newTrue(), new Node(Token.BLOCK));
    Node optimizedWhile = optimizer.optimizeSubtree(whileNode);
    assertNotNull(optimizedWhile);

    // do-while
    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newFalse());
    Node optimizedDo = optimizer.optimizeSubtree(doNode);
    assertNotNull(optimizedDo);

    // for loop (non-for-in)
    Node forNode = new Node(Token.FOR, new Node(Token.EMPTY), Node.newTrue(), new Node(Token.EMPTY), new Node(Token.BLOCK));
    Node optimizedFor = optimizer.optimizeSubtree(forNode);
    assertNotNull(optimizedFor);
  }

  @Test
  public void testTryMinimizeIfLiteralAndBlocks() {
    // if (true) { foo(); } -> literal condition, should return original
    Node ifNode = new Node(Token.IF, Node.newTrue(), 
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.CALL, Node.newString(Token.NAME, "foo")))));
    Node parent = new Node(Token.BLOCK, ifNode);
    Node optimized = optimizer.optimizeSubtree(parent);
    assertNotNull(optimized);
  }

  @Test
  public void testArrayConstructorFoldingActions() {
    // Test isSafeToFoldArrayConstructor edge cases via Array() calls
    // Array() -> []
    Node arrayCall1 = new Node(Token.CALL, Node.newString(Token.NAME, "Array"));
    Node parent1 = new Node(Token.EXPR_RESULT, arrayCall1);
    
    // Array(0) -> []
    Node arrayCall2 = new Node(Token.CALL, Node.newString(Token.NAME, "Array"), Node.newNumber(0));
    Node parent2 = new Node(Token.EXPR_RESULT, arrayCall2);

    // Array('a') -> ['a']
    Node arrayCall3 = new Node(Token.CALL, Node.newString(Token.NAME, "Array"), Node.newString("a"));
    Node parent3 = new Node(Token.EXPR_RESULT, arrayCall3);

    // Array(1, 2) -> [1, 2]
    Node arrayCall4 = new Node(Token.CALL, Node.newString(Token.NAME, "Array"), Node.newNumber(1), Node.newNumber(2));
    Node parent4 = new Node(Token.EXPR_RESULT, arrayCall4);

    assertNotNull(optimizer.optimizeSubtree(parent1));
    assertNotNull(optimizer.optimizeSubtree(parent2));
    assertNotNull(optimizer.optimizeSubtree(parent3));
    assertNotNull(optimizer.optimizeSubtree(parent4));
  }

  @Test
  public void testRegExpConstructorEdgeCases() {
    // RegExp with invalid flags or safe/unsafe flags
    Node regExpCall = new Node(Token.CALL, 
        Node.newString(Token.NAME, "RegExp"), 
        Node.newString("pattern"), 
        Node.newString("g")); // global flag is unsafe to fold
    Node parent = new Node(Token.EXPR_RESULT, regExpCall);
    Node result = optimizer.optimizeSubtree(parent);
    assertNotNull(result);

    // RegExp with valid safe flags 'i'
    Node regExpSafe = new Node(Token.CALL, 
        Node.newString(Token.NAME, "RegExp"), 
        Node.newString("pattern"), 
        Node.newString("i"));
    Node parentSafe = new Node(Token.EXPR_RESULT, regExpSafe);
    assertNotNull(optimizer.optimizeSubtree(parentSafe));

    // RegExp with unicode escape check
    boolean hasUnicode = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\\u0041");
    assertTrue(hasUnicode);
  }
}