package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Test;

public class LocaleUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new LocaleUtils());
    }

    // --- toLocale Tests (Branch & Edge Cases) ---

    @Test
    public void testToLocale_Null() {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_EmptyString() {
        LocaleUtils.toLocale("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_TooShort() {
        LocaleUtils.toLocale("a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidLanguageUppercase() {
        LocaleUtils.toLocale("EN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidLanguageDigit() {
        LocaleUtils.toLocale("1n");
    }

    @Test
    public void testToLocale_ValidLanguageOnly() {
        Locale locale = LocaleUtils.toLocale("en");
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_Length3Invalid() {
        LocaleUtils.toLocale("en_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_NoUnderscoreAtIndex2() {
        LocaleUtils.toLocale("enXgb");
    }

    @Test
    public void testToLocale_LanguageAndEmptyCountryWithVariant() {
        Locale locale = LocaleUtils.toLocale("en__GB");
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("GB", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidCountryLowercase() {
        LocaleUtils.toLocale("en_gb");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidCountryDigit() {
        LocaleUtils.toLocale("en_99");
    }

    @Test
    public void testToLocale_ValidLanguageAndCountry() {
        Locale locale = LocaleUtils.toLocale("en_GB");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_Length6Invalid() {
        LocaleUtils.toLocale("en_GB_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_NoUnderscoreAtPin5() {
        LocaleUtils.toLocale("en_GBXxxx");
    }

    @Test
    public void testToLocale_ValidLanguageCountryVariant() {
        Locale locale = LocaleUtils.toLocale("en_GB_xxx");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("xxx", locale.getVariant());
    }

    // --- localeLookupList Tests ---

    @Test
    public void testLocaleLookupList_NullLocale() {
        List<Locale> list = LocaleUtils.localeLookupList(null);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLocaleLookupList_NullLocaleWithDefault() {
        List<Locale> list = LocaleUtils.localeLookupList(null, Locale.US);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLocaleLookupList_LanguageOnly() {
        Locale locale = new Locale("fr");
        List<Locale> list = LocaleUtils.localeLookupList(locale, Locale.US);
        assertEquals(2, list.size());
        assertEquals(new Locale("fr"), list.get(0));
        assertEquals(Locale.US, list.get(1));
    }

    @Test
    public void testLocaleLookupList_LanguageAndCountry() {
        Locale locale = new Locale("fr", "CA");
        List<Locale> list = LocaleUtils.localeLookupList(locale, Locale.US);
        assertEquals(3, list.size());
        assertEquals(new Locale("fr", "CA"), list.get(0));
        assertEquals(new Locale("fr", ""), list.get(1));
        assertEquals(Locale.US, list.get(2));
    }

    @Test
    public void testLocaleLookupList_LanguageCountryVariant() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List<Locale> list = LocaleUtils.localeLookupList(locale, Locale.US);
        assertEquals(4, list.size());
        assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
        assertEquals(Locale.US, list.get(3));
    }

    @Test
    public void testLocaleLookupList_DefaultAlreadyContained() {
        Locale locale = new Locale("en", "US");
        // Locale.US is already part of the lookup hierarchy generated, so it shouldn't duplicate
        List<Locale> list = LocaleUtils.localeLookupList(locale, Locale.US);
        assertEquals(2, list.size());
        assertEquals(new Locale("en", "US"), list.get(0));
        assertEquals(new Locale("en", ""), list.get(1));
    }

    // --- Available Locales & Helpers ---

    @Test
    public void testAvailableLocaleListAndSet() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        assertNotNull(list);
        assertNotNull(set);
        assertFalse(list.isEmpty());
        assertEquals(list.size(), set.size());
    }

    @Test
    public void testIsAvailableLocale() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
        Locale fakeLocale = new Locale("xx", "YY", "ZZ");
        assertFalse(LocaleUtils.isAvailableLocale(fakeLocale));
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    // --- languagesByCountry & countriesByLanguage ---

    @Test
    public void testLanguagesByCountry() {
        assertTrue(LocaleUtils.languagesByCountry(null).isEmpty());
        assertTrue(LocaleUtils.languagesByCountry("ZZ").isEmpty());
        
        List<Locale> gbLangs = LocaleUtils.languagesByCountry("GB");
        assertNotNull(gbLangs);
        // Test caching branch (calling second time hits map)
        List<Locale> gbLangsCached = LocaleUtils.languagesByCountry("GB");
        assertEquals(gbLangs, gbLangsCached);
    }

    @Test
    public void testCountriesByLanguage() {
        assertTrue(LocaleUtils.countriesByLanguage(null).isEmpty());
        assertTrue(LocaleUtils.countriesByLanguage("zz").isEmpty());
        
        List<Locale> enCountries = LocaleUtils.countriesByLanguage("en");
        assertNotNull(enCountries);
        // Test caching branch
        List<Locale> enCountriesCached = LocaleUtils.countriesByLanguage("en");
        assertEquals(enCountries, enCountriesCached);
    }
}