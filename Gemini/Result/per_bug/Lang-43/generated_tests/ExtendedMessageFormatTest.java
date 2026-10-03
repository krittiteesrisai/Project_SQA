package org.apache.commons.lang.text;

import org.junit.Before;
import org.junit.Test;

import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * High-coverage unit tests for ExtendedMessageFormat targeting branch/condition coverage
 * and edge cases in Apache Commons Lang.
 */
public class ExtendedMessageFormatTest {

    private Map<String, FormatFactory> registry;
    private FormatFactory upperCaseFactory;
    private FormatFactory argsFactory;

    @Before
    public void setUp() {
        registry = new HashMap<String, FormatFactory>();

        upperCaseFactory = new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return new Format() {
                    @Override
                    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                        return toAppendTo.append(obj.toString().toUpperCase(locale));
                    }

                    @Override
                    public Object parseObject(String source, ParsePosition pos) {
                        pos.setIndex(source.length());
                        return source;
                    }
                };
            }
        };

        argsFactory = new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                final String prefix = (arguments == null) ? "" : arguments + ":";
                return new Format() {
                    @Override
                    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                        return toAppendTo.append(prefix).append(obj.toString());
                    }

                    @Override
                    public Object parseObject(String source, ParsePosition pos) {
                        pos.setIndex(source.length());
                        return source;
                    }
                };
            }
        };

        registry.put("upper", upperCaseFactory);
        registry.put("withArgs", argsFactory);
    }

    // --- Constructor Tests ---

    @Test
    public void testConstructors() {
        // Constructor 1: pattern only
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf1.toPattern());
        assertEquals(Locale.getDefault(), emf1.getLocale());

        // Constructor 2: pattern and locale
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("Hello {0}", Locale.FRENCH);
        assertEquals("Hello {0}", emf2.toPattern());
        assertEquals(Locale.FRENCH, emf2.getLocale());

        // Constructor 3: pattern and registry
        ExtendedMessageFormat emf3 = new ExtendedMessageFormat("Hello {0,upper}", registry);
        assertEquals("Hello {0,upper}", emf3.toPattern());
        assertEquals(Locale.getDefault(), emf3.getLocale());

        // Constructor 4: pattern, locale, and registry
        ExtendedMessageFormat emf4 = new ExtendedMessageFormat("Hello {0,upper}", Locale.GERMAN, registry);
        assertEquals("Hello {0,upper}", emf4.toPattern());
        assertEquals(Locale.GERMAN, emf4.getLocale());
    }

    // --- Unsupported Operations Tests ---

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatUnsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", registry);
        emf.setFormat(0, NumberFormat.getInstance());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndexUnsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", registry);
        emf.setFormatByArgumentIndex(0, NumberFormat.getInstance());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsUnsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", registry);
        emf.setFormats(new Format[]{NumberFormat.getInstance()});
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndexUnsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", registry);
        emf.setFormatsByArgumentIndex(new Format[]{NumberFormat.getInstance()});
    }

    // --- Registry and Formatting Branches ---

    @Test
    public void testFormattingWithNullRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0,number,integer}", (Map) null);
        String result = emf.format(new Object[]{123});
        assertEquals("Value: 123", result);
        assertEquals("Value: {0,number,integer}", emf.toPattern());
    }

    @Test
    public void testFormattingWithEmptyRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0,number,integer}", Collections.emptyMap());
        String result = emf.format(new Object[]{123});
        assertEquals("Value: 123", result);
    }

    @Test
    public void testCustomFormatWithoutArgs() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Name: {0,upper}", registry);
        String result = emf.format(new Object[]{"john"});
        assertEquals("Name: JOHN", result);
        assertEquals("Name: {0,upper}", emf.toPattern());
    }

    @Test
    public void testCustomFormatWithArgs() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Item: {0,withArgs,PRE}", registry);
        String result = emf.format(new Object[]{"123"});
        assertEquals("Item: PRE:123", result);
        assertEquals("Item: {0,withArgs,PRE}", emf.toPattern());
    }

    @Test
    public void testCustomFormatWithMultipleArgsSeparatedByComma() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Item: {0,withArgs,A,B,C}", registry);
        String result = emf.format(new Object[]{"X"});
        assertEquals("Item: A,B,C:X", result);
        assertEquals("Item: {0,withArgs,A,B,C}", emf.toPattern());
    }

    @Test
    public void testStandardFormatInRegistryMode() {
        // Fallback when format name is not in the custom registry
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Price: {0,number,currency}", registry);
        String result = emf.format(new Object[]{10});
        assertTrue(result.contains("10"));
        assertEquals("Price: {0,number,currency}", emf.toPattern());
    }

    @Test
    public void testFormatReturningNullFactory() {
        // Registry returns null for factory
        Map<String, FormatFactory> nullFactoryMap = new HashMap<String, FormatFactory>();
        nullFactoryMap.put("dummy", new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0,dummy}", nullFactoryMap);
        assertEquals("Test {0,dummy}", emf.toPattern());
    }

    @Test
    public void testMixedFormatsCustomAndStandardAndNone() {
        String pattern = "{0} - {1,upper} - {2,number,#.00}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        String result = emf.format(new Object[]{"start", "middle", 42});
        assertEquals("start - MIDDLE - 42.00", result);
    }

    @Test
    public void testWhitespaceHandlingInFormatElements() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Result: {  0  ,  upper  } and { 1 }", registry);
        String result = emf.format(new Object[]{"abc", "def"});
        assertEquals("Result: ABC and def", result);
    }

    @Test
    public void testNestedElementsInFormatDescription() {
        // Choice format containing sub-elements
        String pattern = "{0,choice,0#zero|1#{1,upper}|2#many}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        String result = emf.format(new Object[]{1, "one"});
        assertEquals("ONE", result);
    }

    @Test
    public void testQuotesInPatternDescription() {
        // Quoted string inside format description
        String pattern = "{0,withArgs,'quoted,arg'}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        String result = emf.format(new Object[]{"val"});
        assertEquals("'quoted,arg':val", result);
    }

    // --- Boundary and Exception Handling Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFormatElementNonDigitIndex() {
        new ExtendedMessageFormat("Value: {abc}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFormatElementWhitespaceFollowedByChar() {
        new ExtendedMessageFormat("Value: {0 abc}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnterminatedFormatElement() {
        new ExtendedMessageFormat("Value: {0", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnterminatedFormatElementWhitespaceOnly() {
        new ExtendedMessageFormat("Value: {  ", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnterminatedFormatDescription() {
        new ExtendedMessageFormat("Value: {0,upper", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnclosedNestedFormatElement() {
        new ExtendedMessageFormat("Value: {0,choice,0#{1}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnterminatedQuoteInDescription() {
        new ExtendedMessageFormat("Value: {0,withArgs,'unterminated}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnreadableFormatElementInvalidClosure() {
        new ExtendedMessageFormat("Value: {0 bad}", registry);
    }

    @Test
    public void testPatternWithNoElements() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Plain string without formats", registry);
        assertEquals("Plain string without formats", emf.format(new Object[]{}));
        assertEquals("Plain string without formats", emf.toPattern());
    }

    @Test
    public void testApplyPatternWithPlainPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Initial {0}", registry);
        emf.applyPattern("New pattern {0,upper}");
        assertEquals("NEW", emf.format(new Object[]{"new"}));
        assertEquals("New pattern {0,upper}", emf.toPattern());
    }
}