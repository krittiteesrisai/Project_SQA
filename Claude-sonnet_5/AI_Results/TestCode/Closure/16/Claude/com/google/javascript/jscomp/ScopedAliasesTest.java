package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Unit tests สำหรับ {@link ScopedAliases} (Closure-16b)
 *
 * แนวทาง: parse ซอร์ส JS จริงผ่าน {@link Compiler} แล้วเรียก pass ตรง ๆ
 * (ไม่ผ่าน default pass pipeline) เพื่อจำกัด behavior ที่ทดสอบให้อยู่ในขอบเขตของ
 * ScopedAliases เท่านั้น
 */
public class ScopedAliasesTest {

  /**
   * NULL handler แบบ no-op สำหรับ AliasTransformationHandler
   * (method/interface อนุมานจากการเรียกใช้จริงใน ScopedAliases.java เท่านั้น)
   */
  private static final AliasTransformationHandler NULL_HANDLER =
      new AliasTransformationHandler() {
        @Override
        public AliasTransformation logAliasTransformation(
            String sourceFile, SourcePosition<AliasTransformation> position) {
          return new AliasTransformation() {
            @Override
            public void addAlias(String alias, String definition) {
              // no-op สำหรับการทดสอบ
            }
          };
        }
      };

  private Compiler compiler;
  private CompilerOptions options;
  private Node externsRoot;
  private Node mainRoot;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  private static String normalize(String s) {
    return s.replaceAll("\\s+", "");
  }

  /** Parse js แล้วรัน ScopedAliases.process() ตรง ๆ คืนจำนวน error หลังรัน */
  private int runScopedAliases(String js) {
    return runScopedAliases(js, null);
  }

  private int runScopedAliases(String js, PreprocessorSymbolTable symbolTable) {
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);
    Node root = compiler.parseInputs();
    assertNotNull("Unexpected parse failure for input:\n" + js, root);

    // สมมติฐาน: root มี externsRoot เป็น firstChild และ mainRoot เป็น lastChild
    externsRoot = root.getFirstChild();
    mainRoot = root.getLastChild();

