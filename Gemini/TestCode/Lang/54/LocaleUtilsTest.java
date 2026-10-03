package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Test;

/**
 * Test cases for {@link LocaleUtils}.
 */
public class LocaleUtilsTest {

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_US_WIN = new Locale("en", "US", "WIN");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_QQ = new Locale("qq", "");
    private static final Locale LOCALE_QQ_ZZ = new Locale("qq", "ZZ");

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new LocaleUtils());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToLocale_validLanguages() {
        assertNull(LocaleUtils.toLocale(null));

        assertValidToLocale("us", "us", "");
        assertValidToLocale("fr", "fr", "");
        assertValidToLocale("de", "de", "");
        assertValidToLocale("zh", "zh", "");
        assertValidToLocale("qq", "qq", "");
    }

    @Test
    public void testToLocale_validLanguageAndCountry() {
        assertValidToLocale("us_EN", "us", "EN");
        assertValidToLocale("fr_CA", "fr", "CA");
        assertValidToLocale("de_CH", "de", "CH");
        assertValidToLocale("en_GB", "en", "GB");
    }

    @Test
    public void testToLocale_validLanguageCountryAndVariant() {
        assertValidToLocale("us_EN_A", "us", "EN", "A");
        assertValidToLocale("fr_CA_xxx", "fr", "CA", "xxx");
        assertValidToLocale("de_CH_POSIX", "de", "CH", "POSIX");
        assertValidToLocale("en_GB_special_variant", "en", "GB", "special_variant");
    }

    @Test
    public void testToLocale_invalidLength() {
        assertInvalidToLocale("");
        assertInvalidToLocale("e");
        assertInvalidToLocale("eng");
        assertInvalidToLocale("engl");
        assertInvalidToLocale("en_G");
        assertInvalidToLocale("en_GB_");
    }

    @Test
    public void testToLocale_invalidLanguageChars() {
        assertInvalidToLocale("12");
        assertInvalidToLocale("En");
        assertInvalidToLocale("eN");
        assertInvalidToLocale("EN");
        assertInvalidToLocale("e1");
        assertInvalidToLocale("1e");
        assertInvalidToLocale("e_");
        assertInvalidToLocale("_e");
        assertInvalidToLocale("`a");
        assertInvalidToLocale("{a");
        assertInvalidToLocale("a`");
        assertInvalidToLocale("a{");
    }

    @Test
    public void testToLocale_invalidCountrySeparator() {
        assertInvalidToLocale("en-GB");
        assertInvalidToLocale("en:GB");
        assertInvalidToLocale("en+GB");
        assertInvalidToLocale("en/GB");
        assertInvalidToLocale("en#GB");
    }

    @Test
    public void testToLocale_invalidCountryChars() {
        assertInvalidToLocale("en_gb");
        assertInvalidToLocale("en_Gb");
        assertInvalidToLocale("en_gB");
        assertInvalidToLocale("en_12");
        assertInvalidToLocale("en_G1");
        assertInvalidToLocale("en_1B");
        assertInvalidToLocale("en_@B");
        assertInvalidToLocale("en_[B");
        assertInvalidToLocale("en_G@");
        assertInvalidToLocale("en_G[");
    }

    @Test
    public void testToLocale_invalidVariantSeparator() {
        assertInvalidToLocale("en_GB-xxx");
        assertInvalidToLocale("en_GB:xxx");
        assertInvalidToLocale("en_GB+xxx");
        assertInvalidToLocale("en_GB#xxx");
    }

    private void assertValidToLocale(String localeString, String expectedLanguage, String expectedCountry) {
        Locale locale = LocaleUtils.toLocale(localeString);
        assertNotNull("Locale should not be null", locale);
        assertEquals(expectedLanguage, locale.getLanguage());
        assertEquals(expectedCountry, locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    private void assertValidToLocale(String localeString, String expectedLanguage, String expectedCountry, String expectedVariant) {
        Locale locale = LocaleUtils.toLocale(localeString);
        assertNotNull("Locale should not be null", locale);
        assertEquals(expectedLanguage, locale.getLanguage());
        assertEquals(expectedCountry, locale.getCountry());
        assertEquals(expectedVariant, locale.getVariant());
    }

    private void assertInvalidToLocale(String localeString) {
        try {
            LocaleUtils.toLocale(localeString);
            fail("Expected IllegalArgumentException for: " + localeString);
        } catch (IllegalArgumentException expected) {
            // Success
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testLocaleLookupList_nullLocale() {
        List list = LocaleUtils.localeLookupList(null);
        assertNotNull(list);
        assertEquals(0, list.size());
        
        list = LocaleUtils.localeLookupList(null, LOCALE_EN);
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testLocaleLookupList_languageOnly() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN);
        assertEquals(1, list.size());
        assertEquals(LOCALE_EN, list.get(0));

        list = LocaleUtils.localeLookupList(LOCALE_EN, LOCALE_FR);
        assertEquals(2, list.size());
        assertEquals(LOCALE_EN, list.get(0));
        assertEquals(LOCALE_FR, list.get(1));

        // Default locale is same as target locale -> no duplicates
        list = LocaleUtils.localeLookupList(LOCALE_EN, LOCALE_EN);
        assertEquals(1, list.size());
        assertEquals(LOCALE_EN, list.get(0));
    }

    @Test
    public void testLocaleLookupList_languageAndCountry() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN_US);
        assertEquals(2, list.size());
        assertEquals(LOCALE_EN_US, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));

        list = LocaleUtils.localeLookupList(LOCALE_EN_US, LOCALE_FR);
        assertEquals(3, list.size());
        assertEquals(LOCALE_EN_US, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));
        assertEquals(LOCALE_FR, list.get(2));

        // Default locale already in list
        list = LocaleUtils.localeLookupList(LOCALE_EN_US, LOCALE_EN);
        assertEquals(2, list.size());
        assertEquals(LOCALE_EN_US, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));
    }

    @Test
    public void testLocaleLookupList_languageCountryAndVariant() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN_US_WIN);
        assertEquals(3, list.size());
        assertEquals(LOCALE_EN_US_WIN, list.get(0));
        assertEquals(LOCALE_EN_US, list.get(1));
        assertEquals(LOCALE_EN, list.get(2));

        list = LocaleUtils.localeLookupList(LOCALE_EN_US_WIN, LOCALE_FR);
        assertEquals(4, list.size());
        assertEquals(LOCALE_EN_US_WIN, list.get(0));
        assertEquals(LOCALE_EN_US, list.get(1));
        assertEquals(LOCALE_EN, list.get(2));
        assertEquals(LOCALE_FR, list.get(3));

        // Default locale already in list
        list = LocaleUtils.localeLookupList(LOCALE_EN_US_WIN, LOCALE_EN_US);
        assertEquals(3, list.size());
        assertEquals(LOCALE_EN_US_WIN, list.get(0));
        assertEquals(LOCALE_EN_US, list.get(1));
        assertEquals(LOCALE_EN, list.get(2));
    }

    @Test
    public void testLocaleLookupList_languageAndVariantOnly() {
        Locale locale = new Locale("en", "", "POSIX");
        List list = LocaleUtils.localeLookupList(locale);
        assertEquals(2, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLocaleLookupList_unmodifiable() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN);
        list.add(LOCALE_FR);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testAvailableLocaleList() {
        List list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertFalse(list.isEmpty());
        List list2 = LocaleUtils.availableLocaleList();
        assertSame(list, list2);

        try {
            list.add(LOCALE_QQ);
            fail("availableLocaleList should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testAvailableLocaleSet() {
        Set set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        assertFalse(set.isEmpty());
        Set set2 = LocaleUtils.availableLocaleSet();
        assertSame(set, set2);

        List list = LocaleUtils.availableLocaleList();
        assertEquals(list.size(), set.size());
        for (Iterator it = list.iterator(); it.hasNext();) {
            Locale locale = (Locale) it.next();
            assertTrue(set.contains(locale));
        }

        try {
            set.add(LOCALE_QQ);
            fail("availableLocaleSet should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testIsAvailableLocale() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.ENGLISH));
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
        assertFalse(LocaleUtils.isAvailableLocale(LOCALE_QQ));
        assertFalse(LocaleUtils.isAvailableLocale(LOCALE_QQ_ZZ));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testLanguagesByCountry() {
        assertNotNull(LocaleUtils.languagesByCountry(null));
        assertEquals(0, LocaleUtils.languagesByCountry(null).size());

        List listUS = LocaleUtils.languagesByCountry("US");
        assertNotNull(listUS);
        assertTrue(listUS.contains(new Locale("en", "US")));

        // Cached lookup
        List listUSCached = LocaleUtils.languagesByCountry("US");
        assertSame(listUS, listUSCached);

        for (int i = 0; i < listUS.size(); i++) {
            Locale loc = (Locale) listUS.get(i);
            assertEquals("US", loc.getCountry());
            assertEquals("", loc.getVariant());
        }

        // Unknown country
        List listZZ = LocaleUtils.languagesByCountry("ZZ");
        assertNotNull(listZZ);
        assertEquals(0, listZZ.size());

        // Unmodifiable
        try {
            listUS.add(LOCALE_QQ);
            fail("languagesByCountry list should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCountriesByLanguage() {
        assertNotNull(LocaleUtils.countriesByLanguage(null));
        assertEquals(0, LocaleUtils.countriesByLanguage(null).size());

        List listEN = LocaleUtils.countriesByLanguage("en");
        assertNotNull(listEN);
        assertTrue(listEN.contains(new Locale("en", "US")));
        assertTrue(listEN.contains(new Locale("en", "GB")));

        // Cached lookup
        List listENCached = LocaleUtils.countriesByLanguage("en");
        assertSame(listEN, listENCached);

        for (int i = 0; i < listEN.size(); i++) {
            Locale loc = (Locale) listEN.get(i);
            assertEquals("en", loc.getLanguage());
            assertTrue(loc.getCountry().length() > 0);
            assertEquals("", loc.getVariant());
        }

        // Unknown language
        List listQQ = LocaleUtils.countriesByLanguage("qq");
        assertNotNull(listQQ);
        assertEquals(0, listQQ.size());

        // Unmodifiable
        try {
            listEN.add(LOCALE_QQ);
            fail("countriesByLanguage list should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }
}