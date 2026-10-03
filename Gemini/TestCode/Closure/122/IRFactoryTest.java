package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.jstype.StaticSourceFile;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class IRFactoryTest {

    private static class RecordingErrorReporter implements ErrorReporter {
        private final List<String> warnings = new ArrayList<>();
        private final List<String> errors = new ArrayList<>();

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

    private AstRoot parseJavaScript(String source) {
        CompilerEnvirons env = new CompilerEnvirons();
        env.setRecordingComments(true);
        env.setRecordingLocalJsDocComments(true);
        Parser parser = new Parser(env);
        return parser.parse(source, null, 1);
    }

    @Test
    public void testEcmascript3Mode() {
        AstRoot astRoot = parseJavaScript("var x = 1;");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        Node result = IRFactory.transformTree(astRoot, null, "var x = 1;", config, reporter);
        assertNotNull(result);
    }

    @Test
    public void testEcmascript5Mode() {
        AstRoot astRoot = parseJavaScript("class C {}");
        Config config = new Config(LanguageMode.ECMASCRIPT5, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        Node result = IRFactory.transformTree(astRoot, null, "class C {}", config, reporter);
        assertNotNull(result);
    }

    @Test
    public void testEcmascript5StrictSupport() {
        AstRoot astRoot = parseJavaScript("var implements = 1;");
        Config config = new Config(LanguageMode.ECMASCRIPT5_STRICT, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        Node result = IRFactory.transformTree(astRoot, null, "var implements = 1;", config, reporter);
        assertNotNull(result);
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidLanguageModeThrowsException() {
        // Force an invalid/unknown language mode if possible, or test default switch branch
        AstRoot astRoot = parseJavaScript("var x = 1;");
        Config config = new Config(null, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        IRFactory.transformTree(astRoot, null, "var x = 1;", config, reporter);
    }

    @Test
    public void testBlockCommentWithSuspiciousAnnotation() {
        AstRoot astRoot = parseJavaScript("/* @author John */ function f() {}");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        IRFactory.transformTree(astRoot, null, "/* @author John */ function f() {}", config, reporter);
        assertFalse("Should report suspicious comment warning", reporter.warnings.isEmpty());
        assertTrue(reporter.warnings.get(0).contains(IRFactory.SUSPICIOUS_COMMENT_WARNING));
    }

    @Test
    public void testInvalidAssignmentTarget() {
        AstRoot astRoot = parseJavaScript("1 = 2;");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        IRFactory.transformTree(astRoot, null, "1 = 2;", config, reporter);
        assertFalse("Should report invalid assignment target error", reporter.errors.isEmpty());
    }

    @Test
    public void testUnsupportedForEachLoop() {
        AstRoot astRoot = parseJavaScript("for each (var x in [1, 2]) {}");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        IRFactory.transformTree(astRoot, null, "for each (var x in [1, 2]) {}", config, reporter);
        assertFalse(reporter.errors.isEmpty());
    }

    @Test
    public void testUnnamedFunctionStatementError() {
        AstRoot astRoot = parseJavaScript("function() {}");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        IRFactory.transformTree(astRoot, null, "function() {}", config, reporter);
        assertFalse(reporter.errors.isEmpty());
    }

    @Test
    public void testGettersAndSettersInES3() {
        AstRoot astRoot = parseJavaScript("var obj = { get x() { return 1; }, set x(v) {} };");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        IRFactory.transformTree(astRoot, null, "var obj = { get x() { return 1; }, set x(v) {} };", config, reporter);
        assertFalse("Should report getter/setter error in ES3", reporter.errors.isEmpty());
    }

    @Test
    public void testInvalidDeleteOperand() {
        AstRoot astRoot = parseJavaScript("delete 1;");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        IRFactory.transformTree(astRoot, null, "delete 1;", config, reporter);
        assertFalse(reporter.errors.isEmpty());
    }

    @Test
    public void testInvalidIncrementDecrementTarget() {
        AstRoot astRoot = parseJavaScript("++1; --1;");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        IRFactory.transformTree(astRoot, null, "++1; --1;", config, reporter);
        assertEquals(2, reporter.errors.size());
    }

    @Test
    public void testVerticalTabStringLiteral() {
        AstRoot astRoot = parseJavaScript("var s = '\\u000B';");
        Config config = new Config(LanguageMode.ECMASCRIPT3, null, false, false, null);
        RecordingErrorReporter reporter = new RecordingErrorReporter();
        
        Node result = IRFactory.transformTree(astRoot, null, "var s = '\\u000B';", config, reporter);
        assertNotNull(result);
    }
}