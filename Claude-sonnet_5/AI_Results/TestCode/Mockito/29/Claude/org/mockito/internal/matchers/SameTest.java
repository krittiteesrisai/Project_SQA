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
