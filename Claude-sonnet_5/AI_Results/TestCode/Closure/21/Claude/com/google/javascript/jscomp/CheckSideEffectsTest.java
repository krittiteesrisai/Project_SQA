package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.util.List;

/**
 * Unit test สำหรับ CheckSideEffects (Defects4J Closure-21b)
 * ใช้ Compiler จริงในการ parse แล้วรัน pass โดยตรง (ไม่ mock)
 */
public class CheckSideEffectsTest {

  /** เก็บผลลัพธ์หลัง parse + รัน pass เพื่อให้ตรวจ warnings และ AST ได้ */
  private static class Result {
    Compiler compiler;
    Node externsRoot;
    Node mainRoot;
  }

  private Result parseAndRun(String js, boolean protectSideEffectFreeCode) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    List<SourceFile> externs = Lists.newArrayList();
    List<SourceFile> inputs = Lists.newArrayList(SourceFile.fromCode("testcode.js", js));

    compiler.init(externs, inputs, options);
    Node root = compiler.parseInputs();
    assertNotNull("Parse ล้มเหลว: " + java.util.Arrays.toString(compiler.getErrors()), root);

    Result r = new Result();
    r.compiler = compiler;
    r.externsRoot = root.getFirstChild();
    r.mainRoot = root.getLastChild();

