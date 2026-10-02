package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Unit tests for {@link NameAnalyzer}.
 *
 * หมายเหตุ: ต้องอยู่ใน package เดียวกับคลาสเป้าหมาย เพราะ NameAnalyzer และ
 * removeUnreferenced()/getHtmlReport() เป็น package-private
 *
 * แนวทางการทดสอบ: ใช้ com.google.javascript.jscomp.Compiler (คลาสในโปรเจกต์
 * เดียวกัน ไม่ใช่ external jar) เพื่อ parse source JS จริงเป็น Node tree แล้ว
 * เรียก NameAnalyzer.process() ตรง ๆ เนื่องจากคลาสเป้าหมายไม่มี seam สำหรับ
 * mock ได้ (พึ่งพา Node/Scope/NodeTraversal ภายใน)
 *
 * ข้อสมมติที่ยังไม่ verified 100% (คอมเมนต์กำกับตามข้อกำหนด #4):
 *  - ลายเซ็น Compiler.init(List<SourceFile>, List<SourceFile>, CompilerOptions)
 *  - Compiler.parse(), Compiler.getRoot(), Compiler.toSource()
 */
public class NameAnalyzerTest {

  // externs พื้นฐาน: window ถูก declare (ทำให้ WINDOW.externallyDefined=true)
  // และ alert เป็น extern function (สมมติว่ามี side effect ไม่รู้จัก
  // เพื่อทดสอบ branch "n.isCall() && parent.isExprResult()" ของ
  // addSimplifiedExpression / nodesToKeep)
  private static final String EXTERNS = "var window; function alert(x) {}";

  private Compiler compiler;
  private Node externsRoot;
  private Node jsRoot;

  @Before
  public void setUp() {
    compiler = null;
    externsRoot = null;
    jsRoot = null;
  }

  /**
   * Helper: parse externs+js ผ่าน Compiler จริง แล้วรัน NameAnalyzer.process()
   */
  private String runNameAnalyzer(String js, boolean removeUnreferenced) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", EXTERNS));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));

    compiler.init(externs, inputs, options);
    compiler.parse();

    Node root = compiler.getRoot();
    externsRoot = root.getFirstChild();
    jsRoot = root.getLastChild();

    NameAnalyzer analyzer = new NameAnalyzer(compiler, removeUnreferenced);
    analyzer.process(externsRoot, jsRoot);

    return compiler.toSource(jsRoot);
  }

  // -----------------------------------------------------------------
  // 1) Boundary: empty program / removeUnreferenced=false branch
  // -----------------------------------------------------------------

  @Test
  public void testEmptyProgram_noExceptionAndEmptyOutput() {
    // ครอบคลุม loop ใน removeUnreferenced() กรณี refNodes ว่าง (0 iteration)
    String output = runNameAnalyzer("", true);
    assertNotNull(output);
    assertTrue(output.trim().isEmpty());
  }

  @Test
  public void testConstructor_removeUnreferencedFalse_doesNotThrow() {
    // ครอบคลุม branch "if (removeUnreferenced)" == false ใน process():
    // ไม่มีการลบใด ๆ แม้ 'a' unreferenced
    String output = runNameAnalyzer("var a = 1;", false);
    assertTrue(output.contains("a"));
  }

  // -----------------------------------------------------------------
  // 2) JsNameRefNode.remove(): case Token.VAR
  // -----------------------------------------------------------------

  @Test
  public void testUnreferencedVarRemoved() {
    // 'a' ไม่ถูกอ้างอิงเลย -> ถูกลบทั้งหมด (getRhsSubexpressions(NAME)=empty
    // เพราะไม่มี initializer... ในที่นี้มี initializer แต่ replacements ว่าง
    // เพราะ literal 1 ไม่มี side effect)
    String output = runNameAnalyzer("var a = 1;", true);
    assertFalse(output.contains("a"));
  }

  @Test
  public void testReferencedVarKeptViaCallArgument() {
    // ครอบคลุม: addSimplifiedExpression -> n.isCall() && parent.isExprResult()
    // -> addSimplifiedChildren(n) -> ทั้ง call ถูก keep (assume side effect)
    // -> FindReferences.visit -> nodesToKeep.contains(n) == true branch
    // -> recordReference(WINDOW, "a", REGULAR)
    String output = runNameAnalyzer("var a = 1; alert(a);", true);
    assertTrue(output.contains("var a"));
    assertTrue(output.contains("alert"));
  }

  // -----------------------------------------------------------------
  // 3) JsNameRefNode.remove(): case Token.FUNCTION
  // -----------------------------------------------------------------

  @Test
  public void testUnreferencedFunctionDeclarationRemoved() {
    // getRhsSubexpressions(FUNCTION) -> Collections.emptyList()
    // -> replaceTopLevelExpressionWithRhs ลบ statement ทั้งหมด
    String output = runNameAnalyzer("function foo() {}", true);
    assertFalse(output.contains("foo"));
  }

  @Test
  public void testReferencedFunctionDeclarationKept() {
    // foo ถูกส่งเป็น argument ของ call ที่ถูก keep -> nodesToKeep branch
    // -> referenced=true -> ไม่ถูกลบ
    String output = runNameAnalyzer("function foo() {} alert(foo);", true);
    assertTrue(output.contains("foo"));
  }

  // -----------------------------------------------------------------
  // 4) JsNameRefNode.remove(): case Token.ASSIGN,
  //    containingNode.isExprResult() == true sub-branch
  // -----------------------------------------------------------------

  @Test
  public void testUnreferencedAssignExprResultRemoved() {
    // 'a' unreferenced ทั้งหมด: ทั้ง var-decl (case VAR) และ assign
    // (case ASSIGN, containingNode.isExprResult()==true) ถูกลบ เพราะ
    // getRhsSubexpressions(...) คืน node ที่ไม่มี side effect
    String output = runNameAnalyzer("var a; a = 1;", true);
    assertTrue(output.trim().isEmpty());
  }

  // -----------------------------------------------------------------
  // 5) JsNameRefNode.remove(): case Token.OBJECTLIT (no-op branch)
  // -----------------------------------------------------------------

  @Test
  public void testObjectLiteralKeyNeverRemoved() {
    // ไม่ว่า "obj.a" จะถูกอ้างอิงหรือไม่ก็ตาม remove() ของ objlit key
    // เป็น no-op ("TODO" ในซอร์ส) ดังนั้น key ต้องอยู่เสมอ
    String output = runNameAnalyzer("var obj = {a: 1}; alert(obj);", true);
    assertTrue(output.contains("a:1") || output.contains("a: 1"));
  }

  // -----------------------------------------------------------------
  // 6) PrototypeSetNode.remove(): gramps.isExprResult() == true branch
  // -----------------------------------------------------------------

  @Test
  public void testUnreferencedPrototypeMethodRemoved_exprResultBranch() {
    // Foo ไม่ถูกอ้างอิงที่ไหนเลย (recordPrototypeSet ไม่สร้าง reference
    // กลับไปที่ Foo) -> ทั้ง function decl และ prototype assignment ถูกลบ
    // ผ่าน PrototypeSetNode.remove() -> gramps.isExprResult()==true
    // -> changeProxy.removeChild(...)
    String output = runNameAnalyzer(
        "function Foo() {} Foo.prototype.bar = function() {};", true);
    assertFalse(output.contains("bar"));
    assertFalse(output.contains("Foo"));
  }

  // -----------------------------------------------------------------
  // 7) InstanceOfCheckNode: creation + remove() (แทนที่ด้วย false)
  // -----------------------------------------------------------------

  @Test
  public void testUnreferencedInstanceofReplacedWithFalse() {
    // Foo ถูกใช้เฉพาะใน instanceof (ตั้งค่า hasInstanceOfReference เท่านั้น
    // ไม่สร้าง reference edge ที่ทำให้ referenced=true) -> Foo ยังคง
    // unreferenced -> ทั้ง function decl ของ Foo และ InstanceOfCheckNode
    // ถูกลบ -> instanceof expression ถูกแทนที่ด้วย IR.falseNode()
    String output = runNameAnalyzer(
        "function Foo() {} var x = {}; alert(x); "
            + "if (x instanceof Foo) {}",
        true);
    assertFalse(output.contains("Foo"));
    assertTrue(output.contains("false"));
    // x ถูกอ้างอิงผ่าน alert(x) -> ยังอยู่
    assertTrue(output.contains("var x"));
  }

  // -----------------------------------------------------------------
  // 8) Sanity: หลาย instance ไม่แชร์ state กัน (allNames/refNodes/aliases
  //    เป็น instance field, ไม่ใช่ static)
  // -----------------------------------------------------------------

  @Test
  public void testTwoIndependentAnalyzersDoNotShareState() {
    String output1 = runNameAnalyzer("var a = 1;", true);
    String output2 = runNameAnalyzer("var b = 1; alert(b);", true);
    assertFalse(output1.contains("a"));
    assertTrue(output2.contains("b"));
  }

  // -----------------------------------------------------------------
  // 9) getHtmlReport() + countOf() (indirect coverage ของ TriState
  //    combinations: BOTH/BOTH, TRUE/BOTH, FALSE/BOTH, BOTH/TRUE, ...)
  // -----------------------------------------------------------------

  @Test
  public void testGetHtmlReport_noExceptionAndBasicContent() {
    runNameAnalyzer("var a = 1; function foo() {} alert(foo);", true);

    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    analyzer.process(externsRoot, jsRoot);

    String report = analyzer.getHtmlReport();
    assertNotNull(report);
    assertTrue(report.contains("OVERALL STATS"));
    assertTrue(report.contains("<html>"));
    assertTrue(report.contains("ALL NAMES"));
  }

  // -----------------------------------------------------------------
  // 10) removeUnreferenced(): loop boundary กรณี refNodes ว่าง
  //     (เรียกตรงโดยไม่ผ่าน process() ก่อน)
  // -----------------------------------------------------------------

  @Test
  public void testRemoveUnreferenced_emptyRefNodes_noException() {
    Compiler freshCompiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    freshCompiler.init(
        Lists.newArrayList(SourceFile.fromCode("externs.js", EXTERNS)),
        Lists.newArrayList(SourceFile.fromCode("input.js", "")),
        options);
    freshCompiler.parse();

    NameAnalyzer analyzer = new NameAnalyzer(freshCompiler, true);
    // refNodes ยังว่างเพราะไม่เคยเรียก process() -> for-loop ไม่ทำงานเลย
    analyzer.removeUnreferenced();
  }
}
