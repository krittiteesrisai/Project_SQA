package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;

/**
 * JUnit4 test suite for {@link Compiler} (Defects4J Closure-64b).
 * วางไว้ package เดียวกับ Compiler เพื่อเข้าถึง field/method package-private
 * สำหรับตรวจสอบ state ภายในอย่างละเอียด (ไม่ได้เดา behavior ที่ไม่มีในซอร์ส)
 */
public class CompilerTest {

  // import ชัดเจนตามข้อกำหนด แม้จะอยู่ package เดียวกัน (ไม่ผิดกฎ Java)
  // (redundant แต่ compile ได้)
  // import com.google.javascript.jscomp.Compiler; // -- omitted: จะซ้ำกับ class ปัจจุบันไม่ได้ import ตัวเอง

  // ---------------------------------------------------------------------
  // Constructors / ErrorManager
  // ---------------------------------------------------------------------

  @Test
  public void testDefaultConstructor_optionsNullInitially() {
    Compiler compiler = new Compiler();
    assertNotNull(compiler);
    assertNull(compiler.options); // ยังไม่เรียก initOptions
  }

  @Test(expected = NullPointerException.class)
  public void testConstructorWithErrorManagerNull_throwsNPE() {
    new Compiler((ErrorManager) null);
  }

  @Test(expected = NullPointerException.class)
  public void testSetErrorManagerNull_throwsNPE() {
    Compiler compiler = new Compiler();
    compiler.setErrorManager(null);
  }

  @Test
  public void testGetErrorManager_autoInitWithNullStream() {
    Compiler compiler = new Compiler(); // outStream == null
    ErrorManager em = compiler.getErrorManager();
    assertNotNull(em);
    assertNotNull(compiler.options); // branch: options==null -> initOptions(new CompilerOptions())
  }

  @Test
  public void testGetErrorManager_autoInitWithPrintStream() {
    Compiler compiler = new Compiler(new PrintStream(new ByteArrayOutputStream()));
    ErrorManager em = compiler.getErrorManager();
    assertNotNull(em); // branch: outStream != null -> PrintStreamErrorManager
  }

  @Test
  public void testGetDiagnosticGroups_notNull() {
    Compiler compiler = new Compiler();
    assertNotNull(compiler.getDiagnosticGroups());
  }

  // ---------------------------------------------------------------------
  // initOptions branches
  // ---------------------------------------------------------------------

