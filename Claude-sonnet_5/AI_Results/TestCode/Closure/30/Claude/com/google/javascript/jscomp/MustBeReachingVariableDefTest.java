package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

/**
 * Unit test สำหรับ {@link MustBeReachingVariableDef} (Defects4J Closure-30b)
 *
 * หมายเหตุ: คลาสเป้าหมายเป็น package-private จึงไม่ต้อง import ข้าม package
 * (test class อยู่ใน package เดียวกันโดยจงใจ)
 */
public class MustBeReachingVariableDefTest {

  // เก็บ root ของ AST และผลลัพธ์ dataflow analysis ของแต่ละเทส
  private Node root;
  private MustBeReachingVariableDef dfa;

  /**
   * Parse JS source, สร้าง CFG และ Scope จริง แล้วรัน MustBeReachingVariableDef
   * ASSUMPTION: Compiler#parseTestCode(String), ControlFlowAnalysis constructor
   * /process/getCfg, SyntacticScopeCreator constructor/createScope,
   * DataFlowAnalysis#analyze() เป็น public/package-visible API มาตรฐานของ
   * Closure Compiler ในยุคเดียวกับ Closure-30 (ไม่ได้ปรากฏในซอร์สที่ให้มาโดยตรง)
   */
  private void analyze(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options); // ASSUMPTION: public method มาตรฐานของ Compiler

