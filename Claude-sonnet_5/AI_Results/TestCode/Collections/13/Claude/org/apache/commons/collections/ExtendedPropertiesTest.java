package org.apache.commons.collections;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ExtendedPropertiesTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        ExtendedProperties ep = new ExtendedProperties();
        assertFalse(ep.isInitialized());
        assertFalse(ep.getKeys().hasNext());
    }

    @Test
    public void testConstructorWithFile() throws IOException {
        File f = tempFolder.newFile("test1.properties");
        writeFile(f, "key=value\n");
        ExtendedProperties ep = new ExtendedProperties(f.getAbsolutePath());
        assertTrue(ep.isInitialized());
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testConstructorWithFileAndDefaultFile() throws IOException {
        File defFile = tempFolder.newFile("def.properties");
        writeFile(defFile, "defKey=defValue\n");
        File mainFile = tempFolder.newFile("main.properties");
        writeFile(mainFile, "mainKey=mainValue\n");

        ExtendedProperties ep = new ExtendedProperties(mainFile.getAbsolutePath(), defFile.getAbsolutePath());
        assertEquals("mainValue", ep.getString("mainKey"));
        // defKey not present directly, must come from defaults chain
        assertEquals("defValue", ep.getString("defKey"));
    }

    @Test(expected = IOException.class)
    public void testConstructorFileNotFound() throws IOException {
        new ExtendedProperties(tempFolder.getRoot().getAbsolutePath() + File.separator + "doesNotExist.properties");
    }

    // ---------------------------------------------------------------
    // getInclude / setInclude
    // ---------------------------------------------------------------

    @Test
    public void testGetIncludeDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals("include", ep.getInclude());
    }

    @Test
    public void testSetIncludeNullBecomesEmptyThenGetIncludeReturnsNull() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setInclude(null);
        assertNull(ep.getInclude()); // "" hack -> null
    }

    @Test
    public void testSetIncludeCustomValue() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setInclude("myInclude");
        assertEquals("myInclude", ep.getInclude());
    }

    // ---------------------------------------------------------------
    // load() basic parsing branches
    // ---------------------------------------------------------------

    @Test
    public void testLoadSkipsCommentsAndBlankLinesAndLinesWithoutEquals() throws IOException {
        String content = "# comment line\n\nnoEqualsSignHere\nkey1=val1\n";
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(new ByteArrayInputStream(content.getBytes("8859_1")));
        assertEquals("val1", ep.getString("key1"));
        assertFalse(ep.containsKey("noEqualsSignHere"));
    }

    @Test
    public void testLoadContinuationLine() throws IOException {
        String content = "key=first\\\nsecond\n";
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(new ByteArrayInputStream(content.getBytes("8859_1")));
        assertEquals("firstsecond", ep.getString("key"));
    }

    @Test
    public void testLoadWithEncodingParameter() throws IOException {
        String content = "key=value\n";
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(new ByteArrayInputStream(content.getBytes("UTF-8")), "UTF-8");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testLoadIsInitializedEvenOnEmptyStream() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(new ByteArrayInputStream(new byte[0]));
        assertTrue(ep.isInitialized());
    }

    @Test
    public void testLoadIncludeRelativePath() throws IOException {
        File child = tempFolder.newFile("child.properties");
        writeFile(child, "a=1\n");
        File main = tempFolder.newFile("main.properties");
        writeFile(main, "include=child.properties\nb=2\n");

        ExtendedProperties ep = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("1", ep.getString("a"));
        assertEquals("2", ep.getString("b"));
        assertFalse(ep.containsKey("include")); // include key itself is not stored
    }

    @Test
    public void testLoadIncludeDotSlashPath() throws IOException {
        File child = tempFolder.newFile("child2.properties");
        writeFile(child, "a=1\n");
        File main = tempFolder.newFile("main2.properties");
        writeFile(main, "include=." + File.separator + "child2.properties\nb=2\n");

        ExtendedProperties ep = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("1", ep.getString("a"));
        assertEquals("2", ep.getString("b"));
    }

    @Test
    public void testLoadIncludeAbsolutePath() throws IOException {
        File child = tempFolder.newFile("child3.properties");
        writeFile(child, "a=1\n");
        File main = tempFolder.newFile("main3.properties");
        writeFile(main, "include=" + child.getAbsolutePath() + "\nb=2\n");

        ExtendedProperties ep = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("1", ep.getString("a"));
        assertEquals("2", ep.getString("b"));
    }

    @Test
    public void testLoadIncludeFileDoesNotExistIsSkippedSilently() throws IOException {
        File main = tempFolder.newFile("main4.properties");
        writeFile(main, "include=nonexistent.properties\nb=2\n");
        ExtendedProperties ep = new ExtendedProperties(main.getAbsolutePath());
        assertEquals("2", ep.getString("b"));
    }

    // ---------------------------------------------------------------
    // PropertiesReader (package-private nested class)
    // ---------------------------------------------------------------

    @Test
    public void testPropertiesReaderNormalLine() throws IOException {
        ExtendedProperties.PropertiesReader r =
            new ExtendedProperties.PropertiesReader(new StringReader("key=value\n"));
        assertEquals("key=value", r.readProperty());
        assertNull(r.readProperty());
    }

    @Test
    public void testPropertiesReaderSkipsCommentsAndBlank() throws IOException {
        ExtendedProperties.PropertiesReader r =
            new ExtendedProperties.PropertiesReader(new StringReader("# comment\n\nkey=value\n"));
        assertEquals("key=value", r.readProperty());
    }

    @Test
    public void testPropertiesReaderSingleBackslashContinuation() throws IOException {
        ExtendedProperties.PropertiesReader r =
            new ExtendedProperties.PropertiesReader(new StringReader("key=first\\\nsecond\n"));
        assertEquals("key=firstsecond", r.readProperty());
    }

    @Test
    public void testPropertiesReaderDoubleBackslashNotContinuation() throws IOException {
        // two trailing backslashes => even count => NOT a continuation
        ExtendedProperties.PropertiesReader r =
            new ExtendedProperties.PropertiesReader(new StringReader("key=value\\\\\nnext=1\n"));
        assertEquals("key=value\\\\", r.readProperty());
        assertEquals("next=1", r.readProperty());
    }

    @Test
    public void testPropertiesReaderEOFReturnsNull() throws IOException {
        ExtendedProperties.PropertiesReader r =
            new ExtendedProperties.PropertiesReader(new StringReader(""));
        assertNull(r.readProperty());
    }

    // ---------------------------------------------------------------
    // PropertiesTokenizer (package-private nested class)
    // ---------------------------------------------------------------

    @Test
    public void testPropertiesTokenizerSimple() {
        ExtendedProperties.PropertiesTokenizer t = new ExtendedProperties.PropertiesTokenizer("a,b,c");
        assertEquals("a", t.nextToken());
        assertEquals("b", t.nextToken());
        assertEquals("c", t.nextToken());
        assertFalse(t.hasMoreTokens());
    }

    @Test
    public void testPropertiesTokenizerEscapedComma() {
        // "a\,b,c" -> actual chars: a \ , b , c
        ExtendedProperties.PropertiesTokenizer t = new ExtendedProperties.PropertiesTokenizer("a\\,b,c");
        assertEquals("a,b", t.nextToken()); // escaped comma re-joined
        assertEquals("c", t.nextToken());
    }

    // ---------------------------------------------------------------
    // getProperty
    // ---------------------------------------------------------------

    @Test
    public void testGetPropertyFoundInSelf() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "v");
        assertEquals("v", ep.getProperty("k"));
    }

    @Test
    public void testGetPropertyFallbackToDefaults() throws IOException {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "defVal");
        ExtendedProperties ep = new ExtendedProperties();
        setDefaults(ep, defaults);
        assertEquals("defVal", ep.getProperty("k"));
    }

    @Test
    public void testGetPropertyNullWithoutDefaults() {
        ExtendedProperties ep = new ExtendedProperties();
        assertNull(ep.getProperty("missing"));
    }

    // ---------------------------------------------------------------
    // addProperty / addPropertyInternal branches
    // ---------------------------------------------------------------

    @Test
    public void testAddPropertyStringNoComma() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "simple");
        assertEquals("simple", ep.get("k"));
        assertTrue(ep.isInitialized());
    }

    @Test
    public void testAddPropertyStringWithCommaSplitsTokens() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "a,b");
        Object val = ep.get("k");
        assertTrue(val instanceof List);
        List list = (List) val;
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddPropertyNonStringValue() {
        ExtendedProperties ep = new ExtendedProperties();
        Integer intVal = new Integer(5);
        ep.addProperty("k", intVal);
        assertEquals(intVal, ep.get("k"));
    }

    @Test
    public void testAddPropertyInternalConvertsSecondValueToList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "first");
        ep.addProperty("k", "second");
        Object val = ep.get("k");
        assertTrue(val instanceof List);
        List list = (List) val;
        assertEquals(2, list.size());
        assertEquals("first", list.get(0));
        assertEquals("second", list.get(1));
    }

    @Test
    public void testAddPropertyInternalAppendsToExistingList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "first");
        ep.addProperty("k", "second");
        ep.addProperty("k", "third");
        List list = (List) ep.get("k");
        assertEquals(3, list.size());
        assertEquals("third", list.get(2));
    }

    @Test
    public void testAddPropertyKeysAsListedNotDuplicated() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "first");
        ep.addProperty("k", "second");
        int count = 0;
        for (Iterator it = ep.getKeys(); it.hasNext();) {
            if ("k".equals(it.next())) count++;
        }
        assertEquals(1, count);
    }

    // ---------------------------------------------------------------
    // setProperty
    // ---------------------------------------------------------------

    @Test
    public void testSetPropertyReplacesExisting() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "old1");
        ep.addProperty("k", "old2");
        ep.setProperty("k", "newVal");
        assertEquals("newVal", ep.get("k"));
    }

    // ---------------------------------------------------------------
    // save
    // ---------------------------------------------------------------

    @Test
    public void testSaveNullOutputDoesNothing() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "v");
        ep.save(null, "header"); // should not throw
    }

    @Test
    public void testSaveWithHeaderStringAndListValues() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("single", "val,ue"); // will contain comma -> escaped on save
        ep.addProperty("multi", "a");
        ep.addProperty("multi", "b");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ep.save(out, "MY HEADER");
        String result = out.toString("8859_1");

        assertTrue(result.contains("MY HEADER"));
        assertTrue(result.contains("single=val\\,ue")); // escape() adds backslash before comma
        assertTrue(result.contains("multi=a"));
        assertTrue(result.contains("multi=b"));
    }

    @Test
    public void testSaveWithoutHeader() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "v");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ep.save(out, null);
        String result = out.toString("8859_1");
        assertTrue(result.contains("k=v"));
    }

    // ---------------------------------------------------------------
    // combine
    // ---------------------------------------------------------------

    @Test
    public void testCombineOverwritesAndAdds() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("a", "old");
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("a", "new");
        other.addProperty("b", "bVal");

        ep.combine(other);
        assertEquals("new", ep.get("a"));
        assertEquals("bVal", ep.get("b"));
    }

    // ---------------------------------------------------------------
    // clearProperty
    // ---------------------------------------------------------------

    @Test
    public void testClearPropertyExisting() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("a", "1");
        ep.clearProperty("a");
        assertFalse(ep.containsKey("a"));
        assertFalse(ep.getKeys().hasNext());
    }

    @Test
    public void testClearPropertyNonExistingDoesNothing() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.clearProperty("notThere"); // should not throw
        assertFalse(ep.containsKey("notThere"));
    }

    // ---------------------------------------------------------------
    // getKeys / getKeys(prefix)
    // ---------------------------------------------------------------

    @Test
    public void testGetKeysOrder() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("b", "1");
        ep.addProperty("a", "2");
        Iterator it = ep.getKeys();
        assertEquals("b", it.next());
        assertEquals("a", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysWithPrefixMatches() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("prefix.a", "1");
        ep.addProperty("prefix.b", "2");
        ep.addProperty("other", "3");

        Iterator it = ep.getKeys("prefix");
        List result = new ArrayList();
        while (it.hasNext()) result.add(it.next());
        assertEquals(2, result.size());
        assertTrue(result.contains("prefix.a"));
        assertTrue(result.contains("prefix.b"));
    }

    @Test
    public void testGetKeysWithPrefixNoMatches() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("other", "3");
        Iterator it = ep.getKeys("prefix");
        assertFalse(it.hasNext());
    }

    // ---------------------------------------------------------------
    // subset
    // ---------------------------------------------------------------

    @Test
    public void testSubsetValid() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("prefix.a", "1");
        ep.addProperty("prefix.b", "2");
        ExtendedProperties sub = ep.subset("prefix");
        assertNotNull(sub);
        assertEquals("1", sub.get("a"));
        assertEquals("2", sub.get("b"));
    }

    @Test
    public void testSubsetInvalidReturnsNull() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("other", "1");
        ExtendedProperties sub = ep.subset("prefix");
        assertNull(sub);
    }

    @Test
    public void testSubsetExactKeyLengthEqualsPrefixLength() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("prefix", "value"); // key.length() == prefix.length()
        ExtendedProperties sub = ep.subset("prefix");
        assertNotNull(sub);
        assertEquals("value", sub.get("prefix"));
    }

    // ---------------------------------------------------------------
    // display (just verify it doesn't throw)
    // ---------------------------------------------------------------

    @Test
    public void testDisplayDoesNotThrow() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "v");
        ep.display();
    }

    // ---------------------------------------------------------------
    // getString
    // ---------------------------------------------------------------

    @Test
    public void testGetStringFound() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "v");
        assertEquals("v", ep.getString("k"));
    }

    @Test
    public void testGetStringMissingNoDefaultsReturnsDefaultValue() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals("def", ep.getString("missing", "def"));
        assertNull(ep.getString("missing")); // default null
    }

    @Test
    public void testGetStringMissingWithDefaultsObject() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "fromDefaults");
        ExtendedProperties ep = new ExtendedProperties();
        setDefaults(ep, defaults);
        assertEquals("fromDefaults", ep.getString("k", "fallback"));
    }

    @Test
    public void testGetStringListReturnsFirstElement() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "a,b");
        assertEquals("a", ep.getString("k"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", new Integer(5));
        ep.getString("k");
    }

    // ---------------------------------------------------------------
    // getProperties
    // ---------------------------------------------------------------

    @Test
    public void testGetPropertiesNormal() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "a=1,b=2");
        Properties props = ep.getProperties("k");
        assertEquals("1", props.getProperty("a"));
        assertEquals("2", props.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesMalformedToken() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "noEqualsHere");
        ep.getProperties("k");
    }

    @Test
    public void testGetPropertiesEmptyKeyReturnsEmptyProperties() {
        ExtendedProperties ep = new ExtendedProperties();
        Properties props = ep.getProperties("missing");
        assertTrue(props.isEmpty());
    }

    // ---------------------------------------------------------------
    // getStringArray
    // ---------------------------------------------------------------

    @Test
    public void testGetStringArrayFromString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "onlyone");
        String[] arr = ep.getStringArray("k");
        assertArrayEquals(new String[]{"onlyone"}, arr);
    }

    @Test
    public void testGetStringArrayFromList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "a,b");
        String[] arr = ep.getStringArray("k");
        assertArrayEquals(new String[]{"a", "b"}, arr);
    }

    @Test
    public void testGetStringArrayMissingNoDefaultsReturnsEmptyArray() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals(0, ep.getStringArray("missing").length);
    }

    @Test
    public void testGetStringArrayMissingWithDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "x");
        ExtendedProperties ep = new ExtendedProperties();
        setDefaults(ep, defaults);
        assertArrayEquals(new String[]{"x"}, ep.getStringArray("k"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayClassCast() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", new Integer(1));
        ep.getStringArray("k");
    }

    // ---------------------------------------------------------------
    // getVector
    // ---------------------------------------------------------------

    @Test
    public void testGetVectorFromList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "a,b");
        Vector v = ep.getVector("k");
        assertEquals(2, v.size());
    }

    @Test
    public void testGetVectorFromStringAndCachesAsVector() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "single");
        Vector v = ep.getVector("k");
        assertEquals(1, v.size());
        assertEquals("single", v.get(0));
        assertTrue(ep.get("k") instanceof Vector); // side-effect: replaced in map
    }

    @Test
    public void testGetVectorMissingNoDefaultsNoDefaultValueReturnsEmptyVector() {
        ExtendedProperties ep = new ExtendedProperties();
        Vector v = ep.getVector("missing");
        assertNotNull(v);
        assertTrue(v.isEmpty());
    }

    @Test
    public void testGetVectorMissingWithDefaultValue() {
        ExtendedProperties ep = new ExtendedProperties();
        Vector defVal = new Vector();
        defVal.add("d");
        Vector v = ep.getVector("missing", defVal);
        assertSame(defVal, v);
    }

    @Test
    public void testGetVectorMissingWithDefaultsObject() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "fromDef");
        ExtendedProperties ep = new ExtendedProperties();
        setDefaults(ep, defaults);
        Vector v = ep.getVector("k", null);
        assertEquals(1, v.size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetVectorClassCast() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", new Integer(1));
        ep.getVector("k");
    }

    // ---------------------------------------------------------------
    // getList
    // ---------------------------------------------------------------

    @Test
    public void testGetListFromList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "a,b");
        List list = ep.getList("k");
        assertEquals(2, list.size());
    }

    @Test
    public void testGetListFromStringCachesAsList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "single");
        List list = ep.getList("k");
        assertEquals(1, list.size());
        assertTrue(ep.get("k") instanceof List);
    }

    @Test
    public void testGetListMissingNoDefaultsReturnsEmptyList() {
        ExtendedProperties ep = new ExtendedProperties();
        List list = ep.getList("missing");
        assertTrue(list.isEmpty());
    }

    @Test
    public void testGetListMissingWithDefaultValue() {
        ExtendedProperties ep = new ExtendedProperties();
        List defVal = new ArrayList();
        defVal.add("d");
        List list = ep.getList("missing", defVal);
        assertSame(defVal, list);
    }

    @Test(expected = ClassCastException.class)
    public void testGetListClassCast() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", new Integer(1));
        ep.getList("k");
    }

    // ---------------------------------------------------------------
    // getBoolean / testBoolean
    // ---------------------------------------------------------------

    @Test
    public void testTestBooleanTrueValues() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals("true", ep.testBoolean("true"));
        assertEquals("true", ep.testBoolean("ON"));
        assertEquals("true", ep.testBoolean("Yes"));
    }

    @Test
    public void testTestBooleanFalseValues() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals("false", ep.testBoolean("false"));
        assertEquals("false", ep.testBoolean("OFF"));
        assertEquals("false", ep.testBoolean("No"));
    }

    @Test
    public void testTestBooleanInvalidReturnsNull() {
        ExtendedProperties ep = new ExtendedProperties();
        assertNull(ep.testBoolean("maybe"));
    }

    @Test
    public void testGetBooleanFromBooleanObject() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("k", Boolean.TRUE);
        assertTrue(ep.getBoolean("k"));
    }

    @Test
    public void testGetBooleanFromValidString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "true");
        assertTrue(ep.getBoolean("k"));
    }

    @Test
    public void testGetBooleanFromInvalidStringResultsFalse() {
        // NOTE: source behavior - testBoolean returns null for invalid string,
        // then "new Boolean(null)" evaluates to false (NOT defaultValue!)
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "notABoolean");
        assertFalse(ep.getBoolean("k", true));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingNoDefaultThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getBoolean("missing");
    }

    @Test
    public void testGetBooleanMissingWithDefaultValue() {
        ExtendedProperties ep = new ExtendedProperties();
        assertTrue(ep.getBoolean("missing", true));
    }

    @Test
    public void testGetBooleanMissingWithDefaultsObject() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("k", "true");
        ExtendedProperties ep = new ExtendedProperties();
        setDefaults(ep, defaults);
        assertTrue(ep.getBoolean("k", Boolean.FALSE).booleanValue());
    }

    @Test(expected = ClassCastException.class)
    public void testGetBooleanClassCast() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", new Integer(1));
        ep.getBoolean("k");
    }

    // ---------------------------------------------------------------
    // getByte
    // ---------------------------------------------------------------

    @Test
    public void testGetByteFromByteObject() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("k", new Byte((byte) 5));
        assertEquals(5, ep.getByte("k"));
    }

    @Test
    public void testGetByteFromString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "7");
        assertEquals(7, ep.getByte("k"));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByteInvalidStringThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "notNumber");
        ep.getByte("k");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteMissingNoDefaultThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getByte("missing");
    }

    @Test
    public void testGetByteMissingWithDefaultValue() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals(9, ep.getByte("missing", (byte) 9));
    }

    @Test(expected = ClassCastException.class)
    public void testGetByteClassCast() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", new Integer(1));
        ep.getByte("k");
    }

    // ---------------------------------------------------------------
    // getShort
    // ---------------------------------------------------------------

    @Test
    public void testGetShortFromString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "123");
        assertEquals(123, ep.getShort("k"));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetShortInvalidStringThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "bad");
        ep.getShort("k");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortMissingNoDefaultThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getShort("missing");
    }

    @Test
    public void testGetShortMissingWithDefaultValue() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals(3, ep.getShort("missing", (short) 3));
    }

    // ---------------------------------------------------------------
    // getInt / getInteger
    // ---------------------------------------------------------------

    @Test
    public void testGetIntFromString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "42");
        assertEquals(42, ep.getInt("k"));
    }

    @Test
    public void testGetIntWithDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals(99, ep.getInt("missing", 99));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetIntegerInvalidStringThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "bad");
        ep.getInteger("k");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissingNoDefaultThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getInteger("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerClassCast() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", Boolean.TRUE);
        ep.getInteger("k");
    }

    // ---------------------------------------------------------------
    // getLong
    // ---------------------------------------------------------------

    @Test
    public void testGetLongFromString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "123456789");
        assertEquals(123456789L, ep.getLong("k"));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLongInvalidStringThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "bad");
        ep.getLong("k");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissingNoDefaultThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getLong("missing");
    }

    @Test
    public void testGetLongWithDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals(5L, ep.getLong("missing", 5L));
    }

    // ---------------------------------------------------------------
    // getFloat
    // ---------------------------------------------------------------

    @Test
    public void testGetFloatFromString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "1.5");
        assertEquals(1.5f, ep.getFloat("k"), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFloatInvalidStringThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "bad");
        ep.getFloat("k");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissingNoDefaultThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getFloat("missing");
    }

    @Test
    public void testGetFloatWithDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals(2.5f, ep.getFloat("missing", 2.5f), 0.0001);
    }

    // ---------------------------------------------------------------
    // getDouble
    // ---------------------------------------------------------------

    @Test
    public void testGetDoubleFromString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "1.25");
        assertEquals(1.25, ep.getDouble("k"), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetDoubleInvalidStringThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "bad");
        ep.getDouble("k");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissingNoDefaultThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getDouble("missing");
    }

    @Test
    public void testGetDoubleWithDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals(3.5, ep.getDouble("missing", 3.5), 0.0001);
    }

    @Test(expected = ClassCastException.class)
    public void testGetDoubleClassCast() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", Boolean.TRUE);
        ep.getDouble("k");
    }

    // ---------------------------------------------------------------
    // convertProperties
    // ---------------------------------------------------------------

    @Test
    public void testConvertProperties() {
        Properties p = new Properties();
        p.setProperty("a", "1");
        p.setProperty("b", "2");
        ExtendedProperties ep = ExtendedProperties.convertProperties(p);
        assertEquals("1", ep.getString("a"));
        assertEquals("2", ep.getString("b"));
    }

    // ---------------------------------------------------------------
    // put / remove (overridden Hashtable methods)
    // ---------------------------------------------------------------

    @Test
    public void testPutReturnsOldValueAndStoresNew() {
        ExtendedProperties ep = new ExtendedProperties();
        Object old1 = ep.put("k", "v1");
        assertNull(old1);
        Object old2 = ep.put("k", "v2");
        // put() calls addProperty which for existing String converts to a List (via addPropertyInternal)
        // so getProperty("k") before second put should have been "v1"
        assertEquals("v1", old2);
    }

    @Test
    public void testPutWithNonStringKeyConvertsToString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put(new Integer(1), "v");
        assertEquals("v", ep.get("1"));
    }

    @Test
    public void testRemoveReturnsOldValueAndClears() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k", "v");
        Object removed = ep.remove("k");
        assertEquals("v", removed);
        assertFalse(ep.containsKey("k"));
    }

    @Test
    public void testRemoveNonExistingReturnsNull() {
        ExtendedProperties ep = new ExtendedProperties();
        assertNull(ep.remove("missing"));
    }

    // ---------------------------------------------------------------
    // putAll
    // ---------------------------------------------------------------

    @Test
    public void testPutAllWithExtendedPropertiesPreservesOrder() {
        ExtendedProperties src = new ExtendedProperties();
        src.addProperty("b", "1");
        src.addProperty("a", "2");

        ExtendedProperties target = new ExtendedProperties();
        target.putAll(src);

        Iterator it = target.getKeys();
        assertEquals("b", it.next());
        assertEquals("a", it.next());
    }

    @Test
    public void testPutAllWithPlainMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("x", "1");

        ExtendedProperties target = new ExtendedProperties();
        target.putAll(map);

        assertEquals("1", target.getString("x"));
    }

    // ---------------------------------------------------------------
    // interpolate / interpolateHelper
    // ---------------------------------------------------------------

    @Test
    public void testInterpolateSimpleSubstitution() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("name", "world");
        ep.addProperty("greeting", "Hello ${name}!");
        assertEquals("Hello world!", ep.getString("greeting"));
    }

    @Test
    public void testInterpolateUndefinedVariableKeptAsIs() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("greeting", "Hello ${undefined}!");
        assertEquals("Hello ${undefined}!", ep.getString("greeting"));
    }

    @Test
    public void testInterpolateWithDefaultsFallback() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("name", "fromDefaults");
        ExtendedProperties ep = new ExtendedProperties();
        setDefaults(ep, defaults);
        ep.addProperty("greeting", "Hi ${name}");
        assertEquals("Hi fromDefaults", ep.getString("greeting"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolateLoopThrowsIllegalStateException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("a", "${b}");
        ep.addProperty("b", "${a}");
        ep.getString("a");
    }

    @Test
    public void testInterpolateMultipleVariablesInOneValue() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("x", "1");
        ep.addProperty("y", "2");
        ep.addProperty("both", "${x}-${y}");
        assertEquals("1-2", ep.getString("both"));
    }

    // ---------------------------------------------------------------
    // helpers
    // ---------------------------------------------------------------

    private static void writeFile(File f, String content) throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        try {
            fos.write(content.getBytes("8859_1"));
        } finally {
            fos.close();
        }
    }

    /**
     * The 'defaults' field is private with no public setter, so we simulate
     * the "has defaults" scenario by using the two-argument constructor
     * chain indirectly is not always convenient in unit tests; here we use
     * the constructor-with-default-file mechanism isn't exposed either.
     * Since there's no public API to inject 'defaults' directly other than
     * via constructor(file, defaultFile), for pure in-memory objects we rely
     * on reflection as a pragmatic test utility (NOT part of production behavior).
     */
    private static void setDefaults(ExtendedProperties target, ExtendedProperties defaults) {
        try {
            java.lang.reflect.Field f = ExtendedProperties.class.getDeclaredField("defaults");
            f.setAccessible(true);
            f.set(target, defaults);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
