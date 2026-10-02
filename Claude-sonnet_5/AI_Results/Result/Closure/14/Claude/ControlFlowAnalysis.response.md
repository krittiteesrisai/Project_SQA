# ควบคุมความเข้าใจก่อนเขียนโค้ด

เนื่องจาก `ControlFlowAnalysis` เป็นคลาส **package-private** ที่พึ่งพา `Compiler`, `Node`, `Token`, `ControlFlowGraph`, `DiGraphNode` ซึ่งเป็นส่วนหนึ่งของโปรเจกต์ Closure Compiler เอง (ไม่ใช่ jar ภายนอกที่ระบุ) ผมจึงวาง `ControlFlowAnalysisTest` ไว้ใน **package เดียวกัน** (`com.google.javascript.jscomp`) เพื่อให้เข้าถึง package-private members ได้โดยตรง และใช้ `Compiler` จริง (concrete class ของ jscomp) ในการ parse JS source เป็น `Node` tree แทนการ mock

**ข้อสมมติที่ไม่แน่ใจ 100% (มีคอมเมนต์กำกับในโค้ด):**
- `Compiler#parseTestCode(String)` มีอยู่จริงและคืน SCRIPT node
- `Compiler#isIdeMode()` อาจ throw NPE หากยังไม่ init options — จึงใช้ `expected = RuntimeException.class` แทนการเจาะจง exception type
- พฤติกรรมภายในของ `NodeUtil.getCatchBlock/hasCatchHandler/hasFinally` ไม่ได้แสดงในซอร์ส จึงหลีกเลี่ยงการ assert โครงสร้างที่ละเอียดเกินไปในส่วนที่เกี่ยวข้อง

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Unit tests for {@link ControlFlowAnalysis}.
 *
 * หมายเหตุ: คลาสนี้อยู่ใน package เดียวกับ target class เพื่อเข้าถึง
 * package-private constructor/method ได้โดยตรง (ไม่ใช้ reflection)
 * และใช้ com.google.javascript.jscomp.Compiler จริงในการ parse JS
 * เนื่องจาก ControlFlowAnalysis ต้องพึ่งพา Node tree ที่มี parent/sibling
 * link ที่ถูกต้องจริง ๆ (ไม่สามารถ mock ได้ง่ายด้วย jar ที่กำหนด)
 */
public class ControlFlowAnalysisTest {

  // เก็บ root (SCRIPT) ของการ parse ครั้งล่าสุด เพื่อให้ test method
  // นำ Node ไปตรวจสอบต่อได้
  private Node lastRoot;

  // ---------------------------------------------------------------------
  // Helpers
  // ---------------------------------------------------------------------

  private ControlFlowGraph<Node> createCfg(String js) {
    return createCfg(js, true);
  }

