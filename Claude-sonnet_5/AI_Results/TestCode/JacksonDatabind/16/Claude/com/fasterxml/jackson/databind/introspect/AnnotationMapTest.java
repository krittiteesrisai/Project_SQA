package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;

/**
 * Unit tests for {@link AnnotationMap}.
 * ใช้ real annotation instances (ผ่าน reflection บน holder class) เนื่องจาก
 * ต้องใช้ Annotation object จริงในการทดสอบ equals()/annotationType() behavior
 */
public class AnnotationMapTest
{
    // ---------- test-only annotation types ----------

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface AnnoA { }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface AnnoB { }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface ValueAnno { String value(); }

    // ---------- holder classes carrying real annotation instances ----------

    @AnnoA
    static class HolderA1 { }

    @AnnoA
    static class HolderA2 { }

    @AnnoB
    static class HolderB1 { }

    @ValueAnno("v1")
    static class HolderV1 { }

    @ValueAnno("v2")
    static class HolderV2 { }

    private final Annotation a1 = HolderA1.class.getAnnotation(AnnoA.class);
    // a2: instance ต่างกันแต่ annotation type เดียวกัน (marker annotation ไม่มี member
    // ดังนั้น a1.equals(a2) == true ตาม Java Annotation contract)
    private final Annotation a2 = HolderA2.class.getAnnotation(AnnoA.class);
    private final Annotation b1 = HolderB1.class.getAnnotation(AnnoB.class);
    // v1/v2: annotation type เดียวกันแต่ member value ต่างกัน -> ไม่ equals()
    private final Annotation v1 = HolderV1.class.getAnnotation(ValueAnno.class);
    private final Annotation v2 = HolderV2.class.getAnnotation(ValueAnno.class);

    /**
     * Helper: สร้าง AnnotationMap ที่มี _annotations เป็น non-null (เช่น empty map)
     * โดยเข้าถึง field โดยตรง เนื่องจาก field เป็น protected และ test class อยู่
     * package เดียวกับ target class (ไม่มี public API ที่สามารถสร้าง state นี้ได้)
     */
    private static AnnotationMap withInternalMap(HashMap<Class<? extends Annotation>, Annotation> map) {
        AnnotationMap am = new AnnotationMap();
        am._annotations = map;
        return am;
    }

    // ===================== get() =====================

    @Test
    public void testGet_NullInternalMapReturnsNull() {
        AnnotationMap map = new AnnotationMap();
        assertNull(map.get(AnnoA.class));
    }

    @Test
    public void testGet_PresentReturnsSameInstance() {
        AnnotationMap map = new AnnotationMap();
        map.add(a1);
        assertSame(a1, map.get(AnnoA.class));
    }

    @Test
    public void testGet_AbsentKeyButMapNotNullReturnsNull() {
        AnnotationMap map = new AnnotationMap();
        map.add(a1);
        assertNull(map.get(AnnoB.class));
    }

    // ===================== annotations() =====================

    @Test
    public void testAnnotations_NullMapReturnsEmpty() {
        AnnotationMap map = new AnnotationMap();
        Iterable<Annotation> it = map.annotations();
        assertFalse(it.iterator().hasNext());
    }

    @Test
    public void testAnnotations_EmptyButNonNullMapReturnsEmpty() {
        // ครอบคลุมกรณี _annotations != null แต่ size() == 0
        AnnotationMap map = withInternalMap(new HashMap<Class<? extends Annotation>, Annotation>());
        Iterable<Annotation> it = map.annotations();
        assertFalse(it.iterator().hasNext());
    }

    @Test
    public void testAnnotations_NonEmptyReturnsValues() {
        AnnotationMap map = new AnnotationMap();
        map.add(a1);
        map.add(b1);
        Iterator<Annotation> it = map.annotations().iterator();
        int count = 0;
        boolean foundA = false, foundB = false;
        while (it.hasNext()) {
            Annotation ann = it.next();
            count++;
            if (ann == a1) foundA = true;
            if (ann == b1) foundB = true;
        }
        assertEquals(2, count);
        assertTrue(foundA);
        assertTrue(foundB);
    }

    // ===================== merge() =====================

    @Test
    public void testMerge_BothNullReturnsSecondary_null() {
        assertNull(AnnotationMap.merge(null, null));
    }

    @Test
    public void testMerge_PrimaryNullReturnsSecondary() {
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(b1);
        assertSame(secondary, AnnotationMap.merge(null, secondary));
    }

    @Test
    public void testMerge_PrimaryInternalMapNullReturnsSecondary() {
        AnnotationMap primary = new AnnotationMap(); // _annotations == null
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(b1);
        assertSame(secondary, AnnotationMap.merge(primary, secondary));
    }

