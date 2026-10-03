package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.EvaluatorException;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class IRFactoryTest {

    private static class RecordingErrorReporter implements ErrorReporter {
        private final List<String> errors = new ArrayList<String>();

        @Override
        public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
        }

        @Override
        public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {
            errors.add(message);
        }

        @Override
        public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
            return new EvaluatorException(message, sourceName, line, lineSource, lineOffset);
        }

        public List<String> getErrors() {
            return errors;
        }
    }

    private Node parseAndTransform(String jsCode, Config config) {
        CompilerEnvirons env = new CompilerEnvirons();
        env.setRecordingComments(true);
        env.setRecordingLocalJsDocComments(true);
        Parser parser = new Parser(env, new RecordingErrorReporter());
        AstRoot astRoot = parser.parse(jsCode, "testcode.js", 1);
        return IRFactory.transformTree(astRoot, jsCode, config, new RecordingErrorReporter());
    }

    private Node parseAndTransform(String jsCode) {
        Config config = new Config(null, null, true, true, false);
        return parseAndTransform(jsCode, config);
    }

    @Test
    public void testEmptyBlockAndTransformBlock() {
        // Triggers transformBlock where irNode.getType() == Token.EMPTY
        String js = "if (true) {} else { 1; }";
        Node root = parseAndTransform(js);
        assertNotNull(root);
    }

    @Test
    public void testNonEmptyNonBlockTransformBlock() {
        // Triggers transformBlock wrapping a non-block, non-empty node
        String js = "while(false) x = 1;";
        Node root = parseAndTransform(js);
        assertNotNull(root);
    }

    @Test
    public void testFileOverviewAndLicenseJsDoc() {
        // Triggers fileoverview, license handling branches
        String js = "/** @fileoverview Overview text\n * @license Apache-2.0 */\nvar a = 1;";
        Node root = parseAndTransform(js);
        assertNotNull(root);
        assertNotNull(root.getJSDocInfo());
    }

    @Test
    public void testArrayLiteralWithHolesAndDestructuring() {
        // Triggers skipIndexes branch in ArrayLiteral and destructuring report
        String js = "[1, , 3];";
        Node root = parseAndTransform(js);
        assertNotNull(root);
    }

    @Test
    public void testDestructuringAssignmentError() {
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env, reporter);
        String js = "var [a, b] = [1, 2];";
        AstRoot astRoot = parser.parse(js, "testcode.js", 1);
        Config config = new Config(null, null, true, true, false);
        IRFactory.transformTree(astRoot, js, config, reporter);
        
        boolean foundDestructuringError = false;
        for (String err : reporter.getErrors()) {
            if (err.contains("destructuring assignment forbidden")) {
                foundDestructuringError = true;
                break;
            }
        }
        assertTrue("Should report destructuring assignment forbidden", foundDestructuringError);
    }

    @Test
    public void testInvalidAssignmentTarget() {
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env, reporter);
        String js = "1 = 2;";
        AstRoot astRoot = parser.parse(js, "testcode.js", 1);
        Config config = new Config(null, null, true, true, false);
        IRFactory.transformTree(astRoot, js, config, reporter);

        boolean foundInvalidTarget = false;
        for (String err : reporter.getErrors()) {
            if (err.contains("invalid assignment target")) {
                foundInvalidTarget = true;
                break;
            }
        }
        assertTrue("Should report invalid assignment target", foundInvalidTarget);
    }

    @Test
    public void testUnaryExpressionEdgeCases() {
        // Triggers NEG + NUMBER optimization and INC/DEC invalid target
        String js = "var x = -5; ++(1);";
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env, reporter);
        AstRoot astRoot = parser.parse(js, "testcode.js", 1);
        Config config = new Config(null, null, true, true, false);
        IRFactory.transformTree(astRoot, js, config, reporter);
        
        boolean foundInvalidInc = false;
        for (String err : reporter.getErrors()) {
            if (err.contains("invalid increment target")) {
                foundInvalidInc = true;
                break;
            }
        }
        assertTrue("Should report invalid increment target", foundInvalidInc);
    }

    @Test
    public void testObjectLiteralGettersAndSettersConfig() {
        // Test ES5 acceptAcceptES5 false/true branches for getters/setters
        Config configNoES5 = new Config(null, null, false, true, false);
        String js = "var o = { get foo() { return 1; }, set bar(v) { this.x = v; } };";
        
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        CompilerEnvirons env = new CompilerEnvirons();
        Parser parser = new Parser(env, reporter);
        AstRoot astRoot = parser.parse(js, "testcode.js", 1);
        IRFactory.transformTree(astRoot, js, configNoES5, reporter);
        
        boolean foundGetterErr = false;
        for (String err : reporter.getErrors()) {
            if (err.contains("getters are not supported")) {
                foundGetterErr = true;
                break;
            }
        }
        assertTrue("Should report getters not supported when acceptES5 is false", foundGetterErr);

        // Test with acceptES5 = true but invalid parameters (getter with param, setter without/too many params)
        Config configES5 = new Config(null, null, true, true, false);
        String invalidJs = "var o = { get foo(a) { return 1; }, set bar() { this.x = 1; } };";
        RecordingErrorReporter reporter2 = new RecordingErrorReporter();
        Parser parser2 = new Parser(env, reporter2);
        AstRoot astRoot2 = parser2.parse(invalidJs, "testcode.js", 1);
        IRFactory.transformTree(astRoot2, invalidJs, configES5, reporter2);
        
        boolean foundGetterParamErr = false;
        boolean foundSetterParamErr = false;
        for (String err : reporter2.getErrors()) {
            if (err.contains("getters may not have parameters")) foundGetterParamErr = true;
            if (err.contains("setters must have exactly one parameter")) foundSetterParamErr = true;
        }
        assertTrue("Should report getter param error", foundGetterParamErr);
        assertTrue("Should report setter param error", foundSetterParamErr);
    }

    @Test
    public void testTryCatchFinallyVariations() {
        // Try with empty catch and finally (lineSet branches)
        String jsTry = "try { foo(); } catch (e) {} finally { cleanup(); }";
        Node root1 = parseAndTransform(jsTry);
        assertNotNull(root1);

        String jsTryEmptyCatch = "try { foo(); } finally { cleanup(); }";
        Node root2 = parseAndTransform(jsTryEmptyCatch);
        assertNotNull(root2);
    }

    @Test
    public void testSwitchStatementsAndCases() {
        String jsSwitch = "switch(x) { case 1: break; default: doSomething(); }";
        Node root = parseAndTransform(jsSwitch);
        assertNotNull(root);
    }

    @Test
    public void testDirectivesParsing() {
        String js = "\"use strict\"; function f() { \"use strict\"; }";
        Node root = parseAndTransform(js);
        assertNotNull(root);
    }

    @Test
    public void testParenthesizedAndLabelsAndRegex() {
        String js = "mylbl: { (function() { return /abc/gi; })(); break mylbl; continue; }";
        Node root = parseAndTransform(js);
        assertNotNull(root);
    }
}