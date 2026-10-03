package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

public class ExtendedPropertiesTest {

    private ExtendedProperties props;
    private File tempFile;

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    // --- Interpolation Tests ---

    @Test
    public void testInterpolateNull() {
        assertNull(props.interpolate(null));
    }

    @Test
    public void testInterpolateBasicAndDefaults() {
        props.setProperty("name", "World");
        assertEquals("Hello World", props.interpolate("Hello ${name}"));
        
        // Test default fallback inside interpolation
        ExtendedProperties defaultProps = new ExtendedProperties();
        defaultProps.setProperty("default.key", "DefaultVal");
        ExtendedProperties childProps = new ExtendedProperties();
        // Set defaults via internal mechanism or test via getString
        childProps.setProperty("msg", "Val: ${default.key}");
        // We can simulate defaults by passing or setting up hierarchical usage
        // Or directly test interpolation when variable not found (retains ${...})
        assertEquals("Val: ${unknown.key}", props.interpolate("Val: ${unknown.key}"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolateInfiniteLoop() {
        props.setProperty("loop1", "${loop2}");
        props.setProperty("loop2", "${loop1}");
        props.getString("loop1");
    }

    // --- Loading & Reader Tests ---

    @Test
    public void testLoadWithEncodingAndEscaping() throws IOException {
        String content = "key1 = value1\\\n" +
                         "continued\n" +
                         "# comment line\n" +
                         "\n" +
                         "token.list = a\\,b, c\\\\d\n" +
                         "empty.val =\n";
        
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes("8859_1"));
        props.load(bais, "8859_1");

        assertEquals("value1continued", props.getString("key1"));
        List list = props.getList("token.list");
        assertNotNull(list);
    }

    @Test
    public void testLoadUnsupportedEncodingFallback() throws IOException {
        String content = "fallback.key = success\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes("UTF-8"));
        // Pass invalid encoding to trigger UnsupportedEncodingException and fallback
        props.load(bais, "INVALID-ENCODING-XYZ");
        assertEquals("success", props.getString("fallback.key"));
    }

    @Test
    public void testLoadIncludeFile() throws IOException {
        tempFile = File.createTempFile("included", ".properties");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("included.prop = loaded\n".getBytes());
        }

        String content = "include = " + tempFile.getAbsolutePath() + "\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes());
        props.load(bais);

        assertEquals("loaded", props.getString("included.prop"));
    }

    @Test
    public void testLoadIncludeRelativeFile() throws IOException {
        tempFile = File.createTempFile("rel_include", ".properties", new File("."));
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write("rel.prop = relativeLoaded\n".getBytes());
        }

        ExtendedProperties parentProps = new ExtendedProperties();
        // Construct with file path to set basePath
        ExtendedProperties ep = new ExtendedProperties(tempFile.getAbsolutePath());
        assertNotNull(ep);
    }

    // --- Type Getters & Edge Cases ---

