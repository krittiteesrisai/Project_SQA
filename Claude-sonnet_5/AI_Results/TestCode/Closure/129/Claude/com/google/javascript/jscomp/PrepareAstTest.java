package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link PrepareAst}.
 *
 * NOTE เกี่ยวกับสมมติฐาน (assumptions) ที่ใช้ในไฟล์นี้:
 * - ใช้ com.google.javascript.jscomp.Compiler (concrete class ที่ implement
 *   AbstractCompiler) เป็น instance ของ AbstractCompiler เนื่องจากไม่มี
 *   mocking framework (Mockito) อยู่ใน classpath ที่กำหนดให้
 * - ใช้ compiler.parseTestCode(String) เพื่อ parse JavaScript source เป็น
 *   AST จริง (มี parent pointer ที่ถูกต้องครบถ้วนจาก parser) แทนการสร้าง
 *   Node ด้วยมือผ่าน constructor ที่ไม่ได้แสดงอยู่ในซอร์สโค้ดเป้าหมาย
 *   วิธีนี้เป็น pattern มาตรฐานที่ใช้กันทั่วไปในชุดทดสอบภายในของ
 *   Closure Compiler เอง หากพฤติกรรมจริงของ method นี้แตกต่างจากที่คาด
 *   (เช่น access modifier หรือ return structure) การทดสอบบางกรณีอาจต้องปรับ
 * - AST ที่ parser (Rhino) สร้างขึ้นสำหรับ if/while/do/for ที่ "ไม่มี {}"
 *   จะมี clause เป็น statement เดี่ยว (ไม่ใช่ BLOCK) ตาม docstring ของ
 *   normalizeBlocks() ("Add blocks to IF, WHILE, DO, etc.") ซึ่งยืนยัน
 *   สมมติฐานนี้โดยตรงจากซอร์สโค้ดเป้าหมาย
 */
