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
