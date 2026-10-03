package org.apache.commons.collections;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

public class ExtendedPropertiesTest {

    @Test
    public void testBasicPropertiesAndGetters() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("string.key", "hello");
        props.setProperty("int.key", "123");
        props.setProperty("long.key", "456789");
        props.setProperty("float.key", "1.23");
        props.setProperty("double.key", "4.56");
        props.setProperty("boolean.key", "yes");
        props.setProperty("byte.key", "10");
        props.setProperty("short.key", "20");

        assertEquals("hello", props.getString("string.key"));
        assertEquals("default", props.getString("non.existent", "default"));
        assertNull(props.getString("non.existent"));

        assertEquals(123, props.getInt("int.key"));
        assertEquals(123, props.getInt("int.key", 999));
        assertEquals(999, props.getInt("non.existent", 999));

        assertEquals(456789L, props.getLong("long.key"));
        assertEquals(456789L, props.getLong("long.key", 999L));
        assertEquals(999L, props.getLong("non.existent", 999L));

        assertEquals(1.23f, props.getFloat("float.key"), 0.001f);
        assertEquals(1.23f, props.getFloat("float.key", 9.9f), 0.001f);
        assertEquals(9.9f, props.getFloat("non.existent", 9.9f), 0.001f);

        assertEquals(4.56, props.getDouble("double.key"), 0.001);
        assertEquals(4.56, props.getDouble("double.key", 9.9), 0.001);
        assertEquals(9.9, props.getDouble("non.existent", 9.9), 0.001);

        assertTrue(props.getBoolean("boolean.key"));
        assertTrue(props.getBoolean("boolean.key", false));
        assertFalse(props.getBoolean("non.existent", false));

        assertEquals((byte) 10, props.getByte("byte.key"));
        assertEquals((byte) 10, props.getByte("byte.key", (byte) 5));
        assertEquals((byte) 5, props.getByte("non.existent", (byte) 5));

        assertEquals((short) 20, props.getShort("short.key"));
        assertEquals((short) 20, props.getShort("short.key", (short) 5));
        assertEquals((short) 5, props.getShort("non.existent", (short) 5));
        
