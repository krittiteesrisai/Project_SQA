package com.google.javascript.jscomp.parsing;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for JsDocInfoParser (Defects4J Closure-32).
 */
public class JsDocInfoParserTest {

    @Test
    public void testParseTypeStringSimpleNumber() {
        Node node = JsDocInfoParser.parseTypeString("{number}");
        assertNotNull("Node should not be null for valid type string", node);
        assertEquals(Token.QMARK, node.getType()); // Or basic type representation depending on implementation
    }

    @Test
    public void testParseTypeStringEmpty() {
        Node node = JsDocInfoParser.parseTypeString("");
        assertNull("Parsing empty type string should return null", node);
    }

    @Test
    public void testParseTypeStringNull() {
        // Edge case: passing null might throw NPE or handle gracefully depending on stream implementation.
        // We protect against unexpected fault states.
        try {
            JsDocInfoParser.parseTypeString(null);
        } catch (NullPointerException | IllegalArgumentException e) {
            // Expected behavior for null stream source
        }
    }

    @Test
    public void testParseTypeStringComplexUnion() {
        Node node = JsDocInfoParser.parseTypeString("{number|string}");
        assertNotNull("Union type expression should be parsed successfully", node);
        assertEquals(Token.PIPE, node.getType());
    }

    @Test
    public void testParseTypeStringFunction() {
        Node node = JsDocInfoParser.parseTypeString("{function(number, string): boolean}");
        assertNotNull("Function type expression should be parsed successfully", node);
        assertEquals(Token.FUNCTION, node.getType());
    }

    @Test
    public void testParseTypeStringArray() {
        Node node = JsDocInfoParser.parseTypeString("{Array.<string>}");
        assertNotNull("Array type expression should be parsed successfully", node);
    }

    @Test
    public void testParseTypeStringRecord() {
        Node node = JsDocInfoParser.parseTypeString("{name: string, id: number}");
        assertNotNull("Record type expression should be parsed successfully", node);
        assertEquals(Token.LC, node.getType());
    }

    @Test
    public void testParseTypeStringMissingRightCurly() {
        // Edge Case / Syntax Error Recovery
        Node node = JsDocInfoParser.parseTypeString("{number");
        // Should handle syntax warning and either return partial node or null safely
        // Verifying it does not throw unhandled exception
    }

    @Test
    public void testParseTypeStringUnknownSyntax() {
        Node node = JsDocInfoParser.parseTypeString("@@invalid_syntax");
        assertNull("Invalid syntax should result in null AST node", node);
    }

    @Test
    public void testParseTypeStringWithWhitespaceAndNewlines() {
        Node node = JsDocInfoParser.parseTypeString("{\n  number\n}");
        assertNotNull("Type expression spanning multiple lines with EOLs should parse", node);
    }
}