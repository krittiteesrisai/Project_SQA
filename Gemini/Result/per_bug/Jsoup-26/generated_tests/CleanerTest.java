package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullWhitelist() {
        new Cleaner(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCleanWithNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.clean(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsValidWithNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        cleaner.isValid(null);
    }

    @Test
    public void testCleanAndIsValidWithSafeHtml() {
        String html = "<div><p>Hello <b>World</b></p></div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertTrue("Valid HTML should return true", cleaner.isValid(dirty));

        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        assertTrue(clean.body().html().contains("Hello"));
        assertTrue(clean.body().html().contains("<b>World</b>"));
    }

    @Test
    public void testCleanAndIsValidWithUnsafeTagAndAttribute() {
        // <script> เป็น Unsafe tag, onclick เป็น Unsafe attribute ใน Whitelist basic
        String html = "<div><p onclick=\"alert(1)\">Hello</p><script>alert('xss');</script></div>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertFalse("Unsafe HTML should return false for isValid", cleaner.isValid(dirty));

        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        // Script ควรถูกกรองทิ้ง และ onclick ควรถูกตัดออก
        assertFalse(clean.body().html().contains("<script>"));
        assertFalse(clean.body().html().contains("onclick"));
        assertTrue(clean.body().html().contains("Hello"));
    }

    @Test
    public void testUnsafeTagWithChildrenRecurseToParent() {
        // แท็กที่ไม่ปลอดภัยแต่มีลูกข้างในที่ปลอดภัย (เช่น <custom><b>text</b></custom>) 
        // โค้ดจะเข้าไปใน else และ recurse โดยไม่ทิ้งลูกข้างใน
        String html = "<custom><b>Safe Text Inside Unsafe Tag</b></custom>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        assertFalse(cleaner.isValid(dirty));
        Document clean = cleaner.clean(dirty);
        assertTrue(clean.body().html().contains("<b>Safe Text Inside Unsafe Tag</b>"));
    }

    @Test
    public void testTextNodesAndCommentsAndOtherNodes() {
        // ทดสอบ TextNode, Comments (ซึ่งต้องถูกเพิกเฉย/ไม่พัง)
        String html = "<!-- Comment -->Hello <!-- Another Comment --><span>World</span>";
        Document dirty = Jsoup.parse(html);
        Cleaner cleaner = new Cleaner(Whitelist.basic());

        Document clean = cleaner.clean(dirty);
        assertNotNull(clean);
        assertTrue(clean.body().html().contains("Hello"));
        assertTrue(clean.body().html().contains("<span>World</span>"));
        assertFalse(clean.body().html().contains("Comment"));
    }

    @Test
    public void testEnforcedAttributes() {
        // Whitelist.relaxed() หรือการกำหนด Enforced Attributes เพิ่มเติม
        Whitelist whitelist = Whitelist.relaxed().addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);

        String html = "<a href=\"http://example.com\">Link</a>";
        Document dirty = Jsoup.parse(html);
        Document clean = cleaner.clean(dirty);

        assertTrue(clean.body().html().contains("rel=\"nofollow\""));
    }
}