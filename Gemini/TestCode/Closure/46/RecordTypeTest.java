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

public class RecordTypeTest {

    private JSTypeRegistry registry;
    private JSType numberType;
    private JSType stringType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(new SimpleErrorReporter());
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    }

    @Test(expected = IllegalStateException.class)
    public void testConstructorWithNullPropertyThrowsException() {
        Map<String, RecordProperty> props = Maps.newHashMap();
        props.put("a", null);
        new RecordType(registry, props);
    }

    @Test
    public void testConstructorAndBasicProperties() {
        Map<String, RecordProperty> props = Maps.newHashMap();
        props.put("a", new RecordProperty(numberType, null));
        
        RecordType recordType = new RecordType(registry, props);
        assertTrue(recordType.isRecordType());
        assertTrue(recordType.hasProperty("a"));
        assertEquals(numberType, recordType.getPropertyType("a"));
        
        // Test defineProperty when frozen (isFrozen is true)
        assertFalse(recordType.defineProperty("b", stringType, false, null));
    }

    @Test
    public void testIsEquivalentTo() {
        Map<String, RecordProperty> props1 = Maps.newHashMap();
        props1.put("a", new RecordProperty(numberType, null));
        RecordType rec1 = new RecordType(registry, props1);

        // Self-equivalence
        assertTrue(rec1.isEquivalentTo(rec1));

        // Non-record type equivalence
        assertFalse(rec1.isEquivalentTo(numberType));

        // Different keys equivalence
        Map<String, RecordProperty> props2 = Maps.newHashMap();
        props2.put("b", new RecordProperty(numberType, null));
        RecordType rec2 = new RecordType(registry, props2);
        assertFalse(rec1.isEquivalentTo(rec2));

        // Same keys, different types equivalence
        Map<String, RecordProperty> props3 = Maps.newHashMap();
        props3.put("a", new RecordProperty(stringType, null));
        RecordType rec3 = new RecordType(registry, props3);
        assertFalse(rec1.isEquivalentTo(rec3));

        // Same keys, equivalent types equivalence
        Map<String, RecordProperty> props4 = Maps.newHashMap();
        props4.put("a", new RecordProperty(numberType, null));
        RecordType rec4 = new RecordType(registry, props4);
        assertTrue(rec1.isEquivalentTo(rec4));
    }

    @Test
    public void testGetImplicitPrototype() {
        Map<String, RecordProperty> props = Maps.newHashMap();
        props.put("a", new RecordProperty(numberType, null));
        RecordType rec = new RecordType(registry, props);
        
        assertNotNull(rec.getImplicitPrototype());
        assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), rec.getImplicitPrototype());
    }

    @Test
    public void testGetLeastSupertype() {
        Map<String, RecordProperty> props1 = Maps.newHashMap();
        props1.put("a", new RecordProperty(numberType, null));
        RecordType rec1 = new RecordType(registry, props1);

        // Non-record least supertype
        JSType supertype1 = rec1.getLeastSupertype(numberType);
        assertNotNull(supertype1);

        // Record least supertype with matching property
        Map<String, RecordProperty> props2 = Maps.newHashMap();
        props2.put("a", new RecordProperty(numberType, null));
        props2.put("b", new RecordProperty(stringType, null));
        RecordType rec2 = new RecordType(registry, props2);

        JSType supertype2 = rec1.getLeastSupertype(rec2);
        assertNotNull(supertype2);
    }

    @Test
    public void testGetGreatestSubtypeHelper() {
        Map<String, RecordProperty> props1 = Maps.newHashMap();
        props1.put("a", new RecordProperty(numberType, null));
        RecordType rec1 = new RecordType(registry, props1);

        // Record type with conflicting property type -> NO_TYPE
        Map<String, RecordProperty> props2 = Maps.newHashMap();
        props2.put("a", new RecordProperty(stringType, null));
        RecordType rec2 = new RecordType(registry, props2);

        JSType greatestSub = rec1.getGreatestSubtypeHelper(rec2);
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_TYPE), greatestSub);

        // Record type with compatible/unique properties
        Map<String, RecordProperty> props3 = Maps.newHashMap();
        props3.put("b", new RecordProperty(stringType, null));
        RecordType rec3 = new RecordType(registry, props3);
        JSType greatestSub2 = rec1.getGreatestSubtypeHelper(rec3);
        assertNotNull(greatestSub2);

        // Non-record type passed to greatest subtype helper
        JSType nonRecordSub = rec1.getGreatestSubtypeHelper(numberType);
        assertNotNull(nonRecordSub);
    }

    @Test
    public void testIsSubtype() {
        Map<String, RecordProperty> props1 = Maps.newHashMap();
        props1.put("a", new RecordProperty(numberType, null));
        RecordType rec1 = new RecordType(registry, props1);

        // Subtype with non-record type (should be false if not matching)
        assertFalse(rec1.isSubtype(numberType));

        // Subtype with OBJECT_TYPE (should be true)
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        // Note: Depending on hierarchy, test general subtyping rules
        
        // Record subtype with more properties (rec2 has 'a' and 'b', so rec2 is a subtype of rec1? Wait, structural subtyping: rec2 has MORE properties, meaning it can be assigned where rec1 is expected)
        Map<String, RecordProperty> props2 = Maps.newHashMap();
        props2.put("a", new RecordProperty(numberType, null));
        props2.put("b", new RecordProperty(stringType, null));
        RecordType rec2 = new RecordType(registry, props2);

        // rec2 has all properties of rec1, so rec2 is a subtype of rec1
        assertTrue(rec2.isSubtype(rec1));
        // rec1 is NOT a subtype of rec2 because rec1 lacks 'b'
        assertFalse(rec1.isSubtype(rec2));
    }

    @Test
    public void testResolveInternal() {
        Map<String, RecordProperty> props = Maps.newHashMap();
        props.put("a", new RecordProperty(numberType, null));
        RecordType rec = new RecordType(registry, props);

        SimpleErrorReporter errorReporter = new SimpleErrorReporter();
        JSType resolved = rec.resolveInternal(errorReporter, null);
        assertNotNull(resolved);
    }
}