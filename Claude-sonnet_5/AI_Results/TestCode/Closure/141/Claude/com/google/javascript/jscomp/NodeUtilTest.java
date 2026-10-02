package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Predicates;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * JUnit 4 test suite for {@link NodeUtil} (Closure-141b).
 *
 * Node trees are built manually using only the Node API confirmed to be
 * used inside NodeUtil.java itself, to avoid guessing undocumented behavior.
 */
public class NodeUtilTest {

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  /** Builds a node of {@code type} with the given children appended in order. */
  private static Node n(int type, Node... children) {
    Node node = new Node(type);
    for (Node c : children) {
      node.addChildToBack(c);
    }
    return node;
  }

  private static Node name(String s) {
    return Node.newString(Token.NAME, s);
  }

  private static Node str(String s) {
    return Node.newString(Token.STRING, s);
  }

  private static Node num(double d) {
    return Node.newNumber(d);
  }

  /** function <name>() {} with an empty LP and empty BLOCK. */
  private static Node buildFunction(String name) {
    return n(Token.FUNCTION, Node.newString(Token.NAME, name), n(Token.LP), n(Token.BLOCK));
  }

  private static Node buildFunctionWithBody(Node body) {
    return n(Token.FUNCTION, Node.newString(Token.NAME, ""), n(Token.LP), body);
  }

  private static boolean containsChild(Node parent, Node target) {
    for (Node c = parent.getFirstChild(); c != null; c = c.getNext()) {
      if (c == target) {
        return true;
      }
    }
    return false;
  }

  // ---------------------------------------------------------------------
  // getBooleanValue
  // ---------------------------------------------------------------------

