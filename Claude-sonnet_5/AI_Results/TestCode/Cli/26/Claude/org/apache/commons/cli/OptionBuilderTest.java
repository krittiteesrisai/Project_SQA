package org.apache.commons.cli;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.cli.OptionBuilder (Cli-26b)
 *
 * NOTE: Option class source is not provided in the prompt.
 * Getter method names (getOpt(), getLongOpt(), getArgs(), etc.)
 * and constants (Option.UNINITIALIZED, Option.UNLIMITED_VALUES)
 * are assumed to exist as standard public API of Apache Commons-CLI's
 * Option class (referenced directly inside OptionBuilder source itself).
 */
public class OptionBuilderTest
{
    // ---------------------------------------------------------
    // create() branch: longopt == null -> throw + reset
    // ---------------------------------------------------------
    @Test
    public void testCreateWithoutLongOptThrowsException()
    {
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException when longopt is not set");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    public void testResetAfterExceptionDoesNotLeakState()
    {
        // Set some state, but do NOT set longopt, so create() should throw.
        OptionBuilder.withDescription("desc-should-be-reset");
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }

        // Now build a fresh option properly - description should NOT
        // leak from the failed attempt if reset() worked correctly.
        Option opt = OptionBuilder.withLongOpt("fresh").create();
        assertNull("description should have been reset after failed create()",
                opt.getDescription());
        assertEquals("fresh", opt.getLongOpt());
    }

    // ---------------------------------------------------------
    // create() branch: longopt != null -> delegate to create(null)
    // ---------------------------------------------------------
    @Test
    public void testCreateWithLongOptDelegatesToCreateNull()
    {
        Option opt = OptionBuilder.withLongOpt("longonly").create();
        assertEquals("longonly", opt.getLongOpt());
        assertNull("opt (short option) should be null when create() is used",
                opt.getOpt());
    }

    // ---------------------------------------------------------
    // create(char) delegates to create(String)
    // ---------------------------------------------------------
    @Test
    public void testCreateCharDelegatesToCreateString()
    {
        Option opt = OptionBuilder.withDescription("d").create('D');
        assertEquals("D", opt.getOpt());
        assertEquals("d", opt.getDescription());
    }

    @Test
    public void testCreateStringDirectly()
    {
        Option opt = OptionBuilder.withDescription("desc").create("x");
        assertEquals("x", opt.getOpt());
        assertEquals("desc", opt.getDescription());
    }

