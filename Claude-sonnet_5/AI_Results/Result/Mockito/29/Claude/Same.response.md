# JUnit 4 Test Suite สำหรับคลาส `Same` (Mockito-29b)

## การวิเคราะห์ Branch/Condition

จากซอร์สโค้ด พบ branch ที่ต้องทดสอบดังนี้:

1. **`matches()`**: เงื่อนไข `wanted == actual` → true/false
2. **`appendQuoting()`**: 
   - `if (wanted instanceof String)` → true/false
   - `else if (wanted instanceof Character)` → true/false
   - กรณีไม่เข้าทั้งสองเงื่อนไข (else ที่ซ่อนนัย)
3. **`describeTo()`**: มีความเสี่ยง NPE เมื่อ `wanted` เป็น null (เรียก `wanted.toString()`)

## โค้ดทดสอบ

```java
package org.mockito.internal.matchers;

import org.hamcrest.Description;
import org.hamcrest.StringDescription;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameTest {

    // ---------- matches() : wanted == actual ----------

    @Test
    public void matches_shouldReturnTrue_whenSameObjectReference() {
        Object obj = new Object();
        Same same = new Same(obj);
        assertTrue(same.matches(obj));
    }

    @Test
    public void matches_shouldReturnFalse_whenDifferentObjects() {
        Object wanted = new Object();
        Object actual = new Object();
        Same same = new Same(wanted);
        assertFalse(same.matches(actual));
    }

    @Test
    public void matches_shouldReturnTrue_whenBothNull() {
        Same same = new Same(null);
        assertTrue(same.matches(null));
    }

    @Test
    public void matches_shouldReturnFalse_whenWantedNullActualNotNull() {
        Same same = new Same(null);
        assertFalse(same.matches(new Object()));
    }

    @Test
    public void matches_shouldReturnFalse_whenWantedNotNullActualNull() {
        Same same = new Same("hello");
        assertFalse(same.matches(null));
    }

    @Test
    public void matches_shouldReturnFalse_whenEqualValueButNotSameReference() {
        // ยืนยันว่าใช้ == (reference) ไม่ใช่ equals() (value)
        String wanted = new String("test");
        String actual = new String("test");
        Same same = new Same(wanted);
        assertFalse(same.matches(actual));
    }

    @Test
    public void matches_shouldReturnTrue_whenSameStringLiteral() {
        // String literal pool ทำให้ reference เท่ากัน
        String wanted = "literal";
        String actual = "literal";
        Same same = new Same(wanted);
        assertTrue(same.matches(actual));
    }

    @Test
    public void matches_shouldReturnFalse_whenBoxedCharacterDifferentInstance() {
        // new Character(...) ไม่ใช้ cache ดังนั้น reference ต่างกัน
        Character wanted = new Character('x');
        Character actual = new Character('x');
        Same same = new Same(wanted);
        assertFalse(same.matches(actual));
    }

    // ---------- describeTo() + appendQuoting() ----------

    @Test
    public void describeTo_shouldUseDoubleQuote_whenWantedIsString() {
        Same same = new Same("hello");
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(\"hello\")", description.toString());
    }

    @Test
    public void describeTo_shouldUseSingleQuote_whenWantedIsCharacter() {
        Same same = new Same('a');
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same('a')", description.toString());
    }

    @Test
    public void describeTo_shouldNotQuote_whenWantedIsInteger() {
        Same same = new Same(123);
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(123)", description.toString());
    }

    @Test
    public void describeTo_shouldNotQuote_whenWantedIsCustomObject() {
        Object wanted = new Object() {
            @Override
            public String toString() {
                return "customObj";
            }
        };
        Same same = new Same(wanted);
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(customObj)", description.toString());
    }

    @Test
    public void describeTo_shouldNotQuote_whenWantedIsEmptyString() {
        // boundary case: empty string ยังคง instanceof String -> ใช้ double quote
        Same same = new Same("");
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(\"\")", description.toString());
    }

    @Test(expected = NullPointerException.class)
    public void describeTo_shouldThrowNPE_whenWantedIsNull() {
        // wanted.toString() จะเกิด NPE เมื่อ wanted เป็น null
        // หมายเหตุ: นี่คือพฤติกรรมจริงของซอร์สโค้ด ไม่ได้ handle null ใน describeTo()
        Same same = new Same(null);
        Description description = new StringDescription();
        same.describeTo(description);
    }

    @Test
    public void describeTo_shouldUseSingleQuote_whenCharacterIsWhitespace() {
        // boundary case: Character ค่าพิเศษ เช่น space
        Same same = new Same(' ');
        Description description = new StringDescription();
        same.describeTo(description);
        assertEquals("same(' ')", description.toString());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `matches_shouldReturnTrue_whenSameObjectReference` | `matches()`: `wanted == actual` → **true** (reference เดียวกัน) |
| `matches_shouldReturnFalse_whenDifferentObjects` | `matches()`: `wanted == actual` → **false** (object ต่างกัน) |
| `matches_shouldReturnTrue_whenBothNull` | `matches()`: `null == null` → **true** (boundary: null) |
| `matches_shouldReturnFalse_whenWantedNullActualNotNull` | `matches()`: wanted=null, actual≠null → **false** |
| `matches_shouldReturnFalse_whenWantedNotNullActualNull` | `matches()`: wanted≠null, actual=null → **false** |
| `matches_shouldReturnFalse_whenEqualValueButNotSameReference` | ยืนยันใช้ `==` ไม่ใช่ `.equals()` (fault-detection) |
| `matches_shouldReturnTrue_whenSameStringLiteral` | String pool reference equality → **true** |
| `matches_shouldReturnFalse_whenBoxedCharacterDifferentInstance` | Boxed Character ต่าง instance → **false** |
| `describeTo_shouldUseDoubleQuote_whenWantedIsString` | `appendQuoting()`: `if (wanted instanceof String)` → **true** |
| `describeTo_shouldUseSingleQuote_whenWantedIsCharacter` | `appendQuoting()`: `else if (wanted instanceof Character)` → **true** |
| `describeTo_shouldNotQuote_whenWantedIsInteger` | `appendQuoting()`: ทั้งสอง condition → **false** (ไม่เข้า if ใดๆ) |
| `describeTo_shouldNotQuote_whenWantedIsCustomObject` | เหมือนด้านบน แต่ใช้ custom object (เพิ่มความมั่นใจ) |
| `describeTo_shouldNotQuote_whenWantedIsEmptyString` | Boundary: empty string ยังคง instanceof String |
| `describeTo_shouldThrowNPE_whenWantedIsNull` | Edge case: `wanted=null` → NPE จาก `wanted.toString()` |
| `describeTo_shouldUseSingleQuote_whenCharacterIsWhitespace` | Boundary: Character พิเศษ (whitespace) |

**หมายเหตุสำคัญ:**
- Test `matches_shouldReturnFalse_whenEqualValueButNotSameReference` และ `matches_shouldReturnTrue_whenSameStringLiteral` ถูกออกแบบมาเพื่อ**ตรวจจับ fault** หากมีการเปลี่ยน implementation จาก `==` เป็น `.equals()` โดยไม่ได้ตั้งใจ
- `describeTo_shouldThrowNPE_whenWantedIsNull` เป็นการทดสอบพฤติกรรมจริงที่พบในซอร์ส (ไม่มี null-check ก่อนเรียก `wanted.toString()`) — ไม่ใช่การเดา behavior แต่อ่านจากโค้ดจริง
- Method `appendQuoting()` เป็น `private` จึงทดสอบผ่าน `describeTo()` เท่านั้น (ตาม encapsulation)