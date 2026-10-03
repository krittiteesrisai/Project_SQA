package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class PrototypeObjectTypeTest {

    private JSTypeRegistry registry;
    private PrototypeObjectType objectType;
    private ObjectType nativeObjectPrototype;

    @Before
    public void setUp() {
        // Initialize JSTypeRegistry using standard constructor available in Closure compiler
        ErrorReporter errorReporter = new SimpleErrorReporter();
        registry = new JSTypeRegistry(errorReporter);
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
        assertNull(objectType.getOwnerFunction());
    }

    @Test
    public void testAnonymousAndNullImplicitPrototype() {
        // Test anonymous class (className = null) with null implicit prototype (defaults to OBJECT_TYPE)
        PrototypeObjectType anonType = new PrototypeObjectType(registry, null, null);
        assertNull(anonType.getReferenceName());
        assertFalse(anonType.hasReferenceName());
        assertNotNull(anonType.getImplicitPrototype());
    }

    @Test
    public void testDefineAndGetSlotAndProperty() {
        String propName = "myProp";
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node propNode = new Node(Token.NAME);

        // Define property
        boolean defined = objectType.defineProperty(propName, stringType, false, propNode);
        assertTrue(defined);

        // Redefine same property should fail
        boolean definedAgain = objectType.defineProperty(propName, stringType, false, propNode);
        assertFalse(definedAgain);

        // Check slot and properties
        StaticSlot<JSType> slot = objectType.getSlot(propName);
        assertNotNull(slot);
        assertTrue(objectType.hasProperty(propName));
        assertTrue(objectType.hasOwnProperty(propName));
        assertEquals(stringType, objectType.getPropertyType(propName));
        assertFalse(objectType.isPropertyTypeInferred(propName));
        assertTrue(objectType.isPropertyTypeDeclared(propName));
        assertEquals(propNode, objectType.getPropertyNode(propName));

        // Get own property names
        Set<String> ownNames = objectType.getOwnPropertyNames();
        assertTrue(ownNames.contains(propName));

        // Remove property
        boolean removed = objectType.removeProperty(propName);
        assertTrue(removed);
        assertFalse(objectType.hasOwnProperty(propName));
    }

    @Test
    public void testImplicitPrototypeSlotResolution() {
        // Define property on prototype
        String protoProp = "protoProp";
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        nativeObjectPrototype.defineProperty(protoProp, numType, true, null);

        // Child object should inherit slot from implicit prototype
        StaticSlot<JSType> slot = objectType.getSlot(protoProp);
        assertNotNull(slot);
        assertTrue(objectType.hasProperty(protoProp));
        assertFalse(objectType.hasOwnProperty(protoProp)); // Not own property
        assertEquals(numType, objectType.getPropertyType(protoProp));

        // Cleanup
        nativeObjectPrototype.removeProperty(protoProp);
    }

    @Test
    public void testPropertiesCount() {
        assertEquals(nativeObjectPrototype.getPropertiesCount(), objectType.getPropertiesCount());

        // Add local property
        objectType.defineProperty("local1", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        int countBefore = objectType.getPropertiesCount();
        assertTrue(countBefore > 0);

        // Test with null implicit prototype
        PrototypeObjectType isolatedType = new PrototypeObjectType(registry, "Isolated", null, true);
        isolatedType.defineProperty("p1", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertEquals(1, isolatedType.getPropertiesCount());
    }

    @Test
    public void testPropertyJSDocInfo() {
        String propName = "docProp";
        JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        // Setting JSDocInfo on non-existent property should define it as inferred
        JSDocInfo jsDocInfo = new JSDocInfo();
        objectType.setPropertyJSDocInfo(propName, jsDocInfo);

        assertTrue(objectType.hasOwnProperty(propName));
        assertEquals(jsDocInfo, objectType.getOwnPropertyJSDocInfo(propName));

        // Setting null JSDocInfo should do nothing
        objectType.setPropertyJSDocInfo(propName, null);
    }

    @Test
    public void testContextMatching() {
        // Object context is always true
        assertTrue(objectType.matchesObjectContext());

        // Number, String, Boolean contexts based on types or native overrides
        assertFalse(objectType.matchesNumberContext());
        assertFalse(objectType.matchesStringContext());
    }

    @Test
    public void testUnboxesTo() {
        assertEquals(objectType, objectType.unboxesTo());
    }

    @Test
    public void testCanBeCalled() {
        // Default PrototypeObjectType cannot be called (unless RegExp)
        assertFalse(objectType.canBeCalled());
    }

    @Test
    public void testToStringHelperCases() {
        // Case 1: has reference name
        assertEquals("TestClass", objectType.toStringHelper(false));

        // Case 2: pretty print with properties (<= MAX_PRETTY_PRINTED_PROPERTIES)
        objectType = new PrototypeObjectType(registry, null, null); // anonymous, no reference name
        objectType.setPrettyPrint(true);
        objectType.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);

        String prettyStr = objectType.toStringHelper(false);
        assertTrue(prettyStr.contains("a:"));
        assertTrue(prettyStr.contains("b:"));

        // Case 3: pretty print exceeding MAX_PRETTY_PRINTED_PROPERTIES (4)
        objectType.defineProperty("c", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        objectType.defineProperty("d", registry.getNativeType(JSTypeNative.VOID_TYPE), false, null);
        objectType.defineProperty("e", registry.getNativeType(JSTypeNative.NULL_TYPE), false, null);
        
        String overflowStr = objectType.toStringHelper(false);
        assertTrue(overflowStr.contains("..."));

        // Case 4: default toStringHelper when prettyPrint is false and no reference name
        objectType.setPrettyPrint(false);
        assertEquals("{...}", objectType.toStringHelper(false));
    }

    @Test
    public void testIsSubtypeWithUnknownAndPrototypeChain() {
        // Unknown type scenarios
        ObjectType unknownType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        // Setting implicit prototype to unknown type makes prototype chain unknown
        PrototypeObjectType unknownProtoType = new PrototypeObjectType(registry, "UnknownProto", unknownType);
        
        assertTrue(unknownProtoType.isSubtype(objectType));
    }

    @Test
    public void testResolveInternal() {
        objectType.defineProperty("resolveProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        ErrorReporter reporter = new SimpleErrorReporter();
        
        JSType resolved = objectType.resolveInternal(reporter, registry);
        assertNotNull(resolved);
        assertEquals(objectType, resolved);
    }
}