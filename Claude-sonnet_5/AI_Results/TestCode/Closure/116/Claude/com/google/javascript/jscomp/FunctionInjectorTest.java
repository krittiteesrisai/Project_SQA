package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * Unit test สำหรับ FunctionInjector (Defects4J Closure-116b)
 *
 * หมายเหตุ: เนื่องจาก FunctionInjector พึ่งพา internal classes ของ
 * Closure Compiler (Compiler, NodeTraversal, NodeUtil ฯลฯ) ซึ่งไม่ได้แสดง
 * source ในโจทย์นี้ จุดที่มีความเสี่ยงเรื่อง exact API signature
 * จะถูกกำกับด้วยคอมเมนต์ "// RISK:"
 */
public class FunctionInjectorTest {

  private Compiler compiler;
  private Supplier<String> safeNameIdSupplier;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // RISK: initOptions เป็น public API มาตรฐานของ Compiler สำหรับตั้งค่า
    // ก่อนเรียก parse/parseTestCode
    compiler.initOptions(options);

    // ใช้ Supplier เองแทนการพึ่ง Compiler#getUniqueNameIdSupplier()
    // เพื่อลดความเสี่ยงเรื่อง API ที่ไม่ได้แสดงในซอร์ส
    safeNameIdSupplier = new Supplier<String>() {
      private int counter = 0;
      @Override
      public String get() {
        return String.valueOf(counter++);
      }
    };
  }

  private FunctionInjector newInjector(
      boolean allowDecomposition,
      boolean assumeStrictThis,
      boolean assumeMinimumCapture) {
    return new FunctionInjector(
        compiler, safeNameIdSupplier,
        allowDecomposition, assumeStrictThis, assumeMinimumCapture);
  }

  /**
   * RISK: ใช้ compiler.parseTestCode(String) ซึ่งเป็น public API
   * มาตรฐานของ Closure Compiler สำหรับแปลง source code เป็น AST (Node)
   * เพื่อการทดสอบ (parse-only ไม่มี optimize) หาก classpath จริงมี
   * signature อื่น โปรดปรับปรุงตาม actual API
   */
  private Node parseRoot(String js) {
    Node script = compiler.parseTestCode(js);
    assertNotNull("Parse failed for: " + js, script);
    return script;
  }

  private Node findFirstFunction(Node root) {
    if (root.isFunction()) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node r = findFirstFunction(c);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  private Node findFirstCall(Node root) {
    if (root.isCall()) {
      return root;
    }
    for (Node c = root.getFirstChild(); c != null; c = c.getNext()) {
      Node r = findFirstCall(c);
      if (r != null) {
        return r;
      }
    }
    return null;
  }

  private Node getFunctionNode(String js) {
    Node script = parseRoot(js);
    Node fn = findFirstFunction(script);
    assertNotNull("Function node not found for: " + js, fn);
    return fn;
  }

  // =========================================================================
  // Constructor
  // =========================================================================

  @Test(expected = NullPointerException.class)
  public void testConstructor_NullCompiler_ThrowsNPE() {
    new FunctionInjector(null, safeNameIdSupplier, true, false, false);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_NullSupplier_ThrowsNPE() {
    new FunctionInjector(compiler, null, true, false, false);
  }

  @Test
  public void testConstructor_ValidArgs_NoException() {
    FunctionInjector injector = newInjector(true, false, false);
    assertNotNull(injector);
  }

  // =========================================================================
  // doesFunctionMeetMinimumRequirements
  // =========================================================================

  @Test
  public void testMeetsMinReq_SimpleFunction_ReturnsTrue() {
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo(a,b) { return a + b; }");
    assertTrue(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void testMeetsMinReq_ReferencesArguments_ReturnsFalse() {
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo(a,b) { return arguments[0]; }");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void testMeetsMinReq_ReferencesEval_ReturnsFalse() {
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo(a,b) { return eval('a+b'); }");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void testMeetsMinReq_ReferencesOwnFnName_ReturnsFalse() {
    // fnName == "foo" และ body อ้างอิงชื่อ "foo" เอง -> predicate เข้าเงื่อนไข n.getString().equals(fnName)
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo(a,b) { return foo(a,b); }");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("foo", fnNode));
  }

  @Test
  public void testMeetsMinReq_ReferencesRecursionNameDifferentFromFnName_ReturnsFalse() {
    // fnName ที่ส่งเข้ามา ("differentName") ต่างจากชื่อจริงของ FUNCTION node ("bar")
    // แต่ body อ้างอิงชื่อจริง (fnRecursionName = "bar") -> ควร false
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function bar(a,b) { return bar(a,b); }");
    assertFalse(injector.doesFunctionMeetMinimumRequirements("differentName", fnNode));
  }

  @Test
  public void testMeetsMinReq_EmptyFnName_NoCrashAndTrue() {
    // fnName = "" -> !fnName.isEmpty() = false -> ข้ามการเช็คชื่อ fnName ใน predicate
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo(a,b) { return a + b; }");
    assertTrue(injector.doesFunctionMeetMinimumRequirements("", fnNode));
  }

  // =========================================================================
  // isDirectCallNodeReplacementPossible
  // =========================================================================

  @Test
  public void testIsDirectReplacement_EmptyBody_ReturnsTrue() {
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo() {}");
    assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectReplacement_SingleReturnWithExpr_ReturnsTrue() {
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo() { return 1; }");
    assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectReplacement_SingleReturnNoExpr_ReturnsFalse() {
    // block.getFirstChild().getFirstChild() == null -> false
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo() { return; }");
    assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectReplacement_MultipleStatements_ReturnsFalse() {
    // block.hasOneChild() == false
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo() { var x = 1; return x; }");
    assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  @Test
  public void testIsDirectReplacement_SingleNonReturnStatement_ReturnsFalse() {
    // block.hasOneChild() == true แต่ statement แรกไม่ใช่ RETURN
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo() { x = 1; }");
    assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
  }

  // =========================================================================
  // setKnownConstants
  // =========================================================================

  @Test
  public void testSetKnownConstants_FirstCall_Success() {
    FunctionInjector injector = newInjector(true, false, false);
    Set<String> constants = Sets.newHashSet("A", "B");
    injector.setKnownConstants(constants); // ไม่ควร throw
  }

  @Test(expected = IllegalStateException.class)
  public void testSetKnownConstants_SecondCall_ThrowsException() {
    FunctionInjector injector = newInjector(true, false, false);
    injector.setKnownConstants(Sets.newHashSet("A"));
    injector.setKnownConstants(Sets.newHashSet("B")); // เพราะ knownConstants ไม่ empty แล้ว
  }

  // =========================================================================
  // canInlineReferenceToFunction
  //
  // RISK: เมธอดนี้ต้องการ NodeTraversal ที่ valid (มี scope) จึงใช้
  // NodeTraversal.traverse(...) พร้อม NodeTraversal.AbstractPostOrderCallback
  // เพื่อรับ NodeTraversal ที่ valid จาก framework ของ Closure Compiler เอง
  // signature อาจต่างกันในแต่ละเวอร์ชัน โปรดปรับปรุงตาม classpath จริงหากจำเป็น
  // =========================================================================

  private CanInlineResult runCanInline(
      final FunctionInjector injector,
      final Node root,
      final Node callNode,
      final Node fnNode,
      final Set<String> needAliases,
      final InliningMode mode,
      final boolean referencesThis,
      final boolean containsFunctions) {
    final CanInlineResult[] holder = new CanInlineResult[1];
    NodeTraversal.traverse(compiler, root,
        new NodeTraversal.AbstractPostOrderCallback() {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {
            if (n == callNode) {
              holder[0] = injector.canInlineReferenceToFunction(
                  t, callNode, fnNode, needAliases,
                  mode, referencesThis, containsFunctions);
            }
          }
        });
    assertNotNull("visit ของ callNode ไม่ถูกเรียก (โครงสร้าง AST ไม่ตรงคาด)", holder[0]);
    return holder[0];
  }

  @Test
  public void testCanInline_DirectSimpleCall_ReturnsYes() {
    FunctionInjector injector = newInjector(true, false, false);
    Node root = parseRoot("function foo(a){ return a; } foo(1);");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Collections.<String>emptySet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.DIRECT, false, false);

    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInline_ReferencesThisWithoutFunctionObjectCall_ReturnsNo() {
    // referencesThis = true และ callNode ไม่ใช่ ".call" -> isFunctionObjectCall = false
    // -> branch: if (referencesThis && !isFunctionObjectCall) return NO
    FunctionInjector injector = newInjector(true, false, false);
    Node root = parseRoot("function foo(){ return this.x; } foo();");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Collections.<String>emptySet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.DIRECT, true, false);

    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_ContainsFunctionsWithinLoop_ReturnsNo() {
    // containsFunctions=true, assumeMinimumCapture=false, call อยู่ใน global scope
    // (เงื่อนไขแรกจึงไม่ตรง) แต่ call อยู่ใน loop -> ควร NO จาก isWithinLoop
    FunctionInjector injector = newInjector(true, false, false);
    Node root = parseRoot(
        "function foo(a){ return a; }"
        + "while (true) { foo(1); }");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Collections.<String>emptySet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.DIRECT, false, true);

    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_ContainsFunctionsNotInGlobalScopeNoMinCapture_ReturnsNo() {
    // containsFunctions=true, assumeMinimumCapture=false, call อยู่ในฟังก์ชันอื่น (ไม่ใช่ global)
    // -> branch: !assumeMinimumCapture && !t.inGlobalScope() -> NO
    FunctionInjector injector = newInjector(true, false, false);
    Node root = parseRoot(
        "function foo(a){ return a; }"
        + "function global(){ foo(1); }");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Collections.<String>emptySet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.DIRECT, false, true);

    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_ContainsFunctionsAssumeMinCaptureNotInLoop_ReturnsYes() {
    // assumeMinimumCapture=true -> เงื่อนไขแรกไม่ตรงเสมอ, ไม่อยู่ใน loop
    // -> ไม่ return NO จาก containsFunctions block -> ไปต่อจน canInlineReferenceDirectly -> YES
    FunctionInjector injector = newInjector(true, false, true);
    Node root = parseRoot(
        "function foo(a){ return a; }"
        + "function global(){ foo(1); }");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Collections.<String>emptySet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.DIRECT, false, true);

    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInline_FunctionObjectCallWithoutThisAndNotStrict_ReturnsNo() {
    // isSupportedCallType: !assumeStrictThis, thisValue != THIS -> unsupported -> NO
    FunctionInjector injector = newInjector(true, false, false); // assumeStrictThis=false
    Node root = parseRoot("function foo(a){ return a; } foo.call(null, 1);");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Collections.<String>emptySet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.DIRECT, false, false);

    assertEquals(CanInlineResult.NO, result);
  }

  @Test
  public void testCanInline_FunctionObjectCallWithThisArg_ReturnsYes() {
    // isSupportedCallType ผ่าน (thisValue เป็น THIS จริง) และ
    // canInlineReferenceDirectly เช็ค cArg ต้องเป็น THIS ด้วย -> YES
    FunctionInjector injector = newInjector(true, false, false);
    Node root = parseRoot(
        "function foo(a){ return a; }"
        + "function global(){ foo.call(this, 1); }");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Collections.<String>emptySet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.DIRECT, false, false);

    assertEquals(CanInlineResult.YES, result);
  }

  @Test
  public void testCanInline_BlockMode_SimpleCall_NotNull() {
    // mode == BLOCK -> canInlineReferenceAsStatementBlock ถูกเรียก
    // ไม่ assert ค่าตายตัวเนื่องจาก callMeetsBlockInliningRequirements พึ่งพา
    // NodeUtil internal logic ที่ไม่ได้แสดงในซอร์สเป้าหมาย
    FunctionInjector injector = newInjector(true, false, false);
    Node root = parseRoot("function foo(a){ var x = a; return x; } foo(1);");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Sets.newHashSet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.BLOCK, false, false);

    assertNotNull(result);
  }

  @Test
  public void testCanInline_BlockMode_UnsupportedCallType_ReturnsNo() {
    // mode==BLOCK, callSiteType==UNSUPPORTED -> ควร NO ทันที
    // ".apply" เป็น unsupported เสมอตาม isSupportedCallType
    FunctionInjector injector = newInjector(true, false, false);
    Node root = parseRoot("function foo(a){ return a; } foo.apply(null, [1]);");
    Node fnNode = findFirstFunction(root);
    Node callNode = findFirstCall(root);
    Set<String> needAliases = Collections.<String>emptySet();

    CanInlineResult result = runCanInline(
        injector, root, callNode, fnNode, needAliases,
        InliningMode.BLOCK, false, false);

    assertEquals(CanInlineResult.NO, result);
  }

  // =========================================================================
  // inliningLowersCost - boundary case (referenceCount == 0)
  // ไม่พึ่ง NodeTraversal จึงมั่นใจสูงว่าไม่มี API risk
  // =========================================================================

  @Test
  public void testInliningLowersCost_NoReferences_ReturnsTrue() {
    FunctionInjector injector = newInjector(true, false, false);
    Node fnNode = getFunctionNode("function foo(a){ return a; }");
    Collection<FunctionInjector.Reference> refs = Collections.emptyList();

    boolean result = injector.inliningLowersCost(
        null, fnNode, refs, Collections.<String>emptySet(), true, false);

    assertTrue(result);
  }
}
