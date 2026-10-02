package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Unit tests for {@link CompilerOptions}.
 *
 * หมายเหตุ: บาง method (enables/disables/addWarningsGuard branch ที่ guard != null,
 * setCodingConvention กับ instance จริง) ไม่ได้ทดสอบครบ เนื่องจากไม่มีซอร์สโค้ดของ
 * WarningsGuard / DiagnosticGroup / CodingConvention ให้ จึงไม่สามารถสร้าง instance
 * ที่ถูกต้องได้โดยไม่เดา behavior (ทำตามข้อกำหนดที่ 4)
 */
public class CompilerOptionsTest {

  private CompilerOptions options;

  @Before
  public void setUp() {
    options = new CompilerOptions();
  }

  // ---------------------------------------------------------------
  // Constructor default value tests
  // ---------------------------------------------------------------

  @Test
  public void testDefaultConstructor_CheckFlags() {
    assertFalse(options.skipAllPasses);
    assertFalse(options.nameAnonymousFunctionsOnly);
    assertEquals(CompilerOptions.DevMode.OFF, options.devMode);
    assertFalse(options.checkSymbols);
    assertEquals(CheckLevel.OFF, options.checkShadowVars);
    assertEquals(CheckLevel.OFF, options.aggressiveVarCheck);
    assertEquals(CheckLevel.OFF, options.checkFunctions);
    assertEquals(CheckLevel.OFF, options.checkMethods);
    assertFalse(options.checkDuplicateMessages);
    assertFalse(options.allowLegacyJsMessages);
    assertFalse(options.strictMessageReplacement);
    assertFalse(options.checkSuspiciousCode);
    assertFalse(options.checkControlStructures);
    assertEquals(CheckLevel.OFF, options.checkUndefinedProperties);
    assertFalse(options.checkUnusedPropertiesEarly);
    assertFalse(options.checkTypes);
    assertFalse(options.tightenTypes);
    assertFalse(options.inferTypesInGlobalScope);
    assertFalse(options.checkTypedPropertyCalls);
    assertEquals(CheckLevel.OFF, options.reportMissingOverride);
    assertEquals(CheckLevel.OFF, options.reportUnknownTypes);
    assertEquals(CheckLevel.OFF, options.checkRequires);
    assertEquals(CheckLevel.OFF, options.checkProvides);
    assertEquals(CheckLevel.OFF, options.checkGlobalNamesLevel);
    assertEquals(CheckLevel.ERROR, options.brokenClosureRequiresLevel);
    assertEquals(CheckLevel.OFF, options.checkGlobalThisLevel);
    assertEquals(CheckLevel.OFF, options.checkUnreachableCode);
    assertEquals(CheckLevel.OFF, options.checkMissingReturn);
    assertEquals(CheckLevel.OFF, options.checkMissingGetCssNameLevel);
    assertNull(options.checkMissingGetCssNameBlacklist);
    assertFalse(options.checkEs5Strict);
    assertFalse(options.checkCaja);
    assertFalse(options.computeFunctionSideEffects);
    assertFalse(options.chainCalls);
  }

  @Test
  public void testDefaultConstructor_OptimizationFlags() {
    assertFalse(options.foldConstants);
    assertFalse(options.removeConstantExpressions);
    assertFalse(options.coalesceVariableNames);
    assertFalse(options.deadAssignmentElimination);
    assertFalse(options.inlineConstantVars);
    assertFalse(options.inlineFunctions);
    assertFalse(options.inlineLocalFunctions);
    assertFalse(options.crossModuleCodeMotion);
    assertFalse(options.crossModuleMethodMotion);
    assertFalse(options.inlineGetters);
    assertFalse(options.inlineVariables);
    assertFalse(options.inlineLocalVariables);
    assertFalse(options.smartNameRemoval);
    assertFalse(options.removeDeadCode);
    assertFalse(options.extractPrototypeMemberDeclarations);
    assertFalse(options.removeUnusedPrototypeProperties);
    assertFalse(options.removeUnusedPrototypePropertiesInExterns);
    assertFalse(options.removeUnusedVars);
    // boundary: ค่านี้ default เป็น true ต่างจากตัวอื่น ต้องเช็คให้แน่ใจ
    assertTrue(options.removeUnusedVarsInGlobalScope);
    assertFalse(options.aliasExternals);
    assertEquals(Collections.emptySet(), options.aliasableStrings);
    assertEquals("", options.aliasStringsBlacklist);
    assertFalse(options.aliasAllStrings);
    assertFalse(options.outputJsStringUsage);
    assertFalse(options.convertToDottedProperties);
    assertFalse(options.rewriteFunctionExpressions);
    assertFalse(options.optimizeParameters);
    assertFalse(options.collapseVariableDeclarations);
    assertFalse(options.groupVariableDeclarations);
    assertFalse(options.collapseAnonymousFunctions);
  }

