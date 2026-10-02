package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.common.base.Predicates;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Unit tests for {@link NodeUtil} (Defects4J Closure-86b).
 *
 * NOTE:
 *  - ไม่มี mocking framework ใน classpath ดังนั้นเราจึงสร้าง Node tree จริง
 *    โดยอิงจาก public/package-private API ที่ NodeUtil เองเรียกใช้ในซอร์สโค้ดที่ให้มา
 *  - บางกรณี (เช่น การตั้งค่า FLAG_LOCAL_RESULTS, isNoSideEffectsCall()=true,
 *    CodingConvention, JSDocInfo แบบเจาะจง, AbstractCompiler ของจริง) ไม่มีวิธีตั้งค่าที่
 *    ปลอดภัย/ชัดเจนจากซอร์สที่ให้มา จึง "ข้าม" และคอมเมนต์กำกับไว้ตามข้อกำหนดที่ 4
 */
public class NodeUtilTest {

  // ---------------------------------------------------------------------
  // Helper builders
  // ---------------------------------------------------------------------

  private static Node n(int type, Node... children) {
    if (children.length == 0) {
      return new Node(type);
    }
    Node node = new Node(type, children[0]);
    for (int i = 1; i < children.length; i++) {
      node.addChildToBack(children[i]);
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

  /** function <fnName>(){ body } — โดย body ต้องเป็น BLOCK ที่สร้างแยกไว้ล่วงหน้า */
  private static Node buildFunction(String fnName, Node body) {
    Node nameNode = Node.newString(Token.NAME, fnName);
    Node params = new Node(Token.LP);
    Node fn = new Node(Token.FUNCTION, nameNode);
    fn.addChildToBack(params);
    fn.addChildToBack(body);
    return fn;
  }

  // =====================================================================
  // getExpressionBooleanValue
  // =====================================================================

  @Test
  public void testExprBooleanValue_AssignComma() {
    Node assign = n(Token.ASSIGN, name("x"), n(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(assign));

    Node comma = n(Token.COMMA, num(1), n(Token.FALSE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(comma));
  }

  @Test
  public void testExprBooleanValue_Not() {
    Node not = n(Token.NOT, n(Token.TRUE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(not));
  }

  @Test
  public void testExprBooleanValue_AndOr() {
    Node and = n(Token.AND, n(Token.TRUE), n(Token.FALSE));
    assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(and));

    Node or = n(Token.OR, n(Token.TRUE), n(Token.FALSE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(or));
  }

  @Test
  public void testExprBooleanValue_HookEqualBranches() {
    Node hook = n(Token.HOOK, name("c"), n(Token.TRUE), n(Token.TRUE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(hook));
  }

  @Test
  public void testExprBooleanValue_HookDifferentBranches() {
    Node hook = n(Token.HOOK, name("c"), n(Token.TRUE), n(Token.FALSE));
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hook));
  }

  @Test
  public void testExprBooleanValue_DefaultDelegatesToGetBooleanValue() {
    Node strNode = str("hi");
    assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(strNode));
  }

  // =====================================================================
  // getBooleanValue
  // =====================================================================

  @Test
  public void testGetBooleanValue_String() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(str("abc")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(str("")));
  }

  @Test
  public void testGetBooleanValue_Number() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(num(5)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(num(0)));
  }

  @Test
  public void testGetBooleanValue_NullFalseVoid() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n(Token.NULL)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n(Token.FALSE)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n(Token.VOID, num(0))));
  }

  @Test
  public void testGetBooleanValue_NameSpecialCases() {
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(name("undefined")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(name("NaN")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(name("Infinity")));
    // ไม่ match keyword พิเศษ -> break -> fall through -> UNKNOWN
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(name("foo")));
  }

  @Test
  public void testGetBooleanValue_TrueLiterals() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(n(Token.TRUE)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(n(Token.ARRAYLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(n(Token.OBJECTLIT)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(n(Token.REGEXP)));
  }

  @Test
  public void testGetBooleanValue_DefaultUnknown() {
    assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(n(Token.THIS)));
  }

  // =====================================================================
  // getStringValue
  // =====================================================================

  @Test
  public void testGetStringValue_String() {
    assertEquals("abc", NodeUtil.getStringValue(str("abc")));
  }

  @Test
  public void testGetStringValue_NameSpecialAndOther() {
    assertEquals("undefined", NodeUtil.getStringValue(name("undefined")));
    assertEquals("Infinity", NodeUtil.getStringValue(name("Infinity")));
    assertEquals("NaN", NodeUtil.getStringValue(name("NaN")));
    assertNull(NodeUtil.getStringValue(name("foo"))); // break -> falls to return null
  }

  @Test
  public void testGetStringValue_NumberIntegerVsFraction() {
    assertEquals("1", NodeUtil.getStringValue(num(1.0)));
    assertEquals(Double.toString(1.5), NodeUtil.getStringValue(num(1.5)));
  }

  @Test
  public void testGetStringValue_TrueFalseNull() {
    assertEquals(Node.tokenToName(Token.TRUE), NodeUtil.getStringValue(n(Token.TRUE)));
    assertEquals(Node.tokenToName(Token.FALSE), NodeUtil.getStringValue(n(Token.FALSE)));
    assertEquals(Node.tokenToName(Token.NULL), NodeUtil.getStringValue(n(Token.NULL)));
  }

  @Test
  public void testGetStringValue_Void() {
    assertEquals("undefined", NodeUtil.getStringValue(n(Token.VOID, num(0))));
  }

  @Test
  public void testGetStringValue_DefaultNull() {
    assertNull(NodeUtil.getStringValue(n(Token.THIS)));
  }

  // =====================================================================
  // getNumberValue
  // =====================================================================

  @Test
  public void testGetNumberValue_TrueFalseNull() {
    assertEquals(1.0, NodeUtil.getNumberValue(n(Token.TRUE)), 0);
    assertEquals(0.0, NodeUtil.getNumberValue(n(Token.FALSE)), 0);
    assertEquals(0.0, NodeUtil.getNumberValue(n(Token.NULL)), 0);
  }

  @Test
  public void testGetNumberValue_Number() {
    assertEquals(3.14, NodeUtil.getNumberValue(num(3.14)), 0);
  }

  @Test
  public void testGetNumberValue_Void() {
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(n(Token.VOID, num(0)))));
  }

  @Test
  public void testGetNumberValue_Name() {
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(name("undefined"))));
    assertTrue(Double.isNaN(NodeUtil.getNumberValue(name("NaN"))));
    assertEquals(Double.POSITIVE_INFINITY, NodeUtil.getNumberValue(name("Infinity")), 0);
    assertNull(NodeUtil.getNumberValue(name("foo")));
  }

  @Test
  public void testGetNumberValue_Default() {
    assertNull(NodeUtil.getNumberValue(n(Token.THIS)));
  }

  // =====================================================================
  // getFunctionName / getNearestFunctionName
  // =====================================================================

  @Test
  public void testGetFunctionName_ParentName() {
    Node fn = buildFunction("", n(Token.BLOCK));
    Node varName = name("myVar");
    varName.addChildToBack(fn);
    assertEquals("myVar", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_ParentAssign() {
    Node fn = buildFunction("", n(Token.BLOCK));
    Node target = name("obj"); // simple qualified name
    n(Token.ASSIGN, target, fn); // links target->fn as siblings under ASSIGN
    assertEquals("obj", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_DefaultWithName() {
    Node fn = buildFunction("myFunc", n(Token.BLOCK));
    n(Token.BLOCK, fn); // parent is BLOCK (not NAME/ASSIGN)
    assertEquals("myFunc", NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetFunctionName_DefaultNoName() {
    Node fn = buildFunction("", n(Token.BLOCK));
    n(Token.BLOCK, fn);
    assertNull(NodeUtil.getFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_FallbackToStringKey() {
    Node fn = buildFunction("", n(Token.BLOCK));
    Node key = str("myKey");
    key.addChildToBack(fn); // { 'myKey': function(){} }
    assertEquals("myKey", NodeUtil.getNearestFunctionName(fn));
  }

  @Test
  public void testGetNearestFunctionName_NullWhenNoNameNoStringParent() {
    Node fn = buildFunction("", n(Token.BLOCK));
    n(Token.BLOCK, fn);
    assertNull(NodeUtil.getNearestFunctionName(fn));
  }

  // =====================================================================
  // isImmutableValue
  // =====================================================================

  @Test
  public void testIsImmutableValue_Literals() {
    assertTrue(NodeUtil.isImmutableValue(str("x")));
    assertTrue(NodeUtil.isImmutableValue(num(1)));
    assertTrue(NodeUtil.isImmutableValue(n(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(n(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(n(Token.FALSE)));
  }

  @Test
  public void testIsImmutableValue_VoidNegRecursive() {
    assertTrue(NodeUtil.isImmutableValue(n(Token.VOID, num(0))));
    assertTrue(NodeUtil.isImmutableValue(n(Token.NEG, num(1))));
    assertFalse(NodeUtil.isImmutableValue(n(Token.NEG, name("x"))));
  }

  @Test
  public void testIsImmutableValue_NameSpecial() {
    assertTrue(NodeUtil.isImmutableValue(name("undefined")));
    assertTrue(NodeUtil.isImmutableValue(name("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(name("NaN")));
    assertFalse(NodeUtil.isImmutableValue(name("foo")));
  }

  @Test
  public void testIsImmutableValue_Default() {
    assertFalse(NodeUtil.isImmutableValue(n(Token.THIS)));
  }

  // =====================================================================
  // isLiteralValue
  // =====================================================================

  @Test
  public void testIsLiteralValue_ArrayLitAllConst() {
    Node arr = n(Token.ARRAYLIT, num(1), str("a"));
    assertTrue(NodeUtil.isLiteralValue(arr, false));
  }

  @Test
  public void testIsLiteralValue_ArrayLitOneNonConst() {
    Node arr = n(Token.ARRAYLIT, num(1), name("x"));
    assertFalse(NodeUtil.isLiteralValue(arr, false));
  }

  @Test
  public void testIsLiteralValue_ObjectLit() {
    Node key1 = str("k1");
    key1.addChildToBack(num(1));
    Node obj = n(Token.OBJECTLIT, key1);
    assertTrue(NodeUtil.isLiteralValue(obj, false));

    Node key2 = str("k2");
    key2.addChildToBack(name("x"));
    Node obj2 = n(Token.OBJECTLIT, key2);
    assertFalse(NodeUtil.isLiteralValue(obj2, false));
  }

  @Test
  public void testIsLiteralValue_FunctionIncludeFlag() {
    Node exprFn = buildFunction("", n(Token.BLOCK));
    n(Token.ASSIGN, name("x"), exprFn); // makes it a function expression
    assertTrue(NodeUtil.isLiteralValue(exprFn, true));
    assertFalse(NodeUtil.isLiteralValue(exprFn, false));
  }

  @Test
  public void testIsLiteralValue_DefaultDelegates() {
    assertTrue(NodeUtil.isLiteralValue(num(1), false));
    assertFalse(NodeUtil.isLiteralValue(n(Token.THIS), false));
  }

  // =====================================================================
  // isValidDefineValue
  // =====================================================================

  @Test
  public void testIsValidDefineValue_SimpleLiterals() {
    Set<String> defines = new HashSet<String>();
    assertTrue(NodeUtil.isValidDefineValue(str("x"), defines));
    assertTrue(NodeUtil.isValidDefineValue(num(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(n(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(n(Token.FALSE), defines));
  }

  @Test
  public void testIsValidDefineValue_BinaryOperator() {
    Set<String> defines = new HashSet<String>();
    Node add = n(Token.ADD, num(1), num(2));
    assertTrue(NodeUtil.isValidDefineValue(add, defines));

    Node addInvalid = n(Token.ADD, num(1), name("x"));
    assertFalse(NodeUtil.isValidDefineValue(addInvalid, defines));
  }

  @Test
  public void testIsValidDefineValue_UnaryOperator() {
    Set<String> defines = new HashSet<String>();
    Node not = n(Token.NOT, n(Token.TRUE));
    assertTrue(NodeUtil.isValidDefineValue(not, defines));
  }

  @Test
  public void testIsValidDefineValue_NameQualified() {
    Set<String> defines = new HashSet<String>(Arrays.asList("FOO"));
    assertTrue(NodeUtil.isValidDefineValue(name("FOO"), defines));
    assertFalse(NodeUtil.isValidDefineValue(name("BAR"), defines));
  }

  @Test
  public void testIsValidDefineValue_DefaultFalse() {
    Set<String> defines = new HashSet<String>();
    assertFalse(NodeUtil.isValidDefineValue(n(Token.THIS), defines));
  }

  // =====================================================================
  // isEmptyBlock
  // =====================================================================

  @Test
  public void testIsEmptyBlock_NotBlockType() {
    assertFalse(NodeUtil.isEmptyBlock(n(Token.IF)));
  }

  @Test
  public void testIsEmptyBlock_EmptyChildren() {
    Node block = n(Token.BLOCK, n(Token.EMPTY), n(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(block));
  }

  @Test
  public void testIsEmptyBlock_NonEmptyChild() {
    Node block = n(Token.BLOCK, n(Token.EMPTY), str("x"));
    assertFalse(NodeUtil.isEmptyBlock(block));
  }

  @Test
  public void testIsEmptyBlock_NoChildren() {
    Node block = new Node(Token.BLOCK);
    assertTrue(NodeUtil.isEmptyBlock(block));
  }

  // =====================================================================
  // isSimpleOperator(Type)
  // =====================================================================

  @Test
  public void testIsSimpleOperator() {
    assertTrue(NodeUtil.isSimpleOperator(n(Token.ADD, num(1), num(2))));
    assertFalse(NodeUtil.isSimpleOperator(n(Token.IF)));
  }

  // =====================================================================
  // precedence
  // =====================================================================

  @Test
  public void testPrecedence_Groups() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(4, NodeUtil.precedence(Token.AND));
    assertEquals(8, NodeUtil.precedence(Token.EQ));
    assertEquals(9, NodeUtil.precedence(Token.LT));
    assertEquals(11, NodeUtil.precedence(Token.ADD));
    assertEquals(12, NodeUtil.precedence(Token.MUL));
    assertEquals(13, NodeUtil.precedence(Token.NEG));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_UnknownThrows() {
    NodeUtil.precedence(Token.BLOCK);
  }

  // =====================================================================
  // isAssociative / isCommutative
  // =====================================================================

  @Test
  public void testIsAssociative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
  }

  @Test
  public void testIsCommutative() {
    assertTrue(NodeUtil.isCommutative(Token.BITAND));
    assertFalse(NodeUtil.isCommutative(Token.ADD));
  }

  // =====================================================================
  // isAssignmentOp / getOpFromAssignmentOp
  // =====================================================================

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(n(Token.ASSIGN_ADD, name("x"), num(1))));
    assertFalse(NodeUtil.isAssignmentOp(n(Token.ADD, num(1), num(2))));
  }

  @Test
  public void testGetOpFromAssignmentOp() {
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(n(Token.ASSIGN_ADD)));
    assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(n(Token.ASSIGN_BITOR)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_Invalid() {
    NodeUtil.getOpFromAssignmentOp(n(Token.ADD));
  }

  // =====================================================================
  // isExpressionNode / containsFunction / referencesThis
  // =====================================================================

  @Test
  public void testIsExpressionNode() {
    assertTrue(NodeUtil.isExpressionNode(n(Token.EXPR_RESULT, num(1))));
    assertFalse(NodeUtil.isExpressionNode(n(Token.BLOCK)));
  }

  @Test
  public void testContainsFunction() {
    Node fn = buildFunction("", n(Token.BLOCK));
    Node block = n(Token.BLOCK, fn);
    assertTrue(NodeUtil.containsFunction(block));
    assertFalse(NodeUtil.containsFunction(n(Token.BLOCK, num(1))));
  }

  @Test
  public void testReferencesThis_StopsAtFunctionBoundary() {
    Node outerThis = n(Token.THIS);
    Node outerBlock = n(Token.BLOCK, outerThis);
    assertTrue(NodeUtil.referencesThis(outerBlock));

    // THIS ที่อยู่ "ภายใน" ฟังก์ชันย่อยไม่ถูกนับ (MatchNotFunction หยุดการ recurse)
    Node innerThis = n(Token.THIS);
    Node innerBody = n(Token.BLOCK, innerThis);
    Node fn = buildFunction("", innerBody);
    Node outer2 = n(Token.BLOCK, fn);
    assertFalse(NodeUtil.referencesThis(outer2));
  }

  // =====================================================================
  // isGet / isGetProp / isName / isNew / isVar / isVarDeclaration
  // =====================================================================

  @Test
  public void testTypeCheckers() {
    Node getProp = n(Token.GETPROP, name("a"), str("b"));
    Node getElem = n(Token.GETELEM, name("a"), num(0));
    assertTrue(NodeUtil.isGet(getProp));
    assertTrue(NodeUtil.isGet(getElem));
    assertTrue(NodeUtil.isGetProp(getProp));
    assertFalse(NodeUtil.isGetProp(getElem));
    assertTrue(NodeUtil.isName(name("x")));
    assertTrue(NodeUtil.isNew(n(Token.NEW, name("Foo"))));
    assertTrue(NodeUtil.isVar(n(Token.VAR, name("x"))));
  }

  @Test
  public void testIsVarDeclaration() {
    Node nameNode = name("x");
    n(Token.VAR, nameNode);
    assertTrue(NodeUtil.isVarDeclaration(nameNode));

    Node nameNode2 = name("y");
    n(Token.BLOCK, nameNode2);
    assertFalse(NodeUtil.isVarDeclaration(nameNode2));
  }

  // =====================================================================
  // getAssignedValue
  // =====================================================================

  @Test
  public void testGetAssignedValue_VarParent() {
    Node value = num(5);
    Node nameNode = name("x");
    nameNode.addChildToBack(value);
    n(Token.VAR, nameNode);
    assertSame(value, NodeUtil.getAssignedValue(nameNode));
  }

  @Test
  public void testGetAssignedValue_AssignParentFirstChild() {
    Node value = num(5);
    Node target = name("x");
    n(Token.ASSIGN, target, value);
    assertSame(value, NodeUtil.getAssignedValue(target));
  }

  @Test
  public void testGetAssignedValue_NotFirstChildOrOtherParent() {
    // parent เป็น ASSIGN แต่ n ไม่ใช่ firstChild -> else -> null
    Node value = num(5);
    Node target = name("x");
    Node assign = n(Token.ASSIGN, target, value);
    assertNull(NodeUtil.getAssignedValue(value)); // value ไม่ใช่ NAME -> ก็ fail precondition จริงๆ
  }

  // =====================================================================
  // isString / isExprAssign / isAssign / isExprCall
  // =====================================================================

  @Test
  public void testIsStringAssignCall() {
    assertTrue(NodeUtil.isString(str("x")));
    Node exprAssign = n(Token.EXPR_RESULT, n(Token.ASSIGN, name("x"), num(1)));
    assertTrue(NodeUtil.isExprAssign(exprAssign));
    assertFalse(NodeUtil.isExprAssign(n(Token.EXPR_RESULT, num(1))));

    Node exprCall = n(Token.EXPR_RESULT, n(Token.CALL, name("f")));
    assertTrue(NodeUtil.isExprCall(exprCall));
    assertFalse(NodeUtil.isExprCall(n(Token.EXPR_RESULT, num(1))));
  }

  // =====================================================================
  // isForIn / isLoopStructure / getLoopCodeBlock
  // =====================================================================

  @Test
  public void testIsForIn() {
    Node forIn = n(Token.FOR, name("x"), name("obj"), n(Token.BLOCK));
    assertTrue(NodeUtil.isForIn(forIn));

    Node forClassic = n(Token.FOR, n(Token.EMPTY), n(Token.EMPTY), n(Token.EMPTY), n(Token.BLOCK));
    assertFalse(NodeUtil.isForIn(forClassic));
  }

  @Test
  public void testIsLoopStructure() {
    assertTrue(NodeUtil.isLoopStructure(n(Token.FOR)));
    assertTrue(NodeUtil.isLoopStructure(n(Token.DO)));
    assertTrue(NodeUtil.isLoopStructure(n(Token.WHILE)));
    assertFalse(NodeUtil.isLoopStructure(n(Token.IF)));
  }

  @Test
  public void testGetLoopCodeBlock() {
    Node body = n(Token.BLOCK);
    Node forNode = n(Token.FOR, n(Token.EMPTY), n(Token.EMPTY), n(Token.EMPTY), body);
    assertSame(body, NodeUtil.getLoopCodeBlock(forNode));

    Node whileBody = n(Token.BLOCK);
    Node whileNode = n(Token.WHILE, name("c"), whileBody);
    assertSame(whileBody, NodeUtil.getLoopCodeBlock(whileNode));

    Node doBody = n(Token.BLOCK);
    Node doNode = n(Token.DO, doBody, name("c"));
    assertSame(doBody, NodeUtil.getLoopCodeBlock(doNode));

    assertNull(NodeUtil.getLoopCodeBlock(n(Token.IF)));
  }

  // =====================================================================
  // isControlStructure / isControlStructureCodeBlock
  // =====================================================================

  @Test
  public void testIsControlStructure() {
    assertTrue(NodeUtil.isControlStructure(n(Token.FOR)));
    assertTrue(NodeUtil.isControlStructure(n(Token.IF)));
    assertTrue(NodeUtil.isControlStructure(n(Token.SWITCH)));
    assertFalse(NodeUtil.isControlStructure(n(Token.BLOCK)));
  }

  @Test
  public void testIsControlStructureCodeBlock_Various() {
    Node body = n(Token.BLOCK);
    Node forNode = n(Token.FOR, n(Token.EMPTY), n(Token.EMPTY), n(Token.EMPTY), body);
    assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, body));

    Node doBody = n(Token.BLOCK);
    Node doNode = n(Token.DO, doBody, name("c"));
    assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, doBody));

    Node cond = name("c");
    Node thenBlock = n(Token.BLOCK);
    Node ifNode = n(Token.IF, cond, thenBlock);
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, cond)); // firstChild == n -> false
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, thenBlock));

    Node tryBlock = n(Token.BLOCK);
    Node catchBlock = n(Token.BLOCK);
    Node finallyBlock = n(Token.BLOCK);
    Node tryNode = n(Token.TRY, tryBlock, catchBlock, finallyBlock);
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, tryBlock));
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, finallyBlock));
    assertFalse(NodeUtil.isControlStructureCodeBlock(tryNode, catchBlock));

    Node defaultNode = n(Token.DEFAULT, n(Token.BLOCK));
    assertTrue(NodeUtil.isControlStructureCodeBlock(defaultNode, defaultNode.getFirstChild()));
  }

  // =====================================================================
  // getConditionExpression
  // =====================================================================

  @Test
  public void testGetConditionExpression_IfWhileDo() {
    Node cond = name("c");
    Node ifNode = n(Token.IF, cond, n(Token.BLOCK));
    assertSame(cond, NodeUtil.getConditionExpression(ifNode));

    Node whileCond = name("c2");
    Node whileNode = n(Token.WHILE, whileCond, n(Token.BLOCK));
    assertSame(whileCond, NodeUtil.getConditionExpression(whileNode));

    Node doCond = name("c3");
    Node doNode = n(Token.DO, n(Token.BLOCK), doCond);
    assertSame(doCond, NodeUtil.getConditionExpression(doNode));
  }

  @Test
  public void testGetConditionExpression_ForInAndClassic() {
    Node forIn = n(Token.FOR, name("x"), name("obj"), n(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(forIn));

    Node cond = name("cond");
    Node forClassic = n(Token.FOR, n(Token.EMPTY), cond, n(Token.EMPTY), n(Token.BLOCK));
    assertSame(cond, NodeUtil.getConditionExpression(forClassic));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_ForMalformed() {
    Node forBad = n(Token.FOR, n(Token.EMPTY), n(Token.EMPTY));
    NodeUtil.getConditionExpression(forBad);
  }

  @Test
  public void testGetConditionExpression_Case() {
    assertNull(NodeUtil.getConditionExpression(n(Token.CASE, num(1))));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_DefaultThrows() {
    NodeUtil.getConditionExpression(n(Token.BLOCK));
  }

  // =====================================================================
  // isStatementBlock / isStatement / isSwitchCase
  // =====================================================================

  @Test
  public void testIsStatementBlock() {
    assertTrue(NodeUtil.isStatementBlock(n(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(n(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(n(Token.IF)));
  }

  @Test
  public void testIsStatement_True() {
    Node stmt = num(1);
    n(Token.BLOCK, stmt);
    assertTrue(NodeUtil.isStatement(stmt));
  }

  @Test
  public void testIsStatement_False() {
    Node target = name("x");
    n(Token.ASSIGN, target, num(1));
    assertFalse(NodeUtil.isStatement(target));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsStatement_NullParentThrows() {
    Node orphan = num(1);
    NodeUtil.isStatement(orphan);
  }

  @Test
  public void testIsSwitchCase() {
    assertTrue(NodeUtil.isSwitchCase(n(Token.CASE, num(1))));
    assertTrue(NodeUtil.isSwitchCase(n(Token.DEFAULT)));
    assertFalse(NodeUtil.isSwitchCase(n(Token.BLOCK)));
  }

  // =====================================================================
  // isReferenceName / isLabelName / isTryFinallyNode
  // =====================================================================

  @Test
  public void testIsReferenceName() {
    assertTrue(NodeUtil.isReferenceName(name("x")));
    assertFalse(NodeUtil.isReferenceName(name("")));
    assertFalse(NodeUtil.isReferenceName(str("x")));
  }

  @Test
  public void testIsLabelName() {
    assertTrue(NodeUtil.isLabelName(n(Token.LABEL_NAME)));
    assertFalse(NodeUtil.isLabelName(null));
    assertFalse(NodeUtil.isLabelName(n(Token.NAME)));
  }

  @Test
  public void testIsTryFinallyNode() {
    Node tryBlock = n(Token.BLOCK);
    Node catchBlock = n(Token.BLOCK);
    Node finallyBlock = n(Token.BLOCK);
    Node tryNode = n(Token.TRY, tryBlock, catchBlock, finallyBlock);
    assertTrue(NodeUtil.isTryFinallyNode(tryNode, finallyBlock));
    assertFalse(NodeUtil.isTryFinallyNode(tryNode, catchBlock));
  }

  // =====================================================================
  // removeChild
  // =====================================================================

  @Test
  public void testRemoveChild_StatementBlock() {
    Node stmt = n(Token.EXPR_RESULT, num(1));
    Node block = n(Token.BLOCK, stmt);
    NodeUtil.removeChild(block, stmt);
    assertFalse(block.hasChildren());
  }

  @Test
  public void testRemoveChild_SwitchCase() {
    Node caseNode = n(Token.CASE, num(1), n(Token.BLOCK));
    Node switchNode = n(Token.SWITCH, name("x"), caseNode);
    NodeUtil.removeChild(switchNode, caseNode);
    assertFalse(NodeUtil.isNameReferenced(switchNode, "__never__")); // sanity: no crash
  }

  @Test
  public void testRemoveChild_TryFinally() {
    Node tryBlock = n(Token.BLOCK);
    Node catchBlock = n(Token.BLOCK);
    Node finallyBlock = n(Token.BLOCK);
    Node tryNode = n(Token.TRY, tryBlock, catchBlock, finallyBlock);
    NodeUtil.removeChild(tryNode, finallyBlock);
    assertEquals(2, tryNode.getChildCount());
  }

  @Test
  public void testRemoveChild_VarMultipleChildren() {
    Node a = name("a");
    Node b = name("b");
    Node var = n(Token.VAR, a, b);
    NodeUtil.removeChild(var, a);
    assertEquals(1, var.getChildCount());
  }

  @Test
  public void testRemoveChild_VarSingleChild_CascadesRemoveVar() {
    Node a = name("a");
    Node var = n(Token.VAR, a);
    Node block = n(Token.BLOCK, var);
    NodeUtil.removeChild(var, a);
    assertFalse(block.hasChildren());
  }

  @Test
  public void testRemoveChild_BlockNodeDetachesChildren() {
    Node innerBlock = n(Token.BLOCK, str("x"), str("y"));
    Node ifNode = n(Token.IF, name("c"), innerBlock);
    NodeUtil.removeChild(ifNode, innerBlock);
    assertFalse(innerBlock.hasChildren());
  }

  @Test
  public void testRemoveChild_LabelLastChild_Cascades() {
    Node labelName = n(Token.LABEL_NAME);
    Node stmt = n(Token.BLOCK);
    Node label = n(Token.LABEL, labelName, stmt);
    Node outer = n(Token.BLOCK, label);
    NodeUtil.removeChild(label, stmt);
    assertFalse(outer.hasChildren());
  }

  @Test
  public void testRemoveChild_ForFourChildrenReplacesWithEmpty() {
    Node init = n(Token.EMPTY);
    Node cond = name("c");
    Node incr = n(Token.EMPTY);
    Node body = n(Token.BLOCK);
    Node forNode = n(Token.FOR, init, cond, incr, body);
    NodeUtil.removeChild(forNode, cond);
    assertEquals(Token.EMPTY, forNode.getFirstChild().getNext().getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveChild_InvalidThrows() {
    // สร้างสถานการณ์สังเคราะห์ (ไม่ตรง branch ใดๆ) เพื่อ hit else -> throw
    Node parent = num(1);
    Node child = num(2);
    parent.addChildToBack(child);
    NodeUtil.removeChild(parent, child);
  }

  // =====================================================================
  // tryMergeBlock
  // =====================================================================

  @Test
  public void testTryMergeBlock_Success() {
    Node inner = n(Token.BLOCK, str("a"), str("b"));
    Node outer = n(Token.BLOCK, inner);
    boolean result = NodeUtil.tryMergeBlock(inner);
    assertTrue(result);
    assertEquals(2, outer.getChildCount());
  }

  @Test
  public void testTryMergeBlock_FailWhenParentNotBlock() {
    Node inner = n(Token.BLOCK, str("a"));
    n(Token.IF, name("c"), inner);
    assertFalse(NodeUtil.tryMergeBlock(inner));
  }

  // =====================================================================
  // isCall / isCallOrNew / isFunction / getFunctionBody / isThis / containsCall
  // =====================================================================

  @Test
  public void testCallNewFunctionThis() {
    Node call = n(Token.CALL, name("f"));
    Node newNode = n(Token.NEW, name("F"));
    assertTrue(NodeUtil.isCall(call));
    assertTrue(NodeUtil.isCallOrNew(call));
    assertTrue(NodeUtil.isCallOrNew(newNode));
    assertFalse(NodeUtil.isCall(newNode));

    Node body = n(Token.BLOCK);
    Node fn = buildFunction("f", body);
    assertTrue(NodeUtil.isFunction(fn));
    assertSame(body, NodeUtil.getFunctionBody(fn));

    assertTrue(NodeUtil.isThis(n(Token.THIS)));
    assertTrue(NodeUtil.containsCall(n(Token.BLOCK, call)));
    assertFalse(NodeUtil.containsCall(n(Token.BLOCK, num(1))));
  }

  // =====================================================================
  // isFunctionDeclaration / isHoistedFunctionDeclaration / isFunctionExpression
  // =====================================================================

  @Test
  public void testIsFunctionDeclarationVsExpression() {
    Node declFn = buildFunction("foo", n(Token.BLOCK));
    n(Token.BLOCK, declFn); // statement position
    assertTrue(NodeUtil.isFunctionDeclaration(declFn));
    assertFalse(NodeUtil.isFunctionExpression(declFn));

    Node exprFn = buildFunction("bar", n(Token.BLOCK));
    n(Token.ASSIGN, name("x"), exprFn); // expression position
    assertFalse(NodeUtil.isFunctionDeclaration(exprFn));
    assertTrue(NodeUtil.isFunctionExpression(exprFn));
  }

  @Test
  public void testIsHoistedFunctionDeclaration_ScriptParent() {
    Node declFn = buildFunction("foo", n(Token.BLOCK));
    n(Token.SCRIPT, declFn);
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(declFn));
  }

  @Test
  public void testIsHoistedFunctionDeclaration_NestedInFunction() {
    Node declFn = buildFunction("inner", n(Token.BLOCK));
    Node outerBody = n(Token.BLOCK, declFn);
    buildFunctionWithGivenBody("outer", outerBody);
    assertTrue(NodeUtil.isHoistedFunctionDeclaration(declFn));
  }

  private static Node buildFunctionWithGivenBody(String name, Node body) {
    Node nameNode = Node.newString(Token.NAME, name);
    Node params = new Node(Token.LP);
    Node fn = new Node(Token.FUNCTION, nameNode);
    fn.addChildToBack(params);
    fn.addChildToBack(body); // body.getParent() == fn
    return fn;
  }

  @Test
  public void testIsHoistedFunctionDeclaration_NotHoisted() {
    Node declFn = buildFunction("foo", n(Token.BLOCK));
    Node block = n(Token.BLOCK, declFn);
    n(Token.BLOCK, block); // outer parent เป็น BLOCK ไม่ใช่ FUNCTION/SCRIPT
    assertFalse(NodeUtil.isHoistedFunctionDeclaration(declFn));
  }

  @Test
  public void testIsEmptyFunctionExpression() {
    Node emptyBody = n(Token.BLOCK);
    Node exprFn = buildFunction("f", emptyBody);
    n(Token.ASSIGN, name("x"), exprFn);
    assertTrue(NodeUtil.isEmptyFunctionExpression(exprFn));

    Node nonEmptyBody = n(Token.BLOCK, str("x"));
    Node exprFn2 = buildFunction("f2", nonEmptyBody);
    n(Token.ASSIGN, name("y"), exprFn2);
    assertFalse(NodeUtil.isEmptyFunctionExpression(exprFn2));
  }

  @Test
  public void testIsVarArgsFunction() {
    Node bodyWithArgs = n(Token.BLOCK, name("arguments"));
    Node fnWithArgs = buildFunction("f", bodyWithArgs);
    assertTrue(NodeUtil.isVarArgsFunction(fnWithArgs));

    Node bodyNoArgs = n(Token.BLOCK, name("x"));
    Node fnNoArgs = buildFunction("g", bodyNoArgs);
    assertFalse(NodeUtil.isVarArgsFunction(fnNoArgs));
  }

  // =====================================================================
  // isObjectCallMethod / FunctionObjectCall / Apply / CallOrApply / Simple
  // =====================================================================

  @Test
  public void testIsObjectCallMethod() {
    Node getProp = n(Token.GETPROP, name("obj"), str("call"));
    Node call = n(Token.CALL, getProp);
    assertTrue(NodeUtil.isObjectCallMethod(call, "call"));
    assertFalse(NodeUtil.isObjectCallMethod(call, "apply"));
    assertFalse(NodeUtil.isObjectCallMethod(n(Token.CALL, name("f")), "call"));
  }

  @Test
  public void testFunctionObjectCallApply() {
    Node getPropCall = n(Token.GETPROP, name("obj"), str("call"));
    Node callCall = n(Token.CALL, getPropCall);
    assertTrue(NodeUtil.isFunctionObjectCall(callCall));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(callCall));

    Node getPropApply = n(Token.GETPROP, name("obj"), str("apply"));
    Node callApply = n(Token.CALL, getPropApply);
    assertTrue(NodeUtil.isFunctionObjectApply(callApply));
    assertTrue(NodeUtil.isFunctionObjectCallOrApply(callApply));

    assertFalse(NodeUtil.isFunctionObjectCallOrApply(n(Token.CALL, name("f"))));
  }

  @Test
  public void testIsSimpleFunctionObjectCall() {
    Node getPropCall = n(Token.GETPROP, name("obj"), str("call"));
    Node callCall = n(Token.CALL, getPropCall);
    assertTrue(NodeUtil.isSimpleFunctionObjectCall(callCall));

    Node getPropCall2 = n(Token.GETPROP, n(Token.THIS), str("call"));
    Node callCall2 = n(Token.CALL, getPropCall2);
    assertFalse(NodeUtil.isSimpleFunctionObjectCall(callCall2));
  }

  // =====================================================================
  // isLhs / isObjectLitKey / isGetOrSetKey
  // =====================================================================

  @Test
  public void testIsLhs() {
    Node target = name("x");
    Node assign = n(Token.ASSIGN, target, num(1));
    assertTrue(NodeUtil.isLhs(target, assign));

    Node var = n(Token.VAR, name("y"));
    assertTrue(NodeUtil.isLhs(var.getFirstChild(), var));

    assertFalse(NodeUtil.isLhs(name("z"), n(Token.BLOCK)));
  }

  @Test
  public void testIsObjectLitKey() {
    Node objLit = n(Token.OBJECTLIT, str("a"));
    assertTrue(NodeUtil.isObjectLitKey(objLit.getFirstChild(), objLit));
    assertTrue(NodeUtil.isObjectLitKey(n(Token.GET), n(Token.OBJECTLIT)));
    assertFalse(NodeUtil.isObjectLitKey(n(Token.THIS), objLit));
  }

  @Test
  public void testIsGetOrSetKey() {
    assertTrue(NodeUtil.isGetOrSetKey(n(Token.GET)));
    assertTrue(NodeUtil.isGetOrSetKey(n(Token.SET)));
    assertFalse(NodeUtil.isGetOrSetKey(n(Token.STRING)));
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
  public void testOpToStrNoFail_UnknownThrows() {
    NodeUtil.opToStrNoFail(Token.BLOCK);
  }

  // =====================================================================
  // containsType / getVarsDeclaredInBranch
  // =====================================================================

  @Test
  public void testContainsType() {
    Node block = n(Token.BLOCK, num(1), str("x"));
    assertTrue(NodeUtil.containsType(block, Token.STRING));
    assertFalse(NodeUtil.containsType(block, Token.CALL));
  }

  @Test
  public void testGetVarsDeclaredInBranch() {
    Node varA = n(Token.VAR, name("a"));
    Node varB = n(Token.VAR, name("b"));
    Node varADup = n(Token.VAR, name("a"));
    Node innerVarDecl = n(Token.VAR, name("innerVar"));
    Node fnBody = n(Token.BLOCK, innerVarDecl);
    Node fn = buildFunction("", fnBody);

    Node root = n(Token.BLOCK, varA, varB, varADup, fn);
    Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
    assertEquals(2, vars.size()); // "a"(once) + "b"; innerVar excluded (inside FUNCTION scope)
  }

  // =====================================================================
  // isPrototypePropertyDeclaration / isPrototypeProperty / getPrototypeClassName / getPrototypePropertyName
  // =====================================================================

  @Test
  public void testPrototypeHelpers() {
    // obj.prototype.method = function(){}
    Node objName = name("obj");
    Node protoStr = str("prototype");
    Node getPropProto = n(Token.GETPROP, objName, protoStr);
    Node methodStr = str("method");
    Node getPropMethod = n(Token.GETPROP, getPropProto, methodStr);

    Node fn = buildFunction("", n(Token.BLOCK));
    Node assign = n(Token.ASSIGN, getPropMethod, fn);
    Node exprAssign = n(Token.EXPR_RESULT, assign);

    assertTrue(NodeUtil.isPrototypeProperty(getPropMethod));
    assertTrue(NodeUtil.isPrototypePropertyDeclaration(exprAssign));
    assertSame(objName, NodeUtil.getPrototypeClassName(getPropMethod));
    assertEquals("method", NodeUtil.getPrototypePropertyName(getPropMethod));
  }

  @Test
  public void testIsPrototypeProperty_NotQualified() {
    // qualifiedName == null path -> false (โดยใช้ node ที่ getQualifiedName() คืน null,
    // เช่น expression ที่ไม่ใช่ NAME/GETPROP แท้ๆ)
    assertFalse(NodeUtil.isPrototypeProperty(n(Token.THIS)));
  }

  @Test
  public void testIsPrototypePropertyDeclaration_NotExprAssign() {
    assertFalse(NodeUtil.isPrototypePropertyDeclaration(n(Token.BLOCK)));
  }

  // =====================================================================
  // newUndefinedNode / newVarNode / newFunctionNode / newCallNode
  // =====================================================================

  @Test
  public void testNewUndefinedNode() {
    Node undef = NodeUtil.newUndefinedNode(null);
    assertEquals(Token.VOID, undef.getType());
    assertEquals(0.0, undef.getFirstChild().getDouble(), 0);
  }

  @Test
  public void testNewVarNode_WithAndWithoutValue() {
    Node value = num(5);
    Node var = NodeUtil.newVarNode("x", value);
    assertEquals(Token.VAR, var.getType());
    assertEquals("x", var.getFirstChild().getString());
    assertSame(value, var.getFirstChild().getFirstChild());

    Node var2 = NodeUtil.newVarNode("y", null);
    assertFalse(var2.getFirstChild().hasChildren());
  }

  @Test
  public void testNewFunctionNode() {
    List<Node> params = Arrays.asList(name("a"), name("b"));
    Node body = n(Token.BLOCK);
    Node fn = NodeUtil.newFunctionNode("bar", params, body, 1, 1);
    assertEquals(Token.FUNCTION, fn.getType());
    assertEquals("bar", fn.getFirstChild().getString());
    assertEquals(2, fn.getFirstChild().getNext().getChildCount());
    assertSame(body, fn.getLastChild());
  }

  @Test
  public void testNewCallNode_FreeCallFlag() {
    Node call = NodeUtil.newCallNode(name("foo"), num(1), num(2));
    assertEquals(Token.CALL, call.getType());
    assertTrue(call.getBooleanProp(Node.FREE_CALL));

    Node getProp = n(Token.GETPROP, name("obj"), str("foo"));
    Node call2 = NodeUtil.newCallNode(getProp);
    assertFalse(call2.getBooleanProp(Node.FREE_CALL));
  }

  // =====================================================================
  // isLatin / isValidPropertyName
  // =====================================================================

  @Test
  public void testIsLatin() {
    assertTrue(NodeUtil.isLatin("hello"));
    assertFalse(NodeUtil.isLatin("h\u00e9llo")); // é > 0x7f
  }

  @Test
  public void testIsValidPropertyName() {
    assertTrue(NodeUtil.isValidPropertyName("foo"));
    assertFalse(NodeUtil.isValidPropertyName("123abc")); // ไม่ใช่ identifier ที่ถูกต้อง
    assertFalse(NodeUtil.isValidPropertyName("var")); // keyword
  }

  // =====================================================================
  // has / getCount / isNameReferenced / getNameReferenceCount / getNodeTypeReferenceCount
  // =====================================================================

  @Test
  public void testIsNameReferencedAndCount() {
    Node block = n(Token.BLOCK, name("x"), name("y"), name("x"));
    assertTrue(NodeUtil.isNameReferenced(block, "x"));
    assertFalse(NodeUtil.isNameReferenced(block, "z"));
    assertEquals(2, NodeUtil.getNameReferenceCount(block, "x"));
  }

  @Test
  public void testGetNodeTypeReferenceCount() {
    Node block = n(Token.BLOCK, str("a"), str("b"), num(1));
    int count = NodeUtil.getNodeTypeReferenceCount(
        block, Token.STRING, com.google.common.base.Predicates.<Node>alwaysTrue());
    assertEquals(2, count);
  }

  // =====================================================================
  // visitPreOrder / visitPostOrder (ทดสอบผ่าน getVarsDeclaredInBranch แล้วบางส่วน)
  // =====================================================================

  @Test
  public void testVisitPreOrder_OrderAndPredicate() {
    final List<Integer> visited = new java.util.ArrayList<Integer>();
    Node child1 = str("a");
    Node child2 = str("b");
    Node root = n(Token.BLOCK, child1, child2);
    NodeUtil.visitPreOrder(root, new NodeUtil.Visitor() {
      public void visit(Node node) {
        visited.add(node.getType());
      }
    }, Predicates.<Node>alwaysTrue());
    assertEquals(Arrays.asList(Token.BLOCK, Token.STRING, Token.STRING), visited);
  }

  // =====================================================================
  // hasFinally / getCatchBlock / hasCatchHandler / getFnParameters
  // =====================================================================

  @Test
  public void testHasFinally() {
    Node tryNode2 = n(Token.TRY, n(Token.BLOCK), n(Token.BLOCK));
    assertFalse(NodeUtil.hasFinally(tryNode2));

    Node tryNode3 = n(Token.TRY, n(Token.BLOCK), n(Token.BLOCK), n(Token.BLOCK));
    assertTrue(NodeUtil.hasFinally(tryNode3));
  }

  @Test
  public void testGetCatchBlockAndHasCatchHandler() {
    Node catchNode = n(Token.CATCH, name("e"), n(Token.BLOCK));
    Node catchContainer = n(Token.BLOCK, catchNode);
    Node tryBlock = n(Token.BLOCK);
    Node tryNode = n(Token.TRY, tryBlock, catchContainer);

    assertSame(catchContainer, NodeUtil.getCatchBlock(tryNode));
    assertTrue(NodeUtil.hasCatchHandler(catchContainer));

    Node emptyContainer = n(Token.BLOCK);
    assertFalse(NodeUtil.hasCatchHandler(emptyContainer));
  }

  @Test
  public void testGetFnParameters() {
    Node fn = buildFunction("f", n(Token.BLOCK));
    Node lp = fn.getFirstChild().getNext();
    assertSame(lp, NodeUtil.getFnParameters(fn));
  }

  // =====================================================================
  // isConstantName / getSourceName
  // =====================================================================

  @Test
  public void testIsConstantName() {
    Node constName = name("X");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertTrue(NodeUtil.isConstantName(constName));

    Node normalName = name("y");
    assertFalse(NodeUtil.isConstantName(normalName));
  }

  @Test
  public void testGetSourceName_ClimbsAncestors() {
    Node grandparent = n(Token.BLOCK);
    grandparent.putProp(Node.SOURCENAME_PROP, "test.js");
    Node parent = n(Token.BLOCK);
    grandparent.addChildToBack(parent);
    Node child = str("x");
    parent.addChildToBack(child);

    assertEquals("test.js", NodeUtil.getSourceName(child));
  }

  @Test
  public void testGetSourceName_NoneFound() {
    Node orphan = str("x");
    assertNull(NodeUtil.getSourceName(orphan));
  }

  // =====================================================================
  // getArgumentForFunction / getArgumentForCallOrNew
  // =====================================================================

  @Test
  public void testGetArgumentForFunction() {
    Node param0 = name("a");
    Node param1 = name("b");
    Node body = n(Token.BLOCK);
    Node fnNameNode = name("f");
    Node params = n(Token.LP, param0, param1);
    Node fn = new Node(Token.FUNCTION, fnNameNode);
    fn.addChildToBack(params);
    fn.addChildToBack(body);

    assertSame(param0, NodeUtil.getArgumentForFunction(fn, 0));
    assertSame(param1, NodeUtil.getArgumentForFunction(fn, 1));
    assertNull(NodeUtil.getArgumentForFunction(fn, 2));
  }

  @Test
  public void testGetArgumentForCallOrNew() {
    Node call = NodeUtil.newCallNode(name("f"), num(1), num(2));
    assertEquals(1.0, NodeUtil.getArgumentForCallOrNew(call, 0).getDouble(), 0);
    assertEquals(2.0, NodeUtil.getArgumentForCallOrNew(call, 1).getDouble(), 0);
    assertNull(NodeUtil.getArgumentForCallOrNew(call, 5));
  }

  // =====================================================================
  // evaluatesToLocalValue
  // =====================================================================

  @Test
  public void testEvaluatesToLocalValue_Assign() {
    Node assignImmutable = n(Token.ASSIGN, name("x"), num(5));
    assertTrue(NodeUtil.evaluatesToLocalValue(assignImmutable));

    Node assignNonLocal = n(Token.ASSIGN, name("x"), name("y"));
    assertFalse(NodeUtil.evaluatesToLocalValue(assignNonLocal));
  }

  @Test
  public void testEvaluatesToLocalValue_CommaAndOr() {
    Node comma = n(Token.COMMA, num(1), str("s"));
    assertTrue(NodeUtil.evaluatesToLocalValue(comma));

    Node and = n(Token.AND, num(1), num(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(and));

    Node andFalse = n(Token.AND, num(1), name("y"));
    assertFalse(NodeUtil.evaluatesToLocalValue(andFalse));

    Node or = n(Token.OR, num(1), num(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(or));
  }

  @Test
  public void testEvaluatesToLocalValue_Hook() {
    Node hook = n(Token.HOOK, name("c"), num(1), num(2));
    assertTrue(NodeUtil.evaluatesToLocalValue(hook));

    Node hookFalse = n(Token.HOOK, name("c"), num(1), name("z"));
    assertFalse(NodeUtil.evaluatesToLocalValue(hookFalse));
  }

  @Test
  public void testEvaluatesToLocalValue_IncDec() {
    Node inc = n(Token.INC, name("Infinity"));
    inc.putBooleanProp(Node.INCRDECR_PROP, true);
    assertTrue(NodeUtil.evaluatesToLocalValue(inc)); // delegates to child (Infinity immutable)

    Node incPost = n(Token.INC, name("y")); // INCRDECR_PROP default false
    assertTrue(NodeUtil.evaluatesToLocalValue(incPost));
  }

  @Test
  public void testEvaluatesToLocalValue_This() {
    Node thisNode = n(Token.THIS);
    assertFalse(NodeUtil.evaluatesToLocalValue(thisNode)); // default predicate alwaysFalse
    assertTrue(NodeUtil.evaluatesToLocalValue(thisNode, Predicates.<Node>alwaysTrue()));
  }

  @Test
  public void testEvaluatesToLocalValue_NameGetPropGetElem() {
    assertTrue(NodeUtil.evaluatesToLocalValue(name("Infinity")));
    assertFalse(NodeUtil.evaluatesToLocalValue(name("y")));

    Node getProp = n(Token.GETPROP, name("o"), str("p"));
    assertFalse(NodeUtil.evaluatesToLocalValue(getProp));
    assertTrue(NodeUtil.evaluatesToLocalValue(getProp, Predicates.<Node>alwaysTrue()));
  }

  @Test
  public void testEvaluatesToLocalValue_Call() {
    Node getPropToString = n(Token.GETPROP, name("obj"), str("toString"));
    Node callToString = n(Token.CALL, getPropToString);
    assertTrue(NodeUtil.evaluatesToLocalValue(callToString)); // isToStringMethodCall == true

    Node getPropOther = n(Token.GETPROP, name("obj"), str("foo"));
    Node callOther = n(Token.CALL, getPropOther);
    assertFalse(NodeUtil.evaluatesToLocalValue(callOther));
    // NOTE: ไม่มี public setter สำหรับ FLAG_LOCAL_RESULTS ในซอร์สที่ให้มา
    // จึงไม่ทดสอบ branch callHasLocalResult()==true
  }

  @Test
  public void testEvaluatesToLocalValue_New() {
    assertTrue(NodeUtil.evaluatesToLocalValue(n(Token.NEW, name("Foo"))));
  }

  @Test
  public void testEvaluatesToLocalValue_LiteralTypes() {
    assertTrue(NodeUtil.evaluatesToLocalValue(n(Token.ARRAYLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(n(Token.OBJECTLIT)));
    assertTrue(NodeUtil.evaluatesToLocalValue(n(Token.REGEXP)));
    assertTrue(NodeUtil.evaluatesToLocalValue(n(Token.IN, name("a"), name("b"))));
  }

  @Test
  public void testEvaluatesToLocalValue_DefaultTrue() {
    assertTrue(NodeUtil.evaluatesToLocalValue(n(Token.ADD, num(1), num(2))));
  }

  @Test(expected = IllegalStateException.class)
  public void testEvaluatesToLocalValue_DefaultThrows() {
    NodeUtil.evaluatesToLocalValue(n(Token.THROW, num(1)));
  }

  // =====================================================================
  // constructorCallHasSideEffects / functionCallHasSideEffects
  // =====================================================================

  @Test(expected = IllegalStateException.class)
  public void testConstructorCallHasSideEffects_WrongNodeType() {
    NodeUtil.constructorCallHasSideEffects(n(Token.CALL, name("f")));
  }

  @Test
  public void testConstructorCallHasSideEffects_KnownVsUnknown() {
    assertFalse(NodeUtil.constructorCallHasSideEffects(n(Token.NEW, name("Array"))));
    assertTrue(NodeUtil.constructorCallHasSideEffects(n(Token.NEW, name("Foo"))));
  }

  @Test(expected = IllegalStateException.class)
  public void testFunctionCallHasSideEffects_WrongNodeType() {
    NodeUtil.functionCallHasSideEffects(n(Token.NEW, name("f")));
  }

  @Test
  public void testFunctionCallHasSideEffects_Builtin() {
    assertFalse(NodeUtil.functionCallHasSideEffects(n(Token.CALL, name("Object"))));
    assertTrue(NodeUtil.functionCallHasSideEffects(n(Token.CALL, name("unknownFn"))));
  }

  @Test
  public void testFunctionCallHasSideEffects_ObjectMethodNoArgs() {
    Node getProp = n(Token.GETPROP, name("obj"), str("toString"));
    Node call = n(Token.CALL, getProp); // hasOneChild == true
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_MathNamespace() {
    Node getProp = n(Token.GETPROP, name("Math"), str("random"));
    Node call = n(Token.CALL, getProp);
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_UnknownGetProp() {
    Node getProp = n(Token.GETPROP, name("obj"), str("randomMethod"));
    Node call = n(Token.CALL, getProp);
    assertTrue(NodeUtil.functionCallHasSideEffects(call));
  }

  // =====================================================================
  // nodeTypeMayHaveSideEffects
  // =====================================================================

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n(Token.ASSIGN, name("x"), num(1))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n(Token.DELPROP, name("x"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n(Token.INC, name("x"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n(Token.THROW, num(1))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n(Token.CALL, name("unknown"))));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(n(Token.CALL, name("Object"))));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(n(Token.NEW, name("Foo"))));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(n(Token.NEW, name("Array"))));

    Node nameWithChild = name("x");
    nameWithChild.addChildToBack(num(1));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(name("x")));

    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(str("x")));
  }

  // =====================================================================
  // canBeSideEffected
  // =====================================================================

  @Test
  public void testCanBeSideEffected_CallNewAlwaysTrue() {
    assertTrue(NodeUtil.canBeSideEffected(n(Token.CALL, name("f"))));
    assertTrue(NodeUtil.canBeSideEffected(n(Token.NEW, name("F"))));
  }

  @Test
  public void testCanBeSideEffected_Name() {
    Node constName = name("X");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(constName));

    assertTrue(NodeUtil.canBeSideEffected(name("y")));

    Set<String> knownConsts = new HashSet<String>(Arrays.asList("z"));
    assertFalse(NodeUtil.canBeSideEffected(name("z"), knownConsts));
  }

  @Test
  public void testCanBeSideEffected_GetPropGetElem() {
    assertTrue(NodeUtil.canBeSideEffected(n(Token.GETPROP, name("o"), str("p"))));
    assertTrue(NodeUtil.canBeSideEffected(n(Token.GETELEM, name("o"), num(0))));
  }

  @Test
  public void testCanBeSideEffected_FunctionExpression() {
    Node exprFn = buildFunction("f", n(Token.BLOCK));
    n(Token.ASSIGN, name("x"), exprFn);
    assertFalse(NodeUtil.canBeSideEffected(exprFn));
  }

  @Test
  public void testCanBeSideEffected_DefaultRecurse() {
    Node blockSafe = n(Token.BLOCK, str("x"));
    assertFalse(NodeUtil.canBeSideEffected(blockSafe));

    Node blockWithCall = n(Token.BLOCK, n(Token.CALL, name("f")));
    assertTrue(NodeUtil.canBeSideEffected(blockWithCall));
  }

  // =====================================================================
  // mayHaveSideEffects / mayEffectMutableState (checkForStateChangeHelper)
  // =====================================================================

  @Test
  public void testMayHaveSideEffects_SafeAndThrow() {
    assertFalse(NodeUtil.mayHaveSideEffects(num(1)));
    assertTrue(NodeUtil.mayHaveSideEffects(n(Token.THROW, num(1))));
  }

  @Test
  public void testMayEffectMutableState_ObjectLitAlwaysTrue() {
    assertTrue(NodeUtil.mayEffectMutableState(n(Token.OBJECTLIT)));
  }

  @Test
  public void testMayHaveSideEffects_ObjectLitChildren() {
    Node key = str("k");
    key.addChildToBack(num(1));
    Node objSafe = n(Token.OBJECTLIT, key);
    assertFalse(NodeUtil.mayHaveSideEffects(objSafe));

    Node key2 = str("k2");
    key2.addChildToBack(n(Token.CALL, name("unknown")));
    Node objUnsafe = n(Token.OBJECTLIT, key2);
    assertTrue(NodeUtil.mayHaveSideEffects(objUnsafe));
  }

  @Test
  public void testMayHaveSideEffects_ArrayLitAndRegexp() {
    assertTrue(NodeUtil.mayEffectMutableState(n(Token.ARRAYLIT)));
    assertFalse(NodeUtil.mayHaveSideEffects(n(Token.ARRAYLIT, num(1))));
    assertTrue(NodeUtil.mayHaveSideEffects(n(Token.ARRAYLIT, n(Token.CALL, name("unknown")))));
  }

  @Test
  public void testMayHaveSideEffects_NameAndVar() {
    Node nameWithChild = name("x");
    nameWithChild.addChildToBack(num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));
    assertFalse(NodeUtil.mayHaveSideEffects(name("x")));
  }

  @Test
  public void testMayHaveSideEffects_Function() {
    Node exprFn = buildFunction("f", n(Token.BLOCK));
    n(Token.ASSIGN, name("x"), exprFn);
    assertFalse(NodeUtil.mayHaveSideEffects(exprFn));

    Node declFn = buildFunction("g", n(Token.BLOCK));
    n(Token.BLOCK, declFn);
    assertTrue(NodeUtil.mayHaveSideEffects(declFn));
  }

  @Test
  public void testMayHaveSideEffects_New() {
    assertTrue(NodeUtil.mayEffectMutableState(n(Token.NEW, name("Array"))));
    assertFalse(NodeUtil.mayHaveSideEffects(n(Token.NEW, name("Array"))));
    assertTrue(NodeUtil.mayHaveSideEffects(n(Token.NEW, name("Foo"))));
  }

  @Test
  public void testMayHaveSideEffects_Call() {
    assertFalse(NodeUtil.mayHaveSideEffects(n(Token.CALL, name("Object"))));
    assertTrue(NodeUtil.mayHaveSideEffects(n(Token.CALL, name("unknownFn"))));
  }

  @Test
  public void testMayHaveSideEffects_AssignTargetIsName() {
    Node assign = n(Token.ASSIGN, name("x"), num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_AssignTargetGetProp_LocalObject() {
    // obj = new Array(); obj.prop = 5;  -> current (NEW Array) evaluatesToLocalValue == true
    Node newArray = n(Token.NEW, name("Array"));
    Node target = n(Token.GETPROP, newArray, str("prop"));
    Node assign = n(Token.ASSIGN, target, num(5));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_AssignTargetGetProp_NonLiteralRoot() {
    // obj.prop = 5; โดย obj เป็น NAME ทั่วไป (ไม่ local, ไม่ literal) -> side effect true
    Node target = n(Token.GETPROP, name("obj"), str("prop"));
    Node assign = n(Token.ASSIGN, target, num(5));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testMayHaveSideEffects_AssignLegacyNonNameNonGetTarget() {
    // AST ที่ไม่ปกติตาม comment ในซอร์ส (ทดสอบ branch สุดท้ายของ isAssignmentOp)
    Node target = num(5); // ไม่ใช่ NAME, ไม่ใช่ GET
    Node assign = n(Token.ASSIGN, target, num(6));
    assertFalse(NodeUtil.mayHaveSideEffects(assign)); // !isLiteralValue(num5,true) == false
  }

  // =====================================================================
  // callHasLocalResult (ทดสอบเฉพาะกรณี Precondition ผิด)
  // =====================================================================

  @Test(expected = IllegalStateException.class)
  public void testCallHasLocalResult_WrongType() {
    NodeUtil.callHasLocalResult(n(Token.NEW, name("f")));
    // NOTE: ไม่มี public API ในซอร์สที่ให้มาสำหรับตั้งค่า FLAG_LOCAL_RESULTS
    // จึงไม่ได้ทดสอบ branch "true" ของเมธอดนี้
  }
}
