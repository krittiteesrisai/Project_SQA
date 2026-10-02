# EntitiesTest.java

หมายเหตุสำคัญก่อนโค้ด:
- `escape(String, CharsetEncoder, EscapeMode)` และ `unescape(String[, boolean])` เป็น **package-private** (ไม่มี modifier) ดังนั้นคลาสทดสอบต้องอยู่ใน package `org.jsoup.nodes` เดียวกันจึงจะเรียกใช้ได้โดยตรง
- บางเทสอ้างอิงความรู้พื้นฐานที่ยืนยันได้จากซอร์ส (`xhtmlArray` กำหนด `quot, amp, apos, lt, gt` ตรงๆ) แต่บางเทส (เช่น entity `lt` ใน `base`/`full` map ที่โหลดจากไฟล์ `.properties`) อิงจากข้อเท็จจริงพื้นฐานของ HTML spec ซึ่งไม่มีในซอร์สโค้ดตรงๆ — ได้ใส่คอมเมนต์กำกับไว้ชัดเจนตามข้อกำหนด
- พบ "จุดต้องสงสัย" (potential defect) ในเงื่อนไข `if (charval != -1 || charval > 0xFFFF)` ซึ่งเงื่อนไขส่วนที่สองไม่สามารถเป็นจริงได้จริงในทางปฏิบัติ (dead branch) และกรณี code point > 0xFFFF จะถูก cast เป็น `char` แบบ truncate — เขียนเทสตามพฤติกรรมจริงของซอร์สปัจจุบัน ไม่ได้สมมติ behavior ที่ "ถูกต้อง" ตาม Unicode spec

