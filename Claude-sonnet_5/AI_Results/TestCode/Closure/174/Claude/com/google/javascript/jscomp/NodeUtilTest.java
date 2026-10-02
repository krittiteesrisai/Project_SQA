package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Unit tests for {@link NodeUtil} (Defects4J Closure-174b).
 *
 * หมายเหตุ: การสร้าง Node ในเทสนี้ใช้ new Node(type) + addChildToBack(...)
 * และ Node.newString/newNumber ซึ่งอนุมานจาก pattern การเรียกใช้ Node ภายใน
 * ซอร์สของ NodeUtil เอง เนื่องจากไม่มีซอร์สของ Node/IR ให้มาโดยตรง
 */
public class NodeUtilTest {

  // ---------- Helper builders ----------

  private static Node newNode(int type, Node... children) {
    Node n = new Node(type);
    for (Node c : children) {
      n.addChildToBack(c);
    }
    return n;
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

  private static Node fn(String fnName, Node body, Node... params) {
    return newNode(Token.FUNCTION, name(fnName), newNode(Token.PARAM_LIST, params), body);
  }

  // =====================================================================
  // getImpureBooleanValue / getPureBooleanValue
  // =====================================================================

  @Test
  public void testImpureBooleanValue_assignAndComma() {
    Node assign = newNode(Token.ASSIGN, name("x"), new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assign));

    Node comma = newNode(Token.COMMA, new Node(Token.FALSE), new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(comma));
  }

  @Test
  public void testImpureBooleanValue_not() {
    Node not = newNode(Token.NOT, new Node(Token.TRUE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(not));
  }

  @Test
  public void testImpureBooleanValue_andOr() {
    Node and = newNode(Token.AND, new Node(Token.TRUE), new Node(Token.FALSE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(and));

    Node or = newNode(Token.OR, new Node(Token.FALSE), new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(or));
  }

  @Test
  public void testImpureBooleanValue_hookSameBranches() {
    Node hook = newNode(Token.HOOK, name("c"), new Node(Token.TRUE), new Node(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hook));
  }

  @Test
  public void testImpureBooleanValue_hookDifferentBranches() {
    Node hook = newNode(Token.HOOK, name("c"), new Node(Token.TRUE), new Node(Token.FALSE));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hook));
  }

