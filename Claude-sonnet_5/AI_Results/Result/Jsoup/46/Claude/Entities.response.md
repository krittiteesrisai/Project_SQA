# EntitiesTest.java — JUnit 4 Test Suite สำหรับ `org.jsoup.nodes.Entities`

## หมายเหตุสำคัญก่อนโค้ด

- คลาสทดสอบอยู่ใน package เดียวกัน (`org.jsoup.nodes`) เพื่อให้เข้าถึง static method แบบ package-private ได้ (`escape(...)`, `unescape(...)`)
- สมมติฐาน (assumption) ที่ไม่ได้ระบุชัดในซอร์สที่ให้มา (เช่น เนื้อหาไฟล์ `entities-base.properties` / `entities-full.properties`) จะมีคอมเมนต์ `// ASSUMPTION:` กำกับไว้ชัดเจน โดยอ้างอิงจาก entity มาตรฐานที่เป็นที่รู้จักทั่วไป (เช่น `amp`, `lt`, `gt`, `quot`, `eacute`) เนื่องจากไฟล์ properties จริงไม่ได้แสดงในซอร์สที่ให้มา
- พฤติกรรมของ `unescape(String, boolean strict)` อ้างอิงจาก Javadoc ของเมธอดเองที่ระบุไว้ชัดเจนว่า `strict` บังคับให้ต้องมี `;` ปิดท้าย ส่วน non-strict ไม่บังคับ — จึงไม่ถือเป็นการเดา

