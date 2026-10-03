package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * Comprehensive test suite for {@link ExtendedMessageFormat}.
 */
public class ExtendedMessageFormatTest {

    private Map<String, FormatFactory> registry;
    private final FormatFactory upperCaseFactory = new FormatFactory() {
        @Override
        public Format getFormat(String name, String args, Locale locale) {
            return new Format() {
                private static final long serialVersionUID = 1L;

                @Override
                public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                    if (obj == null) {
                        return toAppendTo;
                    }
                    String str = obj.toString().toUpperCase(locale != null ? locale : Locale.getDefault());
                    if (args != null && !args.isEmpty()) {
                        str = "[" + args + "]:" + str;
                    }
                    return toAppendTo.append(str);
                }

                @Override
                public Object parseObject(String source, ParsePosition pos) {
                    pos.setIndex(source.length());
                    return source;
                }
            };
        }
    };

    private final FormatFactory lowerCaseFactory = new FormatFactory() {
        @Override
        public Format getFormat(String name, String args, Locale locale) {
            return new Format() {
                private static final long serialVersionUID = 1L;

                @Override
                public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                    if (obj == null) {
                        return toAppendTo;
                    }
                    String str = obj.toString().toLowerCase(locale != null ? locale : Locale.getDefault());
                    return toAppendTo.append(str);
                }

                @Override
                public Object parseObject(String source, ParsePosition pos) {
                    pos.setIndex(source.length());
                    return source;
                }
            };
        }
    };

    @Before
    public void setUp() {
        registry = new HashMap<String, FormatFactory>();
        registry.put("upper", upperCaseFactory);
        registry.put("lower", lowerCaseFactory);
    }

    // ==========================================
    // 1. Constructor Tests
    // ==========================================

    @Test
    public void testConstructor_PatternOnly() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
        assertEquals("Hello World", emf.format(new Object[]{"World"}));
    }

    @Test
    public void testConstructor_PatternAndLocale() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,number,currency}", Locale.US);
        assertEquals(Locale.US, emf.getLocale());
        assertEquals("Hello {0,number,currency}", emf.toPattern());
    }

    @Test
    public void testConstructor_PatternAndRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,upper}", registry);
        assertEquals("Hello {0,upper}", emf.toPattern());
        assertEquals("Hello WORLD", emf.format(new Object[]{"World"}));
    }

    @Test
    public void testConstructor_PatternLocaleRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,upper,prefix}", Locale.GERMANY, registry);
        assertEquals(Locale.GERMANY, emf.getLocale());
        assertEquals("Hello {0,upper,prefix}", emf.toPattern());
        assertEquals("Hello [prefix]:WORLD", emf.format(new Object[]{"World"}));
    }

    // ==========================================
    // 2. applyPattern & Parsing Branches
    // ==========================================

    @Test
    public void testApplyPattern_NullRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Default {0}", (Map<String, ? extends FormatFactory>) null);
        assertEquals("Default {0}", emf.toPattern());
        assertEquals("Default Test", emf.format(new Object[]{"Test"}));
    }

    @Test
    public void testApplyPattern_EmptyPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("", registry);
        assertEquals("", emf.toPattern());
    }

    @Test
    public void testApplyPattern_PatternWithoutElements() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Just plain text", registry);
        assertEquals("Just plain text", emf.toPattern());
    }

    @Test
    public void testApplyPattern_WhitespaceInArgumentIndex() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {   0   ,  upper  }", registry);
        assertEquals("Value: {0,upper}", emf.toPattern());
        assertEquals("Value: JAVA", emf.format(new Object[]{"java"}));
    }

    @Test
    public void testApplyPattern_WhitespaceInArgumentIndexNoFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {   0   }", registry);
        assertEquals("Value: {0}", emf.toPattern());
        assertEquals("Value: 123", emf.format(new Object[]{"123"}));
    }

    @Test
    public void testApplyPattern_MultiDigitArgumentIndex() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{10,upper}", registry);
        Object[] args = new Object[11];
        args[10] = "eleventh";
        assertEquals("ELEVENTH", emf.format(args));
    }

    @Test
    public void testApplyPattern_BuiltInFormatFallback() {
        // Fallback when format name is not in registry
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Number: {0,number,#.##}", registry);
        assertEquals("Number: 12.35", emf.format(new Object[]{12.3456}));
    }

    @Test
    public void testApplyPattern_MixedCustomAndBuiltInFormats() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Text: {0,upper}, Number: {1,number,integer}", registry);
        assertEquals("Text: FOO, Number: 42", emf.format(new Object[]{"foo", 42}));
    }

    @Test
    public void testApplyPattern_MultipleCustomFormats() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper} and {1,lower}", registry);
        assertEquals("HELLO and world", emf.format(new Object[]{"Hello", "WORLD"}));
    }

    // ==========================================
    // 3. Quotes & Escaping Handling
    // ==========================================

    @Test
    public void testApplyPattern_QuotedLiteral() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{0}' is not a format, but {0,upper} is", registry);
        assertEquals("'{0}' is not a format, but FOO is", emf.format(new Object[]{"foo"}));
    }

    @Test
    public void testApplyPattern_EscapedQuote() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("It''s a {0,upper} day", registry);
        assertEquals("It's a GOOD day", emf.format(new Object[]{"good"}));
    }

    @Test
    public void testApplyPattern_QuotedFormatDescription() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper,'sub, pattern with {brace}'}", registry);
        assertEquals("[sub, pattern with {brace}]:TEST", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_SingleQuoteAtStart() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'Start quote {0,upper}", registry);
        assertEquals("'Start quote BAR", emf.format(new Object[]{"bar"}));
    }

    // ==========================================
    // 4. Nested Elements (e.g. ChoiceFormat)
    // ==========================================

    @Test
    public void testApplyPattern_NestedFormatElements() {
        String pattern = "{0,choice,0#zero|1#{1,upper}|2#{1,lower}}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
        assertEquals("zero", emf.format(new Object[]{0, "Alpha"}));
        assertEquals("ALPHA", emf.format(new Object[]{1, "Alpha"}));
        assertEquals("alpha", emf.format(new Object[]{2, "Alpha"}));
    }

    // ==========================================
    // 5. Exception & Invalid Pattern Scenarios
    // ==========================================

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_InvalidIndex_NonDigit() {
        new ExtendedMessageFormat("Hello {abc}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_InvalidIndex_SpaceBetweenDigits() {
        new ExtendedMessageFormat("Hello {1 2}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_UnterminatedElement_NoClosingBrace() {
        new ExtendedMessageFormat("Hello {0", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_UnterminatedElement_NoClosingBraceWithComma() {
        new ExtendedMessageFormat("Hello {0,", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_UnterminatedFormatDescription() {
        new ExtendedMessageFormat("Hello {0,upper", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_UnreadableFormatElement() {
        // An unexpected character where '}' is expected
        new ExtendedMessageFormat("Hello {0,upper,arg invalid}", registry) {
            // Note: If parseFormatDescription consumes up to '}', it throws unreadable if not matching END_FE
        };
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_UnterminatedQuotedString() {
        new ExtendedMessageFormat("Unclosed 'quote inside {0,upper", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_UnterminatedQuoteInDescription() {
        new ExtendedMessageFormat("{0,upper,'unclosed subpattern}", registry);
    }

    // ==========================================
    // 6. Disabled Mutators (UnsupportedOperationException)
    // ==========================================

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormat_ThrowsException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        emf.setFormat(0, NumberFormat.getInstance());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndex_ThrowsException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        emf.setFormatByArgumentIndex(0, NumberFormat.getInstance());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormats_ThrowsException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        emf.setFormats(new Format[]{NumberFormat.getInstance()});
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndex_ThrowsException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        emf.setFormatsByArgumentIndex(new Format[]{NumberFormat.getInstance()});
    }

    // ==========================================
    // 7. Edge Cases & Special Arguments
    // ==========================================

    @Test
    public void testCustomFormatWithEmptyArgs() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper,}", registry);
        assertEquals("FOO", emf.format(new Object[]{"foo"}));
    }

    @Test
    public void testCustomFormatReturningNull() {
        Map<String, FormatFactory> nullFactoryMap = new HashMap<String, FormatFactory>();
        nullFactoryMap.put("nullFormat", new FormatFactory() {
            @Override
            public Format getFormat(String name, String args, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,nullFormat}", nullFactoryMap);
        // Falls back to pattern string
        assertNotNull(emf);
    }

    @Test
    public void testEmptyRegistryMap() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", Collections.<String, FormatFactory>emptyMap());
        assertEquals("Test", emf.format(new Object[]{"Test"}));
    }
}