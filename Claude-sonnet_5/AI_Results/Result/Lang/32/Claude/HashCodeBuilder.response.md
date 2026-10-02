# HashCodeBuilderTest - JUnit 4 Test Suite

## คำอธิบายแนวทางการทดสอบ

- ทดสอบทุก constructor overload (ทั้ง 4 branch ของการ validate initial/multiplier)
- ทดสอบ `append(...)` ทุก overload ทั้ง primitive, primitive array (null/empty/multiple element เพื่อ cover loop 0/1+ ครั้ง), `Object`, `Object[]`
- ทดสอบ `append(Object)` ให้ครบทุก branch ของ `instanceof` chain (8 ชนิด array ดั้งเดิม + fallback เป็น `Object[]`) และกรณี non-array / null
- ทดสอบ static `reflectionHashCode` ทุก overload: null-check, exclude fields (String[]/Collection), transient flag, reflectUpToClass loop (เข้า/ไม่เข้า while), static field exclusion, synthetic field (`$`) exclusion
- ใช้สิทธิ์ package-private เพื่อทดสอบ `register/unregister/isRegistered/getRegistry` ตรง ๆ และ "จำลอง" กรณี object ถูก register ไว้ก่อน เพื่อ cover branch `if (isRegistered(object)) return;` ซึ่งไม่สามารถถูกกระตุ้นผ่าน public API ตามปกติได้ (เพราะ `append(Object)` ไม่เรียก `reflectionAppend` ซ้อนกัน) — มีคอมเมนต์กำกับไว้ในโค้ด
- หมายเหตุเรื่อง field-ordering จาก `getDeclaredFields()`: ไม่มีการันตีลำดับตาม JLS แต่ในทางปฏิบัติ (HotSpot) จะคืนตามลำดับประกาศ — ได้ออกแบบ fixture ให้มี field เดียวต่อคลาสในกรณีที่ต้องเทียบค่าตรง ๆ เพื่อลด risk จากสมมติฐานนี้ (คอมเมนต์กำกับไว้)

