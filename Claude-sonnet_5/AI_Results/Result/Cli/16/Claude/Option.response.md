# วิเคราะห์ก่อนเขียนเทส

**ข้อสังเกตสำคัญ:** คลาส `Option` ที่ให้มาเป็น **interface บริสุทธิ์** (pure interface) — ไม่มี default method, ไม่มี field, ไม่มี logic ใด ๆ อยู่ในตัวมันเอง มีเพียง method signature และ Javadoc ที่อธิบาย contract เท่านั้น

ดังนั้น:
- **ไม่มี branch/condition ที่แท้จริงอยู่ใน source ของ `Option` ให้ coverage tool วัดได้** (interface ไม่มี bytecode ของ method body)
- การเขียน JUnit ทดสอบ interface ตรง ๆ เป็นไปไม่ได้ เพราะไม่สามารถ instantiate ได้
- สิ่งที่ทำได้อย่างสมเหตุสมผลคือ **สร้าง stub implementation** ที่จำลอง behavior ตาม **Javadoc contract** ของแต่ละเมธอด (เช่น "ต้อง process อย่างน้อย 1 argument", "getTriggers ต้องไม่ null", "canProcess(ListIterator) ต้อง restore ตำแหน่ง iterator ก่อน return") แล้วทดสอบ stub นั้นเพื่อยืนยันว่า contract สามารถ implement และเรียกใช้ได้ตามที่ระบุไว้จริง

⚠️ **หมายเหตุกำกับ assumption:** เนื่องจากไม่มี source ของ `OptionException` และ `WriteableCommandLine` ให้มาด้วย ผมจำเป็นต้องสมมติ constructor ของ `OptionException(Option, String)` (ตาม API ทั่วไปของ commons-cli2 ที่ทราบมา) เพื่อให้โค้ด compile ได้ — **นี่คือ assumption ที่ไม่ได้ยืนยันจาก source ที่ให้มา** หากไม่ตรงกับ signature จริง ต้องปรับแก้

