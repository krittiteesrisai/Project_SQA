package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.parser.Parser (Defects4J Jsoup-3b target class).
 *
 * หมายเหตุ: Parser มี private constructor และ private methods เป็นส่วนใหญ่
 * ดังนั้นเราทดสอบผ่าน public static API เท่านั้น (parse, parseBodyFragment)
 * และตรวจสอบผลลัพธ์ผ่าน Document/Element/Node API ของ jsoup ซึ่งอยู่ใน
 * classpath เดียวกัน (โปรเจกต์ jsoup เอง ไม่ใช่ jar แยก)
 */
public class ParserTest {

    // ---------------------------------------------------------------
    // 1. Basic happy-path parse -> covers parseStartTag, parseTextNode,
    //    parseEndTag (tagName.length()!=0), addChildToParent (validAncestor=true)
    // ---------------------------------------------------------------
    @Test
    public void testParseSimpleDocument() {
        String html = "<html><head><title>My Title</title></head><body><p>Hello</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("My Title", doc.title());
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertEquals("Hello", p.text());
    }

    // ---------------------------------------------------------------
    // 2. Empty / whitespace-only input -> tq.isEmpty() true immediately,
    //    while loop in parse() never executes.
    // ---------------------------------------------------------------
    @Test
    public void testParseEmptyString() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
        // normalise() should still create html/head/body implicit structure
        assertNotNull(doc.body());
    }

    // ---------------------------------------------------------------
    // 3. Null html -> Validate.notNull should throw.
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testParseNullHtmlThrows() {
        Parser.parse(null, "http://example.com/");
    }

    // ---------------------------------------------------------------
    // 4. Null baseUri -> Validate.notNull should throw.
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testParseNullBaseUriThrows() {
        Parser.parse("<p>x</p>", null);
    }

    // ---------------------------------------------------------------
    // 5. Comment parsing, normal case where data ends with "-" (trim branch true)
    //    covers tq.matches("<!--") and parseComment() if(data.endsWith("-")) == true
    // ---------------------------------------------------------------
    @Test
    public void testParseCommentNormal() {
        String html = "<!-- a comment --><p>after</p>";
        Document doc = Parser.parse(html, "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof Comment);
        Comment c = (Comment) first;
        assertEquals(" a comment ", c.getData());
    }

    // ---------------------------------------------------------------
    // 6. Malformed comment where chomped data does NOT end with "-"
    //    covers if(data.endsWith("-")) == false branch
    // ---------------------------------------------------------------
    @Test
    public void testParseCommentMalformedNoTrailingDash() {
        String html = "<!--abc->rest"; // chompTo("->") leaves data = "abc" (no trailing '-')
        Document doc = Parser.parse(html, "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof Comment);
        Comment c = (Comment) first;
        assertEquals("abc", c.getData());
    }

    // ---------------------------------------------------------------
    // 7. CDATA parsing -> covers tq.matches("<![CDATA[") branch, parseCdata()
    // ---------------------------------------------------------------
    @Test
    public void testParseCdata() {
        String html = "<![CDATA[ raw <data> here ]]>";
        Document doc = Parser.parse(html, "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof TextNode);
        TextNode tn = (TextNode) first;
        assertEquals(" raw <data> here ", tn.getWholeText());
    }

    // ---------------------------------------------------------------
    // 8. XML declaration via "<?...?>" -> firstChar == '?' -> procInstr == false
    // ---------------------------------------------------------------
    @Test
    public void testParseXmlDeclProcessingInstruction() {
        String html = "<?xml version=\"1.0\"?><p>x</p>";
        Document doc = Parser.parse(html, "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof XmlDeclaration);
        // Not asserting isProcessingInstruction() value itself (not guaranteed accessor
        // name in provided source), just structural existence + content.
        assertTrue(first.outerHtml().contains("xml"));
    }

    // ---------------------------------------------------------------
    // 9. XML declaration via "<!DOCTYPE ...>" -> firstChar == '!' -> procInstr == true
    // ---------------------------------------------------------------
    @Test
    public void testParseXmlDeclDoctype() {
        String html = "<!DOCTYPE html><p>x</p>";
        Document doc = Parser.parse(html, "http://example.com/");
        Node first = doc.childNode(0);
        assertTrue(first instanceof XmlDeclaration);
        assertTrue(first.outerHtml().contains("DOCTYPE"));
    }

    // ---------------------------------------------------------------
    // 10. parseEndTag with tagName.length()==0 ("</>") -> popStackToClose NOT called
    //     Ensures parse continues safely (no exception), remaining text parsed normally.
    // ---------------------------------------------------------------
    @Test
    public void testParseEndTagEmptyName() {
        String html = "</>text-after";
        Document doc = Parser.parse(html, "http://example.com/");
        assertTrue(doc.body().text().contains("text-after"));
    }

    // ---------------------------------------------------------------
    // 11. parseStartTag with tagName.length()==0 (e.g. "<1>")
    //     -> addFirst("&lt;") then parseTextNode() branch
    //     NOTE: exact resulting text format depends on TokenQueue internals
    //     (not provided in target source) - we only assert no exception and that
    //     original textual content ("1") and following text are preserved somewhere.
    // ---------------------------------------------------------------
    @Test
    public void testParseStartTagEmptyNameFallsBackToText() {
        String html = "<1>hello";
        Document doc = Parser.parse(html, "http://example.com/");
        String bodyText = doc.body().text();
        assertTrue(bodyText.contains("1"));
        assertTrue(bodyText.contains("hello"));
    }

    // ---------------------------------------------------------------
    // 12. Attribute parsing: single-quoted, double-quoted, unquoted, and
    //     boolean (no value) attribute -> covers all branches in parseAttribute()
    //     except the "no key" branch (tested separately).
    // ---------------------------------------------------------------
    @Test
    public void testParseAttributesAllQuotingStyles() {
        String html = "<div id='single' class=\"double\" data-x=unquoted disabled>Content</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("single", div.attr("id"));
        assertEquals("double", div.attr("class"));
        assertEquals("unquoted", div.attr("data-x"));
        assertTrue(div.hasAttr("disabled"));
        assertEquals("Content", div.text());
    }

    // ---------------------------------------------------------------
    // 13. Malformed attribute with no key (key.length()==0) -> parseAttribute()
    //     returns null, and tq.consume() pops a char to avoid infinite loop.
    //     We only assert the parse terminates (timeout) and element content survives.
    // ---------------------------------------------------------------
    @Test(timeout = 5000)
    public void testParseAttributeWithNoKeyDoesNotHang() {
        String html = "<div =foo>Text</div>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("Text", div.text());
    }

    // ---------------------------------------------------------------
    // 14. Self-closing tag via "/>" -> tq.matchChomp("/>") == true,
    //     isEmptyElement forced true, so following text is a SIBLING, not a child.
    // ---------------------------------------------------------------
    @Test
    public void testParseSelfClosingTag() {
        String html = "<body><div/>After</body>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals(0, div.childNodes().size());
        assertTrue(doc.body().text().contains("After"));
    }

    // ---------------------------------------------------------------
    // 15. Naturally empty tag (tag.isEmpty() == true, e.g. <img>) without "/>"
    //     -> isEmptyElement remains true from tag.isEmpty(), tq.matchChomp(">") used instead.
    // ---------------------------------------------------------------
    @Test
    public void testParseEmptyTagImg() {
        String html = "<body><img src='a.jpg'>Sibling text</body>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element img = doc.select("img").first();
        assertNotNull(img);
        assertEquals("a.jpg", img.attr("src"));
        assertEquals(0, img.childNodes().size());
        assertTrue(doc.body().text().contains("Sibling text"));
    }

    // ---------------------------------------------------------------
    // 16. Data tag (script) -> tag.isData()==true, and tag is NOT title/textarea
    //     -> DataNode branch (raw, not decoded)
    // ---------------------------------------------------------------
    @Test
    public void testParseScriptDataTagRaw() {
        String html = "<script>var a = '<div>'; // raw</script>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("<div>"));
    }

    // ---------------------------------------------------------------
    // 17. Data tag (title) -> tag.isData()==true AND tag.equals(titleTag)
    //     -> TextNode.createFromEncoded branch (decoded entities)
    // ---------------------------------------------------------------
    @Test
    public void testParseTitleTagDecodesEntities() {
        String html = "<title>A &amp; B</title>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("A & B", doc.title());
    }

    // ---------------------------------------------------------------
    // 18. Data tag (textarea) -> tag.isData()==true AND tag.equals(textareaTag)
    //     -> TextNode.createFromEncoded branch (decoded entities)
    // ---------------------------------------------------------------
    @Test
    public void testParseTextareaTagDecodesEntities() {
        String html = "<textarea>Line &lt;1&gt;</textarea>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element ta = doc.select("textarea").first();
        assertNotNull(ta);
        assertEquals("Line <1>", ta.text());
    }

    // ---------------------------------------------------------------
    // 19. <base href="..."> updates baseUri -> href.length()!=0 branch == true
    // ---------------------------------------------------------------
    @Test
    public void testParseBaseTagUpdatesBaseUri() {
        String html = "<head><base href='http://other.com/'></head><body>x</body>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("http://other.com/", doc.baseUri());
    }

    // ---------------------------------------------------------------
    // 20. <base> with no href (or empty href) -> href.length()!=0 branch == false,
    //     baseUri should remain the original one.
    // ---------------------------------------------------------------
    @Test
    public void testParseBaseTagWithEmptyHrefKeepsOriginalBaseUri() {
        String html = "<head><base target='_blank'></head><body>x</body>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
    }

    // ---------------------------------------------------------------
    // 21. parseBodyFragment -> constructor isBodyFragment == true branch,
    //     stack initialised with doc.body()
    // ---------------------------------------------------------------
    @Test
    public void testParseBodyFragment() {
        String bodyHtml = "<p>Fragment content</p>";
        Document doc = Parser.parseBodyFragment(bodyHtml, "http://example.com/");
        assertNotNull(doc.body());
        Element p = doc.body().select("p").first();
        assertNotNull(p);
        assertEquals("Fragment content", p.text());
        // head should exist but be essentially empty (createShell behavior)
        assertNotNull(doc.head());
    }

    // ---------------------------------------------------------------
    // 22. popStackToClose finds a matching tag in the middle of the stack
    //     (unclosed inner tag auto-closed when matching outer end tag found)
    // ---------------------------------------------------------------
    @Test
    public void testPopStackToCloseFindsMatchingTagAndClosesChildren() {
        // <p> is never explicitly closed before </div> closes;
        // popStackToClose(div) should pop p too.
        String html = "<body><div><p>Text</div>After</body>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        Element div = doc.body().select("div").first();
        assertNotNull(div);
        Element p = div.select("p").first();
        assertNotNull(p);
        assertEquals("Text", p.text());
        // "After" should no longer be inside div/p since the stack was popped back
        assertFalse(div.text().contains("After"));
    }

    // ---------------------------------------------------------------
    // 23. popStackToClose: end tag has no matching open tag in stack before
    //     hitting body/html -> elToClose stays null -> nothing is popped.
    // ---------------------------------------------------------------
    @Test
    public void testPopStackToCloseNoMatchDoesNothing() {
        // </span> appears but there is no open <span> on the stack;
        // loop should break upon reaching body/html without finding it.
        String html = "<body><div>Text</span>More</div></body>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        Element div = doc.body().select("div").first();
        assertNotNull(div);
        // Both "Text" and "More" should remain inside div since stack wasn't popped
        assertTrue(div.text().contains("Text"));
        assertTrue(div.text().contains("More"));
    }

    // ---------------------------------------------------------------
    // 24. stackHasValidParent: stack.size()==1 && childTag.equals(htmlTag) -> true branch
    //     Top-level <html> tag on a fresh (non-fragment) parse.
    // ---------------------------------------------------------------
    @Test
    public void testHtmlTagAsRootIsValidParentBranch() {
        String html = "<html><body>x</body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.select("html").first());
    }

    // ---------------------------------------------------------------
    // 25. Unclosed start tag at end of input (no '>' at all) -> attribute loop
    //     exits via !tq.isEmpty() becoming false; matchChomp("/>") and
    //     matchChomp(">") both false -> smoke test, no exception.
    // ---------------------------------------------------------------
    @Test
    public void testUnclosedStartTagDoesNotThrow() {
        String html = "<div";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
    }

    // ---------------------------------------------------------------
    // 26. Plain text node only (no tags at all) -> else branch of parse() loop
    //     (parseTextNode directly, covers "<" never matched)
    // ---------------------------------------------------------------
    @Test
    public void testPlainTextOnly() {
        String html = "Just some plain text.";
        Document doc = Parser.parse(html, "http://example.com/");
        assertTrue(doc.body().text().contains("Just some plain text."));
    }
}
