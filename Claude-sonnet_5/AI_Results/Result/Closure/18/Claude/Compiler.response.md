# CompilerTest.java

หมายเหตุสำคัญ:
- วางคลาสทดสอบไว้ใน package เดียวกับ `Compiler` (`com.google.javascript.jscomp`) เพื่อให้เข้าถึงเมธอด/ฟิลด์ระดับ package-private ที่มีอยู่จริงในซอร์ส (เช่น `setProgress`, `getPassConfig`, `getNodeForCodeInsertion` เป็นต้น) ได้โดยไม่ต้องใช้ reflection เกินความจำเป็น
- ทุก API ที่เรียกใช้ (constructor/method/field) ยึดจากสิ่งที่ **ปรากฏจริงในซอร์สที่ให้มา** เท่านั้น (เช่น `SourceFile.fromCode`, `JSModule(String)`, `options.ideMode`, `DefaultPassConfig(options)`) เพื่อไม่เดา behavior ที่ไม่มีหลักฐาน
- หลีกเลี่ยงการใช้ `JSSourceFile.fromCode(...)` เพราะไม่มีหลักฐานยืนยัน factory method นี้ในซอร์สที่ให้มา (มีเพียงการอ้างถึง type `JSSourceFile[]` เป็นพารามิเตอร์เท่านั้น) — ใช้ `SourceFile.fromCode` ผ่าน generic `init/compile(List,...)` แทน
- ทดสอบที่เกี่ยวกับ `compile()` เรียก `disableThreads()` ก่อนเสมอ เพื่อไม่ต้อง spawn thread จริงและให้ผลลัพธ์ deterministic

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Unit tests for {@link Compiler} (Defects4J Closure-18b).
 *
 * Note: This test class intentionally lives in package
 * com.google.javascript.jscomp so it can exercise package-private
 * members that are only reachable from within the same package,
 * consistent with how the real project's tests are structured.
 */
public class CompilerTest {

  // ------------------------------------------------------------------
  // CodeBuilder (public static nested class) - fully analyzable source
  // ------------------------------------------------------------------

