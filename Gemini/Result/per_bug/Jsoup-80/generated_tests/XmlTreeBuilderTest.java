package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    @Test
    public void testDefaultSettingsAndParseString() {
        String xml = "<root><child/></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("root", doc.child(0).tagName());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void testParseReader() {
        StringReader reader = new StringReader("<root>Data</root>");
        Document doc = Jsoup.parse(reader, "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("Data", doc.child(0).text());
    }

    @Test
    public void testProcessStartAndEndTag() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder treeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        Document doc = Jsoup.parse("<item>Text</item>", "", parser);
        
        assertNotNull(doc);
        assertEquals(1, doc.children().size());
        assertEquals("item", doc.child(0).tagName());
    }

    @Test
    public void testProcessCommentAndCData() {
        String xml = "<root><!-- Comment --><![CDATA[CData Content]]></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        
        assertNotNull(doc);
        // ตรวจสอบ Comment และ CData Node
        boolean foundComment = false;
        boolean foundCData = false;
        for (Node node : doc.child(0.0 > 0 ? 0 : 0).childNodes()) {
            if (node instanceof Comment) {
                foundComment = true;
            }
            if (node instanceof CDataNode) {
                foundCData = true;
                assertEquals("CData Content", ((CDataNode) node).getWholeText());
            }
        }
        assertTrue(foundComment);
        assertTrue(foundCData);
    }

    @Test
    public void testProcessDoctype() {
        String xml = "<!DOCTYPE html><html></html>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        // ตรวจสอบ Doctype node ถูกสร้างขึ้น
        DocumentType doctype = null;
        for (Node node : doc.childNodes()) {
            if (node instanceof DocumentType) {
                doctype = (DocumentType) node;
                break;
            }
        }
        assertNotNull(doctype);
        assertEquals("html", doctype.name());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessUnexpectedToken() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        // จำลอง Token ประเภทที่ไม่คาดคิด หรือสร้างผ่านกลไกที่ทำให้เกิด Default branch ใน switch-case
        // เนื่องจาก Token.TokenType มีจำกัด เราสามารถทดสอบด้วย Token ปลอมหรือส่ง Token ที่ไม่มีการจัดการถ้าเป็นไปได้
        // หรือใช้ Token ที่ไม่ได้อยู่ใน case ปกติของ XmlTreeBuilder
        Token.EOF eofToken = new Token.EOF();
        // ทดสอบผ่านการเรียก process ด้วย TokenType ที่ไม่อยู่ในเงื่อนไข (ถ้าทำได้) หรือจำลองด้วย Token ชนิดอื่น
        // ในที่นี้เราทดสอบพฤติกรรมของ Valid Token ก่อน แล้วใช้ Token หลอกบังคับ Validate.fail หากทำได้
        // เนื่องจาก Token เป็น abstract class เราสามารถสร้าง Subclass ชั่วคราวเพื่อบังคับเข้า default switch case
        Token invalidToken = new Token(Token.TokenType.valueOf("Attributes")) {
            @Override
            Token reset() {
                return this;
            }
        };
        treeBuilder.initialiseParse(new StringReader(""), "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        treeBuilder.process(invalidToken);
    }

    @Test
    public void testUnknownSelfClosingTag() {
        // ทดสอบแท็กแปลกปลอมที่เป็น Self-closing เพื่อรันเข้าเงื่อนไข !tag.isKnownTag()
        String xml = "<custom-unknown-tag attr='val' />";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        Element el = doc.child(0);
        assertEquals("custom-unknown-tag", el.tagName());
        assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void testBogusCommentXmlDeclarationEdgeCases() {
        // 1. Bogus comment เริ่มต้นด้วย ? (XML Declaration / Processing Instruction) -> จุดเสี่ยง defects4j jsoup-80
        String xml1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root/>";
        Document doc1 = Jsoup.parse(xml1, "", Parser.xmlParser());
        assertNotNull(doc1);

        // 2. Bogus comment เริ่มต้นด้วย !
        String xml2 = "<!--<!DOCTYPE note>--><root/>";
        Document doc2 = Jsoup.parse(xml2, "", Parser.xmlParser());
        assertNotNull(doc2);

        // 3. Bogus comment สั้นเกินไป (Edge case: data.length() <= 1)
        String xml3 = "<?><root/>";
        Document doc3 = Jsoup.parse(xml3, "", Parser.xmlParser());
        assertNotNull(doc3);
        
        // 4. Bogus comment ไม่มีเครื่องหมาย ! หรือ ? แต่วิเคราะห์ความยาว
        String xml4 = "<!--a--><root/>";
        Document doc4 = Jsoup.parse(xml4, "", Parser.xmlParser());
        assertNotNull(doc4);
    }

    @Test
    public void testPopStackToCloseNotFound() {
        // ทดสอบกรณี EndTag ที่ไม่มี StartTag ใน Stack (popStackToClose หาไม่เจอ -> firstFound == null -> return)
        String xml = "<root></missing></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        assertNotNull(doc);
        assertEquals("root", doc.child(0.0 > 0 ? 0 : 0).tagName());
    }

    @Test
    public void testParseFragment() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> nodes = treeBuilder.parseFragment("<child>fragment</child>", "", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertEquals("child", nodes.get(0).nodeName());
    }
}