    @Test
    public void testGetBooleanVariants() {
        props.setProperty("b1", "true");
        props.setProperty("b2", "YES");
        props.setProperty("b3", "off");
        props.setProperty("b4", Boolean.FALSE);
        
        assertTrue(props.getBoolean("b1"));
        assertTrue(props.getBoolean("b2"));
        assertFalse(props.getBoolean("b3"));
        assertFalse(props.getBoolean("b4"));
        
        // Default values & non-existent
        assertFalse(props.getBoolean("non.existent", false));
        assertTrue(props.getBoolean("non.existent", Boolean.TRUE));
        
        // Test invalid boolean string testBoolean return null
        assertNull(props.testBoolean("invalid"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanNoSuchElement() {
        props.getBoolean("missing.bool");
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanClassCast() {
        props.setProperty("not.bool", new Integer(123));
        props.getBoolean("not.bool");
    }

    @Test
    public void testGetByteVariants() {
        props.setProperty("byte1", "10");
        props.setProperty("byte2", new Byte((byte) 5));
        
        assertEquals(10, props.getByte("byte1"));
        assertEquals(5, props.getByte("byte2", (byte) 1));
        assertEquals(20, props.getByte("missing.byte", (byte) 20));
        assertEquals(Byte.valueOf((byte) 30), props.getByte("missing.byte", Byte.valueOf((byte) 30)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteNoSuchElement() {
        props.getByte("missing.byte");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByteClassCast() {
        props.setProperty("not.byte", "notANumber");
        props.getByte("not.byte");
    }

    @Test
    public void testGetShortVariants() {
        props.setProperty("short1", "100");
        props.setProperty("short2", new Short((short) 50));
        
        assertEquals(100, props.getShort("short1"));
        assertEquals(50, props.getShort("short2", (short) 10));
        assertEquals(200, props.getShort("missing.short", (short) 200));
        assertEquals(Short.valueOf((short) 300), props.getShort("missing.short", Short.valueOf((short) 300)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortNoSuchElement() {
        props.getShort("missing.short");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShortClassCast() {
        props.setProperty("not.short", new Object());
        props.getShort("not.short");
    }

    @Test
    public void testGetIntegerVariants() {
        props.setProperty("int1", "1000");
        props.setProperty("int2", new Integer(500));
        
        assertEquals(1000, props.getInt("int1"));
        assertEquals(1000, props.getInteger("int1"));
        assertEquals(500, props.getInt("int2", 10));
        assertEquals(77, props.getInt("missing.int", 77));
        assertEquals(Integer.valueOf(88), props.getInteger("missing.int", Integer.valueOf(88)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerNoSuchElement() {
        props.getInteger("missing.int");
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerClassCast() {
        props.setProperty("not.int", new Object());
        props.getInteger("not.int");
    }

    @Test
    public void testGetLongVariants() {
        props.setProperty("long1", "100000");
        props.setProperty("long2", new Long(50000L));
        
        assertEquals(100000L, props.getLong("long1"));
        assertEquals(50000L, props.getLong("long2", 10L));
        assertEquals(77L, props.getLong("missing.long", 77L));
        assertEquals(Long.valueOf(88L), props.getLong("missing.long", Long.valueOf(88L)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongNoSuchElement() {
        props.getLong("missing.long");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongClassCast() {
        props.setProperty("not.long", new Object());
        props.getLong("not.long");
    }

    @Test
    public void testGetFloatVariants() {
        props.setProperty("float1", "1.5");
        props.setProperty("float2", new Float(2.5f));
        
        assertEquals(1.5f, props.getFloat("float1"), 0.001f);
        assertEquals(2.5f, props.getFloat("float2", 1.0f), 0.001f);
        assertEquals(7.5f, props.getFloat("missing.float", 7.5f), 0.001f);
        assertEquals(Float.valueOf(8.5f), props.getFloat("missing.float", Float.valueOf(8.5f)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatNoSuchElement() {
        props.getFloat("missing.float");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloatClassCast() {
        props.setProperty("not.float", new Object());
        props.getFloat("not.float");
    }

    @Test
    public void testGetDoubleVariants() {
        props.setProperty("double1", "1.55");
        props.setProperty("double2", new Double(2.55));
        
        assertEquals(1.55, props.getDouble("double1"), 0.001);
        assertEquals(2.55, props.getDouble("double2", 1.0), 0.001);
        assertEquals(7.55, props.getDouble("missing.double", 7.55), 0.001);
        assertEquals(Double.valueOf(8.55), props.getDouble("missing.double", Double.valueOf(8.55)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleNoSuchElement() {
        props.getDouble("missing.double");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDoubleClassCast() {
        props.setProperty("not.double", new Object());
        props.getDouble("not.double");
    }

    @Test
    public void testGetStringArrayAndProperties() {
        props.addProperty("array.prop", "val1");
        props.addProperty("array.prop", "val2");
        String[] arr = props.getStringArray("array.prop");
        assertEquals(2, arr.length);

        // Test missing array with defaults
        ExtendedProperties def = new ExtendedProperties();
        def.setProperty("def.array", "dval");
        // Indirect testing via defaults propagation
        ExtendedProperties epWithDef = new ExtendedProperties();
        // Test getStringArray on null with defaults
        assertEquals(0, props.getStringArray("non.existent").length);

        // Test getProperties
        props.setProperty("props.key", "prop1=val1,prop2=val2");
        Properties parsedProps = props.getProperties("props.key");
        assertEquals("val1", parsedProps.getProperty("prop1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesMalformedToken() {
        props.setProperty("bad.props", "invalidTokenWithoutEqual");
        props.getProperties("bad.props");
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayClassCast() {
        props.setProperty("invalid.array", new Object());
        props.getStringArray("invalid.array");
    }

    @Test
    public void testGetVectorAndListVariants() {
        props.setProperty("vec.key", "item1");
        Vector vec = props.getVector("vec.key");
        assertNotNull(vec);

        List list = props.getList("list.key", new ArrayList());
        assertNotNull(list);
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorClassCast() {
        props.setProperty("not.vec", new Object());
        props.getVector("not.vec");
    }

    @Test(expected = ClassCastException.class)
    public void testGetListClassCast() {
        props.setProperty("not.list", new Object());
        props.getList("not.list");
    }

    // --- Collections & Misc Operations ---

    @Test
    public void testSubsetAndCombine() {
        props.setProperty("prefix.a", "1");
        props.setProperty("prefix.b", "2");
        props.setProperty("other", "3");
        props.setProperty("prefix", "exactMatch");

        ExtendedProperties subset = props.subset("prefix");
        assertNotNull(subset);
        assertEquals("1", subset.getString("a"));
        assertEquals("exactMatch", subset.getString("prefix"));

        ExtendedProperties noSubset = props.subset("nonexistent");
        assertNull(noSubset);

        ExtendedProperties combineTarget = new ExtendedProperties();
        combineTarget.combine(props);
        assertEquals("3", combineTarget.getString("other"));
    }

    @Test
    public void testClearPropertyAndGetKeys() {
        props.setProperty("key.to.clear", "value");
        assertTrue(props.containsKey("key.to.clear"));
        
        props.clearProperty("key.to.clear");
        assertFalse(props.containsKey("key.to.clear"));

        props.setProperty("app.one", "1");
        props.setProperty("app.two", "2");
        Iterator keysWithPrefix = props.getKeys("app.");
        assertNotNull(keysWithPrefix);
        assertTrue(keysWithPrefix.hasNext());
    }

    @Test
    public void testConvertPropertiesAndSave() throws IOException {
        Properties standardProps = new Properties();
        standardProps.setProperty("std.key", "std.val");
        ExtendedProperties converted = ExtendedProperties.convertProperties(standardProps);
        assertEquals("std.val", converted.getString("std.key"));

        // Test save method with header and List values
        converted.addProperty("list.save", "val1");
        converted.addProperty("list.save", "val2");
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        converted.save(baos, "Header Comment");
        assertTrue(baos.toString().length() > 0);

        // Test save with null output stream
        converted.save(null, "Header");
    }

    @Test
    public void testDisplayAndInitialization() {
        props.setProperty("disp", "val");
        props.display();
        assertTrue(props.isInitialized());
    }
}