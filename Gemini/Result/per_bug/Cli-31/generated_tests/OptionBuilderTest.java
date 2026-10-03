package org.apache.commons.cli;

import junit.framework.TestCase;

/**
 * High-coverage JUnit 4 (compatible with JUnit 3 TestCase runner if needed) test suite 
 * for OptionBuilder targeting branch/condition coverage and edge cases.
 */
public class OptionBuilderTest extends TestCase {

    public OptionBuilderTest(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // Ensure state is clean before each test
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testHasArgBooleanBranch() {
        // Test hasArg(true) -> numberOfArgs = 1
        Option optTrue = OptionBuilder.hasArg(true).create('a');
        assertEquals(1, optTrue.getArgs());

        // Test hasArg(false) -> numberOfArgs = Option.UNINITIALIZED (-1)
        Option optFalse = OptionBuilder.hasArg(false).create('b');
        assertEquals(Option.UNINITIALIZED, optFalse.getArgs());
    }

    public void testIsRequiredBooleanBranch() {
        // Test isRequired(true)
        Option optTrue = OptionBuilder.isRequired(true).create('c');
        assertTrue(optTrue.isRequired());

        // Test isRequired(false)
        Option optFalse = OptionBuilder.isRequired(false).create('d');
        assertFalse(optFalse.isRequired());
    }

    public void testCreateWithNoArgsWhenLongOptIsNull() {
        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException because longopt is not specified");
        } catch (IllegalArgumentException e) {
            // Expected path
            assertNotNull(e.getMessage());
        }
    }

    public void testCreateWithNoArgsWhenLongOptIsSet() {
        Option opt = OptionBuilder.withLongOpt("testlong").create();
        assertEquals("testlong", opt.getLongOpt());
    }

    public void testCreateWithCharOption() {
        Option opt = OptionBuilder.withDescription("desc")
                                  .withArgName("myarg")
                                  .withType(Number.class)
                                  .withValueSeparator(':')
                                  .hasArgs(3)
                                  .isRequired()
                                  .create('e');

        assertEquals("e", opt.getOpt());
        assertEquals("desc", opt.getDescription());
        assertEquals("myarg", opt.getArgName());
        assertEquals(Number.class, opt.getType());
        assertEquals(':', opt.getValueSeparator());
        assertEquals(3, opt.getArgs());
        assertTrue(opt.isRequired());
    }

    public void testOptionalArgsVariants() {
        // hasOptionalArg()
        Option opt1 = OptionBuilder.hasOptionalArg().create('f');
        assertTrue(opt1.hasOptionalArg());
        assertEquals(1, opt1.getArgs());

        // hasOptionalArgs()
        Option opt2 = OptionBuilder.hasOptionalArgs().create('g');
        assertTrue(opt2.hasOptionalArg());
        assertEquals(Option.UNLIMITED_VALUES, opt2.getArgs());

        // hasOptionalArgs(int)
        Option opt3 = OptionBuilder.hasOptionalArgs(5).create('h');
        assertTrue(opt3.hasOptionalArg());
        assertEquals(5, opt3.getArgs());
    }

    public void testValueSeparatorDefault() {
        Option opt = OptionBuilder.withValueSeparator().create('i');
        assertEquals('=', opt.getValueSeparator());
    }

    public void testStateResetAfterCreate() {
        // Create first option with specific states
        Option opt1 = OptionBuilder.withLongOpt("opt1")
                                   .hasArg()
                                   .isRequired()
                                   .withDescription("First")
                                   .create();

        // Create second option without explicit builder calls to verify reset() works properly in finally block
        Option opt2 = OptionBuilder.create('j');

        assertNull(opt2.getLongOpt());
        assertFalse(opt2.isRequired());
        assertEquals(Option.UNINITIALIZED, opt2.getArgs());
        assertNull(opt2.getDescription());
    }

    public void testEdgeCaseNullArguments() {
        // Testing null descriptions, longopts, arg names
        Option opt = OptionBuilder.withLongOpt(null)
                                  .withDescription(null)
                                  .withArgName(null)
                                  .withType(null)
                                  .create("k");

        assertNull(opt.getLongOpt());
        assertNull(opt.getDescription());
        assertEquals("arg", opt.getArgName()); // default argName is "arg" when reset() is called, but here passed null
    }
}