package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for PrototypeObjectType (Closure-166b).
 * Achieves high branch/condition coverage and tests critical edge cases.
 */
public class PrototypeObjectTypeTest {

    private JSTypeRegistry registry;
    private PrototypeObjectType objectType;
    private ObjectType nativeObjectPrototype;

    @Before
    public void setUp() {
        // Initialize JSTypeRegistry using standard constructor
        registry = new JSTypeRegistry(new MockErrorReporter());
        nativeObjectPrototype = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
        objectType = new PrototypeObjectType(registry, "TestClass", nativeObjectPrototype);
    }

    @Test
    public void testConstructorAndBasicProperties() {
        assertNotNull(objectType);
        assertEquals("TestClass", objectType.getReferenceName());
        assertTrue(objectType.hasReferenceName());
        assertFalse(objectType.isNativeObjectType());
        assertNull(objectType.getConstructor());
        assertNotNull(objectType.getImplicitPrototype());
    }

    @Test
    public void testAnonymousAndOwnerFunctionReferenceName() {
        // Anonymous class (className = null)
        PrototypeObjectType anonType = new PrototypeObjectType(registry, null, nativeObjectPrototype);
        assertFalse(anonType.hasReferenceName());
        assertNull(anonType.getReferenceName());

        // Test with owner function (simulated via subclass or direct invocation if accessible)
        // Since ownerFunction can be set, let's verify default null state
        assertNull(anonType.getOwnerFunction());
    }

    @Test
    public void testDefineAndGetProperty() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node propNode = new Node(Token.NAME);

        // Define a new property
        boolean defined = objectType.defineProperty("nameProp", stringType, false, propNode);
        assertTrue(defined);

        // Define duplicate declared property should return false
        boolean definedAgain = objectType.defineProperty("nameProp", stringType, false, propNode);
        assertFalse(definedAgain);

        // Check property details
        assertTrue(objectType.hasProperty("nameProp"));
        assertTrue(objectType.hasOwnProperty("nameProp"));
        assertEquals(stringType, objectType.getPropertyType("nameProp"));
        assertTrue(objectType.isPropertyTypeDeclared("nameProp"));
        assertFalse(objectType.isPropertyTypeInferred("nameProp"));
        assertEquals(propNode, objectType.getPropertyNode("nameProp"));

