package org.apache.commons.codec.language;

import org.junit.Test;
import org.apache.commons.codec.EncoderException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_codec_language_MetaphoneTest {
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(pObject instanceof java.lang.String)): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.Metaphone#metaphone(java.lang.String)}
 * @utbot.returnsFrom {@code return metaphone((String) pObject);}
 *  */
    @Test
    public void testEncode_PObjectNotInstanceOfJavaLangString() throws EncoderException  {
        Metaphone metaphone = new Metaphone();
        String string = "";
        
        String actual = ((String) metaphone.encode(((Object) string)));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(pObject instanceof java.lang.String)): True}
 * @utbot.throwsException {@link org.apache.commons.codec.EncoderException} when: !(pObject instanceof java.lang.String)
 *  */
    @Test(expected = EncoderException.class)
    public void testEncode_ThrowEncoderException() throws EncoderException  {
        Metaphone metaphone = new Metaphone();
        
        metaphone.encode(((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    @Test
    public void testEncode1() throws EncoderException  {
        Metaphone metaphone = new Metaphone();
        String string = "\u0000\u0000";
        
        String actual = ((String) metaphone.encode(((Object) string)));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEncode2() throws EncoderException  {
        Metaphone metaphone = new Metaphone();
        String string = "\u4000";
        
        String actual = ((String) metaphone.encode(((Object) string)));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#encode(java.lang.String)}
 * @utbot.returnsFrom {@code return metaphone(pString);}
 *  */
    @Test
    public void testEncode_ReturnMetaphone() {
        Metaphone metaphone = new Metaphone();
        
        String actual = metaphone.encode(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#encode(java.lang.String)}
 * @utbot.returnsFrom {@code return metaphone(pString);}
 *  */
    @Test
    public void testEncode_ReturnMetaphone_1() {
        Metaphone metaphone = new Metaphone();
        String string = "";
        
        String actual = metaphone.encode(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Metaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#encode(java.lang.String)}
     */
    @Test
    public void testEncodeWithNonEmptyString() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(1);
        
        String actual = metaphone.encode("-\uFFF43");
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    @Test
    public void testEncode3() {
        Metaphone metaphone = new Metaphone();
        String string = "\u0000\u0000";
        
        String actual = metaphone.encode(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEncode4() {
        Metaphone metaphone = new Metaphone();
        String string = "\u0000";
        
        String actual = metaphone.encode(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.metaphone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method metaphone(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#metaphone(java.lang.String)}
 * @utbot.executesCondition {@code (txt == null): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testMetaphone_TxtEqualsNull() {
        Metaphone metaphone = new Metaphone();
        
        String actual = metaphone.metaphone(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#metaphone(java.lang.String)}
 * @utbot.executesCondition {@code (txt == null): False}
 * @utbot.executesCondition {@code (txt.length() == 0): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testMetaphone_TxtLengthEqualsZero() {
        Metaphone metaphone = new Metaphone();
        String string = "";
        
        String actual = metaphone.metaphone(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#metaphone(java.lang.String)}
 * @utbot.executesCondition {@code (txt == null): False}
 * @utbot.executesCondition {@code (txt.length() == 0): False}
 * @utbot.executesCondition {@code (txt.length() == 1): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#toUpperCase()}
 * @utbot.returnsFrom {@code return txt.toUpperCase();}
 *  */
    @Test
    public void testMetaphone_TxtLengthEquals1() {
        Metaphone metaphone = new Metaphone();
        String string = "{";
        
        String actual = metaphone.metaphone(string);
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method metaphone(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Metaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#metaphone(java.lang.String)}
     */
    @Test
    public void testMetaphoneWithNonEmptyString() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(74);
        
        String actual = metaphone.metaphone("SHk");
        
        String expected = "XK";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method metaphone(java.lang.String)
    
    @Test
    public void testMetaphone1() {
        Metaphone metaphone = new Metaphone();
        String string = "\u0000\u0000";
        
        String actual = metaphone.metaphone(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.isLastChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLastChar(int, int)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isLastChar(int,int)}
 * @utbot.returnsFrom {@code return n + 1 == wdsz;}
 *  */
    @Test
    public void testIsLastChar_NPlus1NotEqualsWdsz() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class intType = int.class;
        Method isLastCharMethod = metaphoneClazz.getDeclaredMethod("isLastChar", intType, intType);
        isLastCharMethod.setAccessible(true);
        java.lang.Object[] isLastCharMethodArguments = new java.lang.Object[2];
        isLastCharMethodArguments[0] = -194;
        isLastCharMethodArguments[1] = -252;
        boolean actual = ((Boolean) isLastCharMethod.invoke(metaphone, isLastCharMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isLastChar(int,int)}
 * @utbot.returnsFrom {@code return n + 1 == wdsz;}
 *  */
    @Test
    public void testIsLastChar_NPlus1EqualsWdsz() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class intType = int.class;
        Method isLastCharMethod = metaphoneClazz.getDeclaredMethod("isLastChar", intType, intType);
        isLastCharMethod.setAccessible(true);
        java.lang.Object[] isLastCharMethodArguments = new java.lang.Object[2];
        isLastCharMethodArguments[0] = -254;
        isLastCharMethodArguments[1] = -255;
        boolean actual = ((Boolean) isLastCharMethod.invoke(metaphone, isLastCharMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.getMaxCodeLen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxCodeLen()
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#getMaxCodeLen()}
 * @utbot.returnsFrom {@code return this.maxCodeLen;}
 *  */
    @Test
    public void testGetMaxCodeLen_ReturnThisMaxCodeLen() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(-255);
        
        int actual = metaphone.getMaxCodeLen();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.isPreviousChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPreviousChar(java.lang.StringBuffer, int, char)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isPreviousChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testIsPreviousChar_IndexLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isPreviousCharMethod = metaphoneClazz.getDeclaredMethod("isPreviousChar", stringBufferType, intType, charType);
        isPreviousCharMethod.setAccessible(true);
        java.lang.Object[] isPreviousCharMethodArguments = new java.lang.Object[3];
        isPreviousCharMethodArguments[0] = ((Object) null);
        isPreviousCharMethodArguments[1] = 0;
        isPreviousCharMethodArguments[2] = ' ';
        boolean actual = ((Boolean) isPreviousCharMethod.invoke(metaphone, isPreviousCharMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isPreviousChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.executesCondition {@code (index < string.length()): False}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testIsPreviousChar_IndexGreaterOrEqualStringLength() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isPreviousCharMethod = metaphoneClazz.getDeclaredMethod("isPreviousChar", stringBufferType, intType, charType);
        isPreviousCharMethod.setAccessible(true);
        java.lang.Object[] isPreviousCharMethodArguments = new java.lang.Object[3];
        isPreviousCharMethodArguments[0] = stringBuffer;
        isPreviousCharMethodArguments[1] = 1;
        isPreviousCharMethodArguments[2] = ' ';
        boolean actual = ((Boolean) isPreviousCharMethod.invoke(metaphone, isPreviousCharMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isPreviousChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.executesCondition {@code (index < string.length()): True}
 * @utbot.executesCondition {@code (matches = string.charAt(index - 1) == c;): True}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testIsPreviousChar_IndexLessThanStringLength() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("  ");
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isPreviousCharMethod = metaphoneClazz.getDeclaredMethod("isPreviousChar", stringBufferType, intType, charType);
        isPreviousCharMethod.setAccessible(true);
        java.lang.Object[] isPreviousCharMethodArguments = new java.lang.Object[3];
        isPreviousCharMethodArguments[0] = stringBuffer;
        isPreviousCharMethodArguments[1] = 1;
        isPreviousCharMethodArguments[2] = ' ';
        boolean actual = ((Boolean) isPreviousCharMethod.invoke(metaphone, isPreviousCharMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isPreviousChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.executesCondition {@code (index < string.length()): True}
 * @utbot.executesCondition {@code (matches = string.charAt(index - 1) == c;): False}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testIsPreviousChar_IndexLessThanStringLength_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("  ");
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isPreviousCharMethod = metaphoneClazz.getDeclaredMethod("isPreviousChar", stringBufferType, intType, charType);
        isPreviousCharMethod.setAccessible(true);
        java.lang.Object[] isPreviousCharMethodArguments = new java.lang.Object[3];
        isPreviousCharMethodArguments[0] = stringBuffer;
        isPreviousCharMethodArguments[1] = 1;
        isPreviousCharMethodArguments[2] = '\"';
        boolean actual = ((Boolean) isPreviousCharMethod.invoke(metaphone, isPreviousCharMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPreviousChar(java.lang.StringBuffer, int, char)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isPreviousChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: index < string.length()
 *  */
    @Test
    public void testIsPreviousChar_ThrowNullPointerException() throws Throwable  {
        Metaphone metaphone = new Metaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.Metaphone.isPreviousChar] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.Metaphone.isPreviousChar(Metaphone.java:322) */
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isPreviousCharMethod = metaphoneClazz.getDeclaredMethod("isPreviousChar", stringBufferType, intType, charType);
        isPreviousCharMethod.setAccessible(true);
        java.lang.Object[] isPreviousCharMethodArguments = new java.lang.Object[3];
        isPreviousCharMethodArguments[0] = ((Object) null);
        isPreviousCharMethodArguments[1] = 1;
        isPreviousCharMethodArguments[2] = ' ';
        try {
            isPreviousCharMethod.invoke(metaphone, isPreviousCharMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.regionMatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method regionMatch(java.lang.StringBuffer, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#regionMatch(java.lang.StringBuffer,int,java.lang.String)}
 * @utbot.executesCondition {@code (index >= 0): False}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testRegionMatch_IndexLessThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method regionMatchMethod = metaphoneClazz.getDeclaredMethod("regionMatch", stringBufferType, intType, stringType);
        regionMatchMethod.setAccessible(true);
        java.lang.Object[] regionMatchMethodArguments = new java.lang.Object[3];
        regionMatchMethodArguments[0] = ((Object) null);
        regionMatchMethodArguments[1] = -1;
        regionMatchMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) regionMatchMethod.invoke(metaphone, regionMatchMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#regionMatch(java.lang.StringBuffer,int,java.lang.String)}
 * @utbot.executesCondition {@code (index >= 0): True}
 * @utbot.executesCondition {@code ((index + test.length() - 1) < string.length()): False}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testRegionMatch_IndexPlusTestLengthMinus1GreaterOrEqualStringLength() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer(" ");
        String string = "  ";
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method regionMatchMethod = metaphoneClazz.getDeclaredMethod("regionMatch", stringBufferType, intType, stringType);
        regionMatchMethod.setAccessible(true);
        java.lang.Object[] regionMatchMethodArguments = new java.lang.Object[3];
        regionMatchMethodArguments[0] = stringBuffer;
        regionMatchMethodArguments[1] = 0;
        regionMatchMethodArguments[2] = string;
        boolean actual = ((Boolean) regionMatchMethod.invoke(metaphone, regionMatchMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#regionMatch(java.lang.StringBuffer,int,java.lang.String)}
 * @utbot.executesCondition {@code (index >= 0): True}
 * @utbot.executesCondition {@code ((index + test.length() - 1) < string.length()): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.StringBuffer#substring(int,int)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testRegionMatch_IndexPlusTestLengthMinus1LessThanStringLength() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("");
        String string = "";
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method regionMatchMethod = metaphoneClazz.getDeclaredMethod("regionMatch", stringBufferType, intType, stringType);
        regionMatchMethod.setAccessible(true);
        java.lang.Object[] regionMatchMethodArguments = new java.lang.Object[3];
        regionMatchMethodArguments[0] = stringBuffer;
        regionMatchMethodArguments[1] = 0;
        regionMatchMethodArguments[2] = string;
        boolean actual = ((Boolean) regionMatchMethod.invoke(metaphone, regionMatchMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method regionMatch(java.lang.StringBuffer, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#regionMatch(java.lang.StringBuffer,int,java.lang.String)}
 * @utbot.executesCondition {@code ((index + test.length() - 1) < string.length()): True}
 * @utbot.invokes {@link java.lang.StringBuffer#length()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.StringBuffer#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String substring = string.substring(index, index + test.length());
 *  */
    @Test
    public void testRegionMatch_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("           ");
        String string = "                          ";
        
        /* This test fails because method [org.apache.commons.codec.language.Metaphone.regionMatch] produces [java.lang.StringIndexOutOfBoundsException: start 2147483635, end -2147483635, length 11]
            java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(AbstractStringBuilder.java:1810)
            java.base/java.lang.AbstractStringBuilder.substring(AbstractStringBuilder.java:1070)
            java.base/java.lang.StringBuffer.substring(StringBuffer.java:525)
            org.apache.commons.codec.language.Metaphone.regionMatch(Metaphone.java:341) */
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method regionMatchMethod = metaphoneClazz.getDeclaredMethod("regionMatch", stringBufferType, intType, stringType);
        regionMatchMethod.setAccessible(true);
        java.lang.Object[] regionMatchMethodArguments = new java.lang.Object[3];
        regionMatchMethodArguments[0] = stringBuffer;
        regionMatchMethodArguments[1] = 2147483635;
        regionMatchMethodArguments[2] = string;
        try {
            regionMatchMethod.invoke(metaphone, regionMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#regionMatch(java.lang.StringBuffer,int,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (index + test.length() - 1) < string.length()
 *  */
    @Test
    public void testRegionMatch_ThrowNullPointerException() throws Throwable  {
        Metaphone metaphone = new Metaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.Metaphone.regionMatch] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.Metaphone.regionMatch(Metaphone.java:340) */
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method regionMatchMethod = metaphoneClazz.getDeclaredMethod("regionMatch", stringBufferType, intType, stringType);
        regionMatchMethod.setAccessible(true);
        java.lang.Object[] regionMatchMethodArguments = new java.lang.Object[3];
        regionMatchMethodArguments[0] = ((Object) null);
        regionMatchMethodArguments[1] = 0;
        regionMatchMethodArguments[2] = ((Object) null);
        try {
            regionMatchMethod.invoke(metaphone, regionMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#regionMatch(java.lang.StringBuffer,int,java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (index + test.length() - 1) < string.length()
 *  */
    @Test
    public void testRegionMatch_ThrowNullPointerException_1() throws Throwable  {
        Metaphone metaphone = new Metaphone();
        String string = " ";
        
        /* This test fails because method [org.apache.commons.codec.language.Metaphone.regionMatch] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.Metaphone.regionMatch(Metaphone.java:340) */
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method regionMatchMethod = metaphoneClazz.getDeclaredMethod("regionMatch", stringBufferType, intType, stringType);
        regionMatchMethod.setAccessible(true);
        java.lang.Object[] regionMatchMethodArguments = new java.lang.Object[3];
        regionMatchMethodArguments[0] = ((Object) null);
        regionMatchMethodArguments[1] = 0;
        regionMatchMethodArguments[2] = string;
        try {
            regionMatchMethod.invoke(metaphone, regionMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.isVowel
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVowel(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isVowel(java.lang.StringBuffer,int)}
 * @utbot.returnsFrom {@code return VOWELS.indexOf(string.charAt(index)) >= 0;}
 *  */
    @Test
    public void testIsVowel_VOWELSIndexOfGreaterOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("A");
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method isVowelMethod = metaphoneClazz.getDeclaredMethod("isVowel", stringBufferType, intType);
        isVowelMethod.setAccessible(true);
        java.lang.Object[] isVowelMethodArguments = new java.lang.Object[2];
        isVowelMethodArguments[0] = stringBuffer;
        isVowelMethodArguments[1] = 0;
        boolean actual = ((Boolean) isVowelMethod.invoke(metaphone, isVowelMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isVowel(java.lang.StringBuffer,int)}
 * @utbot.returnsFrom {@code return VOWELS.indexOf(string.charAt(index)) >= 0;}
 *  */
    @Test
    public void testIsVowel_VOWELSIndexOfLessThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("\u8000 ");
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method isVowelMethod = metaphoneClazz.getDeclaredMethod("isVowel", stringBufferType, intType);
        isVowelMethod.setAccessible(true);
        java.lang.Object[] isVowelMethodArguments = new java.lang.Object[2];
        isVowelMethodArguments[0] = stringBuffer;
        isVowelMethodArguments[1] = 1;
        boolean actual = ((Boolean) isVowelMethod.invoke(metaphone, isVowelMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isVowel(java.lang.StringBuffer, int)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isVowel(java.lang.StringBuffer,int)}
 * @utbot.invokes {@link java.lang.StringBuffer#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return VOWELS.indexOf(string.charAt(index)) >= 0;
 *  */
    @Test
    public void testIsVowel_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("");
        
        /* This test fails because method [org.apache.commons.codec.language.Metaphone.isVowel] produces [java.lang.StringIndexOutOfBoundsException: index 0, length 0]
            java.base/java.lang.String.checkIndex(String.java:4567)
            java.base/java.lang.AbstractStringBuilder.charAt(AbstractStringBuilder.java:351)
            java.base/java.lang.StringBuffer.charAt(StringBuffer.java:243)
            org.apache.commons.codec.language.Metaphone.isVowel(Metaphone.java:316) */
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method isVowelMethod = metaphoneClazz.getDeclaredMethod("isVowel", stringBufferType, intType);
        isVowelMethod.setAccessible(true);
        java.lang.Object[] isVowelMethodArguments = new java.lang.Object[2];
        isVowelMethodArguments[0] = stringBuffer;
        isVowelMethodArguments[1] = 0;
        try {
            isVowelMethod.invoke(metaphone, isVowelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isVowel(java.lang.StringBuffer,int)}
 * @utbot.invokes {@link java.lang.StringBuffer#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return VOWELS.indexOf(string.charAt(index)) >= 0;
 *  */
    @Test
    public void testIsVowel_ThrowNullPointerException() throws Throwable  {
        Metaphone metaphone = new Metaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.Metaphone.isVowel] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.Metaphone.isVowel(Metaphone.java:316) */
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Method isVowelMethod = metaphoneClazz.getDeclaredMethod("isVowel", stringBufferType, intType);
        isVowelMethod.setAccessible(true);
        java.lang.Object[] isVowelMethodArguments = new java.lang.Object[2];
        isVowelMethodArguments[0] = ((Object) null);
        isVowelMethodArguments[1] = -255;
        try {
            isVowelMethod.invoke(metaphone, isVowelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.setMaxCodeLen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxCodeLen(int)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#setMaxCodeLen(int)}
 * @utbot.returnsFrom {@code /**
 *  * Sets the maxCodeLen.
 *  * @param maxCodeLen The maxCodeLen to set
 *  */
 * public void setMaxCodeLen(int maxCodeLen) {
 *     this.maxCodeLen = maxCodeLen;
 * }}
 *  */
    @Test
    public void testSetMaxCodeLen_Return() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(-255);
        
        metaphone.setMaxCodeLen(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.isMetaphoneEqual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isMetaphoneEqual(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isMetaphoneEqual(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.Metaphone#metaphone(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.language.Metaphone#metaphone(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return metaphone(str1).equals(metaphone(str2));}
 *  */
    @Test
    public void testIsMetaphoneEqual_StringEquals() {
        Metaphone metaphone = new Metaphone();
        
        boolean actual = metaphone.isMetaphoneEqual(null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isMetaphoneEqual(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Metaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isMetaphoneEqual(java.lang.String,java.lang.String)}
     */
    @Test
    public void testIsMetaphoneEqualReturnsTrueWithNonEmptyStrings() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(1);
        
        boolean actual = metaphone.isMetaphoneEqual("-3", "10");
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Metaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isMetaphoneEqual(java.lang.String,java.lang.String)}
     */
    @Test
    public void testIsMetaphoneEqualReturnsTrueWithNonEmptyStrings1() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(-2147483647);
        
        boolean actual = metaphone.isMetaphoneEqual("bc", "XZ");
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Metaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isMetaphoneEqual(java.lang.String,java.lang.String)}
     */
    @Test
    public void testIsMetaphoneEqualReturnsTrueWithNonEmptyStrings2() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(-2147483647);
        
        boolean actual = metaphone.isMetaphoneEqual("abc", "XZ");
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Metaphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isMetaphoneEqual(java.lang.String,java.lang.String)}
     */
    @Test
    public void testIsMetaphoneEqualReturnsTrueWithNonEmptyStringAndEmptyString() {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(0);
        
        boolean actual = metaphone.isMetaphoneEqual("XZ", "");
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isMetaphoneEqual(java.lang.String, java.lang.String)
    
    @Test
    public void testIsMetaphoneEqual1() {
        Metaphone metaphone = new Metaphone();
        String string = "\u0000\u0000";
        
        boolean actual = metaphone.isMetaphoneEqual(string, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsMetaphoneEqual2() {
        Metaphone metaphone = new Metaphone();
        String string = "\u4000";
        
        boolean actual = metaphone.isMetaphoneEqual(string, null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsMetaphoneEqual3() {
        Metaphone metaphone = new Metaphone();
        String string = "";
        
        boolean actual = metaphone.isMetaphoneEqual(string, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsMetaphoneEqual4() {
        Metaphone metaphone = new Metaphone();
        String string = "";
        String string1 = "";
        
        boolean actual = metaphone.isMetaphoneEqual(string, string1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsMetaphoneEqual5() {
        Metaphone metaphone = new Metaphone();
        String string = "\u0000";
        
        boolean actual = metaphone.isMetaphoneEqual(null, string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsMetaphoneEqual6() {
        Metaphone metaphone = new Metaphone();
        String string = "\u0000\u0000";
        
        boolean actual = metaphone.isMetaphoneEqual(null, string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsMetaphoneEqual7() {
        Metaphone metaphone = new Metaphone();
        String string = "";
        
        boolean actual = metaphone.isMetaphoneEqual(null, string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Metaphone.isNextChar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNextChar(java.lang.StringBuffer, int, char)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isNextChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index >= 0): True}
 * @utbot.executesCondition {@code (index < string.length() - 1): True}
 * @utbot.executesCondition {@code (matches = string.charAt(index + 1) == c;): False}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testIsNextChar_IndexLessThanStringLengthMinus1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("  ");
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isNextCharMethod = metaphoneClazz.getDeclaredMethod("isNextChar", stringBufferType, intType, charType);
        isNextCharMethod.setAccessible(true);
        java.lang.Object[] isNextCharMethodArguments = new java.lang.Object[3];
        isNextCharMethodArguments[0] = stringBuffer;
        isNextCharMethodArguments[1] = 0;
        isNextCharMethodArguments[2] = '!';
        boolean actual = ((Boolean) isNextCharMethod.invoke(metaphone, isNextCharMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isNextChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index >= 0): True}
 * @utbot.executesCondition {@code (index < string.length() - 1): False}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testIsNextChar_IndexGreaterOrEqualStringLengthMinus1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer(" ");
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isNextCharMethod = metaphoneClazz.getDeclaredMethod("isNextChar", stringBufferType, intType, charType);
        isNextCharMethod.setAccessible(true);
        java.lang.Object[] isNextCharMethodArguments = new java.lang.Object[3];
        isNextCharMethodArguments[0] = stringBuffer;
        isNextCharMethodArguments[1] = 0;
        isNextCharMethodArguments[2] = ' ';
        boolean actual = ((Boolean) isNextCharMethod.invoke(metaphone, isNextCharMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isNextChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index >= 0): False}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testIsNextChar_IndexLessThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isNextCharMethod = metaphoneClazz.getDeclaredMethod("isNextChar", stringBufferType, intType, charType);
        isNextCharMethod.setAccessible(true);
        java.lang.Object[] isNextCharMethodArguments = new java.lang.Object[3];
        isNextCharMethodArguments[0] = ((Object) null);
        isNextCharMethodArguments[1] = -1;
        isNextCharMethodArguments[2] = ' ';
        boolean actual = ((Boolean) isNextCharMethod.invoke(metaphone, isNextCharMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isNextChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index >= 0): True}
 * @utbot.executesCondition {@code (index < string.length() - 1): True}
 * @utbot.executesCondition {@code (matches = string.charAt(index + 1) == c;): True}
 * @utbot.returnsFrom {@code return matches;}
 *  */
    @Test
    public void testIsNextChar_IndexLessThanStringLengthMinus1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Metaphone metaphone = new Metaphone();
        StringBuffer stringBuffer = new StringBuffer("  ");
        
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isNextCharMethod = metaphoneClazz.getDeclaredMethod("isNextChar", stringBufferType, intType, charType);
        isNextCharMethod.setAccessible(true);
        java.lang.Object[] isNextCharMethodArguments = new java.lang.Object[3];
        isNextCharMethodArguments[0] = stringBuffer;
        isNextCharMethodArguments[1] = 0;
        isNextCharMethodArguments[2] = ' ';
        boolean actual = ((Boolean) isNextCharMethod.invoke(metaphone, isNextCharMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNextChar(java.lang.StringBuffer, int, char)
    
    /**
    @utbot.classUnderTest {@link Metaphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Metaphone#isNextChar(java.lang.StringBuffer,int,char)}
 * @utbot.executesCondition {@code (index >= 0): True}
 * @utbot.invokes {@link java.lang.StringBuffer#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: index < string.length() - 1
 *  */
    @Test
    public void testIsNextChar_ThrowNullPointerException() throws Throwable  {
        Metaphone metaphone = new Metaphone();
        
        /* This test fails because method [org.apache.commons.codec.language.Metaphone.isNextChar] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.Metaphone.isNextChar(Metaphone.java:331) */
        Class metaphoneClazz = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class stringBufferType = Class.forName("java.lang.StringBuffer");
        Class intType = int.class;
        Class charType = char.class;
        Method isNextCharMethod = metaphoneClazz.getDeclaredMethod("isNextChar", stringBufferType, intType, charType);
        isNextCharMethod.setAccessible(true);
        java.lang.Object[] isNextCharMethodArguments = new java.lang.Object[3];
        isNextCharMethodArguments[0] = ((Object) null);
        isNextCharMethodArguments[1] = 0;
        isNextCharMethodArguments[2] = ' ';
        try {
            isNextCharMethod.invoke(metaphone, isNextCharMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
}

