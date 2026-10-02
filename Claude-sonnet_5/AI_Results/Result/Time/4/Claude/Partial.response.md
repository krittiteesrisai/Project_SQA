# แผนการทดสอบและข้อสังเกต

จากการวิเคราะห์ซอร์สโค้ด `Partial` (Joda-Time, Defects4J Time-4b) ผมได้ออกแบบ test case ให้ครอบคลุม:
- Constructor ทุกตัว (รวม validation branch: null, length mismatch, order, duplicate)
- Getter/Setter methods (`with`, `without`, `withField`, `withFieldAdded`, `withFieldAddWrapped`, `withPeriodAdded`, `plus`, `minus`)
- `isMatch` ทั้งสอง overload
- `toString` / `toStringList` / `getFormatter` (รวม fallback branch)
- `Property` inner class methods

**หมายเหตุสำคัญ:** บาง branch ภายใน loop ของ constructor array (เช่น `unitField.isSupported() == false`) และบางเงื่อนไขละเอียดใน `with()` (เช่น insertion ที่ rangeField เท่ากัน) ขึ้นกับ internal structure ของ `DateTimeFieldType`/`DurationField` ที่ไม่ได้แสดงในซอร์สที่ให้มา จึงไม่สามารถยืนยัน behavior ได้ 100% — ได้ comment ไว้ในโค้ดเพื่อไม่ guess เกินซอร์สที่มี

