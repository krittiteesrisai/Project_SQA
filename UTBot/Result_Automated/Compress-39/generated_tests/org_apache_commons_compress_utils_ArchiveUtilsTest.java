package org.apache.commons.compress.utils;

import org.junit.Test;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_compress_utils_ArchiveUtilsTest {
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString(org.apache.commons.compress.archivers.ArchiveEntry)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#toString(org.apache.commons.compress.archivers.ArchiveEntry)}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.ArchiveEntry#isDirectory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entry.isDirectory()
 *  */
    @Test
    public void testToString_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.toString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.toString(ArchiveUtils.java:50) */
        ArchiveUtils.toString(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testToString1() throws Exception  {
        CpioArchiveEntry cpioArchiveEntry = ((CpioArchiveEntry) createInstance("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        
        String actual = ArchiveUtils.toString(cpioArchiveEntry);
        
        String expected = "-       0 null";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() {
        SevenZArchiveEntry sevenZArchiveEntry = new SevenZArchiveEntry();
        
        String actual = ArchiveUtils.toString(sevenZArchiveEntry);
        
        String expected = "-       0 null";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString3() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 177737L, 0, 0, 0, 0L);
        
        String actual = ArchiveUtils.toString(arArchiveEntry);
        
        String expected = "-  177737 null";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, 2L, 0, 0, 0, 0L);
        
        String actual = ArchiveUtils.toString(arArchiveEntry);
        
        String expected = "-       2 null";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(null, java.lang.Long.MIN_VALUE, 0, 0, 0, 0L);
        
        String actual = ArchiveUtils.toString(arArchiveEntry);
        
        String expected = "- -9223372036854775808 null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString(org.apache.commons.compress.archivers.ArchiveEntry)
    
    @Test
    public void testToString6() throws Exception  {
        TarArchiveEntry tarArchiveEntry = ((TarArchiveEntry) createInstance("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.toString] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory(TarArchiveEntry.java:859)
            org.apache.commons.compress.utils.ArchiveUtils.toString(ArchiveUtils.java:50) */
        ArchiveUtils.toString(tarArchiveEntry);
    }
    ///endregion
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 26 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.isEqual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEqual([B, int, int, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, false);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        byte[] byteArray1 = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, 1, 1, byteArray1, 1, 1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, false);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_3() {
        byte[] byteArray = {(byte) -127, (byte) -126};
        byte[] byteArray1 = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, 1, 1, byteArray1, 1, 2);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, false);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual() {
        boolean actual = ArchiveUtils.isEqual(null, -255, 255, null, -255, 0);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, false);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_1() {
        boolean actual = ArchiveUtils.isEqual(null, -255, 0, null, -255, 0);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEqual([B, int, int, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, false);
 *  */
    @Test
    public void testIsEqual_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156)
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:196) */
        ArchiveUtils.isEqual(byteArray, 1, 1, byteArray1, -256, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, false);
 *  */
    @Test
    public void testIsEqual_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156)
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:196) */
        ArchiveUtils.isEqual(byteArray, -256, 1, null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, false);
 *  */
    @Test
    public void testIsEqual_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156)
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:196) */
        ArchiveUtils.isEqual(byteArray, 129, 1, null, -255, 2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.isEqual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isEqual([B, int, int, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < minLen; i++)} once
 *  */
    @Test
    public void testIsEqual_Offset1iOfBuffer1NotEqualsOffset2iOfBuffer2() {
        byte[] byteArray = {(byte) -126};
        byte[] byteArray1 = {(byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, 0, 1, byteArray1, 0, 2, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): False}
 * @utbot.executesCondition {@code (length1 == length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < minLen; i++)} once
 *  */
    @Test
    public void testIsEqual_Length1EqualsLength2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, 1, 1, byteArray, 1, 1, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): False}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): True}
 * @utbot.executesCondition {@code (length1 > length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = length2; i < length1; i++)} once
 *  */
    @Test
    public void testIsEqual_Offset1iOfBuffer1NotEqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, 1, 1, null, 0, 0, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): False}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): True}
 * @utbot.executesCondition {@code (length1 > length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = length2; i < length1; i++)} once
 *  */
    @Test
    public void testIsEqual_Offset1iOfBuffer1EqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, 1, 1, null, -255, 0, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): True}
 * @utbot.executesCondition {@code (length1 > length2): False}
 * @utbot.iterates iterate the loop {@code for(int i = length1; i < length2; i++)} once
 *  */
    @Test
    public void testIsEqual_Offset2iOfBuffer2NotEqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(null, -255, 0, byteArray, 1, 1, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): True}
 * @utbot.executesCondition {@code (length1 > length2): False}
 * @utbot.iterates iterate the loop {@code for(int i = length1; i < length2; i++)} once
 *  */
    @Test
    public void testIsEqual_Offset2iOfBuffer2EqualsZero() {
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        boolean actual = ArchiveUtils.isEqual(null, -255, 0, byteArray, 1, 1, true);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isEqual([B, int, int, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): False}
 * @utbot.executesCondition {@code (length1 == length2): True}
 *  */
    @Test
    public void testIsEqual_Length1EqualsLength2_1() {
        boolean actual = ArchiveUtils.isEqual(null, 1, 0, null, -255, 0, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): False}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): False}
 *  */
    @Test
    public void testIsEqual_NotIgnoreTrailingNulls() {
        boolean actual = ArchiveUtils.isEqual(null, -255, 255, null, -255, 0, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): False}
 *  */
    @Test
    public void testIsEqual_Length1LessThanLength2() {
        boolean actual = ArchiveUtils.isEqual(null, -255, 0, null, -255, 1, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEqual([B, int, int, [B, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < minLen; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer1[offset1 + i] != buffer2[offset2 + i]
 *  */
    @Test
    public void testIsEqual_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156) */
        ArchiveUtils.isEqual(byteArray, 1, 1, byteArray1, -256, 2, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < minLen; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer1[offset1 + i] != buffer2[offset2 + i]
 *  */
    @Test
    public void testIsEqual_ThrowArrayIndexOutOfBoundsException1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156) */
        ArchiveUtils.isEqual(byteArray, 65, 1, null, -255, 1, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < minLen; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer1[offset1 + i] != buffer2[offset2 + i]
 *  */
    @Test
    public void testIsEqual_ThrowArrayIndexOutOfBoundsException_11() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156) */
        ArchiveUtils.isEqual(byteArray, -256, 1, null, -255, 2, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): False}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): True}
 * @utbot.executesCondition {@code (length1 > length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = length2; i < length1; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer1[offset1 + i] != 0
 *  */
    @Test
    public void testIsEqual_ThrowArrayIndexOutOfBoundsException_21() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:166) */
        ArchiveUtils.isEqual(byteArray, 129, 1, null, -255, 0, true);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): True}
 * @utbot.executesCondition {@code (length1 > length2): False}
 * @utbot.iterates iterate the loop {@code for(int i = length1; i < length2; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: buffer2[offset2 + i] != 0
 *  */
    @Test
    public void testIsEqual_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:172) */
        ArchiveUtils.isEqual(null, -255, 0, byteArray, 129, 1, true);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < minLen; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer1[offset1 + i] != buffer2[offset2 + i]
 *  */
    @Test
    public void testIsEqual_ThrowNullPointerException_2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156) */
        ArchiveUtils.isEqual(byteArray, 1, 1, null, -255, 2, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < minLen; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer1[offset1 + i] != buffer2[offset2 + i]
 *  */
    @Test
    public void testIsEqual_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156) */
        ArchiveUtils.isEqual(null, -255, 1, null, -255, 2, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): False}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): True}
 * @utbot.executesCondition {@code (length1 > length2): True}
 * @utbot.iterates iterate the loop {@code for(int i = length2; i < length1; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer1[offset1 + i] != 0
 *  */
    @Test
    public void testIsEqual_ThrowNullPointerException_1() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:166) */
        ArchiveUtils.isEqual(null, -255, 1, null, -255, 0, true);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],int,int,byte[],int,int,boolean)}
 * @utbot.executesCondition {@code (length1 < length2): True}
 * @utbot.executesCondition {@code (length1 == length2): False}
 * @utbot.executesCondition {@code (ignoreTrailingNulls): True}
 * @utbot.executesCondition {@code (length1 > length2): False}
 * @utbot.iterates iterate the loop {@code for(int i = length1; i < length2; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: buffer2[offset2 + i] != 0
 *  */
    @Test
    public void testIsEqual_ThrowNullPointerException_3() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:172) */
        ArchiveUtils.isEqual(null, -255, 0, null, -255, 1, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.isEqual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEqual([B, [B)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[])}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, false);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual1() {
        byte[] byteArray = {(byte) -126};
        byte[] byteArray1 = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[])}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, false);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_11() {
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[])}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, false);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_21() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[])}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, false);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_31() {
        byte[] byteArray = {};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEqual([B, [B)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, false);
 *  */
    @Test
    public void testIsEqual_ThrowNullPointerException_11() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:207) */
        ArchiveUtils.isEqual(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, false);
 *  */
    @Test
    public void testIsEqual_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:207) */
        ArchiveUtils.isEqual(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.isEqual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEqual([B, [B, boolean)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual2() {
        byte[] byteArray = {(byte) -126};
        byte[] byteArray1 = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_12() {
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_22() {
        byte[] byteArray = {};
        byte[] byteArray1 = {(byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_32() {
        byte[] byteArray = {};
        byte[] byteArray1 = {(byte) 0};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_4() {
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_5() {
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_6() {
        byte[] byteArray = {(byte) 0};
        byte[] byteArray1 = {};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);}
 *  */
    @Test
    public void testIsEqual_ReturnIsEqual_7() {
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        boolean actual = ArchiveUtils.isEqual(byteArray, byteArray1, false);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEqual([B, [B, boolean)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);
 *  */
    @Test
    public void testIsEqual_ThrowNullPointerException_12() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:219) */
        ArchiveUtils.isEqual(byteArray, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqual(byte[],byte[],boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);
 *  */
    @Test
    public void testIsEqual_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqual] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:219) */
        ArchiveUtils.isEqual(null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchAsciiBuffer(java.lang.String, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#matchAsciiBuffer(java.lang.String,byte[],int,int)}
 * @utbot.invokes {@link java.lang.String#getBytes(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer1 = expected.getBytes(CharsetNames.US_ASCII);
 *  */
    @Test
    public void testMatchAsciiBuffer_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(ArchiveUtils.java:75) */
        ArchiveUtils.matchAsciiBuffer(null, null, -255, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method matchAsciiBuffer(java.lang.String, [B, int, int)
    
    @Test
    public void testMatchAsciiBuffer1() {
        String string = "";
        
        boolean actual = ArchiveUtils.matchAsciiBuffer(string, null, -255, -255);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchAsciiBuffer(java.lang.String, [B)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#matchAsciiBuffer(java.lang.String,byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return matchAsciiBuffer(expected, buffer, 0, buffer.length);
 *  */
    @Test
    public void testMatchAsciiBuffer_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(ArchiveUtils.java:90) */
        ArchiveUtils.matchAsciiBuffer(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method matchAsciiBuffer(java.lang.String, [B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#matchAsciiBuffer(java.lang.String,byte[])}
     */
    @Test
    public void testMatchAsciiBufferReturnsFalseWithBlankStringAndNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) 0, java.lang.Byte.MAX_VALUE, (byte) -1};
        
        boolean actual = ArchiveUtils.matchAsciiBuffer("\n\t\r", byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method matchAsciiBuffer(java.lang.String, [B)
    
    @Test
    public void testMatchAsciiBuffer2() {
        String string = "";
        byte[] byteArray = {(byte) -127};
        
        boolean actual = ArchiveUtils.matchAsciiBuffer(string, byteArray);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.toAsciiString
    
    ///region FUZZER: ERROR SUITE for method toAsciiString([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#toAsciiString(byte[],int,int)}
     */
    @Test
    public void testToAsciiStringThrowsSIOOBEWithNonEmptyPrimitiveArrayAndCornerCase() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.toAsciiString] produces [java.lang.StringIndexOutOfBoundsException: offset -1, count 2147483647, length 3]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.<init>(String.java:523)
            java.base/java.lang.String.<init>(String.java:487)
            org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(ArchiveUtils.java:132) */
        ArchiveUtils.toAsciiString(byteArray, -1, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toAsciiString([B, int, int)
    
    @Test
    public void testToAsciiString1() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.toAsciiString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.<init>(String.java:523)
            java.base/java.lang.String.<init>(String.java:487)
            org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(ArchiveUtils.java:132) */
        ArchiveUtils.toAsciiString(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.toAsciiString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toAsciiString([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#toAsciiString(byte[])}
     */
    @Test
    public void testToAsciiStringWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        String actual = ArchiveUtils.toAsciiString(byteArray);
        
        String expected = "\uFFFD\uFFFD\uFFFD";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toAsciiString([B)
    
    @Test
    public void testToAsciiString2() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.toAsciiString] produces [java.lang.NullPointerException]
            java.base/java.lang.String.<init>(String.java:1365)
            org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(ArchiveUtils.java:116) */
        ArchiveUtils.toAsciiString(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toAsciiBytes(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#toAsciiBytes(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#getBytes(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inputString.getBytes(CharsetNames.US_ASCII);
 *  */
    @Test
    public void testToAsciiBytes_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(ArchiveUtils.java:102) */
        ArchiveUtils.toAsciiBytes(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toAsciiBytes(java.lang.String)
    
    @Test
    public void testToAsciiBytes1() {
        String string = "";
        
        byte[] actual = ArchiveUtils.toAsciiBytes(string);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEqualWithNull([B, int, int, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);}
 *  */
    @Test
    public void testIsEqualWithNull_ReturnIsEqual_3() {
        byte[] byteArray = {(byte) -127, (byte) -126};
        byte[] byteArray1 = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqualWithNull(byteArray, 1, 1, byteArray1, 1, 2);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);}
 *  */
    @Test
    public void testIsEqualWithNull_ReturnIsEqual_4() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        byte[] byteArray1 = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqualWithNull(byteArray, 0, 2, byteArray1, 1, 1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);}
 *  */
    @Test
    public void testIsEqualWithNull_ReturnIsEqual_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqualWithNull(byteArray, 1, 1, null, -255, 0);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);}
 *  */
    @Test
    public void testIsEqualWithNull_ReturnIsEqual_2() {
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        boolean actual = ArchiveUtils.isEqualWithNull(byteArray, 1, 1, null, -255, 0);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);}
 *  */
    @Test
    public void testIsEqualWithNull_ReturnIsEqual_5() {
        byte[] byteArray = {(byte) -127, (byte) 0};
        
        boolean actual = ArchiveUtils.isEqualWithNull(null, -255, 0, byteArray, 1, 1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);}
 *  */
    @Test
    public void testIsEqualWithNull_ReturnIsEqual_6() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        boolean actual = ArchiveUtils.isEqualWithNull(null, -255, 0, byteArray, 1, 1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.returnsFrom {@code return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);}
 *  */
    @Test
    public void testIsEqualWithNull_ReturnIsEqual() {
        boolean actual = ArchiveUtils.isEqualWithNull(null, -255, 0, null, -255, 0);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEqualWithNull([B, int, int, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);
 *  */
    @Test
    public void testIsEqualWithNull_ThrowArrayIndexOutOfBoundsException_2() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156)
            org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(ArchiveUtils.java:236) */
        ArchiveUtils.isEqualWithNull(byteArray, 1, 1, byteArray1, -256, 2);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);
 *  */
    @Test
    public void testIsEqualWithNull_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:166)
            org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(ArchiveUtils.java:236) */
        ArchiveUtils.isEqualWithNull(byteArray, 129, 1, null, -255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);
 *  */
    @Test
    public void testIsEqualWithNull_ThrowArrayIndexOutOfBoundsException_1() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156)
            org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(ArchiveUtils.java:236) */
        ArchiveUtils.isEqualWithNull(byteArray, 129, 1, null, -255, 2);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);
 *  */
    @Test
    public void testIsEqualWithNull_ThrowArrayIndexOutOfBoundsException_3() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:156)
            org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(ArchiveUtils.java:236) */
        ArchiveUtils.isEqualWithNull(byteArray, -256, 1, null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isEqualWithNull(byte[],int,int,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);
 *  */
    @Test
    public void testIsEqualWithNull_ThrowArrayIndexOutOfBoundsException_4() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.utils.ArchiveUtils.isEqual(ArchiveUtils.java:172)
            org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(ArchiveUtils.java:236) */
        ArchiveUtils.isEqualWithNull(null, -255, 0, byteArray, 129, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.isArrayZero
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isArrayZero([B, int)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isArrayZero(byte[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 *  */
    @Test
    public void testIsArrayZero_IOfANotEqualsZero() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = ArchiveUtils.isArrayZero(byteArray, 1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isArrayZero(byte[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsArrayZero_IOfAEqualsZero() {
        byte[] byteArray = {(byte) 0};
        
        boolean actual = ArchiveUtils.isArrayZero(byteArray, 1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isArrayZero(byte[],int)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsArrayZero_ReturnTrue() {
        boolean actual = ArchiveUtils.isArrayZero(null, 0);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isArrayZero([B, int)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isArrayZero(byte[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: a[i] != 0
 *  */
    @Test
    public void testIsArrayZero_ThrowArrayIndexOutOfBoundsException() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isArrayZero] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(ArchiveUtils.java:250) */
        ArchiveUtils.isArrayZero(byteArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#isArrayZero(byte[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a[i] != 0
 *  */
    @Test
    public void testIsArrayZero_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.isArrayZero] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(ArchiveUtils.java:250) */
        ArchiveUtils.isArrayZero(null, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.utils.ArchiveUtils.sanitize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sanitize(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#sanitize(java.lang.String)}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testSanitize_ReturnSbToString() {
        String string = "";
        
        String actual = ArchiveUtils.sanitize(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#sanitize(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testSanitize_CharacterIsISOControl() {
        String string = "";
        
        String actual = ArchiveUtils.sanitize(string);
        
        String expected = "?";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sanitize(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ArchiveUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.utils.ArchiveUtils#sanitize(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final char[] chars = s.toCharArray();
 *  */
    @Test
    public void testSanitize_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.compress.utils.ArchiveUtils.sanitize] produces [java.lang.NullPointerException]
            org.apache.commons.compress.utils.ArchiveUtils.sanitize(ArchiveUtils.java:273) */
        ArchiveUtils.sanitize(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sanitize(java.lang.String)
    
    @Test
    public void testSanitize1() {
        String string = "\u0000\u0000\u0000\u0000  ";
        
        String actual = ArchiveUtils.sanitize(string);
        
        String expected = "?????  ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

