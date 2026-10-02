# หมายเหตุสำคัญก่อนเริ่ม (ข้อสมมติที่ใช้ – ตามข้อกำหนดที่ 4)

เนื่องจาก `PeepholeSubstituteAlternateSyntax` เป็น **package-private class** ที่สืบทอดจาก `AbstractPeepholeOptimization` (ซึ่งไม่ได้ให้ซอร์สมาด้วย) และพึ่งพา `Node`, `IR`, `Token`, `Compiler` ฯลฯ ที่เป็นคลาสร่วม package (`com.google.javascript.jscomp` / `com.google.javascript.rhino`) ดังนั้น:

1. **ต้องวางคลาสทดสอบไว้ใน package เดียวกัน** (`com.google.javascript.jscomp`) จึงไม่ต้อง `import` ตัวคลาสเป้าหมายโดยตรง (การเข้าถึงได้ถูกต้องคือ "ไม่ import" เพราะ package-private) — commented ไว้ในโค้ด
2. สมมติว่า `AbstractPeepholeOptimization` มีเมธอด package-private `void beginTraversal(AbstractCompiler compiler)` (ตามรูปแบบมาตรฐานของ Closure Compiler ที่ `PeepholeOptimizationsPass` ใช้เรียกก่อน `optimizeSubtree`) — ไม่มีอยู่ในซอร์สที่ให้มา จึง **คอมเมนต์กำกับ** ทุกจุดที่ใช้
3. สมมติ signature มาตรฐานของ `com.google.javascript.rhino.IR` (name/string/number/block/ifNode/returnNode/not/and/or/hook/call/newNode/arraylit/trueNode/falseNode/assign) และ `com.google.javascript.jscomp.Compiler#initOptions(CompilerOptions)`
4. **ข้ามการทดสอบ** switch-case `RETURN`, `THROW`, `WHILE/DO`, `FOR` ของ `optimizeSubtree` เพราะพึ่งพา `ControlFlowAnalysis` (ไม่มีซอร์สให้ตรวจสอบพฤติกรรมภายใน) — เสี่ยงต่อการ "เดา behavior"
5. `isASTNormalized()` จะเป็น `false` โดย default (เราไม่บังคับ normalize) → กรณีทดสอบที่ต้องพึ่ง normalized=true จะถูก**ข้าม**และคอมเมนต์ไว้

