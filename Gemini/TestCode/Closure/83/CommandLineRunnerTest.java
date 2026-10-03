package com.google.javascript.jscomp;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;

public class CommandLineRunnerTest {

    @Test
    public void testValidConfigurationWithBasicFlags() {
        String[] args = new String[] {
            "--js=test.js",
            "--compilation_level=WHITESPACE_ONLY",
            "--warning_level=QUIET"
        };
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(err));

        assertTrue("Configuration should be valid for standard options", runner.shouldRunCompiler());
        assertEquals("", err.toString());
    }

    @Test
    public void testArgumentParsingWithQuotes() {
        // ทดสอบการจับคู่ QuotesPattern สำหรับ argument ที่มีเครื่องหมายคำพูดครอบ
        String[] args = new String[] {
            "--js_output_file=\"output.js\""
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Runner should successfully parse quoted arguments", runner.shouldRunCompiler());
    }

    @Test
    public void testHelpFlagTriggersInvalidConfig() {
        String[] args = new String[] { "--help" };
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(err));

        assertFalse("Config should be invalid when --help is passed", runner.shouldRunCompiler());
        assertFalse("Usage info should be printed", err.toString().isEmpty());
    }

    @Test
    public void testVersionFlagExecution() {
        String[] args = new String[] { "--version" };
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(err));

        assertFalse("Config should be invalid when --version is passed", runner.shouldRunCompiler());
        assertTrue("Version info should contain Closure Compiler", err.toString().contains("Closure Compiler"));
    }

    @Test
    public void testInvalidCommandLineException() {
        String[] args = new String[] { "--non_existent_flag_xyz" };
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(err));

        assertFalse("Config should be invalid on unknown flags", runner.shouldRunCompiler());
        assertTrue("Error message should be printed for invalid flags", err.toString().contains("is not a recognized option"));
    }

    @Test
    public void testBooleanOptionHandlerEdgeCases() {
        // ทดสอบค่า True variants (true, on, yes, 1) และ False variants (false, off, no, 0)
        // รวมถึงกรณีค่าผิดแปลกที่ BooleanOptionHandler ต้องจัดการ (Edge case ของ Closure-83)
        String[] argsTrue = new String[] { "--process_closure_primitives=on", "--debug=1" };
        CommandLineRunner runnerTrue = new CommandLineRunner(argsTrue);
        assertTrue("Should handle 'on' and '1' as true", runnerTrue.shouldRunCompiler());

        String[] argsFalse = new String[] { "--process_closure_primitives=off", "--debug=0" };
        CommandLineRunner runnerFalse = new CommandLineRunner(argsFalse);
        assertTrue("Should handle 'off' and '0' as false", runnerFalse.shouldRunCompiler());

        // Edge case: ค่าที่ไม่ใช่ทั้ง True/False ชัดเจน (เช่น --process_closure_primitives=invalid)
        String[] argsInvalidBoolean = new String[] { "--process_closure_primitives=invalid" };
        CommandLineRunner runnerEdge = new CommandLineRunner(argsInvalidBoolean);
        assertTrue("BooleanOptionHandler fallback should handle unrecognized params gracefully", runnerEdge.shouldRunCompiler());
    }

    @Test
    public void testCreateOptionsAndCompiler() {
        String[] args = new String[] { "--js=test.js", "--debug=true" };
        CommandLineRunner runner = new CommandLineRunner(args);

        CompilerOptions options = runner.createOptions();
        assertNotNull("CompilerOptions should be created", options);

        Compiler compiler = runner.createCompiler();
        assertNotNull("Compiler instance should be created", compiler);
    }

    @Test
    public void testGetDefaultExterns() {
        try {
            List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
            assertNotNull("Default externs should not be null", externs);
            assertFalse("Default externs list should contain items", externs.isEmpty());
        } catch (Exception e) {
            fail("getDefaultExterns should not throw an exception: " + e.getMessage());
        }
    }
}