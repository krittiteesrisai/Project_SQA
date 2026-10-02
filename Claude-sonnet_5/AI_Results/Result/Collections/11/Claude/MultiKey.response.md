# MultiKeyTest.java

```java
package org.apache.commons.collections.keyvalue;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link MultiKey}.
 * Target: Defects4J Collections-11b
 */
public class MultiKeyTest {

    // ---------------------------------------------------------------
    // Constructor: two keys
    // ---------------------------------------------------------------
    @Test
    public void testTwoArgConstructor() {
        MultiKey mk = new MultiKey("A", "B");
        assertEquals(2, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testTwoArgConstructorWithNulls() {
        MultiKey mk = new MultiKey(null, null);
        assertEquals(2, mk.size());
        assertNull(mk.getKey(0));
        assertNull(mk.getKey(1));
        // both null -> total stays 0 (loop branch: keys[i] != null == false both times)
        assertEquals(0, mk.hashCode());
    }

    // ---------------------------------------------------------------
    // Constructor: three keys
    // ---------------------------------------------------------------
    @Test
    public void testThreeArgConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C");
        assertEquals(3, mk.size());
        assertEquals("C", mk.getKey(2));
    }

    // ---------------------------------------------------------------
    // Constructor: four keys
    // ---------------------------------------------------------------
    @Test
    public void testFourArgConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C", "D");
        assertEquals(4, mk.size());
        assertEquals("D", mk.getKey(3));
    }

    // ---------------------------------------------------------------
    // Constructor: five keys
    // ---------------------------------------------------------------
    @Test
    public void testFiveArgConstructor() {
        MultiKey mk = new MultiKey("A", "B", "C", "D", "E");
        assertEquals(5, mk.size());
        assertEquals("E", mk.getKey(4));
    }

    // ---------------------------------------------------------------
    // Constructor: array (clones by default -> makeClone == true branch)
    // ---------------------------------------------------------------
    @Test
    public void testArrayConstructorClonesArray() {
        Object[] keys = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(keys);
        // mutate original array after construction
        keys[0] = "CHANGED";
        // Because array was cloned, MultiKey internal state must be unaffected
        assertEquals("A", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorNullThrows() {
        new MultiKey((Object[]) null);
    }

    // ---------------------------------------------------------------
    // Constructor: array + boolean makeClone
    // ---------------------------------------------------------------
    @Test
    public void testArrayBooleanConstructorMakeCloneTrue() {
        Object[] keys = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(keys, true);
        keys[0] = "CHANGED";
        assertEquals("A", mk.getKey(0)); // unaffected because cloned
    }

    @Test
    public void testArrayBooleanConstructorMakeCloneFalse() {
        Object[] keys = new Object[] {"A", "B"};
        MultiKey mk = new MultiKey(keys, false);
        keys[0] = "CHANGED";
        // Not cloned -> internal array is same reference, so change is reflected
        assertEquals("CHANGED", mk.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayBooleanConstructorNullThrowsMakeCloneTrue() {
        new MultiKey((Object[]) null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayBooleanConstructorNullThrowsMakeCloneFalse() {
        new MultiKey((Object[]) null, false);
    }

    // ---------------------------------------------------------------
    // getKeys() - returns a clone (does not expose internal array)
    // ---------------------------------------------------------------
    @Test
    public void testGetKeysReturnsClone() {
        MultiKey mk = new MultiKey("A", "B");
        Object[] result = mk.getKeys();
        result[0] = "CHANGED";
        // internal state must remain unaffected because getKeys() clones
        assertEquals("A", mk.getKey(0));
    }

    @Test
    public void testGetKeysContent() {
        MultiKey mk = new MultiKey("A", "B", "C");
        Object[] result = mk.getKeys();
        assertArrayEquals(new Object[] {"A", "B", "C"}, result);
    }

    // ---------------------------------------------------------------
    // getKey(index)
    // ---------------------------------------------------------------
    @Test
    public void testGetKeyValidIndex() {
        MultiKey mk = new MultiKey("A", "B", "C");
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyNegativeIndexThrows() {
        MultiKey mk = new MultiKey("A", "B");
        mk.getKey(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKeyTooLargeIndexThrows() {
        MultiKey mk = new MultiKey("A", "B");
        mk.getKey(2); // valid indices are 0,1
    }

    // ---------------------------------------------------------------
    // size()
    // ---------------------------------------------------------------
    @Test
    public void testSizeForVariousConstructors() {
        assertEquals(2, new MultiKey("A", "B").size());
        assertEquals(3, new MultiKey("A", "B", "C").size());
        assertEquals(4, new MultiKey("A", "B", "C", "D").size());
        assertEquals(5, new MultiKey("A", "B", "C", "D", "E").size());
        assertEquals(1, new MultiKey(new Object[] {"A"}).size());
        assertEquals(0, new MultiKey(new Object[] {}).size());
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------
    @Test
    public void testEqualsSameInstance() {
        MultiKey mk = new MultiKey("A", "B");
        assertTrue(mk.equals(mk)); // other == this branch
    }

    @Test
    public void testEqualsNull() {
        MultiKey mk = new MultiKey("A", "B");
        assertFalse(mk.equals(null)); // not instanceof branch
    }

    @Test
    public void testEqualsDifferentType() {
        MultiKey mk = new MultiKey("A", "B");
        assertFalse(mk.equals("Not a MultiKey")); // not instanceof branch
    }

    @Test
    public void testEqualsSameKeysEqual() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertTrue(mk1.equals(mk2));
        assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEqualsDifferentKeysNotEqual() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEqualsDifferentLengthNotEqual() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEqualsWithNullElementsInsideKeys() {
        MultiKey mk1 = new MultiKey(null, "B");
        MultiKey mk2 = new MultiKey(null, "B");
        assertTrue(mk1.equals(mk2));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------
    @Test
    public void testHashCodeConsistentAcrossCalls() {
        MultiKey mk = new MultiKey("A", "B");
        int h1 = mk.hashCode();
        int h2 = mk.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCodeEqualForEqualObjects() {
        MultiKey mk1 = new MultiKey("A", "B");
        MultiKey mk2 = new MultiKey("A", "B");
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    @Test
    public void testHashCodeComputationWithNoNulls() {
        MultiKey mk = new MultiKey("A", "B");
        int expected = "A".hashCode() ^ "B".hashCode();
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCodeComputationWithSomeNulls() {
        MultiKey mk = new MultiKey("A", null);
        int expected = "A".hashCode(); // null contributes 0 (skip branch)
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCodeComputationAllNulls() {
        MultiKey mk = new MultiKey(new Object[] {null, null, null});
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testHashCodeEmptyArray() {
        // Loop does not execute at all -> total stays 0
        MultiKey mk = new MultiKey(new Object[] {});
        assertEquals(0, mk.hashCode());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------
    @Test
    public void testToStringContainsPrefixAndKeys() {
        MultiKey mk = new MultiKey("A", "B");
        String s = mk.toString();
        assertTrue(s.startsWith("MultiKey"));
        assertTrue(s.contains("A"));
        assertTrue(s.contains("B"));
    }

    @Test
    public void testToStringWithNullKey() {
        MultiKey mk = new MultiKey((Object) null, (Object) null);
        String s = mk.toString();
        assertTrue(s.startsWith("MultiKey"));
        // Arrays.asList(...).toString() typically renders null as "null"
        assertTrue(s.contains("null"));
    }
}
```

