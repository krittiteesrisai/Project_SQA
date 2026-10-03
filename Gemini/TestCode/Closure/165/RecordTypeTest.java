package com.google.javascript.rhino.jstype;

import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Suite for RecordType (Closure-165b).
 * Focuses on Branch/Condition coverage, edge cases, null safety, and invalid states.
 */
public class RecordTypeTest {

    private JSTypeRegistry registry;
    private JSType numberType;
    private JSType stringType;
    private JSType booleanType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new SimpleErrorReporter());
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    }

    @Test(expected = IllegalStateException.class)
    public void testConstructorThrowsExceptionWhenPropertyIsNull() {
        Map<String, RecordProperty> props = Maps.newHashMap();
        // Edge Case: RecordProperty is null to trigger IllegalStateException branch
        props.put("a", null);
        new RecordType(registry, props);
    }

    @Test
    public void testConstructorAndGetImplicitPrototype() {
        Map<String, RecordProperty> props = Maps.newHashMap();
        props.put("a", new RecordProperty(numberType, null));
        
        RecordType recordType = new RecordType(registry, props);
        
        assertNotNull(recordType);
        assertTrue(recordType.isRecordType());
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), recordType.getImplicitPrototype());
    }

    @Test
    public void testDefinePropertyWhenFrozen() {
        Map<String, RecordProperty> props = Maps.newHashMap();
        props.put("a", new RecordProperty(numberType, null));
        RecordType recordType = new RecordType(registry, props);

        // Edge Case / Invalid State: RecordType is frozen in constructor (isFrozen = true)
        // defineProperty should return false and not add the property
        boolean result = recordType.defineProperty("b", stringType, false, null);
        assertFalse(result);
        assertFalse(recordType.hasProperty("b"));
    }

    @Test
    public void testIsEquivalentToBranches() {
        Map<String, RecordProperty> props1 = Maps.newHashMap();
        props1.put("a", new RecordProperty(numberType, null));
        RecordType rec1 = new RecordType(registry, props1);

        // 1. Not a record type -> false
        assertFalse(rec1.isEquivalentTo(stringType));

        // 2. Same instance -> true
        assertTrue(rec1.isEquivalentTo(rec1));

        // 3. Different keys -> false
        Map<String, RecordProperty> props2 = Maps.newHashMap();
        props2.put("b", new RecordProperty(numberType, null));
        RecordType rec2 = new RecordType(registry, props2);
        assertFalse(rec1.isEquivalentTo(rec2));

        // 4. Same keys, different types -> false
        Map<String, RecordProperty> props3 = Maps.newHashMap();
        props3.put("a", new RecordProperty(stringType, null));
        RecordType rec3 = new RecordType(registry, props3);
        assertFalse(rec1.isEquivalentTo(rec3));

        // 5. Equivalent records -> true
        Map<String, RecordProperty> props4 = Maps.newHashMap();
        props4.put("a", new RecordProperty(numberType, null));
        RecordType rec4 = new RecordType(registry, props4);
        assertTrue(rec1.isEquivalentTo(rec4));
    }

    @Test
    public void testIsSubtypeBranches() {
        Map<String, RecordProperty> props1 = Maps.newHashMap();
        props1.put("a", new RecordProperty(numberType, null));
        RecordType rec1 = new RecordType(registry, props1);

        // Non-record type that is not a subtype -> false
        assertFalse(rec1.isSubtype(stringType));

        // Object type is supertype or matches native hierarchy
        assertTrue(rec1.isSubtype(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));

        // Subtyping with another record type (rec2 has 'a' and 'b', so rec2 is subtype of rec1)
        Map<String, RecordProperty> props2 = Maps.newHashMap();
        props2.put("a", new RecordProperty(numberType, null));
        props2.put("b", new RecordProperty(stringType, null));
        RecordType rec2 = new RecordType(registry, props2);

        assertTrue(rec2.isSubtype(rec1));
        assertFalse(rec1.isSubtype(rec2)); // rec1 lacks 'b' -> property missing branch triggers false
    }

    @Test
    public void testStaticIsSubtypeDeclaredVsInferred() {
        // Test static isSubtype(ObjectType, RecordType) conditions:
        // 2a) declared property must be equal (equivalent)
        // 2b) otherwise (inferred), must be a subtype
        
        Map<String, RecordProperty> baseProps = Maps.newHashMap();
        baseProps.put("prop", new RecordProperty(numberType, null));
        RecordType baseRecord = new RecordType(registry, baseProps);

        // Create an ObjectType with incompatible declared property
        Map<String, JSType> altProps = Maps.newHashMap();
        altProps.put("prop", stringType);
        
        // Using PrototypeObjectType to simulate custom object with declared property mismatch
        PrototypeObjectType objWithDifferentDeclaredProp = new PrototypeObjectType(registry, "Obj", null);
        objWithDifferentDeclaredProp.defineDeclaredProperty("prop", stringType, null);

        // Should return false because propA is declared and not equivalent to propB
        assertFalse(RecordType.isSubtype(objWithDifferentDeclaredProp, baseRecord));
    }

    @Test
    public void testGetGreatestSubtypeHelperWithRecordType() {
        Map<String, RecordProperty> props1 = Maps.newHashMap();
        props1.put("a", new RecordProperty(numberType, null));
        RecordType rec1 = new RecordType(registry, props1);

        // Conflicting property type -> should return NO_TYPE
        Map<String, RecordProperty> propsConflict = Maps.newHashMap();
        propsConflict.put("a", new RecordProperty(stringType, null));
        RecordType recConflict = new RecordType(registry, propsConflict);

        JSType greatest = rec1.getGreatestSubtypeHelper(recConflict);
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_TYPE), greatest);

        // Compatible / Unique properties -> should merge successfully via builder
        Map<String, RecordProperty> propsCompatible = Maps.newHashMap();
        propsCompatible.put("b", new RecordProperty(stringType, null));
        RecordType recCompatible = new RecordType(registry, propsCompatible);

        JSType merged = rec1.getGreatestSubtypeHelper(recCompatible);
        assertTrue(merged.isRecordType());
    }

    @Test
    public void testResolveInternal() {
        Map<String, RecordProperty> props = Maps.newHashMap();
        props.put("a", new RecordProperty(numberType, null));
        RecordType recordType = new RecordType(registry, props);

        // Trigger internal resolution
        JSType resolved = recordType.resolveInternal(new SimpleErrorReporter(), null);
        assertNotNull(resolved);
    }
}