  @Test
  public void testImpureBooleanValue_arrayObjectVoidDefault() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(newNode(Token.ARRAYLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(newNode(Token.OBJECTLIT)));
    assertEquals(TernaryValue.FALSE,
        NodeUtil.getImpureBooleanValue(newNode(Token.VOID, num(0))));
    // default -> getPureBooleanValue
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(str("a")));
  }

  @Test
  public void testPureBooleanValue_stringNumber() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(str("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(str("a")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(num(0)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(num(5)));
  }

  @Test
  public void testPureBooleanValue_not() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(newNode(Token.NOT, num(0))));
  }

  @Test
  public void testPureBooleanValue_nullFalse() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(new Node(Token.FALSE)));
  }

  @Test
  public void testPureBooleanValue_voidNoSideEffect() {
    assertEquals(TernaryValue.FALSE,
        NodeUtil.getPureBooleanValue(newNode(Token.VOID, num(0))));
  }

  @Test
  public void testPureBooleanValue_voidWithSideEffect() {
    Node call = newNode(Token.CALL, name("foo")); // unknown fn -> has side effects
    Node voidNode = newNode(Token.VOID, call);
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(voidNode));
  }

  @Test
  public void testPureBooleanValue_names() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(name("undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(name("NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(name("Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(name("x")));
  }

  @Test
  public void testPureBooleanValue_trueRegexp() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.TRUE)));
    Node regexp = newNode(Token.REGEXP, str("a"), str(""));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(regexp));
  }

  @Test
  public void testPureBooleanValue_arrayObjectLit() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(newNode(Token.ARRAYLIT)));
    // ARRAYLIT with side-effecting child -> falls through to UNKNOWN
    Node arr = newNode(Token.ARRAYLIT, newNode(Token.CALL, name("foo")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(arr));
  }

  @Test
  public void testPureBooleanValue_default() {
    Node add = newNode(Token.ADD, num(1), num(2));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(add));
  }

  // =====================================================================
  // getStringValue / getStringValue(double) / getArrayElementStringValue / arrayToString
  // =====================================================================

  @Test
  public void testGetStringValue_string_and_stringKey() {
    assertEquals("a", NodeUtil.getStringValue(str("a")));
    assertEquals("k", NodeUtil.getStringValue(Node.newString(Token.STRING_KEY, "k")));
  }

  @Test
  public void testGetStringValue_names() {
    assertEquals("undefined", NodeUtil.getStringValue(name("undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(name("Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(name("NaN")));
    assertNull(NodeUtil.getStringValue(name("x")));
  }

  @Test
  public void testGetStringValue_numberBoolNullVoid() {
    assertEquals("5", NodeUtil.getStringValue(num(5)));
    assertEquals("false", NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals("true", NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(newNode(Token.VOID, num(0))));
  }

  @Test
  public void testGetStringValue_not() {
    assertEquals("false", NodeUtil.getStringValue(newNode(Token.NOT, new Node(Token.TRUE))));
    assertNull(NodeUtil.getStringValue(newNode(Token.NOT, name("x"))));
  }

  @Test
  public void testGetStringValue_arrayObjectDefault() {
    Node arr = newNode(Token.ARRAYLIT, num(1), num(2));
    assertEquals("1,2", NodeUtil.getStringValue(arr));
    assertEquals("[object Object]", NodeUtil.getStringValue(newNode(Token.OBJECTLIT)));
    assertNull(NodeUtil.getStringValue(newNode(Token.ADD, num(1), num(2))));
  }

  @Test
  public void testGetStringValueDouble() {
    assertEquals("1", NodeUtil.getStringValue(1.0));
    assertEquals("1.5", NodeUtil.getStringValue(1.5));
  }

  @Test
  public void testGetArrayElementStringValue() {
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.NULL)));
    assertEquals("", NodeUtil.getArrayElementStringValue(new Node(Token.EMPTY)));
    assertEquals("5", NodeUtil.getArrayElementStringValue(num(5)));
  }

  @Test
  public void testArrayToString_emptyAndNull() {
    assertEquals("", NodeUtil.arrayToString(newNode(Token.ARRAYLIT)));
    Node arrWithNull = newNode(Token.ARRAYLIT, newNode(Token.ADD, num(1), num(2)));
    assertNull(NodeUtil.arrayToString(arrWithNull));
  }

  // =====================================================================
  // getNumberValue / getStringNumberValue / trimJsWhiteSpace / isStrWhiteSpaceChar
  // =====================================================================

  @Test
  public void testGetNumberValue_trueFalseNull() {
    assertEquals(1.0, NodeUtil.getNumberValue(new Node(Token.TRUE)), 0);
    assertEquals(0.0, NodeUtil.getNumberValue(new Node(Token.FALSE)), 0);
    assertEquals(0.0, NodeUtil.getNumberValue(new Node(Token.NULL)), 0);
    assertEquals(5.0, NodeUtil.getNumberValue(num(5)), 0);
  }

  @Test
  public void testGetNumberValue_void() {
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(newNode(Token.VOID, num(0)))));
    Node call = newNode(Token.CALL, name("foo"));
    assertNull(NodeUtil.getNumberValue(newNode(Token.VOID, call)));
  }

  @Test
  public void testGetNumberValue_names() {
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(name("undefined"))));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(name("NaN"))));
    assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(name("Infinity")), 0);
    assertNull(NodeUtil.getNumberValue(name("x")));
  }

  @Test
  public void testGetNumberValue_neg() {
    Node neg = newNode(Token.NEG, name("Infinity"));
    assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(neg), 0);
    Node negOther = newNode(Token.NEG, num(5));
    assertNull(NodeUtil.getNumberValue(negOther));
  }

  @Test
  public void testGetNumberValue_notAndStringAndDefault() {
    assertEquals(0.0, NodeUtil.getNumberValue(newNode(Token.NOT, new Node(Token.TRUE))), 0);
    assertEquals(3.14, NodeUtil.getNumberValue(str("3.14")), 0);
    assertNull(NodeUtil.getNumberValue(newNode(Token.ADD, num(1), num(2))));
  }

  @Test
  public void testGetStringNumberValue_verticalTab() {
    assertNull(NodeUtil.getStringNumberValue("1\u000b2"));
  }

  @Test
  public void testGetStringNumberValue_empty() {
    assertEquals(0.0, NodeUtil.getStringNumberValue("   "), 0);
  }

  @Test
  public void testGetStringNumberValue_hex() {
    assertEquals(26.0, NodeUtil.getStringNumberValue("0x1A"), 0);
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xZZ")));
  }

  @Test
  public void testGetStringNumberValue_signedHexAndInfinity() {
    assertNull(NodeUtil.getStringNumberValue("+0x1A"));
    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertNull(NodeUtil.getStringNumberValue("-infinity"));
  }

  @Test
  public void testGetStringNumberValue_normalAndMalformed() {
    assertEquals(3.14, NodeUtil.getStringNumberValue("3.14"), 0);
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("abc")));
  }

  @Test
  public void testTrimJsWhiteSpace() {
    assertEquals("abc", NodeUtil.trimJsWhiteSpace("  abc  "));
    assertEquals("\u000babc", NodeUtil.trimJsWhiteSpace("\u000babc")); // VT not trimmed
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
  }

  // =====================================================================
  // getFunctionName / getNearestFunctionName
  // =====================================================================

  @Test
  public void testGetFunctionName_nameParent() {
    Node function = fn("", newNode(Token.BLOCK));
    Node varName = name("x");
    varName.addChildToBack(function);
    assertEquals("x", NodeUtil.getFunctionName(function));
  }

  @Test
  public void testGetFunctionName_assignParent() {
    Node function = fn("", newNode(Token.BLOCK));
    Node target = name("obj");
    Node assign = newNode(Token.ASSIGN, target, function);
    assertEquals("obj", NodeUtil.getFunctionName(function));
  }

  @Test
  public void testGetFunctionName_default() {
    Node function = fn("myFunc", newNode(Token.BLOCK));
    Node block = newNode(Token.BLOCK, function);
    assertEquals("myFunc", NodeUtil.getFunctionName(function));
  }

  @Test
  public void testGetNearestFunctionName_notFunction() {
    assertNull(NodeUtil.getNearestFunctionName(name("x")));
  }

  @Test
  public void testGetNearestFunctionName_viaFunctionName() {
    Node function = fn("myFunc", newNode(Token.BLOCK));
    Node block = newNode(Token.BLOCK, function);
    assertEquals("myFunc", NodeUtil.getNearestFunctionName(function));
  }

  // =====================================================================
  // isImmutableValue
  // =====================================================================

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(str("a")));
    assertTrue(NodeUtil.isImmutableValue(num(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(newNode(Token.CAST, str("a"))));
    assertTrue(NodeUtil.isImmutableValue(newNode(Token.NOT, num(1))));
    assertTrue(NodeUtil.isImmutableValue(newNode(Token.VOID, num(1))));
    assertTrue(NodeUtil.isImmutableValue(newNode(Token.NEG, num(1))));
    assertTrue(NodeUtil.isImmutableValue(name("undefined")));
    assertTrue(NodeUtil.isImmutableValue(name("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(name("NaN")));
    assertFalse(NodeUtil.isImmutableValue(name("x")));
    assertFalse(NodeUtil.isImmutableValue(newNode(Token.ADD, num(1), num(2))));
  }

  // =====================================================================
  // isSymmetricOperation / isRelationalOperation / getInverseOperator
  // =====================================================================

  @Test
  public void testIsSymmetricOperation() {
    assertTrue(NodeUtil.isSymmetricOperation(newNode(Token.EQ, num(1), num(1))));
    assertTrue(NodeUtil.isSymmetricOperation(newNode(Token.MUL, num(1), num(1))));
    assertFalse(NodeUtil.isSymmetricOperation(newNode(Token.SUB, num(1), num(1))));
  }

  @Test
  public void testIsRelationalOperation() {
    assertTrue(NodeUtil.isRelationalOperation(newNode(Token.GT, num(1), num(1))));
    assertFalse(NodeUtil.isRelationalOperation(newNode(Token.EQ, num(1), num(1))));
  }

  @Test
  public void testGetInverseOperator() {
    assertEquals(Token.LT, NodeUtil.getInverseOperator(Token.GT));
    assertEquals(Token.GT, NodeUtil.getInverseOperator(Token.LT));
    assertEquals(Token.LE, NodeUtil.getInverseOperator(Token.GE));
    assertEquals(Token.GE, NodeUtil.getInverseOperator(Token.LE));
    assertEquals(Token.ERROR, NodeUtil.getInverseOperator(Token.ADD));
  }

  // =====================================================================
  // isLiteralValue / isValidDefineValue / isEmptyBlock
  // =====================================================================

  @Test
  public void testIsLiteralValue_cast_arraylit_regexp_objectlit() {
    assertTrue(NodeUtil.isLiteralValue(newNode(Token.CAST, str("a")), false));

    Node arrOk = newNode(Token.ARRAYLIT, new Node(Token.EMPTY), num(1));
    assertTrue(NodeUtil.isLiteralValue(arrOk, false));
    Node arrBad = newNode(Token.ARRAYLIT, name("x"));
    assertFalse(NodeUtil.isLiteralValue(arrBad, false));

    Node regexpOk = newNode(Token.REGEXP);
    assertTrue(NodeUtil.isLiteralValue(regexpOk, false));

    Node keyOk = Node.newString(Token.STRING_KEY, "k");
    keyOk.addChildToBack(num(1));
    Node objOk = newNode(Token.OBJECTLIT, keyOk);
    assertTrue(NodeUtil.isLiteralValue(objOk, false));

    Node keyBad = Node.newString(Token.STRING_KEY, "k");
    keyBad.addChildToBack(name("x"));
    Node objBad = newNode(Token.OBJECTLIT, keyBad);
    assertFalse(NodeUtil.isLiteralValue(objBad, false));
  }

  @Test
  public void testIsLiteralValue_function() {
    Node exprFn = fn("f", newNode(Token.BLOCK));
    Node holder = newNode(Token.ARRAYLIT); // expression context, not statement
    holder.addChildToBack(exprFn);
    assertTrue(NodeUtil.isLiteralValue(exprFn, true));
    assertFalse(NodeUtil.isLiteralValue(exprFn, false));

    Node declFn = fn("g", newNode(Token.BLOCK));
    newNode(Token.BLOCK, declFn); // statement context
    assertFalse(NodeUtil.isLiteralValue(declFn, true));
  }

  @Test
  public void testIsLiteralValue_default() {
    assertTrue(NodeUtil.isLiteralValue(num(1), false));
    assertFalse(NodeUtil.isLiteralValue(name("x"), false));
  }

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>();
    defines.add("FOO");
    assertTrue(NodeUtil.isValidDefineValue(str("a"), defines));
    assertTrue(NodeUtil.isValidDefineValue(num(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));

    Node addOk = newNode(Token.ADD, str("a"), num(1));
    assertTrue(NodeUtil.isValidDefineValue(addOk, defines));
    Node addBad = newNode(Token.ADD, str("a"), name("BAR"));
    assertFalse(NodeUtil.isValidDefineValue(addBad, defines));

    assertTrue(NodeUtil.isValidDefineValue(newNode(Token.NOT, new Node(Token.TRUE)), defines));

    assertTrue(NodeUtil.isValidDefineValue(name("FOO"), defines));
    assertFalse(NodeUtil.isValidDefineValue(name("BAR"), defines));

    assertFalse(NodeUtil.isValidDefineValue(newNode(Token.ARRAYLIT), defines));
  }

  @Test
  public void testIsEmptyBlock() {
    assertTrue(NodeUtil.isEmptyBlock(newNode(Token.BLOCK)));
    assertTrue(NodeUtil.isEmptyBlock(newNode(Token.BLOCK, new Node(Token.EMPTY))));
    assertFalse(NodeUtil.isEmptyBlock(newNode(Token.BLOCK, name("x"))));
    assertFalse(NodeUtil.isEmptyBlock(name("x")));
  }

  // =====================================================================
  // isSimpleOperator(Type)
  // =====================================================================

  @Test
  public void testIsSimpleOperator() {
    assertTrue(NodeUtil.isSimpleOperator(newNode(Token.ADD, num(1), num(2))));
    assertFalse(NodeUtil.isSimpleOperator(newNode(Token.ASSIGN, name("x"), num(1))));
  }

  // =====================================================================
  // mayHaveSideEffects / mayEffectMutableState (checkForStateChangeHelper)
  // =====================================================================

  @Test
  public void testMayHaveSideEffects_throw() {
    assertTrue(NodeUtil.mayHaveSideEffects(newNode(Token.THROW, num(1))));
  }

  @Test
  public void testMayEffectMutableState_arrayLitAlwaysTrue() {
    assertTrue(NodeUtil.mayEffectMutableState(newNode(Token.ARRAYLIT)));
  }

  @Test
  public void testMayHaveSideEffects_arrayLitNoSideEffectChildren() {
    assertFalse(NodeUtil.mayHaveSideEffects(newNode(Token.ARRAYLIT, num(1))));
  }

  @Test
  public void testMayHaveSideEffects_varAndName() {
    // empty var statement (no name child at all) -> no side effect
    assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.VAR)));
    // var with declared name -> side effect
    assertTrue(NodeUtil.mayHaveSideEffects(newNode(Token.VAR, name("x"))));

    // bare name reference (no child) -> no side effect
    assertFalse(NodeUtil.mayHaveSideEffects(name("x")));
    // name with initializer child -> side effect
    Node nameWithChild = name("x");
    nameWithChild.addChildToBack(num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));
  }

  @Test
  public void testMayHaveSideEffects_function() {
    Node exprFn = fn("f", newNode(Token.BLOCK));
    newNode(Token.ARRAYLIT).addChildToBack(exprFn); // function expression
    assertFalse(NodeUtil.mayHaveSideEffects(exprFn));

    Node declFn = fn("g", newNode(Token.BLOCK));
    newNode(Token.BLOCK, declFn); // function declaration (statement)
    assertTrue(NodeUtil.mayHaveSideEffects(declFn));
  }

  @Test
  public void testMayHaveSideEffects_new() {
    Node newArray = newNode(Token.NEW, name("Array"));
    assertFalse(NodeUtil.mayHaveSideEffects(newArray));
    Node newFoo = newNode(Token.NEW, name("Foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(newFoo));
  }

  @Test
  public void testMayHaveSideEffects_call() {
    Node mathFloor = newNode(Token.CALL,
        newNode(Token.GETPROP, name("Math"), str("floor")), num(1));
    assertFalse(NodeUtil.mayHaveSideEffects(mathFloor));

    Node unknownCall = newNode(Token.CALL, name("foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(unknownCall));
  }

  @Test
  public void testMayHaveSideEffects_assignToNameTarget() {
    Node assign = newNode(Token.ASSIGN, name("x"), num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_assignToPropertyOfPlainVar() {
    Node target = newNode(Token.GETPROP, name("a"), str("b"));
    Node assign = newNode(Token.ASSIGN, target, num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_assignToPropertyOfLiteral() {
    Node target = newNode(Token.GETPROP, newNode(Token.OBJECTLIT), str("b"));
    Node assign = newNode(Token.ASSIGN, target, num(1));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_assignElseBranch() {
    // synthetic: target that is neither NAME nor GET -> exercises the else-branch
    Node target = newNode(Token.ARRAYLIT);
    Node assign = newNode(Token.ASSIGN, target, num(1));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  // =====================================================================
  // constructorCallHasSideEffects / functionCallHasSideEffects
  // =====================================================================

  @Test
  public void testConstructorCallHasSideEffects() {
    assertFalse(NodeUtil.constructorCallHasSideEffects(newNode(Token.NEW, name("Array"))));
    assertTrue(NodeUtil.constructorCallHasSideEffects(newNode(Token.NEW, name("Foo"))));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_notNewThrows() {
    NodeUtil.constructorCallHasSideEffects(newNode(Token.CALL, name("Array")));
  }

  @Test
  public void testFunctionCallHasSideEffects() {
    assertFalse(NodeUtil.functionCallHasSideEffects(newNode(Token.CALL, name("String"))));
    assertTrue(NodeUtil.functionCallHasSideEffects(newNode(Token.CALL, name("foo"))));

    Node toStringCall = newNode(Token.CALL,
        newNode(Token.GETPROP, name("x"), str("toString")));
    assertFalse(NodeUtil.functionCallHasSideEffects(toStringCall));

    Node mathFloor = newNode(Token.CALL,
        newNode(Token.GETPROP, name("Math"), str("floor")), num(1));
    assertFalse(NodeUtil.functionCallHasSideEffects(mathFloor));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_notCallThrows() {
    NodeUtil.functionCallHasSideEffects(newNode(Token.NEW, name("foo")));
  }

  @Test
  public void testCallHasLocalResult_default() {
    assertFalse(NodeUtil.callHasLocalResult(newNode(Token.CALL, name("foo"))));
  }

  @Test
  public void testNewHasLocalResult_default() {
    assertFalse(NodeUtil.newHasLocalResult(newNode(Token.NEW, name("Foo"))));
  }

  // =====================================================================
  // nodeTypeMayHaveSideEffects
  // =====================================================================

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newNode(Token.ASSIGN, name("x"), num(1))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newNode(Token.DELPROP, name("x"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newNode(Token.CALL, name("foo"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(newNode(Token.NEW, name("Foo"))));
    Node nameWithChild = name("x");
    nameWithChild.addChildToBack(num(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(name("x")));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(num(1)));
  }

  // =====================================================================
  // canBeSideEffected
  // =====================================================================

  @Test
  public void testCanBeSideEffected() {
    assertTrue(NodeUtil.canBeSideEffected(newNode(Token.CALL, name("foo"))));
    assertTrue(NodeUtil.canBeSideEffected(newNode(Token.NEW, name("Foo"))));
    assertTrue(NodeUtil.canBeSideEffected(name("x")));

    Node constName = name("x");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(constName));

    Set<String> known = new HashSet<String>();
    known.add("y");
    assertFalse(NodeUtil.canBeSideEffected(name("y"), known));

    assertTrue(NodeUtil.canBeSideEffected(newNode(Token.GETPROP, name("a"), str("b"))));

    assertFalse(NodeUtil.canBeSideEffected(newNode(Token.ADD, num(1), num(2))));
  }

  // =====================================================================
  // precedence / precedenceWithDefault
  // =====================================================================

  @Test
  public void testPrecedence() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(12, NodeUtil.precedence(Token.MUL));
    assertEquals(15, NodeUtil.precedence(Token.CALL));
  }

  @Test(expected = Error.class)
  public void testPrecedence_unknownThrows() {
    NodeUtil.precedence(Token.IF);
  }

  @Test
  public void testPrecedenceWithDefault_unknownReturnsMinusOne() {
    assertEquals(-1, NodeUtil.precedenceWithDefault(Token.IF));
  }

  // =====================================================================
  // isUndefined / isNullOrUndefined
  // =====================================================================

  @Test
  public void testIsUndefined() {
    assertTrue(NodeUtil.isUndefined(newNode(Token.VOID, num(0))));
    assertTrue(NodeUtil.isUndefined(name("undefined")));
    assertFalse(NodeUtil.isUndefined(name("x")));
    assertFalse(NodeUtil.isUndefined(num(1)));
  }

  @Test
  public void testIsNullOrUndefined() {
    assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    assertTrue(NodeUtil.isNullOrUndefined(newNode(Token.VOID, num(0))));
    assertFalse(NodeUtil.isNullOrUndefined(num(1)));
  }

  // =====================================================================
  // isAssociative / isCommutative
  // =====================================================================

  @Test
  public void testIsAssociativeAndCommutative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));

    assertTrue(NodeUtil.isCommutative(Token.MUL));
    assertFalse(NodeUtil.isCommutative(Token.AND)); // associative but not commutative
    assertFalse(NodeUtil.isCommutative(Token.ADD));
  }

  // =====================================================================
  // isAssignmentOp / getOpFromAssignmentOp
  // =====================================================================

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(newNode(Token.ASSIGN, name("x"), num(1))));
    assertTrue(NodeUtil.isAssignmentOp(newNode(Token.ASSIGN_ADD, name("x"), num(1))));
    assertFalse(NodeUtil.isAssignmentOp(newNode(Token.ADD, num(1), num(2))));
  }

  @Test
  public void testGetOpFromAssignmentOp() {
    assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(newNode(Token.ASSIGN_BITOR)));
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(newNode(Token.ASSIGN_ADD)));
    assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(newNode(Token.ASSIGN_MOD)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_notAssignThrows() {
    NodeUtil.getOpFromAssignmentOp(newNode(Token.ASSIGN));
  }

  // =====================================================================
  // isGet / isCallOrNew
  // =====================================================================

  @Test
  public void testIsGet() {
    assertTrue(NodeUtil.isGet(newNode(Token.GETPROP, name("a"), str("b"))));
    assertTrue(NodeUtil.isGet(newNode(Token.GETELEM, name("a"), num(0))));
    assertFalse(NodeUtil.isGet(name("a")));
  }

  @Test
  public void testIsCallOrNew() {
    assertTrue(NodeUtil.isCallOrNew(newNode(Token.CALL, name("f"))));
    assertTrue(NodeUtil.isCallOrNew(newNode(Token.NEW, name("F"))));
    assertFalse(NodeUtil.isCallOrNew(name("f")));
  }

  // =====================================================================
  // opToStr / opToStrNoFail
  // =====================================================================

  @Test
  public void testOpToStr() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("&&", NodeUtil.opToStr(Token.AND));
    assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    assertNull(NodeUtil.opToStr(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_throws() {
    NodeUtil.opToStrNoFail(Token.NAME);
  }

  // =====================================================================
  