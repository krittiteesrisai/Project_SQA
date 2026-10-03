package com.google.javascript.jscomp.parsing;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.head.ast.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class JsDocInfoParserTest {

    private Config createStandardConfig() {
        return new Config(
            Sets.newHashSet("param", "type", "suppress", "modifies", "idgenerator", "template", "throws", "return", "private", "public", "protected", "const"),
            Sets.newHashSet("visibility", "checkTypes"),
            false,
            LanguageMode.ECMASCRIPT3,
            false
        );
    }

    private JsDocInfoParser createParser(String jsDocString) {
        Config config = createStandardConfig();
        JsDocTokenStream stream = new JsDocTokenStream(jsDocString);
        Comment comment = new Comment(0, 0, Comment.JsDoc, jsDocString);
        return new JsDocInfoParser(stream, comment, null, config, NullErrorReporter.forNewRhino());
    }

    @Test
    public void testParseTypeStringValid() {
        String typeStr = "{string}";
        Node node = JsDocInfoParser.parseTypeString(typeStr);
        assertNotNull("Parsed node should not be null for valid type string", node);
    }

    @Test
    public void testParseTypeStringEmpty() {
        String typeStr = "{}";
        Node node = JsDocInfoParser.parseTypeString(typeStr);
        assertNull("Parsed node should be null for empty type brackets", node);
    }

    @Test
    public void testInlineTypeDocParsing() {
        JsDocInfoParser parser = createParser("{number}");
        assertNotNull(parser.parseInlineTypeDoc());
    }

    @Test
    public void testParseBasicAnnotationAndEOC() {
        JsDocInfoParser parser = createParser("*\n * @type {string}\n */");
        boolean result = parser.parse();
        assertTrue("Parsing basic annotation should succeed", result);
        assertTrue("JSDoc info should be populated", parser.hasParsedJSDocInfo());
    }

    @Test
    public void testParseUnexpectedEOF() {
        JsDocInfoParser parser = createParser("*\n * @type");
        boolean result = parser.parse();
        assertFalse("Parsing should fail on unexpected EOF", result);
    }

    @Test
    public void testParseParamAnnotationValid() {
        JsDocInfoParser parser = createParser("*\n * @param {string} name Description here\n */");
        boolean result = parser.parse();
        assertTrue(result);
        assertTrue(parser.hasParsedJSDocInfo());
    }

    @Test
    public void testParseParamAnnotationOptionalAndDefault() {
        JsDocInfoParser parser = createParser("*\n * @param {string=} [name=\"default\"] Description\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseParamAnnotationMissingVariableName() {
        JsDocInfoParser parser = createParser("*\n * @param {string}\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseSuppressTagValid() {
        JsDocInfoParser parser = createParser("*\n * @suppress {visibility|checkTypes}\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseSuppressTagUnknown() {
        JsDocInfoParser parser = createParser("*\n * @suppress {unknownWarning}\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseModifiesTagValid() {
        JsDocInfoParser parser = createParser("*\n * @modifies {this|arguments}\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseIdGeneratorTagValid() {
        JsDocInfoParser parser = createParser("*\n * @idgenerator {consistent}\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseTemplateTagValid() {
        JsDocInfoParser parser = createParser("*\n * @template T,U\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseThrowsTagValid() {
        JsDocInfoParser parser = createParser("*\n * @throws {Error} Some error description\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testParseBlockDescriptionOnly() {
        Config config = createStandardConfig();
        JsDocTokenStream stream = new JsDocTokenStream("*\n * Just a block description without annotations.\n */");
        Comment comment = new Comment(0, 0, Comment.JsDoc, "Just a block description");
        JsDocInfoParser parser = new JsDocInfoParser(stream, comment, null, config, NullErrorReporter.forNewRhino());
        boolean result = parser.parse();
        assertTrue(result);
    }

    @Test
    public void testBadAnnotationWarning() {
        JsDocInfoParser parser = createParser("*\n * @unknownAnnotation\n */");
        boolean result = parser.parse();
        assertTrue(result);
    }
}