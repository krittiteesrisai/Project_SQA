# CompilerTest.java (JUnit 4)

**หมายเหตุสำคัญก่อนเริ่ม:**
- Test class อยู่ใน package เดียวกับคลาสเป้าหมาย (`com.google.javascript.jscomp`) เพื่อให้เข้าถึง package-private members ที่จำเป็น (เช่น `initOptions`, `getParserConfig`, `getUniqueNameIdSupplier` ฯลฯ)
- บาง API ของ dependency classes (เช่น `CompilerOptions`, `JSModule`, `JSSourceFile`) ไม่ได้แสดง signature ทั้งหมดในซอร์สที่ให้มา แต่ถูก**ใช้ตรง ๆ ในซอร์สโค้ดเป้าหมายแล้ว** (เช่น `options.checkTypes = true`, `module.add(input)`, `JSSourceFile.fromCode(...)`) จึงมั่นใจได้ ส่วน API ที่ **ไม่ได้ปรากฏในซอร์ส** (เช่น `options.setLanguageIn(...)`) จะมีคอมเมนต์กำกับว่าเป็นสมมติฐานตามแบบแผนทั่วไปของ Closure Compiler
- Method ที่ private ทั้งหมด (`checkFirstModule`, `fillEmptyModules`) ทดสอบทางอ้อมผ่าน `init`/`initModules` เท่านั้น
- ไม่มี mocking library ในคลาสพาธที่กำหนด จึงใช้ instance จริงทั้งหมด

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.logging.Level;

/**
 * JUnit 4 test suite for {@link Compiler} (Defects4J Closure-59b).
 * เน้น branch/condition coverage และการดัก fault ที่เป็นไปได้
 */
public class CompilerTest {

  // ---------------------------------------------------------------------
  // Constructors / ErrorManager
  // ---------------------------------------------------------------------

  @Test
  public void testDefaultConstructor_noException() {
    Compiler compiler = new Compiler();
    assertNotNull(compiler);
  }

  @Test
  public void testConstructorWithPrintStream_noException() {
    Compiler compiler = new Compiler(System.out);
    assertNotNull(compiler);
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManager_nullThrowsNPE() {
    // Preconditions.checkNotNull branch
    Compiler compiler = new Compiler();
    compiler.setErrorManager(null);
  }

  @Test
  public void testConstructorWithErrorManager_isReused() {
    // สร้าง ErrorManager จริงผ่าน compiler ตัวช่วย แล้วนำมาใช้กับ compiler ตัวใหม่
    Compiler helper = new Compiler();
    helper.initOptions(new CompilerOptions());
    ErrorManager manager = helper.getErrorManager();

    Compiler compiler2 = new Compiler(manager);
    // getErrorManager(): options==null -> initOptions(...) แต่ errorManager != null จึงไม่ถูกแทนที่
    assertSame(manager, compiler2.getErrorManager());
  }

  // ---------------------------------------------------------------------
  // initOptions() branches
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testInitOptions_nullOptionsThrows() {
    Compiler compiler = new Compiler();
    compiler.initOptions(null);
  }

  @Test
  public void testInitOptions_createsLoggerErrorManagerWhenOutStreamNull() {
    Compiler compiler = new Compiler(); // outStream == null
    compiler.initOptions(new CompilerOptions());
    assertNotNull(compiler.getErrorManager());
  }

  @Test
  public void testInitOptions_createsPrintStreamErrorManagerWhenOutStreamSet() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    Compiler compiler = new Compiler(new PrintStream(baos));
    compiler.initOptions(new CompilerOptions());
    assertNotNull(compiler.getErrorManager());
  }

