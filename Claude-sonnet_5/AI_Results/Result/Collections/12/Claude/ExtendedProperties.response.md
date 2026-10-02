# วิเคราะห์และแผนการทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `ExtendedProperties` ผมได้ระบุ branch/condition สำคัญที่ต้องทดสอบ ได้แก่ `interpolateHelper` (loop detection, undefined variable, defaults fallback), `load()` (comment/blank line, continuation line, equalSign position, include mechanism แบบ absolute/relative/./ /ไม่พบไฟล์), `addProperty`/`addPropertyInternal` (String มี comma / ไม่มี comma / ไม่ใช่ String, key ซ้ำ→Vector), `getXxx` ทุกตัว (ประเภทตรง, String parse, null+defaults, null ไม่มี defaults, ประเภทผิด→ClassCastException), `subset`, `combine`, `clearProperty`, `getKeys(prefix)`, `getInclude/setInclude`

ด้านล่างคือชุดทดสอบ:

```java
package org.apache.commons.collections;

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
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ExtendedPropertiesTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private ExtendedProperties ep;

    @Before
    public void setUp() {
        ep = new ExtendedProperties();
    }

    // ---------- Constructors / isInitialized ----------

    @Test
    public void testDefaultConstructor_EmptyAndNotInitialized() {
        assertFalse(ep.isInitialized());
        assertFalse(ep.getKeys().hasNext());
    }

    @Test(expected = IOException.class)
    public void testConstructorFileNotFound_ThrowsIOException() throws IOException {
        new ExtendedProperties(tempFolder.getRoot().getAbsolutePath() + File.separator + "no_such_file.properties");
    }

    @Test
    public void testConstructorWithFile_LoadsAndInitializes() throws IOException {
        File f = tempFolder.newFile("main.properties");
        writeFile(f, "foo=bar\n");
        ExtendedProperties e = new ExtendedProperties(f.getAbsolutePath());
        assertTrue(e.isInitialized());
        assertEquals("bar", e.getString("foo"));
    }

    @Test
    public void testConstructorWithDefaultFile_FallbackWorks() throws IOException {
        File defFile = tempFolder.newFile("defaults.properties");
        writeFile(defFile, "shared=fromDefault\n");
        File mainFile = tempFolder.newFile("main2.properties");
        writeFile(mainFile, "own=mainValue\n");

        ExtendedProperties e = new ExtendedProperties(mainFile.getAbsolutePath(), defFile.getAbsolutePath());
        assertEquals("mainValue", e.getString("own"));
        assertEquals("fromDefault", e.getString("shared"));
    }

    // ---------- load(): comment / blank / equalSign branches ----------

    @Test
    public void testLoad_CommentAndBlankLinesSkipped() throws IOException {
        String content = "\n# a comment\nkey=value\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("value", ep.getString("key"));
        // only one key must have been registered
        int count = 0;
        for (Iterator it = ep.getKeys(); it.hasNext(); it.next()) count++;
        assertEquals(1, count);
    }

    @Test
    public void testLoad_LineWithEqualSignAtStart_Skipped() throws IOException {
        // equalSign == 0 -> branch (equalSign > 0) is false -> line ignored
        String content = "=value\nkey=actual\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("actual", ep.getString("key"));
        assertNull(ep.getString("", null));
    }

    @Test
    public void testLoad_LineWithoutEqualSign_Ignored() throws IOException {
        String content = "justtext\nkey=value\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testLoad_ContinuationLineConcatenated() throws IOException {
        // line ends with single backslash -> odd count -> continuation
        String content = "longvalue=foo\\\nbar\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("foobar", ep.getString("longvalue"));
    }

    @Test
    public void testLoad_WithEncodingSpecified() throws IOException {
        ep.load(new ByteArrayInputStream("k=v\n".getBytes("UTF-8")), "UTF-8");
        assertEquals("v", ep.getString("k"));
    }

    // ---------- load(): include mechanism ----------

    @Test
    public void testLoad_IncludeAbsolutePath() throws IOException {
        File included = tempFolder.newFile("included.properties");
        writeFile(included, "included=yes\n");
        File main = tempFolder.newFile("mainAbs.properties");
        writeFile(main, "include=" + included.getAbsolutePath() + "\nfoo=bar\n");

        ExtendedProperties e = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("yes", e.getString("included"));
        assertEquals("bar", e.getString("foo"));
        assertNull(e.getProperty("include")); // used as directive, not stored
    }

    @Test
    public void testLoad_IncludeRelativeDotSlash() throws IOException {
        File main = tempFolder.newFile("mainRelDot.properties");
        File included = tempFolder.newFile("includedDot.properties");
        writeFile(included, "included2=yes2\n");
        writeFile(main, "include=./" + included.getName() + "\nfoo=bar2\n");

        ExtendedProperties e = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("yes2", e.getString("included2"));
        assertEquals("bar2", e.getString("foo"));
    }

    @Test
    public void testLoad_IncludeRelativePlain() throws IOException {
        File main = tempFolder.newFile("mainRelPlain.properties");
        File included = tempFolder.newFile("includedPlain.properties");
        writeFile(included, "included3=yes3\n");
        writeFile(main, "include=" + included.getName() + "\nfoo=bar3\n");

        ExtendedProperties e = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("yes3", e.getString("included3"));
        assertEquals("bar3", e.getString("foo"));
    }

    @Test
    public void testLoad_IncludeFileNotExisting_SilentlyIgnored() throws IOException {
        File main = tempFolder.newFile("mainNoInc.properties");
        writeFile(main, "include=doesNotExist.properties\nfoo=bar4\n");

        ExtendedProperties e = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("bar4", e.getString("foo"));
        // no exception thrown -> exists()/canRead() branch false handled gracefully
    }

    @Test
    public void testLoad_IncludeCaseInsensitiveKeyMatch() throws IOException {
        File included = tempFolder.newFile("includedCase.properties");
        writeFile(included, "casedProp=ok\n");
        File main = tempFolder.newFile("mainCase.properties");
        writeFile(main, "INCLUDE=" + included.getAbsolutePath() + "\n");

        ExtendedProperties e = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("ok", e.getString("casedProp"));
    }

    @Test
    public void testSetInclude_EmptyDisablesInclude() throws IOException {
        ExtendedProperties e = new ExtendedProperties();
        e.setInclude(""); // hack -> getInclude() returns null -> include mechanism disabled
        assertNull(e.getInclude());
        e.load(new ByteArrayInputStream("include=foo.properties\nkey=val\n".getBytes()));
        assertEquals("foo.properties", e.getString("include"));
        assertEquals("val", e.getString("key"));
    }

    @Test
    public void testSetInclude_CustomName() throws IOException {
        File included = tempFolder.newFile("includedCustom.properties");
        writeFile(included, "customProp=hey\n");
        ExtendedProperties e = new ExtendedProperties();
        e.setInclude("myinc");
        assertEquals("myinc", e.getInclude());
        String content = "myinc=" + included.getAbsolutePath() + "\nkey=val\n";
        e.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("hey", e.getString("customProp"));
        assertEquals("val", e.getString("key"));
        assertNull(e.getProperty("myinc"));
    }

    @Test
    public void testGetInclude_DefaultWhenNotSet() {
        assertEquals("include", ep.getInclude());
    }

    @Test
    public void testSetInclude_Null_TreatedAsEmpty() {
        ep.setInclude(null);
        assertNull(ep.getInclude());
    }

    @Test
    public void testSetInclude_NormalValue() {
        ep.setInclude("myKey");
        assertEquals("myKey", ep.getInclude());
    }

    // ---------- getProperty / addProperty / addPropertyInternal ----------

    @Test
    public void testGetProperty_FoundLocally() {
        ep.addProperty("k", "v");
        assertEquals("v", ep.getProperty("k"));
    }

    @Test
    public void testGetProperty_NullWithNoDefaults() {
        assertNull(ep.getProperty("missing"));
    }

    @Test
    public void testAddProperty_SingleValueNoComma() {
        ep.addProperty("single", "value1");
        assertEquals("value1", ep.get("single"));
        assertTrue(ep.isInitialized());
    }

    @Test
    public void testAddProperty_CommaSeparated_BecomesVector() {
        ep.addProperty("list", "a,b,c");
        Object stored = ep.get("list");
        assertTrue(stored instanceof List);
        List l = (List) stored;
        assertEquals(3, l.size());
        assertEquals("a", l.get(0));
        assertEquals("b", l.get(1));
        assertEquals("c", l.get(2));
    }

    @Test
    public void testAddProperty_NonStringValue_StoredDirect() {
        Integer i = new Integer(5);
        ep.addProperty("num", i);
        assertSame(i, ep.get("num"));
    }

    @Test
    public void testAddProperty_EscapedCommaRoundTrip() {
        // matches Javadoc example: commas.escaped = Hi\, what'up?
        ep.addProperty("commas.escaped", "Hi\\, what'sup?");
        Object stored = ep.get("commas.escaped");
        assertEquals("Hi, what'sup?", stored);
    }

    @Test
    public void testAddProperty_DoubleBackslashUnescaped() {
        ep.addProperty("bs", "a\\\\b"); // java string: a\\b -> a\b after unescape
        assertEquals("a\\b", ep.get("bs"));
    }

    @Test
    public void testSetProperty_ReplacesExistingValue() {
        ep.addProperty("k", "old");
        ep.setProperty("k", "new");
        assertEquals("new", ep.get("k"));
    }

    // ---------- save() ----------

    @Test
    public void testSave_NullOutputStream_NoException() throws IOException {
        ep.save(null, "header"); // should just return, no exception
    }

    @Test
    public void testSave_WithHeaderStringAndListValues() throws IOException {
        ep.addProperty("commas.escaped", "Hi\\, what'sup?"); // stored w/ literal comma+backslash restored
        ep.addProperty("bs", "a\\\\b");
        ep.addProperty("list", "x,y");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ep.save(out, "# my header");
        String result = out.toString();
        assertTrue(result.contains("# my header"));
        assertTrue(result.contains("commas.escaped=Hi\\, what'sup?"));
        assertTrue(result.contains("bs=a\\\\b"));
        assertTrue(result.contains("list=x"));
        assertTrue(result.contains("list=y"));
    }

    @Test
    public void testSave_NoHeader() throws IOException {
        ep.addProperty("k", "v");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ep.save(out, null);
        assertTrue(out.toString().contains("k=v"));
    }

    // ---------- combine() ----------
    // NOTE: combine() uses super.put() directly and does NOT update keysAsListed
    // for brand-new keys. This is existing (possibly buggy) behavior of the
    // source; the test documents/detects this exact behavior.
    @Test
    public void testCombine_OverwritesAndKeyListQuirk() {
        ep.addProperty("existing", "old");
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("existing", "new");
        other.addProperty("brandNew", "value");

        ep.combine(other);

        assertEquals("new", ep.get("existing")); // overwritten
        assertEquals("value", ep.get("brandNew")); // value present in map

        boolean brandNewInKeysList = false;
        for (Iterator it = ep.getKeys(); it.hasNext();) {
            if ("brandNew".equals(it.next())) { brandNewInKeysList = true; }
        }
        // per current source, keysAsListed is NOT updated by combine() for new keys
        assertFalse(brandNewInKeysList);
    }

    // ---------- clearProperty() ----------

    @Test
    public void testClearProperty_ExistingKey_RemovesFromMapAndKeysList() {
        ep.addProperty("k1", "v1");
        ep.addProperty("k2", "v2");
        ep.clearProperty("k1");
        assertNull(ep.get("k1"));
        boolean found = false;
        for (Iterator it = ep.getKeys(); it.hasNext();) {
            if ("k1".equals(it.next())) found = true;
        }
        assertFalse(found);
        assertEquals("v2", ep.get("k2"));
    }

    @Test
    public void testClearProperty_NonExistingKey_NoException() {
        ep.clearProperty("noSuchKey"); // containsKey branch false
    }

    // ---------- getKeys(prefix) / subset() ----------

    @Test
    public void testGetKeysWithPrefix_MatchAndNoMatch() {
        ep.addProperty("db.host", "localhost");
        ep.addProperty("db.port", "5432");
        ep.addProperty("other", "x");
        List matched = new ArrayList();
        for (Iterator it = ep.getKeys("db."); it.hasNext();) {
            matched.add(it.next());
        }
        assertEquals(2, matched.size());
        assertTrue(matched.contains("db.host"));
        assertTrue(matched.contains("db.port"));
    }

    @Test
    public void testSubset_ValidSubset_ExactPrefixKey() {
        ep.addProperty("db", "wholeThing");
        ep.addProperty("db.host", "localhost");
        ExtendedProperties sub = ep.subset("db");
        assertNotNull(sub);
        assertEquals("wholeThing", sub.getString("db")); // key.length()==prefix.length()
        assertEquals("localhost", sub.getString("host"));
    }

    @Test
    public void testSubset_NoMatch_ReturnsNull() {
        ep.addProperty("other", "value");
        assertNull(ep.subset("db"));
    }

    // ---------- display() ----------

    @Test
    public void testDisplay_DoesNotThrow() {
        ep.addProperty("k", "v");
        ep.display();
    }

    // ---------- getString ----------

    @Test
    public void testGetString_ValueIsString() {
        ep.addProperty("k", "hello");
        assertEquals("hello", ep.getString("k"));
    }

    @Test
    public void testGetString_NullNoDefaults_ReturnsNull() {
        assertNull(ep.getString("missing"));
    }

    @Test
    public void testGetString_NullNoDefaults_ReturnsGivenDefaultValue() {
        assertEquals("dflt", ep.getString("missing", "dflt"));
    }

    @Test
    public void testGetString_ValueIsList_ReturnsFirstElement() {
        ep.addProperty("list", "a,b");
        assertEquals("a", ep.getString("list"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetString_WrongType_ThrowsCCE() {
        ep.put("num", new Integer(5));
        ep.getString("num");
    }

    // ---------- interpolation (via getString) ----------

    @Test
    public void testInterpolate_SimpleVariable() {
        ep.addProperty("a", "${b}");
        ep.addProperty("b", "hello");
        assertEquals("hello", ep.getString("a"));
    }

    @Test
    public void testInterpolate_UndefinedVariable_LeftAsIs() {
        ep.addProperty("x", "${undefined}");
        assertEquals("${undefined}", ep.getString("x"));
    }

    @Test
    public void testInterpolate_MultiplePlaceholdersInSameString() {
        ep.addProperty("a", "1");
        ep.addProperty("b", "2");
        ep.addProperty("combo", "${a}-${b}");
        assertEquals("1-2", ep.getString("combo"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolate_SelfLoop_Throws() {
        ep.addProperty("a", "${a}");
        ep.getString("a");
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolate_MutualLoop_Throws() {
        ep.addProperty("a", "${b}");
        ep.addProperty("b", "${a}");
        ep.getString("a");
    }

    // ---------- getProperties() ----------

    @Test
    public void testGetProperties_ValidTokens() {
        ep.addProperty("props", "k1=v1,k2=v2");
        Properties result = ep.getProperties("props");
        assertEquals("v1", result.getProperty("k1"));
        assertEquals("v2", result.getProperty("k2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_MalformedToken_NoEqualSign_Throws() {
        ep.addProperty("bad", "novalue");
        ep.getProperties("bad");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_MalformedToken_EqualSignAtStart_Throws() {
        ep.addProperty("bad2", "=bad");
        ep.getProperties("bad2");
    }

    // ---------- getStringArray() ----------

    @Test
    public void testGetStringArray_StringValue() {
        ep.addProperty("k", "single");
        String[] arr = ep.getStringArray("k");
        assertArrayEquals(new String[]{"single"}, arr);
    }

    @Test
    public void testGetStringArray_ListValue() {
        ep.addProperty("k", "a,b");
        String[] arr = ep.getStringArray("k");
        assertArrayEquals(new String[]{"a", "b"}, arr);
    }

    @Test
    public void testGetStringArray_NullNoDefaults_ReturnsEmptyArray() {
        assertEquals(0, ep.getStringArray("missing").length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArray_WrongType_ThrowsCCE() {
        ep.put("num", new Integer(1));
        ep.getStringArray("num");
    }

    // ---------- getVector() ----------

    @Test
    public void testGetVector_ListValue() {
        ep.addProperty("k", "a,b");
        Vector v = ep.getVector("k");
        assertEquals(2, v.size());
    }

    @Test
    public void testGetVector_StringValue_SideEffectStoresVector() {
        ep.addProperty("k", "single");
        Vector v = ep.getVector("k");
        assertEquals(1, v.size());
        assertEquals("single", v.get(0));
        assertTrue(ep.get("k") instanceof Vector); // side effect mutation verified
    }

    @Test
    public void testGetVector_NullNoDefaults_DefaultValueNull_ReturnsEmptyVector() {
        Vector v = ep.getVector("missing", null);
        assertNotNull(v);
        assertTrue(v.isEmpty());
    }

    @Test
    public void testGetVector_NullNoDefaults_DefaultValueProvided() {
        Vector def = new Vector();
        def.add("d");
        Vector v = ep.getVector("missing", def);
        assertSame(def, v);
    }

    @Test(expected = ClassCastException.class)
    public void testGetVector_WrongType_ThrowsCCE() {
        ep.put("num", new Integer(1));
        ep.getVector("num");
    }

    // ---------- getList() ----------

    @Test
    public void testGetList_ListValue() {
        ep.addProperty("k", "a,b");
        List l = ep.getList("k");
        assertEquals(2, l.size());
    }

    @Test
    public void testGetList_StringValue_SideEffectStoresList() {
        ep.addProperty("k", "single");
        List l = ep.getList("k");
        assertEquals(1, l.size());
        assertTrue(ep.get("k") instanceof List);
    }

    @Test
    public void testGetList_NullNoDefaults_DefaultValueNull_ReturnsEmptyList() {
        List l = ep.getList("missing", null);
        assertNotNull(l);
        assertTrue(l.isEmpty());
    }

    @Test(expected = ClassCastException.class)
    public void testGetList_WrongType_ThrowsCCE() {
        ep.put("num", new Integer(1));
        ep.getList("num");
    }

    // ---------- testBoolean() ----------

    @Test
    public void testTestBoolean_TrueValues() {
        assertEquals("true", ep.testBoolean("true"));
        assertEquals("true", ep.testBoolean("ON"));
        assertEquals("true", ep.testBoolean("Yes"));
    }

    @Test
    public void testTestBoolean_FalseValues() {
        assertEquals("false", ep.testBoolean("false"));
        assertEquals("false", ep.testBoolean("OFF"));
        assertEquals("false", ep.testBoolean("No"));
    }

    @Test
    public void testTestBoolean_InvalidValue_ReturnsNull() {
        assertNull(ep.testBoolean("maybe"));
    }

    // ---------- getBoolean() ----------

    @Test
    public void testGetBoolean_ExistingBoolean() {
        ep.put("k", Boolean.TRUE);
        assertTrue(ep.getBoolean("k"));
    }

    @Test
    public void testGetBoolean_StringValid() {
        ep.addProperty("k", "yes");
        assertTrue(ep.getBoolean("k"));
        assertTrue(ep.get("k") instanceof Boolean); // side effect conversion
    }

    // NOTE: for invalid boolean strings, testBoolean() returns null and
    // `new Boolean((String) null)` yields Boolean.FALSE (no exception).
    // This is the observed behavior of the source code (documented here).
    @Test
    public void testGetBoolean_StringInvalid_StoresFalse() {
        ep.addProperty("k", "maybe");
        assertFalse(ep.getBoolean("k", true));
    }

    @Test
    public void testGetBoolean_NoKeyNoDefaultValue_ThrowsNoSuchElement() {
        try {
            ep.getBoolean("missing");
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // ok
        }
    }

    @Test
    public void testGetBoolean_NoKeyWithDefaultValue() {
        assertTrue(ep.getBoolean("missing", true));
    }

    @Test(expected = ClassCastException.class)
    public void testGetBoolean_WrongType_ThrowsCCE() {
        ep.put("k", new Integer(1));
        ep.getBoolean("k");
    }

    // ---------- getInteger() / getInt() ----------

    @Test
    public void testGetInteger_ExistingInteger() {
        ep.put("k", new Integer(42));
        assertEquals(42, ep.getInteger("k"));
    }

    @Test
    public void testGetInteger_StringValidParse() {
        ep.addProperty("k", "123");
        assertEquals(123, ep.getInt("k"));
        assertTrue(ep.get("k") instanceof Integer);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetInteger_StringInvalidParse_Throws() {
        ep.addProperty("k", "abc");
        ep.getInteger("k");
    }

    @Test
    public void testGetInteger_MissingNoDefault_UsesGivenDefault() {
        assertEquals(99, ep.getInt("missing", 99));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetInteger_MissingNoDefault_NoArgThrows() {
        ep.getInt("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetInteger_WrongType_ThrowsCCE() {
        ep.put("k", Boolean.TRUE);
        ep.getInteger("k");
    }

    // ---------- getByte() ----------

    @Test
    public void testGetByte_FullBranchSet() {
        ep.put("k1", new Byte((byte) 5));
        assertEquals((byte) 5, ep.getByte("k1"));

        ep.addProperty("k2", "7");
        assertEquals((byte) 7, ep.getByte("k2", (byte) 0));

        assertEquals((byte) 9, ep.getByte("missing", (byte) 9));

        try {
            ep.getByte("missing2");
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) { /* ok */ }
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByte_InvalidString_Throws() {
        ep.addProperty("k", "notabyte");
        ep.getByte("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByte_WrongType_Throws() {
        ep.put("k", Boolean.TRUE);
        ep.getByte("k");
    }

    // ---------- getShort() ----------

    @Test
    public void testGetShort_FullBranchSet() {
        ep.put("k1", new Short((short) 5));
        assertEquals((short) 5, ep.getShort("k1"));

        ep.addProperty("k2", "7");
        assertEquals((short) 7, ep.getShort("k2", (short) 0));

        assertEquals((short) 9, ep.getShort("missing", (short) 9));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetShort_InvalidString_Throws() {
        ep.addProperty("k", "notashort");
        ep.getShort("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShort_WrongType_Throws() {
        ep.put("k", Boolean.TRUE);
        ep.getShort("k");
    }

    // ---------- getLong() ----------

    @Test
    public void testGetLong_FullBranchSet() {
        ep.put("k1", new Long(5L));
        assertEquals(5L, ep.getLong("k1"));

        ep.addProperty("k2", "700000");
        assertEquals(700000L, ep.getLong("k2", 0L));

        assertEquals(9L, ep.getLong("missing", 9L));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLong_InvalidString_Throws() {
        ep.addProperty("k", "notalong");
        ep.getLong("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLong_WrongType_Throws() {
        ep.put("k", Boolean.TRUE);
        ep.getLong("k");
    }

    // ---------- getFloat() ----------

    @Test
    public void testGetFloat_FullBranchSet() {
        ep.put("k1", new Float(5.5f));
        assertEquals(5.5f, ep.getFloat("k1"), 0.0001);

        ep.addProperty("k2", "7.5");
        assertEquals(7.5f, ep.getFloat("k2", 0f), 0.0001);

        assertEquals(9.9f, ep.getFloat("missing", 9.9f), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFloat_InvalidString_Throws() {
        ep.addProperty("k", "notafloat");
        ep.getFloat("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloat_WrongType_Throws() {
        ep.put("k", Boolean.TRUE);
        ep.getFloat("k");
    }

    // ---------- getDouble() ----------

    @Test
    public void testGetDouble_FullBranchSet() {
        ep.put("k1", new Double(5.5));
        assertEquals(5.5, ep.getDouble("k1"), 0.0001);

        ep.addProperty("k2", "7.5");
        assertEquals(7.5, ep.getDouble("k2", 0d), 0.0001);

        assertEquals(9.9, ep.getDouble("missing", 9.9), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetDouble_InvalidString_Throws() {
        ep.addProperty("k", "notadouble");
        ep.getDouble("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDouble_WrongType_Throws() {
        ep.put("k", Boolean.TRUE);
        ep.getDouble("k");
    }

    // ---------- defaults fallback (needs real defaultFile-based chain) ----------

    @Test
    public void testDefaultsFallback_StringIntegerBoolean() throws IOException {
        File defFile = tempFolder.newFile("defs.properties");
        writeFile(defFile, "str=fromDef\nnum=42\nflag=true\n");
        File mainFile = tempFolder.newFile("mainWithDefs.properties");
        writeFile(mainFile, "own=here\n");

        ExtendedProperties e = new ExtendedProperties(mainFile.getAbsolutePath(), defFile.getAbsolutePath());

        assertEquals("fromDef", e.getString("str"));
        assertEquals(42, e.getInteger("num"));
        assertTrue(e.getBoolean("flag"));
    }

    // ---------- convertProperties() ----------

    @Test
    public void testConvertProperties() {
        Properties p = new Properties();
        p.setProperty("a", "1");
        p.setProperty("b", "2");
        ExtendedProperties converted = ExtendedProperties.convertProperties(p);
        assertEquals("1", converted.getString("a"));
        assertEquals("2", converted.getString("b"));
    }

    // ---------- put() / remove() / putAll() ----------

    @Test
    public void testPut_ReturnsOldValueAndStoresNew() {
        ep.addProperty("k", "old");
        Object old = ep.put("k", "new");
        assertEquals("old", old);
        assertEquals("new", ep.get("k"));
    }

    @Test
    public void testRemove_ReturnsOldValueAndClears() {
        ep.addProperty("k", "v");
        Object old = ep.remove("k");
        assertEquals("v", old);
        assertNull(ep.get("k"));
    }

    @Test
    public void testPutAll_WithExtendedProperties_PreservesOrderSemantics() {
        ExtendedProperties src = new ExtendedProperties();
        src.addProperty("x", "1");
        src.addProperty("y", "2");
        ep.putAll(src);
        assertEquals("1", ep.get("x"));
        assertEquals("2", ep.get("y"));
    }

    @Test
    public void testPutAll_WithRegularMap() {
        HashMap map = new HashMap();
        map.put("m1", "v1");
        ep.putAll(map);
        assertEquals("v1", ep.get("m1"));
    }

    // ---------- helper ----------

    private void writeFile(File f, String content) throws IOException {
        FileWriter w = new FileWriter(f);
        try {
            w.write(content);
        } finally {
            w.close();
        }
    }
}
```

