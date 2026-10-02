# NodeUtilTest.java

หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนด #4 - คอมเมนต์กำกับสมมติฐานที่ไม่ชัดเจนจาก source ที่ให้มา):
- คลาส `Node` ไม่ได้อยู่ใน source ที่ให้มา แต่ผมอนุมาน API ที่ใช้ได้จาก call-site ในตัว `NodeUtil` เอง เช่น `new Node(Token.X)`, `new Node(Token.X, child)`, `Node.newString(int type, String s)`, `Node.newNumber(double d)`, `addChildToBack(Node)`, `getParent()`, `getQualifiedName()`, `putProp/getProp`, `putBooleanProp/getBooleanProp` — สาธารณะ (public) เพราะถูกเรียกข้าม package ใน `NodeUtil` เอง
- `TernaryValue.toBoolean(boolean default)` และพฤติกรรม `equals()` อ้างอิงจาก logic ที่ปรากฏใน source เท่านั้น
- ทดสอบใน package เดียวกัน (`com.google.javascript.jscomp`) เพราะเมธอดส่วนใหญ่เป็น package-private static

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class NodeUtilTest {

  // ==================== Helper builders ====================
  // สร้าง node แบบ multi-child โดยใช้ addChildToBack ซึ่งเป็น pattern
  // ที่ใช้จริงในซอร์สโค้ดเป้าหมาย (ปลอดภัยกว่าเดา constructor แบบ n-arg)
  private static Node newNode(int type, Node... children) {
    Node n = new Node(type);
    for (Node c : children) {
      n.addChildToBack(c);
    }
    return n;
  }

  private static Node num(double d) {
    return Node.newNumber(d);
  }

  private static Node str(String s) {
    return Node.newString(Token.STRING, s);
  }

  private static Node name(String s) {
    return Node.newString(Token.NAME, s);
  }

  private static Node bool(boolean b) {
    return new Node(b ? Token.TRUE : Token.FALSE);
  }

  private static Node nullNode() {
    return new Node(Token.NULL);
  }

  // ==================== getBooleanValue ====================

  @Test
  public void testGetBooleanValue_string() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(str("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(str("a")));
  }

  @Test
  public void testGetBooleanValue_number() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(num(0)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(num(1)));
  }

  @Test
  public void testGetBooleanValue_not() {
    Node n = newNode(Token.NOT, bool(true));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n));
  }

  @Test
  public void testGetBooleanValue_nullFalseVoid() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nullNode()));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(bool(false)));
    assertEquals(TernaryValue.FALSE,
        NodeUtil.getBooleanValue(newNode(Token.VOID, num(0))));
  }

  @Test
  public void testGetBooleanValue_nameSpecial() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(name("undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(name("NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(name("Infinity")));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(name("x")));
  }

  @Test
  public void testGetBooleanValue_trueArrayObjectRegexp() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(bool(true)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
  }

  @Test
  public void testGetBooleanValue_defaultUnknown() {
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(new Node(Token.THIS)));
  }

  // ==================== getExpressionBooleanValue ====================

  @Test
  public void testGetExpressionBooleanValue_assignComma() {
    Node assign = newNode(Token.ASSIGN, name("a"), bool(true));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assign));

    Node comma = newNode(Token.COMMA, bool(true), bool(false));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(comma));
  }

  @Test
  public void testGetExpressionBooleanValue_not() {
    Node n = newNode(Token.NOT, bool(false));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(n));
  }

  @Test
  public void testGetExpressionBooleanValue_andOr() {
    Node and = newNode(Token.AND, bool(true), bool(false));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(and));

    Node or = newNode(Token.OR, bool(false), bool(true));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(or));
  }

  @Test
  public void testGetExpressionBooleanValue_hookSameDifferent() {
    Node hookSame = newNode(Token.HOOK, bool(true), bool(true), bool(true));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hookSame));

    Node hookDiff = newNode(Token.HOOK, bool(true), bool(true), bool(false));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hookDiff));
  }

  @Test
  public void testGetExpressionBooleanValue_default() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(bool(true)));
  }

  // ==================== getStringValue ====================

  @Test
  public void testGetStringValue_string() {
    assertEquals("hi", NodeUtil.getStringValue(str("hi")));
  }

  @Test
  public void testGetStringValue_nameSpecialAndOther() {
    assertEquals("undefined", NodeUtil.getStringValue(name("undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(name("Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(name("NaN")));
    assertNull(NodeUtil.getStringValue(name("x")));
  }

  @Test
  public void testGetStringValue_numberIntegerVsDecimal() {
    assertEquals("1", NodeUtil.getStringValue(num(1.0)));
    assertEquals("1.5", NodeUtil.getStringValue(num(1.5)));
  }

  @Test
  public void testGetStringValue_boolNull() {
    assertEquals(Node.tokenToName(Token.FALSE), NodeUtil.getStringValue(bool(false)));
    assertEquals(Node.tokenToName(Token.TRUE), NodeUtil.getStringValue(bool(true)));
    assertEquals(Node.tokenToName(Token.NULL), NodeUtil.getStringValue(nullNode()));
  }

  @Test
  public void testGetStringValue_void() {
    assertEquals("undefined", NodeUtil.getStringValue(newNode(Token.VOID, num(0))));
  }

  @Test
  public void testGetStringValue_notKnownAndUnknown() {
    // child boolean value ทราบ (TRUE) -> ผลลัพธ์ reversed ตามคอมเมนต์ใน source
    Node notKnownTrue = newNode(Token.NOT, bool(true));
    assertEquals("false", NodeUtil.getStringValue(notKnownTrue));

    // child boolean value ไม่ทราบ (UNKNOWN) -> break -> null
    Node notUnknown = newNode(Token.NOT, name("x"));
    assertNull(NodeUtil.getStringValue(notUnknown));
  }

  @Test
  public void testGetStringValue_arrayObjectDefault() {
    Node arr = newNode(Token.ARRAYLIT, num(1), num(2));
    assertEquals("1,2", NodeUtil.getStringValue(arr));

    assertEquals("[object Object]", NodeUtil.getStringValue(new Node(Token.OBJECTLIT)));

    assertNull(NodeUtil.getStringValue(new Node(Token.THIS)));
  }

  // ==================== getArrayElementStringValue / arrayToString ====================

  @Test
  public void testGetArrayElementStringValue_nullOrUndefined() {
    assertEquals("", NodeUtil.getArrayElementStringValue(nullNode()));
    assertEquals("", NodeUtil.getArrayElementStringValue(newNode(Token.VOID, num(0))));
    assertEquals("5", NodeUtil.getArrayElementStringValue(num(5)));
  }

  @Test
  public void testArrayToString_simple() {
    Node arr = newNode(Token.ARRAYLIT, num(1), str("a"), num(2));
    assertEquals("1,a,2", NodeUtil.arrayToString(arr));
  }

  @Test
  public void testArrayToString_containsUnconvertible() {
    Node arr = newNode(Token.ARRAYLIT, num(1), new Node(Token.THIS));
    assertNull(NodeUtil.arrayToString(arr));
  }

  @Test
  public void testArrayToString_withSkipIndexes() {
    // ไล่ตาม logic ของ while-loop skip ในซอร์ส: skipIndexes=[0]
    // => ผลลัพธ์ที่ trace ได้คือ ",1,2"
    Node arr = newNode(Token.ARRAYLIT, num(1), num(2));
    arr.putProp(Node.SKIP_INDEXES_PROP, new int[]{0});
    assertEquals(",1,2", NodeUtil.arrayToString(arr));
  }

  // ==================== getNumberValue ====================

  @Test
  public void testGetNumberValue_trueFalseNull() {
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(bool(true)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(bool(false)));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(nullNode()));
  }

  @Test
  public void testGetNumberValue_number() {
    assertEquals(Double.valueOf(3.14), NodeUtil.getNumberValue(num(3.14)));
  }

  @Test
  public void testGetNumberValue_voidNoSideEffect() {
    Node voidNode = newNode(Token.VOID, num(0));
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(voidNode));
  }

  @Test
  public void testGetNumberValue_voidWithSideEffect() {
    Node call = newNode(Token.CALL, name("foo"));
    Node voidNode = newNode(Token.VOID, call);
    assertNull(NodeUtil.getNumberValue(voidNode));
  }

  @Test
  public void testGetNumberValue_nameVariants() {
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(name("undefined")));
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(name("NaN")));
    assertEquals(Double.valueOf(Double.POSITIVE_INFINITY),
        NodeUtil.getNumberValue(name("Infinity")));
    assertNull(NodeUtil.getNumberValue(name("x")));
  }

  @Test
  public void testGetNumberValue_neg() {
    Node negInfinity = newNode(Token.NEG, name("Infinity"));
    assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY),
        NodeUtil.getNumberValue(negInfinity));

    Node negOther = newNode(Token.NEG, name("x"));
    assertNull(NodeUtil.getNumberValue(negOther));
  }

  @Test
  public void testGetNumberValue_not() {
    Node notTrue = newNode(Token.NOT, bool(true));
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(notTrue));

    Node notUnknown = newNode(Token.NOT, name("x"));
    assertNull(NodeUtil.getNumberValue(notUnknown));
  }

  @Test
  public void testGetNumberValue_string() {
    assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(str("")));
    assertEquals(Double.valueOf(42.0), NodeUtil.getNumberValue(str("42")));
  }

  @Test
  public void testGetNumberValue_arrayObject() {
    Node arr = newNode(Token.ARRAYLIT, num(1));
    assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(arr));

    Node obj = new Node(Token.OBJECTLIT);
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(obj));
  }

  @Test
  public void testGetNumberValue_default() {
    assertNull(NodeUtil.getNumberValue(new Node(Token.THIS)));
  }

  // ==================== getStringNumberValue ====================

  @Test
  public void testGetStringNumberValue_empty() {
    assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue(""));
    assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
  }

  @Test
  public void testGetStringNumberValue_hex() {
    assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
  }

  @Test
  public void testGetStringNumberValue_hexInvalid() {
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("0xZZ"));
  }

  @Test
  public void testGetStringNumberValue_signedHexReturnsNull() {
    assertNull(NodeUtil.getStringNumberValue("+0x1A"));
    assertNull(NodeUtil.getStringNumberValue("-0x1A"));
  }

  @Test
  public void testGetStringNumberValue_infinityVariants() {
    assertNull(NodeUtil.getStringNumberValue("infinity"));
    assertNull(NodeUtil.getStringNumberValue("-infinity"));
    assertNull(NodeUtil.getStringNumberValue("+infinity"));
  }

  @Test
  public void testGetStringNumberValue_normalAndInvalid() {
    assertEquals(Double.valueOf(3.5), NodeUtil.getStringNumberValue("3.5"));
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("abc"));
  }

  // ==================== trimJsWhiteSpace / isStrWhiteSpaceChar ====================

  @Test
  public void testTrimJsWhiteSpace() {
    assertEquals("abc", NodeUtil.trimJsWhiteSpace("  abc  "));
    assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
    assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc"));
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertTrue(NodeUtil.isStrWhiteSpaceChar(' '));
    assertTrue(NodeUtil.isStrWhiteSpaceChar('\n'));
    assertTrue(NodeUtil.isStrWhiteSpaceChar('\u00A0'));
    assertFalse(NodeUtil.isStrWhiteSpaceChar('a'));
  }

  // ==================== isImmutableValue ====================

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(str("a")));
    assertTrue(NodeUtil.isImmutableValue(num(1)));
    assertTrue(NodeUtil.isImmutableValue(nullNode()));
    assertTrue(NodeUtil.isImmutableValue(bool(true)));
    assertTrue(NodeUtil.isImmutableValue(bool(false)));
    assertTrue(NodeUtil.isImmutableValue(newNode(Token.NOT, bool(true))));
    assertTrue(NodeUtil.isImmutableValue(newNode(Token.VOID, num(0))));
    assertTrue(NodeUtil.isImmutableValue(newNode(Token.NEG, num(1))));
    assertTrue(NodeUtil.isImmutableValue(name("undefined")));
    assertTrue(NodeUtil.isImmutableValue(name("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(name("NaN")));
    assertFalse(NodeUtil.isImmutableValue(name("x")));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.THIS)));
  }

  // ==================== isValidDefineValue ====================

  @Test
  public void testIsValidDefineValue_literals() {
    Set<String> defines = new HashSet<String>();
    assertTrue(NodeUtil.isValidDefineValue(str("a"), defines));
    assertTrue(NodeUtil.isValidDefineValue(num(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(bool(true), defines));
    assertTrue(NodeUtil.isValidDefineValue(bool(false), defines));
  }

  @Test
  public void testIsValidDefineValue_binaryOperator() {
    Set<String> defines = new HashSet<String>();
    Node add = newNode(Token.ADD, num(1), num(2));
    assertTrue(NodeUtil.isValidDefineValue(add, defines));

    Node addInvalid = newNode(Token.ADD, num(1), name("x"));
    assertFalse(NodeUtil.isValidDefineValue(addInvalid, defines));
  }

  @Test
  public void testIsValidDefineValue_unaryOperator() {
    Set<String> defines = new HashSet<String>();
    Node not = newNode(Token.NOT, bool(true));
    assertTrue(NodeUtil.isValidDefineValue(not, defines));
  }

  @Test
  public void testIsValidDefineValue_nameAndGetProp() {
    Set<String> defines = new HashSet<String>();
    defines.add("FOO");
    assertTrue(NodeUtil.isValidDefineValue(name("FOO"), defines));
    assertFalse(NodeUtil.isValidDefineValue(name("BAR"), defines));
  }

  @Test
  public void testIsValidDefineValue_default() {
    Set<String> defines = new HashSet<String>();
    assertFalse(NodeUtil.isValidDefineValue(new Node(Token.THIS), defines));
  }

  // ==================== isEmptyBlock ====================

  @Test
  public void testIsEmptyBlock() {
    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.THIS)));
    assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK)));

    Node blockWithEmpty = newNode(Token.BLOCK, new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

    Node blockWithStmt = newNode(Token.BLOCK, new Node(Token.EXPR_RESULT));
    assertFalse(NodeUtil.isEmptyBlock(blockWithStmt));
  }

  // ==================== isSimpleOperator ====================

  @Test
  public void testIsSimpleOperator() {
    Node add = newNode(Token.ADD, num(1), num(2));
    assertTrue(NodeUtil.isSimpleOperator(add));

    Node call = newNode(Token.CALL, name("foo"));
    assertFalse(NodeUtil.isSimpleOperator(call));
  }

  // ==================== precedence ====================

  @Test
  public void testPrecedence() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_unknown() {
    NodeUtil.precedence(Token.SCRIPT); // ไม่อยู่ใน switch -> throw Error
  }

  // ==================== isNumericResult / isBooleanResult / mayBeString ====================

  @Test
  public void testIsNumericResult() {
    assertTrue(NodeUtil.isNumericResult(num(1)));
    assertTrue(NodeUtil.isNumericResult(newNode(Token.MUL, num(1), num(2))));
    assertFalse(NodeUtil.isNumericResult(str("a")));
  }

  @Test
  public void testIsBooleanResult() {
    assertTrue(NodeUtil.isBooleanResult(bool(true)));
    assertTrue(NodeUtil.isBooleanResult(newNode(Token.EQ, num(1), num(2))));
    assertFalse(NodeUtil.isBooleanResult(num(1)));
  }

  @Test
  public void testMayBeString() {
    assertTrue(NodeUtil.mayBeString(str("a")));
    assertFalse(NodeUtil.mayBeString(num(1)));
    assertFalse(NodeUtil.mayBeString(bool(true)));
    assertFalse(NodeUtil.mayBeString(nullNode()));
    assertFalse(NodeUtil.mayBeString(newNode(Token.VOID, num(0))));
  }

  // ==================== isUndefined / isNull / isNullOrUndefined ====================

  @Test
  public void testIsUndefinedNullNullOrUndefined() {
    assertTrue(NodeUtil.isUndefined(newNode(Token.VOID, num(0))));
    assertTrue(NodeUtil.isUndefined(name("undefined")));
    assertFalse(NodeUtil.isUndefined(name("x")));

    assertTrue(NodeUtil.isNull(nullNode()));
    assertFalse(NodeUtil.isNull(bool(true)));

    assertTrue(NodeUtil.isNullOrUndefined(nullNode()));
    assertTrue(NodeUtil.isNullOrUndefined(name("undefined")));
    assertFalse(NodeUtil.isNullOrUndefined(bool(true)));
  }

  // ==================== isAssociative / isCommutative ====================

  @Test
  public void testIsAssociativeCommutative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));

    assertTrue(NodeUtil.isCommutative(Token.MUL));
    assertFalse(NodeUtil.isCommutative(Token.ADD));
  }

  // ==================== isAssignmentOp / getOpFromAssignmentOp ====================

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(newNode(Token.ASSIGN, name("a"), num(1))));
    assertTrue(NodeUtil.isAssignmentOp(newNode(Token.ASSIGN_ADD, name("a"), num(1))));
    assertFalse(NodeUtil.isAssignmentOp(newNode(Token.ADD, num(1), num(2))));
  }

  @Test
  public void testGetOpFromAssignmentOp() {
    assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(
        newNode(Token.ASSIGN_BITOR, name("a"), num(1))));
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(
        newNode(Token.ASSIGN_ADD, name("a"), num(1))));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_invalid() {
    NodeUtil.getOpFromAssignmentOp(newNode(Token.ADD, num(1), num(2)));
  }

  // ==================== isExpressionNode ====================

  @Test
  public void testIsExpressionNode() {
    assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    assertFalse(NodeUtil.isExpressionNode(new Node(Token.BLOCK)));
  }

  // ==================== isGet / isGetProp / isName / isNew / isVar ====================

  @Test
  public void testSimpleTypeCheckers() {
    Node getProp = newNode(Token.GETPROP, name("a"), str("b"));
    assertTrue(NodeUtil.isGet(getProp));
    assertTrue(NodeUtil.isGetProp(getProp));

    Node getElem = newNode(Token.GETELEM, name("a"), str("b"));
    assertTrue(NodeUtil.isGet(getElem));
    assertFalse(NodeUtil.isGetProp(getElem));

    assertTrue(NodeUtil.isName(name("a")));
    assertFalse(NodeUtil.isName(num(1)));

    Node newN = newNode(Token.NEW, name("Foo"));
    assertTrue(NodeUtil.isNew(newN));

    assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
  }

  // ==================== isVarDeclaration ====================

  @Test
  public void testIsVarDeclaration() {
    Node varNode = new Node(Token.VAR);
    Node n = name("a");
    varNode.addChildToBack(n);
    assertTrue(NodeUtil.isVarDeclaration(n));

    Node other = name("b");
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(other);
    assertFalse(NodeUtil.isVarDeclaration(other));
  }

  // ==================== isString ====================

  @Test
  public void testIsString() {
    assertTrue(NodeUtil.isString(str("a")));
    assertFalse(NodeUtil.isString(num(1)));
  }

  // ==================== isExprAssign / isAssign / isExprCall ====================

  @Test
  public void testIsExprAssignAssignExprCall() {
    Node assign = newNode(Token.ASSIGN, name("a"), num(1));
    Node exprAssign = newNode(Token.EXPR_RESULT, assign);
    assertTrue(NodeUtil.isExprAssign(exprAssign));
    assertTrue(NodeUtil.isAssign(assign));

    Node call = newNode(Token.CALL, name("foo"));
    Node exprCall = newNode(Token.EXPR_RESULT, call);
    assertTrue(NodeUtil.isExprCall(exprCall));

    assertFalse(NodeUtil.isExprAssign(exprCall));
  }

  // ==================== isForIn ====================

  @Test
  public void testIsForIn() {
    Node forIn = newNode(Token.FOR, name("x"), name("obj"), new Node(Token.BLOCK));
    assertTrue(NodeUtil.isForIn(forIn));

    Node forNormal = newNode(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY),
        new Node(Token.EMPTY), new Node(Token.BLOCK));
    assertFalse(NodeUtil.isForIn(forNormal));
  }

  // ==================== isLoopStructure / getLoopCodeBlock ====================

  @Test
  public void testIsLoopStructureAndGetLoopCodeBlock() {
    Node block = new Node(Token.BLOCK);
    Node forNode = newNode(Token.FOR, new Node(Token.EMPTY), new Node(Token.EMPTY),
        new Node(Token.EMPTY), block);
    assertTrue(NodeUtil.isLoopStructure(forNode));
    assertSame(block, NodeUtil.getLoopCodeBlock(forNode));

    Node doBlock = new Node(Token.BLOCK);
    Node doNode = newNode(Token.DO, doBlock, bool(true));
    assertTrue(NodeUtil.isLoopStructure(doNode));
    assertSame(doBlock, NodeUtil.getLoopCodeBlock(doNode));

    Node other = new Node(Token.IF);
    assertFalse(NodeUtil.isLoopStructure(other));
    assertNull(NodeUtil.getLoopCodeBlock(other));
  }

  // ==================== isControlStructure ====================

  @Test
  public void testIsControlStructure() {
    assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.SWITCH)));
    assertFalse(NodeUtil.isControlStructure(new Node(Token.BLOCK)));
  }

  // ==================== getConditionExpression ====================

  @Test
  public void testGetConditionExpression() {
    Node cond = bool(true);
    Node ifNode = newNode(Token.IF, cond, new Node(Token.BLOCK));
    assertSame(cond, NodeUtil.getConditionExpression(ifNode));

    Node whileCond = bool(true);
    Node whileNode = newNode(Token.WHILE, whileCond, new Node(Token.BLOCK));
    assertSame(whileCond, NodeUtil.getConditionExpression(whileNode));

    Node doCond = bool(true);
    Node doNode = newNode(Token.DO, new Node(Token.BLOCK), doCond);
    assertSame(doCond, NodeUtil.getConditionExpression(doNode));

    Node forIn = newNode(Token.FOR, name("x"), name("obj"), new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(forIn));

    Node forCond = bool(true);
    Node forNode = newNode(Token.FOR, new Node(Token.EMPTY), forCond,
        new Node(Token.EMPTY), new Node(Token.BLOCK));
    assertSame(forCond, NodeUtil.getConditionExpression(forNode));

    assertNull(NodeUtil.getConditionExpression(new Node(Token.CASE)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_invalid() {
    NodeUtil.getConditionExpression(new Node(Token.BLOCK));
  }

  // ==================== isStatementBlock ====================

  @Test
  public void testIsStatementBlock() {
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(new Node(Token.IF)));
  }

  // ==================== isStatement ====================

  @Test
  public void testIsStatement() {
    Node block = new Node(Token.BLOCK);
    Node stmt = new Node(Token.EXPR_RESULT);
    block.addChildToBack(stmt);
    assertTrue(NodeUtil.isStatement(stmt));

    Node ifNode = new Node(Token.IF);
    Node cond = bool(true);
    ifNode.addChildToBack(cond);
    assertFalse(NodeUtil.isStatement(cond));
  }

  // ==================== isSwitchCase ====================

  @Test
  public void testIsSwitchCase() {
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    assertFalse(NodeUtil.isSwitchCase(new Node(Token.BLOCK)));
  }

  // ==================== isReferenceName ====================

  @Test
  public void testIsReferenceName() {
    assertTrue(NodeUtil.isReferenceName(name("a")));
    assertFalse(NodeUtil.isReferenceName(name("")));
    assertFalse(NodeUtil.isReferenceName(num(1)));
  }

  // ==================== isLhs ====================

  @Test
  public void testIsLhs() {
    Node lhsName = name("a");
    Node rhs = num(1);
    Node assign = newNode(Token.ASSIGN, lhsName, rhs);
    assertTrue(NodeUtil.isLhs(lhsName, assign));
    assertFalse(NodeUtil.isLhs(rhs, assign));

    Node varNode = new Node(Token.VAR);
    Node nameInVar = name("b");
    varNode.addChildToBack(nameInVar);
    assertTrue(NodeUtil.isLhs(nameInVar, varNode));
  }

  // ==================== isObjectLitKey / getObjectLitKeyName ====================

  @Test
  public void testIsObjectLitKeyAndGetName() {
    Node objLit = new Node(Token.OBJECTLIT);
    Node key = str("foo");
    objLit.addChildToBack(key);
    assertTrue(NodeUtil.isObjectLitKey(key, objLit));
    assertEquals("foo", NodeUtil.getObjectLitKeyName(key));

    Node getKey = new Node(Token.GET);
    assertTrue(NodeUtil.isObjectLitKey(getKey, objLit));

    assertFalse(NodeUtil.isObjectLitKey(num(1), new Node(Token.BLOCK)));
  }

  // ==================== opToStr / opToStrNoFail ====================

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
  public void testOpToStrNoFail_fail() {
    NodeUtil.opToStrNoFail(Token.BLOCK);
  }

  // ==================== isValidPropertyName / isLatin ====================

  @Test
  public void testIsLatin() {
    assertTrue(NodeUtil.isLatin("abc"));
    assertFalse(NodeUtil.isLatin("caf\u00e9"));
  }

  @Test
  public void testIsValidPropertyName() {
    assertTrue(NodeUtil.isValidPropertyName("foo"));
    assertFalse(NodeUtil.isValidPropertyName("123abc"));
    assertFalse(NodeUtil.isValidPropertyName("var"));
  }

  // ==================== newExpr ====================

  @Test
  public void testNewExpr() {
    Node call = newNode(Token.CALL, name("foo"));
    Node expr = NodeUtil.newExpr(call);
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertSame(call, expr.getFirstChild());
  }

  // ==================== isFunction / isThis / isArrayLiteral / isSparseArray ====================

  @Test
  public void testIsFunctionIsThisIsArrayLiteral() {
    Node fn = new Node(Token.FUNCTION);
    assertTrue(NodeUtil.isFunction(fn));
    assertFalse(NodeUtil.isFunction(new Node(Token.BLOCK)));

    assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    assertFalse(NodeUtil.isThis(new Node(Token.BLOCK)));

    assertTrue(NodeUtil.isArrayLiteral(new Node(Token.ARRAYLIT)));
  }

  @Test
  public void testIsSparseArray() {
    Node arr = new Node(Token.ARRAYLIT);
    assertFalse(NodeUtil.isSparseArray(arr));

    arr.putProp(Node.SKIP_INDEXES_PROP, new int[]{0, 2});
    assertTrue(NodeUtil.isSparseArray(arr));
  }

  // ==================== isCall / isCallOrNew ====================

  @Test
  public void testIsCallIsCallOrNew() {
    Node call = newNode(Token.CALL, name("foo"));
    assertTrue(NodeUtil.isCall(call));
    assertTrue(NodeUtil.isCallOrNew(call));

    Node newN = newNode(Token.NEW, name("Foo"));
    assertTrue(NodeUtil.isCallOrNew(newN));

    assertFalse(NodeUtil.isCallOrNew(new Node(Token.BLOCK)));
  }

  // ==================== mayHaveSideEffects / mayEffectMutableState ====================

  @Test
  public void testMayHaveSideEffects_simpleCases() {
    assertFalse(NodeUtil.mayHaveSideEffects(num(1)));
    assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW)));
  }

  @Test
  public void testMayHaveSideEffects_nameWithWithoutChild() {
    Node nameWithChild = name("a");
    nameWithChild.addChildToBack(num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));

    Node nameNoChild = name("a");
    assertFalse(NodeUtil.mayHaveSideEffects(nameNoChild));
  }

  @Test
  public void testMayHaveSideEffects_newConstructorWithWithoutSideEffects() {
    Node newArray = newNode(Token.NEW, name("Array"));
    assertFalse(NodeUtil.mayHaveSideEffects(newArray));

    Node newUnknown = newNode(Token.NEW, name("Foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(newUnknown));
  }

  @Test
  public void testMayHaveSideEffects_callBuiltinVsUnknown() {
    Node callObj = newNode(Token.CALL, name("Object"));
    assertFalse(NodeUtil.mayHaveSideEffects(callObj));

    Node callUnknown = newNode(Token.CALL, name("foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(callUnknown));
  }

  @Test
  public void testMayHaveSideEffects_assignToName() {
    Node assign = newNode(Token.ASSIGN, name("a"), num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayEffectMutableState_objectLiteral() {
    Node objLit = new Node(Token.OBJECTLIT);
    assertTrue(NodeUtil.mayEffectMutableState(objLit));
    assertFalse(NodeUtil.mayHaveSideEffects(objLit));
  }

  // ==================== constructorCallHasSideEffects ====================

  @Test
  public void testConstructorCallHasSideEffects() {
    Node newArray = newNode(Token.NEW, name("Array"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(newArray));

    Node newFoo = newNode(Token.NEW, name("Foo"));
    assertTrue(NodeUtil.constructorCallHasSideEffects(newFoo));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_wrongType() {
    NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
  }

  // ==================== functionCallHasSideEffects ====================

  @Test
  public void testFunctionCallHasSideEffects_builtin() {
    Node call = newNode(Token.CALL, name("Object"));
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_unknown() {
    Node call = newNode(Token.CALL, name("foo"));
    assertTrue(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_mathNamespace() {
    Node getProp = newNode(Token.GETPROP, name("Math"), str("random"));
    Node call = newNode(Token.CALL, getProp);
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_wrongType() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
  }

  // ==================== nodeTypeMayHaveSideEffects ====================

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(
        newNode(Token.ASSIGN, name("a"), num(1))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));

    Node nameWithChild = name("a");
    nameWithChild.addChildToBack(num(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(name("a")));

    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.BLOCK)));
  }

  // ==================== canBeSideEffected ====================

  @Test
  public void testCanBeSideEffected() {
    assertTrue(NodeUtil.canBeSideEffected(newNode(Token.CALL, name("foo"))));

    Node constName = name("a");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(constName));

    assertTrue(NodeUtil.canBeSideEffected(name("a")));

    assertTrue(NodeUtil.canBeSideEffected(newNode(Token.GETPROP, name("a"), str("b"))));
  }

  // ==================== isFunctionDeclaration / isFunctionExpression ====================

  @Test
  public void testIsFunctionDeclarationVsExpression() {
    Node fn = new Node(Token.FUNCTION);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(fn);
    assertTrue(NodeUtil.isFunctionDeclaration(fn));
    assertFalse(NodeUtil.isFunctionExpression(fn));

    Node fnExpr = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(name("a"));
    assign.addChildToBack(fnExpr);
    assertFalse(NodeUtil.isFunctionDeclaration(fnExpr));
    assertTrue(NodeUtil.isFunctionExpression(fnExpr));
  }

  // ==================== isEmptyFunctionExpression ====================

  @Test
  public void testIsEmptyFunctionExpression() {
    Node fnExpr = new Node(Token.FUNCTION);
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(name("a"));
    Node emptyBlock = new Node(Token.BLOCK);
    fnExpr.addChildToBack(name(""));
    fnExpr.addChildToBack(new Node(Token.LP));
    fnExpr.addChildToBack(emptyBlock);
    assign.addChildToBack(fnExpr);
    assertTrue(NodeUtil.isEmptyFunctionExpression(fnExpr));
  }

  // ==================== getFunctionBody / getFnParameters ====================

  @Test
  public void testGetFunctionBodyAndParameters() {
    Node fn = new Node(Token.FUNCTION);
    Node fnName = name("f");
    Node params = new Node(Token.LP);
    Node body = new Node(Token.BLOCK);
    fn.addChildToBack(fnName);
    fn.addChildToBack(params);
    fn.addChildToBack(body);
    assertSame(body, NodeUtil.getFunctionBody(fn));
    assertSame(params, NodeUtil.getFnParameters(fn));
  }

  // ==================== getFunctionName ====================

  @Test
  public void testGetFunctionName_varAssignment() {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToBack(name(""));
    fn.addChildToBack(new Node(Token.LP));
    fn.addChildToBack(new Node(Token.BLOCK));

    Node varNode = new Node(Token.VAR);
    Node nameNode = name("myFunc");
    varNode.addChildToBack(nameNode);
    nameNode.addChildToBack(fn);

    assertEquals("myFunc", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_assignQualified() {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToBack(name(""));
    fn.addChildToBack(new Node(Token.LP));
    fn.addChildToBack(new Node(Token.BLOCK));

    Node assign = new Node(Token.ASSIGN);
    Node getProp = newNode(Token.GETPROP, name("obj"), str("method"));
    assign.addChildToBack(getProp);
    assign.addChildToBack(fn);

    assertEquals("obj.method", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_declared() {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToBack(name("declaredName"));
    fn.addChildToBack(new Node(Token.LP));
    fn.addChildToBack(new Node(Token.BLOCK));

    Node block = new Node(Token.BLOCK);
    block.addChildToBack(fn);

    assertEquals("declaredName", NodeUtil.getFunctionName(fn));
  }

  // ==================== isHoistedFunctionDeclaration ====================

  @Test
  public void testIsHoistedFunctionDeclaration() {
    Node script = new Node(Token.SCRIPT);
    Node fn = new Node(Token.FUNCTION);
    script.addChildToBack(fn);
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));

    // ต้องมี parent ของ block ด้วย เพื่อไม่ให้เกิด NPE ใน
    // n.getParent().getParent().getType() ตาม logic ของเมธอดเป้าหมาย
    Node outer = new Node(Token.BLOCK);
    Node block = new Node(Token.BLOCK);
    outer.addChildToBack(block);
    Node fn2 = new Node(Token.FUNCTION);
    block.addChildToBack(fn2);
    assertFalse(NodeUtil.isHoistedFunctionDeclaration(fn2));
  }

  // ==================== isObjectCallMethod / isFunctionObjectCall / Apply ====================

  @Test
  public void testIsObjectCallMethodAndApplyCall() {
    Node getProp = newNode(Token.GETPROP, name("x"), str("call"));
    Node call = newNode(Token.CALL, getProp);
    assertTrue(NodeUtil.isObjectCallMethod(call, "call"));
    assertTrue(NodeUtil.isFunctionObjectCall(call));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(call));
    assertFalse(NodeUtil.isFunctionObjectApply(call));

    Node getPropApply = newNode(Token.GETPROP, name("x"), str("apply"));
    Node callApply = newNode(Token.CALL, getPropApply);
    assertTrue(NodeUtil.isFunctionObjectApply(callApply));

    assertFalse(NodeUtil.isObjectCallMethod(new Node(Token.CALL), "call"));
  }

  @Test
  public void testIsSimpleFunctionObjectCall() {
    Node getProp = newNode(Token.GETPROP, name("x"), str("call"));
    Node call = newNode(Token.CALL, getProp);
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));

    Node getPropNonName = newNode(Token.GETPROP,
        newNode(Token.GETPROP, name("a"), str("b")), str("call"));
    Node call2 = newNode(Token.CALL, getPropNonName);
    assertFalse(NodeUtil.isSimpleFunctionObjectCall(call2));
  }

  // ==================== getAssignedValue ====================

  @Test
  public void testGetAssignedValue() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = name("a");
    Node value = num(1);
    varNode.addChildToBack(nameNode);
    nameNode.addChildToBack(value);
    assertSame(value, NodeUtil.getAssignedValue(nameNode));

    Node assign = new Node(Token.ASSIGN);
    Node lhsName = name("b");
    Node rhsVal = num(2);
    assign.addChildToBack(lhsName);
    assign.addChildToBack(rhsVal);
    assertSame(rhsVal, NodeUtil.getAssignedValue(lhsName));

    Node block = new Node(Token.BLOCK);
    Node freeName = name("c");
    block.addChildToBack(freeName);
    assertNull(NodeUtil.getAssignedValue(freeName));
  }

  // ==================== getPrototypeClassName / getPrototypePropertyName / isPrototypeProperty ====================

  @Test
  public void testPrototypeHelpers() {
    // Foo.prototype.bar  (สมมติฐาน: Node.getQualifiedName() ทำงานตามมาตรฐานของ Closure)
    Node fooProtoBar = newNode(Token.GETPROP,
        newNode(Token.GETPROP, name("Foo"), str("prototype")),
        str("bar"));
    assertTrue(NodeUtil.isPrototypeProperty(fooProtoBar));
    Node className = NodeUtil.getPrototypeClassName(fooProtoBar);
    assertNotNull(className);
    assertEquals("Foo", className.getString());
    assertEquals("bar", NodeUtil.getPrototypePropertyName(fooProtoBar));

    assertFalse(NodeUtil.isPrototypeProperty(name("x")));
  }

  // ==================== hasFinally / getCatchBlock / hasCatchHandler ====================

  @Test
  public void testTryFinallyCatchHelpers() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchContainer = new Node(Token.BLOCK);
    Node finallyBlock = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY);
    tryNode.addChildToBack(tryBlock);
    tryNode.addChildToBack(catchContainer);
    tryNode.addChildToBack(finallyBlock);

    assertTrue(NodeUtil.hasFinally(tryNode));
    assertSame(catchContainer, NodeUtil.getCatchBlock(tryNode));
    assertFalse(NodeUtil.hasCatchHandler(catchContainer));

    Node catchNode = new Node(Token.CATCH);
    catchContainer.addChildToBack(catchNode);
    assertTrue(NodeUtil.hasCatchHandler(catchContainer));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testHasFinally_wrongType() {
    NodeUtil.hasFinally(new Node(Token.BLOCK));
  }
}
```

## ตารางสรุป (Test Method → Branch/Condition ที่ครอบคลุม)

| กลุ่มเมธอดเป้าหมาย | Test method(s) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `getBooleanValue` | `testGetBooleanValue_*` (7) | STRING len>0/0, NUMBER≠0/=0, NOT, NULL/FALSE/VOID, NAME(undefined/NaN/Infinity/other), TRUE/ARRAYLIT/OBJECTLIT/REGEXP, default UNKNOWN |
| `getExpressionBooleanValue` | `testGetExpressionBooleanValue_*` (5) | ASSIGN/COMMA, NOT, AND, OR, HOOK(equal/ไม่เท่ากัน), default |
| `getStringValue` | `testGetStringValue_*` (6) | STRING, NAME(special/other→null), NUMBER(int/decimal), FALSE/TRUE/NULL, VOID, NOT(known/unknown), ARRAYLIT/OBJECTLIT/default null |
| `getArrayElementStringValue`/`arrayToString` | `testGetArrayElementStringValue_*`, `testArrayToString_*` (4) | null/undefined→"", simple array, unconvertible child→null, skip-index while-loop |
| `getNumberValue` | `testGetNumberValue_*` (9) | TRUE/FALSE/NULL, NUMBER, VOID(มี/ไม่มี side effect), NAME variants, NEG(Infinity/other), NOT(known/unknown), STRING, ARRAYLIT/OBJECTLIT, default null |
| `getStringNumberValue` | `testGetStringNumberValue_*` (6) | empty, hex valid/invalid, signed-hex→null, infinity variants→null, normal parse, NaN |
| `trimJsWhiteSpace`/`isStrWhiteSpaceChar` | `testTrimJsWhiteSpace`, `testIsStrWhiteSpaceChar` | leading/trailing/all-blank, whitespace char true/false |
| `isImmutableValue` | `testIsImmutableValue` | STRING/NUMBER/NULL/TRUE/FALSE, NOT, VOID/NEG, NAME variants, default false |
| `isValidDefineValue` | `testIsValidDefineValue_*` (5) | literal true, binary op(valid/invalid), unary op, NAME/GETPROP(qualified+defines), default false |
| `isEmptyBlock` | `testIsEmptyBlock` | non-BLOCK, empty BLOCK, BLOCK w/ EMPTY, BLOCK w/ statement |
| `isSimpleOperator(Type)` | `testIsSimpleOperator` | true case, false(default) |
| `precedence` | `testPrecedence`, `testPrecedence_unknown` | ค่าคงที่หลายค่า, throw Error กรณีไม่พบ |
| `isNumericResult`/`isBooleanResult`/`mayBeString` | `testIsNumericResult`, `testIsBooleanResult`, `testMayBeString` | valueCheck default apply, helper true/false หลายเงื่อนไข |
| `isUndefined/isNull/isNullOrUndefined` | `testIsUndefinedNullNullOrUndefined` | VOID/NAME=="undefined", NULL, OR combination |
| `isAssociative/isCommutative` | `testIsAssociativeCommutative` | true/false cases |
| `isAssignmentOp/getOpFromAssignmentOp` | `testIsAssignmentOp`, `testGetOpFromAssignmentOp*` | true/false, mapping หลายชนิด, throw IllegalArgumentException |
| Type predicates (`isGet/isName/isNew/isVar/...`) | `testSimpleTypeCheckers`, `testIsVarDeclaration`, `testIsString`, `testIsExprAssign...` | true/false ของแต่ละ predicate |
| `isForIn`/`isLoopStructure`/`getLoopCodeBlock` | `testIsForIn`, `testIsLoopStructureAndGetLoopCodeBlock` | 3 vs 4 children, FOR/DO/WHILE/other |
| `isControlStructure`/`getConditionExpression` | `testIsControlStructure`, `testGetConditionExpression*` | IF/WHILE/DO/FOR(3/4 children)/CASE, throw IllegalArgumentException |
| `isStatementBlock/isStatement/isSwitchCase/isReferenceName` | ตามชื่อ | true/false ทุก branch หลัก |
| `isLhs/isObjectLitKey/getObjectLitKeyName` | `testIsLhs`, `testIsObjectLitKeyAndGetName` | ASSIGN-lhs/VAR, NUMBER/STRING/GET/SET keys |
| `opToStr/opToStrNoFail` | `testOpToStr*` | known op, null case, throw Error |
| `isLatin/isValidPropertyName` | `testIsLatin`, `testIsValidPropertyName` | ASCII/non-ASCII, keyword/invalid identifier |
| `mayHaveSideEffects`/`mayEffectMutableState`/`checkForStateChangeHelper` | `testMayHaveSideEffects_*`, `testMayEffectMutableState_*` | NUMBER/THROW/NAME(มี/ไม่มี child)/NEW(exempt/ไม่exempt)/CALL(builtin/unknown)/ASSIGN-to-name/OBJECTLIT |
| `constructorCallHasSideEffects`/`functionCallHasSideEffects` | ตามชื่อ | exempt list, Math namespace, throw IllegalStateException |
| `nodeTypeMayHaveSideEffects` | `testNodeTypeMayHaveSideEffects` | isAssignmentOp, DELPROP/THROW, NAME(hasChildren), default false |
| `canBeSideEffected` | `testCanBeSideEffected` | CALL/NEW true, NAME(constant/ไม่constant), GETPROP true |
| `isFunctionDeclaration/isFunctionExpression/isEmptyFunctionExpression/isHoistedFunctionDeclaration` | ตามชื่อ | statement-context vs expression-context, hoisted vs not |
| `getFunctionBody/getFnParameters/getFunctionName` | ตามชื่อ | NAME-parent/ASSIGN-parent/default(ชื่อจาก FUNCTION เอง) |
| `isObjectCallMethod/isFunctionObjectCall/Apply/isSimpleFunctionObjectCall` | ตามชื่อ | call/apply matching, NAME vs non-NAME receiver |
| `getAssignedValue` | `testGetAssignedValue` | VAR-child, ASSIGN-lhs, neither→null |
| `getPrototypeClassName/getPrototypePropertyName/isPrototypeProperty` | `testPrototypeHelpers` | มี/ไม่มี ".prototype." ในชื่อ qualified |
| `hasFinally/getCatchBlock/hasCatchHandler` | `testTryFinallyCatchHelpers`, `testHasFinally_wrongType` | 3-children TRY, BLOCK มี/ไม่มี CATCH, throw IllegalArgumentException |

**ข้อจำกัดที่ควรทราบ:** เนื่องจากไม่มีซอร์สของ `Node`, `Token`, `TernaryValue`, `CodingConvention`, `AbstractCompiler` ให้ตรวจสอบจริง การประกอบ Node ในเทสอ้างอิงจาก pattern ที่ปรากฏใน `NodeUtil` เองทั้งหมด (เช่น `new Node(type)`, `addChildToBack`, `Node.newString/newNumber`) เพื่อลดความเสี่ยงที่จะเดา API ผิด แต่หากเวอร์ชันจริงของ `Node`/`TokenStream` มีรายละเอียดต่างจากที่คาดไว้ (เช่น การ throw NPE เมื่อ parent เป็น null ในบางเมธอดที่ไม่ได้ตรวจสอบ) อาจต้องปรับ test เล็กน้อย