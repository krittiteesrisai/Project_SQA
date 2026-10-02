package org.apache.commons.collections;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import org.apache.commons.collections.ExtendedProperties; // same package, import แบบ explicit ตาม requirement

public class ExtendedPropertiesTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    private ExtendedProperties props;

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    // ---------- helper ----------

    private File writeFile(String name, String content) throws IOException {
        File f = folder.newFile(name);
        FileWriter w = new FileWriter(f);
        try {
            w.write(content);
        } finally {
            w.close();
        }
        return f;
    }

    /** ใช้ reflection เพื่อฉีด defaults object (private field) สำหรับเทสสั้น ๆ โดยไม่ต้องสร้างไฟล์จริง */
    private void injectDefaults(ExtendedProperties target, ExtendedProperties defaults) throws Exception {
        Field f = ExtendedProperties.class.getDeclaredField("defaults");
        f.setAccessible(true);
        f.set(target, defaults);
    }

    // =====================================================================
    // Constructor / isInitialized / include property
    // =====================================================================

    @Test
    public void testDefaultConstructor_notInitialized() {
        assertFalse(props.isInitialized());
        assertNotNull(props.getKeys());
        assertFalse(props.getKeys().hasNext());
    }

    @Test
    public void testConstructor_fileOnly_loadsAndSetsInitialized() throws IOException {
        File f = writeFile("simple.properties", "key1 = value1\n");
        ExtendedProperties p = new ExtendedProperties(f.getAbsolutePath());
        assertTrue(p.isInitialized());
        assertEquals("value1", p.getString("key1"));
    }

    @Test
    public void testConstructor_fileAndDefaultFile_chainsDefaults() throws IOException {
        File def = writeFile("def.properties", "onlyIndefault = fromDefault\n");
        File main = writeFile("main.properties", "key1 = value1\n");
        ExtendedProperties p = new ExtendedProperties(main.getAbsolutePath(), def.getAbsolutePath());
        assertEquals("value1", p.getString("key1"));
        // key ไม่มีใน main แต่มีใน default -> ต้องหลุดไป defaults.getString branch
        assertEquals("fromDefault", p.getString("onlyIndefault"));
    }

    @Test
    public void testGetInclude_defaultValue() {
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testSetInclude_null_thenGetIncludeReturnsNull() {
        props.setInclude(null);
        assertNull(props.getInclude());
    }

    @Test
    public void testSetInclude_emptyString_thenGetIncludeReturnsNull() {
        props.setInclude("");
        assertNull(props.getInclude());
    }

    @Test
    public void testSetInclude_customName() {
        props.setInclude("myInclude");
        assertEquals("myInclude", props.getInclude());
    }

    // =====================================================================
    // load(InputStream) / load(InputStream,enc) branches
    // =====================================================================

    @Test
    public void testLoad_commentsAndBlankLinesSkipped() throws IOException {
        String content = "# comment line\n\nkey1 = value1\nkey2=value2\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2", props.getString("key2"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testLoad_lineWithoutEqualSign_isIgnored() throws IOException {
        String content = "noEqualSignHere\nkey=val\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("val", props.getString("key"));
        assertNull(props.getProperty("noEqualSignHere"));
    }

    @Test
    public void testLoad_equalSignAtPositionZero_isIgnored() throws IOException {
        String content = "=valueOnly\nkey=val\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        // equalSign == 0 ไม่ถือว่า > 0 จึงถูกข้าม ไม่มี key ว่างถูกเพิ่ม
        assertEquals("val", props.getString("key"));
    }

    @Test
    public void testLoad_emptyValueAfterTrim_isSkipped() throws IOException {
        String content = "key1 =    \nkey2=value2\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        assertNull(props.getProperty("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testLoad_multilineContinuationWithBackslash() throws IOException {
        String content = "key = part1 \\\npart2\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("part1 part2", props.getString("key"));
    }

    @Test
    public void testLoad_duplicateKeyBecomesListOfValues() throws IOException {
        String content = "key = val1\nkey = val2\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        String[] arr = props.getStringArray("key");
        assertEquals(2, arr.length);
        assertEquals("val1", arr[0]);
        assertEquals("val2", arr[1]);
    }

    @Test
    public void testLoad_withInvalidEncoding_fallsBackToIso8859() throws IOException {
        String content = "key=value\n";
        // enc ไม่ถูกต้อง -> UnsupportedEncodingException ถูก catch ภายใน -> ตกไปใช้ ISO8859_1
        props.load(new ByteArrayInputStream(content.getBytes()), "this-is-not-a-real-encoding");
        assertEquals("value", props.getString("key"));
    }

    @Test
    public void testLoad_includeKeyIgnoredWhenIncludeDisabled() throws IOException {
        props.setInclude(null); // getInclude() -> null -> includeProperty branch ปิด
        String content = "include = something.properties\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        // ถือเป็น property ปกติเพราะ includeProperty เป็น null
        assertEquals("something.properties", props.getString("include"));
    }

    @Test
    public void testLoad_includeFileNotExisting_isSkippedSilently() throws IOException {
        props.basePath = folder.getRoot().getAbsolutePath() + props.fileSeparator;
        String content = "include = does-not-exist.properties\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        // ไฟล์ include ไม่มีจริง -> ไม่ add เป็น property เลย (ทั้ง include เองก็ไม่ถูกเก็บ)
        assertNull(props.getProperty("include"));
    }

    @Test
    public void testLoad_includeRelativeFile_isLoadedRecursively() throws IOException {
        writeFile("child.properties", "childKey = childValue\n");
        props.basePath = folder.getRoot().getAbsolutePath() + props.fileSeparator;
        String content = "include = child.properties\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("childValue", props.getString("childKey"));
        assertNull(props.getProperty("include")); // include ไม่ถูกเก็บเป็น property ปกติ
    }

    @Test
    public void testLoad_includeWithDotSlashPrefix_stripsPrefix() throws IOException {
        writeFile("child2.properties", "childKey2 = v2\n");
        props.basePath = folder.getRoot().getAbsolutePath() + props.fileSeparator;
        String content = "include = ." + props.fileSeparator + "child2.properties\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("v2", props.getString("childKey2"));
    }

    @Test
    public void testLoad_includeAbsolutePath_unixOnly() throws IOException {
        Assume.assumeTrue(File.separator.equals("/")); // branch ขึ้นกับ OS ข้ามบน Windows
        File childAbs = writeFile("childAbs.properties", "absKey = absVal\n");
        props.basePath = folder.getRoot().getAbsolutePath() + props.fileSeparator;
        String content = "include = " + childAbs.getAbsolutePath() + "\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("absVal", props.getString("absKey"));
    }

    // =====================================================================
    // addProperty / addPropertyInternal / tokenizer / escape-unescape (indirect)
    // =====================================================================

    @Test
    public void testAddProperty_simpleStringNoComma() {
        props.addProperty("k", "value");
        assertEquals("value", props.getString("k"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testAddProperty_commaSeparatedBecomesTwoTokens() {
        props.addProperty("k", "x,y");
        String[] arr = props.getStringArray("k");
        assertEquals(2, arr.length);
        assertEquals("x", arr[0]);
        assertEquals("y", arr[1]);
    }

    @Test
    public void testAddProperty_escapedCommaStaysAsSingleToken() {
        String value = "a" + "\\" + ",b"; // ตัวอักษรจริง: a \ , b  (comma ถูก escape)
        props.addProperty("k", value);
        assertEquals("a,b", props.getString("k"));
    }

    @Test
    public void testAddProperty_doubleBackslashCollapsesToOne() {
        String twoBackslashesThenB = "\\" + "\\" + "b"; // 2 backslash จริง + 'b'
        props.addProperty("k", twoBackslashesThenB);
        String expected = "\\" + "b"; // backslash จริง 1 ตัว + 'b'
        assertEquals(expected, props.getString("k"));
    }

    @Test
    public void testAddProperty_duplicateKeyStringBecomesVector() {
        props.addProperty("k", "v1");
        props.addProperty("k", "v2");
        String[] arr = props.getStringArray("k");
        assertEquals(2, arr.length);
        assertEquals("v1", arr[0]);
        assertEquals("v2", arr[1]);
    }

    @Test
    public void testAddProperty_thirdDuplicate_appendsToExistingList() {
        props.addProperty("k", "v1");
        props.addProperty("k", "v2");
        props.addProperty("k", "v3");
        assertEquals(3, props.getStringArray("k").length);
    }

    @Test
    public void testAddProperty_nonStringValue_storedDirectly() {
        props.addProperty("k", new Integer(42));
        assertEquals(new Integer(42), props.getProperty("k"));
    }

    @Test
    public void testSetProperty_overwritesInsteadOfAppending() {
        props.addProperty("k", "v1");
        props.setProperty("k", "v2");
        assertEquals("v2", props.getString("k"));
        // ต้องเป็น String เดี่ยว ไม่ใช่ list เพราะ setProperty clear ก่อน add
        assertEquals(1, props.getStringArray("k").length);
    }

    // =====================================================================
    // clearProperty / getKeys / getKeys(prefix)
    // =====================================================================

    @Test
    public void testClearProperty_existingKey_removesFromMapAndOrderList() {
        props.addProperty("a", "1");
        props.addProperty("b", "2");
        props.clearProperty("a");
        assertFalse(props.containsKey("a"));
        Iterator it = props.getKeys();
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testClearProperty_nonExistingKey_isNoOp() {
        props.addProperty("a", "1");
        props.clearProperty("doesNotExist");
        assertTrue(props.containsKey("a"));
    }

    @Test
    public void testGetKeys_prefixFilter() {
        props.addProperty("db.driver", "x");
        props.addProperty("db.url", "y");
        props.addProperty("other", "z");
        Iterator it = props.getKeys("db");
        int count = 0;
        while (it.hasNext()) {
            String k = (String) it.next();
            assertTrue(k.startsWith("db"));
            count++;
        }
        assertEquals(2, count);
    }

    // =====================================================================
    // subset()
    // =====================================================================

    @Test
    public void testSubset_validSubset_stripsPrefix() {
        props.addProperty("db.driver", "x");
        props.addProperty("db.url", "y");
        props.addProperty("other", "z");
        ExtendedProperties sub = props.subset("db");
        assertNotNull(sub);
        assertEquals("x", sub.getString("driver"));
        assertEquals("y", sub.getString("url"));
        assertNull(sub.getProperty("other"));
    }

    @Test
    public void testSubset_noMatchingKey_returnsNull() {
        props.addProperty("other", "z");
        assertNull(props.subset("db"));
    }

    @Test
    public void testSubset_keyExactlyEqualsPrefix() {
        props.addProperty("prefix", "onlyvalue");
        ExtendedProperties sub = props.subset("prefix");
        assertNotNull(sub);
        assertEquals("onlyvalue", sub.getString("prefix"));
    }

    // =====================================================================
    // getString / interpolate
    // =====================================================================

    @Test
    public void testGetString_simpleValue() {
        props.addProperty("k", "v");
        assertEquals("v", props.getString("k"));
    }

    @Test
    public void testGetString_missingKey_noDefaults_returnsNullDefault() {
        assertNull(props.getString("missing"));
    }

    @Test
    public void testGetString_missingKey_withDefaultValueParam() {
        assertEquals("fallback", props.getString("missing", "fallback"));
    }

    @Test
    public void testGetString_listValue_returnsFirstElement() {
        props.addProperty("k", "a,b");
        assertEquals("a", props.getString("k"));
    }

    @Test
    public void testGetString_wrongType_throwsClassCastException() {
        props.put("k", new Integer(5)); // ไม่ใช่ String/List -> ClassCastException
        try {
            props.getString("k");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) {
            // ok
        }
    }

    @Test
    public void testGetString_interpolatesVariable() {
        props.addProperty("name", "world");
        props.addProperty("greeting", "Hello ${name}!");
        assertEquals("Hello world!", props.getString("greeting"));
    }

    @Test
    public void testGetString_interpolateUndefinedVariable_keepsPlaceholder() {
        props.addProperty("x", "${undefined}");
        assertEquals("${undefined}", props.getString("x"));
    }

    @Test
    public void testGetString_interpolateInfiniteLoop_throwsIllegalStateException() {
        props.addProperty("a", "${b}");
        props.addProperty("b", "${a}");
        try {
            props.getString("a");
            fail("ควร throw IllegalStateException สำหรับ loop");
        } catch (IllegalStateException expected) {
            // ok
        }
    }

    @Test
    public void testGetString_missingKey_withDefaultsObject() throws Exception {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "fromDefaults");
        injectDefaults(props, defaults);
        assertEquals("fromDefaults", props.getString("k"));
    }

    // =====================================================================
    // getProperty
    // =====================================================================

    @Test
    public void testGetProperty_missingNoDefaults_returnsNull() {
        assertNull(props.getProperty("missing"));
    }

    @Test
    public void testGetProperty_missingWithDefaults_fallsThrough() throws Exception {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "d");
        injectDefaults(props, defaults);
        assertEquals("d", props.getProperty("k"));
    }

    // =====================================================================
    // getProperties(key[,defaults])
    // =====================================================================

    @Test
    public void testGetProperties_valid() {
        props.addProperty("k", "a=1,b=2");
        Properties p = props.getProperties("k");
        assertEquals("1", p.getProperty("a"));
        assertEquals("2", p.getProperty("b"));
    }

    @Test
    public void testGetProperties_malformedToken_throwsIllegalArgument() {
        props.addProperty("k", "noEquals");
        try {
            props.getProperties("k");
            fail("ควร throw IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    // =====================================================================
    // getStringArray
    // =====================================================================

    @Test
    public void testGetStringArray_fromSingleString() {
        props.addProperty("k", "onlyone");
        String[] arr = props.getStringArray("k");
        assertEquals(1, arr.length);
        assertEquals("onlyone", arr[0]);
    }

    @Test
    public void testGetStringArray_missingNoDefaults_emptyArray() {
        String[] arr = props.getStringArray("missing");
        assertEquals(0, arr.length);
    }

    @Test
    public void testGetStringArray_missingWithDefaults() throws Exception {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "d1,d2");
        injectDefaults(props, defaults);
        assertEquals(2, props.getStringArray("k").length);
    }

    @Test
    public void testGetStringArray_wrongType_throws() {
        props.put("k", new Integer(1));
        try {
            props.getStringArray("k");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) {
            // ok
        }
    }

    // =====================================================================
    // getVector
    // =====================================================================

    @Test
    public void testGetVector_fromList() {
        props.addProperty("k", "a,b");
        Vector v = props.getVector("k");
        assertEquals(2, v.size());
    }

    @Test
    public void testGetVector_fromSingleString_convertsAndStores() {
        props.addProperty("k", "single");
        Vector v = props.getVector("k");
        assertEquals(1, v.size());
        assertEquals("single", v.get(0));
    }

    @Test
    public void testGetVector_missing_noDefaultValue_returnsEmptyVector() {
        Vector v = props.getVector("missing", null);
        assertNotNull(v);
        assertTrue(v.isEmpty());
    }

    @Test
    public void testGetVector_missing_withDefaultValue_returnsThatDefault() {
        Vector def = new Vector();
        def.add("x");
        Vector v = props.getVector("missing", def);
        assertSame(def, v);
    }

    @Test
    public void testGetVector_missing_withDefaultsObject() throws Exception {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "d1,d2");
        injectDefaults(props, defaults);
        assertEquals(2, props.getVector("k", null).size());
    }

    @Test
    public void testGetVector_wrongType_throws() {
        props.put("k", new Integer(1));
        try {
            props.getVector("k");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) {
            // ok
        }
    }

    // =====================================================================
    // getList
    // =====================================================================

    @Test
    public void testGetList_fromList() {
        props.addProperty("k", "a,b");
        List l = props.getList("k");
        assertEquals(2, l.size());
    }

    @Test
    public void testGetList_fromSingleString() {
        props.addProperty("k", "single");
        List l = props.getList("k");
        assertEquals(1, l.size());
    }

    @Test
    public void testGetList_missing_noDefaultValue_returnsEmptyList() {
        List l = props.getList("missing", null);
        assertTrue(l.isEmpty());
    }

    @Test
    public void testGetList_missing_withDefaultValue() {
        List def = new java.util.ArrayList();
        def.add("y");
        List l = props.getList("missing", def);
        assertSame(def, l);
    }

    @Test
    public void testGetList_wrongType_throws() {
        props.put("k", new Integer(1));
        try {
            props.getList("k");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) {
            // ok
        }
    }

    // =====================================================================
    // getBoolean / testBoolean
    // =====================================================================

    @Test
    public void testTestBoolean_variants() {
        assertEquals("true", props.testBoolean("true"));
        assertEquals("true", props.testBoolean("ON"));
        assertEquals("true", props.testBoolean("Yes"));
        assertEquals("false", props.testBoolean("false"));
        assertEquals("false", props.testBoolean("OFF"));
        assertEquals("false", props.testBoolean("No"));
        assertNull(props.testBoolean("notaboolean"));
    }

    @Test
    public void testGetBoolean_alreadyBooleanInstance() {
        props.put("k", Boolean.TRUE);
        assertTrue(props.getBoolean("k"));
    }

    @Test
    public void testGetBoolean_fromValidString() {
        props.addProperty("k", "yes");
        assertTrue(props.getBoolean("k"));
    }

    @Test
    public void testGetBoolean_fromInvalidString_returnsFalse() {
        // ยืนยันจากซอร์ส: testBoolean คืน null -> new Boolean(null) = false (ไม่ throw)
        props.addProperty("k", "notaboolean");
        assertFalse(props.getBoolean("k", true));
    }

    @Test
    public void testGetBoolean_missingNoDefault_throwsNoSuchElement() {
        try {
            props.getBoolean("missing");
            fail("ควร throw NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // ok
        }
    }

    @Test
    public void testGetBoolean_missingWithPrimitiveDefault() {
        assertTrue(props.getBoolean("missing", true));
    }

    @Test
    public void testGetBoolean_missingWithDefaultsObject() throws Exception {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "true");
        injectDefaults(props, defaults);
        assertTrue(props.getBoolean("k", false));
    }

    @Test
    public void testGetBoolean_wrongType_throws() {
        props.put("k", "notaboolean".getClass() == String.class ? new Integer(1) : null);
        try {
            props.getBoolean("k");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) {
            // ok
        }
    }

    // =====================================================================
    // ตัวเลข: getInteger เต็มทุก branch (เป็นตัวแทนของ getByte/Short/Long/Float/Double)
    // =====================================================================

    @Test
    public void testGetInteger_alreadyIntegerInstance() {
        props.put("k", new Integer(5));
        assertEquals(5, props.getInt("k"));
    }

    @Test
    public void testGetInteger_fromValidString() {
        props.addProperty("k", "42");
        assertEquals(42, props.getInt("k"));
    }

    @Test
    public void testGetInteger_fromInvalidString_throwsNumberFormat() {
        props.addProperty("k", "notanumber");
        try {
            props.getInt("k");
            fail("ควร throw NumberFormatException");
        } catch (NumberFormatException expected) {
            // ok
        }
    }

    @Test
    public void testGetInteger_missingNoDefault_throwsNoSuchElement() {
        try {
            props.getInt("missing");
            fail("ควร throw NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // ok
        }
    }

    @Test
    public void testGetInteger_missingWithPrimitiveDefault() {
        assertEquals(99, props.getInt("missing", 99));
    }

    @Test
    public void testGetInteger_missingWithDefaultsObject() throws Exception {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "7");
        injectDefaults(props, defaults);
        assertEquals(7, props.getInt("k", 0));
    }

    @Test
    public void testGetInteger_wrongType_throwsClassCast() {
        props.put("k", Boolean.TRUE);
        try {
            props.getInt("k");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) {
            // ok
        }
    }

    // =====================================================================
    // ตัวเลขอื่น ๆ: byte/short/long/float/double (ทดสอบ branch หลัก ๆ แบบย่อ)
    // =====================================================================

    @Test
    public void testGetByte_stringParseAndWrongTypeAndMissingDefault() {
        props.addProperty("k1", "5");
        assertEquals((byte) 5, props.getByte("k1"));

        assertEquals((byte) 9, props.getByte("missing", (byte) 9));

        props.put("k2", Boolean.TRUE);
        try {
            props.getByte("k2");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) { /* ok */ }
    }

    @Test
    public void testGetShort_stringParseAndWrongTypeAndMissingDefault() {
        props.addProperty("k1", "5");
        assertEquals((short) 5, props.getShort("k1"));

        assertEquals((short) 9, props.getShort("missing", (short) 9));

        props.put("k2", Boolean.TRUE);
        try {
            props.getShort("k2");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) { /* ok */ }
    }

    @Test
    public void testGetLong_stringParseAndWrongTypeAndMissingDefault() {
        props.addProperty("k1", "12345");
        assertEquals(12345L, props.getLong("k1"));

        assertEquals(9L, props.getLong("missing", 9L));

        props.put("k2", Boolean.TRUE);
        try {
            props.getLong("k2");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) { /* ok */ }
    }

    @Test
    public void testGetFloat_stringParseAndWrongTypeAndMissingDefault() {
        props.addProperty("k1", "1.5");
        assertEquals(1.5f, props.getFloat("k1"), 0.0001f);

        assertEquals(9.0f, props.getFloat("missing", 9.0f), 0.0001f);

        props.put("k2", Boolean.TRUE);
        try {
            props.getFloat("k2");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) { /* ok */ }
    }

    @Test
    public void testGetDouble_stringParseAndWrongTypeAndMissingDefault() {
        props.addProperty("k1", "2.5");
        assertEquals(2.5d, props.getDouble("k1"), 0.0001d);

        assertEquals(9.0d, props.getDouble("missing", 9.0d), 0.0001d);

        props.put("k2", Boolean.TRUE);
        try {
            props.getDouble("k2");
            fail("ควร throw ClassCastException");
        } catch (ClassCastException expected) { /* ok */ }
    }

    // =====================================================================
    // save()
    // =====================================================================

    @Test
    public void testSave_outputNull_isNoOp() throws IOException {
        // ไม่ throw, คืนทันที
        props.save(null, "header");
    }

    @Test
    public void testSave_withHeaderAndStringValue() throws IOException {
        props.addProperty("k", "v");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, "MY HEADER");
        String out = baos.toString();
        assertTrue(out.contains("MY HEADER"));
        assertTrue(out.contains("k=v"));
    }

    @Test
    public void testSave_withoutHeader() throws IOException {
        props.addProperty("k", "v");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, null);
        String out = baos.toString();
        assertTrue(out.contains("k=v"));
    }

    @Test
    public void testSave_listValue_writesMultipleLines() throws IOException {
        props.addProperty("k", "a,b");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, null);
        String out = baos.toString();
        assertTrue(out.contains("k=a"));
        assertTrue(out.contains("k=b"));
    }

    @Test
    public void testSave_escapesCommaInValue() throws IOException {
        String value = "a" + "\\" + ",b"; // เก็บเป็น String เดี่ยว "a,b" (comma จริง)
        props.addProperty("k", value);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, null);
        String out = baos.toString();
        String expectedEscaped = "k=a" + "\\" + ",b";
        assertTrue(out.contains(expectedEscaped));
    }

    // =====================================================================
    // combine / putAll / put / remove / convertProperties
    // =====================================================================

    @Test
    public void testCombine_overwritesAndAddsKeys() {
        props.addProperty("a", "1");
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("a", "2");
        other.addProperty("b", "3");
        props.combine(other);
        assertEquals("2", props.getString("a"));
        assertEquals("3", props.getString("b"));
    }

    @Test
    public void testPutAll_withPlainMap() {
        Map map = new HashMap();
        map.put("k", "v");
        props.putAll(map);
        assertEquals("v", props.getString("k"));
    }

    @Test
    public void testPutAll_withExtendedProperties_preservesOrder() {
        ExtendedProperties src = new ExtendedProperties();
        src.addProperty("first", "1");
        src.addProperty("second", "2");
        props.putAll(src);
        Iterator it = props.getKeys();
        assertEquals("first", it.next());
        assertEquals("second", it.next());
    }

    @Test
    public void testPut_firstTimeReturnsNull_thenReturnsOldValue() {
        Object old1 = props.put("k", "v1");
        assertNull(old1);
        Object old2 = props.put("k", "v2");
        assertEquals("v1", old2);
        // พฤติกรรมจริง: addProperty ไม่ overwrite แต่ concat กลายเป็น list
        assertEquals(2, props.getStringArray("k").length);
    }

    @Test
    public void testRemove_returnsOldValueAndClearsKey() {
        props.addProperty("k", "v");
        Object old = props.remove("k");
        assertEquals("v", old);
        assertNull(props.getProperty("k"));
        assertFalse(props.containsKey("k"));
    }

    @Test
    public void testConvertProperties_copiesAllKeys() {
        Properties p = new Properties();
        p.setProperty("a", "1");
        p.setProperty("b", "2");
        ExtendedProperties ep = ExtendedProperties.convertProperties(p);
        assertEquals("1", ep.getString("a"));
        assertEquals("2", ep.getString("b"));
    }

    // =====================================================================
    // display() - เพียงให้ครอบคลุม loop โดยไม่ throw
    // =====================================================================

    @Test
    public void testDisplay_doesNotThrow() {
        props.addProperty("k", "v");
        props.display();
    }
}
