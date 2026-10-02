package com.google.javascript.jscomp;

// Import แบบ same-package (redundant แต่ถูกต้องตามข้อกำหนดให้ import target class)
import com.google.javascript.jscomp.ProcessClosurePrimitives;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests สำหรับ {@link ProcessClosurePrimitives}
 *
 * แนวทาง: ใช้ com.google.javascript.jscomp.Compiler (public API) ในการ compile
 * source เล็ก ๆ โดยเปิด options.closurePass = true เพื่อให้ pass
 * ProcessClosurePrimitives ถูก wire และ execute จริงผ่าน DefaultPassConfig
 * (แนวทางนี้เลือกเพราะ constructor ของ ProcessClosurePrimitives ต้องการ
 * AbstractCompiler/NodeTraversal ที่ตั้งค่าถูกต้อง ซึ่งรายละเอียดไม่ได้ให้มาใน
 * source ที่ต้องทดสอบ การสร้าง mock เองจึงเสี่ยงต่อการ "เดา" behavior ของ
 * collaborator classes)
 *
 * ASSUMPTION (คอมเมนต์กำกับตามข้อ 4): CompilerOptions.closurePass เป็น public
 * boolean field ที่เปิด/ปิด ProcessClosurePrimitives ใน DefaultPassConfig
 * (ไม่มีอยู่ใน source ที่ให้มา แต่จำเป็นต่อการ trigger การรัน pass นี้)
 */
public class ProcessClosurePrimitivesTest {

  private Compiler lastCompiler;

  // ---------- Helpers ----------

  private Result compile(String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    // ASSUMPTION: เปิดเฉพาะ closure pass เพื่อ isolate การทดสอบให้มากที่สุด
    options.closurePass = true;
    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", js);
    Result result = compiler.compile(externs, input, options);
    this.lastCompiler = compiler;
    return result;
  }

  private String source() {
    return lastCompiler.toSource();
  }

  private void assertSuccessNoErrors(Result r) {
    assertTrue("Expected successful compile, errors=" + errString(r), r.success);
    assertEquals(0, r.errors.length);
  }

  private void assertHasError(Result r) {
    assertFalse("Expected compile failure", r.success);
    assertTrue("Expected at least one error", r.errors.length > 0);
  }

  private void assertHasWarning(Result r) {
    assertTrue("Expected at least one warning", r.warnings.length > 0);
  }

  private String errString(Result r) {
    StringBuilder sb = new StringBuilder();
    for (JSError e : r.errors) sb.append(e.toString()).append(";");
    return sb.toString();
  }

  // ================= goog.provide: success paths =================

  @Test
  public void testProvideSimpleNamespace_CreatesVar() {
    Result r = compile("goog.provide('foo');");
    assertSuccessNoErrors(r);
    assertTrue(source().contains("foo"));
  }

  @Test
  public void testProvideDottedNamespace_CreatesPrefixesAndAssignment() {
    // Covers registerAnyProvidedPrefixes loop (2 iterations: 'a', 'a.b')
    Result r = compile("goog.provide('a.b.c');");
    assertSuccessNoErrors(r);
    assertTrue(source().contains("a"));
  }

  @Test
  public void testProvideExplicitOfPreviouslyImplicitPrefix_NoDuplicateError() {
    // 'a' becomes implicit via prefix registration of 'a.b', then explicitly
    // provided later -> previouslyProvided.isExplicitlyProvided()==false branch
    Result r = compile("goog.provide('a.b'); goog.provide('a');");
    assertSuccessNoErrors(r);
  }

  @Test
  public void testProvideWithCandidateVarDefinition_NoError() {
    // n.isName() && parent.isVar() branch of handleCandidateProvideDefinition
    Result r = compile("goog.provide('foo'); var foo = {};");
    assertSuccessNoErrors(r);
  }

  @Test
  public void testProvideWithCandidateAssignDefinition_NoError() {
    // n.isAssign() && parent.isExprResult() branch of handleCandidateProvideDefinition
    Result r = compile("goog.provide('foo.bar'); foo.bar = {};");
    assertSuccessNoErrors(r);
  }

  @Test
  public void testProvideNotInExprResult_IsSkipped() {
    // parent.isExprResult()==false -> "!isExpr" break branch: statement untouched
    Result r = compile("var x = goog.provide('foo');");
    assertSuccessNoErrors(r);
    assertTrue(source().contains("goog.provide"));
  }

