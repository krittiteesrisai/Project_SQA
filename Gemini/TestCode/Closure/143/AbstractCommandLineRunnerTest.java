package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Senior Java Test Automation Engineer - Comprehensive JUnit 4 Test Suite
 * Target: AbstractCommandLineRunner (Closure-143b)
 */
public class AbstractCommandLineRunnerTest {

    private CompilerOptions options;
    private ByteArrayOutputStream errContent;
    private PrintStream originalErr;

    // Concrete subclass for testing protected/abstract methods
    private static class TestCommandLineRunner extends AbstractCommandLineRunner<Compiler, CompilerOptions> {
        @Override
        protected Compiler createCompiler() {
            return new Compiler();
        }

        @Override
        protected CompilerOptions createOptions() {
            return new CompilerOptions();
        }
    }

    @Before
    public void setUp() {
        options = new CompilerOptions();
        errContent = new ByteArrayOutputStream();
        originalErr = System.err;
        System.setErr(new PrintStream(errContent));
    }

    @org.junit.After
    public void tearDown() {
        System.setErr(originalErr);
    }

    // ==========================================
    // Tests for createDefineReplacements
    // ==========================================

    @Test
    public void testDefineReplacementBooleanImplicit() {
        List<String> defs = Arrays.asList("MY_FLAG");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
        // Verified via successful execution without exception
    }

    @Test
    public void testDefineReplacementBooleanExplicitTrue() {
        List<String> defs = Arrays.asList("MY_FLAG=true");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testDefineReplacementBooleanExplicitFalse() {
        List<String> defs = Arrays.asList("MY_FLAG=false");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testDefineReplacementStringValid() {
        List<String> defs = Arrays.asList("MY_FLAG='hello'");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test(expected = RuntimeException.class)
    public void testDefineReplacementStringInvalidSingleQuoteInside() {
        // Single quote inside without proper handling should throw exception or fail parsing
        List<String> defs = Arrays.asList("MY_FLAG='hell'o'");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testDefineReplacementDoubleNumeric() {
        List<String> defs = Arrays.asList("MY_FLAG=123.45");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test(expected = RuntimeException.class)
    public void testDefineReplacementEmptyName() {
        List<String> defs = Arrays.asList("=123");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test(expected = RuntimeException.class)
    public void testDefineReplacementInvalidSyntax() {
        List<String> defs = Arrays.asList("INVALID_SYNTAX_NOT_A_NUMBER_OR_VALID_LITERAL=abc_xyz_not_valid");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    // ==========================================
    // Tests for writeOutput
    // ==========================================

    @Test
    public void testWriteOutputWithPlaceholderMiddle() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        Compiler compiler = new Compiler();
        
        AbstractCommandLineRunner.writeOutput(ps, compiler, "codeContent", "PREFIX:%s:SUFFIX", "%s");
        String result = outContent.toString();
        assertTrue(result.contains("PREFIX:codeContent:SUFFIX"));
    }

    @Test
    public void testWriteOutputWithPlaceholderAtStart() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        
        AbstractCommandLineRunner.writeOutput(ps, null, "codeContent", "%s:SUFFIX", "%s");
        String result = outContent.toString();
        assertTrue(result.contains("codeContent:SUFFIX"));
    }

    @Test
    public void testWriteOutputWithoutPlaceholder() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        
        AbstractCommandLineRunner.writeOutput(ps, null, "codeContent", "NO_PLACEHOLDER_WRAPPER", "%s");
        String result = outContent.toString();
        assertTrue(result.contains("codeContent"));
    }

    // ==========================================
    // Tests for parseModuleWrappers
    // ==========================================

    @Test
    public void testParseModuleWrappersValid() throws Exception {
        JSModule module = new JSModule("moduleA");
        JSModule[] modules = new JSModule[] { module };
        List<String> specs = Arrays.asList("moduleA:PREFIX:%s:SUFFIX");

        Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
        assertEquals("PREFIX:%s:SUFFIX", wrappers.get("moduleA"));
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappersMissingColon() throws Exception {
        JSModule module = new JSModule("moduleA");
        JSModule[] modules = new JSModule[] { module };
        List<String> specs = Arrays.asList("moduleA_invalid_spec");

        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappersUnknownModule() throws Exception {
        JSModule module = new JSModule("moduleA");
        JSModule[] modules = new JSModule[] { module };
        List<String> specs = Arrays.asList("unknownModule:%s");

        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappersMissingPlaceholder() throws Exception {
        JSModule module = new JSModule("moduleA");
        JSModule[] modules = new JSModule[] { module };
        List<String> specs = Arrays.asList("moduleA:NoPlaceholderHere");

        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }
}