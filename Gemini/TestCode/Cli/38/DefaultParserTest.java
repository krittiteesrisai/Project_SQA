package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class DefaultParserTest {

    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DefaultParser();
        options = new Options();
    }

    @Test
    public void testParseNullArguments() throws Exception {
        CommandLine cmd = parser.parse(options, null);
        assertNotNull(cmd);
        assertTrue(cmd.getArgs().length == 0);
    }

    @Test
    public void testParseEmptyArguments() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0]);
        assertNotNull(cmd);
        assertTrue(cmd.getArgs().length == 0);
    }

    @Test
    public void testSkipParsingWithDoubleDash() throws Exception {
        options.addOption("a", "alpha", false, "alpha option");
        CommandLine cmd = parser.parse(options, new String[]{"--", "-a", "extra"});
        assertTrue(cmd.getArgs().length == 2);
        assertEquals("-a", cmd.getArgs()[0]);
        assertEquals("extra", cmd.getArgs()[1]);
    }

    @Test
    public void testNegativeNumberAsArgument() throws Exception {
        Option opt = Option.builder("n").hasArg().build();
        options.addOption(opt);
        CommandLine cmd = parser.parse(options, new String[]{"-n", "-42.5"});
        assertEquals("-42.5", cmd.getOptionValue("n"));
    }

    @Test
    public void testLongOptionWithoutEqual() throws Exception {
        options.addOption(Option.builder("b").longOpt("beta").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"--beta", "valueBeta"});
        assertEquals("valueBeta", cmd.getOptionValue("beta"));
    }

    @Test
    public void testLongOptionWithEqual() throws Exception {
        options.addOption(Option.builder("b").longOpt("beta").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"--beta=valueEqual"});
        assertEquals("valueEqual", cmd.getOptionValue("beta"));
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousLongOption() throws Exception {
        options.addOption(Option.builder().longOpt("version").build());
        options.addOption(Option.builder().longOpt("verbose").build());
        parser.parse(options, new String[]{"--ver"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedLongOption() throws Exception {
        parser.parse(options, new String[]{"--unknown"});
    }

    @Test
    public void testUnrecognizedOptionWithStopAtNonOption() throws Exception {
        CommandLine cmd = parser.parse(options, new String[]{"--unknown", "arg1"}, true);
        assertTrue(cmd.hasOption("unknown") == false);
        assertEquals(2, cmd.getArgs().length);
        assertEquals("--unknown", cmd.getArgs()[0]);
        assertEquals("arg1", cmd.getArgs()[1]);
    }

    @Test
    public void testShortOptionSimple() throws Exception {
        options.addOption("x", false, "x option");
        CommandLine cmd = parser.parse(options, new String[]{"-x"});
        assertTrue(cmd.hasOption("x"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionUnrecognized() throws Exception {
        parser.parse(options, new String[]{"-z"});
    }

    @Test
    public void testShortOptionWithEqual() throws Exception {
        options.addOption(Option.builder("f").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"-f=file.txt"});
        assertEquals("file.txt", cmd.getOptionValue("f"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionWithEqualUnrecognized() throws Exception {
        parser.parse(options, new String[]{"-z=val"});
    }

    @Test
    public void testJavaPropertyOption() throws Exception {
        // Option with args >= 2 simulating -Dkey=value
        options.addOption(Option.builder("D").numberOfArgs(2).build());
        CommandLine cmd = parser.parse(options, new String[]{"-Dproperty=value"});
        assertTrue(cmd.hasOption("D"));
        assertEquals("property", cmd.getOptionValues("D")[0]);
        assertEquals("value", cmd.getOptionValues("D")[1]);
    }

    @Test
    public void testLongPrefixOption() throws Exception {
        options.addOption(Option.builder().longOpt("xmx").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"-xmx512m"});
        assertEquals("512m", cmd.getOptionValue("xmx"));
    }

    @Test
    public void testConcatenatedOptions() throws Exception {
        options.addOption("a", false, "opt a");
        options.addOption("b", false, "opt b");
        options.addOption(Option.builder("c").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[]{"-abc", "val"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertEquals("val", cmd.getOptionValue("c"));
    }

    @Test
    public void testConcatenatedOptionsStopAtNonOption() throws Exception {
        options.addOption("a", false, "opt a");
        CommandLine cmd = parser.parse(options, new String[]{"-az"}, true);
        assertTrue(cmd.hasOption("a"));
        assertEquals("z", cmd.getArgs()[0]);
    }

    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptionsThrowsException() throws Exception {
        options.addOption(Option.builder("r").required(true).build());
        parser.parse(options, new String[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testCheckRequiredArgsThrowsException() throws Exception {
        options.addOption(Option.builder("m").hasArg().required(false).build());
        parser.parse(options, new String[]{"-m"});
    }

    @Test
    public void testHandlePropertiesNull() throws Exception {
        CommandLine cmd = parser.parse(options, new String[0], null);
        assertNotNull(cmd);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testHandlePropertiesUnrecognized() throws Exception {
        Properties props = new Properties();
        props.setProperty("invalidProp", "true");
        parser.parse(options, new String[0], props);
    }

    @Test
    public void testHandlePropertiesValid() throws Exception {
        options.addOption(Option.builder("p").hasArg().build());
        options.addOption("b", false, "boolean opt");
        
        Properties props = new Properties();
        props.setProperty("p", "propVal");
        props.setProperty("b", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertEquals("propVal", cmd.getOptionValue("p"));
        assertTrue(cmd.hasOption("b"));
    }

    @Test
    public void testHandlePropertiesNonBooleanFlagIgnored() throws Exception {
        options.addOption("b", false, "boolean opt");
        Properties props = new Properties();
        props.setProperty("b", "maybe"); // Not yes/true/1

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertFalse(cmd.hasOption("b"));
    }

    @Test
    public void testOptionGroupHandling() throws Exception {
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("1", "one", false, "one");
        Option opt2 = new Option("2", "two", false, "two");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        CommandLine cmd = parser.parse(options, new String[]{"-1"});
        assertTrue(cmd.hasOption("1"));
    }
}