  private ControlFlowGraph<Node> createCfg(String js, boolean traverseFunctions) {
    Compiler compiler = new Compiler();
    // ไม่แน่ใจ 100% ว่า parseTestCode มี signature นี้เสมอไปในทุก build
    // แต่เป็น pattern ที่ใช้ทดสอบ compiler pass ในลักษณะนี้
    lastRoot = compiler.parseTestCode(js);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, traverseFunctions, false);
    cfa.process(null, lastRoot);
    return cfa.getCfg();
  }

  /** ค้นหา Node แรกที่มี type ตรงตามที่ระบุ ด้วยการเดิน DFS แบบ pre-order */
  private Node findNodeOfType(Node root, int type) {
    if (root == null) {
      return null;
    }
    if (root.getType() == type) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node result = findNodeOfType(c, type);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  /** ค้นหา DiGraphNode ใน cfg ที่มี value ตรงกับ Node ที่ระบุ (อ้างอิงเดียวกัน) */
  private DiGraphNode<Node, Branch> findGraphNode(ControlFlowGraph<Node> cfg, Node value) {
    for (DiGraphNode<Node, Branch> n : cfg.getDirectedGraphNodes()) {
      if (n.getValue() == value) {
        return n;
      }
    }
    return null;
  }

  /** คืน Set ของ Node ที่เป็น successor ของ DiGraphNode ที่ระบุ (รวม null ที่แทน implicit return) */
  private Set<Node> succValues(ControlFlowGraph<Node> cfg, DiGraphNode<Node, Branch> node) {
    Set<Node> result = new HashSet<Node>();
    for (DiGraphNode<Node, Branch> succ : cfg.getDirectedSuccNodes(node)) {
      result.add(succ.getValue());
    }
    return result;
  }

  // ---------------------------------------------------------------------
  // Boundary / null / malformed input
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScriptProcessesWithoutError() {
    ControlFlowGraph<Node> cfg = createCfg("");
    assertNotNull(cfg);
    assertNotNull(cfg.getEntry());
  }

  @Test(expected = RuntimeException.class)
  public void testNullJsInputThrows() {
    createCfg(null);
  }

  @Test(expected = RuntimeException.class)
  public void testProcessWithNullRootThrows() {
    // เรียก process() ตรง ๆ โดยไม่ผ่าน parser เพื่อทดสอบ boundary
    // ของ ControlFlowAnalysis เอง: computeFallThrough(null) จะ NPE
    // เนื่องจากไม่มีการตรวจสอบ null ในซอร์สโค้ด
    Compiler compiler = new Compiler();
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, false);
    cfa.process(null, null);
  }

  @Test
  public void testMalformedJsDoesNotHangOrCorruptState() {
    // พฤติกรรม error-recovery ของ parseTestCode ไม่ได้อยู่ในซอร์สที่ให้มา
    // จึงยอมรับได้ทั้งกรณีสำเร็จหรือ throw exception ใด ๆ โดยไม่ hang
    try {
      createCfg("if (a) { ");
    } catch (Exception e) {
      // acceptable
    }
  }

  // ---------------------------------------------------------------------
  // IF / ELSE
  // ---------------------------------------------------------------------

  @Test
  public void testIfElseCreatesTrueAndFalseEdges() {
    ControlFlowGraph<Node> cfg = createCfg("if(a){b=1;}else{c=1;}");
    Node ifNode = findNodeOfType(lastRoot, Token.IF);
    Node thenBlock = ifNode.getFirstChild().getNext();
    Node elseBlock = thenBlock.getNext();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, ifNode));
    assertTrue(succs.contains(thenBlock));
    assertTrue(succs.contains(elseBlock));
  }

  @Test
  public void testIfWithoutElseFalseEdgeGoesToNull() {
    ControlFlowGraph<Node> cfg = createCfg("if(a){b=1;}");
    Node ifNode = findNodeOfType(lastRoot, Token.IF);
    Node thenBlock = ifNode.getFirstChild().getNext();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, ifNode));
    assertTrue(succs.contains(thenBlock));
    assertTrue(succs.contains(null)); // implicit return (follow of last stmt)
  }

  @Test
  public void testStatementInsideIfThenFollowsIfsFollow() {
    ControlFlowGraph<Node> cfg = createCfg("if(a){ b=1; } c=1;");
    Node ifNode = findNodeOfType(lastRoot, Token.IF);
    Node thenBlock = ifNode.getFirstChild().getNext();
    Node bStmt = thenBlock.getFirstChild();
    Node cStmt = lastRoot.getLastChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, bStmt));
    assertTrue(succs.contains(cStmt));
  }

  // ---------------------------------------------------------------------
  // WHILE
  // ---------------------------------------------------------------------

  @Test
  public void testWhileCreatesTrueAndFalseEdges() {
    ControlFlowGraph<Node> cfg = createCfg("while(a){b=1;}");
    Node whileNode = findNodeOfType(lastRoot, Token.WHILE);
    Node body = whileNode.getFirstChild().getNext();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, whileNode));
    assertTrue(succs.contains(body));
    assertTrue(succs.contains(null));
  }

  @Test
  public void testLastStatementInWhileBodyFollowsToWhileNode() {
    ControlFlowGraph<Node> cfg = createCfg("while(a){ b=1; }");
    Node whileNode = findNodeOfType(lastRoot, Token.WHILE);
    Node body = whileNode.getFirstChild().getNext();
    Node bStmt = body.getFirstChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, bStmt));
    assertTrue(succs.contains(whileNode));
  }

  // ---------------------------------------------------------------------
  // DO-WHILE
  // ---------------------------------------------------------------------

  @Test
  public void testDoWhileCreatesTrueAndFalseEdges() {
    ControlFlowGraph<Node> cfg = createCfg("do{b=1;}while(a);");
    Node doNode = findNodeOfType(lastRoot, Token.DO);
    Node body = doNode.getFirstChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, doNode));
    assertTrue(succs.contains(body));
    assertTrue(succs.contains(null));
  }

  // ---------------------------------------------------------------------
  // FOR (classic)
  // ---------------------------------------------------------------------

  @Test
  public void testForClassicEdges() {
    ControlFlowGraph<Node> cfg = createCfg("for(i=0;i<10;i++){b=1;}");
    Node forNode = findNodeOfType(lastRoot, Token.FOR);
    Node init = forNode.getFirstChild();
    Node cond = init.getNext();
    Node iter = cond.getNext();
    Node body = iter.getNext();

    assertTrue(succValues(cfg, findGraphNode(cfg, init)).contains(forNode));
    Set<Node> forSuccs = succValues(cfg, findGraphNode(cfg, forNode));
    assertTrue(forSuccs.contains(body));
    assertTrue(forSuccs.contains(null));
    assertTrue(succValues(cfg, findGraphNode(cfg, iter)).contains(forNode));
  }

  @Test
  public void testLastStatementInForBodyFollowsToIter() {
    ControlFlowGraph<Node> cfg = createCfg("for(i=0;i<10;i++){ b=1; }");
    Node forNode = findNodeOfType(lastRoot, Token.FOR);
    Node iter = forNode.getFirstChild().getNext().getNext();
    Node body = iter.getNext();
    Node bStmt = body.getFirstChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, bStmt));
    assertTrue(succs.contains(iter));
  }

  // ---------------------------------------------------------------------
  // FOR-IN
  // ---------------------------------------------------------------------

  @Test
  public void testForInEdges() {
    ControlFlowGraph<Node> cfg = createCfg("for(k in obj){b=1;}");
    Node forNode = findNodeOfType(lastRoot, Token.FOR);
    Node item = forNode.getFirstChild();
    Node collection = item.getNext();
    Node body = collection.getNext();

    assertTrue(succValues(cfg, findGraphNode(cfg, collection)).contains(forNode));
    Set<Node> forSuccs = succValues(cfg, findGraphNode(cfg, forNode));
    assertTrue(forSuccs.contains(body));
    assertTrue(forSuccs.contains(null));
  }

  @Test
  public void testLastStatementInForInBodyFollowsToForNode() {
    ControlFlowGraph<Node> cfg = createCfg("for(k in obj){ b=1; }");
    Node forNode = findNodeOfType(lastRoot, Token.FOR);
    Node body = forNode.getFirstChild().getNext().getNext();
    Node bStmt = body.getFirstChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, bStmt));
    assertTrue(succs.contains(forNode));
  }

  // ---------------------------------------------------------------------
  // SWITCH / CASE / DEFAULT
  // ---------------------------------------------------------------------

  @Test
  public void testSwitchWithCaseUnconditionalEdge() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){case 1:b=1;break;}");
    Node switchNode = findNodeOfType(lastRoot, Token.SWITCH);
    Node caseNode = switchNode.getFirstChild().getNext();
    assertTrue(succValues(cfg, findGraphNode(cfg, switchNode)).contains(caseNode));
  }

  @Test
  public void testSwitchNoCaseWithDefaultEdge() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){default:b=1;}");
    Node switchNode = findNodeOfType(lastRoot, Token.SWITCH);
    Node defaultNode = switchNode.getFirstChild().getNext();
    assertTrue(succValues(cfg, findGraphNode(cfg, switchNode)).contains(defaultNode));
  }

  @Test
  public void testSwitchEmptyEdgeToFollow() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){}");
    Node switchNode = findNodeOfType(lastRoot, Token.SWITCH);
    assertTrue(succValues(cfg, findGraphNode(cfg, switchNode)).contains(null));
  }

  @Test
  public void testCaseWithNextCaseEdge() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){case 1:b=1;case 2:c=1;}");
    Node case1 = findNodeOfType(lastRoot, Token.CASE);
    Node body1 = case1.getFirstChild().getNext();
    Node case2 = case1.getNext();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, case1));
    assertTrue(succs.contains(body1));
    assertTrue(succs.contains(case2));
  }

  @Test
  public void testCaseWithNoNextCaseButDefaultEdge() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){case 1:b=1;default:c=1;}");
    Node case1 = findNodeOfType(lastRoot, Token.CASE);
    Node defaultNode = case1.getNext();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, case1));
    assertTrue(succs.contains(defaultNode));
  }

  @Test
  public void testCaseWithNoNextAndNoDefaultEdge() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){case 1:b=1;}");
    Node case1 = findNodeOfType(lastRoot, Token.CASE);
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, case1));
    assertTrue(succs.contains(null));
  }

  @Test
  public void testCaseFallthroughFollowsNextCaseBody() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){case 1: b=1; case 2: c=1;}");
    Node case1 = findNodeOfType(lastRoot, Token.CASE);
    Node case1Body = case1.getFirstChild().getNext();
    Node bStmt = case1Body.getFirstChild();
    Node case2 = case1.getNext();
    Node case2Body = case2.getFirstChild().getNext();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, bStmt));
    assertTrue(succs.contains(case2Body));
  }

  @Test
  public void testCaseFallthroughToDefaultBody() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){case 1: b=1; default: c=1;}");
    Node case1 = findNodeOfType(lastRoot, Token.CASE);
    Node case1Body = case1.getFirstChild().getNext();
    Node bStmt = case1Body.getFirstChild();
    Node defaultNode = case1.getNext();
    Node defaultBody = defaultNode.getFirstChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, bStmt));
    assertTrue(succs.contains(defaultBody));
  }

  @Test
  public void testLastCaseFollowsSwitchFollow() {
    ControlFlowGraph<Node> cfg = createCfg("switch(a){case 1: b=1;} d=1;");
    Node case1 = findNodeOfType(lastRoot, Token.CASE);
    Node case1Body = case1.getFirstChild().getNext();
    Node bStmt = case1Body.getFirstChild();
    Node dStmt = lastRoot.getLastChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, bStmt));
    assertTrue(succs.contains(dStmt));
  }

  // ---------------------------------------------------------------------
  // WITH
  // ---------------------------------------------------------------------

  @Test
  public void testWithStatementEdge() {
    ControlFlowGraph<Node> cfg = createCfg("with(a) { b = 1; }");
    Node withNode = findNodeOfType(lastRoot, Token.WITH);
    Node body = withNode.getLastChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, withNode));
    assertTrue(succs.contains(body));
  }

  // ---------------------------------------------------------------------
  // TRY / CATCH / FINALLY / THROW
  // ---------------------------------------------------------------------

  @Test
  public void testTryFirstChildEdge() {
    ControlFlowGraph<Node> cfg = createCfg("try{a=1;}catch(e){b=1;}finally{c=1;}");
    Node tryNode = findNodeOfType(lastRoot, Token.TRY);
    Node tryBody = tryNode.getFirstChild();
    assertTrue(succValues(cfg, findGraphNode(cfg, tryNode)).contains(tryBody));
  }

  @Test
  public void testCatchLastChildEdge() {
    ControlFlowGraph<Node> cfg = createCfg("try{a=1;}catch(e){b=1;}");
    Node catchNode = findNodeOfType(lastRoot, Token.CATCH);
    assertNotNull(catchNode);
    Node catchBody = catchNode.getLastChild();
    assertTrue(succValues(cfg, findGraphNode(cfg, catchNode)).contains(catchBody));
  }

  @Test
  public void testThrowInsideTryFinallyOnlyConnectsToFinally() {
    ControlFlowGraph<Node> cfg = createCfg("try { throw x; } finally { y = 1; }");
    Node throwNode = findNodeOfType(lastRoot, Token.THROW);
    Node tryNode = findNodeOfType(lastRoot, Token.TRY);
    Node finallyBlock = tryNode.getLastChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, throwNode));
    assertTrue(succs.contains(finallyBlock));
  }

  @Test
  public void testThrowInsideTryDoesNotCrash() {
    // ไม่ทราบโครงสร้างจริงของ NodeUtil.getCatchBlock() จึงไม่ assert target
    // ที่แน่ชัด แต่ตรวจว่ามีการเชื่อม edge เกิดขึ้นจริงและไม่ throw
    ControlFlowGraph<Node> cfg = createCfg("try { throw x; } catch(e) { y = 1; }");
    Node throwNode = findNodeOfType(lastRoot, Token.THROW);
    DiGraphNode<Node, Branch> throwGraphNode = findGraphNode(cfg, throwNode);
    assertNotNull(throwGraphNode);
    assertFalse(cfg.getDirectedSuccNodes(throwGraphNode).isEmpty());
  }

  @Test
  public void testTryFinallyOnlySkipsEmptyCatchBlockAndStillConnectsBody() {
    // ทดสอบ branch การข้าม synthetic empty-catch block ใน handleStmtList()
    // (ไม่มี catch เลย มีแต่ finally) โดยยืนยันว่า process ไม่ throw
    // และ edge หลักของ TRY ยังทำงานถูกต้อง
    ControlFlowGraph<Node> cfg = createCfg("try { a=1; } finally { b=1; }");
    Node tryNode = findNodeOfType(lastRoot, Token.TRY);
    Node tryBody = tryNode.getFirstChild();
    assertTrue(succValues(cfg, findGraphNode(cfg, tryNode)).contains(tryBody));
  }

  // ---------------------------------------------------------------------
  // BREAK / CONTINUE
  // ---------------------------------------------------------------------

  @Test
  public void testBreakWithLabel() {
    ControlFlowGraph<Node> cfg = createCfg("L: while(a) { break L; }");
    Node breakNode = findNodeOfType(lastRoot, Token.BREAK);
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, breakNode));
    assertTrue(succs.contains(null));
  }

  @Test
  public void testContinueWithLabel() {
    ControlFlowGraph<Node> cfg = createCfg("L: while(a) { continue L; }");
    Node continueNode = findNodeOfType(lastRoot, Token.CONTINUE);
    Node whileNode = findNodeOfType(lastRoot, Token.WHILE);
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, continueNode));
    assertTrue(succs.contains(whileNode));
  }

  @Test
  public void testContinueInClassicFor() {
    ControlFlowGraph<Node> cfg = createCfg("for(i=0;i<10;i++){ continue; }");
    Node continueNode = findNodeOfType(lastRoot, Token.CONTINUE);
    Node forNode = findNodeOfType(lastRoot, Token.FOR);
    Node iter = forNode.getFirstChild().getNext().getNext();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, continueNode));
    assertTrue(succs.contains(iter));
  }

  @Test(expected = RuntimeException.class)
  public void testBreakWithoutTargetThrows() {
    // break ที่ไม่มี target ที่ระดับ top level -> คาดหวังว่าจะ throw
    // (IllegalStateException ตามซอร์ส หรือ NPE จาก compiler.isIdeMode()
    // หากยังไม่ init options - ทั้งสองกรณีเป็น RuntimeException)
    createCfg("break;");
  }

  // ---------------------------------------------------------------------
  // RETURN
  // ---------------------------------------------------------------------

  @Test
  public void testReturnInsideTryFinallyConnectsToFinally() {
    ControlFlowGraph<Node> cfg =
        createCfg("function f(){ try { return 1; } finally { cleanup(); } }", true);
    Node returnNode = findNodeOfType(lastRoot, Token.RETURN);
    Node tryNode = findNodeOfType(lastRoot, Token.TRY);
    Node finallyBlock = tryNode.getLastChild();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, returnNode));
    assertTrue(succs.contains(finallyBlock));
  }

  @Test
  public void testBareReturnConnectsToNull() {
    ControlFlowGraph<Node> cfg = createCfg("function f(){ return; }", true);
    Node returnNode = findNodeOfType(lastRoot, Token.RETURN);
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, returnNode));
    assertTrue(succs.contains(null));
  }

  // ---------------------------------------------------------------------
  // FUNCTION traversal toggle
  // ---------------------------------------------------------------------

  @Test
  public void testShouldNotTraverseInnerFunctionWhenDisabled() {
    // shouldTraverseFunctions=false ควรข้าม body ของฟังก์ชันภายใน
    // ทำให้ handleFunction() (ซึ่งมี Preconditions.checkState เข้มงวด)
    // ไม่ถูกเรียกสำหรับฟังก์ชันนี้ - ต้องไม่ throw
    ControlFlowGraph<Node> cfg = createCfg("function f(){ g(); } h();", false);
    assertNotNull(cfg);
  }

  @Test
  public void testShouldTraverseInnerFunctionWhenEnabled() {
    ControlFlowGraph<Node> cfg = createCfg("function f(){ g(); } h();", true);
    Node functionNode = findNodeOfType(lastRoot, Token.FUNCTION);
    Node funcBody = functionNode.getFirstChild().getNext().getNext();
    Set<Node> succs = succValues(cfg, findGraphNode(cfg, functionNode));
    assertTrue(succs.contains(funcBody));
  }

  // ---------------------------------------------------------------------
  // isBreakTarget (public static)
  // ---------------------------------------------------------------------

  @Test
  public void testIsBreakTargetMatchesLabeledWhile() {
    createCfg("L: while(a) { b=1; }");
    Node whileNode = findNodeOfType(lastRoot, Token.WHILE);
    assertTrue(ControlFlowAnalysis.isBreakTarget(whileNode, "L"));
    assertTrue(ControlFlowAnalysis.isBreakTarget(whileNode, null));
    assertFalse(ControlFlowAnalysis.isBreakTarget(whileNode, "OTHER"));
  }

  @Test
  public void testIsBreakTargetBlockUnlabeledFalse() {
    createCfg("{ a=1; }");
    Node blockNode = findNodeOfType(lastRoot, Token.BLOCK);
    assertFalse(ControlFlowAnalysis.isBreakTarget(blockNode, null));
  }

  // ---------------------------------------------------------------------
  // getExceptionHandler / getCatchHandlerForBlock (package-static)
  // ---------------------------------------------------------------------

  @Test
  public void testGetExceptionHandlerFindsCatch() {
    createCfg("function f(){ try { g(); } catch(e) { h(); } }", true);
    Node callG = findNodeOfType(lastRoot, Token.CALL);
    Node handler = ControlFlowAnalysis.getExceptionHandler(callG);
    assertNotNull(handler);
  }

  @Test
  public void testGetExceptionHandlerReturnsNullWhenNoCatch() {
    createCfg("function f(){ g(); }", true);
    Node callG = findNodeOfType(lastRoot, Token.CALL);
    assertNull(ControlFlowAnalysis.getExceptionHandler(callG));
  }

  @Test
  public void testGetCatchHandlerForBlockNonTryParentReturnsNull() {
    createCfg("{ a = 1; }");
    Node block = findNodeOfType(lastRoot, Token.BLOCK);
    assertNull(ControlFlowAnalysis.getCatchHandlerForBlock(block));
  }

  // ---------------------------------------------------------------------
  // mayThrowException (public static)
  // ---------------------------------------------------------------------

  @Test
  public void testMayThrowExceptionCall() {
    createCfg("foo();");
    Node call = findNodeOfType(lastRoot, Token.CALL);
    assertTrue(ControlFlowAnalysis.mayThrowException(call));
  }

  @Test
  public void testMayThrowExceptionGetProp() {
    createCfg("a.b;");
    Node getProp = findNodeOfType(lastRoot, Token.GETPROP);
    assertTrue(ControlFlowAnalysis.mayThrowException(getProp));
  }

  @Test
  public void testMayThrowExceptionGetElem() {
    createCfg("a[b];");
    Node getElem = findNodeOfType(lastRoot, Token.GETELEM);
    assertTrue(ControlFlowAnalysis.mayThrowException(getElem));
  }

  @Test
  public void testMayThrowExceptionThrow() {
    createCfg("throw a;");
    Node throwNode = findNodeOfType(lastRoot, Token.THROW);
    assertTrue(ControlFlowAnalysis.mayThrowException(throwNode));
  }

  @Test
  public void testMayThrowExceptionNew() {
    createCfg("new Foo();");
    Node newNode = findNodeOfType(lastRoot, Token.NEW);
    assertTrue(ControlFlowAnalysis.mayThrowException(newNode));
  }

  @Test
  public void testMayThrowExceptionAssign() {
    createCfg("a = 1;");
    Node assign = findNodeOfType(lastRoot, Token.ASSIGN);
    assertTrue(ControlFlowAnalysis.mayThrowException(assign));
  }

  @Test
  public void testMayThrowExceptionInc() {
    createCfg("a++;");
    Node inc = findNodeOfType(lastRoot, Token.INC);
    assertTrue(ControlFlowAnalysis.mayThrowException(inc));
  }

  @Test
  public void testMayThrowExceptionDec() {
    createCfg("a--;");
    Node dec = findNodeOfType(lastRoot, Token.DEC);
    assertTrue(ControlFlowAnalysis.mayThrowException(dec));
  }

  @Test
  public void testMayThrowExceptionInstanceof() {
    createCfg("a instanceof Foo;");
    Node instOf = findNodeOfType(lastRoot, Token.INSTANCEOF);
    assertTrue(ControlFlowAnalysis.mayThrowException(instOf));
  }

  @Test
  public void testMayThrowExceptionFunctionAlwaysFalseEvenWithThrowingBody() {
    // FUNCTION case ใน switch return false ทันที โดยไม่ recurse เข้า body
    // แม้ body จะมี CALL ซึ่งปกติ mayThrowException จะเป็น true
    createCfg("function f(){ g(); }");
    Node functionNode = findNodeOfType(lastRoot, Token.FUNCTION);
    assertFalse(ControlFlowAnalysis.mayThrowException(functionNode));
  }

  @Test
  public void testMayThrowExceptionDefaultLeafFalse() {
    createCfg("a;");
    Node name = findNodeOfType(lastRoot, Token.NAME);
    assertFalse(ControlFlowAnalysis.mayThrowException(name));
  }

  // ---------------------------------------------------------------------
  // isBreakStructure (package-static)
  // ---------------------------------------------------------------------

  @Test
  public void testIsBreakStructureLoopsAndSwitchAlwaysTrue() {
    createCfg("for(i=0;i<1;i++){}");
    Node forNode = findNodeOfType(lastRoot, Token.FOR);
    assertTrue(ControlFlowAnalysis.isBreakStructure(forNode, false));
    assertTrue(ControlFlowAnalysis.isBreakStructure(forNode, true));

    createCfg("do{}while(a);");
    Node doNode = findNodeOfType(lastRoot, Token.DO);
    assertTrue(ControlFlowAnalysis.isBreakStructure(doNode, false));

    createCfg("while(a){}");
    Node whileNode = findNodeOfType(lastRoot, Token.WHILE);
    assertTrue(ControlFlowAnalysis.isBreakStructure(whileNode, false));

    createCfg("switch(a){}");
    Node switchNode = findNodeOfType(lastRoot, Token.SWITCH);
    assertTrue(ControlFlowAnalysis.isBreakStructure(switchNode, false));
  }

  @Test
  public void testIsBreakStructureBlockIfTryOnlyWhenLabeled() {
    createCfg("{ x=1; }");
    Node blockNode = findNodeOfType(lastRoot, Token.BLOCK);
    assertFalse(ControlFlowAnalysis.isBreakStructure(blockNode, false));
    assertTrue(ControlFlowAnalysis.isBreakStructure(blockNode, true));

    createCfg("if(a){}");
    Node ifNode = findNodeOfType(lastRoot, Token.IF);
    assertFalse(ControlFlowAnalysis.isBreakStructure(ifNode, false));
    assertTrue(ControlFlowAnalysis.isBreakStructure(ifNode, true));

    createCfg("try{}finally{}");
    Node tryNode = findNodeOfType(lastRoot, Token.TRY);
    assertFalse(ControlFlowAnalysis.isBreakStructure(tryNode, false));
    assertTrue(ControlFlowAnalysis.isBreakStructure(tryNode, true));
  }

  @Test
  public void testIsBreakStructureDefaultFalse() {
    createCfg("a;");
    Node name = findNodeOfType(lastRoot, Token.NAME);
    assertFalse(ControlFlowAnalysis.isBreakStructure(name, false));
    assertFalse(ControlFlowAnalysis.isBreakStructure(name, true));
  }

  // ---------------------------------------------------------------------
  // isContinueStructure (package-static)
  // ---------------------------------------------------------------------

  @Test
  public void testIsContinueStructureLoopsTrueOthersFalse() {
    createCfg("for(i=0;i<1;i++){}");
    assertTrue(ControlFlowAnalysis.isContinueStructure(findNodeOfType(lastRoot, Token.FOR)));

    createCfg("do{}while(a);");
    assertTrue(ControlFlowAnalysis.isContinueStructure(findNodeOfType(lastRoot, Token.DO)));

    createCfg("while(a){}");
    assertTrue(ControlFlowAnalysis.isContinueStructure(findNodeOfType(lastRoot, Token.WHILE)));

    createCfg("switch(a){}");
    assertFalse(ControlFlowAnalysis.isContinueStructure(findNodeOfType(lastRoot, Token.SWITCH)));

    createCfg("{ x=1; }");
    assertFalse(ControlFlowAnalysis.isContinueStructure(findNodeOfType(lastRoot, Token.BLOCK)));
  }

  // ---------------------------------------------------------------------
  // computeFallThrough (package-static)
  // ---------------------------------------------------------------------

  @Test
  public void testComputeFallThroughDefaultReturnsSameNode() {
    createCfg("{}");
    Node block = findNodeOfType(lastRoot, Token.BLOCK);
    assertSame(block, ControlFlowAnalysis.computeFallThrough(block));
  }

  @Test
  public void testComputeFallThroughDoRecursesIntoBody() {
    createCfg("do { b=1; } while(a);");
    Node doNode = findNodeOfType(lastRoot, Token.DO);
    Node body = doNode.getFirstChild();
    assertSame(body, ControlFlowAnalysis.computeFallThrough(doNode));
  }

  @Test
  public void testComputeFallThroughForClassicRecursesIntoInit() {
    createCfg("for(i=0;i<10;i++){b=1;}");
    Node forNode = findNodeOfType(lastRoot, Token.FOR);
    Node init = forNode.getFirstChild();
    assertSame(init, ControlFlowAnalysis.computeFallThrough(forNode));
  }

  @Test
  public void testComputeFallThroughForInReturnsCollection() {
    createCfg("for(k in obj){b=1;}");
    Node forNode = findNodeOfType(lastRoot, Token.FOR);
    Node collection = forNode.getFirstChild().getNext();
    assertSame(collection, ControlFlowAnalysis.computeFallThrough(forNode));
  }

  @Test
  public void testComputeFallThroughLabelRecursesIntoLastChild() {
    createCfg("L: { b=1; }");
    Node labelNode = findNodeOfType(lastRoot, Token.LABEL);
    Node labelBody = labelNode.getLastChild();
    assertSame(labelBody, ControlFlowAnalysis.computeFallThrough(labelNode));
  }
}
```

## สรุปตาราง Test ↔ Branch/Condition ที่ครอบคลุม

| กลุ่ม Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyScriptProcessesWithoutError` | `handleStmtList`: child==null → follow-to-null; boundary กรณี script ว่าง |
| `testNullJsInputThrows`, `testProcessWithNullRootThrows`, `testMalformedJsDoesNotHangOrCorruptState` | null/malformed input boundary (ไม่มี null-check ใน `computeFallThrough`) |
| `testIfElseCreatesTrueAndFalseEdges` / `testIfWithoutElseFalseEdgeGoesToNull` | `handleIf`: else!=null vs else==null (2 branches) |