  // ================= goog.provide: error paths =================

  @Test
  public void testProvideMissingArgument_NullArgumentError() {
    Result r = compile("goog.provide();");
    assertHasError(r);
  }

  @Test
  public void testProvideNonStringArgument_InvalidArgumentError() {
    Result r = compile("goog.provide(5);");
    assertHasError(r);
  }

  @Test
  public void testProvideBooleanArgument_InvalidArgumentError() {
    // ตัวอย่าง malformed input อีกรูปแบบ (boolean literal)
    Result r = compile("goog.provide(true);");
    assertHasError(r);
  }

  @Test
  public void testProvideTooManyArguments_TooManyArgumentsError() {
    Result r = compile("goog.provide('foo', 'bar');");
    assertHasError(r);
  }

  @Test
  public void testProvideEmptyString_InvalidProvideError() {
    // boundary: empty string -> split -> [""] -> invalid property name
    Result r = compile("goog.provide('');");
    assertHasError(r);
  }

  @Test
  public void testProvideLeadingDot_InvalidProvideError() {
    // '.foo'.split("\\.") -> ["", "foo"] -> "" invalid property name
    Result r = compile("goog.provide('.foo');");
    assertHasError(r);
  }

  @Test
  public void testProvideTrailingDot_JavaSplitQuirk_NoError() {
    // NOTE: String.split("\\.") ตัด trailing empty string ออกโดย default ของ Java
    // ("foo.".split("\\.") == ["foo"]) ทำให้ loop ตรวจสอบไม่เจอ token ว่าง
    // จึงคาดว่า "ผ่าน" (ไม่ error) ซึ่งเป็นจุดที่ควรใช้ตรวจจับ regression/fault
    // หากมีการแก้ logic การ split ในอนาคต
    Result r = compile("goog.provide('foo.');");
    assertSuccessNoErrors(r);
  }

  @Test
  public void testProvideInvalidIdentifier_InvalidProvideError() {
    Result r = compile("goog.provide('foo-bar');");
    assertHasError(r);
  }

  @Test
  public void testProvideDuplicateNamespace_DuplicateNamespaceError() {
    Result r = compile("goog.provide('foo'); goog.provide('foo');");
    assertHasError(r);
  }

  @Test
  public void testFunctionDeclarationWithProvidedName_FunctionNamespaceError() {
    // Token.FUNCTION branch: t.inGlobalScope() && !isFunctionExpression, pn != null
    Result r = compile("goog.provide('foo'); function foo() {}");
    assertHasError(r);
  }

  // ================= goog.require =================

  @Test
  public void testRequireMissingArgument_NullArgumentError() {
    Result r = compile("goog.require();");
    assertHasError(r);
  }

  @Test
  public void testRequireNonStringArgument_InvalidArgumentError() {
    Result r = compile("goog.require(5);");
    assertHasError(r);
  }

  @Test
  public void testRequireTooManyArguments_TooManyArgumentsError() {
    Result r = compile("goog.require('a', 'b');");
    assertHasError(r);
  }

  @Test
  public void testRequireProvidedNamespace_RemovesRequireStatement() {
    Result r = compile("goog.provide('foo'); goog.require('foo');");
    assertSuccessNoErrors(r);
    assertFalse(source().contains("goog.require"));
  }

  @Test
  public void testRequireUnprovidedNamespace_ReportsDiagnostic() {
    // ASSUMPTION: ไม่สามารถยืนยัน CheckLevel เริ่มต้นของ requiresLevel
    // (มาจาก options ที่ไม่มี source ให้) จึงตรวจแค่ว่ามี diagnostic เกิดขึ้น
    // (error หรือ warning) แทนการเจาะจงระดับ -> ครอบคลุม branch
    // "provided == null" -> unrecognizedRequires -> MISSING_PROVIDE_ERROR
    Result r = compile("goog.require('unprovided');");
    assertTrue(r.errors.length + r.warnings.length > 0);
  }

  @Test
  public void testRequireBeforeProvide_LateProvideBranch() {
    // ครอบคลุม branch ต่างจาก MissingProvide: expectedName.firstNode != null
    // -> LATE_PROVIDE_ERROR (เทียบกับ testRequireUnprovidedNamespace ด้านบน)
    Result r = compile("goog.require('foo'); goog.provide('foo');");
    assertTrue(r.errors.length + r.warnings.length > 0);
  }

