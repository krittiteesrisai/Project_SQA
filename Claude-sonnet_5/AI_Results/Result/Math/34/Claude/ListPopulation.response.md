# JUnit 4 Test Suite สำหรับ `ListPopulation`

## หมายเหตุสำคัญก่อนเขียนโค้ด (สมมติฐานที่ต้องใช้)

เนื่องจาก `ListPopulation` เป็น abstract class และพึ่งพา:
1. **`Population` interface** (ต้อง implement `nextGeneration()` เพราะ abstract)
2. **`Chromosome` abstract class** (ต้อง implement `fitness()`)

ซึ่งซอร์สโค้ดทั้งสองไม่ได้ถูกแสดงในคำถาม จึงต้องสร้าง **stub/dummy class** ขึ้นมาเพื่อให้ทดสอบได้ โดยอ้างอิงจาก behavior ที่ปรากฏในซอร์สของ `ListPopulation` เอง (เช่น `compareTo` ของ `Chromosome` ต้องส่งผลให้ fitness สูงกว่า = มากกว่า เพื่อให้ `getFittestChromosome()` ทำงานได้ตามตรรกะที่เห็น) — **หากพฤติกรรมจริงต่างจากนี้ ให้ถือว่าเป็นสมมติฐานที่ต้องปรับปรุง**

ทดสอบถูกวางไว้ใน package เดียวกัน (`org.apache.commons.math3.genetics`) เพื่อให้เข้าถึง protected method `getChromosomeList()` ได้โดยตรง

