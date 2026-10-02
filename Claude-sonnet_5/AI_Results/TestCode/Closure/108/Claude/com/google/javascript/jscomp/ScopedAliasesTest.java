package com.google.javascript.jscomp;
// หมายเหตุ: ScopedAliases เป็น package-private class (constructor ก็ package-private)
// จึงต้องอยู่ package เดียวกันจริง ๆ ถึงจะ instantiate ได้ - ไม่มี import statement
// สำหรับคลาสเป้าหมายเพราะอยู่ package เดียวกันอยู่แล้ว

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link ScopedAliases}.
 *
 * หมายเหตุ: ใช้ Compiler ตัวจริง (ไม่ mock AbstractCompiler) เพราะ NodeTraversal
 * ต้องพึ่งพา method ภายในของ AbstractCompiler จำนวนมากที่ไม่ปรากฏใน source
 * ของ ScopedAliases ที่ให้มา การ mock ให้ครบถูกต้องจึงเสี่ยงต่อการเดา behavior
 */
public class ScopedAliasesTest {

  private Compiler compiler;
  private CompilerOptions.AliasTransformationHandler transformationHandler;

  @Before
  public void setUp() {
    // สมมติฐาน: interface นี้มี method เดียวคือ logAliasTransformation(...)
    // ตามที่เห็นการเรียกใช้ใน enterScope() ของ source เป้าหมาย
    CompilerOptions.AliasTransformation mockTransformation =
        mock(CompilerOptions.AliasTransformation.class);
    transformationHandler = mock(CompilerOptions.AliasTransformationHandler.class);
    when(transformationHandler.logAliasTransformation(
            anyString(), any(SourcePosition.class)))
        .thenReturn(mockTransformation);
  }

