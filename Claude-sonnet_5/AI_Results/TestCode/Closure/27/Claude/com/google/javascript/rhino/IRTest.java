package com.google.javascript.rhino;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test สำหรับ IR (Defects4J Closure-27b)
 * ครอบคลุมทั้งเส้นทาง valid (สร้าง Node สำเร็จ) และ invalid
 * (Preconditions.checkState -> IllegalStateException)
 */
public class IRTest {

  // ---------- Helper Node builders (ใช้ผ่าน public API ของ IR เอง) ----------
  private Node nameNode() { return IR.name("a"); }
  private Node numberNode() { return IR.number(1); }
  private Node stringNode() { return IR.string("s"); }
  private Node blockNode() { return IR.block(); }
  private Node paramListNode() { return IR.paramList(); }
  private Node validFunction() {
    return IR.function(IR.name("f"), IR.paramList(), IR.block());
  }

  // ==================== empty() ====================
  @Test
  public void testEmpty() {
    Node n = IR.empty();
    assertEquals(Token.EMPTY, n.getType());
  }

  // ==================== function() ====================
  @Test
  public void testFunction_valid() {
    Node n = IR.function(IR.name("f"), IR.paramList(), IR.block());
    assertEquals(Token.FUNCTION, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunction_invalidName() {
    IR.function(numberNode(), IR.paramList(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunction_invalidParams() {
    IR.function(IR.name("f"), nameNode(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testFunction_invalidBody() {
    IR.function(IR.name("f"), IR.paramList(), nameNode());
  }

  // ==================== paramList() variants ====================
  @Test
  public void testParamListNoArg() {
    Node n = IR.paramList();
    assertEquals(Token.PARAM_LIST, n.getType());
    assertTrue(!n.hasChildren());
  }

  @Test
  public void testParamListSingle_valid() {
    Node n = IR.paramList(IR.name("x"));
    assertEquals(Token.PARAM_LIST, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testParamListSingle_invalid() {
    IR.paramList(numberNode());
  }

  @Test
  public void testParamListVarargs_emptyLoop() {
    Node n = IR.paramList(new Node[] {});
    assertEquals(Token.PARAM_LIST, n.getType());
  }

  @Test
  public void testParamListVarargs_valid() {
    Node n = IR.paramList(IR.name("x"), IR.name("y"));
    assertEquals(Token.PARAM_LIST, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testParamListVarargs_invalid() {
    IR.paramList(IR.name("x"), numberNode());
  }

  @Test
  public void testParamListList_valid() {
    List<Node> params = new ArrayList<Node>();
    params.add(IR.name("x"));
    Node n = IR.paramList(params);
    assertEquals(Token.PARAM_LIST, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testParamListList_invalid() {
    List<Node> params = new ArrayList<Node>();
    params.add(numberNode());
    IR.paramList(params);
  }

  // ==================== block() variants ====================
  @Test
  public void testBlockNoArg() {
    Node n = IR.block();
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test
  public void testBlockSingleStmt_valid() {
    Node n = IR.block(IR.exprResult(nameNode()));
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testBlockSingleStmt_invalid() {
    IR.block(nameNode()); // NAME ไม่ใช่ statement
  }

  @Test
  public void testBlockVarargs_emptyLoop() {
    Node n = IR.block(new Node[] {});
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test
  public void testBlockVarargs_valid() {
    Node n = IR.block(IR.returnNode(), IR.breakNode());
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testBlockVarargs_invalid() {
    IR.block(IR.returnNode(), nameNode());
  }

  // ==================== script() ====================
  @Test
  public void testScript_valid() {
    Node n = IR.script(IR.returnNode());
    assertEquals(Token.SCRIPT, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testScript_invalid() {
    IR.script(nameNode());
  }

  // ==================== var() ====================
  @Test
  public void testVarWithValue_valid() {
    Node n = IR.var(IR.name("x"), numberNode());
    assertEquals(Token.VAR, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testVarWithValue_invalidNotName() {
    IR.var(numberNode(), numberNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testVarWithValue_invalidNameHasChildren() {
    Node name = IR.name("x");
    name.addChildToFront(IR.number(1)); // ทำให้ hasChildren() == true
    IR.var(name, numberNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testVarWithValue_invalidValueNotExpression() {
    IR.var(IR.name("x"), blockNode());
  }

  @Test
  public void testVarNameOnly_valid() {
    Node n = IR.var(IR.name("x"));
    assertEquals(Token.VAR, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testVarNameOnly_invalid() {
    IR.var(numberNode());
  }

  // ==================== return / throw / exprResult ====================
  @Test
  public void testReturnNodeNoArg() {
    assertEquals(Token.RETURN, IR.returnNode().getType());
  }

  @Test
  public void testReturnNodeWithExpr_valid() {
    Node n = IR.returnNode(numberNode());
    assertEquals(Token.RETURN, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testReturnNodeWithExpr_invalid() {
    IR.returnNode(blockNode()); // covers mayBeExpression default(false)
  }

  @Test
  public void testThrowNode_valid() {
    Node n = IR.throwNode(numberNode());
    assertEquals(Token.THROW, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testThrowNode_invalid() {
    IR.throwNode(blockNode());
  }

  @Test
  public void testExprResult_valid() {
    Node n = IR.exprResult(nameNode());
    assertEquals(Token.EXPR_RESULT, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testExprResult_invalid() {
    IR.exprResult(blockNode());
  }

  // ==================== ifNode() ====================
  @Test
  public void testIfNodeTwoArg_valid() {
    Node n = IR.ifNode(nameNode(), IR.block());
    assertEquals(Token.IF, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testIfNodeTwoArg_invalidCond() {
    IR.ifNode(blockNode(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testIfNodeTwoArg_invalidThen() {
    IR.ifNode(nameNode(), nameNode());
  }

  @Test
  public void testIfNodeThreeArg_valid() {
    Node n = IR.ifNode(nameNode(), IR.block(), IR.block());
    assertEquals(Token.IF, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testIfNodeThreeArg_invalidElse() {
    IR.ifNode(nameNode(), IR.block(), nameNode());
  }

  // ==================== doNode() ====================
  @Test
  public void testDoNode_valid() {
    Node n = IR.doNode(IR.block(), nameNode());
    assertEquals(Token.DO, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testDoNode_invalidBody() {
    IR.doNode(nameNode(), nameNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testDoNode_invalidCond() {
    IR.doNode(IR.block(), blockNode());
  }

  // ==================== forIn() ====================
  @Test
  public void testForIn_validVarTarget() {
    Node n = IR.forIn(IR.var(IR.name("x")), nameNode(), IR.block());
    assertEquals(Token.FOR, n.getType());
  }

  @Test
  public void testForIn_validExprTarget() {
    Node n = IR.forIn(nameNode(), nameNode(), IR.block());
    assertEquals(Token.FOR, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testForIn_invalidTarget() {
    IR.forIn(blockNode(), nameNode(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForIn_invalidCond() {
    IR.forIn(nameNode(), blockNode(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForIn_invalidBody() {
    IR.forIn(nameNode(), nameNode(), nameNode());
  }

  // ==================== forNode() ====================
  @Test
  public void testForNode_valid() {
    Node n = IR.forNode(IR.var(IR.name("i")), nameNode(), nameNode(), IR.block());
    assertEquals(Token.FOR, n.getType());
  }

  @Test
  public void testForNode_validEmptyInitCondIncr() {
    // ครอบคลุม branch isEmpty() ของ mayBeExpressionOrEmpty
    Node n = IR.forNode(IR.empty(), IR.empty(), IR.empty(), IR.block());
    assertEquals(Token.FOR, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testForNode_invalidInit() {
    IR.forNode(blockNode(), IR.empty(), IR.empty(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForNode_invalidCond() {
    IR.forNode(IR.empty(), blockNode(), IR.empty(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForNode_invalidIncr() {
    IR.forNode(IR.empty(), IR.empty(), blockNode(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testForNode_invalidBody() {
    IR.forNode(IR.empty(), IR.empty(), IR.empty(), nameNode());
  }

  // ==================== switchNode() / caseNode() / defaultCase() ====================
  @Test
  public void testSwitchNode_validWithCaseAndDefault() {
    Node caseN = IR.caseNode(numberNode(), IR.block());
    Node defN = IR.defaultCase(IR.block());
    Node n = IR.switchNode(nameNode(), caseN, defN);
    assertEquals(Token.SWITCH, n.getType());
  }

  @Test
  public void testSwitchNode_validNoCase() {
    Node n = IR.switchNode(nameNode());
    assertEquals(Token.SWITCH, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testSwitchNode_invalidCond() {
    IR.switchNode(blockNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testSwitchNode_invalidCaseType() {
    IR.switchNode(nameNode(), nameNode()); // ไม่ใช่ case/defaultCase
  }

  @Test
  public void testCaseNode_valid() {
    Node n = IR.caseNode(numberNode(), IR.block());
    assertEquals(Token.CASE, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testCaseNode_invalidExpr() {
    IR.caseNode(blockNode(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testCaseNode_invalidBody() {
    IR.caseNode(numberNode(), nameNode());
  }

  @Test
  public void testDefaultCase_valid() {
    Node n = IR.defaultCase(IR.block());
    assertEquals(Token.DEFAULT_CASE, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testDefaultCase_invalid() {
    IR.defaultCase(nameNode());
  }

  // ==================== label() / labelName() ====================
  @Test
  public void testLabel_valid() {
    Node n = IR.label(IR.labelName("L"), IR.breakNode());
    assertEquals(Token.LABEL, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabel_invalidName() {
    IR.label(nameNode(), IR.breakNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabel_invalidStmt() {
    IR.label(IR.labelName("L"), nameNode());
  }

  @Test
  public void testLabelName_valid() {
    Node n = IR.labelName("L");
    assertEquals(Token.LABEL_NAME, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testLabelName_emptyInvalid() {
    IR.labelName(""); // !name.isEmpty() == false -> checkState fail
  }

  // ==================== tryFinally / tryCatch / tryCatchFinally / catchNode ====================
  // หมายเหตุ: source ของ tryFinally() เรียก tryBody.isLabelName() / finallyBody.isLabelName()
  // ซึ่งดูขัดกับความหมาย "block" ตามธรรมชาติ แต่ทดสอบตาม source ที่ให้มาจริง (ไม่เดา behavior เพิ่ม)
  @Test
  public void testTryFinally_valid() {
    Node n = IR.tryFinally(IR.labelName("a"), IR.labelName("b"));
    assertEquals(Token.TRY, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testTryFinally_invalidTryBody() {
    IR.tryFinally(nameNode(), IR.labelName("b"));
  }

  @Test(expected = IllegalStateException.class)
  public void testTryFinally_invalidFinallyBody() {
    IR.tryFinally(IR.labelName("a"), nameNode());
  }

  @Test
  public void testTryCatch_valid() {
    Node catchN = IR.catchNode(IR.name("e"), IR.block());
    Node n = IR.tryCatch(IR.block(), catchN);
    assertEquals(Token.TRY, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testTryCatch_invalidTryBody() {
    Node catchN = IR.catchNode(IR.name("e"), IR.block());
    IR.tryCatch(nameNode(), catchN);
  }

  @Test(expected = IllegalStateException.class)
  public void testTryCatch_invalidCatchNode() {
    IR.tryCatch(IR.block(), nameNode());
  }

  @Test
  public void testTryCatchFinally_valid() {
    Node catchN = IR.catchNode(IR.name("e"), IR.block());
    Node n = IR.tryCatchFinally(IR.block(), catchN, IR.block());
    assertEquals(Token.TRY, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testTryCatchFinally_invalidFinally() {
    Node catchN = IR.catchNode(IR.name("e"), IR.block());
    IR.tryCatchFinally(IR.block(), catchN, nameNode());
  }

  @Test
  public void testCatchNode_valid() {
    Node n = IR.catchNode(IR.name("e"), IR.block());
    assertEquals(Token.CATCH, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testCatchNode_invalidExpr() {
    IR.catchNode(numberNode(), IR.block());
  }

  @Test(expected = IllegalStateException.class)
  public void testCatchNode_invalidBody() {
    IR.catchNode(IR.name("e"), nameNode());
  }

  // ==================== break / continue ====================
  @Test
  public void testBreakNodeNoArg() {
    assertEquals(Token.BREAK, IR.breakNode().getType());
  }

  @Test
  public void testBreakNodeWithName_valid() {
    Node n = IR.breakNode(IR.labelName("L"));
    assertEquals(Token.BREAK, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testBreakNodeWithName_invalid() {
    IR.breakNode(nameNode());
  }

  @Test
  public void testContinueNodeNoArg() {
    assertEquals(Token.CONTINUE, IR.continueNode().getType());
  }

  @Test
  public void testContinueNodeWithName_valid() {
    Node n = IR.continueNode(IR.labelName("L"));
    assertEquals(Token.CONTINUE, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testContinueNodeWithName_invalid() {
    IR.continueNode(nameNode());
  }

  // ==================== call / newNode ====================
  @Test
  public void testCall_validNoArgs() {
    Node n = IR.call(nameNode());
    assertEquals(Token.CALL, n.getType());
  }

  @Test
  public void testCall_validWithArgs() {
    Node n = IR.call(nameNode(), numberNode(), stringNode());
    assertEquals(Token.CALL, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testCall_invalidArg() {
    IR.call(nameNode(), blockNode());
  }

  @Test
  public void testNewNode_valid() {
    Node n = IR.newNode(nameNode(), numberNode());
    assertEquals(Token.NEW, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testNewNode_invalidArg() {
    IR.newNode(nameNode(), blockNode());
  }

  // ==================== name / getprop / getelem ====================
  @Test
  public void testName() {
    Node n = IR.name("foo");
    assertEquals(Token.NAME, n.getType());
  }

  @Test
  public void testGetProp_valid() {
    Node n = IR.getprop(nameNode(), IR.string("p"));
    assertEquals(Token.GETPROP, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetProp_invalidTarget() {
    IR.getprop(blockNode(), IR.string("p"));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetProp_invalidProp() {
    IR.getprop(nameNode(), numberNode());
  }

  @Test
  public void testGetElem_valid() {
    Node n = IR.getelem(nameNode(), numberNode());
    assertEquals(Token.GETELEM, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetElem_invalidTarget() {
    IR.getelem(blockNode(), numberNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testGetElem_invalidElem() {
    IR.getelem(nameNode(), blockNode());
  }

  // ==================== assign() -> isAssignmentTarget branches ====================
  @Test
  public void testAssign_validNameTarget() {
    Node n = IR.assign(IR.name("x"), numberNode());
    assertEquals(Token.ASSIGN, n.getType());
  }

  @Test
  public void testAssign_validGetPropTarget() {
    Node target = IR.getprop(nameNode(), IR.string("p"));
    Node n = IR.assign(target, numberNode());
    assertEquals(Token.ASSIGN, n.getType());
  }

  @Test
  public void testAssign_validGetElemTarget() {
    Node target = IR.getelem(nameNode(), numberNode());
    Node n = IR.assign(target, numberNode());
    assertEquals(Token.ASSIGN, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testAssign_invalidTarget() {
    IR.assign(numberNode(), numberNode()); // ไม่ใช่ name/getprop/getelem
  }

  @Test(expected = IllegalStateException.class)
  public void testAssign_invalidExpr() {
    IR.assign(nameNode(), blockNode());
  }

  // ==================== hook() ====================
  @Test
  public void testHook_valid() {
    Node n = IR.hook(nameNode(), numberNode(), stringNode());
    assertEquals(Token.HOOK, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testHook_invalidCond() {
    IR.hook(blockNode(), numberNode(), stringNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testHook_invalidTrue() {
    IR.hook(nameNode(), blockNode(), stringNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testHook_invalidFalse() {
    IR.hook(nameNode(), numberNode(), blockNode());
  }

  // ==================== binaryOp wrappers: comma/and/or/eq/sheq/add/sub ====================
  @Test
  public void testComma_valid() {
    assertEquals(Token.COMMA, IR.comma(nameNode(), numberNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testComma_invalid() {
    IR.comma(blockNode(), numberNode());
  }

  @Test
  public void testAnd_valid() {
    assertEquals(Token.AND, IR.and(nameNode(), numberNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testAnd_invalid() {
    IR.and(nameNode(), blockNode());
  }

  @Test
  public void testOr_valid() {
    assertEquals(Token.OR, IR.or(nameNode(), numberNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testOr_invalid() {
    IR.or(blockNode(), numberNode());
  }

  @Test
  public void testEq_valid() {
    assertEquals(Token.EQ, IR.eq(nameNode(), numberNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testEq_invalid() {
    IR.eq(nameNode(), blockNode());
  }

  @Test
  public void testSheq_valid() {
    assertEquals(Token.SHEQ, IR.sheq(nameNode(), numberNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testSheq_invalid() {
    IR.sheq(blockNode(), numberNode());
  }

  @Test
  public void testAdd_valid() {
    assertEquals(Token.ADD, IR.add(nameNode(), numberNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testAdd_invalid() {
    IR.add(nameNode(), blockNode());
  }

  @Test
  public void testSub_valid() {
    assertEquals(Token.SUB, IR.sub(nameNode(), numberNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testSub_invalid() {
    IR.sub(blockNode(), numberNode());
  }

  // ==================== unaryOp wrappers: not/voidNode/neg/pos ====================
  @Test
  public void testNot_valid() {
    assertEquals(Token.NOT, IR.not(nameNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testNot_invalid() {
    IR.not(blockNode());
  }

  @Test
  public void testVoidNode_valid() {
    assertEquals(Token.VOID, IR.voidNode(nameNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testVoidNode_invalid() {
    IR.voidNode(blockNode());
  }

  @Test
  public void testNeg_valid() {
    assertEquals(Token.NEG, IR.neg(nameNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testNeg_invalid() {
    IR.neg(blockNode());
  }

  @Test
  public void testPos_valid() {
    assertEquals(Token.POS, IR.pos(nameNode()).getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testPos_invalid() {
    IR.pos(blockNode());
  }

  // ==================== objectlit() / propdef() ====================
  @Test
  public void testObjectLit_validStringKey() {
    Node prop = IR.propdef(IR.stringKey("k"), numberNode());
    Node n = IR.objectlit(prop);
    assertEquals(Token.OBJECTLIT, n.getType());
  }

  @Test
  public void testObjectLit_validNoArgs() {
    Node n = IR.objectlit();
    assertEquals(Token.OBJECTLIT, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testObjectLit_invalidType() {
    IR.objectlit(nameNode()); // ไม่ใช่ stringKey/getterDef/setterDef
  }

  @Test(expected = IllegalStateException.class)
  public void testObjectLit_invalidMultipleChildren() {
    Node key = IR.stringKey("k");
    key.addChildToFront(IR.number(1));
    key.addChildToFront(IR.number(2)); // มากกว่า 1 child -> hasOneChild() false
    IR.objectlit(key);
  }

  @Test
  public void testPropdef_valid() {
    Node n = IR.propdef(IR.stringKey("k"), numberNode());
    assertEquals(Token.STRING_KEY, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testPropdef_invalidStringNotKey() {
    IR.propdef(nameNode(), numberNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testPropdef_invalidHasChildren() {
    Node key = IR.stringKey("k");
    key.addChildToFront(IR.number(1)); // มี child อยู่แล้ว
    IR.propdef(key, numberNode());
  }

  @Test(expected = IllegalStateException.class)
  public void testPropdef_invalidValueNotExpr() {
    IR.propdef(IR.stringKey("k"), blockNode());
  }

  // ==================== arraylit() -> mayBeExpressionOrEmpty branches ====================
  @Test
  public void testArrayLit_validExpr() {
    Node n = IR.arraylit(numberNode(), stringNode());
    assertEquals(Token.ARRAYLIT, n.getType());
  }

  @Test
  public void testArrayLit_validWithEmptyHole() {
    Node n = IR.arraylit(IR.empty(), numberNode());
    assertEquals(Token.ARRAYLIT, n.getType());
  }

  @Test
  public void testArrayLit_validNoArgs() {
    Node n = IR.arraylit();
    assertEquals(Token.ARRAYLIT, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testArrayLit_invalid() {
    IR.arraylit(blockNode()); // ไม่ empty และไม่ expression
  }

  // ==================== regexp() ====================
  @Test
  public void testRegexpOneArg_valid() {
    Node n = IR.regexp(IR.string("a"));
    assertEquals(Token.REGEXP, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testRegexpOneArg_invalid() {
    IR.regexp(numberNode());
  }

  @Test
  public void testRegexpTwoArg_valid() {
    Node n = IR.regexp(IR.string("a"), IR.string("g"));
    assertEquals(Token.REGEXP, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testRegexpTwoArg_invalidExpr() {
    IR.regexp(numberNode(), IR.string("g"));
  }

  @Test(expected = IllegalStateException.class)
  public void testRegexpTwoArg_invalidFlags() {
    IR.regexp(IR.string("a"), numberNode());
  }

  // ==================== literal factories (no branch) ====================
  @Test
  public void testStringFactory() {
    Node n = IR.string("hi");
    assertEquals(Token.STRING, n.getType());
  }

  @Test
  public void testStringKeyFactory() {
    Node n = IR.stringKey("k");
    assertEquals(Token.STRING_KEY, n.getType());
  }

  @Test
  public void testNumberFactory() {
    Node n = IR.number(3.14);
    assertEquals(Token.NUMBER, n.getType());
  }

  @Test
  public void testThisNode() {
    assertEquals(Token.THIS, IR.thisNode().getType());
  }

  @Test
  public void testTrueNode() {
    assertEquals(Token.TRUE, IR.trueNode().getType());
  }

  @Test
  public void testFalseNode() {
    assertEquals(Token.FALSE, IR.falseNode().getType());
  }

  @Test
  public void testNullNode() {
    assertEquals(Token.NULL, IR.nullNode().getType());
  }

  // ==================== mayBeStatement: เพิ่ม token ที่หาผ่าน public API ได้ ====================
  @Test
  public void testMayBeStatement_ContinueTokenViaBlock() {
    // ครอบคลุม case Token.CONTINUE ใน mayBeStatement
    Node n = IR.block(IR.continueNode());
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test
  public void testMayBeStatement_TryTokenViaBlock() {
    // ครอบคลุม case Token.TRY
    Node catchN = IR.catchNode(IR.name("e"), IR.block());
    Node tryN = IR.tryCatch(IR.block(), catchN);
    Node n = IR.block(tryN);
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test
  public void testMayBeStatement_LabelTokenViaBlock() {
    // ครอบคลุม case Token.LABEL
    Node labelN = IR.label(IR.labelName("L"), IR.breakNode());
    Node n = IR.block(labelN);
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test
  public void testMayBeStatement_SwitchTokenViaBlock() {
    // ครอบคลุม case Token.SWITCH
    Node switchN = IR.switchNode(nameNode());
    Node n = IR.block(switchN);
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test
  public void testMayBeStatement_ForTokenViaBlock() {
    // ครอบคลุม case Token.FOR
    Node forN = IR.forIn(nameNode(), nameNode(), IR.block());
    Node n = IR.block(forN);
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test
  public void testMayBeStatement_DoTokenViaBlock() {
    // ครอบคลุม case Token.DO
    Node doN = IR.doNode(IR.block(), nameNode());
    Node n = IR.block(doN);
    assertEquals(Token.BLOCK, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testMayBeStatement_defaultFalse() {
    // NAME ไม่อยู่ใน case ใด ๆ -> default: false
    IR.block(nameNode());
  }

  // ==================== mayBeExpression: เพิ่ม token ที่หาผ่าน public API ได้ ====================
  @Test
  public void testMayBeExpression_ArrayLitViaReturn() {
    Node n = IR.returnNode(IR.arraylit());
    assertEquals(Token.RETURN, n.getType());
  }

  @Test
  public void testMayBeExpression_ObjectLitViaReturn() {
    Node n = IR.returnNode(IR.objectlit());
    assertEquals(Token.RETURN, n.getType());
  }

  @Test
  public void testMayBeExpression_CallViaReturn() {
    Node n = IR.returnNode(IR.call(nameNode()));
    assertEquals(Token.RETURN, n.getType());
  }

  @Test
  public void testMayBeExpression_HookViaReturn() {
    Node n = IR.returnNode(IR.hook(nameNode(), numberNode(), stringNode()));
    assertEquals(Token.RETURN, n.getType());
  }

  @Test
  public void testMayBeExpression_NullViaReturn() {
    Node n = IR.returnNode(IR.nullNode());
    assertEquals(Token.RETURN, n.getType());
  }

  @Test
  public void testMayBeExpression_TrueFalseViaReturn() {
    assertEquals(Token.RETURN, IR.returnNode(IR.trueNode()).getType());
    assertEquals(Token.RETURN, IR.returnNode(IR.falseNode()).getType());
  }

  @Test
  public void testMayBeExpression_ThisViaReturn() {
    Node n = IR.returnNode(IR.thisNode());
    assertEquals(Token.RETURN, n.getType());
  }

  @Test
  public void testMayBeExpression_FunctionViaReturn() {
    Node n = IR.returnNode(validFunction());
    assertEquals(Token.RETURN, n.getType());
  }

  @Test(expected = IllegalStateException.class)
  public void testMayBeExpression_defaultFalse_paramList() {
    // PARAM_LIST ไม่อยู่ใน case ใด ๆ -> default: false
    IR.returnNode(paramListNode());
  }

  // ==================== isAssignmentTarget (private) via assign() - เพิ่มความมั่นใจ ====================
  @Test(expected = IllegalStateException.class)
  public void testIsAssignmentTarget_falseBranch_block() {
    IR.assign(blockNode(), numberNode());
  }
}