    root = compiler.parseTestCode(js); // ASSUMPTION: helper สำหรับ parse ใน test

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);

    dfa = new MustBeReachingVariableDef(cfg, scope, compiler);
    dfa.analyze();
  }

  /**
   * ค้นหา CALL node ที่เรียกฟังก์ชันชื่อ markerName เช่น USE(x)
   * ASSUMPTION: Token.CALL เป็น standard token constant ของ Rhino/Closure AST
   */
  private Node findCallMarker(Node n, String markerName) {
    if (n.getType() == Token.CALL
        && n.getFirstChild() != null
        && n.getFirstChild().isName()
        && markerName.equals(n.getFirstChild().getString())) {
      return n;
    }
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      Node found = findCallMarker(c, markerName);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  /**
   * หา statement (EXPR_RESULT) ที่ครอบ node ที่กำหนด เพื่อใช้เป็น useNode
   * (CFG node granularity เป็นระดับ statement)
   * ASSUMPTION: Node#getParent() และ Token.EXPR_RESULT เป็น standard API
   */
  private Node enclosingStatement(Node n) {
    Node cur = n;
    while (cur != null && cur.getType() != Token.EXPR_RESULT) {
      cur = cur.getParent();
    }
    return cur;
  }

  private Node useNodeFor(String marker) {
    Node call = findCallMarker(root, marker);
    assertNotNull("ไม่พบ marker call: " + marker, call);
    Node stmt = enclosingStatement(call);
    assertNotNull("ไม่พบ enclosing statement ของ marker: " + marker, stmt);
    return stmt;
  }

  private void assertDefLine(String varName, String marker, int expectedLine) {
    Node useNode = useNodeFor(marker);
    Node def = dfa.getDef(varName, useNode);
    assertNotNull("คาดว่าจะพบ reaching definition สำหรับ " + varName, def);
    assertEquals(expectedLine, def.getLineno());
  }

  private void assertNoDef(String varName, String marker) {
    Node useNode = useNodeFor(marker);
    Node def = dfa.getDef(varName, useNode);
    assertNull("คาดว่าจะไม่มี reaching definition (BOTTOM) สำหรับ " + varName, def);
  }

  // ---------------------------------------------------------------------
  // 1) Straight-line assignment
  // ---------------------------------------------------------------------
  @Test
  public void testStraightLineAssignmentReachesUse() {
    String js =
        "var x;\n" +
        "x = 1;\n" +
        "USE(x);\n";
    analyze(js);
    assertDefLine("x", "USE", 2);
  }

  // ---------------------------------------------------------------------
  // 2) VAR with initializer (Token.VAR, c.hasChildren() == true)
  // ---------------------------------------------------------------------
  @Test
  public void testVarInitializerReachesUse() {
    String js =
        "var x = 1;\n" +
        "USE(x);\n";
    analyze(js);
    assertDefLine("x", "USE", 1);
  }

  // ---------------------------------------------------------------------
  // 3) Boundary: ประกาศแต่ไม่ assign -> ใช้ entry pseudo-definition (scope root)
  //    (Token.VAR, c.hasChildren() == false -> ไม่เรียก addToDefIfLocal)
  // ---------------------------------------------------------------------
  @Test
  public void testUndeclaredAssignmentUsesEntryPseudoDefinition() {
    String js =
        "var x;\n" +
        "USE(x);\n";
    analyze(js);
    Node useNode = useNodeFor("USE");
    Node def = dfa.getDef("x", useNode);
    assertNotNull("แม้ x ยังไม่ถูก assign แต่ entry lattice ให้ pseudo-def", def);
    assertSame("pseudo-definition ควรเป็น node เดียวกับ scope root", root, def);
  }

  // ---------------------------------------------------------------------
  // 4) IF/ELSE ทั้งสองสาขา assign ค่าต่างกัน -> MustDefJoin: aDef!=null,
  //    b มี var, aDef.equals(bDef)==false -> BOTTOM(null)
  // ---------------------------------------------------------------------
  @Test
  public void testIfElseDifferentDefinitionsBecomesBottom() {
    String js =
        "var x;\n" +
        "if (a) {\n" +
        "  x = 1;\n" +
        "} else {\n" +
        "  x = 2;\n" +
        "}\n" +
        "USE(x);\n";
    analyze(js);
    assertNoDef("x", "USE");
  }

  // ---------------------------------------------------------------------
  // 5) IF/ELSE ทั้งสองสาขาไม่แก้ x -> MustDefJoin: aDef.equals(bDef)==true
  //    -> ค่าเดิม (scope root) ถูก preserve
  // ---------------------------------------------------------------------
  @Test
  public void testIfElseBothBranchesUnchangedPreservesEntryDefinition() {
    String js =
        "var x;\n" +
        "if (a) {\n" +
        "} else {\n" +
        "}\n" +
        "USE(x);\n";
    analyze(js);
    Node useNode = useNodeFor("USE");
    Node def = dfa.getDef("x", useNode);
    assertNotNull(def);
    assertSame(root, def);
  }

  // ---------------------------------------------------------------------
  // 6) IF ไม่มี ELSE -> path หนึ่งแก้ x อีก path ไม่แก้ -> ค่าต่างกัน -> BOTTOM
  // ---------------------------------------------------------------------
  @Test
  public void testIfWithoutElseBecomesBottom() {
    String js =
        "var x;\n" +
        "x = 0;\n" +
        "if (a) {\n" +
        "  x = 1;\n" +
        "}\n" +
        "USE(x);\n";
    analyze(js);
    assertNoDef("x", "USE");
  }

  // ---------------------------------------------------------------------
  // 7) WHILE loop: เงื่อนไข WHILE ผ่าน computeMustDef(getConditionExpression),
  //    body ไม่แก้ x -> def เดิมยัง reach
  // ---------------------------------------------------------------------
  @Test
  public void testWhileLoopUnchangedBodyPreservesDefinition() {
    String js =
        "var x;\n" +
        "x = 1;\n" +
        "while (x < 10) {\n" +
        "}\n" +
        "USE(x);\n";
    analyze(js);
    assertDefLine("x", "USE", 2);
  }

  // ---------------------------------------------------------------------
  // 8) DO-WHILE loop (Token.DO ใช้ path เดียวกับ WHILE/IF ใน switch)
  // ---------------------------------------------------------------------
  @Test
  public void testDoWhileLoopUnchangedBodyPreservesDefinition() {
    String js =
        "var x;\n" +
        "x = 1;\n" +
        "do {\n" +
        "} while (x < 10);\n" +
        "USE(x);\n";
    analyze(js);
    assertDefLine("x", "USE", 2);
  }

  // ---------------------------------------------------------------------
  // 9) FOR (isForIn == false) + Dec/Inc (x++)
  //    หมายเหตุ: โครงสร้าง CFG จริงของ FOR (init/cond/incr) ไม่ได้ระบุในซอร์ส
  //    ที่ให้มา (อยู่ใน ControlFlowAnalysis) จึงไม่ฟันธงค่าคาดหวังเฉพาะเจาะจง
  //    เป็นเพียง smoke test ยืนยันว่าไม่ throw exception
  // ---------------------------------------------------------------------
  @Test
  public void testForLoopWithIncrement_smokeTest() {
    String js =
        "var x;\n" +
        "for (x = 0; x < 10; x++) {\n" +
        "}\n" +
        "USE(x);\n";
    analyze(js);
    Node useNode = useNodeFor("USE");
    dfa.getDef("x", useNode); // ต้องไม่ throw exception
  }

  // ---------------------------------------------------------------------
  // 10) FOR-IN, lhs ไม่ใช่ var (lhs.isVar() == false, lhs.isName() == true)
  // ---------------------------------------------------------------------
  @Test
  public void testForInLoopSimpleNameLhs() {
    String js =
        "var x, y;\n" +
        "for (x in y) {\n" +
        "}\n" +
        "USE(x);\n";
    analyze(js);
    assertDefLine("x", "USE", 2);
  }

  // ---------------------------------------------------------------------
  // 11) FOR-IN, lhs เป็น var declaration (lhs.isVar() == true ->
  //     lhs = lhs.getLastChild())
  // ---------------------------------------------------------------------
  @Test
  public void testForInLoopWithVarDeclarationLhs() {
    String js =
        "var y;\n" +
        "for (var x in y) {\n" +
        "}\n" +
        "USE(x);\n";
    analyze(js);
    assertDefLine("x", "USE", 2);
  }

  // ---------------------------------------------------------------------
  // 12) AND: consequent ฝั่งขวาถูก mark conditional=true เสมอ
  //     -> addToDefIfLocal(node=null) -> BOTTOM ทันที (ไม่ขึ้นกับ join)
  // ---------------------------------------------------------------------
  @Test
  public void testAndShortCircuitConditionalDefinitionBecomesBottom() {
    String js =
        "var a, b;\n" +
        "a = 1;\n" +
        "b = 1;\n" +
        "if (a && (b = 2)) {\n" +
        "}\n" +
        "USE(b);\n";
    analyze(js);
    assertNoDef("b", "USE");
  }

  // ---------------------------------------------------------------------
  // 13) HOOK (ternary): consequent/alternate ถูก mark conditional=true เสมอ
  // ---------------------------------------------------------------------
  @Test
  public void testHookConditionalDefinitionBecomesBottom() {
    String js =
        "var x;\n" +
        "x = 1;\n" +
        "var y = true ? (x = 2) : 3;\n" +
        "USE(x);\n";
    analyze(js);
    assertNoDef("x", "USE");
  }

  // ---------------------------------------------------------------------
  // 14) n.isName() && "arguments".equals(...) -> escapeParameters()
  //     แต่ไม่มี parameter ใน global scope จึงไม่กระทบ x
  // ---------------------------------------------------------------------
  @Test
  public void testArgumentsIdentifierTriggersEscapeParametersWithoutAffectingNonParameterVar() {
    String js =
        "var x;\n" +
        "x = 1;\n" +
        "arguments;\n" +
        "USE(x);\n";
    analyze(js);
    assertDefLine("x", "USE", 2);
  }

  // ---------------------------------------------------------------------
  // 15) addToDefIfLocal: loop ตรวจ otherDef.depends.contains(var) -> ถ้า
  //     dependency ถูก reassign, definition อื่นที่ขึ้นกับมันต้องกลาย BOTTOM
  // ---------------------------------------------------------------------
  @Test
  public void testDependencyInvalidationOnReassignment() {
    String js =
        "var x, y;\n" +
        "x = y;\n" +   // x depends on y
        "y = 2;\n" +   // reassign y -> x ต้องกลายเป็น BOTTOM
        "USE(x);\n";
    analyze(js);
    assertNoDef("x", "USE");
  }

  // ---------------------------------------------------------------------
  // 16) dependsOnOuterScopeVars: depends set ไม่ว่าง แต่ scope เดียวกัน -> false
  // ---------------------------------------------------------------------
  @Test
  public void testDependsOnOuterScopeVarsFalseForSameScopeDependency() {
    String js =
        "var x, y;\n" +
        "x = y;\n" +
        "USE(x);\n";
    analyze(js);
    Node useNode = useNodeFor("USE");
    assertFalse(dfa.dependsOnOuterScopeVars("x", useNode));
  }

  // ---------------------------------------------------------------------
  // 17) Boundary/ผิดรูปแบบ: node ที่ไม่ได้อยู่ใน CFG -> Preconditions.checkArgument
  //     ต้อง throw IllegalArgumentException
  //     ASSUMPTION: CALL node (sub-expression) ไม่ถูกลงทะเบียนเป็น CFG node เอง
  // ---------------------------------------------------------------------
  @Test(expected = IllegalArgumentException.class)
  public void testGetDefThrowsForNodeNotInCfg() {
    String js =
        "var x;\n" +
        "x = 1;\n" +
        "USE(x);\n";
    analyze(js);
    Node call = findCallMarker(root, "USE");
    dfa.getDef("x", call);
  }

  // ---------------------------------------------------------------------
  // 18) Boundary: ชื่อตัวแปรที่ไม่มีอยู่จริง / ค่าว่าง -> ต้อง return null
  //     อย่างสุภาพ ไม่ throw exception (jsScope.getVar(name) == null)
  // ---------------------------------------------------------------------
  @Test
  public void testGetDefWithUnknownOrEmptyVariableNameReturnsNull() {
    String js =
        "var x;\n" +
        "x = 1;\n" +
        "USE(x);\n";
    analyze(js);
    Node useNode = useNodeFor("USE");
    assertNull(dfa.getDef("thisVariableDoesNotExist", useNode));
    assertNull(dfa.getDef("", useNode));
  }

  // ---------------------------------------------------------------------
  // 19) Assignment ผ่าน GETPROP ที่ object ไม่ใช่ "arguments"
  //     -> isGet==true แต่ obj ไม่ใช่ "arguments" -> ไม่ escapeParameters,
  //        ไม่ redefine ตัวแปร a เอง (fall-through ไปยัง default recursion)
  // ---------------------------------------------------------------------
  @Test
  public void testPropertyAssignmentDoesNotRedefineObjectVariable() {
    String js =
        "var a;\n" +
        "a = {};\n" +
        "a.b = 1;\n" +
        "USE(a);\n";
    analyze(js);
    assertDefLine("a", "USE", 2);
  }

  // ---------------------------------------------------------------------
  // 20) Token.FUNCTION -> return ทันที (ไม่ recurse เข้า body ของฟังก์ชัน)
  //     ทดสอบว่าไม่ throw แม้ body มี identifier ที่ไม่รู้จัก (unrelated)
  // ---------------------------------------------------------------------
  @Test
  public void testFunctionExpressionInitializerStopsRecursionAtFunctionBoundary() {
    String js =
        "var f = function() { return unrelated; };\n" +
        "USE(f);\n";
    analyze(js);
    assertDefLine("f", "USE", 1);
  }
}
