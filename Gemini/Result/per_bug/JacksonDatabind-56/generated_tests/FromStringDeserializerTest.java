package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class FromStringDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testTypesArray() {
        Class<?>[] types = FromStringDeserializer.types();
        assertNotNull(types);
        assertEquals(12, types.length);
    }

    @Test
    public void testFindDeserializerAllSupportedAndUnsupported() {
        assertNotNull(FromStringDeserializer.findDeserializer(File.class));
        assertNotNull(FromStringDeserializer.findDeserializer(URL.class));
        assertNotNull(FromStringDeserializer.findDeserializer(URI.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Class.class));
        assertNotNull(FromStringDeserializer.findDeserializer(com.fasterxml.jackson.databind.JavaType.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Currency.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Pattern.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Locale.class));
        assertNotNull(FromStringDeserializer.findDeserializer(Charset.class));
        assertNotNull(FromStringDeserializer.findDeserializer(TimeZone.class));
        assertNotNull(FromStringDeserializer.findDeserializer(InetAddress.class));
        assertNotNull(FromStringDeserializer.findDeserializer(InetSocketAddress.class));

        // Unsupported type
        assertNull(FromStringDeserializer.findDeserializer(Integer.class));
    }

    @Test
    public void testStdDeserializationKinds() throws Exception {
        // File
        FromStringDeserializer.Std fileDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(File.class);
        assertEquals(new File("test.txt"), fileDeser._deserialize("test.txt", mapper.getDeserializationContext()));

        // URL
        FromStringDeserializer.Std urlDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(URL.class);
        assertEquals(new URL("http://localhost"), urlDeser._deserialize("http://localhost", mapper.getDeserializationContext()));

        // URI
        FromStringDeserializer.Std uriDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(URI.class);
        assertEquals(URI.create("http://localhost"), uriDeser._deserialize("http://localhost", mapper.getDeserializationContext()));

        // Class (Valid)
        FromStringDeserializer.Std classDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(Class.class);
        assertEquals(String.class, classDeser._deserialize("java.lang.String", mapper.getDeserializationContext()));

        // JavaType
        FromStringDeserializer.Std javaTypeDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(com.fasterxml.jackson.databind.JavaType.class);
        assertNotNull(javaTypeDeser._deserialize("java.lang.String", mapper.getDeserializationContext()));

        // Currency
        FromStringDeserializer.Std currencyDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(Currency.class);
        assertEquals(Currency.getInstance("USD"), currencyDeser._deserialize("USD", currencyDeser));

        // Pattern
        FromStringDeserializer.Std patternDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(Pattern.class);
        assertNotNull(patternDeser._deserialize("abc", patternDeser));

        // Locale branches
        FromStringDeserializer.Std localeDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(Locale.class);
        assertEquals(new Locale("th"), localeDeser._deserialize("th", localeDeser));
        assertEquals(new Locale("th", "TH"), localeDeser._deserialize("th_TH", localeDeser));
        assertEquals(new Locale("th", "TH", "VARIANT"), localeDeser._deserialize("th_TH_VARIANT", localeDeser));

        // Charset
        FromStringDeserializer.Std charsetDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(Charset.class);
        assertEquals(Charset.forName("UTF-8"), charsetDeser._deserialize("UTF-8", charsetDeser));

        // TimeZone
        FromStringDeserializer.Std tzDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(TimeZone.class);
        assertEquals(TimeZone.getTimeZone("GMT"), tzDeser._deserialize("GMT", tzDeser));

        // InetAddress
        FromStringDeserializer.Std inetDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(InetAddress.class);
        assertNotNull(inetDeser._deserialize("127.0.0.1", inetDeser));

        // InetSocketAddress branches
        FromStringDeserializer.Std socketDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        // IPv6 with brackets and port
        InetSocketAddress addr1 = (InetSocketAddress) socketDeser._deserialize("[0:0:0:0:0:0:0:1]:8080", socketDeser);
        assertNotNull(addr1);
        // host:port
        InetSocketAddress addr2 = (InetSocketAddress) socketDeser._deserialize("localhost:8080", socketDeser);
        assertEquals(8080, addr2.getPort());
        // host only
        InetSocketAddress addr3 = (InetSocketAddress) socketDeser._deserialize("localhost", socketDeser);
        assertEquals(0, addr3.getPort());
    }

    @Test(expected = IOException.class)
    public void testClassInstantiationException() throws Exception {
        FromStringDeserializer.Std classDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(Class.class);
        classDeser._deserialize("non.existent.ClassNameXYZ", mapper.getDeserializationContext());
    }

    @Test(expected = InvalidFormatException.class)
    public void testInetSocketAddressMissingBracket() throws Exception {
        FromStringDeserializer.Std socketDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        socketDeser._deserialize("[invalid-ipv6", mapper.getDeserializationContext());
    }

    @Test
    public void testEmptyStringHandling() throws Exception {
        FromStringDeserializer.Std uriDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(URI.class);
        assertEquals(URI.create(""), uriDeser._deserializeFromEmptyString());

        FromStringDeserializer.Std localeDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(Locale.class);
        assertEquals(Locale.ROOT, localeDeser._deserializeFromEmptyString());

        FromStringDeserializer.Std fileDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(File.class);
        assertNull(fileDeser._deserializeFromEmptyString());
    }

    @Test
    public void testUnwrapSingleValueArray() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        File file = localMapper.readValue("[\"test.txt\"]", File.class);
        assertEquals(new File("test.txt"), file);
    }

    @Test(expected = IOException.class)
    public void testUnwrapSingleValueArrayTooManyValues() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        // มีค่ามากกว่า 1 ตัวในอาเรย์ จะต้องโยน Exception เพื่อเช็ค wrongTokenException
        localMapper.readValue("[\"test.txt\", \"extra.txt\"]", File.class);
    }

    @Test
    public void testEmbeddedObjectHandling() throws Exception {
        FromStringDeserializer.Std fileDeser = (FromStringDeserializer.Std) FromStringDeserializer.findDeserializer(File.class);
        
        // ทดสอบกรณี embedded object เป็น type เดียวกันหรือ sub-class
        JsonParser p = mapper.getFactory().createParser("   "); // จำลอง parser
        // เรียกผ่านพาร์เซอร์จำลองหรือทดสอบผ่าน deserialize โดยตรงด้วยเทคนิคปกติดีกว่า
        // แต่เนื่องจาก Parser ควบคุมยากในเคส Embedded Object เราสามารถทดสอบผ่าน _deserializeEmbedded ตรงๆ ได้
        try {
            fileDeser._deserializeEmbedded(new Object(), mapper.getDeserializationContext());
            fail("Expected exception");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Don't know how to convert embedded Object"));
        }
    }
}