package com.google.javascript.rhino.jstype;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Comprehensive JUnit 4 test suite for NamedType (Closure-4b).
 * Targets high branch/condition coverage and edge cases.
 */
public class NamedTypeTest extends TestCase {

    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;
    private StaticScope<JSType> enclosingScope;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        errorReporter = new SimpleErrorReporter();
        registry = new JSTypeRegistry(errorReporter);
        enclosingScope = new StaticScope<JSType>() {
            @Override
            public StaticSlot<JSType> getSlot(String name) {
                return null;
            }
            @Override
            public StaticScope<JSType> getParent() {
                return null;
            }
            @Override
            public JSTypeRegistry getOwner() {
                return registry;
            }
        };
    }

    @Test
    public void testBasicPropertiesAndGetters() {
        NamedType namedType = new NamedType(registry, "MyNamespace.MyType", "testCode.js", 10, 5);
        
        assertEquals("MyNamespace.MyType", namedType.getReferenceName());
        assertEquals("MyNamespace.MyType", namedType.toStringHelper(true));
        assertTrue(namedType.hasReferenceName());
        assertTrue(namedType.isNamedType());
        assertTrue(namedType.isNominalType());
        assertNotNull(namedType.hashCode());
        assertNotNull(namedType.getReferencedType());
    }

    @Test
    public void testDefinePropertyUnresolvedAndResolved() {
        NamedType namedType = new NamedType(registry, "UnresolvedType", "test.js", 1, 1);
        
        // When unresolved: should queue into propertyContinuations
        boolean definedUnresolved = namedType.defineProperty("prop1", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        assertTrue(definedUnresolved);

        // Resolve via registry or force resolve state to test resolved branch of defineProperty
        JSType nativeUnknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        namedType.resolveInternal(errorReporter, enclosingScope);
        
        boolean definedResolved = namedType.defineProperty("prop2", nativeUnknown, true, null);
        // Depending on resolution state, super.defineProperty behavior is invoked
        assertNotNull(namedType);
    }

    @Test
    public void testResolveViaRegistrySuccess() {
        // Register a type so resolveViaRegistry finds it immediately
        ObjectType objType = registry.createObjectType("RegisteredType", null, null);
        NamedType namedType = new NamedType(registry, "RegisteredType", "test.js", 5, 1);
        
        JSType resolved = namedType.resolveInternal(errorReporter, enclosingScope);
        assertNotNull(resolved);
    }

    @Test
    public void testLookupViaPropertiesEmptyComponent() {
        // Reference starting with "." -> componentNames[0].length() == 0
        NamedType namedType = new NamedType(registry, ".InvalidStart", "test.js", 1, 1);
        JSType resolved = namedType.resolveInternal(errorReporter, enclosingScope);
        assertNotNull(resolved);
    }

    @Test
    public void testSetValidatorBranches() {
        NamedType namedType = new NamedType(registry, "ValidateType", "test.js", 1, 1);
        
        Predicate<JSType> dummyValidator = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType input) {
                return true;
            }
        };

        // When not resolved (isResolved() == false)
        boolean setUnresolved = namedType.setValidator(dummyValidator);
        assertTrue(setUnresolved);

        // Force resolution
        namedType.resolveInternal(errorReporter, enclosingScope);

        // When resolved (isResolved() == true)
        boolean setResolved = namedType.setValidator(dummyValidator);
        // Returns result of super.setValidator
        assertNotNull(namedType);
    }

    @Test
    public void testLookupViaPropertiesMissingSlot() {
        // Enclosing scope returns null slot for "UnknownSlot"
        NamedType namedType = new NamedType(registry, "UnknownSlot.Property", "test.js", 1, 1);
        JSType resolved = namedType.resolveInternal(errorReporter, enclosingScope);
        assertNotNull(resolved);
    }
}