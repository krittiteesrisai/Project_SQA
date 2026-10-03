package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class CompilerTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void testSetProgressBoundaryConditions() {
        // Test normal range
        compiler.setProgress(0.5);
        assertEquals(0.5, compiler.getProgress(), 0.001);

        // Test upper bound ( > 1.0 )
        compiler.setProgress(1.5);
        assertEquals(1.0, compiler.getProgress(), 0.001);

        // Test lower bound ( < 0.0 )
        compiler.setProgress(-0.5);
        assertEquals(0.0, compiler.getProgress(), 0.001);
    }

    @Test
    public void testInitOptionsWithOutStreamAndCheckTypes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Compiler compilerWithStream = new Compiler(new PrintStream(out));
        CompilerOptions options = new CompilerOptions();
        
        // Trigger DiagnosticGroups.CHECK_TYPES enabled branch
        options.setEnables(DiagnosticGroups.CHECK_TYPES, true);
        options.checkGlobalThisLevel = CheckLevel.WARNING;
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT);

        compilerWithStream.initOptions(options);
        assertTrue(options.checkTypes);
    }

    @Test
    public void testInitOptionsCheckTypesDisabled() {
        CompilerOptions options = new CompilerOptions();
        options.setDisables(DiagnosticGroups.CHECK_TYPES, true);
        compiler.initOptions(options);
        assertFalse(options.checkTypes);
    }

    @Test
    public void testCheckFirstModuleEmptyList() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        
        List<JSModule> emptyModules = new ArrayList<JSModule>();
        // Trigger modules.isEmpty() branch
        compiler.initModules(new ArrayList<SourceFile>(), emptyModules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testCheckFirstModuleEmptyRootWithMultipleModules() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);

        List<JSModule> modules = new ArrayList<JSModule>();
        modules.add(new JSModule("m1")); // Empty inputs
        modules.add(new JSModule("m2"));

        // Trigger modules.get(0).getInputs().isEmpty() && modules.size() > 1 branch
        compiler.initModules(new ArrayList<SourceFile>(), modules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testLoggingLevelConfiguration() {
        // Cover static logging setup
        Compiler.setLoggingLevel(Level.FINEST);
        // No exception expected
    }

    @Test
    public void testEnsureLibraryInjectedBaseAndCustom() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        
        // Initialize basic structure so node insertion works
        SourceFile externFile = SourceFile.fromCode("extern.js", "");
        SourceFile inputFile = SourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new SourceFile[]{externFile}, new SourceFile[]{inputFile}, options);
        compiler.parseInputs();

        // Inject custom library (which triggers 'base' dependency injection branch)
        compiler.ensureLibraryInjected("datasource");
        
        // Inject again to test cache/contains branch (already injected)
        compiler.ensureLibraryInjected("datasource");
    }

    @Test(expected = IllegalStateException.class)
    public void testSetPassConfigTwiceThrowsException() {
        PassConfig passConfig1 = new DefaultPassConfig(new CompilerOptions());
        PassConfig passConfig2 = new DefaultPassConfig(new CompilerOptions());
        
        compiler.setPassConfig(passConfig1);
        // Should throw IllegalStateException because passes is already assigned
        compiler.setPassConfig(passConfig2);
    }

    @Test
    public void testGetSourceLineAndRegionEdgeCases() {
        // Test invalid line number (< 1)
        assertNull(compiler.getSourceLine("nonexistent.js", 0));
        assertNull(compiler.getSourceRegion("nonexistent.js", -1));

        // Test non-existent file name
        assertNull(compiler.getSourceLine("unknown.js", 5));
        assertNull(compiler.getSourceRegion("unknown.js", 5));
    }
}