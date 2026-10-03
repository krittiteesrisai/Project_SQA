package org.apache.commons.cli;

import junit.framework.TestCase;

/**
 * OptionBuilderTest aims to achieve high branch and condition coverage 
 * for org.apache.commons.cli.OptionBuilder (Defects4J Cli-26b).
 */
public class OptionBuilderTest extends TestCase {

    public OptionBuilderTest(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // Ensure clean state before each test if reset wasn't properly called
    }

    @Override
    protected void tearDown() throws Exception {
        // Clean state after each test
        try {
            OptionBuilder.create();
        } catch (Exception e) {
            // Expected if longopt is not set
        }
        super.tearDown();
    }

    public void testCompleteOptionCreationWithChar() {
        Option option = OptionBuilder.withLongOpt("long-option")
                .withDescription("description")
                .hasArg()
                .withArgName("argName")
                .isRequired(true)
                .withValueSeparator(':')
                .withType(String.class)
                .create('a');

        assertEquals("a", option.getOpt());
        assertEquals("long-option", option.getLongOpt());
        assertEquals("description", option.getDescription());
        assertEquals(1, option.getArgs());
        assertEquals("argName", option.getArgName());
        assertTrue(option.isRequired());
        assertEquals(':', option.getValueSeparator());
        assertEquals(String.class, option.getType());
    }

    public void testCompleteOptionCreationWithString() {
        Option option = OptionBuilder.withLongOpt("long-option-str")
                .withDescription("desc-str")
                .hasArgs(5)
                .isRequired(false)
                .withValueSeparator()
                .create("optStr");

        assertEquals("optStr", option.getOpt());
        assertEquals("long-option-str", option.getLongOpt());
        assertEquals("desc-str", option.getDescription());
        assertEquals(5, option.getArgs());
        assertFalse(option.isRequired());
        assertEquals('=', option.getValueSeparator());
    }

    public void testCreateWithoutLongOptThrowsException() {
        try {
            OptionBuilder.withDescription("no long opt").create();
            fail("Expected IllegalArgumentException because longopt was not specified");
        } catch (IllegalArgumentException e) {
            // Expected branch when longopt == null
            assertNotNull(e.getMessage());
        }
    }

    public void testCreateWithLongOptSuccess() {
        Option option = OptionBuilder.withLongOpt("valid-longopt").create();
        assertEquals("valid-longopt", option.getLongOpt());
        assertNull(option.getOpt());
    }

    public void testHasArgBooleanTrue() {
        Option option = OptionBuilder.hasArg(true).withLongOpt("arg-true").create();
        assertEquals(1, option.getArgs());
    }

    public void testHasArgBooleanFalse() {
        Option option = OptionBuilder.hasArg(false).withLongOpt("arg-false").create();
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    public void testHasArgsUnlimited() {
        Option option = OptionBuilder.hasArgs().withLongOpt("unlimited").create();
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    public void testHasOptionalArg() {
        Option option = OptionBuilder.hasOptionalArg().withLongOpt("opt-arg").create();
        assertEquals(1, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    public void testHasOptionalArgsUnlimited() {
        Option option = OptionBuilder.hasOptionalArgs().withLongOpt("opt-unlimited").create();
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    public void testHasOptionalArgsWithCount() {
        Option option = OptionBuilder.hasOptionalArgs(3).withLongOpt("opt-count").create();
        assertEquals(3, option.getArgs());
        assertTrue(option.hasOptionalArg());
    }

    public void testIsRequiredWithoutParam() {
        Option option = OptionBuilder.isRequired().withLongOpt("required").create();
        assertTrue(option.isRequired());
    }
}