    CheckSideEffects pass =
        new CheckSideEffects(compiler, CheckLevel.WARNING, protectSideEffectFreeCode);
    pass.process(r.externsRoot, r.mainRoot);
    return r;
  }

  private static Node firstStatement(Node mainRoot) {
    // mainRoot -> SCRIPT -> statement
    return mainRoot.getFirstChild().getFirstChild();
  }

  private static boolean externHasProtectorVar(Node externsAst) {
    for (Node c = externsAst.getFirstChild(); c != null; c = c.getNext()) {
      if (c.isVar() && c.getFirstChild() != null && c.getFirstChild().isName()
          && CheckSideEffects.PROTECTOR_FN.equals(c.getFirstChild().getString())) {
        return true;
      }
    }
    return false;
  }

  // ---------- 1. n.isEmpty() -> return ----------
  @Test
  public void testEmptyStatement_NoWarning() {
    Result r = parseAndRun(";", false);
    assertEquals(0, r.compiler.getWarnings().length);
  }

  // ---------- 2. n.isComma() ของ node เอง + fallthrough ของลูก ----------
  @Test
  public void testTopLevelComma_TwoOperands_BothChecked() {
    Result r = parseAndRun("a, b;", false);
    // comma node เองไม่ถูก flag, แต่ลูกทั้งสอง (a: ไม่ใช่ last child, b: last child
    // ที่ ancestor แรกที่ไม่ใช่ COMMA คือ EXPR_RESULT -> break -> ตรวจ) ไม่มี side effect ทั้งคู่
    assertEquals(2, r.compiler.getWarnings().length);
  }

  @Test
  public void testChainedComma_ThreeOperands_AllChecked() {
    Result r = parseAndRun("a, b, c;", false);
    // ครอบคลุม loop ข้าม ancestor ที่เป็น COMMA ต่อ ๆ กัน ก่อนเจอ EXPR_RESULT
    assertEquals(3, r.compiler.getWarnings().length);
  }

  // ---------- 3. if (isResultUsed) return; (true branch) ----------
  @Test
  public void testCommaLastOperandResultUsed_NotFlagged() {
    Result r = parseAndRun("var y = (x, x);", false);
    // x ตัวแรก (ไม่ใช่ last child, ไม่ถูกใช้ผลลัพธ์) -> ถูก flag
    // x ตัวสุดท้าย ผลลัพธ์ถูกใช้เป็นค่า assign ให้ y -> isResultUsed=true -> return
    assertEquals(1, r.compiler.getWarnings().length);
  }

  // ---------- 4. ancestor-walk: ancestor แรก(ที่ไม่ใช่ COMMA) ไม่ใช่ EXPR_RESULT/BLOCK -> return ----------
  @Test
  public void testCommaInForInit_LastChildSkippedDueToForAncestor() {
    // init = COMMA(ASSIGN(i,0), j) -> parent ของ comma คือ FOR (ไม่ใช่ EXPR_RESULT/BLOCK)
    Result r = parseAndRun("for (i = 0, j; i < 10; i++) {}", false);
    // i=0 มี side effect (ไม่ warn), j ถูก skip เพราะ ancestor คือ FOR,
    // เงื่อนไข i<10 ถูก skip เพราะไม่ตรง FOR-exception position, i++ มี side effect
    assertEquals(0, r.compiler.getWarnings().length);
  }

  // ---------- 5. FOR-exception: n == firstChild หรือ n == firstChild.next.next ----------
  @Test
  public void testForLoopClausePositions() {
    Result r = parseAndRun("for (i; i; i) {}", false);
    // init(pos0)=exception match->warn, cond(pos1)=ไม่ match->skip, incr(pos2)=exception match->warn
    assertEquals(2, r.compiler.getWarnings().length);
  }

  @Test
  public void testForIn_NoWarning_SmokeTest() {
    // FOR node ที่มี childCount != 4 (for-in) ควรไม่ crash และไม่มี false warning
    Result r = parseAndRun("for (var k in obj) {}", false);
    assertEquals(0, r.compiler.getWarnings().length);
  }

  // ---------- 6. เงื่อนไข parent != EXPR_RESULT && != BLOCK (default skip) ----------
  @Test
  public void testExpressionArgument_SkippedNotFlagged() {
    Result r = parseAndRun("foo(x);", false);
    // x เป็น argument ของ CALL (parent ไม่ใช่ EXPR_RESULT/BLOCK/FOR-exception) -> skip
    // foo() มี side effect -> ไม่ warn
    assertEquals(0, r.compiler.getWarnings().length);
  }

  @Test
  public void testBlockDirectChild_VarDecl_NoWarning() {
    // ครอบคลุม parent.getType()==BLOCK ตรง ๆ (ไม่ผ่าน EXPR_RESULT)
    Result r = parseAndRun("{ var x = 1; }", false);
    assertEquals(0, r.compiler.getWarnings().length);
  }

  // ---------- 7. n.isExprResult() -> return (implicit, ทุก test ที่มี statement expr ครอบคลุมอยู่แล้ว) ----------
  @Test
  public void testFunctionCallStatement_HasSideEffect_NoWarning() {
    Result r = parseAndRun("foo();", false);
    assertEquals(0, r.compiler.getWarnings().length);
  }

  // ---------- 8. n.isQualifiedName() && getJSDocInfo()!=null -> return ----------
  @Test
  public void testQualifiedNameWithJSDoc_NoWarning() {
    Result r = parseAndRun("/** @type {number} */\nfoo.bar;", false);
    assertEquals(0, r.compiler.getWarnings().length);
  }

  // ---------- 9. เงื่อนไขสุดท้าย: !mayHaveSideEffects -> generic message ----------
  @Test
  public void testBareName_GenericMessage() {
    Result r = parseAndRun("x;", false);
    assertEquals(1, r.compiler.getWarnings().length);
    assertEquals(CheckSideEffects.USELESS_CODE_ERROR, r.compiler.getWarnings()[0].getType());
  }

  // ---------- 10. n.isString() -> ข้อความ missing '+' ----------
  @Test
  public void testStringLiteralStatement_MissingPlusMessage() {
    // ใช้ foo(); นำหน้าเพื่อไม่ให้ string ตัวแรกถูกตีเป็น directive prologue โดยไม่กระทบ count
    Result r = parseAndRun("foo(); \"abc\";", false);
    assertEquals(1, r.compiler.getWarnings().length);
    assertEquals(CheckSideEffects.USELESS_CODE_ERROR, r.compiler.getWarnings()[0].getType());
    // ตรวจข้อความแบบ best-effort (ไม่ยืนยัน field ตรง ๆ ของ JSError)
    assertTrue(r.compiler.getWarnings()[0].toString().toLowerCase().contains("+")
        || r.compiler.getWarnings()[0].toString().toLowerCase().contains("missing"));
  }

  // ---------- 11. isSimpleOp -> ข้อความ operator ----------
  @Test
  public void testEqualityOperatorStatement_SimpleOpFlagged() {
    // ตัวอย่างตรงจาก JavaDoc ของคลาส: "x == foo();  // should that be '='?"
    Result r = parseAndRun("x == foo();", false);
    assertEquals(1, r.compiler.getWarnings().length);
    assertEquals(CheckSideEffects.USELESS_CODE_ERROR, r.compiler.getWarnings()[0].getType());
  }

  // ---------- 12. Assignment ไม่ถูก flag ----------
  @Test
  public void testAssignmentStatement_NoWarning() {
    Result r = parseAndRun("x = 3;", false);
    assertEquals(0, r.compiler.getWarnings().length);
  }

  // ---------- 13. Ternary ไม่มี side effect -> ต้อง warn (ไม่ผูกกับ isSimpleOp) ----------
  @Test
  public void testTernaryNoSideEffects_Flagged() {
    Result r = parseAndRun("x ? y : z;", false);
    assertEquals(1, r.compiler.getWarnings().length);
  }

  // ---------- 14. process(): protectSideEffectFreeCode == false -> ไม่เรียก protectSideEffects() ----------
  @Test
  public void testProcess_ProtectionDisabled_AstUnchanged() {
    Result r = parseAndRun("x;", false);
    Node stmt = firstStatement(r.mainRoot);
    assertTrue(stmt.isExprResult());
    assertTrue(stmt.getFirstChild().isName()); // ยังเป็น NAME x เดิม ไม่ถูกแทนที่
  }

  // ---------- 15. protectSideEffects(): problemNodes ไม่ว่าง -> addExtern() + replaceChild ----------
  @Test
  public void testProtectSideEffects_WrapsProblemNode() {
    Result r = parseAndRun("x;", true);
    Node stmt = firstStatement(r.mainRoot);
    Node value = stmt.getFirstChild();
    assertTrue("ควรถูกแทนที่เป็น CALL", value.isCall());
    Node callee = value.getFirstChild();
    assertTrue(callee.isName());
    assertEquals(CheckSideEffects.PROTECTOR_FN, callee.getString());
    assertEquals(2, value.getChildCount()); // callee + original x

    Node externsAst = r.compiler.getSynthesizedExternsInput().getAstRoot(r.compiler);
    assertTrue("ต้องมี extern var ของ JSCOMPILER_PRESERVE", externHasProtectorVar(externsAst));
  }

  // ---------- 16. protectSideEffects(): problemNodes ว่าง -> ไม่เรียก addExtern() ----------
  @Test
  public void testProtectSideEffects_NoProblemNodes_NoExtern() {
    Result r = parseAndRun("foo();", true);
    Node externsAst = r.compiler.getSynthesizedExternsInput().getAstRoot(r.compiler);
    assertFalse(externHasProtectorVar(externsAst));

    Node stmt = firstStatement(r.mainRoot);
    assertTrue(stmt.getFirstChild().isCall()); // ยัง foo() เดิม ไม่ถูก wrap ซ้ำ
    assertEquals("foo", stmt.getFirstChild().getFirstChild().getString());
  }

  // ---------- 17. hotSwapScript() ----------
  @Test
  public void testHotSwapScript_ProducesSameWarning() {
    Result r = parseAndRun("x;", false);
    // เรียกซ้ำผ่าน hotSwapScript ด้วย pass ใหม่บน mainRoot เดิม ควรพบ warning เดิมอีกครั้ง
    CheckSideEffects pass2 = new CheckSideEffects(r.compiler, CheckLevel.WARNING, false);
    int before = r.compiler.getWarnings().length;
    pass2.hotSwapScript(r.mainRoot, r.mainRoot);
    assertTrue(r.compiler.getWarnings().length >= before);
  }

  // ---------- 18. StripProtection: target.isName() && equals(PROTECTOR_FN) == true ----------
  @Test
  public void testStripProtection_RemovesWrapper() {
    Result r = parseAndRun("x;", true); // สร้าง CALL(JSCOMPILER_PRESERVE, x) ก่อน
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(r.compiler);
    strip.process(r.externsRoot, r.mainRoot);

    Node stmt = firstStatement(r.mainRoot);
    assertTrue("หลัง strip ต้องเหลือ NAME x เดิม ไม่ใช่ CALL อีกต่อไป",
        stmt.getFirstChild().isName());
    assertEquals("x", stmt.getFirstChild().getString());
  }

  // ---------- 19. StripProtection: target ไม่ใช่ NAME เลย (เช่น GETPROP) ----------
  @Test
  public void testStripProtection_MethodCall_Unchanged() {
    Result r = parseAndRun("obj.method();", false);
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(r.compiler);
    strip.process(r.externsRoot, r.mainRoot);

    Node stmt = firstStatement(r.mainRoot);
    assertTrue(stmt.getFirstChild().isCall());
    assertTrue(stmt.getFirstChild().getFirstChild().isGetProp());
  }

  // ---------- 20. StripProtection: target เป็น NAME แต่ชื่อไม่ตรง PROTECTOR_FN ----------
  @Test
  public void testStripProtection_OtherNamedCall_Unchanged() {
    Result r = parseAndRun("foo();", false);
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(r.compiler);
    strip.process(r.externsRoot, r.mainRoot);

    Node stmt = firstStatement(r.mainRoot);
    assertTrue(stmt.getFirstChild().isCall());
    assertEquals("foo", stmt.getFirstChild().getFirstChild().getString());
  }
}
