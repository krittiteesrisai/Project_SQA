package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
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

    // --- Interpolate & Helper Coverage ---
    
    @Test
    public void testInterpolateNull() {
        assertNull(props.interpolate(null));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolateInfiniteLoop() {
        props.setProperty("a", "${b}");
        props.setProperty("b", "${a}");
        props.getString("a");
    }

    @Test
    public void testInterpolateWithDefaultsAndMissing() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("default.key", "defaultValue");
        
        ExtendedProperties localProps = new ExtendedProperties();
        // Set defaults via reflection or subclassing if possible, or use constructor
        // Here we test direct interpolation helper behavior via getString with defaults
        localProps.setProperty("my.prop", "Hello ${missing.key} and ${default.key}");
        // Since localProps doesn't have defaults field exposed directly via setter, 
        // we test standard interpolation fallback:
        String result = localProps.interpolate("Val=${undefined.var}");
        assertEquals("Val=${undefined.var}", result);
    }

    // --- PropertiesReader & Loading Edge Cases ---

    @Test
    public void testLoadWithInvalidAndValidEncoding() throws IOException {
        String data = "key1 = value1\n# comment\nkey2 = value2\\\n continued";
        ByteArrayInputStream bais = new ByteArrayInputStream(data.getBytes("UTF-8"));
        
        // Test with unsupported encoding triggering catch block
        props.load(bais, "INVALID-ENCODING-XYZ");
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2continued", props.getString("key2"));
    }

    @Test
    public void testLoadWithStandardEncoding() throws IOException {
        String data = "key = testValue";
        ByteArrayInputStream bais = new ByteArrayInputStream(data.getBytes("ISO-8859-1"));
        props.load(bais, "ISO-8859-1");
        assertEquals("testValue", props.getString("key"));
    }

    @Test
    public void testLoadWithIncludeProperty() throws IOException {
        File tempFile = File.createTempFile("included", ".properties");
        tempFile.deleteOnExit();
        FileWriter writer = new FileWriter(tempFile);
        writer.write("included.key = includedValue\n");
        writer.close();

        String data = "include = " + tempFile.getAbsolutePath() + "\n" +
                      "include.rel = ./" + tempFile.getName() + "\n";
        
        // Set basePath so relative path works
        props.basePath = tempFile.getParent() + File.separator;
        
        ByteArrayInputStream bais = new ByteArrayInputStream(data.getBytes());
        props.load(bais);
        
        assertEquals("includedValue", props.getString("included.key"));
    }

    // --- Add Property & Tokenizer / Escaping ---

    @Test
    public void testAddPropertyEscapingAndTokens() {
        props.addProperty("tokens", "val1,val2\\,val3,val4\\\\val5");
        List list = props.getList("tokens");
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals("val1", list.get(0));
        assertEquals("val2,val3", list.get(1));
        assertEquals("val4\\val5", list.get(2));
    }

    @Test
    public void testAddPropertyInternalObjectBranch() {
        props.addProperty("keyStr", "initial");
        props.addProperty("keyStr", "second"); // Should convert to List/Vector
        assertTrue(props.get("keyStr") instanceof List);

        props.addProperty("keyNonString", new Integer(123));
        props.addProperty("keyNonString", new Integer(456)); // Should add to List
        assertTrue(props.get("keyNonString") instanceof List);
    }

    // --- Getters & Type Conversions (Edge Cases & Exceptions) ---

    @Test
    public void testGetBooleanVariants() {
        props.setProperty("b1", "true");
        props.setProperty("b2", "off");
        props.setProperty("b3", "yes");
        props.setProperty("b4", "invalid");

        assertTrue(props.getBoolean("b1"));
        assertFalse(props.getBoolean("b2"));
        assertTrue(props.getBoolean("b3"));
        assertNull(props.testBoolean("invalid"));
        
        // Default boolean
        assertTrue(props.getBoolean("non.existent", true));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingException() {
        props.getBoolean("missing.bool");
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanClassCastException() {
        props.setProperty("not.bool", new Object());
        props.getBoolean("not.bool");
    }

    @Test
    public void testNumericGettersAndDefaults() {
        props.setProperty("byteKey", "10");
        props.setProperty("shortKey", "20");
        props.setProperty("intKey", "30");
        props.setProperty("longKey", "40");
        props.setProperty("floatKey", "50.5");
        props.setProperty("doubleKey", "60.6");

        assertEquals((byte) 10, props.getByte("byteKey"));
        assertEquals((byte) 5, props.getByte("missing.byte", (byte) 5));
        
        assertEquals((short) 20, props.getShort("shortKey"));
        assertEquals((short) 15, props.getShort("missing.short", (short) 15));

        assertEquals(30, props.getInt("intKey"));
        assertEquals(30, props.getInt("intKey", 99));
        assertEquals(99, props.getInt("missing.int", 99));

        assertEquals(40L, props.getLong("longKey"));
        assertEquals(45L, props.getLong("missing.long", 45L));

        assertEquals(50.5f, props.getFloat("floatKey"), 0.001f);
        assertEquals(55.5f, props.getFloat("missing.float", 55.5f), 0.001f);

        assertEquals(60.6, props.getDouble("doubleKey"), 0.001);
        assertEquals(65.6, props.getDouble("missing.double", 65.6), 0.001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteMissingException() {
        props.getByte("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByteClassCastException() {
        props.setProperty("invalid", new Object());
        props.getByte("invalid");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortMissingException() {
        props.getShort("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShortClassCastException() {
        props.setProperty("invalid", new Object());
        props.getShort("invalid");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissingException() {
        props.getInteger("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerClassCastException() {
        props.setProperty("invalid", new Object());
        props.getInteger("invalid");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissingException() {
        props.getLong("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongClassCastException() {
        props.setProperty("invalid", new Object());
        props.getLong("invalid");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissingException() {
        props.getFloat("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloatClassCastException() {
        props.setProperty("invalid", new Object());
        props.getFloat("invalid");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissingException() {
        props.getDouble("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDoubleClassCastException() {
        props.setProperty("invalid", new Object());
        props.getDouble("invalid");
    }

    // --- Properties conversion and GetProperties ---

    @Test
    public void testGetPropertiesAndStringArray() {
        props.setProperty("prop.list", "k1=v1,k2=v2");
        Properties p = props.getProperties("prop.list");
        assertEquals("v1", p.getProperty("k1"));
        assertEquals("v2", p.getProperty("k2"));

        String[] arr = props.getStringArray("prop.list");
        assertEquals(2, arr.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesMalformedToken() {
        props.setProperty("bad.list", "invalidTokenWithoutEquals");
        props.getProperties("bad.list");
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayClassCastException() {
        props.setProperty("invalid", new Object());
        props.getStringArray("invalid");
    }

    @Test
    public void testGetVectorAndListDefaults() {
        Vector vec = props.getVector("missing.vec", new Vector());
        assertNotNull(vec);

        List list = props.getList("missing.list", new ArrayList());
        assertNotNull(list);

        props.setProperty("stringVal", "single");
        assertEquals(1, props.getVector("stringVal").size());
        assertEquals(1, props.getList("stringVal").size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorClassCastException() {
        props.setProperty("invalid", new Object());
        props.getVector("invalid");
    }

    @Test(expected = ClassCastException.class)
    public void testGetListClassCastException() {
        props.setProperty("invalid", new Object());
        props.getList("invalid");
    }

    // --- Misc Operations: Save, Combine, Subset, Display, Include setters/getters ---

    @Test
    public void testSaveAndCombineAndSubset() throws IOException {
        props.setProperty("test.a", "valueA");
        props.setProperty("test.b", "valueB");
        props.setInclude(null);
        assertNull(props.getInclude());
        
        props.setInclude("customInclude");
        assertEquals("customInclude", props.getInclude());
        
        props.setInclude("");
        assertNull(props.getInclude());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, "Header Comment");
        assertTrue(baos.size() > 0);

        ExtendedProperties subset = props.subset("test");
        assertNotNull(subset);
        assertEquals("valueA", subset.getString("a"));

        ExtendedProperties subsetInvalid = props.subset("nonexistent");
        assertNull(subsetInvalid);

        ExtendedProperties combined = new ExtendedProperties();
        combined.combine(props);
        assertEquals("valueA", combined.getString("test.a"));

        // Test display method execution
        props.display();
    }

    @Test
    public void testPutAllAndRemoveAndClear() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("map.key", "mapVal");
        props.putAll(map);
        assertEquals("mapVal", props.getString("map.key"));

        ExtendedProperties epMap = new ExtendedProperties();
        epMap.setProperty("ep.key", "epVal");
        props.putAll(epMap);
        assertEquals("epVal", props.getString("ep.key"));

        assertNotNull(props.remove("ep.key"));
        assertNull(props.getString("ep.key"));

        props.clearProperty("test.a");
    }

    @Test
    public void testConvertProperties() {
        Properties javaProps = new Properties();
        javaProps.setProperty("java.prop", "javaVal");
        ExtendedProperties converted = ExtendedProperties.convertProperties(javaProps);
        assertEquals("javaVal", converted.getString("java.prop"));
    }
}