package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;

/**
 * High-coverage JUnit 4 test suite for com.google.javascript.jscomp.Compiler (Closure-59b).
 * Focuses on branches, edge cases, null handling, and error states.
 */
public class CompilerTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    // --- Tests for setErrorManager & Constructor Overloads ---

    @Test(expected = NullPointerException.class)
    public void testSetErrorManagerWithNull() {
        compiler.setErrorManager(null);
    }

    @Test
    public void testCustomErrorManagerInitialization() {
        ErrorManager customManager = new LoggerErrorManager(
            new MessageFormatter() {
                @Override public String formatError(JSError error) { return ""; }
                @Override public String formatWarning(JSError error) { return ""; }
            }, 
            java.util.logging.Logger.getLogger("test")
        );
        Compiler c = new Compiler(customManager);
        assertNotNull(c.getErrorManager());
    }

    @Test
    public void testPrintStreamConstructorAndOptions() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Compiler c = new Compiler(new PrintStream(out));
        CompilerOptions options = new CompilerOptions();
        options.summaryDetailLevel = 1;
        c.initOptions(options);
        assertNotNull(c.getErrorManager());
    }

    // --- Tests for initOptions & Diagnostic Groups Branches ---

    @Test
    public void testInitOptionsCheckTypesEnabled() {
        CompilerOptions options = new CompilerOptions();
        options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
        options.enables(DiagnosticGroups.CHECK_TYPES);
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testInitOptionsCheckTypesDisabled() {
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        options.disables(DiagnosticGroups.CHECK_TYPES);
        compiler.initOptions(options);
        assertFalse(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testInitOptionsGlobalThisAndEs5Strict() {
        CompilerOptions options = new CompilerOptions();
        options.checkGlobalThisLevel = CheckLevel.WARNING;
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT);
        compiler.initOptions(options);
        assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT, options.getLanguageIn());
    }

    @Test
    public void testInitOptionsCheckSymbolsAndSymbolsGuard() {
        CompilerOptions options = new CompilerOptions();
        options.checkSymbols = false;
        compiler.initOptions(options);
        // Triggers the composedGuards branch for check symbols
        assertNotNull(compiler.getErrorManager());
    }

    // --- Tests for Module Validation (checkFirstModule & fillEmptyModules) ---

    @Test
    public void testCheckFirstModuleEmptyList() {
        List<JSModule> emptyModules = Collections.emptyList();
        CompilerOptions options = new CompilerOptions();
        compiler.initModules(Collections.<JSSourceFile>emptyList(), emptyModules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testCheckFirstModuleEmptyRootWithMultipleModules() {
        JSModule rootModule = new JSModule("root");
        JSModule childModule = new JSModule("child");
        childModule.add(JSSourceFile.fromCode("child.js", "var x = 1;"));

        List<JSModule> modules = Lists.newArrayList(rootModule, childModule);
        CompilerOptions options = new CompilerOptions();
        
        compiler.initModules(Collections.<JSSourceFile>emptyList(), modules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testFillEmptyModulesAndSingleValidModule() {
        JSModule emptyRoot = new JSModule("root");
        List<JSModule> modules = Lists.newArrayList(emptyRoot);
        CompilerOptions options = new CompilerOptions();
        
        // Single empty module should be filled automatically without throwing definition/module errors
        compiler.initModules(Collections.<JSSourceFile>emptyList(), modules, options);
        assertFalse(compiler.hasErrors());
    }

    // --- Tests for Duplicate Input Handling ---

    @Test
    public void testDuplicateExternInput() {
        JSSourceFile externFile1 = JSSourceFile.fromCode("ext.js", "var window;");
        JSSourceFile externFile2 = JSSourceFile.fromCode("ext.js", "var document;");
        JSSourceFile inputFile = JSSourceFile.fromCode("app.js", "var a = 1;");

        CompilerOptions options = new CompilerOptions();
        compiler.init(Lists.newArrayList(externFile1, externFile2), Lists.newArrayList(inputFile), options);
        
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testDuplicateSourceInput() {
        JSSourceFile externFile = JSSourceFile.fromCode("ext.js", "var window;");
        JSSourceFile inputFile1 = JSSourceFile.fromCode("app.js", "var a = 1;");
        JSSourceFile inputFile2 = JSSourceFile.fromCode("app.js", "var b = 2;");

        CompilerOptions options = new CompilerOptions();
        compiler.init(Lists.newArrayList(externFile), Lists.newArrayList(inputFile1, inputFile2), options);
        
        assertTrue(compiler.hasErrors());
    }

    // --- Tests for Source Line and Region Edge Cases ---

    @Test
    public void testGetSourceLineAndRegionInvalidLineNumber() {
        assertNull(compiler.getSourceLine("nonexistent.js", 0));
        assertNull(compiler.getSourceLine("nonexistent.js", -5));
        assertNull(compiler.getSourceRegion("nonexistent.js", 0));
        assertNull(compiler.getSourceRegion("nonexistent.js", -1));
    }

    @Test
    public void testGetSourceLineValidAndMissingFile() {
        // File not in inputsByName
        assertNull(compiler.getSourceLine("missing.js", 1));

        // Add input and test valid retrieval
        JSourceFile file = JSSourceFile.fromCode("test.js", "line1\nline2");
        CompilerOptions options = new CompilerOptions();
        compiler.init(Collections.<JSSourceFile>emptyList(), Lists.newArrayList(file), options);

        assertEquals("line1", compiler.getSourceLine("test.js", 1));
        assertEquals("line2", compiler.getSourceLine("test.js", 2));
        assertNotNull(compiler.getSourceRegion("test.js", 1));
    }

    // --- Tests for PassConfig & State Management ---

    @Test
    public void testPassConfigAssignmentTwiceThrowsException() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        PassConfig passConfig1 = new DefaultPassConfig(options);
        PassConfig passConfig2 = new DefaultPassConfig(options);

        compiler.setPassConfig(passConfig1);
        try {
            compiler.setPassConfig(passConfig2);
            fail("Expected IllegalStateException due to re-assigning passes");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test(expected = NullPointerException.class)
    public void testSetPassConfigNull() {
        compiler.setPassConfig(null);
    }
}