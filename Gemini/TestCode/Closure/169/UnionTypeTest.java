package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for UnionType targeting deep branch/condition coverage
 * and edge cases (Defects4J Closure-169b).
 */
public class UnionTypeTest {

    private JSTypeRegistry registry;
    private JSType numberType;
    private JSType stringType;
    private JSType booleanType;
    private JSType nullType;
    private JSType voidType;
    private JSType unknownType;
    private JSType allType;

    @Before
    public void setUp() {
        ErrorReporter errorReporter = new SimpleErrorReporter();
        registry = new JSTypeRegistry(errorReporter);
        
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
    }

    @Test
    public void testGetAlternatesAndHashCode() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertNotNull(unionType.getAlternates());
        assertEquals(2, IterablesSize(unionType.getAlternates()));
        assertEquals(unionType.alternates.hashCode(), unionType.hashCode());
    }

    @Test
    public void testContextMatches() {
        UnionType numberStringUnion = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertTrue(numberStringUnion.matchesNumberContext());
        assertTrue(numberStringUnion.matchesStringContext());
        assertTrue(numberStringUnion.matchesObjectContext());

        UnionType voidNullUnion = new UnionType(registry, Arrays.asList(voidType, nullType));
        assertFalse(voidNullUnion.matchesNumberContext());
        assertTrue(voidNullUnion.matchesStringContext()); // All types potentially convert to string
        assertFalse(voidNullUnion.matchesObjectContext());
    }

    @Test
    public void testFindPropertyType() {
        UnionType unionType = new UnionType(registry, Arrays.asList(nullType, voidType, stringType));
        // Should skip null and void, and evaluate string properties
        JSType propType = unionType.findPropertyType("length");
        assertNotNull(propType);
    }

    @Test
    public void testCanAssignTo() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, unknownType));
        // Contains unknown type should return true early
        assertTrue(unionType.canAssignTo(stringType));

        UnionType strictUnion = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertFalse(strictUnion.canAssignTo(booleanType));
    }

    @Test
    public void testCanBeCalled() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertFalse(unionType.canBeCalled());
    }

    @Test
    public void testAutoboxAndRestrictByNotNullOrUndefined() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, nullType));
        JSType autoboxed = unionType.autobox();
        assertNotNull(autoboxed);

        JSType restricted = unionType.restrictByNotNullOrUndefined();
        assertNotNull(restricted);
    }

    @Test
    public void testTestForEquality() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, numberType));
        TernaryValue result = unionType.testForEquality(numberType);
        assertNotNull(result);
    }

    @Test
    public void testIsNullableAndIsUnknownType() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, nullType));
        assertTrue(unionType.isNullable());
        assertFalse(unionType.isUnknownType());

        UnionType unknownUnion = new UnionType(registry, Arrays.asList(numberType, unknownType));
        assertTrue(unknownUnion.isUnknownType());
    }

    @Test
    public void testStructAndDict() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertFalse(unionType.isStruct());
        assertFalse(unionType.isDict());
    }

    @Test
    public void testGetLeastSupertype() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        JSType supertype = unionType.getLeastSupertype(numberType);
        assertNotNull(supertype);
    }

    @Test
    public void testMeet() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        JSType met = unionType.meet(numberType);
        assertNotNull(met);

        UnionType otherUnion = new UnionType(registry, Arrays.asList(numberType, booleanType));
        JSType metUnion = unionType.meet(otherUnion);
        assertNotNull(metUnion);
    }

    @Test
    public void testCheckUnionEquivalenceHelper() {
        UnionType union1 = new UnionType(registry, Arrays.asList(numberType, stringType));
        UnionType union2 = new UnionType(registry, Arrays.asList(stringType, numberType));
        
        assertTrue(union1.checkUnionEquivalenceHelper(union2, true));
        assertTrue(union1.checkUnionEquivalenceHelper(union2, false));

        UnionType union3 = new UnionType(registry, Collections.singletonList(numberType));
        assertFalse(union1.checkUnionEquivalenceHelper(union3, false));
    }

    @Test
    public void testHasPropertyAndContains() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertFalse(unionType.hasProperty("nonExistentProp"));
        assertTrue(unionType.contains(numberType));
        assertFalse(unionType.contains(booleanType));
    }

    @Test
    public void testToMaybeUnionTypeAndIsObject() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertSame(unionType, unionType.toMaybeUnionType());
        assertFalse(unionType.isObject());
    }

    @Test
    public void testGetRestrictedUnion() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        JSType restricted = unionType.getRestrictedUnion(numberType);
        assertNotNull(restricted);
    }

    @Test
    public void testToStringHelper() {
        UnionType unionType = new UnionType(registry, Arrays.asList(stringType, numberType));
        String str = unionType.toStringHelper(true);
        assertNotNull(str);
        assertTrue(str.contains("|"));
    }

    @Test
    public void testIsSubtype() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertTrue(unionType.isSubtype(unknownType));
        assertTrue(unionType.isSubtype(allType));
        assertFalse(unionType.isSubtype(numberType));
    }

    @Test
    public void testBooleanOutcomesAndEqualityTypes() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertNotNull(unionType.getRestrictedTypeGivenToBooleanOutcome(true));
        assertNotNull(unionType.getPossibleToBooleanOutcomes());
        assertNotNull(unionType.getTypesUnderEquality(stringType));
        assertNotNull(unionType.getTypesUnderInequality(stringType));
        assertNotNull(unionType.getTypesUnderShallowInequality(stringType));
    }

    @Test
    public void testVisitAndResolveInternal() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertNotNull(unionType.visit(new NoopVisitor()));
        
        JSType resolved = unionType.resolveInternal(new SimpleErrorReporter(), null);
        assertSame(unionType, resolved);
    }

    @Test
    public void testDebugHashCodeStringAndValidator() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        assertNotNull(unionType.toDebugHashCodeString());
        assertTrue(unionType.setValidator(t -> true));
    }

    @Test
    public void testCollapseUnion() {
        UnionType unknownUnion = new UnionType(registry, Arrays.asList(numberType, unknownType));
        assertEquals(unknownType, unknownUnion.collapseUnion());

        UnionType mixedUnion = new UnionType(registry, Arrays.asList(numberType, stringType));
        // Multiple values should collapse to ALL_TYPE
        assertEquals(allType, mixedUnion.collapseUnion());
    }

    @Test
    public void testMatchConstraintAndTemplate() {
        UnionType unionType = new UnionType(registry, Arrays.asList(numberType, stringType));
        unionType.matchConstraint(numberType);
        assertFalse(unionType.hasAnyTemplateInternal());
    }

    // Helper method to count iterable elements without Java 8 streams
    private int IterablesSize(Iterable<?> iterable) {
        int count = 0;
        for (Object o : iterable) {
            count++;
        }
        return count;
    }

    private static class NoopVisitor implements Visitor<Boolean> {
        @Override public Boolean caseArrayType(ArrayType type) { return false; }
        @Override public Boolean caseBooleanType(BooleanType type) { return false; }
        @Override public Boolean caseNoType(NoType type) { return false; }
        @Override public Boolean caseAllType(AllType type) { return false; }
        @Override public Boolean caseEnumElementType(EnumElementType type) { return false; }
        @Override public Boolean caseEnumType(EnumType type) { return false; }
        @Override public Boolean caseFunctionType(FunctionType type) { return false; }
        @Override public Boolean caseInstanceType(InstanceType type) { return false; }
        @Override public Boolean caseNoObjectType(NoObjectType type) { return false; }
        @Override public Boolean caseNullType(NullType type) { return false; }
        @Override public Boolean caseNumberType(NumberType type) { return false; }
        @Override public Boolean caseObjectType(ObjectType type) { return false; }
        @Override public Boolean caseRecordType(RecordType type) { return false; }
        @Override public Boolean caseStringType(StringType type) { return false; }
        @Override public Boolean caseUnknownType(UnknownType type) { return false; }
        @Override public Boolean caseVoidType(VoidType type) { return false; }
        @Override public Boolean caseUnionType(UnionType type) { return true; }
        @Override public Boolean caseNamedType(NamedType type) { return false; }
        @Override public Boolean caseArrowType(ArrowType type) { return false; }
        @Override public Boolean caseTemplateType(TemplateType type) { return false; }
    }
}