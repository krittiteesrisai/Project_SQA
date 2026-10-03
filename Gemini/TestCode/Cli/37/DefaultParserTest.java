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
        CommandLine cmd = parser.parse(options, new String[]{});
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testStopAtNonOption() throws Exception {
        options.addOption("a", "apple", false, "an apple");
        String[] args = new String[]{"-a", "non-option", "-b"};
        CommandLine cmd = parser.parse(options, args, true);
        
        assertTrue(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("non-option", cmd.getArgs()[0]);
        assertEquals("-b", cmd.getArgs()[1]);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOptionThrowsException() throws Exception {
        parser.parse(options, new String[]{"-x"}, false);
    }

    @Test
    public void testDoubleDashSkipParsing() throws Exception {
        options.addOption("a", "apple", false, "an apple");
        String[] args = new String[]{"--", "-a", "some-arg"};
        CommandLine cmd = parser.parse(options, args);
        
        assertFalse(cmd.hasOption("a"));
        assertEquals(2, cmd.getArgs().length);
        assertEquals("-a", cmd.getArgs()[0]);
        assertEquals("some-arg", cmd.getArgs()[1]);
    }

    @Test
    public void testNegativeNumberArgument() throws Exception {
        Option opt = new Option("n", "number", true, "a number option");
        options.addOption(opt);
        
        CommandLine cmd = parser.parse(options, new String[]{"-n", "-123.45"});
        assertTrue(cmd.hasOption("n"));
        assertEquals("-123.45", cmd.getOptionValue("n"));
    }

    @Test
    public void testLongOptionWithEqualAndWithoutEqual() throws Exception {
        options.addOption("b", "build", true, "build option");
        
        CommandLine cmd1 = parser.parse(options, new String[]{"--build=release"});
        assertTrue(cmd1.hasOption("build"));
        assertEquals("release", cmd1.getOptionValue("build"));

        CommandLine cmd2 = parser.parse(options, new String[]{"--build", "debug"});
        assertTrue(cmd2.hasOption("build"));
        assertEquals("debug", cmd2.getOptionValue("debug"));
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousLongOption() throws Exception {
        options.addOption("file", "file", true, "file");
        options.addOption("format", "format", true, "format");
        
        parser.parse(options, new String[]{"--f=test"});
    }

    @Test
    public void testShortAndConcatenatedOptions() throws Exception {
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", true, "option c with arg");

        CommandLine cmd = parser.parse(options, new String[]{"-abcval"});
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("c"));
        assertEquals("val", cmd.getOptionValue("c"));
    }

    @Test
    public void testJavaPropertyOptionStyle() throws Exception {
        Option D = Option.builder("D").hasArgs().valueSeparator('=').build();
        options.addOption(D);

        CommandLine cmd = parser.parse(options, new String[]{"-Dkey=value"});
        assertTrue(cmd.hasOption("D"));
        assertArrayEquals(new String[]{"key", "value"}, cmd.getOptionValues("D"));
    }

    @Test
    public void testHandlePropertiesWithValidAndInvalidValues() throws Exception {
        options.addOption("t1", false, "test 1");
        options.addOption("t2", false, "test 2");
        options.addOption("t3", true, "test 3 with arg");

        Properties props = new Properties();
        props.setProperty("t1", "true");
        props.setProperty("t2", "no"); // should be ignored
        props.setProperty("t3", "propValue");

        CommandLine cmd = parser.parse(options, new String[]{}, props, false);
        assertTrue(cmd.hasOption("t1"));
        assertFalse(cmd.hasOption("t2"));
        assertTrue(cmd.hasOption("t3"));
        assertEquals("propValue", cmd.getOptionValue("t3"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testHandlePropertiesUnrecognizedOption() throws Exception {
        Properties props = new Properties();
        props.setProperty("unknownProp", "true");
        parser.parse(options, new String[]{}, props, false);
    }

    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptionsThrowsException() throws Exception {
        Option reqOpt = Option.builder("r").required(true).build();
        options.addOption(reqOpt);
        
        parser.parse(options, new String[]{});
    }

    @Test(expected = MissingArgumentException.class)
    public void testCheckRequiredArgsThrowsException() throws Exception {
        options.addOption("m", "mand", true, "mandatory arg");
        
        parser.parse(options, new String[]{"-m"});
    }
}