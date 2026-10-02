package org.mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;

/**
 * Unit test สำหรับ org.mockito.Matchers (Defects4J Mockito-35b)
 *
 * หมายเหตุ: คลาสเป้าหมายไม่มี if/else หรือ loop ดังนั้น "branch" ในที่นี้
 * หมายถึงการครอบคลุมทุก public static method (รวม overload) อย่างน้อย 1 ครั้ง
 * พร้อมค่า boundary / null / empty ตามที่ Javadoc รับประกัน
 */
public class MatchersTest {

    // คลาส dummy สำหรับทดสอบ matcher ที่รับ Class<T>
    static class Dummy {}

    // ---------------- any* primitive ----------------

    @Test
    public void testAnyBoolean() {
        assertFalse(anyBoolean());
    }

    @Test
    public void testAnyByte() {
        assertEquals(0, anyByte());
    }

    @Test
    public void testAnyChar() {
        assertEquals(0, anyChar()); // '\u0000' == 0
    }

    @Test
    public void testAnyInt() {
        assertEquals(0, anyInt());
    }

    @Test
    public void testAnyLong() {
        assertEquals(0L, anyLong());
    }

    @Test
    public void testAnyFloat() {
        assertEquals(0f, anyFloat(), 0.0001);
    }

    @Test
    public void testAnyDouble() {
        assertEquals(0d, anyDouble(), 0.0001);
    }

    @Test
    public void testAnyShort() {
        assertEquals(0, anyShort());
    }

    @Test
    public void testAnyObject() {
        Object o = anyObject();
        assertNull(o);
    }

    @Test
    public void testAnyVararg() {
        Object o = anyVararg();
        assertNull(o);
    }

    @Test
    public void testAnyClass() {
        Dummy d = any(Dummy.class);
        assertNull(d);
    }

    @Test
    public void testAnyClassNullArg() {
        // edge case: ส่ง null class เข้าไป - ภายในไม่ได้ใช้ clazz เลย (เรียก anyObject())
        // ดังนั้นคาดว่าไม่ throw exception และคืน null
        Object d = any((Class) null);
        assertNull(d);
    }

    @Test
    public void testAnyNoArg() {
        Object o = any();
        assertNull(o);
    }

    @Test
    public void testAnyString() {
        String s = anyString();
        assertNotNull(s);
        assertEquals("", s);
    }

    @Test
    public void testAnyList() {
        List l = anyList();
        assertNotNull(l);
        assertTrue(l.isEmpty());
    }

    @Test
    public void testAnyListOf() {
        List<String> l = anyListOf(String.class);
        assertNotNull(l);
        assertTrue(l.isEmpty());
    }

    @Test
    public void testAnySet() {
        Set s = anySet();
        assertNotNull(s);
        assertTrue(s.isEmpty());
    }

    @Test
    public void testAnySetOf() {
        Set<String> s = anySetOf(String.class);
        assertNotNull(s);
        assertTrue(s.isEmpty());
    }

    @Test
    public void testAnyMap() {
        Map m = anyMap();
        assertNotNull(m);
        assertTrue(m.isEmpty());
    }

    @Test
    public void testAnyCollection() {
        // source คืนค่าจาก returnList() -> ควรเป็น List ที่ว่าง (ถือเป็น Collection)
        Collection c = anyCollection();
        assertNotNull(c);
        assertTrue(c.isEmpty());
    }

    @Test
    public void testAnyCollectionOf() {
        Collection<String> c = anyCollectionOf(String.class);
        assertNotNull(c);
        assertTrue(c.isEmpty());
    }

    // ---------------- isA ----------------

    @Test
    public void testIsA() {
        Dummy d = isA(Dummy.class);
        assertNull(d);
    }

    // ---------------- eq overloads (boundary values) ----------------

    @Test
    public void testEqBooleanTrue() {
        assertFalse(eq(true));
    }

    @Test
    public void testEqBooleanFalse() {
        assertFalse(eq(false));
    }

    @Test
    public void testEqByteBoundaries() {
        assertEquals(0, eq(Byte.MIN_VALUE));
        assertEquals(0, eq(Byte.MAX_VALUE));
        assertEquals(0, eq((byte) 0));
    }

    @Test
    public void testEqCharBoundaries() {
        assertEquals(0, eq(Character.MIN_VALUE));
        assertEquals(0, eq(Character.MAX_VALUE));
    }

    @Test
    public void testEqDoubleBoundaries() {
        assertEquals(0d, eq(Double.MIN_VALUE), 0.0001);
        assertEquals(0d, eq(Double.MAX_VALUE), 0.0001);
        assertEquals(0d, eq(Double.NaN), 0.0001);
    }

    @Test
    public void testEqFloatBoundaries() {
        assertEquals(0f, eq(Float.MIN_VALUE), 0.0001);
        assertEquals(0f, eq(Float.MAX_VALUE), 0.0001);
        assertEquals(0f, eq(Float.NaN), 0.0001);
    }

    @Test
    public void testEqIntBoundaries() {
        assertEquals(0, eq(Integer.MIN_VALUE));
        assertEquals(0, eq(Integer.MAX_VALUE));
        assertEquals(0, eq(0));
    }

