package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.StaticSourceFile;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class IRFactoryTest {

    private static class RecordingErrorReporter implements ErrorReporter {
        private final List<String> errors = new ArrayList<>();
        private final List<String> warnings = new ArrayList<>();

        @Override
        public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
            warnings.add(message);
        }

        @Override
        public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {
            errors.add(message);
        }

        @Override
        public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
            return new EvaluatorException(message, sourceName, line, lineSource, lineOffset);
        }

        public List<String> getErrors() { return errors; }
        public List<String> getWarnings() { return warnings; }
    }

    private static class TestSourceFile implements StaticSourceFile {
        private final String fileName;
        public TestSourceFile(String fileName) { this.fileName = fileName; }
        @Override public String getName() { return fileName; }
        @Override public boolean isExtern() { return false; }
        @Override public int getLineOffset(int lineno) { return 0; }
    }

    private Node parseAndTransform(String jsCode, LanguageMode mode) {
        return parseAndTransform(jsCode, mode, new RecordingErrorReporter());
    }

    private Node parseAndTransform(String jsCode, LanguageMode mode, ErrorReporter errorReporter) {
        CompilerEnvirons env = new CompilerEnvirons();
        env.setLanguageVersion(Context.VERSION_1_8);
        Parser parser = new Parser(env, errorReporter);
        StaticSourceFile sourceFile = new TestSourceFile("test.js");
        AstRoot astRoot = parser.parse(jsCode, sourceFile.getName(), 1);

        Config config = new Config(
            mode,
            java.util.Collections.emptySet(),
            true, // acceptConstKeyword
            false, // isIdeMode
            null
        );

        return IRFactory.transformTree(astRoot, sourceFile, jsCode, config, errorReporter);
    }

    @Test
    public void testLanguageModes() {
        // Test ECMASCRIPT3 mode
        Node script3 = parseAndTransform("var a = 1;", LanguageMode.ECMASCRIPT3);
        assertNotNull(script3);

        // Test ECMASCRIPT5 mode
        Node script5 = parseAndTransform("var a = 1;", LanguageMode.ECMASCRIPT5);
        assertNotNull(script5);

        // Test ECMASCRIPT5_STRICT mode
        Node script5Strict = parseAndTransform("var a = 1;", LanguageMode.ECMASCRIPT5_STRICT);
        assertNotNull(script5Strict);
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidLanguageMode() {
        // Pass a mock or trigger invalid language mode through reflection/direct construction if possible,
        // or trigger default case via an unsupported enum value if accessible, 
        // alternatively invoking with a custom Config state if allowed by package visibility.
        Config invalidConfig = new Config(
            null, // Triggers default branch in switch(config.languageMode)
            java.util.Collections.emptySet(),
            true, false, null
        );
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env, new RecordingErrorReporter());
        AstRoot astRoot = parser.parse("var a = 1;", "test.js", 1);
        IRFactory.transformTree(astRoot, new TestSourceFile("test.js"), "var a = 1;", invalidConfig, new RecordingErrorReporter());
    }

    @Test
    public void testStringLiteralSlashV() {
        // Trigger vertical tab \v branch in processStringLiteral
        String code = "var s = '\\v';";
        Node script = parseAndTransform(code, LanguageMode.ECMASCRIPT3);
        assertNotNull(script);
    }

    @Test
    public void testStringLiteralUnicodeVerticalTab() {
        // Trigger \u000B without \v literal text
        String code = "var s = '\\u000B';";
        Node script = parseAndTransform(code, LanguageMode.ECMASCRIPT3);
        assertNotNull(script);
    }

    @Test
    public void testNumberAsStringTransform() {
        // Triggers integer vs double check in getStringValue
        String code = "var o = { 1: 'intKey', 1.5: 'doubleKey' };";
        Node script = parseAndTransform(code, LanguageMode.ECMASCRIPT3);
        assertNotNull(script);
    }

    @Test
    public void testTryStatementEmptyCatchWithFinally() {
        // Triggers lineSet == false && finallyBlock != null branch in processTryStatement
        String code = "try { foo(); } finally { bar(); }";
        Node script = parseAndTransform(code, LanguageMode.ECMASCRIPT3);
        assertNotNull(script);
    }

    @Test
    public void testUnaryExpressionInvalidDelete() {
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        parseAndTransform("delete 1;", LanguageMode.ECMASCRIPT3, reporter);
        assertTrue(reporter.getErrors().stream().anyMatch(e -> e.contains("Invalid delete operand")));
    }

    @Test
    public void testUnaryExpressionInvalidIncrementDecrement() {
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        parseAndTransform("++1;", LanguageMode.ECMASCRIPT3, reporter);
        assertTrue(reporter.getErrors().stream().anyMatch(e -> e.contains("invalid increment target")));

        RecordingErrorReporter reporterDec = new RecordingErrorReporter();
        parseAndTransform("--1;", LanguageMode.ECMASCRIPT3, reporterDec);
        assertTrue(reporterDec.getErrors().stream().anyMatch(e -> e.contains("invalid decrement target")));
    }

    @Test
    public void testObjectLiteralGettersSettersES3() {
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        parseAndTransform("var o = { get x() { return 1; } };", LanguageMode.ECMASCRIPT3, reporter);
        assertTrue(reporter.getErrors().stream().anyMatch(e -> e.contains("getters are not supported")));
    }

    @Test
    public void testGetterParamValidation() {
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        parseAndTransform("var o = { get x(param) { return 1; } };", LanguageMode.ECMASCRIPT5, reporter);
        assertTrue(reporter.getErrors().stream().anyMatch(e -> e.contains("getters may not have parameters")));
    }

    @Test
    public void testSetterParamValidation() {
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        // Setter with 0 parameters
        parseAndTransform("var o = { set x() {} };", LanguageMode.ECMASCRIPT5, reporter);
        assertTrue(reporter.getErrors().stream().anyMatch(e -> e.contains("setters must have exactly one parameter")));
    }

    @Test
    public void testBlockCommentWarning() {
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        // Block comment containing JSDoc annotation to trigger SUSPICIOUS_COMMENT_WARNING
        parseAndTransform("/* @type {string} */ var x;", LanguageMode.ECMASCRIPT3, reporter);
        assertTrue(reporter.getWarnings().stream().anyMatch(w -> w.contains(IRFactory.SUSPICIOUS_COMMENT_WARNING)));
    }
}