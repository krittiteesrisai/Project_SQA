package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * JUnit4 tests for {@link PosixParser}.
 * Placed in the same package to access the protected flatten() method.
 */
public class PosixParserTest
{
    private PosixParser parser;
    private Options options;

    @Before
    public void setUp()
    {
        parser = new PosixParser();
        options = new Options();
    }

    // ---------- long option "--" handling ----------

    @Test
    public void testLongOptionWithoutEquals()
    {
        String[] args = {"--foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--foo"}, result);
    }

    @Test
    public void testLongOptionWithEquals()
    {
        String[] args = {"--foo=bar"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--foo", "bar"}, result);
    }

    @Test
    public void testLongOptionWithMultipleEquals()
    {
        // indexOf('=') finds only the FIRST '=' -> ensure substring logic is correct
        String[] args = {"--foo=bar=baz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--foo", "bar=baz"}, result);
    }

    @Test
    public void testDoubleHyphenAloneToken()
    {
        // "--" itself: startsWith("--") true, indexOf('=') == -1 -> added as-is
        String[] args = {"--"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"--"}, result);
    }

    // ---------- single hyphen "-" ----------

    @Test
    public void testSingleHyphen()
    {
        String[] args = {"-"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-"}, result);
    }

    // ---------- short option length == 2 -> processOptionToken ----------

    @Test
    public void testShortOptionKnown()
    {
        options.addOption("a", false, "a desc");
        String[] args = {"-a"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-a"}, result);
    }

    @Test
    public void testShortOptionUnknownStopAtNonOptionTrue()
    {
        // unknown "-x" with stopAtNonOption=true -> eatTheRest=true -> gobble consumes remaining raw
        String[] args = {"-x", "extra1", "extra2"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"-x", "extra1", "extra2"}, result);
    }

    @Test
    public void testShortOptionUnknownStopAtNonOptionFalse()
    {
        // unknown "-x" with stopAtNonOption=false -> only token added, no eatTheRest
        String[] args = {"-x", "foo"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-x", "foo"}, result);
    }

    // ---------- multi-char token that IS a registered option ----------

    @Test
    public void testMultiCharTokenKnownOption()
    {
        options.addOption("abc", false, "abc desc");
        String[] args = {"-abc"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-abc"}, result);
    }

    // ---------- burstToken branches ----------

    @Test
    public void testBurstTokenHasArgWithRemainingChars()
    {
        options.addOption("b", true, "b desc"); // hasArg=true
        String[] args = {"-bvalue"};
        String[] result = parser.flatten(options, args, false);
        // i=1 'b' matched, hasArg true, remaining chars "value" -> substring added, break
        assertArrayEquals(new String[] {"-b", "value"}, result);
    }

    @Test
    public void testBurstTokenNoArgThenHasArgNoRemainingChars()
    {
        // First char matched but hasArg=false -> loop continues (no break)
        // Second char matched, hasArg=true, but is the LAST char -> no substring add
        options.addOption("a", false, "a desc");
        options.addOption("b", true, "b desc");
        String[] args = {"-ab"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-a", "-b"}, result);
    }

    @Test
    public void testBurstTokenUnknownCharStopAtNonOptionTrue()
    {
        // 'x' unmatched, stopAtNonOption=true -> process(token.substring(i)); break
        String[] args = {"-xyz"};
        String[] result = parser.flatten(options, args, true);
        // process("xyz") with currentOption==null -> "--","xyz"
        assertArrayEquals(new String[] {"--", "xyz"}, result);
    }

    @Test
    public void testBurstTokenUnknownCharStopAtNonOptionFalse()
    {
        // 'x' unmatched, stopAtNonOption=false -> tokens.add(token) whole; break
        String[] args = {"-xyz"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"-xyz"}, result);
    }

    // ---------- process() via stopAtNonOption branch in flatten ----------

    @Test
    public void testProcessNonOptionNoCurrentOptionStopAtNonOptionTrue()
    {
        // token doesn't start with '-', stopAtNonOption=true, currentOption==null
        String[] args = {"foo"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"--", "foo"}, result);
    }

    @Test
    public void testProcessNonOptionWithCurrentOptionHasArg()
    {
        options.addOption("a", true, "a desc"); // hasArg=true
        String[] args = {"-a", "value"};
        String[] result = parser.flatten(options, args, true);
        // "-a" -> processOptionToken sets currentOption=a
        // "value" -> process(): currentOption!=null && hasArg()==true -> tokens.add("value"); currentOption=null
        assertArrayEquals(new String[] {"-a", "value"}, result);
    }

    @Test
    public void testBurstThenValueConsumedByProcess()
    {
        // Integration: currentOption set inside burstToken, then consumed by process()
        options.addOption("a", false, "a desc");
        options.addOption("b", true, "b desc");
        String[] args = {"-ab", "argValue"};
        String[] result = parser.flatten(options, args, true);
        assertArrayEquals(new String[] {"-a", "-b", "argValue"}, result);
    }

    // ---------- default else branch (plain token, stopAtNonOption=false) ----------

    @Test
    public void testPlainTokenStopAtNonOptionFalse()
    {
        String[] args = {"plain"};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {"plain"}, result);
    }

    @Test
    public void testEmptyStringToken()
    {
        // "" : ไม่เข้าเงื่อนไข "--", "-", startsWith("-") ใดๆ -> default else
        String[] args = {""};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {""}, result);
    }

    // ---------- boundary / null cases ----------

    @Test
    public void testEmptyArgumentsArray()
    {
        String[] args = {};
        String[] result = parser.flatten(options, args, false);
        assertArrayEquals(new String[] {}, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullArgumentsThrowsNPE()
    {
        // Arrays.asList(null).iterator().hasNext() -> NPE ที่ size()
        parser.flatten(options, null, false);
    }

    @Test(expected = NullPointerException.class)
    public void testNullOptionsThrowsNPE()
    {
        // "-a" length==2 -> processOptionToken เรียก options.hasOption() บน null -> NPE
        String[] args = {"-a"};
        parser.flatten(null, args, false);
    }
}
