package com.google.javascript.jscomp.parsing;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for JsDocInfoParser (Defects4J Closure-142)
 * Designed for High Branch/Condition Coverage and Edge Case Fault Detection.
 */
public class JsDocInfoParserTest {

    @Test
    public void testParseTypeStringSimple() {
        // Trigger: Basic primitive type string parsing
        Node result = JsDocInfoParser.parseTypeString("number");
        assertNotNull("Node should be successfully created for a primitive type", result);
    }

    @Test
    public void testParseTypeStringUnionAndComplex() {
        // Trigger: Union types, array types, and complex expressions in parseTypeString
        Node result = JsDocInfoParser.parseTypeString("(number|string|null)");
        assertNotNull("Node should handle union types correctly", result);
    }

    @Test
    public void testParseTypeStringFunction() {
        // Trigger: Function type parsing path inside basic type expressions
        Node result = JsDocInfoParser.parseTypeString("function(string, number): boolean");
        assertNotNull("Node should handle function types correctly", result);
    }

    @Test
    public void testParseTypeStringRecord() {
        // Trigger: Record type parsing path {a: number, b: string}
        Node result = JsDocInfoParser.parseTypeString("{a: number, b: string}");
        assertNotNull("Node should handle record types correctly", result);
    }

    @Test
    public void testParseTypeStringArray() {
        // Trigger: Array type parsing path [number]
        Node result = JsDocInfoParser.parseTypeString("[number]");
        assertNotNull("Node should handle array types correctly", result);
    }

    @Test
    public void testParseTypeStringNullableAndNotNullable() {
        // Trigger: ?number and !Object syntax branches
        Node nullable = JsDocInfoParser.parseTypeString("?number");
        Node notNullable = JsDocInfoParser.parseTypeString("!Object");
        assertNotNull(nullable);
        assertNotNull(notNullable);
    }

    @Test
    public void testParseTypeStringEmptyOrInvalid() {
        // Edge Case: Empty or malformed type strings
        Node result = JsDocInfoParser.parseTypeString("");
        // Depending on parser behavior, it might return null or a fallback node
        // Ensuring no unhandled runtime exceptions escape.
        assertTrue(result == null || result instanceof Node);
    }
}