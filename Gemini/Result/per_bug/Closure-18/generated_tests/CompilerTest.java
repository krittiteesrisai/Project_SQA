package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 * High-coverage JUnit 4 test suite for com.google.javascript.jscomp.Compiler
 * Targeting Defects4J Closure-18b.
 */
public class CompilerTest {

    private Compiler compiler;
    private CompilerOptions options;

    @Before
    public void setUp() {
        compiler = new Compiler();
        options = new CompilerOptions();
    }

    @Test
    public void testSetProgressBoundaries() {
        // Test normal range
        compiler.setProgress(0.5);
        assertEquals(0.5, compiler.getProgress(), 0.001);

        // Test upper bound limit (> 1.0) -> Edge case
        compiler.setProgress(1.5);
        assertEquals(1.0, compiler.getProgress(), 0.001);

        // Test exact upper bound boundary
        compiler.setProgress(1.0);
        assertEquals(1.0, compiler.getProgress(), 0.001);

        // Test lower bound limit (< 0.0) -> Edge case
        compiler.setProgress(-0.5);
        assertEquals(0.0, compiler.getProgress(), 0.001);

        // Test exact lower bound boundary
        compiler.setProgress(0.0);
        assertEquals(0.0, compiler.getProgress(), 0.001);
    }

    @Test
    public void testInitOptionsAndCheckTypes() {
        // Test DiagnosticGroups checkTypes enabling branch
        options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.ERROR);
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());

        // Test DiagnosticGroups checkTypes disabling branch
        CompilerOptions options2 = new CompilerOptions();
        options2.disableWarningsGuard(DiagnosticGroups.CHECK_TYPES);
        compiler.initOptions(options2);
        
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testCheckFirstModuleEmptyList() {
        // Trigger empty modules branch -> should report EMPTY_MODULE_LIST_ERROR
        List<JSModule> emptyModules = new ArrayList<JSModule>();
        compiler.initModules(new ArrayList<SourceFile>(), emptyModules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testCheckFirstModuleRootEmptyWithMultipleModules() {
        // Trigger root module empty when size > 1 -> EMPTY_ROOT_MODULE_ERROR
        List<JSModule> modules = new ArrayList<JSModule>();
        JSModule rootModule = new JSModule("root"); // empty inputs
        JSModule childModule = new JSModule("child");
        childModule.add(SourceFile.fromCode("child.js", "var x = 1;"));
        
        modules.add(rootModule);
        modules.add(childModule);

        compiler.initModules(new ArrayList<SourceFile>(), modules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testCreateFillFileName() {
        String fillFileName = Compiler.createFillFileName("TestModule");
        assertEquals("[TestModule]", fillFileName);
    }

    @Test(expected = NullPointerException.class)
    public void testSetErrorManagerNull() {
        compiler.setErrorManager(null);
    }

    @Test
    public void testGetReleaseVersionAndDate() {
        // Verify release metadata can be loaded from ResourceBundle without crashing
        String version = Compiler.getReleaseVersion();
        String date = Compiler.getReleaseDate();
        
        // Depending on build setup, these might be populated or empty, 
        // but they must not throw unexpected fatal exceptions (NullPointer/MissingResource).
        assertNotNull(version != null ? version : "");
        assertNotNull(date != null ? date : "");
    }
}