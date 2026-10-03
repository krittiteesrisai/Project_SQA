package org.apache.commons.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;

public class ExtendedPropertiesTest {

    private File tempFile;
    private File defaultTempFile;

    @Before
    public void setUp() throws Exception {
        tempFile = File.createTempFile("test_props", ".properties");
        defaultTempFile = File.createTempFile("default_props", ".properties");
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
        if (defaultTempFile != null && defaultTempFile.exists()) {
            defaultTempFile.delete();
        }
    }

    @Test
    public void testEmptyConstructorAndDefaults() {
        ExtendedProperties props = new ExtendedProperties();
        assertFalse(props.isInitialized());
        assertNull(props.getString("nonexistent"));
        assertEquals("defaultVal", props.getString("nonexistent", "defaultVal"));
    }

    @Test
    public void testFileConstructorsAndInclude() throws IOException {
        FileWriter fw = new FileWriter(tempFile);
        fw.write("include = " + defaultTempFile.getAbsolutePath() + "\n");
        fw.write("key1 = value1\n");
        fw.close();

        FileWriter dfw = new FileWriter(defaultTempFile);
        dfw.write("defKey = defVal\n");
        dfw.close();

        ExtendedProperties props = new ExtendedProperties(tempFile.getAbsolutePath(), defaultTempFile.getAbsolutePath());
        assertTrue(props.isInitialized());
        assertEquals("value1", props.getString("key1"));
        assertEquals("defVal", props.getString("defKey"));
    }

    @Test
    public void testIncludeRelativeAndDotSlashPath() throws IOException {
        File subFile = new File(tempFile.getParentFile(), "sub.properties");
        FileWriter sfw = new FileWriter(subFile);
        sfw.write("subKey = subVal\n");
        sfw.close();

        FileWriter fw = new FileWriter(tempFile);
        fw.write("include = ." + File.separator + subFile.getName() + "\n");
        fw.close();

        ExtendedProperties props = new ExtendedProperties(tempFile.getAbsolutePath());
        assertEquals("subVal", props.getString("subKey"));
        subFile.delete();
    }

    @Test
    public void testGetAndSetInclude() {
        ExtendedProperties props = new ExtendedProperties();
        // default
        assertEquals("include", props.getInclude());
        
        props.setInclude(null); // internally converted to "" -> returns null or backwards compatibility
        assertNull(props.getInclude());

        props.setInclude("customInclude");
        assertEquals("customInclude", props.getInclude());
    }

    @Test
    public void testLoadWithEncodings() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        String data = "a = b\n# comment\n\n";
        InputStream is = new ByteArrayInputStream(data.getBytes("UTF-8"));
        props.load(is, "UTF-8");
        assertEquals("b", props.getString("a"));

