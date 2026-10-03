package org.jfree.chart.imagemap;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for StandardToolTipTagFragmentGenerator.
 * Designed for JUnit 4 without external mocking libraries (no Mockito).
 */
public class StandardToolTipTagFragmentGeneratorTest {

    private StandardToolTipTagFragmentGenerator generator;

    @Before
    public void setUp() {
        generator = new StandardToolTipTagFragmentGenerator();
    }

    @Test
    public void testGenerateToolTipFragment_Normal() {
        String toolTip = "Series 1";
        String expected = " title=\"Series 1\" alt=\"\"";
        String actual = generator.generateToolTipFragment(toolTip);
        assertEquals(expected, actual);
    }

    @Test
    public void testGenerateToolTipFragment_Null() {
        // Defects4J often tests how null inputs are handled
        String actual = generator.generateToolTipFragment(null);
        assertEquals(" title=\"null\" alt=\"\"", actual);
    }

    @Test
    public void testGenerateToolTipFragment_EmptyString() {
        String actual = generator.generateToolTipFragment("");
        assertEquals(" title=\"\" alt=\"\"", actual);
    }

    @Test
    public void testGenerateToolTipFragment_SpecialCharacters() {
        // Testing behavior with quotes or special HTML characters
        String toolTip = "Tooltip \"with\" quotes";
        String actual = generator.generateToolTipFragment(toolTip);
        assertNotNull(actual);
        assertTrue(actual.startsWith(" title=\""));
        assertTrue(actual.endsWith("\" alt=\"\""));
    }
}