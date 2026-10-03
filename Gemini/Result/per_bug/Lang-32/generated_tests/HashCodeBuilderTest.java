package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class HashCodeBuilderTest {

    // =========================================================================
    // 1. Constructor Tests (Boundary / Invalid State)
    // =========================================================================

    @Test
    public void testDefaultConstructor() {
        HashCodeBuilder builder = new HashCodeBuilder();
        assertEquals(17, builder.toHashCode());
        assertEquals(17, builder.hashCode());
    }

    @Test
    public void testCustomConstructorValid() {
        HashCodeBuilder builder = new HashCodeBuilder(3, 5);
        assertEquals(3, builder.toHashCode());
    }

    @Test
    public void testCustomConstructorNegativeOdd() {
        HashCodeBuilder builder = new HashCodeBuilder(-3, -5);
        assertEquals(-3, builder.toHashCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInitialZero() {
        new HashCodeBuilder(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInitialEvenPositive() {
        new HashCodeBuilder(2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInitialEvenNegative() {
        new HashCodeBuilder(-4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMultiplierZero() {
        new HashCodeBuilder(3, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMultiplierEvenPositive() {
        new HashCodeBuilder(3, 8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMultiplierEvenNegative() {
        new HashCodeBuilder(3, -6);
    }

    // =========================================================================
    // 2. Append Primitives & Overloads
    // =========================================================================

    @Test
    public void testAppendBoolean() {
        HashCodeBuilder b1 = new HashCodeBuilder(17, 37).append(true);
        HashCodeBuilder b2 = new HashCodeBuilder(17, 37).append(false);
        assertEquals(17 * 37 + 0, b1.toHashCode());
        assertEquals(17 * 37 + 1, b2.toHashCode());
    }

    @Test
    public void testAppendBooleanArray() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((boolean[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new boolean[0]).toHashCode());
        
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(new boolean[]{true, false});
        int expected = (17 * 37 + 0) * 37 + 1;
        assertEquals(expected, b.toHashCode());
    }

    @Test
    public void testAppendByte() {
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append((byte) 42);
        assertEquals(17 * 37 + 42, b.toHashCode());
    }

    @Test
    public void testAppendByteArray() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new byte[0]).toHashCode());
        
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(new byte[]{1, Byte.MAX_VALUE, Byte.MIN_VALUE});
        int expected = ((17 * 37 + 1) * 37 + Byte.MAX_VALUE) * 37 + Byte.MIN_VALUE;
        assertEquals(expected, b.toHashCode());
    }

    @Test
    public void testAppendChar() {
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append('A');
        assertEquals(17 * 37 + (int) 'A', b.toHashCode());
    }

    @Test
    public void testAppendCharArray() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new char[0]).toHashCode());
        
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(new char[]{'a', 'b'});
        int expected = (17 * 37 + 'a') * 37 + 'b';
        assertEquals(expected, b.toHashCode());
    }

    @Test
    public void testAppendDouble() {
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(3.14159d);
        long bits = Double.doubleToLongBits(3.14159d);
        int expected = 17 * 37 + ((int) (bits ^ (bits >> 32)));
        assertEquals(expected, b.toHashCode());
    }

    @Test
    public void testAppendDoubleArray() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((double[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new double[0]).toHashCode());
        
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(new double[]{Double.NaN, 0.0d, -0.0d});
        assertNotNull(b.toHashCode());
    }

    @Test
    public void testAppendFloat() {
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(2.5f);
        assertEquals(17 * 37 + Float.floatToIntBits(2.5f), b.toHashCode());
    }

    @Test
    public void testAppendFloatArray() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((float[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new float[0]).toHashCode());
        
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(new float[]{Float.MAX_VALUE, Float.MIN_VALUE});
        assertNotNull(b.toHashCode());
    }

    @Test
    public void testAppendInt() {
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(12345);
        assertEquals(17 * 37 + 12345, b.toHashCode());
    }

    @Test
    public void testAppendIntArray() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((int[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new int[0]).toHashCode());
        
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(new int[]{10, -20, Integer.MAX_VALUE});
        int expected = ((17 * 37 + 10) * 37 - 20) * 37 + Integer.MAX_VALUE;
        assertEquals(expected, b.toHashCode());
    }

    @Test
    public void testAppendLong() {
        long value = 0x123456789ABCDEF0L;
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(value);
        int expected = 17 * 37 + ((int) (value ^ (value >> 32)));
        assertEquals(expected, b.toHashCode());
    }

    @Test
    public void testAppendLongArray() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((long[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new long[0]).toHashCode());
        
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(new long[]{1L, Long.MAX_VALUE});
        assertNotNull(b.toHashCode());
    }

    @Test
    public void testAppendShort() {
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append((short) 99);
        assertEquals(17 * 37 + 99, b.toHashCode());
    }

    @Test
    public void testAppendShortArray() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((short[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new short[0]).toHashCode());
        
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(new short[]{(short) 1, (short) 2});
        int expected = (17 * 37 + 1) * 37 + 2;
        assertEquals(expected, b.toHashCode());
    }

    @Test
    public void testAppendSuper() {
        HashCodeBuilder b = new HashCodeBuilder(17, 37).appendSuper(100);
        assertEquals(17 * 37 + 100, b.toHashCode());
    }

    // =========================================================================
    // 3. Append Object & Multi-dimensional / Polymorphic Arrays
    // =========================================================================

    @Test
    public void testAppendObjectNull() {
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append((Object) null);
        assertEquals(17 * 37, b.toHashCode());
    }

    @Test
    public void testAppendObjectNormal() {
        String str = "testObject";
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append((Object) str);
        assertEquals(17 * 37 + str.hashCode(), b.toHashCode());
    }

    @Test
    public void testAppendObjectArrayNullAndEmpty() {
        assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((Object[]) null).toHashCode());
        assertEquals(17, new HashCodeBuilder(17, 37).append(new Object[0]).toHashCode());
    }

    @Test
    public void testAppendObjectArrayWithElements() {
        String[] arr = new String[]{"hello", null, "world"};
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append(arr);
        
        int expected = 17;
        expected = expected * 37 + "hello".hashCode();
        expected = expected * 37; // null
        expected = expected * 37 + "world".hashCode();
        assertEquals(expected, b.toHashCode());
    }

    @Test
    public void testAppendObjectArrayTypeDispatches() {
        // Dispatch to all primitive array handlers inside append(Object)
        assertEquals(new HashCodeBuilder(17, 37).append(new long[]{1L}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new long[]{1L}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new int[]{2}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new int[]{2}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new short[]{(short) 3}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new short[]{(short) 3}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new char[]{'c'}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new char[]{'c'}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new byte[]{(byte) 4}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new byte[]{(byte) 4}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new double[]{5.0d}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new double[]{5.0d}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new float[]{6.0f}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new float[]{6.0f}).toHashCode());

        assertEquals(new HashCodeBuilder(17, 37).append(new boolean[]{true}).toHashCode(),
                new HashCodeBuilder(17, 37).append((Object) new boolean[]{true}).toHashCode());
    }

    @Test
    public void testAppendMultiDimensionalArrays() {
        int[][] multiInt = new int[][]{{1, 2}, {3, 4}};
        HashCodeBuilder b = new HashCodeBuilder(17, 37).append((Object) multiInt);
        assertNotNull(b.toHashCode());

        Object[][] multiObject = new Object[][]{{"a"}, {new int[]{1}}};
        HashCodeBuilder b2 = new HashCodeBuilder(17, 37).append((Object) multiObject);
        assertNotNull(b2.toHashCode());
    }

    // =========================================================================
    // 4. Reflection HashCode Tests (Modifiers, Transients, Exclusions, Inheritance)
    // =========================================================================

    static class ParentTestObject {
        private int parentInt = 10;
        public int getParentInt() { return parentInt; }
    }

    static class ChildTestObject extends ParentTestObject {
        @SuppressWarnings("unused")
        private static int staticField = 999;
        private int normalField = 20;
        private transient int transientField = 30;
        private String excludedField = "excludeMe";

        public ChildTestObject(int normal, int trans, String excluded) {
            this.normalField = normal;
            this.transientField = trans;
            this.excludedField = excluded;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflectionHashCodeNullObject() {
        HashCodeBuilder.reflectionHashCode(null);
    }

    @Test
    public void testReflectionHashCodeBasic() {
        ChildTestObject obj = new ChildTestObject(100, 200, "val");
        int hash = HashCodeBuilder.reflectionHashCode(obj);
        assertTrue(hash != 0);
    }

    @Test
    public void testReflectionHashCodeWithTransients() {
        ChildTestObject obj1 = new ChildTestObject(100, 200, "val");
        ChildTestObject obj2 = new ChildTestObject(100, 500, "val");

        // Transients excluded by default -> hash should be equal
        assertEquals(HashCodeBuilder.reflectionHashCode(obj1, false),
                     HashCodeBuilder.reflectionHashCode(obj2, false));

        // Transients included -> hash should be different
        assertFalse(HashCodeBuilder.reflectionHashCode(obj1, true) ==
                    HashCodeBuilder.reflectionHashCode(obj2, true));
    }

    @Test
    public void testReflectionHashCodeWithExcludeFieldsArray() {
        ChildTestObject obj1 = new ChildTestObject(100, 200, "val1");
        ChildTestObject obj2 = new ChildTestObject(100, 200, "val2");

        // Exclude 'excludedField'
        int hash1 = HashCodeBuilder.reflectionHashCode(obj1, new String[]{"excludedField"});
        int hash2 = HashCodeBuilder.reflectionHashCode(obj2, new String[]{"excludedField"});
        assertEquals(hash1, hash2);
    }

    @Test
    public void testReflectionHashCodeWithExcludeFieldsCollection() {
        ChildTestObject obj1 = new ChildTestObject(100, 200, "val1");
        ChildTestObject obj2 = new ChildTestObject(100, 200, "val2");

        List<String> excludes = new ArrayList<String>();
        excludes.add("excludedField");

        int hash1 = HashCodeBuilder.reflectionHashCode(obj1, excludes);
        int hash2 = HashCodeBuilder.reflectionHashCode(obj2, excludes);
        assertEquals(hash1, hash2);
    }

    @Test
    public void testReflectionHashCodeReflectUpToClass() {
        ChildTestObject obj = new ChildTestObject(10, 20, "ex");

        // Up to ChildTestObject (ignores Parent fields)
        int childOnlyHash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, ChildTestObject.class);

        // Up to ParentTestObject (includes Parent fields)
        int parentIncludedHash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, ParentTestObject.class);

        // Null superclass (includes java.lang.Object)
        int objectIncludedHash = HashCodeBuilder.reflectionHashCode(17, 37, obj, false, null);

        assertFalse(childOnlyHash == parentIncludedHash);
        assertEquals(parentIncludedHash, objectIncludedHash);
    }

    // =========================================================================
    // 5. Cyclical References & Registry Cleanup (Defects4J Lang-32 Special Focus)
    // =========================================================================

    static class SelfReferencingNode {
        SelfReferencingNode next;
        int value;

        public SelfReferencingNode(int value) {
            this.value = value;
        }
    }

    static class MutualCycleA {
        MutualCycleB b;
        int value = 1;
    }

    static class MutualCycleB {
        MutualCycleA a;
        int value = 2;
    }

    @Test
    public void testSelfReferencingObjectCycle() {
        SelfReferencingNode node = new SelfReferencingNode(42);
        node.next = node; // Cycle to itself

        int hash = HashCodeBuilder.reflectionHashCode(node);
        assertTrue(hash != 0);
        // Registry must be clean after execution
        Set<IDKey> registry = HashCodeBuilder.getRegistry();
        assertTrue("Registry should be empty after reflectionHashCode", registry == null || registry.isEmpty());
    }

    @Test
    public void testMutualCyclicReference() {
        MutualCycleA a = new MutualCycleA();
        MutualCycleB b = new MutualCycleB();
        a.b = b;
        b.a = a;

        int hashA = HashCodeBuilder.reflectionHashCode(a);
        int hashB = HashCodeBuilder.reflectionHashCode(b);
        assertTrue(hashA != 0);
        assertTrue(hashB != 0);

        Set<IDKey> registry = HashCodeBuilder.getRegistry();
        assertTrue("Registry should be empty after reflectionHashCode", registry == null || registry.isEmpty());
    }

    @Test
    public void testDirectRegistryRegisterAndUnregister() {
        Object testObj = new Object();
        assertFalse(HashCodeBuilder.isRegistered(testObj));

        HashCodeBuilder.register(testObj);
        assertTrue(HashCodeBuilder.isRegistered(testObj));

        HashCodeBuilder.unregister(testObj);
        assertFalse(HashCodeBuilder.isRegistered(testObj));
    }
}