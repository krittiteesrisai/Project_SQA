โค้ดชุดทดสอบ JUnit 4 สำหรับ `ElitisticListPopulation` (Defects4J Math-35b)

```java
package org.apache.commons.math3.genetics;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Test;

/**
 * Unit tests สำหรับ ElitisticListPopulation
 *
 * หมายเหตุสำคัญ:
 * - ซอร์สโค้ดของ ListPopulation และ Chromosome ไม่ได้ถูกให้มาในโจทย์
 *   ดังนั้นในส่วนที่ต้องพึ่งพา behavior ของคลาสเหล่านี้ (เช่น การ validate
 *   null/ขนาด list ใน constructor ของ ListPopulation, ทิศทางการ sort
 *   ของ Chromosome.compareTo) จะมีคอมเมนต์กำกับไว้อย่างชัดเจนว่าเป็นข้อสันนิษฐาน
 *   ที่อ้างอิงจาก Javadoc/ชื่อเมธอดที่ปรากฏในคลาสเป้าหมายเท่านั้น
 * - จุดสำคัญที่ทดสอบคือ "fault" ที่ constructor ทั้งสองของ
 *   ElitisticListPopulation ไม่ได้ validate ค่า elitismRate (ไม่เรียก
 *   setElitismRate) ทำให้สามารถตั้งค่านอกช่วง [0,1] ได้โดยไม่มี exception
 *   และอาจทำให้ nextGeneration() คำนวณ index ผิดพลาด (ติดลบ) จนเกิด
 *   IndexOutOfBoundsException เมื่อ elitismRate > 1
 */
public class ElitisticListPopulationTest {

    /** Chromosome มืด ๆ สำหรับทดสอบ โดยใช้ fitness ตามที่กำหนด */
    private static class DummyChromosome extends Chromosome {
        private final double fit;

        DummyChromosome(double fit) {
            this.fit = fit;
        }

        @Override
        public double fitness() {
            return fit;
        }
    }

    private List<Chromosome> buildChromosomes(double... fitnessValues) {
        List<Chromosome> list = new ArrayList<Chromosome>();
        for (double f : fitnessValues) {
            list.add(new DummyChromosome(f));
        }
        return list;
    }

    // ---------------------------------------------------------------
    // Constructor: (List<Chromosome>, populationLimit, elitismRate)
    // ---------------------------------------------------------------

    @Test
    public void testConstructorWithChromosomes_ValidElitismRate() {
        List<Chromosome> chromosomes = buildChromosomes(1.0, 2.0, 3.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 10, 0.9);

        assertEquals(0.9, pop.getElitismRate(), 0.0);
        assertEquals(10, pop.getPopulationLimit());
        assertEquals(3, pop.getChromosomes().size());
    }

    @Test
    public void testConstructorWithChromosomes_ElitismRateAboveOne_NoValidation() {
        // FAULT-ORIENTED TEST:
        // Constructor ไม่เรียก setElitismRate() จึงไม่ throw OutOfRangeException
        // แม้ค่า elitismRate อยู่นอกช่วง [0,1]
        List<Chromosome> chromosomes = buildChromosomes(1.0, 2.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 5, 1.5);

        assertEquals(1.5, pop.getElitismRate(), 0.0);
    }

    @Test
    public void testConstructorWithChromosomes_ElitismRateNegative_NoValidation() {
        // FAULT-ORIENTED TEST: เช่นเดียวกับด้านบนแต่ด้วยค่าติดลบ
        List<Chromosome> chromosomes = buildChromosomes(1.0, 2.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 5, -0.3);

        assertEquals(-0.3, pop.getElitismRate(), 0.0);
    }

    // ---------------------------------------------------------------
    // Constructor: (populationLimit, elitismRate)
    // ---------------------------------------------------------------

    @Test
    public void testConstructorPopulationLimitOnly_ValidElitismRate() {
        ElitisticListPopulation pop = new ElitisticListPopulation(10, 0.5);
        assertEquals(0.5, pop.getElitismRate(), 0.0);
        assertEquals(10, pop.getPopulationLimit());
        assertEquals(0, pop.getChromosomes().size());
    }

    @Test
    public void testConstructorPopulationLimitOnly_ElitismRateOutOfRange_NoValidation() {
        // FAULT-ORIENTED TEST: ไม่มีการ validate ค่า rate ใน constructor นี้เช่นกัน
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 2.0);
        assertEquals(2.0, pop.getElitismRate(), 0.0);
    }

    // ---------------------------------------------------------------
    // setElitismRate / getElitismRate
    // ---------------------------------------------------------------

    @Test
    public void testSetElitismRate_BoundaryZero() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.5);
        pop.setElitismRate(0.0);
        assertEquals(0.0, pop.getElitismRate(), 0.0);
    }

    @Test
    public void testSetElitismRate_BoundaryOne() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.5);
        pop.setElitismRate(1.0);
        assertEquals(1.0, pop.getElitismRate(), 0.0);
    }

    @Test
    public void testSetElitismRate_MidValue() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.5);
        pop.setElitismRate(0.42);
        assertEquals(0.42, pop.getElitismRate(), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRate_BelowZero_ThrowsException() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.5);
        pop.setElitismRate(-0.0001);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetElitismRate_AboveOne_ThrowsException() {
        ElitisticListPopulation pop = new ElitisticListPopulation(5, 0.5);
        pop.setElitismRate(1.0001);
    }

    // ---------------------------------------------------------------
    // nextGeneration()
    // ---------------------------------------------------------------

    @Test
    public void testNextGeneration_RateOne_AllChromosomesCopied() {
        // elitismRate = 1.0 => boundIndex = ceil((1-1)*size) = 0
        // loop วิ่งจาก 0 ถึง size-1 ครบทั้งหมด -> ได้ chromosome ทั้งหมด
        List<Chromosome> chromosomes = buildChromosomes(3.0, 1.0, 2.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 10, 1.0);

        Population next = pop.nextGeneration();

        assertTrue(next instanceof ElitisticListPopulation);
        assertEquals(3, ((ElitisticListPopulation) next).getChromosomes().size());
    }

    @Test
    public void testNextGeneration_RateZero_NoChromosomesCopied() {
        // elitismRate = 0.0 => boundIndex = ceil((1-0)*size) = size
        // loop ไม่ execute เลย เพราะ i เริ่มที่ size ซึ่งไม่ < size
        List<Chromosome> chromosomes = buildChromosomes(3.0, 1.0, 2.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 10, 0.0);

        Population next = pop.nextGeneration();

        assertEquals(0, ((ElitisticListPopulation) next).getChromosomes().size());
    }

    @Test
    public void testNextGeneration_MidRate_PartialChromosomesCopied() {
        // size=4, rate=0.5 -> boundIndex = ceil(0.5*4) = 2
        // ผลลัพธ์ที่คาดหวัง: ได้ chromosome 4-2 = 2 ตัว (loop จาก i=2 ถึง 3)
        List<Chromosome> chromosomes = buildChromosomes(4.0, 1.0, 3.0, 2.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 10, 0.5);

        Population next = pop.nextGeneration();

        assertEquals(2, ((ElitisticListPopulation) next).getChromosomes().size());
    }

    @Test
    public void testNextGeneration_PreservesPopulationLimitAndRate() {
        // ตรวจสอบว่า ElitisticListPopulation ใหม่ที่สร้างขึ้นใน nextGeneration()
        // ใช้ populationLimit และ elitismRate เดิม
        List<Chromosome> chromosomes = buildChromosomes(1.0, 2.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 20, 0.75);

        ElitisticListPopulation next =
                (ElitisticListPopulation) pop.nextGeneration();

        assertEquals(20, next.getPopulationLimit());
        assertEquals(0.75, next.getElitismRate(), 0.0);
    }

    @Test
    public void testNextGeneration_SortsOriginalChromosomeListAsSideEffect() {
        // nextGeneration() เรียก Collections.sort(oldChromosomes) โดยตรงกับ
        // list อ้างอิงที่ได้จาก getChromosomes() ดังนั้น list เดิมใน population
        // ต้นฉบับจะถูก sort ไปด้วย (side effect)
        // ข้อสันนิษฐาน: Chromosome.compareTo เรียงจาก fitness น้อยไปมาก
        // (ตาม Javadoc ของคลาสเป้าหมายที่กล่าวถึง "best chromosomes" อยู่ปลาย list)
        List<Chromosome> chromosomes = buildChromosomes(5.0, 1.0, 3.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 10, 0.5);

        pop.nextGeneration();

        List<Chromosome> sortedOriginal = pop.getChromosomes();
        assertEquals(3, sortedOriginal.size());
        // ตรวจสอบเพียงว่าลำดับถูกจัดเรียงแล้ว (ascending ตามข้อสันนิษฐานข้างต้น)
        assertTrue(sortedOriginal.get(0).fitness()
                <= sortedOriginal.get(1).fitness());
        assertTrue(sortedOriginal.get(1).fitness()
                <= sortedOriginal.get(2).fitness());
    }

    @Test
    public void testNextGeneration_EmptyPopulation_NoException() {
        // size = 0, rate = 0.5 -> boundIndex = ceil(0.5*0) = 0
        // loop: i=0, 0<0 เป็น false ทันที ไม่เกิด exception
        List<Chromosome> chromosomes = buildChromosomes(); // empty
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 5, 0.5);

        Population next = pop.nextGeneration();

        assertEquals(0, ((ElitisticListPopulation) next).getChromosomes().size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testNextGeneration_ElitismRateGreaterThanOne_CausesIndexOutOfBounds() {
        // FAULT-ORIENTED TEST:
        // elitismRate = 1.5 (ไม่ถูก validate ตอน construct)
        // boundIndex = ceil((1-1.5)*size) = ceil(-0.5*size) ซึ่งติดลบ
        // ทำให้ for-loop เริ่มที่ index ติดลบ และ oldChromosomes.get(negative)
        // จะ throw IndexOutOfBoundsException -> พฤติกรรมนี้สืบเนื่องโดยตรง
        // จากการวิเคราะห์สูตรคำนวณ boundIndex ในซอร์สโค้ดที่ให้มา
        List<Chromosome> chromosomes = buildChromosomes(1.0, 2.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 5, 1.5);

        pop.nextGeneration();
    }

    @Test
    public void testNextGeneration_ElitismRateNegative_ResultsInEmptyPopulation() {
        // elitismRate = -0.5 -> boundIndex = ceil((1-(-0.5))*size) = ceil(1.5*size)
        // ซึ่งมากกว่า size เสมอ (เมื่อ size > 0) ทำให้ loop ไม่ execute เลย
        // (ไม่เกิด exception แต่ได้ประชากรว่างซึ่งไม่ตรงกับ "ความคาดหวัง" ของ elitism)
        List<Chromosome> chromosomes = buildChromosomes(1.0, 2.0, 3.0);
        ElitisticListPopulation pop =
                new ElitisticListPopulation(chromosomes, 5, -0.5);

        Population next = pop.nextGeneration();

        assertEquals(0, ((ElitisticListPopulation) next).getChromosomes().size());
    }

    // ---------------------------------------------------------------
    // Null / invalid list input (behavior ขึ้นกับ ListPopulation superclass
    // ซึ่งไม่มีซอร์สโค้ดให้ จึงตรวจสอบเพียงว่ามี RuntimeException เกิดขึ้น
    // โดยไม่ระบุ exception type ที่เจาะจง)
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testConstructorWithNullChromosomeList_ThrowsRuntimeException() {
        // หมายเหตุ: ไม่ทราบ exception type ที่แน่ชัดจาก ListPopulation
        // (อาจเป็น NullPointerException หรือ NullArgumentException)
        // จึงทดสอบแบบกว้างว่าต้องมี RuntimeException เกิดขึ้นเท่านั้น
        new ElitisticListPopulation(null, 5, 0.5);
    }
}
```

