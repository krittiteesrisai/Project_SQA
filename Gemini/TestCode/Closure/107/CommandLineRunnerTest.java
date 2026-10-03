package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.List;

public class CommandLineRunnerTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testValidArguments() {
        String[] args = new String[] { "--js", "test.js" };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));
        
        assertTrue("Configuration should be valid for simple JS input", runner.shouldRunCompiler());
    }

    @Test
    public void testInvalidArguments() {
        String[] args = new String[] { "--non_existent_flag_xyz" };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));
        
        assertFalse("Configuration should be invalid for unknown flags", runner.shouldRunCompiler());
    }

    @Test
    public void testHelpFlag() {
        String[] args = new String[] { "--help" };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));
        
        assertFalse("Help flag should invalidate compilation and print usage", runner.shouldRunCompiler());
    }

    @Test
    public void testVersionFlag() {
        String[] args = new String[] { "--version" };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));
        
        String output = errStream.toString();
        assertTrue("Version output should contain Closure Compiler release info", output.contains("Closure Compiler"));
    }

    @Test
    public void testProcessCommonJsModulesMissingEntry() {
        String[] args = new String[] { "--process_common_js_modules=true" };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));
        
        assertFalse("CommonJS without entry module should be invalid", runner.shouldRunCompiler());
        assertTrue("Should error about missing entry module", errStream.toString().contains("Please specify --common_js_entry_module"));
    }

    @Test
    public void testProcessCommonJsModulesValid() {
        String[] args = new String[] { "--process_common_js_modules=true", "--common_js_entry_module=main.js" };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));
        
        assertTrue("CommonJS with entry module should be valid", runner.shouldRunCompiler());
    }

    @Test
    public void testFlagFileValid() throws Exception {
        File flagFile = temporaryFolder.newFile("flags.txt");
        java.nio.file.Files.write(flagFile.toPath(), "--js=file1.js\n--js=file2.js".getBytes());

        String[] args = new String[] { "--flagfile=" + flagFile.getAbsolutePath() };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));

        assertTrue("Valid flagfile configuration should pass", runner.shouldRunCompiler());
    }

    @Test
    public void testFlagFileReadError() {
        String[] args = new String[] { "--flagfile=non_existent_flag_file_12345.txt" };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));

        assertFalse("Non-existent flagfile should invalidate config", runner.shouldRunCompiler());
        assertTrue(errStream.toString().contains("read error"));
    }

    @Test
    public void testCreateOptionsAndFormatting() {
        String[] args = new String[] {
            "--js", "test.js",
            "--compilation_level", "ADVANCED_OPTIMIZATIONS",
            "--warning_level", "VERBOSE",
            "--formatting", "PRETTY_PRINT",
            "--formatting", "PRINT_INPUT_DELIMITER",
            "--formatting", "SINGLE_QUOTES",
            "--debug",
            "--use_types_for_optimization",
            "--generate_exports",
            "--angular_pass"
        };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));

        assertTrue(runner.shouldRunCompiler());
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslationsFileIOException() {
        String[] args = new String[] {
            "--js", "test.js",
            "--translations_file", "non_existent_xtb_file.xtb"
        };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));
        
        // Should throw RuntimeException when reading a non-existent XTB file
        runner.createOptions();
    }

    @Test
    public void testCreateExternsCustomOnly() throws Exception {
        String[] args = new String[] {
            "--js", "test.js",
            "--use_only_custom_externs", "true"
        };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));

        List<SourceFile> externs = runner.createExterns();
        assertNotNull(externs);
    }

    @Test
    public void testBooleanOptionHandlerEdgeCases() {
        // Test variations of BooleanOptionHandler parameters: true, false, on, off, yes, no, 1, 0, invalid words
        String[] args = new String[] {
            "--debug", "invalid_bool_defaults_true",
            "--third_party=off",
            "--print_tree=yes",
            "--print_ast=no",
            "--print_pass_graph=1",
            "--generate_exports=0"
        };
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        CommandLineRunner runner = new CommandLineRunner(args, System.out, new PrintStream(errStream));
        assertTrue(runner.shouldRunCompiler());
    }
}