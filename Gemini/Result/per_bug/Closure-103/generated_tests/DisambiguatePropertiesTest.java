package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for DisambiguateProperties (Closure-103b).
 */
public class DisambiguatePropertiesTest {

    private Compiler compiler;
    private DisambiguateProperties<JSType> disambiguateProperties;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // Initialize basic compiler options / config if needed
        compiler.initOptions(new CompilerOptions());
        disambiguateProperties = DisambiguateProperties.forJSTypeSystem(compiler);
        registry = compiler.getTypeRegistry();
    }

    @Test
    public void testGetPropertyCreatesNewIfNotExists() {
        // Edge Case: Requesting a property that hasn't been created yet
        DisambiguateProperties<JSType>.Property prop = disambiguateProperties.getProperty("nonExistentProp");
        assertNotNull("Property should be created", prop);
        assertEquals("nonExistentProp", prop.name);
        
        // Calling again should return the exact same instance (Cache check)
        DisambiguateProperties<JSType>.Property propCached = disambiguateProperties.getProperty("nonExistentProp");
        assertSame("Should return cached property instance", prop, propCached);
    }

    @Test
    public void testPropertyInvalidationFlow() {
        DisambiguateProperties<JSType>.Property prop = disambiguateProperties.getProperty("invalidProp");
        
        // Initially should rename if multiple types exist, but here 0 or 1 types -> shouldRename() false
        assertFalse(prop.shouldRename());

        // Invalidate property directly
        boolean changed = prop.invalidate();
        assertTrue("Invalidating active property should return true", changed);
        assertFalse("Invalidated property should report changed = false on subsequent invalidate", prop.invalidate());
        assertFalse(prop.shouldRename());
    }

    @Test
    public void testJSTypeSystemInvalidatingTypes() {
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        DisambiguateProperties<JSType> jsTypePass = DisambiguateProperties.forJSTypeSystem(compiler);
        
        // Test scheduling a renaming with an invalidating type
        DisambiguateProperties<JSType>.Property prop = jsTypePass.getProperty("testField");
        Node dummyNode = new Node(Token.NAME, "dummy");
        
        // This triggers scheduleRenaming -> isInvalidatingType -> invalidate
        boolean result = prop.scheduleRenaming(dummyNode, allType);
        assertTrue(result); // scheduleRenaming returns true even if invalidated, but marks skipRenaming=true
        assertTrue(prop.skipRenaming);
    }

    @Test
    public void testTypeWithPropertyPrototypeEdgeCase() {
        // Edge Case: field is "prototype" should always return null in JSTypeSystem
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType result = disambiguateProperties.getTypeWithProperty("prototype", objectType);
        assertNull("Property 'prototype' lookup should always return null", result);
    }

    @Test
    public void testTypeWithPropertyPrimitiveAutobox() {
        // Edge Case: Type is a primitive (e.g. NUMBER_TYPE) which autoboxes
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        // Should evaluate autobox and safely return without exception
        JSType result = disambiguateProperties.getTypeWithProperty("toFixed", numberType);
        // Can be null or object type depending on registry setup, ensuring no crash is the primary goal.
    }

    @Test
    public void testProcessWithEmptyNodes() {
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        
        // Ensures process method runs successfully on empty AST without NullPointerException
        disambiguateProperties.process(externs, root);
        assertTrue(disambiguateProperties.getRenamedTypesForTesting().isEmpty());
    }

    @Test
    public void testShouldRenameWithEquivalenceClasses() {
        DisambiguateProperties<JSType>.Property prop = disambiguateProperties.getProperty("propName");
        // Without adding types, allEquivalenceClasses().size() is 0 -> shouldRename() == false
        assertFalse(prop.shouldRename());
    }
}