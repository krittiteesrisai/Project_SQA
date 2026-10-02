# JUnit 4 Test Suite สำหรับ `org.jsoup.parser.Parser`

```java
package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    private Parser htmlParser;
    private Parser xmlParser;

    @Before
    public void setUp() {
        htmlParser = Parser.htmlParser();
        xmlParser = Parser.xmlParser();
    }

    // ---------- Constructor & getTreeBuilder/setTreeBuilder ----------

    @Test
    public void testConstructorSetsTreeBuilderAndDefaultSettings() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser p = new Parser(tb);
        assertSame(tb, p.getTreeBuilder());
        assertNotNull(p.settings()); // defaultSettings() should return non-null
    }

    @Test
    public void testSetTreeBuilderReturnsThisAndUpdatesField() {
        HtmlTreeBuilder tb1 = new HtmlTreeBuilder();
        Parser p = new Parser(tb1);
        HtmlTreeBuilder tb2 = new HtmlTreeBuilder();
        Parser returned = p.setTreeBuilder(tb2);
        assertSame(p, returned); // chaining
        assertSame(tb2, p.getTreeBuilder());
    }

    // ---------- isTrackErrors / setTrackErrors ----------

    @Test
    public void testIsTrackErrorsDefaultFalse() {
        // DEFAULT_MAX_ERRORS = 0, so isTrackErrors() should be false by default
        assertFalse(htmlParser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrorsZeroDisables() {
        Parser p = htmlParser.setTrackErrors(0);
        assertSame(htmlParser, p); // chaining check
        assertFalse(htmlParser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrorsPositiveEnables() {
        htmlParser.setTrackErrors(10);
        assertTrue(htmlParser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrorsNegativeDisables() {
        // maxErrors > 0 is false when negative -> isTrackErrors() false
        htmlParser.setTrackErrors(-5);
        assertFalse(htmlParser.isTrackErrors());
    }

    // ---------- parseInput branch: tracking vs no-tracking ----------

    @Test
    public void testParseInputWithTrackingEnabled() {
        htmlParser.setTrackErrors(10);
        Document doc = htmlParser.parseInput("<html><body><p>Test</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        List<ParseError> errors = htmlParser.getErrors();
        assertNotNull(errors); // tracking list should be non-null
    }

    @Test
    public void testParseInputWithTrackingDisabled() {
        // default: maxErrors = 0 => isTrackErrors() false => errors = noTracking()
        Document doc = htmlParser.parseInput("<html><body><p>Test</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        List<ParseError> errors = htmlParser.getErrors();
        assertNotNull(errors);
        assertEquals(0, errors.size()); // noTracking list typically empty/no-op
    }

    @Test
    public void testParseInputEmptyHtml() {
        Document doc = htmlParser.parseInput("", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testParseInputNullHtmlThrowsOrHandles() {
        // ไม่แน่ใจพฤติกรรมแน่ชัดถ้า html เป็น null (อาจ NPE จาก treeBuilder)
        // ครอบคลุม branch นี้ด้วยการตรวจสอบว่า throws Exception
        try {
            htmlParser.parseInput(null, "http://example.com/");
            fail("Expected an exception for null html input");
        } catch (Exception e) {
            // expected - behavior not explicitly defined in source, so just assert exception thrown
            assertTrue(true);
        }
    }

    // ---------- getErrors ----------

    @Test
    public void testGetErrorsBeforeParseIsNull() {
        // errors field is not initialized until parseInput() is called
        assertNull(htmlParser.getErrors());
    }

    // ---------- settings() getter/setter ----------

    @Test
    public void testSettingsSetterGetter() {
        ParseSettings customSettings = new ParseSettings(true, true);
        Parser p = htmlParser.settings(customSettings);
        assertSame(htmlParser, p); // chaining
        assertSame(customSettings, htmlParser.settings());
    }

    // ---------- static parse(html, baseUri) ----------

    @Test
    public void testStaticParseValidHtml() {
        Document doc = Parser.parse("<html><head><title>T</title></head><body>Hello</body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("T", doc.title());
    }

    @Test
    public void testStaticParseEmptyString() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void testStaticParseMalformedHtml() {
        // malformed/unclosed tags - jsoup should still produce a document without throwing
        Document doc = Parser.parse("<div><p>unclosed", "http://example.com/");
        assertNotNull(doc);
    }

    // ---------- static parseFragment ----------

    @Test
    public void testParseFragmentWithNullContext() {
        List<Node> nodes = Parser.parseFragment("<p>Hello</p>", null, "http://example.com/");
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
    }

    @Test
    public void testParseFragmentWithContext() {
        Document doc = Document.createShell("http://example.com/");
        Element body = doc.body();
        List<Node> nodes = Parser.parseFragment("<span>Hi</span>", body, "http://example.com/");
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
    }

    @Test
    public void testParseFragmentEmptyHtml() {
        List<Node> nodes = Parser.parseFragment("", null, "http://example.com/");
        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    // ---------- static parseXmlFragment ----------

    @Test
    public void testParseXmlFragmentValid() {
        List<Node> nodes = Parser.parseXmlFragment("<tag>val</tag>", "http://example.com/");
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
    }

    @Test
    public void testParseXmlFragmentEmpty() {
        List<Node> nodes = Parser.parseXmlFragment("", "http://example.com/");
        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    // ---------- static parseBodyFragment - loop branch coverage ----------

    @Test
    public void testParseBodyFragmentZeroNodes() {
        // empty html -> nodeList.size() == 0 -> nodes.length == 0 -> loop condition (i>0) false immediately
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc);
        assertEquals(0, doc.body().childNodeSize());
    }

    @Test
    public void testParseBodyFragmentSingleNode() {
        // nodes.length == 1 -> i = 0 -> loop body never executes (i>0 false)
        Document doc = Parser.parseBodyFragment("<p>One</p>", "http://example.com/");
        assertNotNull(doc);
        assertEquals(1, doc.body().childNodeSize());
    }

    @Test
    public void testParseBodyFragmentMultipleNodes() {
        // nodes.length > 1 -> loop executes at least once (removes all but first, then re-appends all)
        Document doc = Parser.parseBodyFragment("<p>One</p><p>Two</p><p>Three</p>", "http://example.com/");
        assertNotNull(doc);
        assertEquals(3, doc.body().childNodeSize());
        assertEquals("One", doc.body().child(0).text());
        assertEquals("Two", doc.body().child(1).text());
        assertEquals("Three", doc.body().child(2).text());
    }

    // ---------- unescapeEntities ----------

    @Test
    public void testUnescapeEntitiesInAttributeTrue() {
        String result = Parser.unescapeEntities("&amp;", true);
        assertEquals("&", result);
    }

    @Test
    public void testUnescapeEntitiesInAttributeFalse() {
        String result = Parser.unescapeEntities("&amp;", false);
        assertEquals("&", result);
    }

    @Test
    public void testUnescapeEntitiesEmptyString() {
        String result = Parser.unescapeEntities("", false);
        assertEquals("", result);
    }

    @Test
    public void testUnescapeEntitiesNoEntities() {
        String result = Parser.unescapeEntities("plain text", false);
        assertEquals("plain text", result);
    }

    // ---------- parseBodyFragmentRelaxed (deprecated) ----------

    @Test
    public void testParseBodyFragmentRelaxedDelegatesToParse() {
        Document doc = Parser.parseBodyFragmentRelaxed("<p>Relaxed</p>", "http://example.com/");
        assertNotNull(doc);
        // Should behave same as Parser.parse - full doc not just body
        assertTrue(doc.body().text().contains("Relaxed"));
    }

    // ---------- static factory methods ----------

    @Test
    public void testHtmlParserFactoryCreatesHtmlTreeBuilder() {
        Parser p = Parser.htmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testXmlParserFactoryCreatesXmlTreeBuilder() {
        Parser p = Parser.xmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof XmlTreeBuilder);
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorSetsTreeBuilderAndDefaultSettings` | Constructor assignment, `treeBuilder.defaultSettings()` |
| `testSetTreeBuilderReturnsThisAndUpdatesField` | `setTreeBuilder()` setter + chaining return |
| `testIsTrackErrorsDefaultFalse` | `isTrackErrors()`: `maxErrors > 0` → false (default=0) |
| `testSetTrackErrorsZeroDisables` | `setTrackErrors(0)` → `isTrackErrors()` false |
| `testSetTrackErrorsPositiveEnables` | `setTrackErrors(10)` → `isTrackErrors()` true |
| `testSetTrackErrorsNegativeDisables` | boundary: negative maxErrors → false branch |
| `testParseInputWithTrackingEnabled` | `parseInput()`: ternary true branch (`ParseErrorList.tracking`) |
| `testParseInputWithTrackingDisabled` | `parseInput()`: ternary false branch (`ParseErrorList.noTracking`) |
| `testParseInputEmptyHtml` | boundary: empty string input |
| `testParseInputNullHtmlThrowsOrHandles` | null input, unverified behavior (คอมเมนต์กำกับ) |
| `testGetErrorsBeforeParseIsNull` | `getErrors()` ก่อนเรียก parseInput (errors field null) |
| `testSettingsSetterGetter` | `settings()` getter/setter + chaining |
| `testStaticParseValidHtml` | `parse()` static method, valid input |
| `testStaticParseEmptyString` | `parse()` boundary: empty string |
| `testStaticParseMalformedHtml` | `parse()` malformed/unclosed tag input |
| `testParseFragmentWithNullContext` | `parseFragment()`: context == null |
| `testParseFragmentWithContext` | `parseFragment()`: context != null |
| `testParseFragmentEmptyHtml` | `parseFragment()` boundary: empty fragment |
| `testParseXmlFragmentValid` | `parseXmlFragment()` valid input |
| `testParseXmlFragmentEmpty` | `parseXmlFragment()` boundary: empty |
| `testParseBodyFragmentZeroNodes` | loop `for(i=nodes.length-1; i>0; i--)`: length=0 → loop ไม่ execute |
| `testParseBodyFragmentSingleNode` | loop boundary: length=1, i=0 → ไม่ execute |
| `testParseBodyFragmentMultipleNodes` | loop execute: length>1 → remove + re-append all nodes |
| `testUnescapeEntitiesInAttributeTrue` | `unescapeEntities()`: inAttribute = true |
| `testUnescapeEntitiesInAttributeFalse` | `unescapeEntities()`: inAttribute = false |
| `testUnescapeEntitiesEmptyString` | boundary: empty string |
| `testUnescapeEntitiesNoEntities` | input ไม่มี entity ให้แปลง |
| `testParseBodyFragmentRelaxedDelegatesToParse` | deprecated method delegate ไปยัง `parse()` |
| `testHtmlParserFactoryCreatesHtmlTreeBuilder` | `htmlParser()` static factory |
| `testXmlParserFactoryCreatesXmlTreeBuilder` | `xmlParser()` static factory |

**หมายเหตุ:** 
- `testParseInputNullHtmlThrowsOrHandles` เป็นกรณีที่ไม่แน่ใจ behavior ของ `treeBuilder.parse()` เมื่อ html เป็น null เนื่องจากซอร์สที่ให้มาไม่ได้ระบุการจัดการ null ไว้ชัดเจน (อาจโยน NPE จาก CharacterReader หรือที่อื่นใน TreeBuilder) — เทสนี้จึงตรวจแค่ว่ามี exception เกิดขึ้น ไม่ assert ชนิด exception เฉพาะเจาะจง
- Method ที่ comment ไว้ใน source (เช่น parseFragment พร้อม errorList) ไม่มีอยู่จริงในโค้ด จึงไม่ได้เขียนเทสให้