  // ================= goog.define =================

  @Test
  public void testDefineWithAnnotation_Success() {
    Result r = compile(
        "/** @define {boolean} */\ngoog.define('foo.ENABLED', true);");
    assertSuccessNoErrors(r);
    assertFalse(source().contains("goog.define"));
  }

  @Test
  public void testDefineMissingFirstArgument_NullArgumentError() {
    Result r = compile("goog.define();");
    assertHasError(r);
  }

  @Test
  public void testDefineFirstArgumentNotString_InvalidArgumentError() {
    Result r = compile("/** @define {boolean} */\ngoog.define(5, true);");
    assertHasError(r);
  }

  @Test
  public void testDefineMissingSecondArgument_NullArgumentError() {
    Result r = compile("/** @define {boolean} */\ngoog.define('foo.BAR');");
    assertHasError(r);
  }

  @Test
  public void testDefineInvalidName_InvalidDefineNameError() {
    Result r = compile(
        "/** @define {boolean} */\ngoog.define('foo-bar', true);");
    assertHasError(r);
  }

  @Test
  public void testDefineMissingAnnotation_MissingDefineAnnotationError() {
    Result r = compile("goog.define('foo.BAR', true);");
    assertHasError(r);
  }

  // ================= goog.exportSymbol =================
  // NOTE: exportedVariables เป็น internal state ที่ต้องเข้าถึงผ่าน
  // getExportedVariableNames() ของ instance ภายในซึ่งไม่ expose ผ่าน
  // black-box Compiler API นี้ -> จึงยืนยันได้แค่ว่า path ทั้งสอง (มี '.'/ไม่มี '.')
  // ถูก execute ได้โดยไม่เกิด error (ครอบคลุม branch แต่ไม่ assert ค่าภายใน)

  @Test
  public void testExportSymbolWithDot_NoError() {
    Result r = compile("goog.exportSymbol('a.b.c', x);");
    assertSuccessNoErrors(r);
  }

  @Test
  public void testExportSymbolWithoutDot_NoError() {
    Result r = compile("goog.exportSymbol('abc', x);");
    assertSuccessNoErrors(r);
  }

  // ================= goog.addDependency =================

  @Test
  public void testAddDependency_ReplacedWithZero() {
    Result r = compile("goog.addDependency('foo.js', ['foo'], []);");
    assertSuccessNoErrors(r);
    assertFalse(source().contains("addDependency"));
  }

  // ================= goog.setCssNameMapping =================

  @Test
  public void testSetCssNameMapping_DefaultByPart_Success() {
    Result r = compile("goog.setCssNameMapping({'foo':'a','bar':'b'});");
    assertSuccessNoErrors(r);
    assertFalse(source().contains("setCssNameMapping"));
  }

  @Test
  public void testSetCssNameMapping_ByWholeConsistent_Success() {
    Result r = compile(
        "goog.setCssNameMapping({'a':'x','b':'y','a-b':'x-y'}, 'BY_WHOLE');");
    assertSuccessNoErrors(r);
  }

  @Test
  public void testSetCssNameMapping_ByWholeInconsistent_Warning() {
    Result r = compile(
        "goog.setCssNameMapping({'a':'x','b':'y','a-b':'z'}, 'BY_WHOLE');");
    assertHasWarning(r);
  }

  @Test
  public void testSetCssNameMapping_ByPartHyphenKey_Warning() {
    Result r = compile("goog.setCssNameMapping({'foo-bar':'x'});");
    assertHasWarning(r);
  }

  @Test
  public void testSetCssNameMapping_InvalidStyle_Error() {
    Result r = compile("goog.setCssNameMapping({'a':'b'}, 'NOT_A_STYLE');");
    assertHasError(r);
  }

  @Test
  public void testSetCssNameMapping_NullArgument_Error() {
    Result r = compile("goog.setCssNameMapping();");
    assertHasError(r);
  }

  @Test
  public void testSetCssNameMapping_NotObjectLiteral_Error() {
    Result r = compile("goog.setCssNameMapping('notAnObject');");
    assertHasError(r);
  }

  @Test
  public void testSetCssNameMapping_SecondArgNotString_Error() {
    Result r = compile("goog.setCssNameMapping({'a':'b'}, 123);");
    assertHasError(r);
  }

