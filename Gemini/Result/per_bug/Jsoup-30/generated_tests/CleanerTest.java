package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    // --- Constructor Tests ---
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullWhitelist() {
        new Cleaner(null);
    }

    // --- clean(Document) Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testCleanNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(null);
    }

    @Test
    public void testCleanNormalDocument() {
        String html = "<div><p>Hello <script>alert('XSS');</script></p></div>";
        Document dirtyDoc = Document.parse(html);
        
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document cleanDoc = cleaner.clean(dirtyDoc);

        assertNotNull(cleanDoc);
        // <script> ควรถูกตัดออก แต่ <p> และ text "Hello " ยังอยู่
        assertTrue(cleanDoc.body().html().contains("<p>Hello </p>"));
        assertFalse(cleanDoc.body().html().contains("script"));
    }

    @Test
    public void testCleanFramesetDocumentWithoutBody() {
        // Frameset document อาจไม่มี body (body() == null)
        Document dirtyDoc = new Document("");
        // จำลองโครงสร้างที่ไม่มี body (ลบ body ออกถ้ามี หรือสร้าง shell แล้วเอา body ออก)
        dirtyDoc.getElementsByTag("body").remove();
        assertNull(dirtyDoc.body());

        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document cleanDoc = cleaner.clean(dirtyDoc);

        assertNotNull(cleanDoc);
        assertNotNull(cleanDoc.body());
        assertEquals("", cleanDoc.body().html());
    }

    // --- isValid(Document) Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testIsValidNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.isValid(null);
    }

    @Test
    public void testIsValidWithValidHtml() {
        String html = "<p><b>Safe text</b></p>";
        Document dirtyDoc = Document.parse(html);

        Cleaner cleaner = new Cleaner(Whitelist.basic());
        boolean valid = cleaner.isValid(dirtyDoc);

        assertTrue("Should be valid because all tags/attrs are safe", valid);
    }

    @Test
    public void testIsValidWithInvalidHtmlTag() {
        String html = "<p><script>alert(1);</script></p>";
        Document dirtyDoc = Document.parse(html);

        Cleaner cleaner = new Cleaner(Whitelist.basic());
        boolean valid = cleaner.isValid(dirtyDoc);

        assertFalse("Should be invalid because <script> tag needs to be discarded", valid);
    }

    @Test
    public void testIsValidWithUnsafeAttribute() {
        // a tag ปลอดภัย แต่ href มี javascript: (ไม่ปลอดภัย) หรือ attribute ไม่ได้รับอนุญาต
        String html = "<p><a href=\"javascript:void(0)\" onclick=\"bad()\">link</a></p>";
        Document dirtyDoc = Document.parse(html);

        Cleaner cleaner = new Cleaner(Whitelist.basic());
        boolean valid = cleaner.isValid(dirtyDoc);

        assertFalse("Should be invalid because unsafe attributes are discarded", valid);
    }

    // --- Edge Cases & Complex Branch Coverage ---

    @Test
    public void testCopySafeNodesWithUnsafeTagStrippingButKeepingChildren() {
        // ทดสอบกรณี tag ไม่ปลอดภัย แต่มีข้อความข้างใน (ควรดึงข้อความ/nodes ลูกออกมาแปะไว้ระดับ parent)
        String html = "<div>UnsafeTagText</div>"; 
        // สมมติใช้ Whitelist ที่ไม่มี div (เช่น relaxed ไม่มี div หรือใช้ none)
        // ใช้ Whitelist.none() ซึ่งจะไม่อนุญาต tag ใดๆ เลย แต่จะดึง TextNode ออกมา
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document dirtyDoc = Document.parse(html);

        Document cleanDoc = cleaner.clean(dirtyDoc);
        // Whitelist.none() จะเอา tag <div> ออก แต่เก็บข้อความ "UnsafeTagText" ไว้ใน body
        assertTrue(cleanDoc.body().text().contains("UnsafeTagText"));
    }

    @Test
    public void testCreateSafeElementWithEnforcedAttributes() {
        // ทดสอบ Whitelist ที่มีการกำหนด enforced attributes (เช่น <a> เพิ่ม rel="nofollow")
        Whitelist whitelist = Whitelist.basic().addAttributes("a", "href")
                .enforcedAttribute("a", "rel", "nofollow");
        
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.parse("<a href=\"http://example.com\">link</a>");
        
        Document cleanDoc = cleaner.clean(dirtyDoc);
        assertEquals("nofollow", cleanDoc.select("a").first().attr("rel"));
    }

    @Test
    public void testOtherNodeTypesHandling() {
        // ทดสอบ Node ที่ไม่ใช่ Element และไม่ใช่ TextNode (เช่น Comment)
        // Jsoup มักจะกรองหรือจัดการ Comment ผ่านเงื่อนไข else / instanceof
        String html = "<!-- Comment --><div>Hello</div>";
        Document dirtyDoc = Document.parse(html);

        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document cleanDoc = cleaner.clean(dirtyDoc);
        
        assertFalse(cleanDoc.body().html().contains("Comment"));
        assertTrue(cleanDoc.body().html().contains("Hello"));
    }
}