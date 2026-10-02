package org.apache.commons.codec.language;

import org.junit.Test;
import org.apache.commons.codec.EncoderException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_codec_language_CaverphoneTest {
    ///region Test suites for executable org.apache.commons.codec.language.Caverphone.caverphone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method caverphone(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Caverphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Caverphone#caverphone(java.lang.String)}
 * @utbot.executesCondition {@code (txt == null): False}
 * @utbot.executesCondition {@code (txt.length() == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return "1111111111";}
 *  */
    @Test
    public void testCaverphone_TxtLengthEqualsZero() {
        Caverphone caverphone = new Caverphone();
        String string = "";
        
        String actual = caverphone.caverphone(string);
        
        String expected = "1111111111";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Caverphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Caverphone#caverphone(java.lang.String)}
 * @utbot.executesCondition {@code (txt == null): True}
 * @utbot.returnsFrom {@code return "1111111111";}
 *  */
    @Test
    public void testCaverphone_TxtEqualsNull() {
        Caverphone caverphone = new Caverphone();
        
        String actual = caverphone.caverphone(null);
        
        String expected = "1111111111";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method caverphone(java.lang.String)
    
    @Test
    public void testCaverphone1() {
        Caverphone caverphone = new Caverphone();
        String string = "K[K\u0000\u0000\u0000\u0000";
        
        String actual = caverphone.caverphone(string);
        
        String expected = "K111111111";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Caverphone.isCaverphoneEqual
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isCaverphoneEqual(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.codec.language.Caverphone}
     * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Caverphone#isCaverphoneEqual(java.lang.String,java.lang.String)}
     */
    @Test
    public void testIsCaverphoneEqualReturnsFalseWithNonEmptyString() {
        Caverphone caverphone = new Caverphone();
        
        boolean actual = caverphone.isCaverphoneEqual(null, "hXZ");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isCaverphoneEqual(java.lang.String, java.lang.String)
    
    @Test
    public void testIsCaverphoneEqual1() {
        Caverphone caverphone = new Caverphone();
        String string = "KK\u0000";
        
        boolean actual = caverphone.isCaverphoneEqual(string, string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsCaverphoneEqual2() {
        Caverphone caverphone = new Caverphone();
        String string = "";
        String string1 = "[\u8000";
        
        boolean actual = caverphone.isCaverphoneEqual(string, string1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsCaverphoneEqual3() {
        Caverphone caverphone = new Caverphone();
        String string = "";
        
        boolean actual = caverphone.isCaverphoneEqual(string, string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Caverphone.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Caverphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Caverphone#encode(java.lang.String)}
 * @utbot.returnsFrom {@code return caverphone(pString);}
 *  */
    @Test
    public void testEncode_ReturnCaverphone() {
        Caverphone caverphone = new Caverphone();
        String string = "";
        
        String actual = caverphone.encode(string);
        
        String expected = "1111111111";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Caverphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Caverphone#encode(java.lang.String)}
 * @utbot.returnsFrom {@code return caverphone(pString);}
 *  */
    @Test
    public void testEncode_ReturnCaverphone_1() {
        Caverphone caverphone = new Caverphone();
        
        String actual = caverphone.encode(((String) null));
        
        String expected = "1111111111";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode(java.lang.String)
    
    @Test
    public void testEncode1() {
        Caverphone caverphone = new Caverphone();
        String string = "K[\u0000";
        
        String actual = caverphone.encode(string);
        
        String expected = "K111111111";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.codec.language.Caverphone.encode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Caverphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Caverphone#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(pObject instanceof java.lang.String)): False}
 * @utbot.invokes {@link org.apache.commons.codec.language.Caverphone#caverphone(java.lang.String)}
 * @utbot.returnsFrom {@code return caverphone((String) pObject);}
 *  */
    @Test
    public void testEncode_PObjectNotInstanceOfJavaLangString() throws EncoderException  {
        Caverphone caverphone = new Caverphone();
        String string = "";
        
        String actual = ((String) caverphone.encode(((Object) string)));
        
        String expected = "1111111111";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method encode(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Caverphone}
 * @utbot.methodUnderTest {@link org.apache.commons.codec.language.Caverphone#encode(java.lang.Object)}
 * @utbot.executesCondition {@code (!(pObject instanceof java.lang.String)): True}
 * @utbot.throwsException {@link org.apache.commons.codec.EncoderException} when: !(pObject instanceof java.lang.String)
 *  */
    @Test(expected = EncoderException.class)
    public void testEncode_ThrowEncoderException() throws EncoderException  {
        Caverphone caverphone = new Caverphone();
        
        caverphone.encode(((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encode(java.lang.Object)
    
    @Test
    public void testEncode2() throws EncoderException  {
        Caverphone caverphone = new Caverphone();
        String string = "K\u0000\u0000";
        
        String actual = ((String) caverphone.encode(((Object) string)));
        
        String expected = "K111111111";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
}