    @Test
    public void testEqLongBoundaries() {
        assertEquals(0L, eq(Long.MIN_VALUE));
        assertEquals(0L, eq(Long.MAX_VALUE));
    }

    @Test
    public void testEqShortBoundaries() {
        assertEquals(0, eq(Short.MIN_VALUE));
        assertEquals(0, eq(Short.MAX_VALUE));
    }

    @Test
    public void testEqObject() {
        String s = eq("hello");
        assertNull(s);
    }

    @Test
    public void testEqObjectNull() {
        // overload resolution จะไปที่ eq(T value) เพราะไม่มี eq(String) explicit
        String s = eq((String) null);
        assertNull(s);
    }

    // ---------------- refEq ----------------

    @Test
    public void testRefEqNoExcludes() {
        Dummy d = refEq(new Dummy());
        assertNull(d);
    }

    @Test
    public void testRefEqWithExcludes() {
        Dummy d = refEq(new Dummy(), "field1", "field2");
        assertNull(d);
    }

    @Test
    public void testRefEqEmptyExcludeArray() {
        // varargs ว่าง (ไม่ส่ง excludeFields เลย) vs ส่ง array ว่างชัดเจน
        Dummy d = refEq(new Dummy(), new String[0]);
        assertNull(d);
    }

    @Test
    public void testRefEqNullValue() {
        // edge case ไม่แน่ใจ behavior ภายใน ReflectionEquals เมื่อ value = null
        // จาก source ที่ให้มา constructor ReflectionEquals ไม่ได้แสดงการ validate
        // จึงคาดว่าไม่ throw ตอนนี้ (การ throw ถ้ามีจะเกิดตอน matches() ถูกเรียกจริง)
        Object d = refEq(null);
        assertNull(d);
    }

    // ---------------- same ----------------

    @Test
    public void testSame() {
        Dummy obj = new Dummy();
        Dummy d = same(obj);
        assertNull(d);
    }

    @Test
    public void testSameNull() {
        Object d = same(null);
        assertNull(d);
    }

    // ---------------- isNull / notNull / isNotNull ----------------

    @Test
    public void testIsNull() {
        assertNull(isNull());
    }

    @Test
    public void testNotNull() {
        assertNull(notNull());
    }

    @Test
    public void testIsNotNull() {
        // isNotNull() เป็น alias ที่เรียก notNull() ภายใน
        assertNull(isNotNull());
    }

    // ---------------- string matchers ----------------

    @Test
    public void testContains() {
        String s = contains("abc");
        assertEquals("", s);
    }

    @Test
    public void testContainsEmptyString() {
        String s = contains("");
        assertEquals("", s);
    }

    @Test
    public void testContainsNull() {
        // edge case: source ไม่ validate null substring
        String s = contains(null);
        assertEquals("", s);
    }

    @Test
    public void testMatches() {
        String s = matches("[a-z]+");
        assertEquals("", s);
    }

    @Test
    public void testMatchesEmptyRegex() {
        String s = matches("");
        assertEquals("", s);
    }

    @Test
    public void testEndsWith() {
        String s = endsWith("xyz");
        assertEquals("", s);
    }

    @Test
    public void testStartsWith() {
        String s = startsWith("abc");
        assertEquals("", s);
    }

    // ---------------- custom matcher *That ----------------

    /** matcher hamcrest แบบง่าย ใช้เป็นอินพุตให้เมธอด xxxThat / argThat */
    private static <T> Matcher<T> dummyMatcher() {
        return new BaseMatcher<T>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }
            @Override
            public void describeTo(Description description) {
                description.appendText("dummyMatcher");
            }
        };
    }

    @Test
    public void testArgThat() {
        Dummy d = argThat(MatchersTest.<Dummy>dummyMatcher());
        assertNull(d);
    }

    @Test
    public void testCharThat() {
        char c = charThat(MatchersTest.<Character>dummyMatcher());
        assertEquals(0, c);
    }

    @Test
    public void testBooleanThat() {
        boolean b = booleanThat(MatchersTest.<Boolean>dummyMatcher());
        assertFalse(b);
    }

    @Test
    public void testByteThat() {
        byte b = byteThat(MatchersTest.<Byte>dummyMatcher());
        assertEquals(0, b);
    }

    @Test
    public void testShortThat() {
        short s = shortThat(MatchersTest.<Short>dummyMatcher());
        assertEquals(0, s);
    }

    @Test
    public void testIntThat() {
        int i = intThat(MatchersTest.<Integer>dummyMatcher());
        assertEquals(0, i);
    }

    @Test
    public void testLongThat() {
        long l = longThat(MatchersTest.<Long>dummyMatcher());
        assertEquals(0L, l);
    }

    @Test
    public void testFloatThat() {
        float f = floatThat(MatchersTest.<Float>dummyMatcher());
        assertEquals(0f, f, 0.0001);
    }

    @Test
    public void testDoubleThat() {
        double d = doubleThat(MatchersTest.<Double>dummyMatcher());
        assertEquals(0d, d, 0.0001);
    }
}
