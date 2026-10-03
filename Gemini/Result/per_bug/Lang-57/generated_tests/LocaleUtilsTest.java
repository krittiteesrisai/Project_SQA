package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for {@link LocaleUtils}.
 */
public class LocaleUtilsTest {

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_US_WIN = new Locale("en", "US", "WIN");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_QQ = new Locale("qq", "");
    private static final Locale LOCALE_QQ_ZZ = new Locale("qq", "ZZ");

    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {
        assertNotNull(new LocaleUtils());
        assertTrue(Modifier.isPublic(LocaleUtils.class.getConstructors()[0].getModifiers()));
    }

    // -----------------------------------------------------------------------
    @Test
    public void testToLocale_Valid() {
        assertNull(LocaleUtils.toLocale((String) null));

        assertEquals(new Locale("us", ""), LocaleUtils.toLocale("us"));
        assertEquals(new Locale("fr", ""), LocaleUtils.toLocale("fr"));
        assertEquals(new Locale("de", ""), LocaleUtils.toLocale("de"));
        assertEquals(new Locale("zh", ""), LocaleUtils.toLocale("zh"));

        assertEquals(new Locale("us", "US"), LocaleUtils.toLocale("us_US"));
        assertEquals(new Locale("fr", "FR"), LocaleUtils.toLocale("fr_FR"));
        assertEquals(new Locale("de", "DE"), LocaleUtils.toLocale("de_DE"));
        assertEquals(new Locale("zh", "TW"), LocaleUtils.toLocale("zh_TW"));

        assertEquals(new Locale("us", "US", "POSIX"), LocaleUtils.toLocale("us_US_POSIX"));
        assertEquals(new Locale("us", "US", "WIN"), LocaleUtils.toLocale("us_US_WIN"));
        assertEquals(new Locale("fr", "CA", "xxx"), LocaleUtils.toLocale("fr_CA_xxx"));
        assertEquals(new Locale("fr", "CA", "POSIX_SPECIAL"), LocaleUtils.toLocale("fr_CA_POSIX_SPECIAL"));
    }

    @Test
    public void testToLocale_InvalidLength() {
        assertInvalidToLocale("");
        assertInvalidToLocale("a");
        assertInvalidToLocale("aaa");
        assertInvalidToLocale("aaaa");
        assertInvalidToLocale("aaaaaa");
    }

    @Test
    public void testToLocale_InvalidLanguage() {
        assertInvalidToLocale("US");
        assertInvalidToLocale("uS");
        assertInvalidToLocale("Us");
        assertInvalidToLocale("1a");
        assertInvalidToLocale("a1");
        assertInvalidToLocale("`a");
        assertInvalidToLocale("{a");
        assertInvalidToLocale("a`");
        assertInvalidToLocale("a{");
    }

    @Test
    public void testToLocale_InvalidCountryFormat() {
        assertInvalidToLocale("us-US");
        assertInvalidToLocale("us_us");
        assertInvalidToLocale("us_Us");
        assertInvalidToLocale("us_uS");
        assertInvalidToLocale("us_1S");
        assertInvalidToLocale("us_U1");
        assertInvalidToLocale("us_@S");
        assertInvalidToLocale("us_[S");
        assertInvalidToLocale("us_S@");
        assertInvalidToLocale("us_S[");
    }

    @Test
    public void testToLocale_InvalidVariantFormat() {
        assertInvalidToLocale("us_US-POSIX");
        assertInvalidToLocale("us_US+POSIX");
        assertInvalidToLocale("us_US POSIX");
    }

    private void assertInvalidToLocale(String str) {
        try {
            LocaleUtils.toLocale(str);
            fail("Expected IllegalArgumentException for: " + str);
        } catch (IllegalArgumentException ex) {
            // Success
        }
    }

