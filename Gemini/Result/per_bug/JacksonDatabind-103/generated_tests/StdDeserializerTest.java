import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class StdDeserializerTest {

    // Concrete subclass of abstract StdDeserializer for testing protected methods
    private static class DummyStdDeserializer extends com.fasterxml.jackson.databind.deser.std.StdDeserializer<Object> {
        public DummyStdDeserializer(Class<?> vc) {
            super(vc);
        }

        public DummyStdDeserializer(JavaType valueType) {
            super(valueType);
        }

        public DummyStdDeserializer(StdDeserializer<?> src) {
            super(src);
        }

        // Exposing protected helper methods for testing
        public boolean exposeIsIntNumber(String text) {
            return _isIntNumber(text);
        }

        public boolean exposeIsNegInf(String text) {
            return _isNegInf(text);
        }

        public boolean exposeIsPosInf(String text) {
            return _isPosInf(text);
        }

        public boolean exposeIsNaN(String text) {
            return _isNaN(text);
        }

        public boolean exposeByteOverflow(int value) {
            return _byteOverflow(value);
        }

        public boolean exposeShortOverflow(int value) {
            return _shortOverflow(value);
        }

        public boolean exposeIntOverflow(long value) {
            return _intOverflow(value);
        }

        public boolean exposeIsEmptyOrTextualNull(String text) {
            return _isEmptyOrTextualNull(text);
        }

        public boolean exposeNeitherNull(Object a, Object b) {
            return _neitherNull(a, b);
        }

        public Number exposeNonNullNumber(Number n) {
            return _nonNullNumber(n);
        }
    }

    @Test
    public void testConstructors() {
        DummyStdDeserializer deser1 = new DummyStdDeserializer(String.class);
        assertEquals(String.class, deser1.handledType());

        JavaType type = TypeFactory.defaultInstance().constructType(Integer.class);
        DummyStdDeserializer deser2 = new DummyStdDeserializer(type);
        assertEquals(Integer.class, deser2.handledType());

        DummyStdDeserializer deserNullType = new DummyStdDeserializer((JavaType) null);
        assertEquals(Object.class, deserNullType.handledType());

        DummyStdDeserializer deser3 = new DummyStdDeserializer(deser1);
        assertEquals(String.class, deser3.handledType());
    }

    @Test
    public void testIsIntNumber() {
        DummyStdDeserializer deser = new DummyStdDeserializer(Object.class);

        // Edge case: empty string
        assertFalse(deser.exposeIsIntNumber(""));

        // Valid integers (positive, negative, zero, with sign)
        assertTrue(deser.exposeIsIntNumber("12345"));
        assertTrue(deser.exposeIsIntNumber("-12345"));
        assertTrue(deser.exposeIsIntNumber("+12345"));
        assertTrue(deser.exposeIsIntNumber("0"));

        // Invalid integers (non-digit characters, decimals)
        assertFalse(deser.exposeIsIntNumber("123a5"));
        assertFalse(deser.exposeIsIntNumber("123.45"));
        assertFalse(deser.exposeIsIntNumber("-"));
        assertFalse(deser.exposeIsIntNumber("+"));
    }

    @Test
    public void testSpecialFloatStrings() {
        DummyStdDeserializer deser = new DummyStdDeserializer(Object.class);

        // Negative Infinity
        assertTrue(deser.exposeIsNegInf("-Infinity"));
        assertTrue(deser.exposeIsNegInf("-INF"));
        assertFalse(deser.exposeIsNegInf("Infinity"));
        assertFalse(deser.exposeIsNegInf("random"));

        // Positive Infinity
        assertTrue(deser.exposeIsPosInf("Infinity"));
        assertTrue(deser.exposeIsPosInf("INF"));
        assertFalse(deser.exposeIsPosInf("-Infinity"));
        assertFalse(deser.exposeIsPosInf("random"));

        // NaN
        assertTrue(deser.exposeIsNaN("NaN"));
        assertFalse(deser.exposeIsNaN("Infinity"));
    }

    @Test
    public void testOverflowChecks() {
        DummyStdDeserializer deser = new DummyStdDeserializer(Object.class);

        // Byte overflow (Valid: Byte.MIN_VALUE to 255)
        assertFalse(deser.exposeByteOverflow(128)); // Unsigned valid up to 255
        assertTrue(deser.exposeByteOverflow(256));
        assertTrue(deser.exposeByteOverflow(-129));
        assertFalse(deser.exposeByteOverflow(0));

        // Short overflow
        assertTrue(deser.exposeShortOverflow(Short.MIN_VALUE - 1));
        assertTrue(deser.exposeShortOverflow(Short.MAX_VALUE + 1));
        assertFalse(deser.exposeShortOverflow(0));

        // Int overflow
        assertTrue(deser.exposeIntOverflow((long) Integer.MIN_VALUE - 1L));
        assertTrue(deser.exposeIntOverflow((long) Integer.MAX_VALUE + 1L));
        assertFalse(deser.exposeIntOverflow(0L));
    }

    @Test
    public void testIsEmptyOrTextualNull() {
        DummyStdDeserializer deser = new DummyStdDeserializer(Object.class);

        assertTrue(deser.exposeIsEmptyOrTextualNull(""));
        assertTrue(deser.exposeIsEmptyOrTextualNull("null"));
        assertFalse(deser.exposeIsEmptyOrTextualNull("hello"));
    }

    @Test
    public void testNeitherNull() {
        DummyStdDeserializer deser = new DummyStdDeserializer(Object.class);

        assertTrue(deser.exposeNeitherNull(new Object(), new Object()));
        assertFalse(deser.exposeNeitherNull(null, new Object()));
        assertFalse(deser.exposeNeitherNull(new Object(), null));
        assertFalse(deser.exposeNeitherNull(null, null));
    }

    @Test
    public void testNonNullNumber() {
        DummyStdDeserializer deser = new DummyStdDeserializer(Object.class);

        assertEquals(Integer.valueOf(5), deser.exposeNonNullNumber(5));
        assertEquals(Integer.valueOf(0), deser.exposeNonNullNumber(null));
    }

    @Test
    public void testParseDoubleNastySmallDouble() throws Exception {
        // Test static parseDouble method via reflection to ensure coverage of nasty small double branch
        Method method = com.fasterxml.jackson.databind.deser.std.StdDeserializer.class
                getDeclaredMethod("parseDouble", String.class);
        method.setAccessible(true);

        double resultNasty = (double) method.invoke(null, "1e-309"); // maps to NASTY_SMALL_DOUBLE
        assertEquals(Double.MIN_NORMAL, resultNasty, 0.0);

        double resultNormal = (double) method.invoke(null, "123.45");
        assertEquals(123.45, resultNormal, 0.0);
    }
}