```java
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class EntitiesTest {

    // ---------- helper ----------
    private Document.OutputSettings settings(Entities.EscapeMode mode, String charsetName) {
        Document.OutputSettings os = new Document.OutputSettings();
        os.escapeMode(mode);
        os.charset(charsetName);
        return os;
    }

    // =========================================================
    // isNamedEntity(String)
    // =========================================================

    @Test
    public void testIsNamedEntity_KnownEntity() {
        assertTrue(Entities.isNamedEntity("amp")); // "amp" เป็น entity พื้นฐานที่สุด ต้องมีใน full map
    }

    @Test
    public void testIsNamedEntity_UnknownEntity() {
        assertFalse(Entities.isNamedEntity("notARealEntityXYZ123"));
    }

    @Test
    public void testIsNamedEntity_EmptyString() {
        assertFalse(Entities.isNamedEntity(""));
    }

    @Test
    public void testIsNamedEntity_Null() {
        // HashMap.containsKey(null) ไม่ throw, คืน false
        assertFalse(Entities.isNamedEntity(null));
    }

    // =========================================================
    // isBaseNamedEntity(String)
    // =========================================================

    @Test
    public void testIsBaseNamedEntity_KnownEntity() {
        assertTrue(Entities.isBaseNamedEntity("amp")); // พื้นฐานที่สุด ต้องอยู่ใน base set ด้วย
    }

    @Test
    public void testIsBaseNamedEntity_UnknownEntity() {
        assertFalse(Entities.isBaseNamedEntity("notARealEntityXYZ123"));
    }

    @Test
    public void testIsBaseNamedEntity_Null() {
        assertFalse(Entities.isBaseNamedEntity(null));
    }

    // =========================================================
    // getCharacterByName(String)
    // =========================================================

    @Test
    public void testGetCharacterByName_KnownEntities() {
        assertEquals(Character.valueOf('&'), Entities.getCharacterByName("amp"));
        assertEquals(Character.valueOf('<'), Entities.getCharacterByName("lt"));
        assertEquals(Character.valueOf('>'), Entities.getCharacterByName("gt"));
        assertEquals(Character.valueOf('"'), Entities.getCharacterByName("quot"));
    }

    @Test
    public void testGetCharacterByName_UnknownEntity() {
        assertNull(Entities.getCharacterByName("notARealEntityXYZ123"));
    }

    // =========================================================
    // escape(String, Document.OutputSettings) - wrapper overload
    // =========================================================

    @Test
    public void testEscapeStringOverload_Ampersand() {
        Document.OutputSettings os = new Document.OutputSettings();
        String result = Entities.escape("a & b", os);
        assertEquals("a &amp; b", result);
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeStringOverload_NullInputThrowsNPE() {
        // string.length() จะ throw NPE ถ้า string เป็น null (ไม่มีการ null-check ในซอร์ส)
        Entities.escape((String) null, new Document.OutputSettings());
    }

    // =========================================================
    // escape(StringBuilder, String, OutputSettings, boolean, boolean, boolean)
    // -- กรณี '&'
    // =========================================================

    @Test
    public void testEscape_Ampersand_AlwaysEscaped() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "&", new Document.OutputSettings(), false, false, false);
        assertEquals("&amp;", sb.toString());
    }

    // -- กรณี '<'
    @Test
    public void testEscape_LessThan_OutsideAttribute() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "<", new Document.OutputSettings(), false, false, false);
        assertEquals("&lt;", sb.toString());
    }

    @Test
    public void testEscape_LessThan_InsideAttribute() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "<", new Document.OutputSettings(), true, false, false);
        assertEquals("<", sb.toString());
    }

    // -- กรณี '>'
    @Test
    public void testEscape_GreaterThan_OutsideAttribute() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, ">", new Document.OutputSettings(), false, false, false);
        assertEquals("&gt;", sb.toString());
    }

    @Test
    public void testEscape_GreaterThan_InsideAttribute() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, ">", new Document.OutputSettings(), true, false, false);
        assertEquals(">", sb.toString());
    }

    // -- กรณี '"'
    @Test
    public void testEscape_Quote_InsideAttribute() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\"", new Document.OutputSettings(), true, false, false);
        assertEquals("&quot;", sb.toString());
    }

    @Test
    public void testEscape_Quote_OutsideAttribute() {
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\"", new Document.OutputSettings(), false, false, false);
        assertEquals("\"", sb.toString());
    }

    // -- กรณี 0xA0 (nbsp)
    @Test
    public void testEscape_Nbsp_XhtmlMode_KeepsLiteralChar() {
        Document.OutputSettings os = new Document.OutputSettings();
        os.escapeMode(Entities.EscapeMode.xhtml);
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u00A0", os, false, false, false);
        assertEquals("\u00A0", sb.toString());
    }

    @Test
    public void testEscape_Nbsp_BaseMode_ProducesEntity() {
        Document.OutputSettings os = new Document.OutputSettings(); // default = base
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u00A0", os, false, false, false);
        assertEquals("&nbsp;", sb.toString());
    }

    // -- default switch branch: canEncode true/false + map hit/miss
    @Test
    public void testEscape_UnknownChar_XhtmlAscii_HexEscape() {
        // xhtmlByVal มีแค่ quot/amp/lt/gt (ยืนยันได้จาก xhtmlArray ในซอร์ส)
        // ดังนั้นอักขระอื่นภายใต้ ASCII encoder จะไม่ encode ได้ และไม่พบใน map -> hex escape
        Document.OutputSettings os = settings(Entities.EscapeMode.xhtml, "US-ASCII");
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u00E9", os, false, false, false); // é
        assertEquals("&#xe9;", sb.toString());
    }

    @Test
    public void testEscape_MapHit_BaseAscii_NamedEntity() {
        // ASSUMPTION: 'eacute' เป็น entity มาตรฐานของ é (U+00E9)
        // และสมมติว่ามีอยู่ใน entities-base.properties จริง (ไม่ได้แสดงในซอร์สที่ให้มา)
        Document.OutputSettings os = settings(Entities.EscapeMode.base, "US-ASCII");
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "\u00E9", os, false, false, false);
        assertEquals("&eacute;", sb.toString());
    }

    // -- supplementary code point (surrogate pair) branch
    @Test
    public void testEscape_SupplementaryChar_EncodableUtf8() {
        Document.OutputSettings os = new Document.OutputSettings(); // default UTF-8
        String emoji = "\uD83D\uDE00"; // U+1F600
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, emoji, os, false, false, false);
        assertEquals(emoji, sb.toString());
    }

    @Test
    public void testEscape_SupplementaryChar_NotEncodableAscii() {
        Document.OutputSettings os = settings(Entities.EscapeMode.base, "US-ASCII");
        String emoji = "\uD83D\uDE00"; // U+1F600
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, emoji, os, false, false, false);
        assertEquals("&#x1f600;", sb.toString());
    }

    // -- normaliseWhite / stripLeadingWhite / lastWasWhite loop branches
    @Test
    public void testEscape_NormaliseWhite_StripLeadingTrue() {
        Document.OutputSettings os = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "  foo   bar  ", os, false, true, true);
        assertEquals("foo bar ", sb.toString());
    }

    @Test
    public void testEscape_NormaliseWhite_StripLeadingFalse() {
        Document.OutputSettings os = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "  foo", os, false, true, false);
        assertEquals(" foo", sb.toString());
    }

    @Test
    public void testEscape_NormaliseWhite_NoWhitespaceInput() {
        Document.OutputSettings os = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "foobar", os, false, true, true);
        assertEquals("foobar", sb.toString());
    }

    // -- boundary: empty string
    @Test
    public void testEscape_EmptyString() {
        Document.OutputSettings os = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        Entities.escape(sb, "", os, false, false, false);
        assertEquals("", sb.toString());
    }

    // =========================================================
    // unescape(String) / unescape(String, boolean)
    // =========================================================

    @Test
    public void testUnescape_BasicEntities() {
        assertEquals("&", Entities.unescape("&amp;"));
        assertEquals("<", Entities.unescape("&lt;"));
    }

    @Test
    public void testUnescape_NoEntities_ReturnsUnchanged() {
        assertEquals("No entities here", Entities.unescape("No entities here"));
    }

    @Test
    public void testUnescape_EmptyString() {
        assertEquals("", Entities.unescape(""));
    }

    @Test
    public void testUnescape_StrictMode_RequiresSemicolon() {
        // ตาม Javadoc: strict=true ต้องมี ';' ปิดท้ายเสมอ มิฉะนั้นไม่แปลง
        assertEquals("&amp", Entities.unescape("&amp", true));
        assertEquals("&", Entities.unescape("&amp;", true));
    }

    @Test
    public void testUnescape_NonStrictMode_SemicolonOptional() {
        // ตาม Javadoc: strict=false ทำให้ ';' เป็น optional
        assertEquals("&", Entities.unescape("&amp", false));
        assertEquals("&", Entities.unescape("&amp;", false));
    }

    @Test
    public void testUnescape_DefaultOverload_IsNonStrict() {
        // unescape(String) เรียก unescape(string, false) ภายใน
        assertEquals("&", Entities.unescape("&amp"));
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testIsNamedEntity_KnownEntity` / `_UnknownEntity` / `_EmptyString` / `_Null` | `full.containsKey(name)` ทั้งกรณี true/false รวม null/empty |
| `testIsBaseNamedEntity_*` | `base.containsKey(name)` true/false รวม null |
| `testGetCharacterByName_*` | `full.get(name)` กรณีพบ/ไม่พบคีย์ |
| `testEscapeStringOverload_Ampersand` | เมธอด wrapper `escape(String,...)` เรียก `escape(StringBuilder,...)` ถูกต้อง |
| `testEscapeStringOverload_NullInputThrowsNPE` | boundary: null input → NPE (ไม่มี null-check) |
| `testEscape_Ampersand_AlwaysEscaped` | switch-case `'&'` |
| `testEscape_LessThan_OutsideAttribute` / `_InsideAttribute` | switch-case `'<'`, if/else `inAttribute` |
| `testEscape_GreaterThan_OutsideAttribute` / `_InsideAttribute` | switch-case `'>'`, if/else `inAttribute` |
| `testEscape_Quote_InsideAttribute` / `_OutsideAttribute` | switch-case `'"'`, if/else `inAttribute` |
| `testEscape_Nbsp_XhtmlMode_KeepsLiteralChar` / `_BaseMode_ProducesEntity` | switch-case `0xA0`, if/else `escapeMode != xhtml` |
| `testEscape_UnknownChar_XhtmlAscii_HexEscape` | default case: `canEncode=false` + `map.containsKey=false` → hex escape branch |
| `testEscape_MapHit_BaseAscii_NamedEntity` | default case: `canEncode=false` + `map.containsKey=true` → named entity branch |
| `testEscape_SupplementaryChar_EncodableUtf8` | else-branch (supplementary code point), `encoder.canEncode=true` |
| `testEscape_SupplementaryChar_NotEncodableAscii` | else-branch (supplementary code point), `encoder.canEncode=false` → hex escape |
| `testEscape_NormaliseWhite_StripLeadingTrue` | loop: `stripLeadingWhite && !reachedNonWhite`, `lastWasWhite`, collapse whitespace |
| `testEscape_NormaliseWhite_StripLeadingFalse` | loop: `stripLeadingWhite=false` branch ของ whitespace skip condition |
| `testEscape_NormaliseWhite_NoWhitespaceInput` | loop: branch `else` (ไม่ใช่ whitespace) ตั้งแต่ตัวแรก |
| `testEscape_EmptyString` | boundary: length=0, loop ไม่ execute เลย |
| `testUnescape_BasicEntities` / `_NoEntities_ReturnsUnchanged` / `_EmptyString` | เมธอด `unescape(String)` เส้นทางพื้นฐาน |
| `testUnescape_StrictMode_RequiresSemicolon` | `unescape(String,true)` — strict ต้องมี `;` |
| `testUnescape_NonStrictMode_SemicolonOptional` | `unescape(String,false)` — ไม่บังคับ `;` |
| `testUnescape_DefaultOverload_IsNonStrict` | ยืนยันว่า overload เดียว call ผ่าน `strict=false` |

**หมายเหตุความเสี่ยง:** `testEscape_MapHit_BaseAscii_NamedEntity` และ test ที่อ้างอิง entity ทั่วไป (`amp`, `lt`, `gt`, `quot`, `eacute`) พึ่งพาเนื้อหาไฟล์ resource (`entities-base.properties`, `entities-full.properties`) ซึ่งไม่ได้แสดงในซอร์สที่ให้มา แต่เป็น entity มาตรฐานของ HTML ที่คาดว่าต้องมีอยู่แน่นอนในไฟล์จริงของโปรเจกต์ jsoup