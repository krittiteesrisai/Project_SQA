package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for JSType (Closure-169b)
 * Focused on Branch/Condition Coverage and Edge Cases.
 */
public class JSTypeTest {

    TestJSType typeA;
    TestJSType typeB;
    JSTypeRegistry registry;

    // Concrete implementation of abstract JSType for testing purposes
    private static class TestJSType extends JSType {
        private static final long serialVersionUID = 1L;
        private boolean isUnknown = false;
        private boolean isNoType = false;
        private boolean isUnion = false;
        private String displayName = null;

        public TestJSType(JSTypeRegistry registry) {
            super(registry);
        }

        @Override
        public boolean isUnknownType() {
            return isUnknown;
        }

        @Override
        public boolean isNoType() {
            return isNoType;
        }

        @Override
        public boolean isUnionType() {
            return isUnion;
        }

        @Override
        public String getDisplayName() {
            return displayName;
        }

        @Override
        public BooleanLiteralSet getPossibleToBooleanOutcomes() {
            return BooleanLiteralSet.BOTH;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return null;
        }

        @Override
        JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
            return this;
        }

        @Override
        String toStringHelper(boolean forAnnotations) {
            return "TestJSType";
        }
    }

    @Before
    public void setUp() {
        // Initialize JSTypeRegistry with a basic ErrorReporter mock/stub if needed
        registry = new JSTypeRegistry(new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int charIndex) {}
            @Override
            public void error(String message, String sourceName, int line, int charIndex) {}
            @Override
            public EvaluatorException runtimeError(String message, String sourceName, int line, int charIndex) {
                return new EvaluatorException(message);
            }
        });
        typeA = new TestJSType(registry);
        typeB = new TestJSType(registry);
    }

    @Test
    public void testHasDisplayNameEdges() {
        // displayName is null -> false
        typeA.displayName = null;
        assertFalse(typeA.hasDisplayName());

        // displayName is empty -> false
        typeA.displayName = "";
        assertFalse(typeA.hasDisplayName());

        // displayName is valid -> true
        typeA.displayName = "ValidName";
        assertTrue(typeA.hasDisplayName());
    }

    @Test
    public void testIsEmptyTypeBranches() {
        assertFalse(typeA.isEmptyType());

        typeA.isNoType = true;
        assertTrue(typeA.isEmptyType());
    }

    @Test
    public void testIsEquivalentToAndCheckEquivalenceHelper() {
        // Same reference branch
        assertTrue(typeA.isEquivalentTo(typeA));

        // Unknown type branches with tolerateUnknowns = false
        typeA.isUnknown = true;
        typeB.isUnknown = false;
        assertFalse(typeA.isEquivalentTo(typeB));

        // Both unknown
        TestJSType typeC = new TestJSType(registry);
        typeC.isUnknown = true;
        assertTrue(typeA.isEquivalentTo(typeC));
    }

    @Test
    public void testTestForEqualityHelperEdges() {
        // All type / Unknown type interactions
        typeA.isUnknown = true;
        TernaryValue result = typeA.testForEqualityHelper(typeA, typeB);
        assertEquals(TernaryValue.UNKNOWN, result);

        // Empty type interactions
        typeA.isUnknown = false;
        typeA.isNoType = true;
        typeB.isNoType = true;
        assertEquals(TernaryValue.TRUE, typeA.testForEqualityHelper(typeA, typeB));

        typeB.isNoType = false;
        assertEquals(TernaryValue.UNKNOWN, typeA.testForEqualityHelper(typeA, typeB));
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome() {
        typeA.isUnknown = true;
        // outcome = true & UNKNOWN type -> CHECKED_UNKNOWN_TYPE
        JSType restricted = typeA.getRestrictedTypeGivenToBooleanOutcome(true);
        assertNotNull(restricted);
    }

    @Test
    public void testResolveAndCaching() {
        assertFalse(typeA.isResolved());

        // First resolve
        JSType resolved1 = typeA.resolve(null, null);
        assertTrue(typeA.isResolved());
        assertEquals(typeA, resolved1);

        // Second resolve (hits 'resolved = true' branch)
        JSType resolved2 = typeA.resolve(null, null);
        assertEquals(resolved1, resolved2);

        // Clear resolved
        typeA.clearResolved();
        assertFalse(typeA.isResolved());
    }

    @Test
    public void testForceResolve() {
        registry.setResolveMode(ResolveMode.LAZY);
        JSType forced = typeA.forceResolve(null, null);
        assertNotNull(forced);
        assertTrue(typeA.isResolved());
    }

    @Test
    public void testCanAssignToDefault() {
        // Default subtype check
        assertTrue(typeA.canAssignTo(typeA));
        
        TestJSType typeD = new TestJSType(registry);
        assertFalse(typeA.canAssignTo(typeD));
    }

    @Test
    public void testGetTypesUnderEqualityAndInequality() {
        TypePair eqPair = typeA.getTypesUnderEquality(typeB);
        assertNotNull(eqPair);
        assertEquals(typeA, eqPair.typeA);
        assertEquals(typeB, eqPair.typeB);

        TypePair ineqPair = typeA.getTypesUnderInequality(typeB);
        assertNotNull(ineqPair);
        assertEquals(typeA, ineqPair.typeA);
        assertEquals(typeB, ineqPair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowEqualityAndInequality() {
        TypePair shallowEq = typeA.getTypesUnderShallowEquality(typeB);
        assertNotNull(shallowEq);

        TypePair shallowIneq = typeA.getTypesUnderShallowInequality(typeB);
        assertNotNull(shallowIneq);
    }
}