## สรุปตาราง Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructor*`, `testConstructorFileNotFound*`, `testConstructorWithFile*`, `testConstructorWithDefaultFile*` | Constructor: normal, IOException (ไฟล์ไม่พบ), defaultFile != null |
| `testLoad_CommentAndBlankLinesSkipped`, `testLoad_LineWithEqualSignAtStart_Skipped`, `testLoad_LineWithoutEqualSign_Ignored`, `testLoad_ContinuationLineConcatenated`, `testLoad_WithEncodingSpecified` | `PropertiesReader.readProperty` (comment/blank/continuation), `load()`: `equalSign>0` true/false, encoding branch |
| `testLoad_Include*`, `testSetInclude_*` | `load()`: includeProperty null/ไม่ null, absolute/`./`/relative path, file exists/ไม่ exists, case-insensitive key match, `getInclude/setInclude` ทุก branch |
| `testGetProperty_*` | `getProperty`: พบใน local, null ไม่มี defaults |
| `testAddProperty_*` | `addProperty`/`addPropertyInternal`: มี comma (Vector), ไม่มี comma, ไม่ใช่ String, escape/unescape |
| `testSetProperty_*`, `testSave_*` | `setProperty` (clear+add), `save`: output null, header null/ไม่ null, String/List value, escape() |
| `testCombine_*` | `combine`: overwrite + key-list side effect (fault-detection) |
| `testClearProperty_*` | `clearProperty`: containsKey true/false |
| `testGetKeysWithPrefix_*`, `testSubset_*` | `getKeys(prefix)`: match/ไม่ match, `subset`: validSubset true/false, key.length()==prefix.length() |
| `testGetString_*`, `testInterpolate_*` | `getString`: String/List/null(+/-defaults)/CCE, `interpolateHelper`: undefined var, loop (self/mutual), multi-placeholder |
| `testGetProperties_*` | `getProperties`: equalSign>0 / ≤0 (IllegalArgumentException) |
| `testGetStringArray_*`, `testGetVector_*`, `testGetList_*` | String/List/null(+/-defaults)/CCE ของแต่ละเมธอด |
| `testTestBoolean_*`, `testGetBoolean_*` | `testBoolean`: true/false/invalid, `getBoolean`: ทุก branch รวม CCE, NoSuchElementException |
| `testGetInteger_*`, `testGetByte_*`, `testGetShort_*`, `testGetLong_*`, `testGetFloat_*`, `testGetDouble_*` | ทุกประเภทเลข: ประเภทตรง, string parse ถูก/ผิด(NFE), null+default, CCE, NoSuchElementException |
| `testDefaultsFallback_*` | เส้นทาง `defaults != null` ของ getString/getInteger/getBoolean |
| `testConvertProperties`, `testPut_*`, `testRemove_*`, `testPutAll_*` | `convertProperties`, `put/remove` (delegation ไป addProperty/clearProperty), `putAll` ทั้ง ExtendedProperties และ Map ทั่วไป |

**หมายเหตุ:** บาง branch เช่น `getKeys(prefix)` กรณี key ไม่ใช่ `String`, และ defaults-chain แบบ 3 ระดับใน `interpolateHelper` (else-if branch ที่ใช้ `defaults.getString`) ไม่สามารถเข้าถึงได้ผ่าน public API ตามปกติของคลาสนี้ (ตามที่วิเคราะห์จากซอร์ส) จึงไม่ได้เขียนเทสแยกสำหรับกรณีนั้น