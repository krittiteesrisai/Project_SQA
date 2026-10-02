package org.apache.commons.codec.language;

import org.junit.Test;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.net.URLCodec;
import org.apache.commons.codec.net.QCodec;
import org.apache.commons.codec.net.QuotedPrintableCodec;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_codec_language_SoundexUtilsTest {
    ///region Test suites for executable org.apache.commons.codec.language.SoundexUtils.clean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clean(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SoundexUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#clean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.executesCondition {@code (str.length() == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testClean_StrLengthEqualsZero() {
        String string = "";
        
        String actual = SoundexUtils.clean(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SoundexUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#clean(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testClean_StrEqualsNull() {
        String actual = SoundexUtils.clean(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method clean(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#clean(java.lang.String)}
     */
    @Test
    public void testCleanWithNonEmptyString() {
        String actual = SoundexUtils.clean("(-3e");
        
        String expected = "E";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#clean(java.lang.String)}
     */
    @Test
    public void testCleanWithNonEmptyString1() {
        String actual = SoundexUtils.clean("e3-(");
        
        String expected = "E";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.SoundexUtils.difference
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method difference(org.apache.commons.codec.StringEncoder, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SoundexUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.codec.StringEncoder#encode(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return differenceEncoded(encoder.encode(s1), encoder.encode(s2));
 *  */
    @Test
    public void testDifference_ThrowNullPointerException() throws EncoderException  {
        /* This test fails because method [org.apache.commons.codec.language.SoundexUtils.difference] produces [java.lang.NullPointerException]
            org.apache.commons.codec.language.SoundexUtils.difference(SoundexUtils.java:85) */
        SoundexUtils.difference(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method difference(org.apache.commons.codec.StringEncoder, java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsOneWithNonEmptyStrings() throws EncoderException  {
        URLCodec uRLCodec = new URLCodec();
        
        int actual = SoundexUtils.difference(uRLCodec, "btca", "bcl");
        
        assertEquals(1, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsZeroWithNonEmptyStrings() throws EncoderException  {
        URLCodec uRLCodec = new URLCodec();
        
        int actual = SoundexUtils.difference(uRLCodec, "abtc", "?bc");
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturns10WithNonEmptyStrings() throws EncoderException  {
        QCodec qCodec = new QCodec();
        
        int actual = SoundexUtils.difference(qCodec, "ZX", "#$\\\"'");
        
        assertEquals(10, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsZeroWithNonEmptyStringAndEmptyString() throws EncoderException  {
        Metaphone metaphone = new Metaphone();
        metaphone.setMaxCodeLen(0);
        
        int actual = SoundexUtils.difference(metaphone, "XZ", "");
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsZeroWithNonEmptyStrings1() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(1);
        
        int actual = SoundexUtils.difference(doubleMetaphone, "X", "-3");
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsZeroWithEmptyStringAndNonEmptyString() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        doubleMetaphone.setMaxCodeLen(0);
        
        int actual = SoundexUtils.difference(doubleMetaphone, "", "ZX");
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsZeroWithNonEmptyString() throws EncoderException  {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        
        int actual = SoundexUtils.difference(refinedSoundex, "X4Z", null);
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsZeroWithNonEmptyString1() throws EncoderException  {
        RefinedSoundex refinedSoundex = new RefinedSoundex();
        
        int actual = SoundexUtils.difference(refinedSoundex, "\u0010X4Z", null);
        
        assertEquals(0, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceReturnsZeroWithBlankString() throws EncoderException  {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(-1);
        
        int actual = SoundexUtils.difference(soundex, null, "\n\t");
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method difference(org.apache.commons.codec.StringEncoder, java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test(expected = EncoderException.class)
    public void testDifferenceThrowsEEWithEmptyStringAndNonEmptyString() throws EncoderException  {
        QuotedPrintableCodec quotedPrintableCodec = new QuotedPrintableCodec("");
        
        SoundexUtils.difference(quotedPrintableCodec, "", "abc");
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#difference(org.apache.commons.codec.StringEncoder,java.lang.String,java.lang.String)}
     */
    @Test(expected = EncoderException.class)
    public void testDifferenceThrowsEEWithNonEmptyStrings() throws EncoderException  {
        URLCodec uRLCodec = new URLCodec("abc");
        
        SoundexUtils.difference(uRLCodec, "B", "abc");
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method difference(org.apache.commons.codec.StringEncoder, java.lang.String, java.lang.String)
    
    @Test
    public void testDifference1() throws EncoderException  {
        Caverphone caverphone = new Caverphone();
        String string = "[KP";
        
        int actual = SoundexUtils.difference(caverphone, string, null);
        
        assertEquals(8, actual);
    }
    
    @Test
    public void testDifference2() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        int actual = SoundexUtils.difference(doubleMetaphone, string, string);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testDifference3() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001";
        
        int actual = SoundexUtils.difference(doubleMetaphone, string, null);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testDifference4() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String string = "\u0001\u0001";
        
        int actual = SoundexUtils.difference(doubleMetaphone, string, null);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testDifference5() throws EncoderException  {
        Caverphone caverphone = new Caverphone();
        String string = "\u0000K";
        
        int actual = SoundexUtils.difference(caverphone, null, string);
        
        assertEquals(9, actual);
    }
    
    @Test
    public void testDifference6() throws EncoderException  {
        Caverphone caverphone = new Caverphone();
        String string = "";
        
        int actual = SoundexUtils.difference(caverphone, null, string);
        
        assertEquals(10, actual);
    }
    
    @Test
    public void testDifference7() throws EncoderException  {
        Caverphone caverphone = new Caverphone();
        String string = "";
        
        int actual = SoundexUtils.difference(caverphone, string, null);
        
        assertEquals(10, actual);
    }
    
    @Test
    public void testDifference8() throws EncoderException  {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        
        int actual = SoundexUtils.difference(doubleMetaphone, null, null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.SoundexUtils.differenceEncoded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method differenceEncoded(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link SoundexUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#differenceEncoded(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (es1 == null): False}
 * @utbot.executesCondition {@code (es2 == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lengthToMatch; i++)} once
 * @utbot.returnsFrom {@code return diff;}
 *  */
    @Test
    public void testDifferenceEncoded_Es1CharAtNotEqualsEs2CharAt() {
        String string = "!@";
        String string1 = " ";
        
        int actual = SoundexUtils.differenceEncoded(string, string1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SoundexUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#differenceEncoded(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (es1 == null): False}
 * @utbot.executesCondition {@code (es2 == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lengthToMatch; i++)} once
 * @utbot.returnsFrom {@code return diff;}
 *  */
    @Test
    public void testDifferenceEncoded_Es1CharAtEqualsEs2CharAt() {
        String string = " ";
        
        int actual = SoundexUtils.differenceEncoded(string, string);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SoundexUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#differenceEncoded(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (es1 == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testDifferenceEncoded_Es1EqualsNull() {
        int actual = SoundexUtils.differenceEncoded(null, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SoundexUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#differenceEncoded(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (es1 == null): False}
 * @utbot.executesCondition {@code (es2 == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testDifferenceEncoded_Es2EqualsNull() {
        String string = "";
        
        int actual = SoundexUtils.differenceEncoded(string, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SoundexUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#differenceEncoded(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (es1 == null): False}
 * @utbot.executesCondition {@code (es2 == null): False}
 * @utbot.returnsFrom {@code return diff;}
 *  */
    @Test
    public void testDifferenceEncoded_Es2NotEqualsNull() {
        String string = "";
        
        int actual = SoundexUtils.differenceEncoded(string, string);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method differenceEncoded(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#differenceEncoded(java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceEncodedReturns3WithNonEmptyStrings() {
        int actual = SoundexUtils.differenceEncoded("#$\\\"'?", "$#\\\"'");
        
        assertEquals(3, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.SoundexUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.SoundexUtils#differenceEncoded(java.lang.String,java.lang.String)}
     */
    @Test
    public void testDifferenceEncodedReturnsOneWithNonEmptyStrings() {
        int actual = SoundexUtils.differenceEncoded("#$\\\"'?", "#\\\"'");
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
}

