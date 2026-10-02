package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Unit test สำหรับ {@link NodeTraversal} (Defects4J: Closure-37b)
 *
 * หมายเหตุทั่วไป:
 * - ใช้ {@link Compiler#parseTestCode(String)} เพื่อสร้าง AST จริงสำหรับทดสอบ
 *   (เมธอดนี้ไม่ได้แสดงในซอร์ส NodeTraversal ที่ให้มา แต่เป็นเมธอด package-private
 *   ที่มีอยู่จริงในคลาส Compiler ของโปรเจกต์ Closure Compiler - ทำเครื่องหมายเป็นข้อสมมติฐาน)
 * - เมธอด/ฟิลด์ที่ยืนยันได้จากซอร์สที่ให้มาโดยตรง: isFunction(), isBlock(), isGlobal(),
 *   getRootNode(), createScope(Node,Scope), getFirstChild(), getNext(), getType(),
 *   getChildCount(), getParent(), getLineno(), getCharno(), getSourceFileName(), getInputId()
 */
public class NodeTraversalTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // สมมติฐาน: ต้อง initOptions ก่อน parse ได้ (ตามรูปแบบการใช้งาน Compiler ทั่วไป)
    compiler.initOptions(new CompilerOptions());
  }

  /** Helper: parse JS source เป็น AST (root เป็น SCRIPT node) */
  private Node parse(String js) {
    // สมมติฐาน: parseTestCode คืนค่า Node ของ SCRIPT ที่ parse สำเร็จ
    return compiler.parseTestCode(js);
  }

  private NodeTraversal.Callback noopCallback() {
    return new NodeTraversal.Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
        return true;
      }
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
    };
  }

  // ---------------------------------------------------------------------
  // traverse(Node) / traverseBranch พื้นฐาน
  // ---------------------------------------------------------------------

  @Test
  public void testTraverseVisitsAllNodesPostOrder() {
    Node root = parse("var a = 1;");
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    });
    assertFalse(visited.isEmpty());
    // post-order: root (SCRIPT) ต้องถูก visit เป็นตัวสุดท้าย
    assertEquals(root, visited.get(visited.size() - 1));
  }

  @Test
  public void testShouldTraverseFalseSkipsSubtree() {
    // ทดสอบ branch: if (!callback.shouldTraverse(...)) return;
    // เมื่อ shouldTraverse คืน false ที่ VAR node -> ห้ามเข้า children และห้าม visit ตัวเองด้วย
    Node root = parse("var a = 1;");
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
        return n.getType() != Token.VAR;
      }
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    });
    for (Node n : visited) {
      assertFalse(n.getType() == Token.VAR);
      assertFalse(n.getType() == Token.NAME);
      assertFalse(n.getType() == Token.NUMBER);
    }
  }

  @Test
  public void testTraverseNullRootThrows() {
    // สมมติฐาน: NodeUtil.getInputId(null) จะ throw exception ภายใน try block ของ traverse()
    // และ compiler.throwInternalError จะ re-throw exception นั้นออกมา (ชนิด exception ที่แน่นอน
    // ไม่ได้ระบุในซอร์ส NodeTraversal จึงตรวจสอบแบบกว้าง ๆ)
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    boolean threw = false;
    try {
      t.traverse(null);
    } catch (Exception e) {
      threw = true;
    }
    assertTrue("traverse(null) ควร throw exception", threw);
  }

  @Test
  public void testTraverseCallbackExceptionIsWrapped() {
    // ทดสอบ throwUnexpectedException() branch: inputId != null (SCRIPT เซ็ตไว้แล้ว)
    // และ curNode != null (เพราะ visit ถูกเรียกหลังกำหนด curNode เสมอ)
    Node root = parse("var a = 1;");
    NodeTraversal t = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tr, Node n, Node parent) {
        throw new RuntimeException("boom");
      }
    });
    boolean threw = false;
    try {
      t.traverse(root);
    } catch (Exception e) {
      threw = true;
    }
    assertTrue(threw);
  }

  // ---------------------------------------------------------------------
  // traverseRoots(Node...) / traverseRoots(List<Node>)
  // ---------------------------------------------------------------------

  @Test
  public void testTraverseRootsEmptyListReturnsImmediately() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    t.traverseRoots(Lists.<Node>newArrayList()); // if (roots.isEmpty()) return;
    // ไม่มี exception = ผ่าน
  }

  @Test
  public void testInstanceTraverseRootsVarargsEmpty() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    t.traverseRoots(); // varargs ว่าง -> Lists.newArrayList() ว่าง -> isEmpty() = true
  }

  @Test
  public void testTraverseRootsRootHasNoParentThrows() {
    // roots.get(0).getParent() == null -> Preconditions.checkState(scopeRoot != null) fail
    Node script = parse("var a = 1;"); // SCRIPT root มักไม่มี parent
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    boolean threw = false;
    try {
      t.traverseRoots(Lists.newArrayList(script));
    } catch (IllegalStateException e) {
      threw = true;
    }
    assertTrue(threw);
  }

  @Test
  public void testTraverseRootsMismatchedParentThrows() {
    // root.getParent() != scopeRoot -> Preconditions.checkState fail ใน loop ที่ 2
    Node script1 = parse("var a = 1;");
    Node script2 = parse("var b = 2;");
    Node root1 = script1.getFirstChild();
    Node root2 = script2.getFirstChild();
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    boolean threw = false;
    try {
      t.traverseRoots(Lists.newArrayList(root1, root2));
    } catch (IllegalStateException e) {
      threw = true;
    }
    assertTrue(threw);
  }

  @Test
  public void testTraverseRootsMultipleValidRoots() {
    Node script = parse("var a=1; var b=2;");
    Node r1 = script.getFirstChild();
    Node r2 = r1.getNext();
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal t = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tr, Node n, Node parent) {
        visited.add(n);
      }
    });
    t.traverseRoots(r1, r2);
    assertTrue(visited.contains(r1));
    assertTrue(visited.contains(r2));
  }

  // ---------------------------------------------------------------------
  // static factory methods
  // ---------------------------------------------------------------------

  @Test
  public void testStaticTraverseMethod() {
    Node root = parse("var a = 1;");
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    });
    assertTrue(visited.contains(root));
  }

  @Test
  public void testStaticTraverseRootsListVariant() {
    Node script = parse("var a=1; var b=2;");
    Node r1 = script.getFirstChild();
    Node r2 = r1.getNext();
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverseRoots(compiler, Lists.newArrayList(r1, r2),
        new AbstractPostOrderCallback() {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {
            visited.add(n);
          }
        });
    assertTrue(visited.contains(r1));
    assertTrue(visited.contains(r2));
  }

  @Test
  public void testStaticTraverseRootsVarargsVariant() {
    Node script = parse("var a=1; var b=2;");
    Node r1 = script.getFirstChild();
    Node r2 = r1.getNext();
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverseRoots(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    }, r1, r2);
    assertTrue(visited.contains(r1));
    assertTrue(visited.contains(r2));
  }

  // ---------------------------------------------------------------------
  // traverseFunction: isFunctionExpression true/false, anonymous
  // ---------------------------------------------------------------------

  @Test
  public void testTraverseFunctionDeclarationBranch() {
    // function declaration -> isFunctionExpression == false -> traverse fnName ก่อน pushScope
    Node root = parse("function f(a,b) { return a + b; }");
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    });
    boolean sawFunctionName = false;
    for (Node n : visited) {
      // สมมติฐาน: Node.getString() คืนชื่อของ NAME node (ไม่ได้ยืนยันตรงจากซอร์ส NodeTraversal)
      if (n.getType() == Token.NAME && "f".equals(n.getString())) {
        sawFunctionName = true;
      }
    }
    assertTrue(sawFunctionName);
  }

  @Test
  public void testTraverseFunctionExpressionBranch() {
    // function expression ที่มีชื่อ -> isFunctionExpression == true -> traverse fnName หลัง pushScope
    Node root = parse("var g = function named() { return 1; };");
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    });
    boolean sawFunctionExprName = false;
    for (Node n : visited) {
      if (n.getType() == Token.NAME && "named".equals(n.getString())) {
        sawFunctionExprName = true;
      }
    }
    assertTrue(sawFunctionExprName);
  }

  @Test
  public void testTraverseAnonymousFunctionExpression() {
    Node root = parse("var g = function() { return 1; };");
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    });
    boolean sawFunction = false;
    for (Node n : visited) {
      if (n.isFunction()) {
        sawFunction = true;
      }
    }
    assertTrue(sawFunction);
  }

  // ---------------------------------------------------------------------
  // getEnclosingFunction / scope depth / inGlobalScope / hasScope
  // ---------------------------------------------------------------------

  @Test
  public void testGetEnclosingFunctionTopLevelIsNull() {
    Node root = parse("var a = 1;");
    final List<Node> results = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        results.add(t.getEnclosingFunction());
      }
    });
    for (Node n : results) {
      assertNull(n);
    }
  }

  @Test
  public void testGetEnclosingFunctionInsideFunction() {
    Node root = parse("function f(a) { var x = 1; }");
    final List<Node> captured = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.getType() == Token.NAME && "x".equals(n.getString())) {
          captured.add(t.getEnclosingFunction());
        }
      }
    });
    assertEquals(1, captured.size());
    assertNotNull(captured.get(0));
    assertTrue(captured.get(0).isFunction());
  }

  @Test
  public void testScopeDepthAndInGlobalScopeInsideFunction() {
    Node root = parse("function f(){ var x = 1; }");
    final List<Integer> depths = new ArrayList<Integer>();
    final List<Boolean> globalFlags = new ArrayList<Boolean>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.getType() == Token.NAME && "x".equals(n.getString())) {
          depths.add(t.getScopeDepth());
          globalFlags.add(t.inGlobalScope());
        }
      }
    });
    assertEquals(1, depths.size());
    assertEquals(Integer.valueOf(2), depths.get(0));
    assertFalse(globalFlags.get(0));
  }

  @Test
  public void testHasScopeBeforeTraversal() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    assertFalse(t.hasScope());
  }

  @Test
  public void testHasScopeDuringTraversal() {
    Node root = parse("var a = 1;");
    final List<Boolean> flags = new ArrayList<Boolean>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        flags.add(t.hasScope());
      }
    });
    for (Boolean b : flags) {
      assertTrue(b);
    }
  }

  // ---------------------------------------------------------------------
  // getLineNumber / getSourceName / getInputId / getCurrentNode
  // ---------------------------------------------------------------------

  @Test
  public void testGetLineNumberBeforeTraversal() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    // curNode ยังเป็น null -> while loop ไม่ทำงาน -> return 0
    assertEquals(0, t.getLineNumber());
  }

  @Test
  public void testGetLineNumberDuringTraversal() {
    Node root = parse("var a = 1;\nvar b = 2;");
    final List<Integer> lines = new ArrayList<Integer>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.getType() == Token.NAME && "b".equals(n.getString())) {
          lines.add(t.getLineNumber());
        }
      }
    });
    assertEquals(1, lines.size());
    // ไม่ยืนยัน 0-based/1-based ที่แน่นอน แค่ต้อง > 0 เพราะ b อยู่บรรทัดถัดไป
    assertTrue(lines.get(0) > 0);
  }

  @Test
  public void testGetSourceNameBeforeTraversal() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    assertEquals("", t.getSourceName());
  }

  @Test
  public void testGetSourceNameDuringTraversal() {
    Node root = parse("var a = 1;");
    final List<String> names = new ArrayList<String>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        names.add(t.getSourceName());
      }
    });
    assertFalse(names.isEmpty());
    assertNotNull(names.get(0));
  }

  @Test
  public void testGetInputIdBeforeAndAfterTraversal() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    assertNull(t.getInputId());
    Node root = parse("var a = 1;");
    t.traverse(root);
    assertNotNull(t.getInputId());
  }

  @Test
  public void testGetCurrentNodeBeforeTraversal() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    assertNull(t.getCurrentNode());
  }

  @Test
  public void testGetCurrentNodeDuringTraversal() {
    Node root = parse("var a = 1;");
    final List<Node> currents = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        currents.add(t.getCurrentNode());
      }
    });
    assertFalse(currents.isEmpty());
  }

  @Test
  public void testGetCompiler() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    assertSame(compiler, t.getCompiler());
  }

  // ---------------------------------------------------------------------
  // report / makeError
  // ---------------------------------------------------------------------

  @Test
  public void testReportIncreasesErrorCount() {
    Node root = parse("var a = 1;");
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    t.traverse(root);
    // สมมติฐาน: compiler.getErrorCount() มีอยู่จริงและนับ error ที่ report เข้ามา
    int before = compiler.getErrorCount();
    t.report(root, NodeTraversal.NODE_TRAVERSAL_ERROR, "test error message");
    assertEquals(before + 1, compiler.getErrorCount());
  }

  @Test
  public void testMakeErrorWithoutLevel() {
    Node root = parse("var a = 1;");
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    JSError err = t.makeError(root, NodeTraversal.NODE_TRAVERSAL_ERROR, "msg");
    assertNotNull(err);
  }

  @Test
  public void testMakeErrorWithLevel() {
    Node root = parse("var a = 1;");
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    // สมมติฐาน: CheckLevel.WARNING เป็นค่า enum ที่มีอยู่จริง
    JSError err = t.makeError(root, CheckLevel.WARNING,
        NodeTraversal.NODE_TRAVERSAL_ERROR, "msg");
    assertNotNull(err);
  }

  // ---------------------------------------------------------------------
  // getScope / getScopeRoot / getControlFlowGraph
  // ---------------------------------------------------------------------

  @Test
  public void testGetScopeLazyCreationCached() {
    Node root = parse("var a = 1;");
    final List<Scope> scopesList = new ArrayList<Scope>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        scopesList.add(t.getScope());
        scopesList.add(t.getScope());
      }
    });
    assertFalse(scopesList.isEmpty());
    assertSame(scopesList.get(0), scopesList.get(1));
  }

  @Test
  public void testGetScopeRootTopLevel() {
    Node root = parse("var a = 1;");
    final List<Node> roots = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        roots.add(t.getScopeRoot());
      }
    });
    for (Node r : roots) {
      assertEquals(root, r);
    }
  }

  @Test
  public void testGetControlFlowGraphCachedWithinFunctionScope() {
    Node root = parse("function f(){ var x = 1; }");
    final List<Boolean> results = new ArrayList<Boolean>();
    NodeTraversal.traverse(compiler, root, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isBlock() && parent != null && parent.isFunction()) {
          ControlFlowGraph<Node> cfg1 = t.getControlFlowGraph();
          ControlFlowGraph<Node> cfg2 = t.getControlFlowGraph();
          results.add(cfg1 == cfg2);
          results.add(cfg1 != null);
        }
      }
    });
    assertEquals(2, results.size());
    assertEquals(Boolean.TRUE, results.get(0));
    assertEquals(Boolean.TRUE, results.get(1));
  }

  // ---------------------------------------------------------------------
  // ScopedCallback: enterScope/exitScope
  // ---------------------------------------------------------------------

  @Test
  public void testScopedCallbackEnterExitScopeOrder() {
    Node root = parse("function f(){ var x = 1; }");
    final List<String> events = new ArrayList<String>();
    NodeTraversal.traverse(compiler, root, new AbstractScopedCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
      @Override
      public void enterScope(NodeTraversal t) {
        events.add("enter");
      }
      @Override
      public void exitScope(NodeTraversal t) {
        events.add("exit");
      }
    });
    // global scope enter, function scope enter, function scope exit, global scope exit
    assertEquals(4, events.size());
    assertEquals("enter", events.get(0));
    assertEquals("enter", events.get(1));
    assertEquals("exit", events.get(2));
    assertEquals("exit", events.get(3));
  }

  // ---------------------------------------------------------------------
  // Abstract callback subclasses
  // ---------------------------------------------------------------------

  @Test
  public void testAbstractShallowCallbackSkipsFunctionBody() {
    Node root = parse("function f(a) { var x = 1; }");
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractShallowCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    });
    for (Node n : visited) {
      // ต้องไม่มี NAME "x" (อยู่ใน body) เพราะ shallow callback ไม่ลงไปใน body/args
      assertFalse(n.getType() == Token.NAME && "x".equals(n.getString()));
    }
  }

  @Test
  public void testAbstractShallowStatementCallbackDoesNotCrash() {
    // ยืนยันเฉพาะว่า traversal ทำงานได้และ root ถูก visit
    // (พฤติกรรมละเอียดของ NodeUtil.isControlStructure/isStatementBlock ไม่ได้แสดงในซอร์ส
    //  NodeTraversal ที่ให้มา จึงไม่ assert เจาะจงเกินไป)
    Node root = parse("if (a) { var x = 1; } else { var y = 2; }");
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root, new AbstractShallowStatementCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        visited.add(n);
      }
    });
    assertFalse(visited.isEmpty());
  }

  @Test
  public void testAbstractNodeTypePruningCallbackIncludeTrue() {
    Node root = parse("var a = 1;");
    Set<Integer> types = Sets.newHashSet(Token.SCRIPT, Token.VAR, Token.NAME);
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root,
        new AbstractNodeTypePruningCallback(types, true) {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {
            visited.add(n);
          }
        });
    for (Node n : visited) {
      assertFalse(n.getType() == Token.NUMBER);
    }
    assertTrue(visited.size() > 0);
  }

  @Test
  public void testAbstractNodeTypePruningCallbackIncludeFalse() {
    Node root = parse("var a = 1;");
    Set<Integer> excluded = Sets.newHashSet(Token.NUMBER);
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root,
        new AbstractNodeTypePruningCallback(excluded, false) {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {
            visited.add(n);
          }
        });
    boolean hasNumber = false;
    for (Node n : visited) {
      if (n.getType() == Token.NUMBER) {
        hasNumber = true;
      }
    }
    assertFalse(hasNumber);
    assertTrue(visited.size() > 0);
  }

  @Test
  public void testAbstractNodeTypePruningCallbackOneArgConstructorDefaultsIncludeTrue() {
    Node root = parse("var a = 1;");
    Set<Integer> types = Sets.newHashSet(Token.SCRIPT, Token.VAR, Token.NAME, Token.NUMBER);
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal.traverse(compiler, root,
        new AbstractNodeTypePruningCallback(types) {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {
            visited.add(n);
          }
        });
    assertTrue(visited.size() >= 4);
  }

  // ---------------------------------------------------------------------
  // traverseWithScope / traverseAtScope
  // ---------------------------------------------------------------------

  @Test
  public void testTraverseWithScopeGlobalScope() {
    Node script = parse("var a = 1;");
    ScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope globalScope = creator.createScope(script, null);
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal t = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tr, Node n, Node parent) {
        visited.add(n);
      }
    });
    t.traverseWithScope(script, globalScope);
    assertTrue(visited.contains(script));
  }

  @Test
  public void testTraverseWithScopeNonGlobalThrows() {
    Node script = parse("function f(){}");
    Node functionNode = script.getFirstChild();
    ScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope globalScope = creator.createScope(script, null);
    Scope funcScope = creator.createScope(functionNode, globalScope);
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    boolean threw = false;
    try {
      t.traverseWithScope(functionNode, funcScope);
    } catch (IllegalStateException e) {
      threw = true;
    }
    assertTrue(threw);
  }

  @Test
  public void testTraverseAtScopeFunctionBranch() {
    Node script = parse("function f(a) { return a; }");
    Node functionNode = script.getFirstChild();
    ScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope globalScope = creator.createScope(script, null);
    Scope funcScope = creator.createScope(functionNode, globalScope);
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal t = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tr, Node n, Node parent) {
        visited.add(n);
      }
    });
    t.traverseAtScope(funcScope);
    // args node ต้องถูก traverse (n.getFirstChild().getNext())
    Node args = functionNode.getFirstChild().getNext();
    assertTrue(visited.contains(args));
  }

  @Test
  public void testTraverseAtScopeNonFunctionBranch() {
    // isFunction() == false -> เรียก traverseWithScope(n, s) ภายใน
    Node script = parse("var a = 1;");
    ScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope globalScope = creator.createScope(script, null);
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal t = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tr, Node n, Node parent) {
        visited.add(n);
      }
    });
    t.traverseAtScope(globalScope);
    assertTrue(visited.contains(script));
  }

  // ---------------------------------------------------------------------
  // traverseInnerNode: refinedScope null / different / same
  // ---------------------------------------------------------------------

  @Test
  public void testTraverseInnerNodeNullRefinedScope() {
    // refinedScope == null -> else branch: traverseBranch ตรง ๆ ไม่ push/pop scope
    Node script = parse("var a = 1;");
    Node varNode = script.getFirstChild();
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal t = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tr, Node n, Node parent) {
        visited.add(n);
      }
    });
    t.traverseInnerNode(varNode, script, null);
    assertTrue(visited.contains(varNode));
    assertEquals(0, t.getScopeDepth());
  }

  @Test
  public void testTraverseInnerNodeDifferentScopePushesAndPops() {
    // refinedScope != null && getScope() != refinedScope -> push, traverse, pop
    Node script = parse("var a = 1;");
    Node varNode = script.getFirstChild();
    ScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope refinedScope = creator.createScope(script, null);
    final List<Node> visited = new ArrayList<Node>();
    NodeTraversal t = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal tr, Node n, Node parent) {
        visited.add(n);
      }
    });
    t.traverseInnerNode(varNode, script, refinedScope);
    assertTrue(visited.contains(varNode));
    // หลังจบ ควร pop กลับ depth = 0
    assertEquals(0, t.getScopeDepth());
  }

  @Test
  public void testTraverseInnerNodeSameScopeSkipsPushPop() {
    // getScope() == refinedScope (อ้าง reference เดียวกัน) -> else branch, ไม่ push/pop เพิ่ม
    final Node script = parse("var a = 1; var b = 2;");
    final Node varA = script.getFirstChild();
    final Node varB = varA.getNext();
    ScopeCreator creator = new SyntacticScopeCreator(compiler);
    final Scope refinedScope = creator.createScope(script, null);
    final List<Integer> depths = new ArrayList<Integer>();

    Callback cb = new Callback() {
      @Override
      public boolean shouldTraverse(NodeTraversal tr, Node n, Node parent) {
        return true;
      }
      @Override
      public void visit(NodeTraversal tr, Node n, Node parent) {
        if (n == varA) {
          depths.add(tr.getScopeDepth());
          Scope current = tr.getScope();
          assertSame(refinedScope, current);
          // เรียกซ้ำด้วย scope เดียวกัน -> ต้องเข้า else branch (ไม่ push ซ้ำ)
          tr.traverseInnerNode(varB, script, current);
          depths.add(tr.getScopeDepth());
        }
      }
    };

    NodeTraversal t = new NodeTraversal(compiler, cb);
    t.traverseInnerNode(varA, script, refinedScope);

    assertEquals(2, depths.size());
    assertEquals(depths.get(0), depths.get(1));
  }

  // ---------------------------------------------------------------------
  // Constructors
  // ---------------------------------------------------------------------

  @Test
  public void testConstructorWithCustomScopeCreator() {
    ScopeCreator creator = new SyntacticScopeCreator(compiler);
    NodeTraversal t = new NodeTraversal(compiler, noopCallback(), creator);
    assertNotNull(t);
    assertFalse(t.hasScope());
  }

  @Test
  public void testConstructorDefaultTwoArg() {
    NodeTraversal t = new NodeTraversal(compiler, noopCallback());
    assertNotNull(t);
    assertNull(t.getCurrentNode());
  }
}