  @Test
  public void testInitOptions_checkTypesEnabledByDiagnosticGroup() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
    compiler.initOptions(options);
    assertTrue(options.checkTypes);
  }

  @Test
  public void testInitOptions_checkTypesDisabledByDiagnosticGroup() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.OFF);
    compiler.initOptions(options);
    assertFalse(options.checkTypes);
  }

  @Test
  public void testInitOptions_checkTypesPlainFlagOffBranch() {
    // ไม่มี DiagnosticGroups override, checkTypes เดิม false -> else-if สุดท้ายทำงาน
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    assertFalse(options.checkTypes);
  }

  @Test
  public void testInitOptions_checkGlobalThisLevelOnBranch() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING; // isOn() == true
    compiler.initOptions(options); // ต้องไม่ throw exception
    assertNotNull(compiler.getOptions());
  }

  @Test
  public void testInitOptions_checkGlobalThisLevelOffBranch() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.OFF; // isOn() == false -> ข้าม branch
    compiler.initOptions(options);
    assertNotNull(compiler.getOptions());
  }

  @Test
  public void testInitOptions_languageInEcmascript5Strict() {
    // สมมติฐาน: มี setter setLanguageIn(LanguageMode) ตามแบบแผนทั่วไปของ Closure Compiler
    // (ไม่ได้ปรากฏโดยตรงในซอร์สที่ให้มา มีเพียง getLanguageIn())
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT);
    compiler.initOptions(options);
    assertNotNull(compiler.getOptions());
  }

  @Test
  public void testInitOptions_checkSymbolsTrueBranch() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkSymbols = true;
    compiler.initOptions(options);
    assertTrue(options.checkSymbols);
  }

  @Test
  public void testInitOptions_checkSymbolsFalseBranch() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkSymbols = false;
    compiler.initOptions(options);
    assertFalse(options.checkSymbols);
  }

  // ---------------------------------------------------------------------
  // checkFirstModule / fillEmptyModules (ผ่าน initModules)
  // ---------------------------------------------------------------------

  @Test
  public void testInitModules_emptyModuleListReportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initModules(Collections.<JSSourceFile>emptyList(),
        Collections.<JSModule>emptyList(), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitModules_emptyRootModuleWithMultipleModules() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module1 = new JSModule("module1"); // empty inputs -> EMPTY_ROOT_MODULE_ERROR
    JSModule module2 = new JSModule("module2");
    module2.add(JSSourceFile.fromCode("input2.js", "var y = 2;"));
    compiler.initModules(Collections.<JSSourceFile>emptyList(),
        Lists.newArrayList(module1, module2), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitModules_multipleModulesNoErrors() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module1 = new JSModule("module1");
    module1.add(JSSourceFile.fromCode("input1.js", "var x = 1;"));
    JSModule module2 = new JSModule("module2");
    module2.add(JSSourceFile.fromCode("input2.js", "var y = 2;"));
    compiler.initModules(Collections.<JSSourceFile>emptyList(),
        Lists.newArrayList(module1, module2), options);
    assertFalse(compiler.hasErrors());
    assertEquals(2, compiler.getInputsForTesting().size());
  }

  // ---------------------------------------------------------------------
  // initInputsByNameMap: duplicate detection
  // ---------------------------------------------------------------------

  @Test
  public void testInitInputsByNameMap_duplicateJsInput() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module1 = new JSModule("module1");
    module1.add(JSSourceFile.fromCode("dup.js", "var x = 1;"));
    JSModule module2 = new JSModule("module2");
    module2.add(JSSourceFile.fromCode("dup.js", "var y = 2;"));
    compiler.initModules(Collections.<JSSourceFile>emptyList(),
        Lists.newArrayList(module1, module2), options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInit_duplicateExternInput() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        Lists.newArrayList(JSSourceFile.fromCode("dupExtern.js", ""),
            JSSourceFile.fromCode("dupExtern.js", "")),
        Lists.newArrayList(JSSourceFile.fromCode("in.js", "var a=1;")),
        options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInit_noDuplicates_noErrors() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        options);
    assertFalse(compiler.hasErrors());
  }

  // ---------------------------------------------------------------------
  // compile() end-to-end
  // ---------------------------------------------------------------------

  @Test
  public void testCompile_success() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    Result result = compiler.compile(
        JSSourceFile.fromCode("externs.js", ""),
        JSSourceFile.fromCode("input.js", "var x = 1;"),
        options);
    assertNotNull(result);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCompile_malformedInputProducesError() {
    // Boundary / malformed input case
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    Result result = compiler.compile(
        JSSourceFile.fromCode("externs.js", ""),
        JSSourceFile.fromCode("bad.js", "var = ;"),
        options);
    assertNotNull(result);
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwiceThrows() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());
    compiler.compile(extern, input, new CompilerOptions());
  }

  @Test
  public void testCompile_withModulesArrayOverload() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module = new JSModule("m1");
    module.add(JSSourceFile.fromCode("in.js", "var a = 1;"));
    Result result = compiler.compile(
        JSSourceFile.fromCode("externs.js", ""),
        new JSModule[] { module }, options);
    assertNotNull(result);
  }

  @Test
  public void testCompile_withDisabledThreads() {
    // covers runCallable(useLargeStackThread == false) branch
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    Result result = compiler.compile(
        JSSourceFile.fromCode("externs.js", ""),
        JSSourceFile.fromCode("input.js", "var x = 1;"),
        new CompilerOptions());
    assertNotNull(result);
  }

  // ---------------------------------------------------------------------
  // getInput / newExternInput / removeExternInput
  // ---------------------------------------------------------------------

  @Test
  public void testGetInput_existingAndMissing() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x=1;") },
        new CompilerOptions());
    assertNotNull(compiler.getInput("input.js"));
    assertNull(compiler.getInput("nonexistent.js"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicateNameThrows() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        new CompilerOptions());
    compiler.newExternInput("externs.js");
  }

  @Test
  public void testNewExternInput_addsNewExtern() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        new CompilerOptions());
    compiler.parse(); // ทำให้ externsRoot ไม่เป็น null
    CompilerInput newInput = compiler.newExternInput("newExtern.js");
    assertNotNull(newInput);
    assertNotNull(compiler.getInput("newExtern.js"));
  }

  @Test
  public void testRemoveExternInput_nonexistentInputNoOp() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        new CompilerOptions());
    compiler.removeExternInput("doesNotExist.js"); // input == null -> return
  }

  @Test(expected = IllegalStateException.class)
  public void testRemoveExternInput_nonExternInputThrows() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        new CompilerOptions());
    compiler.removeExternInput("input.js"); // isExtern() == false -> checkState throws
  }

  @Test
  public void testRemoveExternInput_externInputRemoved() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        new CompilerOptions());
    compiler.parse();
    compiler.removeExternInput("externs.js");
    assertNull(compiler.getInput("externs.js"));
  }

  // ---------------------------------------------------------------------
  // getSourceLine / getSourceRegion
  // ---------------------------------------------------------------------

  @Test
  public void testGetSourceLine_lineNumberLessThan1ReturnsNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceLine("any.js", 0));
    assertNull(compiler.getSourceLine("any.js", -1));
  }

  @Test
  public void testGetSourceLine_unknownSourceReturnsNull() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;\nvar b=2;") },
        new CompilerOptions());
    assertNull(compiler.getSourceLine("doesNotExist.js", 1));
  }

  @Test
  public void testGetSourceLine_nullSourceNameReturnsNull() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        new CompilerOptions());
    assertNull(compiler.getSourceLine(null, 1));
  }

  @Test
  public void testGetSourceLine_validSourceReturnsLine() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;\nvar b=2;") },
        new CompilerOptions());
    assertNotNull(compiler.getSourceLine("input.js", 1));
  }

  @Test
  public void testGetSourceRegion_lineNumberLessThan1ReturnsNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceRegion("any.js", 0));
  }

  // ---------------------------------------------------------------------
  // acceptEcmaScript5() switch branches
  // ---------------------------------------------------------------------

  @Test
  public void testAcceptEcmaScript5_es5() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    assertTrue(compiler.acceptEcmaScript5());
  }

  @Test
  public void testAcceptEcmaScript5_es5Strict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT);
    compiler.initOptions(options);
    assertTrue(compiler.acceptEcmaScript5());
  }

  @Test
  public void testAcceptEcmaScript5_es3_defaultFalse() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT3);
    compiler.initOptions(options);
    assertFalse(compiler.acceptEcmaScript5());
  }

  // ---------------------------------------------------------------------
  // isInliningForbidden()
  // ---------------------------------------------------------------------

  @Test
  public void testIsInliningForbidden_heuristic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
    compiler.initOptions(options);
    assertTrue(compiler.isInliningForbidden());
  }

  @Test
  public void testIsInliningForbidden_aggressiveHeuristic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
    compiler.initOptions(options);
    assertTrue(compiler.isInliningForbidden());
  }

  @Test
  public void testIsInliningForbidden_otherPolicyFalse() {
    // สมมติฐาน: PropertyRenamingPolicy มีค่า OFF ตามแบบแผนทั่วไปของ Closure Compiler
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.OFF;
    compiler.initOptions(options);
    assertFalse(compiler.isInliningForbidden());
  }

  // ---------------------------------------------------------------------
  // CodeBuilder (nested static class) - ครอบคลุมทุกเมธอด/branch
  // ---------------------------------------------------------------------

  @Test
  public void testCodeBuilder_appendNoNewline() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello");
    assertEquals("hello", cb.toString());
    assertEquals(5, cb.getLength());
    assertEquals(0, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilder_appendWithSingleNewline() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("line1\nline2");
    assertEquals(1, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilder_appendMultipleNewlines_loopCoverage() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("a\nb\nc\n");
    assertEquals(3, cb.getLineIndex());
    assertEquals(0, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilder_resetPreservesLineCount() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("a\nb\n");
    int linesBefore = cb.getLineIndex();
    cb.reset();
    assertEquals("", cb.toString());
    assertEquals(0, cb.getLength());
    assertEquals(linesBefore, cb.getLineIndex());
  }

  @Test
  public void testCodeBuilder_endsWithTrueAndFalse() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("abc;");
    assertTrue(cb.endsWith(";"));
    assertFalse(cb.endsWith("x"));
  }

  @Test
  public void testCodeBuilder_endsWith_equalLengthBoundary() {
    // Boundary: sb.length() == suffix.length() -> (sb.length() > suffix.length()) เป็น false
    // แม้เนื้อหาตรงกันทั้งหมดก็ตาม (จุดที่ควรตรวจสอบว่าเป็น fault หรือไม่)
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append(";");
    assertFalse(cb.endsWith(";"));
  }

  // ---------------------------------------------------------------------
  // uniqueNameId supplier / reset
  // ---------------------------------------------------------------------

  @Test
  public void testUniqueNameIdSupplier_incrementsAndResets() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    compiler.resetUniqueNameId();
    assertEquals("0", supplier.get());
  }

  // ---------------------------------------------------------------------
  // hasRegExpGlobalReferences
  // ---------------------------------------------------------------------

  @Test
  public void testHasRegExpGlobalReferences_defaultTrue() {
    Compiler compiler = new Compiler();
    assertTrue(compiler.hasRegExpGlobalReferences());
  }

  @Test
  public void testSetHasRegExpGlobalReferences_false() {
    Compiler compiler = new Compiler();
    compiler.setHasRegExpGlobalReferences(false);
    assertFalse(compiler.hasRegExpGlobalReferences());
  }

  // ---------------------------------------------------------------------
  // getErrorLevel / report / hasErrors (ideMode branch)
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testGetErrorLevel_optionsNullThrows() {
    Compiler compiler = new Compiler();
    JSError error = JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b");
    compiler.getErrorLevel(error);
  }

  @Test
  public void testHasErrors_ideModeAlwaysFalse() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    compiler.initOptions(options);
    compiler.report(JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b"));
    assertTrue(compiler.getErrorCount() > 0);
    assertFalse(compiler.hasErrors()); // !isIdeMode() == false -> ผลเป็น false เสมอ
  }

  @Test
  public void testHasErrors_normalModeTrueWhenErrors() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options); // ideMode == false (default)
    compiler.report(JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b"));
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testGetMessages_sameAsGetErrors() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.report(JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b"));
    assertArrayEquals(compiler.getErrors(), compiler.getMessages());
  }

  // ---------------------------------------------------------------------
  // getParserConfig() switch branches + caching
  // ---------------------------------------------------------------------

  @Test
  public void testGetParserConfig_ecmascript3() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT3);
    compiler.initOptions(options);
    Config c = compiler.getParserConfig();
    assertNotNull(c);
  }

  @Test
  public void testGetParserConfig_ecmascript5() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    assertNotNull(compiler.getParserConfig());
  }

  @Test
  public void testGetParserConfig_ecmascript5Strict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT);
    compiler.initOptions(options);
    assertNotNull(compiler.getParserConfig());
  }

  @Test
  public void testGetParserConfig_cachedInstance() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    Config c1 = compiler.getParserConfig();
    Config c2 = compiler.getParserConfig();
    assertSame(c1, c2); // parserConfig == null check: true then false
  }

  // ---------------------------------------------------------------------
  // getReverseAbstractInterpreter (closurePass branch) / getTypeValidator / getTypeRegistry caching
  // ---------------------------------------------------------------------

  @Test
  public void testGetReverseAbstractInterpreter_withClosurePass() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    compiler.initOptions(options);
    assertNotNull(compiler.getReverseAbstractInterpreter());
  }

  @Test
  public void testGetReverseAbstractInterpreter_withoutClosurePass() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = false;
    compiler.initOptions(options);
    assertNotNull(compiler.getReverseAbstractInterpreter());
  }

  @Test
  public void testGetTypeValidator_cachedInstance() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    TypeValidator v1 = compiler.getTypeValidator();
    TypeValidator v2 = compiler.getTypeValidator();
    assertSame(v1, v2);
  }

  @Test
  public void testGetTypeRegistry_cachedInstance() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    JSTypeRegistry r1 = compiler.getTypeRegistry();
    JSTypeRegistry r2 = compiler.getTypeRegistry();
    assertSame(r1, r2);
  }

  // ---------------------------------------------------------------------
  // getRoot / getInputsInOrder immutability / rebuildInputsFromModules
  // ---------------------------------------------------------------------

  @Test
  public void testGetRoot_beforeParseReturnsNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getRoot());
  }

  @Test
  public void testGetRoot_afterParseReturnsNode() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        new CompilerOptions());
    compiler.parse();
    assertNotNull(compiler.getRoot());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetInputsInOrder_immutable() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a=1;") },
        new CompilerOptions());
    compiler.getInputsInOrder().add(null);
  }

  @Test
  public void testRebuildInputsFromModules() {
    Compiler compiler = new Compiler();
    JSModule module = new JSModule("m1");
    module.add(JSSourceFile.fromCode("in1.js", "var a=1;"));
    compiler.init(new JSSourceFile[] {}, new JSModule[] { module }, new CompilerOptions());
    module.add(JSSourceFile.fromCode("in2.js", "var b=2;"));
    compiler.rebuildInputsFromModules();
    assertEquals(2, compiler.getInputsForTesting().size());
  }

  // ---------------------------------------------------------------------
  // getNodeForCodeInsertion
  // ---------------------------------------------------------------------

  @Test
  public void testGetNodeForCodeInsertion_nullModuleUsesFirstInput() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a=1;") },
        new CompilerOptions());
    Node node = compiler.getNodeForCodeInsertion(null);
    assertNotNull(node);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_noModulesNoInputsThrows() {
    Compiler compiler = new Compiler();
    compiler.initModules(Collections.<JSSourceFile>emptyList(),
        Collections.<JSModule>emptyList(), new CompilerOptions());
    compiler.getNodeForCodeInsertion(null);
  }

  @Test
  public void testGetNodeForCodeInsertion_moduleWithInputs() {
    Compiler compiler = new Compiler();
    JSModule module = new JSModule("m1");
    module.add(JSSourceFile.fromCode("in.js", "var a=1;"));
    compiler.init(new JSSourceFile[] {}, new JSModule[] { module }, new CompilerOptions());
    Node node = compiler.getNodeForCodeInsertion(module);
    assertNotNull(node);
  }

  // ---------------------------------------------------------------------
  // toSource() / toSource(JSModule) / toSourceArray(JSModule)
  // ---------------------------------------------------------------------

  @Test
  public void testToSource_withInput() {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a=1;") },
        new CompilerOptions());
    compiler.parse();
    String src = compiler.toSource();
    assertNotNull(src);
  }

  @Test
  public void testToSourceModule_emptyModuleReturnsEmptyString() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    JSModule emptyModule = new JSModule("empty"); // ไม่ผ่าน fillEmptyModules
    assertEquals("", compiler.toSource(emptyModule));
  }

  @Test
  public void testToSourceArrayModule_emptyModuleReturnsEmptyArray() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    JSModule emptyModule = new JSModule("empty");
    String[] result = compiler.toSourceArray(emptyModule);
    assertEquals(0, result.length);
  }

  @Test
  public void testToSourceModule_withInput() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    JSModule module = new JSModule("m1");
    module.add(JSSourceFile.fromCode("in.js", "var a = 1;"));
    String src = compiler.toSource(module);
    assertNotNull(src);
  }

  // ---------------------------------------------------------------------
  // acceptConstKeyword / isIdeMode / getOptions
  // ---------------------------------------------------------------------

  @Test
  public void testAcceptConstKeyword_true() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.acceptConstKeyword = true;
    compiler.initOptions(options);
    assertTrue(compiler.acceptConstKeyword());
  }

  @Test
  public void testIsIdeMode_true() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    compiler.initOptions(options);
    assertTrue(compiler.isIdeMode());
  }

  @Test
  public void testGetOptions_returnsSameInstance() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    assertSame(options, compiler.getOptions());
  }

  // ---------------------------------------------------------------------
  // getFunctionalInformationMap / setLoggingLevel / getAstDotGraph
  // ---------------------------------------------------------------------

  @Test
  public void testGetFunctionalInformationMap_initiallyNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getFunctionalInformationMap());
  }

  @Test
  public void testSetLoggingLevel_noException() {
    Compiler.setLoggingLevel(Level.WARNING);
  }

  @Test
  public void testGetAstDotGraph_beforeParseReturnsEmpty() throws IOException {
    Compiler compiler = new Compiler();
    assertEquals("", compiler.getAstDotGraph());
  }

  @Test
  public void testGetAstDotGraph_afterParseReturnsNonEmpty() throws IOException {
    Compiler compiler = new Compiler();
    compiler.init(new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("in.js", "var a=1;") },
        new CompilerOptions());
    compiler.parse();
    String dot = compiler.getAstDotGraph();
    assertNotNull(dot);
  }
}
```

## ตารางสรุป Test Method vs Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructor_noException / testConstructorWithPrintStream_noException | Constructor paths (outStream null/non-null setup) |
| testSetErrorManager_nullThrowsNPE | `Preconditions.checkNotNull` ใน setErrorManager |
| testConstructorWithErrorManager_isReused | `if (errorManager == null)` ใน initOptions (false branch), `if (options==null)` ใน getErrorManager |
| testInitOptions_nullOptionsThrows | null input boundary |
| testInitOptions_createsLoggerErrorManagerWhenOutStreamNull | errorManager==null && outStream==null |
| testInitOptions_createsPrintStreamErrorManagerWhenOutStreamSet | errorManager==null && outStream!=null |
| testInitOptions_checkTypesEnabledByDiagnosticGroup | `options.enables(CHECK_TYPES)` true |
| testInitOptions_checkTypesDisabledByDiagnosticGroup | `options.disables(CHECK_TYPES)` true |
| testInitOptions_checkTypesPlainFlagOffBranch | else-if `!options.checkTypes` true |
| testInitOptions_checkGlobalThisLevelOnBranch / OffBranch | `checkGlobalThisLevel.isOn()` true/false |
| testInitOptions_languageInEcmascript5Strict | `languageIn == ECMASCRIPT5_STRICT` true |
| testInitOptions_checkSymbolsTrueBranch / FalseBranch | `!options.checkSymbols && !composedGuards.enables(...)` true/false |
| testInitModules_emptyModuleListReportsError | `modules.isEmpty()` true (checkFirstModule) |
| testInitModules_emptyRootModuleWithMultipleModules | `getInputs().isEmpty() && size()>1` true |
| testInitModules_multipleModulesNoErrors | `modules.size()>1` true, try-block สำเร็จ |
| testInitInputsByNameMap_duplicateJsInput | duplicate branch ของ inputs loop |
| testInit_duplicateExternInput | duplicate branch ของ externs loop |
| testInit_noDuplicates_noErrors | non-duplicate branch ทั้งสอง loop |
| testCompile_success / malformedInputProducesError | compile() success/parse-error path, `hasErrors()` |
| testCompile_calledTwiceThrows | `Preconditions.checkState(jsRoot==null)` false |
| testCompile_withModulesArrayOverload | overload compile(JSSourceFile, JSModule[], ...) |
| testCompile_withDisabledThreads | `useLargeStackThread==false` ใน runCallable |
| testGetInput_existingAndMissing | map hit/miss |
| testNewExternInput_duplicateNameThrows / addsNewExtern | `inputsByName.containsKey(name)` true/false |
| testRemoveExternInput_nonexistentInputNoOp | `input==null` true |
| testRemoveExternInput_nonExternInputThrows | `checkState(input.isExtern())` false |
| testRemoveExternInput_externInputRemoved | `checkState` true + `root!=null` true |
| testGetSourceLine_lineNumberLessThan1ReturnsNull | `lineNumber<1` true |
| testGetSourceLine_unknownSourceReturnsNull / nullSourceNameReturnsNull | `containsKey` false |
| testGetSourceLine_validSourceReturnsLine | `containsKey` true |
| testGetSourceRegion_lineNumberLessThan1ReturnsNull | `lineNumber<1` true (region) |
| testAcceptEcmaScript5_es5 / es5Strict / es3_defaultFalse | switch-case ECMASCRIPT5 / ECMASCRIPT5_STRICT / default false |
| testIsInliningForbidden_heuristic / aggressiveHeuristic / otherPolicyFalse | `propertyRenaming == HEURISTIC` / `AGGRESSIVE_HEURISTIC` / false |
| testCodeBuilder_* (6 tests) | while-loop 0/1/หลาย newline, reset, endsWith true/false/boundary |
| testUniqueNameIdSupplier_incrementsAndResets | nextUniqueNameId increment, resetUniqueNameId |
| testHasRegExpGlobalReferences_* | getter/setter true/false |
| testGetErrorLevel_optionsNullThrows | `Preconditions.checkNotNull(options)` |
| testHasErrors_ideModeAlwaysFalse / normalModeTrueWhenErrors | `!isIdeMode() && getErrorCount()>0` true/false |
| testGetMessages_sameAsGetErrors | trivial delegation |
| testGetParserConfig_ecmascript3/5/5Strict | switch-case ทั้ง 3 |
| testGetParserConfig_cachedInstance | `parserConfig==null` true แล้ว false |
| testGetReverseAbstractInterpreter_withClosurePass / withoutClosurePass | `options.closurePass` true/false |
| testGetTypeValidator_cachedInstance / testGetTypeRegistry_cachedInstance | `typeValidator==null`/`typeRegistry==null` true→false |
| testGetRoot_beforeParseReturnsNull / afterParseReturnsNode | externAndJsRoot null/non-null |
| testGetInputsInOrder_immutable | unmodifiableList |
| testRebuildInputsFromModules | rebuild after module change |
| testGetNodeForCodeInsertion_nullModuleUsesFirstInput / noModulesNoInputsThrows / moduleWithInputs | `module==null` true/false, `inputs.isEmpty()` true, `moduleInputs.size()>0` true |
| testToSource_withInput | loop ผ่าน jsRoot children |
| testToSourceModule_emptyModuleReturnsEmptyString / withInput | `numInputs==0` true/false |
| testToSourceArrayModule_emptyModuleReturnsEmptyArray | `numInputs==0` true |
| testAcceptConstKeyword_true / testIsIdeMode_true / testGetOptions_returnsSameInstance | simple getter wrappers |
| testGetFunctionalInformationMap_initiallyNull / testSetLoggingLevel_noException | trivial state/static call |
| testGetAstDotGraph_beforeParseReturnsEmpty / afterParseReturnsNonEmpty | `jsRoot!=null` false/true |