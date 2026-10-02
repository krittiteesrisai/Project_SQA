# ParseSettingsTest.java

```java
package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test สำหรับ org.jsoup.parser.ParseSettings
 * หมายเหตุทั่วไป:
 * - คลาส Attributes ไม่ได้ให้ซอร์สมาด้วย จึงอ้างอิง public API ที่เป็นที่รู้จักทั่วไปของ jsoup
 *   (constructor ไม่มี argument, put(String key, String value), get(String key), normalize())
 * - สมมติฐานเรื่อง Attributes#get(key) เป็น exact-match (case-sensitive lookup)
 *   ถูกกำกับด้วยคอมเมนต์ในเทสที่เกี่ยวข้อง หากไม่ตรงกับพฤติกรรมจริงอาจต้องปรับปรุง
 */
public class ParseSettingsTest {

    // ---------- Static instance tests ----------

    @Test
    public void testHtmlDefaultSettings() {
        assertFalse("htmlDefault.preserveTagCase ควรเป็น false",
                ParseSettings.htmlDefault.preserveTagCase());
        // ไม่มี public getter สำหรับ preserveAttributeCase ในซอร์ส
        // จึงตรวจสอบผ่าน behavior ของ normalizeAttribute แทน
        assertEquals("div", ParseSettings.htmlDefault.normalizeTag("DIV"));
        assertEquals("id", ParseSettings.htmlDefault.normalizeAttribute("ID"));
    }

    @Test
    public void testPreserveCaseSettings() {
        assertTrue("preserveCase.preserveTagCase ควรเป็น true",
                ParseSettings.preserveCase.preserveTagCase());
        assertEquals("DIV", ParseSettings.preserveCase.normalizeTag("DIV"));
        assertEquals("ID", ParseSettings.preserveCase.normalizeAttribute("ID"));
    }

    // ---------- Constructor tests (combinations ของ parameter) ----------

    @Test
    public void testConstructor_preserveTagOnly() {
        ParseSettings settings = new ParseSettings(true, false);
        assertTrue(settings.preserveTagCase());
        assertEquals("DIV", settings.normalizeTag("DIV"));
        assertEquals("id", settings.normalizeAttribute("ID"));
    }

    @Test
    public void testConstructor_preserveAttributeOnly() {
        ParseSettings settings = new ParseSettings(false, true);
        assertFalse(settings.preserveTagCase());
        assertEquals("div", settings.normalizeTag("DIV"));
        assertEquals("ID", settings.normalizeAttribute("ID"));
    }

    // ---------- normalizeTag: branch if(!preserveTagCase) ----------

    @Test
    public void testNormalizeTag_lowerCaseBranch() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("span", settings.normalizeTag("SPAN"));
    }

    @Test
    public void testNormalizeTag_preserveBranch() {
        ParseSettings settings = new ParseSettings(true, false);
        assertEquals("SPAN", settings.normalizeTag("SPAN"));
    }

    @Test
    public void testNormalizeTag_trimsWhitespace() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("div", settings.normalizeTag("  DIV  "));
    }

    @Test
    public void testNormalizeTag_emptyString() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("", settings.normalizeTag(""));
    }

    @Test
    public void testNormalizeTag_onlyWhitespace() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("", settings.normalizeTag("   "));
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeTag_nullThrowsNPE() {
        // name.trim() จะ throw NPE ก่อนเข้าสู่เงื่อนไข if เมื่อ name เป็น null
        ParseSettings settings = new ParseSettings(false, false);
        settings.normalizeTag(null);
    }

    @Test
    public void testNormalizeTag_alreadyLowerCase() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("p", settings.normalizeTag("p"));
    }

    // ---------- normalizeAttribute: branch if(!preserveAttributeCase) ----------

    @Test
    public void testNormalizeAttribute_lowerCaseBranch() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("href", settings.normalizeAttribute("HREF"));
    }

    @Test
    public void testNormalizeAttribute_preserveBranch() {
        ParseSettings settings = new ParseSettings(false, true);
        assertEquals("HREF", settings.normalizeAttribute("HREF"));
    }

    @Test
    public void testNormalizeAttribute_trimsWhitespace() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("class", settings.normalizeAttribute("  CLASS  "));
    }

    @Test
    public void testNormalizeAttribute_emptyString() {
        ParseSettings settings = new ParseSettings(false, false);
        assertEquals("", settings.normalizeAttribute(""));
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeAttribute_nullThrowsNPE() {
        ParseSettings settings = new ParseSettings(false, false);
        settings.normalizeAttribute(null);
    }

    // ---------- normalizeAttributes (package-private): branch if(!preserveAttributeCase) ----------
    // หมายเหตุ: เมธอดนี้เป็น package-private เรียกได้เนื่องจากเทสอยู่ใน package org.jsoup.parser เดียวกัน

    @Test
    public void testNormalizeAttributes_lowerCaseBranch_keyIsLowercased() {
        ParseSettings settings = new ParseSettings(false, false); // preserveAttributeCase = false
        Attributes attrs = new Attributes();
        attrs.put("ID", "value1");

        Attributes result = settings.normalizeAttributes(attrs);

        assertSame("ควร return object เดิม ไม่สร้าง copy ใหม่", attrs, result);
        // สมมติฐาน: Attributes#get เป็น exact-match, หลัง normalize() key ควรถูกแปลงเป็น lowercase
        assertEquals("value1", result.get("id"));
    }

    @Test
    public void testNormalizeAttributes_preserveBranch_keyUnchanged() {
        ParseSettings settings = new ParseSettings(false, true); // preserveAttributeCase = true
        Attributes attrs = new Attributes();
        attrs.put("ID", "value1");

        Attributes result = settings.normalizeAttributes(attrs);

        assertSame("ควร return object เดิม ไม่สร้าง copy ใหม่", attrs, result);
        // ไม่เรียก normalize() จึงควรคง case เดิมไว้
        assertEquals("value1", result.get("ID"));
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testHtmlDefaultSettings` | ค่า static `htmlDefault` (tag=false, attribute=false) + path lowercase ของทั้งสอง normalize* |
| `testPreserveCaseSettings` | ค่า static `preserveCase` (tag=true, attribute=true) + path preserve ของทั้งสอง normalize* |
| `testConstructor_preserveTagOnly` | Constructor กับ (true, false); normalizeTag=preserve, normalizeAttribute=lowercase |
| `testConstructor_preserveAttributeOnly` | Constructor กับ (false, true); normalizeTag=lowercase, normalizeAttribute=preserve |
| `testNormalizeTag_lowerCaseBranch` | `normalizeTag`: if(!preserveTagCase) == true |
| `testNormalizeTag_preserveBranch` | `normalizeTag`: if(!preserveTagCase) == false |
| `testNormalizeTag_trimsWhitespace` | `name.trim()` ลบ whitespace ก่อน lowercase |
| `testNormalizeTag_emptyString` | boundary: input เป็น empty string |
| `testNormalizeTag_onlyWhitespace` | boundary: input เป็น whitespace ล้วน -> trim เหลือ "" |
| `testNormalizeTag_nullThrowsNPE` | null input -> NPE จาก `name.trim()` (ก่อนถึง if) |
| `testNormalizeTag_alreadyLowerCase` | input ที่เป็น lowercase อยู่แล้ว |
| `testNormalizeAttribute_lowerCaseBranch` | `normalizeAttribute`: if(!preserveAttributeCase) == true |
| `testNormalizeAttribute_preserveBranch` | `normalizeAttribute`: if(!preserveAttributeCase) == false |
| `testNormalizeAttribute_trimsWhitespace` | trim whitespace ก่อน lowercase สำหรับ attribute |
| `testNormalizeAttribute_emptyString` | boundary: empty string |
| `testNormalizeAttribute_nullThrowsNPE` | null input -> NPE จาก `trim()` |
| `testNormalizeAttributes_lowerCaseBranch_keyIsLowercased` | `normalizeAttributes`: if(!preserveAttributeCase) == true -> เรียก `attributes.normalize()`, ตรวจสอบ return reference เดิม |
| `testNormalizeAttributes_preserveBranch_keyUnchanged` | `normalizeAttributes`: if(!preserveAttributeCase) == false -> ไม่เรียก normalize(), ตรวจสอบ return reference เดิมและค่าคงเดิม |

**ข้อสังเกตเรื่อง fault-detection:** เทส `testNormalizeTag_nullThrowsNPE` และ `testNormalizeAttribute_nullThrowsNPE` ช่วยตรวจจับ regression หากมีการเปลี่ยนลำดับโค้ดจาก `name.trim()` ไปเป็นตรวจ null ก่อน (behavior เปลี่ยน) ส่วนเทสคู่ lowercase/preserve ของทั้ง 3 เมธอดช่วยตรวจจับ fault หากมีการสลับเงื่อนไข `!preserveTagCase` / `!preserveAttributeCase` ผิดด้าน (off-by-negation bug)