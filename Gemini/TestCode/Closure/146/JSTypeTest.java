package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for JSType (Defects4J Closure-146b)
 * Focuses on Branch/Condition Coverage and Edge Cases (Nulls, Boundaries, Invalid States).
 */
public class JSTypeTest {

    private JSTypeRegistry registry;
    private JSType numberType;
    private JSType stringType;
    private JSType unknownType;
    private JSType allType;
    private JSType noType;
    private JSType nullType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new MockErrorReporter());
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    }

    // --- Equivalency & Equality Edge Cases ---

    @Test
    public void testIsEquivalent_NullHandling() {
        assertTrue(JSType.isEquivalent(null, null));
        assertFalse(JSType.isEquivalent(numberType, null));
        assertFalse(JSType.isEquivalent(null, numberType));
        assertTrue(JSType.isEquivalent(numberType, numberType));
    }

    @Test
    public void testEquals_InvalidAndValidTypes() {
        assertFalse(numberType.equals(null));
        assertFalse(numberType.equals("NotAJSType"));
        assertTrue(numberType.equals(numberType));
        assertFalse(numberType.equals(stringType));
    }

    @Test
    public void testIsEquivalentTo_ProxyObject() {
        // Dummy ProxyObjectType implementation or subclass simulation if applicable
        ProxyObjectType proxy = new ProxyObjectType(registry, numberType);
        assertTrue(proxy.isEquivalentTo(numberType));
        assertTrue(numberType.isEquivalentTo(proxy));
    }

    // --- DiffersFrom Branch Coverage ---

    @Test
    public void testDiffersFrom_Edges() {
        // Both non-unknown
        assertFalse(numberType.differsFrom(numberType));
        assertTrue(numberType.differsFrom(stringType));

        // One unknown, one known
        assertTrue(numberType.differsFrom(unknownType));
        assertTrue(unknownType.differsFrom(numberType));

        // Both unknown
        assertFalse(unknownType.differsFrom(unknownType));
    }

    // --- Greatest Subtype Lattice Branch Coverage ---

    @Test
    public void testGetGreatestSubtype_SpecialTypes() {
        // thatType is EmptyType or AllType
        assertEquals(noType, numberType.getGreatestSubtype(noType));
        assertEquals(allType, numberType.getGreatestSubtype(allType));

        // Unknown type branches
        assertEquals(unknownType, numberType.getGreatestSubtype(unknownType));
        assertEquals(numberType, numberType.getGreatestSubtype(numberType));

        // Subtype relationships
        assertEquals(numberType, numberType.getGreatestSubtype(allType)); // number is subtype of all
        assertEquals(numberType, allType.getGreatestSubtype(numberType));
    }

    @Test
    public void testGetGreatestSubtype_UnionAndObjects() {
        JSType union = registry.createUnionType(numberType, stringType);
        
        // unionType.meet(thatType) branch
        JSType result = union.getGreatestSubtype(numberType);
        assertNotNull(result);

        // Object & Object branch
        ObjectType obj1 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        ObjectType obj2 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        JSType objectMeet = obj1.getGreatestSubtype(obj2);
        assertNotNull(objectMeet);
    }

    // --- Equality / Inequality Type Pairs ---

    @Test
    public void testGetTypesUnderEquality_Branches() {
        // Union type handling in equality
        JSType union = registry.createUnionType(numberType, nullType);
        JSType.TypePair pair = numberType.getTypesUnderEquality(union);
        assertNotNull(pair);

        // FALSE outcome branch via testForEquality
        // number compared to string typically results in FALSE or UNKNOWN depending on implementation
        JSType.TypePair pairFalse = numberType.getTypesUnderEquality(stringType);
        assertNotNull(pairFalse);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTypesUnderEquality_IllegalStateSimulation() {
        // If testForEquality returns something unhandled (mocking via subclass if needed)
        JSType rogueType = new JSType(registry) {
            @Override public boolean isSubtype(JSType that) { return false; }
            @Override public <T> T visit(Visitor<T> visitor) { return null; }
            @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.BOTH; }
            @Override public TernaryValue testForEquality(JSType that) {
                return null; // Triggers unexpected switch flow if not handled
            }
        };
        rogueType.getTypesUnderEquality(numberType);
    }

    @Test
    public void testGetTypesUnderInequality_Branches() {
        JSType union = registry.createUnionType(numberType, nullType);
        JSType.TypePair pair = numberType.getTypesUnderInequality(union);
        assertNotNull(pair);

        JSType.TypePair pairTrue = nullType.getTypesUnderInequality(nullType);
        // Depending on nullType inequality implementation
        assertNotNull(pairTrue);
    }

    @Test
    public void testGetTypesUnderShallowInequality() {
        JSType.TypePair p1 = nullType.getTypesUnderShallowInequality(nullType);
        assertNull(p1.typeA);
        assertNull(p1.typeB);

        JSType.TypePair p2 = numberType.getTypesUnderShallowInequality(stringType);
        assertNotNull(p2.typeA);
        assertNotNull(p2.typeB);
    }

    // --- Resolution & Force Resolve Edge Cases ---

    @Test
    public void testResolve_LifecycleAndCaching() {
        MockResolvableType resolvableType = new MockResolvableType(registry);
        assertFalse(resolvableType.isResolved());

        // First resolution
        JSType resolved1 = resolvableType.resolve(new MockErrorReporter(), null);
        assertTrue(resolvableType.isResolved());
        assertEquals(resolvableType, resolved1);

        // Second resolution (hits resolved == true branch)
        JSType resolved2 = resolvableType.resolve(new MockErrorReporter(), null);
        assertEquals(resolved1, resolved2);

        // Clear resolved state
        resolvableType.clearResolved();
        assertFalse(resolvableType.isResolved());
    }

    @Test
    public void testResolve_NullResolveResultEdgeCase() {
        MockNullResolveType nullResolveType = new MockNullResolveType(registry);
        // First resolve will set resolveResult to null internally
        JSType result1 = nullResolveType.resolve(new MockErrorReporter(), null);
        // Second resolve hits resolved == true AND resolveResult == null branch -> returns UNKNOWN_TYPE
        JSType result2 = nullResolveType.resolve(new MockErrorReporter(), null);
        assertEquals(unknownType, result2);
    }

    @Test
    public void testForceResolve() {
        MockResolvableType resolvableType = new MockResolvableType(registry);
        JSType result = resolvableType.forceResolve(new MockErrorReporter(), null);
        assertNotNull(result);
        assertTrue(resolvableType.isResolved());
    }

    // --- Helper Mock Classes for Testing Abstract/Protected States ---

    private static class MockErrorReporter implements ErrorReporter {
        @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
        @Override public void error(String message, String sourceName, int line, int lineOffset) {}
        @Override public EvaluatorException runtimeError(String message, String sourceName, int line, int lineOffset) {
            return new EvaluatorException(message);
        }
    }

    private static class MockResolvableType extends JSType {
        MockResolvableType(JSTypeRegistry registry) { super(registry); }
        @Override public boolean isSubtype(JSType that) { return true; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.TRUE; }
        @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
    }

    private static class MockNullResolveType extends JSType {
        MockNullResolveType(JSTypeRegistry registry) { super(registry); }
        @Override public boolean isSubtype(JSType that) { return false; }
        @Override public <T> T visit(Visitor<T> visitor) { return null; }
        @Override public BooleanLiteralSet getPossibleToBooleanOutcomes() { return BooleanLiteralSet.FALSE; }
        @Override JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
            return null; // Forces resolveResult to be null
        }
    }
}