```java
package org.joda.time;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormatter;

import java.util.Locale;

/**
 * JUnit4 test suite for {@link Partial}.
 * ครอบคลุม constructor, public method, และ inner class Property
 * ตามที่วิเคราะห์ได้จากซอร์สโค้ดที่ให้มาเท่านั้น
 */
public class PartialTest {

    private Locale savedLocale;

    @Before
    public void setUp() {
        // fix default locale เพื่อให้ test ที่พึ่งพา text parsing (เช่น month name) deterministic
        savedLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
    }

    @After
    public void tearDown() {
        Locale.setDefault(savedLocale);
        DateTimeUtils.setCurrentMillisSystem();
    }

    // ======================================================================
    // Constructors
    // ======================================================================

    @Test
    public void testNoArgConstructor() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertSame(ISOChronology.getInstanceUTC(), p.getChronology());
    }

    @Test
    public void testChronoConstructor_null() {
        Partial p = new Partial((Chronology) null);
        assertSame(ISOChronology.getInstanceUTC(), p.getChronology());
        assertEquals(0, p.size());
    }

    @Test
    public void testChronoConstructor_nonNull() {
        Partial p = new Partial(GregorianChronology.getInstance());
        assertEquals(DateTimeZone.UTC, p.getChronology().getZone());
    }

    @Test
    public void testSingleFieldConstructor() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0));
        assertEquals(2004, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSingleFieldConstructor_nullType() {
        new Partial((DateTimeFieldType) null, 2004, null);
    }

    @Test
    public void testArrayConstructor_empty() {
        Partial p = new Partial(new DateTimeFieldType[0], new int[0]);
        assertEquals(0, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructor_nullTypes() {
        new Partial((DateTimeFieldType[]) null, new int[0], null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructor_nullValues() {
        new Partial(new DateTimeFieldType[0], (int[]) null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructor_lengthMismatch() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year()}, new int[0], null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructor_nullElementInTypes() {
        new Partial(new DateTimeFieldType[] {DateTimeFieldType.year(), null},
                new int[] {2004, 1}, null);
    }

    @Test
    public void testArrayConstructor_validOrder() {
        Partial p = new Partial(
                new DateTimeFieldType[] {
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        assertEquals(3, p.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructor_wrongOrder() {
        new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth(), DateTimeFieldType.year()},
                new int[] {9, 2004});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructor_duplicateYear() {
        // year ไม่มี rangeDurationType -> duplicate branch
        new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.year()},
                new int[] {2004, 2005});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructor_duplicateDayOfMonth() {
        // dayOfMonth มี rangeDurationType เท่ากัน -> duplicate branch (compare==0)
        new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()},
                new int[] {9, 10});
    }

    @Test
    public void testCopyConstructor_valid() {
        Partial src = new Partial(DateTimeFieldType.year(), 2004);
        Partial p = new Partial((ReadablePartial) src);
        assertEquals(1, p.size());
        assertEquals(2004, p.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCopyConstructor_null() {
        new Partial((ReadablePartial) null);
    }

    // ======================================================================
    // Basic getters
    // ======================================================================

    @Test
    public void testGetFieldTypesAndValuesAreCloned() {
        Partial p = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2004, 6});

        DateTimeFieldType[] types = p.getFieldTypes();
        types[0] = DateTimeFieldType.dayOfMonth();
        assertEquals(DateTimeFieldType.year(), p.getFieldType(0)); // original ไม่ถูกแก้

        int[] values = p.getValues();
        values[0] = 999;
        assertEquals(2004, p.getValue(0)); // original ไม่ถูกแก้
    }

    // ======================================================================
    // withChronologyRetainFields
    // ======================================================================

    @Test
    public void testWithChronologyRetainFields_sameInstanceReturnsThis() {
        Partial p = new Partial(ISOChronology.getInstanceUTC());
        Partial p2 = p.withChronologyRetainFields(null);
        assertSame(p, p2);
    }

    @Test
    public void testWithChronologyRetainFields_differentChronoCreatesNew() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004, ISOChronology.getInstanceUTC());
        Partial p2 = p.withChronologyRetainFields(GregorianChronology.getInstance());
        assertNotSame(p, p2);
        assertEquals(DateTimeZone.UTC, p2.getChronology().getZone());
        assertEquals(2004, p2.getValue(0));
    }

    // ======================================================================
    // with(DateTimeFieldType, int)
    // ======================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testWith_nullFieldType() {
        new Partial().with(null, 1);
    }

    @Test
    public void testWith_newFieldInsertedAtEnd() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(2, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), p2.getFieldType(1));
    }

    @Test
    public void testWith_newFieldInsertedAtStart() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial p2 = p.with(DateTimeFieldType.year(), 2004);
        assertEquals(2, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
        assertEquals(DateTimeFieldType.monthOfYear(), p2.getFieldType(1));
    }

    @Test
    public void testWith_newFieldOnEmptyPartial() {
        Partial p = new Partial();
        Partial p2 = p.with(DateTimeFieldType.year(), 2004);
        assertEquals(1, p2.size());
    }

    @Test
    public void testWith_sameValueReturnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.with(DateTimeFieldType.year(), 2004);
        assertSame(p, p2);
    }

    @Test
    public void testWith_differentValueReplaces() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.with(DateTimeFieldType.year(), 2005);
        assertNotSame(p, p2);
        assertEquals(2005, p2.getValue(0));
    }

    // ======================================================================
    // without
    // ======================================================================

    @Test
    public void testWithout_existingField() {
        Partial p = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2004, 6});
        Partial p2 = p.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, p2.size());
        assertEquals(DateTimeFieldType.year(), p2.getFieldType(0));
    }

    @Test
    public void testWithout_nonExistingFieldReturnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.without(DateTimeFieldType.monthOfYear());
        assertSame(p, p2);
    }

    // ======================================================================
    // withField
    // ======================================================================

    @Test
    public void testWithField_sameValueReturnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.withField(DateTimeFieldType.year(), 2004);
        assertSame(p, p2);
    }

    @Test
    public void testWithField_differentValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.withField(DateTimeFieldType.year(), 2005);
        assertNotSame(p, p2);
        assertEquals(2005, p2.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithField_unsupportedFieldThrows() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        p.withField(DateTimeFieldType.monthOfYear(), 6);
    }

    // ======================================================================
    // withFieldAdded
    // ======================================================================

    @Test
    public void testWithFieldAdded_zeroReturnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.withFieldAdded(DurationFieldType.years(), 0);
        assertSame(p, p2);
    }

    @Test
    public void testWithFieldAdded_nonZero() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.withFieldAdded(DurationFieldType.years(), 1);
        assertEquals(2005, p2.getValue(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_unsupportedThrows() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        p.withFieldAdded(DurationFieldType.months(), 1);
    }

    // ======================================================================
    // withFieldAddWrapped
    // ======================================================================

    @Test
    public void testWithFieldAddWrapped_zeroReturnsThis() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial p2 = p.withFieldAddWrapped(DurationFieldType.months(), 0);
        assertSame(p, p2);
    }

    @Test
    public void testWithFieldAddWrapped_wrapsAroundMax() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial p2 = p.withFieldAddWrapped(DurationFieldType.months(), 1);
        assertEquals(1, p2.getValue(0));
    }

    // ======================================================================
    // withPeriodAdded / plus / minus
    // ======================================================================

    @Test
    public void testWithPeriodAdded_nullPeriodReturnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        assertSame(p, p.withPeriodAdded(null, 1));
    }

    @Test
    public void testWithPeriodAdded_zeroScalarReturnsThis() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Period period = Period.years(1);
        assertSame(p, p.withPeriodAdded(period, 0));
    }

    @Test
    public void testWithPeriodAdded_matchingFieldsApplied() {
        Partial p = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2004, 6});
        Period period = new Period(1, 2, 0, 0, 0, 0, 0, 0); // years=1, months=2
        Partial p2 = p.withPeriodAdded(period, 1);
        assertEquals(2005, p2.getValue(0));
        assertEquals(8, p2.getValue(1));
    }

    @Test
    public void testWithPeriodAdded_nonMatchingFieldIgnored() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Period period = new Period(0, 0, 0, 0, 1, 0, 0, 0); // hours - ไม่ตรง field ใด ๆ
        Partial p2 = p.withPeriodAdded(period, 1);
        assertEquals(2004, p2.getValue(0));
    }

    @Test
    public void testPlus() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.plus(Period.years(1));
        assertEquals(2005, p2.getValue(0));
    }

    @Test
    public void testMinus() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial p2 = p.minus(Period.years(1));
        assertEquals(2003, p2.getValue(0));
    }

    // ======================================================================
    // property
    // ======================================================================

    @Test
    public void testProperty_valid() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        assertEquals(2004, prop.get());
        assertSame(p, prop.getPartial());
        assertNotNull(prop.getField());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProperty_unsupportedThrows() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        p.property(DateTimeFieldType.monthOfYear());
    }

    // ======================================================================
    // isMatch(ReadableInstant)
    // ======================================================================

    @Test
    public void testIsMatchInstant_matches() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, DateTimeZone.UTC);
        assertTrue(p.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_doesNotMatch() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        DateTime dt = new DateTime(2005, 6, 9, 10, 20, 30, 40, DateTimeZone.UTC);
        assertFalse(p.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_emptyPartialAlwaysMatches() {
        Partial p = new Partial();
        DateTime dt = new DateTime(2005, 6, 9, 10, 20, 30, 40, DateTimeZone.UTC);
        assertTrue(p.isMatch(dt));
    }

    @Test
    public void testIsMatchInstant_nullInstantUsesNow() {
        DateTimeUtils.setCurrentMillisFixed(
                new DateTime(2004, 6, 9, 0, 0, 0, 0, DateTimeZone.UTC).getMillis());
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        assertTrue(p.isMatch((ReadableInstant) null));
    }

    // ======================================================================
    // isMatch(ReadablePartial)
    // ======================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testIsMatchPartial_nullThrows() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        p.isMatch((ReadablePartial) null);
    }

    @Test
    public void testIsMatchPartial_matches() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial other = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2004, 6});
        assertTrue(p.isMatch(other));
    }

    @Test
    public void testIsMatchPartial_doesNotMatch() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial other = new Partial(DateTimeFieldType.year(), 2005);
        assertFalse(p.isMatch(other));
    }

    // ======================================================================
    // getFormatter / toString / toStringList
    // ======================================================================

    @Test
    public void testGetFormatter_emptyPartialReturnsNull() {
        Partial p = new Partial();
        assertNull(p.getFormatter());
    }

    @Test
    public void testGetFormatter_cachedOnSecondCall() {
        Partial p = new Partial(
                new DateTimeFieldType[] {
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        DateTimeFormatter f1 = p.getFormatter();
        DateTimeFormatter f2 = p.getFormatter(); // ครั้งที่สอง ใช้ cache (iFormatter != null)
        assertNotNull(f1);
        assertSame(f1, f2);
    }

    @Test
    public void testToString_emptyPartial() {
        Partial p = new Partial();
        assertEquals("[]", p.toString());
    }

    @Test
    public void testToString_validIsoFormat() {
        Partial p = new Partial(
                new DateTimeFieldType[] {
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        assertEquals("2004-06-09", p.toString());
    }

    @Test
    public void testToString_fallbackSafetyCheck() {
        // NOTE: ไม่ยืนยันว่าคอมบิเนชันนี้มี ISO format หรือไม่ (ไม่ guess behavior)
        // ทดสอบเพียงว่าไม่ throw และ return string ไม่ null
        Partial p = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.dayOfWeek(), DateTimeFieldType.hourOfDay()},
                new int[] {5, 12});
        String s = p.toString();
        assertNotNull(s);
    }

    @Test
    public void testToStringList() {
        Partial p = new Partial(
                new DateTimeFieldType[] {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()},
                new int[] {2004, 6});
        assertEquals("[year=2004, monthOfYear=6]", p.toStringList());
    }

    @Test
    public void testToStringPattern_nullUsesDefaultToString() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        assertEquals(p.toString(), p.toString((String) null));
    }

    @Test
    public void testToStringPattern_nonNull() {
        Partial p = new Partial(
                new DateTimeFieldType[] {
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        assertEquals("2004-06-09", p.toString("yyyy-MM-dd"));
    }

    @Test
    public void testToStringPatternLocale_nullUsesDefaultToString() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        assertEquals(p.toString(), p.toString((String) null, Locale.FRENCH));
    }

    @Test
    public void testToStringPatternLocale_nonNull() {
        Partial p = new Partial(
                new DateTimeFieldType[] {
                        DateTimeFieldType.year(),
                        DateTimeFieldType.monthOfYear(),
                        DateTimeFieldType.dayOfMonth()},
                new int[] {2004, 6, 9});
        assertEquals("2004-06-09", p.toString("yyyy-MM-dd", Locale.US));
    }

    // ======================================================================
    // Property inner class
    // ======================================================================

    @Test
    public void testPropertyAddToCopy() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        Partial p2 = prop.addToCopy(1);
        assertEquals(2005, p2.getValue(0));
        assertEquals(2004, p.getValue(0)); // immutability
    }

    @Test
    public void testPropertyAddWrapFieldToCopy() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial p2 = prop.addWrapFieldToCopy(1);
        assertEquals(1, p2.getValue(0));
    }

    @Test
    public void testPropertySetCopy_intValue() {
        Partial p = new Partial(DateTimeFieldType.year(), 2004);
        Partial.Property prop = p.property(DateTimeFieldType.year());
        Partial p2 = prop.setCopy(2010);
        assertEquals(2010, p2.getValue(0));
    }

    @Test
    public void testPropertySetCopy_textDefaultLocale() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 1);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial p2 = prop.setCopy("December"); // ใช้ default locale (fixed เป็น US ใน setUp)
        assertEquals(12, p2.getValue(0));
    }

    @Test
    public void testPropertySetCopy_textWithLocale() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 1);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial p2 = prop.setCopy("December", Locale.ENGLISH);
        assertEquals(12, p2.getValue(0));
    }

    @Test
    public void testPropertyWithMaximumValue() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial p2 = prop.withMaximumValue();
        assertEquals(12, p2.getValue(0));
    }

    @Test
    public void testPropertyWithMinimumValue() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial.Property prop = p.property(DateTimeFieldType.monthOfYear());
        Partial p2 = prop.withMinimumValue();
        assertEquals(1, p2.getValue(0));
    }
}
```

