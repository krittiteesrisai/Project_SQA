package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    // ===================== Null / boundary input =====================

    @Test(expected = IllegalArgumentException.class)
    public void parse_nullHtml_throwsException() {
        Parser.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_nullBaseUri_throwsException() {
        Parser.parse("<html></html>", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_nullHtml_throwsException() {
        Parser.parseBodyFragment(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseBodyFragment_nullBaseUri_throwsException() {
        Parser.parseBodyFragment("<p>hi</p>", null);
    }

    @Test
    public void parse_emptyHtml_producesNormalisedDocumentStructure() {
        // while(!tq.isEmpty()) loop body never executes (0 iterations)
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void parseBodyFragment_emptyHtml_producesBody() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    // ===================== parse() dispatch branches =====================

    @Test
    public void parse_simpleDocument_parsesTitleAndBodyContent() {
        String html = "<html><head><title>Test Title</title></head><body><p>Hello World</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("Test Title", doc.title());
        List<Element> paragraphs = doc.getElementsByTag("p");
        assertEquals(1, paragraphs.size());
        assertEquals("Hello World", paragraphs.get(0).text());
    }

    @Test
    public void parse_commentNode_isAppendedToTree() {
        // "<!-- a comment -->" -> data ends with '-' after chompTo("->") -> endsWith("-") branch TRUE
        String html = "<html><body><!-- a comment --><p>After</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        boolean foundComment = false;
        for (Node n : doc.body().childNodes()) {
            if (n instanceof Comment) {
                foundComment = true;
                assertEquals("a comment", ((Comment) n).getData().trim());
            }
        }
        assertTrue("Expected a Comment node inside body", foundComment);
    }

    @Test
    public void parse_commentNotEndingWithDoubleDash_dataIsNotTrimmed() {
        // "<!--abc->" -> chompTo("->") ให้ data = "abc" ซึ่งไม่ endsWith("-") -> endsWith branch FALSE
        String html = "<html><body><!--abc-><p>x</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        boolean found = false;
        for (Node n : doc.body().childNodes()) {
            if (n instanceof Comment) {
                found = true;
                assertEquals("abc", ((Comment) n).getData());
            }
        }
        assertTrue(found);
    }

    @Test
    public void parse_cdataSection_isAddedAsRawTextNode() {
        String html = "<html><body><![CDATA[Raw <data> here]]></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        boolean foundTextNode = false;
        for (Node n : doc.body().childNodes()) {
            if (n instanceof TextNode) {
                foundTextNode = true;
                assertTrue(((TextNode) n).getWholeText().contains("Raw <data> here"));
            }
        }
        assertTrue("Expected CDATA to be represented as raw TextNode", foundTextNode);
    }

    @Test
    public void parse_doctypeDeclaration_isParsedAsXmlDeclarationWithBangBranch() {
        // "<!DOCTYPE html>" -> tq.matches("<!") -> firstChar == '!' -> procInstr = true branch
        String html = "<!DOCTYPE html><html><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        boolean foundDecl = false;
        for (Node n : doc.childNodes()) {
            if (n instanceof XmlDeclaration) foundDecl = true;
        }
        assertTrue("Expected leading XmlDeclaration for DOCTYPE", foundDecl);
    }

    @Test
    public void parse_processingInstruction_isParsedAsXmlDeclarationWithQuestionBranch() {
        // "<?xml ...?>" -> tq.matches("<?") -> firstChar == '?' -> procInstr = false branch
        String html = "<?xml version=\"1.0\"?><html><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        boolean foundDecl = false;
        for (Node n : doc.childNodes()) {
            if (n instanceof XmlDeclaration) foundDecl = true;
        }
        assertTrue("Expected leading XmlDeclaration for processing instruction", foundDecl);
    }

    // ===================== parseEndTag branches =====================

    @Test
    public void parse_endTagWithEmptyName_isIgnoredGracefully() {
        // "</>" -> consumeWord() == "" -> tagName.length()==0 -> popStackToClose ไม่ถูกเรียก
        String html = "<html><body><p>content</></p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc);
    }

    @Test
    public void parse_endTagNotPresentOnStack_isIgnored() {
        // popStackToClose: วน loop จนหมดโดยไม่เจอ match และไม่เจอ body/html -> elToClose == null
        String html = "<html><body><div>content</span></div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        List<Element> divs = doc.getElementsByTag("div");
        assertEquals(1, divs.size());
        assertTrue(divs.get(0).text().contains("content"));
    }

    @Test
    public void parse_endTagClosesNestedUnclosedElements() {
        // popStackToClose: เจอ match (elTag.equals(tag)) หลังวนผ่าน span ที่ไม่ได้ปิด
        String html = "<html><body><div><span>text</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals(1, doc.getElementsByTag("div").size());
        assertEquals(1, doc.getElementsByTag("span").size());
    }

    @Test
    public void parse_closingHtmlTagInsideBody_isIgnoredDueToBodyBoundary() {
        // popStackToClose: เจอ elTag.equals(bodyTag) -> break ก่อนเจอ html -> elToClose == null
        String html = "<html><body><div>content</html>";
        Document doc = Parser.parse(html, "http://example.com/");
        List<Element> divs = doc.getElementsByTag("div");
        assertEquals(1, divs.size());
        assertEquals("content", divs.get(0).text());
    }

    // ===================== parseStartTag branches =====================

    @Test
    public void parse_malformedStartTagWithEmptyName_isTreatedAsLiteralText() {
        // "<>": consumeWord()=="" -> tagName.length()==0 -> addFirst("&lt;") + parseTextNode()
        String html = "<html><body><>text</body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertTrue(doc.body().text().contains("<>text"));
    }

    @Test
    public void parse_selfClosingTag_doesNotRemainOnStack() {
        String html = "<html><body><br/><p>after</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals(1, doc.getElementsByTag("br").size());
        List<Element> ps = doc.getElementsByTag("p");
        assertEquals(1, ps.size());
        assertEquals("after", ps.get(0).text());
    }

    @Test
    public void parse_selfClosedNonVoidTag_treatedAsEmptyElement() {
        // matchChomp("/>") == true -> isEmptyElement = true แม้ tag.isEmpty() ปกติเป็น false (div)
        String html = "<html><body><div/><p>after</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        List<Element> divs = doc.getElementsByTag("div");
        assertEquals(1, divs.size());
        assertEquals(0, divs.get(0).children().size());
        assertEquals("after", doc.getElementsByTag("p").get(0).text());
    }

    @Test
    public void parse_voidElementWithoutSelfClosingSlash_stillTreatedAsEmpty() {
        // tag.isEmpty() == true (img) แม้ไม่มี "/>" -> isEmptyElement = true
        String html = "<html><body><img><p>after</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("after", doc.getElementsByTag("p").get(0).text());
    }

    @Test
    public void parse_scriptTagContent_isRawDataNode() {
        // tag.isData() == true, ไม่ใช่ title/textarea -> DataNode (raw, ไม่ decode)
        String html = "<html><body><script>var a = \"<b>\";</script></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        List<Element> scripts = doc.getElementsByTag("script");
        assertEquals(1, scripts.size());
        boolean foundDataNode = false;
        for (Node n : scripts.get(0).childNodes()) {
            if (n instanceof DataNode) {
                foundDataNode = true;
                assertTrue(((DataNode) n).getWholeData().contains("<b>"));
            }
        }
        assertTrue("script content should be raw DataNode", foundDataNode);
    }

    @Test
    public void parse_titleTagContent_isEncodedTextNode() {
        // tag.equals(titleTag) -> TextNode.createFromEncoded (decode entities)
        String html = "<html><head><title>My &amp; Title</title></head><body></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("My & Title", doc.title());
    }

    @Test
    public void parse_textareaTagContent_isEncodedTextNode() {
        // tag.equals(textareaTag) -> TextNode.createFromEncoded (decode entities)
        String html = "<html><body><textarea>Hello &amp; World</textarea></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertTrue(doc.getElementsByTag("textarea").get(0).text().contains("Hello & World"));
    }

    @Test
    public void parse_baseTagWithHref_updatesBaseUri() {
        // child.tagName().equals("base") && href.length()!=0 -> baseUri อัปเดต
        String html = "<html><head><base href=\"http://new-base.com/\"></head>" +
                "<body><a href=\"page.html\">link</a></body></html>";
        Document doc = Parser.parse(html, "http://old-base.com/");
        Element a = doc.getElementsByTag("a").get(0);
        assertEquals("http://new-base.com/page.html", a.absUrl("href"));
    }

    @Test
    public void parse_baseTagWithoutHref_doesNotUpdateBaseUri() {
        // child.tagName().equals("base") แต่ href.length()==0 -> ไม่อัปเดต baseUri
        String html = "<html><head><base target=\"_blank\"></head>" +
                "<body><a href=\"page.html\">link</a></body></html>";
        Document doc = Parser.parse(html, "http://old-base.com/");
        Element a = doc.getElementsByTag("a").get(0);
        assertEquals("http://old-base.com/page.html", a.absUrl("href"));
    }

    // ===================== parseAttribute branches =====================

    @Test
    public void parse_attributeWithDoubleQuotedValue() {
        String html = "<html><body><div id=\"main\">x</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("main", doc.getElementsByTag("div").get(0).attr("id"));
    }

    @Test
    public void parse_attributeWithSingleQuotedValue() {
        String html = "<html><body><div id='main'>x</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("main", doc.getElementsByTag("div").get(0).attr("id"));
    }

    @Test
    public void parse_attributeWithUnquotedValue() {
        String html = "<html><body><div id=main>x</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("main", doc.getElementsByTag("div").get(0).attr("id"));
    }

    @Test
    public void parse_attributeWithoutValue_isBooleanAttribute() {
        // matchChomp("=") == false -> value คงเป็น "" (boolean attribute)
        String html = "<html><body><input disabled></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element input = doc.getElementsByTag("input").get(0);
        assertTrue(input.hasAttr("disabled"));
        assertEquals("", input.attr("disabled"));
    }

    @Test
    public void parse_multipleAttributesOnOneTag() {
        String html = "<html><body><div id=\"main\" class='box' data-x=1>y</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element div = doc.getElementsByTag("div").get(0);
        assertEquals("main", div.attr("id"));
        assertEquals("box", div.attr("class"));
        assertEquals("1", div.attr("data-x"));
    }

    @Test
    public void parse_attributeParsing_strayQuoteCharacterIsSkippedGracefully() {
        // key.length()==0 -> else branch: tq.consume() ข้ามอักขระแปลก ๆ ไม่ให้ loop ค้าง
        // สมมติฐาน: เครื่องหมาย '"' ที่ไม่มี key นำหน้า ถูกข้ามไปทีละตัว (ไม่ยืนยัน 100% เพราะไม่มี TokenQueue source)
        String html = "<html><body><div \"stray\" id=\"x\">text</div></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        Element div = doc.getElementsByTag("div").get(0);
        assertEquals("x", div.attr("id"));
    }

    // ===================== parseTextNode =====================

    @Test
    public void parse_plainTextNodeBetweenTags() {
        String html = "<html><body>Just some text<p>more</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertTrue(doc.body().text().contains("Just some text"));
        assertTrue(doc.body().text().contains("more"));
    }

    // ===================== addChildToParent / stackHasValidParent / popStackToSuitableContainer =====================

    @Test
    public void parseBodyFragment_withoutHtmlWrapper_parsesDirectlyIntoBody() {
        String html = "<p>Fragment content</p>";
        Document doc = Parser.parseBodyFragment(html, "http://example.com/");
        List<Element> ps = doc.getElementsByTag("p");
        assertEquals(1, ps.size());
        assertEquals("Fragment content", ps.get(0).text());
    }

    @Test
    public void parse_bodyTagWithoutHtmlWrapper_createsImplicitHeadBeforeBody() {
        // addChildToParent: !validAncestor && child.tag().equals(bodyTag) -> สร้าง implicit head ก่อน append body
        String html = "<body><p>Hi</p></body>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("Hi", doc.body().getElementsByTag("p").get(0).text());
    }

    @Test
    public void parse_orphanElement_createsImplicitParentStructure() {
        // addChildToParent: !validAncestor -> recursive สร้าง implicit parent ด้วย getImplicitParent()
        // (รายละเอียด mapping ของ Tag ไม่ได้อยู่ใน source ที่ให้มา จึงตรวจสอบแค่ผลลัพธ์ปลายทาง)
        String html = "<td>Orphan Cell</td>";
        Document doc = Parser.parse(html, "http://example.com/");
        List<Element> tds = doc.getElementsByTag("td");
        assertEquals(1, tds.size());
        assertEquals("Orphan Cell", tds.get(0).text());
    }

    @Test
    public void parse_deeplyNestedUnclosedTags_popToSuitableContainer() {
        // popStackToSuitableContainer: p ไม่สามารถ contain p -> pop p ตัวแรกออกจาก stack แล้วหา container ใหม่
        String html = "<html><body><p>one<p>two</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        List<Element> ps = doc.getElementsByTag("p");
        assertEquals(2, ps.size());
        assertEquals("one", ps.get(0).text());
        assertEquals("two", ps.get(1).text());
    }
}
