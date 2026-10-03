package com.google.javascript.rhino.jstype;

import com.google.common.collect.Sets;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UnionTypeTest {

    private JSTypeRegistry registry;
    private JSType numberType;
    private JSType stringType;
    private JSType booleanType;
    private JSType nullType;
    private JSType voidType;
    private JSType unknownType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new SimpleErrorReporter());
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    }

    @Test
    public void testGetAlternatesAndContains() {
        Set<JSType> types = Sets.newHashSet(numberType, stringType);
        UnionType unionType = new UnionType(registry, types);

        assertNotNull(unionType.getAlternates());
        assertTrue(unionType.contains(numberType));
        assertTrue(unionType.contains(stringType));
        assertFalse(unionType.contains(booleanType));
    }

    @Test
    public void testContextMatches() {
        UnionType numStrUnion = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        assertTrue(numStrUnion.matchesNumberContext());
        assertTrue(numStrUnion.matchesStringContext());
        assertTrue(numStrUnion.matchesObjectContext());

        UnionType boolUnion = new UnionType(registry, Sets.newHashSet(booleanType));
        assertTrue(boolUnion.matchesNumberContext()); // Generous logic in implementation
        assertFalse(boolUnion.matchesObjectContext()); // boolean is not nullable/object context usually
    }

    @Test
    public void testCanAssignTo() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        // Test unknown type short-circuit
        UnionType unknownUnion = new UnionType(registry, Sets.newHashSet(unknownType, numberType));
        assertTrue(unknownUnion.canAssignTo(numberType));
        
        assertFalse(unionType.canAssignTo(booleanType));
    }

    @Test
    public void testCanBeCalled() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType));
        assertFalse(unionType.canBeCalled());
    }

    @Test
    public void testIsNullableAndIsUnknownAndIsObject() {
        UnionType numUnion = new UnionType(registry, Sets.newHashSet(numberType));
        assertFalse(numUnion.isNullable());
        assertFalse(numUnion.isUnknownType());
        assertTrue(numUnion.isObject()); // In Closure compiler terms depending on setup, let's verify basic flags

        UnionType unknownUnion = new UnionType(registry, Sets.newHashSet(unknownType));
        assertTrue(unknownUnion.isUnknownType());
    }

    @Test
    public void testEqualsAndHashCode() {
        UnionType union1 = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        UnionType union2 = new UnionType(registry, Sets.newHashSet(stringType, numberType));
        UnionType union3 = new UnionType(registry, Sets.newHashSet(numberType));

        assertEquals(union1, union2);
        assertEquals(union1.hashCode(), union2.hashCode());
        assertNotEquals(union1, union3);
        assertNotEquals(union1, "NotAUnionType");
    }

    @Test
    public void testIsUnionType() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType));
        assertTrue(unionType.isUnionType());
    }

    @Test
    public void testRestrictByNotNullOrUndefined() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, nullType));
        JSType restricted = unionType.restrictByNotNullOrUndefined();
        assertNotNull(restricted);
    }

    @Test
    public void testGetRestrictedUnion() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        JSType restricted = unionType.getRestrictedUnion(numberType);
        assertNotNull(restricted);
    }

    @Test
    public void testToString() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        String str = unionType.toString();
        assertNotNull(str);
        assertTrue(str.contains("number") || str.contains("string"));
    }

    @Test
    public void testGetLeastSupertype() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        JSType superType = unionType.getLeastSupertype(numberType);
        assertNotNull(superType);
    }

    @Test
    public void testMeetWithUnionAndNonUnion() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        JSType met = unionType.meet(numberType);
        assertNotNull(met);

        UnionType unionType2 = new UnionType(registry, Sets.newHashSet(numberType));
        JSType metUnion = unionType.meet(unionType2);
        assertNotNull(metUnion);
    }

    @Test
    public void testTestForEquality() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        TernaryValue val = unionType.testForEquality(numberType);
        assertNotNull(val);
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        JSType res = unionType.getRestrictedTypeGivenToBooleanOutcome(true);
        assertNotNull(res);
    }

    @Test
    public void testGetPossibleToBooleanOutcomes() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType));
        BooleanLiteralSet outcomes = unionType.getPossibleToBooleanOutcomes();
        assertNotNull(outcomes);
    }

    @Test
    public void testGetTypesUnderEqualityAndInequality() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType, stringType));
        assertNotNull(unionType.getTypesUnderEquality(numberType));
        assertNotNull(unionType.getTypesUnderInequality(numberType));
        assertNotNull(unionType.getTypesUnderShallowInequality(numberType));
    }

    @Test
    public void testVisitorAndResolveInternal() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType));
        assertNotNull(unionType.visit(new NoopVisitor<JSType>()));
        
        JSType resolved = unionType.resolveInternal(new SimpleErrorReporter(), null);
        assertNotNull(resolved);
    }
    
    @Test
    public void testForgiveUnknownNames() {
        UnionType unionType = new UnionType(registry, Sets.newHashSet(numberType));
        // Should not throw exception
        unionType.forgiveUnknownNames();
    }
}