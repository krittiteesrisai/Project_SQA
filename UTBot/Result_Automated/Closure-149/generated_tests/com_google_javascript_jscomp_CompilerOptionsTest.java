package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import java.util.Set;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.List;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.jscomp.SourceMap.DetailLevel;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_CompilerOptionsTest {
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        CompilerOptions actual = ((CompilerOptions) compilerOptions.clone());
        
        CompilerOptions expected = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        boolean actualIdeMode = actual.ideMode;
        assertFalse(actualIdeMode);
        
        boolean actualSkipAllPasses = actual.skipAllPasses;
        assertFalse(actualSkipAllPasses);
        
        boolean actualNameAnonymousFunctionsOnly = actual.nameAnonymousFunctionsOnly;
        assertFalse(actualNameAnonymousFunctionsOnly);
        
        CompilerOptions.DevMode actualDevMode = actual.devMode;
        assertNull(actualDevMode);
        
        boolean actualManageClosureDependencies = actual.manageClosureDependencies;
        assertFalse(actualManageClosureDependencies);
        
        MessageBundle actualMessageBundle = actual.messageBundle;
        assertNull(actualMessageBundle);
        
        boolean actualCheckSymbols = actual.checkSymbols;
        assertFalse(actualCheckSymbols);
        
        CheckLevel actualCheckShadowVars = actual.checkShadowVars;
        assertNull(actualCheckShadowVars);
        
        CheckLevel actualAggressiveVarCheck = actual.aggressiveVarCheck;
        assertNull(actualAggressiveVarCheck);
        
        CheckLevel actualCheckFunctions = actual.checkFunctions;
        assertNull(actualCheckFunctions);
        
        CheckLevel actualCheckMethods = actual.checkMethods;
        assertNull(actualCheckMethods);
        
        boolean actualCheckDuplicateMessages = actual.checkDuplicateMessages;
        assertFalse(actualCheckDuplicateMessages);
        
        boolean actualAllowLegacyJsMessages = actual.allowLegacyJsMessages;
        assertFalse(actualAllowLegacyJsMessages);
        
        boolean actualStrictMessageReplacement = actual.strictMessageReplacement;
        assertFalse(actualStrictMessageReplacement);
        
        boolean actualCheckSuspiciousCode = actual.checkSuspiciousCode;
        assertFalse(actualCheckSuspiciousCode);
        
        boolean actualCheckControlStructures = actual.checkControlStructures;
        assertFalse(actualCheckControlStructures);
        
        CheckLevel actualCheckUndefinedProperties = actual.checkUndefinedProperties;
        assertNull(actualCheckUndefinedProperties);
        
        boolean actualCheckUnusedPropertiesEarly = actual.checkUnusedPropertiesEarly;
        assertFalse(actualCheckUnusedPropertiesEarly);
        
        boolean actualCheckTypes = actual.checkTypes;
        assertFalse(actualCheckTypes);
        
        boolean actualTightenTypes = actual.tightenTypes;
        assertFalse(actualTightenTypes);
        
        boolean actualInferTypesInGlobalScope = actual.inferTypesInGlobalScope;
        assertFalse(actualInferTypesInGlobalScope);
        
        boolean actualCheckTypedPropertyCalls = actual.checkTypedPropertyCalls;
        assertFalse(actualCheckTypedPropertyCalls);
        
        CheckLevel actualReportMissingOverride = actual.reportMissingOverride;
        assertNull(actualReportMissingOverride);
        
        CheckLevel actualReportUnknownTypes = actual.reportUnknownTypes;
        assertNull(actualReportUnknownTypes);
        
        CheckLevel actualCheckRequires = actual.checkRequires;
        assertNull(actualCheckRequires);
        
        CheckLevel actualCheckProvides = actual.checkProvides;
        assertNull(actualCheckProvides);
        
        CheckLevel actualCheckGlobalNamesLevel = actual.checkGlobalNamesLevel;
        assertNull(actualCheckGlobalNamesLevel);
        
        CheckLevel actualBrokenClosureRequiresLevel = actual.brokenClosureRequiresLevel;
        assertNull(actualBrokenClosureRequiresLevel);
        
        CheckLevel actualCheckGlobalThisLevel = actual.checkGlobalThisLevel;
        assertNull(actualCheckGlobalThisLevel);
        
        CheckLevel actualCheckMissingGetCssNameLevel = actual.checkMissingGetCssNameLevel;
        assertNull(actualCheckMissingGetCssNameLevel);
        
        String actualCheckMissingGetCssNameBlacklist = actual.checkMissingGetCssNameBlacklist;
        assertNull(actualCheckMissingGetCssNameBlacklist);
        
        boolean actualCheckEs5Strict = actual.checkEs5Strict;
        assertFalse(actualCheckEs5Strict);
        
        boolean actualCheckCaja = actual.checkCaja;
        assertFalse(actualCheckCaja);
        
        boolean actualFoldConstants = actual.foldConstants;
        assertFalse(actualFoldConstants);
        
        boolean actualRemoveConstantExpressions = actual.removeConstantExpressions;
        assertFalse(actualRemoveConstantExpressions);
        
        boolean actualDeadAssignmentElimination = actual.deadAssignmentElimination;
        assertFalse(actualDeadAssignmentElimination);
        
        boolean actualInlineConstantVars = actual.inlineConstantVars;
        assertFalse(actualInlineConstantVars);
        
        boolean actualInlineFunctions = actual.inlineFunctions;
        assertFalse(actualInlineFunctions);
        
        boolean actualDecomposeExpressions = actual.decomposeExpressions;
        assertFalse(actualDecomposeExpressions);
        
        boolean actualInlineAnonymousFunctionExpressions = actual.inlineAnonymousFunctionExpressions;
        assertFalse(actualInlineAnonymousFunctionExpressions);
        
        boolean actualInlineLocalFunctions = actual.inlineLocalFunctions;
        assertFalse(actualInlineLocalFunctions);
        
        boolean actualCrossModuleCodeMotion = actual.crossModuleCodeMotion;
        assertFalse(actualCrossModuleCodeMotion);
        
        boolean actualCoalesceVariableNames = actual.coalesceVariableNames;
        assertFalse(actualCoalesceVariableNames);
        
        boolean actualCrossModuleMethodMotion = actual.crossModuleMethodMotion;
        assertFalse(actualCrossModuleMethodMotion);
        
        boolean actualInlineGetters = actual.inlineGetters;
        assertFalse(actualInlineGetters);
        
        boolean actualInlineVariables = actual.inlineVariables;
        assertFalse(actualInlineVariables);
        
        boolean actualInlineLocalVariables = actual.inlineLocalVariables;
        assertFalse(actualInlineLocalVariables);
        
        boolean actualFlowSensitiveInlineVariables = actual.flowSensitiveInlineVariables;
        assertFalse(actualFlowSensitiveInlineVariables);
        
        boolean actualSmartNameRemoval = actual.smartNameRemoval;
        assertFalse(actualSmartNameRemoval);
        
        boolean actualRemoveDeadCode = actual.removeDeadCode;
        assertFalse(actualRemoveDeadCode);
        
        CheckLevel actualCheckUnreachableCode = actual.checkUnreachableCode;
        assertNull(actualCheckUnreachableCode);
        
        CheckLevel actualCheckMissingReturn = actual.checkMissingReturn;
        assertNull(actualCheckMissingReturn);
        
        boolean actualExtractPrototypeMemberDeclarations = actual.extractPrototypeMemberDeclarations;
        assertFalse(actualExtractPrototypeMemberDeclarations);
        
        boolean actualRemoveEmptyFunctions = actual.removeEmptyFunctions;
        assertFalse(actualRemoveEmptyFunctions);
        
        boolean actualRemoveUnusedPrototypeProperties = actual.removeUnusedPrototypeProperties;
        assertFalse(actualRemoveUnusedPrototypeProperties);
        
        boolean actualRemoveUnusedPrototypePropertiesInExterns = actual.removeUnusedPrototypePropertiesInExterns;
        assertFalse(actualRemoveUnusedPrototypePropertiesInExterns);
        
        boolean actualRemoveUnusedVars = actual.removeUnusedVars;
        assertFalse(actualRemoveUnusedVars);
        
        boolean actualRemoveUnusedVarsInGlobalScope = actual.removeUnusedVarsInGlobalScope;
        assertFalse(actualRemoveUnusedVarsInGlobalScope);
        
        boolean actualAliasExternals = actual.aliasExternals;
        assertFalse(actualAliasExternals);
        
        String actualAliasableGlobals = actual.aliasableGlobals;
        assertNull(actualAliasableGlobals);
        
        String actualUnaliasableGlobals = actual.unaliasableGlobals;
        assertNull(actualUnaliasableGlobals);
        
        boolean actualCollapseVariableDeclarations = actual.collapseVariableDeclarations;
        assertFalse(actualCollapseVariableDeclarations);
        
        boolean actualGroupVariableDeclarations = actual.groupVariableDeclarations;
        assertFalse(actualGroupVariableDeclarations);
        
        boolean actualCollapseAnonymousFunctions = actual.collapseAnonymousFunctions;
        assertFalse(actualCollapseAnonymousFunctions);
        
        Set actualAliasableStrings = actual.aliasableStrings;
        assertNull(actualAliasableStrings);
        
        String actualAliasStringsBlacklist = actual.aliasStringsBlacklist;
        assertNull(actualAliasStringsBlacklist);
        
        boolean actualAliasAllStrings = actual.aliasAllStrings;
        assertFalse(actualAliasAllStrings);
        
        boolean actualOutputJsStringUsage = actual.outputJsStringUsage;
        assertFalse(actualOutputJsStringUsage);
        
        boolean actualConvertToDottedProperties = actual.convertToDottedProperties;
        assertFalse(actualConvertToDottedProperties);
        
        boolean actualRewriteFunctionExpressions = actual.rewriteFunctionExpressions;
        assertFalse(actualRewriteFunctionExpressions);
        
        boolean actualOptimizeParameters = actual.optimizeParameters;
        assertFalse(actualOptimizeParameters);
        
        boolean actualOptimizeArgumentsArray = actual.optimizeArgumentsArray;
        assertFalse(actualOptimizeArgumentsArray);
        
        boolean actualChainCalls = actual.chainCalls;
        assertFalse(actualChainCalls);
        
        VariableRenamingPolicy actualVariableRenaming = actual.variableRenaming;
        assertNull(actualVariableRenaming);
        
        PropertyRenamingPolicy actualPropertyRenaming = actual.propertyRenaming;
        assertNull(actualPropertyRenaming);
        
        boolean actualLabelRenaming = actual.labelRenaming;
        assertFalse(actualLabelRenaming);
        
        boolean actualReserveRawExports = actual.reserveRawExports;
        assertFalse(actualReserveRawExports);
        
        boolean actualGeneratePseudoNames = actual.generatePseudoNames;
        assertFalse(actualGeneratePseudoNames);
        
        String actualRenamePrefix = actual.renamePrefix;
        assertNull(actualRenamePrefix);
        
        boolean actualAliasKeywords = actual.aliasKeywords;
        assertFalse(actualAliasKeywords);
        
        boolean actualCollapseProperties = actual.collapseProperties;
        assertFalse(actualCollapseProperties);
        
        boolean actualCollapsePropertiesOnExternTypes = actual.collapsePropertiesOnExternTypes;
        assertFalse(actualCollapsePropertiesOnExternTypes);
        
        boolean actualDevirtualizePrototypeMethods = actual.devirtualizePrototypeMethods;
        assertFalse(actualDevirtualizePrototypeMethods);
        
        boolean actualComputeFunctionSideEffects = actual.computeFunctionSideEffects;
        assertFalse(actualComputeFunctionSideEffects);
        
        String actualDebugFunctionSideEffectsPath = actual.debugFunctionSideEffectsPath;
        assertNull(actualDebugFunctionSideEffectsPath);
        
        boolean actualDisambiguateProperties = actual.disambiguateProperties;
        assertFalse(actualDisambiguateProperties);
        
        boolean actualAmbiguateProperties = actual.ambiguateProperties;
        assertFalse(actualAmbiguateProperties);
        
        AnonymousFunctionNamingPolicy actualAnonymousFunctionNaming = actual.anonymousFunctionNaming;
        assertNull(actualAnonymousFunctionNaming);
        
        byte[] actualInputVariableMapSerialized = actual.inputVariableMapSerialized;
        assertNull(actualInputVariableMapSerialized);
        
        byte[] actualInputPropertyMapSerialized = actual.inputPropertyMapSerialized;
        assertNull(actualInputPropertyMapSerialized);
        
        boolean actualExportTestFunctions = actual.exportTestFunctions;
        assertFalse(actualExportTestFunctions);
        
        boolean actualRuntimeTypeCheck = actual.runtimeTypeCheck;
        assertFalse(actualRuntimeTypeCheck);
        
        String actualRuntimeTypeCheckLogFunction = actual.runtimeTypeCheckLogFunction;
        assertNull(actualRuntimeTypeCheckLogFunction);
        
        CodingConvention actualCodingConvention = actual.getCodingConvention();
        assertNull(actualCodingConvention);
        
        boolean actualInstrumentForCoverage = actual.instrumentForCoverage;
        assertFalse(actualInstrumentForCoverage);
        
        boolean actualInstrumentForCoverageOnly = actual.instrumentForCoverageOnly;
        assertFalse(actualInstrumentForCoverageOnly);
        
        boolean actualIgnoreCajaProperties = actual.ignoreCajaProperties;
        assertFalse(actualIgnoreCajaProperties);
        
        String actualSyntheticBlockStartMarker = actual.syntheticBlockStartMarker;
        assertNull(actualSyntheticBlockStartMarker);
        
        String actualSyntheticBlockEndMarker = actual.syntheticBlockEndMarker;
        assertNull(actualSyntheticBlockEndMarker);
        
        String actualLocale = actual.locale;
        assertNull(actualLocale);
        
        boolean actualMarkAsCompiled = actual.markAsCompiled;
        assertFalse(actualMarkAsCompiled);
        
        boolean actualRemoveTryCatchFinally = actual.removeTryCatchFinally;
        assertFalse(actualRemoveTryCatchFinally);
        
        boolean actualClosurePass = actual.closurePass;
        assertFalse(actualClosurePass);
        
        boolean actualRewriteNewDateGoogNow = actual.rewriteNewDateGoogNow;
        assertFalse(actualRewriteNewDateGoogNow);
        
        boolean actualRemoveAbstractMethods = actual.removeAbstractMethods;
        assertFalse(actualRemoveAbstractMethods);
        
        boolean actualGatherCssNames = actual.gatherCssNames;
        assertFalse(actualGatherCssNames);
        
        Set actualStripTypes = actual.stripTypes;
        assertNull(actualStripTypes);
        
        Set actualStripNameSuffixes = actual.stripNameSuffixes;
        assertNull(actualStripNameSuffixes);
        
        Set actualStripNamePrefixes = actual.stripNamePrefixes;
        assertNull(actualStripNamePrefixes);
        
        Set actualStripTypePrefixes = actual.stripTypePrefixes;
        assertNull(actualStripTypePrefixes);
        
        Multimap actualCustomPasses = actual.customPasses;
        assertNull(actualCustomPasses);
        
        boolean actualMarkNoSideEffectCalls = actual.markNoSideEffectCalls;
        assertFalse(actualMarkNoSideEffectCalls);
        
        Map actualDefineReplacements = actual.getDefineReplacements();
        assertNull(actualDefineReplacements);
        
        boolean actualMoveFunctionDeclarations = actual.moveFunctionDeclarations;
        assertFalse(actualMoveFunctionDeclarations);
        
        String actualInstrumentationTemplate = actual.instrumentationTemplate;
        assertNull(actualInstrumentationTemplate);
        
        String actualAppNameStr = actual.appNameStr;
        assertNull(actualAppNameStr);
        
        boolean actualRecordFunctionInformation = actual.recordFunctionInformation;
        assertFalse(actualRecordFunctionInformation);
        
        boolean actualGenerateExports = actual.generateExports;
        assertFalse(actualGenerateExports);
        
        CssRenamingMap actualCssRenamingMap = actual.cssRenamingMap;
        assertNull(actualCssRenamingMap);
        
        boolean actualProcessObjectPropertyString = actual.processObjectPropertyString;
        assertFalse(actualProcessObjectPropertyString);
        
        Set actualIdGenerators = actual.idGenerators;
        assertNull(actualIdGenerators);
        
        List actualReplaceStringsFunctionDescriptions = actual.replaceStringsFunctionDescriptions;
        assertNull(actualReplaceStringsFunctionDescriptions);
        
        String actualReplaceStringsPlaceholderToken = actual.replaceStringsPlaceholderToken;
        assertNull(actualReplaceStringsPlaceholderToken);
        
        boolean actualPrettyPrint = actual.prettyPrint;
        assertFalse(actualPrettyPrint);
        
        boolean actualLineBreak = actual.lineBreak;
        assertFalse(actualLineBreak);
        
        boolean actualPrintInputDelimiter = actual.printInputDelimiter;
        assertFalse(actualPrintInputDelimiter);
        
        String actualInputDelimiter = actual.inputDelimiter;
        assertNull(actualInputDelimiter);
        
        String actualReportPath = actual.reportPath;
        assertNull(actualReportPath);
        
        CompilerOptions.TracerMode actualTracer = actual.tracer;
        assertNull(actualTracer);
        
        boolean actualColorizeErrorOutput = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.CompilerOptions", "colorizeErrorOutput"));
        assertFalse(actualColorizeErrorOutput);
        
        ErrorFormat actualErrorFormat = actual.errorFormat;
        assertNull(actualErrorFormat);
        
        String actualJsOutputFile = actual.jsOutputFile;
        assertNull(actualJsOutputFile);
        
        ComposeWarningsGuard actualWarningsGuard = ((ComposeWarningsGuard) getFieldValue(actual, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard"));
        assertNull(actualWarningsGuard);
        
        int expectedSummaryDetailLevel = expected.summaryDetailLevel;
        int actualSummaryDetailLevel = actual.summaryDetailLevel;
        assertEquals(expectedSummaryDetailLevel, actualSummaryDetailLevel);
        
        boolean actualExternExports = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.CompilerOptions", "externExports"));
        assertFalse(actualExternExports);
        
        String actualExternExportsPath = actual.externExportsPath;
        assertNull(actualExternExportsPath);
        
        String actualNameReferenceReportPath = actual.nameReferenceReportPath;
        assertNull(actualNameReferenceReportPath);
        
        String actualNameReferenceGraphPath = actual.nameReferenceGraphPath;
        assertNull(actualNameReferenceGraphPath);
        
        String actualSourceMapOutputPath = actual.sourceMapOutputPath;
        assertNull(actualSourceMapOutputPath);
        
        SourceMap.DetailLevel actualSourceMapDetailLevel = actual.sourceMapDetailLevel;
        assertNull(actualSourceMapDetailLevel);
        
        Charset actualOutputCharset = actual.outputCharset;
        assertNull(actualOutputCharset);
        
        boolean actualLooseTypes = actual.looseTypes;
        assertFalse(actualLooseTypes);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.isExternExportsEnabled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExternExportsEnabled()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#isExternExportsEnabled()}
 * @utbot.returnsFrom {@code return externExports;}
 *  */
    @Test
    public void testIsExternExportsEnabled_ReturnExternExports() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        boolean actual = compilerOptions.isExternExportsEnabled();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.getDefineReplacements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefineReplacements()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#getDefineReplacements()}
 * @utbot.invokes {@link com.google.common.collect.Maps#newHashMap()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return map;}
 *  */
    @Test
    public void testGetDefineReplacements_SetIterator() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        LinkedHashMap defineReplacements = new LinkedHashMap();
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "defineReplacements", defineReplacements);
        
        HashMap actual = ((HashMap) compilerOptions.getDefineReplacements());
        
        HashMap expected = new HashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefineReplacements()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#getDefineReplacements()}
 * @utbot.invokes {@link com.google.common.collect.Maps#newHashMap()}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Map.Entry<String, Object> entry: defineReplacements.entrySet())
 *  */
    @Test
    public void testGetDefineReplacements_ThrowNullPointerException() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.getDefineReplacements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CompilerOptions.getDefineReplacements(CompilerOptions.java:738) */
        compilerOptions.getDefineReplacements();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDefineReplacements()
    
    @Test(expected = IllegalStateException.class)
    public void testGetDefineReplacements1() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        LinkedHashMap defineReplacements = new LinkedHashMap();
        String string = "";
        Object object = createInstance("java.lang.Object");
        defineReplacements.put(string, object);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "defineReplacements", defineReplacements);
        
        compilerOptions.getDefineReplacements();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setDefineToNumberLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefineToNumberLiteral(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setDefineToNumberLiteral(java.lang.String,int)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetDefineToNumberLiteral_MapPut() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        LinkedHashMap defineReplacements = new LinkedHashMap();
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "defineReplacements", defineReplacements);
        String string = "";
        
        compilerOptions.setDefineToNumberLiteral(string, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefineToNumberLiteral(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setDefineToNumberLiteral(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defineReplacements.put(defineName, new Integer(value));
 *  */
    @Test
    public void testSetDefineToNumberLiteral_ThrowNullPointerException() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.setDefineToNumberLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CompilerOptions.setDefineToNumberLiteral(CompilerOptions.java:777) */
        compilerOptions.setDefineToNumberLiteral(null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setDefineToBooleanLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefineToBooleanLiteral(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setDefineToBooleanLiteral(java.lang.String,boolean)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetDefineToBooleanLiteral_MapPut() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        LinkedHashMap defineReplacements = new LinkedHashMap();
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "defineReplacements", defineReplacements);
        String string = "";
        
        compilerOptions.setDefineToBooleanLiteral(string, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefineToBooleanLiteral(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setDefineToBooleanLiteral(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defineReplacements.put(defineName, new Boolean(value));
 *  */
    @Test
    public void testSetDefineToBooleanLiteral_ThrowNullPointerException() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.setDefineToBooleanLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CompilerOptions.setDefineToBooleanLiteral(CompilerOptions.java:761) */
        compilerOptions.setDefineToBooleanLiteral(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setProcessObjectPropertyString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setProcessObjectPropertyString(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setProcessObjectPropertyString(boolean)}
 *  */
    @Test
    public void testSetProcessObjectPropertyString() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setProcessObjectPropertyString(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setRemoveAbstractMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRemoveAbstractMethods(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setRemoveAbstractMethods(boolean)}
 *  */
    @Test
    public void testSetRemoveAbstractMethods() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setRemoveAbstractMethods(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setRewriteNewDateGoogNow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRewriteNewDateGoogNow(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setRewriteNewDateGoogNow(boolean)}
 *  */
    @Test
    public void testSetRewriteNewDateGoogNow() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setRewriteNewDateGoogNow(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setDefineToDoubleLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefineToDoubleLiteral(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setDefineToDoubleLiteral(java.lang.String,double)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetDefineToDoubleLiteral_MapPut() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        LinkedHashMap defineReplacements = new LinkedHashMap();
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "defineReplacements", defineReplacements);
        String string = "";
        
        compilerOptions.setDefineToDoubleLiteral(string, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefineToDoubleLiteral(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setDefineToDoubleLiteral(java.lang.String,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defineReplacements.put(defineName, new Double(value));
 *  */
    @Test
    public void testSetDefineToDoubleLiteral_ThrowNullPointerException() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.setDefineToDoubleLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CompilerOptions.setDefineToDoubleLiteral(CompilerOptions.java:785) */
        compilerOptions.setDefineToDoubleLiteral(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setColorizeErrorOutput
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setColorizeErrorOutput(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setColorizeErrorOutput(boolean)}
 *  */
    @Test
    public void testSetColorizeErrorOutput() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setColorizeErrorOutput(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.shouldColorizeErrorOutput
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldColorizeErrorOutput()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#shouldColorizeErrorOutput()}
 * @utbot.returnsFrom {@code return colorizeErrorOutput;}
 *  */
    @Test
    public void testShouldColorizeErrorOutput_ReturnColorizeErrorOutput() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        boolean actual = compilerOptions.shouldColorizeErrorOutput();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.enableRuntimeTypeCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enableRuntimeTypeCheck(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#enableRuntimeTypeCheck(java.lang.String)}
 *  */
    @Test
    public void testEnableRuntimeTypeCheck() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.enableRuntimeTypeCheck(null);
        
        boolean finalCompilerOptionsRuntimeTypeCheck = compilerOptions.runtimeTypeCheck;
        
        assertTrue(finalCompilerOptionsRuntimeTypeCheck);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setCodingConvention
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCodingConvention(com.google.javascript.jscomp.CodingConvention)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setCodingConvention(com.google.javascript.jscomp.CodingConvention)}
 *  */
    @Test
    public void testSetCodingConvention() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setCodingConvention(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setNameAnonymousFunctionsOnly
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNameAnonymousFunctionsOnly(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setNameAnonymousFunctionsOnly(boolean)}
 *  */
    @Test
    public void testSetNameAnonymousFunctionsOnly() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setNameAnonymousFunctionsOnly(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.disableRuntimeTypeCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method disableRuntimeTypeCheck()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#disableRuntimeTypeCheck()}
 *  */
    @Test
    public void testDisableRuntimeTypeCheck() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.disableRuntimeTypeCheck();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.getCodingConvention
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCodingConvention()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#getCodingConvention()}
 * @utbot.returnsFrom {@code return codingConvention;}
 *  */
    @Test
    public void testGetCodingConvention_ReturnCodingConvention() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        CodingConvention actual = compilerOptions.getCodingConvention();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setCollapsePropertiesOnExternTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCollapsePropertiesOnExternTypes(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setCollapsePropertiesOnExternTypes(boolean)}
 *  */
    @Test
    public void testSetCollapsePropertiesOnExternTypes() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setCollapsePropertiesOnExternTypes(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setReplaceStringsConfiguration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setReplaceStringsConfiguration(java.lang.String, java.util.List)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setReplaceStringsConfiguration(java.lang.String,java.util.List)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Iterable)}
 *  */
    @Test
    public void testSetReplaceStringsConfiguration_ListsNewArrayList() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String replaceStringsPlaceholderToken = "";
        compilerOptions.replaceStringsPlaceholderToken = replaceStringsPlaceholderToken;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        compilerOptions.setReplaceStringsConfiguration(null, arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setReplaceStringsConfiguration(java.lang.String, java.util.List)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setReplaceStringsConfiguration(java.lang.String,java.util.List)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Iterable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Lists.newArrayList(functionDescriptors)
 *  */
    @Test(expected = NullPointerException.class)
    public void testSetReplaceStringsConfiguration_ThrowNullPointerException() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setReplaceStringsConfiguration(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setManageClosureDependencies
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setManageClosureDependencies(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setManageClosureDependencies(boolean)}
 *  */
    @Test
    public void testSetManageClosureDependencies() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setManageClosureDependencies(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setSummaryDetailLevel
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSummaryDetailLevel(int)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setSummaryDetailLevel(int)}
 *  */
    @Test
    public void testSetSummaryDetailLevel() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compilerOptions.summaryDetailLevel = -255;
        
        compilerOptions.setSummaryDetailLevel(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.enableExternExports
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enableExternExports(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#enableExternExports(boolean)}
 *  */
    @Test
    public void testEnableExternExports() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.enableExternExports(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setDefineToStringLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDefineToStringLiteral(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setDefineToStringLiteral(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetDefineToStringLiteral_MapPut() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        LinkedHashMap defineReplacements = new LinkedHashMap();
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "defineReplacements", defineReplacements);
        
        compilerOptions.setDefineToStringLiteral(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setDefineToStringLiteral(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setDefineToStringLiteral(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: defineReplacements.put(defineName, value);
 *  */
    @Test
    public void testSetDefineToStringLiteral_ThrowNullPointerException() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.setDefineToStringLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CompilerOptions.setDefineToStringLiteral(CompilerOptions.java:769) */
        compilerOptions.setDefineToStringLiteral(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.skipAllCompilerPasses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipAllCompilerPasses()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#skipAllCompilerPasses()}
 *  */
    @Test
    public void testSkipAllCompilerPasses() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.skipAllCompilerPasses();
        
        boolean finalCompilerOptionsSkipAllPasses = compilerOptions.skipAllPasses;
        
        assertTrue(finalCompilerOptionsSkipAllPasses);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.addWarningsGuard
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)}
 *  */
    @Test
    public void testAddWarningsGuard() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        ComposeWarningsGuard composeWarningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        setField(composeWarningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        
        compilerOptions.addWarningsGuard(composeWarningsGuard);
    }
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)}
 *  */
    @Test
    public void testAddWarningsGuard_1() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        ComposeWarningsGuard composeWarningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        ComposeWarningsGuard composeWarningsGuard1 = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards1 = new ArrayList();
        setField(composeWarningsGuard1, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards1);
        guards.add(composeWarningsGuard1);
        setField(composeWarningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        
        compilerOptions.addWarningsGuard(composeWarningsGuard);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: warningsGuard.addGuard(guard);
 *  */
    @Test
    public void testAddWarningsGuard_ThrowNullPointerException() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        ComposeWarningsGuard composeWarningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.addWarningsGuard] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ComposeWarningsGuard.addGuards(ComposeWarningsGuard.java:68)
            com.google.javascript.jscomp.ComposeWarningsGuard.addGuard(ComposeWarningsGuard.java:57)
            com.google.javascript.jscomp.CompilerOptions.addWarningsGuard(CompilerOptions.java:829) */
        compilerOptions.addWarningsGuard(composeWarningsGuard);
    }
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddWarningsGuard_ThrowNullPointerException_1() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        ComposeWarningsGuard composeWarningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        ComposeWarningsGuard composeWarningsGuard1 = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        guards.add(composeWarningsGuard1);
        guards.add(null);
        guards.add(null);
        guards.add(null);
        guards.add(null);
        guards.add(null);
        guards.add(null);
        guards.add(null);
        guards.add(null);
        guards.add(null);
        setField(composeWarningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.addWarningsGuard] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ComposeWarningsGuard.addGuards(ComposeWarningsGuard.java:68)
            com.google.javascript.jscomp.ComposeWarningsGuard.addGuard(ComposeWarningsGuard.java:57)
            com.google.javascript.jscomp.ComposeWarningsGuard.addGuards(ComposeWarningsGuard.java:69)
            com.google.javascript.jscomp.ComposeWarningsGuard.addGuard(ComposeWarningsGuard.java:57)
            com.google.javascript.jscomp.CompilerOptions.addWarningsGuard(CompilerOptions.java:829) */
        compilerOptions.addWarningsGuard(composeWarningsGuard);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CompilerOptions}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)}
     */
    @Test
    public void testAddWarningsGuard1() {
        CompilerOptions compilerOptions = new CompilerOptions();
        compilerOptions.removeTryCatchFinally = true;
        compilerOptions.groupVariableDeclarations = true;
        CheckLevel checkProvides = CheckLevel.WARNING;
        compilerOptions.checkProvides = checkProvides;
        compilerOptions.manageClosureDependencies = true;
        compilerOptions.renamePrefix = "abc";
        compilerOptions.checkUndefinedProperties = checkProvides;
        CheckLevel checkRequires = CheckLevel.ERROR;
        compilerOptions.checkRequires = checkRequires;
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        compilerOptions.tracer = tracer;
        compilerOptions.appNameStr = "#$\\\"'";
        compilerOptions.crossModuleCodeMotion = true;
        
        compilerOptions.addWarningsGuard(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.getWarningsGuard
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWarningsGuard()
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#getWarningsGuard()}
 * @utbot.returnsFrom {@code return warningsGuard;}
 *  */
    @Test
    public void testGetWarningsGuard_ReturnWarningsGuard() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        WarningsGuard actual = compilerOptions.getWarningsGuard();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setChainCalls
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setChainCalls(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setChainCalls(boolean)}
 *  */
    @Test
    public void testSetChainCalls() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setChainCalls(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.disables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method disables(com.google.javascript.jscomp.DiagnosticGroup)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#disables(com.google.javascript.jscomp.DiagnosticGroup)}
 * @utbot.returnsFrom {@code return warningsGuard != null && warningsGuard.disables(type);}
 *  */
    @Test
    public void testDisables_WarningsGuardEqualsNullAndWarningsGuardDisables() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        boolean actual = compilerOptions.disables(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#disables(com.google.javascript.jscomp.DiagnosticGroup)}
 * @utbot.invokes {@link com.google.javascript.jscomp.ComposeWarningsGuard#disables(com.google.javascript.jscomp.DiagnosticGroup)}
 * @utbot.returnsFrom {@code return warningsGuard != null && warningsGuard.disables(type);}
 *  */
    @Test
    public void testDisables_WarningsGuardNotEqualsNullAndWarningsGuardDisables() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        
        boolean actual = compilerOptions.disables(diagnosticGroup);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method disables(com.google.javascript.jscomp.DiagnosticGroup)
    
    @Test
    public void testDisables1() throws Exception  {
        Class diagnosticGroupClazz = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Map prevSingletons = ((Map) getStaticFieldValue(diagnosticGroupClazz, "singletons"));
        try {
            LinkedHashMap singletons = new LinkedHashMap();
            setStaticField(diagnosticGroupClazz, "singletons", singletons);
            CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
            setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
            DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
            LinkedHashSet types = new LinkedHashSet();
            DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            types.add(diagnosticType);
            setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
            
            /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.disables] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.ComposeWarningsGuard.disables(ComposeWarningsGuard.java:90)
                com.google.javascript.jscomp.CompilerOptions.disables(CompilerOptions.java:808) */
            compilerOptions.disables(diagnosticGroup);
        } finally {
            setStaticField(DiagnosticGroup.class, "singletons", prevSingletons);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method disables(com.google.javascript.jscomp.DiagnosticGroup)
    
    @Test(expected = NullPointerException.class)
    public void testDisables2() throws Exception  {
        Class diagnosticGroupClazz = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Map prevSingletons = ((Map) getStaticFieldValue(diagnosticGroupClazz, "singletons"));
        try {
            LinkedHashMap singletons = new LinkedHashMap();
            setStaticField(diagnosticGroupClazz, "singletons", singletons);
            CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
            setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
            DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
            LinkedHashSet types = new LinkedHashSet();
            types.add(null);
            setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
            
            compilerOptions.disables(diagnosticGroup);
        } finally {
            setStaticField(DiagnosticGroup.class, "singletons", prevSingletons);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setRenamingPolicy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRenamingPolicy(com.google.javascript.jscomp.VariableRenamingPolicy, com.google.javascript.jscomp.PropertyRenamingPolicy)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setRenamingPolicy(com.google.javascript.jscomp.VariableRenamingPolicy,com.google.javascript.jscomp.PropertyRenamingPolicy)}
 *  */
    @Test
    public void testSetRenamingPolicy() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setRenamingPolicy(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setIdGenerators
    
    ///region FUZZER: ERROR SUITE for method setIdGenerators(java.util.Set)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CompilerOptions}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setIdGenerators(java.util.Set)}
     */
    @Test
    public void testSetIdGeneratorsThrowsNPE() {
        CompilerOptions compilerOptions = new CompilerOptions();
        compilerOptions.removeTryCatchFinally = true;
        compilerOptions.groupVariableDeclarations = true;
        CheckLevel checkProvides = CheckLevel.WARNING;
        compilerOptions.checkProvides = checkProvides;
        compilerOptions.manageClosureDependencies = true;
        compilerOptions.renamePrefix = "abc";
        compilerOptions.checkUndefinedProperties = checkProvides;
        CheckLevel checkRequires = CheckLevel.ERROR;
        compilerOptions.checkRequires = checkRequires;
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        compilerOptions.tracer = tracer;
        compilerOptions.appNameStr = "#$\\\"'";
        compilerOptions.crossModuleCodeMotion = true;
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.setIdGenerators] produces [java.lang.NullPointerException]
            com.google.common.collect.Sets.newHashSet(Sets.java:217)
            com.google.javascript.jscomp.CompilerOptions.setIdGenerators(CompilerOptions.java:864) */
        compilerOptions.setIdGenerators(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setIdGenerators(java.util.Set)
    
    @Test
    public void testSetIdGenerators1() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        compilerOptions.setIdGenerators(linkedHashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.setLooseTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLooseTypes(boolean)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#setLooseTypes(boolean)}
 *  */
    @Test
    public void testSetLooseTypes() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compilerOptions.setLooseTypes(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CompilerOptions.enables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enables(com.google.javascript.jscomp.DiagnosticGroup)
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#enables(com.google.javascript.jscomp.DiagnosticGroup)}
 * @utbot.returnsFrom {@code return warningsGuard != null && warningsGuard.enables(type);}
 *  */
    @Test
    public void testEnables_WarningsGuardEqualsNullAndWarningsGuardEnables() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        boolean actual = compilerOptions.enables(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#enables(com.google.javascript.jscomp.DiagnosticGroup)}
 * @utbot.returnsFrom {@code return warningsGuard != null && warningsGuard.enables(type);}
 *  */
    @Test
    public void testEnables_WarningsGuardNotEqualsNullAndWarningsGuardEnables() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        
        boolean actual = compilerOptions.enables(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CompilerOptions}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CompilerOptions#enables(com.google.javascript.jscomp.DiagnosticGroup)}
 * @utbot.returnsFrom {@code return warningsGuard != null && warningsGuard.enables(type);}
 *  */
    @Test
    public void testEnables_WarningsGuardNotEqualsNullAndWarningsGuardEnables_1() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard = ((DiagnosticGroupWarningsGuard) createInstance("com.google.javascript.jscomp.DiagnosticGroupWarningsGuard"));
        CheckLevel level = CheckLevel.OFF;
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "level", level);
        guards.add(diagnosticGroupWarningsGuard);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        
        boolean actual = compilerOptions.enables(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method enables(com.google.javascript.jscomp.DiagnosticGroup)
    
    @Test
    public void testEnables1() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard = ((DiagnosticGroupWarningsGuard) createInstance("com.google.javascript.jscomp.DiagnosticGroupWarningsGuard"));
        DiagnosticGroup group = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        types.add(null);
        setField(group, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "group", group);
        CheckLevel level = CheckLevel.ERROR;
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "level", level);
        guards.add(diagnosticGroupWarningsGuard);
        guards.add(null);
        guards.add(null);
        guards.add(null);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        
        boolean actual = compilerOptions.enables(diagnosticGroup);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method enables(com.google.javascript.jscomp.DiagnosticGroup)
    
    @Test(expected = StackOverflowError.class)
    public void testEnables2() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        ComposeWarningsGuard composeWarningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(composeWarningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        guards.add(composeWarningsGuard);
        guards.add(null);
        guards.add(null);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        
        compilerOptions.enables(null);
    }
    
    @Test
    public void testEnables3() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard = ((DiagnosticGroupWarningsGuard) createInstance("com.google.javascript.jscomp.DiagnosticGroupWarningsGuard"));
        CheckLevel level = CheckLevel.OFF;
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "level", level);
        guards.add(diagnosticGroupWarningsGuard);
        guards.add(null);
        guards.add(null);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.enables] produces [java.lang.NullPointerException] */
        compilerOptions.enables(diagnosticGroup);
    }
    
    @Test
    public void testEnables4() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard = ((DiagnosticGroupWarningsGuard) createInstance("com.google.javascript.jscomp.DiagnosticGroupWarningsGuard"));
        CheckLevel level = CheckLevel.OFF;
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "level", level);
        guards.add(diagnosticGroupWarningsGuard);
        guards.add(null);
        guards.add(null);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.enables] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ComposeWarningsGuard.enables(ComposeWarningsGuard.java:111)
            com.google.javascript.jscomp.CompilerOptions.enables(CompilerOptions.java:800) */
        compilerOptions.enables(diagnosticGroup);
    }
    
    @Test
    public void testEnables5() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard = ((DiagnosticGroupWarningsGuard) createInstance("com.google.javascript.jscomp.DiagnosticGroupWarningsGuard"));
        CheckLevel level = CheckLevel.WARNING;
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "level", level);
        guards.add(diagnosticGroupWarningsGuard);
        guards.add(null);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        types.add(diagnosticType);
        types.add(null);
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.enables] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DiagnosticGroupWarningsGuard.enables(DiagnosticGroupWarningsGuard.java:50)
            com.google.javascript.jscomp.ComposeWarningsGuard.enables(ComposeWarningsGuard.java:111)
            com.google.javascript.jscomp.CompilerOptions.enables(CompilerOptions.java:800) */
        compilerOptions.enables(diagnosticGroup);
    }
    
    @Test
    public void testEnables6() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard = ((DiagnosticGroupWarningsGuard) createInstance("com.google.javascript.jscomp.DiagnosticGroupWarningsGuard"));
        DiagnosticGroup group = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        setField(group, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "group", group);
        CheckLevel level = CheckLevel.WARNING;
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "level", level);
        guards.add(diagnosticGroupWarningsGuard);
        guards.add(null);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types1 = new LinkedHashSet();
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        types1.add(diagnosticType);
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types1);
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.enables] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ComposeWarningsGuard.enables(ComposeWarningsGuard.java:111)
            com.google.javascript.jscomp.CompilerOptions.enables(CompilerOptions.java:800) */
        compilerOptions.enables(diagnosticGroup);
    }
    
    @Test
    public void testEnables7() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        ComposeWarningsGuard composeWarningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards1 = new ArrayList();
        guards1.add(null);
        guards1.add(null);
        guards1.add(null);
        setField(composeWarningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards1);
        guards.add(composeWarningsGuard);
        ComposeWarningsGuard composeWarningsGuard1 = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        guards.add(composeWarningsGuard1);
        guards.add(composeWarningsGuard1);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.enables] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ComposeWarningsGuard.enables(ComposeWarningsGuard.java:111)
            com.google.javascript.jscomp.ComposeWarningsGuard.enables(ComposeWarningsGuard.java:111)
            com.google.javascript.jscomp.CompilerOptions.enables(CompilerOptions.java:800) */
        compilerOptions.enables(null);
    }
    
    @Test
    public void testEnables8() throws Exception  {
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        DiagnosticGroupWarningsGuard diagnosticGroupWarningsGuard = ((DiagnosticGroupWarningsGuard) createInstance("com.google.javascript.jscomp.DiagnosticGroupWarningsGuard"));
        DiagnosticGroup group = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types = new LinkedHashSet();
        setField(group, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "group", group);
        CheckLevel level = CheckLevel.ERROR;
        setField(diagnosticGroupWarningsGuard, "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard", "level", level);
        guards.add(diagnosticGroupWarningsGuard);
        guards.add(null);
        guards.add(null);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compilerOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        DiagnosticGroup diagnosticGroup = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        LinkedHashSet types1 = new LinkedHashSet();
        types1.add(null);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        types1.add(diagnosticType);
        setField(diagnosticGroup, "com.google.javascript.jscomp.DiagnosticGroup", "types", types1);
        
        /* This test fails because method [com.google.javascript.jscomp.CompilerOptions.enables] produces [java.lang.NullPointerException] */
        compilerOptions.enables(diagnosticGroup);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields912105710900700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields912105710900700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass912105710909600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields912105710900700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass912105710909600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields912105711187700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields912105711187700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass912105711189500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields912105711187700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass912105711189500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields912105715068900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields912105715068900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass912105715072600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields912105715068900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass912105715072600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields912105715680100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields912105715680100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass912105715683300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields912105715680100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass912105715683300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

