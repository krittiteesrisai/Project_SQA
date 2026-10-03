package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;

public class CompilerTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    // --- 1. setErrorManager Edge Cases & Branch Coverage ---
    
    @Test(expected = NullPointerException.class)
    public void testSetErrorManagerNull() {
        compiler.setErrorManager(null);
    }

    @Test
    public void testSetErrorManagerValid() {
        ErrorManager customManager = new LoggerErrorManager(
            new MessageFormatter() {
                public String formatError(JSError error) { return ""; }
                public String formatWarning(JSError error) { return ""; }
            }, 
            java.util.logging.Logger.getAnonymousLogger()
        );
        compiler.setErrorManager(customManager);
        assertEquals(customManager, compiler.getErrorManager());
    }

    // --- 2. initOptions Branch Coverage (outStream == null vs not null) ---

    @Test
    public void testInitOptionsWithNullOutStream() {
        Compiler c = new Compiler((PrintStream) null);
        CompilerOptions options = new CompilerOptions();
        c.initOptions(options);
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testInitOptionsWithValidOutStream() {
        Compiler c = new Compiler(System.out);
        CompilerOptions options = new CompilerOptions();
        options.summaryDetailLevel = 1;
        c.initOptions(options);
        assertNotNull(c.getErrorManager());
    }

    // --- 3. checkFirstModule & Module Validation Edge Cases ---

    @Test
    public void testInitModulesEmptyList() {
        CompilerOptions options = new CompilerOptions();
        JSModule[] emptyModules = new JSModule[0];
        
        compiler.init(new JSSourceFile[0], emptyModules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testInitModulesEmptyRootModuleInput() {
        CompilerOptions options = new CompilerOptions();
        JSModule rootModule = new JSModule("root");
        // Root module has no inputs added
        JSModule[] modules = new JSModule[] { rootModule };
        
        compiler.init(new JSSourceFile[0], modules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testDuplicateInputsInModules() {
        CompilerOptions options = new CompilerOptions();
        JSModule m1 = new JSModule("m1");
        JSModule m2 = new JSModule("m2");
        
        JSSourceFile sf = JSSourceFile.fromCode("shared.js", "var x = 1;");
        CompilerInput input = new CompilerInput(sf);
        
        m1.add(input);
        m2.add(input);
        
        JSModule[] modules = new JSModule[] { m1, m2 };
        compiler.init(new JSSourceFile[0], modules, options);
        assertTrue(compiler.hasErrors());
    }

    // --- 4. getNodeForCodeInsertion Edge Cases ---

    @Test(expected = IllegalStateException.class)
    public void testGetNodeForCodeInsertionNullModuleNoInputs() {
        // inputs array is empty, module is null -> throws IllegalStateException
        compiler.getNodeForCodeInsertion(null);
    }

    @Test
    public void testGetNodeForCodeInsertionNullModuleWithInputs() {
        CompilerOptions options = new CompilerOptions();
        JSSourceFile[] externs = new JSSourceFile[0];
        JSSourceFile[] inputs = new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a;") };
        
        compiler.init(externs, inputs, options);
        Node node = compiler.getNodeForCodeInsertion(null);
        assertNotNull(node);
    }

    @Test
    public void testGetNodeForCodeInsertionWithValidModule() {
        CompilerOptions options = new CompilerOptions();
        JSModule module = new JSModule("m1");
        JSSourceFile sf = JSSourceFile.fromCode("m1.js", "var y;");
        module.add(new CompilerInput(sf));
        
        JSModule[] modules = new JSModule[] { module };
        compiler.init(new JSSourceFile[0], modules, options);
        
        Node node = compiler.getNodeForCodeInsertion(module);
        assertNotNull(node);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNodeForCodeInsertionRootModuleHasNoInputs() {
        JSModule module = new JSModule("m1");
        JSModule dep = new JSModule("dep"); // Empty inputs
        module.addDependency(dep);
        
        JSModule[] modules = new JSModule[] { module, dep };
        CompilerOptions options = new CompilerOptions();
        compiler.init(new JSSourceFile[0], modules, options);
        
        compiler.getNodeForCodeInsertion(module);
    }

    // --- 5. Source Line and Region Boundary Limits ---

    @Test
    public void testGetSourceLineBoundaryAndMissing() {
        // Line number < 1 should return null immediately
        assertNull(compiler.getSourceLine("test.js", 0));
        assertNull(compiler.getSourceLine("test.js", -5));

        // Line number >= 1 but file not found in inputsByName
        assertNull(compiler.getSourceLine("nonexistent.js", 5));
    }

    @Test
    public void testGetSourceRegionBoundaryAndMissing() {
        // Line number < 1 should return null immediately
        assertNull(compiler.getSourceRegion("test.js", 0));
        assertNull(compiler.getSourceRegion("test.js", -1));

        // File not found
        assertNull(compiler.getSourceRegion("nonexistent.js", 3));
    }

    // --- 6. Duplicate Externs / Inputs Management ---

    @Test
    public void testDuplicateExternInput() {
        CompilerOptions options = new CompilerOptions();
        JSSourceFile[] externs = new JSSourceFile[] {
            JSSourceFile.fromCode("ext.js", "var window;"),
            JSSourceFile.fromCode("ext.js", "var document;")
        };
        compiler.init(externs, new JSSourceFile[0], options);
        assertTrue(compiler.hasErrors());
    }
}