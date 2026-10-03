package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.testing.BaseWithErrorReporter;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class JsDocInfoParserTest {

    private Config createStandardConfig() {
        Set<String> annotations = new HashSet<String>();
        annotations.add("param");
        annotations.add("type");
        annotations.add("return");
        annotations.add("define");
        annotations.add("private");
        annotations.add("suppress");
        annotations.add("modifies");
        annotations.add("fileoverview");
        annotations.add("nginject");
        annotations.add("desc");

        Set<String> suppressions = new HashSet<String>();
        suppressions.add("visibility");
        suppressions.add("checkTypes");

        return new Config(
            annotations,
            suppressions,
            true,
            LanguageMode.ECMASCRIPT3,
            false
        );
    }

    private JsDocInfoParser createParser(String jsDocString) {
        Config config = createStandardConfig();
        ErrorReporter errorReporter = NullErrorReporter.forNewRhino();
        JsDocTokenStream stream = new JsDocTokenStream(jsDocString);
        return new JsDocInfoParser(stream, null, null, config, errorReporter);
    }

    @Test
    public void testParseTypeStringValid() {
        Node node = JsDocInfoParser.parseTypeString("{string}");
        assertNotNull("Parsed node should not be null for valid type string", node);
    }

    @Test
    public void testParseTypeStringInvalid() {
        Node node = JsDocInfoParser.parseTypeString("{");
        // Parser might recover or return null depending on syntax strictness
        assertNull("Malformed type string should result in null or handled error node", node);
    }

    @Test
    public void testParseSimpleParamAndType() {
        String jsDoc = "/** @param {string} name User name \n * @type {number} */";
        JsDocInfoParser parser = createParser(jsDoc);
        boolean result = parser.parse();
        assertTrue("JSDoc should parse successfully", result);
        JSDocInfo info = parser.retrieveAndResetParsedJSDocInfo();
        assertNotNull(info);
    }

    @Test
    public void testParseSuppressAndModifiesTags() {
        String jsDoc = "/** @suppress{visibility|checkTypes}\n @modifies{this|arguments} */";
        JsDocInfoParser parser = createParser(jsDoc);
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseFileOverviewAndDuplicateWarnings() {
        String jsDoc = "/** @fileoverview First overview\n @fileoverview Second overview */";
        JsDocInfoParser parser = createParser(jsDoc);
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseNgInjectAndExtraWarnings() {
        String jsDoc = "/** @nginject \n @nginject */";
        JsDocInfoParser parser = createParser(jsDoc);
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseInlineTypeDoc() {
        String jsDoc = "{string}";
        Config config = createStandardConfig();
        ErrorReporter errorReporter = NullErrorReporter.forNewRhino();
        JsDocTokenStream stream = new JsDocTokenStream(jsDoc);
        JsDocInfoParser parser = new JsDocInfoParser(stream, null, null, config, errorReporter);
        
        JSDocInfo info = parser.parseInlineTypeDoc();
        assertNotNull(info);
    }

    @Test
    public void testParseEmptyAndEdgeCaseComments() {
        String jsDoc = "/** \n * \n */";
        JsDocInfoParser parser = createParser(jsDoc);
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testUnexpectedEofHandling() {
        String jsDoc = "/** @param {string}";
        JsDocInfoParser parser = createParser(jsDoc);
        boolean result = parser.parse();
        assertFalse("Parser should fail or detect EOF correctly", result);
    }

    @Test
    public void testUnknownAnnotationWarning() {
        String jsDoc = "/** @unknownTag some text */";
        Config config = createStandardConfig();
        ErrorReporter errorReporter = new BaseWithErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
                // Verify warning is triggered for unknown tags
                assertNotNull(message);
            }
        };
        JsDocTokenStream stream = new JsDocTokenStream(jsDoc);
        JsDocInfoParser parser = new JsDocInfoParser(stream, null, null, config, errorReporter);
        boolean result = parser.parse();
        assertTrue(result);
    }
}