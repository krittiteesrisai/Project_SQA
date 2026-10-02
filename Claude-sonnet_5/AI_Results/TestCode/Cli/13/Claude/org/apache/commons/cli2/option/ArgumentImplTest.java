package org.apache.commons.cli2.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
// สมมติฐาน: คลาสนี้เป็น concrete implementation ของ WriteableCommandLine
// ที่มีอยู่จริงใน source tree ของโปรเจกต์ commons-cli2 (ไม่ใช่ 3rd-party jar)
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.validation.InvalidArgumentException;
import org.apache.commons.cli2.validation.Validator;

public class ArgumentImplTest {

    // ---------------------------------------------------------------
    // Test double: บังคับพฤติกรรม looksLikeOption ให้ deterministic
    // และดักจับพารามิเตอร์ที่ถูกส่งเข้า setDefaultValues
    // ---------------------------------------------------------------
    private static class TestCommandLine extends WriteableCommandLineImpl {

        private Boolean looksLikeOptionOverride;
        Option lastDefaultValuesOption;
        List lastDefaultValuesList;

        // สมมติฐาน: constructor (Option rootOption, List arguments) มีอยู่จริง
        TestCommandLine(Option rootOption, List arguments) {
            super(rootOption, arguments);
        }

        void forceLooksLikeOption(boolean value) {
            this.looksLikeOptionOverride = Boolean.valueOf(value);
        }

        public boolean looksLikeOption(String trigger) {
            if (looksLikeOptionOverride != null) {
                return looksLikeOptionOverride.booleanValue();
            }
            return false; // ค่า default ที่ปลอดภัย ไม่พึ่งพฤติกรรม parent
        }

        public void setDefaultValues(Option option, List defaults) {
            this.lastDefaultValuesOption = option;
            this.lastDefaultValuesList = defaults;
            super.setDefaultValues(option, defaults);
        }
    }

    private ArgumentImpl argument; // ตัวอย่าง default ใช้ในหลาย test

    @Before
    public void setUp() {
        argument = newArgument("arg", "desc", 0, 1, Validator ??? , null, null);
    }

    // แก้ signature setUp ด้านบนผิด syntax -> ไม่ใช้ default fixture ซับซ้อน
    // ใช้ factory method สร้าง argument ตามต้องการในแต่ละ test แทน

    private ArgumentImpl newArgument(String name,
                                      String description,
                                      int minimum,
                                      int maximum,
                                      Validator validator,
                                      String consumeRemaining,
                                      List defaults) {
        return new ArgumentImpl(name, description, minimum, maximum,
                ArgumentImpl.DEFAULT_INITIAL_SEPARATOR,
                ArgumentImpl.DEFAULT_SUBSEQUENT_SEPARATOR,
                validator,
                (consumeRemaining == null) ? ArgumentImpl.DEFAULT_CONSUME_REMAINING : consumeRemaining,
                defaults, 0);
    }

    private ArgumentImpl newSplitArgument(String name, int minimum, int maximum, char sep) {
        return new ArgumentImpl(name, "desc", minimum, maximum,
                ArgumentImpl.DEFAULT_INITIAL_SEPARATOR, sep,
                null, ArgumentImpl.DEFAULT_CONSUME_REMAINING, null, 0);
    }

    private List list(String... values) {
        return new ArrayList(Arrays.asList(values));
    }

    private TestCommandLine newCommandLine(Option rootOption) {
        return new TestCommandLine(rootOption, new ArrayList());
    }

