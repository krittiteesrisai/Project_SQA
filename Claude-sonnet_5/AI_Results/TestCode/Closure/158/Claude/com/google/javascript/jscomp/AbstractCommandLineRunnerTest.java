package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;

import com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig;
import com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JUnit4 test suite for {@link AbstractCommandLineRunner} (Closure-158b).
 */
public class AbstractCommandLineRunnerTest {

  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder();

  //---------------------------------------------------------------------
  // Test double: minimal concrete runner
  //---------------------------------------------------------------------
  private static class TestRunner
      extends AbstractCommandLineRunner<Compiler, CompilerOptions> {

    TestRunner(PrintStream out, PrintStream err) {
      super(out, err);
    }

    @Override
    protected Compiler createCompiler() {
      return new Compiler();
    }

    @Override
    protected CompilerOptions createOptions() {
      return new CompilerOptions();
    }
  }

  /** Runner ที่ควบคุมพฤติกรรม doRun() ได้ เพื่อทดสอบ run() */
  private static class ControllableRunner
      extends AbstractCommandLineRunner<Compiler, CompilerOptions> {

    int doRunCallCount = 0;
    int returnValue = 0;
    RuntimeException throwableToThrow = null;
    FlagUsageException flagUsageToThrow = null;

    ControllableRunner(PrintStream out, PrintStream err) {
      super(out, err);
    }

    @Override
    protected Compiler createCompiler() {
      return new Compiler();
    }

    @Override
    protected CompilerOptions createOptions() {
      return new CompilerOptions();
    }

    @Override
    protected int doRun() throws FlagUsageException, IOException {
      doRunCallCount++;
      if (flagUsageToThrow != null) {
        throw flagUsageToThrow;
      }
      if (throwableToThrow != null) {
        throw throwableToThrow;
      }
      return returnValue;
    }
  }

  private TestRunner runner;
  private PrintStream outStream;
  private PrintStream errStream;

  @Before
  public void setUp() {
    outStream = new PrintStream(new ByteArrayOutputStream());
    errStream = new PrintStream(new ByteArrayOutputStream());
    runner = new TestRunner(outStream, errStream);
  }

  //=====================================================================
  // enableTestMode / isInTestMode
  //=====================================================================

  @Test(expected = IllegalArgumentException.class)
  public void testEnableTestMode_bothInputsAndModulesNonNull_throws() {
    runner.enableTestMode(
        emptyExternsSupplier(),
        emptyInputsSupplier(),
        emptyModulesSupplier(),
        dummyExitReceiver());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEnableTestMode_bothNull_throws() {
    runner.enableTestMode(
        emptyExternsSupplier(),
        null,
        null,
        dummyExitReceiver());
  }

  @Test
  public void testEnableTestMode_validInputsSupplier() {
    runner.enableTestMode(
        emptyExternsSupplier(),
        emptyInputsSupplier(),
        null,
        dummyExitReceiver());
    assertTrue(runner.isInTestMode());
  }

  @Test
  public void testEnableTestMode_validModulesSupplier() {
    runner.enableTestMode(
        emptyExternsSupplier(),
        null,
        emptyModulesSupplier(),
        dummyExitReceiver());
    assertTrue(runner.isInTestMode());
  }

  @Test
  public void testIsInTestMode_defaultFalse() {
    assertFalse(runner.isInTestMode());
  }

  //=====================================================================
  // getCommandLineConfig / getErrorPrintStream / getDiagnosticGroups
  //=====================================================================

  @Test
  public void testGetCommandLineConfig_notNull() {
    assertNotNull(runner.getCommandLineConfig());
  }

  @Test
  public void testGetErrorPrintStream() {
    assertEquals(errStream, runner.getErrorPrintStream());
  }

  @Test
  public void testGetDiagnosticGroups_compilerNull() {
    // compiler ยังไม่ถูก set (default state) -> ต้อง return new DiagnosticGroups()
    DiagnosticGroups groups = runner.getDiagnosticGroups();
    assertNotNull(groups);
  }

  @Test
  public void testGetDiagnosticGroups_compilerNotNull() throws Exception {
    // ใช้ reflection เพื่อจำลองสถานะที่ compiler ถูก assign แล้ว (ปกติเกิดใน doRun())
    Compiler c = new Compiler();
    Field f = AbstractCommandLineRunner.class.getDeclaredField("compiler");
    f.setAccessible(true);
    f.set(runner, c);
    DiagnosticGroups groups = runner.getDiagnosticGroups();
    assertNotNull(groups);
  }

  //=====================================================================
  // createDefineOrTweakReplacements
  //=====================================================================

  @Test
  public void testCreateDefineOrTweak_trueLiteral() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO=true");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
    // ไม่ throw ถือว่าผ่าน branch isTrue
  }

