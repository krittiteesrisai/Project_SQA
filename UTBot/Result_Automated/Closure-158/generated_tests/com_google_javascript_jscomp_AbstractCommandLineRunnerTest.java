package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.List;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException;
import com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig;
import java.io.IOException;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import org.junit.Ignore;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.LinkedHashSet;
import java.util.Set;
import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.HashMap;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static java.util.Collections.emptyList;

public final class com_google_javascript_jscomp_AbstractCommandLineRunnerTest {
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.getCompiler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCompiler()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getCompiler()}
 * @utbot.returnsFrom {@code return compiler;}
 *  */
    @Test
    public void testGetCompiler_ReturnCompiler() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        Compiler actual = commandLineRunner.getCompiler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.run
    
    ///region Errors report for run
    
    public void testRun_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.isInTestMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInTestMode()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#isInTestMode()}
 * @utbot.returnsFrom {@code return testMode;}
 *  */
    @Test
    public void testIsInTestMode_ReturnTestMode() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        boolean actual = commandLineRunner.isInTestMode();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createExternInputs(java.util.List)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createExternInputs(java.util.List)}
 * @utbot.executesCondition {@code (files.isEmpty()): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes {@link com.google.javascript.jscomp.JSSourceFile#fromCode(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#of(java.lang.Object)}
 * @utbot.returnsFrom {@code return ImmutableList.of(JSSourceFile.fromCode("/dev/null", ""));}
 *  */
    @Test
    public void testCreateExternInputs_FilesIsEmpty() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        ArrayList arrayList = new ArrayList();
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class arrayListType = Class.forName("java.util.List");
        Method createExternInputsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("createExternInputs", arrayListType);
        createExternInputsMethod.setAccessible(true);
        java.lang.Object[] createExternInputsMethodArguments = new java.lang.Object[1];
        createExternInputsMethodArguments[0] = arrayList;
        List actual = ((List) createExternInputsMethod.invoke(commandLineRunner, createExternInputsMethodArguments));
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createExternInputs(java.util.List)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createExternInputs(java.util.List)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: files.isEmpty()
 *  */
    @Test
    public void testCreateExternInputs_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs(AbstractCommandLineRunner.java:375) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class listType = Class.forName("java.util.List");
        Method createExternInputsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("createExternInputs", listType);
        createExternInputsMethod.setAccessible(true);
        java.lang.Object[] createExternInputsMethodArguments = new java.lang.Object[1];
        createExternInputsMethodArguments[0] = ((Object) null);
        try {
            createExternInputsMethod.invoke(commandLineRunner, createExternInputsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createJsModules
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createJsModules(java.util.List, java.util.List)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createJsModules(java.util.List,java.util.List)}
 * @utbot.executesCondition {@code (isInTestMode()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner#isInTestMode()}
 * @utbot.invokes {@link com.google.common.base.Supplier#get()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return modulesSupplierForTesting.get();
 *  */
    @Test
    public void testCreateJsModules_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode", true);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createJsModules] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createJsModules(AbstractCommandLineRunner.java:398) */
        commandLineRunner.createJsModules(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createJsModules(java.util.List, java.util.List)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createJsModules(java.util.List,java.util.List)}
 * @utbot.executesCondition {@code (isInTestMode()): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(specs != null);): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner#isInTestMode()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(specs != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCreateJsModules_ThrowIllegalStateException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        commandLineRunner.createJsModules(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createJsModules(java.util.List, java.util.List)
    
    @Test
    public void testCreateJsModules1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode", true);
        Supplier modulesSupplierForTesting = ((Supplier) createInstance("com.google.javascript.jscomp.Compiler$4"));
        Compiler val$self = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(val$self, "com.google.javascript.jscomp.Compiler", "uniqueNameId", 1);
        setField(modulesSupplierForTesting, "com.google.javascript.jscomp.Compiler$4", "val$self", val$self);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "modulesSupplierForTesting", modulesSupplierForTesting);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createJsModules] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createJsModules(AbstractCommandLineRunner.java:398) */
        commandLineRunner.createJsModules(null, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createSourceInputs(java.util.List)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createSourceInputs(java.util.List)}
 * @utbot.executesCondition {@code (isInTestMode()): True}
 * @utbot.invokes {@link com.google.common.base.Supplier#get()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return inputsSupplierForTesting.get();
 *  */
    @Test
    public void testCreateSourceInputs_ThrowClassCastException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode", true);
        Supplier inputsSupplierForTesting = ((Supplier) createInstance("com.google.javascript.jscomp.Compiler$4"));
        Compiler val$self = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(val$self, "com.google.javascript.jscomp.Compiler", "uniqueNameId", Integer.MIN_VALUE);
        setField(inputsSupplierForTesting, "com.google.javascript.jscomp.Compiler$4", "val$self", val$self);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "inputsSupplierForTesting", inputsSupplierForTesting);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs] produces [java.lang.ClassCastException: class java.lang.String cannot be cast to class java.util.List (java.lang.String and java.util.List are in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs(AbstractCommandLineRunner.java:358) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class listType = Class.forName("java.util.List");
        Method createSourceInputsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("createSourceInputs", listType);
        createSourceInputsMethod.setAccessible(true);
        java.lang.Object[] createSourceInputsMethodArguments = new java.lang.Object[1];
        createSourceInputsMethodArguments[0] = ((Object) null);
        try {
            createSourceInputsMethod.invoke(commandLineRunner, createSourceInputsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createSourceInputs(java.util.List)}
 * @utbot.executesCondition {@code (isInTestMode()): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: files.isEmpty()
 *  */
    @Test
    public void testCreateSourceInputs_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs(AbstractCommandLineRunner.java:360) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class listType = Class.forName("java.util.List");
        Method createSourceInputsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("createSourceInputs", listType);
        createSourceInputsMethod.setAccessible(true);
        java.lang.Object[] createSourceInputsMethodArguments = new java.lang.Object[1];
        createSourceInputsMethodArguments[0] = ((Object) null);
        try {
            createSourceInputsMethod.invoke(commandLineRunner, createSourceInputsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createSourceInputs(java.util.List)}
 * @utbot.executesCondition {@code (isInTestMode()): True}
 * @utbot.invokes {@link com.google.common.base.Supplier#get()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inputsSupplierForTesting.get();
 *  */
    @Test
    public void testCreateSourceInputs_ThrowNullPointerException_1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode", true);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs(AbstractCommandLineRunner.java:358) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class listType = Class.forName("java.util.List");
        Method createSourceInputsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("createSourceInputs", listType);
        createSourceInputsMethod.setAccessible(true);
        java.lang.Object[] createSourceInputsMethodArguments = new java.lang.Object[1];
        createSourceInputsMethodArguments[0] = ((Object) null);
        try {
            createSourceInputsMethod.invoke(commandLineRunner, createSourceInputsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createSourceInputs(java.util.List)
    
    @Test
    public void testCreateSourceInputs1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            com.google.javascript.jscomp.SourceFile.fromFile(SourceFile.java:241)
            com.google.javascript.jscomp.JSSourceFile.fromFile(JSSourceFile.java:39)
            com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs(AbstractCommandLineRunner.java:335)
            com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs(AbstractCommandLineRunner.java:364) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class arrayListType = Class.forName("java.util.List");
        Method createSourceInputsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("createSourceInputs", arrayListType);
        createSourceInputsMethod.setAccessible(true);
        java.lang.Object[] createSourceInputsMethodArguments = new java.lang.Object[1];
        createSourceInputsMethodArguments[0] = arrayList;
        try {
            createSourceInputsMethod.invoke(commandLineRunner, createSourceInputsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInputs(java.util.List, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createInputs(java.util.List,boolean)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return inputs;}
 *  */
    @Test
    public void testCreateInputs_ListIterator() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) commandLineRunner.createInputs(arrayList, false));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInputs(java.util.List, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createInputs(java.util.List,boolean)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<JSSourceFile> inputs = new ArrayList<JSSourceFile>(files.size());
 *  */
    @Test
    public void testCreateInputs_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs(AbstractCommandLineRunner.java:331) */
        commandLineRunner.createInputs(null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method createInputs(java.util.List, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createInputs(java.util.List,boolean)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(String filename: files)} once
 * @utbot.throwsException {@link com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException} when: !allowStdIn
 *  */
    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateInputs_ThrowFlagUsageException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        ArrayList arrayList = new ArrayList();
        String string = "-";
        arrayList.add(string);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        commandLineRunner.createInputs(arrayList, false);
    }
    ///endregion
    
    ///region Errors report for createInputs
    
    public void testCreateInputs_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.doRun
    
    ///region Errors report for doRun
    
    public void testDoRun_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.lang.ref.ReferenceQueue java.util.logging.Level$KnownLevel.QUEUE accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.processResults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processResults(com.google.javascript.jscomp.Result, java.util.List, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.computePhaseOrdering): True}
 *  */
    @Test
    public void testProcessResults_ConfigComputePhaseOrdering() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "computePhaseOrdering", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        int actual = commandLineRunner.processResults(null, null, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.computePhaseOrdering): False}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): False}
 * @utbot.executesCondition {@code (config.printTree): False}
 * @utbot.executesCondition {@code (result.success): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$2900(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.returnsFrom {@code return Math.min(result.errors.length, 0x7f);}
 *  */
    @Test
    public void testProcessResults_NotResultSuccess() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        Result result = ((Result) createInstance("com.google.javascript.jscomp.Result"));
        com.google.javascript.jscomp.JSError[] errors = {null};
        setField(result, "com.google.javascript.jscomp.Result", "errors", errors);
        
        int actual = commandLineRunner.processResults(result, null, null);
        
        assertEquals(1, actual);
        
        JSError finalResultErrors0 = result.errors[0];
        
        assertNull(finalResultErrors0);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.computePhaseOrdering): False}
 * @utbot.executesCondition {@code (config.printPassGraph): True}
 * @utbot.executesCondition {@code (compiler.getRoot() == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getRoot()}
 *  */
    @Test
    public void testProcessResults_CompilerGetRootEqualsNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "printPassGraph", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "compiler", compiler);
        
        int actual = commandLineRunner.processResults(null, null, null);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.computePhaseOrdering): False}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): True}
 * @utbot.executesCondition {@code (compiler.getRoot() == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getRoot()}
 *  */
    @Test
    public void testProcessResults_CompilerGetRootEqualsNull_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "printAst", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "compiler", compiler);
        
        int actual = commandLineRunner.processResults(null, null, null);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processResults(com.google.javascript.jscomp.Result, java.util.List, com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): False}
 * @utbot.executesCondition {@code (config.printTree): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: result.success
 *  */
    @Test
    public void testProcessResults_ThrowNullPointerException_3() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.processResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(AbstractCommandLineRunner.java:673) */
        commandLineRunner.processResults(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): False}
 * @utbot.executesCondition {@code (config.printTree): False}
 * @utbot.executesCondition {@code (result.success): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Math.min(result.errors.length, 0x7f);
 *  */
    @Test
    public void testProcessResults_ThrowNullPointerException_4() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        Result result = ((Result) createInstance("com.google.javascript.jscomp.Result"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.processResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(AbstractCommandLineRunner.java:743) */
        commandLineRunner.processResults(result, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): False}
 * @utbot.executesCondition {@code (config.printTree): False}
 * @utbot.executesCondition {@code (result.success): True}
 * @utbot.executesCondition {@code (modules == null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3100(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.invokes com.google.javascript.jscomp.AbstractCommandLineRunner#maybeCreateDirsForPath(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maybeCreateDirsForPath(moduleFilePrefix);
 *  */
    @Test
    public void testProcessResults_ThrowNullPointerException_6() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        Result result = ((Result) createInstance("com.google.javascript.jscomp.Result"));
        setField(result, "com.google.javascript.jscomp.Result", "success", true);
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.processResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.maybeCreateDirsForPath(AbstractCommandLineRunner.java:578)
            com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(AbstractCommandLineRunner.java:682) */
        commandLineRunner.processResults(result, arrayList, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.printPassGraph): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getRoot() == null
 *  */
    @Test
    public void testProcessResults_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "printPassGraph", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.processResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(AbstractCommandLineRunner.java:642) */
        commandLineRunner.processResults(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getRoot() == null
 *  */
    @Test
    public void testProcessResults_ThrowNullPointerException_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "printAst", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.processResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(AbstractCommandLineRunner.java:652) */
        commandLineRunner.processResults(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): False}
 * @utbot.executesCondition {@code (config.printTree): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getRoot() == null
 *  */
    @Test
    public void testProcessResults_ThrowNullPointerException_2() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "printTree", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.processResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(AbstractCommandLineRunner.java:663) */
        commandLineRunner.processResults(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): False}
 * @utbot.executesCondition {@code (config.printTree): False}
 * @utbot.executesCondition {@code (result.success): True}
 * @utbot.executesCondition {@code (modules == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#toSource()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeOutput(out, compiler, compiler.toSource(), config.outputWrapper, OUTPUT_WRAPPER_MARKER);
 *  */
    @Test
    public void testProcessResults_ThrowNullPointerException_5() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        Result result = ((Result) createInstance("com.google.javascript.jscomp.Result"));
        setField(result, "com.google.javascript.jscomp.Result", "success", true);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.processResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(AbstractCommandLineRunner.java:675) */
        commandLineRunner.processResults(result, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#processResults(com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.printPassGraph): False}
 * @utbot.executesCondition {@code (config.printAst): False}
 * @utbot.executesCondition {@code (config.printTree): True}
 * @utbot.executesCondition {@code (compiler.getRoot() == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getRoot()}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append("Code contains errors; no tree was generated.\n");
 *  */
    @Test
    public void testProcessResults_ThrowNullPointerException_7() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "printTree", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.processResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(AbstractCommandLineRunner.java:664) */
        commandLineRunner.processResults(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.getInputCharset
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInputCharset()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getInputCharset()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3300(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !config.charset.isEmpty()
 *  */
    @Test
    public void testGetInputCharset_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.getInputCharset] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.getInputCharset(AbstractCommandLineRunner.java:754) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method getInputCharsetMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("getInputCharset");
        getInputCharsetMethod.setAccessible(true);
        java.lang.Object[] getInputCharsetMethodArguments = new java.lang.Object[0];
        try {
            getInputCharsetMethod.invoke(commandLineRunner, getInputCharsetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getInputCharset
    
    public void testGetInputCharset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.getOutputCharset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOutputCharset()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getOutputCharset()}
 * @utbot.executesCondition {@code (!config.charset.isEmpty()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3300(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.returnsFrom {@code return "US-ASCII";}
 *  */
    @Test
    public void testGetOutputCharset_ConfigCharsetIsEmpty() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String charset = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "charset", charset);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method getOutputCharsetMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("getOutputCharset");
        getOutputCharsetMethod.setAccessible(true);
        java.lang.Object[] getOutputCharsetMethodArguments = new java.lang.Object[0];
        String actual = ((String) getOutputCharsetMethod.invoke(commandLineRunner, getOutputCharsetMethodArguments));
        
        String expected = "US-ASCII";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOutputCharset()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getOutputCharset()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3300(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !config.charset.isEmpty()
 *  */
    @Test
    public void testGetOutputCharset_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.getOutputCharset] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.getOutputCharset(AbstractCommandLineRunner.java:777) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method getOutputCharsetMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("getOutputCharset");
        getOutputCharsetMethod.setAccessible(true);
        java.lang.Object[] getOutputCharsetMethodArguments = new java.lang.Object[0];
        try {
            getOutputCharsetMethod.invoke(commandLineRunner, getOutputCharsetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getOutputCharset
    
    public void testGetOutputCharset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns
    
    ///region Errors report for createExterns
    
    public void testCreateExterns_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.checkModuleName
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method checkModuleName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#checkModuleName(java.lang.String)}
 * @utbot.executesCondition {@code (!TokenStream.isJSIdentifier(name)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.TokenStream#isJSIdentifier(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException} when: !TokenStream.isJSIdentifier(name)
 *  */
    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCheckModuleName_ThrowFlagUsageException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        String string = "";
        
        commandLineRunner.checkModuleName(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeOutput(java.lang.Appendable, com.google.javascript.jscomp.Compiler, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#writeOutput(java.lang.Appendable,com.google.javascript.jscomp.Compiler,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pos = wrapper.indexOf(codePlaceholder);
 *  */
    @Test
    public void testWriteOutput_ThrowNullPointerException() throws IOException  {
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(AbstractCommandLineRunner.java:542) */
        AbstractCommandLineRunner.writeOutput(null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#writeOutput(java.lang.Appendable,com.google.javascript.jscomp.Compiler,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (pos != -1): True}
 * @utbot.executesCondition {@code (pos > 0): False}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.append(code);
 *  */
    @Test
    public void testWriteOutput_ThrowNullPointerException_1() throws IOException  {
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(AbstractCommandLineRunner.java:551) */
        AbstractCommandLineRunner.writeOutput(null, null, null, string, string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeOutput(java.lang.Appendable, com.google.javascript.jscomp.Compiler, java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#writeOutput(java.lang.Appendable,com.google.javascript.jscomp.Compiler,java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (pos != -1): True}
 * @utbot.executesCondition {@code (pos > 0): False}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.io.IOException} in: out.append(code);
 *  */
    @Test(expected = IOException.class)
    public void testWriteOutput_ThrowIOException() throws Throwable  {
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        String string = " ";
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class compilerType = Class.forName("com.google.javascript.jscomp.Compiler");
        Class stringType = Class.forName("java.lang.String");
        Method writeOutputMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("writeOutput", outputStreamWriterType, compilerType, stringType, stringType, stringType);
        writeOutputMethod.setAccessible(true);
        java.lang.Object[] writeOutputMethodArguments = new java.lang.Object[5];
        writeOutputMethodArguments[0] = outputStreamWriter;
        writeOutputMethodArguments[1] = ((Object) null);
        writeOutputMethodArguments[2] = ((Object) null);
        writeOutputMethodArguments[3] = string;
        writeOutputMethodArguments[4] = string;
        try {
            writeOutputMethod.invoke(null, writeOutputMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method writeOutput(java.lang.Appendable, com.google.javascript.jscomp.Compiler, java.lang.String, java.lang.String, java.lang.String)
    
    @Test
    public void testWriteOutputByFuzzer() throws IOException  {
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(AbstractCommandLineRunner.java:568) */
        AbstractCommandLineRunner.writeOutput(null, null, "ZX", "", "10");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outputSourceMap(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputSourceMap(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testOutputSourceMap_Return() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputSourceMapMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputSourceMap", compilerOptionsType);
        outputSourceMapMethod.setAccessible(true);
        java.lang.Object[] outputSourceMapMethodArguments = new java.lang.Object[1];
        outputSourceMapMethodArguments[0] = compilerOptions;
        outputSourceMapMethod.invoke(commandLineRunner, outputSourceMapMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputSourceMap(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testOutputSourceMap_Return_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputSourceMapMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputSourceMap", compilerOptionsType);
        outputSourceMapMethod.setAccessible(true);
        java.lang.Object[] outputSourceMapMethodArguments = new java.lang.Object[1];
        outputSourceMapMethodArguments[0] = compilerOptions;
        outputSourceMapMethod.invoke(commandLineRunner, outputSourceMapMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outputSourceMap(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputSourceMap(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: Strings.isEmpty(options.sourceMapOutputPath)
 *  */
    @Test
    public void testOutputSourceMap_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap(AbstractCommandLineRunner.java:922) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputSourceMapMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputSourceMap", compilerOptionsType);
        outputSourceMapMethod.setAccessible(true);
        java.lang.Object[] outputSourceMapMethodArguments = new java.lang.Object[1];
        outputSourceMapMethodArguments[0] = ((Object) null);
        try {
            outputSourceMapMethod.invoke(commandLineRunner, outputSourceMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputSourceMap(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String outName = expandSourceMapPath(options, null);
 *  */
    @Test
    public void testOutputSourceMap_ThrowNullPointerException_1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = " ";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:847)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(AbstractCommandLineRunner.java:861)
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap(AbstractCommandLineRunner.java:926) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputSourceMapMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputSourceMap", compilerOptionsType);
        outputSourceMapMethod.setAccessible(true);
        java.lang.Object[] outputSourceMapMethodArguments = new java.lang.Object[1];
        outputSourceMapMethodArguments[0] = compilerOptions;
        try {
            outputSourceMapMethod.invoke(commandLineRunner, outputSourceMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputSourceMap(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String outName = expandSourceMapPath(options, null);
 *  */
    @Test
    public void testOutputSourceMap_ThrowNullPointerException_2() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = " ";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap] produces [java.lang.NullPointerException]
            java.base/java.lang.String.replace(String.java:2963)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(AbstractCommandLineRunner.java:861)
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap(AbstractCommandLineRunner.java:926) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputSourceMapMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputSourceMap", compilerOptionsType);
        outputSourceMapMethod.setAccessible(true);
        java.lang.Object[] outputSourceMapMethodArguments = new java.lang.Object[1];
        outputSourceMapMethodArguments[0] = compilerOptions;
        try {
            outputSourceMapMethod.invoke(commandLineRunner, outputSourceMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputSourceMap(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String outName = expandSourceMapPath(options, null);
 *  */
    @Test
    public void testOutputSourceMap_ThrowNullPointerException_3() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = " ";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap] produces [java.lang.NullPointerException]
            java.base/java.lang.String.replace(String.java:2963)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(AbstractCommandLineRunner.java:861)
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap(AbstractCommandLineRunner.java:926) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputSourceMapMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputSourceMap", compilerOptionsType);
        outputSourceMapMethod.setAccessible(true);
        java.lang.Object[] outputSourceMapMethodArguments = new java.lang.Object[1];
        outputSourceMapMethodArguments[0] = compilerOptions;
        try {
            outputSourceMapMethod.invoke(commandLineRunner, outputSourceMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SECURITY for method outputSourceMap(com.google.javascript.jscomp.CompilerOptions)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testOutputSourceMap1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String jsOutputFile = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "jsOutputFile", jsOutputFile);
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "         " "write")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkWrite(SecurityManager.java:847)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:223)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:123)
            com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream(AbstractCommandLineRunner.java:897)
            com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToOutputWriter(AbstractCommandLineRunner.java:885)
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap(AbstractCommandLineRunner.java:927) */
    }
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testOutputSourceMap2() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        String moduleOutputPathPrefix = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "moduleOutputPathPrefix", moduleOutputPathPrefix);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "         " "write")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkWrite(SecurityManager.java:847)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:223)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:123)
            com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream(AbstractCommandLineRunner.java:897)
            com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToOutputWriter(AbstractCommandLineRunner.java:885)
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap(AbstractCommandLineRunner.java:927) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outputNameMaps(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputNameMaps(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.createNameMapFiles): False}
 * @utbot.executesCondition {@code (!config.variableMapOutputFile.equals("")): False}
 * @utbot.executesCondition {@code (!config.propertyMapOutputFile.equals("")): False}
 * @utbot.executesCondition {@code (variableMapOutputPath != null): False}
 * @utbot.executesCondition {@code (propertyMapOutputPath != null): False}
 * @utbot.executesCondition {@code (functionInformationMapOutputPath != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3600(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3700(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3800(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testOutputNameMaps_FunctionInformationMapOutputPathEqualsNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String variableMapOutputFile = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "variableMapOutputFile", variableMapOutputFile);
        String propertyMapOutputFile = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "propertyMapOutputFile", propertyMapOutputFile);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputNameMapsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputNameMaps", compilerOptionsType);
        outputNameMapsMethod.setAccessible(true);
        java.lang.Object[] outputNameMapsMethodArguments = new java.lang.Object[1];
        outputNameMapsMethodArguments[0] = ((Object) null);
        outputNameMapsMethod.invoke(commandLineRunner, outputNameMapsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outputNameMaps(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputNameMaps(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.createNameMapFiles): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String basePath = getMapPath(options.jsOutputFile);
 *  */
    @Test
    public void testOutputNameMaps_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "createNameMapFiles", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps(AbstractCommandLineRunner.java:980) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputNameMapsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputNameMaps", compilerOptionsType);
        outputNameMapsMethod.setAccessible(true);
        java.lang.Object[] outputNameMapsMethodArguments = new java.lang.Object[1];
        outputNameMapsMethodArguments[0] = ((Object) null);
        try {
            outputNameMapsMethod.invoke(commandLineRunner, outputNameMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputNameMaps(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.createNameMapFiles): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String basePath = getMapPath(options.jsOutputFile);
 *  */
    @Test
    public void testOutputNameMaps_ThrowNullPointerException_2() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "createNameMapFiles", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath(AbstractCommandLineRunner.java:941)
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps(AbstractCommandLineRunner.java:980) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputNameMapsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputNameMaps", compilerOptionsType);
        outputNameMapsMethod.setAccessible(true);
        java.lang.Object[] outputNameMapsMethodArguments = new java.lang.Object[1];
        outputNameMapsMethodArguments[0] = compilerOptions;
        try {
            outputNameMapsMethod.invoke(commandLineRunner, outputNameMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputNameMaps(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.createNameMapFiles): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !config.variableMapOutputFile.equals("")
 *  */
    @Test
    public void testOutputNameMaps_ThrowNullPointerException_1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps(AbstractCommandLineRunner.java:988) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputNameMapsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputNameMaps", compilerOptionsType);
        outputNameMapsMethod.setAccessible(true);
        java.lang.Object[] outputNameMapsMethodArguments = new java.lang.Object[1];
        outputNameMapsMethodArguments[0] = ((Object) null);
        try {
            outputNameMapsMethod.invoke(commandLineRunner, outputNameMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputNameMaps(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.createNameMapFiles): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String basePath = getMapPath(options.jsOutputFile);
 *  */
    @Test
    public void testOutputNameMaps_ThrowNullPointerException_3() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "createNameMapFiles", true);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String jsOutputFile = "";
        compilerOptions.jsOutputFile = jsOutputFile;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath(AbstractCommandLineRunner.java:944)
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps(AbstractCommandLineRunner.java:980) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputNameMapsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputNameMaps", compilerOptionsType);
        outputNameMapsMethod.setAccessible(true);
        java.lang.Object[] outputNameMapsMethodArguments = new java.lang.Object[1];
        outputNameMapsMethodArguments[0] = compilerOptions;
        try {
            outputNameMapsMethod.invoke(commandLineRunner, outputNameMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputNameMaps(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.createNameMapFiles): False}
 * @utbot.executesCondition {@code (!config.variableMapOutputFile.equals("")): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !config.propertyMapOutputFile.equals("")
 *  */
    @Test
    public void testOutputNameMaps_ThrowNullPointerException_4() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String variableMapOutputFile = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "variableMapOutputFile", variableMapOutputFile);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps(AbstractCommandLineRunner.java:997) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputNameMapsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputNameMaps", compilerOptionsType);
        outputNameMapsMethod.setAccessible(true);
        java.lang.Object[] outputNameMapsMethodArguments = new java.lang.Object[1];
        outputNameMapsMethodArguments[0] = ((Object) null);
        try {
            outputNameMapsMethod.invoke(commandLineRunner, outputNameMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputNameMaps(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.createNameMapFiles): False}
 * @utbot.executesCondition {@code (!config.variableMapOutputFile.equals("")): True}
 * @utbot.executesCondition {@code (variableMapOutputPath != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !config.propertyMapOutputFile.equals("")
 *  */
    @Test
    public void testOutputNameMaps_ThrowNullPointerException_5() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String variableMapOutputFile = " ";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "variableMapOutputFile", variableMapOutputFile);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps(AbstractCommandLineRunner.java:997) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputNameMapsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputNameMaps", compilerOptionsType);
        outputNameMapsMethod.setAccessible(true);
        java.lang.Object[] outputNameMapsMethodArguments = new java.lang.Object[1];
        outputNameMapsMethodArguments[0] = ((Object) null);
        try {
            outputNameMapsMethod.invoke(commandLineRunner, outputNameMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputNameMaps(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (config.createNameMapFiles): False}
 * @utbot.executesCondition {@code (!config.variableMapOutputFile.equals("")): True}
 * @utbot.executesCondition {@code (variableMapOutputPath != null): False}
 * @utbot.executesCondition {@code (!config.propertyMapOutputFile.equals("")): False}
 * @utbot.executesCondition {@code (variableMapOutputPath != null): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getVariableMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getVariableMap() != null
 *  */
    @Test
    public void testOutputNameMaps_ThrowNullPointerException_6() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String variableMapOutputFile = " ";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "variableMapOutputFile", variableMapOutputFile);
        String propertyMapOutputFile = "\u0000\u0000\u0000";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "propertyMapOutputFile", propertyMapOutputFile);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps(AbstractCommandLineRunner.java:1008) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method outputNameMapsMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputNameMaps", compilerOptionsType);
        outputNameMapsMethod.setAccessible(true);
        java.lang.Object[] outputNameMapsMethodArguments = new java.lang.Object[1];
        outputNameMapsMethodArguments[0] = ((Object) null);
        try {
            outputNameMapsMethod.invoke(commandLineRunner, outputNameMapsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for outputNameMaps
    
    public void testOutputNameMaps_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 26 occurrences of:
        /* Wrong number of type storages is provided, expected 2 arguments,
        but only 1 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.expandManifest
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expandManifest(com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandManifest(com.google.javascript.jscomp.JSModule)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testExpandManifest_ReturnNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        String actual = commandLineRunner.expandManifest(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandManifest(com.google.javascript.jscomp.JSModule)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testExpandManifest_ReturnNull_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String outputManifest = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        String actual = commandLineRunner.expandManifest(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expandManifest(com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandManifest(com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return expandCommandLinePath(config.outputManifest, forModule);
 *  */
    @Test
    public void testExpandManifest_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String outputManifest = " ";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandManifest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:847)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandManifest(AbstractCommandLineRunner.java:870) */
        commandLineRunner.expandManifest(null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandManifest(com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return expandCommandLinePath(config.outputManifest, forModule);
 *  */
    @Test
    public void testExpandManifest_ThrowNullPointerException_2() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        String outputManifest = " ";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandManifest] produces [java.lang.NullPointerException]
            java.base/java.lang.String.replace(String.java:2963)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandManifest(AbstractCommandLineRunner.java:870) */
        commandLineRunner.expandManifest(null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandManifest(com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return expandCommandLinePath(config.outputManifest, forModule);
 *  */
    @Test
    public void testExpandManifest_ThrowNullPointerException_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        String outputManifest = " ";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandManifest] produces [java.lang.NullPointerException]
            java.base/java.lang.String.replace(String.java:2963)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandManifest(AbstractCommandLineRunner.java:870) */
        commandLineRunner.expandManifest(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expandManifest(com.google.javascript.jscomp.JSModule)
    
    @Test
    public void testExpandManifest1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String jsOutputFile = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "jsOutputFile", jsOutputFile);
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", jsOutputFile);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        String actual = commandLineRunner.expandManifest(null);
        
        assertEquals(jsOutputFile, actual);
    }
    
    @Test
    public void testExpandManifest2() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String moduleOutputPathPrefix = "\u0000";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "moduleOutputPathPrefix", moduleOutputPathPrefix);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", moduleOutputPathPrefix);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        JSModule jSModule = new JSModule(null);
        
        String actual = commandLineRunner.expandManifest(jSModule);
        
        assertEquals(moduleOutputPathPrefix, actual);
    }
    
    @Test
    public void testExpandManifest3() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        String moduleOutputPathPrefix = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "moduleOutputPathPrefix", moduleOutputPathPrefix);
        String outputManifest = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        String actual = commandLineRunner.expandManifest(null);
        
        assertEquals(outputManifest, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMapPath(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getMapPath(java.lang.String)}
 * @utbot.executesCondition {@code (outputFile.equals("")): True}
 * @utbot.executesCondition {@code (!config.moduleOutputPathPrefix.equals("")): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3100(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return basePath;}
 *  */
    @Test
    public void testGetMapPath_ConfigModuleOutputPathPrefixEquals() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String moduleOutputPathPrefix = "\u0000\u0000\u0000";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "moduleOutputPathPrefix", moduleOutputPathPrefix);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        String string = "";
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method getMapPathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("getMapPath", stringType);
        getMapPathMethod.setAccessible(true);
        java.lang.Object[] getMapPathMethodArguments = new java.lang.Object[1];
        getMapPathMethodArguments[0] = string;
        String actual = ((String) getMapPathMethod.invoke(commandLineRunner, getMapPathMethodArguments));
        
        assertEquals(moduleOutputPathPrefix, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMapPath(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getMapPath(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: outputFile.equals("")
 *  */
    @Test
    public void testGetMapPath_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath(AbstractCommandLineRunner.java:941) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method getMapPathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("getMapPath", stringType);
        getMapPathMethod.setAccessible(true);
        java.lang.Object[] getMapPathMethodArguments = new java.lang.Object[1];
        getMapPathMethodArguments[0] = ((Object) null);
        try {
            getMapPathMethod.invoke(commandLineRunner, getMapPathMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getMapPath(java.lang.String)}
 * @utbot.executesCondition {@code (outputFile.equals("")): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3100(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !config.moduleOutputPathPrefix.equals("")
 *  */
    @Test
    public void testGetMapPath_ThrowNullPointerException_1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath(AbstractCommandLineRunner.java:944) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method getMapPathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("getMapPath", stringType);
        getMapPathMethod.setAccessible(true);
        java.lang.Object[] getMapPathMethodArguments = new java.lang.Object[1];
        getMapPathMethodArguments[0] = string;
        try {
            getMapPathMethod.invoke(commandLineRunner, getMapPathMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifest
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outputManifest()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputManifest()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testOutputManifest_Return() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method outputManifestMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputManifest");
        outputManifestMethod.setAccessible(true);
        java.lang.Object[] outputManifestMethodArguments = new java.lang.Object[0];
        outputManifestMethod.invoke(commandLineRunner, outputManifestMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputManifest()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testOutputManifest_Return_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String outputManifest = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method outputManifestMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputManifest");
        outputManifestMethod.setAccessible(true);
        java.lang.Object[] outputManifestMethodArguments = new java.lang.Object[0];
        outputManifestMethod.invoke(commandLineRunner, outputManifestMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outputManifest()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputManifest()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getModuleGraph()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSModuleGraph graph = compiler.getModuleGraph();
 *  */
    @Test
    public void testOutputManifest_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String outputManifest = " ";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifest(AbstractCommandLineRunner.java:1121) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method outputManifestMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputManifest");
        outputManifestMethod.setAccessible(true);
        java.lang.Object[] outputManifestMethodArguments = new java.lang.Object[0];
        try {
            outputManifestMethod.invoke(commandLineRunner, outputManifestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#outputManifest()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getModuleGraph()}
 * @utbot.invokes com.google.javascript.jscomp.AbstractCommandLineRunner#shouldGenerateManifestPerModule()
 * @utbot.throwsException {@link java.lang.NullPointerException} when: shouldGenerateManifestPerModule()
 *  */
    @Test
    public void testOutputManifest_ThrowNullPointerException_1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String outputManifest = " ";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateManifestPerModule(AbstractCommandLineRunner.java:1106)
            com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifest(AbstractCommandLineRunner.java:1122) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method outputManifestMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("outputManifest");
        outputManifestMethod.setAccessible(true);
        java.lang.Object[] outputManifestMethodArguments = new java.lang.Object[0];
        try {
            outputManifestMethod.invoke(commandLineRunner, outputManifestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.printManifestTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printManifestTo(java.lang.Iterable, java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#printManifestTo(java.lang.Iterable,java.lang.Appendable)}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(CompilerInput input: inputs)
 *  */
    @Test
    public void testPrintManifestTo_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.printManifestTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.printManifestTo(AbstractCommandLineRunner.java:1173) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class iterableType = Class.forName("java.lang.Iterable");
        Class appendableType = Class.forName("java.lang.Appendable");
        Method printManifestToMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("printManifestTo", iterableType, appendableType);
        printManifestToMethod.setAccessible(true);
        java.lang.Object[] printManifestToMethodArguments = new java.lang.Object[2];
        printManifestToMethodArguments[0] = ((Object) null);
        printManifestToMethodArguments[1] = ((Object) null);
        try {
            printManifestToMethod.invoke(commandLineRunner, printManifestToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.enableTestMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enableTestMode(com.google.common.base.Supplier, com.google.common.base.Supplier, com.google.common.base.Supplier, com.google.common.base.Function)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#enableTestMode(com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(inputsSupplier == null ^ modulesSupplier == null);): False}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(inputsSupplier == null ^ modulesSupplier == null);): True}
 *  */
    @Test
    public void testEnableTestMode_PreconditionsCheckArgument() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        Supplier anonymousSupplier = ((Supplier) createInstance("com.google.javascript.jscomp.AstParallelizer$5"));
        
        Supplier initialCommandLineRunnerInputsSupplierForTesting = ((Supplier) getFieldValue(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "inputsSupplierForTesting"));
        
        commandLineRunner.enableTestMode(null, anonymousSupplier, null, null);
        
        boolean finalCommandLineRunnerTestMode = ((Boolean) getFieldValue(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode"));
        Supplier finalCommandLineRunnerInputsSupplierForTesting = ((Supplier) getFieldValue(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "inputsSupplierForTesting"));
        
        assertFalse(initialCommandLineRunnerInputsSupplierForTesting == finalCommandLineRunnerInputsSupplierForTesting);
        
        assertTrue(finalCommandLineRunnerTestMode);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#enableTestMode(com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(inputsSupplier == null ^ modulesSupplier == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(inputsSupplier == null ^ modulesSupplier == null);): False}
 *  */
    @Test
    public void testEnableTestMode_PreconditionsCheckArgument_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        Supplier anonymousSupplier = ((Supplier) createInstance("com.google.javascript.jscomp.AstParallelizer$5"));
        
        Supplier initialCommandLineRunnerModulesSupplierForTesting = ((Supplier) getFieldValue(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "modulesSupplierForTesting"));
        
        commandLineRunner.enableTestMode(null, null, anonymousSupplier, null);
        
        boolean finalCommandLineRunnerTestMode = ((Boolean) getFieldValue(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode"));
        Supplier finalCommandLineRunnerModulesSupplierForTesting = ((Supplier) getFieldValue(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "modulesSupplierForTesting"));
        
        assertFalse(initialCommandLineRunnerModulesSupplierForTesting == finalCommandLineRunnerModulesSupplierForTesting);
        
        assertTrue(finalCommandLineRunnerTestMode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method filenameToOutputStream(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#filenameToOutputStream(java.lang.String)}
 * @utbot.executesCondition {@code (fileName == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFilenameToOutputStream_FileNameEqualsNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        OutputStream actual = commandLineRunner.filenameToOutputStream(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method filenameToOutputStream(java.lang.String)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testFilenameToOutputStream1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        String string = ":\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" ": " "write")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkWrite(SecurityManager.java:847)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:223)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:123)
            com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream(AbstractCommandLineRunner.java:897) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.getErrorPrintStream
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErrorPrintStream()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getErrorPrintStream()}
 * @utbot.returnsFrom {@code return err;}
 *  */
    @Test
    public void testGetErrorPrintStream_ReturnErr() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        PrintStream actual = commandLineRunner.getErrorPrintStream();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.initOptionsFromFlags
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initOptionsFromFlags(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#initOptionsFromFlags(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.returnsFrom {@code protected }
 *  */
    @Test
    public void testInitOptionsFromFlags_Return() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        commandLineRunner.initOptionsFromFlags(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.getDiagnosticGroups
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDiagnosticGroups()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getDiagnosticGroups()}
 * @utbot.executesCondition {@code (compiler == null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.Compiler#getDiagnosticGroups()}
 * @utbot.returnsFrom {@code return compiler.getDiagnosticGroups();}
 *  */
    @Test
    public void testGetDiagnosticGroups_CompilerNotEqualsNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "compiler", compiler);
        
        DiagnosticGroups actual = commandLineRunner.getDiagnosticGroups();
        
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
        String key12 = "JSC_CONSTANT_PROPERTY_REASSIGNED_VALUE";
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "key", key12);
        MessageFormat format12 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "format", format12);
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType12.level = defaultLevel;
        types3.add(diagnosticType12);
        setField(constantProperty, "com.google.javascript.jscomp.DiagnosticGroup", "types", types3);
        String name3 = "constantProperty";
        setField(constantProperty, "com.google.javascript.jscomp.DiagnosticGroup", "name", name3);
        DiagnosticGroups.CONSTANT_PROPERTY = constantProperty;
        DiagnosticGroup nonStandardJsdoc = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types4 = new LinkedHashSet();
        DiagnosticType diagnosticType13 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key13 = "JSC_BAD_JSDOC_ANNOTATION";
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "key", key13);
        MessageFormat format13 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "format", format13);
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType13.level = defaultLevel;
        types4.add(diagnosticType13);
        setField(nonStandardJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "types", types4);
        String name4 = "nonStandardJsDocs";
        setField(nonStandardJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "name", name4);
        DiagnosticGroups.NON_STANDARD_JSDOC = nonStandardJsdoc;
        DiagnosticGroup accessControls = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types5 = new LinkedHashSet();
        types5.add(diagnosticType2);
        types5.add(diagnosticType5);
        types5.add(diagnosticType1);
        types5.add(diagnosticType9);
        types5.add(diagnosticType3);
        types5.add(diagnosticType11);
        types5.add(diagnosticType4);
        types5.add(diagnosticType7);
        types5.add(diagnosticType6);
        types5.add(diagnosticType10);
        types5.add(diagnosticType8);
        setField(accessControls, "com.google.javascript.jscomp.DiagnosticGroup", "types", types5);
        String name5 = "accessControls";
        setField(accessControls, "com.google.javascript.jscomp.DiagnosticGroup", "name", name5);
        DiagnosticGroups.ACCESS_CONTROLS = accessControls;
        DiagnosticGroup invalidCasts = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types6 = new LinkedHashSet();
        DiagnosticType diagnosticType14 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key14 = "JSC_INVALID_CAST";
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "key", key14);
        MessageFormat format14 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "format", format14);
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType14.level = defaultLevel;
        types6.add(diagnosticType14);
        setField(invalidCasts, "com.google.javascript.jscomp.DiagnosticGroup", "types", types6);
        String name6 = "invalidCasts";
        setField(invalidCasts, "com.google.javascript.jscomp.DiagnosticGroup", "name", name6);
        DiagnosticGroups.INVALID_CASTS = invalidCasts;
        DiagnosticGroup fileoverviewJsdoc = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types7 = new LinkedHashSet();
        DiagnosticType diagnosticType15 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key15 = "JSC_EXTRA_FILEOVERVIEW";
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "key", key15);
        MessageFormat format15 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "format", format15);
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType15.level = defaultLevel;
        types7.add(diagnosticType15);
        setField(fileoverviewJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "types", types7);
        String name7 = "fileoverviewTags";
        setField(fileoverviewJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "name", name7);
        DiagnosticGroups.FILEOVERVIEW_JSDOC = fileoverviewJsdoc;
        DiagnosticGroup strictModuleDepCheck = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types8 = new LinkedHashSet();
        DiagnosticType diagnosticType16 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key16 = "JSC_STRICT_MODULE_DEPENDENCY";
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "key", key16);
        MessageFormat format16 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "format", format16);
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType16.level = defaultLevel1;
        types8.add(diagnosticType16);
        DiagnosticType diagnosticType17 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key17 = "JSC_STRICT_MODULE_DEP_QNAME";
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "key", key17);
        MessageFormat format17 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "format", format17);
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType17.level = defaultLevel1;
        types8.add(diagnosticType17);
        setField(strictModuleDepCheck, "com.google.javascript.jscomp.DiagnosticGroup", "types", types8);
        String name8 = "strictModuleDepCheck";
        setField(strictModuleDepCheck, "com.google.javascript.jscomp.DiagnosticGroup", "name", name8);
        DiagnosticGroups.STRICT_MODULE_DEP_CHECK = strictModuleDepCheck;
        DiagnosticGroup externsValidation = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types9 = new LinkedHashSet();
        DiagnosticType diagnosticType18 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key18 = "JSC_NAME_REFERENCE_IN_EXTERNS";
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "key", key18);
        MessageFormat format18 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "format", format18);
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType18.level = defaultLevel;
        types9.add(diagnosticType18);
        DiagnosticType diagnosticType19 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key19 = "JSC_UNDEFINED_EXTERN_VAR_ERROR";
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "key", key19);
        MessageFormat format19 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "format", format19);
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType19.level = defaultLevel;
        types9.add(diagnosticType19);
        setField(externsValidation, "com.google.javascript.jscomp.DiagnosticGroup", "types", types9);
        String name9 = "externsValidation";
        setField(externsValidation, "com.google.javascript.jscomp.DiagnosticGroup", "name", name9);
        DiagnosticGroups.EXTERNS_VALIDATION = externsValidation;
        DiagnosticGroup ambiguousFunctionDecl = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types10 = new LinkedHashSet();
        DiagnosticType diagnosticType20 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key20 = "AMBIGUOUS_FUNCTION_DECL";
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "key", key20);
        MessageFormat format20 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "format", format20);
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType20.level = defaultLevel1;
        types10.add(diagnosticType20);
        setField(ambiguousFunctionDecl, "com.google.javascript.jscomp.DiagnosticGroup", "types", types10);
        String name10 = "ambiguousFunctionDecl";
        setField(ambiguousFunctionDecl, "com.google.javascript.jscomp.DiagnosticGroup", "name", name10);
        DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = ambiguousFunctionDecl;
        DiagnosticGroup unknownDefines = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types11 = new LinkedHashSet();
        DiagnosticType diagnosticType21 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key21 = "JSC_UNKNOWN_DEFINE_WARNING";
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "key", key21);
        MessageFormat format21 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "format", format21);
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType21.level = defaultLevel;
        types11.add(diagnosticType21);
        setField(unknownDefines, "com.google.javascript.jscomp.DiagnosticGroup", "types", types11);
        String name11 = "unknownDefines";
        setField(unknownDefines, "com.google.javascript.jscomp.DiagnosticGroup", "name", name11);
        DiagnosticGroups.UNKNOWN_DEFINES = unknownDefines;
        DiagnosticGroup tweaks = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types12 = new LinkedHashSet();
        DiagnosticType diagnosticType22 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key22 = "JSC_INVALID_TWEAK_DEFAULT_VALUE_WARNING";
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "key", key22);
        MessageFormat format22 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "format", format22);
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType22.level = defaultLevel;
        types12.add(diagnosticType22);
        DiagnosticType diagnosticType23 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key23 = "JSC_TWEAK_WRONG_GETTER_TYPE_WARNING";
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "key", key23);
        MessageFormat format23 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "format", format23);
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType23.level = defaultLevel;
        types12.add(diagnosticType23);
        DiagnosticType diagnosticType24 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key24 = "JSC_UNKNOWN_TWEAK_WARNING";
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "key", key24);
        MessageFormat format24 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "format", format24);
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType24.level = defaultLevel;
        types12.add(diagnosticType24);
        setField(tweaks, "com.google.javascript.jscomp.DiagnosticGroup", "types", types12);
        String name12 = "tweakValidation";
        setField(tweaks, "com.google.javascript.jscomp.DiagnosticGroup", "name", name12);
        DiagnosticGroups.TWEAKS = tweaks;
        DiagnosticGroup missingProperties = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types13 = new LinkedHashSet();
        DiagnosticType diagnosticType25 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key25 = "JSC_INEXISTENT_PROPERTY";
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "key", key25);
        MessageFormat format25 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "format", format25);
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType25.level = defaultLevel1;
        types13.add(diagnosticType25);
        setField(missingProperties, "com.google.javascript.jscomp.DiagnosticGroup", "types", types13);
        String name13 = "missingProperties";
        setField(missingProperties, "com.google.javascript.jscomp.DiagnosticGroup", "name", name13);
        DiagnosticGroups.MISSING_PROPERTIES = missingProperties;
        DiagnosticGroup internetExplorerChecks = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types14 = new LinkedHashSet();
        DiagnosticType diagnosticType26 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key26 = "JSC_TRAILING_COMMA";
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "key", key26);
        MessageFormat format26 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "format", format26);
        CheckLevel defaultLevel2 = CheckLevel.ERROR;
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType26.level = defaultLevel2;
        types14.add(diagnosticType26);
        setField(internetExplorerChecks, "com.google.javascript.jscomp.DiagnosticGroup", "types", types14);
        String name14 = "internetExplorerChecks";
        setField(internetExplorerChecks, "com.google.javascript.jscomp.DiagnosticGroup", "name", name14);
        DiagnosticGroups.INTERNET_EXPLORER_CHECKS = internetExplorerChecks;
        DiagnosticGroup undefinedVariables = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types15 = new LinkedHashSet();
        DiagnosticType diagnosticType27 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key27 = "JSC_UNDEFINED_VARIABLE";
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "key", key27);
        MessageFormat format27 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "format", format27);
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType27.level = defaultLevel2;
        types15.add(diagnosticType27);
        setField(undefinedVariables, "com.google.javascript.jscomp.DiagnosticGroup", "types", types15);
        String name15 = "undefinedVars";
        setField(undefinedVariables, "com.google.javascript.jscomp.DiagnosticGroup", "name", name15);
        DiagnosticGroups.UNDEFINED_VARIABLES = undefinedVariables;
        DiagnosticGroup checkRegexp = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types16 = new LinkedHashSet();
        DiagnosticType diagnosticType28 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key28 = "JSC_REGEXP_REFERENCE";
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "key", key28);
        MessageFormat format28 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "format", format28);
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType28.level = defaultLevel;
        types16.add(diagnosticType28);
        setField(checkRegexp, "com.google.javascript.jscomp.DiagnosticGroup", "types", types16);
        String name16 = "checkRegExp";
        setField(checkRegexp, "com.google.javascript.jscomp.DiagnosticGroup", "name", name16);
        DiagnosticGroups.CHECK_REGEXP = checkRegexp;
        DiagnosticGroup checkTypes = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types17 = new LinkedHashSet();
        DiagnosticType diagnosticType29 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key29 = "JSC_HIDDEN_SUPERCLASS_PROPERTY_MISMATCH";
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "key", key29);
        MessageFormat format29 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "format", format29);
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType29.level = defaultLevel;
        types17.add(diagnosticType29);
        DiagnosticType diagnosticType30 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key30 = "JSC_UNKNOWN_OVERRIDE";
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "key", key30);
        MessageFormat format30 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "format", format30);
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType30.level = defaultLevel;
        types17.add(diagnosticType30);
        DiagnosticType diagnosticType31 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key31 = "JSC_WRONG_ARGUMENT_COUNT";
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "key", key31);
        MessageFormat format31 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "format", format31);
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType31.level = defaultLevel;
        types17.add(diagnosticType31);
        DiagnosticType diagnosticType32 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key32 = "JSC_DETERMINISTIC_TEST_NO_RESULT";
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "key", key32);
        MessageFormat format32 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "format", format32);
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType32.level = defaultLevel;
        types17.add(diagnosticType32);
        DiagnosticType diagnosticType33 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key33 = "JSC_THIS_TYPE_NON_OBJECT";
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "key", key33);
        MessageFormat format33 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "format", format33);
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType33.level = defaultLevel;
        types17.add(diagnosticType33);
        DiagnosticType diagnosticType34 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key34 = "JSC_INEXISTENT_ENUM_ELEMENT";
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "key", key34);
        MessageFormat format34 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "format", format34);
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType34.level = defaultLevel;
        types17.add(diagnosticType34);
        DiagnosticType diagnosticType35 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key35 = "JSC_ENUM_DUP";
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "key", key35);
        MessageFormat format35 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "format", format35);
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType35.level = defaultLevel2;
        types17.add(diagnosticType35);
        DiagnosticType diagnosticType36 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key36 = "JSC_INTERFACE_FUNCTION_NOT_EMPTY";
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "key", key36);
        MessageFormat format36 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "format", format36);
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType36.level = defaultLevel;
        types17.add(diagnosticType36);
        DiagnosticType diagnosticType37 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key37 = "JSC_INTERFACE_METHOD_NOT_IMPLEMENTED";
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "key", key37);
        MessageFormat format37 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "format", format37);
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType37.level = defaultLevel;
        types17.add(diagnosticType37);
        DiagnosticType diagnosticType38 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key38 = "JSC_ENUM_NOT_CONSTANT";
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "key", key38);
        MessageFormat format38 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "format", format38);
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType38.level = defaultLevel;
        types17.add(diagnosticType38);
        DiagnosticType diagnosticType39 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key39 = "JSC_HIDDEN_SUPERCLASS_PROPERTY";
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
        String key41 = "JSC_INTERFACE_METHOD_OVERRIDE";
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "key", key41);
        MessageFormat format41 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "format", format41);
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType41.level = defaultLevel;
        types17.add(diagnosticType41);
        DiagnosticType diagnosticType42 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key42 = "JSC_CONSTRUCTOR_NOT_CALLABLE";
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "key", key42);
        MessageFormat format42 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "format", format42);
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType42.level = defaultLevel;
        types17.add(diagnosticType42);
        DiagnosticType diagnosticType43 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key43 = "JSC_HIDDEN_INTERFACE_PROPERTY";
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "key", key43);
        MessageFormat format43 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "format", format43);
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType43.level = defaultLevel;
        types17.add(diagnosticType43);
        DiagnosticType diagnosticType44 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key44 = "JSC_TYPE_PARSE_ERROR";
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "key", key44);
        MessageFormat format44 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "format", format44);
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType44.level = defaultLevel;
        types17.add(diagnosticType44);
        DiagnosticType diagnosticType45 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key45 = "JSC_HIDDEN_PROPERTY_MISMATCH";
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "key", key45);
        MessageFormat format45 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "format", format45);
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType45.level = defaultLevel;
        types17.add(diagnosticType45);
        DiagnosticType diagnosticType46 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key46 = "JSC_NOT_A_CONSTRUCTOR";
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "key", key46);
        MessageFormat format46 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "format", format46);
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType46.level = defaultLevel;
        types17.add(diagnosticType46);
        types17.add(diagnosticType14);
        DiagnosticType diagnosticType47 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key47 = "JSC_MULTIPLE_VAR_DEF";
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "key", key47);
        MessageFormat format47 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "format", format47);
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType47.level = defaultLevel;
        types17.add(diagnosticType47);
        DiagnosticType diagnosticType48 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key48 = "JSC_DUP_VAR_DECLARATION";
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "key", key48);
        MessageFormat format48 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "format", format48);
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType48.level = defaultLevel;
        types17.add(diagnosticType48);
        DiagnosticType diagnosticType49 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key49 = "JSC_DETERMINISTIC_TEST";
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "key", key49);
        MessageFormat format49 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "format", format49);
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType49.level = defaultLevel;
        types17.add(diagnosticType49);
        DiagnosticType diagnosticType50 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key50 = "JSC_MISSING_EXTENDS_TAG";
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "key", key50);
        MessageFormat format50 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "format", format50);
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType50.level = defaultLevel;
        types17.add(diagnosticType50);
        DiagnosticType diagnosticType51 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key51 = "JSC_UNRESOLVED_TYPE";
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "key", key51);
        MessageFormat format51 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "format", format51);
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType51.level = defaultLevel;
        types17.add(diagnosticType51);
        DiagnosticType diagnosticType52 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key52 = "JSC_LENDS_ON_NON_OBJECT";
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "key", key52);
        MessageFormat format52 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "format", format52);
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType52.level = defaultLevel;
        types17.add(diagnosticType52);
        DiagnosticType diagnosticType53 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key53 = "JSC_INVALID_INTERFACE_MEMBER_DECLARATION";
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "key", key53);
        MessageFormat format53 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "format", format53);
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType53.level = defaultLevel;
        types17.add(diagnosticType53);
        DiagnosticType diagnosticType54 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key54 = "JSC_CONFLICTING_EXTENDED_TYPE";
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "key", key54);
        MessageFormat format54 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "format", format54);
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType54.level = defaultLevel;
        types17.add(diagnosticType54);
        DiagnosticType diagnosticType55 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key55 = "JSC_UNKNOWN_EXPR_TYPE";
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "key", key55);
        MessageFormat format55 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "format", format55);
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType55.level = defaultLevel;
        types17.add(diagnosticType55);
        DiagnosticType diagnosticType56 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key56 = "JSC_CTOR_INITIALIZER_NOT_CTOR";
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "key", key56);
        MessageFormat format56 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "format", format56);
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType56.level = defaultLevel;
        types17.add(diagnosticType56);
        types17.add(diagnosticType25);
        DiagnosticType diagnosticType57 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key57 = "JSC_NOT_FUNCTION_TYPE";
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "key", key57);
        MessageFormat format57 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "format", format57);
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType57.level = defaultLevel;
        types17.add(diagnosticType57);
        DiagnosticType diagnosticType58 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key58 = "JSC_IFACE_INITIALIZER_NOT_IFACE";
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "key", key58);
        MessageFormat format58 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "format", format58);
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType58.level = defaultLevel;
        types17.add(diagnosticType58);
        DiagnosticType diagnosticType59 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key59 = "JSC_IMPLEMENTS_NON_INTERFACE";
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "key", key59);
        MessageFormat format59 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "format", format59);
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType59.level = defaultLevel;
        types17.add(diagnosticType59);
        DiagnosticType diagnosticType60 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key60 = "JSC_TYPE_MISMATCH";
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "key", key60);
        MessageFormat format60 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "format", format60);
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType60.level = defaultLevel;
        types17.add(diagnosticType60);
        DiagnosticType diagnosticType61 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key61 = "JSC_BAD_TYPE_FOR_BIT_OPERATION";
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "key", key61);
        MessageFormat format61 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "format", format61);
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType61.level = defaultLevel;
        types17.add(diagnosticType61);
        DiagnosticType diagnosticType62 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key62 = "JSC_FUNCTION_MASKS_VARIABLE";
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "key", key62);
        MessageFormat format62 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "format", format62);
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType62.level = defaultLevel;
        types17.add(diagnosticType62);
        DiagnosticType diagnosticType63 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key63 = "JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH";
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "key", key63);
        MessageFormat format63 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "format", format63);
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType63.level = defaultLevel;
        types17.add(diagnosticType63);
        DiagnosticType diagnosticType64 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key64 = "JSC_ILLEGAL_IMPLICIT_CAST";
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "key", key64);
        MessageFormat format64 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "format", format64);
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType64.level = defaultLevel;
        types17.add(diagnosticType64);
        setField(checkTypes, "com.google.javascript.jscomp.DiagnosticGroup", "types", types17);
        String name17 = "checkTypes";
        setField(checkTypes, "com.google.javascript.jscomp.DiagnosticGroup", "name", name17);
        DiagnosticGroups.CHECK_TYPES = checkTypes;
        DiagnosticGroup checkVariables = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types18 = new LinkedHashSet();
        types18.add(diagnosticType27);
        DiagnosticType diagnosticType65 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key65 = "JSC_VAR_MULTIPLY_DECLARED_ERROR";
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "key", key65);
        MessageFormat format65 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "format", format65);
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType65.level = defaultLevel2;
        types18.add(diagnosticType65);
        setField(checkVariables, "com.google.javascript.jscomp.DiagnosticGroup", "types", types18);
        String name18 = "checkVars";
        setField(checkVariables, "com.google.javascript.jscomp.DiagnosticGroup", "name", name18);
        DiagnosticGroups.CHECK_VARIABLES = checkVariables;
        DiagnosticGroup checkUselessCode = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types19 = new LinkedHashSet();
        DiagnosticType diagnosticType66 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key66 = "JSC_USELESS_CODE";
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "key", key66);
        MessageFormat format66 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "format", format66);
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType66.level = defaultLevel;
        types19.add(diagnosticType66);
        DiagnosticType diagnosticType67 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key67 = "JSC_UNREACHABLE_CODE";
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "key", key67);
        MessageFormat format67 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "format", format67);
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType67.level = defaultLevel2;
        types19.add(diagnosticType67);
        setField(checkUselessCode, "com.google.javascript.jscomp.DiagnosticGroup", "types", types19);
        String name19 = "uselessCode";
        setField(checkUselessCode, "com.google.javascript.jscomp.DiagnosticGroup", "name", name19);
        DiagnosticGroups.CHECK_USELESS_CODE = checkUselessCode;
        DiagnosticGroup typeInvalidation = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types20 = new LinkedHashSet();
        DiagnosticType diagnosticType68 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key68 = "JSC_INVALIDATION";
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "key", key68);
        MessageFormat format68 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "format", format68);
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType68.level = defaultLevel1;
        types20.add(diagnosticType68);
        setField(typeInvalidation, "com.google.javascript.jscomp.DiagnosticGroup", "types", types20);
        String name20 = "typeInvalidation";
        setField(typeInvalidation, "com.google.javascript.jscomp.DiagnosticGroup", "name", name20);
        DiagnosticGroups.TYPE_INVALIDATION = typeInvalidation;
        
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getDiagnosticGroups()}
 * @utbot.executesCondition {@code (compiler == null): True}
 * @utbot.returnsFrom {@code return new DiagnosticGroups();}
 *  */
    @Test
    public void testGetDiagnosticGroups_CompilerEqualsNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        DiagnosticGroups actual = commandLineRunner.getDiagnosticGroups();
        
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
        String key12 = "JSC_CONSTANT_PROPERTY_REASSIGNED_VALUE";
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "key", key12);
        MessageFormat format12 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "format", format12);
        setField(diagnosticType12, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType12.level = defaultLevel;
        types3.add(diagnosticType12);
        setField(constantProperty, "com.google.javascript.jscomp.DiagnosticGroup", "types", types3);
        String name3 = "constantProperty";
        setField(constantProperty, "com.google.javascript.jscomp.DiagnosticGroup", "name", name3);
        DiagnosticGroups.CONSTANT_PROPERTY = constantProperty;
        DiagnosticGroup nonStandardJsdoc = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types4 = new LinkedHashSet();
        DiagnosticType diagnosticType13 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key13 = "JSC_BAD_JSDOC_ANNOTATION";
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "key", key13);
        MessageFormat format13 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "format", format13);
        setField(diagnosticType13, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType13.level = defaultLevel;
        types4.add(diagnosticType13);
        setField(nonStandardJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "types", types4);
        String name4 = "nonStandardJsDocs";
        setField(nonStandardJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "name", name4);
        DiagnosticGroups.NON_STANDARD_JSDOC = nonStandardJsdoc;
        DiagnosticGroup accessControls = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types5 = new LinkedHashSet();
        types5.add(diagnosticType2);
        types5.add(diagnosticType5);
        types5.add(diagnosticType1);
        types5.add(diagnosticType9);
        types5.add(diagnosticType3);
        types5.add(diagnosticType11);
        types5.add(diagnosticType4);
        types5.add(diagnosticType7);
        types5.add(diagnosticType6);
        types5.add(diagnosticType10);
        types5.add(diagnosticType8);
        setField(accessControls, "com.google.javascript.jscomp.DiagnosticGroup", "types", types5);
        String name5 = "accessControls";
        setField(accessControls, "com.google.javascript.jscomp.DiagnosticGroup", "name", name5);
        DiagnosticGroups.ACCESS_CONTROLS = accessControls;
        DiagnosticGroup invalidCasts = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types6 = new LinkedHashSet();
        DiagnosticType diagnosticType14 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key14 = "JSC_INVALID_CAST";
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "key", key14);
        MessageFormat format14 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "format", format14);
        setField(diagnosticType14, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType14.level = defaultLevel;
        types6.add(diagnosticType14);
        setField(invalidCasts, "com.google.javascript.jscomp.DiagnosticGroup", "types", types6);
        String name6 = "invalidCasts";
        setField(invalidCasts, "com.google.javascript.jscomp.DiagnosticGroup", "name", name6);
        DiagnosticGroups.INVALID_CASTS = invalidCasts;
        DiagnosticGroup fileoverviewJsdoc = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types7 = new LinkedHashSet();
        DiagnosticType diagnosticType15 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key15 = "JSC_EXTRA_FILEOVERVIEW";
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "key", key15);
        MessageFormat format15 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "format", format15);
        setField(diagnosticType15, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType15.level = defaultLevel;
        types7.add(diagnosticType15);
        setField(fileoverviewJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "types", types7);
        String name7 = "fileoverviewTags";
        setField(fileoverviewJsdoc, "com.google.javascript.jscomp.DiagnosticGroup", "name", name7);
        DiagnosticGroups.FILEOVERVIEW_JSDOC = fileoverviewJsdoc;
        DiagnosticGroup strictModuleDepCheck = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types8 = new LinkedHashSet();
        DiagnosticType diagnosticType16 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key16 = "JSC_STRICT_MODULE_DEPENDENCY";
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "key", key16);
        MessageFormat format16 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "format", format16);
        setField(diagnosticType16, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType16.level = defaultLevel1;
        types8.add(diagnosticType16);
        DiagnosticType diagnosticType17 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key17 = "JSC_STRICT_MODULE_DEP_QNAME";
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "key", key17);
        MessageFormat format17 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "format", format17);
        setField(diagnosticType17, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType17.level = defaultLevel1;
        types8.add(diagnosticType17);
        setField(strictModuleDepCheck, "com.google.javascript.jscomp.DiagnosticGroup", "types", types8);
        String name8 = "strictModuleDepCheck";
        setField(strictModuleDepCheck, "com.google.javascript.jscomp.DiagnosticGroup", "name", name8);
        DiagnosticGroups.STRICT_MODULE_DEP_CHECK = strictModuleDepCheck;
        DiagnosticGroup externsValidation = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types9 = new LinkedHashSet();
        DiagnosticType diagnosticType18 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key18 = "JSC_NAME_REFERENCE_IN_EXTERNS";
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "key", key18);
        MessageFormat format18 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "format", format18);
        setField(diagnosticType18, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType18.level = defaultLevel;
        types9.add(diagnosticType18);
        DiagnosticType diagnosticType19 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key19 = "JSC_UNDEFINED_EXTERN_VAR_ERROR";
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "key", key19);
        MessageFormat format19 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "format", format19);
        setField(diagnosticType19, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType19.level = defaultLevel;
        types9.add(diagnosticType19);
        setField(externsValidation, "com.google.javascript.jscomp.DiagnosticGroup", "types", types9);
        String name9 = "externsValidation";
        setField(externsValidation, "com.google.javascript.jscomp.DiagnosticGroup", "name", name9);
        DiagnosticGroups.EXTERNS_VALIDATION = externsValidation;
        DiagnosticGroup ambiguousFunctionDecl = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types10 = new LinkedHashSet();
        DiagnosticType diagnosticType20 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key20 = "AMBIGUOUS_FUNCTION_DECL";
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "key", key20);
        MessageFormat format20 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "format", format20);
        setField(diagnosticType20, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType20.level = defaultLevel1;
        types10.add(diagnosticType20);
        setField(ambiguousFunctionDecl, "com.google.javascript.jscomp.DiagnosticGroup", "types", types10);
        String name10 = "ambiguousFunctionDecl";
        setField(ambiguousFunctionDecl, "com.google.javascript.jscomp.DiagnosticGroup", "name", name10);
        DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL = ambiguousFunctionDecl;
        DiagnosticGroup unknownDefines = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types11 = new LinkedHashSet();
        DiagnosticType diagnosticType21 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key21 = "JSC_UNKNOWN_DEFINE_WARNING";
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "key", key21);
        MessageFormat format21 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "format", format21);
        setField(diagnosticType21, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType21.level = defaultLevel;
        types11.add(diagnosticType21);
        setField(unknownDefines, "com.google.javascript.jscomp.DiagnosticGroup", "types", types11);
        String name11 = "unknownDefines";
        setField(unknownDefines, "com.google.javascript.jscomp.DiagnosticGroup", "name", name11);
        DiagnosticGroups.UNKNOWN_DEFINES = unknownDefines;
        DiagnosticGroup tweaks = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types12 = new LinkedHashSet();
        DiagnosticType diagnosticType22 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key22 = "JSC_INVALID_TWEAK_DEFAULT_VALUE_WARNING";
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "key", key22);
        MessageFormat format22 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "format", format22);
        setField(diagnosticType22, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType22.level = defaultLevel;
        types12.add(diagnosticType22);
        DiagnosticType diagnosticType23 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key23 = "JSC_TWEAK_WRONG_GETTER_TYPE_WARNING";
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "key", key23);
        MessageFormat format23 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "format", format23);
        setField(diagnosticType23, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType23.level = defaultLevel;
        types12.add(diagnosticType23);
        DiagnosticType diagnosticType24 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key24 = "JSC_UNKNOWN_TWEAK_WARNING";
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "key", key24);
        MessageFormat format24 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "format", format24);
        setField(diagnosticType24, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType24.level = defaultLevel;
        types12.add(diagnosticType24);
        setField(tweaks, "com.google.javascript.jscomp.DiagnosticGroup", "types", types12);
        String name12 = "tweakValidation";
        setField(tweaks, "com.google.javascript.jscomp.DiagnosticGroup", "name", name12);
        DiagnosticGroups.TWEAKS = tweaks;
        DiagnosticGroup missingProperties = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types13 = new LinkedHashSet();
        DiagnosticType diagnosticType25 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key25 = "JSC_INEXISTENT_PROPERTY";
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "key", key25);
        MessageFormat format25 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "format", format25);
        setField(diagnosticType25, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType25.level = defaultLevel1;
        types13.add(diagnosticType25);
        setField(missingProperties, "com.google.javascript.jscomp.DiagnosticGroup", "types", types13);
        String name13 = "missingProperties";
        setField(missingProperties, "com.google.javascript.jscomp.DiagnosticGroup", "name", name13);
        DiagnosticGroups.MISSING_PROPERTIES = missingProperties;
        DiagnosticGroup internetExplorerChecks = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types14 = new LinkedHashSet();
        DiagnosticType diagnosticType26 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key26 = "JSC_TRAILING_COMMA";
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "key", key26);
        MessageFormat format26 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "format", format26);
        CheckLevel defaultLevel2 = CheckLevel.ERROR;
        setField(diagnosticType26, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType26.level = defaultLevel2;
        types14.add(diagnosticType26);
        setField(internetExplorerChecks, "com.google.javascript.jscomp.DiagnosticGroup", "types", types14);
        String name14 = "internetExplorerChecks";
        setField(internetExplorerChecks, "com.google.javascript.jscomp.DiagnosticGroup", "name", name14);
        DiagnosticGroups.INTERNET_EXPLORER_CHECKS = internetExplorerChecks;
        DiagnosticGroup undefinedVariables = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types15 = new LinkedHashSet();
        DiagnosticType diagnosticType27 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key27 = "JSC_UNDEFINED_VARIABLE";
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "key", key27);
        MessageFormat format27 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "format", format27);
        setField(diagnosticType27, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType27.level = defaultLevel2;
        types15.add(diagnosticType27);
        setField(undefinedVariables, "com.google.javascript.jscomp.DiagnosticGroup", "types", types15);
        String name15 = "undefinedVars";
        setField(undefinedVariables, "com.google.javascript.jscomp.DiagnosticGroup", "name", name15);
        DiagnosticGroups.UNDEFINED_VARIABLES = undefinedVariables;
        DiagnosticGroup checkRegexp = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types16 = new LinkedHashSet();
        DiagnosticType diagnosticType28 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key28 = "JSC_REGEXP_REFERENCE";
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "key", key28);
        MessageFormat format28 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "format", format28);
        setField(diagnosticType28, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType28.level = defaultLevel;
        types16.add(diagnosticType28);
        setField(checkRegexp, "com.google.javascript.jscomp.DiagnosticGroup", "types", types16);
        String name16 = "checkRegExp";
        setField(checkRegexp, "com.google.javascript.jscomp.DiagnosticGroup", "name", name16);
        DiagnosticGroups.CHECK_REGEXP = checkRegexp;
        DiagnosticGroup checkTypes = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types17 = new LinkedHashSet();
        DiagnosticType diagnosticType29 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key29 = "JSC_HIDDEN_SUPERCLASS_PROPERTY_MISMATCH";
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "key", key29);
        MessageFormat format29 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "format", format29);
        setField(diagnosticType29, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType29.level = defaultLevel;
        types17.add(diagnosticType29);
        DiagnosticType diagnosticType30 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key30 = "JSC_UNKNOWN_OVERRIDE";
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "key", key30);
        MessageFormat format30 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "format", format30);
        setField(diagnosticType30, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType30.level = defaultLevel;
        types17.add(diagnosticType30);
        DiagnosticType diagnosticType31 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key31 = "JSC_WRONG_ARGUMENT_COUNT";
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "key", key31);
        MessageFormat format31 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "format", format31);
        setField(diagnosticType31, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType31.level = defaultLevel;
        types17.add(diagnosticType31);
        DiagnosticType diagnosticType32 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key32 = "JSC_DETERMINISTIC_TEST_NO_RESULT";
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "key", key32);
        MessageFormat format32 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "format", format32);
        setField(diagnosticType32, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType32.level = defaultLevel;
        types17.add(diagnosticType32);
        DiagnosticType diagnosticType33 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key33 = "JSC_THIS_TYPE_NON_OBJECT";
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "key", key33);
        MessageFormat format33 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "format", format33);
        setField(diagnosticType33, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType33.level = defaultLevel;
        types17.add(diagnosticType33);
        DiagnosticType diagnosticType34 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key34 = "JSC_INEXISTENT_ENUM_ELEMENT";
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "key", key34);
        MessageFormat format34 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "format", format34);
        setField(diagnosticType34, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType34.level = defaultLevel;
        types17.add(diagnosticType34);
        DiagnosticType diagnosticType35 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key35 = "JSC_ENUM_DUP";
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "key", key35);
        MessageFormat format35 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "format", format35);
        setField(diagnosticType35, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType35.level = defaultLevel2;
        types17.add(diagnosticType35);
        DiagnosticType diagnosticType36 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key36 = "JSC_INTERFACE_FUNCTION_NOT_EMPTY";
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "key", key36);
        MessageFormat format36 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "format", format36);
        setField(diagnosticType36, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType36.level = defaultLevel;
        types17.add(diagnosticType36);
        DiagnosticType diagnosticType37 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key37 = "JSC_INTERFACE_METHOD_NOT_IMPLEMENTED";
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "key", key37);
        MessageFormat format37 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "format", format37);
        setField(diagnosticType37, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType37.level = defaultLevel;
        types17.add(diagnosticType37);
        DiagnosticType diagnosticType38 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key38 = "JSC_ENUM_NOT_CONSTANT";
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "key", key38);
        MessageFormat format38 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "format", format38);
        setField(diagnosticType38, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType38.level = defaultLevel;
        types17.add(diagnosticType38);
        DiagnosticType diagnosticType39 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key39 = "JSC_HIDDEN_SUPERCLASS_PROPERTY";
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
        String key41 = "JSC_INTERFACE_METHOD_OVERRIDE";
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "key", key41);
        MessageFormat format41 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "format", format41);
        setField(diagnosticType41, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType41.level = defaultLevel;
        types17.add(diagnosticType41);
        DiagnosticType diagnosticType42 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key42 = "JSC_CONSTRUCTOR_NOT_CALLABLE";
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "key", key42);
        MessageFormat format42 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "format", format42);
        setField(diagnosticType42, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType42.level = defaultLevel;
        types17.add(diagnosticType42);
        DiagnosticType diagnosticType43 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key43 = "JSC_HIDDEN_INTERFACE_PROPERTY";
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "key", key43);
        MessageFormat format43 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "format", format43);
        setField(diagnosticType43, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType43.level = defaultLevel;
        types17.add(diagnosticType43);
        DiagnosticType diagnosticType44 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key44 = "JSC_TYPE_PARSE_ERROR";
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "key", key44);
        MessageFormat format44 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "format", format44);
        setField(diagnosticType44, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType44.level = defaultLevel;
        types17.add(diagnosticType44);
        DiagnosticType diagnosticType45 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key45 = "JSC_HIDDEN_PROPERTY_MISMATCH";
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "key", key45);
        MessageFormat format45 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "format", format45);
        setField(diagnosticType45, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType45.level = defaultLevel;
        types17.add(diagnosticType45);
        DiagnosticType diagnosticType46 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key46 = "JSC_NOT_A_CONSTRUCTOR";
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "key", key46);
        MessageFormat format46 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "format", format46);
        setField(diagnosticType46, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType46.level = defaultLevel;
        types17.add(diagnosticType46);
        types17.add(diagnosticType14);
        DiagnosticType diagnosticType47 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key47 = "JSC_MULTIPLE_VAR_DEF";
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "key", key47);
        MessageFormat format47 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "format", format47);
        setField(diagnosticType47, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType47.level = defaultLevel;
        types17.add(diagnosticType47);
        DiagnosticType diagnosticType48 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key48 = "JSC_DUP_VAR_DECLARATION";
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "key", key48);
        MessageFormat format48 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "format", format48);
        setField(diagnosticType48, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType48.level = defaultLevel;
        types17.add(diagnosticType48);
        DiagnosticType diagnosticType49 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key49 = "JSC_DETERMINISTIC_TEST";
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "key", key49);
        MessageFormat format49 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "format", format49);
        setField(diagnosticType49, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType49.level = defaultLevel;
        types17.add(diagnosticType49);
        DiagnosticType diagnosticType50 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key50 = "JSC_MISSING_EXTENDS_TAG";
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "key", key50);
        MessageFormat format50 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "format", format50);
        setField(diagnosticType50, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType50.level = defaultLevel;
        types17.add(diagnosticType50);
        DiagnosticType diagnosticType51 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key51 = "JSC_UNRESOLVED_TYPE";
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "key", key51);
        MessageFormat format51 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "format", format51);
        setField(diagnosticType51, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType51.level = defaultLevel;
        types17.add(diagnosticType51);
        DiagnosticType diagnosticType52 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key52 = "JSC_LENDS_ON_NON_OBJECT";
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "key", key52);
        MessageFormat format52 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "format", format52);
        setField(diagnosticType52, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType52.level = defaultLevel;
        types17.add(diagnosticType52);
        DiagnosticType diagnosticType53 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key53 = "JSC_INVALID_INTERFACE_MEMBER_DECLARATION";
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "key", key53);
        MessageFormat format53 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "format", format53);
        setField(diagnosticType53, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType53.level = defaultLevel;
        types17.add(diagnosticType53);
        DiagnosticType diagnosticType54 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key54 = "JSC_CONFLICTING_EXTENDED_TYPE";
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "key", key54);
        MessageFormat format54 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "format", format54);
        setField(diagnosticType54, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType54.level = defaultLevel;
        types17.add(diagnosticType54);
        DiagnosticType diagnosticType55 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key55 = "JSC_UNKNOWN_EXPR_TYPE";
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "key", key55);
        MessageFormat format55 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "format", format55);
        setField(diagnosticType55, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType55.level = defaultLevel;
        types17.add(diagnosticType55);
        DiagnosticType diagnosticType56 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key56 = "JSC_CTOR_INITIALIZER_NOT_CTOR";
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "key", key56);
        MessageFormat format56 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "format", format56);
        setField(diagnosticType56, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType56.level = defaultLevel;
        types17.add(diagnosticType56);
        types17.add(diagnosticType25);
        DiagnosticType diagnosticType57 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key57 = "JSC_NOT_FUNCTION_TYPE";
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "key", key57);
        MessageFormat format57 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "format", format57);
        setField(diagnosticType57, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType57.level = defaultLevel;
        types17.add(diagnosticType57);
        DiagnosticType diagnosticType58 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key58 = "JSC_IFACE_INITIALIZER_NOT_IFACE";
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "key", key58);
        MessageFormat format58 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "format", format58);
        setField(diagnosticType58, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType58.level = defaultLevel;
        types17.add(diagnosticType58);
        DiagnosticType diagnosticType59 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key59 = "JSC_IMPLEMENTS_NON_INTERFACE";
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "key", key59);
        MessageFormat format59 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "format", format59);
        setField(diagnosticType59, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType59.level = defaultLevel;
        types17.add(diagnosticType59);
        DiagnosticType diagnosticType60 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key60 = "JSC_TYPE_MISMATCH";
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "key", key60);
        MessageFormat format60 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "format", format60);
        setField(diagnosticType60, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType60.level = defaultLevel;
        types17.add(diagnosticType60);
        DiagnosticType diagnosticType61 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key61 = "JSC_BAD_TYPE_FOR_BIT_OPERATION";
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "key", key61);
        MessageFormat format61 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "format", format61);
        setField(diagnosticType61, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType61.level = defaultLevel;
        types17.add(diagnosticType61);
        DiagnosticType diagnosticType62 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key62 = "JSC_FUNCTION_MASKS_VARIABLE";
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "key", key62);
        MessageFormat format62 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "format", format62);
        setField(diagnosticType62, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType62.level = defaultLevel;
        types17.add(diagnosticType62);
        DiagnosticType diagnosticType63 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key63 = "JSC_HIDDEN_INTERFACE_PROPERTY_MISMATCH";
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "key", key63);
        MessageFormat format63 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "format", format63);
        setField(diagnosticType63, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType63.level = defaultLevel;
        types17.add(diagnosticType63);
        DiagnosticType diagnosticType64 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key64 = "JSC_ILLEGAL_IMPLICIT_CAST";
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "key", key64);
        MessageFormat format64 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "format", format64);
        setField(diagnosticType64, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType64.level = defaultLevel;
        types17.add(diagnosticType64);
        setField(checkTypes, "com.google.javascript.jscomp.DiagnosticGroup", "types", types17);
        String name17 = "checkTypes";
        setField(checkTypes, "com.google.javascript.jscomp.DiagnosticGroup", "name", name17);
        DiagnosticGroups.CHECK_TYPES = checkTypes;
        DiagnosticGroup checkVariables = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types18 = new LinkedHashSet();
        types18.add(diagnosticType27);
        DiagnosticType diagnosticType65 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key65 = "JSC_VAR_MULTIPLY_DECLARED_ERROR";
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "key", key65);
        MessageFormat format65 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "format", format65);
        setField(diagnosticType65, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType65.level = defaultLevel2;
        types18.add(diagnosticType65);
        setField(checkVariables, "com.google.javascript.jscomp.DiagnosticGroup", "types", types18);
        String name18 = "checkVars";
        setField(checkVariables, "com.google.javascript.jscomp.DiagnosticGroup", "name", name18);
        DiagnosticGroups.CHECK_VARIABLES = checkVariables;
        DiagnosticGroup checkUselessCode = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types19 = new LinkedHashSet();
        DiagnosticType diagnosticType66 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key66 = "JSC_USELESS_CODE";
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "key", key66);
        MessageFormat format66 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "format", format66);
        setField(diagnosticType66, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel);
        diagnosticType66.level = defaultLevel;
        types19.add(diagnosticType66);
        DiagnosticType diagnosticType67 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key67 = "JSC_UNREACHABLE_CODE";
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "key", key67);
        MessageFormat format67 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "format", format67);
        setField(diagnosticType67, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel2);
        diagnosticType67.level = defaultLevel2;
        types19.add(diagnosticType67);
        setField(checkUselessCode, "com.google.javascript.jscomp.DiagnosticGroup", "types", types19);
        String name19 = "uselessCode";
        setField(checkUselessCode, "com.google.javascript.jscomp.DiagnosticGroup", "name", name19);
        DiagnosticGroups.CHECK_USELESS_CODE = checkUselessCode;
        DiagnosticGroup typeInvalidation = ((DiagnosticGroup) createInstance("com.google.javascript.jscomp.DiagnosticGroup"));
        Set types20 = new LinkedHashSet();
        DiagnosticType diagnosticType68 = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        String key68 = "JSC_INVALIDATION";
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "key", key68);
        MessageFormat format68 = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "format", format68);
        setField(diagnosticType68, "com.google.javascript.jscomp.DiagnosticType", "defaultLevel", defaultLevel1);
        diagnosticType68.level = defaultLevel1;
        types20.add(diagnosticType68);
        setField(typeInvalidation, "com.google.javascript.jscomp.DiagnosticGroup", "types", types20);
        String name20 = "typeInvalidation";
        setField(typeInvalidation, "com.google.javascript.jscomp.DiagnosticGroup", "name", name20);
        DiagnosticGroups.TYPE_INVALIDATION = typeInvalidation;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseModuleWrappers(java.util.List, java.util.List)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#parseModuleWrappers(java.util.List,java.util.List)}
 * @utbot.executesCondition {@code (Preconditions.checkState(specs != null);): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Maps.newHashMapWithExpectedSize(modules.size())
 *  */
    @Test
    public void testParseModuleWrappers_ThrowNullPointerException() throws AbstractCommandLineRunner.FlagUsageException  {
        ArrayList arrayList = new ArrayList();
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers(AbstractCommandLineRunner.java:505) */
        AbstractCommandLineRunner.parseModuleWrappers(arrayList, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseModuleWrappers(java.util.List, java.util.List)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#parseModuleWrappers(java.util.List,java.util.List)}
 * @utbot.executesCondition {@code (Preconditions.checkState(specs != null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(specs != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseModuleWrappers_ThrowIllegalStateException() throws AbstractCommandLineRunner.FlagUsageException  {
        AbstractCommandLineRunner.parseModuleWrappers(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseModuleWrappers(java.util.List, java.util.List)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#parseModuleWrappers(java.util.List,java.util.List)}
     */
    @Test
    public void testParseModuleWrappers() throws AbstractCommandLineRunner.FlagUsageException  {
        List list = emptyList();
        LinkedList linkedList = new LinkedList();
        JSModule jSModule = new JSModule("-3");
        jSModule.setDepth(-1);
        linkedList.add(jSModule);
        JSModule jSModule1 = new JSModule("'");
        jSModule1.setDepth(-1);
        linkedList.add(jSModule1);
        JSModule jSModule2 = new JSModule("Expected module wrapper to have <name>:<wrapper> format: ");
        jSModule2.setDepth(1);
        linkedList.add(jSModule2);
        
        HashMap actual = ((HashMap) AbstractCommandLineRunner.parseModuleWrappers(list, linkedList));
        
        HashMap expected = new HashMap();
        String string = "-3";
        String string1 = "";
        expected.put(string, string1);
        String string2 = "'";
        expected.put(string2, string1);
        String string3 = "Expected module wrapper to have <name>:<wrapper> format: ";
        expected.put(string3, string1);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.openExternExportsStream
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method openExternExportsStream(com.google.javascript.jscomp.CompilerOptions, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#openExternExportsStream(com.google.javascript.jscomp.CompilerOptions,java.lang.String)}
 * @utbot.executesCondition {@code (options.externExportsPath == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testOpenExternExportsStream_OptionsExternExportsPathEqualsNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class stringType = Class.forName("java.lang.String");
        Method openExternExportsStreamMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("openExternExportsStream", compilerOptionsType, stringType);
        openExternExportsStreamMethod.setAccessible(true);
        java.lang.Object[] openExternExportsStreamMethodArguments = new java.lang.Object[2];
        openExternExportsStreamMethodArguments[0] = compilerOptions;
        openExternExportsStreamMethodArguments[1] = ((Object) null);
        Writer actual = ((Writer) openExternExportsStreamMethod.invoke(commandLineRunner, openExternExportsStreamMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method openExternExportsStream(com.google.javascript.jscomp.CompilerOptions, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#openExternExportsStream(com.google.javascript.jscomp.CompilerOptions,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: options.externExportsPath == null
 *  */
    @Test
    public void testOpenExternExportsStream_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.openExternExportsStream] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.openExternExportsStream(AbstractCommandLineRunner.java:813) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class stringType = Class.forName("java.lang.String");
        Method openExternExportsStreamMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("openExternExportsStream", compilerOptionsType, stringType);
        openExternExportsStreamMethod.setAccessible(true);
        java.lang.Object[] openExternExportsStreamMethodArguments = new java.lang.Object[2];
        openExternExportsStreamMethodArguments[0] = ((Object) null);
        openExternExportsStreamMethodArguments[1] = ((Object) null);
        try {
            openExternExportsStreamMethod.invoke(commandLineRunner, openExternExportsStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#openExternExportsStream(com.google.javascript.jscomp.CompilerOptions,java.lang.String)}
 * @utbot.executesCondition {@code (options.externExportsPath == null): False}
 * @utbot.executesCondition {@code (!exPath.contains(File.separator)): False}
 * @utbot.invokes {@link java.lang.String#contains(java.lang.CharSequence)}
 * @utbot.invokes com.google.javascript.jscomp.AbstractCommandLineRunner#fileNameToOutputWriter(java.lang.String)
 * @utbot.returnsFrom {@code return fileNameToOutputWriter(exPath);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return fileNameToOutputWriter(exPath);
 *  */
    @Test
    public void testOpenExternExportsStream_ThrowNullPointerException_1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode", true);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String externExportsPath = "";
        compilerOptions.externExportsPath = externExportsPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.openExternExportsStream] produces [java.lang.NullPointerException]
            java.base/java.io.File.<init>(File.java:278)
            com.google.javascript.jscomp.AbstractCommandLineRunner.openExternExportsStream(AbstractCommandLineRunner.java:820) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class stringType = Class.forName("java.lang.String");
        Method openExternExportsStreamMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("openExternExportsStream", compilerOptionsType, stringType);
        openExternExportsStreamMethod.setAccessible(true);
        java.lang.Object[] openExternExportsStreamMethodArguments = new java.lang.Object[2];
        openExternExportsStreamMethodArguments[0] = compilerOptions;
        openExternExportsStreamMethodArguments[1] = ((Object) null);
        try {
            openExternExportsStreamMethod.invoke(commandLineRunner, openExternExportsStreamMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.streamToOutputWriter
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method streamToOutputWriter(java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#streamToOutputWriter(java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputCharset == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BufferedWriter(new OutputStreamWriter(stream));
 *  */
    @Test
    public void testStreamToOutputWriter_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.streamToOutputWriter] produces [java.lang.NullPointerException]
            java.base/java.io.Writer.<init>(Writer.java:174)
            java.base/java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:108)
            com.google.javascript.jscomp.AbstractCommandLineRunner.streamToOutputWriter(AbstractCommandLineRunner.java:906) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class outputStreamType = Class.forName("java.io.OutputStream");
        Method streamToOutputWriterMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("streamToOutputWriter", outputStreamType);
        streamToOutputWriterMethod.setAccessible(true);
        java.lang.Object[] streamToOutputWriterMethodArguments = new java.lang.Object[1];
        streamToOutputWriterMethodArguments[0] = ((Object) null);
        try {
            streamToOutputWriterMethod.invoke(commandLineRunner, streamToOutputWriterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#streamToOutputWriter(java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputCharset == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new BufferedWriter(new OutputStreamWriter(stream, outputCharset));
 *  */
    @Test
    public void testStreamToOutputWriter_ThrowNullPointerException_1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        String outputCharset = "";
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "outputCharset", outputCharset);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.streamToOutputWriter] produces [java.lang.NullPointerException]
            java.base/java.io.Writer.<init>(Writer.java:174)
            java.base/java.io.OutputStreamWriter.<init>(OutputStreamWriter.java:96)
            com.google.javascript.jscomp.AbstractCommandLineRunner.streamToOutputWriter(AbstractCommandLineRunner.java:909) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class outputStreamType = Class.forName("java.io.OutputStream");
        Method streamToOutputWriterMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("streamToOutputWriter", outputStreamType);
        streamToOutputWriterMethod.setAccessible(true);
        java.lang.Object[] streamToOutputWriterMethodArguments = new java.lang.Object[1];
        streamToOutputWriterMethodArguments[0] = ((Object) null);
        try {
            streamToOutputWriterMethod.invoke(commandLineRunner, streamToOutputWriterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for streamToOutputWriter
    
    public void testStreamToOutputWriter_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.nio.charset.Charset java.nio.charset.Charset.defaultCharset accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.getCommandLineConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCommandLineConfig()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#getCommandLineConfig()}
 * @utbot.returnsFrom {@code return config;}
 *  */
    @Test
    public void testGetCommandLineConfig_ReturnConfig() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        AbstractCommandLineRunner.CommandLineConfig actual = commandLineRunner.getCommandLineConfig();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.maybeCreateDirsForPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeCreateDirsForPath(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#maybeCreateDirsForPath(java.lang.String)}
 * @utbot.executesCondition {@code (pathPrefix.length() > 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testMaybeCreateDirsForPath_PathPrefixLengthLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method maybeCreateDirsForPathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("maybeCreateDirsForPath", stringType);
        maybeCreateDirsForPathMethod.setAccessible(true);
        java.lang.Object[] maybeCreateDirsForPathMethodArguments = new java.lang.Object[1];
        maybeCreateDirsForPathMethodArguments[0] = string;
        maybeCreateDirsForPathMethod.invoke(null, maybeCreateDirsForPathMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeCreateDirsForPath(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#maybeCreateDirsForPath(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: pathPrefix.length() > 0
 *  */
    @Test
    public void testMaybeCreateDirsForPath_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.maybeCreateDirsForPath] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.maybeCreateDirsForPath(AbstractCommandLineRunner.java:578) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method maybeCreateDirsForPathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("maybeCreateDirsForPath", stringType);
        maybeCreateDirsForPathMethod.setAccessible(true);
        java.lang.Object[] maybeCreateDirsForPathMethodArguments = new java.lang.Object[1];
        maybeCreateDirsForPathMethodArguments[0] = ((Object) null);
        try {
            maybeCreateDirsForPathMethod.invoke(null, maybeCreateDirsForPathMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method maybeCreateDirsForPath(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#maybeCreateDirsForPath(java.lang.String)}
     */
    @Test
    public void testMaybeCreateDirsForPathWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method maybeCreateDirsForPathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("maybeCreateDirsForPath", stringType);
        maybeCreateDirsForPathMethod.setAccessible(true);
        java.lang.Object[] maybeCreateDirsForPathMethodArguments = new java.lang.Object[1];
        maybeCreateDirsForPathMethodArguments[0] = "\u0014\n\t\r";
        maybeCreateDirsForPathMethod.invoke(null, maybeCreateDirsForPathMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateMapPerModule
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldGenerateMapPerModule(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#shouldGenerateMapPerModule(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.returnsFrom {@code return options.sourceMapOutputPath != null && options.sourceMapOutputPath.contains("%outname%");}
 *  */
    @Test
    public void testShouldGenerateMapPerModule_OptionsSourceMapOutputPathEqualsNullAndOptionsSourceMapOutputPathContains() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method shouldGenerateMapPerModuleMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("shouldGenerateMapPerModule", compilerOptionsType);
        shouldGenerateMapPerModuleMethod.setAccessible(true);
        java.lang.Object[] shouldGenerateMapPerModuleMethodArguments = new java.lang.Object[1];
        shouldGenerateMapPerModuleMethodArguments[0] = compilerOptions;
        boolean actual = ((Boolean) shouldGenerateMapPerModuleMethod.invoke(commandLineRunner, shouldGenerateMapPerModuleMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#shouldGenerateMapPerModule(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.executesCondition {@code (options.sourceMapOutputPath.contains("%outname%")): False}
 * @utbot.invokes {@link java.lang.String#contains(java.lang.CharSequence)}
 * @utbot.returnsFrom {@code return options.sourceMapOutputPath != null && options.sourceMapOutputPath.contains("%outname%");}
 *  */
    @Test
    public void testShouldGenerateMapPerModule_NotOptionsSourceMapOutputPathContains() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method shouldGenerateMapPerModuleMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("shouldGenerateMapPerModule", compilerOptionsType);
        shouldGenerateMapPerModuleMethod.setAccessible(true);
        java.lang.Object[] shouldGenerateMapPerModuleMethodArguments = new java.lang.Object[1];
        shouldGenerateMapPerModuleMethodArguments[0] = compilerOptions;
        boolean actual = ((Boolean) shouldGenerateMapPerModuleMethod.invoke(commandLineRunner, shouldGenerateMapPerModuleMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldGenerateMapPerModule(com.google.javascript.jscomp.CompilerOptions)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#shouldGenerateMapPerModule(com.google.javascript.jscomp.CompilerOptions)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return options.sourceMapOutputPath != null && options.sourceMapOutputPath.contains("%outname%");
 *  */
    @Test
    public void testShouldGenerateMapPerModule_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateMapPerModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateMapPerModule(AbstractCommandLineRunner.java:799) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class compilerOptionsType = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Method shouldGenerateMapPerModuleMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("shouldGenerateMapPerModule", compilerOptionsType);
        shouldGenerateMapPerModuleMethod.setAccessible(true);
        java.lang.Object[] shouldGenerateMapPerModuleMethodArguments = new java.lang.Object[1];
        shouldGenerateMapPerModuleMethodArguments[0] = ((Object) null);
        try {
            shouldGenerateMapPerModuleMethod.invoke(commandLineRunner, shouldGenerateMapPerModuleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expandCommandLinePath(java.lang.String, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandCommandLinePath(java.lang.String,com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !config.module.isEmpty()
 *  */
    @Test
    public void testExpandCommandLinePath_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:847) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method expandCommandLinePathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("expandCommandLinePath", stringType, jSModuleType);
        expandCommandLinePathMethod.setAccessible(true);
        java.lang.Object[] expandCommandLinePathMethodArguments = new java.lang.Object[2];
        expandCommandLinePathMethodArguments[0] = ((Object) null);
        expandCommandLinePathMethodArguments[1] = ((Object) null);
        try {
            expandCommandLinePathMethod.invoke(commandLineRunner, expandCommandLinePathMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandCommandLinePath(java.lang.String,com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (!config.module.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return path.replace("%outname%", sub);
 *  */
    @Test
    public void testExpandCommandLinePath_ThrowNullPointerException_2() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method expandCommandLinePathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("expandCommandLinePath", stringType, jSModuleType);
        expandCommandLinePathMethod.setAccessible(true);
        java.lang.Object[] expandCommandLinePathMethodArguments = new java.lang.Object[2];
        expandCommandLinePathMethodArguments[0] = ((Object) null);
        expandCommandLinePathMethodArguments[1] = ((Object) null);
        try {
            expandCommandLinePathMethod.invoke(commandLineRunner, expandCommandLinePathMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandCommandLinePath(java.lang.String,com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (!config.module.isEmpty()): False}
 * @utbot.invokes {@link java.lang.String#replace(java.lang.CharSequence,java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return path.replace("%outname%", sub);
 *  */
    @Test
    public void testExpandCommandLinePath_ThrowNullPointerException_3() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath] produces [java.lang.NullPointerException]
            java.base/java.lang.String.replace(String.java:2963)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method expandCommandLinePathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("expandCommandLinePath", stringType, jSModuleType);
        expandCommandLinePathMethod.setAccessible(true);
        java.lang.Object[] expandCommandLinePathMethodArguments = new java.lang.Object[2];
        expandCommandLinePathMethodArguments[0] = string;
        expandCommandLinePathMethodArguments[1] = ((Object) null);
        try {
            expandCommandLinePathMethod.invoke(commandLineRunner, expandCommandLinePathMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandCommandLinePath(java.lang.String,com.google.javascript.jscomp.JSModule)}
 * @utbot.executesCondition {@code (!config.module.isEmpty()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3100(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return path.replace("%outname%", sub);
 *  */
    @Test
    public void testExpandCommandLinePath_ThrowNullPointerException_1() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        String moduleOutputPathPrefix = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "moduleOutputPathPrefix", moduleOutputPathPrefix);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method expandCommandLinePathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("expandCommandLinePath", stringType, jSModuleType);
        expandCommandLinePathMethod.setAccessible(true);
        java.lang.Object[] expandCommandLinePathMethodArguments = new java.lang.Object[2];
        expandCommandLinePathMethodArguments[0] = ((Object) null);
        expandCommandLinePathMethodArguments[1] = ((Object) null);
        try {
            expandCommandLinePathMethod.invoke(commandLineRunner, expandCommandLinePathMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expandCommandLinePath(java.lang.String, com.google.javascript.jscomp.JSModule)
    
    @Test
    public void testExpandCommandLinePath1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        String moduleOutputPathPrefix = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "moduleOutputPathPrefix", moduleOutputPathPrefix);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        String string = "";
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method expandCommandLinePathMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("expandCommandLinePath", stringType, jSModuleType);
        expandCommandLinePathMethod.setAccessible(true);
        java.lang.Object[] expandCommandLinePathMethodArguments = new java.lang.Object[2];
        expandCommandLinePathMethodArguments[0] = string;
        expandCommandLinePathMethodArguments[1] = ((Object) null);
        String actual = ((String) expandCommandLinePathMethod.invoke(commandLineRunner, expandCommandLinePathMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testExpandSourceMapPath_ReturnNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        
        String actual = commandLineRunner.expandSourceMapPath(compilerOptions, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testExpandSourceMapPath_ReturnNull_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        String actual = commandLineRunner.expandSourceMapPath(compilerOptions, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: Strings.isEmpty(options.sourceMapOutputPath)
 *  */
    @Test
    public void testExpandSourceMapPath_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(AbstractCommandLineRunner.java:858) */
        commandLineRunner.expandSourceMapPath(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return expandCommandLinePath(options.sourceMapOutputPath, forModule);
 *  */
    @Test
    public void testExpandSourceMapPath_ThrowNullPointerException_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = " ";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:847)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(AbstractCommandLineRunner.java:861) */
        commandLineRunner.expandSourceMapPath(compilerOptions, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return expandCommandLinePath(options.sourceMapOutputPath, forModule);
 *  */
    @Test
    public void testExpandSourceMapPath_ThrowNullPointerException_2() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = " ";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath] produces [java.lang.NullPointerException]
            java.base/java.lang.String.replace(String.java:2963)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(AbstractCommandLineRunner.java:861) */
        commandLineRunner.expandSourceMapPath(compilerOptions, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return expandCommandLinePath(options.sourceMapOutputPath, forModule);
 *  */
    @Test
    public void testExpandSourceMapPath_ThrowNullPointerException_3() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = " ";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath] produces [java.lang.NullPointerException]
            java.base/java.lang.String.replace(String.java:2963)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(AbstractCommandLineRunner.java:852)
            com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(AbstractCommandLineRunner.java:861) */
        commandLineRunner.expandSourceMapPath(compilerOptions, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expandSourceMapPath(com.google.javascript.jscomp.CompilerOptions, com.google.javascript.jscomp.JSModule)
    
    @Test
    public void testExpandSourceMapPath1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String jsOutputFile = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "jsOutputFile", jsOutputFile);
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        String sourceMapOutputPath = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        compilerOptions.sourceMapOutputPath = sourceMapOutputPath;
        
        String actual = commandLineRunner.expandSourceMapPath(compilerOptions, null);
        
        assertEquals(sourceMapOutputPath, actual);
    }
    
    @Test
    public void testExpandSourceMapPath2() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        String moduleOutputPathPrefix = "\u0000";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "moduleOutputPathPrefix", moduleOutputPathPrefix);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compilerOptions.sourceMapOutputPath = moduleOutputPathPrefix;
        JSModule jSModule = new JSModule(null);
        
        String actual = commandLineRunner.expandSourceMapPath(compilerOptions, jSModule);
        
        assertEquals(moduleOutputPathPrefix, actual);
    }
    
    @Test
    public void testExpandSourceMapPath3() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        String moduleOutputPathPrefix = "\u0000\u0000";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "moduleOutputPathPrefix", moduleOutputPathPrefix);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        CompilerOptions compilerOptions = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compilerOptions.sourceMapOutputPath = moduleOutputPathPrefix;
        
        String actual = commandLineRunner.expandSourceMapPath(compilerOptions, null);
        
        assertEquals(moduleOutputPathPrefix, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToOutputWriter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fileNameToOutputWriter(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#fileNameToOutputWriter(java.lang.String)}
 * @utbot.executesCondition {@code (fileName == null): False}
 * @utbot.executesCondition {@code (testMode): True}
 * @utbot.returnsFrom {@code return new StringWriter();}
 *  */
    @Test
    public void testFileNameToOutputWriter_TestMode() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "testMode", true);
        String string = "";
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method fileNameToOutputWriterMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("fileNameToOutputWriter", stringType);
        fileNameToOutputWriterMethod.setAccessible(true);
        java.lang.Object[] fileNameToOutputWriterMethodArguments = new java.lang.Object[1];
        fileNameToOutputWriterMethodArguments[0] = string;
        StringWriter actual = ((StringWriter) fileNameToOutputWriterMethod.invoke(commandLineRunner, fileNameToOutputWriterMethodArguments));
        
        StringWriter expected = ((StringWriter) createInstance("java.io.StringWriter"));
        
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#fileNameToOutputWriter(java.lang.String)}
 * @utbot.executesCondition {@code (fileName == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFileNameToOutputWriter_FileNameEqualsNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class stringType = Class.forName("java.lang.String");
        Method fileNameToOutputWriterMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("fileNameToOutputWriter", stringType);
        fileNameToOutputWriterMethod.setAccessible(true);
        java.lang.Object[] fileNameToOutputWriterMethodArguments = new java.lang.Object[1];
        fileNameToOutputWriterMethodArguments[0] = ((Object) null);
        Writer actual = ((Writer) fileNameToOutputWriterMethod.invoke(commandLineRunner, fileNameToOutputWriterMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SECURITY for method fileNameToOutputWriter(java.lang.String)
    
    @Test
    @Ignore(value = "Disabled due to sandbox")
    public void testFileNameToOutputWriter1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        String string = "/";
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToOutputWriter] produces [java.security.AccessControlException: access denied ("java.io.FilePermission" "\" "write")]
            java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485)
            java.base/java.security.AccessController.checkPermission(AccessController.java:1068)
            java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416)
            java.base/java.lang.SecurityManager.checkWrite(SecurityManager.java:847)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:223)
            java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:123)
            com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream(AbstractCommandLineRunner.java:897)
            com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToOutputWriter(AbstractCommandLineRunner.java:885) */
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDefineOrTweakReplacements(java.util.List, com.google.javascript.jscomp.CompilerOptions, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createDefineOrTweakReplacements(java.util.List,com.google.javascript.jscomp.CompilerOptions,boolean)}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testCreateDefineOrTweakReplacements_ListIterator() {
        ArrayList arrayList = new ArrayList();
        
        AbstractCommandLineRunner.createDefineOrTweakReplacements(arrayList, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createDefineOrTweakReplacements(java.util.List, com.google.javascript.jscomp.CompilerOptions, boolean)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createDefineOrTweakReplacements(java.util.List,com.google.javascript.jscomp.CompilerOptions,boolean)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String override: definitions)
 *  */
    @Test
    public void testCreateDefineOrTweakReplacements_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements(AbstractCommandLineRunner.java:1044) */
        AbstractCommandLineRunner.createDefineOrTweakReplacements(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#createDefineOrTweakReplacements(java.util.List,com.google.javascript.jscomp.CompilerOptions,boolean)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(String override: definitions)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String[] assignment = override.split("=", 2);
 *  */
    @Test
    public void testCreateDefineOrTweakReplacements_ThrowNullPointerException_1() {
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
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements(AbstractCommandLineRunner.java:1045) */
        AbstractCommandLineRunner.createDefineOrTweakReplacements(arrayList, null, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createDefineOrTweakReplacements(java.util.List, com.google.javascript.jscomp.CompilerOptions, boolean)
    
    @Test(expected = RuntimeException.class)
    public void testCreateDefineOrTweakReplacements1() {
        ArrayList arrayList = new ArrayList();
        String string = "";
        arrayList.add(string);
        arrayList.add(null);
        arrayList.add(null);
        
        AbstractCommandLineRunner.createDefineOrTweakReplacements(arrayList, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.printModuleGraphManifestTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method printModuleGraphManifestTo(com.google.javascript.jscomp.JSModuleGraph, java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#printModuleGraphManifestTo(com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable)}
 * @utbot.invokes {@link com.google.common.base.Joiner#on(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.JSModuleGraph#getAllModulesInDependencyOrder()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSModule module: graph.getAllModulesInDependencyOrder())
 *  */
    @Test
    public void testPrintModuleGraphManifestTo_ThrowNullPointerException() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.printModuleGraphManifestTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.printModuleGraphManifestTo(AbstractCommandLineRunner.java:1150) */
        commandLineRunner.printModuleGraphManifestTo(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method printModuleGraphManifestTo(com.google.javascript.jscomp.JSModuleGraph, java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#printModuleGraphManifestTo(com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable)}
 * @utbot.invokes {@link com.google.common.base.Joiner#on(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.JSModuleGraph#getAllModulesInDependencyOrder()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSModule module: graph.getAllModulesInDependencyOrder())
 *  */
    @Test(expected = NullPointerException.class)
    public void testPrintModuleGraphManifestTo_ThrowNullPointerException_1() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        JSModuleGraph jSModuleGraph = ((JSModuleGraph) createInstance("com.google.javascript.jscomp.JSModuleGraph"));
        
        commandLineRunner.printModuleGraphManifestTo(jSModuleGraph, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateManifestPerModule
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldGenerateManifestPerModule()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#shouldGenerateManifestPerModule()}
 * @utbot.returnsFrom {@code return !config.module.isEmpty() && config.outputManifest != null && config.outputManifest.contains("%outname%");}
 *  */
    @Test
    public void testShouldGenerateManifestPerModule_NotConfigModuleIsEmptyAndConfigOutputManifestNotEqualsNullAndConfigOutputManifestContains() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method shouldGenerateManifestPerModuleMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("shouldGenerateManifestPerModule");
        shouldGenerateManifestPerModuleMethod.setAccessible(true);
        java.lang.Object[] shouldGenerateManifestPerModuleMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) shouldGenerateManifestPerModuleMethod.invoke(commandLineRunner, shouldGenerateManifestPerModuleMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#shouldGenerateManifestPerModule()}
 * @utbot.executesCondition {@code (config.outputManifest != null): False}
 * @utbot.returnsFrom {@code return !config.module.isEmpty() && config.outputManifest != null && config.outputManifest.contains("%outname%");}
 *  */
    @Test
    public void testShouldGenerateManifestPerModule_ConfigOutputManifestEqualsNull() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method shouldGenerateManifestPerModuleMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("shouldGenerateManifestPerModule");
        shouldGenerateManifestPerModuleMethod.setAccessible(true);
        java.lang.Object[] shouldGenerateManifestPerModuleMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) shouldGenerateManifestPerModuleMethod.invoke(commandLineRunner, shouldGenerateManifestPerModuleMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#shouldGenerateManifestPerModule()}
 * @utbot.executesCondition {@code (config.outputManifest != null): True}
 * @utbot.executesCondition {@code (config.outputManifest.contains("%outname%")): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$3500(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.invokes {@link java.lang.String#contains(java.lang.CharSequence)}
 * @utbot.returnsFrom {@code return !config.module.isEmpty() && config.outputManifest != null && config.outputManifest.contains("%outname%");}
 *  */
    @Test
    public void testShouldGenerateManifestPerModule_NotConfigOutputManifestContains() throws Exception  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        ArrayList module = new ArrayList();
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        module.add(null);
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "module", module);
        String outputManifest = "";
        setField(config, "com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", "outputManifest", outputManifest);
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method shouldGenerateManifestPerModuleMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("shouldGenerateManifestPerModule");
        shouldGenerateManifestPerModuleMethod.setAccessible(true);
        java.lang.Object[] shouldGenerateManifestPerModuleMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) shouldGenerateManifestPerModuleMethod.invoke(commandLineRunner, shouldGenerateManifestPerModuleMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldGenerateManifestPerModule()
    
    /**
    @utbot.classUnderTest {@link AbstractCommandLineRunner}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AbstractCommandLineRunner#shouldGenerateManifestPerModule()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig#access$2600(com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !config.module.isEmpty() && config.outputManifest != null && config.outputManifest.contains("%outname%");
 *  */
    @Test
    public void testShouldGenerateManifestPerModule_ThrowNullPointerException() throws Throwable  {
        CommandLineRunner commandLineRunner = ((CommandLineRunner) createInstance("com.google.javascript.jscomp.CommandLineRunner"));
        AbstractCommandLineRunner.CommandLineConfig config = ((AbstractCommandLineRunner.CommandLineConfig) createInstance("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        setField(commandLineRunner, "com.google.javascript.jscomp.AbstractCommandLineRunner", "config", config);
        
        /* This test fails because method [com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateManifestPerModule] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateManifestPerModule(AbstractCommandLineRunner.java:1106) */
        Class abstractCommandLineRunnerClazz = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Method shouldGenerateManifestPerModuleMethod = abstractCommandLineRunnerClazz.getDeclaredMethod("shouldGenerateManifestPerModule");
        shouldGenerateManifestPerModuleMethod.setAccessible(true);
        java.lang.Object[] shouldGenerateManifestPerModuleMethodArguments = new java.lang.Object[0];
        try {
            shouldGenerateManifestPerModuleMethod.invoke(commandLineRunner, shouldGenerateManifestPerModuleMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields914617342927700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields914617342927700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass914617342934800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914617342927700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914617342934800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields914617346852500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields914617346852500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass914617346856500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields914617346852500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass914617346856500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