```java
package org.apache.commons.lang3.builder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

/**
 * JUnit4 test suite for {@link HashCodeBuilder} (Defects4J Lang-32b).
 *
 * Test class is placed in the same package as the target class so that
 * package-private static helper methods (getRegistry/isRegistered/register/unregister)
 * can be exercised directly for branch coverage of {@code reflectionAppend}.
 */
public class HashCodeBuilderTest {

    // =====================================================================
    // Fixture classes
    // =====================================================================

    /** Two instance fields (a,b), one static field, one transient field. */
    static class SimpleFixture {
        private int a;
        private String b;
        private static int s = 999;
        @SuppressWarnings("unused")
        private transient int t = 123;

        SimpleFixture(int a, String b) {
            this.a = a;
            this.b = b;
        }

        static void setStatic(int v) {
            s = v;
        }
    }

    /** Only a single transient field -> deterministic result for transient tests. */
    static class OnlyTransientFixture {
        @SuppressWarnings("unused")
        private transient int t;

        OnlyTransientFixture(int t) {
            this.t = t;
        }
    }

    /** Single field per class to make reflectUpToClass results deterministic. */
    static class SuperFixture {
        private int superField;

        SuperFixture(int v) {
            this.superField = v;
        }
    }

    static class SubFixture extends SuperFixture {
        private int subField;

        SubFixture(int sub, int sup) {
            super(sup);
            this.subField = sub;
        }
    }

    /** Self-referencing object - sanity check that reflectionHashCode does not hang/throw. */
    static class CyclicFixture {
        CyclicFixture self;
    }

    /**
     * Non-static inner class: compiler generates a synthetic field (commonly named
     * "this$0") referencing the outer instance. Its name contains '$', so it must be
     * skipped by reflectionAppend's "(field.getName().indexOf('$') == -1)" check.
     */
    class InnerFixture {
        @SuppressWarnings("unused")
        private int val;

        InnerFixture(int val) {
            this.val = val;
        }
    }

    // =====================================================================
    // Constructor tests
    // =====================================================================

    @Test
    public void testDefaultConstructor() {
        HashCodeBuilder b = new HashCodeBuilder();
        assertEquals(17, b.toHashCode());
    }

    @Test
    public void testConstructorValid() {
        HashCodeBuilder b = new HashCodeBuilder(3, 5);
        assertEquals(3, b.toHashCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInitialZero() {
        new HashCodeBuilder(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInitialEven() {
        new HashCodeBuilder(4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMultiplierZero() {
        new HashCodeBuilder(3, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMultiplierEven() {
        new HashCodeBuilder(3, 4);
    }

    // =====================================================================
    // append(boolean) / append(boolean[])
    // =====================================================================

    @Test
    public void testAppendBooleanTrue() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(true);
        assertEquals(1 * 3 + 0, b.toHashCode());
    }

    @Test
    public void testAppendBooleanFalse() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(false);
        assertEquals(1 * 3 + 1, b.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((boolean[]) null);
        assertEquals(1 * 3, b.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new boolean[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendBooleanArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append(true).append(false).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new boolean[] { true, false }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(byte) / append(byte[])
    // =====================================================================

    @Test
    public void testAppendByte() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((byte) 5);
        assertEquals(1 * 3 + 5, b.toHashCode());
    }

    @Test
    public void testAppendByteArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((byte[]) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendByteArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new byte[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendByteArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append((byte) 2).append((byte) 7).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new byte[] { 2, 7 }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(char) / append(char[])
    // =====================================================================

    @Test
    public void testAppendChar() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append('a');
        assertEquals(1 * 3 + (int) 'a', b.toHashCode());
    }

    @Test
    public void testAppendCharArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((char[]) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendCharArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new char[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendCharArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append('x').append('y').toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new char[] { 'x', 'y' }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(double) / append(double[])
    // =====================================================================

    @Test
    public void testAppendDouble() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(2.5d);
        long bits = Double.doubleToLongBits(2.5d);
        int expectedDelta = (int) (bits ^ (bits >> 32));
        assertEquals(1 * 3 + expectedDelta, b.toHashCode());
    }

    @Test
    public void testAppendDoubleArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((double[]) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendDoubleArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new double[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendDoubleArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append(1.1d).append(2.2d).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new double[] { 1.1d, 2.2d }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(float) / append(float[])
    // =====================================================================

    @Test
    public void testAppendFloat() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(2.5f);
        assertEquals(1 * 3 + Float.floatToIntBits(2.5f), b.toHashCode());
    }

    @Test
    public void testAppendFloatArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((float[]) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendFloatArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new float[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendFloatArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append(1.5f).append(2.5f).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new float[] { 1.5f, 2.5f }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(int) / append(int[])
    // =====================================================================

    @Test
    public void testAppendInt() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(9);
        assertEquals(1 * 3 + 9, b.toHashCode());
    }

    @Test
    public void testAppendIntArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((int[]) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendIntArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new int[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendIntArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append(4).append(5).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new int[] { 4, 5 }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(long) / append(long[])
    // =====================================================================

    @Test
    public void testAppendLong() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        long v = 123456789012345L;
        b.append(v);
        assertEquals(1 * 3 + (int) (v ^ (v >> 32)), b.toHashCode());
    }

    @Test
    public void testAppendLongArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((long[]) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendLongArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new long[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendLongArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append(10L).append(20L).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new long[] { 10L, 20L }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(short) / append(short[])
    // =====================================================================

    @Test
    public void testAppendShort() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((short) 7);
        assertEquals(1 * 3 + 7, b.toHashCode());
    }

    @Test
    public void testAppendShortArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((short[]) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendShortArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new short[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendShortArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append((short) 3).append((short) 4).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new short[] { 3, 4 }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(Object) - covers null / non-array / instanceof chain / fallback
    // =====================================================================

    @Test
    public void testAppendObjectNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((Object) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendObjectNonArray() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        String s = "hello";
        b.append((Object) s);
        assertEquals(1 * 3 + s.hashCode(), b.toHashCode());
    }

    @Test
    public void testAppendObjectLongArray() {
        long[] arr = { 1L, 2L };
        int expected = new HashCodeBuilder(1, 3).append(arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendObjectIntArray() {
        int[] arr = { 1, 2 };
        int expected = new HashCodeBuilder(1, 3).append(arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendObjectShortArray() {
        short[] arr = { 1, 2 };
        int expected = new HashCodeBuilder(1, 3).append(arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendObjectCharArray() {
        char[] arr = { 'a', 'b' };
        int expected = new HashCodeBuilder(1, 3).append(arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendObjectByteArray() {
        byte[] arr = { 1, 2 };
        int expected = new HashCodeBuilder(1, 3).append(arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendObjectDoubleArray() {
        double[] arr = { 1.1, 2.2 };
        int expected = new HashCodeBuilder(1, 3).append(arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendObjectFloatArray() {
        float[] arr = { 1.1f, 2.2f };
        int expected = new HashCodeBuilder(1, 3).append(arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendObjectBooleanArray() {
        boolean[] arr = { true, false };
        int expected = new HashCodeBuilder(1, 3).append(arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testAppendObjectObjectArrayFallback() {
        // String[] is not a primitive array -> falls into the final "else" branch
        // -> append((Object[]) object)
        String[] arr = { "a", "b" };
        int expected = new HashCodeBuilder(1, 3).append((Object[]) arr).toHashCode();
        int actual = new HashCodeBuilder(1, 3).append((Object) arr).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // append(Object[])
    // =====================================================================

    @Test
    public void testAppendObjectArrayNull() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append((Object[]) null);
        assertEquals(3, b.toHashCode());
    }

    @Test
    public void testAppendObjectArrayEmpty() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.append(new Object[0]);
        assertEquals(1, b.toHashCode());
    }

    @Test
    public void testAppendObjectArrayMultiple() {
        int expected = new HashCodeBuilder(1, 3).append((Object) "a").append((Object) "b").toHashCode();
        int actual = new HashCodeBuilder(1, 3).append(new Object[] { "a", "b" }).toHashCode();
        assertEquals(expected, actual);
    }

    // =====================================================================
    // appendSuper / toHashCode / hashCode
    // =====================================================================

    @Test
    public void testAppendSuper() {
        HashCodeBuilder b = new HashCodeBuilder(1, 3);
        b.appendSuper(99);
        assertEquals(1 * 3 + 99, b.toHashCode());
    }

    @Test
    public void testHashCodeDelegatesToToHashCode() {
        HashCodeBuilder b = new HashCodeBuilder(5, 7);
        b.append(10);
        assertEquals(b.toHashCode(), b.hashCode());
    }

    // =====================================================================
    // reflectionHashCode: null-object checks for every overload
    // =====================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNull_IntIntObject() {
        HashCodeBuilder.reflectionHashCode(17, 37, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNull_IntIntObjectBoolean() {
        HashCodeBuilder.reflectionHashCode(17, 37, null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNull_FiveArgGeneric() {
        HashCodeBuilder.<Object>reflectionHashCode(17, 37, null, true, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNull_SixArgGeneric() {
        HashCodeBuilder.<Object>reflectionHashCode(17, 37, null, true, null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNull_ObjectOnly() {
        HashCodeBuilder.reflectionHashCode((Object) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNull_ObjectBoolean() {
        HashCodeBuilder.reflectionHashCode(null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNull_ObjectStringArray() {
        HashCodeBuilder.reflectionHashCode(null, (String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNull_ObjectCollection() {
        HashCodeBuilder.reflectionHashCode(null, (Collection<String>) null);
    }

    // =====================================================================
    // reflectionHashCode: field inclusion / exclusion logic
    // =====================================================================

    @Test
    public void testReflectionHashCodeConsistency() {
        SimpleFixture f = new SimpleFixture(5, "hello");
        int h1 = HashCodeBuilder.reflectionHashCode(f);
        int h2 = HashCodeBuilder.reflectionHashCode(f);
        assertEquals(h1, h2);
    }

    @Test
    public void testReflectionHashCodeStaticFieldExcluded() {
        SimpleFixture f = new SimpleFixture(5, "hello");
        int h1 = HashCodeBuilder.reflectionHashCode(f);
        SimpleFixture.setStatic(123456); // mutate static field value
        int h2 = HashCodeBuilder.reflectionHashCode(f);
        assertEquals("static field must always be excluded (Modifier.isStatic branch)", h1, h2);
    }

    @Test
    public void testReflectionHashCodeExcludeAllFields_StringArray() {
        SimpleFixture f = new SimpleFixture(5, "hello");
        int h = HashCodeBuilder.reflectionHashCode(f, new String[] { "a", "b" });
        // no field appended -> builder stays at its initial value (17)
        assertEquals(17, h);
    }

    @Test
    public void testReflectionHashCodeExcludeAllFields_Collection() {
        SimpleFixture f = new SimpleFixture(5, "hello");
        List<String> excludes = new ArrayList<String>();
        excludes.add("a");
        excludes.add("b");
        int h = HashCodeBuilder.reflectionHashCode(f, excludes);
        assertEquals(17, h);
    }

    @Test
    public void testReflectionHashCodeExcludeSingleField() {
        SimpleFixture f = new SimpleFixture(5, "hello");
        // exclude "b" -> only "a" (value=5) contributes, regardless of field iteration order
        int h = HashCodeBuilder.reflectionHashCode(17, 37, f, false, null, new String[] { "b" });
        assertEquals(17 * 37 + 5, h);
    }

    @Test
    public void testReflectionHashCodeNoExclude_NullExcludeArray() {
        // excludeFields == null -> ArrayUtils.contains(null, name) must be false (no exclusion)
        SimpleFixture f = new SimpleFixture(5, "hello");
        int h = HashCodeBuilder.reflectionHashCode(f, (String[]) null);
        assertNotEquals(17, h); // at least one field contributed
    }

    // =====================================================================
    // reflectionHashCode: transient field handling
    // =====================================================================

    @Test
    public void testReflectionHashCodeTransientExcludedByDefault() {
        OnlyTransientFixture f = new OnlyTransientFixture(5);
        int h = HashCodeBuilder.reflectionHashCode(17, 37, f, false);
        assertEquals(17, h); // transient field skipped -> nothing appended
    }

    @Test
    public void testReflectionHashCodeTransientIncludedWhenRequested() {
        OnlyTransientFixture f = new OnlyTransientFixture(5);
        int h = HashCodeBuilder.reflectionHashCode(17, 37, f, true);
        assertEquals(17 * 37 + 5, h);
    }

    // =====================================================================
    // reflectionHashCode: reflectUpToClass / superclass while-loop
    // =====================================================================

    @Test
    public void testReflectionHashCodeReflectUpToOwnClass_WhileNotEntered() {
        SubFixture f = new SubFixture(5, 10);
        int h = HashCodeBuilder.reflectionHashCode(17, 37, f, false, SubFixture.class);
        assertEquals(17 * 37 + 5, h); // superField excluded, while loop body never runs
    }

    @Test
    public void testReflectionHashCodeReflectUpToNull_WhileEntered() {
        SubFixture f = new SubFixture(5, 10);
        int h = HashCodeBuilder.reflectionHashCode(17, 37, f, false, null);
        int expected = new HashCodeBuilder(17, 37).append(5).append(10).toHashCode();
        assertEquals(expected, h);
    }

    @Test
    public void testReflectionHashCodeReflectUpToSuperClass_WhileEnteredOnce() {
        SubFixture f = new SubFixture(5, 10);
        int h = HashCodeBuilder.reflectionHashCode(17, 37, f, false, SuperFixture.class);
        int expected = new HashCodeBuilder(17, 37).append(5).append(10).toHashCode();
        assertEquals(expected, h);
    }

    @Test
    public void testReflectionHashCodeFourArgOverloadDelegatesCorrectly() {
        SubFixture f = new SubFixture(5, 10);
        int h1 = HashCodeBuilder.reflectionHashCode(17, 37, f, false, SubFixture.class);
        int h2 = HashCodeBuilder.reflectionHashCode(17, 37, f, false, SubFixture.class, null);
        assertEquals(h1, h2);
    }

    // =====================================================================
    // reflectionHashCode: synthetic field ($) is skipped
    // =====================================================================

    @Test
    public void testReflectionHashCodeSkipsSyntheticOuterReferenceField() {
        InnerFixture f = this.new InnerFixture(5);
        int h = HashCodeBuilder.reflectionHashCode(f);
        // Only 'val' is appended; the compiler-generated outer reference field
        // (name typically "this$0", containing '$') must be skipped.
        assertEquals(17 * 37 + 5, h);
    }

    // =====================================================================
    // reflectionHashCode: cyclic reference - no crash sanity check
    // NOTE: based on this source version, append(Object) for a non-array object calls
    // object.hashCode() directly and does NOT re-enter reflectionAppend, so the
    // registry guard is not actually exercised through this path. This test only
    // confirms no exception/hang occurs; see the direct registry tests below for the
    // actual branch coverage of isRegistered().
    // =====================================================================

    @Test
    public void testReflectionHashCodeHandlesSelfReferenceWithoutException() {
        CyclicFixture f = new CyclicFixture();
        f.self = f;
        HashCodeBuilder.reflectionHashCode(f); // must not throw / hang
    }

    // =====================================================================
    // Direct tests of package-private registry helpers
    // (covers isRegistered true/false branches and register/unregister)
    // =====================================================================

    @Test
    public void testRegisterIsRegisteredUnregisterLifecycle() {
        Object o = new Object();
        assertFalse(HashCodeBuilder.isRegistered(o));
        HashCodeBuilder.register(o);
        assertTrue(HashCodeBuilder.isRegistered(o));
        HashCodeBuilder.unregister(o);
        assertFalse(HashCodeBuilder.isRegistered(o));
    }

    @Test
    public void testGetRegistryNotNull() {
        assertNotNull(HashCodeBuilder.getRegistry());
    }

    /**
     * Simulates the "isRegistered(object) == true" early-return branch inside the
     * private reflectionAppend(...) method by pre-registering the object via the
     * package-private register() method before invoking the public reflectionHashCode API.
     * Since reflectionAppend returns immediately without appending or re-registering,
     * the builder keeps its initial value for every pass (own class + all superclasses).
     */
    @Test
    public void testReflectionAppendEarlyReturnWhenAlreadyRegistered() {
        SimpleFixture f = new SimpleFixture(5, "hello");
        HashCodeBuilder.register(f);
        try {
            int h = HashCodeBuilder.reflectionHashCode(f);
            assertEquals(17, h); // nothing ever appended
        } finally {
            HashCodeBuilder.unregister(f); // cleanup so other tests are unaffected
        }
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor*` (6 เมธอด) | 4 if-branch ใน constructor(int,int): initial==0, initial%2==0, multiplier==0, multiplier%2==0, และ path ปกติ (valid) |
| `testAppendBoolean*`, `testAppendByte*`, ..., `testAppendShort*` (array versions) | null-check (`array==null` true/false) + loop 0 รอบ (empty) และ ≥1 รอบ (multiple) ของทุก primitive array overload |
| `testAppendObject*` (10 เมธอด) | `append(Object)`: null-check, `isArray()` true/false, ทุกสาขาของ `instanceof` chain (long[],int[],short[],char[],byte[],double[],float[],boolean[]) และ else-fallback เป็น `Object[]` |
| `testAppendObjectArray*` | `append(Object[])`: null-check + loop 0/≥1 รอบ |
| `testAppendSuper`, `testHashCodeDelegatesToToHashCode` | สูตรคำนวณ appendSuper และการ delegate ของ `hashCode()` → `toHashCode()` |
| `testReflectionHashCodeNull_*` (8 เมธอด) | branch `if (object==null) throw` ของทุก public overload ของ `reflectionHashCode` |
| `testReflectionHashCodeConsistency`, `StaticFieldExcluded` | branch `Modifier.isStatic(...)` → true (ถูก exclude เสมอ) |
| `testReflectionHashCodeExcludeAllFields_*`, `ExcludeSingleField`, `NoExclude_NullExcludeArray` | branch `ArrayUtils.contains(excludeFields, name)` ทั้ง true/false รวมถึงกรณี excludeFields เป็น null |
| `testReflectionHashCodeTransient*` | branch `(useTransients \|\| !Modifier.isTransient(...))` ทั้ง true/false |
| `testReflectionHashCodeReflectUpTo*`, `FourArgOverloadDelegatesCorrectly` | เงื่อนไข while-loop `clazz.getSuperclass()!=null && clazz!=reflectUpToClass` ทั้งกรณีไม่เข้า loop, เข้า loop 1 ครั้ง, เข้า loop จนถึง Object; และการ delegate ของ overload 5 args → 6 args |
| `testReflectionHashCodeSkipsSyntheticOuterReferenceField` | branch `field.getName().indexOf('$') == -1` → false (ถูก skip) |
| `testReflectionHashCodeHandlesSelfReferenceWithoutException` | sanity ว่าไม่เกิด exception/hang กับ self-reference (ดูคอมเมนต์ข้อจำกัดในโค้ด) |
| `testRegisterIsRegisteredUnregisterLifecycle`, `testGetRegistryNotNull` | `isRegistered` true/false, `register`, `unregister`, `getRegistry` โดยตรง (package-private) |
| `testReflectionAppendEarlyReturnWhenAlreadyRegistered` | branch `if (isRegistered(object)) return;` → true ภายใน `reflectionAppend` (จำลองผ่าน register() ก่อนเรียก public API) |

**หมายเหตุ/ข้อจำกัดที่ระบุไว้ในคอมเมนต์โค้ด:**
1. `isRegistered==true` ตามการไหลปกติของโค้ดที่ให้มาไม่สามารถถูกกระตุ้นผ่าน public API ได้จริง (เพราะ `append(Object)` ไม่เรียก `reflectionAppend` ซ้อนกัน) จึงใช้การเข้าถึง package-private method จำลองสถานการณ์แทน
2. สมมติฐานเรื่องลำดับ field จาก `getDeclaredFields()` — ออกแบบ fixture ให้มี field เดียวต่อคลาสในกรณีที่ต้องเทียบค่า exact เพื่อลดความเสี่ยงจาก JVM-dependent ordering