# ควบคุมความเข้าใจก่อนเขียนเทส (ข้อสมมติที่ต้องระบุตาม requirement ข้อ 4)

เนื่องจาก `ControlFlowAnalysis` เป็น `final class` ที่มี access modifier แบบ package-private และ dependency หลาย method (`ControlFlowGraph`, `DiGraphNode`, `Compiler`, `NodeUtil`) ไม่ได้แสดง signature เต็มในซอร์สที่ให้มา ผมจึงต้อง**สมมติ**สิ่งต่อไปนี้ (มีคอมเมนต์กำกับในโค้ดด้วย):

1. คลาส `Compiler` (ใน package เดียวกัน) มี constructor `Compiler()` และ method `Node parseTestCode(String js)` สำหรับแปลง source เป็น AST (ใช้กันทั่วไปใน test suite เดิมของ Closure Compiler)
2. `ControlFlowGraph<Node>` มี method ตามที่ปรากฏใช้งานจริงในซอร์ส: `getDirectedGraphNodes()`, `getDirectedSuccNodes(node)`, `getEntry()`, `getImplicitReturn()`
3. `DiGraphNode<Node,Branch>` มี `getValue()`
4. `Node` มี `getType()`, `getFirstChild()`, `getNext()`, `getLastChild()`, `getString()`, `getParent()`, `getChildCount()`, `hasChildren()` (ตามที่ใช้ในซอร์สต้นฉบับ)
5. โครงสร้าง AST มาตรฐานของ Rhino/Closure: `IF[cond,then,else?]`, `CASE[expr,BLOCK]`, `DEFAULT[BLOCK]`, `TRY[body,catchContainerBLOCK,finally?]`, `CATCH[param,body]` — เป็นโครงสร้างมาตรฐานที่ใช้ทั่วทั้งโปรเจกต์ ไม่ใช่ behavior ที่เดาขึ้นใหม่

ผมจะเลี่ยงการ assert สิ่งที่ไม่สามารถยืนยันได้จากซอร์ส (เช่น ไม่ assert ว่า synthetic block, exact dedup behavior ของ edge ที่ปลายทางซ้ำกัน) และใส่คอมเมนต์กำกับจุดที่ยังไม่แน่ใจ

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

/**
 * Unit test สำหรับ ControlFlowAnalysis (Defects4J Closure-103b)
 *
 * หมายเหตุ: คลาสทดสอบนี้อยู่ package เดียวกับ SUT (com.google.javascript.jscomp)
 * เพราะ ControlFlowAnalysis เป็น package-private class จึงไม่ต้อง import class เป้าหมาย
 */
public class ControlFlowAnalysisTest {

  // ---------------------------------------------------------------------
  // Helper methods
  // ---------------------------------------------------------------------