```java
package org.apache.commons.math3.genetics;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.junit.Test;

public class ListPopulationTest {

    // ===== Stub classes จำเป็นต้องสร้างเพราะ ListPopulation/Chromosome เป็น abstract =====
    // สมมติฐาน: Chromosome.compareTo ใช้ fitness() เป็นเกณฑ์ (fitness สูงกว่า = compareTo > 0)
    private static class DummyChromosome extends Chromosome {
        private final double fitnessValue;
        DummyChromosome(double fitnessValue) { this.fitnessValue = fitnessValue; }
        @Override
        public double fitness() { return fitnessValue; }
    }

    private static class DummyListPopulation extends ListPopulation {
        DummyListPopulation(int limit) { super(limit); }
        DummyListPopulation(List<Chromosome> chromosomes, int limit) { super(chromosomes, limit); }
        @Override
        public Population nextGeneration() { return null; } // ไม่ใช้ในชุดทดสอบนี้
    }

    private List<Chromosome> makeChromosomes(int n) {
        List<Chromosome> list = new ArrayList<Chromosome>();
        for (int i = 0; i < n; i++) {
            list.add(new DummyChromosome(i));
        }
        return list;
    }

    // ---------------- Constructor(int populationLimit) ----------------

    @Test
    public void testConstructorWithLimitOnly_Valid() {
        DummyListPopulation pop = new DummyListPopulation(5);
        assertEquals(5, pop.getPopulationLimit());
        assertEquals(0, pop.getPopulationSize());
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorWithLimitOnly_Zero() {
        new DummyListPopulation(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorWithLimitOnly_Negative() {
        new DummyListPopulation(-1);
    }

    // ---------------- Constructor(List, int populationLimit) ----------------

    @Test(expected = NullArgumentException.class)
    public void testConstructorWithListNull() {
        new DummyListPopulation(null, 5);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorWithListAndNonPositiveLimit() {
        new DummyListPopulation(new ArrayList<Chromosome>(), 0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorWithListExceedingLimit() {
        new DummyListPopulation(makeChromosomes(6), 5);
    }

    @Test
    public void testConstructorWithListEqualToLimit_Boundary() {
        List<Chromosome> list = makeChromosomes(5);
        DummyListPopulation pop = new DummyListPopulation(list, 5);
        assertEquals(5, pop.getPopulationSize());
        assertEquals(5, pop.getPopulationLimit());
    }

    @Test
    public void testConstructorWithListLessThanLimit() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(3), 5);
        assertEquals(3, pop.getPopulationSize());
    }

    // ---------------- setChromosomes ----------------

    @Test(expected = NullArgumentException.class)
    public void testSetChromosomesNull() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setChromosomes(null);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testSetChromosomesExceedLimit() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setChromosomes(makeChromosomes(6));
    }

    @Test
    public void testSetChromosomesValid_ReplacesExisting() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(3), 5);
        pop.setChromosomes(makeChromosomes(2));
        assertEquals(2, pop.getPopulationSize());
    }

    @Test
    public void testSetChromosomesBoundary_EqualToLimit() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setChromosomes(makeChromosomes(5));
        assertEquals(5, pop.getPopulationSize());
    }

    // ---------------- addChromosomes(Collection) ----------------

    @Test
    public void testAddChromosomesValid() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.addChromosomes(makeChromosomes(3));
        assertEquals(3, pop.getPopulationSize());
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosomesExceedLimit() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(3), 5);
        pop.addChromosomes(makeChromosomes(3)); // 3+3=6 > 5
    }

    @Test
    public void testAddChromosomesBoundary_ExactlyAtLimit() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(2), 5);
        pop.addChromosomes(makeChromosomes(3)); // 2+3=5 == limit -> ไม่ throw
        assertEquals(5, pop.getPopulationSize());
    }

    // ---------------- getChromosomes (unmodifiable) ----------------

    @Test
    public void testGetChromosomesUnmodifiable() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(2), 5);
        List<Chromosome> chroms = pop.getChromosomes();
        try {
            chroms.add(new DummyChromosome(99));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------------- getChromosomeList (protected, same package) ----------------

    @Test
    public void testGetChromosomeListReturnsBackingList() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(1));
        List<Chromosome> internal = pop.getChromosomeList();
        assertEquals(1, internal.size());
        internal.add(new DummyChromosome(2)); // แก้ผ่าน backing list ต้องสะท้อนกลับ
        assertEquals(2, pop.getPopulationSize());
    }

    // ---------------- addChromosome(Chromosome) ----------------

    @Test
    public void testAddChromosomeValid() {
        DummyListPopulation pop = new DummyListPopulation(2);
        pop.addChromosome(new DummyChromosome(1));
        assertEquals(1, pop.getPopulationSize());
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosomeExceedLimit_Boundary() {
        DummyListPopulation pop = new DummyListPopulation(1);
        pop.addChromosome(new DummyChromosome(1)); // size(0) < limit(1) -> ok, size=1
        pop.addChromosome(new DummyChromosome(2)); // size(1) >= limit(1) -> throw
    }

    // ---------------- getFittestChromosome ----------------

    @Test
    public void testGetFittestChromosome_SingleElement() {
        DummyChromosome c = new DummyChromosome(5);
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(c);
        DummyListPopulation pop = new DummyListPopulation(list, 1);
        assertSame(c, pop.getFittestChromosome());
    }

    @Test
    public void testGetFittestChromosome_MultipleElements() {
        DummyChromosome c1 = new DummyChromosome(1);
        DummyChromosome c2 = new DummyChromosome(5);
        DummyChromosome c3 = new DummyChromosome(3);
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(c1); list.add(c2); list.add(c3);
        DummyListPopulation pop = new DummyListPopulation(list, 3);
        assertSame(c2, pop.getFittestChromosome());
    }

    @Test
    public void testGetFittestChromosome_TieKeepsFirst() {
        // ทดสอบว่าเมื่อ fitness เท่ากัน (compareTo == 0) ตัวแรกยังเป็น best เพราะเงื่อนไขคือ "> 0" เท่านั้น
        DummyChromosome c1 = new DummyChromosome(5);
        DummyChromosome c2 = new DummyChromosome(5);
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(c1); list.add(c2);
        DummyListPopulation pop = new DummyListPopulation(list, 2);
        assertSame(c1, pop.getFittestChromosome());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFittestChromosome_EmptyPopulation() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.getFittestChromosome(); // chromosomes.get(0) ล้มเหลวบน empty list
    }

    // ---------------- getPopulationLimit / setPopulationLimit ----------------

    @Test
    public void testGetPopulationLimit() {
        DummyListPopulation pop = new DummyListPopulation(7);
        assertEquals(7, pop.getPopulationLimit());
    }

    @Test
    public void testSetPopulationLimitValid() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setPopulationLimit(10);
        assertEquals(10, pop.getPopulationLimit());
    }

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimitZero() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setPopulationLimit(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimitNegative() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.setPopulationLimit(-3);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSetPopulationLimitSmallerThanCurrentSize() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(4), 5);
        pop.setPopulationLimit(3); // < current size(4)
    }

    @Test
    public void testSetPopulationLimitEqualToCurrentSize_Boundary() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(4), 5);
        pop.setPopulationLimit(4); // เท่ากับ current size -> ต้องไม่ throw
        assertEquals(4, pop.getPopulationLimit());
    }

    // ---------------- getPopulationSize ----------------

    @Test
    public void testGetPopulationSize() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(3), 5);
        assertEquals(3, pop.getPopulationSize());
    }

    // ---------------- toString ----------------

    @Test
    public void testToString() {
        List<Chromosome> list = makeChromosomes(2);
        DummyListPopulation pop = new DummyListPopulation(list, 5);
        assertEquals(list.toString(), pop.toString());
    }

    // ---------------- iterator ----------------

    @Test
    public void testIteratorIteratesAllChromosomes() {
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(3), 5);
        Iterator<Chromosome> it = pop.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testIteratorRemove_ActualBehavior() {
        // หมายเหตุ: Javadoc ระบุว่า remove() ควร throw UnsupportedOperationException
        // แต่โค้ดจริง (iterator() คืนค่า chromosomes.iterator() ของ ArrayList ตรง ๆ)
        // ทำให้ remove() สำเร็จจริง — นี่คือพฤติกรรมจริงตามซอร์สโค้ด ไม่ใช่การเดา
        DummyListPopulation pop = new DummyListPopulation(makeChromosomes(3), 5);
        Iterator<Chromosome> it = pop.iterator();
        it.next();
        it.remove();
        assertEquals(2, pop.getPopulationSize());
    }
}
```

