package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for {@link CommandLine} targeting maximum branch and condition coverage,
 * edge cases, boundary limits, and hidden faults.
 */
public class CommandLineTest {

    private CommandLine cmd;

    @Before
    public void setUp() {
        cmd = new CommandLine();
    }

    // =========================================================================
    // 1. Initial State & Empty CommandLine Tests
    // =========================================================================

    @Test
    public void testEmptyCommandLine() {
        assertNotNull("Args array should not be null", cmd.getArgs());
        assertEquals("Args array should be empty", 0, cmd.getArgs().length);

        assertNotNull("Arg list should not be null", cmd.getArgList());
        assertTrue("Arg list should be empty", cmd.getArgList().isEmpty());

        assertNotNull("Options array should not be null", cmd.getOptions());
        assertEquals("Options array should be empty", 0, cmd.getOptions().length);

        Iterator it = cmd.iterator();
        assertNotNull("Iterator should not be null", it);
        assertFalse("Iterator should have no next element", it.hasNext());

        assertFalse("hasOption(String) should be false", cmd.hasOption("nonExisting"));
        assertFalse("hasOption(char) should be false", cmd.hasOption('z'));

        assertNull("getOptionValue(String) should be null", cmd.getOptionValue("nonExisting"));
        assertNull("getOptionValue(char) should be null", cmd.getOptionValue('z'));

        assertNull("getOptionValues(String) should be null", cmd.getOptionValues("nonExisting"));
        assertNull("getOptionValues(char) should be null", cmd.getOptionValues('z'));

        assertNull("getOptionObject(String) should be null", cmd.getOptionObject("nonExisting"));
        assertNull("getOptionObject(char) should be null", cmd.getOptionObject('z'));

        assertEquals("Default value should be returned", "default", cmd.getOptionValue("nonExisting", "default"));
        assertEquals("Default value should be returned for char", "default", cmd.getOptionValue('z', "default"));
    }

    // =========================================================================
    // 2. Argument Handling (getArgs, getArgList, addArg)
    // =========================================================================

    @Test
    public void testAddAndGetArgs() {
        cmd.addArg("first");
        cmd.addArg("");       // Empty string boundary
        cmd.addArg("second");
        cmd.addArg(null);     // Null boundary

        String[] args = cmd.getArgs();
        assertEquals(4, args.length);
        assertEquals("first", args[0]);
        assertEquals("", args[1]);
        assertEquals("second", args[2]);
        assertNull(args[3]);

        List argList = cmd.getArgList();
        assertEquals(4, argList.size());
        assertEquals("first", argList.get(0));
        assertEquals("", argList.get(1));
        assertEquals("second", argList.get(2));
        assertNull(argList.get(3));
    }

    // =========================================================================
    // 3. Option Registration (addOption branches: key == null vs key != null)
    // =========================================================================

    @Test
    public void testAddOptionBothNullKeyAndLongOpt() {
        // Triggers the key == null branch in addOption
        Option nullOption = new Option(null, null, false, "Option with both null opt and longOpt");
        cmd.addOption(nullOption);

        Option[] options = cmd.getOptions();
        assertEquals(1, options.length);
        assertSame(nullOption, options[0]);

        Iterator it = cmd.iterator();
        assertTrue(it.hasNext());
        assertSame(nullOption, it.next());
    }

    @Test
    public void testAddOptionLongOptOnly() {
        // Option with opt == null, but longOpt != null
        Option longOnly = new Option(null, "verbose", false, "Long option only");
        cmd.addOption(longOnly);

        assertTrue("Should have option by long name", cmd.hasOption("verbose"));
        assertFalse("Should not have option with leading hyphens", cmd.hasOption("--verbose"));
        assertNotNull(cmd.getOptions());
        assertEquals(1, cmd.getOptions().length);
    }

    @Test
    public void testAddOptionShortAndLongOpt() {
        Option opt = new Option("v", "version", false, "Display version info");
        cmd.addOption(opt);

        assertTrue("hasOption with short name", cmd.hasOption("v"));
        assertTrue("hasOption with char name", cmd.hasOption('v'));

        // Note: hasOption does not resolve longOpt aliases, covers options.containsKey(opt) == false
        assertFalse("hasOption does not map long alias to short key", cmd.hasOption("version"));
        assertFalse("hasOption does not strip hyphens", cmd.hasOption("-v"));
    }

    // =========================================================================
    // 4. getOptionValues & Leading Hyphens Triggers
    // =========================================================================

    @Test
    public void testGetOptionValuesWithHyphensAndAliases() {
        Option opt = new Option("f", "file", true, "Target file");
        opt.addValue("output.txt");
        cmd.addOption(opt);

        // Access via short opt
        String[] values1 = cmd.getOptionValues("f");
        assertNotNull(values1);
        assertEquals(1, values1.length);
        assertEquals("output.txt", values1[0]);

        // Access via short opt with leading hyphen
        String[] valuesHyphenShort = cmd.getOptionValues("-f");
        assertNotNull(valuesHyphenShort);
        assertEquals("output.txt", valuesHyphenShort[0]);

        // Access via long opt (names.containsKey(opt) == true)
        String[] valuesLong = cmd.getOptionValues("file");
        assertNotNull(valuesLong);
        assertEquals("output.txt", valuesLong[0]);

        // Access via long opt with leading double hyphens
        String[] valuesHyphenLong = cmd.getOptionValues("--file");
        assertNotNull(valuesHyphenLong);
        assertEquals("output.txt", valuesHyphenLong[0]);

        // Char overload
        String[] valuesChar = cmd.getOptionValues('f');
        assertNotNull(valuesChar);
        assertEquals("output.txt", valuesChar[0]);

        // Non-existent options
        assertNull(cmd.getOptionValues("unknown"));
        assertNull(cmd.getOptionValues("--unknown"));
        assertNull(cmd.getOptionValues('x'));
    }

