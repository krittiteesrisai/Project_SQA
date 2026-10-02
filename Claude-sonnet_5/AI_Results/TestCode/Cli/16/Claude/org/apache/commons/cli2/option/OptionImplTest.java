package org.apache.commons.cli2.option;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link OptionImpl}.
 *
 * หมายเหตุ: เนื่องจาก OptionImpl เป็น abstract class และ interface Option
 * มีเมธอด abstract บางตัวที่ไม่ได้แสดงในซอร์สที่ให้มา (getPreferredName,
 * getDescription, getPrefixes, getTriggers, canProcess(cl,String), process,
 * validate, appendUsage, helpLines) จึงต้องสร้าง StubOption ขึ้นมาเพื่อให้
 * คอมไพล์ได้ โดยอ้างอิง signature จาก Apache Commons CLI2 (สมมติฐานเพื่อการ
 * คอมไพล์เท่านั้น ไม่ใช่การเดา behavior ของ OptionImpl)
 */
public class OptionImplTest {

    /** Test double implementing the abstract members required by Option. */
    private static class StubOption extends OptionImpl {
        private String preferredName;
        private String description;
        private Set prefixes;
        private Set triggers;
        private boolean canProcessResult = true;

        // เก็บพารามิเตอร์ล่าสุดที่ appendUsage ได้รับ เพื่อใช้ตรวจสอบใน test
        Set lastHelpSettings;
        Comparator lastComparator;

        StubOption(final int id, final boolean required) {
            super(id, required);
        }

        void setPreferredName(String s) { this.preferredName = s; }
        void setDescription(String s) { this.description = s; }
        void setPrefixes(Set s) { this.prefixes = s; }
        void setTriggers(Set s) { this.triggers = s; }
        void setCanProcessResult(boolean b) { this.canProcessResult = b; }

        public String getPreferredName() { return preferredName; }
        public String getDescription() { return description; }
        public Set getPrefixes() { return prefixes; }
        public Set getTriggers() { return triggers; }

        public boolean canProcess(final WriteableCommandLine commandLine, final String argument) {
            return canProcessResult;
        }

        public void process(final WriteableCommandLine commandLine, final ListIterator arguments) {
            // no-op สำหรับทดสอบ
        }

        public void validate(final WriteableCommandLine commandLine) {
            // no-op สำหรับทดสอบ
        }

        public void appendUsage(final StringBuffer buffer, final Set helpSettings, final Comparator comp) {
            this.lastHelpSettings = helpSettings;
            this.lastComparator = comp;
            buffer.append("USAGE");
        }

        public List helpLines(final int depth, final Set helpSettings, final Comparator comp) {
            return null;
        }
    }

    // ---------- getId() / isRequired() : boundary values ----------

    @Test
    public void testGetId_positive() {
        StubOption opt = new StubOption(5, true);
        assertEquals(5, opt.getId());
    }

    @Test
    public void testGetId_zero() {
        StubOption opt = new StubOption(0, false);
        assertEquals(0, opt.getId());
    }

    @Test
    public void testGetId_negativeBoundary() {
        StubOption opt = new StubOption(Integer.MIN_VALUE, false);
        assertEquals(Integer.MIN_VALUE, opt.getId());
    }

    @Test
    public void testGetId_maxBoundary() {
        StubOption opt = new StubOption(Integer.MAX_VALUE, true);
        assertEquals(Integer.MAX_VALUE, opt.getId());
    }

    @Test
    public void testIsRequired_true() {
        StubOption opt = new StubOption(1, true);
        assertTrue(opt.isRequired());
    }

    @Test
    public void testIsRequired_false() {
        StubOption opt = new StubOption(1, false);
        assertFalse(opt.isRequired());
    }

    // ---------- defaults() ----------

    @Test
    public void testDefaults_doesNothing_noException() {
        StubOption opt = new StubOption(1, false);
        // เมธอดควรไม่ทำอะไรและไม่ throw แม้ commandLine เป็น null
        opt.defaults(null);
    }

    // ---------- findOption() : if/else branch ----------

