# NodeUtilTest (JUnit 4) — Defects4J Closure-10b

**หมายเหตุสำคัญก่อนเริ่ม:**
- `NodeUtil` เป็นคลาสภายใน package `com.google.javascript.jscomp` และหลาย method เป็น *package-private* (ไม่มี modifier) จึงต้องวางไฟล์ทดสอบไว้ใน package เดียวกัน
- ในการสร้าง AST (`Node`) สำหรับ fixture ผู้เขียนใช้ `com.google.javascript.rhino.IR` ซึ่งเป็น builder utility มาตรฐานของ Closure Compiler (ยืนยันได้จาก source ของ `NodeUtil` เองที่เรียกใช้ `IR.exprResult`, `IR.block()`, `IR.empty()`, `IR.name()`, `IR.var()`, `IR.string()`, `IR.getprop()`, `IR.voidNode()`, `IR.number()`, `IR.trueNode()`, `IR.falseNode()`, `IR.neg()`, `IR.call()`) ส่วน method อื่นของ `IR` (เช่น `and/or/not/hook/comma/assign/arraylit/objectlit/ifNode/forNode/whileNode/doNode/newNode/regexp/paramList/function` ฯลฯ) เป็นไปตาม**ธรรมเนียมมาตรฐาน**ของ Closure Compiler ที่ใช้ในชุดทดสอบจริงของโปรเจกต์ — หากในสภาพแวดล้อม build จริงมี signature ต่างไปเล็กน้อย ให้ปรับชื่อ/พารามิเตอร์ให้ตรงกับ `IR.java` ที่ใช้จริง (มีคอมเมนต์ `// ASSUMPTION` กำกับไว้ทุกจุดที่มีความเสี่ยง)
- เมธอดที่ต้องพึ่งพา `AbstractCompiler` แบบ mock ที่ซับซ้อน (เช่น `mayEffectMutableState` แบบเต็ม, `functionCallHasSideEffects` กรณี RegExp global reference), หรือ method ที่ต้องมี AST หลายชั้นซับซ้อนเกินไป (เช่น `getBestJSDocInfo`, `redeclareVarsInsideBranch`, `tryMergeBlock`, `removeChild`, `getObjectLitKeyTypeFromValueType`) ถูก**ข้าม**ไปตามคำสั่ง "ห้ามเดา behavior ที่ไม่มีอยู่ในซอร์ส" — มีคอมเมนต์กำกับไว้ในโค้ด

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Unit tests for {@link NodeUtil} (Defects4J Closure-10b).
 *
 * ดูหมายเหตุเรื่อง IR API assumption ที่ด้านบนของไฟล์นี้
 */
public class NodeUtilTest {

  // ---------------------------------------------------------------------
  // Helper builders
  // ---------------------------------------------------------------------
  private static Node num(double d) { return IR.number(d); }
  private static Node str(String s) { return IR.string(s); }
  private static Node name(String s) { return IR.name(s); }

  // =======================================================================
  // getPureBooleanValue
  // =======================================================================

