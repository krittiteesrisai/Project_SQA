package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig;
import com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Unit tests for {@link AbstractCommandLineRunner} (Defects4J Closure-149b).
 *
 * หมายเหตุทั่วไป:
 * - ไม่เรียก run()/exit()/doRun() ตรง ๆ เพราะ exit() เรียก System.exit()
 *   ซึ่งจะฆ่า JVM ของชุดทดสอบ และ doRun() ต้องพึ่งพา I/O จริงจำนวนมาก
 *   (เขียนไฟล์ output, อ่านไฟล์ input จริง) การจะทดสอบให้ปลอดภัยและไม่พึ่งพา
 *   behavior ที่ไม่ได้ประกาศไว้ชัดเจนในซอร์ส จึงเลี่ยงส่วนนี้
 * - field/method ที่เป็น private ใช้ reflection เข้าถึง
 * - สมมติฐาน (assumption) ที่ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา
 *   (เช่น field CompilerOptions.sourceMapOutputPath เป็น package-visible,
 *   constructor ของ JSModule(String) เข้าถึงได้) จะระบุเป็นคอมเมนต์กำกับไว้
 */
public class AbstractCommandLineRunnerTest {

  /** Concrete subclass สำหรับทดสอบ (abstract class ต้องมี subclass) */
  private static class TestRunner
      extends AbstractCommandLineRunner<Compiler, CompilerOptions> {

    TestRunner() {
      super();
    }

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

  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder();

  private TestRunner runner;
  private CommandLineConfig config;

  @Before
  public void setUp() {
    runner = new TestRunner();
    config = runner.getCommandLineConfig();
  }

  // =========================================================
  // Reflection helpers สำหรับ private member
  // =========================================================

  private static Object invokeInstance(Object target, String name,
      Class<?>[] paramTypes, Object[] args) throws Exception {
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(name, paramTypes);
    m.setAccessible(true);
    try {
      return m.invoke(target, args);
    } catch (InvocationTargetException e) {
      Throwable cause = e.getCause();
      if (cause instanceof Exception) {
        throw (Exception) cause;
      }
      if (cause instanceof Error) {
        throw (Error) cause;
      }
      throw e;
    }
  }

  private static Object invokeStatic(String name, Class<?>[] paramTypes,
      Object[] args) throws Exception {
    Method m = AbstractCommandLineRunner.class.getDeclaredMethod(name, paramTypes);
    m.setAccessible(true);
    try {
      return m.invoke(null, args);
    } catch (InvocationTargetException e) {
      Throwable cause = e.getCause();
      if (cause instanceof Exception) {
        throw (Exception) cause;
      }
      if (cause instanceof Error) {
        throw (Error) cause;
      }
      throw e;
    }
  }

  private void setCompilerField(Compiler c) throws Exception {
    Field f = AbstractCommandLineRunner.class.getDeclaredField("compiler");
    f.setAccessible(true);
    f.set(runner, c);
  }

  // =========================================================
  // 1) getCommandLineConfig()
  // =========================================================

  @Test
  public void testGetCommandLineConfig_NotNull() {
    assertNotNull(runner.getCommandLineConfig());
  }

  // =========================================================
  // 2) createJsModules(specs, jsFiles) - package-private static
  // =========================================================

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_NullSpecs() throws Exception {
    AbstractCommandLineRunner.createJsModules(null, new ArrayList<String>());
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_EmptySpecs() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        new ArrayList<String>(), new ArrayList<String>());
  }