```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;

import org.jsoup.nodes.Entities.EscapeMode;

public class EntitiesTest {

    private CharsetEncoder asciiEncoder() {
        return Charset.forName("US-ASCII").newEncoder();
    }

    // ---------------------------------------------------------------
    // isNamedEntity(String)
    // ---------------------------------------------------------------

    @Test
    public void testIsNamedEntity_KnownBasicEntities() {
        // lt, gt, amp, quot เป็น entity พื้นฐานตาม xhtmlArray ในซอร์ส จึงมั่นใจว่าอยู่ใน full map ด้วย
        assertTrue(Entities.isNamedEntity("amp"));
        assertTrue(Entities.isNamedEntity("lt"));
        assertTrue(Entities.isNamedEntity("gt"));
        assertTrue(Entities.isNamedEntity("quot"));
    }

    @Test
    public void testIsNamedEntity_UnknownEntity() {
        assertFalse(Entities.isNamedEntity("notARealEntityXYZ"));
    }

    @Test
    public void testIsNamedEntity_EmptyString() {
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsNamedEntity_Null() {
        // HashMap.containsKey(null) ไม่ throw exception และ map ไม่มี null key -> คาด false
        assertFalse(Entities.isNamedEntity(null));
    }

    // ---------------------------------------------------------------
    // getCharacterByName(String)
    // ---------------------------------------------------------------

    @Test
    public void testGetCharacterByName_Known() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
    }

    @Test
    public void testGetCharacterByName_Unknown() {
        assertNull(Entities.getCharacterByName("notARealEntityXYZ"));
    }

    @Test
    public void testGetCharacterByName_Null() {
        // HashMap.get(null) ไม่ throw exception
        assertNull(Entities.getCharacterByName(null));
    }

    // ---------------------------------------------------------------
    // EscapeMode enum sanity (ตรวจ map ที่ผูกกับ enum constant ตาม xhtmlArray)
    // ---------------------------------------------------------------

    @Test
    public void testEscapeMode_XhtmlMapContents() {
        Map<Character, String> map = EscapeMode.xhtml.getMap();
        assertEquals("lt", map.get('<'));
        assertEquals("gt", map.get('>'));
        assertEquals("amp", map.get('&'));
        assertEquals("quot", map.get('"'));
        assertEquals("apos", map.get('\''));
    }

    // ---------------------------------------------------------------
    // escape(String, CharsetEncoder, EscapeMode)
    // ---------------------------------------------------------------

    @Test
    public void testEscape_XhtmlMode_SpecialChars() {
        String input = "<>&'\"";
        String result = Entities.escape(input, asciiEncoder(), EscapeMode.xhtml);
        assertEquals("&lt;&gt;&amp;&apos;&quot;", result);
    }

    @Test
    public void testEscape_PlainAsciiChar_NotInMap_Encodable() {
        // 'A' ไม่อยู่ใน xhtml map -> ไปเช็ค encoder.canEncode('A') = true -> append ตรงๆ
        String result = Entities.escape("A", asciiEncoder(), EscapeMode.xhtml);
        assertEquals("A", result);
    }

    @Test
    public void testEscape_NonEncodableChar_NotInMap() {
        // '\u4e2d' ไม่อยู่ใน xhtml map และ ASCII encoder ไม่รองรับ -> ต้องใช้ &#code; branch
        char c = '\u4e2d';
        String result = Entities.escape(String.valueOf(c), asciiEncoder(), EscapeMode.xhtml);
        assertEquals("&#" + (int) c + ";", result);
    }

    @Test
    public void testEscape_MixedCharacters_AllBranches() {
        // ครอบคลุมทั้ง 3 branch ภายใน loop เดียว: map hit, encoder hit, encoder miss
        String input = "A<\u4e2d";
        String result = Entities.escape(input, asciiEncoder(), EscapeMode.xhtml);
        assertEquals("A&lt;&#20013;", result);
    }

    @Test
    public void testEscape_EmptyString() {
        // ครอบคลุม loop 0 รอบ
        assertEquals("", Entities.escape("", asciiEncoder(), EscapeMode.base));
    }

    @Test
    public void testEscape_BaseMode_MapTakesPrecedenceOverEncoder() {
        // สมมติฐาน: 'lt' เป็น entity พื้นฐานที่มีอยู่ใน base map แน่นอน (ไม่ได้ยืนยันจากซอร์สตรงๆ
        // แต่เป็นความรู้พื้นฐาน HTML/XML ซึ่งเป็น entity ที่ขาดไม่ได้)
        String result = Entities.escape("<", asciiEncoder(), EscapeMode.base);
        assertEquals("&lt;", result);
    }

    @Test(expected = NullPointerException.class)
    public void testEscape_NullString_ThrowsNPE() {
        Entities.escape(null, asciiEncoder(), EscapeMode.base);
    }

    @Test
    public void testEscape_WithOutputSettings_Delegates() {
        // ทดสอบ overload escape(String, Document.OutputSettings) ว่า delegate ไปยัง overload หลักถูกต้อง
        // สมมติฐาน: ค่า default ของ Document.OutputSettings คือ EscapeMode.base และ encoder UTF-8
        Document.OutputSettings settings = new Document.OutputSettings();
        String result = Entities.escape("<", settings);
        assertEquals("&lt;", result);
    }

    // ---------------------------------------------------------------
    // unescape(String) / unescape(String, boolean)
    // ---------------------------------------------------------------

    @Test
    public void testUnescape_NoAmpersand_ReturnsUnchanged() {
        // ครอบคลุม branch !string.contains("&") == true
        String s = "hello world, no entities here";
        assertEquals(s, Entities.unescape(s));
    }

    @Test
    public void testUnescape_NamedEntityWithSemicolon() {
        assertEquals("&", Entities.unescape("&amp;"));
    }

    @Test
    public void testUnescape_NamedEntityWithoutSemicolon_NonStrict() {
        // non-strict pattern ให้ ';' เป็น optional
        assertEquals("&", Entities.unescape("&amp", false));
    }

    @Test
    public void testUnescape_NamedEntityWithoutSemicolon_Strict_NoMatch() {
        // strict pattern บังคับต้องมี ';' -> ไม่ match -> คืนค่าเดิม
        assertEquals("&amp", Entities.unescape("&amp", true));
    }

    @Test
    public void testUnescape_NamedEntityWithSemicolon_Strict() {
        assertEquals("&", Entities.unescape("&amp;", true));
    }

    @Test
    public void testUnescape_NumericDecimalEntity() {
        // base 10 branch (group(2) == null)
        assertEquals("A", Entities.unescape("&#65;"));
    }

    @Test
    public void testUnescape_NumericHexEntity_LowerX() {
        // base 16 branch ด้วย 'x'
        assertEquals("A", Entities.unescape("&#x41;"));
    }

    @Test
    public void testUnescape_NumericHexEntity_UpperX() {
        // base 16 branch ด้วย 'X'
        assertEquals("A", Entities.unescape("&#X41;"));
    }

    @Test
    public void testUnescape_UnknownNamedEntity_RemainsUnchanged() {
        // full.containsKey(name) == false -> charval == -1 -> คืนค่าเดิม
        String s = "&notarealentityxyz;";
        assertEquals(s, Entities.unescape(s));
    }

    @Test
    public void testUnescape_InvalidNumericFormat_NumberFormatException_RemainsUnchanged() {
        // "1a" ถูก parse เป็น base 10 -> NumberFormatException -> catch -> charval=-1 -> คืนค่าเดิม
        String s = "&#1a;";
        assertEquals(s, Entities.unescape(s));
    }

    @Test
    public void testUnescape_MultipleEntitiesMixedWithText() {
        // ครอบคลุม loop (while m.find()) มากกว่า 1 รอบ
        String input = "5 &lt; 10 &amp;&amp; 10 &gt; 5";
        String expected = "5 < 10 && 10 > 5";
        assertEquals(expected, Entities.unescape(input));
    }

    @Test
    public void testUnescape_LoneAmpersand_NoMatch() {
        // มี "&" แต่ตามด้วยอักขระที่ไม่ match regex เลย -> loop ไม่ match รอบใด -> คืนค่าเดิมทั้งหมด
        String s = "just an & alone";
        assertEquals(s, Entities.unescape(s));
    }

    @Test
    public void testUnescape_SupplementaryCodepoint_CurrentCharCastBehavior() {
        // หมายเหตุ: นี่คือพฤติกรรมจริงของซอร์สโค้ดปัจจุบัน (อาจเป็น known defect)
        // charval (int) ถูก cast เป็น char แบบ narrowing -> ตัดบิตบนออกสำหรับ code point > 0xFFFF
        // ไม่ได้สมมติ "พฤติกรรมที่ถูกต้อง" ตาม Unicode surrogate pair ซึ่งไม่มีอยู่ในซอร์ส
        String input = "&#128512;"; // U+1F600 GRINNING FACE
        String result = Entities.unescape(input);
        char expectedTruncated = (char) 128512; // ตาม narrowing cast semantics ของ Java
        assertEquals(String.valueOf(expectedTruncated), result);
    }

    @Test(expected = NullPointerException.class)
    public void testUnescape_NullString_ThrowsNPE() {
        Entities.unescape(null);
    }
}
```

