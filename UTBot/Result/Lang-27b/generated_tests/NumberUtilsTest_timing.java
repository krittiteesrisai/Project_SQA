package org.apache.commons.lang3.math;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class NumberUtilsTest_timing {
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toInt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToInt_StrEqualsNull() {
        int actual = NumberUtils.toInt(null, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToInt_CatchNumberFormatException() {
        String string = "";
        
        int actual = NumberUtils.toInt(string, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToInt_CatchNumberFormatException_1() {
        String string = "-";
        
        int actual = NumberUtils.toInt(string, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toInt(java.lang.String, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String,int)}
     */
    @Test
    public void testToIntWithBlankString() {
        int actual = NumberUtils.toInt("\n\t\r", -2147483647);
        
        assertEquals(-2147483647, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String,int)}
     */
    @Test
    public void testToIntWithBlankString1() {
        int actual = NumberUtils.toInt("\n\r", -2147483647);
        
        assertEquals(-2147483647, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toInt(java.lang.String, int)
    
    @Test
    public void testToInt1() {
        String string = "+";
        
        int actual = NumberUtils.toInt(string, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testToInt2() {
        String string = "\u0000\u0000\u0000";
        
        int actual = NumberUtils.toInt(string, 0);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testToInt3() {
        String string = "-\u0000\u0000";
        
        int actual = NumberUtils.toInt(string, 0);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
 * @utbot.returnsFrom {@code return toInt(str, 0);}
 *  */
    @Test
    public void testToInt_ReturnToInt() {
        int actual = NumberUtils.toInt(null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
 * @utbot.returnsFrom {@code return toInt(str, 0);}
 *  */
    @Test
    public void testToInt_ReturnToInt_1() {
        String string = "";
        
        int actual = NumberUtils.toInt(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
 * @utbot.returnsFrom {@code return toInt(str, 0);}
 *  */
    @Test
    public void testToInt_ReturnToInt_2() {
        String string = "-";
        
        int actual = NumberUtils.toInt(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
 * @utbot.returnsFrom {@code return toInt(str, 0);}
 *  */
    @Test
    public void testToInt_ReturnToInt_3() {
        String string = "+";
        
        int actual = NumberUtils.toInt(string);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toInt(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
     */
    @Test
    public void testToIntReturnsZeroWithNonEmptyString() {
        int actual = NumberUtils.toInt("\u0014\n\t\r");
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
     */
    @Test
    public void testToIntReturnsZeroWithEmptyString() {
        int actual = NumberUtils.toInt("");
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
     */
    @Test
    public void testToIntReturnsZeroWithNonEmptyString1() {
        int actual = NumberUtils.toInt("\r\t\u0014\n");
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
     */
    @Test
    public void testToIntReturnsZeroWithNonEmptyString2() {
        int actual = NumberUtils.toInt("\u0014\r\t\n");
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toInt(java.lang.String)}
     */
    @Test
    public void testToIntReturnsZeroWithNonEmptyString3() {
        int actual = NumberUtils.toInt("\u008A");
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toInt(java.lang.String)
    
    @Test
    public void testToInt4() {
        String string = "\u0000\u0000\u0000\u0000";
        
        int actual = NumberUtils.toInt(string);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testToInt5() {
        String string = "+\u0000";
        
        int actual = NumberUtils.toInt(string);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toShort
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toShort(java.lang.String, short)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String,short)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToShort_StrEqualsNull() {
        short actual = NumberUtils.toShort(null, (short) -255);
        
        assertEquals((short) -255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String,short)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToShort_CatchNumberFormatException() {
        String string = "";
        
        short actual = NumberUtils.toShort(string, (short) -255);
        
        assertEquals((short) -255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String,short)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToShort_CatchNumberFormatException_1() {
        String string = "-";
        
        short actual = NumberUtils.toShort(string, (short) -255);
        
        assertEquals((short) -255, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toShort(java.lang.String, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String,short)}
     */
    @Test
    public void testToShortWithBlankString() {
        short actual = NumberUtils.toShort("\n\t\r", (short) -32767);
        
        assertEquals((short) -32767, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String,short)}
     */
    @Test
    public void testToShortWithBlankString1() {
        short actual = NumberUtils.toShort("\n\r", (short) -32767);
        
        assertEquals((short) -32767, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String,short)}
     */
    @Test
    public void testToShortReturnsZeroWithEmptyStringAndCornerCase() {
        short actual = NumberUtils.toShort("", (short) 0);
        
        assertEquals((short) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String,short)}
     */
    @Test
    public void testToShortReturnsZeroWithNonEmptyStringAndCornerCase() {
        short actual = NumberUtils.toShort("\u00A8", (short) 0);
        
        assertEquals((short) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String,short)}
     */
    @Test
    public void testToShortWithNonEmptyString() {
        short actual = NumberUtils.toShort("abc", (short) -5);
        
        assertEquals((short) -5, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toShort(java.lang.String, short)
    
    @Test
    public void testToShort1() {
        String string = "-\u0000\u0000";
        
        short actual = NumberUtils.toShort(string, (short) 0);
        
        assertEquals((short) 0, actual);
    }
    
    @Test
    public void testToShort2() {
        String string = "+";
        
        short actual = NumberUtils.toShort(string, (short) 0);
        
        assertEquals((short) 0, actual);
    }
    
    @Test
    public void testToShort3() {
        String string = "\u0000\u0000\u0000";
        
        short actual = NumberUtils.toShort(string, (short) 0);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toShort
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toShort(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
 * @utbot.returnsFrom {@code return toShort(str, (short) 0);}
 *  */
    @Test
    public void testToShort_ReturnToShort() {
        short actual = NumberUtils.toShort(null);
        
        assertEquals((short) 0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
 * @utbot.returnsFrom {@code return toShort(str, (short) 0);}
 *  */
    @Test
    public void testToShort_ReturnToShort_1() {
        String string = "";
        
        short actual = NumberUtils.toShort(string);
        
        assertEquals((short) 0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
 * @utbot.returnsFrom {@code return toShort(str, (short) 0);}
 *  */
    @Test
    public void testToShort_ReturnToShort_2() {
        String string = "-";
        
        short actual = NumberUtils.toShort(string);
        
        assertEquals((short) 0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
 * @utbot.returnsFrom {@code return toShort(str, (short) 0);}
 *  */
    @Test
    public void testToShort_ReturnToShort_3() {
        String string = "+";
        
        short actual = NumberUtils.toShort(string);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toShort(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
     */
    @Test
    public void testToShortReturnsZeroWithNonEmptyString() {
        short actual = NumberUtils.toShort("\u0014\n\t\r");
        
        assertEquals((short) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
     */
    @Test
    public void testToShortReturnsZeroWithEmptyString() {
        short actual = NumberUtils.toShort("");
        
        assertEquals((short) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
     */
    @Test
    public void testToShortReturnsZeroWithNonEmptyString1() {
        short actual = NumberUtils.toShort("\r\t\u0014\n");
        
        assertEquals((short) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
     */
    @Test
    public void testToShortReturnsZeroWithNonEmptyString2() {
        short actual = NumberUtils.toShort("\u0014\r\t\n");
        
        assertEquals((short) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toShort(java.lang.String)}
     */
    @Test
    public void testToShortReturnsZeroWithNonEmptyString3() {
        short actual = NumberUtils.toShort("\u008A");
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toShort(java.lang.String)
    
    @Test
    public void testToShort4() {
        String string = "+\u0000";
        
        short actual = NumberUtils.toShort(string);
        
        assertEquals((short) 0, actual);
    }
    
    @Test
    public void testToShort5() {
        String string = "-\u0000\u0000\u0000";
        
        short actual = NumberUtils.toShort(string);
        
        assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toLong(java.lang.String, long)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToLong_StrEqualsNull() {
        long actual = NumberUtils.toLong(null, -255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToLong_CatchNumberFormatException() {
        String string = "";
        
        long actual = NumberUtils.toLong(string, -255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToLong_CatchNumberFormatException_1() {
        String string = "-";
        
        long actual = NumberUtils.toLong(string, -255L);
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toLong(java.lang.String, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String,long)}
     */
    @Test
    public void testToLongWithBlankString() {
        long actual = NumberUtils.toLong("\n\t\r", -9223372036854775807L);
        
        assertEquals(-9223372036854775807L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String,long)}
     */
    @Test
    public void testToLongWithBlankString1() {
        long actual = NumberUtils.toLong("\n\r", -9223372036854775807L);
        
        assertEquals(-9223372036854775807L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String,long)}
     */
    @Test
    public void testToLongReturnsZeroWithEmptyStringAndCornerCase() {
        long actual = NumberUtils.toLong("", 0L);
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String,long)}
     */
    @Test
    public void testToLongReturnsZeroWithNonEmptyStringAndCornerCase() {
        long actual = NumberUtils.toLong("\u00A8", 0L);
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String,long)}
     */
    @Test
    public void testToLongWithNonEmptyString() {
        long actual = NumberUtils.toLong("abc", -257L);
        
        assertEquals(-257L, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toLong(java.lang.String, long)
    
    @Test
    public void testToLong1() {
        String string = "-\u0000\u0000";
        
        long actual = NumberUtils.toLong(string, 0L);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testToLong2() {
        String string = "+";
        
        long actual = NumberUtils.toLong(string, 0L);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testToLong3() {
        String string = "\u0000\u0000\u0000";
        
        long actual = NumberUtils.toLong(string, 0L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
 * @utbot.returnsFrom {@code return toLong(str, 0L);}
 *  */
    @Test
    public void testToLong_ReturnToLong() {
        long actual = NumberUtils.toLong(null);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
 * @utbot.returnsFrom {@code return toLong(str, 0L);}
 *  */
    @Test
    public void testToLong_ReturnToLong_1() {
        String string = "";
        
        long actual = NumberUtils.toLong(string);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
 * @utbot.returnsFrom {@code return toLong(str, 0L);}
 *  */
    @Test
    public void testToLong_ReturnToLong_2() {
        String string = "-";
        
        long actual = NumberUtils.toLong(string);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
 * @utbot.returnsFrom {@code return toLong(str, 0L);}
 *  */
    @Test
    public void testToLong_ReturnToLong_3() {
        String string = "+";
        
        long actual = NumberUtils.toLong(string);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toLong(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
     */
    @Test
    public void testToLongReturnsZeroWithNonEmptyString() {
        long actual = NumberUtils.toLong("\u0014\n\t\r");
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
     */
    @Test
    public void testToLongReturnsZeroWithEmptyString() {
        long actual = NumberUtils.toLong("");
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
     */
    @Test
    public void testToLongReturnsZeroWithNonEmptyString1() {
        long actual = NumberUtils.toLong("\r\t\u0014\n");
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
     */
    @Test
    public void testToLongReturnsZeroWithNonEmptyString2() {
        long actual = NumberUtils.toLong("\u0014\r\t\n");
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toLong(java.lang.String)}
     */
    @Test
    public void testToLongReturnsZeroWithNonEmptyString3() {
        long actual = NumberUtils.toLong("\u008A");
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toLong(java.lang.String)
    
    @Test
    public void testToLong4() {
        String string = "+\u0000";
        
        long actual = NumberUtils.toLong(string);
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testToLong5() {
        String string = "-\u0000\u0000\u0000";
        
        long actual = NumberUtils.toLong(string);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toByte
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toByte(java.lang.String, byte)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String,byte)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToByte_StrEqualsNull() {
        byte actual = NumberUtils.toByte(null, (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String,byte)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToByte_CatchNumberFormatException() {
        String string = "";
        
        byte actual = NumberUtils.toByte(string, (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String,byte)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToByte_CatchNumberFormatException_1() {
        String string = "-";
        
        byte actual = NumberUtils.toByte(string, (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toByte(java.lang.String, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String,byte)}
     */
    @Test
    public void testToByteWithBlankString() {
        byte actual = NumberUtils.toByte("\n\t\r", (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String,byte)}
     */
    @Test
    public void testToByteWithBlankString1() {
        byte actual = NumberUtils.toByte("\n\r", (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String,byte)}
     */
    @Test
    public void testToByteReturnsZeroWithEmptyStringAndCornerCase() {
        byte actual = NumberUtils.toByte("", (byte) 0);
        
        assertEquals((byte) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String,byte)}
     */
    @Test
    public void testToByteReturnsZeroWithNonEmptyStringAndCornerCase() {
        byte actual = NumberUtils.toByte("\u00A8", (byte) 0);
        
        assertEquals((byte) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String,byte)}
     */
    @Test
    public void testToByteWithNonEmptyString() {
        byte actual = NumberUtils.toByte("abc", (byte) -3);
        
        assertEquals((byte) -3, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toByte(java.lang.String, byte)
    
    @Test
    public void testToByte1() {
        String string = "-\u0000\u0000";
        
        byte actual = NumberUtils.toByte(string, (byte) 0);
        
        assertEquals((byte) 0, actual);
    }
    
    @Test
    public void testToByte2() {
        String string = "+";
        
        byte actual = NumberUtils.toByte(string, (byte) 0);
        
        assertEquals((byte) 0, actual);
    }
    
    @Test
    public void testToByte3() {
        String string = "\u0000\u0000\u0000";
        
        byte actual = NumberUtils.toByte(string, (byte) 0);
        
        assertEquals((byte) 0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toByte
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toByte(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
 * @utbot.returnsFrom {@code return toByte(str, (byte) 0);}
 *  */
    @Test
    public void testToByte_ReturnToByte() {
        byte actual = NumberUtils.toByte(null);
        
        assertEquals((byte) 0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
 * @utbot.returnsFrom {@code return toByte(str, (byte) 0);}
 *  */
    @Test
    public void testToByte_ReturnToByte_1() {
        String string = "";
        
        byte actual = NumberUtils.toByte(string);
        
        assertEquals((byte) 0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
 * @utbot.returnsFrom {@code return toByte(str, (byte) 0);}
 *  */
    @Test
    public void testToByte_ReturnToByte_2() {
        String string = "-";
        
        byte actual = NumberUtils.toByte(string);
        
        assertEquals((byte) 0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
 * @utbot.returnsFrom {@code return toByte(str, (byte) 0);}
 *  */
    @Test
    public void testToByte_ReturnToByte_3() {
        String string = "+";
        
        byte actual = NumberUtils.toByte(string);
        
        assertEquals((byte) 0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toByte(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
     */
    @Test
    public void testToByteReturnsZeroWithNonEmptyString() {
        byte actual = NumberUtils.toByte("\u0014\n\t\r");
        
        assertEquals((byte) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
     */
    @Test
    public void testToByteReturnsZeroWithEmptyString() {
        byte actual = NumberUtils.toByte("");
        
        assertEquals((byte) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
     */
    @Test
    public void testToByteReturnsZeroWithNonEmptyString1() {
        byte actual = NumberUtils.toByte("\r\t\u0014\n");
        
        assertEquals((byte) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
     */
    @Test
    public void testToByteReturnsZeroWithNonEmptyString2() {
        byte actual = NumberUtils.toByte("\u0014\r\t\n");
        
        assertEquals((byte) 0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toByte(java.lang.String)}
     */
    @Test
    public void testToByteReturnsZeroWithNonEmptyString3() {
        byte actual = NumberUtils.toByte("\u008A");
        
        assertEquals((byte) 0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toByte(java.lang.String)
    
    @Test
    public void testToByte4() {
        String string = "+\u0000";
        
        byte actual = NumberUtils.toByte(string);
        
        assertEquals((byte) 0, actual);
    }
    
    @Test
    public void testToByte5() {
        String string = "-\u0000\u0000\u0000";
        
        byte actual = NumberUtils.toByte(string);
        
        assertEquals((byte) 0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toDouble(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToDouble_StrEqualsNull() {
        double actual = NumberUtils.toDouble(null, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToDouble_StrNotEqualsNull() {
        String string = "";
        
        double actual = NumberUtils.toDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToDouble_StrNotEqualsNull_1() {
        String string = "  ";
        
        double actual = NumberUtils.toDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToDouble_StrNotEqualsNull_2() {
        String string = "-";
        
        double actual = NumberUtils.toDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToDouble_StrNotEqualsNull_3() {
        String string = ".";
        
        double actual = NumberUtils.toDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toDouble(java.lang.String, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
     */
    @Test
    public void testToDoubleWithBlankString() {
        double actual = NumberUtils.toDouble("\n\t\r", 2.0);
        
        org.junit.Assert.assertEquals(2.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
     */
    @Test
    public void testToDoubleWithBlankString1() {
        double actual = NumberUtils.toDouble("\n\r", 2.0);
        
        org.junit.Assert.assertEquals(2.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
     */
    @Test
    public void testToDoubleWithEmptyString() {
        double actual = NumberUtils.toDouble("", 7.0222388080559215E305);
        
        org.junit.Assert.assertEquals(7.0222388080559215E305, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
     */
    @Test
    public void testToDoubleWithNonEmptyString() {
        double actual = NumberUtils.toDouble("\u00A8", 7.0222388080559215E305);
        
        org.junit.Assert.assertEquals(7.0222388080559215E305, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String,double)}
     */
    @Test
    public void testToDoubleReturnsInfinityWithNonEmptyStringAndCornerCase() {
        double actual = NumberUtils.toDouble("abc", java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toDouble(java.lang.String, double)
    
    @Test
    public void testToDouble1() {
        String string = "4";
        
        double actual = NumberUtils.toDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(4.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble() {
        String string = "-\u801A ";
        
        double actual = NumberUtils.toDouble(string);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble_1() {
        double actual = NumberUtils.toDouble(null);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble_2() {
        String string = "";
        
        double actual = NumberUtils.toDouble(string);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble_3() {
        String string = " ";
        
        double actual = NumberUtils.toDouble(string);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble_4() {
        String string = "+";
        
        double actual = NumberUtils.toDouble(string);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble_5() {
        String string = "+.";
        
        double actual = NumberUtils.toDouble(string);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toDouble(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
     */
    @Test
    public void testToDoubleReturnsZeroWithNonEmptyString() {
        double actual = NumberUtils.toDouble("\u0014\n\t\r");
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
     */
    @Test
    public void testToDoubleReturnsZeroWithEmptyString() {
        double actual = NumberUtils.toDouble("");
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
     */
    @Test
    public void testToDoubleReturnsZeroWithNonEmptyString1() {
        double actual = NumberUtils.toDouble("\r\t\u0014\n");
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
     */
    @Test
    public void testToDoubleReturnsZeroWithNonEmptyString2() {
        double actual = NumberUtils.toDouble("\u0014\r\t\n");
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toDouble(java.lang.String)}
     */
    @Test
    public void testToDoubleReturnsZeroWithNonEmptyString3() {
        double actual = NumberUtils.toDouble("\u008A");
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat() {
        String string = "-! ";
        
        float actual = NumberUtils.toFloat(string);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat_1() {
        float actual = NumberUtils.toFloat(null);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat_2() {
        String string = "";
        
        float actual = NumberUtils.toFloat(string);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat_3() {
        String string = " ";
        
        float actual = NumberUtils.toFloat(string);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat_4() {
        String string = "+";
        
        float actual = NumberUtils.toFloat(string);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat_5() {
        String string = "+.";
        
        float actual = NumberUtils.toFloat(string);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toFloat(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
     */
    @Test
    public void testToFloatReturnsZeroWithNonEmptyString() {
        float actual = NumberUtils.toFloat("\u0014\n\t\r");
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
     */
    @Test
    public void testToFloatReturnsZeroWithEmptyString() {
        float actual = NumberUtils.toFloat("");
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
     */
    @Test
    public void testToFloatReturnsZeroWithNonEmptyString1() {
        float actual = NumberUtils.toFloat("\r\t\u0014\n");
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
     */
    @Test
    public void testToFloatReturnsZeroWithNonEmptyString2() {
        float actual = NumberUtils.toFloat("\u0014\r\t\n");
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String)}
     */
    @Test
    public void testToFloatReturnsZeroWithNonEmptyString3() {
        float actual = NumberUtils.toFloat("\u008A");
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.toFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toFloat(java.lang.String, float)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToFloat_StrNotEqualsNull() {
        String string = "!";
        
        float actual = NumberUtils.toFloat(string, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToFloat_StrEqualsNull() {
        float actual = NumberUtils.toFloat(null, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToFloat_StrNotEqualsNull_1() {
        String string = "";
        
        float actual = NumberUtils.toFloat(string, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToFloat_StrNotEqualsNull_2() {
        String string = "  ";
        
        float actual = NumberUtils.toFloat(string, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToFloat_StrNotEqualsNull_3() {
        String string = "-";
        
        float actual = NumberUtils.toFloat(string, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
 * @utbot.executesCondition {@code (str == null): False}
 *  */
    @Test
    public void testToFloat_StrNotEqualsNull_4() {
        String string = ".";
        
        float actual = NumberUtils.toFloat(string, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toFloat(java.lang.String, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
     */
    @Test
    public void testToFloatWithBlankString() {
        float actual = NumberUtils.toFloat("\n\t\r", 2.0f);
        
        org.junit.Assert.assertEquals(2.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
     */
    @Test
    public void testToFloatWithBlankString1() {
        float actual = NumberUtils.toFloat("\n\r", 2.0f);
        
        org.junit.Assert.assertEquals(2.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
     */
    @Test
    public void testToFloatWithEmptyString() {
        float actual = NumberUtils.toFloat("", 5.192297E33f);
        
        org.junit.Assert.assertEquals(5.192297E33f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
     */
    @Test
    public void testToFloatWithNonEmptyString() {
        float actual = NumberUtils.toFloat("\u00A8", 5.192297E33f);
        
        org.junit.Assert.assertEquals(5.192297E33f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#toFloat(java.lang.String,float)}
     */
    @Test
    public void testToFloatWithNonEmptyStringAndCornerCase() {
        float actual = NumberUtils.toFloat("abc", java.lang.Float.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Float.POSITIVE_INFINITY, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(double, double, double)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double,double,double)}
 * @utbot.invokes {@link java.lang.Math#min(double,double)}
 * @utbot.invokes {@link java.lang.Math#min(double,double)}
 * @utbot.returnsFrom {@code return Math.min(Math.min(a, b), c);}
 *  */
    @Test
    public void testMin_MathMin() {
        double actual = NumberUtils.min(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(double, double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double,double,double)}
     */
    @Test
    public void testMinWithCornerCase() {
        double actual = NumberUtils.min(-1.1125369292536007E-308, -1.0, 0.0);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double,double,double)}
     */
    @Test
    public void testMinWithCornerCases() {
        double actual = NumberUtils.min(1.0000000037252903, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(1.0000000037252903, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double,double,double)}
     */
    @Test
    public void testMinWithCornerCase1() {
        double actual = NumberUtils.min(-1.1125369292536007E-308, 1.0, 0.0);
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double,double,double)}
     */
    @Test
    public void testMinWithCornerCase2() {
        double actual = NumberUtils.min(-7.2911220195563975E-304, 1.0, 0.0);
        
        org.junit.Assert.assertEquals(-7.2911220195563975E-304, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double,double,double)}
     */
    @Test
    public void testMinReturnsInfinityWithCornerCases() {
        double actual = NumberUtils.min(-1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin() {
        float[] floatArray = {0.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 *  */
    @Test
    public void testMin_FloatIsNaN() {
        float[] floatArray = {0.0f, java.lang.Float.NaN};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin() {
        float[] floatArray = {0.0f, 0.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin() {
        float[] floatArray = {0.0f, -1.1754945E-38f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(-1.1754945E-38f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min([F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMin_ThrowIllegalArgumentException() {
        float[] floatArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1131) */
        NumberUtils.min(floatArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMin_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1131) */
        NumberUtils.min(((float[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.NEGATIVE_INFINITY, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray1() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.NEGATIVE_INFINITY, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray2() {
        float[] floatArray = {java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.NEGATIVE_INFINITY, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray3() {
        float[] floatArray = {java.lang.Float.NEGATIVE_INFINITY, 0.0f, -1.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.NEGATIVE_INFINITY, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray4() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.NEGATIVE_INFINITY, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin1() {
        double[] doubleArray = {0.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 *  */
    @Test
    public void testMin_DoubleIsNaN() {
        double[] doubleArray = {0.0, java.lang.Double.NaN};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin1() {
        double[] doubleArray = {-0.0, 0.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin1() {
        double[] doubleArray = {2.398912263073717E-308, -1.3284932301315168E-231};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(-1.3284932301315168E-231, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min([D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMin_ThrowIllegalArgumentException1() {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1103) */
        NumberUtils.min(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMin_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1103) */
        NumberUtils.min(((double[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray5() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 1.0, -1.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray6() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 1.0, -1.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
     */
    @Test
    public void testMinReturnsInfinityWithNonEmptyPrimitiveArray() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 0.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray7() {
        double[] doubleArray = {1.0, java.lang.Double.POSITIVE_INFINITY, -1.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(double[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray8() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 1.0, -1.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(float, float, float)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float,float,float)}
 * @utbot.invokes {@link java.lang.Math#min(float,float)}
 * @utbot.invokes {@link java.lang.Math#min(float,float)}
 * @utbot.returnsFrom {@code return Math.min(Math.min(a, b), c);}
 *  */
    @Test
    public void testMin_MathMin1() {
        float actual = NumberUtils.min(-0.0f, java.lang.Float.NaN, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(float, float, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float,float,float)}
     */
    @Test
    public void testMinWithCornerCase3() {
        float actual = NumberUtils.min(-5.877472E-39f, -1.0f, 0.0f);
        
        org.junit.Assert.assertEquals(-1.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float,float,float)}
     */
    @Test
    public void testMinWithCornerCases1() {
        float actual = NumberUtils.min(1.015625f, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(1.015625f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float,float,float)}
     */
    @Test
    public void testMinWithCornerCase4() {
        float actual = NumberUtils.min(-5.877472E-39f, 1.0f, 0.0f);
        
        org.junit.Assert.assertEquals(-5.877472E-39f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float,float,float)}
     */
    @Test
    public void testMinWithCornerCase5() {
        float actual = NumberUtils.min(-1.17549435E-38f, 1.0f, 0.0f);
        
        org.junit.Assert.assertEquals(-1.17549435E-38f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(float,float,float)}
     */
    @Test
    public void testMinWithCornerCases2() {
        float actual = NumberUtils.min(-1.0f, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Float.NEGATIVE_INFINITY, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin2() {
        short[] shortArray = {(short) -255};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals((short) -255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin2() {
        short[] shortArray = {(short) 256, (short) 255};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals((short) 255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin2() {
        short[] shortArray = {(short) -171, (short) -171};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals((short) -171, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min([S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMin_ThrowIllegalArgumentException2() {
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1054) */
        NumberUtils.min(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMin_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1054) */
        NumberUtils.min(((short[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray9() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals(java.lang.Short.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray10() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals(java.lang.Short.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
     */
    @Test
    public void testMinReturnsOneWithNonEmptyPrimitiveArray() {
        short[] shortArray = {java.lang.Short.MAX_VALUE, (short) 1};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals((short) 1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray11() {
        short[] shortArray = {java.lang.Short.MIN_VALUE, (short) 1, (short) -1};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals(java.lang.Short.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray12() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals(java.lang.Short.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(long, long, long)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long,long,long)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CLessThanA() {
        long actual = NumberUtils.min(130L, 10L, -245L);
        
        assertEquals(-245L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long,long,long)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CGreaterOrEqualA() {
        long actual = NumberUtils.min(-110L, -110L, -110L);
        
        assertEquals(-110L, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(long, long, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long,long,long)}
     */
    @Test
    public void testMinReturnsZeroWithCornerCases() {
        long actual = NumberUtils.min(8192L, 0L, 0L);
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long,long,long)}
     */
    @Test
    public void testMinReturnsZeroWithCornerCase() {
        long actual = NumberUtils.min(8192L, 0L, 549755813888L);
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long,long,long)}
     */
    @Test
    public void testMinReturns128() {
        long actual = NumberUtils.min(8192L, 128L, 549755813888L);
        
        assertEquals(128L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long,long,long)}
     */
    @Test
    public void testMinWithCornerCases3() {
        long actual = NumberUtils.min(java.lang.Long.MAX_VALUE, -134217729L, 0L);
        
        assertEquals(-134217729L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long,long,long)}
     */
    @Test
    public void testMinReturns1281() {
        long actual = NumberUtils.min(1073750016L, 128L, 549755813888L);
        
        assertEquals(128L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(int, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int,int,int)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_BGreaterOrEqualA() {
        int actual = NumberUtils.min(-255, -255, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int,int,int)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CGreaterOrEqualA1() {
        int actual = NumberUtils.min(256, 255, 255);
        
        assertEquals(255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int,int,int)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CLessThanA1() {
        int actual = NumberUtils.min(5, 4, 3);
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(int, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int,int,int)}
     */
    @Test
    public void testMin() {
        int actual = NumberUtils.min(2147483583, -1, -1);
        
        assertEquals(-1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int,int,int)}
     */
    @Test
    public void testMinWithCornerCase6() {
        int actual = NumberUtils.min(2147483583, -1, Integer.MAX_VALUE);
        
        assertEquals(-1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int,int,int)}
     */
    @Test
    public void testMinWithCornerCases4() {
        int actual = NumberUtils.min(2147483583, Integer.MAX_VALUE, Integer.MAX_VALUE);
        
        assertEquals(2147483583, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int,int,int)}
     */
    @Test
    public void testMinWithCornerCase7() {
        int actual = NumberUtils.min(-1, 2146959359, Integer.MIN_VALUE);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int,int,int)}
     */
    @Test
    public void testMinWithCornerCases5() {
        int actual = NumberUtils.min(2143289279, Integer.MAX_VALUE, Integer.MAX_VALUE);
        
        assertEquals(2143289279, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(short, short, short)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short,short,short)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_BGreaterOrEqualA1() {
        short actual = NumberUtils.min((short) -255, (short) -255, (short) -255);
        
        assertEquals((short) -255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short,short,short)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CGreaterOrEqualA2() {
        short actual = NumberUtils.min((short) 256, (short) 255, (short) 255);
        
        assertEquals((short) 255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short,short,short)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CLessThanA2() {
        short actual = NumberUtils.min((short) 33, (short) 32, (short) 31);
        
        assertEquals((short) 31, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(short, short, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short,short,short)}
     */
    @Test
    public void testMin1() {
        short actual = NumberUtils.min((short) 32759, (short) -1, (short) -1);
        
        assertEquals((short) -1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short,short,short)}
     */
    @Test
    public void testMinWithCornerCase8() {
        short actual = NumberUtils.min((short) 32759, (short) -1, java.lang.Short.MAX_VALUE);
        
        assertEquals((short) -1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short,short,short)}
     */
    @Test
    public void testMinReturns32759WithCornerCases() {
        short actual = NumberUtils.min((short) 32759, java.lang.Short.MAX_VALUE, java.lang.Short.MAX_VALUE);
        
        assertEquals((short) 32759, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short,short,short)}
     */
    @Test
    public void testMinWithCornerCase9() {
        short actual = NumberUtils.min((short) -1, (short) -1, java.lang.Short.MIN_VALUE);
        
        assertEquals(java.lang.Short.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(short,short,short)}
     */
    @Test
    public void testMinReturns32695WithCornerCases() {
        short actual = NumberUtils.min((short) 32695, java.lang.Short.MAX_VALUE, java.lang.Short.MAX_VALUE);
        
        assertEquals((short) 32695, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(byte, byte, byte)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte,byte,byte)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_BGreaterOrEqualA2() {
        byte actual = NumberUtils.min((byte) -127, (byte) -127, (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte,byte,byte)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CGreaterOrEqualA3() {
        byte actual = NumberUtils.min((byte) 64, (byte) 63, (byte) 63);
        
        assertEquals((byte) 63, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte,byte,byte)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CLessThanA3() {
        byte actual = NumberUtils.min((byte) 65, (byte) 64, (byte) 63);
        
        assertEquals((byte) 63, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(byte, byte, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte,byte,byte)}
     */
    @Test
    public void testMin2() {
        byte actual = NumberUtils.min((byte) 125, (byte) -1, (byte) -1);
        
        assertEquals((byte) -1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte,byte,byte)}
     */
    @Test
    public void testMinWithCornerCase10() {
        byte actual = NumberUtils.min((byte) 125, (byte) -1, java.lang.Byte.MAX_VALUE);
        
        assertEquals((byte) -1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte,byte,byte)}
     */
    @Test
    public void testMinReturns125WithCornerCases() {
        byte actual = NumberUtils.min((byte) 125, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE);
        
        assertEquals((byte) 125, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte,byte,byte)}
     */
    @Test
    public void testMinWithCornerCase11() {
        byte actual = NumberUtils.min((byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE);
        
        assertEquals(java.lang.Byte.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte,byte,byte)}
     */
    @Test
    public void testMinReturns109WithCornerCases() {
        byte actual = NumberUtils.min((byte) 109, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE);
        
        assertEquals((byte) 109, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin3() {
        byte[] byteArray = {(byte) -127};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin3() {
        byte[] byteArray = {(byte) 64, (byte) 63};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals((byte) 63, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin3() {
        byte[] byteArray = {(byte) -107, (byte) -107};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals((byte) -107, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min([B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMin_ThrowIllegalArgumentException3() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1078) */
        NumberUtils.min(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMin_ThrowNullPointerException3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1078) */
        NumberUtils.min(((byte[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray13() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals(java.lang.Byte.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray14() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals(java.lang.Byte.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
     */
    @Test
    public void testMinReturnsOneWithNonEmptyPrimitiveArray1() {
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, (byte) 1};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals((byte) 1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray15() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 1, (byte) -1};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals(java.lang.Byte.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(byte[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray16() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals(java.lang.Byte.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin4() {
        long[] longArray = {-255L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin4() {
        long[] longArray = {130L, 3L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(3L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin4() {
        long[] longArray = {169L, 169L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(169L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min([J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMin_ThrowIllegalArgumentException4() {
        long[] longArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1006) */
        NumberUtils.min(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMin_ThrowNullPointerException4() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1006) */
        NumberUtils.min(((long[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
     */
    @Test
    public void testMinReturnsZeroWithNonEmptyPrimitiveArray() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
     */
    @Test
    public void testMinReturnsZeroWithNonEmptyPrimitiveArray1() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
     */
    @Test
    public void testMinReturnsZeroWithNonEmptyPrimitiveArray2() {
        long[] longArray = {255L, 0L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
     */
    @Test
    public void testMinReturnsZeroWithNonEmptyPrimitiveArray3() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(0L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(long[])}
     */
    @Test
    public void testMinReturnsZeroWithNonEmptyPrimitiveArray4() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin5() {
        int[] intArray = {-255};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_JOfArrayLessThanMin() {
        int[] intArray = {256, 255};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_JOfArrayGreaterOrEqualMin() {
        int[] intArray = {-247, -247};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(-247, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min([I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMin_ThrowIllegalArgumentException5() {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1030) */
        NumberUtils.min(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMin_ThrowNullPointerException5() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.min] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.min(NumberUtils.java:1030) */
        NumberUtils.min(((int[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray17() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray18() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
     */
    @Test
    public void testMinReturnsOneWithNonEmptyPrimitiveArray2() {
        int[] intArray = {Integer.MAX_VALUE, 1};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray19() {
        int[] intArray = {Integer.MIN_VALUE, 1, -1};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#min(int[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray20() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(double, double, double)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double,double,double)}
 * @utbot.invokes {@link java.lang.Math#max(double,double)}
 * @utbot.invokes {@link java.lang.Math#max(double,double)}
 * @utbot.returnsFrom {@code return Math.max(Math.max(a, b), c);}
 *  */
    @Test
    public void testMax_MathMax() {
        double actual = NumberUtils.max(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(double, double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double,double,double)}
     */
    @Test
    public void testMaxReturnsZeroWithCornerCase() {
        double actual = NumberUtils.max(-1.1125369292536007E-308, -1.0, 0.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double,double,double)}
     */
    @Test
    public void testMaxReturnsInfinityWithCornerCases() {
        double actual = NumberUtils.max(1.0000000037252903, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double,double,double)}
     */
    @Test
    public void testMaxReturnsOneWithCornerCase() {
        double actual = NumberUtils.max(-1.1125369292536007E-308, 1.0, 0.0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double,double,double)}
     */
    @Test
    public void testMaxReturnsOneWithCornerCase1() {
        double actual = NumberUtils.max(-7.2911220195563975E-304, 1.0, 0.0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double,double,double)}
     */
    @Test
    public void testMaxReturnsInfinityWithCornerCases1() {
        double actual = NumberUtils.max(-1.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(float, float, float)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float,float,float)}
 * @utbot.invokes {@link java.lang.Math#max(float,float)}
 * @utbot.invokes {@link java.lang.Math#max(float,float)}
 * @utbot.returnsFrom {@code return Math.max(Math.max(a, b), c);}
 *  */
    @Test
    public void testMax_MathMax1() {
        float actual = NumberUtils.max(-0.0f, java.lang.Float.NaN, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(float, float, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float,float,float)}
     */
    @Test
    public void testMaxReturnsZeroWithCornerCase1() {
        float actual = NumberUtils.max(-5.877472E-39f, -1.0f, 0.0f);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float,float,float)}
     */
    @Test
    public void testMaxWithCornerCases() {
        float actual = NumberUtils.max(1.015625f, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Float.POSITIVE_INFINITY, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float,float,float)}
     */
    @Test
    public void testMaxReturnsOneWithCornerCase2() {
        float actual = NumberUtils.max(-5.877472E-39f, 1.0f, 0.0f);
        
        org.junit.Assert.assertEquals(1.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float,float,float)}
     */
    @Test
    public void testMaxReturnsOneWithCornerCase3() {
        float actual = NumberUtils.max(-1.17549435E-38f, 1.0f, 0.0f);
        
        org.junit.Assert.assertEquals(1.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float,float,float)}
     */
    @Test
    public void testMaxWithCornerCases1() {
        float actual = NumberUtils.max(-1.0f, java.lang.Float.POSITIVE_INFINITY, java.lang.Float.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Float.POSITIVE_INFINITY, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax() {
        float[] floatArray = {0.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 *  */
    @Test
    public void testMax_FloatIsNaN() {
        float[] floatArray = {0.0f, java.lang.Float.NaN};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayLessOrEqualMax() {
        float[] floatArray = {-0.0f, 0.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(-0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayGreaterThanMax() {
        float[] floatArray = {1.939566E-37f, 8.3125f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(8.3125f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max([F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMax_ThrowIllegalArgumentException() {
        float[] floatArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1285) */
        NumberUtils.max(floatArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMax_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1285) */
        NumberUtils.max(((float[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
     */
    @Test
    public void testMaxReturnsZeroWithNonEmptyPrimitiveArray() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
     */
    @Test
    public void testMaxReturnsZeroWithNonEmptyPrimitiveArray1() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
     */
    @Test
    public void testMaxWithNonEmptyPrimitiveArray() {
        float[] floatArray = {java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(-1.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
     */
    @Test
    public void testMaxReturnsZeroWithNonEmptyPrimitiveArray2() {
        float[] floatArray = {java.lang.Float.NEGATIVE_INFINITY, 0.0f, -1.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(float[])}
     */
    @Test
    public void testMaxReturnsZeroWithNonEmptyPrimitiveArray3() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(long, long, long)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long,long,long)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CGreaterThanA() {
        long actual = NumberUtils.max(-254L, -251L, -249L);
        
        assertEquals(-249L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long,long,long)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CLessOrEqualA() {
        long actual = NumberUtils.max(-219L, -219L, -219L);
        
        assertEquals(-219L, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(long, long, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long,long,long)}
     */
    @Test
    public void testMaxReturns8192WithCornerCases() {
        long actual = NumberUtils.max(8192L, 0L, 0L);
        
        assertEquals(8192L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long,long,long)}
     */
    @Test
    public void testMaxWithCornerCase() {
        long actual = NumberUtils.max(8192L, 0L, 549755813888L);
        
        assertEquals(549755813888L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long,long,long)}
     */
    @Test
    public void testMax() {
        long actual = NumberUtils.max(8192L, 128L, 549755813888L);
        
        assertEquals(549755813888L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long,long,long)}
     */
    @Test
    public void testMaxWithCornerCases2() {
        long actual = NumberUtils.max(java.lang.Long.MAX_VALUE, -134217729L, 0L);
        
        assertEquals(java.lang.Long.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long,long,long)}
     */
    @Test
    public void testMax1() {
        long actual = NumberUtils.max(1073750016L, 128L, 549755813888L);
        
        assertEquals(549755813888L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(int, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int,int,int)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_BLessOrEqualA() {
        int actual = NumberUtils.max(-255, -255, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int,int,int)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CLessOrEqualA1() {
        int actual = NumberUtils.max(-3, -2, -2);
        
        assertEquals(-2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int,int,int)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CGreaterThanA1() {
        int actual = NumberUtils.max(-4, -3, -2);
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(int, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int,int,int)}
     */
    @Test
    public void testMax2() {
        int actual = NumberUtils.max(2147483583, -1, -1);
        
        assertEquals(2147483583, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int,int,int)}
     */
    @Test
    public void testMaxWithCornerCase1() {
        int actual = NumberUtils.max(2147483583, -1, Integer.MAX_VALUE);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int,int,int)}
     */
    @Test
    public void testMaxWithCornerCases3() {
        int actual = NumberUtils.max(2147483583, Integer.MAX_VALUE, Integer.MAX_VALUE);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int,int,int)}
     */
    @Test
    public void testMaxWithCornerCase2() {
        int actual = NumberUtils.max(-1, 2146959359, Integer.MIN_VALUE);
        
        assertEquals(2146959359, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int,int,int)}
     */
    @Test
    public void testMaxWithCornerCases4() {
        int actual = NumberUtils.max(2143289279, Integer.MAX_VALUE, Integer.MAX_VALUE);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(short, short, short)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short,short,short)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_BLessOrEqualA1() {
        short actual = NumberUtils.max((short) -255, (short) -255, (short) -255);
        
        assertEquals((short) -255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short,short,short)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CLessOrEqualA2() {
        short actual = NumberUtils.max((short) -3, (short) -2, (short) -2);
        
        assertEquals((short) -2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short,short,short)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CGreaterThanA2() {
        short actual = NumberUtils.max((short) -4, (short) -3, (short) -2);
        
        assertEquals((short) -2, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(short, short, short)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short,short,short)}
     */
    @Test
    public void testMaxReturns32759() {
        short actual = NumberUtils.max((short) 32759, (short) -1, (short) -1);
        
        assertEquals((short) 32759, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short,short,short)}
     */
    @Test
    public void testMaxReturns32767WithCornerCase() {
        short actual = NumberUtils.max((short) 32759, (short) -1, java.lang.Short.MAX_VALUE);
        
        assertEquals(java.lang.Short.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short,short,short)}
     */
    @Test
    public void testMaxReturns32767WithCornerCases() {
        short actual = NumberUtils.max((short) 32759, java.lang.Short.MAX_VALUE, java.lang.Short.MAX_VALUE);
        
        assertEquals(java.lang.Short.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short,short,short)}
     */
    @Test
    public void testMaxWithCornerCase3() {
        short actual = NumberUtils.max((short) -1, (short) -1, java.lang.Short.MIN_VALUE);
        
        assertEquals((short) -1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short,short,short)}
     */
    @Test
    public void testMaxReturns32767WithCornerCases1() {
        short actual = NumberUtils.max((short) 32695, java.lang.Short.MAX_VALUE, java.lang.Short.MAX_VALUE);
        
        assertEquals(java.lang.Short.MAX_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(byte, byte, byte)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte,byte,byte)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_BLessOrEqualA2() {
        byte actual = NumberUtils.max((byte) -127, (byte) -127, (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte,byte,byte)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CLessOrEqualA3() {
        byte actual = NumberUtils.max((byte) -3, (byte) -2, (byte) -2);
        
        assertEquals((byte) -2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte,byte,byte)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CGreaterThanA3() {
        byte actual = NumberUtils.max((byte) -4, (byte) -3, (byte) -2);
        
        assertEquals((byte) -2, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(byte, byte, byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte,byte,byte)}
     */
    @Test
    public void testMaxReturns125() {
        byte actual = NumberUtils.max((byte) 125, (byte) -1, (byte) -1);
        
        assertEquals((byte) 125, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte,byte,byte)}
     */
    @Test
    public void testMaxReturns127WithCornerCase() {
        byte actual = NumberUtils.max((byte) 125, (byte) -1, java.lang.Byte.MAX_VALUE);
        
        assertEquals(java.lang.Byte.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte,byte,byte)}
     */
    @Test
    public void testMaxReturns127WithCornerCases() {
        byte actual = NumberUtils.max((byte) 125, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE);
        
        assertEquals(java.lang.Byte.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte,byte,byte)}
     */
    @Test
    public void testMaxWithCornerCase4() {
        byte actual = NumberUtils.max((byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE);
        
        assertEquals((byte) -1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte,byte,byte)}
     */
    @Test
    public void testMaxReturns127WithCornerCases1() {
        byte actual = NumberUtils.max((byte) 109, java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE);
        
        assertEquals(java.lang.Byte.MAX_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax1() {
        long[] longArray = {-255L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayGreaterThanMax1() {
        long[] longArray = {-254L, -253L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(-253L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayLessOrEqualMax1() {
        long[] longArray = {-199L, -199L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(-199L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max([J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMax_ThrowIllegalArgumentException1() {
        long[] longArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1160) */
        NumberUtils.max(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMax_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1160) */
        NumberUtils.max(((long[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(1L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray1() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(1L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray2() {
        long[] longArray = {1L, 0L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(1L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray3() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(1L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(long[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray4() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax2() {
        int[] intArray = {-255};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayGreaterThanMax2() {
        int[] intArray = {-2, -1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayLessOrEqualMax2() {
        int[] intArray = {-247, -247};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(-247, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max([I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMax_ThrowIllegalArgumentException2() {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1184) */
        NumberUtils.max(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMax_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1184) */
        NumberUtils.max(((int[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray5() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray6() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
     */
    @Test
    public void testMaxWithNonEmptyPrimitiveArray1() {
        int[] intArray = {Integer.MAX_VALUE, 1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray7() {
        int[] intArray = {Integer.MIN_VALUE, 1, -1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(int[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray8() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax3() {
        short[] shortArray = {(short) -255};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) -255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IOfArrayGreaterThanMax() {
        short[] shortArray = {(short) -2, (short) -1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) -1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IOfArrayLessOrEqualMax() {
        short[] shortArray = {(short) -95, (short) -95};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) -95, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max([S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMax_ThrowIllegalArgumentException3() {
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1208) */
        NumberUtils.max(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMax_ThrowNullPointerException3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1208) */
        NumberUtils.max(((short[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray9() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) 1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray10() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) 1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
     */
    @Test
    public void testMaxReturns32767WithNonEmptyPrimitiveArray() {
        short[] shortArray = {java.lang.Short.MAX_VALUE, (short) 1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals(java.lang.Short.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray11() {
        short[] shortArray = {java.lang.Short.MIN_VALUE, (short) 1, (short) -1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) 1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(short[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray12() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) 1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax4() {
        byte[] byteArray = {(byte) -127};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IOfArrayGreaterThanMax1() {
        byte[] byteArray = {(byte) -2, (byte) -1};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) -1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IOfArrayLessOrEqualMax1() {
        byte[] byteArray = {(byte) -107, (byte) -107};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) -107, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max([B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMax_ThrowIllegalArgumentException4() {
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1232) */
        NumberUtils.max(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMax_ThrowNullPointerException4() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1232) */
        NumberUtils.max(((byte[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray13() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) 1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray14() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) 1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
     */
    @Test
    public void testMaxReturns127WithNonEmptyPrimitiveArray() {
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, (byte) 1};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals(java.lang.Byte.MAX_VALUE, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray15() {
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 1, (byte) -1};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) 1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(byte[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray16() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) 1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax5() {
        double[] doubleArray = {0.0};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 *  */
    @Test
    public void testMax_DoubleIsNaN() {
        double[] doubleArray = {0.0, java.lang.Double.NaN};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayLessOrEqualMax3() {
        double[] doubleArray = {-2.315841784746982E77, -2.315841784746982E77};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(-2.315841784746982E77, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayGreaterThanMax3() {
        double[] doubleArray = {-2.805944054494235E-191, 3.79123897693129E44};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(3.79123897693129E44, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max([D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test
    public void testMax_ThrowIllegalArgumentException5() {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.IllegalArgumentException: Array cannot be empty.]
            org.apache.commons.lang3.Validate.isTrue(Validate.java:159)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1309)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1257) */
        NumberUtils.max(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: array == null
 *  */
    @Test
    public void testMax_ThrowNullPointerException5() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.max] produces [java.lang.NullPointerException: The Array must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.math.NumberUtils.validateArray(NumberUtils.java:1308)
            org.apache.commons.lang3.math.NumberUtils.max(NumberUtils.java:1257) */
        NumberUtils.max(((double[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
     */
    @Test
    public void testMaxReturnsInfinityWithNonEmptyPrimitiveArray() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 1.0, -1.0};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
     */
    @Test
    public void testMaxReturnsInfinityWithNonEmptyPrimitiveArray1() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 1.0, -1.0};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
     */
    @Test
    public void testMaxReturnsZeroWithNonEmptyPrimitiveArray4() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 0.0};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
     */
    @Test
    public void testMaxReturnsInfinityWithNonEmptyPrimitiveArray2() {
        double[] doubleArray = {1.0, java.lang.Double.POSITIVE_INFINITY, -1.0};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#max(double[])}
     */
    @Test
    public void testMaxReturnsInfinityWithNonEmptyPrimitiveArray3() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 1.0, -1.0};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.createLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateLong_StrEqualsNull() {
        Long actual = NumberUtils.createLong(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Long.valueOf(str);
 *  */
    @Test
    public void testCreateLong_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: Zero length string]
            java.base/java.lang.Long.decode(Long.java:1264)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Long.valueOf(str);
 *  */
    @Test
    public void testCreateLong_ThrowNumberFormatException_1() {
        String string = "-";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:701)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Long.valueOf(str);
 *  */
    @Test
    public void testCreateLong_ThrowNumberFormatException_2() {
        String string = "+";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:721)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong(string);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createLong(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
     */
    @Test
    public void testCreateLongThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:697)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong("\u0014\n\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
     */
    @Test
    public void testCreateLongThrowsNFEWithEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: Zero length string]
            java.base/java.lang.Long.decode(Long.java:1264)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong("");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
     */
    @Test
    public void testCreateLongThrowsNFEWithNonEmptyString1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:697)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong("\r\t\u0014\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
     */
    @Test
    public void testCreateLongThrowsNFEWithNonEmptyString2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:697)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong("\u0014\r\t\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createLong(java.lang.String)}
     */
    @Test
    public void testCreateLongThrowsNFEWithNonEmptyString3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:711)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong("\u008A");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createLong(java.lang.String)
    
    @Test
    public void testCreateLong1() {
        String string = "\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: "   "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:697)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong(string);
    }
    
    @Test
    public void testCreateLong2() {
        String string = "-\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: "-  "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:711)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong(string);
    }
    
    @Test
    public void testCreateLong3() {
        String string = "+\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: " "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:697)
            java.base/java.lang.Long.valueOf(Long.java:1136)
            java.base/java.lang.Long.decode(Long.java:1299)
            org.apache.commons.lang3.math.NumberUtils.createLong(NumberUtils.java:934) */
        NumberUtils.createLong(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.isNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsNotEqualsChar() {
        String string = "/ ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsNumber_StringUtilsIsEmpty() {
        boolean actual = NumberUtils.isNumber(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsNumber_StringUtilsIsEmpty_1() {
        String string = "";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): True}
 *  */
    @Test
    public void testIsNumber_IEqualsSz() {
        String string = "-0x";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsLessOrEqual9() {
        String string = "2";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsE() {
        String string = "e";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isNumber(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
     */
    @Test
    public void testIsNumberReturnsFalseWithNonEmptyString() {
        boolean actual = NumberUtils.isNumber("\u0014\n\t\r");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
     */
    @Test
    public void testIsNumberReturnsFalseWithEmptyString() {
        boolean actual = NumberUtils.isNumber("");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
     */
    @Test
    public void testIsNumberReturnsFalseWithNonEmptyString1() {
        boolean actual = NumberUtils.isNumber("\r\t\u0014\n");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
     */
    @Test
    public void testIsNumberReturnsFalseWithNonEmptyString2() {
        boolean actual = NumberUtils.isNumber("\u0014\r\t\n");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isNumber(java.lang.String)}
     */
    @Test
    public void testIsNumberReturnsFalseWithNonEmptyString3() {
        boolean actual = NumberUtils.isNumber("\u008A");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.createInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateInteger_StrEqualsNull() {
        Integer actual = NumberUtils.createInteger(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.decode(str);
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Zero length string]
            java.base/java.lang.Integer.decode(Integer.java:1423)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.decode(str);
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException_1() {
        String string = "-0x-    ";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Sign character in wrong position]
            java.base/java.lang.Integer.decode(Integer.java:1447)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.decode(str);
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException_2() {
        String string = "0x+";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Sign character in wrong position]
            java.base/java.lang.Integer.decode(Integer.java:1447)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException_3() {
        String string = "+0x";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: For input string: "" under radix 16]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.decode(str);
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException_4() {
        String string = "0X-";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Sign character in wrong position]
            java.base/java.lang.Integer.decode(Integer.java:1447)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger(string);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createInteger(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
     */
    @Test
    public void testCreateIntegerThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger("\u0014\n\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
     */
    @Test
    public void testCreateIntegerThrowsNFEWithEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Zero length string]
            java.base/java.lang.Integer.decode(Integer.java:1423)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger("");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
     */
    @Test
    public void testCreateIntegerThrowsNFEWithNonEmptyString1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger("\r\t\u0014\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
     */
    @Test
    public void testCreateIntegerThrowsNFEWithNonEmptyString2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger("\u0014\r\t\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createInteger(java.lang.String)}
     */
    @Test
    public void testCreateIntegerThrowsNFEWithNonEmptyString3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger("\u008A");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createInteger(java.lang.String)
    
    @Test
    public void testCreateInteger1() {
        String string = "-0";
        
        Integer actual = NumberUtils.createInteger(string);
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createInteger(java.lang.String)
    
    @Test
    public void testCreateInteger2() {
        String string = "+#";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: For input string: "" under radix 16]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916) */
        NumberUtils.createInteger(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.isAllZeros
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAllZeros(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAllZeros_StrEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = str.length() - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testIsAllZeros_StrCharAtNotEquals0() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return str.length() > 0;}
 *  */
    @Test
    public void testIsAllZeros_StrLengthLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = str.length() - 1; i >= 0; i--)} once
 * @utbot.returnsFrom {@code return str.length() > 0;}
 *  */
    @Test
    public void testIsAllZeros_StrLengthGreaterThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "0";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isAllZeros(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
     */
    @Test
    public void testIsAllZerosReturnsFalseWithNonEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = "\u0014\n\t\r";
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
     */
    @Test
    public void testIsAllZerosReturnsFalseWithEmptyString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = "";
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
     */
    @Test
    public void testIsAllZerosReturnsFalseWithNonEmptyString1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = "\r\t\u0014\n";
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
     */
    @Test
    public void testIsAllZerosReturnsFalseWithNonEmptyString2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = "\u0014\r\t\n";
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isAllZeros(java.lang.String)}
     */
    @Test
    public void testIsAllZerosReturnsFalseWithNonEmptyString3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = "\u008A";
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.createBigInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createBigInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigInteger(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateBigInteger_StrEqualsNull() {
        BigInteger actual = NumberUtils.createBigInteger(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBigInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigInteger(str);
 *  */
    @Test
    public void testCreateBigInteger_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Zero length BigInteger]
            java.base/java.math.BigInteger.<init>(BigInteger.java:488)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigInteger(str);
 *  */
    @Test
    public void testCreateBigInteger_ThrowNumberFormatException_1() {
        String string = "+";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Zero length BigInteger]
            java.base/java.math.BigInteger.<init>(BigInteger.java:507)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger(string);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createBigInteger(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigInteger(java.lang.String)}
     */
    @Test
    public void testCreateBigIntegerThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.math.BigInteger.<init>(BigInteger.java:538)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger("\u0014\n\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigInteger(java.lang.String)}
     */
    @Test
    public void testCreateBigIntegerThrowsNFEWithEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Zero length BigInteger]
            java.base/java.math.BigInteger.<init>(BigInteger.java:488)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger("");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigInteger(java.lang.String)}
     */
    @Test
    public void testCreateBigIntegerThrowsNFEWithNonEmptyString1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.math.BigInteger.<init>(BigInteger.java:538)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger("\r\t\u0014\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigInteger(java.lang.String)}
     */
    @Test
    public void testCreateBigIntegerThrowsNFEWithNonEmptyString2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: For input string: "
            
        "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.math.BigInteger.<init>(BigInteger.java:538)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger("\u0014\r\t\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigInteger(java.lang.String)}
     */
    @Test
    public void testCreateBigIntegerThrowsNFEWithNonEmptyString3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:668)
            java.base/java.math.BigInteger.<init>(BigInteger.java:538)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger("\u008A");
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createBigInteger(java.lang.String)
    
    @Test
    public void testCreateBigInteger1() {
        String string = "\u0000\u0000\u0000\u0000-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Illegal embedded sign character]
            java.base/java.math.BigInteger.<init>(BigInteger.java:496)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger(string);
    }
    
    @Test
    public void testCreateBigInteger2() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: For input string: "  "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.math.BigInteger.<init>(BigInteger.java:538)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger(string);
    }
    
    @Test
    public void testCreateBigInteger3() {
        String string = "-+\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: For input string: "    "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.math.BigInteger.<init>(BigInteger.java:538)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger(string);
    }
    
    @Test
    public void testCreateBigInteger4() {
        String string = "-\u0000\u0000\u0000\u0000\u0000\u0000\u0000+";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Illegal embedded sign character]
            java.base/java.math.BigInteger.<init>(BigInteger.java:502)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger(string);
    }
    
    @Test
    public void testCreateBigInteger5() {
        String string = "+-\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Illegal embedded sign character]
            java.base/java.math.BigInteger.<init>(BigInteger.java:496)
            org.apache.commons.lang3.math.NumberUtils.createBigInteger(NumberUtils.java:969) */
        NumberUtils.createBigInteger(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.createFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateFloat_StrEqualsNull() {
        Float actual = NumberUtils.createFloat(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Float.valueOf(str);
 *  */
    @Test
    public void testCreateFloat_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Float.valueOf(str);
 *  */
    @Test
    public void testCreateFloat_ThrowNumberFormatException_1() {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateFloat_ThrowNumberFormatException_2() {
        String string = "-";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Float.valueOf(str);
 *  */
    @Test
    public void testCreateFloat_ThrowNumberFormatException_3() {
        String string = "-.";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: "-."]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat(string);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createFloat(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
     */
    @Test
    public void testCreateFloatThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat("\u0014\n\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
     */
    @Test
    public void testCreateFloatThrowsNFEWithEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat("");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
     */
    @Test
    public void testCreateFloatThrowsNFEWithNonEmptyString1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat("\r\t\u0014\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
     */
    @Test
    public void testCreateFloatThrowsNFEWithNonEmptyString2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat("\u0014\r\t\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createFloat(java.lang.String)}
     */
    @Test
    public void testCreateFloatThrowsNFEWithNonEmptyString3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat("\u008A");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createFloat(java.lang.String)
    
    @Test
    public void testCreateFloat1() {
        String string = "\u0001-0\u0001";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = -0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat2() {
        String string = "0";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = 0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat3() {
        String string = "\u00010\u0001";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = 0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat4() {
        String string = "-.0";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = -0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat5() {
        String string = "-0\u0001";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = -0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat6() {
        String string = "\u00010";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = 0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat7() {
        String string = "0\u0001";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = 0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat8() {
        String string = "-0";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = -0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat9() {
        String string = "+0";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = 0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat10() {
        String string = "\u0001-0";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = -0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    
    @Test
    public void testCreateFloat11() {
        String string = "\u0001+0";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = 0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFloat(java.lang.String)
    
    @Test
    public void testCreateFloat12() {
        String string = "\u0001+I\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: "+I                            !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat(string);
    }
    
    @Test
    public void testCreateFloat13() {
        String string = "\u00010x\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: "0x                            !"]
            java.base/jdk.internal.math.FloatingDecimal.parseHexString(FloatingDecimal.java:2082)
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1870)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat(string);
    }
    
    @Test
    public void testCreateFloat14() {
        String string = "\u0001\u0001\u0001";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat(string);
    }
    
    @Test
    public void testCreateFloat15() {
        String string = "-!";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: "-!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang3.math.NumberUtils.createFloat(NumberUtils.java:881) */
        NumberUtils.createFloat(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.createNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testCreateNumber_StrEqualsNull() {
        Number actual = NumberUtils.createNumber(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isBlank(str)): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: StringUtils.isBlank(str)
 *  */
    @Test
    public void testCreateNumber_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createNumber] produces [java.lang.NumberFormatException: A blank string is not a valid number]
            org.apache.commons.lang3.math.NumberUtils.createNumber(NumberUtils.java:655) */
        NumberUtils.createNumber(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isBlank(str)): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: StringUtils.isBlank(str)
 *  */
    @Test
    public void testCreateNumber_ThrowNumberFormatException_1() {
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createNumber] produces [java.lang.NumberFormatException: A blank string is not a valid number]
            org.apache.commons.lang3.math.NumberUtils.createNumber(NumberUtils.java:655) */
        NumberUtils.createNumber(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isBlank(str)): False}
 * @utbot.executesCondition {@code (str.startsWith("--")): True}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return null;
 *  */
    @Test
    public void testCreateNumber_ThrowNumberFormatException_2() {
        String string = "--";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createNumber] produces [java.lang.NumberFormatException: -- is not a valid number.]
            org.apache.commons.lang3.math.NumberUtils.createNumber(NumberUtils.java:770) */
        NumberUtils.createNumber(string);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createNumber(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
     */
    @Test
    public void testCreateNumberThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createNumber] produces [java.lang.NumberFormatException:  is not a valid number.]
            org.apache.commons.lang3.math.NumberUtils.createNumber(NumberUtils.java:770) */
        NumberUtils.createNumber("\u0084");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
     */
    @Test
    public void testCreateNumberThrowsNFEWithNonEmptyString1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createNumber] produces [java.lang.NumberFormatException: For input string: "-" under radix 16]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:658)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang3.math.NumberUtils.createInteger(NumberUtils.java:916)
            org.apache.commons.lang3.math.NumberUtils.createNumber(NumberUtils.java:683) */
        NumberUtils.createNumber("-0x");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
     */
    @Test
    public void testCreateNumberThrowsNFEWithNonEmptyString2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createNumber] produces [java.lang.NumberFormatException:  is not a valid number.]
            org.apache.commons.lang3.math.NumberUtils.createNumber(NumberUtils.java:770) */
        NumberUtils.createNumber("\u0084");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
     */
    @Test
    public void testCreateNumberThrowsNFEWithNonEmptyString3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createNumber] produces [java.lang.NumberFormatException:  is not a valid number.]
            org.apache.commons.lang3.math.NumberUtils.createNumber(NumberUtils.java:770) */
        NumberUtils.createNumber("\u0084");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createNumber(java.lang.String)}
     */
    @Test
    public void testCreateNumberThrowsNFEWithNonEmptyString4() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createNumber] produces [java.lang.NumberFormatException:  is not a valid number.]
            org.apache.commons.lang3.math.NumberUtils.createNumber(NumberUtils.java:770) */
        NumberUtils.createNumber("\u0084");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.createBigDecimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (StringUtils.isBlank(str)): False}
 * @utbot.invokes {@link org.apache.commons.lang3.StringUtils#isBlank(java.lang.CharSequence)}
 * @utbot.returnsFrom {@code return new BigDecimal(str);}
 *  */
    @Test
    public void testCreateBigDecimal_NotStringUtilsIsBlank() {
        String string = "1";
        
        BigDecimal actual = NumberUtils.createBigDecimal(string);
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateBigDecimal_StrEqualsNull() {
        BigDecimal actual = NumberUtils.createBigDecimal(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isBlank(str)): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: StringUtils.isBlank(str)
 *  */
    @Test
    public void testCreateBigDecimal_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: A blank string is not a valid number]
            org.apache.commons.lang3.math.NumberUtils.createBigDecimal(NumberUtils.java:988) */
        NumberUtils.createBigDecimal(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isBlank(str)): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: StringUtils.isBlank(str)
 *  */
    @Test
    public void testCreateBigDecimal_ThrowNumberFormatException_1() {
        String string = "\n";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: A blank string is not a valid number]
            org.apache.commons.lang3.math.NumberUtils.createBigDecimal(NumberUtils.java:988) */
        NumberUtils.createBigDecimal(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isBlank(str)): False}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(str);
 *  */
    @Test
    public void testCreateBigDecimal_ThrowNumberFormatException_2() {
        String string = "+";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang3.math.NumberUtils.createBigDecimal(NumberUtils.java:990) */
        NumberUtils.createBigDecimal(string);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createBigDecimal(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
     */
    @Test
    public void testCreateBigDecimalWithNonEmptyString() {
        BigDecimal actual = NumberUtils.createBigDecimal("-3");
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createBigDecimal(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
     */
    @Test
    public void testCreateBigDecimalThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character X is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang3.math.NumberUtils.createBigDecimal(NumberUtils.java:990) */
        NumberUtils.createBigDecimal("XZb");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
     */
    @Test
    public void testCreateBigDecimalThrowsNFEWithNonEmptyString1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character a is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang3.math.NumberUtils.createBigDecimal(NumberUtils.java:990) */
        NumberUtils.createBigDecimal("abc");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
     */
    @Test
    public void testCreateBigDecimalThrowsNFEWithNonEmptyString2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character X is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang3.math.NumberUtils.createBigDecimal(NumberUtils.java:990) */
        NumberUtils.createBigDecimal("XZb");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createBigDecimal(java.lang.String)}
     */
    @Test
    public void testCreateBigDecimalThrowsNFEWithNonEmptyString3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character Z is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang3.math.NumberUtils.createBigDecimal(NumberUtils.java:990) */
        NumberUtils.createBigDecimal("ZX");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.isDigits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDigits(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsDigits_StringUtilsIsEmpty() {
        boolean actual = NumberUtils.isDigits(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsDigits_StringUtilsIsEmpty_1() {
        String string = "";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < str.length(); i++)} once
 *  */
    @Test
    public void testIsDigits_NotCharacterIsDigit() {
        String string = "/";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < str.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsDigits_CharacterIsDigit() {
        String string = "2";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isDigits(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
     */
    @Test
    public void testIsDigitsReturnsFalseWithNonEmptyString() {
        boolean actual = NumberUtils.isDigits("\u0014\n\t\r");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
     */
    @Test
    public void testIsDigitsReturnsFalseWithEmptyString() {
        boolean actual = NumberUtils.isDigits("");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
     */
    @Test
    public void testIsDigitsReturnsFalseWithNonEmptyString1() {
        boolean actual = NumberUtils.isDigits("\r\t\u0014\n");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
     */
    @Test
    public void testIsDigitsReturnsFalseWithNonEmptyString2() {
        boolean actual = NumberUtils.isDigits("\u0014\r\t\n");
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#isDigits(java.lang.String)}
     */
    @Test
    public void testIsDigitsReturnsFalseWithNonEmptyString3() {
        boolean actual = NumberUtils.isDigits("\u008A");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.math.NumberUtils.createDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateDouble_StrEqualsNull() {
        Double actual = NumberUtils.createDouble(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Double.valueOf(str);
 *  */
    @Test
    public void testCreateDouble_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Double.valueOf(str);
 *  */
    @Test
    public void testCreateDouble_ThrowNumberFormatException_1() {
        String string = " ";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateDouble_ThrowNumberFormatException_2() {
        String string = "-";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Double.valueOf(str);
 *  */
    @Test
    public void testCreateDouble_ThrowNumberFormatException_3() {
        String string = "-.";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: "-."]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble(string);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createDouble(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
     */
    @Test
    public void testCreateDoubleThrowsNFEWithNonEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble("\u0014\n\t\r");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
     */
    @Test
    public void testCreateDoubleThrowsNFEWithEmptyString() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble("");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
     */
    @Test
    public void testCreateDoubleThrowsNFEWithNonEmptyString1() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble("\r\t\u0014\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
     */
    @Test
    public void testCreateDoubleThrowsNFEWithNonEmptyString2() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble("\u0014\r\t\n");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.math.NumberUtils#createDouble(java.lang.String)}
     */
    @Test
    public void testCreateDoubleThrowsNFEWithNonEmptyString3() {
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble("\u008A");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createDouble(java.lang.String)
    
    @Test
    public void testCreateDouble1() {
        String string = "\u00010\u0001";
        
        Double actual = NumberUtils.createDouble(string);
        
        Double expected = 0.0;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testCreateDouble2() {
        String string = "0";
        
        Double actual = NumberUtils.createDouble(string);
        
        Double expected = 0.0;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testCreateDouble3() {
        String string = "-.0";
        
        Double actual = NumberUtils.createDouble(string);
        
        Double expected = -0.0;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createDouble(java.lang.String)
    
    @Test
    public void testCreateDouble4() {
        String string = "\u0001.\u0001";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: "."]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble(string);
    }
    
    @Test
    public void testCreateDouble5() {
        String string = "0x\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: "0x                            !"]
            java.base/jdk.internal.math.FloatingDecimal.parseHexString(FloatingDecimal.java:2082)
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1870)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble(string);
    }
    
    @Test
    public void testCreateDouble6() {
        String string = "\u0001\u0001\u0001";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble(string);
    }
    
    @Test
    public void testCreateDouble7() {
        String string = "+.";
        
        /* This test fails because method [org.apache.commons.lang3.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: "+."]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang3.math.NumberUtils.createDouble(NumberUtils.java:897) */
        NumberUtils.createDouble(string);
    }
    ///endregion
    
    ///endregion
}

