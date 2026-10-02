package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.ErrorReporter;
import java.io.PrintStream;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.common.base.Supplier;
import java.util.Set;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import java.util.ArrayList;
import java.util.HashSet;
import com.google.javascript.jscomp.FunctionInjector.Reference;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_FunctionInjectorTest {
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.inlineFunction
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inlineFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = callNode.getParent();
 *  */
    @Test
    public void testInlineFunction_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineFunction(FunctionInjector.java:457) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method inlineFunctionMethod = functionInjectorClazz.getDeclaredMethod("inlineFunction", nodeType, nodeType, stringType);
        inlineFunctionMethod.setAccessible(true);
        java.lang.Object[] inlineFunctionMethodArguments = new java.lang.Object[3];
        inlineFunctionMethodArguments[0] = ((Object) null);
        inlineFunctionMethodArguments[1] = ((Object) null);
        inlineFunctionMethodArguments[2] = ((Object) null);
        try {
            inlineFunctionMethod.invoke(functionInjector, inlineFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node grandParent = parent.getParent();
 *  */
    @Test
    public void testInlineFunction_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineFunction(FunctionInjector.java:458) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method inlineFunctionMethod = functionInjectorClazz.getDeclaredMethod("inlineFunction", nodeType, nodeType, stringType);
        inlineFunctionMethod.setAccessible(true);
        java.lang.Object[] inlineFunctionMethodArguments = new java.lang.Object[3];
        inlineFunctionMethodArguments[0] = node;
        inlineFunctionMethodArguments[1] = ((Object) null);
        inlineFunctionMethodArguments[2] = ((Object) null);
        try {
            inlineFunctionMethod.invoke(functionInjector, inlineFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test
    public void testInlineFunction_ThrowNullPointerException_3() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(86);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(130);
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:404)
            com.google.javascript.jscomp.FunctionInjector.inlineFunction(FunctionInjector.java:462) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method inlineFunctionMethod = functionInjectorClazz.getDeclaredMethod("inlineFunction", nodeType, nodeType, stringType);
        inlineFunctionMethod.setAccessible(true);
        java.lang.Object[] inlineFunctionMethodArguments = new java.lang.Object[3];
        inlineFunctionMethodArguments[0] = node;
        inlineFunctionMethodArguments[1] = ((Object) null);
        inlineFunctionMethodArguments[2] = ((Object) null);
        try {
            inlineFunctionMethod.invoke(functionInjector, inlineFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test
    public void testInlineFunction_ThrowNullPointerException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(130);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(86);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:404)
            com.google.javascript.jscomp.FunctionInjector.inlineFunction(FunctionInjector.java:462) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method inlineFunctionMethod = functionInjectorClazz.getDeclaredMethod("inlineFunction", nodeType, nodeType, stringType);
        inlineFunctionMethod.setAccessible(true);
        java.lang.Object[] inlineFunctionMethodArguments = new java.lang.Object[3];
        inlineFunctionMethodArguments[0] = node;
        inlineFunctionMethodArguments[1] = ((Object) null);
        inlineFunctionMethodArguments[2] = ((Object) null);
        try {
            inlineFunctionMethod.invoke(functionInjector, inlineFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inlineFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInlineFunction_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(130);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method inlineFunctionMethod = functionInjectorClazz.getDeclaredMethod("inlineFunction", nodeType, nodeType, stringType);
        inlineFunctionMethod.setAccessible(true);
        java.lang.Object[] inlineFunctionMethodArguments = new java.lang.Object[3];
        inlineFunctionMethodArguments[0] = node;
        inlineFunctionMethodArguments[1] = ((Object) null);
        inlineFunctionMethodArguments[2] = ((Object) null);
        try {
            inlineFunctionMethod.invoke(functionInjector, inlineFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInlineFunction_ThrowUnsupportedOperationException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method inlineFunctionMethod = functionInjectorClazz.getDeclaredMethod("inlineFunction", nodeType, nodeType, stringType);
        inlineFunctionMethod.setAccessible(true);
        java.lang.Object[] inlineFunctionMethodArguments = new java.lang.Object[3];
        inlineFunctionMethodArguments[0] = node;
        inlineFunctionMethodArguments[1] = ((Object) null);
        inlineFunctionMethodArguments[2] = ((Object) null);
        try {
            inlineFunctionMethod.invoke(functionInjector, inlineFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.getDecomposer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDecomposer()
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#getDecomposer()}
 * @utbot.returnsFrom {@code return new ExpressionDecomposer(compiler, safeNameIdSupplier, knownConstants);}
 *  */
    @Test
    public void testGetDecomposer_Return() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        RenameLabels.DefaultNameSupplier safeNameIdSupplier = ((RenameLabels.DefaultNameSupplier) createInstance("com.google.javascript.jscomp.RenameLabels$DefaultNameSupplier"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "safeNameIdSupplier", safeNameIdSupplier);
        LinkedHashSet knownConstants = new LinkedHashSet();
        functionInjector.setKnownConstants(knownConstants);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Method getDecomposerMethod = functionInjectorClazz.getDeclaredMethod("getDecomposer");
        getDecomposerMethod.setAccessible(true);
        java.lang.Object[] getDecomposerMethodArguments = new java.lang.Object[0];
        ExpressionDecomposer actual = ((ExpressionDecomposer) getDecomposerMethod.invoke(functionInjector, getDecomposerMethodArguments));
        
        ExpressionDecomposer expected = ((ExpressionDecomposer) createInstance("com.google.javascript.jscomp.ExpressionDecomposer"));
        setField(expected, "com.google.javascript.jscomp.ExpressionDecomposer", "compiler", compiler);
        setField(expected, "com.google.javascript.jscomp.ExpressionDecomposer", "safeNameIdSupplier", safeNameIdSupplier);
        setField(expected, "com.google.javascript.jscomp.ExpressionDecomposer", "knownConstants", knownConstants);
        String tempNamePrefix = "JSCompiler_temp";
        expected.setTempNamePrefix(tempNamePrefix);
        String resultNamePrefix = "JSCompiler_inline_result";
        expected.setResultNamePrefix(resultNamePrefix);
        
        AbstractCompiler expectedCompiler = ((AbstractCompiler) getFieldValue(expected, "com.google.javascript.jscomp.ExpressionDecomposer", "compiler"));
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.ExpressionDecomposer", "compiler"));
        CompilerOptions actualCompilerOptions = (((Compiler) actualCompiler)).getOptions();
        assertNull(actualCompilerOptions);
        
        PassConfig actualCompilerPasses = ((PassConfig) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualCompilerPasses);
        
        List actualCompilerExterns = ((List) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externs"));
        assertNull(actualCompilerExterns);
        
        List actualCompilerModules = ((List) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "modules"));
        assertNull(actualCompilerModules);
        
        JSModuleGraph actualCompilerModuleGraph = (((Compiler) actualCompiler)).getModuleGraph();
        assertNull(actualCompilerModuleGraph);
        
        List actualCompilerInputs = ((List) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "inputs"));
        assertNull(actualCompilerInputs);
        
        ErrorManager actualCompilerErrorManager = (((Compiler) actualCompiler)).getErrorManager();
        assertNull(actualCompilerErrorManager);
        
        WarningsGuard actualCompilerWarningsGuard = ((WarningsGuard) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "warningsGuard"));
        assertNull(actualCompilerWarningsGuard);
        
        Map actualCompilerInjectedLibraries = ((Map) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "injectedLibraries"));
        assertNull(actualCompilerInjectedLibraries);
        
        Node actualCompilerExternsRoot = ((Node) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externsRoot"));
        assertNull(actualCompilerExternsRoot);
        
        Node actualCompilerJsRoot = (((Compiler) actualCompiler)).getJsRoot();
        assertNull(actualCompilerJsRoot);
        
        Node actualCompilerExternAndJsRoot = ((Node) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externAndJsRoot"));
        assertNull(actualCompilerExternAndJsRoot);
        
        Map actualCompilerInputsById = (((Compiler) actualCompiler)).getInputsById();
        assertNull(actualCompilerInputsById);
        
        SourceMap actualCompilerSourceMap = (((Compiler) actualCompiler)).getSourceMap();
        assertNull(actualCompilerSourceMap);
        
        String actualCompilerExternExports = ((String) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externExports"));
        assertNull(actualCompilerExternExports);
        
        int expectedCompilerUniqueNameId = ((Integer) getFieldValue(expectedCompiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        int actualCompilerUniqueNameId = ((Integer) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        assertEquals(expectedCompilerUniqueNameId, actualCompilerUniqueNameId);
        
        boolean actualCompilerHasRegExpGlobalReferences = ((Boolean) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences"));
        assertFalse(actualCompilerHasRegExpGlobalReferences);
        
        FunctionInformationMap actualCompilerFunctionInformationMap = ((FunctionInformationMap) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "functionInformationMap"));
        assertNull(actualCompilerFunctionInformationMap);
        
        StringBuilder actualCompilerDebugLog = ((StringBuilder) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "debugLog"));
        assertNull(actualCompilerDebugLog);
        
        CodingConvention actualCompilerDefaultCodingConvention = ((CodingConvention) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention"));
        assertNull(actualCompilerDefaultCodingConvention);
        
        JSTypeRegistry actualCompilerTypeRegistry = (((Compiler) actualCompiler)).getTypeRegistry();
        assertNull(actualCompilerTypeRegistry);
        
        Config actualCompilerParserConfig = (((Compiler) actualCompiler)).getParserConfig();
        assertNull(actualCompilerParserConfig);
        
        ReverseAbstractInterpreter actualCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        assertNull(actualCompilerAbstractInterpreter);
        
        TypeValidator actualCompilerTypeValidator = (((Compiler) actualCompiler)).getTypeValidator();
        assertNull(actualCompilerTypeValidator);
        
        PhaseOptimizer actualCompilerPhaseOptimizer = ((PhaseOptimizer) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "phaseOptimizer"));
        assertNull(actualCompilerPhaseOptimizer);
        
        PerformanceTracker actualCompilerTracker = ((PerformanceTracker) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "tracker"));
        assertNull(actualCompilerTracker);
        
        ErrorReporter actualCompilerOldErrorReporter = ((ErrorReporter) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
        assertNull(actualCompilerOldErrorReporter);
        
        com.google.javascript.rhino.head.ErrorReporter actualCompilerDefaultErrorReporter = (((Compiler) actualCompiler)).getDefaultErrorReporter();
        assertNull(actualCompilerDefaultErrorReporter);
        
        Thread actualCompilerCompilerThread = ((Thread) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "compilerThread"));
        assertNull(actualCompilerCompilerThread);
        
        boolean actualCompilerUseThreads = ((Boolean) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualCompilerUseThreads);
        
        PrintStream actualCompilerOutStream = ((PrintStream) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "outStream"));
        assertNull(actualCompilerOutStream);
        
        GlobalVarReferenceMap actualCompilerGlobalRefMap = ((GlobalVarReferenceMap) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "globalRefMap"));
        assertNull(actualCompilerGlobalRefMap);
        
        double expectedCompilerProgress = (((Compiler) expectedCompiler)).getProgress();
        double actualCompilerProgress = (((Compiler) actualCompiler)).getProgress();
        org.junit.Assert.assertEquals(expectedCompilerProgress, actualCompilerProgress, 1.0E-6);
        
        String actualCompilerLastPassName = (((Compiler) actualCompiler)).getLastPassName();
        assertNull(actualCompilerLastPassName);
        
        PassFactory actualCompilerSanityCheck = ((PassFactory) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
        assertNull(actualCompilerSanityCheck);
        
        Tracer actualCompilerCurrentTracer = ((Tracer) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        assertNull(actualCompilerCurrentTracer);
        
        String actualCompilerCurrentPassName = ((String) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "currentPassName"));
        assertNull(actualCompilerCurrentPassName);
        
        int expectedCompilerSyntheticCodeId = ((Integer) getFieldValue(expectedCompiler, "com.google.javascript.jscomp.Compiler", "syntheticCodeId"));
        int actualCompilerSyntheticCodeId = ((Integer) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "syntheticCodeId"));
        assertEquals(expectedCompilerSyntheticCodeId, actualCompilerSyntheticCodeId);
        
        RecentChange actualCompilerRecentChange = ((RecentChange) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "recentChange"));
        assertNull(actualCompilerRecentChange);
        
        List actualCompilerCodeChangeHandlers = ((List) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
        assertNull(actualCompilerCodeChangeHandlers);
        
        CompilerInput actualCompilerSynthesizedExternsInput = (((Compiler) actualCompiler)).getSynthesizedExternsInput();
        assertNull(actualCompilerSynthesizedExternsInput);
        
        AbstractCompiler.LifeCycleStage actualCompilerStage = ((AbstractCompiler.LifeCycleStage) getFieldValue(actualCompiler, "com.google.javascript.jscomp.AbstractCompiler", "stage"));
        assertNull(actualCompilerStage);
        
        boolean actualCompilerAnalyzeChangedScopesOnly = actualCompiler.analyzeChangedScopesOnly;
        assertFalse(actualCompilerAnalyzeChangedScopesOnly);
        
        Supplier expectedSafeNameIdSupplier = ((Supplier) getFieldValue(expected, "com.google.javascript.jscomp.ExpressionDecomposer", "safeNameIdSupplier"));
        Supplier actualSafeNameIdSupplier = ((Supplier) getFieldValue(actual, "com.google.javascript.jscomp.ExpressionDecomposer", "safeNameIdSupplier"));
        NameGenerator actualSafeNameIdSupplierNameGenerator = ((NameGenerator) getFieldValue(actualSafeNameIdSupplier, "com.google.javascript.jscomp.RenameLabels$DefaultNameSupplier", "nameGenerator"));
        assertNull(actualSafeNameIdSupplierNameGenerator);
        
        Set expectedKnownConstants = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.ExpressionDecomposer", "knownConstants"));
        Set actualKnownConstants = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.ExpressionDecomposer", "knownConstants"));
        assertTrue(deepEquals(expectedKnownConstants, actualKnownConstants));
        
        String expectedTempNamePrefix = ((String) getFieldValue(expected, "com.google.javascript.jscomp.ExpressionDecomposer", "tempNamePrefix"));
        String actualTempNamePrefix = ((String) getFieldValue(actual, "com.google.javascript.jscomp.ExpressionDecomposer", "tempNamePrefix"));
        assertEquals(expectedTempNamePrefix, actualTempNamePrefix);
        
        String expectedResultNamePrefix = ((String) getFieldValue(expected, "com.google.javascript.jscomp.ExpressionDecomposer", "resultNamePrefix"));
        String actualResultNamePrefix = ((String) getFieldValue(actual, "com.google.javascript.jscomp.ExpressionDecomposer", "resultNamePrefix"));
        assertEquals(expectedResultNamePrefix, actualResultNamePrefix);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDecomposer()
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#getDecomposer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ExpressionDecomposer(compiler, safeNameIdSupplier, knownConstants);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetDecomposer_ThrowNullPointerException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object safeNameIdSupplier = createInstance("com.google.common.collect.HashBasedTable$Factory");
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "safeNameIdSupplier", safeNameIdSupplier);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Method getDecomposerMethod = functionInjectorClazz.getDeclaredMethod("getDecomposer");
        getDecomposerMethod.setAccessible(true);
        java.lang.Object[] getDecomposerMethodArguments = new java.lang.Object[0];
        try {
            getDecomposerMethod.invoke(functionInjector, getDecomposerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#getDecomposer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ExpressionDecomposer(compiler, safeNameIdSupplier, knownConstants);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetDecomposer_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object safeNameIdSupplier = createInstance("com.google.common.collect.HashBasedTable$Factory");
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "safeNameIdSupplier", safeNameIdSupplier);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Method getDecomposerMethod = functionInjectorClazz.getDeclaredMethod("getDecomposer");
        getDecomposerMethod.setAccessible(true);
        java.lang.Object[] getDecomposerMethodArguments = new java.lang.Object[0];
        try {
            getDecomposerMethod.invoke(functionInjector, getDecomposerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#getDecomposer()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ExpressionDecomposer(compiler, safeNameIdSupplier, knownConstants);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetDecomposer_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Method getDecomposerMethod = functionInjectorClazz.getDeclaredMethod("getDecomposer");
        getDecomposerMethod.setAccessible(true);
        java.lang.Object[] getDecomposerMethodArguments = new java.lang.Object[0];
        try {
            getDecomposerMethod.invoke(functionInjector, getDecomposerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.maybePrepareCall
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybePrepareCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test
    public void testMaybePrepareCall_ThrowNullPointerException() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.maybePrepareCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:395)
            com.google.javascript.jscomp.FunctionInjector.maybePrepareCall(FunctionInjector.java:446) */
        functionInjector.maybePrepareCall(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test
    public void testMaybePrepareCall_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.maybePrepareCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:396)
            com.google.javascript.jscomp.FunctionInjector.maybePrepareCall(FunctionInjector.java:446) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybePrepareCallMethod = functionInjectorClazz.getDeclaredMethod("maybePrepareCall", stringNodeType);
        maybePrepareCallMethod.setAccessible(true);
        java.lang.Object[] maybePrepareCallMethodArguments = new java.lang.Object[1];
        maybePrepareCallMethodArguments[0] = stringNode;
        try {
            maybePrepareCallMethod.invoke(functionInjector, maybePrepareCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test
    public void testMaybePrepareCall_ThrowNullPointerException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-255);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.maybePrepareCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:404)
            com.google.javascript.jscomp.FunctionInjector.maybePrepareCall(FunctionInjector.java:446) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybePrepareCallMethod = functionInjectorClazz.getDeclaredMethod("maybePrepareCall", numberNodeType);
        maybePrepareCallMethod.setAccessible(true);
        java.lang.Object[] maybePrepareCallMethodArguments = new java.lang.Object[1];
        maybePrepareCallMethodArguments[0] = numberNode;
        try {
            maybePrepareCallMethod.invoke(functionInjector, maybePrepareCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test
    public void testMaybePrepareCall_ThrowNullPointerException_3() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(86);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.maybePrepareCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:404)
            com.google.javascript.jscomp.FunctionInjector.maybePrepareCall(FunctionInjector.java:446) */
        functionInjector.maybePrepareCall(node);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybePrepareCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybePrepareCall_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybePrepareCallMethod = functionInjectorClazz.getDeclaredMethod("maybePrepareCall", stringNodeType);
        maybePrepareCallMethod.setAccessible(true);
        java.lang.Object[] maybePrepareCallMethodArguments = new java.lang.Object[1];
        maybePrepareCallMethodArguments[0] = stringNode;
        try {
            maybePrepareCallMethod.invoke(functionInjector, maybePrepareCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMaybePrepareCall_ThrowIllegalStateException() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        functionInjector.maybePrepareCall(node);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybePrepareCall_ThrowUnsupportedOperationException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybePrepareCallMethod = functionInjectorClazz.getDeclaredMethod("maybePrepareCall", stringNodeType);
        maybePrepareCallMethod.setAccessible(true);
        java.lang.Object[] maybePrepareCallMethodArguments = new java.lang.Object[1];
        maybePrepareCallMethodArguments[0] = stringNode;
        try {
            maybePrepareCallMethod.invoke(functionInjector, maybePrepareCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybePrepareCall_ThrowUnsupportedOperationException_2() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        functionInjector.maybePrepareCall(node);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#maybePrepareCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybePrepareCall_ThrowUnsupportedOperationException_3() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(86);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybePrepareCallMethod = functionInjectorClazz.getDeclaredMethod("maybePrepareCall", stringNodeType);
        maybePrepareCallMethod.setAccessible(true);
        java.lang.Object[] maybePrepareCallMethodArguments = new java.lang.Object[1];
        maybePrepareCallMethodArguments[0] = stringNode;
        try {
            maybePrepareCallMethod.invoke(functionInjector, maybePrepareCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.classifyCallSite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method classifyCallSite(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprCall(parent)): False}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): False}
 * @utbot.executesCondition {@code (parent.isName()): False}
 * @utbot.executesCondition {@code (expressionRoot != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.ExpressionDecomposer#findExpressionRoot(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return CallSiteType.UNSUPPORTED;}
 *  */
    @Test
    public void testClassifyCallSite_ExpressionRootEqualsNull() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(111);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", stringNodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = stringNode;
        Object actual = classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        
        Class callSiteTypeClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector$CallSiteType");
        Object expected = getEnumConstantByName(callSiteTypeClazz, "UNSUPPORTED");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprCall(parent)): True}
 * @utbot.returnsFrom {@code return CallSiteType.SIMPLE_CALL;}
 *  */
    @Test
    public void testClassifyCallSite_NodeUtilIsExprCall() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", nodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = node;
        Object actual = classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        
        Class callSiteTypeClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector$CallSiteType");
        Object expected = getEnumConstantByName(callSiteTypeClazz, "SIMPLE_CALL");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprCall(parent)): False}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): False}
 * @utbot.executesCondition {@code (parent.isName()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isConstantName(parent)): True}
 * @utbot.executesCondition {@code (grandParent.isVar()): True}
 * @utbot.executesCondition {@code (grandParent.hasOneChild()): True}
 * @utbot.returnsFrom {@code return CallSiteType.VAR_DECL_SIMPLE_ASSIGNMENT;}
 *  */
    @Test
    public void testClassifyCallSite_GrandParentHasOneChild_1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent1, "com.google.javascript.rhino.Node", "last", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", nodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = node;
        Object actual = classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        
        Class callSiteTypeClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector$CallSiteType");
        Object expected = getEnumConstantByName(callSiteTypeClazz, "VAR_DECL_SIMPLE_ASSIGNMENT");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprCall(parent)): False}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): False}
 * @utbot.executesCondition {@code (parent.isName()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isConstantName(parent)): True}
 * @utbot.executesCondition {@code (grandParent.isVar()): True}
 * @utbot.executesCondition {@code (grandParent.hasOneChild()): True}
 * @utbot.returnsFrom {@code return CallSiteType.VAR_DECL_SIMPLE_ASSIGNMENT;}
 *  */
    @Test
    public void testClassifyCallSite_GrandParentHasOneChild() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(118);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent1, "com.google.javascript.rhino.Node", "last", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", nodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = node;
        Object actual = classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        
        Class callSiteTypeClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector$CallSiteType");
        Object expected = getEnumConstantByName(callSiteTypeClazz, "VAR_DECL_SIMPLE_ASSIGNMENT");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprCall(parent)): False}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isVarOrSimpleAssignLhs(callNode, parent)): True}
 * @utbot.executesCondition {@code (parent.getFirstChild().isName()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isConstantName(parent.getFirstChild())): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isVarOrSimpleAssignLhs(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isConstantName(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return CallSiteType.SIMPLE_ASSIGNMENT;}
 *  */
    @Test
    public void testClassifyCallSite_NotNodeUtilIsConstantName() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-240);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(86);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", numberNodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = numberNode;
        Object actual = classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        
        Class callSiteTypeClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector$CallSiteType");
        Object expected = getEnumConstantByName(callSiteTypeClazz, "SIMPLE_ASSIGNMENT");
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method classifyCallSite(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = callNode.getParent();
 *  */
    @Test
    public void testClassifyCallSite_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.classifyCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:395) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", nodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = ((Object) null);
        try {
            classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node grandParent = parent.getParent();
 *  */
    @Test
    public void testClassifyCallSite_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.classifyCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:396) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", stringNodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = stringNode;
        try {
            classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprCall(parent)): False}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isVarOrSimpleAssignLhs(callNode, parent)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getFirstChild().isName()
 *  */
    @Test
    public void testClassifyCallSite_ThrowNullPointerException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-255);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.classifyCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:404) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", numberNodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = numberNode;
        try {
            classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprCall(parent)): False}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isVarOrSimpleAssignLhs(callNode, parent)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getFirstChild().isName()
 *  */
    @Test
    public void testClassifyCallSite_ThrowNullPointerException_3() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(86);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.classifyCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:404) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", nodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = node;
        try {
            classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method classifyCallSite(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): False}
 * @utbot.executesCondition {@code (parent.isName()): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: !NodeUtil.isConstantName(parent)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testClassifyCallSite_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", stringNodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = stringNode;
        try {
            classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): False}
 * @utbot.executesCondition {@code (parent.isName()): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node expressionRoot = ExpressionDecomposer.findExpressionRoot(callNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testClassifyCallSite_ThrowIllegalStateException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(108);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", stringNodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = stringNode;
        try {
            classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isVarOrSimpleAssignLhs(callNode, parent)): True}
 * @utbot.executesCondition {@code (parent.getFirstChild().isName()): False}
 * @utbot.executesCondition {@code (parent.isName()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isVarOrSimpleAssignLhs(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: !NodeUtil.isConstantName(parent)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testClassifyCallSite_ThrowUnsupportedOperationException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(86);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", numberNodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = numberNode;
        try {
            classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#classifyCallSite(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isExprAssign(grandParent)): False}
 * @utbot.executesCondition {@code (parent.isName()): False}
 * @utbot.executesCondition {@code (expressionRoot != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ExpressionDecomposer decomposer = new ExpressionDecomposer(compiler, safeNameIdSupplier, knownConstants);
 *  */
    @Test(expected = NullPointerException.class)
    public void testClassifyCallSite_ThrowNullPointerException_4() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent1)).setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method classifyCallSiteMethod = functionInjectorClazz.getDeclaredMethod("classifyCallSite", stringNodeType);
        classifyCallSiteMethod.setAccessible(true);
        java.lang.Object[] classifyCallSiteMethodArguments = new java.lang.Object[1];
        classifyCallSiteMethodArguments[0] = stringNode;
        try {
            classifyCallSiteMethod.invoke(functionInjector, classifyCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.inlineReturnValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inlineReturnValue(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineReturnValue(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node block = fnNode.getLastChild();
 *  */
    @Test
    public void testInlineReturnValue_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineReturnValue] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineReturnValue(FunctionInjector.java:257) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inlineReturnValueMethod = functionInjectorClazz.getDeclaredMethod("inlineReturnValue", nodeType, nodeType);
        inlineReturnValueMethod.setAccessible(true);
        java.lang.Object[] inlineReturnValueMethodArguments = new java.lang.Object[2];
        inlineReturnValueMethodArguments[0] = ((Object) null);
        inlineReturnValueMethodArguments[1] = ((Object) null);
        try {
            inlineReturnValueMethod.invoke(functionInjector, inlineReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineReturnValue(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node callParentNode = callNode.getParent();
 *  */
    @Test
    public void testInlineReturnValue_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineReturnValue] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineReturnValue(FunctionInjector.java:258) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inlineReturnValueMethod = functionInjectorClazz.getDeclaredMethod("inlineReturnValue", nodeType, nodeType);
        inlineReturnValueMethod.setAccessible(true);
        java.lang.Object[] inlineReturnValueMethodArguments = new java.lang.Object[2];
        inlineReturnValueMethodArguments[0] = ((Object) null);
        inlineReturnValueMethodArguments[1] = stringNode;
        try {
            inlineReturnValueMethod.invoke(functionInjector, inlineReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inlineReturnValue(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineReturnValue(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testInlineReturnValue_ThrowIllegalStateException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inlineReturnValueMethod = functionInjectorClazz.getDeclaredMethod("inlineReturnValue", stringNodeType, stringNodeType);
        inlineReturnValueMethod.setAccessible(true);
        java.lang.Object[] inlineReturnValueMethodArguments = new java.lang.Object[2];
        inlineReturnValueMethodArguments[0] = stringNode;
        inlineReturnValueMethodArguments[1] = stringNode1;
        try {
            inlineReturnValueMethod.invoke(functionInjector, inlineReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineReturnValue(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testInlineReturnValue_ThrowIllegalStateException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inlineReturnValueMethod = functionInjectorClazz.getDeclaredMethod("inlineReturnValue", stringNodeType, stringNodeType);
        inlineReturnValueMethod.setAccessible(true);
        java.lang.Object[] inlineReturnValueMethodArguments = new java.lang.Object[2];
        inlineReturnValueMethodArguments[0] = stringNode;
        inlineReturnValueMethodArguments[1] = numberNode;
        try {
            inlineReturnValueMethod.invoke(functionInjector, inlineReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineReturnValue(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: FunctionArgumentInjector.getFunctionCallParameterMap(fnNode, callNode, this.safeNameIdSupplier)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInlineReturnValue_ThrowIllegalArgumentException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "last", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", next);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inlineReturnValueMethod = functionInjectorClazz.getDeclaredMethod("inlineReturnValue", stringNodeType, stringNodeType);
        inlineReturnValueMethod.setAccessible(true);
        java.lang.Object[] inlineReturnValueMethodArguments = new java.lang.Object[2];
        inlineReturnValueMethodArguments[0] = stringNode;
        inlineReturnValueMethodArguments[1] = stringNode1;
        try {
            inlineReturnValueMethod.invoke(functionInjector, inlineReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineReturnValue(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInlineReturnValue_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inlineReturnValueMethod = functionInjectorClazz.getDeclaredMethod("inlineReturnValue", stringNodeType, stringNodeType);
        inlineReturnValueMethod.setAccessible(true);
        java.lang.Object[] inlineReturnValueMethodArguments = new java.lang.Object[2];
        inlineReturnValueMethodArguments[0] = stringNode;
        inlineReturnValueMethodArguments[1] = stringNode;
        try {
            inlineReturnValueMethod.invoke(functionInjector, inlineReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineReturnValue(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInlineReturnValue_ThrowUnsupportedOperationException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inlineReturnValueMethod = functionInjectorClazz.getDeclaredMethod("inlineReturnValue", stringNodeType, stringNodeType);
        inlineReturnValueMethod.setAccessible(true);
        java.lang.Object[] inlineReturnValueMethodArguments = new java.lang.Object[2];
        inlineReturnValueMethodArguments[0] = stringNode;
        inlineReturnValueMethodArguments[1] = stringNode;
        try {
            inlineReturnValueMethod.invoke(functionInjector, inlineReturnValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.inline
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inline(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionInjector$InliningMode)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inlineReturnValue(callNode, fnNode);
 *  */
    @Test
    public void testInline_ThrowNullPointerException_3() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        FunctionInjector.InliningMode inliningMode = FunctionInjector.InliningMode.DIRECT;
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inline] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineReturnValue(FunctionInjector.java:257)
            com.google.javascript.jscomp.FunctionInjector.inline(FunctionInjector.java:245) */
        functionInjector.inline(null, null, null, inliningMode);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testInline_ThrowNullPointerException() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inline] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inline(FunctionInjector.java:242) */
        functionInjector.inline(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inlineReturnValue(callNode, fnNode);
 *  */
    @Test
    public void testInline_ThrowNullPointerException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionInjector.InliningMode inliningMode = FunctionInjector.InliningMode.DIRECT;
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inline] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineReturnValue(FunctionInjector.java:258)
            com.google.javascript.jscomp.FunctionInjector.inline(FunctionInjector.java:245) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Method inlineMethod = functionInjectorClazz.getDeclaredMethod("inline", nodeType, stringType, nodeType, inliningModeType);
        inlineMethod.setAccessible(true);
        java.lang.Object[] inlineMethodArguments = new java.lang.Object[4];
        inlineMethodArguments[0] = ((Object) null);
        inlineMethodArguments[1] = ((Object) null);
        inlineMethodArguments[2] = stringNode;
        inlineMethodArguments[3] = inliningMode;
        try {
            inlineMethod.invoke(functionInjector, inlineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inlineFunction(callNode, fnNode, fnName);
 *  */
    @Test
    public void testInline_ThrowNullPointerException_4() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inline] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineFunction(FunctionInjector.java:457)
            com.google.javascript.jscomp.FunctionInjector.inline(FunctionInjector.java:247) */
        functionInjector.inline(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inlineFunction(callNode, fnNode, fnName);
 *  */
    @Test
    public void testInline_ThrowNullPointerException_5() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inline] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineFunction(FunctionInjector.java:457)
            com.google.javascript.jscomp.FunctionInjector.inline(FunctionInjector.java:247) */
        functionInjector.inline(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test
    public void testInline_ThrowNullPointerException_1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inline] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inline(FunctionInjector.java:242) */
        functionInjector.inline(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inlineFunction(callNode, fnNode, fnName);
 *  */
    @Test
    public void testInline_ThrowNullPointerException_6() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inline] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineFunction(FunctionInjector.java:458)
            com.google.javascript.jscomp.FunctionInjector.inline(FunctionInjector.java:247) */
        functionInjector.inline(node, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inline(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionInjector$InliningMode)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testInline_ThrowIllegalStateException() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        
        functionInjector.inline(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testInline_ThrowIllegalStateException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionInjector.InliningMode inliningMode = FunctionInjector.InliningMode.DIRECT;
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Method inlineMethod = functionInjectorClazz.getDeclaredMethod("inline", stringNodeType, stringType, stringNodeType, inliningModeType);
        inlineMethod.setAccessible(true);
        java.lang.Object[] inlineMethodArguments = new java.lang.Object[4];
        inlineMethodArguments[0] = stringNode;
        inlineMethodArguments[1] = ((Object) null);
        inlineMethodArguments[2] = stringNode1;
        inlineMethodArguments[3] = inliningMode;
        try {
            inlineMethod.invoke(functionInjector, inlineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inline(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return inlineReturnValue(callNode, fnNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInline_ThrowIllegalArgumentException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionInjector.InliningMode inliningMode = FunctionInjector.InliningMode.DIRECT;
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Method inlineMethod = functionInjectorClazz.getDeclaredMethod("inline", nodeType, stringType, nodeType, inliningModeType);
        inlineMethod.setAccessible(true);
        java.lang.Object[] inlineMethodArguments = new java.lang.Object[4];
        inlineMethodArguments[0] = node;
        inlineMethodArguments[1] = ((Object) null);
        inlineMethodArguments[2] = stringNode;
        inlineMethodArguments[3] = inliningMode;
        try {
            inlineMethod.invoke(functionInjector, inlineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.inliningLowersCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inliningLowersCost(com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node, java.util.Collection, java.util.Set, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inliningLowersCost(com.google.javascript.jscomp.JSModule,com.google.javascript.rhino.Node,java.util.Collection,java.util.Set,boolean,boolean)}
 * @utbot.invokes {@link java.util.Collection#size()}
 *  */
    @Test
    public void testInliningLowersCost_CollectionSize() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        ArrayList arrayList = new ArrayList();
        
        boolean actual = functionInjector.inliningLowersCost(null, null, arrayList, null, false, false);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inliningLowersCost(com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node, java.util.Collection, java.util.Set, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inliningLowersCost(com.google.javascript.jscomp.JSModule,com.google.javascript.rhino.Node,java.util.Collection,java.util.Set,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int referenceCount = refs.size();
 *  */
    @Test
    public void testInliningLowersCost_ThrowNullPointerException() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inliningLowersCost(FunctionInjector.java:758) */
        functionInjector.inliningLowersCost(null, null, null, null, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inliningLowersCost(com.google.javascript.jscomp.JSModule,com.google.javascript.rhino.Node,java.util.Collection,java.util.Set,boolean,boolean)}
 * @utbot.invokes {@link java.util.Collection#size()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getModuleGraph()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSModuleGraph moduleGraph = compiler.getModuleGraph();
 *  */
    @Test
    public void testInliningLowersCost_ThrowNullPointerException_1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inliningLowersCost(FunctionInjector.java:766) */
        functionInjector.inliningLowersCost(null, null, arrayList, null, true, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inliningLowersCost(com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node, java.util.Collection, java.util.Set, boolean, boolean)
    
    @Test
    public void testInliningLowersCost1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        HashSet hashSet = new HashSet();
        FunctionInjector.Reference reference = new FunctionInjector.Reference(null, null, null);
        hashSet.add(reference);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class hashSetType = Class.forName("java.util.Collection");
        Class setType = Class.forName("java.util.Set");
        Class booleanType = boolean.class;
        Method inliningLowersCostMethod = functionInjectorClazz.getDeclaredMethod("inliningLowersCost", jSModuleType, stringNodeType, hashSetType, setType, booleanType, booleanType);
        inliningLowersCostMethod.setAccessible(true);
        java.lang.Object[] inliningLowersCostMethodArguments = new java.lang.Object[6];
        inliningLowersCostMethodArguments[0] = ((Object) null);
        inliningLowersCostMethodArguments[1] = stringNode;
        inliningLowersCostMethodArguments[2] = hashSet;
        inliningLowersCostMethodArguments[3] = ((Object) null);
        inliningLowersCostMethodArguments[4] = true;
        inliningLowersCostMethodArguments[5] = false;
        boolean actual = ((Boolean) inliningLowersCostMethod.invoke(functionInjector, inliningLowersCostMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inliningLowersCost(com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node, java.util.Collection, java.util.Set, boolean, boolean)
    
    @Test
    public void testInliningLowersCost2() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        HashSet hashSet = new HashSet();
        com.google.javascript.jscomp.InlineFunctions.Reference reference = ((com.google.javascript.jscomp.InlineFunctions.Reference) createInstance("com.google.javascript.jscomp.InlineFunctions$Reference"));
        hashSet.add(reference);
        com.google.javascript.jscomp.InlineFunctions.Reference reference1 = ((com.google.javascript.jscomp.InlineFunctions.Reference) createInstance("com.google.javascript.jscomp.InlineFunctions$Reference"));
        hashSet.add(reference1);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inliningLowersCost(FunctionInjector.java:766) */
        functionInjector.inliningLowersCost(null, null, hashSet, null, false, false);
    }
    
    @Test
    public void testInliningLowersCost3() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inliningLowersCost(FunctionInjector.java:769) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class hashSetType = Class.forName("java.util.Collection");
        Class setType = Class.forName("java.util.Set");
        Class booleanType = boolean.class;
        Method inliningLowersCostMethod = functionInjectorClazz.getDeclaredMethod("inliningLowersCost", jSModuleType, numberNodeType, hashSetType, setType, booleanType, booleanType);
        inliningLowersCostMethod.setAccessible(true);
        java.lang.Object[] inliningLowersCostMethodArguments = new java.lang.Object[6];
        inliningLowersCostMethodArguments[0] = ((Object) null);
        inliningLowersCostMethodArguments[1] = numberNode;
        inliningLowersCostMethodArguments[2] = hashSet;
        inliningLowersCostMethodArguments[3] = ((Object) null);
        inliningLowersCostMethodArguments[4] = true;
        inliningLowersCostMethodArguments[5] = false;
        try {
            inliningLowersCostMethod.invoke(functionInjector, inliningLowersCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInliningLowersCost4() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        JSModule jSModule = new JSModule(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inliningLowersCost(FunctionInjector.java:769) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class hashSetType = Class.forName("java.util.Collection");
        Class setType = Class.forName("java.util.Set");
        Class booleanType = boolean.class;
        Method inliningLowersCostMethod = functionInjectorClazz.getDeclaredMethod("inliningLowersCost", jSModuleType, numberNodeType, hashSetType, setType, booleanType, booleanType);
        inliningLowersCostMethod.setAccessible(true);
        java.lang.Object[] inliningLowersCostMethodArguments = new java.lang.Object[6];
        inliningLowersCostMethodArguments[0] = jSModule;
        inliningLowersCostMethodArguments[1] = numberNode;
        inliningLowersCostMethodArguments[2] = hashSet;
        inliningLowersCostMethodArguments[3] = ((Object) null);
        inliningLowersCostMethodArguments[4] = true;
        inliningLowersCostMethodArguments[5] = false;
        try {
            inliningLowersCostMethod.invoke(functionInjector, inliningLowersCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInliningLowersCost5() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        JSModule jSModule = new JSModule(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inliningLowersCost(FunctionInjector.java:769) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class hashSetType = Class.forName("java.util.Collection");
        Class setType = Class.forName("java.util.Set");
        Class booleanType = boolean.class;
        Method inliningLowersCostMethod = functionInjectorClazz.getDeclaredMethod("inliningLowersCost", jSModuleType, numberNodeType, hashSetType, setType, booleanType, booleanType);
        inliningLowersCostMethod.setAccessible(true);
        java.lang.Object[] inliningLowersCostMethodArguments = new java.lang.Object[6];
        inliningLowersCostMethodArguments[0] = jSModule;
        inliningLowersCostMethodArguments[1] = numberNode;
        inliningLowersCostMethodArguments[2] = hashSet;
        inliningLowersCostMethodArguments[3] = ((Object) null);
        inliningLowersCostMethodArguments[4] = false;
        inliningLowersCostMethodArguments[5] = false;
        try {
            inliningLowersCostMethod.invoke(functionInjector, inliningLowersCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInliningLowersCost6() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        JSModule jSModule = new JSModule(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        HashSet hashSet = new HashSet();
        FunctionInjector.Reference reference = new FunctionInjector.Reference(null, null, null);
        hashSet.add(reference);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inliningLowersCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inliningLowersCost(FunctionInjector.java:766) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class hashSetType = Class.forName("java.util.Collection");
        Class setType = Class.forName("java.util.Set");
        Class booleanType = boolean.class;
        Method inliningLowersCostMethod = functionInjectorClazz.getDeclaredMethod("inliningLowersCost", jSModuleType, numberNodeType, hashSetType, setType, booleanType, booleanType);
        inliningLowersCostMethod.setAccessible(true);
        java.lang.Object[] inliningLowersCostMethodArguments = new java.lang.Object[6];
        inliningLowersCostMethodArguments[0] = jSModule;
        inliningLowersCostMethodArguments[1] = numberNode;
        inliningLowersCostMethodArguments[2] = hashSet;
        inliningLowersCostMethodArguments[3] = ((Object) null);
        inliningLowersCostMethodArguments[4] = true;
        inliningLowersCostMethodArguments[5] = false;
        try {
            inliningLowersCostMethod.invoke(functionInjector, inliningLowersCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.doesLowerCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doesLowerCost(com.google.javascript.rhino.Node, int, int, int, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesLowerCost(com.google.javascript.rhino.Node,int,int,int,int,int,boolean)}
 * @utbot.executesCondition {@code (removable): False}
 * @utbot.executesCondition {@code (blockInlines > 0): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testDoesLowerCost_NotRemovable() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", nodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = ((Object) null);
        doesLowerCostMethodArguments[1] = -255;
        doesLowerCostMethodArguments[2] = 0;
        doesLowerCostMethodArguments[3] = -255;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = -255;
        doesLowerCostMethodArguments[6] = false;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesLowerCost(com.google.javascript.rhino.Node,int,int,int,int,int,boolean)}
 * @utbot.executesCondition {@code (removable): True}
 * @utbot.executesCondition {@code (blockInlines > 0): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testDoesLowerCost_BlockInlinesLessOrEqualZero() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", nodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = ((Object) null);
        doesLowerCostMethodArguments[1] = -255;
        doesLowerCostMethodArguments[2] = 1;
        doesLowerCostMethodArguments[3] = -255;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = -255;
        doesLowerCostMethodArguments[6] = true;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesLowerCost(com.google.javascript.rhino.Node,int,int,int,int,int,boolean)}
 * @utbot.executesCondition {@code (removable): True}
 * @utbot.executesCondition {@code (blockInlines > 0): True}
 * @utbot.executesCondition {@code (costDeltaBlock > 0): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDoesLowerCost_CostDeltaBlockGreaterThanZero() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", nodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = ((Object) null);
        doesLowerCostMethodArguments[1] = -255;
        doesLowerCostMethodArguments[2] = 0;
        doesLowerCostMethodArguments[3] = -255;
        doesLowerCostMethodArguments[4] = 1;
        doesLowerCostMethodArguments[5] = 1;
        doesLowerCostMethodArguments[6] = true;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesLowerCost(com.google.javascript.rhino.Node,int,int,int,int,int,boolean)}
 * @utbot.executesCondition {@code (removable): True}
 * @utbot.executesCondition {@code (blockInlines > 0): True}
 * @utbot.executesCondition {@code (costDeltaBlock > 0): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testDoesLowerCost_CostDeltaBlockLessOrEqualZero() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", nodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = ((Object) null);
        doesLowerCostMethodArguments[1] = -255;
        doesLowerCostMethodArguments[2] = 0;
        doesLowerCostMethodArguments[3] = -255;
        doesLowerCostMethodArguments[4] = 1;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = true;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doesLowerCost(com.google.javascript.rhino.Node, int, int, int, int, int, boolean)
    
    @Test
    public void testDoesLowerCost1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testDoesLowerCost2() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(41);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testDoesLowerCost3() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(43);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testDoesLowerCost4() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(116);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testDoesLowerCost5() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(117);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        boolean actual = ((Boolean) doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doesLowerCost(com.google.javascript.rhino.Node, int, int, int, int, int, boolean)
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost6() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost7() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testDoesLowerCost8() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost9() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(113);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost10() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(104);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost11() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost12() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(119);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost13() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(49);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", numberNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = numberNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost14() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(39);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost15() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(102);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost16() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(111);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost17() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testDoesLowerCost18() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doesLowerCost(com.google.javascript.rhino.Node, int, int, int, int, int, boolean)
    
    @Test
    public void testDoesLowerCost19() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesLowerCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:2660)
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:2651)
            com.google.javascript.jscomp.NodeUtil.has(NodeUtil.java:2739)
            com.google.javascript.jscomp.NodeUtil.containsType(NodeUtil.java:2248)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:656)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:104)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.FunctionInjector.doesLowerCost(FunctionInjector.java:843) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoesLowerCost20() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesLowerCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.isIndirectEval(CodeGenerator.java:841)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:547)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:104)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.FunctionInjector.doesLowerCost(FunctionInjector.java:843) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoesLowerCost21() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(110);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesLowerCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:740)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:104)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.FunctionInjector.doesLowerCost(FunctionInjector.java:843) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoesLowerCost22() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(47);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesLowerCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:291)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:104)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.FunctionInjector.doesLowerCost(FunctionInjector.java:843) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoesLowerCost23() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(77);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesLowerCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:145)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:104)
            com.google.javascript.jscomp.InlineCostEstimator$CompiledSizeEstimator.add(InlineCostEstimator.java:67)
            com.google.javascript.jscomp.InlineCostEstimator.getCost(InlineCostEstimator.java:47)
            com.google.javascript.jscomp.FunctionInjector.doesLowerCost(FunctionInjector.java:843) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class booleanType = boolean.class;
        Method doesLowerCostMethod = functionInjectorClazz.getDeclaredMethod("doesLowerCost", stringNodeType, intType, intType, intType, intType, intType, booleanType);
        doesLowerCostMethod.setAccessible(true);
        java.lang.Object[] doesLowerCostMethodArguments = new java.lang.Object[7];
        doesLowerCostMethodArguments[0] = stringNode;
        doesLowerCostMethodArguments[1] = 0;
        doesLowerCostMethodArguments[2] = -3;
        doesLowerCostMethodArguments[3] = 0;
        doesLowerCostMethodArguments[4] = 0;
        doesLowerCostMethodArguments[5] = 0;
        doesLowerCostMethodArguments[6] = false;
        try {
            doesLowerCostMethod.invoke(functionInjector, doesLowerCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.estimateCallCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method estimateCallCost(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#estimateCallCost(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (numArgs > 0): False}
 * @utbot.executesCondition {@code (referencesThis): True}
 * @utbot.returnsFrom {@code return callCost;}
 *  */
    @Test
    public void testEstimateCallCost_ReferencesThis() throws Exception  {
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        int prevNAME_COST_ESTIMATE = ((Integer) getStaticFieldValue(functionInjectorClazz, "NAME_COST_ESTIMATE"));
        try {
            setStaticField(functionInjectorClazz, "NAME_COST_ESTIMATE", 2);
            Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
            (((Node) numberNode)).setType(105);
            Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(first, "com.google.javascript.rhino.Node", "next", first);
            setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
            
            Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
            Class booleanType = boolean.class;
            Method estimateCallCostMethod = functionInjectorClazz.getDeclaredMethod("estimateCallCost", numberNodeType, booleanType);
            estimateCallCostMethod.setAccessible(true);
            java.lang.Object[] estimateCallCostMethodArguments = new java.lang.Object[2];
            estimateCallCostMethodArguments[0] = numberNode;
            estimateCallCostMethodArguments[1] = true;
            int actual = ((Integer) estimateCallCostMethod.invoke(null, estimateCallCostMethodArguments));
            
            assertEquals(14, actual);
        } finally {
            setStaticField(FunctionInjector.class, "NAME_COST_ESTIMATE", prevNAME_COST_ESTIMATE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#estimateCallCost(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (numArgs > 0): False}
 * @utbot.executesCondition {@code (referencesThis): False}
 * @utbot.returnsFrom {@code return callCost;}
 *  */
    @Test
    public void testEstimateCallCost_NotReferencesThis() throws Exception  {
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        int prevNAME_COST_ESTIMATE = ((Integer) getStaticFieldValue(functionInjectorClazz, "NAME_COST_ESTIMATE"));
        try {
            setStaticField(functionInjectorClazz, "NAME_COST_ESTIMATE", 2);
            Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
            (((Node) numberNode)).setType(105);
            Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(first, "com.google.javascript.rhino.Node", "next", first);
            setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
            
            Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
            Class booleanType = boolean.class;
            Method estimateCallCostMethod = functionInjectorClazz.getDeclaredMethod("estimateCallCost", numberNodeType, booleanType);
            estimateCallCostMethod.setAccessible(true);
            java.lang.Object[] estimateCallCostMethodArguments = new java.lang.Object[2];
            estimateCallCostMethodArguments[0] = numberNode;
            estimateCallCostMethodArguments[1] = false;
            int actual = ((Integer) estimateCallCostMethod.invoke(null, estimateCallCostMethodArguments));
            
            assertEquals(4, actual);
        } finally {
            setStaticField(FunctionInjector.class, "NAME_COST_ESTIMATE", prevNAME_COST_ESTIMATE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#estimateCallCost(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (numArgs > 0): True}
 * @utbot.executesCondition {@code (referencesThis): False}
 * @utbot.returnsFrom {@code return callCost;}
 *  */
    @Test
    public void testEstimateCallCost_NumArgsGreaterThanZero() throws Exception  {
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        int prevNAME_COST_ESTIMATE = ((Integer) getStaticFieldValue(functionInjectorClazz, "NAME_COST_ESTIMATE"));
        try {
            setStaticField(functionInjectorClazz, "NAME_COST_ESTIMATE", 2);
            Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
            (((Node) numberNode)).setType(105);
            Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
            Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(next, "com.google.javascript.rhino.Node", "first", next);
            setField(first, "com.google.javascript.rhino.Node", "next", next);
            setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
            
            Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
            Class booleanType = boolean.class;
            Method estimateCallCostMethod = functionInjectorClazz.getDeclaredMethod("estimateCallCost", numberNodeType, booleanType);
            estimateCallCostMethod.setAccessible(true);
            java.lang.Object[] estimateCallCostMethodArguments = new java.lang.Object[2];
            estimateCallCostMethodArguments[0] = numberNode;
            estimateCallCostMethodArguments[1] = false;
            int actual = ((Integer) estimateCallCostMethod.invoke(null, estimateCallCostMethodArguments));
            
            assertEquals(6, actual);
        } finally {
            setStaticField(FunctionInjector.class, "NAME_COST_ESTIMATE", prevNAME_COST_ESTIMATE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method estimateCallCost(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#estimateCallCost(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionParameters(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node argsNode = NodeUtil.getFunctionParameters(fnNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testEstimateCallCost_ThrowIllegalArgumentException() throws Throwable  {
        Node node = new Node(-255);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method estimateCallCostMethod = functionInjectorClazz.getDeclaredMethod("estimateCallCost", nodeType, booleanType);
        estimateCallCostMethod.setAccessible(true);
        java.lang.Object[] estimateCallCostMethodArguments = new java.lang.Object[2];
        estimateCallCostMethodArguments[0] = node;
        estimateCallCostMethodArguments[1] = false;
        try {
            estimateCallCostMethod.invoke(null, estimateCallCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method estimateCallCost(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#estimateCallCost(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionParameters(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int numArgs = argsNode.getChildCount();
 *  */
    @Test
    public void testEstimateCallCost_ThrowNullPointerException() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.estimateCallCost] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.estimateCallCost(FunctionInjector.java:853) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method estimateCallCostMethod = functionInjectorClazz.getDeclaredMethod("estimateCallCost", nodeType, booleanType);
        estimateCallCostMethod.setAccessible(true);
        java.lang.Object[] estimateCallCostMethodArguments = new java.lang.Object[2];
        estimateCallCostMethodArguments[0] = node;
        estimateCallCostMethodArguments[1] = false;
        try {
            estimateCallCostMethod.invoke(null, estimateCallCostMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.setKnownConstants
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setKnownConstants(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#setKnownConstants(java.util.Set)}
 * @utbot.invokes {@link java.util.Set#isEmpty()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 *  */
    @Test
    public void testSetKnownConstants_PreconditionsCheckState() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        LinkedHashSet knownConstants = new LinkedHashSet();
        functionInjector.setKnownConstants(knownConstants);
        
        functionInjector.setKnownConstants(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setKnownConstants(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#setKnownConstants(java.util.Set)}
 * @utbot.invokes {@link java.util.Set#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(this.knownConstants.isEmpty());
 *  */
    @Test
    public void testSetKnownConstants_ThrowNullPointerException() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.setKnownConstants] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.setKnownConstants(FunctionInjector.java:935) */
        functionInjector.setKnownConstants(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setKnownConstants(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#setKnownConstants(java.util.Set)}
 * @utbot.invokes {@link java.util.Set#isEmpty()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(this.knownConstants.isEmpty());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetKnownConstants_ThrowIllegalStateException() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        LinkedHashSet knownConstants = new LinkedHashSet();
        String string = "";
        knownConstants.add(string);
        functionInjector.setKnownConstants(knownConstants);
        
        functionInjector.setKnownConstants(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.inlineCostDelta
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inlineCostDelta(com.google.javascript.rhino.Node, java.util.Set, com.google.javascript.jscomp.FunctionInjector$InliningMode)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineCostDelta(com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.returnsFrom {@code return -costDeltaFunctionOverhead;}
 *  */
    @Test
    public void testInlineCostDelta_ReturnNegativeCostDeltaFunctionOverhead() throws Exception  {
        int prevESTIMATED_IDENTIFIER_COST = InlineCostEstimator.ESTIMATED_IDENTIFIER_COST;
        try {
            Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
            setStaticField(inlineCostEstimatorClazz, "ESTIMATED_IDENTIFIER_COST", 2);
            Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
            node.setType(105);
            Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(first, "com.google.javascript.rhino.Node", "next", first);
            setField(node, "com.google.javascript.rhino.Node", "first", first);
            setField(node, "com.google.javascript.rhino.Node", "last", first);
            
            Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
            Class nodeType = Class.forName("com.google.javascript.rhino.Node");
            Class setType = Class.forName("java.util.Set");
            Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
            Method inlineCostDeltaMethod = functionInjectorClazz.getDeclaredMethod("inlineCostDelta", nodeType, setType, inliningModeType);
            inlineCostDeltaMethod.setAccessible(true);
            java.lang.Object[] inlineCostDeltaMethodArguments = new java.lang.Object[3];
            inlineCostDeltaMethodArguments[0] = node;
            inlineCostDeltaMethodArguments[1] = ((Object) null);
            inlineCostDeltaMethodArguments[2] = ((Object) null);
            int actual = ((Integer) inlineCostDeltaMethod.invoke(null, inlineCostDeltaMethodArguments));
            
            assertEquals(-15, actual);
        } finally {
            setStaticField(InlineCostEstimator.class, "ESTIMATED_IDENTIFIER_COST", prevESTIMATED_IDENTIFIER_COST);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineCostDelta(com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): True}
 * @utbot.returnsFrom {@code return -(costDeltaFunctionOverhead + 7);}
 *  */
    @Test
    public void testInlineCostDelta_ModeEqualsInliningModeDIRECT() throws Exception  {
        int prevESTIMATED_IDENTIFIER_COST = InlineCostEstimator.ESTIMATED_IDENTIFIER_COST;
        try {
            Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
            setStaticField(inlineCostEstimatorClazz, "ESTIMATED_IDENTIFIER_COST", 2);
            Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
            node.setType(105);
            Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
            Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(first, "com.google.javascript.rhino.Node", "next", next);
            setField(node, "com.google.javascript.rhino.Node", "first", first);
            Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(last, "com.google.javascript.rhino.Node", "first", last);
            setField(node, "com.google.javascript.rhino.Node", "last", last);
            FunctionInjector.InliningMode inliningMode = FunctionInjector.InliningMode.DIRECT;
            
            Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
            Class nodeType = Class.forName("com.google.javascript.rhino.Node");
            Class setType = Class.forName("java.util.Set");
            Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
            Method inlineCostDeltaMethod = functionInjectorClazz.getDeclaredMethod("inlineCostDelta", nodeType, setType, inliningModeType);
            inlineCostDeltaMethod.setAccessible(true);
            java.lang.Object[] inlineCostDeltaMethodArguments = new java.lang.Object[3];
            inlineCostDeltaMethodArguments[0] = node;
            inlineCostDeltaMethodArguments[1] = ((Object) null);
            inlineCostDeltaMethodArguments[2] = inliningMode;
            int actual = ((Integer) inlineCostDeltaMethod.invoke(null, inlineCostDeltaMethodArguments));
            
            assertEquals(-22, actual);
        } finally {
            setStaticField(InlineCostEstimator.class, "ESTIMATED_IDENTIFIER_COST", prevESTIMATED_IDENTIFIER_COST);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inlineCostDelta(com.google.javascript.rhino.Node, java.util.Set, com.google.javascript.jscomp.FunctionInjector$InliningMode)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineCostDelta(com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionParameters(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int paramCount = NodeUtil.getFunctionParameters(fnNode).getChildCount();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInlineCostDelta_ThrowIllegalArgumentException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Method inlineCostDeltaMethod = functionInjectorClazz.getDeclaredMethod("inlineCostDelta", numberNodeType, setType, inliningModeType);
        inlineCostDeltaMethod.setAccessible(true);
        java.lang.Object[] inlineCostDeltaMethodArguments = new java.lang.Object[3];
        inlineCostDeltaMethodArguments[0] = numberNode;
        inlineCostDeltaMethodArguments[1] = ((Object) null);
        inlineCostDeltaMethodArguments[2] = ((Object) null);
        try {
            inlineCostDeltaMethod.invoke(null, inlineCostDeltaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inlineCostDelta(com.google.javascript.rhino.Node, java.util.Set, com.google.javascript.jscomp.FunctionInjector$InliningMode)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineCostDelta(com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int paramCount = NodeUtil.getFunctionParameters(fnNode).getChildCount();
 *  */
    @Test
    public void testInlineCostDelta_ThrowNullPointerException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineCostDelta] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.inlineCostDelta(FunctionInjector.java:879) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Method inlineCostDeltaMethod = functionInjectorClazz.getDeclaredMethod("inlineCostDelta", stringNodeType, setType, inliningModeType);
        inlineCostDeltaMethod.setAccessible(true);
        java.lang.Object[] inlineCostDeltaMethodArguments = new java.lang.Object[3];
        inlineCostDeltaMethodArguments[0] = stringNode;
        inlineCostDeltaMethodArguments[1] = ((Object) null);
        inlineCostDeltaMethodArguments[2] = ((Object) null);
        try {
            inlineCostDeltaMethod.invoke(null, inlineCostDeltaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineCostDelta(com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code ((paramCount > 1)): False}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link java.util.Set#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int aliasCount = namesToAlias.size();
 *  */
    @Test
    public void testInlineCostDelta_ThrowNullPointerException_1() throws Throwable  {
        int prevESTIMATED_IDENTIFIER_COST = InlineCostEstimator.ESTIMATED_IDENTIFIER_COST;
        try {
            Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
            setStaticField(inlineCostEstimatorClazz, "ESTIMATED_IDENTIFIER_COST", 2);
            Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
            node.setType(105);
            Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
            Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(first, "com.google.javascript.rhino.Node", "next", next);
            setField(node, "com.google.javascript.rhino.Node", "first", first);
            Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(last, "com.google.javascript.rhino.Node", "first", last);
            setField(node, "com.google.javascript.rhino.Node", "last", last);
            
            /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineCostDelta] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.FunctionInjector.inlineCostDelta(FunctionInjector.java:895) */
            Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
            Class nodeType = Class.forName("com.google.javascript.rhino.Node");
            Class setType = Class.forName("java.util.Set");
            Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
            Method inlineCostDeltaMethod = functionInjectorClazz.getDeclaredMethod("inlineCostDelta", nodeType, setType, inliningModeType);
            inlineCostDeltaMethod.setAccessible(true);
            java.lang.Object[] inlineCostDeltaMethodArguments = new java.lang.Object[3];
            inlineCostDeltaMethodArguments[0] = node;
            inlineCostDeltaMethodArguments[1] = ((Object) null);
            inlineCostDeltaMethodArguments[2] = ((Object) null);
            try {
                inlineCostDeltaMethod.invoke(null, inlineCostDeltaMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(InlineCostEstimator.class, "ESTIMATED_IDENTIFIER_COST", prevESTIMATED_IDENTIFIER_COST);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#inlineCostDelta(com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode)}
 * @utbot.executesCondition {@code ((paramCount > 1)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !block.hasChildren()
 *  */
    @Test
    public void testInlineCostDelta_ThrowNullPointerException_2() throws Throwable  {
        int prevESTIMATED_IDENTIFIER_COST = InlineCostEstimator.ESTIMATED_IDENTIFIER_COST;
        try {
            Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
            setStaticField(inlineCostEstimatorClazz, "ESTIMATED_IDENTIFIER_COST", 2);
            Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
            (((Node) numberNode)).setType(105);
            Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
            Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(next, "com.google.javascript.rhino.Node", "first", first);
            setField(first, "com.google.javascript.rhino.Node", "next", next);
            setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
            
            /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.inlineCostDelta] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.FunctionInjector.inlineCostDelta(FunctionInjector.java:885) */
            Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
            Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
            Class setType = Class.forName("java.util.Set");
            Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
            Method inlineCostDeltaMethod = functionInjectorClazz.getDeclaredMethod("inlineCostDelta", numberNodeType, setType, inliningModeType);
            inlineCostDeltaMethod.setAccessible(true);
            java.lang.Object[] inlineCostDeltaMethodArguments = new java.lang.Object[3];
            inlineCostDeltaMethodArguments[0] = numberNode;
            inlineCostDeltaMethodArguments[1] = ((Object) null);
            inlineCostDeltaMethodArguments[2] = ((Object) null);
            try {
                inlineCostDeltaMethod.invoke(null, inlineCostDeltaMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(InlineCostEstimator.class, "ESTIMATED_IDENTIFIER_COST", prevESTIMATED_IDENTIFIER_COST);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inlineCostDelta(com.google.javascript.rhino.Node, java.util.Set, com.google.javascript.jscomp.FunctionInjector$InliningMode)
    
    @Test(expected = StackOverflowError.class)
    public void testInlineCostDelta1() throws Throwable  {
        int prevESTIMATED_IDENTIFIER_COST = InlineCostEstimator.ESTIMATED_IDENTIFIER_COST;
        try {
            Class inlineCostEstimatorClazz = Class.forName("com.google.javascript.jscomp.InlineCostEstimator");
            setStaticField(inlineCostEstimatorClazz, "ESTIMATED_IDENTIFIER_COST", 2);
            Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
            node.setType(105);
            Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(first, "com.google.javascript.rhino.Node", "next", first);
            Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first1, "com.google.javascript.rhino.Node", "first", first1);
            setField(first, "com.google.javascript.rhino.Node", "first", first1);
            setField(node, "com.google.javascript.rhino.Node", "first", first);
            setField(node, "com.google.javascript.rhino.Node", "last", first1);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            FunctionInjector.InliningMode inliningMode = FunctionInjector.InliningMode.BLOCK;
            
            Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
            Class nodeType = Class.forName("com.google.javascript.rhino.Node");
            Class linkedHashSetType = Class.forName("java.util.Set");
            Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
            Method inlineCostDeltaMethod = functionInjectorClazz.getDeclaredMethod("inlineCostDelta", nodeType, linkedHashSetType, inliningModeType);
            inlineCostDeltaMethod.setAccessible(true);
            java.lang.Object[] inlineCostDeltaMethodArguments = new java.lang.Object[3];
            inlineCostDeltaMethodArguments[0] = node;
            inlineCostDeltaMethodArguments[1] = linkedHashSet;
            inlineCostDeltaMethodArguments[2] = inliningMode;
            try {
                inlineCostDeltaMethod.invoke(null, inlineCostDeltaMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(InlineCostEstimator.class, "ESTIMATED_IDENTIFIER_COST", prevESTIMATED_IDENTIFIER_COST);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.canInlineReferenceAsStatementBlock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test
    public void testCanInlineReferenceAsStatementBlock_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceAsStatementBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:395)
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceAsStatementBlock(FunctionInjector.java:581) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method canInlineReferenceAsStatementBlockMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceAsStatementBlock", nodeTraversalType, nodeType, nodeType, setType);
        canInlineReferenceAsStatementBlockMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceAsStatementBlockMethodArguments = new java.lang.Object[4];
        canInlineReferenceAsStatementBlockMethodArguments[0] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[1] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[2] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[3] = ((Object) null);
        try {
            canInlineReferenceAsStatementBlockMethod.invoke(functionInjector, canInlineReferenceAsStatementBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CallSiteType callSiteType = classifyCallSite(callNode);
 *  */
    @Test
    public void testCanInlineReferenceAsStatementBlock_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceAsStatementBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:396)
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceAsStatementBlock(FunctionInjector.java:581) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method canInlineReferenceAsStatementBlockMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceAsStatementBlock", nodeTraversalType, stringNodeType, stringNodeType, setType);
        canInlineReferenceAsStatementBlockMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceAsStatementBlockMethodArguments = new java.lang.Object[4];
        canInlineReferenceAsStatementBlockMethodArguments[0] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[1] = stringNode;
        canInlineReferenceAsStatementBlockMethodArguments[2] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[3] = ((Object) null);
        try {
            canInlineReferenceAsStatementBlockMethod.invoke(functionInjector, canInlineReferenceAsStatementBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.executesCondition {@code (callSiteType == CallSiteType.UNSUPPORTED): False}
 * @utbot.executesCondition {@code (!allowDecomposition): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !callMeetsBlockInliningRequirements(t, callNode, fnNode, namesToAlias)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCanInlineReferenceAsStatementBlock_ThrowIllegalArgumentException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "allowDecomposition", true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(-255);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method canInlineReferenceAsStatementBlockMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceAsStatementBlock", nodeTraversalType, stringNodeType, stringNodeType, setType);
        canInlineReferenceAsStatementBlockMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceAsStatementBlockMethodArguments = new java.lang.Object[4];
        canInlineReferenceAsStatementBlockMethodArguments[0] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[1] = stringNode;
        canInlineReferenceAsStatementBlockMethodArguments[2] = node;
        canInlineReferenceAsStatementBlockMethodArguments[3] = ((Object) null);
        try {
            canInlineReferenceAsStatementBlockMethod.invoke(functionInjector, canInlineReferenceAsStatementBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.executesCondition {@code (callSiteType == CallSiteType.UNSUPPORTED): False}
 * @utbot.executesCondition {@code (!allowDecomposition): True}
 * @utbot.executesCondition {@code (callSiteType == CallSiteType.DECOMPOSABLE_EXPRESSION): False}
 * @utbot.executesCondition {@code (callSiteType == CallSiteType.EXPRESSION): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !callMeetsBlockInliningRequirements(t, callNode, fnNode, namesToAlias)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCanInlineReferenceAsStatementBlock_ThrowIllegalArgumentException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = new Node(0);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method canInlineReferenceAsStatementBlockMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceAsStatementBlock", nodeTraversalType, nodeType, nodeType, setType);
        canInlineReferenceAsStatementBlockMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceAsStatementBlockMethodArguments = new java.lang.Object[4];
        canInlineReferenceAsStatementBlockMethodArguments[0] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[1] = node;
        canInlineReferenceAsStatementBlockMethodArguments[2] = node1;
        canInlineReferenceAsStatementBlockMethodArguments[3] = ((Object) null);
        try {
            canInlineReferenceAsStatementBlockMethod.invoke(functionInjector, canInlineReferenceAsStatementBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCanInlineReferenceAsStatementBlock_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 43);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method canInlineReferenceAsStatementBlockMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceAsStatementBlock", nodeTraversalType, numberNodeType, numberNodeType, setType);
        canInlineReferenceAsStatementBlockMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceAsStatementBlockMethodArguments = new java.lang.Object[4];
        canInlineReferenceAsStatementBlockMethodArguments[0] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[1] = numberNode;
        canInlineReferenceAsStatementBlockMethodArguments[2] = ((Object) null);
        canInlineReferenceAsStatementBlockMethodArguments[3] = ((Object) null);
        try {
            canInlineReferenceAsStatementBlockMethod.invoke(functionInjector, canInlineReferenceAsStatementBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.callMeetsBlockInliningRequirements
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method callMeetsBlockInliningRequirements(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#callMeetsBlockInliningRequirements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeUtil.getFunctionBody(fnNode)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCallMeetsBlockInliningRequirements_ThrowIllegalArgumentException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method callMeetsBlockInliningRequirementsMethod = functionInjectorClazz.getDeclaredMethod("callMeetsBlockInliningRequirements", nodeTraversalType, nodeType, nodeType, setType);
        callMeetsBlockInliningRequirementsMethod.setAccessible(true);
        java.lang.Object[] callMeetsBlockInliningRequirementsMethodArguments = new java.lang.Object[4];
        callMeetsBlockInliningRequirementsMethodArguments[0] = ((Object) null);
        callMeetsBlockInliningRequirementsMethodArguments[1] = ((Object) null);
        callMeetsBlockInliningRequirementsMethodArguments[2] = stringNode;
        callMeetsBlockInliningRequirementsMethodArguments[3] = ((Object) null);
        try {
            callMeetsBlockInliningRequirementsMethod.invoke(functionInjector, callMeetsBlockInliningRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#callMeetsBlockInliningRequirements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#has(com.google.javascript.rhino.Node,com.google.common.base.Predicate,com.google.common.base.Predicate)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: boolean fnContainsVars = NodeUtil.has(NodeUtil.getFunctionBody(fnNode), new NodeUtil.MatchDeclaration(), new NodeUtil.MatchShallowStatement());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCallMeetsBlockInliningRequirements_ThrowIllegalStateException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method callMeetsBlockInliningRequirementsMethod = functionInjectorClazz.getDeclaredMethod("callMeetsBlockInliningRequirements", nodeTraversalType, nodeType, nodeType, setType);
        callMeetsBlockInliningRequirementsMethod.setAccessible(true);
        java.lang.Object[] callMeetsBlockInliningRequirementsMethodArguments = new java.lang.Object[4];
        callMeetsBlockInliningRequirementsMethodArguments[0] = ((Object) null);
        callMeetsBlockInliningRequirementsMethodArguments[1] = ((Object) null);
        callMeetsBlockInliningRequirementsMethodArguments[2] = stringNode;
        callMeetsBlockInliningRequirementsMethodArguments[3] = ((Object) null);
        try {
            callMeetsBlockInliningRequirementsMethod.invoke(functionInjector, callMeetsBlockInliningRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method callMeetsBlockInliningRequirements(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#callMeetsBlockInliningRequirements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !t.inGlobalScope()
 *  */
    @Test
    public void testCallMeetsBlockInliningRequirements_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.callMeetsBlockInliningRequirements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.callMeetsBlockInliningRequirements(FunctionInjector.java:630) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method callMeetsBlockInliningRequirementsMethod = functionInjectorClazz.getDeclaredMethod("callMeetsBlockInliningRequirements", nodeTraversalType, nodeType, nodeType, setType);
        callMeetsBlockInliningRequirementsMethod.setAccessible(true);
        java.lang.Object[] callMeetsBlockInliningRequirementsMethodArguments = new java.lang.Object[4];
        callMeetsBlockInliningRequirementsMethodArguments[0] = ((Object) null);
        callMeetsBlockInliningRequirementsMethodArguments[1] = ((Object) null);
        callMeetsBlockInliningRequirementsMethodArguments[2] = stringNode;
        callMeetsBlockInliningRequirementsMethodArguments[3] = ((Object) null);
        try {
            callMeetsBlockInliningRequirementsMethod.invoke(functionInjector, callMeetsBlockInliningRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#callMeetsBlockInliningRequirements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !t.inGlobalScope()
 *  */
    @Test
    public void testCallMeetsBlockInliningRequirements_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(126);
        setField(last, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.callMeetsBlockInliningRequirements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.callMeetsBlockInliningRequirements(FunctionInjector.java:630) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Method callMeetsBlockInliningRequirementsMethod = functionInjectorClazz.getDeclaredMethod("callMeetsBlockInliningRequirements", nodeTraversalType, nodeType, nodeType, setType);
        callMeetsBlockInliningRequirementsMethod.setAccessible(true);
        java.lang.Object[] callMeetsBlockInliningRequirementsMethodArguments = new java.lang.Object[4];
        callMeetsBlockInliningRequirementsMethodArguments[0] = ((Object) null);
        callMeetsBlockInliningRequirementsMethodArguments[1] = ((Object) null);
        callMeetsBlockInliningRequirementsMethodArguments[2] = stringNode;
        callMeetsBlockInliningRequirementsMethodArguments[3] = ((Object) null);
        try {
            callMeetsBlockInliningRequirementsMethod.invoke(functionInjector, callMeetsBlockInliningRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.canInlineReferenceDirectly
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canInlineReferenceDirectly(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isDirectCallNodeReplacementPossible(fnNode)): True}
 * @utbot.returnsFrom {@code return CanInlineResult.NO;}
 *  */
    @Test
    public void testCanInlineReferenceDirectly_NotIsDirectCallNodeReplacementPossible_1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(last, "com.google.javascript.rhino.Node", "last", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method canInlineReferenceDirectlyMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceDirectly", nodeType, nodeType);
        canInlineReferenceDirectlyMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceDirectlyMethodArguments = new java.lang.Object[2];
        canInlineReferenceDirectlyMethodArguments[0] = ((Object) null);
        canInlineReferenceDirectlyMethodArguments[1] = stringNode;
        FunctionInjector.CanInlineResult actual = ((FunctionInjector.CanInlineResult) canInlineReferenceDirectlyMethod.invoke(functionInjector, canInlineReferenceDirectlyMethodArguments));
        
        FunctionInjector.CanInlineResult expected = FunctionInjector.CanInlineResult.NO;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isDirectCallNodeReplacementPossible(fnNode)): True}
 * @utbot.returnsFrom {@code return CanInlineResult.NO;}
 *  */
    @Test
    public void testCanInlineReferenceDirectly_NotIsDirectCallNodeReplacementPossible() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method canInlineReferenceDirectlyMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceDirectly", nodeType, nodeType);
        canInlineReferenceDirectlyMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceDirectlyMethodArguments = new java.lang.Object[2];
        canInlineReferenceDirectlyMethodArguments[0] = ((Object) null);
        canInlineReferenceDirectlyMethodArguments[1] = stringNode;
        FunctionInjector.CanInlineResult actual = ((FunctionInjector.CanInlineResult) canInlineReferenceDirectlyMethod.invoke(functionInjector, canInlineReferenceDirectlyMethodArguments));
        
        FunctionInjector.CanInlineResult expected = FunctionInjector.CanInlineResult.NO;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isDirectCallNodeReplacementPossible(fnNode)): True}
 * @utbot.returnsFrom {@code return CanInlineResult.NO;}
 *  */
    @Test
    public void testCanInlineReferenceDirectly_NotIsDirectCallNodeReplacementPossible_2() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(4);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(last, "com.google.javascript.rhino.Node", "last", first);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method canInlineReferenceDirectlyMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceDirectly", nodeType, nodeType);
        canInlineReferenceDirectlyMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceDirectlyMethodArguments = new java.lang.Object[2];
        canInlineReferenceDirectlyMethodArguments[0] = ((Object) null);
        canInlineReferenceDirectlyMethodArguments[1] = node;
        FunctionInjector.CanInlineResult actual = ((FunctionInjector.CanInlineResult) canInlineReferenceDirectlyMethod.invoke(functionInjector, canInlineReferenceDirectlyMethodArguments));
        
        FunctionInjector.CanInlineResult expected = FunctionInjector.CanInlineResult.NO;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isDirectCallNodeReplacementPossible(fnNode)): False}
 * @utbot.executesCondition {@code (!callNode.getFirstChild().isName()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionParameters(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code while(cArg != null || fnParam != null)} once
 * @utbot.returnsFrom {@code return CanInlineResult.YES;}
 *  */
    @Test
    public void testCanInlineReferenceDirectly_CArgEqualsNullOrFnParamEqualsNull() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(105);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", last);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method canInlineReferenceDirectlyMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceDirectly", stringNodeType, stringNodeType);
        canInlineReferenceDirectlyMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceDirectlyMethodArguments = new java.lang.Object[2];
        canInlineReferenceDirectlyMethodArguments[0] = stringNode;
        canInlineReferenceDirectlyMethodArguments[1] = stringNode1;
        FunctionInjector.CanInlineResult actual = ((FunctionInjector.CanInlineResult) canInlineReferenceDirectlyMethod.invoke(functionInjector, canInlineReferenceDirectlyMethodArguments));
        
        FunctionInjector.CanInlineResult expected = FunctionInjector.CanInlineResult.YES;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method canInlineReferenceDirectly(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.FunctionInjector#isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isDirectCallNodeReplacementPossible(fnNode)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCanInlineReferenceDirectly_ThrowIllegalArgumentException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method canInlineReferenceDirectlyMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceDirectly", nodeType, nodeType);
        canInlineReferenceDirectlyMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceDirectlyMethodArguments = new java.lang.Object[2];
        canInlineReferenceDirectlyMethodArguments[0] = ((Object) null);
        canInlineReferenceDirectlyMethodArguments[1] = stringNode;
        try {
            canInlineReferenceDirectlyMethod.invoke(functionInjector, canInlineReferenceDirectlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canInlineReferenceDirectly(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node cArg = callNode.getFirstChild().getNext();
 *  */
    @Test
    public void testCanInlineReferenceDirectly_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(4);
        setField(last, "com.google.javascript.rhino.Node", "first", last);
        setField(last, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceDirectly] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceDirectly(FunctionInjector.java:699) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method canInlineReferenceDirectlyMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceDirectly", nodeType, nodeType);
        canInlineReferenceDirectlyMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceDirectlyMethodArguments = new java.lang.Object[2];
        canInlineReferenceDirectlyMethodArguments[0] = ((Object) null);
        canInlineReferenceDirectlyMethodArguments[1] = stringNode;
        try {
            canInlineReferenceDirectlyMethod.invoke(functionInjector, canInlineReferenceDirectlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node cArg = callNode.getFirstChild().getNext();
 *  */
    @Test
    public void testCanInlineReferenceDirectly_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceDirectly] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceDirectly(FunctionInjector.java:699) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method canInlineReferenceDirectlyMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceDirectly", nodeType, nodeType);
        canInlineReferenceDirectlyMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceDirectlyMethodArguments = new java.lang.Object[2];
        canInlineReferenceDirectlyMethodArguments[0] = node;
        canInlineReferenceDirectlyMethodArguments[1] = stringNode;
        try {
            canInlineReferenceDirectlyMethod.invoke(functionInjector, canInlineReferenceDirectlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!callNode.getFirstChild().isName()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionParameters(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node fnParam = NodeUtil.getFunctionParameters(fnNode).getFirstChild();
 *  */
    @Test
    public void testCanInlineReferenceDirectly_ThrowNullPointerException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceDirectly] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceDirectly(FunctionInjector.java:718) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method canInlineReferenceDirectlyMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceDirectly", nodeType, nodeType);
        canInlineReferenceDirectlyMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceDirectlyMethodArguments = new java.lang.Object[2];
        canInlineReferenceDirectlyMethodArguments[0] = node;
        canInlineReferenceDirectlyMethodArguments[1] = stringNode;
        try {
            canInlineReferenceDirectlyMethod.invoke(functionInjector, canInlineReferenceDirectlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set, com.google.javascript.jscomp.FunctionInjector$InliningMode, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode,boolean,boolean)}
 * @utbot.executesCondition {@code (referencesThis): True}
 * @utbot.executesCondition {@code (!NodeUtil.isFunctionObjectCall(callNode)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionObjectCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return CanInlineResult.NO;}
 *  */
    @Test
    public void testCanInlineReferenceToFunction_NotNodeUtilIsFunctionObjectCall() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        FunctionInjector.CanInlineResult actual = functionInjector.canInlineReferenceToFunction(null, node, null, null, null, true, false);
        
        FunctionInjector.CanInlineResult expected = FunctionInjector.CanInlineResult.NO;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode,boolean,boolean)}
 * @utbot.executesCondition {@code (referencesThis): False}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): True}
 * @utbot.invokes com.google.javascript.jscomp.FunctionInjector#canInlineReferenceDirectly(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.returnsFrom {@code return canInlineReferenceDirectly(callNode, fnNode);}
 *  */
    @Test
    public void testCanInlineReferenceToFunction_ModeEqualsInliningModeDIRECT() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(105);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", first);
        FunctionInjector.InliningMode inliningMode = FunctionInjector.InliningMode.DIRECT;
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Class booleanType = boolean.class;
        Method canInlineReferenceToFunctionMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceToFunction", nodeTraversalType, stringNodeType, stringNodeType, setType, inliningModeType, booleanType, booleanType);
        canInlineReferenceToFunctionMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceToFunctionMethodArguments = new java.lang.Object[7];
        canInlineReferenceToFunctionMethodArguments[0] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[1] = stringNode;
        canInlineReferenceToFunctionMethodArguments[2] = stringNode1;
        canInlineReferenceToFunctionMethodArguments[3] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[4] = inliningMode;
        canInlineReferenceToFunctionMethodArguments[5] = false;
        canInlineReferenceToFunctionMethodArguments[6] = false;
        FunctionInjector.CanInlineResult actual = ((FunctionInjector.CanInlineResult) canInlineReferenceToFunctionMethod.invoke(functionInjector, canInlineReferenceToFunctionMethodArguments));
        
        FunctionInjector.CanInlineResult expected = FunctionInjector.CanInlineResult.NO;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set, com.google.javascript.jscomp.FunctionInjector$InliningMode, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !isSupportedCallType(callNode)
 *  */
    @Test
    public void testCanInlineReferenceToFunction_ThrowNullPointerException() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.isSupportedCallType(FunctionInjector.java:221)
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction(FunctionInjector.java:180) */
        functionInjector.canInlineReferenceToFunction(null, null, null, null, null, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !isSupportedCallType(callNode)
 *  */
    @Test
    public void testCanInlineReferenceToFunction_ThrowNullPointerException_1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.isSupportedCallType(FunctionInjector.java:221)
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction(FunctionInjector.java:180) */
        functionInjector.canInlineReferenceToFunction(null, node, null, null, null, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode,boolean,boolean)}
 * @utbot.executesCondition {@code (!isSupportedCallType(callNode)): False}
 * @utbot.executesCondition {@code (containsFunctions): True}
 * @utbot.executesCondition {@code (!assumeMinimumCapture): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !assumeMinimumCapture && !t.inGlobalScope()
 *  */
    @Test
    public void testCanInlineReferenceToFunction_ThrowNullPointerException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction(FunctionInjector.java:189) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Class booleanType = boolean.class;
        Method canInlineReferenceToFunctionMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceToFunction", nodeTraversalType, stringNodeType, stringNodeType, setType, inliningModeType, booleanType, booleanType);
        canInlineReferenceToFunctionMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceToFunctionMethodArguments = new java.lang.Object[7];
        canInlineReferenceToFunctionMethodArguments[0] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[1] = stringNode;
        canInlineReferenceToFunctionMethodArguments[2] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[3] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[4] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[5] = false;
        canInlineReferenceToFunctionMethodArguments[6] = true;
        try {
            canInlineReferenceToFunctionMethod.invoke(functionInjector, canInlineReferenceToFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector.InliningMode,boolean,boolean)}
 * @utbot.executesCondition {@code (!isSupportedCallType(callNode)): False}
 * @utbot.executesCondition {@code (containsFunctions): False}
 * @utbot.executesCondition {@code (referencesThis): False}
 * @utbot.executesCondition {@code (mode == InliningMode.DIRECT): False}
 * @utbot.invokes com.google.javascript.jscomp.FunctionInjector#canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return canInlineReferenceAsStatementBlock(t, callNode, fnNode, needAliases);
 *  */
    @Test
    public void testCanInlineReferenceToFunction_ThrowNullPointerException_3() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.classifyCallSite(FunctionInjector.java:396)
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceAsStatementBlock(FunctionInjector.java:581)
            com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction(FunctionInjector.java:210) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class setType = Class.forName("java.util.Set");
        Class inliningModeType = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        Class booleanType = boolean.class;
        Method canInlineReferenceToFunctionMethod = functionInjectorClazz.getDeclaredMethod("canInlineReferenceToFunction", nodeTraversalType, numberNodeType, numberNodeType, setType, inliningModeType, booleanType, booleanType);
        canInlineReferenceToFunctionMethod.setAccessible(true);
        java.lang.Object[] canInlineReferenceToFunctionMethodArguments = new java.lang.Object[7];
        canInlineReferenceToFunctionMethodArguments[0] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[1] = numberNode;
        canInlineReferenceToFunctionMethodArguments[2] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[3] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[4] = ((Object) null);
        canInlineReferenceToFunctionMethodArguments[5] = false;
        canInlineReferenceToFunctionMethodArguments[6] = false;
        try {
            canInlineReferenceToFunctionMethod.invoke(functionInjector, canInlineReferenceToFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.isSupportedCallType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupportedCallType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportedCallType_ReturnTrue() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", nodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = node;
        boolean actual = ((Boolean) isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportedCallType_ReturnTrue_1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", stringNodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportedCallType_ReturnTrue_4() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", nodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = node;
        boolean actual = ((Boolean) isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportedCallType_ReturnTrue_3() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", stringNodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportedCallType_ReturnTrue_2() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", nodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = node;
        boolean actual = ((Boolean) isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!assumeStrictThis): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportedCallType_AssumeStrictThis() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "assumeStrictThis", true);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", nodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = node;
        boolean actual = ((Boolean) isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!assumeStrictThis): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsSupportedCallType_AssumeStrictThis_1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "assumeStrictThis", true);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "call";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) last)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", nodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = node;
        boolean actual = ((Boolean) isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSupportedCallType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !callNode.getFirstChild().isName()
 *  */
    @Test
    public void testIsSupportedCallType_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.isSupportedCallType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.isSupportedCallType(FunctionInjector.java:221) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", nodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = ((Object) null);
        try {
            isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !callNode.getFirstChild().isName()
 *  */
    @Test
    public void testIsSupportedCallType_ThrowNullPointerException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.isSupportedCallType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.isSupportedCallType(FunctionInjector.java:221) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", stringNodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = stringNode;
        try {
            isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSupportedCallType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isSupportedCallType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionObjectCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: NodeUtil.isFunctionObjectCall(callNode)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsSupportedCallType_ThrowIllegalStateException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isSupportedCallTypeMethod = functionInjectorClazz.getDeclaredMethod("isSupportedCallType", nodeType);
        isSupportedCallTypeMethod.setAccessible(true);
        java.lang.Object[] isSupportedCallTypeMethodArguments = new java.lang.Object[1];
        isSupportedCallTypeMethodArguments[0] = node;
        try {
            isSupportedCallTypeMethod.invoke(functionInjector, isSupportedCallTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.isDirectCallNodeReplacementPossible
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!block.hasChildren()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionBody(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 *  */
    @Test
    public void testIsDirectCallNodeReplacementPossible_NotBlockHasChildren() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        boolean actual = functionInjector.isDirectCallNodeReplacementPossible(node);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#getFunctionBody(com.google.javascript.rhino.Node)} once,
    ///     {@link com.google.javascript.rhino.Node#hasChildren()} once
    /// execute conditions:
    ///     {@code (!block.hasChildren()): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#hasOneChild()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (block.hasOneChild()): True}
 * @utbot.executesCondition {@code (block.getFirstChild().isReturn()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDirectCallNodeReplacementPossible_NotBlockGetFirstChildIsReturn() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(last, "com.google.javascript.rhino.Node", "last", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDirectCallNodeReplacementPossibleMethod = functionInjectorClazz.getDeclaredMethod("isDirectCallNodeReplacementPossible", stringNodeType);
        isDirectCallNodeReplacementPossibleMethod.setAccessible(true);
        java.lang.Object[] isDirectCallNodeReplacementPossibleMethodArguments = new java.lang.Object[1];
        isDirectCallNodeReplacementPossibleMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isDirectCallNodeReplacementPossibleMethod.invoke(functionInjector, isDirectCallNodeReplacementPossibleMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (block.hasOneChild()): True}
 * @utbot.executesCondition {@code (block.getFirstChild().isReturn()): True}
 * @utbot.executesCondition {@code (block.getFirstChild().getFirstChild() != null): True}
 *  */
    @Test
    public void testIsDirectCallNodeReplacementPossible_BlockGetFirstChildGetFirstChildNotEqualsNull() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(4);
        setField(first, "com.google.javascript.rhino.Node", "first", last);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(last, "com.google.javascript.rhino.Node", "last", first);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        boolean actual = functionInjector.isDirectCallNodeReplacementPossible(node);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (block.hasOneChild()): True}
 * @utbot.executesCondition {@code (block.getFirstChild().isReturn()): True}
 * @utbot.executesCondition {@code (block.getFirstChild().getFirstChild() != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDirectCallNodeReplacementPossible_BlockGetFirstChildGetFirstChildEqualsNull() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(4);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(last, "com.google.javascript.rhino.Node", "last", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDirectCallNodeReplacementPossibleMethod = functionInjectorClazz.getDeclaredMethod("isDirectCallNodeReplacementPossible", stringNodeType);
        isDirectCallNodeReplacementPossibleMethod.setAccessible(true);
        java.lang.Object[] isDirectCallNodeReplacementPossibleMethodArguments = new java.lang.Object[1];
        isDirectCallNodeReplacementPossibleMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isDirectCallNodeReplacementPossibleMethod.invoke(functionInjector, isDirectCallNodeReplacementPossibleMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (block.hasOneChild()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDirectCallNodeReplacementPossible_NotBlockHasOneChild() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDirectCallNodeReplacementPossibleMethod = functionInjectorClazz.getDeclaredMethod("isDirectCallNodeReplacementPossible", stringNodeType);
        isDirectCallNodeReplacementPossibleMethod.setAccessible(true);
        java.lang.Object[] isDirectCallNodeReplacementPossibleMethodArguments = new java.lang.Object[1];
        isDirectCallNodeReplacementPossibleMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isDirectCallNodeReplacementPossibleMethod.invoke(functionInjector, isDirectCallNodeReplacementPossibleMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionBody(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node block = NodeUtil.getFunctionBody(fnNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsDirectCallNodeReplacementPossible_ThrowIllegalArgumentException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDirectCallNodeReplacementPossibleMethod = functionInjectorClazz.getDeclaredMethod("isDirectCallNodeReplacementPossible", stringNodeType);
        isDirectCallNodeReplacementPossibleMethod.setAccessible(true);
        java.lang.Object[] isDirectCallNodeReplacementPossibleMethodArguments = new java.lang.Object[1];
        isDirectCallNodeReplacementPossibleMethodArguments[0] = stringNode;
        try {
            isDirectCallNodeReplacementPossibleMethod.invoke(functionInjector, isDirectCallNodeReplacementPossibleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getFunctionBody(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !block.hasChildren()
 *  */
    @Test
    public void testIsDirectCallNodeReplacementPossible_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.isDirectCallNodeReplacementPossible] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.isDirectCallNodeReplacementPossible(FunctionInjector.java:548) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDirectCallNodeReplacementPossibleMethod = functionInjectorClazz.getDeclaredMethod("isDirectCallNodeReplacementPossible", stringNodeType);
        isDirectCallNodeReplacementPossibleMethod.setAccessible(true);
        java.lang.Object[] isDirectCallNodeReplacementPossibleMethodArguments = new java.lang.Object[1];
        isDirectCallNodeReplacementPossibleMethodArguments[0] = stringNode;
        try {
            isDirectCallNodeReplacementPossibleMethod.invoke(functionInjector, isDirectCallNodeReplacementPossibleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doesFunctionMeetMinimumRequirements(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node block = NodeUtil.getFunctionBody(fnNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDoesFunctionMeetMinimumRequirements_ThrowIllegalArgumentException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doesFunctionMeetMinimumRequirementsMethod = functionInjectorClazz.getDeclaredMethod("doesFunctionMeetMinimumRequirements", stringType, stringNodeType);
        doesFunctionMeetMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] doesFunctionMeetMinimumRequirementsMethodArguments = new java.lang.Object[2];
        doesFunctionMeetMinimumRequirementsMethodArguments[0] = ((Object) null);
        doesFunctionMeetMinimumRequirementsMethodArguments[1] = stringNode;
        try {
            doesFunctionMeetMinimumRequirementsMethod.invoke(functionInjector, doesFunctionMeetMinimumRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final String fnRecursionName = fnNode.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDoesFunctionMeetMinimumRequirements_ThrowIllegalStateException_1() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object defaultCodingConvention = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doesFunctionMeetMinimumRequirementsMethod = functionInjectorClazz.getDeclaredMethod("doesFunctionMeetMinimumRequirements", stringType, stringNodeType);
        doesFunctionMeetMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] doesFunctionMeetMinimumRequirementsMethodArguments = new java.lang.Object[2];
        doesFunctionMeetMinimumRequirementsMethodArguments[0] = ((Object) null);
        doesFunctionMeetMinimumRequirementsMethodArguments[1] = stringNode;
        try {
            doesFunctionMeetMinimumRequirementsMethod.invoke(functionInjector, doesFunctionMeetMinimumRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final String fnRecursionName = fnNode.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDoesFunctionMeetMinimumRequirements_ThrowIllegalStateException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object defaultCodingConvention = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doesFunctionMeetMinimumRequirementsMethod = functionInjectorClazz.getDeclaredMethod("doesFunctionMeetMinimumRequirements", stringType, stringNodeType);
        doesFunctionMeetMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] doesFunctionMeetMinimumRequirementsMethodArguments = new java.lang.Object[2];
        doesFunctionMeetMinimumRequirementsMethodArguments[0] = ((Object) null);
        doesFunctionMeetMinimumRequirementsMethodArguments[1] = stringNode;
        try {
            doesFunctionMeetMinimumRequirementsMethod.invoke(functionInjector, doesFunctionMeetMinimumRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(fnRecursionName != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDoesFunctionMeetMinimumRequirements_ThrowIllegalStateException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object defaultCodingConvention = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doesFunctionMeetMinimumRequirementsMethod = functionInjectorClazz.getDeclaredMethod("doesFunctionMeetMinimumRequirements", stringType, stringNodeType);
        doesFunctionMeetMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] doesFunctionMeetMinimumRequirementsMethodArguments = new java.lang.Object[2];
        doesFunctionMeetMinimumRequirementsMethodArguments[0] = ((Object) null);
        doesFunctionMeetMinimumRequirementsMethodArguments[1] = stringNode;
        try {
            doesFunctionMeetMinimumRequirementsMethod.invoke(functionInjector, doesFunctionMeetMinimumRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doesFunctionMeetMinimumRequirements(java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !compiler.getCodingConvention().isInlinableFunction(fnNode)
 *  */
    @Test
    public void testDoesFunctionMeetMinimumRequirements_ThrowNullPointerException() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements(FunctionInjector.java:131) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doesFunctionMeetMinimumRequirementsMethod = functionInjectorClazz.getDeclaredMethod("doesFunctionMeetMinimumRequirements", stringType, stringNodeType);
        doesFunctionMeetMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] doesFunctionMeetMinimumRequirementsMethodArguments = new java.lang.Object[2];
        doesFunctionMeetMinimumRequirementsMethodArguments[0] = ((Object) null);
        doesFunctionMeetMinimumRequirementsMethodArguments[1] = stringNode;
        try {
            doesFunctionMeetMinimumRequirementsMethod.invoke(functionInjector, doesFunctionMeetMinimumRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !compiler.getCodingConvention().isInlinableFunction(fnNode)
 *  */
    @Test
    public void testDoesFunctionMeetMinimumRequirements_ThrowNullPointerException_1() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements(FunctionInjector.java:131) */
        functionInjector.doesFunctionMeetMinimumRequirements(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String fnRecursionName = fnNode.getFirstChild().getString();
 *  */
    @Test
    public void testDoesFunctionMeetMinimumRequirements_ThrowNullPointerException_3() throws Exception  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        ClosureCodingConvention nextConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Object nextConvention1 = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements(FunctionInjector.java:135) */
        functionInjector.doesFunctionMeetMinimumRequirements(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String fnRecursionName = fnNode.getFirstChild().getString();
 *  */
    @Test
    public void testDoesFunctionMeetMinimumRequirements_ThrowNullPointerException_4() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        JqueryCodingConvention codingConvention = ((JqueryCodingConvention) createInstance("com.google.javascript.jscomp.JqueryCodingConvention"));
        Object nextConvention = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements(FunctionInjector.java:135) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doesFunctionMeetMinimumRequirementsMethod = functionInjectorClazz.getDeclaredMethod("doesFunctionMeetMinimumRequirements", stringType, stringNodeType);
        doesFunctionMeetMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] doesFunctionMeetMinimumRequirementsMethodArguments = new java.lang.Object[2];
        doesFunctionMeetMinimumRequirementsMethodArguments[0] = ((Object) null);
        doesFunctionMeetMinimumRequirementsMethodArguments[1] = stringNode;
        try {
            doesFunctionMeetMinimumRequirementsMethod.invoke(functionInjector, doesFunctionMeetMinimumRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionInjector}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionInjector#doesFunctionMeetMinimumRequirements(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String fnRecursionName = fnNode.getFirstChild().getString();
 *  */
    @Test
    public void testDoesFunctionMeetMinimumRequirements_ThrowNullPointerException_2() throws Throwable  {
        FunctionInjector functionInjector = ((FunctionInjector) createInstance("com.google.javascript.jscomp.FunctionInjector"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object defaultCodingConvention = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(functionInjector, "com.google.javascript.jscomp.FunctionInjector", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements(FunctionInjector.java:135) */
        Class functionInjectorClazz = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doesFunctionMeetMinimumRequirementsMethod = functionInjectorClazz.getDeclaredMethod("doesFunctionMeetMinimumRequirements", stringType, stringNodeType);
        doesFunctionMeetMinimumRequirementsMethod.setAccessible(true);
        java.lang.Object[] doesFunctionMeetMinimumRequirementsMethodArguments = new java.lang.Object[2];
        doesFunctionMeetMinimumRequirementsMethodArguments[0] = ((Object) null);
        doesFunctionMeetMinimumRequirementsMethodArguments[1] = stringNode;
        try {
            doesFunctionMeetMinimumRequirementsMethod.invoke(functionInjector, doesFunctionMeetMinimumRequirementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields904808901418200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields904808901418200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass904808901425900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields904808901418200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass904808901425900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields904808901730500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields904808901730500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass904808901733700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields904808901730500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass904808901733700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields904808905023700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields904808905023700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass904808905026800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields904808905023700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass904808905026800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields904808905401400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields904808905401400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass904808905403900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields904808905401400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass904808905403900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