  @Test
  public void testDefaultConstructor_RenamingFlags() {
    assertEquals(VariableRenamingPolicy.OFF, options.variableRenaming);
    assertEquals(PropertyRenamingPolicy.OFF, options.propertyRenaming);
    assertFalse(options.labelRenaming);
    assertFalse(options.generatePseudoNames);
    assertNull(options.renamePrefix);
    assertFalse(options.aliasKeywords);
    assertFalse(options.collapseProperties);
    assertFalse(options.collapsePropertiesOnExternTypes);
    assertFalse(options.devirtualizePrototypeMethods);
    assertFalse(options.disambiguateProperties);
    assertFalse(options.ambiguateProperties);
    assertEquals(AnonymousFunctionNamingPolicy.OFF,
        options.anonymousFunctionNaming);
    assertFalse(options.exportTestFunctions);
  }

  @Test
  public void testDefaultConstructor_SpecialPurposeFlags() {
    assertFalse(options.runtimeTypeCheck);
    assertNull(options.runtimeTypeCheckLogFunction);
    assertFalse(options.instrumentForCoverage);
    assertFalse(options.instrumentForCoverageOnly);
    assertFalse(options.ignoreCajaProperties);
    assertNull(options.syntheticBlockStartMarker);
    assertNull(options.syntheticBlockEndMarker);
    assertNull(options.locale);
    assertFalse(options.markAsCompiled);
    assertFalse(options.removeTryCatchFinally);
    assertFalse(options.closurePass);
    // boundary: default true
    assertTrue(options.rewriteNewDateGoogNow);
    assertTrue(options.removeAbstractMethods);
    assertEquals(Collections.emptySet(), options.stripTypes);
    assertEquals(Collections.emptySet(), options.stripNameSuffixes);
    assertEquals(Collections.emptySet(), options.stripNamePrefixes);
    assertEquals(Collections.emptySet(), options.stripTypePrefixes);
    assertNull(options.customPasses);
    assertFalse(options.markNoSideEffectCalls);
    assertFalse(options.moveFunctionDeclarations);
    assertNull(options.instrumentationTemplate);
    assertEquals("", options.appNameStr);
    assertFalse(options.recordFunctionInformation);
    assertFalse(options.generateExports);
    assertNull(options.cssRenamingMap);
    assertFalse(options.processObjectPropertyString);
    assertEquals(Collections.emptySet(), options.idGenerators);
    assertEquals(Collections.emptyList(),
        options.replaceStringsFunctionDescriptions);
    assertEquals("", options.replaceStringsPlaceholderToken);
  }

  @Test
  public void testDefaultConstructor_OutputFlags() {
    assertFalse(options.printInputDelimiter);
    assertFalse(options.prettyPrint);
    assertFalse(options.lineBreak);
    assertNull(options.reportPath);
    assertEquals(CompilerOptions.TracerMode.OFF, options.tracer);
    assertFalse(options.shouldColorizeErrorOutput());
    assertEquals(ErrorFormat.SINGLELINE, options.errorFormat);
    assertNull(options.getWarningsGuard());
    assertNull(options.debugFunctionSideEffectsPath);
    assertEquals("", options.jsOutputFile);
    assertFalse(options.isExternExportsEnabled());
    assertNull(options.nameReferenceReportPath);
    assertNull(options.nameReferenceGraphPath);
  }

  @Test
  public void testDefaultConstructor_FieldInitializersOutsideConstructor() {
    // ค่าที่ตั้งเป็น field initializer ไม่ใช่ในตัวคอนสตรัคเตอร์
    assertEquals("// Input %num%", options.inputDelimiter);
    assertEquals(SourceMap.DetailLevel.SYMBOLS, options.sourceMapDetailLevel);
    assertEquals(1, options.summaryDetailLevel);
    assertFalse(options.manageClosureDependencies);
    assertNull(options.messageBundle);
    assertNull(options.outputCharset);
    assertNull(options.getCodingConvention());
    assertFalse(options.looseTypes); // java default (ไม่ถูกตั้งในคอนสตรัคเตอร์)
    assertFalse(options.ideMode); // java default
  }