  @Test
  public void testCreateDefineOrTweak_falseLiteral() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO=false");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
  }

  @Test
  public void testCreateDefineOrTweak_noEqualsDefaultsToTrue() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO"); // assignment.length==1 -> defValue="true"
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
  }

  @Test
  public void testCreateDefineOrTweak_singleQuotedString() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO='hello'");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
  }

  @Test
  public void testCreateDefineOrTweak_doubleQuotedString() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO=\"hello\"");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
  }

  @Test
  public void testCreateDefineOrTweak_numberLiteral() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO=3.14");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
  }

  @Test
  public void testCreateDefineOrTweak_tweaksTrueBranch() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO=true");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, true);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineOrTweak_emptyDefNameThrows() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("=value");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineOrTweak_invalidNumberThrows() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO=notanumber");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineOrTweak_embeddedQuoteFallsThroughThrows() {
    CompilerOptions options = new CompilerOptions();
    // defValue = 'a'b'  -> เริ่ม/จบด้วย ' แต่ maybeStringVal มี ' อยู่ข้างใน -> ตกไปที่ throw
    List<String> defs = Lists.newArrayList("FOO='a'b'");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, false);
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineOrTweak_tweaksInvalidThrows() {
    CompilerOptions options = new CompilerOptions();
    List<String> defs = Lists.newArrayList("FOO=notanumber");
    AbstractCommandLineRunner.createDefineOrTweakReplacements(defs, options, true);
  }

  //=====================================================================
  // parseModuleWrappers
  //=====================================================================

  @Test
  public void testParseModuleWrappers_valid() throws Exception {
    JSModule m1 = new JSModule("m1");
    List<JSModule> modules = Lists.newArrayList(m1);
    List<String> specs = Lists.newArrayList("m1:(%s)");
    java.util.Map<String, String> result =
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    assertEquals("(%s)", result.get("m1"));
  }

  @Test
  public void testParseModuleWrappers_defaultEmptyWrapper() throws Exception {
    JSModule m1 = new JSModule("m1");
    List<JSModule> modules = Lists.newArrayList(m1);
    List<String> specs = Lists.newArrayList(); // ไม่มี spec เลย
    java.util.Map<String, String> result =
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    assertEquals("", result.get("m1"));
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_missingColonThrows() throws Exception {
    JSModule m1 = new JSModule("m1");
    List<JSModule> modules = Lists.newArrayList(m1);
    List<String> specs = Lists.newArrayList("nocolon");
    AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_unknownModuleThrows() throws Exception {
    JSModule m1 = new JSModule("m1");
    List<JSModule> modules = Lists.newArrayList(m1);
    List<String> specs = Lists.newArrayList("unknown:(%s)");
    AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_noPlaceholderThrows() throws Exception {
    JSModule m1 = new JSModule("m1");
    List<JSModule> modules = Lists.newArrayList(m1);
    List<String> specs = Lists.newArrayList("m1:nowrapperhere");
    AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
  }

  //=====================================================================
  // writeOutput
  //=====================================================================

  @Test
  public void testWriteOutput_placeholderInMiddle() throws IOException {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(
        sb, null, "CODE", "PRE_%output%_POST", "%output%");
    assertEquals("PRE_CODE_POST\n", sb.toString());
  }

  @Test
  public void testWriteOutput_placeholderAtStart() throws IOException {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(
        sb, null, "CODE", "%output%_POST", "%output%");
    assertEquals("CODE_POST\n", sb.toString());
  }

  @Test
  public void testWriteOutput_placeholderAtEnd() throws IOException {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(
        sb, null, "CODE", "PRE_%output%", "%output%");
    assertEquals("PRE_CODE\n", sb.toString());
  }

  @Test
  public void testWriteOutput_noPlaceholder() throws IOException {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(
        sb, null, "CODE", "NO_MARKER_HERE", "%output%");
    assertEquals("CODE\n", sb.toString());
  }

  @Test
  public void testWriteOutput_compilerNonNullNoSourceMap() throws IOException {
    // compiler != null แต่ getSourceMap() == null (default) -> ไม่ throw, ครอบ branch ฝั่ง false ของ &&
    StringBuilder sb = new StringBuilder();
    Compiler c = new Compiler();
    AbstractCommandLineRunner.writeOutput(
        sb, c, "CODE", "PRE_%output%_POST", "%output%");
    assertEquals("PRE_CODE_POST\n", sb.toString());
  }

  //=====================================================================
  // createJsModules
  //=====================================================================

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_nullSpecsThrows() throws Exception {
    runner.createJsModules(null, Lists.<String>newArrayList());
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_emptySpecsThrows() throws Exception {
    runner.createJsModules(Lists.<String>newArrayList(), Lists.<String>newArrayList());
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_nullJsFilesThrows() throws Exception {
    runner.createJsModules(Lists.newArrayList("m1:0"), null);
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_badSpecFormatTooFewParts() throws Exception {
    runner.createJsModules(Lists.newArrayList("onlyname"), Lists.<String>newArrayList());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_badSpecFormatTooManyParts() throws Exception {
    runner.createJsModules(Lists.newArrayList("a:1:2:3:4"), Lists.<String>newArrayList());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_invalidModuleNameThrows() throws Exception {
    runner.createJsModules(Lists.newArrayList("123abc:0"), Lists.<String>newArrayList());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_duplicateModuleNameThrows() throws Exception {
    runner.createJsModules(
        Lists.newArrayList("m1:0", "m1:0"), Lists.<String>newArrayList());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_nonNumericCountThrows() throws Exception {
    runner.createJsModules(Lists.newArrayList("m1:abc"), Lists.<String>newArrayList());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_negativeCountThrows() throws Exception {
    runner.createJsModules(Lists.newArrayList("m1:-5"), Lists.<String>newArrayList());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_notEnoughFilesThrows() throws Exception {
    runner.createJsModules(Lists.newArrayList("m1:5"), Lists.<String>newArrayList());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_unknownDependencyThrows() throws Exception {
    runner.createJsModules(
        Lists.newArrayList("m1:0:unknown"), Lists.<String>newArrayList());
  }

  @Test
  public void testCreateJsModules_successWithDependency() throws Exception {
    List<JSModule> result = runner.createJsModules(
        Lists.newArrayList("m1:0", "m2:0:m1"), Lists.<String>newArrayList());
    assertEquals(2, result.size());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_tooManyJsFilesThrows() throws Exception {
    runner.createJsModules(
        Lists.newArrayList("m1:0"), Lists.newArrayList("extra.js"));
  }

  //=====================================================================
  // checkModuleName
  //=====================================================================

  @Test
  public void testCheckModuleName_valid() throws Exception {
    runner.checkModuleName("validName"); // ไม่ throw
  }

  @Test(expected = FlagUsageException.class)
  public void testCheckModuleName_invalidThrows() throws Exception {
    runner.checkModuleName("123-invalid");
  }

  //=====================================================================
  // createInputs
  //=====================================================================

  @Test(expected = FlagUsageException.class)
  public void testCreateInputs_stdinNotAllowedThrows() throws Exception {
    runner.createInputs(Lists.newArrayList("-"), false);
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateInputs_stdinTwiceThrows() throws Exception {
    runner.createInputs(Lists.newArrayList("-", "-"), true);
  }

  @Test
  public void testCreateInputs_realFileSuccess() throws Exception {
    // ต้องเรียก setRunOptions ก่อน เพื่อ init inputCharset (ปกติเรียกใน doRun())
    CompilerOptions opts = runner.createOptions();
    runner.setRunOptions(opts);

    File jsFile = tempFolder.newFile("input.js");
    FileWriter fw = new FileWriter(jsFile);
    fw.write("var x = 1;");
    fw.close();

    List<JSSourceFile> inputs =
        runner.createInputs(Lists.newArrayList(jsFile.getAbsolutePath()), true);
    assertEquals(1, inputs.size());
  }

  //=====================================================================
  // expandSourceMapPath / expandManifest
  //=====================================================================

  @Test
  public void testExpandSourceMapPath_emptyReturnsNull() {
    CompilerOptions opts = new CompilerOptions();
    opts.sourceMapOutputPath = null;
    assertEquals(null, runner.expandSourceMapPath(opts, null));
  }

  @Test
  public void testExpandSourceMapPath_emptyStringReturnsNull() {
    CompilerOptions opts = new CompilerOptions();
    opts.sourceMapOutputPath = "";
    assertEquals(null, runner.expandSourceMapPath(opts, null));
  }

  @Test
  public void testExpandSourceMapPath_withJsOutputFile() {
    CompilerOptions opts = new CompilerOptions();
    opts.sourceMapOutputPath = "path_%outname%.map";
    runner.getCommandLineConfig().setJsOutputFile("out.js");
    String result = runner.expandSourceMapPath(opts, null);
    assertEquals("path_out.js.map", result);
  }

  @Test
  public void testExpandSourceMapPath_withModule() {
    CompilerOptions opts = new CompilerOptions();
    opts.sourceMapOutputPath = "path_%outname%.map";
    runner.getCommandLineConfig().setModuleOutputPathPrefix("prefix_");
    JSModule m = new JSModule("mod1");
    String result = runner.expandSourceMapPath(opts, m);
    assertEquals("path_prefix_mod1.js.map", result);
  }

  @Test
  public void testExpandManifest_emptyReturnsNull() {
    // outputManifest default "" -> Strings.isEmpty true -> return null
    assertEquals(null, runner.expandManifest(null));
  }

  @Test
  public void testExpandManifest_withOutputFile() {
    runner.getCommandLineConfig().setOutputManifest("manifest_%outname%.txt");
    runner.getCommandLineConfig().setJsOutputFile("out.js");
    String result = runner.expandManifest(null);
    assertEquals("manifest_out.js.txt", result);
  }

  //=====================================================================
  // setRunOptions
  //=====================================================================

  @Test
  public void testSetRunOptions_defaultsNoException() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.setRunOptions(opts);
    // charset default "" -> outputCharset ควรเป็น US-ASCII ตาม getOutputCharset()
    assertEquals("US-ASCII", opts.outputCharset);
  }

  @Test(expected = FlagUsageException.class)
  public void testSetRunOptions_invalidCharsetThrows() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setCharset("not-a-real-charset-xyz");
    runner.setRunOptions(opts);
  }

  @Test
  public void testSetRunOptions_jsOutputFileSet() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setJsOutputFile("out.js");
    runner.setRunOptions(opts);
    assertEquals("out.js", opts.jsOutputFile);
  }

  @Test
  public void testSetRunOptions_createSourceMapSet() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setCreateSourceMap("out.map");
    runner.setRunOptions(opts);
    assertEquals("out.map", opts.sourceMapOutputPath);
  }

  @Test(expected = IOException.class)
  public void testSetRunOptions_variableMapInputFileMissingThrows() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setVariableMapInputFile(
        tempFolder.getRoot().getAbsolutePath() + "/does_not_exist.map");
    runner.setRunOptions(opts);
  }

  @Test(expected = IOException.class)
  public void testSetRunOptions_propertyMapInputFileMissingThrows() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setPropertyMapInputFile(
        tempFolder.getRoot().getAbsolutePath() + "/does_not_exist.map");
    runner.setRunOptions(opts);
  }

  @Test
  public void testSetRunOptions_acceptConstKeywordPropagated() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setAcceptConstKeyword(true);
    runner.setRunOptions(opts);
    assertTrue(opts.acceptConstKeyword);
  }

  @Test
  public void testSetRunOptions_languageIn_es5Strict() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setLanguageIn("ECMASCRIPT5_STRICT");
    runner.setRunOptions(opts); // ไม่ throw
  }

  @Test
  public void testSetRunOptions_languageIn_es5StrictAlias() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setLanguageIn("ES5_STRICT");
    runner.setRunOptions(opts);
  }

  @Test
  public void testSetRunOptions_languageIn_es5() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setLanguageIn("ECMASCRIPT5");
    runner.setRunOptions(opts);
  }

  @Test
  public void testSetRunOptions_languageIn_es5Alias() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setLanguageIn("ES5");
    runner.setRunOptions(opts);
  }

  @Test
  public void testSetRunOptions_languageIn_es3() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setLanguageIn("ECMASCRIPT3");
    runner.setRunOptions(opts);
  }

  @Test
  public void testSetRunOptions_languageIn_es3Alias() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setLanguageIn("ES3");
    runner.setRunOptions(opts);
  }

  @Test(expected = FlagUsageException.class)
  public void testSetRunOptions_languageIn_unknownThrows() throws Exception {
    CompilerOptions opts = runner.createOptions();
    runner.getCommandLineConfig().setLanguageIn("FOOBAR");
    runner.setRunOptions(opts);
  }

  //=====================================================================
  // run()
  //=====================================================================

  @Test
  public void testRun_successPath() {
    ControllableRunner cr = new ControllableRunner(outStream, errStream);
    cr.returnValue = 0;
    final int[] captured = {Integer.MIN_VALUE};
    cr.enableTestMode(
        emptyExternsSupplier(), emptyInputsSupplier(), null,
        new Function<Integer, Boolean>() {
          @Override public Boolean apply(Integer code) {
            captured[0] = code;
            return true;
          }
        });
    cr.run();
    assertEquals(0, captured[0]);
    assertEquals(1, cr.doRunCallCount);
  }

  @Test
  public void testRun_flagUsageExceptionPath() {
    ControllableRunner cr = new ControllableRunner(outStream, errStream);
    cr.flagUsageToThrow = new FlagUsageException("bad flag");
    final int[] captured = {Integer.MIN_VALUE};
    cr.enableTestMode(
        emptyExternsSupplier(), emptyInputsSupplier(), null,
        new Function<Integer, Boolean>() {
          @Override public Boolean apply(Integer code) {
            captured[0] = code;
            return true;
          }
        });
    cr.run();
    assertEquals(-1, captured[0]);
    assertEquals(1, cr.doRunCallCount);
  }

  @Test
  public void testRun_throwablePath() {
    ControllableRunner cr = new ControllableRunner(outStream, errStream);
    cr.throwableToThrow = new RuntimeException("boom");
    final int[] captured = {Integer.MIN_VALUE};
    cr.enableTestMode(
        emptyExternsSupplier(), emptyInputsSupplier(), null,
        new Function<Integer, Boolean>() {
          @Override public Boolean apply(Integer code) {
            captured[0] = code;
            return true;
          }
        });
    cr.run();
    assertEquals(-2, captured[0]);
    assertEquals(1, cr.doRunCallCount);
  }

  @Test
  public void testRun_computePhaseOrdering_allRunsExecuted() {
    // สมมติว่า PhaseOptimizer.randomizeLoops()/getLoopsRun() ปลอดภัยต่อการเรียกซ้ำ
    // (ใช้ตามพฤติกรรมจริงของโค้ดต้นทาง ไม่ได้เดาเพิ่ม)
    ControllableRunner cr = new ControllableRunner(outStream, errStream);
    cr.returnValue = 0;
    cr.getCommandLineConfig().setComputePhaseOrdering(true);
    final int[] captured = {Integer.MIN_VALUE};
    cr.enableTestMode(
        emptyExternsSupplier(), emptyInputsSupplier(), null,
        new Function<Integer, Boolean>() {
          @Override public Boolean apply(Integer code) {
            captured[0] = code;
            return true;
          }
        });
    cr.run();
    assertEquals(0, captured[0]);
    assertEquals(100, cr.doRunCallCount); // NUM_RUNS_TO_DETERMINE_OPTIMAL_ORDER
  }

  @Test
  public void testRun_computePhaseOrdering_stopsEarlyOnNonZeroResult() {
    ControllableRunner cr = new ControllableRunner(outStream, errStream);
    cr.returnValue = 5;
    cr.getCommandLineConfig().setComputePhaseOrdering(true);
    final int[] captured = {Integer.MIN_VALUE};
    cr.enableTestMode(
        emptyExternsSupplier(), emptyInputsSupplier(), null,
        new Function<Integer, Boolean>() {
          @Override public Boolean apply(Integer code) {
            captured[0] = code;
            return true;
          }
        });
    cr.run();
    assertEquals(5, captured[0]);
    assertEquals(1, cr.doRunCallCount);
  }

  // NOTE: ไม่มีการทดสอบ branch "testMode == false" ของ run() เพราะจะเรียก
  // System.exit(...) จริง ทำให้ JVM ของ test process ถูก terminate

  //=====================================================================
  // Helper suppliers
  //=====================================================================

  private Supplier<List<JSSourceFile>> emptyExternsSupplier() {
    return new Supplier<List<JSSourceFile>>() {
      @Override public List<JSSourceFile> get() {
        return new ArrayList<JSSourceFile>();
      }
    };
  }

  private Supplier<List<JSSourceFile>> emptyInputsSupplier() {
    return new Supplier<List<JSSourceFile>>() {
      @Override public List<JSSourceFile> get() {
        return new ArrayList<JSSourceFile>();
      }
    };
  }

  private Supplier<List<JSModule>> emptyModulesSupplier() {
    return new Supplier<List<JSModule>>() {
      @Override public List<JSModule> get() {
        return new ArrayList<JSModule>();
      }
    };
  }

  private Function<Integer, Boolean> dummyExitReceiver() {
    return new Function<Integer, Boolean>() {
      @Override public Boolean apply(Integer input) {
        return true;
      }
    };
  }
}
