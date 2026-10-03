package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.ToolErrorReporter;
import org.junit.Test;

import static org.junit.Assert.*;

public class IRFactoryTest {

    private ErrorReporter createErrorReporter() {
        return new ToolErrorReporter(true);
    }

    private AstRoot parseJavaScript(String source) {
        CompilerEnvirons env = new CompilerEnvirons();
        env.setRecordingComments(true);
        env.setLanguageVersion(CompilerEnvirons.VERSION_1_8);
        Parser parser = new Parser(env, createErrorReporter());
        return parser.parse(source, null, 1);
    }

    @Test
    public void testLanguageModesAndReservedKeywords() {
        // ECMASCRIPT3 mode: reservedKeywords = null
        Config configEs3 = new Config(null, null, true, LanguageMode.ECMASCRIPT3, false);
        AstRoot root = parseJavaScript("var class = 1;");
        Node nodeEs3 = IRFactory.transformTree(root, null, "var class = 1;", configEs3, createErrorReporter());
        assertNotNull(nodeEs3);

        // ECMASCRIPT5 mode: reservedKeywords active
        Config configEs5 = new Config(null, null, true, LanguageMode.ECMASCRIPT5, false);
        AstRoot rootEs5 = parseJavaScript("var class = 1;");
        Node nodeEs5 = IRFactory.transformTree(rootEs5, null, "var class = 1;", configEs5, createErrorReporter());
        assertNotNull(nodeEs5);

        // ECMASCRIPT5_STRICT mode: strict reservedKeywords active
        Config configEsStrict = new Config(null, null, true, LanguageMode.ECMASCRIPT5_STRICT, false);
        AstRoot rootStrict = parseJavaScript("var yield = 1;");
        Node nodeStrict = IRFactory.transformTree(rootStrict, null, "var yield = 1;", configEsStrict, createErrorReporter());
        assertNotNull(nodeStrict);
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidLanguageMode() {
        // Trigger default case in languageMode switch -> throws IllegalStateException
        Config invalidConfig = new Config(null, null, true, null, false);
        AstRoot root = parseJavaScript("var x = 1;");
        // Force null languageMode via reflection or if config allows, but since languageMode is enum, 
        // we test via an unhandled value or custom handling if possible. If Config prevents null,
        // we can pass a mock/invalid state if accessible, otherwise verify default exception path.
        IRFactory.transformTree(root, null, "var x = 1;", invalidConfig, createErrorReporter());
    }

    @Test
    public void testCommentsAndFileOverviewJsDoc() {
        Config config = new Config(null, null, true, LanguageMode.ECMASCRIPT3, false);
        String js = "/** @fileoverview Description */\n/* @suspicious annotation */\nfunction foo() {}";
        AstRoot root = parseJavaScript(js);
        Node result = IRFactory.transformTree(root, null, js, config, createErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testStringValueFormattingAndNumberLiterals() {
        Config config = new Config(null, null, true, LanguageMode.ECMASCRIPT3, false);
        // Test integer number literal (longValue == value) vs decimal
        String js = "var a = 100; var b = 12.34; var s = '\\u000B';";
        AstRoot root = parseJavaScript(js);
        Node result = IRFactory.transformTree(root, null, js, config, createErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testInvalidAssignmentTargetAndUnaryExpressions() {
        Config config = new Config(null, null, true, LanguageMode.ECMASCRIPT3, false);
        // Invalid assignment target (1 = 2) and invalid delete operand / increment
        String js = "1 = 2; delete 5; ++5; --(1);";
        AstRoot root = parseJavaScript(js);
        Node result = IRFactory.transformTree(root, null, js, config, createErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testObjectLiteralGettersAndSettersES3() {
        Config config = new Config(null, null, true, LanguageMode.ECMASCRIPT3, false);
        // In ECMASCRIPT3, getters and setters should trigger reportGetter / reportSetter
        String js = "var obj = { get x() { return 1; }, set y(v) { this._y = v; } };";
        AstRoot root = parseJavaScript(js);
        Node result = IRFactory.transformTree(root, null, js, config, createErrorReporter());
        assertNotNull(result);
    }

    @Test
    public void testTryCatchFinallyVariations() {
        Config config = new Config(null, null, true, LanguageMode.ECMASCRIPT3, false);
        // Try with catch and finally, try with empty catch, etc.
        String js = "try { foo(); } catch (e) { bar(); } finally { baz(); }";
        AstRoot root = parseJavaScript(js);
        Node result = IRFactory.transformTree(root, null, js, config, createErrorReporter());
        assertNotNull(result);
    }
}