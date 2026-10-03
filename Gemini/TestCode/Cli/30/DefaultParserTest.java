import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Properties;

public class DefaultParserTest {

    private DefaultParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new DefaultParser();
        options = new Options();
        
        // เพิ่ม Options หลากหลายประเภทสำหรับการทดสอบครบทุก Branch
        options.addOption(new Option("a", "alpha", false, "alpha option"));
        options.addOption(new Option("b", "beta", true, "beta option with arg"));
        options.addOption(new Option("c", "gamma", true, "gamma option with arg"));
        
        // Option สำหรับทดสอบ Ambiguous
        options.addOption(new Option("prefix1", false, "ambiguous test 1"));
        options.addOption(new Option("prefix2", false, "ambiguous test 2"));
        
        // Option สำหรับ Java Property / Multi-args
        Option javaPropOpt = new Option("D", "define", true, "define property");
        javaPropOpt.setArgs(2);
        options.addOption(javaPropOpt);

        // Required Option
        Option reqOpt = new Option("r", "required", false, "required option");
        reqOpt.setRequired(true);
        options.addOption(reqOpt);
    }

    @Test
    public void testParseNullArguments() throws Exception {
        CommandLine cmd = parser.parse(options, (String[]) null);
        assertNotNull(cmd);
    }

    @Test
    public void testParseStopParsingWithDoubleDash() throws Exception {
        String[] args = new String[] { "--", "-a", "unknownArg" };
        CommandLine cmd = parser.parse(options, args, true);
        assertNotNull(cmd);
        assertTrue(cmd.hasOption("a") == false);
        // ตรวจสอบว่า non-options ถูกเก็บเข้า cmd.getArgs()
        assertEquals(2, cmd.getArgs().size());
        assertEquals("-a", cmd.getArgs().get(0));
    }

    @Test
    public void testLongOptionWithoutEqualFound() throws Exception {
        String[] args = new String[] { "--alpha" };
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testLongOptionNotFoundThrowsException() throws Exception {
        String[] args = new String[] { "--nonexistent" };
        parser.parse(options, args, false);
    }

    @Test
    public void testLongOptionNotFoundStopAtNonOption() throws Exception {
        String[] args = new String[] { "--nonexistent" };
        CommandLine cmd = parser.parse(options, args, true);
        assertEquals(1, cmd.getArgs().size());
        assertEquals("--nonexistent", cmd.getArgs().get(0));
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousLongOptionThrowsException() throws Exception {
        // "--pref" จะตรงกับทั้ง "prefix1" และ "prefix2"
        String[] args = new String[] { "--pref" };
        parser.parse(options, args);
    }

    @Test
    public void testLongOptionWithEqualAcceptsArg() throws Exception {
        String[] args = new String[] { "--beta=valueB" };
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("b"));
        assertEquals("valueB", cmd.getOptionValue("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testLongOptionWithEqualDoesNotAcceptArg() throws Exception {
        // "--alpha" ไม่รับค่า แต่ใส่ "=value"
        String[] args = new String[] { "--alpha=value" };
        parser.parse(options, args, false);
    }

    @Test
    public void testShortOptionSimple() throws Exception {
        String[] args = new String[] { "-a" };
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionUnknown() throws Exception {
        String[] args = new String[] { "-z" };
        parser.parse(options, args, false);
    }

    @Test
    public void testShortOptionWithEqual() throws Exception {
        String[] args = new String[] { "-b=valB" };
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("b"));
        assertEquals("valB", cmd.getOptionValue("b"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testShortOptionWithEqualInvalidOpt() throws Exception {
        String[] args = new String[] { "-z=val" };
        parser.parse(options, args, false);
    }

    @Test
    public void testConcatenatedOptions() throws Exception {
        // -ar: -a ไม่มี arg, -r (required)
        String[] args = new String[] { "-ar" };
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("r"));
    }

    @Test
    public void testConcatenatedOptionsWithTrailArg() throws Exception {
        // -b รับ arg และมีตัวอักษรต่อท้าย
        String[] args = new String[] { "-btrailVal" };
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("b"));
        assertEquals("trailVal", cmd.getOptionValue("b"));
    }

    @Test
    public void testJavaPropertyParsing() throws Exception {
        // -Dkey=value
        String[] args = new String[] { "-Dkey=val" };
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("D"));
        assertEquals("key", cmd.getOptionValues("D")[0]);
        assertEquals("val", cmd.getOptionValues("D")[1]);
    }

    @Test
    public void testHandlePropertiesWithValidBooleansAndValues() throws Exception {
        Properties props = new Properties();
        props.setProperty("b", "true");
        props.setProperty("a", "yes");
        props.setProperty("c", "customValue"); // Option c มี arg และไม่อยู่ในเงื่อนไข boolean-only

        CommandLine cmd = parser.parse(options, new String[0], props);
        assertTrue(cmd.hasOption("b"));
        assertTrue(cmd.hasOption("a"));
        assertTrue(cmd.hasOption("c"));
        assertEquals("customValue", cmd.getOptionValue("c"));
    }

    @Test(expected = MissingOptionException.class)
    public void testCheckRequiredOptionsMissing() throws Exception {
        // Option 'r' ถูกกำหนดว่า required แต่ไม่ได้ใส่มาใน arguments
        parser.parse(options, new String[] { "-a" });
    }

    @Test(expected = MissingArgumentException.class)
    public void testCheckRequiredArgsMissing() throws Exception {
        // Option 'b' ต้องการ argument แต่ตามด้วยตัวเลือกอื่นหรือจบการทำงาน
        parser.parse(options, new String[] { "-b" });
    }

    @Test
    public void testIsNegativeNumberArgument() throws Exception {
        // ทดสอบกรณี negative number เป็น argument ของ option b (-b -123.45)
        String[] args = new String[] { "-b", "-123.45" };
        CommandLine cmd = parser.parse(options, args);
        assertTrue(cmd.hasOption("b"));
        assertEquals("-123.45", cmd.getOptionValue("b"));
    }
}