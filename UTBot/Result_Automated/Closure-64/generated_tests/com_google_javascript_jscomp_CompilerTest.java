package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.List;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import java.util.ArrayList;
import com.google.javascript.jscomp.Compiler.IntermediateState;
import com.google.javascript.jscomp.PassConfig.State;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import java.util.Map;
import java.util.Set;
import com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import java.util.TreeMap;
import com.google.javascript.jscomp.ant.AntErrorManager;
import java.io.PrintStream;
import com.google.javascript.jscomp.SourceMap.Format;
import com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.CodeChangeHandler.RecentChange;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.LinkedList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.jscomp.SourceMap.DetailLevel;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.jscomp.Compiler.CodeBuilder;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import java.lang.reflect.Constructor;
import com.google.javascript.jscomp.PassConfig.PassConfigDelegate;
import com.google.javascript.jscomp.CssRenamingMap.Style;
import com.google.javascript.jscomp.parsing.Config;
import sun.security.util.ByteArrayLexOrder;
import java.util.ArrayDeque;
import org.junit.Ignore;
import java.util.concurrent.Callable;
import com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt;
import com.google.javascript.jscomp.CompilerOptions.TweakProcessing;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import java.text.MessageFormat;
import com.google.common.base.Function;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor;
import com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor;
import com.google.common.base.Supplier;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.util.Collections.emptyList;

public final class com_google_javascript_jscomp_CompilerTest {
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Lists.<JSModule>newArrayList(modules)
 *  */
    @Test(expected = NullPointerException.class)
    public void testCompile_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null};
        
        compiler.compile(jSSourceFileArray, ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compileModules(Lists.<JSSourceFile>newArrayList(externs), Lists.<JSModule>newArrayList(modules), options);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCompile_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.compile(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.compileModules(Compiler.java:541)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:521) */
        compiler.compile(jSSourceFileArray, jSModuleArray, ((CompilerOptions) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compile(Lists.<JSSourceFile>newArrayList(externs), Lists.<JSSourceFile>newArrayList(inputs), options);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCompile_ThrowNullPointerException1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.compile(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test(expected = NullPointerException.class)
    public void testCompile2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compiler.compile(jSSourceFileArray, ((com.google.javascript.jscomp.JSSourceFile[]) null), compilerOptions);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:509)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:489) */
        compiler.compile(jSSourceFileArray, jSSourceFileArray1, ((CompilerOptions) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile(java.util.List, java.util.List, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (Preconditions.checkState(jsRoot == null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(jsRoot == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompile_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ScriptOrFnNode jsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        compiler.compile(((List) null), ((List) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile(java.util.List, java.util.List, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:509) */
        compiler.compile(((List) null), ((List) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compile()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<Result>() {
 * 
 *     public Result call() throws Exception {
 *         compileInternal();
 *         return getResult();
 *     }
 * });
 *  */
    @Test
    public void testCompile_ThrowNullPointerException2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:548) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileMethod = compilerClazz.getDeclaredMethod("compile");
        compileMethod.setAccessible(true);
        java.lang.Object[] compileMethodArguments = new java.lang.Object[0];
        try {
            compileMethod.invoke(compiler, compileMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<Result>() {
 * 
 *     public Result call() throws Exception {
 *         compileInternal();
 *         return getResult();
 *     }
 * });
 *  */
    @Test
    public void testCompile_ThrowNullPointerException_11() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:548) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileMethod = compilerClazz.getDeclaredMethod("compile");
        compileMethod.setAccessible(true);
        java.lang.Object[] compileMethodArguments = new java.lang.Object[0];
        try {
            compileMethod.invoke(compiler, compileMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile()
    
    @Test(expected = RuntimeException.class)
    public void testCompile5() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileMethod = compilerClazz.getDeclaredMethod("compile");
        compileMethod.setAccessible(true);
        java.lang.Object[] compileMethodArguments = new java.lang.Object[0];
        try {
            compileMethod.invoke(compiler, compileMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testCompile6() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileMethod = compilerClazz.getDeclaredMethod("compile");
        compileMethod.setAccessible(true);
        java.lang.Object[] compileMethodArguments = new java.lang.Object[0];
        try {
            compileMethod.invoke(compiler, compileMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile(com.google.javascript.jscomp.JSSourceFile, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compile(new JSSourceFile[] { extern }, input, options);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCompile_ThrowNullPointerException3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.compile(((JSSourceFile) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile(com.google.javascript.jscomp.JSSourceFile, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:509)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:475) */
        compiler.compile(((JSSourceFile) null), jSSourceFileArray, compilerOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile(com.google.javascript.jscomp.JSSourceFile, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return compile(new JSSourceFile[] { extern }, modules, options);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCompile_ThrowNullPointerException4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.compile(((JSSourceFile) null), ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile(com.google.javascript.jscomp.JSSourceFile, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.compileModules(Compiler.java:541)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:521)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:480) */
        compiler.compile(((JSSourceFile) null), jSModuleArray, compilerOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.init
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Lists.<JSModule>newArrayList(modules)
 *  */
    @Test(expected = NullPointerException.class)
    public void testInit_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null};
        
        compiler.init(jSSourceFileArray, ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initModules(Lists.<JSSourceFile>newArrayList(externs), Lists.<JSModule>newArrayList(modules), options);
 *  */
    @Test(expected = NullPointerException.class)
    public void testInit_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testInit1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:218)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:231)
            com.google.javascript.jscomp.Compiler.initModules(Compiler.java:323)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:312) */
        compiler.init(jSSourceFileArray, jSModuleArray, ((CompilerOptions) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.init
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: init(Lists.<JSSourceFile>newArrayList(externs), Lists.<JSSourceFile>newArrayList(inputs), options);
 *  */
    @Test(expected = NullPointerException.class)
    public void testInit_ThrowNullPointerException1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test(expected = NullPointerException.class)
    public void testInit2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        compiler.init(jSSourceFileArray, ((com.google.javascript.jscomp.JSSourceFile[]) null), compilerOptions);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testInit3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.<init>(JsAst.java:44)
            com.google.javascript.jscomp.CompilerInput.<init>(CompilerInput.java:87)
            com.google.javascript.jscomp.CompilerInput.<init>(CompilerInput.java:83)
            com.google.javascript.jscomp.JSModule.add(JSModule.java:93)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:300)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:289) */
        compiler.init(jSSourceFileArray, jSSourceFileArray1, ((CompilerOptions) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.optimize
    
    ///region OTHER: ERROR SUITE for method optimize()
    
    @Test
    public void testOptimize1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.optimize] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837)
            com.google.javascript.jscomp.Compiler.normalize(Compiler.java:1611)
            com.google.javascript.jscomp.Compiler.optimize(Compiler.java:1558) */
        compiler.optimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getState
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getState()
    
    @Test
    public void testGetState1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        DefaultPassConfig passes = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        ArrayList modules = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        ArrayList inputs = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputs", inputs);
        Object externsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        Compiler.IntermediateState actual = compiler.getState();
        
        Compiler.IntermediateState expected = ((Compiler.IntermediateState) createInstance("com.google.javascript.jscomp.Compiler$IntermediateState"));
        setField(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "externsRoot", externsRoot);
        setField(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "jsRoot", jsRoot);
        setField(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "inputs", inputs);
        setField(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "modules", modules);
        PassConfig.State passConfigState = ((PassConfig.State) createInstance("com.google.javascript.jscomp.PassConfig$State"));
        setField(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "passConfigState", passConfigState);
        
        Node expectedExternsRoot = expected.externsRoot;
        Node actualExternsRoot = actual.externsRoot;
        String actualExternsRootStr = ((String) getFieldValue(actualExternsRoot, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualExternsRootStr);
        
        int expectedExternsRootType = expectedExternsRoot.getType();
        int actualExternsRootType = actualExternsRoot.getType();
        assertEquals(expectedExternsRootType, actualExternsRootType);
        
        Node actualExternsRootNext = actualExternsRoot.getNext();
        assertNull(actualExternsRootNext);
        
        Node actualExternsRootFirst = ((Node) getFieldValue(actualExternsRoot, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualExternsRootFirst);
        
        Node actualExternsRootLast = ((Node) getFieldValue(actualExternsRoot, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualExternsRootLast);
        
        Object actualExternsRootPropListHead = getFieldValue(actualExternsRoot, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualExternsRootPropListHead);
        
        int expectedExternsRootSourcePosition = expectedExternsRoot.getSourcePosition();
        int actualExternsRootSourcePosition = actualExternsRoot.getSourcePosition();
        assertEquals(expectedExternsRootSourcePosition, actualExternsRootSourcePosition);
        
        JSType actualExternsRootJsType = ((JSType) getFieldValue(actualExternsRoot, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualExternsRootJsType);
        
        Node actualExternsRootParent = actualExternsRoot.getParent();
        assertNull(actualExternsRootParent);
        
        Node expectedJsRoot = ((Node) getFieldValue(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "jsRoot"));
        Node actualJsRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.Compiler$IntermediateState", "jsRoot"));
        double expectedJsRootNumber = ((Double) getFieldValue(expectedJsRoot, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualJsRootNumber = ((Double) getFieldValue(actualJsRoot, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedJsRootNumber, actualJsRootNumber, 1.0E-6);
        
        assertTrue(deepEquals(expectedJsRoot, actualJsRoot));
        assertTrue(deepEquals(expectedJsRoot, actualJsRoot));
        assertTrue(deepEquals(expectedJsRoot, actualJsRoot));
        assertTrue(deepEquals(expectedJsRoot, actualJsRoot));
        assertTrue(deepEquals(expectedJsRoot, actualJsRoot));
        assertTrue(deepEquals(expectedJsRoot, actualJsRoot));
        assertTrue(deepEquals(expectedJsRoot, actualJsRoot));
        assertTrue(deepEquals(expectedJsRoot, actualJsRoot));
        
        List actualExterns = ((List) getFieldValue(actual, "com.google.javascript.jscomp.Compiler$IntermediateState", "externs"));
        assertNull(actualExterns);
        
        List expectedInputs = ((List) getFieldValue(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "inputs"));
        List actualInputs = ((List) getFieldValue(actual, "com.google.javascript.jscomp.Compiler$IntermediateState", "inputs"));
        assertTrue(deepEquals(expectedInputs, actualInputs));
        
        List expectedModules = ((List) getFieldValue(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "modules"));
        List actualModules = ((List) getFieldValue(actual, "com.google.javascript.jscomp.Compiler$IntermediateState", "modules"));
        assertTrue(deepEquals(expectedModules, actualModules));
        
        PassConfig.State expectedPassConfigState = ((PassConfig.State) getFieldValue(expected, "com.google.javascript.jscomp.Compiler$IntermediateState", "passConfigState"));
        PassConfig.State actualPassConfigState = ((PassConfig.State) getFieldValue(actual, "com.google.javascript.jscomp.Compiler$IntermediateState", "passConfigState"));
        Map actualPassConfigStateCssNames = actualPassConfigState.cssNames;
        assertNull(actualPassConfigStateCssNames);
        
        Set actualPassConfigStateExportedNames = actualPassConfigState.exportedNames;
        assertNull(actualPassConfigStateExportedNames);
        
        CrossModuleMethodMotion.IdGenerator actualPassConfigStateCrossModuleIdGenerator = actualPassConfigState.crossModuleIdGenerator;
        assertNull(actualPassConfigStateCrossModuleIdGenerator);
        
        VariableMap actualPassConfigStateVariableMap = actualPassConfigState.variableMap;
        assertNull(actualPassConfigStateVariableMap);
        
        VariableMap actualPassConfigStatePropertyMap = actualPassConfigState.propertyMap;
        assertNull(actualPassConfigStatePropertyMap);
        
        VariableMap actualPassConfigStateAnonymousFunctionNameMap = actualPassConfigState.anonymousFunctionNameMap;
        assertNull(actualPassConfigStateAnonymousFunctionNameMap);
        
        VariableMap actualPassConfigStateStringMap = actualPassConfigState.stringMap;
        assertNull(actualPassConfigStateStringMap);
        
        FunctionNames actualPassConfigStateFunctionNames = actualPassConfigState.functionNames;
        assertNull(actualPassConfigStateFunctionNames);
        
        String actualPassConfigStateIdGeneratorMap = actualPassConfigState.idGeneratorMap;
        assertNull(actualPassConfigStateIdGeneratorMap);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.Compiler$IntermediateState", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        AbstractCompiler.LifeCycleStage actualLifeCycleStage = ((AbstractCompiler.LifeCycleStage) getFieldValue(actual, "com.google.javascript.jscomp.Compiler$IntermediateState", "lifeCycleStage"));
        assertNull(actualLifeCycleStage);
        
        List finalCompilerExterns = ((List) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "externs"));
        
        assertNull(finalCompilerExterns);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getRoot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRoot()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getRoot()}
 * @utbot.returnsFrom {@code return externAndJsRoot;}
 *  */
    @Test
    public void testGetRoot_ReturnExternAndJsRoot() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        Node actual = compiler.getRoot();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.normalize
    
    ///region OTHER: ERROR SUITE for method normalize()
    
    @Test
    public void testNormalize1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.normalize] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837)
            com.google.javascript.jscomp.Compiler.normalize(Compiler.java:1611) */
        compiler.normalize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.check
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method check()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#check()}
 * @utbot.invokes com.google.javascript.jscomp.Compiler#runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: runCustomPasses(CustomPassExecutionTime.BEFORE_CHECKS);
 *  */
    @Test
    public void testCheck_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.check] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runCustomPasses(Compiler.java:816)
            com.google.javascript.jscomp.Compiler.check(Compiler.java:716) */
        compiler.check();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method check()
    
    @Test
    public void testCheck1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        Object customPasses = createInstance("com.google.common.collect.Multimaps$UnmodifiableMultimap");
        setField(options, "com.google.javascript.jscomp.CompilerOptions", "customPasses", customPasses);
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.check] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.runCustomPasses(Compiler.java:817)
            com.google.javascript.jscomp.Compiler.check(Compiler.java:716) */
        compiler.check();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.parse
    
    ///region OTHER: ERROR SUITE for method parse()
    
    @Test
    public void testParse1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "next", externsRoot);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "next", externsRoot);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        compiler.jsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        compiler.jsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse12() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", first);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse13() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    
    @Test
    public void testParse14() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", first);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668) */
        compiler.parse();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(com.google.javascript.jscomp.JSSourceFile)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#parse(com.google.javascript.jscomp.JSSourceFile)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#initCompilerOptionsIfTesting()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addToDebugLog("Parsing: " + file.getName());
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1233) */
        compiler.parse(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(com.google.javascript.jscomp.JSSourceFile)
    
    @Test
    public void testParse15() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1810)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1233) */
        compiler.parse(jSSourceFile);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getResult
    
    ///region Errors report for getResult
    
    public void testGetResult_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Wrong number of type storages is provided, expected 2 arguments,
        but only 1 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.jscomp.CompilerPass)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#process(com.google.javascript.jscomp.CompilerPass)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.process(externsRoot, jsRoot);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.process(Compiler.java:763) */
        compiler.process(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.jscomp.CompilerPass)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#process(com.google.javascript.jscomp.CompilerPass)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerPass#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.process(externsRoot, jsRoot);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        compiler.process(typeCheck);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.jscomp.CompilerPass)
    
    @Test(expected = IllegalStateException.class)
    public void testProcess1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.jsRoot = jsRoot;
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        TypedScopeCreator scopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        compiler.process(typeCheck);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.setErrorManager
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setErrorManager(com.google.javascript.jscomp.ErrorManager)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setErrorManager(com.google.javascript.jscomp.ErrorManager)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void testSetErrorManager_PreconditionsCheckNotNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStreamErrorManager printStreamErrorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        
        ErrorManager initialCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class printStreamErrorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", printStreamErrorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = printStreamErrorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        ErrorManager finalCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        assertFalse(initialCompilerErrorManager == finalCompilerErrorManager);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getErrorManager
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErrorManager()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getErrorManager()}
 * @utbot.executesCondition {@code (options == null): False}
 * @utbot.returnsFrom {@code return errorManager;}
 *  */
    @Test
    public void testGetErrorManager_OptionsNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        ErrorManager actual = compiler.getErrorManager();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.setState
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setState(com.google.javascript.jscomp.Compiler$IntermediateState)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setState(com.google.javascript.jscomp.Compiler.IntermediateState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: externsRoot = state.externsRoot;
 *  */
    @Test
    public void testSetState_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.setState] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.setState(Compiler.java:1964) */
        compiler.setState(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getInput
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInput(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getInput(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inputsByName.get(name);
 *  */
    @Test
    public void testGetInput_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getInput(Compiler.java:956) */
        compiler.getInput(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInput(java.lang.String)
    
    @Test
    public void testGetInput1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        String string = "";
        
        CompilerInput actual = compiler.getInput(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.report
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method report(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CheckLevel level = error.level;
 *  */
    @Test
    public void testReport_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1739) */
        compiler.report(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (warningsGuard != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.CheckLevel#isOn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: level.isOn()
 *  */
    @Test
    public void testReport_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1747) */
        compiler.report(jSError);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method report(com.google.javascript.jscomp.JSError)
    
    @Test
    public void testReport1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        CheckLevel level = CheckLevel.OFF;
        setField(jSError, "com.google.javascript.jscomp.JSError", "level", level);
        
        compiler.report(jSError);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method report(com.google.javascript.jscomp.JSError)
    
    @Test
    public void testReport2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        CheckLevel level = CheckLevel.WARNING;
        setField(jSError, "com.google.javascript.jscomp.JSError", "level", level);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1748) */
        compiler.report(jSError);
    }
    
    @Test
    public void testReport3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        SuppressDocWarningsGuard warningsGuard = ((SuppressDocWarningsGuard) createInstance("com.google.javascript.jscomp.SuppressDocWarningsGuard"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1747) */
        compiler.report(jSError);
    }
    
    @Test
    public void testReport4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1747) */
        compiler.report(jSError);
    }
    
    @Test
    public void testReport5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(m, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ComposeWarningsGuard.level(ComposeWarningsGuard.java:107)
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1741) */
        compiler.report(jSError);
    }
    
    @Test
    public void testReport6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m1 = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m2 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(m2, "java.util.TreeMap", "root", root);
        setField(m1, "java.util.TreeMap$NavigableSubMap", "m", m2);
        setField(m1, "java.util.TreeMap$NavigableSubMap", "fromStart", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m1);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap$NavigableSubMap.tooHigh(TreeMap.java:1677)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1708)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            java.base/java.util.TreeSet.iterator(TreeSet.java:181)
            com.google.javascript.jscomp.ComposeWarningsGuard.level(ComposeWarningsGuard.java:106)
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1741) */
        compiler.report(jSError);
    }
    
    @Test
    public void testReport7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m1 = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m2 = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(m1, "java.util.TreeMap$NavigableSubMap", "m", m2);
        setField(m1, "java.util.TreeMap$NavigableSubMap", "loInclusive", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m1);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        CheckLevel level = CheckLevel.ERROR;
        setField(jSError, "com.google.javascript.jscomp.JSError", "level", level);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1748) */
        compiler.report(jSError);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method report(com.google.javascript.jscomp.JSError)
    
    @Test(timeout = 1000L)
    public void testReport8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(root, "java.util.TreeMap$Entry", "left", root);
        setField(m, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        compiler.report(jSError);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOptions()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getOptions()}
 * @utbot.returnsFrom {@code return options;}
 *  */
    @Test
    public void testGetOptions_ReturnOptions() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        CompilerOptions actual = compiler.getOptions();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getMessages
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMessages()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getMessages()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getErrors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getErrors();
 *  */
    @Test
    public void testGetMessages_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStreamErrorManager errorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getMessages] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.BasicErrorManager.toArray(BasicErrorManager.java:97)
            com.google.javascript.jscomp.BasicErrorManager.getErrors(BasicErrorManager.java:81)
            com.google.javascript.jscomp.Compiler.getErrors(Compiler.java:895)
            com.google.javascript.jscomp.Compiler.getMessages(Compiler.java:888) */
        compiler.getMessages();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMessages()
    
    @Test
    public void testGetMessages1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        TreeSet messages = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(messages, "java.util.TreeSet", "m", m);
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "messages", messages);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        com.google.javascript.jscomp.JSError[] actual = compiler.getMessages();
        
        com.google.javascript.jscomp.JSError[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.externExports
    
    ///region OTHER: ERROR SUITE for method externExports()
    
    @Test
    public void testExternExports1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.externExports] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837)
            com.google.javascript.jscomp.Compiler.externExports(Compiler.java:751) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method externExportsMethod = compilerClazz.getDeclaredMethod("externExports");
        externExportsMethod.setAccessible(true);
        java.lang.Object[] externExportsMethodArguments = new java.lang.Object[0];
        try {
            externExportsMethod.invoke(compiler, externExportsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.initModules
    
    ///region OTHER: ERROR SUITE for method initModules(java.util.List, java.util.List, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testInitModules1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:241)
            com.google.javascript.jscomp.Compiler.initModules(Compiler.java:323) */
        compiler.initModules(null, null, null);
    }
    
    @Test
    public void testInitModules2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:219)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:234)
            com.google.javascript.jscomp.Compiler.initModules(Compiler.java:323) */
        compiler.initModules(null, null, compilerOptions);
    }
    
    @Test
    public void testInitModules3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:219)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:231)
            com.google.javascript.jscomp.Compiler.initModules(Compiler.java:323) */
        compiler.initModules(null, null, compilerOptions);
    }
    
    @Test
    public void testInitModules4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:218)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:231)
            com.google.javascript.jscomp.Compiler.initModules(Compiler.java:323) */
        compiler.initModules(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.initBasedOnOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initBasedOnOptions()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initBasedOnOptions()}
 * @utbot.executesCondition {@code (options.sourceMapOutputPath != null): False}
 *  */
    @Test
    public void testInitBasedOnOptions_OptionsSourceMapOutputPathEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method initBasedOnOptionsMethod = compilerClazz.getDeclaredMethod("initBasedOnOptions");
        initBasedOnOptionsMethod.setAccessible(true);
        java.lang.Object[] initBasedOnOptionsMethodArguments = new java.lang.Object[0];
        initBasedOnOptionsMethod.invoke(compiler, initBasedOnOptionsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initBasedOnOptions()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initBasedOnOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.sourceMapOutputPath != null
 *  */
    @Test
    public void testInitBasedOnOptions_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initBasedOnOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initBasedOnOptions(Compiler.java:358) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method initBasedOnOptionsMethod = compilerClazz.getDeclaredMethod("initBasedOnOptions");
        initBasedOnOptionsMethod.setAccessible(true);
        java.lang.Object[] initBasedOnOptionsMethodArguments = new java.lang.Object[0];
        try {
            initBasedOnOptionsMethod.invoke(compiler, initBasedOnOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initBasedOnOptions()}
 * @utbot.executesCondition {@code (options.sourceMapOutputPath != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceMap.Format#getInstance()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sourceMap = options.sourceMapFormat.getInstance();
 *  */
    @Test
    public void testInitBasedOnOptions_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "";
        options.sourceMapOutputPath = sourceMapOutputPath;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initBasedOnOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initBasedOnOptions(Compiler.java:359) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method initBasedOnOptionsMethod = compilerClazz.getDeclaredMethod("initBasedOnOptions");
        initBasedOnOptionsMethod.setAccessible(true);
        java.lang.Object[] initBasedOnOptionsMethodArguments = new java.lang.Object[0];
        try {
            initBasedOnOptionsMethod.invoke(compiler, initBasedOnOptionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method initBasedOnOptions()
    
    @Test
    public void testInitBasedOnOptions1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "";
        options.sourceMapOutputPath = sourceMapOutputPath;
        SourceMap.Format sourceMapFormat = SourceMap.Format.V1;
        options.sourceMapFormat = sourceMapFormat;
        compiler.options = options;
        
        SourceMap.Format initialCompilerOptionsSourceMapFormat = compiler.options.sourceMapFormat;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method initBasedOnOptionsMethod = compilerClazz.getDeclaredMethod("initBasedOnOptions");
        initBasedOnOptionsMethod.setAccessible(true);
        java.lang.Object[] initBasedOnOptionsMethodArguments = new java.lang.Object[0];
        initBasedOnOptionsMethod.invoke(compiler, initBasedOnOptionsMethodArguments);
        
        SourceMap.Format finalCompilerOptionsSourceMapFormat = compiler.options.sourceMapFormat;
        
        assertFalse(initialCompilerOptionsSourceMapFormat == finalCompilerOptionsSourceMapFormat);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.checkFirstModule
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkFirstModule(java.util.List)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#checkFirstModule(java.util.List)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: modules.isEmpty()
 *  */
    @Test
    public void testCheckFirstModule_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.checkFirstModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:385) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class listType = Class.forName("java.util.List");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", listType);
        checkFirstModuleMethod.setAccessible(true);
        java.lang.Object[] checkFirstModuleMethodArguments = new java.lang.Object[1];
        checkFirstModuleMethodArguments[0] = ((Object) null);
        try {
            checkFirstModuleMethod.invoke(compiler, checkFirstModuleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkFirstModule(java.util.List)
    
    @Test
    public void testCheckFirstModule1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.checkFirstModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1748)
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:386) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class arrayListType = Class.forName("java.util.List");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", arrayListType);
        checkFirstModuleMethod.setAccessible(true);
        java.lang.Object[] checkFirstModuleMethodArguments = new java.lang.Object[1];
        checkFirstModuleMethodArguments[0] = arrayList;
        try {
            checkFirstModuleMethod.invoke(compiler, checkFirstModuleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckFirstModule2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.checkFirstModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:387) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class arrayListType = Class.forName("java.util.List");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", arrayListType);
        checkFirstModuleMethod.setAccessible(true);
        java.lang.Object[] checkFirstModuleMethodArguments = new java.lang.Object[1];
        checkFirstModuleMethodArguments[0] = arrayList;
        try {
            checkFirstModuleMethod.invoke(compiler, checkFirstModuleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.makeCompilerInput
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method makeCompilerInput(java.util.List, boolean)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#makeCompilerInput(java.util.List,boolean)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSSourceFile file: files)
 *  */
    @Test
    public void testMakeCompilerInput_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.makeCompilerInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:366) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class listType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method makeCompilerInputMethod = compilerClazz.getDeclaredMethod("makeCompilerInput", listType, booleanType);
        makeCompilerInputMethod.setAccessible(true);
        java.lang.Object[] makeCompilerInputMethodArguments = new java.lang.Object[2];
        makeCompilerInputMethodArguments[0] = ((Object) null);
        makeCompilerInputMethodArguments[1] = false;
        try {
            makeCompilerInputMethod.invoke(compiler, makeCompilerInputMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method makeCompilerInput(java.util.List, boolean)
    
    @Test
    public void testMakeCompilerInput1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.makeCompilerInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.<init>(JsAst.java:44)
            com.google.javascript.jscomp.CompilerInput.<init>(CompilerInput.java:87)
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:367) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class arrayListType = Class.forName("java.util.List");
        Class booleanType = boolean.class;
        Method makeCompilerInputMethod = compilerClazz.getDeclaredMethod("makeCompilerInput", arrayListType, booleanType);
        makeCompilerInputMethod.setAccessible(true);
        java.lang.Object[] makeCompilerInputMethodArguments = new java.lang.Object[2];
        makeCompilerInputMethodArguments[0] = arrayList;
        makeCompilerInputMethodArguments[1] = false;
        try {
            makeCompilerInputMethod.invoke(compiler, makeCompilerInputMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.initOptions
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initOptions(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initOptions(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (outStream == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new PrintStreamErrorManager(createMessageFormatter(), outStream)
 *  */
    @Test
    public void testInitOptions_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:218)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:234) */
        compiler.initOptions(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initOptions(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (outStream == null): True}
 * @utbot.invokes com.google.javascript.jscomp.Compiler#createMessageFormatter()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new LoggerErrorManager(createMessageFormatter(), logger)
 *  */
    @Test
    public void testInitOptions_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:218)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:231) */
        compiler.initOptions(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initOptions(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (outStream == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new PrintStreamErrorManager(createMessageFormatter(), outStream)
 *  */
    @Test
    public void testInitOptions_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:219)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:234) */
        compiler.initOptions(compilerOptions);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method initOptions(com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testInitOptions1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStreamErrorManager errorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:241) */
        compiler.initOptions(null);
    }
    
    @Test
    public void testInitOptions2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CompilerOptions.enables(CompilerOptions.java:944)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:241) */
        compiler.initOptions(compilerOptions);
    }
    
    @Test
    public void testInitOptions3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CompilerOptions.enables(CompilerOptions.java:944)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:241) */
        compiler.initOptions(compilerOptions);
    }
    
    @Test
    public void testInitOptions4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:219)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:231) */
        compiler.initOptions(compilerOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getPassConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPassConfig()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getPassConfig()}
 * @utbot.executesCondition {@code (passes == null): False}
 * @utbot.returnsFrom {@code return passes;}
 *  */
    @Test
    public void testGetPassConfig_PassesNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        DefaultPassConfig passes = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        DefaultPassConfig actual = ((DefaultPassConfig) compiler.getPassConfig());
        
        GlobalNamespace actualNamespaceForChecks = ((GlobalNamespace) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "namespaceForChecks"));
        assertNull(actualNamespaceForChecks);
        
        TightenTypes actualTightenTypes = ((TightenTypes) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypes"));
        assertNull(actualTightenTypes);
        
        Set actualExportedNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exportedNames"));
        assertNull(actualExportedNames);
        
        CrossModuleMethodMotion.IdGenerator actualCrossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator"));
        assertNull(actualCrossModuleIdGenerator);
        
        Map actualCssNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "cssNames"));
        assertNull(actualCssNames);
        
        VariableMap actualVariableMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "variableMap"));
        assertNull(actualVariableMap);
        
        VariableMap actualPropertyMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "propertyMap"));
        assertNull(actualPropertyMap);
        
        VariableMap actualAnonymousFunctionNameMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "anonymousFunctionNameMap"));
        assertNull(actualAnonymousFunctionNameMap);
        
        FunctionNames actualFunctionNames = ((FunctionNames) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "functionNames"));
        assertNull(actualFunctionNames);
        
        VariableMap actualStringMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "stringMap"));
        assertNull(actualStringMap);
        
        String actualIdGeneratorMap = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "idGeneratorMap"));
        assertNull(actualIdGeneratorMap);
        
        DefaultPassConfig.HotSwapPassFactory actualSuspiciousCode = actual.suspiciousCode;
        assertNull(actualSuspiciousCode);
        
        DefaultPassConfig.HotSwapPassFactory actualCheckControlStructures = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        assertNull(actualCheckControlStructures);
        
        DefaultPassConfig.HotSwapPassFactory actualCheckRequires = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        assertNull(actualCheckRequires);
        
        DefaultPassConfig.HotSwapPassFactory actualCheckProvides = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
        assertNull(actualCheckProvides);
        
        PassFactory actualGenerateExports = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "generateExports"));
        assertNull(actualGenerateExports);
        
        PassFactory actualExportTestFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exportTestFunctions"));
        assertNull(actualExportTestFunctions);
        
        PassFactory actualGatherRawExports = actual.gatherRawExports;
        assertNull(actualGatherRawExports);
        
        DefaultPassConfig.HotSwapPassFactory actualClosurePrimitives = actual.closurePrimitives;
        assertNull(actualClosurePrimitives);
        
        PassFactory actualReplaceMessages = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceMessages"));
        assertNull(actualReplaceMessages);
        
        DefaultPassConfig.HotSwapPassFactory actualClosureGoogScopeAliases = actual.closureGoogScopeAliases;
        assertNull(actualClosureGoogScopeAliases);
        
        PassFactory actualClosureCheckGetCssName = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName"));
        assertNull(actualClosureCheckGetCssName);
        
        PassFactory actualClosureReplaceGetCssName = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName"));
        assertNull(actualClosureReplaceGetCssName);
        
        PassFactory actualCreateSyntheticBlocks = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks"));
        assertNull(actualCreateSyntheticBlocks);
        
        PassFactory actualPeepholeOptimizations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "peepholeOptimizations"));
        assertNull(actualPeepholeOptimizations);
        
        PassFactory actualLatePeepholeOptimizations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "latePeepholeOptimizations"));
        assertNull(actualLatePeepholeOptimizations);
        
        DefaultPassConfig.HotSwapPassFactory actualCheckVars = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        assertNull(actualCheckVars);
        
        PassFactory actualCheckRegExp = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRegExp"));
        assertNull(actualCheckRegExp);
        
        PassFactory actualCheckShadowVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        assertNull(actualCheckShadowVars);
        
        DefaultPassConfig.HotSwapPassFactory actualCheckVariableReferences = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
        assertNull(actualCheckVariableReferences);
        
        PassFactory actualObjectPropertyStringPreprocess = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess"));
        assertNull(actualObjectPropertyStringPreprocess);
        
        DefaultPassConfig.HotSwapPassFactory actualResolveTypes = actual.resolveTypes;
        assertNull(actualResolveTypes);
        
        DefaultPassConfig.HotSwapPassFactory actualInferTypes = actual.inferTypes;
        assertNull(actualInferTypes);
        
        DefaultPassConfig.HotSwapPassFactory actualInferJsDocInfo = actual.inferJsDocInfo;
        assertNull(actualInferJsDocInfo);
        
        DefaultPassConfig.HotSwapPassFactory actualCheckTypes = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        assertNull(actualCheckTypes);
        
        DefaultPassConfig.HotSwapPassFactory actualCheckControlFlow = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        assertNull(actualCheckControlFlow);
        
        DefaultPassConfig.HotSwapPassFactory actualCheckAccessControls = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
        assertNull(actualCheckAccessControls);
        
        PassFactory actualCheckGlobalNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames"));
        assertNull(actualCheckGlobalNames);
        
        PassFactory actualCheckStrictMode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        assertNull(actualCheckStrictMode);
        
        PassFactory actualProcessTweaks = actual.processTweaks;
        assertNull(actualProcessTweaks);
        
        PassFactory actualProcessDefines = actual.processDefines;
        assertNull(actualProcessDefines);
        
        PassFactory actualCheckConsts = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts"));
        assertNull(actualCheckConsts);
        
        PassFactory actualComputeFunctionNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames"));
        assertNull(actualComputeFunctionNames);
        
        PassFactory actualIgnoreCajaProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties"));
        assertNull(actualIgnoreCajaProperties);
        
        PassFactory actualRuntimeTypeCheck = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck"));
        assertNull(actualRuntimeTypeCheck);
        
        PassFactory actualReplaceIdGenerators = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators"));
        assertNull(actualReplaceIdGenerators);
        
        PassFactory actualReplaceStrings = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceStrings"));
        assertNull(actualReplaceStrings);
        
        PassFactory actualOptimizeArgumentsArray = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        assertNull(actualOptimizeArgumentsArray);
        
        PassFactory actualClosureCodeRemoval = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureCodeRemoval"));
        assertNull(actualClosureCodeRemoval);
        
        PassFactory actualClosureOptimizePrimitives = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureOptimizePrimitives"));
        assertNull(actualClosureOptimizePrimitives);
        
        PassFactory actualCollapseProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        assertNull(actualCollapseProperties);
        
        PassFactory actualCollapseObjectLiterals = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseObjectLiterals"));
        assertNull(actualCollapseObjectLiterals);
        
        PassFactory actualTightenTypesBuilder = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder"));
        assertNull(actualTightenTypesBuilder);
        
        PassFactory actualDisambiguateProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties"));
        assertNull(actualDisambiguateProperties);
        
        PassFactory actualChainCalls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls"));
        assertNull(actualChainCalls);
        
        PassFactory actualDevirtualizePrototypeMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods"));
        assertNull(actualDevirtualizePrototypeMethods);
        
        PassFactory actualOptimizeCallsAndRemoveUnusedVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeCallsAndRemoveUnusedVars"));
        assertNull(actualOptimizeCallsAndRemoveUnusedVars);
        
        PassFactory actualMarkPureFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions"));
        assertNull(actualMarkPureFunctions);
        
        PassFactory actualMarkNoSideEffectCalls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls"));
        assertNull(actualMarkNoSideEffectCalls);
        
        PassFactory actualInlineVariables = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables"));
        assertNull(actualInlineVariables);
        
        PassFactory actualInlineConstants = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants"));
        assertNull(actualInlineConstants);
        
        PassFactory actualMinimizeExitPoints = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints"));
        assertNull(actualMinimizeExitPoints);
        
        PassFactory actualRemoveUnreachableCode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode"));
        assertNull(actualRemoveUnreachableCode);
        
        PassFactory actualRemoveUnusedPrototypeProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties"));
        assertNull(actualRemoveUnusedPrototypeProperties);
        
        PassFactory actualSmartNamePass = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass"));
        assertNull(actualSmartNamePass);
        
        PassFactory actualSmartNamePass2 = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass2"));
        assertNull(actualSmartNamePass2);
        
        PassFactory actualInlineSimpleMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineSimpleMethods"));
        assertNull(actualInlineSimpleMethods);
        
        PassFactory actualDeadAssignmentsElimination = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination"));
        assertNull(actualDeadAssignmentsElimination);
        
        PassFactory actualInlineFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions"));
        assertNull(actualInlineFunctions);
        
        PassFactory actualRemoveUnusedVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars"));
        assertNull(actualRemoveUnusedVars);
        
        PassFactory actualCrossModuleCodeMotion = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion"));
        assertNull(actualCrossModuleCodeMotion);
        
        PassFactory actualCrossModuleMethodMotion = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion"));
        assertNull(actualCrossModuleMethodMotion);
        
        PassFactory actualSpecializeInitialModule = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "specializeInitialModule"));
        assertNull(actualSpecializeInitialModule);
        
        PassFactory actualFlowSensitiveInlineVariables = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables"));
        assertNull(actualFlowSensitiveInlineVariables);
        
        PassFactory actualCoalesceVariableNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames"));
        assertNull(actualCoalesceVariableNames);
        
        PassFactory actualExploitAssign = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exploitAssign"));
        assertNull(actualExploitAssign);
        
        PassFactory actualCollapseVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        assertNull(actualCollapseVariableDeclarations);
        
        PassFactory actualGroupVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "groupVariableDeclarations"));
        assertNull(actualGroupVariableDeclarations);
        
        PassFactory actualExtractPrototypeMemberDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations"));
        assertNull(actualExtractPrototypeMemberDeclarations);
        
        PassFactory actualRewriteFunctionExpressions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions"));
        assertNull(actualRewriteFunctionExpressions);
        
        PassFactory actualCollapseAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions"));
        assertNull(actualCollapseAnonymousFunctions);
        
        PassFactory actualMoveFunctionDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations"));
        assertNull(actualMoveFunctionDeclarations);
        
        PassFactory actualNameUnmappedAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions"));
        assertNull(actualNameUnmappedAnonymousFunctions);
        
        PassFactory actualNameMappedAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions"));
        assertNull(actualNameMappedAnonymousFunctions);
        
        PassFactory actualOperaCompoundAssignFix = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "operaCompoundAssignFix"));
        assertNull(actualOperaCompoundAssignFix);
        
        PassFactory actualAliasExternals = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals"));
        assertNull(actualAliasExternals);
        
        PassFactory actualAliasStrings = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings"));
        assertNull(actualAliasStrings);
        
        PassFactory actualAliasKeywords = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords"));
        assertNull(actualAliasKeywords);
        
        PassFactory actualObjectPropertyStringPostprocess = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess"));
        assertNull(actualObjectPropertyStringPostprocess);
        
        PassFactory actualAmbiguateProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties"));
        assertNull(actualAmbiguateProperties);
        
        PassFactory actualMarkUnnormalized = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markUnnormalized"));
        assertNull(actualMarkUnnormalized);
        
        PassFactory actualDenormalize = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize"));
        assertNull(actualDenormalize);
        
        PassFactory actualInvertContextualRenaming = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming"));
        assertNull(actualInvertContextualRenaming);
        
        PassFactory actualRenameProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties"));
        assertNull(actualRenameProperties);
        
        PassFactory actualRenameVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars"));
        assertNull(actualRenameVars);
        
        PassFactory actualRenameLabels = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels"));
        assertNull(actualRenameLabels);
        
        PassFactory actualConvertToDottedProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties"));
        assertNull(actualConvertToDottedProperties);
        
        PassFactory actualSanityCheckAst = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckAst"));
        assertNull(actualSanityCheckAst);
        
        PassFactory actualSanityCheckVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars"));
        assertNull(actualSanityCheckVars);
        
        PassFactory actualInstrumentFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions"));
        assertNull(actualInstrumentFunctions);
        
        PassFactory actualPrintNameReferenceGraph = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceGraph"));
        assertNull(actualPrintNameReferenceGraph);
        
        PassFactory actualPrintNameReferenceReport = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceReport"));
        assertNull(actualPrintNameReferenceReport);
        
        CompilerOptions actualOptions = actual.options;
        assertNull(actualOptions);
        
        MemoizedScopeCreator actualTypedScopeCreator = ((MemoizedScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.PassConfig", "typedScopeCreator"));
        assertNull(actualTypedScopeCreator);
        
        TypedScopeCreator actualInternalScopeCreator = ((TypedScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.PassConfig", "internalScopeCreator"));
        assertNull(actualInternalScopeCreator);
        
        Scope actualTopScope = actual.topScope;
        assertNull(actualTopScope);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPassConfig()
    
    @Test
    public void testGetPassConfig1() throws Exception  {
    /* This block of code is 1398 lines long and could lead to compilation error
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        PassConfig initialCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        DefaultPassConfig actual = ((DefaultPassConfig) compiler.getPassConfig());
        
        DefaultPassConfig expected = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator", crossModuleIdGenerator);
        DefaultPassConfig.HotSwapPassFactory suspiciousCode = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$1"));
        setField(suspiciousCode, "com.google.javascript.jscomp.DefaultPassConfig$1", "this$0", expected);
        String name = "suspiciousCode";
        setField(suspiciousCode, "com.google.javascript.jscomp.PassFactory", "name", name);
        setField(suspiciousCode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "suspiciousCode", suspiciousCode);
        DefaultPassConfig.HotSwapPassFactory checkControlStructures = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$2"));
        setField(checkControlStructures, "com.google.javascript.jscomp.DefaultPassConfig$2", "this$0", expected);
        String name1 = "checkControlStructures";
        setField(checkControlStructures, "com.google.javascript.jscomp.PassFactory", "name", name1);
        setField(checkControlStructures, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures", checkControlStructures);
        DefaultPassConfig.HotSwapPassFactory checkRequires = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$3"));
        setField(checkRequires, "com.google.javascript.jscomp.DefaultPassConfig$3", "this$0", expected);
        String name2 = "checkRequires";
        setField(checkRequires, "com.google.javascript.jscomp.PassFactory", "name", name2);
        setField(checkRequires, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires", checkRequires);
        DefaultPassConfig.HotSwapPassFactory checkProvides = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$4"));
        setField(checkProvides, "com.google.javascript.jscomp.DefaultPassConfig$4", "this$0", expected);
        String name3 = "checkProvides";
        setField(checkProvides, "com.google.javascript.jscomp.PassFactory", "name", name3);
        setField(checkProvides, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides", checkProvides);
        PassFactory generateExports = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$5"));
        setField(generateExports, "com.google.javascript.jscomp.DefaultPassConfig$5", "this$0", expected);
        String name4 = "generateExports";
        setField(generateExports, "com.google.javascript.jscomp.PassFactory", "name", name4);
        setField(generateExports, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "generateExports", generateExports);
        PassFactory exportTestFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$6"));
        setField(exportTestFunctions, "com.google.javascript.jscomp.DefaultPassConfig$6", "this$0", expected);
        String name5 = "exportTestFunctions";
        setField(exportTestFunctions, "com.google.javascript.jscomp.PassFactory", "name", name5);
        setField(exportTestFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "exportTestFunctions", exportTestFunctions);
        PassFactory gatherRawExports = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$7"));
        setField(gatherRawExports, "com.google.javascript.jscomp.DefaultPassConfig$7", "this$0", expected);
        String name6 = "gatherRawExports";
        setField(gatherRawExports, "com.google.javascript.jscomp.PassFactory", "name", name6);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "gatherRawExports", gatherRawExports);
        DefaultPassConfig.HotSwapPassFactory closurePrimitives = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$8"));
        setField(closurePrimitives, "com.google.javascript.jscomp.DefaultPassConfig$8", "this$0", expected);
        String name7 = "processProvidesAndRequires";
        setField(closurePrimitives, "com.google.javascript.jscomp.PassFactory", "name", name7);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closurePrimitives", closurePrimitives);
        PassFactory replaceMessages = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$9"));
        setField(replaceMessages, "com.google.javascript.jscomp.DefaultPassConfig$9", "this$0", expected);
        String name8 = "replaceMessages";
        setField(replaceMessages, "com.google.javascript.jscomp.PassFactory", "name", name8);
        setField(replaceMessages, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceMessages", replaceMessages);
        DefaultPassConfig.HotSwapPassFactory closureGoogScopeAliases = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$10"));
        setField(closureGoogScopeAliases, "com.google.javascript.jscomp.DefaultPassConfig$10", "this$0", expected);
        String name9 = "processGoogScopeAliases";
        setField(closureGoogScopeAliases, "com.google.javascript.jscomp.PassFactory", "name", name9);
        setField(closureGoogScopeAliases, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureGoogScopeAliases", closureGoogScopeAliases);
        PassFactory closureCheckGetCssName = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$11"));
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.DefaultPassConfig$11", "this$0", expected);
        String name10 = "checkMissingGetCssName";
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.PassFactory", "name", name10);
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName", closureCheckGetCssName);
        PassFactory closureReplaceGetCssName = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$12"));
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.DefaultPassConfig$12", "this$0", expected);
        String name11 = "renameCssNames";
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.PassFactory", "name", name11);
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName", closureReplaceGetCssName);
        PassFactory createSyntheticBlocks = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$13"));
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.DefaultPassConfig$13", "this$0", expected);
        String name12 = "createSyntheticBlocks";
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.PassFactory", "name", name12);
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks", createSyntheticBlocks);
        PassFactory peepholeOptimizations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$14"));
        setField(peepholeOptimizations, "com.google.javascript.jscomp.DefaultPassConfig$14", "this$0", expected);
        String name13 = "peepholeOptimizations";
        setField(peepholeOptimizations, "com.google.javascript.jscomp.PassFactory", "name", name13);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "peepholeOptimizations", peepholeOptimizations);
        PassFactory latePeepholeOptimizations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$15"));
        setField(latePeepholeOptimizations, "com.google.javascript.jscomp.DefaultPassConfig$15", "this$0", expected);
        setField(latePeepholeOptimizations, "com.google.javascript.jscomp.PassFactory", "name", name13);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "latePeepholeOptimizations", latePeepholeOptimizations);
        DefaultPassConfig.HotSwapPassFactory checkVars = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$16"));
        setField(checkVars, "com.google.javascript.jscomp.DefaultPassConfig$16", "this$0", expected);
        String name14 = "checkVars";
        setField(checkVars, "com.google.javascript.jscomp.PassFactory", "name", name14);
        setField(checkVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars", checkVars);
        PassFactory checkRegExp = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$17"));
        setField(checkRegExp, "com.google.javascript.jscomp.DefaultPassConfig$17", "this$0", expected);
        String name15 = "checkRegExp";
        setField(checkRegExp, "com.google.javascript.jscomp.PassFactory", "name", name15);
        setField(checkRegExp, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRegExp", checkRegExp);
        PassFactory checkShadowVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$18"));
        setField(checkShadowVars, "com.google.javascript.jscomp.DefaultPassConfig$18", "this$0", expected);
        String name16 = "variableShadowDeclarationCheck";
        setField(checkShadowVars, "com.google.javascript.jscomp.PassFactory", "name", name16);
        setField(checkShadowVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars", checkShadowVars);
        DefaultPassConfig.HotSwapPassFactory checkVariableReferences = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$19"));
        setField(checkVariableReferences, "com.google.javascript.jscomp.DefaultPassConfig$19", "this$0", expected);
        String name17 = "checkVariableReferences";
        setField(checkVariableReferences, "com.google.javascript.jscomp.PassFactory", "name", name17);
        setField(checkVariableReferences, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences", checkVariableReferences);
        PassFactory objectPropertyStringPreprocess = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$20"));
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.DefaultPassConfig$20", "this$0", expected);
        String name18 = "ObjectPropertyStringPreprocess";
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.PassFactory", "name", name18);
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess", objectPropertyStringPreprocess);
        DefaultPassConfig.HotSwapPassFactory resolveTypes = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$21"));
        setField(resolveTypes, "com.google.javascript.jscomp.DefaultPassConfig$21", "this$0", expected);
        String name19 = "resolveTypes";
        setField(resolveTypes, "com.google.javascript.jscomp.PassFactory", "name", name19);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "resolveTypes", resolveTypes);
        DefaultPassConfig.HotSwapPassFactory inferTypes = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$22"));
        setField(inferTypes, "com.google.javascript.jscomp.DefaultPassConfig$22", "this$0", expected);
        String name20 = "inferTypes";
        setField(inferTypes, "com.google.javascript.jscomp.PassFactory", "name", name20);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes", inferTypes);
        DefaultPassConfig.HotSwapPassFactory inferJsDocInfo = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$23"));
        setField(inferJsDocInfo, "com.google.javascript.jscomp.DefaultPassConfig$23", "this$0", expected);
        String name21 = "inferJsDocInfo";
        setField(inferJsDocInfo, "com.google.javascript.jscomp.PassFactory", "name", name21);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inferJsDocInfo", inferJsDocInfo);
        DefaultPassConfig.HotSwapPassFactory checkTypes = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$24"));
        setField(checkTypes, "com.google.javascript.jscomp.DefaultPassConfig$24", "this$0", expected);
        String name22 = "checkTypes";
        setField(checkTypes, "com.google.javascript.jscomp.PassFactory", "name", name22);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes", checkTypes);
        DefaultPassConfig.HotSwapPassFactory checkControlFlow = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$25"));
        setField(checkControlFlow, "com.google.javascript.jscomp.DefaultPassConfig$25", "this$0", expected);
        String name23 = "checkControlFlow";
        setField(checkControlFlow, "com.google.javascript.jscomp.PassFactory", "name", name23);
        setField(checkControlFlow, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow", checkControlFlow);
        DefaultPassConfig.HotSwapPassFactory checkAccessControls = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$26"));
        setField(checkAccessControls, "com.google.javascript.jscomp.DefaultPassConfig$26", "this$0", expected);
        String name24 = "checkAccessControls";
        setField(checkAccessControls, "com.google.javascript.jscomp.PassFactory", "name", name24);
        setField(checkAccessControls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls", checkAccessControls);
        PassFactory checkGlobalNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$27"));
        setField(checkGlobalNames, "com.google.javascript.jscomp.DefaultPassConfig$27", "this$0", expected);
        String name25 = "Check names";
        setField(checkGlobalNames, "com.google.javascript.jscomp.PassFactory", "name", name25);
        setField(checkGlobalNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames", checkGlobalNames);
        PassFactory checkStrictMode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$28"));
        setField(checkStrictMode, "com.google.javascript.jscomp.DefaultPassConfig$28", "this$0", expected);
        String name26 = "checkStrictMode";
        setField(checkStrictMode, "com.google.javascript.jscomp.PassFactory", "name", name26);
        setField(checkStrictMode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode", checkStrictMode);
        PassFactory processTweaks = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$29"));
        setField(processTweaks, "com.google.javascript.jscomp.DefaultPassConfig$29", "this$0", expected);
        String name27 = "processTweaks";
        setField(processTweaks, "com.google.javascript.jscomp.PassFactory", "name", name27);
        setField(processTweaks, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "processTweaks", processTweaks);
        PassFactory processDefines = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$30"));
        setField(processDefines, "com.google.javascript.jscomp.DefaultPassConfig$30", "this$0", expected);
        String name28 = "processDefines";
        setField(processDefines, "com.google.javascript.jscomp.PassFactory", "name", name28);
        setField(processDefines, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "processDefines", processDefines);
        PassFactory checkConsts = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$31"));
        setField(checkConsts, "com.google.javascript.jscomp.DefaultPassConfig$31", "this$0", expected);
        String name29 = "checkConsts";
        setField(checkConsts, "com.google.javascript.jscomp.PassFactory", "name", name29);
        setField(checkConsts, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts", checkConsts);
        PassFactory computeFunctionNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$32"));
        setField(computeFunctionNames, "com.google.javascript.jscomp.DefaultPassConfig$32", "this$0", expected);
        String name30 = "computeFunctionNames";
        setField(computeFunctionNames, "com.google.javascript.jscomp.PassFactory", "name", name30);
        setField(computeFunctionNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames", computeFunctionNames);
        PassFactory ignoreCajaProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$33"));
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.DefaultPassConfig$33", "this$0", expected);
        String name31 = "ignoreCajaProperties";
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.PassFactory", "name", name31);
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties", ignoreCajaProperties);
        PassFactory runtimeTypeCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$34"));
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.DefaultPassConfig$34", "this$0", expected);
        String name32 = "runtimeTypeCheck";
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.PassFactory", "name", name32);
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck", runtimeTypeCheck);
        PassFactory replaceIdGenerators = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$35"));
        setField(replaceIdGenerators, "com.google.javascript.jscomp.DefaultPassConfig$35", "this$0", expected);
        String name33 = "replaceIdGenerators";
        setField(replaceIdGenerators, "com.google.javascript.jscomp.PassFactory", "name", name33);
        setField(replaceIdGenerators, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators", replaceIdGenerators);
        PassFactory replaceStrings = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$36"));
        setField(replaceStrings, "com.google.javascript.jscomp.DefaultPassConfig$36", "this$0", expected);
        String name34 = "replaceStrings";
        setField(replaceStrings, "com.google.javascript.jscomp.PassFactory", "name", name34);
        setField(replaceStrings, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceStrings", replaceStrings);
        PassFactory optimizeArgumentsArray = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$37"));
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.DefaultPassConfig$37", "this$0", expected);
        String name35 = "optimizeArgumentsArray";
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.PassFactory", "name", name35);
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray", optimizeArgumentsArray);
        PassFactory closureCodeRemoval = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$38"));
        setField(closureCodeRemoval, "com.google.javascript.jscomp.DefaultPassConfig$38", "this$0", expected);
        String name36 = "closureCodeRemoval";
        setField(closureCodeRemoval, "com.google.javascript.jscomp.PassFactory", "name", name36);
        setField(closureCodeRemoval, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCodeRemoval", closureCodeRemoval);
        PassFactory closureOptimizePrimitives = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$39"));
        setField(closureOptimizePrimitives, "com.google.javascript.jscomp.DefaultPassConfig$39", "this$0", expected);
        String name37 = "closureOptimizePrimitives";
        setField(closureOptimizePrimitives, "com.google.javascript.jscomp.PassFactory", "name", name37);
        setField(closureOptimizePrimitives, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureOptimizePrimitives", closureOptimizePrimitives);
        PassFactory collapseProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$40"));
        setField(collapseProperties, "com.google.javascript.jscomp.DefaultPassConfig$40", "this$0", expected);
        String name38 = "collapseProperties";
        setField(collapseProperties, "com.google.javascript.jscomp.PassFactory", "name", name38);
        setField(collapseProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties", collapseProperties);
        PassFactory collapseObjectLiterals = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$41"));
        setField(collapseObjectLiterals, "com.google.javascript.jscomp.DefaultPassConfig$41", "this$0", expected);
        String name39 = "collapseObjectLiterals";
        setField(collapseObjectLiterals, "com.google.javascript.jscomp.PassFactory", "name", name39);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseObjectLiterals", collapseObjectLiterals);
        PassFactory tightenTypesBuilder = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$42"));
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.DefaultPassConfig$42", "this$0", expected);
        String name40 = "tightenTypes";
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.PassFactory", "name", name40);
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder", tightenTypesBuilder);
        PassFactory disambiguateProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$43"));
        setField(disambiguateProperties, "com.google.javascript.jscomp.DefaultPassConfig$43", "this$0", expected);
        String name41 = "disambiguateProperties";
        setField(disambiguateProperties, "com.google.javascript.jscomp.PassFactory", "name", name41);
        setField(disambiguateProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties", disambiguateProperties);
        PassFactory chainCalls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$44"));
        setField(chainCalls, "com.google.javascript.jscomp.DefaultPassConfig$44", "this$0", expected);
        String name42 = "chainCalls";
        setField(chainCalls, "com.google.javascript.jscomp.PassFactory", "name", name42);
        setField(chainCalls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls", chainCalls);
        PassFactory devirtualizePrototypeMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$45"));
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.DefaultPassConfig$45", "this$0", expected);
        String name43 = "devirtualizePrototypeMethods";
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.PassFactory", "name", name43);
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods", devirtualizePrototypeMethods);
        PassFactory optimizeCallsAndRemoveUnusedVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$46"));
        setField(optimizeCallsAndRemoveUnusedVars, "com.google.javascript.jscomp.DefaultPassConfig$46", "this$0", expected);
        String name44 = "optimizeCalls_and_removeUnusedVars";
        setField(optimizeCallsAndRemoveUnusedVars, "com.google.javascript.jscomp.PassFactory", "name", name44);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeCallsAndRemoveUnusedVars", optimizeCallsAndRemoveUnusedVars);
        PassFactory markPureFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$47"));
        setField(markPureFunctions, "com.google.javascript.jscomp.DefaultPassConfig$47", "this$0", expected);
        String name45 = "markPureFunctions";
        setField(markPureFunctions, "com.google.javascript.jscomp.PassFactory", "name", name45);
        setField(markPureFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions", markPureFunctions);
        PassFactory markNoSideEffectCalls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$48"));
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.DefaultPassConfig$48", "this$0", expected);
        String name46 = "markNoSideEffectCalls";
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.PassFactory", "name", name46);
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls", markNoSideEffectCalls);
        PassFactory inlineVariables = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$49"));
        setField(inlineVariables, "com.google.javascript.jscomp.DefaultPassConfig$49", "this$0", expected);
        String name47 = "inlineVariables";
        setField(inlineVariables, "com.google.javascript.jscomp.PassFactory", "name", name47);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables", inlineVariables);
        PassFactory inlineConstants = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$50"));
        setField(inlineConstants, "com.google.javascript.jscomp.DefaultPassConfig$50", "this$0", expected);
        String name48 = "inlineConstants";
        setField(inlineConstants, "com.google.javascript.jscomp.PassFactory", "name", name48);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants", inlineConstants);
        PassFactory minimizeExitPoints = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$51"));
        setField(minimizeExitPoints, "com.google.javascript.jscomp.DefaultPassConfig$51", "this$0", expected);
        String name49 = "minimizeExitPoints";
        setField(minimizeExitPoints, "com.google.javascript.jscomp.PassFactory", "name", name49);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints", minimizeExitPoints);
        PassFactory removeUnreachableCode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$52"));
        setField(removeUnreachableCode, "com.google.javascript.jscomp.DefaultPassConfig$52", "this$0", expected);
        String name50 = "removeUnreachableCode";
        setField(removeUnreachableCode, "com.google.javascript.jscomp.PassFactory", "name", name50);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode", removeUnreachableCode);
        PassFactory removeUnusedPrototypeProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$53"));
        setField(removeUnusedPrototypeProperties, "com.google.javascript.jscomp.DefaultPassConfig$53", "this$0", expected);
        String name51 = "removeUnusedPrototypeProperties";
        setField(removeUnusedPrototypeProperties, "com.google.javascript.jscomp.PassFactory", "name", name51);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties", removeUnusedPrototypeProperties);
        PassFactory smartNamePass = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$54"));
        setField(smartNamePass, "com.google.javascript.jscomp.DefaultPassConfig$54", "this$0", expected);
        String name52 = "smartNamePass";
        setField(smartNamePass, "com.google.javascript.jscomp.PassFactory", "name", name52);
        setField(smartNamePass, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass", smartNamePass);
        PassFactory smartNamePass2 = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$55"));
        setField(smartNamePass2, "com.google.javascript.jscomp.DefaultPassConfig$55", "this$0", expected);
        setField(smartNamePass2, "com.google.javascript.jscomp.PassFactory", "name", name52);
        setField(smartNamePass2, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass2", smartNamePass2);
        PassFactory inlineSimpleMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$56"));
        setField(inlineSimpleMethods, "com.google.javascript.jscomp.DefaultPassConfig$56", "this$0", expected);
        String name53 = "inlineSimpleMethods";
        setField(inlineSimpleMethods, "com.google.javascript.jscomp.PassFactory", "name", name53);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineSimpleMethods", inlineSimpleMethods);
        PassFactory deadAssignmentsElimination = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$57"));
        setField(deadAssignmentsElimination, "com.google.javascript.jscomp.DefaultPassConfig$57", "this$0", expected);
        String name54 = "deadAssignmentsElimination";
        setField(deadAssignmentsElimination, "com.google.javascript.jscomp.PassFactory", "name", name54);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination", deadAssignmentsElimination);
        PassFactory inlineFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$58"));
        setField(inlineFunctions, "com.google.javascript.jscomp.DefaultPassConfig$58", "this$0", expected);
        String name55 = "inlineFunctions";
        setField(inlineFunctions, "com.google.javascript.jscomp.PassFactory", "name", name55);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions", inlineFunctions);
        PassFactory removeUnusedVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$59"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.DefaultPassConfig$59", "this$0", expected);
        String name56 = "removeUnusedVars";
        setField(removeUnusedVars, "com.google.javascript.jscomp.PassFactory", "name", name56);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars", removeUnusedVars);
        PassFactory crossModuleCodeMotion = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$60"));
        setField(crossModuleCodeMotion, "com.google.javascript.jscomp.DefaultPassConfig$60", "this$0", expected);
        String name57 = "crossModuleCodeMotion";
        setField(crossModuleCodeMotion, "com.google.javascript.jscomp.PassFactory", "name", name57);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion", crossModuleCodeMotion);
        PassFactory crossModuleMethodMotion = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$61"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.DefaultPassConfig$61", "this$0", expected);
        String name58 = "crossModuleMethodMotion";
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.PassFactory", "name", name58);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion", crossModuleMethodMotion);
        PassFactory specializeInitialModule = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$62"));
        setField(specializeInitialModule, "com.google.javascript.jscomp.DefaultPassConfig$62", "this$0", expected);
        String name59 = "specializeInitialModule";
        setField(specializeInitialModule, "com.google.javascript.jscomp.PassFactory", "name", name59);
        setField(specializeInitialModule, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "specializeInitialModule", specializeInitialModule);
        PassFactory flowSensitiveInlineVariables = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$63"));
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.DefaultPassConfig$63", "this$0", expected);
        String name60 = "flowSensitiveInlineVariables";
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.PassFactory", "name", name60);
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables", flowSensitiveInlineVariables);
        PassFactory coalesceVariableNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$64"));
        setField(coalesceVariableNames, "com.google.javascript.jscomp.DefaultPassConfig$64", "this$0", expected);
        String name61 = "coalesceVariableNames";
        setField(coalesceVariableNames, "com.google.javascript.jscomp.PassFactory", "name", name61);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames", coalesceVariableNames);
        PassFactory exploitAssign = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$65"));
        setField(exploitAssign, "com.google.javascript.jscomp.DefaultPassConfig$65", "this$0", expected);
        String name62 = "expointAssign";
        setField(exploitAssign, "com.google.javascript.jscomp.PassFactory", "name", name62);
        setField(exploitAssign, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "exploitAssign", exploitAssign);
        PassFactory collapseVariableDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$66"));
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$66", "this$0", expected);
        String name63 = "collapseVariableDeclarations";
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name63);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations", collapseVariableDeclarations);
        PassFactory groupVariableDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$67"));
        setField(groupVariableDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$67", "this$0", expected);
        String name64 = "groupVariableDeclarations";
        setField(groupVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name64);
        setField(groupVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "groupVariableDeclarations", groupVariableDeclarations);
        PassFactory extractPrototypeMemberDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$68"));
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$68", "this$0", expected);
        String name65 = "extractPrototypeMemberDeclarations";
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name65);
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations", extractPrototypeMemberDeclarations);
        PassFactory rewriteFunctionExpressions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$69"));
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.DefaultPassConfig$69", "this$0", expected);
        String name66 = "rewriteFunctionExpressions";
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.PassFactory", "name", name66);
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions", rewriteFunctionExpressions);
        PassFactory collapseAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$70"));
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$70", "this$0", expected);
        String name67 = "collapseAnonymousFunctions";
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name67);
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions", collapseAnonymousFunctions);
        PassFactory moveFunctionDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$71"));
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$71", "this$0", expected);
        String name68 = "moveFunctionDeclarations";
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name68);
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations", moveFunctionDeclarations);
        PassFactory nameUnmappedAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$72"));
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$72", "this$0", expected);
        String name69 = "nameAnonymousFunctions";
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name69);
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions", nameUnmappedAnonymousFunctions);
        PassFactory nameMappedAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$73"));
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$73", "this$0", expected);
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name69);
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions", nameMappedAnonymousFunctions);
        PassFactory operaCompoundAssignFix = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$74"));
        setField(operaCompoundAssignFix, "com.google.javascript.jscomp.DefaultPassConfig$74", "this$0", expected);
        String name70 = "operaCompoundAssignFix";
        setField(operaCompoundAssignFix, "com.google.javascript.jscomp.PassFactory", "name", name70);
        setField(operaCompoundAssignFix, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "operaCompoundAssignFix", operaCompoundAssignFix);
        PassFactory aliasExternals = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$75"));
        setField(aliasExternals, "com.google.javascript.jscomp.DefaultPassConfig$75", "this$0", expected);
        String name71 = "aliasExternals";
        setField(aliasExternals, "com.google.javascript.jscomp.PassFactory", "name", name71);
        setField(aliasExternals, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals", aliasExternals);
        PassFactory aliasStrings = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$76"));
        setField(aliasStrings, "com.google.javascript.jscomp.DefaultPassConfig$76", "this$0", expected);
        String name72 = "aliasStrings";
        setField(aliasStrings, "com.google.javascript.jscomp.PassFactory", "name", name72);
        setField(aliasStrings, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings", aliasStrings);
        PassFactory aliasKeywords = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$77"));
        setField(aliasKeywords, "com.google.javascript.jscomp.DefaultPassConfig$77", "this$0", expected);
        String name73 = "aliasKeywords";
        setField(aliasKeywords, "com.google.javascript.jscomp.PassFactory", "name", name73);
        setField(aliasKeywords, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords", aliasKeywords);
        PassFactory objectPropertyStringPostprocess = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$78"));
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.DefaultPassConfig$78", "this$0", expected);
        String name74 = "ObjectPropertyStringPostprocess";
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.PassFactory", "name", name74);
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess", objectPropertyStringPostprocess);
        PassFactory ambiguateProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$79"));
        setField(ambiguateProperties, "com.google.javascript.jscomp.DefaultPassConfig$79", "this$0", expected);
        String name75 = "ambiguateProperties";
        setField(ambiguateProperties, "com.google.javascript.jscomp.PassFactory", "name", name75);
        setField(ambiguateProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties", ambiguateProperties);
        PassFactory markUnnormalized = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$80"));
        setField(markUnnormalized, "com.google.javascript.jscomp.DefaultPassConfig$80", "this$0", expected);
        String name76 = "markUnnormalized";
        setField(markUnnormalized, "com.google.javascript.jscomp.PassFactory", "name", name76);
        setField(markUnnormalized, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markUnnormalized", markUnnormalized);
        PassFactory denormalize = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$81"));
        setField(denormalize, "com.google.javascript.jscomp.DefaultPassConfig$81", "this$0", expected);
        String name77 = "denormalize";
        setField(denormalize, "com.google.javascript.jscomp.PassFactory", "name", name77);
        setField(denormalize, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize", denormalize);
        PassFactory invertContextualRenaming = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$82"));
        setField(invertContextualRenaming, "com.google.javascript.jscomp.DefaultPassConfig$82", "this$0", expected);
        String name78 = "invertNames";
        setField(invertContextualRenaming, "com.google.javascript.jscomp.PassFactory", "name", name78);
        setField(invertContextualRenaming, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming", invertContextualRenaming);
        PassFactory renameProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$83"));
        setField(renameProperties, "com.google.javascript.jscomp.DefaultPassConfig$83", "this$0", expected);
        String name79 = "renameProperties";
        setField(renameProperties, "com.google.javascript.jscomp.PassFactory", "name", name79);
        setField(renameProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties", renameProperties);
        PassFactory renameVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$84"));
        setField(renameVars, "com.google.javascript.jscomp.DefaultPassConfig$84", "this$0", expected);
        String name80 = "renameVars";
        setField(renameVars, "com.google.javascript.jscomp.PassFactory", "name", name80);
        setField(renameVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars", renameVars);
        PassFactory renameLabels = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$85"));
        setField(renameLabels, "com.google.javascript.jscomp.DefaultPassConfig$85", "this$0", expected);
        String name81 = "renameLabels";
        setField(renameLabels, "com.google.javascript.jscomp.PassFactory", "name", name81);
        setField(renameLabels, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels", renameLabels);
        PassFactory convertToDottedProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$86"));
        setField(convertToDottedProperties, "com.google.javascript.jscomp.DefaultPassConfig$86", "this$0", expected);
        String name82 = "convertToDottedProperties";
        setField(convertToDottedProperties, "com.google.javascript.jscomp.PassFactory", "name", name82);
        setField(convertToDottedProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties", convertToDottedProperties);
        PassFactory sanityCheckAst = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$87"));
        setField(sanityCheckAst, "com.google.javascript.jscomp.DefaultPassConfig$87", "this$0", expected);
        String name83 = "sanityCheckAst";
        setField(sanityCheckAst, "com.google.javascript.jscomp.PassFactory", "name", name83);
        setField(sanityCheckAst, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckAst", sanityCheckAst);
        PassFactory sanityCheckVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$88"));
        setField(sanityCheckVars, "com.google.javascript.jscomp.DefaultPassConfig$88", "this$0", expected);
        String name84 = "sanityCheckVars";
        setField(sanityCheckVars, "com.google.javascript.jscomp.PassFactory", "name", name84);
        setField(sanityCheckVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars", sanityCheckVars);
        PassFactory instrumentFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$89"));
        setField(instrumentFunctions, "com.google.javascript.jscomp.DefaultPassConfig$89", "this$0", expected);
        String name85 = "instrumentFunctions";
        setField(instrumentFunctions, "com.google.javascript.jscomp.PassFactory", "name", name85);
        setField(instrumentFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions", instrumentFunctions);
        PassFactory printNameReferenceGraph = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$93"));
        setField(printNameReferenceGraph, "com.google.javascript.jscomp.DefaultPassConfig$93", "this$0", expected);
        String name86 = "printNameReferenceGraph";
        setField(printNameReferenceGraph, "com.google.javascript.jscomp.PassFactory", "name", name86);
        setField(printNameReferenceGraph, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceGraph", printNameReferenceGraph);
        PassFactory printNameReferenceReport = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$94"));
        setField(printNameReferenceReport, "com.google.javascript.jscomp.DefaultPassConfig$94", "this$0", expected);
        String name87 = "printNameReferenceReport";
        setField(printNameReferenceReport, "com.google.javascript.jscomp.PassFactory", "name", name87);
        setField(printNameReferenceReport, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceReport", printNameReferenceReport);
        
        GlobalNamespace actualNamespaceForChecks = ((GlobalNamespace) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "namespaceForChecks"));
        assertNull(actualNamespaceForChecks);
        
        TightenTypes actualTightenTypes = ((TightenTypes) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypes"));
        assertNull(actualTightenTypes);
        
        Set actualExportedNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exportedNames"));
        assertNull(actualExportedNames);
        
        CrossModuleMethodMotion.IdGenerator expectedCrossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator"));
        CrossModuleMethodMotion.IdGenerator actualCrossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator"));
        int expectedCrossModuleIdGeneratorCurrentId = ((Integer) getFieldValue(expectedCrossModuleIdGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId"));
        int actualCrossModuleIdGeneratorCurrentId = ((Integer) getFieldValue(actualCrossModuleIdGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId"));
        assertEquals(expectedCrossModuleIdGeneratorCurrentId, actualCrossModuleIdGeneratorCurrentId);
        
        Map actualCssNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "cssNames"));
        assertNull(actualCssNames);
        
        VariableMap actualVariableMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "variableMap"));
        assertNull(actualVariableMap);
        
        VariableMap actualPropertyMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "propertyMap"));
        assertNull(actualPropertyMap);
        
        VariableMap actualAnonymousFunctionNameMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "anonymousFunctionNameMap"));
        assertNull(actualAnonymousFunctionNameMap);
        
        FunctionNames actualFunctionNames = ((FunctionNames) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "functionNames"));
        assertNull(actualFunctionNames);
        
        VariableMap actualStringMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "stringMap"));
        assertNull(actualStringMap);
        
        String actualIdGeneratorMap = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "idGeneratorMap"));
        assertNull(actualIdGeneratorMap);
        
        DefaultPassConfig.HotSwapPassFactory expectedSuspiciousCode = expected.suspiciousCode;
        DefaultPassConfig.HotSwapPassFactory actualSuspiciousCode = actual.suspiciousCode;
        String expectedSuspiciousCodeName = expectedSuspiciousCode.getName();
        String actualSuspiciousCodeName = actualSuspiciousCode.getName();
        assertEquals(expectedSuspiciousCodeName, actualSuspiciousCodeName);
        
        boolean actualSuspiciousCodeIsOneTimePass = ((Boolean) getFieldValue(actualSuspiciousCode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass"));
        assertTrue(actualSuspiciousCodeIsOneTimePass);
        
        boolean actualSuspiciousCodeIsCreated = ((Boolean) getFieldValue(actualSuspiciousCode, "com.google.javascript.jscomp.PassFactory", "isCreated"));
        assertFalse(actualSuspiciousCodeIsCreated);
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckControlStructures = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        DefaultPassConfig.HotSwapPassFactory actualCheckControlStructures = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        String expectedCheckControlStructuresName = expectedCheckControlStructures.getName();
        String actualCheckControlStructuresName = actualCheckControlStructures.getName();
        assertEquals(expectedCheckControlStructuresName, actualCheckControlStructuresName);
        
        assertTrue(deepEquals(expectedCheckControlStructures, actualCheckControlStructures));
        assertTrue(deepEquals(expectedCheckControlStructures, actualCheckControlStructures));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckRequires = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        DefaultPassConfig.HotSwapPassFactory actualCheckRequires = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        String expectedCheckRequiresName = expectedCheckRequires.getName();
        String actualCheckRequiresName = actualCheckRequires.getName();
        assertEquals(expectedCheckRequiresName, actualCheckRequiresName);
        
        assertTrue(deepEquals(expectedCheckRequires, actualCheckRequires));
        assertTrue(deepEquals(expectedCheckRequires, actualCheckRequires));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckProvides = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
        DefaultPassConfig.HotSwapPassFactory actualCheckProvides = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
        String expectedCheckProvidesName = expectedCheckProvides.getName();
        String actualCheckProvidesName = actualCheckProvides.getName();
        assertEquals(expectedCheckProvidesName, actualCheckProvidesName);
        
        assertTrue(deepEquals(expectedCheckProvides, actualCheckProvides));
        assertTrue(deepEquals(expectedCheckProvides, actualCheckProvides));
        
        PassFactory expectedGenerateExports = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "generateExports"));
        PassFactory actualGenerateExports = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "generateExports"));
        String expectedGenerateExportsName = expectedGenerateExports.getName();
        String actualGenerateExportsName = actualGenerateExports.getName();
        assertEquals(expectedGenerateExportsName, actualGenerateExportsName);
        
        assertTrue(deepEquals(expectedGenerateExports, actualGenerateExports));
        assertTrue(deepEquals(expectedGenerateExports, actualGenerateExports));
        
        PassFactory expectedExportTestFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "exportTestFunctions"));
        PassFactory actualExportTestFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exportTestFunctions"));
        String expectedExportTestFunctionsName = expectedExportTestFunctions.getName();
        String actualExportTestFunctionsName = actualExportTestFunctions.getName();
        assertEquals(expectedExportTestFunctionsName, actualExportTestFunctionsName);
        
        assertTrue(deepEquals(expectedExportTestFunctions, actualExportTestFunctions));
        assertTrue(deepEquals(expectedExportTestFunctions, actualExportTestFunctions));
        
        PassFactory expectedGatherRawExports = expected.gatherRawExports;
        PassFactory actualGatherRawExports = actual.gatherRawExports;
        String expectedGatherRawExportsName = expectedGatherRawExports.getName();
        String actualGatherRawExportsName = actualGatherRawExports.getName();
        assertEquals(expectedGatherRawExportsName, actualGatherRawExportsName);
        
        boolean actualGatherRawExportsIsOneTimePass = ((Boolean) getFieldValue(actualGatherRawExports, "com.google.javascript.jscomp.PassFactory", "isOneTimePass"));
        assertFalse(actualGatherRawExportsIsOneTimePass);
        
        assertTrue(deepEquals(expectedGatherRawExports, actualGatherRawExports));
        
        DefaultPassConfig.HotSwapPassFactory expectedClosurePrimitives = expected.closurePrimitives;
        DefaultPassConfig.HotSwapPassFactory actualClosurePrimitives = actual.closurePrimitives;
        String expectedClosurePrimitivesName = expectedClosurePrimitives.getName();
        String actualClosurePrimitivesName = actualClosurePrimitives.getName();
        assertEquals(expectedClosurePrimitivesName, actualClosurePrimitivesName);
        
        assertTrue(deepEquals(expectedClosurePrimitives, actualClosurePrimitives));
        assertTrue(deepEquals(expectedClosurePrimitives, actualClosurePrimitives));
        
        PassFactory expectedReplaceMessages = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceMessages"));
        PassFactory actualReplaceMessages = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceMessages"));
        String expectedReplaceMessagesName = expectedReplaceMessages.getName();
        String actualReplaceMessagesName = actualReplaceMessages.getName();
        assertEquals(expectedReplaceMessagesName, actualReplaceMessagesName);
        
        assertTrue(deepEquals(expectedReplaceMessages, actualReplaceMessages));
        assertTrue(deepEquals(expectedReplaceMessages, actualReplaceMessages));
        
        DefaultPassConfig.HotSwapPassFactory expectedClosureGoogScopeAliases = expected.closureGoogScopeAliases;
        DefaultPassConfig.HotSwapPassFactory actualClosureGoogScopeAliases = actual.closureGoogScopeAliases;
        String expectedClosureGoogScopeAliasesName = expectedClosureGoogScopeAliases.getName();
        String actualClosureGoogScopeAliasesName = actualClosureGoogScopeAliases.getName();
        assertEquals(expectedClosureGoogScopeAliasesName, actualClosureGoogScopeAliasesName);
        
        assertTrue(deepEquals(expectedClosureGoogScopeAliases, actualClosureGoogScopeAliases));
        assertTrue(deepEquals(expectedClosureGoogScopeAliases, actualClosureGoogScopeAliases));
        
        PassFactory expectedClosureCheckGetCssName = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName"));
        PassFactory actualClosureCheckGetCssName = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName"));
        String expectedClosureCheckGetCssNameName = expectedClosureCheckGetCssName.getName();
        String actualClosureCheckGetCssNameName = actualClosureCheckGetCssName.getName();
        assertEquals(expectedClosureCheckGetCssNameName, actualClosureCheckGetCssNameName);
        
        assertTrue(deepEquals(expectedClosureCheckGetCssName, actualClosureCheckGetCssName));
        assertTrue(deepEquals(expectedClosureCheckGetCssName, actualClosureCheckGetCssName));
        
        PassFactory expectedClosureReplaceGetCssName = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName"));
        PassFactory actualClosureReplaceGetCssName = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName"));
        String expectedClosureReplaceGetCssNameName = expectedClosureReplaceGetCssName.getName();
        String actualClosureReplaceGetCssNameName = actualClosureReplaceGetCssName.getName();
        assertEquals(expectedClosureReplaceGetCssNameName, actualClosureReplaceGetCssNameName);
        
        assertTrue(deepEquals(expectedClosureReplaceGetCssName, actualClosureReplaceGetCssName));
        assertTrue(deepEquals(expectedClosureReplaceGetCssName, actualClosureReplaceGetCssName));
        
        PassFactory expectedCreateSyntheticBlocks = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks"));
        PassFactory actualCreateSyntheticBlocks = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks"));
        String expectedCreateSyntheticBlocksName = expectedCreateSyntheticBlocks.getName();
        String actualCreateSyntheticBlocksName = actualCreateSyntheticBlocks.getName();
        assertEquals(expectedCreateSyntheticBlocksName, actualCreateSyntheticBlocksName);
        
        assertTrue(deepEquals(expectedCreateSyntheticBlocks, actualCreateSyntheticBlocks));
        assertTrue(deepEquals(expectedCreateSyntheticBlocks, actualCreateSyntheticBlocks));
        
        PassFactory expectedPeepholeOptimizations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "peepholeOptimizations"));
        PassFactory actualPeepholeOptimizations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "peepholeOptimizations"));
        String expectedPeepholeOptimizationsName = expectedPeepholeOptimizations.getName();
        String actualPeepholeOptimizationsName = actualPeepholeOptimizations.getName();
        assertEquals(expectedPeepholeOptimizationsName, actualPeepholeOptimizationsName);
        
        assertTrue(deepEquals(expectedPeepholeOptimizations, actualPeepholeOptimizations));
        assertTrue(deepEquals(expectedPeepholeOptimizations, actualPeepholeOptimizations));
        
        PassFactory expectedLatePeepholeOptimizations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "latePeepholeOptimizations"));
        PassFactory actualLatePeepholeOptimizations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "latePeepholeOptimizations"));
        assertTrue(deepEquals(expectedLatePeepholeOptimizations, actualLatePeepholeOptimizations));
        assertTrue(deepEquals(expectedLatePeepholeOptimizations, actualLatePeepholeOptimizations));
        assertTrue(deepEquals(expectedLatePeepholeOptimizations, actualLatePeepholeOptimizations));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckVars = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        DefaultPassConfig.HotSwapPassFactory actualCheckVars = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        String expectedCheckVarsName = expectedCheckVars.getName();
        String actualCheckVarsName = actualCheckVars.getName();
        assertEquals(expectedCheckVarsName, actualCheckVarsName);
        
        assertTrue(deepEquals(expectedCheckVars, actualCheckVars));
        assertTrue(deepEquals(expectedCheckVars, actualCheckVars));
        
        PassFactory expectedCheckRegExp = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRegExp"));
        PassFactory actualCheckRegExp = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRegExp"));
        String expectedCheckRegExpName = expectedCheckRegExp.getName();
        String actualCheckRegExpName = actualCheckRegExp.getName();
        assertEquals(expectedCheckRegExpName, actualCheckRegExpName);
        
        assertTrue(deepEquals(expectedCheckRegExp, actualCheckRegExp));
        assertTrue(deepEquals(expectedCheckRegExp, actualCheckRegExp));
        
        PassFactory expectedCheckShadowVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        PassFactory actualCheckShadowVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        String expectedCheckShadowVarsName = expectedCheckShadowVars.getName();
        String actualCheckShadowVarsName = actualCheckShadowVars.getName();
        assertEquals(expectedCheckShadowVarsName, actualCheckShadowVarsName);
        
        assertTrue(deepEquals(expectedCheckShadowVars, actualCheckShadowVars));
        assertTrue(deepEquals(expectedCheckShadowVars, actualCheckShadowVars));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckVariableReferences = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
        DefaultPassConfig.HotSwapPassFactory actualCheckVariableReferences = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
        String expectedCheckVariableReferencesName = expectedCheckVariableReferences.getName();
        String actualCheckVariableReferencesName = actualCheckVariableReferences.getName();
        assertEquals(expectedCheckVariableReferencesName, actualCheckVariableReferencesName);
        
        assertTrue(deepEquals(expectedCheckVariableReferences, actualCheckVariableReferences));
        assertTrue(deepEquals(expectedCheckVariableReferences, actualCheckVariableReferences));
        
        PassFactory expectedObjectPropertyStringPreprocess = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess"));
        PassFactory actualObjectPropertyStringPreprocess = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess"));
        String expectedObjectPropertyStringPreprocessName = expectedObjectPropertyStringPreprocess.getName();
        String actualObjectPropertyStringPreprocessName = actualObjectPropertyStringPreprocess.getName();
        assertEquals(expectedObjectPropertyStringPreprocessName, actualObjectPropertyStringPreprocessName);
        
        assertTrue(deepEquals(expectedObjectPropertyStringPreprocess, actualObjectPropertyStringPreprocess));
        assertTrue(deepEquals(expectedObjectPropertyStringPreprocess, actualObjectPropertyStringPreprocess));
        
        DefaultPassConfig.HotSwapPassFactory expectedResolveTypes = expected.resolveTypes;
        DefaultPassConfig.HotSwapPassFactory actualResolveTypes = actual.resolveTypes;
        String expectedResolveTypesName = expectedResolveTypes.getName();
        String actualResolveTypesName = actualResolveTypes.getName();
        assertEquals(expectedResolveTypesName, actualResolveTypesName);
        
        assertTrue(deepEquals(expectedResolveTypes, actualResolveTypes));
        assertTrue(deepEquals(expectedResolveTypes, actualResolveTypes));
        
        DefaultPassConfig.HotSwapPassFactory expectedInferTypes = expected.inferTypes;
        DefaultPassConfig.HotSwapPassFactory actualInferTypes = actual.inferTypes;
        String expectedInferTypesName = expectedInferTypes.getName();
        String actualInferTypesName = actualInferTypes.getName();
        assertEquals(expectedInferTypesName, actualInferTypesName);
        
        assertTrue(deepEquals(expectedInferTypes, actualInferTypes));
        assertTrue(deepEquals(expectedInferTypes, actualInferTypes));
        
        DefaultPassConfig.HotSwapPassFactory expectedInferJsDocInfo = expected.inferJsDocInfo;
        DefaultPassConfig.HotSwapPassFactory actualInferJsDocInfo = actual.inferJsDocInfo;
        String expectedInferJsDocInfoName = expectedInferJsDocInfo.getName();
        String actualInferJsDocInfoName = actualInferJsDocInfo.getName();
        assertEquals(expectedInferJsDocInfoName, actualInferJsDocInfoName);
        
        assertTrue(deepEquals(expectedInferJsDocInfo, actualInferJsDocInfo));
        assertTrue(deepEquals(expectedInferJsDocInfo, actualInferJsDocInfo));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckTypes = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        DefaultPassConfig.HotSwapPassFactory actualCheckTypes = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        String expectedCheckTypesName = expectedCheckTypes.getName();
        String actualCheckTypesName = actualCheckTypes.getName();
        assertEquals(expectedCheckTypesName, actualCheckTypesName);
        
        assertTrue(deepEquals(expectedCheckTypes, actualCheckTypes));
        assertTrue(deepEquals(expectedCheckTypes, actualCheckTypes));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckControlFlow = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        DefaultPassConfig.HotSwapPassFactory actualCheckControlFlow = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        String expectedCheckControlFlowName = expectedCheckControlFlow.getName();
        String actualCheckControlFlowName = actualCheckControlFlow.getName();
        assertEquals(expectedCheckControlFlowName, actualCheckControlFlowName);
        
        assertTrue(deepEquals(expectedCheckControlFlow, actualCheckControlFlow));
        assertTrue(deepEquals(expectedCheckControlFlow, actualCheckControlFlow));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckAccessControls = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
        DefaultPassConfig.HotSwapPassFactory actualCheckAccessControls = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
        String expectedCheckAccessControlsName = expectedCheckAccessControls.getName();
        String actualCheckAccessControlsName = actualCheckAccessControls.getName();
        assertEquals(expectedCheckAccessControlsName, actualCheckAccessControlsName);
        
        assertTrue(deepEquals(expectedCheckAccessControls, actualCheckAccessControls));
        assertTrue(deepEquals(expectedCheckAccessControls, actualCheckAccessControls));
        
        PassFactory expectedCheckGlobalNames = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames"));
        PassFactory actualCheckGlobalNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames"));
        String expectedCheckGlobalNamesName = expectedCheckGlobalNames.getName();
        String actualCheckGlobalNamesName = actualCheckGlobalNames.getName();
        assertEquals(expectedCheckGlobalNamesName, actualCheckGlobalNamesName);
        
        assertTrue(deepEquals(expectedCheckGlobalNames, actualCheckGlobalNames));
        assertTrue(deepEquals(expectedCheckGlobalNames, actualCheckGlobalNames));
        
        PassFactory expectedCheckStrictMode = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        PassFactory actualCheckStrictMode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        String expectedCheckStrictModeName = expectedCheckStrictMode.getName();
        String actualCheckStrictModeName = actualCheckStrictMode.getName();
        assertEquals(expectedCheckStrictModeName, actualCheckStrictModeName);
        
        assertTrue(deepEquals(expectedCheckStrictMode, actualCheckStrictMode));
        assertTrue(deepEquals(expectedCheckStrictMode, actualCheckStrictMode));
        
        PassFactory expectedProcessTweaks = expected.processTweaks;
        PassFactory actualProcessTweaks = actual.processTweaks;
        String expectedProcessTweaksName = expectedProcessTweaks.getName();
        String actualProcessTweaksName = actualProcessTweaks.getName();
        assertEquals(expectedProcessTweaksName, actualProcessTweaksName);
        
        assertTrue(deepEquals(expectedProcessTweaks, actualProcessTweaks));
        assertTrue(deepEquals(expectedProcessTweaks, actualProcessTweaks));
        
        PassFactory expectedProcessDefines = expected.processDefines;
        PassFactory actualProcessDefines = actual.processDefines;
        String expectedProcessDefinesName = expectedProcessDefines.getName();
        String actualProcessDefinesName = actualProcessDefines.getName();
        assertEquals(expectedProcessDefinesName, actualProcessDefinesName);
        
        assertTrue(deepEquals(expectedProcessDefines, actualProcessDefines));
        assertTrue(deepEquals(expectedProcessDefines, actualProcessDefines));
        
        PassFactory expectedCheckConsts = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts"));
        PassFactory actualCheckConsts = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts"));
        String expectedCheckConstsName = expectedCheckConsts.getName();
        String actualCheckConstsName = actualCheckConsts.getName();
        assertEquals(expectedCheckConstsName, actualCheckConstsName);
        
        assertTrue(deepEquals(expectedCheckConsts, actualCheckConsts));
        assertTrue(deepEquals(expectedCheckConsts, actualCheckConsts));
        
        PassFactory expectedComputeFunctionNames = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames"));
        PassFactory actualComputeFunctionNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames"));
        String expectedComputeFunctionNamesName = expectedComputeFunctionNames.getName();
        String actualComputeFunctionNamesName = actualComputeFunctionNames.getName();
        assertEquals(expectedComputeFunctionNamesName, actualComputeFunctionNamesName);
        
        assertTrue(deepEquals(expectedComputeFunctionNames, actualComputeFunctionNames));
        assertTrue(deepEquals(expectedComputeFunctionNames, actualComputeFunctionNames));
        
        PassFactory expectedIgnoreCajaProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties"));
        PassFactory actualIgnoreCajaProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties"));
        String expectedIgnoreCajaPropertiesName = expectedIgnoreCajaProperties.getName();
        String actualIgnoreCajaPropertiesName = actualIgnoreCajaProperties.getName();
        assertEquals(expectedIgnoreCajaPropertiesName, actualIgnoreCajaPropertiesName);
        
        assertTrue(deepEquals(expectedIgnoreCajaProperties, actualIgnoreCajaProperties));
        assertTrue(deepEquals(expectedIgnoreCajaProperties, actualIgnoreCajaProperties));
        
        PassFactory expectedRuntimeTypeCheck = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck"));
        PassFactory actualRuntimeTypeCheck = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck"));
        String expectedRuntimeTypeCheckName = expectedRuntimeTypeCheck.getName();
        String actualRuntimeTypeCheckName = actualRuntimeTypeCheck.getName();
        assertEquals(expectedRuntimeTypeCheckName, actualRuntimeTypeCheckName);
        
        assertTrue(deepEquals(expectedRuntimeTypeCheck, actualRuntimeTypeCheck));
        assertTrue(deepEquals(expectedRuntimeTypeCheck, actualRuntimeTypeCheck));
        
        PassFactory expectedReplaceIdGenerators = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators"));
        PassFactory actualReplaceIdGenerators = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators"));
        String expectedReplaceIdGeneratorsName = expectedReplaceIdGenerators.getName();
        String actualReplaceIdGeneratorsName = actualReplaceIdGenerators.getName();
        assertEquals(expectedReplaceIdGeneratorsName, actualReplaceIdGeneratorsName);
        
        assertTrue(deepEquals(expectedReplaceIdGenerators, actualReplaceIdGenerators));
        assertTrue(deepEquals(expectedReplaceIdGenerators, actualReplaceIdGenerators));
        
        PassFactory expectedReplaceStrings = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceStrings"));
        PassFactory actualReplaceStrings = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceStrings"));
        String expectedReplaceStringsName = expectedReplaceStrings.getName();
        String actualReplaceStringsName = actualReplaceStrings.getName();
        assertEquals(expectedReplaceStringsName, actualReplaceStringsName);
        
        assertTrue(deepEquals(expectedReplaceStrings, actualReplaceStrings));
        assertTrue(deepEquals(expectedReplaceStrings, actualReplaceStrings));
        
        PassFactory expectedOptimizeArgumentsArray = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        PassFactory actualOptimizeArgumentsArray = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        String expectedOptimizeArgumentsArrayName = expectedOptimizeArgumentsArray.getName();
        String actualOptimizeArgumentsArrayName = actualOptimizeArgumentsArray.getName();
        assertEquals(expectedOptimizeArgumentsArrayName, actualOptimizeArgumentsArrayName);
        
        assertTrue(deepEquals(expectedOptimizeArgumentsArray, actualOptimizeArgumentsArray));
        assertTrue(deepEquals(expectedOptimizeArgumentsArray, actualOptimizeArgumentsArray));
        
        PassFactory expectedClosureCodeRemoval = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCodeRemoval"));
        PassFactory actualClosureCodeRemoval = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureCodeRemoval"));
        String expectedClosureCodeRemovalName = expectedClosureCodeRemoval.getName();
        String actualClosureCodeRemovalName = actualClosureCodeRemoval.getName();
        assertEquals(expectedClosureCodeRemovalName, actualClosureCodeRemovalName);
        
        assertTrue(deepEquals(expectedClosureCodeRemoval, actualClosureCodeRemoval));
        assertTrue(deepEquals(expectedClosureCodeRemoval, actualClosureCodeRemoval));
        
        PassFactory expectedClosureOptimizePrimitives = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureOptimizePrimitives"));
        PassFactory actualClosureOptimizePrimitives = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureOptimizePrimitives"));
        String expectedClosureOptimizePrimitivesName = expectedClosureOptimizePrimitives.getName();
        String actualClosureOptimizePrimitivesName = actualClosureOptimizePrimitives.getName();
        assertEquals(expectedClosureOptimizePrimitivesName, actualClosureOptimizePrimitivesName);
        
        assertTrue(deepEquals(expectedClosureOptimizePrimitives, actualClosureOptimizePrimitives));
        assertTrue(deepEquals(expectedClosureOptimizePrimitives, actualClosureOptimizePrimitives));
        
        PassFactory expectedCollapseProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        PassFactory actualCollapseProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        String expectedCollapsePropertiesName = expectedCollapseProperties.getName();
        String actualCollapsePropertiesName = actualCollapseProperties.getName();
        assertEquals(expectedCollapsePropertiesName, actualCollapsePropertiesName);
        
        assertTrue(deepEquals(expectedCollapseProperties, actualCollapseProperties));
        assertTrue(deepEquals(expectedCollapseProperties, actualCollapseProperties));
        
        PassFactory expectedCollapseObjectLiterals = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseObjectLiterals"));
        PassFactory actualCollapseObjectLiterals = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseObjectLiterals"));
        String expectedCollapseObjectLiteralsName = expectedCollapseObjectLiterals.getName();
        String actualCollapseObjectLiteralsName = actualCollapseObjectLiterals.getName();
        assertEquals(expectedCollapseObjectLiteralsName, actualCollapseObjectLiteralsName);
        
        assertTrue(deepEquals(expectedCollapseObjectLiterals, actualCollapseObjectLiterals));
        assertTrue(deepEquals(expectedCollapseObjectLiterals, actualCollapseObjectLiterals));
        
        PassFactory expectedTightenTypesBuilder = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder"));
        PassFactory actualTightenTypesBuilder = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder"));
        String expectedTightenTypesBuilderName = expectedTightenTypesBuilder.getName();
        String actualTightenTypesBuilderName = actualTightenTypesBuilder.getName();
        assertEquals(expectedTightenTypesBuilderName, actualTightenTypesBuilderName);
        
        assertTrue(deepEquals(expectedTightenTypesBuilder, actualTightenTypesBuilder));
        assertTrue(deepEquals(expectedTightenTypesBuilder, actualTightenTypesBuilder));
        
        PassFactory expectedDisambiguateProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties"));
        PassFactory actualDisambiguateProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties"));
        String expectedDisambiguatePropertiesName = expectedDisambiguateProperties.getName();
        String actualDisambiguatePropertiesName = actualDisambiguateProperties.getName();
        assertEquals(expectedDisambiguatePropertiesName, actualDisambiguatePropertiesName);
        
        assertTrue(deepEquals(expectedDisambiguateProperties, actualDisambiguateProperties));
        assertTrue(deepEquals(expectedDisambiguateProperties, actualDisambiguateProperties));
        
        PassFactory expectedChainCalls = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls"));
        PassFactory actualChainCalls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls"));
        String expectedChainCallsName = expectedChainCalls.getName();
        String actualChainCallsName = actualChainCalls.getName();
        assertEquals(expectedChainCallsName, actualChainCallsName);
        
        assertTrue(deepEquals(expectedChainCalls, actualChainCalls));
        assertTrue(deepEquals(expectedChainCalls, actualChainCalls));
        
        PassFactory expectedDevirtualizePrototypeMethods = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods"));
        PassFactory actualDevirtualizePrototypeMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods"));
        String expectedDevirtualizePrototypeMethodsName = expectedDevirtualizePrototypeMethods.getName();
        String actualDevirtualizePrototypeMethodsName = actualDevirtualizePrototypeMethods.getName();
        assertEquals(expectedDevirtualizePrototypeMethodsName, actualDevirtualizePrototypeMethodsName);
        
        assertTrue(deepEquals(expectedDevirtualizePrototypeMethods, actualDevirtualizePrototypeMethods));
        assertTrue(deepEquals(expectedDevirtualizePrototypeMethods, actualDevirtualizePrototypeMethods));
        
        PassFactory expectedOptimizeCallsAndRemoveUnusedVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeCallsAndRemoveUnusedVars"));
        PassFactory actualOptimizeCallsAndRemoveUnusedVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeCallsAndRemoveUnusedVars"));
        String expectedOptimizeCallsAndRemoveUnusedVarsName = expectedOptimizeCallsAndRemoveUnusedVars.getName();
        String actualOptimizeCallsAndRemoveUnusedVarsName = actualOptimizeCallsAndRemoveUnusedVars.getName();
        assertEquals(expectedOptimizeCallsAndRemoveUnusedVarsName, actualOptimizeCallsAndRemoveUnusedVarsName);
        
        assertTrue(deepEquals(expectedOptimizeCallsAndRemoveUnusedVars, actualOptimizeCallsAndRemoveUnusedVars));
        assertTrue(deepEquals(expectedOptimizeCallsAndRemoveUnusedVars, actualOptimizeCallsAndRemoveUnusedVars));
        
        PassFactory expectedMarkPureFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions"));
        PassFactory actualMarkPureFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions"));
        String expectedMarkPureFunctionsName = expectedMarkPureFunctions.getName();
        String actualMarkPureFunctionsName = actualMarkPureFunctions.getName();
        assertEquals(expectedMarkPureFunctionsName, actualMarkPureFunctionsName);
        
        assertTrue(deepEquals(expectedMarkPureFunctions, actualMarkPureFunctions));
        assertTrue(deepEquals(expectedMarkPureFunctions, actualMarkPureFunctions));
        
        PassFactory expectedMarkNoSideEffectCalls = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls"));
        PassFactory actualMarkNoSideEffectCalls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls"));
        String expectedMarkNoSideEffectCallsName = expectedMarkNoSideEffectCalls.getName();
        String actualMarkNoSideEffectCallsName = actualMarkNoSideEffectCalls.getName();
        assertEquals(expectedMarkNoSideEffectCallsName, actualMarkNoSideEffectCallsName);
        
        assertTrue(deepEquals(expectedMarkNoSideEffectCalls, actualMarkNoSideEffectCalls));
        assertTrue(deepEquals(expectedMarkNoSideEffectCalls, actualMarkNoSideEffectCalls));
        
        PassFactory expectedInlineVariables = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables"));
        PassFactory actualInlineVariables = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables"));
        String expectedInlineVariablesName = expectedInlineVariables.getName();
        String actualInlineVariablesName = actualInlineVariables.getName();
        assertEquals(expectedInlineVariablesName, actualInlineVariablesName);
        
        assertTrue(deepEquals(expectedInlineVariables, actualInlineVariables));
        assertTrue(deepEquals(expectedInlineVariables, actualInlineVariables));
        
        PassFactory expectedInlineConstants = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants"));
        PassFactory actualInlineConstants = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants"));
        String expectedInlineConstantsName = expectedInlineConstants.getName();
        String actualInlineConstantsName = actualInlineConstants.getName();
        assertEquals(expectedInlineConstantsName, actualInlineConstantsName);
        
        assertTrue(deepEquals(expectedInlineConstants, actualInlineConstants));
        assertTrue(deepEquals(expectedInlineConstants, actualInlineConstants));
        
        PassFactory expectedMinimizeExitPoints = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints"));
        PassFactory actualMinimizeExitPoints = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints"));
        String expectedMinimizeExitPointsName = expectedMinimizeExitPoints.getName();
        String actualMinimizeExitPointsName = actualMinimizeExitPoints.getName();
        assertEquals(expectedMinimizeExitPointsName, actualMinimizeExitPointsName);
        
        assertTrue(deepEquals(expectedMinimizeExitPoints, actualMinimizeExitPoints));
        assertTrue(deepEquals(expectedMinimizeExitPoints, actualMinimizeExitPoints));
        
        PassFactory expectedRemoveUnreachableCode = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode"));
        PassFactory actualRemoveUnreachableCode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode"));
        String expectedRemoveUnreachableCodeName = expectedRemoveUnreachableCode.getName();
        String actualRemoveUnreachableCodeName = actualRemoveUnreachableCode.getName();
        assertEquals(expectedRemoveUnreachableCodeName, actualRemoveUnreachableCodeName);
        
        assertTrue(deepEquals(expectedRemoveUnreachableCode, actualRemoveUnreachableCode));
        assertTrue(deepEquals(expectedRemoveUnreachableCode, actualRemoveUnreachableCode));
        
        PassFactory expectedRemoveUnusedPrototypeProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties"));
        PassFactory actualRemoveUnusedPrototypeProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties"));
        String expectedRemoveUnusedPrototypePropertiesName = expectedRemoveUnusedPrototypeProperties.getName();
        String actualRemoveUnusedPrototypePropertiesName = actualRemoveUnusedPrototypeProperties.getName();
        assertEquals(expectedRemoveUnusedPrototypePropertiesName, actualRemoveUnusedPrototypePropertiesName);
        
        assertTrue(deepEquals(expectedRemoveUnusedPrototypeProperties, actualRemoveUnusedPrototypeProperties));
        assertTrue(deepEquals(expectedRemoveUnusedPrototypeProperties, actualRemoveUnusedPrototypeProperties));
        
        PassFactory expectedSmartNamePass = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass"));
        PassFactory actualSmartNamePass = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass"));
        String expectedSmartNamePassName = expectedSmartNamePass.getName();
        String actualSmartNamePassName = actualSmartNamePass.getName();
        assertEquals(expectedSmartNamePassName, actualSmartNamePassName);
        
        assertTrue(deepEquals(expectedSmartNamePass, actualSmartNamePass));
        assertTrue(deepEquals(expectedSmartNamePass, actualSmartNamePass));
        
        PassFactory expectedSmartNamePass2 = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass2"));
        PassFactory actualSmartNamePass2 = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass2"));
        assertTrue(deepEquals(expectedSmartNamePass2, actualSmartNamePass2));
        assertTrue(deepEquals(expectedSmartNamePass2, actualSmartNamePass2));
        assertTrue(deepEquals(expectedSmartNamePass2, actualSmartNamePass2));
        
        PassFactory expectedInlineSimpleMethods = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineSimpleMethods"));
        PassFactory actualInlineSimpleMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineSimpleMethods"));
        String expectedInlineSimpleMethodsName = expectedInlineSimpleMethods.getName();
        String actualInlineSimpleMethodsName = actualInlineSimpleMethods.getName();
        assertEquals(expectedInlineSimpleMethodsName, actualInlineSimpleMethodsName);
        
        assertTrue(deepEquals(expectedInlineSimpleMethods, actualInlineSimpleMethods));
        assertTrue(deepEquals(expectedInlineSimpleMethods, actualInlineSimpleMethods));
        
        PassFactory expectedDeadAssignmentsElimination = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination"));
        PassFactory actualDeadAssignmentsElimination = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination"));
        String expectedDeadAssignmentsEliminationName = expectedDeadAssignmentsElimination.getName();
        String actualDeadAssignmentsEliminationName = actualDeadAssignmentsElimination.getName();
        assertEquals(expectedDeadAssignmentsEliminationName, actualDeadAssignmentsEliminationName);
        
        assertTrue(deepEquals(expectedDeadAssignmentsElimination, actualDeadAssignmentsElimination));
        assertTrue(deepEquals(expectedDeadAssignmentsElimination, actualDeadAssignmentsElimination));
        
        PassFactory expectedInlineFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions"));
        PassFactory actualInlineFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions"));
        String expectedInlineFunctionsName = expectedInlineFunctions.getName();
        String actualInlineFunctionsName = actualInlineFunctions.getName();
        assertEquals(expectedInlineFunctionsName, actualInlineFunctionsName);
        
        assertTrue(deepEquals(expectedInlineFunctions, actualInlineFunctions));
        assertTrue(deepEquals(expectedInlineFunctions, actualInlineFunctions));
        
        PassFactory expectedRemoveUnusedVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars"));
        PassFactory actualRemoveUnusedVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars"));
        String expectedRemoveUnusedVarsName = expectedRemoveUnusedVars.getName();
        String actualRemoveUnusedVarsName = actualRemoveUnusedVars.getName();
        assertEquals(expectedRemoveUnusedVarsName, actualRemoveUnusedVarsName);
        
        assertTrue(deepEquals(expectedRemoveUnusedVars, actualRemoveUnusedVars));
        assertTrue(deepEquals(expectedRemoveUnusedVars, actualRemoveUnusedVars));
        
        PassFactory expectedCrossModuleCodeMotion = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion"));
        PassFactory actualCrossModuleCodeMotion = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion"));
        String expectedCrossModuleCodeMotionName = expectedCrossModuleCodeMotion.getName();
        String actualCrossModuleCodeMotionName = actualCrossModuleCodeMotion.getName();
        assertEquals(expectedCrossModuleCodeMotionName, actualCrossModuleCodeMotionName);
        
        assertTrue(deepEquals(expectedCrossModuleCodeMotion, actualCrossModuleCodeMotion));
        assertTrue(deepEquals(expectedCrossModuleCodeMotion, actualCrossModuleCodeMotion));
        
        PassFactory expectedCrossModuleMethodMotion = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion"));
        PassFactory actualCrossModuleMethodMotion = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion"));
        String expectedCrossModuleMethodMotionName = expectedCrossModuleMethodMotion.getName();
        String actualCrossModuleMethodMotionName = actualCrossModuleMethodMotion.getName();
        assertEquals(expectedCrossModuleMethodMotionName, actualCrossModuleMethodMotionName);
        
        assertTrue(deepEquals(expectedCrossModuleMethodMotion, actualCrossModuleMethodMotion));
        assertTrue(deepEquals(expectedCrossModuleMethodMotion, actualCrossModuleMethodMotion));
        
        PassFactory expectedSpecializeInitialModule = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "specializeInitialModule"));
        PassFactory actualSpecializeInitialModule = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "specializeInitialModule"));
        String expectedSpecializeInitialModuleName = expectedSpecializeInitialModule.getName();
        String actualSpecializeInitialModuleName = actualSpecializeInitialModule.getName();
        assertEquals(expectedSpecializeInitialModuleName, actualSpecializeInitialModuleName);
        
        assertTrue(deepEquals(expectedSpecializeInitialModule, actualSpecializeInitialModule));
        assertTrue(deepEquals(expectedSpecializeInitialModule, actualSpecializeInitialModule));
        
        PassFactory expectedFlowSensitiveInlineVariables = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables"));
        PassFactory actualFlowSensitiveInlineVariables = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables"));
        String expectedFlowSensitiveInlineVariablesName = expectedFlowSensitiveInlineVariables.getName();
        String actualFlowSensitiveInlineVariablesName = actualFlowSensitiveInlineVariables.getName();
        assertEquals(expectedFlowSensitiveInlineVariablesName, actualFlowSensitiveInlineVariablesName);
        
        assertTrue(deepEquals(expectedFlowSensitiveInlineVariables, actualFlowSensitiveInlineVariables));
        assertTrue(deepEquals(expectedFlowSensitiveInlineVariables, actualFlowSensitiveInlineVariables));
        
        PassFactory expectedCoalesceVariableNames = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames"));
        PassFactory actualCoalesceVariableNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames"));
        String expectedCoalesceVariableNamesName = expectedCoalesceVariableNames.getName();
        String actualCoalesceVariableNamesName = actualCoalesceVariableNames.getName();
        assertEquals(expectedCoalesceVariableNamesName, actualCoalesceVariableNamesName);
        
        assertTrue(deepEquals(expectedCoalesceVariableNames, actualCoalesceVariableNames));
        assertTrue(deepEquals(expectedCoalesceVariableNames, actualCoalesceVariableNames));
        
        PassFactory expectedExploitAssign = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "exploitAssign"));
        PassFactory actualExploitAssign = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exploitAssign"));
        String expectedExploitAssignName = expectedExploitAssign.getName();
        String actualExploitAssignName = actualExploitAssign.getName();
        assertEquals(expectedExploitAssignName, actualExploitAssignName);
        
        assertTrue(deepEquals(expectedExploitAssign, actualExploitAssign));
        assertTrue(deepEquals(expectedExploitAssign, actualExploitAssign));
        
        PassFactory expectedCollapseVariableDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        PassFactory actualCollapseVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        String expectedCollapseVariableDeclarationsName = expectedCollapseVariableDeclarations.getName();
        String actualCollapseVariableDeclarationsName = actualCollapseVariableDeclarations.getName();
        assertEquals(expectedCollapseVariableDeclarationsName, actualCollapseVariableDeclarationsName);
        
        assertTrue(deepEquals(expectedCollapseVariableDeclarations, actualCollapseVariableDeclarations));
        assertTrue(deepEquals(expectedCollapseVariableDeclarations, actualCollapseVariableDeclarations));
        
        PassFactory expectedGroupVariableDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "groupVariableDeclarations"));
        PassFactory actualGroupVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "groupVariableDeclarations"));
        String expectedGroupVariableDeclarationsName = expectedGroupVariableDeclarations.getName();
        String actualGroupVariableDeclarationsName = actualGroupVariableDeclarations.getName();
        assertEquals(expectedGroupVariableDeclarationsName, actualGroupVariableDeclarationsName);
        
        assertTrue(deepEquals(expectedGroupVariableDeclarations, actualGroupVariableDeclarations));
        assertTrue(deepEquals(expectedGroupVariableDeclarations, actualGroupVariableDeclarations));
        
        PassFactory expectedExtractPrototypeMemberDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations"));
        PassFactory actualExtractPrototypeMemberDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations"));
        String expectedExtractPrototypeMemberDeclarationsName = expectedExtractPrototypeMemberDeclarations.getName();
        String actualExtractPrototypeMemberDeclarationsName = actualExtractPrototypeMemberDeclarations.getName();
        assertEquals(expectedExtractPrototypeMemberDeclarationsName, actualExtractPrototypeMemberDeclarationsName);
        
        assertTrue(deepEquals(expectedExtractPrototypeMemberDeclarations, actualExtractPrototypeMemberDeclarations));
        assertTrue(deepEquals(expectedExtractPrototypeMemberDeclarations, actualExtractPrototypeMemberDeclarations));
        
        PassFactory expectedRewriteFunctionExpressions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions"));
        PassFactory actualRewriteFunctionExpressions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions"));
        String expectedRewriteFunctionExpressionsName = expectedRewriteFunctionExpressions.getName();
        String actualRewriteFunctionExpressionsName = actualRewriteFunctionExpressions.getName();
        assertEquals(expectedRewriteFunctionExpressionsName, actualRewriteFunctionExpressionsName);
        
        assertTrue(deepEquals(expectedRewriteFunctionExpressions, actualRewriteFunctionExpressions));
        assertTrue(deepEquals(expectedRewriteFunctionExpressions, actualRewriteFunctionExpressions));
        
        PassFactory expectedCollapseAnonymousFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions"));
        PassFactory actualCollapseAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions"));
        String expectedCollapseAnonymousFunctionsName = expectedCollapseAnonymousFunctions.getName();
        String actualCollapseAnonymousFunctionsName = actualCollapseAnonymousFunctions.getName();
        assertEquals(expectedCollapseAnonymousFunctionsName, actualCollapseAnonymousFunctionsName);
        
        assertTrue(deepEquals(expectedCollapseAnonymousFunctions, actualCollapseAnonymousFunctions));
        assertTrue(deepEquals(expectedCollapseAnonymousFunctions, actualCollapseAnonymousFunctions));
        
        PassFactory expectedMoveFunctionDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations"));
        PassFactory actualMoveFunctionDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations"));
        String expectedMoveFunctionDeclarationsName = expectedMoveFunctionDeclarations.getName();
        String actualMoveFunctionDeclarationsName = actualMoveFunctionDeclarations.getName();
        assertEquals(expectedMoveFunctionDeclarationsName, actualMoveFunctionDeclarationsName);
        
        assertTrue(deepEquals(expectedMoveFunctionDeclarations, actualMoveFunctionDeclarations));
        assertTrue(deepEquals(expectedMoveFunctionDeclarations, actualMoveFunctionDeclarations));
        
        PassFactory expectedNameUnmappedAnonymousFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions"));
        PassFactory actualNameUnmappedAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions"));
        String expectedNameUnmappedAnonymousFunctionsName = expectedNameUnmappedAnonymousFunctions.getName();
        String actualNameUnmappedAnonymousFunctionsName = actualNameUnmappedAnonymousFunctions.getName();
        assertEquals(expectedNameUnmappedAnonymousFunctionsName, actualNameUnmappedAnonymousFunctionsName);
        
        assertTrue(deepEquals(expectedNameUnmappedAnonymousFunctions, actualNameUnmappedAnonymousFunctions));
        assertTrue(deepEquals(expectedNameUnmappedAnonymousFunctions, actualNameUnmappedAnonymousFunctions));
        
        PassFactory expectedNameMappedAnonymousFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions"));
        PassFactory actualNameMappedAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions"));
        assertTrue(deepEquals(expectedNameMappedAnonymousFunctions, actualNameMappedAnonymousFunctions));
        assertTrue(deepEquals(expectedNameMappedAnonymousFunctions, actualNameMappedAnonymousFunctions));
        assertTrue(deepEquals(expectedNameMappedAnonymousFunctions, actualNameMappedAnonymousFunctions));
        
        PassFactory expectedOperaCompoundAssignFix = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "operaCompoundAssignFix"));
        PassFactory actualOperaCompoundAssignFix = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "operaCompoundAssignFix"));
        String expectedOperaCompoundAssignFixName = expectedOperaCompoundAssignFix.getName();
        String actualOperaCompoundAssignFixName = actualOperaCompoundAssignFix.getName();
        assertEquals(expectedOperaCompoundAssignFixName, actualOperaCompoundAssignFixName);
        
        assertTrue(deepEquals(expectedOperaCompoundAssignFix, actualOperaCompoundAssignFix));
        assertTrue(deepEquals(expectedOperaCompoundAssignFix, actualOperaCompoundAssignFix));
        
        PassFactory expectedAliasExternals = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals"));
        PassFactory actualAliasExternals = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals"));
        String expectedAliasExternalsName = expectedAliasExternals.getName();
        String actualAliasExternalsName = actualAliasExternals.getName();
        assertEquals(expectedAliasExternalsName, actualAliasExternalsName);
        
        assertTrue(deepEquals(expectedAliasExternals, actualAliasExternals));
        assertTrue(deepEquals(expectedAliasExternals, actualAliasExternals));
        
        PassFactory expectedAliasStrings = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings"));
        PassFactory actualAliasStrings = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings"));
        String expectedAliasStringsName = expectedAliasStrings.getName();
        String actualAliasStringsName = actualAliasStrings.getName();
        assertEquals(expectedAliasStringsName, actualAliasStringsName);
        
        assertTrue(deepEquals(expectedAliasStrings, actualAliasStrings));
        assertTrue(deepEquals(expectedAliasStrings, actualAliasStrings));
        
        PassFactory expectedAliasKeywords = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords"));
        PassFactory actualAliasKeywords = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords"));
        String expectedAliasKeywordsName = expectedAliasKeywords.getName();
        String actualAliasKeywordsName = actualAliasKeywords.getName();
        assertEquals(expectedAliasKeywordsName, actualAliasKeywordsName);
        
        assertTrue(deepEquals(expectedAliasKeywords, actualAliasKeywords));
        assertTrue(deepEquals(expectedAliasKeywords, actualAliasKeywords));
        
        PassFactory expectedObjectPropertyStringPostprocess = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess"));
        PassFactory actualObjectPropertyStringPostprocess = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess"));
        String expectedObjectPropertyStringPostprocessName = expectedObjectPropertyStringPostprocess.getName();
        String actualObjectPropertyStringPostprocessName = actualObjectPropertyStringPostprocess.getName();
        assertEquals(expectedObjectPropertyStringPostprocessName, actualObjectPropertyStringPostprocessName);
        
        assertTrue(deepEquals(expectedObjectPropertyStringPostprocess, actualObjectPropertyStringPostprocess));
        assertTrue(deepEquals(expectedObjectPropertyStringPostprocess, actualObjectPropertyStringPostprocess));
        
        PassFactory expectedAmbiguateProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties"));
        PassFactory actualAmbiguateProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties"));
        String expectedAmbiguatePropertiesName = expectedAmbiguateProperties.getName();
        String actualAmbiguatePropertiesName = actualAmbiguateProperties.getName();
        assertEquals(expectedAmbiguatePropertiesName, actualAmbiguatePropertiesName);
        
        assertTrue(deepEquals(expectedAmbiguateProperties, actualAmbiguateProperties));
        assertTrue(deepEquals(expectedAmbiguateProperties, actualAmbiguateProperties));
        
        PassFactory expectedMarkUnnormalized = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markUnnormalized"));
        PassFactory actualMarkUnnormalized = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markUnnormalized"));
        String expectedMarkUnnormalizedName = expectedMarkUnnormalized.getName();
        String actualMarkUnnormalizedName = actualMarkUnnormalized.getName();
        assertEquals(expectedMarkUnnormalizedName, actualMarkUnnormalizedName);
        
        assertTrue(deepEquals(expectedMarkUnnormalized, actualMarkUnnormalized));
        assertTrue(deepEquals(expectedMarkUnnormalized, actualMarkUnnormalized));
        
        PassFactory expectedDenormalize = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize"));
        PassFactory actualDenormalize = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize"));
        String expectedDenormalizeName = expectedDenormalize.getName();
        String actualDenormalizeName = actualDenormalize.getName();
        assertEquals(expectedDenormalizeName, actualDenormalizeName);
        
        assertTrue(deepEquals(expectedDenormalize, actualDenormalize));
        assertTrue(deepEquals(expectedDenormalize, actualDenormalize));
        
        PassFactory expectedInvertContextualRenaming = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming"));
        PassFactory actualInvertContextualRenaming = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming"));
        String expectedInvertContextualRenamingName = expectedInvertContextualRenaming.getName();
        String actualInvertContextualRenamingName = actualInvertContextualRenaming.getName();
        assertEquals(expectedInvertContextualRenamingName, actualInvertContextualRenamingName);
        
        assertTrue(deepEquals(expectedInvertContextualRenaming, actualInvertContextualRenaming));
        assertTrue(deepEquals(expectedInvertContextualRenaming, actualInvertContextualRenaming));
        
        PassFactory expectedRenameProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties"));
        PassFactory actualRenameProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties"));
        String expectedRenamePropertiesName = expectedRenameProperties.getName();
        String actualRenamePropertiesName = actualRenameProperties.getName();
        assertEquals(expectedRenamePropertiesName, actualRenamePropertiesName);
        
        assertTrue(deepEquals(expectedRenameProperties, actualRenameProperties));
        assertTrue(deepEquals(expectedRenameProperties, actualRenameProperties));
        
        PassFactory expectedRenameVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars"));
        PassFactory actualRenameVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars"));
        String expectedRenameVarsName = expectedRenameVars.getName();
        String actualRenameVarsName = actualRenameVars.getName();
        assertEquals(expectedRenameVarsName, actualRenameVarsName);
        
        assertTrue(deepEquals(expectedRenameVars, actualRenameVars));
        assertTrue(deepEquals(expectedRenameVars, actualRenameVars));
        
        PassFactory expectedRenameLabels = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels"));
        PassFactory actualRenameLabels = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels"));
        String expectedRenameLabelsName = expectedRenameLabels.getName();
        String actualRenameLabelsName = actualRenameLabels.getName();
        assertEquals(expectedRenameLabelsName, actualRenameLabelsName);
        
        assertTrue(deepEquals(expectedRenameLabels, actualRenameLabels));
        assertTrue(deepEquals(expectedRenameLabels, actualRenameLabels));
        
        PassFactory expectedConvertToDottedProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties"));
        PassFactory actualConvertToDottedProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties"));
        String expectedConvertToDottedPropertiesName = expectedConvertToDottedProperties.getName();
        String actualConvertToDottedPropertiesName = actualConvertToDottedProperties.getName();
        assertEquals(expectedConvertToDottedPropertiesName, actualConvertToDottedPropertiesName);
        
        assertTrue(deepEquals(expectedConvertToDottedProperties, actualConvertToDottedProperties));
        assertTrue(deepEquals(expectedConvertToDottedProperties, actualConvertToDottedProperties));
        
        PassFactory expectedSanityCheckAst = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckAst"));
        PassFactory actualSanityCheckAst = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckAst"));
        String expectedSanityCheckAstName = expectedSanityCheckAst.getName();
        String actualSanityCheckAstName = actualSanityCheckAst.getName();
        assertEquals(expectedSanityCheckAstName, actualSanityCheckAstName);
        
        assertTrue(deepEquals(expectedSanityCheckAst, actualSanityCheckAst));
        assertTrue(deepEquals(expectedSanityCheckAst, actualSanityCheckAst));
        
        PassFactory expectedSanityCheckVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars"));
        PassFactory actualSanityCheckVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars"));
        String expectedSanityCheckVarsName = expectedSanityCheckVars.getName();
        String actualSanityCheckVarsName = actualSanityCheckVars.getName();
        assertEquals(expectedSanityCheckVarsName, actualSanityCheckVarsName);
        
        assertTrue(deepEquals(expectedSanityCheckVars, actualSanityCheckVars));
        assertTrue(deepEquals(expectedSanityCheckVars, actualSanityCheckVars));
        
        PassFactory expectedInstrumentFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions"));
        PassFactory actualInstrumentFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions"));
        String expectedInstrumentFunctionsName = expectedInstrumentFunctions.getName();
        String actualInstrumentFunctionsName = actualInstrumentFunctions.getName();
        assertEquals(expectedInstrumentFunctionsName, actualInstrumentFunctionsName);
        
        assertTrue(deepEquals(expectedInstrumentFunctions, actualInstrumentFunctions));
        assertTrue(deepEquals(expectedInstrumentFunctions, actualInstrumentFunctions));
        
        PassFactory expectedPrintNameReferenceGraph = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceGraph"));
        PassFactory actualPrintNameReferenceGraph = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceGraph"));
        String expectedPrintNameReferenceGraphName = expectedPrintNameReferenceGraph.getName();
        String actualPrintNameReferenceGraphName = actualPrintNameReferenceGraph.getName();
        assertEquals(expectedPrintNameReferenceGraphName, actualPrintNameReferenceGraphName);
        
        assertTrue(deepEquals(expectedPrintNameReferenceGraph, actualPrintNameReferenceGraph));
        assertTrue(deepEquals(expectedPrintNameReferenceGraph, actualPrintNameReferenceGraph));
        
        PassFactory expectedPrintNameReferenceReport = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceReport"));
        PassFactory actualPrintNameReferenceReport = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceReport"));
        String expectedPrintNameReferenceReportName = expectedPrintNameReferenceReport.getName();
        String actualPrintNameReferenceReportName = actualPrintNameReferenceReport.getName();
        assertEquals(expectedPrintNameReferenceReportName, actualPrintNameReferenceReportName);
        
        assertTrue(deepEquals(expectedPrintNameReferenceReport, actualPrintNameReferenceReport));
        assertTrue(deepEquals(expectedPrintNameReferenceReport, actualPrintNameReferenceReport));
        
        CompilerOptions actualOptions = actual.options;
        assertNull(actualOptions);
        
        MemoizedScopeCreator actualTypedScopeCreator = ((MemoizedScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.PassConfig", "typedScopeCreator"));
        assertNull(actualTypedScopeCreator);
        
        TypedScopeCreator actualInternalScopeCreator = ((TypedScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.PassConfig", "internalScopeCreator"));
        assertNull(actualInternalScopeCreator);
        
        Scope actualTopScope = actual.topScope;
        assertNull(actualTopScope);
        
        PassConfig finalCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        assertFalse(initialCompilerPasses == finalCompilerPasses);
    */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.precheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method precheck()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#precheck()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testPrecheck_ReturnTrue() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        boolean actual = compiler.precheck();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.maybeSanityCheck
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeSanityCheck()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#maybeSanityCheck()}
 * @utbot.executesCondition {@code (options.devMode == DevMode.EVERY_PASS): False}
 *  */
    @Test
    public void testMaybeSanityCheck_OptionsDevModeNotEqualsDevModeEVERY_PASS() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method maybeSanityCheckMethod = compilerClazz.getDeclaredMethod("maybeSanityCheck");
        maybeSanityCheckMethod.setAccessible(true);
        java.lang.Object[] maybeSanityCheckMethodArguments = new java.lang.Object[0];
        maybeSanityCheckMethod.invoke(compiler, maybeSanityCheckMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeSanityCheck()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#maybeSanityCheck()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.devMode == DevMode.EVERY_PASS
 *  */
    @Test
    public void testMaybeSanityCheck_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.maybeSanityCheck] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.maybeSanityCheck(Compiler.java:775) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method maybeSanityCheckMethod = compilerClazz.getDeclaredMethod("maybeSanityCheck");
        maybeSanityCheckMethod.setAccessible(true);
        java.lang.Object[] maybeSanityCheckMethodArguments = new java.lang.Object[0];
        try {
            maybeSanityCheckMethod.invoke(compiler, maybeSanityCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#maybeSanityCheck()}
 * @utbot.executesCondition {@code (options.devMode == DevMode.EVERY_PASS): True}
 * @utbot.invokes com.google.javascript.jscomp.Compiler#runSanityCheck()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: runSanityCheck();
 *  */
    @Test
    public void testMaybeSanityCheck_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.maybeSanityCheck] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runSanityCheck(Compiler.java:781)
            com.google.javascript.jscomp.Compiler.maybeSanityCheck(Compiler.java:776) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method maybeSanityCheckMethod = compilerClazz.getDeclaredMethod("maybeSanityCheck");
        maybeSanityCheckMethod.setAccessible(true);
        java.lang.Object[] maybeSanityCheckMethodArguments = new java.lang.Object[0];
        try {
            maybeSanityCheckMethod.invoke(compiler, maybeSanityCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybeSanityCheck()
    
    @Test(expected = IllegalStateException.class)
    public void testMaybeSanityCheck1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$48"));
        setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "isCreated", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "sanityCheck", sanityCheck);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method maybeSanityCheckMethod = compilerClazz.getDeclaredMethod("maybeSanityCheck");
        maybeSanityCheckMethod.setAccessible(true);
        java.lang.Object[] maybeSanityCheckMethodArguments = new java.lang.Object[0];
        try {
            maybeSanityCheckMethod.invoke(compiler, maybeSanityCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testMaybeSanityCheck2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$48"));
        setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "isCreated", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "sanityCheck", sanityCheck);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method maybeSanityCheckMethod = compilerClazz.getDeclaredMethod("maybeSanityCheck");
        maybeSanityCheckMethod.setAccessible(true);
        java.lang.Object[] maybeSanityCheckMethodArguments = new java.lang.Object[0];
        try {
            maybeSanityCheckMethod.invoke(compiler, maybeSanityCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.runSanityCheck
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method runSanityCheck()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#runSanityCheck()}
 * @utbot.invokes {@link com.google.javascript.jscomp.PassFactory#create(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sanityCheck.create(this).process(externsRoot, jsRoot);
 *  */
    @Test
    public void testRunSanityCheck_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.runSanityCheck] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runSanityCheck(Compiler.java:781) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method runSanityCheckMethod = compilerClazz.getDeclaredMethod("runSanityCheck");
        runSanityCheckMethod.setAccessible(true);
        java.lang.Object[] runSanityCheckMethodArguments = new java.lang.Object[0];
        try {
            runSanityCheckMethod.invoke(compiler, runSanityCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method runSanityCheck()
    
    @Test(expected = RuntimeException.class)
    public void testRunSanityCheck1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$44"));
        setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "isCreated", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "sanityCheck", sanityCheck);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method runSanityCheckMethod = compilerClazz.getDeclaredMethod("runSanityCheck");
        runSanityCheckMethod.setAccessible(true);
        java.lang.Object[] runSanityCheckMethodArguments = new java.lang.Object[0];
        try {
            runSanityCheckMethod.invoke(compiler, runSanityCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testRunSanityCheck2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$44"));
        setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "isCreated", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "sanityCheck", sanityCheck);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method runSanityCheckMethod = compilerClazz.getDeclaredMethod("runSanityCheck");
        runSanityCheckMethod.setAccessible(true);
        java.lang.Object[] runSanityCheckMethodArguments = new java.lang.Object[0];
        try {
            runSanityCheckMethod.invoke(compiler, runSanityCheckMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compileModules
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compileModules(java.util.List, java.util.List, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compileModules(java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (Preconditions.checkState(jsRoot == null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(jsRoot == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompileModules_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ScriptOrFnNode jsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        compiler.compileModules(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compileModules(java.util.List, java.util.List, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompileModules1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.compileModules(Compiler.java:541) */
        compiler.compileModules(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compileInternal
    
    ///region OTHER: ERROR SUITE for method compileInternal()
    
    @Test
    public void testCompileInternal1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "next", externsRoot);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal3() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "next", externsRoot);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal4() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal5() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        compiler.jsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal6() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "next", jsRoot);
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal7() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        compiler.jsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal8() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal9() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal10() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        compiler.jsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal11() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal12() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal13() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", first);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal14() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileInternal15() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:668)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:626) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method compileInternalMethod = compilerClazz.getDeclaredMethod("compileInternal");
        compileInternalMethod.setAccessible(true);
        java.lang.Object[] compileInternalMethodArguments = new java.lang.Object[0];
        try {
            compileInternalMethod.invoke(compiler, compileInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.fillEmptyModules
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fillEmptyModules(java.util.List)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#fillEmptyModules(java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSModule module: modules)
 *  */
    @Test
    public void testFillEmptyModules_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.Compiler.fillEmptyModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.fillEmptyModules(Compiler.java:399) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class listType = Class.forName("java.util.List");
        Method fillEmptyModulesMethod = compilerClazz.getDeclaredMethod("fillEmptyModules", listType);
        fillEmptyModulesMethod.setAccessible(true);
        java.lang.Object[] fillEmptyModulesMethodArguments = new java.lang.Object[1];
        fillEmptyModulesMethodArguments[0] = ((Object) null);
        try {
            fillEmptyModulesMethod.invoke(null, fillEmptyModulesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method fillEmptyModules(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.Compiler}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#fillEmptyModules(java.util.List)}
     */
    @Test
    public void testFillEmptyModules() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        List list = emptyList();
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class listType = Class.forName("java.util.List");
        Method fillEmptyModulesMethod = compilerClazz.getDeclaredMethod("fillEmptyModules", listType);
        fillEmptyModulesMethod.setAccessible(true);
        java.lang.Object[] fillEmptyModulesMethodArguments = new java.lang.Object[1];
        fillEmptyModulesMethodArguments[0] = list;
        fillEmptyModulesMethod.invoke(null, fillEmptyModulesMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.stripCode
    
    ///region OTHER: ERROR SUITE for method stripCode(java.util.Set, java.util.Set, java.util.Set, java.util.Set)
    
    @Test
    public void testStripCode1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet1 = new LinkedHashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.stripCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837)
            com.google.javascript.jscomp.Compiler.stripCode(Compiler.java:802) */
        compiler.stripCode(linkedHashSet, null, linkedHashSet1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.setPassConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPassConfig(com.google.javascript.jscomp.PassConfig)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setPassConfig(com.google.javascript.jscomp.PassConfig)}
 * @utbot.executesCondition {@code (this.passes != null): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 *  */
    @Test
    public void testSetPassConfig_ThisPassesEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        DefaultPassConfig defaultPassConfig = new DefaultPassConfig(null);
        
        PassConfig initialCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        compiler.setPassConfig(defaultPassConfig);
        
        PassConfig finalCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        assertFalse(initialCompilerPasses == finalCompilerPasses);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPassConfig(com.google.javascript.jscomp.PassConfig)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setPassConfig(com.google.javascript.jscomp.PassConfig)}
 * @utbot.executesCondition {@code (this.passes != null): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.passes != null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetPassConfig_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        DefaultPassConfig passes = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        DefaultPassConfig defaultPassConfig = new DefaultPassConfig(null);
        
        compiler.setPassConfig(defaultPassConfig);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.runCallable
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method runCallable(java.util.concurrent.Callable, boolean, boolean)
    
    @Test(expected = RuntimeException.class)
    public void testRunCallable1() throws Throwable  {
        Object privilegedCallableUsingCurrentClassLoader = createInstance("java.util.concurrent.Executors$PrivilegedCallableUsingCurrentClassLoader");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class privilegedCallableUsingCurrentClassLoaderType = Class.forName("java.util.concurrent.Callable");
        Class booleanType = boolean.class;
        Method runCallableMethod = compilerClazz.getDeclaredMethod("runCallable", privilegedCallableUsingCurrentClassLoaderType, booleanType, booleanType);
        runCallableMethod.setAccessible(true);
        java.lang.Object[] runCallableMethodArguments = new java.lang.Object[3];
        runCallableMethodArguments[0] = privilegedCallableUsingCurrentClassLoader;
        runCallableMethodArguments[1] = false;
        runCallableMethodArguments[2] = false;
        try {
            runCallableMethod.invoke(null, runCallableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testRunCallable2() {
        Compiler.runCallable(null, true, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.disableThreads
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method disableThreads()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#disableThreads()}
 *  */
    @Test
    public void testDisableThreads() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.disableThreads();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.runCustomPasses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)}
 * @utbot.executesCondition {@code (options.customPasses != null): False}
 *  */
    @Test
    public void testRunCustomPasses_OptionsCustomPassesEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class customPassExecutionTimeType = Class.forName("com.google.javascript.jscomp.CustomPassExecutionTime");
        Method runCustomPassesMethod = compilerClazz.getDeclaredMethod("runCustomPasses", customPassExecutionTimeType);
        runCustomPassesMethod.setAccessible(true);
        java.lang.Object[] runCustomPassesMethodArguments = new java.lang.Object[1];
        runCustomPassesMethodArguments[0] = ((Object) null);
        runCustomPassesMethod.invoke(compiler, runCustomPassesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.customPasses != null
 *  */
    @Test
    public void testRunCustomPasses_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.runCustomPasses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runCustomPasses(Compiler.java:816) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class customPassExecutionTimeType = Class.forName("com.google.javascript.jscomp.CustomPassExecutionTime");
        Method runCustomPassesMethod = compilerClazz.getDeclaredMethod("runCustomPasses", customPassExecutionTimeType);
        runCustomPassesMethod.setAccessible(true);
        java.lang.Object[] runCustomPassesMethodArguments = new java.lang.Object[1];
        runCustomPassesMethodArguments[0] = ((Object) null);
        try {
            runCustomPassesMethod.invoke(compiler, runCustomPassesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.endPass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method endPass()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#endPass()}
 * @utbot.executesCondition {@code (Preconditions.checkState(currentTracer != null, "Tracer should not be null at the end of a pass.");): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(currentTracer != null, "Tracer should not be null at the end of a pass.");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEndPass_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.endPass();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#endPass()}
 * @utbot.executesCondition {@code (Preconditions.checkState(currentTracer != null, "Tracer should not be null at the end of a pass.");): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#stopTracer(com.google.javascript.jscomp.Tracer,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: stopTracer(currentTracer, currentPassName);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEndPass_ThrowIllegalStateException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Tracer currentTracer = ((Tracer) createInstance("com.google.javascript.jscomp.Tracer"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "currentTracer", currentTracer);
        
        compiler.endPass();
    }
    ///endregion
    
    ///region Errors report for endPass
    
    public void testEndPass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.stopTracer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stopTracer(com.google.javascript.jscomp.Tracer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#stopTracer(com.google.javascript.jscomp.Tracer,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Tracer#stop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long result = t.stop();
 *  */
    @Test
    public void testStopTracer_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.stopTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.stopTracer(Compiler.java:867) */
        compiler.stopTracer(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method stopTracer(com.google.javascript.jscomp.Tracer, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#stopTracer(com.google.javascript.jscomp.Tracer,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Tracer#stop()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: long result = t.stop();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testStopTracer_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Tracer tracer = ((Tracer) createInstance("com.google.javascript.jscomp.Tracer"));
        
        compiler.stopTracer(tracer, null);
    }
    ///endregion
    
    ///region Errors report for stopTracer
    
    public void testStopTracer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.newTracer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newTracer(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#newTracer(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeChangeHandler.RecentChange#hasCodeChanged()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: recentChange.hasCodeChanged()
 *  */
    @Test
    public void testNewTracer_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859) */
        compiler.newTracer(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#newTracer(java.lang.String)}
 * @utbot.executesCondition {@code (recentChange.hasCodeChanged()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.tracer.isOn()
 *  */
    @Test
    public void testNewTracer_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:860) */
        compiler.newTracer(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#newTracer(java.lang.String)}
 * @utbot.executesCondition {@code (recentChange.hasCodeChanged()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.tracer.isOn()
 *  */
    @Test
    public void testNewTracer_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:860) */
        compiler.newTracer(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newTracer(java.lang.String)
    
    @Test
    public void testNewTracer1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:860) */
        compiler.newTracer(string);
    }
    
    @Test
    public void testNewTracer2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        String string = "\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:860) */
        compiler.newTracer(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.nextUniqueNameId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextUniqueNameId()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#nextUniqueNameId()}
 * @utbot.returnsFrom {@code return uniqueNameId++;}
 *  */
    @Test
    public void testNextUniqueNameId_ReturnPostfixIncrementUniqueNameId() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId", -255);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method nextUniqueNameIdMethod = compilerClazz.getDeclaredMethod("nextUniqueNameId");
        nextUniqueNameIdMethod.setAccessible(true);
        java.lang.Object[] nextUniqueNameIdMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) nextUniqueNameIdMethod.invoke(compiler, nextUniqueNameIdMethodArguments));
        
        assertEquals(-255, actual);
        
        int finalCompilerUniqueNameId = ((Integer) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        
        assertEquals(-254, finalCompilerUniqueNameId);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getWarnings
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWarnings()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getWarnings()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#getWarnings()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return errorManager.getWarnings();
 *  */
    @Test
    public void testGetWarnings_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getWarnings] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getWarnings(Compiler.java:902) */
        compiler.getWarnings();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getWarnings()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#getWarnings()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return errorManager.getWarnings();
 *  */
    @Test
    public void testGetWarnings_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getWarnings] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.BasicErrorManager.toArray(BasicErrorManager.java:97)
            com.google.javascript.jscomp.BasicErrorManager.getWarnings(BasicErrorManager.java:85)
            com.google.javascript.jscomp.Compiler.getWarnings(Compiler.java:902) */
        compiler.getWarnings();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getWarnings()
    
    @Test
    public void testGetWarnings1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        ConcurrentSkipListSet messages = ((ConcurrentSkipListSet) createInstance("java.util.concurrent.ConcurrentSkipListSet"));
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        setField(messages, "java.util.concurrent.ConcurrentSkipListSet", "m", m);
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "messages", messages);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        com.google.javascript.jscomp.JSError[] actual = compiler.getWarnings();
        
        com.google.javascript.jscomp.JSError[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.newExternInput
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newExternInput(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#newExternInput(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inputsByName.containsKey(name)
 *  */
    @Test
    public void testNewExternInput_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newExternInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newExternInput(Compiler.java:977) */
        compiler.newExternInput(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newExternInput(java.lang.String)
    
    @Test
    public void testNewExternInput1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newExternInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newExternInput(Compiler.java:983) */
        compiler.newExternInput(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.removeInput
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeInput(java.lang.String)
    
    @Test
    public void testRemoveInput1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        String string = "";
        
        compiler.removeInput(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.startPass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method startPass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#startPass(java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(currentTracer == null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(currentTracer == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testStartPass_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Tracer currentTracer = ((Tracer) createInstance("com.google.javascript.jscomp.Tracer"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "currentTracer", currentTracer);
        
        compiler.startPass(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method startPass(java.lang.String)
    
    @Test
    public void testStartPass1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        Tracer initialCompilerCurrentTracer = ((Tracer) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        
        compiler.startPass(null);
        
        Tracer finalCompilerCurrentTracer = ((Tracer) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        
        assertFalse(initialCompilerCurrentTracer == finalCompilerCurrentTracer);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method startPass(java.lang.String)
    
    @Test
    public void testStartPass2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.startPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:860)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837) */
        compiler.startPass(string);
    }
    
    @Test
    public void testStartPass3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.startPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:860)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837) */
        compiler.startPass(string);
    }
    
    @Test
    public void testStartPass4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        PerformanceTracker tracker = ((PerformanceTracker) createInstance("com.google.javascript.jscomp.PerformanceTracker"));
        LinkedList currentRunningPass = new LinkedList();
        setField(tracker, "com.google.javascript.jscomp.PerformanceTracker", "currentRunningPass", currentRunningPass);
        compiler.tracker = tracker;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.startPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker.recordPassStart(PerformanceTracker.java:67)
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:861)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837) */
        compiler.startPass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getErrors
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getErrors()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getErrors()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#getErrors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return errorManager.getErrors();
 *  */
    @Test
    public void testGetErrors_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrors] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getErrors(Compiler.java:895) */
        compiler.getErrors();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getErrors()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#getErrors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return errorManager.getErrors();
 *  */
    @Test
    public void testGetErrors_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrors] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.BasicErrorManager.toArray(BasicErrorManager.java:97)
            com.google.javascript.jscomp.BasicErrorManager.getErrors(BasicErrorManager.java:81)
            com.google.javascript.jscomp.Compiler.getErrors(Compiler.java:895) */
        compiler.getErrors();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getErrors()
    
    @Test
    public void testGetErrors1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        ConcurrentSkipListSet messages = ((ConcurrentSkipListSet) createInstance("java.util.concurrent.ConcurrentSkipListSet"));
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        setField(messages, "java.util.concurrent.ConcurrentSkipListSet", "m", m);
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "messages", messages);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        com.google.javascript.jscomp.JSError[] actual = compiler.getErrors();
        
        com.google.javascript.jscomp.JSError[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.resetUniqueNameId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetUniqueNameId()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#resetUniqueNameId()}
 *  */
    @Test
    public void testResetUniqueNameId() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId", -255);
        
        compiler.resetUniqueNameId();
        
        int finalCompilerUniqueNameId = ((Integer) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        
        assertEquals(0, finalCompilerUniqueNameId);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.parseSyntheticCode
    
    ///region OTHER: ERROR SUITE for method parseSyntheticCode(java.lang.String)
    
    @Test
    public void testParseSyntheticCode1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseSyntheticCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1241) */
        compiler.parseSyntheticCode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.parseSyntheticCode
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseSyntheticCode(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#parseSyntheticCode(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(JSSourceFile.fromCode(fileName, js));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseSyntheticCode_ThrowIllegalArgumentException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        compiler.parseSyntheticCode(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#parseSyntheticCode(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(JSSourceFile.fromCode(fileName, js));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseSyntheticCode_ThrowIllegalArgumentException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        String string = "";
        
        compiler.parseSyntheticCode(string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseSyntheticCode(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseSyntheticCode2() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            
            compiler.parseSyntheticCode(null, null);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseSyntheticCode(java.lang.String, java.lang.String)
    
    @Test
    public void testParseSyntheticCode3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        String string = "\u0000";
        String string1 = "";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseSyntheticCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1810)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1233)
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1256) */
        compiler.parseSyntheticCode(string, string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getTypeRegistry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeRegistry()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getTypeRegistry()}
 * @utbot.executesCondition {@code (typeRegistry == null): False}
 * @utbot.returnsFrom {@code return typeRegistry;}
 *  */
    @Test
    public void testGetTypeRegistry_TypeRegistryNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        
        JSTypeRegistry actual = compiler.getTypeRegistry();
        
        ErrorReporter actualReporter = ((ErrorReporter) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualReporter);
        
        com.google.javascript.rhino.jstype.JSType[] actualNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        assertNull(actualNativeTypes);
        
        Map actualNamesToTypes = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualNamesToTypes);
        
        Set actualNamespaces = ((Set) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualNamespaces);
        
        Set actualNonNullableTypeNames = ((Set) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualNonNullableTypeNames);
        
        Set actualForwardDeclaredTypes = ((Set) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualForwardDeclaredTypes);
        
        Map actualTypesIndexedByProperty = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypesIndexedByProperty);
        
        Map actualEachRefTypeIndexedByProperty = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualEachRefTypeIndexedByProperty);
        
        Map actualGreatestSubtypeByProperty = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualGreatestSubtypeByProperty);
        
        Multimap actualInterfaceToImplementors = ((Multimap) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualInterfaceToImplementors);
        
        Multimap actualUnresolvedNamedTypes = ((Multimap) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualUnresolvedNamedTypes);
        
        Multimap actualResolvedNamedTypes = ((Multimap) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualResolvedNamedTypes);
        
        boolean actualLastGeneration = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualLastGeneration);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        TemplateType actualTemplateType = ((TemplateType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTemplateType);
        
        boolean actualTolerateUndefinedValues = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode actualResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertNull(actualResolveMode);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypeRegistry()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getTypeRegistry()}
 * @utbot.executesCondition {@code (typeRegistry == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry = new JSTypeRegistry(oldErrorReporter, options.looseTypes);
 *  */
    @Test
    public void testGetTypeRegistry_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getTypeRegistry] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getTypeRegistry(Compiler.java:1042) */
        compiler.getTypeRegistry();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.toSource
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSource(com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<String>() {
 * 
 *     public String call() throws Exception {
 *         List<CompilerInput> inputs = module.getInputs();
 *         int numInputs = inputs.size();
 *         if (numInputs == 0) {
 *             return "";
 *         }
 *         CodeBuilder cb = new CodeBuilder();
 *         for (int i = 0; i < numInputs; i++) {
 *             Node scriptNode = inputs.get(i).getAstRoot(Compiler.this);
 *             if (scriptNode == null) {
 *                 throw new IllegalArgumentException("Bad module: " + module.getName());
 *             }
 *             toSource(cb, i, scriptNode);
 *         }
 *         return cb.toString();
 *     }
 * });
 *  */
    @Test
    public void testToSource_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1334) */
        compiler.toSource(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<String>() {
 * 
 *     public String call() throws Exception {
 *         List<CompilerInput> inputs = module.getInputs();
 *         int numInputs = inputs.size();
 *         if (numInputs == 0) {
 *             return "";
 *         }
 *         CodeBuilder cb = new CodeBuilder();
 *         for (int i = 0; i < numInputs; i++) {
 *             Node scriptNode = inputs.get(i).getAstRoot(Compiler.this);
 *             if (scriptNode == null) {
 *                 throw new IllegalArgumentException("Bad module: " + module.getName());
 *             }
 *             toSource(cb, i, scriptNode);
 *         }
 *         return cb.toString();
 *     }
 * });
 *  */
    @Test
    public void testToSource_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1334) */
        compiler.toSource(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.jscomp.JSModule)
    
    @Test(expected = RuntimeException.class)
    public void testToSource1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSource(null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSource(null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSource(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.toSource
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#initCompilerOptionsIfTesting()}
 * @utbot.invokes com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.rhino.Node,com.google.javascript.jscomp.SourceMap)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return toSource(n, null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testToSource_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        compiler.toSource(((Node) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testToSource4() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            
            compiler.toSource(((Node) null));
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        SourceMap.DetailLevel sourceMapDetailLevel = SourceMap.DetailLevel.ALL;
        options.sourceMapDetailLevel = sourceMapDetailLevel;
        compiler.options = options;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        compiler.toSource(functionNode);
    }
    ///endregion
    
    ///region Errors report for toSource
    
    public void testToSource_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.toSource
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSource(com.google.javascript.jscomp.Compiler$CodeBuilder, int, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.jscomp.Compiler.CodeBuilder,int,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: runInCompilerThread(new Callable<Void>() {
 * 
 *     public Void call() throws Exception {
 *         if (options.printInputDelimiter) {
 *             if ((cb.getLength() > 0) && !cb.endsWith("\n")) {
 *                 cb.append("\n");
 *             }
 *             Preconditions.checkState(root.getType() == Token.SCRIPT);
 *             String delimiter = options.inputDelimiter;
 *             String sourceName = (String) root.getProp(Node.SOURCENAME_PROP);
 *             Preconditions.checkState(sourceName != null);
 *             Preconditions.checkState(!sourceName.isEmpty());
 *             delimiter = delimiter.replaceAll("%name%", sourceName).replaceAll("%num%", String.valueOf(inputSeqNum));
 *             cb.append(delimiter).append("\n");
 *         }
 *         if (root.getJSDocInfo() != null && root.getJSDocInfo().getLicense() != null) {
 *             cb.append("/*\n").append(root.getJSDocInfo().getLicense()).append("*/\n");
 *         }
 *         if (options.sourceMapOutputPath != null) {
 *             sourceMap.setStartingPosition(cb.getLineIndex(), cb.getColumnIndex());
 *         }
 *         String code = toSource(root, sourceMap);
 *         if (!code.isEmpty()) {
 *             cb.append(code);
 *             int length = code.length();
 *             char lastChar = code.charAt(length - 1);
 *             char secondLastChar = length >= 2 ? code.charAt(length - 2) : '\0';
 *             boolean hasSemiColon = lastChar == ';' || (lastChar == '\n' && secondLastChar == ';');
 *             if (!hasSemiColon) {
 *                 cb.append(";");
 *             }
 *         }
 *         return null;
 *     }
 * });
 *  */
    @Test
    public void testToSource_ThrowNullPointerException_11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1396) */
        compiler.toSource(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.jscomp.Compiler.CodeBuilder,int,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: runInCompilerThread(new Callable<Void>() {
 * 
 *     public Void call() throws Exception {
 *         if (options.printInputDelimiter) {
 *             if ((cb.getLength() > 0) && !cb.endsWith("\n")) {
 *                 cb.append("\n");
 *             }
 *             Preconditions.checkState(root.getType() == Token.SCRIPT);
 *             String delimiter = options.inputDelimiter;
 *             String sourceName = (String) root.getProp(Node.SOURCENAME_PROP);
 *             Preconditions.checkState(sourceName != null);
 *             Preconditions.checkState(!sourceName.isEmpty());
 *             delimiter = delimiter.replaceAll("%name%", sourceName).replaceAll("%num%", String.valueOf(inputSeqNum));
 *             cb.append(delimiter).append("\n");
 *         }
 *         if (root.getJSDocInfo() != null && root.getJSDocInfo().getLicense() != null) {
 *             cb.append("/*\n").append(root.getJSDocInfo().getLicense()).append("*/\n");
 *         }
 *         if (options.sourceMapOutputPath != null) {
 *             sourceMap.setStartingPosition(cb.getLineIndex(), cb.getColumnIndex());
 *         }
 *         String code = toSource(root, sourceMap);
 *         if (!code.isEmpty()) {
 *             cb.append(code);
 *             int length = code.length();
 *             char lastChar = code.charAt(length - 1);
 *             char secondLastChar = length >= 2 ? code.charAt(length - 2) : '\0';
 *             boolean hasSemiColon = lastChar == ';' || (lastChar == '\n' && secondLastChar == ';');
 *             if (!hasSemiColon) {
 *                 cb.append(";");
 *             }
 *         }
 *         return null;
 *     }
 * });
 *  */
    @Test
    public void testToSource_ThrowNullPointerException1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1396) */
        compiler.toSource(null, -255, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.jscomp.Compiler$CodeBuilder, int, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testToSource6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSource(null, 0, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSource(null, 0, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.printInputDelimiter = true;
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        Compiler.CodeBuilder codeBuilder = ((Compiler.CodeBuilder) createInstance("com.google.javascript.jscomp.Compiler$CodeBuilder"));
        StringBuilder sb = new StringBuilder("\u0000");
        setField(codeBuilder, "com.google.javascript.jscomp.Compiler$CodeBuilder", "sb", sb);
        
        compiler.toSource(codeBuilder, 0, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        compiler.toSource(null, 0, scriptOrFnNode);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        compiler.toSource(null, 0, scriptOrFnNode);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method toSource(com.google.javascript.jscomp.Compiler$CodeBuilder, int, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testToSource11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        Compiler.CodeBuilder codeBuilder = ((Compiler.CodeBuilder) createInstance("com.google.javascript.jscomp.Compiler$CodeBuilder"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        compiler.toSource(codeBuilder, 0, scriptOrFnNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.toSource
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.SourceMap)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.rhino.Node,com.google.javascript.jscomp.SourceMap)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.setPrettyPrint(options.prettyPrint);
 *  */
    @Test
    public void testToSource_ThrowNullPointerException2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1469) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Method toSourceMethod = compilerClazz.getDeclaredMethod("toSource", nodeType, sourceMapType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[2];
        toSourceMethodArguments[0] = ((Object) null);
        toSourceMethodArguments[1] = ((Object) null);
        try {
            toSourceMethod.invoke(compiler, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.SourceMap)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.rhino.Node,com.google.javascript.jscomp.SourceMap)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: builder.setSourceMapDetailLevel(options.sourceMapDetailLevel);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testToSource_ThrowIllegalStateException1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Method toSourceMethod = compilerClazz.getDeclaredMethod("toSource", nodeType, sourceMapType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[2];
        toSourceMethodArguments[0] = ((Object) null);
        toSourceMethodArguments[1] = ((Object) null);
        try {
            toSourceMethod.invoke(compiler, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.rhino.Node,com.google.javascript.jscomp.SourceMap)}
 * @utbot.executesCondition {@code (options.getLanguageOut() == LanguageMode.ECMASCRIPT5_STRICT): True}
 * @utbot.executesCondition {@code (options.outputCharset != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getLanguageOut()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#setTagAsStrict(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#setLineLengthThreshold(int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#setOutputCharset(java.nio.charset.Charset)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#build()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return builder.build();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testToSource_ThrowIllegalStateException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageOut = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        setField(options, "com.google.javascript.jscomp.CompilerOptions", "languageOut", languageOut);
        options.lineLengthThreshold = -255;
        SourceMap.DetailLevel sourceMapDetailLevel = SourceMap.DetailLevel.ALL;
        options.sourceMapDetailLevel = sourceMapDetailLevel;
        compiler.options = options;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Method toSourceMethod = compilerClazz.getDeclaredMethod("toSource", nodeType, sourceMapType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[2];
        toSourceMethodArguments[0] = ((Object) null);
        toSourceMethodArguments[1] = ((Object) null);
        try {
            toSourceMethod.invoke(compiler, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.SourceMap)
    
    @Test(expected = Error.class)
    public void testToSource12() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.prettyPrint = true;
        SourceMap.DetailLevel sourceMapDetailLevel = SourceMap.DetailLevel.ALL;
        options.sourceMapDetailLevel = sourceMapDetailLevel;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Method toSourceMethod = compilerClazz.getDeclaredMethod("toSource", scriptOrFnNodeType, sourceMapType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[2];
        toSourceMethodArguments[0] = scriptOrFnNode;
        toSourceMethodArguments[1] = ((Object) null);
        try {
            toSourceMethod.invoke(compiler, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource13() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        SourceMap.DetailLevel sourceMapDetailLevel = SourceMap.DetailLevel.ALL;
        options.sourceMapDetailLevel = sourceMapDetailLevel;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Method toSourceMethod = compilerClazz.getDeclaredMethod("toSource", scriptOrFnNodeType, sourceMapType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[2];
        toSourceMethodArguments[0] = scriptOrFnNode;
        toSourceMethodArguments[1] = ((Object) null);
        try {
            toSourceMethod.invoke(compiler, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource14() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageOut = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        setField(options, "com.google.javascript.jscomp.CompilerOptions", "languageOut", languageOut);
        SourceMap.DetailLevel sourceMapDetailLevel = SourceMap.DetailLevel.ALL;
        options.sourceMapDetailLevel = sourceMapDetailLevel;
        compiler.options = options;
        Node node = new Node(0);
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class sourceMapGeneratorType = Class.forName("com.google.debugging.sourcemap.SourceMapGenerator");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.SourceMap$1");
        Constructor sourceMapConstructor = sourceMapClazz.getDeclaredConstructor(sourceMapGeneratorType, anonymousObjectType);
        sourceMapConstructor.setAccessible(true);
        java.lang.Object[] sourceMapConstructorArguments = new java.lang.Object[2];
        sourceMapConstructorArguments[0] = ((Object) null);
        sourceMapConstructorArguments[1] = ((Object) null);
        SourceMap sourceMap = ((SourceMap) sourceMapConstructor.newInstance(sourceMapConstructorArguments));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method toSourceMethod = compilerClazz.getDeclaredMethod("toSource", nodeType, sourceMapClazz);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[2];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = sourceMap;
        try {
            toSourceMethod.invoke(compiler, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource15() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageOut = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        setField(options, "com.google.javascript.jscomp.CompilerOptions", "languageOut", languageOut);
        options.prettyPrint = true;
        SourceMap.DetailLevel sourceMapDetailLevel = SourceMap.DetailLevel.ALL;
        options.sourceMapDetailLevel = sourceMapDetailLevel;
        compiler.options = options;
        Node node = new Node(0);
        Class sourceMapClazz = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class sourceMapGeneratorType = Class.forName("com.google.debugging.sourcemap.SourceMapGenerator");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.SourceMap$1");
        Constructor sourceMapConstructor = sourceMapClazz.getDeclaredConstructor(sourceMapGeneratorType, anonymousObjectType);
        sourceMapConstructor.setAccessible(true);
        java.lang.Object[] sourceMapConstructorArguments = new java.lang.Object[2];
        sourceMapConstructorArguments[0] = ((Object) null);
        sourceMapConstructorArguments[1] = ((Object) null);
        SourceMap sourceMap = ((SourceMap) sourceMapConstructor.newInstance(sourceMapConstructorArguments));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method toSourceMethod = compilerClazz.getDeclaredMethod("toSource", nodeType, sourceMapClazz);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[2];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = sourceMap;
        try {
            toSourceMethod.invoke(compiler, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for toSource
    
    public void testToSource_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.toSource
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSource()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<String>() {
 * 
 *     public String call() throws Exception {
 *         Tracer tracer = newTracer("toSource");
 *         try {
 *             CodeBuilder cb = new CodeBuilder();
 *             if (jsRoot != null) {
 *                 int i = 0;
 *                 for (Node scriptNode = jsRoot.getFirstChild(); scriptNode != null; scriptNode = scriptNode.getNext()) {
 *                     toSource(cb, i++, scriptNode);
 *                 }
 *             }
 *             return cb.toString();
 *         } finally {
 *             stopTracer(tracer, "toSource");
 *         }
 *     }
 * });
 *  */
    @Test
    public void testToSource_ThrowNullPointerException3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1284) */
        compiler.toSource();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<String>() {
 * 
 *     public String call() throws Exception {
 *         Tracer tracer = newTracer("toSource");
 *         try {
 *             CodeBuilder cb = new CodeBuilder();
 *             if (jsRoot != null) {
 *                 int i = 0;
 *                 for (Node scriptNode = jsRoot.getFirstChild(); scriptNode != null; scriptNode = scriptNode.getNext()) {
 *                     toSource(cb, i++, scriptNode);
 *                 }
 *             }
 *             return cb.toString();
 *         } finally {
 *             stopTracer(tracer, "toSource");
 *         }
 *     }
 * });
 *  */
    @Test
    public void testToSource_ThrowNullPointerException_12() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1284) */
        compiler.toSource();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource()
    
    @Test(expected = RuntimeException.class)
    public void testToSource16() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSource();
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource17() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSource();
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource18() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSource();
    }
    ///endregion
    
    ///region Errors report for toSource
    
    public void testToSource_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.toSourceArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSourceArray(com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSourceArray(com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<String[]>() {
 * 
 *     public String[] call() throws Exception {
 *         List<CompilerInput> inputs = module.getInputs();
 *         int numInputs = inputs.size();
 *         if (numInputs == 0) {
 *             return new String[0];
 *         }
 *         String[] sources = new String[numInputs];
 *         CodeBuilder cb = new CodeBuilder();
 *         for (int i = 0; i < numInputs; i++) {
 *             Node scriptNode = inputs.get(i).getAstRoot(Compiler.this);
 *             if (scriptNode == null) {
 *                 throw new IllegalArgumentException("Bad module input: " + inputs.get(i).getName());
 *             }
 *             cb.reset();
 *             toSource(cb, i, scriptNode);
 *             sources[i] = cb.toString();
 *         }
 *         return sources;
 *     }
 * });
 *  */
    @Test
    public void testToSourceArray_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSourceArray] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSourceArray(Compiler.java:1360) */
        compiler.toSourceArray(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSourceArray(com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<String[]>() {
 * 
 *     public String[] call() throws Exception {
 *         List<CompilerInput> inputs = module.getInputs();
 *         int numInputs = inputs.size();
 *         if (numInputs == 0) {
 *             return new String[0];
 *         }
 *         String[] sources = new String[numInputs];
 *         CodeBuilder cb = new CodeBuilder();
 *         for (int i = 0; i < numInputs; i++) {
 *             Node scriptNode = inputs.get(i).getAstRoot(Compiler.this);
 *             if (scriptNode == null) {
 *                 throw new IllegalArgumentException("Bad module input: " + inputs.get(i).getName());
 *             }
 *             cb.reset();
 *             toSource(cb, i, scriptNode);
 *             sources[i] = cb.toString();
 *         }
 *         return sources;
 *     }
 * });
 *  */
    @Test
    public void testToSourceArray_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSourceArray] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSourceArray(Compiler.java:1360) */
        compiler.toSourceArray(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSourceArray(com.google.javascript.jscomp.JSModule)
    
    @Test(expected = RuntimeException.class)
    public void testToSourceArray1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSourceArray(null);
    }
    ///endregion
    
    ///region Errors report for toSourceArray
    
    public void testToSourceArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.toSourceArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toSourceArray()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSourceArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<String[]>() {
 * 
 *     public String[] call() throws Exception {
 *         Tracer tracer = newTracer("toSourceArray");
 *         try {
 *             int numInputs = inputs.size();
 *             String[] sources = new String[numInputs];
 *             CodeBuilder cb = new CodeBuilder();
 *             for (int i = 0; i < numInputs; i++) {
 *                 Node scriptNode = inputs.get(i).getAstRoot(Compiler.this);
 *                 cb.reset();
 *                 toSource(cb, i, scriptNode);
 *                 sources[i] = cb.toString();
 *             }
 *             return sources;
 *         } finally {
 *             stopTracer(tracer, "toSourceArray");
 *         }
 *     }
 * });
 *  */
    @Test
    public void testToSourceArray_ThrowNullPointerException1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSourceArray] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSourceArray(Compiler.java:1309) */
        compiler.toSourceArray();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSourceArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runInCompilerThread(new Callable<String[]>() {
 * 
 *     public String[] call() throws Exception {
 *         Tracer tracer = newTracer("toSourceArray");
 *         try {
 *             int numInputs = inputs.size();
 *             String[] sources = new String[numInputs];
 *             CodeBuilder cb = new CodeBuilder();
 *             for (int i = 0; i < numInputs; i++) {
 *                 Node scriptNode = inputs.get(i).getAstRoot(Compiler.this);
 *                 cb.reset();
 *                 toSource(cb, i, scriptNode);
 *                 sources[i] = cb.toString();
 *             }
 *             return sources;
 *         } finally {
 *             stopTracer(tracer, "toSourceArray");
 *         }
 *     }
 * });
 *  */
    @Test
    public void testToSourceArray_ThrowNullPointerException_11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSourceArray] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565)
            com.google.javascript.jscomp.Compiler.toSourceArray(Compiler.java:1309) */
        compiler.toSourceArray();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSourceArray()
    
    @Test(expected = RuntimeException.class)
    public void testToSourceArray2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSourceArray();
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSourceArray3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSourceArray();
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSourceArray4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSourceArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getTypeValidator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeValidator()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getTypeValidator()}
 * @utbot.executesCondition {@code (typeValidator == null): False}
 * @utbot.returnsFrom {@code return typeValidator;}
 *  */
    @Test
    public void testGetTypeValidator_TypeValidatorNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
        
        TypeValidator actual = compiler.getTypeValidator();
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.TypeValidator", "compiler"));
        assertNull(actualCompiler);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        JSType actualAllValueTypes = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.TypeValidator", "allValueTypes"));
        assertNull(actualAllValueTypes);
        
        boolean actualShouldReport = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.TypeValidator", "shouldReport"));
        assertFalse(actualShouldReport);
        
        JSType actualNullOrUndefined = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.TypeValidator", "nullOrUndefined"));
        assertNull(actualNullOrUndefined);
        
        List actualMismatches = ((List) getFieldValue(actual, "com.google.javascript.jscomp.TypeValidator", "mismatches"));
        assertNull(actualMismatches);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.parseInputs
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseInputs()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#parseInputs()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean devMode = options.devMode != DevMode.OFF;
 *  */
    @Test
    public void testParseInputs_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1092) */
        compiler.parseInputs();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseInputs()
    
    @Test
    public void testParseInputs1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        compiler.jsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        compiler.jsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        compiler.externsRoot = externsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs12() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node externsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.externsRoot = externsRoot;
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        compiler.jsRoot = jsRoot;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:1113) */
        compiler.parseInputs();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getModuleGraph
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModuleGraph()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getModuleGraph()}
 * @utbot.returnsFrom {@code return moduleGraph;}
 *  */
    @Test
    public void testGetModuleGraph_ReturnModuleGraph() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        JSModuleGraph actual = compiler.getModuleGraph();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getTopScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTopScope()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getTopScope()}
 * @utbot.returnsFrom {@code return getPassConfig().getTopScope();}
 *  */
    @Test
    public void testGetTopScope_ReturnGetPassConfigGetTopScope() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        DefaultPassConfig passes = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        Scope actual = compiler.getTopScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getTopScope()}
 * @utbot.returnsFrom {@code return getPassConfig().getTopScope();}
 *  */
    @Test
    public void testGetTopScope_ReturnGetPassConfigGetTopScope_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassConfig.PassConfigDelegate passes = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        PassConfig.PassConfigDelegate delegate = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        DefaultPassConfig delegate1 = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(delegate, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate1);
        setField(passes, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        Scope actual = compiler.getTopScope();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTopScope()
    
    @Test
    public void testGetTopScope1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        PassConfig initialCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        Scope actual = compiler.getTopScope();
        
        assertNull(actual);
        
        PassConfig finalCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        assertFalse(initialCompilerPasses == finalCompilerPasses);
    }
    
    @Test
    public void testGetTopScope2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassConfig.PassConfigDelegate passes = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        PassConfig.PassConfigDelegate delegate = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        PassConfig.PassConfigDelegate delegate1 = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        DefaultPassConfig delegate2 = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(delegate1, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate2);
        setField(delegate, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate1);
        setField(passes, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        Scope actual = compiler.getTopScope();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTopScope()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTopScope3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassConfig.PassConfigDelegate passes = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        setField(passes, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", passes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        compiler.getTopScope();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.acceptEcmaScript5
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptEcmaScript5()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acceptEcmaScript5()}
 *  */
    @Test
    public void testAcceptEcmaScript5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        boolean actual = compiler.acceptEcmaScript5();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acceptEcmaScript5()}
 *  */
    @Test
    public void testAcceptEcmaScript5_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        boolean actual = compiler.acceptEcmaScript5();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptEcmaScript5()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acceptEcmaScript5()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getLanguageIn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(options.getLanguageIn())
 *  */
    @Test
    public void testAcceptEcmaScript5_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.acceptEcmaScript5] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.acceptEcmaScript5(Compiler.java:1676) */
        compiler.acceptEcmaScript5();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acceptEcmaScript5()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getLanguageIn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(options.getLanguageIn())
 *  */
    @Test
    public void testAcceptEcmaScript5_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.acceptEcmaScript5] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.acceptEcmaScript5(Compiler.java:1676) */
        compiler.acceptEcmaScript5();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getCssRenamingMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCssRenamingMap()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getCssRenamingMap()}
 * @utbot.returnsFrom {@code return options.cssRenamingMap;}
 *  */
    @Test
    public void testGetCssRenamingMap_ReturnOptionsCssRenamingMap() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CssRenamingMap cssRenamingMap = ((CssRenamingMap) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives$1"));
        options.cssRenamingMap = cssRenamingMap;
        compiler.options = options;
        
        CssRenamingMap actual = compiler.getCssRenamingMap();
        
        Map actualVal$cssNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.ProcessClosurePrimitives$1", "val$cssNames"));
        assertNull(actualVal$cssNames);
        
        CssRenamingMap.Style actualVal$style = ((CssRenamingMap.Style) getFieldValue(actual, "com.google.javascript.jscomp.ProcessClosurePrimitives$1", "val$style"));
        assertNull(actualVal$style);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCssRenamingMap()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getCssRenamingMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.cssRenamingMap;
 *  */
    @Test
    public void testGetCssRenamingMap_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getCssRenamingMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getCssRenamingMap(Compiler.java:1578) */
        compiler.getCssRenamingMap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.addChangeHandler
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: codeChangeHandlers.add(handler);
 *  */
    @Test
    public void testAddChangeHandler_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.addChangeHandler] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addChangeHandler(Compiler.java:1642) */
        compiler.addChangeHandler(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.isIdeMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isIdeMode()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isIdeMode()}
 * @utbot.returnsFrom {@code return options.ideMode;}
 *  */
    @Test
    public void testIsIdeMode_ReturnOptionsIdeMode() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        boolean actual = compiler.isIdeMode();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isIdeMode()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isIdeMode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.ideMode;
 *  */
    @Test
    public void testIsIdeMode_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.isIdeMode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.isIdeMode(Compiler.java:1671) */
        compiler.isIdeMode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getParserConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParserConfig()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getParserConfig()}
 * @utbot.executesCondition {@code (parserConfig == null): False}
 * @utbot.returnsFrom {@code return parserConfig;}
 *  */
    @Test
    public void testGetParserConfig_ParserConfigNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Config parserConfig = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig", parserConfig);
        
        Config actual = compiler.getParserConfig();
        
        boolean actualParseJsDocDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "parseJsDocDocumentation"));
        assertFalse(actualParseJsDocDocumentation);
        
        boolean actualIsIdeMode = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "isIdeMode"));
        assertFalse(actualIsIdeMode);
        
        Map actualAnnotationNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
        assertNull(actualAnnotationNames);
        
        Set actualSuppressionNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
        assertNull(actualSuppressionNames);
        
        com.google.javascript.jscomp.parsing.Config.LanguageMode actualLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
        assertNull(actualLanguageMode);
        
        boolean actualAcceptConstKeyword = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "acceptConstKeyword"));
        assertFalse(actualAcceptConstKeyword);
        
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getParserConfig()}
 * @utbot.executesCondition {@code (parserConfig == null): True}
 *  */
    @Test
    public void testGetParserConfig_ParserConfigEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        Config initialCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
        
        Config actual = compiler.getParserConfig();
        
        Config expected = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        Map annotationNames = new LinkedHashMap();
        String string = "argument";
        Class annotationClazz = Class.forName("com.google.javascript.jscomp.parsing.Annotation");
        Object annotation = getEnumConstantByName(annotationClazz, "PARAM");
        annotationNames.put(string, annotation);
        String string1 = "author";
        Object annotation1 = getEnumConstantByName(annotationClazz, "AUTHOR");
        annotationNames.put(string1, annotation1);
        String string2 = "const";
        Object annotation2 = getEnumConstantByName(annotationClazz, "CONSTANT");
        annotationNames.put(string2, annotation2);
        String string3 = "constant";
        annotationNames.put(string3, annotation2);
        String string4 = "constructor";
        Object annotation3 = getEnumConstantByName(annotationClazz, "CONSTRUCTOR");
        annotationNames.put(string4, annotation3);
        String string5 = "define";
        Object annotation4 = getEnumConstantByName(annotationClazz, "DEFINE");
        annotationNames.put(string5, annotation4);
        String string6 = "deprecated";
        Object annotation5 = getEnumConstantByName(annotationClazz, "DEPRECATED");
        annotationNames.put(string6, annotation5);
        String string7 = "desc";
        Object annotation6 = getEnumConstantByName(annotationClazz, "DESC");
        annotationNames.put(string7, annotation6);
        String string8 = "enum";
        Object annotation7 = getEnumConstantByName(annotationClazz, "ENUM");
        annotationNames.put(string8, annotation7);
        String string9 = "export";
        Object annotation8 = getEnumConstantByName(annotationClazz, "EXPORT");
        annotationNames.put(string9, annotation8);
        String string10 = "extends";
        Object annotation9 = getEnumConstantByName(annotationClazz, "EXTENDS");
        annotationNames.put(string10, annotation9);
        String string11 = "externs";
        Object annotation10 = getEnumConstantByName(annotationClazz, "EXTERNS");
        annotationNames.put(string11, annotation10);
        String string12 = "fileoverview";
        Object annotation11 = getEnumConstantByName(annotationClazz, "FILE_OVERVIEW");
        annotationNames.put(string12, annotation11);
        String string13 = "final";
        annotationNames.put(string13, annotation2);
        String string14 = "hidden";
        Object annotation12 = getEnumConstantByName(annotationClazz, "HIDDEN");
        annotationNames.put(string14, annotation12);
        String string15 = "implements";
        Object annotation13 = getEnumConstantByName(annotationClazz, "IMPLEMENTS");
        annotationNames.put(string15, annotation13);
        String string16 = "implicitCast";
        Object annotation14 = getEnumConstantByName(annotationClazz, "IMPLICIT_CAST");
        annotationNames.put(string16, annotation14);
        String string17 = "inheritDoc";
        Object annotation15 = getEnumConstantByName(annotationClazz, "INHERIT_DOC");
        annotationNames.put(string17, annotation15);
        String string18 = "interface";
        Object annotation16 = getEnumConstantByName(annotationClazz, "INTERFACE");
        annotationNames.put(string18, annotation16);
        String string19 = "javadispatch";
        Object annotation17 = getEnumConstantByName(annotationClazz, "JAVA_DISPATCH");
        annotationNames.put(string19, annotation17);
        String string20 = "lends";
        Object annotation18 = getEnumConstantByName(annotationClazz, "LENDS");
        annotationNames.put(string20, annotation18);
        String string21 = "license";
        Object annotation19 = getEnumConstantByName(annotationClazz, "LICENSE");
        annotationNames.put(string21, annotation19);
        String string22 = "meaning";
        Object annotation20 = getEnumConstantByName(annotationClazz, "MEANING");
        annotationNames.put(string22, annotation20);
        String string23 = "modifies";
        Object annotation21 = getEnumConstantByName(annotationClazz, "MODIFIES");
        annotationNames.put(string23, annotation21);
        String string24 = "noalias";
        Object annotation22 = getEnumConstantByName(annotationClazz, "NO_ALIAS");
        annotationNames.put(string24, annotation22);
        String string25 = "nocompile";
        Object annotation23 = getEnumConstantByName(annotationClazz, "NO_COMPILE");
        annotationNames.put(string25, annotation23);
        String string26 = "noshadow";
        Object annotation24 = getEnumConstantByName(annotationClazz, "NO_SHADOW");
        annotationNames.put(string26, annotation24);
        String string27 = "nosideeffects";
        Object annotation25 = getEnumConstantByName(annotationClazz, "NO_SIDE_EFFECTS");
        annotationNames.put(string27, annotation25);
        String string28 = "notypecheck";
        Object annotation26 = getEnumConstantByName(annotationClazz, "NO_TYPE_CHECK");
        annotationNames.put(string28, annotation26);
        String string29 = "override";
        Object annotation27 = getEnumConstantByName(annotationClazz, "OVERRIDE");
        annotationNames.put(string29, annotation27);
        String string30 = "owner";
        annotationNames.put(string30, annotation1);
        String string31 = "param";
        annotationNames.put(string31, annotation);
        String string32 = "preserve";
        Object annotation28 = getEnumConstantByName(annotationClazz, "PRESERVE");
        annotationNames.put(string32, annotation28);
        String string33 = "preserveTry";
        Object annotation29 = getEnumConstantByName(annotationClazz, "PRESERVE_TRY");
        annotationNames.put(string33, annotation29);
        String string34 = "private";
        Object annotation30 = getEnumConstantByName(annotationClazz, "PRIVATE");
        annotationNames.put(string34, annotation30);
        String string35 = "protected";
        Object annotation31 = getEnumConstantByName(annotationClazz, "PROTECTED");
        annotationNames.put(string35, annotation31);
        String string36 = "public";
        Object annotation32 = getEnumConstantByName(annotationClazz, "PUBLIC");
        annotationNames.put(string36, annotation32);
        String string37 = "return";
        Object annotation33 = getEnumConstantByName(annotationClazz, "RETURN");
        annotationNames.put(string37, annotation33);
        String string38 = "returns";
        annotationNames.put(string38, annotation33);
        String string39 = "see";
        Object annotation34 = getEnumConstantByName(annotationClazz, "SEE");
        annotationNames.put(string39, annotation34);
        String string40 = "suppress";
        Object annotation35 = getEnumConstantByName(annotationClazz, "SUPPRESS");
        annotationNames.put(string40, annotation35);
        String string41 = "template";
        Object annotation36 = getEnumConstantByName(annotationClazz, "TEMPLATE");
        annotationNames.put(string41, annotation36);
        String string42 = "this";
        Object annotation37 = getEnumConstantByName(annotationClazz, "THIS");
        annotationNames.put(string42, annotation37);
        String string43 = "throws";
        Object annotation38 = getEnumConstantByName(annotationClazz, "THROWS");
        annotationNames.put(string43, annotation38);
        String string44 = "type";
        Object annotation39 = getEnumConstantByName(annotationClazz, "TYPE");
        annotationNames.put(string44, annotation39);
        String string45 = "typedef";
        Object annotation40 = getEnumConstantByName(annotationClazz, "TYPEDEF");
        annotationNames.put(string45, annotation40);
        String string46 = "version";
        Object annotation41 = getEnumConstantByName(annotationClazz, "VERSION");
        annotationNames.put(string46, annotation41);
        String string47 = "exception";
        Object annotation42 = getEnumConstantByName(annotationClazz, "NOT_IMPLEMENTED");
        annotationNames.put(string47, annotation42);
        String string48 = "mods";
        annotationNames.put(string48, annotation42);
        String string49 = "addon";
        annotationNames.put(string49, annotation42);
        String string50 = "link";
        annotationNames.put(string50, annotation42);
        String string51 = "description";
        annotationNames.put(string51, annotation42);
        String string52 = "constructs";
        annotationNames.put(string52, annotation42);
        String string53 = "example";
        annotationNames.put(string53, annotation42);
        String string54 = "default";
        annotationNames.put(string54, annotation42);
        String string55 = "borrows";
        annotationNames.put(string55, annotation42);
        String string56 = "function";
        annotationNames.put(string56, annotation42);
        String string57 = "member";
        annotationNames.put(string57, annotation42);
        String string58 = "property";
        annotationNames.put(string58, annotation42);
        String string59 = "ignore";
        annotationNames.put(string59, annotation42);
        String string60 = "id";
        annotationNames.put(string60, annotation42);
        String string61 = "memberOf";
        annotationNames.put(string61, annotation42);
        String string62 = "event";
        annotationNames.put(string62, annotation42);
        String string63 = "class";
        annotationNames.put(string63, annotation42);
        String string64 = "static";
        annotationNames.put(string64, annotation42);
        String string65 = "inner";
        annotationNames.put(string65, annotation42);
        String string66 = "field";
        annotationNames.put(string66, annotation42);
        String string67 = "bug";
        annotationNames.put(string67, annotation42);
        String string68 = "name";
        annotationNames.put(string68, annotation42);
        String string69 = "namespace";
        annotationNames.put(string69, annotation42);
        String string70 = "modName";
        annotationNames.put(string70, annotation42);
        String string71 = "config";
        annotationNames.put(string71, annotation42);
        String string72 = "exec";
        annotationNames.put(string72, annotation42);
        String string73 = "augments";
        annotationNames.put(string73, annotation42);
        String string74 = "base";
        annotationNames.put(string74, annotation42);
        String string75 = "requires";
        annotationNames.put(string75, annotation42);
        String string76 = "since";
        annotationNames.put(string76, annotation42);
        String string77 = "supported";
        annotationNames.put(string77, annotation42);
        setField(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames", annotationNames);
        Set suppressionNames = new LinkedHashSet();
        String string78 = "nonStandardJsDocs";
        suppressionNames.add(string78);
        String string79 = "strictModuleDepCheck";
        suppressionNames.add(string79);
        String string80 = "missingRequire";
        suppressionNames.add(string80);
        String string81 = "const";
        suppressionNames.add(string81);
        String string82 = "fileoverviewTags";
        suppressionNames.add(string82);
        String string83 = "invalidCasts";
        suppressionNames.add(string83);
        String string84 = "uselessCode";
        suppressionNames.add(string84);
        String string85 = "visibility";
        suppressionNames.add(string85);
        String string86 = "deprecated";
        suppressionNames.add(string86);
        String string87 = "unknownDefines";
        suppressionNames.add(string87);
        String string88 = "undefinedVars";
        suppressionNames.add(string88);
        String string89 = "duplicate";
        suppressionNames.add(string89);
        String string90 = "constantProperty";
        suppressionNames.add(string90);
        String string91 = "extraRequire";
        suppressionNames.add(string91);
        String string92 = "globalThis";
        suppressionNames.add(string92);
        String string93 = "with";
        suppressionNames.add(string93);
        String string94 = "checkRegExp";
        suppressionNames.add(string94);
        String string95 = "checkTypes";
        suppressionNames.add(string95);
        String string96 = "underscore";
        suppressionNames.add(string96);
        String string97 = "checkVars";
        suppressionNames.add(string97);
        String string98 = "missingProperties";
        suppressionNames.add(string98);
        String string99 = "accessControls";
        suppressionNames.add(string99);
        String string100 = "extraProvide";
        suppressionNames.add(string100);
        String string101 = "missingProvide";
        suppressionNames.add(string101);
        setField(expected, "com.google.javascript.jscomp.parsing.Config", "suppressionNames", suppressionNames);
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3;
        setField(expected, "com.google.javascript.jscomp.parsing.Config", "languageMode", languageMode);
        
        boolean actualParseJsDocDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "parseJsDocDocumentation"));
        assertFalse(actualParseJsDocDocumentation);
        
        boolean actualIsIdeMode = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "isIdeMode"));
        assertFalse(actualIsIdeMode);
        
        Map expectedAnnotationNames = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
        Map actualAnnotationNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
        assertTrue(deepEquals(expectedAnnotationNames, actualAnnotationNames));
        
        Set expectedSuppressionNames = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
        Set actualSuppressionNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
        assertTrue(deepEquals(expectedSuppressionNames, actualSuppressionNames));
        
        com.google.javascript.jscomp.parsing.Config.LanguageMode expectedLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
        com.google.javascript.jscomp.parsing.Config.LanguageMode actualLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
        assertEquals(expectedLanguageMode, actualLanguageMode);
        
        boolean actualAcceptConstKeyword = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "acceptConstKeyword"));
        assertFalse(actualAcceptConstKeyword);
        
        Config finalCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
        
        assertFalse(initialCompilerParserConfig == finalCompilerParserConfig);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getParserConfig()}
 * @utbot.executesCondition {@code (parserConfig == null): True}
 *  */
    @Test
    public void testGetParserConfig_ParserConfigEqualsNull_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        Config initialCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
        
        Config actual = compiler.getParserConfig();
        
        Config expected = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
        Map annotationNames = new LinkedHashMap();
        String string = "argument";
        Class annotationClazz = Class.forName("com.google.javascript.jscomp.parsing.Annotation");
        Object annotation = getEnumConstantByName(annotationClazz, "PARAM");
        annotationNames.put(string, annotation);
        String string1 = "author";
        Object annotation1 = getEnumConstantByName(annotationClazz, "AUTHOR");
        annotationNames.put(string1, annotation1);
        String string2 = "const";
        Object annotation2 = getEnumConstantByName(annotationClazz, "CONSTANT");
        annotationNames.put(string2, annotation2);
        String string3 = "constant";
        annotationNames.put(string3, annotation2);
        String string4 = "constructor";
        Object annotation3 = getEnumConstantByName(annotationClazz, "CONSTRUCTOR");
        annotationNames.put(string4, annotation3);
        String string5 = "define";
        Object annotation4 = getEnumConstantByName(annotationClazz, "DEFINE");
        annotationNames.put(string5, annotation4);
        String string6 = "deprecated";
        Object annotation5 = getEnumConstantByName(annotationClazz, "DEPRECATED");
        annotationNames.put(string6, annotation5);
        String string7 = "desc";
        Object annotation6 = getEnumConstantByName(annotationClazz, "DESC");
        annotationNames.put(string7, annotation6);
        String string8 = "enum";
        Object annotation7 = getEnumConstantByName(annotationClazz, "ENUM");
        annotationNames.put(string8, annotation7);
        String string9 = "export";
        Object annotation8 = getEnumConstantByName(annotationClazz, "EXPORT");
        annotationNames.put(string9, annotation8);
        String string10 = "extends";
        Object annotation9 = getEnumConstantByName(annotationClazz, "EXTENDS");
        annotationNames.put(string10, annotation9);
        String string11 = "externs";
        Object annotation10 = getEnumConstantByName(annotationClazz, "EXTERNS");
        annotationNames.put(string11, annotation10);
        String string12 = "fileoverview";
        Object annotation11 = getEnumConstantByName(annotationClazz, "FILE_OVERVIEW");
        annotationNames.put(string12, annotation11);
        String string13 = "final";
        annotationNames.put(string13, annotation2);
        String string14 = "hidden";
        Object annotation12 = getEnumConstantByName(annotationClazz, "HIDDEN");
        annotationNames.put(string14, annotation12);
        String string15 = "implements";
        Object annotation13 = getEnumConstantByName(annotationClazz, "IMPLEMENTS");
        annotationNames.put(string15, annotation13);
        String string16 = "implicitCast";
        Object annotation14 = getEnumConstantByName(annotationClazz, "IMPLICIT_CAST");
        annotationNames.put(string16, annotation14);
        String string17 = "inheritDoc";
        Object annotation15 = getEnumConstantByName(annotationClazz, "INHERIT_DOC");
        annotationNames.put(string17, annotation15);
        String string18 = "interface";
        Object annotation16 = getEnumConstantByName(annotationClazz, "INTERFACE");
        annotationNames.put(string18, annotation16);
        String string19 = "javadispatch";
        Object annotation17 = getEnumConstantByName(annotationClazz, "JAVA_DISPATCH");
        annotationNames.put(string19, annotation17);
        String string20 = "lends";
        Object annotation18 = getEnumConstantByName(annotationClazz, "LENDS");
        annotationNames.put(string20, annotation18);
        String string21 = "license";
        Object annotation19 = getEnumConstantByName(annotationClazz, "LICENSE");
        annotationNames.put(string21, annotation19);
        String string22 = "meaning";
        Object annotation20 = getEnumConstantByName(annotationClazz, "MEANING");
        annotationNames.put(string22, annotation20);
        String string23 = "modifies";
        Object annotation21 = getEnumConstantByName(annotationClazz, "MODIFIES");
        annotationNames.put(string23, annotation21);
        String string24 = "noalias";
        Object annotation22 = getEnumConstantByName(annotationClazz, "NO_ALIAS");
        annotationNames.put(string24, annotation22);
        String string25 = "nocompile";
        Object annotation23 = getEnumConstantByName(annotationClazz, "NO_COMPILE");
        annotationNames.put(string25, annotation23);
        String string26 = "noshadow";
        Object annotation24 = getEnumConstantByName(annotationClazz, "NO_SHADOW");
        annotationNames.put(string26, annotation24);
        String string27 = "nosideeffects";
        Object annotation25 = getEnumConstantByName(annotationClazz, "NO_SIDE_EFFECTS");
        annotationNames.put(string27, annotation25);
        String string28 = "notypecheck";
        Object annotation26 = getEnumConstantByName(annotationClazz, "NO_TYPE_CHECK");
        annotationNames.put(string28, annotation26);
        String string29 = "override";
        Object annotation27 = getEnumConstantByName(annotationClazz, "OVERRIDE");
        annotationNames.put(string29, annotation27);
        String string30 = "owner";
        annotationNames.put(string30, annotation1);
        String string31 = "param";
        annotationNames.put(string31, annotation);
        String string32 = "preserve";
        Object annotation28 = getEnumConstantByName(annotationClazz, "PRESERVE");
        annotationNames.put(string32, annotation28);
        String string33 = "preserveTry";
        Object annotation29 = getEnumConstantByName(annotationClazz, "PRESERVE_TRY");
        annotationNames.put(string33, annotation29);
        String string34 = "private";
        Object annotation30 = getEnumConstantByName(annotationClazz, "PRIVATE");
        annotationNames.put(string34, annotation30);
        String string35 = "protected";
        Object annotation31 = getEnumConstantByName(annotationClazz, "PROTECTED");
        annotationNames.put(string35, annotation31);
        String string36 = "public";
        Object annotation32 = getEnumConstantByName(annotationClazz, "PUBLIC");
        annotationNames.put(string36, annotation32);
        String string37 = "return";
        Object annotation33 = getEnumConstantByName(annotationClazz, "RETURN");
        annotationNames.put(string37, annotation33);
        String string38 = "returns";
        annotationNames.put(string38, annotation33);
        String string39 = "see";
        Object annotation34 = getEnumConstantByName(annotationClazz, "SEE");
        annotationNames.put(string39, annotation34);
        String string40 = "suppress";
        Object annotation35 = getEnumConstantByName(annotationClazz, "SUPPRESS");
        annotationNames.put(string40, annotation35);
        String string41 = "template";
        Object annotation36 = getEnumConstantByName(annotationClazz, "TEMPLATE");
        annotationNames.put(string41, annotation36);
        String string42 = "this";
        Object annotation37 = getEnumConstantByName(annotationClazz, "THIS");
        annotationNames.put(string42, annotation37);
        String string43 = "throws";
        Object annotation38 = getEnumConstantByName(annotationClazz, "THROWS");
        annotationNames.put(string43, annotation38);
        String string44 = "type";
        Object annotation39 = getEnumConstantByName(annotationClazz, "TYPE");
        annotationNames.put(string44, annotation39);
        String string45 = "typedef";
        Object annotation40 = getEnumConstantByName(annotationClazz, "TYPEDEF");
        annotationNames.put(string45, annotation40);
        String string46 = "version";
        Object annotation41 = getEnumConstantByName(annotationClazz, "VERSION");
        annotationNames.put(string46, annotation41);
        String string47 = "exception";
        Object annotation42 = getEnumConstantByName(annotationClazz, "NOT_IMPLEMENTED");
        annotationNames.put(string47, annotation42);
        String string48 = "mods";
        annotationNames.put(string48, annotation42);
        String string49 = "addon";
        annotationNames.put(string49, annotation42);
        String string50 = "link";
        annotationNames.put(string50, annotation42);
        String string51 = "description";
        annotationNames.put(string51, annotation42);
        String string52 = "constructs";
        annotationNames.put(string52, annotation42);
        String string53 = "example";
        annotationNames.put(string53, annotation42);
        String string54 = "default";
        annotationNames.put(string54, annotation42);
        String string55 = "borrows";
        annotationNames.put(string55, annotation42);
        String string56 = "function";
        annotationNames.put(string56, annotation42);
        String string57 = "member";
        annotationNames.put(string57, annotation42);
        String string58 = "property";
        annotationNames.put(string58, annotation42);
        String string59 = "ignore";
        annotationNames.put(string59, annotation42);
        String string60 = "id";
        annotationNames.put(string60, annotation42);
        String string61 = "memberOf";
        annotationNames.put(string61, annotation42);
        String string62 = "event";
        annotationNames.put(string62, annotation42);
        String string63 = "class";
        annotationNames.put(string63, annotation42);
        String string64 = "static";
        annotationNames.put(string64, annotation42);
        String string65 = "inner";
        annotationNames.put(string65, annotation42);
        String string66 = "field";
        annotationNames.put(string66, annotation42);
        String string67 = "bug";
        annotationNames.put(string67, annotation42);
        String string68 = "name";
        annotationNames.put(string68, annotation42);
        String string69 = "namespace";
        annotationNames.put(string69, annotation42);
        String string70 = "modName";
        annotationNames.put(string70, annotation42);
        String string71 = "config";
        annotationNames.put(string71, annotation42);
        String string72 = "exec";
        annotationNames.put(string72, annotation42);
        String string73 = "augments";
        annotationNames.put(string73, annotation42);
        String string74 = "base";
        annotationNames.put(string74, annotation42);
        String string75 = "requires";
        annotationNames.put(string75, annotation42);
        String string76 = "since";
        annotationNames.put(string76, annotation42);
        String string77 = "supported";
        annotationNames.put(string77, annotation42);
        setField(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames", annotationNames);
        Set suppressionNames = new LinkedHashSet();
        String string78 = "nonStandardJsDocs";
        suppressionNames.add(string78);
        String string79 = "strictModuleDepCheck";
        suppressionNames.add(string79);
        String string80 = "missingRequire";
        suppressionNames.add(string80);
        String string81 = "const";
        suppressionNames.add(string81);
        String string82 = "fileoverviewTags";
        suppressionNames.add(string82);
        String string83 = "invalidCasts";
        suppressionNames.add(string83);
        String string84 = "uselessCode";
        suppressionNames.add(string84);
        String string85 = "visibility";
        suppressionNames.add(string85);
        String string86 = "deprecated";
        suppressionNames.add(string86);
        String string87 = "unknownDefines";
        suppressionNames.add(string87);
        String string88 = "undefinedVars";
        suppressionNames.add(string88);
        String string89 = "duplicate";
        suppressionNames.add(string89);
        String string90 = "constantProperty";
        suppressionNames.add(string90);
        String string91 = "extraRequire";
        suppressionNames.add(string91);
        String string92 = "globalThis";
        suppressionNames.add(string92);
        String string93 = "with";
        suppressionNames.add(string93);
        String string94 = "checkRegExp";
        suppressionNames.add(string94);
        String string95 = "checkTypes";
        suppressionNames.add(string95);
        String string96 = "underscore";
        suppressionNames.add(string96);
        String string97 = "checkVars";
        suppressionNames.add(string97);
        String string98 = "missingProperties";
        suppressionNames.add(string98);
        String string99 = "accessControls";
        suppressionNames.add(string99);
        String string100 = "extraProvide";
        suppressionNames.add(string100);
        String string101 = "missingProvide";
        suppressionNames.add(string101);
        setField(expected, "com.google.javascript.jscomp.parsing.Config", "suppressionNames", suppressionNames);
        com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT5_STRICT;
        setField(expected, "com.google.javascript.jscomp.parsing.Config", "languageMode", languageMode);
        
        boolean actualParseJsDocDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "parseJsDocDocumentation"));
        assertFalse(actualParseJsDocDocumentation);
        
        boolean actualIsIdeMode = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "isIdeMode"));
        assertFalse(actualIsIdeMode);
        
        Map expectedAnnotationNames = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
        Map actualAnnotationNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
        assertTrue(deepEquals(expectedAnnotationNames, actualAnnotationNames));
        
        Set expectedSuppressionNames = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
        Set actualSuppressionNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
        assertTrue(deepEquals(expectedSuppressionNames, actualSuppressionNames));
        
        com.google.javascript.jscomp.parsing.Config.LanguageMode expectedLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
        com.google.javascript.jscomp.parsing.Config.LanguageMode actualLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
        assertEquals(expectedLanguageMode, actualLanguageMode);
        
        boolean actualAcceptConstKeyword = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "acceptConstKeyword"));
        assertFalse(actualAcceptConstKeyword);
        
        Config finalCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
        
        assertFalse(initialCompilerParserConfig == finalCompilerParserConfig);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getParserConfig()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getParserConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(options.getLanguageIn())
 *  */
    @Test
    public void testGetParserConfig_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getParserConfig] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getParserConfig(Compiler.java:1697) */
        compiler.getParserConfig();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getParserConfig()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getLanguageIn()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions.LanguageMode#ordinal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(options.getLanguageIn())
 *  */
    @Test
    public void testGetParserConfig_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getParserConfig] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getParserConfig(Compiler.java:1697) */
        compiler.getParserConfig();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getParserConfig()
    
    @Test
    public void testGetParserConfig1() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            LinkedHashSet annotationNames = new LinkedHashSet();
            setStaticField(parserRunnerClazz, "annotationNames", annotationNames);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
            options.setLanguageIn(languageIn);
            compiler.options = options;
            
            Config initialCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
            
            Config actual = compiler.getParserConfig();
            
            Config expected = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
            Map annotationNames1 = new LinkedHashMap();
            String string = "argument";
            Class annotationClazz = Class.forName("com.google.javascript.jscomp.parsing.Annotation");
            Object annotation = getEnumConstantByName(annotationClazz, "PARAM");
            annotationNames1.put(string, annotation);
            String string1 = "author";
            Object annotation1 = getEnumConstantByName(annotationClazz, "AUTHOR");
            annotationNames1.put(string1, annotation1);
            String string2 = "const";
            Object annotation2 = getEnumConstantByName(annotationClazz, "CONSTANT");
            annotationNames1.put(string2, annotation2);
            String string3 = "constant";
            annotationNames1.put(string3, annotation2);
            String string4 = "constructor";
            Object annotation3 = getEnumConstantByName(annotationClazz, "CONSTRUCTOR");
            annotationNames1.put(string4, annotation3);
            String string5 = "define";
            Object annotation4 = getEnumConstantByName(annotationClazz, "DEFINE");
            annotationNames1.put(string5, annotation4);
            String string6 = "deprecated";
            Object annotation5 = getEnumConstantByName(annotationClazz, "DEPRECATED");
            annotationNames1.put(string6, annotation5);
            String string7 = "desc";
            Object annotation6 = getEnumConstantByName(annotationClazz, "DESC");
            annotationNames1.put(string7, annotation6);
            String string8 = "enum";
            Object annotation7 = getEnumConstantByName(annotationClazz, "ENUM");
            annotationNames1.put(string8, annotation7);
            String string9 = "export";
            Object annotation8 = getEnumConstantByName(annotationClazz, "EXPORT");
            annotationNames1.put(string9, annotation8);
            String string10 = "extends";
            Object annotation9 = getEnumConstantByName(annotationClazz, "EXTENDS");
            annotationNames1.put(string10, annotation9);
            String string11 = "externs";
            Object annotation10 = getEnumConstantByName(annotationClazz, "EXTERNS");
            annotationNames1.put(string11, annotation10);
            String string12 = "fileoverview";
            Object annotation11 = getEnumConstantByName(annotationClazz, "FILE_OVERVIEW");
            annotationNames1.put(string12, annotation11);
            String string13 = "final";
            annotationNames1.put(string13, annotation2);
            String string14 = "hidden";
            Object annotation12 = getEnumConstantByName(annotationClazz, "HIDDEN");
            annotationNames1.put(string14, annotation12);
            String string15 = "implements";
            Object annotation13 = getEnumConstantByName(annotationClazz, "IMPLEMENTS");
            annotationNames1.put(string15, annotation13);
            String string16 = "implicitCast";
            Object annotation14 = getEnumConstantByName(annotationClazz, "IMPLICIT_CAST");
            annotationNames1.put(string16, annotation14);
            String string17 = "inheritDoc";
            Object annotation15 = getEnumConstantByName(annotationClazz, "INHERIT_DOC");
            annotationNames1.put(string17, annotation15);
            String string18 = "interface";
            Object annotation16 = getEnumConstantByName(annotationClazz, "INTERFACE");
            annotationNames1.put(string18, annotation16);
            String string19 = "javadispatch";
            Object annotation17 = getEnumConstantByName(annotationClazz, "JAVA_DISPATCH");
            annotationNames1.put(string19, annotation17);
            String string20 = "lends";
            Object annotation18 = getEnumConstantByName(annotationClazz, "LENDS");
            annotationNames1.put(string20, annotation18);
            String string21 = "license";
            Object annotation19 = getEnumConstantByName(annotationClazz, "LICENSE");
            annotationNames1.put(string21, annotation19);
            String string22 = "meaning";
            Object annotation20 = getEnumConstantByName(annotationClazz, "MEANING");
            annotationNames1.put(string22, annotation20);
            String string23 = "modifies";
            Object annotation21 = getEnumConstantByName(annotationClazz, "MODIFIES");
            annotationNames1.put(string23, annotation21);
            String string24 = "noalias";
            Object annotation22 = getEnumConstantByName(annotationClazz, "NO_ALIAS");
            annotationNames1.put(string24, annotation22);
            String string25 = "nocompile";
            Object annotation23 = getEnumConstantByName(annotationClazz, "NO_COMPILE");
            annotationNames1.put(string25, annotation23);
            String string26 = "noshadow";
            Object annotation24 = getEnumConstantByName(annotationClazz, "NO_SHADOW");
            annotationNames1.put(string26, annotation24);
            String string27 = "nosideeffects";
            Object annotation25 = getEnumConstantByName(annotationClazz, "NO_SIDE_EFFECTS");
            annotationNames1.put(string27, annotation25);
            String string28 = "notypecheck";
            Object annotation26 = getEnumConstantByName(annotationClazz, "NO_TYPE_CHECK");
            annotationNames1.put(string28, annotation26);
            String string29 = "override";
            Object annotation27 = getEnumConstantByName(annotationClazz, "OVERRIDE");
            annotationNames1.put(string29, annotation27);
            String string30 = "owner";
            annotationNames1.put(string30, annotation1);
            String string31 = "param";
            annotationNames1.put(string31, annotation);
            String string32 = "preserve";
            Object annotation28 = getEnumConstantByName(annotationClazz, "PRESERVE");
            annotationNames1.put(string32, annotation28);
            String string33 = "preserveTry";
            Object annotation29 = getEnumConstantByName(annotationClazz, "PRESERVE_TRY");
            annotationNames1.put(string33, annotation29);
            String string34 = "private";
            Object annotation30 = getEnumConstantByName(annotationClazz, "PRIVATE");
            annotationNames1.put(string34, annotation30);
            String string35 = "protected";
            Object annotation31 = getEnumConstantByName(annotationClazz, "PROTECTED");
            annotationNames1.put(string35, annotation31);
            String string36 = "public";
            Object annotation32 = getEnumConstantByName(annotationClazz, "PUBLIC");
            annotationNames1.put(string36, annotation32);
            String string37 = "return";
            Object annotation33 = getEnumConstantByName(annotationClazz, "RETURN");
            annotationNames1.put(string37, annotation33);
            String string38 = "returns";
            annotationNames1.put(string38, annotation33);
            String string39 = "see";
            Object annotation34 = getEnumConstantByName(annotationClazz, "SEE");
            annotationNames1.put(string39, annotation34);
            String string40 = "suppress";
            Object annotation35 = getEnumConstantByName(annotationClazz, "SUPPRESS");
            annotationNames1.put(string40, annotation35);
            String string41 = "template";
            Object annotation36 = getEnumConstantByName(annotationClazz, "TEMPLATE");
            annotationNames1.put(string41, annotation36);
            String string42 = "this";
            Object annotation37 = getEnumConstantByName(annotationClazz, "THIS");
            annotationNames1.put(string42, annotation37);
            String string43 = "throws";
            Object annotation38 = getEnumConstantByName(annotationClazz, "THROWS");
            annotationNames1.put(string43, annotation38);
            String string44 = "type";
            Object annotation39 = getEnumConstantByName(annotationClazz, "TYPE");
            annotationNames1.put(string44, annotation39);
            String string45 = "typedef";
            Object annotation40 = getEnumConstantByName(annotationClazz, "TYPEDEF");
            annotationNames1.put(string45, annotation40);
            String string46 = "version";
            Object annotation41 = getEnumConstantByName(annotationClazz, "VERSION");
            annotationNames1.put(string46, annotation41);
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames", annotationNames1);
            Set suppressionNames = new LinkedHashSet();
            String string47 = "nonStandardJsDocs";
            suppressionNames.add(string47);
            String string48 = "strictModuleDepCheck";
            suppressionNames.add(string48);
            String string49 = "missingRequire";
            suppressionNames.add(string49);
            String string50 = "const";
            suppressionNames.add(string50);
            String string51 = "fileoverviewTags";
            suppressionNames.add(string51);
            String string52 = "invalidCasts";
            suppressionNames.add(string52);
            String string53 = "uselessCode";
            suppressionNames.add(string53);
            String string54 = "visibility";
            suppressionNames.add(string54);
            String string55 = "deprecated";
            suppressionNames.add(string55);
            String string56 = "unknownDefines";
            suppressionNames.add(string56);
            String string57 = "undefinedVars";
            suppressionNames.add(string57);
            String string58 = "duplicate";
            suppressionNames.add(string58);
            String string59 = "constantProperty";
            suppressionNames.add(string59);
            String string60 = "extraRequire";
            suppressionNames.add(string60);
            String string61 = "globalThis";
            suppressionNames.add(string61);
            String string62 = "with";
            suppressionNames.add(string62);
            String string63 = "checkRegExp";
            suppressionNames.add(string63);
            String string64 = "checkTypes";
            suppressionNames.add(string64);
            String string65 = "underscore";
            suppressionNames.add(string65);
            String string66 = "checkVars";
            suppressionNames.add(string66);
            String string67 = "missingProperties";
            suppressionNames.add(string67);
            String string68 = "accessControls";
            suppressionNames.add(string68);
            String string69 = "extraProvide";
            suppressionNames.add(string69);
            String string70 = "missingProvide";
            suppressionNames.add(string70);
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "suppressionNames", suppressionNames);
            com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3;
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "languageMode", languageMode);
            
            boolean actualParseJsDocDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "parseJsDocDocumentation"));
            assertFalse(actualParseJsDocDocumentation);
            
            boolean actualIsIdeMode = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "isIdeMode"));
            assertFalse(actualIsIdeMode);
            
            Map expectedAnnotationNames = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
            Map actualAnnotationNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
            assertTrue(deepEquals(expectedAnnotationNames, actualAnnotationNames));
            
            Set expectedSuppressionNames = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
            Set actualSuppressionNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
            assertTrue(deepEquals(expectedSuppressionNames, actualSuppressionNames));
            
            com.google.javascript.jscomp.parsing.Config.LanguageMode expectedLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
            com.google.javascript.jscomp.parsing.Config.LanguageMode actualLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
            assertEquals(expectedLanguageMode, actualLanguageMode);
            
            boolean actualAcceptConstKeyword = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "acceptConstKeyword"));
            assertFalse(actualAcceptConstKeyword);
            
            Config finalCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
            
            assertFalse(initialCompilerParserConfig == finalCompilerParserConfig);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    
    @Test
    public void testGetParserConfig2() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            setStaticField(parserRunnerClazz, "annotationNames", null);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
            options.setLanguageIn(languageIn);
            compiler.options = options;
            
            Config initialCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
            
            Config actual = compiler.getParserConfig();
            
            Config expected = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
            Map annotationNames = new LinkedHashMap();
            String string = "argument";
            Class annotationClazz = Class.forName("com.google.javascript.jscomp.parsing.Annotation");
            Object annotation = getEnumConstantByName(annotationClazz, "PARAM");
            annotationNames.put(string, annotation);
            String string1 = "author";
            Object annotation1 = getEnumConstantByName(annotationClazz, "AUTHOR");
            annotationNames.put(string1, annotation1);
            String string2 = "const";
            Object annotation2 = getEnumConstantByName(annotationClazz, "CONSTANT");
            annotationNames.put(string2, annotation2);
            String string3 = "constant";
            annotationNames.put(string3, annotation2);
            String string4 = "constructor";
            Object annotation3 = getEnumConstantByName(annotationClazz, "CONSTRUCTOR");
            annotationNames.put(string4, annotation3);
            String string5 = "define";
            Object annotation4 = getEnumConstantByName(annotationClazz, "DEFINE");
            annotationNames.put(string5, annotation4);
            String string6 = "deprecated";
            Object annotation5 = getEnumConstantByName(annotationClazz, "DEPRECATED");
            annotationNames.put(string6, annotation5);
            String string7 = "desc";
            Object annotation6 = getEnumConstantByName(annotationClazz, "DESC");
            annotationNames.put(string7, annotation6);
            String string8 = "enum";
            Object annotation7 = getEnumConstantByName(annotationClazz, "ENUM");
            annotationNames.put(string8, annotation7);
            String string9 = "export";
            Object annotation8 = getEnumConstantByName(annotationClazz, "EXPORT");
            annotationNames.put(string9, annotation8);
            String string10 = "extends";
            Object annotation9 = getEnumConstantByName(annotationClazz, "EXTENDS");
            annotationNames.put(string10, annotation9);
            String string11 = "externs";
            Object annotation10 = getEnumConstantByName(annotationClazz, "EXTERNS");
            annotationNames.put(string11, annotation10);
            String string12 = "fileoverview";
            Object annotation11 = getEnumConstantByName(annotationClazz, "FILE_OVERVIEW");
            annotationNames.put(string12, annotation11);
            String string13 = "final";
            annotationNames.put(string13, annotation2);
            String string14 = "hidden";
            Object annotation12 = getEnumConstantByName(annotationClazz, "HIDDEN");
            annotationNames.put(string14, annotation12);
            String string15 = "implements";
            Object annotation13 = getEnumConstantByName(annotationClazz, "IMPLEMENTS");
            annotationNames.put(string15, annotation13);
            String string16 = "implicitCast";
            Object annotation14 = getEnumConstantByName(annotationClazz, "IMPLICIT_CAST");
            annotationNames.put(string16, annotation14);
            String string17 = "inheritDoc";
            Object annotation15 = getEnumConstantByName(annotationClazz, "INHERIT_DOC");
            annotationNames.put(string17, annotation15);
            String string18 = "interface";
            Object annotation16 = getEnumConstantByName(annotationClazz, "INTERFACE");
            annotationNames.put(string18, annotation16);
            String string19 = "javadispatch";
            Object annotation17 = getEnumConstantByName(annotationClazz, "JAVA_DISPATCH");
            annotationNames.put(string19, annotation17);
            String string20 = "lends";
            Object annotation18 = getEnumConstantByName(annotationClazz, "LENDS");
            annotationNames.put(string20, annotation18);
            String string21 = "license";
            Object annotation19 = getEnumConstantByName(annotationClazz, "LICENSE");
            annotationNames.put(string21, annotation19);
            String string22 = "meaning";
            Object annotation20 = getEnumConstantByName(annotationClazz, "MEANING");
            annotationNames.put(string22, annotation20);
            String string23 = "modifies";
            Object annotation21 = getEnumConstantByName(annotationClazz, "MODIFIES");
            annotationNames.put(string23, annotation21);
            String string24 = "noalias";
            Object annotation22 = getEnumConstantByName(annotationClazz, "NO_ALIAS");
            annotationNames.put(string24, annotation22);
            String string25 = "nocompile";
            Object annotation23 = getEnumConstantByName(annotationClazz, "NO_COMPILE");
            annotationNames.put(string25, annotation23);
            String string26 = "noshadow";
            Object annotation24 = getEnumConstantByName(annotationClazz, "NO_SHADOW");
            annotationNames.put(string26, annotation24);
            String string27 = "nosideeffects";
            Object annotation25 = getEnumConstantByName(annotationClazz, "NO_SIDE_EFFECTS");
            annotationNames.put(string27, annotation25);
            String string28 = "notypecheck";
            Object annotation26 = getEnumConstantByName(annotationClazz, "NO_TYPE_CHECK");
            annotationNames.put(string28, annotation26);
            String string29 = "override";
            Object annotation27 = getEnumConstantByName(annotationClazz, "OVERRIDE");
            annotationNames.put(string29, annotation27);
            String string30 = "owner";
            annotationNames.put(string30, annotation1);
            String string31 = "param";
            annotationNames.put(string31, annotation);
            String string32 = "preserve";
            Object annotation28 = getEnumConstantByName(annotationClazz, "PRESERVE");
            annotationNames.put(string32, annotation28);
            String string33 = "preserveTry";
            Object annotation29 = getEnumConstantByName(annotationClazz, "PRESERVE_TRY");
            annotationNames.put(string33, annotation29);
            String string34 = "private";
            Object annotation30 = getEnumConstantByName(annotationClazz, "PRIVATE");
            annotationNames.put(string34, annotation30);
            String string35 = "protected";
            Object annotation31 = getEnumConstantByName(annotationClazz, "PROTECTED");
            annotationNames.put(string35, annotation31);
            String string36 = "public";
            Object annotation32 = getEnumConstantByName(annotationClazz, "PUBLIC");
            annotationNames.put(string36, annotation32);
            String string37 = "return";
            Object annotation33 = getEnumConstantByName(annotationClazz, "RETURN");
            annotationNames.put(string37, annotation33);
            String string38 = "returns";
            annotationNames.put(string38, annotation33);
            String string39 = "see";
            Object annotation34 = getEnumConstantByName(annotationClazz, "SEE");
            annotationNames.put(string39, annotation34);
            String string40 = "suppress";
            Object annotation35 = getEnumConstantByName(annotationClazz, "SUPPRESS");
            annotationNames.put(string40, annotation35);
            String string41 = "template";
            Object annotation36 = getEnumConstantByName(annotationClazz, "TEMPLATE");
            annotationNames.put(string41, annotation36);
            String string42 = "this";
            Object annotation37 = getEnumConstantByName(annotationClazz, "THIS");
            annotationNames.put(string42, annotation37);
            String string43 = "throws";
            Object annotation38 = getEnumConstantByName(annotationClazz, "THROWS");
            annotationNames.put(string43, annotation38);
            String string44 = "type";
            Object annotation39 = getEnumConstantByName(annotationClazz, "TYPE");
            annotationNames.put(string44, annotation39);
            String string45 = "typedef";
            Object annotation40 = getEnumConstantByName(annotationClazz, "TYPEDEF");
            annotationNames.put(string45, annotation40);
            String string46 = "version";
            Object annotation41 = getEnumConstantByName(annotationClazz, "VERSION");
            annotationNames.put(string46, annotation41);
            String string47 = "exception";
            Object annotation42 = getEnumConstantByName(annotationClazz, "NOT_IMPLEMENTED");
            annotationNames.put(string47, annotation42);
            String string48 = "mods";
            annotationNames.put(string48, annotation42);
            String string49 = "addon";
            annotationNames.put(string49, annotation42);
            String string50 = "link";
            annotationNames.put(string50, annotation42);
            String string51 = "description";
            annotationNames.put(string51, annotation42);
            String string52 = "constructs";
            annotationNames.put(string52, annotation42);
            String string53 = "example";
            annotationNames.put(string53, annotation42);
            String string54 = "default";
            annotationNames.put(string54, annotation42);
            String string55 = "borrows";
            annotationNames.put(string55, annotation42);
            String string56 = "function";
            annotationNames.put(string56, annotation42);
            String string57 = "member";
            annotationNames.put(string57, annotation42);
            String string58 = "property";
            annotationNames.put(string58, annotation42);
            String string59 = "ignore";
            annotationNames.put(string59, annotation42);
            String string60 = "id";
            annotationNames.put(string60, annotation42);
            String string61 = "memberOf";
            annotationNames.put(string61, annotation42);
            String string62 = "event";
            annotationNames.put(string62, annotation42);
            String string63 = "class";
            annotationNames.put(string63, annotation42);
            String string64 = "static";
            annotationNames.put(string64, annotation42);
            String string65 = "inner";
            annotationNames.put(string65, annotation42);
            String string66 = "field";
            annotationNames.put(string66, annotation42);
            String string67 = "bug";
            annotationNames.put(string67, annotation42);
            String string68 = "name";
            annotationNames.put(string68, annotation42);
            String string69 = "namespace";
            annotationNames.put(string69, annotation42);
            String string70 = "modName";
            annotationNames.put(string70, annotation42);
            String string71 = "config";
            annotationNames.put(string71, annotation42);
            String string72 = "exec";
            annotationNames.put(string72, annotation42);
            String string73 = "augments";
            annotationNames.put(string73, annotation42);
            String string74 = "base";
            annotationNames.put(string74, annotation42);
            String string75 = "requires";
            annotationNames.put(string75, annotation42);
            String string76 = "since";
            annotationNames.put(string76, annotation42);
            String string77 = "supported";
            annotationNames.put(string77, annotation42);
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames", annotationNames);
            Set suppressionNames = new LinkedHashSet();
            String string78 = "nonStandardJsDocs";
            suppressionNames.add(string78);
            String string79 = "strictModuleDepCheck";
            suppressionNames.add(string79);
            String string80 = "missingRequire";
            suppressionNames.add(string80);
            String string81 = "const";
            suppressionNames.add(string81);
            String string82 = "fileoverviewTags";
            suppressionNames.add(string82);
            String string83 = "invalidCasts";
            suppressionNames.add(string83);
            String string84 = "uselessCode";
            suppressionNames.add(string84);
            String string85 = "visibility";
            suppressionNames.add(string85);
            String string86 = "deprecated";
            suppressionNames.add(string86);
            String string87 = "unknownDefines";
            suppressionNames.add(string87);
            String string88 = "undefinedVars";
            suppressionNames.add(string88);
            String string89 = "duplicate";
            suppressionNames.add(string89);
            String string90 = "constantProperty";
            suppressionNames.add(string90);
            String string91 = "extraRequire";
            suppressionNames.add(string91);
            String string92 = "globalThis";
            suppressionNames.add(string92);
            String string93 = "with";
            suppressionNames.add(string93);
            String string94 = "checkRegExp";
            suppressionNames.add(string94);
            String string95 = "checkTypes";
            suppressionNames.add(string95);
            String string96 = "underscore";
            suppressionNames.add(string96);
            String string97 = "checkVars";
            suppressionNames.add(string97);
            String string98 = "missingProperties";
            suppressionNames.add(string98);
            String string99 = "accessControls";
            suppressionNames.add(string99);
            String string100 = "extraProvide";
            suppressionNames.add(string100);
            String string101 = "missingProvide";
            suppressionNames.add(string101);
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "suppressionNames", suppressionNames);
            com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode = com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3;
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "languageMode", languageMode);
            
            boolean actualParseJsDocDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "parseJsDocDocumentation"));
            assertFalse(actualParseJsDocDocumentation);
            
            boolean actualIsIdeMode = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "isIdeMode"));
            assertFalse(actualIsIdeMode);
            
            Map expectedAnnotationNames = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
            Map actualAnnotationNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
            assertTrue(deepEquals(expectedAnnotationNames, actualAnnotationNames));
            
            Set expectedSuppressionNames = ((Set) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
            Set actualSuppressionNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "suppressionNames"));
            assertTrue(deepEquals(expectedSuppressionNames, actualSuppressionNames));
            
            com.google.javascript.jscomp.parsing.Config.LanguageMode expectedLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
            com.google.javascript.jscomp.parsing.Config.LanguageMode actualLanguageMode = ((com.google.javascript.jscomp.parsing.Config.LanguageMode) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "languageMode"));
            assertEquals(expectedLanguageMode, actualLanguageMode);
            
            boolean actualAcceptConstKeyword = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "acceptConstKeyword"));
            assertFalse(actualAcceptConstKeyword);
            
            Config finalCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
            
            assertFalse(initialCompilerParserConfig == finalCompilerParserConfig);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getErrorLevel
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getErrorLevel(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getErrorLevel(com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.WarningsGuard#level(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return warningsGuard.level(error);
 *  */
    @Test
    public void testGetErrorLevel_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrorLevel] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getErrorLevel(Compiler.java:1755) */
        compiler.getErrorLevel(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getErrorLevel(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getErrorLevel(com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(options);
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetErrorLevel_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.getErrorLevel(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getErrorLevel(com.google.javascript.jscomp.JSError)
    
    @Test
    public void testGetErrorLevel1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        
        CheckLevel actual = compiler.getErrorLevel(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getErrorLevel(com.google.javascript.jscomp.JSError)
    
    @Test
    public void testGetErrorLevel2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m1 = createInstance("java.util.Collections$CheckedNavigableMap");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m1);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrorLevel] produces [java.lang.ClassCastException: class java.util.Collections$CheckedNavigableMap cannot be cast to class java.util.TreeMap$NavigableSubMap (java.util.Collections$CheckedNavigableMap and java.util.TreeMap$NavigableSubMap are in module java.base of loader 'bootstrap')]
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            java.base/java.util.TreeSet.iterator(TreeSet.java:181)
            com.google.javascript.jscomp.ComposeWarningsGuard.level(ComposeWarningsGuard.java:106)
            com.google.javascript.jscomp.Compiler.getErrorLevel(Compiler.java:1755) */
        compiler.getErrorLevel(null);
    }
    
    @Test
    public void testGetErrorLevel3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(m, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(m, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m1 = createInstance("java.util.TreeMap$AscendingSubMap");
        setField(m1, "java.util.TreeMap$NavigableSubMap", "m", m);
        Object lo = createInstance("java.lang.Object");
        setField(m1, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m1);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrorLevel] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class [B (java.lang.Object and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.getHigherEntry(TreeMap.java:461)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1707)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            java.base/java.util.TreeSet.iterator(TreeSet.java:181)
            com.google.javascript.jscomp.ComposeWarningsGuard.level(ComposeWarningsGuard.java:106)
            com.google.javascript.jscomp.Compiler.getErrorLevel(Compiler.java:1755) */
        compiler.getErrorLevel(null);
    }
    
    @Test
    public void testGetErrorLevel4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(m, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(m, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m1 = createInstance("java.util.TreeMap$AscendingSubMap");
        setField(m1, "java.util.TreeMap$NavigableSubMap", "m", m);
        Object lo = createInstance("java.lang.Object");
        setField(m1, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m1);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrorLevel] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class sun.security.x509.AVA (java.lang.Object and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
            java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.getHigherEntry(TreeMap.java:461)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1707)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            java.base/java.util.TreeSet.iterator(TreeSet.java:181)
            com.google.javascript.jscomp.ComposeWarningsGuard.level(ComposeWarningsGuard.java:106)
            com.google.javascript.jscomp.Compiler.getErrorLevel(Compiler.java:1755) */
        compiler.getErrorLevel(null);
    }
    
    @Test
    public void testGetErrorLevel5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Object left = createInstance("java.util.TreeMap$Entry");
        setField(root, "java.util.TreeMap$Entry", "left", left);
        setField(m, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrorLevel] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ComposeWarningsGuard.level(ComposeWarningsGuard.java:107)
            com.google.javascript.jscomp.Compiler.getErrorLevel(Compiler.java:1755) */
        compiler.getErrorLevel(null);
    }
    
    @Test
    public void testGetErrorLevel6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m1 = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m2 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(m2, "java.util.TreeMap", "root", root);
        setField(m1, "java.util.TreeMap$NavigableSubMap", "m", m2);
        setField(m1, "java.util.TreeMap$NavigableSubMap", "fromStart", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m1);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrorLevel] produces [java.lang.NullPointerException]
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap$NavigableSubMap.tooHigh(TreeMap.java:1677)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1708)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            java.base/java.util.TreeSet.iterator(TreeSet.java:181)
            com.google.javascript.jscomp.ComposeWarningsGuard.level(ComposeWarningsGuard.java:106)
            com.google.javascript.jscomp.Compiler.getErrorLevel(Compiler.java:1755) */
        compiler.getErrorLevel(null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getErrorLevel(com.google.javascript.jscomp.JSError)
    
    @Test(timeout = 1000L)
    public void testGetErrorLevel7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        TreeSet guards = ((TreeSet) createInstance("java.util.TreeSet"));
        TreeMap m = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m1 = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m2 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Object left = createInstance("java.util.TreeMap$Entry");
        setField(left, "java.util.TreeMap$Entry", "left", root);
        setField(root, "java.util.TreeMap$Entry", "left", left);
        setField(m2, "java.util.TreeMap", "root", root);
        setField(m1, "java.util.TreeMap$NavigableSubMap", "m", m2);
        setField(m1, "java.util.TreeMap$NavigableSubMap", "fromStart", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m1);
        setField(m, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(guards, "java.util.TreeSet", "m", m);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "warningsGuard", warningsGuard);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        compiler.getErrorLevel(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.acceptConstKeyword
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptConstKeyword()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acceptConstKeyword()}
 * @utbot.returnsFrom {@code return options.acceptConstKeyword;}
 *  */
    @Test
    public void testAcceptConstKeyword_ReturnOptionsAcceptConstKeyword() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        boolean actual = compiler.acceptConstKeyword();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptConstKeyword()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acceptConstKeyword()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.acceptConstKeyword;
 *  */
    @Test
    public void testAcceptConstKeyword_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.acceptConstKeyword] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.acceptConstKeyword(Compiler.java:1690) */
        compiler.acceptConstKeyword();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.languageMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method languageMode()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#languageMode()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getLanguageIn()}
 * @utbot.returnsFrom {@code return options.getLanguageIn();}
 *  */
    @Test
    public void testLanguageMode_CompilerOptionsGetLanguageIn() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        CompilerOptions.LanguageMode actual = compiler.languageMode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method languageMode()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#languageMode()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getLanguageIn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.getLanguageIn();
 *  */
    @Test
    public void testLanguageMode_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.languageMode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.languageMode(Compiler.java:1685) */
        compiler.languageMode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.prepareAst
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method prepareAst(com.google.javascript.rhino.Node)
    
    @Test
    public void testPrepareAst1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method prepareAstMethod = compilerClazz.getDeclaredMethod("prepareAst", stringNodeType);
        prepareAstMethod.setAccessible(true);
        java.lang.Object[] prepareAstMethodArguments = new java.lang.Object[1];
        prepareAstMethodArguments[0] = stringNode;
        prepareAstMethod.invoke(compiler, prepareAstMethodArguments);
    }
    
    @Test
    public void testPrepareAst2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method prepareAstMethod = compilerClazz.getDeclaredMethod("prepareAst", stringNodeType);
        prepareAstMethod.setAccessible(true);
        java.lang.Object[] prepareAstMethodArguments = new java.lang.Object[1];
        prepareAstMethodArguments[0] = stringNode;
        prepareAstMethod.invoke(compiler, prepareAstMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prepareAst(com.google.javascript.rhino.Node)
    
    @Test
    public void testPrepareAst3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.prepareAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:861)
            com.google.javascript.jscomp.Compiler.prepareAst(Compiler.java:1618) */
        compiler.prepareAst(null);
    }
    
    @Test
    public void testPrepareAst4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        PerformanceTracker tracker = ((PerformanceTracker) createInstance("com.google.javascript.jscomp.PerformanceTracker"));
        ArrayDeque currentRunningPass = new ArrayDeque();
        setField(tracker, "com.google.javascript.jscomp.PerformanceTracker", "currentRunningPass", currentRunningPass);
        compiler.tracker = tracker;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.prepareAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker.recordPassStart(PerformanceTracker.java:67)
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:861)
            com.google.javascript.jscomp.Compiler.prepareAst(Compiler.java:1618) */
        compiler.prepareAst(functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.reportCodeChange
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportCodeChange()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#reportCodeChange()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(CodeChangeHandler handler: codeChangeHandlers)
 *  */
    @Test
    public void testReportCodeChange_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.reportCodeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:1657) */
        compiler.reportCodeChange();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reportCodeChange()
    
    @Test
    public void testReportCodeChange1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        compiler.reportCodeChange();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reportCodeChange()
    
    @Test
    public void testReportCodeChange2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.reportCodeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:1658) */
        compiler.reportCodeChange();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.setCssRenamingMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)}
 *  */
    @Test
    public void testSetCssRenamingMap() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CssRenamingMap cssRenamingMap = ((CssRenamingMap) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives$1"));
        options.cssRenamingMap = cssRenamingMap;
        compiler.options = options;
        
        compiler.setCssRenamingMap(null);
        
        CssRenamingMap finalCompilerOptionsCssRenamingMap = compiler.options.cssRenamingMap;
        
        assertNull(finalCompilerOptionsCssRenamingMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: options.cssRenamingMap = map;
 *  */
    @Test
    public void testSetCssRenamingMap_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.setCssRenamingMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.setCssRenamingMap(Compiler.java:1573) */
        compiler.setCssRenamingMap(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getErrorCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErrorCount()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getErrorCount()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#getErrorCount()}
 * @utbot.returnsFrom {@code return errorManager.getErrorCount();}
 *  */
    @Test
    public void testGetErrorCount_ErrorManagerGetErrorCount() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStreamErrorManager errorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        int actual = compiler.getErrorCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getErrorCount()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getErrorCount()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#getErrorCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return errorManager.getErrorCount();
 *  */
    @Test
    public void testGetErrorCount_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrorCount] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getErrorCount(Compiler.java:1779) */
        compiler.getErrorCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.computeCFG
    
    ///region OTHER: ERROR SUITE for method computeCFG()
    
    @Test
    public void testComputeCFG1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.computeCFG] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.computeCFG(Compiler.java:1602) */
        compiler.computeCFG();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.processDefines
    
    ///region OTHER: ERROR SUITE for method processDefines()
    
    @Test
    public void testProcessDefines1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.processDefines] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(DefaultPassConfig.java:2095)
            com.google.javascript.jscomp.DefaultPassConfig$30$1.process(DefaultPassConfig.java:1202)
            com.google.javascript.jscomp.Compiler.processDefines(Compiler.java:1590) */
        compiler.processDefines();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getSourceMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSourceMap()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getSourceMap()}
 * @utbot.returnsFrom {@code return sourceMap;}
 *  */
    @Test
    public void testGetSourceMap_ReturnSourceMap() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        SourceMap actual = compiler.getSourceMap();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.addToDebugLog
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addToDebugLog(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#addToDebugLog(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: debugLog.append(str);
 *  */
    @Test
    public void testAddToDebugLog_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.addToDebugLog] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1810) */
        compiler.addToDebugLog(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addToDebugLog(java.lang.String)
    
    @Test
    public void testAddToDebugLog1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        StringBuilder debugLog = new StringBuilder("");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "debugLog", debugLog);
        String string = "";
        
        compiler.addToDebugLog(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.hasErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasErrors()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#hasErrors()}
 * @utbot.returnsFrom {@code return hasHaltingErrors();}
 *  */
    @Test
    public void testHasErrors_ReturnHasHaltingErrors() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ideMode = true;
        compiler.options = options;
        
        boolean actual = compiler.hasErrors();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#hasErrors()}
 * @utbot.returnsFrom {@code return hasHaltingErrors();}
 *  */
    @Test
    public void testHasErrors_ReturnHasHaltingErrors_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        PrintStreamErrorManager errorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        boolean actual = compiler.hasErrors();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#hasErrors()}
 * @utbot.returnsFrom {@code return hasHaltingErrors();}
 *  */
    @Test
    public void testHasErrors_ReturnHasHaltingErrors_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        PrintStreamErrorManager errorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "errorCount", 1);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        boolean actual = compiler.hasErrors();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getWarningCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWarningCount()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getWarningCount()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#getWarningCount()}
 * @utbot.returnsFrom {@code return errorManager.getWarningCount();}
 *  */
    @Test
    public void testGetWarningCount_ErrorManagerGetWarningCount() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStreamErrorManager errorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        int actual = compiler.getWarningCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWarningCount()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getWarningCount()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#getWarningCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return errorManager.getWarningCount();
 *  */
    @Test
    public void testGetWarningCount_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getWarningCount] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getWarningCount(Compiler.java:1786) */
        compiler.getWarningCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getSourceRegion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSourceRegion(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getSourceRegion(java.lang.String,int)}
 * @utbot.executesCondition {@code (lineNumber < 1): True}
 *  */
    @Test
    public void testGetSourceRegion_LineNumberLessThan1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        Region actual = compiler.getSourceRegion(null, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSourceRegion(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getSourceRegion(java.lang.String,int)}
 * @utbot.executesCondition {@code (lineNumber < 1): False}
 * @utbot.invokes com.google.javascript.jscomp.Compiler#getSourceFileByName(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SourceFile input = getSourceFileByName(sourceName);
 *  */
    @Test
    public void testGetSourceRegion_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getSourceRegion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1816)
            com.google.javascript.jscomp.Compiler.getSourceRegion(Compiler.java:1837) */
        compiler.getSourceRegion(null, 1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSourceRegion(java.lang.String, int)
    
    @Test
    public void testGetSourceRegion1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        String string = "";
        
        Region actual = compiler.getSourceRegion(string, 1073741824);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getAstDotGraph
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAstDotGraph()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getAstDotGraph()}
 * @utbot.executesCondition {@code (jsRoot != null): False}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testGetAstDotGraph_JsRootEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        String actual = compiler.getAstDotGraph();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getAstDotGraph()
    
    @Test
    public void testGetAstDotGraph1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ScriptOrFnNode jsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        String actual = compiler.getAstDotGraph();
        
        String expected = "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"EOF\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getPropertyMap
    
    ///region Errors report for getPropertyMap
    
    public void testGetPropertyMap_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Wrong number of type storages is provided, expected 2 arguments,
        but only 1 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getVariableMap
    
    ///region Errors report for getVariableMap
    
    public void testGetVariableMap_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Wrong number of type storages is provided, expected 2 arguments,
        but only 1 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getSourceLine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSourceLine(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getSourceLine(java.lang.String,int)}
 * @utbot.executesCondition {@code (lineNumber < 1): True}
 *  */
    @Test
    public void testGetSourceLine_LineNumberLessThan1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        String actual = compiler.getSourceLine(null, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSourceLine(java.lang.String, int)
    
    @Test
    public void testGetSourceLine1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        String string = "";
        
        String actual = compiler.getSourceLine(string, 1073741824);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSourceLine(java.lang.String, int)
    
    @Test
    public void testGetSourceLine2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getSourceLine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1816)
            com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1826) */
        compiler.getSourceLine(null, 1073741824);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.hasHaltingErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasHaltingErrors()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#hasHaltingErrors()}
 * @utbot.returnsFrom {@code return !isIdeMode() && getErrorCount() > 0;}
 *  */
    @Test
    public void testHasHaltingErrors_NotIsIdeModeAndGetErrorCountLessOrEqualZero() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ideMode = true;
        compiler.options = options;
        
        boolean actual = compiler.hasHaltingErrors();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#hasHaltingErrors()}
 * @utbot.returnsFrom {@code return !isIdeMode() && getErrorCount() > 0;}
 *  */
    @Test
    public void testHasHaltingErrors_NotIsIdeModeAndGetErrorCountLessOrEqualZero_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        boolean actual = compiler.hasHaltingErrors();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#hasHaltingErrors()}
 * @utbot.returnsFrom {@code return !isIdeMode() && getErrorCount() > 0;}
 *  */
    @Test
    public void testHasHaltingErrors_NotIsIdeModeAndGetErrorCountGreaterThanZero() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "errorCount", 1);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        boolean actual = compiler.hasHaltingErrors();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.setLoggingLevel
    
    ///region FUZZER: SECURITY for method setLoggingLevel(java.util.logging.Level)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.Compiler}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setLoggingLevel(java.util.logging.Level)}
     */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testSetLoggingLevel() {
        /* This test fails because method [com.google.javascript.jscomp.Compiler.setLoggingLevel] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.logging/java.util.logging.LogManager.checkPermission(LogManager.java:2440)
            java.logging/java.util.logging.Logger.checkPermission(Logger.java:622)
            java.logging/java.util.logging.Logger.setLevel(Logger.java:2002)
            com.google.javascript.jscomp.Compiler.setLoggingLevel(Compiler.java:1889) */
    }
    ///endregion
    
    ///region Errors report for setLoggingLevel
    
    public void testSetLoggingLevel_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.rebuildInputsFromModules
    
    ///region OTHER: ERROR SUITE for method rebuildInputsFromModules()
    
    @Test
    public void testRebuildInputsFromModules1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:424)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:412) */
        compiler.rebuildInputsFromModules();
    }
    
    @Test
    public void testRebuildInputsFromModules2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList modules = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:450)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:413) */
        compiler.rebuildInputsFromModules();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.initInputsByNameMap
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initInputsByNameMap()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initInputsByNameMap()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(CompilerInput input: externs)
 *  */
    @Test
    public void testInitInputsByNameMap_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initInputsByNameMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:450) */
        compiler.initInputsByNameMap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.runInCompilerThread
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method runInCompilerThread(java.util.concurrent.Callable)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#runInCompilerThread(java.util.concurrent.Callable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runCallable(callable, useThreads, options.tracer.isOn());
 *  */
    @Test
    public void testRunInCompilerThread_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.runInCompilerThread] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class callableType = Class.forName("java.util.concurrent.Callable");
        Method runInCompilerThreadMethod = compilerClazz.getDeclaredMethod("runInCompilerThread", callableType);
        runInCompilerThreadMethod.setAccessible(true);
        java.lang.Object[] runInCompilerThreadMethodArguments = new java.lang.Object[1];
        runInCompilerThreadMethodArguments[0] = ((Object) null);
        try {
            runInCompilerThreadMethod.invoke(compiler, runInCompilerThreadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#runInCompilerThread(java.util.concurrent.Callable)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions.TracerMode#isOn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return runCallable(callable, useThreads, options.tracer.isOn());
 *  */
    @Test
    public void testRunInCompilerThread_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.runInCompilerThread] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:565) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class callableType = Class.forName("java.util.concurrent.Callable");
        Method runInCompilerThreadMethod = compilerClazz.getDeclaredMethod("runInCompilerThread", callableType);
        runInCompilerThreadMethod.setAccessible(true);
        java.lang.Object[] runInCompilerThreadMethodArguments = new java.lang.Object[1];
        runInCompilerThreadMethodArguments[0] = ((Object) null);
        try {
            runInCompilerThreadMethod.invoke(compiler, runInCompilerThreadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method runInCompilerThread(java.util.concurrent.Callable)
    
    @Test(expected = RuntimeException.class)
    public void testRunInCompilerThread1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        Callable anonymousCallable = ((Callable) createInstance("com.google.javascript.jscomp.Compiler$9"));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class anonymousCallableType = Class.forName("java.util.concurrent.Callable");
        Method runInCompilerThreadMethod = compilerClazz.getDeclaredMethod("runInCompilerThread", anonymousCallableType);
        runInCompilerThreadMethod.setAccessible(true);
        java.lang.Object[] runInCompilerThreadMethodArguments = new java.lang.Object[1];
        runInCompilerThreadMethodArguments[0] = anonymousCallable;
        try {
            runInCompilerThreadMethod.invoke(compiler, runInCompilerThreadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testRunInCompilerThread2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class callableType = Class.forName("java.util.concurrent.Callable");
        Method runInCompilerThreadMethod = compilerClazz.getDeclaredMethod("runInCompilerThread", callableType);
        runInCompilerThreadMethod.setAccessible(true);
        java.lang.Object[] runInCompilerThreadMethodArguments = new java.lang.Object[1];
        runInCompilerThreadMethodArguments[0] = ((Object) null);
        try {
            runInCompilerThreadMethod.invoke(compiler, runInCompilerThreadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.runCallableWithLargeStack
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method runCallableWithLargeStack(java.util.concurrent.Callable)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.Compiler}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#runCallableWithLargeStack(java.util.concurrent.Callable)}
     */
    @Test(expected = RuntimeException.class)
    public void testRunCallableWithLargeStackThrowsRE() {
        Compiler.runCallableWithLargeStack(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method runCallableWithLargeStack(java.util.concurrent.Callable)
    
    @Test(expected = RuntimeException.class)
    public void testRunCallableWithLargeStack1() throws Exception  {
        Callable anonymousCallable = ((Callable) createInstance("com.google.javascript.jscomp.Compiler$8"));
        
        Compiler.runCallableWithLargeStack(anonymousCallable);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.createMessageFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createMessageFormatter()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#createMessageFormatter()}
 * @utbot.returnsFrom {@code return options.errorFormat.toFormatter(this, colorize);}
 *  */
    @Test
    public void testCreateMessageFormatter_ReturnOptionsErrorFormatToFormatter_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        options.errorFormat = errorFormat;
        compiler.options = options;
        
        ErrorFormat initialCompilerOptionsErrorFormat = compiler.options.errorFormat;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method createMessageFormatterMethod = compilerClazz.getDeclaredMethod("createMessageFormatter");
        createMessageFormatterMethod.setAccessible(true);
        java.lang.Object[] createMessageFormatterMethodArguments = new java.lang.Object[0];
        LightweightMessageFormatter actual = ((LightweightMessageFormatter) createMessageFormatterMethod.invoke(compiler, createMessageFormatterMethodArguments));
        
        LightweightMessageFormatter expected = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Class sourceExcerptClazz = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Object excerpt = getEnumConstantByName(sourceExcerptClazz, "LINE");
        setField(expected, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
        
        SourceExcerptProvider.SourceExcerpt expectedExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(expected, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
        SourceExcerptProvider.SourceExcerpt actualExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(actual, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
        assertEquals(expectedExcerpt, actualExcerpt);
        
        SourceExcerptProvider actualSource = actual.getSource();
        assertNull(actualSource);
        
        boolean actualColorize = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AbstractMessageFormatter", "colorize"));
        assertFalse(actualColorize);
        
        ErrorFormat finalCompilerOptionsErrorFormat = compiler.options.errorFormat;
        
        assertFalse(initialCompilerOptionsErrorFormat == finalCompilerOptionsErrorFormat);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#createMessageFormatter()}
 * @utbot.returnsFrom {@code return options.errorFormat.toFormatter(this, colorize);}
 *  */
    @Test
    public void testCreateMessageFormatter_ReturnOptionsErrorFormatToFormatter_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        options.errorFormat = errorFormat;
        compiler.options = options;
        
        ErrorFormat initialCompilerOptionsErrorFormat = compiler.options.errorFormat;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method createMessageFormatterMethod = compilerClazz.getDeclaredMethod("createMessageFormatter");
        createMessageFormatterMethod.setAccessible(true);
        java.lang.Object[] createMessageFormatterMethodArguments = new java.lang.Object[0];
        LightweightMessageFormatter actual = ((LightweightMessageFormatter) createMessageFormatterMethod.invoke(compiler, createMessageFormatterMethodArguments));
        
        LightweightMessageFormatter expected = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Class sourceExcerptClazz = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Object excerpt = getEnumConstantByName(sourceExcerptClazz, "LINE");
        setField(expected, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
        
        SourceExcerptProvider.SourceExcerpt expectedExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(expected, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
        SourceExcerptProvider.SourceExcerpt actualExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(actual, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
        assertEquals(expectedExcerpt, actualExcerpt);
        
        SourceExcerptProvider actualSource = actual.getSource();
        assertNull(actualSource);
        
        boolean actualColorize = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AbstractMessageFormatter", "colorize"));
        assertFalse(actualColorize);
        
        ErrorFormat finalCompilerOptionsErrorFormat = compiler.options.errorFormat;
        
        assertFalse(initialCompilerOptionsErrorFormat == finalCompilerOptionsErrorFormat);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#createMessageFormatter()}
 * @utbot.returnsFrom {@code return options.errorFormat.toFormatter(this, colorize);}
 *  */
    @Test
    public void testCreateMessageFormatter_ReturnOptionsErrorFormatToFormatter() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        options.errorFormat = errorFormat;
        compiler.options = options;
        
        ErrorFormat initialCompilerOptionsErrorFormat = compiler.options.errorFormat;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method createMessageFormatterMethod = compilerClazz.getDeclaredMethod("createMessageFormatter");
        createMessageFormatterMethod.setAccessible(true);
        java.lang.Object[] createMessageFormatterMethodArguments = new java.lang.Object[0];
        VerboseMessageFormatter actual = ((VerboseMessageFormatter) createMessageFormatterMethod.invoke(compiler, createMessageFormatterMethodArguments));
        
        Class verboseMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.VerboseMessageFormatter");
        Class compilerType = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider");
        Constructor verboseMessageFormatterConstructor = verboseMessageFormatterClazz.getDeclaredConstructor(compilerType);
        verboseMessageFormatterConstructor.setAccessible(true);
        java.lang.Object[] verboseMessageFormatterConstructorArguments = new java.lang.Object[1];
        verboseMessageFormatterConstructorArguments[0] = compiler;
        VerboseMessageFormatter expected = ((VerboseMessageFormatter) verboseMessageFormatterConstructor.newInstance(verboseMessageFormatterConstructorArguments));
        expected.setColorize(false);
        
        SourceExcerptProvider expectedSource = expected.getSource();
        SourceExcerptProvider actualSource = actual.getSource();
        CompilerOptions expectedSourceOptions = (((Compiler) expectedSource)).getOptions();
        CompilerOptions actualSourceOptions = (((Compiler) actualSource)).getOptions();
        CompilerOptions.LanguageMode actualSourceOptionsLanguageIn = actualSourceOptions.getLanguageIn();
        assertNull(actualSourceOptionsLanguageIn);
        
        CompilerOptions.LanguageMode actualSourceOptionsLanguageOut = actualSourceOptions.getLanguageOut();
        assertNull(actualSourceOptionsLanguageOut);
        
        boolean actualSourceOptionsAcceptConstKeyword = actualSourceOptions.acceptConstKeyword;
        assertFalse(actualSourceOptionsAcceptConstKeyword);
        
        boolean actualSourceOptionsAssumeStrictThis = ((Boolean) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "assumeStrictThis"));
        assertFalse(actualSourceOptionsAssumeStrictThis);
        
        boolean actualSourceOptionsIdeMode = actualSourceOptions.ideMode;
        assertFalse(actualSourceOptionsIdeMode);
        
        boolean actualSourceOptionsInferTypes = actualSourceOptions.inferTypes;
        assertFalse(actualSourceOptionsInferTypes);
        
        boolean actualSourceOptionsSkipAllPasses = actualSourceOptions.skipAllPasses;
        assertFalse(actualSourceOptionsSkipAllPasses);
        
        boolean actualSourceOptionsNameAnonymousFunctionsOnly = actualSourceOptions.nameAnonymousFunctionsOnly;
        assertFalse(actualSourceOptionsNameAnonymousFunctionsOnly);
        
        CompilerOptions.DevMode actualSourceOptionsDevMode = actualSourceOptions.devMode;
        assertNull(actualSourceOptionsDevMode);
        
        boolean actualSourceOptionsManageClosureDependencies = actualSourceOptions.manageClosureDependencies;
        assertFalse(actualSourceOptionsManageClosureDependencies);
        
        List actualSourceOptionsManageClosureDependenciesEntryPoints = actualSourceOptions.manageClosureDependenciesEntryPoints;
        assertNull(actualSourceOptionsManageClosureDependenciesEntryPoints);
        
        MessageBundle actualSourceOptionsMessageBundle = actualSourceOptions.messageBundle;
        assertNull(actualSourceOptionsMessageBundle);
        
        boolean actualSourceOptionsCheckSymbols = actualSourceOptions.checkSymbols;
        assertFalse(actualSourceOptionsCheckSymbols);
        
        CheckLevel actualSourceOptionsCheckShadowVars = actualSourceOptions.checkShadowVars;
        assertNull(actualSourceOptionsCheckShadowVars);
        
        CheckLevel actualSourceOptionsAggressiveVarCheck = actualSourceOptions.aggressiveVarCheck;
        assertNull(actualSourceOptionsAggressiveVarCheck);
        
        CheckLevel actualSourceOptionsCheckFunctions = actualSourceOptions.checkFunctions;
        assertNull(actualSourceOptionsCheckFunctions);
        
        CheckLevel actualSourceOptionsCheckMethods = actualSourceOptions.checkMethods;
        assertNull(actualSourceOptionsCheckMethods);
        
        boolean actualSourceOptionsCheckDuplicateMessages = actualSourceOptions.checkDuplicateMessages;
        assertFalse(actualSourceOptionsCheckDuplicateMessages);
        
        boolean actualSourceOptionsAllowLegacyJsMessages = actualSourceOptions.allowLegacyJsMessages;
        assertFalse(actualSourceOptionsAllowLegacyJsMessages);
        
        boolean actualSourceOptionsStrictMessageReplacement = actualSourceOptions.strictMessageReplacement;
        assertFalse(actualSourceOptionsStrictMessageReplacement);
        
        boolean actualSourceOptionsCheckSuspiciousCode = actualSourceOptions.checkSuspiciousCode;
        assertFalse(actualSourceOptionsCheckSuspiciousCode);
        
        boolean actualSourceOptionsCheckControlStructures = actualSourceOptions.checkControlStructures;
        assertFalse(actualSourceOptionsCheckControlStructures);
        
        CheckLevel actualSourceOptionsCheckUndefinedProperties = actualSourceOptions.checkUndefinedProperties;
        assertNull(actualSourceOptionsCheckUndefinedProperties);
        
        boolean actualSourceOptionsCheckUnusedPropertiesEarly = actualSourceOptions.checkUnusedPropertiesEarly;
        assertFalse(actualSourceOptionsCheckUnusedPropertiesEarly);
        
        boolean actualSourceOptionsCheckTypes = actualSourceOptions.checkTypes;
        assertFalse(actualSourceOptionsCheckTypes);
        
        boolean actualSourceOptionsTightenTypes = actualSourceOptions.tightenTypes;
        assertFalse(actualSourceOptionsTightenTypes);
        
        boolean actualSourceOptionsInferTypesInGlobalScope = actualSourceOptions.inferTypesInGlobalScope;
        assertFalse(actualSourceOptionsInferTypesInGlobalScope);
        
        boolean actualSourceOptionsCheckTypedPropertyCalls = actualSourceOptions.checkTypedPropertyCalls;
        assertFalse(actualSourceOptionsCheckTypedPropertyCalls);
        
        CheckLevel actualSourceOptionsReportMissingOverride = actualSourceOptions.reportMissingOverride;
        assertNull(actualSourceOptionsReportMissingOverride);
        
        CheckLevel actualSourceOptionsReportUnknownTypes = actualSourceOptions.reportUnknownTypes;
        assertNull(actualSourceOptionsReportUnknownTypes);
        
        CheckLevel actualSourceOptionsCheckRequires = actualSourceOptions.checkRequires;
        assertNull(actualSourceOptionsCheckRequires);
        
        CheckLevel actualSourceOptionsCheckProvides = actualSourceOptions.checkProvides;
        assertNull(actualSourceOptionsCheckProvides);
        
        CheckLevel actualSourceOptionsCheckGlobalNamesLevel = actualSourceOptions.checkGlobalNamesLevel;
        assertNull(actualSourceOptionsCheckGlobalNamesLevel);
        
        CheckLevel actualSourceOptionsBrokenClosureRequiresLevel = actualSourceOptions.brokenClosureRequiresLevel;
        assertNull(actualSourceOptionsBrokenClosureRequiresLevel);
        
        CheckLevel actualSourceOptionsCheckGlobalThisLevel = actualSourceOptions.checkGlobalThisLevel;
        assertNull(actualSourceOptionsCheckGlobalThisLevel);
        
        CheckLevel actualSourceOptionsCheckMissingGetCssNameLevel = actualSourceOptions.checkMissingGetCssNameLevel;
        assertNull(actualSourceOptionsCheckMissingGetCssNameLevel);
        
        String actualSourceOptionsCheckMissingGetCssNameBlacklist = actualSourceOptions.checkMissingGetCssNameBlacklist;
        assertNull(actualSourceOptionsCheckMissingGetCssNameBlacklist);
        
        boolean actualSourceOptionsCheckEs5Strict = actualSourceOptions.checkEs5Strict;
        assertFalse(actualSourceOptionsCheckEs5Strict);
        
        boolean actualSourceOptionsCheckCaja = actualSourceOptions.checkCaja;
        assertFalse(actualSourceOptionsCheckCaja);
        
        boolean actualSourceOptionsFoldConstants = actualSourceOptions.foldConstants;
        assertFalse(actualSourceOptionsFoldConstants);
        
        boolean actualSourceOptionsDeadAssignmentElimination = actualSourceOptions.deadAssignmentElimination;
        assertFalse(actualSourceOptionsDeadAssignmentElimination);
        
        boolean actualSourceOptionsInlineConstantVars = actualSourceOptions.inlineConstantVars;
        assertFalse(actualSourceOptionsInlineConstantVars);
        
        boolean actualSourceOptionsInlineFunctions = actualSourceOptions.inlineFunctions;
        assertFalse(actualSourceOptionsInlineFunctions);
        
        boolean actualSourceOptionsDecomposeExpressions = actualSourceOptions.decomposeExpressions;
        assertFalse(actualSourceOptionsDecomposeExpressions);
        
        boolean actualSourceOptionsInlineAnonymousFunctionExpressions = actualSourceOptions.inlineAnonymousFunctionExpressions;
        assertFalse(actualSourceOptionsInlineAnonymousFunctionExpressions);
        
        boolean actualSourceOptionsInlineLocalFunctions = actualSourceOptions.inlineLocalFunctions;
        assertFalse(actualSourceOptionsInlineLocalFunctions);
        
        boolean actualSourceOptionsCrossModuleCodeMotion = actualSourceOptions.crossModuleCodeMotion;
        assertFalse(actualSourceOptionsCrossModuleCodeMotion);
        
        boolean actualSourceOptionsCoalesceVariableNames = actualSourceOptions.coalesceVariableNames;
        assertFalse(actualSourceOptionsCoalesceVariableNames);
        
        boolean actualSourceOptionsCrossModuleMethodMotion = actualSourceOptions.crossModuleMethodMotion;
        assertFalse(actualSourceOptionsCrossModuleMethodMotion);
        
        boolean actualSourceOptionsInlineGetters = actualSourceOptions.inlineGetters;
        assertFalse(actualSourceOptionsInlineGetters);
        
        boolean actualSourceOptionsInlineVariables = actualSourceOptions.inlineVariables;
        assertFalse(actualSourceOptionsInlineVariables);
        
        boolean actualSourceOptionsInlineLocalVariables = actualSourceOptions.inlineLocalVariables;
        assertFalse(actualSourceOptionsInlineLocalVariables);
        
        boolean actualSourceOptionsFlowSensitiveInlineVariables = actualSourceOptions.flowSensitiveInlineVariables;
        assertFalse(actualSourceOptionsFlowSensitiveInlineVariables);
        
        boolean actualSourceOptionsSmartNameRemoval = actualSourceOptions.smartNameRemoval;
        assertFalse(actualSourceOptionsSmartNameRemoval);
        
        boolean actualSourceOptionsRemoveDeadCode = actualSourceOptions.removeDeadCode;
        assertFalse(actualSourceOptionsRemoveDeadCode);
        
        CheckLevel actualSourceOptionsCheckUnreachableCode = actualSourceOptions.checkUnreachableCode;
        assertNull(actualSourceOptionsCheckUnreachableCode);
        
        CheckLevel actualSourceOptionsCheckMissingReturn = actualSourceOptions.checkMissingReturn;
        assertNull(actualSourceOptionsCheckMissingReturn);
        
        boolean actualSourceOptionsExtractPrototypeMemberDeclarations = actualSourceOptions.extractPrototypeMemberDeclarations;
        assertFalse(actualSourceOptionsExtractPrototypeMemberDeclarations);
        
        boolean actualSourceOptionsRemoveEmptyFunctions = actualSourceOptions.removeEmptyFunctions;
        assertFalse(actualSourceOptionsRemoveEmptyFunctions);
        
        boolean actualSourceOptionsRemoveUnusedPrototypeProperties = actualSourceOptions.removeUnusedPrototypeProperties;
        assertFalse(actualSourceOptionsRemoveUnusedPrototypeProperties);
        
        boolean actualSourceOptionsRemoveUnusedPrototypePropertiesInExterns = actualSourceOptions.removeUnusedPrototypePropertiesInExterns;
        assertFalse(actualSourceOptionsRemoveUnusedPrototypePropertiesInExterns);
        
        boolean actualSourceOptionsRemoveUnusedVars = actualSourceOptions.removeUnusedVars;
        assertFalse(actualSourceOptionsRemoveUnusedVars);
        
        boolean actualSourceOptionsRemoveUnusedLocalVars = actualSourceOptions.removeUnusedLocalVars;
        assertFalse(actualSourceOptionsRemoveUnusedLocalVars);
        
        boolean actualSourceOptionsAliasExternals = actualSourceOptions.aliasExternals;
        assertFalse(actualSourceOptionsAliasExternals);
        
        String actualSourceOptionsAliasableGlobals = actualSourceOptions.aliasableGlobals;
        assertNull(actualSourceOptionsAliasableGlobals);
        
        String actualSourceOptionsUnaliasableGlobals = actualSourceOptions.unaliasableGlobals;
        assertNull(actualSourceOptionsUnaliasableGlobals);
        
        boolean actualSourceOptionsCollapseVariableDeclarations = actualSourceOptions.collapseVariableDeclarations;
        assertFalse(actualSourceOptionsCollapseVariableDeclarations);
        
        boolean actualSourceOptionsGroupVariableDeclarations = actualSourceOptions.groupVariableDeclarations;
        assertFalse(actualSourceOptionsGroupVariableDeclarations);
        
        boolean actualSourceOptionsCollapseAnonymousFunctions = actualSourceOptions.collapseAnonymousFunctions;
        assertFalse(actualSourceOptionsCollapseAnonymousFunctions);
        
        Set actualSourceOptionsAliasableStrings = actualSourceOptions.aliasableStrings;
        assertNull(actualSourceOptionsAliasableStrings);
        
        String actualSourceOptionsAliasStringsBlacklist = actualSourceOptions.aliasStringsBlacklist;
        assertNull(actualSourceOptionsAliasStringsBlacklist);
        
        boolean actualSourceOptionsAliasAllStrings = actualSourceOptions.aliasAllStrings;
        assertFalse(actualSourceOptionsAliasAllStrings);
        
        boolean actualSourceOptionsOutputJsStringUsage = actualSourceOptions.outputJsStringUsage;
        assertFalse(actualSourceOptionsOutputJsStringUsage);
        
        boolean actualSourceOptionsConvertToDottedProperties = actualSourceOptions.convertToDottedProperties;
        assertFalse(actualSourceOptionsConvertToDottedProperties);
        
        boolean actualSourceOptionsRewriteFunctionExpressions = actualSourceOptions.rewriteFunctionExpressions;
        assertFalse(actualSourceOptionsRewriteFunctionExpressions);
        
        boolean actualSourceOptionsOptimizeParameters = actualSourceOptions.optimizeParameters;
        assertFalse(actualSourceOptionsOptimizeParameters);
        
        boolean actualSourceOptionsOptimizeReturns = actualSourceOptions.optimizeReturns;
        assertFalse(actualSourceOptionsOptimizeReturns);
        
        boolean actualSourceOptionsOptimizeCalls = actualSourceOptions.optimizeCalls;
        assertFalse(actualSourceOptionsOptimizeCalls);
        
        boolean actualSourceOptionsOptimizeArgumentsArray = actualSourceOptions.optimizeArgumentsArray;
        assertFalse(actualSourceOptionsOptimizeArgumentsArray);
        
        boolean actualSourceOptionsChainCalls = actualSourceOptions.chainCalls;
        assertFalse(actualSourceOptionsChainCalls);
        
        VariableRenamingPolicy actualSourceOptionsVariableRenaming = actualSourceOptions.variableRenaming;
        assertNull(actualSourceOptionsVariableRenaming);
        
        PropertyRenamingPolicy actualSourceOptionsPropertyRenaming = actualSourceOptions.propertyRenaming;
        assertNull(actualSourceOptionsPropertyRenaming);
        
        boolean actualSourceOptionsPropertyAffinity = actualSourceOptions.propertyAffinity;
        assertFalse(actualSourceOptionsPropertyAffinity);
        
        boolean actualSourceOptionsLabelRenaming = actualSourceOptions.labelRenaming;
        assertFalse(actualSourceOptionsLabelRenaming);
        
        boolean actualSourceOptionsReserveRawExports = actualSourceOptions.reserveRawExports;
        assertFalse(actualSourceOptionsReserveRawExports);
        
        boolean actualSourceOptionsShadowVariables = actualSourceOptions.shadowVariables;
        assertFalse(actualSourceOptionsShadowVariables);
        
        boolean actualSourceOptionsGeneratePseudoNames = actualSourceOptions.generatePseudoNames;
        assertFalse(actualSourceOptionsGeneratePseudoNames);
        
        String actualSourceOptionsRenamePrefix = actualSourceOptions.renamePrefix;
        assertNull(actualSourceOptionsRenamePrefix);
        
        boolean actualSourceOptionsAliasKeywords = actualSourceOptions.aliasKeywords;
        assertFalse(actualSourceOptionsAliasKeywords);
        
        boolean actualSourceOptionsCollapseProperties = actualSourceOptions.collapseProperties;
        assertFalse(actualSourceOptionsCollapseProperties);
        
        boolean actualSourceOptionsCollapseObjectLiterals = actualSourceOptions.collapseObjectLiterals;
        assertFalse(actualSourceOptionsCollapseObjectLiterals);
        
        boolean actualSourceOptionsCollapsePropertiesOnExternTypes = actualSourceOptions.collapsePropertiesOnExternTypes;
        assertFalse(actualSourceOptionsCollapsePropertiesOnExternTypes);
        
        boolean actualSourceOptionsDevirtualizePrototypeMethods = actualSourceOptions.devirtualizePrototypeMethods;
        assertFalse(actualSourceOptionsDevirtualizePrototypeMethods);
        
        boolean actualSourceOptionsComputeFunctionSideEffects = actualSourceOptions.computeFunctionSideEffects;
        assertFalse(actualSourceOptionsComputeFunctionSideEffects);
        
        String actualSourceOptionsDebugFunctionSideEffectsPath = actualSourceOptions.debugFunctionSideEffectsPath;
        assertNull(actualSourceOptionsDebugFunctionSideEffectsPath);
        
        boolean actualSourceOptionsDisambiguateProperties = actualSourceOptions.disambiguateProperties;
        assertFalse(actualSourceOptionsDisambiguateProperties);
        
        boolean actualSourceOptionsAmbiguateProperties = actualSourceOptions.ambiguateProperties;
        assertFalse(actualSourceOptionsAmbiguateProperties);
        
        AnonymousFunctionNamingPolicy actualSourceOptionsAnonymousFunctionNaming = actualSourceOptions.anonymousFunctionNaming;
        assertNull(actualSourceOptionsAnonymousFunctionNaming);
        
        byte[] actualSourceOptionsInputVariableMapSerialized = actualSourceOptions.inputVariableMapSerialized;
        assertNull(actualSourceOptionsInputVariableMapSerialized);
        
        byte[] actualSourceOptionsInputPropertyMapSerialized = actualSourceOptions.inputPropertyMapSerialized;
        assertNull(actualSourceOptionsInputPropertyMapSerialized);
        
        boolean actualSourceOptionsExportTestFunctions = actualSourceOptions.exportTestFunctions;
        assertFalse(actualSourceOptionsExportTestFunctions);
        
        boolean actualSourceOptionsSpecializeInitialModule = actualSourceOptions.specializeInitialModule;
        assertFalse(actualSourceOptionsSpecializeInitialModule);
        
        boolean actualSourceOptionsRuntimeTypeCheck = actualSourceOptions.runtimeTypeCheck;
        assertFalse(actualSourceOptionsRuntimeTypeCheck);
        
        String actualSourceOptionsRuntimeTypeCheckLogFunction = actualSourceOptions.runtimeTypeCheckLogFunction;
        assertNull(actualSourceOptionsRuntimeTypeCheckLogFunction);
        
        CodingConvention actualSourceOptionsCodingConvention = actualSourceOptions.getCodingConvention();
        assertNull(actualSourceOptionsCodingConvention);
        
        boolean actualSourceOptionsInstrumentForCoverage = actualSourceOptions.instrumentForCoverage;
        assertFalse(actualSourceOptionsInstrumentForCoverage);
        
        boolean actualSourceOptionsInstrumentForCoverageOnly = actualSourceOptions.instrumentForCoverageOnly;
        assertFalse(actualSourceOptionsInstrumentForCoverageOnly);
        
        boolean actualSourceOptionsIgnoreCajaProperties = actualSourceOptions.ignoreCajaProperties;
        assertFalse(actualSourceOptionsIgnoreCajaProperties);
        
        String actualSourceOptionsSyntheticBlockStartMarker = actualSourceOptions.syntheticBlockStartMarker;
        assertNull(actualSourceOptionsSyntheticBlockStartMarker);
        
        String actualSourceOptionsSyntheticBlockEndMarker = actualSourceOptions.syntheticBlockEndMarker;
        assertNull(actualSourceOptionsSyntheticBlockEndMarker);
        
        String actualSourceOptionsLocale = actualSourceOptions.locale;
        assertNull(actualSourceOptionsLocale);
        
        boolean actualSourceOptionsMarkAsCompiled = actualSourceOptions.markAsCompiled;
        assertFalse(actualSourceOptionsMarkAsCompiled);
        
        boolean actualSourceOptionsRemoveTryCatchFinally = actualSourceOptions.removeTryCatchFinally;
        assertFalse(actualSourceOptionsRemoveTryCatchFinally);
        
        boolean actualSourceOptionsClosurePass = actualSourceOptions.closurePass;
        assertFalse(actualSourceOptionsClosurePass);
        
        boolean actualSourceOptionsRewriteNewDateGoogNow = actualSourceOptions.rewriteNewDateGoogNow;
        assertFalse(actualSourceOptionsRewriteNewDateGoogNow);
        
        boolean actualSourceOptionsRemoveAbstractMethods = actualSourceOptions.removeAbstractMethods;
        assertFalse(actualSourceOptionsRemoveAbstractMethods);
        
        boolean actualSourceOptionsRemoveClosureAsserts = actualSourceOptions.removeClosureAsserts;
        assertFalse(actualSourceOptionsRemoveClosureAsserts);
        
        boolean actualSourceOptionsGatherCssNames = actualSourceOptions.gatherCssNames;
        assertFalse(actualSourceOptionsGatherCssNames);
        
        Set actualSourceOptionsStripTypes = actualSourceOptions.stripTypes;
        assertNull(actualSourceOptionsStripTypes);
        
        Set actualSourceOptionsStripNameSuffixes = actualSourceOptions.stripNameSuffixes;
        assertNull(actualSourceOptionsStripNameSuffixes);
        
        Set actualSourceOptionsStripNamePrefixes = actualSourceOptions.stripNamePrefixes;
        assertNull(actualSourceOptionsStripNamePrefixes);
        
        Set actualSourceOptionsStripTypePrefixes = actualSourceOptions.stripTypePrefixes;
        assertNull(actualSourceOptionsStripTypePrefixes);
        
        Multimap actualSourceOptionsCustomPasses = actualSourceOptions.customPasses;
        assertNull(actualSourceOptionsCustomPasses);
        
        boolean actualSourceOptionsMarkNoSideEffectCalls = actualSourceOptions.markNoSideEffectCalls;
        assertFalse(actualSourceOptionsMarkNoSideEffectCalls);
        
        Map actualSourceOptionsDefineReplacements = actualSourceOptions.getDefineReplacements();
        assertNull(actualSourceOptionsDefineReplacements);
        
        CompilerOptions.TweakProcessing actualSourceOptionsTweakProcessing = actualSourceOptions.getTweakProcessing();
        assertNull(actualSourceOptionsTweakProcessing);
        
        Map actualSourceOptionsTweakReplacements = actualSourceOptions.getTweakReplacements();
        assertNull(actualSourceOptionsTweakReplacements);
        
        boolean actualSourceOptionsMoveFunctionDeclarations = actualSourceOptions.moveFunctionDeclarations;
        assertFalse(actualSourceOptionsMoveFunctionDeclarations);
        
        String actualSourceOptionsInstrumentationTemplate = actualSourceOptions.instrumentationTemplate;
        assertNull(actualSourceOptionsInstrumentationTemplate);
        
        String actualSourceOptionsAppNameStr = actualSourceOptions.appNameStr;
        assertNull(actualSourceOptionsAppNameStr);
        
        boolean actualSourceOptionsRecordFunctionInformation = actualSourceOptions.recordFunctionInformation;
        assertFalse(actualSourceOptionsRecordFunctionInformation);
        
        boolean actualSourceOptionsGenerateExports = actualSourceOptions.generateExports;
        assertFalse(actualSourceOptionsGenerateExports);
        
        CssRenamingMap actualSourceOptionsCssRenamingMap = actualSourceOptions.cssRenamingMap;
        assertNull(actualSourceOptionsCssRenamingMap);
        
        boolean actualSourceOptionsProcessObjectPropertyString = actualSourceOptions.processObjectPropertyString;
        assertFalse(actualSourceOptionsProcessObjectPropertyString);
        
        Set actualSourceOptionsIdGenerators = actualSourceOptions.idGenerators;
        assertNull(actualSourceOptionsIdGenerators);
        
        List actualSourceOptionsReplaceStringsFunctionDescriptions = actualSourceOptions.replaceStringsFunctionDescriptions;
        assertNull(actualSourceOptionsReplaceStringsFunctionDescriptions);
        
        String actualSourceOptionsReplaceStringsPlaceholderToken = actualSourceOptions.replaceStringsPlaceholderToken;
        assertNull(actualSourceOptionsReplaceStringsPlaceholderToken);
        
        Set actualSourceOptionsReplaceStringsReservedStrings = actualSourceOptions.replaceStringsReservedStrings;
        assertNull(actualSourceOptionsReplaceStringsReservedStrings);
        
        boolean actualSourceOptionsOperaCompoundAssignFix = actualSourceOptions.operaCompoundAssignFix;
        assertFalse(actualSourceOptionsOperaCompoundAssignFix);
        
        boolean actualSourceOptionsPrettyPrint = actualSourceOptions.prettyPrint;
        assertFalse(actualSourceOptionsPrettyPrint);
        
        boolean actualSourceOptionsLineBreak = actualSourceOptions.lineBreak;
        assertFalse(actualSourceOptionsLineBreak);
        
        boolean actualSourceOptionsPrintInputDelimiter = actualSourceOptions.printInputDelimiter;
        assertFalse(actualSourceOptionsPrintInputDelimiter);
        
        String actualSourceOptionsInputDelimiter = actualSourceOptions.inputDelimiter;
        assertNull(actualSourceOptionsInputDelimiter);
        
        String actualSourceOptionsReportPath = actualSourceOptions.reportPath;
        assertNull(actualSourceOptionsReportPath);
        
        CompilerOptions.TracerMode actualSourceOptionsTracer = actualSourceOptions.tracer;
        assertNull(actualSourceOptionsTracer);
        
        boolean actualSourceOptionsColorizeErrorOutput = ((Boolean) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "colorizeErrorOutput"));
        assertFalse(actualSourceOptionsColorizeErrorOutput);
        
        ErrorFormat expectedSourceOptionsErrorFormat = expectedSourceOptions.errorFormat;
        ErrorFormat actualSourceOptionsErrorFormat = actualSourceOptions.errorFormat;
        assertEquals(expectedSourceOptionsErrorFormat, actualSourceOptionsErrorFormat);
        
        String actualSourceOptionsJsOutputFile = actualSourceOptions.jsOutputFile;
        assertNull(actualSourceOptionsJsOutputFile);
        
        ComposeWarningsGuard actualSourceOptionsWarningsGuard = ((ComposeWarningsGuard) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard"));
        assertNull(actualSourceOptionsWarningsGuard);
        
        int expectedSourceOptionsSummaryDetailLevel = expectedSourceOptions.summaryDetailLevel;
        int actualSourceOptionsSummaryDetailLevel = actualSourceOptions.summaryDetailLevel;
        assertEquals(expectedSourceOptionsSummaryDetailLevel, actualSourceOptionsSummaryDetailLevel);
        
        int expectedSourceOptionsLineLengthThreshold = expectedSourceOptions.lineLengthThreshold;
        int actualSourceOptionsLineLengthThreshold = actualSourceOptions.lineLengthThreshold;
        assertEquals(expectedSourceOptionsLineLengthThreshold, actualSourceOptionsLineLengthThreshold);
        
        boolean actualSourceOptionsExternExports = ((Boolean) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "externExports"));
        assertFalse(actualSourceOptionsExternExports);
        
        String actualSourceOptionsExternExportsPath = actualSourceOptions.externExportsPath;
        assertNull(actualSourceOptionsExternExportsPath);
        
        String actualSourceOptionsNameReferenceReportPath = actualSourceOptions.nameReferenceReportPath;
        assertNull(actualSourceOptionsNameReferenceReportPath);
        
        String actualSourceOptionsNameReferenceGraphPath = actualSourceOptions.nameReferenceGraphPath;
        assertNull(actualSourceOptionsNameReferenceGraphPath);
        
        String actualSourceOptionsSourceMapOutputPath = actualSourceOptions.sourceMapOutputPath;
        assertNull(actualSourceOptionsSourceMapOutputPath);
        
        SourceMap.DetailLevel actualSourceOptionsSourceMapDetailLevel = actualSourceOptions.sourceMapDetailLevel;
        assertNull(actualSourceOptionsSourceMapDetailLevel);
        
        SourceMap.Format actualSourceOptionsSourceMapFormat = actualSourceOptions.sourceMapFormat;
        assertNull(actualSourceOptionsSourceMapFormat);
        
        String actualSourceOptionsOutputCharset = actualSourceOptions.outputCharset;
        assertNull(actualSourceOptionsOutputCharset);
        
        boolean actualSourceOptionsLooseTypes = actualSourceOptions.looseTypes;
        assertFalse(actualSourceOptionsLooseTypes);
        
        CompilerOptions.AliasTransformationHandler actualSourceOptionsAliasHandler = ((CompilerOptions.AliasTransformationHandler) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "aliasHandler"));
        assertNull(actualSourceOptionsAliasHandler);
        
        PassConfig actualSourcePasses = ((PassConfig) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualSourcePasses);
        
        List actualSourceExterns = ((List) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externs"));
        assertNull(actualSourceExterns);
        
        List actualSourceModules = ((List) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "modules"));
        assertNull(actualSourceModules);
        
        JSModuleGraph actualSourceModuleGraph = (((Compiler) actualSource)).getModuleGraph();
        assertNull(actualSourceModuleGraph);
        
        List actualSourceInputs = ((List) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "inputs"));
        assertNull(actualSourceInputs);
        
        ErrorManager actualSourceErrorManager = (((Compiler) actualSource)).getErrorManager();
        assertNull(actualSourceErrorManager);
        
        WarningsGuard actualSourceWarningsGuard = ((WarningsGuard) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "warningsGuard"));
        assertNull(actualSourceWarningsGuard);
        
        Node actualSourceExternsRoot = ((Node) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externsRoot"));
        assertNull(actualSourceExternsRoot);
        
        Node actualSourceJsRoot = ((Node) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "jsRoot"));
        assertNull(actualSourceJsRoot);
        
        Node actualSourceExternAndJsRoot = ((Node) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externAndJsRoot"));
        assertNull(actualSourceExternAndJsRoot);
        
        Map actualSourceInputsByName = ((Map) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "inputsByName"));
        assertNull(actualSourceInputsByName);
        
        SourceMap actualSourceSourceMap = (((Compiler) actualSource)).getSourceMap();
        assertNull(actualSourceSourceMap);
        
        String actualSourceExternExports = ((String) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externExports"));
        assertNull(actualSourceExternExports);
        
        int expectedSourceUniqueNameId = ((Integer) getFieldValue(expectedSource, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        int actualSourceUniqueNameId = ((Integer) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        assertEquals(expectedSourceUniqueNameId, actualSourceUniqueNameId);
        
        boolean actualSourceUseThreads = ((Boolean) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualSourceUseThreads);
        
        boolean actualSourceHasRegExpGlobalReferences = ((Boolean) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences"));
        assertFalse(actualSourceHasRegExpGlobalReferences);
        
        FunctionInformationMap actualSourceFunctionInformationMap = ((FunctionInformationMap) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "functionInformationMap"));
        assertNull(actualSourceFunctionInformationMap);
        
        StringBuilder actualSourceDebugLog = ((StringBuilder) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "debugLog"));
        assertNull(actualSourceDebugLog);
        
        CodingConvention actualSourceDefaultCodingConvention = ((CodingConvention) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention"));
        assertNull(actualSourceDefaultCodingConvention);
        
        JSTypeRegistry actualSourceTypeRegistry = (((Compiler) actualSource)).getTypeRegistry();
        assertNull(actualSourceTypeRegistry);
        
        Config actualSourceParserConfig = (((Compiler) actualSource)).getParserConfig();
        assertNull(actualSourceParserConfig);
        
        ReverseAbstractInterpreter actualSourceAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        assertNull(actualSourceAbstractInterpreter);
        
        TypeValidator actualSourceTypeValidator = (((Compiler) actualSource)).getTypeValidator();
        assertNull(actualSourceTypeValidator);
        
        PerformanceTracker actualSourceTracker = ((PerformanceTracker) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "tracker"));
        assertNull(actualSourceTracker);
        
        ErrorReporter actualSourceOldErrorReporter = ((ErrorReporter) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
        assertNull(actualSourceOldErrorReporter);
        
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actualSourceDefaultErrorReporter = (((Compiler) actualSource)).getDefaultErrorReporter();
        assertNull(actualSourceDefaultErrorReporter);
        
        PrintStream actualSourceOutStream = ((PrintStream) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "outStream"));
        assertNull(actualSourceOutStream);
        
        GlobalVarReferenceMap actualSourceGlobalRefMap = ((GlobalVarReferenceMap) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "globalRefMap"));
        assertNull(actualSourceGlobalRefMap);
        
        PassFactory actualSourceSanityCheck = ((PassFactory) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
        assertNull(actualSourceSanityCheck);
        
        Tracer actualSourceCurrentTracer = ((Tracer) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        assertNull(actualSourceCurrentTracer);
        
        String actualSourceCurrentPassName = ((String) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "currentPassName"));
        assertNull(actualSourceCurrentPassName);
        
        CodeChangeHandler.RecentChange actualSourceRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "recentChange"));
        assertNull(actualSourceRecentChange);
        
        List actualSourceCodeChangeHandlers = ((List) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
        assertNull(actualSourceCodeChangeHandlers);
        
        AbstractCompiler.LifeCycleStage actualSourceStage = ((AbstractCompiler.LifeCycleStage) getFieldValue(actualSource, "com.google.javascript.jscomp.AbstractCompiler", "stage"));
        assertNull(actualSourceStage);
        
        boolean actualColorize = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AbstractMessageFormatter", "colorize"));
        assertFalse(actualColorize);
        
        ErrorFormat finalCompilerOptionsErrorFormat = compiler.options.errorFormat;
        
        assertFalse(initialCompilerOptionsErrorFormat == finalCompilerOptionsErrorFormat);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#createMessageFormatter()}
 * @utbot.returnsFrom {@code return options.errorFormat.toFormatter(this, colorize);}
 *  */
    @Test
    public void testCreateMessageFormatter_ReturnOptionsErrorFormatToFormatter_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        options.errorFormat = errorFormat;
        compiler.options = options;
        
        ErrorFormat initialCompilerOptionsErrorFormat = compiler.options.errorFormat;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method createMessageFormatterMethod = compilerClazz.getDeclaredMethod("createMessageFormatter");
        createMessageFormatterMethod.setAccessible(true);
        java.lang.Object[] createMessageFormatterMethodArguments = new java.lang.Object[0];
        VerboseMessageFormatter actual = ((VerboseMessageFormatter) createMessageFormatterMethod.invoke(compiler, createMessageFormatterMethodArguments));
        
        Class verboseMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.VerboseMessageFormatter");
        Class compilerType = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider");
        Constructor verboseMessageFormatterConstructor = verboseMessageFormatterClazz.getDeclaredConstructor(compilerType);
        verboseMessageFormatterConstructor.setAccessible(true);
        java.lang.Object[] verboseMessageFormatterConstructorArguments = new java.lang.Object[1];
        verboseMessageFormatterConstructorArguments[0] = compiler;
        VerboseMessageFormatter expected = ((VerboseMessageFormatter) verboseMessageFormatterConstructor.newInstance(verboseMessageFormatterConstructorArguments));
        expected.setColorize(false);
        
        SourceExcerptProvider expectedSource = expected.getSource();
        SourceExcerptProvider actualSource = actual.getSource();
        CompilerOptions expectedSourceOptions = (((Compiler) expectedSource)).getOptions();
        CompilerOptions actualSourceOptions = (((Compiler) actualSource)).getOptions();
        CompilerOptions.LanguageMode actualSourceOptionsLanguageIn = actualSourceOptions.getLanguageIn();
        assertNull(actualSourceOptionsLanguageIn);
        
        CompilerOptions.LanguageMode actualSourceOptionsLanguageOut = actualSourceOptions.getLanguageOut();
        assertNull(actualSourceOptionsLanguageOut);
        
        boolean actualSourceOptionsAcceptConstKeyword = actualSourceOptions.acceptConstKeyword;
        assertFalse(actualSourceOptionsAcceptConstKeyword);
        
        boolean actualSourceOptionsAssumeStrictThis = ((Boolean) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "assumeStrictThis"));
        assertFalse(actualSourceOptionsAssumeStrictThis);
        
        boolean actualSourceOptionsIdeMode = actualSourceOptions.ideMode;
        assertFalse(actualSourceOptionsIdeMode);
        
        boolean actualSourceOptionsInferTypes = actualSourceOptions.inferTypes;
        assertFalse(actualSourceOptionsInferTypes);
        
        boolean actualSourceOptionsSkipAllPasses = actualSourceOptions.skipAllPasses;
        assertFalse(actualSourceOptionsSkipAllPasses);
        
        boolean actualSourceOptionsNameAnonymousFunctionsOnly = actualSourceOptions.nameAnonymousFunctionsOnly;
        assertFalse(actualSourceOptionsNameAnonymousFunctionsOnly);
        
        CompilerOptions.DevMode actualSourceOptionsDevMode = actualSourceOptions.devMode;
        assertNull(actualSourceOptionsDevMode);
        
        boolean actualSourceOptionsManageClosureDependencies = actualSourceOptions.manageClosureDependencies;
        assertFalse(actualSourceOptionsManageClosureDependencies);
        
        List actualSourceOptionsManageClosureDependenciesEntryPoints = actualSourceOptions.manageClosureDependenciesEntryPoints;
        assertNull(actualSourceOptionsManageClosureDependenciesEntryPoints);
        
        MessageBundle actualSourceOptionsMessageBundle = actualSourceOptions.messageBundle;
        assertNull(actualSourceOptionsMessageBundle);
        
        boolean actualSourceOptionsCheckSymbols = actualSourceOptions.checkSymbols;
        assertFalse(actualSourceOptionsCheckSymbols);
        
        CheckLevel actualSourceOptionsCheckShadowVars = actualSourceOptions.checkShadowVars;
        assertNull(actualSourceOptionsCheckShadowVars);
        
        CheckLevel actualSourceOptionsAggressiveVarCheck = actualSourceOptions.aggressiveVarCheck;
        assertNull(actualSourceOptionsAggressiveVarCheck);
        
        CheckLevel actualSourceOptionsCheckFunctions = actualSourceOptions.checkFunctions;
        assertNull(actualSourceOptionsCheckFunctions);
        
        CheckLevel actualSourceOptionsCheckMethods = actualSourceOptions.checkMethods;
        assertNull(actualSourceOptionsCheckMethods);
        
        boolean actualSourceOptionsCheckDuplicateMessages = actualSourceOptions.checkDuplicateMessages;
        assertFalse(actualSourceOptionsCheckDuplicateMessages);
        
        boolean actualSourceOptionsAllowLegacyJsMessages = actualSourceOptions.allowLegacyJsMessages;
        assertFalse(actualSourceOptionsAllowLegacyJsMessages);
        
        boolean actualSourceOptionsStrictMessageReplacement = actualSourceOptions.strictMessageReplacement;
        assertFalse(actualSourceOptionsStrictMessageReplacement);
        
        boolean actualSourceOptionsCheckSuspiciousCode = actualSourceOptions.checkSuspiciousCode;
        assertFalse(actualSourceOptionsCheckSuspiciousCode);
        
        boolean actualSourceOptionsCheckControlStructures = actualSourceOptions.checkControlStructures;
        assertFalse(actualSourceOptionsCheckControlStructures);
        
        CheckLevel actualSourceOptionsCheckUndefinedProperties = actualSourceOptions.checkUndefinedProperties;
        assertNull(actualSourceOptionsCheckUndefinedProperties);
        
        boolean actualSourceOptionsCheckUnusedPropertiesEarly = actualSourceOptions.checkUnusedPropertiesEarly;
        assertFalse(actualSourceOptionsCheckUnusedPropertiesEarly);
        
        boolean actualSourceOptionsCheckTypes = actualSourceOptions.checkTypes;
        assertFalse(actualSourceOptionsCheckTypes);
        
        boolean actualSourceOptionsTightenTypes = actualSourceOptions.tightenTypes;
        assertFalse(actualSourceOptionsTightenTypes);
        
        boolean actualSourceOptionsInferTypesInGlobalScope = actualSourceOptions.inferTypesInGlobalScope;
        assertFalse(actualSourceOptionsInferTypesInGlobalScope);
        
        boolean actualSourceOptionsCheckTypedPropertyCalls = actualSourceOptions.checkTypedPropertyCalls;
        assertFalse(actualSourceOptionsCheckTypedPropertyCalls);
        
        CheckLevel actualSourceOptionsReportMissingOverride = actualSourceOptions.reportMissingOverride;
        assertNull(actualSourceOptionsReportMissingOverride);
        
        CheckLevel actualSourceOptionsReportUnknownTypes = actualSourceOptions.reportUnknownTypes;
        assertNull(actualSourceOptionsReportUnknownTypes);
        
        CheckLevel actualSourceOptionsCheckRequires = actualSourceOptions.checkRequires;
        assertNull(actualSourceOptionsCheckRequires);
        
        CheckLevel actualSourceOptionsCheckProvides = actualSourceOptions.checkProvides;
        assertNull(actualSourceOptionsCheckProvides);
        
        CheckLevel actualSourceOptionsCheckGlobalNamesLevel = actualSourceOptions.checkGlobalNamesLevel;
        assertNull(actualSourceOptionsCheckGlobalNamesLevel);
        
        CheckLevel actualSourceOptionsBrokenClosureRequiresLevel = actualSourceOptions.brokenClosureRequiresLevel;
        assertNull(actualSourceOptionsBrokenClosureRequiresLevel);
        
        CheckLevel actualSourceOptionsCheckGlobalThisLevel = actualSourceOptions.checkGlobalThisLevel;
        assertNull(actualSourceOptionsCheckGlobalThisLevel);
        
        CheckLevel actualSourceOptionsCheckMissingGetCssNameLevel = actualSourceOptions.checkMissingGetCssNameLevel;
        assertNull(actualSourceOptionsCheckMissingGetCssNameLevel);
        
        String actualSourceOptionsCheckMissingGetCssNameBlacklist = actualSourceOptions.checkMissingGetCssNameBlacklist;
        assertNull(actualSourceOptionsCheckMissingGetCssNameBlacklist);
        
        boolean actualSourceOptionsCheckEs5Strict = actualSourceOptions.checkEs5Strict;
        assertFalse(actualSourceOptionsCheckEs5Strict);
        
        boolean actualSourceOptionsCheckCaja = actualSourceOptions.checkCaja;
        assertFalse(actualSourceOptionsCheckCaja);
        
        boolean actualSourceOptionsFoldConstants = actualSourceOptions.foldConstants;
        assertFalse(actualSourceOptionsFoldConstants);
        
        boolean actualSourceOptionsDeadAssignmentElimination = actualSourceOptions.deadAssignmentElimination;
        assertFalse(actualSourceOptionsDeadAssignmentElimination);
        
        boolean actualSourceOptionsInlineConstantVars = actualSourceOptions.inlineConstantVars;
        assertFalse(actualSourceOptionsInlineConstantVars);
        
        boolean actualSourceOptionsInlineFunctions = actualSourceOptions.inlineFunctions;
        assertFalse(actualSourceOptionsInlineFunctions);
        
        boolean actualSourceOptionsDecomposeExpressions = actualSourceOptions.decomposeExpressions;
        assertFalse(actualSourceOptionsDecomposeExpressions);
        
        boolean actualSourceOptionsInlineAnonymousFunctionExpressions = actualSourceOptions.inlineAnonymousFunctionExpressions;
        assertFalse(actualSourceOptionsInlineAnonymousFunctionExpressions);
        
        boolean actualSourceOptionsInlineLocalFunctions = actualSourceOptions.inlineLocalFunctions;
        assertFalse(actualSourceOptionsInlineLocalFunctions);
        
        boolean actualSourceOptionsCrossModuleCodeMotion = actualSourceOptions.crossModuleCodeMotion;
        assertFalse(actualSourceOptionsCrossModuleCodeMotion);
        
        boolean actualSourceOptionsCoalesceVariableNames = actualSourceOptions.coalesceVariableNames;
        assertFalse(actualSourceOptionsCoalesceVariableNames);
        
        boolean actualSourceOptionsCrossModuleMethodMotion = actualSourceOptions.crossModuleMethodMotion;
        assertFalse(actualSourceOptionsCrossModuleMethodMotion);
        
        boolean actualSourceOptionsInlineGetters = actualSourceOptions.inlineGetters;
        assertFalse(actualSourceOptionsInlineGetters);
        
        boolean actualSourceOptionsInlineVariables = actualSourceOptions.inlineVariables;
        assertFalse(actualSourceOptionsInlineVariables);
        
        boolean actualSourceOptionsInlineLocalVariables = actualSourceOptions.inlineLocalVariables;
        assertFalse(actualSourceOptionsInlineLocalVariables);
        
        boolean actualSourceOptionsFlowSensitiveInlineVariables = actualSourceOptions.flowSensitiveInlineVariables;
        assertFalse(actualSourceOptionsFlowSensitiveInlineVariables);
        
        boolean actualSourceOptionsSmartNameRemoval = actualSourceOptions.smartNameRemoval;
        assertFalse(actualSourceOptionsSmartNameRemoval);
        
        boolean actualSourceOptionsRemoveDeadCode = actualSourceOptions.removeDeadCode;
        assertFalse(actualSourceOptionsRemoveDeadCode);
        
        CheckLevel actualSourceOptionsCheckUnreachableCode = actualSourceOptions.checkUnreachableCode;
        assertNull(actualSourceOptionsCheckUnreachableCode);
        
        CheckLevel actualSourceOptionsCheckMissingReturn = actualSourceOptions.checkMissingReturn;
        assertNull(actualSourceOptionsCheckMissingReturn);
        
        boolean actualSourceOptionsExtractPrototypeMemberDeclarations = actualSourceOptions.extractPrototypeMemberDeclarations;
        assertFalse(actualSourceOptionsExtractPrototypeMemberDeclarations);
        
        boolean actualSourceOptionsRemoveEmptyFunctions = actualSourceOptions.removeEmptyFunctions;
        assertFalse(actualSourceOptionsRemoveEmptyFunctions);
        
        boolean actualSourceOptionsRemoveUnusedPrototypeProperties = actualSourceOptions.removeUnusedPrototypeProperties;
        assertFalse(actualSourceOptionsRemoveUnusedPrototypeProperties);
        
        boolean actualSourceOptionsRemoveUnusedPrototypePropertiesInExterns = actualSourceOptions.removeUnusedPrototypePropertiesInExterns;
        assertFalse(actualSourceOptionsRemoveUnusedPrototypePropertiesInExterns);
        
        boolean actualSourceOptionsRemoveUnusedVars = actualSourceOptions.removeUnusedVars;
        assertFalse(actualSourceOptionsRemoveUnusedVars);
        
        boolean actualSourceOptionsRemoveUnusedLocalVars = actualSourceOptions.removeUnusedLocalVars;
        assertFalse(actualSourceOptionsRemoveUnusedLocalVars);
        
        boolean actualSourceOptionsAliasExternals = actualSourceOptions.aliasExternals;
        assertFalse(actualSourceOptionsAliasExternals);
        
        String actualSourceOptionsAliasableGlobals = actualSourceOptions.aliasableGlobals;
        assertNull(actualSourceOptionsAliasableGlobals);
        
        String actualSourceOptionsUnaliasableGlobals = actualSourceOptions.unaliasableGlobals;
        assertNull(actualSourceOptionsUnaliasableGlobals);
        
        boolean actualSourceOptionsCollapseVariableDeclarations = actualSourceOptions.collapseVariableDeclarations;
        assertFalse(actualSourceOptionsCollapseVariableDeclarations);
        
        boolean actualSourceOptionsGroupVariableDeclarations = actualSourceOptions.groupVariableDeclarations;
        assertFalse(actualSourceOptionsGroupVariableDeclarations);
        
        boolean actualSourceOptionsCollapseAnonymousFunctions = actualSourceOptions.collapseAnonymousFunctions;
        assertFalse(actualSourceOptionsCollapseAnonymousFunctions);
        
        Set actualSourceOptionsAliasableStrings = actualSourceOptions.aliasableStrings;
        assertNull(actualSourceOptionsAliasableStrings);
        
        String actualSourceOptionsAliasStringsBlacklist = actualSourceOptions.aliasStringsBlacklist;
        assertNull(actualSourceOptionsAliasStringsBlacklist);
        
        boolean actualSourceOptionsAliasAllStrings = actualSourceOptions.aliasAllStrings;
        assertFalse(actualSourceOptionsAliasAllStrings);
        
        boolean actualSourceOptionsOutputJsStringUsage = actualSourceOptions.outputJsStringUsage;
        assertFalse(actualSourceOptionsOutputJsStringUsage);
        
        boolean actualSourceOptionsConvertToDottedProperties = actualSourceOptions.convertToDottedProperties;
        assertFalse(actualSourceOptionsConvertToDottedProperties);
        
        boolean actualSourceOptionsRewriteFunctionExpressions = actualSourceOptions.rewriteFunctionExpressions;
        assertFalse(actualSourceOptionsRewriteFunctionExpressions);
        
        boolean actualSourceOptionsOptimizeParameters = actualSourceOptions.optimizeParameters;
        assertFalse(actualSourceOptionsOptimizeParameters);
        
        boolean actualSourceOptionsOptimizeReturns = actualSourceOptions.optimizeReturns;
        assertFalse(actualSourceOptionsOptimizeReturns);
        
        boolean actualSourceOptionsOptimizeCalls = actualSourceOptions.optimizeCalls;
        assertFalse(actualSourceOptionsOptimizeCalls);
        
        boolean actualSourceOptionsOptimizeArgumentsArray = actualSourceOptions.optimizeArgumentsArray;
        assertFalse(actualSourceOptionsOptimizeArgumentsArray);
        
        boolean actualSourceOptionsChainCalls = actualSourceOptions.chainCalls;
        assertFalse(actualSourceOptionsChainCalls);
        
        VariableRenamingPolicy actualSourceOptionsVariableRenaming = actualSourceOptions.variableRenaming;
        assertNull(actualSourceOptionsVariableRenaming);
        
        PropertyRenamingPolicy actualSourceOptionsPropertyRenaming = actualSourceOptions.propertyRenaming;
        assertNull(actualSourceOptionsPropertyRenaming);
        
        boolean actualSourceOptionsPropertyAffinity = actualSourceOptions.propertyAffinity;
        assertFalse(actualSourceOptionsPropertyAffinity);
        
        boolean actualSourceOptionsLabelRenaming = actualSourceOptions.labelRenaming;
        assertFalse(actualSourceOptionsLabelRenaming);
        
        boolean actualSourceOptionsReserveRawExports = actualSourceOptions.reserveRawExports;
        assertFalse(actualSourceOptionsReserveRawExports);
        
        boolean actualSourceOptionsShadowVariables = actualSourceOptions.shadowVariables;
        assertFalse(actualSourceOptionsShadowVariables);
        
        boolean actualSourceOptionsGeneratePseudoNames = actualSourceOptions.generatePseudoNames;
        assertFalse(actualSourceOptionsGeneratePseudoNames);
        
        String actualSourceOptionsRenamePrefix = actualSourceOptions.renamePrefix;
        assertNull(actualSourceOptionsRenamePrefix);
        
        boolean actualSourceOptionsAliasKeywords = actualSourceOptions.aliasKeywords;
        assertFalse(actualSourceOptionsAliasKeywords);
        
        boolean actualSourceOptionsCollapseProperties = actualSourceOptions.collapseProperties;
        assertFalse(actualSourceOptionsCollapseProperties);
        
        boolean actualSourceOptionsCollapseObjectLiterals = actualSourceOptions.collapseObjectLiterals;
        assertFalse(actualSourceOptionsCollapseObjectLiterals);
        
        boolean actualSourceOptionsCollapsePropertiesOnExternTypes = actualSourceOptions.collapsePropertiesOnExternTypes;
        assertFalse(actualSourceOptionsCollapsePropertiesOnExternTypes);
        
        boolean actualSourceOptionsDevirtualizePrototypeMethods = actualSourceOptions.devirtualizePrototypeMethods;
        assertFalse(actualSourceOptionsDevirtualizePrototypeMethods);
        
        boolean actualSourceOptionsComputeFunctionSideEffects = actualSourceOptions.computeFunctionSideEffects;
        assertFalse(actualSourceOptionsComputeFunctionSideEffects);
        
        String actualSourceOptionsDebugFunctionSideEffectsPath = actualSourceOptions.debugFunctionSideEffectsPath;
        assertNull(actualSourceOptionsDebugFunctionSideEffectsPath);
        
        boolean actualSourceOptionsDisambiguateProperties = actualSourceOptions.disambiguateProperties;
        assertFalse(actualSourceOptionsDisambiguateProperties);
        
        boolean actualSourceOptionsAmbiguateProperties = actualSourceOptions.ambiguateProperties;
        assertFalse(actualSourceOptionsAmbiguateProperties);
        
        AnonymousFunctionNamingPolicy actualSourceOptionsAnonymousFunctionNaming = actualSourceOptions.anonymousFunctionNaming;
        assertNull(actualSourceOptionsAnonymousFunctionNaming);
        
        byte[] actualSourceOptionsInputVariableMapSerialized = actualSourceOptions.inputVariableMapSerialized;
        assertNull(actualSourceOptionsInputVariableMapSerialized);
        
        byte[] actualSourceOptionsInputPropertyMapSerialized = actualSourceOptions.inputPropertyMapSerialized;
        assertNull(actualSourceOptionsInputPropertyMapSerialized);
        
        boolean actualSourceOptionsExportTestFunctions = actualSourceOptions.exportTestFunctions;
        assertFalse(actualSourceOptionsExportTestFunctions);
        
        boolean actualSourceOptionsSpecializeInitialModule = actualSourceOptions.specializeInitialModule;
        assertFalse(actualSourceOptionsSpecializeInitialModule);
        
        boolean actualSourceOptionsRuntimeTypeCheck = actualSourceOptions.runtimeTypeCheck;
        assertFalse(actualSourceOptionsRuntimeTypeCheck);
        
        String actualSourceOptionsRuntimeTypeCheckLogFunction = actualSourceOptions.runtimeTypeCheckLogFunction;
        assertNull(actualSourceOptionsRuntimeTypeCheckLogFunction);
        
        CodingConvention actualSourceOptionsCodingConvention = actualSourceOptions.getCodingConvention();
        assertNull(actualSourceOptionsCodingConvention);
        
        boolean actualSourceOptionsInstrumentForCoverage = actualSourceOptions.instrumentForCoverage;
        assertFalse(actualSourceOptionsInstrumentForCoverage);
        
        boolean actualSourceOptionsInstrumentForCoverageOnly = actualSourceOptions.instrumentForCoverageOnly;
        assertFalse(actualSourceOptionsInstrumentForCoverageOnly);
        
        boolean actualSourceOptionsIgnoreCajaProperties = actualSourceOptions.ignoreCajaProperties;
        assertFalse(actualSourceOptionsIgnoreCajaProperties);
        
        String actualSourceOptionsSyntheticBlockStartMarker = actualSourceOptions.syntheticBlockStartMarker;
        assertNull(actualSourceOptionsSyntheticBlockStartMarker);
        
        String actualSourceOptionsSyntheticBlockEndMarker = actualSourceOptions.syntheticBlockEndMarker;
        assertNull(actualSourceOptionsSyntheticBlockEndMarker);
        
        String actualSourceOptionsLocale = actualSourceOptions.locale;
        assertNull(actualSourceOptionsLocale);
        
        boolean actualSourceOptionsMarkAsCompiled = actualSourceOptions.markAsCompiled;
        assertFalse(actualSourceOptionsMarkAsCompiled);
        
        boolean actualSourceOptionsRemoveTryCatchFinally = actualSourceOptions.removeTryCatchFinally;
        assertFalse(actualSourceOptionsRemoveTryCatchFinally);
        
        boolean actualSourceOptionsClosurePass = actualSourceOptions.closurePass;
        assertFalse(actualSourceOptionsClosurePass);
        
        boolean actualSourceOptionsRewriteNewDateGoogNow = actualSourceOptions.rewriteNewDateGoogNow;
        assertFalse(actualSourceOptionsRewriteNewDateGoogNow);
        
        boolean actualSourceOptionsRemoveAbstractMethods = actualSourceOptions.removeAbstractMethods;
        assertFalse(actualSourceOptionsRemoveAbstractMethods);
        
        boolean actualSourceOptionsRemoveClosureAsserts = actualSourceOptions.removeClosureAsserts;
        assertFalse(actualSourceOptionsRemoveClosureAsserts);
        
        boolean actualSourceOptionsGatherCssNames = actualSourceOptions.gatherCssNames;
        assertFalse(actualSourceOptionsGatherCssNames);
        
        Set actualSourceOptionsStripTypes = actualSourceOptions.stripTypes;
        assertNull(actualSourceOptionsStripTypes);
        
        Set actualSourceOptionsStripNameSuffixes = actualSourceOptions.stripNameSuffixes;
        assertNull(actualSourceOptionsStripNameSuffixes);
        
        Set actualSourceOptionsStripNamePrefixes = actualSourceOptions.stripNamePrefixes;
        assertNull(actualSourceOptionsStripNamePrefixes);
        
        Set actualSourceOptionsStripTypePrefixes = actualSourceOptions.stripTypePrefixes;
        assertNull(actualSourceOptionsStripTypePrefixes);
        
        Multimap actualSourceOptionsCustomPasses = actualSourceOptions.customPasses;
        assertNull(actualSourceOptionsCustomPasses);
        
        boolean actualSourceOptionsMarkNoSideEffectCalls = actualSourceOptions.markNoSideEffectCalls;
        assertFalse(actualSourceOptionsMarkNoSideEffectCalls);
        
        Map actualSourceOptionsDefineReplacements = actualSourceOptions.getDefineReplacements();
        assertNull(actualSourceOptionsDefineReplacements);
        
        CompilerOptions.TweakProcessing actualSourceOptionsTweakProcessing = actualSourceOptions.getTweakProcessing();
        assertNull(actualSourceOptionsTweakProcessing);
        
        Map actualSourceOptionsTweakReplacements = actualSourceOptions.getTweakReplacements();
        assertNull(actualSourceOptionsTweakReplacements);
        
        boolean actualSourceOptionsMoveFunctionDeclarations = actualSourceOptions.moveFunctionDeclarations;
        assertFalse(actualSourceOptionsMoveFunctionDeclarations);
        
        String actualSourceOptionsInstrumentationTemplate = actualSourceOptions.instrumentationTemplate;
        assertNull(actualSourceOptionsInstrumentationTemplate);
        
        String actualSourceOptionsAppNameStr = actualSourceOptions.appNameStr;
        assertNull(actualSourceOptionsAppNameStr);
        
        boolean actualSourceOptionsRecordFunctionInformation = actualSourceOptions.recordFunctionInformation;
        assertFalse(actualSourceOptionsRecordFunctionInformation);
        
        boolean actualSourceOptionsGenerateExports = actualSourceOptions.generateExports;
        assertFalse(actualSourceOptionsGenerateExports);
        
        CssRenamingMap actualSourceOptionsCssRenamingMap = actualSourceOptions.cssRenamingMap;
        assertNull(actualSourceOptionsCssRenamingMap);
        
        boolean actualSourceOptionsProcessObjectPropertyString = actualSourceOptions.processObjectPropertyString;
        assertFalse(actualSourceOptionsProcessObjectPropertyString);
        
        Set actualSourceOptionsIdGenerators = actualSourceOptions.idGenerators;
        assertNull(actualSourceOptionsIdGenerators);
        
        List actualSourceOptionsReplaceStringsFunctionDescriptions = actualSourceOptions.replaceStringsFunctionDescriptions;
        assertNull(actualSourceOptionsReplaceStringsFunctionDescriptions);
        
        String actualSourceOptionsReplaceStringsPlaceholderToken = actualSourceOptions.replaceStringsPlaceholderToken;
        assertNull(actualSourceOptionsReplaceStringsPlaceholderToken);
        
        Set actualSourceOptionsReplaceStringsReservedStrings = actualSourceOptions.replaceStringsReservedStrings;
        assertNull(actualSourceOptionsReplaceStringsReservedStrings);
        
        boolean actualSourceOptionsOperaCompoundAssignFix = actualSourceOptions.operaCompoundAssignFix;
        assertFalse(actualSourceOptionsOperaCompoundAssignFix);
        
        boolean actualSourceOptionsPrettyPrint = actualSourceOptions.prettyPrint;
        assertFalse(actualSourceOptionsPrettyPrint);
        
        boolean actualSourceOptionsLineBreak = actualSourceOptions.lineBreak;
        assertFalse(actualSourceOptionsLineBreak);
        
        boolean actualSourceOptionsPrintInputDelimiter = actualSourceOptions.printInputDelimiter;
        assertFalse(actualSourceOptionsPrintInputDelimiter);
        
        String actualSourceOptionsInputDelimiter = actualSourceOptions.inputDelimiter;
        assertNull(actualSourceOptionsInputDelimiter);
        
        String actualSourceOptionsReportPath = actualSourceOptions.reportPath;
        assertNull(actualSourceOptionsReportPath);
        
        CompilerOptions.TracerMode actualSourceOptionsTracer = actualSourceOptions.tracer;
        assertNull(actualSourceOptionsTracer);
        
        boolean actualSourceOptionsColorizeErrorOutput = ((Boolean) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "colorizeErrorOutput"));
        assertFalse(actualSourceOptionsColorizeErrorOutput);
        
        ErrorFormat expectedSourceOptionsErrorFormat = expectedSourceOptions.errorFormat;
        ErrorFormat actualSourceOptionsErrorFormat = actualSourceOptions.errorFormat;
        assertEquals(expectedSourceOptionsErrorFormat, actualSourceOptionsErrorFormat);
        
        String actualSourceOptionsJsOutputFile = actualSourceOptions.jsOutputFile;
        assertNull(actualSourceOptionsJsOutputFile);
        
        ComposeWarningsGuard actualSourceOptionsWarningsGuard = ((ComposeWarningsGuard) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard"));
        assertNull(actualSourceOptionsWarningsGuard);
        
        int expectedSourceOptionsSummaryDetailLevel = expectedSourceOptions.summaryDetailLevel;
        int actualSourceOptionsSummaryDetailLevel = actualSourceOptions.summaryDetailLevel;
        assertEquals(expectedSourceOptionsSummaryDetailLevel, actualSourceOptionsSummaryDetailLevel);
        
        int expectedSourceOptionsLineLengthThreshold = expectedSourceOptions.lineLengthThreshold;
        int actualSourceOptionsLineLengthThreshold = actualSourceOptions.lineLengthThreshold;
        assertEquals(expectedSourceOptionsLineLengthThreshold, actualSourceOptionsLineLengthThreshold);
        
        boolean actualSourceOptionsExternExports = ((Boolean) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "externExports"));
        assertFalse(actualSourceOptionsExternExports);
        
        String actualSourceOptionsExternExportsPath = actualSourceOptions.externExportsPath;
        assertNull(actualSourceOptionsExternExportsPath);
        
        String actualSourceOptionsNameReferenceReportPath = actualSourceOptions.nameReferenceReportPath;
        assertNull(actualSourceOptionsNameReferenceReportPath);
        
        String actualSourceOptionsNameReferenceGraphPath = actualSourceOptions.nameReferenceGraphPath;
        assertNull(actualSourceOptionsNameReferenceGraphPath);
        
        String actualSourceOptionsSourceMapOutputPath = actualSourceOptions.sourceMapOutputPath;
        assertNull(actualSourceOptionsSourceMapOutputPath);
        
        SourceMap.DetailLevel actualSourceOptionsSourceMapDetailLevel = actualSourceOptions.sourceMapDetailLevel;
        assertNull(actualSourceOptionsSourceMapDetailLevel);
        
        SourceMap.Format actualSourceOptionsSourceMapFormat = actualSourceOptions.sourceMapFormat;
        assertNull(actualSourceOptionsSourceMapFormat);
        
        String actualSourceOptionsOutputCharset = actualSourceOptions.outputCharset;
        assertNull(actualSourceOptionsOutputCharset);
        
        boolean actualSourceOptionsLooseTypes = actualSourceOptions.looseTypes;
        assertFalse(actualSourceOptionsLooseTypes);
        
        CompilerOptions.AliasTransformationHandler actualSourceOptionsAliasHandler = ((CompilerOptions.AliasTransformationHandler) getFieldValue(actualSourceOptions, "com.google.javascript.jscomp.CompilerOptions", "aliasHandler"));
        assertNull(actualSourceOptionsAliasHandler);
        
        PassConfig actualSourcePasses = ((PassConfig) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualSourcePasses);
        
        List actualSourceExterns = ((List) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externs"));
        assertNull(actualSourceExterns);
        
        List actualSourceModules = ((List) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "modules"));
        assertNull(actualSourceModules);
        
        JSModuleGraph actualSourceModuleGraph = (((Compiler) actualSource)).getModuleGraph();
        assertNull(actualSourceModuleGraph);
        
        List actualSourceInputs = ((List) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "inputs"));
        assertNull(actualSourceInputs);
        
        ErrorManager actualSourceErrorManager = (((Compiler) actualSource)).getErrorManager();
        assertNull(actualSourceErrorManager);
        
        WarningsGuard actualSourceWarningsGuard = ((WarningsGuard) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "warningsGuard"));
        assertNull(actualSourceWarningsGuard);
        
        Node actualSourceExternsRoot = ((Node) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externsRoot"));
        assertNull(actualSourceExternsRoot);
        
        Node actualSourceJsRoot = ((Node) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "jsRoot"));
        assertNull(actualSourceJsRoot);
        
        Node actualSourceExternAndJsRoot = ((Node) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externAndJsRoot"));
        assertNull(actualSourceExternAndJsRoot);
        
        Map actualSourceInputsByName = ((Map) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "inputsByName"));
        assertNull(actualSourceInputsByName);
        
        SourceMap actualSourceSourceMap = (((Compiler) actualSource)).getSourceMap();
        assertNull(actualSourceSourceMap);
        
        String actualSourceExternExports = ((String) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externExports"));
        assertNull(actualSourceExternExports);
        
        int expectedSourceUniqueNameId = ((Integer) getFieldValue(expectedSource, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        int actualSourceUniqueNameId = ((Integer) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        assertEquals(expectedSourceUniqueNameId, actualSourceUniqueNameId);
        
        boolean actualSourceUseThreads = ((Boolean) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualSourceUseThreads);
        
        boolean actualSourceHasRegExpGlobalReferences = ((Boolean) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences"));
        assertFalse(actualSourceHasRegExpGlobalReferences);
        
        FunctionInformationMap actualSourceFunctionInformationMap = ((FunctionInformationMap) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "functionInformationMap"));
        assertNull(actualSourceFunctionInformationMap);
        
        StringBuilder actualSourceDebugLog = ((StringBuilder) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "debugLog"));
        assertNull(actualSourceDebugLog);
        
        CodingConvention actualSourceDefaultCodingConvention = ((CodingConvention) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention"));
        assertNull(actualSourceDefaultCodingConvention);
        
        JSTypeRegistry actualSourceTypeRegistry = (((Compiler) actualSource)).getTypeRegistry();
        assertNull(actualSourceTypeRegistry);
        
        Config actualSourceParserConfig = (((Compiler) actualSource)).getParserConfig();
        assertNull(actualSourceParserConfig);
        
        ReverseAbstractInterpreter actualSourceAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        assertNull(actualSourceAbstractInterpreter);
        
        TypeValidator actualSourceTypeValidator = (((Compiler) actualSource)).getTypeValidator();
        assertNull(actualSourceTypeValidator);
        
        PerformanceTracker actualSourceTracker = ((PerformanceTracker) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "tracker"));
        assertNull(actualSourceTracker);
        
        ErrorReporter actualSourceOldErrorReporter = ((ErrorReporter) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
        assertNull(actualSourceOldErrorReporter);
        
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actualSourceDefaultErrorReporter = (((Compiler) actualSource)).getDefaultErrorReporter();
        assertNull(actualSourceDefaultErrorReporter);
        
        PrintStream actualSourceOutStream = ((PrintStream) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "outStream"));
        assertNull(actualSourceOutStream);
        
        GlobalVarReferenceMap actualSourceGlobalRefMap = ((GlobalVarReferenceMap) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "globalRefMap"));
        assertNull(actualSourceGlobalRefMap);
        
        PassFactory actualSourceSanityCheck = ((PassFactory) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
        assertNull(actualSourceSanityCheck);
        
        Tracer actualSourceCurrentTracer = ((Tracer) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        assertNull(actualSourceCurrentTracer);
        
        String actualSourceCurrentPassName = ((String) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "currentPassName"));
        assertNull(actualSourceCurrentPassName);
        
        CodeChangeHandler.RecentChange actualSourceRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "recentChange"));
        assertNull(actualSourceRecentChange);
        
        List actualSourceCodeChangeHandlers = ((List) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
        assertNull(actualSourceCodeChangeHandlers);
        
        AbstractCompiler.LifeCycleStage actualSourceStage = ((AbstractCompiler.LifeCycleStage) getFieldValue(actualSource, "com.google.javascript.jscomp.AbstractCompiler", "stage"));
        assertNull(actualSourceStage);
        
        boolean actualColorize = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AbstractMessageFormatter", "colorize"));
        assertFalse(actualColorize);
        
        ErrorFormat finalCompilerOptionsErrorFormat = compiler.options.errorFormat;
        
        assertFalse(initialCompilerOptionsErrorFormat == finalCompilerOptionsErrorFormat);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createMessageFormatter()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#createMessageFormatter()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean colorize = options.shouldColorizeErrorOutput();
 *  */
    @Test
    public void testCreateMessageFormatter_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.createMessageFormatter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:218) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method createMessageFormatterMethod = compilerClazz.getDeclaredMethod("createMessageFormatter");
        createMessageFormatterMethod.setAccessible(true);
        java.lang.Object[] createMessageFormatterMethodArguments = new java.lang.Object[0];
        try {
            createMessageFormatterMethod.invoke(compiler, createMessageFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#createMessageFormatter()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#shouldColorizeErrorOutput()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorFormat#toFormatter(com.google.javascript.jscomp.SourceExcerptProvider,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.errorFormat.toFormatter(this, colorize);
 *  */
    @Test
    public void testCreateMessageFormatter_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.createMessageFormatter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:219) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method createMessageFormatterMethod = compilerClazz.getDeclaredMethod("createMessageFormatter");
        createMessageFormatterMethod.setAccessible(true);
        java.lang.Object[] createMessageFormatterMethodArguments = new java.lang.Object[0];
        try {
            createMessageFormatterMethod.invoke(compiler, createMessageFormatterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.hasRegExpGlobalReferences
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasRegExpGlobalReferences()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#hasRegExpGlobalReferences()}
 * @utbot.returnsFrom {@code return hasRegExpGlobalReferences;}
 *  */
    @Test
    public void testHasRegExpGlobalReferences_ReturnHasRegExpGlobalReferences() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        boolean actual = compiler.hasRegExpGlobalReferences();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getAllInputsFromModules
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllInputsFromModules(java.util.List)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getAllInputsFromModules(java.util.List)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList()}
 * @utbot.invokes {@link com.google.common.collect.Maps#newHashMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSModule module: modules)
 *  */
    @Test
    public void testGetAllInputsFromModules_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getAllInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:424) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class listType = Class.forName("java.util.List");
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules", listType);
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[1];
        getAllInputsFromModulesMethodArguments[0] = ((Object) null);
        try {
            getAllInputsFromModulesMethod.invoke(null, getAllInputsFromModulesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getAllInputsFromModules(java.util.List)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.Compiler}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getAllInputsFromModules(java.util.List)}
     */
    @Test
    public void testGetAllInputsFromModules() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        List list = emptyList();
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class listType = Class.forName("java.util.List");
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules", listType);
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[1];
        getAllInputsFromModulesMethodArguments[0] = list;
        ArrayList actual = ((ArrayList) getAllInputsFromModulesMethod.invoke(null, getAllInputsFromModulesMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getGlobalVarReferences
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGlobalVarReferences()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getGlobalVarReferences()}
 * @utbot.returnsFrom {@code return globalRefMap;}
 *  */
    @Test
    public void testGetGlobalVarReferences_ReturnGlobalRefMap() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        ReferenceCollectingCallback.ReferenceMap actual = compiler.getGlobalVarReferences();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.updateGlobalVarReferences
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateGlobalVarReferences(java.util.Map, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#updateGlobalVarReferences(java.util.Map,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(collectionRoot.getType() == Token.SCRIPT || collectionRoot.getType() == Token.BLOCK);
 *  */
    @Test
    public void testUpdateGlobalVarReferences_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.updateGlobalVarReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.updateGlobalVarReferences(Compiler.java:1998) */
        compiler.updateGlobalVarReferences(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method updateGlobalVarReferences(java.util.Map, com.google.javascript.rhino.Node)
    
    @Test
    public void testUpdateGlobalVarReferences1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        GlobalVarReferenceMap globalRefMap = ((GlobalVarReferenceMap) createInstance("com.google.javascript.jscomp.GlobalVarReferenceMap"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "globalRefMap", globalRefMap);
        Node node = new Node(132);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.updateGlobalVarReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.GlobalVarReferenceMap.resetGlobalVarReferences(GlobalVarReferenceMap.java:78)
            com.google.javascript.jscomp.GlobalVarReferenceMap.updateGlobalVarReferences(GlobalVarReferenceMap.java:100)
            com.google.javascript.jscomp.Compiler.updateGlobalVarReferences(Compiler.java:2003) */
        compiler.updateGlobalVarReferences(null, node);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateGlobalVarReferences(java.util.Map, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testUpdateGlobalVarReferences2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Node node = new Node(0);
        
        compiler.updateGlobalVarReferences(null, node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.isTypeCheckingEnabled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTypeCheckingEnabled()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isTypeCheckingEnabled()}
 * @utbot.returnsFrom {@code return options.checkTypes;}
 *  */
    @Test
    public void testIsTypeCheckingEnabled_ReturnOptionsCheckTypes() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        boolean actual = compiler.isTypeCheckingEnabled();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isTypeCheckingEnabled()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isTypeCheckingEnabled()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.checkTypes;
 *  */
    @Test
    public void testIsTypeCheckingEnabled_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.isTypeCheckingEnabled] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.isTypeCheckingEnabled(Compiler.java:1721) */
        compiler.isTypeCheckingEnabled();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (module == null): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inputs.isEmpty()
 *  */
    @Test
    public void testGetNodeForCodeInsertion_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1851) */
        compiler.getNodeForCodeInsertion(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)
    
    @Test
    public void testGetNodeForCodeInsertion1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1859) */
        compiler.getNodeForCodeInsertion(jSModule);
    }
    
    @Test
    public void testGetNodeForCodeInsertion2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList inputs = new ArrayList();
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputs", inputs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1855) */
        compiler.getNodeForCodeInsertion(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.isInliningForbidden
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInliningForbidden()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isInliningForbidden()}
 * @utbot.returnsFrom {@code return options.propertyRenaming == PropertyRenamingPolicy.HEURISTIC || options.propertyRenaming == PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;}
 *  */
    @Test
    public void testIsInliningForbidden_OptionsPropertyRenamingEqualsPropertyRenamingPolicyHEURISTICOrOptionsPropertyRenamingEqualsPropertyRenamingPolicyAGGRESSIVE_HEURISTIC() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        PropertyRenamingPolicy propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
        options.propertyRenaming = propertyRenaming;
        compiler.options = options;
        
        boolean actual = compiler.isInliningForbidden();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isInliningForbidden()}
 * @utbot.returnsFrom {@code return options.propertyRenaming == PropertyRenamingPolicy.HEURISTIC || options.propertyRenaming == PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;}
 *  */
    @Test
    public void testIsInliningForbidden_OptionsPropertyRenamingEqualsPropertyRenamingPolicyHEURISTICOrOptionsPropertyRenamingEqualsPropertyRenamingPolicyAGGRESSIVE_HEURISTIC_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        PropertyRenamingPolicy propertyRenaming = PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
        options.propertyRenaming = propertyRenaming;
        compiler.options = options;
        
        boolean actual = compiler.isInliningForbidden();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isInliningForbidden()}
 * @utbot.returnsFrom {@code return options.propertyRenaming == PropertyRenamingPolicy.HEURISTIC || options.propertyRenaming == PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;}
 *  */
    @Test
    public void testIsInliningForbidden_OptionsPropertyRenamingNotEqualsPropertyRenamingPolicyHEURISTICOrOptionsPropertyRenamingNotEqualsPropertyRenamingPolicyAGGRESSIVE_HEURISTIC() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        boolean actual = compiler.isInliningForbidden();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInliningForbidden()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isInliningForbidden()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.propertyRenaming == PropertyRenamingPolicy.HEURISTIC || options.propertyRenaming == PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
 *  */
    @Test
    public void testIsInliningForbidden_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.isInliningForbidden] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.isInliningForbidden(Compiler.java:1594) */
        compiler.isInliningForbidden();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.setHasRegExpGlobalReferences
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setHasRegExpGlobalReferences(boolean)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setHasRegExpGlobalReferences(boolean)}
 *  */
    @Test
    public void testSetHasRegExpGlobalReferences() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.setHasRegExpGlobalReferences(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.removeTryCatchFinally
    
    ///region OTHER: ERROR SUITE for method removeTryCatchFinally()
    
    @Test
    public void testRemoveTryCatchFinally1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.removeTryCatchFinally] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837)
            com.google.javascript.jscomp.Compiler.removeTryCatchFinally(Compiler.java:789) */
        compiler.removeTryCatchFinally();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.createPassConfigInternal
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createPassConfigInternal()
    
    @Test
    public void testCreatePassConfigInternal1() throws Exception  {
    /* This block of code is 1393 lines long and could lead to compilation error
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        DefaultPassConfig actual = ((DefaultPassConfig) compiler.createPassConfigInternal());
        
        DefaultPassConfig expected = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator", crossModuleIdGenerator);
        DefaultPassConfig.HotSwapPassFactory suspiciousCode = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$1"));
        setField(suspiciousCode, "com.google.javascript.jscomp.DefaultPassConfig$1", "this$0", expected);
        String name = "suspiciousCode";
        setField(suspiciousCode, "com.google.javascript.jscomp.PassFactory", "name", name);
        setField(suspiciousCode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "suspiciousCode", suspiciousCode);
        DefaultPassConfig.HotSwapPassFactory checkControlStructures = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$2"));
        setField(checkControlStructures, "com.google.javascript.jscomp.DefaultPassConfig$2", "this$0", expected);
        String name1 = "checkControlStructures";
        setField(checkControlStructures, "com.google.javascript.jscomp.PassFactory", "name", name1);
        setField(checkControlStructures, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures", checkControlStructures);
        DefaultPassConfig.HotSwapPassFactory checkRequires = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$3"));
        setField(checkRequires, "com.google.javascript.jscomp.DefaultPassConfig$3", "this$0", expected);
        String name2 = "checkRequires";
        setField(checkRequires, "com.google.javascript.jscomp.PassFactory", "name", name2);
        setField(checkRequires, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires", checkRequires);
        DefaultPassConfig.HotSwapPassFactory checkProvides = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$4"));
        setField(checkProvides, "com.google.javascript.jscomp.DefaultPassConfig$4", "this$0", expected);
        String name3 = "checkProvides";
        setField(checkProvides, "com.google.javascript.jscomp.PassFactory", "name", name3);
        setField(checkProvides, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides", checkProvides);
        PassFactory generateExports = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$5"));
        setField(generateExports, "com.google.javascript.jscomp.DefaultPassConfig$5", "this$0", expected);
        String name4 = "generateExports";
        setField(generateExports, "com.google.javascript.jscomp.PassFactory", "name", name4);
        setField(generateExports, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "generateExports", generateExports);
        PassFactory exportTestFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$6"));
        setField(exportTestFunctions, "com.google.javascript.jscomp.DefaultPassConfig$6", "this$0", expected);
        String name5 = "exportTestFunctions";
        setField(exportTestFunctions, "com.google.javascript.jscomp.PassFactory", "name", name5);
        setField(exportTestFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "exportTestFunctions", exportTestFunctions);
        PassFactory gatherRawExports = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$7"));
        setField(gatherRawExports, "com.google.javascript.jscomp.DefaultPassConfig$7", "this$0", expected);
        String name6 = "gatherRawExports";
        setField(gatherRawExports, "com.google.javascript.jscomp.PassFactory", "name", name6);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "gatherRawExports", gatherRawExports);
        DefaultPassConfig.HotSwapPassFactory closurePrimitives = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$8"));
        setField(closurePrimitives, "com.google.javascript.jscomp.DefaultPassConfig$8", "this$0", expected);
        String name7 = "processProvidesAndRequires";
        setField(closurePrimitives, "com.google.javascript.jscomp.PassFactory", "name", name7);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closurePrimitives", closurePrimitives);
        PassFactory replaceMessages = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$9"));
        setField(replaceMessages, "com.google.javascript.jscomp.DefaultPassConfig$9", "this$0", expected);
        String name8 = "replaceMessages";
        setField(replaceMessages, "com.google.javascript.jscomp.PassFactory", "name", name8);
        setField(replaceMessages, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceMessages", replaceMessages);
        DefaultPassConfig.HotSwapPassFactory closureGoogScopeAliases = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$10"));
        setField(closureGoogScopeAliases, "com.google.javascript.jscomp.DefaultPassConfig$10", "this$0", expected);
        String name9 = "processGoogScopeAliases";
        setField(closureGoogScopeAliases, "com.google.javascript.jscomp.PassFactory", "name", name9);
        setField(closureGoogScopeAliases, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureGoogScopeAliases", closureGoogScopeAliases);
        PassFactory closureCheckGetCssName = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$11"));
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.DefaultPassConfig$11", "this$0", expected);
        String name10 = "checkMissingGetCssName";
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.PassFactory", "name", name10);
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName", closureCheckGetCssName);
        PassFactory closureReplaceGetCssName = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$12"));
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.DefaultPassConfig$12", "this$0", expected);
        String name11 = "renameCssNames";
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.PassFactory", "name", name11);
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName", closureReplaceGetCssName);
        PassFactory createSyntheticBlocks = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$13"));
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.DefaultPassConfig$13", "this$0", expected);
        String name12 = "createSyntheticBlocks";
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.PassFactory", "name", name12);
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks", createSyntheticBlocks);
        PassFactory peepholeOptimizations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$14"));
        setField(peepholeOptimizations, "com.google.javascript.jscomp.DefaultPassConfig$14", "this$0", expected);
        String name13 = "peepholeOptimizations";
        setField(peepholeOptimizations, "com.google.javascript.jscomp.PassFactory", "name", name13);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "peepholeOptimizations", peepholeOptimizations);
        PassFactory latePeepholeOptimizations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$15"));
        setField(latePeepholeOptimizations, "com.google.javascript.jscomp.DefaultPassConfig$15", "this$0", expected);
        setField(latePeepholeOptimizations, "com.google.javascript.jscomp.PassFactory", "name", name13);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "latePeepholeOptimizations", latePeepholeOptimizations);
        DefaultPassConfig.HotSwapPassFactory checkVars = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$16"));
        setField(checkVars, "com.google.javascript.jscomp.DefaultPassConfig$16", "this$0", expected);
        String name14 = "checkVars";
        setField(checkVars, "com.google.javascript.jscomp.PassFactory", "name", name14);
        setField(checkVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars", checkVars);
        PassFactory checkRegExp = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$17"));
        setField(checkRegExp, "com.google.javascript.jscomp.DefaultPassConfig$17", "this$0", expected);
        String name15 = "checkRegExp";
        setField(checkRegExp, "com.google.javascript.jscomp.PassFactory", "name", name15);
        setField(checkRegExp, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRegExp", checkRegExp);
        PassFactory checkShadowVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$18"));
        setField(checkShadowVars, "com.google.javascript.jscomp.DefaultPassConfig$18", "this$0", expected);
        String name16 = "variableShadowDeclarationCheck";
        setField(checkShadowVars, "com.google.javascript.jscomp.PassFactory", "name", name16);
        setField(checkShadowVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars", checkShadowVars);
        DefaultPassConfig.HotSwapPassFactory checkVariableReferences = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$19"));
        setField(checkVariableReferences, "com.google.javascript.jscomp.DefaultPassConfig$19", "this$0", expected);
        String name17 = "checkVariableReferences";
        setField(checkVariableReferences, "com.google.javascript.jscomp.PassFactory", "name", name17);
        setField(checkVariableReferences, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences", checkVariableReferences);
        PassFactory objectPropertyStringPreprocess = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$20"));
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.DefaultPassConfig$20", "this$0", expected);
        String name18 = "ObjectPropertyStringPreprocess";
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.PassFactory", "name", name18);
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess", objectPropertyStringPreprocess);
        DefaultPassConfig.HotSwapPassFactory resolveTypes = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$21"));
        setField(resolveTypes, "com.google.javascript.jscomp.DefaultPassConfig$21", "this$0", expected);
        String name19 = "resolveTypes";
        setField(resolveTypes, "com.google.javascript.jscomp.PassFactory", "name", name19);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "resolveTypes", resolveTypes);
        DefaultPassConfig.HotSwapPassFactory inferTypes = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$22"));
        setField(inferTypes, "com.google.javascript.jscomp.DefaultPassConfig$22", "this$0", expected);
        String name20 = "inferTypes";
        setField(inferTypes, "com.google.javascript.jscomp.PassFactory", "name", name20);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes", inferTypes);
        DefaultPassConfig.HotSwapPassFactory inferJsDocInfo = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$23"));
        setField(inferJsDocInfo, "com.google.javascript.jscomp.DefaultPassConfig$23", "this$0", expected);
        String name21 = "inferJsDocInfo";
        setField(inferJsDocInfo, "com.google.javascript.jscomp.PassFactory", "name", name21);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inferJsDocInfo", inferJsDocInfo);
        DefaultPassConfig.HotSwapPassFactory checkTypes = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$24"));
        setField(checkTypes, "com.google.javascript.jscomp.DefaultPassConfig$24", "this$0", expected);
        String name22 = "checkTypes";
        setField(checkTypes, "com.google.javascript.jscomp.PassFactory", "name", name22);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes", checkTypes);
        DefaultPassConfig.HotSwapPassFactory checkControlFlow = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$25"));
        setField(checkControlFlow, "com.google.javascript.jscomp.DefaultPassConfig$25", "this$0", expected);
        String name23 = "checkControlFlow";
        setField(checkControlFlow, "com.google.javascript.jscomp.PassFactory", "name", name23);
        setField(checkControlFlow, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow", checkControlFlow);
        DefaultPassConfig.HotSwapPassFactory checkAccessControls = ((DefaultPassConfig.HotSwapPassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$26"));
        setField(checkAccessControls, "com.google.javascript.jscomp.DefaultPassConfig$26", "this$0", expected);
        String name24 = "checkAccessControls";
        setField(checkAccessControls, "com.google.javascript.jscomp.PassFactory", "name", name24);
        setField(checkAccessControls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls", checkAccessControls);
        PassFactory checkGlobalNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$27"));
        setField(checkGlobalNames, "com.google.javascript.jscomp.DefaultPassConfig$27", "this$0", expected);
        String name25 = "Check names";
        setField(checkGlobalNames, "com.google.javascript.jscomp.PassFactory", "name", name25);
        setField(checkGlobalNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames", checkGlobalNames);
        PassFactory checkStrictMode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$28"));
        setField(checkStrictMode, "com.google.javascript.jscomp.DefaultPassConfig$28", "this$0", expected);
        String name26 = "checkStrictMode";
        setField(checkStrictMode, "com.google.javascript.jscomp.PassFactory", "name", name26);
        setField(checkStrictMode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode", checkStrictMode);
        PassFactory processTweaks = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$29"));
        setField(processTweaks, "com.google.javascript.jscomp.DefaultPassConfig$29", "this$0", expected);
        String name27 = "processTweaks";
        setField(processTweaks, "com.google.javascript.jscomp.PassFactory", "name", name27);
        setField(processTweaks, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "processTweaks", processTweaks);
        PassFactory processDefines = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$30"));
        setField(processDefines, "com.google.javascript.jscomp.DefaultPassConfig$30", "this$0", expected);
        String name28 = "processDefines";
        setField(processDefines, "com.google.javascript.jscomp.PassFactory", "name", name28);
        setField(processDefines, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "processDefines", processDefines);
        PassFactory checkConsts = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$31"));
        setField(checkConsts, "com.google.javascript.jscomp.DefaultPassConfig$31", "this$0", expected);
        String name29 = "checkConsts";
        setField(checkConsts, "com.google.javascript.jscomp.PassFactory", "name", name29);
        setField(checkConsts, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts", checkConsts);
        PassFactory computeFunctionNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$32"));
        setField(computeFunctionNames, "com.google.javascript.jscomp.DefaultPassConfig$32", "this$0", expected);
        String name30 = "computeFunctionNames";
        setField(computeFunctionNames, "com.google.javascript.jscomp.PassFactory", "name", name30);
        setField(computeFunctionNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames", computeFunctionNames);
        PassFactory ignoreCajaProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$33"));
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.DefaultPassConfig$33", "this$0", expected);
        String name31 = "ignoreCajaProperties";
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.PassFactory", "name", name31);
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties", ignoreCajaProperties);
        PassFactory runtimeTypeCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$34"));
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.DefaultPassConfig$34", "this$0", expected);
        String name32 = "runtimeTypeCheck";
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.PassFactory", "name", name32);
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck", runtimeTypeCheck);
        PassFactory replaceIdGenerators = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$35"));
        setField(replaceIdGenerators, "com.google.javascript.jscomp.DefaultPassConfig$35", "this$0", expected);
        String name33 = "replaceIdGenerators";
        setField(replaceIdGenerators, "com.google.javascript.jscomp.PassFactory", "name", name33);
        setField(replaceIdGenerators, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators", replaceIdGenerators);
        PassFactory replaceStrings = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$36"));
        setField(replaceStrings, "com.google.javascript.jscomp.DefaultPassConfig$36", "this$0", expected);
        String name34 = "replaceStrings";
        setField(replaceStrings, "com.google.javascript.jscomp.PassFactory", "name", name34);
        setField(replaceStrings, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceStrings", replaceStrings);
        PassFactory optimizeArgumentsArray = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$37"));
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.DefaultPassConfig$37", "this$0", expected);
        String name35 = "optimizeArgumentsArray";
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.PassFactory", "name", name35);
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray", optimizeArgumentsArray);
        PassFactory closureCodeRemoval = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$38"));
        setField(closureCodeRemoval, "com.google.javascript.jscomp.DefaultPassConfig$38", "this$0", expected);
        String name36 = "closureCodeRemoval";
        setField(closureCodeRemoval, "com.google.javascript.jscomp.PassFactory", "name", name36);
        setField(closureCodeRemoval, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCodeRemoval", closureCodeRemoval);
        PassFactory closureOptimizePrimitives = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$39"));
        setField(closureOptimizePrimitives, "com.google.javascript.jscomp.DefaultPassConfig$39", "this$0", expected);
        String name37 = "closureOptimizePrimitives";
        setField(closureOptimizePrimitives, "com.google.javascript.jscomp.PassFactory", "name", name37);
        setField(closureOptimizePrimitives, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureOptimizePrimitives", closureOptimizePrimitives);
        PassFactory collapseProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$40"));
        setField(collapseProperties, "com.google.javascript.jscomp.DefaultPassConfig$40", "this$0", expected);
        String name38 = "collapseProperties";
        setField(collapseProperties, "com.google.javascript.jscomp.PassFactory", "name", name38);
        setField(collapseProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties", collapseProperties);
        PassFactory collapseObjectLiterals = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$41"));
        setField(collapseObjectLiterals, "com.google.javascript.jscomp.DefaultPassConfig$41", "this$0", expected);
        String name39 = "collapseObjectLiterals";
        setField(collapseObjectLiterals, "com.google.javascript.jscomp.PassFactory", "name", name39);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseObjectLiterals", collapseObjectLiterals);
        PassFactory tightenTypesBuilder = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$42"));
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.DefaultPassConfig$42", "this$0", expected);
        String name40 = "tightenTypes";
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.PassFactory", "name", name40);
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder", tightenTypesBuilder);
        PassFactory disambiguateProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$43"));
        setField(disambiguateProperties, "com.google.javascript.jscomp.DefaultPassConfig$43", "this$0", expected);
        String name41 = "disambiguateProperties";
        setField(disambiguateProperties, "com.google.javascript.jscomp.PassFactory", "name", name41);
        setField(disambiguateProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties", disambiguateProperties);
        PassFactory chainCalls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$44"));
        setField(chainCalls, "com.google.javascript.jscomp.DefaultPassConfig$44", "this$0", expected);
        String name42 = "chainCalls";
        setField(chainCalls, "com.google.javascript.jscomp.PassFactory", "name", name42);
        setField(chainCalls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls", chainCalls);
        PassFactory devirtualizePrototypeMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$45"));
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.DefaultPassConfig$45", "this$0", expected);
        String name43 = "devirtualizePrototypeMethods";
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.PassFactory", "name", name43);
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods", devirtualizePrototypeMethods);
        PassFactory optimizeCallsAndRemoveUnusedVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$46"));
        setField(optimizeCallsAndRemoveUnusedVars, "com.google.javascript.jscomp.DefaultPassConfig$46", "this$0", expected);
        String name44 = "optimizeCalls_and_removeUnusedVars";
        setField(optimizeCallsAndRemoveUnusedVars, "com.google.javascript.jscomp.PassFactory", "name", name44);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeCallsAndRemoveUnusedVars", optimizeCallsAndRemoveUnusedVars);
        PassFactory markPureFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$47"));
        setField(markPureFunctions, "com.google.javascript.jscomp.DefaultPassConfig$47", "this$0", expected);
        String name45 = "markPureFunctions";
        setField(markPureFunctions, "com.google.javascript.jscomp.PassFactory", "name", name45);
        setField(markPureFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions", markPureFunctions);
        PassFactory markNoSideEffectCalls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$48"));
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.DefaultPassConfig$48", "this$0", expected);
        String name46 = "markNoSideEffectCalls";
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.PassFactory", "name", name46);
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls", markNoSideEffectCalls);
        PassFactory inlineVariables = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$49"));
        setField(inlineVariables, "com.google.javascript.jscomp.DefaultPassConfig$49", "this$0", expected);
        String name47 = "inlineVariables";
        setField(inlineVariables, "com.google.javascript.jscomp.PassFactory", "name", name47);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables", inlineVariables);
        PassFactory inlineConstants = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$50"));
        setField(inlineConstants, "com.google.javascript.jscomp.DefaultPassConfig$50", "this$0", expected);
        String name48 = "inlineConstants";
        setField(inlineConstants, "com.google.javascript.jscomp.PassFactory", "name", name48);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants", inlineConstants);
        PassFactory minimizeExitPoints = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$51"));
        setField(minimizeExitPoints, "com.google.javascript.jscomp.DefaultPassConfig$51", "this$0", expected);
        String name49 = "minimizeExitPoints";
        setField(minimizeExitPoints, "com.google.javascript.jscomp.PassFactory", "name", name49);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints", minimizeExitPoints);
        PassFactory removeUnreachableCode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$52"));
        setField(removeUnreachableCode, "com.google.javascript.jscomp.DefaultPassConfig$52", "this$0", expected);
        String name50 = "removeUnreachableCode";
        setField(removeUnreachableCode, "com.google.javascript.jscomp.PassFactory", "name", name50);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode", removeUnreachableCode);
        PassFactory removeUnusedPrototypeProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$53"));
        setField(removeUnusedPrototypeProperties, "com.google.javascript.jscomp.DefaultPassConfig$53", "this$0", expected);
        String name51 = "removeUnusedPrototypeProperties";
        setField(removeUnusedPrototypeProperties, "com.google.javascript.jscomp.PassFactory", "name", name51);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties", removeUnusedPrototypeProperties);
        PassFactory smartNamePass = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$54"));
        setField(smartNamePass, "com.google.javascript.jscomp.DefaultPassConfig$54", "this$0", expected);
        String name52 = "smartNamePass";
        setField(smartNamePass, "com.google.javascript.jscomp.PassFactory", "name", name52);
        setField(smartNamePass, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass", smartNamePass);
        PassFactory smartNamePass2 = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$55"));
        setField(smartNamePass2, "com.google.javascript.jscomp.DefaultPassConfig$55", "this$0", expected);
        setField(smartNamePass2, "com.google.javascript.jscomp.PassFactory", "name", name52);
        setField(smartNamePass2, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass2", smartNamePass2);
        PassFactory inlineSimpleMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$56"));
        setField(inlineSimpleMethods, "com.google.javascript.jscomp.DefaultPassConfig$56", "this$0", expected);
        String name53 = "inlineSimpleMethods";
        setField(inlineSimpleMethods, "com.google.javascript.jscomp.PassFactory", "name", name53);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineSimpleMethods", inlineSimpleMethods);
        PassFactory deadAssignmentsElimination = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$57"));
        setField(deadAssignmentsElimination, "com.google.javascript.jscomp.DefaultPassConfig$57", "this$0", expected);
        String name54 = "deadAssignmentsElimination";
        setField(deadAssignmentsElimination, "com.google.javascript.jscomp.PassFactory", "name", name54);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination", deadAssignmentsElimination);
        PassFactory inlineFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$58"));
        setField(inlineFunctions, "com.google.javascript.jscomp.DefaultPassConfig$58", "this$0", expected);
        String name55 = "inlineFunctions";
        setField(inlineFunctions, "com.google.javascript.jscomp.PassFactory", "name", name55);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions", inlineFunctions);
        PassFactory removeUnusedVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$59"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.DefaultPassConfig$59", "this$0", expected);
        String name56 = "removeUnusedVars";
        setField(removeUnusedVars, "com.google.javascript.jscomp.PassFactory", "name", name56);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars", removeUnusedVars);
        PassFactory crossModuleCodeMotion = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$60"));
        setField(crossModuleCodeMotion, "com.google.javascript.jscomp.DefaultPassConfig$60", "this$0", expected);
        String name57 = "crossModuleCodeMotion";
        setField(crossModuleCodeMotion, "com.google.javascript.jscomp.PassFactory", "name", name57);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion", crossModuleCodeMotion);
        PassFactory crossModuleMethodMotion = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$61"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.DefaultPassConfig$61", "this$0", expected);
        String name58 = "crossModuleMethodMotion";
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.PassFactory", "name", name58);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion", crossModuleMethodMotion);
        PassFactory specializeInitialModule = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$62"));
        setField(specializeInitialModule, "com.google.javascript.jscomp.DefaultPassConfig$62", "this$0", expected);
        String name59 = "specializeInitialModule";
        setField(specializeInitialModule, "com.google.javascript.jscomp.PassFactory", "name", name59);
        setField(specializeInitialModule, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "specializeInitialModule", specializeInitialModule);
        PassFactory flowSensitiveInlineVariables = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$63"));
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.DefaultPassConfig$63", "this$0", expected);
        String name60 = "flowSensitiveInlineVariables";
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.PassFactory", "name", name60);
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables", flowSensitiveInlineVariables);
        PassFactory coalesceVariableNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$64"));
        setField(coalesceVariableNames, "com.google.javascript.jscomp.DefaultPassConfig$64", "this$0", expected);
        String name61 = "coalesceVariableNames";
        setField(coalesceVariableNames, "com.google.javascript.jscomp.PassFactory", "name", name61);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames", coalesceVariableNames);
        PassFactory exploitAssign = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$65"));
        setField(exploitAssign, "com.google.javascript.jscomp.DefaultPassConfig$65", "this$0", expected);
        String name62 = "expointAssign";
        setField(exploitAssign, "com.google.javascript.jscomp.PassFactory", "name", name62);
        setField(exploitAssign, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "exploitAssign", exploitAssign);
        PassFactory collapseVariableDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$66"));
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$66", "this$0", expected);
        String name63 = "collapseVariableDeclarations";
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name63);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations", collapseVariableDeclarations);
        PassFactory groupVariableDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$67"));
        setField(groupVariableDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$67", "this$0", expected);
        String name64 = "groupVariableDeclarations";
        setField(groupVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name64);
        setField(groupVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "groupVariableDeclarations", groupVariableDeclarations);
        PassFactory extractPrototypeMemberDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$68"));
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$68", "this$0", expected);
        String name65 = "extractPrototypeMemberDeclarations";
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name65);
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations", extractPrototypeMemberDeclarations);
        PassFactory rewriteFunctionExpressions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$69"));
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.DefaultPassConfig$69", "this$0", expected);
        String name66 = "rewriteFunctionExpressions";
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.PassFactory", "name", name66);
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions", rewriteFunctionExpressions);
        PassFactory collapseAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$70"));
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$70", "this$0", expected);
        String name67 = "collapseAnonymousFunctions";
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name67);
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions", collapseAnonymousFunctions);
        PassFactory moveFunctionDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$71"));
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$71", "this$0", expected);
        String name68 = "moveFunctionDeclarations";
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name68);
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations", moveFunctionDeclarations);
        PassFactory nameUnmappedAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$72"));
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$72", "this$0", expected);
        String name69 = "nameAnonymousFunctions";
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name69);
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions", nameUnmappedAnonymousFunctions);
        PassFactory nameMappedAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$73"));
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$73", "this$0", expected);
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name69);
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions", nameMappedAnonymousFunctions);
        PassFactory operaCompoundAssignFix = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$74"));
        setField(operaCompoundAssignFix, "com.google.javascript.jscomp.DefaultPassConfig$74", "this$0", expected);
        String name70 = "operaCompoundAssignFix";
        setField(operaCompoundAssignFix, "com.google.javascript.jscomp.PassFactory", "name", name70);
        setField(operaCompoundAssignFix, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "operaCompoundAssignFix", operaCompoundAssignFix);
        PassFactory aliasExternals = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$75"));
        setField(aliasExternals, "com.google.javascript.jscomp.DefaultPassConfig$75", "this$0", expected);
        String name71 = "aliasExternals";
        setField(aliasExternals, "com.google.javascript.jscomp.PassFactory", "name", name71);
        setField(aliasExternals, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals", aliasExternals);
        PassFactory aliasStrings = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$76"));
        setField(aliasStrings, "com.google.javascript.jscomp.DefaultPassConfig$76", "this$0", expected);
        String name72 = "aliasStrings";
        setField(aliasStrings, "com.google.javascript.jscomp.PassFactory", "name", name72);
        setField(aliasStrings, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings", aliasStrings);
        PassFactory aliasKeywords = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$77"));
        setField(aliasKeywords, "com.google.javascript.jscomp.DefaultPassConfig$77", "this$0", expected);
        String name73 = "aliasKeywords";
        setField(aliasKeywords, "com.google.javascript.jscomp.PassFactory", "name", name73);
        setField(aliasKeywords, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords", aliasKeywords);
        PassFactory objectPropertyStringPostprocess = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$78"));
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.DefaultPassConfig$78", "this$0", expected);
        String name74 = "ObjectPropertyStringPostprocess";
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.PassFactory", "name", name74);
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess", objectPropertyStringPostprocess);
        PassFactory ambiguateProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$79"));
        setField(ambiguateProperties, "com.google.javascript.jscomp.DefaultPassConfig$79", "this$0", expected);
        String name75 = "ambiguateProperties";
        setField(ambiguateProperties, "com.google.javascript.jscomp.PassFactory", "name", name75);
        setField(ambiguateProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties", ambiguateProperties);
        PassFactory markUnnormalized = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$80"));
        setField(markUnnormalized, "com.google.javascript.jscomp.DefaultPassConfig$80", "this$0", expected);
        String name76 = "markUnnormalized";
        setField(markUnnormalized, "com.google.javascript.jscomp.PassFactory", "name", name76);
        setField(markUnnormalized, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markUnnormalized", markUnnormalized);
        PassFactory denormalize = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$81"));
        setField(denormalize, "com.google.javascript.jscomp.DefaultPassConfig$81", "this$0", expected);
        String name77 = "denormalize";
        setField(denormalize, "com.google.javascript.jscomp.PassFactory", "name", name77);
        setField(denormalize, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize", denormalize);
        PassFactory invertContextualRenaming = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$82"));
        setField(invertContextualRenaming, "com.google.javascript.jscomp.DefaultPassConfig$82", "this$0", expected);
        String name78 = "invertNames";
        setField(invertContextualRenaming, "com.google.javascript.jscomp.PassFactory", "name", name78);
        setField(invertContextualRenaming, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming", invertContextualRenaming);
        PassFactory renameProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$83"));
        setField(renameProperties, "com.google.javascript.jscomp.DefaultPassConfig$83", "this$0", expected);
        String name79 = "renameProperties";
        setField(renameProperties, "com.google.javascript.jscomp.PassFactory", "name", name79);
        setField(renameProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties", renameProperties);
        PassFactory renameVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$84"));
        setField(renameVars, "com.google.javascript.jscomp.DefaultPassConfig$84", "this$0", expected);
        String name80 = "renameVars";
        setField(renameVars, "com.google.javascript.jscomp.PassFactory", "name", name80);
        setField(renameVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars", renameVars);
        PassFactory renameLabels = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$85"));
        setField(renameLabels, "com.google.javascript.jscomp.DefaultPassConfig$85", "this$0", expected);
        String name81 = "renameLabels";
        setField(renameLabels, "com.google.javascript.jscomp.PassFactory", "name", name81);
        setField(renameLabels, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels", renameLabels);
        PassFactory convertToDottedProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$86"));
        setField(convertToDottedProperties, "com.google.javascript.jscomp.DefaultPassConfig$86", "this$0", expected);
        String name82 = "convertToDottedProperties";
        setField(convertToDottedProperties, "com.google.javascript.jscomp.PassFactory", "name", name82);
        setField(convertToDottedProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties", convertToDottedProperties);
        PassFactory sanityCheckAst = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$87"));
        setField(sanityCheckAst, "com.google.javascript.jscomp.DefaultPassConfig$87", "this$0", expected);
        String name83 = "sanityCheckAst";
        setField(sanityCheckAst, "com.google.javascript.jscomp.PassFactory", "name", name83);
        setField(sanityCheckAst, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckAst", sanityCheckAst);
        PassFactory sanityCheckVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$88"));
        setField(sanityCheckVars, "com.google.javascript.jscomp.DefaultPassConfig$88", "this$0", expected);
        String name84 = "sanityCheckVars";
        setField(sanityCheckVars, "com.google.javascript.jscomp.PassFactory", "name", name84);
        setField(sanityCheckVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars", sanityCheckVars);
        PassFactory instrumentFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$89"));
        setField(instrumentFunctions, "com.google.javascript.jscomp.DefaultPassConfig$89", "this$0", expected);
        String name85 = "instrumentFunctions";
        setField(instrumentFunctions, "com.google.javascript.jscomp.PassFactory", "name", name85);
        setField(instrumentFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions", instrumentFunctions);
        PassFactory printNameReferenceGraph = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$93"));
        setField(printNameReferenceGraph, "com.google.javascript.jscomp.DefaultPassConfig$93", "this$0", expected);
        String name86 = "printNameReferenceGraph";
        setField(printNameReferenceGraph, "com.google.javascript.jscomp.PassFactory", "name", name86);
        setField(printNameReferenceGraph, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceGraph", printNameReferenceGraph);
        PassFactory printNameReferenceReport = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$94"));
        setField(printNameReferenceReport, "com.google.javascript.jscomp.DefaultPassConfig$94", "this$0", expected);
        String name87 = "printNameReferenceReport";
        setField(printNameReferenceReport, "com.google.javascript.jscomp.PassFactory", "name", name87);
        setField(printNameReferenceReport, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceReport", printNameReferenceReport);
        
        GlobalNamespace actualNamespaceForChecks = ((GlobalNamespace) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "namespaceForChecks"));
        assertNull(actualNamespaceForChecks);
        
        TightenTypes actualTightenTypes = ((TightenTypes) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypes"));
        assertNull(actualTightenTypes);
        
        Set actualExportedNames = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exportedNames"));
        assertNull(actualExportedNames);
        
        CrossModuleMethodMotion.IdGenerator expectedCrossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator"));
        CrossModuleMethodMotion.IdGenerator actualCrossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator"));
        int expectedCrossModuleIdGeneratorCurrentId = ((Integer) getFieldValue(expectedCrossModuleIdGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId"));
        int actualCrossModuleIdGeneratorCurrentId = ((Integer) getFieldValue(actualCrossModuleIdGenerator, "com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator", "currentId"));
        assertEquals(expectedCrossModuleIdGeneratorCurrentId, actualCrossModuleIdGeneratorCurrentId);
        
        Map actualCssNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "cssNames"));
        assertNull(actualCssNames);
        
        VariableMap actualVariableMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "variableMap"));
        assertNull(actualVariableMap);
        
        VariableMap actualPropertyMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "propertyMap"));
        assertNull(actualPropertyMap);
        
        VariableMap actualAnonymousFunctionNameMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "anonymousFunctionNameMap"));
        assertNull(actualAnonymousFunctionNameMap);
        
        FunctionNames actualFunctionNames = ((FunctionNames) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "functionNames"));
        assertNull(actualFunctionNames);
        
        VariableMap actualStringMap = ((VariableMap) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "stringMap"));
        assertNull(actualStringMap);
        
        String actualIdGeneratorMap = ((String) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "idGeneratorMap"));
        assertNull(actualIdGeneratorMap);
        
        DefaultPassConfig.HotSwapPassFactory expectedSuspiciousCode = expected.suspiciousCode;
        DefaultPassConfig.HotSwapPassFactory actualSuspiciousCode = actual.suspiciousCode;
        String expectedSuspiciousCodeName = expectedSuspiciousCode.getName();
        String actualSuspiciousCodeName = actualSuspiciousCode.getName();
        assertEquals(expectedSuspiciousCodeName, actualSuspiciousCodeName);
        
        boolean actualSuspiciousCodeIsOneTimePass = ((Boolean) getFieldValue(actualSuspiciousCode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass"));
        assertTrue(actualSuspiciousCodeIsOneTimePass);
        
        boolean actualSuspiciousCodeIsCreated = ((Boolean) getFieldValue(actualSuspiciousCode, "com.google.javascript.jscomp.PassFactory", "isCreated"));
        assertFalse(actualSuspiciousCodeIsCreated);
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckControlStructures = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        DefaultPassConfig.HotSwapPassFactory actualCheckControlStructures = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        String expectedCheckControlStructuresName = expectedCheckControlStructures.getName();
        String actualCheckControlStructuresName = actualCheckControlStructures.getName();
        assertEquals(expectedCheckControlStructuresName, actualCheckControlStructuresName);
        
        assertTrue(deepEquals(expectedCheckControlStructures, actualCheckControlStructures));
        assertTrue(deepEquals(expectedCheckControlStructures, actualCheckControlStructures));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckRequires = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        DefaultPassConfig.HotSwapPassFactory actualCheckRequires = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        String expectedCheckRequiresName = expectedCheckRequires.getName();
        String actualCheckRequiresName = actualCheckRequires.getName();
        assertEquals(expectedCheckRequiresName, actualCheckRequiresName);
        
        assertTrue(deepEquals(expectedCheckRequires, actualCheckRequires));
        assertTrue(deepEquals(expectedCheckRequires, actualCheckRequires));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckProvides = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
        DefaultPassConfig.HotSwapPassFactory actualCheckProvides = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
        String expectedCheckProvidesName = expectedCheckProvides.getName();
        String actualCheckProvidesName = actualCheckProvides.getName();
        assertEquals(expectedCheckProvidesName, actualCheckProvidesName);
        
        assertTrue(deepEquals(expectedCheckProvides, actualCheckProvides));
        assertTrue(deepEquals(expectedCheckProvides, actualCheckProvides));
        
        PassFactory expectedGenerateExports = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "generateExports"));
        PassFactory actualGenerateExports = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "generateExports"));
        String expectedGenerateExportsName = expectedGenerateExports.getName();
        String actualGenerateExportsName = actualGenerateExports.getName();
        assertEquals(expectedGenerateExportsName, actualGenerateExportsName);
        
        assertTrue(deepEquals(expectedGenerateExports, actualGenerateExports));
        assertTrue(deepEquals(expectedGenerateExports, actualGenerateExports));
        
        PassFactory expectedExportTestFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "exportTestFunctions"));
        PassFactory actualExportTestFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exportTestFunctions"));
        String expectedExportTestFunctionsName = expectedExportTestFunctions.getName();
        String actualExportTestFunctionsName = actualExportTestFunctions.getName();
        assertEquals(expectedExportTestFunctionsName, actualExportTestFunctionsName);
        
        assertTrue(deepEquals(expectedExportTestFunctions, actualExportTestFunctions));
        assertTrue(deepEquals(expectedExportTestFunctions, actualExportTestFunctions));
        
        PassFactory expectedGatherRawExports = expected.gatherRawExports;
        PassFactory actualGatherRawExports = actual.gatherRawExports;
        String expectedGatherRawExportsName = expectedGatherRawExports.getName();
        String actualGatherRawExportsName = actualGatherRawExports.getName();
        assertEquals(expectedGatherRawExportsName, actualGatherRawExportsName);
        
        boolean actualGatherRawExportsIsOneTimePass = ((Boolean) getFieldValue(actualGatherRawExports, "com.google.javascript.jscomp.PassFactory", "isOneTimePass"));
        assertFalse(actualGatherRawExportsIsOneTimePass);
        
        assertTrue(deepEquals(expectedGatherRawExports, actualGatherRawExports));
        
        DefaultPassConfig.HotSwapPassFactory expectedClosurePrimitives = expected.closurePrimitives;
        DefaultPassConfig.HotSwapPassFactory actualClosurePrimitives = actual.closurePrimitives;
        String expectedClosurePrimitivesName = expectedClosurePrimitives.getName();
        String actualClosurePrimitivesName = actualClosurePrimitives.getName();
        assertEquals(expectedClosurePrimitivesName, actualClosurePrimitivesName);
        
        assertTrue(deepEquals(expectedClosurePrimitives, actualClosurePrimitives));
        assertTrue(deepEquals(expectedClosurePrimitives, actualClosurePrimitives));
        
        PassFactory expectedReplaceMessages = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceMessages"));
        PassFactory actualReplaceMessages = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceMessages"));
        String expectedReplaceMessagesName = expectedReplaceMessages.getName();
        String actualReplaceMessagesName = actualReplaceMessages.getName();
        assertEquals(expectedReplaceMessagesName, actualReplaceMessagesName);
        
        assertTrue(deepEquals(expectedReplaceMessages, actualReplaceMessages));
        assertTrue(deepEquals(expectedReplaceMessages, actualReplaceMessages));
        
        DefaultPassConfig.HotSwapPassFactory expectedClosureGoogScopeAliases = expected.closureGoogScopeAliases;
        DefaultPassConfig.HotSwapPassFactory actualClosureGoogScopeAliases = actual.closureGoogScopeAliases;
        String expectedClosureGoogScopeAliasesName = expectedClosureGoogScopeAliases.getName();
        String actualClosureGoogScopeAliasesName = actualClosureGoogScopeAliases.getName();
        assertEquals(expectedClosureGoogScopeAliasesName, actualClosureGoogScopeAliasesName);
        
        assertTrue(deepEquals(expectedClosureGoogScopeAliases, actualClosureGoogScopeAliases));
        assertTrue(deepEquals(expectedClosureGoogScopeAliases, actualClosureGoogScopeAliases));
        
        PassFactory expectedClosureCheckGetCssName = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName"));
        PassFactory actualClosureCheckGetCssName = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName"));
        String expectedClosureCheckGetCssNameName = expectedClosureCheckGetCssName.getName();
        String actualClosureCheckGetCssNameName = actualClosureCheckGetCssName.getName();
        assertEquals(expectedClosureCheckGetCssNameName, actualClosureCheckGetCssNameName);
        
        assertTrue(deepEquals(expectedClosureCheckGetCssName, actualClosureCheckGetCssName));
        assertTrue(deepEquals(expectedClosureCheckGetCssName, actualClosureCheckGetCssName));
        
        PassFactory expectedClosureReplaceGetCssName = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName"));
        PassFactory actualClosureReplaceGetCssName = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName"));
        String expectedClosureReplaceGetCssNameName = expectedClosureReplaceGetCssName.getName();
        String actualClosureReplaceGetCssNameName = actualClosureReplaceGetCssName.getName();
        assertEquals(expectedClosureReplaceGetCssNameName, actualClosureReplaceGetCssNameName);
        
        assertTrue(deepEquals(expectedClosureReplaceGetCssName, actualClosureReplaceGetCssName));
        assertTrue(deepEquals(expectedClosureReplaceGetCssName, actualClosureReplaceGetCssName));
        
        PassFactory expectedCreateSyntheticBlocks = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks"));
        PassFactory actualCreateSyntheticBlocks = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks"));
        String expectedCreateSyntheticBlocksName = expectedCreateSyntheticBlocks.getName();
        String actualCreateSyntheticBlocksName = actualCreateSyntheticBlocks.getName();
        assertEquals(expectedCreateSyntheticBlocksName, actualCreateSyntheticBlocksName);
        
        assertTrue(deepEquals(expectedCreateSyntheticBlocks, actualCreateSyntheticBlocks));
        assertTrue(deepEquals(expectedCreateSyntheticBlocks, actualCreateSyntheticBlocks));
        
        PassFactory expectedPeepholeOptimizations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "peepholeOptimizations"));
        PassFactory actualPeepholeOptimizations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "peepholeOptimizations"));
        String expectedPeepholeOptimizationsName = expectedPeepholeOptimizations.getName();
        String actualPeepholeOptimizationsName = actualPeepholeOptimizations.getName();
        assertEquals(expectedPeepholeOptimizationsName, actualPeepholeOptimizationsName);
        
        assertTrue(deepEquals(expectedPeepholeOptimizations, actualPeepholeOptimizations));
        assertTrue(deepEquals(expectedPeepholeOptimizations, actualPeepholeOptimizations));
        
        PassFactory expectedLatePeepholeOptimizations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "latePeepholeOptimizations"));
        PassFactory actualLatePeepholeOptimizations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "latePeepholeOptimizations"));
        assertTrue(deepEquals(expectedLatePeepholeOptimizations, actualLatePeepholeOptimizations));
        assertTrue(deepEquals(expectedLatePeepholeOptimizations, actualLatePeepholeOptimizations));
        assertTrue(deepEquals(expectedLatePeepholeOptimizations, actualLatePeepholeOptimizations));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckVars = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        DefaultPassConfig.HotSwapPassFactory actualCheckVars = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        String expectedCheckVarsName = expectedCheckVars.getName();
        String actualCheckVarsName = actualCheckVars.getName();
        assertEquals(expectedCheckVarsName, actualCheckVarsName);
        
        assertTrue(deepEquals(expectedCheckVars, actualCheckVars));
        assertTrue(deepEquals(expectedCheckVars, actualCheckVars));
        
        PassFactory expectedCheckRegExp = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRegExp"));
        PassFactory actualCheckRegExp = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRegExp"));
        String expectedCheckRegExpName = expectedCheckRegExp.getName();
        String actualCheckRegExpName = actualCheckRegExp.getName();
        assertEquals(expectedCheckRegExpName, actualCheckRegExpName);
        
        assertTrue(deepEquals(expectedCheckRegExp, actualCheckRegExp));
        assertTrue(deepEquals(expectedCheckRegExp, actualCheckRegExp));
        
        PassFactory expectedCheckShadowVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        PassFactory actualCheckShadowVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        String expectedCheckShadowVarsName = expectedCheckShadowVars.getName();
        String actualCheckShadowVarsName = actualCheckShadowVars.getName();
        assertEquals(expectedCheckShadowVarsName, actualCheckShadowVarsName);
        
        assertTrue(deepEquals(expectedCheckShadowVars, actualCheckShadowVars));
        assertTrue(deepEquals(expectedCheckShadowVars, actualCheckShadowVars));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckVariableReferences = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
        DefaultPassConfig.HotSwapPassFactory actualCheckVariableReferences = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
        String expectedCheckVariableReferencesName = expectedCheckVariableReferences.getName();
        String actualCheckVariableReferencesName = actualCheckVariableReferences.getName();
        assertEquals(expectedCheckVariableReferencesName, actualCheckVariableReferencesName);
        
        assertTrue(deepEquals(expectedCheckVariableReferences, actualCheckVariableReferences));
        assertTrue(deepEquals(expectedCheckVariableReferences, actualCheckVariableReferences));
        
        PassFactory expectedObjectPropertyStringPreprocess = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess"));
        PassFactory actualObjectPropertyStringPreprocess = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess"));
        String expectedObjectPropertyStringPreprocessName = expectedObjectPropertyStringPreprocess.getName();
        String actualObjectPropertyStringPreprocessName = actualObjectPropertyStringPreprocess.getName();
        assertEquals(expectedObjectPropertyStringPreprocessName, actualObjectPropertyStringPreprocessName);
        
        assertTrue(deepEquals(expectedObjectPropertyStringPreprocess, actualObjectPropertyStringPreprocess));
        assertTrue(deepEquals(expectedObjectPropertyStringPreprocess, actualObjectPropertyStringPreprocess));
        
        DefaultPassConfig.HotSwapPassFactory expectedResolveTypes = expected.resolveTypes;
        DefaultPassConfig.HotSwapPassFactory actualResolveTypes = actual.resolveTypes;
        String expectedResolveTypesName = expectedResolveTypes.getName();
        String actualResolveTypesName = actualResolveTypes.getName();
        assertEquals(expectedResolveTypesName, actualResolveTypesName);
        
        assertTrue(deepEquals(expectedResolveTypes, actualResolveTypes));
        assertTrue(deepEquals(expectedResolveTypes, actualResolveTypes));
        
        DefaultPassConfig.HotSwapPassFactory expectedInferTypes = expected.inferTypes;
        DefaultPassConfig.HotSwapPassFactory actualInferTypes = actual.inferTypes;
        String expectedInferTypesName = expectedInferTypes.getName();
        String actualInferTypesName = actualInferTypes.getName();
        assertEquals(expectedInferTypesName, actualInferTypesName);
        
        assertTrue(deepEquals(expectedInferTypes, actualInferTypes));
        assertTrue(deepEquals(expectedInferTypes, actualInferTypes));
        
        DefaultPassConfig.HotSwapPassFactory expectedInferJsDocInfo = expected.inferJsDocInfo;
        DefaultPassConfig.HotSwapPassFactory actualInferJsDocInfo = actual.inferJsDocInfo;
        String expectedInferJsDocInfoName = expectedInferJsDocInfo.getName();
        String actualInferJsDocInfoName = actualInferJsDocInfo.getName();
        assertEquals(expectedInferJsDocInfoName, actualInferJsDocInfoName);
        
        assertTrue(deepEquals(expectedInferJsDocInfo, actualInferJsDocInfo));
        assertTrue(deepEquals(expectedInferJsDocInfo, actualInferJsDocInfo));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckTypes = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        DefaultPassConfig.HotSwapPassFactory actualCheckTypes = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        String expectedCheckTypesName = expectedCheckTypes.getName();
        String actualCheckTypesName = actualCheckTypes.getName();
        assertEquals(expectedCheckTypesName, actualCheckTypesName);
        
        assertTrue(deepEquals(expectedCheckTypes, actualCheckTypes));
        assertTrue(deepEquals(expectedCheckTypes, actualCheckTypes));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckControlFlow = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        DefaultPassConfig.HotSwapPassFactory actualCheckControlFlow = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        String expectedCheckControlFlowName = expectedCheckControlFlow.getName();
        String actualCheckControlFlowName = actualCheckControlFlow.getName();
        assertEquals(expectedCheckControlFlowName, actualCheckControlFlowName);
        
        assertTrue(deepEquals(expectedCheckControlFlow, actualCheckControlFlow));
        assertTrue(deepEquals(expectedCheckControlFlow, actualCheckControlFlow));
        
        DefaultPassConfig.HotSwapPassFactory expectedCheckAccessControls = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
        DefaultPassConfig.HotSwapPassFactory actualCheckAccessControls = ((DefaultPassConfig.HotSwapPassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
        String expectedCheckAccessControlsName = expectedCheckAccessControls.getName();
        String actualCheckAccessControlsName = actualCheckAccessControls.getName();
        assertEquals(expectedCheckAccessControlsName, actualCheckAccessControlsName);
        
        assertTrue(deepEquals(expectedCheckAccessControls, actualCheckAccessControls));
        assertTrue(deepEquals(expectedCheckAccessControls, actualCheckAccessControls));
        
        PassFactory expectedCheckGlobalNames = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames"));
        PassFactory actualCheckGlobalNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames"));
        String expectedCheckGlobalNamesName = expectedCheckGlobalNames.getName();
        String actualCheckGlobalNamesName = actualCheckGlobalNames.getName();
        assertEquals(expectedCheckGlobalNamesName, actualCheckGlobalNamesName);
        
        assertTrue(deepEquals(expectedCheckGlobalNames, actualCheckGlobalNames));
        assertTrue(deepEquals(expectedCheckGlobalNames, actualCheckGlobalNames));
        
        PassFactory expectedCheckStrictMode = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        PassFactory actualCheckStrictMode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        String expectedCheckStrictModeName = expectedCheckStrictMode.getName();
        String actualCheckStrictModeName = actualCheckStrictMode.getName();
        assertEquals(expectedCheckStrictModeName, actualCheckStrictModeName);
        
        assertTrue(deepEquals(expectedCheckStrictMode, actualCheckStrictMode));
        assertTrue(deepEquals(expectedCheckStrictMode, actualCheckStrictMode));
        
        PassFactory expectedProcessTweaks = expected.processTweaks;
        PassFactory actualProcessTweaks = actual.processTweaks;
        String expectedProcessTweaksName = expectedProcessTweaks.getName();
        String actualProcessTweaksName = actualProcessTweaks.getName();
        assertEquals(expectedProcessTweaksName, actualProcessTweaksName);
        
        assertTrue(deepEquals(expectedProcessTweaks, actualProcessTweaks));
        assertTrue(deepEquals(expectedProcessTweaks, actualProcessTweaks));
        
        PassFactory expectedProcessDefines = expected.processDefines;
        PassFactory actualProcessDefines = actual.processDefines;
        String expectedProcessDefinesName = expectedProcessDefines.getName();
        String actualProcessDefinesName = actualProcessDefines.getName();
        assertEquals(expectedProcessDefinesName, actualProcessDefinesName);
        
        assertTrue(deepEquals(expectedProcessDefines, actualProcessDefines));
        assertTrue(deepEquals(expectedProcessDefines, actualProcessDefines));
        
        PassFactory expectedCheckConsts = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts"));
        PassFactory actualCheckConsts = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts"));
        String expectedCheckConstsName = expectedCheckConsts.getName();
        String actualCheckConstsName = actualCheckConsts.getName();
        assertEquals(expectedCheckConstsName, actualCheckConstsName);
        
        assertTrue(deepEquals(expectedCheckConsts, actualCheckConsts));
        assertTrue(deepEquals(expectedCheckConsts, actualCheckConsts));
        
        PassFactory expectedComputeFunctionNames = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames"));
        PassFactory actualComputeFunctionNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames"));
        String expectedComputeFunctionNamesName = expectedComputeFunctionNames.getName();
        String actualComputeFunctionNamesName = actualComputeFunctionNames.getName();
        assertEquals(expectedComputeFunctionNamesName, actualComputeFunctionNamesName);
        
        assertTrue(deepEquals(expectedComputeFunctionNames, actualComputeFunctionNames));
        assertTrue(deepEquals(expectedComputeFunctionNames, actualComputeFunctionNames));
        
        PassFactory expectedIgnoreCajaProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties"));
        PassFactory actualIgnoreCajaProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties"));
        String expectedIgnoreCajaPropertiesName = expectedIgnoreCajaProperties.getName();
        String actualIgnoreCajaPropertiesName = actualIgnoreCajaProperties.getName();
        assertEquals(expectedIgnoreCajaPropertiesName, actualIgnoreCajaPropertiesName);
        
        assertTrue(deepEquals(expectedIgnoreCajaProperties, actualIgnoreCajaProperties));
        assertTrue(deepEquals(expectedIgnoreCajaProperties, actualIgnoreCajaProperties));
        
        PassFactory expectedRuntimeTypeCheck = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck"));
        PassFactory actualRuntimeTypeCheck = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck"));
        String expectedRuntimeTypeCheckName = expectedRuntimeTypeCheck.getName();
        String actualRuntimeTypeCheckName = actualRuntimeTypeCheck.getName();
        assertEquals(expectedRuntimeTypeCheckName, actualRuntimeTypeCheckName);
        
        assertTrue(deepEquals(expectedRuntimeTypeCheck, actualRuntimeTypeCheck));
        assertTrue(deepEquals(expectedRuntimeTypeCheck, actualRuntimeTypeCheck));
        
        PassFactory expectedReplaceIdGenerators = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators"));
        PassFactory actualReplaceIdGenerators = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators"));
        String expectedReplaceIdGeneratorsName = expectedReplaceIdGenerators.getName();
        String actualReplaceIdGeneratorsName = actualReplaceIdGenerators.getName();
        assertEquals(expectedReplaceIdGeneratorsName, actualReplaceIdGeneratorsName);
        
        assertTrue(deepEquals(expectedReplaceIdGenerators, actualReplaceIdGenerators));
        assertTrue(deepEquals(expectedReplaceIdGenerators, actualReplaceIdGenerators));
        
        PassFactory expectedReplaceStrings = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceStrings"));
        PassFactory actualReplaceStrings = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "replaceStrings"));
        String expectedReplaceStringsName = expectedReplaceStrings.getName();
        String actualReplaceStringsName = actualReplaceStrings.getName();
        assertEquals(expectedReplaceStringsName, actualReplaceStringsName);
        
        assertTrue(deepEquals(expectedReplaceStrings, actualReplaceStrings));
        assertTrue(deepEquals(expectedReplaceStrings, actualReplaceStrings));
        
        PassFactory expectedOptimizeArgumentsArray = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        PassFactory actualOptimizeArgumentsArray = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        String expectedOptimizeArgumentsArrayName = expectedOptimizeArgumentsArray.getName();
        String actualOptimizeArgumentsArrayName = actualOptimizeArgumentsArray.getName();
        assertEquals(expectedOptimizeArgumentsArrayName, actualOptimizeArgumentsArrayName);
        
        assertTrue(deepEquals(expectedOptimizeArgumentsArray, actualOptimizeArgumentsArray));
        assertTrue(deepEquals(expectedOptimizeArgumentsArray, actualOptimizeArgumentsArray));
        
        PassFactory expectedClosureCodeRemoval = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCodeRemoval"));
        PassFactory actualClosureCodeRemoval = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureCodeRemoval"));
        String expectedClosureCodeRemovalName = expectedClosureCodeRemoval.getName();
        String actualClosureCodeRemovalName = actualClosureCodeRemoval.getName();
        assertEquals(expectedClosureCodeRemovalName, actualClosureCodeRemovalName);
        
        assertTrue(deepEquals(expectedClosureCodeRemoval, actualClosureCodeRemoval));
        assertTrue(deepEquals(expectedClosureCodeRemoval, actualClosureCodeRemoval));
        
        PassFactory expectedClosureOptimizePrimitives = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureOptimizePrimitives"));
        PassFactory actualClosureOptimizePrimitives = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureOptimizePrimitives"));
        String expectedClosureOptimizePrimitivesName = expectedClosureOptimizePrimitives.getName();
        String actualClosureOptimizePrimitivesName = actualClosureOptimizePrimitives.getName();
        assertEquals(expectedClosureOptimizePrimitivesName, actualClosureOptimizePrimitivesName);
        
        assertTrue(deepEquals(expectedClosureOptimizePrimitives, actualClosureOptimizePrimitives));
        assertTrue(deepEquals(expectedClosureOptimizePrimitives, actualClosureOptimizePrimitives));
        
        PassFactory expectedCollapseProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        PassFactory actualCollapseProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        String expectedCollapsePropertiesName = expectedCollapseProperties.getName();
        String actualCollapsePropertiesName = actualCollapseProperties.getName();
        assertEquals(expectedCollapsePropertiesName, actualCollapsePropertiesName);
        
        assertTrue(deepEquals(expectedCollapseProperties, actualCollapseProperties));
        assertTrue(deepEquals(expectedCollapseProperties, actualCollapseProperties));
        
        PassFactory expectedCollapseObjectLiterals = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseObjectLiterals"));
        PassFactory actualCollapseObjectLiterals = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseObjectLiterals"));
        String expectedCollapseObjectLiteralsName = expectedCollapseObjectLiterals.getName();
        String actualCollapseObjectLiteralsName = actualCollapseObjectLiterals.getName();
        assertEquals(expectedCollapseObjectLiteralsName, actualCollapseObjectLiteralsName);
        
        assertTrue(deepEquals(expectedCollapseObjectLiterals, actualCollapseObjectLiterals));
        assertTrue(deepEquals(expectedCollapseObjectLiterals, actualCollapseObjectLiterals));
        
        PassFactory expectedTightenTypesBuilder = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder"));
        PassFactory actualTightenTypesBuilder = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder"));
        String expectedTightenTypesBuilderName = expectedTightenTypesBuilder.getName();
        String actualTightenTypesBuilderName = actualTightenTypesBuilder.getName();
        assertEquals(expectedTightenTypesBuilderName, actualTightenTypesBuilderName);
        
        assertTrue(deepEquals(expectedTightenTypesBuilder, actualTightenTypesBuilder));
        assertTrue(deepEquals(expectedTightenTypesBuilder, actualTightenTypesBuilder));
        
        PassFactory expectedDisambiguateProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties"));
        PassFactory actualDisambiguateProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties"));
        String expectedDisambiguatePropertiesName = expectedDisambiguateProperties.getName();
        String actualDisambiguatePropertiesName = actualDisambiguateProperties.getName();
        assertEquals(expectedDisambiguatePropertiesName, actualDisambiguatePropertiesName);
        
        assertTrue(deepEquals(expectedDisambiguateProperties, actualDisambiguateProperties));
        assertTrue(deepEquals(expectedDisambiguateProperties, actualDisambiguateProperties));
        
        PassFactory expectedChainCalls = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls"));
        PassFactory actualChainCalls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls"));
        String expectedChainCallsName = expectedChainCalls.getName();
        String actualChainCallsName = actualChainCalls.getName();
        assertEquals(expectedChainCallsName, actualChainCallsName);
        
        assertTrue(deepEquals(expectedChainCalls, actualChainCalls));
        assertTrue(deepEquals(expectedChainCalls, actualChainCalls));
        
        PassFactory expectedDevirtualizePrototypeMethods = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods"));
        PassFactory actualDevirtualizePrototypeMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods"));
        String expectedDevirtualizePrototypeMethodsName = expectedDevirtualizePrototypeMethods.getName();
        String actualDevirtualizePrototypeMethodsName = actualDevirtualizePrototypeMethods.getName();
        assertEquals(expectedDevirtualizePrototypeMethodsName, actualDevirtualizePrototypeMethodsName);
        
        assertTrue(deepEquals(expectedDevirtualizePrototypeMethods, actualDevirtualizePrototypeMethods));
        assertTrue(deepEquals(expectedDevirtualizePrototypeMethods, actualDevirtualizePrototypeMethods));
        
        PassFactory expectedOptimizeCallsAndRemoveUnusedVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeCallsAndRemoveUnusedVars"));
        PassFactory actualOptimizeCallsAndRemoveUnusedVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeCallsAndRemoveUnusedVars"));
        String expectedOptimizeCallsAndRemoveUnusedVarsName = expectedOptimizeCallsAndRemoveUnusedVars.getName();
        String actualOptimizeCallsAndRemoveUnusedVarsName = actualOptimizeCallsAndRemoveUnusedVars.getName();
        assertEquals(expectedOptimizeCallsAndRemoveUnusedVarsName, actualOptimizeCallsAndRemoveUnusedVarsName);
        
        assertTrue(deepEquals(expectedOptimizeCallsAndRemoveUnusedVars, actualOptimizeCallsAndRemoveUnusedVars));
        assertTrue(deepEquals(expectedOptimizeCallsAndRemoveUnusedVars, actualOptimizeCallsAndRemoveUnusedVars));
        
        PassFactory expectedMarkPureFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions"));
        PassFactory actualMarkPureFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions"));
        String expectedMarkPureFunctionsName = expectedMarkPureFunctions.getName();
        String actualMarkPureFunctionsName = actualMarkPureFunctions.getName();
        assertEquals(expectedMarkPureFunctionsName, actualMarkPureFunctionsName);
        
        assertTrue(deepEquals(expectedMarkPureFunctions, actualMarkPureFunctions));
        assertTrue(deepEquals(expectedMarkPureFunctions, actualMarkPureFunctions));
        
        PassFactory expectedMarkNoSideEffectCalls = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls"));
        PassFactory actualMarkNoSideEffectCalls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls"));
        String expectedMarkNoSideEffectCallsName = expectedMarkNoSideEffectCalls.getName();
        String actualMarkNoSideEffectCallsName = actualMarkNoSideEffectCalls.getName();
        assertEquals(expectedMarkNoSideEffectCallsName, actualMarkNoSideEffectCallsName);
        
        assertTrue(deepEquals(expectedMarkNoSideEffectCalls, actualMarkNoSideEffectCalls));
        assertTrue(deepEquals(expectedMarkNoSideEffectCalls, actualMarkNoSideEffectCalls));
        
        PassFactory expectedInlineVariables = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables"));
        PassFactory actualInlineVariables = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables"));
        String expectedInlineVariablesName = expectedInlineVariables.getName();
        String actualInlineVariablesName = actualInlineVariables.getName();
        assertEquals(expectedInlineVariablesName, actualInlineVariablesName);
        
        assertTrue(deepEquals(expectedInlineVariables, actualInlineVariables));
        assertTrue(deepEquals(expectedInlineVariables, actualInlineVariables));
        
        PassFactory expectedInlineConstants = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants"));
        PassFactory actualInlineConstants = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants"));
        String expectedInlineConstantsName = expectedInlineConstants.getName();
        String actualInlineConstantsName = actualInlineConstants.getName();
        assertEquals(expectedInlineConstantsName, actualInlineConstantsName);
        
        assertTrue(deepEquals(expectedInlineConstants, actualInlineConstants));
        assertTrue(deepEquals(expectedInlineConstants, actualInlineConstants));
        
        PassFactory expectedMinimizeExitPoints = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints"));
        PassFactory actualMinimizeExitPoints = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints"));
        String expectedMinimizeExitPointsName = expectedMinimizeExitPoints.getName();
        String actualMinimizeExitPointsName = actualMinimizeExitPoints.getName();
        assertEquals(expectedMinimizeExitPointsName, actualMinimizeExitPointsName);
        
        assertTrue(deepEquals(expectedMinimizeExitPoints, actualMinimizeExitPoints));
        assertTrue(deepEquals(expectedMinimizeExitPoints, actualMinimizeExitPoints));
        
        PassFactory expectedRemoveUnreachableCode = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode"));
        PassFactory actualRemoveUnreachableCode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode"));
        String expectedRemoveUnreachableCodeName = expectedRemoveUnreachableCode.getName();
        String actualRemoveUnreachableCodeName = actualRemoveUnreachableCode.getName();
        assertEquals(expectedRemoveUnreachableCodeName, actualRemoveUnreachableCodeName);
        
        assertTrue(deepEquals(expectedRemoveUnreachableCode, actualRemoveUnreachableCode));
        assertTrue(deepEquals(expectedRemoveUnreachableCode, actualRemoveUnreachableCode));
        
        PassFactory expectedRemoveUnusedPrototypeProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties"));
        PassFactory actualRemoveUnusedPrototypeProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties"));
        String expectedRemoveUnusedPrototypePropertiesName = expectedRemoveUnusedPrototypeProperties.getName();
        String actualRemoveUnusedPrototypePropertiesName = actualRemoveUnusedPrototypeProperties.getName();
        assertEquals(expectedRemoveUnusedPrototypePropertiesName, actualRemoveUnusedPrototypePropertiesName);
        
        assertTrue(deepEquals(expectedRemoveUnusedPrototypeProperties, actualRemoveUnusedPrototypeProperties));
        assertTrue(deepEquals(expectedRemoveUnusedPrototypeProperties, actualRemoveUnusedPrototypeProperties));
        
        PassFactory expectedSmartNamePass = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass"));
        PassFactory actualSmartNamePass = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass"));
        String expectedSmartNamePassName = expectedSmartNamePass.getName();
        String actualSmartNamePassName = actualSmartNamePass.getName();
        assertEquals(expectedSmartNamePassName, actualSmartNamePassName);
        
        assertTrue(deepEquals(expectedSmartNamePass, actualSmartNamePass));
        assertTrue(deepEquals(expectedSmartNamePass, actualSmartNamePass));
        
        PassFactory expectedSmartNamePass2 = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass2"));
        PassFactory actualSmartNamePass2 = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass2"));
        assertTrue(deepEquals(expectedSmartNamePass2, actualSmartNamePass2));
        assertTrue(deepEquals(expectedSmartNamePass2, actualSmartNamePass2));
        assertTrue(deepEquals(expectedSmartNamePass2, actualSmartNamePass2));
        
        PassFactory expectedInlineSimpleMethods = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineSimpleMethods"));
        PassFactory actualInlineSimpleMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineSimpleMethods"));
        String expectedInlineSimpleMethodsName = expectedInlineSimpleMethods.getName();
        String actualInlineSimpleMethodsName = actualInlineSimpleMethods.getName();
        assertEquals(expectedInlineSimpleMethodsName, actualInlineSimpleMethodsName);
        
        assertTrue(deepEquals(expectedInlineSimpleMethods, actualInlineSimpleMethods));
        assertTrue(deepEquals(expectedInlineSimpleMethods, actualInlineSimpleMethods));
        
        PassFactory expectedDeadAssignmentsElimination = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination"));
        PassFactory actualDeadAssignmentsElimination = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination"));
        String expectedDeadAssignmentsEliminationName = expectedDeadAssignmentsElimination.getName();
        String actualDeadAssignmentsEliminationName = actualDeadAssignmentsElimination.getName();
        assertEquals(expectedDeadAssignmentsEliminationName, actualDeadAssignmentsEliminationName);
        
        assertTrue(deepEquals(expectedDeadAssignmentsElimination, actualDeadAssignmentsElimination));
        assertTrue(deepEquals(expectedDeadAssignmentsElimination, actualDeadAssignmentsElimination));
        
        PassFactory expectedInlineFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions"));
        PassFactory actualInlineFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions"));
        String expectedInlineFunctionsName = expectedInlineFunctions.getName();
        String actualInlineFunctionsName = actualInlineFunctions.getName();
        assertEquals(expectedInlineFunctionsName, actualInlineFunctionsName);
        
        assertTrue(deepEquals(expectedInlineFunctions, actualInlineFunctions));
        assertTrue(deepEquals(expectedInlineFunctions, actualInlineFunctions));
        
        PassFactory expectedRemoveUnusedVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars"));
        PassFactory actualRemoveUnusedVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars"));
        String expectedRemoveUnusedVarsName = expectedRemoveUnusedVars.getName();
        String actualRemoveUnusedVarsName = actualRemoveUnusedVars.getName();
        assertEquals(expectedRemoveUnusedVarsName, actualRemoveUnusedVarsName);
        
        assertTrue(deepEquals(expectedRemoveUnusedVars, actualRemoveUnusedVars));
        assertTrue(deepEquals(expectedRemoveUnusedVars, actualRemoveUnusedVars));
        
        PassFactory expectedCrossModuleCodeMotion = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion"));
        PassFactory actualCrossModuleCodeMotion = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion"));
        String expectedCrossModuleCodeMotionName = expectedCrossModuleCodeMotion.getName();
        String actualCrossModuleCodeMotionName = actualCrossModuleCodeMotion.getName();
        assertEquals(expectedCrossModuleCodeMotionName, actualCrossModuleCodeMotionName);
        
        assertTrue(deepEquals(expectedCrossModuleCodeMotion, actualCrossModuleCodeMotion));
        assertTrue(deepEquals(expectedCrossModuleCodeMotion, actualCrossModuleCodeMotion));
        
        PassFactory expectedCrossModuleMethodMotion = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion"));
        PassFactory actualCrossModuleMethodMotion = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion"));
        String expectedCrossModuleMethodMotionName = expectedCrossModuleMethodMotion.getName();
        String actualCrossModuleMethodMotionName = actualCrossModuleMethodMotion.getName();
        assertEquals(expectedCrossModuleMethodMotionName, actualCrossModuleMethodMotionName);
        
        assertTrue(deepEquals(expectedCrossModuleMethodMotion, actualCrossModuleMethodMotion));
        assertTrue(deepEquals(expectedCrossModuleMethodMotion, actualCrossModuleMethodMotion));
        
        PassFactory expectedSpecializeInitialModule = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "specializeInitialModule"));
        PassFactory actualSpecializeInitialModule = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "specializeInitialModule"));
        String expectedSpecializeInitialModuleName = expectedSpecializeInitialModule.getName();
        String actualSpecializeInitialModuleName = actualSpecializeInitialModule.getName();
        assertEquals(expectedSpecializeInitialModuleName, actualSpecializeInitialModuleName);
        
        assertTrue(deepEquals(expectedSpecializeInitialModule, actualSpecializeInitialModule));
        assertTrue(deepEquals(expectedSpecializeInitialModule, actualSpecializeInitialModule));
        
        PassFactory expectedFlowSensitiveInlineVariables = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables"));
        PassFactory actualFlowSensitiveInlineVariables = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables"));
        String expectedFlowSensitiveInlineVariablesName = expectedFlowSensitiveInlineVariables.getName();
        String actualFlowSensitiveInlineVariablesName = actualFlowSensitiveInlineVariables.getName();
        assertEquals(expectedFlowSensitiveInlineVariablesName, actualFlowSensitiveInlineVariablesName);
        
        assertTrue(deepEquals(expectedFlowSensitiveInlineVariables, actualFlowSensitiveInlineVariables));
        assertTrue(deepEquals(expectedFlowSensitiveInlineVariables, actualFlowSensitiveInlineVariables));
        
        PassFactory expectedCoalesceVariableNames = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames"));
        PassFactory actualCoalesceVariableNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames"));
        String expectedCoalesceVariableNamesName = expectedCoalesceVariableNames.getName();
        String actualCoalesceVariableNamesName = actualCoalesceVariableNames.getName();
        assertEquals(expectedCoalesceVariableNamesName, actualCoalesceVariableNamesName);
        
        assertTrue(deepEquals(expectedCoalesceVariableNames, actualCoalesceVariableNames));
        assertTrue(deepEquals(expectedCoalesceVariableNames, actualCoalesceVariableNames));
        
        PassFactory expectedExploitAssign = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "exploitAssign"));
        PassFactory actualExploitAssign = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exploitAssign"));
        String expectedExploitAssignName = expectedExploitAssign.getName();
        String actualExploitAssignName = actualExploitAssign.getName();
        assertEquals(expectedExploitAssignName, actualExploitAssignName);
        
        assertTrue(deepEquals(expectedExploitAssign, actualExploitAssign));
        assertTrue(deepEquals(expectedExploitAssign, actualExploitAssign));
        
        PassFactory expectedCollapseVariableDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        PassFactory actualCollapseVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        String expectedCollapseVariableDeclarationsName = expectedCollapseVariableDeclarations.getName();
        String actualCollapseVariableDeclarationsName = actualCollapseVariableDeclarations.getName();
        assertEquals(expectedCollapseVariableDeclarationsName, actualCollapseVariableDeclarationsName);
        
        assertTrue(deepEquals(expectedCollapseVariableDeclarations, actualCollapseVariableDeclarations));
        assertTrue(deepEquals(expectedCollapseVariableDeclarations, actualCollapseVariableDeclarations));
        
        PassFactory expectedGroupVariableDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "groupVariableDeclarations"));
        PassFactory actualGroupVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "groupVariableDeclarations"));
        String expectedGroupVariableDeclarationsName = expectedGroupVariableDeclarations.getName();
        String actualGroupVariableDeclarationsName = actualGroupVariableDeclarations.getName();
        assertEquals(expectedGroupVariableDeclarationsName, actualGroupVariableDeclarationsName);
        
        assertTrue(deepEquals(expectedGroupVariableDeclarations, actualGroupVariableDeclarations));
        assertTrue(deepEquals(expectedGroupVariableDeclarations, actualGroupVariableDeclarations));
        
        PassFactory expectedExtractPrototypeMemberDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations"));
        PassFactory actualExtractPrototypeMemberDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations"));
        String expectedExtractPrototypeMemberDeclarationsName = expectedExtractPrototypeMemberDeclarations.getName();
        String actualExtractPrototypeMemberDeclarationsName = actualExtractPrototypeMemberDeclarations.getName();
        assertEquals(expectedExtractPrototypeMemberDeclarationsName, actualExtractPrototypeMemberDeclarationsName);
        
        assertTrue(deepEquals(expectedExtractPrototypeMemberDeclarations, actualExtractPrototypeMemberDeclarations));
        assertTrue(deepEquals(expectedExtractPrototypeMemberDeclarations, actualExtractPrototypeMemberDeclarations));
        
        PassFactory expectedRewriteFunctionExpressions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions"));
        PassFactory actualRewriteFunctionExpressions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions"));
        String expectedRewriteFunctionExpressionsName = expectedRewriteFunctionExpressions.getName();
        String actualRewriteFunctionExpressionsName = actualRewriteFunctionExpressions.getName();
        assertEquals(expectedRewriteFunctionExpressionsName, actualRewriteFunctionExpressionsName);
        
        assertTrue(deepEquals(expectedRewriteFunctionExpressions, actualRewriteFunctionExpressions));
        assertTrue(deepEquals(expectedRewriteFunctionExpressions, actualRewriteFunctionExpressions));
        
        PassFactory expectedCollapseAnonymousFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions"));
        PassFactory actualCollapseAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions"));
        String expectedCollapseAnonymousFunctionsName = expectedCollapseAnonymousFunctions.getName();
        String actualCollapseAnonymousFunctionsName = actualCollapseAnonymousFunctions.getName();
        assertEquals(expectedCollapseAnonymousFunctionsName, actualCollapseAnonymousFunctionsName);
        
        assertTrue(deepEquals(expectedCollapseAnonymousFunctions, actualCollapseAnonymousFunctions));
        assertTrue(deepEquals(expectedCollapseAnonymousFunctions, actualCollapseAnonymousFunctions));
        
        PassFactory expectedMoveFunctionDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations"));
        PassFactory actualMoveFunctionDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations"));
        String expectedMoveFunctionDeclarationsName = expectedMoveFunctionDeclarations.getName();
        String actualMoveFunctionDeclarationsName = actualMoveFunctionDeclarations.getName();
        assertEquals(expectedMoveFunctionDeclarationsName, actualMoveFunctionDeclarationsName);
        
        assertTrue(deepEquals(expectedMoveFunctionDeclarations, actualMoveFunctionDeclarations));
        assertTrue(deepEquals(expectedMoveFunctionDeclarations, actualMoveFunctionDeclarations));
        
        PassFactory expectedNameUnmappedAnonymousFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions"));
        PassFactory actualNameUnmappedAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions"));
        String expectedNameUnmappedAnonymousFunctionsName = expectedNameUnmappedAnonymousFunctions.getName();
        String actualNameUnmappedAnonymousFunctionsName = actualNameUnmappedAnonymousFunctions.getName();
        assertEquals(expectedNameUnmappedAnonymousFunctionsName, actualNameUnmappedAnonymousFunctionsName);
        
        assertTrue(deepEquals(expectedNameUnmappedAnonymousFunctions, actualNameUnmappedAnonymousFunctions));
        assertTrue(deepEquals(expectedNameUnmappedAnonymousFunctions, actualNameUnmappedAnonymousFunctions));
        
        PassFactory expectedNameMappedAnonymousFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions"));
        PassFactory actualNameMappedAnonymousFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions"));
        assertTrue(deepEquals(expectedNameMappedAnonymousFunctions, actualNameMappedAnonymousFunctions));
        assertTrue(deepEquals(expectedNameMappedAnonymousFunctions, actualNameMappedAnonymousFunctions));
        assertTrue(deepEquals(expectedNameMappedAnonymousFunctions, actualNameMappedAnonymousFunctions));
        
        PassFactory expectedOperaCompoundAssignFix = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "operaCompoundAssignFix"));
        PassFactory actualOperaCompoundAssignFix = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "operaCompoundAssignFix"));
        String expectedOperaCompoundAssignFixName = expectedOperaCompoundAssignFix.getName();
        String actualOperaCompoundAssignFixName = actualOperaCompoundAssignFix.getName();
        assertEquals(expectedOperaCompoundAssignFixName, actualOperaCompoundAssignFixName);
        
        assertTrue(deepEquals(expectedOperaCompoundAssignFix, actualOperaCompoundAssignFix));
        assertTrue(deepEquals(expectedOperaCompoundAssignFix, actualOperaCompoundAssignFix));
        
        PassFactory expectedAliasExternals = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals"));
        PassFactory actualAliasExternals = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals"));
        String expectedAliasExternalsName = expectedAliasExternals.getName();
        String actualAliasExternalsName = actualAliasExternals.getName();
        assertEquals(expectedAliasExternalsName, actualAliasExternalsName);
        
        assertTrue(deepEquals(expectedAliasExternals, actualAliasExternals));
        assertTrue(deepEquals(expectedAliasExternals, actualAliasExternals));
        
        PassFactory expectedAliasStrings = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings"));
        PassFactory actualAliasStrings = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings"));
        String expectedAliasStringsName = expectedAliasStrings.getName();
        String actualAliasStringsName = actualAliasStrings.getName();
        assertEquals(expectedAliasStringsName, actualAliasStringsName);
        
        assertTrue(deepEquals(expectedAliasStrings, actualAliasStrings));
        assertTrue(deepEquals(expectedAliasStrings, actualAliasStrings));
        
        PassFactory expectedAliasKeywords = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords"));
        PassFactory actualAliasKeywords = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords"));
        String expectedAliasKeywordsName = expectedAliasKeywords.getName();
        String actualAliasKeywordsName = actualAliasKeywords.getName();
        assertEquals(expectedAliasKeywordsName, actualAliasKeywordsName);
        
        assertTrue(deepEquals(expectedAliasKeywords, actualAliasKeywords));
        assertTrue(deepEquals(expectedAliasKeywords, actualAliasKeywords));
        
        PassFactory expectedObjectPropertyStringPostprocess = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess"));
        PassFactory actualObjectPropertyStringPostprocess = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess"));
        String expectedObjectPropertyStringPostprocessName = expectedObjectPropertyStringPostprocess.getName();
        String actualObjectPropertyStringPostprocessName = actualObjectPropertyStringPostprocess.getName();
        assertEquals(expectedObjectPropertyStringPostprocessName, actualObjectPropertyStringPostprocessName);
        
        assertTrue(deepEquals(expectedObjectPropertyStringPostprocess, actualObjectPropertyStringPostprocess));
        assertTrue(deepEquals(expectedObjectPropertyStringPostprocess, actualObjectPropertyStringPostprocess));
        
        PassFactory expectedAmbiguateProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties"));
        PassFactory actualAmbiguateProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties"));
        String expectedAmbiguatePropertiesName = expectedAmbiguateProperties.getName();
        String actualAmbiguatePropertiesName = actualAmbiguateProperties.getName();
        assertEquals(expectedAmbiguatePropertiesName, actualAmbiguatePropertiesName);
        
        assertTrue(deepEquals(expectedAmbiguateProperties, actualAmbiguateProperties));
        assertTrue(deepEquals(expectedAmbiguateProperties, actualAmbiguateProperties));
        
        PassFactory expectedMarkUnnormalized = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markUnnormalized"));
        PassFactory actualMarkUnnormalized = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markUnnormalized"));
        String expectedMarkUnnormalizedName = expectedMarkUnnormalized.getName();
        String actualMarkUnnormalizedName = actualMarkUnnormalized.getName();
        assertEquals(expectedMarkUnnormalizedName, actualMarkUnnormalizedName);
        
        assertTrue(deepEquals(expectedMarkUnnormalized, actualMarkUnnormalized));
        assertTrue(deepEquals(expectedMarkUnnormalized, actualMarkUnnormalized));
        
        PassFactory expectedDenormalize = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize"));
        PassFactory actualDenormalize = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize"));
        String expectedDenormalizeName = expectedDenormalize.getName();
        String actualDenormalizeName = actualDenormalize.getName();
        assertEquals(expectedDenormalizeName, actualDenormalizeName);
        
        assertTrue(deepEquals(expectedDenormalize, actualDenormalize));
        assertTrue(deepEquals(expectedDenormalize, actualDenormalize));
        
        PassFactory expectedInvertContextualRenaming = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming"));
        PassFactory actualInvertContextualRenaming = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming"));
        String expectedInvertContextualRenamingName = expectedInvertContextualRenaming.getName();
        String actualInvertContextualRenamingName = actualInvertContextualRenaming.getName();
        assertEquals(expectedInvertContextualRenamingName, actualInvertContextualRenamingName);
        
        assertTrue(deepEquals(expectedInvertContextualRenaming, actualInvertContextualRenaming));
        assertTrue(deepEquals(expectedInvertContextualRenaming, actualInvertContextualRenaming));
        
        PassFactory expectedRenameProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties"));
        PassFactory actualRenameProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties"));
        String expectedRenamePropertiesName = expectedRenameProperties.getName();
        String actualRenamePropertiesName = actualRenameProperties.getName();
        assertEquals(expectedRenamePropertiesName, actualRenamePropertiesName);
        
        assertTrue(deepEquals(expectedRenameProperties, actualRenameProperties));
        assertTrue(deepEquals(expectedRenameProperties, actualRenameProperties));
        
        PassFactory expectedRenameVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars"));
        PassFactory actualRenameVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars"));
        String expectedRenameVarsName = expectedRenameVars.getName();
        String actualRenameVarsName = actualRenameVars.getName();
        assertEquals(expectedRenameVarsName, actualRenameVarsName);
        
        assertTrue(deepEquals(expectedRenameVars, actualRenameVars));
        assertTrue(deepEquals(expectedRenameVars, actualRenameVars));
        
        PassFactory expectedRenameLabels = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels"));
        PassFactory actualRenameLabels = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels"));
        String expectedRenameLabelsName = expectedRenameLabels.getName();
        String actualRenameLabelsName = actualRenameLabels.getName();
        assertEquals(expectedRenameLabelsName, actualRenameLabelsName);
        
        assertTrue(deepEquals(expectedRenameLabels, actualRenameLabels));
        assertTrue(deepEquals(expectedRenameLabels, actualRenameLabels));
        
        PassFactory expectedConvertToDottedProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties"));
        PassFactory actualConvertToDottedProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties"));
        String expectedConvertToDottedPropertiesName = expectedConvertToDottedProperties.getName();
        String actualConvertToDottedPropertiesName = actualConvertToDottedProperties.getName();
        assertEquals(expectedConvertToDottedPropertiesName, actualConvertToDottedPropertiesName);
        
        assertTrue(deepEquals(expectedConvertToDottedProperties, actualConvertToDottedProperties));
        assertTrue(deepEquals(expectedConvertToDottedProperties, actualConvertToDottedProperties));
        
        PassFactory expectedSanityCheckAst = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckAst"));
        PassFactory actualSanityCheckAst = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckAst"));
        String expectedSanityCheckAstName = expectedSanityCheckAst.getName();
        String actualSanityCheckAstName = actualSanityCheckAst.getName();
        assertEquals(expectedSanityCheckAstName, actualSanityCheckAstName);
        
        assertTrue(deepEquals(expectedSanityCheckAst, actualSanityCheckAst));
        assertTrue(deepEquals(expectedSanityCheckAst, actualSanityCheckAst));
        
        PassFactory expectedSanityCheckVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars"));
        PassFactory actualSanityCheckVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars"));
        String expectedSanityCheckVarsName = expectedSanityCheckVars.getName();
        String actualSanityCheckVarsName = actualSanityCheckVars.getName();
        assertEquals(expectedSanityCheckVarsName, actualSanityCheckVarsName);
        
        assertTrue(deepEquals(expectedSanityCheckVars, actualSanityCheckVars));
        assertTrue(deepEquals(expectedSanityCheckVars, actualSanityCheckVars));
        
        PassFactory expectedInstrumentFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions"));
        PassFactory actualInstrumentFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions"));
        String expectedInstrumentFunctionsName = expectedInstrumentFunctions.getName();
        String actualInstrumentFunctionsName = actualInstrumentFunctions.getName();
        assertEquals(expectedInstrumentFunctionsName, actualInstrumentFunctionsName);
        
        assertTrue(deepEquals(expectedInstrumentFunctions, actualInstrumentFunctions));
        assertTrue(deepEquals(expectedInstrumentFunctions, actualInstrumentFunctions));
        
        PassFactory expectedPrintNameReferenceGraph = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceGraph"));
        PassFactory actualPrintNameReferenceGraph = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceGraph"));
        String expectedPrintNameReferenceGraphName = expectedPrintNameReferenceGraph.getName();
        String actualPrintNameReferenceGraphName = actualPrintNameReferenceGraph.getName();
        assertEquals(expectedPrintNameReferenceGraphName, actualPrintNameReferenceGraphName);
        
        assertTrue(deepEquals(expectedPrintNameReferenceGraph, actualPrintNameReferenceGraph));
        assertTrue(deepEquals(expectedPrintNameReferenceGraph, actualPrintNameReferenceGraph));
        
        PassFactory expectedPrintNameReferenceReport = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceReport"));
        PassFactory actualPrintNameReferenceReport = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "printNameReferenceReport"));
        String expectedPrintNameReferenceReportName = expectedPrintNameReferenceReport.getName();
        String actualPrintNameReferenceReportName = actualPrintNameReferenceReport.getName();
        assertEquals(expectedPrintNameReferenceReportName, actualPrintNameReferenceReportName);
        
        assertTrue(deepEquals(expectedPrintNameReferenceReport, actualPrintNameReferenceReport));
        assertTrue(deepEquals(expectedPrintNameReferenceReport, actualPrintNameReferenceReport));
        
        CompilerOptions actualOptions = actual.options;
        assertNull(actualOptions);
        
        MemoizedScopeCreator actualTypedScopeCreator = ((MemoizedScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.PassConfig", "typedScopeCreator"));
        assertNull(actualTypedScopeCreator);
        
        TypedScopeCreator actualInternalScopeCreator = ((TypedScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.PassConfig", "internalScopeCreator"));
        assertNull(actualInternalScopeCreator);
        
        Scope actualTopScope = actual.topScope;
        assertNull(actualTopScope);
        
    */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.addIncrementalSourceAst
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addIncrementalSourceAst(com.google.javascript.jscomp.JsAst)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#addIncrementalSourceAst(com.google.javascript.jscomp.JsAst)}
 * @utbot.invokes {@link com.google.javascript.jscomp.JsAst#getSourceFile()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sourceName = ast.getSourceFile().getName();
 *  */
    @Test
    public void testAddIncrementalSourceAst_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.addIncrementalSourceAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addIncrementalSourceAst(Compiler.java:989) */
        compiler.addIncrementalSourceAst(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#addIncrementalSourceAst(com.google.javascript.jscomp.JsAst)}
 * @utbot.invokes {@link com.google.javascript.jscomp.JsAst#getSourceFile()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sourceName = ast.getSourceFile().getName();
 *  */
    @Test
    public void testAddIncrementalSourceAst_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.addIncrementalSourceAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addIncrementalSourceAst(Compiler.java:989) */
        compiler.addIncrementalSourceAst(jsAst);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addIncrementalSourceAst(com.google.javascript.jscomp.JsAst)
    
    @Test
    public void testAddIncrementalSourceAst1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.Preloaded sourceFile = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        jsAst.setSourceFile(sourceFile);
        
        compiler.addIncrementalSourceAst(jsAst);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.replaceIncrementalSourceAst
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceIncrementalSourceAst(com.google.javascript.jscomp.JsAst)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#replaceIncrementalSourceAst(com.google.javascript.jscomp.JsAst)}
 * @utbot.invokes {@link com.google.javascript.jscomp.JsAst#getSourceFile()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sourceName = ast.getSourceFile().getName();
 *  */
    @Test
    public void testReplaceIncrementalSourceAst_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.replaceIncrementalSourceAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.replaceIncrementalSourceAst(Compiler.java:1006) */
        compiler.replaceIncrementalSourceAst(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#replaceIncrementalSourceAst(com.google.javascript.jscomp.JsAst)}
 * @utbot.invokes {@link com.google.javascript.jscomp.JsAst#getSourceFile()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sourceName = ast.getSourceFile().getName();
 *  */
    @Test
    public void testReplaceIncrementalSourceAst_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.replaceIncrementalSourceAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.replaceIncrementalSourceAst(Compiler.java:1006) */
        compiler.replaceIncrementalSourceAst(jsAst);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceIncrementalSourceAst(com.google.javascript.jscomp.JsAst)
    
    @Test(expected = NullPointerException.class)
    public void testReplaceIncrementalSourceAst1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.Preloaded sourceFile = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "";
        setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        jsAst.setSourceFile(sourceFile);
        
        compiler.replaceIncrementalSourceAst(jsAst);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getCodingConvention
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCodingConvention()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getCodingConvention()}
 * @utbot.executesCondition {@code (convention != null): True}
 * @utbot.returnsFrom {@code return convention;}
 *  */
    @Test
    public void testGetCodingConvention_ConventionNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        
        ClosureCodingConvention actual = ((ClosureCodingConvention) compiler.getCodingConvention());
        
        Set actualPropertyTestFunctions = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions"));
        assertNull(actualPropertyTestFunctions);
        
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getCodingConvention()}
 * @utbot.executesCondition {@code (convention != null): False}
 * @utbot.returnsFrom {@code return convention;}
 *  */
    @Test
    public void testGetCodingConvention_ConventionEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        CodingConvention actual = compiler.getCodingConvention();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCodingConvention()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CodingConvention convention = options.getCodingConvention();
 *  */
    @Test
    public void testGetCodingConvention_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getCodingConvention] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getCodingConvention(Compiler.java:1664) */
        compiler.getCodingConvention();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getDiagnosticGroups
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDiagnosticGroups()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getDiagnosticGroups()}
 * @utbot.returnsFrom {@code return new DiagnosticGroups();}
 *  */
    @Test
    public void testGetDiagnosticGroups_Return() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        DiagnosticGroups actual = compiler.getDiagnosticGroups();
        
        DiagnosticGroups expected = ((DiagnosticGroups) createInstance("com.google.javascript.jscomp.DiagnosticGroups"));
        DiagnosticGroup globalThis = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types = new LinkedHashSet();
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key = "JSC_USED_GLOBAL_THIS";
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "key", key);
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        CheckLevel defaultLevel = CheckLevel.WARNING;
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType.level = defaultLevel;
        types.add(diagnosticType);
        setField(globalThis, "com.google.javascript.jscomp.DiagnosticGroup", "types", types);
        String name = "globalThis";
        setField(globalThis, "com.google.javascript.jscomp.DiagnosticGroup", "name", name);
        DiagnosticGroups.GLOBAL_THIS = globalThis;
        DiagnosticGroup deprecated = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types1 = new LinkedHashSet();
        DiagnosticType diagnosticType1 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key1 = "JSC_DEPRECATED_VAR";
        setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "key", key1);
        MessageFormat format1 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "format", format1);
        CheckLevel defaultLevel1 = CheckLevel.OFF;
        setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType1.level = defaultLevel1;
        types1.add(diagnosticType1);
        DiagnosticType diagnosticType2 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key2 = "JSC_DEPRECATED_VAR_REASON";
        setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "key", key2);
        MessageFormat format2 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "format", format2);
        setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType2.level = defaultLevel1;
        types1.add(diagnosticType2);
        DiagnosticType diagnosticType3 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key3 = "JSC_DEPRECATED_PROP";
        setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "key", key3);
        MessageFormat format3 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "format", format3);
        setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType3.level = defaultLevel1;
        types1.add(diagnosticType3);
        DiagnosticType diagnosticType4 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key4 = "JSC_DEPRECATED_PROP_REASON";
        setField(diagnosticType4, "com.google.javascript.jscomp.DiagnosticType", "key", key4);
        MessageFormat format4 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType4, "com.google.javascript.jscomp.DiagnosticType", "format", format4);
        setField(diagnosticType4, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType4.level = defaultLevel1;
        types1.add(diagnosticType4);
        DiagnosticType diagnosticType5 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key5 = "JSC_DEPRECATED_CLASS";
        setField(diagnosticType5, "com.google.javascript.jscomp.DiagnosticType", "key", key5);
        MessageFormat format5 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType5, "com.google.javascript.jscomp.DiagnosticType", "format", format5);
        setField(diagnosticType5, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType5.level = defaultLevel1;
        types1.add(diagnosticType5);
        DiagnosticType diagnosticType6 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key6 = "JSC_DEPRECATED_CLASS_REASON";
        setField(diagnosticType6, "com.google.javascript.jscomp.DiagnosticType", "key", key6);
        MessageFormat format6 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType6, "com.google.javascript.jscomp.DiagnosticType", "format", format6);
        setField(diagnosticType6, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType6.level = defaultLevel1;
        types1.add(diagnosticType6);
        setField(deprecated, "com.google.javascript.jscomp.DiagnosticGroup", "types", types1);
        String name1 = "deprecated";
        setField(deprecated, "com.google.javascript.jscomp.DiagnosticGroup", "name", name1);
        DiagnosticGroups.DEPRECATED = deprecated;
        DiagnosticGroup visibility = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types2 = new LinkedHashSet();
        DiagnosticType diagnosticType7 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key7 = "JSC_BAD_PRIVATE_GLOBAL_ACCESS";
        setField(diagnosticType7, "com.google.javascript.jscomp.DiagnosticType", "key", key7);
        MessageFormat format7 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType7, "com.google.javascript.jscomp.DiagnosticType", "format", format7);
        setField(diagnosticType7, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType7.level = defaultLevel1;
        types2.add(diagnosticType7);
        DiagnosticType diagnosticType8 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key8 = "JSC_BAD_PRIVATE_PROPERTY_ACCESS";
        setField(diagnosticType8, "com.google.javascript.jscomp.DiagnosticType", "key", key8);
        MessageFormat format8 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType8, "com.google.javascript.jscomp.DiagnosticType", "format", format8);
        setField(diagnosticType8, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType8.level = defaultLevel1;
        types2.add(diagnosticType8);
        DiagnosticType diagnosticType9 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key9 = "JSC_BAD_PROTECTED_PROPERTY_ACCESS";
        setField(diagnosticType9, "com.google.javascript.jscomp.DiagnosticType", "key", key9);
        MessageFormat format9 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType9, "com.google.javascript.jscomp.DiagnosticType", "format", format9);
        setField(diagnosticType9, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType9.level = defaultLevel1;
        types2.add(diagnosticType9);
        DiagnosticType diagnosticType10 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key10 = "JSC_PRIVATE_OVERRIDE";
        setField(diagnosticType10, "com.google.javascript.jscomp.DiagnosticType", "key", key10);
        MessageFormat format10 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType10, "com.google.javascript.jscomp.DiagnosticType", "format", format10);
        setField(diagnosticType10, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType10.level = defaultLevel1;
        types2.add(diagnosticType10);
        DiagnosticType diagnosticType11 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key11 = "JSC_VISIBILITY_MISMATCH";
        setField(diagnosticType11, "com.google.javascript.jscomp.DiagnosticType", "key", key11);
        MessageFormat format11 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType11, "com.google.javascript.jscomp.DiagnosticType", "format", format11);
        setField(diagnosticType11, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType11.level = defaultLevel1;
        types2.add(diagnosticType11);
        setField(visibility, "com.google.javascript.jscomp.DiagnosticGroup", "types", types2);
        String name2 = "visibility";
        setField(visibility, "com.google.javascript.jscomp.DiagnosticGroup", "name", name2);
        DiagnosticGroups.VISIBILITY = visibility;
        DiagnosticGroup constantProperty = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types3 = new LinkedHashSet();
        DiagnosticType diagnosticType12 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key12 = "JSC_CONSTANT_PROPERTY_DELETED";
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "key", key12);
        MessageFormat format12 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "format", format12);
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType12.level = defaultLevel;
        types3.add(diagnosticType12);
        DiagnosticType diagnosticType13 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key13 = "JSC_CONSTANT_PROPERTY_REASSIGNED_VALUE";
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "key", key13);
        MessageFormat format13 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "format", format13);
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType13.level = defaultLevel;
        types3.add(diagnosticType13);
        setField(constantProperty, "com.google.javascript.jscomp.DiagnosticGroup", "types", types3);
        String name3 = "constantProperty";
        setField(constantProperty, "com.google.javascript.jscomp.DiagnosticGroup", "name", name3);
        DiagnosticGroups.CONSTANT_PROPERTY = constantProperty;
        DiagnosticGroup nonStandardJsdoc = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types4 = new LinkedHashSet();
        DiagnosticType diagnosticType14 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key14 = "JSC_BAD_JSDOC_ANNOTATION";
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "key", key14);
        MessageFormat format14 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "format", format14);
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType14.level = defaultLevel;
        types4.add(diagnosticType14);
        setField(nonStandardJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "types", types4);
        String name4 = "nonStandardJsDocs";
        setField(nonStandardJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "name", name4);
        DiagnosticGroups.NON_STANDARD_JSDOC = nonStandardJsdoc;
        DiagnosticGroup accessControls = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types5 = new LinkedHashSet();
        types5.add(diagnosticType7);
        types5.add(diagnosticType2);
        types5.add(diagnosticType6);
        types5.add(diagnosticType5);
        types5.add(diagnosticType3);
        types5.add(diagnosticType8);
        types5.add(diagnosticType11);
        types5.add(diagnosticType1);
        types5.add(diagnosticType9);
        types5.add(diagnosticType4);
        types5.add(diagnosticType10);
        setField(accessControls, "com.google.javascript.jscomp.DiagnosticGroup", "types", types5);
        String name5 = "accessControls";
        setField(accessControls, "com.google.javascript.jscomp.DiagnosticGroup", "name", name5);
        DiagnosticGroups.ACCESS_CONTROLS = accessControls;
        DiagnosticGroup invalidCasts = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types6 = new LinkedHashSet();
        DiagnosticType diagnosticType15 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key15 = "JSC_INVALID_CAST";
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "key", key15);
        MessageFormat format15 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "format", format15);
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType15.level = defaultLevel;
        types6.add(diagnosticType15);
        setField(invalidCasts, "com.google.javascript.jscomp.DiagnosticGroup", "types", types6);
        String name6 = "invalidCasts";
        setField(invalidCasts, "com.google.javascript.jscomp.DiagnosticGroup", "name", name6);
        DiagnosticGroups.INVALID_CASTS = invalidCasts;
        DiagnosticGroup fileoverviewJsdoc = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types7 = new LinkedHashSet();
        DiagnosticType diagnosticType16 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key16 = "JSC_EXTRA_FILEOVERVIEW";
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "key", key16);
        MessageFormat format16 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "format", format16);
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType16.level = defaultLevel;
        types7.add(diagnosticType16);
        setField(fileoverviewJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "types", types7);
        String name7 = "fileoverviewTags";
        setField(fileoverviewJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "name", name7);
        DiagnosticGroups.FILEOVERVIEW_JSDOC = fileoverviewJsdoc;
        DiagnosticGroup strictModuleDepCheck = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types8 = new LinkedHashSet();
        DiagnosticType diagnosticType17 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key17 = "JSC_STRICT_MODULE_DEPENDENCY";
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "key", key17);
        MessageFormat format17 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "format", format17);
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType17.level = defaultLevel1;
        types8.add(diagnosticType17);
        DiagnosticType diagnosticType18 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key18 = "JSC_STRICT_MODULE_DEP_QNAME";
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "key", key18);
        MessageFormat format18 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "format", format18);
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType18.level = defaultLevel1;
        types8.add(diagnosticType18);
        setField(strictModuleDepCheck, "com.google.javascript.jscomp.DiagnosticGroup", "types", types8);
        String name8 = "strictModuleDepCheck";
        setField(strictModuleDepCheck, "com.google.javascript.jscomp.DiagnosticGroup", "name", name8);
        DiagnosticGroups.STRICT_MODULE_DEP_CHECK = strictModuleDepCheck;
        DiagnosticGroup externsValidation = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types9 = new LinkedHashSet();
        DiagnosticType diagnosticType19 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key19 = "JSC_NAME_REFERENCE_IN_EXTERNS";
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "key", key19);
        MessageFormat format19 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "format", format19);
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType19.level = defaultLevel;
        types9.add(diagnosticType19);
        DiagnosticType diagnosticType20 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key20 = "JSC_UNDEFINED_EXTERN_VAR_ERROR";
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "key", key20);
        MessageFormat format20 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "format", format20);
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType20.level = defaultLevel;
        types9.add(diagnosticType20);
        setField(externsValidation, "com.google.javascript.jscomp.DiagnosticGroup", "types", types9);
        String name9 = "externsValidation";
        setField(externsValidation, "com.google.javascript.jscomp.DiagnosticGroup", "name", name9);
        DiagnosticGroups.EXTERNS_VALIDATION = externsValidation;
        DiagnosticGroup ambiguousFunctionDecl = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types10 = new LinkedHashSet();
        DiagnosticType diagnosticType21 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key21 = "AMBIGUOUS_FUNCTION_DECL";
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "key", key21);
        MessageFormat format21 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "format", format21);
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType21.level = defaultLevel1;
        types10.add(diagnosticType21);
        setField(ambiguousFunctionDecl, "com.google.javascript.jscomp.DiagnosticGroup", "types", types10);
        String name10 = "ambiguousFunctionDecl";
        setField(ambiguousFunctionDecl, "com.google.javascript.jscomp.DiagnosticGroup", "name", name10);
        DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = ambiguousFunctionDecl;
        DiagnosticGroup unknownDefines = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types11 = new LinkedHashSet();
        DiagnosticType diagnosticType22 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key22 = "JSC_UNKNOWN_DEFINE_WARNING";
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "key", key22);
        MessageFormat format22 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "format", format22);
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType22.level = defaultLevel;
        types11.add(diagnosticType22);
        setField(unknownDefines, "com.google.javascript.jscomp.DiagnosticGroup", "types", types11);
        String name11 = "unknownDefines";
        setField(unknownDefines, "com.google.javascript.jscomp.DiagnosticGroup", "name", name11);
        DiagnosticGroups.UNKNOWN_DEFINES = unknownDefines;
        DiagnosticGroup tweaks = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types12 = new LinkedHashSet();
        DiagnosticType diagnosticType23 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key23 = "JSC_INVALID_TWEAK_DEFAULT_VALUE_WARNING";
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "key", key23);
        MessageFormat format23 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "format", format23);
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType23.level = defaultLevel;
        types12.add(diagnosticType23);
        DiagnosticType diagnosticType24 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key24 = "JSC_TWEAK_WRONG_GETTER_TYPE_WARNING";
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "key", key24);
        MessageFormat format24 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "format", format24);
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType24.level = defaultLevel;
        types12.add(diagnosticType24);
        DiagnosticType diagnosticType25 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key25 = "JSC_UNKNOWN_TWEAK_WARNING";
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "key", key25);
        MessageFormat format25 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "format", format25);
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType25.level = defaultLevel;
        types12.add(diagnosticType25);
        setField(tweaks, "com.google.javascript.jscomp.DiagnosticGroup", "types", types12);
        String name12 = "tweakValidation";
        setField(tweaks, "com.google.javascript.jscomp.DiagnosticGroup", "name", name12);
        DiagnosticGroups.TWEAKS = tweaks;
        DiagnosticGroup missingProperties = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types13 = new LinkedHashSet();
        DiagnosticType diagnosticType26 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key26 = "JSC_INEXISTENT_PROPERTY";
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "key", key26);
        MessageFormat format26 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "format", format26);
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType26.level = defaultLevel1;
        types13.add(diagnosticType26);
        setField(missingProperties, "com.google.javascript.jscomp.DiagnosticGroup", "types", types13);
        String name13 = "missingProperties";
        setField(missingProperties, "com.google.javascript.jscomp.DiagnosticGroup", "name", name13);
        DiagnosticGroups.MISSING_PROPERTIES = missingProperties;
        DiagnosticGroup internetExplorerChecks = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types14 = new LinkedHashSet();
        DiagnosticType diagnosticType27 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key27 = "JSC_TRAILING_COMMA";
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "key", key27);
        MessageFormat format27 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "format", format27);
        CheckLevel defaultLevel2 = CheckLevel.ERROR;
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType27.level = defaultLevel2;
        types14.add(diagnosticType27);
        setField(internetExplorerChecks, "com.google.javascript.jscomp.DiagnosticGroup", "types", types14);
        String name14 = "internetExplorerChecks";
        setField(internetExplorerChecks, "com.google.javascript.jscomp.DiagnosticGroup", "name", name14);
        DiagnosticGroups.INTERNET_EXPLORER_CHECKS = internetExplorerChecks;
        DiagnosticGroup undefinedVariables = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types15 = new LinkedHashSet();
        DiagnosticType diagnosticType28 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key28 = "JSC_UNDEFINED_VARIABLE";
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "key", key28);
        MessageFormat format28 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "format", format28);
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType28.level = defaultLevel2;
        types15.add(diagnosticType28);
        setField(undefinedVariables, "com.google.javascript.jscomp.DiagnosticGroup", "types", types15);
        String name15 = "undefinedVars";
        setField(undefinedVariables, "com.google.javascript.jscomp.DiagnosticGroup", "name", name15);
        DiagnosticGroups.UNDEFINED_VARIABLES = undefinedVariables;
        DiagnosticGroup checkRegexp = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types16 = new LinkedHashSet();
        DiagnosticType diagnosticType29 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key29 = "JSC_REGEXP_REFERENCE";
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "key", key29);
        MessageFormat format29 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "format", format29);
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType29.level = defaultLevel;
        types16.add(diagnosticType29);
        DiagnosticType diagnosticType30 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key30 = "JSC_MALFORMED_REGEXP";
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "key", key30);
        MessageFormat format30 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "format", format30);
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType30.level = defaultLevel;
        types16.add(diagnosticType30);
        setField(checkRegexp, "com.google.javascript.jscomp.DiagnosticGroup", "types", types16);
        String name16 = "checkRegExp";
        setField(checkRegexp, "com.google.javascript.jscomp.DiagnosticGroup", "name", name16);
        DiagnosticGroups.CHECK_REGEXP = checkRegexp;
        DiagnosticGroup checkTypes = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types17 = new LinkedHashSet();
        DiagnosticType diagnosticType31 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key31 = "JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH";
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "key", key31);
        MessageFormat format31 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "format", format31);
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType31.level = defaultLevel;
        types17.add(diagnosticType31);
        DiagnosticType diagnosticType32 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key32 = "JSC_HIDDEN_INTERFACE_PROPERTY";
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "key", key32);
        MessageFormat format32 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "format", format32);
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType32.level = defaultLevel;
        types17.add(diagnosticType32);
        DiagnosticType diagnosticType33 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key33 = "JSC_INTERFACE_METHOD_OVERRIDE";
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "key", key33);
        MessageFormat format33 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "format", format33);
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType33.level = defaultLevel;
        types17.add(diagnosticType33);
        DiagnosticType diagnosticType34 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key34 = "JSC_WRONG_ARGUMENT_COUNT";
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "key", key34);
        MessageFormat format34 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "format", format34);
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType34.level = defaultLevel;
        types17.add(diagnosticType34);
        DiagnosticType diagnosticType35 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key35 = "JSC_MISSING_EXTENDS_TAG";
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "key", key35);
        MessageFormat format35 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "format", format35);
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType35.level = defaultLevel;
        types17.add(diagnosticType35);
        DiagnosticType diagnosticType36 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key36 = "JSC_DETERMINISTIC_TEST";
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "key", key36);
        MessageFormat format36 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "format", format36);
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType36.level = defaultLevel;
        types17.add(diagnosticType36);
        types17.add(diagnosticType26);
        DiagnosticType diagnosticType37 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key37 = "JSC_ENUM_DUP";
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "key", key37);
        MessageFormat format37 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "format", format37);
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType37.level = defaultLevel2;
        types17.add(diagnosticType37);
        DiagnosticType diagnosticType38 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key38 = "JSC_CONFLICTING_IMPLEMENTED_TYPE";
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "key", key38);
        MessageFormat format38 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "format", format38);
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType38.level = defaultLevel;
        types17.add(diagnosticType38);
        DiagnosticType diagnosticType39 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key39 = "JSC_INTERFACE_METHOD_NOT_IMPLEMENTED";
        setField(diagnosticType39, "com.google.javascript.jscomp.DiagnosticType", "key", key39);
        MessageFormat format39 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType39, "com.google.javascript.jscomp.DiagnosticType", "format", format39);
        setField(diagnosticType39, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType39.level = defaultLevel;
        types17.add(diagnosticType39);
        DiagnosticType diagnosticType40 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key40 = "JSC_UNKNOWN_LENDS";
        setField(diagnosticType40, "com.google.javascript.jscomp.DiagnosticType", "key", key40);
        MessageFormat format40 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType40, "com.google.javascript.jscomp.DiagnosticType", "format", format40);
        setField(diagnosticType40, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType40.level = defaultLevel;
        types17.add(diagnosticType40);
        DiagnosticType diagnosticType41 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key41 = "JSC_THIS_TYPE_NON_OBJECT";
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "key", key41);
        MessageFormat format41 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "format", format41);
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType41.level = defaultLevel;
        types17.add(diagnosticType41);
        types17.add(diagnosticType15);
        DiagnosticType diagnosticType42 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key42 = "JSC_HIDDEN_SUPERCLASS_PROPERTY_MISMATCH";
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "key", key42);
        MessageFormat format42 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "format", format42);
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType42.level = defaultLevel;
        types17.add(diagnosticType42);
        DiagnosticType diagnosticType43 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key43 = "JSC_IFACE_INITIALIZER_NOT_IFACE";
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "key", key43);
        MessageFormat format43 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "format", format43);
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType43.level = defaultLevel;
        types17.add(diagnosticType43);
        DiagnosticType diagnosticType44 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key44 = "JSC_ENUM_NOT_CONSTANT";
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "key", key44);
        MessageFormat format44 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "format", format44);
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType44.level = defaultLevel;
        types17.add(diagnosticType44);
        DiagnosticType diagnosticType45 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key45 = "JSC_DUP_VAR_DECLARATION";
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "key", key45);
        MessageFormat format45 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "format", format45);
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType45.level = defaultLevel;
        types17.add(diagnosticType45);
        DiagnosticType diagnosticType46 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key46 = "JSC_BAD_TYPE_FOR_BIT_OPERATION";
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "key", key46);
        MessageFormat format46 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "format", format46);
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType46.level = defaultLevel;
        types17.add(diagnosticType46);
        DiagnosticType diagnosticType47 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key47 = "JSC_INVALID_INTERFACE_MEMBER_DECLARATION";
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "key", key47);
        MessageFormat format47 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "format", format47);
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType47.level = defaultLevel;
        types17.add(diagnosticType47);
        DiagnosticType diagnosticType48 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key48 = "JSC_ILLEGAL_IMPLICIT_CAST";
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "key", key48);
        MessageFormat format48 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "format", format48);
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType48.level = defaultLevel;
        types17.add(diagnosticType48);
        DiagnosticType diagnosticType49 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key49 = "JSC_EXPECTED_THIS_TYPE";
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "key", key49);
        MessageFormat format49 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "format", format49);
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType49.level = defaultLevel;
        types17.add(diagnosticType49);
        DiagnosticType diagnosticType50 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key50 = "JSC_HIDDEN_PROPERTY_MISMATCH";
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "key", key50);
        MessageFormat format50 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "format", format50);
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType50.level = defaultLevel;
        types17.add(diagnosticType50);
        DiagnosticType diagnosticType51 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key51 = "JSC_INTERFACE_FUNCTION_NOT_EMPTY";
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "key", key51);
        MessageFormat format51 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "format", format51);
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType51.level = defaultLevel;
        types17.add(diagnosticType51);
        DiagnosticType diagnosticType52 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key52 = "JSC_HIDDEN_SUPERCLASS_PROPERTY";
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "key", key52);
        MessageFormat format52 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "format", format52);
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType52.level = defaultLevel;
        types17.add(diagnosticType52);
        DiagnosticType diagnosticType53 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key53 = "JSC_TYPE_MISMATCH";
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "key", key53);
        MessageFormat format53 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "format", format53);
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType53.level = defaultLevel;
        types17.add(diagnosticType53);
        DiagnosticType diagnosticType54 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key54 = "JSC_UNRESOLVED_TYPE";
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "key", key54);
        MessageFormat format54 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "format", format54);
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType54.level = defaultLevel;
        types17.add(diagnosticType54);
        DiagnosticType diagnosticType55 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key55 = "JSC_TYPE_PARSE_ERROR";
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "key", key55);
        MessageFormat format55 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "format", format55);
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType55.level = defaultLevel;
        types17.add(diagnosticType55);
        DiagnosticType diagnosticType56 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key56 = "JSC_DETERMINISTIC_TEST_NO_RESULT";
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "key", key56);
        MessageFormat format56 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "format", format56);
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType56.level = defaultLevel;
        types17.add(diagnosticType56);
        DiagnosticType diagnosticType57 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key57 = "JSC_MULTIPLE_VAR_DEF";
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "key", key57);
        MessageFormat format57 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "format", format57);
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType57.level = defaultLevel;
        types17.add(diagnosticType57);
        DiagnosticType diagnosticType58 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key58 = "JSC_CTOR_INITIALIZER_NOT_CTOR";
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "key", key58);
        MessageFormat format58 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "format", format58);
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType58.level = defaultLevel;
        types17.add(diagnosticType58);
        DiagnosticType diagnosticType59 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key59 = "JSC_INEXISTENT_ENUM_ELEMENT";
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "key", key59);
        MessageFormat format59 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "format", format59);
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType59.level = defaultLevel;
        types17.add(diagnosticType59);
        DiagnosticType diagnosticType60 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key60 = "JSC_INCOMPATIBLE_EXTENDED_PROPERTY_TYPE";
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "key", key60);
        MessageFormat format60 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "format", format60);
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType60.level = defaultLevel;
        types17.add(diagnosticType60);
        DiagnosticType diagnosticType61 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key61 = "JSC_FUNCTION_MASKS_VARIABLE";
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "key", key61);
        MessageFormat format61 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "format", format61);
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType61.level = defaultLevel;
        types17.add(diagnosticType61);
        DiagnosticType diagnosticType62 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key62 = "JSC_IMPLEMENTS_NON_INTERFACE";
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "key", key62);
        MessageFormat format62 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "format", format62);
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType62.level = defaultLevel;
        types17.add(diagnosticType62);
        DiagnosticType diagnosticType63 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key63 = "JSC_NOT_FUNCTION_TYPE";
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "key", key63);
        MessageFormat format63 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "format", format63);
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType63.level = defaultLevel;
        types17.add(diagnosticType63);
        DiagnosticType diagnosticType64 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key64 = "JSC_NOT_A_CONSTRUCTOR";
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "key", key64);
        MessageFormat format64 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "format", format64);
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType64.level = defaultLevel;
        types17.add(diagnosticType64);
        DiagnosticType diagnosticType65 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key65 = "JSC_UNKNOWN_EXPR_TYPE";
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "key", key65);
        MessageFormat format65 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "format", format65);
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType65.level = defaultLevel;
        types17.add(diagnosticType65);
        DiagnosticType diagnosticType66 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key66 = "JSC_LENDS_ON_NON_OBJECT";
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "key", key66);
        MessageFormat format66 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "format", format66);
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType66.level = defaultLevel;
        types17.add(diagnosticType66);
        DiagnosticType diagnosticType67 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key67 = "JSC_CONFLICTING_EXTENDED_TYPE";
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "key", key67);
        MessageFormat format67 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "format", format67);
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType67.level = defaultLevel;
        types17.add(diagnosticType67);
        DiagnosticType diagnosticType68 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key68 = "JSC_CONSTRUCTOR_NOT_CALLABLE";
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "key", key68);
        MessageFormat format68 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "format", format68);
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType68.level = defaultLevel;
        types17.add(diagnosticType68);
        DiagnosticType diagnosticType69 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key69 = "JSC_UNKNOWN_OVERRIDE";
        setField(diagnosticType69, "com.google.javascript.jscomp.DiagnosticType", "key", key69);
        MessageFormat format69 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType69, "com.google.javascript.jscomp.DiagnosticType", "format", format69);
        setField(diagnosticType69, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType69.level = defaultLevel;
        types17.add(diagnosticType69);
        setField(checkTypes, "com.google.javascript.jscomp.DiagnosticGroup", "types", types17);
        String name17 = "checkTypes";
        setField(checkTypes, "com.google.javascript.jscomp.DiagnosticGroup", "name", name17);
        DiagnosticGroups.CHECK_TYPES = checkTypes;
        DiagnosticGroup checkVariables = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types18 = new LinkedHashSet();
        types18.add(diagnosticType28);
        DiagnosticType diagnosticType70 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key70 = "JSC_VAR_MULTIPLY_DECLARED_ERROR";
        setField(diagnosticType70, "com.google.javascript.jscomp.DiagnosticType", "key", key70);
        MessageFormat format70 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType70, "com.google.javascript.jscomp.DiagnosticType", "format", format70);
        setField(diagnosticType70, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType70.level = defaultLevel2;
        types18.add(diagnosticType70);
        setField(checkVariables, "com.google.javascript.jscomp.DiagnosticGroup", "types", types18);
        String name18 = "checkVars";
        setField(checkVariables, "com.google.javascript.jscomp.DiagnosticGroup", "name", name18);
        DiagnosticGroups.CHECK_VARIABLES = checkVariables;
        DiagnosticGroup checkUselessCode = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types19 = new LinkedHashSet();
        DiagnosticType diagnosticType71 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key71 = "JSC_USELESS_CODE";
        setField(diagnosticType71, "com.google.javascript.jscomp.DiagnosticType", "key", key71);
        MessageFormat format71 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType71, "com.google.javascript.jscomp.DiagnosticType", "format", format71);
        setField(diagnosticType71, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType71.level = defaultLevel;
        types19.add(diagnosticType71);
        DiagnosticType diagnosticType72 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key72 = "JSC_UNREACHABLE_CODE";
        setField(diagnosticType72, "com.google.javascript.jscomp.DiagnosticType", "key", key72);
        MessageFormat format72 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType72, "com.google.javascript.jscomp.DiagnosticType", "format", format72);
        setField(diagnosticType72, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType72.level = defaultLevel2;
        types19.add(diagnosticType72);
        setField(checkUselessCode, "com.google.javascript.jscomp.DiagnosticGroup", "types", types19);
        String name19 = "uselessCode";
        setField(checkUselessCode, "com.google.javascript.jscomp.DiagnosticGroup", "name", name19);
        DiagnosticGroups.CHECK_USELESS_CODE = checkUselessCode;
        DiagnosticGroup const1 = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types20 = new LinkedHashSet();
        types20.add(diagnosticType12);
        types20.add(diagnosticType13);
        DiagnosticType diagnosticType73 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key73 = "JSC_CONSTANT_REASSIGNED_VALUE_ERROR";
        setField(diagnosticType73, "com.google.javascript.jscomp.DiagnosticType", "key", key73);
        MessageFormat format73 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType73, "com.google.javascript.jscomp.DiagnosticType", "format", format73);
        setField(diagnosticType73, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType73.level = defaultLevel2;
        types20.add(diagnosticType73);
        setField(const1, "com.google.javascript.jscomp.DiagnosticGroup", "types", types20);
        String name20 = "const";
        setField(const1, "com.google.javascript.jscomp.DiagnosticGroup", "name", name20);
        DiagnosticGroups.CONST = const1;
        DiagnosticGroup typeInvalidation = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types21 = new LinkedHashSet();
        DiagnosticType diagnosticType74 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key74 = "JSC_INVALIDATION";
        setField(diagnosticType74, "com.google.javascript.jscomp.DiagnosticType", "key", key74);
        MessageFormat format74 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType74, "com.google.javascript.jscomp.DiagnosticType", "format", format74);
        setField(diagnosticType74, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType74.level = defaultLevel1;
        types21.add(diagnosticType74);
        setField(typeInvalidation, "com.google.javascript.jscomp.DiagnosticGroup", "types", types21);
        String name21 = "typeInvalidation";
        setField(typeInvalidation, "com.google.javascript.jscomp.DiagnosticGroup", "name", name21);
        DiagnosticGroups.TYPE_INVALIDATION = typeInvalidation;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getFunctionalInformationMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFunctionalInformationMap()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getFunctionalInformationMap()}
 * @utbot.returnsFrom {@code return functionInformationMap;}
 *  */
    @Test
    public void testGetFunctionalInformationMap_ReturnFunctionInformationMap() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        FunctionInformationMap actual = compiler.getFunctionalInformationMap();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.removeChangeHandler
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: codeChangeHandlers.remove(handler);
 *  */
    @Test
    public void testRemoveChangeHandler_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.removeChangeHandler] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.removeChangeHandler(Compiler.java:1647) */
        compiler.removeChangeHandler(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)
    
    @Test
    public void testRemoveChangeHandler1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        compiler.removeChangeHandler(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getTypedScopeCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypedScopeCreator()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getTypedScopeCreator()}
 * @utbot.returnsFrom {@code return getPassConfig().getTypedScopeCreator();}
 *  */
    @Test
    public void testGetTypedScopeCreator_ReturnGetPassConfigGetTypedScopeCreator() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        DefaultPassConfig passes = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        ScopeCreator actual = compiler.getTypedScopeCreator();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getTypedScopeCreator()}
 * @utbot.returnsFrom {@code return getPassConfig().getTypedScopeCreator();}
 *  */
    @Test
    public void testGetTypedScopeCreator_ReturnGetPassConfigGetTypedScopeCreator_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassConfig.PassConfigDelegate passes = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        PassConfig.PassConfigDelegate delegate = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        DefaultPassConfig delegate1 = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(delegate, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate1);
        setField(passes, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        ScopeCreator actual = compiler.getTypedScopeCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTypedScopeCreator()
    
    @Test
    public void testGetTypedScopeCreator1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        PassConfig initialCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        ScopeCreator actual = compiler.getTypedScopeCreator();
        
        assertNull(actual);
        
        PassConfig finalCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        assertFalse(initialCompilerPasses == finalCompilerPasses);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTypedScopeCreator()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTypedScopeCreator2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassConfig.PassConfigDelegate passes = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        setField(passes, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", passes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        compiler.getTypedScopeCreator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getReverseAbstractInterpreter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReverseAbstractInterpreter()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getReverseAbstractInterpreter()}
 * @utbot.executesCondition {@code (abstractInterpreter == null): False}
 * @utbot.returnsFrom {@code return abstractInterpreter;}
 *  */
    @Test
    public void testGetReverseAbstractInterpreter_AbstractInterpreterNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        SemanticReverseAbstractInterpreter abstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter", abstractInterpreter);
        
        SemanticReverseAbstractInterpreter actual = ((SemanticReverseAbstractInterpreter) compiler.getReverseAbstractInterpreter());
        
        Function actualINEQ = ((Function) getFieldValue(actual, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ"));
        assertNull(actualINEQ);
        
        CodingConvention actualConvention = actual.convention;
        assertNull(actualConvention);
        
        JSTypeRegistry actualTypeRegistry = actual.typeRegistry;
        assertNull(actualTypeRegistry);
        
        ChainableReverseAbstractInterpreter actualFirstLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink"));
        assertNull(actualFirstLink);
        
        ChainableReverseAbstractInterpreter actualNextLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink"));
        assertNull(actualNextLink);
        
        Visitor actualRestrictUndefinedVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        assertNull(actualRestrictUndefinedVisitor);
        
        Visitor actualRestrictNullVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        assertNull(actualRestrictNullVisitor);
        
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getReverseAbstractInterpreter()}
 * @utbot.executesCondition {@code (abstractInterpreter == null): True}
 * @utbot.executesCondition {@code (options.closurePass): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getTypeRegistry()}
 * @utbot.returnsFrom {@code return abstractInterpreter;}
 *  */
    @Test
    public void testGetReverseAbstractInterpreter_NotOptionsClosurePass() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        DefaultCodingConvention defaultCodingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        
        ReverseAbstractInterpreter initialCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        
        SemanticReverseAbstractInterpreter actual = ((SemanticReverseAbstractInterpreter) compiler.getReverseAbstractInterpreter());
        
        SemanticReverseAbstractInterpreter expected = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        Function ineq = ((Function) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$5"));
        setField(ineq, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$5", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ", ineq);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "convention", defaultCodingConvention);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink", expected);
        Visitor restrictUndefinedVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1"));
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        Visitor restrictNullVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2"));
        setField(restrictNullVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        
        Function expectedINEQ = ((Function) getFieldValue(expected, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ"));
        Function actualINEQ = ((Function) getFieldValue(actual, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ"));
        
        CodingConvention expectedConvention = expected.convention;
        CodingConvention actualConvention = actual.convention;
        
        JSTypeRegistry expectedTypeRegistry = expected.typeRegistry;
        JSTypeRegistry actualTypeRegistry = actual.typeRegistry;
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        assertNull(actualTypeRegistryNativeTypes);
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTypeRegistryTemplateType);
        
        boolean actualTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode actualTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertNull(actualTypeRegistryResolveMode);
        
        ChainableReverseAbstractInterpreter expectedFirstLink = ((ChainableReverseAbstractInterpreter) getFieldValue(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink"));
        ChainableReverseAbstractInterpreter actualFirstLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink"));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        ChainableReverseAbstractInterpreter actualFirstLinkNextLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink"));
        assertNull(actualFirstLinkNextLink);
        
        Visitor expectedFirstLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(expectedFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        Visitor actualFirstLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        
        Visitor expectedFirstLinkRestrictNullVisitor = ((Visitor) getFieldValue(expectedFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        Visitor actualFirstLinkRestrictNullVisitor = ((Visitor) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        ReverseAbstractInterpreter finalCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        
        assertFalse(initialCompilerAbstractInterpreter == finalCompilerAbstractInterpreter);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getReverseAbstractInterpreter()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getReverseAbstractInterpreter()}
 * @utbot.executesCondition {@code (abstractInterpreter == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getTypeRegistry()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getCodingConvention()
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetReverseAbstractInterpreter_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        
        compiler.getReverseAbstractInterpreter();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getReverseAbstractInterpreter()
    
    @Test
    public void testGetReverseAbstractInterpreter1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        
        ReverseAbstractInterpreter initialCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        
        SemanticReverseAbstractInterpreter actual = ((SemanticReverseAbstractInterpreter) compiler.getReverseAbstractInterpreter());
        
        SemanticReverseAbstractInterpreter expected = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        Function ineq = ((Function) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$5"));
        setField(ineq, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$5", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ", ineq);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "convention", codingConvention);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink", expected);
        Visitor restrictUndefinedVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1"));
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        Visitor restrictNullVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2"));
        setField(restrictNullVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        
        Function expectedINEQ = ((Function) getFieldValue(expected, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ"));
        Function actualINEQ = ((Function) getFieldValue(actual, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ"));
        
        CodingConvention expectedConvention = expected.convention;
        CodingConvention actualConvention = actual.convention;
        
        JSTypeRegistry expectedTypeRegistry = expected.typeRegistry;
        JSTypeRegistry actualTypeRegistry = actual.typeRegistry;
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        assertNull(actualTypeRegistryNativeTypes);
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTypeRegistryTemplateType);
        
        boolean actualTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode actualTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertNull(actualTypeRegistryResolveMode);
        
        ChainableReverseAbstractInterpreter expectedFirstLink = ((ChainableReverseAbstractInterpreter) getFieldValue(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink"));
        ChainableReverseAbstractInterpreter actualFirstLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink"));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        ChainableReverseAbstractInterpreter actualFirstLinkNextLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink"));
        assertNull(actualFirstLinkNextLink);
        
        Visitor expectedFirstLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(expectedFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        Visitor actualFirstLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        
        Visitor expectedFirstLinkRestrictNullVisitor = ((Visitor) getFieldValue(expectedFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        Visitor actualFirstLinkRestrictNullVisitor = ((Visitor) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        ReverseAbstractInterpreter finalCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        
        assertFalse(initialCompilerAbstractInterpreter == finalCompilerAbstractInterpreter);
    }
    
    @Test
    public void testGetReverseAbstractInterpreter2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.closurePass = true;
        compiler.options = options;
        DefaultCodingConvention defaultCodingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        
        ReverseAbstractInterpreter initialCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        
        ClosureReverseAbstractInterpreter actual = ((ClosureReverseAbstractInterpreter) compiler.getReverseAbstractInterpreter());
        
        ClosureReverseAbstractInterpreter expected = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor restrictToArrayVisitor = ((ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$1"));
        setField(restrictToArrayVisitor, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$1", "this$0", expected);
        setField(restrictToArrayVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTrueTypeOfResultVisitor", "this$0", expected);
        setField(restrictToArrayVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToArrayVisitor", restrictToArrayVisitor);
        ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor restrictToNotArrayVisitor = ((ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$2"));
        setField(restrictToNotArrayVisitor, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$2", "this$0", expected);
        setField(restrictToNotArrayVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByFalseTypeOfResultVisitor", "this$0", expected);
        setField(restrictToNotArrayVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToNotArrayVisitor", restrictToNotArrayVisitor);
        ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor restrictToObjectVisitor = ((ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$3"));
        setField(restrictToObjectVisitor, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$3", "this$0", expected);
        setField(restrictToObjectVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTrueTypeOfResultVisitor", "this$0", expected);
        setField(restrictToObjectVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToObjectVisitor", restrictToObjectVisitor);
        ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor restrictToNotObjectVisitor = ((ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$4"));
        setField(restrictToNotObjectVisitor, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$4", "this$0", expected);
        setField(restrictToNotObjectVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByFalseTypeOfResultVisitor", "this$0", expected);
        setField(restrictToNotObjectVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToNotObjectVisitor", restrictToNotObjectVisitor);
        Map restricters = new LinkedHashMap();
        String string = "isDef";
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$13"));
        setField(anonymousFunction, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$13", "this$0", expected);
        restricters.put(string, anonymousFunction);
        String string1 = "isNull";
        Function anonymousFunction1 = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$12"));
        setField(anonymousFunction1, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$12", "this$0", expected);
        restricters.put(string1, anonymousFunction1);
        String string2 = "isDefAndNotNull";
        Function anonymousFunction2 = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$11"));
        setField(anonymousFunction2, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$11", "this$0", expected);
        restricters.put(string2, anonymousFunction2);
        String string3 = "isString";
        Function anonymousFunction3 = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10"));
        setField(anonymousFunction3, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$10", "this$0", expected);
        restricters.put(string3, anonymousFunction3);
        String string4 = "isBoolean";
        Function anonymousFunction4 = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$9"));
        setField(anonymousFunction4, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$9", "this$0", expected);
        restricters.put(string4, anonymousFunction4);
        String string5 = "isNumber";
        Function anonymousFunction5 = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$8"));
        setField(anonymousFunction5, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$8", "this$0", expected);
        restricters.put(string5, anonymousFunction5);
        String string6 = "isFunction";
        Function anonymousFunction6 = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$7"));
        setField(anonymousFunction6, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$7", "this$0", expected);
        restricters.put(string6, anonymousFunction6);
        String string7 = "isArray";
        Function anonymousFunction7 = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$6"));
        setField(anonymousFunction7, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$6", "this$0", expected);
        restricters.put(string7, anonymousFunction7);
        String string8 = "isObject";
        Function anonymousFunction8 = ((Function) createInstance("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$5"));
        setField(anonymousFunction8, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$5", "this$0", expected);
        restricters.put(string8, anonymousFunction8);
        setField(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restricters", restricters);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "convention", defaultCodingConvention);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink", expected);
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter"));
        Function ineq = ((Function) createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$5"));
        setField(ineq, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$5", "this$0", nextLink);
        setField(nextLink, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ", ineq);
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "convention", defaultCodingConvention);
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink", expected);
        Visitor restrictUndefinedVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1"));
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1", "this$0", nextLink);
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        Visitor restrictNullVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2"));
        setField(restrictNullVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2", "this$0", nextLink);
        setField(nextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Visitor restrictUndefinedVisitor1 = ((Visitor) createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1"));
        setField(restrictUndefinedVisitor1, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor1);
        Visitor restrictNullVisitor1 = ((Visitor) createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2"));
        setField(restrictNullVisitor1, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2", "this$0", expected);
        setField(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor1);
        
        Visitor expectedRestrictToArrayVisitor = ((Visitor) getFieldValue(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToArrayVisitor"));
        Visitor actualRestrictToArrayVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToArrayVisitor"));
        
        Visitor expectedRestrictToNotArrayVisitor = ((Visitor) getFieldValue(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToNotArrayVisitor"));
        Visitor actualRestrictToNotArrayVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToNotArrayVisitor"));
        
        Visitor expectedRestrictToObjectVisitor = ((Visitor) getFieldValue(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToObjectVisitor"));
        Visitor actualRestrictToObjectVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToObjectVisitor"));
        
        Visitor expectedRestrictToNotObjectVisitor = ((Visitor) getFieldValue(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToNotObjectVisitor"));
        Visitor actualRestrictToNotObjectVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restrictToNotObjectVisitor"));
        
        Map expectedRestricters = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restricters"));
        Map actualRestricters = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "restricters"));
        assertTrue(deepEquals(expectedRestricters, actualRestricters));
        
        CodingConvention expectedConvention = expected.convention;
        CodingConvention actualConvention = actual.convention;
        
        JSTypeRegistry expectedTypeRegistry = expected.typeRegistry;
        JSTypeRegistry actualTypeRegistry = actual.typeRegistry;
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        assertNull(actualTypeRegistryNativeTypes);
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTypeRegistryTemplateType);
        
        boolean actualTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode actualTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertNull(actualTypeRegistryResolveMode);
        
        ChainableReverseAbstractInterpreter expectedFirstLink = ((ChainableReverseAbstractInterpreter) getFieldValue(expected, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink"));
        ChainableReverseAbstractInterpreter actualFirstLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "firstLink"));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        assertTrue(deepEquals(expectedFirstLink, actualFirstLink));
        ChainableReverseAbstractInterpreter expectedFirstLinkNextLink = ((ChainableReverseAbstractInterpreter) getFieldValue(expectedFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink"));
        ChainableReverseAbstractInterpreter actualFirstLinkNextLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink"));
        Function expectedFirstLinkNextLinkINEQ = ((Function) getFieldValue(expectedFirstLinkNextLink, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ"));
        Function actualFirstLinkNextLinkINEQ = ((Function) getFieldValue(actualFirstLinkNextLink, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", "INEQ"));
        
        assertTrue(deepEquals(expectedFirstLinkNextLink, actualFirstLinkNextLink));
        assertTrue(deepEquals(expectedFirstLinkNextLink, actualFirstLinkNextLink));
        assertTrue(deepEquals(expectedFirstLinkNextLink, actualFirstLinkNextLink));
        ChainableReverseAbstractInterpreter actualFirstLinkNextLinkNextLink = ((ChainableReverseAbstractInterpreter) getFieldValue(actualFirstLinkNextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "nextLink"));
        assertNull(actualFirstLinkNextLinkNextLink);
        
        Visitor expectedFirstLinkNextLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(expectedFirstLinkNextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        Visitor actualFirstLinkNextLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(actualFirstLinkNextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        
        Visitor expectedFirstLinkNextLinkRestrictNullVisitor = ((Visitor) getFieldValue(expectedFirstLinkNextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        Visitor actualFirstLinkNextLinkRestrictNullVisitor = ((Visitor) getFieldValue(actualFirstLinkNextLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        
        Visitor expectedFirstLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(expectedFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        Visitor actualFirstLinkRestrictUndefinedVisitor = ((Visitor) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor"));
        
        Visitor expectedFirstLinkRestrictNullVisitor = ((Visitor) getFieldValue(expectedFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        Visitor actualFirstLinkRestrictNullVisitor = ((Visitor) getFieldValue(actualFirstLink, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "restrictNullVisitor"));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        ReverseAbstractInterpreter finalCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        
        assertFalse(initialCompilerAbstractInterpreter == finalCompilerAbstractInterpreter);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.areNodesEqualForInlining
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n1.isEquivalentToTyped(n2);}
 *  */
    @Test
    public void testAreNodesEqualForInlining_OptionsAmbiguatePropertiesOrOptionsDisambiguateProperties() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Node node = new Node(254);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        boolean actual = compiler.areNodesEqualForInlining(node, scriptOrFnNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isEquivalentTo(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n1.isEquivalentTo(n2);}
 *  */
    @Test
    public void testAreNodesEqualForInlining_OptionsAmbiguatePropertiesOrOptionsDisambiguateProperties_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node node = new Node(-1);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        boolean actual = compiler.areNodesEqualForInlining(node, scriptOrFnNode);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n1.isEquivalentToTyped(n2);}
 *  */
    @Test
    public void testAreNodesEqualForInlining_OptionsAmbiguatePropertiesOrOptionsDisambiguateProperties_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Node node = new Node(-255);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = compiler.areNodesEqualForInlining(node, scriptOrFnNode);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (options.ambiguateProperties || options.disambiguateProperties): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n1.isEquivalentToTyped(n2);
 *  */
    @Test
    public void testAreNodesEqualForInlining_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:941) */
        compiler.areNodesEqualForInlining(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (options.ambiguateProperties || options.disambiguateProperties): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n1.isEquivalentToTyped(n2);
 *  */
    @Test
    public void testAreNodesEqualForInlining_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:941) */
        compiler.areNodesEqualForInlining(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (options.ambiguateProperties || options.disambiguateProperties): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isEquivalentTo(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n1.isEquivalentTo(n2);
 *  */
    @Test
    public void testAreNodesEqualForInlining_ThrowNullPointerException_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:943) */
        compiler.areNodesEqualForInlining(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.ambiguateProperties || options.disambiguateProperties
 *  */
    @Test
    public void testAreNodesEqualForInlining_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:937) */
        compiler.areNodesEqualForInlining(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testAreNodesEqualForInlining1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(1);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", stringNodeType, stringNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = stringNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", stringNodeType, stringNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = stringNode;
        areNodesEqualForInliningMethodArguments[1] = scriptOrFnNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", stringNodeType, stringNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = stringNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", nodeType, nodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = node;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", nodeType, nodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = node;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", nodeType, nodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = node;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", nodeType, nodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = node;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        boolean actual = compiler.areNodesEqualForInlining(node, scriptOrFnNode);
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", scriptOrFnNodeType, scriptOrFnNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = scriptOrFnNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        
        boolean actual = compiler.areNodesEqualForInlining(scriptOrFnNode, scriptOrFnNode1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        
        boolean actual = compiler.areNodesEqualForInlining(scriptOrFnNode, scriptOrFnNode1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining12() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = compiler.areNodesEqualForInlining(scriptOrFnNode, scriptOrFnNode);
        
        assertTrue(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining13() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", node);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", nodeType, nodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = node;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testAreNodesEqualForInlining14() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.isEquivalentTo(Node.java:1600)
            com.google.javascript.rhino.Node$NumberNode.isEquivalentTo(Node.java:266)
            com.google.javascript.rhino.Node.isEquivalentToTyped(Node.java:1590)
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:941) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", numberNodeType, numberNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = numberNode;
        areNodesEqualForInliningMethodArguments[1] = ((Object) null);
        try {
            areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAreNodesEqualForInlining15() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.isEquivalentTo(Node.java:1600)
            com.google.javascript.rhino.Node$NumberNode.isEquivalentTo(Node.java:266)
            com.google.javascript.rhino.Node.isEquivalentToTyped(Node.java:1590)
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:941) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", numberNodeType, numberNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = numberNode;
        areNodesEqualForInliningMethodArguments[1] = ((Object) null);
        try {
            areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testAreNodesEqualForInlining16() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        compiler.areNodesEqualForInlining(node, scriptOrFnNode);
    }
    
    @Test(timeout = 1000L)
    public void testAreNodesEqualForInlining17() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", node);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", nodeType, nodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = node;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        try {
            areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testAreNodesEqualForInlining18() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", scriptOrFnNodeType, scriptOrFnNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = scriptOrFnNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        try {
            areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.initCompilerOptionsIfTesting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initCompilerOptionsIfTesting()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initCompilerOptionsIfTesting()}
 * @utbot.executesCondition {@code (options == null): False}
 *  */
    @Test
    public void testInitCompilerOptionsIfTesting_OptionsNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        compiler.initCompilerOptionsIfTesting();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getExternsForTesting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getExternsForTesting()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getExternsForTesting()}
 * @utbot.returnsFrom {@code return externs;}
 *  */
    @Test
    public void testGetExternsForTesting_ReturnExterns() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        List actual = compiler.getExternsForTesting();
        
        assertNull(actual);
        
        List finalCompilerExterns = ((List) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "externs"));
        
        assertNull(finalCompilerExterns);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.recordFunctionInformation
    
    ///region OTHER: ERROR SUITE for method recordFunctionInformation()
    
    @Test
    public void testRecordFunctionInformation1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.recordFunctionInformation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:859)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:837)
            com.google.javascript.jscomp.Compiler.recordFunctionInformation(Compiler.java:1626) */
        compiler.recordFunctionInformation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getInputsForTesting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInputsForTesting()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getInputsForTesting()}
 * @utbot.returnsFrom {@code return inputs;}
 *  */
    @Test
    public void testGetInputsForTesting_ReturnInputs() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        List actual = compiler.getInputsForTesting();
        
        assertNull(actual);
        
        List finalCompilerInputs = ((List) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "inputs"));
        
        assertNull(finalCompilerInputs);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getUniqueNameIdSupplier
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUniqueNameIdSupplier()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getUniqueNameIdSupplier()}
 * @utbot.returnsFrom {@code return new Supplier<String>() {
 * 
 *     public String get() {
 *         return String.valueOf(self.nextUniqueNameId());
 *     }
 * };}
 *  */
    @Test
    public void testGetUniqueNameIdSupplier_Return() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        Supplier actual = compiler.getUniqueNameIdSupplier();
        
        Supplier expected = ((Supplier) createInstance("com.google.javascript.jscomp.Compiler$4"));
        setField(expected, "com.google.javascript.jscomp.Compiler$4", "val$self", compiler);
        setField(expected, "com.google.javascript.jscomp.Compiler$4", "this$0", compiler);
        
        Compiler expectedVal$self = ((Compiler) getFieldValue(expected, "com.google.javascript.jscomp.Compiler$4", "val$self"));
        Compiler actualVal$self = ((Compiler) getFieldValue(actual, "com.google.javascript.jscomp.Compiler$4", "val$self"));
        CompilerOptions actualVal$selfOptions = actualVal$self.options;
        assertNull(actualVal$selfOptions);
        
        PassConfig actualVal$selfPasses = ((PassConfig) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualVal$selfPasses);
        
        List actualVal$selfExterns = ((List) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "externs"));
        assertNull(actualVal$selfExterns);
        
        List actualVal$selfModules = ((List) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "modules"));
        assertNull(actualVal$selfModules);
        
        JSModuleGraph actualVal$selfModuleGraph = actualVal$self.getModuleGraph();
        assertNull(actualVal$selfModuleGraph);
        
        List actualVal$selfInputs = ((List) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "inputs"));
        assertNull(actualVal$selfInputs);
        
        ErrorManager actualVal$selfErrorManager = actualVal$self.getErrorManager();
        assertNull(actualVal$selfErrorManager);
        
        WarningsGuard actualVal$selfWarningsGuard = ((WarningsGuard) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "warningsGuard"));
        assertNull(actualVal$selfWarningsGuard);
        
        Node actualVal$selfExternsRoot = actualVal$self.externsRoot;
        assertNull(actualVal$selfExternsRoot);
        
        Node actualVal$selfJsRoot = actualVal$self.jsRoot;
        assertNull(actualVal$selfJsRoot);
        
        Node actualVal$selfExternAndJsRoot = actualVal$self.externAndJsRoot;
        assertNull(actualVal$selfExternAndJsRoot);
        
        Map actualVal$selfInputsByName = ((Map) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "inputsByName"));
        assertNull(actualVal$selfInputsByName);
        
        SourceMap actualVal$selfSourceMap = actualVal$self.getSourceMap();
        assertNull(actualVal$selfSourceMap);
        
        String actualVal$selfExternExports = ((String) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "externExports"));
        assertNull(actualVal$selfExternExports);
        
        int expectedVal$selfUniqueNameId = ((Integer) getFieldValue(expectedVal$self, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        int actualVal$selfUniqueNameId = ((Integer) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        assertEquals(expectedVal$selfUniqueNameId, actualVal$selfUniqueNameId);
        
        boolean actualVal$selfUseThreads = ((Boolean) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualVal$selfUseThreads);
        
        boolean actualVal$selfHasRegExpGlobalReferences = ((Boolean) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences"));
        assertFalse(actualVal$selfHasRegExpGlobalReferences);
        
        FunctionInformationMap actualVal$selfFunctionInformationMap = ((FunctionInformationMap) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "functionInformationMap"));
        assertNull(actualVal$selfFunctionInformationMap);
        
        StringBuilder actualVal$selfDebugLog = ((StringBuilder) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "debugLog"));
        assertNull(actualVal$selfDebugLog);
        
        CodingConvention actualVal$selfDefaultCodingConvention = actualVal$self.defaultCodingConvention;
        assertNull(actualVal$selfDefaultCodingConvention);
        
        JSTypeRegistry actualVal$selfTypeRegistry = actualVal$self.getTypeRegistry();
        assertNull(actualVal$selfTypeRegistry);
        
        Config actualVal$selfParserConfig = actualVal$self.getParserConfig();
        assertNull(actualVal$selfParserConfig);
        
        ReverseAbstractInterpreter actualVal$selfAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        assertNull(actualVal$selfAbstractInterpreter);
        
        TypeValidator actualVal$selfTypeValidator = actualVal$self.getTypeValidator();
        assertNull(actualVal$selfTypeValidator);
        
        PerformanceTracker actualVal$selfTracker = actualVal$self.tracker;
        assertNull(actualVal$selfTracker);
        
        ErrorReporter actualVal$selfOldErrorReporter = ((ErrorReporter) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
        assertNull(actualVal$selfOldErrorReporter);
        
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actualVal$selfDefaultErrorReporter = actualVal$self.getDefaultErrorReporter();
        assertNull(actualVal$selfDefaultErrorReporter);
        
        PrintStream actualVal$selfOutStream = ((PrintStream) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "outStream"));
        assertNull(actualVal$selfOutStream);
        
        GlobalVarReferenceMap actualVal$selfGlobalRefMap = ((GlobalVarReferenceMap) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "globalRefMap"));
        assertNull(actualVal$selfGlobalRefMap);
        
        PassFactory actualVal$selfSanityCheck = ((PassFactory) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
        assertNull(actualVal$selfSanityCheck);
        
        Tracer actualVal$selfCurrentTracer = ((Tracer) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        assertNull(actualVal$selfCurrentTracer);
        
        String actualVal$selfCurrentPassName = ((String) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "currentPassName"));
        assertNull(actualVal$selfCurrentPassName);
        
        CodeChangeHandler.RecentChange actualVal$selfRecentChange = actualVal$self.recentChange;
        assertNull(actualVal$selfRecentChange);
        
        List actualVal$selfCodeChangeHandlers = ((List) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
        assertNull(actualVal$selfCodeChangeHandlers);
        
        AbstractCompiler.LifeCycleStage actualVal$selfStage = ((AbstractCompiler.LifeCycleStage) getFieldValue(actualVal$self, "com.google.javascript.jscomp.AbstractCompiler", "stage"));
        assertNull(actualVal$selfStage);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getDefaultErrorReporter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultErrorReporter()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getDefaultErrorReporter()}
 * @utbot.returnsFrom {@code return defaultErrorReporter;}
 *  */
    @Test
    public void testGetDefaultErrorReporter_ReturnDefaultErrorReporter() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actual = compiler.getDefaultErrorReporter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getSourceFileByName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSourceFileByName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getSourceFileByName(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inputsByName.containsKey(sourceName)
 *  */
    @Test
    public void testGetSourceFileByName_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getSourceFileByName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1816) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class stringType = Class.forName("java.lang.String");
        Method getSourceFileByNameMethod = compilerClazz.getDeclaredMethod("getSourceFileByName", stringType);
        getSourceFileByNameMethod.setAccessible(true);
        java.lang.Object[] getSourceFileByNameMethodArguments = new java.lang.Object[1];
        getSourceFileByNameMethodArguments[0] = ((Object) null);
        try {
            getSourceFileByNameMethod.invoke(compiler, getSourceFileByNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSourceFileByName(java.lang.String)
    
    @Test
    public void testGetSourceFileByName1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        String string = "";
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class stringType = Class.forName("java.lang.String");
        Method getSourceFileByNameMethod = compilerClazz.getDeclaredMethod("getSourceFileByName", stringType);
        getSourceFileByNameMethod.setAccessible(true);
        java.lang.Object[] getSourceFileByNameMethodArguments = new java.lang.Object[1];
        getSourceFileByNameMethodArguments[0] = string;
        SourceFile actual = ((SourceFile) getSourceFileByNameMethod.invoke(compiler, getSourceFileByNameMethodArguments));
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields894594852191900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields894594852191900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass894594852197200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields894594852191900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass894594852197200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields894594852585100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields894594852585100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass894594852586800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields894594852585100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass894594852586800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields894594856669700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields894594856669700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass894594856672600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields894594856669700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass894594856672600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields894594857151800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields894594857151800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass894594857153700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields894594857151800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass894594857153700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

