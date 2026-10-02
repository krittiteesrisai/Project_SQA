package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * JUnit 4 test สำหรับ com.google.javascript.jscomp.CheckSideEffects (Defects4J Closure-22b)
 *
 * หมายเหตุ:
 * - คลาสนี้อยู่ package เดียวกับ CheckSideEffects เพื่อเข้าถึง constructor แบบ
 *   package-private และ inner class StripProtection ได้
 * - ใช้ com.google.javascript.jscomp.Compiler จริงในการ parse JS เป็น AST แล้วเรียก
 *   process()/visit() ของ CheckSideEffects ตรง ๆ (ไม่ผ่าน full compile pipeline)
 * - บาง API (parseTestCode, initOptions, setErrorManager, getSynthesizedExternsInput)
 *   ไม่ได้อยู่ในซอร์สของ CheckSideEffects ที่ให้มา แต่เป็น dependency ที่ CheckSideEffects
 *   เรียกใช้จริงผ่าน AbstractCompiler จึงจำเป็นต้องพึ่งพา และกำกับด้วย NOTE: assumption
 */
public class CheckSideEffectsTest {

  private Compiler compiler;
  private RecordingErrorManager errorManager;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // NOTE: assumption - ต้อง initOptions ก่อน ไม่เช่นนั้น compiler.getOptions() อาจเป็น null
    // ตอนเรียก report()/parseTestCode()
    compiler.initOptions(new CompilerOptions());
    errorManager = new RecordingErrorManager();
    compiler.setErrorManager(errorManager);
  }

  /** ErrorManager แบบง่าย สำหรับดักจับ warning/error ที่ CheckSideEffects รายงานผ่าน compiler.report() */
  private static class RecordingErrorManager implements ErrorManager {
    final List<JSError> warnings = new ArrayList<JSError>();
    final List<JSError> errors = new ArrayList<JSError>();

    @Override
    public void report(CheckLevel level, JSError error) {
      if (level == CheckLevel.ERROR) {
        errors.add(error);
      } else if (level == CheckLevel.WARNING) {
        warnings.add(error);
      }
    }

    @Override
    public void generateReport() {}

    @Override
    public int getErrorCount() {
      return errors.size();
    }

    @Override
    public int getWarningCount() {
      return warnings.size();
    }

    @Override
    public JSError[] getErrors() {
      return errors.toArray(new JSError[errors.size()]);
    }

    @Override
    public JSError[] getWarnings() {
      return warnings.toArray(new JSError[warnings.size()]);
    }

    @Override
    public void setTypedPercent(double typedPercent) {}

    @Override
    public double getTypedPercent() {
      return 0;
    }
  }

  private Node parse(String js) {
    // NOTE: assumption - Compiler#parseTestCode(String) ใช้สำหรับ parse โค้ดสั้น ๆ
    // โดยไม่ต้องผ่าน full compile pipeline
    return compiler.parseTestCode(js);
  }

  private List<JSError> runCheck(String js, boolean protectSideEffectFreeCode) {
    Node root = parse(js);
    assertNotNull("parse ล้มเหลวสำหรับ js: " + js, root);
    CheckSideEffects pass =
        new CheckSideEffects(compiler, CheckLevel.WARNING, protectSideEffectFreeCode);
    pass.process(null, root);
    return errorManager.warnings;
  }

  // ---------- boundary / empty ----------

  @Test
  public void testEmptyProgramProducesNoWarnings() {
    List<JSError> warnings = runCheck("", false);
    assertEquals(0, warnings.size());
  }

  @Test
  public void testEmptyStatementIsIgnored() {
    // n.isEmpty() -> return ทันที ไม่มี warning; foo() ถือว่ามี side-effect (ไม่รู้จัก function)
    List<JSError> warnings = runCheck("foo();;", false);
    assertEquals(0, warnings.size());
  }

  // ---------- n.isComma() / parent.getType()==COMMA ----------

  @Test
  public void testStandaloneCommaExpressionWarnsOnce() {
    // COMMA ตัวเอง (n.isComma()) ถูก skip เสมอ, child แรก (1) ถูก flag,
    // child หลัง (2) ถูก skip ผ่าน ancestor-walk (เจอ NAME ที่ไม่ใช่ EXPR_RESULT/BLOCK)
    List<JSError> warnings = runCheck("var x = (1, 2);", false);
    assertEquals(1, warnings.size());
  }

  @Test
  public void testEvalCommaTrickIsNotFlagged() {
    // กรณีพิเศษ (0, eval)(...) ต้องไม่ถูก flag เลย (ตรงกับคอมเมนต์ eval-check ในซอร์ส)
    List<JSError> warnings = runCheck("(0, eval)(\"1+1\");", false);
    assertEquals(0, warnings.size());
  }

  @Test
  public void testCommaWithoutCallGrampsStillFlagsFirstChild() {
    // gramps ไม่ใช่ CALL -> เงื่อนไข eval-check ไม่ทำงาน -> child แรก (0) ถูก flag ตามปกติ
    List<JSError> warnings = runCheck("var y = (0, eval);", false);
    assertEquals(1, warnings.size());
  }

  // ---------- FOR loop special case ----------

  @Test
  public void testForLoopInitAndIncrementFlaggedConditionSkipped() {
    // init/increment ที่ไม่มี side-effect ถูก flag (เข้า FOR-special-case),
    // condition (child ตัวที่ 2) ถูก skip เสมอ (else { return; })
    List<JSError> warnings = runCheck("for (0; i < 10; 0) {}", false);
    assertEquals(2, warnings.size());
  }

  @Test
  public void testForLoopWithSideEffectingInitIncrementNoWarning() {
    // init/increment ที่มี side-effect (assignment/inc) ไม่ถูก flag
    List<JSError> warnings = runCheck("for (i = 0; i < 10; i++) {}", false);
    assertEquals(0, warnings.size());
  }

  // ---------- EXPR_RESULT self-skip ----------

  @Test
  public void testExprResultWrapperDoesNotDoubleReportInsideBlock() {
    // parent ของ EXPR_RESULT คือ BLOCK -> เข้ากระบวนการตรวจ, ตัว EXPR_RESULT ต้อง self-skip
    // (n.isExprResult()) เหลือ warning จาก NAME "foo" เพียง 1 ครั้ง
    List<JSError> warnings = runCheck("function f() { foo; }", false);
    assertEquals(1, warnings.size());
  }

  // ---------- qualifiedName + JSDoc skip ----------

  @Test
  public void testQualifiedNameWithJsDocIsSkipped() {
    // NOTE: assumption - parser แนบ JSDoc ให้กับ node ของ Foo.prototype.bar โดยตรง
    String js = "/** @type {number} */\nFoo.prototype.bar;";
    List<JSError> warnings = runCheck(js, false);
    assertEquals(0, warnings.size());
  }

  // ---------- isSimpleOp message ----------

  @Test
  public void testSimpleOperatorEqualityProducesOperatorMessage() {
    // ตัวอย่างจาก Javadoc: x == foo();  -> 1 warning ที่ node EQ พร้อมข้อความเฉพาะ
    List<JSError> warnings = runCheck("x == foo();", false);
    assertEquals(1, warnings.size());
    // NOTE: assumption - JSError มี public field ชื่อ description
    assertTrue(warnings.get(0).description.contains("operator is not being used."));
  }

  // ---------- isString "missing +" message ----------

  @Test
  public void testAdjacentStringStatementsProducesMissingPlusMessage() {
    // ASI ทำให้กลายเป็น 2 statement, statement ที่สองเป็น bare string
    String js = "var s = \"hello\"\n\"world\";";
    List<JSError> warnings = runCheck(js, false);
    assertEquals(1, warnings.size());
    assertTrue(warnings.get(0).description.contains("missing '+'"));
  }

  @Test
  public void testStringUsedInAssignmentNoWarning() {
    // string ที่ผลลัพธ์ถูกใช้ (isResultUsed == true) ต้องไม่ถูก flag
    List<JSError> warnings = runCheck("var s = \"hi\";", false);
    assertEquals(0, warnings.size());
  }

  @Test
  public void testCallWithAssumedSideEffectsNoWarning() {
    // call ที่ไม่รู้จัก ถือว่ามี side-effect -> ไม่ถูก flag
    List<JSError> warnings = runCheck("foo();", false);
    assertEquals(0, warnings.size());
  }

  // ---------- protectSideEffectFreeCode flag ----------

  @Test
  public void testProtectSideEffectFreeCodeFalseDoesNotMutateTree() {
    Node root = parse("var x = (1, 2);");
    assertNotNull(root);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(null, root);

    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node commaNode = nameNode.getFirstChild();
    Node firstChildOfComma = commaNode.getFirstChild();
    assertTrue("ต้นไม้ต้องไม่ถูกแก้ไขเมื่อ protectSideEffectFreeCode=false",
        firstChildOfComma.isNumber());
  }

  @Test
  public void testProtectSideEffectFreeCodeTrueWrapsProblemNode() {
    // NOTE: assumption - getSynthesizedExternsInput()/addExtern() ทำงานได้โดยไม่ต้อง
    // เรียก compiler.init(...) แบบเต็มรูปแบบ
    Node root = parse("var x = (1, 2);");
    assertNotNull(root);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
    pass.process(null, root);

    Node varNode = root.getFirstChild();
    Node nameNode = varNode.getFirstChild();
    Node commaNode = nameNode.getFirstChild();
    Node firstChildOfComma = commaNode.getFirstChild();
    assertTrue("node ที่มีปัญหาต้องถูกแทนที่ด้วย CALL ไปยัง JSCOMPILER_PRESERVE",
        firstChildOfComma.isCall());
    Node callee = firstChildOfComma.getFirstChild();
    assertTrue(callee.isName());
    assertEquals(CheckSideEffects.PROTECTOR_FN, callee.getString());
  }

  // ---------- StripProtection ----------

  @Test
  public void testStripProtectionRemovesWrapperCall() {
    Node root = parse("JSCOMPILER_PRESERVE(x);");
    assertNotNull(root);
    CheckSideEffects.StripProtection strip = new CheckSideEffects.StripProtection(compiler);
    strip.process(null, root);

    Node exprResult = root.getFirstChild();
    assertEquals(Token.EXPR_RESULT, exprResult.getType());
    Node afterStrip = exprResult.getFirstChild();
    assertTrue(afterStrip.isName());
    assertEquals("x", afterStrip.getString());
  }

  // ---------- malformed input ----------

  @Test
  public void testMalformedInputDoesNotThrow() {
    // NOTE: พฤติกรรมของ parser เมื่อ syntax ผิดพลาดไม่ได้ระบุในซอร์สของ CheckSideEffects
    // ทดสอบเพียงว่าไม่มี exception ที่ไม่คาดคิดเกิดขึ้น
    Node root = parse("var ;");
    if (root != null) {
      CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
      pass.process(null, root);
    }
  }
}
