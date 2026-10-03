package org.apache.commons.cli;

import junit.framework.TestCase;
import java.util.Arrays;

/**
 * Test suite for PosixParser focusing on high branch/condition coverage
 * and edge case detection for Defects4J Cli-22.
 */
public class PosixParserTest extends TestCase
{
    private PosixParser parser;
    private Options options;

    protected void setUp() throws Exception
    {
        super.setUp();
        parser = new PosixParser();
        options = new Options();
        
        // Setup standard options for testing
        options.addOption("a", false, "Flag A");
        options.addOption("b", false, "Flag B");
        options.addOption("c", false, "Flag C");
        options.addOption("f", true, "Flag F with argument");
        options.addOption("foo", false, "Option -foo");
        
        Option longOpt = OptionBuilder.withLongOpt("help")
                                      .hasArg(false)
                                      .create();
        options.addOption(longOpt);

        Option longOptWithArg = OptionBuilder.withLongOpt("output")
                                             .hasArg(true)
                                             .create();
        options.addOption(longOptWithArg);
    }

    private void assertArrayEquals(String[] expected, String[] actual)
    {
        assertEquals("Array lengths differ; expected " + Arrays.asList(expected) 
                     + " but got " + Arrays.asList(actual), 
                     expected.length, actual.length);
        for (int i = 0; i < expected.length; i++)
        {
            assertEquals("Difference at index " + i, expected[i], actual[i]);
        }
    }