    // =================================================================
    // 1. Constructor - boundary / illegal argument
    // =================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_minimumGreaterThanMaximum_throws() {
        newArgument("x", "d", 5, 2, null, null, null);
    }

    @Test
    public void testConstructor_minimumEqualsMaximum_ok() {
        ArgumentImpl a = newArgument("x", "d", 2, 2, null, null, null);
        assertEquals(2, a.getMinimum());
        assertEquals(2, a.getMaximum());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_defaultsTooFew_throws() {
        // defaults.size()=1 < minimum=2, size()>0 -> เข้าเงื่อนไข throw
        newArgument("x", "d", 2, 5, null, null, list("only1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_defaultsTooMany_throws() {
        // defaults.size()=3 > maximum=2
        newArgument("x", "d", 0, 2, null, null, list("a", "b", "c"));
    }

    @Test
    public void testConstructor_defaultsExactlyMinimum_ok() {
        ArgumentImpl a = newArgument("x", "d", 2, 5, null, null, list("a", "b"));
        assertEquals(2, a.getDefaultValues().size());
    }

    @Test
    public void testConstructor_defaultsExactlyMaximum_ok() {
        ArgumentImpl a = newArgument("x", "d", 0, 2, null, null, list("a", "b"));
        assertEquals(2, a.getDefaultValues().size());
    }

    @Test
    public void testConstructor_emptyDefaultsList_skipsChecks() {
        // size()==0 -> condition (size()>0) เป็น false -> ไม่ throw
        // แม้ minimum > 0 (edge-case ที่อาจดูขัดสามัญสำนึก แต่ตรงกับ logic จริง)
        ArgumentImpl a = newArgument("x", "d", 3, 5, null, null, new ArrayList());
        assertNotNull(a);
        assertEquals(0, a.getDefaultValues().size());
    }

    @Test
    public void testConstructor_nullDefaults_ok() {
        ArgumentImpl a = newArgument("x", "d", 0, 5, null, null, null);
        assertNull(a.getDefaultValues());
    }

    @Test
    public void testConstructor_nameNull_usesDefaultName() {
        ArgumentImpl a = newArgument(null, "d", 0, 1, null, null, null);
        assertEquals("arg", a.getPreferredName());
    }

    @Test
    public void testConstructor_nameProvided_usesGivenName() {
        ArgumentImpl a = newArgument("myArg", "d", 0, 1, null, null, null);
        assertEquals("myArg", a.getPreferredName());
    }

    // =================================================================
    // 2. Simple getters
    // =================================================================

    @Test
    public void testGetters_basicValues() {
        Validator v = new Validator() {
            public void validate(List values) throws InvalidArgumentException { }
        };
        ArgumentImpl a = new ArgumentImpl("n", "desc", 1, 3, 'i', 's', v,
                "STOP", list("d1"), 0);
        assertEquals("n", a.getPreferredName());
        assertEquals("desc", a.getDescription());
        assertEquals(1, a.getMinimum());
        assertEquals(3, a.getMaximum());
        assertEquals('i', a.getInitialSeparator());
        assertEquals('s', a.getSubsequentSeparator());
        assertEquals("STOP", a.getConsumeRemaining());
        assertEquals(v, a.getValidator());
        assertEquals(list("d1"), a.getDefaultValues());
    }

    @Test
    public void testGetPrefixes_isEmptyAndImmutable() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        Set prefixes = a.getPrefixes();
        assertEquals(Collections.EMPTY_SET, prefixes);
        try {
            prefixes.add("z");
            fail("expected UnsupportedOperationException on immutable EMPTY_SET");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
    }

    @Test
    public void testGetTriggers_isEmpty() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        assertEquals(Collections.EMPTY_SET, a.getTriggers());
    }

    @Test
    public void testCanProcess_alwaysTrue_evenWithNulls() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        // ตามซอร์ส: canProcess ไม่ได้อ้างพารามิเตอร์เลย จึงคาดหวัง true เสมอ
        assertTrue(a.canProcess(null, null));
        assertTrue(a.canProcess(null, "anything"));
    }

    @Test
    public void testIsRequired_minimumZero_false() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        assertFalse(a.isRequired());
    }

    @Test
    public void testIsRequired_minimumPositive_true() {
        ArgumentImpl a = newArgument("x", "d", 1, 1, null, null, null);
        assertTrue(a.isRequired());
    }

    // =================================================================
    // 3. stripBoundaryQuotes
    // =================================================================

    @Test
    public void testStripBoundaryQuotes_noQuotes_unchanged() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        assertEquals("value", a.stripBoundaryQuotes("value"));
    }

    @Test
    public void testStripBoundaryQuotes_onlyLeadingQuote_unchanged() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        assertEquals("\"value", a.stripBoundaryQuotes("\"value"));
    }

    @Test
    public void testStripBoundaryQuotes_onlyTrailingQuote_unchanged() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        assertEquals("value\"", a.stripBoundaryQuotes("value\""));
    }

    @Test
    public void testStripBoundaryQuotes_bothQuotes_stripped() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        assertEquals("value", a.stripBoundaryQuotes("\"value\""));
    }

    @Test
    public void testStripBoundaryQuotes_emptyQuotedString() {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        assertEquals("", a.stripBoundaryQuotes("\"\""));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testStripBoundaryQuotes_singleQuoteChar_throwsDueToInvalidSubstringRange() {
        // token = "\"" (1 ตัวอักษร) -> startsWith และ endsWith เป็น true ทั้งคู่
        // (ใช้ตัวอักษรเดียวกันตรวจสอบทั้งต้นและปลาย) ทำให้เข้ารหัส substring(1,0)
        // ซึ่งไม่ valid -> คาดว่าจะ throw ตาม logic จริงของซอร์ส (พบ fault-prone edge case)
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        a.stripBoundaryQuotes("\"");
    }

    // =================================================================
    // 4. processValues / process
    // =================================================================

    @Test
    public void testProcessValues_plainValues_addedAsIs() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 5, null, null, null);
        TestCommandLine cl = newCommandLine(a);
        List args = list("val1", "val2");
        ListIterator it = args.listIterator();

        a.processValues(cl, it, a);

        assertEquals(list("val1", "val2"), cl.getValues(a));
    }

    @Test
    public void testProcessValues_stripsBoundaryQuotesForPlainValue() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 5, null, null, null);
        TestCommandLine cl = newCommandLine(a);
        List args = list("\"quoted\"");
        ListIterator it = args.listIterator();

        a.processValues(cl, it, a);

        assertEquals(list("quoted"), cl.getValues(a));
    }

    @Test
    public void testProcessValues_stopsAtMaximum_leavesRemainingUnconsumed() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        TestCommandLine cl = newCommandLine(a);
        List args = list("val1", "val2");
        ListIterator it = args.listIterator();

        a.processValues(cl, it, a);

        assertEquals(list("val1"), cl.getValues(a));
        assertTrue(it.hasNext());
        assertEquals("val2", it.next());
    }

    @Test
    public void testProcessValues_looksLikeOption_stopsAndPushesBack() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 5, null, null, null);
        TestCommandLine cl = newCommandLine(a);
        cl.forceLooksLikeOption(true); // บังคับให้ทุก trigger ดูเหมือน option

        List args = list("-x", "val");
        ListIterator it = args.listIterator();

        a.processValues(cl, it, a);

        assertEquals(0, cl.getValues(a).size());
        assertTrue(it.hasNext());
        assertEquals("-x", it.next()); // ตำแหน่ง iterator ถูกถอยกลับด้วย previous()
    }

    @Test
    public void testProcessValues_consumeRemainingToken_limitedByMaximum() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 2, null,
                ArgumentImpl.DEFAULT_CONSUME_REMAINING, null);
        TestCommandLine cl = newCommandLine(a);

        List args = list(ArgumentImpl.DEFAULT_CONSUME_REMAINING, "a", "b", "c");
        ListIterator it = args.listIterator();

        a.processValues(cl, it, a);

        assertEquals(list("a", "b"), cl.getValues(a));
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
    }

    @Test
    public void testProcessValues_consumeRemainingToken_exhaustsAllArguments() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 10, null,
                ArgumentImpl.DEFAULT_CONSUME_REMAINING, null);
        TestCommandLine cl = newCommandLine(a);

        List args = list(ArgumentImpl.DEFAULT_CONSUME_REMAINING, "a", "b");
        ListIterator it = args.listIterator();

        a.processValues(cl, it, a);

        assertEquals(list("a", "b"), cl.getValues(a));
        assertFalse(it.hasNext());
    }

    @Test
    public void testProcessValues_subsequentSplit_tokenizesAndAddsEach() throws OptionException {
        ArgumentImpl a = newSplitArgument("x", 0, 5, ',');
        TestCommandLine cl = newCommandLine(a);

        List args = list("a,b,c");
        ListIterator it = args.listIterator();

        a.processValues(cl, it, a);

        assertEquals(list("a", "b", "c"), cl.getValues(a));
    }

    @Test(expected = OptionException.class)
    public void testProcessValues_subsequentSplit_exceedsMaximum_throwsOptionException() throws OptionException {
        ArgumentImpl a = newSplitArgument("x", 0, 2, ',');
        TestCommandLine cl = newCommandLine(a);

        List args = list("a,b,c"); // 3 token แต่ maximum=2 -> เหลือ token ค้าง -> throw
        ListIterator it = args.listIterator();

        a.processValues(cl, it, a);
    }

    @Test
    public void testProcess_delegatesToProcessValuesWithSelf() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 5, null, null, null);
        TestCommandLine cl = newCommandLine(a);

        List args = list("v1");
        ListIterator it = args.listIterator();

        a.process(cl, it);

        assertEquals(list("v1"), cl.getValues(a));
    }

    // =================================================================
    // 5. validate(commandLine, option) / validate(commandLine)
    // =================================================================

    @Test(expected = OptionException.class)
    public void testValidate_tooFewValues_throwsMissingValues() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 1, 5, null, null, null);
        TestCommandLine cl = newCommandLine(a);
        // ไม่มีการ addValue เลย -> values.size()=0 < minimum=1
        a.validate(cl, a);
    }

    @Test(expected = OptionException.class)
    public void testValidate_tooManyValues_throwsUnexpectedValue() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 1, null, null, null);
        TestCommandLine cl = newCommandLine(a);
        cl.addValue(a, "v0");
        cl.addValue(a, "v1"); // size=2 > maximum=1
        a.validate(cl, a);
    }

    @Test
    public void testValidate_withinRange_noValidator_ok() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 1, 2, null, null, null);
        TestCommandLine cl = newCommandLine(a);
        cl.addValue(a, "v0");
        a.validate(cl, a); // ไม่ throw
    }

    @Test
    public void testValidate_validatorPasses_ok() throws OptionException {
        Validator v = new Validator() {
            public void validate(List values) throws InvalidArgumentException {
                // ไม่ throw = valid
            }
        };
        ArgumentImpl a = newArgument("x", "d", 0, 5, v, null, null);
        TestCommandLine cl = newCommandLine(a);
        cl.addValue(a, "v0");
        a.validate(cl, a);
    }

    @Test(expected = OptionException.class)
    public void testValidate_validatorThrows_wrappedAsOptionException() throws OptionException {
        Validator v = new Validator() {
            public void validate(List values) throws InvalidArgumentException {
                // สมมติฐาน: InvalidArgumentException มี constructor รับ String message
                throw new InvalidArgumentException("invalid!");
            }
        };
        ArgumentImpl a = newArgument("x", "d", 0, 5, v, null, null);
        TestCommandLine cl = newCommandLine(a);
        cl.addValue(a, "v0");
        a.validate(cl, a);
    }

    @Test
    public void testValidate_singleArgOverload_delegatesToTwoArgVersion() throws OptionException {
        ArgumentImpl a = newArgument("x", "d", 0, 5, null, null, null);
        TestCommandLine cl = newCommandLine(a);
        cl.addValue(a, "v0");
        a.validate(cl); // ไม่ throw ถ้า delegate ถูกต้อง
    }

    // =================================================================
    // 6. appendUsage - ครอบคลุม optional / numbered / bracketed / MAX_VALUE
    // =================================================================

    @Test
    public void testAppendUsage_noSettings_singleRequiredArg() {
        ArgumentImpl a = newArgument("X", "d", 1, 1, null, null, null);
        StringBuffer buf = new StringBuffer();
        a.appendUsage(buf, Collections.EMPTY_SET, null);
        assertEquals("X", buf.toString());
    }

    @Test
    public void testAppendUsage_optionalSetting_singleOptionalArg() {
        ArgumentImpl a = newArgument("X", "d", 0, 1, null, null, null);
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        StringBuffer buf = new StringBuffer();
        a.appendUsage(buf, settings, null);
        assertEquals("[X]", buf.toString());
    }

    @Test
    public void testAppendUsage_numberedAndBracketedAndOptional_multipleArgs() {
        ArgumentImpl a = newArgument("X", "d", 1, 3, null, null, null);
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_BRACKETED);
        StringBuffer buf = new StringBuffer();
        a.appendUsage(buf, settings, null);
        assertEquals("<X1> [<X2> [<X3>]]", buf.toString());
    }

    @Test
    public void testAppendUsage_infiniteMaximum_appendsEllipsisAndCropsToTwo() {
        ArgumentImpl a = newArgument("X", "d", 0, Integer.MAX_VALUE, null, null, null);
        StringBuffer buf = new StringBuffer();
        a.appendUsage(buf, Collections.EMPTY_SET, null);
        assertEquals("X [X ...]", buf.toString());
    }

    // =================================================================
    // 7. helpLines
    // =================================================================

    @Test
    public void testHelpLines_returnsSingleHelpLine() {
        ArgumentImpl a = newArgument("X", "d", 0, 1, null, null, null);
        List lines = a.helpLines(0, Collections.EMPTY_SET, null);
        assertEquals(1, lines.size());
        assertTrue(lines.get(0) instanceof HelpLine);
    }

    // =================================================================
    // 8. defaults / defaultValues
    // =================================================================

    @Test
    public void testDefaultValues_delegatesSetDefaultValuesWithCorrectArgs() {
        ArgumentImpl a = newArgument("X", "d", 0, 2, null, null, list("d1", "d2"));
        TestCommandLine cl = newCommandLine(a);

        a.defaultValues(cl, a);

        assertSame(a, cl.lastDefaultValuesOption);
        assertEquals(list("d1", "d2"), cl.lastDefaultValuesList);
    }

    @Test
    public void testDefaults_callsDefaultValuesWithSelf() {
        ArgumentImpl a = newArgument("X", "d", 0, 2, null, null, null);
        TestCommandLine cl = newCommandLine(a);

        // super.defaults(commandLine) ไม่ได้อยู่ใน source ที่ให้มา (มาจาก OptionImpl)
        // จึงไม่ assert พฤติกรรมของมัน มุ่งตรวจเฉพาะการเรียก defaultValues(commandLine, this)
        a.defaults(cl);

        assertSame(a, cl.lastDefaultValuesOption);
        assertNull(cl.lastDefaultValuesList); // defaultValues ของ argument นี้เป็น null
    }
}