  @Test
  public void testCodeBuilderAppendAndToString() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello");
    assertEquals("hello", cb.toString());
    assertEquals(5, cb.getLength());
  }

  @Test
  public void testCodeBuilderResetClearsTextButKeepsLineCount() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("line1\nline2\n");
    int lineIndexBeforeReset = cb.getLineIndex();
    cb.reset();
    assertEquals("", cb.toString());
    assertEquals(0, cb.getLength());
    // reset() only clears sb, not lineCount/colCount per source
    assertEquals(lineIndexBeforeReset, cb.getLineIndex());
  }

  @Test
  public void testCodeBuilderColumnTrackingNoNewline() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("abc");
    assertEquals(0, cb.getLineIndex());
    assertEquals(3, cb.getColumnIndex());
    cb.append("de");
    assertEquals(0, cb.getLineIndex());
    assertEquals(5, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilderColumnTrackingWithNewline() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("abc\nde");
    assertEquals(1, cb.getLineIndex());
    assertEquals(2, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilderMultipleNewlinesTrailing() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("a\nb\nc\n");
    assertEquals(3, cb.getLineIndex());
    assertEquals(0, cb.getColumnIndex());
  }

  @Test
  public void testCodeBuilderEndsWithTrue() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello;");
    assertTrue(cb.endsWith(";"));
  }

  @Test
  public void testCodeBuilderEndsWithFalse_noMatch() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("hello");
    assertFalse(cb.endsWith(";"));
  }

  @Test
  public void testCodeBuilderEndsWith_suffixEqualsBufferLength() {
    // Boundary: implementation uses "sb.length() > suffix.length()" (strict >),
    // so equal length must return false. This is a good fault-detection case.
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("abc");
    assertFalse(cb.endsWith("abc"));
  }

  @Test
  public void testCodeBuilderEndsWith_suffixLongerThanBuffer() {
    Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
    cb.append("ab");
    assertFalse(cb.endsWith("abcdef"));
  }

  // ------------------------------------------------------------------
  // setProgress boundary clamping
  // ------------------------------------------------------------------

  @Test
  public void testSetProgressAbove1ClampsTo1() {
    Compiler compiler = new Compiler();
    compiler.setProgress(1.5);
    assertEquals(1.0, compiler.getProgress(), 0.0001);
  }

  @Test
  public void testSetProgressBelow0ClampsTo0() {
    Compiler compiler = new Compiler();
    compiler.setProgress(-0.2);
    assertEquals(0.0, compiler.getProgress(), 0.0001);
  }

  @Test
  public void testSetProgressExactBoundary1() {
    Compiler compiler = new Compiler();
    compiler.setProgress(1.0);
    assertEquals(1.0, compiler.getProgress(), 0.0001);
  }

  @Test
  public void testSetProgressExactBoundary0() {
    Compiler compiler = new Compiler();
    compiler.setProgress(0.0);
    assertEquals(0.0, compiler.getProgress(), 0.0001);
  }

  @Test
  public void testSetProgressNormalRange() {
    Compiler compiler = new Compiler();
    compiler.setProgress(0.42);
    assertEquals(0.42, compiler.getProgress(), 0.0001);
  }

  // ------------------------------------------------------------------
  // createFillFileName (static helper)
  // ------------------------------------------------------------------

  @Test
  public void testCreateFillFileName() {
    assertEquals("[myModule]", Compiler.createFillFileName("myModule"));
  }

  // ------------------------------------------------------------------
  // uniqueNameId / resetUniqueNameId / getUniqueNameIdSupplier
  // ------------------------------------------------------------------

  @Test
  public void testUniqueNameIdSupplierSequenceAfterReset() {
    Compiler compiler = new Compiler();
    compiler.resetUniqueNameId();
    Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    assertEquals("2", supplier.get());
  }

  // ------------------------------------------------------------------
  // getReleaseVersion / getReleaseDate
  // ------------------------------------------------------------------

  @Test
  public void testGetReleaseVersionNotNull() {
    assertNotNull(Compiler.getReleaseVersion());
  }

  @Test
  public void testGetReleaseDateNotNull() {
    assertNotNull(Compiler.getReleaseDate());
  }

  // ------------------------------------------------------------------
  // setErrorManager null-check
  // ------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testSetErrorManagerNullThrowsNPE() {
    new Compiler().setErrorManager(null);
  }

  // ------------------------------------------------------------------
  // initOptions: errorManager creation branches
  // ------------------------------------------------------------------

  @Test
  public void testInitOptions_createsErrorManager_whenNoOutStream() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    assertNotNull(compiler.getErrorManager());
  }

  @Test
  public void testInitOptions_createsPrintStreamErrorManager_whenOutStreamProvided() {
    Compiler compiler = new Compiler(new PrintStream(new ByteArrayOutputStream()));
    compiler.initOptions(new CompilerOptions());
    assertTrue(compiler.getErrorManager() instanceof PrintStreamErrorManager);
  }

  @Test
  public void testInitOptions_doesNotOverwriteExistingErrorManager() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    ErrorManager first = compiler.getErrorManager();
    compiler.initOptions(new CompilerOptions());
    ErrorManager second = compiler.getErrorManager();
    assertSame(first, second);
  }

  // ------------------------------------------------------------------
  // disableThreads
  // ------------------------------------------------------------------

  @Test
  public void testDisableThreadsSetsInternalFlagFalse() throws Exception {
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    Field f = Compiler.class.getDeclaredField("useThreads");
    f.setAccessible(true);
    assertFalse((Boolean) f.get(compiler));
  }

  // ------------------------------------------------------------------
  // setPassConfig / getPassConfig
  // ------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testSetPassConfigNullThrowsNPE() {
    new Compiler().setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfigCalledTwiceThrowsISE() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    PassConfig pc = new DefaultPassConfig(options);
    compiler.setPassConfig(pc);
    compiler.setPassConfig(pc); // second call must throw
  }

  @Test
  public void testGetPassConfigLazyCreationIsCached() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    PassConfig p1 = compiler.getPassConfig();
    PassConfig p2 = compiler.getPassConfig();
    assertNotNull(p1);
    assertSame(p1, p2);
  }

  // ------------------------------------------------------------------
  // hasErrors() / hasHaltingErrors() ideMode branch
  // ------------------------------------------------------------------

  @Test
  public void testHasErrors_ideModeFalse_returnsTrueWhenErrorReported() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = false;
    compiler.initOptions(options);
    compiler.report(JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b"));
    assertTrue(compiler.hasErrors());
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testHasErrors_ideModeTrue_returnsFalseEvenWithError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    compiler.initOptions(options);
    compiler.report(JSError.make(Compiler.MODULE_DEPENDENCY_ERROR, "a", "b"));
    assertFalse(compiler.hasErrors());
  }

  // ------------------------------------------------------------------
  // checkFirstModule / fillEmptyModules branches (via initModules)
  // ------------------------------------------------------------------

  @Test
  public void testInitModules_emptyModuleList_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initModules(
        Collections.<SourceFile>emptyList(),
        new ArrayList<JSModule>(),
        options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitModules_singleEmptyModule_getsFillFile_noError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module = new JSModule("m1");
    List<JSModule> modules = Lists.newArrayList(module);
    compiler.initModules(Collections.<SourceFile>emptyList(), modules, options);
    assertFalse(compiler.hasErrors());
    assertEquals(1, module.getInputs().size());
    assertEquals(Compiler.createFillFileName("m1"),
        module.getInputs().get(0).getName());
  }

  @Test
  public void testInitModules_multipleModulesWithEmptyRoot_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule rootModule = new JSModule("root"); // empty root, but >1 modules
    JSModule secondModule = new JSModule("second");
    secondModule.add(SourceFile.fromCode("second.js", "var x = 1;"));
    List<JSModule> modules = Lists.newArrayList(rootModule, secondModule);
    compiler.initModules(Collections.<SourceFile>emptyList(), modules, options);
    assertTrue(compiler.hasErrors());
  }

  // ------------------------------------------------------------------
  // initInputsByIdMap: DUPLICATE_INPUT / DUPLICATE_EXTERN_INPUT branches
  // ------------------------------------------------------------------

  @Test
  public void testInit_duplicateInputAcrossModules_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("dup.js", "var a = 1;"));
    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("dup.js", "var b = 2;"));
    // Using JSSourceFile[] empty array only as a type per the init(JSSourceFile[], JSModule[], ...) overload
    compiler.init(new JSSourceFile[0], new JSModule[] {m1, m2}, options);
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInit_duplicateExtern_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Lists.newArrayList(
        SourceFile.fromCode("dupExtern.js", ""),
        SourceFile.fromCode("dupExtern.js", ""));
    List<SourceFile> inputs = Lists.newArrayList(
        SourceFile.fromCode("in.js", "var a = 1;"));
    compiler.init(externs, inputs, options);
    assertTrue(compiler.hasErrors());
  }

  // ------------------------------------------------------------------
  // getSourceLine / getSourceRegion boundary (lineNumber < 1) + null lookups
  // ------------------------------------------------------------------

  @Test
  public void testGetSourceLine_lineNumberLessThan1ReturnsNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceLine("any.js", 0));
    assertNull(compiler.getSourceLine("any.js", -5));
  }

  @Test
  public void testGetSourceRegion_lineNumberLessThan1ReturnsNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceRegion("any.js", 0));
  }

  @Test
  public void testGetSourceFileByName_nullArgReturnsNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceFileByName(null));
  }

  @Test
  public void testGetSourceLine_unknownSourceNameReturnsNull() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = Lists.newArrayList(
        SourceFile.fromCode("in.js", "var a=1;\nvar b=2;"));
    compiler.init(externs, inputs, options);
    assertNull(compiler.getSourceLine("unknown.js", 1));
  }

  @Test
  public void testGetSourceLine_validSourceReturnsLineText() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = Lists.newArrayList(
        SourceFile.fromCode("in.js", "var a=1;\nvar b=2;"));
    compiler.init(externs, inputs, options);
    String line = compiler.getSourceLine("in.js", 1);
    assertNotNull(line);
    assertTrue(line.contains("var a"));
  }

  // ------------------------------------------------------------------
  // rebuildInputsFromModules / getInputsForTesting
  // ------------------------------------------------------------------

  @Test
  public void testRebuildInputsFromModules_reflectsModuleChanges() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module = new JSModule("m1");
    module.add(SourceFile.fromCode("a.js", "var a=1;"));
    List<JSModule> modules = Lists.newArrayList(module);
    compiler.initModules(Collections.<SourceFile>emptyList(), modules, options);
    assertEquals(1, compiler.getInputsForTesting().size());

    module.add(SourceFile.fromCode("b.js", "var b=2;"));
    compiler.rebuildInputsFromModules();
    assertEquals(2, compiler.getInputsForTesting().size());
  }

  // ------------------------------------------------------------------
  // hasRegExpGlobalReferences default + setter
  // ------------------------------------------------------------------

  @Test
  public void testHasRegExpGlobalReferences_defaultTrueAndSetter() {
    Compiler compiler = new Compiler();
    assertTrue(compiler.hasRegExpGlobalReferences());
    compiler.setHasRegExpGlobalReferences(false);
    assertFalse(compiler.hasRegExpGlobalReferences());
  }

  // ------------------------------------------------------------------
  // getNodeForCodeInsertion branches
  // ------------------------------------------------------------------

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_nullModule_emptyInputsThrows() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initModules(
        Collections.<SourceFile>emptyList(), new ArrayList<JSModule>(), options);
    compiler.getNodeForCodeInsertion(null); // inputs list is truly empty here
  }

  @Test
  public void testGetNodeForCodeInsertion_withModule_returnsAstRoot() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module = new JSModule("m1");
    module.add(SourceFile.fromCode("a.js", "var a=1;"));
    List<JSModule> modules = Lists.newArrayList(module);
    compiler.initModules(Collections.<SourceFile>emptyList(), modules, options);
    Node root = compiler.getNodeForCodeInsertion(module);
    assertNotNull(root);
  }

  @Test(expected = IllegalStateException.class)
  public void testGetNodeForCodeInsertion_moduleWithNoInputsThrows() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module = new JSModule("m1");
    module.add(SourceFile.fromCode("a.js", "var a=1;"));
    List<JSModule> modules = Lists.newArrayList(module);
    compiler.initModules(Collections.<SourceFile>emptyList(), modules, options);

    CompilerInput onlyInput = module.getInputs().get(0);
    module.remove(onlyInput);

    compiler.getNodeForCodeInsertion(module); // moduleInputs.size() == 0
  }

  // ------------------------------------------------------------------
  // acceptEcmaScript5 default (false) branch - only default-safe branch tested
  // ------------------------------------------------------------------

  @Test
  public void testAcceptEcmaScript5_defaultLanguageMode_returnsFalse() {
    // NOTE: default LanguageMode is assumed to NOT be ECMASCRIPT5/ECMASCRIPT5_STRICT
    // based on default CompilerOptions() construction. We only assert the
    // default(false) branch since no evidenced public setter for LanguageMode
    // is shown in the given source, per instructions we avoid guessing it.
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    assertFalse(compiler.acceptEcmaScript5());
  }

  // ------------------------------------------------------------------
  // Full compile() integration: valid source / syntax error / double-call
  // ------------------------------------------------------------------

  @Test
  public void testCompile_validSource_noErrorsAndProducesOutput() {
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = Lists.newArrayList(SourceFile.fromCode("in.js", "var x = 1;"));

    Result result = compiler.compile(externs, inputs, options);
    assertNotNull(result);
    assertFalse(compiler.hasErrors());

    String source = compiler.toSource();
    assertNotNull(source);
    assertTrue(source.length() > 0);
  }

  @Test
  public void testCompile_syntaxError_hasErrorsTrue() {
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = Lists.newArrayList(SourceFile.fromCode("in.js", "var x = ;"));

    compiler.compile(externs, inputs, options);
    assertTrue(compiler.hasErrors());
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwice_throwsISE() {
    Compiler compiler = new Compiler();
    compiler.disableThreads();
    CompilerOptions options = new CompilerOptions();
    List<SourceFile> externs = Lists.newArrayList(SourceFile.fromCode("externs.js", ""));
    List<SourceFile> inputs = Lists.newArrayList(SourceFile.fromCode("in.js", "var x = 1;"));

    compiler.compile(externs, inputs, options); // first call sets jsRoot
    compiler.compile(externs, inputs, options); // Preconditions.checkState(jsRoot == null) fails
  }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testCodeBuilderAppendAndToString | append() พื้นฐาน, toString(), getLength() |
| testCodeBuilderResetClearsTextButKeepsLineCount | reset() ไม่ล้าง lineCount/colCount |
| testCodeBuilderColumnTrackingNoNewline | append() loop: กรณีไม่มี `\n` (lastIndex == -1) |
| testCodeBuilderColumnTrackingWithNewline | append() loop: กรณีมี `\n` หนึ่งตัว (lastIndex != -1) |
| testCodeBuilderMultipleNewlinesTrailing | while loop วนหลาย `\n`, column = 0 หลัง `\n` ตัวสุดท้าย |
| testCodeBuilderEndsWithTrue / …False_noMatch | endsWith() true/false ปกติ |
| testCodeBuilderEndsWith_suffixEqualsBufferLength | boundary: `sb.length() > suffix.length()` เมื่อค่าเท่ากัน (edge case ดักบั๊ก) |
| testCodeBuilderEndsWith_suffixLongerThanBuffer | boundary: suffix ยาวกว่า buffer |
| testSetProgress* (5 tests) | if/else if/else ของ setProgress: >1, <0, ==1, ==0, ปกติ |
| testCreateFillFileName | static helper ปกติ |
| testUniqueNameIdSupplierSequenceAfterReset | resetUniqueNameId() + supplier sequence |
| testGetReleaseVersionNotNull / DateNotNull | static resource-bundle methods |
| testSetErrorManagerNullThrowsNPE | Preconditions.checkNotNull ใน setErrorManager |
| testInitOptions_createsErrorManager_whenNoOutStream | if (errorManager==null) → outStream==null branch |
| testInitOptions_createsPrintStreamErrorManager_whenOutStreamProvided | if (errorManager==null) → outStream!=null branch |
| testInitOptions_doesNotOverwriteExistingErrorManager | if (errorManager==null) false-branch (caching) |
| testDisableThreadsSetsInternalFlagFalse | disableThreads() ผ่าน reflection |
| testSetPassConfigNullThrowsNPE | Preconditions.checkNotNull(passes) |
| testSetPassConfigCalledTwiceThrowsISE | if (this.passes != null) throw ISE |
| testGetPassConfigLazyCreationIsCached | if (passes==null) create / cache branch |
| testHasErrors_ideModeFalse_* / _ideModeTrue_* | hasHaltingErrors(): `!isIdeMode() && errorCount>0` ทั้ง true/false |
| testInitModules_emptyModuleList_reportsError | checkFirstModule(): modules.isEmpty() branch |
| testInitModules_singleEmptyModule_getsFillFile_noError | checkFirstModule() else-if false + fillEmptyModules() loop body |
| testInitModules_multipleModulesWithEmptyRoot_reportsError | checkFirstModule(): else-if (empty root && size>1) branch |
| testInit_duplicateInputAcrossModules_reportsError | initInputsByIdMap(): DUPLICATE_INPUT (previous!=null) |
| testInit_duplicateExtern_reportsError | initInputsByIdMap(): DUPLICATE_EXTERN_INPUT (previous!=null) |
| testGetSourceLine_lineNumberLessThan1ReturnsNull | if (lineNumber < 1) return null |
| testGetSourceRegion_lineNumberLessThan1ReturnsNull | if (lineNumber < 1) return null |
| testGetSourceFileByName_nullArgReturnsNull | if (sourceName != null) false branch |
| testGetSourceLine_unknownSourceNameReturnsNull | input == null branch ใน getSourceFileByName |
| testGetSourceLine_validSourceReturnsLineText | input != null branch, ปกติ |
| testRebuildInputsFromModules_reflectsModuleChanges | rebuildInputsFromModules() + getAllInputsFromModules loop |
| testHasRegExpGlobalReferences_defaultTrueAndSetter | getter/setter ปกติ (boundary state toggle) |
| testGetNodeForCodeInsertion_nullModule_emptyInputsThrows | if (module==null) → inputs.isEmpty() true → throw |
| testGetNodeForCodeInsertion_withModule_returnsAstRoot | module!=null, moduleInputs.size()>0 branch |
| testGetNodeForCodeInsertion_moduleWithNoInputsThrows | module!=null, moduleInputs.size()==0 → throw |
| testAcceptEcmaScript5_defaultLanguageMode_returnsFalse | switch default branch (false) |
| testCompile_validSource_noErrorsAndProducesOutput | compile() success path: init→!hasErrors→compile()→toSource() |
| testCompile_syntaxError_hasErrorsTrue | compile() error path: hasErrors() true → early return |
| testCompile_calledTwice_throwsISE | Preconditions.checkState(jsRoot==null) ใน compile() |

**ข้อจำกัดที่ระบุไว้ (ไม่เดา behavior):**
- ไม่ได้ทดสอบ branch `acceptEcmaScript5()==true` (ECMASCRIPT5/5_STRICT) เพราะไม่มี setter ที่ปรากฏชัดในซอร์สที่ให้มา
- ไม่ได้เขียน mock `ErrorManager`/`WarningsGuard` แบบ custom เนื่องจากไม่มี interface signature ครบถ้วนในซอร์สที่ให้มา จึงใช้ implementation จริงในโปรเจ็กต์ (`PrintStreamErrorManager`) แทน
- ไม่ได้ทดสอบ branch ของ `initOptions()` ที่เกี่ยวกับ `DiagnosticGroups.enables/disables`, `checkGlobalThisLevel.isOn()`, และ `LANGUAGE_IN==ECMASCRIPT5_STRICT` เพราะการตั้งค่าที่แม่นยำต้องพึ่งพา API ที่ไม่ได้ยืนยันชัดเจนในซอร์ส (เช่น setter ของ `checkGlobalThisLevel`/`languageIn`) — คอมเมนต์ไว้ในโค้ดเพื่อความโปร่งใส