    @Test
    public void testFindOption_triggerFound_returnsSelf() {
        StubOption opt = new StubOption(1, false);
        Set triggers = new HashSet();
        triggers.add("-a");
        opt.setTriggers(triggers);

        Option result = opt.findOption("-a");
        assertSame(opt, result);
    }

    @Test
    public void testFindOption_triggerNotFound_returnsNull() {
        StubOption opt = new StubOption(1, false);
        Set triggers = new HashSet();
        triggers.add("-a");
        opt.setTriggers(triggers);

        assertNull(opt.findOption("-b"));
    }

    @Test
    public void testFindOption_emptyTriggers_returnsNull() {
        StubOption opt = new StubOption(1, false);
        opt.setTriggers(new HashSet());

        assertNull(opt.findOption("-a"));
    }

    // ---------- canProcess(commandLine, ListIterator) : if/else branch ----------

    @Test
    public void testCanProcess_hasNextTrue_delegatesAndReturnsTrue() {
        StubOption opt = new StubOption(1, false);
        opt.setCanProcessResult(true);

        List args = Arrays.asList(new String[] { "-x", "value" });
        ListIterator it = args.listIterator();

        boolean result = opt.canProcess(null, it);
        assertTrue(result);

        // ตรวจสอบว่า cursor ถูก reset กลับที่เดิม (next() คืนค่าเดิมได้อีก)
        assertTrue(it.hasNext());
        assertEquals("-x", it.next());
    }

    @Test
    public void testCanProcess_hasNextTrue_delegatesAndReturnsFalse() {
        StubOption opt = new StubOption(1, false);
        opt.setCanProcessResult(false);

        List args = Arrays.asList(new String[] { "-x" });
        ListIterator it = args.listIterator();

        assertFalse(opt.canProcess(null, it));
    }

    @Test
    public void testCanProcess_hasNextFalse_returnsFalseWithoutDelegating() {
        StubOption opt = new StubOption(1, false);
        // แม้ set canProcessResult=true แต่ไม่ควรถูกเรียกเพราะ list ว่าง
        opt.setCanProcessResult(true);

        List args = Arrays.asList(new String[] {});
        ListIterator it = args.listIterator();

        assertFalse(opt.canProcess(null, it));
    }

    @Test(expected = ClassCastException.class)
    public void testCanProcess_malformedInput_nonStringElement_throwsCCE() {
        StubOption opt = new StubOption(1, false);
        List args = Arrays.asList(new Object[] { Integer.valueOf(1) });
        ListIterator it = args.listIterator();

        opt.canProcess(null, it); // cast (String) arguments.next() ต้อง throw
    }

    // ---------- toString() -> appendUsage() ----------

    @Test
    public void testToString_delegatesToAppendUsageWithAllSettingsAndNullComparator() {
        StubOption opt = new StubOption(1, false);
        String result = opt.toString();

        assertEquals("USAGE", result);
        assertEquals(DisplaySetting.ALL, opt.lastHelpSettings);
        assertNull(opt.lastComparator);
    }

    // ---------- equals() : instanceof branch ----------

