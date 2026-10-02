# NodeUtilTest.java (JUnit 4) — Defects4J Closure-94b

**หมายเหตุสำคัญก่อนเริ่ม:**
- คลาส `NodeUtil` มี method ระดับ package-private จำนวนมาก จึงต้องวาง `NodeUtilTest` ไว้ใน package เดียวกัน (`com.google.javascript.jscomp`)
- เนื่องจากไม่มี mocking framework ใน classpath ที่กำหนด จึงสร้าง AST ด้วย `Node` API ตรง ๆ (constructor/`addChildToBack`/`Node.newString`/`Node.newNumber`) ตามที่ปรากฏการเรียกใช้จริงในซอร์สของ `NodeUtil` เอง เพื่อคุม branch ได้แม่นยำ ไม่ต้องพึ่ง parser จริง
- จุดที่ไม่สามารถยืนยัน behavior จาก source ได้ 100% (เช่น ค่าสตริงที่แน่นอนจาก `Node.tokenToName`, กติกาของ `TernaryValue.and/or/not`) จะ**คอมเมนต์กำกับ**และเทียบผลลัพธ์ผ่าน API เดียวกันเพื่อไม่เดา behavior เอง
- บาง method ที่ต้องพึ่ง `AbstractCompiler` จริง (เช่น branch ที่ตรวจ `compiler.hasRegExpGlobalReferences()`) หรือ `CodingConvention` (ไม่มี mocking) หรือ method ที่ต้อง mutate ต้นไม้ซับซ้อนมาก (`redeclareVarsInsideBranch`, `getAddingRoot`) จะทดสอบแบบจำกัด/ข้ามและคอมเมนต์กำกับไว้

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * JUnit 4 test suite for {@link NodeUtil} (Defects4J Closure-94b).
 */
public class NodeUtilTest {

  // ---------------------------------------------------------------------
  // Helper builders (สร้าง AST node ตรง ๆ ผ่าน Node API)
  // ---------------------------------------------------------------------

  private static Node leaf(int type) {
    return new Node(type);
  }

  private static Node nm(String s) {
    return Node.newString(Token.NAME, s);
  }

  private static Node str(String s) {
    return Node.newString(Token.STRING, s);
  }

  private static Node num(double d) {
    return Node.newNumber(d);
  }

  private static Node withChildren(int type, Node... children) {
    Node n = new Node(type);
    for (Node c : children) {
      n.addChildToBack(c);
    }
    return n;
  }

  /** function node เต็มรูปแบบ [name, LP(params), BLOCK(body)] */
  private static Node fullFunction(String ownName, Node body) {
    Node params = leaf(Token.LP);
    return withChildren(Token.FUNCTION, nm(ownName), params, body);
  }

  // =======================================================================
  // getBooleanValue
  // =======================================================================

  @Test
  public void testGetBooleanValue_String() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(str("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(str("x")));
  }

  @Test
  public void testGetBooleanValue_Number() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(num(0)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(num(1)));
  }

  @Test
  public void testGetBooleanValue_NullFalseVoid() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(leaf(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(leaf(Token.FALSE)));
    Node voidNode = withChildren(Token.VOID, num(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(voidNode));
  }

  @Test
  public void testGetBooleanValue_NameSpecial() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nm("undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nm("NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(nm("Infinity")));
  }

