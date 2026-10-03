package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.Collections;
import java.util.List;

/**
 * High-coverage JUnit 4 test suite for com.google.javascript.jscomp.Compiler
 * Targeting Defects4J Closure-64b with deep branch coverage and edge cases.
 */
public class CompilerTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void testConstructorWithStream() {
        Compiler c = new Compiler((PrintStream) null);
        assertNotNull(c);
    }

    @Test
    public void testConstructorWithErrorManager() {
        ErrorManager em = new LoggerErrorManager(
            new BasicErrorFormatter(SourceExcerptProvider.SourceExcerpt.LINE), 
            java.util.logging.Logger.getLogger("test")
        );
        Compiler c = new Compiler(em);
        assertNotNull(c);
        assertEquals(em, c.getErrorManager());
    }

    @Test(expected = NullPointerException.class)
    public void testSetErrorManagerNull() {
        compiler.setErrorManager(null);
    }

    @Test
    public void testInitOptionsDiagnosticGroupBranches() {
        CompilerOptions options = new CompilerOptions();
        
        // Branch: checkTypes enabled via DiagnosticGroups
        options.setWarningLevel(DiagnosticGroup.forType(DiagnosticGroups.CHECK_TYPES), CheckLevel.ERROR);
        compiler.initOptions(options);
        assertTrue(options.checkTypes);

        // Branch: checkTypes disabled via DiagnosticGroups
        options.disableWarningsGuard(DiagnosticGroup.forType(DiagnosticGroups.CHECK_TYPES));
        compiler.initOptions(options);

        // Branch: checkGlobalThisLevel is ON
        options.checkGlobalThisLevel = CheckLevel.WARNING;
        compiler.initOptions(options);
    }

    @Test
    public void testCheckFirstModuleEmptyList() {
        compiler.initModules(
            Collections.<JSSourceFile>emptyList(),
            Collections.<JSModule>emptyList(),
            new CompilerOptions()
        );
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testCheckFirstModuleEmptyRootWithMultipleModules() {
        JSModule rootModule = new JSModule("root");
        JSModule childModule = new JSModule("child");
        childModule.add(JSSourceFile.fromCode("child.js", "var x = 1;"));

        List<JSModule> modules = java.util.Arrays.asList(rootModule, childModule);
        
        compiler.initModules(
            Collections.<JSSourceFile>emptyList(),
            modules,
            new CompilerOptions()
        );
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testGetSourceLineEdgeCases() {
        // Line number < 1 boundary limit
        assertNull(compiler.getSourceLine("nonexistent.js", 0));
        assertNull(compiler.getSourceLine("nonexistent.js", -1));

        // Line number >= 1 but file not found in inputsByName
        assertNull(compiler.getSourceLine("missing.js", 5));
    }

    @Test
    public void testGetSourceRegionEdgeCases() {
        // Line number < 1 boundary limit
        assertNull(compiler.getSourceRegion("nonexistent.js", 0));
        assertNull(compiler.getSourceRegion("nonexistent.js", -5));

        // File not found
        assertNull(compiler.getSourceRegion("missing.js", 10));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNodeForCodeInsertionNoInputs() {
        // module == null and inputs is empty -> throws IllegalStateException
        compiler.getNodeForCodeInsertion(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNodeForCodeInsertionEmptyModuleInputs() {
        JSModule emptyModule = new JSModule("empty");
        compiler.getNodeForCodeInsertion(emptyModule);
    }

    @Test(expected = NullPointerException.class)
    public void testSetPassConfigNull() {
        compiler.setPassConfig(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testSetPassConfigAlreadyAssigned() {
        PassConfig config1 = new DefaultPassConfig(new CompilerOptions());
        PassConfig config2 = new DefaultPassConfig(new CompilerOptions());
        
        compiler.setPassConfig(config1);
        compiler.setPassConfig(config2); // Should throw IllegalStateException
    }

    @Test
    public void testNewExternInputConflict() {
        compiler.initOptions(new CompilerOptions());
        compiler.newExternInput("shared.js");
        
        try {
            compiler.newExternInput("shared.js");
            fail("Expected IllegalArgumentException for duplicate externs name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Conflicting externs name"));
        }
    }

    @Test
    public void testRemoveInputNonexistent() {
        // Should return silently without throwing exception
        compiler.removeInput("ghost.js");
    }

    @Test
    public void testCompileSimpleFlow() {
        JSSourceFile extern = JSSourceFile.fromCode("externs.js", "var window;");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function foo() { return 1; }");
        CompilerOptions options = new CompilerOptions();
        
        Result result = compiler.compile(extern, input, options);
        assertNotNull(result);
    }
}