        // Aliases and Direct Getters
        assertEquals(123, props.getInt("int.key"));
        assertEquals("hello", props.getProperty("string.key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getBoolean("missing.bool");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteMissingException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getByte("missing.byte");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortMissingException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getShort("missing.short");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissingException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getInteger("missing.int");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissingException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getLong("missing.long");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissingException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getFloat("missing.float");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissingException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getDouble("missing.double");
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.int", new Object());
        props.getInteger("not.int");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.long", new Object());
        props.getLong("not.long");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloatClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.float", new Object());
        props.getFloat("not.float");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDoubleClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.double", new Object());
        props.getDouble("not.double");
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.bool", new Object());
        props.getBoolean("not.bool");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByteClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.byte", new Object());
        props.getByte("not.byte");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShortClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.short", new Object());
        props.getShort("not.short");
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.string", new Object());
        props.getString("not.string");
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("not.array", new Object());
        props.getStringArray("not.array");
    }

    @Test
    public void testTestBooleanVariants() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("true", props.testBoolean("TRUE"));
        assertEquals("true", props.testBoolean("ON"));
        assertEquals("true", props.testBoolean("YES"));
        assertEquals("false", props.testBoolean("FALSE"));
        assertEquals("false", props.testBoolean("OFF"));
        assertEquals("false", props.testBoolean("NO"));
        assertNull(props.testBoolean("invalid"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationInfiniteLoop() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("var1", "${var2}");
        props.setProperty("var2", "${var1}");
        props.getString("var1");
    }

    @Test
    public void testInterpolationWithDefaultsAndMissing() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("default.key", "defaultVal");

        ExtendedProperties props = new ExtendedProperties();
        // Set defaults via internal or subclassing behavior if possible, 
        // here we test interpolation when variable is missing
        props.setProperty("missing.var", "Hello ${undefined.var}!");
        assertEquals("Hello ${undefined.var}!", props.getString("missing.var"));
    }

    @Test
    public void testLoadAndPropertiesReader() throws IOException {
        String content = "# Comment line\n" +
                         "key1 = value1\n" +
                         "key2 = token1\\, token2, token3\\\n" +
                         " continued\n" +
                         "empty = \n";
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes("8859_1"));
        ExtendedProperties props = new ExtendedProperties();
        props.load(bais, "8859_1");
        
        assertEquals("value1", props.getString("key1"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testLoadWithEncodingFallback() throws IOException {
        String content = "test = data\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        // Trigger unsupported encoding fallback
        props.load(bais, "INVALID-ENCODING-NAME");
        assertEquals("data", props.getString("test"));
    }

    @Test
    public void testAddPropertyAndListHandling() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("list.key", "a,b,c");
        props.addProperty("list.key", "d");
        
        List list = props.getList("list.key");
        assertNotNull(list);
        assertTrue(list.size() >= 4);

        Vector vector = props.getVector("list.key");
        assertNotNull(vector);

        String[] arr = props.getStringArray("list.key");
        assertEquals(list.size(), arr.length);
    }

    @Test
    public void testGetPropertiesParsing() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("props.key", "p1=v1,p2=v2");
        Properties p = props.getProperties("props.key");
        assertEquals("v1", p.getProperty("p1"));
        assertEquals("v2", p.getProperty("p2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesMalformedToken() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("props.key", "malformed_token");
        props.getProperties("props.key");
    }

    @Test
    public void testSubsetAndGetKeysWithPrefix() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("prefix.a", "1");
        props.setProperty("prefix.b", "2");
        props.setProperty("prefix", "exact");
        props.setProperty("other", "3");

        ExtendedProperties subset = props.subset("prefix");
        assertNotNull(subset);
        assertEquals("1", subset.getString("a"));
        assertEquals("exact", subset.getString(""));

        Iterator matching = props.getKeys("prefix");
        assertTrue(matching.hasNext());

        ExtendedProperties invalidSubset = props.subset("nonexistent");
        assertNull(invalidSubset);
    }

    @Test
    public void testSaveAndDisplayAndCombine() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("save.key", "save.value");
        props.addProperty("save.list", "item1");
        props.addProperty("save.list", "item2");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, "Header Comment");
        assertTrue(baos.size() > 0);

        // Test save with null output
        props.save(null, "Header");

        ExtendedProperties props2 = new ExtendedProperties();
        props2.setProperty("save.key", "new.value");
        props.combine(props2);
        assertEquals("new.value", props.getString("save.key"));

        props.display();
    }

    @Test
    public void testClearAndRemoveAndPutAll() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("remove.key", "val");
        assertNotNull(props.remove("remove.key"));
        assertNull(props.getString("remove.key"));

        Map<String, String> map = new HashMap<String, String>();
        map.put("map.key", "map.val");
        props.putAll(map);
        assertEquals("map.val", props.getString("map.key"));

        ExtendedProperties props2 = new ExtendedProperties();
        props2.setProperty("ep.key", "ep.val");
        props.putAll(props2);
        assertEquals("ep.val", props.getString("ep.key"));
    }

    @Test
    public void testIncludeGetSet() {
        ExtendedProperties props = new ExtendedProperties();
        assertNotNull(props.getInclude());
        
        props.setInclude(null);
        assertEquals("", props.getInclude()); // converted to internal empty/null hack
        
        props.setInclude("customInclude");
        assertEquals("customInclude", props.getInclude());

        props.setInclude("");
        assertNull(props.getInclude());
    }

    @Test
    public void testConvertPropertiesStatic() {
        Properties javaProps = new Properties();
        javaProps.setProperty("jkey", "jval");
        ExtendedProperties ep = ExtendedProperties.convertProperties(javaProps);
        assertEquals("jval", ep.getString("jkey"));
    }
}