  // ---------------------------------------------------------------
  // getDefineReplacements() branch tests
  // ---------------------------------------------------------------

  @Test
  public void testGetDefineReplacements_EmptyByDefault() {
    Map<String, Node> result = options.getDefineReplacements();
    assertNotNull(result);
    assertTrue(result.isEmpty());
  }

  @Test
  public void testGetDefineReplacements_BooleanTrueBranch() {
    options.setDefineToBooleanLiteral("FOO", true);
    Map<String, Node> result = options.getDefineReplacements();
    assertEquals(1, result.size());
    Node node = result.get("FOO");
    assertNotNull(node);
    assertEquals(Token.TRUE, node.getType());
  }

  @Test
  public void testGetDefineReplacements_BooleanFalseBranch() {
    options.setDefineToBooleanLiteral("BAR", false);
    Map<String, Node> result = options.getDefineReplacements();
    Node node = result.get("BAR");
    assertNotNull(node);
    assertEquals(Token.FALSE, node.getType());
  }

  @Test
  public void testGetDefineReplacements_IntegerBranch() {
    options.setDefineToNumberLiteral("NUM", 42);
    Map<String, Node> result = options.getDefineReplacements();
    Node node = result.get("NUM");
    assertNotNull(node);
    assertEquals(Token.NUMBER, node.getType());
    assertEquals(42.0, node.getDouble(), 0.0001);
  }

  @Test
  public void testGetDefineReplacements_IntegerBoundaryZeroAndNegative() {
    options.setDefineToNumberLiteral("ZERO", 0);
    options.setDefineToNumberLiteral("NEG", -1);
    Map<String, Node> result = options.getDefineReplacements();
    assertEquals(0.0, result.get("ZERO").getDouble(), 0.0001);
    assertEquals(-1.0, result.get("NEG").getDouble(), 0.0001);
  }

  @Test
  public void testGetDefineReplacements_DoubleBranch() {
    options.setDefineToDoubleLiteral("DBL", 3.14);
    Map<String, Node> result = options.getDefineReplacements();
    Node node = result.get("DBL");
    assertNotNull(node);
    assertEquals(Token.NUMBER, node.getType());
    assertEquals(3.14, node.getDouble(), 0.0001);
  }

  @Test
  public void testGetDefineReplacements_StringBranch() {
    options.setDefineToStringLiteral("STR", "hello");
    Map<String, Node> result = options.getDefineReplacements();
    Node node = result.get("STR");
    assertNotNull(node);
    assertEquals(Token.STRING, node.getType());
    assertEquals("hello", node.getString());
  }

  @Test
  public void testGetDefineReplacements_StringBranch_EmptyString() {
    // boundary: ค่าว่าง
    options.setDefineToStringLiteral("EMPTY", "");
    Map<String, Node> result = options.getDefineReplacements();
    Node node = result.get("EMPTY");
    assertNotNull(node);
    assertEquals(Token.STRING, node.getType());
    assertEquals("", node.getString());
  }

  @Test
  public void testGetDefineReplacements_MultipleEntries_LoopMultipleIterations() {
    options.setDefineToBooleanLiteral("B", true);
    options.setDefineToNumberLiteral("N", 5);
    options.setDefineToDoubleLiteral("D", 1.5);
    options.setDefineToStringLiteral("S", "x");

    Map<String, Node> result = options.getDefineReplacements();
    assertEquals(4, result.size());
    assertEquals(Token.TRUE, result.get("B").getType());
    assertEquals(Token.NUMBER, result.get("N").getType());
    assertEquals(Token.NUMBER, result.get("D").getType());
    assertEquals(Token.STRING, result.get("S").getType());
  }

  @Test
  public void testSetDefine_OverwriteExistingKey() {
    options.setDefineToBooleanLiteral("KEY", true);
    options.setDefineToBooleanLiteral("KEY", false);
    Map<String, Node> result = options.getDefineReplacements();
    assertEquals(1, result.size());
    assertEquals(Token.FALSE, result.get("KEY").getType());
  }

  // ---------------------------------------------------------------
  // Simple setter tests
  // ---------------------------------------------------------------

  @Test
  public void testSkipAllCompilerPasses() {
    assertFalse(options.skipAllPasses);
    options.skipAllCompilerPasses();
    assertTrue(options.skipAllPasses);
  }

  @Test
  public void testSetNameAnonymousFunctionsOnly() {
    options.setNameAnonymousFunctionsOnly(true);
    assertTrue(options.nameAnonymousFunctionsOnly);
    options.setNameAnonymousFunctionsOnly(false);
    assertFalse(options.nameAnonymousFunctionsOnly);
  }

