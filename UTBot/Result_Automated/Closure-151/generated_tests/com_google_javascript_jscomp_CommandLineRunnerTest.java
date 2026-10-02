package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Ignore;
import java.io.IOException;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig;
import jdk.internal.misc.TerminatingThreadLocal;
import java.io.PrintStream;
import java.security.AccessControlContext;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_CommandLineRunnerTest {
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.main
    
    ///region FUZZER: SECURITY for method main([Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#main(java.lang.String[])}
     */
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testMainWithNonEmptyObjectArray() {
        java.lang.String[] stringArray = {"XZ", "\n\t\r", "-3"};
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.main] produces [java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "exitVM.-1")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkExit(SecurityManager.java:629)
            java.base/java.lang.Runtime.exit(Runtime.java:113)
            java.base/java.lang.System.exit(System.java:1864)
            com.google.javascript.jscomp.CommandLineRunner.main(CommandLineRunner.java:593) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.shouldRunCompiler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldRunCompiler()
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#shouldRunCompiler()}
 * @utbot.returnsFrom {@code return this.isConfigValid;}
 *  */
    @Test
    public void testShouldRunCompiler_ReturnThisIsConfigValid() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        boolean actual = commandLineRunner.shouldRunCompiler();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefaultExterns()
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#getDefaultExterns()}
 * @utbot.invokes {@link java.lang.Class#getResourceAsStream(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: InputStream input = CommandLineRunner.class.getResourceAsStream("/externs.zip");
 *  */
    @Test
    public void testGetDefaultExterns_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, IOException  {
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(vMClazz, "initLevel", 3);
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns] produces [java.lang.NullPointerException: in is null]
                java.base/java.util.zip.ZipInputStream.<init>(ZipInputStream.java:103)
                java.base/java.util.zip.ZipInputStream.<init>(ZipInputStream.java:82)
                com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns(CommandLineRunner.java:552) */
            CommandLineRunner.getDefaultExterns();
        } finally {
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    ///endregion
    
    ///region Errors report for getDefaultExterns
    
    public void testGetDefaultExterns_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.createOptions
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createOptions()
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: level.setOptionsForCompilationLevel(options);
 *  */
    @Test
    public void testCreateOptions_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        Object flags = createInstance("com.google.javascript.jscomp.CommandLineRunner$Flags");
        CompilationLevel compilation_level = CompilationLevel.WHITESPACE_ONLY;
        setField(flags, "com.google.javascript.jscomp.CommandLineRunner$Flags", "compilation_level", compilation_level);
        setField(commandLineRunner, "com.google.javascript.jscomp.CommandLineRunner", "flags", flags);
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CommandLineRunner.createOptions(CommandLineRunner.java:469) */
        commandLineRunner.createOptions();
    }
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createOptions()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: level.setOptionsForCompilationLevel(options);
 *  */
    @Test
    public void testCreateOptions_ThrowNullPointerException_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        Object flags = createInstance("com.google.javascript.jscomp.CommandLineRunner$Flags");
        CompilationLevel compilation_level = CompilationLevel.ADVANCED_OPTIMIZATIONS;
        setField(flags, "com.google.javascript.jscomp.CommandLineRunner$Flags", "compilation_level", compilation_level);
        setField(commandLineRunner, "com.google.javascript.jscomp.CommandLineRunner", "flags", flags);
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createOptions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CommandLineRunner.createOptions(CommandLineRunner.java:469) */
        commandLineRunner.createOptions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.createExterns
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createExterns()
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createExterns()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<JSSourceFile> externs = super.createExterns();
 *  */
    @Test
    public void testCreateExterns_ThrowClassCastException_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode", true);
        Supplier externsSupplierForTesting = ((Supplier) createInstance("com.google.javascript.jscomp.AstParallelizer$3"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "externsSupplierForTesting", externsSupplierForTesting);
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.ClassCastException: class com.google.javascript.rhino.Node cannot be cast to class java.util.List (com.google.javascript.rhino.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b; java.util.List is in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:748)
            com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:486) */
        commandLineRunner.createExterns();
    }
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createExterns()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<JSSourceFile> externs = super.createExterns();
 *  */
    @Test
    public void testCreateExterns_ThrowClassCastException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode", true);
        Supplier externsSupplierForTesting = ((Supplier) createInstance("com.google.javascript.jscomp.Compiler$4"));
        Compiler val$self = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(val$self, "com.google.javascript.jscomp.Compiler", "uniqueNameId", Integer.MIN_VALUE);
        setField(externsSupplierForTesting, "com.google.javascript.jscomp.Compiler$4", "val$self", val$self);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "externsSupplierForTesting", externsSupplierForTesting);
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:748)
            com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:486) */
        commandLineRunner.createExterns();
    }
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createExterns()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<JSSourceFile> externs = super.createExterns();
 *  */
    @Test
    public void testCreateExterns_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs(AbstractCommandLineRunner.java:344)
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:749)
            com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:486) */
        commandLineRunner.createExterns();
    }
    ///endregion
    
    ///region Errors report for createExterns
    
    public void testCreateExterns_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
        // 7 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.createCompiler
    
    ///region OTHER: ERROR SUITE for method createCompiler()
    
    @Test
    public void testCreateCompiler1() throws Exception  {
        Class contextClazz = Class.forName("com.google.javascript.rhino.Context");
        ThreadLocal prevThreadContexts = ((ThreadLocal) getStaticFieldValue(contextClazz, "threadContexts"));
        try {
            TerminatingThreadLocal threadContexts = ((TerminatingThreadLocal) createInstance("sun.nio.ch.Util$1"));
            setStaticField(contextClazz, "threadContexts", threadContexts);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            PrintStream err = ((PrintStream) createInstance("java.io.PrintStream"));
            setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "err", err);
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createCompiler] produces [java.lang.ClassCastException: class sun.nio.ch.Util$BufferCache cannot be cast to class com.google.javascript.rhino.Context (sun.nio.ch.Util$BufferCache is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.Context is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
                com.google.javascript.rhino.Context.getCurrentContext(Context.java:400)
                com.google.javascript.rhino.ScriptRuntime.getMessage(ScriptRuntime.java:461)
                com.google.javascript.rhino.ScriptRuntime.getMessage0(ScriptRuntime.java:422)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:76)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:33)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:137)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:133)
                com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(RhinoErrorReporter.java:102)
                com.google.javascript.jscomp.Compiler.<init>(Compiler.java:140)
                com.google.javascript.jscomp.CommandLineRunner.createCompiler(CommandLineRunner.java:480) */
            commandLineRunner.createCompiler();
        } finally {
            setStaticField(com.google.javascript.rhino.Context.class, "threadContexts", prevThreadContexts);
        }
    }
    
    @Test
    public void testCreateCompiler2() throws Exception  {
        Class contextClazz = Class.forName("com.google.javascript.rhino.Context");
        ThreadLocal prevThreadContexts = ((ThreadLocal) getStaticFieldValue(contextClazz, "threadContexts"));
        try {
            Object threadContexts = createInstance("org.apache.tools.ant.taskdefs.Definer$ResourceStack");
            setStaticField(contextClazz, "threadContexts", threadContexts);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            PrintStream err = ((PrintStream) createInstance("java.io.PrintStream"));
            setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "err", err);
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createCompiler] produces [java.lang.ClassCastException: class java.util.HashMap cannot be cast to class com.google.javascript.rhino.Context (java.util.HashMap is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.Context is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
                com.google.javascript.rhino.Context.getCurrentContext(Context.java:400)
                com.google.javascript.rhino.ScriptRuntime.getMessage(ScriptRuntime.java:461)
                com.google.javascript.rhino.ScriptRuntime.getMessage0(ScriptRuntime.java:422)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:76)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:33)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:137)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:133)
                com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(RhinoErrorReporter.java:102)
                com.google.javascript.jscomp.Compiler.<init>(Compiler.java:140)
                com.google.javascript.jscomp.CommandLineRunner.createCompiler(CommandLineRunner.java:480) */
            commandLineRunner.createCompiler();
        } finally {
            setStaticField(com.google.javascript.rhino.Context.class, "threadContexts", prevThreadContexts);
        }
    }
    
    @Test
    public void testCreateCompiler3() throws Exception  {
        Class contextClazz = Class.forName("com.google.javascript.rhino.Context");
        ThreadLocal prevThreadContexts = ((ThreadLocal) getStaticFieldValue(contextClazz, "threadContexts"));
        try {
            Object threadContexts = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            setStaticField(contextClazz, "threadContexts", threadContexts);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            PrintStream err = ((PrintStream) createInstance("java.io.PrintStream"));
            setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "err", err);
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createCompiler] produces [java.lang.NullPointerException]
                java.base/java.lang.ThreadLocal$SuppliedThreadLocal.initialValue(ThreadLocal.java:305)
                java.base/java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:195)
                java.base/java.lang.ThreadLocal.get(ThreadLocal.java:172)
                com.google.javascript.rhino.Context.getCurrentContext(Context.java:400)
                com.google.javascript.rhino.ScriptRuntime.getMessage(ScriptRuntime.java:461)
                com.google.javascript.rhino.ScriptRuntime.getMessage0(ScriptRuntime.java:422)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:76)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:33)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:137)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:133)
                com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(RhinoErrorReporter.java:102)
                com.google.javascript.jscomp.Compiler.<init>(Compiler.java:140)
                com.google.javascript.jscomp.CommandLineRunner.createCompiler(CommandLineRunner.java:480) */
            commandLineRunner.createCompiler();
        } finally {
            setStaticField(com.google.javascript.rhino.Context.class, "threadContexts", prevThreadContexts);
        }
    }
    
    @Test
    public void testCreateCompiler4() throws Exception  {
        Class contextClazz = Class.forName("com.google.javascript.rhino.Context");
        ThreadLocal prevThreadContexts = ((ThreadLocal) getStaticFieldValue(contextClazz, "threadContexts"));
        try {
            Object threadContexts = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            Object supplier = createInstance("java.util.ServiceLoader$ProviderImpl");
            AccessControlContext acc = ((AccessControlContext) createInstance("java.security.AccessControlContext"));
            setField(supplier, "java.util.ServiceLoader$ProviderImpl", "acc", acc);
            setField(threadContexts, "java.lang.ThreadLocal$SuppliedThreadLocal", "supplier", supplier);
            setStaticField(contextClazz, "threadContexts", threadContexts);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            PrintStream err = ((PrintStream) createInstance("java.io.PrintStream"));
            setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "err", err);
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createCompiler] produces [java.lang.NullPointerException]
                java.base/java.util.ServiceLoader$ProviderImpl.newInstance(ServiceLoader.java:812)
                java.base/java.util.ServiceLoader$ProviderImpl.get(ServiceLoader.java:729)
                java.base/java.lang.ThreadLocal$SuppliedThreadLocal.initialValue(ThreadLocal.java:305)
                java.base/java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:195)
                java.base/java.lang.ThreadLocal.get(ThreadLocal.java:172)
                com.google.javascript.rhino.Context.getCurrentContext(Context.java:400)
                com.google.javascript.rhino.ScriptRuntime.getMessage(ScriptRuntime.java:461)
                com.google.javascript.rhino.ScriptRuntime.getMessage0(ScriptRuntime.java:422)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:76)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:33)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:137)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:133)
                com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(RhinoErrorReporter.java:102)
                com.google.javascript.jscomp.Compiler.<init>(Compiler.java:140)
                com.google.javascript.jscomp.CommandLineRunner.createCompiler(CommandLineRunner.java:480) */
            commandLineRunner.createCompiler();
        } finally {
            setStaticField(com.google.javascript.rhino.Context.class, "threadContexts", prevThreadContexts);
        }
    }
    
    @Test
    public void testCreateCompiler5() throws Exception  {
        Class contextClazz = Class.forName("com.google.javascript.rhino.Context");
        ThreadLocal prevThreadContexts = ((ThreadLocal) getStaticFieldValue(contextClazz, "threadContexts"));
        try {
            Object threadContexts = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            Object supplier = createInstance("java.util.ServiceLoader$ProviderImpl");
            Method factoryMethod = ((Method) createInstance("java.lang.reflect.Method"));
            setField(supplier, "java.util.ServiceLoader$ProviderImpl", "factoryMethod", factoryMethod);
            AccessControlContext acc = ((AccessControlContext) createInstance("java.security.AccessControlContext"));
            setField(supplier, "java.util.ServiceLoader$ProviderImpl", "acc", acc);
            setField(threadContexts, "java.lang.ThreadLocal$SuppliedThreadLocal", "supplier", supplier);
            setStaticField(contextClazz, "threadContexts", threadContexts);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createCompiler] produces [java.lang.NullPointerException]
                java.base/java.util.ServiceLoader.fail(ServiceLoader.java:586)
                java.base/java.util.ServiceLoader$ProviderImpl.invokeFactoryMethod(ServiceLoader.java:768)
                java.base/java.util.ServiceLoader$ProviderImpl.get(ServiceLoader.java:727)
                java.base/java.lang.ThreadLocal$SuppliedThreadLocal.initialValue(ThreadLocal.java:305)
                java.base/java.lang.ThreadLocal.setInitialValue(ThreadLocal.java:195)
                java.base/java.lang.ThreadLocal.get(ThreadLocal.java:172)
                com.google.javascript.rhino.Context.getCurrentContext(Context.java:400)
                com.google.javascript.rhino.ScriptRuntime.getMessage(ScriptRuntime.java:461)
                com.google.javascript.rhino.ScriptRuntime.getMessage0(ScriptRuntime.java:422)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:76)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:33)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:137)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:133)
                com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(RhinoErrorReporter.java:102)
                com.google.javascript.jscomp.Compiler.<init>(Compiler.java:140)
                com.google.javascript.jscomp.CommandLineRunner.createCompiler(CommandLineRunner.java:480) */
            commandLineRunner.createCompiler();
        } finally {
            setStaticField(com.google.javascript.rhino.Context.class, "threadContexts", prevThreadContexts);
        }
    }
    ///endregion
    
    ///region Errors report for createCompiler
    
    public void testCreateCompiler_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 37 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.initConfigFromFlags
    
    ///region Errors report for initConfigFromFlags
    
    public void testInitConfigFromFlags_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields939825119544900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields939825119544900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass939825119551900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields939825119544900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass939825119551900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields939825120815300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields939825120815300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass939825120819600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields939825120815300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass939825120819600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields939825121971000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields939825121971000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass939825121973500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields939825121971000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass939825121973500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

