package org.joda.time.field;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class UnsupportedDurationFieldTest {

    // ---------- Helpers (reflection) ----------

    /**
     * รีเซ็ต static cache (cCache) เป็น null เพื่อบังคับให้เกิด branch
     * "cCache == null" ใน getInstance() อย่างแน่นอน ไม่ขึ้นกับลำดับรัน test
     */
    private void resetCache() throws Exception {
        Field f = UnsupportedDurationField.class.getDeclaredField("cCache");
        f.setAccessible(true);
        f.set(null, null);
    }

    /**
     * สร้าง instance ใหม่โดยไม่ผ่าน cache (เรียก private constructor ตรง ๆ)
     * เพื่อให้ได้สอง object คนละ reference ที่มี getName() เท่ากัน สำหรับทดสอบ equals()
     */
    private UnsupportedDurationField newInstanceBypassCache(DurationFieldType type) throws Exception {
        Constructor<UnsupportedDurationField> ctor =
                UnsupportedDurationField.class.getDeclaredConstructor(DurationFieldType.class);
        ctor.setAccessible(true);
        return ctor.newInstance(type);
    }

    // ---------- getInstance() branch coverage ----------

    @Test
    public void testGetInstance_cacheNull_createsCacheAndInstance() throws Exception {
        resetCache(); // บังคับ cCache == null branch
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertNotNull(field);
        assertEquals(DurationFieldType.millis(), field.getType());
    }

    @Test
    public void testGetInstance_cacheMiss_newFieldCreated() throws Exception {
        resetCache();
        // cache ถูกสร้างใหม่ ว่างเปล่า -> field == null branch (cache miss)
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertNotNull(field);
        assertEquals(DurationFieldType.seconds(), field.getType());
    }

    @Test
    public void testGetInstance_cacheHit_returnsSameInstance() {
        UnsupportedDurationField f1 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        UnsupportedDurationField f2 = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        assertSame(f1, f2); // call ที่สอง -> field != null branch (cache hit)
    }

    @Test
    public void testGetInstance_differentTypes_returnDifferentInstances() {
        UnsupportedDurationField f1 = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        UnsupportedDurationField f2 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertNotSame(f1, f2);
        assertFalse(f1.getType().equals(f2.getType()));
    }

    @Test
    public void testGetInstance_withNullType_doesNotThrowOnCreation() throws Exception {
        resetCache();
        // source ไม่ได้ guard null type; HashMap อนุญาต null key ได้ จึงไม่ throw ตรงนี้
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(null);
        assertNotNull(field);
        assertNull(field.getType());
        // เรียก getName() จะทำให้เกิด NPE เนื่องจาก iType เป็น null และมีการเรียก iType.getName()
        // (พฤติกรรมนี้มาจาก source จริง ไม่ใช่การเดา)
        try {
            field.getName();
            fail("Expected NullPointerException due to null iType");
        } catch (NullPointerException expected) {
            // ตามพฤติกรรม source ปัจจุบัน
        }
    }

    // ---------- Simple accessors ----------

    @Test
    public void testGetType() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        assertEquals(DurationFieldType.weeks(), field.getType());
    }

    @Test
    public void testGetName() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        assertEquals(DurationFieldType.months().getName(), field.getName());
    }

    @Test
    public void testIsSupported_alwaysFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertFalse(field.isSupported());
    }

    @Test
    public void testIsPrecise_alwaysTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
        assertTrue(field.isPrecise());
    }

    @Test
    public void testGetUnitMillis_alwaysZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.eras());
        assertEquals(0L, field.getUnitMillis());
    }

    // ---------- เมธอดที่ต้อง throw UnsupportedOperationException ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getValue(1L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getValueAsLong(1L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_longLong() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getValue(1L, 2L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_longLong() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getValueAsLong(1L, 2L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_int() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getMillis(1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getMillis(1L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_intLong() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getMillis(1, 2L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_longLong() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getMillis(1L, 2L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_longInt() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).add(1L, 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_longLong() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).add(1L, 1L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifference() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getDifference(10L, 5L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifferenceAsLong() {
        UnsupportedDurationField.getInstance(DurationFieldType.millis()).getDifferenceAsLong(10L, 5L);
    }

    @Test
    public void testUnsupportedExceptionMessageContainsType() {
        try {
            UnsupportedDurationField.getInstance(DurationFieldType.millis()).add(1L, 1);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("field is unsupported"));
        }
    }

    // ---------- compareTo() ----------

    @Test
    public void testCompareTo_supportedField_returnsOne() {
        UnsupportedDurationField unsupportedField =
                UnsupportedDurationField.getInstance(DurationFieldType.millis());
        DurationField supportedField =
                DurationFieldType.millis().getField(ISOChronology.getInstanceUTC());
        assertTrue(supportedField.isSupported());
        assertEquals(1, unsupportedField.compareTo(supportedField));
    }

    @Test
    public void testCompareTo_unsupportedField_returnsZero() {
        UnsupportedDurationField field1 =
                UnsupportedDurationField.getInstance(DurationFieldType.millis());
        UnsupportedDurationField field2 =
                UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertFalse(field2.isSupported());
        assertEquals(0, field1.compareTo(field2));
    }

    // ---------- equals() / hashCode() / toString() ----------

    @Test
    public void testEquals_sameInstance_true() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_notUnsupportedDurationFieldInstance_false() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertFalse(field.equals("not a duration field"));
    }

    @Test
    public void testEquals_nullObject_false() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertFalse(field.equals(null));
    }

    @Test
    public void testEquals_sameNameDifferentInstance_true() throws Exception {
        UnsupportedDurationField f1 = newInstanceBypassCache(DurationFieldType.millis());
        UnsupportedDurationField f2 = newInstanceBypassCache(DurationFieldType.millis());
        assertNotSame(f1, f2);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquals_differentName_false() throws Exception {
        UnsupportedDurationField f1 = newInstanceBypassCache(DurationFieldType.millis());
        UnsupportedDurationField f2 = newInstanceBypassCache(DurationFieldType.seconds());
        assertFalse(f1.equals(f2));
    }

    // NOTE: branch "other.getName() == null" ใน equals() ไม่สามารถทดสอบผ่าน public API ได้
    // เพราะ DurationFieldType ทุกตัวที่มาพร้อม Joda-Time คืนชื่อ (getName()) ที่ไม่เป็น null เสมอ
    // การ cover branch นี้ต้องสร้าง custom DurationFieldType ที่ getName() คืน null ซึ่งไม่มีนิยามใน source ที่ให้มา
    // จึงไม่เขียนเทสสำหรับ branch นี้ เพื่อไม่ "เดา" behavior ที่ไม่มีอยู่จริง

    @Test
    public void testHashCode_matchesNameHashCode() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertEquals(field.getName().hashCode(), field.hashCode());
    }

    @Test
    public void testToString_format() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertEquals("UnsupportedDurationField[" + field.getName() + "]", field.toString());
    }

    // ---------- readResolve() - singleton on deserialization ----------

    @Test
    public void testSerialization_readResolve_returnsSingletonInstance() throws Exception {
        UnsupportedDurationField original = UnsupportedDurationField.getInstance(DurationFieldType.millis());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object deserialized = ois.readObject();
        ois.close();

        assertSame(original, deserialized); // readResolve ต้องคืน instance เดิมจาก cache
    }
}
