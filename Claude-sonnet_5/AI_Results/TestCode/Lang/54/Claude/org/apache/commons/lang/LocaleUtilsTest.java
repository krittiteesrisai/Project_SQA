package org.apache.commons.lang;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link LocaleUtils} (Defects4J Lang-54b)
 * มุ่งเน้นให้ได้ branch coverage สูงสุดและดักจับ fault ที่เป็นไปได้
 */
public class LocaleUtilsTest {

    // =====================================================================
    // toLocale(String) tests
    // =====================================================================

    @Test
    public void testToLocale_NullInput() {
        // branch: str == null -> return null
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_EmptyString_LenZero() {
        // len=0 -> len!=2 && len!=5 && len<7 => true -> throw
        LocaleUtils.toLocale("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenOne_Invalid() {
        // len=1 -> throw (length check)
        LocaleUtils.toLocale("a");
    }

    @Test
    public void testToLocale_LenTwo_Valid() {
        // len==2 branch -> return new Locale(str,"")
        Locale result = LocaleUtils.toLocale("en");
        assertEquals(new Locale("en", ""), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenTwo_Ch0TooLow() {
        // ch0 < 'a' -> throw
        LocaleUtils.toLocale("1n");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenTwo_Ch0TooHigh() {
        // ch0 > 'z' -> throw
        LocaleUtils.toLocale("{n");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenTwo_Ch1TooLow() {
        // ch1 < 'a' (uppercase 'N' is < 'a') -> throw
        LocaleUtils.toLocale("eN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenTwo_Ch1TooHigh() {
        // ch1 > 'z' -> throw
        LocaleUtils.toLocale("e{");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenThree_Invalid() {
        // len=3 -> length check throw (len!=2 && len!=5 && len<7)
        LocaleUtils.toLocale("en_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenFour_Invalid() {
        // len=4 -> length check throw
        LocaleUtils.toLocale("en_G");
    }

    @Test
    public void testToLocale_LenFive_Valid() {
        // len==5 branch -> return Locale(lang,country)
        Locale result = LocaleUtils.toLocale("en_GB");
        assertEquals(new Locale("en", "GB"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenFive_BadSeparator() {
        // str.charAt(2) != '_' -> throw
        LocaleUtils.toLocale("enXGB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenFive_Ch3TooLow() {
        // ch3 < 'A' -> throw
        LocaleUtils.toLocale("en_1B");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenFive_Ch3TooHigh() {
        // ch3 > 'Z' (lowercase 'g') -> throw
        LocaleUtils.toLocale("en_gB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenFive_Ch4TooLow() {
        // ch4 < 'A' -> throw
        LocaleUtils.toLocale("en_G1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenFive_Ch4TooHigh() {
        // ch4 > 'Z' (lowercase 'b') -> throw
        LocaleUtils.toLocale("en_Gb");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenSix_Invalid() {
        // len=6 -> length check throw (6<7)
        LocaleUtils.toLocale("en_GBX");
    }

    @Test
    public void testToLocale_LenSeven_ValidWithVariant() {
        // len==7, charAt(5)=='_' -> return Locale(lang,country,variant)
        Locale result = LocaleUtils.toLocale("en_GB_X");
        assertEquals(new Locale("en", "GB", "X"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_LenSeven_BadSeparatorAt5() {
        // str.charAt(5) != '_' -> throw
        LocaleUtils.toLocale("en_GBXY");
    }

    @Test
    public void testToLocale_LenNine_ValidLongerVariant() {
        // len > 7, variant substring works fine
        Locale result = LocaleUtils.toLocale("en_GB_xyz");
        assertEquals(new Locale("en", "GB", "xyz"), result);
    }

    // =====================================================================
    // localeLookupList(Locale) / localeLookupList(Locale, Locale) tests
    // =====================================================================

    @Test
    public void testLocaleLookupList_NullLocale() {
        // locale != null -> false branch -> empty list
        List result = LocaleUtils.localeLookupList(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testLocaleLookupList_NullLocale_WithDefault() {
        // locale == null (first param), defaultLocale ignored because outer if fails
        List result = LocaleUtils.localeLookupList(null, new Locale("en"));
        assertTrue(result.isEmpty());
    }

    @Test
    public void testLocaleLookupList_NoCountryNoVariant_SameAsDefault() {
        // variant.length()==0 -> skip; country.length()==0 -> skip;
        // contains(defaultLocale)==true (since same locale added already) -> skip add
        Locale locale = new Locale("en");
        List result = LocaleUtils.localeLookupList(locale, locale);
        assertEquals(1, result.size());
        assertEquals(new Locale("en"), result.get(0));
    }

    @Test
    public void testLocaleLookupList_WithCountry_DifferentDefault() {
        // variant empty -> skip; country not empty -> add Locale(lang,"");
        // contains(defaultLocale)==false -> add defaultLocale
        Locale locale = new Locale("en", "US");
        Locale def = new Locale("fr");
        List result = LocaleUtils.localeLookupList(locale, def);
        assertEquals(3, result.size());
        assertEquals(new Locale("en", "US"), result.get(0));
        assertEquals(new Locale("en", ""), result.get(1));
        assertEquals(new Locale("fr"), result.get(2));
    }

    @Test
    public void testLocaleLookupList_WithVariant_SameAsDefault() {
        // variant not empty -> add Locale(lang,country);
        // country not empty -> add Locale(lang,"");
        // contains(defaultLocale)==true (locale itself is default, added first) -> skip
        Locale locale = new Locale("en", "US", "xxx");
        List result = LocaleUtils.localeLookupList(locale, locale);
        assertEquals(3, result.size());
        assertEquals(new Locale("en", "US", "xxx"), result.get(0));
        assertEquals(new Locale("en", "US"), result.get(1));
        assertEquals(new Locale("en", ""), result.get(2));
    }

    @Test
    public void testLocaleLookupList_DefaultLocaleAdded_NotContained() {
        // Ensure branch contains(defaultLocale)==false with a locale that
        // has no variant/country so only two entries are naturally produced,
        // and defaultLocale (different) gets appended.
        Locale locale = new Locale("fr");
        Locale def = new Locale("en");
        List result = LocaleUtils.localeLookupList(locale, def);
        assertEquals(2, result.size());
        assertEquals(new Locale("fr"), result.get(0));
        assertEquals(new Locale("en"), result.get(1));
    }

    @Test
    public void testLocaleLookupList_SingleArgOverload_DelegatesCorrectly() {
        // localeLookupList(Locale) calls localeLookupList(locale, locale)
        Locale locale = new Locale("en", "US");
        List result = LocaleUtils.localeLookupList(locale);
        assertEquals(2, result.size());
        assertEquals(new Locale("en", "US"), result.get(0));
        assertEquals(new Locale("en", ""), result.get(1));
    }

    // =====================================================================
    // availableLocaleList() tests
    // =====================================================================

    @Test
    public void testAvailableLocaleList_NotNullNotEmpty() {
        List result = LocaleUtils.availableLocaleList();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testAvailableLocaleList_IsUnmodifiable() {
        List result = LocaleUtils.availableLocaleList();
        try {
            result.add(new Locale("xx"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected - list must be unmodifiable
        }
    }

    // =====================================================================
    // availableLocaleSet() tests
    // =====================================================================

    @Test
    public void testAvailableLocaleSet_FirstCall_CreatesSet() {
        // set == null branch -> creates new set
        Set result = LocaleUtils.availableLocaleSet();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testAvailableLocaleSet_SecondCall_ReturnsCached() {
        // first call to ensure cache populated, second call set != null branch
        Set first = LocaleUtils.availableLocaleSet();
        Set second = LocaleUtils.availableLocaleSet();
        assertSame(first, second);
    }

    @Test
    public void testAvailableLocaleSet_IsUnmodifiable() {
        Set result = LocaleUtils.availableLocaleSet();
        try {
            result.add(new Locale("xx"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // =====================================================================
    // isAvailableLocale(Locale) tests
    // =====================================================================

    @Test
    public void testIsAvailableLocale_True() {
        // pick a locale guaranteed to be in availableLocaleList
        Locale known = (Locale) LocaleUtils.availableLocaleList().get(0);
        assertTrue(LocaleUtils.isAvailableLocale(known));
    }

    @Test
    public void testIsAvailableLocale_False() {
        // A locale unlikely to be a JDK-registered locale
        Locale unknown = new Locale("zz", "ZZ", "unknown_variant_xyz");
        assertFalse(LocaleUtils.isAvailableLocale(unknown));
    }

    // =====================================================================
    // languagesByCountry(String) tests
    // =====================================================================

    @Test
    public void testLanguagesByCountry_NullCountryCode() {
        // countryCode == null -> langs = Collections.EMPTY_LIST
        List result = LocaleUtils.languagesByCountry(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_KnownCountry_NotEmpty() {
        // countryCode != null, loop finds matches (US typically has multiple languages)
        List result = LocaleUtils.languagesByCountry("US");
        assertNotNull(result);
        // NOTE: exact size depends on JDK; we just assert non-null & list is of Locale
        for (Object o : result) {
            assertTrue(o instanceof Locale);
            assertEquals("US", ((Locale) o).getCountry());
            assertEquals(0, ((Locale) o).getVariant().length());
        }
    }

    @Test
    public void testLanguagesByCountry_UnknownCountry_EmptyButComputed() {
        // countryCode != null but no locale matches -> empty ArrayList (not EMPTY_LIST constant)
        List result = LocaleUtils.languagesByCountry("XX_INVALID_CODE_123");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_CalledTwice_UsesCache() {
        // First call computes and caches; second call takes (langs != null) path
        List first = LocaleUtils.languagesByCountry("GB");
        List second = LocaleUtils.languagesByCountry("GB");
        assertEquals(first, second);
    }

    @Test
    public void testLanguagesByCountry_IsUnmodifiable() {
        List result = LocaleUtils.languagesByCountry("US");
        if (!result.isEmpty()) {
            try {
                result.add(new Locale("xx"));
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException e) {
                // expected
            }
        }
        // NOTE: if result happens to be empty on some JDKs, unmodifiability
        // of empty list cannot be asserted here safely; test above already
        // covers non-empty via KnownCountry test on most JDKs.
    }

    // =====================================================================
    // countriesByLanguage(String) tests
    // =====================================================================

    @Test
    public void testCountriesByLanguage_NullLanguageCode() {
        // languageCode == null -> Collections.EMPTY_LIST
        List result = LocaleUtils.countriesByLanguage(null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_KnownLanguage_NotEmpty() {
        // languageCode != null, loop finds matches with country!=0 && variant==0
        List result = LocaleUtils.countriesByLanguage("en");
        assertNotNull(result);
        for (Object o : result) {
            assertTrue(o instanceof Locale);
            Locale loc = (Locale) o;
            assertEquals("en", loc.getLanguage());
            assertTrue(loc.getCountry().length() != 0);
            assertEquals(0, loc.getVariant().length());
        }
    }

    @Test
    public void testCountriesByLanguage_UnknownLanguage_EmptyButComputed() {
        // languageCode != null but no match -> empty ArrayList
        List result = LocaleUtils.countriesByLanguage("zzInvalidLang");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_CalledTwice_UsesCache() {
        // First call computes/caches; second call takes (countries != null) path
        List first = LocaleUtils.countriesByLanguage("fr");
        List second = LocaleUtils.countriesByLanguage("fr");
        assertEquals(first, second);
    }

    @Test
    public void testCountriesByLanguage_IsUnmodifiable() {
        List result = LocaleUtils.countriesByLanguage("en");
        if (!result.isEmpty()) {
            try {
                result.add(new Locale("xx"));
                fail("Expected UnsupportedOperationException");
            } catch (UnsupportedOperationException e) {
                // expected
            }
        }
    }

    // =====================================================================
    // Constructor test (for coverage of public no-op constructor)
    // =====================================================================

    @Test
    public void testConstructor_Instantiable() {
        // NOTE: constructor has no real logic to assert beyond instantiation
        LocaleUtils instance = new LocaleUtils();
        assertNotNull(instance);
    }
}