    ScopedAliases pass = new ScopedAliases(compiler, symbolTable, NULL_HANDLER);
    pass.process(externsRoot, mainRoot);
    return compiler.getErrorCount();
  }

  // ---------------------------------------------------------------------
  // ค่าว่าง / boundary
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyProgram() {
    int errors = runScopedAliases("");
    assertEquals(0, errors);
  }

  @Test
  public void testProcess_NoScopeCalls_NoChange() {
    String js = "var a = 1; a = a + 1;";
    int errors = runScopedAliases(js);
    assertEquals(0, errors);
    String out = normalize(compiler.toSource(mainRoot));
    assertEquals(normalize(js), out);
  }

  // ---------------------------------------------------------------------
  // อินพุตผิดรูปแบบ (malformed)
  // ---------------------------------------------------------------------

  @Test
  public void testMalformedInput_SyntaxError() {
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = Lists.newArrayList(
        SourceFile.fromCode("input.js", "goog.scope(function() {"));
    compiler.init(externs, inputs, options);
    compiler.parseInputs();
    // อินพุตผิดรูปแบบ (unterminated block) ต้องทำให้ parser รายงาน error
    // ไม่ได้เรียก ScopedAliases ต่อ เพราะ AST อาจไม่สมบูรณ์
    assertTrue("Malformed input should produce parser errors",
        compiler.getErrorCount() > 0);
  }

  // ---------------------------------------------------------------------
  // กรณี alias ที่ถูกต้อง (happy path) - ตรงกับตัวอย่างใน Javadoc ของคลาสเป้าหมาย
  // ---------------------------------------------------------------------

  @Test
  public void testValidAlias_TransitiveSubstitution() {
    String js =
        "goog.scope(function() {"
        + "  var dom = goog.dom;"
        + "  var DIV = dom.TagName.DIV;"
        + "  dom.createElement(DIV);"
        + "});";
    int errors = runScopedAliases(js);
    assertEquals("Valid goog.scope usage must not produce errors", 0, errors);
    String out = normalize(compiler.toSource(mainRoot));
    assertEquals(
        normalize("goog.dom.createElement(goog.dom.TagName.DIV);"), out);
  }

  @Test
  public void testHotSwapScript_CalledDirectly() {
    String js =
        "goog.scope(function() {"
        + "  var dom = goog.dom;"
        + "  dom.createElement(dom.TagName.DIV);"
        + "});";
    List<SourceFile> externs =
        Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs =
        Lists.newArrayList(SourceFile.fromCode("input.js", js));
    compiler.init(externs, inputs, options);
    Node root = compiler.parseInputs();
    Node localMainRoot = root.getLastChild();

    ScopedAliases pass = new ScopedAliases(compiler, null, NULL_HANDLER);
    pass.hotSwapScript(localMainRoot, null); // เรียก hotSwapScript() ตรง ๆ

    assertEquals(0, compiler.getErrorCount());
    String out = normalize(compiler.toSource(localMainRoot));
    assertEquals(
        normalize("goog.dom.createElement(goog.dom.TagName.DIV);"), out);
  }

  @Test
  public void testAlias_SingleSegmentQualifiedName_RootIndexNegativeOne() {
    // 'g' ถูก alias ให้เท่ากับ 'goog' (ไม่มี '.') -> qualifiedName.indexOf(".") == -1
    String js =
        "goog.scope(function() {"
        + "  var g = goog;"
        + "  g.dom.createElement(g.dom.TagName.DIV);"
        + "});";
    int errors = runScopedAliases(js);
    assertEquals(0, errors);
    String out = normalize(compiler.toSource(mainRoot));
    assertEquals(
        normalize("goog.dom.createElement(goog.dom.TagName.DIV);"), out);
  }

  @Test
  public void testMultipleScopeCalls_BothProcessed() {
    String js =
        "goog.scope(function() {"
        + "  var dom = goog.dom;"
        + "  dom.createElement(dom.TagName.DIV);"
        + "});"
        + "goog.scope(function() {"
        + "  var events = goog.events;"
        + "  events.listen(x);"
        + "});";
    int errors = runScopedAliases(js);
    assertEquals(0, errors);
    String out = normalize(compiler.toSource(mainRoot));
    assertFalse("goog.scope calls must be collapsed", out.contains("goog.scope"));
    assertTrue(out.contains(normalize("goog.dom.createElement(goog.dom.TagName.DIV)")));
    assertTrue(out.contains(normalize("goog.events.listen(x)")));
  }

  // ---------------------------------------------------------------------
  // GOOG_SCOPE_USED_IMPROPERLY
  // ---------------------------------------------------------------------

  @Test
  public void testGoogScopeUsedImproperly_AssignedToVariable() {
    String js = "var s = goog.scope(function() {});";
    int errors = runScopedAliases(js);
    assertTrue("Expected GOOG_SCOPE_USED_IMPROPERLY error", errors > 0);
  }

  // ---------------------------------------------------------------------
  // GOOG_SCOPE_HAS_BAD_PARAMETERS (หลายสาขา)
  // ---------------------------------------------------------------------

  @Test
  public void testBadParameters_NoArgs() {
    String js = "goog.scope();";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0); // n.getChildCount() != 2 (มีแค่ callee)
  }

  @Test
  public void testBadParameters_ExtraArgs() {
    String js = "goog.scope(function(){}, 42);";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0); // n.getChildCount() != 2 (มี argument เกิน)
  }

  @Test
  public void testBadParameters_NonFunctionArg() {
    String js = "goog.scope(42);";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0); // !anonymousFnNode.isFunction()
  }

  @Test
  public void testBadParameters_NamedFunction_AlsoBleedingFunctionBranch() {
    // ฟังก์ชันตั้งชื่อ -> BAD_PARAMETERS (NodeUtil.getFunctionName != null)
    // การ report ไม่ทำให้ traversal หยุด ดังนั้น enterScope()/findAliases() ยังทำงานต่อ
    // และตัวแปร 'Foo' ที่ bleed เข้ามาใน scope ของตัวเองจะเข้าเงื่อนไข
    // v.isBleedingFunction() ใน findAliases()
    String js = "goog.scope(function Foo() {});";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0);
  }

  @Test
  public void testBadParameters_FunctionWithParam_AlsoLpBranch() {
    // ฟังก์ชันมี parameter -> BAD_PARAMETERS
    // เนื่องจาก report ไม่หยุด traversal, findAliases() จะพบ Var ของ parameter 'a'
    // ซึ่ง parent.getType() == Token.LP (พารามิเตอร์ของฟังก์ชัน)
    String js = "goog.scope(function(a) { var x = goog.dom; });";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0);
  }

  // ---------------------------------------------------------------------
  // GOOG_SCOPE_REFERENCES_THIS / USES_RETURN / USES_THROW
  // ---------------------------------------------------------------------

  @Test
  public void testReferencesThis() {
    String js = "goog.scope(function() { this.x; });";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0);
  }

  @Test
  public void testUsesReturn() {
    String js = "goog.scope(function() { return; });";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0);
  }

  @Test
  public void testUsesThrow() {
    String js = "goog.scope(function() { throw 1; });";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0);
  }

  // ---------------------------------------------------------------------
  // GOOG_SCOPE_ALIAS_REDEFINED
  // ---------------------------------------------------------------------

  @Test
  public void testAliasRedefined() {
    String js =
        "goog.scope(function() {"
        + "  var x = goog.dom;"
        + "  x = goog.events;"
        + "});";
    int errors = runScopedAliases(js);
    assertTrue("Expected GOOG_SCOPE_ALIAS_REDEFINED error", errors > 0);
  }

  // ---------------------------------------------------------------------
  // GOOG_SCOPE_NON_ALIAS_LOCAL (สองสาขาย่อยของเงื่อนไข if แรกใน findAliases)
  // ---------------------------------------------------------------------

  @Test
  public void testNonAliasLocal_NonQualifiedInitializer() {
    // n.getFirstChild().isQualifiedName() == false (initializer เป็นตัวเลข)
    String js = "goog.scope(function() { var x = 5; });";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0);
  }

  @Test
  public void testNonAliasLocal_NoInitializer() {
    // n.hasChildren() == false (ไม่มีค่าเริ่มต้น)
    String js = "goog.scope(function() { var x; });";
    int errors = runScopedAliases(js);
    assertTrue(errors > 0);
  }

  // ---------------------------------------------------------------------
  // findNamespaceShadows()/renameNamespaceShadows() (สาขา hasNamespaceShadows)
  // ---------------------------------------------------------------------

  @Test
  public void testNamespaceShadow_DoesNotCrash() {
    String js =
        "goog.scope(function() {"
        + "  var dom = goog.dom;"
        + "  function f() {"
        + "    var goog = {};"
        + "    return goog;"
        + "  }"
        + "  dom.createElement(dom.TagName.DIV);"
        + "});";
    int errors = runScopedAliases(js);
    // การ shadow ชื่อ namespace 'goog' ใน scope ย่อย (depth > 2) ควรกระตุ้น
    // findNamespaceShadows()/renameNamespaceShadows() ผ่าน MakeDeclaredNamesUnique
    // โดยไม่มี error และไม่ throw exception (ไม่ assert รูปแบบการ rename ที่แน่นอน
    // เพราะไม่ได้ระบุไว้ในซอร์สที่ให้มา)
    assertEquals(0, errors);
  }
}
