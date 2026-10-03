package com.google.javascript.jscomp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Suite for com.google.javascript.jscomp.Compiler (Defects4J Closure-149b).
 * Achieves high Branch/Condition coverage and validates critical edge cases.
 */
public class CompilerTest {

    private Compiler compiler;
    private CompilerOptions options;

    @Before
    public void setUp() {
        compiler = new Compiler();
        options = new CompilerOptions();
    }

    @After
    public void tearDown() {
        compiler = null;
        options = null;
    }

    @Test
    public void testDefaultConstructorAndErrorManagerSetup() {
        Compiler c = new Compiler();
        c.initOptions(options);
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testPrintStreamConstructorAndErrorManager() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        Compiler c = new Compiler(ps);
        c.initOptions(options);
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testCustomErrorManagerConstructor() {
        LoggerErrorManager lem = new LoggerErrorManager(
            new SimpleErrorFormat(CheckLevel.ERROR).toFormatter(compiler, false),
            java.util.logging.Logger.getLogger("TestLogger")
        );
        Compiler c = new Compiler(lem);
        assertEquals(lem, c.getErrorManager());
        
        // Test Preconditions.checkNotNull for setErrorManager
        try {
            c.setErrorManager(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testEmptyModuleListError() {
        List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
        List<JSModule> modules = new ArrayList<JSModule>();
        
        compiler.initModules(externs, modules, options);
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrorCount());
        assertEquals(Compiler.EMPTY_MODULE_LIST_ERROR, compiler.getErrors()[0].type);
    }

    @Test
    public void testEmptyRootModuleError() {
        List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
        List<JSModule> modules = new ArrayList<JSModule>();
        
        JSModule m1 = new JSModule("m1"); // Empty inputs
        JSModule m2 = new JSModule("m2");
        m2.add(JSSourceFile.fromCode("m2.js", "var a = 1;"));
        
        modules.add(m1);
        modules.add(m2);

        compiler.initModules(externs, modules, options);
        assertTrue(compiler.hasErrors());
        assertEquals(Compiler.EMPTY_ROOT_MODULE_ERROR, compiler.getErrors()[0].type);
    }

    @Test
    public void testModuleDependencyError() {
        List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
        List<JSModule> modules = new ArrayList<JSModule>();
        
        JSModule m1 = new JSModule("m1");
        m1.add(JSSourceFile.fromCode("m1.js", "var a = 1;"));
        JSModule m2 = new JSModule("m2");
        m2.add(JSSourceFile.fromCode("m2.js", "var b = 2;"));
        
        // Create a circular or invalid dependency scenario by adding modules improperly if applicable,
        // or triggering JSModuleGraph.ModuleDependenceException.
        // Let's create a dependency loop: m1 depends on m2, m2 depends on m1
        m1.addDependency(m2);
        m2.addDependency(m1);
        
        modules.add(m1);
        modules.add(m2);

        compiler.initModules(externs, modules, options);
        assertTrue(compiler.hasErrors());
        assertEquals(Compiler.MODULE_DEPENDENCY_ERROR, compiler.getErrors()[0].type);
    }

    @Test
    public void testDuplicateExternAndInputInputs() {
        List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
        externs.add(JSSourceFile.fromCode("ext.js", "var x;"));
        externs.add(JSSourceFile.fromCode("ext.js", "var y;")); // Duplicate extern

        List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
        inputs.add(JSSourceFile.fromCode("app.js", "var c;"));
        inputs.add(JSSourceFile.fromCode("app.js", "var d;")); // Duplicate input

        compiler.init(externs, inputs, options);
        assertTrue(compiler.hasErrors());
        // Should contain DUPLICATE_EXTERN_INPUT and DUPLICATE_INPUT
        boolean foundExternDup = false;
        boolean foundInputDup = false;
        for (JSError err : compiler.getErrors()) {
            if (err.type == Compiler.DUPLICATE_EXTERN_INPUT) foundExternDup = true;
            if (err.type == Compiler.DUPLICATE_INPUT) foundInputDup = true;
        }
        assertTrue(foundExternDup);
        assertTrue(foundInputDup);
    }

    @Test
    public void testNewExternInputConflict() {
        List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
        externs.add(JSSourceFile.fromCode("conflict.js", "var x;"));
        compiler.init(externs, new ArrayList<JSSourceFile>(), options);

        try {
            compiler.newExternInput("conflict.js");
            fail("Expected IllegalArgumentException due to conflicting externs name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Conflicting externs name"));
        }
    }

    @Test
    public void testSourceLineAndRegionEdgeCases() {
        List<JSSourceFile> externs = new ArrayList<JSSourceFile>();
        List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
        inputs.add(JSSourceFile.fromCode("test.js", "function foo() {\n  return 42;\n}"));
        
        compiler.init(externs, inputs, options);

        // Line number < 1 should return null
        assertNull(compiler.getSourceLine("test.js", 0));
        assertNull(compiler.getSourceLine("test.js", -5));
        assertNull(compiler.getSourceRegion("test.js", 0));

        // Non-existent source name should return null
        assertNull(compiler.getSourceLine("nonexistent.js", 1));
        assertNull(compiler.getSourceRegion("nonexistent.js", 1));

        // Valid retrieval
        assertNotNull(compiler.getSourceLine("test.js", 1));
        assertNotNull(compiler.getSourceRegion("test.js", 1));
    }

    @Test
    public void testGetNodeForCodeInsertionEdges() {
        // 1. module == null and inputs is empty -> IllegalStateException
        try {
            compiler.getNodeForCodeInsertion(null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("No inputs", e.getMessage());
        }

        // Initialize with valid input
        List<JSSourceFile> inputs = new ArrayList<JSSourceFile>();
        inputs.add(JSSourceFile.fromCode("input1.js", "var a = 1;"));
        compiler.init(new ArrayList<JSSourceFile>(), inputs, options);

        // 2. module == null and inputs not empty -> returns inputs.get(0).getAstRoot(this)
        assertNotNull(compiler.getNodeForCodeInsertion(null));

        // 3. module with inputs -> returns moduleInputs.get(0).getAstRoot(this)
        JSModule mod = new JSModule("mod1");
        mod.add(JSSourceFile.fromCode("modInput.js", "var b = 2;"));
        assertNotNull(compiler.getNodeForCodeInsertion(mod));

        // 4. module with empty inputs -> IllegalStateException
        JSModule emptyMod = new JSModule("emptyMod");
        try {
            compiler.getNodeForCodeInsertion(emptyMod);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Root module has no inputs", e.getMessage());
        }
    }

    @Test
    public void testDisableThreadsAndCompilationFlow() {
        compiler.disableThreads();
        
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var window;");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function test() { return 1; }");
        
        Result result = compiler.compile(extern, input, options);
        assertNotNull(result);
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testSetAndGetIntermediateState() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var window;");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(extern, input, options);

        Compiler.IntermediateState state = compiler.getState();
        assertNotNull(state);

        Compiler newCompiler = new Compiler();
        newCompiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        newCompiler.setState(state);
        
        assertNotNull(newCompiler.getRoot());
    }

    @Test
    public void testPassConfigAndTypeRegistryAndScope() {
        assertNotNull(compiler.getPassConfig());
        assertNotNull(compiler.getTypeRegistry());
        assertNotNull(compiler.getReverseAbstractInterpreter());
        assertNotNull(compiler.getTypeValidator());
        assertNotNull(compiler.getParserConfig());
        assertNotNull(compiler.getDefaultErrorReporter());
        
        compiler.setNormalized();
        assertTrue(compiler.isNormalized());
        compiler.setUnnormalized();
        assertFalse(compiler.isNormalized());

        compiler.setCssRenamingMap(null);
        assertNull(compiler.getCssRenamingMap());
    }
}