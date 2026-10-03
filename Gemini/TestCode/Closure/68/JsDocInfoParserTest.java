package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JsDocInfoParserTest {

    private static Config createDefaultConfig() {
        Map<String, Annotation> annotationNames = new HashMap<String, Annotation>();
        annotationNames.put("param", Annotation.PARAM);
        annotationNames.put("type", Annotation.TYPE);
        annotationNames.put("return", Annotation.RETURN);
        annotationNames.put("suppress", Annotation.SUPPRESS);
        annotationNames.put("modifies", Annotation.MODIFIES);
        annotationNames.put("author", Annotation.AUTHOR);

        Set<String> suppressionNames = new HashSet<String>();
        suppressionNames.add("visibility");
        suppressionNames.add("missingProperties");

        return new Config(
            annotationNames,
            suppressionNames,
            true,
            LanguageMode.ECMASCRIPT3,
            false
        );
    }

    private boolean parseComment(String commentStr, Config config) {
        JsDocTokenStream stream = new JsDocTokenStream(commentStr);
        ErrorReporter errorReporter = NullErrorReporter.forNewRhino();
        JsDocInfoParser parser = new JsDocInfoParser(
            stream,
            null,
            "testsource",
            config,
            errorReporter
        );
        return parser.parse();
    }

    @Test
    public void testParseTypeStringValid() {
        Node node = JsDocInfoParser.parseTypeString("{string}");
        assertNotNull("Type string parsing should return a node", node);
        assertEquals("Node type should match string token representation or expression", Token.STRING, node.getType());
        assertEquals("string", node.getString());
    }

    @Test
    public void testParseTypeStringComplex() {
        Node node = JsDocInfoParser.parseTypeString("{function(this:Object, number): boolean}");
        assertNotNull(node);
        assertEquals(Token.FUNCTION, node.getType());
    }

    @Test
    public void testUnknownAnnotation() {
        Config config = createDefaultConfig();
        // @unknown is not in annotationNames map
        boolean result = parseComment("/** @unknown description */", config);
        assertTrue(result);
    }

    @Test
    public void testParamAnnotationOptionalAndBrackets() {
        Config config = createDefaultConfig();
        boolean result = parseComment("/** @param {number=} opt_param Description */", config);
        assertTrue(result);
    }

    @Test
    public void testParamAnnotationWithoutType() {
        Config config = createDefaultConfig();
        boolean result = parseComment("/** @param paramName Description without type */", config);
        assertTrue(result);
    }

    @Test
    public void testSuppressTagValid() {
        Config config = createDefaultConfig();
        boolean result = parseComment("/** @suppress{visibility|missingProperties} */", config);
        assertTrue(result);
    }

    @Test
    public void testSuppressTagUnknown() {
        Config config = createDefaultConfig();
        boolean result = parseComment("/** @suppress{unknownWarning} */", config);
        assertTrue(result);
    }

    @Test
    public void testModifiesTagValid() {
        Config config = createDefaultConfig();
        boolean result = parseComment("/** @modifies{this|arguments} */", config);
        assertTrue(result);
    }

    @Test
    public void testModifiesTagUnknown() {
        Config config = createDefaultConfig();
        boolean result = parseComment("/** @modifies{unknownTarget} */", config);
        assertTrue(result);
    }

    @Test
    public void testRecordTypeParsing() {
        Node node = JsDocInfoParser.parseTypeString("{{a: string, b: number}}");
        assertNotNull(node);
        assertEquals(Token.LC, node.getType());
    }

    @Test
    public void testArrayTypeParsing() {
        Node node = JsDocInfoParser.parseTypeString("{Array.<string>}");
        assertNotNull(node);
        assertEquals("Array", node.getString());
    }

    @Test
    public void testAuthorAnnotationEmpty() {
        Config config = createDefaultConfig();
        boolean result = parseComment("/** @author */", config);
        assertTrue(result);
    }

    @Test
    public void testAuthorAnnotationValid() {
        Config config = createDefaultConfig();
        boolean result = parseComment("/** @author John Doe */", config);
        assertTrue(result);
    }

    @Test
    public void testUnexpectedEof() {
        Config config = createDefaultConfig();
        // Unterminated comment block simulating EOF behavior
        boolean result = parseComment("/** @param", config);
        assertFalse(result);
    }
}