## ตารางสรุป Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorWithLimitOnly_Valid` | Constructor(int) → delegate ไปยัง Constructor(list, limit) path ปกติ |
| `testConstructorWithLimitOnly_Zero/Negative` | `populationLimit <= 0` → true (NotPositiveException) |
| `testConstructorWithListNull` | `chromosomes == null` → true (NullArgumentException) |
| `testConstructorWithListAndNonPositiveLimit` | `populationLimit <= 0` → true ในเส้นทาง list+limit |
| `testConstructorWithListExceedingLimit` | `chromosomes.size() > populationLimit` → true |
| `testConstructorWithListEqualToLimit_Boundary` | boundary `size == limit` → false (ไม่ throw) |
| `testConstructorWithListLessThanLimit` | `size < limit` → false (ไม่ throw) |
| `testSetChromosomesNull` | `setChromosomes`: null check → true |
| `testSetChromosomesExceedLimit` | `setChromosomes`: size > limit → true |
| `testSetChromosomesValid_ReplacesExisting` | `setChromosomes`: ไม่ throw, clear+addAll ทำงาน |
| `testSetChromosomesBoundary_EqualToLimit` | boundary size == limit → false |
| `testAddChromosomesValid` | `addChromosomes`: sum <= limit → false (ไม่ throw) |
| `testAddChromosomesExceedLimit` | `addChromosomes`: sum > limit → true |
| `testAddChromosomesBoundary_ExactlyAtLimit` | boundary sum == limit → false |
| `testGetChromosomesUnmodifiable` | ตรวจ `Collections.unmodifiableList` wrapper |
| `testGetChromosomeListReturnsBackingList` | ตรวจ protected method คืน reference เดียวกับ internal list |
| `testAddChromosomeValid` | `addChromosome`: size < limit → false (ไม่ throw) |
| `testAddChromosomeExceedLimit_Boundary` | `addChromosome`: size >= limit → true (boundary) |
| `testGetFittestChromosome_SingleElement` | loop ทำงาน 1 ครั้ง, if condition false (ไม่มีตัวเทียบ) |
| `testGetFittestChromosome_MultipleElements` | loop หลายครั้ง, if `compareTo > 0` → true บางรอบ |
| `testGetFittestChromosome_TieKeepsFirst` | if `compareTo > 0` → false เมื่อ fitness เท่ากัน (เงื่อนไข strict >) |
| `testGetFittestChromosome_EmptyPopulation` | `chromosomes.get(0)` กับ list ว่าง → IndexOutOfBoundsException |
| `testGetPopulationLimit` | getter พื้นฐาน |
| `testSetPopulationLimitValid` | `setPopulationLimit`: ทั้งสอง condition false |
| `testSetPopulationLimitZero/Negative` | `populationLimit <= 0` → true |
| `testSetPopulationLimitSmallerThanCurrentSize` | `populationLimit < chromosomes.size()` → true |
| `testSetPopulationLimitEqualToCurrentSize_Boundary` | boundary `limit == size` → false |
| `testGetPopulationSize` | getter พื้นฐาน |
| `testToString` | ตรวจ delegate ไปยัง `chromosomes.toString()` |
| `testIteratorIteratesAllChromosomes` | loop ผ่าน iterator ปกติ |
| `testIteratorRemove_ActualBehavior` | ตรวจพฤติกรรมจริงของ `remove()` (ต่างจาก javadoc) — ดักจับ documentation/behavior mismatch |

**ข้อสังเกตเรื่อง fault ที่อาจดักจับได้:** `testIteratorRemove_ActualBehavior` เผยให้เห็นว่า Javadoc ของ `iterator()` ระบุว่าจะ throw `UnsupportedOperationException` แต่โค้ดจริงไม่ได้ wrap ด้วย unmodifiable iterator ทำให้ `remove()` ทำงานได้จริง ซึ่งถือเป็นข้อบกพร่องเชิงพฤติกรรม/เอกสารที่ควรรายงาน