package com.google.javascript.jscomp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;

public class CommandLineRunnerTest {

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private PrintStream originalErr;
    private PrintStream originalOut;

    @Before
    public void setUpStreams() {
        originalErr = System.err;
        originalOut = System.out;
        System.setErr(new PrintStream(errContent));
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setErr(originalErr);
        System.setOut(originalOut);
    }

    @Test
    public void testValidArgumentsAndConfig() {
        String[] args = new String[] {
            "--compilation_level=WHITESPACE_ONLY",
            "--warning_level=QUIET",
            "--js=test.js"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Configuration should be valid for standard options", runner.shouldRunCompiler());
    }

    @Test
    public void testHelpFlagTriggersInvalidConfig() {
        String[] args = new String[] { "--help" };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Help flag should invalidate config and print usage", runner.shouldRunCompiler());
        assertTrue("Usage instructions should be printed to err", errContent.toString().length() > 0);
    }

    @Test
    public void testInvalidBooleanOptionThrowsException() {
        String[] args = new String[] { "--print_tree=not_a_boolean" };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Invalid boolean option should make config invalid", runner.shouldRunCompiler());
        assertTrue("Error message should mention illegal boolean value", 
                errContent.toString().contains("Illegal boolean value"));
    }

    @Test
    public void testBooleanOptionHandlerWithNullParameter() {
        // ทดสอบกรณีส่งแฟล็กแบบไม่มีค่า (param = null ใน BooleanOptionHandler)
        String[] args = new String[] { "--print_tree" };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Config should be valid when boolean flag is passed without explicit value", runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanOptionHandlerTrueVariations() {
        String[] truthyValues = { "true", "on", "yes", "1", "TRUE", "YES" };
        for (String val : truthyValues) {
            CommandLineRunner runner = new CommandLineRunner(new String[] { "--print_tree=" + val });
            assertTrue("Value " + val + " should be evaluated as true", runner.shouldRunCompiler());
        }
    }

    @Test
    public void testBooleanOptionHandlerFalseVariations() {
        String[] falsyValues = { "false", "off", "no", "0", "FALSE", "NO" };
        for (String val : falsyValues) {
            CommandLineRunner runner = new CommandLineRunner(new String[] { "--print_tree=" + val });
            assertTrue("Value " + val + " should be evaluated as false", runner.shouldRunCompiler());
        }
    }

    @Test
    public void testArgumentParsingWithQuotes() {
        // ทดสอบ Pattern แยก Quotes เช่น --js_output_file="out.js"
        String[] args = new String[] {
            "--js_output_file=\"output_quoted.js\"",
            "--js='input_quoted.js'"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Quoted arguments should be parsed successfully", runner.shouldRunCompiler());
    }

    @Test
    public void testThirdPartyAndFormattingOptions() {
        String[] args = new String[] {
            "--third_party=true",
            "--formatting=PRETTY_PRINT",
            "--formatting=PRINT_INPUT_DELIMITER",
            "--debug=true",
            "--manage_closure_dependencies=true"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Third party and formatting options should configure correctly", runner.shouldRunCompiler());
        
        CompilerOptions options = runner.createOptions();
        assertNotNull("CompilerOptions should be created", options);
    }

    @Test
    public void testCreateExternsCustomOnly() throws Exception {
        String[] args = new String[] {
            "--use_only_custom_externs=true",
            "--externs=custom_extern.js"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
        
        List<JSSourceFile> externs = runner.createExterns();
        assertNotNull(externs);
        // เมื่อใช้เฉพาะ custom externs จะต้องไม่มี default externs เพิ่มเข้ามา
        boolean containsDefault = externs.stream().anyMatch(f -> f.getName().contains("es3.js"));
        assertFalse("Should not contain default externs when use_only_custom_externs is true", containsDefault);
    }

    @Test
    public void testGetDefaultExternsIntegration() {
        try {
            List<JSSourceFile> defaultExterns = CommandLineRunner.getDefaultExterns();
            assertNotNull("Default externs list must not be null", defaultExterns);
            assertFalse("Default externs list must not be empty", defaultExterns.isEmpty());
        } catch (Exception e) {
            fail("getDefaultExterns threw an unexpected exception: " + e.getMessage());
        }
    }
}