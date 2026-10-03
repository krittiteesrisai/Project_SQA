package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test suite for Defects4J Closure-167 (JSType).
 */
public class JSTypeTest {

    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;

    @Before
    public void setUp() {
        errorReporter = new SimpleErrorReporter();
        registry = new JSTypeRegistry(errorReporter);
    }

    @Test
    public void testHasDisplayName_NullAndEmpty() {
        // Default JSType returns null for getDisplayName() -> hasDisplayName() should be false
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertFalse(unknownType.hasDisplayName());
    }

    @Test
    public void testIsEmptyType_Branches() {
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        assertTrue(noType.isEmptyType());

        JSType noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
        assertTrue(noObjectType.isEmptyType());

        JSType leastFuncType = registry.getNativeType(JSTypeNative.LEAST_FUNCTION_TYPE);
        assertTrue(leastFuncType.isEmptyType());

        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        assertFalse(allType.isEmptyType());
    }

    @Test
    public void testIsStringAndIsNumber() {
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(stringType.isString());
        assertFalse(stringType.isNumber());

        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(numberType.isNumber());
        assertFalse(numberType.isString());
    }

    @Test
    public void testIsGlobalThisType() {
        JSType globalThis = registry.getNativeType(JSTypeNative.GLOBAL_THIS);
        assertTrue(globalThis.isGlobalThisType());

        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(numberType.isNumberObjectType());
        assertFalse(numberType.isGlobalThisType());
    }

    @Test
    public void testTestForEqualityHelper_EdgeCases() {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);

        // Unknown type equality should return UNKNOWN
        assertEquals(TernaryValue.UNKNOWN, unknownType.testForEquality(numberType));
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(unknownType));

        // Both empty types should return TRUE
        assertEquals(TernaryValue.TRUE, noType.testForEquality(noType));

        // One empty type should return UNKNOWN
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(noType));
    }

    @Test
    public void testCanTestForShallowEqualityWith() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);

        // Empty type scenario
        assertTrue(numberType.canTestForShallowEqualityWith(noType));
        assertTrue(noType.canTestForShallowEqualityWith(numberType));

        // General distinct types
        assertFalse(numberType.canTestForShallowEqualityWith(stringType));
    }

    @Test
    public void testGetGreatestSubtype_Branches() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);

        // Equivalent types
        assertEquals(numberType, numberType.getGreatestSubtype(numberType));

        // Unknown type involvement
        assertEquals(unknownType, numberType.getGreatestSubtype(unknownType));

        // Subtype relations
        assertEquals(numberType, numberType.getGreatestSubtype(allType));
    }

    @Test
    public void testFilterNoResolvedType() {
        JSType noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
        JSType filtered = JSType.filterNoResolvedType(noResolvedType);
        assertNotNull(filtered);
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        // Object type has possible outcomes containing TRUE
        JSType restrictedTrue = objectType.getRestrictedTypeGivenToBooleanOutcome(true);
        assertEquals(objectType, restrictedTrue);

        // Object type does not contain FALSE in typical simple outcomes, or verify behavior
        JSType restrictedFalse = objectType.getRestrictedTypeGivenToBooleanOutcome(false);
        assertNotNull(restrictedFalse);
    }

    @Test
    public void testDiffersFrom() {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        // One unknown, one not -> true (XOR)
        assertTrue(unknownType.differsFrom(numberType));
        assertTrue(numberType.differsFrom(unknownType));

        // Neither unknown, same type -> false
        assertFalse(numberType.differsFrom(numberType));
    }

    @Test
    public void testTypePairAndEqualityMethods() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

        JSType.TypePair pair = new JSType.TypePair(numberType, stringType);
        assertEquals(numberType, pair.typeA);
        assertEquals(stringType, pair.typeB);

        assertFalse(numberType.equals(stringType));
        assertTrue(numberType.equals(numberType));
        assertFalse(numberType.equals(null));
        assertFalse(numberType.equals("NotAJSType"));

        assertNotNull(numberType.hashCode());
        assertNotNull(numberType.toDebugHashCodeString());
        assertNotNull(numberType.toAnnotationString());
    }

    @Test
    public void testContextMatchesAndProperties() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        
        assertTrue(numberType.matchesInt32Context());
        assertTrue(numberType.matchesUint32Context());

        // Find property type on non-object / primitive
        assertNull(numberType.findPropertyType("nonExistentProp"));
        assertNull(numberType.autoboxesTo());
        assertNull(numberType.unboxesTo());
        assertNull(numberType.toObjectType());
    }

    @Test
    public void testCanAssignAndSubtypeHelpers() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);

        assertTrue(numberType.canAssignTo(allType));
        assertFalse(allType.canAssignTo(numberType));
        assertTrue(numberType.isSubtype(allType));
    }

    @Test
    public void testTypesUnderInequalityAndShallow() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);

        JSType.TypePair inequalityPair = numberType.getTypesUnderInequality(numberType);
        assertNotNull(inequalityPair);

        JSType.TypePair shallowIneq = nullType.getTypesUnderShallowInequality(nullType);
        assertNull(shallowIneq.typeA);
        assertNull(shallowIneq.typeB);
    }
}