```java
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;

/**
 * ชุดทดสอบสำหรับ interface {@link Option}
 *
 * เนื่องจาก Option เป็น interface ล้วน ๆ ไม่มี logic ใด ๆ ในตัวเอง
 * (ไม่มี default method) จึงไม่มี branch จริงใน bytecode ของ Option
 * ให้ทดสอบได้โดยตรง ชุดทดสอบนี้จึงสร้าง StubOption ขึ้นมาเพื่อ
 * จำลอง behavior ตาม "contract" ที่ระบุไว้ใน Javadoc ของแต่ละเมธอด
 * เท่านั้น (ไม่ได้เดา behavior เกินกว่าที่ Javadoc ระบุ)
 *
 * ทุก if/else และทุก loop ที่ทดสอบ คือ logic ที่อยู่ใน Stub
 * ซึ่งเขียนขึ้นให้สอดคล้องกับข้อความ Javadoc ของ Option โดยตรง เช่น:
 * - process(): "This method MUST process at least one argument"
 * - canProcess(ListIterator): "must be restored to the initial state
 *   before returning"
 * - getTriggers()/getPrefixes(): "must not be null"
 */
public class OptionTest {

    /**
     * Stub implementation ของ Option ที่ implement ตาม Javadoc contract
     * เพื่อให้สามารถทดสอบการเรียกใช้งานตามสัญญาที่ interface กำหนดไว้ได้
     */
    private static class StubOption implements Option {
        private final int id;
        private final boolean required;
        private final Set triggers;
        private final Set prefixes;
        boolean defaultsCalled = false;
        private boolean throwOnValidate = false;
        private final String preferredName = "stub";
        private final String description = "stub description";

        StubOption(int id, boolean required, Set triggers, Set prefixes) {
            this.id = id;
            this.required = required;
            this.triggers = triggers;
            this.prefixes = prefixes;
        }

        public void process(WriteableCommandLine commandLine, ListIterator args)
                throws OptionException {
            // ตาม Javadoc: "This method MUST process at least one argument"
            if (args == null || !args.hasNext()) {
                throw new IllegalStateException("No argument to process");
            }
            args.next(); // consume อย่างน้อย 1 argument
        }

        public void defaults(WriteableCommandLine commandLine) {
            defaultsCalled = true;
        }

        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            if (argument == null) {
                return false;
            }
            for (Object trigger : triggers) {
                if (argument.startsWith((String) trigger)) {
                    return true;
                }
            }
            return false;
        }

        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            if (arguments == null || !arguments.hasNext()) {
                return false;
            }
            Object next = arguments.next();
            boolean result = canProcess(commandLine, next == null ? null : next.toString());
            // ตาม Javadoc: ListIterator ต้อง restore กลับสู่ตำแหน่งเดิมก่อน return
            arguments.previous();
            return result;
        }

        public Set getTriggers() {
            return triggers; // ตาม Javadoc: "must not be null"
        }

        public Set getPrefixes() {
            return prefixes; // ตาม Javadoc: "must not be null"
        }

        public void validate(WriteableCommandLine commandLine) throws OptionException {
            if (throwOnValidate) {
                // สมมติ constructor ตาม API ทั่วไปของ commons-cli2 (ไม่ได้ยืนยันจาก source ที่ให้มา)
                throw new OptionException(this, "invalid");
            }
        }

        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return new LinkedList();
        }

        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            buffer.append(preferredName);
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public int getId() {
            return id;
        }

        public Option findOption(String trigger) {
            if (trigger != null && triggers.contains(trigger)) {
                return this;
            }
            return null;
        }

        public boolean isRequired() {
            return required;
        }

        void setThrowOnValidate(boolean b) {
            this.throwOnValidate = b;
        }
    }

    private Set triggers;
    private Set prefixes;
    private StubOption option;

    @Before
    public void setUp() {
        triggers = new HashSet();
        triggers.add("-f");
        triggers.add("--foo");
        prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");
        option = new StubOption(1, false, triggers, prefixes);
    }

    // ---------- getId / isRequired: boundary values ----------

    @Test
    public void testGetIdReturnsConfiguredValue() {
        assertEquals(1, option.getId());
    }

    @Test
    public void testGetIdZeroBoundary() {
        StubOption zeroIdOption = new StubOption(0, false, triggers, prefixes);
        assertEquals(0, zeroIdOption.getId());
    }

    @Test
    public void testGetIdNegativeBoundary() {
        StubOption negativeIdOption = new StubOption(-1, false, triggers, prefixes);
        assertEquals(-1, negativeIdOption.getId());
    }

    @Test
    public void testIsRequiredTrue() {
        StubOption requiredOption = new StubOption(2, true, triggers, prefixes);
        assertTrue(requiredOption.isRequired());
    }

    @Test
    public void testIsRequiredFalse() {
        assertFalse(option.isRequired());
    }

    // ---------- getTriggers / getPrefixes: not-null contract ----------

    @Test
    public void testGetTriggersNotNullAndContainsExpected() {
        assertNotNull(option.getTriggers());
        assertTrue(option.getTriggers().contains("-f"));
    }

    @Test
    public void testGetPrefixesNotNullAndContainsExpected() {
        assertNotNull(option.getPrefixes());
        assertTrue(option.getPrefixes().contains("-"));
    }

    @Test
    public void testGetTriggersEmptySetIsStillNotNull() {
        StubOption emptyTriggerOption = new StubOption(3, false, new HashSet(), prefixes);
        assertNotNull(emptyTriggerOption.getTriggers());
        assertTrue(emptyTriggerOption.getTriggers().isEmpty());
    }

    // ---------- canProcess(String): branch ทั้งหมด ----------

    @Test
    public void testCanProcessString_NullArgument() {
        assertFalse(option.canProcess(null, (String) null));
    }

    @Test
    public void testCanProcessString_MatchingTrigger() {
        assertTrue(option.canProcess(null, "-f"));
    }

    @Test
    public void testCanProcessString_NonMatchingTrigger() {
        assertFalse(option.canProcess(null, "-x"));
    }

    @Test
    public void testCanProcessString_EmptyArgument() {
        assertFalse(option.canProcess(null, ""));
    }

    // ---------- canProcess(ListIterator): branch + restore-state contract ----------

    @Test
    public void testCanProcessListIterator_NullIterator() {
        assertFalse(option.canProcess(null, (ListIterator) null));
    }

    @Test
    public void testCanProcessListIterator_NoNextElement() {
        List empty = new LinkedList();
        ListIterator it = empty.listIterator();
        assertFalse(option.canProcess(null, it));
    }

    @Test
    public void testCanProcessListIterator_MatchRestoresPosition() {
        List args = new LinkedList();
        args.add("-f");
        args.add("bar");
        ListIterator it = args.listIterator();
        boolean result = option.canProcess(null, it);
        assertTrue(result);
        // ตาม Javadoc: ListIterator ต้องถูก restore กลับสู่ตำแหน่งเดิม
        assertEquals(0, it.nextIndex());
    }

    @Test
    public void testCanProcessListIterator_NonMatchRestoresPosition() {
        List args = new LinkedList();
        args.add("-x");
        ListIterator it = args.listIterator();
        boolean result = option.canProcess(null, it);
        assertFalse(result);
        assertEquals(0, it.nextIndex());
    }

    // ---------- process(): ต้อง process อย่างน้อย 1 argument ----------

    @Test
    public void testProcess_ConsumesAtLeastOneArgument() throws OptionException {
        List args = new LinkedList();
        args.add("-f");
        ListIterator it = args.listIterator();
        option.process(null, it);
        assertTrue(it.hasPrevious());
        assertFalse(it.hasNext());
    }

    @Test(expected = IllegalStateException.class)
    public void testProcess_NullIteratorThrows() throws OptionException {
        option.process(null, null);
    }

    @Test(expected = IllegalStateException.class)
    public void testProcess_EmptyIteratorThrows() throws OptionException {
        List empty = new LinkedList();
        option.process(null, empty.listIterator());
    }

    // ---------- defaults() ----------

    @Test
    public void testDefaultsInvoked() {
        option.defaults(null);
        assertTrue(option.defaultsCalled);
    }

    // ---------- validate(): branch throw / not throw ----------

    @Test
    public void testValidate_NoExceptionWhenValid() throws OptionException {
        option.validate(null); // ไม่ throw เพราะ throwOnValidate = false (default)
    }

    @Test(expected = OptionException.class)
    public void testValidate_ThrowsWhenInvalid() throws OptionException {
        option.setThrowOnValidate(true);
        option.validate(null);
    }

    // ---------- findOption(): branch match / not-match / null ----------

    @Test
    public void testFindOption_MatchingTrigger() {
        assertSame(option, option.findOption("-f"));
    }

    @Test
    public void testFindOption_NonMatchingTrigger() {
        assertNull(option.findOption("-z"));
    }

    @Test
    public void testFindOption_NullTrigger() {
        assertNull(option.findOption(null));
    }

    // ---------- helpLines / appendUsage / getPreferredName / getDescription ----------

    @Test
    public void testHelpLinesReturnsNonNullList() {
        List lines = option.helpLines(0, Collections.EMPTY_SET, null);
        assertNotNull(lines);
    }

    @Test
    public void testAppendUsageAppendsPreferredName() {
        StringBuffer buffer = new StringBuffer();
        option.appendUsage(buffer, Collections.EMPTY_SET, null);
        assertTrue(buffer.toString().contains("stub"));
    }

    @Test
    public void testGetPreferredNameNotNull() {
        assertEquals("stub", option.getPreferredName());
    }

    @Test
    public void testGetDescriptionNotNull() {
        assertEquals("stub description", option.getDescription());
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| Test method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetId*` (3 tests) | boundary values ของ `getId()`: 0, 1, -1 |
| `testIsRequiredTrue/False` | if/else ของ `isRequired()` — true/false path |
| `testGetTriggersNotNull...` | contract "must not be null", non-empty set |
| `testGetTriggersEmptySet...` | contract กับ empty set (ยัง non-null) |
| `testGetPrefixesNotNull...` | contract "must not be null" ของ prefixes |
| `testCanProcessString_NullArgument` | `canProcess(String)`: argument == null branch |
| `testCanProcessString_MatchingTrigger` | loop เจอ trigger ที่ match → true branch |
| `testCanProcessString_NonMatchingTrigger` | loop ไม่เจอ trigger → false branch (loop จบครบ) |
| `testCanProcessString_EmptyArgument` | argument เป็น empty string ไม่ match ใด ๆ |
| `testCanProcessListIterator_NullIterator` | `canProcess(ListIterator)`: arguments == null branch |
| `testCanProcessListIterator_NoNextElement` | `!hasNext()` branch |
| `testCanProcessListIterator_MatchRestoresPosition` | true branch + ตรวจ restore position ตาม Javadoc |
| `testCanProcessListIterator_NonMatchRestoresPosition` | false branch + ตรวจ restore position |
| `testProcess_ConsumesAtLeastOneArgument` | `process()`: normal path ที่ consume ≥1 argument |
| `testProcess_NullIteratorThrows` | `args == null` branch → throw |
| `testProcess_EmptyIteratorThrows` | `!args.hasNext()` branch → throw |
| `testDefaultsInvoked` | เรียก `defaults()` สำเร็จ (ไม่มี branch ใน contract) |
| `testValidate_NoExceptionWhenValid` | `validate()`: false branch (ไม่ throw) |
| `testValidate_ThrowsWhenInvalid` | `validate()`: true branch (throw `OptionException`) |
| `testFindOption_MatchingTrigger` | `findOption()`: trigger match → return this |
| `testFindOption_NonMatchingTrigger` | trigger ไม่ match → return null |
| `testFindOption_NullTrigger` | trigger == null branch → return null |
| `testHelpLinesReturnsNonNullList` | ตรวจ contract return ไม่ null |
| `testAppendUsageAppendsPreferredName` | ตรวจ side-effect ของ `appendUsage()` |
| `testGetPreferredNameNotNull` / `testGetDescriptionNotNull` | ตรวจ getter พื้นฐาน |

**ข้อสรุปสำคัญ:** เนื่องจาก `Option` เป็น interface ที่ไม่มี logic ในตัวเอง coverage ที่รายงานจริงต่อไฟล์ `Option.java` จะเป็น 0 branch เสมอ (ไม่มี branch ให้วัด) — ตารางด้านบนคือ branch ที่อยู่ใน **StubOption** (ซึ่งเขียนตาม contract ของ Javadoc) เพื่อยืนยันว่า implementation ที่ทำตาม spec จะทำงานถูกต้องตามที่ interface documented ไว้ ไม่ใช่ branch ของ production code จริงที่ implement `Option` (เช่น `DefaultOption`, `ArgumentImpl` ฯลฯ ซึ่งไม่ได้ให้ source มาในโจทย์นี้)