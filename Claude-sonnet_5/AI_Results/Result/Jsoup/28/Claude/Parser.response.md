# ParserTest.java

```java
package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.parser.Parser (Defects4J Jsoup-28b)
 * หมายเหตุ: วางไฟล์ไว้ใน package org.jsoup.parser เดียวกัน
 * เพื่อให้สามารถใช้ package-private class เช่น HtmlTreeBuilder / XmlTreeBuilder ได้
 * (ไม่สามารถยืนยัน visibility ของ class เหล่านี้จาก source ที่ให้มาเพียงอย่างเดียว)
 */
public class ParserTest {

    private HtmlTreeBuilder htmlTreeBuilder;
    private Parser parser;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
        parser = new Parser(htmlTreeBuilder);
    }

    // ---------- Constructor & getTreeBuilder ----------
    @Test
    public void testConstructorSetsTreeBuilder() {
        assertSame(htmlTreeBuilder, parser.getTreeBuilder());
    }

    // ---------- setTreeBuilder: chaining + replaces instance ----------
    @Test
    public void testSetTreeBuilderReplacesAndChains() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser result = parser.setTreeBuilder(xmlTreeBuilder);
        assertSame(parser, result);                    // method returns this
        assertSame(xmlTreeBuilder, parser.getTreeBuilder());
    }

    // ---------- isTrackErrors(): maxErrors > 0 -> false (default) ----------
    @Test
    public void testIsTrackErrorsDefaultFalse() {
        assertFalse(parser.isTrackErrors());
    }

    // ---------- setTrackErrors(positive) -> isTrackErrors true ----------
    @Test
    public void testSetTrackErrorsPositiveEnablesTracking() {
        Parser result = parser.setTrackErrors(5);
        assertSame(parser, result);                    // chaining
        assertTrue(parser.isTrackErrors());
    }

    // ---------- setTrackErrors(0) boundary -> false ----------
    @Test
    public void testSetTrackErrorsZeroDisablesTracking() {
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
    }

    // ---------- setTrackErrors(negative) -> false ----------
    @Test
    public void testSetTrackErrorsNegativeDisablesTracking() {
        parser.setTrackErrors(-1);
        assertFalse(parser.isTrackErrors());
    }

    // ---------- getErrors() before any parse -> null (field default) ----------
    @Test
    public void testGetErrorsBeforeParseIsNull() {
        assertNull(parser.getErrors());
    }

    // ---------- parseInput(): isTrackErrors()==false branch -> noTracking() ----------
    @Test
    public void testParseInputWithoutTracking() {
        Document doc = parser.parseInput("<html><body><p>Hello</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
        assertNotNull(parser.getErrors());
        assertEquals(0, parser.getErrors().size()); // noTracking list is always empty
    }

    // ---------- parseInput(): isTrackErrors()==true branch -> tracking(maxErrors) ----------
    @Test
    public void testParseInputWithTrackingEnabled() {
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<p>Hello <b>World</p>", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(parser.getErrors());
        assertTrue(parser.getErrors().size() <= 10); // boundary: not exceed maxErrors
    }

    // ---------- parseInput(): empty html string ----------
    @Test
    public void testParseInputEmptyHtml() {
        Document doc = parser.parseInput("", "http://example.com/");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    // ---------- parseInput(): null html ----------
    @Test
    public void testParseInputNullHtmlThrows() {
        // หมายเหตุ: ไม่มี source ของ TreeBuilder.parse ให้ตรวจสอบ behavior ที่ชัดเจน
        // จึงตรวจสอบเพียงว่าเกิด Exception เมื่อ html เป็น null โดยไม่ระบุ type ที่แน่ชัด
        try {
            parser.parseInput(null, "http://example.com/");
            fail("Expected an exception when html input is null");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    // ---------- static parse(html, baseUri) ----------
    @Test
    public void testStaticParse() {
        Document doc = Parser.parse("<html><body><p>Static</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Static", doc.body().text());
    }

    // ---------- static parseFragment() with non-null context ----------
    @Test
    public void testParseFragmentWithContext() {
        Document shell = Document.createShell("http://example.com/");
        Element context = shell.body();
        List<Node> nodes = Parser.parseFragment("<p>Fragment</p>", context, "http://example.com/");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    // ---------- static parseFragment() with null context ----------
    @Test
    public void testParseFragmentWithNullContext() {
        List<Node> nodes = Parser.parseFragment("<p>NoContext</p>", null, "http://example.com/");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    // ---------- static parseFragment() empty html ----------
    @Test
    public void testParseFragmentEmptyHtml() {
        List<Node> nodes = Parser.parseFragment("", null, "http://example.com/");
        assertNotNull(nodes);
        // ไม่ assert ขนาดที่แน่ชัด เนื่องจาก behavior ภายใน HtmlTreeBuilder สำหรับ empty input ไม่ได้อยู่ใน source ที่ให้มา
    }

    // ---------- static parseBodyFragment(): loop with multiple nodes ----------
    @Test
    public void testParseBodyFragmentMultipleNodes() {
        Document doc = Parser.parseBodyFragment("<p>One</p><p>Two</p>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("One Two", doc.body().text());
        assertEquals(2, doc.body().children().size());
    }

    // ---------- static parseBodyFragment(): loop with zero nodes (boundary) ----------
    @Test
    public void testParseBodyFragmentEmptyHtml() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    // ---------- static parseBodyFragmentRelaxed() delegates to parse() ----------
    @Test
    public void testParseBodyFragmentRelaxed() {
        Document doc = Parser.parseBodyFragmentRelaxed("<html><body><p>Relaxed</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Relaxed", doc.body().text());
    }

    // ---------- static htmlParser() factory ----------
    @Test
    public void testHtmlParserFactory() {
        Parser p = Parser.htmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    // ---------- static xmlParser() factory ----------
    @Test
    public void testXmlParserFactory() {
        Parser p = Parser.xmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof XmlTreeBuilder);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorSetsTreeBuilder` | Constructor กำหนด `treeBuilder` ถูกต้อง |
