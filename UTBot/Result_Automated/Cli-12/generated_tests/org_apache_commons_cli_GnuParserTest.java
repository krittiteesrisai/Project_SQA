package org.apache.commons.cli;

import org.junit.Test;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_cli_GnuParserTest {
    ///region Test suites for executable org.apache.commons.cli.GnuParser.flatten
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
    @utbot.classUnderTest {@link GnuParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.GnuParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.returnsFrom {@code return (String[]) tokens.toArray(new String[tokens.size()]);}
 *  */
    @Test
    public void testFlatten_ReturnTokensToArrayNewStringtokensSize() {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = {};
        
        java.lang.String[] actual = gnuParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link GnuParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.GnuParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arguments.length; i++)} once
 * @utbot.returnsFrom {@code return (String[]) tokens.toArray(new String[tokens.size()]);}
 *  */
    @Test
    public void testFlatten_EatTheRest() {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "--";
        stringArray[0] = string;
        
        java.lang.String[] actual = gnuParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[1];
        String string1 = "--";
        expected[0] = string1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    /**
    @utbot.classUnderTest {@link GnuParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.GnuParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arguments.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: arg.startsWith("-")
 *  */
    @Test
    public void testFlatten_ThrowNullPointerException_1() {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:71) */
        gnuParser.flatten(null, stringArray, false);
    }
    
    /**
    @utbot.classUnderTest {@link GnuParser}
 * @utbot.methodUnderTest {@link org.apache.commons.cli.GnuParser#flatten(org.apache.commons.cli.Options,java.lang.String[],boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < arguments.length; i++)
 *  */
    @Test
    public void testFlatten_ThrowNullPointerException() {
        GnuParser gnuParser = new GnuParser();
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:58) */
        gnuParser.flatten(null, null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    @Test
    public void testFlatten1() {
        GnuParser gnuParser = new GnuParser();
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        stringArray[0] = string;
        String string1 = "--";
        stringArray[1] = string1;
        
        java.lang.String[] actual = gnuParser.flatten(options, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[10];
        expected[0] = string;
        String string2 = "--";
        expected[1] = string2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        String finalStringArray2 = stringArray[2];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        String finalStringArray9 = stringArray[9];
        
        assertNull(finalStringArray2);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
        
        assertNull(finalStringArray9);
    }
    
    @Test
    public void testFlatten2() {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = new java.lang.String[3];
        String string = "";
        stringArray[0] = string;
        String string1 = "-";
        stringArray[1] = string1;
        String string2 = "";
        stringArray[2] = string2;
        
        java.lang.String[] actual = gnuParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[3];
        expected[0] = string;
        String string3 = "-";
        expected[1] = string3;
        expected[2] = string2;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testFlatten3() {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = new java.lang.String[14];
        String string = "--";
        stringArray[0] = string;
        stringArray[2] = string;
        
        java.lang.String[] actual = gnuParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[14];
        String string1 = "--";
        expected[0] = string1;
        expected[2] = string;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        String finalStringArray1 = stringArray[1];
        String finalStringArray3 = stringArray[3];
        String finalStringArray4 = stringArray[4];
        String finalStringArray5 = stringArray[5];
        String finalStringArray6 = stringArray[6];
        String finalStringArray7 = stringArray[7];
        String finalStringArray8 = stringArray[8];
        String finalStringArray9 = stringArray[9];
        String finalStringArray10 = stringArray[10];
        String finalStringArray11 = stringArray[11];
        String finalStringArray12 = stringArray[12];
        String finalStringArray13 = stringArray[13];
        
        assertNull(finalStringArray1);
        
        assertNull(finalStringArray3);
        
        assertNull(finalStringArray4);
        
        assertNull(finalStringArray5);
        
        assertNull(finalStringArray6);
        
        assertNull(finalStringArray7);
        
        assertNull(finalStringArray8);
        
        assertNull(finalStringArray9);
        
        assertNull(finalStringArray10);
        
        assertNull(finalStringArray11);
        
        assertNull(finalStringArray12);
        
        assertNull(finalStringArray13);
    }
    
    @Test
    public void testFlatten4() {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "-";
        stringArray[0] = string;
        String string1 = "--";
        stringArray[1] = string1;
        
        java.lang.String[] actual = gnuParser.flatten(null, stringArray, false);
        
        java.lang.String[] expected = new java.lang.String[2];
        String string2 = "-";
        expected[0] = string2;
        String string3 = "--";
        expected[1] = string3;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method flatten(org.apache.commons.cli.Options, [Ljava.lang.String;, boolean)
    
    @Test
    public void testFlatten5() {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "\u0000\u0000";
        stringArray[0] = string;
        String string1 = "-\u0000";
        stringArray[1] = string1;
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:75) */
        gnuParser.flatten(null, stringArray, false);
    }
    
    @Test
    public void testFlatten6() {
        GnuParser gnuParser = new GnuParser();
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[19];
        String string = "";
        stringArray[0] = string;
        String string1 = "-";
        stringArray[1] = string1;
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:71) */
        gnuParser.flatten(options, stringArray, false);
    }
    
    @Test
    public void testFlatten7() {
        GnuParser gnuParser = new GnuParser();
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        stringArray[0] = string;
        String string1 = "-\u0000";
        stringArray[1] = string1;
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:71) */
        gnuParser.flatten(options, stringArray, false);
    }
    
    @Test
    public void testFlatten8() {
        GnuParser gnuParser = new GnuParser();
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "-";
        stringArray[0] = string;
        stringArray[1] = string;
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:71) */
        gnuParser.flatten(options, stringArray, false);
    }
    
    @Test
    public void testFlatten9() {
        GnuParser gnuParser = new GnuParser();
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "-";
        stringArray[0] = string;
        String string1 = "-\u0000";
        stringArray[1] = string1;
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:71) */
        gnuParser.flatten(options, stringArray, false);
    }
    
    @Test
    public void testFlatten10() {
        GnuParser gnuParser = new GnuParser();
        Options options = new Options();
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "-";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:71) */
        gnuParser.flatten(options, stringArray, false);
    }
    
    @Test
    public void testFlatten11() {
        GnuParser gnuParser = new GnuParser();
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "-\u0000";
        stringArray[0] = string;
        
        /* This test fails because method [org.apache.commons.cli.GnuParser.flatten] produces [java.lang.NullPointerException]
            org.apache.commons.cli.GnuParser.flatten(GnuParser.java:75) */
        gnuParser.flatten(null, stringArray, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    ///endregion
}