  @Test
  public void testPureBoolean_string() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(str("a")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(str("")));
  }

  @Test
  public void testPureBoolean_number() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(num(1)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(num(0)));
  }

  @Test
  public void testPureBoolean_not() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.not(str("a"))));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.not(str(""))));
  }

  @Test
  public void testPureBoolean_nullFalseTrue() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.falseNode()));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.nullNode())); // ASSUMPTION: IR.nullNode()
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.trueNode()));
  }

  @Test
  public void testPureBoolean_voidNoSideEffect() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.voidNode(num(0))));
  }

  @Test
  public void testPureBoolean_voidWithSideEffect() {
    // void (unknownFunc()) -> child มี side effect -> ตกไป default -> UNKNOWN
    Node call = IR.call(name("unknownFunc"));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(IR.voidNode(call)));
  }

  @Test
  public void testPureBoolean_nameKeywords() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(name("undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(name("NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(name("Infinity")));
    // ชื่ออื่นที่ไม่รู้จัก -> UNKNOWN
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(name("x")));
  }

  @Test
  public void testPureBoolean_regexpAlwaysTrue() {
    Node regexp = IR.regexp(str("abc")); // ASSUMPTION: IR.regexp(Node)
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(regexp));
  }

  @Test
  public void testPureBoolean_arrayLitNoSideEffect() {
    Node arr = IR.arraylit(num(1), str("a")); // ASSUMPTION: IR.arraylit(Node...)
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(arr));
  }

  @Test
  public void testPureBoolean_arrayLitWithSideEffect() {
    Node arr = IR.arraylit(IR.call(name("unknownFunc")));
    // มี side effect -> break -> UNKNOWN
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(arr));
  }

  @Test
  public void testPureBoolean_objectLitNoSideEffect() {
    Node obj = IR.objectlit(); // ASSUMPTION: IR.objectlit(Node...)
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(obj));
  }

  @Test
  public void testPureBoolean_defaultUnknown() {
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(IR.thisNode())); // ASSUMPTION: IR.thisNode()
  }

  // =======================================================================
  // getImpureBooleanValue
  // =======================================================================

  @Test
  public void testImpureBoolean_assignComma() {
    Node assign = IR.assign(name("x"), str("a")); // ASSUMPTION: IR.assign
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assign));

    Node comma = IR.comma(str("a"), str("")); // ASSUMPTION: IR.comma
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(comma));
  }

  @Test
  public void testImpureBoolean_not() {
    Node not = IR.not(str("a"));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(not));
  }

  @Test
  public void testImpureBoolean_andOr() {
    Node andTrueTrue = IR.and(IR.trueNode(), IR.trueNode()); // ASSUMPTION: IR.and
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(andTrueTrue));

    Node andTrueFalse = IR.and(IR.trueNode(), IR.falseNode());
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(andTrueFalse));

    Node orFalseFalse = IR.or(IR.falseNode(), IR.falseNode()); // ASSUMPTION: IR.or
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(orFalseFalse));
  }

  @Test
  public void testImpureBoolean_hookSameAndDifferent() {
    Node hookSame = IR.hook(name("c"), IR.trueNode(), IR.trueNode()); // ASSUMPTION: IR.hook
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hookSame));

    Node hookDiff = IR.hook(name("c"), IR.trueNode(), IR.falseNode());
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hookDiff));
  }

  @Test
  public void testImpureBoolean_arrayObjectVoid() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.arraylit()));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.objectlit()));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.voidNode(num(0))));
  }

  // =======================================================================
  // getStringValue(Node) / getStringValue(double)
  // =======================================================================

  @Test
  public void testGetStringValue_string() {
    assertEquals("hello", NodeUtil.getStringValue(str("hello")));
  }

  @Test
  public void testGetStringValue_stringKey() {
    Node key = IR.stringKey("foo", num(1)); // ASSUMPTION: IR.stringKey(String,Node)
    assertEquals("foo", NodeUtil.getStringValue(key));
  }

  @Test
  public void testGetStringValue_nameKeywordsAndUnknown() {
    assertEquals("undefined", NodeUtil.getStringValue(name("undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(name("Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(name("NaN")));
    assertNull(NodeUtil.getStringValue(name("x"))); // ไม่รู้จัก -> break -> null
  }

  @Test
  public void testGetStringValue_number() {
    assertEquals("5", NodeUtil.getStringValue(num(5)));
    assertEquals("5.5", NodeUtil.getStringValue(num(5.5)));
  }

  @Test
  public void testGetStringValue_literals() {
    assertEquals("false", NodeUtil.getStringValue(IR.falseNode()));
    assertEquals("true", NodeUtil.getStringValue(IR.trueNode()));
    assertEquals("null", NodeUtil.getStringValue(IR.nullNode()));
    assertEquals("undefined", NodeUtil.getStringValue(IR.voidNode(num(0))));
  }

  @Test
  public void testGetStringValue_notKnownAndUnknown() {
    assertEquals("false", NodeUtil.getStringValue(IR.not(str("a")))); // pure true -> "false"
    assertEquals("true", NodeUtil.getStringValue(IR.not(str("")))); // pure false -> "true"
    assertNull(NodeUtil.getStringValue(IR.not(name("x")))); // UNKNOWN -> break -> null
  }

  @Test
  public void testGetStringValue_arrayLit() {
    Node arr = IR.arraylit(str("a"), num(1));
    assertEquals("a,1", NodeUtil.getStringValue(arr));
  }

  @Test
  public void testGetStringValue_arrayLitWithElisionAndUnconvertible() {
    // EMPTY element -> "" ; NAME ไม่รู้จัก -> ไม่สามารถแปลง -> ทั้งอาร์เรย์ได้ null
    Node arrElision = IR.arraylit(IR.empty(), num(2));
    assertEquals(",2", NodeUtil.getStringValue(arrElision));

    Node arrUnconvertible = IR.arraylit(name("x"));
    assertNull(NodeUtil.getStringValue(arrUnconvertible));
  }

  @Test
  public void testGetStringValue_objectLit() {
    assertEquals("[object Object]", NodeUtil.getStringValue(IR.objectlit()));
  }

  @Test
  public void testGetStringValue_default() {
    assertNull(NodeUtil.getStringValue(IR.thisNode()));
  }

  @Test
  public void testGetStringValueDouble() {
    assertEquals("5", NodeUtil.getStringValue(5.0));
    assertEquals("5.5", NodeUtil.getStringValue(5.5));
    assertEquals("-3", NodeUtil.getStringValue(-3.0));
  }

  // =======================================================================
  // getArrayElementStringValue / arrayToString
  // =======================================================================

  @Test
  public void testGetArrayElementStringValue() {
    assertEquals("", NodeUtil.getArrayElementStringValue(IR.nullNode()));
    assertEquals("", NodeUtil.getArrayElementStringValue(IR.voidNode(num(0))));
    assertEquals("", NodeUtil.getArrayElementStringValue(IR.empty()));
    assertEquals("a", NodeUtil.getArrayElementStringValue(str("a")));
  }

  // =======================================================================
  // getNumberValue
  // =======================================================================

  @Test
  public void testGetNumberValue_literals() {
    assertEquals(1.0, NodeUtil.getNumberValue(IR.trueNode()), 0.0);
    assertEquals(0.0, NodeUtil.getNumberValue(IR.falseNode()), 0.0);
    assertEquals(0.0, NodeUtil.getNumberValue(IR.nullNode()), 0.0);
    assertEquals(5.0, NodeUtil.getNumberValue(num(5)), 0.0);
  }

  @Test
  public void testGetNumberValue_void() {
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(IR.voidNode(num(0))));
    assertNull(NodeUtil.getNumberValue(IR.voidNode(IR.call(name("unknownFunc")))));
  }

  @Test
  public void testGetNumberValue_name() {
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(name("undefined")));
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getNumberValue(name("NaN")));
    assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(name("Infinity")), 0.0);
    assertNull(NodeUtil.getNumberValue(name("x")));
  }

  @Test
  public void testGetNumberValue_neg() {
    Node negInfinity = IR.neg(name("Infinity"));
    assertEquals(Double.NEGATIVE_INFINITY, NodeUtil.getNumberValue(negInfinity), 0.0);

    // NEG ของ literal number (ไม่ใช่ NAME) -> ไม่เข้าเงื่อนไข -> null (ข้อจำกัดของ implementation)
    Node negNumber = IR.neg(num(5));
    assertNull(NodeUtil.getNumberValue(negNumber));
  }

  @Test
  public void testGetNumberValue_not() {
    assertEquals(0.0, NodeUtil.getNumberValue(IR.not(str("a"))), 0.0);
    assertEquals(1.0, NodeUtil.getNumberValue(IR.not(str(""))), 0.0);
    assertNull(NodeUtil.getNumberValue(IR.not(name("x"))));
  }

  @Test
  public void testGetNumberValue_string() {
    assertEquals(123.0, NodeUtil.getNumberValue(str("123")), 0.0);
    assertEquals(0.0, NodeUtil.getNumberValue(str("")), 0.0);
  }

  @Test
  public void testGetNumberValue_arrayObjectLit() {
    assertEquals(1.0, NodeUtil.getNumberValue(IR.arraylit(num(1))), 0.0);
    assertNull(NodeUtil.getNumberValue(IR.arraylit(name("x"))));
  }

  @Test
  public void testGetNumberValue_default() {
    assertNull(NodeUtil.getNumberValue(IR.thisNode()));
  }

  // =======================================================================
  // getStringNumberValue
  // =======================================================================

  @Test
  public void testGetStringNumberValue_verticalTab() {
    assertNull(NodeUtil.getStringNumberValue("1\u000b2"));
  }

  @Test
  public void testGetStringNumberValue_empty() {
    assertEquals(0.0, NodeUtil.getStringNumberValue(""), 0.0);
    assertEquals(0.0, NodeUtil.getStringNumberValue("   "), 0.0);
  }

  @Test
  public void testGetStringNumberValue_hex() {
    assertEquals(26.0, NodeUtil.getStringNumberValue("0x1A"), 0.0);
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("0xZZ"));
  }

  @Test
  public void testGetStringNumberValue_signedHex() {
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
  public void testGetStringNumberValue_normalAndGarbage() {
    assertEquals(3.14, NodeUtil.getStringNumberValue("3.14"), 0.0);
    assertEquals(Double.valueOf(Double.NaN), NodeUtil.getStringNumberValue("abc"));
    assertEquals(5.0, NodeUtil.getStringNumberValue("  5  "), 0.0);
  }

  // =======================================================================
  // trimJsWhiteSpace / isStrWhiteSpaceChar
  // =======================================================================

  @Test
  public void testTrimJsWhiteSpace() {
    assertEquals("a b", NodeUtil.trimJsWhiteSpace(" a b "));
    assertEquals("abc", NodeUtil.trimJsWhiteSpace("abc"));
    assertEquals("", NodeUtil.trimJsWhiteSpace("   "));
  }

  @Test
  public void testIsStrWhiteSpaceChar() {
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
    // Character.SPACE_SEPARATOR ที่ไม่ได้ list ตรง ๆ -> default branch -> TRUE
    assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2003'));
  }

  // =======================================================================
  // getFunctionName / getNearestFunctionName
  // =======================================================================

  @Test
  public void testGetFunctionName_namePattern() {
    Node fn = IR.function(name(""), IR.paramList(), IR.block()); // ASSUMPTION: IR.function, IR.paramList
    Node varName = name("foo");
    varName.addChildToBack(fn);
    IR.var(varName);
    assertEquals("foo", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_assignPattern() {
    Node fn = IR.function(name(""), IR.paramList(), IR.block());
    Node lhs = IR.getprop(name("obj"), str("prop"));
    IR.assign(lhs, fn);
    assertEquals("obj.prop", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_defaultDeclaration() {
    Node fn = IR.function(name("bar"), IR.paramList(), IR.block());
    IR.exprResult(fn); // parent อื่นที่ไม่ใช่ NAME/ASSIGN
    assertEquals("bar", NodeUtil.getFunctionName(fn));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetFunctionName_notFunctionThrows() {
    NodeUtil.getFunctionName(name("x"));
  }

  @Test
  public void testGetNearestFunctionName_notFunction() {
    assertNull(NodeUtil.getNearestFunctionName(name("x")));
  }

  @Test
  public void testGetNearestFunctionName_stringKey() {
    Node fn = IR.function(name(""), IR.paramList(), IR.block());
    IR.stringKey("bar", fn);
    assertEquals("bar", NodeUtil.getNearestFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_fallThroughNull() {
    Node fn = IR.function(name(""), IR.paramList(), IR.block());
    IR.block().addChildToBack(fn); // parent BLOCK ไม่ตรง case ใด ๆ -> null
    assertNull(NodeUtil.getNearestFunctionName(fn));
  }

  // =======================================================================
  // isImmutableValue
  // =======================================================================

  @Test
  public void testIsImmutableValue() {
    assertTrue(NodeUtil.isImmutableValue(str("a")));
    assertTrue(NodeUtil.isImmutableValue(num(1)));
    assertTrue(NodeUtil.isImmutableValue(IR.nullNode()));
    assertTrue(NodeUtil.isImmutableValue(IR.trueNode()));
    assertTrue(NodeUtil.isImmutableValue(IR.not(str("a"))));
    assertTrue(NodeUtil.isImmutableValue(IR.voidNode(num(0))));
    assertTrue(NodeUtil.isImmutableValue(IR.neg(num(1))));
    assertTrue(NodeUtil.isImmutableValue(name("undefined")));
    assertTrue(NodeUtil.isImmutableValue(name("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(name("NaN")));
    assertFalse(NodeUtil.isImmutableValue(name("x")));
    assertFalse(NodeUtil.isImmutableValue(IR.thisNode()));
  }

  // =======================================================================
  // isSymmetricOperation / isRelationalOperation / getInverseOperator (int)
  // =======================================================================

  @Test
  public void testIsSymmetricOperation() {
    assertTrue(NodeUtil.isSymmetricOperation(IR.eq(str("a"), str("b")))); // ASSUMPTION: IR.eq
    assertTrue(NodeUtil.isSymmetricOperation(IR.mul(num(1), num(2))));   // ASSUMPTION: IR.mul
    assertFalse(NodeUtil.isSymmetricOperation(IR.getprop(name("a"), str("b"))));
  }

  @Test
  public void testIsRelationalOperation() {
    assertTrue(NodeUtil.isRelationalOperation(IR.lt(num(1), num(2)))); // ASSUMPTION: IR.lt
    assertFalse(NodeUtil.isRelationalOperation(IR.eq(num(1), num(2))));
  }

  @Test
  public void testGetInverseOperator() {
    assertEquals(Token.LT, NodeUtil.getInverseOperator(Token.GT));
    assertEquals(Token.GT, NodeUtil.getInverseOperator(Token.LT));
    assertEquals(Token.LE, NodeUtil.getInverseOperator(Token.GE));
    assertEquals(Token.GE, NodeUtil.getInverseOperator(Token.LE));
    assertEquals(Token.ERROR, NodeUtil.getInverseOperator(Token.ADD));
  }

  // =======================================================================
  // isLiteralValue
  // =======================================================================

  @Test
  public void testIsLiteralValue_arrayLit() {
    assertTrue(NodeUtil.isLiteralValue(IR.arraylit(num(1), IR.empty()), false));
    assertFalse(NodeUtil.isLiteralValue(IR.arraylit(name("x")), false));
  }

  @Test
  public void testIsLiteralValue_objectLit() {
    Node okKey = IR.stringKey("a", num(1));
    assertTrue(NodeUtil.isLiteralValue(IR.objectlit(okKey), false));

    Node badKey = IR.stringKey("a", name("x"));
    assertFalse(NodeUtil.isLiteralValue(IR.objectlit(badKey), false));
  }

  @Test
  public void testIsLiteralValue_functionIncludeFlag() {
    // function declaration ภายใต้ BLOCK ไม่ถือเป็น literal แม้ includeFunctions=true
    Node declFn = IR.function(name("f"), IR.paramList(), IR.block());
    IR.block().addChildToBack(declFn);
    assertFalse(NodeUtil.isLiteralValue(declFn, true));

    // function expression (ไม่ใช่ statement) + includeFunctions=true -> true
    Node exprFn = IR.function(name(""), IR.paramList(), IR.block());
    IR.exprResult(exprFn);
    assertTrue(NodeUtil.isLiteralValue(exprFn, true));
    assertFalse(NodeUtil.isLiteralValue(exprFn, false));
  }

  @Test
  public void testIsLiteralValue_default() {
    assertTrue(NodeUtil.isLiteralValue(str("a"), false));
    assertFalse(NodeUtil.isLiteralValue(name("x"), false));
  }

  // =======================================================================
  // isValidDefineValue
  // =======================================================================

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>();
    defines.add("FOO");

    assertTrue(NodeUtil.isValidDefineValue(str("a"), defines));
    assertTrue(NodeUtil.isValidDefineValue(num(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(IR.trueNode(), defines));

    Node add = IR.add(str("a"), num(1)); // ASSUMPTION: IR.add
    assertTrue(NodeUtil.isValidDefineValue(add, defines));

    Node addInvalid = IR.add(name("x"), num(1));
    assertFalse(NodeUtil.isValidDefineValue(addInvalid, defines));

    assertTrue(NodeUtil.isValidDefineValue(IR.not(str("a")), defines));

    assertTrue(NodeUtil.isValidDefineValue(name("FOO"), defines));
    assertFalse(NodeUtil.isValidDefineValue(name("BAR"), defines));

    assertFalse(NodeUtil.isValidDefineValue(IR.thisNode(), defines));
  }

  // =======================================================================
  // isEmptyBlock
  // =======================================================================

  @Test
  public void testIsEmptyBlock() {
    assertFalse(NodeUtil.isEmptyBlock(name("x")));
    assertTrue(NodeUtil.isEmptyBlock(IR.block()));

    Node blockWithEmpty = IR.block();
    blockWithEmpty.addChildToBack(IR.empty());
    assertTrue(NodeUtil.isEmptyBlock(blockWithEmpty));

    Node blockWithStmt = IR.block();
    blockWithStmt.addChildToBack(IR.exprResult(num(1)));
    assertFalse(NodeUtil.isEmptyBlock(blockWithStmt));
  }

  // =======================================================================
  // isSimpleOperatorType / isSimpleOperator
  // =======================================================================

  @Test
  public void testIsSimpleOperatorType() {
    assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.GETPROP));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.VOID));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.IF));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
  }

  @Test
  public void testIsSimpleOperator() {
    assertTrue(NodeUtil.isSimpleOperator(IR.getprop(name("a"), str("b"))));
    assertFalse(NodeUtil.isSimpleOperator(num(1)));
  }

  // =======================================================================
  // mayHaveSideEffects / checkForStateChangeHelper (ผ่าน mayHaveSideEffects)
  // =======================================================================

  @Test
  public void testMayHaveSideEffects_literalNoEffect() {
    assertFalse(NodeUtil.mayHaveSideEffects(num(5)));
  }

  @Test
  public void testMayHaveSideEffects_throw() {
    Node throwNode = IR.throwNode(num(1)); // ASSUMPTION: IR.throwNode
    assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
  }

  @Test
  public void testMayHaveSideEffects_nameWithAndWithoutChild() {
    Node n1 = name("x");
    n1.addChildToBack(num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(n1));

    assertFalse(NodeUtil.mayHaveSideEffects(name("y")));
  }

  @Test
  public void testMayHaveSideEffects_functionExpressionVsDeclaration() {
    Node exprFn = IR.function(name(""), IR.paramList(), IR.block());
    IR.exprResult(exprFn);
    assertFalse(NodeUtil.mayHaveSideEffects(exprFn));

    Node declFn = IR.function(name("f"), IR.paramList(), IR.block());
    IR.block().addChildToBack(declFn);
    assertTrue(NodeUtil.mayHaveSideEffects(declFn));
  }

  @Test
  public void testMayHaveSideEffects_new() {
    Node okNew = IR.newNode(name("Array")); // ASSUMPTION: IR.newNode
    assertFalse(NodeUtil.mayHaveSideEffects(okNew));

    Node badNew = IR.newNode(name("MyClass"));
    assertTrue(NodeUtil.mayHaveSideEffects(badNew));
  }

  @Test
  public void testMayHaveSideEffects_call() {
    Node okCall = IR.call(name("Object"));
    assertFalse(NodeUtil.mayHaveSideEffects(okCall));

    Node badCall = IR.call(name("unknownFunc"));
    assertTrue(NodeUtil.mayHaveSideEffects(badCall));
  }

  @Test
  public void testMayHaveSideEffects_assignToNameIsSideEffect() {
    Node assign = IR.assign(name("x"), num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_assignToLocalGetPropNoSideEffect() {
    // ({}).x = 5 -> root เป็น literal object -> ไม่ถือเป็น side effect
    Node target = IR.getprop(IR.objectlit(), str("x"));
    Node assign = IR.assign(target, num(5));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_assignToNonLocalGetPropIsSideEffect() {
    // obj.x = 5 -> root เป็น NAME ธรรมดา (ไม่ literal) -> ถือเป็น side effect
    Node target = IR.getprop(name("obj"), str("x"));
    Node assign = IR.assign(target, num(5));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_malformedAssignTarget() {
    // กรณี target ไม่ใช่ NAME/GET (malformed AST) -> ตกไป else-branch legacy
    Node assign = IR.assign(num(5), num(1));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  // =======================================================================
  // constructorCallHasSideEffects / functionCallHasSideEffects
  // =======================================================================

  @Test
  public void testConstructorCallHasSideEffects() {
    assertFalse(NodeUtil.constructorCallHasSideEffects(IR.newNode(name("Array"))));
    assertFalse(NodeUtil.constructorCallHasSideEffects(IR.newNode(name("Date"))));
    assertTrue(NodeUtil.constructorCallHasSideEffects(IR.newNode(name("MyClass"))));
  }

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_wrongNodeType() {
    NodeUtil.constructorCallHasSideEffects(IR.call(name("f")));
  }

  @Test
  public void testFunctionCallHasSideEffects() {
    assertFalse(NodeUtil.functionCallHasSideEffects(IR.call(name("Object"))));
    assertTrue(NodeUtil.functionCallHasSideEffects(IR.call(name("unknownFunc"))));
  }

  @Test
  public void testFunctionCallHasSideEffects_toStringValueOf() {
    Node call = IR.call(IR.getprop(name("x"), str("toString")));
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_mathFloor() {
    Node call = IR.call(IR.getprop(name("Math"), str("floor")), num(1));
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_wrongNodeType() {
    NodeUtil.functionCallHasSideEffects(IR.newNode(name("Array")));
  }

  // =======================================================================
  // isUndefined / isNullOrUndefined
  // =======================================================================

  @Test
  public void testIsUndefinedAndIsNullOrUndefined() {
    assertTrue(NodeUtil.isUndefined(IR.voidNode(num(0))));
    assertTrue(NodeUtil.isUndefined(name("undefined")));
    assertFalse(NodeUtil.isUndefined(name("x")));

    assertTrue(NodeUtil.isNullOrUndefined(IR.nullNode()));
    assertTrue(NodeUtil.isNullOrUndefined(IR.voidNode(num(0))));
    assertFalse(NodeUtil.isNullOrUndefined(num(1)));
  }

  // =======================================================================
  // isNumericResult / isBooleanResult / mayBeString
  // =======================================================================

  @Test
  public void testIsNumericResult() {
    assertTrue(NodeUtil.isNumericResult(num(1)));
    assertTrue(NodeUtil.isNumericResult(name("NaN")));
    assertTrue(NodeUtil.isNumericResult(name("Infinity")));
    assertFalse(NodeUtil.isNumericResult(name("x")));

    Node addNums = IR.add(num(1), num(2));
    assertTrue(NodeUtil.isNumericResult(addNums));

    Node addWithString = IR.add(str("a"), num(2));
    assertFalse(NodeUtil.isNumericResult(addWithString));
  }

  @Test
  public void testIsBooleanResult() {
    assertTrue(NodeUtil.isBooleanResult(IR.trueNode()));
    assertTrue(NodeUtil.isBooleanResult(IR.eq(num(1), num(2))));
    assertTrue(NodeUtil.isBooleanResult(IR.not(str("a"))));
    assertFalse(NodeUtil.isBooleanResult(num(1)));
  }

  @Test
  public void testMayBeString() {
    assertFalse(NodeUtil.mayBeString(num(1)));
    assertFalse(NodeUtil.mayBeString(IR.trueNode()));
    assertFalse(NodeUtil.mayBeString(IR.nullNode()));
    assertFalse(NodeUtil.mayBeString(IR.voidNode(num(0))));
    assertTrue(NodeUtil.mayBeString(str("a")));
  }

  // =======================================================================
  // isAssociative / isCommutative
  // =======================================================================

  @Test
  public void testIsAssociativeAndCommutative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));

    assertTrue(NodeUtil.isCommutative(Token.BITAND));
    assertFalse(NodeUtil.isCommutative(Token.ADD));
  }

  // =======================================================================
  // isAssignmentOp
  // =======================================================================

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(IR.assign(name("x"), num(1))));
    assertFalse(NodeUtil.isAssignmentOp(IR.getprop(name("a"), str("b"))));
  }

  // =======================================================================
  // containsFunction / referencesThis
  // =======================================================================

  @Test
  public void testContainsFunction() {
    Node block = IR.block();
    block.addChildToBack(IR.exprResult(
        IR.function(name(""), IR.paramList(), IR.block())));
    assertTrue(NodeUtil.containsFunction(block));
    assertFalse(NodeUtil.containsFunction(IR.block()));
  }

  @Test
  public void testReferencesThis() {
    Node body = IR.block();
    body.addChildToBack(IR.exprResult(IR.thisNode()));
    Node fn = IR.function(name(""), IR.paramList(), body);
    assertTrue(NodeUtil.referencesThis(fn));

    Node fnNoThis = IR.function(name(""), IR.paramList(), IR.block());
    assertFalse(NodeUtil.referencesThis(fnNoThis));
  }

  // =======================================================================
  // isGet / isVarDeclaration / getAssignedValue
  // =======================================================================

  @Test
  public void testIsGet() {
    assertTrue(NodeUtil.isGet(IR.getprop(name("a"), str("b"))));
    assertTrue(NodeUtil.isGet(IR.getelem(name("a"), num(0)))); // ASSUMPTION: IR.getelem
    assertFalse(NodeUtil.isGet(name("a")));
  }

  @Test
  public void testIsVarDeclaration() {
    Node n = name("x");
    n.addChildToBack(num(1));
    IR.var(n);
    assertTrue(NodeUtil.isVarDeclaration(n));

    assertFalse(NodeUtil.isVarDeclaration(str("x")));
  }

  @Test
  public void testGetAssignedValue_var() {
    Node n = name("x");
    n.addChildToBack(num(1));
    IR.var(n);
    assertEquals(num(1).getType(), NodeUtil.getAssignedValue(n).getType());
  }

  @Test
  public void testGetAssignedValue_assign() {
    Node n = name("x");
    Node value = num(2);
    IR.assign(n, value);
    assertEquals(value, NodeUtil.getAssignedValue(n));
  }

  @Test
  public void testGetAssignedValue_none() {
    Node n = name("x");
    IR.getprop(n, str("y")); // parent ไม่ใช่ VAR/ASSIGN(n เป็นซ้าย)
    assertNull(NodeUtil.getAssignedValue(n));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetAssignedValue_notName() {
    NodeUtil.getAssignedValue(str("x"));
  }

  // =======================================================================
  // isExprAssign / isExprCall
  // =======================================================================

  @Test
  public void testIsExprAssignAndIsExprCall() {
    Node exprAssign = IR.exprResult(IR.assign(name("x"), num(1)));
    assertTrue(NodeUtil.isExprAssign(exprAssign));
    assertFalse(NodeUtil.isExprCall(exprAssign));

    Node exprCall = IR.exprResult(IR.call(name("f")));
    assertTrue(NodeUtil.isExprCall(exprCall));
    assertFalse(NodeUtil.isExprAssign(exprCall));
  }

  // =======================================================================
  // isForIn / isLoopStructure / getLoopCodeBlock
  // =======================================================================

  @Test
  public void testIsForIn() {
    Node forIn = IR.forIn(name("k"), name("obj"), IR.block()); // ASSUMPTION: IR.forIn (3 children)
    assertTrue(NodeUtil.isForIn(forIn));

    Node forClassic = IR.forNode(IR.empty(), IR.empty(), IR.empty(), IR.block()); // ASSUMPTION: IR.forNode (4 children)
    assertFalse(NodeUtil.isForIn(forClassic));
  }

  @Test
  public void testIsLoopStructure() {
    assertTrue(NodeUtil.isLoopStructure(IR.forNode(IR.empty(), IR.empty(), IR.empty(), IR.block())));
    assertTrue(NodeUtil.isLoopStructure(IR.whileNode(IR.trueNode(), IR.block()))); // ASSUMPTION
    assertTrue(NodeUtil.isLoopStructure(IR.doNode(IR.block(), IR.trueNode()))); // ASSUMPTION
    assertFalse(NodeUtil.isLoopStructure(IR.block()));
  }

  @Test
  public void testGetLoopCodeBlock() {
    Node body = IR.block();
    Node forNode = IR.forNode(IR.empty(), IR.empty(), IR.empty(), body);
    assertEquals(body, NodeUtil.getLoopCodeBlock(forNode));

    Node whileBody = IR.block();
    Node whileNode = IR.whileNode(IR.trueNode(), whileBody);
    assertEquals(whileBody, NodeUtil.getLoopCodeBlock(whileNode));

    Node doBody = IR.block();
    Node doNode = IR.doNode(doBody, IR.trueNode());
    assertEquals(doBody, NodeUtil.getLoopCodeBlock(doNode));

    assertNull(NodeUtil.getLoopCodeBlock(IR.block()));
  }

  // =======================================================================
  // isControlStructure / getConditionExpression
  // =======================================================================

  @Test
  public void testIsControlStructure() {
    assertTrue(NodeUtil.isControlStructure(IR.ifNode(IR.trueNode(), IR.block()))); // ASSUMPTION
    assertTrue(NodeUtil.isControlStructure(IR.forNode(IR.empty(), IR.empty(), IR.empty(), IR.block())));
    assertFalse(NodeUtil.isControlStructure(IR.block()));
  }

  @Test
  public void testGetConditionExpression_ifWhile() {
    Node cond = IR.trueNode();
    Node ifNode = IR.ifNode(cond, IR.block());
    assertEquals(cond, NodeUtil.getConditionExpression(ifNode));

    Node cond2 = name("c");
    Node whileNode = IR.whileNode(cond2, IR.block());
    assertEquals(cond2, NodeUtil.getConditionExpression(whileNode));
  }

  @Test
  public void testGetConditionExpression_do() {
    Node cond = name("c");
    Node doNode = IR.doNode(IR.block(), cond);
    assertEquals(cond, NodeUtil.getConditionExpression(doNode));
  }

  @Test
  public void testGetConditionExpression_forInAndClassic() {
    Node forIn = IR.forIn(name("k"), name("obj"), IR.block());
    assertNull(NodeUtil.getConditionExpression(forIn));

    Node cond = name("c");
    Node forClassic = IR.forNode(IR.empty(), cond, IR.empty(), IR.block());
    assertEquals(cond, NodeUtil.getConditionExpression(forClassic));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_default() {
    NodeUtil.getConditionExpression(IR.block());
  }

  // =======================================================================
  // isStatementBlock / isStatement / isStatementParent
  // =======================================================================

  @Test
  public void testIsStatementBlockAndIsStatement() {
    assertTrue(NodeUtil.isStatementBlock(IR.block()));

    Node block = IR.block();
    Node stmt = IR.exprResult(num(1));
    block.addChildToBack(stmt);
    assertTrue(NodeUtil.isStatement(stmt));

    Node exprInsideCall = num(1);
    IR.call(name("f")).addChildToBack(exprInsideCall);
    assertFalse(NodeUtil.isStatement(exprInsideCall));
  }

  // =======================================================================
  // isSwitchCase / isReferenceName
  // =======================================================================

  @Test
  public void testIsReferenceName() {
    assertTrue(NodeUtil.isReferenceName(name("x")));
    assertFalse(NodeUtil.isReferenceName(name("")));
    assertFalse(NodeUtil.isReferenceName(str("x")));
  }

  // =======================================================================
  // isCallOrNew / getFunctionBody / getFunctionParameters
  // =======================================================================

  @Test
  public void testIsCallOrNew() {
    assertTrue(NodeUtil.isCallOrNew(IR.call(name("f"))));
    assertTrue(NodeUtil.isCallOrNew(IR.newNode(name("Array"))));
    assertFalse(NodeUtil.isCallOrNew(name("f")));
  }

  @Test
  public void testGetFunctionBodyAndParameters() {
    Node body = IR.block();
    Node params = IR.paramList(name("a"), name("b"));
    Node fn = IR.function(name("f"), params, body);
    assertEquals(body, NodeUtil.getFunctionBody(fn));
    assertEquals(params, NodeUtil.getFunctionParameters(fn));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetFunctionBody_notFunction() {
    NodeUtil.getFunctionBody(name("x"));
  }

  // =======================================================================
  // isFunctionDeclaration / isFunctionExpression / isHoistedFunctionDeclaration
  // =======================================================================

  @Test
  public void testIsFunctionDeclarationVsExpression() {
    Node declFn = IR.function(name("f"), IR.paramList(), IR.block());
    Node script = IR.block(); // ใช้ BLOCK แทน SCRIPT (ทั้งสอง match isStatementBlock ผ่าน isBlock())
    script.addChildToBack(declFn);
    assertTrue(NodeUtil.isFunctionDeclaration(declFn));
    assertFalse(NodeUtil.isFunctionExpression(declFn));

    Node exprFn = IR.function(name(""), IR.paramList(), IR.block());
    IR.exprResult(exprFn);
    assertFalse(NodeUtil.isFunctionDeclaration(exprFn));
    assertTrue(NodeUtil.isFunctionExpression(exprFn));
  }

  // =======================================================================
  // isBleedingFunctionName / isEmptyFunctionExpression / isVarArgsFunction
  // =======================================================================

  @Test
  public void testIsBleedingFunctionName() {
    Node innerName = name("foo");
    Node fn = IR.function(innerName, IR.paramList(), IR.block());
    IR.exprResult(fn); // ทำให้ fn เป็น function EXPRESSION
    assertTrue(NodeUtil.isBleedingFunctionName(innerName));

    Node emptyName = name("");
    Node fn2 = IR.function(emptyName, IR.paramList(), IR.block());
    IR.exprResult(fn2);
    assertFalse(NodeUtil.isBleedingFunctionName(emptyName));
  }

  @Test
  public void testIsEmptyFunctionExpression() {
    Node exprFn = IR.function(name(""), IR.paramList(), IR.block());
    IR.exprResult(exprFn);
    assertTrue(NodeUtil.isEmptyFunctionExpression(exprFn));

    Node body = IR.block();
    body.addChildToBack(IR.exprResult(num(1)));
    Node exprFnNonEmpty = IR.function(name(""), IR.paramList(), body);
    IR.exprResult(exprFnNonEmpty);
    assertFalse(NodeUtil.isEmptyFunctionExpression(exprFnNonEmpty));
  }

  @Test
  public void testIsVarArgsFunction() {
    Node body = IR.block();
    body.addChildToBack(IR.exprResult(name("arguments")));
    Node fn = IR.function(name(""), IR.paramList(), body);
    assertTrue(NodeUtil.isVarArgsFunction(fn));

    Node fnNoArgs = IR.function(name(""), IR.paramList(), IR.block());
    assertFalse(NodeUtil.isVarArgsFunction(fnNoArgs));
  }

  // =======================================================================
  // isObjectCallMethod / isFunctionObjectCall / isFunctionObjectApply
  // =======================================================================

  @Test
  public void testIsFunctionObjectCallApply() {
    Node call1 = IR.call(IR.getprop(name("x"), str("call")));
    assertTrue(NodeUtil.isFunctionObjectCall(call1));
    assertFalse(NodeUtil.isFunctionObjectApply(call1));

    Node call2 = IR.call(IR.getprop(name("x"), str("apply")));
    assertTrue(NodeUtil.isFunctionObjectApply(call2));

    Node call3 = IR.call(name("f"));
    assertFalse(NodeUtil.isObjectCallMethod(call3, "call"));
  }

  // =======================================================================
  // isVarOrSimpleAssignLhs
  // =======================================================================

  @Test
  public void testIsVarOrSimpleAssignLhs() {
    Node n1 = name("x");
    Node assign = IR.assign(n1, num(1));
    assertTrue(NodeUtil.isVarOrSimpleAssignLhs(n1, assign));

    Node n2 = name("x");
    n2.addChildToBack(num(1));
    Node varNode = IR.var(n2);
    assertTrue(NodeUtil.isVarOrSimpleAssignLhs(n2, varNode));

    Node n3 = name("x");
    Node assignRhs = IR.assign(name("y"), n3); // n3 อยู่ฝั่งขวา
    assertFalse(NodeUtil.isVarOrSimpleAssignLhs(n3, assignRhs));
  }

  // =======================================================================
  // isLValue
  // =======================================================================

  @Test
  public void testIsLValue_assignTarget() {
    Node n = name("x");
    IR.assign(n, num(1));
    assertTrue(NodeUtil.isLValue(n));
  }

  @Test
  public void testIsLValue_varDeclarationAndParamListAndIncDec() {
    Node n1 = name("x");
    IR.var(n1);
    assertTrue(NodeUtil.isLValue(n1));

    Node n2 = name("p");
    IR.paramList(n2);
    assertTrue(NodeUtil.isLValue(n2));

    Node n3 = name("x");
    IR.inc(n3, true); // ASSUMPTION: IR.inc(Node,boolean)
    assertTrue(NodeUtil.isLValue(n3));
  }

  @Test
  public void testIsLValue_notLValue() {
    Node n = name("x");
    IR.call(name("f")).addChildToBack(n); // เป็น argument เฉย ๆ
    assertFalse(NodeUtil.isLValue(n));
  }

  @Test
  public void testIsLValue_noParent() {
    assertFalse(NodeUtil.isLValue(name("x")));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIsLValue_wrongNodeType() {
    NodeUtil.isLValue(num(5));
  }

  // =======================================================================
  // isObjectLitKey / getObjectLitKeyName / isGetOrSetKey
  // =======================================================================

  @Test
  public void testIsObjectLitKeyAndName() {
    Node key = IR.stringKey("k", num(1));
    assertTrue(NodeUtil.isObjectLitKey(key, null));
    assertEquals("k", NodeUtil.getObjectLitKeyName(key));

    assertFalse(NodeUtil.isObjectLitKey(name("x"), null));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetObjectLitKeyName_wrongType() {
    NodeUtil.getObjectLitKeyName(name("x"));
  }

  @Test
  public void testIsGetOrSetKey_falseCase() {
    // ครอบคลุมกรณี default/false เท่านั้น (STRING_KEY ไม่ใช่ GETTER/SETTER_DEF)
    Node key = IR.stringKey("k", num(1));
    assertFalse(NodeUtil.isGetOrSetKey(key));
  }

  // =======================================================================
  // opToStr / opToStrNoFail / precedence (ใช้ int overload ตรง ๆ)
  // =======================================================================

  @Test
  public void testOpToStr() {
    assertEquals("||", NodeUtil.opToStr(Token.OR));
    assertEquals("&&", NodeUtil.opToStr(Token.AND));
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertNull(NodeUtil.opToStr(Token.BLOCK));
  }

  @Test
  public void testOpToStrNoFail() {
    assertEquals("-", NodeUtil.opToStrNoFail(Token.SUB));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_unknown() {
    NodeUtil.opToStrNoFail(Token.BLOCK);
  }

  @Test
  public void testPrecedence() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(4, NodeUtil.precedence(Token.AND));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test
  public void testPrecedence_unknownThrowsError() {
    try {
      NodeUtil.precedence(Token.SCRIPT);
      fail("Expected java.lang.Error");
    } catch (Error expected) {
      // OK
    }
  }

  // =======================================================================
  // containsType / isLatin / isValid*Name
  // =======================================================================

  @Test
  public void testContainsType() {
    Node tree = IR.call(name("f"), name("x"));
    assertTrue(NodeUtil.containsType(tree, Token.NAME));
    assertFalse(NodeUtil.containsType(tree, Token.STRING));
  }

  @Test
  public void testIsLatin() {
    assertTrue(NodeUtil.isLatin("abc123"));
    assertFalse(NodeUtil.isLatin("caf\u00e9"));
  }

  @Test
  public void testIsValidSimpleName() {
    assertTrue(NodeUtil.isValidSimpleName("foo"));
    assertFalse(NodeUtil.isValidSimpleName("var"));   // keyword
    assertFalse(NodeUtil.isValidSimpleName(""));       // empty/invalid identifier
  }

  @Test
  public void testIsValidQualifiedName() {
    assertTrue(NodeUtil.isValidQualifiedName("foo.bar"));
    assertFalse(NodeUtil.isValidQualifiedName(".foo"));
    assertFalse(NodeUtil.isValidQualifiedName("foo."));
    assertFalse(NodeUtil.isValidQualifiedName("foo..bar"));
  }

  @Test
  public void testIsValidPropertyName() {
    assertTrue(NodeUtil.isValidPropertyName("bar"));
    assertFalse(NodeUtil.isValidPropertyName("class"));
  }

  // =======================================================================
  // isPrototypeProperty / getPrototypeClassName / getPrototypePropertyName /
  // isPrototypePropertyDeclaration
  // =======================================================================

  @Test
  public void testIsPrototypeProperty() {
    Node qName = IR.getprop(IR.getprop(name("Foo"), str("prototype")), str("bar"));
    assertTrue(NodeUtil.isPrototypeProperty(qName));

    Node notProto = IR.getprop(name("Foo"), str("bar"));
    assertFalse(NodeUtil.isPrototypeProperty(notProto));

    assertFalse(NodeUtil.isPrototypeProperty(IR.call(name("f"))));
  }

  @Test
  public void testGetPrototypeClassName() {
    Node classNameNode = name("Foo");
    Node qName = IR.getprop(IR.getprop(classNameNode, str("prototype")), str("bar"));
    assertEquals(classNameNode, NodeUtil.getPrototypeClassName(qName));

    Node notProto = IR.getprop(name("Foo"), str("bar"));
    assertNull(NodeUtil.getPrototypeClassName(notProto));
  }

  @Test
  public void testGetPrototypePropertyName() {
    Node qName = IR.getprop(IR.getprop(name("Foo"), str("prototype")), str("bar"));
    assertEquals("bar", NodeUtil.getPrototypePropertyName(qName));
  }

  @Test
  public void testIsPrototypePropertyDeclaration() {
    Node lhs = IR.getprop(IR.getprop(name("Foo"), str("prototype")), str("bar"));
    Node exprAssign = IR.exprResult(IR.assign(lhs, num(1)));
    assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprAssign));

    Node notAssign = IR.exprResult(IR.call(name("f")));
    assertFalse(NodeUtil.isPrototypePropertyDeclaration(notAssign));
  }

  // =======================================================================
  // newUndefinedNode / newVarNode / booleanNode / numberNode
  // =======================================================================

  @Test
  public void testNewUndefinedNode() {
    Node undef = NodeUtil.newUndefinedNode(null);
    assertEquals(Token.VOID, undef.getType());
    assertEquals(Token.NUMBER, undef.getFirstChild().getType());
    assertEquals(0.0, undef.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testNewVarNode_withValue() {
    Node varNode = NodeUtil.newVarNode("x", num(5));
    assertEquals(Token.VAR, varNode.getType());
    Node nameChild = varNode.getFirstChild();
    assertEquals("x", nameChild.getString());
    assertEquals(5.0, nameChild.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testNewVarNode_nullValue() {
    Node varNode = NodeUtil.newVarNode("x", null);
    assertEquals(Token.VAR, varNode.getType());
    assertNull(varNode.getFirstChild().getFirstChild());
  }

  @Test
  public void testBooleanNode() {
    assertEquals(Token.TRUE, NodeUtil.booleanNode(true).getType());
    assertEquals(Token.FALSE, NodeUtil.booleanNode(false).getType());
  }

  @Test
  public void testNumberNode() {
    assertEquals(Token.NAME, NodeUtil.numberNode(Double.NaN, null).getType());
    assertEquals("NaN", NodeUtil.numberNode(Double.NaN, null).getString());

    assertEquals(Token.NAME, NodeUtil.numberNode(Double.POSITIVE_INFINITY, null).getType());
    assertEquals("Infinity", NodeUtil.numberNode(Double.POSITIVE_INFINITY, null).getString());

    assertEquals(Token.NEG, NodeUtil.numberNode(Double.NEGATIVE_INFINITY, null).getType());

    Node normal = NodeUtil.numberNode(5.0, null);
    assertEquals(Token.NUMBER, normal.getType());
    assertEquals(5.0, normal.getDouble(), 0.0);
  }

  // =======================================================================
  // getNodeTypeReferenceCount / isNameReferenced / getNameReferenceCount / has / getCount
  // =======================================================================

  @Test
  public void testIsNameReferencedAndCount() {
    Node block = IR.block();
    block.addChildToBack(IR.exprResult(name("x")));
    block.addChildToBack(IR.exprResult(name("x")));
    block.addChildToBack(IR.exprResult(name("y")));

    assertTrue(NodeUtil.isNameReferenced(block, "x"));
    assertFalse(NodeUtil.isNameReferenced(block, "z"));
    assertEquals(2, NodeUtil.getNameReferenceCount(block, "x"));
    assertEquals(1, NodeUtil.getNameReferenceCount(block, "y"));
    assertEquals(0, NodeUtil.getNameReferenceCount(block, "z"));
  }

  // =======================================================================
  // isConstantName
  // =======================================================================

  @Test
  public void testIsConstantName() {
    Node n = name("FOO");
    assertFalse(NodeUtil.isConstantName(n));
    n.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(n));
  }

  // =======================================================================
  // isTryFinallyNode / isTryCatchNodeContainer
  //   (ข้าม hasFinally/getCatchBlock/hasCatchHandler/removeChild เนื่องจากต้องสร้าง
  //    โครง TRY/CATCH ที่ซับซ้อนเกินกว่าจะยืนยัน public builder API ได้อย่างมั่นใจ)
  // =======================================================================

  @Test
  public void testIsTryFinallyNode_negativeCases() {
    // negative case ที่ปลอดภัย: parent ไม่ใช่ TRY
    assertFalse(NodeUtil.isTryFinallyNode(IR.block(), IR.block()));
  }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition (ย่อ)

| กลุ่มเมธอดทดสอบ | Branch/Condition หลักที่ครอบคลุม |
|---|---|
| `testPureBoolean_*` | ทุก case ของ switch ใน `getPureBooleanValue`: STRING(true/false), NUMBER(0/non-0), NOT, NULL/FALSE/TRUE, VOID(มี/ไม่มี side effect), NAME(undefined/NaN/Infinity/อื่น), REGEXP, ARRAYLIT/OBJECTLIT(มี/ไม่มี side effect), default UNKNOWN |
| `testImpureBoolean_*` | ASSIGN/COMMA, NOT, AND/OR (ค่าจริง/เท็จ), HOOK (เท่ากัน/ต่างกัน), ARRAYLIT/OBJECTLIT/VOID |
| `testGetStringValue_*` | ทุก case ของ `getStringValue(Node)` รวม STRING_KEY, NAME (รู้จัก/ไม่รู้จัก), NUMBER, literal, NOT (known/unknown), ARRAYLIT (ปกติ/elision/ไม่แปลงได้), OBJECTLIT, default |
| `testGetStringValueDouble` | integer vs non-integer branch |
| `testGetArrayElementStringValue` | null/undefined/empty vs ปกติ |
| `testGetNumberValue_*` | TRUE/FALSE/NULL/NUMBER/VOID(2 branch)/NAME(4 branch)/NEG(2 branch)/NOT(3 branch)/STRING/ARRAYLIT/OBJECTLIT/default |
| `testGetStringNumberValue_*` | vertical tab, empty, hex ปกติ/ผิด, hex มีเครื่องหมาย