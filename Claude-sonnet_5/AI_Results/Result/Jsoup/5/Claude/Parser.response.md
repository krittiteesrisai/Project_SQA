# ชุดทดสอบ JUnit 4 สำหรับ `org.jsoup.parser.Parser`

**หมายเหตุสำคัญ:** คลาส `Parser` มีเฉพาะ static method สาธารณะ (`parse`, `parseBodyFragment`, `parseBodyFragmentRelaxed`) เมธอดภายใน (private) ทั้งหมดถูกทดสอบแบบ black-box ผ่าน method เหล่านี้ โดยออกแบบอินพุต HTML ให้ครอบคลุมแต่ละ branch ที่วิเคราะห์ได้จากซอร์สที่ให้มา สำหรับพฤติกรรมของคลาสสนับสนุน (`TokenQueue`, `Tag`, `Element`, ฯลฯ) ที่ไม่ได้แสดงซอร์สมาด้วย จะใช้ความรู้มาตรฐานของ Jsoup เท่าที่จำเป็นต่อการตรวจผลลัพธ์ และจะ **คอมเมนต์กำกับ** ไว้ในจุดที่มีความไม่แน่นอนสูง

```java
import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class ParserTest {

    // ---------------------------------------------------------------
    // Boundary: null / invalid argument (Validate.notNull / notEmpty)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullHtmlThrows() {
        Parser.parse(null, "http://example.com/");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullBaseUriThrows() {
        Parser.parse("<p>Test</p>", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragmentNullHtmlThrows() {
        Parser.parseBodyFragment(null, "http://example.com/");
    }

    // ---------------------------------------------------------------
    // Boundary: empty input -> while(!tq.isEmpty()) loop ไม่ execute
    // ---------------------------------------------------------------

    @Test
    public void testParseEmptyHtmlProducesShell() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
    }

    @Test
    public void testParseBodyFragmentEmpty() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc.body());
        assertEquals("", doc.body().text());
    }

    // ---------------------------------------------------------------
    // parse(): dispatch branches (startTag / endTag / comment / cdata / xmlDecl / text)
    // ---------------------------------------------------------------

    @Test
    public void testParseSimpleDocument() {
        String html = "<html><head><title>My Title</title></head><body><p>Hello</p></body></html>";
        Document doc = Parser.parse(html, "http://example.com/");
        assertEquals("My Title", doc.title());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseImplicitHtmlHeadBodyForFragment() {
        // ไม่มี <html>/<head>/<body> ครอบ -> ต้องสร้าง implicit parent ให้
        Document doc = Parser.parse("<p>One</p>", "");
        assertEquals("One", doc.body().text());
        assertNotNull(doc.head());
    }

    @Test
    public void testParseBodyFragmentBasic() {
        Document doc = Parser.parseBodyFragment("<p>Fragment</p>", "http://example.com/");
        assertEquals("Fragment", doc.body().text());
        assertEquals(0, doc.head().children().size());
    }

    @Test
    public void testParseBodyFragmentRelaxedDoesNotThrow() {
        // relaxed=true ข้ามการสร้าง implicit parent เมื่อ validAncestor=false
        // โครงสร้างผลลัพธ์แบบละเอียดขึ้นกับ Tag relationship ที่ไม่มีในซอร์สที่ให้มา
        // จึงตรวจสอบเพียงว่า parse สำเร็จและเนื้อหาข้อความยังอยู่
        Document doc = Parser.parseBodyFragmentRelaxed("<span>Rel</span>", "http://example.com/");
        assertTrue(doc.body().text().contains("Rel"));
    }

    // ---------------------------------------------------------------
    // parseEndTag(): tagName empty / ไม่พบ match / ปิดหลายชั้น / หยุดที่ body-boundary
    // ---------------------------------------------------------------

    @Test
    public void testParseEndTagEmptyTagNameIsSkipped() {
        // "</>" -> consumeTagName() คืนค่า "" -> ข้าม popStackToClose (branch length==0)
        Document doc = Parser.parseBodyFragment("</>after", "http://example.com/");
        assertTrue(doc.body().text().contains("after"));
    }

    @Test
    public void testParseEndTagWithoutMatchingOpenTagIsIgnored() {
        // elToClose == null -> stack ไม่ถูกเปลี่ยน, <p> ที่เปิดอยู่ยังไม่ปิด
        Document doc = Parser.parseBodyFragment("<p>Hello</div>", "http://example.com/");
        assertEquals(1, doc.body().children().size());
        assertEquals("p", doc.body().child(0).tagName());
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseEndTagClosesNestedElements() {
        // "</div>" ต้องปิดทั้ง <p> (ที่ยังเปิด) และ <div> ผ่าน loop ใน popStackToClose
        Document doc = Parser.parseBodyFragment("<div><p>Test</div>After", "http://example.com/");
        List<Element> children = doc.body().children();
        assertEquals(1, children.size());
        assertEquals("div", children.get(0).tagName());
        assertEquals("Test", children.get(0).text());
        assertTrue(doc.body().text().contains("After"));
    }

    @Test
    public void testParseEndTagStopsAtBodyBoundary() {
        // loop ใน popStackToClose: for(i=size-1; i>0; ...) เมื่อ stack เหลือแค่ body (size==1)
        // loop ไม่ execute เลย -> ไม่ throw, ไม่ปิดอะไร
        Document doc = Parser.parseBodyFragment("</body>Content", "http://example.com/");
        assertTrue(doc.body().text().contains("Content"));
    }

    // ---------------------------------------------------------------
    // parseComment(): data.endsWith("-") branch (true case, จาก "-->")
    // ---------------------------------------------------------------

    @Test
    public void testParseCommentBasic() {
        Document doc = Parser.parseBodyFragment("<!-- hi -->", "http://example.com/");
        Node node = doc.body().childNode(0);
        assertTrue(node instanceof Comment);
    }

    // ---------------------------------------------------------------
    // parseXmlDecl(): procInstr = firstChar.equals("!") true/false
    // ---------------------------------------------------------------

    @Test
    public void testParseXmlDeclarationProcessingInstruction() {
        // "<?" -> firstChar == '?' -> procInstr = false
        Document doc = Parser.parseBodyFragment("<?xml version=\"1.0\"?>", "http://example.com/");
        Node node = doc.body().childNode(0);
        assertTrue(node instanceof XmlDeclaration);
    }

    @Test
    public void testParseXmlDeclarationBang() {
        // "<!" -> firstChar == '!' -> procInstr = true
        Document doc = Parser.parseBodyFragment("<!DOCTYPE html>", "http://example.com/");
        Node node = doc.body().childNode(0);
        assertTrue(node instanceof XmlDeclaration);
    }

    // ---------------------------------------------------------------
    // parseCdata(): raw text ไม่ encode
    // ---------------------------------------------------------------

    @Test
    public void testParseCdataRawContent() {
        Document doc = Parser.parseBodyFragment("<![CDATA[Some <data>]]>", "http://example.com/");
        Node node = doc.body().childNode(0);
        assertTrue(node instanceof TextNode);
        assertEquals("Some <data>", ((TextNode) node).text());
    }

    // ---------------------------------------------------------------
    // parseTextNode(): peek()=='<' special-case true/false
    // ---------------------------------------------------------------

    @Test
    public void testParseTextNodeWithLiteralLessThan() {
        Document doc = Parser.parseBodyFragment("hello < there", "http://example.com/");
        assertEquals("hello < there", doc.body().text());
    }

    // ---------------------------------------------------------------
    // parseAttribute(): quote SQ / DQ / unquoted / no value / key-empty
    // ---------------------------------------------------------------

    @Test
    public void testParseAttributeSingleQuoted() {
        Document doc = Parser.parseBodyFragment("<a href='http://x.com'>Link</a>", "http://example.com/");
        Element a = doc.body().child(0);
        assertEquals("http://x.com", a.attr("href"));
    }

    @Test
    public void testParseAttributeDoubleQuoted() {
        Document doc = Parser.parseBodyFragment("<a href=\"http://x.com\">Link</a>", "http://example.com/");
        Element a = doc.body().child(0);
        assertEquals("http://x.com", a.attr("href"));
    }

    @Test
    public void testParseAttributeUnquoted() {
        Document doc = Parser.parseBodyFragment("<a href=http://x.com>Link</a>", "http://example.com/");
        Element a = doc.body().child(0);
        assertEquals("http://x.com", a.attr("href"));
    }

    @Test
    public void testParseAttributeNoValue() {
        // ไม่มี "=" -> matchChomp("=") false -> value ยังคงเป็น ""
        Document doc = Parser.parseBodyFragment("<input disabled>", "http://example.com/");
        Element input = doc.body().child(0);
        assertEquals("", input.attr("disabled"));
    }

    @Test
    public void testParseAttributeMalformedDoesNotCrashParser() {
        // พยายามกระตุ้น branch key.length()==0 -> tq.consume(); return null;
        // รายละเอียดการ tokenize ของ consumeAttributeKey()/consumeWhitespace() ไม่ได้แสดงในซอร์สที่ให้มา
        // จึงตรวจเพียงความทนทาน (ไม่ throw exception) เท่านั้น
        Document doc = Parser.parseBodyFragment("<p ==x>Text</p>", "http://example.com/");
        assertNotNull(doc.body());
    }

    // ---------------------------------------------------------------
    // parseStartTag(): self-closing / known-empty element / isData tag
    // ---------------------------------------------------------------

    @Test
    public void testParseSelfClosingUnknownTag() {
        // tag ไม่รู้จัก + "/>" -> isEmptyElement=true, tag.setSelfClosing() ถูกเรียก,
        // child ไม่ถูก push ขึ้น stack -> "bar" เป็น sibling ไม่ใช่ child ของ foo
        Document doc = Parser.parseBodyFragment("<foo/>bar", "http://example.com/");
        assertEquals(1, doc.body().children().size());
        assertEquals("foo", doc.body().child(0).tagName());
        assertTrue(doc.body().text().contains("bar"));
    }

    @Test
    public void testParseKnownEmptyElementTag() {
        // <img> เป็น known empty tag (tag.isEmpty()==true) แม้ไม่มี "/>" -> เนื้อหาถัดไปต้องเป็น sibling
        Document doc = Parser.parseBodyFragment("<img src='a.jpg'><p>Next</p>", "http://example.com/");
        assertEquals(2, doc.body().children().size());
        assertEquals("img", doc.body().child(0).tagName());
        assertEquals(0, doc.body().child(0).children().size());
        assertEquals("p", doc.body().child(1).tagName());
        assertEquals("Next", doc.body().child(1).text());
    }

    @Test
    public void testParseDataTagScriptKeepsRawContent() {
        // tag.isData() true, tag != title/textarea -> DataNode (raw, ไม่ decode)
        Document doc = Parser.parseBodyFragment("<script>var x = 1 < 2;</script>", "http://example.com/");
        Element script = doc.body().child(0);
        Node data = script.childNode(0);
        assertTrue(data instanceof DataNode);
        assertEquals("var x = 1 < 2;", ((DataNode) data).getWholeData());
    }

    @Test
    public void testParseDataTagTextareaDecodesEntities() {
        // tag.equals(textareaTag) -> TextNode.createFromEncoded (decode entities)
        Document doc = Parser.parseBodyFragment("<textarea>Hello &amp; world</textarea>", "http://example.com/");
        Element textarea = doc.body().child(0);
        Node data = textarea.childNode(0);
        assertTrue(data instanceof TextNode);
        assertEquals("Hello & world", ((TextNode) data).text());
    }

    // ---------------------------------------------------------------
    // <base href>: บรรทัด child.tagName().equals("base") และ href.length()!=0
    // ---------------------------------------------------------------

    @Test
    public void testParseBaseHrefUpdatesBaseUri() {
        Document doc = Parser.parse("<base href='http://newbase.com/'><p>Test</p>", "http://original.com/");
        assertEquals("http://newbase.com/", doc.baseUri());
    }

    @Test
    public void testParseBaseWithoutHrefDoesNotUpdateBaseUri() {
        // ไม่มี href -> href.length()==0 -> ไม่อัพเดต baseUri ("ignore <base target> etc" ตามคอมเมนต์ในซอร์ส)
        Document doc = Parser.parse("<base target='_blank'><p>Test</p>", "http://original.com/");
        assertEquals("http://original.com/", doc.baseUri());
    }

    // ---------------------------------------------------------------
    // addChildToParent() / stackHasValidParent() / popStackToSuitableContainer()
    // ---------------------------------------------------------------

    @Test
    public void testAutoCloseSiblingParagraphs() {
        // ตามโมเดลเนื้อหา HTML มาตรฐาน <p> ไม่สามารถบรรจุ <p> ซ้อนได้
        // -> popStackToSuitableContainer ต้อง pop ย้อนขึ้นไปถึง body (loop branch "else stack.removeLast()")
        Document doc = Parser.parseBodyFragment("<p>One<p>Two", "http://example.com/");
        List<Element> ps = doc.body().children();
        assertEquals(2, ps.size());
        assertEquals("One", ps.get(0).text());
        assertEquals("Two", ps.get(1).text());
    }

    @Test
    public void testImplicitBodyWrappingOnFullParse() {
        // full parse เจอ <body> โดยไม่มี <html> นำหน้า -> addChildToParent's "child.tag().equals(bodyTag)" special case
        // (ผลลัพธ์สุดท้ายอาจได้รับอิทธิพลจาก doc.normalise() ด้วย จึงยืนยันเพียงผลลัพธ์ไม่ throw และโครงสร้างถูกต้อง)
        Document doc = Parser.parse("<body><p>Hi</p></body>", "");
        assertEquals("Hi", doc.body().text());
        assertNotNull(doc.head());
    }
}
```