        // Unsupported encoding fallback
        InputStream is2 = new ByteArrayInputStream(data.getBytes("ISO-8859-1"));
        props.load(is2, "NONEXISTENT_ENCODING");
        assertEquals("b", props.getString("a"));
    }

    @Test
    public void testInterpolationAndInfiniteLoop() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("prop1", "${prop2}");
        props.setProperty("prop2", "${prop1}");

        try {
            props.getString("prop1");
            fail("Expected IllegalStateException due to infinite loop");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("infinite loop"));
        }

        ExtendedProperties props2 = new ExtendedProperties();
        props2.setProperty("name", "World");
        props2.setProperty("greeting", "Hello ${name}! Undefined: ${undef}");
        assertEquals("Hello World! Undefined: ${undef}", props2.getString("greeting"));
        assertNull(props2.interpolate(null));
    }

    @Test
    public void testAddPropertyAndTokensAndEscaping() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("tokens", "val1,val2\\,val3,val4\\\\val5");
        List list = props.getList("tokens");
        assertEquals(3, list.size());
        assertEquals("val1", list.get(0));
        assertEquals("val2,val3", list.get(1));
        assertEquals("val4\\val5", list.get(2));

        // Add non-string and trigger internal list conversion
        props.addProperty("single", "first");
        props.addProperty("single", "second");
        assertTrue(props.get("single") instanceof List);
        
        props.addProperty("listObj", Arrays.asList("a", "b"));
        assertEquals("a", ((List)props.get("listObj")).get(0));
    }

    @Test
    public void testSetPropertyAndClearAndRemove() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("k1", "v1");
        assertEquals("v1", props.getString("k1"));

        props.setProperty("k1", "v2");
        assertEquals("v2", props.getString("k1"));

        Object removed = props.remove("k1");
        assertEquals("v2", removed);
        assertNull(props.getString("k1"));
    }

    @Test
    public void testSaveAndDisplay() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("key.str", "hello, world");
        props.addProperty("key.list", "item1");
        props.addProperty("key.list", "item2");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, "Header Comment");
        assertTrue(out.toString().contains("Header Comment"));
        assertTrue(out.toString().contains("key.str=hello\\, world"));

        // Save with null output
        props.save(null, "Header");

        // Display method coverage
        props.display();
    }

    @Test
    public void testCombineAndSubset() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.setProperty("app.name", "TestApp");
        props1.setProperty("app.version", "1.0");
        props1.setProperty("other", "val");

        ExtendedProperties subset = props1.subset("app");
        assertNotNull(subset);
        assertEquals("TestApp", subset.getString("name"));
        assertEquals("1.0", subset.getString("version"));

        // Subset exact match length
        ExtendedProperties subsetExact = props1.subset("app.name");
        assertEquals("TestApp", subsetExact.getString("app.name") != null ? subsetExact.getString("app.name") : subsetExact.getString("name"));

        // Subset not found
        assertNull(props1.subset("nonexistent"));

        ExtendedProperties props2 = new ExtendedProperties();
        props2.setProperty("app.version", "2.0");
        props1.combine(props2);
        assertEquals("2.0", props1.getString("app.version"));
    }

    @Test
    public void testGetKeysWithPrefix() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("test.one", "1");
        props.setProperty("test.two", "2");
        props.setProperty("other.three", "3");

        Iterator it = props.getKeys("test");
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGettersPrimitivesAndObjects() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("bool1", "true");
        props.setProperty("bool2", "off");
        props.setProperty("boolObj", Boolean.TRUE);
        props.setProperty("byte1", "12");
        props.setProperty("byteObj", Byte.valueOf((byte)5));
        props.setProperty("short1", "123");
        props.setProperty("shortObj", Short.valueOf((short)45));
        props.setProperty("int1", "1000");
        props.setProperty("intObj", Integer.valueOf(500));
        props.setProperty("long1", "100000");
        props.setProperty("longObj", Long.valueOf(50000L));
        props.setProperty("float1", "1.5");
        props.setProperty("floatObj", Float.valueOf(2.5f));
        props.setProperty("double1", "10.5");
        props.setProperty("doubleObj", Double.valueOf(20.5));
        props.setProperty("propsStr", "p1=v1\np2=v2");
        props.setProperty("vectorStr", "v1,v2");

        assertTrue(props.getBoolean("bool1"));
        assertFalse(props.getBoolean("bool2", true));
        assertTrue(props.getBoolean("boolObj"));
        
        assertEquals(12, props.getByte("byte1"));
        assertEquals(5, props.getByte("byteObj", (byte)1));

        assertEquals(123, props.getShort("short1"));
        assertEquals(45, props.getShort("shortObj", (short)1));

        assertEquals(1000, props.getInt("int1"));
        assertEquals(1000, props.getInteger("int1"));
        assertEquals(500, props.getInteger("intObj", 10));

        assertEquals(100000L, props.getLong("long1"));
        assertEquals(50000L, props.getLong("longObj", 10L));

        assertEquals(1.5f, props.getFloat("float1"), 0.001f);
        assertEquals(2.5f, props.getFloat("floatObj", 1.0f), 0.001f);

        assertEquals(10.5, props.getDouble("double1"), 0.001);
        assertEquals(20.5, props.getDouble("doubleObj", 1.0), 0.001);

        assertNotNull(props.getProperties("propsStr"));
        assertNotNull(props.getVector("vectorStr"));
        assertNotNull(props.getList("vectorStr"));
        assertNotNull(props.getStringArray("vectorStr"));

        // Defaults fallback testing
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("def.int", "42");
        props.defaults = defaults;
        assertEquals(42, props.getInteger("def.int", 0));
        assertEquals(42, props.getInt("def.int", 0));
        assertEquals(12, props.getByte("def.byte", (byte)12));
        assertEquals(12, props.getShort("def.short", (short)12));
        assertEquals(12L, props.getLong("def.long", 12L));
        assertEquals(1.2f, props.getFloat("def.float", 1.2f), 0.001f);
        assertEquals(1.2, props.getDouble("def.double", 1.2), 0.001);
        assertEquals(true, props.getBoolean("def.bool", true));
        assertNotNull(props.getStringArray("nonexistent.array"));
        assertNotNull(props.getVector("nonexistent.vec", new Vector()));
        assertNotNull(props.getList("nonexistent.list", new ArrayList()));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanNoSuchElement() {
        new ExtendedProperties().getBoolean("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteNoSuchElement() {
        new ExtendedProperties().getByte("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortNoSuchElement() {
        new ExtendedProperties().getShort("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerNoSuchElement() {
        new ExtendedProperties().getInteger("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongNoSuchElement() {
        new ExtendedProperties().getLong("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatNoSuchElement() {
        new ExtendedProperties().getFloat("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleNoSuchElement() {
        new ExtendedProperties().getDouble("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getString("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getStringArray("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getVector("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetListClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getList("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getBoolean("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByteClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getByte("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShortClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getShort("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getInteger("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getLong("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloatClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getFloat("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDoubleClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Object());
        props.getDouble("key");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesMalformedToken() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("malformed", "invalid_token_without_equals");
        props.getProperties("malformed");
    }

    @Test
    public void testConvertProperties() {
        Properties javaProps = new Properties();
        javaProps.setProperty("jp1", "jv1");
        ExtendedProperties ep = ExtendedProperties.convertProperties(javaProps);
        assertEquals("jv1", ep.getString("jp1"));
    }

    @Test
    public void testPutAllWithMap() {
        ExtendedProperties ep = new ExtendedProperties();
        Map<String, String> normalMap = new HashMap<String, String>();
        normalMap.put("m1", "mv1");
        ep.putAll(normalMap);
        assertEquals("mv1", ep.getString("m1"));

        ExtendedProperties ep2 = new ExtendedProperties();
        ep2.setProperty("m2", "mv2");
        ep.putAll(ep2);
        assertEquals("mv2", ep.getString("m2"));
    }
}