    @Test
    public void testMerge_PrimaryInternalMapEmptyReturnsSecondary() {
        AnnotationMap primary = withInternalMap(new HashMap<Class<? extends Annotation>, Annotation>());
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(b1);
        assertSame(secondary, AnnotationMap.merge(primary, secondary));
    }

    @Test
    public void testMerge_SecondaryNullReturnsPrimary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(a1);
        assertSame(primary, AnnotationMap.merge(primary, null));
    }

    @Test
    public void testMerge_SecondaryInternalMapNullReturnsPrimary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(a1);
        AnnotationMap secondary = new AnnotationMap(); // _annotations == null
        assertSame(primary, AnnotationMap.merge(primary, secondary));
    }

    @Test
    public void testMerge_SecondaryInternalMapEmptyReturnsPrimary() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(a1);
        AnnotationMap secondary = withInternalMap(new HashMap<Class<? extends Annotation>, Annotation>());
        assertSame(primary, AnnotationMap.merge(primary, secondary));
    }

    @Test
    public void testMerge_BothNonEmptyPrimaryOverridesOnConflict() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(a1); // AnnoA (ค่าจาก primary)

        AnnotationMap secondary = new AnnotationMap();
        secondary.add(a2); // AnnoA เดียวกัน (type ตรงกันแต่ instance ต่างกัน) จาก secondary
        secondary.add(b1); // AnnoB มีเฉพาะใน secondary

        AnnotationMap merged = AnnotationMap.merge(primary, secondary);

        assertNotSame(primary, merged);
        assertNotSame(secondary, merged);
        assertEquals(2, merged.size());
        // primary ต้อง override secondary เมื่อ annotation type ชนกัน
        assertSame(a1, merged.get(AnnoA.class));
        // annotation ที่มีแค่ใน secondary ต้องถูกเก็บไว้
        assertSame(b1, merged.get(AnnoB.class));
    }

    // ===================== size() =====================

    @Test
    public void testSize_NullMapIsZero() {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());
    }

    @Test
    public void testSize_NonNullMap() {
        AnnotationMap map = new AnnotationMap();
        map.add(a1);
        assertEquals(1, map.size());
        map.add(b1);
        assertEquals(2, map.size());
    }

    // ===================== addIfNotPresent() =====================

    @Test
    public void testAddIfNotPresent_NullMapAddsAndReturnsTrue() {
        AnnotationMap map = new AnnotationMap();
        assertTrue(map.addIfNotPresent(a1));
        assertEquals(1, map.size());
        assertSame(a1, map.get(AnnoA.class));
    }

    @Test
    public void testAddIfNotPresent_AlreadyPresentReturnsFalseAndDoesNotReplace() {
        AnnotationMap map = new AnnotationMap();
        map.add(a1);
        assertFalse(map.addIfNotPresent(a2)); // type เดียวกันมีอยู่แล้ว
        assertSame(a1, map.get(AnnoA.class)); // ต้องไม่ถูกแทนที่
        assertEquals(1, map.size());
    }

    @Test
    public void testAddIfNotPresent_NotPresentButMapNotNullReturnsTrue() {
        AnnotationMap map = new AnnotationMap();
        map.add(a1);
        assertTrue(map.addIfNotPresent(b1));
        assertEquals(2, map.size());
        assertSame(b1, map.get(AnnoB.class));
    }

    // ===================== add() / _add() =====================

    @Test
    public void testAdd_FirstInsertionReturnsFalse() {
        AnnotationMap map = new AnnotationMap();
        assertFalse(map.add(a1)); // ไม่มีค่าเดิม -> previous == null -> false
        assertSame(a1, map.get(AnnoA.class));
    }

    @Test
    public void testAdd_ReplaceWithEqualAnnotationReturnsTrue() {
        AnnotationMap map = new AnnotationMap();
        map.add(a1);
        // a2 เป็น instance คนละตัวของ marker annotation type เดียวกัน
        // (ไม่มี member -> equals() เป็น true เสมอ) -> previous != null && previous.equals(ann) == true
        assertTrue(map.add(a2));
        assertSame(a2, map.get(AnnoA.class)); // ค่าใหม่ล่าสุดถูกเก็บ
    }

    @Test
    public void testAdd_ReplaceWithNonEqualAnnotationReturnsFalse() {
        AnnotationMap map = new AnnotationMap();
        map.add(v1);
        // v2 type เดียวกันแต่ member value ต่างกัน -> previous.equals(ann) == false
        assertFalse(map.add(v2));
        assertSame(v2, map.get(ValueAnno.class));
    }

    // ===================== toString() =====================

    @Test
    public void testToString_NullMap() {
        AnnotationMap map = new AnnotationMap();
        assertEquals("[null]", map.toString());
    }

    @Test
    public void testToString_NonNullMap() {
        AnnotationMap map = new AnnotationMap();
        map.add(a1);
        String s = map.toString();
        assertNotEquals("[null]", s);
        assertTrue(s.contains("AnnoA"));
    }
}
