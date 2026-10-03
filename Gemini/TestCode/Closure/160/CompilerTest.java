package com.google.javascript.jscomp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Suite for Closure Compiler (Closure-160b)
 * Focuses on Branch/Condition Coverage and Edge Cases.
 */
public class CompilerTest {

    private Compiler compiler;
    private ByteArrayOutputStream errContent;

    @Before
    public void setUp() {
        compiler = new Compiler();
        errContent = new ByteArrayOutputStream();
    }

    @After
    public void tearDown() {
        compiler = null;
    }

    @Test
    public void testDefaultConstructorAndLoggingLevel() {
        Compiler defaultCompiler = new Compiler();
        assertNotNull(defaultCompiler);
        Compiler.setLoggingLevel(Level.WARNING);
    }

    @Test
    public void testConstructorWithPrintStream() {
        PrintStream ps = new PrintStream(errContent);
        Compiler streamCompiler = new Compiler(ps);
        assertNotNull(streamCompiler);
    }

    @Test
    public void testConstructorWithErrorManager() {
        LoggerErrorManager lem = new LoggerErrorManager(
                new BasicErrorManager() {
                    @Override protected void printSummary() {}
                    @Override public void println(CheckLevel level, JSError error) {}
                }
        );
        Compiler emCompiler = new Compiler(lem);
        assertNotNull(emCompiler);
        assertSame(lem, emCompiler.getErrorManager());
    }

    @Test(expected = NullPointerException.class)
    public void testSetErrorManagerNull() {
        compiler.setErrorManager(null);
    }

    @Test
    public void testInitOptionsWithNullErrorManagerAndNullOutStream() {
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = false;
        compiler.initOptions(options);
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testInitOptionsWithOutStream() {
        PrintStream ps = new PrintStream(errContent);
        Compiler c = new Compiler(ps);
        CompilerOptions options = new CompilerOptions();
        options.summaryDetailLevel = 1;
        c.initOptions(options);
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testInitOptionsCheckTypesEnablesAndDisables() {
        CompilerOptions options = new CompilerOptions();
        // Enables CHECK_TYPES via DiagnosticGroups
        options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.ERROR);
        compiler.initOptions(options);
        assertTrue(options.checkTypes);

        CompilerOptions options2 = new CompilerOptions();
        options2.disableWarningsGuard(new DiagnosticGroupWarningsGuard(DiagnosticGroups.CHECK_TYPES, CheckLevel.OFF));
        compiler.initOptions(options2);
        // Checking branch coverage for checkTypes logic
    }

    @Test
    public void testInitOptionsCheckGlobalThisLevel() {
        CompilerOptions options = new CompilerOptions();
        options.checkGlobalThisLevel = CheckLevel.WARNING;
        compiler.initOptions(options);
        assertNotNull(compiler.warningsGuard);
    }

    @Test
    public void testCheckFirstModuleEmptyList() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        // Empty modules triggers EMPTY_MODULE_LIST_ERROR
        compiler.initModules(Collections.<JSSourceFile>emptyList(), Collections.<JSModule>emptyList(), options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testCheckFirstModuleEmptyRootModuleWithMultipleModules() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        
        JSModule emptyRoot = new JSModule("m1");
        JSModule m2 = new JSModule("m2");
        m2.add(JSSourceFile.fromCode("test.js", "var x = 1;"));

        List<JSModule> modules = Lists.newArrayList(emptyRoot, m2);
        compiler.initModules(Collections.<JSSourceFile>emptyList(), modules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testMultipleModulesGraphCreation() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);

        JSModule m1 = new JSModule("m1");
        m1.add(JSSourceFile.fromCode("m1.js", "var a = 1;"));
        JSModule m2 = new JSModule("m2");
        m2.add(JSSourceFile.fromCode("m2.js", "var b = 2;"));
        m2.addDependency(m1);

        List<JSModule> modules = Lists.newArrayList(m1, m2);
        compiler.initModules(Collections.<JSSourceFile>emptyList(), modules, options);
        assertNotNull(compiler.getModuleGraph());
    }

    @Test
    public void testGetSourceLineBoundaryConditions() {
        // Line number < 1 should return null immediately
        assertNull(compiler.getSourceLine("nonexistent.js", 0));
        assertNull(compiler.getSourceLine("nonexistent.js", -5));

        // Valid line number but unknown file name
        assertNull(compiler.getSourceLine("unknown.js", 1));
    }

    @Test
    public void testGetSourceRegionBoundaryConditions() {
        assertNull(compiler.getSourceRegion("nonexistent.js", 0));
        assertNull(compiler.getSourceRegion("nonexistent.js", -1));
        assertNull(compiler.getSourceRegion("unknown.js", 5));
    }

    @Test
    public void testCompileSingleInputSuccess() {
        JSSourceFile extern = JSSourceFile.fromCode("externs.js", "var window;");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { return 1; }");
        CompilerOptions options = new CompilerOptions();
        
        Result result = compiler.compile(extern, input, options);
        assertNotNull(result);
        assertTrue(result.success);
    }

    @Test
    public void testCompileWithModuleAndSemicolonHeuristic() {
        JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
        JSModule module = new JSModule("testModule");
        module.add(JSSourceFile.fromCode("m.js", "var x = 1")); // Lacks semicolon to test CodeBuilder heuristic

        CompilerOptions options = new CompilerOptions();
        options.printInputDelimiter = true;
        options.inputDelimiter = "// -- %name% --";

        Result result = compiler.compile(Collections.singletonList(extern), Collections.singletonList(module), options);
        assertNotNull(result);
        String source = compiler.toSource();
        assertTrue(source.contains(";"));
    }

    @Test(expected = IllegalStateException.class)
    public void testSetPassConfigTwiceThrowsException() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        PassConfig passConfig1 = new DefaultPassConfig(options);
        PassConfig passConfig2 = new DefaultPassConfig(options);
        
        compiler.setPassConfig(passConfig1);
        compiler.setPassConfig(passConfig2); // Should throw IllegalStateException
    }

    @Test
    public void testNewExternInputConflict() {
        compiler.initCompilerOptionsIfTesting();
        compiler.newExternInput("sharedName.js");
        
        try {
            compiler.newExternInput("sharedName.js");
            fail("Expected IllegalArgumentException due to conflicting externs name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Conflicting externs name"));
        }
    }

    @Test
    public void testGetNodeForCodeInsertionEdgeCases() {
        compiler.initCompilerOptionsIfTesting();
        // If module is null and inputs is empty -> IllegalStateException
        try {
            compiler.getNodeForCodeInsertion(null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("No inputs", e.getMessage());
        }

        // Add synthetic code to populate inputs
        compiler.parseSyntheticCode("var a = 1;");
        // Test module with no inputs
        JSModule emptyModule = new JSModule("emptyMod");
        try {
            compiler.getNodeForCodeInsertion(emptyModule);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Root module has no inputs", e.getMessage());
        }
    }

    @Test
    public void testStateSaveAndRestore() {
        JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        CompilerOptions options = new CompilerOptions();
        compiler.compile(extern, input, options);

        Compiler.IntermediateState state = compiler.getState();
        assertNotNull(state);

        Compiler compiler2 = new Compiler();
        compiler2.initOptions(options);
        compiler2.setState(state);
        assertNotNull(compiler2.getRoot());
    }
}