  @Test
  public void testInitOptions_checkTypesTrue_isTypeCheckingEnabledTrue() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);
    assertTrue(compiler.isTypeCheckingEnabled());
  }

  @Test
  public void testInitOptions_checkTypesFalse_isTypeCheckingEnabledFalse() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = false;
    compiler.initOptions(options);
    // branch: !options.checkTypes -> ปิด TYPE_PARSE_ERROR warning (ตรวจผลทางอ้อมผ่าน flag ไม่เปลี่ยน)
    assertFalse(compiler.isTypeCheckingEnabled());
  }

  @Test
  public void testInitOptions_checkGlobalThisLevelOn_noException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options); // branch: checkGlobalThisLevel.isOn() == true
    assertEquals(CheckLevel.WARNING, compiler.options.checkGlobalThisLevel);
  }

  @Test
  public void testInitOptions_checkSymbolsTrue_noExceptionSkipsGuardAdd() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkSymbols = true; // branch: !checkSymbols == false -> ไม่เพิ่ม guard OFF
    compiler.initOptions(options);
    assertTrue(compiler.options.checkSymbols);
  }

  // ---------------------------------------------------------------------
  // checkFirstModule / fillEmptyModules (ผ่าน initModules)
  // ---------------------------------------------------------------------

  @Test
  public void testCheckFirstModule_emptyModuleList_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    List<JSModule> modules = Lists.newArrayList(); // ว่าง
    compiler.initModules(Collections.<JSSourceFile>emptyList(), modules, options);
    assertTrue(compiler.hasErrors());
    assertEquals(1, compiler.getErrorCount()); // EMPTY_MODULE_LIST_ERROR เท่านั้น
  }

  @Test
  public void testCheckFirstModule_emptyRootModuleMultiple_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule m1 = new JSModule("m1"); // ไม่มี input
    JSModule m2 = new JSModule("m2");
    m2.add(JSSourceFile.fromCode("b.js", "var y=2;"));
    List<JSModule> modules = Lists.newArrayList(m1, m2);

    compiler.initModules(Collections.<JSSourceFile>emptyList(), modules, options);

    assertTrue(compiler.hasErrors());
    assertEquals(1, compiler.getErrorCount()); // EMPTY_ROOT_MODULE_ERROR
    assertNotNull(compiler.getModuleGraph()); // moduleGraph สร้างสำเร็จ (>1 module, ไม่มี dependency ผิด)
  }

  @Test
  public void testCheckFirstModule_singleEmptyModule_noErrorAndFilled() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule m1 = new JSModule("only"); // ไม่มี input แต่ size==1 -> ไม่ error
    List<JSModule> modules = Lists.newArrayList(m1);

    compiler.initModules(Collections.<JSSourceFile>emptyList(), modules, options);

    assertFalse(compiler.hasErrors());
    assertEquals(1, m1.getInputs().size()); // fillEmptyModules เติม placeholder
    assertNull(compiler.getModuleGraph()); // size==1 -> moduleGraph เป็น null
  }

  // ---------------------------------------------------------------------
  // initInputsByNameMap duplicate detection
  // ---------------------------------------------------------------------

  @Test
  public void testInitInputsByNameMap_duplicateExtern_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    List<JSSourceFile> externs = Lists.newArrayList(
        JSSourceFile.fromCode("dup.js", ""),
        JSSourceFile.fromCode("dup.js", ""));

    JSModule module = new JSModule("m");
    module.add(JSSourceFile.fromCode("input.js", "var a=1;"));

    compiler.initModules(externs, Lists.newArrayList(module), options);

    assertTrue(compiler.hasErrors());
    assertEquals(1, compiler.getErrorCount()); // DUPLICATE_EXTERN_INPUT
  }

  @Test
  public void testInitInputsByNameMap_duplicateInput_reportsError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();

    List<JSSourceFile> externs = Lists.newArrayList(
        JSSourceFile.fromCode("externs.js", ""));

    JSModule module = new JSModule("m");
    module.add(JSSourceFile.fromCode("dup.js", "var a=1;"));
    module.add(JSSourceFile.fromCode("dup.js", "var b=2;"));

    compiler.initModules(externs, Lists.newArrayList(module), options);

    assertTrue(compiler.hasErrors());
    assertEquals(1, compiler.getErrorCount()); // DUPLICATE_INPUT
  }

  // ---------------------------------------------------------------------
  // compile() end-to-end
  // ---------------------------------------------------------------------

  @Test
  public void testCompile_validCode_noErrors() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(extern, input, options);

    assertNotNull(result);
    assertFalse(compiler.hasErrors());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testCompile_syntaxError_hasErrors() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("bad.js", "var x = ;"); // malformed
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(extern, input, options);

    assertNotNull(result);
    assertTrue(compiler.hasErrors());
    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test(expected = IllegalStateException.class)
  public void testCompile_calledTwice_throwsIllegalState() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();

    compiler.compile(extern, input, options); // ตั้ง jsRoot แล้ว
    compiler.compile(extern, input, options); // Preconditions.checkState(jsRoot == null) ล้มเหลว
  }

  @Test
  public void testDisableThreads_compileStillWorks() {
    Compiler compiler = new Compiler();
    compiler.disableThreads(); // branch: useLargeStackThread == false ใน runCallable
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();

    Result result = compiler.compile(extern, input, options);

    assertNotNull(result);
    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testCompile_withTracerModeAll_setsPerformanceTracker() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();
    options.tracer = TracerMode.ALL; // branch: options.tracer.isOn() == true

    compiler.compile(extern, input, options);

    assertNotNull(compiler.tracker);
  }

  @Test
  public void testCompile_withDevModeStartAndEnd_noErrorsOnValidCode() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();
    options.devMode = DevMode.START_AND_END; // branch: devMode == START_AND_END -> runSanityCheck()

    compiler.compile(extern, input, options);

    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testCompile_withNameAnonymousFunctionsOnly_earlyReturn() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();
    options.nameAnonymousFunctionsOnly = true; // branch: check(); return;

    compiler.compile(extern, input, options);

    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testCompile_withSkipAllPasses_noErrors() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    CompilerOptions options = new CompilerOptions();
    options.skipAllPasses = true; // branch: !options.skipAllPasses == false

    compiler.compile(extern, input, options);

    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testCompile_withRecordFunctionInformation_mapPopulated() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(){};");
    CompilerOptions options = new CompilerOptions();
    options.recordFunctionInformation = true; // branch: if (options.recordFunctionInformation)

    compiler.compile(extern, input, options);

    assertFalse(compiler.hasErrors());
    assertNotNull(compiler.getFunctionalInformationMap());
  }

  // ---------------------------------------------------------------------
  // getSourceLine / getSourceRegion (boundary lineNumber < 1)
  // ---------------------------------------------------------------------

  @Test
  public void testGetSourceLine_lineNumberLessThanOne_returnsNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceLine("any.js", 0));
    assertNull(compiler.getSourceLine("any.js", -1));
  }

  @Test
  public void testGetSourceLine_unknownSource_returnsNull() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    assertNull(compiler.getSourceLine("nonexistent.js", 1));
  }

  @Test
  public void testGetSourceLine_knownSource_returnsContent() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;\nvar y = 2;");
    compiler.compile(extern, input, new CompilerOptions());

    String line = compiler.getSourceLine("input.js", 1);
    assertNotNull(line);
    assertTrue(line.contains("var x"));
  }

  @Test
  public void testGetSourceRegion_lineNumberLessThanOne_returnsNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceRegion("any.js", 0));
  }

  // ---------------------------------------------------------------------
  // acceptEcmaScript5 / languageMode / acceptConstKeyword
  // ---------------------------------------------------------------------

  @Test
  public void testAcceptEcmaScript5_allBranches() {
    // สมมติว่ามี setLanguageIn คู่กับ getLanguageIn ที่เห็นในซอร์ส (ไม่พบ signature ตรงในซอร์สที่ให้มา)
    Compiler c3 = new Compiler();
    CompilerOptions o3 = new CompilerOptions();
    o3.setLanguageIn(LanguageMode.ECMASCRIPT3);
    c3.initOptions(o3);
    assertFalse(c3.acceptEcmaScript5()); // default-branch ของ switch

    Compiler c5 = new Compiler();
    CompilerOptions o5 = new CompilerOptions();
    o5.setLanguageIn(LanguageMode.ECMASCRIPT5);
    c5.initOptions(o5);
    assertTrue(c5.acceptEcmaScript5());

    Compiler c5s = new Compiler();
    CompilerOptions o5s = new CompilerOptions();
    o5s.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
    c5s.initOptions(o5s);
    assertTrue(c5s.acceptEcmaScript5());
  }

  @Test
  public void testLanguageMode_returnsConfiguredValue() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
  }

  @Test
  public void testAcceptConstKeyword_trueFalse() {
    Compiler c1 = new Compiler();
    CompilerOptions o1 = new CompilerOptions();
    o1.acceptConstKeyword = true;
    c1.initOptions(o1);
    assertTrue(c1.acceptConstKeyword());

    Compiler c2 = new Compiler();
    CompilerOptions o2 = new CompilerOptions();
    o2.acceptConstKeyword = false;
    c2.initOptions(o2);
    assertFalse(c2.acceptConstKeyword());
  }

  @Test
  public void testGetParserConfig_cachedInstance() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);

    Object c1 = compiler.getParserConfig();
    Object c2 = compiler.getParserConfig();
    assertSame(c1, c2); // branch: parserConfig==null ครั้งแรกเท่านั้น
  }

  // ---------------------------------------------------------------------
  // uniqueNameId / resetUniqueNameId
  // ---------------------------------------------------------------------

  @Test
  public void testResetUniqueNameId_andSupplierSequence() {
    Compiler compiler = new Compiler();
    com.google.common.base.Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    compiler.resetUniqueNameId();
    assertEquals("0", supplier.get());
  }

  // ---------------------------------------------------------------------
  // hasErrors() / ideMode branch
  // ---------------------------------------------------------------------

  @Test
  public void testHasErrors_ideModeSuppressesHalting() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;

    // ใช้ initModules เพื่อสร้าง error (EMPTY_MODULE_LIST_ERROR) โดยไม่ผ่าน parse จริง
    compiler.initModules(Collections.<JSSourceFile>emptyList(),
        Lists.<JSModule>newArrayList(), options);

    assertTrue(compiler.getErrorCount() > 0);
    assertFalse(compiler.hasErrors()); // branch: isIdeMode() == true -> false เสมอ
  }

  // ---------------------------------------------------------------------
  // getInputsForTesting / getExternsForTesting / rebuildInputsFromModules
  // ---------------------------------------------------------------------

  @Test
  public void testGetInputsForTesting_getExternsForTesting_afterCompile() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    assertEquals(1, compiler.getExternsForTesting().size());
    assertEquals(1, compiler.getInputsForTesting().size());
  }

  @Test
  public void testRebuildInputsFromModules_reflectsNewInput() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSModule module = new JSModule("m");
    module.add(JSSourceFile.fromCode("a.js", "var a=1;"));
    compiler.initModules(Collections.<JSSourceFile>emptyList(),
        Lists.newArrayList(module), options);

    assertEquals(1, compiler.getInputsForTesting().size());

    module.add(JSSourceFile.fromCode("b.js", "var b=2;"));
    compiler.rebuildInputsFromModules();

    assertEquals(2, compiler.getInputsForTesting().size());
  }

  // ---------------------------------------------------------------------
  // getInput / removeInput / newExternInput
  // ---------------------------------------------------------------------

  @Test
  public void testGetInput_unknown_returnsNull() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    assertNull(compiler.getInput("nope.js"));
  }

  @Test
  public void testRemoveInput_unknownName_noop() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    compiler.removeInput("doesNotExist.js"); // branch: input == null -> return
    assertNotNull(compiler.getInput("input.js")); // ไม่ถูกกระทบ
  }

  @Test
  public void testRemoveInput_existingName_removes() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    compiler.removeInput("input.js");
    assertNull(compiler.getInput("input.js"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInput_duplicateName_throws() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    compiler.newExternInput("externs.js"); // ชื่อซ้ำ -> IllegalArgumentException
  }

  @Test
  public void testNewExternInput_newName_succeeds() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    CompilerInput newInput = compiler.newExternInput("brandNew.js");
    assertNotNull(newInput);
    assertNotNull(compiler.getInput("brandNew.js"));
  }

  // ---------------------------------------------------------------------
  // setPassConfig
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testSetPassConfig_null_throwsNPE() {
    Compiler compiler = new Compiler();
    compiler.setPassConfig(null);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetPassConfig_secondCall_throwsIllegalState() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.getPassConfig(); // lazy-init -> passes != null

    compiler.setPassConfig(new DefaultPassConfig(compiler.options));
  }

  // ---------------------------------------------------------------------
  // getTypeRegistry / getReverseAbstractInterpreter (lazy caching + closurePass)
  // ---------------------------------------------------------------------

  @Test
  public void testGetTypeRegistry_cachedInstance() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());

    Object r1 = compiler.getTypeRegistry();
    Object r2 = compiler.getTypeRegistry();
    assertSame(r1, r2);
  }

  @Test
  public void testGetReverseAbstractInterpreter_closurePassFalse() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = false;
    compiler.initOptions(options);

    assertNotNull(compiler.getReverseAbstractInterpreter());
  }

  @Test
  public void testGetReverseAbstractInterpreter_closurePassTrue() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    compiler.initOptions(options);

    assertNotNull(compiler.getReverseAbstractInterpreter());
  }

  // ---------------------------------------------------------------------
  // areNodesEqualForInlining
  // ---------------------------------------------------------------------

  @Test
  public void testAreNodesEqualForInlining_ambiguateFalse_sameNodeTrue() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ambiguateProperties = false;
    options.disambiguateProperties = false;
    compiler.initOptions(options);

    Node n = new Node(Token.BLOCK);
    assertTrue(compiler.areNodesEqualForInlining(n, n)); // branch else -> isEquivalentTo
  }

  @Test
  public void testAreNodesEqualForInlining_ambiguateTrue_sameNodeTrue() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.ambiguateProperties = true;
    compiler.initOptions(options);

    Node n = new Node(Token.BLOCK);
    assertTrue(compiler.areNodesEqualForInlining(n, n)); // branch if -> isEquivalentToTyped
  }

  // ---------------------------------------------------------------------
  // toSource / toSourceArray (module empty branch, jsRoot null branch)
  // ---------------------------------------------------------------------

  @Test
  public void testToSource_beforeParse_returnsEmpty() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    assertEquals("", compiler.toSource()); // jsRoot == null
  }

  @Test
  public void testToSource_afterCompile_returnsNonEmpty() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    String src = compiler.toSource();
    assertNotEquals("", src);
  }

  @Test
  public void testToSourceArray_moduleWithNoInputs_returnsEmptyArray() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());

    JSModule emptyModule = new JSModule("empty"); // ไม่ add input ใด ๆ
    String[] arr = compiler.toSourceArray(emptyModule);
    assertEquals(0, arr.length);
  }

  @Test
  public void testToSource_moduleWithNoInputs_returnsEmptyString() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());

    JSModule emptyModule = new JSModule("empty");
    String s = compiler.toSource(emptyModule);
    assertEquals("", s);
  }

  // ---------------------------------------------------------------------
  // getAstDotGraph / getSourceMap
  // ---------------------------------------------------------------------

  @Test
  public void testGetAstDotGraph_beforeParse_returnsEmpty() throws Exception {
    Compiler compiler = new Compiler();
    assertEquals("", compiler.getAstDotGraph()); // jsRoot == null branch
  }

  @Test
  public void testGetSourceMap_initiallyNull() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceMap());
  }

  // ---------------------------------------------------------------------
  // getInputsInOrder (unmodifiable list)
  // ---------------------------------------------------------------------

  @Test(expected = UnsupportedOperationException.class)
  public void testGetInputsInOrder_isUnmodifiable() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    List<CompilerInput> list = compiler.getInputsInOrder();
    list.add(null); // ต้องโยน UnsupportedOperationException
  }

  // ---------------------------------------------------------------------
  // getState / setState round trip
  // ---------------------------------------------------------------------

  @Test
  public void testGetState_setState_roundTrip() {
    Compiler compiler = new Compiler();
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(extern, input, new CompilerOptions());

    Compiler.IntermediateState state = compiler.getState();
    assertNotNull(state);
    assertSame(compiler.externsRoot, state.externsRoot);

    compiler.setState(state);
    assertSame(state.externsRoot, compiler.externsRoot);
  }
}