## ตารางสรุป Branch/Condition ที่ถูกครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testParseNullHtmlThrows / testParseNullBaseUriThrows / testParseBodyFragmentNullHtmlThrows | `Validate.notNull(html/baseUri)` ใน constructor — null input |
| testParseEmptyHtmlProducesShell / testParseBodyFragmentEmpty | `while(!tq.isEmpty())` ไม่ execute เลย (boundary: empty string) |
| testParseSimpleDocument | full dispatch path: startTag, text, endTag ปกติ |
| testParseImplicitHtmlHeadBodyForFragment | `addChildToParent`: validAncestor=false, relaxed=false → implicit parent |
| testParseBodyFragmentBasic | `isBodyFragment=true` branch ของ constructor |
| testParseBodyFragmentRelaxedDoesNotThrow | `relaxed=true` → ข้าม implicit-parent branch |
| testParseEndTagEmptyTagNameIsSkipped | `parseEndTag`: `tagName.length()==0` (skip popStackToClose) |
| testParseEndTagWithoutMatchingOpenTagIsIgnored | `popStackToClose`: ลูปไม่เจอ tag ตรงกัน → `elToClose==null` |
| testParseEndTagClosesNestedElements | `popStackToClose`: ลูปวน, เจอ match, pop หลายชั้น |
| testParseEndTagStopsAtBodyBoundary | `for(i=size-1;i>0;...)` ไม่ execute เมื่อ stack size==1 |
| testParseCommentBasic | `parseComment`: `data.endsWith("-")==true` (จาก "-->") |
| testParseXmlDeclarationProcessingInstruction | `parseXmlDecl`: firstChar=='?' → procInstr=false |
| testParseXmlDeclarationBang | `parseXmlDecl`: firstChar=='!' → procInstr=true |
| testParseCdataRawContent | `tq.matches("<![CDATA[")` dispatch + raw (ไม่ encode) |
| testParseTextNodeWithLiteralLessThan | `parseTextNode`: `tq.peek().equals('<')` true/false ทั้งสองกรณี |
| testParseAttributeSingleQuoted / DoubleQuoted | `matchChomp(SQ)` / `matchChomp(DQ)` branch |
| testParseAttributeUnquoted | else-branch: unquoted value loop |
| testParseAttributeNoValue | `matchChomp("=")==false` branch |
| testParseAttributeMalformedDoesNotCrashParser | `key.length()==0` branch (`tq.consume(); return null;`) — assert ความทนทานเท่านั้น |
| testParseSelfClosingUnknownTag | `matchChomp("/>")==true` + `!tag.isKnownTag()` → `setSelfClosing()` |
| testParseKnownEmptyElementTag | `tag.isEmpty()==true` (known void element) ไม่ผ่าน `/>` |
| testParseDataTagScriptKeepsRawContent | `tag.isData()==true`, ไม่ใช่ title/textarea → `DataNode` |
| testParseDataTagTextareaDecodesEntities | `tag.isData()==true`, `tag.equals(textareaTag)` → `TextNode.createFromEncoded` |
| testParseBaseHrefUpdatesBaseUri | `child.tagName().equals("base")`, `href.length()!=0` |
| testParseBaseWithoutHrefDoesNotUpdateBaseUri | `href.length()==0` (ไม่อัพเดต baseUri) |
| testAutoCloseSiblingParagraphs | `popStackToSuitableContainer`: loop `stack.removeLast()` หลายรอบ |
| testImplicitBodyWrappingOnFullParse | `addChildToParent`: `child.tag().equals(bodyTag)` special-case สร้าง head |

**ข้อจำกัดที่ยอมรับ:** branch บางส่วนในเมธอด `stackHasValidParent` (เช่น `requiresSpecificParent()==true` กับความสัมพันธ์ tag เฉพาะทาง เช่น table/tr/td) และรายละเอียด tokenizer ภายใน `TokenQueue` (เช่น `consumeAttributeKey`, `consumesTagName` แบบ edge case) ไม่มีซอร์สโค้ดให้วิเคราะห์ จึงไม่ได้เขียน assertion เจาะจงผลลัพธ์ เพื่อไม่ให้เป็นการเดา behavior ตามข้อกำหนด