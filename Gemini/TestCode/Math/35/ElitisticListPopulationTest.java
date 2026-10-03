package org.apache.commons.math3.genetics;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

public class ElitisticListPopulationTest {

    // Dummy Chromosome สำหรับใช้ในการทดสอบ
    private static class DummyChromosome extends Chromosome {
        private final double fitness;

        public DummyChromosome(final double fitness) {
            this.fitness = fitness;
        }

        @Override
        public double getFitness() {
            return fitness;
        }

        @Override
        public int compareTo(Chromosome another) {
            return Double.compare(this.getFitness(), another.getFitness());
        }
    }

    // ==========================================
    // 1. Tests for Constructor: (int, double)
    // ==========================================

    @Test
    public void testConstructor1ValidBoundaries() {
        ElitisticListPopulation pop0 = new ElitisticListPopulation(100, 0.0);
        Assert.assertEquals(0.0, pop0.getElitismRate(), 1e-6);
        Assert.assertEquals(100, pop0.getPopulationLimit());

        ElitisticListPopulation pop1 = new ElitisticListPopulation(100, 1.0);
        Assert.assertEquals(1.0, pop1.getElitismRate(), 1e-6);

        ElitisticListPopulation popMid = new ElitisticListPopulation(100, 0.5);
        Assert.assertEquals(0.5, popMid.getElitismRate(), 1e-6);
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructor1RateTooLow() {
        // Defects4J Math-35: Constructor must validate elitismRate >= 0
        new ElitisticListPopulation(100, -0.25);
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructor1RateTooHigh() {
        // Defects4J Math-35: Constructor must validate elitismRate <= 1
        new ElitisticListPopulation(100, 1.25);
    }

    @Test(expected = NotPositiveException.class)
    public void testConstructor1InvalidPopulationLimit() {
        new ElitisticListPopulation(0, 0.5);
    }

    // ===================================================
    // 2. Tests for Constructor: (List, int, double)
    // ===================================================

    @Test
    public void testConstructor2Valid() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        list.add(new DummyChromosome(2.0));

        ElitisticListPopulation pop = new ElitisticListPopulation(list, 10, 0.2);
        Assert.assertEquals(0.2, pop.getElitismRate(), 1e-6);
        Assert.assertEquals(10, pop.getPopulationLimit());
        Assert.assertEquals(2, pop.getPopulationSize());
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructor2RateTooLow() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        // Defects4J Math-35: Constructor must validate elitismRate >= 0
        new ElitisticListPopulation(list, 10, -0.01);
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructor2RateTooHigh() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        // Defects4J Math-35: Constructor must validate elitismRate <= 1
        new ElitisticListPopulation(list, 10, 1.01);
    }

    @Test(expected = NullArgumentException.class)
    public void testConstructor2NullChromosomes() {
        new ElitisticListPopulation(null, 10, 0.5);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testConstructor2ChromosomesOverLimit() {
        List<Chromosome> list = new ArrayList<Chromosome>();
        list.add(new DummyChromosome(1.0));
        list.add(new DummyChromosome(2.0));
        new ElitisticListPopulation(list, 1, 0.5);
    }

    // ==========================================
    // 3. Tests for setElitismRate / getElitismRate
    // ==========================================

    @Test
    public void testSetElitismRateValid() {
        ElitisticListPopulation pop = new ElitisticListPopulation(10, 0.5);
        
        pop.setElitismRate(0.0);
        Assert.assertEquals(0.0, pop.getElitismRate(), 1e-6);

        pop.setElitismRate(1.0);
        Assert.assertEquals(1.0, pop.getElitismRate(), 1e-6);

        pop.setElitismRate(0.75);
        Assert.assertEquals(0.75, pop.getElitismRate(), 1e-6);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateNegative() {
        ElitisticListPopulation pop = new ElitisticListPopulation(10, 0.5);
        pop.setElitismRate(-0.0001);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRateGreaterThanOne() {
        ElitisticListPopulation pop = new ElitisticListPopulation(10, 0.5);
        pop.setElitismRate(1.0001);
    }

    // ==========================================
    // 4. Tests for nextGeneration()
    // ==========================================

    @Test
    public void testNextGenerationPartialElitism() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        for (int i = 1; i <= 10; i++) {
            // Fitness values: 1.0, 2.0, ..., 10.0
            chromosomes.add(new DummyChromosome(i));
        }

        // Elitism rate = 0.2 -> 20% ของ 10 = 2 โครโมโซมที่ดีที่สุด (9.0, 10.0)
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 10, 0.2);
        Population nextGen = pop.nextGeneration();

        Assert.assertEquals(2, nextGen.getPopulationSize());
        List<Chromosome> nextChromosomes = ((ElitisticListPopulation) nextGen).getChromosomes();
        Assert.assertEquals(9.0, nextChromosomes.get(0).getFitness(), 1e-6);
        Assert.assertEquals(10.0, nextChromosomes.get(1).getFitness(), 1e-6);
    }

    @Test
    public void testNextGenerationZeroElitismRate() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        for (int i = 1; i <= 5; i++) {
            chromosomes.add(new DummyChromosome(i));
        }

        // Elitism rate = 0.0 -> ไม่ควรมีโครโมโซมใดถูกส่งต่อ
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 10, 0.0);
        Population nextGen = pop.nextGeneration();

        Assert.assertEquals(0, nextGen.getPopulationSize());
    }

    @Test
    public void testNextGenerationFullElitismRate() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        for (int i = 1; i <= 5; i++) {
            chromosomes.add(new DummyChromosome(i));
        }

        // Elitism rate = 1.0 -> โครโมโซมทั้งหมด (5 ตัว) จะต้องถูกคัดลอกไปรุ่นถัดไป
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 10, 1.0);
        Population nextGen = pop.nextGeneration();

        Assert.assertEquals(5, nextGen.getPopulationSize());
    }

    @Test
    public void testNextGenerationRoundingUp() {
        List<Chromosome> chromosomes = new ArrayList<Chromosome>();
        for (int i = 1; i <= 3; i++) {
            chromosomes.add(new DummyChromosome(i));
        }

        // 3 chromosomes, elitismRate = 0.25
        // ceil((1.0 - 0.25) * 3) = ceil(2.25) = 3 -> loop จาก 3 ถึง 3 (0 chromosomes)
        ElitisticListPopulation pop = new ElitisticListPopulation(chromosomes, 10, 0.25);
        Population nextGen = pop.nextGeneration();
        Assert.assertEquals(0, nextGen.getPopulationSize());

        // elitismRate = 0.5
        // ceil((1.0 - 0.5) * 3) = ceil(1.5) = 2 -> loop จาก 2 ถึง 3 (1 chromosome ที่ดีที่สุดคือ fitness 3.0)
        pop.setElitismRate(0.5);
        nextGen = pop.nextGeneration();
        Assert.assertEquals(1, nextGen.getPopulationSize());
        Assert.assertEquals(3.0, ((ElitisticListPopulation) nextGen).getChromosomes().get(0).getFitness(), 1e-6);
    }
}