# วิเคราะห์และสร้าง Unit Test สำหรับ `Entities` (Lang-42b)

**หมายเหตุสำคัญ:** คลาส `Entities` และ inner class ต่าง ๆ (`PrimitiveEntityMap`, `LookupEntityMap`, `ArrayEntityMap`, `BinaryEntityMap` ฯลฯ) เป็น **package-private** ดังนั้นไฟล์ทดสอบต้องอยู่ใน package เดียวกัน (`org.apache.commons.lang`) จึงไม่มี `import` คลาสเป้าหมายแบบข้าม package (เข้าถึงได้โดยตรงเพราะอยู่ package เดียวกัน)

```java
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * JUnit4 test suite for package-private class org.apache.commons.lang.Entities
 * (Defects4J Lang-42b)
 */
public class EntitiesTest {

    // Writer ที่จำลองการ throw IOException เพื่อทดสอบ escape(Writer,String)/unescape(Writer,String)
    private static class ThrowingWriter extends Writer {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("boom");
        }
        @Override
        public void flush() throws IOException { }
        @Override
        public void close() throws IOException { }
    }

    // ---------------------------------------------------------------
    // Static instances (XML, HTML32, HTML40)
    // ---------------------------------------------------------------

    @Test
    public void testXmlEntities() {
        assertEquals(34, Entities.XML.entityValue("quot"));
        assertEquals(38, Entities.XML.entityValue("amp"));
        assertEquals(60, Entities.XML.entityValue("lt"));
        assertEquals(62, Entities.XML.entityValue("gt"));
        assertEquals(39, Entities.XML.entityValue("apos"));
        assertEquals("amp", Entities.XML.entityName(38));
        // ISO/HTML40 entities should NOT exist in XML set
        assertEquals(-1, Entities.XML.entityValue("nbsp"));
    }

    @Test
    public void testHtml32Entities() {
        assertEquals(38, Entities.HTML32.entityValue("amp"));
        assertEquals(160, Entities.HTML32.entityValue("nbsp"));
        assertEquals(255, Entities.HTML32.entityValue("yuml"));
        // HTML40-only entity must not exist
        assertEquals(-1, Entities.HTML32.entityValue("euro"));
    }

    @Test
    public void testHtml40Entities() {
        assertEquals(38, Entities.HTML40.entityValue("amp"));
        assertEquals(160, Entities.HTML40.entityValue("nbsp"));
        assertEquals(8364, Entities.HTML40.entityValue("euro"));
    }

    @Test
    public void testFillWithHtml40EntitiesDirect() {
        Entities e = new Entities();
        Entities.fillWithHtml40Entities(e);
        assertEquals(38, e.entityValue("amp"));
        assertEquals(160, e.entityValue("nbsp"));
        assertEquals(8364, e.entityValue("euro"));
    }

    // ---------------------------------------------------------------
    // addEntity / addEntities / entityValue / entityName
    // ---------------------------------------------------------------

    @Test
    public void testAddEntityAndLookup() {
        Entities e = new Entities();
        e.addEntity("foo", 161);
        assertEquals(161, e.entityValue("foo"));
        assertEquals("foo", e.entityName(161));
    }

    @Test
    public void testEntityValueUnknownReturnsMinusOne() {
        Entities e = new Entities();
        assertEquals(-1, e.entityValue("doesNotExist"));
    }

    @Test
    public void testEntityValueNullName() {
        // boundary: null name -> underlying HashMap.get(null) ไม่ throw, ต้องได้ -1
        Entities e = new Entities();
        assertEquals(-1, e.entityValue(null));
    }

    @Test
    public void testEntityNameUnknownReturnsNull() {
        Entities e = new Entities();
        assertNull(e.entityName(99999));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEntityNameNegativeValueThrowsAIOOBE() {
        // จากซอร์ส LookupEntityMap.name(int): if(value<256) return lookupTable()[value];
        // value = -1 < 256 -> index -1 -> AIOOBE (ไม่มีการตรวจ value < 0)
        Entities e = new Entities();
        e.entityName(-1);
    }

    @Test
    public void testAddEntitiesEmptyArray() {
        // loop 0 iteration boundary
        Entities e = new Entities();
        e.addEntities(new String[0][]);
        assertEquals(-1, e.entityValue("anything"));
    }

    @Test(expected = NumberFormatException.class)
    public void testAddEntitiesMalformedNumberThrows() {
        Entities e = new Entities();
        e.addEntities(new String[][]{{"bad", "notanumber"}});
    }

    @Test
    public void testNewEntitiesInstanceIsIndependent() {
        Entities e1 = new Entities();
        e1.addEntity("foo", 999);
        Entities e2 = new Entities();
        assertEquals(-1, e2.entityValue("foo"));
    }

    // ---------------------------------------------------------------
    // escape(String) / escape(Writer, String)
    // ---------------------------------------------------------------

    @Test
    public void testEscapeEmptyString() {
        Entities e = new Entities();
        assertEquals("", e.escape(""));
    }

    @Test
    public void testEscapeKnownEntity() {
        Entities e = new Entities();
        e.addEntity("foo", 0xA1);
        assertEquals("&foo;", e.escape("\u00A1"));
    }

    @Test
    public void testEscapeBoundary7FLiteral() {
        // c > 0x7F == false -> เขียนตัวอักษรตรง ๆ
        Entities e = new Entities();
        assertEquals("\u007F", e.escape("\u007F"));
    }

    @Test
    public void testEscapeBoundary80NumericEscape() {
        // c > 0x7F == true, ไม่มี entity -> &#128;
        Entities e = new Entities();
        assertEquals("&#128;", e.escape("\u0080"));
    }

    @Test
    public void testEscapeAsciiNoEntityLiteral() {
        Entities e = new Entities();
        assertEquals("A", e.escape("A"));
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeNullThrowsNPE() {
        Entities e = new Entities();
        e.escape(null);
    }

    @Test(expected = IOException.class)
    public void testEscapeWriterPropagatesIOException() throws IOException {
        Entities e = new Entities();
        e.escape(new ThrowingWriter(), "A");
    }

    // ---------------------------------------------------------------
    // unescape(String) / unescape(Writer, String)
    // ---------------------------------------------------------------

    @Test
    public void testUnescapeNoAmpersandReturnsSameString() {
        Entities e = new Entities();
        assertEquals("hello", e.unescape("hello"));
    }

    @Test
    public void testUnescapeEmptyStringReturnsSame() {
        Entities e = new Entities();
        assertEquals("", e.unescape(""));
    }

    @Test(expected = NullPointerException.class)
    public void testUnescapeNullThrowsNPE() {
        Entities e = new Entities();
        e.unescape(null);
    }

    @Test
    public void testUnescapeKnownEntityName() {
        Entities e = new Entities();
        e.addEntity("amp", 38);
        assertEquals("a & b", e.unescape("a &amp; b"));
    }

    @Test
    public void testUnescapeDecimalNumeric() {
        Entities e = new Entities();
        assertEquals("A", e.unescape("&#65;"));
    }

    @Test
    public void testUnescapeHexLowercase() {
        Entities e = new Entities();
        assertEquals("A", e.unescape("&#x41;"));
    }

    @Test
    public void testUnescapeHexUppercase() {
        Entities e = new Entities();
        assertEquals("A", e.unescape("&#X41;"));
    }

    @Test
    public void testUnescapeNoSemicolonKeepsLiteral() {
        // semiColonIdx == -1 -> เขียน '&' แล้ว continue (ไม่ทำ entity resolution)
        Entities e = new Entities();
        assertEquals("&amp no semi", e.unescape("&amp no semi"));
    }

    @Test
    public void testUnescapeTwoAmpersandsBeforeSemicolon() {
        // "&amp&amp;" -> amphersandIdx < semiColonIdx -> เขียน '&' literal แล้ว continue
        // รอบสอง &amp; resolve เป็น '&' (38) จริง
        Entities e = new Entities();
        e.addEntity("amp", 38);
        assertEquals("&amp&", e.unescape("&amp&amp;"));
    }

    @Test
    public void testUnescapeUnknownEntityNameKeepsLiteral() {
        Entities e = new Entities();
        assertEquals("&unknown;", e.unescape("&unknown;"));
    }

    @Test
    public void testUnescapeEmptyEntityContentKeepsLiteral() {
        // entityContentLen == 0 -> entityValue ยังเป็น -1
        Entities e = new Entities();
        assertEquals("&;", e.unescape("&;"));
    }

    @Test
    public void testUnescapeHashOnlyKeepsLiteral() {
        // entityContent = "#" length==1 -> if(entityContentLen>1) false -> ไม่ parse
        Entities e = new Entities();
        assertEquals("&#;", e.unescape("&#;"));
    }

    @Test
    public void testUnescapeNumericOverflowKeepsLiteral() {
        Entities e = new Entities();
        assertEquals("&#99999;", e.unescape("&#99999;"));
    }

    @Test
    public void testUnescapeNumericBoundaryValid() {
        // 0xFFFF (65535) ไม่ > 0xFFFF -> ยังถูกต้อง
        Entities e = new Entities();
        assertEquals(String.valueOf((char) 65535), e.unescape("&#65535;"));
    }

    @Test
    public void testUnescapeNumericBoundaryInvalid() {
        // 65536 > 0xFFFF -> entityValue = -1
        Entities e = new Entities();
        assertEquals("&#65536;", e.unescape("&#65536;"));
    }

    @Test
    public void testUnescapeInvalidDecimalNumberFormatKeepsLiteral() {
        Entities e = new Entities();
        assertEquals("&#abc;", e.unescape("&#abc;"));
    }

    @Test
    public void testUnescapeInvalidHexNumberFormatKeepsLiteral() {
        Entities e = new Entities();
        assertEquals("&#xZZ;", e.unescape("&#xZZ;"));
    }

    @Test
    public void testUnescapeWriterNoAmpersand() throws IOException {
        Entities e = new Entities();
        StringWriter sw = new StringWriter();
        e.unescape(sw, "plain text");
        assertEquals("plain text", sw.toString());
    }

    @Test
    public void testUnescapeWriterWithAmpersand() throws IOException {
        Entities e = new Entities();
        e.addEntity("amp", 38);
        StringWriter sw = new StringWriter();
        e.unescape(sw, "x &amp; y");
        assertEquals("x & y", sw.toString());
    }

    @Test(expected = IOException.class)
    public void testUnescapeWriterPropagatesIOExceptionNoAmp() throws IOException {
        Entities e = new Entities();
        e.unescape(new ThrowingWriter(), "no amp here");
    }

    @Test(expected = IOException.class)
    public void testUnescapeWriterPropagatesIOExceptionWithAmp() throws IOException {
        Entities e = new Entities();
        e.unescape(new ThrowingWriter(), "a&amp;b");
    }

    // ---------------------------------------------------------------
    // PrimitiveEntityMap
    // ---------------------------------------------------------------

    @Test
    public void testPrimitiveEntityMap() {
        Entities.PrimitiveEntityMap pem = new Entities.PrimitiveEntityMap();
        pem.add("amp", 38);
        assertEquals(38, pem.value("amp"));
        assertEquals("amp", pem.name(38));
        assertEquals(-1, pem.value("missing"));
        assertNull(pem.name(9999));
    }

    // ---------------------------------------------------------------
    // HashEntityMap / TreeEntityMap (MapIntMap)
    // ---------------------------------------------------------------

    @Test
    public void testHashEntityMap() {
        Entities.HashEntityMap hem = new Entities.HashEntityMap();
        hem.add("amp", 38);
        assertEquals(38, hem.value("amp"));
        assertEquals("amp", hem.name(38));
        assertEquals(-1, hem.value("x"));
        assertNull(hem.name(999));
    }

    @Test
    public void testTreeEntityMap() {
        Entities.TreeEntityMap tem = new Entities.TreeEntityMap();
        tem.add("lt", 60);
        assertEquals(60, tem.value("lt"));
        assertEquals("lt", tem.name(60));
        assertEquals(-1, tem.value("x"));
        assertNull(tem.name(999));
    }

    // ---------------------------------------------------------------
    // LookupEntityMap
    // ---------------------------------------------------------------

    @Test
    public void testLookupEntityMapHighValueBranch() {
        Entities.LookupEntityMap lem = new Entities.LookupEntityMap();
        lem.add("euro", 8364); // value >= 256 -> ใช้ super.name() (PrimitiveEntityMap)
        assertEquals("euro", lem.name(8364));
        assertEquals(-1, lem.value("missing"));
    }

    @Test
    public void testLookupEntityMapCachingQuirk() {
        // ทดสอบพฤติกรรมตามซอร์สจริง: lookupTable ถูกสร้าง (cache) ครั้งแรกที่เรียก name()
        // สำหรับ value<256 เท่านั้น ถ้า add() ค่าใหม่ใน range 0..255 "หลัง" จากที่
        // lookupTable ถูกสร้างไปแล้ว ค่านั้นจะไม่ถูกเห็น (stale cache) -- นี่คือ branch
        // if(lookupTable==null) ที่ source กำหนดไว้ (ไม่ได้เดา เป็นผลจาก logic ตรง ๆ)
        Entities.LookupEntityMap lem = new Entities.LookupEntityMap();
        lem.add("amp", 38);
        assertEquals("amp", lem.name(38)); // สร้าง lookupTable (lookupTable==null -> true)
        assertEquals("amp", lem.name(38)); // ใช้ cache (lookupTable==null -> false)

        lem.add("lt", 60); // เพิ่มหลัง cache ถูกสร้างแล้ว
        assertNull(lem.name(60)); // stale cache -> ไม่เจอ (ตาม logic ของซอร์ส)
    }

    // ---------------------------------------------------------------
    // ArrayEntityMap
    // ---------------------------------------------------------------

    @Test
    public void testArrayEntityMapBasic() {
        Entities.ArrayEntityMap aem = new Entities.ArrayEntityMap();
        aem.add("amp", 38);
        aem.add("lt", 60);
        assertEquals(38, aem.value("amp"));
        assertEquals(60, aem.value("lt"));
        assertEquals(-1, aem.value("missing"));
        assertEquals("amp", aem.name(38));
        assertNull(aem.name(9999));
    }

    @Test
    public void testArrayEntityMapGrowth() {
        // growBy = 2 เล็ก ๆ เพื่อบีบให้ ensureCapacity ขยายหลายครั้ง
        Entities.ArrayEntityMap aem = new Entities.ArrayEntityMap(2);
        for (int i = 0; i < 5; i++) {
            aem.add("e" + i, i);
        }
        for (int i = 0; i < 5; i++) {
            assertEquals(i, aem.value("e" + i));
            assertEquals("e" + i, aem.name(i));
        }
        assertTrue(aem.names.length >= 5); // ยืนยันว่า array โตขึ้นจริง (package-access field)
    }

    // ---------------------------------------------------------------
    // BinaryEntityMap
    // ---------------------------------------------------------------

    @Test
    public void testBinaryEntityMapSortedOrderAndSearch() {
        Entities.BinaryEntityMap bem = new Entities.BinaryEntityMap();
        bem.add("b", 2);
        bem.add("a", 1);
        bem.add("c", 3);
        // ครอบคลุม binarySearch: midVal<key, midVal>key, midVal==key
        assertEquals("a", bem.name(1));
        assertEquals("b", bem.name(2));
        assertEquals("c", bem.name(3));
        assertNull(bem.name(5)); // not found branch
    }

    @Test
    public void testBinaryEntityMapDuplicateRejectionNonZeroIndex() {
        Entities.BinaryEntityMap bem = new Entities.BinaryEntityMap(2); // test growBy ctor too
        bem.add("a", 1);
        bem.add("b", 2);
        bem.add("c", 3);
        assertEquals(3, bem.size);
        bem.add("dup-b", 2); // value พบที่ index 1 (>0) -> insertAt>0 -> return early
        assertEquals(3, bem.size); // ไม่เพิ่ม
        assertEquals("b", bem.name(2)); // ชื่อเดิมไม่เปลี่ยน
    }

    @Test
    public void testBinaryEntityMapDuplicateAtZeroIndexQuirk() {
        // ตามซอร์ส: if (insertAt > 0) return; -- ถ้า duplicate ถูกพบที่ index 0
        // (insertAt == 0) เงื่อนไขนี้เป็น false จึงไม่ return และยังแทรกค่าซ้ำได้จริง
        // (ข้อบกพร่อง/quirk ที่ค้นพบจากการวิเคราะห์ซอร์สตรง ๆ ไม่ได้เดา)
        Entities.BinaryEntityMap bem = new Entities.BinaryEntityMap();
        bem.add("first", 10); // size=1, index0
        assertEquals(1, bem.size);
        bem.add("dupAtZero", 10); // insertAt == 0 -> ไม่ return -> ถูกแทรกซ้ำ
        assertEquals(2, bem.size); // แสดง quirk: ขนาดเพิ่มทั้งที่ควรถูกปฏิเสธ
    }
}
```

