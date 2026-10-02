package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.ArrayList;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.jscomp.ant.AntErrorManager;
import java.io.PrintStream;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import com.google.common.base.Supplier;
import java.util.Map;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.jscomp.CodeChangeHandler.RecentChange;
import java.util.List;
import com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator;
import java.util.Set;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.common.base.Function;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.jstype.JSType;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor;
import com.google.javascript.jscomp.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler;
import java.util.HashSet;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.PassConfig.PassConfigDelegate;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.google.javascript.jscomp.Tracer.InternalClock;
import java.util.LinkedList;
import java.util.ArrayDeque;
import org.junit.Ignore;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_CompilerTest {
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
            com.google.javascript.jscomp.Compiler.getInput(Compiler.java:889) */
        compiler.getInput(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.report
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method report(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (guard != null): False}
 * @utbot.executesCondition {@code (level.isOn()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getWarningsGuard()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CheckLevel#isOn()}
 *  */
    @Test
    public void testReport_NotLevelIsOn() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        CheckLevel level = CheckLevel.OFF;
        setField(jSError, "com.google.javascript.jscomp.JSError", "level", level);
        
        compiler.report(jSError);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method report(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (guard != null): False}
 * @utbot.executesCondition {@code (level.isOn()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#report(com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: errorManager.report(level, error);
 *  */
    @Test
    public void testReport_ThrowUnsupportedOperationException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Object messages = createInstance("java.util.Collections$UnmodifiableNavigableSet$EmptyNavigableSet");
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "messages", messages);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        CheckLevel level = CheckLevel.ERROR;
        setField(jSError, "com.google.javascript.jscomp.JSError", "level", level);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
            com.google.javascript.jscomp.BasicErrorManager.report(BasicErrorManager.java:47)
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1474) */
        compiler.report(jSError);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CheckLevel level = error.level;
 *  */
    @Test
    public void testReport_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1464) */
        compiler.report(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#getWarningsGuard()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WarningsGuard guard = options.getWarningsGuard();
 *  */
    @Test
    public void testReport_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1465) */
        compiler.report(jSError);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (guard != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.CheckLevel#isOn()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: level.isOn()
 *  */
    @Test
    public void testReport_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1473) */
        compiler.report(jSError);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (guard != null): False}
 * @utbot.executesCondition {@code (level.isOn()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.ErrorManager#report(com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: errorManager.report(level, error);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        CheckLevel level = CheckLevel.WARNING;
        setField(jSError, "com.google.javascript.jscomp.JSError", "level", level);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1474) */
        compiler.report(jSError);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method report(com.google.javascript.jscomp.JSError)
    
    @Test
    public void testReport1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Object messages = createInstance("java.util.Collections$SynchronizedSortedSet");
        ArrayList c = new ArrayList();
        setField(messages, "java.util.Collections$SynchronizedCollection", "c", c);
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "messages", messages);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        CheckLevel level = CheckLevel.ERROR;
        setField(jSError, "com.google.javascript.jscomp.JSError", "level", level);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            java.base/java.util.Collections$SynchronizedCollection.add(Collections.java:2104)
            com.google.javascript.jscomp.BasicErrorManager.report(BasicErrorManager.java:47)
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1474) */
        compiler.report(jSError);
    }
    
    @Test
    public void testReport2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ComposeWarningsGuard warningsGuard = ((ComposeWarningsGuard) createInstance("com.google.javascript.jscomp.ComposeWarningsGuard"));
        ArrayList guards = new ArrayList();
        guards.add(null);
        guards.add(null);
        guards.add(null);
        setField(warningsGuard, "com.google.javascript.jscomp.ComposeWarningsGuard", "guards", guards);
        setField(options, "com.google.javascript.jscomp.CompilerOptions", "warningsGuard", warningsGuard);
        compiler.options = options;
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ComposeWarningsGuard.level(ComposeWarningsGuard.java:76)
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1467) */
        compiler.report(jSError);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile(com.google.javascript.jscomp.JSSourceFile, com.google.javascript.jscomp.JSSourceFile, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return compile(extern, new JSSourceFile[] { input }, options);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompile_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        compiler.compile(((JSSourceFile) null), ((JSSourceFile) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile(com.google.javascript.jscomp.JSSourceFile, com.google.javascript.jscomp.JSSourceFile, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile1() throws Exception  {
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
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:405) */
        compiler.compile(((JSSourceFile) null), ((JSSourceFile) null), compilerOptions);
    }
    
    @Test
    public void testCompile2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:405) */
        compiler.compile(((JSSourceFile) null), jSSourceFile, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:405) */
        compiler.compile(((JSSourceFile) null), jSSourceFile, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:405) */
        compiler.compile(jSSourceFile, ((JSSourceFile) null), compilerOptions);
    }
    
    @Test
    public void testCompile5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:405) */
        compiler.compile(jSSourceFile, ((JSSourceFile) null), compilerOptions);
    }
    
    @Test
    public void testCompile6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:405) */
        compiler.compile(((JSSourceFile) null), ((JSSourceFile) null), compilerOptions);
    }
    
    @Test
    public void testCompile7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:405) */
        compiler.compile(jSSourceFile, ((JSSourceFile) null), compilerOptions);
    }
    
    @Test
    public void testCompile8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:405) */
        compiler.compile(((JSSourceFile) null), ((JSSourceFile) null), compilerOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile(com.google.javascript.jscomp.JSSourceFile, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return compile(new JSSourceFile[] { extern }, input, options);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompile_ThrowIllegalStateException1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.jsRoot = jsRoot;
        
        compiler.compile(((JSSourceFile) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile(com.google.javascript.jscomp.JSSourceFile, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410) */
        compiler.compile(((JSSourceFile) null), jSSourceFileArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410) */
        compiler.compile(jSSourceFile, jSSourceFileArray, compilerOptions);
    }
    
    @Test
    public void testCompile11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410) */
        compiler.compile(((JSSourceFile) null), jSSourceFileArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile12() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410) */
        compiler.compile(jSSourceFile, jSSourceFileArray, compilerOptions);
    }
    
    @Test
    public void testCompile13() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410) */
        compiler.compile(((JSSourceFile) null), jSSourceFileArray, compilerOptions);
    }
    
    @Test
    public void testCompile14() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:410) */
        compiler.compile(((JSSourceFile) null), jSSourceFileArray, compilerOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compile()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCompile_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:464) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCompile_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:464) */
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
    public void testCompile15() throws Throwable  {
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
    
    @Test(expected = RuntimeException.class)
    public void testCompile16() throws Throwable  {
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (Preconditions.checkState(jsRoot == null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(jsRoot == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompile_ThrowIllegalStateException2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        compiler.compile(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile17() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = new com.google.javascript.jscomp.JSSourceFile[1];
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        jSSourceFileArray[0] = jSSourceFile;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = new com.google.javascript.jscomp.JSSourceFile[18];
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435) */
        compiler.compile(jSSourceFileArray, jSSourceFileArray1, compilerOptions);
    }
    
    @Test
    public void testCompile18() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435) */
        compiler.compile(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), compilerOptions);
    }
    
    @Test
    public void testCompile19() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435) */
        compiler.compile(jSSourceFileArray, jSSourceFileArray, compilerOptions);
    }
    
    @Test
    public void testCompile20() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435) */
        compiler.compile(jSSourceFileArray, jSSourceFileArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile21() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435) */
        compiler.compile(jSSourceFileArray, jSSourceFileArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile22() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.MULTILINE;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435) */
        compiler.compile(jSSourceFileArray, jSSourceFileArray, compilerOptions);
    }
    
    @Test
    public void testCompile23() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435) */
        compiler.compile(jSSourceFileArray, jSSourceFileArray, compilerOptions);
    }
    
    @Test
    public void testCompile24() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:435) */
        compiler.compile(jSSourceFileArray, jSSourceFileArray1, ((CompilerOptions) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (Preconditions.checkState(jsRoot == null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(jsRoot == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompile_ThrowIllegalStateException3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ScriptOrFnNode jsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        compiler.compile(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile25() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457) */
        compiler.compile(jSSourceFileArray, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile26() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[9];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        jSModuleArray[0] = jSModule;
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457) */
        compiler.compile(jSSourceFileArray, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile27() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457) */
        compiler.compile(jSSourceFileArray, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile28() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457) */
        compiler.compile(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSModule[]) null), compilerOptions);
    }
    
    @Test
    public void testCompile29() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457) */
        compiler.compile(jSSourceFileArray, jSModuleArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile30() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457) */
        compiler.compile(jSSourceFileArray, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile31() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457) */
        compiler.compile(jSSourceFileArray, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile32() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457) */
        compiler.compile(jSSourceFileArray, jSModuleArray, ((CompilerOptions) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compile
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compile(com.google.javascript.jscomp.JSSourceFile, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#compile(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return compile(new JSSourceFile[] { extern }, modules, options);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompile_ThrowIllegalStateException4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Node jsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        compiler.jsRoot = jsRoot;
        
        compiler.compile(((JSSourceFile) null), ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compile(com.google.javascript.jscomp.JSSourceFile, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testCompile33() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[17];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        jSModuleArray[0] = jSModule;
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:415) */
        compiler.compile(jSSourceFile, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile34() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:415) */
        compiler.compile(jSSourceFile, ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile35() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:415) */
        compiler.compile(((JSSourceFile) null), jSModuleArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile36() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:415) */
        compiler.compile(((JSSourceFile) null), jSModuleArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testCompile37() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:415) */
        compiler.compile(jSSourceFile, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile38() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:415) */
        compiler.compile(jSSourceFile, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile39() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:415) */
        compiler.compile(jSSourceFile, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testCompile40() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:457)
            com.google.javascript.jscomp.Compiler.compile(Compiler.java:415) */
        compiler.compile(jSSourceFile, jSModuleArray, compilerOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.init
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.externs = makeCompilerInput(externs, true);
 *  */
    @Test
    public void testInit_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:296)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:242) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.invokes com.google.javascript.jscomp.Compiler#initBasedOnOptions()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initBasedOnOptions();
 *  */
    @Test
    public void testInit_ThrowNullPointerException_4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        com.google.javascript.jscomp.CompilerInput[] externs = {null};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externs", externs);
        com.google.javascript.jscomp.JSModule[] modules = {null};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "moduleGraph", moduleGraph);
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = {};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initBasedOnOptions(Compiler.java:289)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:246) */
        compiler.init(jSSourceFileArray, jSSourceFileArray1, ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initOptions(options);
 *  */
    @Test
    public void testInit_ThrowNullPointerException_5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:212)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:228)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:240) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initOptions(options);
 *  */
    @Test
    public void testInit_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:212)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:225)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:240) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initOptions(options);
 *  */
    @Test
    public void testInit_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:213)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:225)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:240) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSSourceFile[]) null), compilerOptions);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.inputs = makeCompilerInput(inputs, false);
 *  */
    @Test
    public void testInit_ThrowNullPointerException_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:296)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:245) */
        compiler.init(jSSourceFileArray, ((com.google.javascript.jscomp.JSSourceFile[]) null), ((CompilerOptions) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSSourceFile;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testInit1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:296)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:242) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), jSSourceFileArray, compilerOptions);
    }
    
    @Test
    public void testInit2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.<init>(JsAst.java:45)
            com.google.javascript.jscomp.CompilerInput.<init>(CompilerInput.java:74)
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:298)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:242) */
        compiler.init(jSSourceFileArray, jSSourceFileArray, compilerOptions);
    }
    
    @Test
    public void testInit3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {};
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray1 = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.<init>(JsAst.java:45)
            com.google.javascript.jscomp.CompilerInput.<init>(CompilerInput.java:74)
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:298)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:245) */
        compiler.init(jSSourceFileArray, jSSourceFileArray1, ((CompilerOptions) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.init
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkFirstModule(modules);
 *  */
    @Test
    public void testInit_ThrowNullPointerException_41() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[1];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        jSModuleArray[0] = jSModule;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:318)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:263) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), jSModuleArray, ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkFirstModule(modules);
 *  */
    @Test
    public void testInit_ThrowNullPointerException_21() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:318)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:263) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), jSModuleArray, ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkFirstModule(modules);
 *  */
    @Test
    public void testInit_ThrowNullPointerException_31() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:316)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:263) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initOptions(options);
 *  */
    @Test
    public void testInit_ThrowNullPointerException_11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:212)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:228)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:261) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSModule[]) null), ((CompilerOptions) null));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#init(com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initOptions(options);
 *  */
    @Test
    public void testInit_ThrowNullPointerException1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:213)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:225)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:261) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), ((com.google.javascript.jscomp.JSModule[]) null), compilerOptions);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method init([Lcom.google.javascript.jscomp.JSSourceFile;, [Lcom.google.javascript.jscomp.JSModule;, com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testInit4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = new com.google.javascript.jscomp.JSSourceFile[17];
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[9];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        jSModuleArray[0] = jSModule;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1465)
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:319)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:263) */
        compiler.init(jSSourceFileArray, jSModuleArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testInit5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = new com.google.javascript.jscomp.JSSourceFile[17];
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[9];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        jSModuleArray[0] = jSModule;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.<init>(JsAst.java:45)
            com.google.javascript.jscomp.CompilerInput.<init>(CompilerInput.java:74)
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:298)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:265) */
        compiler.init(jSSourceFileArray, jSModuleArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testInit6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1465)
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:317)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:263) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), jSModuleArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testInit7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:318)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:263) */
        compiler.init(jSSourceFileArray, jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testInit8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:318)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:263) */
        compiler.init(((com.google.javascript.jscomp.JSSourceFile[]) null), jSModuleArray, compilerOptions);
    }
    
    @Test
    public void testInit9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:212)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:225)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:261) */
        compiler.init(jSSourceFileArray, jSModuleArray, ((CompilerOptions) null));
    }
    
    @Test
    public void testInit10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {null, null, null, null, null, null, null, null, null};
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null, null, null, null, null, null, null, null, null};
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.init] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:213)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:228)
            com.google.javascript.jscomp.Compiler.init(Compiler.java:261) */
        compiler.init(jSSourceFileArray, jSModuleArray, compilerOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.optimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#optimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.devMode == DevMode.EVERY_PASS
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.optimize] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.optimize(Compiler.java:1329) */
        compiler.optimize();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimize()
    
    @Test
    public void testOptimize1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.optimize] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DefaultPassConfig.getOptimizations(DefaultPassConfig.java:305)
            com.google.javascript.jscomp.Compiler.optimize(Compiler.java:1332) */
        compiler.optimize();
    }
    
    @Test
    public void testOptimize2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.optimize] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DefaultPassConfig.getOptimizations(DefaultPassConfig.java:305)
            com.google.javascript.jscomp.Compiler.optimize(Compiler.java:1332) */
        compiler.optimize();
    }
    
    @Test
    public void testOptimize3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        DefaultPassConfig passes = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        PerformanceTracker tracker = ((PerformanceTracker) createInstance("com.google.javascript.jscomp.PerformanceTracker"));
        compiler.tracker = tracker;
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.optimize] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DefaultPassConfig.getOptimizations(DefaultPassConfig.java:299)
            com.google.javascript.jscomp.Compiler.optimize(Compiler.java:1332) */
        compiler.optimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getState
    
    ///region Errors report for getState
    
    public void testGetState_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Wrong number of type storages is provided, expected 2 arguments,
        but only 1 found */
        
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
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:745)
            com.google.javascript.jscomp.Compiler.normalize(Compiler.java:1379) */
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
            com.google.javascript.jscomp.Compiler.runCustomPasses(Compiler.java:724)
            com.google.javascript.jscomp.Compiler.check(Compiler.java:622) */
        compiler.check();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method check()
    
    @Test
    public void testCheck1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.check] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addChangeHandler(Compiler.java:1411)
            com.google.javascript.jscomp.PhaseOptimizer.<init>(PhaseOptimizer.java:75)
            com.google.javascript.jscomp.Compiler.check(Compiler.java:624) */
        compiler.check();
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
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1045) */
        compiler.parse(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(com.google.javascript.jscomp.JSSourceFile)
    
    @Test
    public void testParse1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1530)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:1045) */
        compiler.parse(jSSourceFile);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.parse
    
    ///region OTHER: ERROR SUITE for method parse()
    
    @Test
    public void testParse2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "next", externsRoot);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "next", externsRoot);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse12() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse13() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse14() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse15() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
    }
    
    @Test
    public void testParse16() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574) */
        compiler.parse();
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
            com.google.javascript.jscomp.Compiler.process(Compiler.java:674) */
        compiler.process(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.jscomp.CompilerPass)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#process(com.google.javascript.jscomp.CompilerPass)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.process(externsRoot, jsRoot);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        compiler.process(typeCheck);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#process(com.google.javascript.jscomp.CompilerPass)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.process(externsRoot, jsRoot);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        compiler.process(typeCheck);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.jscomp.CompilerPass)
    
    @Test
    public void testProcess1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ScriptOrFnNode jsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "parent", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        SymbolTable scopeCreator = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:621)
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:768)
            com.google.javascript.jscomp.NodeTraversal.traverseBranch(NodeTraversal.java:477)
            com.google.javascript.jscomp.NodeTraversal.traverseWithScope(NodeTraversal.java:316)
            com.google.javascript.jscomp.TypeCheck.check(TypeCheck.java:373)
            com.google.javascript.jscomp.TypeCheck.process(TypeCheck.java:342)
            com.google.javascript.jscomp.Compiler.process(Compiler.java:674) */
        compiler.process(typeCheck);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.jscomp.CompilerPass)
    
    @Test(expected = IllegalStateException.class)
    public void testProcess2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ScriptOrFnNode jsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        SymbolTable scopeCreator = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        compiler.process(typeCheck);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.isNormalized
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNormalized()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#isNormalized()}
 * @utbot.returnsFrom {@code return normalized;}
 *  */
    @Test
    public void testIsNormalized_ReturnNormalized() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        boolean actual = compiler.isNormalized();
        
        assertFalse(actual);
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
        LoggerErrorManager loggerErrorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        
        ErrorManager initialCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class loggerErrorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", loggerErrorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = loggerErrorManager;
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
            com.google.javascript.jscomp.Compiler.setState(Compiler.java:1685) */
        compiler.setState(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.setUnnormalized
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUnnormalized()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setUnnormalized()}
 *  */
    @Test
    public void testSetUnnormalized() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.setUnnormalized();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.setNormalized
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNormalized()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#setNormalized()}
 *  */
    @Test
    public void testSetNormalized() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.setNormalized();
        
        boolean finalCompilerNormalized = ((Boolean) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "normalized"));
        
        assertTrue(finalCompilerNormalized);
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
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getMessages] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.BasicErrorManager.toArray(BasicErrorManager.java:99)
            com.google.javascript.jscomp.BasicErrorManager.getErrors(BasicErrorManager.java:83)
            com.google.javascript.jscomp.Compiler.getErrors(Compiler.java:803)
            com.google.javascript.jscomp.Compiler.getMessages(Compiler.java:796) */
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
            com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1536) */
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
            com.google.javascript.jscomp.Compiler.isTypeCheckingEnabled(Compiler.java:1454) */
        compiler.isTypeCheckingEnabled();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.runInCompilerThread
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method runInCompilerThread(java.util.concurrent.Callable)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#runInCompilerThread(java.util.concurrent.Callable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean dumpTraceReport = options.tracer.isOn();
 *  */
    @Test
    public void testRunInCompilerThread_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.runInCompilerThread] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean dumpTraceReport = options.tracer.isOn();
 *  */
    @Test
    public void testRunInCompilerThread_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.runInCompilerThread] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489) */
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
    
    ///region Errors report for runInCompilerThread
    
    public void testRunInCompilerThread_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.removeTryCatchFinally
    
    ///region OTHER: ERROR SUITE for method removeTryCatchFinally()
    
    @Test
    public void testRemoveTryCatchFinally1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.removeTryCatchFinally] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:745)
            com.google.javascript.jscomp.Compiler.removeTryCatchFinally(Compiler.java:700) */
        compiler.removeTryCatchFinally();
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
        
        com.google.javascript.jscomp.CompilerInput[] actualVal$selfExterns = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "externs"));
        assertNull(actualVal$selfExterns);
        
        com.google.javascript.jscomp.JSModule[] actualVal$selfModules = ((com.google.javascript.jscomp.JSModule[]) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "modules"));
        assertNull(actualVal$selfModules);
        
        JSModuleGraph actualVal$selfModuleGraph = actualVal$self.getModuleGraph();
        assertNull(actualVal$selfModuleGraph);
        
        com.google.javascript.jscomp.CompilerInput[] actualVal$selfInputs = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "inputs"));
        assertNull(actualVal$selfInputs);
        
        ErrorManager actualVal$selfErrorManager = actualVal$self.getErrorManager();
        assertNull(actualVal$selfErrorManager);
        
        SymbolTable actualVal$selfSymbolTable = ((SymbolTable) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        assertNull(actualVal$selfSymbolTable);
        
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
        
        boolean actualVal$selfNormalized = ((Boolean) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "normalized"));
        assertFalse(actualVal$selfNormalized);
        
        boolean actualVal$selfUseThreads = ((Boolean) getFieldValue(actualVal$self, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualVal$selfUseThreads);
        
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
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getAllInputsFromModules
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllInputsFromModules()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getAllInputsFromModules()}
 * @utbot.executesCondition {@code (hasErrors()): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return inputs.toArray(new CompilerInput[inputs.size()]);}
 *  */
    @Test
    public void testGetAllInputsFromModules_NotHasErrors() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ideMode = true;
        compiler.options = options;
        com.google.javascript.jscomp.JSModule[] modules = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules");
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[0];
        com.google.javascript.jscomp.CompilerInput[] actual = ((com.google.javascript.jscomp.CompilerInput[]) getAllInputsFromModulesMethod.invoke(compiler, getAllInputsFromModulesMethodArguments));
        
        com.google.javascript.jscomp.CompilerInput[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getAllInputsFromModules()}
 * @utbot.executesCondition {@code (hasErrors()): True}
 * @utbot.returnsFrom {@code return new CompilerInput[0];}
 *  */
    @Test
    public void testGetAllInputsFromModules_HasErrors() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        com.google.javascript.jscomp.JSModule[] modules = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "errorCount", 1);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules");
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[0];
        com.google.javascript.jscomp.CompilerInput[] actual = ((com.google.javascript.jscomp.CompilerInput[]) getAllInputsFromModulesMethod.invoke(compiler, getAllInputsFromModulesMethodArguments));
        
        com.google.javascript.jscomp.CompilerInput[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllInputsFromModules()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getAllInputsFromModules()}
 * @utbot.iterates iterate the loop {@code for(JSModule module: modules)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(CompilerInput input: module.getInputs())
 *  */
    @Test
    public void testGetAllInputsFromModules_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] modules = {null};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getAllInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:352) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules");
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[0];
        try {
            getAllInputsFromModulesMethod.invoke(compiler, getAllInputsFromModulesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getAllInputsFromModules()}
 * @utbot.iterates iterate the loop {@code for(JSModule module: modules)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(CompilerInput input: module.getInputs())
 *  */
    @Test
    public void testGetAllInputsFromModules_ThrowNullPointerException_2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] modules = new com.google.javascript.jscomp.JSModule[1];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules[0] = jSModule;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getAllInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:352) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules");
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[0];
        try {
            getAllInputsFromModulesMethod.invoke(compiler, getAllInputsFromModulesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getAllInputsFromModules()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSModule module: modules)
 *  */
    @Test
    public void testGetAllInputsFromModules_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getAllInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:351) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules");
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[0];
        try {
            getAllInputsFromModulesMethod.invoke(compiler, getAllInputsFromModulesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getAllInputsFromModules()
    
    @Test
    public void testGetAllInputsFromModules1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        com.google.javascript.jscomp.JSModule[] modules = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "errorCount", -2147483647);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules");
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[0];
        com.google.javascript.jscomp.CompilerInput[] actual = ((com.google.javascript.jscomp.CompilerInput[]) getAllInputsFromModulesMethod.invoke(compiler, getAllInputsFromModulesMethodArguments));
        
        com.google.javascript.jscomp.CompilerInput[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getAllInputsFromModules()
    
    @Test
    public void testGetAllInputsFromModules2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] modules = new com.google.javascript.jscomp.JSModule[9];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        modules[0] = jSModule;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getAllInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:352) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules");
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[0];
        try {
            getAllInputsFromModulesMethod.invoke(compiler, getAllInputsFromModulesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetAllInputsFromModules3() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] modules = new com.google.javascript.jscomp.JSModule[9];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        modules[0] = jSModule;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getAllInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:353) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method getAllInputsFromModulesMethod = compilerClazz.getDeclaredMethod("getAllInputsFromModules");
        getAllInputsFromModulesMethod.setAccessible(true);
        java.lang.Object[] getAllInputsFromModulesMethodArguments = new java.lang.Object[0];
        try {
            getAllInputsFromModulesMethod.invoke(compiler, getAllInputsFromModulesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.initInputsByNameMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initInputsByNameMap()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initInputsByNameMap()}
 *  */
    @Test
    public void testInitInputsByNameMap() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] externs = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externs", externs);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputs", externs);
        
        compiler.initInputsByNameMap();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initInputsByNameMap()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initInputsByNameMap()}
 * @utbot.iterates iterate the loop {@code for(CompilerInput input: externs)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = input.getName();
 *  */
    @Test
    public void testInitInputsByNameMap_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] externs = {null};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externs", externs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initInputsByNameMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:386) */
        compiler.initInputsByNameMap();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initInputsByNameMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(CompilerInput input: externs)
 *  */
    @Test
    public void testInitInputsByNameMap_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initInputsByNameMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:385) */
        compiler.initInputsByNameMap();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initInputsByNameMap()}
 * @utbot.iterates iterate the loop {@code for(CompilerInput input: inputs)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = input.getName();
 *  */
    @Test
    public void testInitInputsByNameMap_ThrowNullPointerException_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] externs = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externs", externs);
        com.google.javascript.jscomp.CompilerInput[] inputs = {null};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputs", inputs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initInputsByNameMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:394) */
        compiler.initInputsByNameMap();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initInputsByNameMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(CompilerInput input: inputs)
 *  */
    @Test
    public void testInitInputsByNameMap_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] externs = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externs", externs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initInputsByNameMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:393) */
        compiler.initInputsByNameMap();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method initInputsByNameMap()
    
    @Test
    public void testInitInputsByNameMap1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] externs = new com.google.javascript.jscomp.CompilerInput[9];
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        String name = "";
        setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "name", name);
        externs[0] = compilerInput;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externs", externs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initInputsByNameMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:386) */
        compiler.initInputsByNameMap();
    }
    
    @Test
    public void testInitInputsByNameMap2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] externs = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externs", externs);
        com.google.javascript.jscomp.CompilerInput[] inputs = new com.google.javascript.jscomp.CompilerInput[9];
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        inputs[0] = compilerInput;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputs", inputs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initInputsByNameMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:394) */
        compiler.initInputsByNameMap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.createPassConfigInternal
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createPassConfigInternal()
    
    @Test
    public void testCreatePassConfigInternal1() throws Exception  {
    /* This block of code is 1171 lines long and could lead to compilation error
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        DefaultPassConfig actual = ((DefaultPassConfig) compiler.createPassConfigInternal());
        
        DefaultPassConfig expected = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator", crossModuleIdGenerator);
        PassFactory suspiciousCode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$1"));
        setField(suspiciousCode, "com.google.javascript.jscomp.DefaultPassConfig$1", "this$0", expected);
        String name = "suspiciousCode";
        setField(suspiciousCode, "com.google.javascript.jscomp.PassFactory", "name", name);
        setField(suspiciousCode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "suspiciousCode", suspiciousCode);
        PassFactory checkControlStructures = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$2"));
        setField(checkControlStructures, "com.google.javascript.jscomp.DefaultPassConfig$2", "this$0", expected);
        String name1 = "checkControlStructures";
        setField(checkControlStructures, "com.google.javascript.jscomp.PassFactory", "name", name1);
        setField(checkControlStructures, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures", checkControlStructures);
        PassFactory checkRequires = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$3"));
        setField(checkRequires, "com.google.javascript.jscomp.DefaultPassConfig$3", "this$0", expected);
        String name2 = "checkRequires";
        setField(checkRequires, "com.google.javascript.jscomp.PassFactory", "name", name2);
        setField(checkRequires, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires", checkRequires);
        PassFactory checkProvides = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$4"));
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
        PassFactory closurePrimitives = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$8"));
        setField(closurePrimitives, "com.google.javascript.jscomp.DefaultPassConfig$8", "this$0", expected);
        String name7 = "processProvidesAndRequires";
        setField(closurePrimitives, "com.google.javascript.jscomp.PassFactory", "name", name7);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closurePrimitives", closurePrimitives);
        PassFactory closureCheckGetCssName = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$9"));
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.DefaultPassConfig$9", "this$0", expected);
        String name8 = "checkMissingGetCssName";
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.PassFactory", "name", name8);
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName", closureCheckGetCssName);
        PassFactory closureReplaceGetCssName = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$10"));
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.DefaultPassConfig$10", "this$0", expected);
        String name9 = "renameCssNames";
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.PassFactory", "name", name9);
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName", closureReplaceGetCssName);
        PassFactory createSyntheticBlocks = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$11"));
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.DefaultPassConfig$11", "this$0", expected);
        String name10 = "createSyntheticBlocks";
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.PassFactory", "name", name10);
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks", createSyntheticBlocks);
        PassFactory checkVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$13"));
        setField(checkVars, "com.google.javascript.jscomp.DefaultPassConfig$13", "this$0", expected);
        String name11 = "checkVars";
        setField(checkVars, "com.google.javascript.jscomp.PassFactory", "name", name11);
        setField(checkVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars", checkVars);
        PassFactory checkShadowVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$14"));
        setField(checkShadowVars, "com.google.javascript.jscomp.DefaultPassConfig$14", "this$0", expected);
        String name12 = "variableShadowDeclarationCheck";
        setField(checkShadowVars, "com.google.javascript.jscomp.PassFactory", "name", name12);
        setField(checkShadowVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars", checkShadowVars);
        PassFactory checkVariableReferences = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$15"));
        setField(checkVariableReferences, "com.google.javascript.jscomp.DefaultPassConfig$15", "this$0", expected);
        String name13 = "checkVariableReferences";
        setField(checkVariableReferences, "com.google.javascript.jscomp.PassFactory", "name", name13);
        setField(checkVariableReferences, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences", checkVariableReferences);
        PassFactory objectPropertyStringPreprocess = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$16"));
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.DefaultPassConfig$16", "this$0", expected);
        String name14 = "ObjectPropertyStringPreprocess";
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.PassFactory", "name", name14);
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess", objectPropertyStringPreprocess);
        PassFactory checkFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$17"));
        setField(checkFunctions, "com.google.javascript.jscomp.DefaultPassConfig$17", "this$0", expected);
        String name15 = "checkFunctions";
        setField(checkFunctions, "com.google.javascript.jscomp.PassFactory", "name", name15);
        setField(checkFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkFunctions", checkFunctions);
        PassFactory checkMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$18"));
        setField(checkMethods, "com.google.javascript.jscomp.DefaultPassConfig$18", "this$0", expected);
        String name16 = "checkMethods";
        setField(checkMethods, "com.google.javascript.jscomp.PassFactory", "name", name16);
        setField(checkMethods, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkMethods", checkMethods);
        PassFactory resolveTypes = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$19"));
        setField(resolveTypes, "com.google.javascript.jscomp.DefaultPassConfig$19", "this$0", expected);
        String name17 = "resolveTypes";
        setField(resolveTypes, "com.google.javascript.jscomp.PassFactory", "name", name17);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "resolveTypes", resolveTypes);
        PassFactory inferTypes = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$20"));
        setField(inferTypes, "com.google.javascript.jscomp.DefaultPassConfig$20", "this$0", expected);
        String name18 = "inferTypes";
        setField(inferTypes, "com.google.javascript.jscomp.PassFactory", "name", name18);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes", inferTypes);
        PassFactory checkTypes = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$21"));
        setField(checkTypes, "com.google.javascript.jscomp.DefaultPassConfig$21", "this$0", expected);
        String name19 = "checkTypes";
        setField(checkTypes, "com.google.javascript.jscomp.PassFactory", "name", name19);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes", checkTypes);
        PassFactory checkControlFlow = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$22"));
        setField(checkControlFlow, "com.google.javascript.jscomp.DefaultPassConfig$22", "this$0", expected);
        String name20 = "checkControlFlow";
        setField(checkControlFlow, "com.google.javascript.jscomp.PassFactory", "name", name20);
        setField(checkControlFlow, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow", checkControlFlow);
        PassFactory checkAccessControls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$23"));
        setField(checkAccessControls, "com.google.javascript.jscomp.DefaultPassConfig$23", "this$0", expected);
        String name21 = "checkAccessControls";
        setField(checkAccessControls, "com.google.javascript.jscomp.PassFactory", "name", name21);
        setField(checkAccessControls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls", checkAccessControls);
        PassFactory checkGlobalNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$24"));
        setField(checkGlobalNames, "com.google.javascript.jscomp.DefaultPassConfig$24", "this$0", expected);
        String name22 = "Check names";
        setField(checkGlobalNames, "com.google.javascript.jscomp.PassFactory", "name", name22);
        setField(checkGlobalNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames", checkGlobalNames);
        PassFactory checkSuspiciousProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$25"));
        setField(checkSuspiciousProperties, "com.google.javascript.jscomp.DefaultPassConfig$25", "this$0", expected);
        String name23 = "checkSuspiciousProperties";
        setField(checkSuspiciousProperties, "com.google.javascript.jscomp.PassFactory", "name", name23);
        setField(checkSuspiciousProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkSuspiciousProperties", checkSuspiciousProperties);
        PassFactory checkStrictMode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$26"));
        setField(checkStrictMode, "com.google.javascript.jscomp.DefaultPassConfig$26", "this$0", expected);
        String name24 = "checkStrictMode";
        setField(checkStrictMode, "com.google.javascript.jscomp.PassFactory", "name", name24);
        setField(checkStrictMode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode", checkStrictMode);
        PassFactory processDefines = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$27"));
        setField(processDefines, "com.google.javascript.jscomp.DefaultPassConfig$27", "this$0", expected);
        String name25 = "processDefines";
        setField(processDefines, "com.google.javascript.jscomp.PassFactory", "name", name25);
        setField(processDefines, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "processDefines", processDefines);
        PassFactory checkConsts = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$28"));
        setField(checkConsts, "com.google.javascript.jscomp.DefaultPassConfig$28", "this$0", expected);
        String name26 = "checkConsts";
        setField(checkConsts, "com.google.javascript.jscomp.PassFactory", "name", name26);
        setField(checkConsts, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts", checkConsts);
        PassFactory computeFunctionNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$29"));
        setField(computeFunctionNames, "com.google.javascript.jscomp.DefaultPassConfig$29", "this$0", expected);
        String name27 = "computeFunctionNames";
        setField(computeFunctionNames, "com.google.javascript.jscomp.PassFactory", "name", name27);
        setField(computeFunctionNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames", computeFunctionNames);
        PassFactory ignoreCajaProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$30"));
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.DefaultPassConfig$30", "this$0", expected);
        String name28 = "ignoreCajaProperties";
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.PassFactory", "name", name28);
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties", ignoreCajaProperties);
        PassFactory runtimeTypeCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$31"));
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.DefaultPassConfig$31", "this$0", expected);
        String name29 = "runtimeTypeCheck";
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.PassFactory", "name", name29);
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck", runtimeTypeCheck);
        PassFactory replaceIdGenerators = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$32"));
        setField(replaceIdGenerators, "com.google.javascript.jscomp.DefaultPassConfig$32", "this$0", expected);
        String name30 = "replaceIdGenerators";
        setField(replaceIdGenerators, "com.google.javascript.jscomp.PassFactory", "name", name30);
        setField(replaceIdGenerators, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators", replaceIdGenerators);
        PassFactory optimizeArgumentsArray = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$33"));
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.DefaultPassConfig$33", "this$0", expected);
        String name31 = "optimizeArgumentsArray";
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.PassFactory", "name", name31);
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray", optimizeArgumentsArray);
        PassFactory removeUselessParameters = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$34"));
        setField(removeUselessParameters, "com.google.javascript.jscomp.DefaultPassConfig$34", "this$0", expected);
        String name32 = "optimizeParameters";
        setField(removeUselessParameters, "com.google.javascript.jscomp.PassFactory", "name", name32);
        setField(removeUselessParameters, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUselessParameters", removeUselessParameters);
        PassFactory removeAbstractMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$35"));
        setField(removeAbstractMethods, "com.google.javascript.jscomp.DefaultPassConfig$35", "this$0", expected);
        String name33 = "removeAbstractMethods";
        setField(removeAbstractMethods, "com.google.javascript.jscomp.PassFactory", "name", name33);
        setField(removeAbstractMethods, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeAbstractMethods", removeAbstractMethods);
        PassFactory collapseProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$36"));
        setField(collapseProperties, "com.google.javascript.jscomp.DefaultPassConfig$36", "this$0", expected);
        String name34 = "collapseProperties";
        setField(collapseProperties, "com.google.javascript.jscomp.PassFactory", "name", name34);
        setField(collapseProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties", collapseProperties);
        PassFactory tightenTypesBuilder = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$37"));
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.DefaultPassConfig$37", "this$0", expected);
        String name35 = "tightenTypes";
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.PassFactory", "name", name35);
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder", tightenTypesBuilder);
        PassFactory disambiguateProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$38"));
        setField(disambiguateProperties, "com.google.javascript.jscomp.DefaultPassConfig$38", "this$0", expected);
        String name36 = "disambiguateProperties";
        setField(disambiguateProperties, "com.google.javascript.jscomp.PassFactory", "name", name36);
        setField(disambiguateProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties", disambiguateProperties);
        PassFactory chainCalls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$39"));
        setField(chainCalls, "com.google.javascript.jscomp.DefaultPassConfig$39", "this$0", expected);
        String name37 = "chainCalls";
        setField(chainCalls, "com.google.javascript.jscomp.PassFactory", "name", name37);
        setField(chainCalls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls", chainCalls);
        PassFactory devirtualizePrototypeMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$40"));
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.DefaultPassConfig$40", "this$0", expected);
        String name38 = "devirtualizePrototypeMethods";
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.PassFactory", "name", name38);
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods", devirtualizePrototypeMethods);
        PassFactory markPureFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$41"));
        setField(markPureFunctions, "com.google.javascript.jscomp.DefaultPassConfig$41", "this$0", expected);
        String name39 = "markPureFunctions";
        setField(markPureFunctions, "com.google.javascript.jscomp.PassFactory", "name", name39);
        setField(markPureFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions", markPureFunctions);
        PassFactory markNoSideEffectCalls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$42"));
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.DefaultPassConfig$42", "this$0", expected);
        String name40 = "markNoSideEffectCalls";
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.PassFactory", "name", name40);
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls", markNoSideEffectCalls);
        PassFactory inlineVariables = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$43"));
        setField(inlineVariables, "com.google.javascript.jscomp.DefaultPassConfig$43", "this$0", expected);
        String name41 = "inlineVariables";
        setField(inlineVariables, "com.google.javascript.jscomp.PassFactory", "name", name41);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables", inlineVariables);
        PassFactory inlineConstants = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$44"));
        setField(inlineConstants, "com.google.javascript.jscomp.DefaultPassConfig$44", "this$0", expected);
        String name42 = "inlineConstants";
        setField(inlineConstants, "com.google.javascript.jscomp.PassFactory", "name", name42);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants", inlineConstants);
        PassFactory removeConstantExpressions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$45"));
        setField(removeConstantExpressions, "com.google.javascript.jscomp.DefaultPassConfig$45", "this$0", expected);
        String name43 = "removeConstantExpressions";
        setField(removeConstantExpressions, "com.google.javascript.jscomp.PassFactory", "name", name43);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeConstantExpressions", removeConstantExpressions);
        PassFactory minimizeExitPoints = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$46"));
        setField(minimizeExitPoints, "com.google.javascript.jscomp.DefaultPassConfig$46", "this$0", expected);
        String name44 = "minimizeExitPoints";
        setField(minimizeExitPoints, "com.google.javascript.jscomp.PassFactory", "name", name44);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints", minimizeExitPoints);
        PassFactory removeUnreachableCode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$47"));
        setField(removeUnreachableCode, "com.google.javascript.jscomp.DefaultPassConfig$47", "this$0", expected);
        String name45 = "removeUnreachableCode";
        setField(removeUnreachableCode, "com.google.javascript.jscomp.PassFactory", "name", name45);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode", removeUnreachableCode);
        PassFactory removeUnusedPrototypeProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$48"));
        setField(removeUnusedPrototypeProperties, "com.google.javascript.jscomp.DefaultPassConfig$48", "this$0", expected);
        String name46 = "removeUnusedPrototypeProperties";
        setField(removeUnusedPrototypeProperties, "com.google.javascript.jscomp.PassFactory", "name", name46);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties", removeUnusedPrototypeProperties);
        PassFactory smartNamePass = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$49"));
        setField(smartNamePass, "com.google.javascript.jscomp.DefaultPassConfig$49", "this$0", expected);
        String name47 = "smartNamePass";
        setField(smartNamePass, "com.google.javascript.jscomp.PassFactory", "name", name47);
        setField(smartNamePass, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass", smartNamePass);
        PassFactory inlineGetters = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$50"));
        setField(inlineGetters, "com.google.javascript.jscomp.DefaultPassConfig$50", "this$0", expected);
        String name48 = "inlineGetters";
        setField(inlineGetters, "com.google.javascript.jscomp.PassFactory", "name", name48);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineGetters", inlineGetters);
        PassFactory deadAssignmentsElimination = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$51"));
        setField(deadAssignmentsElimination, "com.google.javascript.jscomp.DefaultPassConfig$51", "this$0", expected);
        String name49 = "deadAssignmentsElimination";
        setField(deadAssignmentsElimination, "com.google.javascript.jscomp.PassFactory", "name", name49);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination", deadAssignmentsElimination);
        PassFactory inlineFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$52"));
        setField(inlineFunctions, "com.google.javascript.jscomp.DefaultPassConfig$52", "this$0", expected);
        String name50 = "inlineFunctions";
        setField(inlineFunctions, "com.google.javascript.jscomp.PassFactory", "name", name50);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions", inlineFunctions);
        PassFactory removeUnusedVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$53"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.DefaultPassConfig$53", "this$0", expected);
        String name51 = "removeUnusedVars";
        setField(removeUnusedVars, "com.google.javascript.jscomp.PassFactory", "name", name51);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars", removeUnusedVars);
        PassFactory crossModuleCodeMotion = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$54"));
        setField(crossModuleCodeMotion, "com.google.javascript.jscomp.DefaultPassConfig$54", "this$0", expected);
        String name52 = "crossModuleCodeMotion";
        setField(crossModuleCodeMotion, "com.google.javascript.jscomp.PassFactory", "name", name52);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion", crossModuleCodeMotion);
        PassFactory crossModuleMethodMotion = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$55"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.DefaultPassConfig$55", "this$0", expected);
        String name53 = "crossModuleMethodMotion";
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.PassFactory", "name", name53);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion", crossModuleMethodMotion);
        PassFactory flowSensitiveInlineVariables = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$56"));
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.DefaultPassConfig$56", "this$0", expected);
        String name54 = "flowSensitiveInlineVariables";
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.PassFactory", "name", name54);
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables", flowSensitiveInlineVariables);
        PassFactory coalesceVariableNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$57"));
        setField(coalesceVariableNames, "com.google.javascript.jscomp.DefaultPassConfig$57", "this$0", expected);
        String name55 = "coalesceVariableNames";
        setField(coalesceVariableNames, "com.google.javascript.jscomp.PassFactory", "name", name55);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames", coalesceVariableNames);
        PassFactory collapseVariableDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$58"));
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$58", "this$0", expected);
        String name56 = "collapseVariableDeclarations";
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name56);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations", collapseVariableDeclarations);
        PassFactory extractPrototypeMemberDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$59"));
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$59", "this$0", expected);
        String name57 = "extractPrototypeMemberDeclarations";
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name57);
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations", extractPrototypeMemberDeclarations);
        PassFactory rewriteFunctionExpressions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$60"));
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.DefaultPassConfig$60", "this$0", expected);
        String name58 = "rewriteFunctionExpressions";
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.PassFactory", "name", name58);
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions", rewriteFunctionExpressions);
        PassFactory collapseAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$61"));
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$61", "this$0", expected);
        String name59 = "collapseAnonymousFunctions";
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name59);
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions", collapseAnonymousFunctions);
        PassFactory moveFunctionDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$62"));
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$62", "this$0", expected);
        String name60 = "moveFunctionDeclarations";
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name60);
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations", moveFunctionDeclarations);
        PassFactory nameUnmappedAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$63"));
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$63", "this$0", expected);
        String name61 = "nameAnonymousFunctions";
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name61);
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions", nameUnmappedAnonymousFunctions);
        PassFactory nameMappedAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$64"));
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$64", "this$0", expected);
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name61);
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions", nameMappedAnonymousFunctions);
        PassFactory aliasExternals = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$65"));
        setField(aliasExternals, "com.google.javascript.jscomp.DefaultPassConfig$65", "this$0", expected);
        String name62 = "aliasExternals";
        setField(aliasExternals, "com.google.javascript.jscomp.PassFactory", "name", name62);
        setField(aliasExternals, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals", aliasExternals);
        PassFactory aliasStrings = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$66"));
        setField(aliasStrings, "com.google.javascript.jscomp.DefaultPassConfig$66", "this$0", expected);
        String name63 = "aliasStrings";
        setField(aliasStrings, "com.google.javascript.jscomp.PassFactory", "name", name63);
        setField(aliasStrings, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings", aliasStrings);
        PassFactory aliasKeywords = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$67"));
        setField(aliasKeywords, "com.google.javascript.jscomp.DefaultPassConfig$67", "this$0", expected);
        String name64 = "aliasKeywords";
        setField(aliasKeywords, "com.google.javascript.jscomp.PassFactory", "name", name64);
        setField(aliasKeywords, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords", aliasKeywords);
        PassFactory objectPropertyStringPostprocess = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$68"));
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.DefaultPassConfig$68", "this$0", expected);
        String name65 = "ObjectPropertyStringPostprocess";
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.PassFactory", "name", name65);
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess", objectPropertyStringPostprocess);
        PassFactory ambiguateProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$69"));
        setField(ambiguateProperties, "com.google.javascript.jscomp.DefaultPassConfig$69", "this$0", expected);
        String name66 = "ambiguateProperties";
        setField(ambiguateProperties, "com.google.javascript.jscomp.PassFactory", "name", name66);
        setField(ambiguateProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties", ambiguateProperties);
        PassFactory denormalize = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$70"));
        setField(denormalize, "com.google.javascript.jscomp.DefaultPassConfig$70", "this$0", expected);
        String name67 = "denormalize";
        setField(denormalize, "com.google.javascript.jscomp.PassFactory", "name", name67);
        setField(denormalize, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize", denormalize);
        PassFactory invertContextualRenaming = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$71"));
        setField(invertContextualRenaming, "com.google.javascript.jscomp.DefaultPassConfig$71", "this$0", expected);
        String name68 = "invertNames";
        setField(invertContextualRenaming, "com.google.javascript.jscomp.PassFactory", "name", name68);
        setField(invertContextualRenaming, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming", invertContextualRenaming);
        PassFactory renameProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$72"));
        setField(renameProperties, "com.google.javascript.jscomp.DefaultPassConfig$72", "this$0", expected);
        String name69 = "renameProperties";
        setField(renameProperties, "com.google.javascript.jscomp.PassFactory", "name", name69);
        setField(renameProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties", renameProperties);
        PassFactory renameVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$73"));
        setField(renameVars, "com.google.javascript.jscomp.DefaultPassConfig$73", "this$0", expected);
        String name70 = "renameVars";
        setField(renameVars, "com.google.javascript.jscomp.PassFactory", "name", name70);
        setField(renameVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars", renameVars);
        PassFactory renameLabels = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$74"));
        setField(renameLabels, "com.google.javascript.jscomp.DefaultPassConfig$74", "this$0", expected);
        String name71 = "renameLabels";
        setField(renameLabels, "com.google.javascript.jscomp.PassFactory", "name", name71);
        setField(renameLabels, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels", renameLabels);
        PassFactory convertToDottedProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$75"));
        setField(convertToDottedProperties, "com.google.javascript.jscomp.DefaultPassConfig$75", "this$0", expected);
        String name72 = "convertToDottedProperties";
        setField(convertToDottedProperties, "com.google.javascript.jscomp.PassFactory", "name", name72);
        setField(convertToDottedProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties", convertToDottedProperties);
        PassFactory sanityCheckVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$76"));
        setField(sanityCheckVars, "com.google.javascript.jscomp.DefaultPassConfig$76", "this$0", expected);
        String name73 = "sanityCheckVars";
        setField(sanityCheckVars, "com.google.javascript.jscomp.PassFactory", "name", name73);
        setField(sanityCheckVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars", sanityCheckVars);
        PassFactory instrumentFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$77"));
        setField(instrumentFunctions, "com.google.javascript.jscomp.DefaultPassConfig$77", "this$0", expected);
        String name74 = "instrumentFunctions";
        setField(instrumentFunctions, "com.google.javascript.jscomp.PassFactory", "name", name74);
        setField(instrumentFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions", instrumentFunctions);
        
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
        
        PassFactory expectedSuspiciousCode = expected.suspiciousCode;
        PassFactory actualSuspiciousCode = actual.suspiciousCode;
        String expectedSuspiciousCodeName = expectedSuspiciousCode.getName();
        String actualSuspiciousCodeName = actualSuspiciousCode.getName();
        assertEquals(expectedSuspiciousCodeName, actualSuspiciousCodeName);
        
        boolean actualSuspiciousCodeIsOneTimePass = ((Boolean) getFieldValue(actualSuspiciousCode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass"));
        assertTrue(actualSuspiciousCodeIsOneTimePass);
        
        boolean actualSuspiciousCodeIsCreated = ((Boolean) getFieldValue(actualSuspiciousCode, "com.google.javascript.jscomp.PassFactory", "isCreated"));
        assertFalse(actualSuspiciousCodeIsCreated);
        
        PassFactory expectedCheckControlStructures = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        PassFactory actualCheckControlStructures = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        String expectedCheckControlStructuresName = expectedCheckControlStructures.getName();
        String actualCheckControlStructuresName = actualCheckControlStructures.getName();
        assertEquals(expectedCheckControlStructuresName, actualCheckControlStructuresName);
        
        assertTrue(deepEquals(expectedCheckControlStructures, actualCheckControlStructures));
        assertTrue(deepEquals(expectedCheckControlStructures, actualCheckControlStructures));
        
        PassFactory expectedCheckRequires = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        PassFactory actualCheckRequires = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        String expectedCheckRequiresName = expectedCheckRequires.getName();
        String actualCheckRequiresName = actualCheckRequires.getName();
        assertEquals(expectedCheckRequiresName, actualCheckRequiresName);
        
        assertTrue(deepEquals(expectedCheckRequires, actualCheckRequires));
        assertTrue(deepEquals(expectedCheckRequires, actualCheckRequires));
        
        PassFactory expectedCheckProvides = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
        PassFactory actualCheckProvides = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
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
        
        PassFactory expectedClosurePrimitives = expected.closurePrimitives;
        PassFactory actualClosurePrimitives = actual.closurePrimitives;
        String expectedClosurePrimitivesName = expectedClosurePrimitives.getName();
        String actualClosurePrimitivesName = actualClosurePrimitives.getName();
        assertEquals(expectedClosurePrimitivesName, actualClosurePrimitivesName);
        
        assertTrue(deepEquals(expectedClosurePrimitives, actualClosurePrimitives));
        assertTrue(deepEquals(expectedClosurePrimitives, actualClosurePrimitives));
        
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
        
        PassFactory expectedCheckVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        PassFactory actualCheckVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        String expectedCheckVarsName = expectedCheckVars.getName();
        String actualCheckVarsName = actualCheckVars.getName();
        assertEquals(expectedCheckVarsName, actualCheckVarsName);
        
        assertTrue(deepEquals(expectedCheckVars, actualCheckVars));
        assertTrue(deepEquals(expectedCheckVars, actualCheckVars));
        
        PassFactory expectedCheckShadowVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        PassFactory actualCheckShadowVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        String expectedCheckShadowVarsName = expectedCheckShadowVars.getName();
        String actualCheckShadowVarsName = actualCheckShadowVars.getName();
        assertEquals(expectedCheckShadowVarsName, actualCheckShadowVarsName);
        
        assertTrue(deepEquals(expectedCheckShadowVars, actualCheckShadowVars));
        assertTrue(deepEquals(expectedCheckShadowVars, actualCheckShadowVars));
        
        PassFactory expectedCheckVariableReferences = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
        PassFactory actualCheckVariableReferences = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
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
        
        PassFactory expectedCheckFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkFunctions"));
        PassFactory actualCheckFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkFunctions"));
        String expectedCheckFunctionsName = expectedCheckFunctions.getName();
        String actualCheckFunctionsName = actualCheckFunctions.getName();
        assertEquals(expectedCheckFunctionsName, actualCheckFunctionsName);
        
        assertTrue(deepEquals(expectedCheckFunctions, actualCheckFunctions));
        assertTrue(deepEquals(expectedCheckFunctions, actualCheckFunctions));
        
        PassFactory expectedCheckMethods = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkMethods"));
        PassFactory actualCheckMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkMethods"));
        String expectedCheckMethodsName = expectedCheckMethods.getName();
        String actualCheckMethodsName = actualCheckMethods.getName();
        assertEquals(expectedCheckMethodsName, actualCheckMethodsName);
        
        assertTrue(deepEquals(expectedCheckMethods, actualCheckMethods));
        assertTrue(deepEquals(expectedCheckMethods, actualCheckMethods));
        
        PassFactory expectedResolveTypes = expected.resolveTypes;
        PassFactory actualResolveTypes = actual.resolveTypes;
        String expectedResolveTypesName = expectedResolveTypes.getName();
        String actualResolveTypesName = actualResolveTypes.getName();
        assertEquals(expectedResolveTypesName, actualResolveTypesName);
        
        assertTrue(deepEquals(expectedResolveTypes, actualResolveTypes));
        assertTrue(deepEquals(expectedResolveTypes, actualResolveTypes));
        
        PassFactory expectedInferTypes = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes"));
        PassFactory actualInferTypes = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes"));
        String expectedInferTypesName = expectedInferTypes.getName();
        String actualInferTypesName = actualInferTypes.getName();
        assertEquals(expectedInferTypesName, actualInferTypesName);
        
        assertTrue(deepEquals(expectedInferTypes, actualInferTypes));
        assertTrue(deepEquals(expectedInferTypes, actualInferTypes));
        
        PassFactory expectedCheckTypes = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        PassFactory actualCheckTypes = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        String expectedCheckTypesName = expectedCheckTypes.getName();
        String actualCheckTypesName = actualCheckTypes.getName();
        assertEquals(expectedCheckTypesName, actualCheckTypesName);
        
        assertTrue(deepEquals(expectedCheckTypes, actualCheckTypes));
        assertTrue(deepEquals(expectedCheckTypes, actualCheckTypes));
        
        PassFactory expectedCheckControlFlow = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        PassFactory actualCheckControlFlow = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        String expectedCheckControlFlowName = expectedCheckControlFlow.getName();
        String actualCheckControlFlowName = actualCheckControlFlow.getName();
        assertEquals(expectedCheckControlFlowName, actualCheckControlFlowName);
        
        assertTrue(deepEquals(expectedCheckControlFlow, actualCheckControlFlow));
        assertTrue(deepEquals(expectedCheckControlFlow, actualCheckControlFlow));
        
        PassFactory expectedCheckAccessControls = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
        PassFactory actualCheckAccessControls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
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
        
        PassFactory expectedCheckSuspiciousProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkSuspiciousProperties"));
        PassFactory actualCheckSuspiciousProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkSuspiciousProperties"));
        String expectedCheckSuspiciousPropertiesName = expectedCheckSuspiciousProperties.getName();
        String actualCheckSuspiciousPropertiesName = actualCheckSuspiciousProperties.getName();
        assertEquals(expectedCheckSuspiciousPropertiesName, actualCheckSuspiciousPropertiesName);
        
        assertTrue(deepEquals(expectedCheckSuspiciousProperties, actualCheckSuspiciousProperties));
        assertTrue(deepEquals(expectedCheckSuspiciousProperties, actualCheckSuspiciousProperties));
        
        PassFactory expectedCheckStrictMode = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        PassFactory actualCheckStrictMode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        String expectedCheckStrictModeName = expectedCheckStrictMode.getName();
        String actualCheckStrictModeName = actualCheckStrictMode.getName();
        assertEquals(expectedCheckStrictModeName, actualCheckStrictModeName);
        
        assertTrue(deepEquals(expectedCheckStrictMode, actualCheckStrictMode));
        assertTrue(deepEquals(expectedCheckStrictMode, actualCheckStrictMode));
        
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
        
        PassFactory expectedOptimizeArgumentsArray = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        PassFactory actualOptimizeArgumentsArray = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        String expectedOptimizeArgumentsArrayName = expectedOptimizeArgumentsArray.getName();
        String actualOptimizeArgumentsArrayName = actualOptimizeArgumentsArray.getName();
        assertEquals(expectedOptimizeArgumentsArrayName, actualOptimizeArgumentsArrayName);
        
        assertTrue(deepEquals(expectedOptimizeArgumentsArray, actualOptimizeArgumentsArray));
        assertTrue(deepEquals(expectedOptimizeArgumentsArray, actualOptimizeArgumentsArray));
        
        PassFactory expectedRemoveUselessParameters = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUselessParameters"));
        PassFactory actualRemoveUselessParameters = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUselessParameters"));
        String expectedRemoveUselessParametersName = expectedRemoveUselessParameters.getName();
        String actualRemoveUselessParametersName = actualRemoveUselessParameters.getName();
        assertEquals(expectedRemoveUselessParametersName, actualRemoveUselessParametersName);
        
        assertTrue(deepEquals(expectedRemoveUselessParameters, actualRemoveUselessParameters));
        assertTrue(deepEquals(expectedRemoveUselessParameters, actualRemoveUselessParameters));
        
        PassFactory expectedRemoveAbstractMethods = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeAbstractMethods"));
        PassFactory actualRemoveAbstractMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeAbstractMethods"));
        String expectedRemoveAbstractMethodsName = expectedRemoveAbstractMethods.getName();
        String actualRemoveAbstractMethodsName = actualRemoveAbstractMethods.getName();
        assertEquals(expectedRemoveAbstractMethodsName, actualRemoveAbstractMethodsName);
        
        assertTrue(deepEquals(expectedRemoveAbstractMethods, actualRemoveAbstractMethods));
        assertTrue(deepEquals(expectedRemoveAbstractMethods, actualRemoveAbstractMethods));
        
        PassFactory expectedCollapseProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        PassFactory actualCollapseProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        String expectedCollapsePropertiesName = expectedCollapseProperties.getName();
        String actualCollapsePropertiesName = actualCollapseProperties.getName();
        assertEquals(expectedCollapsePropertiesName, actualCollapsePropertiesName);
        
        assertTrue(deepEquals(expectedCollapseProperties, actualCollapseProperties));
        assertTrue(deepEquals(expectedCollapseProperties, actualCollapseProperties));
        
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
        
        PassFactory expectedRemoveConstantExpressions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeConstantExpressions"));
        PassFactory actualRemoveConstantExpressions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeConstantExpressions"));
        String expectedRemoveConstantExpressionsName = expectedRemoveConstantExpressions.getName();
        String actualRemoveConstantExpressionsName = actualRemoveConstantExpressions.getName();
        assertEquals(expectedRemoveConstantExpressionsName, actualRemoveConstantExpressionsName);
        
        assertTrue(deepEquals(expectedRemoveConstantExpressions, actualRemoveConstantExpressions));
        assertTrue(deepEquals(expectedRemoveConstantExpressions, actualRemoveConstantExpressions));
        
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
        
        PassFactory expectedInlineGetters = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineGetters"));
        PassFactory actualInlineGetters = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineGetters"));
        String expectedInlineGettersName = expectedInlineGetters.getName();
        String actualInlineGettersName = actualInlineGetters.getName();
        assertEquals(expectedInlineGettersName, actualInlineGettersName);
        
        assertTrue(deepEquals(expectedInlineGetters, actualInlineGetters));
        assertTrue(deepEquals(expectedInlineGetters, actualInlineGetters));
        
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
        
        PassFactory expectedCollapseVariableDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        PassFactory actualCollapseVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        String expectedCollapseVariableDeclarationsName = expectedCollapseVariableDeclarations.getName();
        String actualCollapseVariableDeclarationsName = actualCollapseVariableDeclarations.getName();
        assertEquals(expectedCollapseVariableDeclarationsName, actualCollapseVariableDeclarationsName);
        
        assertTrue(deepEquals(expectedCollapseVariableDeclarations, actualCollapseVariableDeclarations));
        assertTrue(deepEquals(expectedCollapseVariableDeclarations, actualCollapseVariableDeclarations));
        
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
        
        CompilerOptions actualOptions = actual.options;
        assertNull(actualOptions);
        
        MemoizedScopeCreator actualTypedScopeCreator = actual.typedScopeCreator;
        assertNull(actualTypedScopeCreator);
        
        Scope actualTopScope = actual.topScope;
        assertNull(actualTopScope);
        
    */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.areNodesEqualForInlining
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#checkTreeEqualsSilent(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n1.checkTreeEqualsSilent(n2);}
 *  */
    @Test
    public void testAreNodesEqualForInlining_OptionsAmbiguatePropertiesOrOptionsDisambiguateProperties() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Node node = new Node(1);
        Node node1 = new Node(0);
        
        boolean actual = compiler.areNodesEqualForInlining(node, node1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#checkTreeTypeAwareEqualsSilent(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n1.checkTreeTypeAwareEqualsSilent(n2);}
 *  */
    @Test
    public void testAreNodesEqualForInlining_OptionsAmbiguatePropertiesOrOptionsDisambiguateProperties_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Node node = new Node(-1);
        Node node1 = new Node(-256);
        
        boolean actual = compiler.areNodesEqualForInlining(node, node1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (options.ambiguateProperties || options.disambiguateProperties): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n1.checkTreeTypeAwareEqualsSilent(n2);
 *  */
    @Test
    public void testAreNodesEqualForInlining_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:874) */
        compiler.areNodesEqualForInlining(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (options.ambiguateProperties || options.disambiguateProperties): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n1.checkTreeTypeAwareEqualsSilent(n2);
 *  */
    @Test
    public void testAreNodesEqualForInlining_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:874) */
        compiler.areNodesEqualForInlining(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#areNodesEqualForInlining(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (options.ambiguateProperties || options.disambiguateProperties): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#checkTreeEqualsSilent(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n1.checkTreeEqualsSilent(n2);
 *  */
    @Test
    public void testAreNodesEqualForInlining_ThrowNullPointerException_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.areNodesEqualForInlining] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:876) */
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
            com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(Compiler.java:870) */
        compiler.areNodesEqualForInlining(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testAreNodesEqualForInlining1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", functionNodeType, functionNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = functionNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(102);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(102);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", functionNodeType, functionNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = functionNode;
        areNodesEqualForInliningMethodArguments[1] = stringNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
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
    public void testAreNodesEqualForInlining4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        boolean actual = compiler.areNodesEqualForInlining(functionNode, node);
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", functionNodeType, functionNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = functionNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType1);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", numberNodeType, numberNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = numberNode;
        areNodesEqualForInliningMethodArguments[1] = functionNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", numberNodeType, numberNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = numberNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", numberNodeType, numberNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = numberNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testAreNodesEqualForInlining9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", functionNodeType, functionNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = functionNode;
        areNodesEqualForInliningMethodArguments[1] = stringNode;
        boolean actual = ((Boolean) areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testAreNodesEqualForInlining10() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", numberNodeType, numberNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = numberNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        try {
            areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testAreNodesEqualForInlining11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        compiler.areNodesEqualForInlining(functionNode, node);
    }
    
    @Test(timeout = 1000L)
    public void testAreNodesEqualForInlining12() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.disambiguateProperties = true;
        compiler.options = options;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method areNodesEqualForInliningMethod = compilerClazz.getDeclaredMethod("areNodesEqualForInlining", numberNodeType, numberNodeType);
        areNodesEqualForInliningMethod.setAccessible(true);
        java.lang.Object[] areNodesEqualForInliningMethodArguments = new java.lang.Object[2];
        areNodesEqualForInliningMethodArguments[0] = numberNode;
        areNodesEqualForInliningMethodArguments[1] = numberNode;
        try {
            areNodesEqualForInliningMethod.invoke(compiler, areNodesEqualForInliningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testAreNodesEqualForInlining13() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ambiguateProperties = true;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        compiler.areNodesEqualForInlining(scriptOrFnNode, node);
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
 * @utbot.returnsFrom {@code return abstractInterpreter;}
 *  */
    @Test
    public void testGetReverseAbstractInterpreter_NotOptionsClosurePass_1() throws Exception  {
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
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
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
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getReverseAbstractInterpreter()}
 * @utbot.executesCondition {@code (abstractInterpreter == null): True}
 * @utbot.executesCondition {@code (options.closurePass): False}
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
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
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
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
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
            com.google.javascript.jscomp.Compiler.isInliningForbidden(Compiler.java:1362) */
        compiler.isInliningForbidden();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.recordFunctionInformation
    
    ///region OTHER: ERROR SUITE for method recordFunctionInformation()
    
    @Test
    public void testRecordFunctionInformation1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.recordFunctionInformation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:745)
            com.google.javascript.jscomp.Compiler.recordFunctionInformation(Compiler.java:1395) */
        compiler.recordFunctionInformation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.removeChangeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)}
 * @utbot.invokes {@link java.util.List#remove(java.lang.Object)}
 *  */
    @Test
    public void testRemoveChangeHandler_ListRemove() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        
        compiler.removeChangeHandler(symbolTable);
    }
    ///endregion
    
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
            com.google.javascript.jscomp.Compiler.removeChangeHandler(Compiler.java:1416) */
        compiler.removeChangeHandler(null);
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
            com.google.javascript.jscomp.Compiler.getCodingConvention(Compiler.java:1433) */
        compiler.getCodingConvention();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (module == null): True}
 * @utbot.executesCondition {@code (inputs.length == 0): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerInput#getAstRoot(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inputs[0].getAstRoot(this);
 *  */
    @Test
    public void testGetNodeForCodeInsertion_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] inputs = {null};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputs", inputs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1575) */
        compiler.getNodeForCodeInsertion(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (module == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inputs.size() > 0
 *  */
    @Test
    public void testGetNodeForCodeInsertion_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1579) */
        compiler.getNodeForCodeInsertion(jSModule);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (module == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inputs.length == 0
 *  */
    @Test
    public void testGetNodeForCodeInsertion_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1571) */
        compiler.getNodeForCodeInsertion(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (module == null): False}
 * @utbot.executesCondition {@code (inputs.size() > 0): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getModuleGraph()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSModule m: getModuleGraph().getTransitiveDepsDeepestFirst(module))
 *  */
    @Test
    public void testGetNodeForCodeInsertion_ThrowNullPointerException_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1582) */
        compiler.getNodeForCodeInsertion(jSModule);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (module == null): True}
 * @utbot.executesCondition {@code (inputs.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: inputs.length == 0
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetNodeForCodeInsertion_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] inputs = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputs", inputs);
        
        compiler.getNodeForCodeInsertion(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)
    
    @Test(expected = StackOverflowError.class)
    public void testGetNodeForCodeInsertion1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.CompilerInput[] inputs = new com.google.javascript.jscomp.CompilerInput[9];
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "ast", compilerInput);
        inputs[0] = compilerInput;
        inputs[1] = compilerInput;
        inputs[2] = compilerInput;
        inputs[3] = compilerInput;
        inputs[4] = compilerInput;
        inputs[5] = compilerInput;
        inputs[6] = compilerInput;
        inputs[7] = compilerInput;
        inputs[8] = compilerInput;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputs", inputs);
        
        compiler.getNodeForCodeInsertion(null);
    }
    
    @Test
    public void testGetNodeForCodeInsertion2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSModuleGraph moduleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        LinkedHashMap dependencyMap = new LinkedHashMap();
        setField(moduleGraph, "com.google.javascript.jscomp.JSModuleGraph", "dependencyMap", dependencyMap);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "moduleGraph", moduleGraph);
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSModuleGraph.addDeps(JSModuleGraph.java:224)
            com.google.javascript.jscomp.JSModuleGraph.getTransitiveDepsDeepestFirst(JSModuleGraph.java:215)
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1582) */
        compiler.getNodeForCodeInsertion(jSModule);
    }
    
    @Test
    public void testGetNodeForCodeInsertion3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(Compiler.java:1580) */
        compiler.getNodeForCodeInsertion(jSModule);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.rebuildInputsFromModules
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rebuildInputsFromModules()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#rebuildInputsFromModules()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inputs = getAllInputsFromModules();
 *  */
    @Test
    public void testRebuildInputsFromModules_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] modules = new com.google.javascript.jscomp.JSModule[1];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules[0] = jSModule;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:352)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:340) */
        compiler.rebuildInputsFromModules();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#rebuildInputsFromModules()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inputs = getAllInputsFromModules();
 *  */
    @Test
    public void testRebuildInputsFromModules_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] modules = {null};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:352)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:340) */
        compiler.rebuildInputsFromModules();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#rebuildInputsFromModules()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inputs = getAllInputsFromModules();
 *  */
    @Test
    public void testRebuildInputsFromModules_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:351)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:340) */
        compiler.rebuildInputsFromModules();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method rebuildInputsFromModules()
    
    @Test
    public void testRebuildInputsFromModules1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] modules = new com.google.javascript.jscomp.JSModule[9];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        modules[0] = jSModule;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:353)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:340) */
        compiler.rebuildInputsFromModules();
    }
    
    @Test
    public void testRebuildInputsFromModules2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] modules = new com.google.javascript.jscomp.JSModule[9];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        modules[0] = jSModule;
        JSModule jSModule1 = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        modules[1] = jSModule1;
        modules[2] = jSModule1;
        modules[3] = jSModule1;
        modules[4] = jSModule1;
        modules[5] = jSModule1;
        modules[6] = jSModule1;
        modules[7] = jSModule1;
        modules[8] = jSModule1;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getAllInputsFromModules(Compiler.java:352)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:340) */
        compiler.rebuildInputsFromModules();
    }
    
    @Test
    public void testRebuildInputsFromModules3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.ideMode = true;
        compiler.options = options;
        com.google.javascript.jscomp.JSModule[] modules = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:385)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:341) */
        compiler.rebuildInputsFromModules();
    }
    
    @Test
    public void testRebuildInputsFromModules4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        com.google.javascript.jscomp.JSModule[] modules = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "errorCount", -2147483647);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:385)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:341) */
        compiler.rebuildInputsFromModules();
    }
    
    @Test
    public void testRebuildInputsFromModules5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        com.google.javascript.jscomp.JSModule[] modules = {};
        setField(compiler, "com.google.javascript.jscomp.Compiler", "modules", modules);
        AntErrorManager errorManager = ((AntErrorManager) createInstance("com.google.javascript.jscomp.ant.AntErrorManager"));
        setField(errorManager, "com.google.javascript.jscomp.BasicErrorManager", "errorCount", 1);
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.rebuildInputsFromModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.initInputsByNameMap(Compiler.java:385)
            com.google.javascript.jscomp.Compiler.rebuildInputsFromModules(Compiler.java:341) */
        compiler.rebuildInputsFromModules();
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
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.createMessageFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createMessageFormatter()
    
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
        boolean actualSourceOptionsIdeMode = actualSourceOptions.ideMode;
        assertFalse(actualSourceOptionsIdeMode);
        
        boolean actualSourceOptionsSkipAllPasses = actualSourceOptions.skipAllPasses;
        assertFalse(actualSourceOptionsSkipAllPasses);
        
        boolean actualSourceOptionsNameAnonymousFunctionsOnly = actualSourceOptions.nameAnonymousFunctionsOnly;
        assertFalse(actualSourceOptionsNameAnonymousFunctionsOnly);
        
        CompilerOptions.DevMode actualSourceOptionsDevMode = actualSourceOptions.devMode;
        assertNull(actualSourceOptionsDevMode);
        
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
        
        boolean actualSourceOptionsRemoveConstantExpressions = actualSourceOptions.removeConstantExpressions;
        assertFalse(actualSourceOptionsRemoveConstantExpressions);
        
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
        
        boolean actualSourceOptionsRemoveUnusedVarsInGlobalScope = actualSourceOptions.removeUnusedVarsInGlobalScope;
        assertFalse(actualSourceOptionsRemoveUnusedVarsInGlobalScope);
        
        boolean actualSourceOptionsAliasExternals = actualSourceOptions.aliasExternals;
        assertFalse(actualSourceOptionsAliasExternals);
        
        String actualSourceOptionsAliasableGlobals = actualSourceOptions.aliasableGlobals;
        assertNull(actualSourceOptionsAliasableGlobals);
        
        String actualSourceOptionsUnaliasableGlobals = actualSourceOptions.unaliasableGlobals;
        assertNull(actualSourceOptionsUnaliasableGlobals);
        
        boolean actualSourceOptionsCollapseVariableDeclarations = actualSourceOptions.collapseVariableDeclarations;
        assertFalse(actualSourceOptionsCollapseVariableDeclarations);
        
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
        
        boolean actualSourceOptionsOptimizeArgumentsArray = actualSourceOptions.optimizeArgumentsArray;
        assertFalse(actualSourceOptionsOptimizeArgumentsArray);
        
        boolean actualSourceOptionsChainCalls = actualSourceOptions.chainCalls;
        assertFalse(actualSourceOptionsChainCalls);
        
        VariableRenamingPolicy actualSourceOptionsVariableRenaming = actualSourceOptions.variableRenaming;
        assertNull(actualSourceOptionsVariableRenaming);
        
        PropertyRenamingPolicy actualSourceOptionsPropertyRenaming = actualSourceOptions.propertyRenaming;
        assertNull(actualSourceOptionsPropertyRenaming);
        
        boolean actualSourceOptionsLabelRenaming = actualSourceOptions.labelRenaming;
        assertFalse(actualSourceOptionsLabelRenaming);
        
        boolean actualSourceOptionsReserveRawExports = actualSourceOptions.reserveRawExports;
        assertFalse(actualSourceOptionsReserveRawExports);
        
        boolean actualSourceOptionsGeneratePseudoNames = actualSourceOptions.generatePseudoNames;
        assertFalse(actualSourceOptionsGeneratePseudoNames);
        
        String actualSourceOptionsRenamePrefix = actualSourceOptions.renamePrefix;
        assertNull(actualSourceOptionsRenamePrefix);
        
        boolean actualSourceOptionsAliasKeywords = actualSourceOptions.aliasKeywords;
        assertFalse(actualSourceOptionsAliasKeywords);
        
        boolean actualSourceOptionsCollapseProperties = actualSourceOptions.collapseProperties;
        assertFalse(actualSourceOptionsCollapseProperties);
        
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
        
        String actualSourceOptionsExternExportsPath = actualSourceOptions.externExportsPath;
        assertNull(actualSourceOptionsExternExportsPath);
        
        String actualSourceOptionsNameReferenceReportPath = actualSourceOptions.nameReferenceReportPath;
        assertNull(actualSourceOptionsNameReferenceReportPath);
        
        String actualSourceOptionsNameReferenceGraphPath = actualSourceOptions.nameReferenceGraphPath;
        assertNull(actualSourceOptionsNameReferenceGraphPath);
        
        String actualSourceOptionsSourceMapOutputPath = actualSourceOptions.sourceMapOutputPath;
        assertNull(actualSourceOptionsSourceMapOutputPath);
        
        Charset actualSourceOptionsOutputCharset = actualSourceOptions.outputCharset;
        assertNull(actualSourceOptionsOutputCharset);
        
        PassConfig actualSourcePasses = ((PassConfig) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualSourcePasses);
        
        com.google.javascript.jscomp.CompilerInput[] actualSourceExterns = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externs"));
        assertNull(actualSourceExterns);
        
        com.google.javascript.jscomp.JSModule[] actualSourceModules = ((com.google.javascript.jscomp.JSModule[]) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "modules"));
        assertNull(actualSourceModules);
        
        JSModuleGraph actualSourceModuleGraph = (((Compiler) actualSource)).getModuleGraph();
        assertNull(actualSourceModuleGraph);
        
        com.google.javascript.jscomp.CompilerInput[] actualSourceInputs = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "inputs"));
        assertNull(actualSourceInputs);
        
        ErrorManager actualSourceErrorManager = (((Compiler) actualSource)).getErrorManager();
        assertNull(actualSourceErrorManager);
        
        SymbolTable actualSourceSymbolTable = ((SymbolTable) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        assertNull(actualSourceSymbolTable);
        
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
        
        boolean actualSourceNormalized = ((Boolean) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "normalized"));
        assertFalse(actualSourceNormalized);
        
        boolean actualSourceUseThreads = ((Boolean) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualSourceUseThreads);
        
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
    public void testCreateMessageFormatter_ReturnOptionsErrorFormatToFormatter_1() throws Exception  {
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
        boolean actualSourceOptionsIdeMode = actualSourceOptions.ideMode;
        assertFalse(actualSourceOptionsIdeMode);
        
        boolean actualSourceOptionsSkipAllPasses = actualSourceOptions.skipAllPasses;
        assertFalse(actualSourceOptionsSkipAllPasses);
        
        boolean actualSourceOptionsNameAnonymousFunctionsOnly = actualSourceOptions.nameAnonymousFunctionsOnly;
        assertFalse(actualSourceOptionsNameAnonymousFunctionsOnly);
        
        CompilerOptions.DevMode actualSourceOptionsDevMode = actualSourceOptions.devMode;
        assertNull(actualSourceOptionsDevMode);
        
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
        
        boolean actualSourceOptionsRemoveConstantExpressions = actualSourceOptions.removeConstantExpressions;
        assertFalse(actualSourceOptionsRemoveConstantExpressions);
        
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
        
        boolean actualSourceOptionsRemoveUnusedVarsInGlobalScope = actualSourceOptions.removeUnusedVarsInGlobalScope;
        assertFalse(actualSourceOptionsRemoveUnusedVarsInGlobalScope);
        
        boolean actualSourceOptionsAliasExternals = actualSourceOptions.aliasExternals;
        assertFalse(actualSourceOptionsAliasExternals);
        
        String actualSourceOptionsAliasableGlobals = actualSourceOptions.aliasableGlobals;
        assertNull(actualSourceOptionsAliasableGlobals);
        
        String actualSourceOptionsUnaliasableGlobals = actualSourceOptions.unaliasableGlobals;
        assertNull(actualSourceOptionsUnaliasableGlobals);
        
        boolean actualSourceOptionsCollapseVariableDeclarations = actualSourceOptions.collapseVariableDeclarations;
        assertFalse(actualSourceOptionsCollapseVariableDeclarations);
        
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
        
        boolean actualSourceOptionsOptimizeArgumentsArray = actualSourceOptions.optimizeArgumentsArray;
        assertFalse(actualSourceOptionsOptimizeArgumentsArray);
        
        boolean actualSourceOptionsChainCalls = actualSourceOptions.chainCalls;
        assertFalse(actualSourceOptionsChainCalls);
        
        VariableRenamingPolicy actualSourceOptionsVariableRenaming = actualSourceOptions.variableRenaming;
        assertNull(actualSourceOptionsVariableRenaming);
        
        PropertyRenamingPolicy actualSourceOptionsPropertyRenaming = actualSourceOptions.propertyRenaming;
        assertNull(actualSourceOptionsPropertyRenaming);
        
        boolean actualSourceOptionsLabelRenaming = actualSourceOptions.labelRenaming;
        assertFalse(actualSourceOptionsLabelRenaming);
        
        boolean actualSourceOptionsReserveRawExports = actualSourceOptions.reserveRawExports;
        assertFalse(actualSourceOptionsReserveRawExports);
        
        boolean actualSourceOptionsGeneratePseudoNames = actualSourceOptions.generatePseudoNames;
        assertFalse(actualSourceOptionsGeneratePseudoNames);
        
        String actualSourceOptionsRenamePrefix = actualSourceOptions.renamePrefix;
        assertNull(actualSourceOptionsRenamePrefix);
        
        boolean actualSourceOptionsAliasKeywords = actualSourceOptions.aliasKeywords;
        assertFalse(actualSourceOptionsAliasKeywords);
        
        boolean actualSourceOptionsCollapseProperties = actualSourceOptions.collapseProperties;
        assertFalse(actualSourceOptionsCollapseProperties);
        
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
        
        String actualSourceOptionsExternExportsPath = actualSourceOptions.externExportsPath;
        assertNull(actualSourceOptionsExternExportsPath);
        
        String actualSourceOptionsNameReferenceReportPath = actualSourceOptions.nameReferenceReportPath;
        assertNull(actualSourceOptionsNameReferenceReportPath);
        
        String actualSourceOptionsNameReferenceGraphPath = actualSourceOptions.nameReferenceGraphPath;
        assertNull(actualSourceOptionsNameReferenceGraphPath);
        
        String actualSourceOptionsSourceMapOutputPath = actualSourceOptions.sourceMapOutputPath;
        assertNull(actualSourceOptionsSourceMapOutputPath);
        
        Charset actualSourceOptionsOutputCharset = actualSourceOptions.outputCharset;
        assertNull(actualSourceOptionsOutputCharset);
        
        PassConfig actualSourcePasses = ((PassConfig) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualSourcePasses);
        
        com.google.javascript.jscomp.CompilerInput[] actualSourceExterns = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "externs"));
        assertNull(actualSourceExterns);
        
        com.google.javascript.jscomp.JSModule[] actualSourceModules = ((com.google.javascript.jscomp.JSModule[]) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "modules"));
        assertNull(actualSourceModules);
        
        JSModuleGraph actualSourceModuleGraph = (((Compiler) actualSource)).getModuleGraph();
        assertNull(actualSourceModuleGraph);
        
        com.google.javascript.jscomp.CompilerInput[] actualSourceInputs = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "inputs"));
        assertNull(actualSourceInputs);
        
        ErrorManager actualSourceErrorManager = (((Compiler) actualSource)).getErrorManager();
        assertNull(actualSourceErrorManager);
        
        SymbolTable actualSourceSymbolTable = ((SymbolTable) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        assertNull(actualSourceSymbolTable);
        
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
        
        boolean actualSourceNormalized = ((Boolean) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "normalized"));
        assertFalse(actualSourceNormalized);
        
        boolean actualSourceUseThreads = ((Boolean) getFieldValue(actualSource, "com.google.javascript.jscomp.Compiler", "useThreads"));
        assertFalse(actualSourceUseThreads);
        
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
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions#shouldColorizeErrorOutput()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean colorize = options.shouldColorizeErrorOutput();
 *  */
    @Test
    public void testCreateMessageFormatter_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.createMessageFormatter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:212) */
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
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:213) */
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
            com.google.javascript.jscomp.Compiler.addIncrementalSourceAst(Compiler.java:906) */
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
            com.google.javascript.jscomp.Compiler.addIncrementalSourceAst(Compiler.java:906) */
        compiler.addIncrementalSourceAst(jsAst);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.externExports
    
    ///region OTHER: ERROR SUITE for method externExports()
    
    @Test
    public void testExternExports1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.externExports] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:745)
            com.google.javascript.jscomp.Compiler.externExports(Compiler.java:663) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.acquireSymbolTable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acquireSymbolTable()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acquireSymbolTable()}
 * @utbot.executesCondition {@code (symbolTable == null): False}
 * @utbot.returnsFrom {@code return symbolTable;}
 *  */
    @Test
    public void testAcquireSymbolTable_SymbolTableNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "symbolTable", symbolTable);
        
        SymbolTable actual = compiler.acquireSymbolTable();
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.SymbolTable", "compiler"));
        assertNull(actualCompiler);
        
        ScopeCreator actualScopeCreator = ((ScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.SymbolTable", "scopeCreator"));
        assertNull(actualScopeCreator);
        
        boolean actualLocked = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.SymbolTable", "locked"));
        assertTrue(actualLocked);
        
        Object actualCache = getFieldValue(actual, "com.google.javascript.jscomp.SymbolTable", "cache");
        assertNull(actualCache);
        
        SymbolTable compilerSymbolTable = ((SymbolTable) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        boolean finalCompilerSymbolTableLocked = ((Boolean) getFieldValue(compilerSymbolTable, "com.google.javascript.jscomp.SymbolTable", "locked"));
        
        assertTrue(finalCompilerSymbolTableLocked);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acquireSymbolTable()}
 * @utbot.executesCondition {@code (symbolTable == null): True}
 * @utbot.returnsFrom {@code return symbolTable;}
 *  */
    @Test
    public void testAcquireSymbolTable_SymbolTableEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        SymbolTable initialCompilerSymbolTable = ((SymbolTable) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        
        SymbolTable actual = compiler.acquireSymbolTable();
        
        SymbolTable expected = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(expected, "com.google.javascript.jscomp.SymbolTable", "compiler", compiler);
        SyntacticScopeCreator scopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        setField(scopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        Object redeclarationHandler = createInstance("com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler");
        setField(redeclarationHandler, "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler", "this$0", scopeCreator);
        setField(scopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler", redeclarationHandler);
        setField(expected, "com.google.javascript.jscomp.SymbolTable", "scopeCreator", scopeCreator);
        setField(expected, "com.google.javascript.jscomp.SymbolTable", "locked", true);
        
        AbstractCompiler expectedCompiler = ((AbstractCompiler) getFieldValue(expected, "com.google.javascript.jscomp.SymbolTable", "compiler"));
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.SymbolTable", "compiler"));
        CompilerOptions actualCompilerOptions = (((Compiler) actualCompiler)).getOptions();
        assertNull(actualCompilerOptions);
        
        PassConfig actualCompilerPasses = ((PassConfig) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "passes"));
        assertNull(actualCompilerPasses);
        
        com.google.javascript.jscomp.CompilerInput[] actualCompilerExterns = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "externs"));
        assertNull(actualCompilerExterns);
        
        com.google.javascript.jscomp.JSModule[] actualCompilerModules = ((com.google.javascript.jscomp.JSModule[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "modules"));
        assertNull(actualCompilerModules);
        
        JSModuleGraph actualCompilerModuleGraph = (((Compiler) actualCompiler)).getModuleGraph();
        assertNull(actualCompilerModuleGraph);
        
        com.google.javascript.jscomp.CompilerInput[] actualCompilerInputs = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "inputs"));
        assertNull(actualCompilerInputs);
        
        ErrorManager actualCompilerErrorManager = (((Compiler) actualCompiler)).getErrorManager();
        assertNull(actualCompilerErrorManager);
        
        SymbolTable expectedCompilerSymbolTable = ((SymbolTable) getFieldValue(expectedCompiler, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        SymbolTable actualCompilerSymbolTable = ((SymbolTable) getFieldValue(actualCompiler, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        assertTrue(deepEquals(expectedCompilerSymbolTable, actualCompilerSymbolTable));
        ScopeCreator expectedCompilerSymbolTableScopeCreator = ((ScopeCreator) getFieldValue(expectedCompilerSymbolTable, "com.google.javascript.jscomp.SymbolTable", "scopeCreator"));
        ScopeCreator actualCompilerSymbolTableScopeCreator = ((ScopeCreator) getFieldValue(actualCompilerSymbolTable, "com.google.javascript.jscomp.SymbolTable", "scopeCreator"));
        AbstractCompiler expectedCompilerSymbolTableScopeCreatorCompiler = ((AbstractCompiler) getFieldValue(expectedCompilerSymbolTableScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler"));
        AbstractCompiler actualCompilerSymbolTableScopeCreatorCompiler = ((AbstractCompiler) getFieldValue(actualCompilerSymbolTableScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler"));
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompiler, actualCompilerSymbolTableScopeCreatorCompiler));
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompiler, actualCompilerSymbolTableScopeCreatorCompiler));
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompiler, actualCompilerSymbolTableScopeCreatorCompiler));
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompiler, actualCompilerSymbolTableScopeCreatorCompiler));
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompiler, actualCompilerSymbolTableScopeCreatorCompiler));
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompiler, actualCompilerSymbolTableScopeCreatorCompiler));
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompiler, actualCompilerSymbolTableScopeCreatorCompiler));
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompiler, actualCompilerSymbolTableScopeCreatorCompiler));
        Node actualCompilerSymbolTableScopeCreatorCompilerExternsRoot = ((Node) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "externsRoot"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerExternsRoot, actualCompilerSymbolTableScopeCreatorCompilerExternsRoot));
        
        Node actualCompilerSymbolTableScopeCreatorCompilerJsRoot = ((Node) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "jsRoot"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerJsRoot, actualCompilerSymbolTableScopeCreatorCompilerJsRoot));
        
        Node actualCompilerSymbolTableScopeCreatorCompilerExternAndJsRoot = ((Node) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "externAndJsRoot"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerExternAndJsRoot, actualCompilerSymbolTableScopeCreatorCompilerExternAndJsRoot));
        
        Map actualCompilerSymbolTableScopeCreatorCompilerInputsByName = ((Map) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "inputsByName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerInputsByName, actualCompilerSymbolTableScopeCreatorCompilerInputsByName));
        
        SourceMap actualCompilerSymbolTableScopeCreatorCompilerSourceMap = (((Compiler) actualCompilerSymbolTableScopeCreatorCompiler)).getSourceMap();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerSourceMap, actualCompilerSymbolTableScopeCreatorCompilerSourceMap));
        
        String actualCompilerSymbolTableScopeCreatorCompilerExternExports = ((String) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "externExports"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerExternExports, actualCompilerSymbolTableScopeCreatorCompilerExternExports));
        
        int expectedCompilerSymbolTableScopeCreatorCompilerUniqueNameId = ((Integer) getFieldValue(expectedCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        int actualCompilerSymbolTableScopeCreatorCompilerUniqueNameId = ((Integer) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompilerUniqueNameId, actualCompilerSymbolTableScopeCreatorCompilerUniqueNameId));
        
        boolean actualCompilerSymbolTableScopeCreatorCompilerNormalized = ((Boolean) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "normalized"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerNormalized, actualCompilerSymbolTableScopeCreatorCompilerNormalized));
        
        boolean actualCompilerSymbolTableScopeCreatorCompilerUseThreads = ((Boolean) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "useThreads"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerUseThreads, actualCompilerSymbolTableScopeCreatorCompilerUseThreads));
        
        FunctionInformationMap actualCompilerSymbolTableScopeCreatorCompilerFunctionInformationMap = ((FunctionInformationMap) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "functionInformationMap"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerFunctionInformationMap, actualCompilerSymbolTableScopeCreatorCompilerFunctionInformationMap));
        
        StringBuilder actualCompilerSymbolTableScopeCreatorCompilerDebugLog = ((StringBuilder) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "debugLog"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerDebugLog, actualCompilerSymbolTableScopeCreatorCompilerDebugLog));
        
        CodingConvention actualCompilerSymbolTableScopeCreatorCompilerDefaultCodingConvention = ((CodingConvention) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerDefaultCodingConvention, actualCompilerSymbolTableScopeCreatorCompilerDefaultCodingConvention));
        
        JSTypeRegistry actualCompilerSymbolTableScopeCreatorCompilerTypeRegistry = (((Compiler) actualCompilerSymbolTableScopeCreatorCompiler)).getTypeRegistry();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerTypeRegistry, actualCompilerSymbolTableScopeCreatorCompilerTypeRegistry));
        
        Config actualCompilerSymbolTableScopeCreatorCompilerParserConfig = (((Compiler) actualCompilerSymbolTableScopeCreatorCompiler)).getParserConfig();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerParserConfig, actualCompilerSymbolTableScopeCreatorCompilerParserConfig));
        
        ReverseAbstractInterpreter actualCompilerSymbolTableScopeCreatorCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerAbstractInterpreter, actualCompilerSymbolTableScopeCreatorCompilerAbstractInterpreter));
        
        TypeValidator actualCompilerSymbolTableScopeCreatorCompilerTypeValidator = (((Compiler) actualCompilerSymbolTableScopeCreatorCompiler)).getTypeValidator();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerTypeValidator, actualCompilerSymbolTableScopeCreatorCompilerTypeValidator));
        
        PerformanceTracker actualCompilerSymbolTableScopeCreatorCompilerTracker = ((PerformanceTracker) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "tracker"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerTracker, actualCompilerSymbolTableScopeCreatorCompilerTracker));
        
        ErrorReporter actualCompilerSymbolTableScopeCreatorCompilerOldErrorReporter = ((ErrorReporter) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerOldErrorReporter, actualCompilerSymbolTableScopeCreatorCompilerOldErrorReporter));
        
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actualCompilerSymbolTableScopeCreatorCompilerDefaultErrorReporter = (((Compiler) actualCompilerSymbolTableScopeCreatorCompiler)).getDefaultErrorReporter();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerDefaultErrorReporter, actualCompilerSymbolTableScopeCreatorCompilerDefaultErrorReporter));
        
        PrintStream actualCompilerSymbolTableScopeCreatorCompilerOutStream = ((PrintStream) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "outStream"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerOutStream, actualCompilerSymbolTableScopeCreatorCompilerOutStream));
        
        PassFactory actualCompilerSymbolTableScopeCreatorCompilerSanityCheck = ((PassFactory) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerSanityCheck, actualCompilerSymbolTableScopeCreatorCompilerSanityCheck));
        
        Tracer actualCompilerSymbolTableScopeCreatorCompilerCurrentTracer = ((Tracer) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "currentTracer"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerCurrentTracer, actualCompilerSymbolTableScopeCreatorCompilerCurrentTracer));
        
        String actualCompilerSymbolTableScopeCreatorCompilerCurrentPassName = ((String) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "currentPassName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerCurrentPassName, actualCompilerSymbolTableScopeCreatorCompilerCurrentPassName));
        
        CodeChangeHandler.RecentChange actualCompilerSymbolTableScopeCreatorCompilerRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "recentChange"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCompilerSymbolTableScopeCreatorCompilerRecentChange, actualCompilerSymbolTableScopeCreatorCompilerRecentChange));
        
        List expectedCompilerSymbolTableScopeCreatorCompilerCodeChangeHandlers = ((List) getFieldValue(expectedCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
        List actualCompilerSymbolTableScopeCreatorCompilerCodeChangeHandlers = ((List) getFieldValue(actualCompilerSymbolTableScopeCreatorCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCompilerSymbolTableScopeCreatorCompilerCodeChangeHandlers, actualCompilerSymbolTableScopeCreatorCompilerCodeChangeHandlers));
        
        Scope actualCompilerSymbolTableScopeCreatorScope = ((Scope) getFieldValue(actualCompilerSymbolTableScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "scope"));
        assertNull(actualCompilerSymbolTableScopeCreatorScope);
        
        String actualCompilerSymbolTableScopeCreatorSourceName = ((String) getFieldValue(actualCompilerSymbolTableScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName"));
        assertNull(actualCompilerSymbolTableScopeCreatorSourceName);
        
        SyntacticScopeCreator.RedeclarationHandler expectedCompilerSymbolTableScopeCreatorRedeclarationHandler = ((SyntacticScopeCreator.RedeclarationHandler) getFieldValue(expectedCompilerSymbolTableScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler"));
        SyntacticScopeCreator.RedeclarationHandler actualCompilerSymbolTableScopeCreatorRedeclarationHandler = ((SyntacticScopeCreator.RedeclarationHandler) getFieldValue(actualCompilerSymbolTableScopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "redeclarationHandler"));
        
        boolean actualCompilerSymbolTableLocked = ((Boolean) getFieldValue(actualCompilerSymbolTable, "com.google.javascript.jscomp.SymbolTable", "locked"));
        assertTrue(actualCompilerSymbolTableLocked);
        
        Object actualCompilerSymbolTableCache = getFieldValue(actualCompilerSymbolTable, "com.google.javascript.jscomp.SymbolTable", "cache");
        assertNull(actualCompilerSymbolTableCache);
        
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        assertTrue(deepEquals(expectedCompiler, actualCompiler));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        SymbolTable finalCompilerSymbolTable = ((SymbolTable) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "symbolTable"));
        
        assertFalse(initialCompilerSymbolTable == finalCompilerSymbolTable);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method acquireSymbolTable()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#acquireSymbolTable()}
 * @utbot.executesCondition {@code (symbolTable == null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.SymbolTable#acquire()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: symbolTable.acquire();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAcquireSymbolTable_ThrowIllegalStateException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "locked", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "symbolTable", symbolTable);
        
        compiler.acquireSymbolTable();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.checkFirstModule
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkFirstModule([Lcom.google.javascript.jscomp.JSModule;)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#checkFirstModule(com.google.javascript.jscomp.JSModule[])}
 * @utbot.executesCondition {@code (modules.length == 0): False}
 * @utbot.executesCondition {@code (modules[0].getInputs().isEmpty()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.JSModule#getInputs()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 *  */
    @Test
    public void testCheckFirstModule_NotModules0GetInputsIsEmpty() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[1];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        inputs.add(null);
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        jSModuleArray[0] = jSModule;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSModuleArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSModule;");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", jSModuleArrayType);
        checkFirstModuleMethod.setAccessible(true);
        java.lang.Object[] checkFirstModuleMethodArguments = new java.lang.Object[1];
        checkFirstModuleMethodArguments[0] = ((Object) jSModuleArray);
        checkFirstModuleMethod.invoke(compiler, checkFirstModuleMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkFirstModule([Lcom.google.javascript.jscomp.JSModule;)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#checkFirstModule(com.google.javascript.jscomp.JSModule[])}
 * @utbot.executesCondition {@code (modules.length == 0): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.JSModule#getInputs()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: modules[0].getInputs().isEmpty()
 *  */
    @Test
    public void testCheckFirstModule_ThrowNullPointerException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {null};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.checkFirstModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:318) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSModuleArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSModule;");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", jSModuleArrayType);
        checkFirstModuleMethod.setAccessible(true);
        java.lang.Object[] checkFirstModuleMethodArguments = new java.lang.Object[1];
        checkFirstModuleMethodArguments[0] = ((Object) jSModuleArray);
        try {
            checkFirstModuleMethod.invoke(compiler, checkFirstModuleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#checkFirstModule(com.google.javascript.jscomp.JSModule[])}
 * @utbot.executesCondition {@code (modules.length == 0): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.JSModule#getInputs()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: modules[0].getInputs().isEmpty()
 *  */
    @Test
    public void testCheckFirstModule_ThrowNullPointerException_2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[1];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        jSModuleArray[0] = jSModule;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.checkFirstModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:318) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSModuleArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSModule;");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", jSModuleArrayType);
        checkFirstModuleMethod.setAccessible(true);
        java.lang.Object[] checkFirstModuleMethodArguments = new java.lang.Object[1];
        checkFirstModuleMethodArguments[0] = ((Object) jSModuleArray);
        try {
            checkFirstModuleMethod.invoke(compiler, checkFirstModuleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#checkFirstModule(com.google.javascript.jscomp.JSModule[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: modules.length == 0
 *  */
    @Test
    public void testCheckFirstModule_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.checkFirstModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:316) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSModuleArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSModule;");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", jSModuleArrayType);
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
    
    ///region OTHER: ERROR SUITE for method checkFirstModule([Lcom.google.javascript.jscomp.JSModule;)
    
    @Test
    public void testCheckFirstModule1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = new com.google.javascript.jscomp.JSModule[9];
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        jSModuleArray[0] = jSModule;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.checkFirstModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1465)
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:319) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSModuleArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSModule;");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", jSModuleArrayType);
        checkFirstModuleMethod.setAccessible(true);
        java.lang.Object[] checkFirstModuleMethodArguments = new java.lang.Object[1];
        checkFirstModuleMethodArguments[0] = ((Object) jSModuleArray);
        try {
            checkFirstModuleMethod.invoke(compiler, checkFirstModuleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckFirstModule2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSModule[] jSModuleArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.checkFirstModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1465)
            com.google.javascript.jscomp.Compiler.checkFirstModule(Compiler.java:317) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSModuleArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSModule;");
        Method checkFirstModuleMethod = compilerClazz.getDeclaredMethod("checkFirstModule", jSModuleArrayType);
        checkFirstModuleMethod.setAccessible(true);
        java.lang.Object[] checkFirstModuleMethodArguments = new java.lang.Object[1];
        checkFirstModuleMethodArguments[0] = ((Object) jSModuleArray);
        try {
            checkFirstModuleMethod.invoke(compiler, checkFirstModuleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.initOptions
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initOptions(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initOptions(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (errorManager == null): False}
 *  */
    @Test
    public void testInitOptions_ErrorManagerNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        compiler.initOptions(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initOptions(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initOptions(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (outStream == null): False}
 * @utbot.invokes com.google.javascript.jscomp.Compiler#createMessageFormatter()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new PrintStreamErrorManager(createMessageFormatter(), outStream)
 *  */
    @Test
    public void testInitOptions_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:212)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:228) */
        compiler.initOptions(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initOptions(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (outStream == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new LoggerErrorManager(createMessageFormatter(), logger)
 *  */
    @Test
    public void testInitOptions_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:212)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:225) */
        compiler.initOptions(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initOptions(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (outStream == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new LoggerErrorManager(createMessageFormatter(), logger)
 *  */
    @Test
    public void testInitOptions_ThrowNullPointerException_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:213)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:225) */
        compiler.initOptions(compilerOptions);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method initOptions(com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testInitOptions1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.SOURCELESS;
        compilerOptions.errorFormat = errorFormat;
        
        CompilerOptions initialCompilerOptions = compiler.options;
        ErrorManager initialCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        ErrorFormat initialCompilerOptionsErrorFormat = compilerOptions.errorFormat;
        
        compiler.initOptions(compilerOptions);
        
        CompilerOptions finalCompilerOptions = compiler.options;
        ErrorManager finalCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        ErrorFormat finalCompilerOptionsErrorFormat = compilerOptions.errorFormat;
        
        assertFalse(initialCompilerOptions == finalCompilerOptions);
        
        assertFalse(initialCompilerErrorManager == finalCompilerErrorManager);
        
        assertFalse(initialCompilerOptionsErrorFormat == finalCompilerOptionsErrorFormat);
    }
    
    @Test
    public void testInitOptions2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.LEGACY;
        compilerOptions.errorFormat = errorFormat;
        
        CompilerOptions initialCompilerOptions = compiler.options;
        ErrorManager initialCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        ErrorFormat initialCompilerOptionsErrorFormat = compilerOptions.errorFormat;
        
        compiler.initOptions(compilerOptions);
        
        CompilerOptions finalCompilerOptions = compiler.options;
        ErrorManager finalCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        ErrorFormat finalCompilerOptionsErrorFormat = compilerOptions.errorFormat;
        
        assertFalse(initialCompilerOptions == finalCompilerOptions);
        
        assertFalse(initialCompilerErrorManager == finalCompilerErrorManager);
        
        assertFalse(initialCompilerOptionsErrorFormat == finalCompilerOptionsErrorFormat);
    }
    
    @Test
    public void testInitOptions3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ErrorFormat errorFormat = ErrorFormat.MULTILINE;
        compilerOptions.errorFormat = errorFormat;
        
        CompilerOptions initialCompilerOptions = compiler.options;
        ErrorManager initialCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        ErrorFormat initialCompilerOptionsErrorFormat = compilerOptions.errorFormat;
        
        compiler.initOptions(compilerOptions);
        
        CompilerOptions finalCompilerOptions = compiler.options;
        ErrorManager finalCompilerErrorManager = ((ErrorManager) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "errorManager"));
        
        ErrorFormat finalCompilerOptionsErrorFormat = compilerOptions.errorFormat;
        
        assertFalse(initialCompilerOptions == finalCompilerOptions);
        
        assertFalse(initialCompilerErrorManager == finalCompilerErrorManager);
        
        assertFalse(initialCompilerOptionsErrorFormat == finalCompilerOptionsErrorFormat);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method initOptions(com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    public void testInitOptions4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PrintStream outStream = ((PrintStream) createInstance("java.io.PrintStream"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "outStream", outStream);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.initOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.createMessageFormatter(Compiler.java:213)
            com.google.javascript.jscomp.Compiler.initOptions(Compiler.java:228) */
        compiler.initOptions(compilerOptions);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.makeCompilerInput
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method makeCompilerInput([Lcom.google.javascript.jscomp.JSSourceFile;, boolean)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#makeCompilerInput(com.google.javascript.jscomp.JSSourceFile[],boolean)}
 * @utbot.returnsFrom {@code return inputs;}
 *  */
    @Test
    public void testMakeCompilerInput_ReturnInputs() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = {};
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSSourceFileArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSSourceFile;");
        Class booleanType = boolean.class;
        Method makeCompilerInputMethod = compilerClazz.getDeclaredMethod("makeCompilerInput", jSSourceFileArrayType, booleanType);
        makeCompilerInputMethod.setAccessible(true);
        java.lang.Object[] makeCompilerInputMethodArguments = new java.lang.Object[2];
        makeCompilerInputMethodArguments[0] = ((Object) jSSourceFileArray);
        makeCompilerInputMethodArguments[1] = false;
        com.google.javascript.jscomp.CompilerInput[] actual = ((com.google.javascript.jscomp.CompilerInput[]) makeCompilerInputMethod.invoke(compiler, makeCompilerInputMethodArguments));
        
        com.google.javascript.jscomp.CompilerInput[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#makeCompilerInput(com.google.javascript.jscomp.JSSourceFile[],boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < files.length; ++i)} once
 * @utbot.returnsFrom {@code return inputs;}
 *  */
    @Test
    public void testMakeCompilerInput_IterateForLoop() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray = new com.google.javascript.jscomp.JSSourceFile[1];
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        jSSourceFileArray[0] = jSSourceFile;
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSSourceFileArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSSourceFile;");
        Class booleanType = boolean.class;
        Method makeCompilerInputMethod = compilerClazz.getDeclaredMethod("makeCompilerInput", jSSourceFileArrayType, booleanType);
        makeCompilerInputMethod.setAccessible(true);
        java.lang.Object[] makeCompilerInputMethodArguments = new java.lang.Object[2];
        makeCompilerInputMethodArguments[0] = ((Object) jSSourceFileArray);
        makeCompilerInputMethodArguments[1] = false;
        com.google.javascript.jscomp.CompilerInput[] actual = ((com.google.javascript.jscomp.CompilerInput[]) makeCompilerInputMethod.invoke(compiler, makeCompilerInputMethodArguments));
        
        com.google.javascript.jscomp.CompilerInput[] expected = new com.google.javascript.jscomp.CompilerInput[1];
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        ast.setSourceFile(jSSourceFile);
        setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        HashSet provides = new HashSet();
        setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "provides", provides);
        HashSet requires = new HashSet();
        setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "requires", requires);
        expected[0] = compilerInput;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method makeCompilerInput([Lcom.google.javascript.jscomp.JSSourceFile;, boolean)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#makeCompilerInput(com.google.javascript.jscomp.JSSourceFile[],boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CompilerInput[] inputs = new CompilerInput[files.length];
 *  */
    @Test
    public void testMakeCompilerInput_ThrowNullPointerException() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.makeCompilerInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.makeCompilerInput(Compiler.java:296) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class jSSourceFileArrayType = Class.forName("[Lcom.google.javascript.jscomp.JSSourceFile;");
        Class booleanType = boolean.class;
        Method makeCompilerInputMethod = compilerClazz.getDeclaredMethod("makeCompilerInput", jSSourceFileArrayType, booleanType);
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
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#initBasedOnOptions()}
 * @utbot.executesCondition {@code (options.sourceMapOutputPath != null): True}
 *  */
    @Test
    public void testInitBasedOnOptions_OptionsSourceMapOutputPathNotEqualsNull() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "";
        options.sourceMapOutputPath = sourceMapOutputPath;
        compiler.options = options;
        
        SourceMap initialCompilerSourceMap = ((SourceMap) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "sourceMap"));
        
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Method initBasedOnOptionsMethod = compilerClazz.getDeclaredMethod("initBasedOnOptions");
        initBasedOnOptionsMethod.setAccessible(true);
        java.lang.Object[] initBasedOnOptionsMethodArguments = new java.lang.Object[0];
        initBasedOnOptionsMethod.invoke(compiler, initBasedOnOptionsMethodArguments);
        
        SourceMap finalCompilerSourceMap = ((SourceMap) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "sourceMap"));
        
        assertFalse(initialCompilerSourceMap == finalCompilerSourceMap);
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
            com.google.javascript.jscomp.Compiler.initBasedOnOptions(Compiler.java:289) */
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
            com.google.javascript.jscomp.Compiler.runCustomPasses(Compiler.java:724) */
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
    
    ///region OTHER: ERROR SUITE for method runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)
    
    @Test
    public void testRunCustomPasses1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        Object customPasses = createInstance("com.google.common.collect.Synchronized$SynchronizedSetMultimap");
        setField(options, "com.google.javascript.jscomp.CompilerOptions", "customPasses", customPasses);
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        CustomPassExecutionTime customPassExecutionTime = CustomPassExecutionTime.BEFORE_OPTIMIZATION_LOOP;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.runCustomPasses] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:768)
            com.google.javascript.jscomp.Compiler.runCustomPasses(Compiler.java:725) */
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class customPassExecutionTimeType = Class.forName("com.google.javascript.jscomp.CustomPassExecutionTime");
        Method runCustomPassesMethod = compilerClazz.getDeclaredMethod("runCustomPasses", customPassExecutionTimeType);
        runCustomPassesMethod.setAccessible(true);
        java.lang.Object[] runCustomPassesMethodArguments = new java.lang.Object[1];
        runCustomPassesMethodArguments[0] = customPassExecutionTime;
        try {
            runCustomPassesMethod.invoke(compiler, runCustomPassesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
        PassFactory actualSuspiciousCode = actual.suspiciousCode;
        assertNull(actualSuspiciousCode);
        
        PassFactory actualCheckControlStructures = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        assertNull(actualCheckControlStructures);
        
        PassFactory actualCheckRequires = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        assertNull(actualCheckRequires);
        
        PassFactory actualCheckProvides = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
        assertNull(actualCheckProvides);
        
        PassFactory actualGenerateExports = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "generateExports"));
        assertNull(actualGenerateExports);
        
        PassFactory actualExportTestFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "exportTestFunctions"));
        assertNull(actualExportTestFunctions);
        
        PassFactory actualGatherRawExports = actual.gatherRawExports;
        assertNull(actualGatherRawExports);
        
        PassFactory actualClosurePrimitives = actual.closurePrimitives;
        assertNull(actualClosurePrimitives);
        
        PassFactory actualClosureCheckGetCssName = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName"));
        assertNull(actualClosureCheckGetCssName);
        
        PassFactory actualClosureReplaceGetCssName = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName"));
        assertNull(actualClosureReplaceGetCssName);
        
        PassFactory actualCreateSyntheticBlocks = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks"));
        assertNull(actualCreateSyntheticBlocks);
        
        PassFactory actualCheckVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        assertNull(actualCheckVars);
        
        PassFactory actualCheckShadowVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        assertNull(actualCheckShadowVars);
        
        PassFactory actualCheckVariableReferences = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
        assertNull(actualCheckVariableReferences);
        
        PassFactory actualObjectPropertyStringPreprocess = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess"));
        assertNull(actualObjectPropertyStringPreprocess);
        
        PassFactory actualCheckFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkFunctions"));
        assertNull(actualCheckFunctions);
        
        PassFactory actualCheckMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkMethods"));
        assertNull(actualCheckMethods);
        
        PassFactory actualResolveTypes = actual.resolveTypes;
        assertNull(actualResolveTypes);
        
        PassFactory actualInferTypes = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes"));
        assertNull(actualInferTypes);
        
        PassFactory actualCheckTypes = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        assertNull(actualCheckTypes);
        
        PassFactory actualCheckControlFlow = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        assertNull(actualCheckControlFlow);
        
        PassFactory actualCheckAccessControls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
        assertNull(actualCheckAccessControls);
        
        PassFactory actualCheckGlobalNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames"));
        assertNull(actualCheckGlobalNames);
        
        PassFactory actualCheckSuspiciousProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkSuspiciousProperties"));
        assertNull(actualCheckSuspiciousProperties);
        
        PassFactory actualCheckStrictMode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        assertNull(actualCheckStrictMode);
        
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
        
        PassFactory actualOptimizeArgumentsArray = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        assertNull(actualOptimizeArgumentsArray);
        
        PassFactory actualRemoveUselessParameters = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUselessParameters"));
        assertNull(actualRemoveUselessParameters);
        
        PassFactory actualRemoveAbstractMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeAbstractMethods"));
        assertNull(actualRemoveAbstractMethods);
        
        PassFactory actualCollapseProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        assertNull(actualCollapseProperties);
        
        PassFactory actualTightenTypesBuilder = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder"));
        assertNull(actualTightenTypesBuilder);
        
        PassFactory actualDisambiguateProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties"));
        assertNull(actualDisambiguateProperties);
        
        PassFactory actualChainCalls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls"));
        assertNull(actualChainCalls);
        
        PassFactory actualDevirtualizePrototypeMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods"));
        assertNull(actualDevirtualizePrototypeMethods);
        
        PassFactory actualMarkPureFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions"));
        assertNull(actualMarkPureFunctions);
        
        PassFactory actualMarkNoSideEffectCalls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls"));
        assertNull(actualMarkNoSideEffectCalls);
        
        PassFactory actualInlineVariables = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables"));
        assertNull(actualInlineVariables);
        
        PassFactory actualInlineConstants = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants"));
        assertNull(actualInlineConstants);
        
        PassFactory actualRemoveConstantExpressions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeConstantExpressions"));
        assertNull(actualRemoveConstantExpressions);
        
        PassFactory actualMinimizeExitPoints = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints"));
        assertNull(actualMinimizeExitPoints);
        
        PassFactory actualRemoveUnreachableCode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode"));
        assertNull(actualRemoveUnreachableCode);
        
        PassFactory actualRemoveUnusedPrototypeProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties"));
        assertNull(actualRemoveUnusedPrototypeProperties);
        
        PassFactory actualSmartNamePass = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass"));
        assertNull(actualSmartNamePass);
        
        PassFactory actualInlineGetters = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineGetters"));
        assertNull(actualInlineGetters);
        
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
        
        PassFactory actualFlowSensitiveInlineVariables = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables"));
        assertNull(actualFlowSensitiveInlineVariables);
        
        PassFactory actualCoalesceVariableNames = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames"));
        assertNull(actualCoalesceVariableNames);
        
        PassFactory actualCollapseVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        assertNull(actualCollapseVariableDeclarations);
        
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
        
        PassFactory actualSanityCheckVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars"));
        assertNull(actualSanityCheckVars);
        
        PassFactory actualInstrumentFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions"));
        assertNull(actualInstrumentFunctions);
        
        CompilerOptions actualOptions = actual.options;
        assertNull(actualOptions);
        
        MemoizedScopeCreator actualTypedScopeCreator = actual.typedScopeCreator;
        assertNull(actualTypedScopeCreator);
        
        Scope actualTopScope = actual.topScope;
        assertNull(actualTopScope);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPassConfig()
    
    @Test
    public void testGetPassConfig1() throws Exception  {
    /* This block of code is 1176 lines long and could lead to compilation error
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        PassConfig initialCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        DefaultPassConfig actual = ((DefaultPassConfig) compiler.getPassConfig());
        
        DefaultPassConfig expected = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator = ((CrossModuleMethodMotion.IdGenerator) createInstance("com.google.javascript.jscomp.CrossModuleMethodMotion$IdGenerator"));
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleIdGenerator", crossModuleIdGenerator);
        PassFactory suspiciousCode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$1"));
        setField(suspiciousCode, "com.google.javascript.jscomp.DefaultPassConfig$1", "this$0", expected);
        String name = "suspiciousCode";
        setField(suspiciousCode, "com.google.javascript.jscomp.PassFactory", "name", name);
        setField(suspiciousCode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "suspiciousCode", suspiciousCode);
        PassFactory checkControlStructures = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$2"));
        setField(checkControlStructures, "com.google.javascript.jscomp.DefaultPassConfig$2", "this$0", expected);
        String name1 = "checkControlStructures";
        setField(checkControlStructures, "com.google.javascript.jscomp.PassFactory", "name", name1);
        setField(checkControlStructures, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures", checkControlStructures);
        PassFactory checkRequires = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$3"));
        setField(checkRequires, "com.google.javascript.jscomp.DefaultPassConfig$3", "this$0", expected);
        String name2 = "checkRequires";
        setField(checkRequires, "com.google.javascript.jscomp.PassFactory", "name", name2);
        setField(checkRequires, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires", checkRequires);
        PassFactory checkProvides = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$4"));
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
        PassFactory closurePrimitives = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$8"));
        setField(closurePrimitives, "com.google.javascript.jscomp.DefaultPassConfig$8", "this$0", expected);
        String name7 = "processProvidesAndRequires";
        setField(closurePrimitives, "com.google.javascript.jscomp.PassFactory", "name", name7);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closurePrimitives", closurePrimitives);
        PassFactory closureCheckGetCssName = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$9"));
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.DefaultPassConfig$9", "this$0", expected);
        String name8 = "checkMissingGetCssName";
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.PassFactory", "name", name8);
        setField(closureCheckGetCssName, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureCheckGetCssName", closureCheckGetCssName);
        PassFactory closureReplaceGetCssName = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$10"));
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.DefaultPassConfig$10", "this$0", expected);
        String name9 = "renameCssNames";
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.PassFactory", "name", name9);
        setField(closureReplaceGetCssName, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "closureReplaceGetCssName", closureReplaceGetCssName);
        PassFactory createSyntheticBlocks = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$11"));
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.DefaultPassConfig$11", "this$0", expected);
        String name10 = "createSyntheticBlocks";
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.PassFactory", "name", name10);
        setField(createSyntheticBlocks, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "createSyntheticBlocks", createSyntheticBlocks);
        PassFactory checkVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$13"));
        setField(checkVars, "com.google.javascript.jscomp.DefaultPassConfig$13", "this$0", expected);
        String name11 = "checkVars";
        setField(checkVars, "com.google.javascript.jscomp.PassFactory", "name", name11);
        setField(checkVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars", checkVars);
        PassFactory checkShadowVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$14"));
        setField(checkShadowVars, "com.google.javascript.jscomp.DefaultPassConfig$14", "this$0", expected);
        String name12 = "variableShadowDeclarationCheck";
        setField(checkShadowVars, "com.google.javascript.jscomp.PassFactory", "name", name12);
        setField(checkShadowVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars", checkShadowVars);
        PassFactory checkVariableReferences = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$15"));
        setField(checkVariableReferences, "com.google.javascript.jscomp.DefaultPassConfig$15", "this$0", expected);
        String name13 = "checkVariableReferences";
        setField(checkVariableReferences, "com.google.javascript.jscomp.PassFactory", "name", name13);
        setField(checkVariableReferences, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences", checkVariableReferences);
        PassFactory objectPropertyStringPreprocess = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$16"));
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.DefaultPassConfig$16", "this$0", expected);
        String name14 = "ObjectPropertyStringPreprocess";
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.PassFactory", "name", name14);
        setField(objectPropertyStringPreprocess, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPreprocess", objectPropertyStringPreprocess);
        PassFactory checkFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$17"));
        setField(checkFunctions, "com.google.javascript.jscomp.DefaultPassConfig$17", "this$0", expected);
        String name15 = "checkFunctions";
        setField(checkFunctions, "com.google.javascript.jscomp.PassFactory", "name", name15);
        setField(checkFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkFunctions", checkFunctions);
        PassFactory checkMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$18"));
        setField(checkMethods, "com.google.javascript.jscomp.DefaultPassConfig$18", "this$0", expected);
        String name16 = "checkMethods";
        setField(checkMethods, "com.google.javascript.jscomp.PassFactory", "name", name16);
        setField(checkMethods, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkMethods", checkMethods);
        PassFactory resolveTypes = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$19"));
        setField(resolveTypes, "com.google.javascript.jscomp.DefaultPassConfig$19", "this$0", expected);
        String name17 = "resolveTypes";
        setField(resolveTypes, "com.google.javascript.jscomp.PassFactory", "name", name17);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "resolveTypes", resolveTypes);
        PassFactory inferTypes = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$20"));
        setField(inferTypes, "com.google.javascript.jscomp.DefaultPassConfig$20", "this$0", expected);
        String name18 = "inferTypes";
        setField(inferTypes, "com.google.javascript.jscomp.PassFactory", "name", name18);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes", inferTypes);
        PassFactory checkTypes = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$21"));
        setField(checkTypes, "com.google.javascript.jscomp.DefaultPassConfig$21", "this$0", expected);
        String name19 = "checkTypes";
        setField(checkTypes, "com.google.javascript.jscomp.PassFactory", "name", name19);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes", checkTypes);
        PassFactory checkControlFlow = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$22"));
        setField(checkControlFlow, "com.google.javascript.jscomp.DefaultPassConfig$22", "this$0", expected);
        String name20 = "checkControlFlow";
        setField(checkControlFlow, "com.google.javascript.jscomp.PassFactory", "name", name20);
        setField(checkControlFlow, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow", checkControlFlow);
        PassFactory checkAccessControls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$23"));
        setField(checkAccessControls, "com.google.javascript.jscomp.DefaultPassConfig$23", "this$0", expected);
        String name21 = "checkAccessControls";
        setField(checkAccessControls, "com.google.javascript.jscomp.PassFactory", "name", name21);
        setField(checkAccessControls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls", checkAccessControls);
        PassFactory checkGlobalNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$24"));
        setField(checkGlobalNames, "com.google.javascript.jscomp.DefaultPassConfig$24", "this$0", expected);
        String name22 = "Check names";
        setField(checkGlobalNames, "com.google.javascript.jscomp.PassFactory", "name", name22);
        setField(checkGlobalNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkGlobalNames", checkGlobalNames);
        PassFactory checkSuspiciousProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$25"));
        setField(checkSuspiciousProperties, "com.google.javascript.jscomp.DefaultPassConfig$25", "this$0", expected);
        String name23 = "checkSuspiciousProperties";
        setField(checkSuspiciousProperties, "com.google.javascript.jscomp.PassFactory", "name", name23);
        setField(checkSuspiciousProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkSuspiciousProperties", checkSuspiciousProperties);
        PassFactory checkStrictMode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$26"));
        setField(checkStrictMode, "com.google.javascript.jscomp.DefaultPassConfig$26", "this$0", expected);
        String name24 = "checkStrictMode";
        setField(checkStrictMode, "com.google.javascript.jscomp.PassFactory", "name", name24);
        setField(checkStrictMode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode", checkStrictMode);
        PassFactory processDefines = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$27"));
        setField(processDefines, "com.google.javascript.jscomp.DefaultPassConfig$27", "this$0", expected);
        String name25 = "processDefines";
        setField(processDefines, "com.google.javascript.jscomp.PassFactory", "name", name25);
        setField(processDefines, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "processDefines", processDefines);
        PassFactory checkConsts = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$28"));
        setField(checkConsts, "com.google.javascript.jscomp.DefaultPassConfig$28", "this$0", expected);
        String name26 = "checkConsts";
        setField(checkConsts, "com.google.javascript.jscomp.PassFactory", "name", name26);
        setField(checkConsts, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkConsts", checkConsts);
        PassFactory computeFunctionNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$29"));
        setField(computeFunctionNames, "com.google.javascript.jscomp.DefaultPassConfig$29", "this$0", expected);
        String name27 = "computeFunctionNames";
        setField(computeFunctionNames, "com.google.javascript.jscomp.PassFactory", "name", name27);
        setField(computeFunctionNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "computeFunctionNames", computeFunctionNames);
        PassFactory ignoreCajaProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$30"));
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.DefaultPassConfig$30", "this$0", expected);
        String name28 = "ignoreCajaProperties";
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.PassFactory", "name", name28);
        setField(ignoreCajaProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ignoreCajaProperties", ignoreCajaProperties);
        PassFactory runtimeTypeCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$31"));
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.DefaultPassConfig$31", "this$0", expected);
        String name29 = "runtimeTypeCheck";
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.PassFactory", "name", name29);
        setField(runtimeTypeCheck, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "runtimeTypeCheck", runtimeTypeCheck);
        PassFactory replaceIdGenerators = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$32"));
        setField(replaceIdGenerators, "com.google.javascript.jscomp.DefaultPassConfig$32", "this$0", expected);
        String name30 = "replaceIdGenerators";
        setField(replaceIdGenerators, "com.google.javascript.jscomp.PassFactory", "name", name30);
        setField(replaceIdGenerators, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "replaceIdGenerators", replaceIdGenerators);
        PassFactory optimizeArgumentsArray = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$33"));
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.DefaultPassConfig$33", "this$0", expected);
        String name31 = "optimizeArgumentsArray";
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.PassFactory", "name", name31);
        setField(optimizeArgumentsArray, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray", optimizeArgumentsArray);
        PassFactory removeUselessParameters = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$34"));
        setField(removeUselessParameters, "com.google.javascript.jscomp.DefaultPassConfig$34", "this$0", expected);
        String name32 = "optimizeParameters";
        setField(removeUselessParameters, "com.google.javascript.jscomp.PassFactory", "name", name32);
        setField(removeUselessParameters, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUselessParameters", removeUselessParameters);
        PassFactory removeAbstractMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$35"));
        setField(removeAbstractMethods, "com.google.javascript.jscomp.DefaultPassConfig$35", "this$0", expected);
        String name33 = "removeAbstractMethods";
        setField(removeAbstractMethods, "com.google.javascript.jscomp.PassFactory", "name", name33);
        setField(removeAbstractMethods, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeAbstractMethods", removeAbstractMethods);
        PassFactory collapseProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$36"));
        setField(collapseProperties, "com.google.javascript.jscomp.DefaultPassConfig$36", "this$0", expected);
        String name34 = "collapseProperties";
        setField(collapseProperties, "com.google.javascript.jscomp.PassFactory", "name", name34);
        setField(collapseProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties", collapseProperties);
        PassFactory tightenTypesBuilder = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$37"));
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.DefaultPassConfig$37", "this$0", expected);
        String name35 = "tightenTypes";
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.PassFactory", "name", name35);
        setField(tightenTypesBuilder, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "tightenTypesBuilder", tightenTypesBuilder);
        PassFactory disambiguateProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$38"));
        setField(disambiguateProperties, "com.google.javascript.jscomp.DefaultPassConfig$38", "this$0", expected);
        String name36 = "disambiguateProperties";
        setField(disambiguateProperties, "com.google.javascript.jscomp.PassFactory", "name", name36);
        setField(disambiguateProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "disambiguateProperties", disambiguateProperties);
        PassFactory chainCalls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$39"));
        setField(chainCalls, "com.google.javascript.jscomp.DefaultPassConfig$39", "this$0", expected);
        String name37 = "chainCalls";
        setField(chainCalls, "com.google.javascript.jscomp.PassFactory", "name", name37);
        setField(chainCalls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "chainCalls", chainCalls);
        PassFactory devirtualizePrototypeMethods = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$40"));
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.DefaultPassConfig$40", "this$0", expected);
        String name38 = "devirtualizePrototypeMethods";
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.PassFactory", "name", name38);
        setField(devirtualizePrototypeMethods, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "devirtualizePrototypeMethods", devirtualizePrototypeMethods);
        PassFactory markPureFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$41"));
        setField(markPureFunctions, "com.google.javascript.jscomp.DefaultPassConfig$41", "this$0", expected);
        String name39 = "markPureFunctions";
        setField(markPureFunctions, "com.google.javascript.jscomp.PassFactory", "name", name39);
        setField(markPureFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markPureFunctions", markPureFunctions);
        PassFactory markNoSideEffectCalls = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$42"));
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.DefaultPassConfig$42", "this$0", expected);
        String name40 = "markNoSideEffectCalls";
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.PassFactory", "name", name40);
        setField(markNoSideEffectCalls, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "markNoSideEffectCalls", markNoSideEffectCalls);
        PassFactory inlineVariables = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$43"));
        setField(inlineVariables, "com.google.javascript.jscomp.DefaultPassConfig$43", "this$0", expected);
        String name41 = "inlineVariables";
        setField(inlineVariables, "com.google.javascript.jscomp.PassFactory", "name", name41);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineVariables", inlineVariables);
        PassFactory inlineConstants = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$44"));
        setField(inlineConstants, "com.google.javascript.jscomp.DefaultPassConfig$44", "this$0", expected);
        String name42 = "inlineConstants";
        setField(inlineConstants, "com.google.javascript.jscomp.PassFactory", "name", name42);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineConstants", inlineConstants);
        PassFactory removeConstantExpressions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$45"));
        setField(removeConstantExpressions, "com.google.javascript.jscomp.DefaultPassConfig$45", "this$0", expected);
        String name43 = "removeConstantExpressions";
        setField(removeConstantExpressions, "com.google.javascript.jscomp.PassFactory", "name", name43);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeConstantExpressions", removeConstantExpressions);
        PassFactory minimizeExitPoints = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$46"));
        setField(minimizeExitPoints, "com.google.javascript.jscomp.DefaultPassConfig$46", "this$0", expected);
        String name44 = "minimizeExitPoints";
        setField(minimizeExitPoints, "com.google.javascript.jscomp.PassFactory", "name", name44);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "minimizeExitPoints", minimizeExitPoints);
        PassFactory removeUnreachableCode = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$47"));
        setField(removeUnreachableCode, "com.google.javascript.jscomp.DefaultPassConfig$47", "this$0", expected);
        String name45 = "removeUnreachableCode";
        setField(removeUnreachableCode, "com.google.javascript.jscomp.PassFactory", "name", name45);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnreachableCode", removeUnreachableCode);
        PassFactory removeUnusedPrototypeProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$48"));
        setField(removeUnusedPrototypeProperties, "com.google.javascript.jscomp.DefaultPassConfig$48", "this$0", expected);
        String name46 = "removeUnusedPrototypeProperties";
        setField(removeUnusedPrototypeProperties, "com.google.javascript.jscomp.PassFactory", "name", name46);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedPrototypeProperties", removeUnusedPrototypeProperties);
        PassFactory smartNamePass = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$49"));
        setField(smartNamePass, "com.google.javascript.jscomp.DefaultPassConfig$49", "this$0", expected);
        String name47 = "smartNamePass";
        setField(smartNamePass, "com.google.javascript.jscomp.PassFactory", "name", name47);
        setField(smartNamePass, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "smartNamePass", smartNamePass);
        PassFactory inlineGetters = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$50"));
        setField(inlineGetters, "com.google.javascript.jscomp.DefaultPassConfig$50", "this$0", expected);
        String name48 = "inlineGetters";
        setField(inlineGetters, "com.google.javascript.jscomp.PassFactory", "name", name48);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineGetters", inlineGetters);
        PassFactory deadAssignmentsElimination = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$51"));
        setField(deadAssignmentsElimination, "com.google.javascript.jscomp.DefaultPassConfig$51", "this$0", expected);
        String name49 = "deadAssignmentsElimination";
        setField(deadAssignmentsElimination, "com.google.javascript.jscomp.PassFactory", "name", name49);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "deadAssignmentsElimination", deadAssignmentsElimination);
        PassFactory inlineFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$52"));
        setField(inlineFunctions, "com.google.javascript.jscomp.DefaultPassConfig$52", "this$0", expected);
        String name50 = "inlineFunctions";
        setField(inlineFunctions, "com.google.javascript.jscomp.PassFactory", "name", name50);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineFunctions", inlineFunctions);
        PassFactory removeUnusedVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$53"));
        setField(removeUnusedVars, "com.google.javascript.jscomp.DefaultPassConfig$53", "this$0", expected);
        String name51 = "removeUnusedVars";
        setField(removeUnusedVars, "com.google.javascript.jscomp.PassFactory", "name", name51);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUnusedVars", removeUnusedVars);
        PassFactory crossModuleCodeMotion = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$54"));
        setField(crossModuleCodeMotion, "com.google.javascript.jscomp.DefaultPassConfig$54", "this$0", expected);
        String name52 = "crossModuleCodeMotion";
        setField(crossModuleCodeMotion, "com.google.javascript.jscomp.PassFactory", "name", name52);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleCodeMotion", crossModuleCodeMotion);
        PassFactory crossModuleMethodMotion = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$55"));
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.DefaultPassConfig$55", "this$0", expected);
        String name53 = "crossModuleMethodMotion";
        setField(crossModuleMethodMotion, "com.google.javascript.jscomp.PassFactory", "name", name53);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "crossModuleMethodMotion", crossModuleMethodMotion);
        PassFactory flowSensitiveInlineVariables = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$56"));
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.DefaultPassConfig$56", "this$0", expected);
        String name54 = "flowSensitiveInlineVariables";
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.PassFactory", "name", name54);
        setField(flowSensitiveInlineVariables, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "flowSensitiveInlineVariables", flowSensitiveInlineVariables);
        PassFactory coalesceVariableNames = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$57"));
        setField(coalesceVariableNames, "com.google.javascript.jscomp.DefaultPassConfig$57", "this$0", expected);
        String name55 = "coalesceVariableNames";
        setField(coalesceVariableNames, "com.google.javascript.jscomp.PassFactory", "name", name55);
        setField(coalesceVariableNames, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "coalesceVariableNames", coalesceVariableNames);
        PassFactory collapseVariableDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$58"));
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$58", "this$0", expected);
        String name56 = "collapseVariableDeclarations";
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name56);
        setField(collapseVariableDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations", collapseVariableDeclarations);
        PassFactory extractPrototypeMemberDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$59"));
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$59", "this$0", expected);
        String name57 = "extractPrototypeMemberDeclarations";
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name57);
        setField(extractPrototypeMemberDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "extractPrototypeMemberDeclarations", extractPrototypeMemberDeclarations);
        PassFactory rewriteFunctionExpressions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$60"));
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.DefaultPassConfig$60", "this$0", expected);
        String name58 = "rewriteFunctionExpressions";
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.PassFactory", "name", name58);
        setField(rewriteFunctionExpressions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "rewriteFunctionExpressions", rewriteFunctionExpressions);
        PassFactory collapseAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$61"));
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$61", "this$0", expected);
        String name59 = "collapseAnonymousFunctions";
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name59);
        setField(collapseAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseAnonymousFunctions", collapseAnonymousFunctions);
        PassFactory moveFunctionDeclarations = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$62"));
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.DefaultPassConfig$62", "this$0", expected);
        String name60 = "moveFunctionDeclarations";
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.PassFactory", "name", name60);
        setField(moveFunctionDeclarations, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "moveFunctionDeclarations", moveFunctionDeclarations);
        PassFactory nameUnmappedAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$63"));
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$63", "this$0", expected);
        String name61 = "nameAnonymousFunctions";
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name61);
        setField(nameUnmappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameUnmappedAnonymousFunctions", nameUnmappedAnonymousFunctions);
        PassFactory nameMappedAnonymousFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$64"));
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.DefaultPassConfig$64", "this$0", expected);
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "name", name61);
        setField(nameMappedAnonymousFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "nameMappedAnonymousFunctions", nameMappedAnonymousFunctions);
        PassFactory aliasExternals = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$65"));
        setField(aliasExternals, "com.google.javascript.jscomp.DefaultPassConfig$65", "this$0", expected);
        String name62 = "aliasExternals";
        setField(aliasExternals, "com.google.javascript.jscomp.PassFactory", "name", name62);
        setField(aliasExternals, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasExternals", aliasExternals);
        PassFactory aliasStrings = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$66"));
        setField(aliasStrings, "com.google.javascript.jscomp.DefaultPassConfig$66", "this$0", expected);
        String name63 = "aliasStrings";
        setField(aliasStrings, "com.google.javascript.jscomp.PassFactory", "name", name63);
        setField(aliasStrings, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasStrings", aliasStrings);
        PassFactory aliasKeywords = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$67"));
        setField(aliasKeywords, "com.google.javascript.jscomp.DefaultPassConfig$67", "this$0", expected);
        String name64 = "aliasKeywords";
        setField(aliasKeywords, "com.google.javascript.jscomp.PassFactory", "name", name64);
        setField(aliasKeywords, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "aliasKeywords", aliasKeywords);
        PassFactory objectPropertyStringPostprocess = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$68"));
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.DefaultPassConfig$68", "this$0", expected);
        String name65 = "ObjectPropertyStringPostprocess";
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.PassFactory", "name", name65);
        setField(objectPropertyStringPostprocess, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "objectPropertyStringPostprocess", objectPropertyStringPostprocess);
        PassFactory ambiguateProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$69"));
        setField(ambiguateProperties, "com.google.javascript.jscomp.DefaultPassConfig$69", "this$0", expected);
        String name66 = "ambiguateProperties";
        setField(ambiguateProperties, "com.google.javascript.jscomp.PassFactory", "name", name66);
        setField(ambiguateProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "ambiguateProperties", ambiguateProperties);
        PassFactory denormalize = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$70"));
        setField(denormalize, "com.google.javascript.jscomp.DefaultPassConfig$70", "this$0", expected);
        String name67 = "denormalize";
        setField(denormalize, "com.google.javascript.jscomp.PassFactory", "name", name67);
        setField(denormalize, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "denormalize", denormalize);
        PassFactory invertContextualRenaming = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$71"));
        setField(invertContextualRenaming, "com.google.javascript.jscomp.DefaultPassConfig$71", "this$0", expected);
        String name68 = "invertNames";
        setField(invertContextualRenaming, "com.google.javascript.jscomp.PassFactory", "name", name68);
        setField(invertContextualRenaming, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "invertContextualRenaming", invertContextualRenaming);
        PassFactory renameProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$72"));
        setField(renameProperties, "com.google.javascript.jscomp.DefaultPassConfig$72", "this$0", expected);
        String name69 = "renameProperties";
        setField(renameProperties, "com.google.javascript.jscomp.PassFactory", "name", name69);
        setField(renameProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameProperties", renameProperties);
        PassFactory renameVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$73"));
        setField(renameVars, "com.google.javascript.jscomp.DefaultPassConfig$73", "this$0", expected);
        String name70 = "renameVars";
        setField(renameVars, "com.google.javascript.jscomp.PassFactory", "name", name70);
        setField(renameVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameVars", renameVars);
        PassFactory renameLabels = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$74"));
        setField(renameLabels, "com.google.javascript.jscomp.DefaultPassConfig$74", "this$0", expected);
        String name71 = "renameLabels";
        setField(renameLabels, "com.google.javascript.jscomp.PassFactory", "name", name71);
        setField(renameLabels, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "renameLabels", renameLabels);
        PassFactory convertToDottedProperties = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$75"));
        setField(convertToDottedProperties, "com.google.javascript.jscomp.DefaultPassConfig$75", "this$0", expected);
        String name72 = "convertToDottedProperties";
        setField(convertToDottedProperties, "com.google.javascript.jscomp.PassFactory", "name", name72);
        setField(convertToDottedProperties, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "convertToDottedProperties", convertToDottedProperties);
        PassFactory sanityCheckVars = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$76"));
        setField(sanityCheckVars, "com.google.javascript.jscomp.DefaultPassConfig$76", "this$0", expected);
        String name73 = "sanityCheckVars";
        setField(sanityCheckVars, "com.google.javascript.jscomp.PassFactory", "name", name73);
        setField(sanityCheckVars, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "sanityCheckVars", sanityCheckVars);
        PassFactory instrumentFunctions = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$77"));
        setField(instrumentFunctions, "com.google.javascript.jscomp.DefaultPassConfig$77", "this$0", expected);
        String name74 = "instrumentFunctions";
        setField(instrumentFunctions, "com.google.javascript.jscomp.PassFactory", "name", name74);
        setField(instrumentFunctions, "com.google.javascript.jscomp.PassFactory", "isOneTimePass", true);
        setField(expected, "com.google.javascript.jscomp.DefaultPassConfig", "instrumentFunctions", instrumentFunctions);
        
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
        
        PassFactory expectedSuspiciousCode = expected.suspiciousCode;
        PassFactory actualSuspiciousCode = actual.suspiciousCode;
        String expectedSuspiciousCodeName = expectedSuspiciousCode.getName();
        String actualSuspiciousCodeName = actualSuspiciousCode.getName();
        assertEquals(expectedSuspiciousCodeName, actualSuspiciousCodeName);
        
        boolean actualSuspiciousCodeIsOneTimePass = ((Boolean) getFieldValue(actualSuspiciousCode, "com.google.javascript.jscomp.PassFactory", "isOneTimePass"));
        assertTrue(actualSuspiciousCodeIsOneTimePass);
        
        boolean actualSuspiciousCodeIsCreated = ((Boolean) getFieldValue(actualSuspiciousCode, "com.google.javascript.jscomp.PassFactory", "isCreated"));
        assertFalse(actualSuspiciousCodeIsCreated);
        
        PassFactory expectedCheckControlStructures = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        PassFactory actualCheckControlStructures = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlStructures"));
        String expectedCheckControlStructuresName = expectedCheckControlStructures.getName();
        String actualCheckControlStructuresName = actualCheckControlStructures.getName();
        assertEquals(expectedCheckControlStructuresName, actualCheckControlStructuresName);
        
        assertTrue(deepEquals(expectedCheckControlStructures, actualCheckControlStructures));
        assertTrue(deepEquals(expectedCheckControlStructures, actualCheckControlStructures));
        
        PassFactory expectedCheckRequires = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        PassFactory actualCheckRequires = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkRequires"));
        String expectedCheckRequiresName = expectedCheckRequires.getName();
        String actualCheckRequiresName = actualCheckRequires.getName();
        assertEquals(expectedCheckRequiresName, actualCheckRequiresName);
        
        assertTrue(deepEquals(expectedCheckRequires, actualCheckRequires));
        assertTrue(deepEquals(expectedCheckRequires, actualCheckRequires));
        
        PassFactory expectedCheckProvides = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
        PassFactory actualCheckProvides = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkProvides"));
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
        
        PassFactory expectedClosurePrimitives = expected.closurePrimitives;
        PassFactory actualClosurePrimitives = actual.closurePrimitives;
        String expectedClosurePrimitivesName = expectedClosurePrimitives.getName();
        String actualClosurePrimitivesName = actualClosurePrimitives.getName();
        assertEquals(expectedClosurePrimitivesName, actualClosurePrimitivesName);
        
        assertTrue(deepEquals(expectedClosurePrimitives, actualClosurePrimitives));
        assertTrue(deepEquals(expectedClosurePrimitives, actualClosurePrimitives));
        
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
        
        PassFactory expectedCheckVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        PassFactory actualCheckVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVars"));
        String expectedCheckVarsName = expectedCheckVars.getName();
        String actualCheckVarsName = actualCheckVars.getName();
        assertEquals(expectedCheckVarsName, actualCheckVarsName);
        
        assertTrue(deepEquals(expectedCheckVars, actualCheckVars));
        assertTrue(deepEquals(expectedCheckVars, actualCheckVars));
        
        PassFactory expectedCheckShadowVars = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        PassFactory actualCheckShadowVars = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkShadowVars"));
        String expectedCheckShadowVarsName = expectedCheckShadowVars.getName();
        String actualCheckShadowVarsName = actualCheckShadowVars.getName();
        assertEquals(expectedCheckShadowVarsName, actualCheckShadowVarsName);
        
        assertTrue(deepEquals(expectedCheckShadowVars, actualCheckShadowVars));
        assertTrue(deepEquals(expectedCheckShadowVars, actualCheckShadowVars));
        
        PassFactory expectedCheckVariableReferences = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
        PassFactory actualCheckVariableReferences = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkVariableReferences"));
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
        
        PassFactory expectedCheckFunctions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkFunctions"));
        PassFactory actualCheckFunctions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkFunctions"));
        String expectedCheckFunctionsName = expectedCheckFunctions.getName();
        String actualCheckFunctionsName = actualCheckFunctions.getName();
        assertEquals(expectedCheckFunctionsName, actualCheckFunctionsName);
        
        assertTrue(deepEquals(expectedCheckFunctions, actualCheckFunctions));
        assertTrue(deepEquals(expectedCheckFunctions, actualCheckFunctions));
        
        PassFactory expectedCheckMethods = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkMethods"));
        PassFactory actualCheckMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkMethods"));
        String expectedCheckMethodsName = expectedCheckMethods.getName();
        String actualCheckMethodsName = actualCheckMethods.getName();
        assertEquals(expectedCheckMethodsName, actualCheckMethodsName);
        
        assertTrue(deepEquals(expectedCheckMethods, actualCheckMethods));
        assertTrue(deepEquals(expectedCheckMethods, actualCheckMethods));
        
        PassFactory expectedResolveTypes = expected.resolveTypes;
        PassFactory actualResolveTypes = actual.resolveTypes;
        String expectedResolveTypesName = expectedResolveTypes.getName();
        String actualResolveTypesName = actualResolveTypes.getName();
        assertEquals(expectedResolveTypesName, actualResolveTypesName);
        
        assertTrue(deepEquals(expectedResolveTypes, actualResolveTypes));
        assertTrue(deepEquals(expectedResolveTypes, actualResolveTypes));
        
        PassFactory expectedInferTypes = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes"));
        PassFactory actualInferTypes = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inferTypes"));
        String expectedInferTypesName = expectedInferTypes.getName();
        String actualInferTypesName = actualInferTypes.getName();
        assertEquals(expectedInferTypesName, actualInferTypesName);
        
        assertTrue(deepEquals(expectedInferTypes, actualInferTypes));
        assertTrue(deepEquals(expectedInferTypes, actualInferTypes));
        
        PassFactory expectedCheckTypes = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        PassFactory actualCheckTypes = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkTypes"));
        String expectedCheckTypesName = expectedCheckTypes.getName();
        String actualCheckTypesName = actualCheckTypes.getName();
        assertEquals(expectedCheckTypesName, actualCheckTypesName);
        
        assertTrue(deepEquals(expectedCheckTypes, actualCheckTypes));
        assertTrue(deepEquals(expectedCheckTypes, actualCheckTypes));
        
        PassFactory expectedCheckControlFlow = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        PassFactory actualCheckControlFlow = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkControlFlow"));
        String expectedCheckControlFlowName = expectedCheckControlFlow.getName();
        String actualCheckControlFlowName = actualCheckControlFlow.getName();
        assertEquals(expectedCheckControlFlowName, actualCheckControlFlowName);
        
        assertTrue(deepEquals(expectedCheckControlFlow, actualCheckControlFlow));
        assertTrue(deepEquals(expectedCheckControlFlow, actualCheckControlFlow));
        
        PassFactory expectedCheckAccessControls = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
        PassFactory actualCheckAccessControls = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkAccessControls"));
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
        
        PassFactory expectedCheckSuspiciousProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkSuspiciousProperties"));
        PassFactory actualCheckSuspiciousProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkSuspiciousProperties"));
        String expectedCheckSuspiciousPropertiesName = expectedCheckSuspiciousProperties.getName();
        String actualCheckSuspiciousPropertiesName = actualCheckSuspiciousProperties.getName();
        assertEquals(expectedCheckSuspiciousPropertiesName, actualCheckSuspiciousPropertiesName);
        
        assertTrue(deepEquals(expectedCheckSuspiciousProperties, actualCheckSuspiciousProperties));
        assertTrue(deepEquals(expectedCheckSuspiciousProperties, actualCheckSuspiciousProperties));
        
        PassFactory expectedCheckStrictMode = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        PassFactory actualCheckStrictMode = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "checkStrictMode"));
        String expectedCheckStrictModeName = expectedCheckStrictMode.getName();
        String actualCheckStrictModeName = actualCheckStrictMode.getName();
        assertEquals(expectedCheckStrictModeName, actualCheckStrictModeName);
        
        assertTrue(deepEquals(expectedCheckStrictMode, actualCheckStrictMode));
        assertTrue(deepEquals(expectedCheckStrictMode, actualCheckStrictMode));
        
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
        
        PassFactory expectedOptimizeArgumentsArray = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        PassFactory actualOptimizeArgumentsArray = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "optimizeArgumentsArray"));
        String expectedOptimizeArgumentsArrayName = expectedOptimizeArgumentsArray.getName();
        String actualOptimizeArgumentsArrayName = actualOptimizeArgumentsArray.getName();
        assertEquals(expectedOptimizeArgumentsArrayName, actualOptimizeArgumentsArrayName);
        
        assertTrue(deepEquals(expectedOptimizeArgumentsArray, actualOptimizeArgumentsArray));
        assertTrue(deepEquals(expectedOptimizeArgumentsArray, actualOptimizeArgumentsArray));
        
        PassFactory expectedRemoveUselessParameters = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeUselessParameters"));
        PassFactory actualRemoveUselessParameters = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeUselessParameters"));
        String expectedRemoveUselessParametersName = expectedRemoveUselessParameters.getName();
        String actualRemoveUselessParametersName = actualRemoveUselessParameters.getName();
        assertEquals(expectedRemoveUselessParametersName, actualRemoveUselessParametersName);
        
        assertTrue(deepEquals(expectedRemoveUselessParameters, actualRemoveUselessParameters));
        assertTrue(deepEquals(expectedRemoveUselessParameters, actualRemoveUselessParameters));
        
        PassFactory expectedRemoveAbstractMethods = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeAbstractMethods"));
        PassFactory actualRemoveAbstractMethods = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeAbstractMethods"));
        String expectedRemoveAbstractMethodsName = expectedRemoveAbstractMethods.getName();
        String actualRemoveAbstractMethodsName = actualRemoveAbstractMethods.getName();
        assertEquals(expectedRemoveAbstractMethodsName, actualRemoveAbstractMethodsName);
        
        assertTrue(deepEquals(expectedRemoveAbstractMethods, actualRemoveAbstractMethods));
        assertTrue(deepEquals(expectedRemoveAbstractMethods, actualRemoveAbstractMethods));
        
        PassFactory expectedCollapseProperties = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        PassFactory actualCollapseProperties = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseProperties"));
        String expectedCollapsePropertiesName = expectedCollapseProperties.getName();
        String actualCollapsePropertiesName = actualCollapseProperties.getName();
        assertEquals(expectedCollapsePropertiesName, actualCollapsePropertiesName);
        
        assertTrue(deepEquals(expectedCollapseProperties, actualCollapseProperties));
        assertTrue(deepEquals(expectedCollapseProperties, actualCollapseProperties));
        
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
        
        PassFactory expectedRemoveConstantExpressions = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "removeConstantExpressions"));
        PassFactory actualRemoveConstantExpressions = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "removeConstantExpressions"));
        String expectedRemoveConstantExpressionsName = expectedRemoveConstantExpressions.getName();
        String actualRemoveConstantExpressionsName = actualRemoveConstantExpressions.getName();
        assertEquals(expectedRemoveConstantExpressionsName, actualRemoveConstantExpressionsName);
        
        assertTrue(deepEquals(expectedRemoveConstantExpressions, actualRemoveConstantExpressions));
        assertTrue(deepEquals(expectedRemoveConstantExpressions, actualRemoveConstantExpressions));
        
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
        
        PassFactory expectedInlineGetters = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "inlineGetters"));
        PassFactory actualInlineGetters = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "inlineGetters"));
        String expectedInlineGettersName = expectedInlineGetters.getName();
        String actualInlineGettersName = actualInlineGetters.getName();
        assertEquals(expectedInlineGettersName, actualInlineGettersName);
        
        assertTrue(deepEquals(expectedInlineGetters, actualInlineGetters));
        assertTrue(deepEquals(expectedInlineGetters, actualInlineGetters));
        
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
        
        PassFactory expectedCollapseVariableDeclarations = ((PassFactory) getFieldValue(expected, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        PassFactory actualCollapseVariableDeclarations = ((PassFactory) getFieldValue(actual, "com.google.javascript.jscomp.DefaultPassConfig", "collapseVariableDeclarations"));
        String expectedCollapseVariableDeclarationsName = expectedCollapseVariableDeclarations.getName();
        String actualCollapseVariableDeclarationsName = actualCollapseVariableDeclarations.getName();
        assertEquals(expectedCollapseVariableDeclarationsName, actualCollapseVariableDeclarationsName);
        
        assertTrue(deepEquals(expectedCollapseVariableDeclarations, actualCollapseVariableDeclarations));
        assertTrue(deepEquals(expectedCollapseVariableDeclarations, actualCollapseVariableDeclarations));
        
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
        
        CompilerOptions actualOptions = actual.options;
        assertNull(actualOptions);
        
        MemoizedScopeCreator actualTypedScopeCreator = actual.typedScopeCreator;
        assertNull(actualTypedScopeCreator);
        
        Scope actualTopScope = actual.topScope;
        assertNull(actualTopScope);
        
        PassConfig finalCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        assertFalse(initialCompilerPasses == finalCompilerPasses);
    */
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
            com.google.javascript.jscomp.Compiler.maybeSanityCheck(Compiler.java:686) */
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
            com.google.javascript.jscomp.Compiler.runSanityCheck(Compiler.java:692)
            com.google.javascript.jscomp.Compiler.maybeSanityCheck(Compiler.java:687) */
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
    
    @Test(expected = NullPointerException.class)
    public void testMaybeSanityCheck1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$51"));
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
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.compileInternal
    
    ///region OTHER: ERROR SUITE for method compileInternal()
    
    @Test
    public void testCompileInternal1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "next", externsRoot);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "next", externsRoot);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "next", jsRoot);
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        ScriptOrFnNode jsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
    public void testCompileInternal16() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.compileInternal] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983)
            com.google.javascript.jscomp.Compiler.parse(Compiler.java:574)
            com.google.javascript.jscomp.Compiler.compileInternal(Compiler.java:533) */
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
            com.google.javascript.jscomp.Compiler.runSanityCheck(Compiler.java:692) */
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
    
    ///region OTHER: ERROR SUITE for method runSanityCheck()
    
    @Test
    public void testRunSanityCheck1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$27"));
        setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "isCreated", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "sanityCheck", sanityCheck);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.runSanityCheck] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.DefaultPassConfig$27$1.process(DefaultPassConfig.java:1025)
            com.google.javascript.jscomp.Compiler.runSanityCheck(Compiler.java:692) */
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
    
    @Test(expected = IllegalStateException.class)
    public void testRunSanityCheck2() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.DefaultPassConfig$27"));
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
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.stripCode
    
    ///region OTHER: ERROR SUITE for method stripCode(java.util.Set, java.util.Set, java.util.Set, java.util.Set)
    
    @Test
    public void testStripCode1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet1 = new LinkedHashSet();
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.stripCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:745)
            com.google.javascript.jscomp.Compiler.stripCode(Compiler.java:713) */
        compiler.stripCode(null, linkedHashSet, linkedHashSet1, null);
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
    
    ///region OTHER: ERROR SUITE for method startPass(java.lang.String)
    
    @Test
    public void testStartPass1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.startPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:768)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:745) */
        compiler.startPass(null);
    }
    
    @Test
    public void testStartPass2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.startPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:768)
            com.google.javascript.jscomp.Compiler.startPass(Compiler.java:745) */
        compiler.startPass(string);
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTopScope()
    
    @Test(expected = StackOverflowError.class)
    public void testGetTopScope2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassConfig.PassConfigDelegate passes = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        setField(passes, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", passes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        compiler.getTopScope();
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
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:968) */
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
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        ScriptOrFnNode jsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.OFF;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(externsRoot, "com.google.javascript.rhino.Node", "first", externsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
    }
    
    @Test
    public void testParseInputs12() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.DevMode devMode = CompilerOptions.DevMode.EVERY_PASS;
        options.devMode = devMode;
        compiler.options = options;
        FunctionNode externsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "externsRoot", externsRoot);
        FunctionNode jsRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", jsRoot);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseInputs(Compiler.java:983) */
        compiler.parseInputs();
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
        
        Set actualEnumTypeNames = ((Set) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualEnumTypeNames);
        
        Set actualForwardDeclaredTypes = ((Set) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualForwardDeclaredTypes);
        
        Map actualTypesIndexedByProperty = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypesIndexedByProperty);
        
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
            com.google.javascript.jscomp.Compiler.getErrors(Compiler.java:803) */
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
        PrintStreamErrorManager errorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getErrors] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.BasicErrorManager.toArray(BasicErrorManager.java:99)
            com.google.javascript.jscomp.BasicErrorManager.getErrors(BasicErrorManager.java:83)
            com.google.javascript.jscomp.Compiler.getErrors(Compiler.java:803) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getTypeValidator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeValidator()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getTypeValidator()}
 * @utbot.returnsFrom {@code return typeValidator;}
 *  */
    @Test
    public void testGetTypeValidator_ReturnTypeValidator() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        TypeValidator actual = compiler.getTypeValidator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.getScopeCreator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScopeCreator()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getScopeCreator()}
 * @utbot.returnsFrom {@code return getPassConfig().getScopeCreator();}
 *  */
    @Test
    public void testGetScopeCreator_ReturnGetPassConfigGetScopeCreator() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        DefaultPassConfig passes = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        ScopeCreator actual = compiler.getScopeCreator();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getScopeCreator()}
 * @utbot.returnsFrom {@code return getPassConfig().getScopeCreator();}
 *  */
    @Test
    public void testGetScopeCreator_ReturnGetPassConfigGetScopeCreator_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassConfig.PassConfigDelegate passes = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        PassConfig.PassConfigDelegate delegate = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        DefaultPassConfig delegate1 = ((DefaultPassConfig) createInstance("com.google.javascript.jscomp.DefaultPassConfig"));
        setField(delegate, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate1);
        setField(passes, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", delegate);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        ScopeCreator actual = compiler.getScopeCreator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getScopeCreator()
    
    @Test
    public void testGetScopeCreator1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        PassConfig initialCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        ScopeCreator actual = compiler.getScopeCreator();
        
        assertNull(actual);
        
        PassConfig finalCompilerPasses = ((PassConfig) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "passes"));
        
        assertFalse(initialCompilerPasses == finalCompilerPasses);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getScopeCreator()
    
    @Test(expected = StackOverflowError.class)
    public void testGetScopeCreator2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PassConfig.PassConfigDelegate passes = ((PassConfig.PassConfigDelegate) createInstance("com.google.javascript.jscomp.PassConfig$PassConfigDelegate"));
        setField(passes, "com.google.javascript.jscomp.PassConfig$PassConfigDelegate", "delegate", passes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "passes", passes);
        
        compiler.getScopeCreator();
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
            com.google.javascript.jscomp.Compiler.newExternInput(Compiler.java:894) */
        compiler.newExternInput(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newExternInput(java.lang.String)
    
    @Test
    public void testNewExternInput1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newExternInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newExternInput(Compiler.java:900) */
        compiler.newExternInput(null);
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
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.newTracer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newTracer(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#newTracer(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: recentChange.hasCodeChanged()
 *  */
    @Test
    public void testNewTracer_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767) */
        compiler.newTracer(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#newTracer(java.lang.String)}
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
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:768) */
        compiler.newTracer(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#newTracer(java.lang.String)}
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
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:768) */
        compiler.newTracer(null);
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#newTracer(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerOptions.TracerMode#isOn()}
 * @utbot.invokes {@link com.google.javascript.jscomp.PerformanceTracker#recordPassStart(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tracker.recordPassStart(passName);
 *  */
    @Test
    public void testNewTracer_ThrowNullPointerException_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:769) */
        compiler.newTracer(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method newTracer(java.lang.String)
    
    @Test
    public void testNewTracer1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        Tracer actual = compiler.newTracer(null);
        
        Tracer expected = ((Tracer) createInstance("com.google.javascript.jscomp.Tracer"));
        CopyOnWriteArrayList extraTracingStatistics = new CopyOnWriteArrayList();
        setField(expected, "com.google.javascript.jscomp.Tracer", "extraTracingStatistics", extraTracingStatistics);
        String type = "Compiler";
        setField(expected, "com.google.javascript.jscomp.Tracer", "type", type);
        String comment = "null on recently changed AST";
        setField(expected, "com.google.javascript.jscomp.Tracer", "comment", comment);
        setField(expected, "com.google.javascript.jscomp.Tracer", "startTimeMs", 1790677007409L);
        setField(expected, "com.google.javascript.jscomp.Tracer", "stopTimeMs", 0L);
        Thread startThread = ((Thread) createInstance("kotlin.concurrent.ThreadsKt$thread$thread$1"));
        setField(expected, "com.google.javascript.jscomp.Tracer", "startThread", startThread);
        Tracer.InternalClock clock = ((Tracer.InternalClock) createInstance("com.google.javascript.jscomp.Tracer$1"));
        Tracer.clock = clock;
        ThreadLocal traces = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
        setField(expected, "com.google.javascript.jscomp.Tracer", "traces", traces);
        
        long[] actualExtraTracingValues = ((long[]) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "extraTracingValues"));
        assertNull(actualExtraTracingValues);
        
        String expectedType = ((String) getFieldValue(expected, "com.google.javascript.jscomp.Tracer", "type"));
        String actualType = ((String) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "type"));
        assertEquals(expectedType, actualType);
        
        String expectedComment = ((String) getFieldValue(expected, "com.google.javascript.jscomp.Tracer", "comment"));
        String actualComment = ((String) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "comment"));
        assertEquals(expectedComment, actualComment);
        
        long expectedStartTimeMs = ((Long) getFieldValue(expected, "com.google.javascript.jscomp.Tracer", "startTimeMs"));
        long actualStartTimeMs = ((Long) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "startTimeMs"));
        assertEquals(expectedStartTimeMs, actualStartTimeMs);
        
        long expectedStopTimeMs = ((Long) getFieldValue(expected, "com.google.javascript.jscomp.Tracer", "stopTimeMs"));
        long actualStopTimeMs = ((Long) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "stopTimeMs"));
        assertEquals(expectedStopTimeMs, actualStopTimeMs);
        
        Thread expectedStartThread = expected.startThread;
        Thread actualStartThread = actual.startThread;
        
    }
    
    @Test
    public void testNewTracer2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        Tracer actual = compiler.newTracer(null);
        
        Tracer expected = ((Tracer) createInstance("com.google.javascript.jscomp.Tracer"));
        CopyOnWriteArrayList extraTracingStatistics = new CopyOnWriteArrayList();
        setField(expected, "com.google.javascript.jscomp.Tracer", "extraTracingStatistics", extraTracingStatistics);
        String type = "Compiler";
        setField(expected, "com.google.javascript.jscomp.Tracer", "type", type);
        String comment = "null";
        setField(expected, "com.google.javascript.jscomp.Tracer", "comment", comment);
        setField(expected, "com.google.javascript.jscomp.Tracer", "startTimeMs", 1790677007423L);
        setField(expected, "com.google.javascript.jscomp.Tracer", "stopTimeMs", 0L);
        Thread startThread = ((Thread) createInstance("kotlin.concurrent.ThreadsKt$thread$thread$1"));
        setField(expected, "com.google.javascript.jscomp.Tracer", "startThread", startThread);
        Tracer.InternalClock clock = ((Tracer.InternalClock) createInstance("com.google.javascript.jscomp.Tracer$1"));
        Tracer.clock = clock;
        ThreadLocal traces = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
        setField(expected, "com.google.javascript.jscomp.Tracer", "traces", traces);
        
        long[] actualExtraTracingValues = ((long[]) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "extraTracingValues"));
        assertNull(actualExtraTracingValues);
        
        String expectedType = ((String) getFieldValue(expected, "com.google.javascript.jscomp.Tracer", "type"));
        String actualType = ((String) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "type"));
        assertEquals(expectedType, actualType);
        
        String expectedComment = ((String) getFieldValue(expected, "com.google.javascript.jscomp.Tracer", "comment"));
        String actualComment = ((String) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "comment"));
        assertEquals(expectedComment, actualComment);
        
        long expectedStartTimeMs = ((Long) getFieldValue(expected, "com.google.javascript.jscomp.Tracer", "startTimeMs"));
        long actualStartTimeMs = ((Long) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "startTimeMs"));
        assertEquals(expectedStartTimeMs, actualStartTimeMs);
        
        long expectedStopTimeMs = ((Long) getFieldValue(expected, "com.google.javascript.jscomp.Tracer", "stopTimeMs"));
        long actualStopTimeMs = ((Long) getFieldValue(actual, "com.google.javascript.jscomp.Tracer", "stopTimeMs"));
        assertEquals(expectedStopTimeMs, actualStopTimeMs);
        
        Thread expectedStartThread = expected.startThread;
        Thread actualStartThread = actual.startThread;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newTracer(java.lang.String)
    
    @Test
    public void testNewTracer3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:768) */
        compiler.newTracer(string);
    }
    
    @Test
    public void testNewTracer4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        String string = "\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:768) */
        compiler.newTracer(string);
    }
    
    @Test
    public void testNewTracer5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        PerformanceTracker tracker = ((PerformanceTracker) createInstance("com.google.javascript.jscomp.PerformanceTracker"));
        compiler.tracker = tracker;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker.recordPassStart(PerformanceTracker.java:67)
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:769) */
        compiler.newTracer(null);
    }
    
    @Test
    public void testNewTracer6() throws Exception  {
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
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker.recordPassStart(PerformanceTracker.java:68)
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:769) */
        compiler.newTracer(null);
    }
    
    @Test
    public void testNewTracer7() throws Exception  {
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
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.newTracer] produces [java.lang.NullPointerException]
            java.base/java.util.ArrayDeque.addFirst(ArrayDeque.java:286)
            java.base/java.util.ArrayDeque.push(ArrayDeque.java:579)
            com.google.javascript.jscomp.PerformanceTracker.recordPassStart(PerformanceTracker.java:67)
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:769) */
        compiler.newTracer(null);
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
            com.google.javascript.jscomp.Compiler.getWarnings(Compiler.java:810) */
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
        PrintStreamErrorManager errorManager = ((PrintStreamErrorManager) createInstance("com.google.javascript.jscomp.PrintStreamErrorManager"));
        Class compilerClazz = Class.forName("com.google.javascript.jscomp.Compiler");
        Class errorManagerType = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Method setErrorManagerMethod = compilerClazz.getDeclaredMethod("setErrorManager", errorManagerType);
        setErrorManagerMethod.setAccessible(true);
        java.lang.Object[] setErrorManagerMethodArguments = new java.lang.Object[1];
        setErrorManagerMethodArguments[0] = errorManager;
        setErrorManagerMethod.invoke(compiler, setErrorManagerMethodArguments);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getWarnings] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.BasicErrorManager.toArray(BasicErrorManager.java:99)
            com.google.javascript.jscomp.BasicErrorManager.getWarnings(BasicErrorManager.java:87)
            com.google.javascript.jscomp.Compiler.getWarnings(Compiler.java:810) */
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
            com.google.javascript.jscomp.Compiler.stopTracer(Compiler.java:775) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.toSource
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#toSource(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#initCompilerOptionsIfTesting()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#setPrettyPrint(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#setLineBreak(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#setSourceMap(com.google.javascript.jscomp.SourceMap)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#setOutputCharset(java.nio.charset.Charset)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodePrinter.Builder#build()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return builder.build();
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
    public void testToSource1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        compiler.toSource(((Node) null));
    }
    
    @Test(expected = Error.class)
    public void testToSource2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "sourceMap", sourceMap);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        compiler.toSource(scriptOrFnNode);
    }
    
    @Test(expected = Error.class)
    public void testToSource3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options.prettyPrint = true;
        compiler.options = options;
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        compiler.toSource(scriptOrFnNode);
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
 *         String code = toSource(root);
 *         if (!code.isEmpty()) {
 *             cb.append(code);
 *             if (!code.endsWith(";")) {
 *                 cb.append(";");
 *             }
 *         }
 *         return null;
 *     }
 * });
 *  */
    @Test
    public void testToSource_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1207) */
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
 *         String code = toSource(root);
 *         if (!code.isEmpty()) {
 *             cb.append(code);
 *             if (!code.endsWith(";")) {
 *                 cb.append(";");
 *             }
 *         }
 *         return null;
 *     }
 * });
 *  */
    @Test
    public void testToSource_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1207) */
        compiler.toSource(null, -255, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.jscomp.Compiler$CodeBuilder, int, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testToSource4() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSource(null, 0, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSource(null, 0, null);
    }
    
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
    ///endregion
    
    ///region Errors report for toSource
    
    public void testToSource_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
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
    public void testToSource_ThrowNullPointerException1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1145) */
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
    public void testToSource_ThrowNullPointerException_11() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1145) */
        compiler.toSource(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.jscomp.JSModule)
    
    @Test(expected = RuntimeException.class)
    public void testToSource7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSource(null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource8() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSource(null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource9() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSource(null);
    }
    ///endregion
    
    ///region Errors report for toSource
    
    public void testToSource_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
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
    public void testToSource_ThrowNullPointerException2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1095) */
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
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSource(Compiler.java:1095) */
        compiler.toSource();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource()
    
    @Test(expected = RuntimeException.class)
    public void testToSource10() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSource();
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSource11() throws Exception  {
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
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.parseSyntheticCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseSyntheticCode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#parseSyntheticCode(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.JSSourceFile#fromCode(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CompilerInput#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: inputsByName.put(input.getName(), input);
 *  */
    @Test
    public void testParseSyntheticCode_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.parseSyntheticCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.parseSyntheticCode(Compiler.java:1053) */
        compiler.parseSyntheticCode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.computeCFG
    
    ///region OTHER: ERROR SUITE for method computeCFG()
    
    @Test
    public void testComputeCFG1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.computeCFG] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:767)
            com.google.javascript.jscomp.Compiler.computeCFG(Compiler.java:1370) */
        compiler.computeCFG();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.addChangeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 *  */
    @Test
    public void testAddChangeHandler_ListAdd() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        compiler.addChangeHandler(null);
    }
    ///endregion
    
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
            com.google.javascript.jscomp.Compiler.addChangeHandler(Compiler.java:1411) */
        compiler.addChangeHandler(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Compiler.reportCodeChange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reportCodeChange()
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#reportCodeChange()}
 *  */
    @Test
    public void testReportCodeChange() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        compiler.reportCodeChange();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#reportCodeChange()}
 * @utbot.iterates iterate the loop {@code for(CodeChangeHandler handler: codeChangeHandlers)} once
 *  */
    @Test
    public void testReportCodeChange_IterateForEachLoop() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        codeChangeHandlers.add(recentChange);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        compiler.reportCodeChange();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#reportCodeChange()}
 * @utbot.iterates iterate the loop {@code for(CodeChangeHandler handler: codeChangeHandlers)} once
 *  */
    @Test
    public void testReportCodeChange_IterateForEachLoop_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "locked", true);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        compiler.reportCodeChange();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#reportCodeChange()}
 * @utbot.iterates iterate the loop {@code for(CodeChangeHandler handler: codeChangeHandlers)} once
 *  */
    @Test
    public void testReportCodeChange_IterateForEachLoop_2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        Object cache = createInstance("com.google.javascript.jscomp.SymbolTable$MemoizedData");
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "cache", cache);
        codeChangeHandlers.add(symbolTable);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        compiler.reportCodeChange();
    }
    ///endregion
    
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
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:1426) */
        compiler.reportCodeChange();
    }
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#reportCodeChange()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(CodeChangeHandler handler: codeChangeHandlers)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handler.reportChange();
 *  */
    @Test
    public void testReportCodeChange_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.reportCodeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:1427) */
        compiler.reportCodeChange();
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
            com.google.javascript.jscomp.Compiler.isIdeMode(Compiler.java:1440) */
        compiler.isIdeMode();
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
    public void testToSourceArray_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSourceArray] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSourceArray(Compiler.java:1171) */
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
    public void testToSourceArray_ThrowNullPointerException_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.toSourceArray] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSourceArray(Compiler.java:1171) */
        compiler.toSourceArray(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toSourceArray(com.google.javascript.jscomp.JSModule)
    
    @Test
    public void testToSourceArray1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        JSModule jSModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        ArrayList inputs = new ArrayList();
        setField(jSModule, "com.google.javascript.jscomp.JSModule", "inputs", inputs);
        
        java.lang.String[] actual = compiler.toSourceArray(jSModule);
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSourceArray(com.google.javascript.jscomp.JSModule)
    
    @Test(expected = RuntimeException.class)
    public void testToSourceArray2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSourceArray(null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSourceArray3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
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
 *             int numInputs = inputs.length;
 *             String[] sources = new String[numInputs];
 *             CodeBuilder cb = new CodeBuilder();
 *             for (int i = 0; i < numInputs; i++) {
 *                 Node scriptNode = inputs[i].getAstRoot(Compiler.this);
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
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSourceArray(Compiler.java:1120) */
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
 *             int numInputs = inputs.length;
 *             String[] sources = new String[numInputs];
 *             CodeBuilder cb = new CodeBuilder();
 *             for (int i = 0; i < numInputs; i++) {
 *                 Node scriptNode = inputs[i].getAstRoot(Compiler.this);
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
            com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:489)
            com.google.javascript.jscomp.Compiler.toSourceArray(Compiler.java:1120) */
        compiler.toSourceArray();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSourceArray()
    
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
    
    @Test(expected = RuntimeException.class)
    public void testToSourceArray5() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        
        compiler.toSourceArray();
    }
    
    @Test(expected = RuntimeException.class)
    public void testToSourceArray6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.FAST;
        options.tracer = tracer;
        compiler.options = options;
        setField(compiler, "com.google.javascript.jscomp.Compiler", "useThreads", true);
        
        compiler.toSourceArray();
    }
    ///endregion
    
    ///region Errors report for toSourceArray
    
    public void testToSourceArray_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
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
            com.google.javascript.jscomp.Compiler.setCssRenamingMap(Compiler.java:1341) */
        compiler.setCssRenamingMap(null);
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
    
    @Test
    public void testPrepareAst3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.TracerMode tracer = CompilerOptions.TracerMode.OFF;
        options.tracer = tracer;
        compiler.options = options;
        PerformanceTracker tracker = ((PerformanceTracker) createInstance("com.google.javascript.jscomp.PerformanceTracker"));
        ArrayDeque currentRunningPass = new ArrayDeque();
        setField(tracker, "com.google.javascript.jscomp.PerformanceTracker", "currentRunningPass", currentRunningPass);
        compiler.tracker = tracker;
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(recentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged", true);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        Node node = new Node(0);
        
        compiler.prepareAst(node);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prepareAst(com.google.javascript.rhino.Node)
    
    @Test
    public void testPrepareAst4() throws Exception  {
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
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.prepareAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker.recordPassStart(PerformanceTracker.java:68)
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:769)
            com.google.javascript.jscomp.Compiler.prepareAst(Compiler.java:1387) */
        compiler.prepareAst(null);
    }
    
    @Test
    public void testPrepareAst5() throws Exception  {
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
        setField(compiler, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.prepareAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PerformanceTracker.recordPassStart(PerformanceTracker.java:68)
            com.google.javascript.jscomp.Compiler.newTracer(Compiler.java:769)
            com.google.javascript.jscomp.Compiler.prepareAst(Compiler.java:1387) */
        compiler.prepareAst(null);
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
            com.google.javascript.jscomp.Compiler.getCssRenamingMap(Compiler.java:1346) */
        compiler.getCssRenamingMap();
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
            com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1536)
            com.google.javascript.jscomp.Compiler.getSourceRegion(Compiler.java:1557) */
        compiler.getSourceRegion(null, 1);
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
            com.google.javascript.jscomp.Compiler.setLoggingLevel(Compiler.java:1615) */
    }
    ///endregion
    
    ///region OTHER: SECURITY for method setLoggingLevel(java.util.logging.Level)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testSetLoggingLevel1() {
        /* This test fails because method [com.google.javascript.jscomp.Compiler.setLoggingLevel] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.logging/java.util.logging.LogManager.checkPermission(LogManager.java:2440)
            java.logging/java.util.logging.Logger.checkPermission(Logger.java:622)
            java.logging/java.util.logging.Logger.setLevel(Logger.java:2002)
            com.google.javascript.jscomp.Compiler.setLoggingLevel(Compiler.java:1615) */
    }
    ///endregion
    
    ///region Errors report for setLoggingLevel
    
    public void testSetLoggingLevel_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
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
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "registry"));
        assertNull(actualRegistry);
        
        boolean actualParseJsDocDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "parseJsDocDocumentation"));
        assertFalse(actualParseJsDocDocumentation);
        
        boolean actualIsIdeMode = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "isIdeMode"));
        assertFalse(actualIsIdeMode);
        
        Map actualAnnotationNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
        assertNull(actualAnnotationNames);
        
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
            compiler.options = options;
            JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
            
            Config initialCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
            
            Config actual = compiler.getParserConfig();
            
            Config expected = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "registry", typeRegistry);
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
            String string20 = "license";
            Object annotation18 = getEnumConstantByName(annotationClazz, "LICENSE");
            annotationNames1.put(string20, annotation18);
            String string21 = "noalias";
            Object annotation19 = getEnumConstantByName(annotationClazz, "NO_ALIAS");
            annotationNames1.put(string21, annotation19);
            String string22 = "noshadow";
            Object annotation20 = getEnumConstantByName(annotationClazz, "NO_SHADOW");
            annotationNames1.put(string22, annotation20);
            String string23 = "nosideeffects";
            Object annotation21 = getEnumConstantByName(annotationClazz, "NO_SIDE_EFFECTS");
            annotationNames1.put(string23, annotation21);
            String string24 = "notypecheck";
            Object annotation22 = getEnumConstantByName(annotationClazz, "NO_TYPE_CHECK");
            annotationNames1.put(string24, annotation22);
            String string25 = "override";
            Object annotation23 = getEnumConstantByName(annotationClazz, "OVERRIDE");
            annotationNames1.put(string25, annotation23);
            String string26 = "owner";
            annotationNames1.put(string26, annotation1);
            String string27 = "param";
            annotationNames1.put(string27, annotation);
            String string28 = "preserve";
            Object annotation24 = getEnumConstantByName(annotationClazz, "PRESERVE");
            annotationNames1.put(string28, annotation24);
            String string29 = "preserveTry";
            Object annotation25 = getEnumConstantByName(annotationClazz, "PRESERVE_TRY");
            annotationNames1.put(string29, annotation25);
            String string30 = "private";
            Object annotation26 = getEnumConstantByName(annotationClazz, "PRIVATE");
            annotationNames1.put(string30, annotation26);
            String string31 = "protected";
            Object annotation27 = getEnumConstantByName(annotationClazz, "PROTECTED");
            annotationNames1.put(string31, annotation27);
            String string32 = "public";
            Object annotation28 = getEnumConstantByName(annotationClazz, "PUBLIC");
            annotationNames1.put(string32, annotation28);
            String string33 = "return";
            Object annotation29 = getEnumConstantByName(annotationClazz, "RETURN");
            annotationNames1.put(string33, annotation29);
            String string34 = "returns";
            annotationNames1.put(string34, annotation29);
            String string35 = "see";
            Object annotation30 = getEnumConstantByName(annotationClazz, "SEE");
            annotationNames1.put(string35, annotation30);
            String string36 = "suppress";
            Object annotation31 = getEnumConstantByName(annotationClazz, "SUPPRESS");
            annotationNames1.put(string36, annotation31);
            String string37 = "template";
            Object annotation32 = getEnumConstantByName(annotationClazz, "TEMPLATE");
            annotationNames1.put(string37, annotation32);
            String string38 = "this";
            Object annotation33 = getEnumConstantByName(annotationClazz, "THIS");
            annotationNames1.put(string38, annotation33);
            String string39 = "throws";
            Object annotation34 = getEnumConstantByName(annotationClazz, "THROWS");
            annotationNames1.put(string39, annotation34);
            String string40 = "type";
            Object annotation35 = getEnumConstantByName(annotationClazz, "TYPE");
            annotationNames1.put(string40, annotation35);
            String string41 = "typedef";
            Object annotation36 = getEnumConstantByName(annotationClazz, "TYPEDEF");
            annotationNames1.put(string41, annotation36);
            String string42 = "version";
            Object annotation37 = getEnumConstantByName(annotationClazz, "VERSION");
            annotationNames1.put(string42, annotation37);
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames", annotationNames1);
            
            JSTypeRegistry expectedRegistry = ((JSTypeRegistry) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "registry"));
            JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "registry"));
            ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            assertNull(actualRegistryReporter);
            
            com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            assertNull(actualRegistryNativeTypes);
            
            Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertNull(actualRegistryNamesToTypes);
            
            Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertNull(actualRegistryNamespaces);
            
            Set actualRegistryEnumTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertNull(actualRegistryEnumTypeNames);
            
            Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertNull(actualRegistryForwardDeclaredTypes);
            
            Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertNull(actualRegistryTypesIndexedByProperty);
            
            Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertNull(actualRegistryGreatestSubtypeByProperty);
            
            Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            assertNull(actualRegistryInterfaceToImplementors);
            
            Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            assertNull(actualRegistryUnresolvedNamedTypes);
            
            Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertNull(actualRegistryResolvedNamedTypes);
            
            boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertFalse(actualRegistryLastGeneration);
            
            String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualRegistryTemplateTypeName);
            
            TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualRegistryTemplateType);
            
            boolean actualParseJsDocDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "parseJsDocDocumentation"));
            assertFalse(actualParseJsDocDocumentation);
            
            boolean actualIsIdeMode = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "isIdeMode"));
            assertFalse(actualIsIdeMode);
            
            Map expectedAnnotationNames = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
            Map actualAnnotationNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
            assertTrue(deepEquals(expectedAnnotationNames, actualAnnotationNames));
            
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
            compiler.options = options;
            JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
            
            Config initialCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
            
            Config actual = compiler.getParserConfig();
            
            Config expected = ((Config) createInstance("com.google.javascript.jscomp.parsing.Config"));
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "registry", typeRegistry);
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
            String string20 = "license";
            Object annotation18 = getEnumConstantByName(annotationClazz, "LICENSE");
            annotationNames.put(string20, annotation18);
            String string21 = "noalias";
            Object annotation19 = getEnumConstantByName(annotationClazz, "NO_ALIAS");
            annotationNames.put(string21, annotation19);
            String string22 = "noshadow";
            Object annotation20 = getEnumConstantByName(annotationClazz, "NO_SHADOW");
            annotationNames.put(string22, annotation20);
            String string23 = "nosideeffects";
            Object annotation21 = getEnumConstantByName(annotationClazz, "NO_SIDE_EFFECTS");
            annotationNames.put(string23, annotation21);
            String string24 = "notypecheck";
            Object annotation22 = getEnumConstantByName(annotationClazz, "NO_TYPE_CHECK");
            annotationNames.put(string24, annotation22);
            String string25 = "override";
            Object annotation23 = getEnumConstantByName(annotationClazz, "OVERRIDE");
            annotationNames.put(string25, annotation23);
            String string26 = "owner";
            annotationNames.put(string26, annotation1);
            String string27 = "param";
            annotationNames.put(string27, annotation);
            String string28 = "preserve";
            Object annotation24 = getEnumConstantByName(annotationClazz, "PRESERVE");
            annotationNames.put(string28, annotation24);
            String string29 = "preserveTry";
            Object annotation25 = getEnumConstantByName(annotationClazz, "PRESERVE_TRY");
            annotationNames.put(string29, annotation25);
            String string30 = "private";
            Object annotation26 = getEnumConstantByName(annotationClazz, "PRIVATE");
            annotationNames.put(string30, annotation26);
            String string31 = "protected";
            Object annotation27 = getEnumConstantByName(annotationClazz, "PROTECTED");
            annotationNames.put(string31, annotation27);
            String string32 = "public";
            Object annotation28 = getEnumConstantByName(annotationClazz, "PUBLIC");
            annotationNames.put(string32, annotation28);
            String string33 = "return";
            Object annotation29 = getEnumConstantByName(annotationClazz, "RETURN");
            annotationNames.put(string33, annotation29);
            String string34 = "returns";
            annotationNames.put(string34, annotation29);
            String string35 = "see";
            Object annotation30 = getEnumConstantByName(annotationClazz, "SEE");
            annotationNames.put(string35, annotation30);
            String string36 = "suppress";
            Object annotation31 = getEnumConstantByName(annotationClazz, "SUPPRESS");
            annotationNames.put(string36, annotation31);
            String string37 = "template";
            Object annotation32 = getEnumConstantByName(annotationClazz, "TEMPLATE");
            annotationNames.put(string37, annotation32);
            String string38 = "this";
            Object annotation33 = getEnumConstantByName(annotationClazz, "THIS");
            annotationNames.put(string38, annotation33);
            String string39 = "throws";
            Object annotation34 = getEnumConstantByName(annotationClazz, "THROWS");
            annotationNames.put(string39, annotation34);
            String string40 = "type";
            Object annotation35 = getEnumConstantByName(annotationClazz, "TYPE");
            annotationNames.put(string40, annotation35);
            String string41 = "typedef";
            Object annotation36 = getEnumConstantByName(annotationClazz, "TYPEDEF");
            annotationNames.put(string41, annotation36);
            String string42 = "version";
            Object annotation37 = getEnumConstantByName(annotationClazz, "VERSION");
            annotationNames.put(string42, annotation37);
            String string43 = "exception";
            Object annotation38 = getEnumConstantByName(annotationClazz, "NOT_IMPLEMENTED");
            annotationNames.put(string43, annotation38);
            String string44 = "mods";
            annotationNames.put(string44, annotation38);
            String string45 = "addon";
            annotationNames.put(string45, annotation38);
            String string46 = "lends";
            annotationNames.put(string46, annotation38);
            String string47 = "link";
            annotationNames.put(string47, annotation38);
            String string48 = "description";
            annotationNames.put(string48, annotation38);
            String string49 = "constructs";
            annotationNames.put(string49, annotation38);
            String string50 = "example";
            annotationNames.put(string50, annotation38);
            String string51 = "default";
            annotationNames.put(string51, annotation38);
            String string52 = "borrows";
            annotationNames.put(string52, annotation38);
            String string53 = "function";
            annotationNames.put(string53, annotation38);
            String string54 = "member";
            annotationNames.put(string54, annotation38);
            String string55 = "property";
            annotationNames.put(string55, annotation38);
            String string56 = "ignore";
            annotationNames.put(string56, annotation38);
            String string57 = "id";
            annotationNames.put(string57, annotation38);
            String string58 = "memberOf";
            annotationNames.put(string58, annotation38);
            String string59 = "event";
            annotationNames.put(string59, annotation38);
            String string60 = "class";
            annotationNames.put(string60, annotation38);
            String string61 = "static";
            annotationNames.put(string61, annotation38);
            String string62 = "inner";
            annotationNames.put(string62, annotation38);
            String string63 = "field";
            annotationNames.put(string63, annotation38);
            String string64 = "bug";
            annotationNames.put(string64, annotation38);
            String string65 = "name";
            annotationNames.put(string65, annotation38);
            String string66 = "namespace";
            annotationNames.put(string66, annotation38);
            String string67 = "modName";
            annotationNames.put(string67, annotation38);
            String string68 = "config";
            annotationNames.put(string68, annotation38);
            String string69 = "exec";
            annotationNames.put(string69, annotation38);
            String string70 = "augments";
            annotationNames.put(string70, annotation38);
            String string71 = "base";
            annotationNames.put(string71, annotation38);
            String string72 = "requires";
            annotationNames.put(string72, annotation38);
            String string73 = "since";
            annotationNames.put(string73, annotation38);
            String string74 = "supported";
            annotationNames.put(string74, annotation38);
            setField(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames", annotationNames);
            
            JSTypeRegistry expectedRegistry = ((JSTypeRegistry) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "registry"));
            JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "registry"));
            ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            assertNull(actualRegistryReporter);
            
            com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            assertNull(actualRegistryNativeTypes);
            
            Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertNull(actualRegistryNamesToTypes);
            
            Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertNull(actualRegistryNamespaces);
            
            Set actualRegistryEnumTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertNull(actualRegistryEnumTypeNames);
            
            Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertNull(actualRegistryForwardDeclaredTypes);
            
            Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertNull(actualRegistryTypesIndexedByProperty);
            
            Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertNull(actualRegistryGreatestSubtypeByProperty);
            
            Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            assertNull(actualRegistryInterfaceToImplementors);
            
            Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            assertNull(actualRegistryUnresolvedNamedTypes);
            
            Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertNull(actualRegistryResolvedNamedTypes);
            
            boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertFalse(actualRegistryLastGeneration);
            
            String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualRegistryTemplateTypeName);
            
            TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualRegistryTemplateType);
            
            boolean actualParseJsDocDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "parseJsDocDocumentation"));
            assertFalse(actualParseJsDocDocumentation);
            
            boolean actualIsIdeMode = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "isIdeMode"));
            assertFalse(actualIsIdeMode);
            
            Map expectedAnnotationNames = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
            Map actualAnnotationNames = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.parsing.Config", "annotationNames"));
            assertTrue(deepEquals(expectedAnnotationNames, actualAnnotationNames));
            
            Config finalCompilerParserConfig = ((Config) getFieldValue(compiler, "com.google.javascript.jscomp.Compiler", "parserConfig"));
            
            assertFalse(initialCompilerParserConfig == finalCompilerParserConfig);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getParserConfig()
    
    @Test
    public void testGetParserConfig3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getParserConfig] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.isIdeMode(Compiler.java:1440)
            com.google.javascript.jscomp.Compiler.getParserConfig(Compiler.java:1447) */
        compiler.getParserConfig();
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
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
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
        LoggerErrorManager errorManager = ((LoggerErrorManager) createInstance("com.google.javascript.jscomp.LoggerErrorManager"));
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSourceLine(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link Compiler}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Compiler#getSourceLine(java.lang.String,int)}
 * @utbot.executesCondition {@code (lineNumber < 1): False}
 * @utbot.invokes com.google.javascript.jscomp.Compiler#getSourceFileByName(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SourceFile input = getSourceFileByName(sourceName);
 *  */
    @Test
    public void testGetSourceLine_ThrowNullPointerException() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.Compiler.getSourceLine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1536)
            com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1546) */
        compiler.getSourceLine(null, 1);
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
            com.google.javascript.jscomp.Compiler.getErrorCount(Compiler.java:1499) */
        compiler.getErrorCount();
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
            com.google.javascript.jscomp.Compiler.getWarningCount(Compiler.java:1506) */
        compiler.getWarningCount();
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
            com.google.javascript.jscomp.Compiler.addToDebugLog(Compiler.java:1530) */
        compiler.addToDebugLog(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addToDebugLog(java.lang.String)
    
    @Test
    public void testAddToDebugLog1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        StringBuilder debugLog = new StringBuilder("");
        setField(compiler, "com.google.javascript.jscomp.Compiler", "debugLog", debugLog);
        
        compiler.addToDebugLog(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields937870169998500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields937870169998500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass937870170004000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields937870169998500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass937870170004000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields937870170868200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields937870170868200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass937870170870200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields937870170868200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass937870170870200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields937870176167700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields937870176167700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass937870176169200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields937870176167700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass937870176169200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields937870176590900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields937870176590900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass937870176592200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields937870176590900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass937870176592200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

