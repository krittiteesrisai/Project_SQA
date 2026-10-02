# ExtendedPropertiesTest.java

หมายเหตุก่อนเริ่ม: บางเมธอด/บางสาขาในซอร์สโค้ด (เช่น branch ที่ ISO-8859-1 encoding ไม่รองรับ, หรือ branch ที่ key ใน `keysAsListed` ไม่เป็น `String`) ไม่สามารถทดสอบได้จริงผ่าน public API เพราะไม่มีทางไปถึง (unreachable ในทางปฏิบัติ) — จะมีคอมเมนต์กำกับไว้ในแต่ละจุด

```java
package org.apache.commons.collections;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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

    private File createTempPropertiesFile(String content) throws IOException {
        File f = File.createTempFile("extprops", ".properties");
        FileWriter fw = new FileWriter(f);
        fw.write(content);
        fw.close();
        return f;
    }

    // ---------------- Constructors ----------------

    @Test
    public void testDefaultConstructor() {
        assertFalse(props.isInitialized());
        assertFalse(props.getKeys().hasNext());
    }

    @Test(expected = IOException.class)
    public void testConstructorWithNonExistentFileThrows() throws IOException {
        new ExtendedProperties("this/file/does/not/exist.properties");
    }

    @Test
    public void testConstructorWithValidFile() throws IOException {
        tempFile = createTempPropertiesFile("key1 = value1\nkey2 = value2\n");
        ExtendedProperties p = new ExtendedProperties(tempFile.getAbsolutePath());
        assertEquals("value1", p.getString("key1"));
        assertEquals("value2", p.getString("key2"));
        assertTrue(p.isInitialized());
    }

    @Test
    public void testConstructorWithDefaultFile() throws IOException {
        File defFile = createTempPropertiesFile("defkey = defvalue\n");
        tempFile = createTempPropertiesFile("key1 = value1\n");
        ExtendedProperties p = new ExtendedProperties(tempFile.getAbsolutePath(), defFile.getAbsolutePath());
        assertEquals("value1", p.getString("key1"));
        assertEquals("defvalue", p.getString("defkey"));
        defFile.delete();
    }

    // ---------------- isInitialized / getInclude / setInclude ----------------

    @Test
    public void testIsInitializedFalseInitially() {
        assertFalse(props.isInitialized());
    }

    @Test
    public void testIsInitializedTrueAfterAddProperty() {
        props.addProperty("a", "b");
        assertTrue(props.isInitialized());
    }

    @Test
    public void testGetIncludeDefault() {
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testSetIncludeNullMeansDisabled() {
        props.setInclude(null);
        assertNull(props.getInclude());
    }

    @Test
    public void testSetIncludeEmptyMeansDisabled() {
        props.setInclude("");
        assertNull(props.getInclude());
    }

    @Test
    public void testSetIncludeCustomValue() {
        props.setInclude("myinclude");
        assertEquals("myinclude", props.getInclude());
    }

    // ---------------- load ----------------

    @Test
    public void testLoadSimpleKeyValue() throws IOException {
        String data = "key1 = value1\nkey2 = value2\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testLoadCommentsAndBlankLinesSkipped() throws IOException {
        String data = "# comment line\n\nkey1 = value1\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testLoadMultiLineContinuation() throws IOException {
        String data = "key1 = part1 \\\npart2\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        assertEquals("part1 part2", props.getString("key1"));
    }

    @Test
    public void testLoadLineWithoutEqualsIgnored() throws IOException {
        String data = "noequalsline\nkey1 = value1\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        assertEquals("value1", props.getString("key1"));
        assertFalse(props.containsKey("noequalsline"));
    }

    @Test
    public void testLoadEmptyValueIgnored() throws IOException {
        String data = "key1 =\nkey2 = value2\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        assertFalse(props.containsKey("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testLoadDuplicateKeysBecomeList() throws IOException {
        String data = "key1 = value1\nkey1 = value2\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        List list = props.getList("key1");
        assertEquals(2, list.size());
        assertTrue(list.contains("value1"));
        assertTrue(list.contains("value2"));
    }

    @Test
    public void testLoadWithValidEncoding() throws IOException {
        String data = "key1 = value1\n";
        props.load(new ByteArrayInputStream(data.getBytes("UTF-8")), "UTF-8");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testLoadWithUnsupportedEncodingFallsBackTo8859() throws IOException {
        // enc ที่ไม่รู้จัก -> UnsupportedEncodingException ถูก catch -> fallback ไปใช้ 8859_1
        String data = "key1 = value1\n";
        props.load(new ByteArrayInputStream(data.getBytes()), "BOGUS-ENC-NAME");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testLoadIncludeAbsolutePath() throws IOException {
        // สมมติ fileSeparator เป็น "/" (Unix-like) ตาม environment ที่ใช้รัน
        File includeFile = createTempPropertiesFile("includedKey = includedValue\n");
        String data = "include = " + includeFile.getAbsolutePath() + "\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        assertEquals("includedValue", props.getString("includedKey"));
        includeFile.delete();
    }

    @Test
    public void testLoadIncludeNonExistentFileIgnored() throws IOException {
        String data = "include = /nonexistent/path/file.properties\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        // ไฟล์ไม่พบ -> ไม่ load, และคีย์ "include" เองก็ไม่ถูกเก็บ (เพราะเข้า branch include)
        assertFalse(props.containsKey("include"));
    }

    @Test
    public void testLoadIncludeDisabledWhenIncludeNameIsNull() throws IOException {
        props.setInclude(null); // getInclude() จะ return null -> include-check ถูก skip
        String data = "include = somefile.properties\n";
        props.load(new ByteArrayInputStream(data.getBytes()));
        assertEquals("somefile.properties", props.getString("include"));
    }

    // ---------------- getProperty ----------------

    @Test
    public void testGetPropertyFromOwnStore() {
        props.addProperty("key", "value");
        assertEquals("value", props.getProperty("key"));
    }

    @Test
    public void testGetPropertyMissingNoDefaultsReturnsNull() {
        assertNull(props.getProperty("missing"));
    }

    @Test
    public void testGetPropertyFallsBackToDefaults() throws IOException {
        File defFile = createTempPropertiesFile("defkey = defvalue\n");
        File mainFile = createTempPropertiesFile("key1 = value1\n");
        ExtendedProperties p = new ExtendedProperties(mainFile.getAbsolutePath(), defFile.getAbsolutePath());
        assertEquals("defvalue", p.getProperty("defkey"));
        assertEquals("value1", p.getProperty("key1"));
        assertNull(p.getProperty("missing"));
        defFile.delete();
        mainFile.delete();
    }

    // ---------------- addProperty ----------------

    @Test
    public void testAddPropertySingleValueNoComma() {
        props.addProperty("key", "value");
        assertEquals("value", props.getString("key"));
    }

    @Test
    public void testAddPropertyCommaSeparatedBecomesList() {
        props.addProperty("key", "a,b,c");
        List list = props.getList("key");
        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddPropertyEscapedCommaKeptAsOneToken() {
        props.addProperty("key", "a\\,b"); // a + backslash + comma + b
        assertEquals("a,b", props.getString("key"));
        assertFalse(props.get("key") instanceof List);
    }

    @Test
    public void testAddPropertyDuplicateKeyAccumulates() {
        props.addProperty("key", "value1");
        props.addProperty("key", "value2");
        props.addProperty("key", "value3");
        List list = props.getList("key");
        assertEquals(3, list.size());
    }

    @Test
    public void testAddPropertyNonStringValueStoredDirectly() {
        Integer val = new Integer(42);
        props.addProperty("key", val);
        assertEquals(val, props.get("key"));
    }

    // ---------------- setProperty ----------------

    @Test
    public void testSetPropertyReplacesExisting() {
        props.addProperty("key", "value1");
        props.setProperty("key", "value2");
        assertEquals("value2", props.getString("key"));
        assertFalse(props.get("key") instanceof List);
    }

    // ---------------- save ----------------

    @Test
    public void testSaveWithNullOutputStreamReturnsImmediately() throws IOException {
        props.save(null, null); // ไม่ควร throw
    }

    @Test
    public void testSaveWithHeaderAndStringValue() throws IOException {
        props.addProperty("key", "value");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, "# header");
        String result = out.toString();
        assertTrue(result.contains("# header"));
        assertTrue(result.contains("key=value"));
    }

    @Test
    public void testSaveWithoutHeader() throws IOException {
        props.addProperty("key", "value");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, null);
        assertFalse(out.toString().contains("header"));
        assertTrue(out.toString().contains("key=value"));
    }

    @Test
    public void testSaveWithListValuePrintsEachElement() throws IOException {
        props.addProperty("key", "a,b");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, null);
        String result = out.toString();
        assertTrue(result.contains("key=a"));
        assertTrue(result.contains("key=b"));
    }

    @Test
    public void testSaveEscapesCommaOnOutput() throws IOException {
        props.addProperty("key", "a\\,b"); // เก็บเป็น "a,b" จริง (single string)
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, null);
        assertTrue(out.toString().contains("key=a\\,b"));
    }

    @Test
    public void testSaveSkipsNonStringNonListValue() throws IOException {
        props.put("key", new Integer(5)); // put ตรง ๆ ผ่าน Hashtable
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, null);
        assertFalse(out.toString().contains("key=5"));
    }

    // ---------------- combine ----------------

    @Test
    public void testCombineOverwritesExistingValue() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("key1", "value1");
        props.addProperty("key1", "oldvalue");
        props.combine(other);
        assertEquals("value1", props.getString("key1"));
    }

    // ---------------- clearProperty ----------------

    @Test
    public void testClearPropertyExistingKeyRemovesFromKeysAsListed() {
        props.addProperty("key", "value");
        props.clearProperty("key");
        assertFalse(props.containsKey("key"));
        assertFalse(props.getKeys().hasNext());
    }

    @Test
    public void testClearPropertyNonExistingKeyIsNoOp() {
        props.clearProperty("nokey");
        assertFalse(props.containsKey("nokey"));
    }

    // ---------------- getKeys ----------------

    @Test
    public void testGetKeysPreservesInsertOrder() {
        props.addProperty("k1", "v1");
        props.addProperty("k2", "v2");
        Iterator it = props.getKeys();
        assertEquals("k1", it.next());
        assertEquals("k2", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysWithPrefixMatch() {
        props.addProperty("prefix.key1", "v1");
        props.addProperty("other.key2", "v2");
        Iterator it = props.getKeys("prefix");
        assertTrue(it.hasNext());
        assertEquals("prefix.key1", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysWithPrefixNoMatch() {
        props.addProperty("other.key2", "v2");
        Iterator it = props.getKeys("prefix");
        assertFalse(it.hasNext());
    }

    // ---------------- subset ----------------

    @Test
    public void testSubsetValidReturnsSubProperties() {
        props.addProperty("prefix.key1", "v1");
        props.addProperty("prefix.key2", "v2");
        ExtendedProperties sub = props.subset("prefix");
        assertNotNull(sub);
        assertEquals("v1", sub.getString("key1"));
        assertEquals("v2", sub.getString("key2"));
    }

    @Test
    public void testSubsetKeyExactlyEqualsPrefix() {
        props.addProperty("prefix", "v1");
        ExtendedProperties sub = props.subset("prefix");
        assertNotNull(sub);
        assertEquals("v1", sub.getString("prefix"));
    }

    @Test
    public void testSubsetNoMatchReturnsNull() {
        props.addProperty("other", "v1");
        ExtendedProperties sub = props.subset("prefix");
        assertNull(sub);
    }

    // ---------------- display ----------------

    @Test
    public void testDisplayDoesNotThrow() {
        props.addProperty("key", "value");
        props.display(); // ตรวจแค่ไม่มี exception (ผลลัพธ์ไป System.out)
    }

    // ---------------- getString ----------------

    @Test
    public void testGetStringWithStringValue() {
        props.addProperty("key", "value");
        assertEquals("value", props.getString("key"));
    }

    @Test
    public void testGetStringWithListValueReturnsFirstElement() {
        props.addProperty("key", "a,b");
        assertEquals("a", props.getString("key"));
    }

    @Test
    public void testGetStringMissingNoDefaultsReturnsNull() {
        assertNull(props.getString("missing"));
    }

    @Test
    public void testGetStringMissingWithDefaultValue() {
        assertEquals("default", props.getString("missing", "default"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringWrongTypeThrowsCCE() {
        props.put("key", new Integer(1));
        props.getString("key");
    }

    @Test
    public void testGetStringInterpolationResolvesVariable() {
        props.addProperty("name", "world");
        props.addProperty("greeting", "hello ${name}");
        assertEquals("hello world", props.getString("greeting"));
    }

    @Test
    public void testGetStringInterpolationMissingVariableKeptLiteral() {
        props.addProperty("greeting", "hello ${missing}");
        assertEquals("hello ${missing}", props.getString("greeting"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetStringInterpolationInfiniteLoopThrows() {
        props.addProperty("a", "${b}");
        props.addProperty("b", "${a}");
        props.getString("a");
    }

    // ---------------- getProperties ----------------

    @Test
    public void testGetPropertiesValidTokens() {
        props.addProperty("key", "a=1,b=2");
        Properties p = props.getProperties("key");
        assertEquals("1", p.getProperty("a"));
        assertEquals("2", p.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesMalformedTokenThrows() {
        props.addProperty("key", "novalue");
        props.getProperties("key");
    }

    @Test
    public void testGetPropertiesWithDefaultsProperties() {
        props.addProperty("key", "a=1");
        Properties defaults = new Properties();
        defaults.put("z", "default");
        Properties p = props.getProperties("key", defaults);
        assertEquals("1", p.getProperty("a"));
        assertEquals("default", p.getProperty("z"));
    }

    // ---------------- getStringArray ----------------

    @Test
    public void testGetStringArrayFromStringValue() {
        props.addProperty("key", "value");
        String[] arr = props.getStringArray("key");
        assertEquals(1, arr.length);
        assertEquals("value", arr[0]);
    }

    @Test
    public void testGetStringArrayFromListValue() {
        props.addProperty("key", "a,b");
        String[] arr = props.getStringArray("key");
        assertEquals(2, arr.length);
    }

    @Test
    public void testGetStringArrayMissingNoDefaultsReturnsEmptyArray() {
        String[] arr = props.getStringArray("missing");
        assertEquals(0, arr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayWrongTypeThrows() {
        props.put("key", new Integer(1));
        props.getStringArray("key");
    }

    // ---------------- getVector ----------------

    @Test
    public void testGetVectorFromListValue() {
        props.addProperty("key", "a,b");
        Vector v = props.getVector("key");
        assertEquals(2, v.size());
    }

    @Test
    public void testGetVectorFromStringValuePutsBackAsVector() {
        props.addProperty("key", "value");
        Vector v = props.getVector("key");
        assertEquals(1, v.size());
        assertTrue(props.get("key") instanceof Vector);
    }

    @Test
    public void testGetVectorMissingNoDefaultValueReturnsEmptyVector() {
        Vector v = props.getVector("missing");
        assertNotNull(v);
        assertEquals(0, v.size());
    }

    @Test
    public void testGetVectorMissingWithSuppliedDefaultValue() {
        Vector def = new Vector();
        def.add("x");
        Vector v = props.getVector("missing", def);
        assertSame(def, v);
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorWrongTypeThrows() {
        props.put("key", new Integer(1));
        props.getVector("key");
    }

    // ---------------- getList ----------------

    @Test
    public void testGetListFromListValue() {
        props.addProperty("key", "a,b");
        List l = props.getList("key");
        assertEquals(2, l.size());
    }

    @Test
    public void testGetListFromStringValuePutsBackAsList() {
        props.addProperty("key", "value");
        List l = props.getList("key");
        assertEquals(1, l.size());
        assertTrue(props.get("key") instanceof List);
    }

    @Test
    public void testGetListMissingNoDefaultValueReturnsEmptyList() {
        List l = props.getList("missing");
        assertNotNull(l);
        assertEquals(0, l.size());
    }

    @Test
    public void testGetListMissingWithSuppliedDefaultValue() {
        List def = new ArrayList();
        def.add("x");
        List l = props.getList("missing", def);
        assertSame(def, l);
    }

    @Test(expected = ClassCastException.class)
    public void testGetListWrongTypeThrows() {
        props.put("key", new Integer(1));
        props.getList("key");
    }

    // ---------------- getBoolean ----------------

    @Test
    public void testGetBooleanExistingBooleanValue() {
        props.put("key", Boolean.TRUE);
        assertTrue(props.getBoolean("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingThrowsNSEE() {
        props.getBoolean("missing");
    }

    @Test
    public void testGetBooleanWithPrimitiveDefaultValue() {
        assertTrue(props.getBoolean("missing", true));
        assertFalse(props.getBoolean("missing2", false));
    }

    @Test
    public void testGetBooleanFromStringTrueVariants() {
        props.put("k1", "true");
        props.put("k2", "on");
        props.put("k3", "yes");
        assertTrue(props.getBoolean("k1"));
        assertTrue(props.getBoolean("k2"));
        assertTrue(props.getBoolean("k3"));
    }

    @Test
    public void testGetBooleanFromStringFalseVariants() {
        props.put("k1", "false");
        props.put("k2", "off");
        props.put("k3", "no");
        assertFalse(props.getBoolean("k1"));
        assertFalse(props.getBoolean("k2"));
        assertFalse(props.getBoolean("k3"));
    }

    @Test
    public void testGetBooleanInvalidStringResultsInFalseBoolean() {
        // testBoolean("notaboolean") -> null -> new Boolean((String)null) -> false
        props.put("key", "notaboolean");
        Boolean b = props.getBoolean("key", Boolean.TRUE);
        assertFalse(b.booleanValue());
    }

    @Test
    public void testGetBooleanMissingNoDefaultsFallsBackToDefaultValueParam() {
        assertNull(props.getBoolean("missing", (Boolean) null));
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanWrongTypeThrows() {
        props.put("key", new Integer(1));
        props.getBoolean("key", Boolean.FALSE);
    }

    // ---------------- testBoolean ----------------

    @Test
    public void testTestBooleanTrueValuesCaseInsensitive() {
        assertEquals("true", props.testBoolean("TRUE"));
        assertEquals("true", props.testBoolean("On"));
        assertEquals("true", props.testBoolean("yEs"));
    }

    @Test
    public void testTestBooleanFalseValuesCaseInsensitive() {
        assertEquals("false", props.testBoolean("FALSE"));
        assertEquals("false", props.testBoolean("Off"));
        assertEquals("false", props.testBoolean("nO"));
    }

    @Test
    public void testTestBooleanInvalidReturnsNull() {
        assertNull(props.testBoolean("maybe"));
    }

    // ---------------- getByte ----------------

    @Test
    public void testGetByteExisting() {
        props.put("key", new Byte((byte) 5));
        assertEquals(5, props.getByte("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteMissingThrows() {
        props.getByte("missing");
    }

    @Test
    public void testGetByteFromStringParses() {
        props.put("key", "5");
        assertEquals((byte) 5, props.getByte("key", (byte) 0));
    }

    @Test
    public void testGetByteWithPrimitiveDefault() {
        assertEquals((byte) 9, props.getByte("missing", (byte) 9));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByteInvalidNumberThrowsNFE() {
        props.put("key", "notanumber");
        props.getByte("key", (byte) 0);
    }

    @Test(expected = ClassCastException.class)
    public void testGetByteWrongTypeThrows() {
        props.put("key", new Integer(1));
        props.getByte("key", (byte) 0);
    }

    // ---------------- getShort ----------------

    @Test
    public void testGetShortExisting() {
        props.put("key", new Short((short) 7));
        assertEquals(7, props.getShort("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortMissingThrows() {
        props.getShort("missing");
    }

    @Test
    public void testGetShortFromStringParses() {
        props.put("key", "7");
        assertEquals((short) 7, props.getShort("key", (short) 0));
    }

    @Test
    public void testGetShortWithPrimitiveDefault() {
        assertEquals((short) 3, props.getShort("missing", (short) 3));
    }

    @Test(expected = ClassCastException.class)
    public void testGetShortWrongTypeThrows() {
        props.put("key", new Integer(1));
        props.getShort("key", (short) 0);
    }

    // ---------------- getInt / getInteger ----------------

    @Test
    public void testGetIntExisting() {
        props.put("key", new Integer(10));
        assertEquals(10, props.getInt("key"));
    }

    @Test
    public void testGetIntWithDefault() {
        assertEquals(99, props.getInt("missing", 99));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissingThrows() {
        props.getInteger("missing");
    }

    @Test
    public void testGetIntegerFromStringParses() {
        props.put("key", "42");
        assertEquals(42, props.getInteger("key", 0));
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerWrongTypeThrows() {
        props.put("key", Boolean.TRUE);
        props.getInteger("key", (Integer) null);
    }

    // ---------------- getLong ----------------

    @Test
    public void testGetLongExisting() {
        props.put("key", new Long(100L));
        assertEquals(100L, props.getLong("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissingThrows() {
        props.getLong("missing");
    }

    @Test
    public void testGetLongFromStringParses() {
        props.put("key", "100");
        assertEquals(100L, props.getLong("key", 0L));
    }

    @Test
    public void testGetLongWithDefault() {
        assertEquals(55L, props.getLong("missing", 55L));
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongWrongTypeThrows() {
        props.put("key", Boolean.TRUE);
        props.getLong("key", 0L);
    }

    // ---------------- getFloat ----------------

    @Test
    public void testGetFloatExisting() {
        props.put("key", new Float(1.5f));
        assertEquals(1.5f, props.getFloat("key"), 0.001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissingThrows() {
        props.getFloat("missing");
    }

    @Test
    public void testGetFloatFromStringParses() {
        props.put("key", "2.5");
        assertEquals(2.5f, props.getFloat("key", 0f), 0.001);
    }

    @Test
    public void testGetFloatWithDefault() {
        assertEquals(3.3f, props.getFloat("missing", 3.3f), 0.001);
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloatWrongTypeThrows() {
        props.put("key", Boolean.TRUE);
        props.getFloat("key", 0f);
    }

    // ---------------- getDouble ----------------

    @Test
    public void testGetDoubleExisting() {
        props.put("key", new Double(1.23));
        assertEquals(1.23, props.getDouble("key"), 0.001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissingThrows() {
        props.getDouble("missing");
    }

    @Test
    public void testGetDoubleFromStringParses() {
        props.put("key", "4.56");
        assertEquals(4.56, props.getDouble("key", 0d), 0.001);
    }

    @Test
    public void testGetDoubleWithDefault() {
        assertEquals(7.89, props.getDouble("missing", 7.89), 0.001);
    }

    @Test(expected = ClassCastException.class)
    public void testGetDoubleWrongTypeThrows() {
        props.put("key", Boolean.TRUE);
        props.getDouble("key", 0d);
    }

    // ---------------- convertProperties ----------------

    @Test
    public void testConvertPropertiesFromPlainProperties() {
        Properties p = new Properties();
        p.setProperty("k1", "v1");
        p.setProperty("k2", "v2");
        ExtendedProperties ep = ExtendedProperties.convertProperties(p);
        assertEquals("v1", ep.getString("k1"));
        assertEquals("v2", ep.getString("k2"));
    }

    // ---------------- putAll ----------------

    @Test
    public void testPutAllWithExtendedPropertiesSource() {
        ExtendedProperties src = new ExtendedProperties();
        src.addProperty("k1", "v1");
        src.addProperty("k2", "v2");
        props.putAll(src);
        assertEquals("v1", props.get("k1"));
        assertEquals("v2", props.get("k2"));
    }

    @Test
    public void testPutAllWithPlainMapSource() {
        HashMap map = new HashMap();
        map.put("k1", "v1");
        props.putAll(map);
        assertEquals("v1", props.get("k1"));
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอด (SUT) | Test Method (ตัวอย่าง) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Constructor | testConstructorWithNonExistentFileThrows / testConstructorWithValidFile / testConstructorWithDefaultFile | FileInputStream สำเร็จ/ล้มเหลว, defaultFile null/not-null |
| getInclude/setInclude | testGetIncludeDefault / testSetIncludeNullMeansDisabled / testSetIncludeEmptyMeansDisabled / testSetIncludeCustomValue | includePropertyName == null, equals(""), ค่าปกติ |
| load(InputStream,enc) | testLoadWithValidEncoding / testLoadWithUnsupportedEncodingFallsBackTo8859 | enc != null สำเร็จ/ล้มเหลว → fallback 8859_1 |
| load() parsing | testLoadCommentsAndBlankLinesSkipped, testLoadMultiLineContinuation, testLoadLineWithoutEqualsIgnored, testLoadEmptyValueIgnored, testLoadDuplicateKeysBecomeList | equalSign>0/else, value=="" continue, endsWithSlash true/false, key ซ้ำ |
| load() include | testLoadIncludeAbsolutePath, testLoadIncludeNonExistentFileIgnored, testLoadIncludeDisabledWhenIncludeNameIsNull | includeProperty!=null/==null, path absolute, file.exists() true/false |
| getProperty | testGetPropertyFromOwnStore, testGetPropertyMissingNoDefaultsReturnsNull, testGetPropertyFallsBackToDefaults | obj!=null, obj==null&&defaults!=null/==null |
| addProperty | testAddPropertySingleValueNoComma, testAddPropertyCommaSeparatedBecomesList, testAddPropertyEscapedCommaKeptAsOneToken, testAddPropertyDuplicateKeyAccumulates, testAddPropertyNonStringValueStoredDirectly | indexOf(',')>0 true/false, value instanceof String/else, current null/String/List |
| setProperty | testSetPropertyReplacesExisting | clearProperty+addProperty เรียกถูกต้อง |
| save | testSaveWithNullOutputStreamReturnsImmediately...testSaveSkipsNonStringNonListValue | output==null, header!=null/null, value String/List/other |
| combine | testCombineOverwritesExistingValue | loop + overwrite |
| clearProperty | testClearPropertyExistingKeyRemovesFromKeysAsListed, testClearPropertyNonExistingKeyIsNoOp | containsKey true/false |
| getKeys/getKeys(prefix) | testGetKeysPreservesInsertOrder, testGetKeysWithPrefixMatch/NoMatch | startsWith true/false |
| subset | testSubsetValidReturnsSubProperties, testSubsetKeyExactlyEqualsPrefix, testSubsetNoMatchReturnsNull | validSubset true/false, key.length()==prefix.length() true/false |
| getString | testGetStringWithStringValue...testGetStringInterpolationInfiniteLoopThrows | value String/List/null(+defaults)/other, interpolation loop/missing var |
| getProperties | testGetPropertiesValidTokens, testGetPropertiesMalformedTokenThrows, testGetPropertiesWithDefaultsProperties | equalSign>0/else |
| getStringArray | testGetStringArray* | value String/List/null(+defaults/no)/other |
| getVector / getList | testGetVector* / testGetList* | value List/String/null(+default/no default)/other |
| getBoolean / testBoolean | testGetBoolean* / testTestBoolean* | Boolean/String(valid/invalid)/null(+defaults)/other, true/false/off/on/yes/no |
| getByte/getShort/getInteger/getLong/getFloat/getDouble | testGet<Type>* | ตรงชนิด/String parse/null(+default)/other-type CCE/NFE |
| convertProperties | testConvertPropertiesFromPlainProperties | loop properties |
| putAll | testPutAllWithExtendedPropertiesSource / testPutAllWithPlainMapSource | map instanceof ExtendedProperties true/false |

**ข้อจำกัดที่ระบุไว้ (ไม่เดา behavior):**
- Branch fallback ไปยัง default-platform-encoding เมื่อ `8859_1` ไม่รองรับ ไม่สามารถทดสอบได้จริงเพราะ JVM มาตรฐานรองรับ encoding นี้เสมอ
- Branch ที่ key ใน `keysAsListed`/`getKeys()` ไม่เป็น instance ของ `String` ไม่สามารถ trigger ได้ผ่าน public API เนื่องจาก `addPropertyDirect`/`addPropertyInternal` ถูกเรียกด้วย `String key` เท่านั้นในซอร์สที่ให้มา
- `testLoadIncludeAbsolutePath` สมมติว่า `fileSeparator` เป็น `"/"` (Unix-like environment)