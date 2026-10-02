package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit tests for {@link CollapseProperties} (Defects4J Closure-156b)
 *
 * หมายเหตุสำคัญ:
 * - ใช้ CompilerTestCase (อยู่ใน source tree เดียวกับ com.google.javascript.jscomp)
 *   เพื่อรัน pass จริงผ่าน AST เนื่องจาก CollapseProperties ไม่สามารถ unit-test
 *   แบบ isolate ได้โดยไม่มี Node/GlobalNamespace ที่ parse มาจริง
 * - Expected output บางเคส อ้างอิงจาก comment "BEFORE/AFTER" ที่ปรากฏอยู่ใน
 *   ซอร์สโค้ดจริง (เช่นใน updateSimpleDeclaration, appendPropForAlias) ซึ่งมี
 *   ความมั่นใจสูง
 * - เคสที่พฤติกรรมขึ้นกับคลาส Name (เช่น shouldKeepKeys(), canCollapse(),
 *   canEliminate()) ซึ่ง "ไม่มี source ให้" จะไม่ assert ผลลัพธ์แบบเจาะจง
 *   แต่จะเน้น testSame() ในกรณีที่ Javadoc ระดับคลาสยืนยันพฤติกรรมไว้ชัดเจน
 */
public class CollapsePropertiesTest extends CompilerTestCase {

  private boolean collapsePropertiesOnExternTypes = false;
  private boolean inlineAliases = false;

  public CollapsePropertiesTest() {
    super(""); // ไม่ใช้ externs พิเศษ เพื่อลดตัวแปรที่ไม่แน่นอน
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CollapseProperties(
        compiler, collapsePropertiesOnExternTypes, inlineAliases);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    // reset flags ทุกครั้ง (JUnit4 สร้าง instance ใหม่ต่อ test อยู่แล้ว แต่กันไว้)
    collapsePropertiesOnExternTypes = false;
    inlineAliases = false;
  }

  // ---------------------------------------------------------------------
  // 1) Boundary / null / empty input
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScript() {
    // ค่าว่างที่สุด: ไม่มี Name ใด ๆ -> ทุก loop (globalNames, nameMap) ว่าง
    // ครอบคลุมเส้นทางที่ for-loop ใน process() ไม่ execute เลย
    testSame("");
  }

  @Test
  public void testWhitespaceOnlyScript() {
    testSame("   \n\t  ");
  }

  @Test
  public void testDeclarationWithoutInitializer() {
    // "var a;" ไม่มี object literal ให้ collapse -> n.props ควรเป็น null/ไม่มี
    // ครอบคลุม branch: flattenReferencesToCollapsibleDescendantNames ที่
    // "if (n.props == null) return;"
    testSame("var a;");
  }