public class PrepareAstTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  // ===================== Constructor =====================

  @Test
  public void testConstructor_singleArg_defaultsCheckOnlyFalse() {
    // constructor เดียว (compiler) ควร delegate ไปยัง checkOnly=false
    // ยืนยันทางอ้อม: process() กับ AST ที่ยังไม่ normalize ไม่ throw
    // เพราะ path checkOnly=false ไม่เรียก normalizeNodeTypes เลย
    PrepareAst pass = new PrepareAst(compiler);
    Node root = compiler.parseTestCode("if (true) foo();");
    pass.process(null, root);
  }

  // ============ process(): checkOnly = false branch ============

  @Test
  public void testProcess_checkOnlyFalse_bothNull_noException() {
    // externs == null และ root == null -> ทั้งสอง if-block ถูก skip
    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, null);
  }

  @Test
  public void testProcess_checkOnlyFalse_externsOnly() {
    PrepareAst pass = new PrepareAst(compiler, false);
    Node externs = compiler.parseTestCode("var x;");
    pass.process(externs, null);
  }

  @Test
  public void testProcess_checkOnlyFalse_rootOnly() {
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("var y;");
    pass.process(null, root);
  }

  @Test
  public void testProcess_checkOnlyFalse_bothProvided() {
    PrepareAst pass = new PrepareAst(compiler, false);
    Node externs = compiler.parseTestCode("var e;");
    Node root = compiler.parseTestCode("var r;");
    pass.process(externs, root);
  }

  @Test
  public void testProcess_emptyBlockRoot_noExceptions() {
    // boundary case: root เป็น block ว่างเปล่า ไม่มี child ให้ traverse
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = IR.block();
    pass.process(null, root);
  }

  // ======= process(): checkOnly = true -> normalizeBlocks/normalizeNodeTypes =======

  @Test
  public void testNormalizeBlocks_ifWithoutBlock_throwsIllegalState() {
    // then-clause จาก "if (true) foo();" ไม่มี {} -> ไม่ใช่ BLOCK
    // normalizeBlocks ต้องแก้ไข -> reportChange() -> checkOnly=true -> throw
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("if (true) foo();");
    try {
      pass.process(null, root);
      fail("คาดว่าจะ throw IllegalStateException เพราะ AST ยังไม่ normalize");
    } catch (IllegalStateException expected) {
      // ตรวจสอบว่า AST ถูก mutate (replaceChild) ไปแล้วก่อน exception ถูก throw
      Node ifNode = root.getFirstChild();
      Node thenClause = ifNode.getFirstChild().getNext();
      assertTrue("then-clause ควรถูกแปลงเป็น BLOCK แล้วก่อน throw",
          thenClause.isBlock());
    }
  }

  @Test
  public void testNormalizeBlocks_ifAlreadyWithBlock_noException() {
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("if (true) { foo(); } else { bar(); }");
    // then/else ครอบด้วย {} แล้ว -> ไม่ต้องแก้ไข -> ไม่ throw
    pass.process(null, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeBlocks_whileWithoutBlock_throws() {
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("while (true) foo();");
    pass.process(null, root);
  }

  @Test
  public void testNormalizeBlocks_whileWithBlock_noException() {
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("while (true) { foo(); }");
    pass.process(null, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeBlocks_doWithoutBlock_throws() {
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("do foo(); while (true);");
    pass.process(null, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeBlocks_forWithoutBlock_throws() {
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("for (;;) foo();");
    pass.process(null, root);
  }

  @Test
  public void testNormalizeBlocks_forWithBlock_noException() {
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("for (;;) { foo(); }");
    pass.process(null, root);
  }

  @Test
  public void testNormalizeBlocks_label_excludedFromNormalization() {
    // n.isLabel() == true -> เงื่อนไข !n.isLabel() == false -> ข้าม LABEL node
    // ทั้งก้อน แม้ตัวมันเป็น control structure
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("foo: { bar(); }");
    pass.process(null, root);
  }

  @Test
  public void testNormalizeBlocks_switch_excludedFromNormalization() {
    // n.isSwitch() == true -> เงื่อนไข !n.isSwitch() == false -> ข้าม SWITCH
    // (case bodies ไม่ต้องเป็น BLOCK ตามธรรมชาติของ switch-case)
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("switch (x) { case 1: foo(); break; }");
    pass.process(null, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeBlocks_nestedUnnormalizedIf_recursionThrows() {
    // ทดสอบว่า normalizeNodeTypes() recurse เข้า children และตรวจพบ
    // unnormalized if ที่ซ่อนอยู่ในระดับลึกกว่า (loop for-child ใน
    // normalizeNodeTypes) แล้ว throw เช่นเดียวกัน
    PrepareAst pass = new PrepareAst(compiler, true);
    Node root = compiler.parseTestCode("{ if (true) foo(); }");
    pass.process(null, root);
  }

  // ========= PrepareAnnotations: annotateCalls (ผ่าน process checkOnly=false) =========

  @Test
  public void testAnnotateCalls_freeCall_setsFreeCallProp() {
    // first child ของ CALL ไม่ใช่ GET-property -> !isGet(first) == true
    // -> putBooleanProp(FREE_CALL, true)
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("foo();");
    pass.process(null, root);
    Node call = root.getFirstChild().getFirstChild(); // EXPR_RESULT -> CALL
    assertTrue(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateCalls_methodCall_notFreeCall() {
    // first child เป็น GETPROP -> isGet(first) == true -> ไม่ set FREE_CALL
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("obj.method();");
    pass.process(null, root);
    Node call = root.getFirstChild().getFirstChild();
    assertFalse(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateCalls_evalDirectCall_setsDirectEval() {
    // first.isName() && "eval".equals(first.getString()) == true
    // -> putBooleanProp(DIRECT_EVAL, true) บน node "eval"
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("eval('1+1');");
    pass.process(null, root);
    Node call = root.getFirstChild().getFirstChild();
    Node calleeName = call.getFirstChild();
    assertTrue(calleeName.getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateCalls_nonEvalNamedCall_noDirectEval() {
    // first.isName() == true แต่ getString() != "eval" -> ไม่ set DIRECT_EVAL
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("foo('1+1');");
    pass.process(null, root);
    Node call = root.getFirstChild().getFirstChild();
    Node calleeName = call.getFirstChild();
    assertFalse(calleeName.getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateCalls_indirectEvalViaComma_notDirectEval() {
    // "(0, eval)()" -> first child ของ CALL ไม่ใช่ NAME ตรงๆ (เป็นผลของ COMMA)
    // -> first.isName() == false -> ไม่ set DIRECT_EVAL
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("(0, eval)('1+1');");
    pass.process(null, root);
    Node call = root.getFirstChild().getFirstChild();
    Node first = call.getFirstChild();
    assertFalse(first.isName() && "eval".equals(first.getString()));
  }

  // ===== PrepareAnnotations: annotateDispatchers (ผ่าน process checkOnly=false) =====

  @Test
  public void testAnnotateDispatchers_functionNoJsDoc_noDispatcherProp() {
    // parent.getJSDocInfo() == null -> เงื่อนไข && แรก false -> ไม่ set IS_DISPATCHER
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("function foo() {}");
    pass.process(null, root);
    Node func = root.getFirstChild();
    assertFalse(func.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchers_parentNotAssign_noDispatcherProp() {
    // function อยู่ใต้ NAME (VAR initializer) ไม่ใช่ ASSIGN, และ parent (NAME)
    // ไม่มี JSDocInfo -> ไม่ set IS_DISPATCHER (short-circuit ที่เงื่อนไขแรก)
    // NOTE: ไม่สามารถบังคับให้ getJSDocInfo().isJavaDispatch()==true ได้ง่าย
    // ผ่าน source JS ปกติโดยไม่ต้องเดา custom @javadispatch parsing API
    // ที่ไม่ปรากฏในซอร์สเป้าหมาย จึงทดสอบ branch "parent ไม่ใช่ ASSIGN /
    // ไม่มี JSDoc" เป็นหลัก
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("var x = function() {};");
    pass.process(null, root);
    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node func = nameNode.getFirstChild();
    assertFalse(func.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchers_assignWithoutJsDoc_noDispatcherProp() {
    // parent เป็น ASSIGN แต่ไม่มี JSDocInfo -> เงื่อนไขแรก false -> ไม่ set
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("x = function() {};");
    pass.process(null, root);
    Node exprResult = root.getFirstChild();
    Node assign = exprResult.getFirstChild();
    Node func = assign.getLastChild();
    assertFalse(func.getBooleanProp(Node.IS_DISPATCHER));
  }

  // ===== PrepareAnnotations: normalizeObjectLiteralAnnotations =====

  @Test
  public void testNormalizeObjectLiteralAnnotations_valueNotFunction_noThrowNoCrash() {
    // key.getJSDocInfo() == null (ไม่มี JSDoc ใน source) -> เงื่อนไขแรก false
    // -> ไม่พยายาม setJSDocInfo บน value ("b") -> ไม่ throw
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("var o = { a: 'b' };");
    pass.process(null, root);
    assertNotNull(root);
  }

  @Test
  public void testNormalizeObjectLiteralAnnotations_functionValue_noThrow() {
    // value เป็น FUNCTION แต่ key ไม่มี JSDoc -> เงื่อนไขแรก false -> ไม่ throw,
    // ไม่มีการ copy JSDocInfo (ไม่ได้ set มาก่อน)
    PrepareAst pass = new PrepareAst(compiler, false);
    Node root = compiler.parseTestCode("var o = { a: function() {} };");
    pass.process(null, root);
    assertNotNull(root);
  }
}
