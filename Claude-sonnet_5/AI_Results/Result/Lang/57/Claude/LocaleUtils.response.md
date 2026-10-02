# JUnit 4 Test Suite สำหรับ `LocaleUtils` (Lang-57b)

```java
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.apache.commons.lang.LocaleUtils;
import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.lang.LocaleUtils (Defects4J Lang-57b)
 *
 * หมายเหตุทั่วไป:
 * - การทดสอบ isAvailableLocale(..) อ้างอิงจาก field คงที่ cAvailableLocaleSet
 *   ซึ่งถูก initialize แบบ lazy เฉพาะใน availableLocaleSet() เท่านั้น
 *   ถ้าไม่เคยเรียก availableLocaleSet() มาก่อน field นี้จะเป็น null
 *   และ isAvailableLocale() อาจ throw NullPointerException (ไม่ได้ guard เอง)
 *   เราจึงเรียก availableLocaleSet() ก่อนเสมอเพื่อไม่ให้ test flaky ตามลำดับการรัน
 * - สมมติฐานเรื่อง Locale ที่ "มีอยู่จริง" บนทุก JVM (เช่น Locale.US)
 *   และ Locale/ประเทศ/ภาษาที่ "ไม่มีอยู่จริง" (เช่น qq_QQ, ZZ, zz)
 *   เป็นสมมติฐานที่สมเหตุสมผลตาม ISO 639 / ISO 3166 แต่ไม่ได้ถูกยืนยัน 100% จากซอร์ส
 */
public class LocaleUtilsTest {

    // ---------- Helper ----------
    private void assertInvalidFormats(String... values) {
        for (String v : values) {
            try {
                LocaleUtils.toLocale(v);
                fail("Expected IllegalArgumentException for input: [" + v + "]");
            } catch (IllegalArgumentException e) {
                // expected
            }
        }
    }

    // =====================================================================
    // toLocale(String)
    // =====================================================================

    @Test
    public void testToLocale_NullInput_ReturnsNull() {
        assertEquals(null, LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_Length2_ReturnsLocaleWithEmptyCountry() {
        Locale result = LocaleUtils.toLocale("en");
        assertEquals(new Locale("en", ""), result);
        assertEquals("en", result.getLanguage());
        assertEquals("", result.getCountry());
    }

    @Test
    public void testToLocale_Length5_ReturnsLocaleWithCountry() {
        Locale result = LocaleUtils.toLocale("en_GB");
        assertEquals(new Locale("en", "GB"), result);
        assertEquals("en", result.getLanguage());
        assertEquals("GB", result.getCountry());
    }

    @Test
    public void testToLocale_LengthMinSeven_ReturnsLocaleWithVariant() {
        // boundary: length == 7 is the minimum valid length for 3-part locale
        Locale result = LocaleUtils.toLocale("en_GB_x");
        assertEquals("en", result.getLanguage());
        assertEquals("GB", result.getCountry());
        assertEquals("x", result.getVariant());
    }

    @Test
    public void testToLocale_LengthGreaterThanSeven_ReturnsLocaleWithLongerVariant() {
        Locale result = LocaleUtils.toLocale("en_GB_xxx");
        assertEquals(new Locale("en", "GB", "xxx"), result);
    }

    @Test
    public void testToLocale_InvalidLength_Throws() {
        // len != 2 && len != 5 && len < 7  -> ครอบคลุม len = 0,1,3,4,6
        assertInvalidFormats("", "e", "abc", "abcd", "abcde" + "f" /*len6*/);
    }

    @Test
    public void testToLocale_Length6_TrailingUnderscoreNoVariant_Throws() {
        // boundary เฉพาะ: ความยาว 6 (น้อยกว่า 7) ถูกบล็อกโดย length-check ก่อน
        // ถึงเนื้อหาจะดูเหมือนรูปแบบ en_GB_ ที่ถูกต้องบางส่วนก็ตาม
        assertInvalidFormats("en_GB_");
    }

    @Test
    public void testToLocale_LanguageNotLowercase_Throws() {
        // ครอบคลุมเงื่อนไข ch0<'a' , ch0>'z' , ch1<'a' , ch1>'z' ทั้งสองทิศทาง (boundary)
        assertInvalidFormats(
                "EN",   // ch0 uppercase
                "eN",   // ch1 uppercase
                "1a",   // ch0 non-letter (digit) below 'a'
                "a1",   // ch1 non-letter (digit) below 'a'... (1 < 'a')
                "`a",   // ch0 == 'a'-1 (boundary below)
                "{a",   // ch0 == 'z'+1 (boundary above)
                "a`",   // ch1 == 'a'-1 (boundary below)
                "a{"    // ch1 == 'z'+1 (boundary above)
        );
    }

    @Test
    public void testToLocale_Len5_SeparatorNotUnderscore_Throws() {
        assertInvalidFormats("en:GB");
    }

    @Test
    public void testToLocale_Len5_CountryNotUppercase_Throws() {
        // ครอบคลุม ch3<'A', ch3>'Z', ch4<'A', ch4>'Z' และกรณีตัวพิมพ์เล็กผสม
        assertInvalidFormats(
                "en_gb",
                "en_Gb",
                "en_gB",
                "en_@B", // ch3 == 'A'-1
                "en_[B", // ch3 == 'Z'+1
                "en_A@", // ch4 == 'A'-1
                "en_A["  // ch4 == 'Z'+1
        );
    }

    @Test
    public void testToLocale_LenGE7_SeparatorAtIndex2NotUnderscore_Throws() {
        // length = 7, charAt(2) != '_'
        assertInvalidFormats("enxGB_x");
    }

    @Test
    public void testToLocale_LenGE7_CountryNotUppercase_Throws() {
        assertInvalidFormats("en_gb_x", "en_Gb_x", "en_gB_x");
    }

    @Test
    public void testToLocale_LenGE7_SeparatorAtIndex5NotUnderscore_Throws() {
        // length = 7, charAt(5) != '_'
        assertInvalidFormats("en_GBxx");
    }

    // =====================================================================
    // localeLookupList(Locale)  &  localeLookupList(Locale, Locale)
    // =====================================================================

    @Test
    public void testLocaleLookupList_SingleArg_NoCountryNoVariant() {
        Locale locale = new Locale("en");
        List list = LocaleUtils.localeLookupList(locale);
        assertEquals(1, list.size());
        assertEquals(locale, list.get(0));
    }

    @Test
    public void testLocaleLookupList_SingleArg_WithCountryNoVariant() {
        Locale locale = new Locale("en", "US");
        List list = LocaleUtils.localeLookupList(locale);
        assertEquals(2, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("en", ""), list.get(1));
    }

    @Test
    public void testLocaleLookupList_SingleArg_WithVariantAndCountry() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List list = LocaleUtils.localeLookupList(locale);
        assertEquals(3, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
    }

    @Test
    public void testLocaleLookupList_TwoArg_DefaultNotInList() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("en");
        List list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(4, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
        assertEquals(defaultLocale, list.get(3));
    }

    @Test
    public void testLocaleLookupList_TwoArg_DefaultAlreadyInList() {
        // defaultLocale เท่ากับ element ที่ถูกเพิ่มโดยอัตโนมัติ -> ไม่ถูกเพิ่มซ้ำ
        Locale locale = new Locale("en", "US");
        Locale defaultLocale = new Locale("en", "");
        List list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(2, list.size()); // ไม่มีการเพิ่ม defaultLocale ซ้ำ
    }

    @Test
    public void testLocaleLookupList_NullLocale_ReturnsEmptyList() {
        // ตามซอร์ส: ถ้า locale == null ทั้ง block ถูกข้าม แม้ defaultLocale ไม่ null ก็ไม่ถูกเพิ่ม
        List list = LocaleUtils.localeLookupList(null, new Locale("en"));
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLocaleLookupList_ResultIsUnmodifiable() {
        List list = LocaleUtils.localeLookupList(new Locale("en"));
        try {
            list.add(new Locale("fr"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // =====================================================================
    // availableLocaleList() / availableLocaleSet() / isAvailableLocale()
    // =====================================================================

    @Test
    public void testAvailableLocaleList_NotEmptyAndUnmodifiable() {
        List list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertFalse(list.isEmpty());
        try {
            list.add(Locale.US);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAvailableLocaleSet_ContainsAllFromList_AndUnmodifiable() {
        Set set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        List list = LocaleUtils.availableLocaleList();
        assertTrue(set.containsAll(list));
        try {
            set.add(Locale.US);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAvailableLocaleSet_CachedInstanceReturnedOnSecondCall() {
        Set first = LocaleUtils.availableLocaleSet();
        Set second = LocaleUtils.availableLocaleSet();
        assertSame(first, second); // ตรวจ cache ตาม logic (cAvailableLocaleSet != null)
    }

    @Test
    public void testIsAvailableLocale_KnownLocale_True() {
        // เรียก availableLocaleSet() ก่อนเพื่อ initialize cache (ดูหมายเหตุบนสุด)
        LocaleUtils.availableLocaleSet();
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void testIsAvailableLocale_UnknownLocale_False() {
        LocaleUtils.availableLocaleSet();
        Locale fake = new Locale("qq", "QQ"); // สมมติว่าไม่มีจริงในทุก JVM
        assertFalse(LocaleUtils.isAvailableLocale(fake));
    }

    // =====================================================================
    // languagesByCountry(String)
    // =====================================================================

    @Test
    public void testLanguagesByCountry_NullReturnsEmptyList() {
        List list = LocaleUtils.languagesByCountry(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_KnownCountry() {
        List list = LocaleUtils.languagesByCountry("US");
        assertFalse(list.isEmpty());
        for (Object o : list) {
            Locale locale = (Locale) o;
            assertEquals("US", locale.getCountry());
            assertEquals("", locale.getVariant());
        }
    }

    @Test
    public void testLanguagesByCountry_UnknownCountry_EmptyList() {
        // "ZZ" ไม่ใช่รหัสประเทศจริงตาม ISO 3166
        List list = LocaleUtils.languagesByCountry("ZZ");
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_CacheConsistency() {
        List first = LocaleUtils.languagesByCountry("GB");
        List second = LocaleUtils.languagesByCountry("GB");
        assertSame(first, second); // ตรวจ branch ที่ langs != null (จาก cache map)
    }

    @Test
    public void testLanguagesByCountry_ResultIsUnmodifiable() {
        List list = LocaleUtils.languagesByCountry("US");
        try {
            list.add(Locale.US);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // =====================================================================
    // countriesByLanguage(String)
    // =====================================================================

    @Test
    public void testCountriesByLanguage_NullReturnsEmptyList() {
        List list = LocaleUtils.countriesByLanguage(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_KnownLanguage() {
        List list = LocaleUtils.countriesByLanguage("en");
        assertFalse(list.isEmpty());
        for (Object o : list) {
            Locale locale = (Locale) o;
            assertEquals("en", locale.getLanguage());
            assertFalse(locale.getCountry().length() == 0);
            assertEquals("", locale.getVariant());
        }
    }

    @Test
    public void testCountriesByLanguage_UnknownLanguage_EmptyList() {
        // "zz" ไม่ใช่รหัสภาษาจริงตาม ISO 639
        List list = LocaleUtils.countriesByLanguage("zz");
        assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_CacheConsistency() {
        List first = LocaleUtils.countriesByLanguage("fr");
        List second = LocaleUtils.countriesByLanguage("fr");
        assertSame(first, second);
    }

    @Test
    public void testCountriesByLanguage_ResultIsUnmodifiable() {
        List list = LocaleUtils.countriesByLanguage("en");
        try {
            list.add(Locale.US);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}
```

---

## สรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testToLocale_NullInput_ReturnsNull` | `str == null` → true |
| `testToLocale_Length2_*` | `len == 2` → true |
| `testToLocale_Length5_*` | `len == 5` → true, separator `_` ถูก, ch3/ch4 ถูก |
| `testToLocale_LengthMinSeven_*`, `_GreaterThanSeven_*` | `len >= 7` (else สุดท้าย), charAt(5)=='_' ถูก |
| `testToLocale_InvalidLength_Throws` | `len!=2 && len!=5 && len<7` → true (len=0,1,3,4,6) |
| `testToLocale_Length6_TrailingUnderscore_Throws` | boundary length=6 ตกใน length-check ก่อนตรวจเนื้อหา |
| `testToLocale_LanguageNotLowercase_Throws` | `ch0<'a' \|\| ch0>'z' \|\| ch1<'a' \|\| ch1>'z'` ทุก sub-condition (รวม boundary ``/`{`) |
| `testToLocale_Len5_SeparatorNotUnderscore_Throws` | `str.charAt(2) != '_'` (กรณี len==5) → true |
| `testToLocale_Len5_CountryNotUppercase_Throws` | `ch3<'A' \|\| ch3>'Z' \|\| ch4<'A' \|\| ch4>'Z'` (len==5) ทุก sub-condition |
| `testToLocale_LenGE7_SeparatorAtIndex2NotUnderscore_Throws` | `str.charAt(2) != '_'` (กรณี len>=7, else branch) → true |
| `testToLocale_LenGE7_CountryNotUppercase_Throws` | ch3/ch4 ไม่ uppercase ในกิ่ง len>=7 |
| `testToLocale_LenGE7_SeparatorAtIndex5NotUnderscore_Throws` | `str.charAt(5) != '_'` → true (สุดท้าย throw) |
| `testLocaleLookupList_SingleArg_*`, `_TwoArg_*` | `locale.getVariant().length()>0`, `locale.getCountry().length()>0`, `list.contains(defaultLocale)==false` ทั้ง true/false |
| `testLocaleLookupList_NullLocale_ReturnsEmptyList` | `locale != null` → false |
| `testLocaleLookupList_ResultIsUnmodifiable` | ตรวจ `Collections.unmodifiableList` |
| `testAvailableLocaleList_*` | ค่า static list พื้นฐาน + unmodifiable |
| `testAvailableLocaleSet_*` | `set == null` → true (lazy init) และ false (cache hit) |
| `testIsAvailableLocale_KnownLocale_True` / `_UnknownLocale_False` | `cAvailableLocaleSet.contains(locale)` true/false |
| `testLanguagesByCountry_NullReturnsEmptyList` | `countryCode != null` → false → `Collections.EMPTY_LIST` |
| `testLanguagesByCountry_KnownCountry` | loop + if condition `countryCode.equals(...) && variant.length()==0` → true |
| `testLanguagesByCountry_UnknownCountry_EmptyList` | loop เงื่อนไข false ทุก iteration |
| `testLanguagesByCountry_CacheConsistency` | `langs == null` → false (cache branch) |
| `testLanguagesByCountry_ResultIsUnmodifiable` | unmodifiable list check |
| `testCountriesByLanguage_*` (เทียบเท่า) | เหมือนกลุ่ม `languagesByCountry` แต่เพิ่มเงื่อนไข `country.length() != 0` |

**หมายเหตุสำคัญ:** การทดสอบ `isAvailableLocale` อาจมีความเสี่ยง NPE ถ้าไม่เคยเรียก `availableLocaleSet()` มาก่อน เนื่องจาก static field `cAvailableLocaleSet` ไม่ได้ initialize ไว้ตั้งแต่ class-loading — จึงเรียก `availableLocaleSet()` ก่อนเสมอเพื่อความเสถียรของเทส (ไม่ได้ถือเป็นการเดา behavior แต่เป็นการ setup ป้องกัน side-effect จาก static state)