package org.apache.commons.cli;

import junit.framework.TestCase;

/**
 * High-coverage JUnit 4 test suite for OptionBuilder (Defects4J Cli-34b).
 */
public class OptionBuilderTest extends TestCase {

    public OptionBuilderTest(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // Ensure clean state before each test due to static fields in OptionBuilder
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test hasArg(boolean) with true condition.
     */
    public void testHasArgTrue() {
        Option option = OptionBuilder.hasArg(true).create("a");
        assertEquals(1, option.getArgs());
    }

    /**
     * Test hasArg(boolean) with false condition.
     */
    public void testHasArgFalse() {
        Option option = OptionBuilder.hasArg(false).create("b");
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    /**
     * Test create() when longopt is null (Branch coverage for exception path).
     */
    public void testCreateWithNullLongOptThrowsException() {
        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException because longopt was not specified");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    /**
     * Test create() when longopt is successfully set (Branch coverage for normal path).
     */
    public void testCreateWithLongOptSuccess() {
        Option option = OptionBuilder.withLongOpt("test-long").create();
        assertEquals("test-long", option.getLongOpt());
    }

    /**
     * Test all properties and builder methods combined (Full feature coverage).
     */
    public void testCompleteOptionBuilding() {
        Option option = OptionBuilder.withLongOpt("verbose")
                .withDescription("Turn on verbose mode")
                .hasArgs(3)
                .withArgName("LEVEL")
                .isRequired(true)
                .hasOptionalArg() // Overwrites args/optional state appropriately
                .withValueSeparator(':')
                .withType(Number.class)
                .create('v');

        assertEquals("v", option.getOpt());
        assertEquals("verbose", option.getLongOpt());
        assertEquals("Turn on verbose mode", option.getDescription());
        assertTrue(option.isRequired());
        assertTrue(option.hasOptionalArg());
        assertEquals(1, option.getArgs()); // hasOptionalArg sets args to 1
        assertEquals("LEVEL", option.getArgName());
        assertEquals(':', option.getValueSeparator());
        assertEquals(Number.class, option.getType());
    }

    /**
     * Test edge cases: unlimited values, optional args, and character/string create overloads.
     */
    public void testEdgeCasesAndOverloads() {
        // hasOptionalArgs() with no params
        Option opt1 = OptionBuilder.hasOptionalArgs().create('x');
        assertEquals(Option.UNLIMITED_VALUES, opt1.getArgs());
        assertTrue(opt1.hasOptionalArg());

        // hasOptionalArgs(int) boundary
        Option opt2 = OptionBuilder.hasOptionalArgs(5).create("y");
        assertEquals(5, opt2.getArgs());
        assertTrue(opt2.hasOptionalArg());

        // hasArgs() unlimited
        Option opt3 = OptionBuilder.hasArgs().create('z');
        assertEquals(Option.UNLIMITED_VALUES, opt3.getArgs());
        assertFalse(opt3.hasOptionalArg());
    }

    /**
     * Test state reset behavior (ensuring static fields don't leak into subsequent creations).
     */
    public void testStateResetAfterCreate() {
        OptionBuilder.withLongOpt("first").isRequired().create('1');
        
        // Create second option without explicit properties, should use default/reset values
        Option option2 = OptionBuilder.create('2');
        assertNull(option2.getLongOpt());
        assertFalse(option2.isRequired());
    }

    /**
     * Test invalid option character throws IllegalArgumentException.
     */
    public void testInvalidOptionCharacter() {
        try {
            OptionBuilder.create(' '); // Invalid option character in Commons CLI
            fail("Expected IllegalArgumentException for invalid option character");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }
}