  @Test
  public void testSetCssNameMapping_TooManyArguments_Error() {
    Result r = compile(
        "goog.setCssNameMapping({'a':'b'}, 'BY_PART', 'extra');");
    assertHasError(r);
  }

  @Test
  public void testSetCssNameMapping_NonStringValue_Error() {
    Result r = compile("goog.setCssNameMapping({'a': 5});");
    assertHasError(r);
    // NOTE: กรณี key ไม่ใช่ STRING_KEY (เช่น getter/computed property) ไม่ได้ทดสอบ
    // เพราะไม่แน่ใจว่า default language level ของ CompilerOptions ในเวอร์ชันนี้
    // รองรับ syntax ดังกล่าวหรือไม่ (ไม่มีข้อมูลใน source ที่ให้มา)
  }

  // ================= goog.base =================

  @Test
  public void testBaseConstructorCall_Success() {
    Result r = compile(
        "function Foo() { goog.base(this); }\n" +
        "goog.inherits(Foo, Bar);");
    assertSuccessNoErrors(r);
    assertTrue(source().contains("Bar.call") || !source().contains("goog.base"));
  }

  @Test
  public void testBaseConstructorMissingInherits_Error() {
    Result r = compile("function Foo() { goog.base(this); }");
    assertHasError(r);
  }

  @Test
  public void testBaseFirstArgNotThis_Error() {
    Result r = compile("function Foo() { goog.base(5); }");
    assertHasError(r);
  }

  @Test
  public void testBaseNoArguments_Error() {
    Result r = compile("function Foo() { goog.base(); }");
    assertHasError(r);
  }

  @Test
  public void testBaseAtGlobalScope_NoEnclosingMethodError() {
    Result r = compile("goog.base(this);");
    assertHasError(r);
  }

  @Test
  public void testBaseMethodCall_Success() {
    Result r = compile(
        "function Foo() {}\n" +
        "goog.inherits(Foo, Bar);\n" +
        "Foo.prototype.bar = function() { goog.base(this, 'bar', 1); };");
    assertSuccessNoErrors(r);
    assertTrue(source().contains("superClass_"));
  }

  @Test
  public void testBaseMethodNameMismatch_Error() {
    Result r = compile(
        "function Foo() {}\n" +
        "goog.inherits(Foo, Bar);\n" +
        "Foo.prototype.bar = function() { goog.base(this, 'baz', 1); };");
    assertHasError(r);
  }

  @Test
  public void testBaseMethodSecondArgNotString_Error() {
    Result r = compile(
        "function Foo() {}\n" +
        "goog.inherits(Foo, Bar);\n" +
        "Foo.prototype.bar = function() { goog.base(this, 5); };");
    assertHasError(r);
  }

  @Test
  public void testGoogBaseReferencedNotAsCall_BaseClassError() {
    // Token.GETPROP branch: !parent.isCall() && !parent.isAssign()
    Result r = compile("var x = goog.base;");
    assertHasError(r);
  }

  // ================= goog.<other/unmatched> branches =================

  @Test
  public void testCallLeftNotGetProp_NoOp() {
    // left.isGetProp() == false branch
    Result r = compile("foo();");
    assertSuccessNoErrors(r);
  }

  @Test
  public void testNamePartNotGoog_NoOp() {
    // name.isName() true but GOOG.equals(...) == false branch
    Result r = compile("notgoog.provide('x');");
    assertSuccessNoErrors(r);
    assertTrue(source().contains("notgoog"));
  }

  @Test
  public void testUnrecognizedGoogMethod_NoOp() {
    // methodName ไม่ตรงกับ base/define/require/provide/exportSymbol/
    // addDependency/setCssNameMapping -> ไม่ทำอะไร ไม่ error
    Result r = compile("goog.somethingElse('x');");
    assertSuccessNoErrors(r);
  }

  // ================= typedef definition (EXPR_RESULT branch) =================

  @Test
  public void testTypedefDefinitionForProvidedName_NoError() {
    Result r = compile(
        "goog.provide('foo');\n" +
        "/** @typedef {string} */\n" +
        "foo;");
    // ยืนยันแค่ว่าไม่เกิด error จาก path ที่ info.hasTypedefType()==true และ
    // providedNames.get(name)!=null (ไม่สามารถ assert รายละเอียดภายใน
    // ProvidedName ผ่าน black-box API ได้)
    assertSuccessNoErrors(r);
  }
}
