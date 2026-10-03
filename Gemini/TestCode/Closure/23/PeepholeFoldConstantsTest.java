package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Robust JUnit 4 test suite for PeepholeFoldConstants (Closure-23b)
 * aiming for maximum branch/condition coverage and edge cases.
 */
public class PeepholeFoldConstantsTest {

  private AbstractCompiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // Default compiler configuration setup if needed
  }

  private void assertNodeEquals(Node expected, Node actual) {
    if (expected == null || actual == null) {
      assertEquals(expected, actual);
      return;
    }
    assertTrue("Nodes are not equivalent. Expected: " + expected.toStringTree() + " Actual: " + actual.toStringTree(),
        expected.isEquivalentTo(actual));
  }

  @Test
  public void testOptimizeSubtreeTokenTypes() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(true);

    // Token.NEW in forced string context -> tryFoldCtorCall
    Node newStr = IR.newnode(IR.name("String"), IR.string("test"));
    Node addNode = IR.add(IR.string(""), newStr);
    Node optimized = folder.optimizeSubtree(addNode);
    assertNotNull(optimized);

    // Token.TYPEOF
    Node typeofNode = IR.typeof(IR.string("hello"));
    Node optimizedTypeof = folder.optimizeSubtree(typeofNode);
    assertTrue(optimizedTypeof.isString());
    assertEquals("string", optimizedTypeof.getString());

    // Token.VOID
    Node voidNode = IR.voidNode(IR.number(5));
    Node optimizedVoid = folder.optimizeSubtree(voidNode);
    assertNotNull(optimizedVoid);
  }

  @Test
  public void testTryFoldTypeofEdgeCases() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // Literal types
    assertEquals("number", folder.optimizeSubtree(IR.typeof(IR.number(123))).getString());
    assertEquals("boolean", folder.optimizeSubtree(IR.typeof(IR.trueNode())).getString());
    assertEquals("boolean", folder.optimizeSubtree(IR.typeof(IR.falseNode())).getString());
    assertEquals("object", folder.optimizeSubtree(IR.typeof(IR.nullNode())).getString());
    assertEquals("object", folder.optimizeSubtree(IR.typeof(IR.objectLit())).getString());
    assertEquals("object", folder.optimizeSubtree(IR.typeof(IR.arrayLit())).getString());
    assertEquals("undefined", folder.optimizeSubtree(IR.typeof(IR.voidNode(IR.number(0)))).getString());
    assertEquals("undefined", folder.optimizeSubtree(IR.typeof(IR.name("undefined"))).getString());
    assertEquals("function", folder.optimizeSubtree(IR.typeof(new Node(com.google.javascript.rhino.Token.FUNCTION))).getString());

    // Non-literal argument should remain unchanged
    Node nonLiteral = IR.typeof(IR.name("x"));
    Node result = folder.optimizeSubtree(nonLiteral);
    assertEquals(nonLiteral, result);
  }

  @Test
  public void testTryFoldUnaryOperatorNotAndPosNeg() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // NOT folding (!true -> false)
    Node notNode = IR.not(IR.trueNode());
    Node foldedNot = folder.optimizeSubtree(notNode);
    assertTrue(foldedNot.isFalse());

    // POS folding (+5 -> 5) where numeric result
    Node posNode = IR.pos(IR.number(5));
    Node foldedPos = folder.optimizeSubtree(posNode);
    assertTrue(foldedPos.isNumber());
    assertEquals(5.0, foldedPos.getDouble(), 0.0);

    // NEG folding (-5 -> -5)
    Node negNode = IR.neg(IR.number(5));
    Node foldedNeg = folder.optimizeSubtree(negNode);
    assertTrue(foldedNeg.isNumber());
    assertEquals(-5.0, foldedNeg.getDouble(), 0.0);

    // NEG special names (Infinity, NaN)
    Node negInfinity = IR.neg(IR.name("Infinity"));
    assertNotNull(folder.optimizeSubtree(negInfinity));

    Node negNan = IR.neg(IR.name("NaN"));
    assertNotNull(folder.optimizeSubtree(negNan));

    // NEG non-number error
    Node negNonNum = IR.neg(IR.string("abc"));
    Node foldedNegErr = folder.optimizeSubtree(negNonNum);
    assertNotNull(foldedNegErr);
  }

  @Test
  public void testBitwiseNotOperator() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // ~5 -> -6
    Node bitnot = new Node(com.google.javascript.rhino.Token.BITNOT, IR.number(5));
    Node folded = folder.optimizeSubtree(bitnot);
    assertTrue(folded.isNumber());
    assertEquals(-6.0, folded.getDouble(), 0.0);

    // Out of range operand for bitwise
    Node outOfRange = new Node(com.google.javascript.rhino.Token.BITNOT, IR.number(1e12));
    assertNotNull(folder.optimizeSubtree(outOfRange));

    // Fractional bitwise operand
    Node fractional = new Node(com.google.javascript.rhino.Token.BITNOT, IR.number(5.5));
    assertNotNull(folder.optimizeSubtree(fractional));

    // Non-number bitwise operand
    Node nonNumBit = new Node(com.google.javascript.rhino.Token.BITNOT, IR.string("test"));
    assertNotNull(folder.optimizeSubtree(nonNumBit));
  }

  @Test
  public void testArithmeticOperations() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // Addition
    Node add = IR.add(IR.number(10), IR.number(20));
    Node foldedAdd = folder.optimizeSubtree(add);
    assertTrue(foldedAdd.isNumber());
    assertEquals(30.0, foldedAdd.getDouble(), 0.0);

    // Division by zero (should not fold)
    Node divByZero = new Node(com.google.javascript.rhino.Token.DIV, IR.number(10), IR.number(0));
    Node resDiv = folder.optimizeSubtree(divByZero);
    assertEquals(divByZero, resDiv);

    // Modulo by zero (should not fold)
    Node modByZero = new Node(com.google.javascript.rhino.Token.MOD, IR.number(10), IR.number(0));
    Node resMod = folder.optimizeSubtree(modByZero);
    assertEquals(modByZero, resMod);
  }

  @Test
  public void testShiftOperations() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // LSH: 5 << 2 -> 20
    Node lsh = new Node(com.google.javascript.rhino.Token.LSH, IR.number(5), IR.number(2));
    Node foldedLsh = folder.optimizeSubtree(lsh);
    assertTrue(foldedLsh.isNumber());
    assertEquals(20.0, foldedLsh.getDouble(), 0.0);

    // URSH: 5 >>> 1
    Node ursh = new Node(com.google.javascript.rhino.Token.URSH, IR.number(5), IR.number(1));
    Node foldedUrsh = folder.optimizeSubtree(ursh);
    assertTrue(foldedUrsh.isNumber());

    // Shift amount out of bounds (> 32)
    Node badShiftAmount = new Node(com.google.javascript.rhino.Token.LSH, IR.number(5), IR.number(35));
    assertEquals(badShiftAmount, folder.optimizeSubtree(badShiftAmount));

    // Left operand out of range
    Node badLeftOperand = new Node(com.google.javascript.rhino.Token.LSH, IR.number(1e12), IR.number(2));
    assertEquals(badLeftOperand, folder.optimizeSubtree(badLeftOperand));

    // Fractional operand
    Node fracOperand = new Node(com.google.javascript.rhino.Token.LSH, IR.number(5.5), IR.number(2));
    assertEquals(fracOperand, folder.optimizeSubtree(fracOperand));
  }

  @Test
  public void testComparisonFolding() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // 5 < 10 -> true
    Node lt = new Node(com.google.javascript.rhino.Token.LT, IR.number(5), IR.number(10));
    Node foldedLt = folder.optimizeSubtree(lt);
    assertTrue(foldedLt.isTrue());

    // "a" == "a" -> true
    Node eq = new Node(com.google.javascript.rhino.Token.EQ, IR.string("a"), IR.string("a"));
    Node foldedEq = folder.optimizeSubtree(eq);
    assertTrue(foldedEq.isTrue());

    // null == undefined -> true
    Node nullEqUndef = new Node(com.google.javascript.rhino.Token.EQ, IR.nullNode(), IR.name("undefined"));
    Node foldedNullUndef = folder.optimizeSubtree(nullEqUndef);
    assertTrue(foldedNullUndef.isTrue());

    // this == this -> true
    Node thisEq = new Node(com.google.javascript.rhino.Token.EQ, new Node(com.google.javascript.rhino.Token.THIS), new Node(com.google.javascript.rhino.Token.THIS));
    assertTrue(folder.optimizeSubtree(thisEq).isTrue());
  }

  @Test
  public void testArrayAccessFolding() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // [10, 20, 30][1] -> 20
    Node arrayLit = IR.arrayLit(IR.number(10), IR.number(20), IR.number(30));
    Node getElem = new Node(com.google.javascript.rhino.Token.GETELEM, arrayLit, IR.number(1));
    Node folded = folder.optimizeSubtree(getElem);
    assertTrue(folded.isNumber());
    assertEquals(20.0, folded.getDouble(), 0.0);

    // Index out of bounds (negative)
    Node arrNeg = IR.arrayLit(IR.number(10));
    Node getNeg = new Node(com.google.javascript.rhino.Token.GETELEM, arrNeg, IR.number(-1));
    assertEquals(getNeg, folder.optimizeSubtree(getNeg));

    // Index out of bounds (too large)
    Node arrLarge = IR.arrayLit(IR.number(10));
    Node getLarge = new Node(com.google.javascript.rhino.Token.GETELEM, arrLarge, IR.number(5));
    assertEquals(getLarge, folder.optimizeSubtree(getLarge));

    // Fractional index
    Node arrFrac = IR.arrayLit(IR.number(10));
    Node getFrac = new Node(com.google.javascript.rhino.Token.GETELEM, arrFrac, IR.number(1.5));
    assertEquals(getFrac, folder.optimizeSubtree(getFrac));
  }

  @Test
  public void testGetPropAndLengthFolding() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // [1, 2, 3].length -> 3
    Node arrayLit = IR.arrayLit(IR.number(1), IR.number(2), IR.number(3));
    Node getProp = new Node(com.google.javascript.rhino.Token.GETPROP, arrayLit, IR.string("length"));
    Node foldedLen = folder.optimizeSubtree(getProp);
    assertTrue(foldedLen.isNumber());
    assertEquals(3.0, foldedLen.getDouble(), 0.0);

    // "abc".length -> 3
    Node strNode = IR.string("abc");
    Node getStrLen = new Node(com.google.javascript.rhino.Token.GETPROP, strNode, IR.string("length"));
    Node foldedStrLen = folder.optimizeSubtree(getStrLen);
    assertTrue(foldedStrLen.isNumber());
    assertEquals(3.0, foldedStrLen.getDouble(), 0.0);
  }

  @Test
  public void testObjectPropAccessFolding() {
    PeepholeFoldConstants folder = new PeepholeFoldConstants(false);

    // {a: 1}.a -> 1
    Node objLit = IR.objectLit(IR.propstdef(IR.stringKey("a", IR.number(1))));
    Node getProp = new Node(com.google.javascript.rhino.Token.GETPROP, objLit, IR.string("a"));
    Node folded = folder.optimizeSubtree(getProp);
    assertTrue(folded.isNumber());
    assertEquals(1.0, folded.getDouble(), 0.0);
  }
}