สรุปตารางความครอบคลุม (Branch/Condition)

| ลำดับ | เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| 1 | testConstructorWithChromosomes_ValidElitismRate | Constructor(List, limit, rate) ปกติ, getElitismRate/getPopulationLimit/getChromosomes ปกติ |
| 2 | testConstructorWithChromosomes_ElitismRateAboveOne_NoValidation | Constructor ไม่ validate rate > 1 (fault) |
| 3 | testConstructorWithChromosomes_ElitismRateNegative_NoValidation | Constructor ไม่ validate rate < 0 (fault) |
| 4 | testConstructorPopulationLimitOnly_ValidElitismRate | Constructor(limit, rate) ปกติ |
| 5 | testConstructorPopulationLimitOnly_ElitismRateOutOfRange_NoValidation | Constructor(limit, rate) ไม่ validate rate นอกช่วง (fault) |
| 6 | testSetElitismRate_BoundaryZero | setElitismRate: เงื่อนไข elitismRate < 0 เป็น false ที่ค่าขอบ 0 |
| 7 | testSetElitismRate_BoundaryOne | setElitismRate: เงื่อนไข elitismRate > 1 เป็น false ที่ค่าขอบ 1 |
| 8 | testSetElitismRate_MidValue | setElitismRate: path ปกติ (ไม่เข้า if) |
| 9 | testSetElitismRate_BelowZero_ThrowsException | setElitismRate: branch elitismRate < 0 = true -> throw |
| 10 | testSetElitismRate_AboveOne_ThrowsException | setElitismRate: branch elitismRate > 1 = true -> throw |
| 11 | testNextGeneration_RateOne_AllChromosomesCopied | nextGeneration: boundIndex=0, loop รันครบทุกตัว |
| 12 | testNextGeneration_RateZero_NoChromosomesCopied | nextGeneration: boundIndex=size, loop ไม่ execute |
| 13 | testNextGeneration_MidRate_PartialChromosomesCopied | nextGeneration: boundIndex กลาง ๆ, loop รันบางส่วน |
| 14 | testNextGeneration_PreservesPopulationLimitAndRate | nextGeneration: การสร้าง ElitisticListPopulation ใหม่ด้วย limit/rate เดิม |
| 15 | testNextGeneration_SortsOriginalChromosomeListAsSideEffect | nextGeneration: Collections.sort(oldChromosomes) side effect |
| 16 | testNextGeneration_EmptyPopulation_NoException | nextGeneration: size=0, loop condition false ทันที |
| 17 | testNextGeneration_ElitismRateGreaterThanOne_CausesIndexOutOfBounds | nextGeneration: boundIndex ติดลบจาก rate>1 (fault-detecting) |
| 18 | testNextGeneration_ElitismRateNegative_ResultsInEmptyPopulation | nextGeneration: boundIndex > size จาก rate<0, loop ไม่ execute |
| 19 | testConstructorWithNullChromosomeList_ThrowsRuntimeException | Constructor: null chromosomes list (behavior จาก superclass, ตรวจแบบกว้าง) |