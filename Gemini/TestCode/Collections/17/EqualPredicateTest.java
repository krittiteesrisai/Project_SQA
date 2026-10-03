package org.apache.commons.collections.functors;

import org.apache.commons.collections.Predicate;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqualPredicateTest {

    @Test
    public void testEqualPredicateFactoryWithNullObject() {
        // ทดสอบกรณี object เป็น null ใน factory method ตัวแรก (ควรคืนค่า NullPredicate)
        Predicate<String> predicate = EqualPredicate.equalPredicate(null);
        assertNotNull(predicate);
        assertTrue(predicate instanceof NullPredicate);
    }

    @Test
    public void testEqualPredicateFactoryWithNonNullObject() {
        // ทดสอบกรณี object ไม่เป็น null ใน factory method ตัวแรก (ควรได้ EqualPredicate)
        Predicate<String> predicate = EqualPredicate.equalPredicate("TestValue");
        assertNotNull(predicate);
        assertTrue(predicate instanceof EqualPredicate);
        assertEquals("TestValue", ((EqualPredicate<String>) predicate).getValue());
    }

    @Test
    public void testEqualPredicateWithEquatorFactoryNullObject() {
        // ทดสอบกรณี object เป็น null ใน factory method แบบมี Equator (ควรคืนค่า NullPredicate)
        Equator<String> customEquator = new DefaultEquator<String>();
        Predicate<String> predicate = EqualPredicate.equalPredicate(null, customEquator);
        assertNotNull(predicate);
        assertTrue(predicate instanceof NullPredicate);
    }

    @Test
    public void testEqualPredicateWithEquatorFactoryNonNullObject() {
        // ทดสอบกรณี object ไม่เป็น null ใน factory method แบบมี Equator
        Equator<String> customEquator = new DefaultEquator<String>();
        EqualPredicate<String> predicate = (EqualPredicate<String>) EqualPredicate.equalPredicate("TestValue", customEquator);
        assertNotNull(predicate);
        assertEquals("TestValue", predicate.getValue());
    }

    @Test
    public void testEvaluateWithMatchingValues() {
        // ทดสอบ evaluate เมื่อค่าตรงกัน (คาดว่าได้ true)
        Predicate<String> predicate = EqualPredicate.equalPredicate("Hello");
        assertTrue(predicate.evaluate("Hello"));
    }

    @Test
    public void testEvaluateWithNonMatchingValues() {
        // ทดสอบ evaluate เมื่อค่าไม่ตรงกัน (คาดว่าได้ false)
        Predicate<String> predicate = EqualPredicate.equalPredicate("Hello");
        assertFalse(predicate.evaluate("World"));
    }

    @Test
    public void testEvaluateWithNullInput() {
        // ทดสอบ evaluate เมื่อ input เป็น null (DefaultEquator จัดการได้โดยไม่ Throw NullPointerException)
        Predicate<String> predicate = EqualPredicate.equalPredicate("Hello");
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testEvaluateWithCustomEquator() {
        // ทดสอบการทำงานร่วมกับ Custom Equator เพื่อให้มั่นใจว่า evaluate ส่งต่อไปยัง equator จริงๆ
        Equator<String> mockEquator = new Equator<String>() {
            public boolean equate(String o1, String o2) {
                // เงื่อนไขจำลอง: ถือว่าเท่ากันเสมอถ้าความยาวเท่ากัน
                return o1 != null && o2 != null && o1.length() == o2.length();
            }
            public int hash(String o) {
                return o == null ? 0 : o.hashCode();
            }
        };

        EqualPredicate<String> predicate = new EqualPredicate<String>("ABC", mockEquator);
        
        // "XYZ" มีความยาว 3 เท่ากับ "ABC" ดังนั้น Custom Equator ควรคืนค่า true
        assertTrue(predicate.evaluate("XYZ"));
        // "Longer" ความยาวไม่เท่า คืนค่า false
        assertFalse(predicate.evaluate("Longer"));
    }

    @Test
    public void testGetValueReturnsCorrectObject() {
        // ทดสอบ getValue() คืนค่าถูกต้อง
        String target = "TargetObject";
        EqualPredicate<String> predicate = new EqualPredicate<String>(target);
        assertEquals(target, predicate.getValue());
    }
}