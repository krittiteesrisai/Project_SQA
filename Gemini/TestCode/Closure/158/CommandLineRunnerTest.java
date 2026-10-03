package com.google.javascript.jscomp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;

import static org.junit.Assert.*;

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
    public void testValidArgumentsAndCompilationSetup() {
        String[] args = new String[] {
            "--js", "testcode.js",
            "--js_output_file", "output.js",
            "--warning_level", "DEFAULT"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Configuration should be valid for standard options", runner.shouldRunCompiler());
        assertNotNull("Compiler options should be created successfully", runner.createOptions());
    }

    @Test
    public void testArgumentParsingWithEqualsAndQuotes() {
        // Triggers processArgs with pattern matching (=) and quotes parsing
        String[] args = new String[] {
            "--js_output_file='quoted_output.js'",
            "--logging_level=INFO"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testHelpFlagTriggersInvalidConfig() {
        String[] args = new String[] { "--help" };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Help flag should invalidate config and print usage", runner.shouldRunCompiler());
    }

    @Test
    public void testVersionFlagOutput() {
        String[] args = new String[] { "--version" };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse(runner.shouldRunCompiler());
        String errOutput = errContent.toString();
        assertTrue("Should print compiler version info", errOutput.contains("Closure Compiler") || errOutput.contains("Version:"));
    }

    @Test
    public void testInvalidCommandLineException() {
        String[] args = new String[] { "--non_existent_flag_xyz" };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Invalid flags should result in invalid configuration", runner.shouldRunCompiler());
        assertTrue("Error message should be printed", errContent.toString().length() > 0);
    }

    @Test
    public void testFlagFileProcessingValid() throws Exception {
        File tempFlagFile = File.createTempFile("flagfile", ".txt");
        tempFlagFile.deleteOnExit();
        Files.write(tempFlagFile.toPath(), "--js=file_in_flagfile.js\n--compilation_level=WHITESPACE_ONLY".getBytes(Charset.defaultCharset()));

        String[] args = new String[] { "--flagfile=" + tempFlagFile.getAbsolutePath() };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue("Flagfile processing should succeed", runner.shouldRunCompiler());
    }

    @Test
    public void testFlagFileIoException() {
        String[] args = new String[] { "--flagfile=non_existent_file_9999.txt" };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Missing flag file should trigger IOException and fail config", runner.shouldRunCompiler());
        assertTrue(errContent.toString().contains("read error"));
    }

    @Test
    public void testNestedFlagFileError() throws Exception {
        File tempFlagFile = File.createTempFile("nested_flag", ".txt");
        tempFlagFile.deleteOnExit();
        // Putting --flagfile inside the flagfile to trigger internal error branch
        Files.write(tempFlagFile.toPath(), ("--flagfile=" + tempFlagFile.getAbsolutePath()).getBytes(Charset.defaultCharset()));

        String[] args = new String[] { "--flagfile=" + tempFlagFile.getAbsolutePath() };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertFalse("Nested flagfiles should be blocked and invalidate config", runner.shouldRunCompiler());
        assertTrue(errContent.toString().contains("Arguments in the file cannot contain"));
    }

    @Test
    public void testBooleanOptionHandlerVariations() {
        // Testing BooleanOptionHandler through flags that use it
        String[] argsWithNoValue = new String[] { "--print_tree" };
        CommandLineRunner runner1 = new CommandLineRunner(argsWithNoValue);
        assertTrue(runner1.shouldRunCompiler());

        String[] argsWithTrue = new String[] { "--print_tree=true", "--debug=on", "--generate_exports=yes" };
        CommandLineRunner runner2 = new CommandLineRunner(argsWithTrue);
        assertTrue(runner2.shouldRunCompiler());
        assertNotNull(runner2.createOptions());

        String[] argsWithFalse = new String[] { "--print_tree=false", "--debug=off" };
        CommandLineRunner runner3 = new CommandLineRunner(argsWithFalse);
        assertTrue(runner3.shouldRunCompiler());

        String[] argsWithInvalidBoolean = new String[] { "--print_tree=maybe" };
        CommandLineRunner runner4 = new CommandLineRunner(argsWithInvalidBoolean);
        assertTrue("Invalid boolean falls back to true in parser", runner4.shouldRunCompiler());
    }

    @Test
    public void testFormattingOptionsAndDebug() {
        String[] args = new String[] {
            "--formatting=PRETTY_PRINT",
            "--formatting=PRINT_INPUT_DELIMITER",
            "--debug",
            "--generate_exports",
            "--third_party"
        };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test
    public void testCreateExternsCustomOnly() throws Exception {
        String[] args = new String[] { "--use_only_custom_externs", "--js", "dummy.js" };
        CommandLineRunner runner = new CommandLineRunner(args);
        assertTrue(runner.shouldRunCompiler());
        // Trigger createExterns in test/custom mode
        assertNotNull(runner.createExterns());
    }
}