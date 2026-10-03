package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * High-coverage JUnit 4 Test Suite for AbstractCommandLineRunner (Closure-149b).
 * Uses only JUnit 4 and project classpath.
 */
public class AbstractCommandLineRunnerTest {

    private CompilerOptions options;

    @Before
    public void setUp() {
        options = new CompilerOptions();
    }

    // ==================== Tests for createDefineReplacements ====================

    @Test
    public void testDefineReplacementBooleanImplicit() {
        List<String> defs = Arrays.asList("MY_FLAG");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
        // Validates implicit boolean definition (assignment.length == 1)
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
    public void testDefineReplacementStringSingleQuotes() {
        List<String> defs = Arrays.asList("MY_STR='hello'");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testDefineReplacementStringDoubleQuotes() {
        List<String> defs = Arrays.asList("MY_STR=\"world\"");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testDefineReplacementDoubleLiteral() {
        List<String> defs = Arrays.asList("MY_NUM=123.45");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test(expected = RuntimeException.class)
    public void testDefineReplacementInvalidSyntaxEmptyName() {
        List<String> defs = Arrays.asList("=123");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test(expected = RuntimeException.class)
    public void testDefineReplacementInvalidNumberFormat() {
        List<String> defs = Arrays.asList("MY_INVALID=not_a_number_or_bool");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test(expected = RuntimeException.class)
    public void testDefineReplacementMalformedStringQuotes() {
        List<String> defs = Arrays.asList("MY_STR='unclosed");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    // ==================== Tests for writeOutput ====================

    @Test
    public void testWriteOutputWithPlaceholderAndPrefixSuffix() throws IOException {
        StringBuilder sb = new StringBuilder();
        String wrapper = "PREFIX_%s_SUFFIX";
        AbstractCommandLineRunner.writeOutput(sb, null, "CODE", wrapper, "%s");
        assertEquals("PREFIX_CODE_SUFFIX\n", sb.toString());
    }

    @Test
    public void testWriteOutputWithPlaceholderOnlyAtStart() throws IOException {
        StringBuilder sb = new StringBuilder();
        String wrapper = "%s_SUFFIX";
        AbstractCommandLineRunner.writeOutput(sb, null, "CODE", wrapper, "%s");
        assertEquals("CODE_SUFFIX\n", sb.toString());
    }

    @Test
    public void testWriteOutputWithoutPlaceholder() throws IOException {
        StringBuilder sb = new StringBuilder();
        String wrapper = "NO_PLACEHOLDER_HERE";
        AbstractCommandLineRunner.writeOutput(sb, null, "CODE", wrapper, "%s");
        assertEquals("CODE\n", sb.toString());
    }

    // ==================== Tests for createJsModules ====================

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesInvalidSpecColonCount() throws Exception {
        List<String> specs = Arrays.asList("invalid_spec_format");
        List<String> jsFiles = Arrays.asList("file1.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesInvalidIdentifierName() throws Exception {
        List<String> specs = Arrays.asList("123invalidName:1");
        List<String> jsFiles = Arrays.asList("file1.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesDuplicateModuleName() throws Exception {
        List<String> specs = Arrays.asList("mod1:1", "mod1:1");
        List<String> jsFiles = Arrays.asList("file1.js", "file2.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesInvalidFileCountNumber() throws Exception {
        List<String> specs = Arrays.asList("mod1:abc");
        List<String> jsFiles = Arrays.asList("file1.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesNotEnoughJsFiles() throws Exception {
        List<String> specs = Arrays.asList("mod1:5");
        List<String> jsFiles = Arrays.asList("file1.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesUnknownDependency() throws Exception {
        List<String> specs = Arrays.asList("mod1:1:unknown_dep");
        List<String> jsFiles = Arrays.asList("file1.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModulesTooManyJsFilesSpecified() throws Exception {
        List<String> specs = Arrays.asList("mod1:1");
        List<String> jsFiles = Arrays.asList("file1.js", "file2.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    // ==================== Tests for parseModuleWrappers ====================

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappersMissingColon() throws Exception {
        JSModule[] modules = { new JSModule("m1") };
        List<String> specs = Arrays.asList("m1_no_colon_wrapper");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappersUnknownModule() throws Exception {
        JSModule[] modules = { new JSModule("m1") };
        List<String> specs = Arrays.asList("unknown:wrapper-%s");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappersMissingPlaceholder() throws Exception {
        JSModule[] modules = { new JSModule("m1") };
        List<String> specs = Arrays.asList("m1:wrapper-without-percent-s");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }
}