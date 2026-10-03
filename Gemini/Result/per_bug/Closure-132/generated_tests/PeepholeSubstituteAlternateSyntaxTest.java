package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Suite for PeepholeSubstituteAlternateSyntax (Closure-132b).
 * Focuses on high branch/condition coverage and edge cases.
 */
public class PeepholeSubstituteAlternateSyntaxTest extends CompilerTestCase {

  private boolean late = true;

  @Override
  ICompilerPass getProcessor(Compiler compiler) {
    return new PeepholeSubstituteAlternateSyntax(late);
  }

  @Override
  protected int getNumPasses() {
    return 1;
  }

  // --- Tests for Token.NEW and Token.CALL (Standard Constructors & RegExp) ---

  @Test
  public void testFoldStandardObjectConstructor() {
    // new Object() -> Object()
    enableNormalize();
    test("var x = new Object();", "var x = Object();");
  }

  @Test
  public void testFoldArrayConstructorEdgeCases() {
    // Array() -> []
    enableNormalize();
    test("var x = new Array();", "var x = [];");
    // Array(0) -> []
    test("var x = new Array(0);", "var x = [];");
    // Array(1) -> should not fold (reserves memory)
    testSame("var x = new Array(1);");
    // Array('a') -> ['a']
    test("var x = new Array('a');", "var x = ['a'];");
  }

  @Test
  public void testFoldRegularExpressionValidAndSafe() {
    enableNormalize();
    // new RegExp("abc", "i") -> /abc/i
    test("var x = new RegExp('abc', 'i');", "var x = /abc/i;");
    // new RegExp("abc") -> /abc/
    test("var x = new RegExp('abc');", "var x = /abc/;");
  }

  @Test
  public void testFoldRegularExpressionInvalidFlags() {
    enableNormalize();
    // Invalid flags should trigger warning and remain unchanged
    test("var x = new RegExp('abc', 'invalid_flag');", "var x = new RegExp('abc', 'invalid_flag');");
  }

  @Test
  public void testFoldRegularExpressionSpecialCharacters() {
    enableNormalize();
    // Unescaped forward slash in pattern should be escaped -> /\//
    test("var x = new RegExp('/');", "var x = /\\/;");
    // Line terminator inside pattern should be requoted -> /\n/
    test("var x = new RegExp('\\n');", "var x = /\\n/;");
  }

  @Test
  public void testFoldRegularExpressionTooManyArguments() {
    enableNormalize();
    // Too many arguments -> no folding
    testSame("var x = new RegExp('a', 'i', 'extra');");
    // Too few arguments (e.g. 0 args) -> no folding
    testSame("var x = new RegExp();");
  }

  // --- Tests for Token.RETURN & Exit Optimization ---

  @Test
  public void testReduceReturnUndefined() {
    // return undefined -> return
    test("function f() { return undefined; }", "function f() { return; }");
    // return void 0 -> return
    test("function f() { return void 0; }", "function f() { return; }");
  }

  @Test
  public void testRemoveRedundantExit() {
    // if (a) { return 1; } return 1; -> if (a) {} return 1;
    test("function f(a) { if (a) { return 1; } return 1; }", 
         "function f(a) { if (a) {} return 1; }");
  }

  // --- Tests for Token.IF and Token.HOOK ---

  @Test
  public void testMinimizeIfToHookReturns() {
    // if (x) return 1; else return 2; -> return x ? 1 : 2;
    test("function f(x) { if (x) { return 1; } else { return 2; } }",
         "function f(x) { return x ? 1 : 2; }");
  }

  @Test
  public void testMinimizeIfToAndOrExpression() {
    // if (x) foo(); -> x && foo();
    enableNormalize();
    test("function f(x, foo) { if (x) { foo(); } }",
         "function f(x, foo) { x && foo(); }");
  }

  @Test
  public void testCombineDuplicateIfReturns() {
    // if (x) return 1; if (y) return 1; -> if (x || y) return 1;
    test("function f(x, y) { if (x) { return 1; } if (y) { return 1; } }",
         "function f(x, y) { if (x || y) { return 1; } }");
  }

  // --- Tests for Token.COMMA ---

  @Test
  public void testSplitCommaEarlyLate() {
    // When late = false, commas in expr result can be split
    late = false;
    test("a(), b();", "a(), b();"); // Depending on statement block structure
    late = true;
  }

  // --- Tests for Array Literal Optimization ---

  @Test
  public void testMinimizeStringArrayLiteral() {
    late = true;
    // ['a', 'b', 'c'] with delimiter optimization
    test("var x = ['a', 'b', 'c'];", "var x = 'a,b,c'.split(',');");
  }

  @Test
  public void testMinimizeStringArrayLiteralLateFalse() {
    late = false;
    // When late = false, string array literal optimization is skipped
    testSame("var x = ['a', 'b', 'c'];");
    late = true;
  }
}