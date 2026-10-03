package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class IRFactoryTest {

    private static class RecordingErrorReporter implements ErrorReporter {
        public final List<String> errors = new ArrayList<String>();
        public final List<String> warnings = new ArrayList<String>();

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
    }

    private Node parseAndTransform(String jsCode, LanguageMode mode) {
        return parseAndTransform(jsCode, mode, false);
    }

    private Node parseAndTransform(String jsCode, LanguageMode mode, boolean acceptConst) {
        CompilerEnvirons env = new CompilerEnvirons();
        env.setRecordingComments(true);
        env.setRecordingLocalJsDocComments(true);
        Parser parser = new Parser(env);
        AstRoot root = parser.parse(jsCode, "testjs.js", 1);

        Config config = new Config(
            mode,
            Config.JsDocParsing.SYMBOLS,
            acceptConst,
            null,
            false
        );

        RecordingErrorReporter reporter = new RecordingErrorReporter();
        return IRFactory.transformTree(root, jsCode, config, reporter);
    }

    @Test
    public void testLanguageModesAndReservedKeywords() {
        // ECMASCRIPT3 mode allows reserved keywords without explicit error here (handled by rhino parser or ignored)
        Node nodeEs3 = parseAndTransform("var class = 1;", LanguageMode.ECMASCRIPT3);
        assertNotNull(nodeEs3);

        // ECMASCRIPT5 mode should flag ES5 reserved keywords
        RecordingErrorReporter repEs5 = new RecordingErrorReporter();
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env);
        AstRoot root = parser.parse("var class = 1;", "test.js", 1);
        Config configEs5 = new Config(LanguageMode.ECMASCRIPT5, Config.JsDocParsing.SYMBOLS, false, null, false);
        IRFactory.transformTree(root, "var class = 1;", configEs5, repEs5);
        assertFalse("Expected reserved keyword error in ES5", repEs5.errors.isEmpty());

        // ECMASCRIPT5_STRICT mode should flag strict reserved keywords like 'yield' or 'implements'
        RecordingErrorReporter repStrict = new RecordingErrorReporter();
        AstRoot rootStrict = parser.parse("var implements = 1;", "test.js", 1);
        Config configStrict = new Config(LanguageMode.ECMASCRIPT5_STRICT, Config.JsDocParsing.SYMBOLS, false, null, false);
        IRFactory.transformTree(rootStrict, "var implements = 1;", configStrict, repStrict);
        assertFalse("Expected reserved keyword error in Strict mode", repStrict.errors.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidLanguageModeThrowsException() {
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env);
        AstRoot root = parser.parse("var x = 1;", "test.js", 1);
        // Pass null or a custom mock config if possible, or trigger via reflection/invalid state.
        // Since LanguageMode is an enum, we test the default switch branch if an unhandled value could be passed,
        // or directly test constructor behavior if applicable. Here we simulate via an unsupported flow or dummy config construct.
        Config invalidConfig = new Config(null, Config.JsDocParsing.SYMBOLS, false, null, false);
        IRFactory.transformTree(root, "var x = 1;", invalidConfig, new RecordingErrorReporter());
    }

    @Test
    public void testFileOverviewAndLicenseJSDoc() {
        String js = "/** @fileoverview Overview text\n * @license Apache-2.0\n */\nvar x = 1;";
        Node root = parseAndTransform(js, LanguageMode.ECMASCRIPT3);
        assertNotNull(root);
        assertNotNull(root.getJSDocInfo());
        assertEquals("Apache-2.0", root.getJSDocInfo().getLicense());
    }

    @Test
    public void testDirectivesParsing() {
        String js = "\"use strict\"; var x = 2;";
        Node root = parseAndTransform(js, LanguageMode.ECMASCRIPT5, true);
        assertNotNull(root);
        assertTrue(root.getDirectives().contains("use strict"));
    }

    @Test
    public void testUnaryExpressionEdgeCases() {
        // Negation of number literal optimizes directly in AST
        Node root = parseAndTransform("var x = -5;", LanguageMode.ECMASCRIPT3);
        assertNotNull(root);

        // Invalid increment/decrement target
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env);
        AstRoot astRoot = parser.parse("++(x + 1);", "test.js", 1);
        Config config = new Config(LanguageMode.ECMASCRIPT3, Config.JsDocParsing.SYMBOLS, false, null, false);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        IRFactory.transformTree(astRoot, "++(x + 1);", config, reporter);
        assertFalse(reporter.errors.isEmpty());
    }

    @Test
    public void testAssignmentTargetValidation() {
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env);
        AstRoot astRoot = parser.parse("1 = 2;", "test.js", 1);
        Config config = new Config(LanguageMode.ECMASCRIPT3, Config.JsDocParsing.SYMBOLS, false, null, false);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        IRFactory.transformTree(astRoot, "1 = 2;", config, reporter);
        assertTrue(reporter.errors.contains("invalid assignment target"));
    }

    @Test
    public void testTryCatchFinallyAndEmptyCatch() {
        // Try with finally, empty catch clause
        String js = "try { foo(); } catch (e) {} finally { bar(); }";
        Node root = parseAndTransform(js, LanguageMode.ECMASCRIPT3);
        assertNotNull(root);
    }

    @Test
    public void testSwitchStatementAndCases() {
        String js = "switch(x) { case 1: foo(); break; default: bar(); }";
        Node root = parseAndTransform(js, LanguageMode.ECMASCRIPT3);
        assertNotNull(root);
    }

    @Test
    public void testFunctionTransformations() {
        // Unnamed function statement (error case)
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env);
        AstRoot astRoot = parser.parse("function() {}", "test.js", 1);
        Config config = new Config(LanguageMode.ECMASCRIPT3, Config.JsDocParsing.SYMBOLS, false, null, false);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        IRFactory.transformTree(astRoot, "function() {}", config, reporter);
        assertFalse(reporter.errors.isEmpty());

        // Named function & Function expression
        String validJs = "function foo(a, b) { return a + b; } var f = function() {};";
        Node root = parseAndTransform(validJs, LanguageMode.ECMASCRIPT3);
        assertNotNull(root);
    }

    @Test
    public void testObjectLiteralGettersAndSetters() {
        // In ES3, getters/setters should report errors
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env);
        AstRoot astRoot = parser.parse("var o = { get foo() { return 1; } };", "test.js", 1);
        Config configEs3 = new Config(LanguageMode.ECMASCRIPT3, Config.JsDocParsing.SYMBOLS, false, null, false);
        RecordingErrorReporter reporterEs3 = new RecordingErrorReporter();
        IRFactory.transformTree(astRoot, "var o = { get foo() { return 1; } };", configEs3, reporterEs3);
        assertFalse(reporterEs3.errors.isEmpty());

        // In ES5, valid getters/setters or parameter validation errors
        AstRoot astRootEs5 = parser.parse("var o = { get foo(param) { return 1; } };", "test.js", 1);
        Config configEs5 = new Config(LanguageMode.ECMASCRIPT5, Config.JsDocParsing.SYMBOLS, false, null, false);
        RecordingErrorReporter reporterEs5 = new RecordingErrorReporter();
        IRFactory.transformTree(astRootEs5, "var o = { get foo(param) { return 1; } };", configEs5, reporterEs5);
        assertFalse(reporterEs5.errors.isEmpty());
    }

    @Test
    public void testLabeledStatementsAndLoops() {
        String js = "outer: for(var i=0; i<10; i++) { if(i==5) continue outer; else break outer; }";
        Node root = parseAndTransform(js, LanguageMode.ECMASCRIPT3);
        assertNotNull(root);

        String whileDoJs = "while(true) { do { break; } while(false); }";
        Node root2 = parseAndTransform(whileDoJs, LanguageMode.ECMASCRIPT3);
        assertNotNull(root2);
    }
}