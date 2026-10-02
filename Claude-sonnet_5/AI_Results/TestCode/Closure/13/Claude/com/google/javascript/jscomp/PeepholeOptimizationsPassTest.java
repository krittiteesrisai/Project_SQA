package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests for {@link PeepholeOptimizationsPass}.
 *
 * หมายเหตุ (สมมติฐานเกี่ยวกับ API ภายนอกที่ไม่ได้แสดงในซอร์สเป้าหมายที่ให้มา
 * แต่จำเป็นต้องใช้เพื่อสร้าง test fixture - อ้างอิงจาก Closure Compiler ช่วง Closure-13b):
 *  - Node มี public constructor Node(int nodeType) และเมธอด addChildToBack(Node),
 *    getFirstChild(), getNext(), getParent(), getType(), isFunction(), isScript()
 *  - Token.SCRIPT / Token.FUNCTION / Token.BLOCK เป็น constant ของ token type
 *  - Compiler เป็น concrete subclass ของ AbstractCompiler ที่มี public no-arg constructor
 *  - AbstractCompiler มีเมธอด reportCodeChange() ที่จะเรียก CodeChangeHandler
 *    ทุกตัวที่ addChangeHandler() ไว้ (ถูกเรียกใช้ภายใน process() ของคลาสเป้าหมาย)
 *  - AbstractPeepholeOptimization มีเมธอด package-private:
 *      abstract Node optimizeSubtree(Node subtree);
 *      void beginTraversal(AbstractCompiler compiler) {}
 *      void endTraversal(AbstractCompiler compiler) {}
 */
public class PeepholeOptimizationsPassTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  // ---------------------------------------------------------------------
  // Helper AbstractPeepholeOptimization implementations
  // ---------------------------------------------------------------------

  /** ไม่เปลี่ยนแปลงอะไรเลย นับจำนวนครั้ง/เก็บ node ที่ visit */
  static class CountingNoopOptimization extends AbstractPeepholeOptimization {
    int callCount = 0;
    final List<Node> visitedNodes = new ArrayList<Node>();

    @Override
    Node optimizeSubtree(Node subtree) {
      callCount++;
      visitedNodes.add(subtree);
      return subtree;
    }
  }

  /** คืนค่า null เสมอ (จำลองการลบ node) */
  static class NullReturningOptimization extends AbstractPeepholeOptimization {
    int callCount = 0;

    @Override
    Node optimizeSubtree(Node subtree) {
      callCount++;
      return null;
    }
  }

  /** คืนค่า node ใหม่ในครั้งแรก แล้วคืนค่าเดิมในครั้งต่อไป */
  static class ReplaceOnceOptimization extends AbstractPeepholeOptimization {
    int callCount = 0;
    boolean replaced = false;
    final Node replacement;

    ReplaceOnceOptimization(Node replacement) {
      this.replacement = replacement;
    }

    @Override
    Node optimizeSubtree(Node subtree) {
      callCount++;
      if (!replaced) {
        replaced = true;
        return replacement;
      }
      return subtree;
    }
  }

  /** บันทึกลำดับ begin/optimize/end */
  static class SequenceTrackingOptimization extends AbstractPeepholeOptimization {
    final List<String> callSequence = new ArrayList<String>();

    @Override
    void beginTraversal(AbstractCompiler compiler) {
      callSequence.add("begin");
    }

    @Override
    Node optimizeSubtree(Node subtree) {
      callSequence.add("optimize:" + subtree.getType());
      return subtree;
    }

    @Override
    void endTraversal(AbstractCompiler compiler) {
      callSequence.add("end");
    }
  }

  /** รายงานการเปลี่ยนแปลงครั้งเดียวเมื่อพบ SCRIPT node ครั้งแรก */
  static class ScriptChangeOnceOptimization extends AbstractPeepholeOptimization {
    private AbstractCompiler compilerRef;
    int scriptCallCount = 0;
    int otherCallCount = 0;

    @Override
    void beginTraversal(AbstractCompiler compiler) {
      this.compilerRef = compiler;
    }

    @Override
    Node optimizeSubtree(Node subtree) {
      if (subtree.isScript()) {
        scriptCallCount++;
        if (scriptCallCount == 1) {
          compilerRef.reportCodeChange();
        }
      } else {
        otherCallCount++;
      }
      return subtree;
    }
  }

  /** รายงานการเปลี่ยนแปลงครั้งเดียวเมื่อพบ FUNCTION node ครั้งแรก */
  static class FunctionChangeOnceOptimization extends AbstractPeepholeOptimization {
    private AbstractCompiler compilerRef;
    int functionCallCount = 0;
    int scriptCallCount = 0;

    @Override
    void beginTraversal(AbstractCompiler compiler) {
      this.compilerRef = compiler;
    }

    @Override
    Node optimizeSubtree(Node subtree) {
      if (subtree.isFunction()) {
        functionCallCount++;
        if (functionCallCount == 1) {
          compilerRef.reportCodeChange();
        }
      } else if (subtree.isScript()) {
        scriptCallCount++;
      }
      return subtree;
    }
  }

  /** รายงานการเปลี่ยนแปลงทุกครั้งที่พบ FUNCTION (ไม่มีเงื่อนไขหยุด) */
  static class AlwaysChangeOnFunctionOptimization extends AbstractPeepholeOptimization {
    private AbstractCompiler compilerRef;
    int functionCallCount = 0;

    @Override
    void beginTraversal(AbstractCompiler compiler) {
      this.compilerRef = compiler;
    }

    @Override
    Node optimizeSubtree(Node subtree) {
      if (subtree.isFunction()) {
        functionCallCount++;
        compilerRef.reportCodeChange();
      }
      return subtree;
    }
  }

  /** รายงานการเปลี่ยนแปลงทุกครั้งที่พบ SCRIPT (ไม่มีเงื่อนไขหยุด) ใช้ทดสอบ boundary ของ visits < 10000 */
  static class AlwaysChangeOnScriptOptimization extends AbstractPeepholeOptimization {
    private AbstractCompiler compilerRef;

    @Override
    void beginTraversal(AbstractCompiler compiler) {
      this.compilerRef = compiler;
    }

    @Override
    Node optimizeSubtree(Node subtree) {
      if (subtree.isScript()) {
        compilerRef.reportCodeChange();
      }
      return subtree;
    }
  }

  // ---------------------------------------------------------------------
  // Helper node builders
  // ---------------------------------------------------------------------

  private static Node newScript() {
    return new Node(Token.SCRIPT);
  }

  private static Node newFunction() {
    return new Node(Token.FUNCTION);
  }

  private static Node newBlock() {
    return new Node(Token.BLOCK);
  }

  // ---------------------------------------------------------------------
  // getCompiler()
  // ---------------------------------------------------------------------

  @Test
  public void testGetCompiler_returnsSameInstancePassedToConstructor() {
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    assertSame(compiler, pass.getCompiler());
  }

  // ---------------------------------------------------------------------
  // visit(Node) - ทดสอบ do-while / for loop โดยตรง
  // ---------------------------------------------------------------------

  @Test
  public void testVisit_noOptimizations_doesNotThrow() {
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    Node node = newBlock();
    pass.visit(node);
  }

  @Test
  public void testVisit_singleOptimization_noChange_calledExactlyOnce() {
    CountingNoopOptimization opt = new CountingNoopOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);
    Node node = newBlock();

    pass.visit(node);

    assertEquals(1, opt.callCount);
  }

  @Test
  public void testVisit_multipleOptimizations_allCalledOnceWhenNoChange() {
    CountingNoopOptimization opt1 = new CountingNoopOptimization();
    CountingNoopOptimization opt2 = new CountingNoopOptimization();
    PeepholeOptimizationsPass pass =
        new PeepholeOptimizationsPass(compiler, opt1, opt2);
    Node node = newBlock();

    pass.visit(node);

    assertEquals(1, opt1.callCount);
    assertEquals(1, opt2.callCount);
  }

  @Test
  public void testVisit_optimizationReplacesNodeOnce_loopsTwice() {
    Node original = newBlock();
    Node replacement = newBlock();
    ReplaceOnceOptimization opt = new ReplaceOnceOptimization(replacement);
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    pass.visit(original);

    assertEquals(2, opt.callCount);
  }

  @Test
  public void testVisit_optimizationReturnsNull_stopsProcessingImmediately() {
    CountingNoopOptimization before = new CountingNoopOptimization();
    NullReturningOptimization nullOpt = new NullReturningOptimization();
    CountingNoopOptimization after = new CountingNoopOptimization();

    PeepholeOptimizationsPass pass =
        new PeepholeOptimizationsPass(compiler, before, nullOpt, after);

    Node node = newBlock();
    pass.visit(node);

    assertEquals(1, before.callCount);
    assertEquals(1, nullOpt.callCount);
    assertEquals(0, after.callCount);
  }

  // ---------------------------------------------------------------------
  // process(Node externs, Node root)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_emptyOptimizations_simpleTree_doesNotThrow() {
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    Node root = newBlock();
    pass.process(newBlock(), root);
  }

  @Test
  public void testProcess_leafNodeWithoutChildren_childLoopNotEntered() {
    CountingNoopOptimization opt = new CountingNoopOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);
    Node root = newBlock();

    pass.process(newBlock(), root);

    assertEquals(1, opt.callCount);
    assertSame(root, opt.visitedNodes.get(0));
  }

  @Test
  public void testProcess_postOrderTraversal_childrenVisitedBeforeParent() {
    CountingNoopOptimization opt = new CountingNoopOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node root = newBlock();
    Node child1 = newBlock();
    Node child2 = newBlock();
    root.addChildToBack(child1);
    root.addChildToBack(child2);

    pass.process(newBlock(), root);

    assertEquals(3, opt.callCount);
    assertSame(child1, opt.visitedNodes.get(0));
    assertSame(child2, opt.visitedNodes.get(1));
    assertSame(root, opt.visitedNodes.get(2));
  }

  @Test
  public void testProcess_externsNotTraversed() {
    CountingNoopOptimization opt = new CountingNoopOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node externs = newBlock();
    Node root = newBlock();

    pass.process(externs, root);

    for (Node visited : opt.visitedNodes) {
      assertFalse(visited == externs);
    }
    assertEquals(1, opt.callCount);
  }

  @Test
  public void testProcess_nullExterns_doesNotThrow_becauseExternsUnusedInProcess() {
    CountingNoopOptimization opt = new CountingNoopOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);
    Node root = newBlock();

    pass.process(null, root);

    assertEquals(1, opt.callCount);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRoot_throwsNullPointerException() {
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    pass.process(newBlock(), null);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullOptimizationsArray_throwsOnProcess() {
    PeepholeOptimizationsPass pass =
        new PeepholeOptimizationsPass(compiler, (AbstractPeepholeOptimization[]) null);
    pass.process(newBlock(), newBlock());
  }

  @Test
  public void testProcess_beginAndEndTraversalCalledInOrder() {
    SequenceTrackingOptimization opt = new SequenceTrackingOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node root = newBlock();
    pass.process(newBlock(), root);

    assertTrue(opt.callSequence.size() >= 3);
    assertEquals("begin", opt.callSequence.get(0));
    assertEquals("end", opt.callSequence.get(opt.callSequence.size() - 1));
    assertTrue(opt.callSequence.contains("optimize:" + Token.BLOCK));
  }

  @Test
  public void testProcess_scriptRootWithChangeReportedOnce_retraversesOnce() {
    ScriptChangeOnceOptimization opt = new ScriptChangeOnceOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node root = newScript();
    Node child = newBlock();
    root.addChildToBack(child);

    pass.process(newBlock(), root);

    assertEquals(2, opt.scriptCallCount);
    assertEquals(2, opt.otherCallCount);
  }

  @Test
  public void testProcess_functionWithParent_changeReportedOnce_retraversesOnce() {
    FunctionChangeOnceOptimization opt = new FunctionChangeOnceOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node root = newScript();
    Node function = newFunction();
    root.addChildToBack(function);

    pass.process(newBlock(), root);

    assertEquals(2, opt.functionCallCount);
    assertEquals(1, opt.scriptCallCount);
  }

  @Test
  public void testProcess_functionAsRootWithoutParent_neverRetraverses() {
    AlwaysChangeOnFunctionOptimization opt = new AlwaysChangeOnFunctionOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node root = newFunction(); // root.getParent() == null เสมอ

    pass.process(newBlock(), root);

    // (parent!=null && isFunction) || isScript => false เพราะไม่มี parent และไม่ใช่ script
    assertEquals(1, opt.functionCallCount);
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_infiniteChangeReport_exceedsIterationLimit() {
    AlwaysChangeOnScriptOptimization opt = new AlwaysChangeOnScriptOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    Node root = newScript();
    root.addChildToBack(newBlock());

    pass.process(newBlock(), root);
  }

  @Test
  public void testProcess_nestedFunctionScopes_pushAndPopStateCorrectly() {
    CountingNoopOptimization opt = new CountingNoopOptimization();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

    // SCRIPT -> FUNCTION f1 -> FUNCTION f1a
    //        -> FUNCTION f2 -> FUNCTION f2a
    Node root = newScript();
    Node f1 = newFunction();
    Node f1a = newFunction();
    Node f2 = newFunction();
    Node f2a = newFunction();

    f1.addChildToBack(f1a);
    f2.addChildToBack(f2a);
    root.addChildToBack(f1);
    root.addChildToBack(f2);

    pass.process(newBlock(), root);

    assertEquals(5, opt.callCount);
  }
}
