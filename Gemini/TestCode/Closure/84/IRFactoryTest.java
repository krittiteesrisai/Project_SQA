package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.Context;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import static org.junit.Assert.*;

public class IRFactoryTest {

    private static class DummyErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {}
        @Override
        public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {}
        @Override
        public com.google.javascript.jscomp.mozilla.rhino.EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
            return new com.google.javascript.jscomp.mozilla.rhino.EvaluatorException(message, sourceName, line, lineSource, lineOffset);
        }
    }

    private AstRoot parseJavascript(String sourceCode, String sourceName) {
        CompilerEnvirons environs = new CompilerEnvirons();
        environs.setRecordingComments(true);
        environs.setRecoverFromErrors(true);
        Parser parser = new Parser(environs, new DummyErrorReporter());
        return parser.parse(sourceCode, sourceName, 1);
    }

    @Test
    public void testTransformTreeWithFileOverviewAndLicense() {
        String js = "/** @fileoverview Test Overview\n * @license Apache-2.0\n */\nfunction foo() {}";
        AstRoot astRoot = parseJavascript(js, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result = IRFactory.transformTree(astRoot, js, config, new DummyErrorReporter());
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
    }

    @Test
    public void testTransformEmptyBlockAndNonBlock() {
        String js = "if (true) ; else { 1; }";
        AstRoot astRoot = parseJavascript(js, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result = IRFactory.transformTree(astRoot, js, config, new DummyErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testPosition2CharnoWithoutNewline() {
        String js = "var x = 10;";
        AstRoot astRoot = parseJavascript(js, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result = IRFactory.transformTree(astRoot, js, config, new DummyErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testArrayLiteralWithSkipsAndDestructuring() {
        String js = "var [a,,b] = [1,,3];";
        AstRoot astRoot = parseJavascript(js, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result = IRFactory.transformTree(astRoot, js, config, new DummyErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testObjectLiteralGettersSettersAndES5Config() {
        // Test with acceptES5 = false to trigger reportGetter/reportSetter
        String jsWithGetSet = "var obj = { get a() { return 1; }, set b(v) { this.x = v; }, 'c': 2, d: 3 };";
        AstRoot astRoot = parseJavascript(jsWithGetSet, "test.js");
        Config configFalse = new Config(null, null, false, true, false);
        Node result1 = IRFactory.transformTree(astRoot, jsWithGetSet, configFalse, new DummyErrorReporter());
        assertNotNull(result1);

        // Test with acceptES5 = true
        Config configTrue = new Config(null, null, true, true, false);
        Node result2 = IRFactory.transformTree(astRoot, jsWithGetSet, configTrue, new DummyErrorReporter());
        assertNotNull(result2);
    }

    @Test
    public void testUnnamedFunctionAndDirectives() {
        String js = "\"use strict\"; (function() { return 42; })();";
        AstRoot astRoot = parseJavascript(js, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result = IRFactory.transformTree(astRoot, js, config, new DummyErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testLabeledStatementsAndBreakContinue() {
        String js = "outer: for(var i=0; i<10; i++) { inner: { break outer; continue inner; } }";
        AstRoot astRoot = parseJavascript(js, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result = IRFactory.transformTree(astRoot, js, config, new DummyErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testTryCatchFinallyVariations() {
        // Try with empty catch and finally
        String js1 = "try { throw new Error(); } catch (e) {} finally {}";
        AstRoot astRoot1 = parseJavascript(js1, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result1 = IRFactory.transformTree(astRoot1, js1, config, new DummyErrorReporter());
        assertNotNull(result1);

        // Try with finally but no catch explicitly handled structure line setting
        String js2 = "try { foo(); } finally { bar(); }";
        AstRoot astRoot2 = parseJavascript(js2, "test.js");
        Node result2 = IRFactory.transformTree(astRoot2, js2, config, new DummyErrorReporter());
        assertNotNull(result2);
    }

    @Test
    public void testUnaryExpressionsAndRegExp() {
        String js = "var a = -5; var b = a++; var reg = /ab+c/gi;";
        AstRoot astRoot = parseJavascript(js, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result = IRFactory.transformTree(astRoot, js, config, new DummyErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testSwitchStatementsAndCases() {
        String js = "switch(x) { case 1: break; default: foo(); }";
        AstRoot astRoot = parseJavascript(js, "test.js");
        Config config = new Config(null, null, true, true, false);
        Node result = IRFactory.transformTree(astRoot, js, config, new DummyErrorReporter());
        assertNotNull(result);
    }
}