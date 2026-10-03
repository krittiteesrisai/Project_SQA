package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;

@Retention(RetentionPolicy.RUNTIME)
@interface TestAnno1 {
    String value() default "default1";
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestAnno2 {
    String value() default "default2";
}

public class AnnotationMapTest {

    @Test
    public void testGet_NullAnnotations() {
        AnnotationMap map = new AnnotationMap();
        assertNull(map.get(TestAnno1.class));
    }

    @Test
    public void testGet_NotNullAnnotations() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnno1 ann = AnnotationMapTest.class.getAnnotation(TestAnno1.class);
        map.add(ann);
        
        assertNotNull(map.get(TestAnno1.class));
        assertNull(map.get(TestAnno2.class));
    }

    @Test
    public void testAnnotations_NullOrEmpty() {
        AnnotationMap map = new AnnotationMap();
        Iterable<Annotation> iterable = map.annotations();
        assertNotNull(iterable);
        assertFalse(iterable.iterator().hasNext());

        // Test size 0 explicitly via add then clear/remove simulation or empty map
        AnnotationMap emptyMapWithObj = new AnnotationMap();
        // Force internal state if needed or test default
        assertFalse(emptyMapWithObj.annotations().iterator().hasNext());
    }

    @Test
    public void testAnnotations_Populated() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnno1 ann = AnnotationMapTest.class.getAnnotation(TestAnno1.class);
        map.add(ann);

        Iterable<Annotation> iterable = map.annotations();
        assertNotNull(iterable);
        Iterator<Annotation> it = iterable.iterator();
        assertTrue(it.hasNext());
        assertEquals(ann, it.next());
    }

    @Test
    public void testMerge_PrimaryNullOrEmpty() throws Exception {
        TestAnno1 ann = AnnotationMapTest.class.getAnnotation(TestAnno1.class);
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(ann);

        // Case 1: primary is null
        AnnotationMap result1 = AnnotationMap.merge(null, secondary);
        assertEquals(secondary, result1);

        // Case 2: primary is empty (null _annotations)
        AnnotationMap primaryEmpty = new AnnotationMap();
        AnnotationMap result2 = AnnotationMap.merge(primaryEmpty, secondary);
        assertEquals(secondary, result2);
    }

    @Test
    public void testMerge_SecondaryNullOrEmpty() throws Exception {
        TestAnno1 ann = AnnotationMapTest.class.getAnnotation(TestAnno1.class);
        AnnotationMap primary = new AnnotationMap();
        primary.add(ann);

        // Case 1: secondary is null
        AnnotationMap result1 = AnnotationMap.merge(primary, null);
        assertEquals(primary, result1);

        // Case 2: secondary is empty
        AnnotationMap secondaryEmpty = new AnnotationMap();
        AnnotationMap result2 = AnnotationMap.merge(primary, secondaryEmpty);
        assertEquals(primary, result2);
    }

    @Test
    public void testMerge_BothPopulated() throws Exception {
        TestAnno1 ann1 = AnnotationMapTest.class.getAnnotation(TestAnno1.class);
        TestAnno2 ann2 = AnnotationMapTest.class.getAnnotation(TestAnno2.class);

        AnnotationMap primary = new AnnotationMap();
        primary.add(ann1);

        AnnotationMap secondary = new AnnotationMap();
        secondary.add(ann2);
        secondary.add(ann1); // Duplicate type to test override

        AnnotationMap merged = AnnotationMap.merge(primary, secondary);
        assertNotNull(merged);
        assertEquals(2, merged.size());
        assertNotNull(merged.get(TestAnno1.class));
        assertNotNull(merged.get(TestAnno2.class));
    }

    @Test
    public void testSize() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());

        TestAnno1 ann = AnnotationMapTest.class.getAnnotation(TestAnno1.class);
        map.add(ann);
        assertEquals(1, map.size());
    }

    @Test
    public void testAddIfNotPresent() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnno1 ann = AnnotationMapTest.class.getAnnotation(TestAnno1.class);

        // First time: should add successfully (returns true because condition !_annotations.containsKey matches)
        assertTrue(map.addIfNotPresent(ann));
        // Second time: should not add (returns false)
        assertFalse(map.addIfNotPresent(ann));
    }

    @Test
    public void testAddAndInternalAddBehavior() throws Exception {
        AnnotationMap map = new AnnotationMap();
        TestAnno1 ann1 = AnnotationMapTest.class.getAnnotation(TestAnno1.class);
        
        // Adding first time -> previous is null -> returns (false && ...) -> false
        boolean firstAdd = map.add(ann1);
        assertFalse(firstAdd);

        // Adding same annotation second time -> previous is not null and equals -> returns true
        boolean secondAdd = map.add(ann1);
        assertTrue(secondAdd);
    }

    @Test
    public void testToString() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertEquals("[null]", map.toString());

        TestAnno1 ann = AnnotationMapTest.class.getAnnotation(TestAnno1.class);
        map.add(ann);
        assertNotNull(map.toString());
        assertNotEquals("[null]", map.toString());
    }
}