        // Non-existent property
        assertFalse(objectType.hasProperty("nonExistent"));
        assertFalse(objectType.hasOwnProperty("nonExistent"));
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), objectType.getPropertyType("nonExistent"));
        assertNull(objectType.getPropertyNode("nonExistent"));
        assertFalse(objectType.isPropertyTypeDeclared("nonExistent"));
        assertFalse(objectType.isPropertyTypeInferred("nonExistent"));
    }

    @Test
    public void testInferredProperty() {
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineInferredProperty("inferredProp", numType, null);

        assertTrue(objectType.hasProperty("inferredProp"));
        assertTrue(objectType.isPropertyTypeInferred("inferredProp"));
        assertFalse(objectType.isPropertyTypeDeclared("inferredProp"));
    }

    @Test
    public void testRemoveProperty() {
        JSType boolType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        objectType.defineProperty("flag", boolType, true, null);

        assertTrue(objectType.hasOwnProperty("flag"));
        boolean removed = objectType.removeProperty("flag");
        assertTrue(removed);
        assertFalse(objectType.hasOwnProperty("flag"));

        // Remove non-existent
        assertFalse(objectType.removeProperty("nonExistent"));
    }

    @Test
    public void testGetPropertiesCount() {
        // Initially 0 local properties, but inherits from nativeObjectPrototype
        int initialCount = objectType.getPropertiesCount();

        objectType.defineProperty("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("p2", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

        assertEquals(initialCount + 2, objectType.getPropertiesCount());

        // Test with null implicit prototype
        PrototypeObjectType nullProtoObj = new PrototypeObjectType(registry, "NullProto", null, true);
        assertEquals(0, nullProtoObj.getPropertiesCount());
        nullProtoObj.defineProperty("a", registry.getNativeType(JSTypeNative.VOID_TYPE), false, null);
        assertEquals(1, nullProtoObj.getPropertiesCount());
    }

    @Test
    public void testGetOwnPropertyNames() {
        objectType.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("y", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);

        Set<String> names = objectType.getOwnPropertyNames();
        assertTrue(names.contains("x"));
        assertTrue(names.contains("y"));
        assertEquals(2, names.size());
    }

    @Test
    public void testJSDocInfoHandling() {
        JSDocInfo info = new JSDocInfo();
        // Set JSDoc info on non-existent property triggers defineInferredProperty
        objectType.setPropertyJSDocInfo("docProp", info);
        assertNotNull(objectType.getOwnPropertyJSDocInfo("docProp"));
        assertEquals(info, objectType.getOwnPropertyJSDocInfo("docProp"));

        // Set null JSDocInfo
        objectType.setPropertyJSDocInfo("docProp", null);
        
        // Property exists case
        objectType.defineProperty("explicitDoc", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        objectType.setPropertyJSDocInfo("explicitDoc", info);
        assertEquals(info, objectType.getOwnPropertyJSDocInfo("explicitDoc"));
    }

    @Test
    public void testContextMatchesAndUnboxing() {
        // Object context
        assertTrue(objectType.matchesObjectContext());

        // Number context (default object type doesn't match number context unless specific type)
        assertFalse(objectType.matchesNumberContext());

        // String context (isTheObjectType() is true for standard object prototype, let's test specific contexts)
        assertTrue(objectType.matchesStringContext());

        // Unboxing
        assertEquals(objectType, objectType.unboxesTo()); // defaults to super.unboxesTo()

        // Test String Object Type unboxing
        PrototypeObjectType strObj = new PrototypeObjectType(registry, "StringObj", registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_PROTOTYPE));
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), strObj.unboxesTo());
    }

    @Test
    public void testCanBeCalled() {
        assertFalse(objectType.canBeCalled());
        // Regexp type check
        PrototypeObjectType regexpObj = new PrototypeObjectType(registry, "RegExpObj", registry.getNativeObjectType(JSTypeNative.REGEXP_PROTOTYPE));
        // isRegexpType depends on registry setup, but we can verify canBeCalled method branch
        assertFalse(regexpObj.canBeCalled());
    }

    @Test
    public void testToStringHelperAndPrettyPrint() {
        // Has reference name
        assertEquals("TestClass", objectType.toStringHelper(false));
        assertEquals("TestClass", objectType.toStringHelper(true));

        // Anonymous without pretty print
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, nativeObjectPrototype);
        assertEquals("{...}", anon.toStringHelper(false));
        assertEquals("?", anon.toStringHelper(true));

        // Pretty print enabled
        anon.setPrettyPrint(true);
        assertTrue(anon.isPrettyPrint());
        anon.defineProperty("propA", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        
        String prettyStr = anon.toStringHelper(false);
        assertTrue(prettyStr.contains("propA"));
        assertTrue(prettyStr.startsWith("{"));
        assertTrue(prettyStr.endsWith("}"));
    }

    @Test
    public void testMatchRecordTypeConstraint() {
        ObjectType recordType = registry.createRecordType(
            com.google.common.collect.ImmutableMap.of("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE))
        );

        objectType.matchConstraint(recordType);
        assertTrue(objectType.hasProperty("a"));
        assertTrue(objectType.isPropertyTypeInferred("a"));
    }

    @Test
    public void testResolveInternal() {
        objectType.defineProperty("resProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        JSType resolved = objectType.resolveInternal(new MockErrorReporter(), null);
        assertEquals(objectType, resolved);
    }

    // Minimal Mock ErrorReporter for testing
    private static class MockErrorReporter implements ErrorReporter {
        @JSFunction
        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {}

        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {}

        @Override
        public EvaluatorException runtimeError(String message, String sourceName, int line, int lineOffset) {
            return new EvaluatorException(message, sourceName, line, lineOffset, 0);
        }
    }
}