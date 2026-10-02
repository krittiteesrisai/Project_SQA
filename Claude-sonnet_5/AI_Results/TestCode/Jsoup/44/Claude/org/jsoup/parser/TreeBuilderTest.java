package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for TreeBuilder (abstract class) using a Stub subclass
 * to exercise protected/abstract members.
 */
public class TreeBuilderTest {

    /**
     * Stub concrete implementation of TreeBuilder used purely to
     * exercise the logic defined in TreeBuilder itself (not real
     * HTML5 tree construction semantics).
     */
    static class StubTreeBuilder extends TreeBuilder {
        int processCallCount = 0;
        List<Token> seenTokens = new ArrayList<Token>();
        boolean nextReturn = true;

        @Override
        protected boolean process(Token token) {
            processCallCount++;
            seenTokens.add(token);
            return nextReturn;
        }
    }

    private StubTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new StubTreeBuilder();
    }

    // ---------------------------------------------------------------
    // initialiseParse(String, String, ParseErrorList)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void initialiseParse_nullInput_throws() {
        // Assumption: org.jsoup.helper.Validate.notNull throws IllegalArgumentException
        // (ตามพฤติกรรมมาตรฐานของ jsoup Validate class ซึ่งไม่ได้อยู่ใน source ที่ให้มา
        // แต่ถูกเรียกใช้ตรงใน initialiseParse)
        builder.initialiseParse(null, "http://example.com/", ParseErrorList.noTracking());
    }

    @Test(expected = IllegalArgumentException.class)
    public void initialiseParse_nullBaseUri_throws() {
        builder.initialiseParse("<html></html>", null, ParseErrorList.noTracking());
    }

    @Test
    public void initialiseParse_validInputs_setsFields() {
        ParseErrorList errors = ParseErrorList.noTracking();
        builder.initialiseParse("<html></html>", "http://example.com/", errors);

        assertNotNull(builder.doc);
        assertNotNull(builder.reader);
        assertNotNull(builder.tokeniser);
        assertNotNull(builder.stack);
        assertEquals(0, builder.stack.size());
        assertEquals("http://example.com/", builder.baseUri);
        assertSame(errors, builder.errors);
    }

    @Test
    public void initialiseParse_emptyStringInput_doesNotThrow() {
        // Boundary case: empty string is a valid (non-null) input
        builder.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        assertNotNull(builder.doc);
    }

    // ---------------------------------------------------------------
    // parse(String, String)  -- delegates to parse(..., noTracking())
    // ---------------------------------------------------------------

    @Test
    public void parse_twoArgOverload_returnsDocument() {
        Document doc = builder.parse("<p>hello</p>", "http://example.com/");
        assertNotNull(doc);
        assertTrue(builder.processCallCount > 0);
    }

    // ---------------------------------------------------------------
    // parse(String, String, ParseErrorList)
    // ---------------------------------------------------------------

    @Test
    public void parse_threeArgOverload_assignsErrorsAndReturnsDocument() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Document doc = builder.parse("<div>text</div>", "http://example.com/", errors);
        assertNotNull(doc);
        assertSame(errors, builder.errors);
    }

    @Test
    public void parse_emptyInput_processesAtLeastEOF() {
        Document doc = builder.parse("", "http://example.com/");
        assertNotNull(doc);
        assertTrue(builder.processCallCount >= 1);

        // runParser() เช็ค token.type == EOF ทันทีหลัง token.reset() ภายใน loop เดียวกัน
        // ซึ่งแปลว่า reset() ต้องไม่ล้างค่า field 'type' (เป็นข้อสรุปจาก logic ของ source เอง)
        Token last = builder.seenTokens.get(builder.seenTokens.size() - 1);
        assertEquals(Token.TokenType.EOF, last.type);
    }

    @Test
    public void parse_malformedInput_doesNotThrowAndTerminates() {
        // Input ผิดรูปแบบ/ไม่สมบูรณ์ (unclosed tag)
        Document doc = builder.parse("<div", "http://example.com/");
        assertNotNull(doc);
        assertTrue(builder.processCallCount >= 1);
    }

    // ---------------------------------------------------------------
    // runParser() loop behaviour
    // ---------------------------------------------------------------

    @Test(timeout = 5000)
    public void runParser_multipleTokens_loopsAndTerminates() {
        builder.parse("<a>one</a><b>two</b>", "http://example.com/");
        // คาดว่า loop ทำงานมากกว่า 1 รอบ (มี start/char/end หลายตัว + EOF)
        assertTrue(builder.processCallCount > 1);
    }

    // ---------------------------------------------------------------
    // processStartTag(String)
    // ---------------------------------------------------------------

    @Test
    public void processStartTag_byName_callsProcessWithStartTagToken() {
        boolean result = builder.processStartTag("div");
        assertEquals(1, builder.processCallCount);
        assertTrue(builder.seenTokens.get(0) instanceof Token.StartTag);
        assertTrue(result); // ค่า default nextReturn = true ถูกส่งกลับ
    }

    @Test
    public void processStartTag_byName_emptyName_doesNotThrow() {
        // boundary: ชื่อ tag เป็น empty string
        builder.processStartTag("");
        assertEquals(1, builder.processCallCount);
        assertTrue(builder.seenTokens.get(0) instanceof Token.StartTag);
    }

    @Test
    public void processStartTag_byName_returnsProcessResult_false() {
        builder.nextReturn = false;
        boolean result = builder.processStartTag("span");
        assertFalse(result);
    }

    // ---------------------------------------------------------------
    // processStartTag(String, Attributes)
    // ---------------------------------------------------------------

    @Test
    public void processStartTag_withAttributes_callsProcessWithStartTagToken() {
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        boolean result = builder.processStartTag("input", attrs);
        assertEquals(1, builder.processCallCount);
        assertTrue(builder.seenTokens.get(0) instanceof Token.StartTag);
        assertTrue(result);
    }

    @Test
    public void processStartTag_withEmptyAttributes_doesNotThrow() {
        Attributes attrs = new Attributes();
        builder.processStartTag("br", attrs);
        assertEquals(1, builder.processCallCount);
    }

    // ---------------------------------------------------------------
    // processEndTag(String)
    // ---------------------------------------------------------------

    @Test
    public void processEndTag_byName_callsProcessWithEndTagToken() {
        boolean result = builder.processEndTag("div");
        assertEquals(1, builder.processCallCount);
        assertTrue(builder.seenTokens.get(0) instanceof Token.EndTag);
        assertTrue(result);
    }

    @Test
    public void processEndTag_byName_emptyName_doesNotThrow() {
        builder.processEndTag("");
        assertEquals(1, builder.processCallCount);
        assertTrue(builder.seenTokens.get(0) instanceof Token.EndTag);
    }

    // ---------------------------------------------------------------
    // currentElement()
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void currentElement_beforeInitialiseParse_throwsNPE() {
        // FAULT-DETECTION TEST:
        // field 'stack' เป็น null จนกว่าจะเรียก initialiseParse()
        // currentElement() เรียก stack.size() โดยไม่มีการตรวจ null ก่อน
        // ดังนั้นถ้าเรียกก่อน initialiseParse ควรได้ NullPointerException
        // (ถ้า test นี้ fail แสดงว่า behavior เปลี่ยนไปจาก source ที่ให้มา)
        builder.currentElement();
    }

    @Test
    public void currentElement_emptyStack_returnsNull() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        assertNull(builder.currentElement()); // branch: size == 0 -> null
    }

    @Test
    public void currentElement_nonEmptyStack_returnsTopElement() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Element div = new Element(Tag.valueOf("div"), builder.baseUri);
        Element span = new Element(Tag.valueOf("span"), builder.baseUri);
        builder.stack.add(div);
        builder.stack.add(span);

        Element top = builder.currentElement(); // branch: size > 0 -> stack.get(size-1)
        assertSame(span, top);
    }

    @Test
    public void currentElement_afterPoppingBackToEmpty_returnsNull() {
        builder.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        Element div = new Element(Tag.valueOf("div"), builder.baseUri);
        builder.stack.add(div);
        builder.stack.remove(builder.stack.size() - 1);
        assertNull(builder.currentElement());
    }
}
