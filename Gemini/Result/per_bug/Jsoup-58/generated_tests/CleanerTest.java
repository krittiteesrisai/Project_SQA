package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullWhitelist() {
        // ทดสอบส่ง Whitelist เป็น null เข้า Constructor
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCleanNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.none());
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValidNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.none());
        cleaner.isValid(null);
    }

    @Test
    public void testCleanFramesetDocumentWithoutBody() {
        // จำลองสถานการณ์ frameset document ที่ไม่มี body (body() == null)
        Document dirtyDoc = Document.createShell("");
        dirtyDoc.body().remove(); // ทำให้ body เป็น null
        assertNull(dirtyDoc.body());

        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document cleanDoc = cleaner.clean(dirtyDoc);

        assertNotNull(cleanDoc);
        assertNotNull(cleanDoc.body());
        assertTrue(cleanDoc.body().children().isEmpty());
    }

    @Test
    public void testCleanAndIsValidWithSafeAndUnsafeElements() {
        // ทดสอบ Whitelist basic ร่วมกับ Element ปลอดภัย, ไม่ปลอดภัย, Text, DataNode, และ Unsafe Root
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);

        // HTML ที่มีทั้งแท็กปลอดภัย, แท็กอันตราย, ข้อความ, และ attribute ที่ไม่ปลอดภัย
        String html = "<div><p>Hello <script>alert(1);</script><a href='http://example.com' onclick='evil()'>Link</a></p><!-- Comment --></div>";
        Document dirtyDoc = Parser.parseBodyFragment(html, "http://example.com");

        // ตรวจสอบว่า isValid ต้องคืนค่า false เพราะมีแท็ก/แอตทริบิวต์ที่ไม่ปลอดภัยถูกตัดออก
        assertFalse(cleaner.isValid(dirtyDoc));

        // ทำความสะอาดเอกสาร
        Document cleanDoc = cleaner.clean(dirtyDoc);
        String cleanedHtml = cleanDoc.body().html();

        // ตรวจสอบผลลัพธ์หลัง clean ว่าแท็กอันตราย (script, onclick) หายไป แต่แท็กปลอดภัย (p, a) ยังอยู่
        assertTrue(cleanedHtml.contains("<p>"));
        assertTrue(cleanedHtml.contains("<a href=\"http://example.com\">Link</a>"));
        assertFalse(cleanedHtml.contains("script"));
        assertFalse(cleanedHtml.contains("onclick"));
        assertFalse(cleanedHtml.contains("Comment"));

        // ทดสอบ isValid บนเอกสารที่สะอาดสมบูรณ์แล้วควรได้ true
        assertTrue(cleaner.isValid(cleanDoc));
    }

    @Test
    public void testUnsafeRootElement() {
        // ทดสอบกรณีที่ root element ของ body ไม่ใช่ safe tag (source != root branch handling)
        Whitelist whitelist = Whitelist.none(); // ไม่มีแท็กไหนปลอดภัยเลย
        Cleaner cleaner = new Cleaner(whitelist);

        String html = "<script>var a = 1;</script>";
        Document dirtyDoc = Parser.parseBodyFragment(html, "");

        // root ของ body คือ script ซึ่งไม่ปลอดภัยและถูกนับว่า discard แต่ไม่นับซ้ำซ้อนกับ root check
        assertFalse(cleaner.isValid(dirtyDoc));
        Document cleanDoc = cleaner.clean(dirtyDoc);
        assertTrue(cleanDoc.body().children().isEmpty());
    }

    @Test
    public void testDataNodeHandling() {
        // ทดสอบ DataNode ภายใต้แท็กที่ whitelist อนุญาต (เช่น style หรือ script ถ้าเปิดไว้)
        Whitelist whitelist = Whitelist.relaxed(); // relaxed อนุญาต style และ script บางส่วน
        Cleaner cleaner = new Cleaner(whitelist);

        String html = "<style>body { background: #000; }</style>";
        Document dirtyDoc = Parser.parseBodyFragment(html, "");

        assertTrue(cleaner.isValid(dirtyDoc));
        Document cleanDoc = cleaner.clean(dirtyDoc);
        assertTrue(cleanDoc.body().html().contains("background"));
    }
}