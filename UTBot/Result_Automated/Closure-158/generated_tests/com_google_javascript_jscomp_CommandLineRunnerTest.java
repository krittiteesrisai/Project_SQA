package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig;
import java.util.ArrayList;
import java.util.List;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import com.google.common.base.Supplier;
import org.junit.Ignore;
import java.io.PrintStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_CommandLineRunnerTest {
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.processArgs
    
    ///region Errors report for processArgs
    
    public void testProcessArgs_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.createExterns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createExterns()
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createExterns()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createExterns()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CommandLineRunner.Flags#access$4200(com.google.javascript.jscomp.CommandLineRunner.Flags)}
 * @utbot.returnsFrom {@code return externs;}
 *  */
    @Test
    public void testCreateExterns_CommandLineRunnerAccess$4200() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        Object flags = createInstance("com.google.javascript.jscomp.CommandLineRunner$Flags");
        setField(flags, "com.google.javascript.jscomp.CommandLineRunner$Flags", "use_only_custom_externs", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.CommandLineRunner", "flags", flags);
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList externs = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "externs", externs);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        List actual = commandLineRunner.createExterns();
        
        List expected = new ArrayList();
        JSSourceFile jSSourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.Preloaded referenced = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "/dev/null";
        setField(referenced, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        referenced.setOriginalPath(fileName);
        setField(referenced, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        String code = "";
        setField(referenced, "com.google.javascript.jscomp.SourceFile", "code", code);
        setField(jSSourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        setField(jSSourceFile, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(jSSourceFile, "com.google.javascript.jscomp.SourceFile", "lastLine", 1);
        expected.add(jSSourceFile);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
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
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.ClassCastException: class com.google.javascript.rhino.Node cannot be cast to class java.util.List (com.google.javascript.rhino.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db; java.util.List is in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:789)
            com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:597) */
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
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:789)
            com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:597) */
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
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs(AbstractCommandLineRunner.java:375)
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:790)
            com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:597) */
        commandLineRunner.createExterns();
    }
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createExterns()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateExterns_ThrowNullPointerException_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList externs = new ArrayList();
        String string = "";
        externs.add(string);
        externs.add(null);
        externs.add(null);
        externs.add(null);
        externs.add(null);
        externs.add(null);
        externs.add(null);
        externs.add(null);
        externs.add(null);
        externs.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "externs", externs);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            com.google.javascript.jscomp.SourceFile.fromFile(SourceFile.java:241)
            com.google.javascript.jscomp.JSSourceFile.fromFile(JSSourceFile.java:39)
            com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs(AbstractCommandLineRunner.java:335)
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs(AbstractCommandLineRunner.java:379)
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:790)
            com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:597) */
        commandLineRunner.createExterns();
    }
    ///endregion
    
    ///region Errors report for createExterns
    
    public void testCreateExterns_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.processFlagFile
    
    ///region OTHER: SECURITY for method processFlagFile(java.io.PrintStream)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testProcessFlagFile1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        Object flags = createInstance("com.google.javascript.jscomp.CommandLineRunner$Flags");
        String flag_file = "\u0400\u0800";
        setField(flags, "com.google.javascript.jscomp.CommandLineRunner$Flags", "flag_file", flag_file);
        setField(commandLineRunner, "com.google.javascript.jscomp.CommandLineRunner", "flags", flags);
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.processFlagFile] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "Ѐࠀ" "read")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkRead(SecurityManager.java:756)
            java.base/java.io.File.length(File.java:999)
            com.google.common.io.Files.toByteArray(Files.java:187)
            com.google.common.io.Files.toString(Files.java:216)
            com.google.javascript.jscomp.CommandLineRunner.processFlagFile(CommandLineRunner.java:475) */
    }
    ///endregion
    
    ///region Errors report for processFlagFile
    
    public void testProcessFlagFile_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
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
            ThreadLocal threadContexts = ((ThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal$1"));
            setStaticField(contextClazz, "threadContexts", threadContexts);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createCompiler] produces [java.lang.ClassCastException: class java.util.Collections$SetFromMap cannot be cast to class com.google.javascript.rhino.Context (java.util.Collections$SetFromMap is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.Context is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
                com.google.javascript.rhino.Context.getCurrentContext(Context.java:400)
                com.google.javascript.rhino.ScriptRuntime.getMessage(ScriptRuntime.java:461)
                com.google.javascript.rhino.ScriptRuntime.getMessage0(ScriptRuntime.java:422)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:79)
                com.google.javascript.jscomp.RhinoErrorReporter.<init>(RhinoErrorReporter.java:33)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:144)
                com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.<init>(RhinoErrorReporter.java:140)
                com.google.javascript.jscomp.RhinoErrorReporter.forOldRhino(RhinoErrorReporter.java:109)
                com.google.javascript.jscomp.Compiler.<init>(Compiler.java:146)
                com.google.javascript.jscomp.CommandLineRunner.createCompiler(CommandLineRunner.java:591) */
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
        // 13 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
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
                com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns(CommandLineRunner.java:665) */
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
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
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
            com.google.javascript.jscomp.CommandLineRunner.main(CommandLineRunner.java:706) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields914750229813100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields914750229813100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass914750229818700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914750229813100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914750229818700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields914750237171800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields914750237171800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass914750237177200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914750237171800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914750237177200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields914750237856300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields914750237856300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass914750237859700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914750237856300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914750237859700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

