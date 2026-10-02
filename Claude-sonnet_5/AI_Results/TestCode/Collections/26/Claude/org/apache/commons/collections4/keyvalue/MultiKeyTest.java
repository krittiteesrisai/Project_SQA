package org.apache.commons.collections4.keyvalue;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link MultiKey}.
 * เป้าหมาย: ครอบคลุม branch/condition ให้มากที่สุดจากซอร์สที่ให้มา
 */
public class MultiKeyTest {

    // ---------------------------------------------------------
    // Constructors: 2,3,4,5-key convenience constructors
    // ---------------------------------------------------------

    @Test
    public void testTwoKeyConstructor() {
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        assertEquals(2, mk.size());
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
    }

    @Test
    public void testThreeKeyConstructor() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C");
        assertEquals(3, mk.size());
        assertEquals("C", mk.getKey(2));
    }

    @Test
    public void testFourKeyConstructor() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C", "D");
        assertEquals(4, mk.size());
        assertEquals("D", mk.getKey(3));
    }

    @Test
    public void testFiveKeyConstructor() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C", "D", "E");
        assertEquals(5, mk.size());
        assertEquals("E", mk.getKey(4));
    }

    // ---------------------------------------------------------
    // Constructor: MultiKey(K[] keys) -> delegates to (keys, true)
    // ---------------------------------------------------------

    @Test
    public void testArrayConstructorSingleArg_ClonesArray() {
        String[] original = {"X", "Y"};
        MultiKey<String> mk = new MultiKey<String>(original);
        // แก้ original array แล้วค่าใน MultiKey ไม่ควรเปลี่ยน เพราะถูก clone (makeClone=true)
        original[0] = "CHANGED";
        assertEquals("X", mk.getKey(0));
        assertEquals(2, mk.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorSingleArg_NullThrows() {
        new MultiKey<String>((String[]) null);
    }

    // ---------------------------------------------------------
    // Constructor: MultiKey(K[] keys, boolean makeClone)
    // ---------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testArrayBooleanConstructor_NullKeysThrows() {
        // ครอบคลุม branch: if (keys == null) -> true
        new MultiKey<String>((String[]) null, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayBooleanConstructor_NullKeysThrows_MakeCloneFalse() {
        // ครอบคลุม branch: if (keys == null) -> true (ค่า makeClone เป็น false)
        new MultiKey<String>((String[]) null, false);
    }

    @Test
    public void testArrayBooleanConstructor_MakeCloneTrue() {
        // ครอบคลุม branch: if (makeClone) -> true
        String[] original = {"A", "B"};
        MultiKey<String> mk = new MultiKey<String>(original, true);
        original[0] = "CHANGED";
        assertEquals("A", mk.getKey(0)); // ไม่ถูกกระทบเพราะ clone แล้ว
    }

    @Test
    public void testArrayBooleanConstructor_MakeCloneFalse() {
        // ครอบคลุม branch: if (makeClone) -> false (else branch)
        String[] original = {"A", "B"};
        MultiKey<String> mk = new MultiKey<String>(original, false);
        original[0] = "CHANGED";
        // เนื่องจากไม่ clone อาเรย์ การแก้ original จะกระทบ mk.keys โดยตรง
        assertEquals("CHANGED", mk.getKey(0));
    }

    // ---------------------------------------------------------
    // calculateHashCode(): loop + if(key != null) branch
    // ---------------------------------------------------------

    @Test
    public void testHashCode_AllNonNullKeys() {
        // ครอบคลุม: loop เข้าทุก element, if(key != null) -> true ทุกครั้ง
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        int expected = "A".hashCode() ^ "B".hashCode();
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCode_WithNullKey() {
        // ครอบคลุม: if(key != null) -> false สำหรับ key ที่เป็น null
        MultiKey<String> mk = new MultiKey<String>(null, "B");
        int expected = 0 ^ "B".hashCode(); // key1 เป็น null ไม่ XOR เข้าไป
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCode_AllNullKeys() {
        // ทุก key เป็น null -> loop เข้าทุกรอบ แต่ if เป็น false ทุกครั้ง -> hashCode = 0
        MultiKey<String> mk = new MultiKey<String>(null, null);
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testHashCode_EmptyArray() {
        // ครอบคลุม: loop ไม่ execute เลย (array ว่าง) -> total ยังคงเป็น 0
        String[] emptyArr = {};
        MultiKey<String> mk = new MultiKey<String>(emptyArr, false);
        assertEquals(0, mk.hashCode());
    }

    @Test
    public void testHashCode_Cached() {
        // hashCode ควรถูก cache และคงที่ (เรียกซ้ำได้ค่าเดิม)
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        int first = mk.hashCode();
        int second = mk.hashCode();
        assertEquals(first, second);
    }

    // ---------------------------------------------------------
    // getKeys()
    // ---------------------------------------------------------

    @Test
    public void testGetKeys_ReturnsClone() {
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        String[] keys1 = mk.getKeys();
        keys1[0] = "MODIFIED";
        String[] keys2 = mk.getKeys();
        // getKeys ต้องคืนค่า clone ใหม่ทุกครั้ง ไม่กระทบ internal state
        assertEquals("A", keys2[0]);
    }

    @Test
    public void testGetKeys_ContentMatches() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C");
        String[] keys = mk.getKeys();
        assertArrayEquals(new String[]{"A", "B", "C"}, keys);
    }

    // ---------------------------------------------------------
    // getKey(index)
    // ---------------------------------------------------------

    @Test
    public void testGetKey_ValidIndex() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C");
        assertEquals("A", mk.getKey(0));
        assertEquals("B", mk.getKey(1));
        assertEquals("C", mk.getKey(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_NegativeIndexThrows() {
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        mk.getKey(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetKey_IndexTooLargeThrows() {
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        mk.getKey(2); // valid indices are 0,1
    }

    // ---------------------------------------------------------
    // size()
    // ---------------------------------------------------------

    @Test
    public void testSize_TwoKeys() {
        assertEquals(2, new MultiKey<String>("A", "B").size());
    }

    @Test
    public void testSize_EmptyArray() {
        String[] emptyArr = {};
        MultiKey<String> mk = new MultiKey<String>(emptyArr, false);
        assertEquals(0, mk.size());
    }

    // ---------------------------------------------------------
    // equals()
    // ---------------------------------------------------------

    @Test
    public void testEquals_SameInstance() {
        // ครอบคลุม branch: if (other == this) -> true
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        assertTrue(mk.equals(mk));
    }

    @Test
    public void testEquals_Null() {
        // ครอบคลุม: other instanceof MultiKey -> false (null ไม่ผ่าน instanceof)
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        assertFalse(mk.equals(null));
    }

    @Test
    public void testEquals_DifferentType() {
        // ครอบคลุม: other instanceof MultiKey -> false (คนละชนิด)
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        assertFalse(mk.equals("Some String"));
    }

    @Test
    public void testEquals_EqualKeys() {
        // ครอบคลุม: instanceof -> true, Arrays.equals -> true
        MultiKey<String> mk1 = new MultiKey<String>("A", "B");
        MultiKey<String> mk2 = new MultiKey<String>("A", "B");
        assertTrue(mk1.equals(mk2));
        assertTrue(mk2.equals(mk1));
    }

    @Test
    public void testEquals_DifferentKeyValues() {
        // ครอบคลุม: instanceof -> true, Arrays.equals -> false (ค่าต่างกัน)
        MultiKey<String> mk1 = new MultiKey<String>("A", "B");
        MultiKey<String> mk2 = new MultiKey<String>("A", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_DifferentSize() {
        // ครอบคลุม: instanceof -> true, Arrays.equals -> false (ขนาดต่างกัน)
        MultiKey<String> mk1 = new MultiKey<String>("A", "B");
        MultiKey<String> mk2 = new MultiKey<String>("A", "B", "C");
        assertFalse(mk1.equals(mk2));
    }

    @Test
    public void testEquals_WithNullElementsInKeys() {
        // ทดสอบ Arrays.equals เมื่อมี null element ในอาเรย์ keys
        MultiKey<String> mk1 = new MultiKey<String>(null, "B");
        MultiKey<String> mk2 = new MultiKey<String>(null, "B");
        assertTrue(mk1.equals(mk2));
    }

    // ---------------------------------------------------------
    // hashCode() getter (คืนค่า cached field)
    // ---------------------------------------------------------

    @Test
    public void testHashCode_MatchesFormula() {
        MultiKey<String> mk = new MultiKey<String>("A", "B", "C");
        int expected = "A".hashCode() ^ "B".hashCode() ^ "C".hashCode();
        assertEquals(expected, mk.hashCode());
    }

    @Test
    public void testHashCode_EqualObjectsHaveSameHashCode() {
        MultiKey<String> mk1 = new MultiKey<String>("A", "B");
        MultiKey<String> mk2 = new MultiKey<String>("A", "B");
        assertEquals(mk1.hashCode(), mk2.hashCode());
    }

    // ---------------------------------------------------------
    // toString()
    // ---------------------------------------------------------

    @Test
    public void testToString_ContainsPrefixAndKeys() {
        MultiKey<String> mk = new MultiKey<String>("A", "B");
        String s = mk.toString();
        assertTrue(s.startsWith("MultiKey"));
        assertTrue(s.contains("A"));
        assertTrue(s.contains("B"));
    }

    @Test
    public void testToString_EmptyArray() {
        String[] emptyArr = {};
        MultiKey<String> mk = new MultiKey<String>(emptyArr, false);
        String s = mk.toString();
        assertEquals("MultiKey[]", s);
    }

    // ---------------------------------------------------------
    // readResolve() - private method เรียกอัตโนมัติผ่าน deserialization
    // NOTE: ทดสอบทางอ้อมผ่าน serialize/deserialize round-trip
    // ---------------------------------------------------------

    @Test
    public void testSerialization_RoundTrip_PreservesEqualityAndHashCode()
            throws Exception {
        MultiKey<String> original = new MultiKey<String>("A", "B", "C");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        MultiKey<String> deserialized = (MultiKey<String>) ois.readObject();
        ois.close();

        // readResolve ต้อง recalculate hashCode และ equals ต้องยังทำงานถูกต้อง
        assertEquals(original, deserialized);
        assertEquals(original.hashCode(), deserialized.hashCode());
        assertEquals(original.size(), deserialized.size());
        assertArrayEquals(original.getKeys(), deserialized.getKeys());
    }

    @Test
    public void testSerialization_WithNullKey_RoundTrip() throws Exception {
        // ทดสอบ readResolve -> calculateHashCode กับ key ที่มี null
        MultiKey<String> original = new MultiKey<String>(null, "B");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        MultiKey<String> deserialized = (MultiKey<String>) ois.readObject();
        ois.close();

        assertEquals(original, deserialized);
        assertEquals(original.hashCode(), deserialized.hashCode());
    }
}
