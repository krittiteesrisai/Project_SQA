package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for RecordTypeBuilder (Closure-165b).
 */
public class RecordTypeBuilderTest {

    private JSTypeRegistry registry;
    private RecordTypeBuilder builder;

    @Before
    public void setUp() {
        // Initialize JSTypeRegistry required by RecordTypeBuilder
        registry = new JSTypeRegistry(new SimpleErrorReporter());
        builder = new RecordTypeBuilder(registry);
    }

    @Test
    public void testBuildEmptyRecord() {
        // Test branch: isEmpty == true
        JSType result = builder.build();
        assertNotNull("Built type should not be null for empty record", result);
        assertEquals("Empty record should resolve to native OBJECT_TYPE",
                registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), result);
    }

    @Test
    public void testAddSingleProperty() {
        // Test branch: isEmpty becomes false, property added successfully
        Node node = new Node(Token.NAME);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        RecordTypeBuilder chainedBuilder = builder.addProperty("prop1", stringType, node);
        assertSame("addProperty should return 'this' for method chaining", builder, chainedBuilder);

        JSType result = builder.build();
        assertNotNull("Built type should not be null", result);
        assertTrue("Result should be an instance of RecordType", result.isRecordType());
    }

    @Test
    public void testAddDuplicateProperty() {
        // Test branch: properties.containsKey(name) == true -> returns null
        Node node1 = new Node(Token.NAME);
        Node node2 = new Node(Token.NAME);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        // First addition should succeed
        RecordTypeBuilder firstAdd = builder.addProperty("duplicateKey", stringType, node1);
        assertNotNull("First addition should succeed", firstAdd);

        // Second addition with the same name should return null
        RecordTypeBuilder secondAdd = builder.addProperty("duplicateKey", stringType, node2);
        assertNull("Adding duplicate property name should return null", secondAdd);
    }

    @Test
    public void testAddMultipleDistinctProperties() {
        // Test adding multiple valid unique properties
        Node node1 = new Node(Token.NAME);
        Node node2 = new Node(Token.NAME);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        builder.addProperty("propA", stringType, node1)
               .addProperty("propB", numberType, node2);

        JSType result = builder.build();
        assertNotNull(result);
        assertTrue(result.isRecordType());
    }

    @Test(expected = NullPointerException.class)
    public void testAddPropertyWithNullName() {
        // Edge case: Null name to verify robustness against unexpected inputs
        Node node = new Node(Token.NAME);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        builder.addProperty(null, stringType, node);
    }
}