    /**
     * Boundary Case: Empty argument array
     */
    public void testFlattenEmptyArgs()
    {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    /**
     * Branch: Single hyphen "-" handling
     */
    public void testFlattenSingleHyphen()
    {
        String[] args = new String[] { "-" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-" }, result);
    }

    /**
     * Branch: Recognized Long Option without argument value (--help)
     */
    public void testFlattenRecognizedLongOption()
    {
        String[] args = new String[] { "--help" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--help" }, result);
    }

    /**
     * Branch: Recognized Long Option with '=' sign (--output=file.txt)
     */
    public void testFlattenRecognizedLongOptionWithEquals()
    {
        String[] args = new String[] { "--output=file.txt" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "--output", "file.txt" }, result);
    }

    /**
     * Branch: Unrecognized Long Option (--unknown and --unknown=val)
     * Triggers processNonOptionToken and eatTheRest
     */
    public void testFlattenUnrecognizedLongOptionTriggersEatTheRest()
    {
        String[] args = new String[] { "--unknown=val", "extra1", "extra2" };
        String[] result = parser.flatten(options, args, false);
        // Unrecognized long option puts "--" then value, then gobbles rest
        assertArrayEquals(new String[] { "--", "--unknown=val", "extra1", "extra2" }, result);
    }

    /**
     * Edge Case: Double hyphen alone "--"
     */
    public void testFlattenDoubleHyphenAlone()
    {
        String[] args = new String[] { "--", "file1" };
        String[] result = parser.flatten(options, args, false);
        // "--" is treated as unrecognized long opt -> processNonOptionToken adds "--" then "--" then gobbles
        assertArrayEquals(new String[] { "--", "--", "file1" }, result);
    }

    /**
     * Branch: Single character option token of length 2 (-a)
     */
    public void testFlattenRecognizedShortOption()
    {
        String[] args = new String[] { "-a", "-b" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-b" }, result);
    }

    /**
     * Branch: Multi-char token recognized directly as an option (-foo)
     */
    public void testFlattenOptionRecognizedDirectly()
    {
        String[] args = new String[] { "-foo" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-foo" }, result);
    }

    /**
     * Branch: Unrecognized short option of length 2 (-z) with stopAtNonOption=true
     */
    public void testFlattenUnrecognizedShortOptionStopAtNonOptionTrue()
    {
        String[] args = new String[] { "-z", "remain1", "remain2" };
        String[] result = parser.flatten(options, args, true);
        // processOptionToken with stopAtNonOption and missing option sets eatTheRest
        assertArrayEquals(new String[] { "-z", "remain1", "remain2" }, result);
    }

    /**
     * Branch: Unrecognized short option of length 2 (-z) with stopAtNonOption=false
     */
    public void testFlattenUnrecognizedShortOptionStopAtNonOptionFalse()
    {
        String[] args = new String[] { "-z", "arg" };
        String[] result = parser.flatten(options, args, false);
        // Not stopping at non-option; does not set eatTheRest
        assertArrayEquals(new String[] { "-z", "arg" }, result);
    }

    /**
     * Branch (Bursting): Clustered boolean options (-abc)
     */
    public void testBurstTokenAllValidNoArgs()
    {
        String[] args = new String[] { "-abc" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-b", "-c" }, result);
    }

    /**
     * Branch (Bursting): Option with attached argument (-fValue)
     */
    public void testBurstTokenOptionWithAttachedArg()
    {
        String[] args = new String[] { "-afMyFile.txt" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-f", "MyFile.txt" }, result);
    }

    /**
     * Branch (Bursting): Option requiring arg at the very end of token (-abf)
     */
    public void testBurstTokenOptionWithArgAtEnd()
    {
        String[] args = new String[] { "-abf", "argValue" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "-a", "-b", "-f", "argValue" }, result);
    }

    /**
     * Branch (Bursting): Unrecognized character in burst with stopAtNonOption=true
     */
    public void testBurstTokenUnrecognizedCharStopAtNonOptionTrue()
    {
        String[] args = new String[] { "-axc", "leftover" };
        String[] result = parser.flatten(options, args, true);
        // -a processed, 'x' is unrecognized -> processNonOptionToken("xc") adds "--" and "xc"
        assertArrayEquals(new String[] { "-a", "--", "xc", "leftover" }, result);
    }

    /**
     * Branch (Bursting): Unrecognized character in burst with stopAtNonOption=false
     */
    public void testBurstTokenUnrecognizedCharStopAtNonOptionFalse()
    {
        String[] args = new String[] { "-axc", "remaining" };
        String[] result = parser.flatten(options, args, false);
        // -a processed, then unrecognized triggers tokens.add(token) and breaks
        assertArrayEquals(new String[] { "-a", "-axc", "remaining" }, result);
    }

    /**
     * Branch: Non-option tokens when stopAtNonOption=false
     */
    public void testFlattenNonOptionTokensStopFalse()
    {
        String[] args = new String[] { "foo", "bar", "-a" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "foo", "bar", "-a" }, result);
    }

    /**
     * Branch: Non-option token when stopAtNonOption=true
     */
    public void testFlattenNonOptionTokensStopTrue()
    {
        String[] args = new String[] { "foo", "bar", "-a" };
        String[] result = parser.flatten(options, args, true);
        // Triggers processNonOptionToken -> adds "--", "foo", then gobbles rest
        assertArrayEquals(new String[] { "--", "foo", "bar", "-a" }, result);
    }

    /**
     * Edge Case: Empty string as token ("")
     */
    public void testFlattenEmptyStringToken()
    {
        String[] args = new String[] { "", "-a" };
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] { "", "-a" }, result);
    }

    /**
     * Invalid State / Reusability Case: Verify parser.init() resets eatTheRest & tokens
     */
    public void testParserReusabilityStateReset()
    {
        String[] args1 = new String[] { "stopHere", "willBeEaten" };
        String[] result1 = parser.flatten(options, args1, true);
        assertArrayEquals(new String[] { "--", "stopHere", "willBeEaten" }, result1);

        // Run second parse; verify eatTheRest is reset to false
        String[] args2 = new String[] { "-a", "-b" };
        String[] result2 = parser.flatten(options, args2, false);
        assertArrayEquals(new String[] { "-a", "-b" }, result2);
    }
}