    @Test
    public void testGetOptionValuesMultiple() {
        Option opt = new Option("p", "property", true, "Key value properties");
        opt.addValue("key1=value1");
        opt.addValue("key2=value2");
        cmd.addOption(opt);

        String[] values = cmd.getOptionValues("p");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("key1=value1", values[0]);
        assertEquals("key2=value2", values[1]);

        // getOptionValue should return only the first value
        assertEquals("key1=value1", cmd.getOptionValue("p"));
        assertEquals("key1=value1", cmd.getOptionValue('p'));
        assertEquals("key1=value1", cmd.getOptionValue("property"));
        assertEquals("key1=value1", cmd.getOptionValue("--property"));
    }

    @Test
    public void testGetOptionValueWhenOptionHasNoArguments() {
        // Option exists, but has no argument values
        Option flag = new Option("d", "debug", false, "Debug flag");
        cmd.addOption(flag);

        assertNull("getOptionValues should return null if no values were added", cmd.getOptionValues("d"));
        assertNull("getOptionValue should return null if no values were added", cmd.getOptionValue("d"));
        assertNull("getOptionValue(char) should return null", cmd.getOptionValue('d'));
    }

    // =========================================================================
    // 5. Default Values Coverage
    // =========================================================================

    @Test
    public void testGetOptionValueWithDefaultValue() {
        Option opt = new Option("c", "config", true, "Config file");
        cmd.addOption(opt);

        // Case A: Option exists but has no argument -> return default
        assertEquals("default.cfg", cmd.getOptionValue("c", "default.cfg"));
        assertEquals("default.cfg", cmd.getOptionValue('c', "default.cfg"));

        // Case B: Option does not exist -> return default
        assertEquals("default.cfg", cmd.getOptionValue("nonexistent", "default.cfg"));
        assertEquals("default.cfg", cmd.getOptionValue('z', "default.cfg"));

        // Case C: Null defaultValue
        assertNull(cmd.getOptionValue("nonexistent", null));
        assertNull(cmd.getOptionValue('z', null));

        // Case D: Option has value -> return actual value, NOT defaultValue
        opt.addValue("custom.cfg");
        assertEquals("custom.cfg", cmd.getOptionValue("c", "default.cfg"));
        assertEquals("custom.cfg", cmd.getOptionValue('c', "default.cfg"));
        assertEquals("custom.cfg", cmd.getOptionValue("config", "default.cfg"));
    }

    // =========================================================================
    // 6. getOptionObject & Type Conversion Coverage
    // =========================================================================

    @Test
    public void testGetOptionObjectNonExistent() {
        assertNull(cmd.getOptionObject("missing"));
        assertNull(cmd.getOptionObject('m'));
    }

    @Test
    public void testGetOptionObjectExistsWithoutValue() {
        Option opt = new Option("n", "number", true, "Number value");
        opt.setType(PatternOptionBuilder.NUMBER_VALUE);
        cmd.addOption(opt);

        // Option is present in options map, but has no value (res == null)
        assertNull(cmd.getOptionObject("n"));
        assertNull(cmd.getOptionObject('n'));
    }

    @Test
    public void testGetOptionObjectSuccessfulConversion() {
        Option opt = new Option("n", "number", true, "Number value");
        opt.setType(PatternOptionBuilder.NUMBER_VALUE);
        opt.addValue("12345");
        cmd.addOption(opt);

        Object resultString = cmd.getOptionObject("n");
        assertNotNull(resultString);
        assertTrue("Result should be an instance of Number", resultString instanceof Number);
        assertEquals(new Long(12345), resultString);

        Object resultChar = cmd.getOptionObject('n');
        assertNotNull(resultChar);
        assertEquals(new Long(12345), resultChar);
    }

    @Test
    public void testGetOptionObjectWithLongOptFaultDetection() {
        // Edge Case: querying by longOpt when registered under shortOpt
        Option opt = new Option("s", "size", true, "Size setting");
        opt.setType(PatternOptionBuilder.NUMBER_VALUE);
        opt.addValue("50");
        cmd.addOption(opt);

        // getOptionValue("size") returns "50", but options.containsKey("size") is FALSE
        // Covers branch (!options.containsKey(opt)) == true
        assertNull("getOptionObject by longOpt returns null due to key mismatch in options Map",
                cmd.getOptionObject("size"));
    }

    // =========================================================================
    // 7. Iteration & Array Consistency
    // =========================================================================

    @Test
    public void testMultipleOptionsIterationAndArray() {
        Option opt1 = new Option("a", "all", false, "do all");
        Option opt2 = new Option("b", "brief", false, "brief info");
        Option opt3 = new Option("c", "count", true, "item count");

        cmd.addOption(opt1);
        cmd.addOption(opt2);
        cmd.addOption(opt3);

        Option[] options = cmd.getOptions();
        assertEquals(3, options.length);

        Iterator it = cmd.iterator();
        int count = 0;
        while (it.hasNext()) {
            assertNotNull(it.next());
            count++;
        }
        assertEquals("Iterator must traverse all unique options", 3, count);
    }
}