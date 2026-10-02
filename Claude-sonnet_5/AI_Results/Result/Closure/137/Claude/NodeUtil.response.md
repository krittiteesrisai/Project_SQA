# NodeUtilTest — JUnit 4 Test Suite

**หมายเหตุสำคัญก่อนโค้ด:**
- คลาส `NodeUtil` และเมธอดส่วนใหญ่เป็น **package-private** จึงต้องวาง `NodeUtilTest` ไว้ใน package เดียวกัน (`com.google.javascript.jscomp`) โดยไม่ต้อง `import` คลาส `NodeUtil` (อยู่ package เดียวกันแล้ว) แต่ import `Node`, `Token`, `FunctionNode` และ Guava `Predicates` ตามที่ใช้
- บางเมธอด/บางสาขาที่ต้องพึ่ง API ที่ **ไม่ปรากฏใน source ที่ให้มา** (เช่น setter ของ `isNoSideEffectsCall()`, การสร้าง `JSDocInfo`, พฤติกรรม Unicode ของ `TokenStream.isJSIdentifier`) จะถูก**ข้ามหรือกำกับด้วยคอมเมนต์**ตามข้อกำหนดที่ 4 (ห้ามเดา behavior)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.common.base.Predicates;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NodeUtilTest {

  // ==================== Helpers ====================
  private static Node num(double d) { return Node.newNumber(d); }
  private static Node str(String s) { return Node.newString(Token.STRING, s); }
  private static Node name(String s) { return Node.newString(Token.NAME, s); }

  private static Node block(Node... children) {
    Node b = new Node(Token.BLOCK);
    for (Node c : children) b.addChildToBack(c);
    return b;
  }

  private static Node simpleFunction(String innerName, Node body) {
    Node fn = new Node(Token.FUNCTION);
    fn.addChildToBack(name(innerName));
    fn.addChildToBack(new Node(Token.LP));
    fn.addChildToBack(body);
    return fn;
  }

  // ==================== getBooleanValue ====================

  @Test
  public void testGetBooleanValue_String() {
    assertFalse(NodeUtil.getBooleanValue(str("")));
    assertTrue(NodeUtil.getBooleanValue(str("x")));
  }

  @Test
  public void testGetBooleanValue_Number() {
    assertFalse(NodeUtil.getBooleanValue(num(0)));
    assertTrue(NodeUtil.getBooleanValue(num(1)));
  }

  @Test
  public void testGetBooleanValue_NullFalseVoid() {
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.NULL)));
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    assertFalse(NodeUtil.getBooleanValue(new Node(Token.VOID)));
  }

  @Test
  public void testGetBooleanValue_NameSpecials() {
    assertFalse(NodeUtil.getBooleanValue(name("undefined")));
    assertFalse(NodeUtil.getBooleanValue(name("NaN")));
    assertTrue(NodeUtil.getBooleanValue(name("Infinity")));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_NameOther_Throws() {
    // falls through switch's NAME case (break) -> no matching case -> throws
    NodeUtil.getBooleanValue(name("foo"));
  }

  @Test
  public void testGetBooleanValue_TrueArrayObjectRegexp() {
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.ARRAYLIT)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.OBJECTLIT)));
    assertTrue(NodeUtil.getBooleanValue(new Node(Token.REGEXP)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetBooleanValue_NonLiteral_Throws() {
    NodeUtil.getBooleanValue(new Node(Token.ADD));
  }

  // ==================== getStringValue ====================

  @Test
  public void testGetStringValue_NameString() {
    assertEquals("foo", NodeUtil.getStringValue(name("foo")));
    assertEquals("bar", NodeUtil.getStringValue(str("bar")));
  }

  @Test
  public void testGetStringValue_NumberInteger() {
    assertEquals("1", NodeUtil.getStringValue(num(1.0)));
  }

  @Test
  public void testGetStringValue_NumberDecimal() {
    assertEquals(Double.toString(1.5), NodeUtil.getStringValue(num(1.5)));
  }

  @Test
  public void testGetStringValue_TrueFalseNull() {
    assertEquals(Node.tokenToName(Token.TRUE), NodeUtil.getStringValue(new Node(Token.TRUE)));
    assertEquals(Node.tokenToName(Token.FALSE), NodeUtil.getStringValue(new Node(Token.FALSE)));
    assertEquals(Node.tokenToName(Token.NULL), NodeUtil.getStringValue(new Node(Token.NULL)));
  }

  @Test
  public void testGetStringValue_Void() {
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
  }

  @Test
  public void testGetStringValue_Unhandled_ReturnsNull() {
    assertNull(NodeUtil.getStringValue(new Node(Token.ADD)));
  }

  // ==================== getFunctionName ====================

  @Test
  public void testGetFunctionName_ParentIsName() {
    Node fn = simpleFunction("", new Node(Token.BLOCK));
    Node parent = name("outerName");
    assertEquals("outerName", NodeUtil.getFunctionName(fn, parent));
  }

  @Test
  public void testGetFunctionName_ParentIsAssign() {
    Node fn = simpleFunction("", new Node(Token.BLOCK));
    Node lhs = NodeUtil.newQualifiedNameNode("obj.prop", -1, -1);
    Node rhs = new Node(Token.NUMBER);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    assertEquals("obj.prop", NodeUtil.getFunctionName(fn, assign));
  }

  @Test
  public void testGetFunctionName_DefaultNamed() {
    Node fn = simpleFunction("myFn", new Node(Token.BLOCK));
    Node parent = new Node(Token.BLOCK);
    assertEquals("myFn", NodeUtil.getFunctionName(fn, parent));
  }

  @Test
  public void testGetFunctionName_DefaultAnonymous_Null() {
    Node fn = simpleFunction("", new Node(Token.BLOCK));
    Node parent = new Node(Token.BLOCK);
    assertNull(NodeUtil.getFunctionName(fn, parent));
  }

  // ==================== isImmutableValue ====================

  @Test
  public void testIsImmutableValue_Literals() {
    assertTrue(NodeUtil.isImmutableValue(str("a")));
    assertTrue(NodeUtil.isImmutableValue(num(1)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.TRUE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.FALSE)));
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.VOID)));
  }

  @Test
  public void testIsImmutableValue_Neg() {
    assertTrue(NodeUtil.isImmutableValue(new Node(Token.NEG, num(1))));
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.NEG, new Node(Token.CALL, name("f")))));
  }

  @Test
  public void testIsImmutableValue_NameSpecials() {
    assertTrue(NodeUtil.isImmutableValue(name("undefined")));
    assertTrue(NodeUtil.isImmutableValue(name("Infinity")));
    assertTrue(NodeUtil.isImmutableValue(name("NaN")));
    assertFalse(NodeUtil.isImmutableValue(name("foo")));
  }

  @Test
  public void testIsImmutableValue_Default() {
    assertFalse(NodeUtil.isImmutableValue(new Node(Token.CALL, name("f"))));
  }

  // ==================== isLiteralValue ====================

  @Test
  public void testIsLiteralValue_ArrayAllConst() {
    Node arr = new Node(Token.ARRAYLIT);
    arr.addChildToBack(num(1));
    arr.addChildToBack(str("x"));
    assertTrue(NodeUtil.isLiteralValue(arr));
  }

  @Test
  public void testIsLiteralValue_ArrayNonConstChild() {
    Node arr = new Node(Token.ARRAYLIT);
    arr.addChildToBack(num(1));
    arr.addChildToBack(new Node(Token.CALL, name("f")));
    assertFalse(NodeUtil.isLiteralValue(arr));
  }

  @Test
  public void testIsLiteralValue_Default() {
    assertTrue(NodeUtil.isLiteralValue(num(1)));
    assertFalse(NodeUtil.isLiteralValue(new Node(Token.CALL, name("f"))));
  }

  // ==================== isValidDefineValue ====================

  @Test
  public void testIsValidDefineValue() {
    Set<String> defines = new HashSet<String>(Arrays.asList("FOO.BAR"));
    assertTrue(NodeUtil.isValidDefineValue(str("hello"), defines));
    assertTrue(NodeUtil.isValidDefineValue(num(1), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.TRUE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.FALSE), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.NOT, new Node(Token.TRUE)), defines));
    assertTrue(NodeUtil.isValidDefineValue(new Node(Token.NEG, num(2)), defines));

    Node qn = NodeUtil.newQualifiedNameNode("FOO.BAR", -1, -1);
    assertTrue(NodeUtil.isValidDefineValue(qn, defines));

    Node qn2 = NodeUtil.newQualifiedNameNode("FOO.BAZ", -1, -1);
    assertFalse(NodeUtil.isValidDefineValue(qn2, defines));

    Node call = new Node(Token.CALL, name("f"));
    assertFalse(NodeUtil.isValidDefineValue(call, defines));

    // GETPROP whose base is not qualified (CALL) -> isQualifiedName() false path
    Node getpropNonQualified = new Node(Token.GETPROP, call, str("prop"));
    assertFalse(NodeUtil.isValidDefineValue(getpropNonQualified, defines));
  }

  // ==================== isEmptyBlock ====================

  @Test
  public void testIsEmptyBlock_NotBlock() {
    assertFalse(NodeUtil.isEmptyBlock(new Node(Token.IF)));
  }

  @Test
  public void testIsEmptyBlock_TrueCases() {
    assertTrue(NodeUtil.isEmptyBlock(new Node(Token.BLOCK)));
    Node b = block(new Node(Token.EMPTY), new Node(Token.EMPTY));
    assertTrue(NodeUtil.isEmptyBlock(b));
  }

  @Test
  public void testIsEmptyBlock_False() {
    Node b = block(new Node(Token.EMPTY), new Node(Token.EXPR_RESULT, num(1)));
    assertFalse(NodeUtil.isEmptyBlock(b));
  }

  // ==================== isSimpleOperatorType / isAssociative / isAssignmentOp ====================

  @Test
  public void testIsSimpleOperatorType() {
    assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    assertTrue(NodeUtil.isSimpleOperatorType(Token.GETPROP));
    assertFalse(NodeUtil.isSimpleOperatorType(Token.CALL));
  }

  @Test
  public void testIsAssociative() {
    assertTrue(NodeUtil.isAssociative(Token.MUL));
    assertTrue(NodeUtil.isAssociative(Token.AND));
    assertTrue(NodeUtil.isAssociative(Token.OR));
    assertTrue(NodeUtil.isAssociative(Token.BITOR));
    assertTrue(NodeUtil.isAssociative(Token.BITAND));
    assertFalse(NodeUtil.isAssociative(Token.ADD));
  }

  @Test
  public void testIsAssignmentOp() {
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
    assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
  }

  @Test
  public void testGetOpFromAssignmentOp_Mappings() {
    assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_ADD)));
    assertEquals(Token.SUB, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_SUB)));
    assertEquals(Token.MUL, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MUL)));
    assertEquals(Token.DIV, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_DIV)));
    assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_MOD)));
    assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITOR)));
    assertEquals(Token.BITXOR, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITXOR)));
    assertEquals(Token.BITAND, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_BITAND)));
    assertEquals(Token.LSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_LSH)));
    assertEquals(Token.RSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_RSH)));
    assertEquals(Token.URSH, NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN_URSH)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetOpFromAssignmentOp_PlainAssign_Throws() {
    // Token.ASSIGN itself is NOT one of the cases -> falls to throw.
    NodeUtil.getOpFromAssignmentOp(new Node(Token.ASSIGN));
  }

  // ==================== newExpr ====================

  @Test
  public void testNewExpr() {
    Node child = num(1);
    Node expr = NodeUtil.newExpr(child);
    assertEquals(Token.EXPR_RESULT, expr.getType());
    assertEquals(child, expr.getFirstChild());
  }

  // ==================== mayEffectMutableState / mayHaveSideEffects ====================

  @Test
  public void testSideEffects_SimpleAndNoEffect() {
    Node and = new Node(Token.AND, name("a"), name("b"));
    assertFalse(NodeUtil.mayHaveSideEffects(and));
    assertFalse(NodeUtil.mayEffectMutableState(and));
  }

  @Test
  public void testSideEffects_Throw() {
    Node th = new Node(Token.THROW, num(1));
    assertTrue(NodeUtil.mayHaveSideEffects(th));
  }

  @Test
  public void testSideEffects_ObjectLit_CheckNewObjectsFlag() {
    Node obj = new Node(Token.OBJECTLIT);
    assertTrue(NodeUtil.mayEffectMutableState(obj));  // checkForNewObjects = true
    assertFalse(NodeUtil.mayHaveSideEffects(obj));     // checkForNewObjects = false, no children
  }

  @Test
  public void testSideEffects_Var() {
    Node varWithChild = new Node(Token.VAR, name("x"));
    assertTrue(NodeUtil.mayHaveSideEffects(varWithChild));

    Node emptyVar = new Node(Token.VAR); // no children at all
    assertFalse(NodeUtil.mayHaveSideEffects(emptyVar));
  }

  @Test
  public void testSideEffects_Function() {
    // Anonymous function (parent is CALL -> not a statement)
    Node call = new Node(Token.CALL);
    Node anonFn = simpleFunction("", new Node(Token.BLOCK));
    call.addChildToBack(anonFn);
    assertFalse(NodeUtil.mayHaveSideEffects(anonFn));

    // Declared function (parent is BLOCK/SCRIPT -> is a statement)
    Node script = new Node(Token.SCRIPT);
    Node declFn = simpleFunction("f", new Node(Token.BLOCK));
    script.addChildToBack(declFn);
    assertTrue(NodeUtil.mayHaveSideEffects(declFn));
  }

  @Test
  public void testSideEffects_New_CheckNewObjectsTrue() {
    Node newNode = new Node(Token.NEW, name("Foo"));
    assertTrue(NodeUtil.mayEffectMutableState(newNode));
  }

  @Test
  public void testSideEffects_New_KnownSafeConstructor() {
    Node newNode = new Node(Token.NEW, name("Array"));
    assertFalse(NodeUtil.mayHaveSideEffects(newNode));
  }

  @Test
  public void testSideEffects_New_UnknownConstructorName() {
    Node newNode = new Node(Token.NEW, name("Foo"));
    assertTrue(NodeUtil.mayHaveSideEffects(newNode));
  }

  @Test
  public void testSideEffects_New_NonNameConstructor() {
    Node ctor = new Node(Token.GETPROP, name("ns"), str("Ctor"));
    Node newNode = new Node(Token.NEW, ctor);
    assertTrue(NodeUtil.mayHaveSideEffects(newNode));
  }

  @Test
  public void testSideEffects_Call_DefaultHasSideEffects() {
    // isNoSideEffectsCall() has no known setter in the given source, assumed false by default.
    Node call = new Node(Token.CALL, name("f"));
    assertTrue(NodeUtil.mayHaveSideEffects(call));
  }

  @Test
  public void testSideEffects_DefaultSimpleOperator() {
    Node add = new Node(Token.ADD, name("a"), name("b"));
    assertFalse(NodeUtil.mayHaveSideEffects(add));
  }

  @Test
  public void testSideEffects_AssignmentOp_RhsHasSideEffect() {
    Node lhs = name("a");
    Node rhs = new Node(Token.CALL, name("f"));
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testSideEffects_AssignmentOp_PersistentName() {
    // a = 5  -> current == NAME("a"), isLiteralValue(NAME) == false -> side effect true
    Node assign = new Node(Token.ASSIGN, name("a"), num(5));
    assertTrue(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testSideEffects_AssignmentOp_TemporaryBase_NoEffect() {
    // [].length = 1  -> base of GETPROP chain is ARRAYLIT (literal) -> no lasting side effect
    Node arr = new Node(Token.ARRAYLIT);
    Node lhs = new Node(Token.GETPROP, arr, str("length"));
    Node assign = new Node(Token.ASSIGN, lhs, num(1));
    assertFalse(NodeUtil.mayHaveSideEffects(assign));
  }

  @Test
  public void testSideEffects_DefaultUnknownType() {
    // CATCH: not in the "safe" list, not simple operator, not assignment op -> true
    assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.CATCH)));
  }

  // ==================== constructorCallHasSideEffects ====================

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorCallHasSideEffects_WrongType() {
    NodeUtil.constructorCallHasSideEffects(new Node(Token.CALL));
  }

  @Test
  public void testConstructorCallHasSideEffects_SafeCtor() {
    Node n = new Node(Token.NEW, name("Array"));
    assertFalse(NodeUtil.constructorCallHasSideEffects(n));
  }

  @Test
  public void testConstructorCallHasSideEffects_UnknownCtor() {
    Node n = new Node(Token.NEW, name("Foo"));
    assertTrue(NodeUtil.constructorCallHasSideEffects(n));
  }

  @Test
  public void testConstructorCallHasSideEffects_NonNameCtor() {
    Node ctor = new Node(Token.GETPROP, name("ns"), str("Ctor"));
    Node n = new Node(Token.NEW, ctor);
    assertTrue(NodeUtil.constructorCallHasSideEffects(n));
  }

  // ==================== functionCallHasSideEffects ====================

  @Test(expected = IllegalArgumentException.class)
  public void testFunctionCallHasSideEffects_WrongType() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW));
  }

  @Test
  public void testFunctionCallHasSideEffects_StringBuiltin() {
    Node call = new Node(Token.CALL, name("String"));
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_OtherName() {
    Node call = new Node(Token.CALL, name("Foo"));
    assertTrue(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_MathNamespace() {
    Node callee = new Node(Token.GETPROP, name("Math"), str("max"));
    Node call = new Node(Token.CALL, callee);
    assertFalse(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_NonMathGetProp() {
    Node callee = new Node(Token.GETPROP, name("Foo"), str("bar"));
    Node call = new Node(Token.CALL, callee);
    assertTrue(NodeUtil.functionCallHasSideEffects(call));
  }

  @Test
  public void testFunctionCallHasSideEffects_GetPropBaseNotName() {
    Node baseGetProp = new Node(Token.GETPROP, name("a"), str("b"));
    Node callee = new Node(Token.GETPROP, baseGetProp, str("c"));
    Node call = new Node(Token.CALL, callee);
    assertTrue(NodeUtil.functionCallHasSideEffects(call));
  }

  // ==================== nodeTypeMayHaveSideEffects ====================

  @Test
  public void testNodeTypeMayHaveSideEffects() {
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.ASSIGN)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.CALL)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NEW)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC)));
    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW)));

    assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NAME, num(1))));
    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.NAME)));

    assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.STRING)));
  }

  // ==================== canBeSideEffected ====================

  @Test
  public void testCanBeSideEffected_CallNew() {
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.CALL)));
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW)));
  }

  @Test
  public void testCanBeSideEffected_Name() {
    Node n = name("x");
    assertTrue(NodeUtil.canBeSideEffected(n)); // not constant, not in knownConstants

    Node constN = name("y");
    constN.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    assertFalse(NodeUtil.canBeSideEffected(constN));

    Set<String> known = new HashSet<String>(Arrays.asList("z"));
    assertFalse(NodeUtil.canBeSideEffected(name("z"), known));
  }

  @Test
  public void testCanBeSideEffected_GetPropGetElem() {
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETPROP, name("a"), str("b"))));
    assertTrue(NodeUtil.canBeSideEffected(new Node(Token.GETELEM, name("a"), num(0))));
  }

  @Test
  public void testCanBeSideEffected_DefaultRecurse() {
    assertFalse(NodeUtil.canBeSideEffected(new Node(Token.BLOCK)));
    Node blockWithCall = block(new Node(Token.EXPR_RESULT, new Node(Token.CALL, name("f"))));
    assertTrue(NodeUtil.canBeSideEffected(blockWithCall));
  }

  // ==================== precedence ====================

  @Test
  public void testPrecedence_SampleMappings() {
    assertEquals(0, NodeUtil.precedence(Token.COMMA));
    assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    assertEquals(2, NodeUtil.precedence(Token.HOOK));
    assertEquals(3, NodeUtil.precedence(Token.OR));
    assertEquals(4, NodeUtil.precedence(Token.AND));
    assertEquals(9, NodeUtil.precedence(Token.IN));
    assertEquals(13, NodeUtil.precedence(Token.NEG));
    assertEquals(15, NodeUtil.precedence(Token.NAME));
  }

  @Test(expected = Error.class)
  public void testPrecedence_UnknownType_Throws() {
    // Token.BLOCK is not present in the precedence switch
    NodeUtil.precedence(Token.BLOCK);
  }

  // ==================== opToStr / opToStrNoFail ====================

  @Test
  public void testOpToStr_KnownAndUnknown() {
    assertEquals("+", NodeUtil.opToStr(Token.ADD));
    assertEquals("&&", NodeUtil.opToStr(Token.AND));
    assertNull(NodeUtil.opToStr(Token.BLOCK));
  }

  @Test
  public void testOpToStrNoFail_Known() {
    assertEquals("-", NodeUtil.opToStrNoFail(Token.SUB));
  }

  @Test(expected = Error.class)
  public void testOpToStrNoFail_Unknown_Throws() {
    NodeUtil.opToStrNoFail(Token.BLOCK);
  }

  // ==================== basic type predicates ====================

  @Test
  public void testBasicTypePredicates() {
    assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
    assertFalse(NodeUtil.isExpressionNode(new Node(Token.BLOCK)));

    assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
    assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
    assertFalse(NodeUtil.isGet(new Node(Token.NAME)));

    assertTrue(NodeUtil.isGetProp(new Node(Token.GETPROP)));
    assertFalse(NodeUtil.isGetProp(new Node(Token.GETELEM)));

    assertTrue(NodeUtil.isName(new Node(Token.NAME)));
    assertFalse(NodeUtil.isName(new Node(Token.STRING)));

    assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    assertFalse(NodeUtil.isNew(new Node(Token.CALL)));

    assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    assertFalse(NodeUtil.isVar(new Node(Token.LET)) ); // any non-VAR; assuming Token.LET exists is risky
  }

  @Test
  public void testIsString_IsAssign_IsCall_IsFunction_IsThis() {
    assertTrue(NodeUtil.isString(new Node(Token.STRING)));
    assertFalse(NodeUtil.isString(new Node(Token.NAME)));

    assertTrue(NodeUtil.isAssign(new Node(Token.ASSIGN)));
    assertFalse(NodeUtil.isAssign(new Node(Token.ASSIGN_ADD)));

    assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    assertFalse(NodeUtil.isCall(new Node(Token.NEW)));

    assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    assertFalse(NodeUtil.isFunction(new Node(Token.CALL)));

    assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
  }

  // ==================== isVarDeclaration / getAssignedValue ====================

  @Test
  public void testIsVarDeclaration() {
    Node varNode = new Node(Token.VAR);
    Node n = name("x");
    varNode.addChildToBack(n);
    assertTrue(NodeUtil.isVarDeclaration(n));

    Node block = new Node(Token.BLOCK);
    Node n2 = name("y");
    block.addChildToBack(n2);
    assertFalse(NodeUtil.isVarDeclaration(n2));
  }

  @Test
  public void testGetAssignedValue_VarParent() {
    Node value = num(5);
    Node varNode = new Node(Token.VAR);
    Node n = name("x");
    n.addChildToBack(value);
    varNode.addChildToBack(n);
    assertEquals(value, NodeUtil.getAssignedValue(n));
  }

  @Test
  public void testGetAssignedValue_AssignParentLhs() {
    Node lhs = name("a");
    Node rhs = num(1);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);
    assertEquals(rhs, NodeUtil.getAssignedValue(lhs));
  }

  @Test
  public void testGetAssignedValue_OtherParent_Null() {
    Node getprop = new Node(Token.GETPROP);
    Node n = name("a");
    getprop.addChildToBack(n);
    getprop.addChildToBack(str("b"));
    assertNull(NodeUtil.getAssignedValue(n));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetAssignedValue_NotName_Throws() {
    NodeUtil.getAssignedValue(new Node(Token.STRING));
  }

  // ==================== isExprAssign / isExprCall ====================

  @Test
  public void testIsExprAssignAndCall() {
    Node exprAssign = new Node(Token.EXPR_RESULT, new Node(Token.ASSIGN, name("a"), num(1)));
    assertTrue(NodeUtil.isExprAssign(exprAssign));
    assertFalse(NodeUtil.isExprCall(exprAssign));

    Node exprCall = new Node(Token.EXPR_RESULT, new Node(Token.CALL, name("f")));
    assertTrue(NodeUtil.isExprCall(exprCall));
    assertFalse(NodeUtil.isExprAssign(exprCall));

    Node other = new Node(Token.BLOCK);
    assertFalse(NodeUtil.isExprAssign(other));
    assertFalse(NodeUtil.isExprCall(other));
  }

  // ==================== isForIn / isLoopStructure / getLoopCodeBlock ====================

  @Test
  public void testIsForIn() {
    Node forIn = new Node(Token.FOR);
    forIn.addChildToBack(name("k"));
    forIn.addChildToBack(name("obj"));
    forIn.addChildToBack(new Node(Token.BLOCK));
    assertTrue(NodeUtil.isForIn(forIn));

    Node forNormal = new Node(Token.FOR);
    forNormal.addChildToBack(new Node(Token.EMPTY));
    forNormal.addChildToBack(new Node(Token.EMPTY));
    forNormal.addChildToBack(new Node(Token.EMPTY));
    forNormal.addChildToBack(new Node(Token.BLOCK));
    assertFalse(NodeUtil.isForIn(forNormal));

    assertFalse(NodeUtil.isForIn(new Node(Token.WHILE)));
  }

  @Test
  public void testIsLoopStructureAndGetLoopCodeBlock() {
    Node forNode = new Node(Token.FOR);
    Node forBody = new Node(Token.BLOCK);
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(forBody);
    assertTrue(NodeUtil.isLoopStructure(forNode));
    assertEquals(forBody, NodeUtil.getLoopCodeBlock(forNode));

    Node doNode = new Node(Token.DO);
    Node doBody = new Node(Token.BLOCK);
    doNode.addChildToBack(doBody);
    doNode.addChildToBack(new Node(Token.TRUE));
    assertTrue(NodeUtil.isLoopStructure(doNode));
    assertEquals(doBody, NodeUtil.getLoopCodeBlock(doNode));

    Node whileNode = new Node(Token.WHILE);
    Node whileBody = new Node(Token.BLOCK);
    whileNode.addChildToBack(new Node(Token.TRUE));
    whileNode.addChildToBack(whileBody);
    assertTrue(NodeUtil.isLoopStructure(whileNode));
    assertEquals(whileBody, NodeUtil.getLoopCodeBlock(whileNode));

    assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    assertNull(NodeUtil.getLoopCodeBlock(new Node(Token.IF)));
  }

  // ==================== isControlStructure ====================

  @Test
  public void testIsControlStructure() {
    assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.DO)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.WHILE)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.WITH)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.LABEL)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.TRY)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.CATCH)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.SWITCH)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.CASE)));
    assertTrue(NodeUtil.isControlStructure(new Node(Token.DEFAULT)));
    assertFalse(NodeUtil.isControlStructure(new Node(Token.NAME)));
  }

  // ==================== isControlStructureCodeBlock ====================

  @Test
  public void testIsControlStructureCodeBlock_For() {
    Node forNode = new Node(Token.FOR);
    Node a = new Node(Token.EMPTY);
    Node bch = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    forNode.addChildToBack(a);
    forNode.addChildToBack(bch);
    forNode.addChildToBack(body);
    assertTrue(NodeUtil.isControlStructureCodeBlock(forNode, body));
    assertFalse(NodeUtil.isControlStructureCodeBlock(forNode, a));
  }

  @Test
  public void testIsControlStructureCodeBlock_Do() {
    Node doNode = new Node(Token.DO);
    Node body = new Node(Token.BLOCK);
    Node cond = new Node(Token.TRUE);
    doNode.addChildToBack(body);
    doNode.addChildToBack(cond);
    assertTrue(NodeUtil.isControlStructureCodeBlock(doNode, body));
    assertFalse(NodeUtil.isControlStructureCodeBlock(doNode, cond));
  }

  @Test
  public void testIsControlStructureCodeBlock_If() {
    Node ifNode = new Node(Token.IF);
    Node cond = new Node(Token.TRUE);
    Node thenB = new Node(Token.BLOCK);
    ifNode.addChildToBack(cond);
    ifNode.addChildToBack(thenB);
    assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, cond));
    assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, thenB));
  }

  @Test
  public void testIsControlStructureCodeBlock_Try() {
    Node tryNode = new Node(Token.TRY);
    Node tryBlk = new Node(Token.BLOCK);
    Node catchBlk = new Node(Token.BLOCK);
    Node finallyBlk = new Node(Token.BLOCK);
    tryNode.addChildToBack(tryBlk);
    tryNode.addChildToBack(catchBlk);
    tryNode.addChildToBack(finallyBlk);
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, tryBlk));
    assertTrue(NodeUtil.isControlStructureCodeBlock(tryNode, finallyBlk));
    assertFalse(NodeUtil.isControlStructureCodeBlock(tryNode, catchBlk));
  }

  @Test
  public void testIsControlStructureCodeBlock_Catch() {
    Node catchNode = new Node(Token.CATCH);
    Node param = name("e");
    Node body = new Node(Token.BLOCK);
    catchNode.addChildToBack(param);
    catchNode.addChildToBack(body);
    assertTrue(NodeUtil.isControlStructureCodeBlock(catchNode, body));
    assertFalse(NodeUtil.isControlStructureCodeBlock(catchNode, param));
  }

  @Test
  public void testIsControlStructureCodeBlock_SwitchAndCase() {
    Node switchNode = new Node(Token.SWITCH);
    Node expr = name("x");
    Node caseNode = new Node(Token.CASE, num(1));
    switchNode.addChildToBack(expr);
    switchNode.addChildToBack(caseNode);
    assertFalse(NodeUtil.isControlStructureCodeBlock(switchNode, expr));
    assertTrue(NodeUtil.isControlStructureCodeBlock(switchNode, caseNode));

    Node caseNode2 = new Node(Token.CASE);
    Node caseExpr = num(1);
    Node caseBody = new Node(Token.BLOCK);
    caseNode2.addChildToBack(caseExpr);
    caseNode2.addChildToBack(caseBody);
    assertFalse(NodeUtil.isControlStructureCodeBlock(caseNode2, caseExpr));
    assertTrue(NodeUtil.isControlStructureCodeBlock(caseNode2, caseBody));
  }

  @Test
  public void testIsControlStructureCodeBlock_Default() {
    Node defaultNode = new Node(Token.DEFAULT);
    Node body = new Node(Token.BLOCK);
    defaultNode.addChildToBack(body);
    assertTrue(NodeUtil.isControlStructureCodeBlock(defaultNode, body));
  }

  @Test
  public void testIsControlStructureCodeBlock_LabelAndWith() {
    Node labelNode = new Node(Token.LABEL);
    Node lname = name("L");
    Node lbody = new Node(Token.BLOCK);
    labelNode.addChildToBack(lname);
    labelNode.addChildToBack(lbody);
    assertTrue(NodeUtil.isControlStructureCodeBlock(labelNode, lbody));
    assertFalse(NodeUtil.isControlStructureCodeBlock(labelNode, lname));

    Node withNode = new Node(Token.WITH);
    Node wExpr = name("obj");
    Node wBody = new Node(Token.BLOCK);
    withNode.addChildToBack(wExpr);
    withNode.addChildToBack(wBody);
    assertTrue(NodeUtil.isControlStructureCodeBlock(withNode, wBody));
    assertFalse(NodeUtil.isControlStructureCodeBlock(withNode, wExpr));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsControlStructureCodeBlock_DefaultThrows() {
    Node parent = new Node(Token.BLOCK); // not a control structure
    Node child = new Node(Token.EMPTY);
    parent.addChildToBack(child);
    NodeUtil.isControlStructureCodeBlock(parent, child);
  }

  // ==================== getConditionExpression ====================

  @Test
  public void testGetConditionExpression_IfWhile() {
    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK));
    assertEquals(Token.TRUE, NodeUtil.getConditionExpression(ifNode).getType());

    Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
    assertEquals(Token.TRUE, NodeUtil.getConditionExpression(whileNode).getType());
  }

  @Test
  public void testGetConditionExpression_Do() {
    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), new Node(Token.TRUE));
    assertEquals(Token.TRUE, NodeUtil.getConditionExpression(doNode).getType());
  }

  @Test
  public void testGetConditionExpression_ForIn_Null() {
    Node forIn = new Node(Token.FOR);
    forIn.addChildToBack(name("k"));
    forIn.addChildToBack(name("obj"));
    forIn.addChildToBack(new Node(Token.BLOCK));
    assertNull(NodeUtil.getConditionExpression(forIn));
  }

  @Test
  public void testGetConditionExpression_ForNormal() {
    Node init = new Node(Token.EMPTY);
    Node cond = name("i");
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR);
    forNode.addChildToBack(init);
    forNode.addChildToBack(cond);
    forNode.addChildToBack(incr);
    forNode.addChildToBack(body);
    assertEquals(cond, NodeUtil.getConditionExpression(forNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_MalformedFor_Throws() {
    Node forNode = new Node(Token.FOR);
    forNode.addChildToBack(new Node(Token.EMPTY));
    forNode.addChildToBack(new Node(Token.EMPTY));
    NodeUtil.getConditionExpression(forNode); // childCount == 2
  }

  @Test
  public void testGetConditionExpression_Case_Null() {
    assertNull(NodeUtil.getConditionExpression(new Node(Token.CASE)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetConditionExpression_UnsupportedType_Throws() {
    NodeUtil.getConditionExpression(new Node(Token.BLOCK));
  }

  // ==================== isStatementBlock / isStatement ====================

  @Test
  public void testIsStatementBlock() {
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
    assertFalse(NodeUtil.isStatementBlock(new Node(Token.IF)));
  }

  @Test
  public void testIsStatement_True() {
    Node script = new Node(Token.SCRIPT);
    Node n = new Node(Token.EXPR_RESULT);
    script.addChildToBack(n);
    assertTrue(NodeUtil.isStatement(n));
  }

  @Test
  public void testIsStatement_False() {
    Node call = new Node(Token.CALL);
    Node fn = new Node(Token.FUNCTION);
    call.addChildToBack(fn);
    assertFalse(NodeUtil.isStatement(fn));
  }

  @Test(expected = IllegalStateException.class)
  public void testIsStatement_NoParent_Throws() {
    NodeUtil.isStatement(new Node(Token.EXPR_RESULT));
  }

  // ==================== isSwitchCase ====================

  @Test
  public void testIsSwitchCase() {
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT)));
    assertFalse(NodeUtil.isSwitchCase(new Node(Token.BLOCK)));
  }

  // ==================== isLabelName ====================

  @Test
  public void testIsLabelName() {
    assertFalse(NodeUtil.isLabelName(null));

    Node labelNode = new Node(Token.LABEL);
    Node lname = name("L");
    Node lbody = new Node(Token.BLOCK);
    labelNode.addChildToBack(lname);
    labelNode.addChildToBack(lbody);
    assertTrue(NodeUtil.isLabelName(lname));

    Node breakNode = new Node(Token.BREAK);
    Node bname = name("L2");
    breakNode.addChildToBack(bname);
    assertTrue(NodeUtil.isLabelName(bname));

    Node continueNode = new Node(Token.CONTINUE);
    Node cname = name("L3");
    continueNode.addChildToBack(cname);
    assertTrue(NodeUtil.isLabelName(cname));

    Node labelNode2 = new Node(Token.LABEL);
    Node other = new Node(Token.EMPTY);
    Node notFirst = name("X");
    labelNode2.addChildToBack(other);
    labelNode2.addChildToBack(notFirst);
    assertFalse(NodeUtil.isLabelName(notFirst));

    Node block = new Node(Token.BLOCK);
    Node plain = name("Y");
    block.addChildToBack(plain);
    assertFalse(NodeUtil.isLabelName(plain));

    assertFalse(NodeUtil.isLabelName(new Node(Token.EMPTY)));
  }

  // ==================== isTryFinallyNode ====================

  @Test
  public void testIsTryFinallyNode() {
    Node tryNode = new Node(Token.TRY);
    Node a = new Node(Token.BLOCK);
    Node bb = new Node(Token.BLOCK);
    Node c = new Node(Token.BLOCK);
    tryNode.addChildToBack(a);
    tryNode.addChildToBack(bb);
    tryNode.addChildToBack(c);
    assertTrue(NodeUtil.isTryFinallyNode(tryNode, c));
    assertFalse(NodeUtil.isTryFinallyNode(tryNode, bb));

    Node tryNode2 = new Node(Token.TRY);
    Node x = new Node(Token.BLOCK);
    Node y = new Node(Token.BLOCK);
    tryNode2.addChildToBack(x);
    tryNode2.addChildToBack(y);
    assertFalse(NodeUtil.isTryFinallyNode(tryNode2, y));

    assertFalse(NodeUtil.isTryFinallyNode(new Node(Token.BLOCK), c));
  }

  // ==================== removeChild ====================

  @Test
  public void testRemoveChild_StatementBlockParent() {
    Node blk = new Node(Token.BLOCK);
    Node exprN = new Node(Token.EXPR_RESULT, num(1));
    blk.addChildToBack(exprN);
    NodeUtil.removeChild(blk, exprN);
    assertEquals(0, blk.getChildCount());
  }

  @Test
  public void testRemoveChild_SwitchCaseNode() {
    Node switchNode = new Node(Token.SWITCH);
    Node switchExpr = name("x");
    Node caseNode = new Node(Token.CASE, num(1));
    caseNode.addChildToBack(new Node(Token.BLOCK));
    switchNode.addChildToBack(switchExpr);
    switchNode.addChildToBack(caseNode);
    NodeUtil.removeChild(switchNode, caseNode);
    assertEquals(1, switchNode.getChildCount());
  }

  @Test
  public void testRemoveChild_TryFinallyNode() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchHolder = new Node(Token.BLOCK);
    Node finallyBlock = new Node(Token.BLOCK);
    Node tryNode = new Node(Token.TRY);
    tryNode.addChildToBack(tryBlock);
    tryNode.addChildToBack(catchHolder);
    tryNode.addChildToBack(finallyBlock);
    NodeUtil.removeChild(tryNode, finallyBlock);
    assertEquals(2, tryNode.getChildCount());
  }

  @Test
  public void testRemoveChild_VarMoreThanOneChild() {
    Node varNode = new Node(Token.VAR);
    Node n1 = name("a");
    Node n2 = name("b");
    varNode.addChildToBack(n1);
    varNode.addChildToBack(n2);
    NodeUtil.removeChild(varNode, n1);
    assertEquals(1, varNode.getChildCount());
    assertEquals(n2, varNode.getFirstChild());
  }

  @Test
  public void testRemoveChild_VarOneChild_RemovesVarToo() {
    Node blockP = new Node(Token.BLOCK);
    Node varNode2 = new Node(Token.VAR);
    Node n3 = name("x");
    varNode2.addChildToBack(n3);
    blockP.addChildToBack(varNode2);
    NodeUtil.removeChild(varNode2, n3);
    assertEquals(0, blockP.getChildCount());
  }

  @Test
  public void testRemoveChild_BlockNode_DetachChildren() {
    Node ifNode = new Node(Token.IF);
    Node cond = new Node(Token.TRUE);
    Node thenBlock = new Node(Token.BLOCK);
    thenBlock.addChildToBack(new Node(Token.EMPTY));
    ifNode.addChildToBack(cond);
    ifNode.addChildToBack(thenBlock);
    NodeUtil.removeChild(ifNode, thenBlock);
    assertEquals(0, thenBlock.getChildCount());
    assertEquals(2, ifNode.getChildCount());
  }

  @Test
  public void testRemoveChild_LabelLastChild_RemovesLabelToo() {
    Node outerBlock = new Node(Token.BLOCK);
    Node labelNode = new Node(Token.LABEL);
    Node labelNameNode = name("L");
    Node exprStmt = new Node(Token.EXPR_RESULT, new Node(Token.CALL, name("foo")));
    labelNode.addChildToBack(labelNameNode);
    labelNode.addChildToBack(exprStmt);
    outerBlock.addChildToBack(labelNode);
    NodeUtil.removeChild(labelNode, exprStmt);
    assertEquals(0, outerBlock.getChildCount());
  }

  @Test
  public void testRemoveChild_ForFourChildren_ReplaceWithEmpty() {
    Node init = new Node(Token.EMPTY);
    Node cond = name("i");
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR);
    forNode.addChildToBack(init);
    forNode.addChildToBack(cond);
    forNode.addChildToBack(incr);
    forNode.addChildToBack(body);
    NodeUtil.removeChild(forNode, cond);
    Node newSecond = forNode.getFirstChild().getNext();
    assertEquals(Token.EMPTY, newSecond.getType());
    assertEquals(4, forNode.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveChild_UnhandledCase_Throws() {
    Node ifNode2 = new Node(Token.IF);
    Node cond2 = new Node(Token.TRUE);
    Node thenStmt = new Node(Token.EXPR_RESULT, new Node(Token.CALL, name("bar")));
    ifNode2.addChildToBack(cond2);
    ifNode2.addChildToBack(thenStmt);
    NodeUtil.removeChild(ifNode2, thenStmt);
  }

  // ==================== tryMergeBlock ====================

  @Test
  public void testTryMergeBlock_ParentIsBlock() {
    Node parentBlock = new Node(Token.BLOCK);
    Node before = new Node(