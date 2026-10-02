package org.apache.commons.cli2.option;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.option.GroupImpl;

/**
 * JUnit4 test สำหรับ org.apache.commons.cli2.option.GroupImpl (Defects4J Cli-21b)
 *
 * ใช้ Stub ของ Option / Argument / WriteableCommandLine เพื่อ isolate การทดสอบ
 * เฉพาะ logic ภายใน GroupImpl เท่านั้น (ไม่พึ่งพา implementation จริงของ
 * DefaultOption/ArgumentImpl/WriteableCommandLineImpl ที่ไม่ได้ให้ source มา)
 */
public class GroupImplTest {

    // ===================== Helper methods =====================

    private static List list(Object... items) {
        return new ArrayList(Arrays.asList(items));
    }

    private static Set setOf(String... items) {
        return new HashSet(Arrays.asList(items));
    }

    private static Set flags(Object... ds) {
        return new HashSet(Arrays.asList(ds));
    }

    /** Comparator เรียงตาม preferredName (ใช้ทดสอบ branch comp != null) */
    private static final Comparator BY_NAME = new Comparator() {
        public int compare(Object o1, Object o2) {
            return ((Option) o1).getPreferredName().compareTo(((Option) o2).getPreferredName());
        }
    };

    // ===================== Stub Option =====================

    /**
     * Stub ของ Option: method ที่ implement ทั้งหมด มาจากการเรียกใช้จริง
     * ที่พบใน source ของ GroupImpl (setParent, getTriggers, getPrefixes,
     * canProcess(cl,String), process(cl,ListIterator), validate, appendUsage,
     * helpLines, defaults, isRequired, getPreferredName, findOption)
     */
    private static class StubOption implements Option {
        final String preferredName;
        final String description;
        Set triggers;
        Set prefixes;
        boolean required;
        Option parent;

        boolean canProcessStringResult;
        boolean consumeOnProcess = true;
        boolean processCalled;
        boolean validateCalled;
        boolean defaultsCalled;
        Option findOptionResult;
        List helpLinesResult = new ArrayList();
        int lastHelpLinesDepth = -1;

        StubOption(String preferredName) {
            this(preferredName, Collections.EMPTY_SET, Collections.EMPTY_SET, false);
        }

        StubOption(String preferredName, Set triggers, Set prefixes, boolean required) {
            this.preferredName = preferredName;
            this.description = "desc-" + preferredName;
            this.triggers = triggers;
            this.prefixes = prefixes;
            this.required = required;
        }

        public String getPreferredName() { return preferredName; }
        public String getDescription() { return description; }
        public Set getTriggers() { return triggers; }
        public Set getPrefixes() { return prefixes; }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return canProcessStringResult;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments)
                throws OptionException {
            processCalled = true;
            if (consumeOnProcess && arguments.hasNext()) {
                arguments.next(); // จำลอง option ที่ "กิน" token ของตัวเอง
            }
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            validateCalled = true;
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            buffer.append(preferredName);
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            lastHelpLinesDepth = depth;
            return helpLinesResult;
        }

        public void defaults(WriteableCommandLine commandLine) {
            defaultsCalled = true;
        }

        public boolean isRequired() { return required; }

        public void setParent(Option parent) { this.parent = parent; }

        // เพิ่มเสริมแบบ defensive (ไม่ยืนยันว่ามีใน interface จริง) - ไม่ใส่ @Override
        public Option getParent() { return parent; }
        public int getId() { return 0; }