  @Test(expected = IllegalStateException.class)
  public void testCreateJsModules_NullJsFiles() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0"), null);
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_TooFewParts() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("onlyname"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_TooManyParts() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("a:1:dep:extra:extra2"), Arrays.asList("f1.js"));
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_InvalidModuleName() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("1abc:0"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_DuplicateModuleName() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0", "m1:0"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_NonNumericFileCount() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:abc"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_NegativeFileCount() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:-1"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_NotEnoughJsFiles() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:5"), new ArrayList<String>());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_TooManyJsFiles() throws Exception {
    // m1 ใช้ 0 ไฟล์ แต่มีไฟล์ทั้งหมด 1 ไฟล์ -> เหลือไฟล์ที่ไม่ได้ใช้
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0"), Arrays.asList("a.js"));
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateJsModules_UnknownDependency() throws Exception {
    AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0:unknown"), new ArrayList<String>());
  }

  @Test
  public void testCreateJsModules_EmptyDepListBranch() throws Exception {
    // parts.length == 4, parts[2] (depList) == "" -> ข้าม loop dependency
    JSModule[] modules = AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0::extra"), new ArrayList<String>());
    assertEquals(1, modules.length);
    assertEquals("m1", modules[0].getName());
  }

  @Test
  public void testCreateJsModules_HappyPathNoDeps() throws Exception {
    JSModule[] modules = AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0"), new ArrayList<String>());
    assertEquals(1, modules.length);
    assertEquals("m1", modules[0].getName());
  }

  @Test
  public void testCreateJsModules_HappyPathWithDeps() throws Exception {
    JSModule[] modules = AbstractCommandLineRunner.createJsModules(
        Arrays.asList("m1:0", "m2:0:m1"), new ArrayList<String>());
    assertEquals(2, modules.length);
    assertEquals("m2", modules[1].getName());
    // สมมติฐาน: getSortedDependencyNames() คืนชื่อโมดูลที่พึ่งพา
    assertTrue(modules[1].getSortedDependencyNames().contains("m1"));
  }

  // =========================================================
  // 3) parseModuleWrappers(specs, modules) - package-private static
  // =========================================================

  @Test(expected = IllegalStateException.class)
  public void testParseModuleWrappers_NullSpecs() throws Exception {
    AbstractCommandLineRunner.parseModuleWrappers(null, new JSModule[0]);
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_NoColon() throws Exception {
    AbstractCommandLineRunner.parseModuleWrappers(
        Arrays.asList("invalidwrapper"), new JSModule[0]);
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_UnknownModule() throws Exception {
    AbstractCommandLineRunner.parseModuleWrappers(
        Arrays.asList("m1:%s"), new JSModule[0]);
  }

  @Test(expected = FlagUsageException.class)
  public void testParseModuleWrappers_NoPlaceholder() throws Exception {
    JSModule[] modules = { new JSModule("m1") };
    AbstractCommandLineRunner.parseModuleWrappers(
        Arrays.asList("m1:nowrapper"), modules);
  }

  @Test
  public void testParseModuleWrappers_HappyPath() throws Exception {
    JSModule[] modules = { new JSModule("m1") };
    Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(
        Arrays.asList("m1:wrap(%s)"), modules);
    assertEquals("wrap(%s)", wrappers.get("m1"));
  }

  @Test
  public void testParseModuleWrappers_EmptySpecsReturnsDefault() throws Exception {
    JSModule[] modules = { new JSModule("m1") };
    Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(
        Collections.<String>emptyList(), modules);
    assertEquals(1, wrappers.size());
    assertEquals("", wrappers.get("m1"));
  }

  // =========================================================
  // 4) writeOutput(out, compiler, code, wrapper, placeholder)
  // =========================================================

  @Test
  public void testWriteOutput_PlaceholderAtStart_NoSuffix() throws Exception {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(sb, null, "CODE", "%s", "%s");
    assertEquals("CODE\n", sb.toString());
  }

  @Test
  public void testWriteOutput_PlaceholderWithPrefixAndSuffix() throws Exception {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(sb, null, "CODE", "pre(%s)post", "%s");
    assertEquals("pre(CODE)post\n", sb.toString());
  }

  @Test
  public void testWriteOutput_NoPlaceholderFound() throws Exception {
    StringBuilder sb = new StringBuilder();
    AbstractCommandLineRunner.writeOutput(sb, null, "CODE", "no-marker-here", "%s");
    assertEquals("CODE\n", sb.toString());
  }

  @Test
  public void testWriteOutput_NullCompilerNoNPE() throws Exception {
    StringBuilder sb = new StringBuilder();
    // ตรวจสอบว่า compiler == null ไม่ทำให้เกิด NPE (เข้า branch false ของ &&)
    AbstractCommandLineRunner.writeOutput(sb, null, "X", "%s", "%s");
    assertEquals("X\n", sb.toString());
  }

  @Test
  public void testWriteOutput_CompilerWithNullSourceMap() throws Exception {
    StringBuilder sb = new StringBuilder();
    Compiler c = new Compiler();
    // compiler != null แต่ getSourceMap() == null (ค่าเริ่มต้น) -> branch false
    AbstractCommandLineRunner.writeOutput(sb, c, "X", "%s", "%s");
    assertEquals("X\n", sb.toString());
  }

  // =========================================================
  // 5) createDefineReplacements(definitions, options) - package-private static
  // =========================================================

  @Test
  public void testCreateDefineReplacements_EmptyList() {
    // ไม่ควร throw
    AbstractCommandLineRunner.createDefineReplacements(
        new ArrayList<String>(), new CompilerOptions());
  }

  @Test
  public void testCreateDefineReplacements_NoValue() {
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO"), new CompilerOptions());
  }

  @Test
  public void testCreateDefineReplacements_ValueTrue() {
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=true"), new CompilerOptions());
  }

  @Test
  public void testCreateDefineReplacements_ValueFalse() {
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=false"), new CompilerOptions());
  }

  @Test
  public void testCreateDefineReplacements_SingleQuotedString() {
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO='bar'"), new CompilerOptions());
  }

  @Test
  public void testCreateDefineReplacements_DoubleQuotedString() {
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=\"bar\""), new CompilerOptions());
  }

  @Test
  public void testCreateDefineReplacements_NumericValue() {
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=3.14"), new CompilerOptions());
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_InvalidNumericValue() {
    // ไม่ใช่ true/false, ไม่ใช่ quoted string, parseDouble ล้มเหลว
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO=notanumber"), new CompilerOptions());
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_QuotedStringContainingSameQuote() {
    // defValue = 'b'ar' -> quotes match แต่ maybeStringVal มี quote ซ้อน
    // -> ไม่ continue -> ตกไป throw RuntimeException ท้ายเมธอด
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("FOO='b'ar'"), new CompilerOptions());
  }

  @Test(expected = RuntimeException.class)
  public void testCreateDefineReplacements_EmptyDefName() {
    // defName.length() == 0 -> ข้าม if ทั้งหมด -> throw ทันที
    AbstractCommandLineRunner.createDefineReplacements(
        Arrays.asList("=true"), new CompilerOptions());
  }

  // =========================================================
  // 6) expandSourceMapPath(options, forModule) - package-private (@VisibleForTesting)
  // =========================================================

  @Test
  public void testExpandSourceMapPath_EmptyReturnsNull() {
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = "";
    assertNull(runner.expandSourceMapPath(options, null));
  }

  @Test
  public void testExpandSourceMapPath_NoModule_UsesJsOutputFile() {
    config.setJsOutputFile("out.js");
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = "%outname%.map";
    assertEquals("out.js.map", runner.expandSourceMapPath(options, null));
  }

  @Test
  public void testExpandSourceMapPath_NoModuleParam_ButModuleSpecPresent() {
    config.setModule(Arrays.asList("m1:0"));
    config.setModuleOutputPathPrefix("prefix_");
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = "%outname%.map";
    assertEquals("prefix_.map", runner.expandSourceMapPath(options, null));
  }

  @Test
  public void testExpandSourceMapPath_WithModule() {
    config.setModuleOutputPathPrefix("build/");
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = "%outname%_map";
    JSModule module = new JSModule("mod1");
    assertEquals("build/mod1.js_map", runner.expandSourceMapPath(options, module));
  }

  // =========================================================
  // 7) expandManifest(forModule) - package-private (@VisibleForTesting)
  // =========================================================

  @Test
  public void testExpandManifest_EmptyReturnsNull() {
    config.setOutputManifest("");
    assertNull(runner.expandManifest(null));
  }

  @Test
  public void testExpandManifest_WithModule() {
    config.setOutputManifest("%outname%.MF");
    config.setModuleOutputPathPrefix("out/");
    JSModule module = new JSModule("m2");
    assertEquals("out/m2.js.MF", runner.expandManifest(module));
  }

  // =========================================================
  // 8) setRunOptions(options) - protected final
  // =========================================================

  @Test
  public void testSetRunOptions_Default() throws Exception {
    CompilerOptions options = runner.createOptions();
    runner.setRunOptions(options);
    assertEquals("", options.jsOutputFile);
  }

  @Test
  public void testSetRunOptions_JsOutputFileSet() throws Exception {
    config.setJsOutputFile("out.js");
    CompilerOptions options = runner.createOptions();
    runner.setRunOptions(options);
    assertEquals("out.js", options.jsOutputFile);
  }

  @Test
  public void testSetRunOptions_CreateSourceMapSet() throws Exception {
    config.setCreateSourceMap("map.out");
    CompilerOptions options = runner.createOptions();
    runner.setRunOptions(options);
    assertEquals("map.out", options.sourceMapOutputPath);
  }

  @Test(expected = FlagUsageException.class)
  public void testSetRunOptions_InvalidCharset() throws Exception {
    config.setCharset("this-is-not-a-real-charset-xyz");
    CompilerOptions options = runner.createOptions();
    runner.setRunOptions(options);
  }

  @Test
  public void testSetRunOptions_ValidCharsetNoException() throws Exception {
    config.setCharset("UTF-8");
    CompilerOptions options = runner.createOptions();
    runner.setRunOptions(options); // ไม่ควร throw
  }

  @Test(expected = IOException.class)
  public void testSetRunOptions_VariableMapInputFileNotFound() throws Exception {
    config.setVariableMapInputFile(
        tempFolder.getRoot().getPath() + File.separator + "does-not-exist.map");
    CompilerOptions options = runner.createOptions();
    runner.setRunOptions(options);
  }

  // =========================================================
  // 9) createExterns() - protected
  // =========================================================

  @Test
  public void testCreateExterns_EmptyReturnsDevNull() throws Exception {
    List<JSSourceFile> externs = runner.createExterns();
    assertEquals(1, externs.size());
  }

  @Test(expected = FlagUsageException.class)
  public void testCreateExterns_StdinNotAllowed() throws Exception {
    // externs ไม่อนุญาต allowStdIn -> ต้อง throw ก่อนแตะ System.in จึงปลอดภัย
    config.setExterns(Arrays.asList("-"));
    runner.createExterns();
  }

  @Test
  public void testCreateExterns_RealFile() throws Exception {
    // ต้อง set inputCharset (static field) ผ่าน setRunOptions ก่อน
    CompilerOptions options = runner.createOptions();
    runner.setRunOptions(options);

    File externFile = tempFolder.newFile("extern1.js");
    FileWriter fw = new FileWriter(externFile);
    fw.write("var x;");
    fw.close();

    config.setExterns(Arrays.asList(externFile.getPath()));
    List<JSSourceFile> externs = runner.createExterns();
    assertEquals(1, externs.size());
  }

  // =========================================================
  // 10) processResults(result, modules, options) - package-private
  // =========================================================

  @Test
  public void testProcessResults_ComputePhaseOrdering_ReturnsZero() throws Exception {
    config.setComputePhaseOrdering(true);
    int code = runner.processResults(null, null, null);
    assertEquals(0, code);
  }

  @Test
  public void testProcessResults_PrintPassGraph_NullRootReturnsOne() throws Exception {
    config.setPrintPassGraph(true);
    setCompilerField(new Compiler()); // root ยังไม่ถูก parse -> getRoot()==null
    int code = runner.processResults(null, null, null);
    assertEquals(1, code);
  }

  @Test
  public void testProcessResults_PrintAst_NullRootReturnsOne() throws Exception {
    config.setPrintAst(true);
    setCompilerField(new Compiler());
    int code = runner.processResults(null, null, null);
    assertEquals(1, code);
  }

  @Test
  public void testProcessResults_PrintTree_NullRootReturnsOne() throws Exception {
    config.setPrintTree(true);
    setCompilerField(new Compiler());
    int code = runner.processResults(null, null, null);
    assertEquals(1, code);
  }

  // =========================================================
  // 11) shouldGenerateMapPerModule(options) - private, via reflection
  // =========================================================

  @Test
  public void testShouldGenerateMapPerModule_NullPath() throws Exception {
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = null;
    boolean result = (Boolean) invokeInstance(runner, "shouldGenerateMapPerModule",
        new Class<?>[] { CompilerOptions.class }, new Object[] { options });
    assertFalse(result);
  }

  @Test
  public void testShouldGenerateMapPerModule_PathWithoutPlaceholder() throws Exception {
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = "no-placeholder.map";
    boolean result = (Boolean) invokeInstance(runner, "shouldGenerateMapPerModule",
        new Class<?>[] { CompilerOptions.class }, new Object[] { options });
    assertFalse(result);
  }

  @Test
  public void testShouldGenerateMapPerModule_PathWithPlaceholder() throws Exception {
    CompilerOptions options = new CompilerOptions();
    options.sourceMapOutputPath = "foo%outname%bar";
    boolean result = (Boolean) invokeInstance(runner, "shouldGenerateMapPerModule",
        new Class<?>[] { CompilerOptions.class }, new Object[] { options });
    assertTrue(result);
  }

  // =========================================================
  // 12) shouldGenerateManifestPerModule() - private, via reflection
  // =========================================================

  @Test
  public void testShouldGenerateManifestPerModule_EmptyModuleList() throws Exception {
    config.setModule(new ArrayList<String>());
    config.setOutputManifest("m_%outname%.MF");
    boolean result = (Boolean) invokeInstance(runner,
        "shouldGenerateManifestPerModule", new Class<?>[0], new Object[0]);
    assertFalse(result);
  }

  @Test
  public void testShouldGenerateManifestPerModule_NullManifest() throws Exception {
    config.setModule(Arrays.asList("m1:0"));
    config.setOutputManifest(null);
    boolean result = (Boolean) invokeInstance(runner,
        "shouldGenerateManifestPerModule", new Class<?>[0], new Object[0]);
    assertFalse(result);
  }

  @Test
  public void testShouldGenerateManifestPerModule_NoPlaceholder() throws Exception {
    config.setModule(Arrays.asList("m1:0"));
    config.setOutputManifest("manifest.txt");
    boolean result = (Boolean) invokeInstance(runner,
        "shouldGenerateManifestPerModule", new Class<?>[0], new Object[0]);
    assertFalse(result);
  }

  @Test
  public void testShouldGenerateManifestPerModule_WithPlaceholder() throws Exception {
    config.setModule(Arrays.asList("m1:0"));
    config.setOutputManifest("man_%outname%.txt");
    boolean result = (Boolean) invokeInstance(runner,
        "shouldGenerateManifestPerModule", new Class<?>[0], new Object[0]);
    assertTrue(result);
  }

  // =========================================================
  // 13) getMapPath(outputFile) - private, via reflection
  // =========================================================

  @Test
  public void testGetMapPath_EmptyOutputFile_DefaultPrefix() throws Exception {
    config.setModuleOutputPathPrefix("");
    String result = (String) invokeInstance(runner, "getMapPath",
        new Class<?>[] { String.class }, new Object[] { "" });
    assertEquals("jscompiler", result);
  }

  @Test
  public void testGetMapPath_EmptyOutputFile_ModulePrefixSet() throws Exception {
    config.setModuleOutputPathPrefix("modprefix_");
    String result = (String) invokeInstance(runner, "getMapPath",
        new Class<?>[] { String.class }, new Object[] { "" });
    assertEquals("modprefix_", result);
  }

  @Test
  public void testGetMapPath_OutputFileEndsWithJs() throws Exception {
    String outputFile = "dir" + File.separator + "app.js";
    String result = (String) invokeInstance(runner, "getMapPath",
        new Class<?>[] { String.class }, new Object[] { outputFile });
    assertEquals("dir" + File.separatorChar + "app", result);
  }

  @Test
  public void testGetMapPath_OutputFileNotEndingWithJs() throws Exception {
    String outputFile = "dir" + File.separator + "app.out";
    String result = (String) invokeInstance(runner, "getMapPath",
        new Class<?>[] { String.class }, new Object[] { outputFile });
    assertEquals("dir" + File.separatorChar + "app.out", result);
  }

  // =========================================================
  // 14) maybeCreateDirsForPath(pathPrefix) - private static, via reflection
  // =========================================================

  @Test
  public void testMaybeCreateDirsForPath_EmptyPrefixNoOp() throws Exception {
    // pathPrefix.length() == 0 -> ไม่ทำอะไร ไม่ควร throw
    invokeStatic("maybeCreateDirsForPath", new Class<?>[] { String.class },
        new Object[] { "" });
  }

  @Test
  public void testMaybeCreateDirsForPath_EndsWithSeparator_CreatesDir()
      throws Exception {
    File newDir = new File(tempFolder.getRoot(), "sub_sep");
    String prefix = newDir.getPath() + File.separator;
    invokeStatic("maybeCreateDirsForPath", new Class<?>[] { String.class },
        new Object[] { prefix });
    assertTrue(newDir.exists());
  }

  @Test
  public void testMaybeCreateDirsForPath_NotEndingWithSeparator_CreatesParentDir()
      throws Exception {
    File newDir = new File(tempFolder.getRoot(), "sub_noSep");
    String prefix = newDir.getPath() + File.separator + "file";
    invokeStatic("maybeCreateDirsForPath", new Class<?>[] { String.class },
        new Object[] { prefix });
    assertTrue(newDir.exists());
  }
}
