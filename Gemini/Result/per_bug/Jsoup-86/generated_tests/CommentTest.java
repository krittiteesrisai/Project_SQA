package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommentTest {

    @Test
    public void testConstructorAndNodeName() {
        Comment comment = new Comment("test data");
        assertEquals("test data", comment.getData());
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testDeprecatedConstructor() {
        Comment comment = new Comment("test data", "http://example.com");
        assertEquals("test data", comment.getData());
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testIsXmlDeclarationEdgeCases() {
        // กรณีความยาวน้อยกว่าหรือเท่ากับ 1 (Edge Cases: empty, length 1)
        Comment emptyComment = new Comment("");
        assertFalse(emptyComment.isXmlDeclaration());

        Comment shortComment = new Comment("!");
        assertFalse(shortComment.isXmlDeclaration());

        Comment shortCommentQ = new Comment("?");
        assertFalse(shortCommentQ.isXmlDeclaration());

        // กรณีความยาวมากกว่า 1 แต่ไม่ได้ขึ้นต้นด้วย ! หรือ ?
        Comment normalComment = new Comment("xml declaration");
        assertFalse(normalComment.isXmlDeclaration());

        // กรณีขึ้นต้นด้วย ! และมีความยาว > 1
        Comment bangComment = new Comment("!xml version=\"1.0\"");
        assertTrue(bangComment.isXmlDeclaration());

        // กรณีขึ้นต้นด้วย ? และมีความยาว > 1
        Comment queryComment = new Comment("?xml version=\"1.0\"?");
        assertTrue(queryComment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclarationValidBang() {
        // ทดสอบแปลง Comment เป็น XmlDeclaration แบบขึ้นต้นด้วย !
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment.isXmlDeclaration());

        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("xml", decl.tagName());
        assertTrue(decl.attributes().hasKey("version"));
        assertEquals("1.0", decl.attr("version"));
    }

    @Test
    public void testAsXmlDeclarationValidQuery() {
        // ทดสอบแปลง Comment เป็น XmlDeclaration แบบขึ้นต้นด้วย ?
        Comment comment = new Comment("?xml-stylesheet type=\"text/css\" href=\"style.css\"?");
        assertTrue(comment.isXmlDeclaration());

        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("xml-stylesheet", decl.tagName());
        assertEquals("text/css", decl.attr("type"));
    }

    @Test
    public void testAsXmlDeclarationReturnsNullWhenNoChildNodes() {
        // กรณีที่ข้อมูลข้างในไม่สามารถ parse เป็น XML element ได้ ส่งผลให้ childNodeSize() == 0
        Comment comment = new Comment("!----");
        // แม้ isXmlDeclaration จะเป็น true แต่ asXmlDeclaration ควร handle ได้และคืนค่า null หรือจัดการไม่ให้เกิด Exception
        XmlDeclaration decl = comment.asXmlDeclaration();
        // ขึ้นอยู่กับการ parse ของ Jsoup แต่ต้องไม่ throw NullPointerException หลุดรอด
        // ถ้า childNodeSize() == 0 จะคืนค่า null ตามโค้ด
        assertNull(decl);
    }

    @Test
    public void testOuterHtmlHeadWithPrettyPrint() {
        Comment comment = new Comment("My Comment");
        Document.OutputSettings out = new Document.OutputSettings();
        
        // PrettyPrint = true
        out.prettyPrint(true);
        StringBuilder accum = new StringBuilder();
        try {
            comment.outerHtmlHead(accum, 0, out);
        } catch (Exception e) {
            fail("IOException should not be thrown: " + e.getMessage());
        }
        assertEquals("<!--My Comment-->", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithoutPrettyPrint() {
        Comment comment = new Comment("My Comment");
        Document.OutputSettings out = new Document.OutputSettings();
        
        // PrettyPrint = false
        out.prettyPrint(false);
        StringBuilder accum = new StringBuilder();
        try {
            comment.outerHtmlHead(accum, 1, out);
        } catch (Exception e) {
            fail("IOException should not be thrown: " + e.getMessage());
        }
        assertEquals("<!--My Comment-->", accum.toString());
    }

    @Test
    public void testOuterHtmlTailDoesNothing() {
        Comment comment = new Comment("Test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        // ไม่ควรมีผลลัพธ์เพิ่มขึ้นเพราะ outerHtmlTail ว่างเปล่า
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void testToStringMethod() {
        Comment comment = new Comment("Hello World");
        assertEquals("<!--Hello World-->", comment.toString());
    }
}