```java
package com.google.javascript.jscomp;

// หมายเหตุ: อยู่ package เดียวกับ PeepholeSubstituteAlternateSyntax (package-private class)
// จึงไม่จำเป็นต้อง import ตัว class เป้าหมายโดยตรง

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

public class PeepholeSubstituteAlternateSyntaxTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // สมมติฐาน: initOptions เป็น API มาตรฐานของ Compiler สำหรับเตรียม CompilerOptions ก่อนใช้งาน
    compiler.initOptions(new CompilerOptions());
  }

  /**
   * สร้าง instance ของ pass และผูก compiler เข้ากับมัน
   * ข้อสมมติ (ไม่มีในซอร์สที่ให้มา): AbstractPeepholeOptimization มีเมธอด
   * package-private beginTraversal(AbstractCompiler) สำหรับตั้งค่า compiler ภายใน
   * ซึ่งจำเป็นสำหรับ reportCodeChange()/isASTNormalized()/mayHaveSideEffects()/getCodingConvention()
   */
  private PeepholeSubstituteAlternateSyntax newPass(boolean late) {
    PeepholeSubstituteAlternateSyntax pass = new PeepholeSubstituteAlternateSyntax(late);
    pass.beginTraversal(compiler);
    return pass;
  }

  private Node wrapInBlock(Node child) {
    Node block = IR.block();
    block.addChildToBack(child);
    return block;
  }

  // ---------------------------------------------------------------------
  // default case ของ switch ใน optimizeSubtree (Token ที่ไม่ถูกจัดการเป็นพิเศษ)
  // ---------------------------------------------------------------------
  @Test
  public void testOptimizeSubtree_defaultCase_unchanged() {
    Node add = new Node(Token.ADD, IR.number(1), IR.number(2));
    wrapInBlock(IR.exprResult(add));
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(add);
    assertSame(add, result);
    assertEquals(Token.ADD, result.getType());
  }

  // ---------------------------------------------------------------------
  // Token.NOT -> tryMinimizeNot
  // ---------------------------------------------------------------------
  @Test
  public void testNot_eqToNe() {
    Node eq = new Node(Token.EQ, IR.name("a"), IR.name("b"));
    Node not = IR.not(eq);
    IR.exprResult(not); // ให้ not มี parent
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(not);
    assertEquals(Token.NE, result.getType());
  }

  @Test
  public void testNot_neToEq() {
    Node ne = new Node(Token.NE, IR.name("a"), IR.name("b"));
    Node not = IR.not(ne);
    IR.exprResult(not);
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(not);
    assertEquals(Token.EQ, result.getType());
  }

  @Test
  public void testNot_sheqToShne() {
    Node sheq = new Node(Token.SHEQ, IR.name("a"), IR.name("b"));
    Node not = IR.not(sheq);
    IR.exprResult(not);
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(not);
    assertEquals(Token.SHNE, result.getType());
  }

  @Test
  public void testNot_shneToSheq() {
    Node shne = new Node(Token.SHNE, IR.name("a"), IR.name("b"));
    Node not = IR.not(shne);
    IR.exprResult(not);
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(not);
    assertEquals(Token.SHEQ, result.getType());
  }

  @Test
  public void testNot_defaultUnchanged_gt() {
    // GT ไม่ถูกจัดการ (คอมเมนต์ในซอร์ส: !(x<NaN) != x>=NaN)
    Node gt = new Node(Token.GT, IR.name("a"), IR.name("b"));
    Node not = IR.not(gt);
    IR.exprResult(not);
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(not);
    assertSame(not, result);
    assertEquals(Token.NOT, result.getType());
  }

  // ---------------------------------------------------------------------
  // Token.TRUE / Token.FALSE -> reduceTrueFalse (ขึ้นกับ late)
  // ---------------------------------------------------------------------
  @Test
  public void testReduceTrueFalse_lateTrue_trueNode() {
    Node t = IR.trueNode();
    IR.exprResult(t);
    PeepholeSubstituteAlternateSyntax pass = newPass(true);
    Node result = pass.optimizeSubtree(t);
    assertEquals(Token.NOT, result.getType());
    assertEquals(Token.NUMBER, result.getFirstChild().getType());
    assertEquals(0.0, result.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testReduceTrueFalse_lateTrue_falseNode() {
    Node f = IR.falseNode();
    IR.exprResult(f);
    PeepholeSubstituteAlternateSyntax pass = newPass(true);
    Node result = pass.optimizeSubtree(f);
    assertEquals(Token.NOT, result.getType());
    assertEquals(1.0, result.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testReduceTrueFalse_lateFalse_unchanged() {
    Node t = IR.trueNode();
    IR.exprResult(t);
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(t);
    assertSame(t, result);
    assertEquals(Token.TRUE, result.getType());
  }

  // ---------------------------------------------------------------------
  // Token.COMMA -> trySplitComma (ขึ้นกับ late และ parent)
  // ---------------------------------------------------------------------
  @Test
  public void testSplitComma_lateTrue_noChange() {
    Node comma = new Node(Token.COMMA, IR.name("a"), IR.name("b"));
    Node exprResult = IR.exprResult(comma);
    wrapInBlock(exprResult);
    PeepholeSubstituteAlternateSyntax pass = newPass(true);
    Node result = pass.optimizeSubtree(comma);
    assertSame(comma, result);
  }

  @Test
  public void testSplitComma_lateFalse_exprResultParent_splits() {
    Node left = IR.name("a");
    Node right = IR.name("b");
    Node comma = new Node(Token.COMMA, left, right);
    Node exprResult = IR.exprResult(comma);
    Node block = wrapInBlock(exprResult);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(comma);

    assertSame(left, result);
    assertEquals(2, block.getChildCount());
    assertEquals(Token.EXPR_RESULT, block.getFirstChild().getType());
    assertSame(left, block.getFirstChild().getFirstChild());
    assertEquals(Token.EXPR_RESULT, block.getLastChild().getType());
    assertSame(right, block.getLastChild().getFirstChild());
  }

  @Test
  public void testSplitComma_lateFalse_nonExprResultParent_noChange() {
    // parent เป็น BLOCK ตรง ๆ (ไม่ใช่ EXPR_RESULT) -> ไม่ split
    Node comma = new Node(Token.COMMA, IR.name("a"), IR.name("b"));
    wrapInBlock(comma);
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(comma);
    assertSame(comma, result);
  }

  @Test
  public void testSplitComma_lateFalse_labelParent_noChange() {
    Node comma = new Node(Token.COMMA, IR.name("a"), IR.name("b"));
    Node exprResult = IR.exprResult(comma);
    // สมมติฐาน: constructor Node(int, Node) ใช้สร้าง LABEL ที่มี exprResult เป็นลูกได้
    new Node(Token.LABEL, exprResult);
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(comma);
    assertSame(comma, result);
  }

  // ---------------------------------------------------------------------
  // Token.NAME "undefined" -> tryReplaceUndefined (isASTNormalized() = false โดย default)
  // ---------------------------------------------------------------------
  @Test
  public void testReplaceUndefined_notNormalized_unchanged() {
    Node name = IR.name("undefined");
    wrapInBlock(IR.exprResult(name));
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(name);
    // เนื่องจาก isASTNormalized() เป็น false โดย default (ไม่ได้ normalize)
    // เงื่อนไข AND ทั้งหมด short-circuit เป็น false -> คืนค่า node เดิม
    assertSame(name, result);
    assertEquals("undefined", result.getString());
  }

  // ---------------------------------------------------------------------
  // Token.ARRAYLIT -> tryMinimizeArrayLiteral / tryMinimizeStringArrayLiteral
  // ---------------------------------------------------------------------
  @Test
  public void testArrayLiteral_mixedTypes_unchanged() {
    Node arr = IR.arraylit();
    arr.addChildToBack(IR.string("a"));
    arr.addChildToBack(IR.number(1));
    wrapInBlock(IR.exprResult(arr));
    PeepholeSubstituteAlternateSyntax pass = newPass(true);
    Node result = pass.optimizeSubtree(arr);
    assertSame(arr, result);
  }

  @Test
  public void testArrayLiteral_allStrings_lateFalse_unchanged() {
    Node arr = IR.arraylit();
    for (int i = 0; i < 6; i++) {
      arr.addChildToBack(IR.string("s" + i));
    }
    wrapInBlock(IR.exprResult(arr));
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(arr);
    assertSame(arr, result);
  }

  @Test
  public void testArrayLiteral_allStrings_lateTrue_smallSavingUnchanged() {
    Node arr = IR.arraylit();
    arr.addChildToBack(IR.string("a")); // 1 element -> saving <= 0
    wrapInBlock(IR.exprResult(arr));
    PeepholeSubstituteAlternateSyntax pass = newPass(true);
    Node result = pass.optimizeSubtree(arr);
    assertSame(arr, result);
  }

  @Test
  public void testArrayLiteral_allStrings_lateTrue_foldsToSplitCall() {
    Node arr = IR.arraylit();
    String[] chars = {"a", "b", "c", "d", "e", "f"};
    for (String c : chars) {
      arr.addChildToBack(IR.string(c));
    }
    wrapInBlock(IR.exprResult(arr));
    PeepholeSubstituteAlternateSyntax pass = newPass(true);
    Node result = pass.optimizeSubtree(arr);

    assertEquals(Token.CALL, result.getType());
    Node getProp = result.getFirstChild();
    assertEquals(Token.GETPROP, getProp.getType());
    assertEquals("abcdef", getProp.getFirstChild().getString());
    assertEquals("split", getProp.getLastChild().getString());
    assertEquals("", result.getLastChild().getString());
  }

  @Test
  public void testArrayLiteral_allStrings_lateTrue_noDelimiterFound_unchanged() {
    Node arr = IR.arraylit();
    // สตริงที่มีตัวคั่นที่เป็นไปได้ทุกตัว (" ", ";", ",", "{", "}") ครบทุกตัว
    for (int i = 0; i < 6; i++) {
      arr.addChildToBack(IR.string(" ;,{}X"));
    }
    wrapInBlock(IR.exprResult(arr));
    PeepholeSubstituteAlternateSyntax pass = newPass(true);
    Node result = pass.optimizeSubtree(arr);
    assertSame(arr, result);
  }

  // ---------------------------------------------------------------------
  // Token.CALL -> tryFoldSimpleFunctionCall / tryFoldImmediateCallToBoundFunction
  // ---------------------------------------------------------------------
  @Test
  public void testFoldSimpleFunctionCall_stringWithArg() {
    Node target = IR.name("String");
    Node call = IR.call(target, IR.string("abc"));
    wrapInBlock(IR.exprResult(call));
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(call);

    assertEquals(Token.ADD, result.getType());
    assertEquals(Token.STRING, result.getFirstChild().getType());
    assertEquals("", result.getFirstChild().getString());
    assertEquals("abc", result.getLastChild().getString());
  }

  @Test
  public void testFoldSimpleFunctionCall_stringNoArg_unchanged() {
    Node call = IR.call(IR.name("String"));
    wrapInBlock(IR.exprResult(call));
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(call);
    assertSame(call, result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testFoldSimpleFunctionCall_notStringFunction_unchanged() {
    Node call = IR.call(IR.name("foo"), IR.string("abc"));
    wrapInBlock(IR.exprResult(call));
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(call);
    assertSame(call, result);
  }

  // ---------------------------------------------------------------------
  // Token.NEW -> tryFoldStandardConstructors (isASTNormalized()=false -> ไม่แปลง)
  // ---------------------------------------------------------------------
  @Test
  public void testNewStandardConstructor_notNormalized_unchanged() {
    Node newNode = IR.newNode(IR.name("Object"));
    wrapInBlock(IR.exprResult(newNode));
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(newNode);
    assertSame(newNode, result);
    assertEquals(Token.NEW, result.getType());
  }

  // ---------------------------------------------------------------------
  // Token.IF -> tryMinimizeIf
  // ---------------------------------------------------------------------
  @Test
  public void testMinimizeIf_literalCondition_reducedToNumber() {
    Node cond = IR.trueNode();
    Node thenBlock = IR.block(IR.exprResult(IR.call(IR.name("foo"))));
    Node ifNode = IR.ifNode(cond, thenBlock);
    wrapInBlock(ifNode);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(ifNode);

    assertSame(ifNode, result);
    assertEquals(Token.NUMBER, ifNode.getFirstChild().getType());
    assertEquals(1.0, ifNode.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void testMinimizeIf_thenExprBlock_toAnd() {
    Node cond = IR.name("x");
    Node thenBlock = IR.block(IR.exprResult(IR.call(IR.name("foo"))));
    Node ifNode = IR.ifNode(cond, thenBlock);
    Node outer = wrapInBlock(ifNode);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(ifNode);

    assertSame(outer.getFirstChild(), result);
    assertEquals(Token.EXPR_RESULT, result.getType());
    Node and = result.getFirstChild();
    assertEquals(Token.AND, and.getType());
    assertEquals("x", and.getFirstChild().getString());
    assertEquals(Token.CALL, and.getLastChild().getType());
  }

  @Test
  public void testMinimizeIf_notCond_thenExprBlock_toOr() {
    Node cond = IR.not(IR.name("x"));
    Node thenBlock = IR.block(IR.exprResult(IR.call(IR.name("foo"))));
    Node ifNode = IR.ifNode(cond, thenBlock);
    Node outer = wrapInBlock(ifNode);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(ifNode);

    assertSame(outer.getFirstChild(), result);
    Node or = result.getFirstChild();
    assertEquals(Token.OR, or.getType());
    assertEquals("x", or.getFirstChild().getString());
    assertEquals(Token.CALL, or.getLastChild().getType());
  }

  @Test
  public void testMinimizeIf_bothReturnExpr_toHookReturn() {
    Node cond = IR.name("x");
    Node thenBlock = IR.block(IR.returnNode(IR.number(1)));
    Node elseBlock = IR.block(IR.returnNode(IR.number(2)));
    Node ifNode = IR.ifNode(cond, thenBlock, elseBlock);
    Node outer = wrapInBlock(ifNode);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(ifNode);

    assertSame(outer.getFirstChild(), result);
    assertEquals(Token.RETURN, result.getType());
    Node hook = result.getFirstChild();
    assertEquals(Token.HOOK, hook.getType());
    assertEquals("x", hook.getFirstChild().getString());
    assertEquals(1.0, hook.getFirstChild().getNext().getDouble(), 0.0);
    assertEquals(2.0, hook.getLastChild().getDouble(), 0.0);
  }

  // ---------------------------------------------------------------------
  // Token.EXPR_RESULT / Token.HOOK -> tryMinimizeCondition ผ่าน optimizeSubtree
  // ---------------------------------------------------------------------
  @Test
  public void testExprResult_doubleNot_minimizedCondition() {
    Node expr = IR.not(IR.not(IR.name("x")));
    Node exprResult = IR.exprResult(expr);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(exprResult);

    assertSame(exprResult, result);
    assertEquals(Token.NAME, exprResult.getFirstChild().getType());
    assertEquals("x", exprResult.getFirstChild().getString());
  }

  @Test
  public void testHook_doubleNot_inCondition() {
    Node cond = IR.not(IR.not(IR.name("x")));
    Node hook = IR.hook(cond, IR.number(1), IR.number(2));

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(hook);

    assertSame(hook, result);
    assertEquals(Token.NAME, hook.getFirstChild().getType());
    assertEquals("x", hook.getFirstChild().getString());
  }

  // ---------------------------------------------------------------------
  // Token.BLOCK -> tryReplaceIf
  // ---------------------------------------------------------------------
  @Test
  public void testReplaceIf_mergeOrCondition() {
    Node if1 = IR.ifNode(IR.name("x"), IR.block(IR.returnNode(IR.number(1))));
    Node if2 = IR.ifNode(IR.name("y"), IR.block(IR.returnNode(IR.number(1))));
    Node block = IR.block();
    block.addChildToBack(if1);
    block.addChildToBack(if2);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(block);

    assertSame(block, result);
    assertEquals(1, block.getChildCount());
    Node remaining = block.getFirstChild();
    assertSame(if2, remaining);
    Node orNode = remaining.getFirstChild();
    assertEquals(Token.OR, orNode.getType());
    assertEquals("x", orNode.getFirstChild().getString());
    assertEquals("y", orNode.getLastChild().getString());
  }

  @Test
  public void testReplaceIf_mergeAndCondition() {
    Node if1 = IR.ifNode(IR.name("x"), IR.block(IR.returnNode(IR.number(1))));
    Node if2 = IR.ifNode(
        IR.name("y"),
        IR.block(IR.exprResult(IR.call(IR.name("foo")))),
        IR.block(IR.returnNode(IR.number(1))));
    Node block = IR.block();
    block.addChildToBack(if1);
    block.addChildToBack(if2);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(block);

    assertSame(block, result);
    assertEquals(1, block.getChildCount());
    Node remaining = block.getFirstChild();
    assertSame(if2, remaining);
    assertEquals(3, remaining.getChildCount());
    Node andNode = remaining.getFirstChild();
    assertEquals(Token.AND, andNode.getType());
    assertEquals(Token.NOT, andNode.getFirstChild().getType());
    assertEquals("y", andNode.getLastChild().getString());
  }

  @Test
  public void testReplaceIf_ifReturnThenReturnExpr_toHookReturn() {
    Node if1 = IR.ifNode(IR.name("x"), IR.block(IR.returnNode(IR.number(5))));
    Node ret1 = IR.returnNode(IR.number(1));
    Node block = IR.block();
    block.addChildToBack(if1);
    block.addChildToBack(ret1);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(block);

    assertSame(block, result);
    assertEquals(1, block.getChildCount());
    Node child = block.getFirstChild();
    assertEquals(Token.RETURN, child.getType());
    Node hook = child.getFirstChild();
    assertEquals(Token.HOOK, hook.getType());
    assertEquals("x", hook.getFirstChild().getString());
    assertEquals(5.0, hook.getFirstChild().getNext().getDouble(), 0.0);
    assertEquals(1.0, hook.getLastChild().getDouble(), 0.0);
  }

  @Test
  public void testReplaceIf_emptyBlock_unchanged() {
    Node block = IR.block();
    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(block);
    assertSame(block, result);
    assertEquals(0, block.getChildCount());
  }

  @Test
  public void testReplaceIf_noIfStatement_unchanged() {
    Node exprResult = IR.exprResult(IR.call(IR.name("foo")));
    Node block = IR.block();
    block.addChildToBack(exprResult);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(block);

    assertSame(block, result);
    assertEquals(1, block.getChildCount());
    assertSame(exprResult, block.getFirstChild());
  }

  @Test
  public void testReplaceIf_elseHoistedWhenThenExits() {
    Node cond = IR.name("x");
    Node thenBlock = IR.block(IR.returnNode(IR.number(1)));
    Node elseBlock = IR.block(IR.exprResult(IR.assign(IR.name("y"), IR.number(2))));
    Node ifNode = IR.ifNode(cond, thenBlock, elseBlock);
    Node block = IR.block();
    block.addChildToBack(ifNode);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(block);

    assertSame(block, result);
    assertEquals(2, block.getChildCount());
    assertSame(ifNode, block.getFirstChild());
    assertEquals(2, ifNode.getChildCount()); // else ถูกดึงออก
    assertSame(elseBlock, block.getLastChild());
  }

  @Test
  public void testReplaceIf_noHoistWhenThenDoesNotExit() {
    Node thenBlock = IR.block(IR.exprResult(IR.assign(IR.name("z"), IR.number(9))));
    Node elseBlock = IR.block(IR.exprResult(IR.assign(IR.name("y"), IR.number(2))));
    Node ifNode = IR.ifNode(IR.name("x"), thenBlock, elseBlock);
    Node block = IR.block();
    block.addChildToBack(ifNode);

    PeepholeSubstituteAlternateSyntax pass = newPass(false);
    Node result = pass.optimizeSubtree(block);

    assertSame(block, result);
    assertEquals(1, block.getChildCount());
    assertSame(ifNode, block.getFirstChild());
    assertEquals(3, ifNode.getChildCount()); // else ยังอยู่ครบ
  }
}
```

# สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testOptimizeSubtree_defaultCase_unchanged | switch default case (`Token.ADD`) |
| testNot_eqToNe / testNot_neToEq / testNot_sheqToShne / testNot_shneToSheq | `tryMinimizeNot`: EQ↔NE, SHEQ↔SHNE |
| testNot_defaultUnchanged_gt | `tryMinimizeNot` default case (GT ไม่ถูกแปลง) |
| testReduceTrueFalse_lateTrue_trueNode / _falseNode | `reduceTrueFalse` เมื่อ `late=true` (TRUE/FALSE) |
| testReduceTrueFalse_lateFalse_unchanged | `reduceTrueFalse` เมื่อ `late=false` |
| testSplitComma_lateTrue_noChange | `trySplitComma`: `if(late) return n;` |
| testSplitComma_lateFalse_exprResultParent_splits | `trySplitComma`: เงื่อนไข isExprResult && !label -> split |
| testSplitComma_lateFalse_nonExprResultParent_noChange | `trySplitComma`: parent ไม่ใช่ EXPR_RESULT |
| testSplitComma_lateFalse_labelParent_noChange | `trySplitComma`: grandparent เป็น LABEL |
| testReplaceUndefined_notNormalized_unchanged | `tryReplaceUndefined`: isASTNormalized()=false |
| testArrayLiteral_mixedTypes_unchanged | `tryMinimizeArrayLiteral`: allStrings=false |
| testArrayLiteral_allStrings_lateFalse_unchanged | `tryMinimizeStringArrayLiteral`: `!late` |
| testArrayLiteral_allStrings_lateTrue_smallSavingUnchanged | `tryMinimizeStringArrayLiteral`: saving<=0 |
| testArrayLiteral_allStrings_lateTrue_foldsToSplitCall | `tryMinimizeStringArrayLiteral`: saving>0 + delimiter="" (allLength1) |
| testArrayLiteral_allStrings_lateTrue_noDelimiterFound_unchanged | `pickDelimiter` คืน null |
| testFoldSimpleFunctionCall_stringWithArg | `tryFoldSimpleFunctionCall`: String(x)->''+x |
| testFoldSimpleFunctionCall_stringNoArg_unchanged | `tryFoldSimpleFunctionCall`: value==null |
| testFoldSimpleFunctionCall_notStringFunction_unchanged | `tryFoldSimpleFunctionCall`: ชื่อไม่ใช่ "String" + bind==null |
| testNewStandardConstructor_notNormalized_unchanged | `Token.NEW`: `!node.isCall()` -> return early |
| testMinimizeIf_literalCondition_reducedToNumber | `tryMinimizeIf`: cond literal -> early return |
| testMinimizeIf_thenExprBlock_toAnd | `tryMinimizeIf`: if(x)foo(); -> x&&foo(); |
| testMinimizeIf_notCond_thenExprBlock_toOr | `tryMinimizeIf`: cond.isNot() -> OR branch |
| testMinimizeIf_bothReturnExpr_toHookReturn | `tryMinimizeIf`: both return-expr blocks -> hook return |
| testExprResult_doubleNot_minimizedCondition | `Token.EXPR_RESULT` -> `tryMinimizeCondition` (NOT-NOT) |
| testHook_doubleNot_inCondition | `Token.HOOK` -> `tryMinimizeCondition` บน condition child |
| testReplaceIf_mergeOrCondition | `tryReplaceIf`: merge if-if -> OR |
| testReplaceIf_mergeAndCondition | `tryReplaceIf`: merge if-if/else -> AND |
| testReplaceIf_ifReturnThenReturnExpr_toHookReturn | `tryReplaceIf`: if(return)+return -> hook return |
| testReplaceIf_emptyBlock_unchanged | `tryReplaceIf`: loop ไม่ทำงาน (block ว่าง) |
| testReplaceIf_noIfStatement_unchanged | `tryReplaceIf`: ไม่มี child เป็น IF |
| testReplaceIf_elseHoistedWhenThenExits | `statementMustExitParent`=true -> hoist else |
| testReplaceIf_noHoistWhenThenDoesNotExit | `statementMustExitParent`=false -> ไม่ hoist |

**สิ่งที่ไม่ได้ครอบคลุม (และเหตุผล)**: switch case `RETURN`, `THROW`, `WHILE`, `DO`, `FOR` ของ `optimizeSubtree` (พึ่งพา `ControlFlowAnalysis` ที่ไม่มีซอร์สให้ตรวจสอบ), เส้นทางที่ `isASTNormalized()==true` (ไม่มี API ที่ทราบแน่ชัดในการบังคับ normalize จากซอร์สที่ให้มา), `tryFoldRegularExpressionConstructor`/`tryJoinForCondition`/`tryFoldImmediateCallToBoundFunction` เชิงลึก (ต้องพึ่ง `CodingConvention`/`ControlFlowAnalysis` เพิ่มเติม)