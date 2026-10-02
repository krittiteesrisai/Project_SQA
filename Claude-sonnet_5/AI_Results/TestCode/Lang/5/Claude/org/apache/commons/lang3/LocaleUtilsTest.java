package org.apache.commons.lang3;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Test;

public class LocaleUtilsTest {

    // ===================== toLocale(String) =====================

    @Test
    public void toLocale_nullInput_returnsNull() {
        // branch: str == null -> return null
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_emptyString_throws() {
        // branch: len < 2 (len == 0)
        LocaleUtils.toLocale("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_singleChar_throws() {
        // branch: len < 2 (len == 1)
        LocaleUtils.toLocale("a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_uppercaseFirstChar_throws() {
        // branch: !Character.isLowerCase(ch0)
        LocaleUtils.toLocale("EN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_uppercaseSecondChar_throws() {
        // branch: !Character.isLowerCase(ch1)
        LocaleUtils.toLocale("eN");
    }

    @Test
    public void toLocale_len2_returnsLanguageOnlyLocale() {
        // branch: len == 2 -> return new Locale(str)
        Locale result = LocaleUtils.toLocale("en");
        assertEquals(new Locale("en"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_len3_throws() {
        // branch: len < 5 (len == 3)
        LocaleUtils.toLocale("eng");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_len4_throws() {
        // branch: len < 5 (len == 4)
        LocaleUtils.toLocale("en_G");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_separatorNotUnderscore_throws() {
        // branch: str.charAt(2) != '_' (len == 5)
        LocaleUtils.toLocale("en-GB");
    }

    @Test
    public void toLocale_doubleUnderscoreVariantOnly_returnsLocaleWithVariant() {
        // branch: ch3 == '_' -> return new Locale(lang, "", variant)
        Locale result = LocaleUtils.toLocale("en__POSIX");
        assertEquals(new Locale("en", "", "POSIX"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_ch3NotUppercase_throws() {
        // branch: !Character.isUpperCase(ch3)
        LocaleUtils.toLocale("en_gB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_ch4NotUppercase_throws() {
        // branch: !Character.isUpperCase(ch4)
        LocaleUtils.toLocale("en_Gb");
    }

    @Test
    public void toLocale_len5_returnsLanguageCountryLocale() {
        // branch: len == 5 -> return new Locale(lang, country)
        Locale result = LocaleUtils.toLocale("en_GB");
        assertEquals(new Locale("en", "GB"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_len6_throws() {
        // branch: len < 7 (len == 6)
        LocaleUtils.toLocale("en_GBx");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_charAt5NotUnderscore_throws() {
        // branch: str.charAt(5) != '_' (len >= 7)
        LocaleUtils.toLocale("en_GBxx");
    }

    @Test
    public void toLocale_fullFormat_returnsFullLocale() {
        // branch: final return statement - full language_country_variant
        Locale result = LocaleUtils.toLocale("en_GB_xxx");
        assertEquals(new Locale("en", "GB", "xxx"), result);
    }

    // ===================== localeLookupList(Locale) =====================

    @Test
    public void localeLookupList_singleArg_delegatesToTwoArgWithSameLocale() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List<Locale> result = LocaleUtils.localeLookupList(locale);
        // locale itself already covers defaultLocale -> contains == true, not added again
        assertEquals(3, result.size());
        assertEquals(new Locale("fr", "CA", "xxx"), result.get(0));
        assertEquals(new Locale("fr", "CA"), result.get(1));
        assertEquals(new Locale("fr"), result.get(2));
    }

    // ===================== localeLookupList(Locale, Locale) =====================

    @Test
    public void localeLookupList_nullLocale_returnsEmptyList() {
        // branch: locale == null -> skip whole if-block, defaultLocale ignored
        List<Locale> result = LocaleUtils.localeLookupList(null, new Locale("en"));
        assertTrue(result.isEmpty());
    }

    @Test
    public void localeLookupList_withVariantAndCountry_defaultNotInList() {
        // branches: variant>0 true, country>0 true, contains(default)==false -> added
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("en");
        List<Locale> result = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(4, result.size());
        assertEquals(new Locale("fr", "CA", "xxx"), result.get(0));
        assertEquals(new Locale("fr", "CA"), result.get(1));
        assertEquals(new Locale("fr"), result.get(2));
        assertEquals(new Locale("en"), result.get(3));
    }

    @Test
    public void localeLookupList_noVariantNoCountry_defaultEqualsLocale() {
        // branches: variant>0 false, country>0 false, contains(default)==true -> not added
        Locale locale = new Locale("de");
        Locale defaultLocale = new Locale("de");
        List<Locale> result = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(1, result.size());
        assertEquals(new Locale("de"), result.get(0));
    }

    @Test
    public void localeLookupList_noVariantHasCountry_defaultDifferent() {
        // branches: variant>0 false, country>0 true, contains(default)==false -> added
        Locale locale = new Locale("en", "US");
        Locale defaultLocale = new Locale("fr");
        List<Locale> result = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(3, result.size());
        assertEquals(new Locale("en", "US"), result.get(0));
        assertEquals(new Locale("en"), result.get(1));
        assertEquals(new Locale("fr"), result.get(2));
    }

    @Test
    public void localeLookupList_resultIsUnmodifiable() {
        List<Locale> result = LocaleUtils.localeLookupList(new Locale("en"));
        try {
            result.add(new Locale("xx"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected - list must be unmodifiable
        }
    }

    // ===================== availableLocaleList / availableLocaleSet =====================

    @Test
    public void availableLocaleList_notNullAndNotEmpty() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertFalse(list.isEmpty());
    }

    @Test
    public void availableLocaleList_isUnmodifiable() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        try {
            list.add(new Locale("xx"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void availableLocaleSet_notNullAndNotEmpty() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        assertFalse(set.isEmpty());
    }

    @Test
    public void availableLocaleSet_isUnmodifiable() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        try {
            set.add(new Locale("xx"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    // ===================== isAvailableLocale =====================

    @Test
    public void isAvailableLocale_knownLocale_returnsTrue() {
        // Locale.US ควรอยู่ใน available locales ของ JVM ทั่วไป
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void isAvailableLocale_unknownLocale_returnsFalse() {
        // สมมติว่า locale แปลกนี้ไม่ได้ติดตั้งในระบบ (ไม่แน่ใจ 100% แต่โอกาสสูง)
        Locale strange = new Locale("xx", "ZZ", "weird_variant_123");
        assertFalse(LocaleUtils.isAvailableLocale(strange));
    }

    // ===================== languagesByCountry =====================

    @Test
    public void languagesByCountry_nullInput_returnsEmptyList() {
        // branch: countryCode == null -> return emptyList
        List<Locale> result = LocaleUtils.languagesByCountry(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void languagesByCountry_validCountry_returnsLocalesWithoutVariant() {
        // branch: cache miss -> compute, loop match (countryCode equals + variant empty) true
        List<Locale> result = LocaleUtils.languagesByCountry("GB");
        assertNotNull(result);
        for (Locale l : result) {
            assertEquals("GB", l.getCountry());
            assertTrue(l.getVariant().isEmpty());
        }
    }

    @Test
    public void languagesByCountry_calledTwice_usesCache() {
        // branch: cache hit path (langs != null ข้าม if-block คำนวณ)
        List<Locale> first = LocaleUtils.languagesByCountry("US");
        List<Locale> second = LocaleUtils.languagesByCountry("US");
        assertSame(first, second);
    }

    @Test
    public void languagesByCountry_unknownCountry_returnsEmptyList() {
        // branch: loop ไม่มี match เลย -> ได้ list ว่าง (แต่ไม่ null)
        List<Locale> result = LocaleUtils.languagesByCountry("XX");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // ===================== countriesByLanguage =====================

    @Test
    public void countriesByLanguage_nullInput_returnsEmptyList() {
        // branch: languageCode == null -> return emptyList
        List<Locale> result = LocaleUtils.countriesByLanguage(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void countriesByLanguage_validLanguage_returnsLocalesWithCountryNoVariant() {
        // branch: cache miss -> loop match (language equals + country not empty + variant empty)
        List<Locale> result = LocaleUtils.countriesByLanguage("en");
        assertNotNull(result);
        for (Locale l : result) {
            assertEquals("en", l.getLanguage());
            assertFalse(l.getCountry().isEmpty());
            assertTrue(l.getVariant().isEmpty());
        }
    }

    @Test
    public void countriesByLanguage_calledTwice_usesCache() {
        // branch: cache hit path (countries != null)
        List<Locale> first = LocaleUtils.countriesByLanguage("fr");
        List<Locale> second = LocaleUtils.countriesByLanguage("fr");
        assertSame(first, second);
    }

    @Test
    public void countriesByLanguage_unknownLanguage_returnsEmptyList() {
        // branch: loop ไม่มี match เลย -> ได้ list ว่าง (แต่ไม่ null)
        List<Locale> result = LocaleUtils.countriesByLanguage("zz");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}
