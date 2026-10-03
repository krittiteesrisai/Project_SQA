package org.apache.commons.codec.binary;

import static org.junit.Assert.*;
import org.junit.Test;

public class Base32Test {

    // --- Constructor & Validation Edge Cases ---

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_LineLengthPositive_NullSeparator() {
        // lineLength > 0 but lineSeparator is null -> throws IllegalArgumentException
        new Base32(8, null, false, (byte) '=');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_LineSeparatorContainsAlphabet() {
        // lineSeparator contains base32 character 'A' -> throws IllegalArgumentException
        new Base32(8, new byte[] { 'A' }, false, (byte) '=');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_PadInAlphabet() {
        // pad byte 'A' is part of alphabet -> throws IllegalArgumentException
        new Base32(0, null, false, (byte) 'A');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_PadIsWhitespace() {
        // pad byte is whitespace (' ') -> throws IllegalArgumentException
        new Base32(0, null, false, (byte) ' ');
    }

    @Test
    public void testConstructors_Variations() {
        // Test default, pad char, useHex constructors
        Base32 b1 = new Base32();
        Base32 b2 = new Base32((byte) '=');
        Base32 b3 = new Base32(true);
        Base32 b4 = new Base32(true, (byte) '=');
        Base32 b5 = new Base32(8);
        Base32 b6 = new Base32(8, new byte[] { '\n' }, true);
        assertNotNull(b1);
        assertNotNull(b2);
        assertNotNull(b3);
        assertNotNull(b4);
        assertNotNull(b5);
        assertNotNull(b6);
    }

    // --- Encoding & Decoding Boundary & Branch Coverage ---

    @Test
    public void testEncodeDecode_Basic() {
        Base32 codec = new Base32();
        byte[] input = "Hello World!".getBytes();
        byte[] encoded = codec.encode(input);
        byte[] decoded = codec.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncode_HexAlphabet() {
        Base32 codec = new Base32(true);
        byte[] input = "TestHex".getBytes();
        byte[] encoded = codec.encode(input);
        byte[] decoded = codec.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncode_WithChunking() {
        // lineLength > 0, tests chunk separation logic
        Base32 codec = new Base32(8, new byte[] { '\r', '\n' }, false);
        byte[] input = "Longer string to test chunk separators properly across multiple lines.".getBytes();
        byte[] encoded = codec.encode(input);
        byte[] decoded = codec.decode(encoded);
        assertArrayEquals(input, decoded);
    }

    @Test
    public void testEncode_ModulusCases_EOF() {
        // Trigger modulus switch cases 0, 1, 2, 3, 4 on encode EOF (inAvail < 0)
        Base32 codec = new Base32(0);
        
        // Modulus 1 (1 unencoded byte)
        byte[] out1 = codec.encode(new byte[] { 0x01 });
        assertTrue(out1.length > 0);

        // Modulus 2 (2 unencoded bytes)
        byte[] out2 = codec.encode(new byte[] { 0x01, 0x02 });
        assertTrue(out2.length > 0);

        // Modulus 3 (3 unencoded bytes)
        byte[] out3 = codec.encode(new byte[] { 0x01, 0x02, 0x03 });
        assertTrue(out3.length > 0);

        // Modulus 4 (4 unencoded bytes)
        byte[] out4 = codec.encode(new byte[] { 0x01, 0x02, 0x03, 0x04 });
        assertTrue(out4.length > 0);
    }

    @Test
    public void testDecode_ModulusCases_EOF() {
        // Trigger different decode modulus cases (2 through 7) at EOF
        Base32 codec = new Base32();

        // Modulus 2 encoded string ("MY======" -> 10 bits -> drops 2)
        byte[] dec2 = codec.decode("MY======".getBytes());
        assertNotNull(dec2);

        // Modulus 3 encoded string ("MZXQ====" -> 15 bits)
        byte[] dec3 = codec.decode("MZXQ====".getBytes());
        assertNotNull(dec3);

        // Modulus 4 encoded string ("MZXW6===" -> 20 bits)
        byte[] dec4 = codec.decode("MZXW6===".getBytes());
        assertNotNull(dec4);

        // Modulus 5 encoded string ("MZXW6YQ=" -> 25 bits)
        byte[] dec5 = codec.decode("MZXW6YQ=".getBytes());
        assertNotNull(dec5);

        // Modulus 6 encoded string ("MZXW6YTB" -> 30 bits)
        byte[] dec6 = codec.decode("MZXW6YTB".getBytes());
        assertNotNull(dec6);

        // Modulus 7 encoded string ("MZXW6YTBO" -> 35 bits)
        byte[] dec7 = codec.decode("MZXW6YTBO".getBytes());
        assertNotNull(dec7);
    }

    @Test
    public void testDecode_IgnoredCharactersAndPadding() {
        Base32 codec = new Base32();
        // Includes whitespace or invalid chars which should be ignored or handled
        byte[] decoded = codec.decode("MZ XW 6Y Q=\r\n".getBytes());
        assertNotNull(decoded);
    }

    @Test
    public void testIsInAlphabet() {
        Base32 codec = new Base32();
        assertTrue(codec.isInAlphabet((byte) 'A'));
        assertTrue(codec.isInAlphabet((byte) 'Z'));
        assertTrue(codec.isInAlphabet((byte) '2'));
        assertTrue(codec.isInAlphabet((byte) '7'));
        assertFalse(codec.isInAlphabet((byte) '1')); // Not in standard Base32
        assertFalse(codec.isInAlphabet((byte) -1));  // Out of bounds negative
        assertFalse(codec.isInAlphabet((byte) 127)); // Out of bounds positive
    }

    @Test
    public void testDecode_AlreadyEofContext() {
        Base32 codec = new Base32();
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = true;
        
        // Should return immediately due to context.eof == true
        codec.decode(new byte[] { 'A', 'B' }, 0, 2, context);
        assertTrue(context.eof);
    }

    @Test
    public void testEncode_AlreadyEofContext() {
        Base32 codec = new Base32();
        BaseNCodec.Context context = new BaseNCodec.Context();
        context.eof = true;
        
        // Should return immediately due to context.eof == true
        codec.encode(new byte[] { 'A', 'B' }, 0, 2, context);
        assertTrue(context.eof);
    }
}