    // -----------------------------------------------------------------------
    @Test
    public void testLocaleLookupList_Locale() {
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(null), new Locale[0]);
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_QQ), new Locale[] { LOCALE_QQ });
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN), new Locale[] { LOCALE_EN });
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN_US), new Locale[] { LOCALE_EN_US, LOCALE_EN });
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN_US_WIN),
                new Locale[] { LOCALE_EN_US_WIN, LOCALE_EN_US, LOCALE_EN });
    }

    @Test
    public void testLocaleLookupList_Locale_Locale() {
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(null, null), new Locale[0]);
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(null, LOCALE_EN), new Locale[0]);

        // Default locale matches language
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN, LOCALE_EN), new Locale[] { LOCALE_EN });

        // Default locale is different
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_QQ, LOCALE_EN),
                new Locale[] { LOCALE_QQ, LOCALE_EN });

        // Default locale matches sub-locale
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN_US, LOCALE_EN),
                new Locale[] { LOCALE_EN_US, LOCALE_EN });

        // Default locale is independent
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN_US, LOCALE_FR),
                new Locale[] { LOCALE_EN_US, LOCALE_EN, LOCALE_FR });

        // 3-tier Locale with matching intermediate default
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN_US_WIN, LOCALE_EN_US),
                new Locale[] { LOCALE_EN_US_WIN, LOCALE_EN_US, LOCALE_EN });

        // 3-tier Locale with matching root default
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN_US_WIN, LOCALE_EN),
                new Locale[] { LOCALE_EN_US_WIN, LOCALE_EN_US, LOCALE_EN });

        // 3-tier Locale with independent default
        assertValidLocaleLookupList(LocaleUtils.localeLookupList(LOCALE_EN_US_WIN, LOCALE_FR_CA),
                new Locale[] { LOCALE_EN_US_WIN, LOCALE_EN_US, LOCALE_EN, LOCALE_FR_CA });
    }

    private void assertValidLocaleLookupList(List list, Locale[] expected) {
        assertEquals("List size does not match", expected.length, list.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals("Locale at index " + i + " mismatch", expected[i], list.get(i));
        }
        try {
            list.add(Locale.US);
            fail("Expected UnsupportedOperationException on modifying unmodifiable list");
        } catch (UnsupportedOperationException ex) {
            // Success
        }
    }

    // -----------------------------------------------------------------------
    @Test
    public void testAvailableLocaleList() {
        List list = LocaleUtils.availableLocaleList();
        List list2 = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertEquals(list, list2);
        assertTrue(list.size() > 0);

        List jdkList = Arrays.asList(Locale.getAvailableLocales());
        assertEquals(jdkList.size(), list.size());
        assertTrue(list.containsAll(jdkList));

        try {
            list.add(LOCALE_QQ);
            fail("Expected UnsupportedOperationException on modifying availableLocaleList");
        } catch (UnsupportedOperationException ex) {
            // Success
        }
    }

    @Test
    public void testAvailableLocaleSet() {
        Set set = LocaleUtils.availableLocaleSet();
        Set set2 = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        assertEquals(set, set2);
        assertTrue(set.size() > 0);

        List jdkList = Arrays.asList(Locale.getAvailableLocales());
        assertEquals(new HashSet(jdkList).size(), set.size());
        assertTrue(set.containsAll(jdkList));

        try {
            set.add(LOCALE_QQ);
            fail("Expected UnsupportedOperationException on modifying availableLocaleSet");
        } catch (UnsupportedOperationException ex) {
            // Success
        }
    }

    @Test
    public void testIsAvailableLocale() {
        // Specifically tests calling isAvailableLocale (triggers Defects4J Lang-57 bug if set is uninitialized)
        Set set = LocaleUtils.availableLocaleSet();
        for (Iterator it = set.iterator(); it.hasNext();) {
            Locale locale = (Locale) it.next();
            assertTrue(LocaleUtils.isAvailableLocale(locale));
        }
        assertFalse(LocaleUtils.isAvailableLocale(LOCALE_QQ));
        assertFalse(LocaleUtils.isAvailableLocale(LOCALE_QQ_ZZ));
    }

    // -----------------------------------------------------------------------
    @Test
    public void testLanguagesByCountry() {
        assertNotNull(LocaleUtils.languagesByCountry(null));
        assertEquals(0, LocaleUtils.languagesByCountry(null).size());

        assertNotNull(LocaleUtils.languagesByCountry("ZZ"));
        assertEquals(0, LocaleUtils.languagesByCountry("ZZ").size());

        // Test caching logic by calling twice
        List listUS1 = LocaleUtils.languagesByCountry("US");
        List listUS2 = LocaleUtils.languagesByCountry("US");
        assertNotNull(listUS1);
        assertEquals(listUS1, listUS2);
        assertTrue(listUS1.size() > 0);

        for (int i = 0; i < listUS1.size(); i++) {
            Locale locale = (Locale) listUS1.get(i);
            assertEquals("US", locale.getCountry());
            assertEquals(0, locale.getVariant().length());
        }

        try {
            listUS1.add(Locale.US);
            fail("Expected UnsupportedOperationException on modifying languagesByCountry list");
        } catch (UnsupportedOperationException ex) {
            // Success
        }
    }

    // -----------------------------------------------------------------------
    @Test
    public void testCountriesByLanguage() {
        assertNotNull(LocaleUtils.countriesByLanguage(null));
        assertEquals(0, LocaleUtils.countriesByLanguage(null).size());

        assertNotNull(LocaleUtils.countriesByLanguage("qq"));
        assertEquals(0, LocaleUtils.countriesByLanguage("qq").size());

        // Test caching logic by calling twice
        List listEn1 = LocaleUtils.countriesByLanguage("en");
        List listEn2 = LocaleUtils.countriesByLanguage("en");
        assertNotNull(listEn1);
        assertEquals(listEn1, listEn2);
        assertTrue(listEn1.size() > 0);

        for (int i = 0; i < listEn1.size(); i++) {
            Locale locale = (Locale) listEn1.get(i);
            assertEquals("en", locale.getLanguage());
            assertTrue(locale.getCountry().length() > 0);
            assertEquals(0, locale.getVariant().length());
        }

        try {
            listEn1.add(Locale.US);
            fail("Expected UnsupportedOperationException on modifying countriesByLanguage list");
        } catch (UnsupportedOperationException ex) {
            // Success
        }
    }
}