  /**
   * Helper: parse JS ผ่าน Compiler ตัวจริง แล้วรัน ScopedAliases#process()
   * หมายเหตุ: SourceFile.fromCode / JsAst#getAstRoot / Compiler#initOptions
   * ไม่ได้อยู่ใน source ที่ให้มา แต่เป็น infra มาตรฐานของโปรเจกต์นี้
   */
  private Node parseAndProcess(String js) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    SourceFile input = SourceFile.fromCode("input.js", js);
    Node script = new JsAst(input).getAstRoot(compiler);

    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.process(null, script);
    return script;
  }

  private Node parseAndHotSwap(String js) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    SourceFile input = SourceFile.fromCode("input.js", js);
    Node script = new JsAst(input).getAstRoot(compiler);

    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.hotSwapScript(script, null);
    return script;
  }

  private boolean anyErrorContains(String snippet) {
    for (JSError e : compiler.getErrors()) {
      if (e.toString().contains(snippet)) {
        return true;
      }
    }
    return false;
  }

  // ---------------------------------------------------------------------
  // Constructor / boundary
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_withNullPreprocessorSymbolTable_doesNotThrow() {
    Compiler c = new Compiler();
    CompilerOptions options = new CompilerOptions();
    c.initOptions(options);
    // preprocessorSymbolTable เป็น @Nullable -> ค่า null ต้องยอมรับได้
    ScopedAliases pass = new ScopedAliases(c, null, transformationHandler);
    assertTrue(pass != null);
  }

  // ---------------------------------------------------------------------
  // Empty / boundary input
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_emptyScript_noErrorsNoChanges() {
    Node script = parseAndProcess("");
    assertEquals(0, compiler.getErrorCount());
    assertEquals("", compiler.toSource(script).trim());
  }

  // ---------------------------------------------------------------------
  // Successful alias inlining (happy path)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_simpleAlias_isInlinedAndScopeCollapsed() {
    String js = "goog.scope(function() { "
        + "var dom = goog.dom; "
        + "dom.createElement('DIV'); "
        + "});";
    Node script = parseAndProcess(js);
    String output = compiler.toSource(script);

    assertEquals(0, compiler.getErrorCount());
    assertTrue(output.contains("goog.dom.createElement"));
    assertFalse(output.contains("goog.scope"));
  }

  @Test
  public void testProcess_multipleAliasesInOneVarStatement_bothDetachBranches() {
    // ทดสอบทั้งสองสาขาของ:
    // if (aliasDefinition.getParent().isVar() && hasOneChild()) {...} else {...}
    String js = "goog.scope(function() { "
        + "var a = goog.dom, b = goog.events; "
        + "a.foo(); "
        + "b.bar(); "
        + "});";
    Node script = parseAndProcess(js);
    String output = compiler.toSource(script);

    assertEquals(0, compiler.getErrorCount());
    assertTrue(output.contains("goog.dom.foo"));
    assertTrue(output.contains("goog.events.bar"));
    assertFalse(output.contains("goog.scope"));
  }

  @Test
  public void testProcess_transitiveAliasChain_fromClassJavadocExample() {
    // ตัวอย่างนี้คัดลอกมาจาก class-level javadoc ของ ScopedAliases โดยตรง:
    //   var dom = goog.dom;
    //   var DIV = dom.TagName.DIV;
    //   dom.createElement(DIV);
    // ควรกลายเป็น: goog.dom.createElement(goog.dom.TagName.DIV);
    //
    // หมายเหตุ (สำคัญ): กรณีนี้เกี่ยวข้องกับ referencesOtherAlias()/aliasWorkQueue
    // ซึ่งตรวจสอบว่าราก (root) ของ qualified-name ของ alias หนึ่ง ๆ ยังเป็น
    // Var อยู่ใน scope เดียวกันหรือไม่ - ถ้า Var ของ 'dom' ไม่ถูกลบออกจาก Scope
    // symbol table แม้ node ในทรีจะถูกแทนที่ไปแล้ว อาจทำให้เข้าเงื่อนไข
    // "newQueue.size() == aliasWorkQueue.size()" และ report GOOG_SCOPE_ALIAS_CYCLE
    // ผิดพลาด (false cycle) ได้ - นี่คือพฤติกรรมที่ไม่สามารถยืนยันได้ 100%
    // จาก source ที่ให้มา แต่เทสนี้ตั้งความคาดหวังตาม "พฤติกรรมที่ถูกต้อง" ตาม
    // javadoc เพื่อช่วยดักจับบั๊กหากมีอยู่ในเวอร์ชันนี้ (Closure-108b)
    String js = "goog.scope(function() { "
        + "var dom = goog.dom; "
        + "var DIV = dom.TagName.DIV; "
        + "dom.createElement(DIV); "
        + "});";
    Node script = parseAndProcess(js);
    String output = compiler.toSource(script);

    assertEquals(0, compiler.getErrorCount());
    assertTrue(output.contains("goog.dom.createElement"));
    assertFalse(output.contains("goog.scope"));
  }

  @Test
  public void testHotSwapScript_behavesLikeProcess() {
    // ทดสอบ public entry point อีกตัว (hotSwapScript) ซึ่ง process() แค่ delegate ไป
    String js = "goog.scope(function() { "
        + "var dom = goog.dom; "
        + "dom.createElement('DIV'); "
        + "});";
    Node script = parseAndHotSwap(js);
    String output = compiler.toSource(script);

    assertEquals(0, compiler.getErrorCount());
    assertTrue(output.contains("goog.dom.createElement"));
  }

  // ---------------------------------------------------------------------
  // validateScopeCall() branch coverage: GOOG_SCOPE_HAS_BAD_PARAMETERS
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_missingParameter_reportsBadParameters() {
    // n.getChildCount() != 2  (มีแค่ callee ไม่มี argument)
    Node script = parseAndProcess("goog.scope();");
    assertTrue(anyErrorContains("must take only a single parameter"));
    // ต้องไม่มีการเปลี่ยนทรี เพราะ hasErrors() == true
    assertTrue(compiler.toSource(script).contains("goog.scope"));
  }

  @Test
  public void testProcess_extraParameter_reportsBadParameters() {
    // n.getChildCount() != 2 (มี argument เกินมา)
    parseAndProcess("goog.scope(function(){}, 2);");
    assertTrue(anyErrorContains("must take only a single parameter"));
  }

  @Test
  public void testProcess_functionWithParams_reportsBadParameters() {
    // childCount == 2, แต่ getFunctionParameters().hasChildren() == true
    parseAndProcess("goog.scope(function(a) {});");
    assertTrue(anyErrorContains("must take only a single parameter"));
  }

  @Test
  public void testProcess_namedFunctionArgument_reportsBadParameters() {
    // childCount == 2, isFunction() == true, แต่ getFunctionName() != null
    parseAndProcess("goog.scope(function foo() {});");
    assertTrue(anyErrorContains("must take only a single parameter"));
  }

  @Test
  public void testProcess_nonFunctionArgument_reportsBadParameters() {
    // childCount == 2, แต่ !anonymousFnNode.isFunction()
    parseAndProcess("goog.scope(5);");
    assertTrue(anyErrorContains("must take only a single parameter"));
  }

  // ---------------------------------------------------------------------
  // validateScopeCall() branch coverage: GOOG_SCOPE_USED_IMPROPERLY
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_notAloneInStatement_reportsUsedImproperly() {
    // parent ไม่ใช่ EXPR_RESULT (ถูก assign ให้ตัวแปร)
    Node script = parseAndProcess("var y = goog.scope(function(){});");
    assertTrue(anyErrorContains("must be alone in a single statement"));
    // hasErrors() == true -> ต้นฉบับต้องไม่ถูกเปลี่ยน (guard "if (!traversal.hasErrors())")
    assertTrue(compiler.toSource(script).contains("goog.scope"));
  }

  // ---------------------------------------------------------------------
  // visit() branch coverage: THIS / RETURN / THROW ที่ scope depth == 2
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_bodyReferencesThis_reportsReferencesThis() {
    parseAndProcess("goog.scope(function(){ this.x = 1; });");
    assertTrue(anyErrorContains("cannot reference 'this'"));
  }

  @Test
  public void testProcess_bodyUsesReturn_reportsUsesReturn() {
    parseAndProcess("goog.scope(function(){ return 1; });");
    assertTrue(anyErrorContains("cannot use 'return'"));
  }

  @Test
  public void testProcess_bodyUsesThrow_reportsUsesThrow() {
    parseAndProcess("goog.scope(function(){ throw 1; });");
    assertTrue(anyErrorContains("cannot use 'throw'"));
  }

  // ---------------------------------------------------------------------
  // visit() branch coverage: GOOG_SCOPE_ALIAS_REDEFINED
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_aliasRedefined_reportsAliasRedefined() {
    // aliasVar.getNode() != n เพราะ n คือ NAME node จากการ assign ซ้ำ ไม่ใช่
    // node ต้นฉบับของการประกาศ var
    String js = "goog.scope(function(){ "
        + "var x = goog.dom; "
        + "x = goog.events; "
        + "});";
    parseAndProcess(js);
    assertTrue(anyErrorContains("assigned a value more than once"));
  }

  // ---------------------------------------------------------------------
  // static field sanity check (ไม่ควรเป็น null / ค่าคงที่ต้องตรงตาม source)
  // ---------------------------------------------------------------------

  @Test
  public void testStaticScopingMethodNameConstant() {
    assertEquals("goog.scope", ScopedAliases.SCOPING_METHOD_NAME);
  }

  @Test
  public void testStaticDiagnosticTypesAreNotNull() {
    assertTrue(ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY != null);
    assertTrue(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS != null);
    assertTrue(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS != null);
    assertTrue(ScopedAliases.GOOG_SCOPE_USES_RETURN != null);
    assertTrue(ScopedAliases.GOOG_SCOPE_USES_THROW != null);
    assertTrue(ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED != null);
    assertTrue(ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE != null);
    assertTrue(ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL != null);
  }
}