| `testSetTreeBuilderReplacesAndChains` | `setTreeBuilder()` เปลี่ยนค่า + คืนค่า `this` (chaining) |
| `testIsTrackErrorsDefaultFalse` | `isTrackErrors()`: `maxErrors > 0` → false (ค่า default = 0) |
| `testSetTrackErrorsPositiveEnablesTracking` | `setTrackErrors(+)`: `maxErrors > 0` → true, chaining คืน `this` |
| `testSetTrackErrorsZeroDisablesTracking` | boundary `maxErrors == 0` → false |
| `testSetTrackErrorsNegativeDisablesTracking` | `maxErrors < 0` → false |
| `testGetErrorsBeforeParseIsNull` | `errors` field ก่อน parse (ค่า default null) |
| `testParseInputWithoutTracking` | `parseInput()`: branch `isTrackErrors()==false` → `ParseErrorList.noTracking()` |
| `testParseInputWithTrackingEnabled` | `parseInput()`: branch `isTrackErrors()==true` → `ParseErrorList.tracking(maxErrors)` |
| `testParseInputEmptyHtml` | `parseInput()` กับ html ว่าง (edge case) |
| `testParseInputNullHtmlThrows` | `parseInput()` กับ html = null (uncertain behavior, มี comment กำกับ) |
| `testStaticParse` | static `parse()` ทำงานถูกต้อง |
| `testParseFragmentWithContext` | static `parseFragment()` กรณีมี context element |
| `testParseFragmentWithNullContext` | static `parseFragment()` กรณี context = null |
| `testParseFragmentEmptyHtml` | static `parseFragment()` กรณี fragmentHtml ว่าง |
| `testParseBodyFragmentMultipleNodes` | `parseBodyFragment()`: for-loop วน ≥1 ครั้ง (หลาย node) |
| `testParseBodyFragmentEmptyHtml` | `parseBodyFragment()`: for-loop วน 0 ครั้ง (boundary) |
| `testParseBodyFragmentRelaxed` | deprecated `parseBodyFragmentRelaxed()` delegate ไปยัง `parse()` |
| `testHtmlParserFactory` | static factory `htmlParser()` สร้าง `HtmlTreeBuilder` |
| `testXmlParserFactory` | static factory `xmlParser()` สร้าง `XmlTreeBuilder` |

**หมายเหตุสำคัญ:** behavior ของ `TreeBuilder.parse()` (เช่นกรณี html = null) ไม่ได้แสดงอยู่ใน source ที่ให้มา จึงไม่ระบุ exception type ที่แน่ชัดในการ assert เพื่อไม่ guess behavior ที่ไม่มีหลักฐานในซอร์สโค้ด