package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

/**
 * Senior JUnit 4 Test Automation Suite for JSType (Closure-82b).
 * Focuses on Branch/Condition Coverage and Edge Cases (Nulls, Boundaries, States).
 */
public class JSTypeTest {

    private JSTypeRegistry registry;
    private JSType numberType;
    private JSType stringType;
    private JSType nullType;
    private JSType voidType;
    private JSType unknownType;
    private JSType allType;
    private JSType noType;
    private JSType noObjectType;
    private JSType noResolvedType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new SimpleErrorReporter());
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
        noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    }

    @Test
    public void testIsEquivalentEdgeCases() {
        // Test null conditions: (typeA == null || typeB == null) ? typeA == typeB
        assertTrue(JSType.isEquivalent(null, null));
        assertFalse(JSType.isEquivalent(numberType, null));
        assertFalse(JSType.isEquivalent(null, numberType));
        assertTrue(JSType.isEquivalent(numberType, numberType));
        assertFalse(JSType.isEquivalent(numberType, stringType));

        // Test equals & Object instanceof JSType branch
        assertTrue(numberType.equals(numberType));
        assertFalse(numberType.equals("NotAJSType"));
        assertFalse(numberType.equals(null));
    }

    @Test
    public void testTestForEqualityHelperBranches() {
        // bType or aType is AllType, UnknownType, or NoResolvedType -> UNKNOWN
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(unknownType));
        assertEquals(TernaryValue.UNKNOWN, unknownType.testForEquality(numberType));
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(allType));
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(noResolvedType));

        // Empty types branches (aIsEmpty || bIsEmpty)
        assertEquals(TernaryValue.TRUE, noType.testForEquality(noType));
        assertEquals(TernaryValue.UNKNOWN, noType.testForEquality(numberType));
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(noType));

        // Function type branches
        JSType fnType = registry.createFunctionType(numberType, null);
        // Function compared to non-intersecting type (e.g. NoType/NoObjectType via meet)
        TernaryValue fnEqResult = fnType.testForEquality(noType);
        assertNotNull(fnEqResult);

        // Union type / Enum element type delegation branch
        JSType unionType = registry.createUnionType(numberType, stringType);
        assertEquals(unionType.testForEquality(numberType), numberType.testForEquality(unionType));
    }

    @Test
    public void testGetGreatestSubtypeBranches() {
        // Equivalent types
        assertEquals(numberType, numberType.getGreatestSubtype(numberType));

        // Unknown type branches
        assertEquals(unknownType, numberType.getGreatestSubtype(unknownType));
        assertEquals(unknownType, unknownType.getGreatestSubtype(stringType));
        assertEquals(numberType, numberType.getGreatestSubtype(numberType)); // equal check when unknown

        // Subtype relationships
        // numberType is a subtype of allType
        assertEquals(numberType, numberType.getGreatestSubtype(allType));
        assertEquals(numberType, allType.getGreatestSubtype(numberType));

        // Union type meet branch
        JSType unionType = registry.createUnionType(numberType, stringType);
        JSType resultMeet = unionType.getGreatestSubtype(numberType);
        assertNotNull(resultMeet);

        // Both are object types branch
        JSType obj1 = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType obj2 = registry.getNativeType(JSTypeNative.LEAN_OBJECT_TYPE);
        JSType objectMeet = obj1.getGreatestSubtype(obj2);
        assertEquals(noObjectType, objectMeet);

        // Disjoint non-object types
        assertEquals(noType, numberType.getGreatestSubtype(stringType));
    }

    @Test
    .registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
    public void testFilterNoResolvedType() {
        // Direct NoResolvedType
        assertEquals(noResolvedType, JSType.filterNoResolvedType(noResolvedType));

        // UnionType containing NoResolvedType
        JSType unionWithUnresolved = registry.createUnionType(numberType, noResolvedType);
        JSType filtered = JSType.filterNoResolvedType(unionWithUnresolved);
        assertNotNull(filtered);

        // Normal type without filtering needed
        assertEquals(numberType, JSType.filterNoResolvedType(numberType));
    }

    @Test
    public void testDiffersFrom() {
        // Neither is unknown, equivalent -> false
        assertFalse(numberType.differsFrom(numberType));
        // Neither is unknown, not equivalent -> true
        assertTrue(numberType.differsFrom(stringType));
        // One is unknown -> true (using XOR)
        assertTrue(numberType.differsFrom(unknownType));
        assertTrue(unknownType.differsFrom(numberType));
        // Both are unknown -> false
        assertFalse(unknownType.differsFrom(unknownType));
    }

    @Test
    public void testResolveLifecycleAndEdgeStates() {
        // Initially not resolved
        assertFalse(numberType.isResolved());

        // Resolve test with null scope/error reporter (or basic mock-free execution)
        SimpleErrorReporter reporter = new SimpleErrorReporter();
        
        // Clear resolved state check
        numberType.clearResolved();
        assertFalse(numberType.isResolved());

        // Test safeResolve helper with null and valid type
        assertNull(JSType.safeResolve(null, reporter, null));
        
        // Test hashCode and debug string
        assertTrue(numberType.toDebugHashCodeString().startsWith("{"));
        assertTrue(numberType.toDebugHashCodeString().endsWith("}"));
        assertEquals(System.identityHashCode(numberType), numberType.hashCode());
    }

    @Test
    public void testContextAndBooleanOutcomes() {
        // Test basic boolean outcomes and restricted types
        assertNotNull(numberType.getPossibleToBooleanOutcomes());
        assertEquals(numberType, numberType.getRestrictedTypeGivenToBooleanOutcome(true));
        
        // Test property and assignment helpers
        assertNull(numberType.findPropertyType("nonExistentProp"));
        assertTrue(numberType.canAssignTo(allType));
        assertFalse(numberType.canBeCalled());
    }
}