## สรุปความครอบคลุม (Test → Branch/Condition)

| กลุ่มเมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testNoArgConstructor`, `testChronoConstructor_null/_nonNull` | constructor `Partial()`, `Partial(Chronology)` (null vs non-null chrono) |
| `testSingleFieldConstructor*` | constructor `(type,value,chrono)`: type null → throw, type valid → success |
| `testArrayConstructor_empty/_nullTypes/_nullValues/_lengthMismatch/_nullElementInTypes` | ทุก validation branch ต้นของ `Partial(types[],values[],chrono)` |
| `testArrayConstructor_validOrder/_wrongOrder/_duplicateYear/_duplicateDayOfMonth` | loop ตรวจ order/duplicate: `compare<0`, `compare==0` (rangeDurationType null/non-null, equal/not-equal) |
| `testCopyConstructor_valid/_null` | constructor `Partial(ReadablePartial)`: null → throw, valid → copy loop |
| `testGetFieldTypesAndValuesAreCloned` | `getFieldTypes()`, `getValues()` clone behavior |
| `testWithChronologyRetainFields_*` | if `newChronology == getChronology()` true/false |
| `testWith_nullFieldType/_newFieldInsertedAtEnd/_atStart/_onEmptyPartial/_sameValueReturnsThis/_differentValueReplaces` | `with()`: null check, index==-1 (insert loop, compare>0/compare==0 skip), value==existing, value!=existing |
| `testWithout_existingField/_nonExistingFieldReturnsThis` | `without()`: index!=-1 / index==-1 |
| `testWithField_sameValueReturnsThis/_differentValue/_unsupportedFieldThrows` | `withField()`: value==current, value!=current, unsupported throw |
| `testWithFieldAdded_zeroReturnsThis/_nonZero/_unsupportedThrows` | `withFieldAdded()`: amount==0, amount!=0, unsupported throw |
| `testWithFieldAddWrapped_zeroReturnsThis/_wrapsAroundMax` | `withFieldAddWrapped()`: amount==0, wrap-around logic |
| `testWithPeriodAdded_nullPeriodReturnsThis/_zeroScalarReturnsThis/_matchingFieldsApplied/_nonMatchingFieldIgnored` | `withPeriodAdded()`: null/scalar==0 shortcut, loop index>=0 / index==-1 |
| `testPlus/testMinus` | `plus()`/`minus()` delegation (scalar 1 / -1) |
| `testProperty_valid/_unsupportedThrows` | `property()`: valid index / unsupported throw |
| `testIsMatchInstant_matches/_doesNotMatch/_emptyPartialAlwaysMatches/_nullInstantUsesNow` | `isMatch(ReadableInstant)`: loop match true/false, empty loop (always true), null instant → now |
| `testIsMatchPartial_nullThrows/_matches/_doesNotMatch` | `isMatch(ReadablePartial)`: null throw, loop match true/false |
| `testGetFormatter_emptyPartialReturnsNull/_cachedOnSecondCall` | `getFormatter()`: size==0 → null, cache (`iFormatter != null`) branch |
| `testToString_emptyPartial/_validIsoFormat/_fallbackSafetyCheck` | `toString()`: iFormatter null→build, f1==null→fallback list, f1!=null→format print |
| `testToStringList` | `toStringList()` loop + separator logic (`i>0`) |
| `testToStringPattern_null*/_nonNull*`, `testToStringPatternLocale_*` | `toString(pattern)`/`toString(pattern,locale)`: pattern==null / pattern!=null |
| `testPropertyAddToCopy/_AddWrapFieldToCopy/_SetCopy*/_WithMaximumValue/_WithMinimumValue` | `Property` inner class: `addToCopy`, `addWrapFieldToCopy`, `setCopy(int)`, `setCopy(text)`, `setCopy(text,locale)`, `withMaximumValue`, `withMinimumValue` |

**Branch ที่ไม่สามารถยืนยัน behavior ได้แน่ชัดจากซอร์สที่ให้มา (ไม่ได้เขียน assertion เฉพาะเจาะจง เพื่อไม่ guess):**
- เงื่อนไข `unitField.isSupported() == false` ใน loop ของ `with()` — ต้องพึ่งพา internal ของ `DurationField` ที่ไม่ปรากฏในซอร์ส
- บาง sub-branch ของ "duplicate/order" ใน array constructor ที่ขึ้นกับ `rangeDurationType` เปรียบเทียบแบบละเอียด (คอมเมนต์ไว้ในโค้ดเฉพาะกรณีที่ทดสอบได้ชัดเจน)
- การ fallback ของ `toString()` ในกรณี ISO format ไม่รองรับ (`testToString_fallbackSafetyCheck`) — ทดสอบเพียง sanity (ไม่ throw, ไม่ null) เพราะไม่สามารถยืนยัน ISO format availability จากซอร์สที่ให้มาได้