        public Option findOption(String trigger) { return findOptionResult; }
    }

    /**
     * Stub ของ Argument: เพิ่ม method canProcess(cl, ListIterator) ซึ่งพิสูจน์ได้
     * จากซอร์ส GroupImpl.process() ที่เรียก argument.canProcess(commandLine, arguments)
     */
    private static class StubArgument extends StubOption implements Argument {
        boolean canProcessListResult;

        StubArgument(String preferredName) {
            super(preferredName);
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            return canProcessListResult;
        }
    }

    // ===================== Stub WriteableCommandLine =====================

    /**
     * Stub ของ WriteableCommandLine: implement เฉพาะ 2 method ที่ GroupImpl
     * เรียกใช้จริง คือ hasOption(Option) และ looksLikeOption(String)
     */
    private static class StubCommandLine implements WriteableCommandLine {
        boolean looksLikeOptionResult;
        final Set present = new HashSet();

        public boolean looksLikeOption(String trigger) { return looksLikeOptionResult; }

        public boolean hasOption(Option option) { return present.contains(option); }

        void markPresent(Option option) { present.add(option); }
    }

    private StubCommandLine cl;

    @Before
    public void setUp() {
        cl = new StubCommandLine();
    }

    // ===================== 1) Constructor =====================

    @Test
    public void testConstructor_separatesOptionsAndArguments() {
        StubOption a = new StubOption("-a", setOf("-a"), setOf("-"), false);
        StubOption b = new StubOption("-b", setOf("-b", "--bbb"), setOf("-", "--"), true);
        StubArgument arg = new StubArgument("ARGX");

        List input = list(a, b, arg);
        GroupImpl group = new GroupImpl(input, "grp", "desc", 1, 2, true);

        assertEquals(Arrays.asList(a, b), group.getOptions());
        assertEquals(Collections.singletonList(arg), group.getAnonymous());

        assertEquals(3, group.getTriggers().size());
        assertTrue(group.getTriggers().containsAll(Arrays.asList("-a", "-b", "--bbb")));

        assertTrue(group.getPrefixes().containsAll(Arrays.asList("-", "--")));

        assertEquals("grp", group.getPreferredName());
        assertEquals("desc", group.getDescription());
        assertEquals(1, group.getMinimum());
        assertEquals(2, group.getMaximum());

        // setParent ถูกเรียกกับทุก option (รวม Argument) ก่อนตรวจ instanceof
        assertSame(group, a.parent);
        assertSame(group, b.parent);
        assertSame(group, arg.parent);
    }

    @Test
    public void testConstructor_emptyList() {
        GroupImpl group = new GroupImpl(new ArrayList(), null, null, 0, 0, false);
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
        assertTrue(group.getTriggers().isEmpty());
        assertTrue(group.getPrefixes().isEmpty());
        assertNull(group.getPreferredName());
        assertNull(group.getDescription());
    }

    @Test
    public void testGetOptions_isUnmodifiable() {
        GroupImpl group = new GroupImpl(list(new StubOption("-a")), "g", "d", 0, 1, false);
        try {
            group.getOptions().add(new StubOption("-z"));
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ===================== 2) isRequired() =====================

    @Test
    public void testIsRequired_minimumZero_alwaysFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1, true);
        assertFalse(group.isRequired());
    }

    @Test
    public void testIsRequired_noParent_requiredTrue_minPositive() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 1, 1, true);
        assertTrue(group.isRequired());
    }

    /**
     * กรณีนี้ตรวจสอบ formula จริงใน source:
     * (getParent()==null || super.isRequired()) && getMinimum()>0
     * เมื่อไม่มี parent ผลลัพธ์จะเป็น true แม้ required=false ก็ตาม
     * (พฤติกรรมนี้อาจดูขัดสัญชาตญาณ แต่เป็นไปตาม logic จริงของ source ที่ให้มา)
     */
    @Test
    public void testIsRequired_noParent_requiredFalse_minPositive_stillTrue() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 1, 1, false);
        assertTrue(group.isRequired());
    }

    @Test
    public void testIsRequired_withParent_notRequired_minPositive_isFalse() {
        GroupImpl inner = new GroupImpl(new ArrayList(), "inner", "d", 1, 2, false);
        GroupImpl outer = new GroupImpl(list(inner), "outer", "d", 0, 5, false);
        assertFalse(inner.isRequired());
    }

    @Test
    public void testIsRequired_withParent_required_minPositive_isTrue() {
        GroupImpl inner = new GroupImpl(new ArrayList(), "inner", "d", 1, 2, true);
        GroupImpl outer = new GroupImpl(list(inner), "outer", "d", 0, 5, false);
        assertTrue(inner.isRequired());
    }

    @Test
    public void testIsRequired_withParent_required_minZero_isFalse() {
        GroupImpl inner = new GroupImpl(new ArrayList(), "inner", "d", 0, 2, true);
        GroupImpl outer = new GroupImpl(list(inner), "outer", "d", 0, 5, false);
        assertFalse(inner.isRequired());
    }

    // ===================== 3) canProcess() =====================

    @Test
    public void testCanProcess_nullArg_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1, false);
        assertFalse(group.canProcess(null, null));
    }

    @Test
    public void testCanProcess_exactTriggerMatch_returnsTrue() {
        StubOption a = new StubOption("-a", setOf("-a"), setOf("-"), false);
        GroupImpl group = new GroupImpl(list(a), "g", "d", 0, 1, false);
        // ไม่แตะ commandLine เลยในสาขานี้ จึงส่ง null ได้ปลอดภัย
        assertTrue(group.canProcess(null, "-a"));
    }

    @Test
    public void testCanProcess_burstingFound_returnsTrue() {
        StubOption b = new StubOption("-a", setOf("-a"), setOf("-"), false);
        b.canProcessStringResult = true;
        GroupImpl group = new GroupImpl(list(b), "g", "d", 0, 1, false);
        // "-x" ไม่ตรง key ตรง ๆ แต่จะอยู่ใน tailMap("-x") ตาม ReverseStringComparator
        assertTrue(group.canProcess(null, "-x"));
    }

    @Test
    public void testCanProcess_looksLikeOption_noAnonymous_returnsFalse() {
        StubOption c = new StubOption("-a", setOf("-a"), setOf("-"), false);
        c.canProcessStringResult = false;
        GroupImpl group = new GroupImpl(list(c), "g", "d", 0, 1, false);
        cl.looksLikeOptionResult = true;
        assertFalse(group.canProcess(cl, "-x"));
    }

    @Test
    public void testCanProcess_notLooksLikeOption_hasAnonymous_returnsTrue() {
        StubOption c = new StubOption("-a", setOf("-a"), setOf("-"), false);
        c.canProcessStringResult = false;
        StubArgument arg = new StubArgument("ARG");
        GroupImpl group = new GroupImpl(list(c, arg), "g", "d", 0, 1, false);
        cl.looksLikeOptionResult = false;
        assertTrue(group.canProcess(cl, "-x"));
    }

    @Test
    public void testCanProcess_notLooksLikeOption_noAnonymous_returnsFalse() {
        StubOption c = new StubOption("-a", setOf("-a"), setOf("-"), false);
        c.canProcessStringResult = false;
        GroupImpl group = new GroupImpl(list(c), "g", "d", 0, 1, false);
        cl.looksLikeOptionResult = false;
        assertFalse(group.canProcess(cl, "-x"));
    }

    // ===================== 4) process() =====================

    @Test
    public void testProcess_emptyArguments_noException() throws OptionException {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1, false);
        group.process(cl, list().listIterator());
        // ไม่มี exception ถือว่าผ่าน
    }

    @Test
    public void testProcess_optionFound_directMatch() throws OptionException {
        StubOption a = new StubOption("-a", setOf("-a"), setOf("-"), false);
        GroupImpl group = new GroupImpl(list(a), "g", "d", 0, 1, false);
        List args = list("-a");
        group.process(cl, args.listIterator());
        assertTrue(a.processCalled);
    }

    /**
     * ทดสอบ guard "arg == previous": option ที่ไม่ consume token ของตัวเอง
     * ต้องไม่ทำให้ loop วน infinite - GroupImpl ต้อง break ออกมาอย่างปลอดภัย
     */
    @Test
    public void testProcess_nonConsumingOption_breaksViaArgEqualsPrevious() throws OptionException {
        StubOption n = new StubOption("-n", setOf("-n"), setOf("-"), false);
        n.consumeOnProcess = false;
        GroupImpl group = new GroupImpl(list(n), "g", "d", 0, 1, false);
        List args = list("-n");
        ListIterator it = args.listIterator();
        group.process(cl, it); // ต้อง return ปกติ ไม่ infinite loop
        assertTrue(n.processCalled);
    }

    @Test
    public void testProcess_burstingFound() throws OptionException {
        StubOption b = new StubOption("-a", setOf("-a"), setOf("-"), false);
        b.canProcessStringResult = true;
        GroupImpl group = new GroupImpl(list(b), "g", "d", 0, 1, false);
        List args = list("-x");
        group.process(cl, args.listIterator());
        assertTrue(b.processCalled);
    }

    @Test
    public void testProcess_looksLikeOption_burstingNotFound_rollbackAndReturn() throws OptionException {
        StubOption c = new StubOption("-a", setOf("-a"), setOf("-"), false);
        c.canProcessStringResult = false;
        GroupImpl group = new GroupImpl(list(c), "g", "d", 0, 1, false);
        cl.looksLikeOptionResult = true;

        List args = list("-x");
        ListIterator it = args.listIterator();
        group.process(cl, it);

        assertFalse(c.processCalled);
        // ต้อง rollback กลับไปที่ตำแหน่งเดิม
        assertTrue(it.hasNext());
        assertEquals("-x", it.next());
    }

    @Test
    public void testProcess_notOption_noAnonymous_breaks() throws OptionException {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1, false);
        cl.looksLikeOptionResult = false;

        List args = list("value");
        ListIterator it = args.listIterator();
        group.process(cl, it);

        assertTrue(it.hasNext());
        assertEquals("value", it.next());
    }

    @Test
    public void testProcess_notOption_anonymousRejects_noInfiniteLoop() throws OptionException {
        StubArgument arg = new StubArgument("ARG");
        arg.canProcessListResult = false;
        GroupImpl group = new GroupImpl(list(arg), "g", "d", 0, 1, false);
        cl.looksLikeOptionResult = false;

        List args = list("val");
        group.process(cl, args.listIterator());
        assertFalse(arg.processCalled);
    }

    @Test
    public void testProcess_notOption_anonymousAccepts_bothConsumedInOneLoop() throws OptionException {
        StubArgument a1 = new StubArgument("A1");
        a1.canProcessListResult = true;
        StubArgument a2 = new StubArgument("A2");
        a2.canProcessListResult = true;
        GroupImpl group = new GroupImpl(list(a1, a2), "g", "d", 0, 1, false);
        cl.looksLikeOptionResult = false;

        List args = list("v1", "v2");
        ListIterator it = args.listIterator();
        group.process(cl, it);

        assertTrue(a1.processCalled);
        assertTrue(a2.processCalled);
        assertFalse(it.hasNext());
    }

    // ===================== 5) validate() =====================

    @Test
    public void testValidate_requiredNotPresent_stillValidated_noException() throws OptionException {
        StubOption a = new StubOption("-a", setOf("-a"), setOf("-"), true);
        GroupImpl group = new GroupImpl(list(a), "g", "d", 0, 1, false);
        group.validate(cl);
        assertTrue(a.validateCalled);
    }

    @Test
    public void testValidate_notRequiredNotPresent_notValidated() throws OptionException {
        StubOption b = new StubOption("-b", setOf("-b"), setOf("-"), false);
        GroupImpl group = new GroupImpl(list(b), "g", "d", 0, 1, false);
        group.validate(cl);
        assertFalse(b.validateCalled);
    }

    @Test
    public void testValidate_present_alwaysValidated() throws OptionException {
        StubOption c = new StubOption("-c", setOf("-c"), setOf("-"), false);
        cl.markPresent(c);
        GroupImpl group = new GroupImpl(list(c), "g", "d", 0, 1, false);
        group.validate(cl);
        assertTrue(c.validateCalled);
    }

    @Test(expected = OptionException.class)
    public void testValidate_exceedsMaximum_throwsAndStopsProcessingRest() throws OptionException {
        StubOption d1 = new StubOption("-d1", setOf("-d1"), setOf("-"), false);
        StubOption d2 = new StubOption("-d2", setOf("-d2"), setOf("-"), false);
        StubOption d3 = new StubOption("-d3", setOf("-d3"), setOf("-"), false);
        cl.markPresent(d1);
        cl.markPresent(d2);
        GroupImpl group = new GroupImpl(list(d1, d2, d3), "g", "d", 0, 1, false);
        try {
            group.validate(cl);
        } finally {
            assertTrue(d1.validateCalled);
            assertFalse(d2.validateCalled); // break เกิดก่อนถึงบรรทัด validate()
            assertFalse(d3.validateCalled); // loop ถูก break ไปแล้ว
        }
    }

    @Test(expected = OptionException.class)
    public void testValidate_belowMinimum_throws() throws OptionException {
        StubOption e1 = new StubOption("-e1", setOf("-e1"), setOf("-"), false);
        GroupImpl group = new GroupImpl(list(e1), "g", "d", 1, 5, false);
        group.validate(cl); // e1 ไม่ present -> present=0 < minimum=1
    }

    @Test
    public void testValidate_anonymousAlwaysValidated() throws OptionException {
        StubOption f = new StubOption("-f", setOf("-f"), setOf("-"), false);
        StubArgument arg = new StubArgument("ARG");
        GroupImpl group = new GroupImpl(list(f, arg), "g", "d", 0, 5, false);
        group.validate(cl);
        assertTrue(arg.validateCalled);
        assertFalse(f.validate