  // ---------------------------------------------------------------------
  // 2) process(): เงื่อนไข collapsePropertiesOnExternTypes (if/else)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_CollapsePropertiesOnExternTypesFalse() {
    collapsePropertiesOnExternTypes = false; // ใช้ branch "else" -> GlobalNamespace(compiler, root)
    testSame("var x = 1;");
  }

  @Test
  public void testProcess_CollapsePropertiesOnExternTypesTrue_NoCrash() {
    collapsePropertiesOnExternTypes = true; // ใช้ branch "if" -> GlobalNamespace(compiler, externs, root)
    // ไม่มี extern-type property ให้ collapse จริง จึงคาดหวังว่าไม่มีการเปลี่ยนแปลง
    testSame("var x = 1;");
  }

  // ---------------------------------------------------------------------
  // 3) process(): เงื่อนไข inlineAliases (if)
  // ---------------------------------------------------------------------

  @Test
  public void testProcess_InlineAliasesFalse_SkipsInlineStep() {
    inlineAliases = false; // ไม่เข้า branch inlineAliases(namespace)
    testSame("var a = {b: 1};");
    // หมายเหตุ: ไม่ assert การ collapse ของ objlit เพราะขึ้นกับ Name.canCollapse()
    // ที่ไม่มี source ให้ในไฟล์นี้ จึง testSame แบบระวังไว้ก่อนไม่ได้ -- ดูหมายเหตุด้านล่าง
  }

  @Test
  public void testProcess_InlineAliasesTrue_NoCrashOnSimpleAlias() {
    inlineAliases = true; // เข้า branch inlineAliases(namespace)
    // ตรวจสอบเพียงว่า pass รันได้โดยไม่ throw exception เมื่อมี local alias
    // ไม่ assert ผลลัพธ์แบบเจาะจง เนื่องจาก inlineAliasIfPossible ต้องพึ่ง
    // ReferenceCollectingCallback ซึ่งมี logic ซับซ้อนเกินกว่าจะยืนยัน exact
    // output ได้อย่างปลอดภัยจากซอร์สที่ให้มาเพียงไฟล์เดียว
    testSame(
        "var a = {b: 1};\n" +
        "function f() {\n" +
        "  var c = a;\n" +
        "  return c.b;\n" +
        "}");
  }

  // ---------------------------------------------------------------------
  // 4) กรณีที่มั่นใจสูง: ตรงกับ comment BEFORE/AFTER ในซอร์สโค้ดจริง
  //    (updateSimpleDeclaration)
  // ---------------------------------------------------------------------

  @Test
  public void testAssignFunctionPropertyCollapse_MatchesSourceComment() {
    // ตรงกับ comment ใน updateSimpleDeclaration:
    // "BEFORE: a.b.c = ...;  AFTER: var a$b$c = ...;"
    // ที่นี่ใช้ระดับ a.b = function(){} เพื่อความกระชับ
    test(
        "var a = {};\n" +
        "a.b = function() { return 1; };",
        "var a$b = function() { return 1; };");
  }

  @Test
  public void testComplexAssignTwinCollapse_MatchesSourceComment() {
    // ตรงกับ comment ใน updateSimpleDeclaration (complex assign / twin ref):
    // "BEFORE: ... (x.y = 3); AFTER: var x$y; ... (x$y = 3);"
    test(
        "var x = {};\n" +
        "f(x.y = 3);",
        "var x$y;\n" +
        "f(x$y = 3);");
  }

  @Test
  public void testAppendPropForAliasDollarEncoding_MatchesSourceComment() {
    // ตรงกับ comment ใน appendPropForAlias:
    // "Encode '$' in a property as '$0'."
    // property ชื่อ "b$c" -> encode เป็น "b$0c" -> alias สุดท้าย "a$b$0c"
    test(
        "var a = {};\n" +
        "a.b$c = 1;",
        "var a$b$0c = 1;");
  }

  // ---------------------------------------------------------------------
  // 5) checkForHosedThisReferences: docInfo null / constructor / @this
  // ---------------------------------------------------------------------

  @Test
  public void testUnsafeThisWarning_WhenDocInfoNull() {
    // docInfo == null -> เข้า branch traverse หา Token.THIS -> ควร warn UNSAFE_THIS
    test(
        "var a = {};\n" +
        "a.b = function() { return this.c; };",
        "var a$b = function() { return this.c; };",
        CollapseProperties.UNSAFE_THIS);
  }

  @Test
  public void testNoUnsafeThisWarning_WithConstructorJsDoc() {
    // docInfo.isConstructor() == true -> ข้าม branch warning
    test(
        "var a = {};\n" +
        "/** @constructor */\n" +
        "a.b = function() { return this.c; };",
        "var a$b = function() { return this.c; };");
    // ไม่ระบุ warning -> คาดหวังว่าไม่มี warning เกิดขึ้น
  }

  @Test
  public void testNoUnsafeThisWarning_WithThisJsDoc() {
    // docInfo.hasThisType() == true -> ข้าม branch warning เช่นกัน
    test(
        "var a = {};\n" +
        "/** @this {Object} */\n" +
        "a.b = function() { return this.c; };",
        "var a$b = function() { return this.c; };");
  }

  // ---------------------------------------------------------------------
  // 6) checkNamespaces(): NAMESPACE_REDEFINED_WARNING / UNSAFE_NAMESPACE_WARNING
  //    (อ้างอิงจาก class-level Javadoc ที่ระบุพฤติกรรมไว้ชัดเจน)
  // ---------------------------------------------------------------------

  @Test
  public void testNamespaceRedefinedWarning() {
    // Javadoc: "If a global object's name is assigned to more than once ...
    // then none of its properties will be collapsed"
    // -> initialized=true บน SET ที่สอง -> warnAboutNamespaceRedefinition
    // -> โค้ดไม่เปลี่ยน (unsafe to collapse)
    testSame(
        "var a = {b: 0};\n" +
        "a = {c: 1};",
        CollapseProperties.NAMESPACE_REDEFINED_WARNING);
  }

  @Test
  public void testUnsafeNamespaceAliasingWarning() {
    // ตรงกับตัวอย่างใน Javadoc ระดับคลาสเป๊ะ ๆ:
    // "a = {b: 0}; c = a; c.b = 5;"
    // -> ALIASING_GET ทำให้เกิด UNSAFE_NAMESPACE_WARNING และ properties ไม่ collapse
    testSame(
        "var a = {b: 0};\n" +
        "var c = a;\n" +
        "c.b = 5;",
        CollapseProperties.UNSAFE_NAMESPACE_WARNING);
  }

  // ---------------------------------------------------------------------
  // 7) ขอบเขตที่ Javadoc ระดับคลาสยืนยันไว้ชัดเจน: ไม่ flatten a[b]
  // ---------------------------------------------------------------------

  @Test
  public void testBracketAccessNotFlattened() {
    // Javadoc: "This pass doesn't flatten property accesses of the form: a[b]."
    testSame(
        "var a = {};\n" +
        "a['b'] = 1;");
  }

  // ---------------------------------------------------------------------
  // 8) Boundary: local scope ไม่ถูกนับเป็น global namespace
  // ---------------------------------------------------------------------

  @Test
  public void testLocalVariableNotCollapsed() {
    // "Flattens global objects/namespaces" -> ตัวแปร local ในฟังก์ชันไม่อยู่ใน
    // globalNames/nameMap เลย จึงไม่มีการ collapse เกิดขึ้น
    testSame(
        "function f() {\n" +
        "  var a = {b: 0};\n" +
        "  return a.b;\n" +
        "}");
  }

  // ---------------------------------------------------------------------
  // 9) Malformed / unusual input: base ไม่ใช่ qualified name (call result)
  // ---------------------------------------------------------------------

  @Test
  public void testPropertyOnCallResultNotTracked() {
    // foo() ไม่ใช่ NAME/GETPROP ที่ GlobalNamespace ติดตามเป็น root name
    // -> ไม่มี Name ใดถูกสร้างสำหรับ "bar" ในกรณีนี้ -> ไม่มีการเปลี่ยนแปลง
    testSame(
        "function foo() { return {}; }\n" +
        "foo().bar = 1;");
  }

  // ---------------------------------------------------------------------
  // 10) flattenReferencesToCollapsibleDescendantNames: n.props == null branch
  // ---------------------------------------------------------------------

  @Test
  public void testNameWithNoPropsSkipsRecursion() {
    // "var a = 1;" -> a เป็น primitive ไม่มี props เลย
    // -> ครอบคลุม "if (n.props == null) return;" ใน
    //    flattenReferencesToCollapsibleDescendantNames
    testSame("var a = 1;");
  }
}
