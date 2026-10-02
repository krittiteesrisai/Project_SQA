# การวิเคราะห์ Branch/Condition ของ `LookupTranslator`

**Constructor:**
- `if (lookup != null)` → true/false
- loop `for (seq : lookup)`
- `if (sz < _shortest)` → true/false
- `if (sz > _longest)` → true/false

**translate(...):**
- `if (index + longest > input.length())` → true/false
- loop `for (i = max; i >= shortest; i--)`
- `if (result != null)` → true/false
- return `i` (match) vs return `0` (no match)
- IOException propagation จาก `out.write(...)`

---

```java
package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class LookupTranslatorTest {

    // ---------- Constructor branch: lookup == null ----------
    @Test
    public void testTranslate_NullLookupArray_NoMatch() throws IOException {
        // lookup == null -> shortest = MAX_VALUE, longest = 0
        LookupTranslator lt = new LookupTranslator((CharSequence[][]) null);
        StringWriter out = new StringWriter();
        int result = lt.translate("abc", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- Constructor branch: lookup != null but empty array ----------
    @Test
    public void testTranslate_EmptyLookupArray_NoMatch() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[0][]);
        StringWriter out = new StringWriter();
        int result = lt.translate("xyz", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- Constructor loop: single entry, shortest/longest updated ----------
    @Test
    public void testTranslate_SingleCharacterMatch() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"&", "&amp;"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("&", 0, out);
        assertEquals(1, result);
        assertEquals("&amp;", out.toString());
    }

    // ---------- translate: result == null -> no match, return 0 ----------
    @Test
    public void testTranslate_NoMatchForSingleCharLookup() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"&", "&amp;"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("x", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- Constructor loop: sz < _shortest == false, sz > _longest == false ----------
    // (สอง entry ยาวเท่ากัน ทำให้เงื่อนไขทั้งสองเป็น false ในรอบที่สอง)
    @Test
    public void testConstructor_EqualLengthEntries() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"ab", "AB"},
            {"cd", "CD"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("cd", 0, out);
        assertEquals(2, result);
        assertEquals("CD", out.toString());
    }

    // ---------- Greedy matching: เลือก match ที่ยาวที่สุดก่อน ----------
    @Test
    public void testTranslate_GreedyMatch_LongerKeyWins() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"a", "A"},
            {"ab", "AB"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("ab", 0, out);
        assertEquals(2, result);
        assertEquals("AB", out.toString());
    }

    // ---------- Greedy matching: ไม่เจอ key ยาว แต่เจอ key สั้นกว่า (loop ลดค่า i) ----------
    @Test
    public void testTranslate_FallbackToShorterKey() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"a", "A"},
            {"ab", "AB"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("ac", 0, out);
        assertEquals(1, result);
        assertEquals("A", out.toString());
    }

    // ---------- translate branch: index + longest > input.length() == true (ปรับ max) ----------
    @Test
    public void testTranslate_IndexPlusLongestExceedsInputLength() throws IOException {
        // longest = 5 ("hello"), input length = 2 -> max ถูกปรับเป็น 2
        // shortest = 5 ด้วย (มีแค่ entry เดียว) ทำให้ loop ไม่ execute เลย (max < shortest)
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"hello", "HI"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("he", 0, out);
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- translate branch: index + longest > input.length() == false ----------
    @Test
    public void testTranslate_IndexPlusLongestWithinInputLength() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"a", "A"}
        });
        StringWriter out = new StringWriter();
        // input ยาวพอ ไม่ต้องปรับ max
        int result = lt.translate("abc", 0, out);
        assertEquals(1, result);
        assertEquals("A", out.toString());
    }

    // ---------- translate ที่ index อยู่กลาง string ----------
    @Test
    public void testTranslate_IndexInMiddleOfInput() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"b", "B"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("abc", 1, out);
        assertEquals(1, result);
        assertEquals("B", out.toString());
    }

    // ---------- translate: index == input.length() -> max ถูกปรับเป็น 0 แล้ว loop ไม่ execute ----------
    @Test
    public void testTranslate_IndexAtEndOfInput() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"a", "A"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("a", 1, out); // index == length
        assertEquals(0, result);
        assertEquals("", out.toString());
    }

    // ---------- Edge case: key ความยาว 0 (shortest = 0) ----------
    // หมายเหตุ: กรณีนี้เป็น edge case ที่ไม่ชัดเจนว่าตั้งใจ (comment กำกับตามข้อกำหนด)
    // subSeq ว่าง ("") อาจจับคู่กับ key ว่างได้ แม้ว่า index ไม่ได้เลื่อนจริง (คืนค่า i=0)
    @Test
    public void testTranslate_ZeroLengthKeyEdgeCase() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"", "EMPTY"}
        });
        StringWriter out = new StringWriter();
        int result = lt.translate("abc", 0, out);
        // shortest = longest = 0 -> loop รันครั้งเดียวที่ i=0, subSeq="" ตรงกับ key ว่าง
        assertEquals(0, result);
        assertEquals("EMPTY", out.toString());
    }

    // ---------- IOException propagation จาก out.write(...) ----------
    @Test(expected = IOException.class)
    public void testTranslate_IOExceptionPropagatesFromWriter() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"&", "&amp;"}
        });
        Writer failingWriter = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("simulated failure");
            }

            @Override
            public void flush() throws IOException {
                // no-op
            }

            @Override
            public void close() throws IOException {
                // no-op
            }
        };
        lt.translate("&", 0, failingWriter);
    }

    // ---------- ตรวจสอบว่าแปลข้อความยาวหลาย match ติดกันได้ถูกต้อง (sanity / regression) ----------
    @Test
    public void testTranslate_MultipleDistinctKeysNoOverlapIssue() throws IOException {
        LookupTranslator lt = new LookupTranslator(new CharSequence[][] {
            {"<", "&lt;"},
            {">", "&gt;"}
        });
        StringWriter out1 = new StringWriter();
        int r1 = lt.translate("<", 0, out1);
        assertEquals(1, r1);
        assertEquals("&lt;", out1.toString());

        StringWriter out2 = new StringWriter();
        int r2 = lt.translate(">", 0, out2);
        assertEquals(1, r2);
        assertEquals("&gt;", out2.toString());
    }
}
```