  @Test
  public void testGetBooleanValue() {
    assertFalse(NodeUtil.getBooleanValue(str("")));
    assertTrue(NodeUtil.getBooleanValue(str("x")));
    assertFalse(NodeUtil.getBooleanValue(num(0)));
    assertTrue(NodeUtil.getBooleanValue(num(1)));
    assertFalse(NodeUtil.getBooleanValue(n(Token.NULL)));
    assertFalse(NodeUtil.getBooleanValue(n(Token.FALSE)));
    assertFalse(NodeUtil.getBooleanValue(n(Token.VOID, num(0))));
    assertFalse(NodeUtil.getBooleanValue(name("undefined")));
    assertFalse(NodeUtil.getBooleanValue(name("NaN")));
    assertTrue(NodeUtil.getBooleanValue(name("Infinity")));
    assertTrue(NodeUtil.getBooleanValue(n(Token.TRUE)));
    assertTrue(NodeUtil.getBooleanValue(n(Token.ARRAYLIT)));
    assertTrue(NodeUtil.getBooleanValue(n(Token.OBJECTLIT)));
    assertTrue(NodeUtil.getBooleanValue(n(Token.REGEXP)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_otherName_throws() {
    // NAME falls through the switch's inner if/else if none matched -> throw.
    NodeUtil.getBooleanValue(name("someVar"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_unsupportedType_throws() {
    NodeUtil.getBooleanValue(n(Token.BLOCK));
  }

  // ---------------------------------------------------------------------
  // getStringValue
  // ---------------------------------------------------------------------

  @Test
  public void testGetStringValue() {
    assertEquals("x", NodeUtil.getStringValue(name("x")));
    assertEquals("x", NodeUtil.getStringValue(str("x")));
    assertEquals("1", NodeUtil.getStringValue(num(1.0))); // "1" not "1.0"
    assertEquals(Double.toString(1.5), NodeUtil.getStringValue(num(1.5)));
    // Compare against Node.tokenToName itself to avoid guessing the exact string.
    assertEquals(Node.tokenToName(Token.FALSE), NodeUtil.getStringValue(n(Token.FALSE)));
    assertEquals(Node.tokenToName(Token.TRUE), NodeUtil.getStringValue(n(Token.TRUE)));
    assertEquals(Node.tokenToName(Token.NULL), NodeUtil.getStringValue(n(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(n(Token.VOID, num(0))));
    assertNull(NodeUtil.getStringValue(n(Token.BLOCK))); // default -> null
  }

  // ---------------------------------------------------------------------
  // getFunctionName
  // ---------------------------------------------------------------------

  @Test
  public void testGetFunctionName_parentName() {
    Node fn = buildFunction("anon");
    Node parent = name("varName");
    assertEquals("varName", NodeUtil.getFunctionName(fn, parent));
  }

  @Test
  public void testGetFunctionName_parentAssign() {
    Node fn = buildFunction("anon");
    Node lhs = NodeUtil.newQualifiedNameNode("a.b.c", -1, -1);
    Node parent = n(Token.ASSIGN, lhs, fn);
    assertEquals("a.b.c", NodeUtil.getFunctionName(fn, parent));
  }

  @Test
  public void testGetFunctionName_default_withName() {
    Node fn = buildFunction("myFunc");
    Node parent = n(Token.BLOCK, fn);
    assertEquals("myFunc", NodeUtil.getFunctionName(fn, parent));
  }

  @Test
  public void testGetFunctionName_default_emptyName() {
    Node fn = buildFunction("");
    Node parent = n(Token.BLOCK, fn);
    assertNull(NodeUtil.getFunctionName(fn, parent));
  }

  // ---------------------------------------------------------------------
  // isImmutableValue / isLiteralValue
  // ---------------------------------------------------------------------

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(str("s")));
    assertTrue(NodeUtil.isImmutableValue(num(1)));
    assertTrue(NodeUtil.isImmutableValue(n(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(n(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(n(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(n(Token.VOID, num(0))));
    assertTrue(NodeUtil.isImmutableValue(n(Token.NEG, num(5))));
    assertFalse(NodeUtil.isImmutableValue(n(Token.NEG, n(Token.CALL, name("f")))));
    assertTrue(NodeUtil.isImmutableValue(name("undefined")));
    assertTrue(NodeUtil.isImmutableValue(name("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(name("NaN")));
    assertFalse(NodeUtil.isImmutableValue(name("x")));
    assertFalse(NodeUtil.isImmutableValue(n(Token.CALL, name("f"))));
  }

  @Test
  public void testIsLiteralValue() {
    Node arrAllLiteral = n(Token.ARRAYLIT, num(1), str("x"));
    assertTrue(NodeUtil.isLiteralValue(arrAllLiteral));

    Node arrWithCall = n(Token.ARRAYLIT, num(1), n(Token.CALL, name("f")));
    assertFalse(NodeUtil.isLiteralValue(arrWithCall));

    Node objAllLiteral = n(Token.OBJECTLIT, str("k"), num(1));
    assertTrue(NodeUtil.isLiteralValue(objAllLiteral));

    Node regexpNoChildren = n(Token.REGEXP);
    assertTrue(NodeUtil.isLiteralValue(regexpNoChildren));

    assertTrue(NodeUtil.isLiteralValue(str("s"))); // default -> isImmutableValue
    assertFalse(NodeUtil.isLiteralValue(n(Token.CALL, name("f"))));
  }

  // ---------------------------------------------------------------------
  // isValidDefineValue
  // ---------------------------------------------------------------------

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>(Arrays.asList("FOO", "FOO.BAR"));

    assertTrue(NodeUtil.isValidDefineValue(str("hello"), defines));
    assertTrue(NodeUtil.isValidDefineValue(num(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(n(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(n(Token.FALSE), defines));

    // single-operator recursion
    assertTrue(NodeUtil.isValidDefineValue(n(Token.NOT, name("FOO")), defines));

    // NAME in / not in defines
    assertTrue(NodeUtil.isValidDefineValue(name("FOO"), defines));
    assertFalse(NodeUtil.isValidDefineValue(name("BAZ"), defines));

    // GETPROP qualified name in / not in defines
    Node getProp = NodeUtil.newQualifiedNameNode("FOO.BAR", -1, -1);
    assertTrue(NodeUtil.isValidDefineValue(getProp, defines));
    Set<String> otherDefines = new HashSet<String>(Arrays.asList("OTHER"));
    assertFalse(NodeUtil.isValidDefineValue(getProp, otherDefines));

    // default fallback
    assertFalse(NodeUtil.isValidDefineValue(n(Token.CALL, name("f")), defines));
  }

  // ---------------------------------------------------------------------
  // isE