    // ---------------------------------------------------------
    // hasArg() -> numberOfArgs = 1
    // ---------------------------------------------------------
    @Test
    public void testHasArg()
    {
        Option opt = OptionBuilder.hasArg().create('a');
        assertEquals(1, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasArg(boolean) branch: true -> 1
    // ---------------------------------------------------------
    @Test
    public void testHasArgBooleanTrue()
    {
        Option opt = OptionBuilder.hasArg(true).create('b');
        assertEquals(1, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasArg(boolean) branch: false -> Option.UNINITIALIZED
    // (ensures the ternary else-branch actually resets a
    //  previously-set numberOfArgs value)
    // ---------------------------------------------------------
    @Test
    public void testHasArgBooleanFalseResetsNumberOfArgs()
    {
        Option opt = OptionBuilder.hasArgs().hasArg(false).create('c');
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasArgs() -> UNLIMITED_VALUES
    // ---------------------------------------------------------
    @Test
    public void testHasArgs()
    {
        Option opt = OptionBuilder.hasArgs().create('d');
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasArgs(int) -> boundary values: 0, positive, negative
    // ---------------------------------------------------------
    @Test
    public void testHasArgsIntPositive()
    {
        Option opt = OptionBuilder.hasArgs(3).create('e');
        assertEquals(3, opt.getArgs());
    }

    @Test
    public void testHasArgsIntZeroBoundary()
    {
        Option opt = OptionBuilder.hasArgs(0).create('f');
        assertEquals(0, opt.getArgs());
    }

    @Test
    public void testHasArgsIntNegative()
    {
        // No validation exists in source for negative values;
        // value should simply be stored as-is.
        Option opt = OptionBuilder.hasArgs(-5).create('g');
        assertEquals(-5, opt.getArgs());
    }

    // ---------------------------------------------------------
    // hasOptionalArg() -> numberOfArgs=1, optionalArg=true
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArg()
    {
        Option opt = OptionBuilder.hasOptionalArg().create('h');
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // hasOptionalArgs() -> UNLIMITED_VALUES, optionalArg=true
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArgs()
    {
        Option opt = OptionBuilder.hasOptionalArgs().create('i');
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // hasOptionalArgs(int) -> custom numArgs, optionalArg=true
    // ---------------------------------------------------------
    @Test
    public void testHasOptionalArgsInt()
    {
        Option opt = OptionBuilder.hasOptionalArgs(7).create('j');
        assertEquals(7, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // withArgName(String) - normal, null and empty string
    // ---------------------------------------------------------
    @Test
    public void testWithArgNameNormal()
    {
        Option opt = OptionBuilder.withArgName("FILE").create('k');
        assertEquals("FILE", opt.getArgName());
    }

    @Test
    public void testWithArgNameNull()
    {
        Option opt = OptionBuilder.withArgName(null).create('l');
        assertNull(opt.getArgName());
    }

    @Test
    public void testWithArgNameEmptyString()
    {
        Option opt = OptionBuilder.withArgName("").create('m');
        assertEquals("", opt.getArgName());
    }

    // default argName ("arg") after reset, without calling withArgName
    @Test
    public void testDefaultArgNameAfterReset()
    {
        Option opt = OptionBuilder.withLongOpt("noargname").create();
        assertEquals("arg", opt.getArgName());
    }

    // ---------------------------------------------------------
    // isRequired() -> required = true
    // ---------------------------------------------------------
    @Test
    public void testIsRequired()
    {
        Option opt = OptionBuilder.isRequired().create('n');
        assertTrue(opt.isRequired());
    }

    // ---------------------------------------------------------
    // isRequired(boolean) branch: true
    // ---------------------------------------------------------
    @Test
    public void testIsRequiredBooleanTrue()
    {
        Option opt = OptionBuilder.isRequired(true).create('o');
        assertTrue(opt.isRequired());
    }

    // ---------------------------------------------------------
    // isRequired(boolean) branch: false (ensures resets previous true)
    // ---------------------------------------------------------
    @Test
    public void testIsRequiredBooleanFalse()
    {
        Option opt = OptionBuilder.isRequired().isRequired(false).create('p');
        assertFalse(opt.isRequired());
    }

    // ---------------------------------------------------------
    // withValueSeparator(char) - custom separator
    // ---------------------------------------------------------
    @Test
    public void testWithValueSeparatorChar()
    {
        Option opt = OptionBuilder.withValueSeparator(':').create('q');
        assertEquals(':', opt.getValueSeparator());
    }

    // ---------------------------------------------------------
    // withValueSeparator() - default '=' separator
    // ---------------------------------------------------------
    @Test
    public void testWithValueSeparatorDefaultEquals()
    {
        Option opt = OptionBuilder.withValueSeparator().create('r');
        assertEquals('=', opt.getValueSeparator());
    }

    // default valuesep after reset (char)0, no separator set
    @Test
    public void testDefaultValueSeparatorAfterReset()
    {
        Option opt = OptionBuilder.create('s');
        assertEquals((char) 0, opt.getValueSeparator());
    }

    // ---------------------------------------------------------
    // withType(Object) - normal and null
    // ---------------------------------------------------------
    @Test
    public void testWithTypeNormal()
    {
        Option opt = OptionBuilder.withType(String.class).create('t');
        assertEquals(String.class, opt.getType());
    }

    @Test
    public void testWithTypeNull()
    {
        Option opt = OptionBuilder.withType(null).create('u');
        assertNull(opt.getType());
    }

    // ---------------------------------------------------------
    // withDescription(String) - normal, null, empty
    // ---------------------------------------------------------
    @Test
    public void testWithDescriptionNormal()
    {
        Option opt = OptionBuilder.withDescription("some description").create('v');
        assertEquals("some description", opt.getDescription());
    }

    @Test
    public void testWithDescriptionNull()
    {
        Option opt = OptionBuilder.withDescription(null).create('w');
        assertNull(opt.getDescription());
    }

    @Test
    public void testWithDescriptionEmpty()
    {
        Option opt = OptionBuilder.withDescription("").create('x');
        assertEquals("", opt.getDescription());
    }

    // ---------------------------------------------------------
    // withLongOpt(String) - null value (explicit set to null again)
    // ---------------------------------------------------------
    @Test
    public void testWithLongOptNullThenCreateThrows()
    {
        OptionBuilder.withLongOpt(null);
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException because longopt is null");
        }
        catch (IllegalArgumentException e)
        {
            // expected
        }
    }

    // ---------------------------------------------------------
    // Full chain test - combine multiple setters, verify all fields
    // and verify reset() clears everything for the NEXT build.
    // ---------------------------------------------------------
    @Test
    public void testFullChainAndResetAfterSuccess()
    {
        Option opt1 = OptionBuilder.withLongOpt("full")
                .hasArgs(2)
                .withArgName("VAL")
                .isRequired()
                .withValueSeparator(',')
                .withType(Number.class)
                .withDescription("full description")
                .create('z');

        assertEquals("z", opt1.getOpt());
        assertEquals("full", opt1.getLongOpt());
        assertEquals(2, opt1.getArgs());
        assertEquals("VAL", opt1.getArgName());
        assertTrue(opt1.isRequired());
        assertEquals(',', opt1.getValueSeparator());
        assertEquals(Number.class, opt1.getType());
        assertEquals("full description", opt1.getDescription());

        // Now build another Option WITHOUT setting anything -
        // all static fields must have been reset by the previous create().
        Option opt2 = OptionBuilder.create("y");
        assertNull(opt2.getLongOpt());
        assertEquals(Option.UNINITIALIZED, opt2.getArgs());
        assertEquals("arg", opt2.getArgName());
        assertFalse(opt2.isRequired());
        assertEquals((char) 0, opt2.getValueSeparator());
        assertNull(opt2.getType());
        assertNull(opt2.getDescription());
        assertFalse(opt2.hasOptionalArg());
    }

    // ---------------------------------------------------------
    // create(String) with null opt (used internally, but also
    // directly testable) - boundary/edge case
    // ---------------------------------------------------------
    @Test
    public void testCreateStringNullOptWithLongOptSet()
    {
        Option opt = OptionBuilder.withLongOpt("onlylong").create((String) null);
        assertNull(opt.getOpt());
        assertEquals("onlylong", opt.getLongOpt());
    }
}
