package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeBuilderTest {

    private TreeBuilder treeBuilder;

    // Concrete subclass ของ TreeBuilder เพื่อใช้ในการทดสอบ
    private static class DummyTreeBuilder extends TreeBuilder {
        @Override
        protected boolean process(Token token) {
            // จำลองการทำงานเพื่อหยุด loop เมื่อเจอ Token แรก หรือปล่อยให้รันต่อ
            return true;
        }

        // เปิดให้เข้าถึงสำหรับการทดสอบ
        public void callInitialiseParse(String input, String baseUri, ParseErrorList errors) {
            initialiseParse(input, baseUri, errors);
        }

        public Element callCurrentElement() {
            return currentElement();
        }

        public boolean callProcessStartTag(String name) {
            return processStartTag(name);
        }

        public boolean callProcessStartTag(String name, Attributes attrs) {
            return processStartTag(name, attrs);
        }

        public boolean callProcessEndTag(String name) {
            return processEndTag(name);
        }
    }

    @Before
    public void setUp() {
        treeBuilder = new DummyTreeBuilder();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_NullInput_ThrowsException() {
        treeBuilder.callInitialiseParse(null, "http://example.com", ParseErrorList.noTracking());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_NullBaseUri_ThrowsException() {
        treeBuilder.callInitialiseParse("<html></html>", null, ParseErrorList.noTracking());
    }

    @Test
    public void testInitialiseParse_ValidInputs_InitializesCorrectly() {
        String input = "<div></div>";
        String baseUri = "http://example.com";
        ParseErrorList errors = ParseErrorList.tracking(10);

        treeBuilder.callInitialiseParse(input, baseUri, errors);

        assertNotNull(treeBuilder.doc);
        assertEquals(baseUri, treeBuilder.doc.baseUri());
        assertNotNull(treeBuilder.reader);
        assertNotNull(treeBuilder.tokeniser);
        assertNotNull(treeBuilder.stack);
        assertEquals(0, treeBuilder.stack.size());
        assertEquals(baseUri, treeBuilder.baseUri);
        assertEquals(errors, treeBuilder.errors);
    }

    @Test
    public void testParse_TwoArguments_Success() {
        Document doc = treeBuilder.parse("<html></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testParse_ThreeArguments_Success() {
        Document doc = treeBuilder.parse("<html></html>", "http://example.com", ParseErrorList.noTracking());
        assertNotNull(doc);
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testCurrentElement_EmptyStack_ReturnsNull() {
        // stack ยังไม่ได้ initialise หรือว่างเปล่า
        treeBuilder.stack = new ArrayList<Element>();
        assertNull(treeBuilder.callCurrentElement());
    }

    @Test
    public void testCurrentElement_NonEmptyStack_ReturnsLastElement() {
        treeBuilder.stack = new ArrayList<Element>();
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span"), "http://example.com");
        
        treeBuilder.stack.add(el1);
        treeBuilder.stack.add(el2);

        assertEquals(el2, treeBuilder.callCurrentElement());
    }

    @Test
    public void testProcessStartTag_WithName_ProcessedSuccessfully() {
        treeBuilder.callInitialiseParse("<span></span>", "http://example.com", ParseErrorList.noTracking());
        boolean result = treeBuilder.callProcessStartTag("div");
        assertTrue(result);
    }

    @Test
    public void testProcessStartTag_WithNameAndAttributes_ProcessedSuccessfully() {
        treeBuilder.callInitialiseParse("<span class='test'></span>", "http://example.com", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("class", "test");
        
        boolean result = treeBuilder.callProcessStartTag("div", attrs);
        assertTrue(result);
    }

    @Test
    public void testProcessEndTag_WithName_ProcessedSuccessfully() {
        treeBuilder.callInitialiseParse("</span>", "http://example.com", ParseErrorList.noTracking());
        boolean result = treeBuilder.callProcessEndTag("div");
        assertTrue(result);
    }
}