    @Test
    public void testEquals_notOptionImplInstance_returnsFalse() {
        StubOption opt = new StubOption(1, false);
        assertFalse(opt.equals("some string"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        StubOption opt = new StubOption(1, false);
        assertFalse(opt.equals(null));
    }

    // ---------- equals() : id mismatch (short-circuit ก่อนถึง helper) ----------

    @Test
    public void testEquals_differentId_returnsFalse() {
        StubOption a = new StubOption(1, false);
        StubOption b = new StubOption(2, false);
        assertFalse(a.equals(b));
    }

    // ---------- equals() : preferredName branch (both null / one null / else) ----------

    @Test
    public void testEquals_bothPreferredNameNull_continuesToTrue() {
        StubOption a = buildFullOption(1, null, "desc", set("-"), set("-a"));
        StubOption b = buildFullOption(1, null, "desc", set("-"), set("-a"));
        assertTrue(a.equals(b));
    }

    @Test
    public void testEquals_onePreferredNameNull_returnsFalse() {
        StubOption a = buildFullOption(1, null, "desc", set("-"), set("-a"));
        StubOption b = buildFullOption(1, "--a", "desc", set("-"), set("-a"));
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_differentPreferredName_returnsFalse() {
        StubOption a = buildFullOption(1, "--a", "desc", set("-"), set("-a"));
        StubOption b = buildFullOption(1, "--b", "desc", set("-"), set("-a"));
        assertFalse(a.equals(b));
    }

    // ---------- equals() : description branch ----------

    @Test
    public void testEquals_differentDescription_returnsFalse() {
        StubOption a = buildFullOption(1, "--a", "desc1", set("-"), set("-a"));
        StubOption b = buildFullOption(1, "--a", "desc2", set("-"), set("-a"));
        assertFalse(a.equals(b));
    }

    // ---------- equals() : prefixes branch ----------

    @Test
    public void testEquals_differentPrefixes_returnsFalse() {
        StubOption a = buildFullOption(1, "--a", "desc", set("-"), set("-a"));
        StubOption b = buildFullOption(1, "--a", "desc", set("+"), set("-a"));
        assertFalse(a.equals(b));
    }

    // ---------- equals() : triggers branch ----------

    @Test
    public void testEquals_differentTriggers_returnsFalse() {
        StubOption a = buildFullOption(1, "--a", "desc", set("-"), set("-a"));
        StubOption b = buildFullOption(1, "--a", "desc", set("-"), set("-b"));
        assertFalse(a.equals(b));
    }

    // ---------- equals() : all fields equal -> true (Set implementation ต่างกันได้) ----------

    @Test
    public void testEquals_allFieldsEqual_differentSetImplementations_returnsTrue() {
        Set prefixesA = new HashSet(); prefixesA.add("-");
        Set prefixesB = new TreeSet(); prefixesB.add("-");
        Set triggersA = new HashSet(); triggersA.add("-a");
        Set triggersB = new TreeSet(); triggersB.add("-a");

        StubOption a = buildFullOption(1, "--a", "desc", prefixesA, triggersA);
        StubOption b = buildFullOption(1, "--a", "desc", prefixesB, triggersB);

        assertTrue(a.equals(b));
    }

    // ---------- hashCode() : preferredName / description null-check branches ----------

    @Test
    public void testHashCode_preferredNameAndDescriptionNull() {
        StubOption opt = buildFullOption(1, null, null, new HashSet(), new HashSet());
        int expected = 1;
        expected = (expected * 37) + new HashSet().hashCode();
        expected = (expected * 37) + new HashSet().hashCode();
        assertEquals(expected, opt.hashCode());
    }

    @Test
    public void testHashCode_preferredNameOnly() {
        StubOption opt = buildFullOption(1, "--a", null, new HashSet(), new HashSet());
        int expected = 1;
        expected = (expected * 37) + "--a".hashCode();
        expected = (expected * 37) + new HashSet().hashCode();
        expected = (expected * 37) + new HashSet().hashCode();
        assertEquals(expected, opt.hashCode());
    }

    @Test
    public void testHashCode_descriptionOnly() {
        StubOption opt = buildFullOption(1, null, "desc", new HashSet(), new HashSet());
        int expected = 1;
        expected = (expected * 37) + "desc".hashCode();
        expected = (expected * 37) + new HashSet().hashCode();
        expected = (expected * 37) + new HashSet().hashCode();
        assertEquals(expected, opt.hashCode());
    }

    @Test
    public void testHashCode_bothPreferredNameAndDescription() {
        Set prefixes = set("-");
        Set triggers = set("-a");
        StubOption opt = buildFullOption(1, "--a", "desc", prefixes, triggers);

        int expected = 1;
        expected = (expected * 37) + "--a".hashCode();
        expected = (expected * 37) + "desc".hashCode();
        expected = (expected * 37) + prefixes.hashCode();
        expected = (expected * 37) + triggers.hashCode();
        assertEquals(expected, opt.hashCode());
    }

    // ---------- checkPrefixes() : empty prefixes -> return ทันที ----------

    @Test
    public void testCheckPrefixes_emptyPrefixes_returnsImmediately_noException() {
        StubOption opt = buildFullOption(1, "bad-name-no-prefix", "desc",
                new HashSet(), set("also-bad"));
        // prefixes ว่าง -> ต้อง return ก่อนตรวจสอบใด ๆ แม้ preferredName/trigger จะผิด
        opt.checkPrefixes(new HashSet());
    }

    // ---------- checkPrefixes() : preferredName ไม่ตรง prefix -> throw ----------

    @Test(expected = IllegalArgumentException.class)
    public void testCheckPrefixes_preferredNameDoesNotMatchPrefix_throws() {
        StubOption opt = buildFullOption(1, "badname", "desc", set("-"), set("-a"));
        opt.checkPrefixes(set("-"));
    }

    // ---------- checkPrefixes() : preferredName ตรง, trigger ไม่ตรง -> throw ระหว่าง loop ----------

    @Test(expected = IllegalArgumentException.class)
    public void testCheckPrefixes_triggerDoesNotMatchPrefix_throwsDuringLoop() {
        StubOption opt = buildFullOption(1, "-a", "desc", set("-"), set("badtrigger"));
        opt.checkPrefixes(set("-"));
    }

    // ---------- checkPrefixes() : หลาย prefix, ลำดับ mismatch ก่อน match (loop เดินหน้าหลายรอบ) ----------

    @Test
    public void testCheckPrefixes_multiplePrefixes_matchOnSecondPrefix_noException() {
        Set prefixes = new LinkedHashSet();
        prefixes.add("+");   // ตัวแรกไม่ match
        prefixes.add("-");   // ตัวที่สอง match

        StubOption opt = buildFullOption(1, "-a", "desc", prefixes, set("-b"));
        opt.checkPrefixes(prefixes);
    }

    // ---------- checkPrefixes() : หลาย trigger ทั้งหมด match -> loop ครบทุกตัวไม่ throw ----------

    @Test
    public void testCheckPrefixes_multipleTriggersAllMatch_noException() {
        Set triggers = new LinkedHashSet();
        triggers.add("-a");
        triggers.add("-b");
        triggers.add("-c");

        StubOption opt = buildFullOption(1, "-a", "desc", set("-"), triggers);
        opt.checkPrefixes(set("-"));
    }

    // ---------- checkPrefixes() : known fault (Defects4J Cli-16) ----------

    /**
     * NOTE: เทสนี้บันทึกพฤติกรรมจริงของซอร์สที่ให้มา (buggy version)
     * เมื่อ getPreferredName() คืนค่า null และ prefixes ไม่ว่าง เมธอด
     * checkPrefix จะเรียก trigger.startsWith(prefix) บนค่า null ทำให้เกิด
     * NullPointerException. พฤติกรรมที่ "ควรจะเป็น" (ตาม fixed version ใน
     * Defects4J) คือควร skip การตรวจสอบ preferredName เมื่อเป็น null
     * แต่เนื่องจากซอร์สที่ให้มาไม่มี null-check นี้ เทสจึงยืนยัน NPE
     * เพื่อระบุจุดที่เป็น fault อย่างชัดเจน
     */
    @Test(expected = NullPointerException.class)
    public void testCheckPrefixes_nullPreferredName_throwsNPE_knownFault() {
        StubOption opt = buildFullOption(1, null, "desc", set("-"), set("-a"));
        opt.checkPrefixes(set("-"));
    }

    // ---------- helper methods ----------

    private static Set set(String... values) {
        Set s = new LinkedHashSet();
        for (int i = 0; i < values.length; i++) {
            s.add(values[i]);
        }
        return s;
    }

    private static StubOption buildFullOption(int id, String preferredName, String description,
                                                Set prefixes, Set triggers) {
        StubOption opt = new StubOption(id, false);
        opt.setPreferredName(preferredName);
        opt.setDescription(description);
        opt.setPrefixes(prefixes);
        opt.setTriggers(triggers);
        return opt;
    }
}
