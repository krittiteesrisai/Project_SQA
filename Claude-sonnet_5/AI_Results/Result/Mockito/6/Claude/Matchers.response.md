# วิเคราะห์ซอร์สโค้ด

คลาส `Matchers` เป็น **facade/utility class** ที่ประกอบด้วยเมธอด static เกือบทั้งหมดเป็นการ **delegate ตรงไปยัง `reportMatcher(...).returnXxx()`** โดยไม่มี `if/else/switch/loop` ที่มองเห็นได้ในซอร์สที่ให้มาเลย ดังนั้น "branch coverage" ในเชิง control-flow ของไฟล์นี้จึงเท่ากับ 100% โดยธรรมชาติถ้าทุกเมธอดถูกเรียก (ไม่มี conditional jump ให้ครอบคลุม)

กลยุทธ์การทดสอบที่เลือกใช้คือ:
1. **เรียกทุก public static method** พร้อมค่า boundary/null/edge-case เพื่อยืนยันค่า return ตาม contract ใน javadoc/ชื่อเมธอดที่ปรากฏในซอร์ส (`returnFalse/returnZero/returnChar/returnNull/returnString/returnList/returnSet/returnMap`)
2. **เพิ่ม integration test กับ `Mockito.mock()` จริง** เพื่อตรวจสอบว่า matcher ที่ถูก `report` ไปทำงานถูกต้องจริงในสถานการณ์ `when/verify` (เพิ่มโอกาสดักจับ fault ที่ไม่สามารถเห็นได้จากการเช็คค่า dummy return อย่างเดียว)
3. สำหรับพฤติกรรมที่ **ไม่มีอยู่ในซอร์สที่ให้มา** (เช่น `HandyReturnValues.returnFor(T value)` หรือ constructor ของ `Contains`/`InstanceOf` รับ `null` อย่างไร) จะมี **คอมเมนต์กำกับความไม่แน่ใจ** ไว้ในเทส

