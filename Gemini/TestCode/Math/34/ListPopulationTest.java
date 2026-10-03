package org.apache.commons.math3.genetics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.junit.Assert;
import org.junit.Test;

public class ListPopulationTest {

    // Concrete implementation สำหรับทดสอบ Abstract Class
    private static class DummyListPopulation extends ListPopulation {
        public DummyListPopulation(final int populationLimit) {
            super(populationLimit);
        }

        public DummyListPopulation(final List<Chromosome> chromosomes, final int populationLimit) {
            super(chromosomes, populationLimit);
        }

        @Override
        public Population nextGeneration() {
            return null;
        }
    }

    // Concrete Chromosome สำหรับใช้สร้างข้อมูลทดสอบ
    private static class DummyChromosome extends Chromosome {
        private final double fitness;

        public DummyChromosome(final double fitness) {
            this.fitness = fitness;
        }

        @Override
        public double getFitness() {
            return this.fitness;
        }

        @Override
        public String toString() {
            return "DummyChromosome(" + fitness + ")";
        }
    }

    // ==========================================
    // 1. Constructor Tests
    // ==========================================

    @Test
    public void testConstructorWithLimitOnlyValid() {
        ListPopulation pop = new DummyListPopulation(10);
        Assert.assertEquals(10, pop.getPopulationLimit());
        Assert.assertEquals(0, pop.getPopulationSize());
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorWithLimitZeroThrowsNotPositiveException() {
        new DummyListPopulation(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorWithLimitNegativeThrowsNotPositiveException() {
        new DummyListPopulation(-5);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructorNullChromosomesThrowsNullArgumentException() {
        new DummyListPopulation(null, 10);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorChromosomesAndZeroLimitThrowsNotPositiveException() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        new DummyListPopulation(list, 0);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructorChromosomesAndNegativeLimitThrowsNotPositiveException() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        new DummyListPopulation(list, -1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructorChromosomesExceedLimitThrowsNumberIsTooLargeException() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        list.add(new DummyChromosome(2.0));
        new DummyListPopulation(list, 1);
    }

    @Test
    public void testConstructorValidWithChromosomes() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        list.add(new DummyChromosome(2.0));
        ListPopulation pop = new DummyListPopulation(list, 2);
        Assert.assertEquals(2, pop.getPopulationLimit());
        Assert.assertEquals(2, pop.getPopulationSize());
    }

    // ==========================================
    // 2. setChromosomes Tests
    // ==========================================

    @Test(expected = NullArgumentException.class)
    public void testSetChromosomesNullThrowsNullArgumentException() {
        ListPopulation pop = new DummyListPopulation(5);
        pop.setChromosomes(null);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testSetChromosomesExceedsLimitThrowsNumberIsTooLargeException() {
        ListPopulation pop = new DummyListPopulation(2);
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        list.add(new DummyChromosome(2.0));
        list.add(new DummyChromosome(3.0));
        pop.setChromosomes(list);
    }

    @Test
    public void testSetChromosomesReplacesExisting() {
        ListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(10.0));

        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        list.add(new DummyChromosome(2.0));

        pop.setChromosomes(list);
        Assert.assertEquals(2, pop.getPopulationSize());
        Assert.assertEquals(2.0, pop.getFittestChromosome().getFitness(), 1e-6);
    }

    // ==========================================
    // 3. addChromosomes Tests
    // ==========================================

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosomesExceedsLimitThrowsNumberIsTooLargeException() {
        ListPopulation pop = new DummyListPopulation(3);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));

        List<Chromosome> toAdd = new ArrayList<Chromosome>();
        toAdd.add(new DummyChromosome(3.0));
        toAdd.add(new DummyChromosome(4.0));

        pop.addChromosomes(toAdd);
    }

    @Test
    public void testAddChromosomesUpToLimitBoundary() {
        ListPopulation pop = new DummyListPopulation(3);
        pop.addChromosome(new DummyChromosome(1.0));

        List<Chromosome> toAdd = new ArrayList<Chromosome>();
        toAdd.add(new DummyChromosome(2.0));
        toAdd.add(new DummyChromosome(3.0));

        pop.addChromosomes(toAdd);
        Assert.assertEquals(3, pop.getPopulationSize());
    }

    @Test
    public void testAddChromosomesEmptyCollection() {
        ListPopulation pop = new DummyListPopulation(3);
        pop.addChromosomes(Collections.<Chromosome>emptyList());
        Assert.assertEquals(0, pop.getPopulationSize());
    }

    // ==========================================
    // 4. addChromosome Tests
    // ==========================================

    @Test
    public void testAddChromosomeSuccess() {
        ListPopulation pop = new DummyListPopulation(2);
        pop.addChromosome(new DummyChromosome(1.0));
        Assert.assertEquals(1, pop.getPopulationSize());
        pop.addChromosome(new DummyChromosome(2.0));
        Assert.assertEquals(2, pop.getPopulationSize());
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testAddChromosomeWhenFullThrowsNumberIsTooLargeException() {
        ListPopulation pop = new DummyListPopulation(1);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));
    }

    // ==========================================
    // 5. getFittestChromosome Tests
    // ==========================================

    @Test
    public void testGetFittestChromosomeVariousPositions() {
        // กรณีตัวแรกสุดดีที่สุด
        ListPopulation pop1 = new DummyListPopulation(3);
        pop1.addChromosome(new DummyChromosome(10.0));
        pop1.addChromosome(new DummyChromosome(5.0));
        pop1.addChromosome(new DummyChromosome(2.0));
        Assert.assertEquals(10.0, pop1.getFittestChromosome().getFitness(), 1e-6);

        // กรณีตัวสุดท้ายดีที่สุด
        ListPopulation pop2 = new DummyListPopulation(3);
        pop2.addChromosome(new DummyChromosome(1.0));
        pop2.addChromosome(new DummyChromosome(5.0));
        pop2.addChromosome(new DummyChromosome(20.0));
        Assert.assertEquals(20.0, pop2.getFittestChromosome().getFitness(), 1e-6);

        // กรณีคะแนนเท่ากัน
        ListPopulation pop3 = new DummyListPopulation(3);
        DummyChromosome c1 = new DummyChromosome(15.0);
        DummyChromosome c2 = new DummyChromosome(15.0);
        pop3.addChromosome(c1);
        pop3.addChromosome(c2);
        Assert.assertSame(c1, pop3.getFittestChromosome());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFittestChromosomeEmptyThrowsException() {
        ListPopulation pop = new DummyListPopulation(5);
        pop.getFittestChromosome();
    }

    // ==========================================
    // 6. setPopulationLimit Tests
    // ==========================================

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimitZeroThrowsNotPositiveException() {
        ListPopulation pop = new DummyListPopulation(5);
        pop.setPopulationLimit(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testSetPopulationLimitNegativeThrowsNotPositiveException() {
        ListPopulation pop = new DummyListPopulation(5);
        pop.setPopulationLimit(-10);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testSetPopulationLimitSmallerThanCurrentSizeThrowsNumberIsTooSmallException() {
        ListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));
        pop.addChromosome(new DummyChromosome(3.0));
        pop.setPopulationLimit(2);
    }

    @Test
    public void testSetPopulationLimitExactCurrentSize() {
        ListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));
        pop.setPopulationLimit(2);
        Assert.assertEquals(2, pop.getPopulationLimit());
    }

    @Test
    public void testSetPopulationLimitIncrease() {
        ListPopulation pop = new DummyListPopulation(2);
        pop.setPopulationLimit(10);
        Assert.assertEquals(10, pop.getPopulationLimit());
    }

    // ==========================================
    // 7. Immutability & Iterator Tests (Defects4J Math-34 bug check)
    // ==========================================

    @Test(expected = UnsupportedOperationException.class)
    public void testGetChromosomesIsUnmodifiable() {
        ListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(1.0));
        List<Chromosome> list = pop.getChromosomes();
        list.add(new DummyChromosome(2.0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveThrowsUnsupportedOperationException() {
        // ทดสอบ Bug ของ Math-34: iterator() ต้องไม่อนุญาตให้ลบข้อมูลออกได้
        ListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(1.0));
        Iterator<Chromosome> it = pop.iterator();
        Assert.assertTrue(it.hasNext());
        it.next();
        it.remove();
    }

    @Test
    public void testIteratorTraverse() {
        ListPopulation pop = new DummyListPopulation(3);
        pop.addChromosome(new DummyChromosome(1.0));
        pop.addChromosome(new DummyChromosome(2.0));

        int count = 0;
        for (Chromosome chromosome : pop) {
            Assert.assertNotNull(chromosome);
            count++;
        }
        Assert.assertEquals(2, count);
    }

    // ==========================================
    // 8. Protected Method and toString Tests
    // ==========================================

    @Test
    public void testGetChromosomeListProtected() {
        DummyListPopulation pop = new DummyListPopulation(5);
        pop.addChromosome(new DummyChromosome(1.0));
        List<Chromosome> innerList = pop.getChromosomeList();
        Assert.assertEquals(1, innerList.size());
    }

    @Test
    public void testToString() {
        ListPopulation pop = new DummyListPopulation(5);
        DummyChromosome c = new DummyChromosome(1.0);
        pop.addChromosome(c);
        Assert.assertEquals("[" + c.toString() + "]", pop.toString());
    }
}