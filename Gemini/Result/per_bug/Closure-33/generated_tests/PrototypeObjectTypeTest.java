package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.Property;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Set;

/**
 * JUnit 4 Test Suite for PrototypeObjectType (Closure-33b)
 * Focuses on Branch/Condition Coverage and Edge Cases (Null/Empty/Boundary).
 */
public class PrototypeObjectTypeTest {

    private JSTypeRegistry registry;
    private PrototypeObjectType objectType;

    @Before
    public void setUp() {
        // Initialize JSTypeRegistry using standard Rhino configuration
        ErrorReporter errorReporter = new MockErrorReporter();
        registry = new JSTypeRegistry(errorReporter);
        
        // Create standard PrototypeObjectType instance
        objectType = new PrototypeObjectType(registry, "TestClass", null);
    }

    @Test
    public void testConstructorAndBasicGetters() {
        assertNotNull(objectType);
        assertEquals("TestClass", objectType.getReferenceName());
        assertTrue(objectType.hasReferenceName());
        assertFalse(objectType.isNativeObjectType());
        assertNull(objectType.getConstructor());
    }

    @Test
    public void testDefineAndRemoveProperty() {
        String propName = "testProp";
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        // Define property (Branch: not already declared)
        boolean defined = objectType.defineProperty(propName, numType, false, null);
        assertTrue(defined);
        assertTrue(objectType.hasOwnProperty(propName));
        assertTrue(objectType.hasProperty(propName));
        assertEquals(1, objectType.getPropertiesCount());

        // Redefine same property (should handle old property / JS-doc scenarios safely)
        boolean redefined = objectType.defineProperty(propName, numType, false, null);
        assertTrue(redefined);

        // Remove property
        boolean removed = objectType.removeProperty(propName);
        assertTrue(removed);
        assertFalse(objectType.hasOwnProperty(propName));
        assertEquals(0, objectType.getPropertiesCount());
        
        // Remove non-existent property
        assertFalse(objectType.removeProperty("nonExistent"));
    }

    @Test
    public void testGetSlotWithPrototypeChain() {
        // Setup implicit prototype
        PrototypeObjectType protoType = new PrototypeObjectType(registry, "ProtoClass", null);
        String protoProp = "protoProp";
        JSType strType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        protoType.defineProperty(protoProp, strType, false, null);

        PrototypeObjectType childType = new PrototypeObjectType(registry, "ChildClass", protoType);
        
        // Verify slot lookup falls back to implicit prototype
        StaticSlot<JSType> slot = childType.getSlot(protoProp);
        assertNotNull(slot);
        assertEquals(strType, slot.getType());
        
        // Non-existent property
        assertNull(childType.getSlot("completelyUnknown"));
    }

    @Test
    public void testPropertyTypeChecksAndExterns() {
        String propName = "declaredProp";
        JSType boolType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        
        objectType.defineProperty(propName, boolType, false, null);
        
        assertTrue(objectType.isPropertyTypeDeclared(propName));
        assertFalse(objectType.isPropertyTypeInferred(propName));
        assertEquals(boolType, objectType.getPropertyType(propName));
        
        // Test inferred property
        String inferredProp = "inferredProp";
        objectType.defineInferredProperty(inferredProp, boolType, null);
        assertFalse(objectType.isPropertyTypeDeclared(inferredProp));
        assertTrue(objectType.isPropertyTypeInferred(inferredProp));

        // Unknown property checks
        assertFalse(objectType.isPropertyTypeDeclared("unknown"));
        assertFalse(objectType.isPropertyTypeInferred("unknown"));
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), objectType.getPropertyType("unknown"));
        assertFalse(objectType.isPropertyInExterns("unknown"));
    }

    @Test
    public void testContextMatchesAndUnboxes() {
        // Object context is always true
        assertTrue(objectType.matchesObjectContext());
        
        // Regular object shouldn't match primitive contexts unless overridden
        assertFalse(objectType.matchesNumberContext());
        assertFalse(objectType.matchesStringContext());
        assertFalse(objectType.canBeCalled());

        // Unboxes to self or default super implementation for standard object
        assertEquals(objectType, objectType.unboxesTo());
    }

    @Test
    public void testPrettyPrintAndToStringHelper() {
        // Default toString without reference name and pretty print
        PrototypeObjectType anonObject = new PrototypeObjectType(registry, null, null);
        assertEquals("{...}", anonObject.toStringHelper(false));
        assertEquals("?", anonObject.toStringHelper(true));

        // Pretty print branch
        anonObject.setPrettyPrint(true);
        assertTrue(anonObject.isPrettyPrint());
        
        anonObject.defineProperty("p1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        String prettyStr = anonObject.toStringHelper(false);
        assertTrue(prettyStr.contains("p1"));
    }

    @Test
    public void testMatchConstraintRecordType() {
        // Test matching record type constraint (Closure-33b critical logic)
        // Construct a mock or dummy record type via registry/RecordType if possible,
        // Or pass a record type constraint object.
        ObjectType recordConstraint = registry.createRecordType(
            com.google.common.collect.ImmutableMap.of(
                "constrainedProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE)
            )
        );

        objectType.matchConstraint(recordConstraint);
        
        // Verify property was inferred due to constraint matching
        assertTrue(objectType.hasProperty("constrainedProp"));
        assertTrue(objectType.isPropertyTypeInferred("constrainedProp"));
    }

    @Test
    public void testOwnerFunctionAndReferenceName() {
        assertNull(objectType.getOwnerFunction());
        
        // Anonymous with owner function
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, null);
        FunctionType mockFunc = registry.createFunctionType(
            registry.getNativeType(JSTypeNative.NO_TYPE),
            ImmutableList.of()
        );
        anon.setOwnerFunction(mockFunc);
        // Owner function reference name formatting
        // Should not throw and handle gracefully
        assertNotNull(anon.getReferenceName());
    }

    // Mock implementation for ErrorReporter required by JSTypeRegistry
    private static class MockErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {}
        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {}
        @Override
        public EvaluatorException runtimeError(String message, String sourceName, int line, int lineOffset) {
            return new EvaluatorException(message);
        }
    }
}