```java
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.Test;
import org.hamcrest.core.IsNull;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import org.mockito.Matchers; // import คลาสเป้าหมาย

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Collection;

@SuppressWarnings("unchecked")
public class MatchersTest {

    // =========================================================
    // 1) "any*" family: ตรวจค่า dummy return ตาม javadoc/ชื่อเมธอด
    // =========================================================

    @Test
    public void anyBoolean_returnsFalse() {
        assertFalse(Matchers.anyBoolean());
    }

    @Test
    public void anyByte_returnsZero() {
        assertEquals((byte) 0, Matchers.anyByte());
    }

    @Test
    public void anyChar_returnsZeroChar() {
        assertEquals('\u0000', Matchers.anyChar());
    }

    @Test
    public void anyInt_returnsZero() {
        assertEquals(0, Matchers.anyInt());
    }

    @Test
    public void anyLong_returnsZero() {
        assertEquals(0L, Matchers.anyLong());
    }

    @Test
    public void anyFloat_returnsZero() {
        assertEquals(0f, Matchers.anyFloat(), 0.0f);
    }

    @Test
    public void anyDouble_returnsZero() {
        assertEquals(0d, Matchers.anyDouble(), 0.0d);
    }

    @Test
    public void anyShort_returnsZero() {
        assertEquals((short) 0, Matchers.anyShort());
    }

    @Test
    public void anyObject_returnsNull() {
        assertNull(Matchers.anyObject());
    }

    @Test
    public void anyVararg_returnsNull() {
        assertNull(Matchers.anyVararg());
    }

    @Test
    public void anyClass_returnsNull() {
        assertNull(Matchers.any(String.class));
        assertNull(Matchers.any(List.class));
    }

    @Test
    public void anyNoArg_returnsNull() {
        assertNull(Matchers.any());
    }

    @Test
    public void anyString_returnsEmptyString() {
        assertEquals("", Matchers.anyString());
    }

    @Test
    public void anyList_returnsEmptyMutableList() {
        List list = Matchers.anyList();
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void anyListOf_returnsEmptyList() {
        List<String> list = Matchers.anyListOf(String.class);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void anySet_returnsEmptySet() {
        Set set = Matchers.anySet();
        assertNotNull(set);
        assertTrue(set.isEmpty());
    }

    @Test
    public void anySetOf_returnsEmptySet() {
        Set<Integer> set = Matchers.anySetOf(Integer.class);
        assertNotNull(set);
        assertTrue(set.isEmpty());
    }

    @Test
    public void anyMap_returnsEmptyMap() {
        Map map = Matchers.anyMap();
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

    @Test
    public void anyMapOf_returnsEmptyMap() {
        Map<String, Integer> map = Matchers.anyMapOf(String.class, Integer.class);
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

    @Test
    public void anyCollection_returnsEmptyCollection() {
        Collection col = Matchers.anyCollection();
        assertNotNull(col);
        assertTrue(col.isEmpty());
    }

    @Test
    public void anyCollectionOf_returnsEmptyCollection() {
        Collection<String> col = Matchers.anyCollectionOf(String.class);
        assertNotNull(col);
        assertTrue(col.isEmpty());
    }

    @Test
    public void isA_returnsNull() {
        assertNull(Matchers.isA(String.class));
        assertNull(Matchers.isA(Integer.class));
    }

    // =========================================================
    // 2) eq(*) family: ตรวจค่า dummy + boundary values
    // =========================================================

    @Test
    public void eqBoolean_returnsFalse() {
        assertFalse(Matchers.eq(true));
        assertFalse(Matchers.eq(false));
    }

    @Test
    public void eqByte_returnsZero_boundaries() {
        assertEquals((byte) 0, Matchers.eq(Byte.MIN_VALUE));
        assertEquals((byte) 0, Matchers.eq(Byte.MAX_VALUE));
        assertEquals((byte) 0, Matchers.eq((byte) 0));
    }

    @Test
    public void eqChar_returnsZeroChar_boundaries() {
        assertEquals('\u0000', Matchers.eq(Character.MIN_VALUE));
        assertEquals('\u0000', Matchers.eq(Character.MAX_VALUE));
    }

    @Test
    public void eqDouble_returnsZero_boundaries() {
        assertEquals(0d, Matchers.eq(Double.MIN_VALUE), 0.0);
        assertEquals(0d, Matchers.eq(Double.MAX_VALUE), 0.0);
        assertEquals(0d, Matchers.eq(Double.NaN), 0.0);
        assertEquals(0d, Matchers.eq(0.0), 0.0);
    }

    @Test
    public void eqFloat_returnsZero_boundaries() {
        assertEquals(0f, Matchers.eq(Float.MIN_VALUE), 0.0f);
        assertEquals(0f, Matchers.eq(Float.MAX_VALUE), 0.0f);
    }

    @Test
    public void eqInt_returnsZero_boundaries() {
        assertEquals(0, Matchers.eq(Integer.MIN_VALUE));
        assertEquals(0, Matchers.eq(Integer.MAX_VALUE));
        assertEquals(0, Matchers.eq(0));
    }

    @Test
    public void eqLong_returnsZero_boundaries() {
        assertEquals(0L, Matchers.eq(Long.MIN_VALUE));
        assertEquals(0L, Matchers.eq(Long.MAX_VALUE));
    }

    @Test
    public void eqShort_returnsZero_boundaries() {
        assertEquals((short) 0, Matchers.eq(Short.MIN_VALUE));
        assertEquals((short) 0, Matchers.eq(Short.MAX_VALUE));
    }

    @Test
    public void eqObject_returnsNull() {
        assertNull(Matchers.eq("hello"));
        assertNull(Matchers.<Object>eq(new Object()));
        // หมายเหตุ: behavior ของ HandyReturnValues.returnFor(value) ไม่ได้แสดงในซอร์สที่ให้มา
        // อ้างอิงจาก javadoc ("@return null") เท่านั้น
        assertNull(Matchers.<Object>eq((Object) null));
    }

    @Test
    public void refEq_returnsNull_variousExcludeFields() {
        Object value = new Object();
        assertNull(Matchers.refEq(value));
        assertNull(Matchers.refEq(value, "field1"));
        assertNull(Matchers.refEq(value, "field1", "field2"));
        // หมายเหตุ: ReflectionEquals constructor รับ value=null ได้หรือไม่ ไม่ได้แสดงในซอร์สนี้
        assertNull(Matchers.refEq(null));
    }

    @Test
    public void same_returnsNull() {
        Object value = new Object();
        assertNull(Matchers.same(value));
        assertNull(Matchers.<Object>same(null));
    }

    @Test
    public void isNull_returnsNull() {
        assertNull(Matchers.isNull());
    }

    @Test
    public void isNullClass_returnsNull() {
        assertNull(Matchers.isNull(String.class));
    }

    @Test
    public void notNull_returnsNull() {
        assertNull(Matchers.notNull());
    }

    @Test
    public void notNullClass_returnsNull() {
        assertNull(Matchers.notNull(String.class));
    }

    @Test
    public void isNotNull_delegatesToNotNull() {
        assertNull(Matchers.isNotNull());
    }

    @Test
    public void isNotNullClass_delegatesToNotNullClass() {
        assertNull(Matchers.isNotNull(String.class));
    }

    @Test
    public void contains_returnsEmptyString() {
        assertEquals("", Matchers.contains("sub"));
        assertEquals("", Matchers.contains(""));
        // หมายเหตุ: ไม่มีการตรวจ null ใน Matchers#contains เอง;
        // สมมติว่า Contains(null) ไม่ throw ตอน construct (ไม่เห็น source ของ Contains)
        assertEquals("", Matchers.contains(null));
    }

    @Test
    public void matches_returnsEmptyString() {
        assertEquals("", Matchers.matches(".*"));
        assertEquals("", Matchers.matches(""));
    }

    @Test
    public void endsWith_returnsEmptyString() {
        assertEquals("", Matchers.endsWith("suffix"));
        assertEquals("", Matchers.endsWith(""));
    }

    @Test
    public void startsWith_returnsEmptyString() {
        assertEquals("", Matchers.startsWith("prefix"));
        assertEquals("", Matchers.startsWith(""));
    }

    @Test
    public void argThat_returnsNull() {
        assertNull(Matchers.argThat(IsNull.nullValue()));
    }

    @Test
    public void charThat_returnsZeroChar() {
        assertEquals('\u0000', Matchers.charThat(IsNull.nullValue(Character.class)));
    }

    @Test
    public void booleanThat_returnsFalse() {
        assertFalse(Matchers.booleanThat(IsNull.nullValue(Boolean.class)));
    }

    @Test
    public void byteThat_returnsZero() {
        assertEquals((byte) 0, Matchers.byteThat(IsNull.nullValue(Byte.class)));
    }

    @Test
    public void shortThat_returnsZero() {
        assertEquals((short) 0, Matchers.shortThat(IsNull.nullValue(Short.class)));
    }

    @Test
    public void intThat_returnsZero() {
        assertEquals(0, Matchers.intThat(IsNull.nullValue(Integer.class)));
    }

    @Test
    public void longThat_returnsZero() {
        assertEquals(0L, Matchers.longThat(IsNull.nullValue(Long.class)));
    }

    @Test
    public void floatThat_returnsZero() {
        assertEquals(0f, Matchers.floatThat(IsNull.nullValue(Float.class)), 0.0f);
    }

    @Test
    public void doubleThat_returnsZero() {
        assertEquals(0d, Matchers.doubleThat(IsNull.nullValue(Double.class)), 0.0);
    }

    // =========================================================
    // 3) Integration tests กับ Mockito.mock() จริง เพื่อยืนยันพฤติกรรม
    //    การ match จริง (เพิ่มโอกาสดักจับ fault นอกเหนือค่า return dummy)
    // =========================================================

    @Test
    public void anyInt_matchesAnyValueInRealMock() {
        List mockedList = mock(List.class);
        when(mockedList.get(Matchers.anyInt())).thenReturn("element");

        assertEquals("element", mockedList.get(0));
        assertEquals("element", mockedList.get(999));
        assertEquals("element", mockedList.get(Integer.MAX_VALUE));

        verify(mockedList, times(3)).get(Matchers.anyInt());
    }

    @Test
    public void eqInt_matchesExactValueInRealMock() {
        List mockedList = mock(List.class);
        mockedList.get(5);

        verify(mockedList).get(Matchers.eq(5));
    }

    @Test(expected = AssertionError.class)
    // หมายเหตุ: ใช้ AssertionError เพราะ Mockito verification exception
    // (เช่น ArgumentsAreDifferent) เป็น subclass ของ AssertionError ตามเอกสาร Mockito
    public void eqInt_doesNotMatchDifferentValue() {
        List mockedList = mock(List.class);
        mockedList.get(5);

        verify(mockedList).get(Matchers.eq(6));
    }

    @Test
    public void isA_matchesOnlyGivenType() {
        List mockedList = mock(List.class);
        mockedList.add("someString");

        verify(mockedList).add(Matchers.isA(String.class));
    }

    @Test(expected = AssertionError.class)
    public void isA_doesNotMatchDifferentType() {
        List mockedList = mock(List.class);
        mockedList.add("someString");

        verify(mockedList).add(Matchers.isA(Integer.class));
    }

    @Test
    public void contains_matchesSubstringInRealMock() {
        List mockedList = mock(List.class);
        mockedList.add("hello world");

        verify(mockedList).add(Matchers.contains("world"));
    }

    @Test(expected = AssertionError.class)
    public void contains_doesNotMatchMissingSubstring() {
        List mockedList = mock(List.class);
        mockedList.add("hello world");

        verify(mockedList).add(Matchers.contains("nowhere"));
    }

    @Test
    public void startsWith_matchesPrefixInRealMock() {
        List mockedList = mock(List.class);
        mockedList.add("hello world");

        verify(mockedList).add(Matchers.startsWith("hello"));
    }

    @Test
    public void isNull_matchesNullArgument() {
        List mockedList = mock(List.class);
        mockedList.add(null);

        verify(mockedList).add(Matchers.isNull());
    }

    @Test
    public void notNull_matchesNonNullArgument() {
        List mockedList = mock(List.class);
        mockedList.add("notNull");

        verify(mockedList).add(Matchers.notNull());
    }

    @Test(expected = AssertionError.class)
    public void notNull_doesNotMatchNullArgument() {
        List mockedList = mock(List.class);
        mockedList.add((String) null);

        verify(mockedList).add(Matchers.notNull());
    }

    @Test
    public void same_matchesOnlySameInstance() {
        List mockedList = mock(List.class);
        String value = "theValue";
        mockedList.add(value);

        verify(mockedList).add(Matchers.same(value));
    }

    @Test(expected = AssertionError.class)
    public void same_doesNotMatchEqualButDifferentInstance() {
        List mockedList = mock(List.class);
        mockedList.add(new String("theValue")); // สร้างคนละ instance ตั้งใจ

        verify(mockedList).add(Matchers.same("theValue"));
    }

    @Test
    public void argThat_customHamcrestMatcherWorksInRealMock() {
        List mockedList = mock(List.class);
        mockedList.add("abc");

        verify(mockedList).add(Matchers.argThat(new BaseMatcher<String>() {
            public boolean matches(Object item) {
                return item != null && item.toString().length() == 3;
            }
            public void describeTo(Description description) {
                description.appendText("a String of length 3");
            }
        }));
    }
}
```

