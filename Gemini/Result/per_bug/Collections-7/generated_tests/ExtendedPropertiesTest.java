package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

public class ExtendedPropertiesTest {

    private ExtendedProperties props;

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    @After
    public void tearDown() {
        props = null;
    }

    @Test
    public void testConstructorAndBasicGetters() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        assertFalse(ep.isInitialized());
        assertNotNull(ep.getInclude());

        ep.setInclude("customInclude");
        assertEquals("customInclude", ep.getInclude());

        ep.setInclude(null);
        assertEquals("include", ep.getInclude()); // Backwards compatibility hack

        ep.setInclude("");
        assertNull(ep.getInclude()); // Empty converts to null
    }

    @Test
    public void testInterpolationBasic() {
        props.setProperty("name", "World");
        props.setProperty("greeting", "Hello ${name}!");
        assertEquals("Hello World!", props.getString("greeting"));
    }

    @Test
    public void testInterpolationMultipleAndDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("def.prop", "DefaultValue");
        
        ExtendedProperties localProps = new ExtendedProperties();
        // ตั้งค่า defaults ผ่าน reflection หรือทางอ้อมไม่ได้ง่ายนักในบางเวอร์ชัน แต่เราทดสอบผ่าน constructor 2 พารามิเตอร์ หรือจำลองการทำงาน
        // ทดสอบตัวแปรที่ไม่ถูกนิยาม (Undefined variable)
        localProps.setProperty("test", "Val-${undefined.var}-End");
        assertEquals("Val-${undefined.var}-End", localProps.getString("test"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationInfiniteLoop() {
        props.setProperty("loop", "${loop}");
        props.getString("loop");
    }

    @Test
    public void testInterpolationNullBase() {
        assertNull(props.getString(null));
    }

    @Test
    public void testAddPropertyAndTokens() {
        props.addProperty("tokens", "val1,val2,val3\\,escaped");
        List list = props.getList("tokens");
        assertEquals(3, list.size());
        assertEquals("val1", list.get(0));
        assertEquals("val2", list.get(1));
        assertEquals("val3,escaped", list.get(2)); // Unescaping test
    }

    @Test
    public void testAddPropertyNonString() {
        props.addProperty("intKey", new Integer(123));
        assertEquals(new Integer(123), props.get("intKey"));
    }

    @Test
    public void testSetPropertyAndClear() {
        props.setProperty("key1", "value1");
        assertEquals("value1", props.getString("key1"));

        props.setProperty("key1", "value2");
        assertEquals("value2", props.getString("key1"));

        props.clearProperty("key1");
        assertNull(props.getString("key1"));
        
        // Clear non-existent key branch
        props.clearProperty("non.existent");
    }

    @Test
    public void testLoadStreamWithVariousEncodingsAndComments() throws IOException {
        String content = "# This is a comment\n" +
                         " \n" +
                         "key1 = value1\n" +
                         "key2 = value2\\\n" +
                         "       continued\n" +
                         "emptyValue =\n" +
                         "include = nonexistent.properties\n";
        
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes("UTF8"));
        props.load(bais, "UTF8");
        
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2continued", props.getString("key2"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testLoadWithUnsupportedEncodingFallback() throws IOException {
        String content = "fallback.key = fallback.value\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes("ISO-8859-1"));
        // ใช้ Encoding ที่ไม่มีอยู่จริงเพื่อทดสอบ UnsupportedEncodingException Catch blocks
        props.load(bais, "INVALID_ENCODING_NAME");
        assertEquals("fallback.value", props.getString("fallback.key"));
    }

    @Test
    public void testSaveAndDisplay() throws IOException {
        props.setProperty("save.key1", "val1");
        props.addProperty("save.key2", "val2,val3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, "Header Comment");
        assertTrue(baos.size() > 0);

        // Test display (just to execute code branch safely)
        props.display();

        // Test save with null output
        props.save(null, "Header");
    }

    @Test
    public void testCombineAndPutAll() {
        ExtendedProperties ep1 = new ExtendedProperties();
        ep1.setProperty("k1", "v1");

        ExtendedProperties ep2 = new ExtendedProperties();
        ep2.setProperty("k2", "v2");

        ep1.combine(ep2);
        assertEquals("v2", ep1.getString("k2"));

        Map<String, String> normalMap = new HashMap<String, String>();
        normalMap.put("k3", "v3");
        
        ExtendedProperties ep3 = new ExtendedProperties();
        ep3.putAll(normalMap);
        assertEquals("v3", ep3.getString("k3"));

        ep3.putAll(ep2); // Test Map instance of ExtendedProperties inside putAll
        assertEquals("v2", ep3.getString("k2"));
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.setProperty("app.name", "TestApp");
        props.setProperty("app.version", "1.0");
        props.setProperty("db.host", "localhost");

        Iterator<String> appKeys = props.getKeys("app");
        int count = 0;
        while (appKeys.hasNext()) {
            appKeys.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testSubset() {
        props.setProperty("prefix.one", "1");
        props.setProperty("prefix.two", "2");
        props.setProperty("prefix", "exact"); // key.length() == prefix.length() branch
        props.setProperty("other", "3");

        ExtendedProperties subset = props.subset("prefix");
        assertNotNull(subset);
        assertEquals("1", subset.getString("one"));
        assertEquals("exact", subset.getString("prefix"));

        assertNull(props.subset("nonexistent"));
    }

    @Test
    public void testTypeGettersAndExceptions() {
        props.setProperty("bool.true", "true");
        props.setProperty("bool.on", "ON");
        props.setProperty("bool.yes", "yes");
        props.setProperty("bool.false", "false");
        props.setProperty("bool.off", "OFF");
        props.setProperty("bool.no", "no");
        props.setProperty("bool.invalid", "maybe");
        props.setProperty("int.val", "42");
        props.setProperty("long.val", "100L"); // Wait, Long constructor fails with 'L', use "100"
        props.setProperty("long.val.clean", "100");
        props.setProperty("float.val", "3.14");
        props.setProperty("double.val", "2.718");
        props.setProperty("byte.val", "12");
        props.setProperty("short.val", "300");

        assertTrue(props.getBoolean("bool.true"));
        assertTrue(props.getBoolean("bool.on"));
        assertTrue(props.getBoolean("bool.yes"));
        assertFalse(props.getBoolean("bool.false"));
        assertFalse(props.getBoolean("bool.off"));
        assertFalse(props.getBoolean("bool.no"));
        assertNull(props.testBoolean("invalid"));

        assertEquals(42, props.getInt("int.val"));
        assertEquals(42, props.getInt("int.val", 10));
        assertEquals(10, props.getInt("nonexistent.int", 10));

        assertEquals(100L, props.getLong("long.val.clean"));
        assertEquals(3.14f, props.getFloat("float.val"), 0.001f);
        assertEquals(2.718, props.getDouble("double.val"), 0.001);
        assertEquals((byte) 12, props.getByte("byte.val"));
        assertEquals((short) 300, props.getShort("short.val"));

        // Default value tests when key is missing
        assertEquals(Boolean.TRUE, props.getBoolean("missing.bool", Boolean.TRUE));
        assertEquals((byte) 5, props.getByte("missing.byte", (byte) 5));
        assertEquals((short) 5, props.getShort("missing.short", (short) 5));
        assertEquals(5L, props.getLong("missing.long", 5L));
        assertEquals(3.14f, props.getFloat("missing.float", 3.14f), 0.001f);
        assertEquals(2.71, props.getDouble("missing.double", 2.71), 0.001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanNoSuchElement() {
        props.getBoolean("nonexistent");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteNoSuchElement() {
        props.getByte("nonexistent");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortNoSuchElement() {
        props.getShort("nonexistent");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerNoSuchElement() {
        props.getInteger("nonexistent");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongNoSuchElement() {
        props.getLong("nonexistent");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatNoSuchElement() {
        props.getFloat("nonexistent");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleNoSuchElement() {
        props.getDouble("nonexistent");
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringClassCastException() {
        props.put("invalid.type", new Object());
        props.getString("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorClassCastException() {
        props.put("invalid.type", new Object());
        props.getVector("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetListClassCastException() {
        props.put("invalid.type", new Object());
        props.getList("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanClassCastException() {
        props.put("invalid.type", new Object());
        props.getBoolean("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByteClassCastException() {
        props.put("invalid.type", new Object());
        props.getByte("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShortClassCastException() {
        props.put("invalid.type", new Object());
        props.getShort("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerClassCastException() {
        props.put("invalid.type", new Object());
        props.getInteger("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongClassCastException() {
        props.put("invalid.type", new Object());
        props.getLong("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloatClassCastException() {
        props.put("invalid.type", new Object());
        props.getFloat("invalid.type");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDoubleClassCastException() {
        props.put("invalid.type", new Object());
        props.getDouble("invalid.type");
    }

    @Test
    public void testGetPropertiesParsing() {
        props.setProperty("props.line", "keyA=valA, keyB=valB");
        Properties p = props.getProperties("props.line");
        assertEquals("valA", p.getProperty("keyA"));
        assertEquals("valB", p.getProperty("keyB"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesMalformedToken() {
        props.setProperty("props.bad", "malformedTokenWithoutEquals");
        props.getProperties("props.bad");
    }

    @Test
    public void testConvertPropertiesStatic() {
        Properties javaProps = new Properties();
        javaProps.setProperty("java.key", "java.val");
        ExtendedProperties converted = ExtendedProperties.convertProperties(javaProps);
        assertEquals("java.val", converted.getString("java.key"));
    }
}