## สรุปตาราง Test Case กับ Branch/Condition ที่ครอบคลุม

| ลำดับ | เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|---|
| 1 | `testTwoArgConstructor` | Constructor(2 keys) → เรียก `this(Object[], false)` ปกติ |
| 2 | `testTwoArgConstructorWithNulls` | Loop `calculateHashCode`: `keys[i] != null` == false ทุกตัว |
| 3 | `testThreeArgConstructor` | Constructor(3 keys) |
| 4 | `testFourArgConstructor` | Constructor(4 keys) |
| 5 | `testFiveArgConstructor` | Constructor(5 keys) |
| 6 | `testArrayConstructorClonesArray` | Constructor(Object[]) → `makeClone=true` branch (`this(keys, true)`) |
| 7 | `testArrayConstructorNullThrows` | `keys == null` → throw `IllegalArgumentException` (ผ่าน constructor เดี่ยว array) |
| 8 | `testArrayBooleanConstructorMakeCloneTrue` | `if (makeClone)` == true branch |
| 9 | `testArrayBooleanConstructorMakeCloneFalse` | `if (makeClone)` == false (else) branch |
| 10 | `testArrayBooleanConstructorNullThrowsMakeCloneTrue` | null check ก่อนถึง `if(makeClone)` (true variant) |
| 11 | `testArrayBooleanConstructorNullThrowsMakeCloneFalse` | null check ก่อนถึง `if(makeClone)` (false variant) |
| 12 | `testGetKeysReturnsClone` | `getKeys()` ต้อง clone ไม่ expose internal array |
| 13 | `testGetKeysContent` | `getKeys()` คืนค่าตรงตาม array ภายใน |
| 14 | `testGetKeyValidIndex` | `getKey(index)` ค่าปกติ (boundary ต่ำ-สูง) |
| 15 | `testGetKeyNegativeIndexThrows` | `getKey(index)` ค่าขอบ index < 0 → Exception |
| 16 | `testGetKeyTooLargeIndexThrows` | `getKey(index)` ค่าขอบ index >= length → Exception |
| 17 | `testSizeForVariousConstructors` | `size()` boundary รวมถึง array ว่าง (`length==0`) |
| 18 | `testEqualsSameInstance` | `equals()`: `other == this` == true branch |
| 19 | `testEqualsNull` | `equals()`: `other instanceof MultiKey` == false (null) |
| 20 | `testEqualsDifferentType` | `equals()`: `other instanceof MultiKey` == false (type อื่น) |
| 21 | `testEqualsSameKeysEqual` | `equals()`: instanceof true, `Arrays.equals` == true |
| 22 | `testEqualsDifferentKeysNotEqual` | `equals()`: instanceof true, `Arrays.equals` == false (ค่าต่าง) |
| 23 | `testEqualsDifferentLengthNotEqual` | `equals()`: instanceof true, `Arrays.equals` == false (length ต่าง) |
| 24 | `testEqualsWithNullElementsInsideKeys` | `equals()` เมื่อ element ภายใน array เป็น null |
| 25 | `testHashCodeConsistentAcrossCalls` | `hashCode()` คืนค่า cached เดิมทุกครั้ง |
| 26 | `testHashCodeEqualForEqualObjects` | ความสัมพันธ์ equals→hashCode |
| 27 | `testHashCodeComputationWithNoNulls` | Loop `calculateHashCode`: `keys[i] != null` == true ทุกตัว |
| 28 | `testHashCodeComputationWithSomeNulls` | Loop: ผสม null/non-null (both branch ในลูปเดียวกัน) |
| 29 | `testHashCodeComputationAllNulls` | Loop: ทุก element null (`total` ไม่ถูก XOR เลย) |
| 30 | `testHashCodeEmptyArray` | Loop ไม่ execute เลย (`keys.length == 0`) |
| 31 | `testToStringContainsPrefixAndKeys` | `toString()` รูปแบบ output ปกติ |
| 32 | `testToStringWithNullKey` | `toString()` เมื่อ key เป็น null (ผ่าน `Arrays.asList`) |

**หมายเหตุ:**
- ไม่มีการเดา behavior เพิ่มเติมนอกจากที่ปรากฏใน source เช่นไม่ทดสอบ `readObject`/serialization เนื่องจากเมธอด `readObject` ถูกคอมเมนต์ (ไม่มี code จริงในซอร์สที่ให้มา — มีแค่ Javadoc ลอยๆ) จึงไม่ได้เขียนเทสสำหรับ deserialization recalculation
- Test ทั้งหมดอ้างอิงจาก public API เท่านั้น (ไม่ reflect private method `calculateHashCode` ตรงๆ แต่ทดสอบผ่าน `hashCode()` ที่เรียกใช้ภายใน)