## สรุปการครอบคลุม Branch/Condition ของแต่ละเทส

| กลุ่ม | เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Static instances | testXmlEntities, testHtml32Entities, testHtml40Entities, testFillWithHtml40EntitiesDirect | static initializer ของ XML/HTML32/HTML40, การเรียก addEntities หลายชุด |
| add/lookup | testAddEntityAndLookup, testEntityValueUnknownReturnsMinusOne, testEntityValueNullName | `value==null` true/false ใน `value()` |
| entityName | testEntityNameUnknownReturnsNull, testEntityNameNegativeValueThrowsAIOOBE | `value<LOOKUP_TABLE_SIZE` true (negative index bug), not-found branch |
| addEntities loop | testAddEntitiesEmptyArray, testAddEntitiesMalformedNumberThrows | loop 0 iteration, NumberFormatException path |
| isolation | testNewEntitiesInstanceIsIndependent | instance field `map` init ต่อ instance |
| escape(String) | testEscapeEmptyString, testEscapeKnownEntity, testEscapeBoundary7FLiteral, testEscapeBoundary80NumericEscape, testEscapeAsciiNoEntityLiteral | `entityName==null` true/false, `c>0x7F` true/false (boundary 0x7F/0x80), loop 0 iteration |
| escape null/IO | testEscapeNullThrowsNPE, testEscapeWriterPropagatesIOException | NPE จาก null input, IOException propagate branch |
| unescape(String) base | testUnescapeNoAmpersandReturnsSameString, testUnescapeEmptyStringReturnsSame, testUnescapeNullThrowsNPE | `firstAmp<0` true/false, null NPE |
| unescape entity name | testUnescapeKnownEntityName, testUnescapeUnknownEntityNameKeepsLiteral | `entityValue==-1` true/false (named entity) |
| unescape numeric | testUnescapeDecimalNumeric, testUnescapeHexLowercase, testUnescapeHexUppercase | switch case default/'x'/'X' |
| unescape malformed | testUnescapeNoSemicolonKeepsLiteral, testUnescapeTwoAmpersandsBeforeSemicolon, testUnescapeEmptyEntityContentKeepsLiteral, testUnescapeHashOnlyKeepsLiteral | `semiColonIdx==-1`, `amphersandIdx<semiColonIdx`, `entityContentLen>0`, `entityContentLen>1` |
| unescape numeric edge | testUnescapeNumericOverflowKeepsLiteral, testUnescapeNumericBoundaryValid, testUnescapeNumericBoundaryInvalid, testUnescapeInvalidDecimalNumberFormatKeepsLiteral, testUnescapeInvalidHexNumberFormatKeepsLiteral | `entityValue>0xFFFF` boundary, NumberFormatException catch |
| unescape(Writer) | testUnescapeWriterNoAmpersand, testUnescapeWriterWithAmpersand, testUnescapeWriterPropagatesIOException* | `firstAmp<0` branch ของ overload, IOException propagate |
| PrimitiveEntityMap | testPrimitiveEntityMap | add/name/value found & not-found |
| HashEntityMap/TreeEntityMap | testHashEntityMap, testTreeEntityMap | MapIntMap.value()==null true/false |
| LookupEntityMap | testLookupEntityMapHighValueBranch, testLookupEntityMapCachingQuirk | `value<256` true/false, `lookupTable==null` true/false (cache) |
| ArrayEntityMap | testArrayEntityMapBasic, testArrayEntityMapGrowth | loop found/not-found, `ensureCapacity: capacity>names.length` true/false |
| BinaryEntityMap | testBinaryEntityMapSortedOrderAndSearch, testBinaryEntityMapDuplicateRejectionNonZeroIndex, testBinaryEntityMapDuplicateAtZeroIndexQuirk | binarySearch `midVal<key/>key/==key`, `insertAt>0` true/false (รวม edge case index 0) |

**หมายเหตุ:** branch ของ `catch (IOException e) { throw new UnhandledException(e); }` ใน `escape(String)`/`unescape(String)` ไม่สามารถทดสอบได้จริงผ่าน public API เพราะ `StringWriter` ไม่ throw `IOException` ตามเอกสาร JDK — จึงไม่ได้เขียนเทสสำหรับ branch นี้เพื่อไม่ guess behavior ที่ไม่สามารถ trigger ได้จริง