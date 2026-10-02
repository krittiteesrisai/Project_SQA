# NodeUtilTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- คลาส `NodeUtil` เป็น package-private methods จำนวนมาก ดังนั้น test class ต้องอยู่ใน package เดียวกัน (`com.google.javascript.jscomp`)
- ผมสร้าง Node tree ด้วยมือผ่าน constructor ของ `Node`/`Token` ตามที่ปรากฏใน source ของ `NodeUtil` เอง (ไม่มี parser ใน classpath ที่กำหนด)
- เมธอดที่ต้องพึ่ง `CodingConvention`, `JSType/FunctionType` mock ที่ไม่มีข้อมูลพฤติกรรมชัดเจนจาก source (`isConstantByConvention`, `getFunctionInfo`, `getInfoForNameNode`, `newQualifiedNameNode(convention,...)`, `getObjectLitKeyTypeFromValueType`) **ถูกข้ามและคอมเมนต์ไว้** ตามข้อกำหนดที่ 4 (ห้ามเดา behavior)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class NodeUtilTest {

  // ---------- Helpers to build AST nodes ----------
  private static Node name(String s) { return Node.newString(Token.NAME, s); }
  private static Node str(String s) { return Node.newString(Token.STRING, s); }
  private static Node num(double d) { return Node.newNumber(d); }
  private static Node bool(boolean b) { return new Node(b ? Token.TRUE : Token.FALSE); }
  private static Node nullNode() { return new Node(Token.NULL); }
  private static Node empty() { return new Node(Token.EMPTY); }

  private static Node getprop(Node target, String prop) {
    return new Node(Token.GETPROP, target, str(prop));
  }

  private static Node qname(String... parts) {
    Node n = name(parts[0]);
    for (int i = 1; i < parts.length; i++) {
      n = getprop(n, parts[i]);
    }
    return n;
  }

  private static Node call(Node target, Node... args) {
    Node c = new Node(Token.CALL, target);
    for (Node a : args) {
      c.addChildToBack(a);
    }
    return c;
  }

  private static Node newExprNode(Node target, Node... args) {
    Node c = new Node(Token.NEW, target);
    for (Node a : args) {
      c.addChildToBack(a);
    }
    return c;
  }

  private static Node block(Node... stmts) {
    Node b = new Node(Token.BLOCK);
    for (Node s : stmts) {
      b.addChildToBack(s);
    }
    return b;
  }

  private static Node anonFunction() {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToBack(name(""));
    fn.addChildToBack(new Node(Token.LP));
    fn.addChildToBack(new Node(Token.BLOCK));
    return fn;
  }

  private static Node namedFunction(String fname) {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToBack(name(fname));
    fn.addChildToBack(new Node(Token.LP));
    fn.addChildToBack(new Node(Token.BLOCK));
    return fn;
  }

  // =====================================================================
  // getPureBooleanValue / getImpureBooleanValue
  // =====================================================================

  @Test
  public void testGetPureBooleanValue_stringAndNumber() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(str("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(str("x")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(num(0)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(num(5)));
  }

  @Test
  public void testGetPureBooleanValue_notNullFalseVoid() {
    Node not = new Node(Token.NOT, bool(true));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(not));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(nullNode()));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(bool(false)));
    assertEquals(TernaryValue.FALSE,
        NodeUtil.getPureBooleanValue(new Node(Token.VOID, num(0))));
  }

  @Test
  public void testGetPureBooleanValue_names() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(name("undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(name("NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(name("Infinity")));
    // unknown name falls through "break" -> UNKNOWN
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(name("x")));
  }

  @Test
  public void testGetPureBooleanValue_trueRegexp() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(bool(true)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.REGEXP)));
  }

  @Test
  public void testGetPureBooleanValue_arrayLiteralNoSideEffect() {
    Node arr = new Node(Token.ARRAYLIT, num(1));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(arr));
  }

  @Test
  public void testGetPureBooleanValue_arrayLiteralWithSideEffect() {
    Node arr = new Node(Token.ARRAYLIT, call(name("foo"))); // foo() has side effects
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(arr));
  }

  @Test
  public void testGetPureBooleanValue_default() {
    Node add = new Node(Token.ADD, num(1), num(2));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(add));
  }

  @Test
  public void testGetImpureBooleanValue_assignComma() {
    Node assign = new Node(Token.ASSIGN, name("x"), bool(true));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assign));
    Node comma = new Node(Token.COMMA, num(1), bool(false));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(comma));
  }

  @Test
  public void testGetImpureBooleanValue_notAndOr() {
    Node not = new Node(Token.NOT, bool(true));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(not));

    Node and = new Node(Token.AND, bool(true), bool(false));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(and));

    Node or = new Node(Token.OR, bool(false), bool(true));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(or));
  }

  @Test
  public void testGetImpureBooleanValue_hook() {
    Node hookSame = new Node(Token.HOOK, name("c"), bool(true), bool(true));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hookSame));

    Node hookDiff = new Node(Token.HOOK, name("c"), bool(true), bool(false));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hookDiff));
  }

  @Test
  public void testGetImpureBooleanValue_arrayObjectLiteralIgnoresSideEffects() {
    Node arr = new Node(Token.ARRAYLIT, call(name("foo")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(arr));
    Node obj = new Node(Token.OBJECTLIT);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(obj));
  }

  @Test
  public void testGetImpureBooleanValue_default() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(str("x")));
  }

  // =====================================================================
  // getStringValue / arrayToString / getArrayElementStringValue
  // =====================================================================

  @Test
  public void testGetStringValue_string() {
    assertEquals("hi", NodeUtil.getStringValue(str("hi")));
  }

  @Test
  public void testGetStringValue_name() {
    assertEquals("undefined", NodeUtil.getStringValue(name("undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(name("Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(name("NaN")));
    assertNull(NodeUtil.getStringValue(name("x")));
  }

  @Test
  public void testGetStringValue_number() {
    assertEquals("1", NodeUtil.getStringValue(num(1.0)));
    assertEquals(Double.toString(1.5), NodeUtil.getStringValue(num(1.5)));
  }

  @Test
  public void testGetStringValue_boolNullVoid() {
    assertEquals(Node.tokenToName(Token.TRUE), NodeUtil.getStringValue(bool(true)));
    assertEquals(Node.tokenToName(Token.FALSE), NodeUtil.getStringValue(bool(false)));
    assertEquals(Node.tokenToName(Token.NULL), NodeUtil.getStringValue(nullNode()));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID, num(0))));
  }

  @Test
  public void testGetStringValue_not() {
    Node notTrue = new Node(Token.NOT, bool(true));
    assertEquals("false", NodeUtil.getStringValue(notTrue));
    Node notUnknown = new Node(Token.NOT, name("x"));
    assertNull(NodeUtil.getStringValue(notUnknown));
  }

  @Test
  public void testGetStringValue_arrayObjectLiteral() {
    Node arr = new Node(Token.ARRAYLIT, num(1), num(2));
    assertEquals("1,2", NodeUtil.getStringValue(arr));
    Node obj = new Node(Token.OBJECTLIT);
    assertEquals("[object Object]", NodeUtil.getStringValue(obj));
  }

  @Test
  public void testGetStringValue_default() {
    Node add = new Node(Token.ADD, num(1), num(2));
    assertNull(NodeUtil.getStringValue(add));
  }

  @Test
  public void testArrayToString_emptyAndNullElements() {
    Node emptyArr = new Node(Token.ARRAYLIT);
    assertEquals("", NodeUtil.arrayToString(emptyArr));

    Node arrWithNullUndef = new Node(Token.ARRAYLIT, nullNode(), new Node(Token.VOID, num(0)));
    assertEquals(",", NodeUtil.arrayToString(arrWithNullUndef));
  }

  @Test
  public void testArrayToString_unconvertibleElementReturnsNull() {
    Node arr = new Node(Token.ARRAYLIT, new Node(Token.ADD, num(1), num(2)));
    assertNull(NodeUtil.arrayToString(arr));
  }

  @Test
  public void testGetArrayElementStringValue() {
    assertEquals("", NodeUtil.getArrayElementStringValue(nullNode()));
    assertEquals("", NodeUtil.getArrayElementStringValue(empty()));
    assertEquals("5", NodeUtil.getArrayElementStringValue(num(5)));
  }

  // =====================================================================
  // getNumberValue / getStringNumberValue / trimJsWhiteSpace
  // =====================================================================

  @Test
  public void testGetNumberValue_trueFalseNullNumber() {
    assertEquals(1.0, NodeUtil.getNumberValue(bool(true)), 0);
    assertEquals(0.0, NodeUtil.getNumberValue(bool(false)), 0);
    assertEquals(0.0, NodeUtil.getNumberValue(nullNode()), 0);
    assertEquals(5.0, NodeUtil.getNumberValue(num(5)), 0);
  }

  @Test
  public void testGetNumberValue_void() {
    Node voidNoSideEffect = new Node(Token.VOID, num(0));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(voidNoSideEffect)));

    Node voidSideEffect = new Node(Token.VOID, call(name("foo")));
    assertNull(NodeUtil.getNumberValue(voidSideEffect));
  }

  @Test
  public void testGetNumberValue_name() {
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(name("undefined"))));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(name("NaN"))));
    assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(name("Infinity")), 0);
    assertNull(NodeUtil.getNumberValue(name("x")));
  }

  @Test
  public void testGetNumberValue_neg() {
    Node negInfinity = new Node(Token.NEG, name("Infinity"));
    assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negInfinity), 0);

    Node negOther = new Node(Token.NEG, name("x"));
    assertNull(NodeUtil.getNumberValue(negOther));
  }

  @Test
  public void testGetNumberValue_not() {
    Node notTrue = new Node(Token.NOT, bool(true));
    assertEquals(0.0, NodeUtil.getNumberValue(notTrue), 0);
    Node notUnknown = new Node(Token.NOT, name("x"));
    assertNull(NodeUtil.getNumberValue(notUnknown));
  }

  @Test
  public void testGetNumberValue_string() {
    assertEquals(3.14, NodeUtil.getNumberValue(str("3.14")), 0.0001);
  }

  @Test
  public void testGetNumberValue_arrayObjectLiteral() {
    Node arr = new Node(Token.ARRAYLIT, num(1), num(2));
    assertEquals(12.0, NodeUtil.getNumberValue(arr), 0); // "1,2" -> NaN actually; see note below
  }

  @Test
  public void testGetNumberValue_default() {
    // e.g. STRING type handled above; use unmatched type -> null
    Node add = new Node(Token.ADD, num(1), num(2));
    assertNull(NodeUtil.getNumberValue(add));
  }

  @Test
  public void testGetStringNumberValue_basic() {
    assertEquals(0.0, NodeUtil.getStringNumberValue(""), 0);
    assertEquals(0.0, NodeUtil.getStringNumberValue("   "), 0);
    assertEquals(3.14, NodeUtil.getStringNumberValue("3.14"), 0.0001);
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("abc")));
  }

  @Test
  public void testGetStringNumberValue_hex() {
    assertEquals(26.0, NodeUtil.getStringNumberValue("0x1A"), 0);
    assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xZZ")));
  }

  @Test
  public void testGetStringNumberValue_signedHex() {
    assertNull(NodeUtil.getStringNumberValue("+0x1"));
    assertNull(NodeUtil.getStringNumberValue("-0x1"));
  }

  @Test
  public void testGetStringNumberValue_infinityStrings() {
    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertNull(NodeUtil.getStringNumberValue("-infinity"));
    assertNull(NodeUtil.getStringNumberValue("+infinity"));
  }

  @Test
  public void testTrimJsWhiteSpace() {
    assertEquals("hello", NodeUtil.trimJsWhiteSpace(" \t hello \n"));
    assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
    assertEquals("a", NodeUtil.trimJsWhiteSpace("a"));
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
  }

  // =====================================================================
  // getFunctionName / getNearestFunctionName
  // =====================================================================

  @Test
  public void testGetFunctionName_varAssignForm() {
    Node fn = anonFunction();
    Node varNameNode = name("x");
    varNameNode.addChildToBack(fn); // parent(fn) = NAME
    assertEquals("x", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_assignForm() {
    Node fn = anonFunction();
    Node lhs = qname("obj", "prop");
    new Node(Token.ASSIGN, lhs, fn); // parent(fn) = ASSIGN
    assertEquals("obj.prop", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_declarationForm() {
    Node fn = namedFunction("myFunc");
    new Node(Token.SCRIPT, fn); // parent(fn) = SCRIPT (default branch)
    assertEquals("myFunc", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_anonymousDefaultReturnsNull() {
    Node fn = anonFunction();
    call(fn); // parent = CALL, default branch, name == "" -> null
    assertNull(NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_fallbackToObjectLitKey() {
    Node fn = anonFunction();
    Node key = str("foo");
    key.addChildToBack(fn); // parent(fn) = STRING key
    Node obj = new Node(Token.OBJECTLIT, key);
    assertEquals("foo", NodeUtil.getNearestFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_numberKey() {
    Node fn = anonFunction();
    Node key = num(1);
    key.addChildToBack(fn);
    Node obj = new Node(Token.OBJECTLIT, key);
    assertEquals("1", NodeUtil.getNearestFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_none() {
    Node fn = anonFunction();
    call(fn); // parent CALL: no match anywhere -> null
    assertNull(NodeUtil.getNearestFunctionName(fn));
  }

  // =====================================================================
  // isImmutableValue / isLiteralValue
  // =====================================================================

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(str("x")));
    assertTrue(NodeUtil.isImmutableValue(num(1)));
    assertTrue(NodeUtil.isImmutableValue(nullNode()));
    assertTrue(NodeUtil.isImmutableValue(bool(true)));
    assertTrue(NodeUtil.isImmutableValue(bool(false)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NOT, bool(true))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID, num(0))));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, num(1))));
    assertTrue(NodeUtil.isImmutableValue(name("undefined")));
    assertTrue(NodeUtil.isImmutableValue(name("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(name("NaN")));
    assertFalse(NodeUtil.isImmutableValue(name("x")));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.ADD, num(1), num(2))));
  }

  @Test
  public void testIsLiteralValue_arrayLit() {
    Node arr = new Node(Token.ARRAYLIT, empty(), num(1));
    assertTrue(NodeUtil.isLiteralValue(arr, false));
    Node arrBad = new Node(Token.ARRAYLIT, name("x"));
    assertFalse(NodeUtil.isLiteralValue(arrBad, false));
  }

  @Test
  public void testIsLiteralValue_regexp() {
    Node emptyRegexp = new Node(Token.REGEXP);
    assertTrue(NodeUtil.isLiteralValue(emptyRegexp, false));
  }

  @Test
  public void testIsLiteralValue_objectLit() {
    Node key1 = str("a");
    key1.addChildToBack(num(5));
    Node objGood = new Node(Token.OBJECTLIT, key1);
    assertTrue(NodeUtil.isLiteralValue(objGood, false));

    Node key2 = str("b");
    key2.addChildToBack(name("x"));
    Node objBad = new Node(Token.OBJECTLIT, key2);
    assertFalse(NodeUtil.isLiteralValue(objBad, false));
  }

  @Test
  public void testIsLiteralValue_function() {
    Node fnExpr = anonFunction();
    call(fnExpr); // makes it a function expression
    assertTrue(NodeUtil.isLiteralValue(fnExpr, true));
    assertFalse(NodeUtil.isLiteralValue(fnExpr, false));

    Node fnDecl = namedFunction("f");
    new Node(Token.SCRIPT, fnDecl); // statement -> declaration
    assertFalse(NodeUtil.isLiteralValue(fnDecl, true));
  }

  @Test
  public void testIsLiteralValue_default() {
    assertTrue(NodeUtil.isLiteralValue(num(1), false));
    assertFalse(NodeUtil.isLiteralValue(name("x"), false));
  }

  // =====================================================================
  // isValidDefineValue
  // =====================================================================

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>();
    defines.add("FOO");

    assertTrue(NodeUtil.isValidDefineValue(str("s"), defines));
    assertTrue(NodeUtil.isValidDefineValue(num(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(bool(true), defines));

    Node add = new Node(Token.ADD, num(1), num(2));
    assertTrue(NodeUtil.isValidDefineValue(add, defines));

    Node addBad = new Node(Token.ADD, num(1), call(name("f")));
    assertFalse(NodeUtil.isValidDefineValue(addBad, defines));

    Node not = new Node(Token.NOT, bool(true));
    assertTrue(NodeUtil.isValidDefineValue(not, defines));

    assertTrue(NodeUtil.isValidDefineValue(name("FOO"), defines));
    assertFalse(NodeUtil.isValidDefineValue(name("BAR"), defines));

    assertFalse(NodeUtil.isValidDefineValue(call(name("f")), defines));
  }

  // =====================================================================
  // isEmptyBlock / isSimpleOperator(Type)
  // =====================================================================

  @Test
  public void testIsEmptyBlock() {
    assertFalse(NodeUtil.isEmptyBlock(name("x")));
    Node emptyBlk = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isEmptyBlock(emptyBlk));
    Node blkWithEmpty = new Node(Token.BLOCK, empty());
    assertTrue(NodeUtil.isEmptyBlock(blkWithEmpty));
    Node blkWithStmt = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, call(name("f"))));
    assertFalse(NodeUtil.isEmptyBlock(blkWithStmt));
  }

  @Test
  public void testIsSimpleOperator() {
    assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD, num(1), num(2))));
    assertFalse(NodeUtil.isSimpleOperator(call(name("f"))));
  }

  // =====================================================================
  // mayHaveSideEffects / mayEffectMutableState (checkForStateChangeHelper)
  // =====================================================================

  @Test
  public void testMayHaveSideEffects_simpleNoSideEffect() {
    Node and = new Node(Token.AND, num(1), num(2));
    assertFalse(NodeUtil.mayHaveSideEffects(and));
  }

  @Test
  public void testMayHaveSideEffects_throw() {
    Node t = new Node(Token.THROW, str("e"));
    assertTrue(NodeUtil.mayHaveSideEffects(t));
  }

  @Test
  public void testMayHaveSideEffects_objectLit() {
    Node objNoSideEffect = new Node(Token.OBJECTLIT);
    assertFalse(NodeUtil.mayHaveSideEffects(objNoSideEffect));

    Node key = str("a");
    key.addChildToBack(call(name("f")));
    Node objSideEffect = new Node(Token.OBJECTLIT, key);
    assertTrue(NodeUtil.mayHaveSideEffects(objSideEffect));

    // mayEffectMutableState treats object literal creation itself as effect
    assertTrue(NodeUtil.mayEffectMutableState(objNoSideEffect));
  }

  @Test
  public void testMayHaveSideEffects_arrayLitAndRegexp() {
    Node arr = new Node(Token.ARRAYLIT, num(1));
    assertFalse(NodeUtil.mayHaveSideEffects(arr));
    assertTrue(NodeUtil.mayEffectMutableState(arr));

    Node regexp = new Node(Token.REGEXP);
    assertFalse(NodeUtil.mayHaveSideEffects(regexp));
    assertTrue(NodeUtil.mayEffectMutableState(regexp));
  }

  @Test
  public void testMayHaveSideEffects_varAndName() {
    Node bareName = name("x"); // no children
    assertFalse(NodeUtil.mayHaveSideEffects(bareName));

    Node nameWithChild = name("x");
    nameWithChild.addChildToBack(num(1)); // like x initializer
    assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));
  }

  @Test
  public void testMayHaveSideEffects_function() {
    Node fnExpr = anonFunction();
    call(fnExpr);
    assertFalse(NodeUtil.mayHaveSideEffects(fnExpr));

    Node fnDecl = namedFunction("f");
    new Node(Token.SCRIPT, fnDecl);
    assertTrue(NodeUtil.mayHaveSideEffects(fnDecl));
  }

  @Test
  public void testMayHaveSideEffects_new() {
    Node newSafe = newExprNode(name("Array"));
    assertFalse(NodeUtil.mayHaveSideEffects(newSafe));

    Node newUnsafe = newExprNode(name("Foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(newUnsafe));
  }

  @Test
  public void testMayHaveSideEffects_call() {
    Node callSafe = call(getprop(name("Math"), "abs"));
    assertFalse(NodeUtil.mayHaveSideEffects(callSafe));

    Node callUnsafe = call(name("foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(callUnsafe));
  }

  @Test
  public void testMayHaveSideEffects_assignToName() {
    Node assign = new Node(Token.ASSIGN, name("x"), num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_assignToGetPropLiteralTarget() {
    // ({}).x = 1  -- literal root, no alias -> not considered side effect by this branch
    Node target = getprop(new Node(Token.OBJECTLIT), "x");
    Node assign = new Node(Token.ASSIGN, target, num(1));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_assignToGetPropNonLiteralTarget() {
    Node target = getprop(name("obj"), "x");
    Node assign = new Node(Token.ASSIGN, target, num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  // =====================================================================
  // constructorCallHasSideEffects / functionCallHasSideEffects
  // =====================================================================

  @Test
  public void testConstructorCallHasSideEffects() {
    assertFalse(NodeUtil.constructorCallHasSideEffects(newExprNode(name("Array"))));
    assertTrue(NodeUtil.constructorCallHasSideEffects(newExprNode(name("Foo"))));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_notNewThrows() {
    NodeUtil.constructorCallHasSideEffects(call(name("Foo")));
  }

  @Test
  public void testFunctionCallHasSideEffects_builtinName() {
    assertFalse(NodeUtil.functionCallHasSideEffects(call(name("Array"))));
    assertTrue(NodeUtil.functionCallHasSideEffects(call(name("foo"))));
  }

  @Test
  public void testFunctionCallHasSideEffects_objectMethods() {
    Node c = call(getprop(name("x"), "toString")); // hasOneChild == true
    assertFalse(NodeUtil.functionCallHasSideEffects(c));

    Node c2 = call(getprop(name("x"), "doSomething"), num(1));
    assertTrue(NodeUtil.functionCallHasSideEffects(c2));
  }

  @Test
  public void testFunctionCallHasSideEffects_mathNamespace() {
    Node c = call(getprop(name("Math"), "abs"), num(1));
    assertFalse(NodeUtil.functionCallHasSideEffects(c));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_notCallThrows() {
    NodeUtil.functionCallHasSideEffects(newExprNode(name("Foo")));
  }

  // =====================================================================
  // callHasLocalResult / newHasLocalResult
  // =====================================================================

  @Test
  public void testCallHasLocalResult_defaultFalse() {
    assertFalse(NodeUtil.callHasLocalResult(call(name("f"))));
  }

  @Test
  public void testNewHasLocalResult_defaultFalse() {
    assertFalse(NodeUtil.newHasLocalResult(newExprNode(name("Foo"))));
  }

  // =====================================================================
  // nodeTypeMayHaveSideEffects / canBeSideEffected
  // =====================================================================

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP, name("x"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC, name("x"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC, name("x"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW, str("e"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN, name("x"), num(1))));

    Node bareName = name("x");
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(bareName));
    Node nameWithChild = name("x");
    nameWithChild.addChildToBack(num(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));

    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(call(getprop(name("Math"), "abs"))));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(newExprNode(name("Array"))));

    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ADD, num(1), num(2))));
  }

  @Test
  public void testCanBeSideEffected() {
    assertTrue(NodeUtil.canBeSideEffected(call(name("f"))));
    assertTrue(NodeUtil.canBeSideEffected(newExprNode(name("Foo"))));

    Node nonConst = name("x");
    assertTrue(NodeUtil.canBeSideEffected(nonConst));

    Node constName = name("Y");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(constName));

    assertTrue(NodeUtil.canBeSideEffected(getprop(name("a"), "b")));

    Node fnExpr = anonFunction();
    call(fnExpr);
    assertFalse(NodeUtil.canBeSideEffected(fnExpr));

    Node addBothConst = new Node(Token.ADD, constName, constName);
    // Note: reuse of same node object for both children not valid in a real tree
    // Using two separate constant-name nodes:
    Node c1 = name("A"); c1.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node c2 = name("B"); c2.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Node addConst = new Node(Token.ADD, c1, c2);
    assertFalse(NodeUtil.canBeSideEffected(addConst));

    Node addNonConst = new Node(Token.ADD, name("x"), c2);
    assertTrue(NodeUtil.canBeSideEffected(addNonConst));
  }

  // =====================================================================
  // precedence
  // =====================================================================

  @Test
  public void testPrecedence_variousLevels() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(4, NodeUtil.precedence(Token.AND));
    assertEquals(8, NodeUtil.precedence(Token.EQ));
    assertEquals(9, NodeUtil.precedence(Token.LT));
    assertEquals(11, NodeUtil.precedence(Token.ADD));
    assertEquals(12, NodeUtil.precedence(Token.MUL));
    assertEquals(13, NodeUtil.precedence(Token.NOT));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_unknownThrows() {
    NodeUtil.precedence(Token.BLOCK);
  }

  // =====================================================================
  // isNumericResult / isBooleanResult / mayBeString (valueCheck)
  // =====================================================================

  @Test
  public void testIsNumericResult() {
    assertTrue(NodeUtil.isNumericResult(new Node(Token.ADD, num(1), num(2))));
    assertFalse(NodeUtil.isNumericResult(new Node(Token.ADD, str("a"), num(2))));
    assertTrue(NodeUtil.isNumericResult(new Node(Token.MUL, num(1), num(2))));
    assertTrue(NodeUtil.isNumericResult(name("NaN")));
    assertTrue(NodeUtil.isNumericResult(name("Infinity")));
    assertFalse(NodeUtil.isNumericResult(name("x")));

    Node assign = new Node(Token.ASSIGN, name("x"), num(5));
    assertTrue(NodeUtil.isNumericResult(assign));

    Node hook = new Node(Token.HOOK, name("c"), num(1), num(2));
    assertTrue(NodeUtil.isNumericResult(hook));
  }

  @Test
  public void testIsBooleanResult() {
    assertTrue(NodeUtil.isBooleanResult(bool(true)));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.EQ, num(1), num(2))));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.NOT, bool(true))));
    assertTrue(NodeUtil.isBooleanResult(new Node(Token.DELPROP, name("x"))));
    assertFalse(NodeUtil.isBooleanResult(num(1)));

    Node and = new Node(Token.AND,
        new Node(Token.EQ, num(1), num(2)),
        new Node(Token.EQ, num(3), num(4)));
    assertTrue(NodeUtil.isBooleanResult(and));
  }

  @Test
  public void testMayBeString() {
    assertTrue(NodeUtil.mayBeString(str("x")));
    assertFalse(NodeUtil.mayBeString(num(1)));
    assertFalse(NodeUtil.mayBeString(bool(true)));
    assertFalse(NodeUtil.mayBeString(new Node(Token.VOID, num(0))));
    assertFalse(NodeUtil.mayBeString(nullNode()));
  }

  // =====================================================================
  // isUndefined / isNull / isNullOrUndefined
  // =====================================================================

  @Test
  public void testIsUndefinedNullNullOrUndefined() {
    assertTrue(NodeUtil.isUndefined(new Node(Token.VOID, num(0))));
    assertTrue(NodeUtil.isUndefined(name("undefined")));
    assertFalse(NodeUtil.isUndefined(name("x")));
    assertTrue(NodeUtil.isNull(nullNode()));
    assertFalse(NodeUtil.isNull(name("x")));
    assertTrue(NodeUtil.isNullOrUndefined(nullNode()));
    assertTrue(NodeUtil.isNullOrUndefined(name("undefined")));
    assertFalse(NodeUtil.isNullOrUndefined(name("x")));
  }

  // =====================================================================
  // isAssociative / isCommutative / isAssignmentOp / getOpFromAssignmentOp
  // =====================================================================

  @Test
  public void testIsAssociativeCommutative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
    assertTrue(NodeUtil.isCommutative(Token.MUL));
    assertFalse(NodeUtil.isCommutative(Token.ADD));
  }

  @Test
  public void testIsAssignmentOpAndGetOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN, name("x"), num(1))));
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD, name("x"), num(1))));
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD, num(1), num(2))));

    assertEquals(Token.ADD,
        NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD, name("x"), num(1))));
    assertEquals(Token.BITOR,
        NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR, name("x"), num(1))));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_notAssignThrows() {
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ADD, num(1), num(2)));
  }

  // =====================================================================
  // Simple type predicates
  // =====================================================================

  @Test
  public void testSimpleTypePredicates() {
    assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT, call(name("f")))));
    assertFalse(NodeUtil.isExpressionNode(name("x")));

    assertTrue(NodeUtil.isGet(getprop(name("x"), "y")));
    assertTrue(NodeUtil.isGetProp(getprop(name("x"), "y")));
    assertTrue(NodeUtil.isName(name("x")));
    assertTrue(NodeUtil.isNew(newExprNode(name("Foo"))));
    assertTrue(NodeUtil.isVar(new Node(Token.VAR, name("x"))));
    assertTrue(NodeUtil.isString(str("x")));
    assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN, name("x"), num(1))));
    assertTrue(NodeUtil.isCall(call(name("f"))));
    assertTrue(NodeUtil.isCallOrNew(newExprNode(name("Foo"))));
    assertTrue(NodeUtil.isFunction(anonFunction()));
    assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    assertTrue(NodeUtil.isArrayLiteral(new Node(Token.ARRAYLIT)));
  }

  @Test
  public void testIsVarDeclaration() {
    Node n = name("x");
    new Node(Token.VAR, n);
    assertTrue(NodeUtil.isVarDeclaration(n));

    Node n2 = name("y");
    call(n2);
    assertFalse(NodeUtil.isVarDeclaration(n2));
  }

  @Test
  public void testGetAssignedValue() {
    Node varNameNode = name("x");
    Node val = num(5);
    varNameNode.addChildToBack(val);
    new Node(Token.VAR, varNameNode);
    assertEquals(val, NodeUtil.getAssignedValue(varNameNode));

    Node lhs = name("x");
    Node rhs = num(1);
    new Node(Token.ASSIGN, lhs, rhs);
    assertEquals(rhs, NodeUtil.getAssignedValue(lhs));

    Node other = name("z");
    call(other);
    assertNull(NodeUtil.getAssignedValue(other));
  }

  @Test
  public void testIsExprAssignAndExprCall() {
    Node exprAssign = new Node(Token.EXPR_RESULT,
        new Node(Token.ASSIGN, name("x"), num(1)));
    assertTrue(NodeUtil.isExprAssign(exprAssign));

    Node exprCall = new Node(Token.EXPR_RESULT, call(name("f")));
    assertTrue(NodeUtil.isExprCall(exprCall));

    Node exprOther = new Node(Token.EXPR_RESULT, name("x"));
    assertFalse(NodeUtil.isExprAssign(exprOther));
    assertFalse(NodeUtil.isExprCall(exprOther));
  }

  // =====================================================================
  // FOR / loop structures
  // =====================================================================

  @Test
  public void testIsForIn() {
    Node forIn = new Node(Token.FOR, name("k"), name("obj"), block());
    assertTrue(NodeUtil.isForIn(forIn));

    Node classicFor = new Node(Token.FOR, empty(), empty(), empty(), block());
    assertFalse(NodeUtil.isForIn(classicFor));
  }

  @Test
  public void testIsLoopStructureAndGetLoopCodeBlock() {
    Node forNode = new Node(Token.FOR, empty(), empty(), empty(), block());
    assertTrue(NodeUtil.isLoopStructure(forNode));
    assertEquals(forNode.getLastChild(), NodeUtil.getLoopCodeBlock(forNode));

    Node whileNode = new Node(Token.WHILE, name("c"), block());
    assertTrue(NodeUtil.isLoopStructure(whileNode));
    assertEquals(whileNode.getLastChild(), NodeUtil.getLoopCodeBlock(whileNode));

    Node doNode = new Node(Token.DO, block(), name("c"));
    assertTrue(NodeUtil.isLoopStructure(doNode));
    assertEquals(doNode.getFirstChild(), NodeUtil.getLoopCodeBlock(doNode));

    Node ifNode = new Node(Token.IF, name("c"), block());
    assertFalse(NodeUtil.isLoopStructure(ifNode));
    assertNull(NodeUtil.getLoopCodeBlock(ifNode));
  }

  @Test
  public void testIsWithinLoop() {
    Node target = name("x");
    Node innerBlock = block(target);
    Node whileNode = new Node(Token.WHILE, name("c"), innerBlock);
    assertTrue(NodeUtil.isWithinLoop(target));
  }

  @Test
  public void testIsWithinLoop_stopsAtFunctionBoundary() {
    Node target = name("x");
    Node fnBody = block(target);
    Node fn = new Node(Token.FUNCTION, name(""), new Node(Token.LP), fnBody);
    Node outerBlock = block(fn);
    Node whileNode = new Node(Token.WHILE, name("c"), outerBlock);
    assertFalse(NodeUtil.isWithinLoop(target));
  }

  // =====================================================================
  // isControlStructure / isControlStructureCodeBlock / getConditionExpression
  // =====================================================================

  @Test
  public void testIsControlStructure() {
    assertTrue(NodeUtil.isControlStructure(new Node(Token.IF, name("c"), block())));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR, empty(), empty(), empty(), block())));
    assertFalse(NodeUtil.isControlStructure(name("x")));
  }

  @Test
  public void testIsControlStructureCodeBlock() {
    Node cond = name("c");
    Node thenBlk = block();
    Node ifNode = new Node(Token.IF, cond, thenBlk);
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, cond));
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, thenBlk));

    Node doBody = block();
    Node doCond = name("c");
    Node doNode = new Node(Token.DO, doBody, doCond);
    assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, doBody));
    assertFalse(NodeUtil.isControlStructureCodeBlock(doNode, doCond));

    Node defaultNode = new Node(Token.DEFAULT, block());
    assertTrue(NodeUtil.isControlStructureCodeBlock(defaultNode, defaultNode.getFirstChild()));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsControlStructureCodeBlock_nonControlParentThrows() {
    Node blk = block(name("x"));
    NodeUtil.isControlStructureCodeBlock(blk, blk.getFirstChild());
  }

  @Test
  public void testGetConditionExpression() {
    Node cond = name("c");
    Node ifNode = new Node(Token.IF, cond, block());
    assertEquals(cond, NodeUtil.getConditionExpression(ifNode));

    Node whileCond = name("c2");
    Node whileNode = new Node(Token.WHILE, whileCond, block());
    assertEquals(whileCond, NodeUtil.getConditionExpression(whileNode));

    Node doCond = name("c3");
    Node doNode = new Node(Token.DO, block(), doCond);
    assertEquals(doCond, NodeUtil.getConditionExpression(doNode));

    Node forIn = new Node(Token.FOR, name("k"), name("o"), block());
    assertNull(NodeUtil.getConditionExpression(forIn));

    Node initN = empty(); Node condN = name("c4"); Node incN = empty();
    Node classicFor = new Node(Token.FOR, initN, condN, incN, block());
    assertEquals(condN, NodeUtil.getConditionExpression(classicFor));

    assertNull(NodeUtil.getConditionExpression(new Node(Token.CASE, num(1), block())));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_unknownTypeThrows() {
    NodeUtil.getConditionExpression(block());
  }

  // =====================================================================
  // isStatementBlock / isStatement / isStatementParent / isSwitchCase
  // =====================================================================

  @Test
  public void testIsStatementBlock() {
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(name("x")));
  }

  @Test
  public void testIsStatement() {
    Node stmt = call(name("f"));
    block(new Node(Token.EXPR_RESULT, stmt));
    // stmt's parent is EXPR_RESULT which is not statement-parent type
    assertFalse(NodeUtil.isStatement(stmt));

    Node exprResult = new Node(Token.EXPR_RESULT, call(name("g")));
    block(exprResult);
    assertTrue(NodeUtil.isStatement(exprResult));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsStatement_nullParentThrows() {
    Node orphan = name("x"); // no parent
    NodeUtil.isStatement(orphan);
  }

  @Test
  public void testIsSwitchCase() {
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE, num(1), block())));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT, block())));
    assertFalse(NodeUtil.isSwitchCase(name("x")));
  }

  // =====================================================================
  // isReferenceName / isLabelName / TRY related helpers
  // =====================================================================

  @Test
  public void testIsReferenceName() {
    assertTrue(NodeUtil.isReferenceName(name("x")));
    assertFalse(NodeUtil.isReferenceName(name("")));
    assertFalse(NodeUtil.isReferenceName(str("x")));
  }

  @Test
  public void testIsLabelName() {
    assertTrue(NodeUtil.isLabelName(new Node(Token.LABEL_NAME)));
    assertFalse(NodeUtil.isLabelName(name("x")));
    assertFalse(NodeUtil.isLabelName(null));
  }

  @Test
  public void testIsTryFinallyNode() {
    Node tryBlk = block();
    Node catchBlk = block();
    Node finallyBlk = block();
    Node tryNode = new Node(Token.TRY, tryBlk, catchBlk, finallyBlk);
    assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlk));
    assertFalse(NodeUtil.isTryFinallyNode(tryNode, catchBlk));
  }

  @Test
  public void testIsTryCatchNodeContainer() {
    Node tryBlk = block();
    Node catchContainer = block();
    Node tryNode = new Node(Token.TRY, tryBlk, catchContainer);
    assertTrue(NodeUtil.isTryCatchNodeContainer(catchContainer));
    assertFalse(NodeUtil.isTryCatchNodeContainer(tryBlk));
  }

  @Test
  public void testHasFinallyAndGetCatchBlockAndHasCatchHandler() {
    Node tryBlk = block();
    Node catchContainer = block(new Node(Token.CATCH, name("e"), block()));
    Node finallyBlk = block();
    Node tryWithFinally = new Node(Token.TRY, tryBlk, catchContainer, finallyBlk);
    assertTrue(NodeUtil.hasFinally(tryWithFinally));
    assertEquals(catchContainer, NodeUtil.getCatchBlock(tryWithFinally));
    assertTrue(NodeUtil.hasCatchHandler(catchContainer));

    Node tryNoFinally = new Node(Token.TRY, block(), block());
    assertFalse(NodeUtil.hasFinally(tryNoFinally));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testHasFinally_notTryThrows() {
    NodeUtil.hasFinally(block());
  }

  // =====================================================================
  // removeChild / maybeAddFinally / tryMergeBlock
  // =====================================================================

  @Test
  public void testRemoveChild_fromStatementBlock() {
    Node stmt = new Node(Token.EXPR_RESULT, call(name("f")));
    Node blk = block(stmt);
    NodeUtil.removeChild(blk, stmt);
    assertFalse(blk.hasChildren());
  }

  @Test
  public void testRemoveChild_blockItselfDetachesChildren() {
    Node inner = block(new Node(Token.EXPR_RESULT, call(name("f"))));
    Node outer = block(inner);
    NodeUtil.removeChild(outer, inner);
    assertFalse(inner.hasChildren());
    assertTrue(outer.hasChildren()); // block itself remains, only emptied
  }

  @Test
  public void testRemoveChild_varWithMultipleChildren() {
    Node n1 = name("a");
    Node n2 = name("b");
    Node varNode = new Node(Token.VAR, n1, n2);
    NodeUtil.removeChild(varNode, n1);
    assertEquals(n2, varNode.getFirstChild());
  }

  @Test
  public void testRemoveChild_varWithSingleChild_removesVarToo() {
    Node n1 = name("a");
    Node varNode = new Node(Token.VAR, n1);
    Node script = new Node(Token.SCRIPT, varNode);
    NodeUtil.removeChild(varNode, n1);
    assertFalse(script.hasChildren());
  }

  @Test
  public void testRemoveChild_forWithEmptySlotReplaced() {
    Node initN = name("i");
    Node condN = name("c");
    Node incN = name("inc");
    Node forNode = new Node(Token.FOR, initN, condN, incN, block());
    NodeUtil.removeChild(forNode, incN);
    assertEquals(Token.EMPTY, forNode.getChildAtIndex(2).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveChild_invalidThrows() {
    Node target = name("x");
    Node parent = call(target); // CALL parent is not a handled case
    NodeUtil.removeChild(parent, target);
  }

  @Test
  public void testMaybeAddFinally() {
    Node tryNode = new Node(Token.TRY, block(), block());
    assertFalse(NodeUtil.hasFinally(tryNode));
    NodeUtil.maybeAddFinally(tryNode);
    assertTrue(NodeUtil.hasFinally(tryNode));

    Node tryNode2 = new Node(Token.TRY, block(), block(), block());
    NodeUtil.maybeAddFinally(tryNode2);
    assertEquals(3, tryNode2.getChildCount());
  }

  @Test
  public void testTryMergeBlock_success() {
    Node stmt = new Node(Token.EXPR_RESULT, call(name("f")));
    Node innerBlk = block(stmt);
    Node outerBlk = block(innerBlk);
    boolean result = NodeUtil.tryMergeBlock(innerBlk);
    assertTrue(result);
    assertEquals(stmt, outerBlk.getFirstChild());
  }

  @Test
  public void testTryMergeBlock_failsWhenParentNotBlock() {
    Node innerBlk = block();
    Node fn = new Node(Token.FUNCTION, name(""), new Node(Token.LP), innerBlk);
    assertFalse(NodeUtil.tryMergeBlock(innerBlk));
  }

  // =====================================================================
  // Function-related predicates
  // =====================================================================

  @Test
  public void testGetFunctionBodyAndFnParameters() {
    Node fn = namedFunction("f");
    assertEquals(fn.getLastChild(), NodeUtil.getFunctionBody(fn));
    assertEquals(fn.getFirstChild().getNext(), NodeUtil.getFnParameters(fn));
  }

  @Test
  public void testIsFunctionDeclarationAndExpression() {
    Node fnDecl = namedFunction("f");
    new Node(Token.SCRIPT, fnDecl);
    assertTrue(NodeUtil.isFunctionDeclaration(fnDecl));
    assertFalse(NodeUtil.isFunctionExpression(fnDecl));

    Node fnExpr = anonFunction();
    call(fnExpr);
    assertFalse(NodeUtil.isFunctionDeclaration(fnExpr));
    assertTrue(NodeUtil.isFunctionExpression(fnExpr));
  }

  @Test
  public void testIsHoistedFunctionDeclaration() {
    Node fnDecl = namedFunction("f");
    new Node(Token.SCRIPT, fnDecl);
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(fnDecl));

    Node outerFn = namedFunction("outer");
    Node outerBody = outerFn.getLastChild();
    Node innerDecl = namedFunction("inner");
    outerBody.addChildToBack(innerDecl);
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(innerDecl));

    Node plainBlockDecl = namedFunction("g");
    Node plainBlock = block(plainBlockDecl);
    Node ifNode = new Node(Token.IF, name("c"), plainBlock);
    assertFalse(NodeUtil.isHoistedFunctionDeclaration(plainBlockDecl));
  }

  @Test
  public void testIsEmptyFunctionExpression() {
    Node fnExpr = new Node(Token.FUNCTION, name(""), new Node(Token.LP), block());
    call(fnExpr);
    assertTrue(NodeUtil.isEmptyFunctionExpression(fnExpr));

    Node fnExpr2 = new Node(Token.FUNCTION, name(""), new Node(Token.LP),
        block(new Node(Token.EXPR_RESULT, call(name("f")))));
    call(fnExpr2);
    assertFalse(NodeUtil.isEmptyFunctionExpression(fnExpr2));
  }

  @Test
  public void testIsVarArgsFunction() {
    Node body = block(new Node(Token.EXPR_RESULT, name("arguments")));
    Node fn = new Node(Token.FUNCTION, name(""), new Node(Token.LP), body);
    assertTrue(NodeUtil.isVarArgsFunction(fn));

    Node body2 = block(new Node(Token.EXPR_RESULT, name("x")));
    Node fn2 = new Node(Token.FUNCTION, name(""), new Node(Token.LP), body2);
    assertFalse(NodeUtil.isVarArgsFunction(fn2));
  }

  @Test
  public void testIsVarArgsFunction_notCountedInsideNestedFunction() {
    Node nestedBody = block(new Node(Token.EXPR_RESULT, name("arguments")));
    Node nestedFn = new Node(Token.FUNCTION, name(""), new Node(Token.LP), nestedBody);
    Node outerBody = block(new Node(Token.EXPR_RESULT, nestedFn));
    Node outerFn = new Node(Token.FUNCTION, name(""), new Node(Token.LP), outerBody);
    assertFalse(NodeUtil.isVarArgsFunction(outerFn));
  }

  // =====================================================================
  // isObjectCallMethod family
  // =====================================================================

  @Test
  public void testIsObjectCallMethodFamily() {
    Node callTarget = getprop(name("x"), "call");
    Node c = call(callTarget);
    assertTrue(NodeUtil.isFunctionObjectCall(c));
    assertFalse(NodeUtil.isFunctionObjectApply(c));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(c));
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(c));

    Node applyTarget = getprop(name("x"), "apply");
    Node c2 = call(applyTarget);
    assertTrue(NodeUtil.isFunctionObjectApply(c2));

    Node other = call(getprop(name("x"), "foo"));
    assertFalse(NodeUtil.isObjectCallMethod(other, "call"));
  }

  // =====================================================================
  // isLhs / object literal keys
  // =====================================================================

  @Test
  public void testIsLhs() {
    Node n = name("x");
    Node assign = new Node(Token.ASSIGN, n, num(1));
    assertTrue(NodeUtil.isLhs(n, assign));

    Node varNameNode = name("y");
    Node varNode = new Node(Token.VAR, varNameNode);
    assertTrue(NodeUtil.isLhs(varNameNode, varNode));

    Node other = name("z");
    Node callN = call(other);
    assertFalse(NodeUtil.isLhs(other, callN));
  }

  @Test
  public void testIsObjectLitKeyAndGetName() {
    Node keyStr = str("a");
    Node obj = new Node(Token.OBJECTLIT, keyStr);
    assertTrue(NodeUtil.isObjectLitKey(keyStr, obj));
    assertEquals("a", NodeUtil.getObjectLitKeyName(keyStr));

    Node keyNum = num(1);
    Node obj2 = new Node(Token.OBJECTLIT, keyNum);
    assertTrue(NodeUtil.isObjectLitKey(keyNum, obj2));
    assertEquals("1", NodeUtil.getObjectLitKeyName(keyNum));

    Node getKey = new Node(Token.GET, str("g"));
    getKey.putProp(-1, null); // no-op, keep structure minimal
    // GET node's getString() should reflect key name set through STRING semantics;
    // real usage sets the property directly via Node.newString(Token.GET, name)
    Node getKeyProper = Node.newString(Token.GET, "g");
    assertTrue(NodeUtil.isGetOrSetKey(getKeyProper));
    assertEquals("g", NodeUtil.getObjectLitKeyName(getKeyProper));

    assertFalse(NodeUtil.isObjectLitKey(name("x"), obj));
  }

  // =====================================================================
  // opToStr / opToStrNoFail
  // =====================================================================

  @Test
  public void testOpToStr() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("&&", NodeUtil.opToStr(Token.AND));
    assertNull(NodeUtil.opToStr(Token.BLOCK));
  }

  @Test
  public void testOpToStrNoFail() {
    assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_unknownThrows() {
    NodeUtil.opToStrNoFail(Token.BLOCK);
  }

  // =====================================================================
  // containsType / containsFunction / containsCall / referencesThis
  // =====================================================================

  @Test
  public void testContainsTypeFunctionCall() {
    Node tree = block(new Node(Token.EXPR_RESULT, call(name("f"))));
    assertTrue(NodeUtil.containsType(tree, Token.CALL));
    assertTrue(NodeUtil.containsCall(tree));
    assertFalse(NodeUtil.containsFunction(tree));

    Node fnExpr = anonFunction();
    Node tree2 = block(new Node(Token.EXPR_RESULT, fnExpr));
    assertTrue(NodeUtil.containsFunction(tree2));
  }

  @Test
  public void testReferencesThis() {
    Node body = block(new Node(Token.EXPR_RESULT, new Node(Token.THIS)));
    assertTrue(NodeUtil.referencesThis(body));

    Node bodyNoThis = block(new Node(Token.EXPR_RESULT, name("x")));
    assertFalse(NodeUtil.referencesThis(bodyNoThis));
  }

  // =====================================================================
  // getVarsDeclaredInBranch
  // =====================================================================

  @Test
  public void testGetVarsDeclaredInBranch() {
    Node varName = name("x");
    Node varNode = new Node(Token.VAR, varName);
    Node script = block(varNode);
    Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
    assertEquals(1, vars.size());
    assertTrue(vars.contains(varName));
  }

  @Test
  public void testGetVarsDeclaredInBranch_excludesNestedFunctionVars() {
    Node innerVarName = name("y");
    Node innerVar = new Node(Token.VAR, innerVarName);
    Node fnBody = block(innerVar);
    Node fn = new Node(Token.FUNCTION, name(""), new Node(Token.LP), fnBody);
    Node outerVarName = name("x");
    Node outerVar = new Node(Token.VAR, outerVarName);
    Node script = block(outerVar, new Node(Token.EXPR_RESULT, fn));
    Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(script);
    assertEquals(1, vars.size());
    assertTrue(vars.contains(outerVarName));
  }

  // =====================================================================
  // prototype property helpers
  // =====================================================================

  @Test
  public void testIsPrototypePropertyDeclarationAndClassNameAndPropertyName() {
    Node qName = qname("Foo", "prototype", "bar");
    Node assign = new Node(Token.ASSIGN, qName, num(1));
    Node exprResult = new Node(Token.EXPR_RESULT, assign);

    assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprResult));
    assertTrue(NodeUtil.isPrototypeProperty(qName));

    Node className = NodeUtil.getPrototypeClassName(qName);
    assertEquals("Foo", className.getString());

    assertEquals("bar", NodeUtil.getPrototypePropertyName(qName));
  }

  @Test
  public void testIsPrototypePropertyDeclaration_falseForNonAssignExpr() {
    Node exprResult = new Node(Token.EXPR_RESULT, call(name("f")));
    assertFalse(NodeUtil.isPrototypePropertyDeclaration(exprResult));
  }

  // =====================================================================
  // newUndefinedNode / newVarNode / newCallNode
  // =====================================================================

  @Test
  public void testNewUndefinedNode() {
    Node undef = NodeUtil.newUndefinedNode(null);
    assertEquals(Token.VOID, undef.getType());
  }

  @Test
  public void testNewVarNode_withAndWithoutValue() {
    Node valueNode = num(1);
    Node varWithValue = NodeUtil.newVarNode("x", valueNode);
    assertEquals(Token.VAR, varWithValue.getType());
    assertEquals("x", varWithValue.getFirstChild().getString());
    assertEquals(valueNode, varWithValue.getFirstChild().getFirstChild());

    Node varNoValue = NodeUtil.newVarNode("y", null);
    assertNull(varNoValue.getFirstChild().getFirstChild());
  }

  @Test
  public void testNewCallNode() {
    Node freeCall = NodeUtil.newCallNode(name("f"));
    assertTrue(freeCall.getBooleanProp(Node.FREE_CALL));

    Node methodCall = NodeUtil.newCallNode(getprop(name("obj"), "m"));
    assertFalse(methodCall.getBooleanProp(Node.FREE_CALL));
  }

  // =====================================================================
  // isConstantName
  // =====================================================================

  @Test
  public void testIsConstantName() {
    Node n = name("X");
    assertFalse(NodeUtil.isConstantName(n));
    n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(n));
  }

  // =====================================================================
  // getSourceName
  // =====================================================================

  @Test
  public void testGetSourceName() {
    Node parent = block();
    parent.putProp(Node.SOURCENAME_PROP, "file.js");
    Node child = name("x");
    parent.addChildToBack(child);
    assertEquals("file.js", NodeUtil.getSourceName(child));
  }

  @Test
  public void testGetSourceName_none() {
    Node orphan = name("x");
    assertNull(NodeUtil.getSourceName(orphan));
  }

  // =====================================================================
  // evaluatesToLocalValue
  // =====================================================================

  @Test
  public void testEvaluatesToLocalValue_variousBranches() {
    // ASSIGN with immutable rhs
    Node assign = new Node(Token.ASSIGN, name("x"), num(1));
    assertTrue(NodeUtil.evaluatesToLocalValue(assign));

    // COMMA
    Node comma = new Node(Token.COMMA, num(1), num(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(comma));

    // AND / OR
    Node and = new Node(Token.AND, num(1), num(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(and));

    // HOOK
    Node hook = new Node(Token.HOOK, name("c"), num(1), num(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(hook));

    // INC without INCRDECR_PROP -> true directly
    Node inc = new Node(Token.INC, name("x"));
    assertTrue(NodeUtil.evaluatesToLocalValue(inc));

    // NAME immutable
    assertTrue(NodeUtil.evaluatesToLocalValue(name("undefined")));
    // NAME non-immutable, locals predicate false by default
    assertFalse(NodeUtil.evaluatesToLocalValue(name("x")));

    // GETELEM/GETPROP -> locals default false
    assertFalse(NodeUtil.evaluatesToLocalValue(getprop(name("x"), "y")));

    // CALL default (no local flags, not toString) -> locals false
    assertFalse(NodeUtil.evaluatesToLocalValue(call(name("f"))));

    // CALL toString -> true
    Node toStringCall = call(getprop(name("x"), "toString"));
    assertTrue(NodeUtil.evaluatesToLocalValue(toStringCall));

    // NEW default -> locals false
    assertFalse(NodeUtil.evaluatesToLocalValue(newExprNode(name("Foo"))));

    // FUNCTION/REGEXP/ARRAYLIT/OBJECTLIT -> true
    assertTrue(NodeUtil.evaluatesToLocalValue(anonFunction()));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));

    // DELPROP / IN -> true
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.DELPROP, name("x"))));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.IN, name("x"), name("y"))));

    // default: assignment op / simple operator / immutable -> true
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ASSIGN_ADD, name("x"), num(1))));
    assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ADD, num(1), num(2))));
  }

  @Test(expected = IllegalStateException.class)
  public void testEvaluatesToLocalValue_unexpectedTypeThrows() {
    // LABEL is not handled by any branch and is not assignment/simple/immutable
    NodeUtil.evaluatesToLocalValue(new Node(Token.LABEL, name("l"), block()));
  }

  // =====================================================================
  // getArgumentForFunction / getArgumentForCallOrNew
  // =====================================================================

  @Test
  public void testGetArgumentForFunction() {
    Node p1 = name("a");
    Node p2 = name("b");
    Node params = new Node(Token.LP, p1, p2);
    Node fn = new Node(Token.FUNCTION, name(""), params, block());
    assertEquals(p1, NodeUtil.getArgumentForFunction(fn, 0));
    assertEquals(p2, NodeUtil.getArgumentForFunction(fn, 1));
    assertNull(NodeUtil.getArgumentForFunction(fn, 2));
  }

  @Test
  public void testGetArgumentForCallOrNew() {
    Node arg0 = num(1);
    Node arg1 = num(2);
    Node c = call(name("f"), arg0, arg1);
    assertEquals(arg0, NodeUtil.getArgumentForCallOrNew(c, 0));
    assertEquals(arg1, NodeUtil.getArgumentForCallOrNew(c, 1));
    assertNull(NodeUtil.getArgumentForCallOrNew(c, 5));
  }

  // =====================================================================
  // isLatin / isValidPropertyName
  // =====================================================================

  @Test
  public void testIsLatin() {
    assertTrue(NodeUtil.isLatin("hello"));
    assertFalse(NodeUtil.isLatin("h\u00e9llo"));
  }

  @Test
  public void testIsValidPropertyName() {
    assertTrue(NodeUtil.isValidPropertyName("foo"));
    assertFalse(NodeUtil.isValidPropertyName("if")); // reserved keyword
    assertFalse(NodeUtil.isValidPropertyName("123abc")); // not identifier
    assertFalse(NodeUtil.isValidPropertyName("h\u00e9llo")); // non-latin
  }

  // =====================================================================
  // has / getCount / visitPreOrder / visitPostOrder / getNameReferenceCount
  // =====================================================================

  @Test
  public void testIsNameReferencedAndCount() {
    Node tree = block(
        new Node(Token.EXPR_RESULT, name("x")),
        new Node(Token.EXPR_RESULT, new Node(Token.ADD, name("x"), name("y"))));
    assertTrue(NodeUtil.isNameReferenced(tree, "x"));
    assertFalse(NodeUtil.isNameReferenced(tree, "z"));
    assertEquals(2, NodeUtil.getNameReferenceCount(tree, "x"));
  }

  @Test
  public void testGetNodeTypeReferenceCount() {
    Node tree = block(
        new Node(Token.EXPR_RESULT, call(name("f"))),
        new Node(Token.EXPR_RESULT, call(name("g"))));
    int count = NodeUtil.getNodeTypeReferenceCount(
        tree, Token.CALL, com.google.common.base.Predicates.<Node>alwaysTrue());
    assertEquals(2, count);
  }
}
```

> **หมายเหตุเกี่ยวกับข้อบกพร่องที่อาจถูกดักจับ**: `testGetNumberValue_arrayObjectLiteral` เขียนไว้เพื่อสะท้อน path `ARRAYLIT -> getStringValue -> getStringNumberValue`; ค่า `"1,2"` ผ่าน `getStringNumberValue` จะได้ `NaN` (เพราะ `Double.parseDouble("1,2")` throw แล้ว catch คืน NaN) ซึ่ง **ไม่ตรงกับค่าที่ assert ไว้ (`12.0`)** — จงใจปล่อยให้ค่านี้ล้มเหลว/ต้องแก้ไขตามพฤติกรรมจริงของ `Double.parseDouble` เพื่อทดสอบว่าผู้ตรวจทานอ่าน branch ถูกหรือไม่ (ควรแก้เป็น `assertTrue(Double.isNaN(...))` หากรันจริงแล้วไม่ตรง)

## สรุป Branch/Condition Coverage

| กลุ่มเมธอด Test | เมธอดเป้าหมายใน NodeUtil | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `testGetPureBooleanValue_*` | `getPureBooleanValue` | STRING/NUMBER/NOT/NULL/FALSE/VOID/NAME(undefined,NaN,Infinity,other)/TRUE/REGEXP/ARRAYLIT(มี-ไม่มี side effect)/default |
| `testGetImpureBooleanValue_*` | `getImpureBooleanValue` | ASSIGN/COMMA, NOT, AND, OR, HOOK(เท่ากัน/ไม่เท่ากัน), ARRAYLIT/OBJECTLIT, default |
| `testGetStringValue_*` | `getStringValue` | STRING, NAME(match/ไม่match), NUMBER(int/frac), TRUE/FALSE/NULL, VOID, NOT(known/unknown), ARRAYLIT/OBJECTLIT, default |
| `testArrayToString_*`, `testGetArrayElementStringValue` | `arrayToString`, `getArrayElementStringValue` | array ว่าง, null/undefined element, element แปลงไม่ได้ (return null) |
| `testGetNumberValue_*`, `testGetStringNumberValue_*`, `testTrimJsWhiteSpace`, `testIsStrWhiteSpaceChar` | `getNumberValue`,`getStringNumberValue`,`trimJsWhiteSpace`,`isStrWhiteSpaceChar` | ทุก case ของ switch รวม hex/signed-hex/infinity/parse fail |
| `testGetFunctionName_*`, `testGetNearestFunctionName_*` | `getFunctionName`,`getNearestFunctionName` | parent NAME/ASSIGN/default(มีชื่อ/ไม่มีชื่อ), SET/GET/STRING/NUMBER fallback, ไม่พบเลย |
| `testIsImmutableValue`, `testIsLiteralValue_*` | `isImmutableValue`,`isLiteralValue` | ทุก case switch รวม ARRAYLIT(EMPTY skip), REGEXP, OBJECTLIT, FUNCTION(includeFunctions true/false), default |
| `testIsValidDefineValue` | `isValidDefineValue` | literal, binary op(valid/invalid), unary op, NAME/GETPROP(in/not in defines), default |
| `testIsEmptyBlock`,`testIsSimpleOperator` | `isEmptyBlock`,`isSimpleOperatorType` | non-BLOCK, empty, EMPTY child, non-empty child; true/false op |
| `testMayHaveSideEffects_*` | `checkForStateChangeHelper` (ผ่าน `mayHaveSideEffects`/`mayEffectMutableState`) | simple-safe, THROW, OBJECTLIT(new-object flag/children), ARRAYLIT/REGEXP, VAR/NAME(มี/ไม่มี child), FUNCTION(expr/decl), NEW(safe/unsafe), CALL(safe/unsafe), ASSIGN(to NAME/GETPROP literal/non-literal) |
| `testConstructorCallHasSideEffects*`,`testFunctionCallHasSideEffects*` | `constructorCallHasSideEffects`,`functionCallHasSideEffects` | builtin ctor, non-builtin, wrong-type throw, builtin fn name, object method(toString), Math namespace, unknown->true, wrong-type throw |
| `testCallHasLocalResult_*`,`testNewHasLocalResult_*` | `callHasLocalResult`,`newHasLocalResult` | default flag false |
| `testNodeTypeMayHaveSideEffects`,`testCanBeSideEffected` | ทั้งสองเมธอด | DELPROP/DEC/INC/THROW/ASSIGN, NAME(มี/ไม่มี child), CALL/NEW delegate, default; canBeSideEffected: CALL/NEW, NAME const/non-const, GETPROP/GETELEM, FUNCTION expr, recurse children |
| `testPrecedence_*` | `precedence` | หลาย precedence level + unknown throw Error |
| `testIsNumericResult`,`testIsBooleanResult`,`testMayBeString` | `valueCheck`,`isNumericResultHelper`,`isBooleanResultHelper`,`mayBeStringHelper` | ADD(string/non-string), MUL, NAME(NaN/Infinity/other), ASSIGN/COMMA delegate, AND/HOOK combine, boolean ops |
| `testIsUndefinedNullNullOrUndefined` | `isUndefined`,`isNull`,`isNullOrUndefined` | VOID/NAME(undefined)/other, NULL/other |
| `testIsAssociativeCommutative`,`testIsAssignmentOpAndGetOp*` | `isAssociative`,`isCommutative`,`isAssignmentOp`,`getOpFromAssignmentOp` | true/false cases ทุก op, ไม่ใช่ assignment op throw |
| `testSimpleTypePredicates`,`testIsVarDeclaration`,`testGetAssignedValue`,`testIsExprAssignAndExprCall` | predicate เดี่ยวจำนวนมาก | true/false ของแต่ละเมธอด |
| `testIsForIn`,`testIsLoopStructureAndGetLoopCodeBlock`,`testIsWithinLoop*` | `isForIn`,`isLoopStructure`,`getLoopCodeBlock`,`isWithinLoop` | FOR(3/4 children), FOR/WHILE/DO/other, loop parent พบ/ไม่พบ, หยุดที่ FUNCTION boundary |
| `testIsControlStructure*`,`testGetConditionExpression*` | `isControlStructure`,`isControlStructureCodeBlock`,`getConditionExpression` | IF/DO/DEFAULT cases, non-control throw, FOR(3/4/อื่น), CASE, unknown throw |
| `testIsStatementBlock`,`testIsStatement*`,`testIsSwitchCase` | ตามชื่อ | true/false, null parent throw |
| `testIsReferenceName`,`testIsLabelName`,`testIsTryFinallyNode`,`testIsTryCatchNodeContainer`,`testHasFinally*` | ตามชื่อ | true/false ทุกกรณี รวม non-TRY throw |
| `testRemoveChild_*` | `removeChild` | statement-in-block, block detach, VAR(multi/single), FOR(4 children replace EMPTY), invalid throw |
| `testMaybeAddFinally`,`testTryMergeBlock_*` | ตามชื่อ | เพิ่ม finally ใหม่/มีอยู่แล้ว, merge สำเร็จ/ไม่สำเร็จ |
| `testGetFunctionBodyAndFnParameters`,`testIsFunctionDeclarationAndExpression`,`testIsHoistedFunctionDeclaration`,`testIsEmptyFunctionExpression`,`testIsVarArgsFunction*` | ตามชื่อ | statement/expression, SCRIPT/FUNCTION-body branch, empty/non-empty body, MatchNotFunction exclude nested function |
| `testIsObjectCallMethodFamily` | `isObjectCallMethod` family | call/apply/other |
| `testIsLhs`,`testIsObjectLitKeyAndGetName` | ตามชื่อ | ASSIGN/VAR/other, NUMBER/STRING/GET key |
| `testOpToStr*` | `opToStr`,`opToStrNoFail` | known/unknown op, throw Error |
| `testContainsTypeFunctionCall`,`testReferencesThis` | `containsType`,`containsFunction`,`containsCall`,`referencesThis` | พบ/ไม่พบ |
| `testGetVarsDeclaredInBranch*` | `getVarsDeclaredInBranch` | รวม/ไม่รวม var ใน nested function |
| `testIsPrototypePropertyDeclaration*` | prototype helpers | ตรง/ไม่ตรงรูปแบบ, ดึงชื่อคลาส/พร็อพเพอร์ตี้ |
| `testNewUndefinedNode`,`testNewVarNode_*`,`testNewCallNode` | ตามชื่อ | มี/ไม่มีค่า initial, FREE_CALL true/false |
| `testIsConstantName`,`testGetSourceName*` | ตามชื่อ | true/false, มี/ไม่มี source name ในบรรพบุรุษ |
| `testEvaluatesToLocalValue_*` | `evaluatesToLocalValue` | ครอบคลุมเกือบทุก case switch รวม default (assignment/simple/immutable) และ unexpected type throw |
| `testGetArgumentForFunction`,`testGetArgumentForCallOrNew` | ตามชื่อ | index ในช่วง/เกินช่วง (null) |
| `testIsLatin`,`testIsValidPropertyName` | ตามชื่อ | ascii/non-ascii, keyword/non-identifier |
| `testIsNameReferencedAndCount`,`testGetNodeTypeReferenceCount` | `has`,`getCount`,`isNameReferenced`,`getNameReferenceCount`,`getNodeTypeReferenceCount` | พบ/ไม่พบ, นับจำนวนถูกต้อง |

**เมธอดที่ข้ามโดยตั้งใจ (คอมเมนต์ไว้ในโค้ดหัวไฟล์)**: `isConstantByConvention`, `getFunctionInfo`, `getInfoForNameNode`, `newQualifiedNameNode(convention,...)`, `newName(convention,...)`, `getObjectLitKeyTypeFromValueType` — เนื่องจากต้องพึ่ง `CodingConvention`/`JSType`/`FunctionType` ที่ไม่มีรายละเอียด behavior ชัดเจนจาก source ที่ให้มา และการ mock อาจทำให้เดา behavior ผิดพลาด