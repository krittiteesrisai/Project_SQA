package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Ignore;
import com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig;
import java.util.ArrayList;
import java.util.List;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Set;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.text.MessageFormat;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import java.util.HashMap;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.NoType;
import java.util.HashSet;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ArrayListMultimap;
import com.google.javascript.jscomp.CodeChangeHandler.RecentChange;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import java.io.PrintStream;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import java.util.Collection;
import com.google.javascript.rhino.jstype.TemplateType;
import java.util.Formatter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
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
            com.google.javascript.jscomp.CommandLineRunner.main(CommandLineRunner.java:482) */
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
            com.google.javascript.jscomp.CommandLineRunner.createOptions(CommandLineRunner.java:429) */
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
            com.google.javascript.jscomp.CommandLineRunner.createOptions(CommandLineRunner.java:429) */
        commandLineRunner.createOptions();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.createExterns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createExterns()
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createExterns()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createExterns()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CommandLineRunner.Flags#access$3400(com.google.javascript.jscomp.CommandLineRunner.Flags)}
 * @utbot.returnsFrom {@code return externs;}
 *  */
    @Test
    public void testCreateExterns_CommandLineRunnerAccess$3400() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<JSSourceFile> externs = super.createExterns();
 *  */
    @Test
    public void testCreateExterns_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs(AbstractCommandLineRunner.java:274)
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:655)
            com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:449) */
        commandLineRunner.createExterns();
    }
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createExterns()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CommandLineRunner.Flags#access$3400(com.google.javascript.jscomp.CommandLineRunner.Flags)}
 * @utbot.invokes com.google.javascript.jscomp.CommandLineRunner#getDefaultExterns()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<JSSourceFile> defaultExterns = getDefaultExterns();
 *  */
    @Test
    public void testCreateExterns_ThrowNullPointerException_1() throws Exception  {
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(vMClazz, "initLevel", 3);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            Object flags = createInstance("com.google.javascript.jscomp.CommandLineRunner$Flags");
            setField(commandLineRunner, "com.google.javascript.jscomp.CommandLineRunner", "flags", flags);
            AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
            ArrayList externs = new ArrayList();
            setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "externs", externs);
            setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.NullPointerException: in is null]
                java.base/java.util.zip.ZipInputStream.<init>(ZipInputStream.java:103)
                java.base/java.util.zip.ZipInputStream.<init>(ZipInputStream.java:82)
                com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns(CommandLineRunner.java:466)
                com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:451) */
            commandLineRunner.createExterns();
        } finally {
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createExterns()
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createExterns()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createExterns()}
 * @utbot.throwsException {@link com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException} in: List<JSSourceFile> externs = super.createExterns();
 *  */
    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateExterns_ThrowFlagUsageException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList externs = new ArrayList();
        String string = "-";
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
        
        commandLineRunner.createExterns();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createExterns()
    
    @Test
    public void testCreateExterns1() throws Exception  {
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Charset prevInputCharset = ((Charset) getStaticFieldValue(abstractCommandLineRunnerClazz, "inputCharset"));
        try {
            setStaticField(abstractCommandLineRunnerClazz, "inputCharset", null);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
            ArrayList externs = new ArrayList();
            String string = "\\\u0000";
            externs.add(string);
            setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "externs", externs);
            setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.CommandLineRunner$Flags.access$3400(CommandLineRunner.java:77)
                com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:450) */
            commandLineRunner.createExterns();
        } finally {
            setStaticField(AbstractCommandLineRunner.class, "inputCharset", prevInputCharset);
        }
    }
    
    @Test
    public void testCreateExterns2() throws Exception  {
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Charset prevInputCharset = ((Charset) getStaticFieldValue(abstractCommandLineRunnerClazz, "inputCharset"));
        try {
            setStaticField(abstractCommandLineRunnerClazz, "inputCharset", null);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
            ArrayList externs = new ArrayList();
            String string = "/\u0000";
            externs.add(string);
            externs.add(null);
            setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "externs", externs);
            setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
            
            /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.createExterns] produces [java.lang.NullPointerException]
                java.base/java.io.File.<init>(File.java:278)
                com.google.javascript.jscomp.SourceFile.fromFile(SourceFile.java:224)
                com.google.javascript.jscomp.JSSourceFile.fromFile(JSSourceFile.java:39)
                com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs(AbstractCommandLineRunner.java:237)
                com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs(AbstractCommandLineRunner.java:278)
                com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns(AbstractCommandLineRunner.java:655)
                com.google.javascript.jscomp.CommandLineRunner.createExterns(CommandLineRunner.java:449) */
            commandLineRunner.createExterns();
        } finally {
            setStaticField(AbstractCommandLineRunner.class, "inputCharset", prevInputCharset);
        }
    }
    ///endregion
    
    ///region Errors report for createExterns
    
    public void testCreateExterns_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CommandLineRunner.createCompiler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createCompiler()
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createCompiler()}
 *  */
    @Test
    public void testCreateCompiler() throws Exception  {
        Class contextClazz = Class.forName("com.google.javascript.rhino.Context");
        ThreadLocal prevThreadContexts = ((ThreadLocal) getStaticFieldValue(contextClazz, "threadContexts"));
        try {
        /* This block of code is 1352 lines long and could lead to compilation error
            ThreadLocal threadContexts = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(threadContexts, "java.lang.ThreadLocal", "threadLocalHashCode", 8339);
            setStaticField(contextClazz, "threadContexts", threadContexts);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            
            Compiler actual = commandLineRunner.createCompiler();
            
            Compiler expected = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            setField(expected, "com.google.javascript.jscomp.Compiler", "useThreads", true);
            StringBuilder debugLog = ((StringBuilder) createInstance("java.lang.StringBuilder"));
            setField(expected, "com.google.javascript.jscomp.Compiler", "debugLog", debugLog);
            GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
            Set propertyTestFunctions = new LinkedHashSet();
            String string = "goog.isDef";
            propertyTestFunctions.add(string);
            String string1 = "goog.isNull";
            propertyTestFunctions.add(string1);
            String string2 = "goog.isDefAndNotNull";
            propertyTestFunctions.add(string2);
            String string3 = "goog.isString";
            propertyTestFunctions.add(string3);
            String string4 = "goog.isNumber";
            propertyTestFunctions.add(string4);
            String string5 = "goog.isBoolean";
            propertyTestFunctions.add(string5);
            String string6 = "goog.isFunction";
            propertyTestFunctions.add(string6);
            String string7 = "goog.isArray";
            propertyTestFunctions.add(string7);
            String string8 = "goog.isObject";
            propertyTestFunctions.add(string8);
            setField(defaultCodingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions", propertyTestFunctions);
            setField(expected, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
            JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            Object reporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter");
            Map typeMap = new LinkedHashMap();
            String string9 = "\\Qextra @fileoverview tag\\E";
            DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            String key = "JSC_EXTRA_FILEOVERVIEW";
            setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "key", key);
            MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
            setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
            CheckLevel defaultLevel = CheckLevel.WARNING;
            setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
            diagnosticType.level = defaultLevel;
            typeMap.put(string9, diagnosticType);
            String string10 = "\\QTrailing comma is not legal in an ECMA-262 object initializer\\E";
            DiagnosticType diagnosticType1 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            String key1 = "JSC_TRAILING_COMMA";
            setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "key", key1);
            MessageFormat format1 = ((MessageFormat) createInstance("java.text.MessageFormat"));
            setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "format", format1);
            CheckLevel defaultLevel1 = CheckLevel.ERROR;
            setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
            diagnosticType1.level = defaultLevel1;
            typeMap.put(string10, diagnosticType1);
            String string11 = "\\QDuplicate parameter name \"\\E.*\\Q\".\\E";
            DiagnosticType diagnosticType2 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            String key2 = "JSC_DUPLICATE_PARAM";
            setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "key", key2);
            MessageFormat format2 = ((MessageFormat) createInstance("java.text.MessageFormat"));
            setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "format", format2);
            setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
            diagnosticType2.level = defaultLevel1;
            typeMap.put(string11, diagnosticType2);
            String string12 = "\\Qillegal use of unknown JSDoc tag \"\\E.*\\Q\"; ignoring it\\E";
            DiagnosticType diagnosticType3 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            String key3 = "JSC_BAD_JSDOC_ANNOTATION";
            setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "key", key3);
            MessageFormat format3 = ((MessageFormat) createInstance("java.text.MessageFormat"));
            setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "format", format3);
            setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
            diagnosticType3.level = defaultLevel;
            typeMap.put(string12, diagnosticType3);
            setField(reporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap", typeMap);
            setField(reporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler", expected);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[54];
            InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
            setField(constructor, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", typeRegistry);
            Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters.setType(83);
            Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters, "com.google.javascript.rhino.Node", "first", first);
            Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters, "com.google.javascript.rhino.Node", "last", last);
            setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType);
            setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
            FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor);
            HashMap properties = new HashMap();
            setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
            InstanceObjectType implicitPrototype = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            setField(implicitPrototype, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
            HashMap properties1 = new HashMap();
            setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
            setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(implicitPrototype, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
            Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
            Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
            setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
            List implementedInterfaces = new ArrayList();
            constructor.setImplementedInterfaces(implementedInterfaces);
            String className = "Array";
            setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
            HashMap properties2 = new HashMap();
            setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
            setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
            HashMap properties3 = new HashMap();
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[0] = ((JSType) instanceObjectType);
            nativeTypes[1] = ((JSType) constructor);
            BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
            setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[2] = ((JSType) booleanType);
            InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call1 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters1.setType(83);
            Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
            Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters1, "com.google.javascript.rhino.Node", "last", last1);
            setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
            setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType);
            setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
            FunctionPrototypeType prototype1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype1, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor2);
            HashMap properties4 = new HashMap();
            setField(prototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
            setField(prototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype1);
            setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
            List implementedInterfaces1 = new ArrayList();
            constructor2.setImplementedInterfaces(implementedInterfaces1);
            String className1 = "Boolean";
            setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
            HashMap properties5 = new HashMap();
            setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
            setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
            HashMap properties6 = new HashMap();
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[3] = ((JSType) instanceObjectType1);
            nativeTypes[4] = ((JSType) constructor2);
            UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
            setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
            setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[5] = ((JSType) unknownType);
            InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call2 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters2.setType(83);
            Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
            Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters2, "com.google.javascript.rhino.Node", "last", last2);
            setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
            StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
            setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
            FunctionPrototypeType prototype2 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype2, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor3);
            HashMap properties7 = new HashMap();
            setField(prototype2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
            setField(prototype2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype2);
            setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
            List implementedInterfaces2 = new ArrayList();
            constructor3.setImplementedInterfaces(implementedInterfaces2);
            String className2 = "Date";
            setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
            HashMap properties8 = new HashMap();
            setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
            setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(constructor3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(constructor3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
            HashMap properties9 = new HashMap();
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[6] = ((JSType) instanceObjectType2);
            nativeTypes[7] = ((JSType) constructor3);
            Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call3 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters3.setType(83);
            Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
            String str = "";
            setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first3)).setType(38);
            Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first3, "com.google.javascript.rhino.Node", "next", next);
            Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
            setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(first3, "com.google.javascript.rhino.Node", "jsType", jsType);
            setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
            setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
            Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) last3)).setType(38);
            Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
            setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            AllType jsType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(last3, "com.google.javascript.rhino.Node", "jsType", jsType1);
            setField(last3, "com.google.javascript.rhino.Node", "parent", parameters3);
            setField(parameters3, "com.google.javascript.rhino.Node", "last", last3);
            setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
            InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType);
            HashMap properties10 = new HashMap();
            setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
            setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
            setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
            List implementedInterfaces3 = new ArrayList();
            (((FunctionType) errorFunctionType)).setImplementedInterfaces(implementedInterfaces3);
            ArrayList subTypes = new ArrayList();
            Object errorFunctionType1 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call4 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
            InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
            setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
            FunctionPrototypeType prototype3 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype3, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType1);
            HashMap properties11 = new HashMap();
            setField(prototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
            setField(prototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype3);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
            HashMap properties12 = new HashMap();
            setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
            List implementedInterfaces4 = new ArrayList();
            (((FunctionType) errorFunctionType1)).setImplementedInterfaces(implementedInterfaces4);
            String className3 = "EvalError";
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
            HashMap properties13 = new HashMap();
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType1);
            Object errorFunctionType2 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call5 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
            InstanceObjectType returnType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
            setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
            FunctionPrototypeType prototype4 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype4, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType2);
            HashMap properties14 = new HashMap();
            setField(prototype4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
            setField(prototype4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype4);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
            HashMap properties15 = new HashMap();
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
            List implementedInterfaces5 = new ArrayList();
            (((FunctionType) errorFunctionType2)).setImplementedInterfaces(implementedInterfaces5);
            String className4 = "RangeError";
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
            HashMap properties16 = new HashMap();
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType2);
            Object errorFunctionType3 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call6 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
            InstanceObjectType returnType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
            setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
            FunctionPrototypeType prototype5 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype5, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType3);
            HashMap properties17 = new HashMap();
            setField(prototype5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
            setField(prototype5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype5);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
            HashMap properties18 = new HashMap();
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
            List implementedInterfaces6 = new ArrayList();
            (((FunctionType) errorFunctionType3)).setImplementedInterfaces(implementedInterfaces6);
            String className5 = "ReferenceError";
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
            HashMap properties19 = new HashMap();
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType3);
            Object errorFunctionType4 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call7 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
            InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
            setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
            FunctionPrototypeType prototype6 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype6, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType4);
            HashMap properties20 = new HashMap();
            setField(prototype6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
            setField(prototype6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype6, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype6);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
            HashMap properties21 = new HashMap();
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
            List implementedInterfaces7 = new ArrayList();
            (((FunctionType) errorFunctionType4)).setImplementedInterfaces(implementedInterfaces7);
            String className6 = "SyntaxError";
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
            HashMap properties22 = new HashMap();
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType4);
            Object errorFunctionType5 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call8 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
            InstanceObjectType returnType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
            setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
            FunctionPrototypeType prototype7 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype7, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType5);
            HashMap properties23 = new HashMap();
            setField(prototype7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
            setField(prototype7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype7, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype7);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
            HashMap properties24 = new HashMap();
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
            List implementedInterfaces8 = new ArrayList();
            (((FunctionType) errorFunctionType5)).setImplementedInterfaces(implementedInterfaces8);
            String className7 = "TypeError";
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
            HashMap properties25 = new HashMap();
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType5);
            Object errorFunctionType6 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call9 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
            InstanceObjectType returnType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
            setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
            FunctionPrototypeType prototype8 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype8, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType6);
            HashMap properties26 = new HashMap();
            setField(prototype8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
            setField(prototype8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype8, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype8);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
            HashMap properties27 = new HashMap();
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
            List implementedInterfaces9 = new ArrayList();
            (((FunctionType) errorFunctionType6)).setImplementedInterfaces(implementedInterfaces9);
            String className8 = "URIError";
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
            HashMap properties28 = new HashMap();
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType6);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
            String className9 = "Error";
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
            HashMap properties29 = new HashMap();
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[8] = ((JSType) errorFunctionType);
            nativeTypes[9] = ((JSType) returnType1);
            nativeTypes[10] = ((JSType) errorFunctionType1);
            nativeTypes[11] = ((JSType) typeOfThis);
            FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call10 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters10.setType(83);
            Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first4)).setType(38);
            Object propListHead2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
            setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            AllType jsType2 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(first4, "com.google.javascript.rhino.Node", "jsType", jsType2);
            setField(first4, "com.google.javascript.rhino.Node", "parent", parameters10);
            setField(parameters10, "com.google.javascript.rhino.Node", "first", first4);
            setField(parameters10, "com.google.javascript.rhino.Node", "last", first4);
            setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
            UnknownType returnType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
            setField(returnType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(returnType8, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
            setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
            FunctionPrototypeType prototype9 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype9, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType);
            HashMap properties30 = new HashMap();
            setField(prototype9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
            setField(prototype9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype9, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype9);
            setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$3", "this$0", typeRegistry);
            Object call11 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters11.setType(83);
            Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters11, "com.google.javascript.rhino.Node", "first", first5);
            Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters11, "com.google.javascript.rhino.Node", "last", last4);
            setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
            setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
            setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
            Object leastSupertypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
            setField(leastSupertypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor", "this$0", typeOfThis7);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor", leastSupertypeVisitor);
            Object greatestSubtypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
            setField(greatestSubtypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", typeOfThis7);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor", greatestSubtypeVisitor);
            Object call12 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
            setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", typeOfThis7);
            HashMap properties31 = new HashMap();
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
            List implementedInterfaces10 = new ArrayList();
            typeOfThis7.setImplementedInterfaces(implementedInterfaces10);
            HashMap properties32 = new HashMap();
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
            List implementedInterfaces11 = new ArrayList();
            typeOfThis6.setImplementedInterfaces(implementedInterfaces11);
            String className10 = "Function";
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
            HashMap properties33 = new HashMap();
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", prototype9);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
            List implementedInterfaces12 = new ArrayList();
            functionType.setImplementedInterfaces(implementedInterfaces12);
            setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
            HashMap properties34 = new HashMap();
            setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
            setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[12] = ((JSType) functionType);
            nativeTypes[13] = ((JSType) typeOfThis6);
            nativeTypes[14] = ((JSType) prototype9);
            NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
            setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[15] = ((JSType) nullType);
            NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
            setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[16] = ((JSType) numberType);
            InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call13 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters12.setType(83);
            Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters12, "com.google.javascript.rhino.Node", "first", first6);
            Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters12, "com.google.javascript.rhino.Node", "last", last5);
            setField(parameters12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
            setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
            setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
            FunctionPrototypeType prototype10 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype10, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor4);
            HashMap properties35 = new HashMap();
            setField(prototype10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
            setField(prototype10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype10, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype10);
            setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
            List implementedInterfaces13 = new ArrayList();
            constructor4.setImplementedInterfaces(implementedInterfaces13);
            String className11 = "Number";
            setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
            HashMap properties36 = new HashMap();
            setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
            setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
            HashMap properties37 = new HashMap();
            setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
            setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[17] = ((JSType) instanceObjectType3);
            nativeTypes[18] = ((JSType) constructor4);
            nativeTypes[19] = ((JSType) implicitPrototype);
            FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call14 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters13.setType(83);
            Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first7)).setType(38);
            Object propListHead3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
            setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            AllType jsType3 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(first7, "com.google.javascript.rhino.Node", "jsType", jsType3);
            setField(first7, "com.google.javascript.rhino.Node", "parent", parameters13);
            setField(parameters13, "com.google.javascript.rhino.Node", "first", first7);
            setField(parameters13, "com.google.javascript.rhino.Node", "last", first7);
            setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
            setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
            setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
            FunctionPrototypeType prototype11 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype11, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType1);
            HashMap properties38 = new HashMap();
            setField(prototype11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
            FunctionPrototypeType implicitPrototype1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            HashMap properties39 = new HashMap();
            setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
            setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(implicitPrototype1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(prototype11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype1);
            setField(prototype11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype11, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype11);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototype);
            List implementedInterfaces14 = new ArrayList();
            functionType1.setImplementedInterfaces(implementedInterfaces14);
            ArrayList subTypes1 = new ArrayList();
            subTypes1.add(functionType);
            subTypes1.add(constructor);
            subTypes1.add(constructor2);
            subTypes1.add(constructor3);
            subTypes1.add(constructor4);
            FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSTypeRegistry$2", "this$0", typeRegistry);
            Object call15 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
            InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
            setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
            FunctionPrototypeType prototype12 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype12, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", anonymousFunctionType);
            HashMap properties40 = new HashMap();
            setField(prototype12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
            setField(prototype12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype12, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype12, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype12);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", anonymousFunctionType);
            HashMap properties41 = new HashMap();
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
            List implementedInterfaces15 = new ArrayList();
            anonymousFunctionType.setImplementedInterfaces(implementedInterfaces15);
            String className12 = "RegExp";
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
            HashMap properties42 = new HashMap();
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes1.add(anonymousFunctionType);
            FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call16 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
            setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
            FunctionPrototypeType prototype13 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype13, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType2);
            HashMap properties43 = new HashMap();
            setField(prototype13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
            setField(prototype13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype13, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype13);
            setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis10 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis10, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
            HashMap properties44 = new HashMap();
            setField(typeOfThis10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties44);
            setField(typeOfThis10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis10, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis10);
            List implementedInterfaces16 = new ArrayList();
            functionType2.setImplementedInterfaces(implementedInterfaces16);
            String className13 = "String";
            setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
            HashMap properties45 = new HashMap();
            setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties45);
            setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes1.add(functionType2);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
            String className14 = "Object";
            setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
            HashMap properties46 = new HashMap();
            setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties46);
            setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[20] = ((JSType) functionType1);
            nativeTypes[21] = ((JSType) prototype11);
            nativeTypes[22] = ((JSType) errorFunctionType2);
            nativeTypes[23] = ((JSType) typeOfThis1);
            nativeTypes[24] = ((JSType) errorFunctionType3);
            nativeTypes[25] = ((JSType) typeOfThis2);
            nativeTypes[26] = ((JSType) typeOfThis9);
            nativeTypes[27] = ((JSType) anonymousFunctionType);
            nativeTypes[28] = ((JSType) typeOfThis10);
            nativeTypes[29] = ((JSType) functionType2);
            nativeTypes[30] = ((JSType) returnType);
            nativeTypes[31] = ((JSType) errorFunctionType4);
            nativeTypes[32] = ((JSType) typeOfThis3);
            nativeTypes[33] = ((JSType) errorFunctionType5);
            nativeTypes[34] = ((JSType) typeOfThis4);
            nativeTypes[35] = ((JSType) returnType8);
            nativeTypes[36] = ((JSType) errorFunctionType6);
            nativeTypes[37] = ((JSType) typeOfThis5);
            VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
            setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[38] = ((JSType) voidType);
            nativeTypes[39] = ((JSType) implicitPrototype1);
            UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates = new LinkedHashSet();
            alternates.add(returnType);
            alternates.add(typeOfThis10);
            setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
            setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1134474330);
            setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[40] = ((JSType) unionType);
            UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates1 = new LinkedHashSet();
            alternates1.add(numberType);
            alternates1.add(instanceObjectType3);
            setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
            setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1695110415);
            setField(unionType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[41] = ((JSType) unionType1);
            AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(allType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[42] = ((JSType) allType);
            NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
            Object leastSupertypeVisitor1 = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
            setField(leastSupertypeVisitor1, "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor", "this$0", noType);
            setField(noType, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor", leastSupertypeVisitor1);
            Object greatestSubtypeVisitor1 = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
            setField(greatestSubtypeVisitor1, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", noType);
            setField(noType, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor", greatestSubtypeVisitor1);
            Object call17 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
            setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
            setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis11 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", noType);
            HashMap properties47 = new HashMap();
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties47);
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis11);
            List implementedInterfaces17 = new ArrayList();
            noType.setImplementedInterfaces(implementedInterfaces17);
            HashMap properties48 = new HashMap();
            setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties48);
            setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[43] = ((JSType) noType);
            nativeTypes[44] = ((JSType) typeOfThis7);
            Object prototypeObjectType = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType");
            String className15 = "global this";
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
            HashMap properties49 = new HashMap();
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties49);
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType8);
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[45] = ((JSType) prototypeObjectType);
            nativeTypes[46] = ((JSType) typeOfThis6);
            FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call18 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters16.setType(83);
            Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first8)).setType(38);
            Object propListHead4 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
            setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(first8, "com.google.javascript.rhino.Node", "jsType", returnType8);
            setField(first8, "com.google.javascript.rhino.Node", "parent", parameters16);
            setField(parameters16, "com.google.javascript.rhino.Node", "first", first8);
            setField(parameters16, "com.google.javascript.rhino.Node", "last", first8);
            setField(parameters16, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
            setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
            setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
            Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
            setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
            setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
            List implementedInterfaces18 = new ArrayList();
            functionType3.setImplementedInterfaces(implementedInterfaces18);
            HashMap properties50 = new HashMap();
            setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties50);
            setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[47] = ((JSType) functionType3);
            FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call19 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters17.setType(83);
            Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first9)).setType(38);
            Object propListHead5 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
            setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(first9, "com.google.javascript.rhino.Node", "jsType", allType);
            setField(first9, "com.google.javascript.rhino.Node", "parent", parameters17);
            setField(parameters17, "com.google.javascript.rhino.Node", "first", first9);
            setField(parameters17, "com.google.javascript.rhino.Node", "last", first9);
            setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
            setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
            setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
            setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
            setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
            List implementedInterfaces19 = new ArrayList();
            functionType4.setImplementedInterfaces(implementedInterfaces19);
            HashMap properties51 = new HashMap();
            setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties51);
            setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", typeOfThis6);
            setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[48] = ((JSType) functionType4);
            FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call20 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters18.setType(83);
            Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first10, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first10)).setType(38);
            Object propListHead6 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first10, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
            setField(first10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(first10, "com.google.javascript.rhino.Node", "jsType", noType);
            setField(first10, "com.google.javascript.rhino.Node", "parent", parameters18);
            setField(parameters18, "com.google.javascript.rhino.Node", "first", first10);
            setField(parameters18, "com.google.javascript.rhino.Node", "last", first10);
            setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
            setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", allType);
            setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
            setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
            setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
            List implementedInterfaces20 = new ArrayList();
            functionType5.setImplementedInterfaces(implementedInterfaces20);
            HashMap properties52 = new HashMap();
            setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties52);
            setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", typeOfThis6);
            setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[49] = ((JSType) functionType5);
            UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates2 = new LinkedHashSet();
            alternates2.add(numberType);
            alternates2.add(returnType);
            alternates2.add(implicitPrototype);
            setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
            setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1010470308);
            setField(unionType2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[50] = ((JSType) unionType2);
            UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates3 = new LinkedHashSet();
            alternates3.add(numberType);
            alternates3.add(returnType);
            alternates3.add(booleanType);
            alternates3.add(implicitPrototype);
            setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
            setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 424562456);
            setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[51] = ((JSType) unionType3);
            UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates4 = new LinkedHashSet();
            alternates4.add(numberType);
            alternates4.add(returnType);
            alternates4.add(booleanType);
            setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
            setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1930903623);
            setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[52] = ((JSType) unionType4);
            UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates5 = new LinkedHashSet();
            alternates5.add(numberType);
            alternates5.add(returnType);
            setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
            setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 929030909);
            setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[53] = ((JSType) unionType5);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            HashMap namesToTypes = new HashMap();
            String string13 = "Undefined";
            namesToTypes.put(string13, voidType);
            String string14 = "Null";
            namesToTypes.put(string14, nullType);
            String string15 = "void";
            namesToTypes.put(string15, voidType);
            String string16 = "string";
            namesToTypes.put(string16, returnType);
            namesToTypes.put(className5, typeOfThis2);
            namesToTypes.put(className12, typeOfThis9);
            namesToTypes.put(className9, returnType1);
            namesToTypes.put(className8, typeOfThis5);
            namesToTypes.put(className3, typeOfThis);
            namesToTypes.put(className13, typeOfThis10);
            namesToTypes.put(className2, instanceObjectType2);
            String string17 = "undefined";
            namesToTypes.put(string17, voidType);
            namesToTypes.put(className, instanceObjectType);
            String string18 = "number";
            namesToTypes.put(string18, numberType);
            namesToTypes.put(className10, typeOfThis6);
            String string19 = "boolean";
            namesToTypes.put(string19, booleanType);
            String string20 = "null";
            namesToTypes.put(string20, nullType);
            namesToTypes.put(className11, instanceObjectType3);
            namesToTypes.put(className6, typeOfThis3);
            namesToTypes.put(className7, typeOfThis4);
            namesToTypes.put(className4, typeOfThis1);
            namesToTypes.put(className14, implicitPrototype);
            namesToTypes.put(className1, instanceObjectType1);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
            HashSet namespaces = new HashSet();
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
            HashSet enumTypeNames = new HashSet();
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames", enumTypeNames);
            HashSet forwardDeclaredTypes = new HashSet();
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
            HashMap typesIndexedByProperty = new HashMap();
            String string21 = "prototype";
            HashSet hashSet = new HashSet();
            hashSet.add(functionType1);
            typesIndexedByProperty.put(string21, hashSet);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
            HashMap greatestSubtypeByProperty = new HashMap();
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
            HashMultimap interfaceToImplementors = ((HashMultimap) createInstance("com.google.common.collect.HashMultimap"));
            setField(interfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey", 8);
            HashMap map = new HashMap();
            setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
            ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
            setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
            HashMap map1 = new HashMap();
            setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
            ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
            setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
            HashMap map2 = new HashMap();
            setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
            typeRegistry.setLastGeneration(true);
            setField(expected, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
            TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
            setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "compiler", expected);
            setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
            UnionType allValueTypes = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates6 = new LinkedHashSet();
            alternates6.add(numberType);
            alternates6.add(returnType);
            alternates6.add(booleanType);
            alternates6.add(voidType);
            alternates6.add(nullType);
            setField(allValueTypes, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates6);
            setField(allValueTypes, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1522031616);
            setField(allValueTypes, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
            ArrayList mismatches = new ArrayList();
            setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
            setField(expected, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
            setField(expected, "com.google.javascript.jscomp.Compiler", "oldErrorReporter", reporter);
            Object defaultErrorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter");
            Map typeMap1 = new LinkedHashMap();
            String string22 = "\\Qextra @fileoverview tag\\E";
            typeMap1.put(string22, diagnosticType);
            String string23 = "\\QTrailing comma is not legal in an ECMA-262 object initializer\\E";
            typeMap1.put(string23, diagnosticType1);
            String string24 = "\\QDuplicate parameter name \"\\E.*\\Q\".\\E";
            typeMap1.put(string24, diagnosticType2);
            String string25 = "\\Qillegal use of unknown JSDoc tag \"\\E.*\\Q\"; ignoring it\\E";
            typeMap1.put(string25, diagnosticType3);
            setField(defaultErrorReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap", typeMap1);
            setField(defaultErrorReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler", expected);
            setField(expected, "com.google.javascript.jscomp.Compiler", "defaultErrorReporter", defaultErrorReporter);
            PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.Compiler$3"));
            setField(sanityCheck, "com.google.javascript.jscomp.Compiler$3", "this$0", expected);
            String name = "sanityCheck";
            setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "name", name);
            setField(expected, "com.google.javascript.jscomp.Compiler", "sanityCheck", sanityCheck);
            CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
            setField(expected, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
            ArrayList codeChangeHandlers = new ArrayList();
            codeChangeHandlers.add(recentChange);
            setField(expected, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
            
            CompilerOptions actualOptions = actual.options;
            assertNull(actualOptions);
            
            PassConfig actualPasses = ((PassConfig) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "passes"));
            assertNull(actualPasses);
            
            com.google.javascript.jscomp.CompilerInput[] actualExterns = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "externs"));
            assertNull(actualExterns);
            
            com.google.javascript.jscomp.JSModule[] actualModules = ((com.google.javascript.jscomp.JSModule[]) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "modules"));
            assertNull(actualModules);
            
            JSModuleGraph actualModuleGraph = actual.getModuleGraph();
            assertNull(actualModuleGraph);
            
            com.google.javascript.jscomp.CompilerInput[] actualInputs = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "inputs"));
            assertNull(actualInputs);
            
            ErrorManager actualErrorManager = actual.getErrorManager();
            assertNull(actualErrorManager);
            
            SymbolTable actualSymbolTable = ((SymbolTable) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "symbolTable"));
            assertNull(actualSymbolTable);
            
            Node actualExternsRoot = actual.externsRoot;
            assertNull(actualExternsRoot);
            
            Node actualJsRoot = actual.jsRoot;
            assertNull(actualJsRoot);
            
            Node actualExternAndJsRoot = actual.externAndJsRoot;
            assertNull(actualExternAndJsRoot);
            
            Map actualInputsByName = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "inputsByName"));
            assertNull(actualInputsByName);
            
            SourceMap actualSourceMap = actual.getSourceMap();
            assertNull(actualSourceMap);
            
            String actualExternExports = ((String) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "externExports"));
            assertNull(actualExternExports);
            
            int expectedUniqueNameId = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
            int actualUniqueNameId = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
            assertEquals(expectedUniqueNameId, actualUniqueNameId);
            
            boolean actualNormalized = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "normalized"));
            assertFalse(actualNormalized);
            
            boolean actualUseThreads = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "useThreads"));
            assertTrue(actualUseThreads);
            
            FunctionInformationMap actualFunctionInformationMap = ((FunctionInformationMap) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "functionInformationMap"));
            assertNull(actualFunctionInformationMap);
            
            StringBuilder expectedDebugLog = ((StringBuilder) getFieldValue(expected, "com.google.javascript.jscomp.Compiler", "debugLog"));
            StringBuilder actualDebugLog = ((StringBuilder) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "debugLog"));
            
            CodingConvention expectedDefaultCodingConvention = expected.defaultCodingConvention;
            CodingConvention actualDefaultCodingConvention = actual.defaultCodingConvention;
            Set expectedDefaultCodingConventionPropertyTestFunctions = ((Set) getFieldValue(expectedDefaultCodingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions"));
            Set actualDefaultCodingConventionPropertyTestFunctions = ((Set) getFieldValue(actualDefaultCodingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions"));
            assertTrue(deepEquals(expectedDefaultCodingConventionPropertyTestFunctions, actualDefaultCodingConventionPropertyTestFunctions));
            
            JSTypeRegistry expectedTypeRegistry = expected.getTypeRegistry();
            JSTypeRegistry actualTypeRegistry = actual.getTypeRegistry();
            ErrorReporter expectedTypeRegistryReporter = ((ErrorReporter) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            Map expectedTypeRegistryReporterTypeMap = ((Map) getFieldValue(expectedTypeRegistryReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap"));
            Map actualTypeRegistryReporterTypeMap = ((Map) getFieldValue(actualTypeRegistryReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap"));
            assertTrue(deepEquals(expectedTypeRegistryReporterTypeMap, actualTypeRegistryReporterTypeMap));
            
            AbstractCompiler expectedTypeRegistryReporterCompiler = ((AbstractCompiler) getFieldValue(expectedTypeRegistryReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler"));
            AbstractCompiler actualTypeRegistryReporterCompiler = ((AbstractCompiler) getFieldValue(actualTypeRegistryReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler"));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            Config actualTypeRegistryReporterCompilerParserConfig = (((Compiler) actualTypeRegistryReporterCompiler)).getParserConfig();
            assertNull(actualTypeRegistryReporterCompilerParserConfig);
            
            ReverseAbstractInterpreter actualTypeRegistryReporterCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
            assertNull(actualTypeRegistryReporterCompilerAbstractInterpreter);
            
            TypeValidator expectedTypeRegistryReporterCompilerTypeValidator = (((Compiler) expectedTypeRegistryReporterCompiler)).getTypeValidator();
            TypeValidator actualTypeRegistryReporterCompilerTypeValidator = (((Compiler) actualTypeRegistryReporterCompiler)).getTypeValidator();
            AbstractCompiler expectedTypeRegistryReporterCompilerTypeValidatorCompiler = ((AbstractCompiler) getFieldValue(expectedTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "compiler"));
            AbstractCompiler actualTypeRegistryReporterCompilerTypeValidatorCompiler = ((AbstractCompiler) getFieldValue(actualTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "compiler"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerTypeValidatorCompiler, actualTypeRegistryReporterCompilerTypeValidatorCompiler));
            
            JSTypeRegistry expectedTypeRegistryReporterCompilerTypeValidatorTypeRegistry = ((JSTypeRegistry) getFieldValue(expectedTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
            JSTypeRegistry actualTypeRegistryReporterCompilerTypeValidatorTypeRegistry = ((JSTypeRegistry) getFieldValue(actualTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerTypeValidatorTypeRegistry, actualTypeRegistryReporterCompilerTypeValidatorTypeRegistry));
            
            JSType expectedTypeRegistryReporterCompilerTypeValidatorAllValueTypes = ((JSType) getFieldValue(expectedTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes"));
            JSType actualTypeRegistryReporterCompilerTypeValidatorAllValueTypes = ((JSType) getFieldValue(actualTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerTypeValidatorAllValueTypes, actualTypeRegistryReporterCompilerTypeValidatorAllValueTypes));
            
            List expectedTypeRegistryReporterCompilerTypeValidatorMismatches = ((List) getFieldValue(expectedTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches"));
            List actualTypeRegistryReporterCompilerTypeValidatorMismatches = ((List) getFieldValue(actualTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerTypeValidatorMismatches, actualTypeRegistryReporterCompilerTypeValidatorMismatches));
            
            PerformanceTracker actualTypeRegistryReporterCompilerTracker = ((PerformanceTracker) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "tracker"));
            assertNull(actualTypeRegistryReporterCompilerTracker);
            
            ErrorReporter expectedTypeRegistryReporterCompilerOldErrorReporter = ((ErrorReporter) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
            ErrorReporter actualTypeRegistryReporterCompilerOldErrorReporter = ((ErrorReporter) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerOldErrorReporter, actualTypeRegistryReporterCompilerOldErrorReporter));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerOldErrorReporter, actualTypeRegistryReporterCompilerOldErrorReporter));
            
            com.google.javascript.jscomp.mozilla.rhino.ErrorReporter expectedTypeRegistryReporterCompilerDefaultErrorReporter = (((Compiler) expectedTypeRegistryReporterCompiler)).getDefaultErrorReporter();
            com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actualTypeRegistryReporterCompilerDefaultErrorReporter = (((Compiler) actualTypeRegistryReporterCompiler)).getDefaultErrorReporter();
            Map expectedTypeRegistryReporterCompilerDefaultErrorReporterTypeMap = ((Map) getFieldValue(expectedTypeRegistryReporterCompilerDefaultErrorReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap"));
            Map actualTypeRegistryReporterCompilerDefaultErrorReporterTypeMap = ((Map) getFieldValue(actualTypeRegistryReporterCompilerDefaultErrorReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerDefaultErrorReporterTypeMap, actualTypeRegistryReporterCompilerDefaultErrorReporterTypeMap));
            
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerDefaultErrorReporter, actualTypeRegistryReporterCompilerDefaultErrorReporter));
            
            PrintStream actualTypeRegistryReporterCompilerOutStream = ((PrintStream) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "outStream"));
            assertNull(actualTypeRegistryReporterCompilerOutStream);
            
            PassFactory expectedTypeRegistryReporterCompilerSanityCheck = ((PassFactory) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
            PassFactory actualTypeRegistryReporterCompilerSanityCheck = ((PassFactory) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
            String expectedTypeRegistryReporterCompilerSanityCheckName = expectedTypeRegistryReporterCompilerSanityCheck.getName();
            String actualTypeRegistryReporterCompilerSanityCheckName = actualTypeRegistryReporterCompilerSanityCheck.getName();
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerSanityCheckName, actualTypeRegistryReporterCompilerSanityCheckName));
            
            boolean actualTypeRegistryReporterCompilerSanityCheckIsOneTimePass = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerSanityCheck, "com.google.javascript.jscomp.PassFactory", "isOneTimePass"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerSanityCheckIsOneTimePass, actualTypeRegistryReporterCompilerSanityCheckIsOneTimePass));
            
            boolean actualTypeRegistryReporterCompilerSanityCheckIsCreated = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerSanityCheck, "com.google.javascript.jscomp.PassFactory", "isCreated"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerSanityCheckIsCreated, actualTypeRegistryReporterCompilerSanityCheckIsCreated));
            
            Tracer actualTypeRegistryReporterCompilerCurrentTracer = ((Tracer) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "currentTracer"));
            assertNull(actualTypeRegistryReporterCompilerCurrentTracer);
            
            String actualTypeRegistryReporterCompilerCurrentPassName = ((String) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "currentPassName"));
            assertNull(actualTypeRegistryReporterCompilerCurrentPassName);
            
            CodeChangeHandler.RecentChange expectedTypeRegistryReporterCompilerRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "recentChange"));
            CodeChangeHandler.RecentChange actualTypeRegistryReporterCompilerRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "recentChange"));
            boolean actualTypeRegistryReporterCompilerRecentChangeHasChanged = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerRecentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerRecentChangeHasChanged, actualTypeRegistryReporterCompilerRecentChangeHasChanged));
            
            List expectedTypeRegistryReporterCompilerCodeChangeHandlers = ((List) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
            List actualTypeRegistryReporterCompilerCodeChangeHandlers = ((List) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerCodeChangeHandlers, actualTypeRegistryReporterCompilerCodeChangeHandlers));
            
            com.google.javascript.rhino.jstype.JSType[] expectedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            int expectedTypeRegistryNativeTypesSize = expectedTypeRegistryNativeTypes.length;
            assertEquals(expectedTypeRegistryNativeTypesSize, actualTypeRegistryNativeTypes.length);
            assertTrue(deepEquals(expectedTypeRegistryNativeTypes, actualTypeRegistryNativeTypes));
            
            Map expectedTypeRegistryNamesToTypes = ((Map) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertTrue(deepEquals(expectedTypeRegistryNamesToTypes, actualTypeRegistryNamesToTypes));
            
            Set expectedTypeRegistryNamespaces = ((Set) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertTrue(deepEquals(expectedTypeRegistryNamespaces, actualTypeRegistryNamespaces));
            
            Set expectedTypeRegistryEnumTypeNames = ((Set) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertTrue(deepEquals(expectedTypeRegistryEnumTypeNames, actualTypeRegistryEnumTypeNames));
            
            Set expectedTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertTrue(deepEquals(expectedTypeRegistryForwardDeclaredTypes, actualTypeRegistryForwardDeclaredTypes));
            
            Map expectedTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertTrue(deepEquals(expectedTypeRegistryTypesIndexedByProperty, actualTypeRegistryTypesIndexedByProperty));
            
            Map expectedTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertTrue(deepEquals(expectedTypeRegistryGreatestSubtypeByProperty, actualTypeRegistryGreatestSubtypeByProperty));
            
            Multimap expectedTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            int expectedTypeRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(expectedTypeRegistryInterfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
            int actualTypeRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
            assertEquals(expectedTypeRegistryInterfaceToImplementorsExpectedValuesPerKey, actualTypeRegistryInterfaceToImplementorsExpectedValuesPerKey);
            
            Map expectedTypeRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
            Map actualTypeRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
            assertTrue(deepEquals(expectedTypeRegistryInterfaceToImplementorsMap, actualTypeRegistryInterfaceToImplementorsMap));
            
            int expectedTypeRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
            int actualTypeRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
            assertEquals(expectedTypeRegistryInterfaceToImplementorsTotalSize, actualTypeRegistryInterfaceToImplementorsTotalSize);
            
            Set actualTypeRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
            assertNull(actualTypeRegistryInterfaceToImplementorsKeySet);
            
            Multiset actualTypeRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
            assertNull(actualTypeRegistryInterfaceToImplementorsMultiset);
            
            Collection actualTypeRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
            assertNull(actualTypeRegistryInterfaceToImplementorsValuesCollection);
            
            Collection actualTypeRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
            assertNull(actualTypeRegistryInterfaceToImplementorsEntries);
            
            Map actualTypeRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
            assertNull(actualTypeRegistryInterfaceToImplementorsAsMap);
            
            Multimap expectedTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            int expectedTypeRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedTypeRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
            int actualTypeRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualTypeRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
            assertEquals(expectedTypeRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualTypeRegistryUnresolvedNamedTypesExpectedValuesPerKey);
            
            Map expectedTypeRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedTypeRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
            Map actualTypeRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualTypeRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypesMap, actualTypeRegistryUnresolvedNamedTypesMap));
            
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            
            Multimap expectedTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            Map expectedTypeRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedTypeRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
            Map actualTypeRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualTypeRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypesMap, actualTypeRegistryResolvedNamedTypesMap));
            
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            
            boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertTrue(actualTypeRegistryLastGeneration);
            
            String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualTypeRegistryTemplateTypeName);
            
            TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualTypeRegistryTemplateType);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
        */
        } finally {
            setStaticField(com.google.javascript.rhino.Context.class, "threadContexts", prevThreadContexts);
        }
    }
    
    /**
    @utbot.classUnderTest {@link CommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CommandLineRunner#createCompiler()}
 *  */
    @Test
    public void testCreateCompiler_1() throws Exception  {
        Class contextClazz = Class.forName("com.google.javascript.rhino.Context");
        ThreadLocal prevThreadContexts = ((ThreadLocal) getStaticFieldValue(contextClazz, "threadContexts"));
        try {
        /* This block of code is 1390 lines long and could lead to compilation error
            ThreadLocal threadContexts = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(threadContexts, "java.lang.ThreadLocal", "threadLocalHashCode", -2145642040);
            setStaticField(contextClazz, "threadContexts", threadContexts);
            CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
            PrintStream err = ((PrintStream) createInstance("java.io.PrintStream"));
            setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "err", err);
            
            Compiler actual = commandLineRunner.createCompiler();
            
            Compiler expected = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            setField(expected, "com.google.javascript.jscomp.Compiler", "useThreads", true);
            StringBuilder debugLog = ((StringBuilder) createInstance("java.lang.StringBuilder"));
            setField(expected, "com.google.javascript.jscomp.Compiler", "debugLog", debugLog);
            GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
            Set propertyTestFunctions = new LinkedHashSet();
            String string = "goog.isDef";
            propertyTestFunctions.add(string);
            String string1 = "goog.isNull";
            propertyTestFunctions.add(string1);
            String string2 = "goog.isDefAndNotNull";
            propertyTestFunctions.add(string2);
            String string3 = "goog.isString";
            propertyTestFunctions.add(string3);
            String string4 = "goog.isNumber";
            propertyTestFunctions.add(string4);
            String string5 = "goog.isBoolean";
            propertyTestFunctions.add(string5);
            String string6 = "goog.isFunction";
            propertyTestFunctions.add(string6);
            String string7 = "goog.isArray";
            propertyTestFunctions.add(string7);
            String string8 = "goog.isObject";
            propertyTestFunctions.add(string8);
            setField(defaultCodingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions", propertyTestFunctions);
            setField(expected, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
            JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            Object reporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter");
            Map typeMap = new LinkedHashMap();
            String string9 = "\\Qextra @fileoverview tag\\E";
            DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            String key = "JSC_EXTRA_FILEOVERVIEW";
            setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "key", key);
            MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
            setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
            CheckLevel defaultLevel = CheckLevel.WARNING;
            setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
            diagnosticType.level = defaultLevel;
            typeMap.put(string9, diagnosticType);
            String string10 = "\\QTrailing comma is not legal in an ECMA-262 object initializer\\E";
            DiagnosticType diagnosticType1 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            String key1 = "JSC_TRAILING_COMMA";
            setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "key", key1);
            MessageFormat format1 = ((MessageFormat) createInstance("java.text.MessageFormat"));
            setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "format", format1);
            CheckLevel defaultLevel1 = CheckLevel.ERROR;
            setField(diagnosticType1, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
            diagnosticType1.level = defaultLevel1;
            typeMap.put(string10, diagnosticType1);
            String string11 = "\\QDuplicate parameter name \"\\E.*\\Q\".\\E";
            DiagnosticType diagnosticType2 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            String key2 = "JSC_DUPLICATE_PARAM";
            setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "key", key2);
            MessageFormat format2 = ((MessageFormat) createInstance("java.text.MessageFormat"));
            setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "format", format2);
            setField(diagnosticType2, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
            diagnosticType2.level = defaultLevel1;
            typeMap.put(string11, diagnosticType2);
            String string12 = "\\Qillegal use of unknown JSDoc tag \"\\E.*\\Q\"; ignoring it\\E";
            DiagnosticType diagnosticType3 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
            String key3 = "JSC_BAD_JSDOC_ANNOTATION";
            setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "key", key3);
            MessageFormat format3 = ((MessageFormat) createInstance("java.text.MessageFormat"));
            setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "format", format3);
            setField(diagnosticType3, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
            diagnosticType3.level = defaultLevel;
            typeMap.put(string12, diagnosticType3);
            setField(reporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap", typeMap);
            setField(reporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler", expected);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[54];
            InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
            setField(constructor, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", typeRegistry);
            Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters.setType(83);
            Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters, "com.google.javascript.rhino.Node", "first", first);
            Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters, "com.google.javascript.rhino.Node", "last", last);
            setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", instanceObjectType);
            setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
            FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor);
            HashMap properties = new HashMap();
            setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
            InstanceObjectType implicitPrototype = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            setField(implicitPrototype, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor1);
            HashMap properties1 = new HashMap();
            setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
            setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(implicitPrototype, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
            Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
            Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
            setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType);
            List implementedInterfaces = new ArrayList();
            constructor.setImplementedInterfaces(implementedInterfaces);
            String className = "Array";
            setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
            HashMap properties2 = new HashMap();
            setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
            setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
            HashMap properties3 = new HashMap();
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(instanceObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[0] = ((JSType) instanceObjectType);
            nativeTypes[1] = ((JSType) constructor);
            BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
            setField(booleanType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[2] = ((JSType) booleanType);
            InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call1 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters1.setType(83);
            Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
            Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters1, "com.google.javascript.rhino.Node", "last", last1);
            setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
            setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", booleanType);
            setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
            FunctionPrototypeType prototype1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype1, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor2);
            HashMap properties4 = new HashMap();
            setField(prototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
            setField(prototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype1);
            setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(constructor2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType1);
            List implementedInterfaces1 = new ArrayList();
            constructor2.setImplementedInterfaces(implementedInterfaces1);
            String className1 = "Boolean";
            setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
            HashMap properties5 = new HashMap();
            setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
            setField(constructor2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(constructor2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(constructor2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor2);
            HashMap properties6 = new HashMap();
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(instanceObjectType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[3] = ((JSType) instanceObjectType1);
            nativeTypes[4] = ((JSType) constructor2);
            UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
            setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
            setField(unknownType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(unknownType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[5] = ((JSType) unknownType);
            InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call2 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters2.setType(83);
            Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
            Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters2, "com.google.javascript.rhino.Node", "last", last2);
            setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
            StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
            setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
            FunctionPrototypeType prototype2 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype2, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor3);
            HashMap properties7 = new HashMap();
            setField(prototype2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
            setField(prototype2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype2);
            setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(constructor3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType2);
            List implementedInterfaces2 = new ArrayList();
            constructor3.setImplementedInterfaces(implementedInterfaces2);
            String className2 = "Date";
            setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
            HashMap properties8 = new HashMap();
            setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
            setField(constructor3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(constructor3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(constructor3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor3);
            HashMap properties9 = new HashMap();
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(instanceObjectType2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[6] = ((JSType) instanceObjectType2);
            nativeTypes[7] = ((JSType) constructor3);
            Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call3 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters3.setType(83);
            Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
            String str = "";
            setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first3)).setType(38);
            Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first3, "com.google.javascript.rhino.Node", "next", next);
            Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead);
            setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(first3, "com.google.javascript.rhino.Node", "jsType", jsType);
            setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
            setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
            Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(last3, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) last3)).setType(38);
            Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(last3, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
            setField(last3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            AllType jsType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(last3, "com.google.javascript.rhino.Node", "jsType", jsType1);
            setField(last3, "com.google.javascript.rhino.Node", "parent", parameters3);
            setField(parameters3, "com.google.javascript.rhino.Node", "last", last3);
            setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
            InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType);
            HashMap properties10 = new HashMap();
            setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
            setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
            setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
            List implementedInterfaces3 = new ArrayList();
            (((FunctionType) errorFunctionType)).setImplementedInterfaces(implementedInterfaces3);
            ArrayList subTypes = new ArrayList();
            Object errorFunctionType1 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call4 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
            InstanceObjectType returnType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
            setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
            FunctionPrototypeType prototype3 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype3, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType1);
            HashMap properties11 = new HashMap();
            setField(prototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
            setField(prototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype3);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType1);
            HashMap properties12 = new HashMap();
            setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
            List implementedInterfaces4 = new ArrayList();
            (((FunctionType) errorFunctionType1)).setImplementedInterfaces(implementedInterfaces4);
            String className3 = "EvalError";
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
            HashMap properties13 = new HashMap();
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType1);
            Object errorFunctionType2 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call5 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
            InstanceObjectType returnType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
            setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
            FunctionPrototypeType prototype4 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype4, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType2);
            HashMap properties14 = new HashMap();
            setField(prototype4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
            setField(prototype4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype4);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType2);
            HashMap properties15 = new HashMap();
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
            List implementedInterfaces5 = new ArrayList();
            (((FunctionType) errorFunctionType2)).setImplementedInterfaces(implementedInterfaces5);
            String className4 = "RangeError";
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
            HashMap properties16 = new HashMap();
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType2);
            Object errorFunctionType3 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call6 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
            InstanceObjectType returnType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
            setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
            FunctionPrototypeType prototype5 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype5, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType3);
            HashMap properties17 = new HashMap();
            setField(prototype5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
            setField(prototype5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype5);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType3);
            HashMap properties18 = new HashMap();
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
            List implementedInterfaces6 = new ArrayList();
            (((FunctionType) errorFunctionType3)).setImplementedInterfaces(implementedInterfaces6);
            String className5 = "ReferenceError";
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
            HashMap properties19 = new HashMap();
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType3);
            Object errorFunctionType4 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call7 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
            InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
            setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
            FunctionPrototypeType prototype6 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype6, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType4);
            HashMap properties20 = new HashMap();
            setField(prototype6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
            setField(prototype6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype6, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype6);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType4);
            HashMap properties21 = new HashMap();
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
            List implementedInterfaces7 = new ArrayList();
            (((FunctionType) errorFunctionType4)).setImplementedInterfaces(implementedInterfaces7);
            String className6 = "SyntaxError";
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
            HashMap properties22 = new HashMap();
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType4);
            Object errorFunctionType5 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call8 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
            InstanceObjectType returnType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType6);
            setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
            FunctionPrototypeType prototype7 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype7, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType5);
            HashMap properties23 = new HashMap();
            setField(prototype7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
            setField(prototype7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype7, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype7);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType5);
            HashMap properties24 = new HashMap();
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
            List implementedInterfaces8 = new ArrayList();
            (((FunctionType) errorFunctionType5)).setImplementedInterfaces(implementedInterfaces8);
            String className7 = "TypeError";
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
            HashMap properties25 = new HashMap();
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType5);
            Object errorFunctionType6 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
            Object call9 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters9 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters9);
            InstanceObjectType returnType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType7);
            setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
            FunctionPrototypeType prototype8 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype8, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", errorFunctionType6);
            HashMap properties26 = new HashMap();
            setField(prototype8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
            setField(prototype8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType1);
            setField(prototype8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype8, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype8);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", errorFunctionType6);
            HashMap properties27 = new HashMap();
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties27);
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
            List implementedInterfaces9 = new ArrayList();
            (((FunctionType) errorFunctionType6)).setImplementedInterfaces(implementedInterfaces9);
            String className8 = "URIError";
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
            HashMap properties28 = new HashMap();
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties28);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType6, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes.add(errorFunctionType6);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
            String className9 = "Error";
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
            HashMap properties29 = new HashMap();
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties29);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[8] = ((JSType) errorFunctionType);
            nativeTypes[9] = ((JSType) returnType1);
            nativeTypes[10] = ((JSType) errorFunctionType1);
            nativeTypes[11] = ((JSType) typeOfThis);
            FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call10 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters10 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters10.setType(83);
            Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first4, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first4)).setType(38);
            Object propListHead2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first4, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
            setField(first4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            AllType jsType2 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(first4, "com.google.javascript.rhino.Node", "jsType", jsType2);
            setField(first4, "com.google.javascript.rhino.Node", "parent", parameters10);
            setField(parameters10, "com.google.javascript.rhino.Node", "first", first4);
            setField(parameters10, "com.google.javascript.rhino.Node", "last", first4);
            setField(parameters10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters10);
            UnknownType returnType8 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
            setField(returnType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(returnType8, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(call10, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
            setField(call10, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
            FunctionPrototypeType prototype9 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype9, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType);
            HashMap properties30 = new HashMap();
            setField(prototype9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties30);
            setField(prototype9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype9, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype9);
            setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            FunctionType typeOfThis6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSTypeRegistry$3", "this$0", typeRegistry);
            Object call11 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters11 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters11.setType(83);
            Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters11, "com.google.javascript.rhino.Node", "first", first5);
            Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters11, "com.google.javascript.rhino.Node", "last", last4);
            setField(parameters11, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters11);
            setField(call11, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
            setField(call11, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "call", call11);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            NoObjectType typeOfThis7 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
            Object leastSupertypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
            setField(leastSupertypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor", "this$0", typeOfThis7);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor", leastSupertypeVisitor);
            Object greatestSubtypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
            setField(greatestSubtypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", typeOfThis7);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor", greatestSubtypeVisitor);
            Object call12 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            setField(call12, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis7);
            setField(call12, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "call", call12);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", typeOfThis7);
            HashMap properties31 = new HashMap();
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties31);
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis8, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis8);
            List implementedInterfaces10 = new ArrayList();
            typeOfThis7.setImplementedInterfaces(implementedInterfaces10);
            HashMap properties32 = new HashMap();
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties32);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis7, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis7);
            List implementedInterfaces11 = new ArrayList();
            typeOfThis6.setImplementedInterfaces(implementedInterfaces11);
            String className10 = "Function";
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
            HashMap properties33 = new HashMap();
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties33);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", prototype9);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis6, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
            List implementedInterfaces12 = new ArrayList();
            functionType.setImplementedInterfaces(implementedInterfaces12);
            setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
            HashMap properties34 = new HashMap();
            setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties34);
            setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[12] = ((JSType) functionType);
            nativeTypes[13] = ((JSType) typeOfThis6);
            nativeTypes[14] = ((JSType) prototype9);
            NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
            setField(nullType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[15] = ((JSType) nullType);
            NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
            setField(numberType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[16] = ((JSType) numberType);
            InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            FunctionType constructor4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call13 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters12 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters12.setType(83);
            Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters12, "com.google.javascript.rhino.Node", "first", first6);
            Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(parameters12, "com.google.javascript.rhino.Node", "last", last5);
            setField(parameters12, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters12);
            setField(call13, "com.google.javascript.rhino.jstype.ArrowType", "returnType", numberType);
            setField(call13, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "call", call13);
            FunctionPrototypeType prototype10 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype10, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor4);
            HashMap properties35 = new HashMap();
            setField(prototype10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties35);
            setField(prototype10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype10, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype10);
            setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(constructor4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", instanceObjectType3);
            List implementedInterfaces13 = new ArrayList();
            constructor4.setImplementedInterfaces(implementedInterfaces13);
            String className11 = "Number";
            setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
            HashMap properties36 = new HashMap();
            setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties36);
            setField(constructor4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(constructor4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(constructor4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(instanceObjectType3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor4);
            HashMap properties37 = new HashMap();
            setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties37);
            setField(instanceObjectType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(instanceObjectType3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[17] = ((JSType) instanceObjectType3);
            nativeTypes[18] = ((JSType) constructor4);
            nativeTypes[19] = ((JSType) implicitPrototype);
            FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call14 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters13 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters13.setType(83);
            Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first7, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first7)).setType(38);
            Object propListHead3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first7, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
            setField(first7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            AllType jsType3 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(first7, "com.google.javascript.rhino.Node", "jsType", jsType3);
            setField(first7, "com.google.javascript.rhino.Node", "parent", parameters13);
            setField(parameters13, "com.google.javascript.rhino.Node", "first", first7);
            setField(parameters13, "com.google.javascript.rhino.Node", "last", first7);
            setField(parameters13, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters13);
            setField(call14, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
            setField(call14, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call14);
            FunctionPrototypeType prototype11 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype11, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType1);
            HashMap properties38 = new HashMap();
            setField(prototype11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties38);
            FunctionPrototypeType implicitPrototype1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            HashMap properties39 = new HashMap();
            setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties39);
            setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(implicitPrototype1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(prototype11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype1);
            setField(prototype11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(prototype11, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype11);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototype);
            List implementedInterfaces14 = new ArrayList();
            functionType1.setImplementedInterfaces(implementedInterfaces14);
            ArrayList subTypes1 = new ArrayList();
            subTypes1.add(functionType);
            subTypes1.add(constructor);
            subTypes1.add(constructor2);
            subTypes1.add(constructor3);
            subTypes1.add(constructor4);
            FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSTypeRegistry$2", "this$0", typeRegistry);
            Object call15 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters14 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters14);
            InstanceObjectType returnType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(call15, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType9);
            setField(call15, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call15);
            FunctionPrototypeType prototype12 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype12, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", anonymousFunctionType);
            HashMap properties40 = new HashMap();
            setField(prototype12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties40);
            setField(prototype12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype12, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototype12, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype12);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", anonymousFunctionType);
            HashMap properties41 = new HashMap();
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties41);
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis9, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis9);
            List implementedInterfaces15 = new ArrayList();
            anonymousFunctionType.setImplementedInterfaces(implementedInterfaces15);
            String className12 = "RegExp";
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
            HashMap properties42 = new HashMap();
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties42);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes1.add(anonymousFunctionType);
            FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call16 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters15 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters15);
            setField(call16, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call16, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call16);
            FunctionPrototypeType prototype13 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
            setField(prototype13, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", functionType2);
            HashMap properties43 = new HashMap();
            setField(prototype13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties43);
            setField(prototype13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(prototype13, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype13);
            setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis10 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis10, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
            HashMap properties44 = new HashMap();
            setField(typeOfThis10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties44);
            setField(typeOfThis10, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis10, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis10);
            List implementedInterfaces16 = new ArrayList();
            functionType2.setImplementedInterfaces(implementedInterfaces16);
            String className13 = "String";
            setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
            HashMap properties45 = new HashMap();
            setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties45);
            setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            subTypes1.add(functionType2);
            setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes1);
            String className14 = "Object";
            setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
            HashMap properties46 = new HashMap();
            setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties46);
            setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[20] = ((JSType) functionType1);
            nativeTypes[21] = ((JSType) prototype11);
            nativeTypes[22] = ((JSType) errorFunctionType2);
            nativeTypes[23] = ((JSType) typeOfThis1);
            nativeTypes[24] = ((JSType) errorFunctionType3);
            nativeTypes[25] = ((JSType) typeOfThis2);
            nativeTypes[26] = ((JSType) typeOfThis9);
            nativeTypes[27] = ((JSType) anonymousFunctionType);
            nativeTypes[28] = ((JSType) typeOfThis10);
            nativeTypes[29] = ((JSType) functionType2);
            nativeTypes[30] = ((JSType) returnType);
            nativeTypes[31] = ((JSType) errorFunctionType4);
            nativeTypes[32] = ((JSType) typeOfThis3);
            nativeTypes[33] = ((JSType) errorFunctionType5);
            nativeTypes[34] = ((JSType) typeOfThis4);
            nativeTypes[35] = ((JSType) returnType8);
            nativeTypes[36] = ((JSType) errorFunctionType6);
            nativeTypes[37] = ((JSType) typeOfThis5);
            VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
            setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[38] = ((JSType) voidType);
            nativeTypes[39] = ((JSType) implicitPrototype1);
            UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates = new LinkedHashSet();
            alternates.add(typeOfThis10);
            alternates.add(returnType);
            setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
            setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -866822666);
            setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[40] = ((JSType) unionType);
            UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates1 = new LinkedHashSet();
            alternates1.add(instanceObjectType3);
            alternates1.add(numberType);
            setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates1);
            setField(unionType1, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -673132543);
            setField(unionType1, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[41] = ((JSType) unionType1);
            AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
            setField(allType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[42] = ((JSType) allType);
            NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
            Object leastSupertypeVisitor1 = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
            setField(leastSupertypeVisitor1, "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor", "this$0", noType);
            setField(noType, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor", leastSupertypeVisitor1);
            Object greatestSubtypeVisitor1 = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
            setField(greatestSubtypeVisitor1, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", noType);
            setField(noType, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor", greatestSubtypeVisitor1);
            Object call17 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            setField(call17, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
            setField(call17, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call17);
            setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis11 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", noType);
            HashMap properties47 = new HashMap();
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties47);
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis11, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis11);
            List implementedInterfaces17 = new ArrayList();
            noType.setImplementedInterfaces(implementedInterfaces17);
            HashMap properties48 = new HashMap();
            setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties48);
            setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[43] = ((JSType) noType);
            nativeTypes[44] = ((JSType) typeOfThis7);
            Object prototypeObjectType = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType");
            String className15 = "global this";
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className15);
            HashMap properties49 = new HashMap();
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties49);
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", returnType8);
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(prototypeObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[45] = ((JSType) prototypeObjectType);
            nativeTypes[46] = ((JSType) typeOfThis6);
            FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call18 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters16 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters16.setType(83);
            Object first8 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first8, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first8)).setType(38);
            Object propListHead4 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first8, "com.google.javascript.rhino.Node", "propListHead", propListHead4);
            setField(first8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(first8, "com.google.javascript.rhino.Node", "jsType", returnType8);
            setField(first8, "com.google.javascript.rhino.Node", "parent", parameters16);
            setField(parameters16, "com.google.javascript.rhino.Node", "first", first8);
            setField(parameters16, "com.google.javascript.rhino.Node", "last", first8);
            setField(parameters16, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters16);
            setField(call18, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType8);
            setField(call18, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call18);
            Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
            setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
            setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
            List implementedInterfaces18 = new ArrayList();
            functionType3.setImplementedInterfaces(implementedInterfaces18);
            HashMap properties50 = new HashMap();
            setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties50);
            setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", implicitPrototype);
            setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[47] = ((JSType) functionType3);
            FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call19 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters17 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters17.setType(83);
            Object first9 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first9, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first9)).setType(38);
            Object propListHead5 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first9, "com.google.javascript.rhino.Node", "propListHead", propListHead5);
            setField(first9, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(first9, "com.google.javascript.rhino.Node", "jsType", allType);
            setField(first9, "com.google.javascript.rhino.Node", "parent", parameters17);
            setField(parameters17, "com.google.javascript.rhino.Node", "first", first9);
            setField(parameters17, "com.google.javascript.rhino.Node", "last", first9);
            setField(parameters17, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters17);
            setField(call19, "com.google.javascript.rhino.jstype.ArrowType", "returnType", noType);
            setField(call19, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call19);
            setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
            setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
            List implementedInterfaces19 = new ArrayList();
            functionType4.setImplementedInterfaces(implementedInterfaces19);
            HashMap properties51 = new HashMap();
            setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties51);
            setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", typeOfThis6);
            setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[48] = ((JSType) functionType4);
            FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            Object call20 = createInstance("com.google.javascript.rhino.jstype.ArrowType");
            Node parameters18 = ((Node) createInstance("com.google.javascript.rhino.Node"));
            parameters18.setType(83);
            Object first10 = createInstance("com.google.javascript.rhino.Node$StringNode");
            setField(first10, "com.google.javascript.rhino.Node$StringNode", "str", str);
            (((Node) first10)).setType(38);
            Object propListHead6 = createInstance("com.google.javascript.rhino.Node$PropListItem");
            setField(first10, "com.google.javascript.rhino.Node", "propListHead", propListHead6);
            setField(first10, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(first10, "com.google.javascript.rhino.Node", "jsType", noType);
            setField(first10, "com.google.javascript.rhino.Node", "parent", parameters18);
            setField(parameters18, "com.google.javascript.rhino.Node", "first", first10);
            setField(parameters18, "com.google.javascript.rhino.Node", "last", first10);
            setField(parameters18, "com.google.javascript.rhino.Node", "sourcePosition", -1);
            setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters18);
            setField(call20, "com.google.javascript.rhino.jstype.ArrowType", "returnType", allType);
            setField(call20, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call20);
            setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
            setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType8);
            List implementedInterfaces20 = new ArrayList();
            functionType5.setImplementedInterfaces(implementedInterfaces20);
            HashMap properties52 = new HashMap();
            setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties52);
            setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype", typeOfThis6);
            setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[49] = ((JSType) functionType5);
            UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates2 = new LinkedHashSet();
            alternates2.add(implicitPrototype);
            alternates2.add(numberType);
            alternates2.add(returnType);
            setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates2);
            setField(unionType2, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 279159228);
            setField(unionType2, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[50] = ((JSType) unionType2);
            UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates3 = new LinkedHashSet();
            alternates3.add(implicitPrototype);
            alternates3.add(numberType);
            alternates3.add(booleanType);
            alternates3.add(returnType);
            setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates3);
            setField(unionType3, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 1114830558);
            setField(unionType3, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[51] = ((JSType) unionType3);
            UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates4 = new LinkedHashSet();
            alternates4.add(numberType);
            alternates4.add(booleanType);
            alternates4.add(returnType);
            setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates4);
            setField(unionType4, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -1240635521);
            setField(unionType4, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[52] = ((JSType) unionType4);
            UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates5 = new LinkedHashSet();
            alternates5.add(numberType);
            alternates5.add(returnType);
            setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates5);
            setField(unionType5, "com.google.javascript.rhino.jstype.UnionType", "hashcode", -2076306851);
            setField(unionType5, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            nativeTypes[53] = ((JSType) unionType5);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            HashMap namesToTypes = new HashMap();
            String string13 = "Undefined";
            namesToTypes.put(string13, voidType);
            String string14 = "Null";
            namesToTypes.put(string14, nullType);
            String string15 = "void";
            namesToTypes.put(string15, voidType);
            String string16 = "string";
            namesToTypes.put(string16, returnType);
            namesToTypes.put(className5, typeOfThis2);
            namesToTypes.put(className12, typeOfThis9);
            namesToTypes.put(className9, returnType1);
            namesToTypes.put(className8, typeOfThis5);
            namesToTypes.put(className3, typeOfThis);
            namesToTypes.put(className13, typeOfThis10);
            namesToTypes.put(className2, instanceObjectType2);
            String string17 = "undefined";
            namesToTypes.put(string17, voidType);
            namesToTypes.put(className, instanceObjectType);
            String string18 = "number";
            namesToTypes.put(string18, numberType);
            namesToTypes.put(className10, typeOfThis6);
            String string19 = "boolean";
            namesToTypes.put(string19, booleanType);
            String string20 = "null";
            namesToTypes.put(string20, nullType);
            namesToTypes.put(className11, instanceObjectType3);
            namesToTypes.put(className6, typeOfThis3);
            namesToTypes.put(className7, typeOfThis4);
            namesToTypes.put(className4, typeOfThis1);
            namesToTypes.put(className14, implicitPrototype);
            namesToTypes.put(className1, instanceObjectType1);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
            HashSet namespaces = new HashSet();
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
            HashSet enumTypeNames = new HashSet();
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames", enumTypeNames);
            HashSet forwardDeclaredTypes = new HashSet();
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
            HashMap typesIndexedByProperty = new HashMap();
            String string21 = "prototype";
            HashSet hashSet = new HashSet();
            hashSet.add(functionType1);
            typesIndexedByProperty.put(string21, hashSet);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
            HashMap greatestSubtypeByProperty = new HashMap();
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
            HashMultimap interfaceToImplementors = ((HashMultimap) createInstance("com.google.common.collect.HashMultimap"));
            setField(interfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey", 8);
            HashMap map = new HashMap();
            setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
            ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
            setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
            HashMap map1 = new HashMap();
            setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
            ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
            setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
            HashMap map2 = new HashMap();
            setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
            setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
            typeRegistry.setLastGeneration(true);
            setField(expected, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
            TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
            setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "compiler", expected);
            setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
            UnionType allValueTypes = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
            Set alternates6 = new LinkedHashSet();
            alternates6.add(nullType);
            alternates6.add(voidType);
            alternates6.add(numberType);
            alternates6.add(booleanType);
            alternates6.add(returnType);
            setField(allValueTypes, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates6);
            setField(allValueTypes, "com.google.javascript.rhino.jstype.UnionType", "hashcode", 247537301);
            setField(allValueTypes, "com.google.javascript.rhino.jstype.JSType", "registry", typeRegistry);
            setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
            ArrayList mismatches = new ArrayList();
            setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches", mismatches);
            setField(expected, "com.google.javascript.jscomp.Compiler", "typeValidator", typeValidator);
            setField(expected, "com.google.javascript.jscomp.Compiler", "oldErrorReporter", reporter);
            Object defaultErrorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter");
            Map typeMap1 = new LinkedHashMap();
            String string22 = "\\Qextra @fileoverview tag\\E";
            typeMap1.put(string22, diagnosticType);
            String string23 = "\\QTrailing comma is not legal in an ECMA-262 object initializer\\E";
            typeMap1.put(string23, diagnosticType1);
            String string24 = "\\QDuplicate parameter name \"\\E.*\\Q\".\\E";
            typeMap1.put(string24, diagnosticType2);
            String string25 = "\\Qillegal use of unknown JSDoc tag \"\\E.*\\Q\"; ignoring it\\E";
            typeMap1.put(string25, diagnosticType3);
            setField(defaultErrorReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap", typeMap1);
            setField(defaultErrorReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler", expected);
            setField(expected, "com.google.javascript.jscomp.Compiler", "defaultErrorReporter", defaultErrorReporter);
            setField(expected, "com.google.javascript.jscomp.Compiler", "outStream", err);
            PassFactory sanityCheck = ((PassFactory) createInstance("com.google.javascript.jscomp.Compiler$3"));
            setField(sanityCheck, "com.google.javascript.jscomp.Compiler$3", "this$0", expected);
            String name = "sanityCheck";
            setField(sanityCheck, "com.google.javascript.jscomp.PassFactory", "name", name);
            setField(expected, "com.google.javascript.jscomp.Compiler", "sanityCheck", sanityCheck);
            CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
            setField(expected, "com.google.javascript.jscomp.Compiler", "recentChange", recentChange);
            ArrayList codeChangeHandlers = new ArrayList();
            codeChangeHandlers.add(recentChange);
            setField(expected, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
            
            CompilerOptions actualOptions = actual.options;
            assertNull(actualOptions);
            
            PassConfig actualPasses = ((PassConfig) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "passes"));
            assertNull(actualPasses);
            
            com.google.javascript.jscomp.CompilerInput[] actualExterns = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "externs"));
            assertNull(actualExterns);
            
            com.google.javascript.jscomp.JSModule[] actualModules = ((com.google.javascript.jscomp.JSModule[]) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "modules"));
            assertNull(actualModules);
            
            JSModuleGraph actualModuleGraph = actual.getModuleGraph();
            assertNull(actualModuleGraph);
            
            com.google.javascript.jscomp.CompilerInput[] actualInputs = ((com.google.javascript.jscomp.CompilerInput[]) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "inputs"));
            assertNull(actualInputs);
            
            ErrorManager actualErrorManager = actual.getErrorManager();
            assertNull(actualErrorManager);
            
            SymbolTable actualSymbolTable = ((SymbolTable) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "symbolTable"));
            assertNull(actualSymbolTable);
            
            Node actualExternsRoot = actual.externsRoot;
            assertNull(actualExternsRoot);
            
            Node actualJsRoot = actual.jsRoot;
            assertNull(actualJsRoot);
            
            Node actualExternAndJsRoot = actual.externAndJsRoot;
            assertNull(actualExternAndJsRoot);
            
            Map actualInputsByName = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "inputsByName"));
            assertNull(actualInputsByName);
            
            SourceMap actualSourceMap = actual.getSourceMap();
            assertNull(actualSourceMap);
            
            String actualExternExports = ((String) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "externExports"));
            assertNull(actualExternExports);
            
            int expectedUniqueNameId = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
            int actualUniqueNameId = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "uniqueNameId"));
            assertEquals(expectedUniqueNameId, actualUniqueNameId);
            
            boolean actualNormalized = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "normalized"));
            assertFalse(actualNormalized);
            
            boolean actualUseThreads = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "useThreads"));
            assertTrue(actualUseThreads);
            
            FunctionInformationMap actualFunctionInformationMap = ((FunctionInformationMap) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "functionInformationMap"));
            assertNull(actualFunctionInformationMap);
            
            StringBuilder expectedDebugLog = ((StringBuilder) getFieldValue(expected, "com.google.javascript.jscomp.Compiler", "debugLog"));
            StringBuilder actualDebugLog = ((StringBuilder) getFieldValue(actual, "com.google.javascript.jscomp.Compiler", "debugLog"));
            
            CodingConvention expectedDefaultCodingConvention = expected.defaultCodingConvention;
            CodingConvention actualDefaultCodingConvention = actual.defaultCodingConvention;
            Set expectedDefaultCodingConventionPropertyTestFunctions = ((Set) getFieldValue(expectedDefaultCodingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions"));
            Set actualDefaultCodingConventionPropertyTestFunctions = ((Set) getFieldValue(actualDefaultCodingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions"));
            assertTrue(deepEquals(expectedDefaultCodingConventionPropertyTestFunctions, actualDefaultCodingConventionPropertyTestFunctions));
            
            JSTypeRegistry expectedTypeRegistry = expected.getTypeRegistry();
            JSTypeRegistry actualTypeRegistry = actual.getTypeRegistry();
            ErrorReporter expectedTypeRegistryReporter = ((ErrorReporter) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            Map expectedTypeRegistryReporterTypeMap = ((Map) getFieldValue(expectedTypeRegistryReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap"));
            Map actualTypeRegistryReporterTypeMap = ((Map) getFieldValue(actualTypeRegistryReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap"));
            assertTrue(deepEquals(expectedTypeRegistryReporterTypeMap, actualTypeRegistryReporterTypeMap));
            
            AbstractCompiler expectedTypeRegistryReporterCompiler = ((AbstractCompiler) getFieldValue(expectedTypeRegistryReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler"));
            AbstractCompiler actualTypeRegistryReporterCompiler = ((AbstractCompiler) getFieldValue(actualTypeRegistryReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "compiler"));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompiler, actualTypeRegistryReporterCompiler));
            Config actualTypeRegistryReporterCompilerParserConfig = (((Compiler) actualTypeRegistryReporterCompiler)).getParserConfig();
            assertNull(actualTypeRegistryReporterCompilerParserConfig);
            
            ReverseAbstractInterpreter actualTypeRegistryReporterCompilerAbstractInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "abstractInterpreter"));
            assertNull(actualTypeRegistryReporterCompilerAbstractInterpreter);
            
            TypeValidator expectedTypeRegistryReporterCompilerTypeValidator = (((Compiler) expectedTypeRegistryReporterCompiler)).getTypeValidator();
            TypeValidator actualTypeRegistryReporterCompilerTypeValidator = (((Compiler) actualTypeRegistryReporterCompiler)).getTypeValidator();
            AbstractCompiler expectedTypeRegistryReporterCompilerTypeValidatorCompiler = ((AbstractCompiler) getFieldValue(expectedTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "compiler"));
            AbstractCompiler actualTypeRegistryReporterCompilerTypeValidatorCompiler = ((AbstractCompiler) getFieldValue(actualTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "compiler"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerTypeValidatorCompiler, actualTypeRegistryReporterCompilerTypeValidatorCompiler));
            
            JSTypeRegistry expectedTypeRegistryReporterCompilerTypeValidatorTypeRegistry = ((JSTypeRegistry) getFieldValue(expectedTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
            JSTypeRegistry actualTypeRegistryReporterCompilerTypeValidatorTypeRegistry = ((JSTypeRegistry) getFieldValue(actualTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerTypeValidatorTypeRegistry, actualTypeRegistryReporterCompilerTypeValidatorTypeRegistry));
            
            JSType expectedTypeRegistryReporterCompilerTypeValidatorAllValueTypes = ((JSType) getFieldValue(expectedTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes"));
            JSType actualTypeRegistryReporterCompilerTypeValidatorAllValueTypes = ((JSType) getFieldValue(actualTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerTypeValidatorAllValueTypes, actualTypeRegistryReporterCompilerTypeValidatorAllValueTypes));
            
            List expectedTypeRegistryReporterCompilerTypeValidatorMismatches = ((List) getFieldValue(expectedTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches"));
            List actualTypeRegistryReporterCompilerTypeValidatorMismatches = ((List) getFieldValue(actualTypeRegistryReporterCompilerTypeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerTypeValidatorMismatches, actualTypeRegistryReporterCompilerTypeValidatorMismatches));
            
            PerformanceTracker actualTypeRegistryReporterCompilerTracker = ((PerformanceTracker) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "tracker"));
            assertNull(actualTypeRegistryReporterCompilerTracker);
            
            ErrorReporter expectedTypeRegistryReporterCompilerOldErrorReporter = ((ErrorReporter) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
            ErrorReporter actualTypeRegistryReporterCompilerOldErrorReporter = ((ErrorReporter) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "oldErrorReporter"));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerOldErrorReporter, actualTypeRegistryReporterCompilerOldErrorReporter));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerOldErrorReporter, actualTypeRegistryReporterCompilerOldErrorReporter));
            
            com.google.javascript.jscomp.mozilla.rhino.ErrorReporter expectedTypeRegistryReporterCompilerDefaultErrorReporter = (((Compiler) expectedTypeRegistryReporterCompiler)).getDefaultErrorReporter();
            com.google.javascript.jscomp.mozilla.rhino.ErrorReporter actualTypeRegistryReporterCompilerDefaultErrorReporter = (((Compiler) actualTypeRegistryReporterCompiler)).getDefaultErrorReporter();
            Map expectedTypeRegistryReporterCompilerDefaultErrorReporterTypeMap = ((Map) getFieldValue(expectedTypeRegistryReporterCompilerDefaultErrorReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap"));
            Map actualTypeRegistryReporterCompilerDefaultErrorReporterTypeMap = ((Map) getFieldValue(actualTypeRegistryReporterCompilerDefaultErrorReporter, "com.google.javascript.jscomp.RhinoErrorReporter", "typeMap"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerDefaultErrorReporterTypeMap, actualTypeRegistryReporterCompilerDefaultErrorReporterTypeMap));
            
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerDefaultErrorReporter, actualTypeRegistryReporterCompilerDefaultErrorReporter));
            
            PrintStream expectedTypeRegistryReporterCompilerOutStream = ((PrintStream) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "outStream"));
            PrintStream actualTypeRegistryReporterCompilerOutStream = ((PrintStream) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "outStream"));
            boolean actualTypeRegistryReporterCompilerOutStreamAutoFlush = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.PrintStream", "autoFlush"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamAutoFlush, actualTypeRegistryReporterCompilerOutStreamAutoFlush));
            
            boolean actualTypeRegistryReporterCompilerOutStreamTrouble = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.PrintStream", "trouble"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamTrouble, actualTypeRegistryReporterCompilerOutStreamTrouble));
            
            Formatter actualTypeRegistryReporterCompilerOutStreamFormatter = ((Formatter) getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.PrintStream", "formatter"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamFormatter, actualTypeRegistryReporterCompilerOutStreamFormatter));
            
            BufferedWriter actualTypeRegistryReporterCompilerOutStreamTextOut = ((BufferedWriter) getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.PrintStream", "textOut"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamTextOut, actualTypeRegistryReporterCompilerOutStreamTextOut));
            
            OutputStreamWriter actualTypeRegistryReporterCompilerOutStreamCharOut = ((OutputStreamWriter) getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.PrintStream", "charOut"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamCharOut, actualTypeRegistryReporterCompilerOutStreamCharOut));
            
            boolean actualTypeRegistryReporterCompilerOutStreamClosing = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.PrintStream", "closing"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamClosing, actualTypeRegistryReporterCompilerOutStreamClosing));
            
            OutputStream actualTypeRegistryReporterCompilerOutStreamOut = ((OutputStream) getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.FilterOutputStream", "out"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamOut, actualTypeRegistryReporterCompilerOutStreamOut));
            
            boolean actualTypeRegistryReporterCompilerOutStreamClosed = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.FilterOutputStream", "closed"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamClosed, actualTypeRegistryReporterCompilerOutStreamClosed));
            
            Object actualTypeRegistryReporterCompilerOutStreamCloseLock = getFieldValue(actualTypeRegistryReporterCompilerOutStream, "java.io.FilterOutputStream", "closeLock");
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerOutStreamCloseLock, actualTypeRegistryReporterCompilerOutStreamCloseLock));
            
            PassFactory expectedTypeRegistryReporterCompilerSanityCheck = ((PassFactory) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
            PassFactory actualTypeRegistryReporterCompilerSanityCheck = ((PassFactory) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "sanityCheck"));
            String expectedTypeRegistryReporterCompilerSanityCheckName = expectedTypeRegistryReporterCompilerSanityCheck.getName();
            String actualTypeRegistryReporterCompilerSanityCheckName = actualTypeRegistryReporterCompilerSanityCheck.getName();
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerSanityCheckName, actualTypeRegistryReporterCompilerSanityCheckName));
            
            boolean actualTypeRegistryReporterCompilerSanityCheckIsOneTimePass = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerSanityCheck, "com.google.javascript.jscomp.PassFactory", "isOneTimePass"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerSanityCheckIsOneTimePass, actualTypeRegistryReporterCompilerSanityCheckIsOneTimePass));
            
            boolean actualTypeRegistryReporterCompilerSanityCheckIsCreated = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerSanityCheck, "com.google.javascript.jscomp.PassFactory", "isCreated"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerSanityCheckIsCreated, actualTypeRegistryReporterCompilerSanityCheckIsCreated));
            
            Tracer actualTypeRegistryReporterCompilerCurrentTracer = ((Tracer) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "currentTracer"));
            assertNull(actualTypeRegistryReporterCompilerCurrentTracer);
            
            String actualTypeRegistryReporterCompilerCurrentPassName = ((String) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "currentPassName"));
            assertNull(actualTypeRegistryReporterCompilerCurrentPassName);
            
            CodeChangeHandler.RecentChange expectedTypeRegistryReporterCompilerRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "recentChange"));
            CodeChangeHandler.RecentChange actualTypeRegistryReporterCompilerRecentChange = ((CodeChangeHandler.RecentChange) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "recentChange"));
            boolean actualTypeRegistryReporterCompilerRecentChangeHasChanged = ((Boolean) getFieldValue(actualTypeRegistryReporterCompilerRecentChange, "com.google.javascript.jscomp.CodeChangeHandler$RecentChange", "hasChanged"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualTypeRegistryReporterCompilerRecentChangeHasChanged, actualTypeRegistryReporterCompilerRecentChangeHasChanged));
            
            List expectedTypeRegistryReporterCompilerCodeChangeHandlers = ((List) getFieldValue(expectedTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
            List actualTypeRegistryReporterCompilerCodeChangeHandlers = ((List) getFieldValue(actualTypeRegistryReporterCompiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers"));
            assertTrue(deepEquals(expectedTypeRegistryReporterCompilerCodeChangeHandlers, actualTypeRegistryReporterCompilerCodeChangeHandlers));
            
            com.google.javascript.rhino.jstype.JSType[] expectedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            int expectedTypeRegistryNativeTypesSize = expectedTypeRegistryNativeTypes.length;
            assertEquals(expectedTypeRegistryNativeTypesSize, actualTypeRegistryNativeTypes.length);
            assertTrue(deepEquals(expectedTypeRegistryNativeTypes, actualTypeRegistryNativeTypes));
            
            Map expectedTypeRegistryNamesToTypes = ((Map) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertTrue(deepEquals(expectedTypeRegistryNamesToTypes, actualTypeRegistryNamesToTypes));
            
            Set expectedTypeRegistryNamespaces = ((Set) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertTrue(deepEquals(expectedTypeRegistryNamespaces, actualTypeRegistryNamespaces));
            
            Set expectedTypeRegistryEnumTypeNames = ((Set) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertTrue(deepEquals(expectedTypeRegistryEnumTypeNames, actualTypeRegistryEnumTypeNames));
            
            Set expectedTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertTrue(deepEquals(expectedTypeRegistryForwardDeclaredTypes, actualTypeRegistryForwardDeclaredTypes));
            
            Map expectedTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertTrue(deepEquals(expectedTypeRegistryTypesIndexedByProperty, actualTypeRegistryTypesIndexedByProperty));
            
            Map expectedTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertTrue(deepEquals(expectedTypeRegistryGreatestSubtypeByProperty, actualTypeRegistryGreatestSubtypeByProperty));
            
            Multimap expectedTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            int expectedTypeRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(expectedTypeRegistryInterfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
            int actualTypeRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
            assertEquals(expectedTypeRegistryInterfaceToImplementorsExpectedValuesPerKey, actualTypeRegistryInterfaceToImplementorsExpectedValuesPerKey);
            
            Map expectedTypeRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
            Map actualTypeRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
            assertTrue(deepEquals(expectedTypeRegistryInterfaceToImplementorsMap, actualTypeRegistryInterfaceToImplementorsMap));
            
            int expectedTypeRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
            int actualTypeRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
            assertEquals(expectedTypeRegistryInterfaceToImplementorsTotalSize, actualTypeRegistryInterfaceToImplementorsTotalSize);
            
            Set actualTypeRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
            assertNull(actualTypeRegistryInterfaceToImplementorsKeySet);
            
            Multiset actualTypeRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
            assertNull(actualTypeRegistryInterfaceToImplementorsMultiset);
            
            Collection actualTypeRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
            assertNull(actualTypeRegistryInterfaceToImplementorsValuesCollection);
            
            Collection actualTypeRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
            assertNull(actualTypeRegistryInterfaceToImplementorsEntries);
            
            Map actualTypeRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualTypeRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
            assertNull(actualTypeRegistryInterfaceToImplementorsAsMap);
            
            Multimap expectedTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            int expectedTypeRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedTypeRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
            int actualTypeRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualTypeRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
            assertEquals(expectedTypeRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualTypeRegistryUnresolvedNamedTypesExpectedValuesPerKey);
            
            Map expectedTypeRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedTypeRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
            Map actualTypeRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualTypeRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypesMap, actualTypeRegistryUnresolvedNamedTypesMap));
            
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryUnresolvedNamedTypes, actualTypeRegistryUnresolvedNamedTypes));
            
            Multimap expectedTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            Map expectedTypeRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedTypeRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
            Map actualTypeRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualTypeRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypesMap, actualTypeRegistryResolvedNamedTypesMap));
            
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            assertTrue(deepEquals(expectedTypeRegistryResolvedNamedTypes, actualTypeRegistryResolvedNamedTypes));
            
            boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertTrue(actualTypeRegistryLastGeneration);
            
            String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualTypeRegistryTemplateTypeName);
            
            TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualTypeRegistryTemplateType);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
        */
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
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
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
    public void testGetDefaultExterns_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns] produces [java.lang.NullPointerException: in is null]
            java.base/java.util.zip.ZipInputStream.<init>(ZipInputStream.java:103)
            java.base/java.util.zip.ZipInputStream.<init>(ZipInputStream.java:82)
            com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns(CommandLineRunner.java:466) */
        Class commandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Method getDefaultExternsMethod = commandLineRunnerClazz.getDeclaredMethod("getDefaultExterns");
        getDefaultExternsMethod.setAccessible(true);
        java.lang.Object[] getDefaultExternsMethodArguments = new java.lang.Object[0];
        try {
            getDefaultExternsMethod.invoke(commandLineRunner, getDefaultExternsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getDefaultExterns
    
    public void testGetDefaultExterns_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
        // 2 occurrences of:
        // Field $assertionsDisabled is not declared in class java.lang.ClassLoader
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields936077043757800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields936077043757800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass936077043764900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936077043757800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936077043764900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields936077050786300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields936077050786300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass936077050791200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936077050786300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936077050791200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields936077051614800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields936077051614800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass936077051618600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936077051614800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936077051618600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields936077052476100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields936077052476100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass936077052480200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields936077052476100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass936077052480200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