  /**
   * สมมติฐาน: Compiler#parseTestCode(String) มีอยู่จริง และคืนค่า root node
   * ระดับ SCRIPT ของ source ที่ parse แล้ว (ใช้ตามรูปแบบทั่วไปของ test suite เดิม)
   */
  private ControlFlowGraph<Node> createCfg(String js, boolean traverseFunctions) {
    Compiler compiler = new Compiler();
    Node root = compiler.parseTestCode(js);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, traverseFunctions);
    cfa.process(null, root);
    return cfa.getCfg();
  }

  private ControlFlowGraph<Node> createCfg(String js) {
    return createCfg(js, true);
  }

  private DiGraphNode<Node, Branch> findFirstOfType(
      ControlFlowGraph<Node> cfg, int type) {
    for (DiGraphNode<Node, Branch> n : cfg.getDirectedGraphNodes()) {
      Node v = n.getValue();
      if (v != null && v.getType() == type) {
        return n;
      }
    }
    return null;
  }

  /** หา EXPR_RESULT ที่ child ตัวแรกเป็น NAME ตรงกับชื่อที่กำหนด (ใช้แยกความกำกวม) */
  private DiGraphNode<Node, Branch> findExprStmt(
      ControlFlowGraph<Node> cfg, String name) {
    for (DiGraphNode<Node, Branch> n : cfg.getDirectedGraphNodes()) {
      Node v = n.getValue();
      if (v != null && v.getType() == Token.EXPR_RESULT) {
        Node child = v.getFirstChild();
        if (child != null && child.getType() == Token.NAME
            && name.equals(child.getString())) {
          return n;
        }
      }
    }
    return null;
  }

  /** หา CASE node โดยดูจากชื่อ statement แรกใน body ของมัน (แยกความกำกวมเมื่อมีหลาย CASE) */
  private DiGraphNode<Node, Branch> findCaseByBodyFirstStmtName(
      ControlFlowGraph<Node> cfg, String name) {
    for (DiGraphNode<Node, Branch> n : cfg.getDirectedGraphNodes()) {
      Node v = n.getValue();
      if (v != null && v.getType() == Token.CASE) {
        Node body = v.getFirstChild().getNext();
        if (body != null) {
          Node firstStmt = body.getFirstChild();
          if (firstStmt != null && firstStmt.getType() == Token.EXPR_RESULT) {
            Node child = firstStmt.getFirstChild();
            if (child != null && child.getType() == Token.NAME
                && name.equals(child.getString())) {
              return n;
            }
          }
        }
      }
    }
    return null;
  }

  private boolean hasSuccessorWithType(
      ControlFlowGraph<Node> cfg, DiGraphNode<Node, Branch> from, int type) {
    for (DiGraphNode<Node, Branch> succ : cfg.getDirectedSuccNodes(from)) {
      Node v = succ.getValue();
      if (v != null && v.getType() == type) {
        return true;
      }
    }
    return false;
  }

  private boolean hasImplicitReturnSuccessor(
      ControlFlowGraph<Node> cfg, DiGraphNode<Node, Branch> from) {
    for (DiGraphNode<Node, Branch> succ : cfg.getDirectedSuccNodes(from)) {
      if (succ.getValue() == null) {
        return true;
      }
    }
    return false;
  }

  private boolean hasSuccessorExprNamed(
      ControlFlowGraph<Node> cfg, DiGraphNode<Node, Branch> from, String name) {
    for (DiGraphNode<Node, Branch> succ : cfg.getDirectedSuccNodes(from)) {
      Node v = succ.getValue();
      if (v != null && v.getType() == Token.EXPR_RESULT) {
        Node child = v.getFirstChild();
        if (child != null && child.getType() == Token.NAME
            && name.equals(child.getString())) {
          return true;
        }
      }
    }
    return false;
  }

  private int successorCount(ControlFlowGraph<Node> cfg, DiGraphNode<Node, Branch> from) {
    return cfg.getDirectedSuccNodes(from).size();
  }

  // ---------------------------------------------------------------------
  // Boundary / Empty / Null-ish cases
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScriptImplicitReturn() {
    // script ไม่มี statement เลย -> handleStmtList: child == null (else-branch)
    ControlFlowGraph<Node> cfg = createCfg("");
    DiGraphNode<Node, Branch> entry = cfg.getEntry();
    assertNotNull(entry);
    assertEquals(1, successorCount(cfg, entry));
    assertTrue(hasImplicitReturnSuccessor(cfg, entry));
  }

  @Test
  public void testAllStatementsAreFunctionDeclarationsOnly() {
    // child loop ใน handleStmtList จะข้าม FUNCTION ทั้งหมด จนเหลือ child == null
    // (คนละ branch จาก testEmptyScriptImplicitReturn แม้ผลลัพธ์คล้ายกัน)
    ControlFlowGraph<Node> cfg = createCfg("function f(){ foo; }", false);
    DiGraphNode<Node, Branch> entry = cfg.getEntry();
    assertEquals(1, successorCount(cfg, entry));
    assertTrue(hasImplicitReturnSuccessor(cfg, entry));
    // เพราะ shouldTraverseFunctions=false และ entry ไม่ใช่ตัว FUNCTION เอง -> ห้าม traverse เข้าไป
    assertNull(findExprStmt(cfg, "foo"));
  }

  @Test
  public void testSimpleStatementsChain() {
    ControlFlowGraph<Node> cfg = createCfg("var a; foo; bar;");
    DiGraphNode<Node, Branch> varNode = findFirstOfType(cfg, Token.VAR);
    DiGraphNode<Node, Branch> fooStmt = findExprStmt(cfg, "foo");
    DiGraphNode<Node, Branch> barStmt = findExprStmt(cfg, "bar");
    assertNotNull(varNode);
    assertNotNull(fooStmt);
    assertNotNull(barStmt);
    assertTrue(hasSuccessorWithType(cfg, varNode, Token.EXPR_RESULT));
    assertTrue(hasSuccessorExprNamed(cfg, varNode, "foo"));
    assertTrue(hasSuccessorExprNamed(cfg, fooStmt, "bar"));
    assertTrue(hasImplicitReturnSuccessor(cfg, barStmt)); // จบ script -> implicit return
  }

  // ---------------------------------------------------------------------
  // IF / ELSE branches
  // ---------------------------------------------------------------------

  @Test
  public void testIfWithoutElse() {
    // elseBlock == null -> createEdge(ON_FALSE, computeFollowNode(node))
    ControlFlowGraph<Node> cfg = createCfg("if (x) { foo; }");
    DiGraphNode<Node, Branch> ifNode = findFirstOfType(cfg, Token.IF);
    assertNotNull(ifNode);
    assertEquals(2, successorCount(cfg, ifNode));
    assertTrue(hasSuccessorWithType(cfg, ifNode, Token.BLOCK));
    assertTrue(hasImplicitReturnSuccessor(cfg, ifNode));
  }

  @Test
  public void testIfWithElse() {
    // elseBlock != null -> createEdge(ON_FALSE, computeFallThrough(elseBlock))
    ControlFlowGraph<Node> cfg = createCfg("if (x) { foo; } else { bar; }");
    DiGraphNode<Node, Branch> ifNode = findFirstOfType(cfg, Token.IF);
    assertNotNull(ifNode);
    // then-block และ else-block เป็นคนละ Node กัน -> ควรมี 2 successors ที่แตกต่างกัน
    assertEquals(2, successorCount(cfg, ifNode));
    assertFalse(hasImplicitReturnSuccessor(cfg, ifNode));
  }

  // ---------------------------------------------------------------------
  // WHILE / DO / FOR loops
  // ---------------------------------------------------------------------

  @Test
  public void testWhileLoop() {
    ControlFlowGraph<Node> cfg = createCfg("while (x) { foo; } bar;");
    DiGraphNode<Node, Branch> whileNode = findFirstOfType(cfg, Token.WHILE);
    assertEquals(2, successorCount(cfg, whileNode));
    assertTrue(hasSuccessorWithType(cfg, whileNode, Token.BLOCK));
    assertTrue(hasSuccessorExprNamed(cfg, whileNode, "bar"));

    // body -> ควร loop กลับไปที่ WHILE เอง (computeFollowNode case WHILE: return parent)
    DiGraphNode<Node, Branch> fooStmt = findExprStmt(cfg, "foo");
    assertTrue(hasSuccessorWithType(cfg, fooStmt, Token.WHILE));
  }

  @Test
  public void testDoWhileLoop() {
    ControlFlowGraph<Node> cfg = createCfg("do { foo; } while(x); bar;");
    DiGraphNode<Node, Branch> doNode = findFirstOfType(cfg, Token.DO);
    assertEquals(2, successorCount(cfg, doNode));
    assertTrue(hasSuccessorWithType(cfg, doNode, Token.BLOCK));
    assertTrue(hasSuccessorExprNamed(cfg, doNode, "bar"));

    DiGraphNode<Node, Branch> fooStmt = findExprStmt(cfg, "foo");
    assertTrue(hasSuccessorWithType(cfg, fooStmt, Token.DO)); // loop back ไปเช็ค condition
  }

  @Test
  public void testForClassicLoop() {
    // childCount == 4 branch ของ handleFor
    ControlFlowGraph<Node> cfg = createCfg("for (i=0;i<10;i++) { foo; } bar;");
    DiGraphNode<Node, Branch> forNode = findFirstOfType(cfg, Token.FOR);
    assertEquals(2, successorCount(cfg, forNode));
    assertTrue(hasSuccessorWithType(cfg, forNode, Token.BLOCK));
    assertTrue(hasSuccessorExprNamed(cfg, forNode, "bar"));

    DiGraphNode<Node, Branch> initNode = findFirstOfType(cfg, Token.ASSIGN);
    assertNotNull(initNode);
    assertTrue(hasSuccessorWithType(cfg, initNode, Token.FOR));

    DiGraphNode<Node, Branch> iterNode = findFirstOfType(cfg, Token.INC);
    assertNotNull(iterNode);
    assertTrue(hasSuccessorWithType(cfg, iterNode, Token.FOR));

    // body -> ควรกลับไปที่ iter (INC) ไม่ใช่กลับไปที่ FOR ตรง ๆ
    DiGraphNode<Node, Branch> fooStmt = findExprStmt(cfg, "foo");
    assertTrue(hasSuccessorWithType(cfg, fooStmt, Token.INC));
  }

  @Test
  public void testForInLoop() {
    // childCount != 4 (else-branch ของ handleFor)
    ControlFlowGraph<Node> cfg = createCfg("for (x in y) { foo; } bar;");
    DiGraphNode<Node, Branch> forNode = findFirstOfType(cfg, Token.FOR);
    assertEquals(2, successorCount(cfg, forNode));
    assertTrue(hasSuccessorWithType(cfg, forNode, Token.BLOCK));
    assertTrue(hasSuccessorExprNamed(cfg, forNode, "bar"));

    // for-in body ต้อง loop กลับไปที่ FOR ตรง ๆ (NodeUtil.isForIn == true -> return parent)
    DiGraphNode<Node, Branch> fooStmt = findExprStmt(cfg, "foo");
    assertTrue(hasSuccessorWithType(cfg, fooStmt, Token.FOR));
  }

  @Test
  public void testContinueInClassicForJumpsToIter() {
    ControlFlowGraph<Node> cfg = createCfg("for (i=0;i<10;i++) { continue; } after;");
    DiGraphNode<Node, Branch> continueNode = findFirstOfType(cfg, Token.CONTINUE);
    assertEquals(1, successorCount(cfg, continueNode));
    // childCount==4 -> iter = ... (จุดที่ CONTINUE ควรกระโดดไป คือ iter expression ไม่ใช่ FOR ตรงๆ)
    assertTrue(hasSuccessorWithType(cfg, continueNode, Token.INC));
  }

  @Test
  public void testLabeledContinueInWhile() {
    ControlFlowGraph<Node> cfg = createCfg("outer: while (x) { continue outer; } after;");
    DiGraphNode<Node, Branch> continueNode = findFirstOfType(cfg, Token.CONTINUE);
    assertEquals(1, successorCount(cfg, continueNode));
    // childCount != 4 -> iter = cur (WHILE เอง)
    assertTrue(hasSuccessorWithType(cfg, continueNode, Token.WHILE));
  }

  // ---------------------------------------------------------------------
  // SWITCH / CASE / DEFAULT branches
  // ---------------------------------------------------------------------

  @Test
  public void testSwitchDispatchesToFirstCase() {
    ControlFlowGraph<Node> cfg =
        createCfg("switch(x) { case 1: foo; break; case 2: bar; }");
    DiGraphNode<Node, Branch> switchNode = findFirstOfType(cfg, Token.SWITCH);
    assertTrue(hasSuccessorWithType(cfg, switchNode, Token.CASE));
  }

  @Test
  public void testSwitchNoCaseWithDefault() {
    // ไม่มี CASE เลย แต่มี DEFAULT -> createEdge(UNCOND, node.getFirstChild().getNext())
    ControlFlowGraph<Node> cfg = createCfg("switch(x) { default: foo; }");
    DiGraphNode<Node, Branch> switchNode = findFirstOfType(cfg, Token.SWITCH);
    assertTrue(hasSuccessorWithType(cfg, switchNode, Token.DEFAULT));
  }

  @Test
  public void testSwitchEmptyBodyGoesToFollow() {
    // ไม่มี CASE ไม่มี DEFAULT -> createEdge(UNCOND, computeFollowNode(node))
    ControlFlowGraph<Node> cfg = createCfg("switch(x) { } after;");
    DiGraphNode<Node, Branch> switchNode = findFirstOfType(cfg, Token.SWITCH);
    assertTrue(hasSuccessorExprNamed(cfg, switchNode, "after"));
  }

  @Test
  public void testCaseFallsThroughToNextCase() {
    ControlFlowGraph<Node> cfg =
        createCfg("switch(x) { case 1: foo; case 2: bar; }");
    DiGraphNode<Node, Branch> case1 = findCaseByBodyFirstStmtName(cfg, "foo");
    assertNotNull(case1);
    assertEquals(2, successorCount(cfg, case1));
    assertTrue(hasSuccessorWithType(cfg, case1, Token.CASE));
  }

  @Test
  public void testCaseFallsThroughToDefaultWhenNoMoreCase() {
    ControlFlowGraph<Node> cfg =
        createCfg("switch(x) { case 1: foo; default: bar; }");
    DiGraphNode<Node, Branch> case1 = findCaseByBodyFirstStmtName(cfg, "foo");
    assertNotNull(case1);
    assertTrue(hasSuccessorWithType(cfg, case1, Token.DEFAULT));
  }

  @Test
  public void testCaseFallsThroughToFollowWhenNoDefault() {
    ControlFlowGraph<Node> cfg =
        createCfg("switch(x) { case 1: foo; case 2: bar; } after;");
    DiGraphNode<Node, Branch> case2 = findCaseByBodyFirstStmtName(cfg, "bar");
    assertNotNull(case2);
    assertTrue(hasSuccessorExprNamed(cfg, case2, "after"));
  }

  @Test
  public void testUnlabeledBreakInSwitch() {
    ControlFlowGraph<Node> cfg =
        createCfg("switch(x) { case 1: foo; break; } after;");
    DiGraphNode<Node, Branch> breakNode = findFirstOfType(cfg, Token.BREAK);
    assertEquals(1, successorCount(cfg, breakNode));
    assertTrue(hasSuccessorExprNamed(cfg, breakNode, "after"));
  }

  // ---------------------------------------------------------------------
  // BREAK / CONTINUE with LABEL (matchLabel walking ผ่าน LABEL ancestor)
  // ---------------------------------------------------------------------

  @Test
  public void testLabeledBreakOutOfBlock() {
    // BLOCK ธรรมดา break ได้เฉพาะเมื่อมี label เท่านั้น (isBreakStructure: case BLOCK -> labeled)
    ControlFlowGraph<Node> cfg =
        createCfg("outer: { foo; break outer; bar; } baz;");
    DiGraphNode<Node, Branch> breakNode = findFirstOfType(cfg, Token.BREAK);
    assertEquals(1, successorCount(cfg, breakNode));
    assertTrue(hasSuccessorExprNamed(cfg, breakNode, "baz"));
  }

  @Test
  public void testBreakThroughFinally() {
    // ครอบคลุม branch: cur.getType()==TRY && NodeUtil.hasFinally(cur) ใน handleBreak
    ControlFlowGraph<Node> cfg =
        createCfg("while (x) { try { break; } finally { cleanup; } } after;");
    DiGraphNode<Node, Branch> breakNode = findFirstOfType(cfg, Token.BREAK);
    assertEquals(1, successorCount(cfg, breakNode));
    assertTrue(hasSuccessorWithType(cfg, breakNode, Token.BLOCK)); // -> finally block

    // cleanup; (ใน finally) ต้องมีทั้งเส้นทางปกติ (loop back WHILE)
    // และเส้นทางจาก finallyMap (ไป "after") อันเป็นผลจาก side-effect ของ computeFollowNode
    DiGraphNode<Node, Branch> cleanupStmt = findExprStmt(cfg, "cleanup");
    assertNotNull(cleanupStmt);
    assertTrue(hasSuccessorWithType(cfg, cleanupStmt, Token.WHILE));
    assertTrue(hasSuccessorExprNamed(cfg, cleanupStmt, "after"));
  }

  // ---------------------------------------------------------------------
  // RETURN / THROW
  // ---------------------------------------------------------------------

  @Test
  public void testReturnWithValueNoFinallyNoExceptionEdge() {
    // node.hasChildren() == true, exceptionHandler มีแค่ FUNCTION -> connectToPossibleExceptionHandler คืนทันที
    ControlFlowGraph<Node> cfg = createCfg("function f(){ return foo(); }");
    DiGraphNode<Node, Branch> returnNode = findFirstOfType(cfg, Token.RETURN);
    assertNotNull(returnNode);
    assertEquals(1, successorCount(cfg, returnNode));
    assertTrue(hasImplicitReturnSuccessor(cfg, returnNode));
  }

  @Test
  public void testReturnThroughFinally() {
    // ครอบคลุม NodeUtil.hasFinally(curHandler) == true ใน handleReturn
    // และ branch "coming out of FINALLY" ใน computeFollowNode
    ControlFlowGraph<Node> cfg =
        createCfg("function f(){ try { return; } finally { cleanup; } }");
    DiGraphNode<Node, Branch> returnNode = findFirstOfType(cfg, Token.RETURN);
    assertEquals(1, successorCount(cfg, returnNode));
    assertTrue(hasSuccessorWithType(cfg, returnNode, Token.BLOCK)); // -> finally block

    DiGraphNode<Node, Branch> cleanupStmt = findExprStmt(cfg, "cleanup");
    assertNotNull(cleanupStmt);
    // ผ่าน finallyMap -> ต้องมี edge กลับไปยัง implicit return ของฟังก์ชันด้วย
    assertTrue(hasImplicitReturnSuccessor(cfg, cleanupStmt));
  }

  @Test
  public void testThrowConnectsOnlyToCatch() {
    ControlFlowGraph<Node> cfg =
        createCfg("try { throw e; } catch (e) { bar; }");
    DiGraphNode<Node, Branch> throwNode = findFirstOfType(cfg, Token.THROW);
    assertNotNull(throwNode);
    // handleThrow ไม่สร้าง UNCOND edge เลย มีแต่ ON_EX ไปยัง catch block เท่านั้น
    assertEquals(1, successorCount(cfg, throwNode));
    assertTrue(hasSuccessorWithType(cfg, throwNode, Token.BLOCK));
  }

  @Test
  public void testThrowWithoutTryHasNoSuccessors() {
    // ไม่มี try ล้อมรอบ -> exceptionHandler ว่าง -> mayThrowException เจอ แต่ไม่มี handler
    // -> ไม่มีการสร้าง edge ใด ๆ จาก THROW เลย
    ControlFlowGraph<Node> cfg = createCfg("function f(){ throw e; }");
    DiGraphNode<Node, Branch> throwNode = findFirstOfType(cfg, Token.THROW);
    assertNotNull(throwNode); // ยังถูกสร้างเป็น node เพราะเป็นปลายทางของ edge จาก BLOCK
    assertEquals(0, successorCount(cfg, throwNode));
  }

  // ---------------------------------------------------------------------
  // TRY / CATCH / FINALLY (โครงสร้าง exceptionHandler stack)
  // ---------------------------------------------------------------------

  @Test
  public void testTryCatchNoFinally() {
    ControlFlowGraph<Node> cfg =
        createCfg("try { foo(); } catch (e) { bar; }");
    DiGraphNode<Node, Branch> fooStmt = findExprStmt(cfg, "foo");
    assertNotNull(fooStmt);
    // foo(); ควรมี 2 successors: ON_EX -> catch block, UNCOND -> implicit return (จบ script)
    assertEquals(2, successorCount(cfg, fooStmt));
    assertTrue(hasSuccessorWithType(cfg, fooStmt, Token.BLOCK));
    assertTrue(hasImplicitReturnSuccessor(cfg, fooStmt));
  }

  @Test
  public void testTryFinallyNoCatch() {
    // ครอบคลุม branch !NodeUtil.hasCatchHandler(catchBlock) ใน connectToPossibleExceptionHandler
    ControlFlowGraph<Node> cfg =
        createCfg("try { foo(); } finally { cleanup; } after;");
    DiGraphNode<Node, Branch> fooStmt = findExprStmt(cfg, "foo");
    assertNotNull(fooStmt);
    // ไม่ assert exact size เพราะไม่แน่ใจ dedup behavior ของ DiGraph เมื่อปลายทางซ้ำกัน (ON_EX และ UNCOND ชี้ที่เดียวกัน)
    assertTrue(hasSuccessorWithType(cfg, fooStmt, Token.BLOCK)); // -> finally block
  }

  // ---------------------------------------------------------------------
  // WITH
  // ---------------------------------------------------------------------

  @Test
  public void testWithStatement() {
    ControlFlowGraph<Node> cfg = createCfg("with (obj) { foo; } bar;");
    DiGraphNode<Node, Branch> withNode = findFirstOfType(cfg, Token.WITH);
    assertEquals(1, successorCount(cfg, withNode));
    assertTrue(hasSuccessorWithType(cfg, withNode, Token.BLOCK));

    DiGraphNode<Node, Branch> fooStmt = findExprStmt(cfg, "foo");
    assertTrue(hasSuccessorExprNamed(cfg, fooStmt, "bar"));
  }

  // ---------------------------------------------------------------------
  // FUNCTION traversal flags (shouldTraverse: FUNCTION branch)
  // ---------------------------------------------------------------------

  @Test
  public void testFunctionSkippedWhenNotTraversing() {
    ControlFlowGraph<Node> cfg = createCfg("function f() { foo; } bar;", false);
    assertNull(findExprStmt(cfg, "foo"));
    assertNotNull(findExprStmt(cfg, "bar"));
  }

  @Test
  public void testFunctionTraversedWhenFlagTrue() {
    ControlFlowGraph<Node> cfg = createCfg("function f() { foo; } bar;", true);
    assertNotNull(findExprStmt(cfg, "foo"));
    assertNotNull(findExprStmt(cfg, "bar"));
  }

  @Test
  public void testEntryIsFunctionAlwaysTraversed() {
    // ครอบคลุม branch: n == cfg.getEntry().getValue() เป็น true ทั้งที่ shouldTraverseFunctions=false
    Compiler compiler = new Compiler();
    Node script = compiler.parseTestCode("function f() { foo; }");
    Node functionNode = script.getFirstChild();
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false);
    cfa.process(null, functionNode);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    assertNotNull(findExprStmt(cfg, "foo"));
  }
}
```

# ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testEmptyScriptImplicitReturn | `handleStmtList`: child==null (ไม่มี statement) → follow=null |
| testAllStatementsAreFunctionDeclarationsOnly | `handleStmtList`: while-loop ข้าม FUNCTION จนเหลือ child==null; `shouldTraverse` FUNCTION-branch=false |
| testSimpleStatementsChain | `handleStmt`, `handleExpr` chain, follow ปลาย script → null |
| testIfWithoutElse | `handleIf`: elseBlock==null branch |
| testIfWithElse | `handleIf`: elseBlock!=null branch |
| testWhileLoop | `handleWhile` ON_TRUE/ON_FALSE, `computeFollowNode` case WHILE |
| testDoWhileLoop | `handleDo`, `computeFollowNode` case DO, `computeFallThrough` case DO |
| testForClassicLoop | `handleFor` childCount==4 branch, edge init/iter↔FOR |
| testForInLoop | `handleFor` else-branch (for-in), `computeFallThrough`/`computeFollowNode` isForIn=true |
| testContinueInClassicForJumpsToIter | `handleContinue`: `cur.getChildCount()==4` branch |
| testLabeledContinueInWhile | `handleContinue`: childCount!=4, `isContinueStructure`, `matchLabel` ผ่าน LABEL |
| testSwitchDispatchesToFirstCase | `handleSwitch`: next!=null (มี CASE) |
| testSwitchNoCaseWithDefault | `handleSwitch`: next==null, มี DEFAULT |
| testSwitchEmptyBodyGoesToFollow | `handleSwitch`: next==null, ไม่มี DEFAULT |
| testCaseFallsThroughToNextCase | `handleCase`: next(CASE)!=null |
| testCaseFallsThroughToDefaultWhenNoMoreCase | `handleCase`: next==null, deflt!=null |
| testCaseFallsThroughToFollowWhenNoDefault | `handleCase`: next==null, deflt==null |
| testUnlabeledBreakInSwitch | `handleBreak`: isBreakStructure SWITCH=true, ไม่มี FINALLY |
| testLabeledBreakOutOfBlock | `handleBreak`/`isBreakStructure` BLOCK-labeled, `matchLabel` เดินขึ้น LABEL |
| testBreakThroughFinally | `handleBreak`: TRY+hasFinally branch, `computeFollowNode` "coming out of FINALLY" |
| testReturnWithValueNoFinallyNoExceptionEdge | `handleReturn`: isFunction break ทันที, `connectToPossibleExceptionHandler` isFunction-return branch |
| testReturnThroughFinally | `handleReturn`: hasFinally=true, lastJump==null→!=null, finallyMap side-edge |
| testThrowConnectsOnlyToCatch | `handleThrow`/`connectToPossibleExceptionHandler`: hasCatchHandler=true, return ทันที |
| testThrowWithoutTryHasNoSuccessors | `connectToPossibleExceptionHandler`: exceptionHandler.isEmpty()==true (ไม่สร้าง edge) |
| testTryCatchNoFinally | `connectToPossibleExceptionHandler` มี catch, `computeFollowNode` case TRY (no finally) |
| testTryFinallyNoCatch | `connectToPossibleExceptionHandler`: !hasCatchHandler branch, `handleStmtList` empty-catch-block skip |
| testWithStatement | `handleWith`, generic sibling fallback (WITH ไม่อยู่ใน switch ของ computeFollowNode) |
| testFunctionSkippedWhenNotTraversing | `shouldTraverse` FUNCTION: shouldTraverseFunctions=false, n!=entry |
| testFunctionTraversedWhenFlagTrue | `shouldTraverse` FUNCTION: shouldTraverseFunctions=true |
| testEntryIsFunctionAlwaysTraversed | `shouldTraverse` FUNCTION: n==cfg.getEntry().getValue()=true |

**ข้อจำกัดที่ทราบ:** ไม่สามารถ assert exact branch label (ON_TRUE/ON_FALSE/ON_EX) ได้ เนื่องจากซอร์สที่ให้มาไม่ได้ expose API สำหรับอ่าน edge label จาก `DiGraphNode`/`ControlFlowGraph` โดยตรง (มีเพียง `getDirectedSuccNodes` ที่คืนเฉพาะ node ปลายทาง) จึงใช้การตรวจสอบ **จำนวน/ชนิดของ successor** แทน ซึ่งยังคงตรวจจับ fault เชิงโครงสร้างได้ในระดับดี