package com.google.javascript.jscomp;

import com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt;
import org.junit.Test;
import static org.junit.Assert.*;

public class LightweightMessageFormatterTest {

    // --- Mock Implementations for Testing Without External Mocking Libraries ---

    private static class DummySourceExcerptProvider implements SourceExcerptProvider {
        private final String sourceCode;

        public DummySourceExcerptProvider(String sourceCode) {
            this.sourceCode = sourceCode;
        }

        @Override
        public StringgetSource(String sourceName, int lineNumber) {
            return sourceCode;
        }

        @Override
        public Region region(String sourceName, int lineNumber) {
            if (sourceCode == null) {
                return null;
            }
            return new LightweightMessageFormatter.LineNumberingFormatter() {
                // Implementing Region interface inline
            }.new SimpleRegion(lineNumber, lineNumber, sourceCode);
        }
    }

    // Helper to instantiate SimpleRegion since it's package-private or inner
    // Using standard CodeBuilder/Region approach via anonymous class if needed, 
    // or leveraging SimpleRegion if accessible. Let's use SimpleRegion directly:
    @Test
    public void testLineNumberingFormatterNullRegion() {
        LightweightMessageFormatter.LineNumberingFormatter formatter = 
            new LightweightMessageFormatter.LineNumberingFormatter();
        assertNull(formatter.formatRegion(null));
    }

    @Test
    public void testLineNumberingFormatterEmptyCode() {
        LightweightMessageFormatter.LineNumberingFormatter formatter = 
            new LightweightMessageFormatter.LineNumberingFormatter();
        Region emptyRegion = new SimpleRegion(1, 1, "");
        assertNull(formatter.formatRegion(emptyRegion));
    }

    @Test
    public void testLineNumberingFormatterSingleLine() {
        LightweightMessageFormatter.LineNumberingFormatter formatter = 
            new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new SimpleRegion(5, 5, "var x = 10;");
        String result = formatter.formatRegion(region);
        assertEquals("  5| var x = 10;", result);
    }

    @Test
    public void testLineNumberingFormatterMultiLine() {
        LightweightMessageFormatter.LineNumberingFormatter formatter = 
            new LightweightMessageFormatter.LineNumberingFormatter();
        Region region = new SimpleRegion(10, 12, "if (true) {\n  doSomething();\n}");
        String result = formatter.formatRegion(region);
        assertNotNull(result);
        assertTrue(result.contains("10| if (true) {"));
        assertTrue(result.contains("11|   doSomething();"));
        assertTrue(result.contains("12| }"));
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullSourceCheck() {
        new LightweightMessageFormatter(null);
    }

    @Test
    public void testFormatWithoutSourceError() {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        JSError error = JSError.make("test.js", 10, 5, CheckLevel.ERROR, DiagnosticType.warning("TEST_WARNING", "Test description"));
        
        String result = formatter.formatError(error);
        assertEquals("test.js:10: ERROR - Test description\n", result);
    }

    @Test
    public void testFormatWithoutSourceWarningNoLine() {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        JSError error = JSError.make("test.js", 0, 0, CheckLevel.WARNING, DiagnosticType.warning("TEST_WARNING", "Test description"));
        
        String result = formatter.formatWarning(error);
        assertEquals("test.js: WARNING - Test description\n", result);
    }

    @Test
    public void testFormatWithoutSourceNoFilename() {
        LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
        JSError error = JSError.make((String) null, 0, 0, CheckLevel.ERROR, DiagnosticType.warning("TEST_WARNING", "Test description"));
        
        String result = formatter.formatError(error);
        assertEquals("ERROR - Test description\n", result);
    }

    @Test
    public void testFormatWithSourceAndWhitespacePadding() {
        SourceExcerptProvider provider = new DummySourceExcerptProvider("  let foo = bar;");
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider, SourceExcerpt.LINE);
        
        JSError error = JSError.make("script.js", 1, 6, CheckLevel.ERROR, DiagnosticType.warning("TEST", "Error message"));
        String result = formatter.formatError(error);
        
        assertTrue(result.contains("script.js:1: ERROR - Error message"));
        assertTrue(result.contains("  let foo = bar;"));
        assertTrue(result.contains("      ^\n")); // check whitespace preservation and caret positioning
    }

    @Test
    public void testFormatWithSourceTabAndWhitespace() {
        SourceExcerptProvider provider = new DummySourceExcerptProvider("\tcontent");
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider, SourceExcerpt.LINE);
        
        JSError error = JSError.make("script.js", 1, 1, CheckLevel.ERROR, DiagnosticType.warning("TEST", "Error message"));
        String result = formatter.formatError(error);
        
        assertTrue(result.contains("\t^")); // Tab should be preserved as whitespace
    }

    @Test
    public void testFormatWithSourceCharnoOutOfBounds() {
        SourceExcerptProvider provider = new DummySourceExcerptProvider("short");
        LightweightMessageFormatter formatter = new LightweightMessageFormatter(provider, SourceExcerpt.LINE);
        
        // charno >= sourceExcerpt.length() -> should not append caret line
        JSError error = JSError.make("script.js", 1, 10, CheckLevel.ERROR, DiagnosticType.warning("TEST", "Error message"));
        String result = formatter.formatError(error);
        
        assertFalse(result.contains("^"));
    }
}