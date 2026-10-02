package org.joda.time.field;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;

import org.joda.time.Chronology;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.junit.Test;

/**
 * JUnit4 test suite for UnsupportedDurationField (Defects4J Time-2b)
 *
 * หมายเหตุ: getInstance() ใช้ static HashMap cache ร่วมกันระหว่าง test methods
 * (shared static state) เนื่องจาก JUnit ไม่รับประกันลำดับการรันเทส จึงพยายามใช้
 * DurationFieldType ที่แตกต่างกันในแต่ละเทสเพื่อลด side-effect ข้ามเทส
 */
public class UnsupportedDurationFieldTest {

    //---------------------------------------------------------------
    // getInstance() : branch cCache==null / field==null
    //---------------------------------------------------------------

    @Test
    public void testGetInstance_firstCallCreatesCacheAndField() {
        // กรณี cCache อาจเป็น null (ถ้าเป็นการเรียกครั้งแรกของ JVM) และ field == null
        // ไม่สามารถการันตี cCache==null 100% เนื่องจาก static field ถูกแชร์ข้าม test
        // แต่ยังคงทดสอบ "เส้นทางที่ type ยังไม่เคยถูก cache" ได้แน่นอน
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.eras());
        assertNotNull(field);
        assertEquals(DurationFieldType.eras(), field.getType());
    }

    @Test
    public void testGetInstance_cachedInstanceReturnedForSameType() {
        // เรียกซ้ำด้วย type เดิม -> field != null (พบใน cache) ต้องได้ object เดิม
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
        assertSame(field1, field2);
    }

    @Test
    public void testGetInstance_differentTypesProduceDifferentInstances() {
        // cCache != null (ผ่าน test ก่อนนี้แล้ว) แต่ type ใหม่ไม่อยู่ใน cache -> field==null branch
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.months());
        assertNotSame(field1, field2);
        assertEquals(DurationFieldType.weeks(), field1.getType());
        assertEquals(DurationFieldType.months(), field2.getType());
    }

    @Test
    public void testGetInstance_withNullType_doesNotThrowButTypeIsNull() {
        // อินพุต null: HashMap.get(null) ไม่ throw, field==null -> สร้าง instance ใหม่โดย iType=null
        // ไม่มีการ validate null ในซอร์ส จึงคาดว่า getType() จะ return null โดยไม่ throw
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(null);
        assertNotNull(field);
        assertNull(field.getType());
    }

    @Test(expected = NullPointerException.class)
    public void testGetName_withNullType_throwsNPE() {
        // getName() เรียก iType.getName() ถ้า iType เป็น null จะเกิด NPE
        // (ไม่ใช่ behavior ที่ระบุชัดในเอกสาร แต่เป็นผลจากโค้ดจริง)
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(null);
        field.getName();
    }

    //---------------------------------------------------------------
    // Simple accessor tests
    //---------------------------------------------------------------

    @Test
    public void testGetType() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals(DurationFieldType.days(), field.getType());
    }

    @Test
    public void testGetName() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertEquals("hours", field.getName());
    }

    @Test
    public void testIsSupported_alwaysFalse() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        assertFalse(field.isSupported());
    }

    @Test
    public void testIsPrecise_alwaysTrue() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        assertTrue(field.isPrecise());
    }

    @Test
    public void testGetUnitMillis_alwaysZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testCompareTo_alwaysZero() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertEquals(0, field.compareTo(field));
        UnsupportedDurationField other = UnsupportedDurationField.getInstance(DurationFieldType.months());
        assertEquals(0, field.compareTo(other));
    }

    //---------------------------------------------------------------
    // Methods that must throw UnsupportedOperationException
    //---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getValue(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getValueAsLong(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_long_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getValue(0L, 0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_long_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getValueAsLong(0L, 0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_int() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getMillis(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getMillis(0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_int_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getMillis(0, 0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_long_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getMillis(0L, 0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_long_int() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).add(0L, 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_long_long() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).add(0L, 0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifference() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getDifference(0L, 0L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifferenceAsLong() {
        UnsupportedDurationField.getInstance(DurationFieldType.days()).getDifferenceAsLong(0L, 0L);
    }

    @Test
    public void testUnsupportedExceptionMessage_containsFieldInfo() {
        // ทดสอบเนื้อหา exception message ที่สร้างจาก private method unsupported()
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        try {
            field.getValue(0L);
            fail("ควร throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertTrue(e.getMessage().contains("field is unsupported"));
        }
    }

    //---------------------------------------------------------------
    // equals() : ครอบคลุมทุก branch
    //---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        // branch: this == obj
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertTrue(field.equals(field));
    }

    @Test
    public void testEquals_sameCachedType_returnsTrue() {
        // เนื่องจาก getInstance cache ไว้ จึงได้ instance เดียวกันเสมอ (this==obj จริง ๆ แล้ว)
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertTrue(field1.equals(field2));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        // branch: instanceof true, other.getName()!=null, names ไม่เท่ากัน
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.days());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        assertFalse(field1.equals(field2));
    }

    @Test
    public void testEquals_notInstanceOfClass_returnsFalse() {
        // branch: obj not instanceof UnsupportedDurationField
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertFalse(field.equals("not a duration field"));
        assertFalse(field.equals(null));
    }

    @Test
    public void testEquals_bothNameNull_returnsTrue() {
        // branch: other.getName()==null -> return (getName()==null) -> true/true
        // สร้าง custom DurationFieldType ที่ getName() คืนค่า null
        DurationFieldType nullNameType1 = new DurationFieldType(null) {
            private static final long serialVersionUID = 1L;
            public DurationField getField(Chronology chronology) {
                return null;
            }
        };
        DurationFieldType nullNameType2 = new DurationFieldType(null) {
            private static final long serialVersionUID = 1L;
            public DurationField getField(Chronology chronology) {
                return null;
            }
        };
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(nullNameType1);
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(nullNameType2);
        assertTrue(field1.equals(field2));
    }

    @Test
    public void testEquals_otherNameNull_thisNameNotNull_returnsFalse() {
        // branch: other.getName()==null -> return (getName()==null) -> false (เพราะ this.getName()!=null)
        DurationFieldType nullNameType = new DurationFieldType(null) {
            private static final long serialVersionUID = 1L;
            public DurationField getField(Chronology chronology) {
                return null;
            }
        };
        UnsupportedDurationField fieldWithNullName = UnsupportedDurationField.getInstance(nullNameType);
        UnsupportedDurationField fieldWithRealName = UnsupportedDurationField.getInstance(DurationFieldType.days());

        assertFalse(fieldWithRealName.equals(fieldWithNullName));
    }

    //---------------------------------------------------------------
    // hashCode()
    //---------------------------------------------------------------

    @Test
    public void testHashCode_matchesNameHashCode() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals("days".hashCode(), field.hashCode());
    }

    //---------------------------------------------------------------
    // toString()
    //---------------------------------------------------------------

    @Test
    public void testToString_format() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        assertEquals("UnsupportedDurationField[days]", field.toString());
    }

    //---------------------------------------------------------------
    // readResolve() - private method via reflection
    //---------------------------------------------------------------

    @Test
    public void testReadResolve_returnsSameSingletonInstance() throws Exception {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        Method readResolveMethod = UnsupportedDurationField.class.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        Object resolved = readResolveMethod.invoke(field);
        assertSame(field, resolved);
    }

    //---------------------------------------------------------------
    // Serialization end-to-end (exercises readResolve via real stream)
    //---------------------------------------------------------------

    @Test
    public void testSerialization_preservesSingletonViaReadResolve() throws Exception {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(field);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        // readResolve ทำให้ deserialized instance กลับมาเป็น instance เดียวกับใน cache
        assertSame(field, deserialized);
    }
}
