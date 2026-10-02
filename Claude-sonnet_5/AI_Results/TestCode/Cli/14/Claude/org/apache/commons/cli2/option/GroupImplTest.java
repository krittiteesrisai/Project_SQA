package org.apache.commons.cli2.option;

// import คลาสเป้าหมาย (อยู่ package เดียวกัน แต่ระบุ import ให้ชัดเจนตามข้อกำหนด)
import org.apache.commons.cli2.option.GroupImpl;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Group;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class GroupImplTest {

    // ===================== Helper =====================

    private static Set triggerSet(String trigger) {
        Set s = new HashSet();
        s.add(trigger);
        return s;
    }

    // ===================== Fake Option =====================
    // สมมติฐาน: Option มีเมธอดตามที่ระบุไว้ในหัวข้อคำอธิบายด้านบน
    static class FakeOption implements Option {
        private final String preferredName;
        private final Set triggers;
        private final Set prefixes;
        private boolean required = false;

        boolean canProcessResult = false;
        boolean canProcessCalled = false;
        int processCallCount = 0;
        int validateCallCount = 0;
        int defaultsCallCount = 0;
        Option findOptionResult = null;
        String appendUsageMarker = "OPT";
        boolean appendUsageCalled = false;
        List helpLinesResult = new ArrayList();
        boolean throwOnValidate = false;

        FakeOption(String preferredName, Set triggers, Set prefixes) {
            this.preferredName = preferredName;
            this.triggers = triggers;
            this.prefixes = prefixes;
        }

        void setRequired(boolean r) { required = r; }

        // สมมติว่ามีอยู่ใน Option interface (ไม่ได้ถูกเรียกใน GroupImpl โดยตรง)
        public int getId() { return 0; }

        public Set getTriggers() { return triggers; }
        public Set getPrefixes() { return prefixes; }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            canProcessCalled = true;
            return canProcessResult;
        }

        public void process(WriteableCommandLine commandLine, ListIterator arguments)
                throws OptionException {
            processCallCount++;
            // จำลอง option ธรรมดาที่ consume token ของตัวเอง 1 ตัว (trigger)
            if (arguments.hasNext()) {
                arguments.next();
            }
        }

        public boolean isRequired() { return required; }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            validateCallCount++;
            if (throwOnValidate) {
                // สมมติ constructor (Option, String) ตามที่ GroupImpl ใช้จริง
                throw new OptionException(this, "TEST_ERROR");
            }
        }

        public String getPreferredName() { return preferredName; }
        public String getDescription() { return "desc-" + preferredName; }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            appendUsageCalled = true;
            buffer.append(appendUsageMarker);
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return helpLinesResult;
        }

        public void defaults(WriteableCommandLine commandLine) {
            defaultsCallCount++;
        }

        public Option findOption(String trigger) {
            return findOptionResult;
        }

        public String toString() { return preferredName; }
    }

    // ===================== Fake Argument =====================
    static class FakeArgument extends FakeOption implements Argument {
        boolean canProcessListResult = false;
        int canProcessListCallCount = 0;

        FakeArgument(String name) {
            super(name, new HashSet(), new HashSet());
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            canProcessListCallCount++;
            return canProcessListResult;
        }
    }

    // ===================== Fake Group (child option ที่เป็น Group) =====================
    static class FakeGroupOption extends FakeOption implements Group {
        private final List groupOptions = new ArrayList();
        private final List groupAnonymous = new ArrayList();
        private int min = 0;
        private int max = Integer.MAX_VALUE;

        FakeGroupOption(String name) {
            super(name, new HashSet(), new HashSet());
        }

        public List getOptions() { return groupOptions; }
        public List getAnonymous() { return groupAnonymous; }
        public int getMinimum() { return min; }
        public int getMaximum() { return max; }
    }

    // ===================== Fake WriteableCommandLine =====================
    static class FakeWriteableCommandLine implements WriteableCommandLine {
        boolean defaultLooksLikeOption = false;
        final Set optionsPresent = new HashSet();

        public boolean looksLikeOption(String trigger) {
            return defaultLooksLikeOption;
        }

        public boolean hasOption(Option option) {
            return optionsPresent.contains(option);
        }
    }

    // =====================================================================
    // Constructor
    // =====================================================================

    @Test
    public void testConstructor_separatesArgumentsFromOptions() {
        FakeOption opt = new FakeOption("-a", triggerSet("-a"), new HashSet());
        FakeArgument arg = new FakeArgument("arg1");
        List input = new ArrayList();
        input.add(opt);
        input.add(arg);

        GroupImpl group = new GroupImpl(input, "g", "desc", 0, 2);

        assertEquals(1, group.getOptions().size());
        assertSame(opt, group.getOptions().get(0));
        assertEquals(1, group.getAnonymous().size());
        assertSame(arg, group.getAnonymous().get(0));
        assertTrue(group.getTriggers().contains("-a"));
    }

    @Test
    public void testConstructor_emptyOptions() {
        GroupImpl group = new GroupImpl(new ArrayList(), null, null, 0, 0);
        assertTrue(group.getOptions().isEmpty());
        assertTrue(group.getAnonymous().isEmpty());
        assertTrue(group.getTriggers().isEmpty());
        assertTrue(group.getPrefixes().isEmpty());
    }

    @Test
    public void testConstructor_collectsPrefixes() {
        Set prefixesA = new HashSet();
        prefixesA.add("-");
        Set prefixesB = new HashSet();
        prefixesB.add("--");
        FakeOption a = new FakeOption("-a", triggerSet("-a"), prefixesA);
        FakeOption b = new FakeOption("--b", triggerSet("--b"), prefixesB);
        List input = new ArrayList();
        input.add(a);
        input.add(b);

        GroupImpl group = new GroupImpl(input, "g", "d", 0, 2);

        assertEquals(2, group.getPrefixes().size());
        assertTrue(group.getPrefixes().contains("-"));
        assertTrue(group.getPrefixes().contains("--"));
    }

    @Test
    public void testConstructor_duplicateTriggerLastOptionWinsInMap() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        FakeOption b = new FakeOption("-a2", triggerSet("-a"), new HashSet());
        List input = new ArrayList();
        input.add(a);
        input.add(b);

        GroupImpl group = new GroupImpl(input, "g", "d", 0, 2);

        // key เดียวกันถูก put ทับ -> ขนาด trigger set = 1
        assertEquals(1, group.getTriggers().size());
    }

    // =====================================================================
    // canProcess
    // =====================================================================

    @Test
    public void testCanProcess_nullArg_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 0);
        assertFalse(group.canProcess(new FakeWriteableCommandLine(), null));
    }

    @Test
    public void testCanProcess_exactTriggerMatch_returnsTrue() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);

        assertTrue(group.canProcess(new FakeWriteableCommandLine(), "-a"));
    }

    @Test
    public void testCanProcess_burstingMatchViaTailMap_returnsTrue() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.canProcessResult = true;
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);

        assertTrue(group.canProcess(new FakeWriteableCommandLine(), "-ab"));
        assertTrue(a.canProcessCalled);
    }

    @Test
    public void testCanProcess_looksLikeOptionButNoMemberMatches_returnsFalse() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.canProcessResult = false;
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);

        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.defaultLooksLikeOption = true;

        assertFalse(group.canProcess(cl, "-ab"));
    }

    @Test
    public void testCanProcess_notOptionLike_withAnonymous_returnsTrue() {
        FakeArgument arg = new FakeArgument("value");
        List input = new ArrayList();
        input.add(arg);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);

        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.defaultLooksLikeOption = false;

        assertTrue(group.canProcess(cl, "value"));
    }

    @Test
    public void testCanProcess_notOptionLike_noAnonymous_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1);
        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.defaultLooksLikeOption = false;

        assertFalse(group.canProcess(cl, "value"));
    }

    // =====================================================================
    // process()
    // =====================================================================

    @Test
    public void testProcess_emptyArguments_doesNothing() throws OptionException {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1);
        List tokens = new ArrayList();
        group.process(new FakeWriteableCommandLine(), tokens.listIterator());
        // ไม่ throw exception
    }

    @Test
    public void testProcess_exactTriggerMatch_callsOptionProcess() throws OptionException {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 5);

        List tokens = new ArrayList();
        tokens.add("-a");

        group.process(new FakeWriteableCommandLine(), tokens.listIterator());

        assertEquals(1, a.processCallCount);
    }

    /**
     * ทดสอบพฤติกรรมจริงของบั๊กที่อาจเกิดจากการใช้ (arg == previous) ซึ่งเป็น reference
     * equality แทน .equals(). เนื่องจาก String literal ถูก intern ตัวแปรอ้างอิงเดียวกัน
     * เมื่อ token คำเดิมปรากฏซ้ำติดกัน ลูปจะหยุดกลางคันโดยไม่ throw exception และ
     * token ตัวที่สองจะไม่ถูกประมวลผล — พฤติกรรมนี้สืบมาจากการไล่ตามซอร์สโดยตรง
     * ไม่ได้เดา behavior เพิ่มเติม
     */
    @Test
    public void testProcess_duplicateConsecutiveToken_stopsDueToReferenceEqualityCheck()
            throws OptionException {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 5);

        List tokens = new ArrayList();
        tokens.add("-a");
        tokens.add("-a"); // literal เดียวกัน -> reference เดียวกัน (String pool)
        ListIterator it = tokens.listIterator();

        group.process(new FakeWriteableCommandLine(), it);

        assertEquals(1, a.processCallCount);
        assertTrue(it.hasNext()); // token ตัวที่สองยังไม่ถูก consume
    }

    @Test
    public void testProcess_burstArgument_memberOptionFoundAndProcessed() throws OptionException {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.canProcessResult = true;
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 5);

        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.defaultLooksLikeOption = true;

        List tokens = new ArrayList();
        tokens.add("-ab");

        group.process(cl, tokens.listIterator());

        assertEquals(1, a.processCallCount);
    }

    @Test
    public void testProcess_looksLikeOption_noMemberCanProcess_abortsGroup() throws OptionException {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.canProcessResult = false;
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 5);

        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.defaultLooksLikeOption = true;

        List tokens = new ArrayList();
        tokens.add("-zz");
        ListIterator it = tokens.listIterator();

        group.process(cl, it);

        assertEquals(0, a.processCallCount);
        assertEquals("-zz", it.next()); // ตำแหน่งถูก rollback กลับก่อน token
    }

    @Test
    public void testProcess_notOptionLike_noAnonymous_breaksLoop() throws OptionException {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 5);
        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.defaultLooksLikeOption = false;

        List tokens = new ArrayList();
        tokens.add("value");
        ListIterator it = tokens.listIterator();

        group.process(cl, it);

        assertEquals("value", it.next()); // rollback แล้ว break
    }

    @Test
    public void testProcess_notOptionLike_withAnonymous_processesArgument() throws OptionException {
        FakeArgument arg1 = new FakeArgument("arg1");
        arg1.canProcessListResult = false;
        FakeArgument arg2 = new FakeArgument("arg2");
        arg2.canProcessListResult = true;

        List input = new ArrayList();
        input.add(arg1);
        input.add(arg2);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 5);

        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.defaultLooksLikeOption = false;

        List tokens = new ArrayList();
        tokens.add("value");

        group.process(cl, tokens.listIterator());

        assertEquals(1, arg1.canProcessListCallCount);
        assertEquals(1, arg2.canProcessListCallCount);
        assertEquals(0, arg1.processCallCount);
        assertEquals(1, arg2.processCallCount);
    }

    // =====================================================================
    // validate()
    // =====================================================================

    @Test
    public void testValidate_requiredOption_alwaysValidatedEvenIfNotPresent() throws OptionException {
        FakeOption required = new FakeOption("-r", triggerSet("-r"), new HashSet());
        required.setRequired(true);
        List input = new ArrayList();
        input.add(required);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 5);

        group.validate(new FakeWriteableCommandLine());

        assertEquals(1, required.validateCallCount);
    }

    @Test
    public void testValidate_childGroupOption_alwaysValidated() throws OptionException {
        FakeGroupOption childGroup = new FakeGroupOption("sub");
        childGroup.setRequired(false);
        List input = new ArrayList();
        input.add(childGroup);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 5);

        group.validate(new FakeWriteableCommandLine());

        assertEquals(1, childGroup.validateCallCount);
    }

    @Test
    public void testValidate_optionPresent_validatedAgain_noException() throws OptionException {
        FakeOption opt = new FakeOption("-a", triggerSet("-a"), new HashSet());
        opt.setRequired(false);
        List input = new ArrayList();
        input.add(opt);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);

        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.optionsPresent.add(opt);

        group.validate(cl);

        assertEquals(1, opt.validateCallCount);
    }

    @Test(expected = OptionException.class)
    public void testValidate_presentExceedsMaximum_throwsOptionException() throws OptionException {
        FakeOption opt1 = new FakeOption("-a", triggerSet("-a"), new HashSet());
        FakeOption opt2 = new FakeOption("-b", triggerSet("-b"), new HashSet());
        List input = new ArrayList();
        input.add(opt1);
        input.add(opt2);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1); // maximum = 1

        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.optionsPresent.add(opt1);
        cl.optionsPresent.add(opt2);

        group.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_maximumZeroBoundary_anyPresentThrowsImmediately() throws OptionException {
        FakeOption opt = new FakeOption("-a", triggerSet("-a"), new HashSet());
        List input = new ArrayList();
        input.add(opt);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 0); // maximum = 0

        FakeWriteableCommandLine cl = new FakeWriteableCommandLine();
        cl.optionsPresent.add(opt);

        group.validate(cl);
    }

    @Test(expected = OptionException.class)
    public void testValidate_presentBelowMinimum_throwsOptionException() throws OptionException {
        FakeOption opt = new FakeOption("-a", triggerSet("-a"), new HashSet());
        List input = new ArrayList();
        input.add(opt);
        GroupImpl group = new GroupImpl(input, "g", "d", 1, 5); // minimum = 1

        group.validate(new FakeWriteableCommandLine()); // ไม่มี option ใด present
    }

    @Test
    public void testValidate_anonymousArgumentsAlwaysValidated() throws OptionException {
        FakeArgument arg = new FakeArgument("arg");
        List input = new ArrayList();
        input.add(arg);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 5);

        group.validate(new FakeWriteableCommandLine());

        assertEquals(1, arg.validateCallCount);
    }

    // =====================================================================
    // getPreferredName / getDescription / getMinimum / getMaximum / isRequired
    // =====================================================================

    @Test
    public void testGetPreferredNameAndDescription() {
        GroupImpl group = new GroupImpl(new ArrayList(), "myGroup", "myDesc", 0, 1);
        assertEquals("myGroup", group.getPreferredName());
        assertEquals("myDesc", group.getDescription());
    }

    @Test
    public void testGetPreferredName_nullName() {
        GroupImpl group = new GroupImpl(new ArrayList(), null, "d", 0, 1);
        assertNull(group.getPreferredName());
    }

    @Test
    public void testGetMinimumMaximum() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 2, 4);
        assertEquals(2, group.getMinimum());
        assertEquals(4, group.getMaximum());
    }

    @Test
    public void testIsRequired_minimumZero_returnsFalse() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 4);
        assertFalse(group.isRequired());
    }

    @Test
    public void testIsRequired_minimumPositive_returnsTrue() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 1, 4);
        assertTrue(group.isRequired());
    }

    // =====================================================================
    // findOption
    // =====================================================================

    @Test
    public void testFindOption_foundInFirstOption_returnsIt() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.findOptionResult = a;
        FakeOption b = new FakeOption("-b", triggerSet("-b"), new HashSet());
        List input = new ArrayList();
        input.add(a);
        input.add(b);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 2);

        assertSame(a, group.findOption("-a"));
    }

    @Test
    public void testFindOption_notFound_returnsNull() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.findOptionResult = null;
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 2);

        assertNull(group.findOption("-x"));
    }

    @Test
    public void testFindOption_emptyOptions_returnsNull() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 2);
        assertNull(group.findOption("-x"));
    }

    // =====================================================================
    // defaults()
    // =====================================================================

    @Test
    public void testDefaults_callsChildAndAnonymousDefaults() {
        FakeOption opt = new FakeOption("-a", triggerSet("-a"), new HashSet());
        FakeArgument arg = new FakeArgument("v");
        List input = new ArrayList();
        input.add(opt);
        input.add(arg);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 2);

        group.defaults(new FakeWriteableCommandLine());

        assertEquals(1, opt.defaultsCallCount);
        assertEquals(1, arg.defaultsCallCount);
    }

    // =====================================================================
    // appendUsage (3-arg และ 4-arg)
    // =====================================================================

    @Test
    public void testAppendUsage_defaultSeparatorIsPipe() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.appendUsageMarker = "A";
        FakeOption b = new FakeOption("-b", triggerSet("-b"), new HashSet());
        b.appendUsageMarker = "B";
        List input = new ArrayList();
        input.add(a);
        input.add(b);
        GroupImpl group = new GroupImpl(input, null, "d", 0, 2); // name=null -> expanded เสมอ

        StringBuffer buf = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buf, settings, null);

        assertEquals("A|B", buf.toString());
    }

    @Test
    public void testAppendUsage_customSeparator() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.appendUsageMarker = "A";
        FakeOption b = new FakeOption("-b", triggerSet("-b"), new HashSet());
        b.appendUsageMarker = "B";
        List input = new ArrayList();
        input.add(a);
        input.add(b);
        GroupImpl group = new GroupImpl(input, null, "d", 0, 2);

        StringBuffer buf = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buf, settings, null, ",");

        assertEquals("A,B", buf.toString());
    }

    @Test
    public void testAppendUsage_optional_bracketAtVeryEnd_whenOuterAbsent() {
        FakeArgument arg = new FakeArgument("v");
        arg.appendUsageMarker = "ARG";
        List raw = new ArrayList();
        raw.add(arg);
        GroupImpl group = new GroupImpl(raw, null, "d", 0, 2);

        StringBuffer buf = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        // ไม่ใส่ DISPLAY_GROUP_OUTER -> outer=false

        group.appendUsage(buf, settings, null);

        assertEquals("[ ARG]", buf.toString());
    }

    @Test
    public void testAppendUsage_optional_bracketBeforeArguments_whenOuterPresent() {
        FakeArgument arg = new FakeArgument("v");
        arg.appendUsageMarker = "ARG";
        List raw = new ArrayList();
        raw.add(arg);
        GroupImpl group = new GroupImpl(raw, null, "d", 0, 2);

        StringBuffer buf = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);
        settings.add(DisplaySetting.DISPLAY_GROUP_OUTER);

        group.appendUsage(buf, settings, null);

        assertEquals("[] ARG", buf.toString());
    }

    @Test
    public void testAppendUsage_namedGroup_expanded_wrapsWithParentheses() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.appendUsageMarker = "A";
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "grp", "d", 1, 2); // minimum=1 -> optional=false

        StringBuffer buf = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        group.appendUsage(buf, settings, null);

        assertEquals("grp (A)", buf.toString());
    }

    @Test
    public void testAppendUsage_collapsedGroup_showsOnlyNameNoChildren() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.appendUsageMarker = "A";
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "grp", "d", 1, 2);

        StringBuffer buf = new StringBuffer();
        Set settings = new HashSet(); // ไม่มี DISPLAY_GROUP_EXPANDED, ไม่มี DISPLAY_GROUP_NAME

        group.appendUsage(buf, settings, null);

        assertEquals("grp", buf.toString());
        assertFalse(a.appendUsageCalled); // expanded=false -> ไม่เข้าไปเรียก option ลูก
    }

    @Test
    public void testAppendUsage_comparatorSortsChildOptions_withoutMutatingOriginal() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.appendUsageMarker = "A";
        FakeOption b = new FakeOption("-b", triggerSet("-b"), new HashSet());
        b.appendUsageMarker = "B";
        List input = new ArrayList();
        input.add(a);
        input.add(b);
        GroupImpl group = new GroupImpl(input, null, "d", 0, 2);

        StringBuffer buf = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator reverseByMarker = new Comparator() {
            public int compare(Object o1, Object o2) {
                String m1 = ((FakeOption) o1).appendUsageMarker;
                String m2 = ((FakeOption) o2).appendUsageMarker;
                return m2.compareTo(m1);
            }
        };

        group.appendUsage(buf, settings, reverseByMarker);

        assertEquals("B|A", buf.toString());
        // list ภายใน (options) ต้องไม่ถูกเปลี่ยนลำดับ (ใช้ ArrayList copy ก่อน sort)
        assertSame(a, group.getOptions().get(0));
    }

    // =====================================================================
    // helpLines
    // =====================================================================

    @Test
    public void testHelpLines_noRelevantSettings_returnsEmptyList() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1);
        List lines = group.helpLines(0, new HashSet(), null);
        assertTrue(lines.isEmpty());
    }

    @Test
    public void testHelpLines_displayGroupName_addsOneHelpLine() {
        GroupImpl group = new GroupImpl(new ArrayList(), "g", "d", 0, 1);
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_NAME);

        List lines = group.helpLines(2, settings, null);

        assertEquals(1, lines.size());
    }

    @Test
    public void testHelpLines_displayGroupExpanded_delegatesToChildOptions() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        Object marker = new Object();
        a.helpLinesResult = new ArrayList();
        a.helpLinesResult.add(marker);

        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        List lines = group.helpLines(3, settings, null);

        assertEquals(1, lines.size());
        assertSame(marker, lines.get(0));
    }

    @Test
    public void testHelpLines_displayGroupArgument_delegatesToAnonymous() {
        FakeArgument arg = new FakeArgument("v");
        Object marker = new Object();
        arg.helpLinesResult = new ArrayList();
        arg.helpLinesResult.add(marker);

        List input = new ArrayList();
        input.add(arg);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_ARGUMENT);

        List lines = group.helpLines(1, settings, null);

        assertEquals(1, lines.size());
        assertSame(marker, lines.get(0));
    }

    @Test
    public void testHelpLines_comparatorSortsChildOptionsBeforeDelegation() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        a.helpLinesResult = new ArrayList();
        a.helpLinesResult.add("A");
        FakeOption b = new FakeOption("-b", triggerSet("-b"), new HashSet());
        b.helpLinesResult = new ArrayList();
        b.helpLinesResult.add("B");

        List input = new ArrayList();
        input.add(a);
        input.add(b);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);

        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_GROUP_EXPANDED);

        Comparator reverseByName = new Comparator() {
            public int compare(Object o1, Object o2) {
                String n1 = ((FakeOption) o1).getPreferredName();
                String n2 = ((FakeOption) o2).getPreferredName();
                return n2.compareTo(n1);
            }
        };

        List lines = group.helpLines(0, settings, reverseByName);

        assertEquals(2, lines.size());
        assertEquals("B", lines.get(0));
        assertEquals("A", lines.get(1));
    }

    // =====================================================================
    // Immutability ของ collection ที่คืนค่า (boundary/edge)
    // =====================================================================

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOptions_isUnmodifiable() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);
        group.getOptions().add(new FakeOption("-z", triggerSet("-z"), new HashSet()));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetAnonymous_isUnmodifiable() {
        FakeArgument arg = new FakeArgument("v");
        List input = new ArrayList();
        input.add(arg);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);
        group.getAnonymous().add(new FakeArgument("v2"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetTriggers_isUnmodifiable() {
        FakeOption a = new FakeOption("-a", triggerSet("-a"), new HashSet());
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);
        group.getTriggers().add("-z");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetPrefixes_isUnmodifiable() {
        Set prefixesA = new HashSet();
        prefixesA.add("-");
        FakeOption a = new FakeOption("-a", triggerSet("-a"), prefixesA);
        List input = new ArrayList();
        input.add(a);
        GroupImpl group = new GroupImpl(input, "g", "d", 0, 1);
        group.getPrefixes().add("--");
    }
}