---

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testTranslate_NullLookupArray_NoMatch` | Constructor: `lookup != null` → **false**; translate: loop ไม่ execute (`shortest=MAX_VALUE`), return 0 |
| `testTranslate_EmptyLookupArray_NoMatch` | Constructor: `lookup != null` → **true**, loop array ว่าง (ไม่ execute iteration); translate return 0 |
| `testTranslate_SingleCharacterMatch` | Constructor loop iteration แรก (`sz<_shortest` true, `sz>_longest` true); translate: `result != null` → true, return i |
| `testTranslate_NoMatchForSingleCharLookup` | translate: `result != null` → false, return 0 |
| `testConstructor_EqualLengthEntries` | Constructor loop รอบที่ 2: `sz < _shortest` → false, `sz > _longest` → false |
| `testTranslate_GreedyMatch_LongerKeyWins` | translate loop: ตรวจสอบ i สูงสุดก่อน, match พบทันที (greedy) |
| `testTranslate_FallbackToShorterKey` | translate loop: i ลดลงหลาย step จน match (`result != null` false→true) |
| `testTranslate_IndexPlusLongestExceedsInputLength` | translate: `index+longest > input.length()` → **true** (ปรับ max), loop ไม่ execute เพราะ `max < shortest` |
| `testTranslate_IndexPlusLongestWithinInputLength` | translate: `index+longest > input.length()` → **false** |
| `testTranslate_IndexInMiddleOfInput` | translate: ตรวจ index != 0, subSequence คำนวณถูกต้อง |
| `testTranslate_IndexAtEndOfInput` | translate: boundary `index == input.length()`, max ปรับเป็น 0, loop ไม่ execute |
| `testTranslate_ZeroLengthKeyEdgeCase` | Constructor: `shortest=longest=0`; translate loop execute ที่ `i=0`, edge case พิเศษ (มีคอมเมนต์กำกับ) |
| `testTranslate_IOExceptionPropagatesFromWriter` | translate: path ที่ `out.write(...)` throw IOException, ตรวจ exception propagation |
| `testTranslate_MultipleDistinctKeysNoOverlapIssue` | Sanity test หลาย key แยกกัน, regression check |

**หมายเหตุ:** กรณี `testTranslate_ZeroLengthKeyEdgeCase` เป็น edge case ที่ไม่ได้ระบุ behavior ชัดเจนในคอมเมนต์ของซอร์สต้นฉบับ (ไม่มีการป้องกัน key ความยาว 0) จึงเขียนคอมเมนต์กำกับไว้ตามข้อกำหนด ไม่ได้เดา behavior เพิ่มเติมนอกจากที่ไล่ตาม logic ของโค้ดจริง