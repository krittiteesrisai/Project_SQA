package com.google.javascript.jscomp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Senior Java Test Automation Engineer - JUnit 4 Test Suite
 * Target: CommandLineRunner (Closure-151b)
 */
public class CommandLineRunnerTest {

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setErr(new PrintStream(errContent));
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setErr(originalErr);
        System.setOut(originalOut);
    }

    @Test
    public void testValidConfigurationAndStandardFlags() {
        String[] args = new String[] {
            "--js=test1.js",
            "--js_output_file=output.js",
            "--warning_level=VERBOSE",
            "--compilation_level=SIMPLE_OPTIMIZATIONS"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Configuration should be valid for standard options", runner.shouldRunCompiler());
    }

    @Test
    public void testArgumentParsingWithQuotes() {
        // Trigger quotesPattern matching branch: --flag="value"
        String[] args = new String[] {
            "--js_output_file=\"quoted_output.js\""
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testHelpFlagTriggersInvalidConfig() {
        String[] args = new String[] {
            "--help"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Help flag should invalidate runner execution and print usage", runner.shouldRunCompiler());
        assertTrue("Usage instructions should be printed to err stream", errContent.toString().contains("Usage"));
    }

    @Test
    public void testInvalidCommandLineFlagException() {
        String[] args = new String[] {
            "--non_existent_flag_xyz=true"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Unknown flag should cause config validation to fail", runner.shouldRunCompiler());
    }

    @Test
    public void testThirdPartyCodingConventionFlag() {
        String[] args = new String[] {
            "--third_party=true"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testFormattingOptionsExecution() {
        String[] args = new String[] {
            "--formatting=PRETTY_PRINT",
            "--formatting=PRINT_INPUT_DELIMITER",
            "--debug=true",
            "--process_closure_primitives=false"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testBooleanOptionHandlerValidValues() {
        // Test various valid boolean flags for BooleanOptionHandler (true, on, yes, 1, false, off, no, 0)
        String[] args = new String[] {
            "--print_tree=yes",
            "--print_ast=1",
            "--compute_phase_ordering=off",
            "--use_only_custom_externs=false"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("BooleanOptionHandler should parse standard truthy/falsy values correctly", runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanOptionHandlerInvalidValue() {
        // Triggers CmdLineException in BooleanOptionHandler due to invalid param
        String[] args = new String[] {
            "--print_tree=invalid_boolean_string"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Invalid boolean option value must trigger parse exception and invalidate config", runner.shouldRunCompiler());
        assertTrue(errContent.toString().contains("Illegal boolean value"));
    }

    @Test
    public void testCreateExternsWithCustomOnly() throws Exception {
        String[] args = new String[] {
            "--use_only_custom_externs=true",
            "--externs=custom_extern.js"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
        
        List<JSSourceFile> externs = runner.createExterns();
        assertNotNull(externs);
        // When use_only_custom_externs is true, it bypasses appending default externs zip
        assertEquals(1, externs.size());
        assertEquals("custom_extern.js", externs.getName());
    }

    @Test
    public void testCreateCompilerInstance() {
        String[] args = new String[] {};
        CommandLineRunner runner = new CommandLineRunner(args);
        Compiler compiler = runner.createCompiler();
        assertNotNull("Compiler instance must not be null", compiler);
    }

    @Test
    public void testDefineAndModuleFlagsEdgeCases() {
        String[] args = new String[] {
            "--define=goog.DEBUG=true",
            "--module=m1:1",
            "--module_wrapper=m1:%s"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Advanced flags like define and module should parse successfully", runner.shouldRunCompiler());
    }
}