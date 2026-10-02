# วิเคราะห์และแนวทางการทดสอบ

`LiveVariablesAnalysis` เป็น package-private class ที่ผูกกับ `Scope`, `ControlFlowGraph`, `AbstractCompiler` ฯลฯ อย่างแน่นหนา และไม่มี mocking framework (เช่น Mockito) อยู่ใน classpath ที่กำหนด ดังนั้นแนวทางที่ปลอดภัยและตรงกับ source ที่ให้มาที่สุดคือ:

1. ใช้ `Compiler` จริงในการ parse source JS แล้วดึง AST ออกมา (ใช้ `parseTestCode` ซึ่งเป็น API ที่ใช้กันทั่วไปในชุดทดสอบของ Closure Compiler)
2. ใช้ `SyntacticScopeCreator` สร้าง `Scope` จริง และ `ControlFlowAnalysis` สร้าง `ControlFlowGraph` จริง เพื่อนำมาสร้าง `LiveVariablesAnalysis` ที่ใช้งานได้จริง
3. เรียกเมธอด **package-private ที่มีอยู่จริงในซอร์สที่ให้มา** (`isForward`, `createEntryLattice`, `createInitialEstimateLattice`, `flowThrough`) โดยตรง (เพราะ test อยู่ package เดียวกัน) — วิธีนี้ทำให้ไม่ต้องเดา public API ของ superclass `DataFlowAnalysis` (เช่นเมธอดสำหรับดึงผลลัพธ์หลัง `analyze()`) ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา
4. จุดที่ยังต้องอิงกับ class อื่นที่ไม่ได้ให้ source มา (Compiler/SyntacticScopeCreator/ControlFlowAnalysis) ผมกำกับด้วยคอมเมนต์ `ASSUMPTION` ตามข้อกำหนดที่ 4

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

/**
 * JUnit 4 tests for {@link LiveVariablesAnalysis} (Defects4J: Closure-58b).
 *
 * หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4 - ไม่เดา behavior ที่ไม่มีในซอร์ส):
 * - LiveVariablesAnalysis ผูกกับ Compiler/Scope/ControlFlowGraph จริง และไม่มี
 *   mocking framework ใน classpath จึงต้องสร้าง object จริงผ่าน
 *   Compiler#parseTestCode, SyntacticScopeCreator, ControlFlowAnalysis
 *   ซึ่งเป็น class ที่ "ไม่ได้แสดง source" ให้ในโจทย์ ผมอิงตาม API ที่ใช้กัน
 *   เป็นมาตรฐานในโปรเจกต์ Closure Compiler ช่วงเวลาเดียวกัน (ASSUMPTION)
 * - เพื่อลดการเดา public API ของ superclass DataFlowAnalysis (ซึ่งไม่ได้ให้
 *   source มา) การทดสอบส่วนใหญ่จะเรียกเมธอด package-private ที่ "มีอยู่จริง"
 *   ในซอร์สที่ให้มาโดยตรง (isForward, createEntryLattice,
 *   createInitialEstimateLattice, flowThrough) แทนการเรียก analyze() แล้วไป
 *   query ผลลัพธ์ผ่าน API ที่ไม่รู้จัก
 * - มีทดสอบ smoke-test เดียว (testAnalyze_SmokeTest_NoExceptions) ที่เรียก
 *   analyze() ซึ่งสมมติว่าเป็น no-arg method ที่สืบทอดมาจาก DataFlowAnalysis
 */
public class LiveVariablesAnalysisTest {

  private Compiler compiler;
  private Scope scope;
  private ControlFlowGraph<Node> cfg;
  private LiveVariablesAnalysis liveness;
  private Node scriptRoot;
  private Node functionNode;
  private Node body;

  /**
   * ตั้งค่า Compiler/Scope/CFG/LiveVariablesAnalysis จาก source ที่มี "function
   * declaration" เดียวเท่านั้น (เพื่อให้ scriptRoot.getFirstChild() คือ FUNCTION)
   */
  private void setup(String src) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // ASSUMPTION: Compiler#initOptions และ #parseTestCode เป็น API มาตรฐาน
    // ของ Closure Compiler ที่ใช้ในชุดทดสอบภายในโปรเจกต์เอง
    compiler.initOptions(options);

    scriptRoot = compiler.parseTestCode(src);
    assertEquals("Unexpected parse error(s) for: " + src,
        0, compiler.getErrorCount());