  @Test
  public void testSetChainCalls() {
    options.setChainCalls(true);
    assertTrue(options.chainCalls);
    options.setChainCalls(false);
    assertFalse(options.chainCalls);
  }

  @Test
  public void testEnableAndDisableRuntimeTypeCheck() {
    options.enableRuntimeTypeCheck("myLogFn");
    assertTrue(options.runtimeTypeCheck);
    assertEquals("myLogFn", options.runtimeTypeCheckLogFunction);

    options.disableRuntimeTypeCheck();
    assertFalse(options.runtimeTypeCheck);
    // หมายเหตุ: source ไม่ได้ล้าง runtimeTypeCheckLogFunction ตอน disable
    assertEquals("myLogFn", options.runtimeTypeCheckLogFunction);
  }

  @Test
  public void testEnableRuntimeTypeCheck_NullLogFunction() {
    // boundary: null argument
    options.enableRuntimeTypeCheck(null);
    assertTrue(options.runtimeTypeCheck);
    assertNull(options.runtimeTypeCheckLogFunction);
  }

  @Test
  public void testSetManageClosureDependencies() {
    options.setManageClosureDependencies(true);
    assertTrue(options.manageClosureDependencies);
    options.setManageClosureDependencies(false);
    assertFalse(options.manageClosureDependencies);
  }

  @Test
  public void testSetSummaryDetailLevel_Boundaries() {
    options.setSummaryDetailLevel(0);
    assertEquals(0, options.summaryDetailLevel);
    options.setSummaryDetailLevel(3);
    assertEquals(3, options.summaryDetailLevel);
    // malformed input: ค่าลบ (ไม่มี validation ใน source แต่ต้องยืนยันว่ายัง assign)
    options.setSummaryDetailLevel(-1);
    assertEquals(-1, options.summaryDetailLevel);
  }

  @Test
  public void testExternExportsEnableDisable() {
    assertFalse(options.isExternExportsEnabled());
    options.enableExternExports(true);
    assertTrue(options.isExternExportsEnabled());
    options.enableExternExports(false);
    assertFalse(options.isExternExportsEnabled());
  }

  @Test
  public void testSetLooseTypes() {
    options.setLooseTypes(true);
    assertTrue(options.looseTypes);
    options.setLooseTypes(false);
    assertFalse(options.looseTypes);
  }

  @Test
  public void testSetColorizeErrorOutput() {
    assertFalse(options.shouldColorizeErrorOutput());
    options.setColorizeErrorOutput(true);
    assertTrue(options.shouldColorizeErrorOutput());
  }

  @Test
  public void testSetCollapsePropertiesOnExternTypes() {
    options.setCollapsePropertiesOnExternTypes(true);
    assertTrue(options.collapsePropertiesOnExternTypes);
  }

  @Test
  public void testSetProcessObjectPropertyString() {
    options.setProcessObjectPropertyString(true);
    assertTrue(options.processObjectPropertyString);
  }

  @Test
  public void testSetIdGenerators_NormalSet() {
    Set<String> input = new HashSet<String>();
    input.add("a");
    input.add("b");
    options.setIdGenerators(input);
    assertEquals(input, options.idGenerators);
    // ต้องเป็น defensive copy ไม่ใช่ reference เดียวกัน
    assertNotSame(input, options.idGenerators);
  }

  @Test
  public void testSetIdGenerators_EmptySet_Boundary() {
    Set<String> input = new HashSet<String>();
    options.setIdGenerators(input);
    assertTrue(options.idGenerators.isEmpty());
  }

  @Test
  public void testSetReplaceStringsConfiguration_NormalList() {
    List<String> descriptions = java.util.Arrays.asList("foo", "bar");
    options.setReplaceStringsConfiguration("TOKEN", descriptions);
    assertEquals("TOKEN", options.replaceStringsPlaceholderToken);
    assertEquals(descriptions, options.replaceStringsFunctionDescriptions);
    assertNotSame(descriptions, options.replaceStringsFunctionDescriptions);
  }

  @Test
  public void testSetReplaceStringsConfiguration_EmptyList_Boundary() {
    List<String> descriptions = Collections.emptyList();
    options.setReplaceStringsConfiguration("", descriptions);
    assertEquals("", options.replaceStringsPlaceholderToken);
    assertTrue(options.replaceStringsFunctionDescriptions.isEmpty());
  }

