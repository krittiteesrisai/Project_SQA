package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaverphoneTest {

    private Caverphone caverphone;

    @Before
    public void setUp() {
        caverphone = new Caverphone();
    }

    @Test
    public void testCaverphoneNullAndEmpty() {
        assertEquals("1111111111", caverphone.caverphone(null));
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testCaverphoneSpecialPrefixes() {
        // Test various start options: cough, rough, tough, enough, trough, gn, mb
        assertNotNull(caverphone.caverphone("cough"));
        assertNotNull(caverphone.caverphone("rough"));
        assertNotNull(caverphone.caverphone("tough"));
        assertNotNull(caverphone.caverphone("enough"));
        assertNotNull(caverphone.caverphone("trough"));
        assertNotNull(caverphone.caverphone("gnat"));
        assertNotNull(caverphone.caverphone("mbira"));
    }

    @Test
    public void testCaverphoneReplacementsAndEndings() {
        // Test characters cleaning, vowels, 'e$' final removal, and trailing w/r/l rules
        String result1 = caverphone.caverphone("Apple!");
        assertNotNull(result1);
        assertEquals(10, result1.length());

        String result2 = caverphone.caverphone("StringWithE.");
        assertNotNull(result2);
        assertEquals(10, result2.length());

        // Test specific rules like cq, ci, ce, cy, tch, gh, sh, z, etc.
        String result3 = caverphone.caverphone("Action");
        assertNotNull(result3);
        
        String result4 = caverphone.caverphone("Queueing");
        assertNotNull(result4);
    }

    @Test
    public void testEncodeString() {
        String input = "Java";
        String expected = caverphone.caverphone(input);
        assertEquals(expected, caverphone.encode(input));
    }

    @Test
    public void testEncodeObjectValid() throws EncoderException {
        Object input = "TestObject";
        Object result = caverphone.encode(input);
        assertNotNull(result);
        assertTrue(result instanceof String);
        assertEquals(caverphone.caverphone((String) input), result);
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalidType() throws EncoderException {
        // Trigger the exception branch where pObject is not an instance of String
        caverphone.encode(Integer.valueOf(123));
    }

    @Test
    public void testIsCaverphoneEqual() {
        // Test identical caverphones
        assertTrue(caverphone.isCaverphoneEqual("Grid", "Grit"));
        
        // Test different caverphones
        assertFalse(caverphone.isCaverphoneEqual("Grid", "Apple"));
    }
}