package org.apache.commons.collections;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 * JUnit4 tests for org.apache.commons.collections.ExtendedProperties
 * (Defects4J: Collections-2b)
 *
 * หมายเหตุ: test class ถูกวางไว้ package เดียวกับคลาสเป้าหมาย
 * เพื่อให้เข้าถึง package-private nested class (PropertiesReader, PropertiesTokenizer)
 * และ protected field ได้โดยตรง สำหรับทดสอบ branch ที่ลึกที่สุด
 */
public class ExtendedPropertiesTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    private ExtendedProperties ep;

    @Before
    public void setUp() {
        ep = new ExtendedProperties();
    }

    @After
    public void tearDown() {
        // 'include' เป็น static field ใน class เป้าหมาย - reset กลับเป็นค่า default
        // เพื่อไม่ให้กระทบ test อื่น (ป้องกัน test-order dependency)
        ExtendedProperties.include = "include";
    }

    // ---------- helper ----------
    private File writeFile(String name, String content) throws IOException {
        File f = folder.newFile(name);
        try (FileWriter fw = new FileWriter(f)) {
            fw.write(content);
        }
        return f;
    }

    private InputStream asStream(String s) {
        return new ByteArrayInputStream(s.getBytes());
    }

    // =========================================================
    // Constructors
    // =========================================================

    @Test
    public void testDefaultConstructor() {
        ExtendedProperties p = new ExtendedProperties();
        assertFalse(p.isInitialized());
        assertNotNull(p.getKeys());
    }

    @Test
    public void testFileConstructor_basic() throws IOException {
        File f = writeFile("basic.properties", "key=value\n");
        ExtendedProperties p = new ExtendedProperties(f.getAbsolutePath());
        assertEquals("value", p.getString("key"));
        assertTrue(p.isInitialized());
    }

    @Test(expected = IOException.class)
    public void testFileConstructor_fileNotFound() throws IOException {
        new ExtendedProperties(folder.getRoot().getAbsolutePath() + File.separator + "no_such_file.properties");
    }

    @Test
    public void testFileConstructor_withDefaultFile_delegatesMultipleGetters() throws IOException {
        // defaults file
        File defFile = writeFile("defaults.properties",
                "str=defaultStr\n" +
                "listval=a,b,c\n" +
                "boolval=true\n" +
                "intval=42\n" +
                "dblval=3.14\n");
        // parent file - ไม่มี key ซ้ำกับ defaults
        File parentFile = writeFile("parent.properties", "placeholder=1\n");

        ExtendedProperties p = new ExtendedProperties(parentFile.getAbsolutePath(), defFile.getAbsolutePath());

        // branch: value==null && defaults!=null  (ในหลาย getter)
        assertEquals("defaultStr", p.getString("str"));
        assertArrayEquals(new String[]{"a", "b", "c"}, p.getStringArray("listval"));
        assertEquals(new Vector<>(Arrays.asList("a", "b", "c")), p.getVector("listval"));
        assertEquals(Arrays.asList("a", "b", "c"), p.getList("listval"));
        assertTrue(p.getBoolean("boolval"));
        assertEquals(42, p.getInteger("intval").intValue());
        assertEquals(3.14, p.getDouble("dblval"), 0.0001);
        assertEquals("defaultStr", p.getProperty("str")); // getProperty ก็ fallback ไป defaults.get()
        // key ที่มีใน parent เอง ต้องไม่ไปยุ่งกับ defaults
        assertEquals("1", p.getString("placeholder"));
    }

    // =========================================================
    // getInclude / setInclude (static field caveat)
    // =========================================================

    @Test
    public void testGetInclude_defaultIsInclude() {
        assertEquals("include", ep.getInclude());
    }

    @Test
    public void testSetInclude_changesStaticField() {
        ep.setInclude("import");
        assertEquals("import", ep.getInclude());
        // tearDown() จะ reset ค่ากลับ
    }

    // =========================================================
    // load() branches
    // =========================================================

    @Test
    public void testLoad_basicKeyValue() throws IOException {
        ep.load(asStream("key=value\n"));
        assertEquals("value", ep.getString("key"));
        assertTrue(ep.isInitialized());
    }

    @Test
    public void testLoad_commentLineSkipped() throws IOException {
        ep.load(asStream("#comment line\nkey=value\n"));
        assertEquals("value", ep.getString("key"));
        assertNull(ep.get("#comment line"));
    }

    @Test
    public void testLoad_blankLineSkipped() throws IOException {
        ep.load(asStream("\n\nkey=value\n"));
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testLoad_multilineContinuation() throws IOException {
        // "aaa\" + newline + "bbb" -> single trailing backslash = continuation
        ep.load(asStream("longkey=aaa\\\nbbb\n"));
        assertEquals("aaabbb", ep.getString("longkey"));
    }

    @Test
    public void testLoad_lineWithoutEqualsSignSkipped() throws IOException {
        ep.load(asStream("justatoken\nkey=value\n"));
        assertEquals("value", ep.getString("key"));
        assertFalse(ep.getKeys().hasNext() == false); // มีอย่างน้อย key เดียว
    }

    @Test
    public void testLoad_emptyValueSkipped() throws IOException {
        ep.load(asStream("key=\nkey2=value2\n"));
        assertNull(ep.get("key"));
        assertEquals("value2", ep.getString("key2"));
    }

    @Test
    public void testLoad_commaSeparatedValues_buildsListViaAddPropertyInternal() throws IOException {
        ep.load(asStream("key=a,b,c\n"));
        assertArrayEquals(new String[]{"a", "b", "c"}, ep.getStringArray("key"));
    }

    @Test
    public void testLoad_escapedCommaKeptInSingleToken() throws IOException {
        // "a\,b,c" -> backslash-escaped comma; token1 = "a,b" (comma preserved), token2 = "c"
        ep.load(asStream("key=a\\,b,c\n"));
        assertArrayEquals(new String[]{"a,b", "c"}, ep.getStringArray("key"));
    }

    @Test
    public void testLoad_withValidEncoding() throws IOException {
        ep.load(asStream("key=value\n"), "UTF-8");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testLoad_withInvalidEncodingFallsBackTo8859_1() throws IOException {
        ep.load(asStream("key=value\n"), "this-is-not-a-real-encoding");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testLoad_includeRelativePath() throws IOException {
        writeFile("child.properties", "childKey=childValue\n");
        File main = writeFile("main.properties", "include=child.properties\nkey=value\n");
        ExtendedProperties p = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("childValue", p.getString("childKey"));
        assertEquals("value", p.getString("key"));
        assertNull(p.get("include")); // include key ไม่ถูกเก็บเป็น property
    }

    @Test
    public void testLoad_includeDotSlashPath() throws IOException {
        writeFile("child2.properties", "childKey2=childValue2\n");
        File main = writeFile("main2.properties", "include=." + File.separator + "child2.properties\n");
        ExtendedProperties p = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("childValue2", p.getString("childKey2"));
    }

    @Test
    public void testLoad_includeAbsolutePath() throws IOException {
        // สมมติ environment เป็น unix-like ที่ absolute path เริ่มด้วย fileSeparator
        // ถ้า OS เป็น Windows-drive-letter อาจไม่เข้าเงื่อนไขนี้ (ข้อจำกัดของ source เอง)
        File child = writeFile("child3.properties", "childKey3=childValue3\n");
        String abs = child.getAbsolutePath();
        String sep = System.getProperty("file.separator");
        org.junit.Assume.assumeTrue("Skip on platforms where absolute path doesn't start with fileSeparator",
                abs.startsWith(sep));
        File main = writeFile("main3.properties", "include=" + abs + "\n");
        ExtendedProperties p = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("childValue3", p.getString("childKey3"));
    }

    @Test
    public void testLoad_includeFileNotExist_silentlySkipped() throws IOException {
        File main = writeFile("main4.properties", "include=doesnotexist.properties\nkey=value\n");
        ExtendedProperties p = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("value", p.getString("key"));
        // ไม่ throw exception, ไม่มีการเพิ่ม property จาก include
    }

    // =========================================================
    // getProperty
    // =========================================================

    @Test
    public void testGetProperty_userValuePresent() {
        ep.put("k", "v");
        assertEquals("v", ep.getProperty("k"));
    }

    @Test
    public void testGetProperty_nullWhenNoDefaultsAndKeyMissing() {
        assertNull(ep.getProperty("missing"));
    }

    // =========================================================
    // addProperty / addPropertyInternal branches
    // =========================================================

    @Test
    public void testAddProperty_simpleStringNoComma() {
        ep.addProperty("k", "v");
        assertEquals("v", ep.get("k"));
        assertTrue(ep.isInitialized());
    }

    @Test
    public void testAddProperty_commaSeparatedString_splitsAndUnescapes() {
        ep.addProperty("k", "a,b\\,c"); // token2 มี escaped comma ภายใน
        // token1="a" ; token2 ผ่าน PropertiesTokenizer จะรวม "b" กับ "c" กลับด้วย comma จริง -> "b,c"
        assertArrayEquals(new String[]{"a", "b,c"}, ep.getStringArray("k"));
    }

    @Test
    public void testAddProperty_nonStringValue_goesDirectToInternal() {
        Integer val = new Integer(5);
        ep.addProperty("k", val);
        assertEquals(val, ep.get("k"));
    }

    @Test
    public void testAddProperty_duplicateKey_stringToVector() {
        ep.addProperty("k", "first");
        ep.addProperty("k", "second");
        Object stored = ep.get("k");
        assertTrue(stored instanceof List);
        assertEquals(Arrays.asList("first", "second"), stored);
    }

    @Test
    public void testAddProperty_duplicateKey_listAppend() {
        ep.addProperty("k", "first");
        ep.addProperty("k", "second"); // ตอนนี้เป็น List แล้ว
        ep.addProperty("k", "third");  // ต้อง append เข้า List เดิม
        assertEquals(Arrays.asList("first", "second", "third"), ep.get("k"));
    }

    @Test
    public void testSetProperty_overwritesExisting() {
        ep.addProperty("k", "old1");
        ep.addProperty("k", "old2"); // -> List
        ep.setProperty("k", "new");
        assertEquals("new", ep.get("k"));
    }

    // =========================================================
    // interpolate / interpolateHelper
    // =========================================================

    @Test
    public void testInterpolate_resolvedVariable() {
        ep.addProperty("name", "${value}");
        ep.addProperty("value", "world");
        assertEquals("world", ep.getString("name"));
    }

    @Test
    public void testInterpolate_unresolvedVariableKeptAsToken() {
        ep.addProperty("x", "${undefinedKey}");
        assertEquals("${undefinedKey}", ep.getString("x"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolate_infiniteLoopThrowsIllegalStateException() {
        ep.addProperty("a", "${b}");
        ep.addProperty("b", "${a}");
        ep.getString("a");
    }

    @Test
    public void testInterpolate_noVariable_returnsAsIs() {
        ep.addProperty("plain", "just text");
        assertEquals("just text", ep.getString("plain"));
    }

    // =========================================================
    // getString
    // =========================================================

    @Test
    public void testGetString_stringValue() {
        ep.put("k", "v");
        assertEquals("v", ep.getString("k"));
    }

    @Test
    public void testGetString_listValue_returnsFirstElement() {
        ep.addProperty("k", "a,b");
        assertEquals("a", ep.getString("k"));
    }

    @Test
    public void testGetString_nullNoDefaults_returnsInterpolatedDefaultValue() {
        assertEquals("fallback", ep.getString("missing", "fallback"));
    }

    @Test
    public void testGetString_nullNoDefaults_defaultAlsoNull() {
        assertNull(ep.getString("missing"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetString_wrongType_throwsClassCastException() {
        ep.put("k", new Integer(5));
        ep.getString("k");
    }

    // =========================================================
    // getProperties
    // =========================================================

    @Test
    public void testGetProperties_validTokens() {
        ep.addProperty("k", "a=1,b=2");
        Properties props = ep.getProperties("k");
        assertEquals("1", props.getProperty("a"));
        assertEquals("2", props.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_malformedToken_throwsIllegalArgumentException() {
        ep.addProperty("k", "novalue,anotherinvalid");
        ep.getProperties("k");
    }

    // =========================================================
    // getStringArray
    // =========================================================

    @Test
    public void testGetStringArray_stringValue() {
        ep.put("k", "single");
        assertArrayEquals(new String[]{"single"}, ep.getStringArray("k"));
    }

    @Test
    public void testGetStringArray_listValue() {
        ep.addProperty("k", "a,b,c");
        assertArrayEquals(new String[]{"a", "b", "c"}, ep.getStringArray("k"));
    }

    @Test
    public void testGetStringArray_nullNoDefaults_emptyArray() {
        assertArrayEquals(new String[0], ep.getStringArray("missing"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArray_wrongType_throwsClassCastException() {
        ep.put("k", Boolean.TRUE);
        ep.getStringArray("k");
    }

    // =========================================================
    // getVector
    // =========================================================

    @Test
    public void testGetVector_listValue() {
        ep.addProperty("k", "a,b");
        assertEquals(new Vector<>(Arrays.asList("a", "b")), ep.getVector("k"));
    }

    @Test
    public void testGetVector_stringValue_mutatesStoredValue() {
        ep.put("k", "single");
        Vector v = ep.getVector("k");
        assertEquals(1, v.size());
        assertEquals("single", v.get(0));
        // side-effect: ค่าที่เก็บใน map ถูกแปลงเป็น Vector แล้ว
        assertTrue(ep.get("k") instanceof Vector);
    }

    @Test
    public void testGetVector_nullNoDefaults_defaultValueNull_returnsEmptyVector() {
        Vector v = ep.getVector("missing", null);
        assertNotNull(v);
        assertTrue(v.isEmpty());
    }

    @Test
    public void testGetVector_nullNoDefaults_withProvidedDefault() {
        Vector<String> def = new Vector<>();
        def.add("d");
        assertSame(def, ep.getVector("missing", def));
    }

    @Test(expected = ClassCastException.class)
    public void testGetVector_wrongType_throwsClassCastException() {
        ep.put("k", new Integer(1));
        ep.getVector("k");
    }

    // =========================================================
    // getList
    // =========================================================

    @Test
    public void testGetList_listValue() {
        ep.addProperty("k", "a,b");
        assertEquals(Arrays.asList("a", "b"), ep.getList("k"));
    }

    @Test
    public void testGetList_stringValue_mutatesStoredValue() {
        ep.put("k", "single");
        List l = ep.getList("k");
        assertEquals(Arrays.asList("single"), l);
        assertTrue(ep.get("k") instanceof List);
    }

    @Test
    public void testGetList_nullNoDefaults_returnsEmptyList() {
        assertEquals(new ArrayList(), ep.getList("missing"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetList_wrongType_throwsClassCastException() {
        ep.put("k", new Integer(1));
        ep.getList("k");
    }

    // =========================================================
    // getBoolean
    // =========================================================

    @Test
    public void testGetBoolean_booleanValue() {
        ep.put("k", Boolean.TRUE);
        assertTrue(ep.getBoolean("k"));
    }

    @Test
    public void testGetBoolean_validStringVariants() {
        ep.put("t1", "true"); assertTrue(ep.getBoolean("t1"));
        ep.put("t2", "on"); assertTrue(ep.getBoolean("t2"));
        ep.put("t3", "yes"); assertTrue(ep.getBoolean("t3"));
        ep.put("f1", "false"); assertFalse(ep.getBoolean("f1"));
        ep.put("f2", "off"); assertFalse(ep.getBoolean("f2"));
        ep.put("f3", "no"); assertFalse(ep.getBoolean("f3"));
        // ทดสอบ mutate เป็น Boolean object
        assertTrue(ep.get("t1") instanceof Boolean);
    }

    @Test
    public void testGetBoolean_invalidStringDoesNotThrow_dueToBooleanConstructorQuirk() {
        // ข้อสังเกตจาก source: testBoolean() คืน null สำหรับ string ที่ไม่ถูกต้อง
        // แต่ new Boolean(null) จะได้ Boolean.FALSE (ไม่ใช่ null)
        // ดังนั้น getBoolean(key) จะคืน false โดยไม่ throw exception
        ep.put("flag", "notABoolean");
        assertFalse(ep.getBoolean("flag"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBoolean_keyMissingNoDefaults_throwsNoSuchElementException() {
        ep.getBoolean("missing");
    }

    @Test
    public void testGetBoolean_withPrimitiveDefaultValue_keyMissing() {
        assertTrue(ep.getBoolean("missing", true));
        assertFalse(ep.getBoolean("missing2", false));
    }

    @Test(expected = ClassCastException.class)
    public void testGetBoolean_wrongType_throwsClassCastException() {
        ep.put("k", new Integer(1));
        ep.getBoolean("k");
    }

    // =========================================================
    // getByte
    // =========================================================

    @Test
    public void testGetByte_stringValue_mutatesToByte() {
        ep.put("k", "5");
        assertEquals((byte) 5, ep.getByte("k"));
        assertTrue(ep.get("k") instanceof Byte);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByte_missingNoDefaults_throws() {
        ep.getByte("missing");
    }

    @Test
    public void testGetByte_missingWithDefault() {
        assertEquals((byte) 9, ep.getByte("missing", (byte) 9));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByte_invalidFormat_throwsNumberFormatException() {
        ep.put("k", "notANumber");
        ep.getByte("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByte_wrongType_throws() {
        ep.put("k", Boolean.TRUE);
        ep.getByte("k");
    }

    // =========================================================
    // getShort
    // =========================================================

    @Test
    public void testGetShort_stringValue_mutatesToShort() {
        ep.put("k", "100");
        assertEquals((short) 100, ep.getShort("k"));
        assertTrue(ep.get("k") instanceof Short);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShort_missingNoDefaults_throws() {
        ep.getShort("missing");
    }

    @Test
    public void testGetShort_missingWithDefault() {
        assertEquals((short) 7, ep.getShort("missing", (short) 7));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetShort_invalidFormat_throws() {
        ep.put("k", "xx");
        ep.getShort("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShort_wrongType_throws() {
        ep.put("k", Boolean.TRUE);
        ep.getShort("k");
    }

    // =========================================================
    // getInteger / getInt
    // =========================================================

    @Test
    public void testGetInteger_stringValue_mutatesToInteger() {
        ep.put("k", "42");
        assertEquals(42, ep.getInteger("k"));
        assertTrue(ep.get("k") instanceof Integer);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetInteger_missingNoDefaults_throws() {
        ep.getInteger("missing");
    }

    @Test
    public void testGetInteger_missingWithIntDefault() {
        assertEquals(3, ep.getInteger("missing", 3));
    }

    @Test
    public void testGetInteger_missingWithNullIntegerDefaultReturnsNull() {
        assertNull(ep.getInteger("missing", (Integer) null));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetInteger_invalidFormat_throws() {
        ep.put("k", "abc");
        ep.getInteger("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetInteger_wrongType_throws() {
        ep.put("k", Boolean.TRUE);
        ep.getInteger("k");
    }

    @Test
    public void testGetInt_delegatesToGetInteger() {
        ep.put("k", "10");
        assertEquals(10, ep.getInt("k"));
        assertEquals(10, ep.getInt("k", 99));
        assertEquals(99, ep.getInt("missing", 99));
    }

    // =========================================================
    // getLong
    // =========================================================

    @Test
    public void testGetLong_stringValue_mutatesToLong() {
        ep.put("k", "123456789");
        assertEquals(123456789L, ep.getLong("k"));
        assertTrue(ep.get("k") instanceof Long);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLong_missingNoDefaults_throws() {
        ep.getLong("missing");
    }

    @Test
    public void testGetLong_missingWithDefault() {
        assertEquals(5L, ep.getLong("missing", 5L));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLong_invalidFormat_throws() {
        ep.put("k", "xx");
        ep.getLong("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLong_wrongType_throws() {
        ep.put("k", Boolean.TRUE);
        ep.getLong("k");
    }

    // =========================================================
    // getFloat
    // =========================================================

    @Test
    public void testGetFloat_stringValue_mutatesToFloat() {
        ep.put("k", "1.5");
        assertEquals(1.5f, ep.getFloat("k"), 0.0001f);
        assertTrue(ep.get("k") instanceof Float);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloat_missingNoDefaults_throws() {
        ep.getFloat("missing");
    }

    @Test
    public void testGetFloat_missingWithDefault() {
        assertEquals(2.5f, ep.getFloat("missing", 2.5f), 0.0001f);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFloat_invalidFormat_throws() {
        ep.put("k", "xx");
        ep.getFloat("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloat_wrongType_throws() {
        ep.put("k", Boolean.TRUE);
        ep.getFloat("k");
    }

    // =========================================================
    // getDouble
    // =========================================================

    @Test
    public void testGetDouble_stringValue_mutatesToDouble() {
        ep.put("k", "3.14");
        assertEquals(3.14, ep.getDouble("k"), 0.0001);
        assertTrue(ep.get("k") instanceof Double);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDouble_missingNoDefaults_throws() {
        ep.getDouble("missing");
    }

    @Test
    public void testGetDouble_missingWithDefault() {
        assertEquals(9.9, ep.getDouble("missing", 9.9), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetDouble_invalidFormat_throws() {
        ep.put("k", "xx");
        ep.getDouble("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDouble_wrongType_throws() {
        ep.put("k", Boolean.TRUE);
        ep.getDouble("k");
    }

    // =========================================================
    // testBoolean
    // =========================================================

    @Test
    public void testTestBoolean_variants() {
        assertEquals("true", ep.testBoolean("TRUE"));
        assertEquals("true", ep.testBoolean("On"));
        assertEquals("true", ep.testBoolean("yes"));
        assertEquals("false", ep.testBoolean("FALSE"));
        assertEquals("false", ep.testBoolean("Off"));
        assertEquals("false", ep.testBoolean("no"));
        assertNull(ep.testBoolean("maybe"));
    }

    // =========================================================
    // subset / getKeys
    // =========================================================

    @Test
    public void testGetKeys_noPrefix() {
        ep.addProperty("a", "1");
        ep.addProperty("b", "2");
        Iterator it = ep.getKeys();
        List<Object> collected = new ArrayList<>();
        while (it.hasNext()) collected.add(it.next());
        assertEquals(Arrays.asList("a", "b"), collected);
    }

    @Test
    public void testGetKeys_withPrefix_matching() {
        ep.addProperty("prefix.a", "1");
        ep.addProperty("prefix.b", "2");
        ep.addProperty("other", "3");
        Iterator it = ep.getKeys("prefix");
        List<Object> collected = new ArrayList<>();
        while (it.hasNext()) collected.add(it.next());
        assertEquals(Arrays.asList("prefix.a", "prefix.b"), collected);
    }

    @Test
    public void testGetKeys_withPrefix_noMatch() {
        ep.addProperty("other", "3");
        Iterator it = ep.getKeys("prefix");
        assertFalse(it.hasNext());
    }

    @Test
    public void testSubset_validPrefix_longerKey() {
        ep.addProperty("prefix.a", "1");
        ExtendedProperties sub = ep.subset("prefix");
        assertNotNull(sub);
        assertEquals("1", sub.getString("a"));
    }

    @Test
    public void testSubset_validPrefix_exactLengthKey() {
        ep.addProperty("prefix", "onlyval");
        ExtendedProperties sub = ep.subset("prefix");
        assertNotNull(sub);
        // newKey == prefix เมื่อ key.length()==prefix.length()
        assertEquals("onlyval", sub.getString("prefix"));
    }

    @Test
    public void testSubset_noMatch_returnsNull() {
        ep.addProperty("other", "1");
        assertNull(ep.subset("prefix"));
    }

    // =========================================================
    // clearProperty
    // =========================================================

    @Test
    public void testClearProperty_existingKey_removedFromMapAndKeysList() {
        ep.addProperty("k", "v");
        ep.clearProperty("k");
        assertNull(ep.get("k"));
        assertFalse(ep.getKeys().hasNext());
    }

    @Test
    public void testClearProperty_nonExistingKey_noException() {
        ep.clearProperty("missing"); // ไม่ throw, ไม่มี effect
        assertFalse(ep.getKeys().hasNext());
    }

    // =========================================================
    // combine
    // =========================================================

    @Test
    public void testCombine_mergesAndOverwrites() {
        ep.addProperty("a", "1");
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("a", "override");
        other.addProperty("b", "2");
        ep.combine(other);
        assertEquals("override", ep.getString("a"));
        assertEquals("2", ep.getString("b"));
    }

    // =========================================================
    // save
    // =========================================================

    @Test
    public void testSave_nullOutput_returnsWithoutException() throws IOException {
        ep.addProperty("k", "v");
        ep.save(null, "header"); // branch: output == null -> return
    }

    @Test
    public void testSave_withHeaderAndStringValue() throws IOException {
        ep.put("k", "v");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, "MYHEADER");
        String out = baos.toString();
        assertTrue(out.startsWith("MYHEADER"));
        assertTrue(out.contains("k=v"));
    }

    @Test
    public void testSave_withoutHeader() throws IOException {
        ep.put("k", "v");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, null);
        String out = baos.toString();
        assertFalse(out.startsWith("null"));
        assertTrue(out.contains("k=v"));
    }

    @Test
    public void testSave_withListValue_writesMultipleLines() throws IOException {
        ep.addProperty("k", "a,b");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, null);
        String out = baos.toString();
        assertTrue(out.contains("k=a"));
        assertTrue(out.contains("k=b"));
    }

    @Test
    public void testSave_escapesCommaInStringValue() throws IOException {
        ep.put("k", "a,b"); // ใส่ตรงผ่าน Hashtable.put เพื่อเลี่ยง addProperty แยก token
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, null);
        String out = baos.toString();
        assertTrue(out.contains("k=a\\,b"));
    }

    // =========================================================
    // convertProperties
    // =========================================================

    @Test
    public void testConvertProperties() {
        Properties props = new Properties();
        props.setProperty("k1", "v1");
        props.setProperty("k2", "v2");
        ExtendedProperties converted = ExtendedProperties.convertProperties(props);
        assertEquals("v1", converted.getString("k1"));
        assertEquals("v2", converted.getString("k2"));
    }

    // =========================================================
    // package-private nested class: PropertiesReader
    // =========================================================

    @Test
    public void testPropertiesReader_continuationLine() throws IOException {
        // "value\" + newline + "next" -> single trailing backslash = continuation
        String content = "value\\\nnext";
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(new StringReader(content));
        assertEquals("valuenext", reader.readProperty());
        assertNull(reader.readProperty()); // EOF branch
    }

    @Test
    public void testPropertiesReader_doubleBackslashIsNotContinuation() throws IOException {
        // "value\\" (สอง backslash จริง) -> ไม่ใช่ continuation (escaped backslash)
        String content = "value\\\\";
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(new StringReader(content));
        assertEquals("value\\\\", reader.readProperty());
    }

    @Test
    public void testPropertiesReader_commentAndBlankSkipped() throws IOException {
        String content = "# comment\n\nkey=value";
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(new StringReader(content));
        assertEquals("key=value", reader.readProperty());
    }

    // =========================================================
    // package-private nested class: PropertiesTokenizer
    // =========================================================

    @Test
    public void testPropertiesTokenizer_escapedCommaMerged() {
        // เนื้อหาจริง: a\,b,c
        ExtendedProperties.PropertiesTokenizer tok =
                new ExtendedProperties.PropertiesTokenizer("a\\,b,c");
        assertTrue(tok.hasMoreTokens());
        assertEquals("a,b", tok.nextToken());
        assertTrue(tok.hasMoreTokens());
        assertEquals("c", tok.nextToken());
        assertFalse(tok.hasMoreTokens());
    }

    @Test
    public void testPropertiesTokenizer_plainCommaSeparated() {
        ExtendedProperties.PropertiesTokenizer tok =
                new ExtendedProperties.PropertiesTokenizer("a,b,c");
        assertEquals("a", tok.nextToken());
        assertEquals("b", tok.nextToken());
        assertEquals("c", tok.nextToken());
        assertFalse(tok.hasMoreTokens());
    }
}