  @Test
  public void testSetRewriteNewDateGoogNow() {
    assertTrue(options.rewriteNewDateGoogNow);
    options.setRewriteNewDateGoogNow(false);
    assertFalse(options.rewriteNewDateGoogNow);
  }

  @Test
  public void testSetRemoveAbstractMethods() {
    assertTrue(options.removeAbstractMethods);
    options.setRemoveAbstractMethods(false);
    assertFalse(options.removeAbstractMethods);
  }

  @Test
  public void testSetRenamingPolicy() {
    options.setRenamingPolicy(VariableRenamingPolicy.ALL,
        PropertyRenamingPolicy.ALL_UNQUOTED);
    assertEquals(VariableRenamingPolicy.ALL, options.variableRenaming);
    assertEquals(PropertyRenamingPolicy.ALL_UNQUOTED, options.propertyRenaming);
  }

  @Test
  public void testSetCodingConvention_Null() {
    // ทดสอบเฉพาะกรณี null เพราะไม่มีซอร์สโค้ดของ CodingConvention ให้
    // เพื่อสร้าง instance จริงโดยไม่เดา behavior
    options.setCodingConvention(null);
    assertNull(options.getCodingConvention());
  }

  // ---------------------------------------------------------------
  // WarningsGuard related - only null-guard branch (safe, no API guess)
  // ---------------------------------------------------------------

  @Test
  public void testEnables_NullGuardReturnsFalse() {
    assertNull(options.getWarningsGuard());
    // short-circuit: warningsGuard != null เป็น false ทำให้ argument ไม่ถูก dereference
    assertFalse(options.enables(null));
  }

  @Test
  public void testDisables_NullGuardReturnsFalse() {
    assertNull(options.getWarningsGuard());
    assertFalse(options.disables(null));
  }
  // หมายเหตุ: branch ที่ warningsGuard != null (enables/disables/addWarningsGuard
  // ในเงื่อนไข else) ไม่ได้ทดสอบ เนื่องจากต้องสร้าง instance ของ WarningsGuard /
  // DiagnosticGroup ซึ่งไม่มีซอร์สโค้ดให้ในคำถามนี้ การเดา constructor/behavior
  // จะขัดกับข้อกำหนดที่ 4

  // ---------------------------------------------------------------
  // clone() tests
  // ---------------------------------------------------------------

  @Test
  public void testClone_CopiesFieldsAndIsDifferentInstance()
      throws CloneNotSupportedException {
    options.checkSymbols = true;
    options.prettyPrint = true;
    options.renamePrefix = "p_";
    options.setSummaryDetailLevel(2);

    CompilerOptions clone = (CompilerOptions) options.clone();

    assertNotSame(options, clone);
    assertTrue(clone.checkSymbols);
    assertTrue(clone.prettyPrint);
    assertEquals("p_", clone.renamePrefix);
    assertEquals(2, clone.summaryDetailLevel);
  }

  @Test
  public void testClone_ModifyPrimitiveOnCloneDoesNotAffectOriginal()
      throws CloneNotSupportedException {
    options.checkSymbols = false;
    CompilerOptions clone = (CompilerOptions) options.clone();
    clone.checkSymbols = true;
    assertFalse(options.checkSymbols);
    assertTrue(clone.checkSymbols);
  }

  // ---------------------------------------------------------------
  // Nested enum TracerMode.isOn() branch tests
  // ---------------------------------------------------------------

  @Test
  public void testTracerMode_Off_IsNotOn() {
    assertFalse(CompilerOptions.TracerMode.OFF.isOn());
  }

  @Test
  public void testTracerMode_All_IsOn() {
    assertTrue(CompilerOptions.TracerMode.ALL.isOn());
  }

  @Test
  public void testTracerMode_Fast_IsOn() {
    assertTrue(CompilerOptions.TracerMode.FAST.isOn());
  }

  // ---------------------------------------------------------------
  // DevMode enum sanity (no logic, just existence/usage check)
  // ---------------------------------------------------------------

  @Test
  public void testDevModeEnum_ValuesExist() {
    CompilerOptions.DevMode[] values = CompilerOptions.DevMode.values();
    assertEquals(4, values.length);
    assertEquals(CompilerOptions.DevMode.OFF, values[0]);
    assertEquals(CompilerOptions.DevMode.START, values[1]);
    assertEquals(CompilerOptions.DevMode.START_AND_END, values[2]);
    assertEquals(CompilerOptions.DevMode.EVERY_PASS, values[3]);
  }
}