    functionNode = scriptRoot.getFirstChild();
    assertNotNull("Expected a FUNCTION node as first statement", functionNode);
    assertEquals(Token.FUNCTION, functionNode.getType());
    body = functionNode.getLastChild(); // BLOCK ตาม markAllParametersEscaped()
                                         // ที่ใช้ getFirstChild().getNext() = PARAM_LIST

    // ASSUMPTION: SyntacticScopeCreator(AbstractCompiler) + createScope(Node, Scope)
    SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(scriptRoot, null);
    scope = scopeCreator.createScope(functionNode, globalScope);

    // ASSUMPTION: ControlFlowAnalysis(AbstractCompiler, boolean, boolean)
    // + process(Node externs, Node root) + getCfg()
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, functionNode);
    cfg = cfa.getCfg();

    liveness = new LiveVariablesAnalysis(cfg, scope, compiler);
  }

  /** คืน statement ที่ index (0-based) ภายใน BLOCK ของ function body */
  private Node stmt(int index) {
    Node n = body.getFirstChild();
    for (int i = 0; i < index; i++) {
      n = n.getNext();
    }
    return n;
  }

  private int idx(String name) {
    Var v = scope.getVar(name);
    assertNotNull("Variable not declared: " + name, v);
    return v.index;
  }

  /** DFS หา node แรกที่มี type ตรงกับ token ที่ระบุ ภายใต้ root ที่กำหนด */
  private Node findFirstOfType(Node root, int type) {
    if (root.getType() == type) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node r = findFirstOfType(c, type);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  // ---------------------------------------------------------------------
  // isForward()
  // ---------------------------------------------------------------------

  @Test
  public void testIsForward_ReturnsFalse() {
    setup("function _(){var a;}");
    assertFalse(liveness.isForward());
  }

  // ---------------------------------------------------------------------
  // createEntryLattice() / createInitialEstimateLattice()
  // ---------------------------------------------------------------------

  @Test
  public void testCreateEntryLattice_AndInitialEstimate_AllDead() {
    setup("function _(){var a,b,c;}");

    LiveVariableLattice entry = liveness.createEntryLattice();
    assertFalse(entry.isLive(idx("a")));
    assertFalse(entry.isLive(idx("b")));
    assertFalse(entry.isLive(idx("c")));

    LiveVariableLattice initial = liveness.createInitialEstimateLattice();
    assertFalse(initial.isLive(idx("a")));
    assertFalse(initial.isLive(idx("b")));
    assertFalse(initial.isLive(idx("c")));
  }

  @Test
  public void testCreateInitialEstimateLattice_ZeroVariables_Boundary() {
    setup("function _(){}");
    LiveVariableLattice lattice = liveness.createInitialEstimateLattice();
    // boundary: numVars == 0, ต้องไม่ throw และ index 0 ต้องไม่ live
    assertFalse(lattice.isLive(0));
  }

  // ---------------------------------------------------------------------
  // flowThrough(): SCRIPT / BLOCK / FUNCTION -> no-op
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_NoOp_Script_Block_Function() {
    setup("function _(){var a; a;}");
    Node readA = stmt(1); // "a;" bare read

    LiveVariableLattice seed =
        liveness.flowThrough(readA, liveness.createInitialEstimateLattice());
    assertTrue(seed.isLive(idx("a")));

    LiveVariableLattice afterFunction = liveness.flowThrough(functionNode, seed);
    assertTrue(afterFunction.isLive(idx("a")));

    LiveVariableLattice afterBlock = liveness.flowThrough(body, seed);
    assertTrue(afterBlock.isLive(idx("a")));

    LiveVariableLattice afterScript = liveness.flowThrough(scriptRoot, seed);
    assertTrue(afterScript.isLive(idx("a")));
  }

  // ---------------------------------------------------------------------
  // flowThrough(): Token.VAR
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_Var_NoInitializer_NoChange() {
    setup("function _(){var x,y; x; var x;}");
    Node readX = stmt(1);      // "x;"
    Node redeclareX = stmt(2); // "var x;" (no initializer -> c.hasChildren() == false)

    LiveVariableLattice seed =
        liveness.flowThrough(readX, liveness.createInitialEstimateLattice());
    assertTrue(seed.isLive(idx("x")));

    LiveVariableLattice result = liveness.flowThrough(redeclareX, seed);
    assertTrue(result.isLive(idx("x"))); // ไม่มีการ kill/gen เพราะไม่มี initializer
    assertTrue(result.equals(seed));
  }

  @Test
  public void testFlowThrough_Var_WithInitializer_KillsAndGens() {
    setup("function _(){var a,b; b; var b = a;}");
    Node readB = stmt(1); // "b;"
    Node declB = stmt(2); // "var b = a;"

    LiveVariableLattice seed =
        liveness.flowThrough(readB, liveness.createInitialEstimateLattice());
    assertTrue(seed.isLive(idx("b")));

    LiveVariableLattice result = liveness.flowThrough(declB, seed);
    assertFalse("b should be killed by the declaration", result.isLive(idx("b")));
    assertTrue("a should be live from the initializer", result.isLive(idx("a")));
  }

  // ---------------------------------------------------------------------
  // flowThrough(): default case - ASSIGN / compound ASSIGN
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_Assign_KillsLhsGensRhs() {
    setup("function _(){var a,b; a; a=b;}");
    Node readA = stmt(1);   // "a;"
    Node assign = stmt(2);  // "a=b;"

    LiveVariableLattice seed =
        liveness.flowThrough(readA, liveness.createInitialEstimateLattice());
    assertTrue(seed.isLive(idx("a")));

    LiveVariableLattice result = liveness.flowThrough(assign, seed);
    assertFalse("plain '=' does not gen lhs, and kill is unconditional here",
        result.isLive(idx("a")));
    assertTrue("rhs 'b' should be generated", result.isLive(idx("b")));
  }

  @Test
  public void testFlowThrough_CompoundAssign_GensLhsAndRhs() {
    setup("function _(){var a,b; a; a+=b;}");
    Node readA = stmt(1);        // "a;"
    Node compoundAssign = stmt(2); // "a+=b;"

    LiveVariableLattice seed =
        liveness.flowThrough(readA, liveness.createInitialEstimateLattice());
    assertTrue(seed.isLive(idx("a")));

    LiveVariableLattice result = liveness.flowThrough(compoundAssign, seed);
    assertTrue("compound assign reads lhs too, so 'a' stays live",
        result.isLive(idx("a")));
    assertTrue("rhs 'b' should be generated", result.isLive(idx("b")));
  }

  // ---------------------------------------------------------------------
  // flowThrough(): AND / OR (short-circuit, conditional propagation)
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_And_ConditionalSuppressesKill() {
    setup("function _(){var a,b; b; a && (b = 1);}");
    Node readB = stmt(1); // "b;"
    Node andNode = stmt(2); // "a && (b=1);"

    LiveVariableLattice seed =
        liveness.flowThrough(readB, liveness.createInitialEstimateLattice());
    assertTrue(seed.isLive(idx("b")));

    LiveVariableLattice result = liveness.flowThrough(andNode, seed);
    assertTrue("first operand 'a' should be generated", result.isLive(idx("a")));
    assertTrue("second operand's assignment is conditional, so 'b' is NOT killed",
        result.isLive(idx("b")));
  }

  @Test
  public void testFlowThrough_Or_BasicGen() {
    setup("function _(){var a,b; a || b;}");
    Node orNode = stmt(0);

    LiveVariableLattice result =
        liveness.flowThrough(orNode, liveness.createInitialEstimateLattice());
    assertTrue(result.isLive(idx("a")));
    assertTrue(result.isLive(idx("b")));
  }

  // ---------------------------------------------------------------------
  // flowThrough(): HOOK
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_Hook_AllOperandsGen() {
    setup("function _(){var a,b,c; a ? b : c;}");
    Node hook = stmt(0);

    LiveVariableLattice result =
        liveness.flowThrough(hook, liveness.createInitialEstimateLattice());
    assertTrue(result.isLive(idx("a")));
    assertTrue(result.isLive(idx("b")));
    assertTrue(result.isLive(idx("c")));
  }

  // ---------------------------------------------------------------------
  // flowThrough(): FOR (for-in, both lhs forms) และ FOR ปกติ
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_ForIn_DirectNameLhs() {
    setup("function _(){var a,b; for(a in b){}}");
    Node forNode = stmt(0);

    LiveVariableLattice result =
        liveness.flowThrough(forNode, liveness.createInitialEstimateLattice());
    assertTrue(result.isLive(idx("a")));
    assertTrue(result.isLive(idx("b")));
  }

  @Test
  public void testFlowThrough_ForIn_VarDeclLhs() {
    setup("function _(){var a,b; for(var a in b){}}");
    Node forNode = stmt(0);

    LiveVariableLattice result =
        liveness.flowThrough(forNode, liveness.createInitialEstimateLattice());
    assertTrue(result.isLive(idx("a")));
    assertTrue(result.isLive(idx("b")));
  }

  @Test
  public void testFlowThrough_For_Regular_ConditionOnly() {
    setup("function _(){var a,b; for(a=0;b;a++){}}");
    Node forNode = stmt(0);

    LiveVariableLattice result =
        liveness.flowThrough(forNode, liveness.createInitialEstimateLattice());
    assertTrue("only the condition expression is processed for FOR node",
        result.isLive(idx("b")));
    assertFalse("init/update clauses are not part of this node's gen/kill",
        result.isLive(idx("a")));
  }

  // ---------------------------------------------------------------------
  // flowThrough(): WHILE / DO / IF (fallthrough case)
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_While() {
    setup("function _(){var a; while(a){}}");
    LiveVariableLattice result =
        liveness.flowThrough(stmt(0), liveness.createInitialEstimateLattice());
    assertTrue(result.isLive(idx("a")));
  }

  @Test
  public void testFlowThrough_Do() {
    setup("function _(){var a; do{}while(a);}");
    LiveVariableLattice result =
        liveness.flowThrough(stmt(0), liveness.createInitialEstimateLattice());
    assertTrue(result.isLive(idx("a")));
  }

  @Test
  public void testFlowThrough_If() {
    setup("function _(){var a; if(a){}}");
    LiveVariableLattice result =
        liveness.flowThrough(stmt(0), liveness.createInitialEstimateLattice());
    assertTrue(result.isLive(idx("a")));
  }

  // ---------------------------------------------------------------------
  // flowThrough(): default case - recursion, ตัวแปร global ที่ไม่ได้ declare local
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_Default_RecursesCallArgs_IgnoresUndeclaredGlobal() {
    setup("function _(){var a,b; foo(a,b);}");
    Node call = stmt(0); // CALL(foo, a, b) เป็น top-level statement

    LiveVariableLattice result =
        liveness.flowThrough(call, liveness.createInitialEstimateLattice());
    assertTrue(result.isLive(idx("a")));
    assertTrue(result.isLive(idx("b")));
    // 'foo' ไม่ได้ declare เป็น local -> addToSetIfLocal คืนกลับโดยไม่ throw/ไม่ set
  }

  // ---------------------------------------------------------------------
  // flowThrough(): conditional-kill จาก edge จริงใน CFG (ON_EX)
  // ---------------------------------------------------------------------

  @Test
  public void testFlowThrough_TryCatch_OnExEdgeSuppressesKill() {
    setup("function _(){var a; try { a = 1; } catch (e) {} a;}");
    Node tryNode = stmt(1);
    Node readAfterTry = stmt(2); // "a;" หลัง try/catch

    LiveVariableLattice seed = liveness.flowThrough(
        readAfterTry, liveness.createInitialEstimateLattice());
    assertTrue(seed.isLive(idx("a")));

    Node assignInTry = findFirstOfType(tryNode, Token.ASSIGN); // "a=1"
    assertNotNull(assignInTry);

    // ASSUMPTION: ControlFlowAnalysis จะสร้าง edge ประเภท Branch.ON_EX จาก
    // statement ภายใน try ไปยัง catch block ทำให้ flowThrough() ตรวจพบและ
    // ตั้ง conditional=true ภายในตัวเอง (ไม่ได้ระบุใน source ที่ให้มา แต่เป็น
    // ผลจาก loop ที่ตรวจ getCfg().getOutEdges(node) ในซอร์สจริง)
    LiveVariableLattice result = liveness.flowThrough(assignInTry, seed);
    assertTrue("kill should be suppressed because of the ON_EX out-edge",
        result.isLive(idx("a")));
  }

  @Test
  public void testFlowThrough_PlainAssign_NoTry_KillsNormally() {
    setup("function _(){var a; a=1; a;}");
    Node assign = stmt(1);
    Node read = stmt(2);

    LiveVariableLattice seed =
        liveness.flowThrough(read, liveness.createInitialEstimateLattice());
    assertTrue(seed.isLive(idx("a")));

    LiveVariableLattice result = liveness.flowThrough(assign, seed);
    assertFalse("no ON_EX edge here, so kill happens unconditionally",
        result.isLive(idx("a")));
  }

  // ---------------------------------------------------------------------
  // getVarIndex()
  // ---------------------------------------------------------------------

  @Test
  public void testGetVarIndex_MatchesScope() {
    setup("function _(){var a,b,c;}");
    assertEquals(scope.getVar("a").index, liveness.getVarIndex("a"));
    assertEquals(scope.getVar("b").index, liveness.getVarIndex("b"));
    assertEquals(scope.getVar("c").index, liveness.getVarIndex("c"));
  }

  @Test
  public void testGetVarIndex_UndeclaredVariable_ThrowsNPE() {
    setup("function _(){var a;}");
    try {
      liveness.getVarIndex("doesNotExist");
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      // ASSUMPTION: Scope#getVar(name) คืน null เมื่อไม่พบตัวแปร ทำให้เกิด NPE
      // ที่ ".index" ภายใน getVarIndex() ของ source ที่ให้มา
    }
  }

  // ---------------------------------------------------------------------
  // isArgumentsName() / markAllParametersEscaped()
  // ---------------------------------------------------------------------

  @Test
  public void testEscapedLocals_ArgumentsUsage_MarksParamsEscaped() {
    setup("function _(x,y){arguments;}");
    Node argsRead = stmt(0); // NAME("arguments") เป็น top-level statement

    LiveVariableLattice result = liveness.flowThrough(
        argsRead, liveness.createInitialEstimateLattice());

    Var x = scope.getVar("x");
    Var y = scope.getVar("y");
    assertTrue(liveness.getEscapedLocals().contains(x));
    assertTrue(liveness.getEscapedLocals().contains(y));
    // การอ่าน "arguments" ไม่ทำให้ x หรือ y ถูก gen โดยตรง
    assertFalse(result.isLive(idx("x")));
    assertFalse(result.isLive(idx("y")));
  }

  @Test
  public void testIsArgumentsName_DeclaredLocally_TreatedAsNormalVar() {
    setup("function _(){var arguments; arguments;}");
    Node read = stmt(1);

    LiveVariableLattice result = liveness.flowThrough(
        read, liveness.createInitialEstimateLattice());

    assertTrue("declared locally -> treated as a normal local variable read",
        result.isLive(idx("arguments")));
    assertTrue(liveness.getEscapedLocals().isEmpty());
  }

  @Test
  public void testEscapedLocals_NestedFunctionClosure() {
    setup("function _(){var a; function g(){ a; } }");
    Var a = scope.getVar("a");
    // ตาม class-level Javadoc: ตัวแปรที่ inner function จับไว้ (closure) จะถูก
    // นับเป็น escaped ทันทีตอนสร้าง object (ผ่าน computeEscaped ที่ constructor เรียก)
    assertTrue("variable captured by an inner closure should be escaped",
        liveness.getEscapedLocals().contains(a));
  }

  // ---------------------------------------------------------------------
  // LiveVariableLattice: null-handling (fault-detecting tests)
  // ---------------------------------------------------------------------

  @Test
  public void testLatticeEquals_NullThrowsNPE() {
    setup("function _(){var a;}");
    LiveVariableLattice lattice = liveness.createInitialEstimateLattice();
    try {
      lattice.equals(null);
      fail("Expected NullPointerException (Preconditions.checkNotNull in equals())");
    } catch (NullPointerException expected) {
      // NOTE: ปกติ equals(null) ตาม Java contract ควร return false, แต่
      // implementation นี้เรียก Preconditions.checkNotNull(other) ก่อนเสมอ
      // จึง throw NPE แทน - นี่คือพฤติกรรมจริงที่ควรถูกจับด้วยเทสนี้
    }
  }

  @Test
  public void testLatticeIsLive_NullVar_ThrowsNPE() {
    setup("function _(){var a;}");
    LiveVariableLattice lattice = liveness.createInitialEstimateLattice();
    try {
      lattice.isLive((Var) null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      // isLive(Var) เรียก Preconditions.checkNotNull(v) ก่อนใช้ v.index
    }
  }

  @Test
  public void testLatticeToStringAndHashCode_NoException() {
    setup("function _(){var a;}");
    LiveVariableLattice lattice = liveness.createInitialEstimateLattice();
    assertNotNull(lattice.toString());
    lattice.hashCode(); // เพียงยืนยันว่าไม่ throw
  }

  // ---------------------------------------------------------------------
  // Smoke test: analyze() (สืบทอดจาก DataFlowAnalysis, ไม่ได้ query ผลลัพธ์)
  // ---------------------------------------------------------------------

  @Test
  public void testAnalyze_SmokeTest_NoExceptions() {
    setup("function _(x){ var a,b; if(x){ a=1; } else { while(b){ b=b+1; } } "
        + "try { a=2; } catch(e){} return a; }");
    try {
      // ASSUMPTION: analyze() เป็น no-arg method ที่สืบทอดมาจาก DataFlowAnalysis
      liveness.analyze();
    } catch (Exception e) {
      fail("analyze() should run to completion without throwing: " + e);
    }
  }
}
```

## ตารางสรุปความครอบคลุม (Branch/Condition)

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุมใน `LiveVariablesAnalysis` |
|---|---|
| `testIsForward_ReturnsFalse` | `isForward()` return false |
| `testCreateEntryLattice_AndInitialEstimate_AllDead` | `createEntryLattice()`, `createInitialEstimateLattice()` — lattice เริ่มต้นว่างทุกบิต |
| `testCreateInitialEstimateLattice_ZeroVariables_Boundary` | boundary: `numVars == 0` |
| `testFlowThrough_NoOp_Script_Block_Function` | `computeGenKill`: case `SCRIPT`/`BLOCK`/`FUNCTION` (no-op return) |
| `testFlowThrough_Var_NoInitializer_NoChange` | case `VAR`, branch `c.hasChildren() == false` |
| `testFlowThrough_Var_WithInitializer_KillsAndGens` | case `VAR`, branch `hasChildren()==true` + `!conditional` kill |
| `testFlowThrough_Assign_KillsLhsGensRhs` | default case, `isAssignmentOp && isName(lhs)`, `NodeUtil.isAssign==true` (ไม่ gen lhs), `!conditional` kill |
| `testFlowThrough_CompoundAssign_GensLhsAndRhs` | default case, `isAssign==false` (gen lhs เพิ่ม) |
| `testFlowThrough_And_ConditionalSuppressesKill` | case `AND`, forced `conditional=true` ที่ operand ที่ 2, branch `if(!conditional)`=false |
| `testFlowThrough_Or_BasicGen` | case `OR` |
| `testFlowThrough_Hook_AllOperandsGen` | case `HOOK`, ทั้ง 3 ลูก |
| `testFlowThrough_ForIn_DirectNameLhs` | case `FOR`, `isForIn==true`, branch `NodeUtil.isVar(lhs)==false` |
| `testFlowThrough_ForIn_VarDeclLhs` | case `FOR`, `isForIn==true`, branch `NodeUtil.isVar(lhs)==true` |
| `testFlowThrough_For_Regular_ConditionOnly` | case `FOR`, `isForIn==false` |
| `testFlowThrough_While` / `_Do` / `_If` | case `WHILE`/`DO`/`IF` (fallthrough label เดียวกัน) |
| `testFlowThrough_Default_RecursesCallArgs_IgnoresUndeclaredGlobal` | default case (ไม่ assignment) recursion + `addToSetIfLocal`: branch `!isDeclared` → return |
| `testFlowThrough_TryCatch_OnExEdgeSuppressesKill` | `flowThrough`: loop `edgeList`, branch `Branch.ON_EX.equals(...)==true` → `conditional=true` |
| `testFlowThrough_PlainAssign_NoTry_KillsNormally` | เทียบกรณี `conditional==false` (ไม่มี ON_EX) |
| `testGetVarIndex_MatchesScope` | `getVarIndex()` ปกติ |
| `testGetVarIndex_UndeclaredVariable_ThrowsNPE` | `getVarIndex()` กรณีตัวแปรไม่มีจริง (null/malformed input) |
| `testEscapedLocals_ArgumentsUsage_MarksParamsEscaped` | `isArgumentsName` true branch → `markAllParametersEscaped()` |
| `testIsArgumentsName_DeclaredLocally_TreatedAsNormalVar` | `isArgumentsName` false branch (`jsScope.isDeclared` true) |
| `testEscapedLocals_NestedFunctionClosure` | `escaped` set จาก closure (constructor) |
| `testLatticeEquals_NullThrowsNPE` | `LiveVariableLattice.equals(null)` — fault-detecting |
| `testLatticeIsLive_NullVar_ThrowsNPE` | `LiveVariableLattice.isLive(Var null)` — fault-detecting |
| `testLatticeToStringAndHashCode_NoException` | `toString()`, `hashCode()` |
| `testAnalyze_SmokeTest_NoExceptions` | integration smoke test ครอบคลุม `LiveVariableJoinOp.apply()` ทางอ้อม |

**หมายเหตุ:** ส่วนที่ต้องอิงกับ `Compiler#parseTestCode`, `SyntacticScopeCreator`, `ControlFlowAnalysis` และ `analyze()` เป็น API ของคลาสที่ไม่ได้แสดง source มาใน