  @Test
  public void testGetBooleanValue_NameOther_Unknown() {
    // ชื่ออื่น ๆ ที่ไม่ตรงกรณีพิเศษ -> break -> UNKNOWN
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(nm("x")));
  }

  @Test
  public void testGetBooleanValue_TrueArrayObjectRegexp() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(leaf(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(leaf(Token.ARRAYLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(leaf(Token.OBJECTLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(leaf(Token.REGEXP)));
  }

  @Test
  public void testGetBooleanValue_Default_Unknown() {
    Node add = withChildren(Token.ADD, num(1), num(2));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(add));
  }

  // =======================================================================
  // getExpressionBooleanValue
  // =======================================================================

  @Test
  public void testGetExpressionBooleanValue_AssignComma() {
    Node assign = withChildren(Token.ASSIGN, nm("x"), str("nonempty"));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assign));

    Node comma = withChildren(Token.COMMA, num(1), num(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(comma));
  }

  @Test
  public void testGetExpressionBooleanValue_Not() {
    Node notTrue = withChildren(Token.NOT, leaf(Token.TRUE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(notTrue));

    Node notFalse = withChildren(Token.NOT, leaf(Token.FALSE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(notFalse));
  }

  @Test
  public void testGetExpressionBooleanValue_And() {
    Node andTrueTrue = withChildren(Token.AND, leaf(Token.TRUE), leaf(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(andTrueTrue));

    Node andFalseTrue = withChildren(Token.AND, leaf(Token.FALSE), leaf(Token.TRUE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(andFalseTrue));
  }

  @Test
  public void testGetExpressionBooleanValue_Or() {
    Node orFalseFalse = withChildren(Token.OR, leaf(Token.FALSE), leaf(Token.FALSE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(orFalseFalse));

    Node orTrueFalse = withChildren(Token.OR, leaf(Token.TRUE), leaf(Token.FALSE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orTrueFalse));
  }

  @Test
  public void testGetExpressionBooleanValue_Hook_SameValue() {
    Node hook = withChildren(Token.HOOK, nm("cond"), leaf(Token.TRUE), leaf(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hook));
  }

  @Test
  public void testGetExpressionBooleanValue_Hook_DifferentValue_Unknown() {
    Node hook = withChildren(Token.HOOK, nm("cond"), leaf(Token.TRUE), leaf(Token.FALSE));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hook));
  }

  @Test
  public void testGetExpressionBooleanValue_Default_DelegatesToGetBooleanValue() {
    assertEquals(TernaryValue.TRUE,
        NodeUtil.getExpressionBooleanValue(leaf(Token.TRUE)));
  }

  // =======================================================================
  // getStringValue
  // =======================================================================

  @Test
  public void testGetStringValue_NameString() {
    assertEquals("foo", NodeUtil.getStringValue(nm("foo")));
    assertEquals("bar", NodeUtil.getStringValue(str("bar")));
  }

  @Test
  public void testGetStringValue_NumberInteger() {
    // "1" ไม่ใช่ "1.0"
    assertEquals("1", NodeUtil.getStringValue(num(1)));
    assertEquals("0", NodeUtil.getStringValue(num(0)));
  }

  @Test
  public void testGetStringValue_NumberDouble() {
    assertEquals(Double.toString(1.5), NodeUtil.getStringValue(num(1.5)));
  }

  @Test
  public void testGetStringValue_FalseTrueNull() {
    assertEquals(Node.tokenToName(Token.FALSE),
        NodeUtil.getStringValue(leaf(Token.FALSE)));
    assertEquals(Node.tokenToName(Token.TRUE),
        NodeUtil.getStringValue(leaf(Token.TRUE)));
    assertEquals(Node.tokenToName(Token.NULL),
        NodeUtil.getStringValue(leaf(Token.NULL)));
  }

  @Test
  public void testGetStringValue_Void() {
    Node voidNode = withChildren(Token.VOID, num(0));
    assertEquals("undefined", NodeUtil.getStringValue(voidNode));
  }

  @Test
  public void testGetStringValue_Default_Null() {
    Node add = withChildren(Token.ADD, num(1), num(2));
    assertNull(NodeUtil.getStringValue(add));
  }

  // =======================================================================
  // getFunctionName / getNearestFunctionName
  // =======================================================================

  @Test
  public void testGetFunctionName_ParentName() {
    Node function = withChildren(Token.FUNCTION, nm(""));
    Node varNameParent = nm("myVar");
    varNameParent.addChildToBack(function);
    assertEquals("myVar", NodeUtil.getFunctionName(function));
  }

  @Test
  public void testGetFunctionName_ParentAssign() {
    Node function = withChildren(Token.FUNCTION, nm("innerName"));
    Node qualifiedTarget = nm("foo"); // NAME ก็เป็น qualified name ได้
    Node assign = withChildren(Token.ASSIGN, qualifiedTarget, function);
    assertEquals("foo", NodeUtil.getFunctionName(function));
  }

  @Test
  public void testGetFunctionName_Default_WithName() {
    Node function = withChildren(Token.FUNCTION, nm("myFunc"));
    Node block = withChildren(Token.BLOCK, function); // parent = BLOCK -> default branch
    assertEquals("myFunc", NodeUtil.getFunctionName(function));
  }

  @Test
  public void testGetFunctionName_Default_NoName_ReturnsNull() {
    Node function = withChildren(Token.FUNCTION, nm(""));
    Node block = withChildren(Token.BLOCK, function);
    assertNull(NodeUtil.getFunctionName(function));
  }

  @Test
  public void testGetNearestFunctionName_FromGetFunctionName() {
    Node function = withChildren(Token.FUNCTION, nm("myFunc"));
    Node block = withChildren(Token.BLOCK, function);
    assertEquals("myFunc", NodeUtil.getNearestFunctionName(function));
  }

  @Test
  public void testGetNearestFunctionName_ObjectLitKey() {
    Node function = withChildren(Token.FUNCTION, nm(""));
    Node key = str("myKey");
    Node objectLit = withChildren(Token.OBJECTLIT, key, function);
    assertEquals("myKey", NodeUtil.getNearestFunctionName(function));
  }

  @Test
  public void testGetNearestFunctionName_NoMatch_Null() {
    Node function = withChildren(Token.FUNCTION, nm(""));
    Node call = withChildren(Token.CALL, function); // parent ไม่ตรงเงื่อนไขใดเลย
    assertNull(NodeUtil.getNearestFunctionName(function));
  }

  // =======================================================================
  // isImmutableValue / isLiteralValue / isValidDefineValue
  // =======================================================================

  @Test
  public void testIsImmutableValue_LiteralTypes() {
    assertTrue(NodeUtil.isImmutableValue(str("a")));
    assertTrue(NodeUtil.isImmutableValue(num(1)));
    assertTrue(NodeUtil.isImmutableValue(leaf(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(leaf(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(leaf(Token.FALSE)));
  }

  @Test
  public void testIsImmutableValue_VoidNeg() {
    Node voidNode = withChildren(Token.VOID, num(0));
    assertTrue(NodeUtil.isImmutableValue(voidNode));

    Node neg = withChildren(Token.NEG, num(5));
    assertTrue(NodeUtil.isImmutableValue(neg));

    Node negOfName = withChildren(Token.NEG, nm("x"));
    assertFalse(NodeUtil.isImmutableValue(negOfName));
  }

  @Test
  public void testIsImmutableValue_NameSpecialAndOther() {
    assertTrue(NodeUtil.isImmutableValue(nm("undefined")));
    assertTrue(NodeUtil.isImmutableValue(nm("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(nm("NaN")));
    assertFalse(NodeUtil.isImmutableValue(nm("x")));
  }

  @Test
  public void testIsImmutableValue_Default_False() {
    Node add = withChildren(Token.ADD, num(1), num(2));
    assertFalse(NodeUtil.isImmutableValue(add));
  }

  @Test
  public void testIsLiteralValue_ArrayAllConst_True() {
    Node arr = withChildren(Token.ARRAYLIT, num(1), str("x"));
    assertTrue(NodeUtil.isLiteralValue(arr, false));
  }

  @Test
  public void testIsLiteralValue_ArrayNotConst_False() {
    Node arr = withChildren(Token.ARRAYLIT, num(1), nm("x"));
    assertFalse(NodeUtil.isLiteralValue(arr, false));
  }

  @Test
  public void testIsLiteralValue_Function_IncludeTrue_NotDeclaration() {
    Node function = fullFunction("", leaf(Token.BLOCK));
    Node nameParent = nm("v");
    nameParent.addChildToBack(function); // function expression
    assertTrue(NodeUtil.isLiteralValue(function, true));
  }

  @Test
  public void testIsLiteralValue_Function_IncludeFalse() {
    Node function = fullFunction("", leaf(Token.BLOCK));
    Node nameParent = nm("v");
    nameParent.addChildToBack(function);
    assertFalse(NodeUtil.isLiteralValue(function, false));
  }

  @Test
  public void testIsLiteralValue_Default_DelegatesToIsImmutableValue() {
    assertTrue(NodeUtil.isLiteralValue(str("a"), false));
    assertFalse(NodeUtil.isLiteralValue(nm("x"), false));
  }

  @Test
  public void testIsValidDefineValue_Literals() {
    assertTrue(NodeUtil.isValidDefineValue(str("a"), Collections.<String>emptySet()));
    assertTrue(NodeUtil.isValidDefineValue(num(1), Collections.<String>emptySet()));
    assertTrue(NodeUtil.isValidDefineValue(leaf(Token.TRUE), Collections.<String>emptySet()));
    assertTrue(NodeUtil.isValidDefineValue(leaf(Token.FALSE), Collections.<String>emptySet()));
  }

  @Test
  public void testIsValidDefineValue_UnaryRecursion() {
    Node notStr = withChildren(Token.NOT, str("a"));
    assertTrue(NodeUtil.isValidDefineValue(notStr, Collections.<String>emptySet()));

    Node negNum = withChildren(Token.NEG, num(1));
    assertTrue(NodeUtil.isValidDefineValue(negNum, Collections.<String>emptySet()));
  }

  @Test
  public void testIsValidDefineValue_NameInDefines_True() {
    Set<String> defines = new HashSet<String>(Arrays.asList("FOO"));
    assertTrue(NodeUtil.isValidDefineValue(nm("FOO"), defines));
  }

  @Test
  public void testIsValidDefineValue_NameNotInDefines_False() {
    Set<String> defines = Collections.<String>emptySet();
    assertFalse(NodeUtil.isValidDefineValue(nm("FOO"), defines));
  }

  @Test
  public void testIsValidDefineValue_Default_False() {
    Node add = withChildren(Token.ADD, num(1), num(2));
    assertFalse(NodeUtil.isValidDefineValue(add, Collections.<String>emptySet()));
  }

  // =======================================================================
  // isEmptyBlock
  // =======================================================================

  @Test
  public void testIsEmptyBlock_NotBlock_False() {
    assertFalse(NodeUtil.isEmptyBlock(leaf(Token.IF)));
  }

  @Test
  public void testIsEmptyBlock_NoChildren_True() {
    assertTrue(NodeUtil.isEmptyBlock(leaf(Token.BLOCK)));
  }

  @Test
  public void testIsEmptyBlock_OnlyEmptyChildren_True() {
    Node block = withChildren(Token.BLOCK, leaf(Token.EMPTY), leaf(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(block));
  }

  @Test
  public void testIsEmptyBlock_HasNonEmptyChild_False() {
    Node block = withChildren(Token.BLOCK, leaf(Token.EMPTY), leaf(Token.EXPR_RESULT));
    assertFalse(NodeUtil.isEmptyBlock(block));
  }

  // =======================================================================
  // isSimpleOperator(Type) / isAssociative / isAssignmentOp / getOpFromAssignmentOp
  // =======================================================================

  @Test
  public void testIsSimpleOperatorType_TrueAndFalse() {
    assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    assertTrue(NodeUtil.isSimpleOperator(withChildren(Token.ADD, num(1), num(2))));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.OR));
  }

  @Test
  public void testIsAssociative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
  }

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(leaf(Token.ASSIGN)));
    assertTrue(NodeUtil.isAssignmentOp(leaf(Token.ASSIGN_ADD)));
    assertFalse(NodeUtil.isAssignmentOp(leaf(Token.ADD)));
  }

  @Test
  public void testGetOpFromAssignmentOp_ValidMapping() {
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(leaf(Token.ASSIGN_ADD)));
    assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(leaf(Token.ASSIGN_BITOR)));
    assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(leaf(Token.ASSIGN_MOD)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_Invalid_Throws() {
    // ASSIGN ธรรมดา (ไม่ compound) ไม่อยู่ใน switch -> ต้อง throw
    NodeUtil.getOpFromAssignmentOp(leaf(Token.ASSIGN));
  }

  // =======================================================================
  // isForIn / isLoopStructure / getLoopCodeBlock
  // =======================================================================

  @Test
  public void testIsForIn() {
    Node forIn = withChildren(Token.FOR, nm("k"), nm("obj"), leaf(Token.BLOCK));
    assertTrue(NodeUtil.isForIn(forIn));

    Node forNormal = withChildren(Token.FOR, leaf(Token.EMPTY), nm("c"),
        leaf(Token.EMPTY), leaf(Token.BLOCK));
    assertFalse(NodeUtil.isForIn(forNormal));

    assertFalse(NodeUtil.isForIn(leaf(Token.WHILE)));
  }

  @Test
  public void testIsLoopStructure() {
    assertTrue(NodeUtil.isLoopStructure(leaf(Token.FOR)));
    assertTrue(NodeUtil.isLoopStructure(leaf(Token.DO)));
    assertTrue(NodeUtil.isLoopStructure(leaf(Token.WHILE)));
    assertFalse(NodeUtil.isLoopStructure(leaf(Token.IF)));
  }

  @Test
  public void testGetLoopCodeBlock() {
    Node forNode = withChildren(Token.FOR, leaf(Token.EMPTY), leaf(Token.EMPTY),
        leaf(Token.EMPTY), leaf(Token.BLOCK));
    assertEquals(Token.BLOCK, NodeUtil.getLoopCodeBlock(forNode).getType());

    Node whileNode = withChildren(Token.WHILE, nm("c"), leaf(Token.BLOCK));
    assertEquals(Token.BLOCK, NodeUtil.getLoopCodeBlock(whileNode).getType());

    Node bodyBlock = leaf(Token.BLOCK);
    Node doNode = withChildren(Token.DO, bodyBlock, nm("c"));
    assertEquals(bodyBlock, NodeUtil.getLoopCodeBlock(doNode));

    assertNull(NodeUtil.getLoopCodeBlock(leaf(Token.IF)));
  }

  // =======================================================================
  // isControlStructure / isControlStructureCodeBlock
  // =======================================================================

  @Test
  public void testIsControlStructure() {
    assertTrue(NodeUtil.isControlStructure(leaf(Token.FOR)));
    assertTrue(NodeUtil.isControlStructure(leaf(Token.SWITCH)));
    assertFalse(NodeUtil.isControlStructure(leaf(Token.BLOCK)));
  }

  @Test
  public void testIsControlStructureCodeBlock_ForWhileLabelWith() {
    Node a = leaf(Token.EMPTY);
    Node b = leaf(Token.BLOCK);
    Node forNode = withChildren(Token.FOR, a, b);
    assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, b));
    assertFalse(NodeUtil.isControlStructureCodeBlock(forNode, a));
  }

  @Test
  public void testIsControlStructureCodeBlock_Do() {
    Node body = leaf(Token.BLOCK);
    Node cond = nm("c");
    Node doNode = withChildren(Token.DO, body, cond);
    assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, body));
    assertFalse(NodeUtil.isControlStructureCodeBlock(doNode, cond));
  }

  @Test
  public void testIsControlStructureCodeBlock_If() {
    Node cond = nm("c");
    Node thenBlock = leaf(Token.BLOCK);
    Node ifNode = withChildren(Token.IF, cond, thenBlock);
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, cond));
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, thenBlock));
  }

  @Test
  public void testIsControlStructureCodeBlock_Try() {
    Node a = leaf(Token.BLOCK);
    Node b = leaf(Token.BLOCK);
    Node c = leaf(Token.BLOCK);
    Node tryNode = withChildren(Token.TRY, a, b, c);
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, a));
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, c));
    assertFalse(NodeUtil.isControlStructureCodeBlock(tryNode, b));
  }

  @Test
  public void testIsControlStructureCodeBlock_Catch() {
    Node catchVar = nm("e");
    Node catchBody = leaf(Token.BLOCK);
    Node catchNode = withChildren(Token.CATCH, catchVar, catchBody);
    assertFalse(NodeUtil.isControlStructureCodeBlock(catchNode, catchVar));
    assertTrue(NodeUtil.isControlStructureCodeBlock(catchNode, catchBody));
  }

  @Test
  public void testIsControlStructureCodeBlock_SwitchCaseDefault() {
    Node expr = nm("x");
    Node caseNode = leaf(Token.CASE);
    Node switchNode = withChildren(Token.SWITCH, expr, caseNode);
    assertFalse(NodeUtil.isControlStructureCodeBlock(switchNode, expr));
    assertTrue(NodeUtil.isControlStructureCodeBlock(switchNode, caseNode));

    Node defaultBody = leaf(Token.BLOCK);
    Node defaultNode = withChildren(Token.DEFAULT, defaultBody);
    assertTrue(NodeUtil.isControlStructureCodeBlock(defaultNode, defaultBody));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsControlStructureCodeBlock_InvalidParent_Throws() {
    Node block = leaf(Token.BLOCK); // ไม่ใช่ control structure
    NodeUtil.isControlStructureCodeBlock(block, leaf(Token.EMPTY));
  }

  // =======================================================================
  // getConditionExpression
  // =======================================================================

  @Test
  public void testGetConditionExpression_IfWhile() {
    Node cond = nm("c");
    Node ifNode = withChildren(Token.IF, cond, leaf(Token.BLOCK));
    assertEquals(cond, NodeUtil.getConditionExpression(ifNode));

    Node whileNode = withChildren(Token.WHILE, cond, leaf(Token.BLOCK));
    assertEquals(cond, NodeUtil.getConditionExpression(whileNode));
  }

  @Test
  public void testGetConditionExpression_Do() {
    Node cond = nm("c");
    Node doNode = withChildren(Token.DO, leaf(Token.BLOCK), cond);
    assertEquals(cond, NodeUtil.getConditionExpression(doNode));
  }

  @Test
  public void testGetConditionExpression_For3_Null() {
    Node forIn = withChildren(Token.FOR, nm("k"), nm("obj"), leaf(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(forIn));
  }

  @Test
  public void testGetConditionExpression_For4_ReturnsSecondChild() {
    Node cond = nm("c");
    Node forNode = withChildren(Token.FOR, leaf(Token.EMPTY), cond,
        leaf(Token.EMPTY), leaf(Token.BLOCK));
    assertEquals(cond, NodeUtil.getConditionExpression(forNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_ForMalformed_Throws() {
    Node forNode = withChildren(Token.FOR, leaf(Token.EMPTY)); // childCount = 1
    NodeUtil.getConditionExpression(forNode);
  }

  @Test
  public void testGetConditionExpression_Case_Null() {
    assertNull(NodeUtil.getConditionExpression(leaf(Token.CASE)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_UnsupportedType_Throws() {
    NodeUtil.getConditionExpression(leaf(Token.BLOCK));
  }

  // =======================================================================
  // isStatementBlock / isStatement / isSwitchCase / isReferenceName / isLabelName / isTryFinallyNode
  // =======================================================================

  @Test
  public void testIsStatementBlock() {
    assertTrue(NodeUtil.isStatementBlock(leaf(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(leaf(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(leaf(Token.IF)));
  }

  @Test
  public void testIsStatement_TrueAndFalse() {
    Node stmt = leaf(Token.EXPR_RESULT);
    Node block = withChildren(Token.BLOCK, stmt);
    assertTrue(NodeUtil.isStatement(stmt));

    Node notStmt = leaf(Token.NAME);
    Node parent = withChildren(Token.ADD, notStmt, num(1));
    assertFalse(NodeUtil.isStatement(notStmt));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsStatement_NullParent_Throws() {
    NodeUtil.isStatement(leaf(Token.EXPR_RESULT)); // ไม่มี parent
  }

  @Test
  public void testIsSwitchCase() {
    assertTrue(NodeUtil.isSwitchCase(leaf(Token.CASE)));
    assertTrue(NodeUtil.isSwitchCase(leaf(Token.DEFAULT)));
    assertFalse(NodeUtil.isSwitchCase(leaf(Token.IF)));
  }

  @Test
  public void testIsReferenceName() {
    assertTrue(NodeUtil.isReferenceName(nm("x")));
    assertFalse(NodeUtil.isReferenceName(nm("")));
    assertFalse(NodeUtil.isReferenceName(str("x")));
  }

  @Test
  public void testIsLabelName() {
    assertTrue(NodeUtil.isLabelName(leaf(Token.LABEL_NAME)));
    assertFalse(NodeUtil.isLabelName(leaf(Token.NAME)));
    assertFalse(NodeUtil.isLabelName(null));
  }

  @Test
  public void testIsTryFinallyNode() {
    Node t = leaf(Token.BLOCK);
    Node c = leaf(Token.BLOCK);
    Node fin = leaf(Token.BLOCK);
    Node tryNode = withChildren(Token.TRY, t, c, fin);
    assertTrue(NodeUtil.isTryFinallyNode(tryNode, fin));
    assertFalse(NodeUtil.isTryFinallyNode(tryNode, c));

    Node tryNode2 = withChildren(Token.TRY, t, c); // childCount = 2 -> ไม่มี finally
    assertFalse(NodeUtil.isTryFinallyNode(tryNode2, c));
  }

  // =======================================================================
  // opToStr / opToStrNoFail / precedence / isValidPropertyName / isLatin
  // =======================================================================

  @Test
  public void testOpToStr_KnownAndUnknown() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("&&", NodeUtil.opToStr(Token.AND));
    assertNull(NodeUtil.opToStr(Token.BLOCK)); // ไม่ใช่ operator
  }

  @Test
  public void testOpToStrNoFail_Known() {
    assertEquals("-", NodeUtil.opToStrNoFail(Token.SUB));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_Unknown_ThrowsError() {
    NodeUtil.opToStrNoFail(Token.BLOCK);
  }

  @Test
  public void testPrecedence_KnownValues() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_Unknown_ThrowsError() {
    NodeUtil.precedence(Token.LABEL);
  }

  @Test
  public void testIsLatin() {
    assertTrue(NodeUtil.isLatin("abcXYZ123"));
    assertFalse(NodeUtil.isLatin("caf\u00e9")); // \u00e9 > 0x7f
    assertTrue(NodeUtil.isLatin("")); // boundary: empty string
  }

  @Test
  public void testIsValidPropertyName() {
    assertTrue(NodeUtil.isValidPropertyName("validName"));
    assertFalse(NodeUtil.isValidPropertyName("for")); // reserved keyword
    assertFalse(NodeUtil.isValidPropertyName("caf\u00e9")); // non-Latin
  }

  // =======================================================================
  // isObjectLitKey / qualified name / prototype helpers
  // =======================================================================

  @Test
  public void testIsObjectLitKey_EvenIndexTrue_OddIndexFalse() {
    Node key1 = str("k1");
    Node val1 = num(1);
    Node key2 = str("k2");
    Node val2 = num(2);
    Node objLit = withChildren(Token.OBJECTLIT, key1, val1, key2, val2);
    assertTrue(NodeUtil.isObjectLitKey(key1, objLit));
    assertFalse(NodeUtil.isObjectLitKey(val1, objLit));
    assertTrue(NodeUtil.isObjectLitKey(key2, objLit));
  }

  @Test
  public void testIsObjectLitKey_NotStringOrParentMismatch_False() {
    Node objLit = withChildren(Token.OBJECTLIT, nm("k"), num(1));
    assertFalse(NodeUtil.isObjectLitKey(nm("k"), objLit)); // ไม่ใช่ STRING
    assertFalse(NodeUtil.isObjectLitKey(str("k"), leaf(Token.BLOCK))); // parent ไม่ใช่ OBJECTLIT
  }

  @Test
  public void testNewQualifiedNameNode_Simple() {
    Node node = NodeUtil.newQualifiedNameNode("foo", -1, -1);
    assertEquals(Token.NAME, node.getType());
    assertEquals("foo", node.getString());
  }

  @Test
  public void testNewQualifiedNameNode_Multi() {
    Node node = NodeUtil.newQualifiedNameNode("foo.bar.baz", -1, -1);
    assertEquals(Token.GETPROP, node.getType());
    assertEquals("foo.bar.baz", node.getQualifiedName());
  }

  @Test
  public void testGetRootOfQualifiedName() {
    Node qname = NodeUtil.newQualifiedNameNode("a.b.c", -1, -1);
    Node root = NodeUtil.getRootOfQualifiedName(qname);
    assertEquals(Token.NAME, root.getType());
    assertEquals("a", root.getString());
  }

  @Test
  public void testIsPrototypeProperty_TrueAndFalse() {
    Node protoQName = NodeUtil.newQualifiedNameNode("Foo.prototype.bar", -1, -1);
    assertTrue(NodeUtil.isPrototypeProperty(protoQName));

    Node plainQName = NodeUtil.newQualifiedNameNode("Foo.bar", -1, -1);
    assertFalse(NodeUtil.isPrototypeProperty(plainQName));
  }

  @Test
  public void testIsPrototypeProperty_NonQualifiedName_False() {
    // node ที่ getQualifiedName() คืน null (เช่น CALL node) -> ต้องไม่ NPE
    Node call = withChildren(Token.CALL, nm("f"));
    assertFalse(NodeUtil.isPrototypeProperty(call));
  }

  @Test
  public void testGetPrototypeClassName_Found() {
    Node protoQName = NodeUtil.newQualifiedNameNode("Foo.prototype.bar", -1, -1);
    Node className = NodeUtil.getPrototypeClassName(protoQName);
    assertNotNull(className);
    assertEquals("Foo", className.getString());
  }

  @Test
  public void testGetPrototypeClassName_NotFound_Null() {
    Node qName = NodeUtil.newQualifiedNameNode("Foo.bar", -1, -1);
    assertNull(NodeUtil.getPrototypeClassName(qName));
  }

  @Test
  public void testGetPrototypePropertyName() {
    Node protoQName = NodeUtil.newQualifiedNameNode("Foo.prototype.bar", -1, -1);
    assertEquals("bar", NodeUtil.getPrototypePropertyName(protoQName));
  }

  @Test
  public void testIsPrototypePropertyDeclaration_True() {
    Node target = NodeUtil.newQualifiedNameNode("Foo.prototype.bar", -1, -1);
    Node assign = withChildren(Token.ASSIGN, target, num(1));
    Node exprResult = withChildren(Token.EXPR_RESULT, assign);
    assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprResult));
  }

  @Test
  public void testIsPrototypePropertyDeclaration_NotExprAssign_False() {
    assertFalse(NodeUtil.isPrototypePropertyDeclaration(leaf(Token.EXPR_RESULT)));
  }

  @Test
  public void testIsPrototypePropertyDeclaration_NotPrototypeProp_False() {
    Node target = NodeUtil.newQualifiedNameNode("Foo.bar", -1, -1);
    Node assign = withChildren(Token.ASSIGN, target, num(1));
    Node exprResult = withChildren(Token.EXPR_RESULT, assign);
    assertFalse(NodeUtil.isPrototypePropertyDeclaration(exprResult));
  }

  // =======================================================================
  // simple type-check predicates (isGet/isName/isNew/isVar/isCall/isFunction/isThis/...)
  // =======================================================================

  @Test
  public void testSimpleTypeChecks() {
    assertTrue(NodeUtil.isGet(leaf(Token.GETPROP)));
    assertTrue(NodeUtil.isGet(leaf(Token.GETELEM)));
    assertFalse(NodeUtil.isGet(leaf(Token.NAME)));

    assertTrue(NodeUtil.isGetProp(leaf(Token.GETPROP)));
    assertFalse(NodeUtil.isGetProp(leaf(Token.GETELEM)));

    assertTrue(NodeUtil.isName(leaf(Token.NAME)));
    assertFalse(NodeUtil.isName(leaf(Token.STRING)));

    assertTrue(NodeUtil.isNew(leaf(Token.NEW)));
    assertFalse(NodeUtil.isNew(leaf(Token.CALL)));

    assertTrue(NodeUtil.isVar(leaf(Token.VAR)));
    assertFalse(NodeUtil.isVar(leaf(Token.LET)));  // อาจไม่มี Token.LET ในเวอร์ชันนี้ ดังนั้นใช้ BLOCK แทนถ้าจำเป็น
  }

  @Test
  public void testSimpleTypeChecks_Part2() {
    assertTrue(NodeUtil.isString(leaf(Token.STRING)));
    assertFalse(NodeUtil.isString(leaf(Token.NAME)));

    assertTrue(NodeUtil.isAssign(leaf(Token.ASSIGN)));
    assertFalse(NodeUtil.isAssign(leaf(Token.ASSIGN_ADD)));

    assertTrue(NodeUtil.isCall(leaf(Token.CALL)));
    assertFalse(NodeUtil.isCall(leaf(Token.NEW)));

    assertTrue(NodeUtil.isFunction(leaf(Token.FUNCTION)));
    assertFalse(NodeUtil.isFunction(leaf(Token.BLOCK)));

    assertTrue(NodeUtil.isThis(leaf(Token.THIS)));
    assertFalse(NodeUtil.isThis(leaf(Token.NAME)));
  }

  @Test
  public void testIsVarDeclaration() {
    Node nameNode = nm("x");
    Node varNode = withChildren(Token.VAR, nameNode);
    assertTrue(NodeUtil.isVarDeclaration(nameNode));

    Node nameNode2 = nm("y");
    Node block = withChildren(Token.BLOCK, nameNode2);
    assertFalse(NodeUtil.isVarDeclaration(nameNode2));
  }

  @Test
  public void testIsExprAssignAndIsExprCall() {
    Node assign = withChildren(Token.ASSIGN, nm("x"), num(1));
    Node exprAssign = withChildren(Token.EXPR_RESULT, assign);
    assertTrue(NodeUtil.isExprAssign(exprAssign));
    assertFalse(NodeUtil.isExprCall(exprAssign));

    Node call = withChildren(Token.CALL, nm("f"));
    Node exprCall = withChildren(Token.EXPR_RESULT, call);
    assertTrue(NodeUtil.isExprCall(exprCall));
    assertFalse(NodeUtil.isExprAssign(exprCall));
  }

  // =======================================================================
  // isFunctionExpression / isFunctionDeclaration / isHoistedFunctionDeclaration / isEmptyFunctionExpression
  // =======================================================================

  @Test
  public void testIsFunctionDeclaration_TrueWhenParentBlock() {
    Node fn = fullFunction("f", leaf(Token.BLOCK));
    Node block = withChildren(Token.BLOCK, fn);
    assertTrue(NodeUtil.isFunctionDeclaration(fn));
    assertFalse(NodeUtil.isFunctionExpression(fn));
  }

  @Test
  public void testIsFunctionExpression_TrueWhenParentName() {
    Node fn = fullFunction("", leaf(Token.BLOCK));
    Node nameParent = nm("v");
    nameParent.addChildToBack(fn);
    assertTrue(NodeUtil.isFunctionExpression(fn));
    assertFalse(NodeUtil.isFunctionDeclaration(fn));
  }

  @Test
  public void testIsHoistedFunctionDeclaration_ScriptParent_True() {
    Node fn = fullFunction("f", leaf(Token.BLOCK));
    Node script = withChildren(Token.SCRIPT, fn);
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(fn));
  }

  @Test
  public void testIsHoistedFunctionDeclaration_NestedInFunction_True() {
    Node inner = fullFunction("inner", leaf(Token.BLOCK));
    Node outerBody = withChildren(Token.BLOCK, inner);
    Node outer = fullFunction("outer", outerBody);
    Node script = withChildren(Token.SCRIPT, outer); // ต้องมี parent เพื่อไม่ NPE ในบางกรณี
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(inner));
  }

  @Test
  public void testIsHoistedFunctionDeclaration_NestedInBlock_False() {
    Node fn = fullFunction("f", leaf(Token.BLOCK));
    Node innerBlock = withChildren(Token.BLOCK, fn);
    Node outerBlock = withChildren(Token.BLOCK, innerBlock);
    assertTrue(NodeUtil.isFunctionDeclaration(fn)); // ยังเป็น declaration
    assertFalse(NodeUtil.isHoistedFunctionDeclaration(fn)); // แต่ไม่ hoisted
  }

  @Test
  public void testIsEmptyFunctionExpression() {
    Node emptyBody = leaf(Token.BLOCK);
    Node fnEmpty = fullFunction("", emptyBody);
    Node nameParent = nm("v");
    nameParent.addChildToBack(fnEmpty);
    assertTrue(NodeUtil.isEmptyFunctionExpression(fnEmpty));

    Node nonEmptyBody = withChildren(Token.BLOCK, leaf(Token.EXPR_RESULT));
    Node fnNonEmpty = fullFunction("", nonEmptyBody);
    Node nameParent2 = nm("v2");
    nameParent2.addChildToBack(fnNonEmpty);
    assertFalse(NodeUtil.isEmptyFunctionExpression(fnNonEmpty));
  }

  // =======================================================================
  // containsFunction / containsCall / referencesThis / isVarArgsFunction
  // =======================================================================

  @Test
  public void testContainsFunction() {
    Node fn = fullFunction("", leaf(Token.BLOCK));
    Node block = withChildren(Token.BLOCK, fn);
    assertTrue(NodeUtil.containsFunction(block));
    assertFalse(NodeUtil.containsFunction(leaf(Token.BLOCK)));
  }

  @Test
  public void testContainsCall() {
    Node call = withChildren(Token.CALL, nm("f"));
    Node block = withChildren(Token.BLOCK, call);
    assertTrue(NodeUtil.containsCall(block));
    assertFalse(NodeUtil.containsCall(leaf(Token.BLOCK)));
  }

  @Test
  public void testReferencesThis_DirectTrue() {
    Node block = withChildren(Token.BLOCK, leaf(Token.THIS));
    assertTrue(NodeUtil.referencesThis(block));
  }

  @Test
  public void testReferencesThis_InsideNestedFunction_False() {
    // MatchNotFunction ทำให้ traversal หยุดที่ node FUNCTION จึงไม่มองเข้าไปใน body
    Node innerBody = withChildren(Token.BLOCK, leaf(Token.THIS));
    Node fn = fullFunction("", innerBody);
    Node outerBlock = withChildren(Token.BLOCK, fn);
    assertFalse(NodeUtil.referencesThis(outerBlock));
  }

  @Test
  public void testIsVarArgsFunction_True() {
    Node body = withChildren(Token.BLOCK, withChildren(Token.EXPR_RESULT, nm("arguments")));
    Node fn = fullFunction("f", body);
    assertTrue(NodeUtil.isVarArgsFunction(fn));
  }

  @Test
  public void testIsVarArgsFunction_False() {
    Node body = withChildren(Token.BLOCK, withChildren(Token.EXPR_RESULT, nm("x")));
    Node fn = fullFunction("f", body);
    assertFalse(NodeUtil.isVarArgsFunction(fn));
  }

  @Test
  public void testIsVarArgsFunction_NestedFunctionArguments_NotCounted() {
    Node innerBody = withChildren(Token.BLOCK, withChildren(Token.EXPR_RESULT, nm("arguments")));
    Node innerFn = fullFunction("inner", innerBody);
    Node outerBody = withChildren(Token.BLOCK, innerFn);
    Node outerFn = fullFunction("outer", outerBody);
    assertFalse(NodeUtil.isVarArgsFunction(outerFn));
  }

  // =======================================================================
  // isObjectCallMethod / isFunctionObjectCall / isFunctionObjectApply / isSimpleFunctionObjectCall
  // =======================================================================

  @Test
  public void testIsObjectCallMethod() {
    Node getProp = withChildren(Token.GETPROP, nm("obj"), str("foo"));
    Node call = withChildren(Token.CALL, getProp);
    assertTrue(NodeUtil.isObjectCallMethod(call, "foo"));
    assertFalse(NodeUtil.isObjectCallMethod(call, "bar"));
    assertFalse(NodeUtil.isObjectCallMethod(leaf(Token.NEW), "foo"));
  }

  @Test
  public void testIsFunctionObjectCallAndApply() {
    Node getPropCall = withChildren(Token.GETPROP, nm("f"), str("call"));
    Node call = withChildren(Token.CALL, getPropCall);
    assertTrue(NodeUtil.isFunctionObjectCall(call));
    assertFalse(NodeUtil.isFunctionObjectApply(call));

    Node getPropApply = withChildren(Token.GETPROP, nm("f"), str("apply"));
    Node applyCall = withChildren(Token.CALL, getPropApply);
    assertTrue(NodeUtil.isFunctionObjectApply(applyCall));
  }

  @Test
  public void testIsSimpleFunctionObjectCall() {
    Node getPropCall = withChildren(Token.GETPROP, nm("f"), str("call"));
    Node call = withChildren(Token.CALL, getPropCall);
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));

    Node getPropCall2 = withChildren(Token.GETPROP,
        withChildren(Token.GETPROP, nm("obj"), str("f")), str("call"));
    Node call2 = withChildren(Token.CALL, getPropCall2);
    assertFalse(NodeUtil.isSimpleFunctionObjectCall(call2));
  }

  // =======================================================================
  // newExpr / newFunctionNode / newVarNode / newUndefinedNode / newName / newCallNode
  // =======================================================================

  @Test
  public void testNewExpr() {
    Node child = num(1);
    Node expr = NodeUtil.newExpr(child);
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertEquals(child, expr.getFirstChild());
  }

  @Test
  public void testNewFunctionNode() {
    List<Node> params = Arrays.asList(nm("a"), nm("b"));
    Node body = leaf(Token.BLOCK);
    Node fn = NodeUtil.newFunctionNode("foo", params, body, 1, 1);
    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals("foo", fn.getFirstChild().getString());
    Node lp = fn.getFirstChild().getNext();
    assertEquals(Token.LP, lp.getType());
    assertEquals(2, lp.getChildCount());
    assertEquals(body, fn.getLastChild());
  }

  @Test
  public void testNewVarNode_WithValue() {
    Node value = num(5);
    Node var = NodeUtil.newVarNode("x", value);
    assertEquals(Token.VAR, var.getType());
    assertEquals("x", var.getFirstChild().getString());
    assertEquals(value, var.getFirstChild().getFirstChild());
  }

  @Test
  public void testNewVarNode_WithoutValue() {
    Node var = NodeUtil.newVarNode("x", null);
    assertEquals(Token.VAR, var.getType());
    assertEquals("x", var.getFirstChild().getString());
    assertFalse(var.getFirstChild().hasChildren());
  }

  @Test
  public void testNewUndefinedNode() {
    Node undef = NodeUtil.newUndefinedNode(null);
    assertEquals(Token.VOID, undef.getType());
    assertEquals(Token.NUMBER, undef.getFirstChild().getType());
  }

  @Test
  public void testNewName_WithAndWithoutOriginalName() {
    Node basis = nm("orig");
    Node n1 = NodeUtil.newName("bar", basis);
    assertEquals(Token.NAME, n1.getType());
    assertEquals("bar", n1.getString());

    Node n2 = NodeUtil.newName("bar", basis, "origName");
    assertEquals("origName", n2.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testNewCallNode_FreeCall() {
    Node target = nm("foo");
    Node call = NodeUtil.newCallNode(target, num(1), num(2));
    assertTrue(call.getBooleanProp(Node.FREE_CALL));
    assertEquals(2, call.getChildCount() - 1);
  }

  @Test
  public void testNewCallNode_NotFreeCall() {
    Node target = withChildren(Token.GETPROP, nm("obj"), str("m"));
    Node call = NodeUtil.newCallNode(target);
    assertFalse(call.getBooleanProp(Node.FREE_CALL));
  }

  // =======================================================================
  // getAssignedValue / isLhs
  // =======================================================================

  @Test
  public void testGetAssignedValue_VarParent() {
    Node value = num(5);
    Node nameNode = nm("x");
    nameNode.addChildToBack(value);
    Node varNode = withChildren(Token.VAR, nameNode);
    assertEquals(value, NodeUtil.getAssignedValue(nameNode));
  }

  @Test
  public void testGetAssignedValue_AssignParentIsFirstChild() {
    Node nameNode = nm("x");
    Node value = num(5);
    Node assign = withChildren(Token.ASSIGN, nameNode, value);
    assertEquals(value, NodeUtil.getAssignedValue(nameNode));
  }

  @Test
  public void testGetAssignedValue_AssignParentNotFirstChild_Null() {
    Node other = nm("y");
    Node nameNode = nm("x");
    Node assign = withChildren(Token.ASSIGN, other, nameNode);
    assertNull(NodeUtil.getAssignedValue(nameNode));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetAssignedValue_NotName_Throws() {
    NodeUtil.getAssignedValue(str("x"));
  }

  @Test
  public void testIsLhs() {
    Node nameNode = nm("x");
    Node value = num(1);
    Node assign = withChildren(Token.ASSIGN, nameNode, value);
    assertTrue(NodeUtil.isLhs(nameNode, assign));
    assertFalse(NodeUtil.isLhs(value, assign));

    Node nameNode2 = nm("y");
    Node varNode = withChildren(Token.VAR, nameNode2);
    assertTrue(NodeUtil.isLhs(nameNode2, varNode));
  }

  // =======================================================================
  // hasFinally / getCatchBlock / hasCatchHandler / getFnParameters
  // =======================================================================

  @Test
  public void testHasFinally() {
    Node tryNode3 = withChildren(Token.TRY, leaf(Token.BLOCK), leaf(Token.BLOCK), leaf(Token.BLOCK));
    assertTrue(NodeUtil.hasFinally(tryNode3));

    Node tryNode2 = withChildren(Token.TRY, leaf(Token.BLOCK), leaf(Token.BLOCK));
    assertFalse(NodeUtil.hasFinally(tryNode2));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testHasFinally_NotTryNode_Throws() {
    NodeUtil.hasFinally(leaf(Token.BLOCK));
  }

  @Test
  public void testGetCatchBlock() {
    Node first = leaf(Token.BLOCK);
    Node catchBlock = leaf(Token.BLOCK);
    Node tryNode = withChildren(Token.TRY, first, catchBlock);
    assertEquals(catchBlock, NodeUtil.getCatchBlock(tryNode));
  }

  @Test
  public void testHasCatchHandler() {
    Node catchNode = leaf(Token.CATCH);
    Node blockWithCatch = withChildren(Token.BLOCK, catchNode);
    assertTrue(NodeUtil.hasCatchHandler(blockWithCatch));

    Node blockNoCatch = withChildren(Token.BLOCK, leaf(Token.EXPR_RESULT));
    assertFalse(NodeUtil.hasCatchHandler(blockNoCatch));
  }

  @Test
  public void testGetFnParameters() {
    Node body = leaf(Token.BLOCK);
    Node fn = fullFunction("f", body);
    Node params = NodeUtil.getFnParameters(fn);
    assertEquals(Token.LP, params.getType());
  }

  // =======================================================================
  // isConstantName / getSourceName
  // =======================================================================

  @Test
  public void testIsConstantName() {
    Node constName = nm("FOO");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(constName));

    Node normalName = nm("foo");
    assertFalse(NodeUtil.isConstantName(normalName));
  }

  @Test
  public void testGetSourceName_FoundOnAncestor() {
    Node child = leaf(Token.EXPR_RESULT);
    Node parent = withChildren(Token.BLOCK, child);
    parent.putProp(Node.SOURCENAME_PROP, "file.js");
    assertEquals("file.js", NodeUtil.getSourceName(child));
  }

  @Test
  public void testGetSourceName_NotFound_Null() {
    Node n = leaf(Token.EXPR_RESULT);
    assertNull(NodeUtil.getSourceName(n));
  }

  // =======================================================================
  // mayHaveSideEffects / mayEffectMutableState (checkForStateChangeHelper)
  // =======================================================================

  @Test
  public void testMayHaveSideEffects_Throw_True() {
    Node throwNode = withChildren(Token.THROW, leaf(Token.TRUE));
    assertTrue(NodeUtil.mayHaveSideEffects(throwNode));
  }

  @Test
  public void testMayHaveSideEffects_ObjectLit_CheckNewObjectsTrueVsFalse() {
    Node objLit = leaf(Token.OBJECTLIT);
    assertTrue(NodeUtil.mayEffectMutableState(objLit));  // checkForNewObjects = true
    assertFalse(NodeUtil.mayHaveSideEffects(objLit));    // checkForNewObjects = false
  }

  @Test
  public void testMayHaveSideEffects_VarNode() {
    Node nameChild = nm("x");
    Node varWithChild = withChildren(Token.VAR, nameChild);
    assertTrue(NodeUtil.mayHaveSideEffects(varWithChild));

    Node emptyVar = leaf(Token.VAR);
    assertFalse(NodeUtil.mayHaveSideEffects(emptyVar));
  }

  @Test
  public void testMayHaveSideEffects_NameNode() {
    Node nameWithChild = nm("x");
    nameWithChild.addChildToBack(num(5));
    assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));

    Node bareName = nm("x");
    assertFalse(NodeUtil.mayHaveSideEffects(bareName));
  }

  @Test
  public void testMayHaveSideEffects_FunctionExpressionAndDeclaration() {
    Node fnExpr = fullFunction("", leaf(Token.BLOCK));
    Node nameParent = nm("v");
    nameParent.addChildToBack(fnExpr);
    assertFalse(NodeUtil.mayHaveSideEffects(fnExpr));
    assertTrue(NodeUtil.mayEffectMutableState(fnExpr)); // checkForNewObjects=true บังคับ true

    Node fnDecl = fullFunction("f", leaf(Token.BLOCK));
    Node block = withChildren(Token.BLOCK, fnDecl);
    assertTrue(NodeUtil.mayHaveSideEffects(fnDecl));
  }

  @Test
  public void testMayHaveSideEffects_New_Whitelisted_False() {
    Node newNode = withChildren(Token.NEW, nm("Array"), num(3));
    assertFalse(NodeUtil.mayHaveSideEffects(newNode));
  }

  @Test
  public void testMayHaveSideEffects_New_NotWhitelisted_True() {
    Node newNode = withChildren(Token.NEW, nm("Foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(newNode));
  }

  @Test
  public void testMayEffectMutableState_New_AlwaysTrue() {
    Node newNode = withChildren(Token.NEW, nm("Array"));
    assertTrue(NodeUtil.mayEffectMutableState(newNode));
  }

  @Test
  public void testMayHaveSideEffects_Call_Whitelisted_False() {
    Node call = withChildren(Token.CALL, nm("String"));
    assertFalse(NodeUtil.mayHaveSideEffects(call));
  }

  @Test
  public void testMayHaveSideEffects_Call_Unknown_True() {
    Node call = withChildren(Token.CALL, nm("foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(call));
  }

  @Test
  public void testMayHaveSideEffects_Call_MathNamespace_False() {
    Node getProp = withChildren(Token.GETPROP, nm("Math"), str("max"));
    Node call = withChildren(Token.CALL, getProp);
    assertFalse(NodeUtil.mayHaveSideEffects(call));
  }

  @Test
  public void testMay