---

## สรุป Coverage

| เมธอดเทส | ครอบคลุม Branch/Condition |
|---|---|
| `testIsNamedEntity_KnownBasicEntities` | `isNamedEntity` — `full.containsKey(name)` = true |
| `testIsNamedEntity_UnknownEntity` | `full.containsKey(name)` = false |
| `testIsNamedEntity_EmptyString` | input ว่าง, containsKey = false |
| `testIsNamedEntity_Null` | input null, ไม่ throw, คืน false |
| `testGetCharacterByName_Known` | `full.get(name)` คืนค่าจริง |
| `testGetCharacterByName_Unknown` | `full.get(name)` คืน null |
| `testGetCharacterByName_Null` | input null, ไม่ throw |
| `testEscapeMode_XhtmlMapContents` | ตรวจ `xhtmlByVal` map ที่ build จาก `xhtmlArray` ใน static block |
| `testEscape_XhtmlMode_SpecialChars` | `map.containsKey(c)` = true ทุกตัวใน xhtmlArray |
| `testEscape_PlainAsciiChar_NotInMap_Encodable` | `map.containsKey(c)`=false, `encoder.canEncode(c)`=true |
| `testEscape_NonEncodableChar_NotInMap` | `map.containsKey(c)`=false, `encoder.canEncode(c)`=false → `&#code;` branch |
| `testEscape_MixedCharacters_AllBranches` | ครอบทั้ง 3 branch ภายใน loop เดียว (multi-iteration) |
| `testEscape_EmptyString` | loop 0 รอบ (boundary) |
| `testEscape_BaseMode_MapTakesPrecedenceOverEncoder` | map hit มาก่อน encoder check ใน mode `base` |
| `testEscape_NullString_ThrowsNPE` | null input, boundary/error case |
| `testEscape_WithOutputSettings_Delegates` | overload `escape(String, OutputSettings)` เรียก delegate ถูกต้อง |
| `testUnescape_NoAmpersand_ReturnsUnchanged` | `!string.contains("&")` = true |
| `testUnescape_NamedEntityWithSemicolon` | named entity, non-strict, มี `;` |
| `testUnescape_NamedEntityWithoutSemicolon_NonStrict` | non-strict, ไม่มี `;` (optional) |
| `testUnescape_NamedEntityWithoutSemicolon_Strict_NoMatch` | strict pattern ไม่ match เพราะไม่มี `;` |
| `testUnescape_NamedEntityWithSemicolon_Strict` | strict pattern match เพราะมี `;` |
| `testUnescape_NumericDecimalEntity` | `num != null`, `group(2)==null` → base 10 |
| `testUnescape_NumericHexEntity_LowerX` | `group(2)!=null` ('x') → base 16 |
| `testUnescape_NumericHexEntity_UpperX` | `group(2)!=null` ('X') → base 16 |
| `testUnescape_UnknownNamedEntity_RemainsUnchanged` | `num==null`, `full.containsKey(name)`=false → charval=-1 |
| `testUnescape_InvalidNumericFormat_NumberFormatException_RemainsUnchanged` | `NumberFormatException` ถูก catch → charval=-1 |
| `testUnescape_MultipleEntitiesMixedWithText` | loop `while(m.find())` หลายรอบ |
| `testUnescape_LoneAmpersand_NoMatch` | `m.find()` ไม่ match เลยแม้ string มี `&` |
| `testUnescape_SupplementaryCodepoint_CurrentCharCastBehavior` | `charval != -1` ทางสาขาแรกของเงื่อนไข (เผยพฤติกรรม/ความเสี่ยง defect ของ `|| charval > 0xFFFF`) |
| `testUnescape_NullString_ThrowsNPE` | null input, boundary/error case |