## สรุปตาราง Coverage

| กลุ่มเทส | เมธอดของ `Matchers` ที่ถูกครอบคลุม | หมายเหตุ Branch/Condition |
|---|---|---|
| `any*_returnsZero/False/Null/Empty*` | `anyBoolean/anyByte/anyChar/anyInt/anyLong/anyFloat/anyDouble/anyShort/anyObject/anyVararg/any(Class)/any()/anyString/anyList*/anySet*/anyMap*/anyCollection*` | ไม่มี branch ในซอร์ส – ครอบคลุมทุก statement/line ของแต่ละเมธอด (method coverage 100%) |
| `isA_returnsNull` | `isA(Class)` | ทดสอบด้วยหลาย Class เพื่อ sanity check generic |
| `eq*_boundaries` | `eq(boolean/byte/char/double/float/int/long/short/T)` | ใช้ค่า MIN/MAX/0/NaN เป็น boundary value แต่ไม่มี conditional branch ในซอร์ส |
| `refEq_*`, `same_*` | `refEq`, `same` | ทดสอบ varargs 0/1/หลายค่า (loop-like แต่จริง ๆ เป็น array ไม่ใช่ loop ใน `Matchers`) |
| `isNull*/notNull*/isNotNull*` | `isNull/isNull(Class)/notNull/notNull(Class)/isNotNull/isNotNull(Class)` | ทดสอบ alias delegation (`isNotNull()` → `notNull()`) ว่า path เรียกถูกต้อง |
| `contains/matches/endsWith/startsWith_returnsEmptyString` | string matcher family | รวม null-input (comment กำกับความไม่แน่ใจเรื่อง `Contains(null)`) |
| `argThat/charThat/booleanThat/.../doubleThat` | `*That` family | ครอบคลุมทุก overload ที่รับ `Matcher<T>` |
| `anyInt_matchesAnyValueInRealMock` ... `argThat_customHamcrestMatcherWorksInRealMock` | integration ผ่าน `mock/when/verify` | ไม่ใช่ branch ของ `Matchers` เอง แต่ช่วยยืนยัน **พฤติกรรมจริง** ของ matcher ที่ `Matchers` สร้างขึ้น (Equals/InstanceOf/Contains/Same/Null/NotNull/Any) ผ่านการ verify สำเร็จ/ล้มเหลว (`AssertionError`) ซึ่งเป็นจุดที่ fault มีโอกาสถูกดักจับได้มากที่สุด |

**ข้อสังเกตสำคัญ:** ไฟล์ `Matchers.java` ที่ให้มาไม่มี `if/else/switch/for/while` เลย จึงไม่มี branch ในความหมาย control-flow ให้ cover เพิ่มเติมได้จริง — testsuite นี้จึงเน้น (1) line/method coverage ให้ครบทุกเมธอด/overload พร้อม boundary values และ (2) integration test กับ mock จริงเพื่อเพิ่มความสามารถในการดักจับ fault ที่ซ่อนอยู่ในพฤติกรรม matcher ที่ `Matchers` ส่งต่อไปสร้าง