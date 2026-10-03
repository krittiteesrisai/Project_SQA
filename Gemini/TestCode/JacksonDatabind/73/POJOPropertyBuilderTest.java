package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

public class POJOPropertyBuilderTest {

    @Test
    public void testCompareToConstructorParameters() {
        PropertyName propName1 = new PropertyName("aProp");
        PropertyName propName2 = new PropertyName("bProp");

        POJOPropertyBuilder builder1 = new POJOPropertyBuilder(null, null, false, propName1);
        POJOPropertyBuilder builder2 = new POJOPropertyBuilder(null, null, false, propName2);

        // Neither has ctor params -> compare by name ('aProp' < 'bProp')
        assertTrue(builder1.compareTo(builder2) < 0);

        // builder1 gets ctor params, should come first (return < 0)
        builder1.addCtor(null, propName1, false, true, false);
        assertTrue(builder1.compareTo(builder2) < 0);
        assertTrue(builder2.compareTo(builder1) > 0);

        // Both have ctor params -> compare by name
        builder2.addCtor(null, propName2, false, true, false);
        assertTrue(builder1.compareTo(builder2) < 0);
    }

    @Test
    public void testRemoveNonVisibleAccessModes() {
        PropertyName propName = new PropertyName("testProp");

        // Test READ_ONLY
        POJOPropertyBuilder builderReadOnly = new POJOPropertyBuilder(null, null, false, propName);
        builderReadOnly.removeNonVisible(false);

        // Test WRITE_ONLY with serialization
        POJOPropertyBuilder builderWriteSer = new POJOPropertyBuilder(null, null, true, propName);
        builderWriteSer.removeNonVisible(false);

        // Test AUTO with inferMutators = false
        POJOPropertyBuilder builderAuto = new POJOPropertyBuilder(null, null, false, propName);
        builderAuto.removeNonVisible(false);
        
        assertNotNull(builderAuto);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkedExplicitNameValidationEdgeCase() {
        // Trigger IllegalArgumentException in Linked constructor: explName = true, but name is null/empty
        new POJOPropertyBuilder.Linked<Object>(null, null, null, true, true, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLinkedExplicitNameEmptyValidationEdgeCase() {
        new POJOPropertyBuilder.Linked<Object>(null, null, PropertyName.EMPTY, true, true, false);
    }

    @Test
    public void testMemberIteratorEdges() {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(null, null, false, new PropertyName("prop"));
        Iterator<AnnotatedParameter> emptyIter = builder.getConstructorParameters();
        assertFalse(emptyIter.hasNext());

        try {
            emptyIter.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // Expected
        }

        try {
            emptyIter.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testBasicGettersAndSettersNameCoverage() {
        PropertyName name = new PropertyName("sampleName");
        POJOPropertyBuilder builder = new POJOPropertyBuilder(null, null, false, name);

        assertEquals("sampleName", builder.getName());
        assertEquals(name, builder.getFullName());
        assertEquals("sampleName", builder.getInternalName());
        assertTrue(builder.hasName(name));
        assertFalse(builder.hasGetter());
        assertFalse(builder.hasSetter());
        assertFalse(builder.hasField());
        assertFalse(builder.hasConstructorParameter());
        assertFalse(builder.couldDeserialize());
        assertFalse(builder.couldSerialize());
        assertFalse(builder.anyVisible());
        assertFalse(builder.anyIgnorals());
        
        Set<PropertyName> explicitNames = builder.findExplicitNames();
        assertEquals(Collections.emptySet(), explicitNames);
    }

    @Test
    public void testWithSimpleNameRefinement() {
        PropertyName name = new PropertyName("original");
        POJOPropertyBuilder builder = new POJOPropertyBuilder(null, null, false, name);

        // Same simple name should return 'this'
        POJOPropertyBuilder same = builder.withSimpleName("original");
        assertSame(builder, same);

        // Different simple name should return a new instance
        POJOPropertyBuilder diff = builder.withSimpleName("changed");
        assertNotSame(builder, diff);
        assertEquals("changed", diff.getName());
    }
}